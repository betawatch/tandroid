// default package

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class hrb {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}
