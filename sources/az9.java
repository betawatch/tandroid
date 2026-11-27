// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class az9 {
    public static final az9 c;
    public static final az9 d;
    public static final az9 e;
    public static final az9 f;
    public final long a;
    public final long b;

    static {
        az9 az9Var = new az9(0L, 0L);
        c = az9Var;
        d = new az9(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new az9(Long.MAX_VALUE, 0L);
        new az9(0L, Long.MAX_VALUE);
        f = az9Var;
    }

    public az9(long j, long j2) {
        yve.f(j >= 0);
        yve.f(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = gcc.a;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long a = gcc.a(j, j5);
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
        if (obj != null && az9.class == obj.getClass()) {
            az9 az9Var = (az9) obj;
            if (this.a == az9Var.a && this.b == az9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
