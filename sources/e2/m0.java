package e2;

import java.util.HashSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class m0 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (m0.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (m0.class) {
            str = b;
        }
        return str;
    }
}
