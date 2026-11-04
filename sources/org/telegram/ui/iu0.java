package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class iu0 extends u4.k {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public iu0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // u4.k
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // u4.k
    public final void N() {
        org.telegram.messenger.g0.h3(new sg0(this, 29));
    }

    @Override // u4.k
    public final void P(u4.d1 d1Var) {
        RectF rectF = ProfileActivity.T6;
        this.G.p5();
    }

    @Override // u4.k, u4.m0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b3(this, 24));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
