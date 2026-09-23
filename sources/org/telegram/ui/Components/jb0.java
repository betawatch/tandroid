package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jb0 extends ji.n {
    public int W;
    public Runnable X;
    public final /* synthetic */ ob0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(ob0 ob0Var, hb0 hb0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, hb0Var, d6Var);
        this.Y = ob0Var;
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
        ob0 ob0Var = this.Y;
        if (ob0Var.V) {
            ob0Var.V = false;
            AndroidUtilities.runOnUIThread(new ib0(this, 1));
        }
    }

    @Override // ji.n
    public final void W() {
        ub0 ub0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(ub0Var.y);
        ub0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(ub0Var.w).setAnimationInProgress(this.W, null, false);
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
