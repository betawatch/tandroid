package l2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.e0;
import b2.f0;
import b2.k0;
import b2.l0;
import com.google.android.gms.internal.cast.b5;
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
import ji.u4;
import m2.u;
import u2.d0;
import u2.t;
import v7.p7;
import y2.p;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g extends u2.a {
    public y2.m A;
    public c0 B;
    public b5 C;
    public Handler D;
    public e0 E;
    public Uri F;
    public final Uri G;
    public m2.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public k0 P;
    public final boolean h;
    public final g2.g i;
    public final a5.a j;
    public final qb.b k;
    public final n2.m l;
    public final rb.a m;
    public final fg.f n;
    public final long o;
    public final long p;
    public final a5.a q;
    public final y2.o r;
    public final l.d s;
    public final Object t;
    public final SparseArray u;
    public final c v;
    public final c w;
    public final u4 x;
    public final y2.n y;
    public g2.h z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [l2.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [l2.c] */
    public g(k0 k0Var, g2.g gVar, y2.o oVar, a5.a aVar, qb.b bVar, n2.m mVar, rb.a aVar2, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.c;
        f0 f0Var = k0Var.b;
        f0Var.getClass();
        Uri uri = f0Var.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.i = gVar;
        this.r = oVar;
        this.j = aVar;
        this.l = mVar;
        this.m = aVar2;
        this.o = j3;
        this.p = j10;
        this.k = bVar;
        this.n = new fg.f(5);
        this.h = false;
        this.q = b(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new u4(this, 3);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new l.d(this, 1);
        this.y = new xa.c(this, 27);
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
                        this.b.A();
                        break;
                    default:
                        this.b.y(false);
                        break;
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
                        this.b.A();
                        break;
                    default:
                        this.b.y(false);
                        break;
                }
            }
        };
    }

    public static boolean u(m2.h hVar) {
        List list = hVar.c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m2.a) list.get(i10)).b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        p pVar = new p(this.z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        l.d dVar = this.s;
        this.m.getClass();
        this.A.f(pVar, dVar, 3);
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
        int intValue = ((Integer) f0Var.a).intValue() - this.O;
        a5.a b10 = b(f0Var);
        n2.j jVar = new n2.j(this.d.c, 0, f0Var);
        int i10 = this.O + intValue;
        m2.c cVar = this.H;
        c0 c0Var = this.B;
        long j10 = this.L;
        j2.k kVar = this.g;
        e2.d.h(kVar);
        b bVar = new b(i10, cVar, this.n, intValue, this.j, c0Var, this.l, jVar, this.m, b10, j10, this.y, dVar, this.k, this.x, kVar);
        this.u.put(i10, bVar);
        return bVar;
    }

    @Override // u2.a
    public final synchronized k0 i() {
        return this.P;
    }

    @Override // u2.a
    public final void k() {
        this.y.b();
    }

    @Override // u2.a
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.g;
        e2.d.h(kVar);
        n2.m mVar = this.l;
        mVar.B(myLooper, kVar);
        mVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.z = this.i.createDataSource();
        this.A = new y2.m("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override // u2.a
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        o oVar = bVar.x;
        oVar.r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.C(bVar);
        }
        bVar.G = null;
        this.u.remove(bVar.a);
    }

    @Override // u2.a
    public final void q() {
        this.I = false;
        this.z = null;
        y2.m mVar = this.A;
        if (mVar != null) {
            mVar.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.u.clear();
        fg.f fVar = this.n;
        ((HashMap) fVar.a).clear();
        ((HashMap) fVar.b).clear();
        ((HashMap) fVar.c).clear();
        this.l.release();
    }

    @Override // u2.a
    public final synchronized void t(k0 k0Var) {
        this.P = k0Var;
    }

    public final void v() {
        boolean z10;
        y2.m mVar = this.A;
        d dVar = new d(this);
        synchronized (z2.c.b) {
            z10 = z2.c.c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (mVar == null) {
            mVar = new y2.m("SntpClient");
        }
        mVar.f(new na.d(), new z2.b(dVar), 1);
    }

    public final void w(p pVar, long j3) {
        long j10 = pVar.a;
        Uri uri = pVar.d.c;
        t tVar = new t(j3);
        this.m.getClass();
        this.q.n(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0379, code lost:
    
        if (r15.a == (-9223372036854775807L)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016f, code lost:
    
        r11 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(boolean z10) {
        long j3;
        long j10;
        long j11;
        boolean z11;
        m2.c cVar;
        boolean z12;
        long j12;
        long j13;
        long j14;
        int i10;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        float f7;
        float f10;
        float f11;
        float f12;
        long Q;
        long min;
        boolean z13;
        h d;
        boolean z14 = false;
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.u;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i11);
            if (keyAt >= this.O) {
                b bVar = (b) sparseArray.valueAt(i11);
                m2.c cVar2 = this.H;
                int i12 = keyAt - this.O;
                bVar.K = cVar2;
                bVar.L = i12;
                o oVar = bVar.x;
                oVar.n = z14;
                oVar.f = cVar2;
                Iterator it = oVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < oVar.f.h) {
                        it.remove();
                    }
                }
                v2.h[] hVarArr = bVar.H;
                if (hVarArr != null) {
                    for (v2.h hVar : hVarArr) {
                        k kVar = hVar.e;
                        i[] iVarArr = kVar.i;
                        try {
                            kVar.k = cVar2;
                            kVar.l = i12;
                            long d10 = cVar2.d(i12);
                            ArrayList a2 = kVar.a();
                            for (int i13 = 0; i13 < iVarArr.length; i13++) {
                                try {
                                    iVarArr[i13] = iVarArr[i13].a(d10, (m2.m) a2.get(kVar.j.h(i13)));
                                } catch (u2.b e7) {
                                    e = e7;
                                    kVar.m = e;
                                }
                            }
                        } catch (u2.b e10) {
                            e = e10;
                        }
                    }
                    bVar.G.b(bVar);
                }
                bVar.M = cVar2.b(i12).d;
                for (l lVar : bVar.I) {
                    Iterator it2 = bVar.M.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            m2.g gVar = (m2.g) it2.next();
                            if (gVar.a().equals(lVar.e.a())) {
                                lVar.a(gVar, cVar2.d && i12 == cVar2.m.size() + (-1));
                            }
                        }
                    }
                }
            }
            i11++;
            z14 = false;
        }
        m2.h b10 = this.H.b(0);
        int size = this.H.m.size() - 1;
        m2.h b11 = this.H.b(size);
        long d11 = this.H.d(size);
        long Q2 = e2.d0.Q(e2.d0.A(this.L));
        long d12 = this.H.d(0);
        long j20 = b10.b;
        List list = b10.c;
        long Q3 = e2.d0.Q(j20);
        boolean u10 = u(b10);
        long j21 = Q3;
        int i14 = 0;
        while (true) {
            long j22 = Q3;
            if (i14 >= list.size()) {
                j3 = 0;
                j10 = j21;
                break;
            }
            m2.a aVar = (m2.a) list.get(i14);
            j3 = 0;
            List list2 = aVar.c;
            int i15 = aVar.b;
            boolean z15 = (i15 == 1 || i15 == 2) ? false : true;
            if ((!u10 || !z15) && !list2.isEmpty()) {
                h d13 = ((m2.m) list2.get(0)).d();
                if (d13 != null && d13.y(d12, Q2) != 0) {
                    j21 = Math.max(j21, d13.a(d13.e(d12, Q2)) + j22);
                }
            }
            i14++;
            Q3 = j22;
        }
        long j23 = b11.b;
        List list3 = b11.c;
        long Q4 = e2.d0.Q(j23);
        boolean u11 = u(b11);
        long j24 = Long.MAX_VALUE;
        int i16 = 0;
        while (true) {
            if (i16 >= list3.size()) {
                j11 = j24;
                break;
            }
            m2.a aVar2 = (m2.a) list3.get(i16);
            boolean z16 = u11;
            List list4 = aVar2.c;
            int i17 = aVar2.b;
            long j25 = Q4;
            if (i17 != 1 && i17 != 2) {
                z13 = true;
                if ((z16 || !z13) && !list4.isEmpty()) {
                    d = ((m2.m) list4.get(0)).d();
                    if (d != null) {
                        j11 = j25 + d11;
                        break;
                    }
                    long y3 = d.y(d11, Q2);
                    if (y3 == j3) {
                        j11 = j25;
                        break;
                    } else {
                        long e11 = (d.e(d11, Q2) + y3) - 1;
                        j24 = Math.min(j24, d.c(e11, d11) + d.a(e11) + j25);
                    }
                }
                i16++;
                u11 = z16;
                Q4 = j25;
            }
            z13 = false;
            if (z16) {
            }
            d = ((m2.m) list4.get(0)).d();
            if (d != null) {
            }
        }
        if (this.H.d) {
            for (int i18 = 0; i18 < list3.size(); i18++) {
                h d14 = ((m2.m) ((m2.a) list3.get(i18)).c.get(0)).d();
                if (d14 != null && !d14.t()) {
                }
            }
            z11 = true;
            if (z11) {
                long j26 = this.H.f;
                if (j26 != -9223372036854775807L) {
                    j10 = Math.max(j10, j11 - e2.d0.Q(j26));
                }
            }
            long j27 = j11 - j10;
            cVar = this.H;
            if (cVar.d) {
                z12 = z11;
                j12 = -9223372036854775807L;
                j13 = -9223372036854775807L;
                j14 = j3;
            } else {
                e2.d.g(cVar.a != -9223372036854775807L);
                long Q5 = (Q2 - e2.d0.Q(this.H.a)) - j10;
                e0 e0Var = i().c;
                long e02 = e2.d0.e0(Q5);
                long j28 = e0Var.c;
                if (j28 != -9223372036854775807L) {
                    j15 = Math.min(e02, j28);
                } else {
                    b2.d0 d0Var = this.H.j;
                    if (d0Var != null) {
                        long j29 = d0Var.c;
                        if (j29 != -9223372036854775807L) {
                            j15 = Math.min(e02, j29);
                        }
                    }
                    j15 = e02;
                }
                long e03 = e2.d0.e0(Q5 - j27);
                if (e03 < j3 && j15 > j3) {
                    e03 = j3;
                }
                j12 = -9223372036854775807L;
                long j30 = this.H.c;
                if (j30 != -9223372036854775807L) {
                    e03 = Math.min(e03 + j30, e02);
                }
                long j31 = e03;
                long j32 = e0Var.b;
                if (j32 != -9223372036854775807L) {
                    j31 = e2.d0.i(j32, j31, e02);
                } else {
                    b2.d0 d0Var2 = this.H.j;
                    if (d0Var2 != null) {
                        long j33 = d0Var2.b;
                        if (j33 != -9223372036854775807L) {
                            j31 = e2.d0.i(j33, j31, e02);
                        }
                    }
                }
                long j34 = j31;
                long j35 = j34 > j15 ? j34 : j15;
                long j36 = this.E.a;
                if (j36 == -9223372036854775807L) {
                    m2.c cVar3 = this.H;
                    b2.d0 d0Var3 = cVar3.j;
                    if (d0Var3 != null) {
                        long j37 = d0Var3.a;
                        if (j37 != -9223372036854775807L) {
                            j36 = j37;
                        }
                    }
                    j36 = cVar3.g;
                    if (j36 == -9223372036854775807L) {
                        j36 = this.o;
                    }
                }
                if (j36 < j34) {
                    j36 = j34;
                }
                long j38 = this.p;
                if (j36 > j35) {
                    j16 = 2;
                    j17 = j34;
                    j18 = Q5;
                    j19 = e2.d0.i(e2.d0.e0(Q5 - Math.min(j38, j27 / 2)), j34, j35);
                } else {
                    j16 = 2;
                    j17 = j34;
                    j18 = Q5;
                    j19 = j36;
                }
                z12 = z11;
                long j39 = j35;
                float f13 = e0Var.d;
                if (f13 == -3.4028235E38f) {
                    b2.d0 d0Var4 = this.H.j;
                    f13 = d0Var4 != null ? d0Var4.d : -3.4028235E38f;
                }
                float f14 = e0Var.e;
                if (f14 == -3.4028235E38f) {
                    b2.d0 d0Var5 = this.H.j;
                    f14 = d0Var5 != null ? d0Var5.e : -3.4028235E38f;
                }
                if (f13 == -3.4028235E38f && f14 == -3.4028235E38f) {
                    b2.d0 d0Var6 = this.H.j;
                    if (d0Var6 != null) {
                        f7 = f13;
                        f10 = f14;
                    }
                    f12 = 1.0f;
                    f11 = 1.0f;
                    b2.d0 d0Var7 = new b2.d0();
                    d0Var7.a = j19;
                    d0Var7.b = j17;
                    d0Var7.c = j39;
                    d0Var7.d = f12;
                    d0Var7.e = f11;
                    this.E = new e0(d0Var7);
                    long e04 = e2.d0.e0(j10) + this.H.a;
                    Q = j18 - e2.d0.Q(this.E.a);
                    min = Math.min(j38, j27 / j16);
                    if (Q >= min) {
                        j14 = min;
                        j13 = e04;
                    } else {
                        j13 = e04;
                        j14 = Q;
                    }
                } else {
                    f7 = f13;
                    f10 = f14;
                }
                f12 = f7;
                f11 = f10;
                b2.d0 d0Var72 = new b2.d0();
                d0Var72.a = j19;
                d0Var72.b = j17;
                d0Var72.c = j39;
                d0Var72.d = f12;
                d0Var72.e = f11;
                this.E = new e0(d0Var72);
                long e042 = e2.d0.e0(j10) + this.H.a;
                Q = j18 - e2.d0.Q(this.E.a);
                min = Math.min(j38, j27 / j16);
                if (Q >= min) {
                }
            }
            long Q6 = j10 - e2.d0.Q(b10.b);
            m2.c cVar4 = this.H;
            n(new e(cVar4.a, j13, this.L, this.O, Q6, j27, j14, cVar4, i(), !this.H.d ? this.E : null));
            if (this.h) {
                Handler handler = this.D;
                c cVar5 = this.w;
                handler.removeCallbacks(cVar5);
                if (z12) {
                    Handler handler2 = this.D;
                    m2.c cVar6 = this.H;
                    long A = e2.d0.A(this.L);
                    int size2 = cVar6.m.size() - 1;
                    m2.h b12 = cVar6.b(size2);
                    long j40 = b12.b;
                    List list5 = b12.c;
                    long Q7 = e2.d0.Q(j40);
                    long d15 = cVar6.d(size2);
                    long Q8 = e2.d0.Q(A);
                    long Q9 = e2.d0.Q(cVar6.a);
                    long Q10 = e2.d0.Q(cVar6.e);
                    if (Q10 == j12 || Q10 >= 5000000) {
                        Q10 = 5000000;
                    }
                    int i19 = 0;
                    while (i19 < list5.size()) {
                        List list6 = ((m2.a) list5.get(i19)).c;
                        if (list6.isEmpty()) {
                            i10 = i19;
                        } else {
                            i10 = i19;
                            h d16 = ((m2.m) list6.get(0)).d();
                            if (d16 != null) {
                                long f15 = (d16.f(d15, Q8) + (Q9 + Q7)) - Q8;
                                if (f15 > j3 && (f15 < Q10 - 100000 || (f15 > Q10 && f15 < Q10 + 100000))) {
                                    Q10 = f15;
                                }
                            }
                        }
                        i19 = i10 + 1;
                    }
                    handler2.postDelayed(cVar5, p7.b(Q10, 1000L, RoundingMode.CEILING));
                }
                if (this.I) {
                    A();
                    return;
                }
                if (z10) {
                    m2.c cVar7 = this.H;
                    if (cVar7.d) {
                        long j41 = cVar7.e;
                        if (j41 != j12) {
                            if (j41 == j3) {
                                j41 = 5000;
                            }
                            this.D.postDelayed(this.v, Math.max(j3, (this.J + j41) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z11 = false;
        if (z11) {
        }
        long j272 = j11 - j10;
        cVar = this.H;
        if (cVar.d) {
        }
        long Q62 = j10 - e2.d0.Q(b10.b);
        m2.c cVar42 = this.H;
        n(new e(cVar42.a, j13, this.L, this.O, Q62, j272, j14, cVar42, i(), !this.H.d ? this.E : null));
        if (this.h) {
        }
    }

    public final void z(u uVar, y2.o oVar) {
        g2.h hVar = this.z;
        Uri parse = Uri.parse(uVar.c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new p(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, oVar), new d(this), 1);
    }
}
