package ci;

import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ n3(l6 l6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hp.s1(this.b.a).O3(this.c.updates, false);
                break;
            default:
                hp.s1(this.b.a).O3(this.c.updates, false);
                break;
        }
    }
}
