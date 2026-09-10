package bi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g7 implements og.g1 {
    public final /* synthetic */ ad a;

    public g7(ad adVar) {
        this.a = adVar;
    }

    @Override // og.g1
    public final void b() {
        h7 h7Var = this.a.P0;
        if (h7Var != null) {
            h7Var.invalidate();
        }
    }

    @Override // og.g1
    public final void c() {
        ad adVar = this.a;
        if (adVar.c1) {
            adVar.c1 = false;
        } else {
            adVar.k1.b(1);
            adVar.B((og.m) og.m.a.get(0));
        }
    }

    @Override // og.g1
    public final boolean d() {
        ad adVar = this.a;
        boolean z10 = adVar.J0 == null;
        if (!z10) {
            adVar.D0(null, true);
        }
        return z10;
    }

    @Override // og.g1
    public final void e() {
        ad adVar = this.a;
        adVar.D0.a.e();
        adVar.d1.setViewHidden(false);
    }

    @Override // og.g1
    public final void f() {
        ad adVar = this.a;
        if (adVar.J0 != null) {
            adVar.D0(null, true);
        }
        adVar.d1.setViewHidden(true);
    }

    @Override // og.g1
    public final void a() {
    }
}
