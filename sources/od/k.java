package od;

import java.util.concurrent.TimeUnit;
import md.v;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final g f;
    public static final com.google.android.gms.internal.cast.a g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String str;
        int i9 = v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = md.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = v.a;
        if (i10 < 2) {
            i10 = 2;
        }
        c = md.a.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = md.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(md.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.a;
        g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
