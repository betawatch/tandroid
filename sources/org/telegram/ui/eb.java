package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class eb extends uh.m {
    public int W;
    public it0 X;
    public final /* synthetic */ ob Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(ob obVar, db dbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, dbVar, c6Var);
        this.Y = obVar;
        this.W = -1;
    }

    @Override // uh.m, f2.l
    public final void N() {
        super.N();
        it0 it0Var = this.X;
        if (it0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(it0Var);
        }
        it0 it0Var2 = new it0(this, 20);
        this.X = it0Var2;
        AndroidUtilities.runOnUIThread(it0Var2);
    }

    @Override // uh.m
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, ob.U0, false);
        }
        it0 it0Var = this.X;
        if (it0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(it0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
