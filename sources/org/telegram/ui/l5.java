package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ l5(u5 u5Var, int i9) {
        this.a = i9;
        this.b = u5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u5 u5Var = this.b;
                u5Var.a0 = false;
                u5Var.F0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                u5 u5Var2 = this.b;
                u5Var2.B0(countDownLatch, null);
                u5Var2.C0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(u5Var2.M).doOnIdle(new l5(u5Var2, 4));
                break;
            case 2:
                u5 u5Var3 = this.b;
                u5Var3.a0 = false;
                u5Var3.F0(true);
                break;
            case 3:
                u5 u5Var4 = this.b;
                u5Var4.a0 = false;
                u5Var4.F0(true);
                break;
            default:
                AndroidUtilities.runOnUIThread(new l5(this.b, 0));
                break;
        }
    }
}
