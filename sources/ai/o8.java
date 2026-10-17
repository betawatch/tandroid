package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ o8(fa faVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = faVar;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$377(this.c.updates, false);
                break;
            case 1:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$377(this.c.updates, false);
                break;
            case 2:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$377(this.c.updates, false);
                break;
            case 3:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$377(this.c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$377(this.c.updates, false);
                break;
        }
    }
}
