package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                n0 n0Var = (n0) this.c;
                k0 k0Var = (k0) this.d;
                v10 v10Var = (v10) this.e;
                boolean z9 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(n0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    jg.g.x(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    n0.H(sb2.toString());
                    Utilities.d.c(new li.p2(n0Var, z9, k0Var, proofchallenge, currentTime, v10Var));
                    break;
                } else {
                    k0Var.close();
                    v10Var.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                f2 f2Var = (f2) this.c;
                m mVar = (m) this.d;
                b2 b2Var = (b2) this.e;
                boolean z10 = this.b;
                k0 k0Var2 = (k0) obj;
                String str = (String) obj2;
                if (k0Var2 != null && str == null) {
                    k0 b10 = k0Var2.b();
                    t tVar = new t(7, b10, mVar);
                    String str2 = b2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = b2Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (qp.s1(f2Var.a).e7.contains(f2.l(tonconnectsession.id, b2Var.b) + ".transfer")) {
                            f2Var.B(b2Var, b10, tVar);
                            break;
                        }
                    }
                    bi.n3 n3Var = new bi.n3(f2Var, b2Var, tVar, z10, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        f2Var.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new r(tVar, b10, b2Var, n3Var, 6));
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
