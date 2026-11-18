package ai;

import android.text.TextUtils;
import bi.l6;
import di.f6;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(h hVar, boolean[] zArr, long j3, f fVar) {
        this.c = hVar;
        this.d = zArr;
        this.b = j3;
        this.e = fVar;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                boolean[] zArr = (boolean[]) this.d;
                f fVar = (f) this.e;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                hVar.b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        org.telegram.messenger.g0.h3(new a1.e(10, fVar, tL_composedMessageWithAI), Math.max(0L, 900 - (System.currentTimeMillis() - this.b)));
                        break;
                    } else {
                        fVar.c(tL_error, null);
                        break;
                    }
                }
                break;
            case 1:
                f6 f6Var = (f6) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                bi.a2 a2Var = (bi.a2) this.e;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    di.o2 o2Var = new di.o2(f6Var, new boolean[1], u1Var, a2Var, this.b, stargiftdepositpayload);
                    c1.c cVar = new c1.c(29, new Runnable[]{org.telegram.ui.Wallet.u0.D(f6Var.a).k(stargiftdepositpayload, new l6(1, cVar, o2Var))}, o2Var);
                    org.telegram.messenger.g0.h3(cVar, 5000L);
                    break;
                } else {
                    u1Var.dismiss();
                    new lc(a2Var.c, f6Var.J0).g0(tL_error2, false);
                    break;
                }
            default:
                boolean[] zArr2 = (boolean[]) this.d;
                bi.k2 k2Var = (bi.k2) this.c;
                org.telegram.utils.twidget.d1 d1Var = (org.telegram.utils.twidget.d1) this.e;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.messenger.g0.r(k2Var);
                    long j3 = this.b;
                    if (tL_messages_botWidgetQueryAnswer == null) {
                        String str = tL_error3 != null ? tL_error3.text : "";
                        d1Var.b("WIDGET_RESPONSE_TIMEOUT".equals(str) ? 1 : (str == null || !str.startsWith("FLOOD_WAIT")) ? 3 : 2, null, j3);
                        break;
                    } else {
                        d1Var.b(0, org.telegram.utils.twidget.n0.C(tL_messages_botWidgetQueryAnswer.result), j3);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e(f6 f6Var, org.telegram.ui.ActionBar.u1 u1Var, bi.a2 a2Var, long j3) {
        this.c = f6Var;
        this.d = u1Var;
        this.e = a2Var;
        this.b = j3;
    }

    public /* synthetic */ e(boolean[] zArr, bi.k2 k2Var, org.telegram.utils.twidget.d1 d1Var, long j3) {
        this.d = zArr;
        this.c = k2Var;
        this.e = d1Var;
        this.b = j3;
    }
}
