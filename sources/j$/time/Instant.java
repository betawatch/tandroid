package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class Instant implements Temporal, j$.time.temporal.m, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    static {
        v(-31557014167219200L, 0L);
        v(31556889864403199L, 999999999L);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant now() {
        b.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant o(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant ofEpochMilli(long j) {
        return o(a.Q(j, 1000L), ((int) a.P(j, 1000L)) * 1000000);
    }

    public static Instant q(j$.time.temporal.l lVar) {
        if (lVar instanceof Instant) {
            return (Instant) lVar;
        }
        Objects.requireNonNull(lVar, "temporal");
        try {
            return v(lVar.y(j$.time.temporal.a.INSTANT_SECONDS), lVar.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            g.g("Unable to obtain Instant from TemporalAccessor: ", lVar, lVar.getClass().getName(), e);
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Instant v(long j, long j2) {
        return o(a.N(j, a.Q(j2, 1000000000L)), (int) a.P(j2, 1000000000L));
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    public final long C(Instant instant) {
        long S = a.S(instant.a, this.a);
        long j = instant.b - this.b;
        return (S <= 0 || j >= 0) ? (S >= 0 || j <= 0) ? S : S + 1 : S - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.o(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.requireNonNull(this, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.n(this.a, this.b, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (Instant) oVar.n(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.o(j);
        int i = e.a[aVar.ordinal()];
        if (i == 1) {
            return j != ((long) this.b) ? o(this.a, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.b ? o(this.a, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.b ? o(this.a, i3) : this;
        }
        if (i == 4) {
            return j != this.a ? o(j, this.b) : this;
        }
        throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        return compare != 0 ? compare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.NANO_OF_SECOND || oVar == j$.time.temporal.a.MICRO_OF_SECOND || oVar == j$.time.temporal.a.MILLI_OF_SECOND : oVar != null && oVar.j(this);
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

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Instant q = q(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, q);
        }
        switch (e.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return a.N(a.R(a.S(q.a, this.a), 1000000000L), q.b - this.b);
            case 2:
                return a.N(a.R(a.S(q.a, this.a), 1000000000L), q.b - this.b) / 1000;
            case 3:
                return a.S(q.toEpochMilli(), toEpochMilli());
            case 4:
                return C(q);
            case 5:
                return C(q) / 60;
            case 6:
                return C(q) / 3600;
            case 7:
                return C(q) / 43200;
            case 8:
                return C(q) / 86400;
            default:
                g.b(qVar, "Unsupported unit: ");
                return 0L;
        }
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.p.d(this, oVar).a(oVar.l(this), oVar);
        }
        int i = e.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (Instant) a.a(localDate, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(this.a, j$.time.temporal.a.INSTANT_SECONDS).c(this.b, j$.time.temporal.a.NANO_OF_SECOND);
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

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? a.N(a.R(j, 1000L), this.b / 1000000) : a.N(a.R(j + 1, 1000L), (this.b / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = d(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.d(j2, chronoUnit);
    }

    public final Instant w(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return v(a.N(a.N(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (Instant) qVar.j(this, j);
        }
        switch (e.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return w(0L, j);
            case 2:
                return w(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return w(j / 1000, (j % 1000) * 1000000);
            case 4:
                return w(j, 0L);
            case 5:
                return w(a.R(j, 60L), 0L);
            case 6:
                return w(a.R(j, 3600L), 0L);
            case 7:
                return w(a.R(j, 43200L), 0L);
            case 8:
                return w(a.R(j, 86400L), 0L);
            default:
                g.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        int i;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        int i2 = e.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
            }
            i = this.b / 1000000;
        }
        return i;
    }
}
