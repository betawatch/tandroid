package je;

import he.w;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class k {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final g f;
    public static final ag.j g;
    public static final ag.j h;

    static {
        String str;
        int i10 = w.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = he.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = w.a;
        if (i11 < 2) {
            i11 = 2;
        }
        c = he.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = he.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(he.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.a;
        g = new ag.j(0);
        h = new ag.j(1);
    }
}
