package b2;

import a8.yb;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object q = new Object();
    public static final p0 r;
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
    public j0 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public p0 c = r;

    static {
        k0 k0Var;
        d0 d0Var = new d0();
        g0 g0Var = new g0();
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var = f9.s1.e;
        i0 i0Var = new i0();
        l0 l0Var = l0.d;
        Uri uri = Uri.EMPTY;
        yb.p(g0Var.b == null || g0Var.a != null);
        h0 h0Var = null;
        if (uri != null) {
            if (g0Var.a != null) {
                h0Var = new h0(g0Var);
            }
            k0Var = new k0(uri, null, h0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        r = new p0("androidx.media3.common.Timeline", new f0(d0Var), k0Var, new j0(i0Var), s0.L, l0Var);
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

    public final void b(Object obj, p0 p0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, j0 j0Var, long j13, long j14, int i10, int i11, long j15) {
        this.a = obj;
        this.c = p0Var != null ? p0Var : r;
        if (p0Var != null) {
            k0 k0Var = p0Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = z10;
        this.i = z11;
        this.j = j0Var;
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
        if (obj == null || !o1.class.equals(obj.getClass())) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Objects.equals(this.a, o1Var.a) && Objects.equals(this.c, o1Var.c) && Objects.equals(this.d, o1Var.d) && Objects.equals(this.j, o1Var.j) && this.e == o1Var.e && this.f == o1Var.f && this.g == o1Var.g && this.h == o1Var.h && this.i == o1Var.i && this.k == o1Var.k && this.l == o1Var.l && this.m == o1Var.m && this.n == o1Var.n && this.o == o1Var.o && this.p == o1Var.p;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        j0 j0Var = this.j;
        int hashCode3 = (hashCode2 + (j0Var != null ? j0Var.hashCode() : 0)) * 31;
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
