package i2;

import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t1 {
    public static final t1 c;
    public static final t1 d;
    public static final t1 e;
    public static final t1 f;
    public final long a;
    public final long b;

    static {
        t1 t1Var = new t1(0L, 0L);
        c = t1Var;
        d = new t1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new t1(Long.MAX_VALUE, 0L);
        new t1(0L, Long.MAX_VALUE);
        f = t1Var;
    }

    public t1(long j10, long j11) {
        u6.g(j10 >= 0);
        u6.g(j11 >= 0);
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
        String str = e2.m0.a;
        long j15 = j10 - j13;
        long j16 = (((j13 ^ j10) > 0L ? 1 : ((j13 ^ j10) == 0L ? 0 : -1)) >= 0) | (((j10 ^ j15) > 0L ? 1 : ((j10 ^ j15) == 0L ? 0 : -1)) >= 0) ? j15 : ((j15 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j16 == Long.MIN_VALUE && j15 != Long.MIN_VALUE) || (j16 == Long.MAX_VALUE && j15 != Long.MAX_VALUE)) {
            j16 = Long.MIN_VALUE;
        }
        long a2 = e2.m0.a(j10, j14);
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
        if (obj != null && t1.class == obj.getClass()) {
            t1 t1Var = (t1) obj;
            if (this.a == t1Var.a && this.b == t1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
