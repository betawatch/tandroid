package i2;

import a8.yb;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b2.v1;
import b2.w1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.qy;
import org.telegram.ui.dv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final j1 l;
    public y0 m;
    public u2.r1 n;
    public x2.u o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u2.d] */
    public y0(b[] bVarArr, long j10, x2.t tVar, a8.h0 h0Var, j1 j1Var, z0 z0Var, x2.u uVar) {
        this.j = bVarArr;
        this.p = j10;
        this.k = tVar;
        this.l = j1Var;
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
        j1Var.getClass();
        Object obj = g0Var.a;
        int i10 = a.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.g0 a2 = g0Var.a(pair.second);
        i1 i1Var = (i1) j1Var.d.get(obj2);
        i1Var.getClass();
        j1Var.g.add(i1Var);
        h1 h1Var = (h1) j1Var.f.get(i1Var);
        if (h1Var != null) {
            h1Var.a.f(h1Var.b);
        }
        i1Var.c.add(a2);
        u2.y c10 = i1Var.a.c(a2, h0Var, j11);
        j1Var.c.put(c10, i1Var);
        j1Var.c();
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
        long o10 = this.a.o(uVar.c, this.i, this.c, zArr, j10);
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            if (bVarArr[i12].b == -2 && this.o.b(i12)) {
                d1VarArr[i12] = new u2.r();
            }
        }
        this.f = false;
        for (int i13 = 0; i13 < d1VarArr.length; i13++) {
            if (d1VarArr[i13] != null) {
                yb.p(uVar.b(i13));
                if (bVarArr[i13].b != -2) {
                    this.f = true;
                }
            } else {
                yb.p(uVar.c[i13] == null);
            }
        }
        return o10;
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
        long q5 = this.f ? this.a.q() : Long.MIN_VALUE;
        return q5 == Long.MIN_VALUE ? this.g.f : q5;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u2.e0] */
    public final void f(float f7, b2.p1 p1Var, boolean z10) {
        this.e = true;
        this.n = this.a.p();
        x2.u j10 = j(f7, p1Var, z10);
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
            return !this.f || this.a.q() == Long.MIN_VALUE;
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
            j1 j1Var = this.l;
            if (z10) {
                j1Var.f(((u2.d) r02).a);
            } else {
                j1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.u j(float f7, b2.p1 p1Var, boolean z10) {
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
        f9.s1 s1Var;
        x2.q bVar;
        y2.c cVar;
        int i12;
        int[] iArr4;
        String str3;
        Pair p10;
        CaptioningManager captioningManager;
        Locale locale;
        Pair p11;
        boolean z12;
        Context context;
        int[] iArr5;
        x2.t tVar = this.k;
        b[] bVarArr = this.j;
        u2.r1 r1Var = this.n;
        tVar.getClass();
        int i13 = 1;
        int[] iArr6 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        b2.q1[][] q1VarArr = new b2.q1[length][];
        int[][][] iArr7 = new int[bVarArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = r1Var.a;
            q1VarArr[i14] = new b2.q1[i15];
            iArr7[i14] = new int[i15][];
        }
        int length2 = bVarArr.length;
        int[] iArr8 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr8[i16] = bVarArr[i16].D();
        }
        int i17 = 0;
        while (i17 < r1Var.a) {
            b2.q1 a2 = r1Var.a(i17);
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
                int i25 = iArr6[i20] == 0 ? i22 : 0;
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
                iArr5 = new int[a2.a];
            } else {
                b bVar3 = bVarArr[length3];
                int[] iArr9 = new int[a2.a];
                for (int i27 = 0; i27 < a2.a; i27++) {
                    iArr9[i27] = bVar3.C(a2.d[i27]);
                }
                iArr5 = iArr9;
            }
            int i28 = iArr6[length3];
            q1VarArr[length3][i28] = a2;
            iArr7[length3][i28] = iArr5;
            iArr6[length3] = i28 + 1;
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
        int[] iArr10 = new int[bVarArr.length];
        for (int i31 = 0; i31 < bVarArr.length; i31++) {
            int i32 = iArr6[i31];
            r1VarArr2[i31] = new u2.r1((b2.q1[]) e2.n0.U(i32, q1VarArr[i31]));
            iArr7[i31] = (int[][]) e2.n0.U(i32, iArr7[i31]);
            strArr[i31] = bVarArr[i31].j();
            iArr10[i31] = bVarArr[i31].b;
        }
        x2.s sVar = new x2.s(iArr10, r1VarArr2, iArr8, iArr7, new u2.r1((b2.q1[]) e2.n0.U(iArr6[bVarArr.length], q1VarArr[bVarArr.length])));
        x2.o oVar2 = (x2.o) tVar4;
        synchronized (oVar2.d) {
            oVar2.h = Thread.currentThread();
            jVar = oVar2.g;
        }
        if (oVar2.k == null && (context = oVar2.e) != null) {
            oVar2.k = Boolean.valueOf(e2.n0.P(context));
        }
        if (jVar.A0 && Build.VERSION.SDK_INT >= 32 && oVar2.i == null) {
            oVar2.i = new z2.d(oVar2.e, new ti.g(oVar2, 14), oVar2.k);
        }
        int i33 = sVar.a;
        x2.p[] pVarArr = new x2.p[i33];
        x2.o.f(sVar, jVar, pVarArr);
        x2.o.d(sVar, jVar, pVarArr);
        x2.o.e(sVar, jVar, pVarArr);
        Context context2 = oVar2.e;
        int i34 = sVar.a;
        Pair h = x2.o.h(pVarArr, i29);
        if (h == null) {
            int i35 = 0;
            while (true) {
                if (i35 >= i34) {
                    z12 = false;
                    break;
                }
                if (2 == iArr10[i35] && r1VarArr2[i35].a > 0) {
                    z12 = true;
                    break;
                }
                i35++;
            }
            ea.b bVar4 = new ea.b(oVar2, jVar, z12, iArr8, 7);
            oVar = oVar2;
            jVar2 = jVar;
            h = x2.o.p(1, sVar, iArr7, bVar4, new dv(25));
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
        int i36 = 24;
        if (h10 == null && h11 == null) {
            if (jVar2.w.a == 2) {
                str2 = str;
                p11 = null;
            } else {
                a1.d dVar = new a1.d(jVar2, str, iArr8, (!jVar2.k || context2 == null) ? null : e2.n0.y(context2), 22);
                str2 = str;
                p11 = x2.o.p(2, sVar, iArr7, dVar, new dv(i36));
            }
            Pair p12 = ((jVar2.E || p11 == null) && jVar2.w.a != 2) ? x2.o.p(4, sVar, iArr7, new x2.e(jVar2, i30), new dv(23)) : null;
            if (p12 != null) {
                pVarArr[((Integer) p12.second).intValue()] = (x2.p) p12.first;
            } else if (p11 != null) {
                pVarArr[((Integer) p11.second).intValue()] = (x2.p) p11.first;
            }
        } else {
            str2 = str;
        }
        if (x2.o.h(pVarArr, 3) == null) {
            if (jVar2.w.a == 2) {
                p10 = null;
            } else {
                if (!jVar2.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = e2.n0.a;
                    str3 = locale.toLanguageTag();
                }
                p10 = x2.o.p(3, sVar, iArr7, new qy(jVar2, str2, str3, 13), new dv(26));
            }
            if (p10 != null) {
                pVarArr[((Integer) p10.second).intValue()] = (x2.p) p10.first;
            }
        }
        int c10 = c3.h0.c(0, 0, 0, 0);
        if (jVar2.w.a == 2) {
            iArr = iArr10;
            r1VarArr = r1VarArr2;
            iArr2 = iArr7;
        } else {
            int i37 = f9.t0.c;
            f9.s0 s0Var = new f9.s0(4);
            int i38 = 0;
            while (i38 < i33) {
                x2.p pVar2 = pVarArr[i38];
                if (pVar2 != null) {
                    b2.q1 q1Var = pVar2.a;
                    if (!jVar2.E0.get(i38)) {
                        i11 = i38;
                        if (!jVar2.I.contains(Integer.valueOf(q1Var.c))) {
                            s0Var.f(q1Var.b);
                            int i39 = 0;
                            while (true) {
                                int[] iArr11 = pVar2.b;
                                iArr3 = iArr10;
                                if (i39 < iArr11.length) {
                                    String str5 = q1Var.d[iArr11[i39]].m;
                                    if (str5 != null) {
                                        s0Var.c(str5);
                                    }
                                    i39++;
                                    iArr10 = iArr3;
                                }
                            }
                            i38 = i11 + 1;
                            iArr10 = iArr3;
                        }
                        iArr3 = iArr10;
                        i38 = i11 + 1;
                        iArr10 = iArr3;
                    }
                }
                i11 = i38;
                iArr3 = iArr10;
                i38 = i11 + 1;
                iArr10 = iArr3;
            }
            iArr = iArr10;
            f9.t0 g7 = s0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i40 = 0;
            while (i40 < i34) {
                if (iArr[i40] != 5) {
                    i10 = i40;
                } else {
                    u2.r1 r1Var4 = r1VarArr2[i40];
                    i10 = i40;
                    int i41 = 0;
                    while (i41 < r1Var4.a) {
                        b2.q1 a10 = r1Var4.a(i41);
                        arrayList.add(a10);
                        u2.r1[] r1VarArr3 = r1VarArr2;
                        int[] iArr12 = (int[]) iArr7[i10][i41].clone();
                        u2.r1 r1Var5 = r1Var4;
                        int[][][] iArr13 = iArr7;
                        for (int i42 = 0; i42 < iArr12.length; i42++) {
                            String str6 = a10.d[i42].m;
                            if (str6 != null && !g7.contains(str6)) {
                                iArr12[i42] = c10;
                            }
                        }
                        arrayList2.add(iArr12);
                        i41++;
                        r1Var4 = r1Var5;
                        r1VarArr2 = r1VarArr3;
                        iArr7 = iArr13;
                    }
                }
                i40 = i10 + 1;
                r1VarArr2 = r1VarArr2;
                iArr7 = iArr7;
            }
            r1VarArr = r1VarArr2;
            iArr2 = iArr7;
            int size = arrayList.size();
            b2.q1[] q1VarArr2 = new b2.q1[size];
            yb.p(arrayList.size() == size);
            arrayList.toArray(q1VarArr2);
            u2.r1 r1Var6 = new u2.r1(q1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2][];
            yb.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr14);
            for (int i43 = 0; i43 < i34; i43++) {
                if (iArr[i43] == 5) {
                    x2.p o10 = x2.o.o(r1Var6, iArr14, jVar2);
                    pVarArr[i43] = o10;
                    if (o10 == null) {
                        break;
                    }
                    Arrays.fill(iArr14[r1Var6.b(o10.a)], c10);
                }
            }
        }
        for (int i44 = 0; i44 < i34; i44++) {
            int i45 = iArr[i44];
            if (i45 != 2 && i45 != 1 && i45 != 3 && i45 != 4) {
                if (i45 != 5 && pVarArr[i44] == null) {
                    pVarArr[i44] = x2.o.o(r1VarArr[i44], iArr2[i44], jVar2);
                }
            }
        }
        x2.o.f(sVar, jVar2, pVarArr);
        x2.o.d(sVar, jVar2, pVarArr);
        x2.o.e(sVar, jVar2, pVarArr);
        qb.a aVar = oVar.f;
        y2.c cVar2 = oVar.b;
        cVar2.getClass();
        aVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (x2.p pVar3 : pVarArr) {
            if (pVar3 == null || pVar3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                f9.f0 t10 = f9.i0.t();
                t10.c(new x2.a(0L, 0L));
                arrayList3.add(t10);
            }
        }
        int length4 = pVarArr.length;
        long[][] jArr = new long[length4][];
        for (int i46 = 0; i46 < pVarArr.length; i46++) {
            x2.p pVar4 = pVarArr[i46];
            if (pVar4 == null) {
                jArr[i46] = new long[0];
            } else {
                int[] iArr15 = pVar4.b;
                jArr[i46] = new long[iArr15.length];
                for (int i47 = 0; i47 < iArr15.length; i47++) {
                    long j10 = pVar4.a.d[iArr15[i47]].j;
                    long[] jArr2 = jArr[i46];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i47] = j10;
                }
                Arrays.sort(jArr[i46]);
            }
        }
        int[] iArr16 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i48 = 0; i48 < length4; i48++) {
            long[] jArr4 = jArr[i48];
            jArr3[i48] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList3, jArr3);
        f9.o.f(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(f9.n1.b);
        f9.j1 j1Var = new f9.j1();
        f9.k1 k1Var = new f9.k1(treeMap);
        k1Var.h = j1Var;
        int i49 = 0;
        while (i49 < length4) {
            long[] jArr5 = jArr[i49];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i12 = length4;
                iArr4 = iArr16;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i50 = 0;
                while (true) {
                    long[] jArr6 = jArr[i49];
                    i12 = length4;
                    double d = 0.0d;
                    if (i50 >= jArr6.length) {
                        break;
                    }
                    int[] iArr17 = iArr16;
                    long j11 = jArr6[i50];
                    if (j11 != -1) {
                        d = Math.log(j11);
                    }
                    dArr[i50] = d;
                    i50++;
                    length4 = i12;
                    iArr16 = iArr17;
                }
                iArr4 = iArr16;
                int i51 = length5 - 1;
                double d10 = dArr[i51] - dArr[0];
                int i52 = 0;
                while (i52 < i51) {
                    double d11 = dArr[i52];
                    int i53 = i52 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i53]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i49);
                    double d12 = d10;
                    Map map = k1Var.e;
                    Collection collection = (Collection) map.get(valueOf);
                    if (collection == null) {
                        Collection h12 = k1Var.h();
                        if (!h12.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        k1Var.f++;
                        map.put(valueOf, h12);
                    } else if (collection.add(valueOf2)) {
                        k1Var.f++;
                    }
                    i52 = i53;
                    d10 = d12;
                }
            }
            i49++;
            length4 = i12;
            iArr16 = iArr4;
            cVar2 = cVar;
        }
        y2.c cVar3 = cVar2;
        int[] iArr18 = iArr16;
        Collection collection2 = k1Var.c;
        if (collection2 == null) {
            collection2 = new a8.f(k1Var, 3);
            k1Var.c = collection2;
        }
        f9.i0 u10 = f9.i0.u(collection2);
        for (int i54 = 0; i54 < u10.size(); i54++) {
            int intValue = ((Integer) u10.get(i54)).intValue();
            int i55 = iArr18[intValue] + 1;
            iArr18[intValue] = i55;
            jArr3[intValue] = jArr[intValue][i55];
            x2.b.v(arrayList3, jArr3);
        }
        for (int i56 = 0; i56 < pVarArr.length; i56++) {
            if (arrayList3.get(i56) != null) {
                jArr3[i56] = jArr3[i56] * 2;
            }
        }
        x2.b.v(arrayList3, jArr3);
        f9.f0 t11 = f9.i0.t();
        for (int i57 = 0; i57 < arrayList3.size(); i57++) {
            f9.f0 f0Var = (f9.f0) arrayList3.get(i57);
            t11.c(f0Var == null ? f9.s1.e : f0Var.f());
        }
        f9.s1 f10 = t11.f();
        x2.q[] qVarArr = new x2.q[pVarArr.length];
        for (int i58 = 0; i58 < pVarArr.length; i58++) {
            x2.p pVar5 = pVarArr[i58];
            if (pVar5 != null) {
                int[] iArr19 = pVar5.b;
                if (iArr19.length != 0) {
                    if (iArr19.length == 1) {
                        bVar = new x2.r(pVar5.a, new int[]{iArr19[0]});
                    } else {
                        long j12 = 25000;
                        bVar = new x2.b(pVar5.a, iArr19, cVar3, 10000, j12, j12, (f9.i0) f10.get(i58));
                    }
                    qVarArr[i58] = bVar;
                }
            }
        }
        q1[] q1VarArr3 = new q1[i33];
        for (int i59 = 0; i59 < i33; i59++) {
            q1VarArr3[i59] = (jVar2.E0.get(i59) || jVar2.I.contains(Integer.valueOf(sVar.b[i59])) || (sVar.b[i59] != -2 && qVarArr[i59] == null)) ? null : q1.c;
        }
        if (jVar2.w.a != 0) {
            int i60 = 0;
            int i61 = 0;
            int i62 = -1;
            while (true) {
                if (i60 < sVar.a) {
                    int i63 = sVar.b[i60];
                    x2.q qVar = qVarArr[i60];
                    if (i63 != 1 && qVar != null) {
                        break;
                    }
                    if (i63 == 1 && qVar != null && qVar.length() == 1) {
                        if (x2.o.n(jVar2, iArr2[i60][sVar.c[i60].b(qVar.b())][qVar.h(0)], qVar.m())) {
                            i61++;
                            i62 = i60;
                        }
                    }
                    i60++;
                } else if (i61 == 1) {
                    int i64 = jVar2.w.b ? 1 : 2;
                    q1 q1Var2 = q1VarArr3[i62];
                    q1VarArr3[i62] = new q1(i64, q1Var2 != null && q1Var2.b);
                }
            }
        }
        Pair create = Pair.create(q1VarArr3, qVarArr);
        x2.q[] qVarArr2 = (x2.q[]) create.second;
        int length6 = qVarArr2.length;
        List[] listArr = new List[length6];
        for (int i65 = 0; i65 < qVarArr2.length; i65++) {
            x2.q qVar2 = qVarArr2[i65];
            if (qVar2 != null) {
                s1Var = f9.i0.y(qVar2);
            } else {
                f9.g0 g0Var = f9.i0.b;
                s1Var = f9.s1.e;
            }
            listArr[i65] = s1Var;
        }
        f9.f0 f0Var2 = new f9.f0(4);
        int i66 = 0;
        while (true) {
            int i67 = sVar.a;
            u2.r1[] r1VarArr4 = sVar.c;
            if (i66 >= i67) {
                break;
            }
            u2.r1 r1Var7 = r1VarArr4[i66];
            int i68 = 0;
            while (i68 < r1Var7.a) {
                b2.q1 a11 = r1Var7.a(i68);
                int i69 = r1VarArr4[i66].a(i68).a;
                int[] iArr20 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i71 < i69) {
                    List[] listArr2 = listArr;
                    if ((sVar.e[i66][i68][i71] & 7) == 4) {
                        iArr20[i70] = i71;
                        i70++;
                    }
                    i71++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr20, i70);
                int i72 = 16;
                int i73 = i66;
                int i74 = 0;
                String str7 = null;
                boolean z13 = false;
                int i75 = 0;
                while (i74 < copyOf.length) {
                    int[] iArr21 = copyOf;
                    String str8 = r1VarArr4[i73].a(i68).d[copyOf[i74]].s;
                    int i76 = i75 + 1;
                    if (i75 == 0) {
                        str7 = str8;
                    } else {
                        z13 = (!Objects.equals(str7, str8)) | z13;
                    }
                    i72 = Math.min(i72, sVar.e[i73][i68][i74] & 24);
                    i74++;
                    i75 = i76;
                    copyOf = iArr21;
                }
                if (z13) {
                    i72 = Math.min(i72, sVar.d[i73]);
                }
                boolean z14 = i72 != 0;
                int i77 = a11.a;
                int[] iArr22 = new int[i77];
                boolean[] zArr = new boolean[i77];
                int i78 = 0;
                while (i78 < a11.a) {
                    iArr22[i78] = sVar.e[i73][i68][i78] & 7;
                    int i79 = 0;
                    boolean z15 = false;
                    while (i79 < length6) {
                        List list = listArr3[i79];
                        int i80 = length6;
                        u2.r1 r1Var8 = r1Var7;
                        int i81 = 0;
                        while (true) {
                            if (i81 < list.size()) {
                                x2.q qVar3 = (x2.q) list.get(i81);
                                int i82 = i81;
                                if (qVar3.b().equals(a11) && qVar3.u(i78) != -1) {
                                    z15 = true;
                                    break;
                                }
                                i81 = i82 + 1;
                            }
                        }
                        i79++;
                        length6 = i80;
                        r1Var7 = r1Var8;
                    }
                    zArr[i78] = z15;
                    i78++;
                    r1Var7 = r1Var7;
                }
                f0Var2.c(new v1(a11, z14, iArr22, zArr));
                i68++;
                listArr = listArr3;
                i66 = i73;
                length6 = length6;
                r1Var7 = r1Var7;
            }
            i66++;
        }
        u2.r1 r1Var9 = sVar.f;
        for (int i83 = 0; i83 < r1Var9.a; i83++) {
            b2.q1 a12 = r1Var9.a(i83);
            int[] iArr23 = new int[a12.a];
            Arrays.fill(iArr23, 0);
            f0Var2.c(new v1(a12, false, iArr23, new boolean[a12.a]));
        }
        x2.u uVar = new x2.u((q1[]) create.first, (x2.q[]) create.second, new w1(f0Var2.f()), sVar);
        for (int i84 = 0; i84 < uVar.a; i84++) {
            if (uVar.b(i84)) {
                if (uVar.c[i84] == null && this.j[i84].b != -2) {
                    z11 = false;
                    yb.p(z11);
                }
                z11 = true;
                yb.p(z11);
            } else {
                yb.p(uVar.c[i84] == null);
            }
        }
        for (x2.q qVar4 : uVar.c) {
            if (qVar4 != null) {
                qVar4.p(f7);
                qVar4.e(z10);
            }
        }
        return uVar;
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
