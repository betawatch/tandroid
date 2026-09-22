package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ x(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i10) {
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
