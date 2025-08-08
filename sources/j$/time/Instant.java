package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.p;
import j$.time.temporal.q;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.k, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private final long a;
    private final int b;

    public static Instant now() {
        new a(ZoneOffset.UTC);
        return q(System.currentTimeMillis());
    }

    static {
        r(-31557014167219200L, 0L);
        r(31556889864403199L, 999999999L);
    }

    public static Instant r(long j, long j2) {
        return m(j$.com.android.tools.r8.a.f(j, j$.com.android.tools.r8.a.i(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.h(j2, 1000000000L));
    }

    public static Instant q(long j) {
        return m(j$.com.android.tools.r8.a.i(j, 1000L), ((int) j$.com.android.tools.r8.a.h(j, 1000L)) * MediaController.VIDEO_BITRATE_480);
    }

    public static Instant n(j$.time.temporal.k kVar) {
        if (kVar instanceof Instant) {
            return (Instant) kVar;
        }
        try {
            return r(kVar.f(j$.time.temporal.a.INSTANT_SECONDS), kVar.h(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName(), e);
        }
    }

    private static Instant m(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.NANO_OF_SECOND || lVar == j$.time.temporal.a.MICRO_OF_SECOND || lVar == j$.time.temporal.a.MILLI_OF_SECOND : lVar != null && lVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final q i(j$.time.temporal.a aVar) {
        return j$.time.temporal.j.c(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.a aVar) {
        if (!(aVar instanceof j$.time.temporal.a)) {
            q c2 = j$.time.temporal.j.c(this, aVar);
            aVar.getClass();
            return c2.a(f(aVar), aVar);
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
            j$.time.temporal.a.INSTANT_SECONDS.i(this.a);
        }
        throw new p("Unsupported field: " + aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        int i;
        if (lVar instanceof j$.time.temporal.a) {
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
        return lVar.f(this);
    }

    public final long o() {
        return this.a;
    }

    public final int p() {
        return this.b;
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.h()) {
            return j$.time.temporal.b.NANOS;
        }
        if (nVar == j$.time.temporal.j.d() || nVar == j$.time.temporal.j.j() || nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.g() || nVar == j$.time.temporal.j.e() || nVar == j$.time.temporal.j.f()) {
            return null;
        }
        return nVar.a(this);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m(this, zoneOffset);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        if (j < 0 && i > 0) {
            return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.e(j + 1), (i / MediaController.VIDEO_BITRATE_480) - 1000);
        }
        return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.e(j), i / MediaController.VIDEO_BITRATE_480);
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.a, instant.a);
        return compare != 0 ? compare : this.b - instant.b;
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

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }
}
