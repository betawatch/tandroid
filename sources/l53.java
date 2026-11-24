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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l53 implements sr6, p4a {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final kp F;
    public final vq3 G;
    public rr6 H;
    public lq2 K;
    public h53 L;
    public int M;
    public List N;
    public boolean P;
    public long Q;
    public final long R;
    public boolean S;
    public final int a;
    public final lv6 b;
    public final vyb c;
    public final yq3 d;
    public final i2f e;
    public final c5a f;
    public final long h;
    public final n86 n;
    public final mv6 r;
    public final txb s;
    public final k53[] w;
    public final ie7 x;
    public final rc8 y;
    public boolean O = true;
    public eh2[] I = new eh2[0];
    public l44[] J = new l44[0];
    public final IdentityHashMap E = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public l53(int i, h53 h53Var, c5a c5aVar, int i2, lv6 lv6Var, vyb vybVar, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, long j, n86 n86Var, mv6 mv6Var, ie7 ie7Var, lj9 lj9Var, uc8 uc8Var) {
        int i3;
        int[][] iArr;
        boolean[] zArr;
        fm4[][] fm4VarArr;
        fm4[] fm4VarArr2;
        zd3 h;
        Integer num;
        lv6 lv6Var2 = lv6Var;
        yq3 yq3Var2 = yq3Var;
        this.a = i;
        this.L = h53Var;
        this.f = c5aVar;
        this.M = i2;
        this.b = lv6Var2;
        this.c = vybVar;
        this.d = yq3Var2;
        this.G = vq3Var;
        this.e = i2fVar;
        this.F = kpVar;
        this.h = j;
        this.n = n86Var;
        this.r = mv6Var;
        this.x = ie7Var;
        boolean z = true;
        this.y = new rc8(h53Var, lj9Var, mv6Var);
        int i4 = 0;
        ie7Var.getClass();
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        this.K = new lq2(w59Var, w59Var);
        f38 b = h53Var.b(i2);
        List list = b.d;
        this.N = list;
        List list2 = b.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(coe.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i5 = 0; i5 < size; i5++) {
            hashMap.put(Long.valueOf(((ea) list2.get(i5)).a), Integer.valueOf(i5));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i5));
            arrayList.add(arrayList2);
            sparseArray.put(i5, arrayList2);
        }
        int i6 = 0;
        while (i6 < size) {
            ea eaVar = (ea) list2.get(i6);
            List list3 = eaVar.e;
            List list4 = eaVar.f;
            boolean z2 = z;
            zd3 h2 = h("http://dashif.org/guidelines/trickmode", list3);
            h2 = h2 == null ? h("http://dashif.org/guidelines/trickmode", list4) : h2;
            int intValue = (h2 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(h2.b)))) == null || !c(eaVar, (ea) list2.get(num.intValue()))) ? i6 : num.intValue();
            if (intValue == i6 && (h = h("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = h.b;
                String str2 = g8c.a;
                String[] split = str.split(",", -1);
                int length = split.length;
                for (int i7 = i4; i7 < length; i7++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i7])));
                    if (num2 != null && c(eaVar, (ea) list2.get(num2.intValue()))) {
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
            int[] e = gle.e((Collection) arrayList.get(i8));
            iArr2[i8] = e;
            Arrays.sort(e);
        }
        boolean[] zArr2 = new boolean[size2];
        fm4[][] fm4VarArr3 = new fm4[size2][];
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
                List list7 = ((ea) list2.get(iArr3[i11])).c;
                iArr = iArr2;
                for (int i12 = 0; i12 < list7.size(); i12++) {
                    if (!((i89) list7.get(i12)).d.isEmpty()) {
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
                    fm4VarArr = fm4VarArr3;
                    fm4VarArr2 = new fm4[0];
                    break;
                }
                int i14 = iArr4[i13];
                ea eaVar2 = (ea) list2.get(i14);
                List list8 = ((ea) list2.get(i14)).d;
                int[] iArr5 = iArr4;
                int i15 = 0;
                while (i15 < list8.size()) {
                    zd3 zd3Var = (zd3) list8.get(i15);
                    zArr = zArr2;
                    fm4VarArr = fm4VarArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(zd3Var.a)) {
                        em4 em4Var = new em4();
                        em4Var.s = ud7.n("application/cea-608");
                        em4Var.a = ls6.p(new StringBuilder(), eaVar2.a, ":cea608");
                        fm4VarArr2 = u(zd3Var, T, new fm4(em4Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(zd3Var.a)) {
                        em4 em4Var2 = new em4();
                        em4Var2.s = ud7.n("application/cea-708");
                        em4Var2.a = ls6.p(new StringBuilder(), eaVar2.a, ":cea708");
                        fm4VarArr2 = u(zd3Var, U, new fm4(em4Var2));
                        break;
                    }
                    i15++;
                    fm4VarArr3 = fm4VarArr;
                    zArr2 = zArr;
                }
                i13++;
                iArr4 = iArr5;
            }
            fm4VarArr[i9] = fm4VarArr2;
            i10 += fm4VarArr2.length;
            i9++;
            fm4VarArr3 = fm4VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        fm4[][] fm4VarArr4 = fm4VarArr3;
        int size3 = list.size() + i10 + size2;
        sxb[] sxbVarArr = new sxb[size3];
        k53[] k53VarArr = new k53[size3];
        int i16 = 0;
        int i17 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i18 : iArr7) {
                arrayList3.addAll(((ea) list2.get(i18)).c);
            }
            int size4 = arrayList3.size();
            fm4[] fm4VarArr5 = new fm4[size4];
            int i19 = 0;
            while (i19 < size4) {
                int i20 = size2;
                fm4 fm4Var = ((i89) arrayList3.get(i19)).a;
                int i21 = i16;
                em4 a = fm4Var.a();
                a.W = yq3Var2.w(fm4Var);
                fm4VarArr5[i19] = new fm4(a);
                i19++;
                size2 = i20;
                i16 = i21;
            }
            int i22 = size2;
            int i23 = i16;
            ea eaVar3 = (ea) list2.get(iArr7[0]);
            long j2 = eaVar3.a;
            String l = j2 != -1 ? Long.toString(j2) : de9.k(i17, "unset:");
            int i24 = i23 + 1;
            if (zArr3[i17]) {
                i3 = i23 + 2;
            } else {
                i3 = i24;
                i24 = -1;
            }
            int i25 = fm4VarArr4[i17].length != 0 ? i3 : -1;
            n(lv6Var2, fm4VarArr5);
            List list9 = list2;
            sxbVarArr[i23] = new sxb(l, fm4VarArr5);
            int i26 = i23;
            k53VarArr[i26] = new k53(eaVar3.b, 0, iArr7, i23, i24, i25, fm4VarArr4[i17].length, -1, null);
            int i27 = -1;
            if (i24 != -1) {
                String o = tb4.o(l, ":emsg");
                em4 em4Var3 = new em4();
                em4Var3.a = o;
                em4Var3.s = ud7.n("application/x-emsg");
                em4Var3.m = l;
                fm4[] fm4VarArr6 = new fm4[z3];
                fm4VarArr6[0] = new fm4(em4Var3);
                sxbVarArr[i24] = new sxb(o, fm4VarArr6);
                k53 k53Var = new k53(5, 1, iArr7, i26, -1, -1, -1, -1, null);
                i26 = i26;
                k53VarArr[i24] = k53Var;
                i27 = -1;
            }
            if (i25 != i27) {
                fm4[] fm4VarArr7 = fm4VarArr4[i17];
                n(lv6Var2, fm4VarArr7);
                int i28 = 0;
                while (i28 < fm4VarArr7.length) {
                    fm4 fm4Var2 = fm4VarArr7[i28];
                    fm4[] fm4VarArr8 = fm4VarArr4[i17];
                    em4 a2 = fm4Var2.a();
                    a2.m = l;
                    int i29 = i26;
                    fm4VarArr8[i28] = new fm4(a2);
                    k53VarArr[i25] = new k53(3, 1, iArr7, i29, -1, -1, -1, -1, fm4Var2);
                    sxbVarArr[i25] = new sxb(l + ":cc:" + i28, fm4VarArr4[i17][i28]);
                    i25++;
                    i28++;
                    i26 = i29;
                }
                i3 += fm4VarArr7.length;
            }
            i16 = i3;
            i17++;
            size2 = i22;
            lv6Var2 = lv6Var;
            yq3Var2 = yq3Var;
            list2 = list9;
            z3 = true;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            m44 m44Var = (m44) list.get(i30);
            em4 em4Var4 = new em4();
            em4Var4.a = m44Var.a();
            em4Var4.s = ud7.n("application/x-emsg");
            sxbVarArr[i16] = new sxb(m44Var.a() + ":" + i30, new fm4(em4Var4));
            k53VarArr[i16] = new k53(5, 2, new int[0], -1, -1, -1, -1, i30, null);
            i30++;
            i16++;
        }
        Pair create = Pair.create(new txb(sxbVarArr), k53VarArr);
        this.s = (txb) create.first;
        this.w = (k53[]) create.second;
        this.R = Long.MIN_VALUE;
    }

    public static boolean c(ea eaVar, ea eaVar2) {
        int i = eaVar.b;
        List list = eaVar.c;
        int i2 = eaVar2.b;
        List list2 = eaVar2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            fm4 fm4Var = ((i89) list.get(0)).a;
            fm4 fm4Var2 = ((i89) list2.get(0)).a;
            int i3 = fm4Var.f & (-16385);
            int i4 = fm4Var2.f & (-16385);
            if (Objects.equals(fm4Var.d, fm4Var2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static zd3 h(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            zd3 zd3Var = (zd3) list.get(i);
            if (str.equals(zd3Var.a)) {
                return zd3Var;
            }
        }
        return null;
    }

    public static void n(lv6 lv6Var, fm4[] fm4VarArr) {
        for (int i = 0; i < fm4VarArr.length; i++) {
            fm4 fm4Var = fm4VarArr[i];
            e31 e31Var = (e31) lv6Var.c;
            if (e31Var.b && ((eef) e31Var.c).h(fm4Var)) {
                em4 a = fm4Var.a();
                String str = fm4Var.l;
                a.s = ud7.n("application/x-media3-cues");
                a.T = ((eef) e31Var.c).y(fm4Var);
                StringBuilder sb = new StringBuilder();
                sb.append(fm4Var.t);
                sb.append(str != null ? " ".concat(str) : "");
                a.k = sb.toString();
                a.x = Long.MAX_VALUE;
                fm4Var = new fm4(a);
            }
            fm4VarArr[i] = fm4Var;
        }
    }

    public static fm4[] u(zd3 zd3Var, Pattern pattern, fm4 fm4Var) {
        String str = zd3Var.b;
        if (str == null) {
            return new fm4[]{fm4Var};
        }
        String str2 = g8c.a;
        String[] split = str.split(";", -1);
        fm4[] fm4VarArr = new fm4[split.length];
        for (int i = 0; i < split.length; i++) {
            Matcher matcher = pattern.matcher(split[i]);
            if (!matcher.matches()) {
                return new fm4[]{fm4Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            em4 a = fm4Var.a();
            a.a = fm4Var.a + ":" + parseInt;
            a.S = parseInt;
            a.d = matcher.group(2);
            fm4VarArr[i] = new fm4(a);
        }
        return fm4VarArr;
    }

    @Override // p4a
    public final void b(q4a q4aVar) {
        this.H.b(this);
    }

    @Override // q4a
    public final boolean d() {
        return this.K.d();
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
    @Override // sr6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        sxb sxbVar;
        int i5;
        qc8 qc8Var;
        int[] iArr3;
        long j2;
        ?? r13;
        boolean z2;
        boolean z3;
        k64[] k64VarArr2 = k64VarArr;
        int[] iArr4 = new int[k64VarArr2.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= k64VarArr2.length) {
                break;
            }
            k64 k64Var = k64VarArr2[i7];
            if (k64Var != null) {
                iArr4[i7] = this.s.b(k64Var.c());
            } else {
                iArr4[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < k64VarArr2.length; i8++) {
            if (k64VarArr2[i8] == null || !zArr[i8]) {
                ?? r4 = ip9VarArr[i8];
                if (r4 instanceof eh2) {
                    ((eh2) r4).C(this);
                } else if (r4 instanceof dh2) {
                    dh2 dh2Var = (dh2) r4;
                    boolean[] zArr3 = dh2Var.e.d;
                    int i9 = dh2Var.c;
                    gre.p(zArr3[i9]);
                    zArr3[i9] = false;
                }
                ip9VarArr[i8] = null;
            }
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= k64VarArr2.length) {
                break;
            }
            ?? r42 = ip9VarArr[i10];
            if ((r42 instanceof e24) || (r42 instanceof dh2)) {
                int j3 = j(iArr4, i10);
                if (j3 == -1) {
                    z3 = ip9VarArr[i10] instanceof e24;
                } else {
                    ?? r10 = ip9VarArr[i10];
                    z3 = (r10 instanceof dh2) && ((dh2) r10).a == ip9VarArr[j3];
                }
                if (!z3) {
                    ?? r43 = ip9VarArr[i10];
                    if (r43 instanceof dh2) {
                        dh2 dh2Var2 = (dh2) r43;
                        boolean[] zArr4 = dh2Var2.e.d;
                        int i11 = dh2Var2.c;
                        gre.p(zArr4[i11]);
                        zArr4[i11] = false;
                    }
                    ip9VarArr[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < k64VarArr2.length) {
            k64 k64Var2 = k64VarArr2[i12];
            if (k64Var2 == null) {
                iArr2 = iArr4;
                i2 = i6;
                i3 = i12;
            } else {
                ?? r12 = ip9VarArr[i12];
                if (r12 == null) {
                    zArr2[i12] = z;
                    k53 k53Var = this.w[iArr4[i12]];
                    byte b = k53Var.c;
                    if (b == 0) {
                        int i13 = k53Var.f;
                        ?? r29 = i13 != i ? z ? 1 : 0 : i6;
                        if (r29 != 0) {
                            sxbVar = this.s.a(i13);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            sxbVar = null;
                        }
                        jm5 p = mm5.p();
                        int i14 = i6;
                        if (k53Var.g != i) {
                            int i15 = i14;
                            z = z;
                            while (i15 < k53Var.h) {
                                k53[] k53VarArr = this.w;
                                boolean z4 = z == true ? 1 : 0;
                                fm4 fm4Var = k53VarArr[k53Var.g + i15].i;
                                if (fm4Var != null) {
                                    p.c(fm4Var);
                                }
                                i15++;
                                z = z4 ? 1 : 0;
                            }
                        }
                        int i16 = z;
                        w59 f = p.f();
                        int i17 = i4 + f.d;
                        int i18 = i12;
                        fm4[] fm4VarArr = new fm4[i17];
                        int[] iArr5 = new int[i17];
                        if (r29 != 0) {
                            fm4VarArr[i14] = sxbVar.d[i14];
                            iArr5[i14] = 5;
                            i5 = i16;
                        } else {
                            i5 = i14;
                        }
                        jm5 p2 = mm5.p();
                        for (int i19 = i14; i19 < f.d; i19++) {
                            fm4 fm4Var2 = (fm4) f.get(i19);
                            fm4VarArr[i5] = fm4Var2;
                            iArr5[i5] = 3;
                            p2.c(fm4Var2);
                            i5++;
                        }
                        w59 f2 = p2.f();
                        if (!this.L.d || r29 == 0) {
                            qc8Var = null;
                        } else {
                            rc8 rc8Var = this.y;
                            qc8Var = new qc8(rc8Var, rc8Var.a);
                        }
                        h53 h53Var = this.L;
                        int i20 = this.M;
                        int[] iArr6 = k53Var.a;
                        long d = h53Var.d(i20);
                        List list = h53Var.b(i20).c;
                        int i21 = i14;
                        while (true) {
                            if (i21 >= iArr6.length) {
                                iArr3 = iArr4;
                                j2 = -9223372036854775807L;
                                break;
                            }
                            List list2 = ((ea) list.get(iArr6[i21])).c;
                            iArr3 = iArr4;
                            for (int i22 = i14; i22 < list2.size(); i22++) {
                                r53 b2 = ((i89) list2.get(i22)).b();
                                if (b2 != null && b2.f0(d) != 0) {
                                    j2 = b2.e(b2.C(j, d));
                                    break;
                                }
                            }
                            i21++;
                            iArr4 = iArr3;
                        }
                        long j4 = j2;
                        if (this.O) {
                            h53 h53Var2 = this.L;
                            int i23 = this.M;
                            int[] iArr7 = k53Var.a;
                            List list3 = h53Var2.b(i23).c;
                            jm5 p3 = mm5.p();
                            int length = iArr7.length;
                            for (int i24 = i14; i24 < length; i24++) {
                                p3.d(((ea) list3.get(iArr7[i24])).c);
                            }
                            w59 f3 = p3.f();
                            for (int i25 = i14; i25 < k64Var2.length(); i25++) {
                                fm4 fm4Var3 = ((i89) f3.get(k64Var2.k(i25))).a;
                                if (!ud7.a(fm4Var3.t, fm4Var3.l)) {
                                    r13 = i16;
                                    break;
                                }
                            }
                        }
                        r13 = i14;
                        lv6 lv6Var = this.b;
                        n86 n86Var = this.n;
                        h53 h53Var3 = this.L;
                        c5a c5aVar = this.f;
                        int i26 = this.M;
                        int[] iArr8 = k53Var.a;
                        int i27 = k53Var.b;
                        long j5 = this.h;
                        vyb vybVar = this.c;
                        o63 createDataSource = ((m63) lv6Var.b).createDataSource();
                        if (vybVar != null) {
                            createDataSource.addTransferListener(vybVar);
                        }
                        i3 = i18;
                        qc8 qc8Var2 = qc8Var;
                        iArr2 = iArr3;
                        eh2 eh2Var = new eh2(k53Var.b, iArr5, fm4VarArr, new w93((e31) lv6Var.c, n86Var, h53Var3, c5aVar, i26, iArr8, k64Var2, i27, createDataSource, j5, r29, f2, qc8Var), this, this.r, j, this.d, this.G, this.e, this.F, r13, j4, null);
                        long j6 = this.R;
                        if (eh2Var.S) {
                            long j7 = eh2Var.R;
                            if (j7 != Long.MIN_VALUE && (j6 == Long.MIN_VALUE || j6 > j7)) {
                                z2 = true;
                                eh2Var.R = j6;
                                eh2Var.y.K(j6);
                                for (gp9 gp9Var : eh2Var.E) {
                                    gp9Var.K(j6);
                                }
                                i2 = 0;
                                if (z2) {
                                    eh2Var.S = false;
                                    eh2Var.f.b(eh2Var);
                                }
                                synchronized (this) {
                                    this.E.put(eh2Var, qc8Var2);
                                }
                                ip9VarArr[i3] = eh2Var;
                            }
                        }
                        z2 = false;
                        eh2Var.R = j6;
                        eh2Var.y.K(j6);
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
                        i3 = i12;
                        if (b == 2) {
                            ip9VarArr[i3] = new l44((m44) this.N.get(k53Var.d), k64Var2.c().d[i2], this.L.d);
                        }
                    }
                } else {
                    iArr2 = iArr4;
                    i2 = i6;
                    i3 = i12;
                    if (r12 instanceof eh2) {
                        ((eh2) r12).e.i = k64Var2;
                    }
                }
            }
            i12 = i3 + 1;
            k64VarArr2 = k64VarArr;
            i6 = i2;
            iArr4 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr9 = iArr4;
        ?? r1 = i6;
        int i28 = r1;
        while (i28 < k64VarArr.length) {
            if (ip9VarArr[i28] != null || k64VarArr[i28] == null) {
                iArr = iArr9;
            } else {
                iArr = iArr9;
                k53 k53Var2 = this.w[iArr[i28]];
                if (k53Var2.c != 1) {
                    continue;
                } else {
                    int j8 = j(iArr, i28);
                    if (j8 != -1) {
                        eh2 eh2Var2 = (eh2) ip9VarArr[j8];
                        int i29 = k53Var2.b;
                        boolean[] zArr5 = eh2Var2.d;
                        gp9[] gp9VarArr = eh2Var2.E;
                        for (int i30 = r1; i30 < gp9VarArr.length; i30++) {
                            if (eh2Var2.b[i30] == i29) {
                                gre.p(!zArr5[i30]);
                                zArr5[i30] = true;
                                gp9VarArr[i30].J(j, true);
                                ip9VarArr[i28] = new dh2(eh2Var2, eh2Var2, gp9VarArr[i30], i30);
                            }
                        }
                        sdb.a();
                        return 0L;
                    }
                    ip9VarArr[i28] = new e24();
                }
            }
            i28++;
            iArr9 = iArr;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length2 = ip9VarArr.length;
        for (int i31 = r1; i31 < length2; i31++) {
            ?? r9 = ip9VarArr[i31];
            if (r9 instanceof eh2) {
                eh2 eh2Var3 = (eh2) r9;
                if (this.P) {
                    eh2Var3.P = true;
                }
                arrayList.add(eh2Var3);
            } else if (r9 instanceof l44) {
                arrayList2.add((l44) r9);
            }
        }
        eh2[] eh2VarArr = new eh2[arrayList.size()];
        this.I = eh2VarArr;
        arrayList.toArray(eh2VarArr);
        l44[] l44VarArr = new l44[arrayList2.size()];
        this.J = l44VarArr;
        arrayList2.toArray(l44VarArr);
        ie7 ie7Var = this.x;
        AbstractList b3 = tne.b(arrayList, new g31((byte) 4));
        ie7Var.getClass();
        this.K = new lq2(arrayList, b3);
        if (this.O) {
            this.O = r1;
            this.Q = j;
            if (!this.P) {
                eh2[] eh2VarArr2 = this.I;
                int length3 = eh2VarArr2.length;
                int i32 = r1;
                while (true) {
                    if (i32 >= length3) {
                        break;
                    }
                    if (eh2VarArr2[i32].z()) {
                        this.S = true;
                        eh2[] eh2VarArr3 = this.I;
                        int length4 = eh2VarArr3.length;
                        for (int i33 = r1; i33 < length4; i33++) {
                            eh2VarArr3[i33].Q = true;
                        }
                    } else {
                        i32++;
                    }
                }
            }
        }
        return j;
    }

    @Override // sr6
    public final void f() {
        this.P = true;
    }

    @Override // q4a
    public final long g() {
        return this.K.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r3 < (((r9.b0() + r7) + r10) - 1)) goto L18;
     */
    @Override // sr6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(long j, gv9 gv9Var) {
        long j2;
        long j3 = j;
        eh2[] eh2VarArr = this.I;
        int length = eh2VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            eh2 eh2Var = eh2VarArr[i2];
            if (eh2Var.a == 2) {
                u93[] u93VarArr = eh2Var.e.h;
                int length2 = u93VarArr.length;
                while (i < length2) {
                    u93 u93Var = u93VarArr[i];
                    r53 r53Var = u93Var.d;
                    long j4 = u93Var.f;
                    r53 r53Var2 = u93Var.d;
                    if (r53Var != null) {
                        long c = u93Var.c();
                        if (c != 0) {
                            r53Var2.getClass();
                            long C = r53Var2.C(j3, u93Var.e) + j4;
                            long e = u93Var.e(C);
                            if (e < j3) {
                                if (c != -1) {
                                    r53Var2.getClass();
                                }
                                j2 = u93Var.e(C + 1);
                                return gv9Var.a(j3, e, j2);
                            }
                            j2 = e;
                            return gv9Var.a(j3, e, j2);
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

    public final int j(int[] iArr, int i) {
        int i2 = iArr[i];
        if (i2 != -1) {
            k53[] k53VarArr = this.w;
            int i3 = k53VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && k53VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // sr6
    public final void k() {
        this.n.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // sr6
    public final long l(long j) {
        int i;
        og0 og0Var;
        boolean J;
        int i2;
        boolean z;
        og0 og0Var2;
        eh2[] eh2VarArr = this.I;
        int length = eh2VarArr.length;
        boolean z2 = false;
        int i3 = 0;
        while (i3 < length) {
            eh2 eh2Var = eh2VarArr[i3];
            gp9[] gp9VarArr = eh2Var.E;
            gp9 gp9Var = eh2Var.y;
            mv6 mv6Var = eh2Var.r;
            ?? r14 = eh2Var.w;
            eh2Var.K = j;
            eh2Var.N = z2;
            eh2Var.O = z2;
            if (eh2Var.y()) {
                eh2Var.J = j;
                z = z2;
                i = i3;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 >= r14.size()) {
                        i = i3;
                        break;
                    }
                    og0Var = (og0) r14.get(r15);
                    long j2 = og0Var.h;
                    i = i3;
                    if (j2 == j && og0Var.w == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    r15++;
                    i3 = i;
                }
                og0Var = null;
                if (og0Var != null) {
                    J = gp9Var.I(og0Var.e(0));
                } else {
                    long g = eh2Var.g();
                    J = gp9Var.J(j, g == Long.MIN_VALUE || j < g);
                }
                if (!J || (og0Var2 = eh2Var.M) == null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    if (og0Var2.e(0) <= gp9Var.v()) {
                        J = false;
                    }
                }
                if (J) {
                    eh2Var.L = eh2Var.B(gp9Var.v(), i2);
                    for (gp9 gp9Var2 : gp9VarArr) {
                        gp9Var2.J(j, true);
                    }
                } else {
                    eh2Var.J = j;
                    eh2Var.S = false;
                    r14.clear();
                    eh2Var.L = 0;
                    if (mv6Var.W()) {
                        gp9Var.l();
                        for (gp9 gp9Var3 : gp9VarArr) {
                            gp9Var3.l();
                        }
                        mv6Var.p();
                    } else {
                        mv6Var.d = null;
                        z = false;
                        gp9Var.G(false);
                        for (gp9 gp9Var4 : eh2Var.E) {
                            gp9Var4.G(false);
                        }
                    }
                }
                z = false;
            }
            i3 = i + 1;
            z2 = z;
        }
        l44[] l44VarArr = this.J;
        int length2 = l44VarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            l44 l44Var = l44VarArr[r5];
            int b = g8c.b(l44Var.c, j, true);
            l44Var.h = b;
            l44Var.n = (l44Var.d && b == l44Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // sr6
    public final void m(long j) {
        for (eh2 eh2Var : this.I) {
            gp9 gp9Var = eh2Var.y;
            if (!eh2Var.y()) {
                int i = gp9Var.q;
                gp9Var.k(j, true);
                int i2 = gp9Var.q;
                if (i2 > i) {
                    long r = gp9Var.r();
                    int i3 = 0;
                    while (true) {
                        gp9[] gp9VarArr = eh2Var.E;
                        if (i3 >= gp9VarArr.length) {
                            break;
                        }
                        gp9VarArr[i3].k(r, eh2Var.d[i3]);
                        i3++;
                    }
                }
                int min = Math.min(eh2Var.B(i2, 0), eh2Var.L);
                if (min > 0) {
                    g8c.Y(0, min, eh2Var.w);
                    eh2Var.L -= min;
                }
            }
        }
    }

    @Override // sr6
    public final long o() {
        if (!this.S) {
            return -9223372036854775807L;
        }
        boolean z = false;
        for (eh2 eh2Var : this.I) {
            eh2Var.getClass();
            try {
                boolean z2 = eh2Var.O;
                eh2Var.O = false;
                z |= z2;
            } catch (Throwable th) {
                eh2Var.O = false;
                throw th;
            }
        }
        eh2[] eh2VarArr = this.I;
        int length = eh2VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                this.S = false;
                for (eh2 eh2Var2 : this.I) {
                    eh2Var2.Q = false;
                }
            } else {
                if (eh2VarArr[i].z()) {
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

    @Override // sr6
    public final void p(rr6 rr6Var, long j) {
        this.H = rr6Var;
        rr6Var.a(this);
    }

    @Override // sr6
    public final txb q() {
        return this.s;
    }

    @Override // q4a
    public final boolean r(t86 t86Var) {
        return this.K.r(t86Var);
    }

    @Override // q4a
    public final long s() {
        return this.K.s();
    }

    @Override // q4a
    public final void t(long j) {
        int i;
        eh2[] eh2VarArr = this.I;
        int length = eh2VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            eh2 eh2Var = eh2VarArr[i2];
            if (!eh2Var.r.W()) {
                long d = this.L.d(this.M);
                gp9 gp9Var = eh2Var.y;
                gre.p(!eh2Var.r.W());
                if (!eh2Var.y() && d != -9223372036854775807L && !eh2Var.w.isEmpty()) {
                    og0 w = eh2Var.w();
                    long j2 = w.x;
                    if (j2 == -9223372036854775807L) {
                        j2 = w.n;
                    }
                    if (j2 > d) {
                        long s = gp9Var.s();
                        if (s > d) {
                            gp9Var.m(Math.max(d, gp9Var.t() + 1));
                            gp9[] gp9VarArr = eh2Var.E;
                            int length2 = gp9VarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                gp9 gp9Var2 = gp9VarArr[i3];
                                gp9Var2.m(Math.max(d, gp9Var2.t() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            eh2Var.h.A(d, eh2Var.a, s);
                            i2 = i + 1;
                        }
                    }
                }
            }
            i = i2;
            i2 = i + 1;
        }
        this.K.t(j);
    }
}
