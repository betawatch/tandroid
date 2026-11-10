package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ org.telegram.messenger.ij c;

    public /* synthetic */ v6(a8 a8Var, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = a8Var;
        this.c = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.ij ijVar = this.c;
        a8 a8Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.kp kpVar = a8Var.p2;
                if (kpVar != null) {
                    TLRPC.Document a10 = kpVar.a();
                    kpVar.c.remove(ijVar);
                    if (kpVar.a() != a10) {
                        kpVar.e();
                    }
                    if (!a8Var.p2.c.isEmpty()) {
                        org.telegram.messenger.qs.f(a8Var.a).k(org.telegram.messenger.qs.T3, a8Var.p2);
                        break;
                    } else {
                        MediaController.B().o();
                        a8Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = a8Var.z2;
                int i10 = org.telegram.messenger.p10.s0;
                int i11 = a8Var.a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(a8Var.a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", ijVar.e1());
                org.telegram.messenger.qs.f(a8Var.a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.cn(bundle), false, false);
                a8Var.dismiss();
                break;
        }
    }
}
