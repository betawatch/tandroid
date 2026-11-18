package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.messenger.g0.g3(new if0(this, 9));
    }
}
