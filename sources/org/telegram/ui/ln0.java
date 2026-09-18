package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ln0 extends TimerTask {
    public final /* synthetic */ mn0 a;

    public ln0(mn0 mn0Var) {
        this.a = mn0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        mn0 mn0Var = this.a;
        if (mn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        mn0Var.y = (int) (mn0Var.y - (currentTimeMillis - mn0Var.F));
        mn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new sl0(this, 6));
    }
}
