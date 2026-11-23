package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements r10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c2(l2 l2Var, byte[] bArr, h2 h2Var, p51 p51Var, boolean z10, r0 r0Var) {
        this.d = l2Var;
        this.c = bArr;
        this.e = h2Var;
        this.f = p51Var;
        this.b = z10;
        this.g = r0Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                l2 l2Var = (l2) this.d;
                byte[] bArr = this.c;
                h2 h2Var = (h2) this.e;
                p51 p51Var = (p51) this.f;
                boolean z10 = this.b;
                r0 r0Var = (r0) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        h2Var.n = true;
                    }
                    p51Var.a(l2.z(tL_error, "claimRequest"));
                    break;
                } else {
                    h2Var.o = true;
                    if (!z10 && h2Var.l < 0) {
                        if (!"disconnect".equals(h2Var.e)) {
                            if (!"signData".equals(h2Var.e)) {
                                if (!"signMessage".equals(h2Var.e)) {
                                    l2Var.B(h2Var, r0Var, p51Var);
                                    break;
                                } else {
                                    WalletEngine2 walletEngine2 = l2Var.b.b;
                                    if (walletEngine2 != null && l2Var.A(h2Var) && !l2Var.j(h2Var)) {
                                        walletEngine2.signMessage(r0Var, h2Var.f, "ton-connect:" + h2Var.a.id + ":" + h2Var.b, new s(l2Var, h2Var, r0Var, p51Var, 8));
                                        break;
                                    } else {
                                        l2Var.y(h2Var, r0Var, null, 0, "Wallet unavailable or request expired", p51Var);
                                        break;
                                    }
                                }
                            } else if (l2Var.A(h2Var) && !l2Var.j(h2Var)) {
                                Utilities.e.c(new v7(l2Var, r0Var, h2Var, p51Var, 8));
                                break;
                            } else {
                                l2Var.y(h2Var, r0Var, null, 0, "Request expired or wallet changed", p51Var);
                                break;
                            }
                        } else {
                            l2Var.y(h2Var, r0Var, new JSONObject(), -1, null, p51Var);
                            break;
                        }
                    } else {
                        l2Var.y(h2Var, r0Var, null, z10 ? ls.X4 : h2Var.l, z10 ? "User declined the request" : h2Var.j, p51Var);
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
                ai.e eVar = (ai.e) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str = tL_error2.text) != null && (str.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.k[k0Var.b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, eVar);
                    break;
                } else {
                    eVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                    break;
                }
        }
    }

    public /* synthetic */ c2(boolean z10, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, ai.e eVar) {
        this.b = z10;
        this.d = k0Var;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = eVar;
    }
}
