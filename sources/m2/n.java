package m2;

import e2.d0;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class n extends s {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    public n(j jVar, long j3, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(jVar, j3, j10);
        this.d = j11;
        this.e = j12;
        this.f = list;
        this.i = j13;
        this.g = j14;
        this.h = j15;
    }

    public final long b(long j3, long j10) {
        long d = d(j3);
        return d != -1 ? d : (int) (f((j10 - this.h) + this.i, j3) - c(j3, j10));
    }

    public final long c(long j3, long j10) {
        long d = d(j3);
        long j11 = this.d;
        if (d == -1) {
            long j12 = this.g;
            if (j12 != -9223372036854775807L) {
                return Math.max(j11, f((j10 - this.h) - j12, j3));
            }
        }
        return j11;
    }

    public abstract long d(long j3);

    public final long e(long j3, long j10) {
        long j11 = this.b;
        long j12 = this.d;
        List list = this.f;
        if (list != null) {
            return (((q) list.get((int) (j3 - j12))).b * 1000000) / j11;
        }
        long d = d(j10);
        return (d == -1 || j3 != (j12 + d) - 1) ? (this.e * 1000000) / j11 : j10 - g(j3);
    }

    public final long f(long j3, long j10) {
        long d = d(j10);
        long j11 = this.d;
        if (d != 0) {
            if (this.f != null) {
                long j12 = (d + j11) - 1;
                long j13 = j11;
                while (j13 <= j12) {
                    long j14 = ((j12 - j13) / 2) + j13;
                    long g10 = g(j14);
                    if (g10 < j3) {
                        j13 = j14 + 1;
                    } else {
                        if (g10 <= j3) {
                            return j14;
                        }
                        j12 = j14 - 1;
                    }
                }
                return j13 == j11 ? j13 : j12;
            }
            long j15 = (j3 / ((this.e * 1000000) / this.b)) + j11;
            if (j15 >= j11) {
                return d == -1 ? j15 : Math.min(j15, (j11 + d) - 1);
            }
        }
        return j11;
    }

    public final long g(long j3) {
        long j10 = this.d;
        List list = this.f;
        long j11 = list != null ? ((q) list.get((int) (j3 - j10))).a - this.c : (j3 - j10) * this.e;
        String str = d0.a;
        return d0.Y(j11, 1000000L, this.b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j3);

    public boolean i() {
        return this.f != null;
    }
}
