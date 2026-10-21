package e2;

import java.math.RoundingMode;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class k0 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public k0(long j10) {
        g(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j11 = this.a;
                if (j11 == 9223372036854775806L) {
                    Long l4 = (Long) this.d.get();
                    l4.getClass();
                    j11 = l4.longValue();
                }
                this.b = j11 - j10;
                notifyAll();
            }
            this.c = j10;
            return j10 + this.b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.c;
            if (j11 != -9223372036854775807L) {
                String str = m0.a;
                long a02 = m0.a0(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + a02) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - a02) < Math.abs(j14 - a02) ? j13 : j14;
            }
            long j15 = j10;
            String str2 = m0.a;
            return a(m0.a0(j15, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.c;
        if (j11 != -9223372036854775807L) {
            String str = m0.a;
            long a02 = m0.a0(j11, 90000L, 1000000L, RoundingMode.DOWN);
            long j12 = a02 / 8589934592L;
            Long.signum(j12);
            long j13 = (j12 * 8589934592L) + j10;
            j10 = j13 >= a02 ? j13 : ((j12 + 1) * 8589934592L) + j10;
        }
        long j14 = j10;
        String str2 = m0.a;
        return a(m0.a0(j14, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j10;
        j10 = this.a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized boolean f() {
        return this.b != -9223372036854775807L;
    }

    public final synchronized void g(long j10) {
        this.a = j10;
        this.b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized void h(long j10, boolean z10) {
        try {
            u6.p(this.a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z10) {
                this.d.set(Long.valueOf(j10));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
