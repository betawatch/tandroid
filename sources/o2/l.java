package o2;

import a8.h0;
import a8.ng;
import a8.yb;
import android.net.Uri;
import android.os.Looper;
import b2.j0;
import b2.k0;
import b2.p0;
import b2.q0;
import b2.x0;
import e2.n0;
import f9.i0;
import g2.c0;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import li.e3;
import u2.e0;
import u2.g0;
import u2.j1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l extends u2.a {
    public final c h;
    public final e3 i;
    public final pa.d j;
    public final n2.m k;
    public final u7.s l;
    public final boolean m;
    public final int n;
    public final p2.d o;
    public final long p;
    public j0 q;
    public c0 r;
    public p0 s;

    static {
        q0.a("media3.exoplayer.hls");
    }

    public l(p0 p0Var, e3 e3Var, c cVar, pa.d dVar, n2.m mVar, u7.s sVar, p2.d dVar2, long j10, boolean z10, int i10) {
        this.s = p0Var;
        this.q = p0Var.c;
        this.i = e3Var;
        this.h = cVar;
        this.j = dVar;
        this.k = mVar;
        this.l = sVar;
        this.o = dVar2;
        this.p = j10;
        this.m = z10;
        this.n = i10;
    }

    public static p2.h u(long j10, List list) {
        p2.h hVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.h hVar2 = (p2.h) list.get(i10);
            long j11 = hVar2.e;
            if (j11 > j10 || !hVar2.w) {
                if (j11 > j10) {
                    break;
                }
            } else {
                hVar = hVar2;
            }
        }
        return hVar;
    }

    @Override // u2.a
    public final boolean a(p0 p0Var) {
        p0 i10 = i();
        k0 k0Var = i10.b;
        k0Var.getClass();
        k0 k0Var2 = p0Var.b;
        return k0Var2 != null && k0Var2.a.equals(k0Var.a) && k0Var2.e.equals(k0Var.e) && Objects.equals(k0Var2.c, k0Var.c) && i10.c.equals(p0Var.c);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, h0 h0Var, long j10) {
        ng b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.c, 0, g0Var);
        c0 c0Var = this.r;
        j2.j jVar2 = this.g;
        jVar2.getClass();
        return new k(this.h, this.o, this.i, c0Var, this.k, jVar, this.l, b10, h0Var, this.j, this.m, this.n, jVar2);
    }

    @Override // u2.a
    public final synchronized p0 i() {
        return this.s;
    }

    @Override // u2.a
    public final void k() {
        p2.d dVar = this.o;
        y2.l lVar = dVar.h;
        if (lVar != null) {
            lVar.d();
        }
        x0 x0Var = dVar.v;
        if (x0Var != null) {
            throw x0Var;
        }
        Uri uri = dVar.F;
        if (uri != null) {
            dVar.h(uri);
        }
    }

    @Override // u2.a
    public final void m(c0 c0Var) {
        this.r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.j jVar = this.g;
        jVar.getClass();
        n2.m mVar = this.k;
        mVar.f(myLooper, jVar);
        mVar.a();
        ng b10 = b(null);
        k0 k0Var = i().b;
        k0Var.getClass();
        Uri uri = k0Var.a;
        p2.d dVar = this.o;
        dVar.getClass();
        dVar.n = n0.q(null);
        dVar.f = b10;
        dVar.r = this;
        Map map = Collections.EMPTY_MAP;
        yb.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) dVar.a.b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.b.G());
        yb.p(dVar.h == null);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = lVar;
        lVar.f(oVar, dVar, dVar.c.B0(oVar.c));
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        k kVar = (k) e0Var;
        kVar.b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    n2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.a(pVar.e);
                        pVar.h = null;
                        pVar.g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l4 = iVar.r.l();
            p2.d dVar = iVar.g;
            Uri c10 = iVar.e[l4].c();
            p2.c cVar = (p2.c) dVar.d.get(c10);
            if (cVar != null) {
                p2.b bVar = (p2.b) ic.a.h(cVar.b, c10, c10);
                bVar.getClass();
                bVar.w = false;
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
        dVar.F = null;
        dVar.G = null;
        dVar.s = null;
        dVar.w = null;
        dVar.x = null;
        dVar.y = null;
        dVar.E = null;
        dVar.v = null;
        dVar.I = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((p2.c) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((p2.b) it2.next()).c.e(null);
            }
        }
        dVar.n.removeCallbacksAndMessages(null);
        dVar.n = null;
        hashMap.clear();
        this.k.release();
    }

    @Override // u2.a
    public final synchronized void t(p0 p0Var) {
        this.s = p0Var;
    }

    public final void v(p2.m mVar) {
        long j10;
        j1 j1Var;
        long j11;
        long j12;
        long j13;
        boolean z10 = mVar.p;
        boolean z11 = mVar.g;
        i0 i0Var = mVar.r;
        long j14 = mVar.u;
        long j15 = mVar.e;
        int i10 = mVar.d;
        long j16 = mVar.h;
        long h02 = z10 ? n0.h0(j16) : -9223372036854775807L;
        long j17 = (i10 == 2 || i10 == 1) ? h02 : -9223372036854775807L;
        p2.d dVar = this.o;
        dVar.s.getClass();
        sb.b bVar = new sb.b(14);
        long j18 = 0;
        if (dVar.H) {
            p2.l lVar = mVar.v;
            long j19 = j16 - dVar.I;
            boolean z12 = mVar.o;
            long j20 = z12 ? j19 + j14 : -9223372036854775807L;
            long S = mVar.p ? n0.S(n0.C(this.p)) - (j16 + j14) : 0L;
            long j21 = this.q.a;
            if (j21 != -9223372036854775807L) {
                j12 = n0.S(j21);
            } else {
                if (j15 != -9223372036854775807L) {
                    j11 = j14 - j15;
                } else {
                    j11 = lVar.d;
                    if (j11 == -9223372036854775807L || mVar.n == -9223372036854775807L) {
                        j11 = lVar.c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * mVar.m;
                        }
                    }
                }
                j12 = j11 + S;
            }
            long j22 = j14 + S;
            long j23 = n0.j(j12, S, j22);
            j0 j0Var = i().c;
            boolean z13 = j0Var.d == -3.4028235E38f && j0Var.e == -3.4028235E38f && lVar.c == -9223372036854775807L && lVar.d == -9223372036854775807L;
            b2.i0 a2 = this.q.a();
            a2.a = n0.h0(j23);
            a2.d = z13 ? 1.0f : this.q.d;
            a2.e = z13 ? 1.0f : this.q.e;
            j0 j0Var2 = new j0(a2);
            this.q = j0Var2;
            if (j15 == -9223372036854775807L) {
                j15 = j22 - n0.S(j0Var2.a);
            }
            if (z11) {
                j18 = j15;
            } else {
                p2.h u10 = u(j15, mVar.s);
                if (u10 != null) {
                    j13 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    p2.j jVar = (p2.j) i0Var.get(n0.d(i0Var, Long.valueOf(j15), true));
                    p2.h u11 = u(j15, jVar.x);
                    j13 = u11 != null ? u11.e : jVar.e;
                }
                j18 = j13;
            }
            j1Var = new j1(j17, h02, j20, mVar.u, j19, j18, true, !z12, i10 == 2 && mVar.f, bVar, i(), this.q);
        } else {
            if (j15 == -9223372036854775807L || i0Var.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && j15 != j14) {
                    j15 = ((p2.j) i0Var.get(n0.d(i0Var, Long.valueOf(j15), true))).e;
                }
                j10 = j15;
            }
            long j24 = mVar.u;
            j1Var = new j1(j17, h02, j24, j24, 0L, j10, true, false, true, bVar, i(), null);
        }
        n(j1Var);
    }
}
