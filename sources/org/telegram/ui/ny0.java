package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ny0 extends f2.l {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public ny0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // f2.l
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // f2.l
    public final void N() {
        AndroidUtilities.runOnUIThread(new el0(this, 29));
    }

    @Override // f2.l
    public final void P(f2.l1 l1Var) {
        this.G.U4();
    }

    @Override // f2.l, f2.t0
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
