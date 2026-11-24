// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
