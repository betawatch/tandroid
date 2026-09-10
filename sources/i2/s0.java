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
import org.telegram.ui.Components.f21;
import u2.q1;
import v7.y7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s0 {
    public final Object a;
    public final Object b;
    public final u2.d1[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public t0 g;
    public boolean h;
    public final boolean[] i;
    public final f[] j;
    public final x2.u k;
    public final e1 l;
    public s0 m;
    public q1 n;
    public x2.v o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u2.e] */
    public s0(f[] fVarArr, long j3, x2.u uVar, y2.d dVar, e1 e1Var, t0 t0Var, x2.v vVar) {
        this.j = fVarArr;
        this.p = j3;
        this.k = uVar;
        this.l = e1Var;
        u2.g0 g0Var = t0Var.a;
        this.b = g0Var.a;
        this.g = t0Var;
        this.n = q1.d;
        this.o = vVar;
        this.c = new u2.d1[fVarArr.length];
        this.i = new boolean[fVarArr.length];
        long j10 = t0Var.b;
        long j11 = t0Var.d;
        boolean z10 = t0Var.f;
        e1Var.getClass();
        Object obj = g0Var.a;
        int i10 = a.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        u2.g0 a2 = g0Var.a(pair.second);
        d1 d1Var = (d1) e1Var.d.get(obj2);
        d1Var.getClass();
        e1Var.g.add(d1Var);
        c1 c1Var = (c1) e1Var.f.get(d1Var);
        if (c1Var != null) {
            c1Var.a.f(c1Var.b);
        }
        d1Var.c.add(a2);
        u2.y c10 = d1Var.a.c(a2, dVar, j10);
        e1Var.c.put(c10, d1Var);
        e1Var.c();
        this.a = j11 != -9223372036854775807L ? new u2.e(c10, !z10, 0L, j11) : c10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u2.e0] */
    public final long a(x2.v vVar, long j3, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        u2.d1[] d1VarArr;
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
            d1VarArr = this.c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].b == -2) {
                d1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.o = vVar;
        c();
        long o9 = this.a.o(vVar.c, this.i, this.c, zArr, j3);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].b == -2 && this.o.b(i12)) {
                d1VarArr[i12] = new u2.r();
            }
        }
        this.f = false;
        for (int i13 = 0; i13 < d1VarArr.length; i13++) {
            if (d1VarArr[i13] != null) {
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, u2.f1] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long r10 = this.f ? this.a.r() : Long.MIN_VALUE;
        return r10 == Long.MIN_VALUE ? this.g.e : r10;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u2.e0] */
    public final void f(float f7, b2.k1 k1Var, boolean z10) {
        this.e = true;
        this.n = this.a.q();
        x2.v j3 = j(f7, k1Var, z10);
        t0 t0Var = this.g;
        long j10 = t0Var.b;
        long j11 = t0Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = a(j3, j10, false, new boolean[this.j.length]);
        long j12 = this.p;
        t0 t0Var2 = this.g;
        this.p = (t0Var2.b - a2) + j12;
        this.g = t0Var2.b(a2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u2.f1] */
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
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u2.e0] */
    public final void i() {
        b();
        ?? r02 = this.a;
        try {
            boolean z10 = r02 instanceof u2.e;
            e1 e1Var = this.l;
            if (z10) {
                e1Var.f(((u2.e) r02).a);
            } else {
                e1Var.f(r02);
            }
        } catch (RuntimeException e) {
            e2.a.f("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v64 */
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
        b2.o1 o1Var2;
        Context context;
        int[] iArr3;
        x2.u uVar = this.k;
        f[] fVarArr = this.j;
        q1 q1Var = this.n;
        uVar.getClass();
        int[] iArr4 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length][];
        int[][][] iArr5 = new int[fVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = q1Var.a;
            l1VarArr[i13] = new b2.l1[i14];
            iArr5[i13] = new int[i14][];
        }
        int length2 = fVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr6[i15] = fVarArr[i15].B();
        }
        int i16 = 0;
        while (i16 < q1Var.a) {
            b2.l1 a2 = q1Var.a(i16);
            boolean z14 = a2.c == 5;
            int length3 = fVarArr.length;
            int i17 = 0;
            int i18 = 0;
            boolean z15 = true;
            while (i18 < fVarArr.length) {
                f fVar = fVarArr[i18];
                x2.u uVar2 = uVar;
                q1 q1Var2 = q1Var;
                int i19 = 0;
                for (int i20 = 0; i20 < a2.a; i20++) {
                    i19 = Math.max(i19, fVar.A(a2.d[i20]) & 7);
                }
                boolean z16 = iArr4[i18] == 0;
                if (i19 > i17 || (i19 == i17 && z14 && !z15 && z16)) {
                    i17 = i19;
                    z15 = z16;
                    length3 = i18;
                }
                i18++;
                uVar = uVar2;
                q1Var = q1Var2;
            }
            x2.u uVar3 = uVar;
            q1 q1Var3 = q1Var;
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
            uVar = uVar3;
            q1Var = q1Var3;
        }
        x2.u uVar4 = uVar;
        q1[] q1VarArr = new q1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr8 = new int[fVarArr.length];
        for (int i23 = 0; i23 < fVarArr.length; i23++) {
            int i24 = iArr4[i23];
            q1VarArr[i23] = new q1((b2.l1[]) e2.d0.S(i24, l1VarArr[i23]));
            iArr5[i23] = (int[][]) e2.d0.S(i24, iArr5[i23]);
            strArr[i23] = fVarArr[i23].j();
            iArr8[i23] = fVarArr[i23].b;
        }
        int i25 = 7;
        x2.t tVar2 = new x2.t(iArr8, q1VarArr, iArr6, iArr5, new q1((b2.l1[]) e2.d0.S(iArr4[fVarArr.length], l1VarArr[fVarArr.length])));
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
        int i26 = tVar2.a;
        Context context2 = pVar.e;
        x2.q[] qVarArr = new x2.q[i26];
        int i27 = 0;
        while (true) {
            if (i27 >= tVar2.a) {
                z11 = false;
                break;
            }
            if (2 == iArr8[i27] && q1VarArr[i27].a > 0) {
                z11 = true;
                break;
            }
            i27++;
        }
        Pair j10 = x2.p.j(1, tVar2, iArr5, new ca.b(pVar, iVar, z11, iArr6, 7), new sg.p(i25));
        if (j10 != null) {
            qVarArr[((Integer) j10.second).intValue()] = (x2.q) j10.first;
        }
        if (j10 == null) {
            str = null;
        } else {
            x2.q qVar2 = (x2.q) j10.first;
            str = qVar2.a.d[qVar2.b[0]].d;
        }
        b2.o1 o1Var3 = iVar.u;
        if (o1Var3.a == 2) {
            str2 = str;
            j3 = null;
            l1Var = null;
        } else {
            a1.d dVar = new a1.d(iVar, str, iArr6, (!iVar.k || context2 == null) ? null : e2.d0.w(context2), 20);
            str2 = str;
            l1Var = null;
            j3 = x2.p.j(2, tVar2, iArr5, dVar, new sg.p(6));
        }
        int i28 = 4;
        if ((iVar.A || j3 == null) && o1Var3.a != 2) {
            iArr = iArr8;
            pair = x2.p.j(4, tVar2, iArr5, new th.e(iVar, 7), new sg.p(5));
        } else {
            iArr = iArr8;
            pair = l1Var;
        }
        if (pair != 0) {
            qVarArr[((Integer) pair.second).intValue()] = (x2.q) pair.first;
        } else if (j3 != null) {
            qVarArr[((Integer) j3.second).intValue()] = (x2.q) j3.first;
        }
        int i29 = 3;
        if (o1Var3.a == 2) {
            pair2 = l1Var;
        } else {
            if (!iVar.x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                obj = l1Var;
            } else {
                String str3 = e2.d0.a;
                obj = locale.toLanguageTag();
            }
            int i30 = 8;
            pair2 = x2.p.j(3, tVar2, iArr5, new f21(iVar, str2, obj, i30), new sg.p(i30));
        }
        if (pair2 != 0) {
            qVarArr[((Integer) pair2.second).intValue()] = (x2.q) pair2.first;
        }
        int i31 = 0;
        while (i31 < i26) {
            int i32 = iArr[i31];
            if (i32 == 2 || i32 == 1 || i32 == i29 || i32 == i28) {
                i11 = i31;
                o1Var = o1Var3;
            } else {
                q1 q1Var4 = q1VarArr[i31];
                int[][] iArr9 = iArr5[i31];
                if (o1Var3.a == 2) {
                    i11 = i31;
                    o1Var = o1Var3;
                } else {
                    b2.l1 l1Var3 = l1Var;
                    b2.l1 l1Var4 = l1Var3;
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < q1Var4.a) {
                        b2.l1 a10 = q1Var4.a(i33);
                        int[] iArr10 = iArr9[i33];
                        b2.l1 l1Var5 = l1Var3;
                        q1 q1Var5 = q1Var4;
                        x2.g gVar = l1Var4;
                        int i35 = i31;
                        int i36 = 0;
                        while (i36 < a10.a) {
                            int i37 = i36;
                            if (hc.b.e(iArr10[i36], iVar.t0)) {
                                i12 = i33;
                                x2.g gVar2 = new x2.g(a10.d[i37], iArr10[i37]);
                                if (gVar != 0) {
                                    o1Var2 = o1Var3;
                                    if (e9.z.a.c(gVar2.b, gVar.b).c(gVar2.a, gVar.a).e() <= 0) {
                                    }
                                } else {
                                    o1Var2 = o1Var3;
                                }
                                gVar = gVar2;
                                l1Var5 = a10;
                                i34 = i37;
                            } else {
                                i12 = i33;
                                o1Var2 = o1Var3;
                            }
                            i36 = i37 + 1;
                            i33 = i12;
                            o1Var3 = o1Var2;
                            gVar = gVar;
                        }
                        i33++;
                        i31 = i35;
                        q1Var4 = q1Var5;
                        l1Var4 = gVar;
                        l1Var3 = l1Var5;
                    }
                    i11 = i31;
                    o1Var = o1Var3;
                    if (l1Var3 != null) {
                        qVar = new x2.q(l1Var3, i34);
                        qVarArr[i11] = qVar;
                    }
                }
                qVar = l1Var;
                qVarArr[i11] = qVar;
            }
            i31 = i11 + 1;
            o1Var3 = o1Var;
            i29 = 3;
            i28 = 4;
        }
        int i38 = tVar2.a;
        q1[] q1VarArr2 = tVar2.c;
        HashMap hashMap = new HashMap();
        for (int i39 = 0; i39 < i38; i39++) {
            x2.p.c(q1VarArr2[i39], iVar, hashMap);
        }
        x2.p.c(tVar2.f, iVar, hashMap);
        for (int i40 = 0; i40 < i38; i40++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(tVar2.b[i40]));
            if (m1Var != null) {
                b2.l1 l1Var6 = m1Var.a;
                e9.i0 i0Var = m1Var.b;
                qVarArr[i40] = (i0Var.isEmpty() || q1VarArr2[i40].b(l1Var6) == -1) ? l1Var : new x2.q(l1Var6, y7.f(i0Var));
            }
        }
        int i41 = tVar2.a;
        for (int i42 = 0; i42 < i41; i42++) {
            q1 q1Var6 = tVar2.c[i42];
            Map map = (Map) iVar.v0.get(i42);
            if (map != null && map.containsKey(q1Var6)) {
                Map map2 = (Map) iVar.v0.get(i42);
                if (map2 != null && map2.get(q1Var6) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i42] = l1Var;
            }
        }
        for (int i43 = 0; i43 < i26; i43++) {
            int i44 = tVar2.b[i43];
            if (iVar.w0.get(i43) || iVar.E.contains(Integer.valueOf(i44))) {
                qVarArr[i43] = l1Var;
            }
        }
        t7.u uVar5 = pVar.f;
        y2.c cVar2 = pVar.b;
        e2.d.h(cVar2);
        uVar5.getClass();
        ArrayList arrayList = new ArrayList();
        int i45 = 0;
        while (i45 < qVarArr.length) {
            x2.q qVar3 = qVarArr[i45];
            if (qVar3 == 0 || qVar3.b.length <= 1) {
                l1Var2 = l1Var;
                arrayList.add(l1Var2);
            } else {
                e9.f0 u10 = e9.i0.u();
                u10.b(new x2.a(0L, 0L));
                arrayList.add(u10);
                l1Var2 = l1Var;
            }
            i45++;
            l1Var = l1Var2;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i46 = 0;
        while (i46 < qVarArr.length) {
            x2.q qVar4 = qVarArr[i46];
            if (qVar4 == 0) {
                jArr[i46] = new long[0];
                tVar = tVar2;
            } else {
                int[] iArr11 = qVar4.b;
                jArr[i46] = new long[iArr11.length];
                int i47 = 0;
                while (i47 < iArr11.length) {
                    x2.t tVar3 = tVar2;
                    long j11 = qVar4.a.d[iArr11[i47]].j;
                    long[] jArr2 = jArr[i46];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i47] = j11;
                    i47++;
                    tVar2 = tVar3;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i46]);
            }
            i46++;
            tVar2 = tVar;
        }
        x2.t tVar4 = tVar2;
        int[] iArr12 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i48 = 0; i48 < length4; i48++) {
            long[] jArr4 = jArr[i48];
            jArr3[i48] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        x2.b.v(arrayList, jArr3);
        e9.q.e(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(e9.x0.b);
        e9.u0 u0Var = new e9.u0();
        e9.v0 v0Var = new e9.v0(treeMap);
        v0Var.f = u0Var;
        int i49 = 0;
        while (i49 < length4) {
            long[] jArr5 = jArr[i49];
            if (jArr5.length <= 1) {
                cVar = cVar2;
                i10 = length4;
                iArr2 = iArr12;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                cVar = cVar2;
                int i50 = 0;
                while (true) {
                    long[] jArr6 = jArr[i49];
                    i10 = length4;
                    double d = 0.0d;
                    if (i50 >= jArr6.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j12 = jArr6[i50];
                    if (j12 != -1) {
                        d = Math.log(j12);
                    }
                    dArr[i50] = d;
                    i50++;
                    length4 = i10;
                    iArr12 = iArr13;
                }
                iArr2 = iArr12;
                int i51 = length5 - 1;
                double d10 = dArr[i51] - dArr[0];
                int i52 = 0;
                while (i52 < i51) {
                    double d11 = dArr[i52];
                    int i53 = i52 + 1;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i53]) * 0.5d) - dArr[0]) / d10);
                    Integer valueOf2 = Integer.valueOf(i49);
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
                    i52 = i53;
                    d10 = d12;
                }
            }
            i49++;
            length4 = i10;
            iArr12 = iArr2;
            cVar2 = cVar;
        }
        y2.c cVar3 = cVar2;
        int[] iArr14 = iArr12;
        e9.n nVar = v0Var.b;
        if (nVar == null) {
            nVar = new e9.n(0, v0Var);
            v0Var.b = nVar;
        }
        e9.i0 v = e9.i0.v(nVar);
        for (int i54 = 0; i54 < v.size(); i54++) {
            int intValue = ((Integer) v.get(i54)).intValue();
            int i55 = iArr14[intValue] + 1;
            iArr14[intValue] = i55;
            jArr3[intValue] = jArr[intValue][i55];
            x2.b.v(arrayList, jArr3);
        }
        for (int i56 = 0; i56 < qVarArr.length; i56++) {
            if (arrayList.get(i56) != null) {
                jArr3[i56] = jArr3[i56] * 2;
            }
        }
        x2.b.v(arrayList, jArr3);
        e9.f0 u11 = e9.i0.u();
        for (int i57 = 0; i57 < arrayList.size(); i57++) {
            e9.f0 f0Var = (e9.f0) arrayList.get(i57);
            u11.b(f0Var == null ? e9.a1.e : f0Var.i());
        }
        e9.a1 i58 = u11.i();
        x2.r[] rVarArr = new x2.r[qVarArr.length];
        for (int i59 = 0; i59 < qVarArr.length; i59++) {
            x2.q qVar5 = qVarArr[i59];
            if (qVar5 != 0) {
                int[] iArr15 = qVar5.b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new x2.s(qVar5.a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(qVar5.a, iArr15, cVar3, 10000, j13, j13, (e9.i0) i58.get(i59));
                    }
                    rVarArr[i59] = bVar;
                }
            }
        }
        l1[] l1VarArr2 = new l1[i26];
        int i60 = 0;
        while (i60 < i26) {
            x2.t tVar5 = tVar4;
            l1VarArr2[i60] = (iVar.w0.get(i60) || iVar.E.contains(Integer.valueOf(tVar5.b[i60])) || (tVar5.b[i60] != -2 && rVarArr[i60] == null)) ? null : l1.c;
            i60++;
            tVar4 = tVar5;
        }
        x2.t tVar6 = tVar4;
        if (iVar.u.a != 0) {
            int i61 = 0;
            int i62 = 0;
            int i63 = -1;
            while (true) {
                if (i61 < tVar6.a) {
                    int i64 = tVar6.b[i61];
                    x2.r rVar = rVarArr[i61];
                    if (i64 != 1 && rVar != null) {
                        break;
                    }
                    if (i64 == 1 && rVar != null && rVar.length() == 1) {
                        if (x2.p.i(iVar, iArr5[i61][tVar6.c[i61].b(rVar.b())][rVar.h(0)], rVar.m())) {
                            i62++;
                            i63 = i61;
                        }
                    }
                    i61++;
                } else if (i62 == 1) {
                    int i65 = iVar.u.b ? 1 : 2;
                    l1 l1Var7 = l1VarArr2[i63];
                    l1VarArr2[i63] = new l1(i65, l1Var7 != null && l1Var7.b);
                }
            }
        }
        Pair create = Pair.create(l1VarArr2, rVarArr);
        x2.r[] rVarArr2 = (x2.r[]) create.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i66 = 0; i66 < rVarArr2.length; i66++) {
            x2.r rVar2 = rVarArr2[i66];
            if (rVar2 != null) {
                a1Var = e9.i0.z(rVar2);
            } else {
                e9.g0 g0Var = e9.i0.b;
                a1Var = e9.a1.e;
            }
            listArr[i66] = a1Var;
        }
        e9.f0 f0Var2 = new e9.f0(4);
        int i67 = 0;
        while (true) {
            int i68 = tVar6.a;
            q1[] q1VarArr3 = tVar6.c;
            if (i67 >= i68) {
                break;
            }
            q1 q1Var7 = q1VarArr3[i67];
            List list = listArr[i67];
            int i69 = 0;
            while (i69 < q1Var7.a) {
                b2.l1 a11 = q1Var7.a(i69);
                int i70 = q1VarArr3[i67].a(i69).a;
                int[] iArr16 = new int[i70];
                int i71 = 0;
                int i72 = 0;
                while (i71 < i70) {
                    List[] listArr2 = listArr;
                    if ((tVar6.e[i67][i69][i71] & 7) == 4) {
                        iArr16[i72] = i71;
                        i72++;
                    }
                    i71++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr16, i72);
                int i73 = i67;
                String str4 = null;
                int i74 = 0;
                boolean z17 = false;
                int i75 = 0;
                int i76 = 16;
                while (i74 < copyOf.length) {
                    String str5 = q1VarArr3[i73].a(i69).d[copyOf[i74]].r;
                    int i77 = i75 + 1;
                    if (i75 == 0) {
                        str4 = str5;
                    } else {
                        z17 = (!Objects.equals(str4, str5)) | z17;
                    }
                    i76 = Math.min(i76, tVar6.e[i73][i69][i74] & 24);
                    i74++;
                    i75 = i77;
                }
                if (z17) {
                    i76 = Math.min(i76, tVar6.d[i73]);
                }
                boolean z18 = i76 != 0;
                int i78 = a11.a;
                int[] iArr17 = new int[i78];
                boolean[] zArr = new boolean[i78];
                for (int i79 = 0; i79 < a11.a; i79++) {
                    iArr17[i79] = tVar6.e[i73][i69][i79] & 7;
                    int i80 = 0;
                    while (true) {
                        if (i80 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.r rVar3 = (x2.r) list.get(i80);
                        if (rVar3.b().equals(a11) && rVar3.u(i79) != -1) {
                            z13 = true;
                            break;
                        }
                        i80++;
                    }
                    zArr[i79] = z13;
                }
                f0Var2.b(new r1(a11, z18, iArr17, zArr));
                i69++;
                listArr = listArr3;
                i67 = i73;
            }
            i67++;
        }
        q1 q1Var8 = tVar6.f;
        for (int i81 = 0; i81 < q1Var8.a; i81++) {
            b2.l1 a12 = q1Var8.a(i81);
            int[] iArr18 = new int[a12.a];
            Arrays.fill(iArr18, 0);
            f0Var2.b(new r1(a12, false, iArr18, new boolean[a12.a]));
        }
        x2.v vVar = new x2.v((l1[]) create.first, (x2.r[]) create.second, new s1(f0Var2.i()), tVar6);
        for (int i82 = 0; i82 < vVar.a; i82++) {
            if (vVar.b(i82)) {
                if (vVar.c[i82] == null && this.j[i82].b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(vVar.c[i82] == null);
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
        if (obj instanceof u2.e) {
            long j3 = this.g.d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            u2.e eVar = (u2.e) obj;
            eVar.e = 0L;
            eVar.f = j3;
        }
    }
}
