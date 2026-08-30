package la;

import android.util.Base64;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class r {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = q.c().getBytes(jd.a.a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = android.support.v4.media.a.o("firebase_session_", encodeToString, "_data");
        b = android.support.v4.media.a.o("firebase_session_", encodeToString, "_settings");
    }
}
