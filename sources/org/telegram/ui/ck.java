package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ck extends ki.n {
    public Runnable W;
    public final /* synthetic */ fo X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(fo foVar, fo foVar2, ak akVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(foVar2, akVar, c6Var);
        this.X = foVar;
    }

    @Override // s4.k
    public final void F() {
        fo foVar = this.X;
        if (foVar.H9 == -1) {
            foVar.H9 = foVar.getNotificationCenter().setAnimationInProgress(foVar.H9, fo.Nc, false);
        }
    }

    @Override // ki.n, s4.k
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        bk bkVar = new bk(this, 1);
        this.W = bkVar;
        AndroidUtilities.runOnUIThread(bkVar);
    }

    @Override // ki.n
    public final void W() {
        fo foVar = this.X;
        foVar.H9 = foVar.getNotificationCenter().setAnimationInProgress(foVar.H9, fo.Nc, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
        org.telegram.ui.ActionBar.u2 u2Var = foVar.Y.getAdjustPanLayoutHelper().h;
        AndroidUtilities.cancelRunOnUIThread(u2Var);
        u2Var.run();
        org.telegram.ui.Components.cf cfVar = foVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(cfVar);
        cfVar.run();
    }

    @Override // ki.n, s4.k, s4.l0
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        bk bkVar = new bk(this, 0);
        this.W = bkVar;
        AndroidUtilities.runOnUIThread(bkVar);
    }
}
