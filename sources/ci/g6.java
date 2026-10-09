package ci;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class g6 implements pg.d1 {
    public final /* synthetic */ nb a;

    public g6(nb nbVar) {
        this.a = nbVar;
    }

    @Override // pg.d1
    public final void b() {
        h6 h6Var = this.a.P0;
        if (h6Var != null) {
            h6Var.invalidate();
        }
    }

    @Override // pg.d1
    public final void c() {
        nb nbVar = this.a;
        if (nbVar.c1) {
            nbVar.c1 = false;
        } else {
            nbVar.k1.b(1);
            nbVar.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.d1
    public final boolean d() {
        nb nbVar = this.a;
        boolean z10 = nbVar.J0 == null;
        if (!z10) {
            nbVar.C0(null, true);
        }
        return z10;
    }

    @Override // pg.d1
    public final void e() {
        nb nbVar = this.a;
        nbVar.D0.a.e();
        nbVar.d1.setViewHidden(false);
    }

    @Override // pg.d1
    public final void f() {
        nb nbVar = this.a;
        if (nbVar.J0 != null) {
            nbVar.C0(null, true);
        }
        nbVar.d1.setViewHidden(true);
    }

    @Override // pg.d1
    public final void a() {
    }
}
