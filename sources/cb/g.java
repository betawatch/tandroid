package cb;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public final a7.e a;

    public g(Looper looper) {
        a7.e eVar = new a7.e(looper);
        Looper.getMainLooper();
        this.a = eVar;
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
        o.a.execute(new androidx.biometric.k(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
