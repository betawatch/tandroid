package g2;

import b8.zb;
import java.math.RoundingMode;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l0 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public l0(long j10) {
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
                    Long l10 = (Long) this.d.get();
                    l10.getClass();
                    j11 = l10.longValue();
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
                String str = n0.a;
                long a02 = n0.a0(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + a02) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - a02) < Math.abs(j14 - a02) ? j13 : j14;
            }
            long j15 = j10;
            String str2 = n0.a;
            return a(n0.a0(j15, 1000000L, 90000L, RoundingMode.DOWN));
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
            String str = n0.a;
            long a02 = n0.a0(j11, 90000L, 1000000L, RoundingMode.DOWN);
            long j12 = a02 / 8589934592L;
            Long.signum(j12);
            long j13 = (j12 * 8589934592L) + j10;
            j10 = j13 >= a02 ? j13 : ((j12 + 1) * 8589934592L) + j10;
        }
        long j14 = j10;
        String str2 = n0.a;
        return a(n0.a0(j14, 1000000L, 90000L, RoundingMode.DOWN));
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
            zb.p(this.a == 9223372036854775806L);
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
