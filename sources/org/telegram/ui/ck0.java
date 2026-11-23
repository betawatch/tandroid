package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ck0 extends TimerTask {
    public final /* synthetic */ dk0 a;

    public ck0(dk0 dk0Var) {
        this.a = dk0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        dk0 dk0Var = this.a;
        if (dk0Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        dk0Var.E = (int) (dk0Var.E - (currentTimeMillis - dk0Var.G));
        dk0Var.G = currentTimeMillis;
        org.telegram.messenger.g0.g3(new hf0(this, 9));
    }
}
