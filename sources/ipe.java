// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
