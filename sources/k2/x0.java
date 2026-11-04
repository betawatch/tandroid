package k2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b8.zb;
import d2.v1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.hr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x0 {
    public final Object a;
    public final Object b;
    public final w2.d1[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public y0 g;
    public boolean h;
    public final boolean[] i;
    public final b[] j;
    public final z2.s k;
    public final i1 l;
    public x0 m;
    public w2.r1 n;
    public z2.t o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [w2.d] */
    public x0(b[] bVarArr, long j10, z2.s sVar, android.support.v4.media.session.a0 a0Var, i1 i1Var, y0 y0Var, z2.t tVar) {
        this.j = bVarArr;
        this.p = j10;
        this.k = sVar;
        this.l = i1Var;
        w2.g0 g0Var = y0Var.a;
        this.b = g0Var.a;
        this.g = y0Var;
        this.n = w2.r1.d;
        this.o = tVar;
        this.c = new w2.d1[bVarArr.length];
        this.i = new boolean[bVarArr.length];
        long j11 = y0Var.b;
        long j12 = y0Var.e;
        boolean z10 = y0Var.g;
        i1Var.getClass();
        Object obj = g0Var.a;
        int i3 = a.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        w2.g0 a10 = g0Var.a(pair.second);
        h1 h1Var = (h1) i1Var.d.get(obj2);
        h1Var.getClass();
        i1Var.g.add(h1Var);
        g1 g1Var = (g1) i1Var.f.get(h1Var);
        if (g1Var != null) {
            g1Var.a.f(g1Var.b);
        }
        h1Var.c.add(a10);
        w2.y c2 = h1Var.a.c(a10, a0Var, j11);
        i1Var.c.put(c2, h1Var);
        i1Var.c();
        if (j12 != -9223372036854775807L) {
            c2 = new w2.d(c2, !z10, 0L, j12, 0);
        }
        this.a = c2;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, w2.e0] */
    public final long a(z2.t tVar, long j10, boolean z10, boolean[] zArr) {
        b[] bVarArr;
        w2.d1[] d1VarArr;
        int i3 = 0;
        while (true) {
            boolean z11 = true;
            if (i3 >= tVar.a) {
                break;
            }
            if (z10 || !tVar.a(this.o, i3)) {
                z11 = false;
            }
            this.i[i3] = z11;
            i3++;
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
        this.o = tVar;
        c();
        long s6 = this.a.s(tVar.c, this.i, this.c, zArr, j10);
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            if (bVarArr[i11].b == -2 && this.o.b(i11)) {
                d1VarArr[i11] = new w2.r();
            }
        }
        this.f = false;
        for (int i12 = 0; i12 < d1VarArr.length; i12++) {
            if (d1VarArr[i12] != null) {
                zb.p(tVar.b(i12));
                if (bVarArr[i12].b != -2) {
                    this.f = true;
                }
            } else {
                zb.p(tVar.c[i12] == null);
            }
        }
        return s6;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i3 = 0;
        while (true) {
            z2.t tVar = this.o;
            if (i3 >= tVar.a) {
                return;
            }
            boolean b10 = tVar.b(i3);
            z2.p pVar = this.o.c[i3];
            if (b10 && pVar != null) {
                pVar.k();
            }
            i3++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i3 = 0;
        while (true) {
            z2.t tVar = this.o;
            if (i3 >= tVar.a) {
                return;
            }
            boolean b10 = tVar.b(i3);
            z2.p pVar = this.o.c[i3];
            if (b10 && pVar != null) {
                pVar.h();
            }
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, w2.f1] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long q10 = this.f ? this.a.q() : Long.MIN_VALUE;
        return q10 == Long.MIN_VALUE ? this.g.f : q10;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, w2.e0] */
    public final void f(float f10, d2.n1 n1Var, boolean z10) {
        this.e = true;
        this.n = this.a.p();
        z2.t j10 = j(f10, n1Var, z10);
        y0 y0Var = this.g;
        long j11 = y0Var.b;
        long j12 = y0Var.f;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long a10 = a(j10, j11, false, new boolean[this.j.length]);
        long j13 = this.p;
        y0 y0Var2 = this.g;
        this.p = (y0Var2.b - a10) + j13;
        this.g = y0Var2.b(a10, y0Var2.c);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, w2.f1] */
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
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w2.e0] */
    public final void i() {
        b();
        ?? r02 = this.a;
        try {
            boolean z10 = r02 instanceof w2.d;
            i1 i1Var = this.l;
            if (z10) {
                i1Var.f(((w2.d) r02).a);
            } else {
                i1Var.f(r02);
            }
        } catch (RuntimeException e10) {
            g2.a.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final z2.t j(float f10, d2.n1 n1Var, boolean z10) {
        z2.i iVar;
        z2.i iVar2;
        z2.n nVar;
        String str;
        String str2;
        int[] iArr;
        w2.r1[] r1VarArr;
        int[][][] iArr2;
        int i3;
        int i10;
        int[] iArr3;
        boolean z11;
        g9.s1 s1Var;
        z2.p bVar;
        a3.d dVar;
        int i11;
        long[][] jArr;
        String str3;
        Pair p10;
        CaptioningManager captioningManager;
        Locale locale;
        Pair p11;
        boolean z12;
        Context context;
        int[] iArr4;
        z2.s sVar = this.k;
        b[] bVarArr = this.j;
        w2.r1 r1Var = this.n;
        sVar.getClass();
        int i12 = 1;
        int[] iArr5 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        d2.o1[][] o1VarArr = new d2.o1[length][];
        int[][][] iArr6 = new int[bVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = r1Var.a;
            o1VarArr[i13] = new d2.o1[i14];
            iArr6[i13] = new int[i14][];
        }
        int length2 = bVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr7[i15] = bVarArr[i15].D();
        }
        int i16 = 0;
        while (i16 < r1Var.a) {
            d2.o1 a10 = r1Var.a(i16);
            int i17 = a10.c == 5 ? i12 : 0;
            int length3 = bVarArr.length;
            int i18 = i12;
            int i19 = 0;
            int i20 = 0;
            while (i19 < bVarArr.length) {
                b bVar2 = bVarArr[i19];
                z2.s sVar2 = sVar;
                w2.r1 r1Var2 = r1Var;
                int i21 = i12;
                int i22 = 0;
                for (int i23 = 0; i23 < a10.a; i23++) {
                    i22 = Math.max(i22, bVar2.C(a10.d[i23]) & 7);
                }
                int i24 = iArr5[i19] == 0 ? i21 : 0;
                if (i22 > i20 || (i22 == i20 && i17 != 0 && i18 == 0 && i24 != 0)) {
                    i20 = i22;
                    i18 = i24;
                    length3 = i19;
                }
                i19++;
                sVar = sVar2;
                r1Var = r1Var2;
                i12 = i21;
            }
            z2.s sVar3 = sVar;
            w2.r1 r1Var3 = r1Var;
            int i25 = i12;
            if (length3 == bVarArr.length) {
                iArr4 = new int[a10.a];
            } else {
                b bVar3 = bVarArr[length3];
                int[] iArr8 = new int[a10.a];
                for (int i26 = 0; i26 < a10.a; i26++) {
                    iArr8[i26] = bVar3.C(a10.d[i26]);
                }
                iArr4 = iArr8;
            }
            int i27 = iArr5[length3];
            o1VarArr[length3][i27] = a10;
            iArr6[length3][i27] = iArr4;
            iArr5[length3] = i27 + 1;
            i16++;
            sVar = sVar3;
            r1Var = r1Var3;
            i12 = i25;
        }
        z2.s sVar4 = sVar;
        int i28 = i12;
        w2.r1[] r1VarArr2 = new w2.r1[bVarArr.length];
        String[] strArr = new String[bVarArr.length];
        int[] iArr9 = new int[bVarArr.length];
        for (int i29 = 0; i29 < bVarArr.length; i29++) {
            int i30 = iArr5[i29];
            r1VarArr2[i29] = new w2.r1((d2.o1[]) g2.n0.U(i30, o1VarArr[i29]));
            iArr6[i29] = (int[][]) g2.n0.U(i30, iArr6[i29]);
            strArr[i29] = bVarArr[i29].j();
            iArr9[i29] = bVarArr[i29].b;
        }
        int[] iArr10 = iArr9;
        z2.r rVar = new z2.r(iArr10, r1VarArr2, iArr7, iArr6, new w2.r1((d2.o1[]) g2.n0.U(iArr5[bVarArr.length], o1VarArr[bVarArr.length])));
        z2.n nVar2 = (z2.n) sVar4;
        synchronized (nVar2.d) {
            nVar2.h = Thread.currentThread();
            iVar = nVar2.g;
        }
        if (nVar2.k == null && (context = nVar2.e) != null) {
            nVar2.k = Boolean.valueOf(g2.n0.P(context));
        }
        int i31 = 6;
        if (iVar.A0 && Build.VERSION.SDK_INT >= 32 && nVar2.i == null) {
            nVar2.i = new b3.d(nVar2.e, new xf.c(nVar2, i31), nVar2.k);
        }
        int i32 = rVar.a;
        z2.o[] oVarArr = new z2.o[i32];
        z2.n.f(rVar, iVar, oVarArr);
        z2.n.d(rVar, iVar, oVarArr);
        z2.n.e(rVar, iVar, oVarArr);
        Context context2 = nVar2.e;
        int i33 = rVar.a;
        Pair h = z2.n.h(oVarArr, i28);
        if (h == null) {
            int i34 = 0;
            while (true) {
                if (i34 >= i33) {
                    z12 = false;
                    break;
                }
                if (2 == iArr10[i34] && r1VarArr2[i34].a > 0) {
                    z12 = true;
                    break;
                }
                i34++;
            }
            ga.b bVar4 = new ga.b(nVar2, iVar, z12, iArr7, 7);
            nVar = nVar2;
            iVar2 = iVar;
            h = z2.n.p(1, rVar, iArr6, bVar4, new vg.i1(i31));
            if (h != null) {
                oVarArr[((Integer) h.second).intValue()] = (z2.o) h.first;
            }
        } else {
            iVar2 = iVar;
            nVar = nVar2;
        }
        if (h == null) {
            str = null;
        } else {
            z2.o oVar = (z2.o) h.first;
            str = oVar.a.d[oVar.b[0]].d;
        }
        Pair h7 = z2.n.h(oVarArr, 2);
        Pair h10 = z2.n.h(oVarArr, 4);
        if (h7 == null && h10 == null) {
            if (iVar2.w.a == 2) {
                str2 = str;
                p11 = null;
            } else {
                a1.d dVar2 = new a1.d(iVar2, str, iArr7, (!iVar2.k || context2 == null) ? null : g2.n0.y(context2), 22);
                str2 = str;
                p11 = z2.n.p(2, rVar, iArr6, dVar2, new vg.i1(5));
            }
            Pair p12 = ((iVar2.E || p11 == null) && iVar2.w.a != 2) ? z2.n.p(4, rVar, iArr6, new xg.c(iVar2, 5), new vg.i1(4)) : null;
            if (p12 != null) {
                oVarArr[((Integer) p12.second).intValue()] = (z2.o) p12.first;
            } else if (p11 != null) {
                oVarArr[((Integer) p11.second).intValue()] = (z2.o) p11.first;
            }
        } else {
            str2 = str;
        }
        if (z2.n.h(oVarArr, 3) == null) {
            if (iVar2.w.a == 2) {
                p10 = null;
            } else {
                if (!iVar2.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = g2.n0.a;
                    str3 = locale.toLanguageTag();
                }
                p10 = z2.n.p(3, rVar, iArr6, new hr(iVar2, str2, str3, 14), new vg.i1(7));
            }
            if (p10 != null) {
                oVarArr[((Integer) p10.second).intValue()] = (z2.o) p10.first;
            }
        }
        int a11 = p1.a(0, 0, 0, 0);
        if (iVar2.w.a == 2) {
            iArr = iArr10;
            r1VarArr = r1VarArr2;
            iArr2 = iArr6;
        } else {
            int i35 = g9.t0.c;
            g9.s0 s0Var = new g9.s0(4);
            int i36 = 0;
            while (i36 < i32) {
                z2.o oVar2 = oVarArr[i36];
                if (oVar2 != null) {
                    d2.o1 o1Var = oVar2.a;
                    if (!iVar2.E0.get(i36)) {
                        i10 = i36;
                        if (!iVar2.I.contains(Integer.valueOf(o1Var.c))) {
                            s0Var.f(o1Var.b);
                            int i37 = 0;
                            while (true) {
                                int[] iArr11 = oVar2.b;
                                iArr3 = iArr10;
                                if (i37 < iArr11.length) {
                                    String str5 = o1Var.d[iArr11[i37]].m;
                                    if (str5 != null) {
                                        s0Var.c(str5);
                                    }
                                    i37++;
                                    iArr10 = iArr3;
                                }
                            }
                            i36 = i10 + 1;
                            iArr10 = iArr3;
                        }
                        iArr3 = iArr10;
                        i36 = i10 + 1;
                        iArr10 = iArr3;
                    }
                }
                i10 = i36;
                iArr3 = iArr10;
                i36 = i10 + 1;
                iArr10 = iArr3;
            }
            iArr = iArr10;
            g9.t0 g7 = s0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i38 = 0;
            while (i38 < i33) {
                if (iArr[i38] != 5) {
                    i3 = i38;
                } else {
                    w2.r1 r1Var4 = r1VarArr2[i38];
                    i3 = i38;
                    int i39 = 0;
                    while (i39 < r1Var4.a) {
                        d2.o1 a12 = r1Var4.a(i39);
                        arrayList.add(a12);
                        w2.r1[] r1VarArr3 = r1VarArr2;
                        int[] iArr12 = (int[]) iArr6[i3][i39].clone();
                        w2.r1 r1Var5 = r1Var4;
                        int[][][] iArr13 = iArr6;
                        for (int i40 = 0; i40 < iArr12.length; i40++) {
                            String str6 = a12.d[i40].m;
                            if (str6 != null && !g7.contains(str6)) {
                                iArr12[i40] = a11;
                            }
                        }
                        arrayList2.add(iArr12);
                        i39++;
                        r1Var4 = r1Var5;
                        r1VarArr2 = r1VarArr3;
                        iArr6 = iArr13;
                    }
                }
                i38 = i3 + 1;
                r1VarArr2 = r1VarArr2;
                iArr6 = iArr6;
            }
            r1VarArr = r1VarArr2;
            iArr2 = iArr6;
            int size = arrayList.size();
            d2.o1[] o1VarArr2 = new d2.o1[size];
            zb.p(arrayList.size() == size);
            arrayList.toArray(o1VarArr2);
            w2.r1 r1Var6 = new w2.r1(o1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2][];
            zb.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr14);
            for (int i41 = 0; i41 < i33; i41++) {
                if (iArr[i41] == 5) {
                    z2.o o10 = z2.n.o(r1Var6, iArr14, iVar2);
                    oVarArr[i41] = o10;
                    if (o10 == null) {
                        break;
                    }
                    Arrays.fill(iArr14[r1Var6.b(o10.a)], a11);
                }
            }
        }
        for (int i42 = 0; i42 < i33; i42++) {
            int i43 = iArr[i42];
            if (i43 != 2 && i43 != 1 && i43 != 3 && i43 != 4) {
                if (i43 != 5 && oVarArr[i42] == null) {
                    oVarArr[i42] = z2.n.o(r1VarArr[i42], iArr2[i42], iVar2);
                }
            }
        }
        z2.n.f(rVar, iVar2, oVarArr);
        z2.n.d(rVar, iVar2, oVarArr);
        z2.n.e(rVar, iVar2, oVarArr);
        ra.e eVar = nVar.f;
        a3.d dVar3 = nVar.b;
        dVar3.getClass();
        eVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (z2.o oVar3 : oVarArr) {
            if (oVar3 == null || oVar3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                g9.f0 p13 = g9.i0.p();
                p13.c(new z2.a(0L, 0L));
                arrayList3.add(p13);
            }
        }
        int length4 = oVarArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i44 = 0; i44 < oVarArr.length; i44++) {
            z2.o oVar4 = oVarArr[i44];
            if (oVar4 == null) {
                jArr2[i44] = new long[0];
            } else {
                int[] iArr15 = oVar4.b;
                jArr2[i44] = new long[iArr15.length];
                for (int i45 = 0; i45 < iArr15.length; i45++) {
                    long j10 = oVar4.a.d[iArr15[i45]].j;
                    long[] jArr3 = jArr2[i44];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr3[i45] = j10;
                }
                Arrays.sort(jArr2[i44]);
            }
        }
        int[] iArr16 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i46 = 0; i46 < length4; i46++) {
            long[] jArr5 = jArr2[i46];
            jArr4[i46] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        z2.b.v(arrayList3, jArr4);
        g9.o.g(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(g9.n1.b);
        g9.j1 j1Var = new g9.j1();
        g9.k1 k1Var = new g9.k1(treeMap);
        k1Var.h = j1Var;
        int i47 = 0;
        while (i47 < length4) {
            long[] jArr6 = jArr2[i47];
            if (jArr6.length <= 1) {
                dVar = dVar3;
                i11 = length4;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr = new double[length5];
                dVar = dVar3;
                int i48 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i47];
                    i11 = length4;
                    double d = 0.0d;
                    if (i48 >= jArr7.length) {
                        break;
                    }
                    long[][] jArr8 = jArr2;
                    int i49 = length5;
                    long j11 = jArr7[i48];
                    if (j11 != -1) {
                        d = Math.log(j11);
                    }
                    dArr[i48] = d;
                    i48++;
                    jArr2 = jArr8;
                    length4 = i11;
                    length5 = i49;
                }
                long[][] jArr9 = jArr2;
                int i50 = length5 - 1;
                double d10 = dArr[i50] - dArr[0];
                int i51 = 0;
                while (i51 < i50) {
                    double d11 = dArr[i51];
                    int i52 = i51 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i52]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i47);
                    Map map = k1Var.e;
                    long[][] jArr10 = jArr9;
                    Collection collection = (Collection) map.get(valueOf);
                    if (collection == null) {
                        Collection h11 = k1Var.h();
                        if (!h11.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        k1Var.f++;
                        map.put(valueOf, h11);
                    } else if (collection.add(valueOf2)) {
                        k1Var.f++;
                    }
                    i51 = i52;
                    jArr9 = jArr10;
                }
                jArr = jArr9;
            }
            i47++;
            length4 = i11;
            jArr2 = jArr;
            dVar3 = dVar;
        }
        a3.d dVar4 = dVar3;
        long[][] jArr11 = jArr2;
        Collection collection2 = k1Var.c;
        if (collection2 == null) {
            collection2 = new b8.f(k1Var, 3);
            k1Var.c = collection2;
        }
        g9.i0 q10 = g9.i0.q(collection2);
        for (int i53 = 0; i53 < q10.size(); i53++) {
            int intValue = ((Integer) q10.get(i53)).intValue();
            int i54 = iArr16[intValue] + 1;
            iArr16[intValue] = i54;
            jArr4[intValue] = jArr11[intValue][i54];
            z2.b.v(arrayList3, jArr4);
        }
        for (int i55 = 0; i55 < oVarArr.length; i55++) {
            if (arrayList3.get(i55) != null) {
                jArr4[i55] = jArr4[i55] * 2;
            }
        }
        z2.b.v(arrayList3, jArr4);
        g9.f0 p14 = g9.i0.p();
        for (int i56 = 0; i56 < arrayList3.size(); i56++) {
            g9.f0 f0Var = (g9.f0) arrayList3.get(i56);
            p14.c(f0Var == null ? g9.s1.e : f0Var.f());
        }
        g9.s1 f11 = p14.f();
        z2.p[] pVarArr = new z2.p[oVarArr.length];
        for (int i57 = 0; i57 < oVarArr.length; i57++) {
            z2.o oVar5 = oVarArr[i57];
            if (oVar5 != null) {
                int[] iArr17 = oVar5.b;
                if (iArr17.length != 0) {
                    if (iArr17.length == 1) {
                        bVar = new z2.q(oVar5.a, new int[]{iArr17[0]});
                    } else {
                        long j12 = 25000;
                        bVar = new z2.b(oVar5.a, iArr17, dVar4, 10000, j12, j12, (g9.i0) f11.get(i57));
                    }
                    pVarArr[i57] = bVar;
                }
            }
        }
        q1[] q1VarArr = new q1[i32];
        for (int i58 = 0; i58 < i32; i58++) {
            q1VarArr[i58] = (iVar2.E0.get(i58) || iVar2.I.contains(Integer.valueOf(rVar.b[i58])) || (rVar.b[i58] != -2 && pVarArr[i58] == null)) ? null : q1.c;
        }
        if (iVar2.w.a != 0) {
            int i59 = 0;
            int i60 = 0;
            int i61 = -1;
            while (true) {
                if (i59 < rVar.a) {
                    int i62 = rVar.b[i59];
                    z2.p pVar = pVarArr[i59];
                    if (i62 != 1 && pVar != null) {
                        break;
                    }
                    if (i62 == 1 && pVar != null && pVar.length() == 1) {
                        if (z2.n.n(iVar2, iArr2[i59][rVar.c[i59].b(pVar.b())][pVar.i(0)], pVar.n())) {
                            i60++;
                            i61 = i59;
                        }
                    }
                    i59++;
                } else if (i60 == 1) {
                    int i63 = iVar2.w.b ? 1 : 2;
                    q1 q1Var = q1VarArr[i61];
                    q1VarArr[i61] = new q1(i63, q1Var != null && q1Var.b);
                }
            }
        }
        Pair create = Pair.create(q1VarArr, pVarArr);
        z2.p[] pVarArr2 = (z2.p[]) create.second;
        int length6 = pVarArr2.length;
        List[] listArr = new List[length6];
        for (int i64 = 0; i64 < pVarArr2.length; i64++) {
            z2.p pVar2 = pVarArr2[i64];
            if (pVar2 != null) {
                s1Var = g9.i0.u(pVar2);
            } else {
                g9.g0 g0Var = g9.i0.b;
                s1Var = g9.s1.e;
            }
            listArr[i64] = s1Var;
        }
        g9.f0 f0Var2 = new g9.f0(4);
        int i65 = 0;
        while (true) {
            int i66 = rVar.a;
            w2.r1[] r1VarArr4 = rVar.c;
            if (i65 >= i66) {
                break;
            }
            w2.r1 r1Var7 = r1VarArr4[i65];
            int i67 = 0;
            while (i67 < r1Var7.a) {
                d2.o1 a13 = r1Var7.a(i67);
                int i68 = r1VarArr4[i65].a(i67).a;
                int[] iArr18 = new int[i68];
                int i69 = 0;
                int i70 = 0;
                while (i70 < i68) {
                    List[] listArr2 = listArr;
                    if ((rVar.e[i65][i67][i70] & 7) == 4) {
                        iArr18[i69] = i70;
                        i69++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr18, i69);
                int i71 = 16;
                int i72 = i65;
                int i73 = 0;
                String str7 = null;
                boolean z13 = false;
                int i74 = 0;
                while (i73 < copyOf.length) {
                    int[] iArr19 = copyOf;
                    String str8 = r1VarArr4[i72].a(i67).d[copyOf[i73]].s;
                    int i75 = i74 + 1;
                    if (i74 == 0) {
                        str7 = str8;
                    } else {
                        z13 = (!Objects.equals(str7, str8)) | z13;
                    }
                    i71 = Math.min(i71, rVar.e[i72][i67][i73] & 24);
                    i73++;
                    i74 = i75;
                    copyOf = iArr19;
                }
                if (z13) {
                    i71 = Math.min(i71, rVar.d[i72]);
                }
                boolean z14 = i71 != 0;
                int i76 = a13.a;
                int[] iArr20 = new int[i76];
                boolean[] zArr = new boolean[i76];
                int i77 = 0;
                while (i77 < a13.a) {
                    iArr20[i77] = rVar.e[i72][i67][i77] & 7;
                    int i78 = 0;
                    boolean z15 = false;
                    while (i78 < length6) {
                        List list = listArr3[i78];
                        int i79 = length6;
                        w2.r1 r1Var8 = r1Var7;
                        int i80 = 0;
                        while (true) {
                            if (i80 < list.size()) {
                                z2.p pVar3 = (z2.p) list.get(i80);
                                int i81 = i80;
                                if (pVar3.b().equals(a13) && pVar3.u(i77) != -1) {
                                    z15 = true;
                                    break;
                                }
                                i80 = i81 + 1;
                            }
                        }
                        i78++;
                        length6 = i79;
                        r1Var7 = r1Var8;
                    }
                    zArr[i77] = z15;
                    i77++;
                    r1Var7 = r1Var7;
                }
                f0Var2.c(new d2.u1(a13, z14, iArr20, zArr));
                i67++;
                i65 = i72;
                listArr = listArr3;
                length6 = length6;
                r1Var7 = r1Var7;
            }
            i65++;
        }
        w2.r1 r1Var9 = rVar.f;
        for (int i82 = 0; i82 < r1Var9.a; i82++) {
            d2.o1 a14 = r1Var9.a(i82);
            int[] iArr21 = new int[a14.a];
            Arrays.fill(iArr21, 0);
            f0Var2.c(new d2.u1(a14, false, iArr21, new boolean[a14.a]));
        }
        z2.t tVar = new z2.t((q1[]) create.first, (z2.p[]) create.second, new v1(f0Var2.f()), rVar);
        for (int i83 = 0; i83 < tVar.a; i83++) {
            if (tVar.b(i83)) {
                if (tVar.c[i83] == null && this.j[i83].b != -2) {
                    z11 = false;
                    zb.p(z11);
                }
                z11 = true;
                zb.p(z11);
            } else {
                zb.p(tVar.c[i83] == null);
            }
        }
        for (z2.p pVar4 : tVar.c) {
            if (pVar4 != null) {
                pVar4.q(f10);
                pVar4.f(z10);
            }
        }
        return tVar;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof w2.d) {
            long j10 = this.g.e;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            w2.d dVar = (w2.d) obj;
            dVar.f = 0L;
            dVar.h = j10;
        }
    }
}
