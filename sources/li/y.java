package li;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class y {
    public long a = Long.MIN_VALUE;
    public long b = Long.MIN_VALUE;
    public long c = Long.MIN_VALUE;
    public long d;

    public y(long j10) {
        this.d = j10;
    }

    public final long a() {
        long j10 = this.c;
        if (j10 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j10;
    }
}
