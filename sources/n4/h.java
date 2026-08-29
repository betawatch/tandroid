package n4;

import ag.j2;
import android.net.Uri;
import android.os.SystemClock;
import c2.u;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.x0;
import com.google.firebase.messaging.s;
import f5.d0;
import f7.v;
import i7.x5;
import j$.util.DesugarCollections;
import j3.t0;
import j3.u0;
import j7.l1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l4.b1;
import l4.c1;
import l4.e1;
import l4.g0;
import l4.p;
import l4.x;
import nh.d6;
import o3.t;
import o4.o;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h implements c1, e1, l0, o0 {
    public final g9.l A;
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
    public final o4.l e;
    public final o4.b f;
    public final g0 h;
    public final v n;
    public final q0 r = new q0("ChunkSampleStream");
    public final u s = new u(4);
    public final ArrayList v;
    public final List w;
    public final b1 x;
    public final b1[] y;

    public h(int i10, int[] iArr, t0[] t0VarArr, o4.l lVar, o4.b bVar, r rVar, long j10, n3.i iVar, j2 j2Var, v vVar, g0 g0Var) {
        this.a = i10;
        this.b = iArr;
        this.c = t0VarArr;
        this.e = lVar;
        this.f = bVar;
        this.h = g0Var;
        this.n = vVar;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new b1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        b1[] b1VarArr = new b1[i11];
        iVar.getClass();
        b1 b1Var = new b1(rVar, iVar, j2Var);
        this.x = b1Var;
        int i12 = 0;
        iArr2[0] = i10;
        b1VarArr[0] = b1Var;
        while (i12 < length) {
            b1 b1Var2 = new b1(rVar, null, null);
            this.y[i12] = b1Var2;
            int i13 = i12 + 1;
            b1VarArr[i13] = b1Var2;
            iArr2[i13] = this.b[i12];
            i12 = i13;
        }
        this.A = new g9.l(iArr2, b1VarArr, false, 24);
        this.E = j10;
        this.F = j10;
    }

    @Override // l4.e1
    public final long L() {
        if (this.I) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.E;
        }
        long j10 = this.F;
        a l10 = l();
        if (!l10.c()) {
            ArrayList arrayList = this.v;
            l10 = arrayList.size() > 1 ? (a) l1.i(2, arrayList) : null;
        }
        if (l10 != null) {
            j10 = Math.max(j10, l10.n);
        }
        return Math.max(j10, this.x.n());
    }

    @Override // l4.e1
    public final void U(long j10) {
        q0 q0Var = this.r;
        if (q0Var.c() || t()) {
            return;
        }
        boolean d = q0Var.d();
        List list = this.w;
        o4.l lVar = this.e;
        ArrayList arrayList = this.v;
        if (d) {
            e eVar = this.B;
            eVar.getClass();
            boolean z10 = eVar instanceof a;
            if (z10 && q(arrayList.size() - 1)) {
                return;
            }
            if (lVar.l == null ? lVar.i.p(j10, eVar, list) : false) {
                q0Var.b();
                if (z10) {
                    this.H = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (lVar.l != null || lVar.i.length() < 2) ? list.size() : lVar.i.j(j10, list);
        if (size < arrayList.size()) {
            f5.a.i(!q0Var.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!q(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j11 = l().n;
            a k9 = k(size);
            if (arrayList.isEmpty()) {
                this.E = this.F;
            }
            this.I = false;
            long j12 = k9.h;
            g0 g0Var = this.h;
            g0Var.m(new x(1, this.a, null, 3, null, g0Var.a(j12), g0Var.a(j11)));
        }
    }

    @Override // l4.c1
    public final void a() {
        q0 q0Var = this.r;
        q0Var.a();
        this.x.w();
        if (q0Var.d()) {
            return;
        }
        o4.l lVar = this.e;
        l4.b bVar = lVar.l;
        if (bVar != null) {
            throw bVar;
        }
        lVar.a.a();
    }

    @Override // l4.e1
    public final boolean b() {
        return this.r.d();
    }

    @Override // com.google.android.exoplayer2.upstream.o0
    public final void c() {
        b1 b1Var = this.x;
        b1Var.A(true);
        n3.e eVar = b1Var.h;
        if (eVar != null) {
            eVar.p(b1Var.e);
            b1Var.h = null;
            b1Var.g = null;
        }
        for (b1 b1Var2 : this.y) {
            b1Var2.A(true);
            n3.e eVar2 = b1Var2.h;
            if (eVar2 != null) {
                eVar2.p(b1Var2.e);
                b1Var2.h = null;
                b1Var2.g = null;
            }
        }
        for (o4.j jVar : this.e.h) {
            d dVar = jVar.a;
            if (dVar != null) {
                dVar.a.release();
            }
        }
        g gVar = this.D;
        if (gVar != null) {
            o4.b bVar = (o4.b) gVar;
            synchronized (bVar) {
                o oVar = (o) bVar.y.remove(this);
                if (oVar != null) {
                    b1 b1Var3 = oVar.a;
                    b1Var3.A(true);
                    n3.e eVar3 = b1Var3.h;
                    if (eVar3 != null) {
                        eVar3.p(b1Var3.e);
                        b1Var3.h = null;
                        b1Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // l4.c1
    public final int d(u0 u0Var, m3.i iVar, int i10) {
        if (t()) {
            return -3;
        }
        a aVar = this.H;
        b1 b1Var = this.x;
        if (aVar != null && aVar.d(0) <= b1Var.q()) {
            return -3;
        }
        u();
        return b1Var.z(u0Var, iVar, i10, this.I);
    }

    @Override // l4.c1
    public final boolean e() {
        return !t() && this.x.u(this.I);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void g(n0 n0Var, long j10, long j11, boolean z10) {
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
        if (t()) {
            this.x.A(false);
            for (b1 b1Var : this.y) {
                b1Var.A(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.v;
            k(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.E = this.F;
            }
        }
        this.f.a(this);
    }

    @Override // l4.e1
    public final long h() {
        if (t()) {
            return this.E;
        }
        if (this.I) {
            return Long.MIN_VALUE;
        }
        return l().n;
    }

    @Override // l4.c1
    public final int i(long j10) {
        if (t()) {
            return 0;
        }
        boolean z10 = this.I;
        b1 b1Var = this.x;
        int s10 = b1Var.s(j10, z10);
        a aVar = this.H;
        if (aVar != null) {
            s10 = Math.min(s10, aVar.d(0) - b1Var.q());
        }
        b1Var.E(s10);
        u();
        return s10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0288  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 j(n0 n0Var, IOException iOException, int i10) {
        p pVar;
        boolean z10;
        ArrayList arrayList;
        v vVar;
        boolean z11;
        long j10;
        boolean d;
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
        boolean z13 = (j12 != 0 && z12 && q(size)) ? false : true;
        Uri uri = eVar.r.c;
        p pVar2 = new p();
        d0.S(j11);
        d0.S(eVar.n);
        p2.u uVar = new p2.u(iOException, i10, 2);
        o4.l lVar = this.e;
        o4.j[] jVarArr = lVar.h;
        s sVar = lVar.b;
        v vVar2 = this.n;
        if (z13) {
            pVar = pVar2;
            o oVar = lVar.g;
            if (oVar != null) {
                long j13 = oVar.d;
                boolean z14 = j13 != -9223372036854775807L && j13 < j11;
                o4.p pVar3 = oVar.e;
                if (pVar3.f.d) {
                    if (!pVar3.n) {
                        if (z14) {
                            if (pVar3.h) {
                                pVar3.n = true;
                                pVar3.h = false;
                                o4.h hVar = (o4.h) pVar3.b.b;
                                hVar.D.removeCallbacks(hVar.w);
                                hVar.v();
                            }
                        }
                    }
                    z10 = z13;
                    z11 = z12;
                    arrayList = arrayList2;
                    vVar = vVar2;
                    d = true;
                    if (d) {
                        if (z10) {
                            if (z11) {
                                f5.a.i(k(size) == eVar);
                                if (arrayList.isEmpty()) {
                                    this.E = this.F;
                                }
                            }
                            k0Var = q0.e;
                            if (k0Var == null) {
                                vVar.getClass();
                                long D = v.D(uVar);
                                k0Var = D != -9223372036854775807L ? new k0(0, D, false) : q0.f;
                            }
                            k0 k0Var2 = k0Var;
                            a2 = k0Var2.a();
                            this.h.h(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a2);
                            if (!a2) {
                                this.B = null;
                                vVar.getClass();
                                this.f.a(this);
                            }
                            return k0Var2;
                        }
                        f5.a.K("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
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
            if (!lVar.j.d && (eVar instanceof k) && (iOException instanceof h0) && ((h0) iOException).d == 404) {
                o4.j jVar = jVarArr[lVar.i.m(t0Var)];
                z10 = z13;
                long F = jVar.d.F(jVar.e);
                if (F != -1 && F != 0) {
                    if (((k) eVar).b() > ((jVar.d.z() + jVar.f) + F) - 1) {
                        lVar.m = true;
                        z11 = z12;
                        arrayList = arrayList2;
                        vVar = vVar2;
                        d = true;
                        if (d) {
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
            o4.j jVar2 = jVarArr[lVar.i.m(t0Var)];
            p4.m mVar = jVar2.b;
            p4.b bVar = jVar2.c;
            p4.b L = sVar.L(mVar.b);
            if (L == null || bVar.equals(L)) {
                d5.r rVar = lVar.i;
                z zVar = jVar2.b.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                int length = rVar.length();
                vVar = vVar2;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (rVar.e(i12, elapsedRealtime)) {
                        i11++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i13 = 0; i13 < zVar.size(); i13++) {
                    hashSet.add(Integer.valueOf(((p4.b) zVar.get(i13)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList j14 = sVar.j(zVar);
                z11 = z12;
                for (int i14 = 0; i14 < j14.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((p4.b) j14.get(i14)).c));
                }
                j0 j0Var = new j0(size2, size2 - hashSet2.size(), length, i11);
                if (j0Var.a(2) || j0Var.a(1)) {
                    vVar.getClass();
                    k0 z15 = v.z(j0Var, uVar);
                    if (z15 != null) {
                        long j15 = z15.b;
                        int i15 = z15.a;
                        if (j0Var.a(i15)) {
                            if (i15 == 2) {
                                d5.r rVar2 = lVar.i;
                                d = rVar2.d(rVar2.m(t0Var), j15);
                                if (d) {
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
                                HashMap hashMap = (HashMap) sVar.b;
                                if (hashMap.containsKey(str)) {
                                    Long l10 = (Long) hashMap.get(str);
                                    int i16 = d0.a;
                                    j10 = Math.max(elapsedRealtime2, l10.longValue());
                                } else {
                                    j10 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j10));
                                int i17 = bVar.c;
                                if (i17 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i17);
                                    HashMap hashMap2 = (HashMap) sVar.c;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l11 = (Long) hashMap2.get(valueOf);
                                        int i18 = d0.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l11.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                d = true;
                                if (d) {
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
                            d = false;
                            if (d) {
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
            vVar = vVar2;
            d = true;
            if (d) {
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
        vVar = vVar2;
        d = false;
        if (d) {
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

    public final a k(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.N(i10, arrayList.size(), arrayList);
        this.G = Math.max(this.G, arrayList.size());
        int i11 = 0;
        this.x.k(aVar.d(0));
        while (true) {
            b1[] b1VarArr = this.y;
            if (i11 >= b1VarArr.length) {
                return aVar;
            }
            b1 b1Var = b1VarArr[i11];
            i11++;
            b1Var.k(aVar.d(i11));
        }
    }

    public final a l() {
        return (a) l1.i(1, this.v);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void m(n0 n0Var, long j10, long j11) {
        e eVar = (e) n0Var;
        this.B = null;
        boolean z10 = eVar instanceof j;
        o4.l lVar = this.e;
        if (z10) {
            int m10 = lVar.i.m(((j) eVar).d);
            o4.j[] jVarArr = lVar.h;
            o4.j jVar = jVarArr[m10];
            if (jVar.d == null) {
                d dVar = jVar.a;
                t tVar = dVar.n;
                o3.f fVar = tVar instanceof o3.f ? (o3.f) tVar : null;
                if (fVar != null) {
                    p4.m mVar = jVar.b;
                    jVarArr[m10] = new o4.j(jVar.e, mVar, jVar.c, dVar, jVar.f, new f2.c(fVar, mVar.c, 6));
                }
            }
        }
        o oVar = lVar.g;
        if (oVar != null) {
            long j12 = oVar.d;
            if (j12 == -9223372036854775807L || eVar.n > j12) {
                oVar.d = eVar.n;
            }
            oVar.e.h = true;
        }
        long j13 = eVar.a;
        Uri uri = eVar.r.c;
        p pVar = new p();
        this.n.getClass();
        this.h.f(pVar, eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        this.f.a(this);
    }

    public final boolean q(int i10) {
        int q6;
        a aVar = (a) this.v.get(i10);
        if (this.x.q() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b1[] b1VarArr = this.y;
            if (i11 >= b1VarArr.length) {
                return false;
            }
            q6 = b1VarArr[i11].q();
            i11++;
        } while (q6 <= aVar.d(i11));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (r9 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x039b  */
    @Override // l4.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j10) {
        long j11;
        List list;
        u uVar;
        long j12;
        List list2;
        List list3;
        k kVar;
        boolean z10;
        long j13;
        long max;
        q0 q0Var;
        u uVar2;
        List list4;
        Object iVar;
        p4.j jVar;
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
            j11 = l().n;
            list = this.w;
        }
        List list5 = list;
        o4.l lVar = this.e;
        o4.j[] jVarArr = lVar.h;
        l4.b bVar = lVar.l;
        u uVar3 = this.s;
        if (bVar != null) {
            uVar = uVar3;
            j12 = -9223372036854775807L;
        } else {
            long j14 = j11 - j10;
            uVar = uVar3;
            j12 = -9223372036854775807L;
            long H = d0.H(lVar.j.b(lVar.k).b) + d0.H(lVar.j.a) + j11;
            o oVar = lVar.g;
            if (oVar != null) {
                o4.p pVar = oVar.e;
                p4.c cVar = pVar.f;
                d6 d6Var = pVar.b;
                if (!cVar.d) {
                    list2 = list5;
                    z11 = false;
                } else if (pVar.n) {
                    list2 = list5;
                    z11 = true;
                } else {
                    list2 = list5;
                    Map.Entry ceilingEntry = pVar.e.ceilingEntry(Long.valueOf(cVar.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= H) {
                        z11 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        o4.h hVar = (o4.h) d6Var.b;
                        long j15 = hVar.N;
                        if (j15 == -9223372036854775807L || j15 < longValue) {
                            hVar.N = longValue;
                        }
                        z11 = true;
                    }
                    if (z11 && pVar.h) {
                        pVar.n = true;
                        pVar.h = false;
                        o4.h hVar2 = (o4.h) d6Var.b;
                        hVar2.D.removeCallbacks(hVar2.w);
                        hVar2.v();
                    }
                }
            } else {
                list2 = list5;
            }
            long H2 = d0.H(d0.t(lVar.f));
            p4.c cVar2 = lVar.j;
            long j16 = cVar2.a;
            long H3 = j16 == -9223372036854775807L ? -9223372036854775807L : H2 - d0.H(j16 + cVar2.b(lVar.k).b);
            if (list2.isEmpty()) {
                list3 = list2;
                kVar = null;
            } else {
                list3 = list2;
                kVar = (k) l1.j(1, list3);
            }
            int length = lVar.i.length();
            long j17 = j14;
            l[] lVarArr = new l[length];
            int i10 = 0;
            while (i10 < length) {
                k kVar2 = kVar;
                o4.j jVar2 = jVarArr[i10];
                boolean z13 = t10;
                o4.i iVar2 = jVar2.d;
                int i11 = length;
                long j18 = j17;
                long j19 = jVar2.f;
                long j20 = jVar2.e;
                bb.a aVar = l.p;
                if (iVar2 == null) {
                    lVarArr[i10] = aVar;
                } else {
                    long n10 = iVar2.n(j20, H2) + j19;
                    long b10 = jVar2.b(H2);
                    long b11 = kVar2 != null ? kVar2.b() : d0.i(jVar2.d.r(j11, j20) + j19, n10, b10);
                    if (b11 < n10) {
                        lVarArr[i10] = aVar;
                    } else {
                        lVarArr[i10] = new o4.k(lVar.b(i10), b11, b10);
                    }
                }
                i10++;
                kVar = kVar2;
                t10 = z13;
                length = i11;
                j17 = j18;
            }
            k kVar3 = kVar;
            z10 = t10;
            long j21 = j17;
            if (lVar.j.d) {
                long c3 = jVarArr[0].c(jVarArr[0].b(H2));
                p4.c cVar3 = lVar.j;
                long j22 = cVar3.a;
                j13 = 0;
                max = Math.max(0L, Math.min(j22 == -9223372036854775807L ? -9223372036854775807L : H2 - d0.H(j22 + cVar3.b(lVar.k).b), c3) - j10);
            } else {
                max = -9223372036854775807L;
                j13 = 0;
            }
            q0Var = q0Var2;
            uVar2 = uVar;
            long j23 = j13;
            lVar.i.b(j10, j21, max, list3, lVarArr);
            o4.j b12 = lVar.b(lVar.i.c());
            long j24 = b12.f;
            long j25 = b12.e;
            o4.i iVar3 = b12.d;
            p4.b bVar2 = b12.c;
            d dVar = b12.a;
            p4.m mVar = b12.b;
            if (dVar != null) {
                p4.j jVar3 = dVar.r == null ? mVar.h : null;
                if (iVar3 == null) {
                    list4 = list3;
                    jVar = mVar.d();
                } else {
                    list4 = list3;
                    jVar = null;
                }
                if (jVar3 != null || jVar != null) {
                    com.google.android.exoplayer2.upstream.m mVar2 = lVar.e;
                    t0 n11 = lVar.i.n();
                    int o10 = lVar.i.o();
                    Object r6 = lVar.i.r();
                    if (jVar3 != null) {
                        p4.j a2 = jVar3.a(jVar, bVar2.a);
                        if (a2 != null) {
                            jVar3 = a2;
                        }
                    } else {
                        jVar3 = jVar;
                    }
                    uVar2.c = new j(mVar2, x5.a(mVar, bVar2.a, jVar3, 0), n11, o10, r6, b12.a);
                    z12 = uVar2.b;
                    e eVar = (e) uVar2.c;
                    uVar2.c = null;
                    uVar2.b = false;
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
                    g9.l lVar2 = this.A;
                    if (z14) {
                        a aVar2 = (a) eVar;
                        if (z10) {
                            long j26 = aVar2.h;
                            long j27 = this.E;
                            if (j26 != j27) {
                                this.x.t = j27;
                                for (b1 b1Var : this.y) {
                                    b1Var.t = this.E;
                                }
                            }
                            this.E = -9223372036854775807L;
                        }
                        aVar2.x = lVar2;
                        b1[] b1VarArr = (b1[]) lVar2.c;
                        int[] iArr = new int[b1VarArr.length];
                        for (int i12 = 0; i12 < b1VarArr.length; i12++) {
                            b1 b1Var2 = b1VarArr[i12];
                            iArr[i12] = b1Var2.q + b1Var2.p;
                        }
                        aVar2.y = iArr;
                        this.v.add(aVar2);
                    } else if (eVar instanceof j) {
                        ((j) eVar).v = lVar2;
                    }
                    q0Var.f(eVar, this, this.n.B(eVar.c));
                    this.h.k(new p(eVar.b), eVar.c, this.a, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
                    return true;
                }
            } else {
                list4 = list3;
            }
            boolean z15 = j25 != -9223372036854775807L;
            if (iVar3.F(j25) == j23) {
                uVar2.b = z15;
            } else {
                long n12 = iVar3.n(j25, H2) + j24;
                long b13 = b12.b(H2);
                long b14 = kVar3 != null ? kVar3.b() : d0.i(iVar3.r(j11, j25) + j24, n12, b13);
                if (b14 < n12) {
                    lVar.l = new l4.b();
                } else {
                    if (b14 <= b13) {
                        long j28 = j11;
                        if (!lVar.m || b14 < b13) {
                            if (!z15 || b12.d(b14) < j25) {
                                int min = (int) Math.min(1, (b13 - b14) + 1);
                                if (j25 != -9223372036854775807L) {
                                    while (min > 1 && b12.d((min + b14) - 1) >= j25) {
                                        min--;
                                    }
                                }
                                long j29 = list4.isEmpty() ? j28 : -9223372036854775807L;
                                com.google.android.exoplayer2.upstream.m mVar3 = lVar.e;
                                int i13 = lVar.d;
                                t0 n13 = lVar.i.n();
                                int o11 = lVar.i.o();
                                Object r9 = lVar.i.r();
                                long d = b12.d(b14);
                                p4.j p10 = iVar3.p(b14 - j24);
                                if (dVar == null) {
                                    iVar = new m(mVar3, x5.a(mVar, bVar2.a, p10, iVar3.y() || (H3 > (-9223372036854775807L) ? 1 : (H3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b12.c(b14) > H3 ? 1 : (b12.c(b14) == H3 ? 0 : -1)) <= 0 ? 0 : 8), n13, o11, r9, d, b12.c(b14), b14, i13, n13);
                                } else {
                                    long j30 = b14;
                                    int i14 = 1;
                                    int i15 = 1;
                                    while (i14 < min) {
                                        p4.j a10 = p10.a(iVar3.p((j30 + i14) - j24), bVar2.a);
                                        if (a10 == null) {
                                            break;
                                        }
                                        i15++;
                                        i14++;
                                        p10 = a10;
                                    }
                                    long j31 = (j30 + i15) - 1;
                                    long c6 = b12.c(j31);
                                    iVar = new i(mVar3, x5.a(mVar, bVar2.a, p10, iVar3.y() || (H3 > (-9223372036854775807L) ? 1 : (H3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b12.c(j31) > H3 ? 1 : (b12.c(j31) == H3 ? 0 : -1)) <= 0 ? 0 : 8), n13, o11, r9, d, c6, j29, (j25 == -9223372036854775807L || j25 > c6) ? -9223372036854775807L : j25, j30, i15, -mVar.c, b12.a);
                                }
                                uVar2.c = iVar;
                            } else {
                                uVar2.b = true;
                            }
                        }
                    }
                    uVar2.b = z15;
                }
            }
            z12 = uVar2.b;
            e eVar2 = (e) uVar2.c;
            uVar2.c = null;
            uVar2.b = false;
            if (z12) {
            }
        }
        u uVar4 = uVar;
        q0Var = q0Var2;
        uVar2 = uVar4;
        z10 = t10;
        z12 = uVar2.b;
        e eVar22 = (e) uVar2.c;
        uVar2.c = null;
        uVar2.b = false;
        if (z12) {
        }
    }

    public final boolean t() {
        return this.E != -9223372036854775807L;
    }

    public final void u() {
        int v = v(this.x.q(), this.G - 1);
        while (true) {
            int i10 = this.G;
            if (i10 > v) {
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

    public final int v(int i10, int i11) {
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

    public final void w(o4.b bVar) {
        this.D = bVar;
        b1 b1Var = this.x;
        b1Var.i();
        n3.e eVar = b1Var.h;
        if (eVar != null) {
            eVar.p(b1Var.e);
            b1Var.h = null;
            b1Var.g = null;
        }
        for (b1 b1Var2 : this.y) {
            b1Var2.i();
            n3.e eVar2 = b1Var2.h;
            if (eVar2 != null) {
                eVar2.p(b1Var2.e);
                b1Var2.h = null;
                b1Var2.g = null;
            }
        }
        this.r.e(this);
    }
}
