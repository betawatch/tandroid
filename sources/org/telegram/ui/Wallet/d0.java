package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.c;
                s0 s0Var = (s0) this.d;
                p10 p10Var = (p10) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(v0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    i5.c.z(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    v0.P(sb2.toString());
                    Utilities.d.c(new oi.q2(v0Var, z10, s0Var, proofchallenge, currentTime, p10Var));
                    break;
                } else {
                    s0Var.close();
                    p10Var.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                m2 m2Var = (m2) this.c;
                o oVar = (o) this.d;
                i2 i2Var = (i2) this.e;
                boolean z11 = this.b;
                s0 s0Var2 = (s0) obj;
                String str = (String) obj2;
                if (s0Var2 != null && str == null) {
                    s0 b10 = s0Var2.b();
                    a31 a31Var = new a31(10, b10, oVar);
                    String str2 = i2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = i2Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (mp.u1(m2Var.a).h7.contains(m2.l(tonconnectsession.id, i2Var.b) + ".transfer")) {
                            m2Var.B(i2Var, b10, a31Var);
                            break;
                        }
                    }
                    di.x2 x2Var = new di.x2(m2Var, i2Var, a31Var, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        m2Var.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new t(a31Var, b10, i2Var, x2Var, 6));
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
