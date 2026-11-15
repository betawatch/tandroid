package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cb extends pi.k {
    public int W;
    public fq0 X;
    public final /* synthetic */ lb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(lb lbVar, org.telegram.ui.Components.uj0 uj0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, uj0Var, e6Var);
        this.Y = lbVar;
        this.W = -1;
    }

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        fq0 fq0Var = this.X;
        if (fq0Var != null) {
            org.telegram.messenger.g0.r(fq0Var);
        }
        fq0 fq0Var2 = new fq0(this, 20);
        this.X = fq0Var2;
        org.telegram.messenger.g0.h3(fq0Var2);
    }

    @Override // pi.k
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(lb.S0, this.W, false);
        }
        fq0 fq0Var = this.X;
        if (fq0Var != null) {
            org.telegram.messenger.g0.r(fq0Var);
            this.X = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
