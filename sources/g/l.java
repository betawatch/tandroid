package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
