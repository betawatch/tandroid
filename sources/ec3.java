// default package

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ec3 {
    public static final j99 q;
    public final zrb a;
    public final xrb b;
    public final cf0 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final long m;
    public final to5 n;
    public final ConcurrentHashMap o;
    public long p;

    static {
        no5 no5Var = po5.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        rue.a(6, objArr);
        q = po5.o(6, objArr);
    }

    public ec3(cf0 cf0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, Map map) {
        a(i5, 0, "bufferForPlaybackMs", "0");
        a(i6, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i8, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(i, i5, "minBufferMs", "bufferForPlaybackMs");
        a(i2, i6, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i8, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(i3, i, "maxBufferMs", "minBufferMs");
        a(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = new zrb();
        this.b = new xrb();
        this.c = cf0Var;
        this.d = gcc.T(i);
        this.e = gcc.T(i2);
        this.f = gcc.T(i3);
        this.g = gcc.T(i4);
        this.h = gcc.T(i5);
        this.i = gcc.T(i6);
        this.j = gcc.T(i7);
        this.k = gcc.T(i8);
        this.l = z;
        this.m = gcc.T(0L);
        this.o = new ConcurrentHashMap();
        this.n = to5.b(map);
        this.p = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        yve.i(i >= i2, "%s cannot be less than %s", str, str2);
    }

    public final int b(ig8 ig8Var) {
        int i;
        dc3 dc3Var = (dc3) this.o.get(ig8Var);
        dc3Var.getClass();
        synchronized (dc3Var) {
            i = dc3Var.d;
        }
        return i << 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(fa6 fa6Var) {
        boolean z;
        long j;
        long j2;
        float f;
        long max;
        long j3;
        boolean z2;
        boolean z3;
        int i;
        ig8 ig8Var = fa6Var.a;
        dc3 dc3Var = (dc3) this.o.get(ig8Var);
        dc3Var.getClass();
        int b = b(ig8Var);
        dc3 dc3Var2 = (dc3) this.o.get(ig8Var);
        dc3Var2.getClass();
        boolean z4 = b >= dc3Var2.c;
        if (ig8Var.equals(ig8.c)) {
            return !z4;
        }
        asb asbVar = fa6Var.b;
        bt6 bt6Var = asbVar.m(asbVar.g(fa6Var.c.a, this.b).c, this.a, 0L).b.b;
        if (bt6Var != null) {
            String scheme = bt6Var.a.getScheme();
            if (TextUtils.isEmpty(scheme) || q.contains(scheme)) {
                z = true;
                if (z) {
                    j = this.d;
                    j2 = this.f;
                } else {
                    j = this.e;
                    j2 = this.g;
                }
                f = fa6Var.e;
                if (f > 1.0f) {
                    j = Math.min(gcc.D(j, f), j2);
                }
                max = Math.max(j, 500000L);
                j3 = fa6Var.d;
                if (j3 >= max) {
                    boolean z5 = z ? this.l : false;
                    Runtime runtime = Runtime.getRuntime();
                    long maxMemory = runtime.maxMemory();
                    if (runtime.totalMemory() >= maxMemory) {
                        long freeMemory = runtime.freeMemory();
                        cf0 cf0Var = this.c;
                        synchronized (cf0Var) {
                            i = cf0Var.c << 16;
                        }
                        if (freeMemory + i < maxMemory / 25) {
                            z2 = false;
                            z3 = (z5 && z2) || !z4;
                            dc3Var.b = z3;
                            if (!z3 && z5 && !z2) {
                                efd.e("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                            }
                            if (!dc3Var.b && fa6Var.d < 500000) {
                                efd.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                            }
                        }
                    }
                    z2 = true;
                    if (z5) {
                        dc3Var.b = z3;
                        if (!z3) {
                            efd.e("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                        }
                        if (!dc3Var.b) {
                            efd.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                        }
                    }
                    dc3Var.b = z3;
                    if (!z3) {
                    }
                    if (!dc3Var.b) {
                    }
                } else if (j3 >= j2 || z4) {
                    dc3Var.b = false;
                }
                return dc3Var.b;
            }
        }
        z = false;
        if (z) {
        }
        f = fa6Var.e;
        if (f > 1.0f) {
        }
        max = Math.max(j, 500000L);
        j3 = fa6Var.d;
        if (j3 >= max) {
        }
        return dc3Var.b;
    }

    public final void d() {
        boolean isEmpty = this.o.isEmpty();
        cf0 cf0Var = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (cf0Var) {
                cf0Var.C(0);
            }
        } else {
            Iterator it = this.o.values().iterator();
            while (it.hasNext()) {
                i += ((dc3) it.next()).c;
            }
            cf0Var.C(i);
        }
    }
}
