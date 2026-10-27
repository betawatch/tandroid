package fi;

import java.util.TimeZone;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ye0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class qc {
    public static String a;
    public static pc b;

    public static void a(boolean z10, Utilities.Callback callback) {
        ye0.c(R.raw.permission_request_location, R.string.PermissionNoLocationStory, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new bi.t8(3, new bi.t8(2, callback, z10), z10));
    }

    public static boolean b() {
        String id2 = TimeZone.getDefault().getID();
        return (id2.startsWith("US/") || "America/Nassau".equals(id2) || "America/Belize".equals(id2) || "America/Cayman".equals(id2) || "Pacific/Palau".equals(id2)) ? false : true;
    }
}
