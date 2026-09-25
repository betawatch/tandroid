package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class cr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ pr G;

    public cr(pr prVar) {
        this.G = prVar;
    }

    @Override // s4.j
    public final void N() {
        this.F.unlock();
    }

    @Override // s4.j
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        this.G.c.invalidate();
    }

    @Override // s4.j, s4.m0
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
