package c3;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f {
    public final long a;
    public final long b;
    public final long c;
    public long d = 0;
    public long e;
    public long f;
    public long g;
    public long h;

    public f(long j3, long j10, long j11, long j12, long j13, long j14) {
        this.a = j3;
        this.b = j10;
        this.e = j11;
        this.f = j12;
        this.g = j13;
        this.c = j14;
        this.h = a(j10, 0L, j11, j12, j13, j14);
    }

    public static long a(long j3, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || j10 + 1 >= j11) {
            return j12;
        }
        long j15 = (long) ((j3 - j10) * ((j13 - j12) / (j11 - j10)));
        return e2.d0.i(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
    }
}
