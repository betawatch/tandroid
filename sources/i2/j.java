package i2;

import android.text.TextUtils;
import e9.x1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class j implements t0 {
    public static final x1 r;
    public final b2.n1 a;
    public final b2.l1 b;
    public final y2.d c;
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
    public final e9.q0 o;
    public final ConcurrentHashMap p;
    public long q;

    static {
        e9.l0 l0Var = e9.n0.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        e9.s.d(6, objArr);
        r = e9.n0.s(6, objArr);
    }

    public j(y2.d dVar, int i10, int i11, int i12, int i13, int i14, boolean z10, Map map) {
        a(i11, 0, "bufferForPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i14, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(50000, i11, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i12, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i10, i14, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, i10, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = new b2.n1();
        this.b = new b2.l1();
        this.c = dVar;
        long j10 = 50000;
        this.d = e2.m0.S(j10);
        this.e = e2.m0.S(i10);
        this.f = e2.m0.S(j10);
        this.g = e2.m0.S(j10);
        this.h = e2.m0.S(i11);
        this.i = e2.m0.S(i12);
        this.j = e2.m0.S(i13);
        this.k = e2.m0.S(i14);
        this.l = -1;
        this.m = z10;
        this.n = e2.m0.S(0);
        this.p = new ConcurrentHashMap();
        this.o = e9.q0.a(map);
        this.q = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        u6.i(i10 >= i11, "%s cannot be less than %s", str, str2);
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
        int i10;
        boolean z10;
        long j10;
        float f7;
        j2.k kVar = s0Var.a;
        long j11 = s0Var.d;
        i iVar = (i) this.p.get(kVar);
        iVar.getClass();
        i iVar2 = (i) this.p.get(kVar);
        iVar2.getClass();
        synchronized (iVar2) {
            i10 = iVar2.d;
        }
        int i11 = i10 * this.c.b;
        i iVar3 = (i) this.p.get(kVar);
        iVar3.getClass();
        boolean z11 = i11 >= iVar3.c;
        if (kVar.equals(j2.k.c)) {
            return !z11;
        }
        b2.o1 o1Var = s0Var.b;
        b2.j0 j0Var = o1Var.m(o1Var.g(s0Var.c.a, this.b).c, this.a, 0L).c.b;
        if (j0Var != null) {
            String scheme = j0Var.a.getScheme();
            if (TextUtils.isEmpty(scheme) || r.contains(scheme)) {
                z10 = true;
                j10 = !z10 ? this.e : this.d;
                long j12 = !z10 ? this.g : this.f;
                f7 = s0Var.e;
                if (f7 > 1.0f) {
                    j10 = Math.min(e2.m0.B(j10, f7), j12);
                }
                if (j11 >= Math.max(j10, 500000L)) {
                    boolean z12 = (z10 ? this.m : false) || !z11;
                    iVar.b = z12;
                    if (!z12 && j11 < 500000) {
                        e2.a.l("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (j11 >= j12 || z11) {
                    iVar.b = false;
                }
                return iVar.b;
            }
        }
        z10 = false;
        if (!z10) {
        }
        if (!z10) {
        }
        f7 = s0Var.e;
        if (f7 > 1.0f) {
        }
        if (j11 >= Math.max(j10, 500000L)) {
        }
        return iVar.b;
    }

    public final void c() {
        int i10 = 0;
        if (this.p.isEmpty()) {
            y2.d dVar = this.c;
            synchronized (dVar) {
                if (dVar.a) {
                    dVar.d(0);
                }
            }
            return;
        }
        y2.d dVar2 = this.c;
        Iterator it = this.p.values().iterator();
        while (it.hasNext()) {
            i10 += ((i) it.next()).c;
        }
        dVar2.d(i10);
    }
}
