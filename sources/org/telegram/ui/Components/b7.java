package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public /* synthetic */ b7(f8 f8Var, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = f8Var;
        this.c = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.gj gjVar = this.c;
        f8 f8Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.hp hpVar = f8Var.q2;
                if (hpVar != null) {
                    TLRPC.Document a10 = hpVar.a();
                    hpVar.c.remove(gjVar);
                    if (hpVar.a() != a10) {
                        hpVar.e();
                    }
                    if (!f8Var.q2.c.isEmpty()) {
                        org.telegram.messenger.ls.f(f8Var.a).k(org.telegram.messenger.ls.W3, f8Var.q2);
                        break;
                    } else {
                        MediaController.B().o();
                        f8Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = f8Var.A2;
                int i10 = org.telegram.messenger.k10.t0;
                int i11 = f8Var.a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                if (org.telegram.messenger.n5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(f8Var.a).O0(Long.valueOf(-B0));
                    if (O0 != null && O0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -O0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", gjVar.e1());
                org.telegram.messenger.ls.f(f8Var.a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.bn(bundle), false, false);
                f8Var.dismiss();
                break;
        }
    }
}
