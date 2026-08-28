package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ra0 extends rh.m {
    public int W;
    public Runnable X;
    public final /* synthetic */ wa0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra0(wa0 wa0Var, pa0 pa0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null, pa0Var, b6Var);
        this.Y = wa0Var;
        this.W = -1;
    }

    @Override // rh.m, f2.n
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        qa0 qa0Var = new qa0(this, 0);
        this.X = qa0Var;
        AndroidUtilities.runOnUIThread(qa0Var);
        wa0 wa0Var = this.Y;
        if (wa0Var.R) {
            wa0Var.R = false;
            AndroidUtilities.runOnUIThread(new qa0(this, 1));
        }
    }

    @Override // rh.m
    public final void W() {
        cb0 cb0Var = this.Y.V;
        AndroidUtilities.cancelRunOnUIThread(cb0Var.y);
        cb0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(cb0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // rh.m, f2.n, f2.w0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        qa0 qa0Var = new qa0(this, 2);
        this.X = qa0Var;
        AndroidUtilities.runOnUIThread(qa0Var);
    }
}
