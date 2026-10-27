package bi;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ l8(ca caVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = caVar;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$379(this.c.updates, false);
                break;
            case 1:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$379(this.c.updates, false);
                break;
            case 2:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$379(this.c.updates, false);
                break;
            case 3:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$379(this.c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.b.a).lambda$processUpdates$379(this.c.updates, false);
                break;
        }
    }
}
