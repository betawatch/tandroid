// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class mk9 {
    public long a = Long.MIN_VALUE;
    public long b = Long.MIN_VALUE;
    public long c = Long.MIN_VALUE;
    public long d;

    public mk9(long j) {
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
