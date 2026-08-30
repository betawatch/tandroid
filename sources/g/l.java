package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, q qVar) {
        Objects.requireNonNull(qVar);
        androidx.activity.r rVar = new androidx.activity.r(qVar, 1);
        f0.d.g(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, rVar);
        return rVar;
    }

    public static void c(Object obj, Object obj2) {
        f0.d.g(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
