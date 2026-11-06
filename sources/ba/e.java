package ba;

import android.util.Log;
import androidx.activity.v;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e {
    public static final d d = new d();
    public final c a;
    public final c b;
    public final c c;

    public e(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        j.e(backgroundExecutorService, "backgroundExecutorService");
        j.e(blockingExecutorService, "blockingExecutorService");
        this.a = new c(backgroundExecutorService);
        this.b = new c(backgroundExecutorService);
        Tasks.forResult(null);
        this.c = new c(blockingExecutorService);
    }

    public static final void a() {
        if (((Boolean) new v(0, d, d.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 2).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new v(0, d, d.class, "isBlockingThread", "isBlockingThread()Z", 0, 3).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
