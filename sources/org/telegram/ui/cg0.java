package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cg0 extends mi.l {
    public Runnable W;

    @Override // mi.l, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        bg0 bg0Var = new bg0(this, 0);
        this.W = bg0Var;
        org.telegram.messenger.g0.h3(bg0Var);
    }

    @Override // mi.l
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
    }

    @Override // mi.l, v4.k, v4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        bg0 bg0Var = new bg0(this, 1);
        this.W = bg0Var;
        org.telegram.messenger.g0.h3(bg0Var);
    }

    @Override // v4.k
    public final void F() {
    }
}
