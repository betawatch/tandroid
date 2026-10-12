package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pn0 extends TimerTask {
    public final /* synthetic */ qn0 a;

    public pn0(qn0 qn0Var) {
        this.a = qn0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        qn0 qn0Var = this.a;
        if (qn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        qn0Var.y = (int) (qn0Var.y - (currentTimeMillis - qn0Var.F));
        qn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new yk0(this, 7));
    }
}
