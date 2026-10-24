package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ p8(ha haVar, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = haVar;
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
