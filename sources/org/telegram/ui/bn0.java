package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bn0 extends TimerTask {
    public final /* synthetic */ cn0 a;

    public bn0(cn0 cn0Var) {
        this.a = cn0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        cn0 cn0Var = this.a;
        if (cn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        cn0Var.y = (int) (cn0Var.y - (currentTimeMillis - cn0Var.F));
        cn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new il0(this, 6));
    }
}
