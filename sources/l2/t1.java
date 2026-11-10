package l2;

import a8.ia;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public t1(long j3, long j10) {
        ia.f(j3 >= 0);
        ia.f(j10 >= 0);
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
        String str = h2.m0.a;
        long j14 = j3 - j12;
        long j15 = (((j12 ^ j3) > 0L ? 1 : ((j12 ^ j3) == 0L ? 0 : -1)) >= 0) | (((j3 ^ j14) > 0L ? 1 : ((j3 ^ j14) == 0L ? 0 : -1)) >= 0) ? j14 : ((j14 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j15 == Long.MIN_VALUE && j14 != Long.MIN_VALUE) || (j15 == Long.MAX_VALUE && j14 != Long.MAX_VALUE)) {
            j15 = Long.MIN_VALUE;
        }
        long a10 = h2.m0.a(j3, j13);
        boolean z9 = j15 <= j10 && j10 <= a10;
        boolean z10 = j15 <= j11 && j11 <= a10;
        if (!z9 || !z10) {
            if (!z9) {
                return z10 ? j11 : j15;
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
