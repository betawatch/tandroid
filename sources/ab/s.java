package ab;

import android.util.Base64;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
