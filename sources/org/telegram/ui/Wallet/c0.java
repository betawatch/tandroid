package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.c;
                r0 r0Var = (r0) this.d;
                q10 q10Var = (q10) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(u0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    i5.c.z(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    u0.P(sb2.toString());
                    Utilities.d.c(new oi.q2(u0Var, z10, r0Var, proofchallenge, currentTime, q10Var));
                    break;
                } else {
                    r0Var.close();
                    q10Var.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                l2 l2Var = (l2) this.c;
                o oVar = (o) this.d;
                h2 h2Var = (h2) this.e;
                boolean z11 = this.b;
                r0 r0Var2 = (r0) obj;
                String str = (String) obj2;
                if (r0Var2 != null && str == null) {
                    r0 b10 = r0Var2.b();
                    p51 p51Var = new p51(9, b10, oVar);
                    String str2 = h2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = h2Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (mp.u1(l2Var.a).h7.contains(l2.l(tonconnectsession.id, h2Var.b) + ".transfer")) {
                            l2Var.B(h2Var, b10, p51Var);
                            break;
                        }
                    }
                    di.x2 x2Var = new di.x2(l2Var, h2Var, p51Var, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        l2Var.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new s(p51Var, b10, h2Var, x2Var, 6));
                        break;
                    } else {
                        x2Var.a(null);
                        break;
                    }
                } else {
                    if (str == null) {
                        str = "Recovery phrase is unavailable";
                    }
                    oVar.a(str);
                    break;
                }
        }
    }
}
