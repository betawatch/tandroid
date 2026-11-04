package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h1 {
    public static final g1 Companion = new g1();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ h1(int i3, long j10, long j11, long j12) {
        if (1 != (i3 & 1)) {
            le.k.a(i3, 1, f1.a.d());
            throw null;
        }
        this.a = j10;
        this.b = (i3 & 2) == 0 ? 1000 * j10 : j11;
        if ((i3 & 4) == 0) {
            this.c = j10 / 1000;
        } else {
            this.c = j12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && this.a == ((h1) obj).a;
    }

    public final int hashCode() {
        long j10 = this.a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public h1(long j10) {
        this.a = j10;
        long j11 = 1000;
        this.b = j10 * j11;
        this.c = j10 / j11;
    }
}
