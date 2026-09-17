package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import di.w9;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class m {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, s sVar) {
        Objects.requireNonNull(sVar);
        androidx.activity.r rVar = new androidx.activity.r(sVar, 3);
        w9.c(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, rVar);
        return rVar;
    }

    public static void c(Object obj, Object obj2) {
        w9.c(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
