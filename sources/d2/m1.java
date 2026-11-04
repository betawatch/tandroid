package d2;

import android.net.Uri;
import b8.zb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object q = new Object();
    public static final n0 r;
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
    public h0 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public n0 c = r;

    static {
        i0 i0Var;
        b0 b0Var = new b0();
        e0 e0Var = new e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.e;
        g0 g0Var = new g0();
        j0 j0Var = j0.d;
        Uri uri = Uri.EMPTY;
        zb.p(e0Var.b == null || e0Var.a != null);
        f0 f0Var = null;
        if (uri != null) {
            if (e0Var.a != null) {
                f0Var = new f0(e0Var);
            }
            i0Var = new i0(uri, null, f0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            i0Var = null;
        }
        r = new n0("androidx.media3.common.Timeline", new d0(b0Var), i0Var, new h0(g0Var), q0.L, j0Var);
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

    public final void b(Object obj, n0 n0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, h0 h0Var, long j13, long j14, int i3, int i10, long j15) {
        this.a = obj;
        this.c = n0Var != null ? n0Var : r;
        if (n0Var != null) {
            i0 i0Var = n0Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = z10;
        this.i = z11;
        this.j = h0Var;
        this.l = j13;
        this.m = j14;
        this.n = i3;
        this.o = i10;
        this.p = j15;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m1.class.equals(obj.getClass())) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Objects.equals(this.a, m1Var.a) && Objects.equals(this.c, m1Var.c) && Objects.equals(this.d, m1Var.d) && Objects.equals(this.j, m1Var.j) && this.e == m1Var.e && this.f == m1Var.f && this.g == m1Var.g && this.h == m1Var.h && this.i == m1Var.i && this.k == m1Var.k && this.l == m1Var.l && this.m == m1Var.m && this.n == m1Var.n && this.o == m1Var.o && this.p == m1Var.p;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + hs.u3) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        h0 h0Var = this.j;
        int hashCode3 = (hashCode2 + (h0Var != null ? h0Var.hashCode() : 0)) * 31;
        long j10 = this.e;
        int i3 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f;
        int i10 = (i3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.g;
        int i11 = (((((((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j13 = this.l;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.m;
        int i13 = (((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j15 = this.p;
        return i13 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
