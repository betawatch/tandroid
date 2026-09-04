package i2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 c;
    public static final p1 d;
    public static final p1 e;
    public final long a;
    public final long b;

    static {
        p1 p1Var = new p1(0L, 0L);
        c = p1Var;
        d = new p1(Long.MAX_VALUE, Long.MAX_VALUE);
        new p1(Long.MAX_VALUE, 0L);
        new p1(0L, Long.MAX_VALUE);
        e = p1Var;
    }

    public p1(long j3, long j10) {
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
