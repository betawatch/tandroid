package i2;

import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v1 {
    public static final v1 c;
    public static final v1 d;
    public static final v1 e;
    public static final v1 f;
    public final long a;
    public final long b;

    static {
        v1 v1Var = new v1(0L, 0L);
        c = v1Var;
        d = new v1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new v1(Long.MAX_VALUE, 0L);
        new v1(0L, Long.MAX_VALUE);
        f = v1Var;
    }

    public v1(long j10, long j11) {
        t6.f(j10 >= 0);
        t6.f(j11 >= 0);
        this.a = j10;
        this.b = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j10, long j11, long j12) {
        long j13 = this.a;
        long j14 = this.b;
        if (j13 == 0 && j14 == 0) {
            return j10;
        }
        String str = e2.l0.a;
        long j15 = j10 - j13;
        long j16 = (((j13 ^ j10) > 0L ? 1 : ((j13 ^ j10) == 0L ? 0 : -1)) >= 0) | (((j10 ^ j15) > 0L ? 1 : ((j10 ^ j15) == 0L ? 0 : -1)) >= 0) ? j15 : ((j15 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j16 == Long.MIN_VALUE && j15 != Long.MIN_VALUE) || (j16 == Long.MAX_VALUE && j15 != Long.MAX_VALUE)) {
            j16 = Long.MIN_VALUE;
        }
        long a2 = e2.l0.a(j10, j14);
        boolean z10 = j16 <= j11 && j11 <= a2;
        boolean z11 = j16 <= j12 && j12 <= a2;
        if (!z10 || !z11) {
            if (!z10) {
                return z11 ? j12 : j16;
            }
            return j11;
        }
        if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
            return j11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.a == v1Var.a && this.b == v1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
