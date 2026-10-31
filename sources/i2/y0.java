package i2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import bi.o4;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.ex0;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y0 {
    public final Object a;
    public final Object b;
    public final u2.d1[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public z0 g;
    public boolean h;
    public final boolean[] i;
    public final b[] j;
    public final x2.t k;
    public final l1 l;
    public y0 m;
    public u2.r1 n;
    public x2.u o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u2.d] */
    public y0(b[] bVarArr, long j10, x2.t tVar, android.support.v4.media.session.a0 a0Var, l1 l1Var, z0 z0Var, x2.u uVar) {
        this.j = bVarArr;
        this.p = j10;
        this.k = tVar;
        this.l = l1Var;
        u2.g0 g0Var = z0Var.a;
        this.b = g0Var.a;
        this.g = z0Var;
        this.n = u2.r1.d;
        this.o = uVar;
        this.c = new u2.d1[bVarArr.length];
        this.i = new boolean[bVarArr.length];
        long j11 = z0Var.b;
        long j12 = z0Var.e;
        boolean z10 = z0Var.g;
        l1Var.getClass();
        Object obj = g0Var.a;
        int i10 = a.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.g0 a2 = g0Var.a(pair.second);
        k1 k1Var = (k1) l1Var.d.get(obj2);
        k1Var.getClass();
        l1Var.g.add(k1Var);
        j1 j1Var = (j1) l1Var.f.get(k1Var);
        if (j1Var != null) {
            j1Var.a.f(j1Var.b);
        }
        k1Var.c.add(a2);
        u2.y c10 = k1Var.a.c(a2, a0Var, j11);
        l1Var.c.put(c10, k1Var);
        l1Var.c();
        if (j12 != -9223372036854775807L) {
            c10 = new u2.d(c10, !z10, 0L, j12, 0);
        }
        this.a = c10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u2.e0] */
    public final long a(x2.u uVar, long j10, boolean z10, boolean[] zArr) {
        b[] bVarArr;
        u2.d1[] d1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= uVar.a) {
                break;
            }
            if (z10 || !uVar.a(this.o, i10)) {
                z11 = false;
            }
            this.i[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            bVarArr = this.j;
            int length = bVarArr.length;
            d1VarArr = this.c;
            if (i11 >= length) {
                break;
            }
            if (bVarArr[i11].b == -2) {
                d1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.o = uVar;
        c();
        long p5 = this.a.p(uVar.c, this.i, this.c, zArr, j10);
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            if (bVarArr[i12].b == -2 && this.o.b(i12)) {
                d1VarArr[i12] = new u2.r();
            }
        }
        this.f = false;
        for (int i13 = 0; i13 < d1VarArr.length; i13++) {
            if (d1VarArr[i13] != null) {
                t6.p(uVar.b(i13));
                if (bVarArr[i13].b != -2) {
                    this.f = true;
                }
            } else {
                t6.p(uVar.c[i13] == null);
            }
        }
        return p5;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            x2.u uVar = this.o;
            if (i10 >= uVar.a) {
                return;
            }
            boolean b10 = uVar.b(i10);
            x2.q qVar = this.o.c[i10];
            if (b10 && qVar != null) {
                qVar.j();
            }
            i10++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            x2.u uVar = this.o;
            if (i10 >= uVar.a) {
                return;
            }
            boolean b10 = uVar.b(i10);
            x2.q qVar = this.o.c[i10];
            if (b10 && qVar != null) {
                qVar.g();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u2.f1] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long s10 = this.f ? this.a.s() : Long.MIN_VALUE;
        return s10 == Long.MIN_VALUE ? this.g.f : s10;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u2.e0] */
    public final void f(float f7, b2.o1 o1Var, boolean z10) {
        this.e = true;
        this.n = this.a.q();
        x2.u j10 = j(f7, o1Var, z10);
        z0 z0Var = this.g;
        long j11 = z0Var.b;
        long j12 = z0Var.f;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long a2 = a(j10, j11, false, new boolean[this.j.length]);
        long j13 = this.p;
        z0 z0Var2 = this.g;
        this.p = (z0Var2.b - a2) + j13;
        this.g = z0Var2.b(a2, z0Var2.c);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u2.f1] */
    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.s() == Long.MIN_VALUE;
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
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u2.e0] */
    public final void i() {
        b();
        ?? r02 = this.a;
        try {
            boolean z10 = r02 instanceof u2.d;
            l1 l1Var = this.l;
            if (z10) {
                l1Var.f(((u2.d) r02).a);
            } else {
                l1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.u j(float f7, b2.o1 o1Var, boolean z10) {
        x2.j jVar;
        x2.j jVar2;
        x2.o oVar;
        String str;
        String str2;
        int[] iArr;
        u2.r1[] r1VarArr;
        int[][][] iArr2;
        int i10;
        int i11;
        int[] iArr3;
        boolean z11;
        x1 x1Var;
        x2.q bVar;
        y2.c cVar;
        int i12;
        long[][] jArr;
        String str3;
        Pair p5;
        CaptioningManager captioningManager;
        Locale locale;
        Pair p9;
        boolean z12;
        Context context;
        int[] iArr4;
        x2.t tVar = this.k;
        b[] bVarArr = this.j;
        u2.r1 r1Var = this.n;
        tVar.getClass();
        int i13 = 1;
        int[] iArr5 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        b2.p1[][] p1VarArr = new b2.p1[length][];
        int[][][] iArr6 = new int[bVarArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = r1Var.a;
            p1VarArr[i14] = new b2.p1[i15];
            iArr6[i14] = new int[i15][];
        }
        int length2 = bVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr7[i16] = bVarArr[i16].D();
        }
        int i17 = 0;
        while (i17 < r1Var.a) {
            b2.p1 a2 = r1Var.a(i17);
            int i18 = a2.c == 5 ? i13 : 0;
            int length3 = bVarArr.length;
            int i19 = i13;
            int i20 = 0;
            int i21 = 0;
            while (i20 < bVarArr.length) {
                b bVar2 = bVarArr[i20];
                x2.t tVar2 = tVar;
                u2.r1 r1Var2 = r1Var;
                int i22 = i13;
                int i23 = 0;
                for (int i24 = 0; i24 < a2.a; i24++) {
                    i23 = Math.max(i23, bVar2.C(a2.d[i24]) & 7);
                }
                int i25 = iArr5[i20] == 0 ? i22 : 0;
                if (i23 > i21 || (i23 == i21 && i18 != 0 && i19 == 0 && i25 != 0)) {
                    i21 = i23;
                    i19 = i25;
                    length3 = i20;
                }
                i20++;
                tVar = tVar2;
                r1Var = r1Var2;
                i13 = i22;
            }
            x2.t tVar3 = tVar;
            u2.r1 r1Var3 = r1Var;
            int i26 = i13;
            if (length3 == bVarArr.length) {
                iArr4 = new int[a2.a];
            } else {
                b bVar3 = bVarArr[length3];
                int[] iArr8 = new int[a2.a];
                for (int i27 = 0; i27 < a2.a; i27++) {
                    iArr8[i27] = bVar3.C(a2.d[i27]);
                }
                iArr4 = iArr8;
            }
            int i28 = iArr5[length3];
            p1VarArr[length3][i28] = a2;
            iArr6[length3][i28] = iArr4;
            iArr5[length3] = i28 + 1;
            i17++;
            tVar = tVar3;
            r1Var = r1Var3;
            i13 = i26;
        }
        x2.t tVar4 = tVar;
        int i29 = i13;
        int i30 = 0;
        u2.r1[] r1VarArr2 = new u2.r1[bVarArr.length];
        String[] strArr = new String[bVarArr.length];
        int[] iArr9 = new int[bVarArr.length];
        for (int i31 = 0; i31 < bVarArr.length; i31++) {
            int i32 = iArr5[i31];
            r1VarArr2[i31] = new u2.r1((b2.p1[]) e2.l0.U(i32, p1VarArr[i31]));
            iArr6[i31] = (int[][]) e2.l0.U(i32, iArr6[i31]);
            strArr[i31] = bVarArr[i31].j();
            iArr9[i31] = bVarArr[i31].b;
        }
        x2.s sVar = new x2.s(iArr9, r1VarArr2, iArr7, iArr6, new u2.r1((b2.p1[]) e2.l0.U(iArr5[bVarArr.length], p1VarArr[bVarArr.length])));
        x2.o oVar2 = (x2.o) tVar4;
        synchronized (oVar2.d) {
            oVar2.h = Thread.currentThread();
            jVar = oVar2.g;
        }
        if (oVar2.k == null && (context = oVar2.e) != null) {
            oVar2.k = Boolean.valueOf(e2.l0.P(context));
        }
        int i33 = 24;
        if (jVar.A0 && Build.VERSION.SDK_INT >= 32 && oVar2.i == null) {
            oVar2.i = new z2.d(oVar2.e, new vh.d0(oVar2, i33), oVar2.k);
        }
        int i34 = sVar.a;
        x2.p[] pVarArr = new x2.p[i34];
        x2.o.f(sVar, jVar, pVarArr);
        x2.o.d(sVar, jVar, pVarArr);
        x2.o.e(sVar, jVar, pVarArr);
        Context context2 = oVar2.e;
        int i35 = sVar.a;
        Pair h = x2.o.h(pVarArr, i29);
        if (h == null) {
            int i36 = 0;
            while (true) {
                int i37 = i33;
                if (i36 >= i35) {
                    z12 = false;
                    break;
                }
                if (2 == iArr9[i36] && r1VarArr2[i36].a > 0) {
                    z12 = true;
                    break;
                }
                i36++;
                i33 = i37;
            }
            o4 o4Var = new o4(oVar2, jVar, z12, iArr7, 6);
            oVar = oVar2;
            jVar2 = jVar;
            h = x2.o.p(1, sVar, iArr6, o4Var, new x2.e(1));
            if (h != null) {
                pVarArr[((Integer) h.second).intValue()] = (x2.p) h.first;
            }
        } else {
            jVar2 = jVar;
            oVar = oVar2;
        }
        if (h == null) {
            str = null;
        } else {
            x2.p pVar = (x2.p) h.first;
            str = pVar.a.d[pVar.b[0]].d;
        }
        Pair h10 = x2.o.h(pVarArr, 2);
        Pair h11 = x2.o.h(pVarArr, 4);
        if (h10 == null && h11 == null) {
            if (jVar2.w.a == 2) {
                str2 = str;
                p9 = null;
            } else {
                a1.d dVar = new a1.d(jVar2, str, iArr7, (!jVar2.k || context2 == null) ? null : e2.l0.y(context2), 21);
                str2 = str;
                p9 = x2.o.p(2, sVar, iArr6, dVar, new x2.e(i30));
            }
            Pair p10 = ((jVar2.E || p9 == null) && jVar2.w.a != 2) ? x2.o.p(4, sVar, iArr6, new wh.b(jVar2, 1), new ex0(29)) : null;
            if (p10 != null) {
                pVarArr[((Integer) p10.second).intValue()] = (x2.p) p10.first;
            } else if (p9 != null) {
                pVarArr[((Integer) p9.second).intValue()] = (x2.p) p9.first;
            }
        } else {
            str2 = str;
        }
        if (x2.o.h(pVarArr, 3) == null) {
            if (jVar2.w.a == 2) {
                p5 = null;
            } else {
                if (!jVar2.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = e2.l0.a;
                    str3 = locale.toLanguageTag();
                }
                p5 = x2.o.p(3, sVar, iArr6, new q5.a(jVar2, str2, str3, 10), new x2.e(2));
            }
            if (p5 != null) {
                pVarArr[((Integer) p5.second).intValue()] = (x2.p) p5.first;
            }
        }
        int a10 = i0.a.a(0, 0, 0, 0);
        if (jVar2.w.a == 2) {
            iArr = iArr9;
            r1VarArr = r1VarArr2;
            iArr2 = iArr6;
        } else {
            int i38 = e9.y0.c;
            e9.x0 x0Var = new e9.x0(4);
            int i39 = 0;
            while (i39 < i34) {
                x2.p pVar2 = pVarArr[i39];
                if (pVar2 != null) {
                    b2.p1 p1Var = pVar2.a;
                    if (!jVar2.E0.get(i39)) {
                        i11 = i39;
                        if (!jVar2.I.contains(Integer.valueOf(p1Var.c))) {
                            x0Var.f(p1Var.b);
                            int i40 = 0;
                            while (true) {
                                int[] iArr10 = pVar2.b;
                                iArr3 = iArr9;
                                if (i40 < iArr10.length) {
                                    String str5 = p1Var.d[iArr10[i40]].m;
                                    if (str5 != null) {
                                        x0Var.c(str5);
                                    }
                                    i40++;
                                    iArr9 = iArr3;
                                }
                            }
                            i39 = i11 + 1;
                            iArr9 = iArr3;
                        }
                        iArr3 = iArr9;
                        i39 = i11 + 1;
                        iArr9 = iArr3;
                    }
                }
                i11 = i39;
                iArr3 = iArr9;
                i39 = i11 + 1;
                iArr9 = iArr3;
            }
            iArr = iArr9;
            e9.y0 g10 = x0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i41 = 0;
            while (i41 < i35) {
                if (iArr[i41] != 5) {
                    i10 = i41;
                } else {
                    u2.r1 r1Var4 = r1VarArr2[i41];
                    i10 = i41;
                    int i42 = 0;
                    while (i42 < r1Var4.a) {
                        b2.p1 a11 = r1Var4.a(i42);
                        arrayList.add(a11);
                        u2.r1[] r1VarArr3 = r1VarArr2;
                        int[] iArr11 = (int[]) iArr6[i10][i42].clone();
                        u2.r1 r1Var5 = r1Var4;
                        int[][][] iArr12 = iArr6;
                        for (int i43 = 0; i43 < iArr11.length; i43++) {
                            String str6 = a11.d[i43].m;
                            if (str6 != null && !g10.contains(str6)) {
                                iArr11[i43] = a10;
                            }
                        }
                        arrayList2.add(iArr11);
                        i42++;
                        r1Var4 = r1Var5;
                        r1VarArr2 = r1VarArr3;
                        iArr6 = iArr12;
                    }
                }
                i41 = i10 + 1;
                r1VarArr2 = r1VarArr2;
                iArr6 = iArr6;
            }
            r1VarArr = r1VarArr2;
            iArr2 = iArr6;
            int size = arrayList.size();
            b2.p1[] p1VarArr2 = new b2.p1[size];
            t6.p(arrayList.size() == size);
            arrayList.toArray(p1VarArr2);
            u2.r1 r1Var6 = new u2.r1(p1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr13 = new int[size2][];
            t6.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr13);
            for (int i44 = 0; i44 < i35; i44++) {
                if (iArr[i44] == 5) {
                    x2.p o10 = x2.o.o(r1Var6, iArr13, jVar2);
                    pVarArr[i44] = o10;
                    if (o10 == null) {
                        break;
                    }
                    Arrays.fill(iArr13[r1Var6.b(o10.a)], a10);
                }
            }
        }
        for (int i45 = 0; i45 < i35; i45++) {
            int i46 = iArr[i45];
            if (i46 != 2 && i46 != 1) {
                if (i46 != 3 && i46 != 4) {
                    if (i46 != 5 && pVarArr[i45] == null) {
                        pVarArr[i45] = x2.o.o(r1VarArr[i45], iArr2[i45], jVar2);
                    }
                }
            }
        }
        x2.o.f(sVar, jVar2, pVarArr);
        x2.o.d(sVar, jVar2, pVarArr);
        x2.o.e(sVar, jVar2, pVarArr);
        t7.u uVar = oVar.f;
        y2.c cVar2 = oVar.b;
        cVar2.getClass();
        uVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (x2.p pVar3 : pVarArr) {
            if (pVar3 == null || pVar3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                e9.k0 t10 = e9.n0.t();
                t10.c(new x2.a(0L, 0L));
                arrayList3.add(t10);
            }
        }
        int length4 = pVarArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i47 = 0; i47 < pVarArr.length; i47++) {
            x2.p pVar4 = pVarArr[i47];
            if (pVar4 == null) {
                jArr2[i47] = new long[0];
            } else {
                int[] iArr14 = pVar4.b;
                jArr2[i47] = new long[iArr14.length];
                for (int i48 = 0; i48 < iArr14.length; i48++) {
                    long j10 = pVar4.a.d[iArr14[i48]].j;
                    long[] jArr3 = jArr2[i47];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr3[i48] = j10;
                }
                Arrays.sort(jArr2[i47]);
            }
        }
        int[] iArr15 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i49 = 0; i49 < length4; i49++) {
            long[] jArr5 = jArr2[i49];
            jArr4[i49] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        x2.b.v(arrayList3, jArr4);
        e9.s.f(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.s1.b);
        e9.o1 o1Var2 = new e9.o1();
        e9.p1 p1Var2 = new e9.p1(treeMap);
        p1Var2.h = o1Var2;
        int i50 = 0;
        while (i50 < length4) {
            long[] jArr6 = jArr2[i50];
            if (jArr6.length <= 1) {
                cVar = cVar2;
                i12 = length4;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i51 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i50];
                    i12 = length4;
                    double d = 0.0d;
                    if (i51 >= jArr7.length) {
                        break;
                    }
                    long[][] jArr8 = jArr2;
                    int i52 = length5;
                    long j11 = jArr7[i51];
                    if (j11 != -1) {
                        d = Math.log(j11);
                    }
                    dArr[i51] = d;
                    i51++;
                    jArr2 = jArr8;
                    length4 = i12;
                    length5 = i52;
                }
                long[][] jArr9 = jArr2;
                int i53 = length5 - 1;
                double d10 = dArr[i53] - dArr[0];
                int i54 = 0;
                while (i54 < i53) {
                    double d11 = dArr[i54];
                    int i55 = i54 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i55]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i50);
                    Map map = p1Var2.e;
                    long[][] jArr10 = jArr9;
                    Collection collection = (Collection) map.get(valueOf);
                    if (collection == null) {
                        Collection h12 = p1Var2.h();
                        if (!h12.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        p1Var2.f++;
                        map.put(valueOf, h12);
                    } else if (collection.add(valueOf2)) {
                        p1Var2.f++;
                    }
                    i54 = i55;
                    jArr9 = jArr10;
                }
                jArr = jArr9;
            }
            i50++;
            length4 = i12;
            cVar2 = cVar;
            jArr2 = jArr;
        }
        y2.c cVar3 = cVar2;
        long[][] jArr11 = jArr2;
        Collection collection2 = p1Var2.c;
        if (collection2 == null) {
            collection2 = new e9.o(p1Var2, 1);
            p1Var2.c = collection2;
        }
        e9.n0 u10 = e9.n0.u(collection2);
        for (int i56 = 0; i56 < u10.size(); i56++) {
            int intValue = ((Integer) u10.get(i56)).intValue();
            int i57 = iArr15[intValue] + 1;
            iArr15[intValue] = i57;
            jArr4[intValue] = jArr11[intValue][i57];
            x2.b.v(arrayList3, jArr4);
        }
        for (int i58 = 0; i58 < pVarArr.length; i58++) {
            if (arrayList3.get(i58) != null) {
                jArr4[i58] = jArr4[i58] * 2;
            }
        }
        x2.b.v(arrayList3, jArr4);
        e9.k0 t11 = e9.n0.t();
        for (int i59 = 0; i59 < arrayList3.size(); i59++) {
            e9.k0 k0Var = (e9.k0) arrayList3.get(i59);
            t11.c(k0Var == null ? x1.e : k0Var.f());
        }
        x1 f10 = t11.f();
        x2.q[] qVarArr = new x2.q[pVarArr.length];
        for (int i60 = 0; i60 < pVarArr.length; i60++) {
            x2.p pVar5 = pVarArr[i60];
            if (pVar5 != null) {
                int[] iArr16 = pVar5.b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        bVar = new x2.r(pVar5.a, new int[]{iArr16[0]});
                    } else {
                        long j12 = 25000;
                        bVar = new x2.b(pVar5.a, iArr16, cVar3, 10000, j12, j12, (e9.n0) f10.get(i60));
                    }
                    qVarArr[i60] = bVar;
                }
            }
        }
        s1[] s1VarArr = new s1[i34];
        for (int i61 = 0; i61 < i34; i61++) {
            s1VarArr[i61] = (jVar2.E0.get(i61) || jVar2.I.contains(Integer.valueOf(sVar.b[i61])) || (sVar.b[i61] != -2 && qVarArr[i61] == null)) ? null : s1.c;
        }
        if (jVar2.w.a != 0) {
            int i62 = 0;
            int i63 = 0;
            int i64 = -1;
            while (true) {
                if (i62 < sVar.a) {
                    int i65 = sVar.b[i62];
                    x2.q qVar = qVarArr[i62];
                    if (i65 != 1 && qVar != null) {
                        break;
                    }
                    if (i65 == 1 && qVar != null && qVar.length() == 1) {
                        if (x2.o.n(jVar2, iArr2[i62][sVar.c[i62].b(qVar.b())][qVar.h(0)], qVar.m())) {
                            i63++;
                            i64 = i62;
                        }
                    }
                    i62++;
                } else if (i63 == 1) {
                    int i66 = jVar2.w.b ? 1 : 2;
                    s1 s1Var = s1VarArr[i64];
                    s1VarArr[i64] = new s1(i66, s1Var != null && s1Var.b);
                }
            }
        }
        Pair create = Pair.create(s1VarArr, qVarArr);
        x2.q[] qVarArr2 = (x2.q[]) create.second;
        int length6 = qVarArr2.length;
        List[] listArr = new List[length6];
        for (int i67 = 0; i67 < qVarArr2.length; i67++) {
            x2.q qVar2 = qVarArr2[i67];
            if (qVar2 != null) {
                x1Var = e9.n0.y(qVar2);
            } else {
                e9.l0 l0Var = e9.n0.b;
                x1Var = x1.e;
            }
            listArr[i67] = x1Var;
        }
        e9.k0 k0Var2 = new e9.k0(4);
        int i68 = 0;
        while (true) {
            int i69 = sVar.a;
            u2.r1[] r1VarArr4 = sVar.c;
            if (i68 >= i69) {
                break;
            }
            u2.r1 r1Var7 = r1VarArr4[i68];
            int i70 = 0;
            while (i70 < r1Var7.a) {
                b2.p1 a12 = r1Var7.a(i70);
                int i71 = r1VarArr4[i68].a(i70).a;
                int[] iArr17 = new int[i71];
                int i72 = 0;
                int i73 = 0;
                while (i73 < i71) {
                    List[] listArr2 = listArr;
                    if ((sVar.e[i68][i70][i73] & 7) == 4) {
                        iArr17[i72] = i73;
                        i72++;
                    }
                    i73++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr17, i72);
                int i74 = 16;
                int i75 = i68;
                int i76 = 0;
                String str7 = null;
                boolean z13 = false;
                int i77 = 0;
                while (i76 < copyOf.length) {
                    int[] iArr18 = copyOf;
                    String str8 = r1VarArr4[i75].a(i70).d[copyOf[i76]].s;
                    int i78 = i77 + 1;
                    if (i77 == 0) {
                        str7 = str8;
                    } else {
                        z13 = (!Objects.equals(str7, str8)) | z13;
                    }
                    i74 = Math.min(i74, sVar.e[i75][i70][i76] & 24);
                    i76++;
                    i77 = i78;
                    copyOf = iArr18;
                }
                if (z13) {
                    i74 = Math.min(i74, sVar.d[i75]);
                }
                boolean z14 = i74 != 0;
                int i79 = a12.a;
                int[] iArr19 = new int[i79];
                boolean[] zArr = new boolean[i79];
                int i80 = 0;
                while (i80 < a12.a) {
                    iArr19[i80] = sVar.e[i75][i70][i80] & 7;
                    int i81 = 0;
                    boolean z15 = false;
                    while (i81 < length6) {
                        List list = listArr3[i81];
                        int i82 = length6;
                        u2.r1 r1Var8 = r1Var7;
                        int i83 = 0;
                        while (true) {
                            if (i83 < list.size()) {
                                x2.q qVar3 = (x2.q) list.get(i83);
                                int i84 = i83;
                                if (qVar3.b().equals(a12) && qVar3.u(i80) != -1) {
                                    z15 = true;
                                    break;
                                }
                                i83 = i84 + 1;
                            }
                        }
                        i81++;
                        length6 = i82;
                        r1Var7 = r1Var8;
                    }
                    zArr[i80] = z15;
                    i80++;
                    r1Var7 = r1Var7;
                }
                k0Var2.c(new b2.v1(a12, z14, iArr19, zArr));
                i70++;
                listArr = listArr3;
                i68 = i75;
                length6 = length6;
                r1Var7 = r1Var7;
            }
            i68++;
        }
        u2.r1 r1Var9 = sVar.f;
        for (int i85 = 0; i85 < r1Var9.a; i85++) {
            b2.p1 a13 = r1Var9.a(i85);
            int[] iArr20 = new int[a13.a];
            Arrays.fill(iArr20, 0);
            k0Var2.c(new b2.v1(a13, false, iArr20, new boolean[a13.a]));
        }
        x2.u uVar2 = new x2.u((s1[]) create.first, (x2.q[]) create.second, new b2.w1(k0Var2.f()), sVar);
        for (int i86 = 0; i86 < uVar2.a; i86++) {
            if (uVar2.b(i86)) {
                if (uVar2.c[i86] == null && this.j[i86].b != -2) {
                    z11 = false;
                    t6.p(z11);
                }
                z11 = true;
                t6.p(z11);
            } else {
                t6.p(uVar2.c[i86] == null);
            }
        }
        for (x2.q qVar4 : uVar2.c) {
            if (qVar4 != null) {
                qVar4.p(f7);
                qVar4.e(z10);
            }
        }
        return uVar2;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof u2.d) {
            long j10 = this.g.e;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            u2.d dVar = (u2.d) obj;
            dVar.f = 0L;
            dVar.h = j10;
        }
    }
}
