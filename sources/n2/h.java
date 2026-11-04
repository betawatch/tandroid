package n2;

import a3.q;
import a3.r;
import a3.s;
import a3.t;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.SparseArray;
import b8.kg;
import b8.xc;
import b8.zb;
import d2.h0;
import d2.i0;
import d2.n0;
import d2.o0;
import i2.c0;
import i2.d0;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w2.e0;
import w2.g0;
import w2.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends w2.a {
    public q A;
    public d0 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public o2.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public n0 O;
    public h0 P;
    public final boolean h;
    public final i2.g i;
    public final kg j;
    public final ra.e k;
    public final p2.m l;
    public final kb.a m;
    public final za.p n;
    public final long o;
    public final long p;
    public final kg q;
    public final s r;
    public final hi.d s;
    public final Object t;
    public final SparseArray u;
    public final c v;
    public final c w;
    public final f x;
    public final r y;
    public i2.h z;

    static {
        o0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [n2.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [n2.c] */
    public h(n0 n0Var, i2.g gVar, s sVar, kg kgVar, ra.e eVar, p2.m mVar, kb.a aVar, long j10, long j11) {
        this.O = n0Var;
        this.P = n0Var.c;
        i0 i0Var = n0Var.b;
        i0Var.getClass();
        Uri uri = i0Var.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = gVar;
        this.r = sVar;
        this.j = kgVar;
        this.l = mVar;
        this.m = aVar;
        this.o = j10;
        this.p = j11;
        this.k = eVar;
        this.n = new za.p(6);
        this.h = false;
        this.q = b(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.s = new hi.d(this, 17);
        this.y = new d(this);
        final int i3 = 0;
        this.v = new Runnable(this) { // from class: n2.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        h hVar = this.b;
                        hVar.getClass();
                        try {
                            hVar.z(false);
                            break;
                        } catch (Exception e10) {
                            hVar.C = new IOException(e10);
                        }
                }
            }
        };
        final int i10 = 1;
        this.w = new Runnable(this) { // from class: n2.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        h hVar = this.b;
                        hVar.getClass();
                        try {
                            hVar.z(false);
                            break;
                        } catch (Exception e10) {
                            hVar.C = new IOException(e10);
                        }
                }
            }
        };
    }

    public static boolean v(o2.h hVar) {
        List list = hVar.c;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i10 = ((o2.a) list.get(i3)).b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(e5.a aVar, s sVar) {
        i2.h hVar = this.z;
        Uri parse = Uri.parse(aVar.c);
        Map map = Collections.EMPTY_MAP;
        zb.k(parse, "The uri must be set.");
        this.A.f(new t(hVar, new i2.n(parse, 1, null, map, 0L, -1L, null, 1), 5, sVar), new f(this), 1);
    }

    public final synchronized void B(h0 h0Var) {
        this.P = h0Var;
    }

    public final void C() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.H = true;
            return;
        }
        synchronized (this.t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        zb.k(uri, "The uri must be set.");
        t tVar = new t(this.z, new i2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        hi.d dVar = this.s;
        this.m.getClass();
        this.A.f(tVar, dVar, 3);
    }

    @Override // w2.a
    public final boolean a(n0 n0Var) {
        i0 i0Var = i().b;
        i0Var.getClass();
        i0 i0Var2 = n0Var.b;
        return i0Var2 != null && i0Var2.a.equals(i0Var.a) && i0Var2.e.equals(i0Var.e) && Objects.equals(i0Var2.c, i0Var.c);
    }

    @Override // w2.a
    public final e0 c(g0 g0Var, a0 a0Var, long j10) {
        int intValue = ((Integer) g0Var.a).intValue() - this.N;
        kg b10 = b(g0Var);
        p2.j jVar = new p2.j(this.d.c, 0, g0Var);
        int i3 = this.N + intValue;
        o2.c cVar = this.G;
        d0 d0Var = this.B;
        long j11 = this.K;
        l2.k kVar = this.g;
        kVar.getClass();
        b bVar = new b(i3, cVar, this.n, intValue, this.j, d0Var, this.l, jVar, this.m, b10, j11, this.y, a0Var, this.k, this.x, kVar);
        this.u.put(i3, bVar);
        return bVar;
    }

    @Override // w2.a
    public final synchronized n0 i() {
        return this.O;
    }

    @Override // w2.a
    public final void k() {
        this.y.a();
    }

    @Override // w2.a
    public final void m(d0 d0Var) {
        this.B = d0Var;
        Looper myLooper = Looper.myLooper();
        l2.k kVar = this.g;
        kVar.getClass();
        p2.m mVar = this.l;
        mVar.k(myLooper, kVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.z = this.i.createDataSource();
        this.A = new q("DashMediaSource");
        this.D = g2.n0.q(null);
        C();
    }

    @Override // w2.a
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        p pVar = bVar.y;
        pVar.r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (x2.i iVar : bVar.I) {
            iVar.B(bVar);
        }
        bVar.H = null;
        this.u.remove(bVar.a);
    }

    @Override // w2.a
    public final void q() {
        this.H = false;
        this.z = null;
        q qVar = this.A;
        if (qVar != null) {
            qVar.e(null);
            this.A = null;
        }
        h0 h0Var = i().c;
        synchronized (this) {
            this.P = h0Var;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = -9223372036854775807L;
        this.L = 0;
        this.M = -9223372036854775807L;
        this.u.clear();
        za.p pVar = this.n;
        ((HashMap) pVar.a).clear();
        ((HashMap) pVar.b).clear();
        ((HashMap) pVar.c).clear();
        this.l.release();
    }

    @Override // w2.a
    public final synchronized void t(n0 n0Var) {
        this.O = n0Var;
        this.P = n0Var.c;
    }

    public final synchronized h0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        q qVar = this.A;
        d dVar = new d(this);
        synchronized (b3.b.b) {
            z10 = b3.b.c;
        }
        if (z10) {
            dVar.b();
            return;
        }
        if (qVar == null) {
            qVar = new q("SntpClient");
        }
        qVar.f(new ra.e(3), new c6.i(dVar, 5), 1);
    }

    public final void x(t tVar, long j10, long j11) {
        long j12 = tVar.a;
        i2.n nVar = tVar.b;
        c0 c0Var = tVar.d;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.m.getClass();
        this.q.p(uVar, tVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        g2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0201 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(boolean z10) {
        o2.h hVar;
        long j10;
        long j11;
        h hVar2;
        long j12;
        boolean z11;
        long j13;
        o2.c cVar;
        boolean z12;
        long j14;
        long j15;
        o2.h hVar3;
        long j16;
        int i3;
        long j17;
        h0 h0Var;
        float f10;
        long j18;
        float f11;
        boolean z13;
        i c2;
        long j19;
        SparseArray sparseArray;
        int i10;
        boolean z14;
        SparseArray sparseArray2;
        x2.i[] iVarArr;
        c cVar2 = this.w;
        long j20 = this.p;
        SparseArray sparseArray3 = this.u;
        boolean z15 = false;
        int i11 = 0;
        while (i11 < sparseArray3.size()) {
            int keyAt = sparseArray3.keyAt(i11);
            if (keyAt >= this.N) {
                b bVar = (b) sparseArray3.valueAt(i11);
                o2.c cVar3 = this.G;
                int i12 = keyAt - this.N;
                bVar.L = cVar3;
                bVar.M = i12;
                p pVar = bVar.y;
                pVar.n = z15;
                pVar.f = cVar3;
                Iterator it = pVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    int i13 = i11;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < pVar.f.h) {
                        it.remove();
                    }
                    i11 = i13;
                }
                i10 = i11;
                x2.i[] iVarArr2 = bVar.I;
                if (iVarArr2 != null) {
                    int length = iVarArr2.length;
                    int i14 = 0;
                    while (i14 < length) {
                        l lVar = iVarArr2[i14].e;
                        j[] jVarArr = lVar.i;
                        try {
                            lVar.k = cVar3;
                            lVar.l = i12;
                            long d = cVar3.d(i12);
                            try {
                                ArrayList a10 = lVar.a();
                                sparseArray2 = sparseArray3;
                                iVarArr = iVarArr2;
                                int i15 = 0;
                                while (i15 < jVarArr.length) {
                                    try {
                                        j[] jVarArr2 = jVarArr;
                                        jVarArr2[i15] = jVarArr2[i15].a(d, (o2.m) a10.get(lVar.j.i(i15)));
                                        i15++;
                                        jVarArr = jVarArr2;
                                    } catch (w2.b e10) {
                                        e = e10;
                                        lVar.m = e;
                                        i14++;
                                        sparseArray3 = sparseArray2;
                                        iVarArr2 = iVarArr;
                                    }
                                }
                            } catch (w2.b e11) {
                                e = e11;
                                sparseArray2 = sparseArray3;
                                iVarArr = iVarArr2;
                            }
                        } catch (w2.b e12) {
                            e = e12;
                            sparseArray2 = sparseArray3;
                            iVarArr = iVarArr2;
                        }
                        i14++;
                        sparseArray3 = sparseArray2;
                        iVarArr2 = iVarArr;
                    }
                    sparseArray = sparseArray3;
                    z14 = true;
                    bVar.H.k(bVar);
                } else {
                    sparseArray = sparseArray3;
                    z14 = true;
                }
                bVar.N = cVar3.b(i12).d;
                for (m mVar : bVar.J) {
                    Iterator it2 = bVar.N.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            o2.g gVar = (o2.g) it2.next();
                            if (gVar.a().equals(mVar.e.a())) {
                                mVar.b(gVar, (cVar3.d && i12 == cVar3.m.size() + (-1)) ? z14 : false);
                            }
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i10 = i11;
            }
            i11 = i10 + 1;
            sparseArray3 = sparseArray;
            z15 = false;
        }
        int i16 = 1;
        o2.h b10 = this.G.b(0);
        int size = this.G.m.size() - 1;
        o2.h b11 = this.G.b(size);
        long d10 = this.G.d(size);
        long S = g2.n0.S(g2.n0.C(this.K));
        long d11 = this.G.d(0);
        long j21 = b10.b;
        List list = b10.c;
        long S2 = g2.n0.S(j21);
        boolean v = v(b10);
        int i17 = 0;
        while (true) {
            hVar = b10;
            if (i17 >= list.size()) {
                j10 = 0;
                break;
            }
            o2.a aVar = (o2.a) list.get(i17);
            j10 = 0;
            List list2 = aVar.c;
            int i18 = aVar.b;
            boolean z16 = (i18 == i16 || i18 == 2) ? false : true;
            if ((!v || !z16) && !list2.isEmpty()) {
                i c10 = ((o2.m) list2.get(0)).c();
                if (c10 != null && c10.K(d11, S) != 0) {
                    S2 = Math.max(S2, c10.b(c10.j(d11, S)) + S2);
                }
            }
            i17++;
            i16 = 1;
            b10 = hVar;
        }
        S2 = S2;
        long j22 = b11.b;
        List list3 = b11.c;
        long S3 = g2.n0.S(j22);
        boolean v10 = v(b11);
        long j23 = Long.MAX_VALUE;
        int i19 = 0;
        while (true) {
            if (i19 >= list3.size()) {
                j11 = S2;
                hVar2 = this;
                j12 = j23;
                break;
            }
            o2.a aVar2 = (o2.a) list3.get(i19);
            long j24 = S3;
            List list4 = aVar2.c;
            int i20 = aVar2.b;
            if (i20 != 1 && i20 != 2) {
                z13 = true;
                if ((v10 || !z13) && !list4.isEmpty()) {
                    c2 = ((o2.m) list4.get(0)).c();
                    if (c2 != null) {
                        j12 = j24 + d10;
                        hVar2 = this;
                        j11 = S2;
                        break;
                    }
                    long K = c2.K(d10, S);
                    if (K == j10) {
                        hVar2 = this;
                        j11 = S2;
                        j12 = j24;
                        break;
                    } else {
                        j19 = S2;
                        long j25 = (c2.j(d10, S) + K) - 1;
                        j23 = Math.min(j23, c2.i(j25, d10) + c2.b(j25) + j24);
                    }
                } else {
                    j19 = S2;
                }
                i19++;
                S3 = j24;
                S2 = j19;
            }
            z13 = false;
            if (v10) {
            }
            c2 = ((o2.m) list4.get(0)).c();
            if (c2 != null) {
            }
        }
        if (hVar2.G.d) {
            for (int i21 = 0; i21 < list3.size(); i21++) {
                i c11 = ((o2.m) ((o2.a) list3.get(i21)).c.get(0)).c();
                if (c11 != null && !c11.A()) {
                }
            }
            z11 = true;
            if (z11) {
                long j26 = hVar2.G.f;
                if (j26 != -9223372036854775807L) {
                    j13 = Math.max(j11, j12 - g2.n0.S(j26));
                    long j27 = j12 - j13;
                    cVar = hVar2.G;
                    if (cVar.d) {
                        zb.p(cVar.a != -9223372036854775807L);
                        long S4 = (S - g2.n0.S(hVar2.G.a)) - j13;
                        h0 h0Var2 = hVar2.i().c;
                        long h02 = g2.n0.h0(S4);
                        j14 = -9223372036854775807L;
                        long j28 = h0Var2.c;
                        if (j28 != -9223372036854775807L) {
                            j17 = Math.min(h02, j28);
                        } else {
                            d2.g0 g0Var = hVar2.G.j;
                            if (g0Var != null) {
                                long j29 = g0Var.c;
                                if (j29 != -9223372036854775807L) {
                                    j17 = Math.min(h02, j29);
                                }
                            }
                            j17 = h02;
                        }
                        long h03 = g2.n0.h0(S4 - j27);
                        if (h03 < j10 && j17 > j10) {
                            h03 = j10;
                        }
                        boolean z17 = z11;
                        long j30 = hVar2.G.c;
                        if (j30 != -9223372036854775807L) {
                            h03 = Math.min(h03 + j30, h02);
                        }
                        long j31 = h03;
                        long j32 = h0Var2.b;
                        if (j32 != -9223372036854775807L) {
                            j31 = g2.n0.j(j32, j31, h02);
                        } else {
                            d2.g0 g0Var2 = hVar2.G.j;
                            if (g0Var2 != null) {
                                long j33 = g0Var2.b;
                                if (j33 != -9223372036854775807L) {
                                    j31 = g2.n0.j(j33, j31, h02);
                                }
                            }
                        }
                        long j34 = j31;
                        long j35 = j34 > j17 ? j34 : j17;
                        synchronized (this) {
                            h0Var = hVar2.P;
                        }
                        long j36 = h0Var.a;
                        if (j36 == -9223372036854775807L) {
                            o2.c cVar4 = hVar2.G;
                            d2.g0 g0Var3 = cVar4.j;
                            if (g0Var3 != null) {
                                long j37 = g0Var3.a;
                                if (j37 != -9223372036854775807L) {
                                    j36 = j37;
                                }
                            }
                            j36 = cVar4.g;
                            if (j36 == -9223372036854775807L) {
                                j36 = hVar2.o;
                            }
                        }
                        if (j36 < j34) {
                            j36 = j34;
                        }
                        if (j36 > j35) {
                            j36 = g2.n0.j(g2.n0.h0(S4 - Math.min(j20, j27 / 2)), j34, j35);
                        }
                        long j38 = j35;
                        float f12 = h0Var2.d;
                        if (f12 == -3.4028235E38f) {
                            d2.g0 g0Var4 = hVar2.G.j;
                            f12 = g0Var4 != null ? g0Var4.d : -3.4028235E38f;
                        }
                        float f13 = h0Var2.e;
                        if (f13 == -3.4028235E38f) {
                            d2.g0 g0Var5 = hVar2.G.j;
                            f13 = g0Var5 != null ? g0Var5.e : -3.4028235E38f;
                        }
                        if (f12 == -3.4028235E38f && f13 == -3.4028235E38f) {
                            f10 = f13;
                            d2.g0 g0Var6 = hVar2.G.j;
                            j18 = S4;
                            z12 = z17;
                            if (g0Var6 == null || g0Var6.a == -9223372036854775807L) {
                                f12 = 1.0f;
                                f11 = 1.0f;
                                d2.g0 g0Var7 = new d2.g0();
                                g0Var7.a = j36;
                                g0Var7.b = j34;
                                g0Var7.c = j38;
                                g0Var7.d = f12;
                                g0Var7.e = f11;
                                hVar2.B(new h0(g0Var7));
                                long h04 = g2.n0.h0(j13) + hVar2.G.a;
                                long S5 = j18 - g2.n0.S(hVar2.u().a);
                                long min = Math.min(j20, j27 / 2);
                                j16 = S5 >= min ? min : S5;
                                j15 = h04;
                                hVar3 = hVar;
                            }
                        } else {
                            f10 = f13;
                            j18 = S4;
                            z12 = z17;
                        }
                        f11 = f10;
                        d2.g0 g0Var72 = new d2.g0();
                        g0Var72.a = j36;
                        g0Var72.b = j34;
                        g0Var72.c = j38;
                        g0Var72.d = f12;
                        g0Var72.e = f11;
                        hVar2.B(new h0(g0Var72));
                        long h042 = g2.n0.h0(j13) + hVar2.G.a;
                        long S52 = j18 - g2.n0.S(hVar2.u().a);
                        long min2 = Math.min(j20, j27 / 2);
                        if (S52 >= min2) {
                        }
                        j15 = h042;
                        hVar3 = hVar;
                    } else {
                        z12 = z11;
                        j14 = -9223372036854775807L;
                        j15 = -9223372036854775807L;
                        hVar3 = hVar;
                        j16 = j10;
                    }
                    long S6 = j13 - g2.n0.S(hVar3.b);
                    o2.c cVar5 = hVar2.G;
                    hVar2.n(new e(cVar5.a, j15, hVar2.K, hVar2.N, S6, j27, j16, cVar5, hVar2.i(), hVar2.G.d ? hVar2.u() : null));
                    if (hVar2.h) {
                        return;
                    }
                    hVar2.D.removeCallbacks(cVar2);
                    if (z12) {
                        Handler handler = hVar2.D;
                        o2.c cVar6 = hVar2.G;
                        long C = g2.n0.C(hVar2.K);
                        int size2 = cVar6.m.size() - 1;
                        o2.h b12 = cVar6.b(size2);
                        long j39 = b12.b;
                        List list5 = b12.c;
                        long S7 = g2.n0.S(j39);
                        long d12 = cVar6.d(size2);
                        long S8 = g2.n0.S(C);
                        long S9 = g2.n0.S(cVar6.a);
                        long S10 = g2.n0.S(cVar6.e);
                        if (S10 == j14 || S10 >= 5000000) {
                            S10 = 5000000;
                        }
                        int i22 = 0;
                        while (i22 < list5.size()) {
                            List list6 = ((o2.a) list5.get(i22)).c;
                            if (list6.isEmpty()) {
                                i3 = i22;
                            } else {
                                i3 = i22;
                                i c12 = ((o2.m) list6.get(0)).c();
                                if (c12 != null) {
                                    long l10 = (c12.l(d12, S8) + (S9 + S7)) - S8;
                                    if (l10 > j10 && (l10 < S10 - 100000 || (l10 > S10 && l10 < S10 + 100000))) {
                                        S10 = l10;
                                    }
                                }
                            }
                            i22 = i3 + 1;
                        }
                        handler.postDelayed(cVar2, xc.b(S10, 1000L, RoundingMode.CEILING));
                    }
                    if (hVar2.H) {
                        hVar2.C();
                        return;
                    }
                    if (z10) {
                        o2.c cVar7 = hVar2.G;
                        if (cVar7.d) {
                            long j40 = cVar7.e;
                            if (j40 != j14) {
                                if (j40 == j10) {
                                    j40 = 5000;
                                }
                                hVar2.D.postDelayed(hVar2.v, Math.max(j10, (hVar2.I + j40) - SystemClock.elapsedRealtime()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            j13 = j11;
            long j272 = j12 - j13;
            cVar = hVar2.G;
            if (cVar.d) {
            }
            long S62 = j13 - g2.n0.S(hVar3.b);
            o2.c cVar52 = hVar2.G;
            hVar2.n(new e(cVar52.a, j15, hVar2.K, hVar2.N, S62, j272, j16, cVar52, hVar2.i(), hVar2.G.d ? hVar2.u() : null));
            if (hVar2.h) {
            }
        }
        z11 = false;
        if (z11) {
        }
        j13 = j11;
        long j2722 = j12 - j13;
        cVar = hVar2.G;
        if (cVar.d) {
        }
        long S622 = j13 - g2.n0.S(hVar3.b);
        o2.c cVar522 = hVar2.G;
        hVar2.n(new e(cVar522.a, j15, hVar2.K, hVar2.N, S622, j2722, j16, cVar522, hVar2.i(), hVar2.G.d ? hVar2.u() : null));
        if (hVar2.h) {
        }
    }
}
