package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ o5(y5 y5Var, int i10) {
        this.a = i10;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y5 y5Var = this.b;
                y5Var.b0 = false;
                y5Var.G0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                y5 y5Var2 = this.b;
                y5Var2.C0(countDownLatch, null);
                y5Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(y5Var2.N).doOnIdle(new o5(y5Var2, 4));
                break;
            case 2:
                y5 y5Var3 = this.b;
                y5Var3.b0 = false;
                y5Var3.G0(true);
                break;
            case 3:
                y5 y5Var4 = this.b;
                y5Var4.b0 = false;
                y5Var4.G0(true);
                break;
            default:
                AndroidUtilities.runOnUIThread(new o5(this.b, 0));
                break;
        }
    }
}
