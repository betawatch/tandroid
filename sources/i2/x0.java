package i2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b2.u1;
import b2.v1;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.ry;
import org.telegram.ui.jg0;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class x0 {
    public final Object a;
    public final Object b;
    public final u2.d1[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public y0 g;
    public boolean h;
    public final boolean[] i;
    public final b[] j;
    public final x2.s k;
    public final i1 l;
    public x0 m;
    public u2.r1 n;
    public x2.t o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u2.e] */
    public x0(b[] bVarArr, long j10, x2.s sVar, androidx.biometric.e eVar, i1 i1Var, y0 y0Var, x2.t tVar) {
        this.j = bVarArr;
        this.p = j10;
        this.k = sVar;
        this.l = i1Var;
        u2.g0 g0Var = y0Var.a;
        this.b = g0Var.a;
        this.g = y0Var;
        this.n = u2.r1.d;
        this.o = tVar;
        this.c = new u2.d1[bVarArr.length];
        this.i = new boolean[bVarArr.length];
        long j11 = y0Var.b;
        long j12 = y0Var.e;
        boolean z10 = y0Var.g;
        i1Var.getClass();
        Object obj = g0Var.a;
        int i10 = a.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.g0 a2 = g0Var.a(pair.second);
        h1 h1Var = (h1) i1Var.d.get(obj2);
        h1Var.getClass();
        i1Var.g.add(h1Var);
        g1 g1Var = (g1) i1Var.f.get(h1Var);
        if (g1Var != null) {
            g1Var.a.f(g1Var.b);
        }
        h1Var.c.add(a2);
        u2.y c10 = h1Var.a.c(a2, eVar, j11);
        i1Var.c.put(c10, h1Var);
        i1Var.c();
        if (j12 != -9223372036854775807L) {
            c10 = new u2.e(c10, !z10, 0L, j12, 0);
        }
        this.a = c10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u2.e0] */
    public final long a(x2.t tVar, long j10, boolean z10, boolean[] zArr) {
        b[] bVarArr;
        u2.d1[] d1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= tVar.a) {
                break;
            }
            if (z10 || !tVar.a(this.o, i10)) {
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
        this.o = tVar;
        c();
        long q6 = this.a.q(tVar.c, this.i, this.c, zArr, j10);
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            if (bVarArr[i12].b == -2 && this.o.b(i12)) {
                d1VarArr[i12] = new u2.r();
            }
        }
        this.f = false;
        for (int i13 = 0; i13 < d1VarArr.length; i13++) {
            if (d1VarArr[i13] != null) {
                u6.p(tVar.b(i13));
                if (bVarArr[i13].b != -2) {
                    this.f = true;
                }
            } else {
                u6.p(tVar.c[i13] == null);
            }
        }
        return q6;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            x2.t tVar = this.o;
            if (i10 >= tVar.a) {
                return;
            }
            boolean b10 = tVar.b(i10);
            x2.p pVar = this.o.c[i10];
            if (b10 && pVar != null) {
                pVar.j();
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
            x2.t tVar = this.o;
            if (i10 >= tVar.a) {
                return;
            }
            boolean b10 = tVar.b(i10);
            x2.p pVar = this.o.c[i10];
            if (b10 && pVar != null) {
                pVar.g();
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
        this.n = this.a.r();
        x2.t j10 = j(f7, o1Var, z10);
        y0 y0Var = this.g;
        long j11 = y0Var.b;
        long j12 = y0Var.f;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long a2 = a(j10, j11, false, new boolean[this.j.length]);
        long j13 = this.p;
        y0 y0Var2 = this.g;
        this.p = (y0Var2.b - a2) + j13;
        this.g = y0Var2.b(a2, y0Var2.c);
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
            boolean z10 = r02 instanceof u2.e;
            i1 i1Var = this.l;
            if (z10) {
                i1Var.f(((u2.e) r02).a);
            } else {
                i1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.t j(float f7, b2.o1 o1Var, boolean z10) {
        x2.i iVar;
        x2.i iVar2;
        x2.n nVar;
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
        x2.p bVar;
        y2.c cVar;
        int i12;
        int[] iArr4;
        String str3;
        Pair p5;
        CaptioningManager captioningManager;
        Locale locale;
        Pair p9;
        boolean z12;
        Context context;
        int[] iArr5;
        x2.s sVar = this.k;
        b[] bVarArr = this.j;
        u2.r1 r1Var = this.n;
        sVar.getClass();
        int i13 = 1;
        int[] iArr6 = new int[bVarArr.length + 1];
        int length = bVarArr.length + 1;
        b2.p1[][] p1VarArr = new b2.p1[length][];
        int[][][] iArr7 = new int[bVarArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = r1Var.a;
            p1VarArr[i14] = new b2.p1[i15];
            iArr7[i14] = new int[i15][];
        }
        int length2 = bVarArr.length;
        int[] iArr8 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr8[i16] = bVarArr[i16].D();
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
                x2.s sVar2 = sVar;
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
                sVar = sVar2;
                r1Var = r1Var2;
                i13 = i22;
            }
            x2.s sVar3 = sVar;
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
            p1VarArr[length3][i28] = a2;
            iArr7[length3][i28] = iArr5;
            iArr6[length3] = i28 + 1;
            i17++;
            sVar = sVar3;
            r1Var = r1Var3;
            i13 = i26;
        }
        x2.s sVar4 = sVar;
        int i29 = i13;
        u2.r1[] r1VarArr2 = new u2.r1[bVarArr.length];
        String[] strArr = new String[bVarArr.length];
        int[] iArr10 = new int[bVarArr.length];
        for (int i30 = 0; i30 < bVarArr.length; i30++) {
            int i31 = iArr6[i30];
            r1VarArr2[i30] = new u2.r1((b2.p1[]) e2.m0.U(i31, p1VarArr[i30]));
            iArr7[i30] = (int[][]) e2.m0.U(i31, iArr7[i30]);
            strArr[i30] = bVarArr[i30].j();
            iArr10[i30] = bVarArr[i30].b;
        }
        x2.r rVar = new x2.r(iArr10, r1VarArr2, iArr8, iArr7, new u2.r1((b2.p1[]) e2.m0.U(iArr6[bVarArr.length], p1VarArr[bVarArr.length])));
        x2.n nVar2 = (x2.n) sVar4;
        synchronized (nVar2.d) {
            nVar2.h = Thread.currentThread();
            iVar = nVar2.g;
        }
        if (nVar2.k == null && (context = nVar2.e) != null) {
            nVar2.k = Boolean.valueOf(e2.m0.P(context));
        }
        if (iVar.A0 && Build.VERSION.SDK_INT >= 32 && nVar2.i == null) {
            nVar2.i = new z2.e(nVar2.e, new tg.p(nVar2, 10), nVar2.k);
        }
        int i32 = rVar.a;
        x2.o[] oVarArr = new x2.o[i32];
        x2.n.f(rVar, iVar, oVarArr);
        x2.n.d(rVar, iVar, oVarArr);
        x2.n.e(rVar, iVar, oVarArr);
        Context context2 = nVar2.e;
        int i33 = rVar.a;
        Pair h = x2.n.h(oVarArr, i29);
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
            da.b bVar4 = new da.b(nVar2, iVar, z12, iArr8, 7);
            nVar = nVar2;
            iVar2 = iVar;
            h = x2.n.p(1, rVar, iArr7, bVar4, new jg0(21));
            if (h != null) {
                oVarArr[((Integer) h.second).intValue()] = (x2.o) h.first;
            }
        } else {
            iVar2 = iVar;
            nVar = nVar2;
        }
        if (h == null) {
            str = null;
        } else {
            x2.o oVar = (x2.o) h.first;
            str = oVar.a.d[oVar.b[0]].d;
        }
        Pair h10 = x2.n.h(oVarArr, 2);
        Pair h11 = x2.n.h(oVarArr, 4);
        if (h10 == null && h11 == null) {
            if (iVar2.w.a == 2) {
                str2 = str;
                p9 = null;
            } else {
                a1.d dVar = new a1.d(iVar2, str, iArr8, (!iVar2.k || context2 == null) ? null : e2.m0.y(context2), 22);
                str2 = str;
                p9 = x2.n.p(2, rVar, iArr7, dVar, new jg0(20));
            }
            Pair p10 = ((iVar2.E || p9 == null) && iVar2.w.a != 2) ? x2.n.p(4, rVar, iArr7, new qg.h0(iVar2, 25), new jg0(19)) : null;
            if (p10 != null) {
                oVarArr[((Integer) p10.second).intValue()] = (x2.o) p10.first;
            } else if (p9 != null) {
                oVarArr[((Integer) p9.second).intValue()] = (x2.o) p9.first;
            }
        } else {
            str2 = str;
        }
        if (x2.n.h(oVarArr, 3) == null) {
            if (iVar2.w.a == 2) {
                p5 = null;
            } else {
                if (!iVar2.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str3 = null;
                } else {
                    String str4 = e2.m0.a;
                    str3 = locale.toLanguageTag();
                }
                p5 = x2.n.p(3, rVar, iArr7, new ry(iVar2, str2, str3, 13), new jg0(22));
            }
            if (p5 != null) {
                oVarArr[((Integer) p5.second).intValue()] = (x2.o) p5.first;
            }
        }
        int c10 = e.c(0, 0, 0, 0);
        if (iVar2.w.a == 2) {
            iArr = iArr10;
            r1VarArr = r1VarArr2;
            iArr2 = iArr7;
        } else {
            int i35 = e9.y0.c;
            e9.x0 x0Var = new e9.x0(4);
            int i36 = 0;
            while (i36 < i32) {
                x2.o oVar2 = oVarArr[i36];
                if (oVar2 != null) {
                    b2.p1 p1Var = oVar2.a;
                    if (!iVar2.E0.get(i36)) {
                        i11 = i36;
                        if (!iVar2.I.contains(Integer.valueOf(p1Var.c))) {
                            x0Var.f(p1Var.b);
                            int i37 = 0;
                            while (true) {
                                int[] iArr11 = oVar2.b;
                                iArr3 = iArr10;
                                if (i37 < iArr11.length) {
                                    String str5 = p1Var.d[iArr11[i37]].m;
                                    if (str5 != null) {
                                        x0Var.c(str5);
                                    }
                                    i37++;
                                    iArr10 = iArr3;
                                }
                            }
                            i36 = i11 + 1;
                            iArr10 = iArr3;
                        }
                        iArr3 = iArr10;
                        i36 = i11 + 1;
                        iArr10 = iArr3;
                    }
                }
                i11 = i36;
                iArr3 = iArr10;
                i36 = i11 + 1;
                iArr10 = iArr3;
            }
            iArr = iArr10;
            e9.y0 g10 = x0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i38 = 0;
            while (i38 < i33) {
                if (iArr[i38] != 5) {
                    i10 = i38;
                } else {
                    u2.r1 r1Var4 = r1VarArr2[i38];
                    i10 = i38;
                    int i39 = 0;
                    while (i39 < r1Var4.a) {
                        b2.p1 a10 = r1Var4.a(i39);
                        arrayList.add(a10);
                        u2.r1[] r1VarArr3 = r1VarArr2;
                        int[] iArr12 = (int[]) iArr7[i10][i39].clone();
                        u2.r1 r1Var5 = r1Var4;
                        int[][][] iArr13 = iArr7;
                        for (int i40 = 0; i40 < iArr12.length; i40++) {
                            String str6 = a10.d[i40].m;
                            if (str6 != null && !g10.contains(str6)) {
                                iArr12[i40] = c10;
                            }
                        }
                        arrayList2.add(iArr12);
                        i39++;
                        r1Var4 = r1Var5;
                        r1VarArr2 = r1VarArr3;
                        iArr7 = iArr13;
                    }
                }
                i38 = i10 + 1;
                r1VarArr2 = r1VarArr2;
                iArr7 = iArr7;
            }
            r1VarArr = r1VarArr2;
            iArr2 = iArr7;
            int size = arrayList.size();
            b2.p1[] p1VarArr2 = new b2.p1[size];
            u6.p(arrayList.size() == size);
            arrayList.toArray(p1VarArr2);
            u2.r1 r1Var6 = new u2.r1(p1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2][];
            u6.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr14);
            for (int i41 = 0; i41 < i33; i41++) {
                if (iArr[i41] == 5) {
                    x2.o o10 = x2.n.o(r1Var6, iArr14, iVar2);
                    oVarArr[i41] = o10;
                    if (o10 == null) {
                        break;
                    }
                    Arrays.fill(iArr14[r1Var6.b(o10.a)], c10);
                }
            }
        }
        for (int i42 = 0; i42 < i33; i42++) {
            int i43 = iArr[i42];
            if (i43 != 2 && i43 != 1) {
                if (i43 != 3 && i43 != 4) {
                    if (i43 != 5 && oVarArr[i42] == null) {
                        oVarArr[i42] = x2.n.o(r1VarArr[i42], iArr2[i42], iVar2);
                    }
                }
            }
        }
        x2.n.f(rVar, iVar2, oVarArr);
        x2.n.d(rVar, iVar2, oVarArr);
        x2.n.e(rVar, iVar2, oVarArr);
        oa.d dVar2 = nVar.f;
        y2.c cVar2 = nVar.b;
        cVar2.getClass();
        dVar2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (x2.o oVar3 : oVarArr) {
            if (oVar3 == null || oVar3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                e9.k0 t10 = e9.n0.t();
                t10.c(new x2.a(0L, 0L));
                arrayList3.add(t10);
            }
        }
        int length4 = oVarArr.length;
        long[][] jArr = new long[length4][];
        for (int i44 = 0; i44 < oVarArr.length; i44++) {
            x2.o oVar4 = oVarArr[i44];
            if (oVar4 == null) {
                jArr[i44] = new long[0];
            } else {
                int[] iArr15 = oVar4.b;
                jArr[i44] = new long[iArr15.length];
                for (int i45 = 0; i45 < iArr15.length; i45++) {
                    long j10 = oVar4.a.d[iArr15[i45]].j;
                    long[] jArr2 = jArr[i44];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i45] = j10;
                }
                Arrays.sort(jArr[i44]);
            }
        }
        int[] iArr16 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i46 = 0; i46 < length4; i46++) {
            long[] jArr4 = jArr[i46];
            jArr3[i46] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList3, jArr3);
        e9.s.f(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.s1.b);
        e9.o1 o1Var2 = new e9.o1();
        e9.p1 p1Var2 = new e9.p1(treeMap);
        p1Var2.h = o1Var2;
        int i47 = 0;
        while (i47 < length4) {
            long[] jArr5 = jArr[i47];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i12 = length4;
                iArr4 = iArr16;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i48 = 0;
                while (true) {
                    long[] jArr6 = jArr[i47];
                    i12 = length4;
                    double d = 0.0d;
                    if (i48 >= jArr6.length) {
                        break;
                    }
                    int[] iArr17 = iArr16;
                    long j11 = jArr6[i48];
                    if (j11 != -1) {
                        d = Math.log(j11);
                    }
                    dArr[i48] = d;
                    i48++;
                    length4 = i12;
                    iArr16 = iArr17;
                }
                iArr4 = iArr16;
                int i49 = length5 - 1;
                double d10 = dArr[i49] - dArr[0];
                int i50 = 0;
                while (i50 < i49) {
                    double d11 = dArr[i50];
                    int i51 = i50 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i51]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i47);
                    double d12 = d10;
                    Map map = p1Var2.e;
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
                    i50 = i51;
                    d10 = d12;
                }
            }
            i47++;
            length4 = i12;
            iArr16 = iArr4;
            cVar2 = cVar;
        }
        y2.c cVar3 = cVar2;
        int[] iArr18 = iArr16;
        Collection collection2 = p1Var2.c;
        if (collection2 == null) {
            collection2 = new e9.o(p1Var2, 1);
            p1Var2.c = collection2;
        }
        e9.n0 u10 = e9.n0.u(collection2);
        for (int i52 = 0; i52 < u10.size(); i52++) {
            int intValue = ((Integer) u10.get(i52)).intValue();
            int i53 = iArr18[intValue] + 1;
            iArr18[intValue] = i53;
            jArr3[intValue] = jArr[intValue][i53];
            x2.b.v(arrayList3, jArr3);
        }
        for (int i54 = 0; i54 < oVarArr.length; i54++) {
            if (arrayList3.get(i54) != null) {
                jArr3[i54] = jArr3[i54] * 2;
            }
        }
        x2.b.v(arrayList3, jArr3);
        e9.k0 t11 = e9.n0.t();
        for (int i55 = 0; i55 < arrayList3.size(); i55++) {
            e9.k0 k0Var = (e9.k0) arrayList3.get(i55);
            t11.c(k0Var == null ? x1.e : k0Var.f());
        }
        x1 f10 = t11.f();
        x2.p[] pVarArr = new x2.p[oVarArr.length];
        for (int i56 = 0; i56 < oVarArr.length; i56++) {
            x2.o oVar5 = oVarArr[i56];
            if (oVar5 != null) {
                int[] iArr19 = oVar5.b;
                if (iArr19.length != 0) {
                    if (iArr19.length == 1) {
                        bVar = new x2.q(oVar5.a, new int[]{iArr19[0]});
                    } else {
                        long j12 = 25000;
                        bVar = new x2.b(oVar5.a, iArr19, cVar3, 10000, j12, j12, (e9.n0) f10.get(i56));
                    }
                    pVarArr[i56] = bVar;
                }
            }
        }
        p1[] p1VarArr3 = new p1[i32];
        for (int i57 = 0; i57 < i32; i57++) {
            p1VarArr3[i57] = (iVar2.E0.get(i57) || iVar2.I.contains(Integer.valueOf(rVar.b[i57])) || (rVar.b[i57] != -2 && pVarArr[i57] == null)) ? null : p1.c;
        }
        if (iVar2.w.a != 0) {
            int i58 = 0;
            int i59 = 0;
            int i60 = -1;
            while (true) {
                if (i58 < rVar.a) {
                    int i61 = rVar.b[i58];
                    x2.p pVar = pVarArr[i58];
                    if (i61 != 1 && pVar != null) {
                        break;
                    }
                    if (i61 == 1 && pVar != null && pVar.length() == 1) {
                        if (x2.n.n(iVar2, iArr2[i58][rVar.c[i58].b(pVar.b())][pVar.h(0)], pVar.m())) {
                            i59++;
                            i60 = i58;
                        }
                    }
                    i58++;
                } else if (i59 == 1) {
                    int i62 = iVar2.w.b ? 1 : 2;
                    p1 p1Var3 = p1VarArr3[i60];
                    p1VarArr3[i60] = new p1(i62, p1Var3 != null && p1Var3.b);
                }
            }
        }
        Pair create = Pair.create(p1VarArr3, pVarArr);
        x2.p[] pVarArr2 = (x2.p[]) create.second;
        int length6 = pVarArr2.length;
        List[] listArr = new List[length6];
        for (int i63 = 0; i63 < pVarArr2.length; i63++) {
            x2.p pVar2 = pVarArr2[i63];
            if (pVar2 != null) {
                x1Var = e9.n0.y(pVar2);
            } else {
                e9.l0 l0Var = e9.n0.b;
                x1Var = x1.e;
            }
            listArr[i63] = x1Var;
        }
        e9.k0 k0Var2 = new e9.k0(4);
        int i64 = 0;
        while (true) {
            int i65 = rVar.a;
            u2.r1[] r1VarArr4 = rVar.c;
            if (i64 >= i65) {
                break;
            }
            u2.r1 r1Var7 = r1VarArr4[i64];
            int i66 = 0;
            while (i66 < r1Var7.a) {
                b2.p1 a11 = r1Var7.a(i66);
                int i67 = r1VarArr4[i64].a(i66).a;
                int[] iArr20 = new int[i67];
                int i68 = 0;
                int i69 = 0;
                while (i69 < i67) {
                    List[] listArr2 = listArr;
                    if ((rVar.e[i64][i66][i69] & 7) == 4) {
                        iArr20[i68] = i69;
                        i68++;
                    }
                    i69++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr20, i68);
                int i70 = 16;
                int i71 = i64;
                int i72 = 0;
                String str7 = null;
                boolean z13 = false;
                int i73 = 0;
                while (i72 < copyOf.length) {
                    int[] iArr21 = copyOf;
                    String str8 = r1VarArr4[i71].a(i66).d[copyOf[i72]].s;
                    int i74 = i73 + 1;
                    if (i73 == 0) {
                        str7 = str8;
                    } else {
                        z13 = (!Objects.equals(str7, str8)) | z13;
                    }
                    i70 = Math.min(i70, rVar.e[i71][i66][i72] & 24);
                    i72++;
                    i73 = i74;
                    copyOf = iArr21;
                }
                if (z13) {
                    i70 = Math.min(i70, rVar.d[i71]);
                }
                boolean z14 = i70 != 0;
                int i75 = a11.a;
                int[] iArr22 = new int[i75];
                boolean[] zArr = new boolean[i75];
                int i76 = 0;
                while (i76 < a11.a) {
                    iArr22[i76] = rVar.e[i71][i66][i76] & 7;
                    int i77 = 0;
                    boolean z15 = false;
                    while (i77 < length6) {
                        List list = listArr3[i77];
                        int i78 = length6;
                        u2.r1 r1Var8 = r1Var7;
                        int i79 = 0;
                        while (true) {
                            if (i79 < list.size()) {
                                x2.p pVar3 = (x2.p) list.get(i79);
                                int i80 = i79;
                                if (pVar3.b().equals(a11) && pVar3.u(i76) != -1) {
                                    z15 = true;
                                    break;
                                }
                                i79 = i80 + 1;
                            }
                        }
                        i77++;
                        length6 = i78;
                        r1Var7 = r1Var8;
                    }
                    zArr[i76] = z15;
                    i76++;
                    r1Var7 = r1Var7;
                }
                k0Var2.c(new u1(a11, z14, iArr22, zArr));
                i66++;
                listArr = listArr3;
                i64 = i71;
                length6 = length6;
                r1Var7 = r1Var7;
            }
            i64++;
        }
        u2.r1 r1Var9 = rVar.f;
        for (int i81 = 0; i81 < r1Var9.a; i81++) {
            b2.p1 a12 = r1Var9.a(i81);
            int[] iArr23 = new int[a12.a];
            Arrays.fill(iArr23, 0);
            k0Var2.c(new u1(a12, false, iArr23, new boolean[a12.a]));
        }
        x2.t tVar = new x2.t((p1[]) create.first, (x2.p[]) create.second, new v1(k0Var2.f()), rVar);
        for (int i82 = 0; i82 < tVar.a; i82++) {
            if (tVar.b(i82)) {
                if (tVar.c[i82] == null && this.j[i82].b != -2) {
                    z11 = false;
                    u6.p(z11);
                }
                z11 = true;
                u6.p(z11);
            } else {
                u6.p(tVar.c[i82] == null);
            }
        }
        for (x2.p pVar4 : tVar.c) {
            if (pVar4 != null) {
                pVar4.p(f7);
                pVar4.e(z10);
            }
        }
        return tVar;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof u2.e) {
            long j10 = this.g.e;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            u2.e eVar = (u2.e) obj;
            eVar.f = 0L;
            eVar.h = j10;
        }
    }
}
