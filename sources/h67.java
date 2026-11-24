// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h67 extends wb2 {
    public Runnable W;

    @Override // wb2, sc3
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
            this.W = null;
        }
        g67 g67Var = new g67(this, (byte) 0);
        this.W = g67Var;
        gm.c3(g67Var);
    }

    @Override // wb2
    public final void V() {
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
            this.W = null;
        }
        if (e21.a) {
            fc4.b("chatItemAnimator disable notifications");
        }
    }

    @Override // wb2, sc3, d69
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
        }
        g67 g67Var = new g67(this, (byte) 1);
        this.W = g67Var;
        gm.c3(g67Var);
    }

    @Override // sc3
    public final void F() {
    }
}
