package i2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b2.v1;
import b2.w1;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.nz;
import org.telegram.ui.ds0;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final j1 l;
    public x0 m;
    public u2.r1 n;
    public x2.t o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u2.e] */
    public x0(b[] bVarArr, long j10, x2.s sVar, androidx.biometric.e eVar, j1 j1Var, y0 y0Var, x2.t tVar) {
        this.j = bVarArr;
        this.p = j10;
        this.k = sVar;
        this.l = j1Var;
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
        u2.y c10 = i1Var.a.c(a2, eVar, j11);
        j1Var.c.put(c10, i1Var);
        j1Var.c();
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
        long n10 = this.a.n(tVar.c, this.i, this.c, zArr, j10);
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
        return n10;
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
        long p5 = this.f ? this.a.p() : Long.MIN_VALUE;
        return p5 == Long.MIN_VALUE ? this.g.f : p5;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u2.e0] */
    public final void f(float f7, b2.p1 p1Var, boolean z10) {
        this.e = true;
        this.n = this.a.o();
        x2.t j10 = j(f7, p1Var, z10);
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
            return !this.f || this.a.p() == Long.MIN_VALUE;
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
            j1 j1Var = this.l;
            if (z10) {
                j1Var.f(((u2.e) r02).a);
            } else {
                j1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final x2.t j(float f7, b2.p1 p1Var, boolean z10) {
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
        Pair p10;
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
            q1VarArr[length3][i28] = a2;
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
            r1VarArr2[i30] = new u2.r1((b2.q1[]) e2.m0.U(i31, q1VarArr[i30]));
            iArr7[i30] = (int[][]) e2.m0.U(i31, iArr7[i30]);
            strArr[i30] = bVarArr[i30].j();
            iArr10[i30] = bVarArr[i30].b;
        }
        x2.r rVar = new x2.r(iArr10, r1VarArr2, iArr8, iArr7, new u2.r1((b2.q1[]) e2.m0.U(iArr6[bVarArr.length], q1VarArr[bVarArr.length])));
        x2.n nVar2 = (x2.n) sVar4;
        synchronized (nVar2.d) {
            nVar2.h = Thread.currentThread();
            iVar = nVar2.g;
        }
        if (nVar2.k == null && (context = nVar2.e) != null) {
            nVar2.k = Boolean.valueOf(e2.m0.P(context));
        }
        if (iVar.A0 && Build.VERSION.SDK_INT >= 32 && nVar2.i == null) {
            nVar2.i = new z2.d(nVar2.e, new ri.h0(nVar2, 20), nVar2.k);
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
            h = x2.n.p(1, rVar, iArr7, bVar4, new ds0(18));
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
                a1.d dVar = new a1.d(iVar2, str, iArr8, (!iVar2.k || context2 == null) ? null : e2.m0.y(context2), 20);
                str2 = str;
                p9 = x2.n.p(2, rVar, iArr7, dVar, new ds0(17));
            }
            if ((iVar2.E || p9 == null) && iVar2.w.a != 2) {
                int i35 = 16;
                p10 = x2.n.p(4, rVar, iArr7, new rg.b0(iVar2, i35), new ds0(i35));
            } else {
                p10 = null;
            }
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
                p5 = x2.n.p(3, rVar, iArr7, new nz(iVar2, str2, str3, 12), new ds0(19));
            }
            if (p5 != null) {
                oVarArr[((Integer) p5.second).intValue()] = (x2.o) p5.first;
            }
        }
        int c10 = d.c(0, 0, 0, 0);
        if (iVar2.w.a == 2) {
            iArr = iArr10;
            r1VarArr = r1VarArr2;
            iArr2 = iArr7;
        } else {
            int i36 = e9.y0.c;
            e9.x0 x0Var = new e9.x0(4);
            int i37 = 0;
            while (i37 < i32) {
                x2.o oVar2 = oVarArr[i37];
                if (oVar2 != null) {
                    b2.q1 q1Var = oVar2.a;
                    if (!iVar2.E0.get(i37)) {
                        i11 = i37;
                        if (!iVar2.I.contains(Integer.valueOf(q1Var.c))) {
                            x0Var.f(q1Var.b);
                            int i38 = 0;
                            while (true) {
                                int[] iArr11 = oVar2.b;
                                iArr3 = iArr10;
                                if (i38 < iArr11.length) {
                                    String str5 = q1Var.d[iArr11[i38]].m;
                                    if (str5 != null) {
                                        x0Var.c(str5);
                                    }
                                    i38++;
                                    iArr10 = iArr3;
                                }
                            }
                            i37 = i11 + 1;
                            iArr10 = iArr3;
                        }
                        iArr3 = iArr10;
                        i37 = i11 + 1;
                        iArr10 = iArr3;
                    }
                }
                i11 = i37;
                iArr3 = iArr10;
                i37 = i11 + 1;
                iArr10 = iArr3;
            }
            iArr = iArr10;
            e9.y0 g10 = x0Var.g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i39 = 0;
            while (i39 < i33) {
                if (iArr[i39] != 5) {
                    i10 = i39;
                } else {
                    u2.r1 r1Var4 = r1VarArr2[i39];
                    i10 = i39;
                    int i40 = 0;
                    while (i40 < r1Var4.a) {
                        b2.q1 a10 = r1Var4.a(i40);
                        arrayList.add(a10);
                        u2.r1[] r1VarArr3 = r1VarArr2;
                        int[] iArr12 = (int[]) iArr7[i10][i40].clone();
                        u2.r1 r1Var5 = r1Var4;
                        int[][][] iArr13 = iArr7;
                        for (int i41 = 0; i41 < iArr12.length; i41++) {
                            String str6 = a10.d[i41].m;
                            if (str6 != null && !g10.contains(str6)) {
                                iArr12[i41] = c10;
                            }
                        }
                        arrayList2.add(iArr12);
                        i40++;
                        r1Var4 = r1Var5;
                        r1VarArr2 = r1VarArr3;
                        iArr7 = iArr13;
                    }
                }
                i39 = i10 + 1;
                r1VarArr2 = r1VarArr2;
                iArr7 = iArr7;
            }
            r1VarArr = r1VarArr2;
            iArr2 = iArr7;
            int size = arrayList.size();
            b2.q1[] q1VarArr2 = new b2.q1[size];
            u6.p(arrayList.size() == size);
            arrayList.toArray(q1VarArr2);
            u2.r1 r1Var6 = new u2.r1(q1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2][];
            u6.p(arrayList2.size() == size2);
            arrayList2.toArray(iArr14);
            for (int i42 = 0; i42 < i33; i42++) {
                if (iArr[i42] == 5) {
                    x2.o o10 = x2.n.o(r1Var6, iArr14, iVar2);
                    oVarArr[i42] = o10;
                    if (o10 == null) {
                        break;
                    }
                    Arrays.fill(iArr14[r1Var6.b(o10.a)], c10);
                }
            }
        }
        for (int i43 = 0; i43 < i33; i43++) {
            int i44 = iArr[i43];
            if (i44 != 2 && i44 != 1) {
                if (i44 != 3 && i44 != 4) {
                    if (i44 != 5 && oVarArr[i43] == null) {
                        oVarArr[i43] = x2.n.o(r1VarArr[i43], iArr2[i43], iVar2);
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
        for (int i45 = 0; i45 < oVarArr.length; i45++) {
            x2.o oVar4 = oVarArr[i45];
            if (oVar4 == null) {
                jArr[i45] = new long[0];
            } else {
                int[] iArr15 = oVar4.b;
                jArr[i45] = new long[iArr15.length];
                for (int i46 = 0; i46 < iArr15.length; i46++) {
                    long j10 = oVar4.a.d[iArr15[i46]].j;
                    long[] jArr2 = jArr[i45];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i46] = j10;
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
        x2.b.v(arrayList3, jArr3);
        e9.s.f(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.s1.b);
        e9.o1 o1Var = new e9.o1();
        e9.p1 p1Var2 = new e9.p1(treeMap);
        p1Var2.h = o1Var;
        int i48 = 0;
        while (i48 < length4) {
            long[] jArr5 = jArr[i48];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i12 = length4;
                iArr4 = iArr16;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i49 = 0;
                while (true) {
                    long[] jArr6 = jArr[i48];
                    i12 = length4;
                    double d = 0.0d;
                    if (i49 >= jArr6.length) {
                        break;
                    }
                    int[] iArr17 = iArr16;
                    long j11 = jArr6[i49];
                    if (j11 != -1) {
                        d = Math.log(j11);
                    }
                    dArr[i49] = d;
                    i49++;
                    length4 = i12;
                    iArr16 = iArr17;
                }
                iArr4 = iArr16;
                int i50 = length5 - 1;
                double d10 = dArr[i50] - dArr[0];
                int i51 = 0;
                while (i51 < i50) {
                    double d11 = dArr[i51];
                    int i52 = i51 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i52]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i48);
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
                    i51 = i52;
                    d10 = d12;
                }
            }
            i48++;
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
        for (int i53 = 0; i53 < u10.size(); i53++) {
            int intValue = ((Integer) u10.get(i53)).intValue();
            int i54 = iArr18[intValue] + 1;
            iArr18[intValue] = i54;
            jArr3[intValue] = jArr[intValue][i54];
            x2.b.v(arrayList3, jArr3);
        }
        for (int i55 = 0; i55 < oVarArr.length; i55++) {
            if (arrayList3.get(i55) != null) {
                jArr3[i55] = jArr3[i55] * 2;
            }
        }
        x2.b.v(arrayList3, jArr3);
        e9.k0 t11 = e9.n0.t();
        for (int i56 = 0; i56 < arrayList3.size(); i56++) {
            e9.k0 k0Var = (e9.k0) arrayList3.get(i56);
            t11.c(k0Var == null ? x1.e : k0Var.f());
        }
        x1 f10 = t11.f();
        x2.p[] pVarArr = new x2.p[oVarArr.length];
        for (int i57 = 0; i57 < oVarArr.length; i57++) {
            x2.o oVar5 = oVarArr[i57];
            if (oVar5 != null) {
                int[] iArr19 = oVar5.b;
                if (iArr19.length != 0) {
                    if (iArr19.length == 1) {
                        bVar = new x2.q(oVar5.a, new int[]{iArr19[0]});
                    } else {
                        long j12 = 25000;
                        bVar = new x2.b(oVar5.a, iArr19, cVar3, 10000, j12, j12, (e9.n0) f10.get(i57));
                    }
                    pVarArr[i57] = bVar;
                }
            }
        }
        q1[] q1VarArr3 = new q1[i32];
        for (int i58 = 0; i58 < i32; i58++) {
            q1VarArr3[i58] = (iVar2.E0.get(i58) || iVar2.I.contains(Integer.valueOf(rVar.b[i58])) || (rVar.b[i58] != -2 && pVarArr[i58] == null)) ? null : q1.c;
        }
        if (iVar2.w.a != 0) {
            int i59 = 0;
            int i60 = 0;
            int i61 = -1;
            while (true) {
                if (i59 < rVar.a) {
                    int i62 = rVar.b[i59];
                    x2.p pVar = pVarArr[i59];
                    if (i62 != 1 && pVar != null) {
                        break;
                    }
                    if (i62 == 1 && pVar != null && pVar.length() == 1) {
                        if (x2.n.n(iVar2, iArr2[i59][rVar.c[i59].b(pVar.b())][pVar.h(0)], pVar.m())) {
                            i60++;
                            i61 = i59;
                        }
                    }
                    i59++;
                } else if (i60 == 1) {
                    int i63 = iVar2.w.b ? 1 : 2;
                    q1 q1Var2 = q1VarArr3[i61];
                    q1VarArr3[i61] = new q1(i63, q1Var2 != null && q1Var2.b);
                }
            }
        }
        Pair create = Pair.create(q1VarArr3, pVarArr);
        x2.p[] pVarArr2 = (x2.p[]) create.second;
        int length6 = pVarArr2.length;
        List[] listArr = new List[length6];
        for (int i64 = 0; i64 < pVarArr2.length; i64++) {
            x2.p pVar2 = pVarArr2[i64];
            if (pVar2 != null) {
                x1Var = e9.n0.y(pVar2);
            } else {
                e9.l0 l0Var = e9.n0.b;
                x1Var = x1.e;
            }
            listArr[i64] = x1Var;
        }
        e9.k0 k0Var2 = new e9.k0(4);
        int i65 = 0;
        while (true) {
            int i66 = rVar.a;
            u2.r1[] r1VarArr4 = rVar.c;
            if (i65 >= i66) {
                break;
            }
            u2.r1 r1Var7 = r1VarArr4[i65];
            int i67 = 0;
            while (i67 < r1Var7.a) {
                b2.q1 a11 = r1Var7.a(i67);
                int i68 = r1VarArr4[i65].a(i67).a;
                int[] iArr20 = new int[i68];
                int i69 = 0;
                int i70 = 0;
                while (i70 < i68) {
                    List[] listArr2 = listArr;
                    if ((rVar.e[i65][i67][i70] & 7) == 4) {
                        iArr20[i69] = i70;
                        i69++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr20, i69);
                int i71 = i65;
                int i72 = 0;
                String str7 = null;
                boolean z13 = false;
                int i73 = 0;
                int i74 = 16;
                while (i72 < copyOf.length) {
                    int[] iArr21 = copyOf;
                    String str8 = r1VarArr4[i71].a(i67).d[copyOf[i72]].s;
                    int i75 = i73 + 1;
                    if (i73 == 0) {
                        str7 = str8;
                    } else {
                        z13 = (!Objects.equals(str7, str8)) | z13;
                    }
                    i74 = Math.min(i74, rVar.e[i71][i67][i72] & 24);
                    i72++;
                    i73 = i75;
                    copyOf = iArr21;
                }
                if (z13) {
                    i74 = Math.min(i74, rVar.d[i71]);
                }
                boolean z14 = i74 != 0;
                int i76 = a11.a;
                int[] iArr22 = new int[i76];
                boolean[] zArr = new boolean[i76];
                int i77 = 0;
                while (i77 < a11.a) {
                    iArr22[i77] = rVar.e[i71][i67][i77] & 7;
                    int i78 = 0;
                    boolean z15 = false;
                    while (i78 < length6) {
                        List list = listArr3[i78];
                        int i79 = length6;
                        u2.r1 r1Var8 = r1Var7;
                        int i80 = 0;
                        while (true) {
                            if (i80 < list.size()) {
                                x2.p pVar3 = (x2.p) list.get(i80);
                                int i81 = i80;
                                if (pVar3.b().equals(a11) && pVar3.u(i77) != -1) {
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
                k0Var2.c(new v1(a11, z14, iArr22, zArr));
                i67++;
                listArr = listArr3;
                i65 = i71;
                length6 = length6;
                r1Var7 = r1Var7;
            }
            i65++;
        }
        u2.r1 r1Var9 = rVar.f;
        for (int i82 = 0; i82 < r1Var9.a; i82++) {
            b2.q1 a12 = r1Var9.a(i82);
            int[] iArr23 = new int[a12.a];
            Arrays.fill(iArr23, 0);
            k0Var2.c(new v1(a12, false, iArr23, new boolean[a12.a]));
        }
        x2.t tVar = new x2.t((q1[]) create.first, (x2.p[]) create.second, new w1(k0Var2.f()), rVar);
        for (int i83 = 0; i83 < tVar.a; i83++) {
            if (tVar.b(i83)) {
                if (tVar.c[i83] == null && this.j[i83].b != -2) {
                    z11 = false;
                    u6.p(z11);
                }
                z11 = true;
                u6.p(z11);
            } else {
                u6.p(tVar.c[i83] == null);
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
