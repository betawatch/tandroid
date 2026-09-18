package ci;

import java.util.TimeZone;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.de0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public abstract class od {
    public static String a;
    public static nd b;

    public static void a(boolean z10, Utilities.Callback callback) {
        de0.e(R.raw.permission_request_location, R.string.PermissionNoLocationStory, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.i3(2, new ai.i3(1, callback, z10), z10));
    }

    public static boolean b() {
        String id2 = TimeZone.getDefault().getID();
        return (id2.startsWith("US/") || "America/Nassau".equals(id2) || "America/Belize".equals(id2) || "America/Cayman".equals(id2) || "Pacific/Palau".equals(id2)) ? false : true;
    }
}
