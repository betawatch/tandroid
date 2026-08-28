package h3;

import android.os.Looper;
import android.util.Pair;
import g7.r6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i1 {
    public final Object a;
    public final Object b;
    public final j4.b1[] c;
    public boolean d;
    public boolean e;
    public j1 f;
    public boolean g;
    public final boolean[] h;
    public final h2[] i;
    public final b5.w j;
    public final s1 k;
    public i1 l;
    public j4.j1 m;
    public b5.a0 n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j4.e] */
    public i1(h2[] h2VarArr, long j10, b5.w wVar, com.google.android.exoplayer2.upstream.r rVar, s1 s1Var, j1 j1Var, b5.a0 a0Var) {
        this.i = h2VarArr;
        this.o = j10;
        this.j = wVar;
        this.k = s1Var;
        j4.d0 d0Var = j1Var.a;
        this.b = d0Var.a;
        this.f = j1Var;
        this.m = j4.j1.d;
        this.n = a0Var;
        this.c = new j4.b1[h2VarArr.length];
        this.h = new boolean[h2VarArr.length];
        long j11 = j1Var.b;
        long j12 = j1Var.d;
        s1Var.getClass();
        Object obj = d0Var.a;
        int i9 = a.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        j4.d0 b10 = d0Var.b(pair.second);
        r1 r1Var = (r1) s1Var.d.get(obj2);
        r1Var.getClass();
        s1Var.g.add(r1Var);
        q1 q1Var = (q1) s1Var.f.get(r1Var);
        if (q1Var != null) {
            q1Var.a.e(q1Var.b);
        }
        r1Var.c.add(b10);
        j4.u b11 = r1Var.a.b(b10, rVar, j11);
        s1Var.c.put(b11, r1Var);
        s1Var.c();
        this.a = j12 != -9223372036854775807L ? new j4.e(b11, true, 0L, j12) : b11;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [j4.a0, java.lang.Object] */
    public final long a(b5.a0 a0Var, long j10, boolean z10, boolean[] zArr) {
        h2[] h2VarArr;
        j4.b1[] b1VarArr;
        int i9 = 0;
        while (true) {
            boolean z11 = true;
            if (i9 >= a0Var.a) {
                break;
            }
            if (z10 || !a0Var.a(this.n, i9)) {
                z11 = false;
            }
            this.h[i9] = z11;
            i9++;
        }
        int i10 = 0;
        while (true) {
            h2VarArr = this.i;
            int length = h2VarArr.length;
            b1VarArr = this.c;
            if (i10 >= length) {
                break;
            }
            if (h2VarArr[i10].getTrackType() == -2) {
                b1VarArr[i10] = null;
            }
            i10++;
        }
        b();
        this.n = a0Var;
        c();
        long x10 = this.a.x(a0Var.c, this.h, this.c, zArr, j10);
        for (int i11 = 0; i11 < h2VarArr.length; i11++) {
            if (h2VarArr[i11].getTrackType() == -2 && this.n.b(i11)) {
                b1VarArr[i11] = new j4.n();
            }
        }
        this.e = false;
        for (int i12 = 0; i12 < b1VarArr.length; i12++) {
            if (b1VarArr[i12] != null) {
                d5.a.i(a0Var.b(i12));
                if (h2VarArr[i12].getTrackType() != -2) {
                    this.e = true;
                }
            } else {
                d5.a.i(a0Var.c[i12] == null);
            }
        }
        return x10;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i9 = 0;
        while (true) {
            b5.a0 a0Var = this.n;
            if (i9 >= a0Var.a) {
                return;
            }
            boolean b10 = a0Var.b(i9);
            b5.t tVar = this.n.c[i9];
            if (b10 && tVar != null) {
                tVar.l();
            }
            i9++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i9 = 0;
        while (true) {
            b5.a0 a0Var = this.n;
            if (i9 >= a0Var.a) {
                return;
            }
            boolean b10 = a0Var.b(i9);
            b5.t tVar = this.n.c[i9];
            if (b10 && tVar != null) {
                tVar.i();
            }
            i9++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [j4.d1, java.lang.Object] */
    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long v = this.e ? this.a.v() : Long.MIN_VALUE;
        return v == Long.MIN_VALUE ? this.f.e : v;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j4.a0, java.lang.Object] */
    public final void f() {
        b();
        ?? r02 = this.a;
        try {
            boolean z10 = r02 instanceof j4.e;
            s1 s1Var = this.k;
            if (z10) {
                s1Var.f(((j4.e) r02).a);
            } else {
                s1Var.f(r02);
            }
        } catch (RuntimeException e10) {
            d5.a.p("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final b5.a0 g(float f10, r2 r2Var) {
        b5.j jVar;
        boolean z10;
        String str;
        long j10;
        boolean z11;
        o8.l0 l0Var;
        int i9;
        boolean z12;
        b5.t bVar;
        long j11;
        com.google.android.exoplayer2.upstream.f fVar;
        int[] iArr;
        int i10;
        b5.v vVar;
        Object obj;
        int i11;
        j4.i1 i1Var;
        int i12;
        b5.m mVar;
        int[] iArr2;
        b5.w wVar = this.j;
        h2[] h2VarArr = this.i;
        j4.j1 j1Var = this.m;
        wVar.getClass();
        int[] iArr3 = new int[h2VarArr.length + 1];
        int length = h2VarArr.length + 1;
        j4.i1[][] i1VarArr = new j4.i1[length][];
        int[][][] iArr4 = new int[h2VarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = j1Var.a;
            i1VarArr[i13] = new j4.i1[i14];
            iArr4[i13] = new int[i14][];
        }
        int length2 = h2VarArr.length;
        int[] iArr5 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr5[i15] = h2VarArr[i15].supportsMixedMimeTypeAdaptation();
        }
        int i16 = 0;
        while (i16 < j1Var.a) {
            j4.i1 a2 = j1Var.a(i16);
            boolean z13 = a2.c == 5;
            int length3 = h2VarArr.length;
            int i17 = 0;
            int i18 = 0;
            boolean z14 = true;
            while (i18 < h2VarArr.length) {
                h2 h2Var = h2VarArr[i18];
                b5.w wVar2 = wVar;
                int i19 = 0;
                for (int i20 = 0; i20 < a2.a; i20++) {
                    i19 = Math.max(i19, h2Var.supportsFormat(a2.d[i20]) & 7);
                }
                boolean z15 = iArr3[i18] == 0;
                if (i19 > i17 || (i19 == i17 && z13 && !z14 && z15)) {
                    i17 = i19;
                    z14 = z15;
                    length3 = i18;
                }
                i18++;
                wVar = wVar2;
            }
            b5.w wVar3 = wVar;
            if (length3 == h2VarArr.length) {
                iArr2 = new int[a2.a];
            } else {
                h2 h2Var2 = h2VarArr[length3];
                int[] iArr6 = new int[a2.a];
                for (int i21 = 0; i21 < a2.a; i21++) {
                    iArr6[i21] = h2Var2.supportsFormat(a2.d[i21]);
                }
                iArr2 = iArr6;
            }
            int i22 = iArr3[length3];
            i1VarArr[length3][i22] = a2;
            iArr4[length3][i22] = iArr2;
            iArr3[length3] = i22 + 1;
            i16++;
            wVar = wVar3;
        }
        b5.w wVar4 = wVar;
        j4.j1[] j1VarArr = new j4.j1[h2VarArr.length];
        String[] strArr = new String[h2VarArr.length];
        int[] iArr7 = new int[h2VarArr.length];
        for (int i23 = 0; i23 < h2VarArr.length; i23++) {
            int i24 = iArr3[i23];
            j1VarArr[i23] = new j4.j1((j4.i1[]) d5.f0.J(i24, i1VarArr[i23]));
            iArr4[i23] = (int[][]) d5.f0.J(i24, iArr4[i23]);
            strArr[i23] = h2VarArr[i23].getName();
            iArr7[i23] = h2VarArr[i23].getTrackType();
        }
        b5.v vVar2 = new b5.v(iArr7, j1VarArr, iArr5, iArr4, new j4.j1((j4.i1[]) d5.f0.J(iArr3[h2VarArr.length], i1VarArr[h2VarArr.length])));
        b5.r rVar = (b5.r) wVar4;
        synchronized (rVar.d) {
            try {
                jVar = rVar.h;
                if (jVar.V && d5.f0.a >= 32 && (mVar = rVar.i) != null) {
                    Looper myLooper = Looper.myLooper();
                    d5.a.j(myLooper);
                    mVar.b(rVar, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i25 = vVar2.a;
        b5.s[] sVarArr = new b5.s[i25];
        int i26 = 2;
        Pair i27 = b5.r.i(2, vVar2, iArr4, new b5.d(0, jVar, iArr5), new a5.e(5));
        if (i27 != null) {
            sVarArr[((Integer) i27.second).intValue()] = (b5.s) i27.first;
        }
        int i28 = 0;
        while (true) {
            if (i28 >= vVar2.a) {
                z10 = false;
                break;
            }
            if (2 == iArr7[i28] && j1VarArr[i28].a > 0) {
                z10 = true;
                break;
            }
            i28++;
        }
        Pair i29 = b5.r.i(1, vVar2, iArr4, new b5.e(rVar, jVar, z10, 0), new a5.e(6));
        if (i29 != null) {
            sVarArr[((Integer) i29.second).intValue()] = (b5.s) i29.first;
        }
        if (i29 == null) {
            str = null;
        } else {
            b5.s sVar = (b5.s) i29.first;
            str = sVar.a.d[sVar.b[0]].c;
        }
        int i30 = 3;
        Pair i31 = b5.r.i(3, vVar2, iArr4, new b5.d(1, jVar, str), new a5.e(7));
        if (i31 != null) {
            sVarArr[((Integer) i31.second).intValue()] = (b5.s) i31.first;
        }
        int i32 = 0;
        while (i32 < i25) {
            int i33 = iArr7[i32];
            if (i33 == i26 || i33 == 1 || i33 == i30) {
                i11 = i32;
            } else {
                j4.j1 j1Var2 = j1VarArr[i32];
                int[][] iArr8 = iArr4[i32];
                int i34 = 0;
                j4.i1 i1Var2 = null;
                int i35 = 0;
                b5.h hVar = null;
                while (i34 < j1Var2.a) {
                    j4.i1 a3 = j1Var2.a(i34);
                    int[] iArr9 = iArr8[i34];
                    int i36 = i34;
                    b5.h hVar2 = hVar;
                    int i37 = 0;
                    while (i37 < a3.a) {
                        int i38 = i32;
                        if (b5.r.f(iArr9[i37], jVar.W)) {
                            i1Var = a3;
                            b5.h hVar3 = new b5.h(a3.d[i37], iArr9[i37]);
                            if (hVar2 != null) {
                                i12 = i37;
                                if (o8.t.a.c(hVar3.b, hVar2.b).c(hVar3.a, hVar2.a).e() <= 0) {
                                }
                            } else {
                                i12 = i37;
                            }
                            hVar2 = hVar3;
                            i1Var2 = i1Var;
                            i35 = i12;
                        } else {
                            i1Var = a3;
                            i12 = i37;
                        }
                        i37 = i12 + 1;
                        i32 = i38;
                        a3 = i1Var;
                    }
                    i34 = i36 + 1;
                    hVar = hVar2;
                }
                i11 = i32;
                sVarArr[i11] = i1Var2 == null ? null : new b5.s(0, i1Var2, new int[]{i35});
            }
            i32 = i11 + 1;
            i26 = 2;
            i30 = 3;
        }
        Object obj2 = null;
        int i39 = vVar2.a;
        j4.j1[] j1VarArr2 = vVar2.c;
        HashMap hashMap = new HashMap();
        for (int i40 = 0; i40 < i39; i40++) {
            b5.r.c(j1VarArr2[i40], jVar, hashMap);
        }
        b5.r.c(vVar2.f, jVar, hashMap);
        for (int i41 = 0; i41 < i39; i41++) {
            b5.x xVar = (b5.x) hashMap.get(Integer.valueOf(vVar2.b[i41]));
            if (xVar != null) {
                j4.i1 i1Var3 = xVar.a;
                o8.z zVar = xVar.b;
                sVarArr[i41] = (zVar.isEmpty() || j1VarArr2[i41].b(i1Var3) == -1) ? null : new b5.s(0, i1Var3, r6.e(zVar));
            }
        }
        int i42 = vVar2.a;
        for (int i43 = 0; i43 < i42; i43++) {
            j4.j1 j1Var3 = vVar2.c[i43];
            Map map = (Map) jVar.Z.get(i43);
            if (map != null && map.containsKey(j1Var3)) {
                Map map2 = (Map) jVar.Z.get(i43);
                if (map2 != null) {
                }
                sVarArr[i43] = null;
            }
        }
        for (int i44 = 0; i44 < i25; i44++) {
            int i45 = vVar2.b[i44];
            if (jVar.a0.get(i44) || jVar.L.contains(Integer.valueOf(i45))) {
                sVarArr[i44] = null;
            }
        }
        wa.a aVar = rVar.f;
        com.google.android.exoplayer2.upstream.f fVar2 = rVar.b;
        d5.a.j(fVar2);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i46 = 0;
        while (i46 < sVarArr.length) {
            b5.s sVar2 = sVarArr[i46];
            if (sVar2 == null || sVar2.b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                o8.x xVar2 = o8.z.b;
                o8.w wVar5 = new o8.w();
                wVar5.a(new b5.a(0L, 0L));
                arrayList.add(wVar5);
                obj = obj2;
            }
            i46++;
            obj2 = obj;
        }
        int length4 = sVarArr.length;
        long[][] jArr = new long[length4][];
        int i47 = 0;
        while (true) {
            j10 = -1;
            if (i47 >= sVarArr.length) {
                break;
            }
            b5.s sVar3 = sVarArr[i47];
            if (sVar3 == null) {
                jArr[i47] = new long[0];
                vVar = vVar2;
            } else {
                int[] iArr10 = sVar3.b;
                jArr[i47] = new long[iArr10.length];
                int i48 = 0;
                while (i48 < iArr10.length) {
                    b5.v vVar3 = vVar2;
                    long j12 = sVar3.a.d[iArr10[i48]].n;
                    long[] jArr2 = jArr[i47];
                    if (j12 == -1) {
                        j12 = 0;
                    }
                    jArr2[i48] = j12;
                    i48++;
                    vVar2 = vVar3;
                }
                vVar = vVar2;
                Arrays.sort(jArr[i47]);
            }
            i47++;
            vVar2 = vVar;
        }
        b5.v vVar4 = vVar2;
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i49 = 0; i49 < length4; i49++) {
            long[] jArr4 = jArr[i49];
            jArr3[i49] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        b5.b.v(arrayList, jArr3);
        o8.l.a(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(o8.j0.b);
        o8.g0 g0Var = new o8.g0();
        o8.h0 h0Var = new o8.h0();
        if (!treeMap.isEmpty()) {
            throw new IllegalArgumentException();
        }
        h0Var.d = treeMap;
        h0Var.f = g0Var;
        int i50 = 0;
        while (i50 < length4) {
            long[] jArr5 = jArr[i50];
            if (jArr5.length <= 1) {
                fVar = fVar2;
                i10 = length4;
                j11 = j10;
                iArr = iArr11;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                j11 = j10;
                int i51 = 0;
                while (true) {
                    long[] jArr6 = jArr[i50];
                    fVar = fVar2;
                    double d = 0.0d;
                    if (i51 >= jArr6.length) {
                        break;
                    }
                    int i52 = length4;
                    int[] iArr12 = iArr11;
                    long j13 = jArr6[i51];
                    if (j13 != j11) {
                        d = Math.log(j13);
                    }
                    dArr[i51] = d;
                    i51++;
                    length4 = i52;
                    iArr11 = iArr12;
                    fVar2 = fVar;
                }
                int i53 = length4;
                iArr = iArr11;
                int i54 = length5 - 1;
                double d9 = dArr[i54] - dArr[0];
                int i55 = 0;
                while (i55 < i54) {
                    double d10 = dArr[i55];
                    i55++;
                    Double valueOf = Double.valueOf(d9 == 0.0d ? 1.0d : (((d10 + dArr[i55]) * 0.5d) - dArr[0]) / d9);
                    int i56 = i53;
                    Integer valueOf2 = Integer.valueOf(i50);
                    double d11 = d9;
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
                    i53 = i56;
                    d9 = d11;
                }
                i10 = i53;
            }
            i50++;
            iArr11 = iArr;
            j10 = j11;
            length4 = i10;
            fVar2 = fVar;
        }
        com.google.android.exoplayer2.upstream.f fVar3 = fVar2;
        int[] iArr13 = iArr11;
        h7.m mVar2 = h0Var.b;
        int i57 = 4;
        if (mVar2 == null) {
            mVar2 = new h7.m(4, h0Var);
            h0Var.b = mVar2;
        }
        o8.z u10 = o8.z.u(mVar2);
        for (int i58 = 0; i58 < u10.size(); i58++) {
            int intValue = ((Integer) u10.get(i58)).intValue();
            int i59 = iArr13[intValue] + 1;
            iArr13[intValue] = i59;
            jArr3[intValue] = jArr[intValue][i59];
            b5.b.v(arrayList, jArr3);
        }
        for (int i60 = 0; i60 < sVarArr.length; i60++) {
            if (arrayList.get(i60) != null) {
                jArr3[i60] = jArr3[i60] * 2;
            }
        }
        b5.b.v(arrayList, jArr3);
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i61 = 0;
        int i62 = 0;
        while (i61 < arrayList.size()) {
            o8.w wVar6 = (o8.w) arrayList.get(i61);
            o8.l0 c10 = wVar6 == null ? o8.l0.e : wVar6.c();
            c10.getClass();
            int i63 = i62 + 1;
            if (objArr.length < i63) {
                objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i63));
            }
            objArr[i62] = c10;
            i61++;
            i62 = i63;
        }
        o8.l0 s10 = o8.z.s(i62, objArr);
        b5.t[] tVarArr = new b5.t[sVarArr.length];
        for (int i64 = 0; i64 < sVarArr.length; i64++) {
            b5.s sVar4 = sVarArr[i64];
            if (sVar4 != null) {
                int[] iArr14 = sVar4.b;
                if (iArr14.length != 0) {
                    if (iArr14.length == 1) {
                        bVar = new b5.u(sVar4.a, new int[]{iArr14[0]});
                    } else {
                        long j14 = 25000;
                        bVar = new b5.b(sVar4.a, iArr14, fVar3, 10000, j14, j14, (o8.z) s10.get(i64));
                    }
                    tVarArr[i64] = bVar;
                }
            }
        }
        i2[] i2VarArr = new i2[i25];
        int i65 = 0;
        while (i65 < i25) {
            b5.v vVar5 = vVar4;
            i2VarArr[i65] = (jVar.a0.get(i65) || jVar.L.contains(Integer.valueOf(vVar5.b[i65])) || (vVar5.b[i65] != -2 && tVarArr[i65] == null)) ? null : i2.b;
            i65++;
            vVar4 = vVar5;
        }
        b5.v vVar6 = vVar4;
        if (jVar.X) {
            int i66 = -1;
            int i67 = -1;
            for (int i68 = 0; i68 < vVar6.a; i68++) {
                int i69 = vVar6.b[i68];
                b5.t tVar = tVarArr[i68];
                if ((i69 == 1 || i69 == 2) && tVar != null) {
                    int[][] iArr15 = iArr4[i68];
                    int b10 = vVar6.c[i68].b(tVar.b());
                    int i70 = 0;
                    while (true) {
                        if (i70 < tVar.length()) {
                            if ((iArr15[b10][tVar.j(i70)] & 32) != 32) {
                                break;
                            }
                            i70++;
                        } else if (i69 == 1) {
                            i9 = -1;
                            if (i67 != -1) {
                                z12 = false;
                                break;
                            }
                            i67 = i68;
                        } else {
                            i9 = -1;
                            if (i66 != -1) {
                                z12 = false;
                                break;
                            }
                            i66 = i68;
                        }
                    }
                }
            }
            i9 = -1;
            z12 = true;
            if (((i67 == i9 || i66 == i9) ? false : true) & z12) {
                i2 i2Var = new i2(true);
                i2VarArr[i67] = i2Var;
                i2VarArr[i66] = i2Var;
            }
        }
        Pair create = Pair.create(i2VarArr, tVarArr);
        b5.t[] tVarArr2 = (b5.t[]) create.second;
        List[] listArr = new List[tVarArr2.length];
        for (int i71 = 0; i71 < tVarArr2.length; i71++) {
            b5.t tVar2 = tVarArr2[i71];
            if (tVar2 != null) {
                l0Var = o8.z.y(tVar2);
            } else {
                o8.x xVar3 = o8.z.b;
                l0Var = o8.l0.e;
            }
            listArr[i71] = l0Var;
        }
        o8.w wVar7 = new o8.w();
        int i72 = 0;
        while (true) {
            int i73 = vVar6.a;
            j4.j1[] j1VarArr3 = vVar6.c;
            if (i72 >= i73) {
                break;
            }
            j4.j1 j1Var4 = j1VarArr3[i72];
            List list2 = listArr[i72];
            int i74 = 0;
            while (i74 < j1Var4.a) {
                j4.i1 a10 = j1Var4.a(i74);
                int i75 = j1VarArr3[i72].a(i74).a;
                int[] iArr16 = new int[i75];
                int i76 = 0;
                for (int i77 = 0; i77 < i75; i77++) {
                    if ((vVar6.e[i72][i74][i77] & 7) == i57) {
                        iArr16[i76] = i77;
                        i76++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr16, i76);
                List[] listArr2 = listArr;
                String str2 = null;
                int i78 = 0;
                boolean z16 = false;
                int i79 = 0;
                int i80 = 16;
                while (i78 < copyOf.length) {
                    String str3 = j1VarArr3[i72].a(i74).d[copyOf[i78]].B;
                    int i81 = i79 + 1;
                    if (i79 == 0) {
                        str2 = str3;
                    } else {
                        z16 = (!d5.f0.a(str2, str3)) | z16;
                    }
                    i80 = Math.min(i80, vVar6.e[i72][i74][i78] & 24);
                    i78++;
                    i79 = i81;
                }
                if (z16) {
                    i80 = Math.min(i80, vVar6.d[i72]);
                }
                boolean z17 = i80 != 0;
                int i82 = a10.a;
                int[] iArr17 = new int[i82];
                boolean[] zArr = new boolean[i82];
                for (int i83 = 0; i83 < a10.a; i83++) {
                    iArr17[i83] = vVar6.e[i72][i74][i83] & 7;
                    int i84 = 0;
                    while (true) {
                        if (i84 >= list2.size()) {
                            z11 = false;
                            break;
                        }
                        b5.t tVar3 = (b5.t) list2.get(i84);
                        if (tVar3.b().equals(a10) && tVar3.u(i83) != -1) {
                            z11 = true;
                            break;
                        }
                        i84++;
                    }
                    zArr[i83] = z11;
                }
                wVar7.a(new s2(a10, z17, iArr17, zArr));
                i74++;
                listArr = listArr2;
                i57 = 4;
            }
            i72++;
            i57 = 4;
        }
        j4.j1 j1Var5 = vVar6.f;
        for (int i85 = 0; i85 < j1Var5.a; i85++) {
            j4.i1 a11 = j1Var5.a(i85);
            int[] iArr18 = new int[a11.a];
            Arrays.fill(iArr18, 0);
            wVar7.a(new s2(a11, false, iArr18, new boolean[a11.a]));
        }
        b5.a0 a0Var = new b5.a0((i2[]) create.first, (b5.t[]) create.second, new t2(wVar7.c()), vVar6);
        for (b5.t tVar4 : a0Var.c) {
            if (tVar4 != null) {
                tVar4.q(f10);
            }
        }
        return a0Var;
    }
}
