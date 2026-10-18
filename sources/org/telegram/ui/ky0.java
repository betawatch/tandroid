package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ky0 extends s4.k {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public ky0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // s4.k
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // s4.k
    public final void N() {
        AndroidUtilities.runOnUIThread(new ek0(this, 29));
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        this.G.U4();
    }

    @Override // s4.k, s4.l0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new e3(this, 26));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
