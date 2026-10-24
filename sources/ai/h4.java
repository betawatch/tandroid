package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ h4(l7 l7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).lambda$processUpdates$377(this.c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.b.currentAccount).lambda$processUpdates$377(this.c.updates, false);
                break;
        }
    }
}
