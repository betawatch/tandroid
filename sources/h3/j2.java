package h3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j2 {
    public static final j2 c;
    public static final j2 d;
    public static final j2 e;
    public final long a;
    public final long b;

    static {
        j2 j2Var = new j2(0L, 0L);
        c = j2Var;
        d = new j2(Long.MAX_VALUE, Long.MAX_VALUE);
        new j2(Long.MAX_VALUE, 0L);
        new j2(0L, Long.MAX_VALUE);
        e = j2Var;
    }

    public j2(long j10, long j11) {
        d5.a.f(j10 >= 0);
        d5.a.f(j11 >= 0);
        this.a = j10;
        this.b = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j10, long j11, long j12) {
        long j13 = this.b;
        long j14 = this.a;
        if (j14 == 0 && j13 == 0) {
            return j10;
        }
        int i9 = d5.f0.a;
        long j15 = j10 - j14;
        if (((j14 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j13;
        if (((j13 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z10 = false;
        boolean z11 = j15 <= j11 && j11 <= j16;
        if (j15 <= j12 && j12 <= j16) {
            z10 = true;
        }
        if (!z11 || !z10) {
            if (!z11) {
                return z10 ? j12 : j15;
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
        if (obj != null && j2.class == obj.getClass()) {
            j2 j2Var = (j2) obj;
            if (this.a == j2Var.a && this.b == j2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
