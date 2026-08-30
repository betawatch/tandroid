package md;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import k7.p7;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object a2;
        try {
            a2 = new d(a(Looper.getMainLooper()), false);
        } catch (Throwable th2) {
            a2 = p7.a(th2);
        }
        if (a2 instanceof sc.e) {
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
        j.c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
