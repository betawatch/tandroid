package ai;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ f1(CountDownLatch countDownLatch, int i7) {
        this.a = i7;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.await(20000L, TimeUnit.MILLISECONDS);
                    break;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                this.b.countDown();
                break;
        }
    }
}
