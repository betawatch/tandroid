package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tb b;

    public /* synthetic */ pb(tb tbVar, int i7) {
        this.a = i7;
        this.b = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                tb tbVar = this.b;
                tbVar.a(countDownLatch, null);
                tbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.g0.h3(new pb(tbVar, 3));
                break;
            case 1:
                tb tbVar2 = this.b;
                tbVar2.G = false;
                tbVar2.d(true);
                break;
            case 2:
                tb tbVar3 = this.b;
                tbVar3.G = false;
                tbVar3.d(true);
                break;
            default:
                tb tbVar4 = this.b;
                tbVar4.G = false;
                tbVar4.d(true);
                break;
        }
    }
}
