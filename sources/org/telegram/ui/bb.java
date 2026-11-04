package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bb extends ni.l {
    public int W;
    public xp0 X;
    public final /* synthetic */ kb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(kb kbVar, org.telegram.ui.Components.tj0 tj0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, tj0Var, e6Var);
        this.Y = kbVar;
        this.W = -1;
    }

    @Override // ni.l, u4.k
    public final void N() {
        super.N();
        xp0 xp0Var = this.X;
        if (xp0Var != null) {
            org.telegram.messenger.g0.r(xp0Var);
        }
        xp0 xp0Var2 = new xp0(this, 20);
        this.X = xp0Var2;
        org.telegram.messenger.g0.h3(xp0Var2);
    }

    @Override // ni.l
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(kb.S0, this.W, false);
        }
        xp0 xp0Var = this.X;
        if (xp0Var != null) {
            org.telegram.messenger.g0.r(xp0Var);
            this.X = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
