package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y90 extends mi.l {
    public int W;
    public Runnable X;
    public final /* synthetic */ ca0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(ca0 ca0Var, bi.q1 q1Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null, q1Var, h6Var);
        this.Y = ca0Var;
        this.W = -1;
    }

    @Override // mi.l, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        x90 x90Var = new x90(this, 0);
        this.X = x90Var;
        org.telegram.messenger.g0.h3(x90Var);
        ca0 ca0Var = this.Y;
        if (ca0Var.V) {
            ca0Var.V = false;
            org.telegram.messenger.g0.h3(new x90(this, 1));
        }
    }

    @Override // mi.l
    public final void W() {
        ia0 ia0Var = this.Y.c0;
        org.telegram.messenger.g0.r(ia0Var.D);
        ia0Var.D.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.qs.f(ia0Var.x).q(null, this.W, false);
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
        x90 x90Var = new x90(this, 2);
        this.X = x90Var;
        org.telegram.messenger.g0.h3(x90Var);
    }
}
