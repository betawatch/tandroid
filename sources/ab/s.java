package ab;

import android.util.Base64;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class s {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = r.c().getBytes(zd.a.a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = a1.g.p("firebase_session_", encodeToString, "_data");
        b = a1.g.p("firebase_session_", encodeToString, "_settings");
    }
}
