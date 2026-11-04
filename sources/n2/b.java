package n2;

import a3.q;
import a3.r;
import android.support.v4.media.session.a0;
import android.util.Pair;
import android.util.SparseArray;
import b8.kg;
import b8.od;
import b8.zb;
import cg.v0;
import d2.o1;
import d2.u;
import d2.u0;
import d2.v;
import g2.n0;
import g9.f0;
import g9.g0;
import g9.i0;
import g9.s1;
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
import k2.p1;
import k2.t1;
import w2.c1;
import w2.d0;
import w2.d1;
import w2.e0;
import w2.e1;
import w2.f1;
import w2.r1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements e0, e1, x2.h {
    public static final Pattern S = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern T = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final kg F;
    public final p2.j G;
    public d0 H;
    public w2.n K;
    public o2.c L;
    public int M;
    public List N;
    public long P;
    public final long Q;
    public boolean R;
    public final int a;
    public final kg b;
    public final i2.d0 c;
    public final p2.m d;
    public final kb.a e;
    public final za.p f;
    public final long h;
    public final r n;
    public final a0 r;
    public final r1 s;
    public final a[] w;
    public final ra.e x;
    public final p y;
    public boolean O = true;
    public x2.i[] I = new x2.i[0];
    public m[] J = new m[0];
    public final IdentityHashMap E = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i3, o2.c cVar, za.p pVar, int i10, kg kgVar, i2.d0 d0Var, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar2, long j10, r rVar, a0 a0Var, ra.e eVar, f fVar, l2.k kVar) {
        int i11;
        int i12;
        int[][] iArr;
        boolean[] zArr;
        v[][] vVarArr;
        v[] vVarArr2;
        o2.f f10;
        Integer num;
        p2.m mVar2 = mVar;
        this.a = i3;
        this.L = cVar;
        this.f = pVar;
        this.M = i10;
        this.b = kgVar;
        this.c = d0Var;
        this.d = mVar2;
        this.G = jVar;
        this.e = aVar;
        this.F = kgVar2;
        this.h = j10;
        this.n = rVar;
        this.r = a0Var;
        this.x = eVar;
        boolean z10 = true;
        this.y = new p(cVar, fVar, a0Var);
        int i13 = 0;
        eVar.getClass();
        g0 g0Var = i0.b;
        s1 s1Var = s1.e;
        this.K = new w2.n(s1Var, s1Var);
        o2.h b10 = cVar.b(i10);
        List list = b10.d;
        this.N = list;
        List list2 = b10.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(g9.o.d(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((o2.a) list2.get(i14)).a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        int i15 = 0;
        while (i15 < size) {
            o2.a aVar2 = (o2.a) list2.get(i15);
            List list3 = aVar2.e;
            List list4 = aVar2.f;
            boolean z11 = z10;
            o2.f f11 = f("http://dashif.org/guidelines/trickmode", list3);
            f11 = f11 == null ? f("http://dashif.org/guidelines/trickmode", list4) : f11;
            int intValue = (f11 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(f11.b)))) == null || !a(aVar2, (o2.a) list2.get(num.intValue()))) ? i15 : num.intValue();
            if (intValue == i15 && (f10 = f("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = f10.b;
                String str2 = n0.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i16 = i13; i16 < length; i16++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i16])));
                    if (num2 != null && a(aVar2, (o2.a) list2.get(num2.intValue()))) {
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
            int[] f12 = od.f((Collection) arrayList.get(i17));
            iArr2[i17] = f12;
            Arrays.sort(f12);
        }
        boolean[] zArr2 = new boolean[size2];
        v[][] vVarArr3 = new v[size2][];
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
                List list7 = ((o2.a) list2.get(iArr3[i20])).c;
                iArr = iArr2;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    if (!((o2.m) list7.get(i21)).d.isEmpty()) {
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
                    vVarArr = vVarArr3;
                    vVarArr2 = new v[0];
                    break;
                }
                int i23 = iArr4[i22];
                o2.a aVar3 = (o2.a) list2.get(i23);
                List list8 = ((o2.a) list2.get(i23)).d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list8.size()) {
                    o2.f fVar2 = (o2.f) list8.get(i24);
                    zArr = zArr2;
                    vVarArr = vVarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.a)) {
                        u uVar = new u();
                        uVar.r = u0.n("application/cea-608");
                        uVar.a = a1.g.r(new StringBuilder(), aVar3.a, ":cea608");
                        vVarArr2 = o(fVar2, S, new v(uVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.a)) {
                        u uVar2 = new u();
                        uVar2.r = u0.n("application/cea-708");
                        uVar2.a = a1.g.r(new StringBuilder(), aVar3.a, ":cea708");
                        vVarArr2 = o(fVar2, T, new v(uVar2));
                        break;
                    }
                    i24++;
                    vVarArr3 = vVarArr;
                    zArr2 = zArr;
                }
                i22++;
                iArr4 = iArr5;
            }
            vVarArr[i18] = vVarArr2;
            if (vVarArr2.length != 0) {
                i19++;
            }
            i18++;
            vVarArr3 = vVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        v[][] vVarArr4 = vVarArr3;
        int size3 = list.size() + i19 + size2;
        o1[] o1VarArr = new o1[size3];
        a[] aVarArr = new a[size3];
        int i25 = 0;
        int i26 = 0;
        while (i26 < size2) {
            int[] iArr7 = iArr6[i26];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr7) {
                arrayList3.addAll(((o2.a) list2.get(i27)).c);
            }
            int size4 = arrayList3.size();
            v[] vVarArr5 = new v[size4];
            int i28 = 0;
            while (i28 < size4) {
                int i29 = size2;
                v vVar = ((o2.m) arrayList3.get(i28)).a;
                int i30 = i25;
                u a10 = vVar.a();
                a10.S = mVar2.u(vVar);
                vVarArr5[i28] = new v(a10);
                i28++;
                size2 = i29;
                i25 = i30;
            }
            int i31 = size2;
            int i32 = i25;
            o2.a aVar4 = (o2.a) list2.get(iArr7[0]);
            long j11 = aVar4.a;
            String l10 = j11 != -1 ? Long.toString(j11) : p1.i(i26, "unset:");
            int i33 = i32 + 1;
            if (zArr3[i26]) {
                i11 = i32 + 2;
            } else {
                i11 = i33;
                i33 = -1;
            }
            if (vVarArr4[i26].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            m(kgVar, vVarArr5);
            List list9 = list2;
            o1VarArr[i32] = new o1(l10, vVarArr5);
            int i34 = aVar4.b;
            g0 g0Var2 = i0.b;
            s1 s1Var2 = s1.e;
            a aVar5 = new a(i34, 0, iArr7, i32, i33, i11, -1, s1Var2);
            int[] iArr8 = iArr7;
            int i35 = i32;
            aVarArr[i35] = aVar5;
            int i36 = -1;
            if (i33 != -1) {
                String q10 = t4.c.q(l10, ":emsg");
                u uVar3 = new u();
                uVar3.a = q10;
                uVar3.r = u0.n("application/x-emsg");
                uVar3.l = l10;
                v[] vVarArr6 = new v[z12];
                vVarArr6[0] = new v(uVar3);
                o1VarArr[i33] = new o1(q10, vVarArr6);
                a aVar6 = new a(5, 1, iArr8, i35, -1, -1, -1, s1Var2);
                iArr8 = iArr8;
                i35 = i35;
                aVarArr[i33] = aVar6;
                i36 = -1;
            }
            if (i11 != i36) {
                String q11 = t4.c.q(l10, ":cc");
                aVarArr[i11] = new a(3, 1, iArr8, i35, -1, -1, -1, i0.r(vVarArr4[i26]));
                m(kgVar, vVarArr4[i26]);
                int i37 = 0;
                while (true) {
                    v[] vVarArr7 = vVarArr4[i26];
                    if (i37 >= vVarArr7.length) {
                        break;
                    }
                    u a11 = vVarArr7[i37].a();
                    a11.l = l10;
                    vVarArr7[i37] = new v(a11);
                    i37++;
                }
                o1VarArr[i11] = new o1(q11, vVarArr4[i26]);
            }
            i26++;
            size2 = i31;
            mVar2 = mVar;
            i25 = i12;
            list2 = list9;
            z12 = true;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            o2.g gVar = (o2.g) list.get(i38);
            u uVar4 = new u();
            uVar4.a = gVar.a();
            uVar4.r = u0.n("application/x-emsg");
            o1VarArr[i25] = new o1(gVar.a() + ":" + i38, new v(uVar4));
            g0 g0Var3 = i0.b;
            aVarArr[i25] = new a(5, 2, new int[0], -1, -1, -1, i38, s1.e);
            i38++;
            i25++;
        }
        Pair create = Pair.create(new r1(o1VarArr), aVarArr);
        this.s = (r1) create.first;
        this.w = (a[]) create.second;
        this.Q = Long.MIN_VALUE;
    }

    public static boolean a(o2.a aVar, o2.a aVar2) {
        int i3 = aVar.b;
        List list = aVar.c;
        int i10 = aVar2.b;
        List list2 = aVar2.c;
        if (i3 == i10) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            v vVar = ((o2.m) list.get(0)).a;
            v vVar2 = ((o2.m) list2.get(0)).a;
            int i11 = vVar.f & (-16385);
            int i12 = vVar2.f & (-16385);
            if (Objects.equals(vVar.d, vVar2.d) && i11 == i12) {
                return true;
            }
        }
        return false;
    }

    public static o2.f f(String str, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            o2.f fVar = (o2.f) list.get(i3);
            if (str.equals(fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void m(kg kgVar, v[] vVarArr) {
        for (int i3 = 0; i3 < vVarArr.length; i3++) {
            v vVar = vVarArr[i3];
            v0 v0Var = (v0) kgVar.d;
            if (v0Var.a && ((mb.b) v0Var.c).l(vVar)) {
                u a10 = vVar.a();
                String str = vVar.k;
                a10.r = u0.n("application/x-media3-cues");
                a10.P = ((mb.b) v0Var.c).q0(vVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(vVar.s);
                sb2.append(str != null ? " ".concat(str) : "");
                a10.j = sb2.toString();
                a10.w = Long.MAX_VALUE;
                vVar = new v(a10);
            }
            vVarArr[i3] = vVar;
        }
    }

    public static v[] o(o2.f fVar, Pattern pattern, v vVar) {
        String str = fVar.b;
        if (str == null) {
            return new v[]{vVar};
        }
        String str2 = n0.a;
        String[] split = str.split(";", -1);
        v[] vVarArr = new v[split.length];
        for (int i3 = 0; i3 < split.length; i3++) {
            Matcher matcher = pattern.matcher(split[i3]);
            if (!matcher.matches()) {
                return new v[]{vVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            u a10 = vVar.a();
            a10.a = vVar.a + ":" + parseInt;
            a10.O = parseInt;
            a10.d = matcher.group(2);
            vVarArr[i3] = new v(a10);
        }
        return vVarArr;
    }

    @Override // w2.f1
    public final boolean c(k2.v0 v0Var) {
        return this.K.c(v0Var);
    }

    @Override // w2.f1
    public final boolean d() {
        return this.K.d();
    }

    @Override // w2.f1
    public final long e() {
        return this.K.e();
    }

    @Override // w2.e0
    public final void g() {
        this.n.a();
    }

    public final int h(int[] iArr, int i3) {
        int i10 = iArr[i3];
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

    @Override // w2.e0
    public final void i(d0 d0Var, long j10) {
        this.H = d0Var;
        d0Var.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // w2.e0
    public final long j(long j10) {
        int i3;
        x2.a aVar;
        boolean J;
        int i10;
        boolean z10;
        x2.a aVar2;
        x2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        boolean z11 = false;
        int i11 = 0;
        while (i11 < length) {
            x2.i iVar = iVarArr[i11];
            c1[] c1VarArr = iVar.E;
            c1 c1Var = iVar.y;
            q qVar = iVar.r;
            ?? r14 = iVar.w;
            iVar.K = j10;
            iVar.N = z11;
            iVar.O = z11;
            if (iVar.x()) {
                iVar.J = j10;
                z10 = z11;
                i3 = i11;
            } else {
                ?? r15 = z11;
                while (true) {
                    if (r15 >= r14.size()) {
                        i3 = i11;
                        break;
                    }
                    aVar = (x2.a) r14.get(r15);
                    long j11 = aVar.h;
                    i3 = i11;
                    if (j11 == j10 && aVar.w == -9223372036854775807L) {
                        break;
                    }
                    if (j11 > j10) {
                        break;
                    }
                    r15++;
                    i11 = i3;
                }
                aVar = null;
                if (aVar != null) {
                    J = c1Var.I(aVar.d(0));
                } else {
                    long e10 = iVar.e();
                    J = c1Var.J(j10, e10 == Long.MIN_VALUE || j10 < e10);
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
                    iVar.L = iVar.A(c1Var.v(), i10);
                    for (c1 c1Var2 : c1VarArr) {
                        c1Var2.J(j10, true);
                    }
                } else {
                    iVar.J = j10;
                    iVar.Q = false;
                    r14.clear();
                    iVar.L = 0;
                    if (qVar.d()) {
                        c1Var.l();
                        for (c1 c1Var3 : c1VarArr) {
                            c1Var3.l();
                        }
                        qVar.b();
                    } else {
                        qVar.c = null;
                        z10 = false;
                        c1Var.G(false);
                        for (c1 c1Var4 : iVar.E) {
                            c1Var4.G(false);
                        }
                    }
                }
                z10 = false;
            }
            i11 = i3 + 1;
            z11 = z10;
        }
        m[] mVarArr = this.J;
        int length2 = mVarArr.length;
        for (?? r5 = z11; r5 < length2; r5++) {
            m mVar = mVarArr[r5];
            int b10 = n0.b(mVar.c, j10, true);
            mVar.h = b10;
            mVar.n = (mVar.d && b10 == mVar.c.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    @Override // w2.e1
    public final void k(f1 f1Var) {
        this.H.k(this);
    }

    @Override // w2.e0
    public final void l(long j10) {
        long j11;
        for (x2.i iVar : this.I) {
            if (!iVar.x()) {
                c1 c1Var = iVar.y;
                int i3 = c1Var.q;
                c1Var.k(j10, true);
                c1 c1Var2 = iVar.y;
                int i10 = c1Var2.q;
                if (i10 > i3) {
                    synchronized (c1Var2) {
                        j11 = c1Var2.p == 0 ? Long.MIN_VALUE : c1Var2.n[c1Var2.r];
                    }
                    int i11 = 0;
                    while (true) {
                        c1[] c1VarArr = iVar.E;
                        if (i11 >= c1VarArr.length) {
                            break;
                        }
                        c1VarArr[i11].k(j11, iVar.d[i11]);
                        i11++;
                    }
                }
                int min = Math.min(iVar.A(i10, 0), iVar.L);
                if (min > 0) {
                    n0.X(0, min, iVar.w);
                    iVar.L -= min;
                }
            }
        }
    }

    @Override // w2.e0
    public final long n() {
        if (!this.R) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        for (x2.i iVar : this.I) {
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
        x2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                this.R = false;
                for (x2.i iVar2 : this.I) {
                    iVar2.P = false;
                }
            } else {
                if (iVarArr[i3].y()) {
                    break;
                }
                i3++;
            }
        }
        if (z10) {
            return this.P;
        }
        return -9223372036854775807L;
    }

    @Override // w2.e0
    public final r1 p() {
        return this.s;
    }

    @Override // w2.f1
    public final long q() {
        return this.K.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r3 < (((r10.C() + r8) + r11) - 1)) goto L19;
     */
    @Override // w2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r(long j10, t1 t1Var) {
        long j11;
        long j12 = j10;
        x2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            x2.i iVar = iVarArr[i10];
            if (iVar.a == 2) {
                j[] jVarArr = iVar.e.i;
                int length2 = jVarArr.length;
                while (i3 < length2) {
                    j jVar = jVarArr[i3];
                    i iVar2 = jVar.d;
                    long j13 = jVar.f;
                    i iVar3 = jVar.d;
                    if (iVar2 != null) {
                        long c2 = jVar.c();
                        if (c2 != 0) {
                            iVar3.getClass();
                            long s6 = iVar3.s(j12, jVar.e) + j13;
                            long e10 = jVar.e(s6);
                            if (e10 < j12) {
                                if (c2 != -1) {
                                    iVar3.getClass();
                                }
                                j11 = jVar.e(s6 + 1);
                                return t1Var.a(j12, e10, j11);
                            }
                            j11 = e10;
                            return t1Var.a(j12, e10, j11);
                        }
                    }
                    i3++;
                    j12 = j10;
                }
            } else {
                i10++;
                j12 = j10;
            }
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v15, types: [g9.i0] */
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
    @Override // w2.e0
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        int i3;
        boolean z10;
        boolean z11;
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11;
        int i12;
        o1 o1Var;
        s1 s1Var;
        int i13;
        o oVar;
        v[] vVarArr;
        long b10;
        boolean z12;
        boolean z13;
        z2.p[] pVarArr2 = pVarArr;
        int[] iArr3 = new int[pVarArr2.length];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i3 = -1;
            if (i15 >= pVarArr2.length) {
                break;
            }
            z2.p pVar = pVarArr2[i15];
            if (pVar != null) {
                iArr3[i15] = this.s.b(pVar.b());
            } else {
                iArr3[i15] = -1;
            }
            i15++;
        }
        for (int i16 = 0; i16 < pVarArr2.length; i16++) {
            if (pVarArr2[i16] == null || !zArr[i16]) {
                ?? r42 = d1VarArr[i16];
                if (r42 instanceof x2.i) {
                    ((x2.i) r42).B(this);
                } else if (r42 instanceof x2.g) {
                    x2.g gVar = (x2.g) r42;
                    x2.i iVar = gVar.e;
                    boolean[] zArr3 = iVar.d;
                    int i17 = gVar.c;
                    zb.p(zArr3[i17]);
                    iVar.d[i17] = false;
                }
                d1VarArr[i16] = null;
            }
        }
        int i18 = 0;
        while (true) {
            z10 = true;
            if (i18 >= pVarArr2.length) {
                break;
            }
            ?? r43 = d1VarArr[i18];
            if ((r43 instanceof w2.r) || (r43 instanceof x2.g)) {
                int h = h(iArr3, i18);
                if (h == -1) {
                    z13 = d1VarArr[i18] instanceof w2.r;
                } else {
                    ?? r10 = d1VarArr[i18];
                    z13 = (r10 instanceof x2.g) && ((x2.g) r10).a == d1VarArr[h];
                }
                if (!z13) {
                    ?? r44 = d1VarArr[i18];
                    if (r44 instanceof x2.g) {
                        x2.g gVar2 = (x2.g) r44;
                        x2.i iVar2 = gVar2.e;
                        boolean[] zArr4 = iVar2.d;
                        int i19 = gVar2.c;
                        zb.p(zArr4[i19]);
                        iVar2.d[i19] = false;
                    }
                    d1VarArr[i18] = null;
                }
            }
            i18++;
        }
        int i20 = 0;
        while (i20 < pVarArr2.length) {
            z2.p pVar2 = pVarArr2[i20];
            if (pVar2 == null) {
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
                        ?? r30 = i22 != i3 ? z10 ? 1 : 0 : i14;
                        if (r30 != 0) {
                            o1Var = this.s.a(i22);
                            i12 = z10 ? 1 : 0;
                        } else {
                            i12 = i14;
                            o1Var = null;
                        }
                        int i23 = aVar.g;
                        if (i23 != i3) {
                            s1Var = this.w[i23].h;
                        } else {
                            g0 g0Var = i0.b;
                            s1Var = s1.e;
                        }
                        int size = s1Var.size() + i12;
                        int i24 = i20;
                        v[] vVarArr2 = new v[size];
                        int[] iArr4 = new int[size];
                        if (r30 != 0) {
                            vVarArr2[i14] = o1Var.d[i14];
                            iArr4[i14] = 5;
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i14;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z14 = z10 ? 1 : 0;
                        for (int i25 = i14; i25 < s1Var.size(); i25++) {
                            v vVar = (v) s1Var.get(i25);
                            vVarArr2[i13] = vVar;
                            iArr4[i13] = 3;
                            arrayList.add(vVar);
                            i13++;
                        }
                        if (!this.L.d || r30 == 0) {
                            oVar = null;
                        } else {
                            p pVar3 = this.y;
                            oVar = new o(pVar3, pVar3.a);
                        }
                        o2.c cVar = this.L;
                        int i26 = this.M;
                        i c2 = ((o2.m) ((o2.a) cVar.b(i26).c.get(aVar.a[i14])).c.get(i14)).c();
                        if (c2 == null) {
                            b10 = -9223372036854775807L;
                            vVarArr = vVarArr2;
                        } else {
                            vVarArr = vVarArr2;
                            b10 = c2.b(c2.s(j10, cVar.d(i26)));
                        }
                        long j11 = b10;
                        if (this.O) {
                            o2.c cVar2 = this.L;
                            int i27 = this.M;
                            int[] iArr5 = aVar.a;
                            List list = cVar2.b(i27).c;
                            f0 p10 = i0.p();
                            int length = iArr5.length;
                            int i28 = 0;
                            while (i28 < length) {
                                int i29 = i28;
                                p10.d(((o2.a) list.get(iArr5[i29])).c);
                                i28 = i29 + 1;
                            }
                            s1 f10 = p10.f();
                            for (int i30 = 0; i30 < pVar2.length(); i30++) {
                                v vVar2 = ((o2.m) f10.get(pVar2.i(i30))).a;
                                if (!u0.a(vVar2.s, vVar2.k)) {
                                    z12 = z14;
                                    break;
                                }
                            }
                        }
                        z12 = false;
                        kg kgVar = this.b;
                        r rVar = this.n;
                        o2.c cVar3 = this.L;
                        za.p pVar4 = this.f;
                        int[] iArr6 = iArr3;
                        int i31 = this.M;
                        int[] iArr7 = aVar.a;
                        int i32 = aVar.b;
                        long j12 = this.h;
                        i2.d0 d0Var = this.c;
                        i2.h createDataSource = ((i2.g) kgVar.c).createDataSource();
                        if (d0Var != null) {
                            createDataSource.addTransferListener(d0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr6;
                        i11 = i24;
                        x2.i iVar3 = new x2.i(aVar.b, iArr4, vVarArr, new l((v0) kgVar.d, rVar, cVar3, pVar4, i31, iArr7, pVar2, i32, createDataSource, j12, kgVar.b, r30, arrayList, oVar), this, this.r, j10, this.d, this.G, this.e, this.F, z12, j11, null);
                        long j13 = this.Q;
                        iVar3.y.K(j13);
                        for (c1 c1Var : iVar3.E) {
                            c1Var.K(j13);
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
                            d1VarArr[i11] = new m((o2.g) this.N.get(aVar.d), pVar2.b().d[0], this.L.d);
                        }
                    }
                    i10 = 0;
                } else {
                    iArr2 = iArr3;
                    i10 = i14;
                    i11 = i20;
                    if (r102 instanceof x2.i) {
                        ((x2.i) r102).e.j = pVar2;
                    }
                }
            }
            i20 = i11 + 1;
            pVarArr2 = pVarArr;
            i14 = i10;
            iArr3 = iArr2;
            i3 = -1;
            z10 = true;
        }
        int[] iArr8 = iArr3;
        ?? r13 = i14;
        while (i14 < pVarArr.length) {
            if (d1VarArr[i14] != null || pVarArr[i14] == null) {
                iArr = iArr8;
            } else {
                iArr = iArr8;
                a aVar2 = this.w[iArr[i14]];
                if (aVar2.c == 1) {
                    int h7 = h(iArr, i14);
                    if (h7 != -1) {
                        x2.i iVar4 = (x2.i) d1VarArr[h7];
                        int i33 = aVar2.b;
                        boolean[] zArr5 = iVar4.d;
                        c1[] c1VarArr = iVar4.E;
                        for (int i34 = r13 == true ? 1 : 0; i34 < c1VarArr.length; i34++) {
                            if (iVar4.b[i34] == i33) {
                                zb.p(!zArr5[i34]);
                                zArr5[i34] = true;
                                c1VarArr[i34].J(j10, true);
                                d1VarArr[i14] = new x2.g(iVar4, iVar4, c1VarArr[i34], i34);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    d1VarArr[i14] = new w2.r();
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
            if (r62 instanceof x2.i) {
                arrayList2.add((x2.i) r62);
            } else if (r62 instanceof m) {
                arrayList3.add((m) r62);
            }
        }
        x2.i[] iVarArr = new x2.i[arrayList2.size()];
        this.I = iVarArr;
        arrayList2.toArray(iVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.J = mVarArr;
        arrayList3.toArray(mVarArr);
        ra.e eVar = this.x;
        AbstractList y9 = g9.o.y(arrayList2, new l2.d(26));
        eVar.getClass();
        this.K = new w2.n(arrayList2, y9);
        if (this.O) {
            this.O = r13;
            this.P = j10;
            x2.i[] iVarArr2 = this.I;
            int length3 = iVarArr2.length;
            int i36 = r13 == true ? 1 : 0;
            while (true) {
                if (i36 >= length3) {
                    z11 = r13 == true ? 1 : 0;
                    break;
                }
                if (iVarArr2[i36].y()) {
                    z11 = true;
                    break;
                }
                i36++;
            }
            if (z11) {
                this.R = true;
                x2.i[] iVarArr3 = this.I;
                int length4 = iVarArr3.length;
                for (int i37 = r13 == true ? 1 : 0; i37 < length4; i37++) {
                    iVarArr3[i37].P = true;
                }
            }
        }
        return j10;
    }

    @Override // w2.f1
    public final void t(long j10) {
        int i3;
        x2.i[] iVarArr = this.I;
        int length = iVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            x2.i iVar = iVarArr[i10];
            if (!iVar.r.d()) {
                long d = this.L.d(this.M);
                c1 c1Var = iVar.y;
                zb.p(!iVar.r.d());
                if (!iVar.x() && d != -9223372036854775807L && !iVar.w.isEmpty()) {
                    x2.a v = iVar.v();
                    long j11 = v.x;
                    if (j11 == -9223372036854775807L) {
                        j11 = v.n;
                    }
                    if (j11 > d) {
                        long s6 = c1Var.s();
                        if (s6 > d) {
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
                            i3 = i10;
                            iVar.h.B(d, iVar.a, s6);
                            i10 = i3 + 1;
                        }
                    }
                }
            }
            i3 = i10;
            i10 = i3 + 1;
        }
        this.K.t(j10);
    }
}
