package o4;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.exoplayer2.upstream.y0;
import d5.f0;
import h3.b1;
import h3.c1;
import h3.f1;
import h3.r0;
import j4.a0;
import j4.d0;
import j4.h0;
import j4.h1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n5.e0;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends j4.a {
    public final j h;
    public final c1 i;
    public final e0 j;
    public final za.a k;
    public final l3.i l;
    public final v9.d m;
    public final boolean n;
    public final int o;
    public final p4.c p;
    public final long q;
    public final f1 r;
    public b1 s;
    public y0 t;

    static {
        r0.a("goog.exo.hls");
    }

    public m(f1 f1Var, e0 e0Var, c cVar, za.a aVar, l3.i iVar, v9.d dVar, p4.c cVar2, long j10, boolean z10, int i9) {
        c1 c1Var = f1Var.b;
        c1Var.getClass();
        this.i = c1Var;
        this.r = f1Var;
        this.s = f1Var.c;
        this.j = e0Var;
        this.h = cVar;
        this.k = aVar;
        this.l = iVar;
        this.m = dVar;
        this.p = cVar2;
        this.q = j10;
        this.n = z10;
        this.o = i9;
    }

    public static p4.e s(long j10, List list) {
        p4.e eVar = null;
        for (int i9 = 0; i9 < list.size(); i9++) {
            p4.e eVar2 = (p4.e) list.get(i9);
            long j11 = eVar2.e;
            if (j11 > j10 || !eVar2.w) {
                if (j11 > j10) {
                    break;
                }
            } else {
                eVar = eVar2;
            }
        }
        return eVar;
    }

    @Override // j4.a
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        h0 a2 = a(d0Var);
        a6.a aVar = new a6.a((CopyOnWriteArrayList) this.d.d, 0, d0Var, 14);
        y0 y0Var = this.t;
        i3.l lVar = this.g;
        d5.a.j(lVar);
        return new l(this.h, this.p, this.j, y0Var, this.l, aVar, this.m, a2, rVar, this.k, this.n, this.o, lVar);
    }

    @Override // j4.a
    public final f1 h() {
        return this.r;
    }

    @Override // j4.a
    public final void j() {
        p4.c cVar = this.p;
        q0 q0Var = cVar.h;
        if (q0Var != null) {
            q0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p4.b bVar = (p4.b) cVar.d.get(uri);
            bVar.b.a();
            IOException iOException = bVar.s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // j4.a
    public final void l(y0 y0Var) {
        this.t = y0Var;
        l3.i iVar = this.l;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        i3.l lVar = this.g;
        d5.a.j(lVar);
        iVar.H(myLooper, lVar);
        h0 a2 = a(null);
        Uri uri = this.i.a;
        p4.c cVar = this.p;
        cVar.getClass();
        cVar.n = f0.k(null);
        cVar.f = a2;
        cVar.r = this;
        t0 t0Var = new t0(((com.google.android.exoplayer2.upstream.l) cVar.a.b).createDataSource(), uri, 4, cVar.b.V1());
        d5.a.i(cVar.h == null);
        q0 q0Var = new q0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = q0Var;
        v9.d dVar = cVar.c;
        int i9 = t0Var.c;
        q0Var.f(t0Var, cVar, dVar.l3(i9));
        a2.k(new j4.q(t0Var.b), i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // j4.a
    public final void n(a0 a0Var) {
        l lVar = (l) a0Var;
        lVar.b.e.remove(lVar);
        for (r rVar : lVar.F) {
            if (rVar.P) {
                for (q qVar : rVar.H) {
                    qVar.i();
                    l3.e eVar = qVar.h;
                    if (eVar != null) {
                        eVar.k(qVar.e);
                        qVar.h = null;
                        qVar.g = null;
                    }
                }
            }
            rVar.s.e(rVar);
            rVar.D.removeCallbacksAndMessages(null);
            rVar.T = true;
            rVar.E.clear();
        }
        lVar.C = null;
    }

    @Override // j4.a
    public final void p() {
        p4.c cVar = this.p;
        cVar.v = null;
        cVar.w = null;
        cVar.s = null;
        cVar.y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((p4.b) it.next()).b.e(null);
        }
        cVar.n.removeCallbacksAndMessages(null);
        cVar.n = null;
        hashMap.clear();
        this.l.release();
    }

    public final void t(p4.j jVar) {
        long j10;
        h1 h1Var;
        long j11;
        long j12;
        long j13;
        boolean z10 = jVar.p;
        boolean z11 = jVar.g;
        z zVar = jVar.r;
        long j14 = jVar.u;
        long j15 = jVar.e;
        int i9 = jVar.d;
        long j16 = jVar.h;
        long S = z10 ? f0.S(j16) : -9223372036854775807L;
        long j17 = (i9 == 2 || i9 == 1) ? S : -9223372036854775807L;
        p4.c cVar = this.p;
        p4.m mVar = cVar.s;
        mVar.getClass();
        c cVar2 = new c();
        new p4.d(mVar.a, mVar.b, mVar.e, mVar.f, mVar.g, mVar.h, mVar.i, mVar.j, mVar.k, mVar.c, mVar.l, mVar.m);
        if (cVar.x) {
            p4.i iVar = jVar.v;
            long j18 = j16 - cVar.y;
            boolean z12 = jVar.o;
            long j19 = z12 ? j18 + j14 : -9223372036854775807L;
            long H = jVar.p ? f0.H(f0.t(this.q)) - (j16 + j14) : 0L;
            long j20 = this.s.a;
            if (j20 != -9223372036854775807L) {
                j12 = f0.H(j20);
            } else {
                if (j15 != -9223372036854775807L) {
                    j11 = j14 - j15;
                } else {
                    j11 = iVar.d;
                    if (j11 == -9223372036854775807L || jVar.n == -9223372036854775807L) {
                        j11 = iVar.c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * jVar.m;
                        }
                    }
                }
                j12 = j11 + H;
            }
            long j21 = j14 + H;
            long i10 = f0.i(j12, H, j21);
            b1 b1Var = this.r.c;
            boolean z13 = b1Var.d == -3.4028235E38f && b1Var.e == -3.4028235E38f && iVar.c == -9223372036854775807L && iVar.d == -9223372036854775807L;
            long S2 = f0.S(i10);
            this.s = new b1(S2, -9223372036854775807L, -9223372036854775807L, z13 ? 1.0f : this.s.d, z13 ? 1.0f : this.s.e);
            if (j15 == -9223372036854775807L) {
                j15 = j21 - f0.H(S2);
            }
            if (z11) {
                j13 = j15;
            } else {
                p4.e s10 = s(j15, jVar.s);
                if (s10 != null) {
                    j13 = s10.e;
                } else if (zVar.isEmpty()) {
                    j13 = 0;
                } else {
                    p4.g gVar = (p4.g) zVar.get(f0.c(zVar, Long.valueOf(j15), true));
                    p4.e s11 = s(j15, gVar.x);
                    j13 = s11 != null ? s11.e : gVar.e;
                }
            }
            h1Var = new h1(j17, S, j19, jVar.u, j18, j13, true, !z12, i9 == 2 && jVar.f, cVar2, this.r, this.s);
        } else {
            if (j15 == -9223372036854775807L || zVar.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && j15 != j14) {
                    j15 = ((p4.g) zVar.get(f0.c(zVar, Long.valueOf(j15), true))).e;
                }
                j10 = j15;
            }
            long j22 = jVar.u;
            h1Var = new h1(j17, S, j22, j22, 0L, j10, true, false, true, cVar2, this.r, null);
        }
        m(h1Var);
    }
}
