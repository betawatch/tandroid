package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lb0 extends wh.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ rb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(rb0 rb0Var, jb0 jb0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, jb0Var, f6Var);
        this.Y = rb0Var;
        this.W = -1;
    }

    @Override // wh.n, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        kb0 kb0Var = new kb0(this, 0);
        this.X = kb0Var;
        AndroidUtilities.runOnUIThread(kb0Var);
        rb0 rb0Var = this.Y;
        if (rb0Var.S) {
            rb0Var.S = false;
            AndroidUtilities.runOnUIThread(new kb0(this, 1));
        }
    }

    @Override // wh.n
    public final void W() {
        xb0 xb0Var = this.Y.W;
        AndroidUtilities.cancelRunOnUIThread(xb0Var.y);
        xb0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(xb0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // wh.n, f2.l, f2.t0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        kb0 kb0Var = new kb0(this, 2);
        this.X = kb0Var;
        AndroidUtilities.runOnUIThread(kb0Var);
    }
}
