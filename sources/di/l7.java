package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ l7(x8 x8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.a = i7;
        this.b = x8Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 1:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 2:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 3:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
            default:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
        }
    }
}
