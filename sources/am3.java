// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class am3 implements icc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ am3(dm3 dm3Var, boolean[] zArr, long j, bm3 bm3Var) {
        this.c = dm3Var;
        this.d = zArr;
        this.b = j;
        this.e = bm3Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        byte b = this.a;
        long j = this.b;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj5;
                bm3 bm3Var = (bm3) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((dm3) obj4).b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        hl.d3(new wd3(bm3Var, tL_composedMessageWithAI, (byte) 13), Math.max(0L, 900 - (System.currentTimeMillis() - j)));
                        break;
                    } else {
                        bm3Var.c(tL_error, null);
                        break;
                    }
                }
                break;
            case 1:
                ls6 ls6Var = (ls6) obj4;
                TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) obj5;
                TL_aicompose.inputAiComposeStyle inputaicomposestyle2 = (TL_aicompose.inputAiComposeStyle) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    cc4.d("aicompose.setChatStyle failed: " + tL_error2.text);
                    ls6Var.k();
                    if (ls6.j((TL_aicompose.inputAiComposeStyle) ls6Var.r1.f(j), inputaicomposestyle)) {
                        ls6Var.F1(j, inputaicomposestyle2);
                        break;
                    }
                }
                break;
            case 2:
                wua wuaVar = (wua) obj4;
                id idVar = (id) obj5;
                bx4 bx4Var = (bx4) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    ks5 ks5Var = new ks5(wuaVar, new boolean[1], idVar, bx4Var, this.b, stargiftdepositpayload);
                    ida idaVar = new ida((Object) new Runnable[]{c.C(wuaVar.a).j(stargiftdepositpayload, new ia7(idaVar, ks5Var, (byte) 9))}, (Object) ks5Var, (byte) 10);
                    hl.d3(idaVar, 5000L);
                    break;
                } else {
                    idVar.dismiss();
                    new d31(bx4Var.c, wuaVar.J0).g0(tL_error3, false);
                    break;
                }
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                da7 da7Var = (da7) obj4;
                q0d q0dVar = (q0d) obj3;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    hl.r(da7Var);
                    if (tL_messages_botWidgetQueryAnswer == null) {
                        String str = tL_error4 != null ? tL_error4.text : "";
                        q0dVar.b("WIDGET_RESPONSE_TIMEOUT".equals(str) ? 1 : (str == null || !str.startsWith("FLOOD_WAIT")) ? 3 : 2, null, j);
                        break;
                    } else {
                        q0dVar.b(0, k0d.D(tL_messages_botWidgetQueryAnswer.result), j);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ am3(ls6 ls6Var, long j, TL_aicompose.inputAiComposeStyle inputaicomposestyle, TL_aicompose.inputAiComposeStyle inputaicomposestyle2) {
        this.c = ls6Var;
        this.b = j;
        this.d = inputaicomposestyle;
        this.e = inputaicomposestyle2;
    }

    public /* synthetic */ am3(wua wuaVar, id idVar, bx4 bx4Var, long j) {
        this.c = wuaVar;
        this.d = idVar;
        this.e = bx4Var;
        this.b = j;
    }

    public /* synthetic */ am3(boolean[] zArr, da7 da7Var, q0d q0dVar, long j) {
        this.d = zArr;
        this.c = da7Var;
        this.e = q0dVar;
        this.b = j;
    }
}
