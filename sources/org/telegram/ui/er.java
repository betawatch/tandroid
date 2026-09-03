package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class er extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ rr G;

    public er(rr rrVar) {
        this.G = rrVar;
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
