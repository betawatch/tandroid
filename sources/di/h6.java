package di;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class h6 implements qg.b1 {
    public final /* synthetic */ rb a;

    public h6(rb rbVar) {
        this.a = rbVar;
    }

    @Override // qg.b1
    public final void b() {
        i6 i6Var = this.a.P0;
        if (i6Var != null) {
            i6Var.invalidate();
        }
    }

    @Override // qg.b1
    public final void c() {
        rb rbVar = this.a;
        if (rbVar.c1) {
            rbVar.c1 = false;
        } else {
            rbVar.k1.b(1);
            rbVar.o((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.b1
    public final boolean d() {
        rb rbVar = this.a;
        boolean z10 = rbVar.J0 == null;
        if (!z10) {
            rbVar.D0(null, true);
        }
        return z10;
    }

    @Override // qg.b1
    public final void e() {
        rb rbVar = this.a;
        rbVar.D0.a.f();
        rbVar.d1.setViewHidden(false);
    }

    @Override // qg.b1
    public final void f() {
        rb rbVar = this.a;
        if (rbVar.J0 != null) {
            rbVar.D0(null, true);
        }
        rbVar.d1.setViewHidden(true);
    }

    @Override // qg.b1
    public final void a() {
    }
}
