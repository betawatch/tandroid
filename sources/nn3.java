// default package

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nn3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ nn3(CountDownLatch countDownLatch, byte b) {
        this.a = b;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CountDownLatch countDownLatch = this.b;
        switch (b) {
            case 0:
                try {
                    countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
                    break;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                countDownLatch.countDown();
                break;
        }
    }
}
