package kc;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d {
    public static final Map a;

    static {
        Map map;
        try {
            Field declaredField = he.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map map2 = Collections.EMPTY_MAP;
            th.printStackTrace();
            map = map2;
        }
        a = map;
    }
}
