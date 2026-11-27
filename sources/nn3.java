// default package

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
