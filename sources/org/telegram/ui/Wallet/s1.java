package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ft;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Utilities.Callback {
    public final /* synthetic */ d2 a;
    public final /* synthetic */ z1 b;
    public final /* synthetic */ ft c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ h0 e;

    public /* synthetic */ s1(d2 d2Var, z1 z1Var, ft ftVar, boolean z10, h0 h0Var) {
        this.a = d2Var;
        this.b = z1Var;
        this.c = ftVar;
        this.d = z10;
        this.e = h0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        final byte[] bArr = (byte[]) obj;
        final d2 d2Var = this.a;
        final z1 z1Var = this.b;
        boolean i10 = d2Var.i(z1Var);
        final ft ftVar = this.c;
        if (i10 || !d2Var.y(z1Var)) {
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
            ftVar.run("Request expired or wallet changed");
            return;
        }
        TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
        tonconnectclaimrequest.session_id = z1Var.a.id;
        tonconnectclaimrequest.msg_id = z1Var.b;
        tonconnectclaimrequest.app_request_id = z1Var.d;
        final boolean z10 = this.d;
        tonconnectclaimrequest.declined = z10;
        tonconnectclaimrequest.challenge_answer = bArr;
        ConnectionsManager connectionsManager = d2Var.f;
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final h0 h0Var = this.e;
        connectionsManager.sendRequestTyped(tonconnectclaimrequest, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.t1
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj2, Object obj3) {
                d2 d2Var2 = d2.this;
                byte[] bArr2 = bArr;
                z1 z1Var2 = z1Var;
                ft ftVar2 = ftVar;
                boolean z11 = z10;
                h0 h0Var2 = h0Var;
                TLRPC.Bool bool = (TLRPC.Bool) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                if (bArr2 != null) {
                    Arrays.fill(bArr2, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        z1Var2.n = true;
                    }
                    ftVar2.run(d2.x(tL_error, "claimRequest"));
                    return;
                }
                z1Var2.o = true;
                if (z11 || z1Var2.l >= 0) {
                    d2Var2.w(z1Var2, h0Var2, null, z11 ? 300 : z1Var2.l, z11 ? "User declined the request" : z1Var2.j, ftVar2);
                    return;
                }
                if ("disconnect".equals(z1Var2.e)) {
                    d2Var2.w(z1Var2, h0Var2, new JSONObject(), -1, null, ftVar2);
                    return;
                }
                if ("signData".equals(z1Var2.e)) {
                    if (!d2Var2.y(z1Var2) || d2Var2.i(z1Var2)) {
                        d2Var2.w(z1Var2, h0Var2, null, 0, "Request expired or wallet changed", ftVar2);
                        return;
                    } else {
                        Utilities.globalQueue.postRunnable(new m6(d2Var2, h0Var2, z1Var2, ftVar2, 8));
                        return;
                    }
                }
                if (!"signMessage".equals(z1Var2.e)) {
                    d2Var2.z(z1Var2, h0Var2, ftVar2);
                    return;
                }
                WalletEngine2 walletEngine2 = d2Var2.b.b;
                if (walletEngine2 == null || !d2Var2.y(z1Var2) || d2Var2.i(z1Var2)) {
                    d2Var2.w(z1Var2, h0Var2, null, 0, "Wallet unavailable or request expired", ftVar2);
                    return;
                }
                walletEngine2.signMessage(h0Var2, z1Var2.f, "ton-connect:" + z1Var2.a.id + ":" + z1Var2.b, new n(d2Var2, z1Var2, h0Var2, ftVar2, 8));
            }
        });
    }
}
