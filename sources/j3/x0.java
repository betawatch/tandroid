package j3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class x0 implements g {
    public static final x0 f = new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final q0 w;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i10 = h5.d0.a;
        h = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        r = Integer.toString(2, 36);
        s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = new q0(3);
    }

    public x0(long j10, long j11, long j12, float f10, float f11) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = f10;
        this.e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.a == x0Var.a && this.b == x0Var.b && this.c == x0Var.c && this.d == x0Var.d && this.e == x0Var.e;
    }

    public final int hashCode() {
        long j10 = this.a;
        long j11 = this.b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.c;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        float f10 = this.d;
        int floatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.e;
        return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
