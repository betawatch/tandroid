package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Utilities.Callback {
    public final /* synthetic */ e2 a;
    public final /* synthetic */ a2 b;
    public final /* synthetic */ mt c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ h0 e;

    public /* synthetic */ t1(e2 e2Var, a2 a2Var, mt mtVar, boolean z10, h0 h0Var) {
        this.a = e2Var;
        this.b = a2Var;
        this.c = mtVar;
        this.d = z10;
        this.e = h0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        final byte[] bArr = (byte[]) obj;
        final e2 e2Var = this.a;
        final a2 a2Var = this.b;
        boolean i10 = e2Var.i(a2Var);
        final mt mtVar = this.c;
        if (i10 || !e2Var.y(a2Var)) {
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
            mtVar.run("Request expired or wallet changed");
            return;
        }
        TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
        tonconnectclaimrequest.session_id = a2Var.a.id;
        tonconnectclaimrequest.msg_id = a2Var.b;
        tonconnectclaimrequest.app_request_id = a2Var.d;
        final boolean z10 = this.d;
        tonconnectclaimrequest.declined = z10;
        tonconnectclaimrequest.challenge_answer = bArr;
        ConnectionsManager connectionsManager = e2Var.f;
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final h0 h0Var = this.e;
        connectionsManager.sendRequestTyped(tonconnectclaimrequest, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.u1
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj2, Object obj3) {
                e2 e2Var2 = e2.this;
                byte[] bArr2 = bArr;
                a2 a2Var2 = a2Var;
                mt mtVar2 = mtVar;
                boolean z11 = z10;
                h0 h0Var2 = h0Var;
                TLRPC.Bool bool = (TLRPC.Bool) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                if (bArr2 != null) {
                    Arrays.fill(bArr2, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        a2Var2.n = true;
                    }
                    mtVar2.run(e2.x(tL_error, "claimRequest"));
                    return;
                }
                a2Var2.o = true;
                if (z11 || a2Var2.l >= 0) {
                    e2Var2.w(a2Var2, h0Var2, null, z11 ? 300 : a2Var2.l, z11 ? "User declined the request" : a2Var2.j, mtVar2);
                    return;
                }
                if ("disconnect".equals(a2Var2.e)) {
                    e2Var2.w(a2Var2, h0Var2, new JSONObject(), -1, null, mtVar2);
                    return;
                }
                if ("signData".equals(a2Var2.e)) {
                    if (!e2Var2.y(a2Var2) || e2Var2.i(a2Var2)) {
                        e2Var2.w(a2Var2, h0Var2, null, 0, "Request expired or wallet changed", mtVar2);
                        return;
                    } else {
                        Utilities.globalQueue.postRunnable(new m6(e2Var2, h0Var2, a2Var2, mtVar2, 8));
                        return;
                    }
                }
                if (!"signMessage".equals(a2Var2.e)) {
                    e2Var2.z(a2Var2, h0Var2, mtVar2);
                    return;
                }
                WalletEngine2 walletEngine2 = e2Var2.b.b;
                if (walletEngine2 == null || !e2Var2.y(a2Var2) || e2Var2.i(a2Var2)) {
                    e2Var2.w(a2Var2, h0Var2, null, 0, "Wallet unavailable or request expired", mtVar2);
                    return;
                }
                walletEngine2.signMessage(h0Var2, a2Var2.f, "ton-connect:" + a2Var2.a.id + ":" + a2Var2.b, new o(e2Var2, a2Var2, h0Var2, mtVar2, 8));
            }
        });
    }
}
