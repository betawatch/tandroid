package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.c;
                h0 h0Var = (h0) this.d;
                n10 n10Var = (n10) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(k0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    com.google.android.recaptcha.internal.a.r(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    k0.H(sb2.toString());
                    Utilities.d.c(new mi.q2(k0Var, z10, h0Var, proofchallenge, currentTime, n10Var));
                    break;
                } else {
                    h0Var.close();
                    n10Var.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                c2 c2Var = (c2) this.c;
                m mVar = (m) this.d;
                y1 y1Var = (y1) this.e;
                boolean z11 = this.b;
                h0 h0Var2 = (h0) obj;
                String str = (String) obj2;
                if (h0Var2 != null && str == null) {
                    h0 b10 = h0Var2.b();
                    e51 e51Var = new e51(10, b10, mVar);
                    String str2 = y1Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = y1Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (hp.s1(c2Var.a).e7.contains(c2.l(tonconnectsession.id, y1Var.b) + ".transfer")) {
                            c2Var.B(y1Var, b10, e51Var);
                            break;
                        }
                    }
                    ci.a3 a3Var = new ci.a3(c2Var, y1Var, e51Var, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        c2Var.f.sendRequestTyped(tonconnectregisterkey, new c3.b(1), new q(e51Var, b10, y1Var, a3Var, 6));
                        break;
                    } else {
                        a3Var.a(null);
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
