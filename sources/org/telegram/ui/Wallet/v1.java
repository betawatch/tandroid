package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d01;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements k20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v1(e2 e2Var, byte[] bArr, a2 a2Var, d01 d01Var, boolean z10, h0 h0Var) {
        this.d = e2Var;
        this.c = bArr;
        this.e = a2Var;
        this.f = d01Var;
        this.b = z10;
        this.g = h0Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.d;
                byte[] bArr = this.c;
                a2 a2Var = (a2) this.e;
                d01 d01Var = (d01) this.f;
                boolean z10 = this.b;
                h0 h0Var = (h0) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        a2Var.n = true;
                    }
                    d01Var.a(e2.z(tL_error, "claimRequest"));
                    break;
                } else {
                    a2Var.o = true;
                    if (!z10 && a2Var.l < 0) {
                        if (!"disconnect".equals(a2Var.e)) {
                            if (!"signData".equals(a2Var.e)) {
                                if (!"signMessage".equals(a2Var.e)) {
                                    e2Var.B(a2Var, h0Var, d01Var);
                                    break;
                                } else {
                                    WalletEngine2 walletEngine2 = e2Var.b.b;
                                    if (walletEngine2 != null && e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                        walletEngine2.signMessage(h0Var, a2Var.f, "ton-connect:" + a2Var.a.id + ":" + a2Var.b, new q(e2Var, a2Var, h0Var, d01Var, 8));
                                        break;
                                    } else {
                                        e2Var.y(a2Var, h0Var, null, 0, "Wallet unavailable or request expired", d01Var);
                                        break;
                                    }
                                }
                            } else if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                Utilities.e.c(new k7(e2Var, h0Var, a2Var, d01Var, 9));
                                break;
                            } else {
                                e2Var.y(a2Var, h0Var, null, 0, "Request expired or wallet changed", d01Var);
                                break;
                            }
                        } else {
                            e2Var.y(a2Var, h0Var, new JSONObject(), -1, null, d01Var);
                            break;
                        }
                    } else {
                        e2Var.y(a2Var, h0Var, null, z10 ? at.X4 : a2Var.l, z10 ? "User declined the request" : a2Var.j, d01Var);
                        break;
                    }
                }
                break;
            default:
                boolean z11 = this.b;
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.c;
                int[] iArr = (int[]) this.f;
                org.telegram.utils.twidget.i iVar = (org.telegram.utils.twidget.i) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str = tL_error2.text) != null && (str.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.p.k[mVar.b] = true;
                    org.telegram.utils.twidget.p.w(mVar, widgetQueryType, bArr2, iArr, iVar);
                    break;
                } else {
                    iVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                    break;
                }
        }
    }

    public /* synthetic */ v1(boolean z10, org.telegram.utils.twidget.m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.i iVar) {
        this.b = z10;
        this.d = mVar;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = iVar;
    }
}
