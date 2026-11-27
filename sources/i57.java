// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class i57 extends bb2 {
    public int W;
    public Runnable X;
    public final /* synthetic */ m57 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i57(m57 m57Var, gu guVar, vnb vnbVar) {
        super(null, guVar, vnbVar);
        this.Y = m57Var;
        this.W = -1;
    }

    @Override // bb2, zb3
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            hl.r(runnable);
        }
        h57 h57Var = new h57(this, (byte) 0);
        this.X = h57Var;
        hl.c3(h57Var);
        m57 m57Var = this.Y;
        if (m57Var.W) {
            m57Var.W = false;
            hl.c3(new h57(this, (byte) 1));
        }
    }

    @Override // bb2
    public final void V() {
        s57 s57Var = this.Y.d0;
        hl.r(s57Var.E);
        s57Var.E.run();
        if (this.W == -1) {
            this.W = jn7.f(s57Var.x).p(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            hl.r(runnable);
            this.X = null;
        }
    }

    @Override // bb2, zb3, o79
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            hl.r(runnable);
        }
        h57 h57Var = new h57(this, (byte) 2);
        this.X = h57Var;
        hl.c3(h57Var);
    }
}
