package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public /* synthetic */ u6(y7 y7Var, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = y7Var;
        this.c = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.gj gjVar = this.c;
        y7 y7Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.hp hpVar = y7Var.q2;
                if (hpVar != null) {
                    TLRPC.Document a10 = hpVar.a();
                    hpVar.c.remove(gjVar);
                    if (hpVar.a() != a10) {
                        hpVar.e();
                    }
                    if (!y7Var.q2.c.isEmpty()) {
                        org.telegram.messenger.ns.f(y7Var.a).k(org.telegram.messenger.ns.T3, y7Var.q2);
                        break;
                    } else {
                        MediaController.B().o();
                        y7Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = y7Var.A2;
                int i10 = org.telegram.messenger.m10.t0;
                int i11 = y7Var.a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.np.s1(y7Var.a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", gjVar.e1());
                org.telegram.messenger.ns.f(y7Var.a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.an(bundle), false, false);
                y7Var.dismiss();
                break;
        }
    }
}
