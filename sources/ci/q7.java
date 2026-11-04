package ci;

import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ q7(e9 e9Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i3) {
        this.a = i3;
        this.b = e9Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hp.s1(this.b.a).O3(this.c.updates, false);
                break;
            case 1:
                hp.s1(this.b.a).O3(this.c.updates, false);
                break;
            case 2:
                hp.s1(this.b.a).O3(this.c.updates, false);
                break;
            case 3:
                hp.s1(this.b.a).O3(this.c.updates, false);
                break;
            default:
                hp.s1(this.b.a).O3(this.c.updates, false);
                break;
        }
    }
}
