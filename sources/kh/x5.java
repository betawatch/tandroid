package kh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x5 implements xf.b1 {
    public final /* synthetic */ ya a;

    public x5(ya yaVar) {
        this.a = yaVar;
    }

    @Override // xf.b1
    public final void b() {
        y5 y5Var = this.a.L0;
        if (y5Var != null) {
            y5Var.invalidate();
        }
    }

    @Override // xf.b1
    public final void c() {
        ya yaVar = this.a;
        if (yaVar.Y0) {
            yaVar.Y0 = false;
        } else {
            yaVar.g1.b(1);
            yaVar.n((xf.m) xf.m.a.get(0));
        }
    }

    @Override // xf.b1
    public final boolean d() {
        ya yaVar = this.a;
        boolean z10 = yaVar.F0 == null;
        if (!z10) {
            yaVar.D0(null, true);
        }
        return z10;
    }

    @Override // xf.b1
    public final void e() {
        ya yaVar = this.a;
        yaVar.z0.a.e();
        yaVar.Z0.setViewHidden(false);
    }

    @Override // xf.b1
    public final void f() {
        ya yaVar = this.a;
        if (yaVar.F0 != null) {
            yaVar.D0(null, true);
        }
        yaVar.Z0.setViewHidden(true);
    }

    @Override // xf.b1
    public final void a() {
    }
}
