package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
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
                m0 m0Var = (m0) this.c;
                j0 j0Var = (j0) this.d;
                v10 v10Var = (v10) this.e;
                boolean z9 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(m0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    jg.g.x(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    m0.H(sb2.toString());
                    Utilities.d.c(new li.p2(m0Var, z9, j0Var, proofchallenge, currentTime, v10Var));
                    break;
                } else {
                    j0Var.close();
                    v10Var.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                e2 e2Var = (e2) this.c;
                m mVar = (m) this.d;
                a2 a2Var = (a2) this.e;
                boolean z10 = this.b;
                j0 j0Var2 = (j0) obj;
                String str = (String) obj2;
                if (j0Var2 != null && str == null) {
                    j0 b10 = j0Var2.b();
                    t tVar = new t(7, b10, mVar);
                    String str2 = a2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (qp.s1(e2Var.a).e7.contains(e2.l(tonconnectsession.id, a2Var.b) + ".transfer")) {
                            e2Var.B(a2Var, b10, tVar);
                            break;
                        }
                    }
                    bi.n3 n3Var = new bi.n3(e2Var, a2Var, tVar, z10, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        e2Var.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new r(tVar, b10, a2Var, n3Var, 6));
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
