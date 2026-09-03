package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ y(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
        this.a = i10;
        this.b = atomicInteger;
        this.c = atomicInteger2;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$11(this.b, this.c, this.d);
                break;
            case 1:
                BillingController.lambda$onPurchasesUpdatedInternal$8(this.b, this.c, this.d);
                break;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$9(this.b, this.c, this.d);
                break;
        }
    }
}
