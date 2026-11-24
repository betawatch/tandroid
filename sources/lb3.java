// default package

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lb3 {
    public static final w59 q;
    public final znb a;
    public final xnb b;
    public final af0 c;
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
    public final qm5 n;
    public final ConcurrentHashMap o;
    public long p;

    static {
        km5 km5Var = mm5.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        xpe.a(6, objArr);
        q = mm5.o(6, objArr);
    }

    public lb3(af0 af0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, Map map) {
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
        this.a = new znb();
        this.b = new xnb();
        this.c = af0Var;
        this.d = g8c.T(i);
        this.e = g8c.T(i2);
        this.f = g8c.T(i3);
        this.g = g8c.T(i4);
        this.h = g8c.T(i5);
        this.i = g8c.T(i6);
        this.j = g8c.T(i7);
        this.k = g8c.T(i8);
        this.l = z;
        this.m = g8c.T(0L);
        this.o = new ConcurrentHashMap();
        this.n = qm5.b(map);
        this.p = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        gre.i(i >= i2, "%s cannot be less than %s", str, str2);
    }

    public final int b(uc8 uc8Var) {
        int i;
        kb3 kb3Var = (kb3) this.o.get(uc8Var);
        kb3Var.getClass();
        synchronized (kb3Var) {
            i = kb3Var.d;
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
    public final boolean c(b86 b86Var) {
        boolean z;
        long j;
        long j2;
        float f;
        long max;
        long j3;
        boolean z2;
        boolean z3;
        int i;
        uc8 uc8Var = b86Var.a;
        kb3 kb3Var = (kb3) this.o.get(uc8Var);
        kb3Var.getClass();
        int b = b(uc8Var);
        kb3 kb3Var2 = (kb3) this.o.get(uc8Var);
        kb3Var2.getClass();
        boolean z4 = b >= kb3Var2.c;
        if (uc8Var.equals(uc8.c)) {
            return !z4;
        }
        aob aobVar = b86Var.b;
        xq6 xq6Var = aobVar.m(aobVar.g(b86Var.c.a, this.b).c, this.a, 0L).b.b;
        if (xq6Var != null) {
            String scheme = xq6Var.a.getScheme();
            if (TextUtils.isEmpty(scheme) || q.contains(scheme)) {
                z = true;
                if (z) {
                    j = this.d;
                    j2 = this.f;
                } else {
                    j = this.e;
                    j2 = this.g;
                }
                f = b86Var.e;
                if (f > 1.0f) {
                    j = Math.min(g8c.D(j, f), j2);
                }
                max = Math.max(j, 500000L);
                j3 = b86Var.d;
                if (j3 >= max) {
                    boolean z5 = z ? this.l : false;
                    Runtime runtime = Runtime.getRuntime();
                    long maxMemory = runtime.maxMemory();
                    if (runtime.totalMemory() >= maxMemory) {
                        long freeMemory = runtime.freeMemory();
                        af0 af0Var = this.c;
                        synchronized (af0Var) {
                            i = af0Var.c << 16;
                        }
                        if (freeMemory + i < maxMemory / 25) {
                            z2 = false;
                            z3 = (z5 && z2) || !z4;
                            kb3Var.b = z3;
                            if (!z3 && z5 && !z2) {
                                lad.e("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                            }
                            if (!kb3Var.b && b86Var.d < 500000) {
                                lad.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                            }
                        }
                    }
                    z2 = true;
                    if (z5) {
                        kb3Var.b = z3;
                        if (!z3) {
                            lad.e("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                        }
                        if (!kb3Var.b) {
                            lad.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                        }
                    }
                    kb3Var.b = z3;
                    if (!z3) {
                    }
                    if (!kb3Var.b) {
                    }
                } else if (j3 >= j2 || z4) {
                    kb3Var.b = false;
                }
                return kb3Var.b;
            }
        }
        z = false;
        if (z) {
        }
        f = b86Var.e;
        if (f > 1.0f) {
        }
        max = Math.max(j, 500000L);
        j3 = b86Var.d;
        if (j3 >= max) {
        }
        return kb3Var.b;
    }

    public final void d() {
        boolean isEmpty = this.o.isEmpty();
        af0 af0Var = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (af0Var) {
                af0Var.C(0);
            }
        } else {
            Iterator it = this.o.values().iterator();
            while (it.hasNext()) {
                i += ((kb3) it.next()).c;
            }
            af0Var.C(i);
        }
    }
}
