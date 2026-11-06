package gb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i1 {
    public static final h1 Companion = new h1();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ i1(int i7, long j3, long j10, long j11) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, g1.a.d());
            throw null;
        }
        this.a = j3;
        this.b = (i7 & 2) == 0 ? 1000 * j3 : j10;
        if ((i7 & 4) == 0) {
            this.c = j3 / 1000;
        } else {
            this.c = j11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && this.a == ((i1) obj).a;
    }

    public final int hashCode() {
        long j3 = this.a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public i1(long j3) {
        this.a = j3;
        long j10 = 1000;
        this.b = j3 * j10;
        this.c = j3 / j10;
    }
}
