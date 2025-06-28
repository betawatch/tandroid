package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.util.A;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.k, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private final long a;
    private final int b;

    static {
        s(-31557014167219200L, 0L);
        s(31556889864403199L, 999999999L);
    }

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant n(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant now() {
        b.b();
        return r(System.currentTimeMillis());
    }

    public static Instant o(j$.time.temporal.k kVar) {
        if (kVar instanceof Instant) {
            return (Instant) kVar;
        }
        A.z(kVar, "temporal");
        try {
            return s(kVar.h(j$.time.temporal.a.INSTANT_SECONDS), kVar.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName(), e);
        }
    }

    public static Instant r(long j) {
        return n(j$.com.android.tools.r8.a.j(j, 1000L), ((int) j$.com.android.tools.r8.a.i(j, 1000L)) * MediaController.VIDEO_BITRATE_480);
    }

    public static Instant s(long j, long j2) {
        return n(j$.com.android.tools.r8.a.g(j, j$.com.android.tools.r8.a.j(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.i(j2, 1000000000L));
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.n(this, zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.a == instant.a && this.b == instant.b;
    }

    @Override // j$.time.temporal.k
    public final q f(j$.time.temporal.l lVar) {
        return j$.time.temporal.j.c(this, lVar);
    }

    @Override // j$.time.temporal.k
    public final long h(j$.time.temporal.l lVar) {
        int i;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.h(this);
        }
        int i2 = e.a[((j$.time.temporal.a) lVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / MediaDataController.MAX_STYLE_RUNS_COUNT;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new p("Unsupported field: " + lVar);
            }
            i = i3 / MediaController.VIDEO_BITRATE_480;
        }
        return i;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.k
    public final Object i(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.h()) {
            return j$.time.temporal.b.NANOS;
        }
        if (nVar == j$.time.temporal.j.d() || nVar == j$.time.temporal.j.j() || nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.g() || nVar == j$.time.temporal.j.e() || nVar == j$.time.temporal.j.f()) {
            return null;
        }
        return nVar.a(this);
    }

    @Override // j$.time.temporal.k
    public final int j(j$.time.temporal.a aVar) {
        if (!(aVar instanceof j$.time.temporal.a)) {
            q c2 = j$.time.temporal.j.c(this, aVar);
            aVar.getClass();
            return c2.a(h(aVar), aVar);
        }
        int i = e.a[aVar.ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        if (i == 3) {
            return i2 / MediaController.VIDEO_BITRATE_480;
        }
        if (i == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.m(this.a);
        }
        throw new p("Unsupported field: " + aVar);
    }

    @Override // j$.time.temporal.k
    public final boolean k(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.NANO_OF_SECOND || lVar == j$.time.temporal.a.MICRO_OF_SECOND || lVar == j$.time.temporal.a.MILLI_OF_SECOND : lVar != null && lVar.i(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.a, instant.a);
        return compare != 0 ? compare : this.b - instant.b;
    }

    public final long p() {
        return this.a;
    }

    public final int q() {
        return this.b;
    }

    public long toEpochMilli() {
        long f;
        int i;
        int i2 = this.b;
        long j = this.a;
        if (j >= 0 || i2 <= 0) {
            f = j$.com.android.tools.r8.a.f(j);
            i = i2 / MediaController.VIDEO_BITRATE_480;
        } else {
            f = j$.com.android.tools.r8.a.f(j + 1);
            i = (i2 / MediaController.VIDEO_BITRATE_480) - 1000;
        }
        return j$.com.android.tools.r8.a.g(f, i);
    }

    public final String toString() {
        return DateTimeFormatter.f.a(this);
    }
}
