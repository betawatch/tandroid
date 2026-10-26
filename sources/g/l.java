package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, r rVar) {
        Objects.requireNonNull(rVar);
        androidx.activity.q qVar = new androidx.activity.q(rVar, 3);
        c2.i.d(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        c2.i.d(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
