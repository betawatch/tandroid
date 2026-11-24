// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class il3 implements i8c {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ il3(ll3 ll3Var, boolean[] zArr, long j, jl3 jl3Var) {
        this.c = ll3Var;
        this.d = zArr;
        this.b = j;
        this.e = jl3Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        byte b = this.a;
        byte b2 = 14;
        long j = this.b;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj5;
                jl3 jl3Var = (jl3) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((ll3) obj4).b = -1;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        gl.d3(new wc3(jl3Var, tL_composedMessageWithAI, b2), Math.max(0L, 900 - (System.currentTimeMillis() - j)));
                        break;
                    } else {
                        jl3Var.c(tL_error, null);
                        break;
                    }
                }
                break;
            case 1:
                hq6 hq6Var = (hq6) obj4;
                TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) obj5;
                TL_aicompose.inputAiComposeStyle inputaicomposestyle2 = (TL_aicompose.inputAiComposeStyle) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    fa4.d("aicompose.setChatStyle failed: " + tL_error2.text);
                    hq6Var.k();
                    if (hq6.j((TL_aicompose.inputAiComposeStyle) hq6Var.r1.f(j), inputaicomposestyle)) {
                        hq6Var.F1(j, inputaicomposestyle2);
                        break;
                    }
                }
                break;
            case 2:
                vqa vqaVar = (vqa) obj4;
                hd hdVar = (hd) obj5;
                xu4 xu4Var = (xu4) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload != null) {
                    jq5 jq5Var = new jq5(vqaVar, new boolean[1], hdVar, xu4Var, this.b, stargiftdepositpayload);
                    t7a t7aVar = new t7a(new Runnable[]{c.C(vqaVar.a).j(stargiftdepositpayload, new w77(t7aVar, jq5Var, (byte) 9))}, jq5Var, b2);
                    gl.d3(t7aVar, 5000L);
                    break;
                } else {
                    hdVar.dismiss();
                    new u21(xu4Var.c, vqaVar.J0).g0(tL_error3, false);
                    break;
                }
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                o77 o77Var = (o77) obj4;
                bwc bwcVar = (bwc) obj3;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    gl.r(o77Var);
                    if (tL_messages_botWidgetQueryAnswer == null) {
                        String str = tL_error4 != null ? tL_error4.text : "";
                        bwcVar.b("WIDGET_RESPONSE_TIMEOUT".equals(str) ? 1 : (str == null || !str.startsWith("FLOOD_WAIT")) ? 3 : 2, null, j);
                        break;
                    } else {
                        bwcVar.b(0, vvc.C(tL_messages_botWidgetQueryAnswer.result), j);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ il3(hq6 hq6Var, long j, TL_aicompose.inputAiComposeStyle inputaicomposestyle, TL_aicompose.inputAiComposeStyle inputaicomposestyle2) {
        this.c = hq6Var;
        this.b = j;
        this.d = inputaicomposestyle;
        this.e = inputaicomposestyle2;
    }

    public /* synthetic */ il3(vqa vqaVar, hd hdVar, xu4 xu4Var, long j) {
        this.c = vqaVar;
        this.d = hdVar;
        this.e = xu4Var;
        this.b = j;
    }

    public /* synthetic */ il3(boolean[] zArr, o77 o77Var, bwc bwcVar, long j) {
        this.d = zArr;
        this.c = o77Var;
        this.e = bwcVar;
        this.b = j;
    }
}
