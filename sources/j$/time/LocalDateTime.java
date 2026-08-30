package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.m, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = J(LocalDate.d, h.e);
    public static final LocalDateTime d = J(LocalDate.e, h.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final h b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.w(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.y(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.k a() {
        return ((LocalDate) f()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime n(ZoneOffset zoneOffset) {
        return ZonedDateTime.H(this, zoneOffset, null);
    }

    public static LocalDateTime J(LocalDate localDate, h hVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(hVar, "time");
        return new LocalDateTime(localDate, hVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        return temporal.c(((LocalDate) f()).z(), j$.time.temporal.a.EPOCH_DAY).c(b().R(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime K(long j10, int i10, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        j$.time.temporal.a.NANO_OF_SECOND.w(j11);
        return new LocalDateTime(LocalDate.R(j$.com.android.tools.r8.a.S(j10 + zoneOffset.getTotalSeconds(), 86400)), h.K((((int) j$.com.android.tools.r8.a.R(r5, r7)) * 1000000000) + j11));
    }

    public static LocalDateTime H(j$.time.temporal.l lVar) {
        if (lVar instanceof LocalDateTime) {
            return (LocalDateTime) lVar;
        }
        if (lVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) lVar).r();
        }
        if (lVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) lVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.I(lVar), h.I(lVar));
        } catch (b e) {
            throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public LocalDateTime(LocalDate localDate, h hVar) {
        this.a = localDate;
        this.b = hVar;
    }

    public final LocalDateTime P(LocalDate localDate, h hVar) {
        return (this.a == localDate && this.b == hVar) ? this : new LocalDateTime(localDate, hVar);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.isDateBased() || aVar.y();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).y()) {
                h hVar = this.b;
                hVar.getClass();
                return j$.time.temporal.p.d(hVar, oVar);
            }
            return this.a.l(oVar);
        }
        return oVar.k(this);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).y() ? this.b.j(oVar) : this.a.j(oVar);
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).y() ? this.b.y(oVar) : this.a.y(oVar);
        }
        return oVar.m(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.b f() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final h b() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime k(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return P((LocalDate) mVar, this.b);
        }
        if (mVar instanceof h) {
            return P(this.a, (h) mVar);
        }
        if (mVar instanceof LocalDateTime) {
            return (LocalDateTime) mVar;
        }
        return (LocalDateTime) mVar.q(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).y()) {
                return P(this.a, this.b.c(j10, oVar));
            }
            return P(this.a.c(j10, oVar), this.b);
        }
        return (LocalDateTime) oVar.q(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (LocalDateTime) qVar.j(this, j10);
        }
        switch (f.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return N(this.a, 0L, 0L, 0L, j10);
            case 2:
                LocalDateTime P = P(this.a.plusDays(j10 / 86400000000L), this.b);
                return P.N(P.a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                LocalDateTime P2 = P(this.a.plusDays(j10 / 86400000), this.b);
                return P2.N(P2.a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
            case 4:
                return M(j10);
            case 5:
                return N(this.a, 0L, j10, 0L, 0L);
            case 6:
                return N(this.a, j10, 0L, 0L, 0L);
            case 7:
                LocalDateTime P3 = P(this.a.plusDays(j10 / 256), this.b);
                return P3.N(P3.a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return P(this.a.d(j10, qVar), this.b);
        }
    }

    public final LocalDateTime M(long j10) {
        return N(this.a, 0L, 0L, j10, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    public final LocalDateTime N(LocalDate localDate, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return P(localDate, this.b);
        }
        long j14 = 1;
        long R = this.b.R();
        long j15 = ((((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L)) * j14) + R;
        long S = j$.com.android.tools.r8.a.S(j15, 86400000000000L) + (((j10 / 24) + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L)) * j14);
        long R2 = j$.com.android.tools.r8.a.R(j15, 86400000000000L);
        return P(localDate.plusDays(S), R2 == R ? this.b : h.K(R2));
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.f) {
            return this.a;
        }
        return j$.com.android.tools.r8.a.t(this, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r0.G(r1) > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        if (r0.N(r8.a) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ee, code lost:
    
        if (r9.b.compareTo(r8.b) <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        r0 = r0.plusDays(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        return r8.a.g(r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r9.b.compareTo(r8.b) >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r0 = r0.plusDays(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r0.z() > r1.z()) goto L33;
     */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        long j10;
        long j11;
        LocalDateTime H = H(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, H);
        }
        ChronoUnit chronoUnit = (ChronoUnit) qVar;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) < 0) {
            LocalDate localDate = this.a;
            LocalDate localDate2 = H.a;
            localDate.getClass();
            long z4 = localDate2.z() - localDate.z();
            if (z4 == 0) {
                return this.b.g(H.b, qVar);
            }
            long R = H.b.R() - this.b.R();
            if (z4 > 0) {
                j10 = z4 - 1;
                j11 = R + 86400000000000L;
            } else {
                j10 = z4 + 1;
                j11 = R - 86400000000000L;
            }
            switch (f.a[chronoUnit.ordinal()]) {
                case 1:
                    j10 = j$.com.android.tools.r8.a.T(j10, 86400000000000L);
                    break;
                case 2:
                    j10 = j$.com.android.tools.r8.a.T(j10, 86400000000L);
                    j11 /= 1000;
                    break;
                case 3:
                    j10 = j$.com.android.tools.r8.a.T(j10, 86400000L);
                    j11 /= 1000000;
                    break;
                case 4:
                    j10 = j$.com.android.tools.r8.a.T(j10, 86400);
                    j11 /= 1000000000;
                    break;
                case 5:
                    j10 = j$.com.android.tools.r8.a.T(j10, 1440);
                    j11 /= 60000000000L;
                    break;
                case 6:
                    j10 = j$.com.android.tools.r8.a.T(j10, 24);
                    j11 /= 3600000000000L;
                    break;
                case 7:
                    j10 = j$.com.android.tools.r8.a.T(j10, 2);
                    j11 /= 43200000000000L;
                    break;
            }
            return j$.com.android.tools.r8.a.O(j10, j11);
        }
        LocalDate localDate3 = H.a;
        LocalDate localDate4 = this.a;
        if (localDate4 != null) {
            localDate3.getClass();
        }
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return G((LocalDateTime) chronoLocalDateTime);
        }
        return j$.com.android.tools.r8.a.f(this, chronoLocalDateTime);
    }

    public final int G(LocalDateTime localDateTime) {
        int G = this.a.G(localDateTime.a);
        return G == 0 ? this.b.compareTo(localDateTime.b) : G;
    }

    public final boolean I(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return G((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long z4 = this.a.z();
        long z10 = chronoLocalDateTime.f().z();
        if (z4 >= z10) {
            return z4 == z10 && this.b.R() < chronoLocalDateTime.b().R();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
