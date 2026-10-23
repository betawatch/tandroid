package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class pj extends li.m {
    public Runnable W;
    public final /* synthetic */ qn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(qn qnVar, qn qnVar2, nj njVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(qnVar2, njVar, d6Var);
        this.X = qnVar;
    }

    @Override // s4.k
    public final void F() {
        qn qnVar = this.X;
        if (qnVar.H9 == -1) {
            qnVar.H9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.H9, qn.Oc, false);
        }
    }

    @Override // li.m, s4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        oj ojVar = new oj(this, 1);
        this.W = ojVar;
        AndroidUtilities.runOnUIThread(ojVar);
    }

    @Override // li.m
    public final void W() {
        qn qnVar = this.X;
        qnVar.H9 = qnVar.getNotificationCenter().setAnimationInProgress(qnVar.H9, qn.Oc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.v2 v2Var = qnVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(v2Var);
        v2Var.run();
        org.telegram.ui.Components.af afVar = qnVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(afVar);
        afVar.run();
    }

    @Override // li.m, s4.k, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        oj ojVar = new oj(this, 0);
        this.W = ojVar;
        AndroidUtilities.runOnUIThread(ojVar);
    }
}
