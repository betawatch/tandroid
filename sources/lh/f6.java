package lh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ f6(t7 t7Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = t7Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
            case 1:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
            case 2:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
            case 3:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.b.a).processUpdates(this.c.updates, false);
                break;
        }
    }
}
