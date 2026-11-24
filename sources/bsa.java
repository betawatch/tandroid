// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bsa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gta b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ bsa(gta gtaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = gtaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        gta gtaVar = this.b;
        switch (b) {
            case 0:
                na7.q1(gtaVar.a).Q3(tL_payments_paymentResult.updates, false);
                break;
            case 1:
                na7.q1(gtaVar.a).Q3(tL_payments_paymentResult.updates, false);
                break;
            case 2:
                na7.q1(gtaVar.a).Q3(tL_payments_paymentResult.updates, false);
                break;
            case 3:
                na7.q1(gtaVar.a).Q3(tL_payments_paymentResult.updates, false);
                break;
            default:
                na7.q1(gtaVar.a).Q3(tL_payments_paymentResult.updates, false);
                break;
        }
    }
}
