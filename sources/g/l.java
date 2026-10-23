package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
