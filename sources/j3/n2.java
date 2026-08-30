package j3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n2 implements g {
    public static final Object E = new Object();
    public static final Object F = new Object();
    public static final c1 G;
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
    public int B;
    public int C;
    public long D;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long h;
    public boolean n;
    public boolean r;
    public boolean s;
    public x0 v;
    public boolean w;
    public long x;
    public long y;
    public Object a = E;
    public c1 c = G;

    static {
        y0 y0Var;
        s0 s0Var = new s0();
        v0 v0Var = new v0();
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var = s8.i0.e;
        z0 z0Var = z0.c;
        Uri uri = Uri.EMPTY;
        h5.a.i(v0Var.b == null || v0Var.a != null);
        w0 w0Var = null;
        if (uri != null) {
            if (v0Var.a != null) {
                w0Var = new w0(v0Var);
            }
            y0Var = new y0(uri, null, w0Var, null, list, null, i0Var, null);
        } else {
            y0Var = null;
        }
        G = new c1("com.google.android.exoplayer2.Timeline", new u0(s0Var), y0Var, new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), e1.V, z0Var);
        int i10 = h5.d0.a;
        H = Integer.toString(1, 36);
        I = Integer.toString(2, 36);
        J = Integer.toString(3, 36);
        K = Integer.toString(4, 36);
        L = Integer.toString(5, 36);
        M = Integer.toString(6, 36);
        N = Integer.toString(7, 36);
        O = Integer.toString(8, 36);
        P = Integer.toString(9, 36);
        Q = Integer.toString(10, 36);
        R = Integer.toString(11, 36);
        S = Integer.toString(12, 36);
        T = Integer.toString(13, 36);
    }

    public final boolean a() {
        h5.a.i(this.s == (this.v != null));
        return this.v != null;
    }

    public final void b(Object obj, c1 c1Var, Object obj2, long j10, long j11, long j12, boolean z4, boolean z10, x0 x0Var, long j13, long j14, int i10, int i11, long j15) {
        y0 y0Var;
        this.a = obj;
        this.c = c1Var != null ? c1Var : G;
        this.b = (c1Var == null || (y0Var = c1Var.b) == null) ? null : y0Var.n;
        this.d = obj2;
        this.e = j10;
        this.f = j11;
        this.h = j12;
        this.n = z4;
        this.r = z10;
        this.s = x0Var != null;
        this.v = x0Var;
        this.x = j13;
        this.y = j14;
        this.B = i10;
        this.C = i11;
        this.D = j15;
        this.w = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n2.class.equals(obj.getClass())) {
            n2 n2Var = (n2) obj;
            if (h5.d0.a(this.a, n2Var.a) && h5.d0.a(this.c, n2Var.c) && h5.d0.a(this.d, n2Var.d) && h5.d0.a(this.v, n2Var.v) && this.e == n2Var.e && this.f == n2Var.f && this.h == n2Var.h && this.n == n2Var.n && this.r == n2Var.r && this.w == n2Var.w && this.x == n2Var.x && this.y == n2Var.y && this.B == n2Var.B && this.C == n2Var.C && this.D == n2Var.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        x0 x0Var = this.v;
        int hashCode3 = (hashCode2 + (x0Var != null ? x0Var.hashCode() : 0)) * 31;
        long j10 = this.e;
        int i10 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.h;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.n ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31;
        long j13 = this.x;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.y;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.B) * 31) + this.C) * 31;
        long j15 = this.D;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
