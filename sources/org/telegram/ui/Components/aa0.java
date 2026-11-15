package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class aa0 extends pi.k {
    public int W;
    public Runnable X;
    public final /* synthetic */ ea0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(ea0 ea0Var, di.c1 c1Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, c1Var, e6Var);
        this.Y = ea0Var;
        this.W = -1;
    }

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        z90 z90Var = new z90(this, 0);
        this.X = z90Var;
        org.telegram.messenger.g0.h3(z90Var);
        ea0 ea0Var = this.Y;
        if (ea0Var.W) {
            ea0Var.W = false;
            org.telegram.messenger.g0.h3(new z90(this, 1));
        }
    }

    @Override // pi.k
    public final void W() {
        ka0 ka0Var = this.Y.d0;
        org.telegram.messenger.g0.r(ka0Var.E);
        ka0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ns.f(ka0Var.x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.X = null;
        }
    }

    @Override // pi.k, v4.k, v4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        z90 z90Var = new z90(this, 2);
        this.X = z90Var;
        org.telegram.messenger.g0.h3(z90Var);
    }
}
