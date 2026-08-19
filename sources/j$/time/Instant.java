package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.m, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

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
        I(-31557014167219200L, 0L);
        I(31556889864403199L, 999999999L);
    }

    public static Instant I(long j, long j2) {
        return E(j$.com.android.tools.r8.a.O(j, j$.com.android.tools.r8.a.S(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.R(j2, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        return E(j$.com.android.tools.r8.a.S(j, j2), ((int) j$.com.android.tools.r8.a.R(j, j2)) * MediaController.VIDEO_BITRATE_480);
    }

    public static Instant H(j$.time.temporal.l lVar) {
        if (lVar instanceof Instant) {
            return (Instant) lVar;
        }
        Objects.requireNonNull(lVar, "temporal");
        try {
            return I(lVar.u(j$.time.temporal.a.INSTANT_SECONDS), lVar.o(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.requireNonNull(this, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.x(this.a, this.b, zoneId);
    }

    public static Instant E(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.NANO_OF_SECOND || oVar == j$.time.temporal.a.MICRO_OF_SECOND || oVar == j$.time.temporal.a.MILLI_OF_SECOND : oVar != null && oVar.p(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.p.d(this, oVar).a(oVar.o(this), oVar);
        }
        int i = d.a[((j$.time.temporal.a) oVar).ordinal()];
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
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        int i;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.o(this);
        }
        int i2 = d.a[((j$.time.temporal.a) oVar).ordinal()];
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
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
            }
            i = i3 / MediaController.VIDEO_BITRATE_480;
        }
        return i;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal e(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (Instant) oVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.x(j);
        int i = d.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                if (i3 != i2) {
                    return E(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * MediaController.VIDEO_BITRATE_480;
                if (i4 != i2) {
                    return E(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
                }
                if (j != j2) {
                    return E(j, i2);
                }
            }
        } else if (j != i2) {
            return E(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final Instant f(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (Instant) qVar.l(this, j);
        }
        switch (d.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return J(0L, j);
            case 2:
                return J(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return J(j / 1000, (j % 1000) * 1000000);
            case 4:
                return J(j, 0L);
            case 5:
                return J(j$.com.android.tools.r8.a.T(j, 60), 0L);
            case 6:
                return J(j$.com.android.tools.r8.a.T(j, 3600), 0L);
            case 7:
                return J(j$.com.android.tools.r8.a.T(j, 43200), 0L);
            case 8:
                return J(j$.com.android.tools.r8.a.T(j, 86400), 0L);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final Instant J(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return I(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.O(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.NANOS;
        }
        if (aVar == j$.time.temporal.p.b || aVar == j$.time.temporal.p.a || aVar == j$.time.temporal.p.e || aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.f || aVar == j$.time.temporal.p.g) {
            return null;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
        return temporal.e(this.a, j$.time.temporal.a.INSTANT_SECONDS).e(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Instant H = H(temporal);
        if (qVar instanceof ChronoUnit) {
            int i = d.b[((ChronoUnit) qVar).ordinal()];
            int i2 = this.b;
            long j = this.a;
            switch (i) {
                case 1:
                    return j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.T(j$.com.android.tools.r8.a.U(H.a, j), 1000000000L), H.b - i2);
                case 2:
                    return j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.T(j$.com.android.tools.r8.a.U(H.a, j), 1000000000L), H.b - i2) / 1000;
                case 3:
                    return j$.com.android.tools.r8.a.U(H.toEpochMilli(), toEpochMilli());
                case 4:
                    return L(H);
                case 5:
                    return L(H) / 60;
                case 6:
                    return L(H) / 3600;
                case 7:
                    return L(H) / 43200;
                case 8:
                    return L(H) / 86400;
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + qVar);
            }
        }
        return qVar.between(this, H);
    }

    public final long L(Instant instant) {
        long U = j$.com.android.tools.r8.a.U(instant.a, this.a);
        long j = instant.b - this.b;
        return (U <= 0 || j >= 0) ? (U >= 0 || j <= 0) ? U : U + 1 : U - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.E(this, zoneOffset);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.T(j, MediaDataController.MAX_STYLE_RUNS_COUNT), i / MediaController.VIDEO_BITRATE_480) : j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.T(j + 1, MediaDataController.MAX_STYLE_RUNS_COUNT), (i / MediaController.VIDEO_BITRATE_480) - MediaDataController.MAX_STYLE_RUNS_COUNT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    private Object writeReplace() {
        return new p((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
