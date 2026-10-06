package i2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b2.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.telegram.ui.Components.v50;
import org.telegram.ui.eb1;
import v7.y7;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class u0 {
    public final Object a;
    public final Object b;
    public final u2.c1[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public v0 g;
    public boolean h;
    public final boolean[] i;
    public final f[] j;
    public final x2.u k;
    public final g1 l;
    public u0 m;
    public u2.p1 n;
    public x2.v o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u2.d] */
    public u0(f[] fVarArr, long j3, x2.u uVar, y2.d dVar, g1 g1Var, v0 v0Var, x2.v vVar) {
        this.j = fVarArr;
        this.p = j3;
        this.k = uVar;
        this.l = g1Var;
        u2.f0 f0Var = v0Var.a;
        this.b = f0Var.a;
        this.g = v0Var;
        this.n = u2.p1.d;
        this.o = vVar;
        this.c = new u2.c1[fVarArr.length];
        this.i = new boolean[fVarArr.length];
        long j10 = v0Var.b;
        long j11 = v0Var.d;
        boolean z10 = v0Var.f;
        g1Var.getClass();
        Object obj = f0Var.a;
        int i10 = a.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.f0 a2 = f0Var.a(pair.second);
        f1 f1Var = (f1) g1Var.d.get(obj2);
        f1Var.getClass();
        g1Var.g.add(f1Var);
        e1 e1Var = (e1) g1Var.f.get(f1Var);
        if (e1Var != null) {
            e1Var.a.f(e1Var.b);
        }
        f1Var.c.add(a2);
        u2.x c10 = f1Var.a.c(a2, dVar, j10);
        g1Var.c.put(c10, f1Var);
        g1Var.c();
        this.a = j11 != -9223372036854775807L ? new u2.d(c10, !z10, 0L, j11) : c10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u2.d0] */
    public final long a(x2.v vVar, long j3, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        u2.c1[] c1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= vVar.a) {
                break;
            }
            if (z10 || !vVar.a(this.o, i10)) {
                z11 = false;
            }
            this.i[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            fVarArr = this.j;
            int length = fVarArr.length;
            c1VarArr = this.c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].b == -2) {
                c1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.o = vVar;
        c();
        long n10 = this.a.n(vVar.c, this.i, this.c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].b == -2 && this.o.b(i12)) {
                c1VarArr[i12] = new u2.q();
            }
        }
        this.f = false;
        for (int i13 = 0; i13 < c1VarArr.length; i13++) {
            if (c1VarArr[i13] != null) {
                e2.d.g(vVar.b(i13));
                if (fVarArr[i13].b != -2) {
                    this.f = true;
                }
            } else {
                e2.d.g(vVar.c[i13] == null);
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
            x2.v vVar = this.o;
            if (i10 >= vVar.a) {
                return;
            }
            boolean b10 = vVar.b(i10);
            x2.r rVar = this.o.c[i10];
            if (b10 && rVar != null) {
                rVar.j();
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
            x2.v vVar = this.o;
            if (i10 >= vVar.a) {
                return;
            }
            boolean b10 = vVar.b(i10);
            x2.r rVar = this.o.c[i10];
            if (b10 && rVar != null) {
                rVar.g();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u2.e1] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long p5 = this.f ? this.a.p() : Long.MIN_VALUE;
        return p5 == Long.MIN_VALUE ? this.g.e : p5;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u2.d0] */
    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.e = true;
        this.n = this.a.o();
        x2.v j3 = j(f7, k1Var, z10);
        v0 v0Var = this.g;
        long j10 = v0Var.b;
        long j11 = v0Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = a(j3, j10, false, new boolean[this.j.length]);
        long j12 = this.p;
        v0 v0Var2 = this.g;
        this.p = (v0Var2.b - a2) + j12;
        this.g = v0Var2.b(a2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u2.e1] */
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
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u2.d0] */
    public final void i() {
        b();
        ?? r02 = this.a;
        try {
            boolean z10 = r02 instanceof u2.d;
            g1 g1Var = this.l;
            if (z10) {
                g1Var.f(((u2.d) r02).a);
            } else {
                g1Var.f(r02);
            }
        } catch (RuntimeException e7) {
            e2.a.f("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v56 */
    public final x2.v j(float f7, b2.k1 k1Var, boolean z10) {
        x2.i iVar;
        boolean z11;
        String str;
        String str2;
        b2.l1 l1Var;
        Pair j3;
        int[] iArr;
        Pair pair;
        Object obj;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pair2;
        boolean z12;
        boolean z13;
        e9.a1 a1Var;
        x2.r bVar;
        y2.c cVar;
        int i10;
        int[] iArr2;
        x2.t tVar;
        b2.l1 l1Var2;
        int i11;
        b2.o1 o1Var;
        Object qVar;
        int i12;
        int[][] iArr3;
        Context context;
        int[] iArr4;
        x2.u uVar = this.k;
        f[] fVarArr = this.j;
        u2.p1 p1Var = this.n;
        uVar.getClass();
        int[] iArr5 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length][];
        int[][][] iArr6 = new int[fVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = p1Var.a;
            l1VarArr[i13] = new b2.l1[i14];
            iArr6[i13] = new int[i14][];
        }
        int length2 = fVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr7[i15] = fVarArr[i15].B();
        }
        int i16 = 0;
        while (i16 < p1Var.a) {
            b2.l1 a2 = p1Var.a(i16);
            boolean z14 = a2.c == 5;
            int length3 = fVarArr.length;
            int i17 = 0;
            int i18 = 0;
            boolean z15 = true;
            while (i17 < fVarArr.length) {
                f fVar = fVarArr[i17];
                x2.u uVar2 = uVar;
                u2.p1 p1Var2 = p1Var;
                int i19 = 0;
                for (int i20 = 0; i20 < a2.a; i20++) {
                    i19 = Math.max(i19, fVar.A(a2.d[i20]) & 7);
                }
                boolean z16 = iArr5[i17] == 0;
                if (i19 > i18 || (i19 == i18 && z14 && !z15 && z16)) {
                    i18 = i19;
                    z15 = z16;
                    length3 = i17;
                }
                i17++;
                uVar = uVar2;
                p1Var = p1Var2;
            }
            x2.u uVar3 = uVar;
            u2.p1 p1Var3 = p1Var;
            if (length3 == fVarArr.length) {
                iArr4 = new int[a2.a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr8 = new int[a2.a];
                for (int i21 = 0; i21 < a2.a; i21++) {
                    iArr8[i21] = fVar2.A(a2.d[i21]);
                }
                iArr4 = iArr8;
            }
            int i22 = iArr5[length3];
            l1VarArr[length3][i22] = a2;
            iArr6[length3][i22] = iArr4;
            iArr5[length3] = i22 + 1;
            i16++;
            uVar = uVar3;
            p1Var = p1Var3;
        }
        x2.u uVar4 = uVar;
        u2.p1[] p1VarArr = new u2.p1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr9 = new int[fVarArr.length];
        for (int i23 = 0; i23 < fVarArr.length; i23++) {
            int i24 = iArr5[i23];
            p1VarArr[i23] = new u2.p1((b2.l1[]) e2.d0.S(i24, l1VarArr[i23]));
            iArr6[i23] = (int[][]) e2.d0.S(i24, iArr6[i23]);
            strArr[i23] = fVarArr[i23].j();
            iArr9[i23] = fVarArr[i23].b;
        }
        x2.t tVar2 = new x2.t(iArr9, p1VarArr, iArr7, iArr6, new u2.p1((b2.l1[]) e2.d0.S(iArr5[fVarArr.length], l1VarArr[fVarArr.length])));
        x2.p pVar = (x2.p) uVar4;
        synchronized (pVar.d) {
            pVar.h = Thread.currentThread();
            iVar = pVar.g;
        }
        if (pVar.k == null && (context = pVar.e) != null) {
            pVar.k = Boolean.valueOf(e2.d0.N(context));
        }
        if (iVar.s0 && Build.VERSION.SDK_INT >= 32 && pVar.i == null) {
            pVar.i = new x2.k(pVar.e, pVar, pVar.k);
        }
        int i25 = tVar2.a;
        Context context2 = pVar.e;
        x2.q[] qVarArr = new x2.q[i25];
        int i26 = 0;
        while (true) {
            if (i26 >= tVar2.a) {
                z11 = false;
                break;
            }
            if (2 == iArr9[i26] && p1VarArr[i26].a > 0) {
                z11 = true;
                break;
            }
            i26++;
        }
        Pair j10 = x2.p.j(1, tVar2, iArr6, new ca.b(pVar, iVar, z11, iArr7, 7), new eb1(14));
        if (j10 != null) {
            qVarArr[((Integer) j10.second).intValue()] = (x2.q) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.q qVar2 = (x2.q) j10.first;
            str = qVar2.a.d[qVar2.b[0]].d;
        }
        b2.o1 o1Var2 = iVar.u;
        if (o1Var2.a == 2) {
            str2 = str;
            j3 = null;
            l1Var = null;
        } else {
            a1.d dVar = new a1.d(iVar, str, iArr7, (!iVar.k || context2 == null) ? null : e2.d0.w(context2), 20);
            str2 = str;
            l1Var = null;
            j3 = x2.p.j(2, tVar2, iArr6, dVar, new eb1(13));
        }
        int i27 = 4;
        if ((iVar.A || j3 == null) && o1Var2.a != 2) {
            iArr = iArr9;
            pair = x2.p.j(4, tVar2, iArr6, new r2.s(iVar, 15), new eb1(12));
        } else {
            iArr = iArr9;
            pair = l1Var;
        }
        if (pair != 0) {
            qVarArr[((Integer) pair.second).intValue()] = (x2.q) pair.first;
        } else if (j3 != null) {
            qVarArr[((Integer) j3.second).intValue()] = (x2.q) j3.first;
        }
        int i28 = 3;
        if (o1Var2.a == 2) {
            pair2 = l1Var;
        } else {
            if (!iVar.x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                obj = l1Var;
            } else {
                String str3 = e2.d0.a;
                obj = locale.toLanguageTag();
            }
            pair2 = x2.p.j(3, tVar2, iArr6, new v50(iVar, str2, obj, 11), new eb1(15));
        }
        if (pair2 != 0) {
            qVarArr[((Integer) pair2.second).intValue()] = (x2.q) pair2.first;
        }
        int i29 = 0;
        while (i29 < i25) {
            int i30 = iArr[i29];
            if (i30 == 2 || i30 == 1 || i30 == i28 || i30 == i27) {
                i11 = i29;
                o1Var = o1Var2;
            } else {
                u2.p1 p1Var4 = p1VarArr[i29];
                int[][] iArr10 = iArr6[i29];
                if (o1Var2.a == 2) {
                    i11 = i29;
                    o1Var = o1Var2;
                } else {
                    b2.l1 l1Var3 = l1Var;
                    b2.l1 l1Var4 = l1Var3;
                    int i31 = 0;
                    int i32 = 0;
                    while (i31 < p1Var4.a) {
                        b2.l1 a10 = p1Var4.a(i31);
                        int[] iArr11 = iArr10[i31];
                        int i33 = i29;
                        b2.o1 o1Var3 = o1Var2;
                        x2.g gVar = l1Var4;
                        int i34 = i32;
                        b2.l1 l1Var5 = l1Var3;
                        int i35 = 0;
                        while (i35 < a10.a) {
                            u2.p1 p1Var5 = p1Var4;
                            if (hg.c.d(iArr11[i35], iVar.t0)) {
                                i12 = i35;
                                x2.g gVar2 = new x2.g(a10.d[i35], iArr11[i12]);
                                if (gVar != 0) {
                                    iArr3 = iArr10;
                                    if (e9.z.a.c(gVar2.b, gVar.b).c(gVar2.a, gVar.a).e() <= 0) {
                                    }
                                } else {
                                    iArr3 = iArr10;
                                }
                                gVar = gVar2;
                                l1Var5 = a10;
                                i34 = i12;
                            } else {
                                i12 = i35;
                                iArr3 = iArr10;
                            }
                            i35 = i12 + 1;
                            p1Var4 = p1Var5;
                            iArr10 = iArr3;
                            gVar = gVar;
                        }
                        i31++;
                        l1Var3 = l1Var5;
                        i32 = i34;
                        o1Var2 = o1Var3;
                        l1Var4 = gVar;
                        i29 = i33;
                    }
                    i11 = i29;
                    o1Var = o1Var2;
                    if (l1Var3 != null) {
                        qVar = new x2.q(l1Var3, i32);
                        qVarArr[i11] = qVar;
                    }
                }
                qVar = l1Var;
                qVarArr[i11] = qVar;
            }
            i29 = i11 + 1;
            o1Var2 = o1Var;
            i28 = 3;
            i27 = 4;
        }
        int i36 = tVar2.a;
        u2.p1[] p1VarArr2 = tVar2.c;
        HashMap hashMap = new HashMap();
        for (int i37 = 0; i37 < i36; i37++) {
            x2.p.c(p1VarArr2[i37], iVar, hashMap);
        }
        x2.p.c(tVar2.f, iVar, hashMap);
        for (int i38 = 0; i38 < i36; i38++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(tVar2.b[i38]));
            if (m1Var != null) {
                b2.l1 l1Var6 = m1Var.a;
                e9.i0 i0Var = m1Var.b;
                qVarArr[i38] = (i0Var.isEmpty() || p1VarArr2[i38].b(l1Var6) == -1) ? l1Var : new x2.q(l1Var6, y7.f(i0Var));
            }
        }
        int i39 = tVar2.a;
        for (int i40 = 0; i40 < i39; i40++) {
            u2.p1 p1Var6 = tVar2.c[i40];
            Map map = (Map) iVar.v0.get(i40);
            if (map != null && map.containsKey(p1Var6)) {
                Map map2 = (Map) iVar.v0.get(i40);
                if (map2 != null && map2.get(p1Var6) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i40] = l1Var;
            }
        }
        for (int i41 = 0; i41 < i25; i41++) {
            int i42 = tVar2.b[i41];
            if (iVar.w0.get(i41) || iVar.E.contains(Integer.valueOf(i42))) {
                qVarArr[i41] = l1Var;
            }
        }
        qb.b bVar2 = pVar.f;
        y2.c cVar2 = pVar.b;
        e2.d.h(cVar2);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i43 = 0;
        while (i43 < qVarArr.length) {
            x2.q qVar3 = qVarArr[i43];
            if (qVar3 == 0 || qVar3.b.length <= 1) {
                l1Var2 = l1Var;
                arrayList.add(l1Var2);
            } else {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var2 = l1Var;
            }
            i43++;
            l1Var = l1Var2;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i44 = 0;
        while (i44 < qVarArr.length) {
            x2.q qVar4 = qVarArr[i44];
            if (qVar4 == 0) {
                jArr[i44] = new long[0];
                tVar = tVar2;
            } else {
                int[] iArr12 = qVar4.b;
                jArr[i44] = new long[iArr12.length];
                int i45 = 0;
                while (i45 < iArr12.length) {
                    x2.t tVar3 = tVar2;
                    long j11 = qVar4.a.d[iArr12[i45]].j;
                    long[] jArr2 = jArr[i44];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i45] = j11;
                    i45++;
                    tVar2 = tVar3;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i44]);
            }
            i44++;
            tVar2 = tVar;
        }
        x2.t tVar4 = tVar2;
        int[] iArr13 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i46 = 0; i46 < length4; i46++) {
            long[] jArr4 = jArr[i46];
            jArr3[i46] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f = u0Var;
        int i47 = 0;
        while (i47 < length4) {
            long[] jArr5 = jArr[i47];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i10 = length4;
                iArr2 = iArr13;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i48 = 0;
                while (true) {
                    long[] jArr6 = jArr[i47];
                    i10 = length4;
                    double d = 0.0d;
                    if (i48 >= jArr6.length) {
                        break;
                    }
                    int[] iArr14 = iArr13;
                    long j12 = jArr6[i48];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i48] = d;
                    i48++;
                    length4 = i10;
                    iArr13 = iArr14;
                }
                iArr2 = iArr13;
                int i49 = length5 - 1;
                double d10 = dArr[i49] - dArr[0];
                int i50 = 0;
                while (i50 < i49) {
                    double d11 = dArr[i50];
                    int i51 = i50 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i51]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i47);
                    double d12 = d10;
                    Map map3 = v0Var.d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        Collection c10 = v0Var.c();
                        if (!c10.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        v0Var.e++;
                        map3.put(valueOf, c10);
                    } else if (collection.add(valueOf2)) {
                        v0Var.e++;
                    }
                    i50 = i51;
                    d10 = d12;
                }
            }
            i47++;
            length4 = i10;
            cVar2 = cVar;
            iArr13 = iArr2;
        }
        y2.c cVar3 = cVar2;
        int[] iArr15 = iArr13;
        e9.n nVar = v0Var.b;
        if (nVar == null) {
            nVar = new e9.n(0, v0Var);
            v0Var.b = nVar;
        }
        e9.i0 v = e9.i0.v(nVar);
        for (int i52 = 0; i52 < v.size(); i52++) {
            int intValue = ((Integer) v.get(i52)).intValue();
            int i53 = iArr15[intValue] + 1;
            iArr15[intValue] = i53;
            jArr3[intValue] = jArr[intValue][i53];
            x2.b.v(arrayList, jArr3);
        }
        for (int i54 = 0; i54 < qVarArr.length; i54++) {
            if (arrayList.get(i54) != null) {
                jArr3[i54] = jArr3[i54] * 2;
            }
        }
        x2.b.v(arrayList, jArr3);
        e9.f0 u11 = e9.i0.u();
        for (int i55 = 0; i55 < arrayList.size(); i55++) {
            e9.f0 f0Var = (e9.f0) arrayList.get(i55);
            u11.b(f0Var == null ? e9.a1.e : f0Var.i());
        }
        e9.a1 i56 = u11.i();
        x2.r[] rVarArr = new x2.r[qVarArr.length];
        for (int i57 = 0; i57 < qVarArr.length; i57++) {
            x2.q qVar5 = qVarArr[i57];
            if (qVar5 != 0) {
                int[] iArr16 = qVar5.b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        bVar = new x2.s(qVar5.a, new int[]{iArr16[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(qVar5.a, iArr16, cVar3, 10000, j13, j13, (e9.i0) i56.get(i57));
                    }
                    rVarArr[i57] = bVar;
                }
            }
        }
        n1[] n1VarArr = new n1[i25];
        int i58 = 0;
        while (i58 < i25) {
            x2.t tVar5 = tVar4;
            n1VarArr[i58] = (iVar.w0.get(i58) || iVar.E.contains(Integer.valueOf(tVar5.b[i58])) || (tVar5.b[i58] != -2 && rVarArr[i58] == null)) ? null : n1.c;
            i58++;
            tVar4 = tVar5;
        }
        x2.t tVar6 = tVar4;
        if (iVar.u.a != 0) {
            int i59 = 0;
            int i60 = -1;
            int i61 = 0;
            while (true) {
                if (i61 < tVar6.a) {
                    int i62 = tVar6.b[i61];
                    x2.r rVar = rVarArr[i61];
                    if (i62 != 1 && rVar != null) {
                        break;
                    }
                    if (i62 == 1 && rVar != null && rVar.length() == 1) {
                        if (x2.p.i(iVar, iArr6[i61][tVar6.c[i61].b(rVar.b())][rVar.h(0)], rVar.m())) {
                            i59++;
                            i60 = i61;
                        }
                    }
                    i61++;
                } else if (i59 == 1) {
                    int i63 = iVar.u.b ? 1 : 2;
                    n1 n1Var = n1VarArr[i60];
                    n1VarArr[i60] = new n1(i63, n1Var != null && n1Var.b);
                }
            }
        }
        Pair create = Pair.create(n1VarArr, rVarArr);
        x2.r[] rVarArr2 = (x2.r[]) create.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i64 = 0; i64 < rVarArr2.length; i64++) {
            x2.r rVar2 = rVarArr2[i64];
            if (rVar2 != null) {
                a1Var = e9.i0.z(rVar2);
            } else {
                e9.g0 g0Var = e9.i0.b;
                a1Var = e9.a1.e;
            }
            listArr[i64] = a1Var;
        }
        e9.f0 f0Var2 = new e9.f0(4);
        int i65 = 0;
        while (true) {
            int i66 = tVar6.a;
            u2.p1[] p1VarArr3 = tVar6.c;
            if (i65 >= i66) {
                break;
            }
            u2.p1 p1Var7 = p1VarArr3[i65];
            List list = listArr[i65];
            int i67 = 0;
            while (i67 < p1Var7.a) {
                b2.l1 a11 = p1Var7.a(i67);
                int i68 = p1VarArr3[i65].a(i67).a;
                int[] iArr17 = new int[i68];
                int i69 = 0;
                int i70 = 0;
                while (i69 < i68) {
                    List[] listArr2 = listArr;
                    if ((tVar6.e[i65][i67][i69] & 7) == 4) {
                        iArr17[i70] = i69;
                        i70++;
                    }
                    i69++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr17, i70);
                u2.p1 p1Var8 = p1Var7;
                String str4 = null;
                int i71 = 0;
                boolean z17 = false;
                int i72 = 0;
                int i73 = 16;
                while (i71 < copyOf.length) {
                    String str5 = p1VarArr3[i65].a(i67).d[copyOf[i71]].r;
                    int i74 = i72 + 1;
                    if (i72 == 0) {
                        str4 = str5;
                    } else {
                        z17 = (!Objects.equals(str4, str5)) | z17;
                    }
                    i73 = Math.min(i73, tVar6.e[i65][i67][i71] & 24);
                    i71++;
                    i72 = i74;
                }
                if (z17) {
                    i73 = Math.min(i73, tVar6.d[i65]);
                }
                boolean z18 = i73 != 0;
                int i75 = a11.a;
                int[] iArr18 = new int[i75];
                boolean[] zArr = new boolean[i75];
                for (int i76 = 0; i76 < a11.a; i76++) {
                    iArr18[i76] = tVar6.e[i65][i67][i76] & 7;
                    int i77 = 0;
                    while (true) {
                        if (i77 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.r rVar3 = (x2.r) list.get(i77);
                        if (rVar3.b().equals(a11) && rVar3.u(i76) != -1) {
                            z13 = true;
                            break;
                        }
                        i77++;
                    }
                    zArr[i76] = z13;
                }
                f0Var2.b(new b2.r1(a11, z18, iArr18, zArr));
                i67++;
                listArr = listArr3;
                p1Var7 = p1Var8;
            }
            i65++;
        }
        u2.p1 p1Var9 = tVar6.f;
        for (int i78 = 0; i78 < p1Var9.a; i78++) {
            b2.l1 a12 = p1Var9.a(i78);
            int[] iArr19 = new int[a12.a];
            Arrays.fill(iArr19, 0);
            f0Var2.b(new b2.r1(a12, false, iArr19, new boolean[a12.a]));
        }
        x2.v vVar = new x2.v((n1[]) create.first, (x2.r[]) create.second, new s1(f0Var2.i()), tVar6);
        for (int i79 = 0; i79 < vVar.a; i79++) {
            if (vVar.b(i79)) {
                if (vVar.c[i79] == null && this.j[i79].b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(vVar.c[i79] == null);
            }
        }
        for (x2.r rVar4 : vVar.c) {
            if (rVar4 != null) {
                rVar4.p(f7);
                rVar4.e(z10);
            }
        }
        return vVar;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof u2.d) {
            long j3 = this.g.d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            u2.d dVar = (u2.d) obj;
            dVar.e = 0L;
            dVar.f = j3;
        }
    }
}
