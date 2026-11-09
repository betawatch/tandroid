package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bg0 extends mi.l {
    public Runnable W;

    @Override // mi.l, v4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        ag0 ag0Var = new ag0(this, 0);
        this.W = ag0Var;
        org.telegram.messenger.g0.h3(ag0Var);
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
        ag0 ag0Var = new ag0(this, 1);
        this.W = ag0Var;
        org.telegram.messenger.g0.h3(ag0Var);
    }

    @Override // v4.k
    public final void F() {
    }
}
