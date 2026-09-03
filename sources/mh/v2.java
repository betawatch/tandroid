package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ v2(g5 g5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.a = i10;
        this.b = g5Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).processUpdates(this.c.updates, false);
                break;
            default:
                MessagesController.getInstance(this.b.currentAccount).processUpdates(this.c.updates, false);
                break;
        }
    }
}
