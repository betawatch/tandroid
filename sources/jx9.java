// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jx9 {
    public static final jx9 c;
    public static final jx9 d;
    public static final jx9 e;
    public static final jx9 f;
    public final long a;
    public final long b;

    static {
        jx9 jx9Var = new jx9(0L, 0L);
        c = jx9Var;
        d = new jx9(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new jx9(Long.MAX_VALUE, 0L);
        new jx9(0L, Long.MAX_VALUE);
        f = jx9Var;
    }

    public jx9(long j, long j2) {
        jte.f(j >= 0);
        jte.f(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = hac.a;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long a = hac.a(j, j5);
        boolean z = j7 <= j2 && j2 <= a;
        boolean z2 = j7 <= j3 && j3 <= a;
        if (z) {
            if (!z2 || Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
        } else if (!z2) {
            return j7;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jx9.class == obj.getClass()) {
            jx9 jx9Var = (jx9) obj;
            if (this.a == jx9Var.a && this.b == jx9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
