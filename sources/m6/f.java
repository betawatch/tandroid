package m6;

import android.os.Build;
import android.util.Log;
import j$.util.Objects;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class f extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z9) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z9);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("CloudMessengerCompat", 3))) {
            return g.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return g.class;
    }
}
