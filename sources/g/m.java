package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import di.a1;
import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
