package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ org.telegram.messenger.jj c;

    public /* synthetic */ s6(w7 w7Var, org.telegram.messenger.jj jjVar, int i10) {
        this.a = i10;
        this.b = w7Var;
        this.c = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.messenger.jj jjVar = this.c;
        w7 w7Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.pp ppVar = w7Var.m2;
                if (ppVar != null) {
                    TLRPC.Document a2 = ppVar.a();
                    ppVar.c.remove(jjVar);
                    if (ppVar.a() != a2) {
                        ppVar.e();
                    }
                    if (!w7Var.m2.c.isEmpty()) {
                        org.telegram.messenger.zs.f(w7Var.a).k(org.telegram.messenger.zs.T3, w7Var.m2);
                        break;
                    } else {
                        MediaController.B().o();
                        w7Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = w7Var.w2;
                int i11 = org.telegram.messenger.d20.s0;
                int i12 = w7Var.a;
                if (i11 != i12) {
                    launchActivity.O0(i12);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                if (org.telegram.messenger.o5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(w7Var.a).L0(Long.valueOf(-B0));
                    if (L0 != null && L0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -L0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", jjVar.f1());
                org.telegram.messenger.zs.f(w7Var.a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.un(bundle), false, false);
                w7Var.dismiss();
                break;
        }
    }
}
