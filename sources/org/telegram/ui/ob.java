package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ ob(sb sbVar, int i7) {
        this.a = i7;
        this.b = sbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                sb sbVar = this.b;
                sbVar.a(countDownLatch, null);
                sbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.g0.h3(new ob(sbVar, 3));
                break;
            case 1:
                sb sbVar2 = this.b;
                sbVar2.H = false;
                sbVar2.d(true);
                break;
            case 2:
                sb sbVar3 = this.b;
                sbVar3.H = false;
                sbVar3.d(true);
                break;
            default:
                sb sbVar4 = this.b;
                sbVar4.H = false;
                sbVar4.d(true);
                break;
        }
    }
}
