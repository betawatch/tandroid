package h2;

import a8.ia;
import java.math.RoundingMode;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class k0 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public k0(long j3) {
        g(j3);
    }

    public final synchronized long a(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j10 = this.a;
                if (j10 == 9223372036854775806L) {
                    Long l10 = (Long) this.d.get();
                    l10.getClass();
                    j10 = l10.longValue();
                }
                this.b = j10 - j3;
                notifyAll();
            }
            this.c = j3;
            return j3 + this.b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.c;
            if (j10 != -9223372036854775807L) {
                String str = m0.a;
                long a02 = m0.a0(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = (4294967296L + a02) / 8589934592L;
                long j12 = ((j11 - 1) * 8589934592L) + j3;
                long j13 = (j11 * 8589934592L) + j3;
                j3 = Math.abs(j12 - a02) < Math.abs(j13 - a02) ? j12 : j13;
            }
            long j14 = j3;
            String str2 = m0.a;
            return a(m0.a0(j14, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.c;
        if (j10 != -9223372036854775807L) {
            String str = m0.a;
            long a02 = m0.a0(j10, 90000L, 1000000L, RoundingMode.DOWN);
            long j11 = a02 / 8589934592L;
            Long.signum(j11);
            long j12 = (j11 * 8589934592L) + j3;
            j3 = j12 >= a02 ? j12 : ((j11 + 1) * 8589934592L) + j3;
        }
        long j13 = j3;
        String str2 = m0.a;
        return a(m0.a0(j13, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j3;
        j3 = this.a;
        if (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) {
            j3 = -9223372036854775807L;
        }
        return j3;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized boolean f() {
        return this.b != -9223372036854775807L;
    }

    public final synchronized void g(long j3) {
        this.a = j3;
        this.b = j3 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized void h(long j3, boolean z9) {
        try {
            ia.p(this.a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z9) {
                this.d.set(Long.valueOf(j3));
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
