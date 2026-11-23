package ba;

import android.util.Log;
import androidx.activity.v;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
