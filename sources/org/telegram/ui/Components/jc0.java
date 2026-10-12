package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jc0 extends ki.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ pc0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(pc0 pc0Var, hc0 hc0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, hc0Var, c6Var);
        this.Y = pc0Var;
        this.W = -1;
    }

    @Override // ki.n, s4.k
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ic0 ic0Var = new ic0(this, 0);
        this.X = ic0Var;
        AndroidUtilities.runOnUIThread(ic0Var);
        pc0 pc0Var = this.Y;
        if (pc0Var.V) {
            pc0Var.V = false;
            AndroidUtilities.runOnUIThread(new ic0(this, 1));
        }
    }

    @Override // ki.n
    public final void W() {
        vc0 vc0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(vc0Var.y);
        vc0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(vc0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // ki.n, s4.k, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ic0 ic0Var = new ic0(this, 2);
        this.X = ic0Var;
        AndroidUtilities.runOnUIThread(ic0Var);
    }
}
