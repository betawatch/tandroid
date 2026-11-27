// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nf1 extends bb2 {
    public int W;
    public fv0 X;
    public final /* synthetic */ wf1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf1(wf1 wf1Var, d79 d79Var, vnb vnbVar) {
        super(null, d79Var, vnbVar);
        this.Y = wf1Var;
        this.W = -1;
    }

    @Override // bb2, zb3
    public final void N() {
        super.N();
        fv0 fv0Var = this.X;
        if (fv0Var != null) {
            hl.r(fv0Var);
        }
        fv0 fv0Var2 = new fv0(this, (byte) 24);
        this.X = fv0Var2;
        hl.c3(fv0Var2);
    }

    @Override // bb2
    public final void V() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().p(wf1.R0, this.W, false);
        }
        fv0 fv0Var = this.X;
        if (fv0Var != null) {
            hl.r(fv0Var);
            this.X = null;
        }
        if (f11.a) {
            cc4.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
