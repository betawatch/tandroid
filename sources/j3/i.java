package j3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i {
    public final long a;
    public final long b;
    public long c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public float j = 0.97f;
    public float i = 1.03f;
    public float k = 1.0f;
    public long l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long m = -9223372036854775807L;
    public long n = -9223372036854775807L;

    public i(long j10, long j11) {
        this.a = j10;
        this.b = j11;
    }

    public final void a() {
        long j10 = this.c;
        if (j10 != -9223372036854775807L) {
            long j11 = this.d;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.g;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.e == j10) {
            return;
        }
        this.e = j10;
        this.h = j10;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }
}
