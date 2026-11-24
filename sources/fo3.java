// default package

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fo3 extends ThreadPoolExecutor implements AutoCloseable {
    public final /* synthetic */ yv2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo3(yv2 yv2Var, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, TimeUnit.SECONDS, priorityBlockingQueue);
        this.a = yv2Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a.c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z2.d(this);
    }
}
