package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, r rVar) {
        Objects.requireNonNull(rVar);
        androidx.activity.r rVar2 = new androidx.activity.r(rVar, 1);
        d2.c.f(obj).registerOnBackInvokedCallback(1000000, rVar2);
        return rVar2;
    }

    public static void c(Object obj, Object obj2) {
        d2.c.f(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
