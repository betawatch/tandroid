package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mb extends mi.m {
    public int W;
    public zt0 X;
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
        zt0 zt0Var = this.X;
        if (zt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zt0Var);
        }
        zt0 zt0Var2 = new zt0(this, 20);
        this.X = zt0Var2;
        AndroidUtilities.runOnUIThread(zt0Var2);
    }

    @Override // mi.m
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.R0, false);
        }
        zt0 zt0Var = this.X;
        if (zt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
