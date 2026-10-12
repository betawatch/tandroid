package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lr extends s4.k {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ yr G;

    public lr(yr yrVar) {
        this.G = yrVar;
    }

    @Override // s4.k
    public final void N() {
        this.F.unlock();
    }

    @Override // s4.k
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        this.G.c.invalidate();
    }

    @Override // s4.k, s4.l0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
