package i5;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class r {
    public final long a;
    public final long b;
    public final long c;

    public r(long j3, long j10, long j11) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && this.c == rVar.c && this.b == rVar.b;
    }

    public final int hashCode() {
        long j3 = this.a;
        long j10 = this.b;
        int i7 = ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.c;
        return i7 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.a + ", samplesPerChunk=" + this.b + ", sampleDescriptionIndex=" + this.c + '}';
    }
}
