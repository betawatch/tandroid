// default package

import android.media.MediaRoute2Info;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class fu6 {
    public static void a(MediaRoute2Info.Builder builder, zs6 zs6Var) {
        if (zs6Var.a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(zs6Var.a());
        }
    }

    public static Set<String> b(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int c(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static void d(MediaRoute2Info.Builder builder, Set<String> set) {
        builder.setDeduplicationIds(set);
    }

    public static void e(MediaRoute2Info.Builder builder, int i) {
        builder.setType(i);
    }
}
