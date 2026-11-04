package org.telegram.ui;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ m5(v5 v5Var, int i3) {
        this.a = i3;
        this.b = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v5 v5Var = this.b;
                v5Var.h0 = false;
                v5Var.J0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                v5 v5Var2 = this.b;
                v5Var2.F0(countDownLatch, null);
                v5Var2.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.hs.f(v5Var2.T).d(new m5(v5Var2, 4));
                break;
            case 2:
                v5 v5Var3 = this.b;
                v5Var3.h0 = false;
                v5Var3.J0(true);
                break;
            case 3:
                v5 v5Var4 = this.b;
                v5Var4.h0 = false;
                v5Var4.J0(true);
                break;
            default:
                org.telegram.messenger.g0.h3(new m5(this.b, 0));
                break;
        }
    }
}
