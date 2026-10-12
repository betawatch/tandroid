package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic b;

    public /* synthetic */ dc(ic icVar, int i10) {
        this.a = i10;
        this.b = icVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                ic icVar = this.b;
                icVar.a(countDownLatch, null);
                icVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new dc(icVar, 3));
                break;
            case 1:
                ic icVar2 = this.b;
                icVar2.H = false;
                icVar2.d(true);
                break;
            case 2:
                ic icVar3 = this.b;
                icVar3.H = false;
                icVar3.d(true);
                break;
            default:
                ic icVar4 = this.b;
                icVar4.H = false;
                icVar4.d(true);
                break;
        }
    }
}
