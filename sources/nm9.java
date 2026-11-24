// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nm9 {
    public long a = Long.MIN_VALUE;
    public long b = Long.MIN_VALUE;
    public long c = Long.MIN_VALUE;
    public long d;

    public nm9(long j) {
        this.d = j;
    }

    public final long a() {
        long j = this.c;
        if (j == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j;
    }
}
