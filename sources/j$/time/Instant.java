package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

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

    public static Instant I(long j3, long j10) {
        return G(j$.com.android.tools.r8.a.N(j3, j$.com.android.tools.r8.a.R(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.Q(j10, 1000000000L));
    }

    public static Instant ofEpochMilli(long j3) {
        long j10 = 1000;
        return G(j$.com.android.tools.r8.a.R(j3, j10), ((int) j$.com.android.tools.r8.a.Q(j3, j10)) * 1000000);
    }

    public static Instant H(j$.time.temporal.l lVar) {
        if (lVar instanceof Instant) {
            return (Instant) lVar;
        }
        Objects.requireNonNull(lVar, "temporal");
        try {
            return I(lVar.y(j$.time.temporal.a.INSTANT_SECONDS), lVar.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e10) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e10);
        }
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.requireNonNull(this, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.q(this.a, this.b, zoneId);
    }

    public static Instant G(long j3, int i7) {
        if ((i7 | j3) == 0) {
            return c;
        }
        if (j3 < -31557014167219200L || j3 > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j3, i7);
    }

    public Instant(long j3, int i7) {
        this.a = j3;
        this.b = i7;
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
        int i7 = d.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i7 == 1) {
            return this.b;
        }
        if (i7 == 2) {
            return this.b / 1000;
        }
        if (i7 == 3) {
            return this.b / 1000000;
        }
        if (i7 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        int i7;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        int i10 = d.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i10 == 1) {
            i7 = this.b;
        } else if (i10 == 2) {
            i7 = this.b / 1000;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
            }
            i7 = this.b / 1000000;
        }
        return i7;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j3, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (Instant) oVar.q(this, j3);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.w(j3);
        int i7 = d.a[aVar.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                int i10 = ((int) j3) * 1000;
                if (i10 != this.b) {
                    return G(this.a, i10);
                }
            } else if (i7 == 3) {
                int i11 = ((int) j3) * 1000000;
                if (i11 != this.b) {
                    return G(this.a, i11);
                }
            } else {
                if (i7 != 4) {
                    throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
                }
                if (j3 != this.a) {
                    return G(j3, this.b);
                }
            }
        } else if (j3 != this.b) {
            return G(this.a, (int) j3);
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j3, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (Instant) qVar.j(this, j3);
        }
        switch (d.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return J(0L, j3);
            case 2:
                return J(j3 / 1000000, (j3 % 1000000) * 1000);
            case 3:
                return J(j3 / 1000, (j3 % 1000) * 1000000);
            case 4:
                return J(j3, 0L);
            case 5:
                return J(j$.com.android.tools.r8.a.S(j3, 60), 0L);
            case 6:
                return J(j$.com.android.tools.r8.a.S(j3, 3600), 0L);
            case 7:
                return J(j$.com.android.tools.r8.a.S(j3, 43200), 0L);
            case 8:
                return J(j$.com.android.tools.r8.a.S(j3, 86400), 0L);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final Instant J(long j3, long j10) {
        if ((j3 | j10) == 0) {
            return this;
        }
        return I(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(this.a, j3), j10 / 1000000000), this.b + (j10 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j3, ChronoUnit chronoUnit) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j3, chronoUnit);
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
                return j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.S(j$.com.android.tools.r8.a.T(H.a, this.a), 1000000000L), H.b - this.b);
            case 2:
                return j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.S(j$.com.android.tools.r8.a.T(H.a, this.a), 1000000000L), H.b - this.b) / 1000;
            case 3:
                return j$.com.android.tools.r8.a.T(H.toEpochMilli(), toEpochMilli());
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
        long T = j$.com.android.tools.r8.a.T(instant.a, this.a);
        long j3 = instant.b - this.b;
        return (T <= 0 || j3 >= 0) ? (T >= 0 || j3 <= 0) ? T : T + 1 : T - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.G(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j3 = this.a;
        return (j3 >= 0 || this.b <= 0) ? j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.S(j3, 1000), this.b / 1000000) : j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.S(j3 + 1, 1000), (this.b / 1000000) - 1000);
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
        long j3 = this.a;
        return (this.b * 51) + ((int) (j3 ^ (j3 >>> 32)));
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
