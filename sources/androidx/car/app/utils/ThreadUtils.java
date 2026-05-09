package androidx.car.app.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class ThreadUtils {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    public static void runOnMain(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }

    public static void checkMainThread() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
    }
}
