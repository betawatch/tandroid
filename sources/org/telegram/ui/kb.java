package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kb extends ki.o {
    public int W;
    public lu0 X;
    public final /* synthetic */ ub Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(ub ubVar, jb jbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, jbVar, f6Var);
        this.Y = ubVar;
        this.W = -1;
    }

    @Override // ki.o, s4.j
    public final void N() {
        super.N();
        lu0 lu0Var = this.X;
        if (lu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lu0Var);
        }
        lu0 lu0Var2 = new lu0(this, 20);
        this.X = lu0Var2;
        AndroidUtilities.runOnUIThread(lu0Var2);
    }

    @Override // ki.o
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, ub.Y0, false);
        }
        lu0 lu0Var = this.X;
        if (lu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
