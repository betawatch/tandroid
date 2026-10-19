package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.p1;
import b2.t0;
import b2.v0;
import b2.w;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import g2.c0;
import i2.s1;
import i2.u0;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.w0;
import m4.z;
import p2.v;
import p2.x;
import u2.d0;
import u2.d1;
import u2.e0;
import u2.r1;
import v7.b8;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class k implements e0, v {
    public final j2.k E;
    public final le.b F = new le.b(this, 6);
    public d0 G;
    public int H;
    public r1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.o M;
    public final long N;
    public final c a;
    public final p2.e b;
    public final l2.f c;
    public final c0 d;
    public final n2.n e;
    public final n2.k f;
    public final oa.d h;
    public final a5.a n;
    public final androidx.biometric.e r;
    public final IdentityHashMap s;
    public final w0 v;
    public final oa.d w;
    public final boolean x;
    public final int y;

    public k(c cVar, p2.e eVar, l2.f fVar, c0 c0Var, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, androidx.biometric.e eVar2, oa.d dVar2, boolean z10, int i10, j2.k kVar2) {
        this.a = cVar;
        this.b = eVar;
        this.c = fVar;
        this.d = c0Var;
        this.e = nVar;
        this.f = kVar;
        this.h = dVar;
        this.n = aVar;
        this.r = eVar2;
        this.w = dVar2;
        this.x = z10;
        this.y = i10;
        this.E = kVar2;
        dVar2.getClass();
        l0 l0Var = n0.b;
        x1 x1Var = x1.e;
        this.M = new u2.o(x1Var, x1Var);
        this.s = new IdentityHashMap();
        this.v = new w0(9);
        this.J = new q[0];
        this.K = new q[0];
        this.N = Long.MIN_VALUE;
    }

    public static w f(w wVar, w wVar2, boolean z10) {
        t0 t0Var;
        int i10;
        String str;
        String str2;
        n0 n0Var;
        int i11;
        int i12;
        String str3;
        l0 l0Var = n0.b;
        x1 x1Var = x1.e;
        if (wVar2 != null) {
            str2 = wVar2.k;
            t0Var = wVar2.l;
            i11 = wVar2.K;
            i10 = wVar2.e;
            i12 = wVar2.f;
            str = wVar2.d;
            str3 = wVar2.b;
            n0Var = wVar2.c;
        } else {
            String w9 = m0.w(1, wVar.k);
            t0Var = wVar.l;
            if (z10) {
                i11 = wVar.K;
                i10 = wVar.e;
                i12 = wVar.f;
                str = wVar.d;
                str3 = wVar.b;
                str2 = w9;
                n0Var = wVar.c;
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
        int i13 = z10 ? wVar.h : -1;
        int i14 = z10 ? wVar.i : -1;
        b2.v vVar = new b2.v();
        vVar.a = wVar.a;
        vVar.b = str3;
        vVar.c = n0.u(n0Var);
        vVar.q = v0.n(wVar.r);
        vVar.r = v0.n(d);
        vVar.j = str2;
        vVar.k = t0Var;
        vVar.h = i13;
        vVar.i = i14;
        vVar.J = i11;
        vVar.e = i10;
        vVar.f = i12;
        vVar.d = str;
        return new w(vVar);
    }

    @Override // p2.v
    public final void a() {
        for (q qVar : this.J) {
            y2.l lVar = qVar.s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.y;
            if (!arrayList.isEmpty()) {
                j jVar = (j) e9.s.m(arrayList);
                int c10 = iVar.c(jVar);
                int i10 = jVar.E;
                if (c10 == 1) {
                    if (!jVar.g()) {
                        u6.p(i10 != -1);
                        p2.n b10 = iVar.g.b(jVar.x, false);
                        b10.getClass();
                        n0 n0Var = b10.r;
                        int i11 = (int) (jVar.s - b10.k);
                        jVar.a0 = i11 < 0 ? 0L : ((p2.i) (i11 < n0Var.size() ? ((p2.k) n0Var.get(i11)).x : b10.s).get(i10)).c;
                    }
                } else if (c10 == 0) {
                    qVar.H.post(new z(7, qVar, jVar));
                } else if (c10 == 2 && !qVar.j0 && lVar.d()) {
                    lVar.b();
                }
            }
        }
        this.G.h(this);
    }

    @Override // p2.v
    public final boolean b(Uri uri, c5.c0 c0Var, boolean z10) {
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
            x[] xVarArr = iVar.e;
            p2.e eVar = iVar.g;
            int length2 = xVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    break;
                }
                x xVar = xVarArr[i12];
                p2.d dVar2 = (p2.d) eVar.d.get(uri);
                if (xVar.equals(dVar2 != null ? dVar2.a : null)) {
                    if (z10) {
                        dVar = null;
                    } else {
                        si.z a2 = iVar.a(uri);
                        qVar.r.getClass();
                        dVar = oa.d.x3(a2, c0Var);
                    }
                    iVar.o = uri;
                    if (dVar != null) {
                        int i13 = dVar.a;
                        i10 = i11;
                        long j10 = dVar.b;
                        if (i13 == 1) {
                            p2.d dVar3 = (p2.d) eVar.d.get(uri);
                            if (dVar3 != null) {
                                z11 = p2.d.c(dVar3, uri, j10);
                            }
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException(i2.e.j(i13, "Invalid fallback selection type: "));
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 >= xVarArr.length) {
                                    i14 = -1;
                                    break;
                                }
                                x xVar2 = xVarArr[i14];
                                p2.d dVar4 = (p2.d) eVar.d.get(uri);
                                if (xVar2.equals(dVar4 != null ? dVar4.a : null)) {
                                    break;
                                }
                                i14++;
                            }
                            if (i14 != -1 && (u10 = iVar.r.u(i14)) != -1 && iVar.r.o(u10, j10)) {
                                p2.d dVar5 = (p2.d) eVar.d.get(uri);
                                if (dVar5 != null ? p2.d.c(dVar5, uri, j10) : false) {
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
        this.G.h(this);
        return z12;
    }

    @Override // u2.f1
    public final boolean c() {
        return this.M.c();
    }

    @Override // u2.f1
    public final long d() {
        return this.M.d();
    }

    public final q e(String str, int i10, x[] xVarArr, w[] wVarArr, w wVar, List list, Map map, long j10) {
        q qVar = new q(str, i10, this.F, new i(this.a, this.b, xVarArr, wVarArr, this.c, this.d, this.v, list, this.E), map, this.r, j10, wVar, this.e, this.f, this.h, this.n, this.y, null);
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
    public final void i() {
        for (q qVar : this.J) {
            qVar.C();
            if (qVar.j0 && !qVar.T) {
                throw b2.w0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // u2.e0
    public final long j(long j10) {
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
                ((SparseArray) this.v.b).clear();
            }
        }
        return j10;
    }

    @Override // u2.e0
    public final void l(long j10) {
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
    public final void n(d0 d0Var, long j10) {
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
        p2.e eVar = this.b;
        eVar.getClass();
        eVar.e.add(this);
        p2.q qVar = eVar.s;
        qVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        n0 c10 = eVar.c(0);
        c10.getClass();
        n0 c11 = eVar.c(2);
        c11.getClass();
        n0 c12 = eVar.c(3);
        c12.getClass();
        boolean isEmpty = c10.isEmpty();
        this.H = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.a;
        boolean z14 = this.x;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z14;
            map = map3;
            n0Var = c12;
        } else {
            w wVar = qVar.j;
            List list2 = qVar.k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < c10.size(); i15++) {
                w wVar2 = ((x) c10.get(i15)).a.a;
                int i16 = wVar2.A;
                String str2 = wVar2.k;
                if (i16 > 0 || m0.w(2, str2) != null) {
                    int i17 = i14;
                    iArr[i15] = 2;
                    i13++;
                    i14 = i17;
                } else if (m0.w(1, str2) != null) {
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
            x[] xVarArr = new x[i12];
            w[] wVarArr = new w[i12];
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
                    x xVar = (x) c10.get(i21);
                    xVarArr[i20] = xVar;
                    wVarArr[i20] = xVar.a.a;
                    iArr2[i20] = i21;
                    i20++;
                }
                i21++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = wVarArr[0].k;
            int v = m0.v(2, str3);
            int i22 = 1;
            int v10 = m0.v(1, str3);
            boolean z16 = (v10 == 1 || (v10 == 0 && c11.isEmpty())) && v <= 1 && v10 + v > 0;
            if (z15 || v10 <= 0) {
                z13 = true;
                i22 = 0;
            } else {
                z13 = true;
            }
            z10 = z14;
            n0Var = c12;
            q e = e("main", i22, xVarArr, wVarArr, wVar, list3, map3, j10);
            arrayList3.add(e);
            arrayList4.add(iArr2);
            if (z10 && z16) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    w[] wVarArr2 = new w[i12];
                    int i23 = 0;
                    while (i23 < i12) {
                        w wVar3 = wVarArr[i23];
                        String w9 = m0.w(2, wVar3.k);
                        String d = v0.d(w9);
                        w[] wVarArr3 = wVarArr;
                        b2.v vVar = new b2.v();
                        vVar.a = wVar3.a;
                        vVar.b = wVar3.b;
                        vVar.c = n0.u(wVar3.c);
                        vVar.q = v0.n(wVar3.r);
                        vVar.r = v0.n(d);
                        vVar.j = w9;
                        vVar.k = wVar3.l;
                        vVar.h = wVar3.h;
                        vVar.i = wVar3.i;
                        vVar.y = wVar3.z;
                        vVar.z = wVar3.A;
                        vVar.C = wVar3.D;
                        vVar.e = wVar3.e;
                        vVar.f = wVar3.f;
                        vVar.H = wVar3.I;
                        wVarArr2[i23] = new w(vVar);
                        i23++;
                        wVarArr = wVarArr3;
                        map3 = map3;
                    }
                    w[] wVarArr4 = wVarArr;
                    map = map3;
                    arrayList5.add(new p1("main", wVarArr2));
                    if (v10 > 0 && (wVar != null || c11.isEmpty())) {
                        b2.v a2 = f(wVarArr4[0], wVar, false).a();
                        a2.l = "main";
                        arrayList5.add(new p1("main:audio", new w(a2)));
                    }
                    if (list3 != null) {
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            String j11 = i2.e.j(i24, "main:cc:");
                            b2.v a10 = cVar2.b((w) list3.get(i24)).a();
                            a10.l = "main";
                            arrayList5.add(new p1(j11, new w(a10)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    w[] wVarArr5 = new w[i12];
                    for (int i25 = 0; i25 < i12; i25++) {
                        wVarArr5[i25] = f(wVarArr[i25], wVar, true);
                    }
                    arrayList5.add(new p1("main", wVarArr5));
                }
                b2.v vVar2 = new b2.v();
                str = "ID3";
                vVar2.a = str;
                vVar2.r = v0.n("application/id3");
                vVar2.l = "main";
                p1 p1Var = new p1("main:id3", new w(vVar2));
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
        int i26 = 0;
        while (i26 < c11.size()) {
            String str4 = ((x) c11.get(i26)).a.c;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z17 = true;
                for (int i27 = 0; i27 < c11.size(); i27++) {
                    if (str4.equals(((x) c11.get(i27)).a.c)) {
                        x xVar2 = (x) c11.get(i27);
                        w wVar4 = xVar2.a.a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(xVar2);
                        arrayList7.add(wVar4);
                        z17 &= m0.v(1, wVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = m0.a;
                i11 = i26;
                hashSet2 = hashSet3;
                n0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q e7 = e(concat, 1, (x[]) arrayList6.toArray(new x[0]), (w[]) arrayList7.toArray(new w[0]), null, Collections.EMPTY_LIST, map2, j10);
                arrayList4.add(b8.f(arrayList2));
                arrayList3.add(e7);
                if (z10 && z17) {
                    String u10 = r4.c.u(concat, ":id3");
                    b2.v vVar3 = new b2.v();
                    vVar3.a = str;
                    vVar3.r = v0.n("application/id3");
                    vVar3.l = concat;
                    e7.D(new p1[]{new p1(concat, (w[]) arrayList.toArray(new w[0])), new p1(u10, new w(vVar3))}, 1);
                }
            } else {
                hashSet2 = hashSet3;
                i11 = i26;
                n0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            }
            i26 = i11 + 1;
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
        int i28 = 0;
        while (i28 < n0Var.size()) {
            n0 n0Var3 = n0Var;
            String str6 = ((x) n0Var3.get(i28)).a.c;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i29 = 0; i29 < n0Var3.size(); i29++) {
                    if (str6.equals(((x) n0Var3.get(i29)).a.c)) {
                        x xVar3 = (x) n0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(xVar3);
                        arrayList10.add(xVar3.a.a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                w[] wVarArr6 = (w[]) arrayList10.toArray(new w[0]);
                String str7 = m0.a;
                x[] xVarArr2 = (x[]) arrayList9.toArray(new x[0]);
                l0 l0Var = n0.b;
                n0Var = n0Var3;
                i10 = i28;
                hashSet = hashSet4;
                q e10 = e(concat2, 3, xVarArr2, wVarArr6, null, x1.e, map4, j10);
                arrayList4.add(b8.f(arrayList11));
                arrayList3.add(e10);
                int length = wVarArr6.length;
                w[] wVarArr7 = new w[length];
                for (int i30 = 0; i30 < length; i30++) {
                    wVarArr7[i30] = cVar.b(wVarArr6[i30]);
                }
                e10.D(new p1[]{new p1(concat2, wVarArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i10 = i28;
                n0Var = n0Var3;
            }
            i28 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.J = (q[]) arrayList3.toArray(new q[0]);
        this.H = this.J.length;
        for (int i31 = 0; i31 < this.L; i31++) {
            this.J[i31].d.l = true;
        }
        for (q qVar2 : this.J) {
            if (!qVar2.T) {
                u0 u0Var = new u0();
                u0Var.a = qVar2.f0;
                qVar2.p(new i2.v0(u0Var));
            }
        }
        this.K = this.J;
    }

    @Override // u2.e0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // u2.f1
    public final boolean p(i2.v0 v0Var) {
        if (this.I != null) {
            return this.M.p(v0Var);
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                u0 u0Var = new u0();
                u0Var.a = qVar.f0;
                qVar.p(new i2.v0(u0Var));
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
    public final long q(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
        q[] qVarArr;
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
        x2.p[] pVarArr2;
        int[] iArr3 = new int[pVarArr.length];
        int[] iArr4 = new int[pVarArr.length];
        int i18 = 0;
        while (true) {
            int length = pVarArr.length;
            identityHashMap = this.s;
            if (i18 >= length) {
                break;
            }
            d1 d1Var = d1VarArr[i18];
            iArr3[i18] = d1Var == null ? -1 : ((Integer) identityHashMap.get(d1Var)).intValue();
            iArr4[i18] = -1;
            x2.p pVar = pVarArr[i18];
            if (pVar != null) {
                p1 b10 = pVar.b();
                int i19 = 0;
                while (true) {
                    q[] qVarArr2 = this.J;
                    if (i19 < qVarArr2.length) {
                        q qVar2 = qVarArr2[i19];
                        qVar2.f();
                        if (qVar2.Y.b(b10) != -1) {
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
        int length2 = pVarArr.length;
        d1[] d1VarArr4 = new d1[length2];
        int length3 = pVarArr.length;
        d1[] d1VarArr5 = new d1[length3];
        int length4 = pVarArr.length;
        x2.p[] pVarArr3 = new x2.p[length4];
        boolean z14 = false;
        q[] qVarArr3 = new q[this.J.length];
        int i20 = length3;
        int i21 = 0;
        int i22 = 0;
        boolean z15 = false;
        while (i21 < this.J.length) {
            int i23 = length2;
            ?? r72 = z14;
            while (true) {
                d1VarArr2 = d1VarArr4;
                if (r72 >= pVarArr.length) {
                    break;
                }
                d1VarArr5[r72] = iArr3[r72] == i21 ? d1VarArr[r72] : null;
                pVarArr3[r72] = iArr4[r72] == i21 ? pVarArr[r72] : null;
                d1VarArr4 = d1VarArr2;
                r72++;
            }
            q qVar3 = this.J[i21];
            y2.l lVar = qVar3.s;
            int i24 = i21;
            i iVar2 = qVar3.d;
            x[] xVarArr = iVar2.e;
            p2.e eVar = iVar2.g;
            ArrayList arrayList = qVar3.y;
            qVar3.f();
            int i25 = qVar3.U;
            ?? r29 = d1VarArr5;
            ?? r73 = z14;
            while (r73 < length4) {
                m mVar = (m) r29[r73];
                if (mVar == null || (pVarArr3[r73] != null && zArr[r73])) {
                    i17 = r73;
                    pVarArr2 = pVarArr3;
                } else {
                    i17 = r73;
                    qVar3.U--;
                    pVarArr2 = pVarArr3;
                    if (mVar.c != -1) {
                        q qVar4 = mVar.b;
                        int i26 = mVar.a;
                        qVar4.f();
                        qVar4.a0.getClass();
                        int i27 = qVar4.a0[i26];
                        if (i27 >= 0) {
                            u6.p(qVar4.d0[i27]);
                            qVar4.d0[i27] = z14;
                        }
                        mVar.c = -1;
                    }
                    r29[i17] = 0;
                }
                pVarArr3 = pVarArr2;
                r73 = i17 + 1;
            }
            x2.p[] pVarArr4 = pVarArr3;
            boolean z16 = true;
            if (!z15) {
                if (!qVar3.i0) {
                    iArr = iArr3;
                } else if (i25 != 0) {
                    iArr = iArr3;
                }
                z10 = z14;
                x2.p pVar2 = iVar2.r;
                boolean z17 = z10;
                x2.p pVar3 = pVar2;
                r92 = z14;
                while (r92 < length4) {
                    int i28 = r92;
                    x2.p pVar4 = pVarArr4[i28];
                    if (pVar4 == null) {
                        i16 = length4;
                    } else {
                        i16 = length4;
                        boolean z18 = z17;
                        int b11 = qVar3.Y.b(pVar4.b());
                        if (b11 == qVar3.b0) {
                            Uri c10 = xVarArr[iVar2.r.l()].c();
                            p2.d dVar = (p2.d) eVar.d.get(c10);
                            if (dVar != null) {
                                p2.c cVar = (p2.c) i2.e.i(dVar.b, c10, c10);
                                cVar.getClass();
                                cVar.w = z14;
                            }
                            iVar2.r = pVar4;
                            pVar3 = pVar4;
                        }
                        if (r29[i28] == 0) {
                            qVar3.U++;
                            m mVar2 = new m(qVar3, b11);
                            r29[i28] = mVar2;
                            zArr2[i28] = z16;
                            if (qVar3.a0 != null) {
                                mVar2.b();
                                int i29 = qVar3.a0[b11];
                                if (!z18 && i29 >= 0) {
                                    p pVar5 = qVar3.L[i29];
                                    z17 = (pVar5.v() == 0 || pVar5.J(j10, z16)) ? false : true;
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
                if (qVar3.U != 0) {
                    Uri c11 = xVarArr[iVar2.r.l()].c();
                    p2.d dVar2 = (p2.d) eVar.d.get(c11);
                    if (dVar2 != null) {
                        p2.c cVar2 = (p2.c) i2.e.i(dVar2.b, c11, c11);
                        cVar2.getClass();
                        cVar2.w = false;
                    }
                    iVar2.n = null;
                    qVar3.W = null;
                    qVar3.h0 = true;
                    arrayList.clear();
                    if (lVar.d()) {
                        if (qVar3.S) {
                            for (p pVar6 : qVar3.L) {
                                pVar6.l();
                            }
                        }
                        lVar.b();
                    } else {
                        qVar3.E();
                    }
                    iVar = iVar2;
                    i13 = i20;
                    i11 = i23;
                    d1VarArr3 = d1VarArr2;
                    i12 = i24;
                    z12 = z19;
                    iArr2 = iArr4;
                    qVarArr = qVarArr3;
                    qVar = qVar3;
                } else {
                    boolean z20 = true;
                    if (arrayList.isEmpty() || Objects.equals(pVar3, pVar2)) {
                        iVar = iVar2;
                        i10 = i20;
                        i11 = i23;
                        d1VarArr3 = d1VarArr2;
                        i12 = i24;
                        iArr2 = iArr4;
                        qVarArr = qVarArr3;
                        qVar = qVar3;
                    } else {
                        if (qVar3.i0) {
                            iVar = iVar2;
                            i10 = i20;
                            i11 = i23;
                            d1VarArr3 = d1VarArr2;
                            i12 = i24;
                            iArr2 = iArr4;
                            qVarArr = qVarArr3;
                            qVar = qVar3;
                        } else {
                            long j11 = j10 < 0 ? -j10 : 0L;
                            j y3 = qVar3.y();
                            long j12 = j11;
                            v2.m[] b12 = iVar2.b(y3, j10);
                            iVar = iVar2;
                            List list = qVar3.E;
                            i10 = i20;
                            i11 = i23;
                            d1VarArr3 = d1VarArr2;
                            i12 = i24;
                            iArr2 = iArr4;
                            qVarArr = qVarArr3;
                            qVar = qVar3;
                            x2.p pVar7 = pVar3;
                            pVar7.k(j10, j12, -9223372036854775807L, list, b12);
                            if (pVar7.l() != iVar.h.a(y3.d)) {
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
                while (i15 < pVarArr.length) {
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
                            u6.p(r83 == 0);
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
                    qVarArr[i34] = qVar;
                    i22 = i34 + 1;
                    if (i34 == 0) {
                        iVar.l = true;
                        if (!z12) {
                            q[] qVarArr4 = this.K;
                            if (qVarArr4.length != 0 && qVar == qVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.v.b).clear();
                        z15 = true;
                    } else {
                        iVar.l = i33 < this.L;
                    }
                }
                i21 = i33 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                qVarArr3 = qVarArr;
                d1VarArr5 = r29;
                pVarArr3 = pVarArr4;
                length2 = i11;
                z14 = false;
                i20 = i13;
                d1VarArr4 = d1VarArr6;
                length4 = i30;
            }
            iArr = iArr3;
            z10 = true;
            x2.p pVar22 = iVar2.r;
            boolean z172 = z10;
            x2.p pVar32 = pVar22;
            r92 = z14;
            while (r92 < length4) {
            }
            int i302 = length4;
            boolean z192 = z172;
            if (qVar3.U != 0) {
            }
            ArrayList arrayList22 = qVar.I;
            arrayList22.clear();
            while (i14 < i13) {
            }
            qVar.i0 = true;
            i15 = 0;
            z13 = false;
            while (i15 < pVarArr.length) {
            }
            d1[] d1VarArr62 = d1VarArr3;
            int i332 = i12;
            int i342 = i22;
            if (!z13) {
            }
            i21 = i332 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            qVarArr3 = qVarArr;
            d1VarArr5 = r29;
            pVarArr3 = pVarArr4;
            length2 = i11;
            z14 = false;
            i20 = i13;
            d1VarArr4 = d1VarArr62;
            length4 = i302;
        }
        boolean z21 = z14;
        System.arraycopy(d1VarArr4, z21 ? 1 : 0, d1VarArr, z21 ? 1 : 0, length2);
        q[] qVarArr5 = (q[]) m0.U(i22, qVarArr3);
        this.K = qVarArr5;
        x1 v = n0.v(qVarArr5);
        AbstractList x10 = e9.s.x(v, new m4.v0(15));
        this.w.getClass();
        this.M = new u2.o(v, x10);
        return j10;
    }

    @Override // u2.e0
    public final r1 r() {
        r1 r1Var = this.I;
        r1Var.getClass();
        return r1Var;
    }

    @Override // u2.f1
    public final long s() {
        return this.M.s();
    }

    @Override // u2.e0
    public final long t(long j10, s1 s1Var) {
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
                p2.e eVar = iVar.g;
                int c10 = iVar.r.c();
                x[] xVarArr = iVar.e;
                p2.n b10 = (c10 >= xVarArr.length || c10 == -1) ? null : eVar.b(xVarArr[iVar.r.l()].c(), true);
                if (b10 != null) {
                    n0 n0Var = b10.r;
                    if (!n0Var.isEmpty()) {
                        long j11 = b10.h - eVar.I;
                        long j12 = j10 - j11;
                        int d = m0.d(n0Var, Long.valueOf(j12), true);
                        long j13 = ((p2.k) n0Var.get(d)).e;
                        return s1Var.a(j12, j13, (!b10.c || d == n0Var.size() - 1) ? j13 : ((p2.k) n0Var.get(d + 1)).e) + j11;
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
