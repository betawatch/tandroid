package n2;

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
import m4.v0;
import v7.t6;
import w7.d0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements m {
    public final Set D;
    public int E;
    public q F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public j2.l L;
    public volatile android.support.v4.media.session.q M;
    public final UUID a;
    public final v0 b;
    public final ac.a c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final m5.e n;
    public final hb.a r;
    public final l2.f s;
    public final long w;
    public final ArrayList x;
    public final Set y;

    public e(UUID uuid, ac.a aVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, hb.a aVar2) {
        uuid.getClass();
        t6.e("Use C.CLEARKEY_UUID instead", !b2.n.c.equals(uuid));
        this.a = uuid;
        this.b = t.d;
        this.c = aVar;
        this.d = hashMap;
        this.e = z10;
        this.f = iArr;
        this.h = z11;
        this.r = aVar2;
        this.n = new m5.e(1);
        this.s = new l2.f(this, 4);
        this.x = new ArrayList();
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.D = Collections.newSetFromMap(new IdentityHashMap());
        this.w = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.p != 1) {
            return false;
        }
        f g10 = bVar.g();
        g10.getClass();
        Throwable cause = g10.getCause();
        return (cause instanceof ResourceBusyException) || d0.c(cause);
    }

    public static ArrayList f(b2.t tVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(tVar.d);
        for (int i10 = 0; i10 < tVar.d; i10++) {
            b2.s sVar = tVar.a[i10];
            if ((sVar.a(uuid) || (b2.n.d.equals(uuid) && sVar.a(b2.n.c))) && (sVar.e != null || z10)) {
                arrayList.add(sVar);
            }
        }
        return arrayList;
    }

    @Override // n2.m
    public final g B0(j jVar, b2.x xVar) {
        i(false);
        t6.p(this.E > 0);
        this.I.getClass();
        return b(this.I, jVar, xVar, true);
    }

    @Override // n2.m
    public final void a() {
        q aVar;
        i(true);
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
                    aVar = new t(uuid);
                } catch (y unused) {
                    e2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    aVar = new kb.a(12);
                }
                this.F = aVar;
                aVar.y(new m2.t(this, 1));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new y(e);
            } catch (Exception e7) {
                throw new y(e7);
            }
        }
        if (this.w == -9223372036854775807L) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).b(null);
            i11++;
        }
    }

    public final g b(Looper looper, j jVar, b2.x xVar, boolean z10) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new android.support.v4.media.session.q(this, looper, 7);
        }
        b2.t tVar = xVar.w;
        int i10 = 0;
        b bVar = null;
        if (tVar == null) {
            int h = b2.v0.h(xVar.s);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.d1() != 2 || !r.c) {
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
                if (i10 != -1 && qVar.d1() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        l0 l0Var = n0.b;
                        b e = e(x1.e, true, null, z10);
                        this.x.add(e);
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
            arrayList = f(tVar, this.a, false);
            if (arrayList.isEmpty()) {
                c cVar = new c("Media does not support uuid: " + this.a);
                e2.a.d("DefaultDrmSessionMgr", "DRM error", cVar);
                if (jVar != null) {
                    jVar.d(cVar);
                }
                return new n(new f(6003, cVar));
            }
        } else {
            arrayList = null;
        }
        if (this.e) {
            ArrayList arrayList2 = this.x;
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
            bVar.b(jVar);
            return bVar;
        }
        b e7 = e(arrayList, false, jVar, z10);
        if (!this.e) {
            this.H = e7;
        }
        this.x.add(e7);
        return e7;
    }

    public final b d(List list, boolean z10, j jVar) {
        this.F.getClass();
        boolean z11 = this.h | z10;
        q qVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        j2.l lVar = this.L;
        lVar.getClass();
        b bVar = new b(this.a, qVar, this.n, this.s, list, z11, z10, bArr, this.d, this.c, looper, this.r, lVar);
        bVar.b(jVar);
        if (this.w != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c10 = c(d);
        long j10 = this.w;
        Set set = this.D;
        if (c10 && !set.isEmpty()) {
            m2 it = y0.u(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(null);
            }
            d.a(jVar);
            if (j10 != -9223372036854775807L) {
                d.a(null);
            }
            d = d(list, z10, jVar);
        }
        if (c(d) && z11) {
            Set set2 = this.y;
            if (!set2.isEmpty()) {
                m2 it2 = y0.u(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    m2 it3 = y0.u(set).iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).a(null);
                    }
                }
                d.a(jVar);
                if (j10 != -9223372036854775807L) {
                    d.a(null);
                }
                return d(list, z10, jVar);
            }
        }
        return d;
    }

    @Override // n2.m
    public final void g(Looper looper, j2.l lVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.I;
                if (looper2 == null) {
                    this.I = looper;
                    this.J = new Handler(looper);
                } else {
                    t6.p(looper2 == looper);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = lVar;
    }

    public final void h() {
        if (this.F != null && this.E == 0 && this.x.isEmpty() && this.y.isEmpty()) {
            q qVar = this.F;
            qVar.getClass();
            qVar.release();
            this.F = null;
        }
    }

    public final void i(boolean z10) {
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

    @Override // n2.m
    public final l p(j jVar, b2.x xVar) {
        t6.p(this.E > 0);
        this.I.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new mh.k(1, dVar, xVar));
        return dVar;
    }

    @Override // n2.m
    public final void release() {
        i(true);
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 != 0) {
            return;
        }
        if (this.w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.x);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).a(null);
            }
        }
        m2 it = y0.u(this.y).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        h();
    }

    @Override // n2.m
    public final int t0(b2.x xVar) {
        i(false);
        q qVar = this.F;
        qVar.getClass();
        int d12 = qVar.d1();
        b2.t tVar = xVar.w;
        if (tVar == null) {
            int h = b2.v0.h(xVar.s);
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
            if (f(tVar, uuid, true).isEmpty()) {
                if (tVar.d == 1 && tVar.a[0].a(b2.n.c)) {
                    e2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = tVar.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return d12;
    }
}
