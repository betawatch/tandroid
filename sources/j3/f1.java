package j3;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import k7.y7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f1 {
    public final Object a;
    public final Object b;
    public final o4.l0[] c;
    public boolean d;
    public boolean e;
    public g1 f;
    public boolean g;
    public final boolean[] h;
    public final e[] i;
    public final f5.t j;
    public final q1 k;
    public f1 l;
    public o4.t0 m;
    public f5.y n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o4.d] */
    public f1(e[] eVarArr, long j10, f5.t tVar, g5.q qVar, q1 q1Var, g1 g1Var, f5.y yVar) {
        this.i = eVarArr;
        this.o = j10;
        this.j = tVar;
        this.k = q1Var;
        o4.v vVar = g1Var.a;
        this.b = vVar.a;
        this.f = g1Var;
        this.m = o4.t0.d;
        this.n = yVar;
        this.c = new o4.l0[eVarArr.length];
        this.h = new boolean[eVarArr.length];
        long j11 = g1Var.b;
        long j12 = g1Var.d;
        q1Var.getClass();
        Object obj = vVar.a;
        int i10 = a.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        o4.v b10 = vVar.b(pair.second);
        p1 p1Var = (p1) q1Var.d.get(obj2);
        p1Var.getClass();
        q1Var.g.add(p1Var);
        o1 o1Var = (o1) q1Var.f.get(p1Var);
        if (o1Var != null) {
            o1Var.a.e(o1Var.b);
        }
        p1Var.c.add(b10);
        o4.n b11 = p1Var.a.b(b10, qVar, j11);
        q1Var.c.put(b11, p1Var);
        q1Var.c();
        this.a = j12 != -9223372036854775807L ? new o4.d(b11, true, 0L, j12) : b11;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o4.t] */
    public final long a(f5.y yVar, long j10, boolean z4, boolean[] zArr) {
        e[] eVarArr;
        o4.l0[] l0VarArr;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= yVar.a) {
                break;
            }
            if (z4 || !yVar.a(this.n, i10)) {
                z10 = false;
            }
            this.h[i10] = z10;
            i10++;
        }
        int i11 = 0;
        while (true) {
            eVarArr = this.i;
            int length = eVarArr.length;
            l0VarArr = this.c;
            if (i11 >= length) {
                break;
            }
            if (eVarArr[i11].b == -2) {
                l0VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.n = yVar;
        c();
        long g10 = this.a.g(yVar.c, this.h, this.c, zArr, j10);
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (eVarArr[i12].b == -2 && this.n.b(i12)) {
                l0VarArr[i12] = new o4.g();
            }
        }
        this.e = false;
        for (int i13 = 0; i13 < l0VarArr.length; i13++) {
            if (l0VarArr[i13] != null) {
                h5.a.i(yVar.b(i13));
                if (eVarArr[i13].b != -2) {
                    this.e = true;
                }
            } else {
                h5.a.i(yVar.c[i13] == null);
            }
        }
        return g10;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            f5.y yVar = this.n;
            if (i10 >= yVar.a) {
                return;
            }
            boolean b10 = yVar.b(i10);
            f5.c cVar = this.n.c[i10];
            if (b10 && cVar != null) {
                cVar.a();
            }
            i10++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            f5.y yVar = this.n;
            if (i10 >= yVar.a) {
                return;
            }
            boolean b10 = yVar.b(i10);
            f5.c cVar = this.n.c[i10];
            if (b10 && cVar != null) {
                cVar.b();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o4.n0] */
    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long r10 = this.e ? this.a.r() : Long.MIN_VALUE;
        return r10 == Long.MIN_VALUE ? this.f.e : r10;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o4.t] */
    public final void f() {
        b();
        ?? r02 = this.a;
        try {
            boolean z4 = r02 instanceof o4.d;
            q1 q1Var = this.k;
            if (z4) {
                q1Var.f(((o4.d) r02).a);
            } else {
                q1Var.f(r02);
            }
        } catch (RuntimeException e6) {
            h5.a.p("MediaPeriodHolder", "Period release failed.", e6);
        }
    }

    public final f5.y g(float f10, o2 o2Var) {
        f5.h hVar;
        boolean z4;
        String str;
        long j10;
        boolean z10;
        s8.i0 i0Var;
        int i10;
        boolean z11;
        f5.c bVar;
        long j11;
        g5.f fVar;
        int[] iArr;
        int i11;
        f5.s sVar;
        Object obj;
        int i12;
        o4.s0 s0Var;
        int i13;
        f5.k kVar;
        int[] iArr2;
        f5.t tVar = this.j;
        e[] eVarArr = this.i;
        o4.t0 t0Var = this.m;
        tVar.getClass();
        int[] iArr3 = new int[eVarArr.length + 1];
        int length = eVarArr.length + 1;
        o4.s0[][] s0VarArr = new o4.s0[length][];
        int[][][] iArr4 = new int[eVarArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = t0Var.a;
            s0VarArr[i14] = new o4.s0[i15];
            iArr4[i14] = new int[i15][];
        }
        int length2 = eVarArr.length;
        int[] iArr5 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr5[i16] = eVarArr[i16].y();
        }
        int i17 = 0;
        while (i17 < t0Var.a) {
            o4.s0 a2 = t0Var.a(i17);
            boolean z12 = a2.c == 5;
            int length3 = eVarArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z13 = true;
            while (i19 < eVarArr.length) {
                e eVar = eVarArr[i19];
                f5.t tVar2 = tVar;
                int i20 = 0;
                for (int i21 = 0; i21 < a2.a; i21++) {
                    i20 = Math.max(i20, eVar.x(a2.d[i21]) & 7);
                }
                boolean z14 = iArr3[i19] == 0;
                if (i20 > i18 || (i20 == i18 && z12 && !z13 && z14)) {
                    i18 = i20;
                    z13 = z14;
                    length3 = i19;
                }
                i19++;
                tVar = tVar2;
            }
            f5.t tVar3 = tVar;
            if (length3 == eVarArr.length) {
                iArr2 = new int[a2.a];
            } else {
                e eVar2 = eVarArr[length3];
                int[] iArr6 = new int[a2.a];
                for (int i22 = 0; i22 < a2.a; i22++) {
                    iArr6[i22] = eVar2.x(a2.d[i22]);
                }
                iArr2 = iArr6;
            }
            int i23 = iArr3[length3];
            s0VarArr[length3][i23] = a2;
            iArr4[length3][i23] = iArr2;
            iArr3[length3] = i23 + 1;
            i17++;
            tVar = tVar3;
        }
        f5.t tVar4 = tVar;
        o4.t0[] t0VarArr = new o4.t0[eVarArr.length];
        String[] strArr = new String[eVarArr.length];
        int[] iArr7 = new int[eVarArr.length];
        for (int i24 = 0; i24 < eVarArr.length; i24++) {
            int i25 = iArr3[i24];
            t0VarArr[i24] = new o4.t0((o4.s0[]) h5.d0.I(i25, s0VarArr[i24]));
            iArr4[i24] = (int[][]) h5.d0.I(i25, iArr4[i24]);
            strArr[i24] = eVarArr[i24].g();
            iArr7[i24] = eVarArr[i24].b;
        }
        f5.s sVar2 = new f5.s(iArr7, t0VarArr, iArr5, iArr4, new o4.t0((o4.s0[]) h5.d0.I(iArr3[eVarArr.length], s0VarArr[eVarArr.length])));
        f5.p pVar = (f5.p) tVar4;
        synchronized (pVar.d) {
            try {
                hVar = pVar.h;
                if (hVar.W && h5.d0.a >= 32 && (kVar = pVar.i) != null) {
                    Looper myLooper = Looper.myLooper();
                    h5.a.j(myLooper);
                    kVar.b(pVar, myLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i26 = sVar2.a;
        f5.q[] qVarArr = new f5.q[i26];
        int i27 = 2;
        Pair j12 = f5.p.j(2, sVar2, iArr4, new c1.b(9, hVar, iArr5), new e5.f(5));
        if (j12 != null) {
            qVarArr[((Integer) j12.second).intValue()] = (f5.q) j12.first;
        }
        int i28 = 0;
        while (true) {
            if (i28 >= sVar2.a) {
                z4 = false;
                break;
            }
            if (2 == iArr7[i28] && t0VarArr[i28].a > 0) {
                z4 = true;
                break;
            }
            i28++;
        }
        Pair j13 = f5.p.j(1, sVar2, iArr4, new com.google.firebase.messaging.i(pVar, hVar, z4, 1), new e5.f(6));
        if (j13 != null) {
            qVarArr[((Integer) j13.second).intValue()] = (f5.q) j13.first;
        }
        if (j13 == null) {
            str = null;
        } else {
            f5.q qVar = (f5.q) j13.first;
            str = qVar.a.d[qVar.b[0]].c;
        }
        int i29 = 3;
        Pair j14 = f5.p.j(3, sVar2, iArr4, new c1.b(10, hVar, str), new e5.f(7));
        if (j14 != null) {
            qVarArr[((Integer) j14.second).intValue()] = (f5.q) j14.first;
        }
        int i30 = 0;
        while (i30 < i26) {
            int i31 = iArr7[i30];
            if (i31 == i27 || i31 == 1 || i31 == i29) {
                i12 = i30;
            } else {
                o4.t0 t0Var2 = t0VarArr[i30];
                int[][] iArr8 = iArr4[i30];
                int i32 = 0;
                o4.s0 s0Var2 = null;
                int i33 = 0;
                f5.f fVar2 = null;
                while (i32 < t0Var2.a) {
                    o4.s0 a10 = t0Var2.a(i32);
                    int[] iArr9 = iArr8[i32];
                    int i34 = i32;
                    f5.f fVar3 = fVar2;
                    int i35 = 0;
                    while (i35 < a10.a) {
                        int i36 = i30;
                        if (f5.p.f(iArr9[i35], hVar.X)) {
                            s0Var = a10;
                            f5.f fVar4 = new f5.f(a10.d[i35], iArr9[i35]);
                            if (fVar3 != null) {
                                i13 = i35;
                                if (s8.p.a.c(fVar4.b, fVar3.b).c(fVar4.a, fVar3.a).e() <= 0) {
                                }
                            } else {
                                i13 = i35;
                            }
                            fVar3 = fVar4;
                            s0Var2 = s0Var;
                            i33 = i13;
                        } else {
                            s0Var = a10;
                            i13 = i35;
                        }
                        i35 = i13 + 1;
                        i30 = i36;
                        a10 = s0Var;
                    }
                    i32 = i34 + 1;
                    fVar2 = fVar3;
                }
                i12 = i30;
                qVarArr[i12] = s0Var2 == null ? null : new f5.q(0, s0Var2, new int[]{i33});
            }
            i30 = i12 + 1;
            i27 = 2;
            i29 = 3;
        }
        Object obj2 = null;
        int i37 = sVar2.a;
        o4.t0[] t0VarArr2 = sVar2.c;
        HashMap hashMap = new HashMap();
        for (int i38 = 0; i38 < i37; i38++) {
            f5.p.c(t0VarArr2[i38], hVar, hashMap);
        }
        f5.p.c(sVar2.f, hVar, hashMap);
        for (int i39 = 0; i39 < i37; i39++) {
            f5.v vVar = (f5.v) hashMap.get(Integer.valueOf(sVar2.b[i39]));
            if (vVar != null) {
                o4.s0 s0Var3 = vVar.a;
                s8.v vVar2 = vVar.b;
                qVarArr[i39] = (vVar2.isEmpty() || t0VarArr2[i39].b(s0Var3) == -1) ? null : new f5.q(0, s0Var3, y7.d(vVar2));
            }
        }
        int i40 = sVar2.a;
        for (int i41 = 0; i41 < i40; i41++) {
            o4.t0 t0Var3 = sVar2.c[i41];
            Map map = (Map) hVar.b0.get(i41);
            if (map != null && map.containsKey(t0Var3)) {
                Map map2 = (Map) hVar.b0.get(i41);
                if (map2 != null) {
                }
                qVarArr[i41] = null;
            }
        }
        for (int i42 = 0; i42 < i26; i42++) {
            int i43 = sVar2.b[i42];
            if (hVar.c0.get(i42) || hVar.M.contains(Integer.valueOf(i43))) {
                qVarArr[i42] = null;
            }
        }
        db.a aVar = pVar.f;
        g5.f fVar5 = pVar.b;
        h5.a.j(fVar5);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i44 = 0;
        while (i44 < qVarArr.length) {
            f5.q qVar2 = qVarArr[i44];
            if (qVar2 == null || qVar2.b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                s8.t tVar5 = s8.v.b;
                s8.s sVar3 = new s8.s();
                sVar3.b(new f5.a(0L, 0L));
                arrayList.add(sVar3);
                obj = obj2;
            }
            i44++;
            obj2 = obj;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i45 = 0;
        while (true) {
            j10 = -1;
            if (i45 >= qVarArr.length) {
                break;
            }
            f5.q qVar3 = qVarArr[i45];
            if (qVar3 == null) {
                jArr[i45] = new long[0];
                sVar = sVar2;
            } else {
                int[] iArr10 = qVar3.b;
                jArr[i45] = new long[iArr10.length];
                int i46 = 0;
                while (i46 < iArr10.length) {
                    f5.s sVar4 = sVar2;
                    long j15 = qVar3.a.d[iArr10[i46]].n;
                    long[] jArr2 = jArr[i45];
                    if (j15 == -1) {
                        j15 = 0;
                    }
                    jArr2[i46] = j15;
                    i46++;
                    sVar2 = sVar4;
                }
                sVar = sVar2;
                Arrays.sort(jArr[i45]);
            }
            i45++;
            sVar2 = sVar;
        }
        f5.s sVar5 = sVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr4 = jArr[i47];
            jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        f5.b.w(arrayList, jArr3);
        s8.l.c(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(s8.g0.b);
        s8.d0 d0Var = new s8.d0();
        s8.e0 e0Var = new s8.e0();
        if (!treeMap.isEmpty()) {
            throw new IllegalArgumentException();
        }
        e0Var.d = treeMap;
        e0Var.f = d0Var;
        int i48 = 0;
        while (i48 < length4) {
            long[] jArr5 = jArr[i48];
            if (jArr5.length <= 1) {
                fVar = fVar5;
                i11 = length4;
                j11 = j10;
                iArr = iArr11;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                j11 = j10;
                int i49 = 0;
                while (true) {
                    long[] jArr6 = jArr[i48];
                    fVar = fVar5;
                    double d = 0.0d;
                    if (i49 >= jArr6.length) {
                        break;
                    }
                    int i50 = length4;
                    int[] iArr12 = iArr11;
                    long j16 = jArr6[i49];
                    if (j16 != j11) {
                        d = Math.log(j16);
                    }
                    dArr[i49] = d;
                    i49++;
                    length4 = i50;
                    iArr11 = iArr12;
                    fVar5 = fVar;
                }
                int i51 = length4;
                iArr = iArr11;
                int i52 = length5 - 1;
                double d10 = dArr[i52] - dArr[0];
                int i53 = 0;
                while (i53 < i52) {
                    double d11 = dArr[i53];
                    i53++;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i53]) * 0.5d) - dArr[0]) / d10);
                    int i54 = i51;
                    Integer valueOf2 = Integer.valueOf(i48);
                    double d12 = d10;
                    Map map3 = e0Var.d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        List list = (List) e0Var.f.get();
                        if (!list.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        e0Var.e++;
                        map3.put(valueOf, list);
                    } else if (collection.add(valueOf2)) {
                        e0Var.e++;
                    }
                    i51 = i54;
                    d10 = d12;
                }
                i11 = i51;
            }
            i48++;
            iArr11 = iArr;
            j10 = j11;
            length4 = i11;
            fVar5 = fVar;
        }
        g5.f fVar6 = fVar5;
        int[] iArr13 = iArr11;
        l7.m mVar = e0Var.b;
        int i55 = 4;
        if (mVar == null) {
            mVar = new l7.m(4, e0Var);
            e0Var.b = mVar;
        }
        s8.v t6 = s8.v.t(mVar);
        for (int i56 = 0; i56 < t6.size(); i56++) {
            int intValue = ((Integer) t6.get(i56)).intValue();
            int i57 = iArr13[intValue] + 1;
            iArr13[intValue] = i57;
            jArr3[intValue] = jArr[intValue][i57];
            f5.b.w(arrayList, jArr3);
        }
        for (int i58 = 0; i58 < qVarArr.length; i58++) {
            if (arrayList.get(i58) != null) {
                jArr3[i58] = jArr3[i58] * 2;
            }
        }
        f5.b.w(arrayList, jArr3);
        s8.l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i59 = 0;
        int i60 = 0;
        boolean z15 = false;
        while (i59 < arrayList.size()) {
            s8.s sVar6 = (s8.s) arrayList.get(i59);
            s8.i0 i61 = sVar6 == null ? s8.i0.e : sVar6.i();
            i61.getClass();
            int i62 = i60 + 1;
            if (objArr.length < i62) {
                objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i62));
            } else if (z15) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i60] = i61;
                i59++;
                i60++;
            }
            z15 = false;
            objArr[i60] = i61;
            i59++;
            i60++;
        }
        s8.i0 s6 = s8.v.s(i60, objArr);
        f5.c[] cVarArr = new f5.c[qVarArr.length];
        for (int i63 = 0; i63 < qVarArr.length; i63++) {
            f5.q qVar4 = qVarArr[i63];
            if (qVar4 != null) {
                int[] iArr14 = qVar4.b;
                if (iArr14.length != 0) {
                    if (iArr14.length == 1) {
                        bVar = new f5.r(qVar4.a, new int[]{iArr14[0]});
                    } else {
                        long j17 = 25000;
                        bVar = new f5.b(qVar4.a, iArr14, fVar6, 10000, j17, j17, (s8.v) s6.get(i63));
                    }
                    cVarArr[i63] = bVar;
                }
            }
        }
        g2[] g2VarArr = new g2[i26];
        int i64 = 0;
        while (i64 < i26) {
            f5.s sVar7 = sVar5;
            g2VarArr[i64] = (hVar.c0.get(i64) || hVar.M.contains(Integer.valueOf(sVar7.b[i64])) || (sVar7.b[i64] != -2 && cVarArr[i64] == null)) ? null : g2.b;
            i64++;
            sVar5 = sVar7;
        }
        f5.s sVar8 = sVar5;
        if (hVar.Y) {
            int i65 = -1;
            int i66 = -1;
            for (int i67 = 0; i67 < sVar8.a; i67++) {
                int i68 = sVar8.b[i67];
                f5.c cVar = cVarArr[i67];
                if ((i68 == 1 || i68 == 2) && cVar != null) {
                    int[][] iArr15 = iArr4[i67];
                    int b10 = sVar8.c[i67].b(cVar.l());
                    int i69 = 0;
                    while (true) {
                        if (i69 < cVar.p()) {
                            if ((iArr15[b10][cVar.f(i69)] & 32) != 32) {
                                break;
                            }
                            i69++;
                        } else if (i68 == 1) {
                            i10 = -1;
                            if (i66 != -1) {
                                z11 = false;
                                break;
                            }
                            i66 = i67;
                        } else {
                            i10 = -1;
                            if (i65 != -1) {
                                z11 = false;
                                break;
                            }
                            i65 = i67;
                        }
                    }
                }
            }
            i10 = -1;
            z11 = true;
            if (((i66 == i10 || i65 == i10) ? false : true) & z11) {
                g2 g2Var = new g2(true);
                g2VarArr[i66] = g2Var;
                g2VarArr[i65] = g2Var;
            }
        }
        Pair create = Pair.create(g2VarArr, cVarArr);
        f5.c[] cVarArr2 = (f5.c[]) create.second;
        List[] listArr = new List[cVarArr2.length];
        for (int i70 = 0; i70 < cVarArr2.length; i70++) {
            f5.c cVar2 = cVarArr2[i70];
            if (cVar2 != null) {
                i0Var = s8.v.x(cVar2);
            } else {
                s8.t tVar6 = s8.v.b;
                i0Var = s8.i0.e;
            }
            listArr[i70] = i0Var;
        }
        s8.s sVar9 = new s8.s();
        int i71 = 0;
        while (true) {
            int i72 = sVar8.a;
            o4.t0[] t0VarArr3 = sVar8.c;
            if (i71 >= i72) {
                break;
            }
            o4.t0 t0Var4 = t0VarArr3[i71];
            List list2 = listArr[i71];
            int i73 = 0;
            while (i73 < t0Var4.a) {
                o4.s0 a11 = t0Var4.a(i73);
                int i74 = t0VarArr3[i71].a(i73).a;
                int[] iArr16 = new int[i74];
                int i75 = 0;
                for (int i76 = 0; i76 < i74; i76++) {
                    if ((sVar8.e[i71][i73][i76] & 7) == i55) {
                        iArr16[i75] = i76;
                        i75++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr16, i75);
                List[] listArr2 = listArr;
                String str2 = null;
                int i77 = 0;
                boolean z16 = false;
                int i78 = 0;
                int i79 = 16;
                while (i77 < copyOf.length) {
                    String str3 = t0VarArr3[i71].a(i73).d[copyOf[i77]].C;
                    int i80 = i78 + 1;
                    if (i78 == 0) {
                        str2 = str3;
                    } else {
                        z16 = (!h5.d0.a(str2, str3)) | z16;
                    }
                    i79 = Math.min(i79, sVar8.e[i71][i73][i77] & 24);
                    i77++;
                    i78 = i80;
                }
                if (z16) {
                    i79 = Math.min(i79, sVar8.d[i71]);
                }
                boolean z17 = i79 != 0;
                int i81 = a11.a;
                int[] iArr17 = new int[i81];
                boolean[] zArr = new boolean[i81];
                for (int i82 = 0; i82 < a11.a; i82++) {
                    iArr17[i82] = sVar8.e[i71][i73][i82] & 7;
                    int i83 = 0;
                    while (true) {
                        if (i83 >= list2.size()) {
                            z10 = false;
                            break;
                        }
                        f5.c cVar3 = (f5.c) list2.get(i83);
                        if (cVar3.l().equals(a11) && cVar3.m(i82) != -1) {
                            z10 = true;
                            break;
                        }
                        i83++;
                    }
                    zArr[i82] = z10;
                }
                sVar9.b(new p2(a11, z17, iArr17, zArr));
                i73++;
                listArr = listArr2;
                i55 = 4;
            }
            i71++;
            i55 = 4;
        }
        o4.t0 t0Var5 = sVar8.f;
        for (int i84 = 0; i84 < t0Var5.a; i84++) {
            o4.s0 a12 = t0Var5.a(i84);
            int[] iArr18 = new int[a12.a];
            Arrays.fill(iArr18, 0);
            sVar9.b(new p2(a12, false, iArr18, new boolean[a12.a]));
        }
        f5.y yVar = new f5.y((g2[]) create.first, (f5.c[]) create.second, new q2(sVar9.i()), sVar8);
        for (f5.c cVar4 : yVar.c) {
            if (cVar4 != null) {
                cVar4.s(f10);
            }
        }
        return yVar;
    }
}
