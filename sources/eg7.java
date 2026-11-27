// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
