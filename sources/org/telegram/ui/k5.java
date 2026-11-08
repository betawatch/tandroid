package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ k5(t5 t5Var, int i7) {
        this.a = i7;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                t5Var.g0 = false;
                t5Var.J0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                t5 t5Var2 = this.b;
                t5Var2.F0(countDownLatch, null);
                t5Var2.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.qs.f(t5Var2.S).d(new k5(t5Var2, 4));
                break;
            case 2:
                t5 t5Var3 = this.b;
                t5Var3.g0 = false;
                t5Var3.J0(true);
                break;
            case 3:
                t5 t5Var4 = this.b;
                t5Var4.g0 = false;
                t5Var4.J0(true);
                break;
            default:
                org.telegram.messenger.g0.h3(new k5(this.b, 0));
                break;
        }
    }
}
