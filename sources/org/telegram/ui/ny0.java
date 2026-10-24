package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ny0 extends s4.k {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public ny0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // s4.k
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // s4.k
    public final void N() {
        AndroidUtilities.runOnUIThread(new my0(this, 0));
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        this.G.Y4();
    }

    @Override // s4.k, s4.l0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new d3(this, 26));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
