package ab;

import android.util.Base64;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
