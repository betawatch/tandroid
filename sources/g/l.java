package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, r rVar) {
        Objects.requireNonNull(rVar);
        androidx.activity.r rVar2 = new androidx.activity.r(rVar, 3);
        fh.b.e(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, rVar2);
        return rVar2;
    }

    public static void c(Object obj, Object obj2) {
        fh.b.e(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
