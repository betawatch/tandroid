package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nj extends uh.m {
    public Runnable W;
    public final /* synthetic */ tn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(tn tnVar, tn tnVar2, lj ljVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(tnVar2, ljVar, c6Var);
        this.X = tnVar;
    }

    @Override // f2.l
    public final void F() {
        tn tnVar = this.X;
        if (tnVar.D9 == -1) {
            tnVar.D9 = tnVar.getNotificationCenter().setAnimationInProgress(tnVar.D9, tn.Jc, false);
        }
    }

    @Override // uh.m, f2.l
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        mj mjVar = new mj(this, 1);
        this.W = mjVar;
        AndroidUtilities.runOnUIThread(mjVar);
    }

    @Override // uh.m
    public final void W() {
        tn tnVar = this.X;
        tnVar.D9 = tnVar.getNotificationCenter().setAnimationInProgress(tnVar.D9, tn.Jc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = tnVar.U.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.ue ueVar = tnVar.U.T3;
        AndroidUtilities.cancelRunOnUIThread(ueVar);
        ueVar.run();
    }

    @Override // uh.m, f2.l, f2.u0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        mj mjVar = new mj(this, 0);
        this.W = mjVar;
        AndroidUtilities.runOnUIThread(mjVar);
    }
}
