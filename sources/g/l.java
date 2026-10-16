package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import fi.c2;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, r rVar) {
        Objects.requireNonNull(rVar);
        androidx.activity.r rVar2 = new androidx.activity.r(rVar, 3);
        c2.e(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, rVar2);
        return rVar2;
    }

    public static void c(Object obj, Object obj2) {
        c2.e(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
