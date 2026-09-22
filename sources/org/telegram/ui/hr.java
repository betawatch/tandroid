package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ ur G;

    public hr(ur urVar) {
        this.G = urVar;
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
