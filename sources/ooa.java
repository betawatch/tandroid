// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ooa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ ooa(vqa vqaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                na7.q1(vqaVar.a).R3(tL_payments_paymentResult.updates, false);
                break;
            default:
                na7.q1(vqaVar.a).R3(tL_payments_paymentResult.updates, false);
                break;
        }
    }
}
