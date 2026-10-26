package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dn0 extends TimerTask {
    public final /* synthetic */ en0 a;

    public dn0(en0 en0Var) {
        this.a = en0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        en0 en0Var = this.a;
        if (en0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        en0Var.y = (int) (en0Var.y - (currentTimeMillis - en0Var.F));
        en0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new lj0(this, 8));
    }
}
