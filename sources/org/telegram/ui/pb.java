package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
