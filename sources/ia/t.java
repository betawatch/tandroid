package ia;

import android.util.Base64;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class t {
    public static final String a;
    public static final String b;

    static {
        byte[] bytes = s.c().getBytes(gd.a.a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        a = a9.p.m("firebase_session_", encodeToString, "_data");
        b = a9.p.m("firebase_session_", encodeToString, "_settings");
    }
}
