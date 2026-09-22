package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b5.d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import w7.y;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c extends y {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new b());
    public volatile Handler c;

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
