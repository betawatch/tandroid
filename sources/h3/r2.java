package h3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r2 implements g {
    public static final Object D = new Object();
    public static final Object E = new Object();
    public static final f1 F;
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
    public int A;
    public int B;
    public long C;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long h;
    public boolean n;
    public boolean r;
    public boolean s;
    public b1 v;
    public boolean w;
    public long x;
    public long y;
    public Object a = D;
    public f1 c = F;

    static {
        x0 x0Var = new x0();
        p8.x xVar = p8.z.b;
        p8.l0 l0Var = p8.l0.e;
        List list = Collections.EMPTY_LIST;
        p8.l0 l0Var2 = p8.l0.e;
        d1 d1Var = d1.c;
        Uri uri = Uri.EMPTY;
        F = new f1("com.google.android.exoplayer2.Timeline", new z0(x0Var), uri != null ? new c1(uri, null, list, l0Var2) : null, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1Var);
        int i10 = d5.g0.a;
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
    }

    public final boolean a() {
        d5.a.i(this.s == (this.v != null));
        return this.v != null;
    }

    public final void b(Object obj, f1 f1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, b1 b1Var, long j13, long j14, int i10, int i11, long j15) {
        this.a = obj;
        this.c = f1Var != null ? f1Var : F;
        if (f1Var != null) {
            c1 c1Var = f1Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j10;
        this.f = j11;
        this.h = j12;
        this.n = z10;
        this.r = z11;
        this.s = b1Var != null;
        this.v = b1Var;
        this.x = j13;
        this.y = j14;
        this.A = i10;
        this.B = i11;
        this.C = j15;
        this.w = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r2.class.equals(obj.getClass())) {
            r2 r2Var = (r2) obj;
            if (d5.g0.a(this.a, r2Var.a) && d5.g0.a(this.c, r2Var.c) && d5.g0.a(this.d, r2Var.d) && d5.g0.a(this.v, r2Var.v) && this.e == r2Var.e && this.f == r2Var.f && this.h == r2Var.h && this.n == r2Var.n && this.r == r2Var.r && this.w == r2Var.w && this.x == r2Var.x && this.y == r2Var.y && this.A == r2Var.A && this.B == r2Var.B && this.C == r2Var.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        b1 b1Var = this.v;
        int hashCode3 = (hashCode2 + (b1Var != null ? b1Var.hashCode() : 0)) * 31;
        long j10 = this.e;
        int i10 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.h;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.n ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31;
        long j13 = this.x;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.y;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.A) * 31) + this.B) * 31;
        long j15 = this.C;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
