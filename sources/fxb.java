// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fxb extends sc3 {
    public Runnable F;
    public int G;
    public final /* synthetic */ sxb H;

    public fxb(sxb sxbVar) {
        this.H = sxbVar;
    }

    @Override // sc3
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().p(null, this.G, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                gm.r(runnable);
                this.F = null;
            }
        }
    }

    @Override // sc3
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            gm.r(runnable);
            this.F = null;
        }
        exb exbVar = new exb(this, (byte) 0);
        this.F = exbVar;
        gm.c3(exbVar);
    }

    @Override // sc3, d69
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            gm.r(runnable);
        }
        exb exbVar = new exb(this, (byte) 1);
        this.F = exbVar;
        gm.c3(exbVar);
    }

    @Override // sc3
    public final void z(u69 u69Var) {
        sxb sxbVar = this.H;
        pxb pxbVar = sxbVar.d1;
        if (pxbVar == u69Var.a) {
            pxbVar.setTranslationX(0.0f);
            wwb wwbVar = sxbVar.P;
            if (wwbVar != null) {
                wwbVar.G.clear();
            }
            pxb pxbVar2 = sxbVar.d1;
            if (wi8.A(pxbVar2)) {
                pxbVar2.setTopicIcon(pxbVar2.d5);
            }
            sxbVar.d1 = null;
        }
    }
}
