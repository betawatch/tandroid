package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ p5(z5 z5Var, int i10) {
        this.a = i10;
        this.b = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                z5Var.e0 = false;
                z5Var.H0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                z5 z5Var2 = this.b;
                z5Var2.D0(countDownLatch, null);
                z5Var2.E0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(z5Var2.Q).doOnIdle(new p5(z5Var2, 4));
                break;
            case 2:
                z5 z5Var3 = this.b;
                z5Var3.e0 = false;
                z5Var3.H0(true);
                break;
            case 3:
                z5 z5Var4 = this.b;
                z5Var4.e0 = false;
                z5Var4.H0(true);
                break;
            default:
                AndroidUtilities.runOnUIThread(new p5(this.b, 0));
                break;
        }
    }
}
