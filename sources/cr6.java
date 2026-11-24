// default package

import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class cr6 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (cr6.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (cr6.class) {
            str = b;
        }
        return str;
    }
}
