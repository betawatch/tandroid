package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class pj extends li.m {
    public Runnable W;
    public final /* synthetic */ sn X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(sn snVar, sn snVar2, nj njVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(snVar2, njVar, g6Var);
        this.X = snVar;
    }

    @Override // s4.k
    public final void F() {
        sn snVar = this.X;
        if (snVar.T9 == -1) {
            snVar.T9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.T9, sn.bd, false);
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
        sn snVar = this.X;
        snVar.T9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.T9, sn.bd, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.w2 w2Var = snVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        w2Var.run();
        org.telegram.ui.Components.af afVar = snVar.Y.Y3;
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
