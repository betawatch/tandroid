package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import di.w9;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
