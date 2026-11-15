package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                t5Var.h0 = false;
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
                org.telegram.messenger.ns.f(t5Var2.T).d(new k5(t5Var2, 4));
                break;
            case 2:
                t5 t5Var3 = this.b;
                t5Var3.h0 = false;
                t5Var3.J0(true);
                break;
            case 3:
                t5 t5Var4 = this.b;
                t5Var4.h0 = false;
                t5Var4.J0(true);
                break;
            default:
                org.telegram.messenger.g0.h3(new k5(this.b, 0));
                break;
        }
    }
}
