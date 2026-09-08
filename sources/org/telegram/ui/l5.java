package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ l5(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v5 v5Var = this.b;
                v5Var.e0 = false;
                v5Var.G0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                v5 v5Var2 = this.b;
                v5Var2.C0(countDownLatch, null);
                v5Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(v5Var2.Q).doOnIdle(new l5(v5Var2, 4));
                break;
            case 2:
                v5 v5Var3 = this.b;
                v5Var3.e0 = false;
                v5Var3.G0(true);
                break;
            case 3:
                v5 v5Var4 = this.b;
                v5Var4.e0 = false;
                v5Var4.G0(true);
                break;
            default:
                AndroidUtilities.runOnUIThread(new l5(this.b, 0));
                break;
        }
    }
}
