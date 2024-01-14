public class Taxi extends Car {
    private int price;
    
    public Taxi(int no) {
        //Taxi(no, 0)
        this(no, 0);
    }
    
    public Taxi(int no, int price) {
        //スーパークラスのコンストラクト呼び出し（Car(no);)
        super(no);
        this.price = price;
    }
    
    public void start() {
        price = 420;
    }
    
    public void run() {
        price += 80;
    }
    
    public void display() {
        //スーパークラスのメソッド呼び出し
        super.display();
        System.out.println("料金は" + price + "円です");
    }
}