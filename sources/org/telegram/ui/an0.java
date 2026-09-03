package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
