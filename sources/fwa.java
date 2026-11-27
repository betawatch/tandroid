// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
