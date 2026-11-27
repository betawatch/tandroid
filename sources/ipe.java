// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ipe {
    public static volatile ipe a;
    public static volatile ipe b;
    public static final ipe c;

    static {
        ipe ipeVar = new ipe();
        Map map = Collections.EMPTY_MAP;
        c = ipeVar;
    }

    public static void a() {
        if (a == null) {
            synchronized (ipe.class) {
                if (a == null) {
                    a = c;
                }
            }
        }
    }
}
