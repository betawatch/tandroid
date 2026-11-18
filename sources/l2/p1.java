package l2;

import a8.la;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 c;
    public static final p1 d;
    public static final p1 e;
    public static final p1 f;
    public final long a;
    public final long b;

    static {
        p1 p1Var = new p1(0L, 0L);
        c = p1Var;
        d = new p1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new p1(Long.MAX_VALUE, 0L);
        new p1(0L, Long.MAX_VALUE);
        f = p1Var;
    }

    public p1(long j3, long j10) {
        la.f(j3 >= 0);
        la.f(j10 >= 0);
        this.a = j3;
        this.b = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j3, long j10, long j11) {
        long j12 = this.a;
        long j13 = this.b;
        if (j12 == 0 && j13 == 0) {
            return j3;
        }
        String str = h2.l0.a;
        long j14 = j3 - j12;
        long j15 = (((j12 ^ j3) > 0L ? 1 : ((j12 ^ j3) == 0L ? 0 : -1)) >= 0) | (((j3 ^ j14) > 0L ? 1 : ((j3 ^ j14) == 0L ? 0 : -1)) >= 0) ? j14 : ((j14 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j15 == Long.MIN_VALUE && j14 != Long.MIN_VALUE) || (j15 == Long.MAX_VALUE && j14 != Long.MAX_VALUE)) {
            j15 = Long.MIN_VALUE;
        }
        long a10 = h2.l0.a(j3, j13);
        boolean z10 = j15 <= j10 && j10 <= a10;
        boolean z11 = j15 <= j11 && j11 <= a10;
        if (!z10 || !z11) {
            if (!z10) {
                return z11 ? j11 : j15;
            }
            return j10;
        }
        if (Math.abs(j10 - j3) <= Math.abs(j11 - j3)) {
            return j10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.a == p1Var.a && this.b == p1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
