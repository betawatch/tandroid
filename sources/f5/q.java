package f5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class q {
    public final long a;
    public final long b;
    public final long c;

    public q(long j3, long j10, long j11) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.c == qVar.c && this.b == qVar.b;
    }

    public final int hashCode() {
        long j3 = this.a;
        long j10 = this.b;
        int i10 = ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.c;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.a + ", samplesPerChunk=" + this.b + ", sampleDescriptionIndex=" + this.c + '}';
    }
}
