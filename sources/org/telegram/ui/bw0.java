package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class bw0 extends s4.j {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public bw0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // s4.j
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // s4.j
    public final void N() {
        org.telegram.messenger.i0.g3(new vv0(this, 2));
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        RectF rectF = ProfileActivity.S6;
        this.G.p5();
    }

    @Override // s4.j, s4.l0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a3(this, 24));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
