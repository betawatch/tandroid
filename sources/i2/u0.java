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
import org.telegram.ui.Components.rz;
import org.telegram.ui.mb1;
import v7.v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u0 {
    public final Object a;
    public final Object b;
    public final u2.b1[] c;
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
    public u2.o1 n;
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
        this.n = u2.o1.d;
        this.o = vVar;
        this.c = new u2.b1[fVarArr.length];
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
        u2.b1[] b1VarArr;
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
            b1VarArr = this.c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].b == -2) {
                b1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.o = vVar;
        c();
        long o9 = this.a.o(vVar.c, this.i, this.c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].b == -2 && this.o.b(i12)) {
                b1VarArr[i12] = new u2.q();
            }
        }
        this.f = false;
        for (int i13 = 0; i13 < b1VarArr.length; i13++) {
            if (b1VarArr[i13] != null) {
                e2.d.g(vVar.b(i13));
                if (fVarArr[i13].b != -2) {
                    this.f = true;
                }
            } else {
                e2.d.g(vVar.c[i13] == null);
            }
        }
        return o9;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u2.d1] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long q6 = this.f ? this.a.q() : Long.MIN_VALUE;
        return q6 == Long.MIN_VALUE ? this.g.e : q6;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u2.d0] */
    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.e = true;
        this.n = this.a.p();
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u2.d1] */
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
        int i13;
        Context context;
        int[] iArr3;
        x2.u uVar = this.k;
        f[] fVarArr = this.j;
        u2.o1 o1Var2 = this.n;
        uVar.getClass();
        int i14 = 1;
        int[] iArr4 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length][];
        int[][][] iArr5 = new int[fVarArr.length + 1][][];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = o1Var2.a;
            l1VarArr[i15] = new b2.l1[i16];
            iArr5[i15] = new int[i16][];
        }
        int length2 = fVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            iArr6[i17] = fVarArr[i17].B();
        }
        int i18 = 0;
        while (i18 < o1Var2.a) {
            b2.l1 a2 = o1Var2.a(i18);
            int i19 = a2.c == 5 ? i14 : 0;
            int length3 = fVarArr.length;
            int i20 = i14;
            int i21 = 0;
            int i22 = 0;
            while (i21 < fVarArr.length) {
                f fVar = fVarArr[i21];
                x2.u uVar2 = uVar;
                u2.o1 o1Var3 = o1Var2;
                int i23 = i14;
                int i24 = 0;
                for (int i25 = 0; i25 < a2.a; i25++) {
                    i24 = Math.max(i24, fVar.A(a2.d[i25]) & 7);
                }
                int i26 = iArr4[i21] == 0 ? i23 : 0;
                if (i24 > i22 || (i24 == i22 && i19 != 0 && i20 == 0 && i26 != 0)) {
                    i22 = i24;
                    i20 = i26;
                    length3 = i21;
                }
                i21++;
                uVar = uVar2;
                o1Var2 = o1Var3;
                i14 = i23;
            }
            x2.u uVar3 = uVar;
            u2.o1 o1Var4 = o1Var2;
            int i27 = i14;
            if (length3 == fVarArr.length) {
                iArr3 = new int[a2.a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr7 = new int[a2.a];
                for (int i28 = 0; i28 < a2.a; i28++) {
                    iArr7[i28] = fVar2.A(a2.d[i28]);
                }
                iArr3 = iArr7;
            }
            int i29 = iArr4[length3];
            l1VarArr[length3][i29] = a2;
            iArr5[length3][i29] = iArr3;
            iArr4[length3] = i29 + 1;
            i18++;
            uVar = uVar3;
            o1Var2 = o1Var4;
            i14 = i27;
        }
        x2.u uVar4 = uVar;
        int i30 = i14;
        int i31 = 0;
        u2.o1[] o1VarArr = new u2.o1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr8 = new int[fVarArr.length];
        for (int i32 = 0; i32 < fVarArr.length; i32++) {
            int i33 = iArr4[i32];
            o1VarArr[i32] = new u2.o1((b2.l1[]) e2.d0.R(i33, l1VarArr[i32]));
            iArr5[i32] = (int[][]) e2.d0.R(i33, iArr5[i32]);
            strArr[i32] = fVarArr[i32].j();
            iArr8[i32] = fVarArr[i32].b;
        }
        x2.t tVar2 = new x2.t(iArr8, o1VarArr, iArr6, iArr5, new u2.o1((b2.l1[]) e2.d0.R(iArr4[fVarArr.length], l1VarArr[fVarArr.length])));
        x2.p pVar = (x2.p) uVar4;
        synchronized (pVar.d) {
            pVar.h = Thread.currentThread();
            iVar = pVar.g;
        }
        if (pVar.k == null && (context = pVar.e) != null) {
            pVar.k = Boolean.valueOf(e2.d0.M(context));
        }
        if (iVar.s0 && Build.VERSION.SDK_INT >= 32 && pVar.i == null) {
            pVar.i = new x2.k(pVar.e, pVar, pVar.k);
        }
        int i34 = tVar2.a;
        Context context2 = pVar.e;
        x2.q[] qVarArr = new x2.q[i34];
        int i35 = 0;
        while (true) {
            if (i35 >= tVar2.a) {
                z11 = 0;
                break;
            }
            if (2 == iArr8[i35] && o1VarArr[i35].a > 0) {
                z11 = i30;
                break;
            }
            i35++;
        }
        Pair j10 = x2.p.j(i30, tVar2, iArr5, new ca.b(pVar, iVar, z11, iArr6, 7), new mb1(16));
        if (j10 != null) {
            qVarArr[((Integer) j10.second).intValue()] = (x2.q) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.q qVar2 = (x2.q) j10.first;
            str = qVar2.a.d[qVar2.b[0]].d;
        }
        b2.o1 o1Var5 = iVar.u;
        if (o1Var5.a == 2) {
            str2 = str;
            j3 = null;
            l1Var = null;
        } else {
            a1.d dVar = new a1.d(iVar, str, iArr6, (!iVar.k || context2 == null) ? null : e2.d0.v(context2), 20);
            str2 = str;
            l1Var = null;
            j3 = x2.p.j(2, tVar2, iArr5, dVar, new mb1(15));
        }
        int i36 = 4;
        if ((iVar.A || j3 == null) && o1Var5.a != 2) {
            iArr = iArr8;
            pair = x2.p.j(4, tVar2, iArr5, new r5.d(iVar, 13), new mb1(14));
        } else {
            iArr = iArr8;
            pair = l1Var;
        }
        if (pair != 0) {
            qVarArr[((Integer) pair.second).intValue()] = (x2.q) pair.first;
        } else if (j3 != null) {
            qVarArr[((Integer) j3.second).intValue()] = (x2.q) j3.first;
        }
        int i37 = 3;
        if (o1Var5.a == 2) {
            pair2 = l1Var;
        } else {
            if (!iVar.x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                obj = l1Var;
            } else {
                String str3 = e2.d0.a;
                obj = locale.toLanguageTag();
            }
            pair2 = x2.p.j(3, tVar2, iArr5, new rz(iVar, str2, obj, 12), new mb1(17));
        }
        if (pair2 != 0) {
            qVarArr[((Integer) pair2.second).intValue()] = (x2.q) pair2.first;
        }
        int i38 = 0;
        while (i38 < i34) {
            int i39 = iArr[i38];
            if (i39 == 2 || i39 == 1 || i39 == i37 || i39 == i36) {
                i11 = i38;
                o1Var = o1Var5;
            } else {
                u2.o1 o1Var6 = o1VarArr[i38];
                int[][] iArr9 = iArr5[i38];
                if (o1Var5.a == 2) {
                    i11 = i38;
                    o1Var = o1Var5;
                } else {
                    int i40 = 0;
                    int i41 = 0;
                    b2.l1 l1Var3 = l1Var;
                    b2.l1 l1Var4 = l1Var3;
                    while (i40 < o1Var6.a) {
                        b2.l1 a10 = o1Var6.a(i40);
                        int[] iArr10 = iArr9[i40];
                        int i42 = i38;
                        b2.o1 o1Var7 = o1Var5;
                        x2.g gVar = l1Var4;
                        int i43 = i41;
                        b2.l1 l1Var5 = l1Var3;
                        int i44 = 0;
                        while (i44 < a10.a) {
                            u2.o1 o1Var8 = o1Var6;
                            if (hg.c.d(iArr10[i44], iVar.t0)) {
                                i12 = i44;
                                x2.g gVar2 = new x2.g(a10.d[i44], iArr10[i12]);
                                if (gVar != 0) {
                                    i13 = i40;
                                    if (e9.z.a.c(gVar2.b, gVar.b).c(gVar2.a, gVar.a).e() <= 0) {
                                    }
                                } else {
                                    i13 = i40;
                                }
                                gVar = gVar2;
                                l1Var5 = a10;
                                i43 = i12;
                            } else {
                                i12 = i44;
                                i13 = i40;
                            }
                            i44 = i12 + 1;
                            o1Var6 = o1Var8;
                            i40 = i13;
                            gVar = gVar;
                        }
                        i40++;
                        l1Var3 = l1Var5;
                        i41 = i43;
                        o1Var5 = o1Var7;
                        l1Var4 = gVar;
                        i38 = i42;
                    }
                    i11 = i38;
                    o1Var = o1Var5;
                    if (l1Var3 != null) {
                        qVar = new x2.q(l1Var3, i41);
                        qVarArr[i11] = qVar;
                    }
                }
                qVar = l1Var;
                qVarArr[i11] = qVar;
            }
            i38 = i11 + 1;
            o1Var5 = o1Var;
            i37 = 3;
            i36 = 4;
        }
        int i45 = tVar2.a;
        u2.o1[] o1VarArr2 = tVar2.c;
        HashMap hashMap = new HashMap();
        for (int i46 = 0; i46 < i45; i46++) {
            x2.p.c(o1VarArr2[i46], iVar, hashMap);
        }
        x2.p.c(tVar2.f, iVar, hashMap);
        for (int i47 = 0; i47 < i45; i47++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(tVar2.b[i47]));
            if (m1Var != null) {
                b2.l1 l1Var6 = m1Var.a;
                e9.i0 i0Var = m1Var.b;
                qVarArr[i47] = (i0Var.isEmpty() || o1VarArr2[i47].b(l1Var6) == -1) ? l1Var : new x2.q(l1Var6, v7.f(i0Var));
            }
        }
        int i48 = tVar2.a;
        for (int i49 = 0; i49 < i48; i49++) {
            u2.o1 o1Var9 = tVar2.c[i49];
            Map map = (Map) iVar.v0.get(i49);
            if (map != null && map.containsKey(o1Var9)) {
                Map map2 = (Map) iVar.v0.get(i49);
                if (map2 != null && map2.get(o1Var9) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i49] = l1Var;
            }
        }
        for (int i50 = 0; i50 < i34; i50++) {
            int i51 = tVar2.b[i50];
            if (iVar.w0.get(i50) || iVar.E.contains(Integer.valueOf(i51))) {
                qVarArr[i50] = l1Var;
            }
        }
        t7.t tVar3 = pVar.f;
        y2.c cVar2 = pVar.b;
        e2.d.h(cVar2);
        tVar3.getClass();
        ArrayList arrayList = new ArrayList();
        int i52 = 0;
        while (i52 < qVarArr.length) {
            x2.q qVar3 = qVarArr[i52];
            if (qVar3 == 0 || qVar3.b.length <= 1) {
                l1Var2 = l1Var;
                arrayList.add(l1Var2);
            } else {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var2 = l1Var;
            }
            i52++;
            l1Var = l1Var2;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i53 = 0;
        while (i53 < qVarArr.length) {
            x2.q qVar4 = qVarArr[i53];
            if (qVar4 == 0) {
                jArr[i53] = new long[i31];
                tVar = tVar2;
            } else {
                int[] iArr11 = qVar4.b;
                jArr[i53] = new long[iArr11.length];
                int i54 = 0;
                while (i54 < iArr11.length) {
                    x2.t tVar4 = tVar2;
                    long j11 = qVar4.a.d[iArr11[i54]].j;
                    long[] jArr2 = jArr[i53];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i54] = j11;
                    i54++;
                    tVar2 = tVar4;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i53]);
            }
            i53++;
            tVar2 = tVar;
            i31 = 0;
        }
        x2.t tVar5 = tVar2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i55 = 0; i55 < length4; i55++) {
            long[] jArr4 = jArr[i55];
            jArr3[i55] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f = u0Var;
        int i56 = 0;
        while (i56 < length4) {
            long[] jArr5 = jArr[i56];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i10 = length4;
                iArr2 = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i57 = 0;
                while (true) {
                    long[] jArr6 = jArr[i56];
                    i10 = length4;
                    double d = 0.0d;
                    if (i57 >= jArr6.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j12 = jArr6[i57];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i57] = d;
                    i57++;
                    length4 = i10;
                    iArr12 = iArr13;
                }
                iArr2 = iArr12;
                int i58 = length5 - 1;
                double d10 = dArr[i58] - dArr[0];
                int i59 = 0;
                while (i59 < i58) {
                    double d11 = dArr[i59];
                    int i60 = i59 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i60]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i56);
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
                    i59 = i60;
                    d10 = d12;
                }
            }
            i56++;
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
        for (int i61 = 0; i61 < v.size(); i61++) {
            int intValue = ((Integer) v.get(i61)).intValue();
            int i62 = iArr14[intValue] + 1;
            iArr14[intValue] = i62;
            jArr3[intValue] = jArr[intValue][i62];
            x2.b.v(arrayList, jArr3);
        }
        for (int i63 = 0; i63 < qVarArr.length; i63++) {
            if (arrayList.get(i63) != null) {
                jArr3[i63] = jArr3[i63] * 2;
            }
        }
        x2.b.v(arrayList, jArr3);
        e9.f0 u11 = e9.i0.u();
        for (int i64 = 0; i64 < arrayList.size(); i64++) {
            e9.f0 f0Var = (e9.f0) arrayList.get(i64);
            u11.b(f0Var == null ? e9.a1.e : f0Var.i());
        }
        e9.a1 i65 = u11.i();
        x2.r[] rVarArr = new x2.r[qVarArr.length];
        for (int i66 = 0; i66 < qVarArr.length; i66++) {
            x2.q qVar5 = qVarArr[i66];
            if (qVar5 != 0) {
                int[] iArr15 = qVar5.b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new x2.s(qVar5.a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(qVar5.a, iArr15, cVar3, 10000, j13, j13, (e9.i0) i65.get(i66));
                    }
                    rVarArr[i66] = bVar;
                }
            }
        }
        n1[] n1VarArr = new n1[i34];
        int i67 = 0;
        while (i67 < i34) {
            x2.t tVar6 = tVar5;
            n1VarArr[i67] = (iVar.w0.get(i67) || iVar.E.contains(Integer.valueOf(tVar6.b[i67])) || (tVar6.b[i67] != -2 && rVarArr[i67] == null)) ? null : n1.c;
            i67++;
            tVar5 = tVar6;
        }
        x2.t tVar7 = tVar5;
        if (iVar.u.a != 0) {
            int i68 = 0;
            int i69 = -1;
            int i70 = 0;
            while (true) {
                if (i70 < tVar7.a) {
                    int i71 = tVar7.b[i70];
                    x2.r rVar = rVarArr[i70];
                    if (i71 != 1 && rVar != null) {
                        break;
                    }
                    if (i71 == 1 && rVar != null && rVar.length() == 1) {
                        if (x2.p.i(iVar, iArr5[i70][tVar7.c[i70].b(rVar.b())][rVar.h(0)], rVar.m())) {
                            i68++;
                            i69 = i70;
                        }
                    }
                    i70++;
                } else if (i68 == 1) {
                    int i72 = iVar.u.b ? 1 : 2;
                    n1 n1Var = n1VarArr[i69];
                    n1VarArr[i69] = new n1(i72, n1Var != null && n1Var.b);
                }
            }
        }
        Pair create = Pair.create(n1VarArr, rVarArr);
        x2.r[] rVarArr2 = (x2.r[]) create.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i73 = 0; i73 < rVarArr2.length; i73++) {
            x2.r rVar2 = rVarArr2[i73];
            if (rVar2 != null) {
                a1Var = e9.i0.z(rVar2);
            } else {
                e9.g0 g0Var = e9.i0.b;
                a1Var = e9.a1.e;
            }
            listArr[i73] = a1Var;
        }
        e9.f0 f0Var2 = new e9.f0(4);
        int i74 = 0;
        while (true) {
            int i75 = tVar7.a;
            u2.o1[] o1VarArr3 = tVar7.c;
            if (i74 >= i75) {
                break;
            }
            u2.o1 o1Var10 = o1VarArr3[i74];
            List list = listArr[i74];
            int i76 = 0;
            while (i76 < o1Var10.a) {
                b2.l1 a11 = o1Var10.a(i76);
                int i77 = o1VarArr3[i74].a(i76).a;
                int[] iArr16 = new int[i77];
                int i78 = 0;
                int i79 = 0;
                while (i78 < i77) {
                    List[] listArr2 = listArr;
                    if ((tVar7.e[i74][i76][i78] & 7) == 4) {
                        iArr16[i79] = i78;
                        i79++;
                    }
                    i78++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr16, i79);
                u2.o1 o1Var11 = o1Var10;
                String str4 = null;
                int i80 = 0;
                boolean z14 = false;
                int i81 = 0;
                int i82 = 16;
                while (i80 < copyOf.length) {
                    String str5 = o1VarArr3[i74].a(i76).d[copyOf[i80]].r;
                    int i83 = i81 + 1;
                    if (i81 == 0) {
                        str4 = str5;
                    } else {
                        z14 = (!Objects.equals(str4, str5)) | z14;
                    }
                    i82 = Math.min(i82, tVar7.e[i74][i76][i80] & 24);
                    i80++;
                    i81 = i83;
                }
                if (z14) {
                    i82 = Math.min(i82, tVar7.d[i74]);
                }
                boolean z15 = i82 != 0;
                int i84 = a11.a;
                int[] iArr17 = new int[i84];
                boolean[] zArr = new boolean[i84];
                for (int i85 = 0; i85 < a11.a; i85++) {
                    iArr17[i85] = tVar7.e[i74][i76][i85] & 7;
                    int i86 = 0;
                    while (true) {
                        if (i86 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.r rVar3 = (x2.r) list.get(i86);
                        if (rVar3.b().equals(a11) && rVar3.u(i85) != -1) {
                            z13 = true;
                            break;
                        }
                        i86++;
                    }
                    zArr[i85] = z13;
                }
                f0Var2.b(new b2.r1(a11, z15, iArr17, zArr));
                i76++;
                listArr = listArr3;
                o1Var10 = o1Var11;
            }
            i74++;
        }
        u2.o1 o1Var12 = tVar7.f;
        for (int i87 = 0; i87 < o1Var12.a; i87++) {
            b2.l1 a12 = o1Var12.a(i87);
            int[] iArr18 = new int[a12.a];
            Arrays.fill(iArr18, 0);
            f0Var2.b(new b2.r1(a12, false, iArr18, new boolean[a12.a]));
        }
        x2.v vVar = new x2.v((n1[]) create.first, (x2.r[]) create.second, new s1(f0Var2.i()), tVar7);
        for (int i88 = 0; i88 < vVar.a; i88++) {
            if (vVar.b(i88)) {
                if (vVar.c[i88] == null && this.j[i88].b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(vVar.c[i88] == null);
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
