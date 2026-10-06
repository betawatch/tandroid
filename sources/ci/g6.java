package ci;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class g6 implements pg.e1 {
    public final /* synthetic */ mb a;

    public g6(mb mbVar) {
        this.a = mbVar;
    }

    @Override // pg.e1
    public final void b() {
        h6 h6Var = this.a.P0;
        if (h6Var != null) {
            h6Var.invalidate();
        }
    }

    @Override // pg.e1
    public final void c() {
        mb mbVar = this.a;
        if (mbVar.c1) {
            mbVar.c1 = false;
        } else {
            mbVar.k1.b(1);
            mbVar.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.e1
    public final boolean d() {
        mb mbVar = this.a;
        boolean z10 = mbVar.J0 == null;
        if (!z10) {
            mbVar.D0(null, true);
        }
        return z10;
    }

    @Override // pg.e1
    public final void e() {
        mb mbVar = this.a;
        mbVar.D0.a.j();
        mbVar.d1.setViewHidden(false);
    }

    @Override // pg.e1
    public final void f() {
        mb mbVar = this.a;
        if (mbVar.J0 != null) {
            mbVar.D0(null, true);
        }
        mbVar.d1.setViewHidden(true);
    }

    @Override // pg.e1
    public final void a() {
    }
}
