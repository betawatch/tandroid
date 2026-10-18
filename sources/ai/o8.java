package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ o8(ga gaVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = gaVar;
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
