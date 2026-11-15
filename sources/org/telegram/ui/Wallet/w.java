package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.c;
                i0 i0Var = (i0) this.d;
                s10 s10Var = (s10) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(l0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    i5.c.y(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    l0.H(sb2.toString());
                    Utilities.d.c(new oi.n2(l0Var, z10, i0Var, proofchallenge, currentTime, s10Var));
                    break;
                } else {
                    i0Var.close();
                    s10Var.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                d2 d2Var = (d2) this.c;
                m mVar = (m) this.d;
                z1 z1Var = (z1) this.e;
                boolean z11 = this.b;
                i0 i0Var2 = (i0) obj;
                String str = (String) obj2;
                if (i0Var2 != null && str == null) {
                    i0 b10 = i0Var2.b();
                    x21 x21Var = new x21(12, b10, mVar);
                    String str2 = z1Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = z1Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (np.s1(d2Var.a).f7.contains(d2.l(tonconnectsession.id, z1Var.b) + ".transfer")) {
                            d2Var.B(z1Var, b10, x21Var);
                            break;
                        }
                    }
                    di.t2 t2Var = new di.t2(d2Var, z1Var, x21Var, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        d2Var.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new q(x21Var, b10, z1Var, t2Var, 6));
                        break;
                    } else {
                        t2Var.a(null);
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
