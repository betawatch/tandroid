// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
