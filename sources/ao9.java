// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ao9 {
    public long a = Long.MIN_VALUE;
    public long b = Long.MIN_VALUE;
    public long c = Long.MIN_VALUE;
    public long d;

    public ao9(long j) {
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
