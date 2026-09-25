package ci;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class g6 implements pg.e1 {
    public final /* synthetic */ nb a;

    public g6(nb nbVar) {
        this.a = nbVar;
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
        nb nbVar = this.a;
        if (nbVar.c1) {
            nbVar.c1 = false;
        } else {
            nbVar.k1.b(1);
            nbVar.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.e1
    public final boolean d() {
        nb nbVar = this.a;
        boolean z10 = nbVar.J0 == null;
        if (!z10) {
            nbVar.D0(null, true);
        }
        return z10;
    }

    @Override // pg.e1
    public final void e() {
        nb nbVar = this.a;
        nbVar.D0.a.e();
        nbVar.d1.setViewHidden(false);
    }

    @Override // pg.e1
    public final void f() {
        nb nbVar = this.a;
        if (nbVar.J0 != null) {
            nbVar.D0(null, true);
        }
        nbVar.d1.setViewHidden(true);
    }

    @Override // pg.e1
    public final void a() {
    }
}
