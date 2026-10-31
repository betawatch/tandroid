package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p20 implements Runnable {
    public final /* synthetic */ b50 a;

    public p20(b50 b50Var) {
        this.a = b50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b50 b50Var = this.a;
        org.telegram.ui.ActionBar.u5 u5Var = b50Var.L1;
        h40 h40Var = b50Var.M1;
        if (h40Var == null || b50Var.I) {
            return;
        }
        org.telegram.messenger.u3 u3Var = b50Var.R2;
        int i10 = u3Var != null ? u3Var.b.schedule_date : b50Var.b4;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - ConnectionsManager.getInstance(b50Var.k1.a).getCurrentTime();
        if (currentTime >= 86400) {
            h40Var.l(org.telegram.messenger.cd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            h40Var.l(org.telegram.messenger.i0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && u5Var.getTag() == null) {
                u5Var.setTag(1);
                u5Var.l(org.telegram.messenger.cd.L0(2131743467, null), false);
            }
        }
        b50Var.N1.l(org.telegram.messenger.cd.W(3, i10, true), false);
        org.telegram.messenger.i0.h3(b50Var.n4, 1000L);
    }
}
