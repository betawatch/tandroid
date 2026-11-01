package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o20 implements Runnable {
    public final /* synthetic */ a50 a;

    public o20(a50 a50Var) {
        this.a = a50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a50 a50Var = this.a;
        org.telegram.ui.ActionBar.u5 u5Var = a50Var.L1;
        g40 g40Var = a50Var.M1;
        if (g40Var == null || a50Var.I) {
            return;
        }
        org.telegram.messenger.u3 u3Var = a50Var.R2;
        int i10 = u3Var != null ? u3Var.b.schedule_date : a50Var.b4;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - ConnectionsManager.getInstance(a50Var.k1.a).getCurrentTime();
        if (currentTime >= 86400) {
            g40Var.l(org.telegram.messenger.dd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            g40Var.l(org.telegram.messenger.i0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && u5Var.getTag() == null) {
                u5Var.setTag(1);
                u5Var.l(org.telegram.messenger.dd.L0(2131743467, null), false);
            }
        }
        a50Var.N1.l(org.telegram.messenger.dd.W(3, i10, true), false);
        org.telegram.messenger.i0.h3(a50Var.n4, 1000L);
    }
}
