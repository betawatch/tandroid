// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mg1 extends wb2 {
    public int W;
    public yt0 X;
    public final /* synthetic */ vg1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg1(vg1 vg1Var, r59 r59Var, ylb ylbVar) {
        super(null, r59Var, ylbVar);
        this.Y = vg1Var;
        this.W = -1;
    }

    @Override // wb2, sc3
    public final void N() {
        super.N();
        yt0 yt0Var = this.X;
        if (yt0Var != null) {
            gm.r(yt0Var);
        }
        yt0 yt0Var2 = new yt0(this, (byte) 24);
        this.X = yt0Var2;
        gm.c3(yt0Var2);
    }

    @Override // wb2
    public final void V() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().p(vg1.R0, this.W, false);
        }
        yt0 yt0Var = this.X;
        if (yt0Var != null) {
            gm.r(yt0Var);
            this.X = null;
        }
        if (e21.a) {
            fc4.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
