package c2;

import android.media.MediaRoute2Info;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static void a(MediaRoute2Info.Builder builder, n nVar) {
        if (nVar.a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(nVar.a());
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

    public static void e(MediaRoute2Info.Builder builder, int i9) {
        builder.setType(i9);
    }
}
