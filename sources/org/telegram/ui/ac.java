package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec b;

    public /* synthetic */ ac(ec ecVar, int i10) {
        this.a = i10;
        this.b = ecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                ec ecVar = this.b;
                ecVar.a(countDownLatch, null);
                ecVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new ac(ecVar, 3));
                break;
            case 1:
                ec ecVar2 = this.b;
                ecVar2.H = false;
                ecVar2.d(true);
                break;
            case 2:
                ec ecVar3 = this.b;
                ecVar3.H = false;
                ecVar3.d(true);
                break;
            default:
                ec ecVar4 = this.b;
                ecVar4.H = false;
                ecVar4.d(true);
                break;
        }
    }
}
