package o2;

import android.net.Uri;
import android.support.v4.media.session.a0;
import android.util.SparseArray;
import b2.p1;
import b2.u0;
import b2.v0;
import b2.w;
import b2.w0;
import b2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.v1;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.m0;
import li.c0;
import p2.u;
import u2.d0;
import u2.d1;
import u2.e0;
import u2.r1;
import v7.c8;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k implements e0, u {
    public final int D;
    public final j2.l E;
    public final m0 F = new m0(this);
    public d0 G;
    public int H;
    public r1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.n M;
    public final long N;
    public final c a;
    public final p2.d b;
    public final l2.f c;
    public final g2.d0 d;
    public final n2.m e;
    public final n2.j f;
    public final hb.a h;
    public final a5.a n;
    public final a0 r;
    public final IdentityHashMap s;
    public final m2.t w;
    public final kb.a x;
    public final boolean y;

    public k(c cVar, p2.d dVar, l2.f fVar, g2.d0 d0Var, n2.m mVar, n2.j jVar, hb.a aVar, a5.a aVar2, a0 a0Var, kb.a aVar3, boolean z10, int i10, j2.l lVar) {
        this.a = cVar;
        this.b = dVar;
        this.c = fVar;
        this.d = d0Var;
        this.e = mVar;
        this.f = jVar;
        this.h = aVar;
        this.n = aVar2;
        this.r = a0Var;
        this.x = aVar3;
        this.y = z10;
        this.D = i10;
        this.E = lVar;
        aVar3.getClass();
        l0 l0Var = n0.b;
        x1 x1Var = x1.e;
        this.M = new u2.n(x1Var, x1Var);
        this.s = new IdentityHashMap();
        this.w = new m2.t(4);
        this.J = new q[0];
        this.K = new q[0];
        this.N = Long.MIN_VALUE;
    }

    public static x i(x xVar, x xVar2, boolean z10) {
        u0 u0Var;
        int i10;
        String str;
        String str2;
        n0 n0Var;
        int i11;
        int i12;
        String str3;
        l0 l0Var = n0.b;
        x1 x1Var = x1.e;
        if (xVar2 != null) {
            str2 = xVar2.k;
            u0Var = xVar2.l;
            i11 = xVar2.K;
            i10 = xVar2.e;
            i12 = xVar2.f;
            str = xVar2.d;
            str3 = xVar2.b;
            n0Var = xVar2.c;
        } else {
            String w9 = e2.l0.w(1, xVar.k);
            u0Var = xVar.l;
            if (z10) {
                i11 = xVar.K;
                i10 = xVar.e;
                i12 = xVar.f;
                str = xVar.d;
                str3 = xVar.b;
                str2 = w9;
                n0Var = xVar.c;
            } else {
                i10 = 0;
                str = null;
                str2 = w9;
                n0Var = x1Var;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        String d = v0.d(str2);
        int i13 = z10 ? xVar.h : -1;
        int i14 = z10 ? xVar.i : -1;
        w wVar = new w();
        wVar.a = xVar.a;
        wVar.b = str3;
        wVar.c = n0.u(n0Var);
        wVar.q = v0.n(xVar.r);
        wVar.r = v0.n(d);
        wVar.j = str2;
        wVar.k = u0Var;
        wVar.h = i13;
        wVar.i = i14;
        wVar.J = i11;
        wVar.e = i10;
        wVar.f = i12;
        wVar.d = str;
        return new x(wVar);
    }

    @Override // p2.u
    public final void a() {
        for (q qVar : this.J) {
            y2.l lVar = qVar.s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.D;
            if (!arrayList.isEmpty()) {
                j jVar = (j) e9.s.m(arrayList);
                int c10 = iVar.c(jVar);
                int i10 = jVar.E;
                if (c10 == 1) {
                    if (!jVar.g()) {
                        t6.p(i10 != -1);
                        p2.m b10 = iVar.g.b(jVar.y, false);
                        b10.getClass();
                        n0 n0Var = b10.r;
                        int i11 = (int) (jVar.s - b10.k);
                        jVar.a0 = i11 < 0 ? 0L : ((p2.h) (i11 < n0Var.size() ? ((p2.j) n0Var.get(i11)).y : b10.s).get(i10)).c;
                    }
                } else if (c10 == 0) {
                    qVar.H.post(new mh.k(2, qVar, jVar));
                } else if (c10 == 2 && !qVar.j0 && lVar.d()) {
                    lVar.b();
                }
            }
        }
        this.G.r(this);
    }

    @Override // p2.u
    public final boolean b(Uri uri, c5.x xVar, boolean z10) {
        int i10;
        boolean z11;
        k4.d dVar;
        int u10;
        q[] qVarArr = this.J;
        int length = qVarArr.length;
        int i11 = 0;
        boolean z12 = false;
        while (i11 < length) {
            q qVar = qVarArr[i11];
            i iVar = qVar.d;
            p2.w[] wVarArr = iVar.e;
            p2.d dVar2 = iVar.g;
            int length2 = wVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    break;
                }
                p2.w wVar = wVarArr[i12];
                p2.c cVar = (p2.c) dVar2.d.get(uri);
                if (wVar.equals(cVar != null ? cVar.a : null)) {
                    if (z10) {
                        dVar = null;
                    } else {
                        c0 a2 = iVar.a(uri);
                        qVar.r.getClass();
                        dVar = hb.a.p0(a2, xVar);
                    }
                    iVar.o = uri;
                    if (dVar != null) {
                        int i13 = dVar.a;
                        i10 = i11;
                        long j10 = dVar.b;
                        if (i13 == 1) {
                            p2.c cVar2 = (p2.c) dVar2.d.get(uri);
                            if (cVar2 != null) {
                                z11 = p2.c.c(cVar2, uri, j10);
                            }
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException(i0.a.i(i13, "Invalid fallback selection type: "));
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 >= wVarArr.length) {
                                    i14 = -1;
                                    break;
                                }
                                p2.w wVar2 = wVarArr[i14];
                                p2.c cVar3 = (p2.c) dVar2.d.get(uri);
                                if (wVar2.equals(cVar3 != null ? cVar3.a : null)) {
                                    break;
                                }
                                i14++;
                            }
                            if (i14 != -1 && (u10 = iVar.r.u(i14)) != -1 && iVar.r.o(u10, j10)) {
                                p2.c cVar4 = (p2.c) dVar2.d.get(uri);
                                if (cVar4 != null ? p2.c.c(cVar4, uri, j10) : false) {
                                    z11 = true;
                                }
                            }
                        }
                    }
                } else {
                    i12++;
                }
            }
            i10 = i11;
            z11 = false;
            z12 |= z11;
            i11 = i10 + 1;
        }
        this.G.r(this);
        return z12;
    }

    @Override // u2.f1
    public final long c() {
        return this.M.c();
    }

    @Override // u2.f1
    public final boolean d() {
        return this.M.d();
    }

    public final q e(String str, int i10, p2.w[] wVarArr, x[] xVarArr, x xVar, List list, Map map, long j10) {
        q qVar = new q(str, i10, this.F, new i(this.a, this.b, wVarArr, xVarArr, this.c, this.d, this.w, list, this.E), map, this.r, j10, xVar, this.e, this.f, this.h, this.n, this.D, null);
        long j11 = this.N;
        qVar.k0 = j11;
        if (qVar.S) {
            for (p pVar : qVar.L) {
                pVar.K(j11);
            }
        }
        return qVar;
    }

    @Override // u2.e0
    public final void f() {
        for (q qVar : this.J) {
            qVar.C();
            if (qVar.j0 && !qVar.T) {
                throw w0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // u2.e0
    public final long g(long j10) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean F = qVarArr[0].F(j10, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].F(j10, F);
                i10++;
            }
            if (F) {
                ((SparseArray) this.w.b).clear();
            }
        }
        return j10;
    }

    @Override // u2.e0
    public final void h(long j10) {
        for (q qVar : this.K) {
            if (qVar.S && !qVar.A()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].k(j10, qVar.d0[i10]);
                }
            }
        }
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j10) {
        String str;
        c cVar;
        boolean z10;
        Map map;
        n0 n0Var;
        int i10;
        HashSet hashSet;
        int i11;
        HashSet hashSet2;
        n0 n0Var2;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        List list;
        this.G = d0Var;
        p2.d dVar = this.b;
        dVar.getClass();
        dVar.e.add(this);
        p2.p pVar = dVar.s;
        pVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        n0 c10 = dVar.c(0);
        c10.getClass();
        n0 c11 = dVar.c(2);
        c11.getClass();
        n0 c12 = dVar.c(3);
        c12.getClass();
        boolean isEmpty = c10.isEmpty();
        this.H = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.a;
        boolean z14 = this.y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z14;
            map = map3;
            n0Var = c12;
        } else {
            x xVar = pVar.j;
            List list2 = pVar.k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < c10.size(); i15++) {
                x xVar2 = ((p2.w) c10.get(i15)).a.a;
                int i16 = xVar2.A;
                String str2 = xVar2.k;
                if (i16 > 0 || e2.l0.w(2, str2) != null) {
                    int i17 = i14;
                    iArr[i15] = 2;
                    i13++;
                    i14 = i17;
                } else if (e2.l0.w(1, str2) != null) {
                    iArr[i15] = 1;
                    i14++;
                } else {
                    iArr[i15] = -1;
                }
            }
            int i18 = i14;
            if (i13 > 0) {
                z12 = false;
                i12 = i13;
                z11 = true;
            } else if (i18 < size) {
                int i19 = size - i18;
                z11 = false;
                i12 = i19;
                z12 = true;
            } else {
                z11 = false;
                z12 = false;
                i12 = size;
            }
            p2.w[] wVarArr = new p2.w[i12];
            x[] xVarArr = new x[i12];
            int[] iArr2 = new int[i12];
            int i20 = 0;
            boolean z15 = z11;
            int i21 = 0;
            while (i21 < c10.size()) {
                if (z15) {
                    list = list2;
                    if (iArr[i21] != 2) {
                        i21++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z12 || iArr[i21] != 1) {
                    p2.w wVar = (p2.w) c10.get(i21);
                    wVarArr[i20] = wVar;
                    xVarArr[i20] = wVar.a.a;
                    iArr2[i20] = i21;
                    i20++;
                }
                i21++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = xVarArr[0].k;
            int v = e2.l0.v(2, str3);
            int i22 = 1;
            int v10 = e2.l0.v(1, str3);
            boolean z16 = (v10 == 1 || (v10 == 0 && c11.isEmpty())) && v <= 1 && v10 + v > 0;
            if (z15 || v10 <= 0) {
                z13 = true;
                i22 = 0;
            } else {
                z13 = true;
            }
            z10 = z14;
            n0Var = c12;
            q e = e("main", i22, wVarArr, xVarArr, xVar, list3, map3, j10);
            arrayList3.add(e);
            arrayList4.add(iArr2);
            if (z10 && z16) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    x[] xVarArr2 = new x[i12];
                    int i23 = 0;
                    while (i23 < i12) {
                        x xVar3 = xVarArr[i23];
                        String w9 = e2.l0.w(2, xVar3.k);
                        String d = v0.d(w9);
                        x[] xVarArr3 = xVarArr;
                        w wVar2 = new w();
                        wVar2.a = xVar3.a;
                        wVar2.b = xVar3.b;
                        wVar2.c = n0.u(xVar3.c);
                        wVar2.q = v0.n(xVar3.r);
                        wVar2.r = v0.n(d);
                        wVar2.j = w9;
                        wVar2.k = xVar3.l;
                        wVar2.h = xVar3.h;
                        wVar2.i = xVar3.i;
                        wVar2.y = xVar3.z;
                        wVar2.z = xVar3.A;
                        wVar2.C = xVar3.D;
                        wVar2.e = xVar3.e;
                        wVar2.f = xVar3.f;
                        wVar2.H = xVar3.I;
                        xVarArr2[i23] = new x(wVar2);
                        i23++;
                        xVarArr = xVarArr3;
                        map3 = map3;
                    }
                    x[] xVarArr4 = xVarArr;
                    map = map3;
                    arrayList5.add(new p1("main", xVarArr2));
                    if (v10 > 0 && (xVar != null || c11.isEmpty())) {
                        w a2 = i(xVarArr4[0], xVar, false).a();
                        a2.l = "main";
                        arrayList5.add(new p1("main:audio", new x(a2)));
                    }
                    if (list3 != null) {
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            String i25 = i0.a.i(i24, "main:cc:");
                            w a10 = cVar2.b((x) list3.get(i24)).a();
                            a10.l = "main";
                            arrayList5.add(new p1(i25, new x(a10)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    x[] xVarArr5 = new x[i12];
                    for (int i26 = 0; i26 < i12; i26++) {
                        xVarArr5[i26] = i(xVarArr[i26], xVar, true);
                    }
                    arrayList5.add(new p1("main", xVarArr5));
                }
                w wVar3 = new w();
                str = "ID3";
                wVar3.a = str;
                wVar3.r = v0.n("application/id3");
                wVar3.l = "main";
                p1 p1Var = new p1("main:id3", new x(wVar3));
                arrayList5.add(p1Var);
                e.D((p1[]) arrayList5.toArray(new p1[0]), arrayList5.indexOf(p1Var));
            } else {
                map = map3;
                str = "ID3";
                cVar = cVar2;
            }
        }
        ArrayList arrayList6 = new ArrayList(c11.size());
        ArrayList arrayList7 = new ArrayList(c11.size());
        ArrayList arrayList8 = new ArrayList(c11.size());
        HashSet hashSet3 = new HashSet();
        int i27 = 0;
        while (i27 < c11.size()) {
            String str4 = ((p2.w) c11.get(i27)).a.c;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z17 = true;
                for (int i28 = 0; i28 < c11.size(); i28++) {
                    if (str4.equals(((p2.w) c11.get(i28)).a.c)) {
                        p2.w wVar4 = (p2.w) c11.get(i28);
                        x xVar4 = wVar4.a.a;
                        arrayList8.add(Integer.valueOf(i28));
                        arrayList6.add(wVar4);
                        arrayList7.add(xVar4);
                        z17 &= e2.l0.v(1, xVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = e2.l0.a;
                i11 = i27;
                hashSet2 = hashSet3;
                n0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q e7 = e(concat, 1, (p2.w[]) arrayList6.toArray(new p2.w[0]), (x[]) arrayList7.toArray(new x[0]), null, Collections.EMPTY_LIST, map2, j10);
                arrayList4.add(c8.f(arrayList2));
                arrayList3.add(e7);
                if (z10 && z17) {
                    String A = sc.e.A(concat, ":id3");
                    w wVar5 = new w();
                    wVar5.a = str;
                    wVar5.r = v0.n("application/id3");
                    wVar5.l = concat;
                    e7.D(new p1[]{new p1(concat, (x[]) arrayList.toArray(new x[0])), new p1(A, new x(wVar5))}, 1);
                }
            } else {
                hashSet2 = hashSet3;
                i11 = i27;
                n0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            }
            i27 = i11 + 1;
            arrayList7 = arrayList;
            c11 = n0Var2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.L = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(n0Var.size());
        ArrayList arrayList10 = new ArrayList(n0Var.size());
        ArrayList arrayList11 = new ArrayList(n0Var.size());
        HashSet hashSet4 = new HashSet();
        int i29 = 0;
        while (i29 < n0Var.size()) {
            n0 n0Var3 = n0Var;
            String str6 = ((p2.w) n0Var3.get(i29)).a.c;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i30 = 0; i30 < n0Var3.size(); i30++) {
                    if (str6.equals(((p2.w) n0Var3.get(i30)).a.c)) {
                        p2.w wVar6 = (p2.w) n0Var3.get(i30);
                        arrayList11.add(Integer.valueOf(i30));
                        arrayList9.add(wVar6);
                        arrayList10.add(wVar6.a.a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                x[] xVarArr6 = (x[]) arrayList10.toArray(new x[0]);
                String str7 = e2.l0.a;
                p2.w[] wVarArr2 = (p2.w[]) arrayList9.toArray(new p2.w[0]);
                l0 l0Var = n0.b;
                n0Var = n0Var3;
                i10 = i29;
                hashSet = hashSet4;
                q e10 = e(concat2, 3, wVarArr2, xVarArr6, null, x1.e, map4, j10);
                arrayList4.add(c8.f(arrayList11));
                arrayList3.add(e10);
                int length = xVarArr6.length;
                x[] xVarArr7 = new x[length];
                for (int i31 = 0; i31 < length; i31++) {
                    xVarArr7[i31] = cVar.b(xVarArr6[i31]);
                }
                e10.D(new p1[]{new p1(concat2, xVarArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i10 = i29;
                n0Var = n0Var3;
            }
            i29 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.J = (q[]) arrayList3.toArray(new q[0]);
        this.H = this.J.length;
        for (int i32 = 0; i32 < this.L; i32++) {
            this.J[i32].d.l = true;
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                i2.v0 v0Var = new i2.v0();
                v0Var.a = qVar.f0;
                qVar.m(new i2.w0(v0Var));
            }
        }
        this.K = this.J;
    }

    @Override // u2.e0
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // u2.f1
    public final boolean m(i2.w0 w0Var) {
        if (this.I != null) {
            return this.M.m(w0Var);
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                i2.v0 v0Var = new i2.v0();
                v0Var.a = qVar.f0;
                qVar.m(new i2.w0(v0Var));
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0120, code lost:
    
        if (r44 != r3.f0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // u2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p(x2.q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        d1[] d1VarArr2;
        int[] iArr;
        boolean z10;
        ?? r92;
        i iVar;
        int i10;
        int i11;
        d1[] d1VarArr3;
        int i12;
        int[] iArr2;
        q[] qVarArr2;
        q qVar;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        boolean z13;
        ?? r10;
        int i16;
        int i17;
        x2.q[] qVarArr3;
        int[] iArr3 = new int[qVarArr.length];
        int[] iArr4 = new int[qVarArr.length];
        int i18 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.s;
            if (i18 >= length) {
                break;
            }
            d1 d1Var = d1VarArr[i18];
            iArr3[i18] = d1Var == null ? -1 : ((Integer) identityHashMap.get(d1Var)).intValue();
            iArr4[i18] = -1;
            x2.q qVar2 = qVarArr[i18];
            if (qVar2 != null) {
                p1 b10 = qVar2.b();
                int i19 = 0;
                while (true) {
                    q[] qVarArr4 = this.J;
                    if (i19 < qVarArr4.length) {
                        q qVar3 = qVarArr4[i19];
                        qVar3.e();
                        if (qVar3.Y.b(b10) != -1) {
                            iArr4[i18] = i19;
                            break;
                        }
                        i19++;
                    }
                }
            }
            i18++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        d1[] d1VarArr4 = new d1[length2];
        int length3 = qVarArr.length;
        d1[] d1VarArr5 = new d1[length3];
        int length4 = qVarArr.length;
        x2.q[] qVarArr5 = new x2.q[length4];
        boolean z14 = false;
        q[] qVarArr6 = new q[this.J.length];
        int i20 = length3;
        int i21 = 0;
        int i22 = 0;
        boolean z15 = false;
        while (i21 < this.J.length) {
            int i23 = length2;
            ?? r72 = z14;
            while (true) {
                d1VarArr2 = d1VarArr4;
                if (r72 >= qVarArr.length) {
                    break;
                }
                d1VarArr5[r72] = iArr3[r72] == i21 ? d1VarArr[r72] : null;
                qVarArr5[r72] = iArr4[r72] == i21 ? qVarArr[r72] : null;
                d1VarArr4 = d1VarArr2;
                r72++;
            }
            q qVar4 = this.J[i21];
            y2.l lVar = qVar4.s;
            int i24 = i21;
            i iVar2 = qVar4.d;
            p2.w[] wVarArr = iVar2.e;
            p2.d dVar = iVar2.g;
            ArrayList arrayList = qVar4.D;
            qVar4.e();
            int i25 = qVar4.U;
            ?? r29 = d1VarArr5;
            ?? r73 = z14;
            while (r73 < length4) {
                m mVar = (m) r29[r73];
                if (mVar == null || (qVarArr5[r73] != null && zArr[r73])) {
                    i17 = r73;
                    qVarArr3 = qVarArr5;
                } else {
                    i17 = r73;
                    qVar4.U--;
                    qVarArr3 = qVarArr5;
                    if (mVar.c != -1) {
                        q qVar5 = mVar.b;
                        int i26 = mVar.a;
                        qVar5.e();
                        qVar5.a0.getClass();
                        int i27 = qVar5.a0[i26];
                        if (i27 >= 0) {
                            t6.p(qVar5.d0[i27]);
                            qVar5.d0[i27] = z14;
                        }
                        mVar.c = -1;
                    }
                    r29[i17] = 0;
                }
                qVarArr5 = qVarArr3;
                r73 = i17 + 1;
            }
            x2.q[] qVarArr7 = qVarArr5;
            boolean z16 = true;
            if (!z15) {
                if (!qVar4.i0) {
                    iArr = iArr3;
                } else if (i25 != 0) {
                    iArr = iArr3;
                }
                z10 = z14;
                x2.q qVar6 = iVar2.r;
                boolean z17 = z10;
                x2.q qVar7 = qVar6;
                r92 = z14;
                while (r92 < length4) {
                    int i28 = r92;
                    x2.q qVar8 = qVarArr7[i28];
                    if (qVar8 == null) {
                        i16 = length4;
                    } else {
                        i16 = length4;
                        boolean z18 = z17;
                        int b11 = qVar4.Y.b(qVar8.b());
                        if (b11 == qVar4.b0) {
                            Uri c10 = wVarArr[iVar2.r.l()].c();
                            p2.c cVar = (p2.c) dVar.d.get(c10);
                            if (cVar != null) {
                                p2.b bVar = (p2.b) i0.a.h(cVar.b, c10, c10);
                                bVar.getClass();
                                bVar.x = z14;
                            }
                            iVar2.r = qVar8;
                            qVar7 = qVar8;
                        }
                        if (r29[i28] == 0) {
                            qVar4.U++;
                            m mVar2 = new m(qVar4, b11);
                            r29[i28] = mVar2;
                            zArr2[i28] = z16;
                            if (qVar4.a0 != null) {
                                mVar2.b();
                                int i29 = qVar4.a0[b11];
                                if (!z18 && i29 >= 0) {
                                    p pVar = qVar4.L[i29];
                                    z17 = (pVar.v() == 0 || pVar.J(j10, z16)) ? false : true;
                                }
                            }
                        }
                        z17 = z18;
                    }
                    length4 = i16;
                    z14 = false;
                    z16 = true;
                    r92 = i28 + 1;
                }
                int i30 = length4;
                boolean z19 = z17;
                if (qVar4.U != 0) {
                    Uri c11 = wVarArr[iVar2.r.l()].c();
                    p2.c cVar2 = (p2.c) dVar.d.get(c11);
                    if (cVar2 != null) {
                        p2.b bVar2 = (p2.b) i0.a.h(cVar2.b, c11, c11);
                        bVar2.getClass();
                        bVar2.x = false;
                    }
                    iVar2.n = null;
                    qVar4.W = null;
                    qVar4.h0 = true;
                    arrayList.clear();
                    if (lVar.d()) {
                        if (qVar4.S) {
                            for (p pVar2 : qVar4.L) {
                                pVar2.l();
                            }
                        }
                        lVar.b();
                    } else {
                        qVar4.E();
                    }
                    iVar = iVar2;
                    i13 = i20;
                    i11 = i23;
                    d1VarArr3 = d1VarArr2;
                    i12 = i24;
                    z12 = z19;
                    iArr2 = iArr4;
                    qVarArr2 = qVarArr6;
                    qVar = qVar4;
                } else {
                    boolean z20 = true;
                    if (arrayList.isEmpty() || Objects.equals(qVar7, qVar6)) {
                        iVar = iVar2;
                        i10 = i20;
                        i11 = i23;
                        d1VarArr3 = d1VarArr2;
                        i12 = i24;
                        iArr2 = iArr4;
                        qVarArr2 = qVarArr6;
                        qVar = qVar4;
                    } else {
                        if (qVar4.i0) {
                            iVar = iVar2;
                            i10 = i20;
                            i11 = i23;
                            d1VarArr3 = d1VarArr2;
                            i12 = i24;
                            iArr2 = iArr4;
                            qVarArr2 = qVarArr6;
                            qVar = qVar4;
                        } else {
                            long j11 = j10 < 0 ? -j10 : 0L;
                            j y3 = qVar4.y();
                            long j12 = j11;
                            v2.m[] b12 = iVar2.b(y3, j10);
                            iVar = iVar2;
                            List list = qVar4.E;
                            i10 = i20;
                            i11 = i23;
                            d1VarArr3 = d1VarArr2;
                            i12 = i24;
                            iArr2 = iArr4;
                            qVarArr2 = qVarArr6;
                            qVar = qVar4;
                            x2.q qVar9 = qVar7;
                            qVar9.k(j10, j12, -9223372036854775807L, list, b12);
                            if (qVar9.l() != iVar.h.a(y3.d)) {
                                z20 = true;
                            } else {
                                z20 = true;
                            }
                        }
                        qVar.h0 = z20;
                        z11 = z20;
                        z12 = z11;
                        if (z12) {
                            i13 = i10;
                        } else {
                            qVar.F(j10, z11);
                            i13 = i10;
                            int i31 = 0;
                            while (i31 < i13) {
                                if (r29[i31] != 0) {
                                    zArr2[i31] = z20;
                                }
                                i31++;
                                z20 = true;
                            }
                        }
                    }
                    z11 = z15;
                    z12 = z19;
                    if (z12) {
                    }
                }
                ArrayList arrayList2 = qVar.I;
                arrayList2.clear();
                for (i14 = 0; i14 < i13; i14++) {
                    ?? r82 = r29[i14];
                    if (r82 != 0) {
                        arrayList2.add((m) r82);
                    }
                }
                qVar.i0 = true;
                i15 = 0;
                z13 = false;
                while (i15 < qVarArr.length) {
                    ?? r83 = r29[i15];
                    int i32 = i12;
                    if (iArr2[i15] == i32) {
                        r83.getClass();
                        r10 = d1VarArr3;
                        r10[i15] = r83;
                        identityHashMap.put(r83, Integer.valueOf(i32));
                        z13 = true;
                    } else {
                        r10 = d1VarArr3;
                        if (iArr[i15] == i32) {
                            t6.p(r83 == 0);
                        }
                    }
                    i15++;
                    d1VarArr3 = r10;
                    i12 = i32;
                }
                d1[] d1VarArr6 = d1VarArr3;
                int i33 = i12;
                int i34 = i22;
                if (!z13) {
                    qVarArr2[i34] = qVar;
                    i22 = i34 + 1;
                    if (i34 == 0) {
                        iVar.l = true;
                        if (!z12) {
                            q[] qVarArr8 = this.K;
                            if (qVarArr8.length != 0 && qVar == qVarArr8[0]) {
                            }
                        }
                        ((SparseArray) this.w.b).clear();
                        z15 = true;
                    } else {
                        iVar.l = i33 < this.L;
                    }
                }
                i21 = i33 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                qVarArr6 = qVarArr2;
                d1VarArr5 = r29;
                qVarArr5 = qVarArr7;
                length2 = i11;
                z14 = false;
                i20 = i13;
                d1VarArr4 = d1VarArr6;
                length4 = i30;
            }
            iArr = iArr3;
            z10 = true;
            x2.q qVar62 = iVar2.r;
            boolean z172 = z10;
            x2.q qVar72 = qVar62;
            r92 = z14;
            while (r92 < length4) {
            }
            int i302 = length4;
            boolean z192 = z172;
            if (qVar4.U != 0) {
            }
            ArrayList arrayList22 = qVar.I;
            arrayList22.clear();
            while (i14 < i13) {
            }
            qVar.i0 = true;
            i15 = 0;
            z13 = false;
            while (i15 < qVarArr.length) {
            }
            d1[] d1VarArr62 = d1VarArr3;
            int i332 = i12;
            int i342 = i22;
            if (!z13) {
            }
            i21 = i332 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            qVarArr6 = qVarArr2;
            d1VarArr5 = r29;
            qVarArr5 = qVarArr7;
            length2 = i11;
            z14 = false;
            i20 = i13;
            d1VarArr4 = d1VarArr62;
            length4 = i302;
        }
        boolean z21 = z14;
        System.arraycopy(d1VarArr4, z21 ? 1 : 0, d1VarArr, z21 ? 1 : 0, length2);
        q[] qVarArr9 = (q[]) e2.l0.U(i22, qVarArr6);
        this.K = qVarArr9;
        x1 v = n0.v(qVarArr9);
        AbstractList x10 = e9.s.x(v, new m4.v0(21));
        this.x.getClass();
        this.M = new u2.n(v, x10);
        return j10;
    }

    @Override // u2.e0
    public final r1 q() {
        r1 r1Var = this.I;
        r1Var.getClass();
        return r1Var;
    }

    @Override // u2.f1
    public final long s() {
        return this.M.s();
    }

    @Override // u2.e0
    public final long t(long j10, v1 v1Var) {
        q[] qVarArr = this.K;
        int length = qVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            q qVar = qVarArr[i10];
            if (qVar.Q == 2) {
                i iVar = qVar.d;
                p2.d dVar = iVar.g;
                int c10 = iVar.r.c();
                p2.w[] wVarArr = iVar.e;
                p2.m b10 = (c10 >= wVarArr.length || c10 == -1) ? null : dVar.b(wVarArr[iVar.r.l()].c(), true);
                if (b10 != null) {
                    n0 n0Var = b10.r;
                    if (!n0Var.isEmpty()) {
                        long j11 = b10.h - dVar.I;
                        long j12 = j10 - j11;
                        int d = e2.l0.d(n0Var, Long.valueOf(j12), true);
                        long j13 = ((p2.j) n0Var.get(d)).e;
                        return v1Var.a(j12, j13, (!b10.c || d == n0Var.size() - 1) ? j13 : ((p2.j) n0Var.get(d + 1)).e) + j11;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override // u2.f1
    public final void u(long j10) {
        this.M.u(j10);
    }
}
