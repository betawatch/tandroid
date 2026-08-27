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

    public static Instant I(long j10, long j11) {
        return G(j$.com.android.tools.r8.a.O(j10, j$.com.android.tools.r8.a.S(j11, 1000000000L)), (int) j$.com.android.tools.r8.a.R(j11, 1000000000L));
    }

    public static Instant ofEpochMilli(long j10) {
        long j11 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        return G(j$.com.android.tools.r8.a.S(j10, j11), ((int) j$.com.android.tools.r8.a.R(j10, j11)) * MediaController.VIDEO_BITRATE_480);
    }

    public static Instant H(j$.time.temporal.l lVar) {
        if (lVar instanceof Instant) {
            return (Instant) lVar;
        }
        Objects.requireNonNull(lVar, "temporal");
        try {
            return I(lVar.y(j$.time.temporal.a.INSTANT_SECONDS), lVar.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e9) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e9);
        }
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.requireNonNull(this, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.q(this.a, this.b, zoneId);
    }

    public static Instant G(long j10, int i10) {
        if ((i10 | j10) == 0) {
            return c;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i10);
    }

    public Instant(long j10, int i10) {
        this.a = j10;
        this.b = i10;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.NANO_OF_SECOND || oVar == j$.time.temporal.a.MICRO_OF_SECOND || oVar == j$.time.temporal.a.MILLI_OF_SECOND : oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.p.d(this, oVar).a(oVar.m(this), oVar);
        }
        int i10 = d.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i10 == 1) {
            return this.b;
        }
        if (i10 == 2) {
            return this.b / MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        if (i10 == 3) {
            return this.b / MediaController.VIDEO_BITRATE_480;
        }
        if (i10 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        int i10;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        int i11 = d.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i11 == 1) {
            i10 = this.b;
        } else if (i11 == 2) {
            i10 = this.b / MediaDataController.MAX_STYLE_RUNS_COUNT;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
            }
            i10 = this.b / MediaController.VIDEO_BITRATE_480;
        }
        return i10;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (Instant) oVar.q(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.w(j10);
        int i10 = d.a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = ((int) j10) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                if (i11 != this.b) {
                    return G(this.a, i11);
                }
            } else if (i10 == 3) {
                int i12 = ((int) j10) * MediaController.VIDEO_BITRATE_480;
                if (i12 != this.b) {
                    return G(this.a, i12);
                }
            } else {
                if (i10 != 4) {
                    throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
                }
                if (j10 != this.a) {
                    return G(j10, this.b);
                }
            }
        } else if (j10 != this.b) {
            return G(this.a, (int) j10);
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (Instant) qVar.j(this, j10);
        }
        switch (d.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return J(0L, j10);
            case 2:
                return J(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return J(j10 / 1000, (j10 % 1000) * 1000000);
            case 4:
                return J(j10, 0L);
            case 5:
                return J(j$.com.android.tools.r8.a.T(j10, 60), 0L);
            case 6:
                return J(j$.com.android.tools.r8.a.T(j10, 3600), 0L);
            case 7:
                return J(j$.com.android.tools.r8.a.T(j10, 43200), 0L);
            case 8:
                return J(j$.com.android.tools.r8.a.T(j10, 86400), 0L);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final Instant J(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return I(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.O(this.a, j10), j11 / 1000000000), this.b + (j11 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.NANOS;
        }
        if (aVar == j$.time.temporal.p.b || aVar == j$.time.temporal.p.a || aVar == j$.time.temporal.p.e || aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.f || aVar == j$.time.temporal.p.g) {
            return null;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        return temporal.c(this.a, j$.time.temporal.a.INSTANT_SECONDS).c(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Instant H = H(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, H);
        }
        switch (d.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.T(j$.com.android.tools.r8.a.U(H.a, this.a), 1000000000L), H.b - this.b);
            case 2:
                return j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.T(j$.com.android.tools.r8.a.U(H.a, this.a), 1000000000L), H.b - this.b) / 1000;
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

    public final long L(Instant instant) {
        long U = j$.com.android.tools.r8.a.U(instant.a, this.a);
        long j10 = instant.b - this.b;
        return (U <= 0 || j10 >= 0) ? (U >= 0 || j10 <= 0) ? U : U + 1 : U - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.G(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j10 = this.a;
        return (j10 >= 0 || this.b <= 0) ? j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.T(j10, MediaDataController.MAX_STYLE_RUNS_COUNT), this.b / MediaController.VIDEO_BITRATE_480) : j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.T(j10 + 1, MediaDataController.MAX_STYLE_RUNS_COUNT), (this.b / MediaController.VIDEO_BITRATE_480) - MediaDataController.MAX_STYLE_RUNS_COUNT);
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
        long j10 = this.a;
        return (this.b * 51) + ((int) (j10 ^ (j10 >>> 32)));
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
