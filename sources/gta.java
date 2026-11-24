// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gta {
    public ec7 a;
    public ylb b;
    public int c;
    public int d;
    public float e;

    public final void a(ec7 ec7Var) {
        this.a = ec7Var;
        if (ec7Var == null) {
            this.c = cmb.v0(cmb.z8, this.b);
            this.d = cmb.v0(cmb.r8, this.b);
            this.c = on2.f(this.e, this.c, 603979776);
            this.d = on2.f(this.e, this.d, -1);
            return;
        }
        int c = ec7Var.c(cmb.I.o());
        int d = ec7Var.d(cmb.I.o());
        ylb ylbVar = this.b;
        int f = on2.f(0.75f, d, c);
        int v0 = gm.B(f) > 0.721f ? cmb.v0(cmb.u6, ylbVar) : cmb.a(0.08f, -0.08f, f);
        this.c = v0;
        this.d = gm.B(v0) > 0.721f ? -16777216 : -1;
        this.c = on2.f(this.e, this.c, 603979776);
        this.d = on2.f(this.e, this.d, -1);
    }
}
