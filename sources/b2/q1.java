package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import v7.x7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class q1 {
    public static final q1 F = new q1(new p1());
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
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final e9.k0 D;
    public final e9.m0 E;
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
    public final e9.i0 m;
    public final e9.i0 n;
    public final int o;
    public final e9.i0 p;
    public final int q;
    public final int r;
    public final int s;
    public final e9.i0 t;
    public final o1 u;
    public final e9.i0 v;
    public final int w;
    public final boolean x;
    public final int y;
    public final boolean z;

    static {
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
        l0 = Integer.toString(32, 36);
        m0 = Integer.toString(33, 36);
        n0 = Integer.toString(34, 36);
    }

    public q1(p1 p1Var) {
        this.a = p1Var.a;
        this.b = p1Var.b;
        this.c = p1Var.c;
        this.d = p1Var.d;
        this.e = p1Var.e;
        this.f = p1Var.f;
        this.g = p1Var.g;
        this.h = p1Var.h;
        this.i = p1Var.i;
        this.j = p1Var.j;
        this.k = p1Var.k;
        this.l = p1Var.l;
        this.m = p1Var.m;
        this.n = p1Var.n;
        this.o = p1Var.o;
        this.p = p1Var.p;
        this.q = p1Var.q;
        this.r = p1Var.r;
        this.s = p1Var.s;
        this.t = p1Var.t;
        this.u = p1Var.u;
        this.v = p1Var.v;
        this.w = p1Var.w;
        this.x = p1Var.x;
        this.y = p1Var.y;
        this.z = p1Var.z;
        this.A = p1Var.A;
        this.B = p1Var.B;
        this.C = p1Var.C;
        this.D = e9.k0.a(p1Var.D);
        this.E = e9.m0.v(p1Var.E);
    }

    public static q1 b(Bundle bundle) {
        o1 o1Var;
        p1 p1Var = new p1();
        q1 q1Var = F;
        p1Var.a = bundle.getInt(L, q1Var.a);
        p1Var.b = bundle.getInt(M, q1Var.b);
        p1Var.c = bundle.getInt(N, q1Var.c);
        p1Var.d = bundle.getInt(O, q1Var.d);
        p1Var.e = bundle.getInt(P, q1Var.e);
        p1Var.f = bundle.getInt(Q, q1Var.f);
        p1Var.g = bundle.getInt(R, q1Var.g);
        p1Var.h = bundle.getInt(S, q1Var.h);
        p1Var.i = bundle.getInt(T, q1Var.i);
        int i10 = bundle.getInt(U, q1Var.j);
        p1Var.j = i10;
        p1Var.k = p1Var.i == Integer.MAX_VALUE && i10 == Integer.MAX_VALUE && bundle.getBoolean(m0, q1Var.k);
        p1Var.l = bundle.getBoolean(V, q1Var.l);
        String[] stringArray = bundle.getStringArray(W);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        p1Var.m = e9.i0.w(stringArray);
        String[] stringArray2 = bundle.getStringArray(l0);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        p1Var.n = e9.i0.w(stringArray2);
        p1Var.o = bundle.getInt(e0, q1Var.o);
        String[] stringArray3 = bundle.getStringArray(G);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        p1Var.p = p1.e(stringArray3);
        p1Var.q = bundle.getInt(H, q1Var.q);
        p1Var.r = bundle.getInt(X, q1Var.r);
        p1Var.s = bundle.getInt(Y, q1Var.s);
        String[] stringArray4 = bundle.getStringArray(Z);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        p1Var.t = e9.i0.w(stringArray4);
        Bundle bundle2 = bundle.getBundle(j0);
        if (bundle2 != null) {
            n1 n1Var = new n1(0);
            String str = o1.e;
            o1 o1Var2 = o1.d;
            n1Var.a = bundle2.getInt(str, o1Var2.a);
            n1Var.b = bundle2.getBoolean(o1.f, o1Var2.b);
            n1Var.c = bundle2.getBoolean(o1.g, o1Var2.c);
            o1Var = new o1(n1Var);
        } else {
            n1 n1Var2 = new n1(0);
            o1 o1Var3 = o1.d;
            n1Var2.a = bundle.getInt(g0, o1Var3.a);
            n1Var2.b = bundle.getBoolean(h0, o1Var3.b);
            n1Var2.c = bundle.getBoolean(i0, o1Var3.c);
            o1Var = new o1(n1Var2);
        }
        p1Var.u = o1Var;
        String[] stringArray5 = bundle.getStringArray(I);
        String[] strArr5 = new String[0];
        if (stringArray5 == null) {
            stringArray5 = strArr5;
        }
        p1Var.v = p1.e(stringArray5);
        p1Var.w = bundle.getInt(J, q1Var.w);
        p1Var.x = p1Var.v.isEmpty() && p1Var.w == 0 && bundle.getBoolean(n0, q1Var.x);
        p1Var.y = bundle.getInt(f0, q1Var.y);
        p1Var.z = bundle.getBoolean(K, q1Var.z);
        p1Var.A = bundle.getBoolean(k0, q1Var.A);
        p1Var.B = bundle.getBoolean(a0, q1Var.B);
        p1Var.C = bundle.getBoolean(b0, q1Var.C);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c0);
        e9.a1 j3 = parcelableArrayList == null ? e9.a1.e : e2.d.j(new androidx.emoji2.text.w(8), parcelableArrayList);
        p1Var.D = new HashMap();
        for (int i11 = 0; i11 < j3.d; i11++) {
            m1 m1Var = (m1) j3.get(i11);
            p1Var.D.put(m1Var.a, m1Var);
        }
        int[] intArray = bundle.getIntArray(d0);
        int[] iArr = new int[0];
        if (intArray == null) {
            intArray = iArr;
        }
        p1Var.E = new HashSet();
        for (int i12 : intArray) {
            p1Var.E.add(Integer.valueOf(i12));
        }
        return new q1(p1Var);
    }

    public p1 a() {
        p1 p1Var = new p1();
        p1Var.d(this);
        return p1Var;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(L, this.a);
        bundle.putInt(M, this.b);
        bundle.putInt(N, this.c);
        bundle.putInt(O, this.d);
        bundle.putInt(P, this.e);
        bundle.putInt(Q, this.f);
        bundle.putInt(R, this.g);
        bundle.putInt(S, this.h);
        bundle.putInt(T, this.i);
        bundle.putInt(U, this.j);
        bundle.putBoolean(m0, this.k);
        bundle.putBoolean(V, this.l);
        bundle.putStringArray(W, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(l0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(e0, this.o);
        bundle.putStringArray(G, (String[]) this.p.toArray(new String[0]));
        bundle.putInt(H, this.q);
        bundle.putInt(X, this.r);
        bundle.putInt(Y, this.s);
        bundle.putStringArray(Z, (String[]) this.t.toArray(new String[0]));
        bundle.putStringArray(I, (String[]) this.v.toArray(new String[0]));
        bundle.putInt(J, this.w);
        bundle.putBoolean(n0, this.x);
        bundle.putInt(f0, this.y);
        bundle.putBoolean(K, this.z);
        o1 o1Var = this.u;
        bundle.putInt(g0, o1Var.a);
        boolean z10 = o1Var.b;
        bundle.putBoolean(h0, z10);
        boolean z11 = o1Var.c;
        bundle.putBoolean(i0, z11);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(o1.e, o1Var.a);
        bundle2.putBoolean(o1.f, z10);
        bundle2.putBoolean(o1.g, z11);
        bundle.putBundle(j0, bundle2);
        bundle.putBoolean(k0, this.A);
        bundle.putBoolean(a0, this.B);
        bundle.putBoolean(b0, this.C);
        e9.d0<m1> values = this.D.values();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(values.size());
        for (m1 m1Var : values) {
            m1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(m1.c, m1Var.a.c());
            bundle3.putIntArray(m1.d, x7.f(m1Var.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(c0, arrayList);
        bundle.putIntArray(d0, x7.f(this.E));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.a == q1Var.a && this.b == q1Var.b && this.c == q1Var.c && this.d == q1Var.d && this.e == q1Var.e && this.f == q1Var.f && this.g == q1Var.g && this.h == q1Var.h && this.l == q1Var.l && this.i == q1Var.i && this.j == q1Var.j && this.k == q1Var.k && this.m.equals(q1Var.m) && this.n.equals(q1Var.n) && this.o == q1Var.o && this.p.equals(q1Var.p) && this.q == q1Var.q && this.r == q1Var.r && this.s == q1Var.s && this.t.equals(q1Var.t) && this.u.equals(q1Var.u) && this.v.equals(q1Var.v) && this.w == q1Var.w && this.x == q1Var.x && this.y == q1Var.y && this.z == q1Var.z && this.A == q1Var.A && this.B == q1Var.B && this.C == q1Var.C) {
                e9.k0 k0Var = q1Var.D;
                e9.k0 k0Var2 = this.D;
                k0Var2.getClass();
                if (e9.q.h(k0Var2, k0Var) && this.E.equals(q1Var.E)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.E.hashCode() + ((this.D.hashCode() + ((((((((((((((((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((((((((this.p.hashCode() + ((((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31) + this.o) * 31)) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31)) * 31)) * 31)) * 31) + this.w) * 31) + (this.x ? 1 : 0)) * 31) + this.y) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31)) * 31);
    }
}
