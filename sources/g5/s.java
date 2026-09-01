package g5;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.d1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class s implements f, v0 {
    public static final s8.i0 n = s8.v.w(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final s8.i0 o = s8.v.w(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final s8.i0 p = s8.v.w(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final s8.i0 q = s8.v.w(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final s8.i0 r = s8.v.w(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final s8.i0 s = s8.v.w(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static s t;
    public final s8.x a;
    public final o5.i b = new o5.i(15);
    public final t0 c;
    public final h5.y d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public volatile long l;
    public long m;

    public s(Context context, Map map, int i10, h5.y yVar, boolean z4) {
        this.a = s8.x.a(map);
        this.c = new t0(i10);
        this.d = yVar;
        this.e = z4;
        if (context == null) {
            this.i = 0;
            this.l = a(0);
            return;
        }
        h5.u d = h5.u.d(context);
        int f10 = d.f();
        this.i = f10;
        this.l = a(f10);
        r rVar = new r(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(rVar));
        ((Handler) d.b).post(new gf.c(4, d, rVar));
    }

    public static synchronized s b(Context context) {
        s sVar;
        synchronized (s.class) {
            try {
                if (t == null) {
                    d1 d1Var = new d1(context);
                    t = new s((Context) d1Var.c, (HashMap) d1Var.d, d1Var.a, (h5.y) d1Var.e, d1Var.b);
                }
                sVar = t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public final long a(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        s8.x xVar = this.a;
        Long l10 = (Long) xVar.get(valueOf);
        if (l10 == null) {
            l10 = (Long) xVar.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void c(int i10, long j10, long j11) {
        int i11;
        long j12;
        long j13;
        if (i10 == 0 && j10 == 0 && j11 == this.m) {
            return;
        }
        this.m = j11;
        Iterator it = ((CopyOnWriteArrayList) this.b.b).iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.c) {
                i11 = i10;
                j12 = j10;
                j13 = j11;
            } else {
                i11 = i10;
                j12 = j10;
                j13 = j11;
                eVar.a.post(new d(eVar, i11, j12, j13, 0));
            }
            i10 = i11;
            j10 = j12;
            j11 = j13;
        }
    }

    public final synchronized void d(long j10, long j11) {
        try {
            this.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.j += (int) (elapsedRealtime - this.g);
            this.k += j10;
            if (j11 > 0 && j10 > 0) {
                this.c.a((j10 * 8000.0f) / j11, (int) Math.sqrt(j10));
                if (this.j < 2000) {
                    if (this.k >= 524288) {
                    }
                    c((int) j11, j10, this.l);
                    this.g = elapsedRealtime;
                    this.h = 0L;
                }
                this.l = (long) this.c.b();
                c((int) j11, j10, this.l);
                this.g = elapsedRealtime;
                this.h = 0L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r10.k >= 524288) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x000c, code lost:
    
        if ((r11.h & 8) == 8) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(p pVar, boolean z4) {
        Throwable th2;
        boolean z10;
        s sVar;
        try {
            if (z4) {
                if (pVar != null) {
                    try {
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                z10 = true;
                if (z10) {
                    return;
                }
                try {
                    h5.a.i(this.f > 0);
                    this.d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i10 = (int) (elapsedRealtime - this.g);
                    this.j += i10;
                    long j10 = this.k;
                    long j11 = this.h;
                    this.k = j10 + j11;
                    if (i10 > 0) {
                        this.c.a((j11 * 8000.0f) / i10, (int) Math.sqrt(j11));
                        if (this.j < 2000) {
                        }
                        this.l = (long) this.c.b();
                        sVar = this;
                        sVar.c(i10, this.h, this.l);
                        sVar.g = elapsedRealtime;
                        sVar.h = 0L;
                    } else {
                        sVar = this;
                    }
                    sVar.f--;
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            }
            z10 = false;
            if (z10) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x000b, code lost:
    
        if ((r2.h & 8) == 8) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {, blocks: (B:21:0x0006, B:10:0x0017, B:12:0x001b, B:13:0x0026), top: B:20:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(p pVar, boolean z4) {
        boolean z10;
        if (z4) {
            if (pVar != null) {
            }
            z10 = true;
            if (z10) {
                return;
            }
            if (this.f == 0) {
                this.d.getClass();
                this.g = SystemClock.elapsedRealtime();
            }
            this.f++;
            return;
        }
        z10 = false;
        if (z10) {
        }
    }
}
