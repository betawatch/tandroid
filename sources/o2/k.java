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
import i2.p1;
import i2.q0;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import ji.b5;
import ji.u4;
import k2.g0;
import m4.t0;
import u2.b1;
import u2.c0;
import u2.d0;
import u2.o1;
import v7.x7;
import w7.f8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k implements d0, p2.t {
    public final j2.k E;
    public final mg.n F = new mg.n(this, 3);
    public c0 G;
    public int H;
    public o1 I;
    public q[] J;
    public q[] K;
    public int L;
    public u2.n M;
    public final c a;
    public final p2.c b;
    public final u4 c;
    public final g2.c0 d;
    public final n2.m e;
    public final n2.j f;
    public final rb.a h;
    public final a5.a n;
    public final y2.d r;
    public final IdentityHashMap s;
    public final g0 v;
    public final qb.b w;
    public final boolean x;
    public final int y;

    public k(c cVar, p2.c cVar2, u4 u4Var, g2.c0 c0Var, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, y2.d dVar, qb.b bVar, boolean z10, int i10, j2.k kVar) {
        this.a = cVar;
        this.b = cVar2;
        this.c = u4Var;
        this.d = c0Var;
        this.e = mVar;
        this.f = jVar;
        this.h = aVar;
        this.n = aVar2;
        this.r = dVar;
        this.w = bVar;
        this.x = z10;
        this.y = i10;
        this.E = kVar;
        bVar.getClass();
        e9.g0 g0Var = i0.b;
        a1 a1Var = a1.e;
        this.M = new u2.n(a1Var, a1Var);
        this.s = new IdentityHashMap();
        this.v = new g0(7);
        this.J = new q[0];
        this.K = new q[0];
    }

    public static b2.s f(b2.s sVar, b2.s sVar2, boolean z10) {
        p0 p0Var;
        int i10;
        String str;
        String str2;
        i0 i0Var;
        String str3;
        int i11;
        int i12;
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
            String v = e2.d0.v(1, sVar.k);
            p0Var = sVar.l;
            if (z10) {
                i11 = sVar.J;
                i10 = sVar.e;
                i12 = sVar.f;
                str = sVar.d;
                str3 = sVar.b;
                str2 = v;
                i0Var = sVar.c;
            } else {
                i10 = 0;
                str = null;
                str2 = v;
                i0Var = a1Var;
                str3 = null;
                i11 = -1;
                i12 = 0;
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
            y2.m mVar = qVar.s;
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
                    qVar.H.post(new b5(13, qVar, jVar));
                } else if (b10 == 2 && !qVar.j0 && mVar.d()) {
                    mVar.a();
                }
            }
        }
        this.G.b(this);
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
                    y2.g a2 = f8.a(iVar.r);
                    aVar.getClass();
                    k4.d K3 = rb.a.K3(a2, b0Var);
                    if (K3 != null && K3.a == 2) {
                        j3 = K3.b;
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
        this.G.b(this);
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
    public final void j() {
        for (q qVar : this.J) {
            qVar.D();
            if (qVar.j0 && !qVar.T) {
                throw s0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // u2.d0
    public final long k(long j3) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean G = qVarArr[0].G(j3, false);
            int i10 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i10 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i10].G(j3, G);
                i10++;
            }
            if (G) {
                ((SparseArray) this.v.b).clear();
            }
        }
        return j3;
    }

    @Override // u2.d0
    public final void l(long j3) {
        for (q qVar : this.K) {
            if (qVar.S && !qVar.B()) {
                int length = qVar.L.length;
                for (int i10 = 0; i10 < length; i10++) {
                    qVar.L[i10].j(j3, qVar.d0[i10]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    @Override // u2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(c0 c0Var, long j3) {
        c cVar;
        boolean z10;
        List list;
        List list2;
        int i10;
        HashSet hashSet;
        HashSet hashSet2;
        int i11;
        c cVar2;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        c cVar3;
        Uri[] uriArr;
        this.G = c0Var;
        p2.c cVar4 = this.b;
        cVar4.getClass();
        cVar4.e.add(this);
        p2.o oVar = cVar4.s;
        oVar.getClass();
        List list3 = oVar.g;
        List list4 = oVar.e;
        Map map = Collections.EMPTY_MAP;
        boolean isEmpty = list4.isEmpty();
        List list5 = oVar.h;
        int i14 = 0;
        this.H = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c cVar5 = this.a;
        boolean z13 = this.x;
        if (isEmpty) {
            cVar = cVar5;
            z10 = z13;
            list = list3;
            list2 = list5;
        } else {
            b2.s sVar = oVar.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                list2 = list5;
                if (i15 >= list4.size()) {
                    break;
                }
                b2.s sVar2 = ((p2.n) list4.get(i15)).b;
                int i17 = sVar2.z;
                String str = sVar2.k;
                if (i17 > 0 || e2.d0.v(2, str) != null) {
                    iArr[i15] = 2;
                    i16++;
                } else if (e2.d0.v(1, str) != null) {
                    iArr[i15] = 1;
                    i14++;
                } else {
                    iArr[i15] = -1;
                }
                i15++;
                list5 = list2;
            }
            if (i16 > 0) {
                cVar2 = cVar5;
                i12 = i16;
                z11 = true;
            } else if (i14 < size) {
                cVar2 = cVar5;
                i12 = size - i14;
                z11 = false;
                z12 = true;
                Uri[] uriArr2 = new Uri[i12];
                b2.s[] sVarArr = new b2.s[i12];
                int[] iArr2 = new int[i12];
                i13 = 0;
                int i18 = 0;
                while (i13 < list4.size()) {
                    if (z11) {
                        uriArr = uriArr2;
                        if (iArr[i13] != 2) {
                            i13++;
                            uriArr2 = uriArr;
                        }
                    } else {
                        uriArr = uriArr2;
                    }
                    if (!z12 || iArr[i13] != 1) {
                        p2.n nVar = (p2.n) list4.get(i13);
                        uriArr[i18] = nVar.a;
                        sVarArr[i18] = nVar.b;
                        iArr2[i18] = i13;
                        i18++;
                    }
                    i13++;
                    uriArr2 = uriArr;
                }
                Uri[] uriArr3 = uriArr2;
                String str2 = sVarArr[0].k;
                int u10 = e2.d0.u(2, str2);
                int u11 = e2.d0.u(1, str2);
                boolean z14 = (u11 != 1 || (u11 == 0 && list3.isEmpty())) && u10 <= 1 && u11 + u10 > 0;
                cVar3 = cVar2;
                list = list3;
                z10 = z13;
                q e7 = e("main", (!z11 || u11 <= 0) ? 0 : 1, uriArr3, sVarArr, oVar.j, oVar.k, map, j3);
                arrayList.add(e7);
                arrayList2.add(iArr2);
                if (z10 || !z14) {
                    cVar = cVar3;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    if (u10 > 0) {
                        b2.s[] sVarArr2 = new b2.s[i12];
                        int i19 = 0;
                        while (i19 < i12) {
                            b2.s sVar3 = sVarArr[i19];
                            String v = e2.d0.v(2, sVar3.k);
                            String d = r0.d(v);
                            b2.r rVar = new b2.r();
                            rVar.a = sVar3.a;
                            rVar.b = sVar3.b;
                            rVar.c = i0.v(sVar3.c);
                            rVar.p = r0.n(sVar3.q);
                            rVar.q = r0.n(d);
                            rVar.j = v;
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
                        if (u11 > 0 && (sVar != null || list.isEmpty())) {
                            arrayList3.add(new l1("main:audio", f(sVarArr3[0], sVar, false)));
                        }
                        List list6 = oVar.k;
                        if (list6 != null) {
                            for (int i20 = 0; i20 < list6.size(); i20++) {
                                arrayList3.add(new l1(i2.g.i(i20, "main:cc:"), cVar3.b((b2.s) list6.get(i20))));
                            }
                        }
                        cVar = cVar3;
                    } else {
                        cVar = cVar3;
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
                    e7.E((l1[]) arrayList3.toArray(new l1[0]), arrayList3.indexOf(l1Var));
                }
            } else {
                cVar2 = cVar5;
                i12 = size;
                z11 = false;
            }
            z12 = false;
            Uri[] uriArr22 = new Uri[i12];
            b2.s[] sVarArr5 = new b2.s[i12];
            int[] iArr22 = new int[i12];
            i13 = 0;
            int i182 = 0;
            while (i13 < list4.size()) {
            }
            Uri[] uriArr32 = uriArr22;
            String str22 = sVarArr5[0].k;
            int u102 = e2.d0.u(2, str22);
            int u112 = e2.d0.u(1, str22);
            if (u112 != 1) {
            }
            cVar3 = cVar2;
            list = list3;
            z10 = z13;
            q e72 = e("main", (!z11 || u112 <= 0) ? 0 : 1, uriArr32, sVarArr5, oVar.j, oVar.k, map, j3);
            arrayList.add(e72);
            arrayList2.add(iArr22);
            if (z10) {
            }
            cVar = cVar3;
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
                        z15 &= e2.d0.u(1, sVar4.k) == 1;
                    }
                }
                String concat = "audio:".concat(str3);
                String str4 = e2.d0.a;
                list = list7;
                hashSet2 = hashSet3;
                i11 = i22;
                q e10 = e(concat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (b2.s[]) arrayList5.toArray(new b2.s[0]), null, Collections.EMPTY_LIST, map, j3);
                arrayList2.add(x7.f(arrayList6));
                arrayList.add(e10);
                if (z10 && z15) {
                    e10.E(new l1[]{new l1(concat, (b2.s[]) arrayList5.toArray(new b2.s[0]))}, new int[0]);
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
                b2.s[] sVarArr6 = (b2.s[]) arrayList8.toArray(new b2.s[0]);
                String str6 = e2.d0.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                e9.g0 g0Var = i0.b;
                list2 = list8;
                i10 = i24;
                hashSet = hashSet4;
                q e11 = e(concat2, 3, uriArr4, sVarArr6, null, a1.e, map, j3);
                arrayList2.add(x7.f(arrayList9));
                arrayList.add(e11);
                int length = sVarArr6.length;
                b2.s[] sVarArr7 = new b2.s[length];
                for (int i26 = 0; i26 < length; i26++) {
                    sVarArr7[i26] = cVar.b(sVarArr6[i26]);
                }
                e11.E(new l1[]{new l1(concat2, sVarArr7)}, new int[0]);
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
                q0 q0Var = new q0();
                q0Var.a = qVar.f0;
                qVar.p(new i2.r0(q0Var));
            }
        }
        this.K = this.J;
    }

    @Override // u2.d0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // u2.d1
    public final boolean p(i2.r0 r0Var) {
        if (this.I != null) {
            return this.M.p(r0Var);
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                q0 q0Var = new q0();
                q0Var.a = qVar.f0;
                qVar.p(new i2.r0(q0Var));
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x011b, code lost:
    
        if (r44 != r3.f0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // u2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        b1[] b1VarArr2;
        int[] iArr;
        boolean z10;
        int i10;
        i iVar;
        int i11;
        int i12;
        b1[] b1VarArr3;
        int i13;
        int[] iArr2;
        q[] qVarArr;
        q qVar;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        boolean z13;
        ?? r10;
        int i17;
        int i18;
        x2.r[] rVarArr2;
        int[] iArr3 = new int[rVarArr.length];
        int[] iArr4 = new int[rVarArr.length];
        int i19 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.s;
            if (i19 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i19];
            iArr3[i19] = b1Var == null ? -1 : ((Integer) identityHashMap.get(b1Var)).intValue();
            iArr4[i19] = -1;
            x2.r rVar = rVarArr[i19];
            if (rVar != null) {
                l1 b10 = rVar.b();
                int i20 = 0;
                while (true) {
                    q[] qVarArr2 = this.J;
                    if (i20 < qVarArr2.length) {
                        q qVar2 = qVarArr2[i20];
                        qVar2.e();
                        if (qVar2.Y.b(b10) != -1) {
                            iArr4[i19] = i20;
                            break;
                        }
                        i20++;
                    }
                }
            }
            i19++;
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
        int i21 = length3;
        int i22 = 0;
        int i23 = 0;
        boolean z15 = false;
        while (i22 < this.J.length) {
            int i24 = length2;
            int i25 = 0;
            while (true) {
                b1VarArr2 = b1VarArr4;
                if (i25 >= rVarArr.length) {
                    break;
                }
                b1VarArr5[i25] = iArr3[i25] == i22 ? b1VarArr[i25] : null;
                rVarArr3[i25] = iArr4[i25] == i22 ? rVarArr[i25] : null;
                i25++;
                b1VarArr4 = b1VarArr2;
            }
            q qVar3 = this.J[i22];
            y2.m mVar = qVar3.s;
            int i26 = i22;
            i iVar2 = qVar3.d;
            Uri[] uriArr = iVar2.e;
            p2.c cVar = iVar2.g;
            ArrayList arrayList = qVar3.y;
            qVar3.e();
            int i27 = qVar3.U;
            ?? r29 = b1VarArr5;
            int i28 = 0;
            while (i28 < length4) {
                m mVar2 = (m) r29[i28];
                if (mVar2 == null || (rVarArr3[i28] != null && zArr[i28])) {
                    i18 = i28;
                    rVarArr2 = rVarArr3;
                } else {
                    i18 = i28;
                    qVar3.U--;
                    rVarArr2 = rVarArr3;
                    if (mVar2.c != -1) {
                        q qVar4 = mVar2.b;
                        int i29 = mVar2.a;
                        qVar4.e();
                        qVar4.a0.getClass();
                        int i30 = qVar4.a0[i29];
                        e2.d.g(qVar4.d0[i30]);
                        qVar4.d0[i30] = z14;
                        mVar2.c = -1;
                    }
                    r29[i18] = 0;
                }
                i28 = i18 + 1;
                rVarArr3 = rVarArr2;
            }
            x2.r[] rVarArr4 = rVarArr3;
            boolean z16 = true;
            if (!z15) {
                if (!qVar3.i0) {
                    iArr = iArr3;
                } else if (i27 != 0) {
                    iArr = iArr3;
                }
                z10 = false;
                x2.r rVar2 = iVar2.r;
                boolean z17 = z10;
                x2.r rVar3 = rVar2;
                i10 = 0;
                while (i10 < length4) {
                    int i31 = i10;
                    x2.r rVar4 = rVarArr4[i31];
                    if (rVar4 == null) {
                        i17 = length4;
                    } else {
                        i17 = length4;
                        boolean z18 = z17;
                        int b11 = qVar3.Y.b(rVar4.b());
                        if (b11 == qVar3.b0) {
                            p2.b bVar = (p2.b) cVar.d.get(uriArr[iVar2.r.l()]);
                            if (bVar != null) {
                                bVar.v = false;
                            }
                            iVar2.r = rVar4;
                            rVar3 = rVar4;
                        }
                        if (r29[i31] == 0) {
                            qVar3.U++;
                            m mVar3 = new m(qVar3, b11);
                            r29[i31] = mVar3;
                            zArr2[i31] = z16;
                            if (qVar3.a0 != null) {
                                mVar3.a();
                                if (!z18) {
                                    p pVar = qVar3.L[qVar3.a0[b11]];
                                    z17 = (pVar.t() == 0 || pVar.G(j3, true)) ? false : true;
                                }
                            }
                        }
                        z17 = z18;
                    }
                    i10 = i31 + 1;
                    length4 = i17;
                    z16 = true;
                }
                int i32 = length4;
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
                    if (mVar.d()) {
                        if (qVar3.S) {
                            for (p pVar2 : qVar3.L) {
                                pVar2.k();
                            }
                        }
                        mVar.a();
                    } else {
                        qVar3.F();
                    }
                    iVar = iVar2;
                    i14 = i21;
                    i12 = i24;
                    b1VarArr3 = b1VarArr2;
                    i13 = i26;
                    z12 = z19;
                    iArr2 = iArr4;
                    qVarArr = qVarArr3;
                    qVar = qVar3;
                } else {
                    boolean z20 = true;
                    if (arrayList.isEmpty() || Objects.equals(rVar3, rVar2)) {
                        iVar = iVar2;
                        i11 = i21;
                        i12 = i24;
                        b1VarArr3 = b1VarArr2;
                        i13 = i26;
                        iArr2 = iArr4;
                        qVarArr = qVarArr3;
                        qVar = qVar3;
                    } else {
                        if (qVar3.i0) {
                            iVar = iVar2;
                            i11 = i21;
                            i12 = i24;
                            b1VarArr3 = b1VarArr2;
                            i13 = i26;
                            iArr2 = iArr4;
                            qVarArr = qVarArr3;
                            qVar = qVar3;
                        } else {
                            long j10 = j3 < 0 ? -j3 : 0L;
                            j z21 = qVar3.z();
                            long j11 = j10;
                            v2.l[] a2 = iVar2.a(z21, j3);
                            iVar = iVar2;
                            List list = qVar3.E;
                            i11 = i21;
                            i12 = i24;
                            b1VarArr3 = b1VarArr2;
                            i13 = i26;
                            iArr2 = iArr4;
                            qVarArr = qVarArr3;
                            qVar = qVar3;
                            x2.r rVar5 = rVar3;
                            rVar5.k(j3, j11, -9223372036854775807L, list, a2);
                            if (rVar5.l() != iVar.h.a(z21.d)) {
                                z20 = true;
                            } else {
                                z20 = true;
                            }
                        }
                        qVar.h0 = z20;
                        z11 = true;
                        z12 = true;
                        if (z12) {
                            i14 = i11;
                        } else {
                            qVar.G(j3, z11);
                            i14 = i11;
                            int i33 = 0;
                            while (i33 < i14) {
                                if (r29[i33] != 0) {
                                    zArr2[i33] = z20;
                                }
                                i33++;
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
                for (i15 = 0; i15 < i14; i15++) {
                    ?? r82 = r29[i15];
                    if (r82 != 0) {
                        arrayList2.add((m) r82);
                    }
                }
                qVar.i0 = true;
                i16 = 0;
                z13 = false;
                while (i16 < rVarArr.length) {
                    ?? r83 = r29[i16];
                    int i34 = i13;
                    if (iArr2[i16] == i34) {
                        r83.getClass();
                        r10 = b1VarArr3;
                        r10[i16] = r83;
                        identityHashMap.put(r83, Integer.valueOf(i34));
                        z13 = true;
                    } else {
                        r10 = b1VarArr3;
                        if (iArr[i16] == i34) {
                            e2.d.g(r83 == 0);
                        }
                    }
                    i16++;
                    b1VarArr3 = r10;
                    i13 = i34;
                }
                b1[] b1VarArr6 = b1VarArr3;
                int i35 = i13;
                int i36 = i23;
                if (!z13) {
                    qVarArr[i36] = qVar;
                    i23 = i36 + 1;
                    if (i36 == 0) {
                        iVar.l = true;
                        if (!z12) {
                            q[] qVarArr4 = this.K;
                            if (qVarArr4.length != 0 && qVar == qVarArr4[0]) {
                            }
                        }
                        ((SparseArray) this.v.b).clear();
                        z15 = true;
                    } else {
                        iVar.l = i35 < this.L;
                    }
                }
                i22 = i35 + 1;
                iArr4 = iArr2;
                iArr3 = iArr;
                qVarArr3 = qVarArr;
                b1VarArr5 = r29;
                rVarArr3 = rVarArr4;
                length2 = i12;
                z14 = false;
                i21 = i14;
                b1VarArr4 = b1VarArr6;
                length4 = i32;
            }
            iArr = iArr3;
            z10 = true;
            x2.r rVar22 = iVar2.r;
            boolean z172 = z10;
            x2.r rVar32 = rVar22;
            i10 = 0;
            while (i10 < length4) {
            }
            int i322 = length4;
            boolean z192 = z172;
            if (qVar3.U != 0) {
            }
            ArrayList arrayList22 = qVar.I;
            arrayList22.clear();
            while (i15 < i14) {
            }
            qVar.i0 = true;
            i16 = 0;
            z13 = false;
            while (i16 < rVarArr.length) {
            }
            b1[] b1VarArr62 = b1VarArr3;
            int i352 = i13;
            int i362 = i23;
            if (!z13) {
            }
            i22 = i352 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            qVarArr3 = qVarArr;
            b1VarArr5 = r29;
            rVarArr3 = rVarArr4;
            length2 = i12;
            z14 = false;
            i21 = i14;
            b1VarArr4 = b1VarArr62;
            length4 = i322;
        }
        System.arraycopy(b1VarArr4, 0, b1VarArr, 0, length2);
        q[] qVarArr5 = (q[]) e2.d0.S(i23, qVarArr3);
        this.K = qVarArr5;
        a1 w10 = i0.w(qVarArr5);
        AbstractList w11 = e9.q.w(w10, new t0(9));
        this.w.getClass();
        this.M = new u2.n(w10, w11);
        return j3;
    }

    @Override // u2.d0
    public final o1 r() {
        o1 o1Var = this.I;
        o1Var.getClass();
        return o1Var;
    }

    @Override // u2.d1
    public final long s() {
        return this.M.s();
    }

    @Override // u2.d0
    public final long t(long j3, p1 p1Var) {
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
                        return p1Var.a(j11, j12, (!a2.c || c11 == i0Var.size() - 1) ? j12 : ((p2.i) i0Var.get(c11 + 1)).e) + j10;
                    }
                }
            } else {
                i10++;
            }
        }
        return j3;
    }

    @Override // u2.d1
    public final void u(long j3) {
        this.M.u(j3);
    }
}
