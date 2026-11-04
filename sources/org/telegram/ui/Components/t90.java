package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t90 extends ni.l {
    public int W;
    public Runnable X;
    public final /* synthetic */ x90 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(x90 x90Var, ci.j1 j1Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, j1Var, e6Var);
        this.Y = x90Var;
        this.W = -1;
    }

    @Override // ni.l, u4.k
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        s90 s90Var = new s90(this, 0);
        this.X = s90Var;
        org.telegram.messenger.g0.h3(s90Var);
        x90 x90Var = this.Y;
        if (x90Var.W) {
            x90Var.W = false;
            org.telegram.messenger.g0.h3(new s90(this, 1));
        }
    }

    @Override // ni.l
    public final void W() {
        da0 da0Var = this.Y.d0;
        org.telegram.messenger.g0.r(da0Var.E);
        da0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.hs.f(da0Var.x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.X = null;
        }
    }

    @Override // ni.l, u4.k, u4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        s90 s90Var = new s90(this, 2);
        this.X = s90Var;
        org.telegram.messenger.g0.h3(s90Var);
    }
}
