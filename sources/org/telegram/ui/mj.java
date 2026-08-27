package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mj extends sh.m {
    public Runnable W;
    public final /* synthetic */ rn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(rn rnVar, rn rnVar2, kj kjVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(rnVar2, kjVar, c6Var);
        this.X = rnVar;
    }

    @Override // f2.l
    public final void F() {
        rn rnVar = this.X;
        if (rnVar.D9 == -1) {
            rnVar.D9 = rnVar.getNotificationCenter().setAnimationInProgress(rnVar.D9, rn.Jc, false);
        }
    }

    @Override // sh.m, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        lj ljVar = new lj(this, 1);
        this.W = ljVar;
        AndroidUtilities.runOnUIThread(ljVar);
    }

    @Override // sh.m
    public final void W() {
        rn rnVar = this.X;
        rnVar.D9 = rnVar.getNotificationCenter().setAnimationInProgress(rnVar.D9, rn.Jc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.u2 u2Var = rnVar.U.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(u2Var);
        u2Var.run();
        org.telegram.ui.Components.ne neVar = rnVar.U.T3;
        AndroidUtilities.cancelRunOnUIThread(neVar);
        neVar.run();
    }

    @Override // sh.m, f2.l, f2.v0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        lj ljVar = new lj(this, 0);
        this.W = ljVar;
        AndroidUtilities.runOnUIThread(ljVar);
    }
}
