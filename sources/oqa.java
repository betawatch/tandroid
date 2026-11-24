// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oqa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ oqa(wsa wsaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                oc7.r1(wsaVar.a).T3(tL_payments_paymentResult.updates, false);
                break;
            default:
                oc7.r1(wsaVar.a).T3(tL_payments_paymentResult.updates, false);
                break;
        }
    }
}
