package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class wb0 extends ji.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ bc0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(bc0 bc0Var, ub0 ub0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, ub0Var, d6Var);
        this.Y = bc0Var;
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
        bc0 bc0Var = this.Y;
        if (bc0Var.V) {
            bc0Var.V = false;
            AndroidUtilities.runOnUIThread(new vb0(this, 1));
        }
    }

    @Override // ji.n
    public final void W() {
        hc0 hc0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(hc0Var.y);
        hc0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(hc0Var.w).setAnimationInProgress(this.W, null, false);
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
