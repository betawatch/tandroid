// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                break;
            case 1:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                break;
            case 2:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                break;
            case 3:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                break;
            default:
                na7.q1(gtaVar.a).R3(tL_payments_paymentResult.updates, false);
                break;
        }
    }
}
