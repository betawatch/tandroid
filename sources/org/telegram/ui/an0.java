package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class an0 extends TimerTask {
    public final /* synthetic */ bn0 a;

    public an0(bn0 bn0Var) {
        this.a = bn0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        bn0 bn0Var = this.a;
        if (bn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        bn0Var.y = (int) (bn0Var.y - (currentTimeMillis - bn0Var.C));
        bn0Var.C = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new gl0(this, 6));
    }
}
