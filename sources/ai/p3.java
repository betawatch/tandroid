package ai;

import android.content.DialogInterface;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p3(k7 k7Var, boolean z10, pf.c cVar, Runnable runnable, DialogInterface dialogInterface) {
        this.c = k7Var;
        this.b = z10;
        this.d = cVar;
        this.e = runnable;
        this.f = dialogInterface;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k7.a1((k7) this.c, this.b, (pf.c) this.d, (Runnable) this.e, (DialogInterface) this.f, (Boolean) obj);
                break;
            default:
                final org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.c;
                final org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
                final org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.e;
                final org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f;
                final byte[] bArr = (byte[]) obj;
                if (!f2Var.i(b2Var) && f2Var.y(b2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = b2Var.a.id;
                    tonconnectclaimrequest.msg_id = b2Var.b;
                    tonconnectclaimrequest.app_request_id = b2Var.d;
                    final boolean z10 = this.b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    f2Var.f.sendRequestTyped(tonconnectclaimrequest, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.v1
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj2, Object obj3) {
                            f2 f2Var2 = f2.this;
                            byte[] bArr2 = bArr;
                            b2 b2Var2 = b2Var;
                            x xVar2 = xVar;
                            boolean z11 = z10;
                            j0 j0Var2 = j0Var;
                            TLRPC.Bool bool = (TLRPC.Bool) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            if (bArr2 != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                                    b2Var2.n = true;
                                }
                                xVar2.run(f2.x(tL_error, "claimRequest"));
                                return;
                            }
                            b2Var2.o = true;
                            if (z11 || b2Var2.l >= 0) {
                                f2Var2.w(b2Var2, j0Var2, null, z11 ? 300 : b2Var2.l, z11 ? "User declined the request" : b2Var2.j, xVar2);
                                return;
                            }
                            if ("disconnect".equals(b2Var2.e)) {
                                f2Var2.w(b2Var2, j0Var2, new JSONObject(), -1, null, xVar2);
                                return;
                            }
                            if ("signData".equals(b2Var2.e)) {
                                if (!f2Var2.y(b2Var2) || f2Var2.i(b2Var2)) {
                                    f2Var2.w(b2Var2, j0Var2, null, 0, "Request expired or wallet changed", xVar2);
                                    return;
                                } else {
                                    Utilities.globalQueue.postRunnable(new c7(f2Var2, j0Var2, b2Var2, xVar2, 9));
                                    return;
                                }
                            }
                            if (!"signMessage".equals(b2Var2.e)) {
                                f2Var2.z(b2Var2, j0Var2, xVar2);
                                return;
                            }
                            WalletEngine2 walletEngine2 = f2Var2.b.b;
                            if (walletEngine2 == null || !f2Var2.y(b2Var2) || f2Var2.i(b2Var2)) {
                                f2Var2.w(b2Var2, j0Var2, null, 0, "Wallet unavailable or request expired", xVar2);
                                return;
                            }
                            walletEngine2.signMessage(j0Var2, b2Var2.f, "ton-connect:" + b2Var2.a.id + ":" + b2Var2.b, new q(f2Var2, b2Var2, j0Var2, xVar2, 8));
                        }
                    });
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    xVar.run("Request expired or wallet changed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p3(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.x xVar, boolean z10, org.telegram.ui.Wallet.j0 j0Var) {
        this.c = f2Var;
        this.d = b2Var;
        this.e = xVar;
        this.b = z10;
        this.f = j0Var;
    }
}
