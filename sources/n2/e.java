package n2;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.r0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.m0;
import e9.o1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import ji.b5;
import ji.u4;
import m4.t0;
import w7.z;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e implements m {
    public int E;
    public q F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public j2.k L;
    public volatile androidx.mediarouter.app.c M;
    public final UUID a;
    public final t0 b;
    public final com.google.firebase.messaging.m c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final pf.b n;
    public final rb.a r;
    public final l.d s;
    public final long v;
    public final ArrayList w;
    public final Set x;
    public final Set y;

    public e(UUID uuid, com.google.firebase.messaging.m mVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, rb.a aVar) {
        uuid.getClass();
        e2.d.a("Use C.CLEARKEY_UUID instead", !b2.i.b.equals(uuid));
        this.a = uuid;
        this.b = t.d;
        this.c = mVar;
        this.d = hashMap;
        this.e = z10;
        this.f = iArr;
        this.h = z11;
        this.r = aVar;
        this.n = new pf.b(28);
        this.s = new l.d(this, 5);
        this.w = new ArrayList();
        this.x = Collections.newSetFromMap(new IdentityHashMap());
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.o != 1) {
            return false;
        }
        f g10 = bVar.g();
        g10.getClass();
        Throwable cause = g10.getCause();
        return (cause instanceof ResourceBusyException) || z.c(cause);
    }

    public static ArrayList f(b2.o oVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(oVar.d);
        for (int i10 = 0; i10 < oVar.d; i10++) {
            b2.n nVar = oVar.a[i10];
            if ((nVar.a(uuid) || (b2.i.c.equals(uuid) && nVar.a(b2.i.b))) && (nVar.e != null || z10)) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override // n2.m
    public final void B(Looper looper, j2.k kVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.I;
                if (looper2 == null) {
                    this.I = looper;
                    this.J = new Handler(looper);
                } else {
                    e2.d.g(looper2 == looper);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = kVar;
    }

    @Override // n2.m
    public final int H0(b2.s sVar) {
        h(false);
        q qVar = this.F;
        qVar.getClass();
        int G0 = qVar.G0();
        b2.o oVar = sVar.v;
        if (oVar == null) {
            int h = r0.h(sVar.r);
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
            if (f(oVar, uuid, true).isEmpty()) {
                if (oVar.d == 1 && oVar.a[0].a(b2.i.b)) {
                    e2.a.n("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = oVar.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return G0;
    }

    @Override // n2.m
    public final g T0(j jVar, b2.s sVar) {
        h(false);
        e2.d.g(this.E > 0);
        e2.d.h(this.I);
        return a(this.I, jVar, sVar, true);
    }

    public final g a(Looper looper, j jVar, b2.s sVar, boolean z10) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new androidx.mediarouter.app.c(this, looper, 5);
        }
        b2.o oVar = sVar.v;
        int i10 = 0;
        b bVar = null;
        if (oVar == null) {
            int h = r0.h(sVar.r);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.G0() != 2 || !r.c) {
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
                if (i10 != -1 && qVar.G0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        g0 g0Var = i0.b;
                        b e7 = e(a1.e, true, null, z10);
                        this.w.add(e7);
                        this.G = e7;
                    } else {
                        bVar2.b(null);
                    }
                    return this.G;
                }
            }
            return null;
        }
        if (this.K == null) {
            arrayList = f(oVar, this.a, false);
            if (arrayList.isEmpty()) {
                c cVar = new c("Media does not support uuid: " + this.a);
                e2.a.f("DefaultDrmSessionMgr", "DRM error", cVar);
                if (jVar != null) {
                    jVar.d(cVar);
                }
                return new n(new f(6003, cVar));
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
            bVar.b(jVar);
            return bVar;
        }
        b e10 = e(arrayList, false, jVar, z10);
        if (!this.e) {
            this.H = e10;
        }
        this.w.add(e10);
        return e10;
    }

    @Override // n2.m
    public final void b() {
        q aVar;
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
                    aVar = new t(uuid);
                } catch (w unused) {
                    e2.a.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    aVar = new rb.a(13);
                }
                this.F = aVar;
                aVar.H0(new u4(this, 6));
                return;
            } catch (UnsupportedSchemeException e7) {
                throw new w(e7);
            } catch (Exception e10) {
                throw new w(e10);
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

    public final b d(List list, boolean z10, j jVar) {
        this.F.getClass();
        boolean z11 = this.h | z10;
        q qVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        j2.k kVar = this.L;
        kVar.getClass();
        b bVar = new b(this.a, qVar, this.n, this.s, list, z11, z10, bArr, this.d, this.c, looper, this.r, kVar);
        bVar.b(jVar);
        if (this.v != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c10 = c(d);
        long j3 = this.v;
        Set set = this.y;
        if (c10 && !set.isEmpty()) {
            o1 it = m0.v(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(null);
            }
            d.a(jVar);
            if (j3 != -9223372036854775807L) {
                d.a(null);
            }
            d = d(list, z10, jVar);
        }
        if (c(d) && z11) {
            Set set2 = this.x;
            if (!set2.isEmpty()) {
                o1 it2 = m0.v(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    o1 it3 = m0.v(set).iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).a(null);
                    }
                }
                d.a(jVar);
                if (j3 != -9223372036854775807L) {
                    d.a(null);
                }
                return d(list, z10, jVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.F != null && this.E == 0 && this.w.isEmpty() && this.x.isEmpty()) {
            q qVar = this.F;
            qVar.getClass();
            qVar.release();
            this.F = null;
        }
    }

    public final void h(boolean z10) {
        if (z10 && this.I == null) {
            e2.a.o("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.I;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.I.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // n2.m
    public final l h0(j jVar, b2.s sVar) {
        e2.d.g(this.E > 0);
        e2.d.h(this.I);
        d dVar = new d(this, jVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new b5(12, dVar, sVar));
        return dVar;
    }

    @Override // n2.m
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
        o1 it = m0.v(this.x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
