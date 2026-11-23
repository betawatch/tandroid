package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ l7(y8 y8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.a = i7;
        this.b = y8Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 1:
                np.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 2:
                np.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 3:
                np.u1(this.b.a).V3(this.c.updates, false);
                break;
            default:
                np.u1(this.b.a).V3(this.c.updates, false);
                break;
        }
    }
}
