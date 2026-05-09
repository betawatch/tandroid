package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.n, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        return compare != 0 ? compare : this.b - instant2.b;
    }

    static {
        K(-31557014167219200L, 0L);
        K(31556889864403199L, 999999999L);
    }

    public static Instant K(long j, long j2) {
        return G(j$.com.android.tools.r8.a.f(j, j$.com.android.tools.r8.a.k(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.j(j2, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        return G(j$.com.android.tools.r8.a.k(j, j2), ((int) j$.com.android.tools.r8.a.j(j, j2)) * MediaController.VIDEO_BITRATE_480);
    }

    public static Instant H(j$.time.temporal.m mVar) {
        if (mVar instanceof Instant) {
            return (Instant) mVar;
        }
        Objects.requireNonNull(mVar, "temporal");
        try {
            return K(mVar.r(j$.time.temporal.a.INSTANT_SECONDS), mVar.l(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName(), e);
        }
    }

    private static Instant G(long j, int i) {
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

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND : pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.l.d(this, pVar).a(pVar.l(this), pVar);
        }
        int i = e.a[((j$.time.temporal.a) pVar).ordinal()];
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
            j$.time.temporal.a.INSTANT_SECONDS.x(this.a);
        }
        throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i2 = e.a[((j$.time.temporal.a) pVar).ordinal()];
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
                throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
            }
            i = i3 / MediaController.VIDEO_BITRATE_480;
        }
        return i;
    }

    public final long I() {
        return this.a;
    }

    public final int J() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.G(j);
        int i = e.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                if (i3 != i2) {
                    return G(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * MediaController.VIDEO_BITRATE_480;
                if (i4 != i2) {
                    return G(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
                }
                if (j != j2) {
                    return G(j, i2);
                }
            }
        } else if (j != i2) {
            return G(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return (Instant) sVar.k(this, j);
        }
        switch (e.b[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                return L(0L, j);
            case 2:
                return L(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return L(j / 1000, (j % 1000) * 1000000);
            case 4:
                return L(j, 0L);
            case 5:
                return L(j$.com.android.tools.r8.a.l(j, 60), 0L);
            case 6:
                return L(j$.com.android.tools.r8.a.l(j, 3600), 0L);
            case 7:
                return L(j$.com.android.tools.r8.a.l(j, 43200), 0L);
            case 8:
                return L(j$.com.android.tools.r8.a.l(j, 86400), 0L);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    private Instant L(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return K(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final Object v(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        if (rVar == j$.time.temporal.l.e() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.f() || rVar == j$.time.temporal.l.g()) {
            return null;
        }
        return rVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final Temporal x(Temporal temporal) {
        return temporal.d(this.a, j$.time.temporal.a.INSTANT_SECONDS).d(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        Instant H = H(temporal);
        if (sVar instanceof ChronoUnit) {
            int i = e.b[((ChronoUnit) sVar).ordinal()];
            int i2 = this.b;
            long j = this.a;
            switch (i) {
                case 1:
                    return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(H.a, j), 1000000000L), H.b - i2);
                case 2:
                    return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(H.a, j), 1000000000L), H.b - i2) / 1000;
                case 3:
                    return j$.com.android.tools.r8.a.m(H.toEpochMilli(), toEpochMilli());
                case 4:
                    return N(H);
                case 5:
                    return N(H) / 60;
                case 6:
                    return N(H) / 3600;
                case 7:
                    return N(H) / 43200;
                case 8:
                    return N(H) / 86400;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return sVar.between(this, H);
    }

    private long N(Instant instant) {
        long m = j$.com.android.tools.r8.a.m(instant.a, this.a);
        long j = instant.b - this.b;
        return (m <= 0 || j >= 0) ? (m >= 0 || j <= 0) ? m : m + 1 : m - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.H(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.H(this, zoneId);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT), i / MediaController.VIDEO_BITRATE_480) : j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j + 1, MediaDataController.MAX_STYLE_RUNS_COUNT), (i / MediaController.VIDEO_BITRATE_480) - MediaDataController.MAX_STYLE_RUNS_COUNT);
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

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void O(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }
}
