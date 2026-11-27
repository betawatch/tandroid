// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fg7 {
    public final char a;
    public final int b;
    public final fg7 c;
    public final int d;

    public fg7(char c, xs3 xs3Var, int i, fg7 fg7Var) {
        char c2 = c == 65535 ? (char) 1000 : c;
        this.a = c2;
        this.b = i;
        this.c = fg7Var;
        int length = c2 == 1000 ? 1 : String.valueOf(c).getBytes(xs3Var.a[i].charset()).length;
        length = (fg7Var == null ? 0 : fg7Var.b) != i ? length + 3 : length;
        this.d = fg7Var != null ? length + fg7Var.d : length;
    }
}
