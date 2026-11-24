// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lq1 extends la2 {
    public Runnable W;
    public final /* synthetic */ mu1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq1(mu1 mu1Var, mu1 mu1Var2, jq1 jq1Var, wjb wjbVar) {
        super(mu1Var2, jq1Var, wjbVar);
        this.X = mu1Var;
    }

    @Override // gb3
    public final void F() {
        mu1 mu1Var = this.X;
        if (mu1Var.ea == -1) {
            mu1Var.ea = mu1Var.getNotificationCenter().q(mu1.td, mu1Var.ea, false);
        }
    }

    @Override // la2, gb3
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
            this.W = null;
        }
        kq1 kq1Var = new kq1(this, (byte) 1);
        this.W = kq1Var;
        gl.c3(kq1Var);
    }

    @Override // la2
    public final void V() {
        mu1 mu1Var = this.X;
        mu1Var.ea = mu1Var.getNotificationCenter().q(mu1.td, mu1Var.ea, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
            this.W = null;
        }
        if (w01.a) {
            fa4.b("chatItemAnimator disable notifications");
        }
        o1 o1Var = mu1Var.a0.getAdjustPanLayoutHelper().h;
        gl.r(o1Var);
        o1Var.run();
        qw1 qw1Var = mu1Var.a0.N4;
        gl.r(qw1Var);
        qw1Var.run();
    }

    @Override // la2, gb3, b49
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
        }
        kq1 kq1Var = new kq1(this, (byte) 0);
        this.W = kq1Var;
        gl.c3(kq1Var);
    }
}
