package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class z90 extends mi.l {
    public int W;
    public Runnable X;
    public final /* synthetic */ da0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(da0 da0Var, bi.q1 q1Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, q1Var, g6Var);
        this.Y = da0Var;
        this.W = -1;
    }

    @Override // mi.l, v4.k
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
        if (da0Var.V) {
            da0Var.V = false;
            org.telegram.messenger.g0.h3(new y90(this, 1));
        }
    }

    @Override // mi.l
    public final void W() {
        ja0 ja0Var = this.Y.c0;
        org.telegram.messenger.g0.r(ja0Var.D);
        ja0Var.D.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.qs.f(ja0Var.x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.X = null;
        }
    }

    @Override // mi.l, v4.k, v4.l0
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
