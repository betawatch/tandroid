package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb b;

    public /* synthetic */ nb(rb rbVar, int i3) {
        this.a = i3;
        this.b = rbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                rb rbVar = this.b;
                rbVar.a(countDownLatch, null);
                rbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.g0.h3(new nb(rbVar, 3));
                break;
            case 1:
                rb rbVar2 = this.b;
                rbVar2.H = false;
                rbVar2.d(true);
                break;
            case 2:
                rb rbVar3 = this.b;
                rbVar3.H = false;
                rbVar3.d(true);
                break;
            default:
                rb rbVar4 = this.b;
                rbVar4.H = false;
                rbVar4.d(true);
                break;
        }
    }
}
