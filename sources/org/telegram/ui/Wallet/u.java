package org.telegram.ui.Wallet;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
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
                j0 j0Var = (j0) this.c;
                g0 g0Var = (g0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(j0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    i2.d.u(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    j0.E(sb2.toString());
                    Utilities.stageQueue.postRunnable(new ji.r2(j0Var, z10, g0Var, proofchallenge, currentTime, callback2));
                    break;
                } else {
                    g0Var.close();
                    callback2.run(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                d2 d2Var = (d2) this.c;
                o oVar = (o) this.d;
                z1 z1Var = (z1) this.e;
                boolean z11 = this.b;
                g0 g0Var2 = (g0) obj;
                String str = (String) obj2;
                if (g0Var2 != null && str == null) {
                    g0 b10 = g0Var2.b();
                    mt mtVar = new mt(26, b10, oVar);
                    String str2 = z1Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = z1Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (MessagesController.getMainSettings(d2Var.a).contains(d2.j(tonconnectsession.id, z1Var.b) + ".transfer")) {
                            d2Var.z(z1Var, b10, mtVar);
                            break;
                        }
                    }
                    s1 s1Var = new s1(d2Var, z1Var, mtVar, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        d2Var.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new n(mtVar, b10, z1Var, s1Var, 6));
                        break;
                    } else {
                        s1Var.run(null);
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
