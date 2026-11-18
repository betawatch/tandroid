package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dg0 extends pi.k {
    public Runnable W;

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        cg0 cg0Var = new cg0(this, 0);
        this.W = cg0Var;
        org.telegram.messenger.g0.g3(cg0Var);
    }

    @Override // pi.k
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.s2.a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
    }

    @Override // pi.k, v4.k, v4.n0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        cg0 cg0Var = new cg0(this, 1);
        this.W = cg0Var;
        org.telegram.messenger.g0.g3(cg0Var);
    }

    @Override // v4.k
    public final void F() {
    }
}
