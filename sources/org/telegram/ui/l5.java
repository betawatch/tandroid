package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ l5(w5 w5Var, int i10) {
        this.a = i10;
        this.b = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w5 w5Var = this.b;
                w5Var.e0 = false;
                w5Var.G0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                w5 w5Var2 = this.b;
                w5Var2.C0(countDownLatch, null);
                w5Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(w5Var2.Q).doOnIdle(new l5(w5Var2, 4));
                break;
            case 2:
                w5 w5Var3 = this.b;
                w5Var3.e0 = false;
                w5Var3.G0(true);
                break;
            case 3:
                w5 w5Var4 = this.b;
                w5Var4.e0 = false;
                w5Var4.G0(true);
                break;
            default:
                AndroidUtilities.runOnUIThread(new l5(this.b, 0));
                break;
        }
    }
}
