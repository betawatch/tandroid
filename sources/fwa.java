// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fwa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jxa b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ fwa(jxa jxaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = jxaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        jxa jxaVar = this.b;
        switch (b) {
            case 0:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                break;
            case 1:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                break;
            case 2:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                break;
            case 3:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                break;
            default:
                uc7.s1(jxaVar.a).Y3(tL_payments_paymentResult.updates, false);
                break;
        }
    }
}
