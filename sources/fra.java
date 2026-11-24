// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fra {
    public da7 a;
    public wjb b;
    public int c;
    public int d;
    public float e;

    public final void a(da7 da7Var) {
        this.a = da7Var;
        if (da7Var == null) {
            this.c = bkb.v0(bkb.z8, this.b);
            this.d = bkb.v0(bkb.r8, this.b);
            this.c = bm2.f(this.e, this.c, 603979776);
            this.d = bm2.f(this.e, this.d, -1);
            return;
        }
        int c = da7Var.c(bkb.I.o());
        int d = da7Var.d(bkb.I.o());
        wjb wjbVar = this.b;
        int f = bm2.f(0.75f, d, c);
        int v0 = gl.B(f) > 0.721f ? bkb.v0(bkb.u6, wjbVar) : bkb.a(0.08f, -0.08f, f);
        this.c = v0;
        this.d = gl.B(v0) > 0.721f ? -16777216 : -1;
        this.c = bm2.f(this.e, this.c, 603979776);
        this.d = bm2.f(this.e, this.d, -1);
    }
}
