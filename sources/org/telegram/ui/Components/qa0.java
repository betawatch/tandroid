package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qa0 extends ci.o {
    public int W;
    public Runnable X;
    public final /* synthetic */ ua0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa0(ua0 ua0Var, ag.b1 b1Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null, b1Var, p6Var);
        this.Y = ua0Var;
        this.W = -1;
    }

    @Override // ci.o, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        pa0 pa0Var = new pa0(this, 0);
        this.X = pa0Var;
        org.telegram.messenger.i0.g3(pa0Var);
        ua0 ua0Var = this.Y;
        if (ua0Var.V) {
            ua0Var.V = false;
            org.telegram.messenger.i0.g3(new pa0(this, 1));
        }
    }

    @Override // ci.o
    public final void W() {
        ab0 ab0Var = this.Y.c0;
        org.telegram.messenger.i0.r(ab0Var.D);
        ab0Var.D.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.zs.f(ab0Var.x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.X = null;
        }
    }

    @Override // ci.o, s4.j, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        pa0 pa0Var = new pa0(this, 2);
        this.X = pa0Var;
        org.telegram.messenger.i0.g3(pa0Var);
    }
}
