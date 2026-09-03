package la;

import android.util.Base64;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
