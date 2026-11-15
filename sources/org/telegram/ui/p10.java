package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class p10 implements Runnable {
    public final /* synthetic */ c40 a;

    public p10(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c40 c40Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = c40Var.P1;
        j30 j30Var = c40Var.Q1;
        if (j30Var == null || c40Var.J) {
            return;
        }
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        int i7 = r3Var != null ? r3Var.b.schedule_date : c40Var.j4;
        if (i7 == 0) {
            return;
        }
        int currentTime = i7 - ConnectionsManager.getInstance(c40Var.o1.a).getCurrentTime();
        if (currentTime >= 86400) {
            j30Var.l(org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
        } else {
            j30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
            if (currentTime < 0 && j5Var.getTag() == null) {
                j5Var.setTag(1);
                j5Var.l(org.telegram.messenger.hd.M0(2131743441, null), false);
            }
        }
        c40Var.R1.l(org.telegram.messenger.hd.W(3, i7, true), false);
        org.telegram.messenger.g0.i3(c40Var.v4, 1000L);
    }
}
