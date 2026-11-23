package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ma0 extends pi.k {
    public int W;
    public Runnable X;
    public final /* synthetic */ qa0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(qa0 qa0Var, di.b1 b1Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null, b1Var, h6Var);
        this.Y = qa0Var;
        this.W = -1;
    }

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        la0 la0Var = new la0(this, 0);
        this.X = la0Var;
        org.telegram.messenger.g0.g3(la0Var);
        qa0 qa0Var = this.Y;
        if (qa0Var.W) {
            qa0Var.W = false;
            org.telegram.messenger.g0.g3(new la0(this, 1));
        }
    }

    @Override // pi.k
    public final void W() {
        wa0 wa0Var = this.Y.d0;
        org.telegram.messenger.g0.r(wa0Var.E);
        wa0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ls.f(wa0Var.x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.X = null;
        }
    }

    @Override // pi.k, v4.k, v4.n0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        la0 la0Var = new la0(this, 2);
        this.X = la0Var;
        org.telegram.messenger.g0.g3(la0Var);
    }
}
