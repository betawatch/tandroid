package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class gc0 extends li.m {
    public int W;
    public Runnable X;
    public final /* synthetic */ lc0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc0(lc0 lc0Var, ec0 ec0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, ec0Var, g6Var);
        this.Y = lc0Var;
        this.W = -1;
    }

    @Override // li.m, s4.k
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        fc0 fc0Var = new fc0(this, 0);
        this.X = fc0Var;
        AndroidUtilities.runOnUIThread(fc0Var);
        lc0 lc0Var = this.Y;
        if (lc0Var.V) {
            lc0Var.V = false;
            AndroidUtilities.runOnUIThread(new fc0(this, 1));
        }
    }

    @Override // li.m
    public final void W() {
        rc0 rc0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(rc0Var.y);
        rc0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(rc0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // li.m, s4.k, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        fc0 fc0Var = new fc0(this, 2);
        this.X = fc0Var;
        AndroidUtilities.runOnUIThread(fc0Var);
    }
}
