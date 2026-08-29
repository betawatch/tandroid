package o4;

import ag.j2;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.exoplayer2.upstream.y0;
import com.google.android.gms.internal.cast.z4;
import com.google.firebase.messaging.s;
import f5.d0;
import f7.v;
import j3.a1;
import j3.b1;
import j3.c1;
import j3.f1;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.c0;
import l4.g0;
import l4.z;
import nh.d6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends l4.a {
    public q0 A;
    public y0 B;
    public z4 C;
    public Handler D;
    public b1 E;
    public Uri F;
    public final Uri G;
    public p4.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final f1 h;
    public final boolean i;
    public final com.google.android.exoplayer2.upstream.l j;
    public final d6 k;
    public final bb.a l;
    public final n3.i m;
    public final v n;
    public final s o;
    public final long p;
    public final g0 q;
    public final s0 r;
    public final o1.a s;
    public final Object t;
    public final SparseArray u;
    public final c v;
    public final c w;
    public final d6 x;
    public final r0 y;
    public com.google.android.exoplayer2.upstream.m z;

    static {
        j3.r0.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [o4.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [o4.c] */
    public h(f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, s0 s0Var, d6 d6Var, bb.a aVar, n3.i iVar, v vVar, long j10) {
        this.h = f1Var;
        this.E = f1Var.c;
        c1 c1Var = f1Var.b;
        c1Var.getClass();
        Uri uri = c1Var.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.j = lVar;
        this.r = s0Var;
        this.k = d6Var;
        this.m = iVar;
        this.n = vVar;
        this.p = j10;
        this.l = aVar;
        this.o = new s(20);
        this.i = false;
        this.q = a(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new d6(this, 3);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new o1.a(this, 2);
        final int i10 = 0;
        this.y = new g(this, 0);
        this.v = new Runnable(this) { // from class: o4.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.v();
                        break;
                    default:
                        this.b.u(false);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.w = new Runnable(this) { // from class: o4.c
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.v();
                        break;
                    default:
                        this.b.u(false);
                        break;
                }
            }
        };
    }

    public static boolean s(p4.h hVar) {
        List list = hVar.c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((p4.a) list.get(i10)).b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // l4.a
    public final z b(c0 c0Var, r rVar, long j10) {
        int intValue = ((Integer) c0Var.a).intValue() - this.O;
        g0 g0Var = new g0(this.c.c, 0, c0Var, this.H.b(intValue).b);
        j2 j2Var = new j2((CopyOnWriteArrayList) this.d.d, 0, c0Var);
        int i10 = this.O + intValue;
        p4.c cVar = this.H;
        y0 y0Var = this.B;
        long j11 = this.L;
        k3.k kVar = this.g;
        f5.a.j(kVar);
        b bVar = new b(i10, cVar, this.o, intValue, this.k, y0Var, this.m, j2Var, this.n, g0Var, j11, this.y, rVar, this.l, this.x, kVar);
        this.u.put(i10, bVar);
        return bVar;
    }

    @Override // l4.a
    public final f1 h() {
        return this.h;
    }

    @Override // l4.a
    public final void j() {
        this.y.a();
    }

    @Override // l4.a
    public final void l(y0 y0Var) {
        this.B = y0Var;
        n3.i iVar = this.m;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        k3.k kVar = this.g;
        f5.a.j(kVar);
        iVar.q(myLooper, kVar);
        if (this.i) {
            u(false);
            return;
        }
        this.z = this.j.createDataSource();
        this.A = new q0("DashMediaSource");
        this.D = d0.k(null);
        v();
    }

    @Override // l4.a
    public final void n(z zVar) {
        b bVar = (b) zVar;
        p pVar = bVar.x;
        pVar.r = true;
        pVar.d.removeCallbacksAndMessages(null);
        for (n4.h hVar : bVar.D) {
            hVar.w(bVar);
        }
        bVar.C = null;
        this.u.remove(bVar.a);
    }

    @Override // l4.a
    public final void p() {
        this.I = false;
        this.z = null;
        q0 q0Var = this.A;
        if (q0Var != null) {
            q0Var.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.i ? this.H : null;
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
        this.O = 0;
        this.u.clear();
        s sVar = this.o;
        ((HashMap) sVar.b).clear();
        ((HashMap) sVar.c).clear();
        ((HashMap) sVar.d).clear();
        this.m.release();
    }

    public final void t() {
        boolean z10;
        q0 q0Var = this.A;
        d dVar = new d(this);
        synchronized (f5.a.i) {
            z10 = f5.a.j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (q0Var == null) {
            q0Var = new q0("SntpClient");
        }
        q0Var.f(new x9.d(6), new m5.i(dVar, 13), 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x049d, code lost:
    
        if (r8 > r21) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04a0, code lost:
    
        if (r11 > 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04a3, code lost:
    
        if (r11 < 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016f, code lost:
    
        r11 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(boolean z10) {
        long j10;
        long j11;
        long j12;
        boolean z11;
        p4.c cVar;
        long j13;
        long j14;
        long j15;
        i c3;
        long j16;
        long j17;
        float f9;
        float f10;
        boolean z12;
        i c6;
        boolean z13 = false;
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u;
            if (i10 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i10);
            if (keyAt >= this.O) {
                b bVar = (b) sparseArray.valueAt(i10);
                p4.c cVar2 = this.H;
                int i11 = keyAt - this.O;
                bVar.G = cVar2;
                bVar.H = i11;
                p pVar = bVar.x;
                pVar.n = z13;
                pVar.f = cVar2;
                Iterator it = pVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < pVar.f.h) {
                        it.remove();
                    }
                }
                n4.h[] hVarArr = bVar.D;
                if (hVarArr != null) {
                    for (n4.h hVar : hVarArr) {
                        l lVar = hVar.e;
                        j[] jVarArr = lVar.h;
                        try {
                            lVar.j = cVar2;
                            lVar.k = i11;
                            long d = cVar2.d(i11);
                            ArrayList a2 = lVar.a();
                            for (int i12 = 0; i12 < jVarArr.length; i12++) {
                                try {
                                    jVarArr[i12] = jVarArr[i12].a(d, (p4.m) a2.get(lVar.i.i(i12)));
                                } catch (l4.b e10) {
                                    e = e10;
                                    lVar.l = e;
                                }
                            }
                        } catch (l4.b e11) {
                            e = e11;
                        }
                    }
                    bVar.C.a(bVar);
                }
                bVar.I = cVar2.b(i11).d;
                for (m mVar : bVar.E) {
                    Iterator it2 = bVar.I.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            p4.g gVar = (p4.g) it2.next();
                            if (gVar.a().equals(mVar.e.a())) {
                                mVar.b(gVar, cVar2.d && i11 == cVar2.m.size() + (-1));
                            }
                        }
                    }
                }
            }
            i10++;
            z13 = false;
        }
        p4.h b10 = this.H.b(0);
        int size = this.H.m.size() - 1;
        p4.h b11 = this.H.b(size);
        long d10 = this.H.d(size);
        long H = d0.H(d0.t(this.L));
        long d11 = this.H.d(0);
        long j18 = b10.b;
        List list = b10.c;
        long H2 = d0.H(j18);
        boolean s10 = s(b10);
        long j19 = H2;
        int i13 = 0;
        while (true) {
            long j20 = H2;
            if (i13 >= list.size()) {
                j10 = 0;
                j11 = j19;
                break;
            }
            p4.a aVar = (p4.a) list.get(i13);
            j10 = 0;
            List list2 = aVar.c;
            int i14 = aVar.b;
            boolean z14 = (i14 == 1 || i14 == 2) ? false : true;
            if ((!s10 || !z14) && !list2.isEmpty()) {
                i c10 = ((p4.m) list2.get(0)).c();
                if (c10 != null && c10.H(d11, H) != 0) {
                    j19 = Math.max(j19, c10.b(c10.n(d11, H)) + j20);
                }
            }
            i13++;
            H2 = j20;
        }
        long j21 = b11.b;
        List list3 = b11.c;
        long H3 = d0.H(j21);
        boolean s11 = s(b11);
        long j22 = Long.MAX_VALUE;
        int i15 = 0;
        while (true) {
            if (i15 >= list3.size()) {
                j12 = j22;
                break;
            }
            p4.a aVar2 = (p4.a) list3.get(i15);
            boolean z15 = s11;
            List list4 = aVar2.c;
            int i16 = aVar2.b;
            long j23 = H3;
            if (i16 != 1 && i16 != 2) {
                z12 = true;
                if ((z15 || !z12) && !list4.isEmpty()) {
                    c6 = ((p4.m) list4.get(0)).c();
                    if (c6 != null) {
                        j12 = j23 + d10;
                        break;
                    }
                    long H4 = c6.H(d10, H);
                    if (H4 == j10) {
                        j12 = j23;
                        break;
                    } else {
                        long n10 = (c6.n(d10, H) + H4) - 1;
                        j22 = Math.min(j22, c6.g(n10, d10) + c6.b(n10) + j23);
                    }
                }
                i15++;
                s11 = z15;
                H3 = j23;
            }
            z12 = false;
            if (z15) {
            }
            c6 = ((p4.m) list4.get(0)).c();
            if (c6 != null) {
            }
        }
        if (this.H.d) {
            for (int i17 = 0; i17 < list3.size(); i17++) {
                i c11 = ((p4.m) ((p4.a) list3.get(i17)).c.get(0)).c();
                if (c11 != null && !c11.y()) {
                }
            }
            z11 = true;
            if (z11) {
                long j24 = this.H.f;
                if (j24 != -9223372036854775807L) {
                    j11 = Math.max(j11, j12 - d0.H(j24));
                }
            }
            long j25 = j12 - j11;
            cVar = this.H;
            if (cVar.d) {
                j13 = -9223372036854775807L;
                j14 = -9223372036854775807L;
                j15 = j10;
            } else {
                f5.a.i(cVar.a != -9223372036854775807L);
                long H5 = (H - d0.H(this.H.a)) - j11;
                long S = d0.S(H5);
                b1 b1Var = this.h.c;
                long j26 = b1Var.c;
                if (j26 != -9223372036854775807L) {
                    j16 = Math.min(S, j26);
                } else {
                    a1 a1Var = this.H.j;
                    if (a1Var != null) {
                        long j27 = a1Var.c;
                        if (j27 != -9223372036854775807L) {
                            j16 = Math.min(S, j27);
                        }
                    }
                    j16 = S;
                }
                long S2 = d0.S(H5 - j25);
                if (S2 < j10 && j16 > j10) {
                    S2 = j10;
                }
                j13 = -9223372036854775807L;
                long j28 = this.H.c;
                if (j28 != -9223372036854775807L) {
                    S2 = Math.min(S2 + j28, S);
                }
                long j29 = S2;
                long j30 = b1Var.b;
                if (j30 != -9223372036854775807L) {
                    j29 = d0.i(j30, j29, S);
                } else {
                    a1 a1Var2 = this.H.j;
                    if (a1Var2 != null) {
                        long j31 = a1Var2.b;
                        if (j31 != -9223372036854775807L) {
                            j29 = d0.i(j31, j29, S);
                        }
                    }
                }
                long j32 = j29;
                long j33 = j32 > j16 ? j32 : j16;
                long j34 = this.E.a;
                if (j34 == -9223372036854775807L) {
                    p4.c cVar3 = this.H;
                    a1 a1Var3 = cVar3.j;
                    if (a1Var3 != null) {
                        long j35 = a1Var3.a;
                        if (j35 != -9223372036854775807L) {
                            j34 = j35;
                        }
                    }
                    j34 = cVar3.g;
                    if (j34 == -9223372036854775807L) {
                        j34 = this.p;
                    }
                }
                if (j34 < j32) {
                    j34 = j32;
                }
                if (j34 > j33) {
                    j34 = d0.i(d0.S(H5 - Math.min(5000000L, j25 / 2)), j32, j33);
                }
                long j36 = j34;
                float f11 = b1Var.d;
                if (f11 == -3.4028235E38f) {
                    a1 a1Var4 = this.H.j;
                    f11 = a1Var4 != null ? a1Var4.d : -3.4028235E38f;
                }
                float f12 = b1Var.e;
                if (f12 == -3.4028235E38f) {
                    a1 a1Var5 = this.H.j;
                    f12 = a1Var5 != null ? a1Var5.e : -3.4028235E38f;
                }
                if (f11 == -3.4028235E38f && f12 == -3.4028235E38f) {
                    a1 a1Var6 = this.H.j;
                    j17 = 2;
                    if (a1Var6 == null || a1Var6.a == -9223372036854775807L) {
                        f10 = 1.0f;
                        f9 = 1.0f;
                        this.E = new b1(j36, j32, j33, f10, f9);
                        long S3 = d0.S(j11) + this.H.a;
                        long H6 = H5 - d0.H(this.E.a);
                        long min = Math.min(5000000L, j25 / j17);
                        j15 = H6 >= min ? min : H6;
                        j14 = S3;
                    }
                } else {
                    j17 = 2;
                }
                f10 = f11;
                f9 = f12;
                this.E = new b1(j36, j32, j33, f10, f9);
                long S32 = d0.S(j11) + this.H.a;
                long H62 = H5 - d0.H(this.E.a);
                long min2 = Math.min(5000000L, j25 / j17);
                if (H62 >= min2) {
                }
                j14 = S32;
            }
            long H7 = j11 - d0.H(b10.b);
            p4.c cVar4 = this.H;
            m(new e(cVar4.a, j14, this.L, this.O, H7, j25, j15, cVar4, this.h, !cVar4.d ? this.E : null));
            if (this.i) {
                Handler handler = this.D;
                c cVar5 = this.w;
                handler.removeCallbacks(cVar5);
                if (z11) {
                    Handler handler2 = this.D;
                    p4.c cVar6 = this.H;
                    long t10 = d0.t(this.L);
                    int size2 = cVar6.m.size() - 1;
                    p4.h b12 = cVar6.b(size2);
                    long j37 = b12.b;
                    List list5 = b12.c;
                    long H8 = d0.H(j37);
                    long d12 = cVar6.d(size2);
                    long H9 = d0.H(t10);
                    long H10 = d0.H(cVar6.a);
                    long H11 = d0.H(5000L);
                    for (int i18 = 0; i18 < list5.size(); i18++) {
                        List list6 = ((p4.a) list5.get(i18)).c;
                        if (!list6.isEmpty() && (c3 = ((p4.m) list6.get(0)).c()) != null) {
                            long o10 = (c3.o(d12, H9) + (H10 + H8)) - H9;
                            if (o10 < H11 - 100000 || (o10 > H11 && o10 < H11 + 100000)) {
                                H11 = o10;
                            }
                        }
                    }
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    long j38 = H11 / 1000;
                    long j39 = H11 - (1000 * j38);
                    if (j39 != j10) {
                        int i19 = ((int) ((H11 ^ 1000) >> 63)) | 1;
                        switch (r8.c.a[roundingMode.ordinal()]) {
                            case 1:
                                if (j39 != j10) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                j38 += i19;
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                                long abs = Math.abs(j39);
                                long abs2 = abs - (Math.abs(1000L) - abs);
                                if (abs2 == j10) {
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                    break;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    handler2.postDelayed(cVar5, j38);
                }
                if (this.I) {
                    v();
                    return;
                }
                if (z10) {
                    p4.c cVar7 = this.H;
                    if (cVar7.d) {
                        long j40 = cVar7.e;
                        if (j40 != j13) {
                            this.D.postDelayed(this.v, Math.max(j10, (this.J + (j40 == j10 ? 5000L : j40)) - SystemClock.elapsedRealtime()));
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
        long j252 = j12 - j11;
        cVar = this.H;
        if (cVar.d) {
        }
        long H72 = j11 - d0.H(b10.b);
        p4.c cVar42 = this.H;
        m(new e(cVar42.a, j14, this.L, this.O, H72, j252, j15, cVar42, this.h, !cVar42.d ? this.E : null));
        if (this.i) {
        }
    }

    public final void v() {
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
        t0 t0Var = new t0(this.z, uri, 4, this.r);
        o1.a aVar = this.s;
        this.n.getClass();
        this.A.f(t0Var, aVar, 3);
        this.q.k(new l4.p(t0Var.b), t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
