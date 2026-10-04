package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class mb extends ji.n {
    public int W;
    public hu0 X;
    public final /* synthetic */ wb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(wb wbVar, lb lbVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, lbVar, d6Var);
        this.Y = wbVar;
        this.W = -1;
    }

    @Override // ji.n, s4.j
    public final void N() {
        super.N();
        hu0 hu0Var = this.X;
        if (hu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(hu0Var);
        }
        hu0 hu0Var2 = new hu0(this, 20);
        this.X = hu0Var2;
        AndroidUtilities.runOnUIThread(hu0Var2);
    }

    @Override // ji.n
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, wb.R0, false);
        }
        hu0 hu0Var = this.X;
        if (hu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(hu0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
