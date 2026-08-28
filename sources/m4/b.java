package m4;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.exoplayer2.upstream.y0;
import com.google.firebase.messaging.t;
import d5.f0;
import g7.r6;
import h3.j2;
import h3.s0;
import h3.t0;
import j4.a0;
import j4.a1;
import j4.b1;
import j4.c1;
import j4.d1;
import j4.h0;
import j4.i1;
import j4.j1;
import j4.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements a0, c1, l4.g {
    public static final Pattern J = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern K = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final h0 A;
    public final a6.a B;
    public z C;
    public android.support.v4.media.c F;
    public n4.c G;
    public int H;
    public List I;
    public final int a;
    public final android.support.v4.media.c b;
    public final y0 c;
    public final l3.i d;
    public final v9.d e;
    public final t f;
    public final long h;
    public final r0 n;
    public final r r;
    public final j1 s;
    public final a[] v;
    public final za.a w;
    public final o x;
    public l4.h[] D = new l4.h[0];
    public l[] E = new l[0];
    public final IdentityHashMap y = new IdentityHashMap();

    public b(int i9, n4.c cVar, t tVar, int i10, android.support.v4.media.c cVar2, y0 y0Var, l3.i iVar, a6.a aVar, v9.d dVar, h0 h0Var, long j10, r0 r0Var, r rVar, za.a aVar2, android.support.v4.media.c cVar3, i3.l lVar) {
        int i11;
        int i12;
        int[][] iArr;
        boolean[] zArr;
        t0[] t0VarArr;
        n4.f a2;
        l3.i iVar2 = iVar;
        this.a = i9;
        this.G = cVar;
        this.f = tVar;
        this.H = i10;
        this.b = cVar2;
        this.c = y0Var;
        this.d = iVar2;
        this.B = aVar;
        this.e = dVar;
        this.A = h0Var;
        this.h = j10;
        this.n = r0Var;
        this.r = rVar;
        this.w = aVar2;
        this.x = new o(cVar, cVar3, rVar);
        l4.h[] hVarArr = this.D;
        aVar2.getClass();
        this.F = new android.support.v4.media.c(hVarArr, 19);
        n4.h b10 = cVar.b(i10);
        List list = b10.d;
        this.I = list;
        List list2 = b10.c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i13 = 0; i13 < size; i13++) {
            sparseIntArray.put(((n4.a) list2.get(i13)).a, i13);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i13));
            arrayList.add(arrayList2);
            sparseArray.put(i13, arrayList2);
        }
        for (int i14 = 0; i14 < size; i14++) {
            n4.a aVar3 = (n4.a) list2.get(i14);
            List list3 = aVar3.e;
            List list4 = aVar3.f;
            n4.f a3 = a("http://dashif.org/guidelines/trickmode", list3);
            a3 = a3 == null ? a("http://dashif.org/guidelines/trickmode", list4) : a3;
            int i15 = (a3 == null || (i15 = sparseIntArray.get(Integer.parseInt(a3.b), -1)) == -1) ? i14 : i15;
            if (i15 == i14 && (a2 = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = a2.b;
                int i16 = f0.a;
                for (String str2 : str.split(",", -1)) {
                    int i17 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i17 != -1) {
                        i15 = Math.min(i15, i17);
                    }
                }
            }
            if (i15 != i14) {
                List list5 = (List) sparseArray.get(i14);
                List list6 = (List) sparseArray.get(i15);
                list6.addAll(list5);
                sparseArray.put(i14, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] e10 = r6.e((Collection) arrayList.get(i18));
            iArr2[i18] = e10;
            Arrays.sort(e10);
        }
        boolean[] zArr2 = new boolean[size2];
        t0[][] t0VarArr2 = new t0[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr3 = iArr2[i19];
            int length = iArr3.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length) {
                    break;
                }
                List list7 = ((n4.a) list2.get(iArr3[i21])).c;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (!((n4.m) list7.get(i22)).d.isEmpty()) {
                        zArr2[i19] = true;
                        i20++;
                        break;
                    }
                }
                i21++;
            }
            int[] iArr4 = iArr2[i19];
            int length2 = iArr4.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length2) {
                    iArr = iArr2;
                    zArr = zArr2;
                    t0VarArr = new t0[0];
                    break;
                }
                int i24 = iArr4[i23];
                n4.a aVar4 = (n4.a) list2.get(i24);
                List list8 = ((n4.a) list2.get(i24)).d;
                int[] iArr5 = iArr4;
                int i25 = 0;
                while (i25 < list8.size()) {
                    n4.f fVar = (n4.f) list8.get(i25);
                    iArr = iArr2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.a)) {
                        s0 s0Var = new s0();
                        s0Var.o = "application/cea-608";
                        s0Var.a = aa.d.l(aVar4.a, ":cea608", new StringBuilder());
                        t0VarArr = h(fVar, J, new t0(s0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.a)) {
                        s0 s0Var2 = new s0();
                        s0Var2.o = "application/cea-708";
                        s0Var2.a = aa.d.l(aVar4.a, ":cea708", new StringBuilder());
                        t0VarArr = h(fVar, K, new t0(s0Var2));
                        break;
                    }
                    i25++;
                    iArr2 = iArr;
                    zArr2 = zArr;
                }
                i23++;
                iArr4 = iArr5;
            }
            t0VarArr2[i19] = t0VarArr;
            if (t0VarArr.length != 0) {
                i20++;
            }
            i19++;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i20 + size2;
        i1[] i1VarArr = new i1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((n4.a) list2.get(i28)).c);
            }
            int size4 = arrayList3.size();
            t0[] t0VarArr3 = new t0[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                t0 t0Var = ((n4.m) arrayList3.get(i29)).a;
                int i31 = i26;
                int G = iVar2.G(t0Var);
                s0 a10 = t0Var.a();
                a10.J = G;
                t0VarArr3[i29] = new t0(a10);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            n4.a aVar5 = (n4.a) list2.get(iArr7[0]);
            int i34 = aVar5.a;
            String num = i34 != -1 ? Integer.toString(i34) : j3.r0.l(i27, "unset:");
            int i35 = i33 + 1;
            if (zArr3[i27]) {
                i11 = i33 + 2;
            } else {
                i11 = i35;
                i35 = -1;
            }
            if (t0VarArr2[i27].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            List list9 = list2;
            i1VarArr[i33] = new i1(num, t0VarArr3);
            int i36 = i33;
            aVarArr[i36] = new a(aVar5.b, 0, iArr7, i33, i35, i11, -1);
            int i37 = -1;
            if (i35 != -1) {
                String j11 = ta.b.j(num, ":emsg");
                s0 s0Var3 = new s0();
                s0Var3.a = j11;
                s0Var3.o = "application/x-emsg";
                i1VarArr[i35] = new i1(j11, new t0(s0Var3));
                a aVar6 = new a(5, 1, iArr7, i36, -1, -1, -1);
                i36 = i36;
                aVarArr[i35] = aVar6;
                i37 = -1;
            }
            if (i11 != i37) {
                i1VarArr[i11] = new i1(ta.b.j(num, ":cc"), t0VarArr2[i27]);
                aVarArr[i11] = new a(3, 1, iArr7, i36, -1, -1, -1);
            }
            i27++;
            size2 = i32;
            iVar2 = iVar;
            i26 = i12;
            list2 = list9;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            n4.g gVar = (n4.g) list.get(i38);
            s0 s0Var4 = new s0();
            s0Var4.a = gVar.a();
            s0Var4.o = "application/x-emsg";
            i1VarArr[i26] = new i1(gVar.a() + ":" + i38, new t0(s0Var4));
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i38);
            i38++;
            i26++;
        }
        Pair create = Pair.create(new j1(i1VarArr), aVarArr);
        this.s = (j1) create.first;
        this.v = (a[]) create.second;
    }

    public static n4.f a(String str, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            n4.f fVar = (n4.f) list.get(i9);
            if (str.equals(fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public static t0[] h(n4.f fVar, Pattern pattern, t0 t0Var) {
        String str = fVar.b;
        if (str == null) {
            return new t0[]{t0Var};
        }
        int i9 = f0.a;
        String[] split = str.split(";", -1);
        t0[] t0VarArr = new t0[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new t0[]{t0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            s0 a2 = t0Var.a();
            a2.a = t0Var.a + ":" + parseInt;
            a2.G = parseInt;
            a2.c = matcher.group(2);
            t0VarArr[i10] = new t0(a2);
        }
        return t0VarArr;
    }

    @Override // j4.d1
    public final boolean b() {
        return this.F.b();
    }

    @Override // j4.c1
    public final void c(d1 d1Var) {
        this.C.c(this);
    }

    @Override // j4.d1
    public final long d() {
        return this.F.d();
    }

    public final int e(int i9, int[] iArr) {
        int i10 = iArr[i9];
        if (i10 != -1) {
            a[] aVarArr = this.v;
            int i11 = aVarArr[i10].e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && aVarArr[i13].c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // j4.a0
    public final void g() {
        this.n.a();
    }

    @Override // j4.a0
    public final long i(long j10) {
        l4.a aVar;
        boolean D;
        for (l4.h hVar : this.D) {
            hVar.F = j10;
            if (hVar.t()) {
                hVar.E = j10;
            } else {
                for (int i9 = 0; i9 < hVar.v.size(); i9++) {
                    aVar = (l4.a) hVar.v.get(i9);
                    long j11 = aVar.h;
                    if (j11 == j10 && aVar.v == -9223372036854775807L) {
                        break;
                    }
                    if (j11 > j10) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    a1 a1Var = hVar.x;
                    int d = aVar.d(0);
                    synchronized (a1Var) {
                        a1Var.B();
                        int i10 = a1Var.q;
                        if (d >= i10 && d <= a1Var.p + i10) {
                            a1Var.t = Long.MIN_VALUE;
                            a1Var.s = d - i10;
                            D = true;
                        }
                        D = false;
                    }
                } else {
                    D = hVar.x.D(j10, j10 < hVar.d());
                }
                if (D) {
                    hVar.G = hVar.A(hVar.x.q(), 0);
                    a1[] a1VarArr = hVar.y;
                    for (a1 a1Var2 : a1VarArr) {
                        a1Var2.D(j10, true);
                    }
                } else {
                    hVar.E = j10;
                    hVar.I = false;
                    hVar.v.clear();
                    hVar.G = 0;
                    if (hVar.r.d()) {
                        hVar.x.i();
                        for (a1 a1Var3 : hVar.y) {
                            a1Var3.i();
                        }
                        hVar.r.b();
                    } else {
                        hVar.r.c = null;
                        hVar.x.A(false);
                        for (a1 a1Var4 : hVar.y) {
                            a1Var4.A(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.E) {
            int b10 = f0.b(lVar.c, j10, true);
            lVar.h = b10;
            lVar.n = (lVar.d && b10 == lVar.c.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    @Override // j4.a0
    public final void k(long j10) {
        long j11;
        for (l4.h hVar : this.D) {
            if (!hVar.t()) {
                a1 a1Var = hVar.x;
                int i9 = a1Var.q;
                a1Var.h(j10, true);
                a1 a1Var2 = hVar.x;
                int i10 = a1Var2.q;
                if (i10 > i9) {
                    synchronized (a1Var2) {
                        j11 = a1Var2.p == 0 ? Long.MIN_VALUE : a1Var2.n[a1Var2.r];
                    }
                    int i11 = 0;
                    while (true) {
                        a1[] a1VarArr = hVar.y;
                        if (i11 >= a1VarArr.length) {
                            break;
                        }
                        a1VarArr[i11].h(j11, hVar.d[i11]);
                        i11++;
                    }
                }
                int min = Math.min(hVar.A(i10, 0), hVar.G);
                if (min > 0) {
                    f0.N(0, min, hVar.v);
                    hVar.G -= min;
                }
            }
        }
    }

    @Override // j4.d1
    public final boolean n(long j10) {
        return this.F.n(j10);
    }

    @Override // j4.a0
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // j4.a0
    public final j1 q() {
        return this.s;
    }

    @Override // j4.a0
    public final long u(long j10, j2 j2Var) {
        long j11 = j10;
        l4.h[] hVarArr = this.D;
        int length = hVarArr.length;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            l4.h hVar = hVarArr[i10];
            if (hVar.a == 2) {
                i[] iVarArr = hVar.e.h;
                int length2 = iVarArr.length;
                while (i9 < length2) {
                    i iVar = iVarArr[i9];
                    h hVar2 = iVar.d;
                    h hVar3 = iVar.d;
                    long j12 = iVar.f;
                    long j13 = iVar.e;
                    if (hVar2 != null) {
                        long q10 = hVar2.q(j11, j13) + j12;
                        long d = iVar.d(q10);
                        long z10 = hVar3.z(j13);
                        return j2Var.a(j11, d, (d >= j11 || (z10 != -1 && q10 >= ((hVar3.x() + j12) + z10) - 1)) ? d : iVar.d(q10 + 1));
                    }
                    i9++;
                    j11 = j10;
                }
            } else {
                i10++;
                j11 = j10;
            }
        }
        return j10;
    }

    @Override // j4.d1
    public final long v() {
        return this.F.v();
    }

    @Override // j4.a0
    public final void w(z zVar, long j10) {
        this.C = zVar;
        zVar.f(this);
    }

    @Override // j4.a0
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        int i9;
        boolean z10;
        int[] iArr;
        int i10;
        int[] iArr2;
        i1 i1Var;
        int i11;
        i1 i1Var2;
        int i12;
        n nVar;
        boolean z11;
        int[] iArr3 = new int[tVarArr.length];
        int i13 = 0;
        while (true) {
            i9 = -1;
            if (i13 >= tVarArr.length) {
                break;
            }
            b5.t tVar = tVarArr[i13];
            if (tVar != null) {
                iArr3[i13] = this.s.b(tVar.b());
            } else {
                iArr3[i13] = -1;
            }
            i13++;
        }
        for (int i14 = 0; i14 < tVarArr.length; i14++) {
            if (tVarArr[i14] == null || !zArr[i14]) {
                b1 b1Var = b1VarArr[i14];
                if (b1Var instanceof l4.h) {
                    ((l4.h) b1Var).B(this);
                } else if (b1Var instanceof l4.f) {
                    l4.f fVar = (l4.f) b1Var;
                    l4.h hVar = fVar.e;
                    boolean[] zArr3 = hVar.d;
                    int i15 = fVar.c;
                    d5.a.i(zArr3[i15]);
                    hVar.d[i15] = false;
                }
                b1VarArr[i14] = null;
            }
        }
        int i16 = 0;
        while (true) {
            if (i16 >= tVarArr.length) {
                break;
            }
            b1 b1Var2 = b1VarArr[i16];
            if ((b1Var2 instanceof j4.n) || (b1Var2 instanceof l4.f)) {
                int e10 = e(i16, iArr3);
                if (e10 == -1) {
                    z11 = b1VarArr[i16] instanceof j4.n;
                } else {
                    b1 b1Var3 = b1VarArr[i16];
                    z11 = (b1Var3 instanceof l4.f) && ((l4.f) b1Var3).a == b1VarArr[e10];
                }
                if (!z11) {
                    b1 b1Var4 = b1VarArr[i16];
                    if (b1Var4 instanceof l4.f) {
                        l4.f fVar2 = (l4.f) b1Var4;
                        l4.h hVar2 = fVar2.e;
                        boolean[] zArr4 = hVar2.d;
                        int i17 = fVar2.c;
                        d5.a.i(zArr4[i17]);
                        hVar2.d[i17] = false;
                    }
                    b1VarArr[i16] = null;
                }
            }
            i16++;
        }
        int i18 = 0;
        while (i18 < tVarArr.length) {
            b5.t tVar2 = tVarArr[i18];
            if (tVar2 == null) {
                i10 = i18;
                iArr2 = iArr3;
            } else {
                b1 b1Var5 = b1VarArr[i18];
                if (b1Var5 == null) {
                    zArr2[i18] = z10;
                    a aVar = this.v[iArr3[i18]];
                    int i19 = aVar.c;
                    if (i19 == 0) {
                        int i20 = aVar.f;
                        boolean z12 = i20 != i9;
                        if (z12) {
                            i1Var = this.s.a(i20);
                            i11 = 1;
                        } else {
                            i1Var = null;
                            i11 = 0;
                        }
                        int i21 = aVar.g;
                        boolean z13 = i21 != i9;
                        if (z13) {
                            i1Var2 = this.s.a(i21);
                            i11 += i1Var2.a;
                        } else {
                            i1Var2 = null;
                        }
                        t0[] t0VarArr = new t0[i11];
                        int[] iArr4 = new int[i11];
                        if (z12) {
                            t0VarArr[0] = i1Var.d[0];
                            iArr4[0] = 5;
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z13) {
                            for (int i22 = 0; i22 < i1Var2.a; i22++) {
                                t0 t0Var = i1Var2.d[i22];
                                t0VarArr[i12] = t0Var;
                                iArr4[i12] = 3;
                                arrayList.add(t0Var);
                                i12++;
                            }
                        }
                        if (this.G.d && z12) {
                            o oVar = this.x;
                            nVar = new n(oVar, oVar.a);
                        } else {
                            nVar = null;
                        }
                        android.support.v4.media.c cVar = this.b;
                        r0 r0Var = this.n;
                        n4.c cVar2 = this.G;
                        t tVar3 = this.f;
                        int i23 = this.H;
                        int[] iArr5 = aVar.a;
                        int i24 = aVar.b;
                        long j11 = this.h;
                        i10 = i18;
                        y0 y0Var = this.c;
                        com.google.android.exoplayer2.upstream.m createDataSource = ((com.google.android.exoplayer2.upstream.l) cVar.b).createDataSource();
                        if (y0Var != null) {
                            createDataSource.addTransferListener(y0Var);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr3;
                        l4.h hVar3 = new l4.h(aVar.b, iArr4, t0VarArr, new k(r0Var, cVar2, tVar3, i23, iArr5, tVar2, i24, createDataSource, j11, z12, arrayList, nVar), this, this.r, j10, this.d, this.B, this.e, this.A);
                        synchronized (this) {
                            this.y.put(hVar3, nVar2);
                        }
                        b1VarArr[i10] = hVar3;
                    } else {
                        i10 = i18;
                        iArr2 = iArr3;
                        if (i19 == 2) {
                            b1VarArr[i10] = new l((n4.g) this.I.get(aVar.d), tVar2.b().d[0], this.G.d);
                        }
                    }
                } else {
                    i10 = i18;
                    iArr2 = iArr3;
                    if (b1Var5 instanceof l4.h) {
                        ((l4.h) b1Var5).e.i = tVar2;
                    }
                }
            }
            i18 = i10 + 1;
            iArr3 = iArr2;
            i9 = -1;
            z10 = true;
        }
        int[] iArr6 = iArr3;
        int i25 = 0;
        while (i25 < tVarArr.length) {
            if (b1VarArr[i25] == null && tVarArr[i25] != null) {
                a aVar2 = this.v[iArr6[i25]];
                if (aVar2.c == 1) {
                    iArr = iArr6;
                    int e11 = e(i25, iArr);
                    if (e11 != -1) {
                        l4.h hVar4 = (l4.h) b1VarArr[e11];
                        int i26 = aVar2.b;
                        boolean[] zArr5 = hVar4.d;
                        a1[] a1VarArr = hVar4.y;
                        for (int i27 = 0; i27 < a1VarArr.length; i27++) {
                            if (hVar4.b[i27] == i26) {
                                d5.a.i(!zArr5[i27]);
                                zArr5[i27] = true;
                                a1VarArr[i27].D(j10, true);
                                b1VarArr[i25] = new l4.f(hVar4, hVar4, a1VarArr[i27], i27);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    b1VarArr[i25] = new j4.n();
                    i25++;
                    iArr6 = iArr;
                }
            }
            iArr = iArr6;
            i25++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (b1 b1Var6 : b1VarArr) {
            if (b1Var6 instanceof l4.h) {
                arrayList2.add((l4.h) b1Var6);
            } else if (b1Var6 instanceof l) {
                arrayList3.add((l) b1Var6);
            }
        }
        l4.h[] hVarArr = new l4.h[arrayList2.size()];
        this.D = hVarArr;
        arrayList2.toArray(hVarArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.E = lVarArr;
        arrayList3.toArray(lVarArr);
        za.a aVar3 = this.w;
        l4.h[] hVarArr2 = this.D;
        aVar3.getClass();
        this.F = new android.support.v4.media.c(hVarArr2, 19);
        return j10;
    }

    @Override // j4.d1
    public final void z(long j10) {
        this.F.z(j10);
    }
}
