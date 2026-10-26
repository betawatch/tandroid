package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ o5(x5 x5Var, int i10) {
        this.a = i10;
        this.b = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x5 x5Var = this.b;
                x5Var.g0 = false;
                x5Var.F0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                x5 x5Var2 = this.b;
                x5Var2.B0(countDownLatch, null);
                x5Var2.C0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(x5Var2.S).doOnIdle(new o5(x5Var2, 4));
                break;
            case 2:
                x5 x5Var3 = this.b;
                x5Var3.g0 = false;
                x5Var3.F0(true);
                break;
            case 3:
                x5 x5Var4 = this.b;
                x5Var4.g0 = false;
                x5Var4.F0(true);
                break;
            default:
                AndroidUtilities.runOnUIThread(new o5(this.b, 0));
                break;
        }
    }
}
