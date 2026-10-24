package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ p5(y5 y5Var, int i10) {
        this.a = i10;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y5 y5Var = this.b;
                y5Var.g0 = false;
                y5Var.H0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                y5 y5Var2 = this.b;
                y5Var2.D0(countDownLatch, null);
                y5Var2.E0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(y5Var2.S).doOnIdle(new p5(y5Var2, 4));
                break;
            case 2:
                y5 y5Var3 = this.b;
                y5Var3.g0 = false;
                y5Var3.H0(true);
                break;
            case 3:
                y5 y5Var4 = this.b;
                y5Var4.g0 = false;
                y5Var4.H0(true);
                break;
            default:
                AndroidUtilities.runOnUIThread(new p5(this.b, 0));
                break;
        }
    }
}
