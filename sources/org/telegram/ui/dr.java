package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dr extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final /* synthetic */ qr G;

    public dr(qr qrVar) {
        this.G = qrVar;
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
    public final void P(f2.m1 m1Var) {
        this.G.c.invalidate();
    }

    @Override // f2.l, f2.u0
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
