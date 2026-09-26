package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
