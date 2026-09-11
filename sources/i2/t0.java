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
import org.telegram.ui.Components.s50;
import org.telegram.ui.f11;
import rg.p2;
import v7.x7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class t0 {
    public final Object a;
    public final Object b;
    public final u2.b1[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public u0 g;
    public boolean h;
    public final boolean[] i;
    public final f[] j;
    public final x2.u k;
    public final f1 l;
    public t0 m;
    public u2.o1 n;
    public x2.v o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u2.d] */
    public t0(f[] fVarArr, long j3, x2.u uVar, y2.d dVar, f1 f1Var, u0 u0Var, x2.v vVar) {
        this.j = fVarArr;
        this.p = j3;
        this.k = uVar;
        this.l = f1Var;
        u2.f0 f0Var = u0Var.a;
        this.b = f0Var.a;
        this.g = u0Var;
        this.n = u2.o1.d;
        this.o = vVar;
        this.c = new u2.b1[fVarArr.length];
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
        long q6 = this.a.q(vVar.c, this.i, this.c, zArr, j3);
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
        return q6;
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
        x2.v j3 = j(f7, k1Var, z10);
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u2.d1] */
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
        int[] iArr4 = new int[fVarArr.length + 1];
        int length = fVarArr.length + 1;
        b2.l1[][] l1VarArr = new b2.l1[length][];
        int[][][] iArr5 = new int[fVarArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = o1Var2.a;
            l1VarArr[i14] = new b2.l1[i15];
            iArr5[i14] = new int[i15][];
        }
        int length2 = fVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr6[i16] = fVarArr[i16].A();
        }
        int i17 = 0;
        while (i17 < o1Var2.a) {
            b2.l1 a2 = o1Var2.a(i17);
            boolean z14 = a2.c == 5;
            int length3 = fVarArr.length;
            int i18 = 0;
            int i19 = 0;
            boolean z15 = true;
            while (i18 < fVarArr.length) {
                f fVar = fVarArr[i18];
                x2.u uVar2 = uVar;
                u2.o1 o1Var3 = o1Var2;
                int i20 = 0;
                for (int i21 = 0; i21 < a2.a; i21++) {
                    i20 = Math.max(i20, fVar.z(a2.d[i21]) & 7);
                }
                boolean z16 = iArr4[i18] == 0;
                if (i20 > i19 || (i20 == i19 && z14 && !z15 && z16)) {
                    i19 = i20;
                    z15 = z16;
                    length3 = i18;
                }
                i18++;
                uVar = uVar2;
                o1Var2 = o1Var3;
            }
            x2.u uVar3 = uVar;
            u2.o1 o1Var4 = o1Var2;
            if (length3 == fVarArr.length) {
                iArr3 = new int[a2.a];
            } else {
                f fVar2 = fVarArr[length3];
                int[] iArr7 = new int[a2.a];
                for (int i22 = 0; i22 < a2.a; i22++) {
                    iArr7[i22] = fVar2.z(a2.d[i22]);
                }
                iArr3 = iArr7;
            }
            int i23 = iArr4[length3];
            l1VarArr[length3][i23] = a2;
            iArr5[length3][i23] = iArr3;
            iArr4[length3] = i23 + 1;
            i17++;
            uVar = uVar3;
            o1Var2 = o1Var4;
        }
        x2.u uVar4 = uVar;
        u2.o1[] o1VarArr = new u2.o1[fVarArr.length];
        String[] strArr = new String[fVarArr.length];
        int[] iArr8 = new int[fVarArr.length];
        for (int i24 = 0; i24 < fVarArr.length; i24++) {
            int i25 = iArr4[i24];
            o1VarArr[i24] = new u2.o1((b2.l1[]) e2.d0.S(i25, l1VarArr[i24]));
            iArr5[i24] = (int[][]) e2.d0.S(i25, iArr5[i24]);
            strArr[i24] = fVarArr[i24].j();
            iArr8[i24] = fVarArr[i24].b;
        }
        x2.t tVar2 = new x2.t(iArr8, o1VarArr, iArr6, iArr5, new u2.o1((b2.l1[]) e2.d0.S(iArr4[fVarArr.length], l1VarArr[fVarArr.length])));
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
            if (2 == iArr8[i27] && o1VarArr[i27].a > 0) {
                z11 = true;
                break;
            }
            i27++;
        }
        Pair j10 = x2.p.j(1, tVar2, iArr5, new ca.b(pVar, iVar, z11, iArr6, 7), new f11(16));
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
            a1.d dVar = new a1.d(iVar, str, iArr6, (!iVar.k || context2 == null) ? null : e2.d0.w(context2), 20);
            str2 = str;
            l1Var = null;
            j3 = x2.p.j(2, tVar2, iArr5, dVar, new f11(15));
        }
        int i28 = 4;
        if ((iVar.A || j3 == null) && o1Var5.a != 2) {
            iArr = iArr8;
            pair = x2.p.j(4, tVar2, iArr5, new p2(iVar, 12), new f11(14));
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
        if (o1Var5.a == 2) {
            pair2 = l1Var;
        } else {
            if (!iVar.x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                obj = l1Var;
            } else {
                String str3 = e2.d0.a;
                obj = locale.toLanguageTag();
            }
            pair2 = x2.p.j(3, tVar2, iArr5, new s50(iVar, str2, obj, 10), new f11(17));
        }
        if (pair2 != 0) {
            qVarArr[((Integer) pair2.second).intValue()] = (x2.q) pair2.first;
        }
        int i30 = 0;
        while (i30 < i26) {
            int i31 = iArr[i30];
            if (i31 == 2 || i31 == 1 || i31 == i29 || i31 == i28) {
                i11 = i30;
                o1Var = o1Var5;
            } else {
                u2.o1 o1Var6 = o1VarArr[i30];
                int[][] iArr9 = iArr5[i30];
                if (o1Var5.a == 2) {
                    i11 = i30;
                    o1Var = o1Var5;
                } else {
                    b2.l1 l1Var3 = l1Var;
                    b2.l1 l1Var4 = l1Var3;
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < o1Var6.a) {
                        b2.l1 a10 = o1Var6.a(i32);
                        int[] iArr10 = iArr9[i32];
                        int i34 = i30;
                        b2.o1 o1Var7 = o1Var5;
                        x2.g gVar = l1Var4;
                        int i35 = i33;
                        b2.l1 l1Var5 = l1Var3;
                        int i36 = 0;
                        while (i36 < a10.a) {
                            u2.o1 o1Var8 = o1Var6;
                            if (g.d(iArr10[i36], iVar.t0)) {
                                i12 = i36;
                                x2.g gVar2 = new x2.g(a10.d[i36], iArr10[i12]);
                                if (gVar != 0) {
                                    i13 = i32;
                                    if (e9.z.a.c(gVar2.b, gVar.b).c(gVar2.a, gVar.a).e() <= 0) {
                                    }
                                } else {
                                    i13 = i32;
                                }
                                gVar = gVar2;
                                l1Var5 = a10;
                                i35 = i12;
                            } else {
                                i12 = i36;
                                i13 = i32;
                            }
                            i36 = i12 + 1;
                            o1Var6 = o1Var8;
                            i32 = i13;
                            gVar = gVar;
                        }
                        i32++;
                        l1Var3 = l1Var5;
                        i33 = i35;
                        o1Var5 = o1Var7;
                        l1Var4 = gVar;
                        i30 = i34;
                    }
                    i11 = i30;
                    o1Var = o1Var5;
                    if (l1Var3 != null) {
                        qVar = new x2.q(l1Var3, i33);
                        qVarArr[i11] = qVar;
                    }
                }
                qVar = l1Var;
                qVarArr[i11] = qVar;
            }
            i30 = i11 + 1;
            o1Var5 = o1Var;
            i29 = 3;
            i28 = 4;
        }
        int i37 = tVar2.a;
        u2.o1[] o1VarArr2 = tVar2.c;
        HashMap hashMap = new HashMap();
        for (int i38 = 0; i38 < i37; i38++) {
            x2.p.c(o1VarArr2[i38], iVar, hashMap);
        }
        x2.p.c(tVar2.f, iVar, hashMap);
        for (int i39 = 0; i39 < i37; i39++) {
            b2.m1 m1Var = (b2.m1) hashMap.get(Integer.valueOf(tVar2.b[i39]));
            if (m1Var != null) {
                b2.l1 l1Var6 = m1Var.a;
                e9.i0 i0Var = m1Var.b;
                qVarArr[i39] = (i0Var.isEmpty() || o1VarArr2[i39].b(l1Var6) == -1) ? l1Var : new x2.q(l1Var6, x7.f(i0Var));
            }
        }
        int i40 = tVar2.a;
        for (int i41 = 0; i41 < i40; i41++) {
            u2.o1 o1Var9 = tVar2.c[i41];
            Map map = (Map) iVar.v0.get(i41);
            if (map != null && map.containsKey(o1Var9)) {
                Map map2 = (Map) iVar.v0.get(i41);
                if (map2 != null && map2.get(o1Var9) != null) {
                    throw new ClassCastException();
                }
                qVarArr[i41] = l1Var;
            }
        }
        for (int i42 = 0; i42 < i26; i42++) {
            int i43 = tVar2.b[i42];
            if (iVar.w0.get(i42) || iVar.E.contains(Integer.valueOf(i43))) {
                qVarArr[i42] = l1Var;
            }
        }
        rb.a aVar = pVar.f;
        y2.c cVar2 = pVar.b;
        e2.d.h(cVar2);
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i44 = 0;
        while (i44 < qVarArr.length) {
            x2.q qVar3 = qVarArr[i44];
            if (qVar3 == 0 || qVar3.b.length <= 1) {
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
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i45 = 0;
        while (i45 < qVarArr.length) {
            x2.q qVar4 = qVarArr[i45];
            if (qVar4 == 0) {
                jArr[i45] = new long[0];
                tVar = tVar2;
            } else {
                int[] iArr11 = qVar4.b;
                jArr[i45] = new long[iArr11.length];
                int i46 = 0;
                while (i46 < iArr11.length) {
                    x2.t tVar3 = tVar2;
                    long j11 = qVar4.a.d[iArr11[i46]].j;
                    long[] jArr2 = jArr[i45];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i46] = j11;
                    i46++;
                    tVar2 = tVar3;
                }
                tVar = tVar2;
                Arrays.sort(jArr[i45]);
            }
            i45++;
            tVar2 = tVar;
        }
        x2.t tVar4 = tVar2;
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
        for (int i55 = 0; i55 < qVarArr.length; i55++) {
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
        x2.r[] rVarArr = new x2.r[qVarArr.length];
        for (int i58 = 0; i58 < qVarArr.length; i58++) {
            x2.q qVar5 = qVarArr[i58];
            if (qVar5 != 0) {
                int[] iArr15 = qVar5.b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new x2.s(qVar5.a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new x2.b(qVar5.a, iArr15, cVar3, 10000, j13, j13, (e9.i0) i57.get(i58));
                    }
                    rVarArr[i58] = bVar;
                }
            }
        }
        m1[] m1VarArr = new m1[i26];
        int i59 = 0;
        while (i59 < i26) {
            x2.t tVar5 = tVar4;
            m1VarArr[i59] = (iVar.w0.get(i59) || iVar.E.contains(Integer.valueOf(tVar5.b[i59])) || (tVar5.b[i59] != -2 && rVarArr[i59] == null)) ? null : m1.c;
            i59++;
            tVar4 = tVar5;
        }
        x2.t tVar6 = tVar4;
        if (iVar.u.a != 0) {
            int i60 = 0;
            int i61 = -1;
            int i62 = 0;
            while (true) {
                if (i62 < tVar6.a) {
                    int i63 = tVar6.b[i62];
                    x2.r rVar = rVarArr[i62];
                    if (i63 != 1 && rVar != null) {
                        break;
                    }
                    if (i63 == 1 && rVar != null && rVar.length() == 1) {
                        if (x2.p.i(iVar, iArr5[i62][tVar6.c[i62].b(rVar.b())][rVar.h(0)], rVar.m())) {
                            i60++;
                            i61 = i62;
                        }
                    }
                    i62++;
                } else if (i60 == 1) {
                    int i64 = iVar.u.b ? 1 : 2;
                    m1 m1Var2 = m1VarArr[i61];
                    m1VarArr[i61] = new m1(i64, m1Var2 != null && m1Var2.b);
                }
            }
        }
        Pair create = Pair.create(m1VarArr, rVarArr);
        x2.r[] rVarArr2 = (x2.r[]) create.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i65 = 0; i65 < rVarArr2.length; i65++) {
            x2.r rVar2 = rVarArr2[i65];
            if (rVar2 != null) {
                a1Var = e9.i0.z(rVar2);
            } else {
                e9.g0 g0Var = e9.i0.b;
                a1Var = e9.a1.e;
            }
            listArr[i65] = a1Var;
        }
        e9.f0 f0Var2 = new e9.f0(4);
        int i66 = 0;
        while (true) {
            int i67 = tVar6.a;
            u2.o1[] o1VarArr3 = tVar6.c;
            if (i66 >= i67) {
                break;
            }
            u2.o1 o1Var10 = o1VarArr3[i66];
            List list = listArr[i66];
            int i68 = 0;
            while (i68 < o1Var10.a) {
                b2.l1 a11 = o1Var10.a(i68);
                int i69 = o1VarArr3[i66].a(i68).a;
                int[] iArr16 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i70 < i69) {
                    List[] listArr2 = listArr;
                    if ((tVar6.e[i66][i68][i70] & 7) == 4) {
                        iArr16[i71] = i70;
                        i71++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr16, i71);
                u2.o1 o1Var11 = o1Var10;
                String str4 = null;
                int i72 = 0;
                boolean z17 = false;
                int i73 = 0;
                int i74 = 16;
                while (i72 < copyOf.length) {
                    String str5 = o1VarArr3[i66].a(i68).d[copyOf[i72]].r;
                    int i75 = i73 + 1;
                    if (i73 == 0) {
                        str4 = str5;
                    } else {
                        z17 = (!Objects.equals(str4, str5)) | z17;
                    }
                    i74 = Math.min(i74, tVar6.e[i66][i68][i72] & 24);
                    i72++;
                    i73 = i75;
                }
                if (z17) {
                    i74 = Math.min(i74, tVar6.d[i66]);
                }
                boolean z18 = i74 != 0;
                int i76 = a11.a;
                int[] iArr17 = new int[i76];
                boolean[] zArr = new boolean[i76];
                for (int i77 = 0; i77 < a11.a; i77++) {
                    iArr17[i77] = tVar6.e[i66][i68][i77] & 7;
                    int i78 = 0;
                    while (true) {
                        if (i78 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        x2.r rVar3 = (x2.r) list.get(i78);
                        if (rVar3.b().equals(a11) && rVar3.u(i77) != -1) {
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
                o1Var10 = o1Var11;
            }
            i66++;
        }
        u2.o1 o1Var12 = tVar6.f;
        for (int i79 = 0; i79 < o1Var12.a; i79++) {
            b2.l1 a12 = o1Var12.a(i79);
            int[] iArr18 = new int[a12.a];
            Arrays.fill(iArr18, 0);
            f0Var2.b(new r1(a12, false, iArr18, new boolean[a12.a]));
        }
        x2.v vVar = new x2.v((m1[]) create.first, (x2.r[]) create.second, new s1(f0Var2.i()), tVar6);
        for (int i80 = 0; i80 < vVar.a; i80++) {
            if (vVar.b(i80)) {
                if (vVar.c[i80] == null && this.j[i80].b != -2) {
                    z12 = false;
                    e2.d.g(z12);
                }
                z12 = true;
                e2.d.g(z12);
            } else {
                e2.d.g(vVar.c[i80] == null);
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
