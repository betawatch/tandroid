package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ q5(a6 a6Var, int i10) {
        this.a = i10;
        this.b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a6 a6Var = this.b;
                a6Var.b0 = false;
                a6Var.G0(true);
                break;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                a6 a6Var2 = this.b;
                a6Var2.C0(countDownLatch, null);
                a6Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(a6Var2.N).doOnIdle(new q5(a6Var2, 4));
                break;
            case 2:
                a6 a6Var3 = this.b;
                a6Var3.b0 = false;
                a6Var3.G0(true);
                break;
            case 3:
                a6 a6Var4 = this.b;
                a6Var4.b0 = false;
                a6Var4.G0(true);
                break;
            default:
                AndroidUtilities.runOnUIThread(new q5(this.b, 0));
                break;
        }
    }
}
