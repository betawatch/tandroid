package org.telegram.ui.Wallet;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements p10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d2(m2 m2Var, byte[] bArr, i2 i2Var, a31 a31Var, boolean z10, s0 s0Var) {
        this.d = m2Var;
        this.c = bArr;
        this.e = i2Var;
        this.f = a31Var;
        this.b = z10;
        this.g = s0Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                m2 m2Var = (m2) this.d;
                byte[] bArr = this.c;
                i2 i2Var = (i2) this.e;
                a31 a31Var = (a31) this.f;
                boolean z10 = this.b;
                s0 s0Var = (s0) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                        i2Var.n = true;
                    }
                    a31Var.a(m2.z(tL_error, "claimRequest"));
                    break;
                } else {
                    i2Var.o = true;
                    if (!z10 && i2Var.l < 0) {
                        if (!"disconnect".equals(i2Var.e)) {
                            if (!"signData".equals(i2Var.e)) {
                                if (!"signMessage".equals(i2Var.e)) {
                                    m2Var.B(i2Var, s0Var, a31Var);
                                    break;
                                } else {
                                    WalletEngine2 walletEngine2 = m2Var.b.b;
                                    if (walletEngine2 != null && m2Var.A(i2Var) && !m2Var.j(i2Var)) {
                                        walletEngine2.signMessage(s0Var, i2Var.f, "ton-connect:" + i2Var.a.id + ":" + i2Var.b, new t(m2Var, i2Var, s0Var, a31Var, 8));
                                        break;
                                    } else {
                                        m2Var.y(i2Var, s0Var, null, 0, "Wallet unavailable or request expired", a31Var);
                                        break;
                                    }
                                }
                            } else if (m2Var.A(i2Var) && !m2Var.j(i2Var)) {
                                Utilities.e.c(new w7(m2Var, s0Var, i2Var, a31Var, 8));
                                break;
                            } else {
                                m2Var.y(i2Var, s0Var, null, 0, "Request expired or wallet changed", a31Var);
                                break;
                            }
                        } else {
                            m2Var.y(i2Var, s0Var, new JSONObject(), -1, null, a31Var);
                            break;
                        }
                    } else {
                        m2Var.y(i2Var, s0Var, null, z10 ? ks.X4 : i2Var.l, z10 ? "User declined the request" : i2Var.j, a31Var);
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
                ai.a aVar = (ai.a) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z11 && tL_error2 != null && (str = tL_error2.text) != null && (str.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    org.telegram.utils.twidget.n0.k[k0Var.b] = true;
                    org.telegram.utils.twidget.n0.y(k0Var, widgetQueryType, bArr2, iArr, aVar);
                    break;
                } else {
                    aVar.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                    break;
                }
        }
    }

    public /* synthetic */ d2(boolean z10, org.telegram.utils.twidget.k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, ai.a aVar) {
        this.b = z10;
        this.d = k0Var;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = aVar;
    }
}
