// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class fj8 {
    public final wk4 a;
    public final long b;

    public fj8(hj8 hj8Var, wk4 wk4Var) {
        long length;
        this.a = wk4Var;
        long length2 = ((hj8Var.b.length() + hj8Var.a.length()) << 1) + 128;
        f06 f06Var = (f06) wk4Var.b;
        if (f06Var == null) {
            length = 1024;
        } else {
            length = (((int[]) f06Var.c) == null ? 0L : ((int[]) f06Var.c).length << 2) + (((int[]) f06Var.b).length << 2) + 64;
        }
        this.b = length2 + length;
    }
}
