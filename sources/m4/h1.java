package m4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import b2.s1;
import b2.x1;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h1 {
    public static final h1 F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public final long A;
    public final long B;
    public final long C;
    public final s1 D;
    public final b2.q1 E;
    public final b2.u0 a;
    public final int b;
    public final o1 c;
    public final b2.a1 d;
    public final b2.a1 e;
    public final int f;
    public final b2.v0 g;
    public final int h;
    public final boolean i;
    public final b2.k1 j;
    public final int k;
    public final x1 l;
    public final b2.n0 m;
    public final float n;
    public final b2.e o;
    public final d2.c p;
    public final b2.l q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final b2.n0 z;

    static {
        o1 o1Var = o1.l;
        b2.a1 a1Var = o1.k;
        b2.v0 v0Var = b2.v0.d;
        x1 x1Var = x1.d;
        b2.g1 g1Var = b2.k1.a;
        b2.n0 n0Var = b2.n0.K;
        F = new h1(null, 0, o1Var, a1Var, a1Var, 0, v0Var, 0, false, x1Var, g1Var, 0, n0Var, 1.0f, b2.e.h, d2.c.d, b2.l.c, 0, false, false, 1, 0, 1, false, false, n0Var, 5000L, 15000L, 3000L, s1.b, b2.q1.F);
        String str = e2.d0.a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        c0 = Integer.toString(23, 36);
        d0 = Integer.toString(24, 36);
        e0 = Integer.toString(25, 36);
        f0 = Integer.toString(26, 36);
        g0 = Integer.toString(27, 36);
        h0 = Integer.toString(28, 36);
        i0 = Integer.toString(29, 36);
        j0 = Integer.toString(30, 36);
        k0 = Integer.toString(31, 36);
        Integer.toString(32, 36);
    }

    public h1(b2.u0 u0Var, int i10, o1 o1Var, b2.a1 a1Var, b2.a1 a1Var2, int i11, b2.v0 v0Var, int i12, boolean z10, x1 x1Var, b2.k1 k1Var, int i13, b2.n0 n0Var, float f7, b2.e eVar, d2.c cVar, b2.l lVar, int i14, boolean z11, boolean z12, int i15, int i16, int i17, boolean z13, boolean z14, b2.n0 n0Var2, long j3, long j10, long j11, s1 s1Var, b2.q1 q1Var) {
        this.a = u0Var;
        this.b = i10;
        this.c = o1Var;
        this.d = a1Var;
        this.e = a1Var2;
        this.f = i11;
        this.g = v0Var;
        this.h = i12;
        this.i = z10;
        this.l = x1Var;
        this.j = k1Var;
        this.k = i13;
        this.m = n0Var;
        this.n = f7;
        this.o = eVar;
        this.p = cVar;
        this.q = lVar;
        this.r = i14;
        this.s = z11;
        this.t = z12;
        this.u = i15;
        this.x = i16;
        this.y = i17;
        this.v = z13;
        this.w = z14;
        this.z = n0Var2;
        this.A = j3;
        this.B = j10;
        this.C = j11;
        this.D = s1Var;
        this.E = q1Var;
    }

    public final h1 a(s1 s1Var) {
        b2.k1 k1Var = this.j;
        boolean p5 = k1Var.p();
        o1 o1Var = this.c;
        e2.d.g(p5 || o1Var.a.b < k1Var.o());
        return new h1(this.a, this.b, o1Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, k1Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, s1Var, this.E);
    }

    public final h1 b(int i10, int i11, boolean z10) {
        int i12 = this.y;
        boolean z11 = i12 == 3 && z10 && i11 == 0;
        b2.k1 k1Var = this.j;
        boolean p5 = k1Var.p();
        o1 o1Var = this.c;
        e2.d.g(p5 || o1Var.a.b < k1Var.o());
        return new h1(this.a, this.b, o1Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, k1Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z10, i10, i11, i12, z11, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final h1 c(b2.k1 k1Var, o1 o1Var, int i10) {
        e2.d.g(k1Var.p() || o1Var.a.b < k1Var.o());
        return new h1(this.a, this.b, o1Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, k1Var, i10, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final h1 d(b2.q1 q1Var) {
        b2.k1 k1Var = this.j;
        boolean p5 = k1Var.p();
        o1 o1Var = this.c;
        e2.d.g(p5 || o1Var.a.b < k1Var.o());
        return new h1(this.a, this.b, o1Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, k1Var, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, q1Var);
    }

    public final h1 e(b2.x0 x0Var, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11;
        boolean a2 = x0Var.a(16);
        boolean a10 = x0Var.a(17);
        o1 o1Var = this.c;
        o1 a11 = o1Var.a(a2, a10);
        b2.a1 b10 = this.d.b(a2, a10);
        b2.a1 b11 = this.e.b(a2, a10);
        boolean z13 = true;
        b2.k1 k1Var = this.j;
        if (!a10 && a2 && !k1Var.p()) {
            int i12 = o1Var.a.b;
            if (k1Var.o() != 1) {
                b2.j1 m10 = k1Var.m(i12, new b2.j1(), 0L);
                e9.f0 u10 = e9.i0.u();
                int i13 = m10.n;
                while (true) {
                    i11 = m10.o;
                    if (i13 > i11) {
                        break;
                    }
                    b2.h1 f7 = k1Var.f(i13, new b2.h1(), true);
                    f7.c = 0;
                    u10.b(f7);
                    i13++;
                }
                m10.o = i11 - m10.n;
                m10.n = 0;
                k1Var = new b2.i1(e9.i0.z(m10), u10.i(), new int[]{0});
            }
        } else if (z10 || !a10) {
            k1Var = b2.k1.a;
        }
        b2.k1 k1Var2 = k1Var;
        b2.n0 n0Var = !x0Var.a(18) ? b2.n0.K : this.m;
        float f10 = !x0Var.a(22) ? 1.0f : this.n;
        b2.e eVar = !x0Var.a(21) ? b2.e.h : this.o;
        d2.c cVar = !x0Var.a(28) ? d2.c.d : this.p;
        if (x0Var.a(23)) {
            i10 = this.r;
            z12 = this.s;
        } else {
            i10 = 0;
            z12 = false;
        }
        b2.n0 n0Var2 = !x0Var.a(18) ? b2.n0.K : this.z;
        s1 s1Var = (z11 || !x0Var.a(30)) ? s1.b : this.D;
        if (!k1Var2.p() && a11.a.b >= k1Var2.o()) {
            z13 = false;
        }
        e2.d.g(z13);
        return new h1(this.a, this.b, a11, b10, b11, this.f, this.g, this.h, this.i, this.l, k1Var2, this.k, n0Var, f10, eVar, cVar, this.q, i10, z12, this.t, this.u, this.x, this.y, this.v, this.w, n0Var2, this.A, this.B, this.C, s1Var, this.E);
    }

    public final Bundle f(int i10) {
        int i11;
        boolean z10;
        int i12;
        b2.h1 h1Var;
        int i13;
        int i14;
        Bundle b10;
        Bundle bundle = new Bundle();
        b2.u0 u0Var = this.a;
        if (u0Var != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(b2.u0.d, u0Var.a);
            bundle2.putLong(b2.u0.e, u0Var.b);
            bundle2.putString(b2.u0.f, u0Var.getMessage());
            bundle2.putBundle(b2.u0.r, u0Var.c);
            Throwable cause = u0Var.getCause();
            if (cause != null) {
                bundle2.putString(b2.u0.h, cause.getClass().getName());
                bundle2.putString(b2.u0.n, cause.getMessage());
            }
            bundle.putBundle(X, bundle2);
        }
        int i15 = this.b;
        if (i15 != 0) {
            bundle.putInt(Z, i15);
        }
        o1 o1Var = this.c;
        if (i10 < 3 || !o1Var.equals(o1.l)) {
            bundle.putBundle(Y, o1Var.b(i10));
        }
        b2.a1 a1Var = this.d;
        if (i10 < 3 || !o1.k.a(a1Var)) {
            bundle.putBundle(a0, a1Var.c(i10));
        }
        b2.a1 a1Var2 = this.e;
        if (i10 < 3 || !o1.k.a(a1Var2)) {
            bundle.putBundle(b0, a1Var2.c(i10));
        }
        int i16 = this.f;
        if (i16 != 0) {
            bundle.putInt(c0, i16);
        }
        b2.v0 v0Var = b2.v0.d;
        b2.v0 v0Var2 = this.g;
        if (!v0Var2.equals(v0Var)) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(b2.v0.e, v0Var2.a);
            bundle3.putFloat(b2.v0.f, v0Var2.b);
            bundle.putBundle(G, bundle3);
        }
        int i17 = this.h;
        if (i17 != 0) {
            bundle.putInt(H, i17);
        }
        boolean z11 = this.i;
        if (z11) {
            bundle.putBoolean(I, z11);
        }
        b2.g1 g1Var = b2.k1.a;
        b2.k1 k1Var = this.j;
        boolean z12 = false;
        long j3 = 0;
        if (!k1Var.equals(g1Var)) {
            ArrayList arrayList = new ArrayList();
            int o9 = k1Var.o();
            b2.j1 j1Var = new b2.j1();
            for (int i18 = 0; i18 < o9; i18++) {
                b2.j1 m10 = k1Var.m(i18, j1Var, 0L);
                m10.getClass();
                Bundle bundle4 = new Bundle();
                if (!b2.k0.g.equals(m10.c)) {
                    bundle4.putBundle(b2.j1.s, m10.c.b(false));
                }
                long j10 = m10.e;
                if (j10 != -9223372036854775807L) {
                    bundle4.putLong(b2.j1.t, j10);
                }
                long j11 = m10.f;
                if (j11 != -9223372036854775807L) {
                    bundle4.putLong(b2.j1.u, j11);
                }
                long j12 = m10.g;
                if (j12 != -9223372036854775807L) {
                    bundle4.putLong(b2.j1.v, j12);
                }
                boolean z13 = m10.h;
                if (z13) {
                    bundle4.putBoolean(b2.j1.w, z13);
                }
                boolean z14 = m10.i;
                if (z14) {
                    bundle4.putBoolean(b2.j1.x, z14);
                }
                b2.e0 e0Var = m10.j;
                if (e0Var != null) {
                    bundle4.putBundle(b2.j1.y, e0Var.b());
                }
                boolean z15 = m10.k;
                if (z15) {
                    bundle4.putBoolean(b2.j1.z, z15);
                }
                long j13 = m10.l;
                if (j13 != 0) {
                    bundle4.putLong(b2.j1.A, j13);
                }
                long j14 = m10.m;
                if (j14 != -9223372036854775807L) {
                    bundle4.putLong(b2.j1.B, j14);
                }
                int i19 = m10.n;
                if (i19 != 0) {
                    bundle4.putInt(b2.j1.C, i19);
                }
                int i20 = m10.o;
                if (i20 != 0) {
                    bundle4.putInt(b2.j1.D, i20);
                }
                long j15 = m10.p;
                if (j15 != 0) {
                    bundle4.putLong(b2.j1.E, j15);
                }
                arrayList.add(bundle4);
            }
            ArrayList arrayList2 = new ArrayList();
            int h = k1Var.h();
            b2.h1 h1Var2 = new b2.h1();
            int i21 = 0;
            while (i21 < h) {
                b2.h1 f7 = k1Var.f(i21, h1Var2, z12);
                f7.getClass();
                Bundle bundle5 = new Bundle();
                int i22 = f7.c;
                if (i22 != 0) {
                    bundle5.putInt(b2.h1.h, i22);
                }
                long j16 = j3;
                long j17 = f7.d;
                if (j17 != -9223372036854775807L) {
                    bundle5.putLong(b2.h1.i, j17);
                }
                long j18 = f7.e;
                if (j18 != j16) {
                    bundle5.putLong(b2.h1.j, j18);
                }
                boolean z16 = f7.f;
                if (z16) {
                    bundle5.putBoolean(b2.h1.k, z16);
                }
                if (f7.g.equals(b2.b.c)) {
                    i12 = h;
                    h1Var = h1Var2;
                    i13 = i21;
                } else {
                    String str = b2.h1.l;
                    b2.b bVar = f7.g;
                    bVar.getClass();
                    Bundle bundle6 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    b2.a[] aVarArr = bVar.b;
                    int length = aVarArr.length;
                    int i23 = 0;
                    while (i23 < length) {
                        int i24 = i23;
                        b2.a aVar = aVarArr[i24];
                        aVar.getClass();
                        int i25 = h;
                        Bundle bundle7 = new Bundle();
                        b2.h1 h1Var3 = h1Var2;
                        bundle7.putLong(b2.a.h, j16);
                        bundle7.putInt(b2.a.i, aVar.a);
                        bundle7.putInt(b2.a.o, aVar.b);
                        bundle7.putParcelableArrayList(b2.a.j, new ArrayList<>(Arrays.asList(aVar.c)));
                        String str2 = b2.a.p;
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        b2.k0[] k0VarArr = aVar.d;
                        int i26 = i21;
                        int length2 = k0VarArr.length;
                        int i27 = 0;
                        while (i27 < length2) {
                            int i28 = i27;
                            b2.k0 k0Var = k0VarArr[i28];
                            if (k0Var == null) {
                                b10 = null;
                                i14 = length2;
                            } else {
                                i14 = length2;
                                b10 = k0Var.b(true);
                            }
                            arrayList4.add(b10);
                            i27 = i28 + 1;
                            length2 = i14;
                        }
                        bundle7.putParcelableArrayList(str2, arrayList4);
                        bundle7.putIntArray(b2.a.k, aVar.e);
                        bundle7.putLongArray(b2.a.l, aVar.f);
                        bundle7.putLong(b2.a.m, 0L);
                        bundle7.putBoolean(b2.a.n, false);
                        bundle7.putStringArrayList(b2.a.q, new ArrayList<>(Arrays.asList(aVar.g)));
                        bundle7.putBoolean(b2.a.r, false);
                        arrayList3.add(bundle7);
                        i23 = i24 + 1;
                        j16 = 0;
                        h = i25;
                        h1Var2 = h1Var3;
                        i21 = i26;
                    }
                    i12 = h;
                    h1Var = h1Var2;
                    i13 = i21;
                    if (!arrayList3.isEmpty()) {
                        bundle6.putParcelableArrayList(b2.b.e, arrayList3);
                    }
                    bundle5.putBundle(str, bundle6);
                }
                arrayList2.add(bundle5);
                i21 = i13 + 1;
                z12 = false;
                j3 = 0;
                h = i12;
                h1Var2 = h1Var;
            }
            int[] iArr = new int[o9];
            if (o9 > 0) {
                z10 = true;
                i11 = 0;
                iArr[0] = k1Var.a(true);
            } else {
                i11 = 0;
                z10 = true;
            }
            int i29 = 1;
            while (i29 < o9) {
                iArr[i29] = k1Var.e(iArr[i29 - 1], i11, z10);
                i29++;
                i11 = 0;
                z10 = true;
            }
            Bundle bundle8 = new Bundle();
            bundle8.putBinder(b2.k1.b, new b2.h(arrayList));
            bundle8.putBinder(b2.k1.c, new b2.h(arrayList2));
            bundle8.putIntArray(b2.k1.d, iArr);
            bundle.putBundle(J, bundle8);
        }
        int i30 = this.k;
        if (i30 != 0) {
            bundle.putInt(k0, i30);
        }
        x1 x1Var = x1.d;
        x1 x1Var2 = this.l;
        if (!x1Var2.equals(x1Var)) {
            Bundle bundle9 = new Bundle();
            int i31 = x1Var2.a;
            if (i31 != 0) {
                bundle9.putInt(x1.e, i31);
            }
            int i32 = x1Var2.b;
            if (i32 != 0) {
                bundle9.putInt(x1.f, i32);
            }
            float f10 = x1Var2.c;
            if (f10 != 1.0f) {
                bundle9.putFloat(x1.g, f10);
            }
            bundle.putBundle(K, bundle9);
        }
        b2.n0 n0Var = b2.n0.K;
        b2.n0 n0Var2 = this.m;
        if (!n0Var2.equals(n0Var)) {
            bundle.putBundle(L, n0Var2.c());
        }
        float f11 = this.n;
        if (f11 != 1.0f) {
            bundle.putFloat(M, f11);
        }
        b2.e eVar = b2.e.h;
        b2.e eVar2 = this.o;
        if (!eVar2.equals(eVar)) {
            Bundle bundle10 = new Bundle();
            bundle10.putInt(b2.e.i, eVar2.a);
            bundle10.putInt(b2.e.j, eVar2.b);
            bundle10.putInt(b2.e.k, eVar2.c);
            bundle10.putInt(b2.e.l, eVar2.d);
            bundle10.putInt(b2.e.m, eVar2.e);
            bundle10.putBoolean(b2.e.n, eVar2.f);
            bundle.putBundle(N, bundle10);
        }
        d2.c cVar = d2.c.d;
        d2.c cVar2 = this.p;
        if (!cVar2.equals(cVar)) {
            Bundle bundle11 = new Bundle();
            String str3 = d2.c.e;
            e9.a1 a1Var3 = cVar2.a;
            e9.f0 u10 = e9.i0.u();
            for (int i33 = 0; i33 < a1Var3.d; i33++) {
                if (((d2.b) a1Var3.get(i33)).d == null) {
                    u10.b((d2.b) a1Var3.get(i33));
                }
            }
            e9.a1 i34 = u10.i();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>(i34.d);
            e9.g0 listIterator = i34.listIterator(0);
            while (listIterator.hasNext()) {
                d2.b bVar2 = (d2.b) listIterator.next();
                Bundle a2 = bVar2.a();
                Bitmap bitmap = bVar2.d;
                if (bitmap != null) {
                    a2.putParcelable(d2.b.w, bitmap);
                }
                arrayList5.add(a2);
            }
            bundle11.putParcelableArrayList(str3, arrayList5);
            bundle11.putLong(d2.c.f, cVar2.b);
            bundle.putBundle(d0, bundle11);
        }
        b2.l lVar = b2.l.c;
        b2.l lVar2 = this.q;
        if (!lVar2.equals(lVar)) {
            Bundle bundle12 = new Bundle();
            int i35 = lVar2.a;
            if (i35 != 0) {
                bundle12.putInt(b2.l.d, i35);
            }
            int i36 = lVar2.b;
            if (i36 != 0) {
                bundle12.putInt(b2.l.e, i36);
            }
            bundle.putBundle(O, bundle12);
        }
        int i37 = this.r;
        if (i37 != 0) {
            bundle.putInt(P, i37);
        }
        boolean z17 = this.s;
        if (z17) {
            bundle.putBoolean(Q, z17);
        }
        boolean z18 = this.t;
        if (z18) {
            bundle.putBoolean(R, z18);
        }
        int i38 = this.u;
        if (i38 != 1) {
            bundle.putInt(S, i38);
        }
        int i39 = this.x;
        if (i39 != 0) {
            bundle.putInt(T, i39);
        }
        int i40 = this.y;
        if (i40 != 1) {
            bundle.putInt(U, i40);
        }
        boolean z19 = this.v;
        if (z19) {
            bundle.putBoolean(V, z19);
        }
        boolean z20 = this.w;
        if (z20) {
            bundle.putBoolean(W, z20);
        }
        b2.n0 n0Var3 = b2.n0.K;
        b2.n0 n0Var4 = this.z;
        if (!n0Var4.equals(n0Var3)) {
            bundle.putBundle(e0, n0Var4.c());
        }
        long j19 = i10 < 6 ? 0L : 5000L;
        long j20 = this.A;
        if (j20 != j19) {
            bundle.putLong(f0, j20);
        }
        long j21 = i10 < 6 ? 0L : 15000L;
        long j22 = this.B;
        if (j22 != j21) {
            bundle.putLong(g0, j22);
        }
        long j23 = i10 < 6 ? 0L : 3000L;
        long j24 = this.C;
        if (j24 != j23) {
            bundle.putLong(h0, j24);
        }
        s1 s1Var = s1.b;
        s1 s1Var2 = this.D;
        if (!s1Var2.equals(s1Var)) {
            Bundle bundle13 = new Bundle();
            bundle13.putParcelableArrayList(s1.c, e2.d.p(s1Var2.a, new androidx.emoji2.text.w(9)));
            bundle.putBundle(j0, bundle13);
        }
        b2.q1 q1Var = b2.q1.F;
        b2.q1 q1Var2 = this.E;
        if (!q1Var2.equals(q1Var)) {
            bundle.putBundle(i0, q1Var2.c());
        }
        return bundle;
    }
}
