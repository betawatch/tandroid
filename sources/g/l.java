package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import fh.y5;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, q qVar) {
        Objects.requireNonNull(qVar);
        androidx.activity.r rVar = new androidx.activity.r(qVar, 1);
        y5.e(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, rVar);
        return rVar;
    }

    public static void c(Object obj, Object obj2) {
        y5.e(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
