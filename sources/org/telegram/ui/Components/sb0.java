package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class sb0 extends ji.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ yb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(yb0 yb0Var, qb0 qb0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, qb0Var, e6Var);
        this.Y = yb0Var;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        rb0 rb0Var = new rb0(this, 0);
        this.X = rb0Var;
        AndroidUtilities.runOnUIThread(rb0Var);
        yb0 yb0Var = this.Y;
        if (yb0Var.V) {
            yb0Var.V = false;
            AndroidUtilities.runOnUIThread(new rb0(this, 1));
        }
    }

    @Override // ji.n
    public final void W() {
        ec0 ec0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(ec0Var.y);
        ec0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(ec0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // ji.n, s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        rb0 rb0Var = new rb0(this, 2);
        this.X = rb0Var;
        AndroidUtilities.runOnUIThread(rb0Var);
    }
}
