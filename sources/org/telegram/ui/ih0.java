package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ih0 extends ci.o {
    public Runnable W;

    @Override // ci.o, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        hh0 hh0Var = new hh0(this, 0);
        this.W = hh0Var;
        org.telegram.messenger.i0.g3(hh0Var);
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
        hh0 hh0Var = new hh0(this, 1);
        this.W = hh0Var;
        org.telegram.messenger.i0.g3(hh0Var);
    }

    @Override // s4.j
    public final void F() {
    }
}
