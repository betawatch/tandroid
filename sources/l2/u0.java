package l2;

import a8.la;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import e2.s1;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import x2.r1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class u0 {
    public final Object a;
    public final Object b;
    public final x2.d1[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public v0 g;
    public boolean h;
    public final boolean[] i;
    public final b[] j;
    public final a3.x k;
    public final f1 l;
    public u0 m;
    public r1 n;
    public a3.y o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x2.d] */
    public u0(b[] bVarArr, long j3, a3.x xVar, h6.m mVar, f1 f1Var, v0 v0Var, a3.y yVar) {
        this.j = bVarArr;
        this.p = j3;
        this.k = xVar;
        this.l = f1Var;
        x2.g0 g0Var = v0Var.a;
        this.b = g0Var.a;
        this.g = v0Var;
        this.n = r1.d;
        this.o = yVar;
        this.c = new x2.d1[bVarArr.length];
        this.i = new boolean[bVarArr.length];
        long j10 = v0Var.b;
        long j11 = v0Var.e;
        boolean z10 = v0Var.g;
        f1Var.getClass();
        Object obj = g0Var.a;
        int i7 = a.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        x2.g0 a10 = g0Var.a(pair.second);
        e1 e1Var = (e1) f1Var.d.get(obj2);
        e1Var.getClass();
        f1Var.g.add(e1Var);
        d1 d1Var = (d1) f1Var.f.get(e1Var);
        if (d1Var != null) {
            d1Var.a.f(d1Var.b);
        }
        e1Var.c.add(a10);
        x2.y c10 = e1Var.a.c(a10, mVar, j10);
        f1Var.c.put(c10, e1Var);
        f1Var.c();
        if (j11 != -9223372036854775807L) {
            c10 = new x2.d(c10, !z10, 0L, j11, 0);
        }
        this.a = c10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, x2.e0] */
    public final long a(a3.y yVar, long j3, boolean z10, boolean[] zArr) {
        b[] bVarArr;
        x2.d1[] d1VarArr;
        int i7 = 0;
        while (true) {
            boolean z11 = true;
            if (i7 >= yVar.a) {
                break;
            }
            if (z10 || !yVar.a(this.o, i7)) {
                z11 = false;
            }
            this.i[i7] = z11;
            i7++;
        }
        int i10 = 0;
        while (true) {
            bVarArr = this.j;
            int length = bVarArr.length;
            d1VarArr = this.c;
            if (i10 >= length) {
                break;
            }
            if (bVarArr[i10].b == -2) {
                d1VarArr[i10] = null;
            }
            i10++;
        }
        b();
        this.o = yVar;
        c();
        long b10 = this.a.b(yVar.c, this.i, this.c, zArr, j3);
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            if (bVarArr[i11].b == -2 && this.o.b(i11)) {
                d1VarArr[i11] = new x2.r();
            }
        }
        this.f = false;
        for (int i12 = 0; i12 < d1VarArr.length; i12++) {
            if (d1VarArr[i12] != null) {
                la.p(yVar.b(i12));
                if (bVarArr[i12].b != -2) {
                    this.f = true;
                }
            } else {
                la.p(yVar.c[i12] == null);
            }
        }
        return b10;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            a3.y yVar = this.o;
            if (i7 >= yVar.a) {
                return;
            }
            boolean b10 = yVar.b(i7);
            a3.u uVar = this.o.c[i7];
            if (b10 && uVar != null) {
                uVar.l();
            }
            i7++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            a3.y yVar = this.o;
            if (i7 >= yVar.a) {
                return;
            }
            boolean b10 = yVar.b(i7);
            a3.u uVar = this.o.c[i7];
            if (b10 && uVar != null) {
                uVar.h();
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, x2.f1] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long r10 = this.f ? this.a.r() : Long.MIN_VALUE;
        return r10 == Long.MIN_VALUE ? this.g.f : r10;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, x2.e0] */
    public final void f(float f10, e2.l1 l1Var, boolean z10) {
        this.e = true;
        this.n = this.a.q();
        a3.y j3 = j(f10, l1Var, z10);
        v0 v0Var = this.g;
        long j10 = v0Var.b;
        long j11 = v0Var.f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(j3, j10, false, new boolean[this.j.length]);
        long j12 = this.p;
        v0 v0Var2 = this.g;
        this.p = (v0Var2.b - a10) + j12;
        this.g = v0Var2.b(a10, v0Var2.c);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, x2.f1] */
    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.r() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x2.e0] */
    public final void i() {
        b();
        ?? r02 = this.a;
        try {
            boolean z10 = r02 instanceof x2.d;
            f1 f1Var = this.l;
            if (z10) {
                f1Var.f(((x2.d) r02).a);
            } else {
                f1Var.f(r02);
            }
        } catch (RuntimeException e10) {
            h2.a.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final a3.y j(float f10, e2.l1 l1Var, boolean z10) {
        a3.n nVar;
        a3.s sVar;
        a3.n nVar2;
        String str;
        a3.s sVar2;
        String str2;
        a3.n nVar3;
        int i7;
        int[] iArr;
        r1[] r1VarArr;
        int[][][] iArr2;
        r1[] r1VarArr2;
        int i10;
        boolean z11;
        t1 t1Var;
        a3.u bVar;
        b3.d dVar;
        int i11;
        int[] iArr3;
        String str3;
        Pair p10;
        CaptioningManager captioningManager;
        Locale locale;
        Pair p11;
        boolean z12;
        Context context;
        int[] iArr4;
        a3.x xVar = this.k;
        b[] bVarArr = this.j;
        r1 r1Var = this.n;
        xVar.getClass();
        int i12 = 1;
        int[] iArr5 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        e2.m1[][] m1VarArr = new e2.m1[length][];
        int[][][] iArr6 = new int[bVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = r1Var.a;
            m1VarArr[i13] = new e2.m1[i14];
            iArr6[i13] = new int[i14][];
        }
        int length2 = bVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr7[i15] = bVarArr[i15].D();
        }
        int i16 = 0;
        while (i16 < r1Var.a) {
            e2.m1 a10 = r1Var.a(i16);
            int i17 = a10.c == 5 ? i12 : 0;
            int length3 = bVarArr.length;
            int i18 = i12;
            int i19 = i18;
            int i20 = 0;
            int i21 = 0;
            while (i20 < bVarArr.length) {
                b bVar2 = bVarArr[i20];
                a3.x xVar2 = xVar;
                r1 r1Var2 = r1Var;
                int i22 = 0;
                for (int i23 = 0; i23 < a10.a; i23++) {
                    i22 = Math.max(i22, bVar2.C(a10.d[i23]) & 7);
                }
                int i24 = iArr5[i20] == 0 ? i18 : 0;
                if (i22 > i21 || (i22 == i21 && i17 != 0 && i19 == 0 && i24 != 0)) {
                    i21 = i22;
                    i19 = i24;
                    length3 = i20;
                }
                i20++;
                xVar = xVar2;
                r1Var = r1Var2;
            }
            a3.x xVar3 = xVar;
            r1 r1Var3 = r1Var;
            if (length3 == bVarArr.length) {
                iArr4 = new int[a10.a];
            } else {
                b bVar3 = bVarArr[length3];
                int[] iArr8 = new int[a10.a];
                for (int i25 = 0; i25 < a10.a; i25++) {
                    iArr8[i25] = bVar3.C(a10.d[i25]);
                }
                iArr4 = iArr8;
            }
            int i26 = iArr5[length3];
            m1VarArr[length3][i26] = a10;
            iArr6[length3][i26] = iArr4;
            iArr5[length3] = i26 + 1;
            i16++;
            i12 = i18;
            xVar = xVar3;
            r1Var = r1Var3;
        }
        a3.x xVar4 = xVar;
        int i27 = i12;
        r1[] r1VarArr3 = new r1[bVarArr.length];
        String[] strArr = new String[bVarArr.length];
        int[] iArr9 = new int[bVarArr.length];
        for (int i28 = 0; i28 < bVarArr.length; i28++) {
            int i29 = iArr5[i28];
            r1VarArr3[i28] = new r1((e2.m1[]) h2.l0.U(i29, m1VarArr[i28]));
            iArr6[i28] = (int[][]) h2.l0.U(i29, iArr6[i28]);
            strArr[i28] = bVarArr[i28].i();
            iArr9[i28] = bVarArr[i28].b;
        }
        a3.w wVar = new a3.w(iArr9, r1VarArr3, iArr7, iArr6, new r1((e2.m1[]) h2.l0.U(iArr5[bVarArr.length], m1VarArr[bVarArr.length])));
        a3.s sVar3 = (a3.s) xVar4;
        synchronized (sVar3.d) {
            sVar3.h = Thread.currentThread();
            nVar = sVar3.g;
        }
        if (sVar3.k == null && (context = sVar3.e) != null) {
            sVar3.k = Boolean.valueOf(h2.l0.P(context));
        }
        if (nVar.A0 && Build.VERSION.SDK_INT >= 32 && sVar3.i == null) {
            sVar3.i = new c3.d(sVar3.e, new a3.f(sVar3, 0), sVar3.k);
        }
        int i30 = wVar.a;
        a3.t[] tVarArr = new a3.t[i30];
        a3.s.f(wVar, nVar, tVarArr);
        a3.s.d(wVar, nVar, tVarArr);
        a3.s.e(wVar, nVar, tVarArr);
        Context context2 = sVar3.e;
        int i31 = wVar.a;
        Pair h = a3.s.h(tVarArr, i27);
        int i32 = 2;
        if (h == null) {
            int i33 = 0;
            while (true) {
                if (i33 >= i31) {
                    z12 = false;
                    break;
                }
                if (2 == iArr9[i33] && r1VarArr3[i33].a > 0) {
                    z12 = true;
                    break;
                }
                i33++;
            }
            sVar = sVar3;
            nVar2 = nVar;
            h = a3.s.p(1, wVar, iArr6, new a3.g(sVar, nVar, z12, iArr7, 0), new a3.c(4));
            if (h != null) {
                tVarArr[((Integer) h.second).intValue()] = (a3.t) h.first;
            }
        } else {
            sVar = sVar3;
            nVar2 = nVar;
        }
        if (h == null) {
            str = null;
        } else {
            a3.t tVar = (a3.t) h.first;
            str = tVar.a.d[tVar.b[0]].d;
        }
        Pair h7 = a3.s.h(tVarArr, 2);
        Pair h10 = a3.s.h(tVarArr, 4);
        int i34 = 3;
        if (h7 == null && h10 == null) {
            if (nVar2.w.a == 2) {
                sVar2 = sVar;
                str2 = str;
                p11 = null;
                nVar3 = nVar2;
            } else {
                sVar2 = sVar;
                nVar3 = nVar2;
                a1.d dVar2 = new a1.d(nVar3, str, iArr7, (!nVar2.k || context2 == null) ? null : h2.l0.y(context2), 1);
                str2 = str;
                p11 = a3.s.p(2, wVar, iArr6, dVar2, new a3.c(i34));
            }
            Pair p12 = ((nVar3.E || p11 == null) && nVar3.w.a != 2) ? a3.s.p(4, wVar, iArr6, new a1.c(nVar3, 1), new a3.c(i32)) : null;
            if (p12 != null) {
                tVarArr[((Integer) p12.second).intValue()] = (a3.t) p12.first;
            } else if (p11 != null) {
                tVarArr[((Integer) p11.second).intValue()] = (a3.t) p11.first;
            }
            i7 = 3;
        } else {
            sVar2 = sVar;
            str2 = str;
            nVar3 = nVar2;
            i7 = 3;
        }
        if (a3.s.h(tVarArr, i7) == null) {
            if (nVar3.w.a == 2) {
                p10 = null;
            } else {
                if (!nVar3.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = h2.l0.a;
                    str3 = locale.toLanguageTag();
                }
                p10 = a3.s.p(3, wVar, iArr6, new a3.h((Object) nVar3, (Object) str2, (Object) str3, 0), new a3.c(5));
            }
            if (p10 != null) {
                tVarArr[((Integer) p10.second).intValue()] = (a3.t) p10.first;
            }
        }
        int a11 = i5.c.a(0, 0, 0, 0);
        if (nVar3.w.a == 2) {
            iArr = iArr9;
            r1VarArr = r1VarArr3;
            iArr2 = iArr6;
        } else {
            int i35 = h9.t0.c;
            h9.s0 s0Var = new h9.s0(4);
            int i36 = 0;
            while (i36 < i30) {
                a3.t tVar2 = tVarArr[i36];
                if (tVar2 != null) {
                    e2.m1 m1Var = tVar2.a;
                    if (!nVar3.E0.get(i36)) {
                        i10 = i36;
                        if (!nVar3.I.contains(Integer.valueOf(m1Var.c))) {
                            s0Var.f(m1Var.b);
                            int i37 = 0;
                            while (true) {
                                int[] iArr10 = tVar2.b;
                                a3.t tVar3 = tVar2;
                                if (i37 < iArr10.length) {
                                    String str5 = m1Var.d[iArr10[i37]].m;
                                    if (str5 != null) {
                                        s0Var.c(str5);
                                    }
                                    i37++;
                                    tVar2 = tVar3;
                                }
                            }
                        }
                        i36 = i10 + 1;
                    }
                }
                i10 = i36;
                i36 = i10 + 1;
            }
            h9.t0 g10 = s0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i38 = 0;
            while (i38 < i31) {
                int[] iArr11 = iArr9;
                if (iArr9[i38] != 5) {
                    r1VarArr2 = r1VarArr3;
                } else {
                    r1 r1Var4 = r1VarArr3[i38];
                    r1VarArr2 = r1VarArr3;
                    int i39 = 0;
                    while (i39 < r1Var4.a) {
                        e2.m1 a12 = r1Var4.a(i39);
                        arrayList.add(a12);
                        r1 r1Var5 = r1Var4;
                        int[] iArr12 = (int[]) iArr6[i38][i39].clone();
                        int i40 = i38;
                        int[][][] iArr13 = iArr6;
                        for (int i41 = 0; i41 < iArr12.length; i41++) {
                            String str6 = a12.d[i41].m;
                            if (str6 != null && !g10.contains(str6)) {
                                iArr12[i41] = a11;
                            }
                        }
                        arrayList2.add(iArr12);
                        i39++;
                        i38 = i40;
                        r1Var4 = r1Var5;
                        iArr6 = iArr13;
                    }
                }
                i38++;
                iArr9 = iArr11;
                r1VarArr3 = r1VarArr2;
                iArr6 = iArr6;
            }
            iArr = iArr9;
            r1VarArr = r1VarArr3;
            iArr2 = iArr6;
            int size = arrayList.size();
            e2.m1[] m1VarArr2 = new e2.m1[size];
            la.p(arrayList.size() == size);
            arrayList.toArray(m1VarArr2);
            r1 r1Var6 = new r1(m1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2][];
            la.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr14);
            for (int i42 = 0; i42 < i31; i42++) {
                if (iArr[i42] == 5) {
                    a3.t o4 = a3.s.o(r1Var6, iArr14, nVar3);
                    tVarArr[i42] = o4;
                    if (o4 == null) {
                        break;
                    }
                    Arrays.fill(iArr14[r1Var6.b(o4.a)], a11);
                }
            }
        }
        for (int i43 = 0; i43 < i31; i43++) {
            int i44 = iArr[i43];
            if (i44 != 2 && i44 != 1) {
                if (i44 != 3 && i44 != 4 && i44 != 5 && tVarArr[i43] == null) {
                    tVarArr[i43] = a3.s.o(r1VarArr[i43], iArr2[i43], nVar3);
                }
            }
        }
        a3.s.f(wVar, nVar3, tVarArr);
        a3.s.d(wVar, nVar3, tVarArr);
        a3.s.e(wVar, nVar3, tVarArr);
        nb.a aVar = sVar2.f;
        b3.d dVar3 = sVar2.b;
        dVar3.getClass();
        aVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (a3.t tVar4 : tVarArr) {
            if (tVar4 == null || tVar4.b.length <= 1) {
                arrayList3.add(null);
            } else {
                h9.f0 p13 = h9.i0.p();
                p13.c(new a3.a(0L, 0L));
                arrayList3.add(p13);
            }
        }
        int length4 = tVarArr.length;
        long[][] jArr = new long[length4][];
        for (int i45 = 0; i45 < tVarArr.length; i45++) {
            a3.t tVar5 = tVarArr[i45];
            if (tVar5 == null) {
                jArr[i45] = new long[0];
            } else {
                int[] iArr15 = tVar5.b;
                jArr[i45] = new long[iArr15.length];
                for (int i46 = 0; i46 < iArr15.length; i46++) {
                    long j3 = tVar5.a.d[iArr15[i46]].j;
                    long[] jArr2 = jArr[i45];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i46] = j3;
                }
                Arrays.sort(jArr[i45]);
            }
        }
        int[] iArr16 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr4 = jArr[i47];
            jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        a3.b.v(arrayList3, jArr3);
        h9.o.g(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(h9.o1.b);
        h9.k1 k1Var = new h9.k1();
        h9.l1 l1Var2 = new h9.l1(treeMap);
        l1Var2.h = k1Var;
        int i48 = 0;
        while (i48 < length4) {
            long[] jArr5 = jArr[i48];
            if (jArr5.length <= 1) {
                dVar = dVar3;
                i11 = length4;
                iArr3 = iArr16;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                dVar = dVar3;
                int i49 = 0;
                while (true) {
                    long[] jArr6 = jArr[i48];
                    i11 = length4;
                    double d = 0.0d;
                    if (i49 >= jArr6.length) {
                        break;
                    }
                    int[] iArr17 = iArr16;
                    long j10 = jArr6[i49];
                    if (j10 != -1) {
                        d = Math.log(j10);
                    }
                    dArr[i49] = d;
                    i49++;
                    length4 = i11;
                    iArr16 = iArr17;
                }
                iArr3 = iArr16;
                int i50 = length5 - 1;
                double d2 = dArr[i50] - dArr[0];
                int i51 = 0;
                while (i51 < i50) {
                    double d10 = dArr[i51];
                    int i52 = i51 + 1;
                    Double valueOf = Double.valueOf(d2 == 0.0d ? 1.0d : (((d10 + dArr[i52]) * 0.5d) - dArr[0]) / d2);
                    Integer valueOf2 = Integer.valueOf(i48);
                    double d11 = d2;
                    Map map = l1Var2.e;
                    Collection collection = (Collection) map.get(valueOf);
                    if (collection == null) {
                        Collection h11 = l1Var2.h();
                        if (!h11.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        l1Var2.f++;
                        map.put(valueOf, h11);
                    } else if (collection.add(valueOf2)) {
                        l1Var2.f++;
                    }
                    i51 = i52;
                    d2 = d11;
                }
            }
            i48++;
            length4 = i11;
            iArr16 = iArr3;
            dVar3 = dVar;
        }
        b3.d dVar4 = dVar3;
        int[] iArr18 = iArr16;
        Collection collection2 = l1Var2.c;
        if (collection2 == null) {
            collection2 = new a8.n(l1Var2, 5);
            l1Var2.c = collection2;
        }
        h9.i0 q10 = h9.i0.q(collection2);
        for (int i53 = 0; i53 < q10.size(); i53++) {
            int intValue = ((Integer) q10.get(i53)).intValue();
            int i54 = iArr18[intValue] + 1;
            iArr18[intValue] = i54;
            jArr3[intValue] = jArr[intValue][i54];
            a3.b.v(arrayList3, jArr3);
        }
        for (int i55 = 0; i55 < tVarArr.length; i55++) {
            if (arrayList3.get(i55) != null) {
                jArr3[i55] = jArr3[i55] * 2;
            }
        }
        a3.b.v(arrayList3, jArr3);
        h9.f0 p14 = h9.i0.p();
        for (int i56 = 0; i56 < arrayList3.size(); i56++) {
            h9.f0 f0Var = (h9.f0) arrayList3.get(i56);
            p14.c(f0Var == null ? t1.e : f0Var.f());
        }
        t1 f11 = p14.f();
        a3.u[] uVarArr = new a3.u[tVarArr.length];
        for (int i57 = 0; i57 < tVarArr.length; i57++) {
            a3.t tVar6 = tVarArr[i57];
            if (tVar6 != null) {
                int[] iArr19 = tVar6.b;
                if (iArr19.length != 0) {
                    if (iArr19.length == 1) {
                        bVar = new a3.v(tVar6.a, new int[]{iArr19[0]});
                    } else {
                        long j11 = 25000;
                        bVar = new a3.b(tVar6.a, iArr19, dVar4, 10000, j11, j11, (h9.i0) f11.get(i57));
                    }
                    uVarArr[i57] = bVar;
                }
            }
        }
        m1[] m1VarArr3 = new m1[i30];
        for (int i58 = 0; i58 < i30; i58++) {
            m1VarArr3[i58] = (nVar3.E0.get(i58) || nVar3.I.contains(Integer.valueOf(wVar.b[i58])) || (wVar.b[i58] != -2 && uVarArr[i58] == null)) ? null : m1.c;
        }
        if (nVar3.w.a != 0) {
            int i59 = 0;
            int i60 = 0;
            int i61 = -1;
            while (true) {
                if (i60 < wVar.a) {
                    int i62 = wVar.b[i60];
                    a3.u uVar = uVarArr[i60];
                    if (i62 != 1 && uVar != null) {
                        break;
                    }
                    if (i62 == 1 && uVar != null && uVar.length() == 1) {
                        if (a3.s.n(nVar3, iArr2[i60][wVar.c[i60].b(uVar.c())][uVar.i(0)], uVar.n())) {
                            i59++;
                            i61 = i60;
                        }
                    }
                    i60++;
                } else if (i59 == 1) {
                    int i63 = nVar3.w.b ? 1 : 2;
                    m1 m1Var2 = m1VarArr3[i61];
                    m1VarArr3[i61] = new m1(i63, m1Var2 != null && m1Var2.b);
                }
            }
        }
        Pair create = Pair.create(m1VarArr3, uVarArr);
        a3.u[] uVarArr2 = (a3.u[]) create.second;
        int length6 = uVarArr2.length;
        List[] listArr = new List[length6];
        for (int i64 = 0; i64 < uVarArr2.length; i64++) {
            a3.u uVar2 = uVarArr2[i64];
            if (uVar2 != null) {
                t1Var = h9.i0.u(uVar2);
            } else {
                h9.g0 g0Var = h9.i0.b;
                t1Var = t1.e;
            }
            listArr[i64] = t1Var;
        }
        h9.f0 f0Var2 = new h9.f0(4);
        int i65 = 0;
        while (true) {
            int i66 = wVar.a;
            r1[] r1VarArr4 = wVar.c;
            if (i65 >= i66) {
                break;
            }
            r1 r1Var7 = r1VarArr4[i65];
            int i67 = 0;
            while (i67 < r1Var7.a) {
                e2.m1 a13 = r1Var7.a(i67);
                int i68 = r1VarArr4[i65].a(i67).a;
                int[] iArr20 = new int[i68];
                int i69 = 0;
                int i70 = 0;
                while (i70 < i68) {
                    List[] listArr2 = listArr;
                    if ((wVar.e[i65][i67][i70] & 7) == 4) {
                        iArr20[i69] = i70;
                        i69++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr20, i69);
                int i71 = 16;
                int i72 = i65;
                String str7 = null;
                int i73 = 0;
                boolean z13 = false;
                int i74 = 0;
                while (i73 < copyOf.length) {
                    int[] iArr21 = copyOf;
                    String str8 = r1VarArr4[i72].a(i67).d[copyOf[i73]].s;
                    int i75 = i74 + 1;
                    if (i74 == 0) {
                        str7 = str8;
                    } else {
                        z13 = (!Objects.equals(str7, str8)) | z13;
                    }
                    i71 = Math.min(i71, wVar.e[i72][i67][i73] & 24);
                    i73++;
                    i74 = i75;
                    copyOf = iArr21;
                }
                if (z13) {
                    i71 = Math.min(i71, wVar.d[i72]);
                }
                boolean z14 = i71 != 0;
                int i76 = a13.a;
                int[] iArr22 = new int[i76];
                boolean[] zArr = new boolean[i76];
                int i77 = 0;
                while (i77 < a13.a) {
                    iArr22[i77] = wVar.e[i72][i67][i77] & 7;
                    int i78 = 0;
                    boolean z15 = false;
                    while (i78 < length6) {
                        List list = listArr3[i78];
                        int i79 = length6;
                        r1 r1Var8 = r1Var7;
                        int i80 = 0;
                        while (true) {
                            if (i80 < list.size()) {
                                a3.u uVar3 = (a3.u) list.get(i80);
                                int i81 = i80;
                                if (uVar3.c().equals(a13) && uVar3.u(i77) != -1) {
                                    z15 = true;
                                    break;
                                }
                                i80 = i81 + 1;
                            }
                        }
                        i78++;
                        r1Var7 = r1Var8;
                        length6 = i79;
                    }
                    zArr[i77] = z15;
                    i77++;
                    r1Var7 = r1Var7;
                }
                f0Var2.c(new e2.r1(a13, z14, iArr22, zArr));
                i67++;
                r1Var7 = r1Var7;
                listArr = listArr3;
                i65 = i72;
                length6 = length6;
            }
            i65++;
        }
        r1 r1Var9 = wVar.f;
        for (int i82 = 0; i82 < r1Var9.a; i82++) {
            e2.m1 a14 = r1Var9.a(i82);
            int[] iArr23 = new int[a14.a];
            Arrays.fill(iArr23, 0);
            f0Var2.c(new e2.r1(a14, false, iArr23, new boolean[a14.a]));
        }
        a3.y yVar = new a3.y((m1[]) create.first, (a3.u[]) create.second, new s1(f0Var2.f()), wVar);
        for (int i83 = 0; i83 < yVar.a; i83++) {
            if (yVar.b(i83)) {
                if (yVar.c[i83] == null && this.j[i83].b != -2) {
                    z11 = false;
                    la.p(z11);
                }
                z11 = true;
                la.p(z11);
            } else {
                la.p(yVar.c[i83] == null);
            }
        }
        for (a3.u uVar4 : yVar.c) {
            if (uVar4 != null) {
                uVar4.q(f10);
                uVar4.f(z10);
            }
        }
        return yVar;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof x2.d) {
            long j3 = this.g.e;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            x2.d dVar = (x2.d) obj;
            dVar.f = 0L;
            dVar.h = j3;
        }
    }
}
