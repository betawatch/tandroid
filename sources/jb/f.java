package jb;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j9.u;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f {
    public static final Object b = new Object();
    public static f c;
    public final z a;

    public f(Looper looper) {
        z zVar = new z(looper);
        Looper.getMainLooper();
        this.a = zVar;
    }

    public static f a() {
        f fVar;
        synchronized (b) {
            try {
                if (c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    c = new f(handlerThread.getLooper());
                }
                fVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.a.execute(new u(19, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
