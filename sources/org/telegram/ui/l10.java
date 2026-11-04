package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l10 implements Runnable {
    public final /* synthetic */ x30 a;

    public l10(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x30 x30Var = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = x30Var.M1;
        e30 e30Var = x30Var.N1;
        if (e30Var == null || x30Var.J) {
            return;
        }
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        int i3 = r3Var != null ? r3Var.b.schedule_date : x30Var.c4;
        if (i3 == 0) {
            return;
        }
        int currentTime = i3 - ConnectionsManager.getInstance(x30Var.l1.a).getCurrentTime();
        if (currentTime >= 86400) {
            e30Var.l(org.telegram.messenger.bd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            e30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && k5Var.getTag() == null) {
                k5Var.setTag(1);
                k5Var.l(org.telegram.messenger.bd.M0(2131743451, null), false);
            }
        }
        x30Var.O1.l(org.telegram.messenger.bd.W(3, i3, true), false);
        org.telegram.messenger.g0.i3(x30Var.o4, 1000L);
    }
}
