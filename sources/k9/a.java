package k9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public final long a;
    public final long b;
    public final long c;

    public a(long j3, long j10, long j11) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        long j10 = this.b;
        int i10 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.b);
        sb2.append(", uptimeMillis=");
        return a4.a.r(sb2, this.c, "}");
    }
}
