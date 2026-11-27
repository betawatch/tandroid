// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eg7 {
    public final char a;
    public final int b;
    public final eg7 c;
    public final int d;

    public eg7(char c, xs3 xs3Var, int i, eg7 eg7Var) {
        char c2 = c == 65535 ? (char) 1000 : c;
        this.a = c2;
        this.b = i;
        this.c = eg7Var;
        int length = c2 == 1000 ? 1 : String.valueOf(c).getBytes(xs3Var.a[i].charset()).length;
        length = (eg7Var == null ? 0 : eg7Var.b) != i ? length + 3 : length;
        this.d = eg7Var != null ? length + eg7Var.d : length;
    }
}
