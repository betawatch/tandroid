package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class wb0 extends ji.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ cc0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(cc0 cc0Var, ub0 ub0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, ub0Var, d6Var);
        this.Y = cc0Var;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        vb0 vb0Var = new vb0(this, 0);
        this.X = vb0Var;
        AndroidUtilities.runOnUIThread(vb0Var);
        cc0 cc0Var = this.Y;
        if (cc0Var.V) {
            cc0Var.V = false;
            AndroidUtilities.runOnUIThread(new vb0(this, 1));
        }
    }

    @Override // ji.n
    public final void W() {
        ic0 ic0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(ic0Var.y);
        ic0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(ic0Var.w).setAnimationInProgress(this.W, null, false);
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
        vb0 vb0Var = new vb0(this, 2);
        this.X = vb0Var;
        AndroidUtilities.runOnUIThread(vb0Var);
    }
}
