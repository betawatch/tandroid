package d2;

import android.os.Bundle;
import android.os.Parcelable;
import b8.od;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class s1 {
    public static final s1 J = new s1(new r1());
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
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public final int A;
    public final boolean B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final g9.l0 H;
    public final g9.t0 I;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final g9.i0 m;
    public final g9.i0 n;
    public final g9.i0 o;
    public final int p;
    public final g9.i0 q;
    public final g9.i0 r;
    public final int s;
    public final int t;
    public final int u;
    public final g9.i0 v;
    public final q1 w;
    public final boolean x;
    public final g9.i0 y;
    public final g9.i0 z;

    static {
        String str = g2.n0.a;
        K = Integer.toString(1, 36);
        L = Integer.toString(2, 36);
        M = Integer.toString(3, 36);
        N = Integer.toString(4, 36);
        O = Integer.toString(5, 36);
        P = Integer.toString(6, 36);
        Q = Integer.toString(7, 36);
        R = Integer.toString(8, 36);
        S = Integer.toString(9, 36);
        T = Integer.toString(10, 36);
        U = Integer.toString(11, 36);
        V = Integer.toString(12, 36);
        W = Integer.toString(13, 36);
        X = Integer.toString(14, 36);
        Y = Integer.toString(15, 36);
        Z = Integer.toString(16, 36);
        a0 = Integer.toString(17, 36);
        b0 = Integer.toString(18, 36);
        c0 = Integer.toString(19, 36);
        d0 = Integer.toString(20, 36);
        e0 = Integer.toString(21, 36);
        f0 = Integer.toString(22, 36);
        g0 = Integer.toString(23, 36);
        h0 = Integer.toString(24, 36);
        i0 = Integer.toString(25, 36);
        j0 = Integer.toString(26, 36);
        k0 = Integer.toString(27, 36);
        l0 = Integer.toString(28, 36);
        m0 = Integer.toString(29, 36);
        n0 = Integer.toString(30, 36);
        o0 = Integer.toString(31, 36);
        p0 = Integer.toString(32, 36);
        q0 = Integer.toString(33, 36);
        r0 = Integer.toString(34, 36);
        s0 = Integer.toString(35, 36);
        t0 = Integer.toString(36, 36);
        u0 = Integer.toString(37, 36);
        v0 = Integer.toString(38, 36);
    }

    public s1(r1 r1Var) {
        this.a = r1Var.a;
        this.b = r1Var.b;
        this.c = r1Var.c;
        this.d = r1Var.d;
        this.e = r1Var.e;
        this.f = r1Var.f;
        this.g = r1Var.g;
        this.h = r1Var.h;
        this.i = r1Var.i;
        this.j = r1Var.j;
        this.k = r1Var.k;
        this.l = r1Var.l;
        this.m = r1Var.m;
        this.n = r1Var.n;
        this.o = r1Var.o;
        this.p = r1Var.p;
        this.q = r1Var.q;
        this.s = r1Var.s;
        this.t = r1Var.t;
        this.r = r1Var.r;
        this.u = r1Var.u;
        this.v = r1Var.v;
        this.w = r1Var.w;
        this.x = r1Var.x;
        this.y = r1Var.y;
        this.A = r1Var.z;
        this.B = r1Var.A;
        this.z = r1Var.B;
        this.C = r1Var.C;
        this.D = r1Var.D;
        this.E = r1Var.E;
        this.F = r1Var.F;
        this.G = r1Var.G;
        this.H = g9.l0.b(r1Var.H);
        this.I = g9.t0.q(r1Var.I);
    }

    public static s1 b(Bundle bundle) {
        q1 q1Var;
        r1 r1Var = new r1();
        s1 s1Var = J;
        r1Var.a = bundle.getInt(P, s1Var.a);
        r1Var.b = bundle.getInt(Q, s1Var.b);
        r1Var.c = bundle.getInt(R, s1Var.c);
        r1Var.d = bundle.getInt(S, s1Var.d);
        r1Var.e = bundle.getInt(T, s1Var.e);
        r1Var.f = bundle.getInt(U, s1Var.f);
        r1Var.g = bundle.getInt(V, s1Var.g);
        r1Var.h = bundle.getInt(W, s1Var.h);
        r1Var.i = bundle.getInt(X, s1Var.i);
        int i3 = bundle.getInt(Y, s1Var.j);
        r1Var.j = i3;
        r1Var.k = r1Var.i == Integer.MAX_VALUE && i3 == Integer.MAX_VALUE && bundle.getBoolean(q0, s1Var.k);
        r1Var.l = bundle.getBoolean(Z, s1Var.l);
        String[] stringArray = bundle.getStringArray(a0);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        r1Var.m = g9.i0.r(stringArray);
        String[] stringArray2 = bundle.getStringArray(t0);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        r1Var.n = g9.i0.r(stringArray2);
        String[] stringArray3 = bundle.getStringArray(p0);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        r1Var.o = g9.i0.r(stringArray3);
        r1Var.p = bundle.getInt(i0, s1Var.p);
        String[] stringArray4 = bundle.getStringArray(K);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        r1Var.q = r1.e(stringArray4);
        String[] stringArray5 = bundle.getStringArray(u0);
        String[] strArr5 = new String[0];
        if (stringArray5 == null) {
            stringArray5 = strArr5;
        }
        r1Var.r = g9.i0.r(stringArray5);
        r1Var.s = bundle.getInt(L, s1Var.s);
        r1Var.t = bundle.getInt(b0, s1Var.t);
        r1Var.u = bundle.getInt(c0, s1Var.u);
        String[] stringArray6 = bundle.getStringArray(d0);
        String[] strArr6 = new String[0];
        if (stringArray6 == null) {
            stringArray6 = strArr6;
        }
        r1Var.v = g9.i0.r(stringArray6);
        Bundle bundle2 = bundle.getBundle(n0);
        if (bundle2 != null) {
            bd.i iVar = new bd.i(2);
            String str = q1.e;
            q1 q1Var2 = q1.d;
            iVar.a = bundle2.getInt(str, q1Var2.a);
            iVar.b = bundle2.getBoolean(q1.f, q1Var2.b);
            iVar.c = bundle2.getBoolean(q1.g, q1Var2.c);
            q1Var = new q1(iVar);
        } else {
            bd.i iVar2 = new bd.i(2);
            q1 q1Var3 = q1.d;
            iVar2.a = bundle.getInt(k0, q1Var3.a);
            iVar2.b = bundle.getBoolean(l0, q1Var3.b);
            iVar2.c = bundle.getBoolean(m0, q1Var3.c);
            q1Var = new q1(iVar2);
        }
        r1Var.w = q1Var;
        r1Var.x = bundle.getBoolean(s0, s1Var.x);
        String[] stringArray7 = bundle.getStringArray(M);
        String[] strArr7 = new String[0];
        if (stringArray7 == null) {
            stringArray7 = strArr7;
        }
        r1Var.y = r1.e(stringArray7);
        r1Var.z = bundle.getInt(N, s1Var.A);
        r1Var.A = r1Var.y.isEmpty() && r1Var.z == 0 && bundle.getBoolean(r0, s1Var.B);
        r1Var.C = bundle.getInt(j0, s1Var.C);
        String[] stringArray8 = bundle.getStringArray(v0);
        String[] strArr8 = new String[0];
        if (stringArray8 == null) {
            stringArray8 = strArr8;
        }
        r1Var.B = g9.i0.r(stringArray8);
        r1Var.D = bundle.getBoolean(O, s1Var.D);
        r1Var.E = bundle.getBoolean(o0, s1Var.E);
        r1Var.F = bundle.getBoolean(e0, s1Var.F);
        r1Var.G = bundle.getBoolean(f0, s1Var.G);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g0);
        g9.s1 b10 = parcelableArrayList == null ? g9.s1.e : g2.f.b(new a3.j(29), parcelableArrayList);
        r1Var.H = new HashMap();
        for (int i10 = 0; i10 < b10.d; i10++) {
            p1 p1Var = (p1) b10.get(i10);
            r1Var.H.put(p1Var.a, p1Var);
        }
        int[] intArray = bundle.getIntArray(h0);
        int[] iArr = new int[0];
        if (intArray == null) {
            intArray = iArr;
        }
        r1Var.I = new HashSet();
        for (int i11 : intArray) {
            r1Var.I.add(Integer.valueOf(i11));
        }
        return new s1(r1Var);
    }

    public r1 a() {
        r1 r1Var = new r1();
        r1Var.d(this);
        return r1Var;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(P, this.a);
        bundle.putInt(Q, this.b);
        bundle.putInt(R, this.c);
        bundle.putInt(S, this.d);
        bundle.putInt(T, this.e);
        bundle.putInt(U, this.f);
        bundle.putInt(V, this.g);
        bundle.putInt(W, this.h);
        bundle.putInt(X, this.i);
        bundle.putInt(Y, this.j);
        bundle.putBoolean(q0, this.k);
        bundle.putBoolean(Z, this.l);
        bundle.putStringArray(a0, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(p0, (String[]) this.o.toArray(new String[0]));
        bundle.putStringArray(t0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(i0, this.p);
        bundle.putStringArray(K, (String[]) this.q.toArray(new String[0]));
        bundle.putInt(L, this.s);
        bundle.putInt(b0, this.t);
        bundle.putInt(c0, this.u);
        bundle.putStringArray(u0, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(d0, (String[]) this.v.toArray(new String[0]));
        bundle.putBoolean(s0, this.x);
        bundle.putStringArray(M, (String[]) this.y.toArray(new String[0]));
        bundle.putInt(N, this.A);
        bundle.putBoolean(r0, this.B);
        bundle.putStringArray(v0, (String[]) this.z.toArray(new String[0]));
        bundle.putInt(j0, this.C);
        bundle.putBoolean(O, this.D);
        q1 q1Var = this.w;
        bundle.putInt(k0, q1Var.a);
        boolean z10 = q1Var.b;
        bundle.putBoolean(l0, z10);
        boolean z11 = q1Var.c;
        bundle.putBoolean(m0, z11);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(q1.e, q1Var.a);
        bundle2.putBoolean(q1.f, z10);
        bundle2.putBoolean(q1.g, z11);
        bundle.putBundle(n0, bundle2);
        bundle.putBoolean(o0, this.E);
        bundle.putBoolean(e0, this.F);
        bundle.putBoolean(f0, this.G);
        g9.d0<p1> values = this.H.values();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(values.size());
        for (p1 p1Var : values) {
            p1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(p1.c, p1Var.a.c());
            bundle3.putIntArray(p1.d, od.f(p1Var.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(g0, arrayList);
        bundle.putIntArray(h0, od.f(this.I));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.a == s1Var.a && this.b == s1Var.b && this.c == s1Var.c && this.d == s1Var.d && this.e == s1Var.e && this.f == s1Var.f && this.g == s1Var.g && this.h == s1Var.h && this.l == s1Var.l && this.i == s1Var.i && this.j == s1Var.j && this.k == s1Var.k && this.m.equals(s1Var.m) && this.n.equals(s1Var.n) && this.o.equals(s1Var.o) && this.p == s1Var.p && this.q.equals(s1Var.q) && this.s == s1Var.s && this.t == s1Var.t && this.r.equals(s1Var.r) && this.u == s1Var.u && this.v.equals(s1Var.v) && this.w.equals(s1Var.w) && this.x == s1Var.x && this.z.equals(s1Var.z) && this.y.equals(s1Var.y) && this.A == s1Var.A && this.B == s1Var.B && this.C == s1Var.C && this.D == s1Var.D && this.E == s1Var.E && this.F == s1Var.F && this.G == s1Var.G) {
                g9.l0 l0Var = s1Var.H;
                g9.l0 l0Var2 = this.H;
                l0Var2.getClass();
                if (g9.o.j(l0Var2, l0Var) && this.I.equals(s1Var.I)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.I.hashCode() + ((this.H.hashCode() + ((((((((((((this.z.hashCode() + ((((((this.y.hashCode() + ((((this.w.hashCode() + ((this.v.hashCode() + ((((this.r.hashCode() + ((((((this.q.hashCode() + ((((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + this.p) * 31)) * 31) + this.s) * 31) + this.t) * 31)) * 31) + this.u) * 31)) * 31)) * 31) + (this.x ? 1 : 0)) * 31)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31)) * 31);
    }
}
