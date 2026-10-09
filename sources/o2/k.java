package o2;

import android.net.Uri;
import android.util.SparseArray;
import b2.l1;
import b2.p0;
import b2.r0;
import b2.s0;
import c5.b0;
import e9.a1;
import e9.i0;
import i2.q1;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.g0;
import ki.x;
import m.f3;
import m4.q0;
import u2.b1;
import u2.c0;
import u2.d0;
import u2.o1;
import v7.v7;
import w7.f8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k implements d0, p2.t {
    public final j2.k E;
    public final g0 F = new g0(this, 9);
    public c0 G;
    public int H;
    public o1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.n M;
    public final c a;
    public final p2.c b;
    public final m2.t c;
    public final g2.c0 d;
    public final n2.m e;
    public final n2.j f;
    public final rb.a h;
    public final a5.a n;
    public final y2.d r;
    public final IdentityHashMap s;
    public final f3 v;
    public final t7.t w;
    public final boolean x;
    public final int y;

    public k(c cVar, p2.c cVar2, m2.t tVar, g2.c0 c0Var, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, y2.d dVar, t7.t tVar2, boolean z10, int i10, j2.k kVar) {
        this.a = cVar;
        this.b = cVar2;
        this.c = tVar;
        this.d = c0Var;
        this.e = mVar;
        this.f = jVar;
        this.h = aVar;
        this.n = aVar2;
        this.r = dVar;
        this.w = tVar2;
        this.x = z10;
        this.y = i10;
        this.E = kVar;
        tVar2.getClass();
        e9.g0 g0Var = i0.b;
        a1 a1Var = a1.e;
        this.M = new u2.n(a1Var, a1Var);
        this.s = new IdentityHashMap();
        this.v = new f3(4);
        this.J = new q[0];
        this.K = new q[0];
    }

    public static b2.s f(b2.s sVar, b2.s sVar2, boolean z10) {
        p0 p0Var;
        int i10;
        String str;
        String str2;
        i0 i0Var;
        int i11;
        int i12;
        String str3;
        e9.g0 g0Var = i0.b;
        a1 a1Var = a1.e;
        if (sVar2 != null) {
            str2 = sVar2.k;
            p0Var = sVar2.l;
            i11 = sVar2.J;
            i10 = sVar2.e;
            i12 = sVar2.f;
            str = sVar2.d;
            str3 = sVar2.b;
            i0Var = sVar2.c;
        } else {
            String u10 = e2.d0.u(1, sVar.k);
            p0Var = sVar.l;
            if (z10) {
                i11 = sVar.J;
                i10 = sVar.e;
                i12 = sVar.f;
                str = sVar.d;
                str3 = sVar.b;
                str2 = u10;
                i0Var = sVar.c;
            } else {
                i10 = 0;
                str = null;
                str2 = u10;
                i0Var = a1Var;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        String d = r0.d(str2);
        int i13 = z10 ? sVar.h : -1;
        int i14 = z10 ? sVar.i : -1;
        b2.r rVar = new b2.r();
        rVar.a = sVar.a;
        rVar.b = str3;
        rVar.c = i0.v(i0Var);
        rVar.p = r0.n(sVar.q);
        rVar.q = r0.n(d);
        rVar.j = str2;
        rVar.k = p0Var;
        rVar.h = i13;
        rVar.i = i14;
        rVar.I = i11;
        rVar.e = i10;
        rVar.f = i12;
        rVar.d = str;
        return new b2.s(rVar);
    }

    @Override // p2.t
    public final void a() {
        for (q qVar : this.J) {
            y2.l lVar = qVar.s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.y;
            if (!arrayList.isEmpty()) {
                j jVar = (j) e9.q.l(arrayList);
                int b10 = iVar.b(jVar);
                int i10 = jVar.E;
                if (b10 == 1) {
                    if (!jVar.g()) {
                        e2.d.g(i10 != -1);
                        p2.l a2 = iVar.g.a(iVar.e[iVar.h.a(jVar.d)], false);
                        a2.getClass();
                        i0 i0Var = a2.r;
                        int i11 = (int) (jVar.s - a2.k);
                        jVar.a0 = i11 < 0 ? 0L : ((p2.g) (i11 < i0Var.size() ? ((p2.i) i0Var.get(i11)).x : a2.s).get(i10)).c;
                    }
                } else if (b10 == 0) {
                    qVar.H.post(new ki.i0(10, qVar, jVar));
                } else if (b10 == 2 && !qVar.j0 && lVar.d()) {
                    lVar.b();
                }
            }
        }
        this.G.D(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if ((((p2.b) r9.g.d.get(r18)) == null ? !p2.b.a(r4, r13) : false) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056 A[SYNTHETIC] */
    @Override // p2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        long j3;
        int i10;
        boolean z11;
        int u10;
        boolean z12 = true;
        for (q qVar : this.J) {
            i iVar = qVar.d;
            Uri[] uriArr = iVar.e;
            if (e2.d0.k(uriArr, uri)) {
                if (!z10) {
                    rb.a aVar = qVar.r;
                    x a2 = f8.a(iVar.r);
                    aVar.getClass();
                    k4.d l32 = rb.a.l3(a2, b0Var);
                    if (l32 != null && l32.a == 2) {
                        j3 = l32.b;
                        i10 = 0;
                        while (true) {
                            if (i10 < uriArr.length) {
                                i10 = -1;
                                break;
                            }
                            if (uriArr[i10].equals(uri)) {
                                break;
                            }
                            i10++;
                        }
                        if (i10 != -1 && (u10 = iVar.r.u(i10)) != -1) {
                            iVar.o = uri;
                            if (j3 != -9223372036854775807L && iVar.r.o(u10, j3)) {
                            }
                            z11 = false;
                        }
                        z11 = true;
                    }
                }
                j3 = -9223372036854775807L;
                i10 = 0;
                while (true) {
                    if (i10 < uriArr.length) {
                    }
                    i10++;
                }
                if (i10 != -1) {
                    iVar.o = uri;
                    if (j3 != -9223372036854775807L) {
                    }
                    z11 = false;
                }
                z11 = true;
            } else {
                z11 = true;
            }
            z12 &= z11;
        }
        this.G.D(this);
        return z12;
    }

    @Override // u2.d1
    public final boolean c() {
        return this.M.c();
    }

    @Override // u2.d1
    public final long d() {
        return this.M.d();
    }

    public final q e(String str, int i10, Uri[] uriArr, b2.s[] sVarArr, b2.s sVar, List list, Map map, long j3) {
        return new q(str, i10, this.F, new i(this.a, this.b, uriArr, sVarArr, this.c, this.d, this.v, list, this.E), map, this.r, j3, sVar, this.e, this.f, this.h, this.n, this.y);
    }

    @Override // u2.d0
    public final void g() {
        for (q qVar : this.J) {
            qVar.A();
            if (qVar.j0 && !qVar.T) {
                throw s0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // u2.d0
    public final long h(long j3) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean E = qVarArr[0].E(j3, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].E(j3, E);
                i10++;
            }
            if (E) {
                ((SparseArray) this.v.b).clear();
            }
        }
        return j3;
    }

    @Override // u2.d0
    public final void i(long j3) {
        for (q qVar : this.K) {
            if (qVar.S && !qVar.x()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].j(j3, qVar.d0[i10]);
                }
            }
        }
    }

    @Override // u2.d0
    public final void k(c0 c0Var, long j3) {
        c cVar;
        boolean z10;
        List list;
        List list2;
        int i10;
        HashSet hashSet;
        HashSet hashSet2;
        int i11;
        boolean z11;
        c cVar2;
        int i12;
        boolean z12;
        Uri[] uriArr;
        this.G = c0Var;
        p2.c cVar3 = this.b;
        cVar3.getClass();
        cVar3.e.add(this);
        p2.o oVar = cVar3.s;
        oVar.getClass();
        List list3 = oVar.g;
        List list4 = oVar.e;
        Map map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List list5 = oVar.h;
        int i13 = 0;
        this.H = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c cVar4 = this.a;
        boolean z13 = this.x;
        if (isEmpty) {
            cVar = cVar4;
            z10 = z13;
            list = list3;
            list2 = list5;
        } else {
            b2.s sVar = oVar.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                list2 = list5;
                if (i14 >= list4.size()) {
                    break;
                }
                b2.s sVar2 = ((p2.n) list4.get(i14)).b;
                int i16 = sVar2.z;
                String str = sVar2.k;
                if (i16 > 0 || e2.d0.u(2, str) != null) {
                    iArr[i14] = 2;
                    i15++;
                } else if (e2.d0.u(1, str) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
                i14++;
                list5 = list2;
            }
            if (i15 > 0) {
                z12 = false;
                cVar2 = cVar4;
                i12 = i15;
                z11 = true;
            } else if (i13 < size) {
                z11 = false;
                cVar2 = cVar4;
                i12 = size - i13;
                z12 = true;
            } else {
                z11 = false;
                cVar2 = cVar4;
                i12 = size;
                z12 = false;
            }
            Uri[] uriArr2 = new Uri[i12];
            b2.s[] sVarArr = new b2.s[i12];
            int[] iArr2 = new int[i12];
            int i17 = 0;
            int i18 = 0;
            while (i17 < list4.size()) {
                if (z11) {
                    uriArr = uriArr2;
                    if (iArr[i17] != 2) {
                        i17++;
                        uriArr2 = uriArr;
                    }
                } else {
                    uriArr = uriArr2;
                }
                if (!z12 || iArr[i17] != 1) {
                    p2.n nVar = (p2.n) list4.get(i17);
                    uriArr[i18] = nVar.a;
                    sVarArr[i18] = nVar.b;
                    iArr2[i18] = i17;
                    i18++;
                }
                i17++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = sVarArr[0].k;
            int t10 = e2.d0.t(2, str2);
            int t11 = e2.d0.t(1, str2);
            boolean z14 = (t11 == 1 || (t11 == 0 && list3.isEmpty())) && t10 <= 1 && t11 + t10 > 0;
            c cVar5 = cVar2;
            list = list3;
            z10 = z13;
            q e7 = e("main", (z11 || t11 <= 0) ? 0 : 1, uriArr3, sVarArr, oVar.j, oVar.k, map, j3);
            arrayList.add(e7);
            arrayList2.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList3 = new ArrayList();
                if (t10 > 0) {
                    b2.s[] sVarArr2 = new b2.s[i12];
                    int i19 = 0;
                    while (i19 < i12) {
                        b2.s sVar3 = sVarArr[i19];
                        String u10 = e2.d0.u(2, sVar3.k);
                        String d = r0.d(u10);
                        b2.r rVar = new b2.r();
                        rVar.a = sVar3.a;
                        rVar.b = sVar3.b;
                        rVar.c = i0.v(sVar3.c);
                        rVar.p = r0.n(sVar3.q);
                        rVar.q = r0.n(d);
                        rVar.j = u10;
                        rVar.k = sVar3.l;
                        rVar.h = sVar3.h;
                        rVar.i = sVar3.i;
                        rVar.x = sVar3.y;
                        rVar.y = sVar3.z;
                        rVar.B = sVar3.C;
                        rVar.e = sVar3.e;
                        rVar.f = sVar3.f;
                        sVarArr2[i19] = new b2.s(rVar);
                        i19++;
                        sVarArr = sVarArr;
                    }
                    b2.s[] sVarArr3 = sVarArr;
                    arrayList3.add(new l1("main", sVarArr2));
                    if (t11 > 0 && (sVar != null || list.isEmpty())) {
                        arrayList3.add(new l1("main:audio", f(sVarArr3[0], sVar, false)));
                    }
                    List list6 = oVar.k;
                    if (list6 != null) {
                        for (int i20 = 0; i20 < list6.size(); i20++) {
                            arrayList3.add(new l1(hg.c.h(i20, "main:cc:"), cVar5.b((b2.s) list6.get(i20))));
                        }
                    }
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    b2.s[] sVarArr4 = new b2.s[i12];
                    for (int i21 = 0; i21 < i12; i21++) {
                        sVarArr4[i21] = f(sVarArr[i21], sVar, true);
                    }
                    arrayList3.add(new l1("main", sVarArr4));
                }
                b2.r rVar2 = new b2.r();
                rVar2.a = "ID3";
                rVar2.q = r0.n("application/id3");
                l1 l1Var = new l1("main:id3", new b2.s(rVar2));
                arrayList3.add(l1Var);
                e7.B((l1[]) arrayList3.toArray(new l1[0]), arrayList3.indexOf(l1Var));
            } else {
                cVar = cVar5;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i22 = 0;
        while (i22 < list.size()) {
            List list7 = list;
            String str3 = ((p2.m) list7.get(i22)).c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z15 = true;
                for (int i23 = 0; i23 < list7.size(); i23++) {
                    if (str3.equals(((p2.m) list7.get(i23)).c)) {
                        p2.m mVar = (p2.m) list7.get(i23);
                        arrayList6.add(Integer.valueOf(i23));
                        Uri uri = mVar.a;
                        b2.s sVar4 = mVar.b;
                        arrayList4.add(uri);
                        arrayList5.add(sVar4);
                        z15 &= e2.d0.t(1, sVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                String str4 = e2.d0.a;
                list = list7;
                hashSet2 = hashSet3;
                i11 = i22;
                q e10 = e(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (b2.s[]) arrayList5.toArray(new b2.s[0]), null, Collections.EMPTY_LIST, map, j3);
                arrayList2.add(v7.f(arrayList6));
                arrayList.add(e10);
                if (z10 && z15) {
                    e10.B(new l1[]{new l1(concat, (b2.s[]) arrayList5.toArray(new b2.s[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i11 = i22;
                list = list7;
            }
            i22 = i11 + 1;
            hashSet3 = hashSet2;
        }
        this.L = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i24 = 0;
        while (i24 < list2.size()) {
            List list8 = list2;
            String str5 = ((p2.m) list8.get(i24)).c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i25 = 0; i25 < list8.size(); i25++) {
                    if (str5.equals(((p2.m) list8.get(i25)).c)) {
                        p2.m mVar2 = (p2.m) list8.get(i25);
                        arrayList9.add(Integer.valueOf(i25));
                        arrayList7.add(mVar2.a);
                        arrayList8.add(mVar2.b);
                    }
                }
                String concat2 = "subtitle:".concat(str5);
                b2.s[] sVarArr5 = (b2.s[]) arrayList8.toArray(new b2.s[0]);
                String str6 = e2.d0.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                e9.g0 g0Var = i0.b;
                list2 = list8;
                i10 = i24;
                hashSet = hashSet4;
                q e11 = e(concat2, 3, uriArr4, sVarArr5, null, a1.e, map, j3);
                arrayList2.add(v7.f(arrayList9));
                arrayList.add(e11);
                int length = sVarArr5.length;
                b2.s[] sVarArr6 = new b2.s[length];
                for (int i26 = 0; i26 < length; i26++) {
                    sVarArr6[i26] = cVar.b(sVarArr5[i26]);
                }
                e11.B(new l1[]{new l1(concat2, sVarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i10 = i24;
                list2 = list8;
            }
            i24 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.J = (q[]) arrayList.toArray(new q[0]);
        this.H = this.J.length;
        for (int i27 = 0; i27 < this.L; i27++) {
            this.J[i27].d.l = true;
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                i2.r0 r0Var = new i2.r0();
                r0Var.a = qVar.f0;
                qVar.n(new i2.s0(r0Var));
            }
        }
        this.K = this.J;
    }

    @Override // u2.d0
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // u2.d1
    public final boolean n(i2.s0 s0Var) {
        if (this.I != null) {
            return this.M.n(s0Var);
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                i2.r0 r0Var = new i2.r0();
                r0Var.a = qVar.f0;
                qVar.n(new i2.s0(r0Var));
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x011e, code lost:
    
        if (r44 != r3.f0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ac  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // u2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        b1[] b1VarArr2;
        int[] iArr;
        boolean z10;
        ?? r92;
        i iVar;
        int i10;
        int i11;
        b1[] b1VarArr3;
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
        x2.r[] rVarArr2;
        int[] iArr3 = new int[rVarArr.length];
        int[] iArr4 = new int[rVarArr.length];
        int i18 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.s;
            if (i18 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i18];
            iArr3[i18] = b1Var == null ? -1 : ((Integer) identityHashMap.get(b1Var)).intValue();
            iArr4[i18] = -1;
            x2.r rVar = rVarArr[i18];
            if (rVar != null) {
                l1 b10 = rVar.b();
                int i19 = 0;
                while (true) {
                    q[] qVarArr2 = this.J;
                    if (i19 < qVarArr2.length) {
                        q qVar2 = qVarArr2[i19];
                        qVar2.e();
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
        int length2 = rVarArr.length;
        b1[] b1VarArr4 = new b1[length2];
        int length3 = rVarArr.length;
        b1[] b1VarArr5 = new b1[length3];
        int length4 = rVarArr.length;
        x2.r[] rVarArr3 = new x2.r[length4];
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
                b1VarArr2 = b1VarArr4;
                if (r72 >= rVarArr.length) {
                    break;
                }
                b1VarArr5[r72] = iArr3[r72] == i21 ? b1VarArr[r72] : null;
                rVarArr3[r72] = iArr4[r72] == i21 ? rVarArr[r72] : null;
                b1VarArr4 = b1VarArr2;
                r72++;
            }
            q qVar3 = this.J[i21];
            y2.l lVar = qVar3.s;
            int i24 = i21;
            i iVar2 = qVar3.d;
            Uri[] uriArr = iVar2.e;
            p2.c cVar = iVar2.g;
            ArrayList arrayList = qVar3.y;
            qVar3.e();
            int i25 = qVar3.U;
            ?? r29 = b1VarArr5;
            ?? r73 = z14;
            while (r73 < length4) {
                m mVar = (m) r29[r73];
                if (mVar == null || (rVarArr3[r73] != null && zArr[r73])) {
                    i17 = r73;
                    rVarArr2 = rVarArr3;
                } else {
                    i17 = r73;
                    qVar3.U--;
                    rVarArr2 = rVarArr3;
                    if (mVar.c != -1) {
                        q qVar4 = mVar.b;
                        int i26 = mVar.a;
                        qVar4.e();
                        qVar4.a0.getClass();
                        int i27 = qVar4.a0[i26];
                        e2.d.g(qVar4.d0[i27]);
                        qVar4.d0[i27] = z14;
                        mVar.c = -1;
                    }
                    r29[i17] = 0;
                }
                rVarArr3 = rVarArr2;
                r73 = i17 + 1;
            }
            x2.r[] rVarArr4 = rVarArr3;
            boolean z16 = true;
            if (!z15) {
                if (!qVar3.i0) {
                    iArr = iArr3;
                } else if (i25 != 0) {
                    iArr = iArr3;
                }
                z10 = z14;
                x2.r rVar2 = iVar2.r;
                boolean z17 = z10;
                x2.r rVar3 = rVar2;
                r92 = z14;
                while (r92 < length4) {
                    int i28 = r92;
                    x2.r rVar4 = rVarArr4[i28];
                    if (rVar4 == null) {
                        i16 = length4;
                    } else {
                        i16 = length4;
                        boolean z18 = z17;
                        int b11 = qVar3.Y.b(rVar4.b());
                        if (b11 == qVar3.b0) {
                            p2.b bVar = (p2.b) cVar.d.get(uriArr[iVar2.r.l()]);
                            if (bVar != null) {
                                bVar.v = z14;
                            }
                            iVar2.r = rVar4;
                            rVar3 = rVar4;
                        }
                        if (r29[i28] == 0) {
                            qVar3.U++;
                            m mVar2 = new m(qVar3, b11);
                            r29[i28] = mVar2;
                            zArr2[i28] = z16;
                            if (qVar3.a0 != null) {
                                mVar2.b();
                                if (!z18) {
                                    p pVar = qVar3.L[qVar3.a0[b11]];
                                    z17 = (pVar.t() == 0 || pVar.G(j3, z16)) ? false : true;
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
                int i29 = length4;
                boolean z19 = z17;
                if (qVar3.U != 0) {
                    p2.b bVar2 = (p2.b) cVar.d.get(uriArr[iVar2.r.l()]);
                    if (bVar2 != null) {
                        bVar2.v = false;
                    }
                    iVar2.n = null;
                    qVar3.W = null;
                    qVar3.h0 = true;
                    arrayList.clear();
                    if (lVar.d()) {
                        if (qVar3.S) {
                            for (p pVar2 : qVar3.L) {
                                pVar2.k();
                            }
                        }
                        lVar.b();
                    } else {
                        qVar3.D();
                    }
                    iVar = iVar2;
                    i13 = i20;
                    i11 = i23;
                    b1VarArr3 = b1VarArr2;
                    i12 = i24;
                    z12 = z19;
                    iArr2 = iArr4;
                    qVarArr = qVarArr3;
                    qVar = qVar3;
                } else {
                    boolean z20 = true;
                    if (arrayList.isEmpty() || Objects.equals(rVar3, rVar2)) {
                        iVar = iVar2;
                        i10 = i20;
                        i11 = i23;
                        b1VarArr3 = b1VarArr2;
                        i12 = i24;
                        iArr2 = iArr4;
                        qVarArr = qVarArr3;
                        qVar = qVar3;
                    } else {
                        if (qVar3.i0) {
                            iVar = iVar2;
                            i10 = i20;
                            i11 = i23;
                            b1VarArr3 = b1VarArr2;
                            i12 = i24;
                            iArr2 = iArr4;
                            qVarArr = qVarArr3;
                            qVar = qVar3;
                        } else {
                            long j10 = j3 < 0 ? -j3 : 0L;
                            j v = qVar3.v();
                            long j11 = j10;
                            v2.l[] a2 = iVar2.a(v, j3);
                            iVar = iVar2;
                            List list = qVar3.E;
                            i10 = i20;
                            i11 = i23;
                            b1VarArr3 = b1VarArr2;
                            i12 = i24;
                            iArr2 = iArr4;
                            qVarArr = qVarArr3;
                            qVar = qVar3;
                            x2.r rVar5 = rVar3;
                            rVar5.k(j3, j11, -9223372036854775807L, list, a2);
                            if (rVar5.l() != iVar.h.a(v.d)) {
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
                            qVar.E(j3, z11);
                            i13 = i10;
                            int i30 = 0;
                            while (i30 < i13) {
                                if (r29[i30] != 0) {
                                    zArr2[i30] = z20;
                                }
                                i30++;
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
                while (i15 < rVarArr.length) {
                    ?? r83 = r29[i15];
                    int i31 = i12;
                    if (iArr2[i15] == i31) {
                        r83.getClass();
                        r10 = b1VarArr3;
                        r10[i15] = r83;
                        identityHashMap.put(r83, Integer.valueOf(i31));
                        z13 = true;
                    } else {
                        r10 = b1VarArr3;
                        if (iArr[i15] == i31) {
                            e2.d.g(r83 == 0);
                        }
                    }
                    i15++;
                    b1VarArr3 = r10;
                    i12 = i31;
                }
                b1[] b1VarArr6 = b1VarArr3;
                int i32 = i12;
                int i33 = i22;
                if (!z13) {
                    qVarArr[i33] = qVar;
                    i22 = i33 + 1;
                    if (i33 == 0) {
                        iVar.l = true;
                        if (!z12) {
                            q[] qVarArr4 = this.K;
                            if (qVarArr4.length != 0 && qVar == qVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.v.b).clear();
                        z15 = true;
                    } else {
                        iVar.l = i32 < this.L;
                    }
                }
                i21 = i32 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                qVarArr3 = qVarArr;
                b1VarArr5 = r29;
                rVarArr3 = rVarArr4;
                length2 = i11;
                z14 = false;
                i20 = i13;
                b1VarArr4 = b1VarArr6;
                length4 = i29;
            }
            iArr = iArr3;
            z10 = true;
            x2.r rVar22 = iVar2.r;
            boolean z172 = z10;
            x2.r rVar32 = rVar22;
            r92 = z14;
            while (r92 < length4) {
            }
            int i292 = length4;
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
            while (i15 < rVarArr.length) {
            }
            b1[] b1VarArr62 = b1VarArr3;
            int i322 = i12;
            int i332 = i22;
            if (!z13) {
            }
            i21 = i322 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            qVarArr3 = qVarArr;
            b1VarArr5 = r29;
            rVarArr3 = rVarArr4;
            length2 = i11;
            z14 = false;
            i20 = i13;
            b1VarArr4 = b1VarArr62;
            length4 = i292;
        }
        boolean z21 = z14;
        System.arraycopy(b1VarArr4, z21 ? 1 : 0, b1VarArr, z21 ? 1 : 0, length2);
        q[] qVarArr5 = (q[]) e2.d0.R(i22, qVarArr3);
        this.K = qVarArr5;
        a1 w10 = i0.w(qVarArr5);
        AbstractList w11 = e9.q.w(w10, new q0(20));
        this.w.getClass();
        this.M = new u2.n(w10, w11);
        return j3;
    }

    @Override // u2.d0
    public final o1 p() {
        o1 o1Var = this.I;
        o1Var.getClass();
        return o1Var;
    }

    @Override // u2.d1
    public final long q() {
        return this.M.q();
    }

    @Override // u2.d0
    public final long r(long j3, q1 q1Var) {
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
                p2.c cVar = iVar.g;
                int c10 = iVar.r.c();
                Uri[] uriArr = iVar.e;
                p2.l a2 = (c10 >= uriArr.length || c10 == -1) ? null : cVar.a(uriArr[iVar.r.l()], true);
                if (a2 != null) {
                    i0 i0Var = a2.r;
                    if (!i0Var.isEmpty()) {
                        long j10 = a2.h - cVar.y;
                        long j11 = j3 - j10;
                        int c11 = e2.d0.c(i0Var, Long.valueOf(j11), true);
                        long j12 = ((p2.i) i0Var.get(c11)).e;
                        return q1Var.a(j11, j12, (!a2.c || c11 == i0Var.size() - 1) ? j12 : ((p2.i) i0Var.get(c11 + 1)).e) + j10;
                    }
                }
            } else {
                i10++;
            }
        }
        return j3;
    }

    @Override // u2.d1
    public final void s(long j3) {
        this.M.s(j3);
    }
}
