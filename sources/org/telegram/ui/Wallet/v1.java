package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements j20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v1(e2 e2Var, byte[] bArr, a2 a2Var, f11 f11Var, boolean z10, h0 h0Var) {
        this.d = e2Var;
        this.c = bArr;
        this.e = a2Var;
        this.f = f11Var;
        this.b = z10;
        this.g = h0Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.d;
                byte[] bArr = this.c;
                a2 a2Var = (a2) this.e;
                f11 f11Var = (f11) this.f;
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
                    f11Var.a(e2.z(tL_error, "claimRequest"));
                    break;
                } else {
                    a2Var.o = true;
                    if (!z10 && a2Var.l < 0) {
                        if (!"disconnect".equals(a2Var.e)) {
                            if (!"signData".equals(a2Var.e)) {
                                if (!"signMessage".equals(a2Var.e)) {
                                    e2Var.B(a2Var, h0Var, f11Var);
                                    break;
                                } else {
                                    WalletEngine2 walletEngine2 = e2Var.b.b;
                                    if (walletEngine2 != null && e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                        walletEngine2.signMessage(h0Var, a2Var.f, "ton-connect:" + a2Var.a.id + ":" + a2Var.b, new q(e2Var, a2Var, h0Var, f11Var, 8));
                                        break;
                                    } else {
                                        e2Var.y(a2Var, h0Var, null, 0, "Wallet unavailable or request expired", f11Var);
                                        break;
                                    }
                                }
                            } else if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                                Utilities.e.c(new k7(e2Var, h0Var, a2Var, f11Var, 9));
                                break;
                            } else {
                                e2Var.y(a2Var, h0Var, null, 0, "Request expired or wallet changed", f11Var);
                                break;
                            }
                        } else {
                            e2Var.y(a2Var, h0Var, new JSONObject(), -1, null, f11Var);
                            break;
                        }
                    } else {
                        e2Var.y(a2Var, h0Var, null, z10 ? zs.X4 : a2Var.l, z10 ? "User declined the request" : a2Var.j, f11Var);
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
