package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements v10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w1(f2 f2Var, byte[] bArr, b2 b2Var, t tVar, boolean z9, k0 k0Var) {
        this.d = f2Var;
        this.c = bArr;
        this.e = b2Var;
        this.f = tVar;
        this.b = z9;
        this.g = k0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.d;
                byte[] bArr = this.c;
                b2 b2Var = (b2) this.e;
                t tVar = (t) this.f;
                boolean z9 = this.b;
                k0 k0Var = (k0) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        b2Var.n = true;
                    }
                    tVar.a(f2.z(tL_error, "claimRequest"));
                    break;
                } else {
                    b2Var.o = true;
                    if (!z9 && b2Var.l < 0) {
                        if (!"disconnect".equals(b2Var.e)) {
                            if (!"signData".equals(b2Var.e)) {
                                if (!"signMessage".equals(b2Var.e)) {
                                    f2Var.B(b2Var, k0Var, tVar);
                                    break;
                                } else {
                                    WalletEngine2 walletEngine2 = f2Var.b.b;
                                    if (walletEngine2 != null && f2Var.A(b2Var) && !f2Var.j(b2Var)) {
                                        walletEngine2.signMessage(k0Var, b2Var.f, "ton-connect:" + b2Var.a.id + ":" + b2Var.b, new r(f2Var, b2Var, k0Var, tVar, 8));
                                        break;
                                    } else {
                                        f2Var.y(b2Var, k0Var, null, 0, "Wallet unavailable or request expired", tVar);
                                        break;
                                    }
                                }
                            } else if (f2Var.A(b2Var) && !f2Var.j(b2Var)) {
                                Utilities.e.c(new g7(f2Var, k0Var, b2Var, tVar, 9));
                                break;
                            } else {
                                f2Var.y(b2Var, k0Var, null, 0, "Request expired or wallet changed", tVar);
                                break;
                            }
                        } else {
                            f2Var.y(b2Var, k0Var, new JSONObject(), -1, null, tVar);
                            break;
                        }
                    } else {
                        f2Var.y(b2Var, k0Var, null, z9 ? qs.X4 : b2Var.l, z9 ? "User declined the request" : b2Var.j, tVar);
                        break;
                    }
                }
                break;
            default:
                boolean z10 = this.b;
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.c;
                int[] iArr = (int[]) this.f;
                org.telegram.utils.twidget.i iVar = (org.telegram.utils.twidget.i) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z10 && tL_error2 != null && (str = tL_error2.text) != null && (str.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.p.k[mVar.b] = true;
                    org.telegram.utils.twidget.p.w(mVar, widgetQueryType, bArr2, iArr, iVar);
                    break;
                } else {
                    iVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                    break;
                }
        }
    }

    public /* synthetic */ w1(boolean z9, org.telegram.utils.twidget.m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, org.telegram.utils.twidget.i iVar) {
        this.b = z9;
        this.d = mVar;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = iVar;
    }
}
