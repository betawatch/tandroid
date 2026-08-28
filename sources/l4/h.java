package l4;

import android.net.Uri;
import android.os.SystemClock;
import c2.t;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.x0;
import d5.f0;
import g7.u;
import h3.t0;
import h3.u0;
import j$.util.DesugarCollections;
import j3.r0;
import j4.a1;
import j4.b1;
import j4.d1;
import j4.h0;
import j4.q;
import j4.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import m4.n;
import m4.o;
import n2.w;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements b1, d1, l0, o0 {
    public final g5.b A;
    public e B;
    public t0 C;
    public g D;
    public long E;
    public long F;
    public int G;
    public a H;
    public boolean I;
    public final int a;
    public final int[] b;
    public final t0[] c;
    public final boolean[] d;
    public final m4.k e;
    public final m4.b f;
    public final h0 h;
    public final v9.d n;
    public final q0 r = new q0("ChunkSampleStream");
    public final t s = new t(3);
    public final ArrayList v;
    public final List w;
    public final a1 x;
    public final a1[] y;

    public h(int i9, int[] iArr, t0[] t0VarArr, m4.k kVar, m4.b bVar, r rVar, long j10, l3.i iVar, a6.a aVar, v9.d dVar, h0 h0Var) {
        this.a = i9;
        this.b = iArr;
        this.c = t0VarArr;
        this.e = kVar;
        this.f = bVar;
        this.h = h0Var;
        this.n = dVar;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new a1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        a1[] a1VarArr = new a1[i10];
        iVar.getClass();
        a1 a1Var = new a1(rVar, iVar, aVar);
        this.x = a1Var;
        int i11 = 0;
        iArr2[0] = i9;
        a1VarArr[0] = a1Var;
        while (i11 < length) {
            a1 a1Var2 = new a1(rVar, null, null);
            this.y[i11] = a1Var2;
            int i12 = i11 + 1;
            a1VarArr[i12] = a1Var2;
            iArr2[i12] = this.b[i11];
            i11 = i12;
        }
        this.A = new g5.b(16, iArr2, a1VarArr);
        this.E = j10;
        this.F = j10;
    }

    public final int A(int i9, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i9);
        return i10 - 1;
    }

    public final void B(m4.b bVar) {
        this.D = bVar;
        a1 a1Var = this.x;
        a1Var.i();
        l3.e eVar = a1Var.h;
        if (eVar != null) {
            eVar.k(a1Var.e);
            a1Var.h = null;
            a1Var.g = null;
        }
        for (a1 a1Var2 : this.y) {
            a1Var2.i();
            l3.e eVar2 = a1Var2.h;
            if (eVar2 != null) {
                eVar2.k(a1Var2.e);
                a1Var2.h = null;
                a1Var2.g = null;
            }
        }
        this.r.e(this);
    }

    @Override // j4.b1
    public final void a() {
        q0 q0Var = this.r;
        q0Var.a();
        this.x.w();
        if (q0Var.d()) {
            return;
        }
        m4.k kVar = this.e;
        j4.b bVar = kVar.l;
        if (bVar != null) {
            throw bVar;
        }
        kVar.a.a();
    }

    @Override // j4.d1
    public final boolean b() {
        return this.r.d();
    }

    @Override // com.google.android.exoplayer2.upstream.o0
    public final void c() {
        a1 a1Var = this.x;
        a1Var.A(true);
        l3.e eVar = a1Var.h;
        if (eVar != null) {
            eVar.k(a1Var.e);
            a1Var.h = null;
            a1Var.g = null;
        }
        for (a1 a1Var2 : this.y) {
            a1Var2.A(true);
            l3.e eVar2 = a1Var2.h;
            if (eVar2 != null) {
                eVar2.k(a1Var2.e);
                a1Var2.h = null;
                a1Var2.g = null;
            }
        }
        for (m4.i iVar : this.e.h) {
            d dVar = iVar.a;
            if (dVar != null) {
                dVar.a.release();
            }
        }
        g gVar = this.D;
        if (gVar != null) {
            m4.b bVar = (m4.b) gVar;
            synchronized (bVar) {
                n nVar = (n) bVar.y.remove(this);
                if (nVar != null) {
                    a1 a1Var3 = nVar.a;
                    a1Var3.A(true);
                    l3.e eVar3 = a1Var3.h;
                    if (eVar3 != null) {
                        eVar3.k(a1Var3.e);
                        a1Var3.h = null;
                        a1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // j4.d1
    public final long d() {
        if (t()) {
            return this.E;
        }
        if (this.I) {
            return Long.MIN_VALUE;
        }
        return r().n;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void e(n0 n0Var, long j10, long j11, boolean z10) {
        e eVar = (e) n0Var;
        this.B = null;
        this.H = null;
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        q qVar = new q();
        this.n.getClass();
        this.h.d(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z10) {
            return;
        }
        if (t()) {
            this.x.A(false);
            for (a1 a1Var : this.y) {
                a1Var.A(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.v;
            p(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.E = this.F;
            }
        }
        this.f.c(this);
    }

    @Override // j4.b1
    public final boolean f() {
        return !t() && this.x.u(this.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0282  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 h(n0 n0Var, IOException iOException, int i9) {
        q qVar;
        boolean z10;
        ArrayList arrayList;
        v9.d dVar;
        boolean z11;
        long j10;
        boolean e10;
        k0 k0Var;
        boolean a2;
        e eVar = (e) n0Var;
        x0 x0Var = eVar.r;
        t0 t0Var = eVar.d;
        long j11 = eVar.h;
        long j12 = x0Var.b;
        boolean z12 = eVar instanceof a;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        boolean z13 = (j12 != 0 && z12 && s(size)) ? false : true;
        Uri uri = eVar.r.c;
        q qVar2 = new q();
        f0.S(j11);
        f0.S(eVar.n);
        w wVar = new w(iOException, i9, 1);
        m4.k kVar = this.e;
        m4.i[] iVarArr = kVar.h;
        com.google.firebase.messaging.t tVar = kVar.b;
        v9.d dVar2 = this.n;
        if (z13) {
            qVar = qVar2;
            n nVar = kVar.g;
            if (nVar != null) {
                long j13 = nVar.d;
                boolean z14 = j13 != -9223372036854775807L && j13 < j11;
                o oVar = nVar.e;
                if (oVar.f.d) {
                    if (!oVar.n) {
                        if (z14) {
                            if (oVar.h) {
                                oVar.n = true;
                                oVar.h = false;
                                m4.g gVar = (m4.g) oVar.b.b;
                                gVar.D.removeCallbacks(gVar.w);
                                gVar.v();
                            }
                        }
                    }
                    z10 = z13;
                    z11 = z12;
                    arrayList = arrayList2;
                    dVar = dVar2;
                    e10 = true;
                    if (e10) {
                        if (z10) {
                            if (z11) {
                                d5.a.i(p(size) == eVar);
                                if (arrayList.isEmpty()) {
                                    this.E = this.F;
                                }
                            }
                            k0Var = q0.e;
                            if (k0Var == null) {
                                dVar.getClass();
                                long m32 = v9.d.m3(wVar);
                                k0Var = m32 != -9223372036854775807L ? new k0(0, m32, false) : q0.f;
                            }
                            k0 k0Var2 = k0Var;
                            a2 = k0Var2.a();
                            this.h.h(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                                this.B = null;
                                dVar.getClass();
                                this.f.c(this);
                            }
                            return k0Var2;
                        }
                        d5.a.K("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    k0Var = null;
                    if (k0Var == null) {
                    }
                    k0 k0Var22 = k0Var;
                    a2 = k0Var22.a();
                    this.h.h(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                    if (!a2) {
                    }
                    return k0Var22;
                }
            }
            if (!kVar.j.d && (eVar instanceof k) && (iOException instanceof com.google.android.exoplayer2.upstream.h0) && ((com.google.android.exoplayer2.upstream.h0) iOException).d == 404) {
                m4.i iVar = iVarArr[kVar.i.a(t0Var)];
                z10 = z13;
                long z15 = iVar.d.z(iVar.e);
                if (z15 != -1 && z15 != 0) {
                    if (((k) eVar).b() > ((iVar.d.x() + iVar.f) + z15) - 1) {
                        kVar.m = true;
                        z11 = z12;
                        arrayList = arrayList2;
                        dVar = dVar2;
                        e10 = true;
                        if (e10) {
                        }
                        k0Var = null;
                        if (k0Var == null) {
                        }
                        k0 k0Var222 = k0Var;
                        a2 = k0Var222.a();
                        this.h.h(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                        if (!a2) {
                        }
                        return k0Var222;
                    }
                }
            } else {
                z10 = z13;
            }
            m4.i iVar2 = iVarArr[kVar.i.a(t0Var)];
            n4.m mVar = iVar2.b;
            n4.b bVar = iVar2.c;
            n4.b L = tVar.L(mVar.b);
            if (L == null || bVar.equals(L)) {
                b5.t tVar2 = kVar.i;
                z zVar = iVar2.b.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                int length = tVar2.length();
                dVar = dVar2;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (tVar2.f(i11, elapsedRealtime)) {
                        i10++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < zVar.size(); i12++) {
                    hashSet.add(Integer.valueOf(((n4.b) zVar.get(i12)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList j14 = tVar.j(zVar);
                z11 = z12;
                for (int i13 = 0; i13 < j14.size(); i13++) {
                    hashSet2.add(Integer.valueOf(((n4.b) j14.get(i13)).c));
                }
                j0 j0Var = new j0(size2, size2 - hashSet2.size(), length, i10);
                if (j0Var.a(2) || j0Var.a(1)) {
                    dVar.getClass();
                    k0 k32 = v9.d.k3(j0Var, wVar);
                    if (k32 != null) {
                        long j15 = k32.b;
                        int i14 = k32.a;
                        if (j0Var.a(i14)) {
                            if (i14 == 2) {
                                b5.t tVar3 = kVar.i;
                                e10 = tVar3.e(tVar3.a(t0Var), j15);
                                if (e10) {
                                }
                                k0Var = null;
                                if (k0Var == null) {
                                }
                                k0 k0Var2222 = k0Var;
                                a2 = k0Var2222.a();
                                this.h.h(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                                if (!a2) {
                                }
                                return k0Var2222;
                            }
                            if (i14 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j15;
                                String str = bVar.b;
                                HashMap hashMap = (HashMap) tVar.b;
                                if (hashMap.containsKey(str)) {
                                    Long l10 = (Long) hashMap.get(str);
                                    int i15 = f0.a;
                                    j10 = Math.max(elapsedRealtime2, l10.longValue());
                                } else {
                                    j10 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j10));
                                int i16 = bVar.c;
                                if (i16 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i16);
                                    HashMap hashMap2 = (HashMap) tVar.c;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l11 = (Long) hashMap2.get(valueOf);
                                        int i17 = f0.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l11.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                e10 = true;
                                if (e10) {
                                }
                                k0Var = null;
                                if (k0Var == null) {
                                }
                                k0 k0Var22222 = k0Var;
                                a2 = k0Var22222.a();
                                this.h.h(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                                if (!a2) {
                                }
                                return k0Var22222;
                            }
                            e10 = false;
                            if (e10) {
                            }
                            k0Var = null;
                            if (k0Var == null) {
                            }
                            k0 k0Var222222 = k0Var;
                            a2 = k0Var222222.a();
                            this.h.h(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                            }
                            return k0Var222222;
                        }
                    }
                }
            }
            z11 = z12;
            arrayList = arrayList2;
            dVar = dVar2;
            e10 = true;
            if (e10) {
            }
            k0Var = null;
            if (k0Var == null) {
            }
            k0 k0Var2222222 = k0Var;
            a2 = k0Var2222222.a();
            this.h.h(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
            if (!a2) {
            }
            return k0Var2222222;
        }
        qVar = qVar2;
        z10 = z13;
        z11 = z12;
        arrayList = arrayList2;
        dVar = dVar2;
        e10 = false;
        if (e10) {
        }
        k0Var = null;
        if (k0Var == null) {
        }
        k0 k0Var22222222 = k0Var;
        a2 = k0Var22222222.a();
        this.h.h(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
        if (!a2) {
        }
        return k0Var22222222;
    }

    @Override // j4.b1
    public final int j(long j10) {
        if (t()) {
            return 0;
        }
        boolean z10 = this.I;
        a1 a1Var = this.x;
        int s10 = a1Var.s(j10, z10);
        a aVar = this.H;
        if (aVar != null) {
            s10 = Math.min(s10, aVar.d(0) - a1Var.q());
        }
        a1Var.E(s10);
        y();
        return s10;
    }

    @Override // j4.b1
    public final int l(u0 u0Var, k3.i iVar, int i9) {
        if (t()) {
            return -3;
        }
        a aVar = this.H;
        a1 a1Var = this.x;
        if (aVar != null && aVar.d(0) <= a1Var.q()) {
            return -3;
        }
        y();
        return a1Var.z(u0Var, iVar, i9, this.I);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void m(n0 n0Var, long j10, long j11) {
        e eVar = (e) n0Var;
        this.B = null;
        boolean z10 = eVar instanceof j;
        m4.k kVar = this.e;
        if (z10) {
            int a2 = kVar.i.a(((j) eVar).d);
            m4.i[] iVarArr = kVar.h;
            m4.i iVar = iVarArr[a2];
            if (iVar.d == null) {
                d dVar = iVar.a;
                m3.t tVar = dVar.n;
                m3.f fVar = tVar instanceof m3.f ? (m3.f) tVar : null;
                if (fVar != null) {
                    n4.m mVar = iVar.b;
                    iVarArr[a2] = new m4.i(iVar.e, mVar, iVar.c, dVar, iVar.f, new f2.d(fVar, mVar.c, 6));
                }
            }
        }
        n nVar = kVar.g;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || eVar.n > j12) {
                nVar.d = eVar.n;
            }
            nVar.e.h = true;
        }
        long j13 = eVar.a;
        Uri uri = eVar.r.c;
        q qVar = new q();
        this.n.getClass();
        this.h.f(qVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        this.f.c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (r9 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x039b  */
    @Override // j4.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(long j10) {
        long j11;
        List list;
        t tVar;
        long j12;
        List list2;
        List list3;
        k kVar;
        boolean z10;
        long j13;
        long max;
        q0 q0Var;
        t tVar2;
        List list4;
        Object iVar;
        n4.j jVar;
        boolean z11;
        boolean z12;
        if (this.I) {
            return false;
        }
        q0 q0Var2 = this.r;
        if (q0Var2.d() || q0Var2.c()) {
            return false;
        }
        boolean t10 = t();
        if (t10) {
            list = Collections.EMPTY_LIST;
            j11 = this.E;
        } else {
            j11 = r().n;
            list = this.w;
        }
        List list5 = list;
        m4.k kVar2 = this.e;
        m4.i[] iVarArr = kVar2.h;
        j4.b bVar = kVar2.l;
        t tVar3 = this.s;
        if (bVar != null) {
            tVar = tVar3;
            j12 = -9223372036854775807L;
        } else {
            long j14 = j11 - j10;
            tVar = tVar3;
            j12 = -9223372036854775807L;
            long H = f0.H(kVar2.j.b(kVar2.k).b) + f0.H(kVar2.j.a) + j11;
            n nVar = kVar2.g;
            if (nVar != null) {
                o oVar = nVar.e;
                n4.c cVar = oVar.f;
                android.support.v4.media.c cVar2 = oVar.b;
                if (!cVar.d) {
                    list2 = list5;
                    z11 = false;
                } else if (oVar.n) {
                    list2 = list5;
                    z11 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = oVar.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= H) {
                        z11 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        m4.g gVar = (m4.g) cVar2.b;
                        long j15 = gVar.N;
                        if (j15 == -9223372036854775807L || j15 < longValue) {
                            gVar.N = longValue;
                        }
                        z11 = true;
                    }
                    if (z11 && oVar.h) {
                        oVar.n = true;
                        oVar.h = false;
                        m4.g gVar2 = (m4.g) cVar2.b;
                        gVar2.D.removeCallbacks(gVar2.w);
                        gVar2.v();
                    }
                }
            } else {
                list2 = list5;
            }
            long H2 = f0.H(f0.t(kVar2.f));
            n4.c cVar3 = kVar2.j;
            long j16 = cVar3.a;
            long H3 = j16 == -9223372036854775807L ? -9223372036854775807L : H2 - f0.H(j16 + cVar3.b(kVar2.k).b);
            if (list2.isEmpty()) {
                list3 = list2;
                kVar = null;
            } else {
                list3 = list2;
                kVar = (k) r0.k(1, list3);
            }
            int length = kVar2.i.length();
            long j17 = j14;
            l[] lVarArr = new l[length];
            int i9 = 0;
            while (i9 < length) {
                k kVar3 = kVar;
                m4.i iVar2 = iVarArr[i9];
                boolean z13 = t10;
                m4.h hVar = iVar2.d;
                int i10 = length;
                long j18 = j17;
                long j19 = iVar2.f;
                long j20 = iVar2.e;
                ya.b bVar2 = l.q;
                if (hVar == null) {
                    lVarArr[i9] = bVar2;
                } else {
                    long i11 = hVar.i(j20, H2) + j19;
                    long b10 = iVar2.b(H2);
                    long b11 = kVar3 != null ? kVar3.b() : f0.i(iVar2.d.q(j11, j20) + j19, i11, b10);
                    if (b11 < i11) {
                        lVarArr[i9] = bVar2;
                    } else {
                        lVarArr[i9] = new m4.j(kVar2.b(i9), b11, b10);
                    }
                }
                i9++;
                kVar = kVar3;
                t10 = z13;
                length = i10;
                j17 = j18;
            }
            k kVar4 = kVar;
            z10 = t10;
            long j21 = j17;
            if (kVar2.j.d) {
                long c10 = iVarArr[0].c(iVarArr[0].b(H2));
                n4.c cVar4 = kVar2.j;
                long j22 = cVar4.a;
                j13 = 0;
                max = Math.max(0L, Math.min(j22 == -9223372036854775807L ? -9223372036854775807L : H2 - f0.H(j22 + cVar4.b(kVar2.k).b), c10) - j10);
            } else {
                max = -9223372036854775807L;
                j13 = 0;
            }
            q0Var = q0Var2;
            tVar2 = tVar;
            long j23 = j13;
            kVar2.i.m(j10, j21, max, list3, lVarArr);
            m4.i b12 = kVar2.b(kVar2.i.d());
            long j24 = b12.f;
            long j25 = b12.e;
            m4.h hVar2 = b12.d;
            n4.b bVar3 = b12.c;
            d dVar = b12.a;
            n4.m mVar = b12.b;
            if (dVar != null) {
                n4.j jVar2 = dVar.r == null ? mVar.h : null;
                if (hVar2 == null) {
                    list4 = list3;
                    jVar = mVar.d();
                } else {
                    list4 = list3;
                    jVar = null;
                }
                if (jVar2 != null || jVar != null) {
                    com.google.android.exoplayer2.upstream.m mVar2 = kVar2.e;
                    t0 o6 = kVar2.i.o();
                    int p6 = kVar2.i.p();
                    Object r10 = kVar2.i.r();
                    if (jVar2 != null) {
                        n4.j a2 = jVar2.a(jVar, bVar3.a);
                        if (a2 != null) {
                            jVar2 = a2;
                        }
                    } else {
                        jVar2 = jVar;
                    }
                    tVar2.c = new j(mVar2, u.a(mVar, bVar3.a, jVar2, 0), o6, p6, r10, b12.a);
                    z12 = tVar2.b;
                    e eVar = (e) tVar2.c;
                    tVar2.c = null;
                    tVar2.b = false;
                    if (z12) {
                        this.E = j12;
                        this.I = true;
                        return true;
                    }
                    if (eVar == null) {
                        return false;
                    }
                    this.B = eVar;
                    boolean z14 = eVar instanceof a;
                    g5.b bVar4 = this.A;
                    if (z14) {
                        a aVar = (a) eVar;
                        if (z10) {
                            long j26 = aVar.h;
                            long j27 = this.E;
                            if (j26 != j27) {
                                this.x.t = j27;
                                for (a1 a1Var : this.y) {
                                    a1Var.t = this.E;
                                }
                            }
                            this.E = -9223372036854775807L;
                        }
                        aVar.x = bVar4;
                        a1[] a1VarArr = (a1[]) bVar4.c;
                        int[] iArr = new int[a1VarArr.length];
                        for (int i12 = 0; i12 < a1VarArr.length; i12++) {
                            a1 a1Var2 = a1VarArr[i12];
                            iArr[i12] = a1Var2.q + a1Var2.p;
                        }
                        aVar.y = iArr;
                        this.v.add(aVar);
                    } else if (eVar instanceof j) {
                        ((j) eVar).v = bVar4;
                    }
                    q0Var.f(eVar, this, this.n.l3(eVar.c));
                    this.h.k(new q(eVar.b), eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
                    return true;
                }
            } else {
                list4 = list3;
            }
            boolean z15 = j25 != -9223372036854775807L;
            if (hVar2.z(j25) == j23) {
                tVar2.b = z15;
            } else {
                long i13 = hVar2.i(j25, H2) + j24;
                long b13 = b12.b(H2);
                long b14 = kVar4 != null ? kVar4.b() : f0.i(hVar2.q(j11, j25) + j24, i13, b13);
                if (b14 < i13) {
                    kVar2.l = new j4.b();
                } else {
                    if (b14 <= b13) {
                        long j28 = j11;
                        if (!kVar2.m || b14 < b13) {
                            if (!z15 || b12.d(b14) < j25) {
                                int min = (int) Math.min(1, (b13 - b14) + 1);
                                if (j25 != -9223372036854775807L) {
                                    while (min > 1 && b12.d((min + b14) - 1) >= j25) {
                                        min--;
                                    }
                                }
                                long j29 = list4.isEmpty() ? j28 : -9223372036854775807L;
                                com.google.android.exoplayer2.upstream.m mVar3 = kVar2.e;
                                int i14 = kVar2.d;
                                t0 o9 = kVar2.i.o();
                                int p9 = kVar2.i.p();
                                Object r11 = kVar2.i.r();
                                long d = b12.d(b14);
                                n4.j l10 = hVar2.l(b14 - j24);
                                if (dVar == null) {
                                    iVar = new m(mVar3, u.a(mVar, bVar3.a, l10, hVar2.v() || (H3 > (-9223372036854775807L) ? 1 : (H3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b12.c(b14) > H3 ? 1 : (b12.c(b14) == H3 ? 0 : -1)) <= 0 ? 0 : 8), o9, p9, r11, d, b12.c(b14), b14, i14, o9);
                                } else {
                                    long j30 = b14;
                                    int i15 = 1;
                                    int i16 = 1;
                                    while (i15 < min) {
                                        n4.j a3 = l10.a(hVar2.l((j30 + i15) - j24), bVar3.a);
                                        if (a3 == null) {
                                            break;
                                        }
                                        i16++;
                                        i15++;
                                        l10 = a3;
                                    }
                                    long j31 = (j30 + i16) - 1;
                                    long c11 = b12.c(j31);
                                    iVar = new i(mVar3, u.a(mVar, bVar3.a, l10, hVar2.v() || (H3 > (-9223372036854775807L) ? 1 : (H3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b12.c(j31) > H3 ? 1 : (b12.c(j31) == H3 ? 0 : -1)) <= 0 ? 0 : 8), o9, p9, r11, d, c11, j29, (j25 == -9223372036854775807L || j25 > c11) ? -9223372036854775807L : j25, j30, i16, -mVar.c, b12.a);
                                }
                                tVar2.c = iVar;
                            } else {
                                tVar2.b = true;
                            }
                        }
                    }
                    tVar2.b = z15;
                }
            }
            z12 = tVar2.b;
            e eVar2 = (e) tVar2.c;
            tVar2.c = null;
            tVar2.b = false;
            if (z12) {
            }
        }
        t tVar4 = tVar;
        q0Var = q0Var2;
        tVar2 = tVar4;
        z10 = t10;
        z12 = tVar2.b;
        e eVar22 = (e) tVar2.c;
        tVar2.c = null;
        tVar2.b = false;
        if (z12) {
        }
    }

    public final a p(int i9) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i9);
        f0.N(i9, arrayList.size(), arrayList);
        this.G = Math.max(this.G, arrayList.size());
        int i10 = 0;
        this.x.k(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.y;
            if (i10 >= a1VarArr.length) {
                return aVar;
            }
            a1 a1Var = a1VarArr[i10];
            i10++;
            a1Var.k(aVar.d(i10));
        }
    }

    public final a r() {
        return (a) r0.j(1, this.v);
    }

    public final boolean s(int i9) {
        int q10;
        a aVar = (a) this.v.get(i9);
        if (this.x.q() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            a1[] a1VarArr = this.y;
            if (i10 >= a1VarArr.length) {
                return false;
            }
            q10 = a1VarArr[i10].q();
            i10++;
        } while (q10 <= aVar.d(i10));
        return true;
    }

    public final boolean t() {
        return this.E != -9223372036854775807L;
    }

    @Override // j4.d1
    public final long v() {
        if (this.I) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.E;
        }
        long j10 = this.F;
        a r10 = r();
        if (!r10.c()) {
            ArrayList arrayList = this.v;
            r10 = arrayList.size() > 1 ? (a) r0.j(2, arrayList) : null;
        }
        if (r10 != null) {
            j10 = Math.max(j10, r10.n);
        }
        return Math.max(j10, this.x.n());
    }

    public final void y() {
        int A = A(this.x.q(), this.G - 1);
        while (true) {
            int i9 = this.G;
            if (i9 > A) {
                return;
            }
            this.G = i9 + 1;
            a aVar = (a) this.v.get(i9);
            t0 t0Var = aVar.d;
            if (!t0Var.equals(this.C)) {
                this.h.b(this.a, t0Var, aVar.e, aVar.f, aVar.h);
            }
            this.C = t0Var;
        }
    }

    @Override // j4.d1
    public final void z(long j10) {
        q0 q0Var = this.r;
        if (q0Var.c() || t()) {
            return;
        }
        boolean d = q0Var.d();
        List list = this.w;
        m4.k kVar = this.e;
        ArrayList arrayList = this.v;
        if (d) {
            e eVar = this.B;
            eVar.getClass();
            boolean z10 = eVar instanceof a;
            if (z10 && s(arrayList.size() - 1)) {
                return;
            }
            if (kVar.l == null ? kVar.i.c(j10, eVar, list) : false) {
                q0Var.b();
                if (z10) {
                    this.H = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (kVar.l != null || kVar.i.length() < 2) ? list.size() : kVar.i.k(j10, list);
        if (size < arrayList.size()) {
            d5.a.i(!q0Var.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!s(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j11 = r().n;
            a p6 = p(size);
            if (arrayList.isEmpty()) {
                this.E = this.F;
            }
            this.I = false;
            long j12 = p6.h;
            h0 h0Var = this.h;
            h0Var.m(new y(1, this.a, null, 3, null, h0Var.a(j12), h0Var.a(j11)));
        }
    }
}
