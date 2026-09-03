package la;

import android.util.Base64;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
