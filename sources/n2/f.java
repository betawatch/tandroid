package n2;

import ab.o0;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e9.l0;
import e9.m2;
import e9.n0;
import e9.x1;
import e9.y0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import ki.t1;
import m4.v0;
import m4.z;
import v7.u6;
import w7.a0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f implements n {
    public int E;
    public r F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public j2.k L;
    public volatile o0 M;
    public final UUID a;
    public final v0 b;
    public final c2.b c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final e n;
    public final oa.d r;
    public final t1 s;
    public final long v;
    public final ArrayList w;
    public final Set x;
    public final Set y;

    public f(UUID uuid, c2.b bVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, oa.d dVar) {
        uuid.getClass();
        u6.f("Use C.CLEARKEY_UUID instead", !b2.m.c.equals(uuid));
        this.a = uuid;
        this.b = u.d;
        this.c = bVar;
        this.d = hashMap;
        this.e = z10;
        this.f = iArr;
        this.h = z11;
        this.r = dVar;
        this.n = new e(0);
        this.s = new t1(this, 7);
        this.w = new ArrayList();
        this.x = Collections.newSetFromMap(new IdentityHashMap());
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.p != 1) {
            return false;
        }
        g g10 = bVar.g();
        g10.getClass();
        Throwable cause = g10.getCause();
        return (cause instanceof ResourceBusyException) || a0.c(cause);
    }

    public static ArrayList f(b2.s sVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(sVar.d);
        for (int i10 = 0; i10 < sVar.d; i10++) {
            b2.r rVar = sVar.a[i10];
            if ((rVar.a(uuid) || (b2.m.d.equals(uuid) && rVar.a(b2.m.c))) && (rVar.e != null || z10)) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    @Override // n2.n
    public final void E(Looper looper, j2.k kVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.I;
                if (looper2 == null) {
                    this.I = looper;
                    this.J = new Handler(looper);
                } else {
                    u6.p(looper2 == looper);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = kVar;
    }

    @Override // n2.n
    public final int I0(b2.w wVar) {
        h(false);
        r rVar = this.F;
        rVar.getClass();
        int m0 = rVar.m0();
        b2.s sVar = wVar.w;
        if (sVar == null) {
            int h = b2.v0.h(wVar.s);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == h) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                return 0;
            }
        } else if (this.K == null) {
            UUID uuid = this.a;
            if (f(sVar, uuid, true).isEmpty()) {
                if (sVar.d == 1 && sVar.a[0].a(b2.m.c)) {
                    e2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = sVar.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return m0;
    }

    @Override // n2.n
    public final h U0(k kVar, b2.w wVar) {
        h(false);
        u6.p(this.E > 0);
        this.I.getClass();
        return a(this.I, kVar, wVar, true);
    }

    public final h a(Looper looper, k kVar, b2.w wVar, boolean z10) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new o0(this, looper, 6);
        }
        b2.s sVar = wVar.w;
        int i10 = 0;
        b bVar = null;
        if (sVar == null) {
            int h = b2.v0.h(wVar.s);
            r rVar = this.F;
            rVar.getClass();
            if (rVar.m0() != 2 || !s.c) {
                int[] iArr = this.f;
                while (true) {
                    if (i10 >= iArr.length) {
                        i10 = -1;
                        break;
                    }
                    if (iArr[i10] == h) {
                        break;
                    }
                    i10++;
                }
                if (i10 != -1 && rVar.m0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        l0 l0Var = n0.b;
                        b e = e(x1.e, true, null, z10);
                        this.w.add(e);
                        this.G = e;
                    } else {
                        bVar2.b(null);
                    }
                    return this.G;
                }
            }
            return null;
        }
        if (this.K == null) {
            arrayList = f(sVar, this.a, false);
            if (arrayList.isEmpty()) {
                c cVar = new c("Media does not support uuid: " + this.a);
                e2.a.d("DefaultDrmSessionMgr", "DRM error", cVar);
                if (kVar != null) {
                    kVar.d(cVar);
                }
                return new o(new g(6003, cVar));
            }
        } else {
            arrayList = null;
        }
        if (this.e) {
            ArrayList arrayList2 = this.w;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        } else {
            bVar = this.H;
        }
        if (bVar != null) {
            bVar.b(kVar);
            return bVar;
        }
        b e7 = e(arrayList, false, kVar, z10);
        if (!this.e) {
            this.H = e7;
        }
        this.w.add(e7);
        return e7;
    }

    @Override // n2.n
    public final void b() {
        r uVar;
        h(true);
        int i10 = this.E;
        this.E = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.F == null) {
            UUID uuid = this.a;
            this.b.getClass();
            try {
                try {
                    uVar = new u(uuid);
                } catch (y unused) {
                    e2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    uVar = new t7.u(13);
                }
                this.F = uVar;
                uVar.t0(new l2.f(this, 3));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new y(e);
            } catch (Exception e7) {
                throw new y(e7);
            }
        }
        if (this.v == -9223372036854775807L) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).b(null);
            i11++;
        }
    }

    public final b d(List list, boolean z10, k kVar) {
        this.F.getClass();
        boolean z11 = this.h | z10;
        r rVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        j2.k kVar2 = this.L;
        kVar2.getClass();
        b bVar = new b(this.a, rVar, this.n, this.s, list, z11, z10, bArr, this.d, this.c, looper, this.r, kVar2);
        bVar.b(kVar);
        if (this.v != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, k kVar, boolean z11) {
        b d = d(list, z10, kVar);
        boolean c10 = c(d);
        long j10 = this.v;
        Set set = this.y;
        if (c10 && !set.isEmpty()) {
            m2 it = y0.u(set).iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(null);
            }
            d.a(kVar);
            if (j10 != -9223372036854775807L) {
                d.a(null);
            }
            d = d(list, z10, kVar);
        }
        if (c(d) && z11) {
            Set set2 = this.x;
            if (!set2.isEmpty()) {
                m2 it2 = y0.u(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    m2 it3 = y0.u(set).iterator();
                    while (it3.hasNext()) {
                        ((h) it3.next()).a(null);
                    }
                }
                d.a(kVar);
                if (j10 != -9223372036854775807L) {
                    d.a(null);
                }
                return d(list, z10, kVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.F != null && this.E == 0 && this.w.isEmpty() && this.x.isEmpty()) {
            r rVar = this.F;
            rVar.getClass();
            rVar.release();
            this.F = null;
        }
    }

    public final void h(boolean z10) {
        if (z10 && this.I == null) {
            e2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.I;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            e2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.I.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // n2.n
    public final m j0(k kVar, b2.w wVar) {
        u6.p(this.E > 0);
        this.I.getClass();
        d dVar = new d(this, kVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new z(6, dVar, wVar));
        return dVar;
    }

    @Override // n2.n
    public final void release() {
        h(true);
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 != 0) {
            return;
        }
        if (this.v != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.w);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).a(null);
            }
        }
        m2 it = y0.u(this.x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
