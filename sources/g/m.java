package g;

import ai.rb;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
