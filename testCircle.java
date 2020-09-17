public class testCircle {
    public static void main(String[] args) {
        System.out.println("Circle: \n");

        Circle o1 = new Circle();

        o1.x = 3;
        o1.r = 12.3;
        o1.y = 5;
        o1.printCircle();

        Circle o2 = new Circle();

        o2.r = 3.14;
        o2.y = -4;
        o2.x = 2;
        o2.printCircle();
}
}

