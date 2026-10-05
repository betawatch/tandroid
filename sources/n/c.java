package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b5.d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import w7.a0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class c extends a0 {
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
