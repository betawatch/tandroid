package h3;

import fh.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b1 implements g {
    public static final b1 f = new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final y5 w;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i9 = d5.f0.a;
        h = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        r = Integer.toString(2, 36);
        s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = new y5(18);
    }

    public b1(long j10, long j11, long j12, float f10, float f11) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = f10;
        this.e = f11;
    }

    public final a1 a() {
        a1 a1Var = new a1();
        a1Var.a = this.a;
        a1Var.b = this.b;
        a1Var.c = this.c;
        a1Var.d = this.d;
        a1Var.e = this.e;
        return a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.a == b1Var.a && this.b == b1Var.b && this.c == b1Var.c && this.d == b1Var.d && this.e == b1Var.e;
    }

    public final int hashCode() {
        long j10 = this.a;
        long j11 = this.b;
        int i9 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.c;
        int i10 = (i9 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        float f10 = this.d;
        int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.e;
        return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
