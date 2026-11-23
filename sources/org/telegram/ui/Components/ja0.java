package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ja0 extends pi.k {
    public int W;
    public Runnable X;
    public final /* synthetic */ na0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(na0 na0Var, di.b1 b1Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null, b1Var, i6Var);
        this.Y = na0Var;
        this.W = -1;
    }

    @Override // pi.k, v4.l
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        ia0 ia0Var = new ia0(this, 0);
        this.X = ia0Var;
        org.telegram.messenger.g0.g3(ia0Var);
        na0 na0Var = this.Y;
        if (na0Var.W) {
            na0Var.W = false;
            org.telegram.messenger.g0.g3(new ia0(this, 1));
        }
    }

    @Override // pi.k
    public final void W() {
        ta0 ta0Var = this.Y.d0;
        org.telegram.messenger.g0.r(ta0Var.E);
        ta0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ks.f(ta0Var.x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.X = null;
        }
    }

    @Override // pi.k, v4.l, v4.n0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        ia0 ia0Var = new ia0(this, 2);
        this.X = ia0Var;
        org.telegram.messenger.g0.g3(ia0Var);
    }
}
