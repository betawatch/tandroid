package k2;

import android.text.TextUtils;
import b8.zb;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h implements t0 {
    public static final g9.s1 r;
    public final d2.m1 a;
    public final d2.k1 b;
    public final a3.e c;
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
    public final g9.l0 o;
    public final ConcurrentHashMap p;
    public long q;

    static {
        g9.g0 g0Var = g9.i0.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        g9.o.e(6, objArr);
        r = g9.i0.o(6, objArr);
    }

    public h(a3.e eVar, int i3, int i10, int i11, int i12, int i13, boolean z10, Map map) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(i3, i11, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i3, i13, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, i3, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = new d2.m1();
        this.b = new d2.k1();
        this.c = eVar;
        long j10 = 50000;
        this.d = g2.n0.S(j10);
        this.e = g2.n0.S(i3);
        this.f = g2.n0.S(j10);
        this.g = g2.n0.S(j10);
        this.h = g2.n0.S(i10);
        this.i = g2.n0.S(i11);
        this.j = g2.n0.S(i12);
        this.k = g2.n0.S(i13);
        this.l = -1;
        this.m = z10;
        this.n = g2.n0.S(0);
        this.p = new ConcurrentHashMap();
        this.o = g9.l0.b(map);
        this.q = -1L;
    }

    public static void a(int i3, int i10, String str, String str2) {
        zb.i(i3 >= i10, "%s cannot be less than %s", str, str2);
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
        int i3;
        boolean z10;
        long j10;
        float f10;
        l2.k kVar = s0Var.a;
        long j11 = s0Var.d;
        g gVar = (g) this.p.get(kVar);
        gVar.getClass();
        g gVar2 = (g) this.p.get(kVar);
        gVar2.getClass();
        synchronized (gVar2) {
            i3 = gVar2.d;
        }
        int i10 = i3 * this.c.b;
        g gVar3 = (g) this.p.get(kVar);
        gVar3.getClass();
        boolean z11 = i10 >= gVar3.c;
        if (kVar.equals(l2.k.c)) {
            return !z11;
        }
        d2.n1 n1Var = s0Var.b;
        d2.i0 i0Var = n1Var.m(n1Var.g(s0Var.c.a, this.b).c, this.a, 0L).c.b;
        if (i0Var != null) {
            String scheme = i0Var.a.getScheme();
            if (TextUtils.isEmpty(scheme) || r.contains(scheme)) {
                z10 = true;
                j10 = !z10 ? this.e : this.d;
                long j12 = !z10 ? this.g : this.f;
                f10 = s0Var.e;
                if (f10 > 1.0f) {
                    j10 = Math.min(g2.n0.B(j10, f10), j12);
                }
                if (j11 >= Math.max(j10, 500000L)) {
                    boolean z12 = (z10 ? this.m : false) || !z11;
                    gVar.b = z12;
                    if (!z12 && j11 < 500000) {
                        g2.a.l("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (j11 >= j12 || z11) {
                    gVar.b = false;
                }
                return gVar.b;
            }
        }
        z10 = false;
        if (!z10) {
        }
        if (!z10) {
        }
        f10 = s0Var.e;
        if (f10 > 1.0f) {
        }
        if (j11 >= Math.max(j10, 500000L)) {
        }
        return gVar.b;
    }

    public final void c() {
        int i3 = 0;
        if (this.p.isEmpty()) {
            a3.e eVar = this.c;
            synchronized (eVar) {
                if (eVar.a) {
                    eVar.d(0);
                }
            }
            return;
        }
        a3.e eVar2 = this.c;
        Iterator it = this.p.values().iterator();
        while (it.hasNext()) {
            i3 += ((g) it.next()).c;
        }
        eVar2.d(i3);
    }
}
