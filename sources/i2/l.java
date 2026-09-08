package i2;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l {
    public final y2.d a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final HashMap h;
    public long i;

    public l(y2.d dVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = dVar;
        long j3 = 50000;
        this.b = e2.d0.Q(j3);
        this.c = e2.d0.Q(j3);
        this.d = e2.d0.Q(i10);
        this.e = e2.d0.Q(i11);
        this.f = -1;
        this.g = e2.d0.Q(0);
        this.h = new HashMap();
        this.i = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        e2.d.a(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final int b() {
        Iterator it = this.h.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((k) it.next()).b;
        }
        return i10;
    }

    public final boolean c(p0 p0Var) {
        int i10;
        long j3 = this.c;
        k kVar = (k) this.h.get(p0Var.a);
        kVar.getClass();
        y2.d dVar = this.a;
        synchronized (dVar) {
            i10 = dVar.d * dVar.b;
        }
        boolean z10 = i10 >= b();
        long j10 = this.b;
        float f7 = p0Var.c;
        if (f7 > 1.0f) {
            j10 = Math.min(e2.d0.z(j10, f7), j3);
        }
        long max = Math.max(j10, 500000L);
        long j11 = p0Var.b;
        if (j11 < max) {
            kVar.a = !z10;
            if (z10 && j11 < 500000) {
                e2.a.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j3 || z10) {
            kVar.a = false;
        }
        return kVar.a;
    }

    public final void d() {
        if (!this.h.isEmpty()) {
            this.a.a(b());
            return;
        }
        y2.d dVar = this.a;
        synchronized (dVar) {
            if (dVar.a) {
                dVar.a(0);
            }
        }
    }
}
