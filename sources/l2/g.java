package l2;

import a8.h0;
import a8.nc;
import a8.ng;
import a8.yb;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.i0;
import b2.j0;
import b2.k0;
import b2.p0;
import b2.q0;
import e2.n0;
import g2.b0;
import g2.c0;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jg.s0;
import li.e3;
import m2.t;
import u2.e0;
import u2.g0;
import u2.u;
import u7.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends u2.a {
    public y2.l A;
    public c0 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public m2.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public p0 O;
    public j0 P;
    public final boolean h;
    public final g2.g i;
    public final ng j;
    public final pa.d k;
    public final n2.m l;
    public final s m;
    public final ti.e n;
    public final long o;
    public final long p;
    public final ng q;
    public final y2.n r;
    public final jg.i s;
    public final Object t;
    public final SparseArray u;
    public final c v;
    public final c w;
    public final a4.l x;
    public final y2.m y;
    public g2.h z;

    static {
        q0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [l2.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [l2.c] */
    public g(p0 p0Var, g2.g gVar, y2.n nVar, ng ngVar, pa.d dVar, n2.m mVar, s sVar, long j10, long j11) {
        this.O = p0Var;
        this.P = p0Var.c;
        k0 k0Var = p0Var.b;
        k0Var.getClass();
        Uri uri = k0Var.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = gVar;
        this.r = nVar;
        this.j = ngVar;
        this.l = mVar;
        this.m = sVar;
        this.o = j10;
        this.p = j11;
        this.k = dVar;
        this.n = new ti.e(7);
        this.h = false;
        this.q = b(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new a4.l(this, 27);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.s = new jg.i(this);
        this.y = new s0(this, 4);
        final int i10 = 0;
        this.v = new Runnable(this) { // from class: l2.c
            public final /* synthetic */ g b;

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
                        g gVar2 = this.b;
                        gVar2.getClass();
                        try {
                            gVar2.z(false);
                            break;
                        } catch (Exception e) {
                            gVar2.C = new IOException(e);
                        }
                }
            }
        };
        final int i11 = 1;
        this.w = new Runnable(this) { // from class: l2.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        g gVar2 = this.b;
                        gVar2.getClass();
                        try {
                            gVar2.z(false);
                            break;
                        } catch (Exception e) {
                            gVar2.C = new IOException(e);
                        }
                }
            }
        };
    }

    public static boolean v(m2.h hVar) {
        List list = hVar.c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(t tVar, y2.n nVar) {
        g2.h hVar = this.z;
        Uri parse = Uri.parse(tVar.c);
        Map map = Collections.EMPTY_MAP;
        yb.l(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }

    public final synchronized void B(j0 j0Var) {
        this.P = j0Var;
    }

    public final void C() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.b()) {
            return;
        }
        if (this.A.c()) {
            this.H = true;
            return;
        }
        synchronized (this.t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        yb.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        jg.i iVar = this.s;
        this.m.getClass();
        this.A.f(oVar, iVar, 3);
    }

    @Override // u2.a
    public final boolean a(p0 p0Var) {
        k0 k0Var = i().b;
        k0Var.getClass();
        k0 k0Var2 = p0Var.b;
        return k0Var2 != null && k0Var2.a.equals(k0Var.a) && k0Var2.e.equals(k0Var.e) && Objects.equals(k0Var2.c, k0Var.c);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, h0 h0Var, long j10) {
        int intValue = ((Integer) g0Var.a).intValue() - this.N;
        ng b10 = b(g0Var);
        n2.j jVar = new n2.j(this.d.c, 0, g0Var);
        int i10 = this.N + intValue;
        m2.c cVar = this.G;
        c0 c0Var = this.B;
        long j11 = this.K;
        j2.j jVar2 = this.g;
        jVar2.getClass();
        b bVar = new b(i10, cVar, this.n, intValue, this.j, c0Var, this.l, jVar, this.m, b10, j11, this.y, h0Var, this.k, this.x, jVar2);
        this.u.put(i10, bVar);
        return bVar;
    }

    @Override // u2.a
    public final synchronized p0 i() {
        return this.O;
    }

    @Override // u2.a
    public final void k() {
        this.y.d();
    }

    @Override // u2.a
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.j jVar = this.g;
        jVar.getClass();
        n2.m mVar = this.l;
        mVar.f(myLooper, jVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.z = this.i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = n0.q(null);
        C();
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        o oVar = bVar.x;
        oVar.r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (v2.i iVar : bVar.H) {
            iVar.C(bVar);
        }
        bVar.G = null;
        this.u.remove(bVar.a);
    }

    @Override // u2.a
    public final void q() {
        this.H = false;
        this.z = null;
        y2.l lVar = this.A;
        if (lVar != null) {
            lVar.e(null);
            this.A = null;
        }
        j0 j0Var = i().c;
        synchronized (this) {
            this.P = j0Var;
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
        ti.e eVar = this.n;
        ((HashMap) eVar.b).clear();
        ((HashMap) eVar.c).clear();
        ((HashMap) eVar.d).clear();
        this.l.release();
    }

    @Override // u2.a
    public final synchronized void t(p0 p0Var) {
        this.O = p0Var;
        this.P = p0Var.c;
    }

    public final synchronized j0 u() {
        return this.P;
    }

    public final void w() {
        boolean z10;
        y2.l lVar = this.A;
        d dVar = new d(this);
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar == null) {
            lVar = new y2.l("SntpClient");
        }
        lVar.f(new tb.a(27), new e3(dVar, 27), 1);
    }

    public final void x(y2.o oVar, long j10, long j11) {
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u uVar = new u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.m.getClass();
        this.q.p(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        e2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
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
        m2.h hVar;
        long j10;
        long j11;
        g gVar;
        long j12;
        boolean z11;
        long j13;
        m2.c cVar;
        boolean z12;
        long j14;
        long j15;
        m2.h hVar2;
        long j16;
        int i10;
        long j17;
        j0 j0Var;
        float f7;
        long j18;
        float f10;
        boolean z13;
        h c10;
        long j19;
        SparseArray sparseArray;
        int i11;
        boolean z14;
        SparseArray sparseArray2;
        v2.i[] iVarArr;
        c cVar2 = this.w;
        long j20 = this.p;
        SparseArray sparseArray3 = this.u;
        boolean z15 = false;
        int i12 = 0;
        while (i12 < sparseArray3.size()) {
            int keyAt = sparseArray3.keyAt(i12);
            if (keyAt >= this.N) {
                b bVar = (b) sparseArray3.valueAt(i12);
                m2.c cVar3 = this.G;
                int i13 = keyAt - this.N;
                bVar.K = cVar3;
                bVar.L = i13;
                o oVar = bVar.x;
                oVar.n = z15;
                oVar.f = cVar3;
                Iterator it = oVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    int i14 = i12;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < oVar.f.h) {
                        it.remove();
                    }
                    i12 = i14;
                }
                i11 = i12;
                v2.i[] iVarArr2 = bVar.H;
                if (iVarArr2 != null) {
                    int length = iVarArr2.length;
                    int i15 = 0;
                    while (i15 < length) {
                        k kVar = iVarArr2[i15].e;
                        i[] iVarArr3 = kVar.i;
                        try {
                            kVar.k = cVar3;
                            kVar.l = i13;
                            long d = cVar3.d(i13);
                            try {
                                ArrayList a2 = kVar.a();
                                sparseArray2 = sparseArray3;
                                iVarArr = iVarArr2;
                                int i16 = 0;
                                while (i16 < iVarArr3.length) {
                                    try {
                                        i[] iVarArr4 = iVarArr3;
                                        iVarArr4[i16] = iVarArr4[i16].a(d, (m2.m) a2.get(kVar.j.h(i16)));
                                        i16++;
                                        iVarArr3 = iVarArr4;
                                    } catch (u2.b e) {
                                        e = e;
                                        kVar.m = e;
                                        i15++;
                                        sparseArray3 = sparseArray2;
                                        iVarArr2 = iVarArr;
                                    }
                                }
                            } catch (u2.b e10) {
                                e = e10;
                                sparseArray2 = sparseArray3;
                                iVarArr = iVarArr2;
                            }
                        } catch (u2.b e11) {
                            e = e11;
                            sparseArray2 = sparseArray3;
                            iVarArr = iVarArr2;
                        }
                        i15++;
                        sparseArray3 = sparseArray2;
                        iVarArr2 = iVarArr;
                    }
                    sparseArray = sparseArray3;
                    z14 = true;
                    bVar.G.u(bVar);
                } else {
                    sparseArray = sparseArray3;
                    z14 = true;
                }
                bVar.M = cVar3.b(i13).d;
                for (l lVar : bVar.I) {
                    Iterator it2 = bVar.M.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            m2.g gVar2 = (m2.g) it2.next();
                            if (gVar2.a().equals(lVar.e.a())) {
                                lVar.a(gVar2, (cVar3.d && i13 == cVar3.m.size() + (-1)) ? z14 : false);
                            }
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i11 = i12;
            }
            i12 = i11 + 1;
            sparseArray3 = sparseArray;
            z15 = false;
        }
        int i17 = 1;
        m2.h b10 = this.G.b(0);
        int size = this.G.m.size() - 1;
        m2.h b11 = this.G.b(size);
        long d10 = this.G.d(size);
        long S = n0.S(n0.C(this.K));
        long d11 = this.G.d(0);
        long j21 = b10.b;
        List list = b10.c;
        long S2 = n0.S(j21);
        boolean v = v(b10);
        int i18 = 0;
        while (true) {
            hVar = b10;
            if (i18 >= list.size()) {
                j10 = 0;
                break;
            }
            m2.a aVar = (m2.a) list.get(i18);
            j10 = 0;
            List list2 = aVar.c;
            int i19 = aVar.b;
            boolean z16 = (i19 == i17 || i19 == 2) ? false : true;
            if ((!v || !z16) && !list2.isEmpty()) {
                h c11 = ((m2.m) list2.get(0)).c();
                if (c11 != null && c11.W(d11, S) != 0) {
                    S2 = Math.max(S2, c11.a(c11.g(d11, S)) + S2);
                }
            }
            i18++;
            i17 = 1;
            b10 = hVar;
        }
        S2 = S2;
        long j22 = b11.b;
        List list3 = b11.c;
        long S3 = n0.S(j22);
        boolean v10 = v(b11);
        long j23 = Long.MAX_VALUE;
        int i20 = 0;
        while (true) {
            if (i20 >= list3.size()) {
                j11 = S2;
                gVar = this;
                j12 = j23;
                break;
            }
            m2.a aVar2 = (m2.a) list3.get(i20);
            long j24 = S3;
            List list4 = aVar2.c;
            int i21 = aVar2.b;
            if (i21 != 1 && i21 != 2) {
                z13 = true;
                if ((v10 || !z13) && !list4.isEmpty()) {
                    c10 = ((m2.m) list4.get(0)).c();
                    if (c10 != null) {
                        j12 = j24 + d10;
                        gVar = this;
                        j11 = S2;
                        break;
                    }
                    long W = c10.W(d10, S);
                    if (W == j10) {
                        gVar = this;
                        j11 = S2;
                        j12 = j24;
                        break;
                    } else {
                        j19 = S2;
                        long g7 = (c10.g(d10, S) + W) - 1;
                        j23 = Math.min(j23, c10.e(g7, d10) + c10.a(g7) + j24);
                    }
                } else {
                    j19 = S2;
                }
                i20++;
                S3 = j24;
                S2 = j19;
            }
            z13 = false;
            if (v10) {
            }
            c10 = ((m2.m) list4.get(0)).c();
            if (c10 != null) {
            }
        }
        if (gVar.G.d) {
            for (int i22 = 0; i22 < list3.size(); i22++) {
                h c12 = ((m2.m) ((m2.a) list3.get(i22)).c.get(0)).c();
                if (c12 != null && !c12.N()) {
                }
            }
            z11 = true;
            if (z11) {
                long j25 = gVar.G.f;
                if (j25 != -9223372036854775807L) {
                    j13 = Math.max(j11, j12 - n0.S(j25));
                    long j26 = j12 - j13;
                    cVar = gVar.G;
                    if (cVar.d) {
                        yb.p(cVar.a != -9223372036854775807L);
                        long S4 = (S - n0.S(gVar.G.a)) - j13;
                        j0 j0Var2 = gVar.i().c;
                        long h02 = n0.h0(S4);
                        j14 = -9223372036854775807L;
                        long j27 = j0Var2.c;
                        if (j27 != -9223372036854775807L) {
                            j17 = Math.min(h02, j27);
                        } else {
                            i0 i0Var = gVar.G.j;
                            if (i0Var != null) {
                                long j28 = i0Var.c;
                                if (j28 != -9223372036854775807L) {
                                    j17 = Math.min(h02, j28);
                                }
                            }
                            j17 = h02;
                        }
                        long h03 = n0.h0(S4 - j26);
                        if (h03 < j10 && j17 > j10) {
                            h03 = j10;
                        }
                        boolean z17 = z11;
                        long j29 = gVar.G.c;
                        if (j29 != -9223372036854775807L) {
                            h03 = Math.min(h03 + j29, h02);
                        }
                        long j30 = h03;
                        long j31 = j0Var2.b;
                        if (j31 != -9223372036854775807L) {
                            j30 = n0.j(j31, j30, h02);
                        } else {
                            i0 i0Var2 = gVar.G.j;
                            if (i0Var2 != null) {
                                long j32 = i0Var2.b;
                                if (j32 != -9223372036854775807L) {
                                    j30 = n0.j(j32, j30, h02);
                                }
                            }
                        }
                        long j33 = j30;
                        long j34 = j33 > j17 ? j33 : j17;
                        synchronized (this) {
                            j0Var = gVar.P;
                        }
                        long j35 = j0Var.a;
                        if (j35 == -9223372036854775807L) {
                            m2.c cVar4 = gVar.G;
                            i0 i0Var3 = cVar4.j;
                            if (i0Var3 != null) {
                                long j36 = i0Var3.a;
                                if (j36 != -9223372036854775807L) {
                                    j35 = j36;
                                }
                            }
                            j35 = cVar4.g;
                            if (j35 == -9223372036854775807L) {
                                j35 = gVar.o;
                            }
                        }
                        if (j35 < j33) {
                            j35 = j33;
                        }
                        if (j35 > j34) {
                            j35 = n0.j(n0.h0(S4 - Math.min(j20, j26 / 2)), j33, j34);
                        }
                        long j37 = j34;
                        float f11 = j0Var2.d;
                        if (f11 == -3.4028235E38f) {
                            i0 i0Var4 = gVar.G.j;
                            f11 = i0Var4 != null ? i0Var4.d : -3.4028235E38f;
                        }
                        float f12 = j0Var2.e;
                        if (f12 == -3.4028235E38f) {
                            i0 i0Var5 = gVar.G.j;
                            f12 = i0Var5 != null ? i0Var5.e : -3.4028235E38f;
                        }
                        if (f11 == -3.4028235E38f && f12 == -3.4028235E38f) {
                            f7 = f12;
                            i0 i0Var6 = gVar.G.j;
                            j18 = S4;
                            z12 = z17;
                            if (i0Var6 == null || i0Var6.a == -9223372036854775807L) {
                                f11 = 1.0f;
                                f10 = 1.0f;
                                i0 i0Var7 = new i0();
                                i0Var7.a = j35;
                                i0Var7.b = j33;
                                i0Var7.c = j37;
                                i0Var7.d = f11;
                                i0Var7.e = f10;
                                gVar.B(new j0(i0Var7));
                                long h04 = n0.h0(j13) + gVar.G.a;
                                long S5 = j18 - n0.S(gVar.u().a);
                                long min = Math.min(j20, j26 / 2);
                                j16 = S5 >= min ? min : S5;
                                j15 = h04;
                                hVar2 = hVar;
                            }
                        } else {
                            f7 = f12;
                            j18 = S4;
                            z12 = z17;
                        }
                        f10 = f7;
                        i0 i0Var72 = new i0();
                        i0Var72.a = j35;
                        i0Var72.b = j33;
                        i0Var72.c = j37;
                        i0Var72.d = f11;
                        i0Var72.e = f10;
                        gVar.B(new j0(i0Var72));
                        long h042 = n0.h0(j13) + gVar.G.a;
                        long S52 = j18 - n0.S(gVar.u().a);
                        long min2 = Math.min(j20, j26 / 2);
                        if (S52 >= min2) {
                        }
                        j15 = h042;
                        hVar2 = hVar;
                    } else {
                        z12 = z11;
                        j14 = -9223372036854775807L;
                        j15 = -9223372036854775807L;
                        hVar2 = hVar;
                        j16 = j10;
                    }
                    long S6 = j13 - n0.S(hVar2.b);
                    m2.c cVar5 = gVar.G;
                    gVar.n(new e(cVar5.a, j15, gVar.K, gVar.N, S6, j26, j16, cVar5, gVar.i(), gVar.G.d ? gVar.u() : null));
                    if (gVar.h) {
                        return;
                    }
                    gVar.D.removeCallbacks(cVar2);
                    if (z12) {
                        Handler handler = gVar.D;
                        m2.c cVar6 = gVar.G;
                        long C = n0.C(gVar.K);
                        int size2 = cVar6.m.size() - 1;
                        m2.h b12 = cVar6.b(size2);
                        long j38 = b12.b;
                        List list5 = b12.c;
                        long S7 = n0.S(j38);
                        long d12 = cVar6.d(size2);
                        long S8 = n0.S(C);
                        long S9 = n0.S(cVar6.a);
                        long S10 = n0.S(cVar6.e);
                        if (S10 == j14 || S10 >= 5000000) {
                            S10 = 5000000;
                        }
                        int i23 = 0;
                        while (i23 < list5.size()) {
                            List list6 = ((m2.a) list5.get(i23)).c;
                            if (list6.isEmpty()) {
                                i10 = i23;
                            } else {
                                i10 = i23;
                                h c13 = ((m2.m) list6.get(0)).c();
                                if (c13 != null) {
                                    long k10 = (c13.k(d12, S8) + (S9 + S7)) - S8;
                                    if (k10 > j10 && (k10 < S10 - 100000 || (k10 > S10 && k10 < S10 + 100000))) {
                                        S10 = k10;
                                    }
                                }
                            }
                            i23 = i10 + 1;
                        }
                        handler.postDelayed(cVar2, nc.b(S10, 1000L, RoundingMode.CEILING));
                    }
                    if (gVar.H) {
                        gVar.C();
                        return;
                    }
                    if (z10) {
                        m2.c cVar7 = gVar.G;
                        if (cVar7.d) {
                            long j39 = cVar7.e;
                            if (j39 != j14) {
                                if (j39 == j10) {
                                    j39 = 5000;
                                }
                                gVar.D.postDelayed(gVar.v, Math.max(j10, (gVar.I + j39) - SystemClock.elapsedRealtime()));
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
            long j262 = j12 - j13;
            cVar = gVar.G;
            if (cVar.d) {
            }
            long S62 = j13 - n0.S(hVar2.b);
            m2.c cVar52 = gVar.G;
            gVar.n(new e(cVar52.a, j15, gVar.K, gVar.N, S62, j262, j16, cVar52, gVar.i(), gVar.G.d ? gVar.u() : null));
            if (gVar.h) {
            }
        }
        z11 = false;
        if (z11) {
        }
        j13 = j11;
        long j2622 = j12 - j13;
        cVar = gVar.G;
        if (cVar.d) {
        }
        long S622 = j13 - n0.S(hVar2.b);
        m2.c cVar522 = gVar.G;
        gVar.n(new e(cVar522.a, j15, gVar.K, gVar.N, S622, j2622, j16, cVar522, gVar.i(), gVar.G.d ? gVar.u() : null));
        if (gVar.h) {
        }
    }
}
