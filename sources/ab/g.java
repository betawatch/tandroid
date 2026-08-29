package ab;

import android.os.HandlerThread;
import android.os.Looper;
import c2.v0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public final v0 a;

    public g(Looper looper) {
        v0 v0Var = new v0(looper);
        Looper.getMainLooper();
        this.a = v0Var;
    }

    public static g a() {
        g gVar;
        synchronized (b) {
            try {
                if (c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    c = new g(handlerThread.getLooper());
                }
                gVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        q.a.execute(new o(1, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
