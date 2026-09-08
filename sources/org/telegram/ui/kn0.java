package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kn0 extends TimerTask {
    public final /* synthetic */ ln0 a;

    public kn0(ln0 ln0Var) {
        this.a = ln0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ln0 ln0Var = this.a;
        if (ln0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        ln0Var.y = (int) (ln0Var.y - (currentTimeMillis - ln0Var.F));
        ln0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new rl0(this, 6));
    }
}
