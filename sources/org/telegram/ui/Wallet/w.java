package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z9;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.c;
                i0 i0Var = (i0) this.d;
                v10 v10Var = (v10) this.e;
                boolean z9 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(l0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    jg.g.x(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    l0.H(sb2.toString());
                    Utilities.d.c(new li.p2(l0Var, z9, i0Var, proofchallenge, currentTime, v10Var));
                    break;
                } else {
                    i0Var.close();
                    v10Var.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                d2 d2Var = (d2) this.c;
                m mVar = (m) this.d;
                z1 z1Var = (z1) this.e;
                boolean z10 = this.b;
                i0 i0Var2 = (i0) obj;
                String str = (String) obj2;
                if (i0Var2 != null && str == null) {
                    i0 b10 = i0Var2.b();
                    s sVar = new s(7, b10, mVar);
                    String str2 = z1Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = z1Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (qp.s1(d2Var.a).e7.contains(d2.l(tonconnectsession.id, z1Var.b) + ".transfer")) {
                            d2Var.B(z1Var, b10, sVar);
                            break;
                        }
                    }
                    bi.n3 n3Var = new bi.n3(d2Var, z1Var, sVar, z10, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        d2Var.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new q(sVar, b10, z1Var, n3Var, 6));
                        break;
                    } else {
                        n3Var.a(null);
                        break;
                    }
                } else {
                    if (str == null) {
                        str = "Recovery phrase is unavailable";
                    }
                    mVar.a(str);
                    break;
                }
        }
    }
}
