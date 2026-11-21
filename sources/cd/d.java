package cd;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class d {
    public static final Map a;

    static {
        Map map;
        try {
            Field declaredField = jf.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th2) {
            Map map2 = Collections.EMPTY_MAP;
            th2.printStackTrace();
            map = map2;
        }
        a = map;
    }
}
