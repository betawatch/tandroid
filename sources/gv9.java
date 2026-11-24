// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gv9 {
    public static final gv9 c;
    public static final gv9 d;
    public static final gv9 e;
    public static final gv9 f;
    public final long a;
    public final long b;

    static {
        gv9 gv9Var = new gv9(0L, 0L);
        c = gv9Var;
        d = new gv9(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new gv9(Long.MAX_VALUE, 0L);
        new gv9(0L, Long.MAX_VALUE);
        f = gv9Var;
    }

    public gv9(long j, long j2) {
        gre.f(j >= 0);
        gre.f(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = g8c.a;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long a = g8c.a(j, j5);
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
        if (obj != null && gv9.class == obj.getClass()) {
            gv9 gv9Var = (gv9) obj;
            if (this.a == gv9Var.a && this.b == gv9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
