package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ p8(ea eaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.a = i7;
        this.b = eaVar;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qp.s1(this.b.a).O3(this.c.updates, false);
                break;
            case 1:
                qp.s1(this.b.a).O3(this.c.updates, false);
                break;
            case 2:
                qp.s1(this.b.a).O3(this.c.updates, false);
                break;
            case 3:
                qp.s1(this.b.a).O3(this.c.updates, false);
                break;
            default:
                qp.s1(this.b.a).O3(this.c.updates, false);
                break;
        }
    }
}
