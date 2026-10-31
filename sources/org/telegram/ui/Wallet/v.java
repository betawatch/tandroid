package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements j20 {
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

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.c;
                h0 h0Var = (h0) this.d;
                j20 j20Var = (j20) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(k0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    i0.a.t(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    k0.H(sb2.toString());
                    Utilities.d.c(new bi.y2(k0Var, z10, h0Var, proofchallenge, currentTime, j20Var));
                    break;
                } else {
                    h0Var.close();
                    j20Var.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                e2 e2Var = (e2) this.c;
                m mVar = (m) this.d;
                a2 a2Var = (a2) this.e;
                boolean z11 = this.b;
                h0 h0Var2 = (h0) obj;
                String str = (String) obj2;
                if (h0Var2 != null && str == null) {
                    h0 b10 = h0Var2.b();
                    f11 f11Var = new f11(13, b10, mVar);
                    String str2 = a2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = a2Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (vp.r1(e2Var.a).f7.contains(e2.l(tonconnectsession.id, a2Var.b) + ".transfer")) {
                            e2Var.B(a2Var, b10, f11Var);
                            break;
                        }
                    }
                    u1 u1Var = new u1(e2Var, a2Var, f11Var, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        e2Var.f.sendRequestTyped(tonconnectregisterkey, new a3.b(1), new q(f11Var, b10, a2Var, u1Var, 6));
                        break;
                    } else {
                        u1Var.a(null);
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
