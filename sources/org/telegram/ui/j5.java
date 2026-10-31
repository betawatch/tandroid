package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ j5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                t5Var.g0 = false;
                t5Var.I0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                t5 t5Var2 = this.b;
                t5Var2.E0(countDownLatch, null);
                t5Var2.F0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.zs.f(t5Var2.S).d(new j5(t5Var2, 4));
                break;
            case 2:
                t5 t5Var3 = this.b;
                t5Var3.g0 = false;
                t5Var3.I0(true);
                break;
            case 3:
                t5 t5Var4 = this.b;
                t5Var4.g0 = false;
                t5Var4.I0(true);
                break;
            default:
                org.telegram.messenger.i0.g3(new j5(this.b, 0));
                break;
        }
    }
}
