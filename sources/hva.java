// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hva {
    public kc7 a;
    public vnb b;
    public int c;
    public int d;
    public float e;

    public final void a(kc7 kc7Var) {
        this.a = kc7Var;
        if (kc7Var == null) {
            this.c = aob.v0(aob.A8, this.b);
            this.d = aob.v0(aob.s8, this.b);
            this.c = vm2.f(this.e, this.c, 603979776);
            this.d = vm2.f(this.e, this.d, -1);
            return;
        }
        int c = kc7Var.c(aob.I.o());
        int d = kc7Var.d(aob.I.o());
        vnb vnbVar = this.b;
        int f = vm2.f(0.75f, d, c);
        int v0 = hl.B(f) > 0.721f ? aob.v0(aob.v6, vnbVar) : aob.a(0.08f, -0.08f, f);
        this.c = v0;
        this.d = hl.B(v0) > 0.721f ? -16777216 : -1;
        this.c = vm2.f(this.e, this.c, 603979776);
        this.d = vm2.f(this.e, this.d, -1);
    }
}
