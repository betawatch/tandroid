package id;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import g7.y5;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object a2;
        try {
            a2 = new e(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            a2 = y5.a(th);
        }
        if (a2 instanceof oc.e) {
            a2 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        i.c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
