package ci;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class h6 implements pg.d1 {
    public final /* synthetic */ qb a;

    public h6(qb qbVar) {
        this.a = qbVar;
    }

    @Override // pg.d1
    public final void b() {
        i6 i6Var = this.a.P0;
        if (i6Var != null) {
            i6Var.invalidate();
        }
    }

    @Override // pg.d1
    public final void c() {
        qb qbVar = this.a;
        if (qbVar.c1) {
            qbVar.c1 = false;
        } else {
            qbVar.k1.b(1);
            qbVar.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.d1
    public final boolean d() {
        qb qbVar = this.a;
        boolean z10 = qbVar.J0 == null;
        if (!z10) {
            qbVar.D0(null, true);
        }
        return z10;
    }

    @Override // pg.d1
    public final void e() {
        qb qbVar = this.a;
        qbVar.D0.a.e();
        qbVar.d1.setViewHidden(false);
    }

    @Override // pg.d1
    public final void f() {
        qb qbVar = this.a;
        if (qbVar.J0 != null) {
            qbVar.D0(null, true);
        }
        qbVar.d1.setViewHidden(true);
    }

    @Override // pg.d1
    public final void a() {
    }
}
