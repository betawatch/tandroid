package di;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class f6 implements qg.b1 {
    public final /* synthetic */ mb a;

    public f6(mb mbVar) {
        this.a = mbVar;
    }

    @Override // qg.b1
    public final void b() {
        g6 g6Var = this.a.P0;
        if (g6Var != null) {
            g6Var.invalidate();
        }
    }

    @Override // qg.b1
    public final void c() {
        mb mbVar = this.a;
        if (mbVar.c1) {
            mbVar.c1 = false;
        } else {
            mbVar.k1.b(1);
            mbVar.o((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.b1
    public final boolean d() {
        mb mbVar = this.a;
        boolean z10 = mbVar.J0 == null;
        if (!z10) {
            mbVar.C0(null, true);
        }
        return z10;
    }

    @Override // qg.b1
    public final void e() {
        mb mbVar = this.a;
        mbVar.D0.a.f();
        mbVar.d1.setViewHidden(false);
    }

    @Override // qg.b1
    public final void f() {
        mb mbVar = this.a;
        if (mbVar.J0 != null) {
            mbVar.C0(null, true);
        }
        mbVar.d1.setViewHidden(true);
    }

    @Override // qg.b1
    public final void a() {
    }
}
