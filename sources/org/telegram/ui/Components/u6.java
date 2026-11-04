package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;
    public final /* synthetic */ org.telegram.messenger.zi c;

    public /* synthetic */ u6(z7 z7Var, org.telegram.messenger.zi ziVar, int i3) {
        this.a = i3;
        this.b = z7Var;
        this.c = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.messenger.zi ziVar = this.c;
        z7 z7Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.bp bpVar = z7Var.n2;
                if (bpVar != null) {
                    TLRPC.Document a10 = bpVar.a();
                    bpVar.c.remove(ziVar);
                    if (bpVar.a() != a10) {
                        bpVar.e();
                    }
                    if (!z7Var.n2.c.isEmpty()) {
                        org.telegram.messenger.hs.f(z7Var.a).k(org.telegram.messenger.hs.T3, z7Var.n2);
                        break;
                    } else {
                        MediaController.B().o();
                        z7Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = z7Var.x2;
                int i10 = org.telegram.messenger.h10.t0;
                int i11 = z7Var.a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                if (org.telegram.messenger.m5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(z7Var.a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", ziVar.f1());
                org.telegram.messenger.hs.f(z7Var.a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.wm(bundle), false, false);
                z7Var.dismiss();
                break;
        }
    }
}
