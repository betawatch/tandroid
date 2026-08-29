package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, q qVar) {
        Objects.requireNonNull(qVar);
        androidx.activity.q qVar2 = new androidx.activity.q(qVar, 1);
        eg.c.i(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, qVar2);
        return qVar2;
    }

    public static void c(Object obj, Object obj2) {
        eg.c.i(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
