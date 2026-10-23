package o2;

import android.net.Uri;
import android.os.Looper;
import b2.i0;
import b2.j0;
import b2.o0;
import b2.p0;
import b2.w0;
import e2.m0;
import e9.n0;
import g2.c0;
import i2.o1;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t7.u;
import u2.f0;
import u2.h0;
import u2.l1;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class l extends u2.a {
    public final c h;
    public final l2.f i;
    public final oa.d j;
    public final n2.n k;
    public final oa.d l;
    public final boolean m;
    public final int n;
    public final p2.e o;
    public final long p;
    public i0 q;
    public c0 r;
    public o0 s;

    static {
        p0.a("media3.exoplayer.hls");
    }

    public l(o0 o0Var, l2.f fVar, c cVar, oa.d dVar, n2.n nVar, oa.d dVar2, p2.e eVar, long j10, boolean z10, int i10) {
        this.s = o0Var;
        this.q = o0Var.c;
        this.i = fVar;
        this.h = cVar;
        this.j = dVar;
        this.k = nVar;
        this.l = dVar2;
        this.o = eVar;
        this.p = j10;
        this.m = z10;
        this.n = i10;
    }

    public static p2.i u(long j10, List list) {
        p2.i iVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p2.i iVar2 = (p2.i) list.get(i10);
            long j11 = iVar2.e;
            if (j11 > j10 || !iVar2.w) {
                if (j11 > j10) {
                    break;
                }
            } else {
                iVar = iVar2;
            }
        }
        return iVar;
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
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        a5.a b10 = b(h0Var);
        n2.k kVar = new n2.k(this.d.c, 0, h0Var);
        c0 c0Var = this.r;
        j2.j jVar = this.g;
        jVar.getClass();
        return new k(this.h, this.o, this.i, c0Var, this.k, kVar, this.l, b10, eVar, this.j, this.m, this.n, jVar);
    }

    @Override // u2.a
    public final synchronized o0 i() {
        return this.s;
    }

    @Override // u2.a
    public final void k() {
        p2.e eVar = this.o;
        y2.l lVar = eVar.h;
        if (lVar != null) {
            lVar.a();
        }
        w0 w0Var = eVar.v;
        if (w0Var != null) {
            throw w0Var;
        }
        Uri uri = eVar.F;
        if (uri != null) {
            eVar.i(uri);
        }
    }

    @Override // u2.a
    public final void m(c0 c0Var) {
        this.r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.j jVar = this.g;
        jVar.getClass();
        n2.n nVar = this.k;
        nVar.E(myLooper, jVar);
        nVar.b();
        a5.a b10 = b(null);
        j0 j0Var = i().b;
        j0Var.getClass();
        Uri uri = j0Var.a;
        p2.e eVar = this.o;
        eVar.getClass();
        eVar.n = m0.q(null);
        eVar.f = b10;
        eVar.r = this;
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(((g2.g) eVar.a.b).createDataSource(), new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, eVar.b.J());
        u6.p(eVar.h == null);
        y2.l lVar = new y2.l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        eVar.h = lVar;
        lVar.f(oVar, eVar, eVar.c.y3(oVar.c));
    }

    @Override // u2.a
    public final void o(f0 f0Var) {
        k kVar = (k) f0Var;
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
            p2.e eVar = iVar.g;
            Uri c10 = iVar.e[l4].c();
            p2.d dVar = (p2.d) eVar.d.get(c10);
            if (dVar != null) {
                p2.c cVar = (p2.c) o1.j(dVar.b, c10, c10);
                cVar.getClass();
                cVar.w = false;
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
        p2.e eVar = this.o;
        eVar.F = null;
        eVar.G = null;
        eVar.s = null;
        eVar.w = null;
        eVar.x = null;
        eVar.y = null;
        eVar.E = null;
        eVar.v = null;
        eVar.I = -9223372036854775807L;
        eVar.h.e(null);
        eVar.h = null;
        HashMap hashMap = eVar.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((p2.d) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((p2.c) it2.next()).c.e(null);
            }
        }
        eVar.n.removeCallbacksAndMessages(null);
        eVar.n = null;
        hashMap.clear();
        this.k.release();
    }

    @Override // u2.a
    public final synchronized void t(o0 o0Var) {
        this.s = o0Var;
    }

    public final void v(p2.n nVar) {
        long j10;
        l1 l1Var;
        long j11;
        long j12;
        long j13;
        boolean z10 = nVar.p;
        boolean z11 = nVar.g;
        n0 n0Var = nVar.r;
        long j14 = nVar.u;
        long j15 = nVar.e;
        int i10 = nVar.d;
        long j16 = nVar.h;
        long h02 = z10 ? m0.h0(j16) : -9223372036854775807L;
        long j17 = (i10 == 2 || i10 == 1) ? h02 : -9223372036854775807L;
        p2.e eVar = this.o;
        eVar.s.getClass();
        u uVar = new u(14);
        long j18 = 0;
        if (eVar.H) {
            p2.m mVar = nVar.v;
            long j19 = j16 - eVar.I;
            boolean z12 = nVar.o;
            long j20 = z12 ? j19 + j14 : -9223372036854775807L;
            long S = nVar.p ? m0.S(m0.C(this.p)) - (j16 + j14) : 0L;
            long j21 = this.q.a;
            if (j21 != -9223372036854775807L) {
                j12 = m0.S(j21);
            } else {
                if (j15 != -9223372036854775807L) {
                    j11 = j14 - j15;
                } else {
                    j11 = mVar.d;
                    if (j11 == -9223372036854775807L || nVar.n == -9223372036854775807L) {
                        j11 = mVar.c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * nVar.m;
                        }
                    }
                }
                j12 = j11 + S;
            }
            long j22 = j14 + S;
            long j23 = m0.j(j12, S, j22);
            i0 i0Var = i().c;
            boolean z13 = i0Var.d == -3.4028235E38f && i0Var.e == -3.4028235E38f && mVar.c == -9223372036854775807L && mVar.d == -9223372036854775807L;
            b2.h0 a2 = this.q.a();
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
                p2.i u10 = u(j15, nVar.s);
                if (u10 != null) {
                    j13 = u10.e;
                } else if (!n0Var.isEmpty()) {
                    p2.k kVar = (p2.k) n0Var.get(m0.d(n0Var, Long.valueOf(j15), true));
                    p2.i u11 = u(j15, kVar.x);
                    j13 = u11 != null ? u11.e : kVar.e;
                }
                j18 = j13;
            }
            l1Var = new l1(j17, h02, j20, nVar.u, j19, j18, true, !z12, i10 == 2 && nVar.f, uVar, i(), this.q);
        } else {
            if (j15 == -9223372036854775807L || n0Var.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && j15 != j14) {
                    j15 = ((p2.k) n0Var.get(m0.d(n0Var, Long.valueOf(j15), true))).e;
                }
                j10 = j15;
            }
            long j24 = nVar.u;
            l1Var = new l1(j17, h02, j24, j24, 0L, j10, true, false, true, uVar, i(), null);
        }
        n(l1Var);
    }
}
