package nh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class k5 implements ag.s1 {
    public final /* synthetic */ ja a;

    public k5(ja jaVar) {
        this.a = jaVar;
    }

    @Override // ag.s1
    public final void b() {
        l5 l5Var = this.a.L0;
        if (l5Var != null) {
            l5Var.invalidate();
        }
    }

    @Override // ag.s1
    public final void c() {
        ja jaVar = this.a;
        if (jaVar.Y0) {
            jaVar.Y0 = false;
        } else {
            jaVar.g1.b(1);
            jaVar.q((ag.m) ag.m.a.get(0));
        }
    }

    @Override // ag.s1
    public final boolean d() {
        ja jaVar = this.a;
        boolean z10 = jaVar.F0 == null;
        if (!z10) {
            jaVar.D0(null, true);
        }
        return z10;
    }

    @Override // ag.s1
    public final void e() {
        ja jaVar = this.a;
        jaVar.z0.a.e();
        jaVar.Z0.setViewHidden(false);
    }

    @Override // ag.s1
    public final void f() {
        ja jaVar = this.a;
        if (jaVar.F0 != null) {
            jaVar.D0(null, true);
        }
        jaVar.Z0.setViewHidden(true);
    }

    @Override // ag.s1
    public final void a() {
    }
}
