package h3;

import java.util.HashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class r0 {
    public static final HashSet a = new HashSet();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (r0.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }
}
