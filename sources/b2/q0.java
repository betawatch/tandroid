package b2;

import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class q0 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (q0.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (q0.class) {
            str = b;
        }
        return str;
    }
}
