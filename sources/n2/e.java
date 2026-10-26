package n2;

import a8.te;
import a8.yb;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.w0;
import f9.g0;
import f9.g2;
import f9.i0;
import f9.s1;
import f9.t0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k2.e0;
import li.e3;
import li.h5;
import m4.x0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e implements m {
    public int E;
    public q F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public j2.j L;
    public volatile androidx.mediarouter.app.c M;
    public final UUID a;
    public final x0 b;
    public final c2.b c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final m4.c n;
    public final u7.s r;
    public final h5 s;
    public final long v;
    public final ArrayList w;
    public final Set x;
    public final Set y;

    public e(UUID uuid, c2.b bVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, u7.s sVar) {
        uuid.getClass();
        yb.f("Use C.CLEARKEY_UUID instead", !b2.n.c.equals(uuid));
        this.a = uuid;
        this.b = t.d;
        this.c = bVar;
        this.d = hashMap;
        this.e = z10;
        this.f = iArr;
        this.h = z11;
        this.r = sVar;
        this.n = new m4.c(1);
        this.s = new h5(this);
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
        f g7 = bVar.g();
        g7.getClass();
        Throwable cause = g7.getCause();
        return (cause instanceof ResourceBusyException) || te.c(cause);
    }

    public static ArrayList h(b2.t tVar, UUID uuid, boolean z10) {
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
    public final void a() {
        q sVar;
        j(true);
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
                    sVar = new t(uuid);
                } catch (x unused) {
                    e2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    sVar = new u7.s(13);
                }
                this.F = sVar;
                sVar.T(new e3(this, 3));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new x(e);
            } catch (Exception e10) {
                throw new x(e10);
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

    public final g b(Looper looper, j jVar, b2.x xVar, boolean z10) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new androidx.mediarouter.app.c(this, looper, 6);
        }
        b2.t tVar = xVar.w;
        int i10 = 0;
        b bVar = null;
        if (tVar == null) {
            int h = w0.h(xVar.s);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.i0() != 2 || !r.c) {
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
                if (i10 != -1 && qVar.i0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        g0 g0Var = i0.b;
                        b e = e(s1.e, true, null, z10);
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
            arrayList = h(tVar, this.a, false);
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

    public final b d(List list, boolean z10, j jVar) {
        this.F.getClass();
        boolean z11 = this.h | z10;
        q qVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        j2.j jVar2 = this.L;
        jVar2.getClass();
        b bVar = new b(this.a, qVar, this.n, this.s, list, z11, z10, bArr, this.d, this.c, looper, this.r, jVar2);
        bVar.b(jVar);
        if (this.v != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c10 = c(d);
        long j10 = this.v;
        Set set = this.y;
        if (c10 && !set.isEmpty()) {
            g2 it = t0.u(set).iterator();
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
            Set set2 = this.x;
            if (!set2.isEmpty()) {
                g2 it2 = t0.u(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    g2 it3 = t0.u(set).iterator();
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
    public final void f(Looper looper, j2.j jVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.I;
                if (looper2 == null) {
                    this.I = looper;
                    this.J = new Handler(looper);
                } else {
                    yb.p(looper2 == looper);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = jVar;
    }

    @Override // n2.m
    public final l g(j jVar, b2.x xVar) {
        yb.p(this.E > 0);
        this.I.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new e0(16, dVar, xVar));
        return dVar;
    }

    public final void i() {
        if (this.F != null && this.E == 0 && this.w.isEmpty() && this.x.isEmpty()) {
            q qVar = this.F;
            qVar.getClass();
            qVar.release();
            this.F = null;
        }
    }

    public final void j(boolean z10) {
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
    public final void release() {
        j(true);
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
        g2 it = t0.u(this.x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        i();
    }

    @Override // n2.m
    public final int w(b2.x xVar) {
        j(false);
        q qVar = this.F;
        qVar.getClass();
        int i02 = qVar.i0();
        b2.t tVar = xVar.w;
        if (tVar == null) {
            int h = w0.h(xVar.s);
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
            if (h(tVar, uuid, true).isEmpty()) {
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
        return i02;
    }

    @Override // n2.m
    public final g z(j jVar, b2.x xVar) {
        j(false);
        yb.p(this.E > 0);
        this.I.getClass();
        return b(this.I, jVar, xVar, true);
    }
}
