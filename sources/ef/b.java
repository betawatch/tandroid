package ef;

import android.os.Build;
import d7.u;
import v9.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public static final a a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            a = new u(7);
        } else {
            a = new d(7);
        }
    }
}
