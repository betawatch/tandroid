package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements s10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u1(d2 d2Var, byte[] bArr, z1 z1Var, x21 x21Var, boolean z10, i0 i0Var) {
        this.d = d2Var;
        this.c = bArr;
        this.e = z1Var;
        this.f = x21Var;
        this.b = z10;
        this.g = i0Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.d;
                byte[] bArr = this.c;
                z1 z1Var = (z1) this.e;
                x21 x21Var = (x21) this.f;
                boolean z10 = this.b;
                i0 i0Var = (i0) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        z1Var.n = true;
                    }
                    x21Var.a(d2.z(tL_error, "claimRequest"));
                    break;
                } else {
                    z1Var.o = true;
                    if (!z10 && z1Var.l < 0) {
                        if (!"disconnect".equals(z1Var.e)) {
                            if (!"signData".equals(z1Var.e)) {
                                if (!"signMessage".equals(z1Var.e)) {
                                    d2Var.B(z1Var, i0Var, x21Var);
                                    break;
                                } else {
                                    WalletEngine2 walletEngine2 = d2Var.b.b;
                                    if (walletEngine2 != null && d2Var.A(z1Var) && !d2Var.j(z1Var)) {
                                        walletEngine2.signMessage(i0Var, z1Var.f, "ton-connect:" + z1Var.a.id + ":" + z1Var.b, new q(d2Var, z1Var, i0Var, x21Var, 8));
                                        break;
                                    } else {
                                        d2Var.y(z1Var, i0Var, null, 0, "Wallet unavailable or request expired", x21Var);
                                        break;
                                    }
                                }
                            } else if (d2Var.A(z1Var) && !d2Var.j(z1Var)) {
                                Utilities.e.c(new g7(d2Var, i0Var, z1Var, x21Var, 9));
                                break;
                            } else {
                                d2Var.y(z1Var, i0Var, null, 0, "Request expired or wallet changed", x21Var);
                                break;
                            }
                        } else {
                            d2Var.y(z1Var, i0Var, new JSONObject(), -1, null, x21Var);
                            break;
                        }
                    } else {
                        d2Var.y(z1Var, i0Var, null, z10 ? ns.X4 : z1Var.l, z10 ? "User declined the request" : z1Var.j, x21Var);
                        break;
                    }
                }
                break;
            default:
                boolean z11 = this.b;
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.c;
                int[] iArr = (int[]) this.f;
                org.telegram.utils.twidget.g0 g0Var = (org.telegram.utils.twidget.g0) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str = tL_error2.text) != null && (str.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.k[k0Var.b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, g0Var);
                    break;
                } else {
                    g0Var.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                    break;
                }
        }
    }

    public /* synthetic */ u1(boolean z10, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.g0 g0Var) {
        this.b = z10;
        this.d = k0Var;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = g0Var;
    }
}
