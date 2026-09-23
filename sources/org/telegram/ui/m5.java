package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ m5(w5 w5Var, int i10) {
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
                NotificationCenter.getInstance(w5Var2.Q).doOnIdle(new m5(w5Var2, 4));
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
                AndroidUtilities.runOnUIThread(new m5(this.b, 0));
                break;
        }
    }
}
