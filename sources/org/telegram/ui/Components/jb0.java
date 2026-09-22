package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jb0 extends ji.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ pb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(pb0 pb0Var, hb0 hb0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, hb0Var, e6Var);
        this.Y = pb0Var;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ib0 ib0Var = new ib0(this, 0);
        this.X = ib0Var;
        AndroidUtilities.runOnUIThread(ib0Var);
        pb0 pb0Var = this.Y;
        if (pb0Var.V) {
            pb0Var.V = false;
            AndroidUtilities.runOnUIThread(new ib0(this, 1));
        }
    }

    @Override // ji.n
    public final void W() {
        vb0 vb0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(vb0Var.y);
        vb0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(vb0Var.w).setAnimationInProgress(this.W, null, false);
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
        ib0 ib0Var = new ib0(this, 2);
        this.X = ib0Var;
        AndroidUtilities.runOnUIThread(ib0Var);
    }
}
