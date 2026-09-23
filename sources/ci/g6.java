package ci;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class g6 implements pg.c1 {
    public final /* synthetic */ nb a;

    public g6(nb nbVar) {
        this.a = nbVar;
    }

    @Override // pg.c1
    public final void b() {
        h6 h6Var = this.a.P0;
        if (h6Var != null) {
            h6Var.invalidate();
        }
    }

    @Override // pg.c1
    public final void c() {
        nb nbVar = this.a;
        if (nbVar.c1) {
            nbVar.c1 = false;
        } else {
            nbVar.k1.b(1);
            nbVar.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.c1
    public final boolean d() {
        nb nbVar = this.a;
        boolean z10 = nbVar.J0 == null;
        if (!z10) {
            nbVar.D0(null, true);
        }
        return z10;
    }

    @Override // pg.c1
    public final void e() {
        nb nbVar = this.a;
        nbVar.D0.a.e();
        nbVar.d1.setViewHidden(false);
    }

    @Override // pg.c1
    public final void f() {
        nb nbVar = this.a;
        if (nbVar.J0 != null) {
            nbVar.D0(null, true);
        }
        nbVar.d1.setViewHidden(true);
    }

    @Override // pg.c1
    public final void a() {
    }
}
