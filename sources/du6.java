// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class du6 extends vv6 {
    public final String a;
    public final cu6 b;

    public du6(String str, cu6 cu6Var) {
        this.a = str;
        this.b = cu6Var;
    }

    @Override // vv6
    public final void f(int i) {
        cu6 cu6Var;
        String str = this.a;
        if (str == null || (cu6Var = this.b) == null) {
            return;
        }
        cu6Var.q(i, str);
    }

    @Override // vv6
    public final void i(int i) {
        cu6 cu6Var;
        String str = this.a;
        if (str == null || (cu6Var = this.b) == null) {
            return;
        }
        cu6Var.r(i, str);
    }
}
