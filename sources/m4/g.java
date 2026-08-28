package m4;

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
import com.google.firebase.messaging.t;
import d5.f0;
import h3.a1;
import h3.b1;
import h3.c1;
import h3.f1;
import j4.a0;
import j4.d0;
import j4.h0;
import j4.q;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends j4.a {
    public q0 A;
    public y0 B;
    public z4 C;
    public Handler D;
    public b1 E;
    public Uri F;
    public final Uri G;
    public n4.c H;
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
    public final android.support.v4.media.c k;
    public final za.a l;
    public final l3.i m;
    public final v9.d n;
    public final t o;
    public final long p;
    public final h0 q;
    public final s0 r;
    public final xa.c s;
    public final Object t;
    public final SparseArray u;
    public final c v;
    public final c w;
    public final android.support.v4.media.c x;
    public final r0 y;
    public com.google.android.exoplayer2.upstream.m z;

    static {
        h3.r0.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [m4.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [m4.c] */
    public g(f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, s0 s0Var, android.support.v4.media.c cVar, za.a aVar, l3.i iVar, v9.d dVar, long j10) {
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
        this.k = cVar;
        this.m = iVar;
        this.n = dVar;
        this.p = j10;
        this.l = aVar;
        this.o = new t(18);
        this.i = false;
        this.q = a(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new android.support.v4.media.c(this, 27);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new xa.c(this, 27);
        this.y = new zd.b(this);
        final int i9 = 0;
        this.v = new Runnable(this) { // from class: m4.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.b.v();
                        break;
                    default:
                        this.b.u(false);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.w = new Runnable(this) { // from class: m4.c
            public final /* synthetic */ g b;

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
    }

    public static boolean s(n4.h hVar) {
        List list = hVar.c;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int i10 = ((n4.a) list.get(i9)).b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // j4.a
    public final a0 b(d0 d0Var, r rVar, long j10) {
        int intValue = ((Integer) d0Var.a).intValue() - this.O;
        h0 h0Var = new h0(this.c.c, 0, d0Var, this.H.b(intValue).b);
        a6.a aVar = new a6.a((CopyOnWriteArrayList) this.d.d, 0, d0Var, 14);
        int i9 = this.O + intValue;
        n4.c cVar = this.H;
        y0 y0Var = this.B;
        long j11 = this.L;
        i3.l lVar = this.g;
        d5.a.j(lVar);
        b bVar = new b(i9, cVar, this.o, intValue, this.k, y0Var, this.m, aVar, this.n, h0Var, j11, this.y, rVar, this.l, this.x, lVar);
        this.u.put(i9, bVar);
        return bVar;
    }

    @Override // j4.a
    public final f1 h() {
        return this.h;
    }

    @Override // j4.a
    public final void j() {
        this.y.a();
    }

    @Override // j4.a
    public final void l(y0 y0Var) {
        this.B = y0Var;
        l3.i iVar = this.m;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        i3.l lVar = this.g;
        d5.a.j(lVar);
        iVar.H(myLooper, lVar);
        if (this.i) {
            u(false);
            return;
        }
        this.z = this.j.createDataSource();
        this.A = new q0("DashMediaSource");
        this.D = f0.k(null);
        v();
    }

    @Override // j4.a
    public final void n(a0 a0Var) {
        b bVar = (b) a0Var;
        o oVar = bVar.x;
        oVar.r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (l4.h hVar : bVar.D) {
            hVar.B(bVar);
        }
        bVar.C = null;
        this.u.remove(bVar.a);
    }

    @Override // j4.a
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
        t tVar = this.o;
        ((HashMap) tVar.b).clear();
        ((HashMap) tVar.c).clear();
        ((HashMap) tVar.d).clear();
        this.m.release();
    }

    public final void t() {
        boolean z10;
        q0 q0Var = this.A;
        d dVar = new d(this);
        synchronized (d5.a.i) {
            z10 = d5.a.j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (q0Var == null) {
            q0Var = new q0("SntpClient");
        }
        q0Var.f(new ya.b(4), new k5.i(dVar, 11), 1);
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
        n4.c cVar;
        long j13;
        long j14;
        long j15;
        h c10;
        long j16;
        long j17;
        float f10;
        float f11;
        boolean z12;
        h c11;
        boolean z13 = false;
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.u;
            if (i9 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i9);
            if (keyAt >= this.O) {
                b bVar = (b) sparseArray.valueAt(i9);
                n4.c cVar2 = this.H;
                int i10 = keyAt - this.O;
                bVar.G = cVar2;
                bVar.H = i10;
                o oVar = bVar.x;
                oVar.n = z13;
                oVar.f = cVar2;
                Iterator it = oVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < oVar.f.h) {
                        it.remove();
                    }
                }
                l4.h[] hVarArr = bVar.D;
                if (hVarArr != null) {
                    for (l4.h hVar : hVarArr) {
                        k kVar = hVar.e;
                        i[] iVarArr = kVar.h;
                        try {
                            kVar.j = cVar2;
                            kVar.k = i10;
                            long d = cVar2.d(i10);
                            ArrayList a2 = kVar.a();
                            for (int i11 = 0; i11 < iVarArr.length; i11++) {
                                try {
                                    iVarArr[i11] = iVarArr[i11].a(d, (n4.m) a2.get(kVar.i.j(i11)));
                                } catch (j4.b e10) {
                                    e = e10;
                                    kVar.l = e;
                                }
                            }
                        } catch (j4.b e11) {
                            e = e11;
                        }
                    }
                    bVar.C.c(bVar);
                }
                bVar.I = cVar2.b(i10).d;
                for (l lVar : bVar.E) {
                    Iterator it2 = bVar.I.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            n4.g gVar = (n4.g) it2.next();
                            if (gVar.a().equals(lVar.e.a())) {
                                lVar.b(gVar, cVar2.d && i10 == cVar2.m.size() + (-1));
                            }
                        }
                    }
                }
            }
            i9++;
            z13 = false;
        }
        n4.h b10 = this.H.b(0);
        int size = this.H.m.size() - 1;
        n4.h b11 = this.H.b(size);
        long d9 = this.H.d(size);
        long H = f0.H(f0.t(this.L));
        long d10 = this.H.d(0);
        long j18 = b10.b;
        List list = b10.c;
        long H2 = f0.H(j18);
        boolean s10 = s(b10);
        long j19 = H2;
        int i12 = 0;
        while (true) {
            long j20 = H2;
            if (i12 >= list.size()) {
                j10 = 0;
                j11 = j19;
                break;
            }
            n4.a aVar = (n4.a) list.get(i12);
            j10 = 0;
            List list2 = aVar.c;
            int i13 = aVar.b;
            boolean z14 = (i13 == 1 || i13 == 2) ? false : true;
            if ((!s10 || !z14) && !list2.isEmpty()) {
                h c12 = ((n4.m) list2.get(0)).c();
                if (c12 != null && c12.C(d10, H) != 0) {
                    j19 = Math.max(j19, c12.a(c12.i(d10, H)) + j20);
                }
            }
            i12++;
            H2 = j20;
        }
        long j21 = b11.b;
        List list3 = b11.c;
        long H3 = f0.H(j21);
        boolean s11 = s(b11);
        long j22 = Long.MAX_VALUE;
        int i14 = 0;
        while (true) {
            if (i14 >= list3.size()) {
                j12 = j22;
                break;
            }
            n4.a aVar2 = (n4.a) list3.get(i14);
            boolean z15 = s11;
            List list4 = aVar2.c;
            int i15 = aVar2.b;
            long j23 = H3;
            if (i15 != 1 && i15 != 2) {
                z12 = true;
                if ((z15 || !z12) && !list4.isEmpty()) {
                    c11 = ((n4.m) list4.get(0)).c();
                    if (c11 != null) {
                        j12 = j23 + d9;
                        break;
                    }
                    long C = c11.C(d9, H);
                    if (C == j10) {
                        j12 = j23;
                        break;
                    } else {
                        long i16 = (c11.i(d9, H) + C) - 1;
                        j22 = Math.min(j22, c11.f(i16, d9) + c11.a(i16) + j23);
                    }
                }
                i14++;
                s11 = z15;
                H3 = j23;
            }
            z12 = false;
            if (z15) {
            }
            c11 = ((n4.m) list4.get(0)).c();
            if (c11 != null) {
            }
        }
        if (this.H.d) {
            for (int i17 = 0; i17 < list3.size(); i17++) {
                h c13 = ((n4.m) ((n4.a) list3.get(i17)).c.get(0)).c();
                if (c13 != null && !c13.v()) {
                }
            }
            z11 = true;
            if (z11) {
                long j24 = this.H.f;
                if (j24 != -9223372036854775807L) {
                    j11 = Math.max(j11, j12 - f0.H(j24));
                }
            }
            long j25 = j12 - j11;
            cVar = this.H;
            if (cVar.d) {
                j13 = -9223372036854775807L;
                j14 = -9223372036854775807L;
                j15 = j10;
            } else {
                d5.a.i(cVar.a != -9223372036854775807L);
                long H4 = (H - f0.H(this.H.a)) - j11;
                long S = f0.S(H4);
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
                long S2 = f0.S(H4 - j25);
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
                    j29 = f0.i(j30, j29, S);
                } else {
                    a1 a1Var2 = this.H.j;
                    if (a1Var2 != null) {
                        long j31 = a1Var2.b;
                        if (j31 != -9223372036854775807L) {
                            j29 = f0.i(j31, j29, S);
                        }
                    }
                }
                long j32 = j29;
                long j33 = j32 > j16 ? j32 : j16;
                long j34 = this.E.a;
                if (j34 == -9223372036854775807L) {
                    n4.c cVar3 = this.H;
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
                    j34 = f0.i(f0.S(H4 - Math.min(5000000L, j25 / 2)), j32, j33);
                }
                long j36 = j34;
                float f12 = b1Var.d;
                if (f12 == -3.4028235E38f) {
                    a1 a1Var4 = this.H.j;
                    f12 = a1Var4 != null ? a1Var4.d : -3.4028235E38f;
                }
                float f13 = b1Var.e;
                if (f13 == -3.4028235E38f) {
                    a1 a1Var5 = this.H.j;
                    f13 = a1Var5 != null ? a1Var5.e : -3.4028235E38f;
                }
                if (f12 == -3.4028235E38f && f13 == -3.4028235E38f) {
                    a1 a1Var6 = this.H.j;
                    j17 = 2;
                    if (a1Var6 == null || a1Var6.a == -9223372036854775807L) {
                        f11 = 1.0f;
                        f10 = 1.0f;
                        this.E = new b1(j36, j32, j33, f11, f10);
                        long S3 = f0.S(j11) + this.H.a;
                        long H5 = H4 - f0.H(this.E.a);
                        long min = Math.min(5000000L, j25 / j17);
                        j15 = H5 >= min ? min : H5;
                        j14 = S3;
                    }
                } else {
                    j17 = 2;
                }
                f11 = f12;
                f10 = f13;
                this.E = new b1(j36, j32, j33, f11, f10);
                long S32 = f0.S(j11) + this.H.a;
                long H52 = H4 - f0.H(this.E.a);
                long min2 = Math.min(5000000L, j25 / j17);
                if (H52 >= min2) {
                }
                j14 = S32;
            }
            long H6 = j11 - f0.H(b10.b);
            n4.c cVar4 = this.H;
            m(new e(cVar4.a, j14, this.L, this.O, H6, j25, j15, cVar4, this.h, !cVar4.d ? this.E : null));
            if (this.i) {
                Handler handler = this.D;
                c cVar5 = this.w;
                handler.removeCallbacks(cVar5);
                if (z11) {
                    Handler handler2 = this.D;
                    n4.c cVar6 = this.H;
                    long t10 = f0.t(this.L);
                    int size2 = cVar6.m.size() - 1;
                    n4.h b12 = cVar6.b(size2);
                    long j37 = b12.b;
                    List list5 = b12.c;
                    long H7 = f0.H(j37);
                    long d11 = cVar6.d(size2);
                    long H8 = f0.H(t10);
                    long H9 = f0.H(cVar6.a);
                    long H10 = f0.H(5000L);
                    for (int i18 = 0; i18 < list5.size(); i18++) {
                        List list6 = ((n4.a) list5.get(i18)).c;
                        if (!list6.isEmpty() && (c10 = ((n4.m) list6.get(0)).c()) != null) {
                            long j38 = (c10.j(d11, H8) + (H9 + H7)) - H8;
                            if (j38 < H10 - 100000 || (j38 > H10 && j38 < H10 + 100000)) {
                                H10 = j38;
                            }
                        }
                    }
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    long j39 = H10 / 1000;
                    long j40 = H10 - (1000 * j39);
                    if (j40 != j10) {
                        int i19 = ((int) ((H10 ^ 1000) >> 63)) | 1;
                        switch (p8.c.a[roundingMode.ordinal()]) {
                            case 1:
                                if (j40 != j10) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                j39 += i19;
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                                long abs = Math.abs(j40);
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
                    handler2.postDelayed(cVar5, j39);
                }
                if (this.I) {
                    v();
                    return;
                }
                if (z10) {
                    n4.c cVar7 = this.H;
                    if (cVar7.d) {
                        long j41 = cVar7.e;
                        if (j41 != j13) {
                            this.D.postDelayed(this.v, Math.max(j10, (this.J + (j41 == j10 ? 5000L : j41)) - SystemClock.elapsedRealtime()));
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
        long H62 = j11 - f0.H(b10.b);
        n4.c cVar42 = this.H;
        m(new e(cVar42.a, j14, this.L, this.O, H62, j252, j15, cVar42, this.h, !cVar42.d ? this.E : null));
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
        xa.c cVar = this.s;
        this.n.getClass();
        this.A.f(t0Var, cVar, 3);
        this.q.k(new q(t0Var.b), t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
