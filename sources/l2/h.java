package l2;

import a8.ia;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h implements t0 {
    public static final h9.t1 r;
    public final e2.k1 a;
    public final e2.i1 b;
    public final b3.e c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final long n;
    public final h9.l0 o;
    public final ConcurrentHashMap p;
    public long q;

    static {
        h9.g0 g0Var = h9.i0.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        h9.o.e(6, objArr);
        r = h9.i0.o(6, objArr);
    }

    public h(b3.e eVar, int i7, int i10, int i11, int i12, int i13, boolean z9, Map map) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(i7, i11, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i7, i13, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, i7, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = new e2.k1();
        this.b = new e2.i1();
        this.c = eVar;
        long j3 = 50000;
        this.d = h2.m0.S(j3);
        this.e = h2.m0.S(i7);
        this.f = h2.m0.S(j3);
        this.g = h2.m0.S(j3);
        this.h = h2.m0.S(i10);
        this.i = h2.m0.S(i11);
        this.j = h2.m0.S(i12);
        this.k = h2.m0.S(i13);
        this.l = -1;
        this.m = z9;
        this.n = h2.m0.S(0);
        this.p = new ConcurrentHashMap();
        this.o = h9.l0.b(map);
        this.q = -1L;
    }

    public static void a(int i7, int i10, String str, String str2) {
        ia.i(i7 >= i10, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(s0 s0Var) {
        int i7;
        boolean z9;
        long j3;
        float f10;
        m2.j jVar = s0Var.a;
        long j10 = s0Var.d;
        g gVar = (g) this.p.get(jVar);
        gVar.getClass();
        g gVar2 = (g) this.p.get(jVar);
        gVar2.getClass();
        synchronized (gVar2) {
            i7 = gVar2.d;
        }
        int i10 = i7 * this.c.b;
        g gVar3 = (g) this.p.get(jVar);
        gVar3.getClass();
        boolean z10 = i10 >= gVar3.c;
        if (jVar.equals(m2.j.c)) {
            return !z10;
        }
        e2.l1 l1Var = s0Var.b;
        e2.g0 g0Var = l1Var.m(l1Var.g(s0Var.c.a, this.b).c, this.a, 0L).c.b;
        if (g0Var != null) {
            String scheme = g0Var.a.getScheme();
            if (TextUtils.isEmpty(scheme) || r.contains(scheme)) {
                z9 = true;
                j3 = !z9 ? this.e : this.d;
                long j11 = !z9 ? this.g : this.f;
                f10 = s0Var.e;
                if (f10 > 1.0f) {
                    j3 = Math.min(h2.m0.B(j3, f10), j11);
                }
                if (j10 >= Math.max(j3, 500000L)) {
                    boolean z11 = (z9 ? this.m : false) || !z10;
                    gVar.b = z11;
                    if (!z11 && j10 < 500000) {
                        h2.a.l("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (j10 >= j11 || z10) {
                    gVar.b = false;
                }
                return gVar.b;
            }
        }
        z9 = false;
        if (!z9) {
        }
        if (!z9) {
        }
        f10 = s0Var.e;
        if (f10 > 1.0f) {
        }
        if (j10 >= Math.max(j3, 500000L)) {
        }
        return gVar.b;
    }

    public final void c() {
        int i7 = 0;
        if (this.p.isEmpty()) {
            b3.e eVar = this.c;
            synchronized (eVar) {
                if (eVar.a) {
                    eVar.d(0);
                }
            }
            return;
        }
        b3.e eVar2 = this.c;
        Iterator it = this.p.values().iterator();
        while (it.hasNext()) {
            i7 += ((g) it.next()).c;
        }
        eVar2.d(i7);
    }
}
