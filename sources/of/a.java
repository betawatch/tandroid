package of;

import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.f4;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final /* synthetic */ b0 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(b0 b0Var, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, r5, priorityBlockingQueue);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = b0Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a.c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        f4.h(this);
    }
}
