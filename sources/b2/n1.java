package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class n1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object q = new Object();
    public static final o0 r;
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
    public i0 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public o0 c = r;

    static {
        j0 j0Var;
        c0 c0Var = new c0();
        f0 f0Var = new f0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        h0 h0Var = new h0();
        k0 k0Var = k0.d;
        Uri uri = Uri.EMPTY;
        u6.p(f0Var.b == null || f0Var.a != null);
        g0 g0Var = null;
        if (uri != null) {
            if (f0Var.a != null) {
                g0Var = new g0(f0Var);
            }
            j0Var = new j0(uri, null, g0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            j0Var = null;
        }
        r = new o0("androidx.media3.common.Timeline", new e0(c0Var), j0Var, new i0(h0Var), r0.L, k0Var);
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

    public final void b(Object obj, o0 o0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, i0 i0Var, long j13, long j14, int i10, int i11, long j15) {
        this.a = obj;
        this.c = o0Var != null ? o0Var : r;
        if (o0Var != null) {
            j0 j0Var = o0Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = z10;
        this.i = z11;
        this.j = i0Var;
        this.l = j13;
        this.m = j14;
        this.n = i10;
        this.o = i11;
        this.p = j15;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n1.class.equals(obj.getClass())) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Objects.equals(this.a, n1Var.a) && Objects.equals(this.c, n1Var.c) && Objects.equals(this.d, n1Var.d) && Objects.equals(this.j, n1Var.j) && this.e == n1Var.e && this.f == n1Var.f && this.g == n1Var.g && this.h == n1Var.h && this.i == n1Var.i && this.k == n1Var.k && this.l == n1Var.l && this.m == n1Var.m && this.n == n1Var.n && this.o == n1Var.o && this.p == n1Var.p;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        i0 i0Var = this.j;
        int hashCode3 = (hashCode2 + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
        long j10 = this.e;
        int i10 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.g;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j13 = this.l;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.m;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j15 = this.p;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
