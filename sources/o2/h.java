package o2;

import a8.ia;
import a8.wa;
import ab.b0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b3.q;
import b3.r;
import c8.s0;
import e2.f0;
import e2.g0;
import e2.l0;
import e2.m0;
import h9.f1;
import j$.util.Objects;
import j2.c0;
import j2.d0;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.m6;
import x2.e0;
import x2.u;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h extends x2.a {
    public b3.o A;
    public d0 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public p2.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public l0 O;
    public f0 P;
    public final boolean h;
    public final j2.g i;
    public final wa j;
    public final sa.d k;
    public final q2.m l;
    public final pb.b m;
    public final b0 n;
    public final long o;
    public final long p;
    public final wa q;
    public final q r;
    public final f1 s;
    public final Object t;
    public final SparseArray u;
    public final c v;
    public final c w;
    public final f x;
    public final b3.p y;
    public j2.h z;

    static {
        m0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [o2.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [o2.c] */
    public h(l0 l0Var, j2.g gVar, q qVar, wa waVar, sa.d dVar, q2.m mVar, pb.b bVar, long j3, long j10) {
        this.O = l0Var;
        this.P = l0Var.c;
        g0 g0Var = l0Var.b;
        g0Var.getClass();
        Uri uri = g0Var.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = gVar;
        this.r = qVar;
        this.j = waVar;
        this.l = mVar;
        this.m = bVar;
        this.o = j3;
        this.p = j10;
        this.k = dVar;
        this.n = new b0(7);
        this.h = false;
        this.q = b(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.s = new f1(this, 18);
        this.y = new d(this);
        final int i7 = 0;
        this.v = new Runnable(this) { // from class: o2.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
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
        this.w = new Runnable(this) { // from class: o2.c
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

    public static boolean v(p2.h hVar) {
        List list = hVar.c;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i10 = ((p2.a) list.get(i7)).b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(m6 m6Var, q qVar) {
        j2.h hVar = this.z;
        Uri parse = Uri.parse(m6Var.c);
        Map map = Collections.EMPTY_MAP;
        ia.k(parse, "The uri must be set.");
        this.A.f(new r(hVar, new j2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, qVar), new f(this), 1);
    }

    public final synchronized void B(f0 f0Var) {
        this.P = f0Var;
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
        ia.k(uri, "The uri must be set.");
        r rVar = new r(this.z, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        f1 f1Var = this.s;
        this.m.getClass();
        this.A.f(rVar, f1Var, 3);
    }

    @Override // x2.a
    public final boolean a(l0 l0Var) {
        g0 g0Var = i().b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.b;
        return g0Var2 != null && g0Var2.a.equals(g0Var.a) && g0Var2.e.equals(g0Var.e) && Objects.equals(g0Var2.c, g0Var.c);
    }

    @Override // x2.a
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        int intValue = ((Integer) g0Var.a).intValue() - this.N;
        wa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.c, 0, g0Var);
        int i7 = this.N + intValue;
        p2.c cVar = this.G;
        d0 d0Var = this.B;
        long j10 = this.K;
        m2.j jVar2 = this.g;
        jVar2.getClass();
        b bVar = new b(i7, cVar, this.n, intValue, this.j, d0Var, this.l, jVar, this.m, b10, j10, this.y, mVar, this.k, this.x, jVar2);
        this.u.put(i7, bVar);
        return bVar;
    }

    @Override // x2.a
    public final synchronized l0 i() {
        return this.O;
    }

    @Override // x2.a
    public final void k() {
        this.y.a();
    }

    @Override // x2.a
    public final void m(d0 d0Var) {
        this.B = d0Var;
        Looper myLooper = Looper.myLooper();
        m2.j jVar = this.g;
        jVar.getClass();
        q2.m mVar = this.l;
        mVar.E(myLooper, jVar);
        mVar.a();
        if (this.h) {
            z(false);
            return;
        }
        this.z = this.i.createDataSource();
        this.A = new b3.o("DashMediaSource");
        this.D = h2.m0.q(null);
        C();
    }

    @Override // x2.a
    public final void o(e0 e0Var) {
        b bVar = (b) e0Var;
        p pVar = bVar.y;
        pVar.r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (y2.i iVar : bVar.H) {
            iVar.z(bVar);
        }
        bVar.G = null;
        this.u.remove(bVar.a);
    }

    @Override // x2.a
    public final void q() {
        this.H = false;
        this.z = null;
        b3.o oVar = this.A;
        if (oVar != null) {
            oVar.e(null);
            this.A = null;
        }
        f0 f0Var = i().c;
        synchronized (this) {
            this.P = f0Var;
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
        b0 b0Var = this.n;
        ((HashMap) b0Var.b).clear();
        ((HashMap) b0Var.c).clear();
        ((HashMap) b0Var.d).clear();
        this.l.release();
    }

    @Override // x2.a
    public final synchronized void t(l0 l0Var) {
        this.O = l0Var;
        this.P = l0Var.c;
    }

    public final synchronized f0 u() {
        return this.P;
    }

    public final void w() {
        boolean z9;
        b3.o oVar = this.A;
        d dVar = new d(this);
        synchronized (c3.b.b) {
            z9 = c3.b.c;
        }
        if (z9) {
            dVar.b();
            return;
        }
        if (oVar == null) {
            oVar = new b3.o("SntpClient");
        }
        oVar.f(new pb.b(5), new cb.c(dVar, 12), 1);
    }

    public final void x(r rVar, long j3, long j10) {
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        c0 c0Var = rVar.d;
        u uVar = new u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.m.getClass();
        this.q.o(uVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        h2.a.d("DashMediaSource", "Failed to resolve time offset.", iOException);
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
    public final void z(boolean z9) {
        p2.h hVar;
        long j3;
        long j10;
        h hVar2;
        long j11;
        boolean z10;
        long j12;
        p2.c cVar;
        boolean z11;
        long j13;
        long j14;
        p2.h hVar3;
        long j15;
        int i7;
        long j16;
        f0 f0Var;
        float f10;
        long j17;
        float f11;
        boolean z12;
        i c10;
        long j18;
        SparseArray sparseArray;
        int i10;
        boolean z13;
        SparseArray sparseArray2;
        y2.i[] iVarArr;
        c cVar2 = this.w;
        long j19 = this.p;
        SparseArray sparseArray3 = this.u;
        boolean z14 = false;
        int i11 = 0;
        while (i11 < sparseArray3.size()) {
            int keyAt = sparseArray3.keyAt(i11);
            if (keyAt >= this.N) {
                b bVar = (b) sparseArray3.valueAt(i11);
                p2.c cVar3 = this.G;
                int i12 = keyAt - this.N;
                bVar.K = cVar3;
                bVar.L = i12;
                p pVar = bVar.y;
                pVar.n = z14;
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
                y2.i[] iVarArr2 = bVar.H;
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
                                        jVarArr2[i15] = jVarArr2[i15].a(d, (p2.m) a10.get(lVar.j.i(i15)));
                                        i15++;
                                        jVarArr = jVarArr2;
                                    } catch (x2.b e10) {
                                        e = e10;
                                        lVar.m = e;
                                        i14++;
                                        sparseArray3 = sparseArray2;
                                        iVarArr2 = iVarArr;
                                    }
                                }
                            } catch (x2.b e11) {
                                e = e11;
                                sparseArray2 = sparseArray3;
                                iVarArr = iVarArr2;
                            }
                        } catch (x2.b e12) {
                            e = e12;
                            sparseArray2 = sparseArray3;
                            iVarArr = iVarArr2;
                        }
                        i14++;
                        sparseArray3 = sparseArray2;
                        iVarArr2 = iVarArr;
                    }
                    sparseArray = sparseArray3;
                    z13 = true;
                    bVar.G.d(bVar);
                } else {
                    sparseArray = sparseArray3;
                    z13 = true;
                }
                bVar.M = cVar3.b(i12).d;
                for (m mVar : bVar.I) {
                    Iterator it2 = bVar.M.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            p2.g gVar = (p2.g) it2.next();
                            if (gVar.a().equals(mVar.e.a())) {
                                mVar.b(gVar, (cVar3.d && i12 == cVar3.m.size() + (-1)) ? z13 : false);
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
            z14 = false;
        }
        int i16 = 1;
        p2.h b10 = this.G.b(0);
        int size = this.G.m.size() - 1;
        p2.h b11 = this.G.b(size);
        long d2 = this.G.d(size);
        long S = h2.m0.S(h2.m0.C(this.K));
        long d10 = this.G.d(0);
        long j20 = b10.b;
        List list = b10.c;
        long S2 = h2.m0.S(j20);
        boolean v = v(b10);
        int i17 = 0;
        while (true) {
            hVar = b10;
            if (i17 >= list.size()) {
                j3 = 0;
                break;
            }
            p2.a aVar = (p2.a) list.get(i17);
            j3 = 0;
            List list2 = aVar.c;
            int i18 = aVar.b;
            boolean z15 = (i18 == i16 || i18 == 2) ? false : true;
            if ((!v || !z15) && !list2.isEmpty()) {
                i c11 = ((p2.m) list2.get(0)).c();
                if (c11 != null && c11.z(d10, S) != 0) {
                    S2 = Math.max(S2, c11.a(c11.e(d10, S)) + S2);
                }
            }
            i17++;
            i16 = 1;
            b10 = hVar;
        }
        S2 = S2;
        long j21 = b11.b;
        List list3 = b11.c;
        long S3 = h2.m0.S(j21);
        boolean v10 = v(b11);
        long j22 = Long.MAX_VALUE;
        int i19 = 0;
        while (true) {
            if (i19 >= list3.size()) {
                j10 = S2;
                hVar2 = this;
                j11 = j22;
                break;
            }
            p2.a aVar2 = (p2.a) list3.get(i19);
            long j23 = S3;
            List list4 = aVar2.c;
            int i20 = aVar2.b;
            if (i20 != 1 && i20 != 2) {
                z12 = true;
                if ((v10 || !z12) && !list4.isEmpty()) {
                    c10 = ((p2.m) list4.get(0)).c();
                    if (c10 != null) {
                        j11 = j23 + d2;
                        hVar2 = this;
                        j10 = S2;
                        break;
                    }
                    long z16 = c10.z(d2, S);
                    if (z16 == j3) {
                        hVar2 = this;
                        j10 = S2;
                        j11 = j23;
                        break;
                    } else {
                        j18 = S2;
                        long e13 = (c10.e(d2, S) + z16) - 1;
                        j22 = Math.min(j22, c10.d(e13, d2) + c10.a(e13) + j23);
                    }
                } else {
                    j18 = S2;
                }
                i19++;
                S3 = j23;
                S2 = j18;
            }
            z12 = false;
            if (v10) {
            }
            c10 = ((p2.m) list4.get(0)).c();
            if (c10 != null) {
            }
        }
        if (hVar2.G.d) {
            for (int i21 = 0; i21 < list3.size(); i21++) {
                i c12 = ((p2.m) ((p2.a) list3.get(i21)).c.get(0)).c();
                if (c12 != null && !c12.t()) {
                }
            }
            z10 = true;
            if (z10) {
                long j24 = hVar2.G.f;
                if (j24 != -9223372036854775807L) {
                    j12 = Math.max(j10, j11 - h2.m0.S(j24));
                    long j25 = j11 - j12;
                    cVar = hVar2.G;
                    if (cVar.d) {
                        ia.p(cVar.a != -9223372036854775807L);
                        long S4 = (S - h2.m0.S(hVar2.G.a)) - j12;
                        f0 f0Var2 = hVar2.i().c;
                        long h02 = h2.m0.h0(S4);
                        j13 = -9223372036854775807L;
                        long j26 = f0Var2.c;
                        if (j26 != -9223372036854775807L) {
                            j16 = Math.min(h02, j26);
                        } else {
                            e2.e0 e0Var = hVar2.G.j;
                            if (e0Var != null) {
                                long j27 = e0Var.c;
                                if (j27 != -9223372036854775807L) {
                                    j16 = Math.min(h02, j27);
                                }
                            }
                            j16 = h02;
                        }
                        long h03 = h2.m0.h0(S4 - j25);
                        if (h03 < j3 && j16 > j3) {
                            h03 = j3;
                        }
                        boolean z17 = z10;
                        long j28 = hVar2.G.c;
                        if (j28 != -9223372036854775807L) {
                            h03 = Math.min(h03 + j28, h02);
                        }
                        long j29 = h03;
                        long j30 = f0Var2.b;
                        if (j30 != -9223372036854775807L) {
                            j29 = h2.m0.j(j30, j29, h02);
                        } else {
                            e2.e0 e0Var2 = hVar2.G.j;
                            if (e0Var2 != null) {
                                long j31 = e0Var2.b;
                                if (j31 != -9223372036854775807L) {
                                    j29 = h2.m0.j(j31, j29, h02);
                                }
                            }
                        }
                        long j32 = j29;
                        long j33 = j32 > j16 ? j32 : j16;
                        synchronized (this) {
                            f0Var = hVar2.P;
                        }
                        long j34 = f0Var.a;
                        if (j34 == -9223372036854775807L) {
                            p2.c cVar4 = hVar2.G;
                            e2.e0 e0Var3 = cVar4.j;
                            if (e0Var3 != null) {
                                long j35 = e0Var3.a;
                                if (j35 != -9223372036854775807L) {
                                    j34 = j35;
                                }
                            }
                            j34 = cVar4.g;
                            if (j34 == -9223372036854775807L) {
                                j34 = hVar2.o;
                            }
                        }
                        if (j34 < j32) {
                            j34 = j32;
                        }
                        if (j34 > j33) {
                            j34 = h2.m0.j(h2.m0.h0(S4 - Math.min(j19, j25 / 2)), j32, j33);
                        }
                        long j36 = j33;
                        float f12 = f0Var2.d;
                        if (f12 == -3.4028235E38f) {
                            e2.e0 e0Var4 = hVar2.G.j;
                            f12 = e0Var4 != null ? e0Var4.d : -3.4028235E38f;
                        }
                        float f13 = f0Var2.e;
                        if (f13 == -3.4028235E38f) {
                            e2.e0 e0Var5 = hVar2.G.j;
                            f13 = e0Var5 != null ? e0Var5.e : -3.4028235E38f;
                        }
                        if (f12 == -3.4028235E38f && f13 == -3.4028235E38f) {
                            f10 = f13;
                            e2.e0 e0Var6 = hVar2.G.j;
                            j17 = S4;
                            z11 = z17;
                            if (e0Var6 == null || e0Var6.a == -9223372036854775807L) {
                                f12 = 1.0f;
                                f11 = 1.0f;
                                e2.e0 e0Var7 = new e2.e0();
                                e0Var7.a = j34;
                                e0Var7.b = j32;
                                e0Var7.c = j36;
                                e0Var7.d = f12;
                                e0Var7.e = f11;
                                hVar2.B(new f0(e0Var7));
                                long h04 = h2.m0.h0(j12) + hVar2.G.a;
                                long S5 = j17 - h2.m0.S(hVar2.u().a);
                                long min = Math.min(j19, j25 / 2);
                                j15 = S5 >= min ? min : S5;
                                j14 = h04;
                                hVar3 = hVar;
                            }
                        } else {
                            f10 = f13;
                            j17 = S4;
                            z11 = z17;
                        }
                        f11 = f10;
                        e2.e0 e0Var72 = new e2.e0();
                        e0Var72.a = j34;
                        e0Var72.b = j32;
                        e0Var72.c = j36;
                        e0Var72.d = f12;
                        e0Var72.e = f11;
                        hVar2.B(new f0(e0Var72));
                        long h042 = h2.m0.h0(j12) + hVar2.G.a;
                        long S52 = j17 - h2.m0.S(hVar2.u().a);
                        long min2 = Math.min(j19, j25 / 2);
                        if (S52 >= min2) {
                        }
                        j14 = h042;
                        hVar3 = hVar;
                    } else {
                        z11 = z10;
                        j13 = -9223372036854775807L;
                        j14 = -9223372036854775807L;
                        hVar3 = hVar;
                        j15 = j3;
                    }
                    long S6 = j12 - h2.m0.S(hVar3.b);
                    p2.c cVar5 = hVar2.G;
                    hVar2.n(new e(cVar5.a, j14, hVar2.K, hVar2.N, S6, j25, j15, cVar5, hVar2.i(), hVar2.G.d ? hVar2.u() : null));
                    if (hVar2.h) {
                        return;
                    }
                    hVar2.D.removeCallbacks(cVar2);
                    if (z11) {
                        Handler handler = hVar2.D;
                        p2.c cVar6 = hVar2.G;
                        long C = h2.m0.C(hVar2.K);
                        int size2 = cVar6.m.size() - 1;
                        p2.h b12 = cVar6.b(size2);
                        long j37 = b12.b;
                        List list5 = b12.c;
                        long S7 = h2.m0.S(j37);
                        long d11 = cVar6.d(size2);
                        long S8 = h2.m0.S(C);
                        long S9 = h2.m0.S(cVar6.a);
                        long S10 = h2.m0.S(cVar6.e);
                        if (S10 == j13 || S10 >= 5000000) {
                            S10 = 5000000;
                        }
                        int i22 = 0;
                        while (i22 < list5.size()) {
                            List list6 = ((p2.a) list5.get(i22)).c;
                            if (list6.isEmpty()) {
                                i7 = i22;
                            } else {
                                i7 = i22;
                                i c13 = ((p2.m) list6.get(0)).c();
                                if (c13 != null) {
                                    long g10 = (c13.g(d11, S8) + (S9 + S7)) - S8;
                                    if (g10 > j3 && (g10 < S10 - 100000 || (g10 > S10 && g10 < S10 + 100000))) {
                                        S10 = g10;
                                    }
                                }
                            }
                            i22 = i7 + 1;
                        }
                        handler.postDelayed(cVar2, s0.b(S10, 1000L, RoundingMode.CEILING));
                    }
                    if (hVar2.H) {
                        hVar2.C();
                        return;
                    }
                    if (z9) {
                        p2.c cVar7 = hVar2.G;
                        if (cVar7.d) {
                            long j38 = cVar7.e;
                            if (j38 != j13) {
                                if (j38 == j3) {
                                    j38 = 5000;
                                }
                                hVar2.D.postDelayed(hVar2.v, Math.max(j3, (hVar2.I + j38) - SystemClock.elapsedRealtime()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            j12 = j10;
            long j252 = j11 - j12;
            cVar = hVar2.G;
            if (cVar.d) {
            }
            long S62 = j12 - h2.m0.S(hVar3.b);
            p2.c cVar52 = hVar2.G;
            hVar2.n(new e(cVar52.a, j14, hVar2.K, hVar2.N, S62, j252, j15, cVar52, hVar2.i(), hVar2.G.d ? hVar2.u() : null));
            if (hVar2.h) {
            }
        }
        z10 = false;
        if (z10) {
        }
        j12 = j10;
        long j2522 = j11 - j12;
        cVar = hVar2.G;
        if (cVar.d) {
        }
        long S622 = j12 - h2.m0.S(hVar3.b);
        p2.c cVar522 = hVar2.G;
        hVar2.n(new e(cVar522.a, j14, hVar2.K, hVar2.N, S622, j2522, j15, cVar522, hVar2.i(), hVar2.G.d ? hVar2.u() : null));
        if (hVar2.h) {
        }
    }
}
