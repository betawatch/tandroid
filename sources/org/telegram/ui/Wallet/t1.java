package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements n10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t1(c2 c2Var, byte[] bArr, y1 y1Var, e51 e51Var, boolean z10, h0 h0Var) {
        this.d = c2Var;
        this.c = bArr;
        this.e = y1Var;
        this.f = e51Var;
        this.b = z10;
        this.g = h0Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                c2 c2Var = (c2) this.d;
                byte[] bArr = this.c;
                y1 y1Var = (y1) this.e;
                e51 e51Var = (e51) this.f;
                boolean z10 = this.b;
                h0 h0Var = (h0) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        y1Var.n = true;
                    }
                    e51Var.a(c2.z(tL_error, "claimRequest"));
                    break;
                } else {
                    y1Var.o = true;
                    if (!z10 && y1Var.l < 0) {
                        if (!"disconnect".equals(y1Var.e)) {
                            if (!"signData".equals(y1Var.e)) {
                                if (!"signMessage".equals(y1Var.e)) {
                                    c2Var.B(y1Var, h0Var, e51Var);
                                    break;
                                } else {
                                    WalletEngine2 walletEngine2 = c2Var.b.b;
                                    if (walletEngine2 != null && c2Var.A(y1Var) && !c2Var.j(y1Var)) {
                                        walletEngine2.signMessage(h0Var, y1Var.f, "ton-connect:" + y1Var.a.id + ":" + y1Var.b, new q(c2Var, y1Var, h0Var, e51Var, 8));
                                        break;
                                    } else {
                                        c2Var.y(y1Var, h0Var, null, 0, "Wallet unavailable or request expired", e51Var);
                                        break;
                                    }
                                }
                            } else if (c2Var.A(y1Var) && !c2Var.j(y1Var)) {
                                Utilities.e.c(new e7(c2Var, h0Var, y1Var, e51Var, 9));
                                break;
                            } else {
                                c2Var.y(y1Var, h0Var, null, 0, "Request expired or wallet changed", e51Var);
                                break;
                            }
                        } else {
                            c2Var.y(y1Var, h0Var, new JSONObject(), -1, null, e51Var);
                            break;
                        }
                    } else {
                        c2Var.y(y1Var, h0Var, null, z10 ? hs.X4 : y1Var.l, z10 ? "User declined the request" : y1Var.j, e51Var);
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

    public /* synthetic */ t1(boolean z10, org.telegram.utils.twidget.m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.i iVar) {
        this.b = z10;
        this.d = mVar;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = iVar;
    }
}
