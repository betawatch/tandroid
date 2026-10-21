package org.telegram.ui.Wallet;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
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
                m0 m0Var = (m0) this.c;
                j0 j0Var = (j0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                boolean z10 = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(m0Var.a).getCurrentTime();
                    StringBuilder sb2 = new StringBuilder("received proof challenge, expires at ");
                    i2.e.w(sb2, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb2.append(proofchallenge.expires - currentTime);
                    sb2.append("s");
                    m0.F(sb2.toString());
                    Utilities.stageQueue.postRunnable(new ki.r2(m0Var, z10, j0Var, proofchallenge, currentTime, callback2));
                    break;
                } else {
                    j0Var.close();
                    callback2.run(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                f2 f2Var = (f2) this.c;
                p pVar = (p) this.d;
                b2 b2Var = (b2) this.e;
                boolean z11 = this.b;
                j0 j0Var2 = (j0) obj;
                String str = (String) obj2;
                if (j0Var2 != null && str == null) {
                    j0 b10 = j0Var2.b();
                    x xVar = new x(3, b10, pVar);
                    String str2 = b2Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = b2Var.a;
                    if ("sendTransaction".equals(str2)) {
                        if (MessagesController.getMainSettings(f2Var.a).contains(f2.j(tonconnectsession.id, b2Var.b) + ".transfer")) {
                            f2Var.z(b2Var, b10, xVar);
                            break;
                        }
                    }
                    ai.r3 r3Var = new ai.r3(f2Var, b2Var, xVar, z11, b10);
                    if (!tonconnectsession.closed) {
                        TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                        tonconnectregisterkey.session_id = tonconnectsession.id;
                        tonconnectregisterkey.client_id = tonconnectsession.client_id;
                        f2Var.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new q(xVar, b10, b2Var, r3Var, 6));
                        break;
                    } else {
                        r3Var.run(null);
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
