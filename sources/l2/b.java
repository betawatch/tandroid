package l2;

import android.support.v4.media.session.a0;
import android.util.Pair;
import android.util.SparseArray;
import b2.p1;
import b2.v0;
import b2.w;
import b2.x;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import i2.v1;
import i2.w0;
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
import t7.u;
import u2.c1;
import u2.d0;
import u2.d1;
import u2.e0;
import u2.e1;
import u2.f1;
import u2.r;
import u2.r1;
import v7.c8;
import v7.t6;
import x2.q;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements e0, e1, v2.h {
    public static final Pattern R = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern S = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final a5.a E;
    public final n2.j F;
    public d0 G;
    public u2.n J;
    public m2.c K;
    public int L;
    public List M;
    public long O;
    public final long P;
    public boolean Q;
    public final int a;
    public final a5.a b;
    public final g2.d0 c;
    public final n2.m d;
    public final hb.a e;
    public final xa.n f;
    public final long h;
    public final y2.m n;
    public final a0 r;
    public final r1 s;
    public final a[] w;
    public final kb.a x;
    public final p y;
    public boolean N = true;
    public v2.i[] H = new v2.i[0];
    public m[] I = new m[0];
    public final IdentityHashMap D = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, m2.c cVar, xa.n nVar, int i11, a5.a aVar, g2.d0 d0Var, n2.m mVar, n2.j jVar, hb.a aVar2, a5.a aVar3, long j10, y2.m mVar2, a0 a0Var, kb.a aVar4, f fVar, j2.l lVar) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        x[][] xVarArr;
        x[] xVarArr2;
        m2.f b10;
        Integer num;
        n2.m mVar3 = mVar;
        this.a = i10;
        this.K = cVar;
        this.f = nVar;
        this.L = i11;
        this.b = aVar;
        this.c = d0Var;
        this.d = mVar3;
        this.F = jVar;
        this.e = aVar2;
        this.E = aVar3;
        this.h = j10;
        this.n = mVar2;
        this.r = a0Var;
        this.x = aVar4;
        boolean z10 = true;
        this.y = new p(cVar, fVar, a0Var);
        int i14 = 0;
        aVar4.getClass();
        l0 l0Var = n0.b;
        x1 x1Var = x1.e;
        this.J = new u2.n(x1Var, x1Var);
        m2.h b11 = cVar.b(i11);
        List list = b11.d;
        this.M = list;
        List list2 = b11.c;
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
            m2.a aVar5 = (m2.a) list2.get(i16);
            List list3 = aVar5.e;
            List list4 = aVar5.f;
            boolean z11 = z10;
            m2.f b12 = b("http://dashif.org/guidelines/trickmode", list3);
            b12 = b12 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b12;
            int intValue = (b12 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(b12.b)))) == null || !a(aVar5, (m2.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (intValue == i16 && (b10 = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = b10.b;
                String str2 = e2.l0.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i17 = i14; i17 < length; i17++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i17])));
                    if (num2 != null && a(aVar5, (m2.a) list2.get(num2.intValue()))) {
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
            int[] f7 = c8.f((Collection) arrayList.get(i18));
            iArr2[i18] = f7;
            Arrays.sort(f7);
        }
        boolean[] zArr2 = new boolean[size2];
        x[][] xVarArr3 = new x[size2][];
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
                    xVarArr = xVarArr3;
                    xVarArr2 = new x[0];
                    break;
                }
                int i24 = iArr4[i23];
                m2.a aVar6 = (m2.a) list2.get(i24);
                List list8 = ((m2.a) list2.get(i24)).d;
                int[] iArr5 = iArr4;
                int i25 = 0;
                while (i25 < list8.size()) {
                    m2.f fVar2 = (m2.f) list8.get(i25);
                    zArr = zArr2;
                    xVarArr = xVarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.a)) {
                        w wVar = new w();
                        wVar.r = v0.n("application/cea-608");
                        wVar.a = a1.g.q(new StringBuilder(), aVar6.a, ":cea608");
                        xVarArr2 = n(fVar2, R, new x(wVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.a)) {
                        w wVar2 = new w();
                        wVar2.r = v0.n("application/cea-708");
                        wVar2.a = a1.g.q(new StringBuilder(), aVar6.a, ":cea708");
                        xVarArr2 = n(fVar2, S, new x(wVar2));
                        break;
                    }
                    i25++;
                    xVarArr3 = xVarArr;
                    zArr2 = zArr;
                }
                i23++;
                iArr4 = iArr5;
            }
            xVarArr[i19] = xVarArr2;
            if (xVarArr2.length != 0) {
                i20++;
            }
            i19++;
            xVarArr3 = xVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        x[][] xVarArr4 = xVarArr3;
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
            x[] xVarArr5 = new x[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                x xVar = ((m2.m) arrayList3.get(i29)).a;
                int i31 = i26;
                w a2 = xVar.a();
                a2.S = mVar3.t0(xVar);
                xVarArr5[i29] = new x(a2);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            m2.a aVar7 = (m2.a) list2.get(iArr7[0]);
            long j11 = aVar7.a;
            String l4 = j11 != -1 ? Long.toString(j11) : i0.a.i(i27, "unset:");
            int i34 = i33 + 1;
            if (zArr3[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            if (xVarArr4[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            l(aVar, xVarArr5);
            List list9 = list2;
            p1VarArr[i33] = new p1(l4, xVarArr5);
            int i35 = aVar7.b;
            l0 l0Var2 = n0.b;
            x1 x1Var2 = x1.e;
            a aVar8 = new a(i35, 0, iArr7, i33, i34, i12, -1, x1Var2);
            int[] iArr8 = iArr7;
            int i36 = i33;
            aVarArr[i36] = aVar8;
            int i37 = -1;
            if (i34 != -1) {
                String A = sc.e.A(l4, ":emsg");
                w wVar3 = new w();
                wVar3.a = A;
                wVar3.r = v0.n("application/x-emsg");
                wVar3.l = l4;
                x[] xVarArr6 = new x[z12];
                xVarArr6[0] = new x(wVar3);
                p1VarArr[i34] = new p1(A, xVarArr6);
                a aVar9 = new a(5, 1, iArr8, i36, -1, -1, -1, x1Var2);
                iArr8 = iArr8;
                i36 = i36;
                aVarArr[i34] = aVar9;
                i37 = -1;
            }
            if (i12 != i37) {
                String A2 = sc.e.A(l4, ":cc");
                aVarArr[i12] = new a(3, 1, iArr8, i36, -1, -1, -1, n0.v(xVarArr4[i27]));
                l(aVar, xVarArr4[i27]);
                int i38 = 0;
                while (true) {
                    x[] xVarArr7 = xVarArr4[i27];
                    if (i38 >= xVarArr7.length) {
                        break;
                    }
                    w a10 = xVarArr7[i38].a();
                    a10.l = l4;
                    xVarArr7[i38] = new x(a10);
                    i38++;
                }
                p1VarArr[i12] = new p1(A2, xVarArr4[i27]);
            }
            i27++;
            size2 = i32;
            mVar3 = mVar;
            i26 = i13;
            list2 = list9;
            z12 = true;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            m2.g gVar = (m2.g) list.get(i39);
            w wVar4 = new w();
            wVar4.a = gVar.a();
            wVar4.r = v0.n("application/x-emsg");
            p1VarArr[i26] = new p1(gVar.a() + ":" + i39, new x(wVar4));
            l0 l0Var3 = n0.b;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i39, x1.e);
            i39++;
            i26++;
        }
        Pair create = Pair.create(new r1(p1VarArr), aVarArr);
        this.s = (r1) create.first;
        this.w = (a[]) create.second;
        this.P = Long.MIN_VALUE;
    }

    public static boolean a(m2.a aVar, m2.a aVar2) {
        int i10 = aVar.b;
        List list = aVar.c;
        int i11 = aVar2.b;
        List list2 = aVar2.c;
        if (i10 == i11) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            x xVar = ((m2.m) list.get(0)).a;
            x xVar2 = ((m2.m) list2.get(0)).a;
            int i12 = xVar.f & (-16385);
            int i13 = xVar2.f & (-16385);
            if (Objects.equals(xVar.d, xVar2.d) && i12 == i13) {
                return true;
            }
        }
        return false;
    }

    public static m2.f b(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.f fVar = (m2.f) list.get(i10);
            if (str.equals(fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void l(a5.a aVar, x[] xVarArr) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            x xVar = xVarArr[i10];
            c5.e eVar = (c5.e) aVar.d;
            if (eVar.b && ((u) eVar.c).F(xVar)) {
                w a2 = xVar.a();
                String str = xVar.k;
                a2.r = v0.n("application/x-media3-cues");
                a2.P = ((u) eVar.c).y(xVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(xVar.s);
                sb2.append(str != null ? " ".concat(str) : "");
                a2.j = sb2.toString();
                a2.w = Long.MAX_VALUE;
                xVar = new x(a2);
            }
            xVarArr[i10] = xVar;
        }
    }

    public static x[] n(m2.f fVar, Pattern pattern, x xVar) {
        String str = fVar.b;
        if (str == null) {
            return new x[]{xVar};
        }
        String str2 = e2.l0.a;
        String[] split = str.split(";", -1);
        x[] xVarArr = new x[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new x[]{xVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            w a2 = xVar.a();
            a2.a = xVar.a + ":" + parseInt;
            a2.O = parseInt;
            a2.d = matcher.group(2);
            xVarArr[i10] = new x(a2);
        }
        return xVarArr;
    }

    @Override // u2.f1
    public final long c() {
        return this.J.c();
    }

    @Override // u2.f1
    public final boolean d() {
        return this.J.d();
    }

    @Override // u2.e0
    public final void f() {
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
    public final long g(long j10) {
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
            c1[] c1VarArr = iVar.D;
            c1 c1Var = iVar.y;
            y2.l lVar = iVar.r;
            ?? r14 = iVar.w;
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
                    if (j11 == j10 && aVar.w == -9223372036854775807L) {
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
                    J = c1Var.I(aVar.d(0));
                } else {
                    long c10 = iVar.c();
                    J = c1Var.J(j10, c10 == Long.MIN_VALUE || j10 < c10);
                }
                if (!J || (aVar2 = iVar.L) == null) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    if (aVar2.d(0) <= c1Var.v()) {
                        J = false;
                    }
                }
                if (J) {
                    iVar.K = iVar.B(c1Var.v(), i11);
                    for (c1 c1Var2 : c1VarArr) {
                        c1Var2.J(j10, true);
                    }
                } else {
                    iVar.I = j10;
                    iVar.P = false;
                    r14.clear();
                    iVar.K = 0;
                    if (lVar.d()) {
                        c1Var.l();
                        for (c1 c1Var3 : c1VarArr) {
                            c1Var3.l();
                        }
                        lVar.b();
                    } else {
                        lVar.c = null;
                        z10 = false;
                        c1Var.G(false);
                        for (c1 c1Var4 : iVar.D) {
                            c1Var4.G(false);
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
            int b10 = e2.l0.b(mVar.c, j10, true);
            mVar.h = b10;
            mVar.n = (mVar.d && b10 == mVar.c.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    @Override // u2.e0
    public final void h(long j10) {
        long j11;
        for (v2.i iVar : this.H) {
            if (!iVar.y()) {
                c1 c1Var = iVar.y;
                int i10 = c1Var.q;
                c1Var.k(j10, true);
                c1 c1Var2 = iVar.y;
                int i11 = c1Var2.q;
                if (i11 > i10) {
                    synchronized (c1Var2) {
                        j11 = c1Var2.p == 0 ? Long.MIN_VALUE : c1Var2.n[c1Var2.r];
                    }
                    int i12 = 0;
                    while (true) {
                        c1[] c1VarArr = iVar.D;
                        if (i12 >= c1VarArr.length) {
                            break;
                        }
                        c1VarArr[i12].k(j11, iVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(iVar.B(i11, 0), iVar.K);
                if (min > 0) {
                    e2.l0.X(0, min, iVar.w);
                    iVar.K -= min;
                }
            }
        }
    }

    public final int i(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.w;
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

    @Override // u2.e0
    public final void j(d0 d0Var, long j10) {
        this.G = d0Var;
        d0Var.e(this);
    }

    @Override // u2.e0
    public final long k() {
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

    @Override // u2.f1
    public final boolean m(w0 w0Var) {
        return this.J.m(w0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v15, types: [e9.n0] */
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
    @Override // u2.e0
    public final long p(q[] qVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
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
        x[] xVarArr;
        long a2;
        boolean z12;
        boolean z13;
        q[] qVarArr2 = qVarArr;
        int[] iArr3 = new int[qVarArr2.length];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = -1;
            if (i16 >= qVarArr2.length) {
                break;
            }
            q qVar = qVarArr2[i16];
            if (qVar != null) {
                iArr3[i16] = this.s.b(qVar.b());
            } else {
                iArr3[i16] = -1;
            }
            i16++;
        }
        for (int i17 = 0; i17 < qVarArr2.length; i17++) {
            if (qVarArr2[i17] == null || !zArr[i17]) {
                ?? r42 = d1VarArr[i17];
                if (r42 instanceof v2.i) {
                    ((v2.i) r42).C(this);
                } else if (r42 instanceof v2.g) {
                    v2.g gVar = (v2.g) r42;
                    v2.i iVar = gVar.e;
                    boolean[] zArr3 = iVar.d;
                    int i18 = gVar.c;
                    t6.p(zArr3[i18]);
                    iVar.d[i18] = false;
                }
                d1VarArr[i17] = null;
            }
        }
        int i19 = 0;
        while (true) {
            z10 = true;
            if (i19 >= qVarArr2.length) {
                break;
            }
            ?? r43 = d1VarArr[i19];
            if ((r43 instanceof r) || (r43 instanceof v2.g)) {
                int i20 = i(iArr3, i19);
                if (i20 == -1) {
                    z13 = d1VarArr[i19] instanceof r;
                } else {
                    ?? r10 = d1VarArr[i19];
                    z13 = (r10 instanceof v2.g) && ((v2.g) r10).a == d1VarArr[i20];
                }
                if (!z13) {
                    ?? r44 = d1VarArr[i19];
                    if (r44 instanceof v2.g) {
                        v2.g gVar2 = (v2.g) r44;
                        v2.i iVar2 = gVar2.e;
                        boolean[] zArr4 = iVar2.d;
                        int i21 = gVar2.c;
                        t6.p(zArr4[i21]);
                        iVar2.d[i21] = false;
                    }
                    d1VarArr[i19] = null;
                }
            }
            i19++;
        }
        int i22 = 0;
        while (i22 < qVarArr2.length) {
            q qVar2 = qVarArr2[i22];
            if (qVar2 == null) {
                iArr2 = iArr3;
                i11 = i15;
                i12 = i22;
            } else {
                ?? r102 = d1VarArr[i22];
                if (r102 == null) {
                    zArr2[i22] = z10;
                    a aVar = this.w[iArr3[i22]];
                    int i23 = aVar.c;
                    if (i23 == 0) {
                        int i24 = aVar.f;
                        ?? r30 = i24 != i10 ? z10 ? 1 : 0 : i15;
                        if (r30 != 0) {
                            p1Var = this.s.a(i24);
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i15;
                            p1Var = null;
                        }
                        int i25 = aVar.g;
                        if (i25 != i10) {
                            x1Var = this.w[i25].h;
                        } else {
                            l0 l0Var = n0.b;
                            x1Var = x1.e;
                        }
                        int size = x1Var.size() + i13;
                        int i26 = i22;
                        x[] xVarArr2 = new x[size];
                        int[] iArr4 = new int[size];
                        if (r30 != 0) {
                            xVarArr2[i15] = p1Var.d[i15];
                            iArr4[i15] = 5;
                            i14 = z10 ? 1 : 0;
                        } else {
                            i14 = i15;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z14 = z10 ? 1 : 0;
                        for (int i27 = i15; i27 < x1Var.size(); i27++) {
                            x xVar = (x) x1Var.get(i27);
                            xVarArr2[i14] = xVar;
                            iArr4[i14] = 3;
                            arrayList.add(xVar);
                            i14++;
                        }
                        if (!this.K.d || r30 == 0) {
                            oVar = null;
                        } else {
                            p pVar = this.y;
                            oVar = new o(pVar, pVar.a);
                        }
                        m2.c cVar = this.K;
                        int i28 = this.L;
                        i d = ((m2.m) ((m2.a) cVar.b(i28).c.get(aVar.a[i15])).c.get(i15)).d();
                        if (d == null) {
                            a2 = -9223372036854775807L;
                            xVarArr = xVarArr2;
                        } else {
                            xVarArr = xVarArr2;
                            a2 = d.a(d.o(j10, cVar.d(i28)));
                        }
                        long j11 = a2;
                        if (this.N) {
                            m2.c cVar2 = this.K;
                            int i29 = this.L;
                            int[] iArr5 = aVar.a;
                            List list = cVar2.b(i29).c;
                            k0 t10 = n0.t();
                            int length = iArr5.length;
                            int i30 = 0;
                            while (i30 < length) {
                                int i31 = i30;
                                t10.d(((m2.a) list.get(iArr5[i31])).c);
                                i30 = i31 + 1;
                            }
                            x1 f7 = t10.f();
                            for (int i32 = 0; i32 < qVar2.length(); i32++) {
                                x xVar2 = ((m2.m) f7.get(qVar2.h(i32))).a;
                                if (!v0.a(xVar2.s, xVar2.k)) {
                                    z12 = z14;
                                    break;
                                }
                            }
                        }
                        z12 = false;
                        a5.a aVar2 = this.b;
                        y2.m mVar = this.n;
                        m2.c cVar3 = this.K;
                        xa.n nVar = this.f;
                        int[] iArr6 = iArr3;
                        int i33 = this.L;
                        int[] iArr7 = aVar.a;
                        int i34 = aVar.b;
                        long j12 = this.h;
                        g2.d0 d0Var = this.c;
                        g2.h createDataSource = ((g2.g) aVar2.c).createDataSource();
                        if (d0Var != null) {
                            createDataSource.addTransferListener(d0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr6;
                        i12 = i26;
                        v2.i iVar3 = new v2.i(aVar.b, iArr4, xVarArr, new l((c5.e) aVar2.d, mVar, cVar3, nVar, i33, iArr7, qVar2, i34, createDataSource, j12, aVar2.b, r30, arrayList, oVar), this, this.r, j10, this.d, this.F, this.e, this.E, z12, j11, null);
                        long j13 = this.P;
                        iVar3.y.K(j13);
                        for (c1 c1Var : iVar3.D) {
                            c1Var.K(j13);
                        }
                        synchronized (this) {
                            this.D.put(iVar3, oVar2);
                        }
                        d1VarArr[i12] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i12 = i22;
                        if (i23 == 2) {
                            i11 = 0;
                            d1VarArr[i12] = new m((m2.g) this.M.get(aVar.d), qVar2.b().d[0], this.K.d);
                        }
                    }
                    i11 = 0;
                } else {
                    iArr2 = iArr3;
                    i11 = i15;
                    i12 = i22;
                    if (r102 instanceof v2.i) {
                        ((v2.i) r102).e.j = qVar2;
                    }
                }
            }
            i22 = i12 + 1;
            qVarArr2 = qVarArr;
            i15 = i11;
            iArr3 = iArr2;
            i10 = -1;
            z10 = true;
        }
        int[] iArr8 = iArr3;
        ?? r13 = i15;
        while (i15 < qVarArr.length) {
            if (d1VarArr[i15] != null || qVarArr[i15] == null) {
                iArr = iArr8;
            } else {
                iArr = iArr8;
                a aVar3 = this.w[iArr[i15]];
                if (aVar3.c == 1) {
                    int i35 = i(iArr, i15);
                    if (i35 != -1) {
                        v2.i iVar4 = (v2.i) d1VarArr[i35];
                        int i36 = aVar3.b;
                        boolean[] zArr5 = iVar4.d;
                        c1[] c1VarArr = iVar4.D;
                        for (int i37 = r13 == true ? 1 : 0; i37 < c1VarArr.length; i37++) {
                            if (iVar4.b[i37] == i36) {
                                t6.p(!zArr5[i37]);
                                zArr5[i37] = true;
                                c1VarArr[i37].J(j10, true);
                                d1VarArr[i15] = new v2.g(iVar4, iVar4, c1VarArr[i37], i37);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    d1VarArr[i15] = new r();
                    i15++;
                    iArr8 = iArr;
                }
            }
            i15++;
            iArr8 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length2 = d1VarArr.length;
        for (int i38 = r13 == true ? 1 : 0; i38 < length2; i38++) {
            ?? r62 = d1VarArr[i38];
            if (r62 instanceof v2.i) {
                arrayList2.add((v2.i) r62);
            } else if (r62 instanceof m) {
                arrayList3.add((m) r62);
            }
        }
        v2.i[] iVarArr = new v2.i[arrayList2.size()];
        this.H = iVarArr;
        arrayList2.toArray(iVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.I = mVarArr;
        arrayList3.toArray(mVarArr);
        kb.a aVar4 = this.x;
        AbstractList x10 = s.x(arrayList2, new k2.k0(4));
        aVar4.getClass();
        this.J = new u2.n(arrayList2, x10);
        if (this.N) {
            this.N = r13;
            this.O = j10;
            v2.i[] iVarArr2 = this.H;
            int length3 = iVarArr2.length;
            int i39 = r13 == true ? 1 : 0;
            while (true) {
                if (i39 >= length3) {
                    z11 = r13 == true ? 1 : 0;
                    break;
                }
                if (iVarArr2[i39].z()) {
                    z11 = true;
                    break;
                }
                i39++;
            }
            if (z11) {
                this.Q = true;
                v2.i[] iVarArr3 = this.H;
                int length4 = iVarArr3.length;
                for (int i40 = r13 == true ? 1 : 0; i40 < length4; i40++) {
                    iVarArr3[i40].O = true;
                }
            }
        }
        return j10;
    }

    @Override // u2.e0
    public final r1 q() {
        return this.s;
    }

    @Override // u2.e1
    public final void r(f1 f1Var) {
        this.G.r(this);
    }

    @Override // u2.f1
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
    public final long t(long j10, v1 v1Var) {
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
                            long o10 = iVar3.o(j12, jVar.e) + j13;
                            long e = jVar.e(o10);
                            if (e < j12) {
                                if (c10 != -1) {
                                    iVar3.getClass();
                                }
                                j11 = jVar.e(o10 + 1);
                                return v1Var.a(j12, e, j11);
                            }
                            j11 = e;
                            return v1Var.a(j12, e, j11);
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

    @Override // u2.f1
    public final void u(long j10) {
        int i10;
        v2.i[] iVarArr = this.H;
        int length = iVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            v2.i iVar = iVarArr[i11];
            if (!iVar.r.d()) {
                long d = this.K.d(this.L);
                c1 c1Var = iVar.y;
                t6.p(!iVar.r.d());
                if (!iVar.y() && d != -9223372036854775807L && !iVar.w.isEmpty()) {
                    v2.a w9 = iVar.w();
                    long j11 = w9.x;
                    if (j11 == -9223372036854775807L) {
                        j11 = w9.n;
                    }
                    if (j11 > d) {
                        long s10 = c1Var.s();
                        if (s10 > d) {
                            c1Var.m(Math.max(d, c1Var.t() + 1));
                            c1[] c1VarArr = iVar.D;
                            int length2 = c1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                c1 c1Var2 = c1VarArr[i12];
                                c1Var2.m(Math.max(d, c1Var2.t() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            iVar.h.B(d, iVar.a, s10);
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
