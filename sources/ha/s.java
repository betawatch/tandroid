package ha;

import android.util.Base64;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class s {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = r.c().getBytes(fd.a.a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = aa.d.o("firebase_session_", encodeToString, "_data");
        b = aa.d.o("firebase_session_", encodeToString, "_settings");
    }
}
