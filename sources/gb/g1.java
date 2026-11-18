package gb;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g1 {
    public static final f1 Companion = new f1();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ g1(int i7, long j3, long j10, long j11) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, e1.a.d());
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
        return (obj instanceof g1) && this.a == ((g1) obj).a;
    }

    public final int hashCode() {
        long j3 = this.a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public g1(long j3) {
        this.a = j3;
        long j10 = 1000;
        this.b = j3 * j10;
        this.c = j3 / j10;
    }
}
