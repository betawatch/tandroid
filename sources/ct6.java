// default package

import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ct6 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (ct6.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (ct6.class) {
            str = b;
        }
        return str;
    }
}
