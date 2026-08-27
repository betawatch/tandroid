package l4;

import android.net.Uri;
import android.os.SystemClock;
import b5.s;
import c2.t;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.x0;
import h3.t0;
import h3.u0;
import h7.u;
import j$.util.DesugarCollections;
import j4.a1;
import j4.b1;
import j4.d1;
import j4.g0;
import j4.p;
import j4.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import m4.n;
import m4.o;
import n2.v;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final g0 h;
    public final ab.a n;
    public final q0 r = new q0("ChunkSampleStream");
    public final t s = new t(3);
    public final ArrayList v;
    public final List w;
    public final a1 x;
    public final a1[] y;

    public h(int i10, int[] iArr, t0[] t0VarArr, m4.k kVar, m4.b bVar, r rVar, long j10, l3.j jVar, b6.a aVar, ab.a aVar2, g0 g0Var) {
        this.a = i10;
        this.b = iArr;
        this.c = t0VarArr;
        this.e = kVar;
        this.f = bVar;
        this.h = g0Var;
        this.n = aVar2;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new a1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        jVar.getClass();
        a1 a1Var = new a1(rVar, jVar, aVar);
        this.x = a1Var;
        int i12 = 0;
        iArr2[0] = i10;
        a1VarArr[0] = a1Var;
        while (i12 < length) {
            a1 a1Var2 = new a1(rVar, null, null);
            this.y[i12] = a1Var2;
            int i13 = i12 + 1;
            a1VarArr[i13] = a1Var2;
            iArr2[i13] = this.b[i12];
            i12 = i13;
        }
        this.A = new g5.b(14, iArr2, a1VarArr);
        this.E = j10;
        this.F = j10;
    }

    @Override // j4.d1
    public final long D() {
        if (this.I) {
            return Long.MIN_VALUE;
        }
        if (r()) {
            return this.E;
        }
        long j10 = this.F;
        a k10 = k();
        if (!k10.c()) {
            ArrayList arrayList = this.v;
            k10 = arrayList.size() > 1 ? (a) i0.a.i(2, arrayList) : null;
        }
        if (k10 != null) {
            j10 = Math.max(j10, k10.n);
        }
        return Math.max(j10, this.x.n());
    }

    @Override // j4.d1
    public final void I(long j10) {
        q0 q0Var = this.r;
        if (q0Var.c() || r()) {
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
            if (z10 && n(arrayList.size() - 1)) {
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
                } else if (!n(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j11 = k().n;
            a j12 = j(size);
            if (arrayList.isEmpty()) {
                this.E = this.F;
            }
            this.I = false;
            long j13 = j12.h;
            g0 g0Var = this.h;
            g0Var.m(new x(1, this.a, null, 3, null, g0Var.a(j13), g0Var.a(j11)));
        }
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
        l3.f fVar = a1Var.h;
        if (fVar != null) {
            fVar.h(a1Var.e);
            a1Var.h = null;
            a1Var.g = null;
        }
        for (a1 a1Var2 : this.y) {
            a1Var2.A(true);
            l3.f fVar2 = a1Var2.h;
            if (fVar2 != null) {
                fVar2.h(a1Var2.e);
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
                    l3.f fVar3 = a1Var3.h;
                    if (fVar3 != null) {
                        fVar3.h(a1Var3.e);
                        a1Var3.h = null;
                        a1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void d(n0 n0Var, long j10, long j11, boolean z10) {
        e eVar = (e) n0Var;
        this.B = null;
        this.H = null;
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        p pVar = new p();
        this.n.getClass();
        this.h.d(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z10) {
            return;
        }
        if (r()) {
            this.x.A(false);
            for (a1 a1Var : this.y) {
                a1Var.A(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.v;
            j(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.E = this.F;
            }
        }
        this.f.a(this);
    }

    @Override // j4.b1
    public final boolean e() {
        return !r() && this.x.u(this.I);
    }

    @Override // j4.b1
    public final int f(long j10) {
        if (r()) {
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
        s();
        return s10;
    }

    @Override // j4.d1
    public final long g() {
        if (r()) {
            return this.E;
        }
        if (this.I) {
            return Long.MIN_VALUE;
        }
        return k().n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0282  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 h(n0 n0Var, IOException iOException, int i10) {
        p pVar;
        boolean z10;
        ArrayList arrayList;
        ab.a aVar;
        boolean z11;
        long j10;
        boolean e9;
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
        boolean z13 = (j12 != 0 && z12 && n(size)) ? false : true;
        Uri uri = eVar.r.c;
        p pVar2 = new p();
        d5.g0.S(j11);
        d5.g0.S(eVar.n);
        v vVar = new v(iOException, i10, 1);
        m4.k kVar = this.e;
        m4.i[] iVarArr = kVar.h;
        com.google.firebase.messaging.t tVar = kVar.b;
        ab.a aVar2 = this.n;
        if (z13) {
            pVar = pVar2;
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
                    aVar = aVar2;
                    e9 = true;
                    if (e9) {
                        if (z10) {
                            if (z11) {
                                d5.a.i(j(size) == eVar);
                                if (arrayList.isEmpty()) {
                                    this.E = this.F;
                                }
                            }
                            k0Var = q0.e;
                            if (k0Var == null) {
                                aVar.getClass();
                                long A3 = ab.a.A3(vVar);
                                k0Var = A3 != -9223372036854775807L ? new k0(0, A3, false) : q0.f;
                            }
                            k0 k0Var2 = k0Var;
                            a2 = k0Var2.a();
                            this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                                this.B = null;
                                aVar.getClass();
                                this.f.a(this);
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
                    this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                    if (!a2) {
                    }
                    return k0Var22;
                }
            }
            if (!kVar.j.d && (eVar instanceof k) && (iOException instanceof h0) && ((h0) iOException).d == 404) {
                m4.i iVar = iVarArr[kVar.i.a(t0Var)];
                z10 = z13;
                long F = iVar.d.F(iVar.e);
                if (F != -1 && F != 0) {
                    if (((k) eVar).b() > ((iVar.d.E() + iVar.f) + F) - 1) {
                        kVar.m = true;
                        z11 = z12;
                        arrayList = arrayList2;
                        aVar = aVar2;
                        e9 = true;
                        if (e9) {
                        }
                        k0Var = null;
                        if (k0Var == null) {
                        }
                        k0 k0Var222 = k0Var;
                        a2 = k0Var222.a();
                        this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
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
                s sVar = kVar.i;
                z zVar = iVar2.b.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                int length = sVar.length();
                aVar = aVar2;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sVar.f(i12, elapsedRealtime)) {
                        i11++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i13 = 0; i13 < zVar.size(); i13++) {
                    hashSet.add(Integer.valueOf(((n4.b) zVar.get(i13)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList j14 = tVar.j(zVar);
                z11 = z12;
                for (int i14 = 0; i14 < j14.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((n4.b) j14.get(i14)).c));
                }
                j0 j0Var = new j0(size2, size2 - hashSet2.size(), length, i11);
                if (j0Var.a(2) || j0Var.a(1)) {
                    aVar.getClass();
                    k0 x32 = ab.a.x3(j0Var, vVar);
                    if (x32 != null) {
                        long j15 = x32.b;
                        int i15 = x32.a;
                        if (j0Var.a(i15)) {
                            if (i15 == 2) {
                                s sVar2 = kVar.i;
                                e9 = sVar2.e(sVar2.a(t0Var), j15);
                                if (e9) {
                                }
                                k0Var = null;
                                if (k0Var == null) {
                                }
                                k0 k0Var2222 = k0Var;
                                a2 = k0Var2222.a();
                                this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                                if (!a2) {
                                }
                                return k0Var2222;
                            }
                            if (i15 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j15;
                                String str = bVar.b;
                                HashMap hashMap = (HashMap) tVar.b;
                                if (hashMap.containsKey(str)) {
                                    Long l10 = (Long) hashMap.get(str);
                                    int i16 = d5.g0.a;
                                    j10 = Math.max(elapsedRealtime2, l10.longValue());
                                } else {
                                    j10 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j10));
                                int i17 = bVar.c;
                                if (i17 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i17);
                                    HashMap hashMap2 = (HashMap) tVar.c;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l11 = (Long) hashMap2.get(valueOf);
                                        int i18 = d5.g0.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l11.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                e9 = true;
                                if (e9) {
                                }
                                k0Var = null;
                                if (k0Var == null) {
                                }
                                k0 k0Var22222 = k0Var;
                                a2 = k0Var22222.a();
                                this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                                if (!a2) {
                                }
                                return k0Var22222;
                            }
                            e9 = false;
                            if (e9) {
                            }
                            k0Var = null;
                            if (k0Var == null) {
                            }
                            k0 k0Var222222 = k0Var;
                            a2 = k0Var222222.a();
                            this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                            }
                            return k0Var222222;
                        }
                    }
                }
            }
            z11 = z12;
            arrayList = arrayList2;
            aVar = aVar2;
            e9 = true;
            if (e9) {
            }
            k0Var = null;
            if (k0Var == null) {
            }
            k0 k0Var2222222 = k0Var;
            a2 = k0Var2222222.a();
            this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
            if (!a2) {
            }
            return k0Var2222222;
        }
        pVar = pVar2;
        z10 = z13;
        z11 = z12;
        arrayList = arrayList2;
        aVar = aVar2;
        e9 = false;
        if (e9) {
        }
        k0Var = null;
        if (k0Var == null) {
        }
        k0 k0Var22222222 = k0Var;
        a2 = k0Var22222222.a();
        this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
        if (!a2) {
        }
        return k0Var22222222;
    }

    @Override // j4.b1
    public final int i(u0 u0Var, k3.i iVar, int i10) {
        if (r()) {
            return -3;
        }
        a aVar = this.H;
        a1 a1Var = this.x;
        if (aVar != null && aVar.d(0) <= a1Var.q()) {
            return -3;
        }
        s();
        return a1Var.z(u0Var, iVar, i10, this.I);
    }

    public final a j(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d5.g0.N(i10, arrayList.size(), arrayList);
        this.G = Math.max(this.G, arrayList.size());
        int i11 = 0;
        this.x.k(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.y;
            if (i11 >= a1VarArr.length) {
                return aVar;
            }
            a1 a1Var = a1VarArr[i11];
            i11++;
            a1Var.k(aVar.d(i11));
        }
    }

    public final a k() {
        return (a) i0.a.i(1, this.v);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void l(n0 n0Var, long j10, long j11) {
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
                    iVarArr[a2] = new m4.i(iVar.e, mVar, iVar.c, dVar, iVar.f, new f2.c(fVar, mVar.c, 6));
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
        p pVar = new p();
        this.n.getClass();
        this.h.f(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        this.f.a(this);
    }

    public final boolean n(int i10) {
        int q6;
        a aVar = (a) this.v.get(i10);
        if (this.x.q() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a1[] a1VarArr = this.y;
            if (i11 >= a1VarArr.length) {
                return false;
            }
            q6 = a1VarArr[i11].q();
            i11++;
        } while (q6 <= aVar.d(i11));
        return true;
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
    public final boolean q(long j10) {
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
        boolean r10 = r();
        if (r10) {
            list = Collections.EMPTY_LIST;
            j11 = this.E;
        } else {
            j11 = k().n;
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
            long H = d5.g0.H(kVar2.j.b(kVar2.k).b) + d5.g0.H(kVar2.j.a) + j11;
            n nVar = kVar2.g;
            if (nVar != null) {
                o oVar = nVar.e;
                n4.c cVar = oVar.f;
                k5.i iVar2 = oVar.b;
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
                        m4.g gVar = (m4.g) iVar2.b;
                        long j15 = gVar.N;
                        if (j15 == -9223372036854775807L || j15 < longValue) {
                            gVar.N = longValue;
                        }
                        z11 = true;
                    }
                    if (z11 && oVar.h) {
                        oVar.n = true;
                        oVar.h = false;
                        m4.g gVar2 = (m4.g) iVar2.b;
                        gVar2.D.removeCallbacks(gVar2.w);
                        gVar2.v();
                    }
                }
            } else {
                list2 = list5;
            }
            long H2 = d5.g0.H(d5.g0.t(kVar2.f));
            n4.c cVar2 = kVar2.j;
            long j16 = cVar2.a;
            long H3 = j16 == -9223372036854775807L ? -9223372036854775807L : H2 - d5.g0.H(j16 + cVar2.b(kVar2.k).b);
            if (list2.isEmpty()) {
                list3 = list2;
                kVar = null;
            } else {
                list3 = list2;
                kVar = (k) i0.a.j(1, list3);
            }
            int length = kVar2.i.length();
            long j17 = j14;
            l[] lVarArr = new l[length];
            int i10 = 0;
            while (i10 < length) {
                k kVar3 = kVar;
                m4.i iVar3 = iVarArr[i10];
                boolean z13 = r10;
                m4.h hVar = iVar3.d;
                int i11 = length;
                long j18 = j17;
                long j19 = iVar3.f;
                long j20 = iVar3.e;
                za.b bVar2 = l.o;
                if (hVar == null) {
                    lVarArr[i10] = bVar2;
                } else {
                    long r11 = hVar.r(j20, H2) + j19;
                    long b10 = iVar3.b(H2);
                    long b11 = kVar3 != null ? kVar3.b() : d5.g0.i(iVar3.d.y(j11, j20) + j19, r11, b10);
                    if (b11 < r11) {
                        lVarArr[i10] = bVar2;
                    } else {
                        lVarArr[i10] = new m4.j(kVar2.b(i10), b11, b10);
                    }
                }
                i10++;
                kVar = kVar3;
                r10 = z13;
                length = i11;
                j17 = j18;
            }
            k kVar4 = kVar;
            z10 = r10;
            long j21 = j17;
            if (kVar2.j.d) {
                long c10 = iVarArr[0].c(iVarArr[0].b(H2));
                n4.c cVar3 = kVar2.j;
                long j22 = cVar3.a;
                j13 = 0;
                max = Math.max(0L, Math.min(j22 == -9223372036854775807L ? -9223372036854775807L : H2 - d5.g0.H(j22 + cVar3.b(kVar2.k).b), c10) - j10);
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
                    t0 o10 = kVar2.i.o();
                    int p6 = kVar2.i.p();
                    Object r12 = kVar2.i.r();
                    if (jVar2 != null) {
                        n4.j a2 = jVar2.a(jVar, bVar3.a);
                        if (a2 != null) {
                            jVar2 = a2;
                        }
                    } else {
                        jVar2 = jVar;
                    }
                    tVar2.c = new j(mVar2, u.a(mVar, bVar3.a, jVar2, 0), o10, p6, r12, b12.a);
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
                    q0Var.f(eVar, this, this.n.z3(eVar.c));
                    this.h.k(new p(eVar.b), eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
                    return true;
                }
            } else {
                list4 = list3;
            }
            boolean z15 = j25 != -9223372036854775807L;
            if (hVar2.F(j25) == j23) {
                tVar2.b = z15;
            } else {
                long r13 = hVar2.r(j25, H2) + j24;
                long b13 = b12.b(H2);
                long b14 = kVar4 != null ? kVar4.b() : d5.g0.i(hVar2.y(j11, j25) + j24, r13, b13);
                if (b14 < r13) {
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
                                int i13 = kVar2.d;
                                t0 o11 = kVar2.i.o();
                                int p9 = kVar2.i.p();
                                Object r14 = kVar2.i.r();
                                long d = b12.d(b14);
                                n4.j w10 = hVar2.w(b14 - j24);
                                if (dVar == null) {
                                    iVar = new m(mVar3, u.a(mVar, bVar3.a, w10, hVar2.B() || (H3 > (-9223372036854775807L) ? 1 : (H3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b12.c(b14) > H3 ? 1 : (b12.c(b14) == H3 ? 0 : -1)) <= 0 ? 0 : 8), o11, p9, r14, d, b12.c(b14), b14, i13, o11);
                                } else {
                                    long j30 = b14;
                                    int i14 = 1;
                                    int i15 = 1;
                                    while (i14 < min) {
                                        n4.j a3 = w10.a(hVar2.w((j30 + i14) - j24), bVar3.a);
                                        if (a3 == null) {
                                            break;
                                        }
                                        i15++;
                                        i14++;
                                        w10 = a3;
                                    }
                                    long j31 = (j30 + i15) - 1;
                                    long c11 = b12.c(j31);
                                    iVar = new i(mVar3, u.a(mVar, bVar3.a, w10, hVar2.B() || (H3 > (-9223372036854775807L) ? 1 : (H3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b12.c(j31) > H3 ? 1 : (b12.c(j31) == H3 ? 0 : -1)) <= 0 ? 0 : 8), o11, p9, r14, d, c11, j29, (j25 == -9223372036854775807L || j25 > c11) ? -9223372036854775807L : j25, j30, i15, -mVar.c, b12.a);
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
        z10 = r10;
        z12 = tVar2.b;
        e eVar22 = (e) tVar2.c;
        tVar2.c = null;
        tVar2.b = false;
        if (z12) {
        }
    }

    public final boolean r() {
        return this.E != -9223372036854775807L;
    }

    public final void s() {
        int t10 = t(this.x.q(), this.G - 1);
        while (true) {
            int i10 = this.G;
            if (i10 > t10) {
                return;
            }
            this.G = i10 + 1;
            a aVar = (a) this.v.get(i10);
            t0 t0Var = aVar.d;
            if (!t0Var.equals(this.C)) {
                this.h.b(this.a, t0Var, aVar.e, aVar.f, aVar.h);
            }
            this.C = t0Var;
        }
    }

    public final int t(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).d(0) <= i10);
        return i11 - 1;
    }

    public final void u(m4.b bVar) {
        this.D = bVar;
        a1 a1Var = this.x;
        a1Var.i();
        l3.f fVar = a1Var.h;
        if (fVar != null) {
            fVar.h(a1Var.e);
            a1Var.h = null;
            a1Var.g = null;
        }
        for (a1 a1Var2 : this.y) {
            a1Var2.i();
            l3.f fVar2 = a1Var2.h;
            if (fVar2 != null) {
                fVar2.h(a1Var2.e);
                a1Var2.h = null;
                a1Var2.g = null;
            }
        }
        this.r.e(this);
    }
}
