package ja;

import android.util.Base64;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class s {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = r.c().getBytes(hd.a.a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = a4.w.n("firebase_session_", encodeToString, "_data");
        b = a4.w.n("firebase_session_", encodeToString, "_settings");
    }
}
