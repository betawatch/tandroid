// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
