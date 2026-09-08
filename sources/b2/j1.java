package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object q = new Object();
    public static final k0 r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public e0 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public k0 c = r;

    static {
        f0 f0Var;
        y yVar = new y();
        b0 b0Var = new b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        d0 d0Var = new d0();
        g0 g0Var = g0.d;
        Uri uri = Uri.EMPTY;
        e2.d.g(b0Var.b == null || b0Var.a != null);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        r = new k0("androidx.media3.common.Timeline", new a0(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(7, 36);
        z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, e0 e0Var, long j12, long j13, int i10, int i11, long j14) {
        this.a = obj;
        this.c = k0Var != null ? k0Var : r;
        if (k0Var != null) {
            f0 f0Var = k0Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j3;
        this.f = j10;
        this.g = j11;
        this.h = z10;
        this.i = z11;
        this.j = e0Var;
        this.l = j12;
        this.m = j13;
        this.n = i10;
        this.o = i11;
        this.p = j14;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class.equals(obj.getClass())) {
            j1 j1Var = (j1) obj;
            if (Objects.equals(this.a, j1Var.a) && Objects.equals(this.c, j1Var.c) && Objects.equals(this.d, j1Var.d) && Objects.equals(this.j, j1Var.j) && this.e == j1Var.e && this.f == j1Var.f && this.g == j1Var.g && this.h == j1Var.h && this.i == j1Var.i && this.k == j1Var.k && this.l == j1Var.l && this.m == j1Var.m && this.n == j1Var.n && this.o == j1Var.o && this.p == j1Var.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        e0 e0Var = this.j;
        int hashCode3 = (hashCode2 + (e0Var != null ? e0Var.hashCode() : 0)) * 31;
        long j3 = this.e;
        int i10 = (hashCode3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.g;
        int i12 = (((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j12 = this.l;
        int i13 = (i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.m;
        int i14 = (((((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j14 = this.p;
        return i14 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
