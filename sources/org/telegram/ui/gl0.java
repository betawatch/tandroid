package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gl0 extends TimerTask {
    public final /* synthetic */ hl0 a;

    public gl0(hl0 hl0Var) {
        this.a = hl0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        hl0 hl0Var = this.a;
        if (hl0Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        hl0Var.D = (int) (hl0Var.D - (currentTimeMillis - hl0Var.F));
        hl0Var.F = currentTimeMillis;
        org.telegram.messenger.i0.g3(new mg0(this, 9));
    }
}
