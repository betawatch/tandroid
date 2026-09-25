package ff;

import com.google.android.gms.internal.cast.k4;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final /* synthetic */ c a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(c cVar, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, r5, priorityBlockingQueue);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = cVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = this.a.b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                FileLog.e(e);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        k4.e(this);
    }
}
