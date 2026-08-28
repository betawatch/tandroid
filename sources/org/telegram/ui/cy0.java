package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cy0 extends f2.n {
    public int F = -1;
    public final /* synthetic */ ProfileActivity G;

    public cy0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override // f2.n
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override // f2.n
    public final void N() {
        AndroidUtilities.runOnUIThread(new zk0(this, 29));
    }

    @Override // f2.n
    public final void P(f2.q1 q1Var) {
        this.G.U4();
    }

    @Override // f2.n, f2.w0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new f3(this, 26));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
