package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class m {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, r rVar) {
        Objects.requireNonNull(rVar);
        androidx.activity.q qVar = new androidx.activity.q(rVar, 1);
        f9.z.e(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        f9.z.e(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
