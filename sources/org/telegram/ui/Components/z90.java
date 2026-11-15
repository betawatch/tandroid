package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class z90 extends pi.k {
    public int W;
    public Runnable X;
    public final /* synthetic */ da0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(da0 da0Var, di.c1 c1Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, c1Var, e6Var);
        this.Y = da0Var;
        this.W = -1;
    }

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        y90 y90Var = new y90(this, 0);
        this.X = y90Var;
        org.telegram.messenger.g0.h3(y90Var);
        da0 da0Var = this.Y;
        if (da0Var.W) {
            da0Var.W = false;
            org.telegram.messenger.g0.h3(new y90(this, 1));
        }
    }

    @Override // pi.k
    public final void W() {
        ja0 ja0Var = this.Y.d0;
        org.telegram.messenger.g0.r(ja0Var.E);
        ja0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ns.f(ja0Var.x).q(null, this.W, false);
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
        y90 y90Var = new y90(this, 2);
        this.X = y90Var;
        org.telegram.messenger.g0.h3(y90Var);
    }
}
