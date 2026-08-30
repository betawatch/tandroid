package j3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h2 {
    public static final h2 c;
    public static final h2 d;
    public static final h2 e;
    public final long a;
    public final long b;

    static {
        h2 h2Var = new h2(0L, 0L);
        c = h2Var;
        d = new h2(Long.MAX_VALUE, Long.MAX_VALUE);
        new h2(Long.MAX_VALUE, 0L);
        new h2(0L, Long.MAX_VALUE);
        e = h2Var;
    }

    public h2(long j10, long j11) {
        h5.a.f(j10 >= 0);
        h5.a.f(j11 >= 0);
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
        int i10 = h5.d0.a;
        long j15 = j10 - j14;
        if (((j14 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j13;
        if (((j13 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z4 = false;
        boolean z10 = j15 <= j11 && j11 <= j16;
        if (j15 <= j12 && j12 <= j16) {
            z4 = true;
        }
        if (!z10 || !z4) {
            if (!z10) {
                return z4 ? j12 : j15;
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
        if (obj != null && h2.class == obj.getClass()) {
            h2 h2Var = (h2) obj;
            if (this.a == h2Var.a && this.b == h2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
