package o2;

import a8.la;
import a8.p0;
import a8.xa;
import android.util.Pair;
import android.util.SparseArray;
import b3.q;
import bg.w0;
import c8.k1;
import e2.m1;
import e2.s0;
import e2.t;
import e2.u;
import h2.l0;
import h9.f0;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import j2.c0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l2.p1;
import n2.a0;
import x2.c1;
import x2.d0;
import x2.d1;
import x2.e0;
import x2.e1;
import x2.f1;
import x2.r;
import x2.r1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class b implements e0, e1, y2.h {
    public static final Pattern S = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern T = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final xa F;
    public final q2.j G;
    public d0 H;
    public x2.n K;
    public p2.c L;
    public int M;
    public List N;
    public long P;
    public final long Q;
    public boolean R;
    public final int a;
    public final xa b;
    public final c0 c;
    public final q2.m d;
    public final qb.a e;
    public final xi.e f;
    public final long h;
    public final q n;
    public final h6.m r;
    public final r1 s;
    public final a[] w;
    public final nb.a x;
    public final p y;
    public boolean O = true;
    public y2.i[] I = new y2.i[0];
    public m[] J = new m[0];
    public final IdentityHashMap E = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i7, p2.c cVar, xi.e eVar, int i10, xa xaVar, c0 c0Var, q2.m mVar, q2.j jVar, qb.a aVar, xa xaVar2, long j3, q qVar, h6.m mVar2, nb.a aVar2, f fVar, m2.i iVar) {
        int i11;
        int i12;
        int[][] iArr;
        boolean[] zArr;
        u[][] uVarArr;
        u[] uVarArr2;
        p2.f d;
        Integer num;
        q2.m mVar3 = mVar;
        this.a = i7;
        this.L = cVar;
        this.f = eVar;
        this.M = i10;
        this.b = xaVar;
        this.c = c0Var;
        this.d = mVar3;
        this.G = jVar;
        this.e = aVar;
        this.F = xaVar2;
        this.h = j3;
        this.n = qVar;
        this.r = mVar2;
        this.x = aVar2;
        boolean z10 = true;
        this.y = new p(cVar, fVar, mVar2);
        int i13 = 0;
        aVar2.getClass();
        g0 g0Var = i0.b;
        t1 t1Var = t1.e;
        this.K = new x2.n(t1Var, t1Var);
        p2.h b10 = cVar.b(i10);
        List list = b10.d;
        this.N = list;
        List list2 = b10.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(h9.o.d(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((p2.a) list2.get(i14)).a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        int i15 = 0;
        while (i15 < size) {
            p2.a aVar3 = (p2.a) list2.get(i15);
            List list3 = aVar3.e;
            List list4 = aVar3.f;
            boolean z11 = z10;
            p2.f d2 = d("http://dashif.org/guidelines/trickmode", list3);
            d2 = d2 == null ? d("http://dashif.org/guidelines/trickmode", list4) : d2;
            int intValue = (d2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(d2.b)))) == null || !a(aVar3, (p2.a) list2.get(num.intValue()))) ? i15 : num.intValue();
            if (intValue == i15 && (d = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = d.b;
                String str2 = l0.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i16 = i13; i16 < length; i16++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i16])));
                    if (num2 != null && a(aVar3, (p2.a) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
            i15++;
            z10 = z11;
            i13 = 0;
        }
        boolean z12 = z10;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] f10 = k1.f((Collection) arrayList.get(i17));
            iArr2[i17] = f10;
            Arrays.sort(f10);
        }
        boolean[] zArr2 = new boolean[size2];
        u[][] uVarArr3 = new u[size2][];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr3 = iArr2[i18];
            int length2 = iArr3.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((p2.a) list2.get(iArr3[i20])).c;
                iArr = iArr2;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    if (!((p2.m) list7.get(i21)).d.isEmpty()) {
                        zArr2[i18] = z12;
                        i19++;
                        break;
                    }
                }
                i20++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i18];
            int length3 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length3) {
                    zArr = zArr2;
                    uVarArr = uVarArr3;
                    uVarArr2 = new u[0];
                    break;
                }
                int i23 = iArr4[i22];
                p2.a aVar4 = (p2.a) list2.get(i23);
                List list8 = ((p2.a) list2.get(i23)).d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list8.size()) {
                    p2.f fVar2 = (p2.f) list8.get(i24);
                    zArr = zArr2;
                    uVarArr = uVarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.a)) {
                        t tVar = new t();
                        tVar.r = s0.n("application/cea-608");
                        tVar.a = p0.r(new StringBuilder(), aVar4.a, ":cea608");
                        uVarArr2 = l(fVar2, S, new u(tVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.a)) {
                        t tVar2 = new t();
                        tVar2.r = s0.n("application/cea-708");
                        tVar2.a = p0.r(new StringBuilder(), aVar4.a, ":cea708");
                        uVarArr2 = l(fVar2, T, new u(tVar2));
                        break;
                    }
                    i24++;
                    uVarArr3 = uVarArr;
                    zArr2 = zArr;
                }
                i22++;
                iArr4 = iArr5;
            }
            uVarArr[i18] = uVarArr2;
            if (uVarArr2.length != 0) {
                i19++;
            }
            i18++;
            uVarArr3 = uVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        u[][] uVarArr4 = uVarArr3;
        int size3 = list.size() + i19 + size2;
        m1[] m1VarArr = new m1[size3];
        a[] aVarArr = new a[size3];
        int i25 = 0;
        int i26 = 0;
        while (i26 < size2) {
            int[] iArr7 = iArr6[i26];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr7) {
                arrayList3.addAll(((p2.a) list2.get(i27)).c);
            }
            int size4 = arrayList3.size();
            u[] uVarArr5 = new u[size4];
            int i28 = 0;
            while (i28 < size4) {
                int i29 = size2;
                u uVar = ((p2.m) arrayList3.get(i28)).a;
                int i30 = i25;
                t a10 = uVar.a();
                a10.S = mVar3.E1(uVar);
                uVarArr5[i28] = new u(a10);
                i28++;
                size2 = i29;
                i25 = i30;
            }
            int i31 = size2;
            int i32 = i25;
            p2.a aVar5 = (p2.a) list2.get(iArr7[0]);
            long j10 = aVar5.a;
            String l10 = j10 != -1 ? Long.toString(j10) : i5.c.i(i26, "unset:");
            int i33 = i32 + 1;
            if (zArr3[i26]) {
                i11 = i32 + 2;
            } else {
                i11 = i33;
                i33 = -1;
            }
            if (uVarArr4[i26].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            j(xaVar, uVarArr5);
            List list9 = list2;
            m1VarArr[i32] = new m1(l10, uVarArr5);
            int i34 = aVar5.b;
            g0 g0Var2 = i0.b;
            t1 t1Var2 = t1.e;
            a aVar6 = new a(i34, 0, iArr7, i32, i33, i11, -1, t1Var2);
            int[] iArr8 = iArr7;
            int i35 = i32;
            aVarArr[i35] = aVar6;
            int i36 = -1;
            if (i33 != -1) {
                String v = p5.c.v(l10, ":emsg");
                t tVar3 = new t();
                tVar3.a = v;
                tVar3.r = s0.n("application/x-emsg");
                tVar3.l = l10;
                u[] uVarArr6 = new u[z12];
                uVarArr6[0] = new u(tVar3);
                m1VarArr[i33] = new m1(v, uVarArr6);
                a aVar7 = new a(5, 1, iArr8, i35, -1, -1, -1, t1Var2);
                iArr8 = iArr8;
                i35 = i35;
                aVarArr[i33] = aVar7;
                i36 = -1;
            }
            if (i11 != i36) {
                String v10 = p5.c.v(l10, ":cc");
                aVarArr[i11] = new a(3, 1, iArr8, i35, -1, -1, -1, i0.r(uVarArr4[i26]));
                j(xaVar, uVarArr4[i26]);
                int i37 = 0;
                while (true) {
                    u[] uVarArr7 = uVarArr4[i26];
                    if (i37 >= uVarArr7.length) {
                        break;
                    }
                    t a11 = uVarArr7[i37].a();
                    a11.l = l10;
                    uVarArr7[i37] = new u(a11);
                    i37++;
                }
                m1VarArr[i11] = new m1(v10, uVarArr4[i26]);
            }
            i26++;
            size2 = i31;
            mVar3 = mVar;
            i25 = i12;
            list2 = list9;
            z12 = true;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            p2.g gVar = (p2.g) list.get(i38);
            t tVar4 = new t();
            tVar4.a = gVar.a();
            tVar4.r = s0.n("application/x-emsg");
            m1VarArr[i25] = new m1(gVar.a() + ":" + i38, new u(tVar4));
            g0 g0Var3 = i0.b;
            aVarArr[i25] = new a(5, 2, new int[0], -1, -1, -1, i38, t1.e);
            i38++;
            i25++;
        }
        Pair create = Pair.create(new r1(m1VarArr), aVarArr);
        this.s = (r1) create.first;
        this.w = (a[]) create.second;
        this.Q = Long.MIN_VALUE;
    }

    public static boolean a(p2.a aVar, p2.a aVar2) {
        int i7 = aVar.b;
        List list = aVar.c;
        int i10 = aVar2.b;
        List list2 = aVar2.c;
        if (i7 == i10) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            u uVar = ((p2.m) list.get(0)).a;
            u uVar2 = ((p2.m) list2.get(0)).a;
            int i11 = uVar.f & (-16385);
            int i12 = uVar2.f & (-16385);
            if (Objects.equals(uVar.d, uVar2.d) && i11 == i12) {
                return true;
            }
        }
        return false;
    }

    public static p2.f d(String str, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            p2.f fVar = (p2.f) list.get(i7);
            if (str.equals(fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void j(xa xaVar, u[] uVarArr) {
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            u uVar = uVarArr[i7];
            w0 w0Var = (w0) xaVar.d;
            if (w0Var.a && ((nb.a) w0Var.c).H(uVar)) {
                t a10 = uVar.a();
                String str = uVar.k;
                a10.r = s0.n("application/x-media3-cues");
                a10.P = ((nb.a) w0Var.c).O(uVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uVar.s);
                sb2.append(str != null ? " ".concat(str) : "");
                a10.j = sb2.toString();
                a10.w = Long.MAX_VALUE;
                uVar = new u(a10);
            }
            uVarArr[i7] = uVar;
        }
    }

    public static u[] l(p2.f fVar, Pattern pattern, u uVar) {
        String str = fVar.b;
        if (str == null) {
            return new u[]{uVar};
        }
        String str2 = l0.a;
        String[] split = str.split(";", -1);
        u[] uVarArr = new u[split.length];
        for (int i7 = 0; i7 < split.length; i7++) {
            Matcher matcher = pattern.matcher(split[i7]);
            if (!matcher.matches()) {
                return new u[]{uVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            t a10 = uVar.a();
            a10.a = uVar.a + ":" + parseInt;
            a10.O = parseInt;
            a10.d = matcher.group(2);
            uVarArr[i7] = new u(a10);
        }
        return uVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v15, types: [h9.i0] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // x2.e0
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        int i7;
        boolean z10;
        boolean z11;
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11;
        int i12;
        m1 m1Var;
        t1 t1Var;
        int i13;
        o oVar;
        u[] uVarArr2;
        long a10;
        boolean z12;
        boolean z13;
        a3.u[] uVarArr3 = uVarArr;
        int[] iArr3 = new int[uVarArr3.length];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i7 = -1;
            if (i15 >= uVarArr3.length) {
                break;
            }
            a3.u uVar = uVarArr3[i15];
            if (uVar != null) {
                iArr3[i15] = this.s.b(uVar.c());
            } else {
                iArr3[i15] = -1;
            }
            i15++;
        }
        for (int i16 = 0; i16 < uVarArr3.length; i16++) {
            if (uVarArr3[i16] == null || !zArr[i16]) {
                ?? r42 = d1VarArr[i16];
                if (r42 instanceof y2.i) {
                    ((y2.i) r42).D(this);
                } else if (r42 instanceof y2.g) {
                    y2.g gVar = (y2.g) r42;
                    y2.i iVar = gVar.e;
                    boolean[] zArr3 = iVar.d;
                    int i17 = gVar.c;
                    la.p(zArr3[i17]);
                    iVar.d[i17] = false;
                }
                d1VarArr[i16] = null;
            }
        }
        int i18 = 0;
        while (true) {
            z10 = true;
            if (i18 >= uVarArr3.length) {
                break;
            }
            ?? r43 = d1VarArr[i18];
            if ((r43 instanceof r) || (r43 instanceof y2.g)) {
                int h = h(iArr3, i18);
                if (h == -1) {
                    z13 = d1VarArr[i18] instanceof r;
                } else {
                    ?? r10 = d1VarArr[i18];
                    z13 = (r10 instanceof y2.g) && ((y2.g) r10).a == d1VarArr[h];
                }
                if (!z13) {
                    ?? r44 = d1VarArr[i18];
                    if (r44 instanceof y2.g) {
                        y2.g gVar2 = (y2.g) r44;
                        y2.i iVar2 = gVar2.e;
                        boolean[] zArr4 = iVar2.d;
                        int i19 = gVar2.c;
                        la.p(zArr4[i19]);
                        iVar2.d[i19] = false;
                    }
                    d1VarArr[i18] = null;
                }
            }
            i18++;
        }
        int i20 = 0;
        while (i20 < uVarArr3.length) {
            a3.u uVar2 = uVarArr3[i20];
            if (uVar2 == null) {
                iArr2 = iArr3;
                i10 = i14;
                i11 = i20;
            } else {
                ?? r102 = d1VarArr[i20];
                if (r102 == null) {
                    zArr2[i20] = z10;
                    a aVar = this.w[iArr3[i20]];
                    int i21 = aVar.c;
                    if (i21 == 0) {
                        int i22 = aVar.f;
                        ?? r30 = i22 != i7 ? z10 ? 1 : 0 : i14;
                        if (r30 != 0) {
                            m1Var = this.s.a(i22);
                            i12 = z10 ? 1 : 0;
                        } else {
                            i12 = i14;
                            m1Var = null;
                        }
                        int i23 = aVar.g;
                        if (i23 != i7) {
                            t1Var = this.w[i23].h;
                        } else {
                            g0 g0Var = i0.b;
                            t1Var = t1.e;
                        }
                        int size = t1Var.size() + i12;
                        int i24 = i20;
                        u[] uVarArr4 = new u[size];
                        int[] iArr4 = new int[size];
                        if (r30 != 0) {
                            uVarArr4[i14] = m1Var.d[i14];
                            iArr4[i14] = 5;
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i14;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z14 = z10 ? 1 : 0;
                        for (int i25 = i14; i25 < t1Var.size(); i25++) {
                            u uVar3 = (u) t1Var.get(i25);
                            uVarArr4[i13] = uVar3;
                            iArr4[i13] = 3;
                            arrayList.add(uVar3);
                            i13++;
                        }
                        if (!this.L.d || r30 == 0) {
                            oVar = null;
                        } else {
                            p pVar = this.y;
                            oVar = new o(pVar, pVar.a);
                        }
                        p2.c cVar = this.L;
                        int i26 = this.M;
                        i c10 = ((p2.m) ((p2.a) cVar.b(i26).c.get(aVar.a[i14])).c.get(i14)).c();
                        if (c10 == null) {
                            a10 = -9223372036854775807L;
                            uVarArr2 = uVarArr4;
                        } else {
                            uVarArr2 = uVarArr4;
                            a10 = c10.a(c10.o(j3, cVar.d(i26)));
                        }
                        long j10 = a10;
                        if (this.O) {
                            p2.c cVar2 = this.L;
                            int i27 = this.M;
                            int[] iArr5 = aVar.a;
                            List list = cVar2.b(i27).c;
                            f0 p10 = i0.p();
                            int length = iArr5.length;
                            int i28 = 0;
                            while (i28 < length) {
                                int i29 = i28;
                                p10.d(((p2.a) list.get(iArr5[i29])).c);
                                i28 = i29 + 1;
                            }
                            t1 f10 = p10.f();
                            for (int i30 = 0; i30 < uVar2.length(); i30++) {
                                u uVar4 = ((p2.m) f10.get(uVar2.i(i30))).a;
                                if (!s0.a(uVar4.s, uVar4.k)) {
                                    z12 = z14;
                                    break;
                                }
                            }
                        }
                        z12 = false;
                        xa xaVar = this.b;
                        q qVar = this.n;
                        p2.c cVar3 = this.L;
                        xi.e eVar = this.f;
                        int[] iArr6 = iArr3;
                        int i31 = this.M;
                        int[] iArr7 = aVar.a;
                        int i32 = aVar.b;
                        long j11 = this.h;
                        c0 c0Var = this.c;
                        j2.h createDataSource = ((j2.g) xaVar.c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr6;
                        i11 = i24;
                        y2.i iVar3 = new y2.i(aVar.b, iArr4, uVarArr2, new l((w0) xaVar.d, qVar, cVar3, eVar, i31, iArr7, uVar2, i32, createDataSource, j11, xaVar.b, r30, arrayList, oVar), this, this.r, j3, this.d, this.G, this.e, this.F, z12, j10, null);
                        long j12 = this.Q;
                        iVar3.y.K(j12);
                        for (c1 c1Var : iVar3.E) {
                            c1Var.K(j12);
                        }
                        synchronized (this) {
                            this.E.put(iVar3, oVar2);
                        }
                        d1VarArr[i11] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i20;
                        if (i21 == 2) {
                            i10 = 0;
                            d1VarArr[i11] = new m((p2.g) this.N.get(aVar.d), uVar2.c().d[0], this.L.d);
                        }
                    }
                    i10 = 0;
                } else {
                    iArr2 = iArr3;
                    i10 = i14;
                    i11 = i20;
                    if (r102 instanceof y2.i) {
                        ((y2.i) r102).e.j = uVar2;
                    }
                }
            }
            i20 = i11 + 1;
            uVarArr3 = uVarArr;
            i14 = i10;
            iArr3 = iArr2;
            i7 = -1;
            z10 = true;
        }
        int[] iArr8 = iArr3;
        ?? r13 = i14;
        while (i14 < uVarArr.length) {
            if (d1VarArr[i14] != null || uVarArr[i14] == null) {
                iArr = iArr8;
            } else {
                iArr = iArr8;
                a aVar2 = this.w[iArr[i14]];
                if (aVar2.c == 1) {
                    int h7 = h(iArr, i14);
                    if (h7 != -1) {
                        y2.i iVar4 = (y2.i) d1VarArr[h7];
                        int i33 = aVar2.b;
                        boolean[] zArr5 = iVar4.d;
                        c1[] c1VarArr = iVar4.E;
                        for (int i34 = r13 == true ? 1 : 0; i34 < c1VarArr.length; i34++) {
                            if (iVar4.b[i34] == i33) {
                                la.p(!zArr5[i34]);
                                zArr5[i34] = true;
                                c1VarArr[i34].J(j3, true);
                                d1VarArr[i14] = new y2.g(iVar4, iVar4, c1VarArr[i34], i34);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    d1VarArr[i14] = new r();
                    i14++;
                    iArr8 = iArr;
                }
            }
            i14++;
            iArr8 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = d1VarArr.length;
        for (int i35 = r13 == true ? 1 : 0; i35 < length2; i35++) {
            ?? r62 = d1VarArr[i35];
            if (r62 instanceof y2.i) {
                arrayList2.add((y2.i) r62);
            } else if (r62 instanceof m) {
                arrayList3.add((m) r62);
            }
        }
        y2.i[] iVarArr = new y2.i[arrayList2.size()];
        this.I = iVarArr;
        arrayList2.toArray(iVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.J = mVarArr;
        arrayList3.toArray(mVarArr);
        nb.a aVar3 = this.x;
        AbstractList y10 = h9.o.y(arrayList2, new a0(7));
        aVar3.getClass();
        this.K = new x2.n(arrayList2, y10);
        if (this.O) {
            this.O = r13;
            this.P = j3;
            y2.i[] iVarArr2 = this.I;
            int length3 = iVarArr2.length;
            int i36 = r13 == true ? 1 : 0;
            while (true) {
                if (i36 >= length3) {
                    z11 = r13 == true ? 1 : 0;
                    break;
                }
                if (iVarArr2[i36].A()) {
                    z11 = true;
                    break;
                }
                i36++;
            }
            if (z11) {
                this.R = true;
                y2.i[] iVarArr3 = this.I;
                int length4 = iVarArr3.length;
                for (int i37 = r13 == true ? 1 : 0; i37 < length4; i37++) {
                    iVarArr3[i37].P = true;
                }
            }
        }
        return j3;
    }

    @Override // x2.f1
    public final boolean c(l2.s0 s0Var) {
        return this.K.c(s0Var);
    }

    @Override // x2.e1
    public final void c0(f1 f1Var) {
        this.H.c0(this);
    }

    @Override // x2.f1
    public final long e() {
        return this.K.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r3 < (((r10.v() + r8) + r11) - 1)) goto L19;
     */
    @Override // x2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(long j3, p1 p1Var) {
        long j10;
        long j11 = j3;
        y2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            y2.i iVar = iVarArr[i10];
            if (iVar.a == 2) {
                j[] jVarArr = iVar.e.i;
                int length2 = jVarArr.length;
                while (i7 < length2) {
                    j jVar = jVarArr[i7];
                    i iVar2 = jVar.d;
                    long j12 = jVar.f;
                    i iVar3 = jVar.d;
                    if (iVar2 != null) {
                        long c10 = jVar.c();
                        if (c10 != 0) {
                            iVar3.getClass();
                            long o4 = iVar3.o(j11, jVar.e) + j12;
                            long e10 = jVar.e(o4);
                            if (e10 < j11) {
                                if (c10 != -1) {
                                    iVar3.getClass();
                                }
                                j10 = jVar.e(o4 + 1);
                                return p1Var.a(j11, e10, j10);
                            }
                            j10 = e10;
                            return p1Var.a(j11, e10, j10);
                        }
                    }
                    i7++;
                    j11 = j3;
                }
            } else {
                i10++;
                j11 = j3;
            }
        }
        return j3;
    }

    @Override // x2.f1
    public final boolean g() {
        return this.K.g();
    }

    public final int h(int[] iArr, int i7) {
        int i10 = iArr[i7];
        if (i10 != -1) {
            a[] aVarArr = this.w;
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

    @Override // x2.e0
    public final void i() {
        this.n.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // x2.e0
    public final long k(long j3) {
        int i7;
        y2.a aVar;
        boolean J;
        int i10;
        boolean z10;
        y2.a aVar2;
        y2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        boolean z11 = false;
        int i11 = 0;
        while (i11 < length) {
            y2.i iVar = iVarArr[i11];
            c1[] c1VarArr = iVar.E;
            c1 c1Var = iVar.y;
            b3.p pVar = iVar.r;
            ?? r14 = iVar.w;
            iVar.K = j3;
            iVar.N = z11;
            iVar.O = z11;
            if (iVar.y()) {
                iVar.J = j3;
                z10 = z11;
                i7 = i11;
            } else {
                ?? r15 = z11;
                while (true) {
                    if (r15 >= r14.size()) {
                        i7 = i11;
                        break;
                    }
                    aVar = (y2.a) r14.get(r15);
                    long j10 = aVar.h;
                    i7 = i11;
                    if (j10 == j3 && aVar.w == -9223372036854775807L) {
                        break;
                    }
                    if (j10 > j3) {
                        break;
                    }
                    r15++;
                    i11 = i7;
                }
                aVar = null;
                if (aVar != null) {
                    J = c1Var.I(aVar.d(0));
                } else {
                    long e10 = iVar.e();
                    J = c1Var.J(j3, e10 == Long.MIN_VALUE || j3 < e10);
                }
                if (!J || (aVar2 = iVar.M) == null) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    if (aVar2.d(0) <= c1Var.v()) {
                        J = false;
                    }
                }
                if (J) {
                    iVar.L = iVar.C(c1Var.v(), i10);
                    for (c1 c1Var2 : c1VarArr) {
                        c1Var2.J(j3, true);
                    }
                } else {
                    iVar.J = j3;
                    iVar.Q = false;
                    r14.clear();
                    iVar.L = 0;
                    if (pVar.d()) {
                        c1Var.l();
                        for (c1 c1Var3 : c1VarArr) {
                            c1Var3.l();
                        }
                        pVar.b();
                    } else {
                        pVar.c = null;
                        z10 = false;
                        c1Var.G(false);
                        for (c1 c1Var4 : iVar.E) {
                            c1Var4.G(false);
                        }
                    }
                }
                z10 = false;
            }
            i11 = i7 + 1;
            z11 = z10;
        }
        m[] mVarArr = this.J;
        int length2 = mVarArr.length;
        for (?? r52 = z11; r52 < length2; r52++) {
            m mVar = mVarArr[r52];
            int b10 = l0.b(mVar.c, j3, true);
            mVar.h = b10;
            mVar.n = (mVar.d && b10 == mVar.c.length) ? j3 : -9223372036854775807L;
        }
        return j3;
    }

    @Override // x2.e0
    public final void n(long j3) {
        long j10;
        for (y2.i iVar : this.I) {
            if (!iVar.y()) {
                c1 c1Var = iVar.y;
                int i7 = c1Var.q;
                c1Var.k(j3, true);
                c1 c1Var2 = iVar.y;
                int i10 = c1Var2.q;
                if (i10 > i7) {
                    synchronized (c1Var2) {
                        j10 = c1Var2.p == 0 ? Long.MIN_VALUE : c1Var2.n[c1Var2.r];
                    }
                    int i11 = 0;
                    while (true) {
                        c1[] c1VarArr = iVar.E;
                        if (i11 >= c1VarArr.length) {
                            break;
                        }
                        c1VarArr[i11].k(j10, iVar.d[i11]);
                        i11++;
                    }
                }
                int min = Math.min(iVar.C(i10, 0), iVar.L);
                if (min > 0) {
                    l0.X(0, min, iVar.w);
                    iVar.L -= min;
                }
            }
        }
    }

    @Override // x2.e0
    public final long o() {
        if (!this.R) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        for (y2.i iVar : this.I) {
            iVar.getClass();
            try {
                boolean z11 = iVar.O;
                iVar.O = false;
                z10 |= z11;
            } catch (Throwable th2) {
                iVar.O = false;
                throw th2;
            }
        }
        y2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                this.R = false;
                for (y2.i iVar2 : this.I) {
                    iVar2.P = false;
                }
            } else {
                if (iVarArr[i7].A()) {
                    break;
                }
                i7++;
            }
        }
        if (z10) {
            return this.P;
        }
        return -9223372036854775807L;
    }

    @Override // x2.e0
    public final r1 q() {
        return this.s;
    }

    @Override // x2.f1
    public final long r() {
        return this.K.r();
    }

    @Override // x2.e0
    public final void t(d0 d0Var, long j3) {
        this.H = d0Var;
        d0Var.m(this);
    }

    @Override // x2.f1
    public final void u(long j3) {
        int i7;
        y2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            y2.i iVar = iVarArr[i10];
            if (!iVar.r.d()) {
                long d = this.L.d(this.M);
                c1 c1Var = iVar.y;
                la.p(!iVar.r.d());
                if (!iVar.y() && d != -9223372036854775807L && !iVar.w.isEmpty()) {
                    y2.a w10 = iVar.w();
                    long j10 = w10.x;
                    if (j10 == -9223372036854775807L) {
                        j10 = w10.n;
                    }
                    if (j10 > d) {
                        long s5 = c1Var.s();
                        if (s5 > d) {
                            c1Var.m(Math.max(d, c1Var.t() + 1));
                            c1[] c1VarArr = iVar.E;
                            int length2 = c1VarArr.length;
                            int i11 = 0;
                            while (i11 < length2) {
                                c1 c1Var2 = c1VarArr[i11];
                                c1Var2.m(Math.max(d, c1Var2.t() + 1));
                                i11++;
                                i10 = i10;
                            }
                            i7 = i10;
                            iVar.h.B(d, iVar.a, s5);
                            i10 = i7 + 1;
                        }
                    }
                }
            }
            i7 = i10;
            i10 = i7 + 1;
        }
        this.K.u(j3);
    }
}
