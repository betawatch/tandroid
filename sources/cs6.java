// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cs6 extends vt6 {
    public final String a;
    public final bs6 b;

    public cs6(String str, bs6 bs6Var) {
        this.a = str;
        this.b = bs6Var;
    }

    @Override // vt6
    public final void f(int i) {
        bs6 bs6Var;
        String str = this.a;
        if (str == null || (bs6Var = this.b) == null) {
            return;
        }
        bs6Var.q(i, str);
    }

    @Override // vt6
    public final void i(int i) {
        bs6 bs6Var;
        String str = this.a;
        if (str == null || (bs6Var = this.b) == null) {
            return;
        }
        bs6Var.r(i, str);
    }
}
