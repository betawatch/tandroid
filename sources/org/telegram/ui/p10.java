package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class p10 implements Runnable {
    public final /* synthetic */ c40 a;

    public p10(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c40 c40Var = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = c40Var.L1;
        j30 j30Var = c40Var.M1;
        if (j30Var == null || c40Var.I) {
            return;
        }
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        int i7 = r3Var != null ? r3Var.b.schedule_date : c40Var.b4;
        if (i7 == 0) {
            return;
        }
        int currentTime = i7 - ConnectionsManager.getInstance(c40Var.k1.a).getCurrentTime();
        if (currentTime >= 86400) {
            j30Var.l(org.telegram.messenger.id.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            j30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && k5Var.getTag() == null) {
                k5Var.setTag(1);
                k5Var.l(org.telegram.messenger.id.M0(2131743444, null), false);
            }
        }
        c40Var.N1.l(org.telegram.messenger.id.W(3, i7, true), false);
        org.telegram.messenger.g0.i3(c40Var.n4, 1000L);
    }
}
