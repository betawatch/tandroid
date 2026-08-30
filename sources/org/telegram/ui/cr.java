package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cr extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ pr G;

    public cr(pr prVar) {
        this.G = prVar;
    }

    @Override // f2.l
    public final void N() {
        this.F.unlock();
    }

    @Override // f2.l
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // f2.l
    public final void P(f2.l1 l1Var) {
        this.G.c.invalidate();
    }

    @Override // f2.l, f2.t0
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
