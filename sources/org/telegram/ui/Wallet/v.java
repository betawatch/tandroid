package org.telegram.ui.Wallet;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.c;
                i0 i0Var = (i0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(l0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    com.google.android.gms.internal.play_billing.k3.r(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    l0.F(sb2.toString());
                    Utilities.stageQueue.postRunnable(new ki.r2(l0Var, z10, i0Var, proofchallenge, currentTime, callback2));
                    break;
                } else {
                    i0Var.close();
                    callback2.run(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                e2 e2Var = (e2) this.c;
                o oVar = (o) this.d;
                a2 a2Var = (a2) this.e;
                boolean z11 = this.b;
                i0 i0Var2 = (i0) obj;
                String str = (String) obj2;
                if (i0Var2 != null && str == null) {
                    i0 b10 = i0Var2.b();
                    w wVar = new w(3, b10, oVar);
                    String str2 = a2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (MessagesController.getMainSettings(e2Var.a).contains(e2.j(tonconnectsession.id, a2Var.b) + ".transfer")) {
                            e2Var.z(a2Var, b10, wVar);
                            break;
                        }
                    }
                    ai.r3 r3Var = new ai.r3(e2Var, a2Var, wVar, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        e2Var.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new p(wVar, b10, a2Var, r3Var, 6));
                        break;
                    } else {
                        r3Var.run(null);
                        break;
                    }
                } else {
                    if (str == null) {
                        str = "Recovery phrase is unavailable";
                    }
                    oVar.run(str);
                    break;
                }
        }
    }
}
