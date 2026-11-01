package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gh0 extends ci.o {
    public Runnable W;

    @Override // ci.o, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        fh0 fh0Var = new fh0(this, 0);
        this.W = fh0Var;
        org.telegram.messenger.i0.g3(fh0Var);
    }

    @Override // ci.o
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("chatItemAnimator disable notifications");
        }
    }

    @Override // ci.o, s4.j, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        fh0 fh0Var = new fh0(this, 1);
        this.W = fh0Var;
        org.telegram.messenger.i0.g3(fh0Var);
    }

    @Override // s4.j
    public final void F() {
    }
}
