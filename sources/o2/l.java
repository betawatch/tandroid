package o2;

import android.net.Uri;
import android.os.Looper;
import b2.e0;
import b2.f0;
import b2.k0;
import b2.l0;
import e2.d0;
import e9.i0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u2.g0;
import u2.j1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l extends u2.a {
    public final c h;
    public final l2.h i;
    public final ob.a j;
    public final n2.n k;
    public final rb.a l;
    public final boolean m;
    public final int n;
    public final p2.c o;
    public final long p;
    public e0 q;
    public c0 r;
    public k0 s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, l2.h hVar, c cVar, ob.a aVar, n2.n nVar, rb.a aVar2, p2.c cVar2, long j3, boolean z10, int i10) {
        this.s = k0Var;
        this.q = k0Var.c;
        this.i = hVar;
        this.h = cVar;
        this.j = aVar;
        this.k = nVar;
        this.l = aVar2;
        this.o = cVar2;
        this.p = j3;
        this.m = z10;
        this.n = i10;
    }

    public static p2.g u(long j3, List list) {
        p2.g gVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.g gVar2 = (p2.g) list.get(i10);
            long j10 = gVar2.e;
            if (j10 > j3 || !gVar2.w) {
                if (j10 > j3) {
                    break;
                }
            } else {
                gVar = gVar2;
            }
        }
        return gVar;
    }

    @Override // u2.a
    public final boolean a(k0 k0Var) {
        k0 i10 = i();
        f0 f0Var = i10.b;
        f0Var.getClass();
        f0 f0Var2 = k0Var.b;
        return f0Var2 != null && f0Var2.a.equals(f0Var.a) && f0Var2.e.equals(f0Var.e) && Objects.equals(f0Var2.c, f0Var.c) && i10.c.equals(k0Var.c);
    }

    @Override // u2.a
    public final u2.e0 c(g0 g0Var, y2.d dVar, long j3) {
        a5.a b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.c, 0, g0Var);
        c0 c0Var = this.r;
        j2.k kVar = this.g;
        e2.d.h(kVar);
        return new k(this.h, this.o, this.i, c0Var, this.k, jVar, this.l, b10, dVar, this.j, this.m, this.n, kVar);
    }

    @Override // u2.a
    public final synchronized k0 i() {
        return this.s;
    }

    @Override // u2.a
    public final void k() {
        p2.c cVar = this.o;
        y2.n nVar = cVar.h;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.b.a();
            IOException iOException = bVar.s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // u2.a
    public final void m(c0 c0Var) {
        this.r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.g;
        e2.d.h(kVar);
        n2.n nVar = this.k;
        nVar.C(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().b;
        f0Var.getClass();
        Uri uri = f0Var.a;
        p2.c cVar = this.o;
        cVar.getClass();
        cVar.n = d0.o(null);
        cVar.f = b10;
        cVar.r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.q qVar = new y2.q(((g2.g) cVar.a.b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.b.J());
        e2.d.g(cVar.h == null);
        y2.n nVar2 = new y2.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = nVar2;
        nVar2.f(qVar, cVar, cVar.c.o3(qVar.c));
    }

    @Override // u2.a
    public final void o(u2.e0 e0Var) {
        k kVar = (k) e0Var;
        kVar.b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.k();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.g = null;
                    }
                }
            }
            i iVar = qVar.d;
            p2.b bVar = (p2.b) iVar.g.d.get(iVar.e[iVar.r.l()]);
            if (bVar != null) {
                bVar.v = false;
            }
            iVar.n = null;
            qVar.s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override // u2.a
    public final void q() {
        p2.c cVar = this.o;
        cVar.v = null;
        cVar.w = null;
        cVar.s = null;
        cVar.y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((p2.b) it.next()).b.e(null);
        }
        cVar.n.removeCallbacksAndMessages(null);
        cVar.n = null;
        hashMap.clear();
        this.k.release();
    }

    @Override // u2.a
    public final synchronized void t(k0 k0Var) {
        this.s = k0Var;
    }

    public final void v(p2.l lVar) {
        long j3;
        j1 j1Var;
        long j10;
        long j11;
        long j12;
        boolean z10 = lVar.p;
        boolean z11 = lVar.g;
        i0 i0Var = lVar.r;
        long j13 = lVar.u;
        long j14 = lVar.e;
        int i10 = lVar.d;
        long j15 = lVar.h;
        long e02 = z10 ? d0.e0(j15) : -9223372036854775807L;
        long j16 = (i10 == 2 || i10 == 1) ? e02 : -9223372036854775807L;
        p2.c cVar = this.o;
        cVar.s.getClass();
        na.d dVar = new na.d(16);
        long j17 = 0;
        if (cVar.x) {
            p2.k kVar = lVar.v;
            long j18 = j15 - cVar.y;
            boolean z12 = lVar.o;
            long j19 = z12 ? j18 + j13 : -9223372036854775807L;
            long Q = lVar.p ? d0.Q(d0.A(this.p)) - (j15 + j13) : 0L;
            long j20 = this.q.a;
            if (j20 != -9223372036854775807L) {
                j11 = d0.Q(j20);
            } else {
                if (j14 != -9223372036854775807L) {
                    j10 = j13 - j14;
                } else {
                    j10 = kVar.d;
                    if (j10 == -9223372036854775807L || lVar.n == -9223372036854775807L) {
                        j10 = kVar.c;
                        if (j10 == -9223372036854775807L) {
                            j10 = 3 * lVar.m;
                        }
                    }
                }
                j11 = j10 + Q;
            }
            long j21 = j13 + Q;
            long i11 = d0.i(j11, Q, j21);
            e0 e0Var = i().c;
            boolean z13 = e0Var.d == -3.4028235E38f && e0Var.e == -3.4028235E38f && kVar.c == -9223372036854775807L && kVar.d == -9223372036854775807L;
            b2.d0 d0Var = new b2.d0();
            d0Var.a = d0.e0(i11);
            d0Var.d = z13 ? 1.0f : this.q.d;
            d0Var.e = z13 ? 1.0f : this.q.e;
            e0 e0Var2 = new e0(d0Var);
            this.q = e0Var2;
            if (j14 == -9223372036854775807L) {
                j14 = j21 - d0.Q(e0Var2.a);
            }
            if (z11) {
                j17 = j14;
            } else {
                p2.g u10 = u(j14, lVar.s);
                if (u10 != null) {
                    j12 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(d0.c(i0Var, Long.valueOf(j14), true));
                    p2.g u11 = u(j14, iVar.x);
                    j12 = u11 != null ? u11.e : iVar.e;
                }
                j17 = j12;
            }
            j1Var = new j1(j16, e02, j19, lVar.u, j18, j17, true, !z12, i10 == 2 && lVar.f, dVar, i(), this.q);
        } else {
            if (j14 == -9223372036854775807L || i0Var.isEmpty()) {
                j3 = 0;
            } else {
                if (!z11 && j14 != j13) {
                    j14 = ((p2.i) i0Var.get(d0.c(i0Var, Long.valueOf(j14), true))).e;
                }
                j3 = j14;
            }
            long j22 = lVar.u;
            j1Var = new j1(j16, e02, j22, j22, 0L, j3, true, false, true, dVar, i(), null);
        }
        n(j1Var);
    }
}
