package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mb extends mi.m {
    public int W;
    public bu0 X;
    public final /* synthetic */ wb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(wb wbVar, lb lbVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null, lbVar, u6Var);
        this.Y = wbVar;
        this.W = -1;
    }

    @Override // mi.m, s4.l
    public final void N() {
        super.N();
        bu0 bu0Var = this.X;
        if (bu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bu0Var);
        }
        bu0 bu0Var2 = new bu0(this, 20);
        this.X = bu0Var2;
        AndroidUtilities.runOnUIThread(bu0Var2);
    }

    @Override // mi.m
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.R0, false);
        }
        bu0 bu0Var = this.X;
        if (bu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
