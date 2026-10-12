package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class mz0 extends s4.k {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public mz0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // s4.k
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // s4.k
    public final void N() {
        AndroidUtilities.runOnUIThread(new yk0(this, 29));
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
