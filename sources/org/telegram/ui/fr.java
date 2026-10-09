package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fr extends s4.j {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ tr G;

    public fr(tr trVar) {
        this.G = trVar;
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
    public final void P(s4.d1 d1Var) {
        this.G.c.invalidate();
    }

    @Override // s4.j, s4.n0
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
