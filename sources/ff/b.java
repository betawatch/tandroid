package ff;

import android.os.Build;
import w9.d;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b {
    public static final a a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            a = new d(7);
        } else {
            a = new xa.a(7);
        }
    }
}
