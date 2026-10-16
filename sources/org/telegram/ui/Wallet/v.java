package org.telegram.ui.Wallet;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                k0 k0Var = (k0) this.c;
                h0 h0Var = (h0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(k0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    i2.d.w(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    k0.E(sb2.toString());
                    Utilities.stageQueue.postRunnable(new ji.r2(k0Var, z10, h0Var, proofchallenge, currentTime, callback2));
                    break;
                } else {
                    h0Var.close();
                    callback2.run(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                e2 e2Var = (e2) this.c;
                p pVar = (p) this.d;
                a2 a2Var = (a2) this.e;
                boolean z11 = this.b;
                h0 h0Var2 = (h0) obj;
                String str = (String) obj2;
                if (h0Var2 != null && str == null) {
                    h0 b10 = h0Var2.b();
                    mt mtVar = new mt(26, b10, pVar);
                    String str2 = a2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (MessagesController.getMainSettings(e2Var.a).contains(e2.j(tonconnectsession.id, a2Var.b) + ".transfer")) {
                            e2Var.z(a2Var, b10, mtVar);
                            break;
                        }
                    }
                    t1 t1Var = new t1(e2Var, a2Var, mtVar, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        e2Var.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new o(mtVar, b10, a2Var, t1Var, 6));
                        break;
                    } else {
                        t1Var.run(null);
                        break;
                    }
                } else {
                    if (str == null) {
                        str = "Recovery phrase is unavailable";
                    }
                    pVar.run(str);
                    break;
                }
        }
    }
}
