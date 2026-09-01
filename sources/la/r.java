package la;

import android.util.Base64;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
