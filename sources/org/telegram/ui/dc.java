package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc b;

    public /* synthetic */ dc(hc hcVar, int i10) {
        this.a = i10;
        this.b = hcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                hc hcVar = this.b;
                hcVar.a(countDownLatch, null);
                hcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new dc(hcVar, 3));
                break;
            case 1:
                hc hcVar2 = this.b;
                hcVar2.H = false;
                hcVar2.d(true);
                break;
            case 2:
                hc hcVar3 = this.b;
                hcVar3.H = false;
                hcVar3.d(true);
                break;
            default:
                hc hcVar4 = this.b;
                hcVar4.H = false;
                hcVar4.d(true);
                break;
        }
    }
}
