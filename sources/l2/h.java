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
import com.google.android.gms.internal.cast.z4;
import com.google.firebase.messaging.s;
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
import k2.g0;
import m.f3;
import t7.t;
import u2.d0;
import v7.n7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h extends u2.a {
    public y2.l A;
    public c0 B;
    public z4 C;
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
    public final t k;
    public final n2.m l;
    public final rb.a m;
    public final s n;
    public final long o;
    public final long p;
    public final a5.a q;
    public final y2.n r;
    public final g0 s;
    public final Object t;
    public final SparseArray u;
    public final c v;
    public final c w;
    public final f x;
    public final y2.m y;
    public g2.h z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [l2.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [l2.c] */
    public h(k0 k0Var, g2.g gVar, y2.n nVar, a5.a aVar, t tVar, n2.m mVar, rb.a aVar2, long j3, long j10) {
        this.P = k0Var;
        this.E = k0Var.c;
        f0 f0Var = k0Var.b;
        f0Var.getClass();
        Uri uri = f0Var.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.i = gVar;
        this.r = nVar;
        this.j = aVar;
        this.l = mVar;
        this.m = aVar2;
        this.o = j3;
        this.p = j10;
        this.k = tVar;
        this.n = new s(6);
        this.h = false;
        this.q = b(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new f(this, 0);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new g0(this, 2);
        this.y = new a4.l(this, 28);
        final int i10 = 0;
        this.v = new Runnable(this) { // from class: l2.c
            public final /* synthetic */ h b;

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
            public final /* synthetic */ h b;

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
        y2.o oVar = new y2.o(this.z, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        g0 g0Var = this.s;
        this.m.getClass();
        this.A.f(oVar, g0Var, 3);
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
        this.y.a();
    }

    @Override // u2.a
    public final void m(c0 c0Var) {
        this.B = c0Var;
        Looper myLooper = Looper.myLooper();
        j2.k kVar = this.g;
        e2.d.h(kVar);
        n2.m mVar = this.l;
        mVar.F(myLooper, kVar);
        mVar.b();
        if (this.h) {
            y(false);
            return;
        }
        this.z = this.i.createDataSource();
        this.A = new y2.l("DashMediaSource");
        this.D = e2.d0.o(null);
        A();
    }

    @Override // u2.a
    public final void o(d0 d0Var) {
        b bVar = (b) d0Var;
        p pVar = bVar.x;
        pVar.r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (v2.h hVar : bVar.H) {
            hVar.z(bVar);
        }
        bVar.G = null;
        this.u.remove(bVar.a);
    }

    @Override // u2.a
    public final void q() {
        this.I = false;
        this.z = null;
        y2.l lVar = this.A;
        if (lVar != null) {
            lVar.e(null);
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
        s sVar = this.n;
        ((HashMap) sVar.b).clear();
        ((HashMap) sVar.c).clear();
        ((HashMap) sVar.d).clear();
        this.l.release();
    }

    @Override // u2.a
    public final synchronized void t(k0 k0Var) {
        this.P = k0Var;
    }

    public final void v() {
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
        lVar.f(new rb.a(27), new f3(dVar, 25), 1);
    }

    public final void w(y2.o oVar, long j3) {
        long j10 = oVar.a;
        Uri uri = oVar.d.c;
        u2.t tVar = new u2.t(j3);
        this.m.getClass();
        this.q.p(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        e2.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0377, code lost:
    
        if (r15.a == (-9223372036854775807L)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0171, code lost:
    
        r11 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [int] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r15v10, types: [int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v25, types: [x2.r] */
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
        long P;
        long min;
        boolean z13;
        i c10;
        boolean z14;
        boolean z15 = false;
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
                p pVar = bVar.x;
                pVar.n = z15;
                pVar.f = cVar2;
                Iterator it = pVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < pVar.f.h) {
                        it.remove();
                    }
                }
                v2.h[] hVarArr = bVar.H;
                if (hVarArr != null) {
                    int length = hVarArr.length;
                    for (?? r10 = z15; r10 < length; r10++) {
                        l lVar = hVarArr[r10].e;
                        j[] jVarArr = lVar.i;
                        try {
                            lVar.k = cVar2;
                            lVar.l = i12;
                            long d = cVar2.d(i12);
                            ArrayList a2 = lVar.a();
                            for (?? r15 = z15; r15 < jVarArr.length; r15++) {
                                try {
                                    jVarArr[r15] = jVarArr[r15].a(d, (m2.m) a2.get(lVar.j.h(r15)));
                                } catch (u2.b e7) {
                                    e = e7;
                                    lVar.m = e;
                                    z15 = false;
                                }
                            }
                        } catch (u2.b e10) {
                            e = e10;
                        }
                        z15 = false;
                    }
                    z14 = true;
                    bVar.G.D(bVar);
                } else {
                    z14 = true;
                }
                bVar.M = cVar2.b(i12).d;
                for (m mVar : bVar.I) {
                    Iterator it2 = bVar.M.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            m2.g gVar = (m2.g) it2.next();
                            if (gVar.a().equals(mVar.e.a())) {
                                mVar.b(gVar, (cVar2.d && i12 == cVar2.m.size() + (-1)) ? z14 : false);
                            }
                        }
                    }
                }
            }
            i11++;
            z15 = false;
        }
        int i13 = 1;
        m2.h b10 = this.H.b(0);
        int size = this.H.m.size() - 1;
        m2.h b11 = this.H.b(size);
        long d10 = this.H.d(size);
        long P2 = e2.d0.P(e2.d0.z(this.L));
        long d11 = this.H.d(0);
        long j20 = b10.b;
        List list = b10.c;
        long P3 = e2.d0.P(j20);
        boolean u10 = u(b10);
        long j21 = P3;
        int i14 = 0;
        while (true) {
            long j22 = P3;
            if (i14 >= list.size()) {
                j3 = 0;
                j10 = j21;
                break;
            }
            m2.a aVar = (m2.a) list.get(i14);
            j3 = 0;
            List list2 = aVar.c;
            int i15 = aVar.b;
            boolean z16 = (i15 == i13 || i15 == 2) ? false : true;
            if ((!u10 || !z16) && !list2.isEmpty()) {
                i c11 = ((m2.m) list2.get(0)).c();
                if (c11 != null && c11.y(d11, P2) != 0) {
                    j21 = Math.max(j21, c11.b(c11.f(d11, P2)) + j22);
                }
            }
            i14++;
            P3 = j22;
            i13 = 1;
        }
        long j23 = b11.b;
        List list3 = b11.c;
        long P4 = e2.d0.P(j23);
        boolean u11 = u(b11);
        long j24 = Long.MAX_VALUE;
        int i16 = 0;
        while (true) {
            if (i16 >= list3.size()) {
                j11 = j24;
                break;
            }
            m2.a aVar2 = (m2.a) list3.get(i16);
            boolean z17 = u11;
            List list4 = aVar2.c;
            int i17 = aVar2.b;
            long j25 = P4;
            if (i17 != 1 && i17 != 2) {
                z13 = true;
                if ((z17 || !z13) && !list4.isEmpty()) {
                    c10 = ((m2.m) list4.get(0)).c();
                    if (c10 != null) {
                        j11 = j25 + d10;
                        break;
                    }
                    long y3 = c10.y(d10, P2);
                    if (y3 == j3) {
                        j11 = j25;
                        break;
                    } else {
                        long f13 = (c10.f(d10, P2) + y3) - 1;
                        j24 = Math.min(j24, c10.d(f13, d10) + c10.b(f13) + j25);
                    }
                }
                i16++;
                u11 = z17;
                P4 = j25;
            }
            z13 = false;
            if (z17) {
            }
            c10 = ((m2.m) list4.get(0)).c();
            if (c10 != null) {
            }
        }
        if (this.H.d) {
            for (int i18 = 0; i18 < list3.size(); i18++) {
                i c12 = ((m2.m) ((m2.a) list3.get(i18)).c.get(0)).c();
                if (c12 != null && !c12.t()) {
                }
            }
            z11 = true;
            if (z11) {
                long j26 = this.H.f;
                if (j26 != -9223372036854775807L) {
                    j10 = Math.max(j10, j11 - e2.d0.P(j26));
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
                long P5 = (P2 - e2.d0.P(this.H.a)) - j10;
                e0 e0Var = i().c;
                long d02 = e2.d0.d0(P5);
                long j28 = e0Var.c;
                if (j28 != -9223372036854775807L) {
                    j15 = Math.min(d02, j28);
                } else {
                    b2.d0 d0Var = this.H.j;
                    if (d0Var != null) {
                        long j29 = d0Var.c;
                        if (j29 != -9223372036854775807L) {
                            j15 = Math.min(d02, j29);
                        }
                    }
                    j15 = d02;
                }
                long d03 = e2.d0.d0(P5 - j27);
                if (d03 < j3 && j15 > j3) {
                    d03 = j3;
                }
                j12 = -9223372036854775807L;
                long j30 = this.H.c;
                if (j30 != -9223372036854775807L) {
                    d03 = Math.min(d03 + j30, d02);
                }
                long j31 = d03;
                long j32 = e0Var.b;
                if (j32 != -9223372036854775807L) {
                    j31 = e2.d0.i(j32, j31, d02);
                } else {
                    b2.d0 d0Var2 = this.H.j;
                    if (d0Var2 != null) {
                        long j33 = d0Var2.b;
                        if (j33 != -9223372036854775807L) {
                            j31 = e2.d0.i(j33, j31, d02);
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
                    j18 = P5;
                    j19 = e2.d0.i(e2.d0.d0(P5 - Math.min(j38, j27 / 2)), j34, j35);
                } else {
                    j16 = 2;
                    j17 = j34;
                    j18 = P5;
                    j19 = j36;
                }
                z12 = z11;
                long j39 = j35;
                float f14 = e0Var.d;
                if (f14 == -3.4028235E38f) {
                    b2.d0 d0Var4 = this.H.j;
                    f14 = d0Var4 != null ? d0Var4.d : -3.4028235E38f;
                }
                float f15 = e0Var.e;
                if (f15 == -3.4028235E38f) {
                    b2.d0 d0Var5 = this.H.j;
                    f15 = d0Var5 != null ? d0Var5.e : -3.4028235E38f;
                }
                if (f14 == -3.4028235E38f && f15 == -3.4028235E38f) {
                    b2.d0 d0Var6 = this.H.j;
                    if (d0Var6 != null) {
                        f7 = f14;
                        f10 = f15;
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
                    long d04 = e2.d0.d0(j10) + this.H.a;
                    P = j18 - e2.d0.P(this.E.a);
                    min = Math.min(j38, j27 / j16);
                    if (P >= min) {
                        j14 = min;
                        j13 = d04;
                    } else {
                        j13 = d04;
                        j14 = P;
                    }
                } else {
                    f7 = f14;
                    f10 = f15;
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
                long d042 = e2.d0.d0(j10) + this.H.a;
                P = j18 - e2.d0.P(this.E.a);
                min = Math.min(j38, j27 / j16);
                if (P >= min) {
                }
            }
            long P6 = j10 - e2.d0.P(b10.b);
            m2.c cVar4 = this.H;
            n(new e(cVar4.a, j13, this.L, this.O, P6, j27, j14, cVar4, i(), !this.H.d ? this.E : null));
            if (this.h) {
                Handler handler = this.D;
                c cVar5 = this.w;
                handler.removeCallbacks(cVar5);
                if (z12) {
                    Handler handler2 = this.D;
                    m2.c cVar6 = this.H;
                    long z18 = e2.d0.z(this.L);
                    int size2 = cVar6.m.size() - 1;
                    m2.h b12 = cVar6.b(size2);
                    long j40 = b12.b;
                    List list5 = b12.c;
                    long P7 = e2.d0.P(j40);
                    long d12 = cVar6.d(size2);
                    long P8 = e2.d0.P(z18);
                    long P9 = e2.d0.P(cVar6.a);
                    long P10 = e2.d0.P(cVar6.e);
                    if (P10 == j12 || P10 >= 5000000) {
                        P10 = 5000000;
                    }
                    int i19 = 0;
                    while (i19 < list5.size()) {
                        List list6 = ((m2.a) list5.get(i19)).c;
                        if (list6.isEmpty()) {
                            i10 = i19;
                        } else {
                            i10 = i19;
                            i c13 = ((m2.m) list6.get(0)).c();
                            if (c13 != null) {
                                long i20 = (c13.i(d12, P8) + (P9 + P7)) - P8;
                                if (i20 > j3 && (i20 < P10 - 100000 || (i20 > P10 && i20 < P10 + 100000))) {
                                    P10 = i20;
                                }
                            }
                        }
                        i19 = i10 + 1;
                    }
                    handler2.postDelayed(cVar5, n7.b(P10, 1000L, RoundingMode.CEILING));
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
        long P62 = j10 - e2.d0.P(b10.b);
        m2.c cVar42 = this.H;
        n(new e(cVar42.a, j13, this.L, this.O, P62, j272, j14, cVar42, i(), !this.H.d ? this.E : null));
        if (this.h) {
        }
    }

    public final void z(c5.a aVar, y2.n nVar) {
        g2.h hVar = this.z;
        Uri parse = Uri.parse(aVar.c);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(parse, "The uri must be set.");
        this.A.f(new y2.o(hVar, new g2.m(parse, 1, null, map, 0L, -1L, null, 1), 5, nVar), new d(this), 1);
    }
}
