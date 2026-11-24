// default package

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class d0c {
    public static final d0c J = new d0c(new c0c());
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
    public final qo5 H;
    public final yo5 I;
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
    public final y79 m;
    public final y79 n;
    public final y79 o;
    public final int p;
    public final y79 q;
    public final y79 r;
    public final int s;
    public final int t;
    public final int u;
    public final y79 v;
    public final b0c w;
    public final boolean x;
    public final y79 y;
    public final y79 z;

    static {
        String str = hac.a;
        K = "1";
        L = "2";
        M = "3";
        N = "4";
        O = "5";
        P = "6";
        Q = "7";
        R = "8";
        S = "9";
        T = "a";
        U = "b";
        V = "c";
        W = "d";
        X = "e";
        Y = "f";
        Z = "g";
        a0 = "h";
        b0 = "i";
        c0 = "j";
        d0 = "k";
        e0 = "l";
        f0 = "m";
        g0 = "n";
        h0 = "o";
        i0 = "p";
        j0 = "q";
        k0 = "r";
        l0 = "s";
        m0 = "t";
        n0 = "u";
        o0 = "v";
        p0 = "w";
        q0 = "x";
        r0 = "y";
        s0 = "z";
        t0 = "10";
        u0 = "11";
        v0 = "12";
    }

    public d0c(c0c c0cVar) {
        this.a = c0cVar.a;
        this.b = c0cVar.b;
        this.c = c0cVar.c;
        this.d = c0cVar.d;
        this.e = c0cVar.e;
        this.f = c0cVar.f;
        this.g = c0cVar.g;
        this.h = c0cVar.h;
        this.i = c0cVar.i;
        this.j = c0cVar.j;
        this.k = c0cVar.k;
        this.l = c0cVar.l;
        this.m = c0cVar.m;
        this.n = c0cVar.n;
        this.o = c0cVar.o;
        this.p = c0cVar.p;
        this.q = c0cVar.q;
        this.s = c0cVar.s;
        this.t = c0cVar.t;
        this.r = c0cVar.r;
        this.u = c0cVar.u;
        this.v = c0cVar.v;
        this.w = c0cVar.w;
        this.x = c0cVar.x;
        this.y = c0cVar.y;
        this.A = c0cVar.z;
        this.B = c0cVar.A;
        this.z = c0cVar.B;
        this.C = c0cVar.C;
        this.D = c0cVar.D;
        this.E = c0cVar.E;
        this.F = c0cVar.F;
        this.G = c0cVar.G;
        this.H = qo5.b(c0cVar.H);
        this.I = yo5.q(c0cVar.I);
    }

    public static d0c b(Bundle bundle) {
        b0c b0cVar;
        c0c c0cVar = new c0c();
        d0c d0cVar = J;
        c0cVar.a = bundle.getInt(P, d0cVar.a);
        c0cVar.b = bundle.getInt(Q, d0cVar.b);
        c0cVar.c = bundle.getInt(R, d0cVar.c);
        c0cVar.d = bundle.getInt(S, d0cVar.d);
        c0cVar.e = bundle.getInt(T, d0cVar.e);
        c0cVar.f = bundle.getInt(U, d0cVar.f);
        c0cVar.g = bundle.getInt(V, d0cVar.g);
        c0cVar.h = bundle.getInt(W, d0cVar.h);
        c0cVar.i = bundle.getInt(X, d0cVar.i);
        int i = bundle.getInt(Y, d0cVar.j);
        c0cVar.j = i;
        c0cVar.k = c0cVar.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(q0, d0cVar.k);
        c0cVar.l = bundle.getBoolean(Z, d0cVar.l);
        String[] stringArray = bundle.getStringArray(a0);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        c0cVar.m = mo5.r(stringArray);
        String[] stringArray2 = bundle.getStringArray(t0);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        c0cVar.n = mo5.r(stringArray2);
        String[] stringArray3 = bundle.getStringArray(p0);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        c0cVar.o = mo5.r(stringArray3);
        c0cVar.p = bundle.getInt(i0, d0cVar.p);
        String[] stringArray4 = bundle.getStringArray(K);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        c0cVar.q = c0c.e(stringArray4);
        String[] stringArray5 = bundle.getStringArray(u0);
        String[] strArr5 = new String[0];
        if (stringArray5 == null) {
            stringArray5 = strArr5;
        }
        c0cVar.r = mo5.r(stringArray5);
        c0cVar.s = bundle.getInt(L, d0cVar.s);
        c0cVar.t = bundle.getInt(b0, d0cVar.t);
        c0cVar.u = bundle.getInt(c0, d0cVar.u);
        String[] stringArray6 = bundle.getStringArray(d0);
        String[] strArr6 = new String[0];
        if (stringArray6 == null) {
            stringArray6 = strArr6;
        }
        c0cVar.v = mo5.r(stringArray6);
        Bundle bundle2 = bundle.getBundle(n0);
        if (bundle2 != null) {
            p02 p02Var = new p02();
            String str = b0c.e;
            b0c b0cVar2 = b0c.d;
            p02Var.a = bundle2.getInt(str, b0cVar2.a);
            p02Var.b = bundle2.getBoolean(b0c.f, b0cVar2.b);
            p02Var.c = bundle2.getBoolean(b0c.g, b0cVar2.c);
            b0cVar = new b0c(p02Var);
        } else {
            p02 p02Var2 = new p02();
            b0c b0cVar3 = b0c.d;
            p02Var2.a = bundle.getInt(k0, b0cVar3.a);
            p02Var2.b = bundle.getBoolean(l0, b0cVar3.b);
            p02Var2.c = bundle.getBoolean(m0, b0cVar3.c);
            b0cVar = new b0c(p02Var2);
        }
        c0cVar.w = b0cVar;
        c0cVar.x = bundle.getBoolean(s0, d0cVar.x);
        String[] stringArray7 = bundle.getStringArray(M);
        String[] strArr7 = new String[0];
        if (stringArray7 == null) {
            stringArray7 = strArr7;
        }
        c0cVar.y = c0c.e(stringArray7);
        c0cVar.z = bundle.getInt(N, d0cVar.A);
        c0cVar.A = c0cVar.y.isEmpty() && c0cVar.z == 0 && bundle.getBoolean(r0, d0cVar.B);
        c0cVar.C = bundle.getInt(j0, d0cVar.C);
        String[] stringArray8 = bundle.getStringArray(v0);
        String[] strArr8 = new String[0];
        if (stringArray8 == null) {
            stringArray8 = strArr8;
        }
        c0cVar.B = mo5.r(stringArray8);
        c0cVar.D = bundle.getBoolean(O, d0cVar.D);
        c0cVar.E = bundle.getBoolean(o0, d0cVar.E);
        c0cVar.F = bundle.getBoolean(e0, d0cVar.F);
        c0cVar.G = bundle.getBoolean(f0, d0cVar.G);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g0);
        y79 b = parcelableArrayList == null ? y79.e : d41.b(new o41((byte) 19), parcelableArrayList);
        c0cVar.H = new HashMap();
        for (int i2 = 0; i2 < b.d; i2++) {
            a0c a0cVar = (a0c) b.get(i2);
            c0cVar.H.put(a0cVar.a, a0cVar);
        }
        int[] intArray = bundle.getIntArray(h0);
        int[] iArr = new int[0];
        if (intArray == null) {
            intArray = iArr;
        }
        c0cVar.I = new HashSet();
        for (int i3 : intArray) {
            c0cVar.I.add(Integer.valueOf(i3));
        }
        return new d0c(c0cVar);
    }

    public c0c a() {
        c0c c0cVar = new c0c();
        c0cVar.d(this);
        return c0cVar;
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
        b0c b0cVar = this.w;
        bundle.putInt(k0, b0cVar.a);
        boolean z = b0cVar.b;
        bundle.putBoolean(l0, z);
        boolean z2 = b0cVar.c;
        bundle.putBoolean(m0, z2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(b0c.e, b0cVar.a);
        bundle2.putBoolean(b0c.f, z);
        bundle2.putBoolean(b0c.g, z2);
        bundle.putBundle(n0, bundle2);
        bundle.putBoolean(o0, this.E);
        bundle.putBoolean(e0, this.F);
        bundle.putBoolean(f0, this.G);
        go5<a0c> values = this.H.values();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(values.size());
        for (a0c a0cVar : values) {
            a0cVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(a0c.c, a0cVar.a.c());
            bundle3.putIntArray(a0c.d, ine.e(a0cVar.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(g0, arrayList);
        bundle.putIntArray(h0, ine.e(this.I));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d0c d0cVar = (d0c) obj;
        return this.a == d0cVar.a && this.b == d0cVar.b && this.c == d0cVar.c && this.d == d0cVar.d && this.e == d0cVar.e && this.f == d0cVar.f && this.g == d0cVar.g && this.h == d0cVar.h && this.l == d0cVar.l && this.i == d0cVar.i && this.j == d0cVar.j && this.k == d0cVar.k && this.m.equals(d0cVar.m) && this.n.equals(d0cVar.n) && this.o.equals(d0cVar.o) && this.p == d0cVar.p && this.q.equals(d0cVar.q) && this.s == d0cVar.s && this.t == d0cVar.t && this.r.equals(d0cVar.r) && this.u == d0cVar.u && this.v.equals(d0cVar.v) && this.w.equals(d0cVar.w) && this.x == d0cVar.x && this.z.equals(d0cVar.z) && this.y.equals(d0cVar.y) && this.A == d0cVar.A && this.B == d0cVar.B && this.C == d0cVar.C && this.D == d0cVar.D && this.E == d0cVar.E && this.F == d0cVar.F && this.G == d0cVar.G && fqe.b(this.H, d0cVar.H) && this.I.equals(d0cVar.I);
    }

    public int hashCode() {
        return this.I.hashCode() + ((this.H.hashCode() + ((((((((((((this.z.hashCode() + ((((((this.y.hashCode() + ((((this.w.hashCode() + ((this.v.hashCode() + ((((this.r.hashCode() + ((((((this.q.hashCode() + ((((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + this.p) * 31)) * 31) + this.s) * 31) + this.t) * 31)) * 31) + this.u) * 31)) * 31)) * 31) + (this.x ? 1 : 0)) * 31)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31)) * 31);
    }
}
