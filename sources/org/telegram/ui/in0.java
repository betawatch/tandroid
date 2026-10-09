package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class in0 extends TimerTask {
    public final /* synthetic */ jn0 a;

    public in0(jn0 jn0Var) {
        this.a = jn0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        jn0 jn0Var = this.a;
        if (jn0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        jn0Var.y = (int) (jn0Var.y - (currentTimeMillis - jn0Var.F));
        jn0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new tk0(this, 7));
    }
}
