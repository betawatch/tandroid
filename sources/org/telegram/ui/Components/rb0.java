package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class rb0 extends ji.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ xb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb0(xb0 xb0Var, pb0 pb0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, pb0Var, f6Var);
        this.Y = xb0Var;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        qb0 qb0Var = new qb0(this, 0);
        this.X = qb0Var;
        AndroidUtilities.runOnUIThread(qb0Var);
        xb0 xb0Var = this.Y;
        if (xb0Var.V) {
            xb0Var.V = false;
            AndroidUtilities.runOnUIThread(new qb0(this, 1));
        }
    }

    @Override // ji.n
    public final void W() {
        dc0 dc0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(dc0Var.y);
        dc0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(dc0Var.w).setAnimationInProgress(this.W, null, false);
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
        qb0 qb0Var = new qb0(this, 2);
        this.X = qb0Var;
        AndroidUtilities.runOnUIThread(qb0Var);
    }
}
