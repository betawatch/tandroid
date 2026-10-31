package ae;

import java.util.concurrent.TimeUnit;
import yd.v;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class l {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final g f;
    public static final j g;
    public static final j h;

    static {
        String str;
        int i10 = v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = yd.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.a;
        if (i11 < 2) {
            i11 = 2;
        }
        c = yd.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = yd.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(yd.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.a;
        g = new j(0);
        h = new j(1);
    }
}
