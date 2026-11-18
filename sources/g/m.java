package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class m {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, s sVar) {
        Objects.requireNonNull(sVar);
        androidx.activity.q qVar = new androidx.activity.q(sVar, 2);
        ci.v.g(obj).registerOnBackInvokedCallback(1000000, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        ci.v.g(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
