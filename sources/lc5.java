// default package

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class lc5 {
    private static volatile Choreographer choreographer;

    static {
        Object sa9Var;
        try {
            sa9Var = new kc5(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            sa9Var = new sa9(th);
        }
        if (sa9Var instanceof sa9) {
            sa9Var = null;
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
        invoke.getClass();
        return (Handler) invoke;
    }
}
