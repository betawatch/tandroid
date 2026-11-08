package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements v10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v1(e2 e2Var, byte[] bArr, a2 a2Var, t tVar, boolean z9, j0 j0Var) {
        this.d = e2Var;
        this.c = bArr;
        this.e = a2Var;
        this.f = tVar;
        this.b = z9;
        this.g = j0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.d;
                byte[] bArr = this.c;
                a2 a2Var = (a2) this.e;
                t tVar = (t) this.f;
                boolean z9 = this.b;
                j0 j0Var = (j0) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        a2Var.n = true;
                    }
                    tVar.a(e2.z(tL_error, "claimRequest"));
                    break;
                } else {
                    a2Var.o = true;
                    if (!z9 && a2Var.l < 0) {
                        if (!"disconnect".equals(a2Var.e)) {
                            if (!"signData".equals(a2Var.e)) {
                                if (!"signMessage".equals(a2Var.e)) {
                                    e2Var.B(a2Var, j0Var, tVar);
                                    break;
                                } else {
                                    WalletEngine2 walletEngine2 = e2Var.b.b;
                                    if (walletEngine2 != null && e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                        walletEngine2.signMessage(j0Var, a2Var.f, "ton-connect:" + a2Var.a.id + ":" + a2Var.b, new r(e2Var, a2Var, j0Var, tVar, 8));
                                        break;
                                    } else {
                                        e2Var.y(a2Var, j0Var, null, 0, "Wallet unavailable or request expired", tVar);
                                        break;
                                    }
                                }
                            } else if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                Utilities.e.c(new f7(e2Var, j0Var, a2Var, tVar, 9));
                                break;
                            } else {
                                e2Var.y(a2Var, j0Var, null, 0, "Request expired or wallet changed", tVar);
                                break;
                            }
                        } else {
                            e2Var.y(a2Var, j0Var, new JSONObject(), -1, null, tVar);
                            break;
                        }
                    } else {
                        e2Var.y(a2Var, j0Var, null, z9 ? qs.X4 : a2Var.l, z9 ? "User declined the request" : a2Var.j, tVar);
                        break;
                    }
                }
                break;
            default:
                boolean z10 = this.b;
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.c;
                int[] iArr = (int[]) this.f;
                org.telegram.utils.twidget.g0 g0Var = (org.telegram.utils.twidget.g0) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z10 && tL_error2 != null && (str = tL_error2.text) != null && (str.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.k[k0Var.b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, g0Var);
                    break;
                } else {
                    g0Var.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                    break;
                }
        }
    }

    public /* synthetic */ v1(boolean z9, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.g0 g0Var) {
        this.b = z9;
        this.d = k0Var;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = g0Var;
    }
}
