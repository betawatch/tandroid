package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import di.a1;
import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class m {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, s sVar) {
        Objects.requireNonNull(sVar);
        androidx.activity.q qVar = new androidx.activity.q(sVar, 3);
        a1.c(obj).registerOnBackInvokedCallback(1000000, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        a1.c(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
