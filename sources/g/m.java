package g;

import ai.rb;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class m {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, s sVar) {
        Objects.requireNonNull(sVar);
        rb rbVar = new rb(sVar, 3);
        d2.c.c(obj).registerOnBackInvokedCallback(MediaController.VIDEO_BITRATE_480, rbVar);
        return rbVar;
    }

    public static void c(Object obj, Object obj2) {
        d2.c.c(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
