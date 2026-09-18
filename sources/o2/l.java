package o2;

import android.net.Uri;
import android.os.Looper;
import b2.e0;
import b2.f0;
import b2.k0;
import b2.l0;
import e9.i0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.u;
import u2.d0;
import u2.h1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class l extends u2.a {
    public final c h;
    public final u i;
    public final ob.a j;
    public final n2.m k;
    public final qb.b l;
    public final boolean m;
    public final int n;
    public final p2.d o;
    public final long p;
    public e0 q;
    public c0 r;
    public k0 s;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public l(k0 k0Var, u uVar, c cVar, ob.a aVar, n2.m mVar, qb.b bVar, p2.d dVar, long j3, boolean z10, int i10) {
        this.s = k0Var;
        this.q = k0Var.c;
        this.i = uVar;
        this.h = cVar;
        this.j = aVar;
        this.k = mVar;
        this.l = bVar;
        this.o = dVar;
        this.p = j3;
        this.m = z10;
        this.n = i10;
    }

    public static p2.h u(long j3, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j10 = hVar2.e;
            if (j10 > j3 || !hVar2.w) {
                if (j10 > j3) {
                    break;
                }
            } else {
                hVar = hVar2;
            }
        }
        return hVar;
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
    public final d0 c(u2.f0 f0Var, y2.d dVar, long j3) {
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.c, 0, f0Var);
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
        p2.d dVar = this.o;
        y2.m mVar = dVar.h;
        if (mVar != null) {
            mVar.a();
        }
        Uri uri = dVar.v;
        if (uri != null) {
            p2.c cVar = (p2.c) dVar.d.get(uri);
            cVar.b.a();
            IOException iOException = cVar.s;
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
        n2.m mVar = this.k;
        mVar.C(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().b;
        f0Var.getClass();
        Uri uri = f0Var.a;
        p2.d dVar = this.o;
        dVar.getClass();
        dVar.n = e2.d0.o(null);
        dVar.f = b10;
        dVar.r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(((g2.g) dVar.a.b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.b.D());
        e2.d.g(dVar.h == null);
        y2.m mVar2 = new y2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = mVar2;
        mVar2.f(pVar, dVar, dVar.c.L3(pVar.c));
    }

    @Override // u2.a
    public final void o(d0 d0Var) {
        k kVar = (k) d0Var;
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
            p2.c cVar = (p2.c) iVar.g.d.get(iVar.e[iVar.r.l()]);
            if (cVar != null) {
                cVar.v = false;
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
        p2.d dVar = this.o;
        dVar.v = null;
        dVar.w = null;
        dVar.s = null;
        dVar.y = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((p2.c) it.next()).b.e(null);
        }
        dVar.n.removeCallbacksAndMessages(null);
        dVar.n = null;
        hashMap.clear();
        this.k.release();
    }

    @Override // u2.a
    public final synchronized void t(k0 k0Var) {
        this.s = k0Var;
    }

    public final void v(p2.m mVar) {
        long j3;
        h1 h1Var;
        long j10;
        long j11;
        long j12;
        boolean z10 = mVar.p;
        boolean z11 = mVar.g;
        i0 i0Var = mVar.r;
        long j13 = mVar.u;
        long j14 = mVar.e;
        int i10 = mVar.d;
        long j15 = mVar.h;
        long e02 = z10 ? e2.d0.e0(j15) : -9223372036854775807L;
        long j16 = (i10 == 2 || i10 == 1) ? e02 : -9223372036854775807L;
        p2.d dVar = this.o;
        dVar.s.getClass();
        na.d dVar2 = new na.d(16);
        long j17 = 0;
        if (dVar.x) {
            p2.l lVar = mVar.v;
            long j18 = j15 - dVar.y;
            boolean z12 = mVar.o;
            long j19 = z12 ? j18 + j13 : -9223372036854775807L;
            long Q = mVar.p ? e2.d0.Q(e2.d0.A(this.p)) - (j15 + j13) : 0L;
            long j20 = this.q.a;
            if (j20 != -9223372036854775807L) {
                j11 = e2.d0.Q(j20);
            } else {
                if (j14 != -9223372036854775807L) {
                    j10 = j13 - j14;
                } else {
                    j10 = lVar.d;
                    if (j10 == -9223372036854775807L || mVar.n == -9223372036854775807L) {
                        j10 = lVar.c;
                        if (j10 == -9223372036854775807L) {
                            j10 = 3 * mVar.m;
                        }
                    }
                }
                j11 = j10 + Q;
            }
            long j21 = j13 + Q;
            long i11 = e2.d0.i(j11, Q, j21);
            e0 e0Var = i().c;
            boolean z13 = e0Var.d == -3.4028235E38f && e0Var.e == -3.4028235E38f && lVar.c == -9223372036854775807L && lVar.d == -9223372036854775807L;
            b2.d0 d0Var = new b2.d0();
            d0Var.a = e2.d0.e0(i11);
            d0Var.d = z13 ? 1.0f : this.q.d;
            d0Var.e = z13 ? 1.0f : this.q.e;
            e0 e0Var2 = new e0(d0Var);
            this.q = e0Var2;
            if (j14 == -9223372036854775807L) {
                j14 = j21 - e2.d0.Q(e0Var2.a);
            }
            if (z11) {
                j17 = j14;
            } else {
                p2.h u10 = u(j14, mVar.s);
                if (u10 != null) {
                    j12 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.j jVar = (p2.j) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j14), true));
                    p2.h u11 = u(j14, jVar.x);
                    j12 = u11 != null ? u11.e : jVar.e;
                }
                j17 = j12;
            }
            h1Var = new h1(j16, e02, j19, mVar.u, j18, j17, true, !z12, i10 == 2 && mVar.f, dVar2, i(), this.q);
        } else {
            if (j14 == -9223372036854775807L || i0Var.isEmpty()) {
                j3 = 0;
            } else {
                if (!z11 && j14 != j13) {
                    j14 = ((p2.j) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j14), true))).e;
                }
                j3 = j14;
            }
            long j22 = mVar.u;
            h1Var = new h1(j16, e02, j22, j22, 0L, j3, true, false, true, dVar2, i(), null);
        }
        n(h1Var);
    }
}
