package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class el0 extends TimerTask {
    public final /* synthetic */ fl0 a;

    public el0(fl0 fl0Var) {
        this.a = fl0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        fl0 fl0Var = this.a;
        if (fl0Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        fl0Var.D = (int) (fl0Var.D - (currentTimeMillis - fl0Var.F));
        fl0Var.F = currentTimeMillis;
        org.telegram.messenger.i0.g3(new kg0(this, 9));
    }
}
