package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kb0 extends ki.o {
    public int W;
    public Runnable X;
    public final /* synthetic */ qb0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(qb0 qb0Var, ib0 ib0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, ib0Var, f6Var);
        this.Y = qb0Var;
        this.W = -1;
    }

    @Override // ki.o, s4.j
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        jb0 jb0Var = new jb0(this, 0);
        this.X = jb0Var;
        AndroidUtilities.runOnUIThread(jb0Var);
        qb0 qb0Var = this.Y;
        if (qb0Var.V) {
            qb0Var.V = false;
            AndroidUtilities.runOnUIThread(new jb0(this, 1));
        }
    }

    @Override // ki.o
    public final void W() {
        wb0 wb0Var = this.Y.c0;
        AndroidUtilities.cancelRunOnUIThread(wb0Var.y);
        wb0Var.y.run();
        if (this.W == -1) {
            this.W = NotificationCenter.getInstance(wb0Var.w).setAnimationInProgress(this.W, null, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.X = null;
        }
    }

    @Override // ki.o, s4.j, s4.m0
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        jb0 jb0Var = new jb0(this, 2);
        this.X = jb0Var;
        AndroidUtilities.runOnUIThread(jb0Var);
    }
}
