package ai;

import android.text.TextUtils;
import bi.r6;
import di.f6;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements p10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(d dVar, boolean[] zArr, long j3, b bVar) {
        this.c = dVar;
        this.d = zArr;
        this.b = j3;
        this.e = bVar;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                boolean[] zArr = (boolean[]) this.d;
                b bVar = (b) this.e;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        org.telegram.messenger.g0.h3(new a1.e(8, bVar, tL_composedMessageWithAI), Math.max(0L, 900 - (System.currentTimeMillis() - this.b)));
                        break;
                    } else {
                        bVar.b(tL_error, null);
                        break;
                    }
                }
                break;
            case 1:
                f6 f6Var = (f6) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                bi.f2 f2Var = (bi.f2) this.e;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    di.p2 p2Var = new di.p2(f6Var, new boolean[1], t1Var, f2Var, this.b, stargiftdepositpayload);
                    di.f2 f2Var2 = new di.f2(1, new Runnable[]{org.telegram.ui.Wallet.v0.D(f6Var.a).k(stargiftdepositpayload, new r6(1, f2Var2, p2Var))}, p2Var);
                    org.telegram.messenger.g0.h3(f2Var2, 5000L);
                    break;
                } else {
                    t1Var.dismiss();
                    new kc(f2Var.c, f6Var.J0).g0(tL_error2, false);
                    break;
                }
            default:
                boolean[] zArr2 = (boolean[]) this.d;
                bi.q2 q2Var = (bi.q2) this.c;
                org.telegram.utils.twidget.d1 d1Var = (org.telegram.utils.twidget.d1) this.e;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.messenger.g0.r(q2Var);
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

    public /* synthetic */ a(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, bi.f2 f2Var, long j3) {
        this.c = f6Var;
        this.d = t1Var;
        this.e = f2Var;
        this.b = j3;
    }

    public /* synthetic */ a(boolean[] zArr, bi.q2 q2Var, org.telegram.utils.twidget.d1 d1Var, long j3) {
        this.d = zArr;
        this.c = q2Var;
        this.e = d1Var;
        this.b = j3;
    }
}
