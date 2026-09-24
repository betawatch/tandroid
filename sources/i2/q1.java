package i2;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class q1 {
    public static final q1 c;
    public static final q1 d;
    public static final q1 e;
    public final long a;
    public final long b;

    static {
        q1 q1Var = new q1(0L, 0L);
        c = q1Var;
        d = new q1(Long.MAX_VALUE, Long.MAX_VALUE);
        new q1(Long.MAX_VALUE, 0L);
        new q1(0L, Long.MAX_VALUE);
        e = q1Var;
    }

    public q1(long j3, long j10) {
        e2.d.b(j3 >= 0);
        e2.d.b(j10 >= 0);
        this.a = j3;
        this.b = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j3, long j10, long j11) {
        long j12 = this.b;
        long j13 = this.a;
        if (j13 == 0 && j12 == 0) {
            return j3;
        }
        String str = e2.d0.a;
        long j14 = j3 - j13;
        if (((j13 ^ j3) & (j3 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        long j15 = j3 + j12;
        if (((j12 ^ j15) & (j3 ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z10 = false;
        boolean z11 = j14 <= j10 && j10 <= j15;
        if (j14 <= j11 && j11 <= j15) {
            z10 = true;
        }
        if (!z11 || !z10) {
            if (!z11) {
                return z10 ? j11 : j14;
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
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.a == q1Var.a && this.b == q1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
