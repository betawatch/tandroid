package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ c4(k7 k7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qp.s1(this.b.a).O3(this.c.updates, false);
                break;
            default:
                qp.s1(this.b.a).O3(this.c.updates, false);
                break;
        }
    }
}
