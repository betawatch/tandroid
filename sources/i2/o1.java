package i2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o1 {
    public static final o1 c;
    public static final o1 d;
    public static final o1 e;
    public final long a;
    public final long b;

    static {
        o1 o1Var = new o1(0L, 0L);
        c = o1Var;
        d = new o1(Long.MAX_VALUE, Long.MAX_VALUE);
        new o1(Long.MAX_VALUE, 0L);
        new o1(0L, Long.MAX_VALUE);
        e = o1Var;
    }

    public o1(long j3, long j10) {
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
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.a == o1Var.a && this.b == o1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
