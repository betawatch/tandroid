package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u implements f, y0 {
    public static final o8.l0 n = o8.z.x(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final o8.l0 o = o8.z.x(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final o8.l0 p = o8.z.x(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final o8.l0 q = o8.z.x(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final o8.l0 r = o8.z.x(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final o8.l0 s = o8.z.x(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static u t;
    public final o8.b0 a;
    public final xa.c b = new xa.c(8);
    public final w0 c;
    public final d5.a0 d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public volatile long l;
    public long m;

    public u(Context context, Map map, int i9, d5.a0 a0Var, boolean z10) {
        this.a = o8.b0.a(map);
        this.c = new w0(i9);
        this.d = a0Var;
        this.e = z10;
        if (context == null) {
            this.i = 0;
            this.l = a(0);
            return;
        }
        d5.w f10 = d5.w.f(context);
        int g10 = f10.g();
        this.i = g10;
        this.l = a(g10);
        s sVar = new s(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) f10.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(sVar));
        ((Handler) f10.b).post(new a1.e(25, f10, sVar));
    }

    public static synchronized u b(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (t == null) {
                    t tVar = new t(context);
                    t = new u((Context) tVar.c, (HashMap) tVar.d, tVar.b, (d5.a0) tVar.e, tVar.a);
                }
                uVar = t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public final long a(int i9) {
        Integer valueOf = Integer.valueOf(i9);
        o8.b0 b0Var = this.a;
        Long l10 = (Long) b0Var.get(valueOf);
        if (l10 == null) {
            l10 = (Long) b0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void c(int i9, long j10, long j11) {
        int i10;
        long j12;
        long j13;
        if (i9 == 0 && j10 == 0 && j11 == this.m) {
            return;
        }
        this.m = j11;
        Iterator it = ((CopyOnWriteArrayList) this.b.b).iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.c) {
                i10 = i9;
                j12 = j10;
                j13 = j11;
            } else {
                i10 = i9;
                j12 = j10;
                j13 = j11;
                eVar.a.post(new d(eVar, i10, j12, j13, 0));
            }
            i9 = i10;
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
                FileLog.d("debug_loading: bandwidth meter on transfer " + AndroidUtilities.formatFileSize(j10) + " per " + j11 + "ms");
                this.c.a((((float) j10) * 8000.0f) / ((float) j11), (int) Math.sqrt((double) j10));
                if (this.j < 2000) {
                    if (this.k >= 524288) {
                    }
                    c((int) j11, j10, this.l);
                    this.g = elapsedRealtime;
                    this.h = 0L;
                }
                this.l = (long) this.c.b();
                FileLog.d("debug_loading: bandwidth meter (onTransfer), bitrate estimate = " + this.l);
                c((int) j11, j10, this.l);
                this.g = elapsedRealtime;
                this.h = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
