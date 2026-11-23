package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class cg0 extends pi.k {
    public Runnable W;

    @Override // pi.k, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        bg0 bg0Var = new bg0(this, 0);
        this.W = bg0Var;
        org.telegram.messenger.g0.g3(bg0Var);
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
        bg0 bg0Var = new bg0(this, 1);
        this.W = bg0Var;
        org.telegram.messenger.g0.g3(bg0Var);
    }

    @Override // v4.k
    public final void F() {
    }
}
