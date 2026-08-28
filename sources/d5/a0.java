package d5;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 {
    public static final a0 a = new a0();

    public final c0 a(Looper looper, Handler.Callback callback) {
        return new c0(new Handler(looper, callback));
    }
}
