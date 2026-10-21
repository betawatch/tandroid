package l2;

import android.util.Pair;
import android.util.SparseArray;
import b2.p1;
import b2.v;
import b2.v0;
import b2.w;
import e2.m0;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import g2.c0;
import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.f0;
import t7.u;
import u2.d0;
import u2.d1;
import u2.e0;
import u2.e1;
import u2.f1;
import u2.g1;
import u2.r;
import u2.s1;
import v7.b8;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class b implements e0, f1, v2.h {
    public static final Pattern R = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern S = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.k F;
    public d0 G;
    public u2.o J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final long P;
    public boolean Q;
    public final int a;
    public final a5.a b;
    public final c0 c;
    public final n2.n d;
    public final oa.d e;
    public final qi.e f;
    public final long h;
    public final y2.m n;
    public final androidx.biometric.e r;
    public final s1 s;
    public final a[] v;
    public final oa.d w;
    public final p x;
    public boolean N = true;
    public v2.i[] H = new v2.i[0];
    public m[] I = new m[0];
    public final IdentityHashMap y = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, m2.c cVar, qi.e eVar, int i11, a5.a aVar, c0 c0Var, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar2, long j10, y2.m mVar, androidx.biometric.e eVar2, oa.d dVar2, f fVar, j2.k kVar2) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        w[][] wVarArr;
        w[] wVarArr2;
        m2.f e;
        Integer num;
        n2.n nVar2 = nVar;
        this.a = i10;
        this.K = cVar;
        this.f = eVar;
        this.L = i11;
        this.b = aVar;
        this.c = c0Var;
        this.d = nVar2;
        this.F = kVar;
        this.e = dVar;
        this.E = aVar2;
        this.h = j10;
        this.n = mVar;
        this.r = eVar2;
        this.w = dVar2;
        boolean z10 = true;
        this.x = new p(cVar, fVar, eVar2);
        int i14 = 0;
        dVar2.getClass();
        l0 l0Var = n0.b;
        x1 x1Var = x1.e;
        this.J = new u2.o(x1Var, x1Var);
        m2.h b10 = cVar.b(i11);
        List list = b10.d;
        this.M = list;
        List list2 = b10.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(s.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((m2.a) list2.get(i15)).a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            m2.a aVar3 = (m2.a) list2.get(i16);
            List list3 = aVar3.e;
            List list4 = aVar3.f;
            boolean z11 = z10;
            m2.f e7 = e("http://dashif.org/guidelines/trickmode", list3);
            e7 = e7 == null ? e("http://dashif.org/guidelines/trickmode", list4) : e7;
            int intValue = (e7 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(e7.b)))) == null || !b(aVar3, (m2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (e = e("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = e.b;
                String str2 = m0.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i17 = i14; i17 < length; i17++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i17])));
                    if (num2 != null && b(aVar3, (m2.a) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i16) {
                List list5 = (List) sparseArray.get(i16);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i16, list6);
                arrayList.remove(list5);
            }
            i16++;
            z10 = z11;
            i14 = 0;
        }
        boolean z12 = z10;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] f7 = b8.f((Collection) arrayList.get(i18));
            iArr2[i18] = f7;
            Arrays.sort(f7);
        }
        boolean[] zArr2 = new boolean[size2];
        w[][] wVarArr3 = new w[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr3 = iArr2[i19];
            int length2 = iArr3.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((m2.a) list2.get(iArr3[i21])).c;
                iArr = iArr2;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (!((m2.m) list7.get(i22)).d.isEmpty()) {
                        zArr2[i19] = z12;
                        i20++;
                        break;
                    }
                }
                i21++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i19];
            int length3 = iArr4.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length3) {
                    zArr = zArr2;
                    wVarArr = wVarArr3;
                    wVarArr2 = new w[0];
                    break;
                }
                int i24 = iArr4[i23];
                m2.a aVar4 = (m2.a) list2.get(i24);
                List list8 = ((m2.a) list2.get(i24)).d;
                int[] iArr5 = iArr4;
                int i25 = 0;
                while (i25 < list8.size()) {
                    m2.f fVar2 = (m2.f) list8.get(i25);
                    zArr = zArr2;
                    wVarArr = wVarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.a)) {
                        v vVar = new v();
                        vVar.r = v0.n("application/cea-608");
                        vVar.a = a1.g.r(new StringBuilder(), aVar4.a, ":cea608");
                        wVarArr2 = k(fVar2, R, new w(vVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.a)) {
                        v vVar2 = new v();
                        vVar2.r = v0.n("application/cea-708");
                        vVar2.a = a1.g.r(new StringBuilder(), aVar4.a, ":cea708");
                        wVarArr2 = k(fVar2, S, new w(vVar2));
                        break;
                    }
                    i25++;
                    wVarArr3 = wVarArr;
                    zArr2 = zArr;
                }
                i23++;
                iArr4 = iArr5;
            }
            wVarArr[i19] = wVarArr2;
            if (wVarArr2.length != 0) {
                i20++;
            }
            i19++;
            wVarArr3 = wVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        w[][] wVarArr4 = wVarArr3;
        int size3 = list.size() + i20 + size2;
        p1[] p1VarArr = new p1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((m2.a) list2.get(i28)).c);
            }
            int size4 = arrayList3.size();
            w[] wVarArr5 = new w[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                w wVar = ((m2.m) arrayList3.get(i29)).a;
                int i31 = i26;
                v a2 = wVar.a();
                a2.S = nVar2.I0(wVar);
                wVarArr5[i29] = new w(a2);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            m2.a aVar5 = (m2.a) list2.get(iArr7[0]);
            long j11 = aVar5.a;
            String l4 = j11 != -1 ? Long.toString(j11) : i2.e.j(i27, "unset:");
            int i34 = i33 + 1;
            if (zArr3[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            if (wVarArr4[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            g(aVar, wVarArr5);
            List list9 = list2;
            p1VarArr[i33] = new p1(l4, wVarArr5);
            int i35 = aVar5.b;
            l0 l0Var2 = n0.b;
            x1 x1Var2 = x1.e;
            a aVar6 = new a(i35, 0, iArr7, i33, i34, i12, -1, x1Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar6;
            int i37 = -1;
            if (i34 != -1) {
                String u10 = r4.c.u(l4, ":emsg");
                v vVar3 = new v();
                vVar3.a = u10;
                vVar3.r = v0.n("application/x-emsg");
                vVar3.l = l4;
                w[] wVarArr6 = new w[z12];
                wVarArr6[0] = new w(vVar3);
                p1VarArr[i34] = new p1(u10, wVarArr6);
                a aVar7 = new a(5, 1, iArr8, i36, -1, -1, -1, x1Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar7;
                i37 = -1;
            }
            if (i12 != i37) {
                String u11 = r4.c.u(l4, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i36, -1, -1, -1, n0.v(wVarArr4[i27]));
                g(aVar, wVarArr4[i27]);
                int i38 = 0;
                while (true) {
                    w[] wVarArr7 = wVarArr4[i27];
                    if (i38 >= wVarArr7.length) {
                        break;
                    }
                    v a10 = wVarArr7[i38].a();
                    a10.l = l4;
                    wVarArr7[i38] = new w(a10);
                    i38++;
                }
                p1VarArr[i12] = new p1(u11, wVarArr4[i27]);
            }
            i27++;
            size2 = i32;
            nVar2 = nVar;
            i26 = i13;
            list2 = list9;
            z12 = true;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            m2.g gVar = (m2.g) list.get(i39);
            v vVar4 = new v();
            vVar4.a = gVar.a();
            vVar4.r = v0.n("application/x-emsg");
            p1VarArr[i26] = new p1(gVar.a() + ":" + i39, new w(vVar4));
            l0 l0Var3 = n0.b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i39, x1.e);
            i39++;
            i26++;
        }
        Pair create = Pair.create(new s1(p1VarArr), aVarArr);
        this.s = (s1) create.first;
        this.v = (a[]) create.second;
        this.P = Long.MIN_VALUE;
    }

    public static boolean b(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.b;
        List list = aVar.c;
        int i11 = aVar2.b;
        List list2 = aVar2.c;
        if (i10 == i11) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            w wVar = ((m2.m) list.get(0)).a;
            w wVar2 = ((m2.m) list2.get(0)).a;
            int i12 = wVar.f & (-16385);
            int i13 = wVar2.f & (-16385);
            if (Objects.equals(wVar.d, wVar2.d) && i12 == i13) {
                return true;
            }
        }
        return false;
    }

    public static m2.f e(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.f fVar = (m2.f) list.get(i10);
            if (str.equals(fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void g(a5.a aVar, w[] wVarArr) {
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            w wVar = wVarArr[i10];
            c5.f fVar = (c5.f) aVar.d;
            if (fVar.b && ((u) fVar.c).a0(wVar)) {
                v a2 = wVar.a();
                String str = wVar.k;
                a2.r = v0.n("application/x-media3-cues");
                a2.P = ((u) fVar.c).L(wVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(wVar.s);
                sb2.append(str != null ? " ".concat(str) : "");
                a2.j = sb2.toString();
                a2.w = Long.MAX_VALUE;
                wVar = new w(a2);
            }
            wVarArr[i10] = wVar;
        }
    }

    public static w[] k(m2.f fVar, Pattern pattern, w wVar) {
        String str = fVar.b;
        if (str == null) {
            return new w[]{wVar};
        }
        String str2 = m0.a;
        String[] split = str.split(";", -1);
        w[] wVarArr = new w[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new w[]{wVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            v a2 = wVar.a();
            a2.a = wVar.a + ":" + parseInt;
            a2.O = parseInt;
            a2.d = matcher.group(2);
            wVarArr[i10] = new w(a2);
        }
        return wVarArr;
    }

    @Override // u2.g1
    public final boolean c() {
        return this.J.c();
    }

    @Override // u2.g1
    public final long d() {
        return this.J.d();
    }

    public final int f(int i10, int[] iArr) {
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

    @Override // u2.f1
    public final void h(g1 g1Var) {
        this.G.h(this);
    }

    @Override // u2.e0
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
    @Override // u2.e0
    public final long j(long j10) {
        int i10;
        v2.a aVar;
        boolean J;
        int i11;
        boolean z10;
        v2.a aVar2;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        boolean z11 = false;
        int i12 = 0;
        while (i12 < length) {
            v2.i iVar = iVarArr[i12];
            d1[] d1VarArr = iVar.y;
            d1 d1Var = iVar.x;
            y2.l lVar = iVar.r;
            ?? r14 = iVar.v;
            iVar.J = j10;
            iVar.M = z11;
            iVar.N = z11;
            if (iVar.y()) {
                iVar.I = j10;
                z10 = z11;
                i10 = i12;
            } else {
                ?? r15 = z11;
                while (true) {
                    if (r15 >= r14.size()) {
                        i10 = i12;
                        break;
                    }
                    aVar = (v2.a) r14.get(r15);
                    long j11 = aVar.h;
                    i10 = i12;
                    if (j11 == j10 && aVar.v == -9223372036854775807L) {
                        break;
                    }
                    if (j11 > j10) {
                        break;
                    }
                    r15++;
                    i12 = i10;
                }
                aVar = null;
                if (aVar != null) {
                    J = d1Var.I(aVar.d(0));
                } else {
                    long d = iVar.d();
                    J = d1Var.J(j10, d == Long.MIN_VALUE || j10 < d);
                }
                if (!J || (aVar2 = iVar.L) == null) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    if (aVar2.d(0) <= d1Var.v()) {
                        J = false;
                    }
                }
                if (J) {
                    iVar.K = iVar.B(d1Var.v(), i11);
                    for (d1 d1Var2 : d1VarArr) {
                        d1Var2.J(j10, true);
                    }
                } else {
                    iVar.I = j10;
                    iVar.P = false;
                    r14.clear();
                    iVar.K = 0;
                    if (lVar.d()) {
                        d1Var.l();
                        for (d1 d1Var3 : d1VarArr) {
                            d1Var3.l();
                        }
                        lVar.b();
                    } else {
                        lVar.c = null;
                        z10 = false;
                        d1Var.G(false);
                        for (d1 d1Var4 : iVar.y) {
                            d1Var4.G(false);
                        }
                    }
                }
                z10 = false;
            }
            i12 = i10 + 1;
            z11 = z10;
        }
        m[] mVarArr = this.I;
        int length2 = mVarArr.length;
        for (?? r52 = z11; r52 < length2; r52++) {
            m mVar = mVarArr[r52];
            int b10 = m0.b(mVar.c, j10, true);
            mVar.h = b10;
            mVar.n = (mVar.d && b10 == mVar.c.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    @Override // u2.e0
    public final void l(long j10) {
        long j11;
        for (v2.i iVar : this.H) {
            if (!iVar.y()) {
                d1 d1Var = iVar.x;
                int i10 = d1Var.q;
                d1Var.k(j10, true);
                d1 d1Var2 = iVar.x;
                int i11 = d1Var2.q;
                if (i11 > i10) {
                    synchronized (d1Var2) {
                        j11 = d1Var2.p == 0 ? Long.MIN_VALUE : d1Var2.n[d1Var2.r];
                    }
                    int i12 = 0;
                    while (true) {
                        d1[] d1VarArr = iVar.y;
                        if (i12 >= d1VarArr.length) {
                            break;
                        }
                        d1VarArr[i12].k(j11, iVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(iVar.B(i11, 0), iVar.K);
                if (min > 0) {
                    m0.X(0, min, iVar.v);
                    iVar.K -= min;
                }
            }
        }
    }

    @Override // u2.e0
    public final void n(d0 d0Var, long j10) {
        this.G = d0Var;
        d0Var.a(this);
    }

    @Override // u2.e0
    public final long o() {
        if (!this.Q) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        for (v2.i iVar : this.H) {
            iVar.getClass();
            try {
                boolean z11 = iVar.N;
                iVar.N = false;
                z10 |= z11;
            } catch (Throwable th2) {
                iVar.N = false;
                throw th2;
            }
        }
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                this.Q = false;
                for (v2.i iVar2 : this.H) {
                    iVar2.O = false;
                }
            } else {
                if (iVarArr[i10].z()) {
                    break;
                }
                i10++;
            }
        }
        if (z10) {
            return this.O;
        }
        return -9223372036854775807L;
    }

    @Override // u2.g1
    public final boolean p(i2.v0 v0Var) {
        return this.J.p(v0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r14v14, types: [e9.n0] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // u2.e0
    public final long q(x2.p[] pVarArr, boolean[] zArr, e1[] e1VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        boolean z11;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        int i13;
        p1 p1Var;
        x1 x1Var;
        int i14;
        o oVar;
        int[] iArr3;
        int i15;
        boolean z12;
        boolean z13;
        x2.p[] pVarArr2 = pVarArr;
        int[] iArr4 = new int[pVarArr2.length];
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i10 = -1;
            if (i17 >= pVarArr2.length) {
                break;
            }
            x2.p pVar = pVarArr2[i17];
            if (pVar != null) {
                iArr4[i17] = this.s.b(pVar.b());
            } else {
                iArr4[i17] = -1;
            }
            i17++;
        }
        for (int i18 = 0; i18 < pVarArr2.length; i18++) {
            if (pVarArr2[i18] == null || !zArr[i18]) {
                ?? r42 = e1VarArr[i18];
                if (r42 instanceof v2.i) {
                    ((v2.i) r42).C(this);
                } else if (r42 instanceof v2.g) {
                    v2.g gVar = (v2.g) r42;
                    v2.i iVar = gVar.e;
                    boolean[] zArr3 = iVar.d;
                    int i19 = gVar.c;
                    u6.p(zArr3[i19]);
                    iVar.d[i19] = false;
                }
                e1VarArr[i18] = null;
            }
        }
        int i20 = 0;
        while (true) {
            z10 = true;
            if (i20 >= pVarArr2.length) {
                break;
            }
            ?? r43 = e1VarArr[i20];
            if ((r43 instanceof r) || (r43 instanceof v2.g)) {
                int f7 = f(i20, iArr4);
                if (f7 == -1) {
                    z13 = e1VarArr[i20] instanceof r;
                } else {
                    ?? r10 = e1VarArr[i20];
                    z13 = (r10 instanceof v2.g) && ((v2.g) r10).a == e1VarArr[f7];
                }
                if (!z13) {
                    ?? r44 = e1VarArr[i20];
                    if (r44 instanceof v2.g) {
                        v2.g gVar2 = (v2.g) r44;
                        v2.i iVar2 = gVar2.e;
                        boolean[] zArr4 = iVar2.d;
                        int i21 = gVar2.c;
                        u6.p(zArr4[i21]);
                        iVar2.d[i21] = false;
                    }
                    e1VarArr[i20] = null;
                }
            }
            i20++;
        }
        int i22 = 0;
        while (i22 < pVarArr2.length) {
            x2.p pVar2 = pVarArr2[i22];
            if (pVar2 == null) {
                iArr2 = iArr4;
                i11 = i22;
                i12 = i16;
            } else {
                ?? r11 = e1VarArr[i22];
                if (r11 == null) {
                    zArr2[i22] = z10;
                    a aVar = this.v[iArr4[i22]];
                    int i23 = aVar.c;
                    if (i23 == 0) {
                        int i24 = aVar.f;
                        ?? r30 = i24 != i10 ? z10 ? 1 : 0 : i16;
                        if (r30 != 0) {
                            p1Var = this.s.a(i24);
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i16;
                            p1Var = null;
                        }
                        int i25 = aVar.g;
                        if (i25 != i10) {
                            x1Var = this.v[i25].h;
                        } else {
                            l0 l0Var = n0.b;
                            x1Var = x1.e;
                        }
                        int size = x1Var.size() + i13;
                        int i26 = i22;
                        w[] wVarArr = new w[size];
                        int[] iArr5 = new int[size];
                        if (r30 != 0) {
                            wVarArr[i16] = p1Var.d[i16];
                            iArr5[i16] = 5;
                            i14 = z10 ? 1 : 0;
                        } else {
                            i14 = i16;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z14 = z10 ? 1 : 0;
                        for (int i27 = i16; i27 < x1Var.size(); i27++) {
                            w wVar = (w) x1Var.get(i27);
                            wVarArr[i14] = wVar;
                            iArr5[i14] = 3;
                            arrayList.add(wVar);
                            i14++;
                        }
                        if (!this.K.d || r30 == 0) {
                            oVar = null;
                        } else {
                            p pVar3 = this.x;
                            oVar = new o(pVar3, pVar3.a);
                        }
                        m2.c cVar = this.K;
                        int i28 = this.L;
                        i c10 = ((m2.m) ((m2.a) cVar.b(i28).c.get(aVar.a[i16])).c.get(i16)).c();
                        long a2 = c10 == null ? -9223372036854775807L : c10.a(c10.p(j10, cVar.d(i28)));
                        if (this.N) {
                            m2.c cVar2 = this.K;
                            int i29 = this.L;
                            int[] iArr6 = aVar.a;
                            List list = cVar2.b(i29).c;
                            k0 t10 = n0.t();
                            iArr3 = iArr4;
                            int i30 = 0;
                            for (int length = iArr6.length; i30 < length; length = length) {
                                t10.d(((m2.a) list.get(iArr6[i30])).c);
                                i30++;
                            }
                            x1 f10 = t10.f();
                            for (int i31 = 0; i31 < pVar2.length(); i31++) {
                                w wVar2 = ((m2.m) f10.get(pVar2.h(i31))).a;
                                if (!v0.a(wVar2.s, wVar2.k)) {
                                    i15 = i26;
                                    z12 = z14;
                                    break;
                                }
                            }
                        } else {
                            iArr3 = iArr4;
                        }
                        i15 = i26;
                        z12 = false;
                        a5.a aVar2 = this.b;
                        y2.m mVar = this.n;
                        m2.c cVar3 = this.K;
                        qi.e eVar = this.f;
                        int i32 = this.L;
                        int[] iArr7 = aVar.a;
                        int i33 = aVar.b;
                        i11 = i15;
                        long j11 = this.h;
                        c0 c0Var = this.c;
                        g2.h createDataSource = ((g2.g) aVar2.c).createDataSource();
                        if (c0Var != null) {
                            createDataSource.addTransferListener(c0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr3;
                        v2.i iVar3 = new v2.i(aVar.b, iArr5, wVarArr, new l((c5.f) aVar2.d, mVar, cVar3, eVar, i32, iArr7, pVar2, i33, createDataSource, j11, aVar2.b, r30, arrayList, oVar), this, this.r, j10, this.d, this.F, this.e, this.E, z12, a2, null);
                        long j12 = this.P;
                        iVar3.x.K(j12);
                        for (d1 d1Var : iVar3.y) {
                            d1Var.K(j12);
                        }
                        synchronized (this) {
                            this.y.put(iVar3, oVar2);
                        }
                        e1VarArr[i11] = iVar3;
                    } else {
                        iArr2 = iArr4;
                        i11 = i22;
                        if (i23 == 2) {
                            i12 = 0;
                            e1VarArr[i11] = new m((m2.g) this.M.get(aVar.d), pVar2.b().d[0], this.K.d);
                        }
                    }
                    i12 = 0;
                } else {
                    iArr2 = iArr4;
                    i11 = i22;
                    i12 = i16;
                    if (r11 instanceof v2.i) {
                        ((v2.i) r11).e.j = pVar2;
                    }
                }
            }
            i16 = i12;
            iArr4 = iArr2;
            i10 = -1;
            z10 = true;
            i22 = i11 + 1;
            pVarArr2 = pVarArr;
        }
        int[] iArr8 = iArr4;
        ?? r32 = i16;
        while (i16 < pVarArr.length) {
            if (e1VarArr[i16] != null || pVarArr[i16] == null) {
                iArr = iArr8;
            } else {
                iArr = iArr8;
                a aVar3 = this.v[iArr[i16]];
                if (aVar3.c == 1) {
                    int f11 = f(i16, iArr);
                    if (f11 != -1) {
                        v2.i iVar4 = (v2.i) e1VarArr[f11];
                        int i34 = aVar3.b;
                        boolean[] zArr5 = iVar4.d;
                        d1[] d1VarArr = iVar4.y;
                        for (int i35 = r32 == true ? 1 : 0; i35 < d1VarArr.length; i35++) {
                            if (iVar4.b[i35] == i34) {
                                u6.p(!zArr5[i35]);
                                zArr5[i35] = true;
                                d1VarArr[i35].J(j10, true);
                                e1VarArr[i16] = new v2.g(iVar4, iVar4, d1VarArr[i35], i35);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    e1VarArr[i16] = new r();
                    i16++;
                    iArr8 = iArr;
                }
            }
            i16++;
            iArr8 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = e1VarArr.length;
        for (int i36 = r32 == true ? 1 : 0; i36 < length2; i36++) {
            ?? r92 = e1VarArr[i36];
            if (r92 instanceof v2.i) {
                arrayList2.add((v2.i) r92);
            } else if (r92 instanceof m) {
                arrayList3.add((m) r92);
            }
        }
        v2.i[] iVarArr = new v2.i[arrayList2.size()];
        this.H = iVarArr;
        arrayList2.toArray(iVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.I = mVarArr;
        arrayList3.toArray(mVarArr);
        oa.d dVar = this.w;
        AbstractList x10 = s.x(arrayList2, new f0(3));
        dVar.getClass();
        this.J = new u2.o(arrayList2, x10);
        if (this.N) {
            this.N = r32;
            this.O = j10;
            v2.i[] iVarArr2 = this.H;
            int length3 = iVarArr2.length;
            int i37 = r32 == true ? 1 : 0;
            while (true) {
                if (i37 >= length3) {
                    z11 = r32 == true ? 1 : 0;
                    break;
                }
                if (iVarArr2[i37].z()) {
                    z11 = true;
                    break;
                }
                i37++;
            }
            if (z11) {
                this.Q = true;
                v2.i[] iVarArr3 = this.H;
                int length4 = iVarArr3.length;
                for (int i38 = r32 == true ? 1 : 0; i38 < length4; i38++) {
                    iVarArr3[i38].O = true;
                }
            }
        }
        return j10;
    }

    @Override // u2.e0
    public final s1 r() {
        return this.s;
    }

    @Override // u2.g1
    public final long s() {
        return this.J.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r3 < (((r10.u() + r8) + r11) - 1)) goto L19;
     */
    @Override // u2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long t(long j10, i2.s1 s1Var) {
        long j11;
        long j12 = j10;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            v2.i iVar = iVarArr[i11];
            if (iVar.a == 2) {
                j[] jVarArr = iVar.e.i;
                int length2 = jVarArr.length;
                while (i10 < length2) {
                    j jVar = jVarArr[i10];
                    i iVar2 = jVar.d;
                    long j13 = jVar.f;
                    i iVar3 = jVar.d;
                    if (iVar2 != null) {
                        long c10 = jVar.c();
                        if (c10 != 0) {
                            iVar3.getClass();
                            long p5 = iVar3.p(j12, jVar.e) + j13;
                            long e = jVar.e(p5);
                            if (e < j12) {
                                if (c10 != -1) {
                                    iVar3.getClass();
                                }
                                j11 = jVar.e(p5 + 1);
                                return s1Var.a(j12, e, j11);
                            }
                            j11 = e;
                            return s1Var.a(j12, e, j11);
                        }
                    }
                    i10++;
                    j12 = j10;
                }
            } else {
                i11++;
                j12 = j10;
            }
        }
        return j10;
    }

    @Override // u2.g1
    public final void u(long j10) {
        int i10;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.i iVar = iVarArr[i11];
            if (!iVar.r.d()) {
                long d = this.K.d(this.L);
                d1 d1Var = iVar.x;
                u6.p(!iVar.r.d());
                if (!iVar.y() && d != -9223372036854775807L && !iVar.v.isEmpty()) {
                    v2.a w9 = iVar.w();
                    long j11 = w9.w;
                    if (j11 == -9223372036854775807L) {
                        j11 = w9.n;
                    }
                    if (j11 > d) {
                        long s10 = d1Var.s();
                        if (s10 > d) {
                            d1Var.m(Math.max(d, d1Var.t() + 1));
                            d1[] d1VarArr = iVar.y;
                            int length2 = d1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                d1 d1Var2 = d1VarArr[i12];
                                d1Var2.m(Math.max(d, d1Var2.t() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            iVar.h.C(iVar.a, d, s10);
                            i11 = i10 + 1;
                        }
                    }
                }
            }
            i10 = i11;
            i11 = i10 + 1;
        }
        this.J.u(j10);
    }
}
