package j3;

import android.os.Looper;
import android.util.Pair;
import i7.p7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i1 {
    public final Object a;
    public final Object b;
    public final l4.c1[] c;
    public boolean d;
    public boolean e;
    public j1 f;
    public boolean g;
    public final boolean[] h;
    public final h2[] i;
    public final d5.u j;
    public final s1 k;
    public i1 l;
    public l4.k1 m;
    public d5.y n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l4.d] */
    public i1(h2[] h2VarArr, long j10, d5.u uVar, com.google.android.exoplayer2.upstream.r rVar, s1 s1Var, j1 j1Var, d5.y yVar) {
        this.i = h2VarArr;
        this.o = j10;
        this.j = uVar;
        this.k = s1Var;
        l4.c0 c0Var = j1Var.a;
        this.b = c0Var.a;
        this.f = j1Var;
        this.m = l4.k1.d;
        this.n = yVar;
        this.c = new l4.c1[h2VarArr.length];
        this.h = new boolean[h2VarArr.length];
        long j11 = j1Var.b;
        long j12 = j1Var.d;
        s1Var.getClass();
        Object obj = c0Var.a;
        int i10 = a.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        l4.c0 b10 = c0Var.b(pair.second);
        r1 r1Var = (r1) s1Var.d.get(obj2);
        r1Var.getClass();
        s1Var.g.add(r1Var);
        q1 q1Var = (q1) s1Var.f.get(r1Var);
        if (q1Var != null) {
            q1Var.a.e(q1Var.b);
        }
        r1Var.c.add(b10);
        l4.t b11 = r1Var.a.b(b10, rVar, j11);
        s1Var.c.put(b11, r1Var);
        s1Var.c();
        this.a = j12 != -9223372036854775807L ? new l4.d(b11, true, 0L, j12) : b11;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, l4.z] */
    public final long a(d5.y yVar, long j10, boolean z10, boolean[] zArr) {
        h2[] h2VarArr;
        l4.c1[] c1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= yVar.a) {
                break;
            }
            if (z10 || !yVar.a(this.n, i10)) {
                z11 = false;
            }
            this.h[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            h2VarArr = this.i;
            int length = h2VarArr.length;
            c1VarArr = this.c;
            if (i11 >= length) {
                break;
            }
            if (h2VarArr[i11].getTrackType() == -2) {
                c1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.n = yVar;
        c();
        long A = this.a.A(yVar.c, this.h, this.c, zArr, j10);
        for (int i12 = 0; i12 < h2VarArr.length; i12++) {
            if (h2VarArr[i12].getTrackType() == -2 && this.n.b(i12)) {
                c1VarArr[i12] = new l4.m();
            }
        }
        this.e = false;
        for (int i13 = 0; i13 < c1VarArr.length; i13++) {
            if (c1VarArr[i13] != null) {
                f5.a.i(yVar.b(i13));
                if (h2VarArr[i13].getTrackType() != -2) {
                    this.e = true;
                }
            } else {
                f5.a.i(yVar.c[i13] == null);
            }
        }
        return A;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            d5.y yVar = this.n;
            if (i10 >= yVar.a) {
                return;
            }
            boolean b10 = yVar.b(i10);
            d5.r rVar = this.n.c[i10];
            if (b10 && rVar != null) {
                rVar.k();
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
            d5.y yVar = this.n;
            if (i10 >= yVar.a) {
                return;
            }
            boolean b10 = yVar.b(i10);
            d5.r rVar = this.n.c[i10];
            if (b10 && rVar != null) {
                rVar.h();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l4.e1] */
    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long L = this.e ? this.a.L() : Long.MIN_VALUE;
        return L == Long.MIN_VALUE ? this.f.e : L;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l4.z] */
    public final void f() {
        b();
        ?? r02 = this.a;
        try {
            boolean z10 = r02 instanceof l4.d;
            s1 s1Var = this.k;
            if (z10) {
                s1Var.f(((l4.d) r02).a);
            } else {
                s1Var.f(r02);
            }
        } catch (RuntimeException e10) {
            f5.a.p("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final d5.y g(float f9, r2 r2Var) {
        d5.h hVar;
        boolean z10;
        String str;
        long j10;
        boolean z11;
        q8.l0 l0Var;
        int i10;
        boolean z12;
        d5.r bVar;
        long j11;
        com.google.android.exoplayer2.upstream.f fVar;
        int[] iArr;
        int i11;
        d5.t tVar;
        Object obj;
        int i12;
        l4.j1 j1Var;
        int i13;
        d5.k kVar;
        int[] iArr2;
        d5.u uVar = this.j;
        h2[] h2VarArr = this.i;
        l4.k1 k1Var = this.m;
        uVar.getClass();
        int[] iArr3 = new int[h2VarArr.length + 1];
        int length = h2VarArr.length + 1;
        l4.j1[][] j1VarArr = new l4.j1[length][];
        int[][][] iArr4 = new int[h2VarArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = k1Var.a;
            j1VarArr[i14] = new l4.j1[i15];
            iArr4[i14] = new int[i15][];
        }
        int length2 = h2VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr5[i16] = h2VarArr[i16].supportsMixedMimeTypeAdaptation();
        }
        int i17 = 0;
        while (i17 < k1Var.a) {
            l4.j1 a2 = k1Var.a(i17);
            boolean z13 = a2.c == 5;
            int length3 = h2VarArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z14 = true;
            while (i19 < h2VarArr.length) {
                h2 h2Var = h2VarArr[i19];
                d5.u uVar2 = uVar;
                int i20 = 0;
                for (int i21 = 0; i21 < a2.a; i21++) {
                    i20 = Math.max(i20, h2Var.supportsFormat(a2.d[i21]) & 7);
                }
                boolean z15 = iArr3[i19] == 0;
                if (i20 > i18 || (i20 == i18 && z13 && !z14 && z15)) {
                    i18 = i20;
                    z14 = z15;
                    length3 = i19;
                }
                i19++;
                uVar = uVar2;
            }
            d5.u uVar3 = uVar;
            if (length3 == h2VarArr.length) {
                iArr2 = new int[a2.a];
            } else {
                h2 h2Var2 = h2VarArr[length3];
                int[] iArr6 = new int[a2.a];
                for (int i22 = 0; i22 < a2.a; i22++) {
                    iArr6[i22] = h2Var2.supportsFormat(a2.d[i22]);
                }
                iArr2 = iArr6;
            }
            int i23 = iArr3[length3];
            j1VarArr[length3][i23] = a2;
            iArr4[length3][i23] = iArr2;
            iArr3[length3] = i23 + 1;
            i17++;
            uVar = uVar3;
        }
        d5.u uVar4 = uVar;
        l4.k1[] k1VarArr = new l4.k1[h2VarArr.length];
        String[] strArr = new String[h2VarArr.length];
        int[] iArr7 = new int[h2VarArr.length];
        for (int i24 = 0; i24 < h2VarArr.length; i24++) {
            int i25 = iArr3[i24];
            k1VarArr[i24] = new l4.k1((l4.j1[]) f5.d0.J(i25, j1VarArr[i24]));
            iArr4[i24] = (int[][]) f5.d0.J(i25, iArr4[i24]);
            strArr[i24] = h2VarArr[i24].getName();
            iArr7[i24] = h2VarArr[i24].getTrackType();
        }
        d5.t tVar2 = new d5.t(iArr7, k1VarArr, iArr5, iArr4, new l4.k1((l4.j1[]) f5.d0.J(iArr3[h2VarArr.length], j1VarArr[h2VarArr.length])));
        d5.p pVar = (d5.p) uVar4;
        synchronized (pVar.d) {
            try {
                hVar = pVar.h;
                if (hVar.V && f5.d0.a >= 32 && (kVar = pVar.i) != null) {
                    Looper myLooper = Looper.myLooper();
                    f5.a.j(myLooper);
                    kVar.b(pVar, myLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i26 = tVar2.a;
        d5.q[] qVarArr = new d5.q[i26];
        int i27 = 8;
        int i28 = 2;
        Pair i29 = d5.p.i(2, tVar2, iArr4, new a9.s(7, hVar, iArr5), new c5.e(8));
        if (i29 != null) {
            qVarArr[((Integer) i29.second).intValue()] = (d5.q) i29.first;
        }
        int i30 = 0;
        while (true) {
            if (i30 >= tVar2.a) {
                z10 = false;
                break;
            }
            if (2 == iArr7[i30] && k1VarArr[i30].a > 0) {
                z10 = true;
                break;
            }
            i30++;
        }
        Pair i31 = d5.p.i(1, tVar2, iArr4, new com.google.firebase.messaging.i(pVar, hVar, z10, 1), new c5.e(9));
        if (i31 != null) {
            qVarArr[((Integer) i31.second).intValue()] = (d5.q) i31.first;
        }
        if (i31 == null) {
            str = null;
        } else {
            d5.q qVar = (d5.q) i31.first;
            str = qVar.a.d[qVar.b[0]].c;
        }
        int i32 = 3;
        Pair i33 = d5.p.i(3, tVar2, iArr4, new a9.s(i27, hVar, str), new c5.e(10));
        if (i33 != null) {
            qVarArr[((Integer) i33.second).intValue()] = (d5.q) i33.first;
        }
        int i34 = 0;
        while (i34 < i26) {
            int i35 = iArr7[i34];
            if (i35 == i28 || i35 == 1 || i35 == i32) {
                i12 = i34;
            } else {
                l4.k1 k1Var2 = k1VarArr[i34];
                int[][] iArr8 = iArr4[i34];
                l4.j1 j1Var2 = null;
                int i36 = 0;
                int i37 = 0;
                d5.f fVar2 = null;
                while (i36 < k1Var2.a) {
                    l4.j1 a10 = k1Var2.a(i36);
                    int[] iArr9 = iArr8[i36];
                    d5.f fVar3 = fVar2;
                    int i38 = i37;
                    l4.j1 j1Var3 = j1Var2;
                    int i39 = 0;
                    while (i39 < a10.a) {
                        int i40 = i34;
                        if (d5.p.f(iArr9[i39], hVar.W)) {
                            j1Var = a10;
                            d5.f fVar4 = new d5.f(a10.d[i39], iArr9[i39]);
                            if (fVar3 != null) {
                                i13 = i39;
                                if (q8.t.a.c(fVar4.b, fVar3.b).c(fVar4.a, fVar3.a).e() <= 0) {
                                }
                            } else {
                                i13 = i39;
                            }
                            fVar3 = fVar4;
                            j1Var3 = j1Var;
                            i38 = i13;
                        } else {
                            j1Var = a10;
                            i13 = i39;
                        }
                        i39 = i13 + 1;
                        i34 = i40;
                        a10 = j1Var;
                    }
                    i36++;
                    j1Var2 = j1Var3;
                    i37 = i38;
                    fVar2 = fVar3;
                }
                i12 = i34;
                qVarArr[i12] = j1Var2 == null ? null : new d5.q(0, j1Var2, new int[]{i37});
            }
            i34 = i12 + 1;
            i32 = 3;
            i28 = 2;
        }
        Object obj2 = null;
        int i41 = tVar2.a;
        l4.k1[] k1VarArr2 = tVar2.c;
        HashMap hashMap = new HashMap();
        for (int i42 = 0; i42 < i41; i42++) {
            d5.p.c(k1VarArr2[i42], hVar, hashMap);
        }
        d5.p.c(tVar2.f, hVar, hashMap);
        for (int i43 = 0; i43 < i41; i43++) {
            d5.v vVar = (d5.v) hashMap.get(Integer.valueOf(tVar2.b[i43]));
            if (vVar != null) {
                l4.j1 j1Var4 = vVar.a;
                q8.z zVar = vVar.b;
                qVarArr[i43] = (zVar.isEmpty() || k1VarArr2[i43].b(j1Var4) == -1) ? null : new d5.q(0, j1Var4, p7.e(zVar));
            }
        }
        int i44 = tVar2.a;
        for (int i45 = 0; i45 < i44; i45++) {
            l4.k1 k1Var3 = tVar2.c[i45];
            Map map = (Map) hVar.Z.get(i45);
            if (map != null && map.containsKey(k1Var3)) {
                Map map2 = (Map) hVar.Z.get(i45);
                if (map2 != null) {
                }
                qVarArr[i45] = null;
            }
        }
        for (int i46 = 0; i46 < i26; i46++) {
            int i47 = tVar2.b[i46];
            if (hVar.a0.get(i46) || hVar.L.contains(Integer.valueOf(i47))) {
                qVarArr[i46] = null;
            }
        }
        ab.b bVar2 = pVar.f;
        com.google.android.exoplayer2.upstream.f fVar5 = pVar.b;
        f5.a.j(fVar5);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i48 = 0;
        while (i48 < qVarArr.length) {
            d5.q qVar2 = qVarArr[i48];
            if (qVar2 == null || qVar2.b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                q8.x xVar = q8.z.b;
                q8.w wVar = new q8.w();
                wVar.a(new d5.a(0L, 0L));
                arrayList.add(wVar);
                obj = obj2;
            }
            i48++;
            obj2 = obj;
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i49 = 0;
        while (true) {
            j10 = -1;
            if (i49 >= qVarArr.length) {
                break;
            }
            d5.q qVar3 = qVarArr[i49];
            if (qVar3 == null) {
                jArr[i49] = new long[0];
                tVar = tVar2;
            } else {
                int[] iArr10 = qVar3.b;
                jArr[i49] = new long[iArr10.length];
                int i50 = 0;
                while (i50 < iArr10.length) {
                    d5.t tVar3 = tVar2;
                    long j12 = qVar3.a.d[iArr10[i50]].n;
                    long[] jArr2 = jArr[i49];
                    if (j12 == -1) {
                        j12 = 0;
                    }
                    jArr2[i50] = j12;
                    i50++;
                    tVar2 = tVar3;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i49]);
            }
            i49++;
            tVar2 = tVar;
        }
        d5.t tVar4 = tVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i51 = 0; i51 < length4; i51++) {
            long[] jArr4 = jArr[i51];
            jArr3[i51] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        d5.b.v(arrayList, jArr3);
        q8.l.a(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(q8.j0.b);
        q8.g0 g0Var = new q8.g0();
        q8.h0 h0Var = new q8.h0();
        if (!treeMap.isEmpty()) {
            throw new IllegalArgumentException();
        }
        h0Var.d = treeMap;
        h0Var.f = g0Var;
        int i52 = 0;
        while (i52 < length4) {
            long[] jArr5 = jArr[i52];
            if (jArr5.length <= 1) {
                fVar = fVar5;
                i11 = length4;
                j11 = j10;
                iArr = iArr11;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                j11 = j10;
                int i53 = 0;
                while (true) {
                    long[] jArr6 = jArr[i52];
                    fVar = fVar5;
                    double d = 0.0d;
                    if (i53 >= jArr6.length) {
                        break;
                    }
                    int i54 = length4;
                    int[] iArr12 = iArr11;
                    long j13 = jArr6[i53];
                    if (j13 != j11) {
                        d = Math.log(j13);
                    }
                    dArr[i53] = d;
                    i53++;
                    length4 = i54;
                    iArr11 = iArr12;
                    fVar5 = fVar;
                }
                int i55 = length4;
                iArr = iArr11;
                int i56 = length5 - 1;
                double d10 = dArr[i56] - dArr[0];
                int i57 = 0;
                while (i57 < i56) {
                    double d11 = dArr[i57];
                    i57++;
                    Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i57]) * 0.5d) - dArr[0]) / d10);
                    int i58 = i55;
                    Integer valueOf2 = Integer.valueOf(i52);
                    double d12 = d10;
                    Map map3 = h0Var.d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        List list = (List) h0Var.f.get();
                        if (!list.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        h0Var.e++;
                        map3.put(valueOf, list);
                    } else if (collection.add(valueOf2)) {
                        h0Var.e++;
                    }
                    i55 = i58;
                    d10 = d12;
                }
                i11 = i55;
            }
            i52++;
            iArr11 = iArr;
            j10 = j11;
            length4 = i11;
            fVar5 = fVar;
        }
        com.google.android.exoplayer2.upstream.f fVar6 = fVar5;
        int[] iArr13 = iArr11;
        j7.m mVar = h0Var.b;
        int i59 = 4;
        if (mVar == null) {
            mVar = new j7.m(4, h0Var);
            h0Var.b = mVar;
        }
        q8.z u10 = q8.z.u(mVar);
        for (int i60 = 0; i60 < u10.size(); i60++) {
            int intValue = ((Integer) u10.get(i60)).intValue();
            int i61 = iArr13[intValue] + 1;
            iArr13[intValue] = i61;
            jArr3[intValue] = jArr[intValue][i61];
            d5.b.v(arrayList, jArr3);
        }
        for (int i62 = 0; i62 < qVarArr.length; i62++) {
            if (arrayList.get(i62) != null) {
                jArr3[i62] = jArr3[i62] * 2;
            }
        }
        d5.b.v(arrayList, jArr3);
        q8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i63 = 0;
        int i64 = 0;
        while (i63 < arrayList.size()) {
            q8.w wVar2 = (q8.w) arrayList.get(i63);
            q8.l0 c3 = wVar2 == null ? q8.l0.e : wVar2.c();
            c3.getClass();
            int i65 = i64 + 1;
            if (objArr.length < i65) {
                objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i65));
            }
            objArr[i64] = c3;
            i63++;
            i64 = i65;
        }
        q8.l0 s10 = q8.z.s(i64, objArr);
        d5.r[] rVarArr = new d5.r[qVarArr.length];
        for (int i66 = 0; i66 < qVarArr.length; i66++) {
            d5.q qVar4 = qVarArr[i66];
            if (qVar4 != null) {
                int[] iArr14 = qVar4.b;
                if (iArr14.length != 0) {
                    if (iArr14.length == 1) {
                        bVar = new d5.s(qVar4.a, new int[]{iArr14[0]});
                    } else {
                        long j14 = 25000;
                        bVar = new d5.b(qVar4.a, iArr14, fVar6, 10000, j14, j14, (q8.z) s10.get(i66));
                    }
                    rVarArr[i66] = bVar;
                }
            }
        }
        i2[] i2VarArr = new i2[i26];
        int i67 = 0;
        while (i67 < i26) {
            d5.t tVar5 = tVar4;
            i2VarArr[i67] = (hVar.a0.get(i67) || hVar.L.contains(Integer.valueOf(tVar5.b[i67])) || (tVar5.b[i67] != -2 && rVarArr[i67] == null)) ? null : i2.b;
            i67++;
            tVar4 = tVar5;
        }
        d5.t tVar6 = tVar4;
        if (hVar.X) {
            int i68 = -1;
            int i69 = -1;
            for (int i70 = 0; i70 < tVar6.a; i70++) {
                int i71 = tVar6.b[i70];
                d5.r rVar = rVarArr[i70];
                if ((i71 == 1 || i71 == 2) && rVar != null) {
                    int[][] iArr15 = iArr4[i70];
                    int b10 = tVar6.c[i70].b(rVar.a());
                    int i72 = 0;
                    while (true) {
                        if (i72 < rVar.length()) {
                            if ((iArr15[b10][rVar.i(i72)] & 32) != 32) {
                                break;
                            }
                            i72++;
                        } else if (i71 == 1) {
                            i10 = -1;
                            if (i69 != -1) {
                                z12 = false;
                                break;
                            }
                            i69 = i70;
                        } else {
                            i10 = -1;
                            if (i68 != -1) {
                                z12 = false;
                                break;
                            }
                            i68 = i70;
                        }
                    }
                }
            }
            i10 = -1;
            z12 = true;
            if (((i69 == i10 || i68 == i10) ? false : true) & z12) {
                i2 i2Var = new i2(true);
                i2VarArr[i69] = i2Var;
                i2VarArr[i68] = i2Var;
            }
        }
        Pair create = Pair.create(i2VarArr, rVarArr);
        d5.r[] rVarArr2 = (d5.r[]) create.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i73 = 0; i73 < rVarArr2.length; i73++) {
            d5.r rVar2 = rVarArr2[i73];
            if (rVar2 != null) {
                l0Var = q8.z.y(rVar2);
            } else {
                q8.x xVar2 = q8.z.b;
                l0Var = q8.l0.e;
            }
            listArr[i73] = l0Var;
        }
        q8.w wVar3 = new q8.w();
        int i74 = 0;
        while (true) {
            int i75 = tVar6.a;
            l4.k1[] k1VarArr3 = tVar6.c;
            if (i74 >= i75) {
                break;
            }
            l4.k1 k1Var4 = k1VarArr3[i74];
            List list2 = listArr[i74];
            int i76 = 0;
            while (i76 < k1Var4.a) {
                l4.j1 a11 = k1Var4.a(i76);
                int i77 = k1VarArr3[i74].a(i76).a;
                int[] iArr16 = new int[i77];
                int i78 = 0;
                for (int i79 = 0; i79 < i77; i79++) {
                    if ((tVar6.e[i74][i76][i79] & 7) == i59) {
                        iArr16[i78] = i79;
                        i78++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr16, i78);
                List[] listArr2 = listArr;
                String str2 = null;
                int i80 = 0;
                boolean z16 = false;
                int i81 = 0;
                int i82 = 16;
                while (i80 < copyOf.length) {
                    String str3 = k1VarArr3[i74].a(i76).d[copyOf[i80]].B;
                    int i83 = i81 + 1;
                    if (i81 == 0) {
                        str2 = str3;
                    } else {
                        z16 = (!f5.d0.a(str2, str3)) | z16;
                    }
                    i82 = Math.min(i82, tVar6.e[i74][i76][i80] & 24);
                    i80++;
                    i81 = i83;
                }
                if (z16) {
                    i82 = Math.min(i82, tVar6.d[i74]);
                }
                boolean z17 = i82 != 0;
                int i84 = a11.a;
                int[] iArr17 = new int[i84];
                boolean[] zArr = new boolean[i84];
                for (int i85 = 0; i85 < a11.a; i85++) {
                    iArr17[i85] = tVar6.e[i74][i76][i85] & 7;
                    int i86 = 0;
                    while (true) {
                        if (i86 >= list2.size()) {
                            z11 = false;
                            break;
                        }
                        d5.r rVar3 = (d5.r) list2.get(i86);
                        if (rVar3.a().equals(a11) && rVar3.u(i85) != -1) {
                            z11 = true;
                            break;
                        }
                        i86++;
                    }
                    zArr[i85] = z11;
                }
                wVar3.a(new s2(a11, z17, iArr17, zArr));
                i76++;
                listArr = listArr2;
                i59 = 4;
            }
            i74++;
            i59 = 4;
        }
        l4.k1 k1Var5 = tVar6.f;
        for (int i87 = 0; i87 < k1Var5.a; i87++) {
            l4.j1 a12 = k1Var5.a(i87);
            int[] iArr18 = new int[a12.a];
            Arrays.fill(iArr18, 0);
            wVar3.a(new s2(a12, false, iArr18, new boolean[a12.a]));
        }
        d5.y yVar = new d5.y((i2[]) create.first, (d5.r[]) create.second, new t2(wVar3.c()), tVar6);
        for (d5.r rVar4 : yVar.c) {
            if (rVar4 != null) {
                rVar4.q(f9);
            }
        }
        return yVar;
    }
}
