package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ q5(z5 z5Var, int i10) {
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
                NotificationCenter.getInstance(z5Var2.Q).doOnIdle(new q5(z5Var2, 4));
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
                AndroidUtilities.runOnUIThread(new q5(this.b, 0));
                break;
        }
    }
}
