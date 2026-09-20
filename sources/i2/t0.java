package i2;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import b2.r1;
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
import org.telegram.ui.Components.r50;
import org.telegram.ui.mb1;
import v7.z7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class t0 {
    public final Object a;
    public final Object b;
    public final u2.c1[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public u0 g;
    public boolean h;
    public final boolean[] i;
    public final f[] j;
    public final x2.v k;
    public final f1 l;
    public t0 m;
    public u2.p1 n;
    public x2.w o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u2.d] */
    public t0(f[] fVarArr, long j3, x2.v vVar, y2.d dVar, f1 f1Var, u0 u0Var, x2.w wVar) {
        this.j = fVarArr;
        this.p = j3;
        this.k = vVar;
        this.l = f1Var;
        u2.f0 f0Var = u0Var.a;
        this.b = f0Var.a;
        this.g = u0Var;
        this.n = u2.p1.d;
        this.o = wVar;
        this.c = new u2.c1[fVarArr.length];
        this.i = new boolean[fVarArr.length];
        long j10 = u0Var.b;
        long j11 = u0Var.d;
        boolean z10 = u0Var.f;
        f1Var.getClass();
        Object obj = f0Var.a;
        int i10 = a.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.f0 a2 = f0Var.a(pair.second);
        e1 e1Var = (e1) f1Var.d.get(obj2);
        e1Var.getClass();
        f1Var.g.add(e1Var);
        d1 d1Var = (d1) f1Var.f.get(e1Var);
        if (d1Var != null) {
            d1Var.a.f(d1Var.b);
        }
        e1Var.c.add(a2);
        u2.x c10 = e1Var.a.c(a2, dVar, j10);
        f1Var.c.put(c10, e1Var);
        f1Var.c();
        this.a = j11 != -9223372036854775807L ? new u2.d(c10, !z10, 0L, j11) : c10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u2.d0] */
    public final long a(x2.w wVar, long j3, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        u2.c1[] c1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= wVar.a) {
                break;
            }
            if (z10 || !wVar.a(this.o, i10)) {
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
        this.o = wVar;
        c();
        long q6 = this.a.q(wVar.c, this.i, this.c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].b == -2 && this.o.b(i12)) {
                c1VarArr[i12] = new u2.q();
            }
        }
        this.f = false;
        for (int i13 = 0; i13 < c1VarArr.length; i13++) {
            if (c1VarArr[i13] != null) {
                e2.d.g(wVar.b(i13));
                if (fVarArr[i13].b != -2) {
                    this.f = true;
                }
            } else {
                e2.d.g(wVar.c[i13] == null);
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
            x2.w wVar = this.o;
            if (i10 >= wVar.a) {
                return;
            }
            boolean b10 = wVar.b(i10);
            x2.s sVar = this.o.c[i10];
            if (b10 && sVar != null) {
                sVar.j();
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
            x2.w wVar = this.o;
            if (i10 >= wVar.a) {
                return;
            }
            boolean b10 = wVar.b(i10);
            x2.s sVar = this.o.c[i10];
            if (b10 && sVar != null) {
                sVar.g();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u2.e1] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long s10 = this.f ? this.a.s() : Long.MIN_VALUE;
        return s10 == Long.MIN_VALUE ? this.g.e : s10;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u2.d0] */
    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.e = true;
        this.n = this.a.r();
        x2.w j3 = j(f7, k1Var, z10);
        u0 u0Var = this.g;
        long j10 = u0Var.b;
        long j11 = u0Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = a(j3, j10, false, new boolean[this.j.length]);
        long j12 = this.p;
        u0 u0Var2 = this.g;
        this.p = (u0Var2.b - a2) + j12;
        this.g = u0Var2.b(a2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u2.e1] */
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
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u2.d0] */
    public final void i() {
        b();
        ?? r02 = this.a;
        try {
            boolean z10 = r02 instanceof u2.d;
            f1 f1Var = this.l;
            if (z10) {
                f1Var.f(((u2.d) r02).a);
            } else {
                f1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.f("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v56 */
    public final x2.w j(float f7, b2.k1 k1Var, boolean z10) {
        x2.j jVar;
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
        x2.s bVar;
        y2.c cVar;
        int i10;
        int[] iArr2;
        x2.u uVar;
        b2.l1 l1Var2;
        int i11;
        b2.o1 o1Var;
        Object rVar;
        int i12;
        b2.l1 l1Var3;
        Context context;
        int[] iArr3;
        x2.v vVar = this.k;
        f[] fVarArr = this.j;
        u2.p1 p1Var = this.n;
        vVar.getClass();
        int[] iArr4 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length][];
        int[][][] iArr5 = new int[fVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = p1Var.a;
            l1VarArr[i13] = new b2.l1[i14];
            iArr5[i13] = new int[i14][];
        }
        int length2 = fVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr6[i15] = fVarArr[i15].B();
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
                x2.v vVar2 = vVar;
                u2.p1 p1Var2 = p1Var;
                int i19 = 0;
                for (int i20 = 0; i20 < a2.a; i20++) {
                    i19 = Math.max(i19, fVar.A(a2.d[i20]) & 7);
                }
                boolean z16 = iArr4[i17] == 0;
                if (i19 > i18 || (i19 == i18 && z14 && !z15 && z16)) {
                    i18 = i19;
                    z15 = z16;
                    length3 = i17;
                }
                i17++;
                vVar = vVar2;
                p1Var = p1Var2;
            }
            x2.v vVar3 = vVar;
            u2.p1 p1Var3 = p1Var;
            if (length3 == fVarArr.length) {
                iArr3 = new int[a2.a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr7 = new int[a2.a];
                for (int i21 = 0; i21 < a2.a; i21++) {
                    iArr7[i21] = fVar2.A(a2.d[i21]);
                }
                iArr3 = iArr7;
            }
            int i22 = iArr4[length3];
            l1VarArr[length3][i22] = a2;
            iArr5[length3][i22] = iArr3;
            iArr4[length3] = i22 + 1;
            i16++;
            vVar = vVar3;
            p1Var = p1Var3;
        }
        x2.v vVar4 = vVar;
        u2.p1[] p1VarArr = new u2.p1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr8 = new int[fVarArr.length];
        for (int i23 = 0; i23 < fVarArr.length; i23++) {
            int i24 = iArr4[i23];
            p1VarArr[i23] = new u2.p1((b2.l1[]) e2.d0.S(i24, l1VarArr[i23]));
            iArr5[i23] = (int[][]) e2.d0.S(i24, iArr5[i23]);
            strArr[i23] = fVarArr[i23].j();
            iArr8[i23] = fVarArr[i23].b;
        }
        x2.u uVar2 = new x2.u(iArr8, p1VarArr, iArr6, iArr5, new u2.p1((b2.l1[]) e2.d0.S(iArr4[fVarArr.length], l1VarArr[fVarArr.length])));
        x2.q qVar = (x2.q) vVar4;
        synchronized (qVar.d) {
            qVar.h = Thread.currentThread();
            jVar = qVar.g;
        }
        if (qVar.k == null && (context = qVar.e) != null) {
            qVar.k = Boolean.valueOf(e2.d0.N(context));
        }
        if (jVar.s0 && Build.VERSION.SDK_INT >= 32 && qVar.i == null) {
            qVar.i = new x2.l(qVar.e, qVar, qVar.k);
        }
        int i25 = uVar2.a;
        Context context2 = qVar.e;
        x2.r[] rVarArr = new x2.r[i25];
        int i26 = 0;
        while (true) {
            if (i26 >= uVar2.a) {
                z11 = false;
                break;
            }
            if (2 == iArr8[i26] && p1VarArr[i26].a > 0) {
                z11 = true;
                break;
            }
            i26++;
        }
        Pair j10 = x2.q.j(1, uVar2, iArr5, new ca.b(qVar, jVar, z11, iArr6, 7), new mb1(14));
        if (j10 != null) {
            rVarArr[((Integer) j10.second).intValue()] = (x2.r) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.r rVar2 = (x2.r) j10.first;
            str = rVar2.a.d[rVar2.b[0]].d;
        }
        b2.o1 o1Var2 = jVar.u;
        if (o1Var2.a == 2) {
            str2 = str;
            j3 = null;
            l1Var = null;
        } else {
            int i27 = 13;
            a1.d dVar = new a1.d(jVar, str, iArr6, (!jVar.k || context2 == null) ? null : e2.d0.w(context2), 20);
            str2 = str;
            l1Var = null;
            j3 = x2.q.j(2, uVar2, iArr5, dVar, new mb1(i27));
        }
        int i28 = 4;
        if ((jVar.A || j3 == null) && o1Var2.a != 2) {
            iArr = iArr8;
            pair = x2.q.j(4, uVar2, iArr5, new r5.d(jVar, 13), new mb1(12));
        } else {
            iArr = iArr8;
            pair = l1Var;
        }
        if (pair != 0) {
            rVarArr[((Integer) pair.second).intValue()] = (x2.r) pair.first;
        } else if (j3 != null) {
            rVarArr[((Integer) j3.second).intValue()] = (x2.r) j3.first;
        }
        int i29 = 3;
        if (o1Var2.a == 2) {
            pair2 = l1Var;
        } else {
            if (!jVar.x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                obj = l1Var;
            } else {
                String str3 = e2.d0.a;
                obj = locale.toLanguageTag();
            }
            pair2 = x2.q.j(3, uVar2, iArr5, new r50(jVar, str2, obj, 10), new mb1(15));
        }
        if (pair2 != 0) {
            rVarArr[((Integer) pair2.second).intValue()] = (x2.r) pair2.first;
        }
        int i30 = 0;
        while (i30 < i25) {
            int i31 = iArr[i30];
            if (i31 == 2 || i31 == 1 || i31 == i29 || i31 == i28) {
                i11 = i30;
                o1Var = o1Var2;
            } else {
                u2.p1 p1Var4 = p1VarArr[i30];
                int[][] iArr9 = iArr5[i30];
                if (o1Var2.a == 2) {
                    i11 = i30;
                    o1Var = o1Var2;
                } else {
                    b2.l1 l1Var4 = l1Var;
                    b2.l1 l1Var5 = l1Var4;
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < p1Var4.a) {
                        b2.l1 a10 = p1Var4.a(i32);
                        int[] iArr10 = iArr9[i32];
                        int i34 = i30;
                        b2.o1 o1Var3 = o1Var2;
                        x2.g gVar = l1Var5;
                        int i35 = i33;
                        b2.l1 l1Var6 = l1Var4;
                        int i36 = 0;
                        while (i36 < a10.a) {
                            u2.p1 p1Var5 = p1Var4;
                            if (hg.k0.d(iArr10[i36], jVar.t0)) {
                                i12 = i36;
                                x2.g gVar2 = new x2.g(a10.d[i36], iArr10[i12]);
                                if (gVar != 0) {
                                    l1Var3 = a10;
                                    if (e9.z.a.c(gVar2.b, gVar.b).c(gVar2.a, gVar.a).e() <= 0) {
                                    }
                                } else {
                                    l1Var3 = a10;
                                }
                                gVar = gVar2;
                                i35 = i12;
                                l1Var6 = l1Var3;
                            } else {
                                i12 = i36;
                                l1Var3 = a10;
                            }
                            i36 = i12 + 1;
                            p1Var4 = p1Var5;
                            a10 = l1Var3;
                            gVar = gVar;
                        }
                        i32++;
                        l1Var4 = l1Var6;
                        i33 = i35;
                        o1Var2 = o1Var3;
                        l1Var5 = gVar;
                        i30 = i34;
                    }
                    i11 = i30;
                    o1Var = o1Var2;
                    if (l1Var4 != null) {
                        rVar = new x2.r(l1Var4, i33);
                        rVarArr[i11] = rVar;
                    }
                }
                rVar = l1Var;
                rVarArr[i11] = rVar;
            }
            i30 = i11 + 1;
            o1Var2 = o1Var;
            i29 = 3;
            i28 = 4;
        }
        int i37 = uVar2.a;
        u2.p1[] p1VarArr2 = uVar2.c;
        HashMap hashMap = new HashMap();
        for (int i38 = 0; i38 < i37; i38++) {
            x2.q.c(p1VarArr2[i38], jVar, hashMap);
        }
        x2.q.c(uVar2.f, jVar, hashMap);
        for (int i39 = 0; i39 < i37; i39++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(uVar2.b[i39]));
            if (m1Var != null) {
                b2.l1 l1Var7 = m1Var.a;
                e9.i0 i0Var = m1Var.b;
                rVarArr[i39] = (i0Var.isEmpty() || p1VarArr2[i39].b(l1Var7) == -1) ? l1Var : new x2.r(l1Var7, z7.f(i0Var));
            }
        }
        int i40 = uVar2.a;
        for (int i41 = 0; i41 < i40; i41++) {
            u2.p1 p1Var6 = uVar2.c[i41];
            Map map = (Map) jVar.v0.get(i41);
            if (map != null && map.containsKey(p1Var6)) {
                Map map2 = (Map) jVar.v0.get(i41);
                if (map2 != null && map2.get(p1Var6) != null) {
                    throw new ClassCastException();
                }
                rVarArr[i41] = l1Var;
            }
        }
        for (int i42 = 0; i42 < i25; i42++) {
            int i43 = uVar2.b[i42];
            if (jVar.w0.get(i42) || jVar.E.contains(Integer.valueOf(i43))) {
                rVarArr[i42] = l1Var;
            }
        }
        qb.b bVar2 = qVar.f;
        y2.c cVar2 = qVar.b;
        e2.d.h(cVar2);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i44 = 0;
        while (i44 < rVarArr.length) {
            x2.r rVar3 = rVarArr[i44];
            if (rVar3 == 0 || rVar3.b.length <= 1) {
                l1Var2 = l1Var;
                arrayList.add(l1Var2);
            } else {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var2 = l1Var;
            }
            i44++;
            l1Var = l1Var2;
        }
        int length4 = rVarArr.length;
        long[][] jArr = new long[length4][];
        int i45 = 0;
        while (i45 < rVarArr.length) {
            x2.r rVar4 = rVarArr[i45];
            if (rVar4 == 0) {
                jArr[i45] = new long[0];
                uVar = uVar2;
            } else {
                int[] iArr11 = rVar4.b;
                jArr[i45] = new long[iArr11.length];
                int i46 = 0;
                while (i46 < iArr11.length) {
                    x2.u uVar3 = uVar2;
                    long j11 = rVar4.a.d[iArr11[i46]].j;
                    long[] jArr2 = jArr[i45];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i46] = j11;
                    i46++;
                    uVar2 = uVar3;
                }
                uVar = uVar2;
                Arrays.sort(jArr[i45]);
            }
            i45++;
            uVar2 = uVar;
        }
        x2.u uVar4 = uVar2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr4 = jArr[i47];
            jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f = u0Var;
        int i48 = 0;
        while (i48 < length4) {
            long[] jArr5 = jArr[i48];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i10 = length4;
                iArr2 = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i49 = 0;
                while (true) {
                    long[] jArr6 = jArr[i48];
                    i10 = length4;
                    double d = 0.0d;
                    if (i49 >= jArr6.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j12 = jArr6[i49];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i49] = d;
                    i49++;
                    length4 = i10;
                    iArr12 = iArr13;
                }
                iArr2 = iArr12;
                int i50 = length5 - 1;
                double d10 = dArr[i50] - dArr[0];
                int i51 = 0;
                while (i51 < i50) {
                    double d11 = dArr[i51];
                    int i52 = i51 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i52]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i48);
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
                    i51 = i52;
                    d10 = d12;
                }
            }
            i48++;
            length4 = i10;
            cVar2 = cVar;
            iArr12 = iArr2;
        }
        y2.c cVar3 = cVar2;
        int[] iArr14 = iArr12;
        e9.n nVar = v0Var.b;
        if (nVar == null) {
            nVar = new e9.n(0, v0Var);
            v0Var.b = nVar;
        }
        e9.i0 v = e9.i0.v(nVar);
        for (int i53 = 0; i53 < v.size(); i53++) {
            int intValue = ((Integer) v.get(i53)).intValue();
            int i54 = iArr14[intValue] + 1;
            iArr14[intValue] = i54;
            jArr3[intValue] = jArr[intValue][i54];
            x2.b.v(arrayList, jArr3);
        }
        for (int i55 = 0; i55 < rVarArr.length; i55++) {
            if (arrayList.get(i55) != null) {
                jArr3[i55] = jArr3[i55] * 2;
            }
        }
        x2.b.v(arrayList, jArr3);
        e9.f0 u11 = e9.i0.u();
        for (int i56 = 0; i56 < arrayList.size(); i56++) {
            e9.f0 f0Var = (e9.f0) arrayList.get(i56);
            u11.b(f0Var == null ? e9.a1.e : f0Var.i());
        }
        e9.a1 i57 = u11.i();
        x2.s[] sVarArr = new x2.s[rVarArr.length];
        for (int i58 = 0; i58 < rVarArr.length; i58++) {
            x2.r rVar5 = rVarArr[i58];
            if (rVar5 != 0) {
                int[] iArr15 = rVar5.b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new x2.t(rVar5.a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(rVar5.a, iArr15, cVar3, 10000, j13, j13, (e9.i0) i57.get(i58));
                    }
                    sVarArr[i58] = bVar;
                }
            }
        }
        m1[] m1VarArr = new m1[i25];
        int i59 = 0;
        while (i59 < i25) {
            x2.u uVar5 = uVar4;
            m1VarArr[i59] = (jVar.w0.get(i59) || jVar.E.contains(Integer.valueOf(uVar5.b[i59])) || (uVar5.b[i59] != -2 && sVarArr[i59] == null)) ? null : m1.c;
            i59++;
            uVar4 = uVar5;
        }
        x2.u uVar6 = uVar4;
        if (jVar.u.a != 0) {
            int i60 = 0;
            int i61 = -1;
            int i62 = 0;
            while (true) {
                if (i62 < uVar6.a) {
                    int i63 = uVar6.b[i62];
                    x2.s sVar = sVarArr[i62];
                    if (i63 != 1 && sVar != null) {
                        break;
                    }
                    if (i63 == 1 && sVar != null && sVar.length() == 1) {
                        if (x2.q.i(jVar, iArr5[i62][uVar6.c[i62].b(sVar.b())][sVar.h(0)], sVar.m())) {
                            i60++;
                            i61 = i62;
                        }
                    }
                    i62++;
                } else if (i60 == 1) {
                    int i64 = jVar.u.b ? 1 : 2;
                    m1 m1Var2 = m1VarArr[i61];
                    m1VarArr[i61] = new m1(i64, m1Var2 != null && m1Var2.b);
                }
            }
        }
        Pair create = Pair.create(m1VarArr, sVarArr);
        x2.s[] sVarArr2 = (x2.s[]) create.second;
        List[] listArr = new List[sVarArr2.length];
        for (int i65 = 0; i65 < sVarArr2.length; i65++) {
            x2.s sVar2 = sVarArr2[i65];
            if (sVar2 != null) {
                a1Var = e9.i0.z(sVar2);
            } else {
                e9.g0 g0Var = e9.i0.b;
                a1Var = e9.a1.e;
            }
            listArr[i65] = a1Var;
        }
        e9.f0 f0Var2 = new e9.f0(4);
        int i66 = 0;
        while (true) {
            int i67 = uVar6.a;
            u2.p1[] p1VarArr3 = uVar6.c;
            if (i66 >= i67) {
                break;
            }
            u2.p1 p1Var7 = p1VarArr3[i66];
            List list = listArr[i66];
            int i68 = 0;
            while (i68 < p1Var7.a) {
                b2.l1 a11 = p1Var7.a(i68);
                int i69 = p1VarArr3[i66].a(i68).a;
                int[] iArr16 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i70 < i69) {
                    List[] listArr2 = listArr;
                    if ((uVar6.e[i66][i68][i70] & 7) == 4) {
                        iArr16[i71] = i70;
                        i71++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr16, i71);
                u2.p1 p1Var8 = p1Var7;
                String str4 = null;
                int i72 = 0;
                boolean z17 = false;
                int i73 = 0;
                int i74 = 16;
                while (i72 < copyOf.length) {
                    String str5 = p1VarArr3[i66].a(i68).d[copyOf[i72]].r;
                    int i75 = i73 + 1;
                    if (i73 == 0) {
                        str4 = str5;
                    } else {
                        z17 = (!Objects.equals(str4, str5)) | z17;
                    }
                    i74 = Math.min(i74, uVar6.e[i66][i68][i72] & 24);
                    i72++;
                    i73 = i75;
                }
                if (z17) {
                    i74 = Math.min(i74, uVar6.d[i66]);
                }
                boolean z18 = i74 != 0;
                int i76 = a11.a;
                int[] iArr17 = new int[i76];
                boolean[] zArr = new boolean[i76];
                for (int i77 = 0; i77 < a11.a; i77++) {
                    iArr17[i77] = uVar6.e[i66][i68][i77] & 7;
                    int i78 = 0;
                    while (true) {
                        if (i78 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.s sVar3 = (x2.s) list.get(i78);
                        if (sVar3.b().equals(a11) && sVar3.u(i77) != -1) {
                            z13 = true;
                            break;
                        }
                        i78++;
                    }
                    zArr[i77] = z13;
                }
                f0Var2.b(new r1(a11, z18, iArr17, zArr));
                i68++;
                listArr = listArr3;
                p1Var7 = p1Var8;
            }
            i66++;
        }
        u2.p1 p1Var9 = uVar6.f;
        for (int i79 = 0; i79 < p1Var9.a; i79++) {
            b2.l1 a12 = p1Var9.a(i79);
            int[] iArr18 = new int[a12.a];
            Arrays.fill(iArr18, 0);
            f0Var2.b(new r1(a12, false, iArr18, new boolean[a12.a]));
        }
        x2.w wVar = new x2.w((m1[]) create.first, (x2.s[]) create.second, new s1(f0Var2.i()), uVar6);
        for (int i80 = 0; i80 < wVar.a; i80++) {
            if (wVar.b(i80)) {
                if (wVar.c[i80] == null && this.j[i80].b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(wVar.c[i80] == null);
            }
        }
        for (x2.s sVar4 : wVar.c) {
            if (sVar4 != null) {
                sVar4.p(f7);
                sVar4.e(z10);
            }
        }
        return wVar;
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
