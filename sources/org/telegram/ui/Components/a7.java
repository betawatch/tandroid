package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;
    public final /* synthetic */ org.telegram.messenger.fj c;

    public /* synthetic */ a7(e8 e8Var, org.telegram.messenger.fj fjVar, int i7) {
        this.a = i7;
        this.b = e8Var;
        this.c = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.fj fjVar = this.c;
        e8 e8Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.gp gpVar = e8Var.q2;
                if (gpVar != null) {
                    TLRPC.Document a10 = gpVar.a();
                    gpVar.c.remove(fjVar);
                    if (gpVar.a() != a10) {
                        gpVar.e();
                    }
                    if (!e8Var.q2.c.isEmpty()) {
                        org.telegram.messenger.ks.f(e8Var.a).k(org.telegram.messenger.ks.W3, e8Var.q2);
                        break;
                    } else {
                        MediaController.B().o();
                        e8Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = e8Var.A2;
                int i10 = org.telegram.messenger.i10.t0;
                int i11 = e8Var.a;
                if (i10 != i11) {
                    launchActivity.O0(i11);
                }
                Bundle bundle = new Bundle();
                long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                if (org.telegram.messenger.n5.C(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(e8Var.a).O0(Long.valueOf(-B0));
                    if (O0 != null && O0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -O0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", fjVar.e1());
                org.telegram.messenger.ks.f(e8Var.a).k(4, new Object[0]);
                launchActivity.u0(new org.telegram.ui.bn(bundle), false, false);
                e8Var.dismiss();
                break;
        }
    }
}
