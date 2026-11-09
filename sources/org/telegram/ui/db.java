package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class db extends mi.l {
    public int W;
    public iq0 X;
    public final /* synthetic */ mb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(mb mbVar, org.telegram.ui.Components.qj0 qj0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, qj0Var, g6Var);
        this.Y = mbVar;
        this.W = -1;
    }

    @Override // mi.l, v4.k
    public final void N() {
        super.N();
        iq0 iq0Var = this.X;
        if (iq0Var != null) {
            org.telegram.messenger.g0.r(iq0Var);
        }
        iq0 iq0Var2 = new iq0(this, 20);
        this.X = iq0Var2;
        org.telegram.messenger.g0.h3(iq0Var2);
    }

    @Override // mi.l
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(mb.R0, this.W, false);
        }
        iq0 iq0Var = this.X;
        if (iq0Var != null) {
            org.telegram.messenger.g0.r(iq0Var);
            this.X = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
