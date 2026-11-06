package e2;

import a8.ia;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object q = new Object();
    public static final l0 r;
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
    public f0 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public l0 c = r;

    static {
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        ia.p(c0Var.b == null || c0Var.a != null);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        r = new l0("androidx.media3.common.Timeline", new b0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
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

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z9, boolean z10, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        this.a = obj;
        this.c = l0Var != null ? l0Var : r;
        if (l0Var != null) {
            g0 g0Var = l0Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j3;
        this.f = j10;
        this.g = j11;
        this.h = z9;
        this.i = z10;
        this.j = f0Var;
        this.l = j12;
        this.m = j13;
        this.n = i7;
        this.o = i10;
        this.p = j14;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k1.class.equals(obj.getClass())) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Objects.equals(this.a, k1Var.a) && Objects.equals(this.c, k1Var.c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.j, k1Var.j) && this.e == k1Var.e && this.f == k1Var.f && this.g == k1Var.g && this.h == k1Var.h && this.i == k1Var.i && this.k == k1Var.k && this.l == k1Var.l && this.m == k1Var.m && this.n == k1Var.n && this.o == k1Var.o && this.p == k1Var.p;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + qs.u3) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        f0 f0Var = this.j;
        int hashCode3 = (hashCode2 + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
        long j3 = this.e;
        int i7 = (hashCode3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f;
        int i10 = (i7 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.g;
        int i11 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j12 = this.l;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.m;
        int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j14 = this.p;
        return i13 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
