package o2;

import android.net.Uri;
import android.os.Looper;
import b2.h0;
import b2.i0;
import b2.j0;
import b2.o0;
import b2.p0;
import b2.w0;
import e2.m0;
import e9.n0;
import g2.c0;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t7.u;
import u2.e0;
import u2.g0;
import u2.k1;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class l extends u2.a {
    public final c h;
    public final l2.f i;
    public final oa.d j;
    public final n2.n k;
    public final oa.d l;
    public final boolean m;
    public final int n;
    public final p2.d o;
    public final long p;
    public i0 q;
    public c0 r;
    public o0 s;

    static {
        p0.a("media3.exoplayer.hls");
    }

    public l(o0 o0Var, l2.f fVar, c cVar, oa.d dVar, n2.n nVar, oa.d dVar2, p2.d dVar3, long j10, boolean z10, int i10) {
        this.s = o0Var;
        this.q = o0Var.c;
        this.i = fVar;
        this.h = cVar;
        this.j = dVar;
        this.k = nVar;
        this.l = dVar2;
        this.o = dVar3;
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
    public final boolean a(o0 o0Var) {
        o0 i10 = i();
        j0 j0Var = i10.b;
        j0Var.getClass();
        j0 j0Var2 = o0Var.b;
        return j0Var2 != null && j0Var2.a.equals(j0Var.a) && j0Var2.e.equals(j0Var.e) && Objects.equals(j0Var2.c, j0Var.c) && i10.c.equals(o0Var.c);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        a5.a b10 = b(g0Var);
        n2.k kVar = new n2.k(this.d.c, 0, g0Var);
        c0 c0Var = this.r;
        j2.k kVar2 = this.g;
        kVar2.getClass();
        return new k(this.h, this.o, this.i, c0Var, this.k, kVar, this.l, b10, eVar, this.j, this.m, this.n, kVar2);
    }

    @Override // u2.a
    public final synchronized o0 i() {
        return this.s;
    }

    @Override // u2.a
    public final void k() {
        p2.d dVar = this.o;
        y2.l lVar = dVar.h;
        if (lVar != null) {
            lVar.a();
        }
        w0 w0Var = dVar.v;
        if (w0Var != null) {
            throw w0Var;
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
        j2.k kVar = this.g;
        kVar.getClass();
        n2.n nVar = this.k;
        nVar.E(myLooper, kVar);
        nVar.b();
        a5.a b10 = b(null);
        j0 j0Var = i().b;
        j0Var.getClass();
        Uri uri = j0Var.a;
        p2.d dVar = this.o;
        dVar.getClass();
        dVar.n = m0.q(null);
        dVar.f = b10;
        dVar.r = this;
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) dVar.a.b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.b.J());
        u6.p(dVar.h == null);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = lVar;
        lVar.f(oVar, dVar, dVar.c.y3(oVar.c));
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        k kVar = (k) e0Var;
        kVar.b.e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    n2.h hVar = pVar.h;
                    if (hVar != null) {
                        hVar.a(pVar.e);
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
                p2.b bVar = (p2.b) i2.d.i(cVar.b, c10, c10);
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
    public final synchronized void t(o0 o0Var) {
        this.s = o0Var;
    }

    public final void v(p2.m mVar) {
        long j10;
        k1 k1Var;
        long j11;
        long j12;
        long j13;
        boolean z10 = mVar.p;
        boolean z11 = mVar.g;
        n0 n0Var = mVar.r;
        long j14 = mVar.u;
        long j15 = mVar.e;
        int i10 = mVar.d;
        long j16 = mVar.h;
        long h02 = z10 ? m0.h0(j16) : -9223372036854775807L;
        long j17 = (i10 == 2 || i10 == 1) ? h02 : -9223372036854775807L;
        p2.d dVar = this.o;
        dVar.s.getClass();
        u uVar = new u(14);
        long j18 = 0;
        if (dVar.H) {
            p2.l lVar = mVar.v;
            long j19 = j16 - dVar.I;
            boolean z12 = mVar.o;
            long j20 = z12 ? j19 + j14 : -9223372036854775807L;
            long S = mVar.p ? m0.S(m0.C(this.p)) - (j16 + j14) : 0L;
            long j21 = this.q.a;
            if (j21 != -9223372036854775807L) {
                j12 = m0.S(j21);
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
            long j23 = m0.j(j12, S, j22);
            i0 i0Var = i().c;
            boolean z13 = i0Var.d == -3.4028235E38f && i0Var.e == -3.4028235E38f && lVar.c == -9223372036854775807L && lVar.d == -9223372036854775807L;
            h0 a2 = this.q.a();
            a2.a = m0.h0(j23);
            a2.d = z13 ? 1.0f : this.q.d;
            a2.e = z13 ? 1.0f : this.q.e;
            i0 i0Var2 = new i0(a2);
            this.q = i0Var2;
            if (j15 == -9223372036854775807L) {
                j15 = j22 - m0.S(i0Var2.a);
            }
            if (z11) {
                j18 = j15;
            } else {
                p2.h u10 = u(j15, mVar.s);
                if (u10 != null) {
                    j13 = u10.e;
                } else if (!n0Var.isEmpty()) {
                    p2.j jVar = (p2.j) n0Var.get(m0.d(n0Var, Long.valueOf(j15), true));
                    p2.h u11 = u(j15, jVar.x);
                    j13 = u11 != null ? u11.e : jVar.e;
                }
                j18 = j13;
            }
            k1Var = new k1(j17, h02, j20, mVar.u, j19, j18, true, !z12, i10 == 2 && mVar.f, uVar, i(), this.q);
        } else {
            if (j15 == -9223372036854775807L || n0Var.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && j15 != j14) {
                    j15 = ((p2.j) n0Var.get(m0.d(n0Var, Long.valueOf(j15), true))).e;
                }
                j10 = j15;
            }
            long j24 = mVar.u;
            k1Var = new k1(j17, h02, j24, j24, 0L, j10, true, false, true, uVar, i(), null);
        }
        n(k1Var);
    }
}
