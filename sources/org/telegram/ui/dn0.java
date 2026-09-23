package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        AndroidUtilities.runOnUIThread(new jl0(this, 6));
    }
}
