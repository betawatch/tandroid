package ai;

import android.content.DialogInterface;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r3(l7 l7Var, boolean z10, pf.c cVar, Runnable runnable, DialogInterface dialogInterface) {
        this.c = l7Var;
        this.b = z10;
        this.d = cVar;
        this.e = runnable;
        this.f = dialogInterface;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l7.T0((l7) this.c, this.b, (pf.c) this.d, (Runnable) this.e, (DialogInterface) this.f, (Boolean) obj);
                break;
            default:
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.c;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.d;
                final org.telegram.ui.Wallet.w wVar = (org.telegram.ui.Wallet.w) this.e;
                final org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f;
                final byte[] bArr = (byte[]) obj;
                if (!e2Var.i(a2Var) && e2Var.y(a2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = a2Var.a.id;
                    tonconnectclaimrequest.msg_id = a2Var.b;
                    tonconnectclaimrequest.app_request_id = a2Var.d;
                    final boolean z10 = this.b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    e2Var.f.sendRequestTyped(tonconnectclaimrequest, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Wallet.u1
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj2, Object obj3) {
                            e2 e2Var2 = e2.this;
                            byte[] bArr2 = bArr;
                            a2 a2Var2 = a2Var;
                            w wVar2 = wVar;
                            boolean z11 = z10;
                            i0 i0Var2 = i0Var;
                            TLRPC.Bool bool = (TLRPC.Bool) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            if (bArr2 != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                                if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                                    a2Var2.n = true;
                                }
                                wVar2.run(e2.x(tL_error, "claimRequest"));
                                return;
                            }
                            a2Var2.o = true;
                            if (z11 || a2Var2.l >= 0) {
                                e2Var2.w(a2Var2, i0Var2, null, z11 ? 300 : a2Var2.l, z11 ? "User declined the request" : a2Var2.j, wVar2);
                                return;
                            }
                            if ("disconnect".equals(a2Var2.e)) {
                                e2Var2.w(a2Var2, i0Var2, new JSONObject(), -1, null, wVar2);
                                return;
                            }
                            if ("signData".equals(a2Var2.e)) {
                                if (!e2Var2.y(a2Var2) || e2Var2.i(a2Var2)) {
                                    e2Var2.w(a2Var2, i0Var2, null, 0, "Request expired or wallet changed", wVar2);
                                    return;
                                } else {
                                    Utilities.globalQueue.postRunnable(new w6(e2Var2, i0Var2, a2Var2, wVar2, 9));
                                    return;
                                }
                            }
                            if (!"signMessage".equals(a2Var2.e)) {
                                e2Var2.z(a2Var2, i0Var2, wVar2);
                                return;
                            }
                            WalletEngine2 walletEngine2 = e2Var2.b.b;
                            if (walletEngine2 == null || !e2Var2.y(a2Var2) || e2Var2.i(a2Var2)) {
                                e2Var2.w(a2Var2, i0Var2, null, 0, "Wallet unavailable or request expired", wVar2);
                                return;
                            }
                            walletEngine2.signMessage(i0Var2, a2Var2.f, "ton-connect:" + a2Var2.a.id + ":" + a2Var2.b, new p(e2Var2, a2Var2, i0Var2, wVar2, 8));
                        }
                    });
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    wVar.run("Request expired or wallet changed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ r3(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.w wVar, boolean z10, org.telegram.ui.Wallet.i0 i0Var) {
        this.c = e2Var;
        this.d = a2Var;
        this.e = wVar;
        this.b = z10;
        this.f = i0Var;
    }
}
