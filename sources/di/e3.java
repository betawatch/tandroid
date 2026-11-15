package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ e3(c6 c6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np.s1(this.b.a).O3(this.c.updates, false);
                break;
            default:
                np.s1(this.b.a).O3(this.c.updates, false);
                break;
        }
    }
}
