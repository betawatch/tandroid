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
import ji.u4;
import u2.d0;
import u2.h1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l extends u2.a {
    public final c h;
    public final u4 i;
    public final qb.b j;
    public final n2.m k;
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

    public l(k0 k0Var, u4 u4Var, c cVar, qb.b bVar, n2.m mVar, rb.a aVar, p2.c cVar2, long j3, boolean z10, int i10) {
        this.s = k0Var;
        this.q = k0Var.c;
        this.i = u4Var;
        this.h = cVar;
        this.j = bVar;
        this.k = mVar;
        this.l = aVar;
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
        p2.c cVar = this.o;
        y2.m mVar = cVar.h;
        if (mVar != null) {
            mVar.b();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p2.b bVar = (p2.b) cVar.d.get(uri);
            bVar.b.b();
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
        n2.m mVar = this.k;
        mVar.B(myLooper, kVar);
        mVar.b();
        a5.a b10 = b(null);
        f0 f0Var = i().b;
        f0Var.getClass();
        Uri uri = f0Var.a;
        p2.c cVar = this.o;
        cVar.getClass();
        cVar.n = e2.d0.o(null);
        cVar.f = b10;
        cVar.r = this;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(((g2.g) cVar.a.b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, cVar.b.U());
        e2.d.g(cVar.h == null);
        y2.m mVar2 = new y2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = mVar2;
        mVar2.f(pVar, cVar, cVar.c.L3(pVar.c));
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
        h1 h1Var;
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z11 = lVar.p;
        boolean z12 = lVar.g;
        i0 i0Var = lVar.r;
        long j14 = lVar.u;
        long j15 = lVar.e;
        int i10 = lVar.d;
        long j16 = lVar.h;
        long e02 = z11 ? e2.d0.e0(j16) : -9223372036854775807L;
        long j17 = (i10 == 2 || i10 == 1) ? e02 : -9223372036854775807L;
        p2.c cVar = this.o;
        cVar.s.getClass();
        na.d dVar = new na.d();
        long j18 = 0;
        if (cVar.x) {
            p2.k kVar = lVar.v;
            long j19 = j16 - cVar.y;
            boolean z13 = lVar.o;
            long j20 = z13 ? j19 + j14 : -9223372036854775807L;
            if (lVar.p) {
                z10 = z12;
                j10 = e2.d0.Q(e2.d0.A(this.p)) - (j16 + j14);
            } else {
                z10 = z12;
                j10 = 0;
            }
            long j21 = this.q.a;
            if (j21 != -9223372036854775807L) {
                j12 = e2.d0.Q(j21);
            } else {
                if (j15 != -9223372036854775807L) {
                    j11 = j14 - j15;
                } else {
                    j11 = kVar.d;
                    if (j11 == -9223372036854775807L || lVar.n == -9223372036854775807L) {
                        j11 = kVar.c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * lVar.m;
                        }
                    }
                }
                j12 = j11 + j10;
            }
            long j22 = j14 + j10;
            long i11 = e2.d0.i(j12, j10, j22);
            e0 e0Var = i().c;
            boolean z14 = e0Var.d == -3.4028235E38f && e0Var.e == -3.4028235E38f && kVar.c == -9223372036854775807L && kVar.d == -9223372036854775807L;
            b2.d0 d0Var = new b2.d0();
            d0Var.a = e2.d0.e0(i11);
            d0Var.d = z14 ? 1.0f : this.q.d;
            d0Var.e = z14 ? 1.0f : this.q.e;
            e0 e0Var2 = new e0(d0Var);
            this.q = e0Var2;
            if (j15 == -9223372036854775807L) {
                j15 = j22 - e2.d0.Q(e0Var2.a);
            }
            if (z10) {
                j18 = j15;
            } else {
                p2.g u10 = u(j15, lVar.s);
                if (u10 != null) {
                    j13 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.i iVar = (p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j15), true));
                    p2.g u11 = u(j15, iVar.x);
                    j13 = u11 != null ? u11.e : iVar.e;
                }
                j18 = j13;
            }
            h1Var = new h1(j17, e02, j20, lVar.u, j19, j18, true, !z13, i10 == 2 && lVar.f, dVar, i(), this.q);
        } else {
            if (j15 == -9223372036854775807L || i0Var.isEmpty()) {
                j3 = 0;
            } else {
                if (!z12 && j15 != j14) {
                    j15 = ((p2.i) i0Var.get(e2.d0.c(i0Var, Long.valueOf(j15), true))).e;
                }
                j3 = j15;
            }
            long j23 = lVar.u;
            h1Var = new h1(j17, e02, j23, j23, 0L, j3, true, false, true, dVar, i(), null);
        }
        n(h1Var);
    }
}
