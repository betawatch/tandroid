package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class cb extends pi.k {
    public int W;
    public hq0 X;
    public final /* synthetic */ lb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(lb lbVar, org.telegram.ui.Components.ek0 ek0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null, ek0Var, h6Var);
        this.Y = lbVar;
        this.W = -1;
    }

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        hq0 hq0Var = this.X;
        if (hq0Var != null) {
            org.telegram.messenger.g0.r(hq0Var);
        }
        hq0 hq0Var2 = new hq0(this, 20);
        this.X = hq0Var2;
        org.telegram.messenger.g0.g3(hq0Var2);
    }

    @Override // pi.k
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(lb.S0, this.W, false);
        }
        hq0 hq0Var = this.X;
        if (hq0Var != null) {
            org.telegram.messenger.g0.r(hq0Var);
            this.X = null;
        }
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
