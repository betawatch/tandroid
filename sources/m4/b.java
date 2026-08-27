package m4;

import a9.p;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b5.s;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.exoplayer2.upstream.y0;
import com.google.firebase.messaging.t;
import h3.j2;
import h3.s0;
import h3.t0;
import h7.u6;
import j4.a1;
import j4.b1;
import j4.c1;
import j4.d1;
import j4.g0;
import j4.i1;
import j4.j1;
import j4.y;
import j4.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements z, c1, l4.g {
    public static final Pattern J = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern K = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final g0 A;
    public final b6.a B;
    public y C;
    public a9.i F;
    public n4.c G;
    public int H;
    public List I;
    public final int a;
    public final k5.i b;
    public final y0 c;
    public final l3.j d;
    public final ab.a e;
    public final t f;
    public final long h;
    public final r0 n;
    public final r r;
    public final j1 s;
    public final a[] v;
    public final za.b w;
    public final o x;
    public l4.h[] D = new l4.h[0];
    public l[] E = new l[0];
    public final IdentityHashMap y = new IdentityHashMap();

    public b(int i10, n4.c cVar, t tVar, int i11, k5.i iVar, y0 y0Var, l3.j jVar, b6.a aVar, ab.a aVar2, g0 g0Var, long j10, r0 r0Var, r rVar, za.b bVar, k5.i iVar2, i3.k kVar) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        t0[] t0VarArr;
        n4.f c10;
        l3.j jVar2 = jVar;
        this.a = i10;
        this.G = cVar;
        this.f = tVar;
        this.H = i11;
        this.b = iVar;
        this.c = y0Var;
        this.d = jVar2;
        this.B = aVar;
        this.e = aVar2;
        this.A = g0Var;
        this.h = j10;
        this.n = r0Var;
        this.r = rVar;
        this.w = bVar;
        this.x = new o(cVar, iVar2, rVar);
        l4.h[] hVarArr = this.D;
        bVar.getClass();
        this.F = new a9.i(hVarArr, 21);
        n4.h b10 = cVar.b(i11);
        List list = b10.d;
        this.I = list;
        List list2 = b10.c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            sparseIntArray.put(((n4.a) list2.get(i14)).a, i14);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            n4.a aVar3 = (n4.a) list2.get(i15);
            List list3 = aVar3.e;
            List list4 = aVar3.f;
            n4.f c11 = c("http://dashif.org/guidelines/trickmode", list3);
            c11 = c11 == null ? c("http://dashif.org/guidelines/trickmode", list4) : c11;
            int i16 = (c11 == null || (i16 = sparseIntArray.get(Integer.parseInt(c11.b), -1)) == -1) ? i15 : i16;
            if (i16 == i15 && (c10 = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = c10.b;
                int i17 = d5.g0.a;
                for (String str2 : str.split(",", -1)) {
                    int i18 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i18 != -1) {
                        i16 = Math.min(i16, i18);
                    }
                }
            }
            if (i16 != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(i16);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i19 = 0; i19 < size2; i19++) {
            int[] e9 = u6.e((Collection) arrayList.get(i19));
            iArr2[i19] = e9;
            Arrays.sort(e9);
        }
        boolean[] zArr2 = new boolean[size2];
        t0[][] t0VarArr2 = new t0[size2][];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr3 = iArr2[i20];
            int length = iArr3.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length) {
                    break;
                }
                List list7 = ((n4.a) list2.get(iArr3[i22])).c;
                for (int i23 = 0; i23 < list7.size(); i23++) {
                    if (!((n4.m) list7.get(i23)).d.isEmpty()) {
                        zArr2[i20] = true;
                        i21++;
                        break;
                    }
                }
                i22++;
            }
            int[] iArr4 = iArr2[i20];
            int length2 = iArr4.length;
            int i24 = 0;
            while (true) {
                if (i24 >= length2) {
                    iArr = iArr2;
                    zArr = zArr2;
                    t0VarArr = new t0[0];
                    break;
                }
                int i25 = iArr4[i24];
                n4.a aVar4 = (n4.a) list2.get(i25);
                List list8 = ((n4.a) list2.get(i25)).d;
                int[] iArr5 = iArr4;
                int i26 = 0;
                while (i26 < list8.size()) {
                    n4.f fVar = (n4.f) list8.get(i26);
                    iArr = iArr2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.a)) {
                        s0 s0Var = new s0();
                        s0Var.o = "application/cea-608";
                        s0Var.a = p.k(aVar4.a, ":cea608", new StringBuilder());
                        t0VarArr = f(fVar, J, new t0(s0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.a)) {
                        s0 s0Var2 = new s0();
                        s0Var2.o = "application/cea-708";
                        s0Var2.a = p.k(aVar4.a, ":cea708", new StringBuilder());
                        t0VarArr = f(fVar, K, new t0(s0Var2));
                        break;
                    }
                    i26++;
                    iArr2 = iArr;
                    zArr2 = zArr;
                }
                i24++;
                iArr4 = iArr5;
            }
            t0VarArr2[i20] = t0VarArr;
            if (t0VarArr.length != 0) {
                i21++;
            }
            i20++;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i21 + size2;
        i1[] i1VarArr = new i1[size3];
        a[] aVarArr = new a[size3];
        int i27 = 0;
        int i28 = 0;
        while (i28 < size2) {
            int[] iArr7 = iArr6[i28];
            ArrayList arrayList3 = new ArrayList();
            for (int i29 : iArr7) {
                arrayList3.addAll(((n4.a) list2.get(i29)).c);
            }
            int size4 = arrayList3.size();
            t0[] t0VarArr3 = new t0[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size2;
                t0 t0Var = ((n4.m) arrayList3.get(i30)).a;
                int i32 = i27;
                int m10 = jVar2.m(t0Var);
                s0 a2 = t0Var.a();
                a2.J = m10;
                t0VarArr3[i30] = new t0(a2);
                i30++;
                size2 = i31;
                i27 = i32;
            }
            int i33 = size2;
            int i34 = i27;
            n4.a aVar5 = (n4.a) list2.get(iArr7[0]);
            int i35 = aVar5.a;
            String num = i35 != -1 ? Integer.toString(i35) : i0.a.k(i28, "unset:");
            int i36 = i34 + 1;
            if (zArr3[i28]) {
                i12 = i34 + 2;
            } else {
                i12 = i36;
                i36 = -1;
            }
            if (t0VarArr2[i28].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            List list9 = list2;
            i1VarArr[i34] = new i1(num, t0VarArr3);
            int i37 = i34;
            aVarArr[i37] = new a(aVar5.b, 0, iArr7, i34, i36, i12, -1);
            int i38 = -1;
            if (i36 != -1) {
                String l10 = s3.c.l(num, ":emsg");
                s0 s0Var3 = new s0();
                s0Var3.a = l10;
                s0Var3.o = "application/x-emsg";
                i1VarArr[i36] = new i1(l10, new t0(s0Var3));
                a aVar6 = new a(5, 1, iArr7, i37, -1, -1, -1);
                i37 = i37;
                aVarArr[i36] = aVar6;
                i38 = -1;
            }
            if (i12 != i38) {
                i1VarArr[i12] = new i1(s3.c.l(num, ":cc"), t0VarArr2[i28]);
                aVarArr[i12] = new a(3, 1, iArr7, i37, -1, -1, -1);
            }
            i28++;
            size2 = i33;
            jVar2 = jVar;
            i27 = i13;
            list2 = list9;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            n4.g gVar = (n4.g) list.get(i39);
            s0 s0Var4 = new s0();
            s0Var4.a = gVar.a();
            s0Var4.o = "application/x-emsg";
            i1VarArr[i27] = new i1(gVar.a() + ":" + i39, new t0(s0Var4));
            aVarArr[i27] = new a(5, 2, new int[0], -1, -1, -1, i39);
            i39++;
            i27++;
        }
        Pair create = Pair.create(new j1(i1VarArr), aVarArr);
        this.s = (j1) create.first;
        this.v = (a[]) create.second;
    }

    public static n4.f c(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            n4.f fVar = (n4.f) list.get(i10);
            if (str.equals(fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public static t0[] f(n4.f fVar, Pattern pattern, t0 t0Var) {
        String str = fVar.b;
        if (str == null) {
            return new t0[]{t0Var};
        }
        int i10 = d5.g0.a;
        String[] split = str.split(";", -1);
        t0[] t0VarArr = new t0[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new t0[]{t0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            s0 a2 = t0Var.a();
            a2.a = t0Var.a + ":" + parseInt;
            a2.G = parseInt;
            a2.c = matcher.group(2);
            t0VarArr[i11] = new t0(a2);
        }
        return t0VarArr;
    }

    @Override // j4.z
    public final long B(long j10, j2 j2Var) {
        long j11 = j10;
        l4.h[] hVarArr = this.D;
        int length = hVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            l4.h hVar = hVarArr[i11];
            if (hVar.a == 2) {
                i[] iVarArr = hVar.e.h;
                int length2 = iVarArr.length;
                while (i10 < length2) {
                    i iVar = iVarArr[i10];
                    h hVar2 = iVar.d;
                    h hVar3 = iVar.d;
                    long j12 = iVar.f;
                    long j13 = iVar.e;
                    if (hVar2 != null) {
                        long y10 = hVar2.y(j11, j13) + j12;
                        long d = iVar.d(y10);
                        long F = hVar3.F(j13);
                        return j2Var.a(j11, d, (d >= j11 || (F != -1 && y10 >= ((hVar3.E() + j12) + F) - 1)) ? d : iVar.d(y10 + 1));
                    }
                    i10++;
                    j11 = j10;
                }
            } else {
                i11++;
                j11 = j10;
            }
        }
        return j10;
    }

    @Override // j4.d1
    public final long D() {
        return this.F.D();
    }

    @Override // j4.z
    public final void E(y yVar, long j10) {
        this.C = yVar;
        yVar.e(this);
    }

    @Override // j4.z
    public final long F(s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        int[] iArr;
        int i11;
        int[] iArr2;
        i1 i1Var;
        int i12;
        i1 i1Var2;
        int i13;
        n nVar;
        boolean z11;
        int[] iArr3 = new int[sVarArr.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= sVarArr.length) {
                break;
            }
            s sVar = sVarArr[i14];
            if (sVar != null) {
                iArr3[i14] = this.s.b(sVar.b());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < sVarArr.length; i15++) {
            if (sVarArr[i15] == null || !zArr[i15]) {
                b1 b1Var = b1VarArr[i15];
                if (b1Var instanceof l4.h) {
                    ((l4.h) b1Var).u(this);
                } else if (b1Var instanceof l4.f) {
                    l4.f fVar = (l4.f) b1Var;
                    l4.h hVar = fVar.e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.c;
                    d5.a.i(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                b1VarArr[i15] = null;
            }
        }
        int i17 = 0;
        while (true) {
            if (i17 >= sVarArr.length) {
                break;
            }
            b1 b1Var2 = b1VarArr[i17];
            if ((b1Var2 instanceof j4.m) || (b1Var2 instanceof l4.f)) {
                int d = d(i17, iArr3);
                if (d == -1) {
                    z11 = b1VarArr[i17] instanceof j4.m;
                } else {
                    b1 b1Var3 = b1VarArr[i17];
                    z11 = (b1Var3 instanceof l4.f) && ((l4.f) b1Var3).a == b1VarArr[d];
                }
                if (!z11) {
                    b1 b1Var4 = b1VarArr[i17];
                    if (b1Var4 instanceof l4.f) {
                        l4.f fVar2 = (l4.f) b1Var4;
                        l4.h hVar2 = fVar2.e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.c;
                        d5.a.i(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    b1VarArr[i17] = null;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < sVarArr.length) {
            s sVar2 = sVarArr[i19];
            if (sVar2 == null) {
                i11 = i19;
                iArr2 = iArr3;
            } else {
                b1 b1Var5 = b1VarArr[i19];
                if (b1Var5 == null) {
                    zArr2[i19] = z10;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.c;
                    if (i20 == 0) {
                        int i21 = aVar.f;
                        boolean z12 = i21 != i10;
                        if (z12) {
                            i1Var = this.s.a(i21);
                            i12 = 1;
                        } else {
                            i1Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.g;
                        boolean z13 = i22 != i10;
                        if (z13) {
                            i1Var2 = this.s.a(i22);
                            i12 += i1Var2.a;
                        } else {
                            i1Var2 = null;
                        }
                        t0[] t0VarArr = new t0[i12];
                        int[] iArr4 = new int[i12];
                        if (z12) {
                            t0VarArr[0] = i1Var.d[0];
                            iArr4[0] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z13) {
                            for (int i23 = 0; i23 < i1Var2.a; i23++) {
                                t0 t0Var = i1Var2.d[i23];
                                t0VarArr[i13] = t0Var;
                                iArr4[i13] = 3;
                                arrayList.add(t0Var);
                                i13++;
                            }
                        }
                        if (this.G.d && z12) {
                            o oVar = this.x;
                            nVar = new n(oVar, oVar.a);
                        } else {
                            nVar = null;
                        }
                        k5.i iVar = this.b;
                        r0 r0Var = this.n;
                        n4.c cVar = this.G;
                        t tVar = this.f;
                        int i24 = this.H;
                        int[] iArr5 = aVar.a;
                        int i25 = aVar.b;
                        long j11 = this.h;
                        i11 = i19;
                        y0 y0Var = this.c;
                        com.google.android.exoplayer2.upstream.m createDataSource = ((com.google.android.exoplayer2.upstream.l) iVar.b).createDataSource();
                        if (y0Var != null) {
                            createDataSource.addTransferListener(y0Var);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr3;
                        l4.h hVar3 = new l4.h(aVar.b, iArr4, t0VarArr, new k(r0Var, cVar, tVar, i24, iArr5, sVar2, i25, createDataSource, j11, z12, arrayList, nVar), this, this.r, j10, this.d, this.B, this.e, this.A);
                        synchronized (this) {
                            this.y.put(hVar3, nVar2);
                        }
                        b1VarArr[i11] = hVar3;
                    } else {
                        i11 = i19;
                        iArr2 = iArr3;
                        if (i20 == 2) {
                            b1VarArr[i11] = new l((n4.g) this.I.get(aVar.d), sVar2.b().d[0], this.G.d);
                        }
                    }
                } else {
                    i11 = i19;
                    iArr2 = iArr3;
                    if (b1Var5 instanceof l4.h) {
                        ((l4.h) b1Var5).e.i = sVar2;
                    }
                }
            }
            i19 = i11 + 1;
            iArr3 = iArr2;
            i10 = -1;
            z10 = true;
        }
        int[] iArr6 = iArr3;
        int i26 = 0;
        while (i26 < sVarArr.length) {
            if (b1VarArr[i26] == null && sVarArr[i26] != null) {
                a aVar2 = this.v[iArr6[i26]];
                if (aVar2.c == 1) {
                    iArr = iArr6;
                    int d10 = d(i26, iArr);
                    if (d10 != -1) {
                        l4.h hVar4 = (l4.h) b1VarArr[d10];
                        int i27 = aVar2.b;
                        boolean[] zArr5 = hVar4.d;
                        a1[] a1VarArr = hVar4.y;
                        for (int i28 = 0; i28 < a1VarArr.length; i28++) {
                            if (hVar4.b[i28] == i27) {
                                d5.a.i(!zArr5[i28]);
                                zArr5[i28] = true;
                                a1VarArr[i28].D(j10, true);
                                b1VarArr[i26] = new l4.f(hVar4, hVar4, a1VarArr[i28], i28);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    b1VarArr[i26] = new j4.m();
                    i26++;
                    iArr6 = iArr;
                }
            }
            iArr = iArr6;
            i26++;
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
        za.b bVar = this.w;
        l4.h[] hVarArr2 = this.D;
        bVar.getClass();
        this.F = new a9.i(hVarArr2, 21);
        return j10;
    }

    @Override // j4.d1
    public final void I(long j10) {
        this.F.I(j10);
    }

    @Override // j4.c1
    public final void a(d1 d1Var) {
        this.C.a(this);
    }

    @Override // j4.d1
    public final boolean b() {
        return this.F.b();
    }

    public final int d(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override // j4.d1
    public final long g() {
        return this.F.g();
    }

    @Override // j4.z
    public final void m() {
        this.n.a();
    }

    @Override // j4.z
    public final long o(long j10) {
        l4.a aVar;
        boolean D;
        for (l4.h hVar : this.D) {
            hVar.F = j10;
            if (hVar.r()) {
                hVar.E = j10;
            } else {
                for (int i10 = 0; i10 < hVar.v.size(); i10++) {
                    aVar = (l4.a) hVar.v.get(i10);
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
                        int i11 = a1Var.q;
                        if (d >= i11 && d <= a1Var.p + i11) {
                            a1Var.t = Long.MIN_VALUE;
                            a1Var.s = d - i11;
                            D = true;
                        }
                        D = false;
                    }
                } else {
                    D = hVar.x.D(j10, j10 < hVar.g());
                }
                if (D) {
                    hVar.G = hVar.t(hVar.x.q(), 0);
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
            int b10 = d5.g0.b(lVar.c, j10, true);
            lVar.h = b10;
            lVar.n = (lVar.d && b10 == lVar.c.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    @Override // j4.z
    public final void p(long j10) {
        long j11;
        for (l4.h hVar : this.D) {
            if (!hVar.r()) {
                a1 a1Var = hVar.x;
                int i10 = a1Var.q;
                a1Var.h(j10, true);
                a1 a1Var2 = hVar.x;
                int i11 = a1Var2.q;
                if (i11 > i10) {
                    synchronized (a1Var2) {
                        j11 = a1Var2.p == 0 ? Long.MIN_VALUE : a1Var2.n[a1Var2.r];
                    }
                    int i12 = 0;
                    while (true) {
                        a1[] a1VarArr = hVar.y;
                        if (i12 >= a1VarArr.length) {
                            break;
                        }
                        a1VarArr[i12].h(j11, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.t(i11, 0), hVar.G);
                if (min > 0) {
                    d5.g0.N(0, min, hVar.v);
                    hVar.G -= min;
                }
            }
        }
    }

    @Override // j4.d1
    public final boolean q(long j10) {
        return this.F.q(j10);
    }

    @Override // j4.z
    public final long w() {
        return -9223372036854775807L;
    }

    @Override // j4.z
    public final j1 z() {
        return this.s;
    }
}
