package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kj extends rh.m {
    public Runnable W;
    public final /* synthetic */ qn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(qn qnVar, qn qnVar2, ij ijVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(qnVar2, ijVar, b6Var);
        this.X = qnVar;
    }

    @Override // f2.n
    public final void F() {
        qn qnVar = this.X;
        if (qnVar.D9 == -1) {
            qnVar.D9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.D9, qn.Jc, false);
        }
    }

    @Override // rh.m, f2.n
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        jj jjVar = new jj(this, 1);
        this.W = jjVar;
        AndroidUtilities.runOnUIThread(jjVar);
    }

    @Override // rh.m
    public final void W() {
        qn qnVar = this.X;
        qnVar.D9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.D9, qn.Jc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = qnVar.U.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.re reVar = qnVar.U.T3;
        AndroidUtilities.cancelRunOnUIThread(reVar);
        reVar.run();
    }

    @Override // rh.m, f2.n, f2.w0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        jj jjVar = new jj(this, 0);
        this.W = jjVar;
        AndroidUtilities.runOnUIThread(jjVar);
    }
}
