package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import di.w9;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
