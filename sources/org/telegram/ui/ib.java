package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ib extends ci.o {
    public int W;
    public rr0 X;
    public final /* synthetic */ sb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(sb sbVar, org.telegram.ui.Components.tk0 tk0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null, tk0Var, p6Var);
        this.Y = sbVar;
        this.W = -1;
    }

    @Override // ci.o, s4.j
    public final void N() {
        super.N();
        rr0 rr0Var = this.X;
        if (rr0Var != null) {
            org.telegram.messenger.i0.r(rr0Var);
        }
        rr0 rr0Var2 = new rr0(this, 20);
        this.X = rr0Var2;
        org.telegram.messenger.i0.g3(rr0Var2);
    }

    @Override // ci.o
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(sb.R0, this.W, false);
        }
        rr0 rr0Var = this.X;
        if (rr0Var != null) {
            org.telegram.messenger.i0.r(rr0Var);
            this.X = null;
        }
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
