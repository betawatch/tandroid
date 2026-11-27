// default package

import android.util.Pair;
import android.util.SparseArray;
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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class d63 implements xt6, h8a {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final lp F;
    public final mr3 G;
    public wt6 H;
    public er2 K;
    public z53 L;
    public int M;
    public List N;
    public boolean P;
    public long Q;
    public final long R;
    public boolean S;
    public final int a;
    public final qx6 b;
    public final v2c c;
    public final pr3 d;
    public final z6f e;
    public final u8a f;
    public final long h;
    public final ra6 n;
    public final rx6 r;
    public final u1c s;
    public final c63[] w;
    public final rg7 x;
    public final gg8 y;
    public boolean O = true;
    public wh2[] I = new wh2[0];
    public h54[] J = new h54[0];
    public final IdentityHashMap E = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public d63(int i, z53 z53Var, u8a u8aVar, int i2, qx6 qx6Var, v2c v2cVar, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, long j, ra6 ra6Var, rx6 rx6Var, rg7 rg7Var, wz4 wz4Var, ig8 ig8Var) {
        int i3;
        int[][] iArr;
        boolean[] zArr;
        ko4[][] ko4VarArr;
        ko4[] ko4VarArr2;
        te3 g;
        Integer num;
        qx6 qx6Var2 = qx6Var;
        pr3 pr3Var2 = pr3Var;
        this.a = i;
        this.L = z53Var;
        this.f = u8aVar;
        this.M = i2;
        this.b = qx6Var2;
        this.c = v2cVar;
        this.d = pr3Var2;
        this.G = mr3Var;
        this.e = z6fVar;
        this.F = lpVar;
        this.h = j;
        this.n = ra6Var;
        this.r = rx6Var;
        this.x = rg7Var;
        boolean z = true;
        this.y = new gg8(z53Var, wz4Var, rx6Var);
        int i4 = 0;
        rg7Var.getClass();
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        this.K = new er2(j99Var, j99Var);
        v68 b = z53Var.b(i2);
        List list = b.d;
        this.N = list;
        List list2 = b.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(use.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i5 = 0; i5 < size; i5++) {
            hashMap.put(Long.valueOf(((fa) list2.get(i5)).a), Integer.valueOf(i5));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i5));
            arrayList.add(arrayList2);
            sparseArray.put(i5, arrayList2);
        }
        int i6 = 0;
        while (i6 < size) {
            fa faVar = (fa) list2.get(i6);
            List list3 = faVar.e;
            List list4 = faVar.f;
            boolean z2 = z;
            te3 g2 = g("http://dashif.org/guidelines/trickmode", list3);
            g2 = g2 == null ? g("http://dashif.org/guidelines/trickmode", list4) : g2;
            int intValue = (g2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(g2.b)))) == null || !b(faVar, (fa) list2.get(num.intValue()))) ? i6 : num.intValue();
            if (intValue == i6 && (g = g("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = g.b;
                String str2 = gcc.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i7 = i4; i7 < length; i7++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i7])));
                    if (num2 != null && b(faVar, (fa) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i6) {
                List list5 = (List) sparseArray.get(i6);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i6, list6);
                arrayList.remove(list5);
            }
            i6++;
            z = z2;
            i4 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i8 = 0; i8 < size2; i8++) {
            int[] e = ype.e((Collection) arrayList.get(i8));
            iArr2[i8] = e;
            Arrays.sort(e);
        }
        boolean[] zArr2 = new boolean[size2];
        ko4[][] ko4VarArr3 = new ko4[size2][];
        int i9 = 0;
        int i10 = 0;
        while (i9 < size2) {
            int[] iArr3 = iArr2[i9];
            int length2 = iArr3.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((fa) list2.get(iArr3[i11])).c;
                iArr = iArr2;
                for (int i12 = 0; i12 < list7.size(); i12++) {
                    if (!((ub9) list7.get(i12)).d.isEmpty()) {
                        zArr2[i9] = z3;
                        i10++;
                        break;
                    }
                }
                i11++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i9];
            int length3 = iArr4.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length3) {
                    zArr = zArr2;
                    ko4VarArr = ko4VarArr3;
                    ko4VarArr2 = new ko4[0];
                    break;
                }
                int i14 = iArr4[i13];
                fa faVar2 = (fa) list2.get(i14);
                List list8 = ((fa) list2.get(i14)).d;
                int[] iArr5 = iArr4;
                int i15 = 0;
                while (i15 < list8.size()) {
                    te3 te3Var = (te3) list8.get(i15);
                    zArr = zArr2;
                    ko4VarArr = ko4VarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(te3Var.a)) {
                        jo4 jo4Var = new jo4();
                        jo4Var.s = dg7.n("application/cea-608");
                        jo4Var.a = qu6.p(new StringBuilder(), faVar2.a, ":cea608");
                        ko4VarArr2 = o(te3Var, T, new ko4(jo4Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(te3Var.a)) {
                        jo4 jo4Var2 = new jo4();
                        jo4Var2.s = dg7.n("application/cea-708");
                        jo4Var2.a = qu6.p(new StringBuilder(), faVar2.a, ":cea708");
                        ko4VarArr2 = o(te3Var, U, new ko4(jo4Var2));
                        break;
                    }
                    i15++;
                    ko4VarArr3 = ko4VarArr;
                    zArr2 = zArr;
                }
                i13++;
                iArr4 = iArr5;
            }
            ko4VarArr[i9] = ko4VarArr2;
            i10 += ko4VarArr2.length;
            i9++;
            ko4VarArr3 = ko4VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        ko4[][] ko4VarArr4 = ko4VarArr3;
        int size3 = list.size() + i10 + size2;
        t1c[] t1cVarArr = new t1c[size3];
        c63[] c63VarArr = new c63[size3];
        int i16 = 0;
        int i17 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i18 : iArr7) {
                arrayList3.addAll(((fa) list2.get(i18)).c);
            }
            int size4 = arrayList3.size();
            ko4[] ko4VarArr5 = new ko4[size4];
            int i19 = 0;
            while (i19 < size4) {
                int i20 = size2;
                ko4 ko4Var = ((ub9) arrayList3.get(i19)).a;
                int i21 = i16;
                jo4 a = ko4Var.a();
                a.W = pr3Var2.x(ko4Var);
                ko4VarArr5[i19] = new ko4(a);
                i19++;
                size2 = i20;
                i16 = i21;
            }
            int i22 = size2;
            int i23 = i16;
            fa faVar3 = (fa) list2.get(iArr7[0]);
            long j2 = faVar3.a;
            String l = j2 != -1 ? Long.toString(j2) : uh9.k(i17, "unset:");
            int i24 = i23 + 1;
            if (zArr3[i17]) {
                i3 = i23 + 2;
            } else {
                i3 = i24;
                i24 = -1;
            }
            int i25 = ko4VarArr4[i17].length != 0 ? i3 : -1;
            k(qx6Var2, ko4VarArr5);
            List list9 = list2;
            t1cVarArr[i23] = new t1c(l, ko4VarArr5);
            int i26 = i23;
            c63VarArr[i26] = new c63(faVar3.b, 0, iArr7, i23, i24, i25, ko4VarArr4[i17].length, -1, null);
            int i27 = -1;
            if (i24 != -1) {
                String o = qd4.o(l, ":emsg");
                jo4 jo4Var3 = new jo4();
                jo4Var3.a = o;
                jo4Var3.s = dg7.n("application/x-emsg");
                jo4Var3.m = l;
                ko4[] ko4VarArr6 = new ko4[z3];
                ko4VarArr6[0] = new ko4(jo4Var3);
                t1cVarArr[i24] = new t1c(o, ko4VarArr6);
                c63 c63Var = new c63(5, 1, iArr7, i26, -1, -1, -1, -1, null);
                i26 = i26;
                c63VarArr[i24] = c63Var;
                i27 = -1;
            }
            if (i25 != i27) {
                ko4[] ko4VarArr7 = ko4VarArr4[i17];
                k(qx6Var2, ko4VarArr7);
                int i28 = 0;
                while (i28 < ko4VarArr7.length) {
                    ko4 ko4Var2 = ko4VarArr7[i28];
                    ko4[] ko4VarArr8 = ko4VarArr4[i17];
                    jo4 a2 = ko4Var2.a();
                    a2.m = l;
                    int i29 = i26;
                    ko4VarArr8[i28] = new ko4(a2);
                    c63VarArr[i25] = new c63(3, 1, iArr7, i29, -1, -1, -1, -1, ko4Var2);
                    t1cVarArr[i25] = new t1c(l + ":cc:" + i28, ko4VarArr4[i17][i28]);
                    i25++;
                    i28++;
                    i26 = i29;
                }
                i3 += ko4VarArr7.length;
            }
            i16 = i3;
            i17++;
            size2 = i22;
            qx6Var2 = qx6Var;
            pr3Var2 = pr3Var;
            list2 = list9;
            z3 = true;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            i54 i54Var = (i54) list.get(i30);
            jo4 jo4Var4 = new jo4();
            jo4Var4.a = i54Var.a();
            jo4Var4.s = dg7.n("application/x-emsg");
            t1cVarArr[i16] = new t1c(i54Var.a() + ":" + i30, new ko4(jo4Var4));
            c63VarArr[i16] = new c63(5, 2, new int[0], -1, -1, -1, -1, i30, null);
            i30++;
            i16++;
        }
        Pair create = Pair.create(new u1c(t1cVarArr), c63VarArr);
        this.s = (u1c) create.first;
        this.w = (c63[]) create.second;
        this.R = Long.MIN_VALUE;
    }

    public static boolean b(fa faVar, fa faVar2) {
        int i = faVar.b;
        List list = faVar.c;
        int i2 = faVar2.b;
        List list2 = faVar2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            ko4 ko4Var = ((ub9) list.get(0)).a;
            ko4 ko4Var2 = ((ub9) list2.get(0)).a;
            int i3 = ko4Var.f & (-16385);
            int i4 = ko4Var2.f & (-16385);
            if (Objects.equals(ko4Var.d, ko4Var2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static te3 g(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            te3 te3Var = (te3) list.get(i);
            if (str.equals(te3Var.a)) {
                return te3Var;
            }
        }
        return null;
    }

    public static void k(qx6 qx6Var, ko4[] ko4VarArr) {
        for (int i = 0; i < ko4VarArr.length; i++) {
            ko4 ko4Var = ko4VarArr[i];
            n31 n31Var = (n31) qx6Var.c;
            if (n31Var.b && ((uif) n31Var.c).j(ko4Var)) {
                jo4 a = ko4Var.a();
                String str = ko4Var.l;
                a.s = dg7.n("application/x-media3-cues");
                a.T = ((uif) n31Var.c).y(ko4Var);
                StringBuilder sb = new StringBuilder();
                sb.append(ko4Var.t);
                sb.append(str != null ? " ".concat(str) : "");
                a.k = sb.toString();
                a.x = Long.MAX_VALUE;
                ko4Var = new ko4(a);
            }
            ko4VarArr[i] = ko4Var;
        }
    }

    public static ko4[] o(te3 te3Var, Pattern pattern, ko4 ko4Var) {
        String str = te3Var.b;
        if (str == null) {
            return new ko4[]{ko4Var};
        }
        String str2 = gcc.a;
        String[] split = str.split(";", -1);
        ko4[] ko4VarArr = new ko4[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new ko4[]{ko4Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            jo4 a = ko4Var.a();
            a.a = ko4Var.a + ":" + parseInt;
            a.S = parseInt;
            a.d = matcher.group(2);
            ko4VarArr[i] = new ko4(a);
        }
        return ko4VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0278 A[LOOP:10: B:137:0x0276->B:138:0x0278, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // xt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(e74[] e74VarArr, boolean[] zArr, at9[] at9VarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        t1c t1cVar;
        int i5;
        fg8 fg8Var;
        int[] iArr3;
        long j2;
        ?? r13;
        boolean z2;
        boolean z3;
        e74[] e74VarArr2 = e74VarArr;
        int[] iArr4 = new int[e74VarArr2.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= e74VarArr2.length) {
                break;
            }
            e74 e74Var = e74VarArr2[i7];
            if (e74Var != null) {
                iArr4[i7] = this.s.b(e74Var.c());
            } else {
                iArr4[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < e74VarArr2.length; i8++) {
            if (e74VarArr2[i8] == null || !zArr[i8]) {
                ?? r4 = at9VarArr[i8];
                if (r4 instanceof wh2) {
                    ((wh2) r4).C(this);
                } else if (r4 instanceof vh2) {
                    vh2 vh2Var = (vh2) r4;
                    boolean[] zArr3 = vh2Var.e.d;
                    int i9 = vh2Var.c;
                    yve.p(zArr3[i9]);
                    zArr3[i9] = false;
                }
                at9VarArr[i8] = null;
            }
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= e74VarArr2.length) {
                break;
            }
            ?? r42 = at9VarArr[i10];
            if ((r42 instanceof z24) || (r42 instanceof vh2)) {
                int i11 = i(iArr4, i10);
                if (i11 == -1) {
                    z3 = at9VarArr[i10] instanceof z24;
                } else {
                    ?? r10 = at9VarArr[i10];
                    z3 = (r10 instanceof vh2) && ((vh2) r10).a == at9VarArr[i11];
                }
                if (!z3) {
                    ?? r43 = at9VarArr[i10];
                    if (r43 instanceof vh2) {
                        vh2 vh2Var2 = (vh2) r43;
                        boolean[] zArr4 = vh2Var2.e.d;
                        int i12 = vh2Var2.c;
                        yve.p(zArr4[i12]);
                        zArr4[i12] = false;
                    }
                    at9VarArr[i10] = null;
                }
            }
            i10++;
        }
        int i13 = 0;
        while (i13 < e74VarArr2.length) {
            e74 e74Var2 = e74VarArr2[i13];
            if (e74Var2 == null) {
                iArr2 = iArr4;
                i2 = i6;
                i3 = i13;
            } else {
                ?? r12 = at9VarArr[i13];
                if (r12 == null) {
                    zArr2[i13] = z;
                    c63 c63Var = this.w[iArr4[i13]];
                    byte b = c63Var.c;
                    if (b == 0) {
                        int i14 = c63Var.f;
                        ?? r29 = i14 != i ? z ? 1 : 0 : i6;
                        if (r29 != 0) {
                            t1cVar = this.s.a(i14);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            t1cVar = null;
                        }
                        mo5 p = po5.p();
                        int i15 = i6;
                        if (c63Var.g != i) {
                            int i16 = i15;
                            z = z;
                            while (i16 < c63Var.h) {
                                c63[] c63VarArr = this.w;
                                boolean z4 = z == true ? 1 : 0;
                                ko4 ko4Var = c63VarArr[c63Var.g + i16].i;
                                if (ko4Var != null) {
                                    p.c(ko4Var);
                                }
                                i16++;
                                z = z4 ? 1 : 0;
                            }
                        }
                        int i17 = z;
                        j99 f = p.f();
                        int i18 = i4 + f.d;
                        int i19 = i13;
                        ko4[] ko4VarArr = new ko4[i18];
                        int[] iArr5 = new int[i18];
                        if (r29 != 0) {
                            ko4VarArr[i15] = t1cVar.d[i15];
                            iArr5[i15] = 5;
                            i5 = i17;
                        } else {
                            i5 = i15;
                        }
                        mo5 p2 = po5.p();
                        for (int i20 = i15; i20 < f.d; i20++) {
                            ko4 ko4Var2 = (ko4) f.get(i20);
                            ko4VarArr[i5] = ko4Var2;
                            iArr5[i5] = 3;
                            p2.c(ko4Var2);
                            i5++;
                        }
                        j99 f2 = p2.f();
                        if (!this.L.d || r29 == 0) {
                            fg8Var = null;
                        } else {
                            gg8 gg8Var = this.y;
                            fg8Var = new fg8(gg8Var, gg8Var.a);
                        }
                        z53 z53Var = this.L;
                        int i21 = this.M;
                        int[] iArr6 = c63Var.a;
                        long d = z53Var.d(i21);
                        List list = z53Var.b(i21).c;
                        int i22 = i15;
                        while (true) {
                            if (i22 >= iArr6.length) {
                                iArr3 = iArr4;
                                j2 = -9223372036854775807L;
                                break;
                            }
                            List list2 = ((fa) list.get(iArr6[i22])).c;
                            iArr3 = iArr4;
                            for (int i23 = i15; i23 < list2.size(); i23++) {
                                j63 b2 = ((ub9) list2.get(i23)).b();
                                if (b2 != null && b2.Y(d) != 0) {
                                    j2 = b2.f(b2.I(j, d));
                                    break;
                                }
                            }
                            i22++;
                            iArr4 = iArr3;
                        }
                        long j3 = j2;
                        if (this.O) {
                            z53 z53Var2 = this.L;
                            int i24 = this.M;
                            int[] iArr7 = c63Var.a;
                            List list3 = z53Var2.b(i24).c;
                            mo5 p3 = po5.p();
                            int length = iArr7.length;
                            for (int i25 = i15; i25 < length; i25++) {
                                p3.d(((fa) list3.get(iArr7[i25])).c);
                            }
                            j99 f3 = p3.f();
                            for (int i26 = i15; i26 < e74Var2.length(); i26++) {
                                ko4 ko4Var3 = ((ub9) f3.get(e74Var2.j(i26))).a;
                                if (!dg7.a(ko4Var3.t, ko4Var3.l)) {
                                    r13 = i17;
                                    break;
                                }
                            }
                        }
                        r13 = i15;
                        qx6 qx6Var = this.b;
                        ra6 ra6Var = this.n;
                        z53 z53Var3 = this.L;
                        u8a u8aVar = this.f;
                        int i27 = this.M;
                        int[] iArr8 = c63Var.a;
                        int i28 = c63Var.b;
                        long j4 = this.h;
                        v2c v2cVar = this.c;
                        h73 createDataSource = ((f73) qx6Var.b).createDataSource();
                        if (v2cVar != null) {
                            createDataSource.addTransferListener(v2cVar);
                        }
                        i3 = i19;
                        fg8 fg8Var2 = fg8Var;
                        iArr2 = iArr3;
                        wh2 wh2Var = new wh2(c63Var.b, iArr5, ko4VarArr, new pa3((n31) qx6Var.c, ra6Var, z53Var3, u8aVar, i27, iArr8, e74Var2, i28, createDataSource, j4, r29, f2, fg8Var), this, this.r, j, this.d, this.G, this.e, this.F, r13, j3, null);
                        long j5 = this.R;
                        if (wh2Var.S) {
                            long j6 = wh2Var.R;
                            if (j6 != Long.MIN_VALUE && (j5 == Long.MIN_VALUE || j5 > j6)) {
                                z2 = true;
                                wh2Var.R = j5;
                                wh2Var.y.K(j5);
                                for (ys9 ys9Var : wh2Var.E) {
                                    ys9Var.K(j5);
                                }
                                i2 = 0;
                                if (z2) {
                                    wh2Var.S = false;
                                    wh2Var.f.f(wh2Var);
                                }
                                synchronized (this) {
                                    this.E.put(wh2Var, fg8Var2);
                                }
                                at9VarArr[i3] = wh2Var;
                            }
                        }
                        z2 = false;
                        wh2Var.R = j5;
                        wh2Var.y.K(j5);
                        while (r9 < r6) {
                        }
                        i2 = 0;
                        if (z2) {
                        }
                        synchronized (this) {
                        }
                    } else {
                        iArr2 = iArr4;
                        i2 = i6;
                        i3 = i13;
                        if (b == 2) {
                            at9VarArr[i3] = new h54((i54) this.N.get(c63Var.d), e74Var2.c().d[i2], this.L.d);
                        }
                    }
                } else {
                    iArr2 = iArr4;
                    i2 = i6;
                    i3 = i13;
                    if (r12 instanceof wh2) {
                        ((wh2) r12).e.i = e74Var2;
                    }
                }
            }
            i13 = i3 + 1;
            e74VarArr2 = e74VarArr;
            i6 = i2;
            iArr4 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr9 = iArr4;
        ?? r1 = i6;
        int i29 = r1;
        while (i29 < e74VarArr.length) {
            if (at9VarArr[i29] != null || e74VarArr[i29] == null) {
                iArr = iArr9;
            } else {
                iArr = iArr9;
                c63 c63Var2 = this.w[iArr[i29]];
                if (c63Var2.c != 1) {
                    continue;
                } else {
                    int i30 = i(iArr, i29);
                    if (i30 != -1) {
                        wh2 wh2Var2 = (wh2) at9VarArr[i30];
                        int i31 = c63Var2.b;
                        boolean[] zArr5 = wh2Var2.d;
                        ys9[] ys9VarArr = wh2Var2.E;
                        for (int i32 = r1; i32 < ys9VarArr.length; i32++) {
                            if (wh2Var2.b[i32] == i31) {
                                yve.p(!zArr5[i32]);
                                zArr5[i32] = true;
                                ys9VarArr[i32].J(j, true);
                                at9VarArr[i29] = new vh2(wh2Var2, wh2Var2, ys9VarArr[i32], i32);
                            }
                        }
                        grb.g();
                        return 0L;
                    }
                    at9VarArr[i29] = new z24();
                }
            }
            i29++;
            iArr9 = iArr;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length2 = at9VarArr.length;
        for (int i33 = r1; i33 < length2; i33++) {
            ?? r9 = at9VarArr[i33];
            if (r9 instanceof wh2) {
                wh2 wh2Var3 = (wh2) r9;
                if (this.P) {
                    wh2Var3.P = true;
                }
                arrayList.add(wh2Var3);
            } else if (r9 instanceof h54) {
                arrayList2.add((h54) r9);
            }
        }
        wh2[] wh2VarArr = new wh2[arrayList.size()];
        this.I = wh2VarArr;
        arrayList.toArray(wh2VarArr);
        h54[] h54VarArr = new h54[arrayList2.size()];
        this.J = h54VarArr;
        arrayList2.toArray(h54VarArr);
        rg7 rg7Var = this.x;
        AbstractList b3 = ose.b(arrayList, new p31((byte) 4));
        rg7Var.getClass();
        this.K = new er2(arrayList, b3);
        if (this.O) {
            this.O = r1;
            this.Q = j;
            if (!this.P) {
                wh2[] wh2VarArr2 = this.I;
                int length3 = wh2VarArr2.length;
                int i34 = r1;
                while (true) {
                    if (i34 >= length3) {
                        break;
                    }
                    if (wh2VarArr2[i34].z()) {
                        this.S = true;
                        wh2[] wh2VarArr3 = this.I;
                        int length4 = wh2VarArr3.length;
                        for (int i35 = r1; i35 < length4; i35++) {
                            wh2VarArr3[i35].Q = true;
                        }
                    } else {
                        i34++;
                    }
                }
            }
        }
        return j;
    }

    @Override // xt6
    public final void d() {
        this.P = true;
    }

    @Override // i8a
    public final boolean e() {
        return this.K.e();
    }

    @Override // h8a
    public final void f(i8a i8aVar) {
        this.H.f(this);
    }

    @Override // i8a
    public final long h() {
        return this.K.h();
    }

    public final int i(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 != -1) {
            c63[] c63VarArr = this.w;
            int i3 = c63VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && c63VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r3 < (((r9.V() + r7) + r10) - 1)) goto L18;
     */
    @Override // xt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(long j, az9 az9Var) {
        long j2;
        long j3 = j;
        wh2[] wh2VarArr = this.I;
        int length = wh2VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            wh2 wh2Var = wh2VarArr[i2];
            if (wh2Var.a == 2) {
                na3[] na3VarArr = wh2Var.e.h;
                int length2 = na3VarArr.length;
                while (i < length2) {
                    na3 na3Var = na3VarArr[i];
                    j63 j63Var = na3Var.d;
                    long j4 = na3Var.f;
                    j63 j63Var2 = na3Var.d;
                    if (j63Var != null) {
                        long c = na3Var.c();
                        if (c != 0) {
                            j63Var2.getClass();
                            long I = j63Var2.I(j3, na3Var.e) + j4;
                            long e = na3Var.e(I);
                            if (e < j3) {
                                if (c != -1) {
                                    j63Var2.getClass();
                                }
                                j2 = na3Var.e(I + 1);
                                return az9Var.a(j3, e, j2);
                            }
                            j2 = e;
                            return az9Var.a(j3, e, j2);
                        }
                    }
                    i++;
                    j3 = j;
                }
            } else {
                i2++;
                j3 = j;
            }
        }
        return j;
    }

    @Override // xt6
    public final void l() {
        this.n.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // xt6
    public final long m(long j) {
        int i;
        pg0 pg0Var;
        boolean J;
        int i2;
        boolean z;
        pg0 pg0Var2;
        wh2[] wh2VarArr = this.I;
        int length = wh2VarArr.length;
        boolean z2 = false;
        int i3 = 0;
        while (i3 < length) {
            wh2 wh2Var = wh2VarArr[i3];
            ys9[] ys9VarArr = wh2Var.E;
            ys9 ys9Var = wh2Var.y;
            rx6 rx6Var = wh2Var.r;
            ?? r14 = wh2Var.w;
            wh2Var.K = j;
            wh2Var.N = z2;
            wh2Var.O = z2;
            if (wh2Var.y()) {
                wh2Var.J = j;
                z = z2;
                i = i3;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 >= r14.size()) {
                        i = i3;
                        break;
                    }
                    pg0Var = (pg0) r14.get(r15);
                    long j2 = pg0Var.h;
                    i = i3;
                    if (j2 == j && pg0Var.w == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    r15++;
                    i3 = i;
                }
                pg0Var = null;
                if (pg0Var != null) {
                    J = ys9Var.I(pg0Var.e(0));
                } else {
                    long h = wh2Var.h();
                    J = ys9Var.J(j, h == Long.MIN_VALUE || j < h);
                }
                if (!J || (pg0Var2 = wh2Var.M) == null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    if (pg0Var2.e(0) <= ys9Var.v()) {
                        J = false;
                    }
                }
                if (J) {
                    wh2Var.L = wh2Var.B(ys9Var.v(), i2);
                    for (ys9 ys9Var2 : ys9VarArr) {
                        ys9Var2.J(j, true);
                    }
                } else {
                    wh2Var.J = j;
                    wh2Var.S = false;
                    r14.clear();
                    wh2Var.L = 0;
                    if (rx6Var.Z()) {
                        ys9Var.l();
                        for (ys9 ys9Var3 : ys9VarArr) {
                            ys9Var3.l();
                        }
                        rx6Var.u();
                    } else {
                        rx6Var.d = null;
                        z = false;
                        ys9Var.G(false);
                        for (ys9 ys9Var4 : wh2Var.E) {
                            ys9Var4.G(false);
                        }
                    }
                }
                z = false;
            }
            i3 = i + 1;
            z2 = z;
        }
        h54[] h54VarArr = this.J;
        int length2 = h54VarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            h54 h54Var = h54VarArr[r5];
            int b = gcc.b(h54Var.c, j, true);
            h54Var.h = b;
            h54Var.n = (h54Var.d && b == h54Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // xt6
    public final void n(long j) {
        for (wh2 wh2Var : this.I) {
            ys9 ys9Var = wh2Var.y;
            if (!wh2Var.y()) {
                int i = ys9Var.q;
                ys9Var.k(j, true);
                int i2 = ys9Var.q;
                if (i2 > i) {
                    long r = ys9Var.r();
                    int i3 = 0;
                    while (true) {
                        ys9[] ys9VarArr = wh2Var.E;
                        if (i3 >= ys9VarArr.length) {
                            break;
                        }
                        ys9VarArr[i3].k(r, wh2Var.d[i3]);
                        i3++;
                    }
                }
                int min = Math.min(wh2Var.B(i2, 0), wh2Var.L);
                if (min > 0) {
                    gcc.Y(0, min, wh2Var.w);
                    wh2Var.L -= min;
                }
            }
        }
    }

    @Override // xt6
    public final long p() {
        if (!this.S) {
            return -9223372036854775807L;
        }
        boolean z = false;
        for (wh2 wh2Var : this.I) {
            wh2Var.getClass();
            try {
                boolean z2 = wh2Var.O;
                wh2Var.O = false;
                z |= z2;
            } catch (Throwable th) {
                wh2Var.O = false;
                throw th;
            }
        }
        wh2[] wh2VarArr = this.I;
        int length = wh2VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                this.S = false;
                for (wh2 wh2Var2 : this.I) {
                    wh2Var2.Q = false;
                }
            } else {
                if (wh2VarArr[i].z()) {
                    break;
                }
                i++;
            }
        }
        if (z) {
            return this.Q;
        }
        return -9223372036854775807L;
    }

    @Override // xt6
    public final void q(wt6 wt6Var, long j) {
        this.H = wt6Var;
        wt6Var.a(this);
    }

    @Override // xt6
    public final u1c r() {
        return this.s;
    }

    @Override // i8a
    public final boolean s(xa6 xa6Var) {
        return this.K.s(xa6Var);
    }

    @Override // i8a
    public final long t() {
        return this.K.t();
    }

    @Override // i8a
    public final void u(long j) {
        int i;
        wh2[] wh2VarArr = this.I;
        int length = wh2VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            wh2 wh2Var = wh2VarArr[i2];
            if (!wh2Var.r.Z()) {
                long d = this.L.d(this.M);
                ys9 ys9Var = wh2Var.y;
                yve.p(!wh2Var.r.Z());
                if (!wh2Var.y() && d != -9223372036854775807L && !wh2Var.w.isEmpty()) {
                    pg0 w = wh2Var.w();
                    long j2 = w.x;
                    if (j2 == -9223372036854775807L) {
                        j2 = w.n;
                    }
                    if (j2 > d) {
                        long s = ys9Var.s();
                        if (s > d) {
                            ys9Var.m(Math.max(d, ys9Var.t() + 1));
                            ys9[] ys9VarArr = wh2Var.E;
                            int length2 = ys9VarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                ys9 ys9Var2 = ys9VarArr[i3];
                                ys9Var2.m(Math.max(d, ys9Var2.t() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            wh2Var.h.B(d, wh2Var.a, s);
                            i2 = i + 1;
                        }
                    }
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.K.u(j);
    }
}
