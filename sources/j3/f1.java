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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public f5.x n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o4.d] */
    public f1(e[] eVarArr, long j10, f5.t tVar, g5.q qVar, q1 q1Var, g1 g1Var, f5.x xVar) {
        this.i = eVarArr;
        this.o = j10;
        this.j = tVar;
        this.k = q1Var;
        o4.v vVar = g1Var.a;
        this.b = vVar.a;
        this.f = g1Var;
        this.m = o4.t0.d;
        this.n = xVar;
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
    public final long a(f5.x xVar, long j10, boolean z4, boolean[] zArr) {
        e[] eVarArr;
        o4.l0[] l0VarArr;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= xVar.a) {
                break;
            }
            if (z4 || !xVar.a(this.n, i10)) {
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
        this.n = xVar;
        c();
        long Y = this.a.Y(xVar.c, this.h, this.c, zArr, j10);
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (eVarArr[i12].b == -2 && this.n.b(i12)) {
                l0VarArr[i12] = new o4.g();
            }
        }
        this.e = false;
        for (int i13 = 0; i13 < l0VarArr.length; i13++) {
            if (l0VarArr[i13] != null) {
                h5.a.i(xVar.b(i13));
                if (eVarArr[i13].b != -2) {
                    this.e = true;
                }
            } else {
                h5.a.i(xVar.c[i13] == null);
            }
        }
        return Y;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            f5.x xVar = this.n;
            if (i10 >= xVar.a) {
                return;
            }
            boolean b10 = xVar.b(i10);
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
            f5.x xVar = this.n;
            if (i10 >= xVar.a) {
                return;
            }
            boolean b10 = xVar.b(i10);
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
        long y12 = this.e ? this.a.y1() : Long.MIN_VALUE;
        return y12 == Long.MIN_VALUE ? this.f.e : y12;
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
        } catch (RuntimeException e) {
            h5.a.p("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final f5.x g(float f10, o2 o2Var) {
        f5.h hVar;
        boolean z4;
        String str;
        long j10;
        boolean z10;
        s8.i0 i0Var;
        int i10;
        boolean z11;
        f5.c bVar;
        Object[] objArr;
        long j11;
        g5.f fVar;
        int[] iArr;
        int i11;
        f5.s sVar;
        Object obj;
        int i12;
        o4.s0 s0Var;
        o4.t0 t0Var;
        f5.k kVar;
        int[] iArr2;
        f5.t tVar = this.j;
        e[] eVarArr = this.i;
        o4.t0 t0Var2 = this.m;
        tVar.getClass();
        int[] iArr3 = new int[eVarArr.length + 1];
        int length = eVarArr.length + 1;
        o4.s0[][] s0VarArr = new o4.s0[length][];
        int[][][] iArr4 = new int[eVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = t0Var2.a;
            s0VarArr[i13] = new o4.s0[i14];
            iArr4[i13] = new int[i14][];
        }
        int length2 = eVarArr.length;
        int[] iArr5 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr5[i15] = eVarArr[i15].y();
        }
        int i16 = 0;
        while (i16 < t0Var2.a) {
            o4.s0 a2 = t0Var2.a(i16);
            boolean z12 = a2.c == 5;
            int length3 = eVarArr.length;
            int i17 = 0;
            int i18 = 0;
            boolean z13 = true;
            while (i18 < eVarArr.length) {
                e eVar = eVarArr[i18];
                f5.t tVar2 = tVar;
                int i19 = 0;
                for (int i20 = 0; i20 < a2.a; i20++) {
                    i19 = Math.max(i19, eVar.x(a2.d[i20]) & 7);
                }
                boolean z14 = iArr3[i18] == 0;
                if (i19 > i17 || (i19 == i17 && z12 && !z13 && z14)) {
                    i17 = i19;
                    z13 = z14;
                    length3 = i18;
                }
                i18++;
                tVar = tVar2;
            }
            f5.t tVar3 = tVar;
            if (length3 == eVarArr.length) {
                iArr2 = new int[a2.a];
            } else {
                e eVar2 = eVarArr[length3];
                int[] iArr6 = new int[a2.a];
                for (int i21 = 0; i21 < a2.a; i21++) {
                    iArr6[i21] = eVar2.x(a2.d[i21]);
                }
                iArr2 = iArr6;
            }
            int i22 = iArr3[length3];
            s0VarArr[length3][i22] = a2;
            iArr4[length3][i22] = iArr2;
            iArr3[length3] = i22 + 1;
            i16++;
            tVar = tVar3;
        }
        f5.t tVar4 = tVar;
        o4.t0[] t0VarArr = new o4.t0[eVarArr.length];
        String[] strArr = new String[eVarArr.length];
        int[] iArr7 = new int[eVarArr.length];
        for (int i23 = 0; i23 < eVarArr.length; i23++) {
            int i24 = iArr3[i23];
            t0VarArr[i23] = new o4.t0((o4.s0[]) h5.d0.I(i24, s0VarArr[i23]));
            iArr4[i23] = (int[][]) h5.d0.I(i24, iArr4[i23]);
            strArr[i23] = eVarArr[i23].g();
            iArr7[i23] = eVarArr[i23].b;
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
        int i25 = sVar2.a;
        f5.q[] qVarArr = new f5.q[i25];
        int i26 = 2;
        Pair j12 = f5.p.j(2, sVar2, iArr4, new c1.b(10, hVar, iArr5), new e5.e(6));
        if (j12 != null) {
            qVarArr[((Integer) j12.second).intValue()] = (f5.q) j12.first;
        }
        int i27 = 0;
        while (true) {
            if (i27 >= sVar2.a) {
                z4 = false;
                break;
            }
            if (2 == iArr7[i27] && t0VarArr[i27].a > 0) {
                z4 = true;
                break;
            }
            i27++;
        }
        Pair j13 = f5.p.j(1, sVar2, iArr4, new com.google.firebase.messaging.i(pVar, hVar, z4, 1), new e5.e(7));
        if (j13 != null) {
            qVarArr[((Integer) j13.second).intValue()] = (f5.q) j13.first;
        }
        if (j13 == null) {
            str = null;
        } else {
            f5.q qVar = (f5.q) j13.first;
            str = qVar.a.d[qVar.b[0]].c;
        }
        int i28 = 3;
        Pair j14 = f5.p.j(3, sVar2, iArr4, new c1.b(11, hVar, str), new e5.e(8));
        if (j14 != null) {
            qVarArr[((Integer) j14.second).intValue()] = (f5.q) j14.first;
        }
        int i29 = 0;
        while (i29 < i25) {
            int i30 = iArr7[i29];
            if (i30 == i26 || i30 == 1 || i30 == i28) {
                i12 = i29;
            } else {
                o4.t0 t0Var3 = t0VarArr[i29];
                int[][] iArr8 = iArr4[i29];
                o4.s0 s0Var2 = null;
                int i31 = 0;
                int i32 = 0;
                f5.f fVar2 = null;
                while (i31 < t0Var3.a) {
                    o4.s0 a10 = t0Var3.a(i31);
                    int[] iArr9 = iArr8[i31];
                    f5.f fVar3 = fVar2;
                    int i33 = i32;
                    o4.s0 s0Var3 = s0Var2;
                    int i34 = 0;
                    while (i34 < a10.a) {
                        int i35 = i29;
                        if (f5.p.f(iArr9[i34], hVar.X)) {
                            s0Var = a10;
                            f5.f fVar4 = new f5.f(a10.d[i34], iArr9[i34]);
                            if (fVar3 != null) {
                                t0Var = t0Var3;
                                if (s8.p.a.c(fVar4.b, fVar3.b).c(fVar4.a, fVar3.a).e() <= 0) {
                                }
                            } else {
                                t0Var = t0Var3;
                            }
                            fVar3 = fVar4;
                            i33 = i34;
                            s0Var3 = s0Var;
                        } else {
                            s0Var = a10;
                            t0Var = t0Var3;
                        }
                        i34++;
                        i29 = i35;
                        a10 = s0Var;
                        t0Var3 = t0Var;
                    }
                    i31++;
                    s0Var2 = s0Var3;
                    i32 = i33;
                    fVar2 = fVar3;
                }
                i12 = i29;
                qVarArr[i12] = s0Var2 == null ? null : new f5.q(0, s0Var2, new int[]{i32});
            }
            i29 = i12 + 1;
            i26 = 2;
            i28 = 3;
        }
        Object obj2 = null;
        int i36 = sVar2.a;
        o4.t0[] t0VarArr2 = sVar2.c;
        HashMap hashMap = new HashMap();
        for (int i37 = 0; i37 < i36; i37++) {
            f5.p.c(t0VarArr2[i37], hVar, hashMap);
        }
        f5.p.c(sVar2.f, hVar, hashMap);
        for (int i38 = 0; i38 < i36; i38++) {
            f5.u uVar = (f5.u) hashMap.get(Integer.valueOf(sVar2.b[i38]));
            if (uVar != null) {
                o4.s0 s0Var4 = uVar.a;
                s8.v vVar = uVar.b;
                qVarArr[i38] = (vVar.isEmpty() || t0VarArr2[i38].b(s0Var4) == -1) ? null : new f5.q(0, s0Var4, y7.d(vVar));
            }
        }
        int i39 = sVar2.a;
        for (int i40 = 0; i40 < i39; i40++) {
            o4.t0 t0Var4 = sVar2.c[i40];
            Map map = (Map) hVar.b0.get(i40);
            if (map != null && map.containsKey(t0Var4)) {
                Map map2 = (Map) hVar.b0.get(i40);
                if (map2 != null) {
                }
                qVarArr[i40] = null;
            }
        }
        for (int i41 = 0; i41 < i25; i41++) {
            int i42 = sVar2.b[i41];
            if (hVar.c0.get(i41) || hVar.M.contains(Integer.valueOf(i42))) {
                qVarArr[i41] = null;
            }
        }
        cb.b bVar2 = pVar.f;
        g5.f fVar5 = pVar.b;
        h5.a.j(fVar5);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i43 = 0;
        while (i43 < qVarArr.length) {
            f5.q qVar2 = qVarArr[i43];
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
            i43++;
            obj2 = obj;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i44 = 0;
        while (true) {
            j10 = -1;
            if (i44 >= qVarArr.length) {
                break;
            }
            f5.q qVar3 = qVarArr[i44];
            if (qVar3 == null) {
                jArr[i44] = new long[0];
                sVar = sVar2;
            } else {
                int[] iArr10 = qVar3.b;
                jArr[i44] = new long[iArr10.length];
                int i45 = 0;
                while (i45 < iArr10.length) {
                    f5.s sVar4 = sVar2;
                    long j15 = qVar3.a.d[iArr10[i45]].n;
                    long[] jArr2 = jArr[i44];
                    if (j15 == -1) {
                        j15 = 0;
                    }
                    jArr2[i45] = j15;
                    i45++;
                    sVar2 = sVar4;
                }
                sVar = sVar2;
                Arrays.sort(jArr[i44]);
            }
            i44++;
            sVar2 = sVar;
        }
        f5.s sVar5 = sVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i46 = 0; i46 < length4; i46++) {
            long[] jArr4 = jArr[i46];
            jArr3[i46] = jArr4.length == 0 ? 0L : jArr4[0];
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
        int i47 = 0;
        while (i47 < length4) {
            long[] jArr5 = jArr[i47];
            if (jArr5.length <= 1) {
                fVar = fVar5;
                i11 = length4;
                j11 = j10;
                iArr = iArr11;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                j11 = j10;
                int i48 = 0;
                while (true) {
                    long[] jArr6 = jArr[i47];
                    fVar = fVar5;
                    double d = 0.0d;
                    if (i48 >= jArr6.length) {
                        break;
                    }
                    int i49 = length4;
                    int[] iArr12 = iArr11;
                    long j16 = jArr6[i48];
                    if (j16 != j11) {
                        d = Math.log(j16);
                    }
                    dArr[i48] = d;
                    i48++;
                    length4 = i49;
                    iArr11 = iArr12;
                    fVar5 = fVar;
                }
                int i50 = length4;
                iArr = iArr11;
                int i51 = length5 - 1;
                double d10 = dArr[i51] - dArr[0];
                int i52 = 0;
                while (i52 < i51) {
                    double d11 = dArr[i52];
                    i52++;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i52]) * 0.5d) - dArr[0]) / d10);
                    int i53 = i50;
                    Integer valueOf2 = Integer.valueOf(i47);
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
                    i50 = i53;
                    d10 = d12;
                }
                i11 = i50;
            }
            i47++;
            iArr11 = iArr;
            j10 = j11;
            length4 = i11;
            fVar5 = fVar;
        }
        g5.f fVar6 = fVar5;
        int[] iArr13 = iArr11;
        l7.m mVar = e0Var.b;
        int i54 = 4;
        if (mVar == null) {
            mVar = new l7.m(4, e0Var);
            e0Var.b = mVar;
        }
        s8.v t6 = s8.v.t(mVar);
        for (int i55 = 0; i55 < t6.size(); i55++) {
            int intValue = ((Integer) t6.get(i55)).intValue();
            int i56 = iArr13[intValue] + 1;
            iArr13[intValue] = i56;
            jArr3[intValue] = jArr[intValue][i56];
            f5.b.w(arrayList, jArr3);
        }
        for (int i57 = 0; i57 < qVarArr.length; i57++) {
            if (arrayList.get(i57) != null) {
                jArr3[i57] = jArr3[i57] * 2;
            }
        }
        f5.b.w(arrayList, jArr3);
        s8.l.c(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        int i58 = 0;
        int i59 = 0;
        boolean z15 = false;
        while (i58 < arrayList.size()) {
            s8.s sVar6 = (s8.s) arrayList.get(i58);
            s8.i0 i60 = sVar6 == null ? s8.i0.e : sVar6.i();
            i60.getClass();
            int i61 = i59 + 1;
            if (objArr2.length < i61) {
                objArr = Arrays.copyOf(objArr2, com.google.android.gms.common.api.internal.w.g(objArr2.length, i61));
            } else if (z15) {
                objArr = (Object[]) objArr2.clone();
            } else {
                objArr2[i59] = i60;
                i58++;
                i59++;
            }
            objArr2 = objArr;
            z15 = false;
            objArr2[i59] = i60;
            i58++;
            i59++;
        }
        s8.i0 s6 = s8.v.s(i59, objArr2);
        f5.c[] cVarArr = new f5.c[qVarArr.length];
        for (int i62 = 0; i62 < qVarArr.length; i62++) {
            f5.q qVar4 = qVarArr[i62];
            if (qVar4 != null) {
                int[] iArr14 = qVar4.b;
                if (iArr14.length != 0) {
                    if (iArr14.length == 1) {
                        bVar = new f5.r(qVar4.a, new int[]{iArr14[0]});
                    } else {
                        long j17 = 25000;
                        bVar = new f5.b(qVar4.a, iArr14, fVar6, 10000, j17, j17, (s8.v) s6.get(i62));
                    }
                    cVarArr[i62] = bVar;
                }
            }
        }
        g2[] g2VarArr = new g2[i25];
        int i63 = 0;
        while (i63 < i25) {
            f5.s sVar7 = sVar5;
            g2VarArr[i63] = (hVar.c0.get(i63) || hVar.M.contains(Integer.valueOf(sVar7.b[i63])) || (sVar7.b[i63] != -2 && cVarArr[i63] == null)) ? null : g2.b;
            i63++;
            sVar5 = sVar7;
        }
        f5.s sVar8 = sVar5;
        if (hVar.Y) {
            int i64 = -1;
            int i65 = -1;
            for (int i66 = 0; i66 < sVar8.a; i66++) {
                int i67 = sVar8.b[i66];
                f5.c cVar = cVarArr[i66];
                if ((i67 == 1 || i67 == 2) && cVar != null) {
                    int[][] iArr15 = iArr4[i66];
                    int b10 = sVar8.c[i66].b(cVar.l());
                    int i68 = 0;
                    while (true) {
                        if (i68 < cVar.p()) {
                            if ((iArr15[b10][cVar.f(i68)] & 32) != 32) {
                                break;
                            }
                            i68++;
                        } else if (i67 == 1) {
                            i10 = -1;
                            if (i65 != -1) {
                                z11 = false;
                                break;
                            }
                            i65 = i66;
                        } else {
                            i10 = -1;
                            if (i64 != -1) {
                                z11 = false;
                                break;
                            }
                            i64 = i66;
                        }
                    }
                }
            }
            i10 = -1;
            z11 = true;
            if (((i65 == i10 || i64 == i10) ? false : true) & z11) {
                g2 g2Var = new g2(true);
                g2VarArr[i65] = g2Var;
                g2VarArr[i64] = g2Var;
            }
        }
        Pair create = Pair.create(g2VarArr, cVarArr);
        f5.c[] cVarArr2 = (f5.c[]) create.second;
        List[] listArr = new List[cVarArr2.length];
        for (int i69 = 0; i69 < cVarArr2.length; i69++) {
            f5.c cVar2 = cVarArr2[i69];
            if (cVar2 != null) {
                i0Var = s8.v.x(cVar2);
            } else {
                s8.t tVar6 = s8.v.b;
                i0Var = s8.i0.e;
            }
            listArr[i69] = i0Var;
        }
        s8.s sVar9 = new s8.s();
        int i70 = 0;
        while (true) {
            int i71 = sVar8.a;
            o4.t0[] t0VarArr3 = sVar8.c;
            if (i70 >= i71) {
                break;
            }
            o4.t0 t0Var5 = t0VarArr3[i70];
            List list2 = listArr[i70];
            int i72 = 0;
            while (i72 < t0Var5.a) {
                o4.s0 a11 = t0Var5.a(i72);
                int i73 = t0VarArr3[i70].a(i72).a;
                int[] iArr16 = new int[i73];
                int i74 = 0;
                for (int i75 = 0; i75 < i73; i75++) {
                    if ((sVar8.e[i70][i72][i75] & 7) == i54) {
                        iArr16[i74] = i75;
                        i74++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr16, i74);
                List[] listArr2 = listArr;
                String str2 = null;
                int i76 = 0;
                boolean z16 = false;
                int i77 = 0;
                int i78 = 16;
                while (i76 < copyOf.length) {
                    String str3 = t0VarArr3[i70].a(i72).d[copyOf[i76]].C;
                    int i79 = i77 + 1;
                    if (i77 == 0) {
                        str2 = str3;
                    } else {
                        z16 = (!h5.d0.a(str2, str3)) | z16;
                    }
                    i78 = Math.min(i78, sVar8.e[i70][i72][i76] & 24);
                    i76++;
                    i77 = i79;
                }
                if (z16) {
                    i78 = Math.min(i78, sVar8.d[i70]);
                }
                boolean z17 = i78 != 0;
                int i80 = a11.a;
                int[] iArr17 = new int[i80];
                boolean[] zArr = new boolean[i80];
                for (int i81 = 0; i81 < a11.a; i81++) {
                    iArr17[i81] = sVar8.e[i70][i72][i81] & 7;
                    int i82 = 0;
                    while (true) {
                        if (i82 >= list2.size()) {
                            z10 = false;
                            break;
                        }
                        f5.c cVar3 = (f5.c) list2.get(i82);
                        if (cVar3.l().equals(a11) && cVar3.m(i81) != -1) {
                            z10 = true;
                            break;
                        }
                        i82++;
                    }
                    zArr[i81] = z10;
                }
                sVar9.b(new p2(a11, z17, iArr17, zArr));
                i72++;
                listArr = listArr2;
                i54 = 4;
            }
            i70++;
            i54 = 4;
        }
        o4.t0 t0Var6 = sVar8.f;
        for (int i83 = 0; i83 < t0Var6.a; i83++) {
            o4.s0 a12 = t0Var6.a(i83);
            int[] iArr18 = new int[a12.a];
            Arrays.fill(iArr18, 0);
            sVar9.b(new p2(a12, false, iArr18, new boolean[a12.a]));
        }
        f5.x xVar = new f5.x((g2[]) create.first, (f5.c[]) create.second, new q2(sVar9.i()), sVar8);
        for (f5.c cVar4 : xVar.c) {
            if (cVar4 != null) {
                cVar4.s(f10);
            }
        }
        return xVar;
    }
}
