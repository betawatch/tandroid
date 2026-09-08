package di;

import java.util.TimeZone;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.de0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class od {
    public static String a;
    public static nd b;

    public static void a(boolean z10, Utilities.Callback callback) {
        de0.e(R.raw.permission_request_location, R.string.PermissionNoLocationStory, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new bi.v2(2, new bi.v2(1, callback, z10), z10));
    }

    public static boolean b() {
        String id2 = TimeZone.getDefault().getID();
        return (id2.startsWith("US/") || "America/Nassau".equals(id2) || "America/Belize".equals(id2) || "America/Cayman".equals(id2) || "Pacific/Palau".equals(id2)) ? false : true;
    }
}
