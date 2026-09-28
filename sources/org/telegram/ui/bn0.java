package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
