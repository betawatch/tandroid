package b2;

import java.util.HashSet;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class l0 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = b;
        }
        return str;
    }
}
