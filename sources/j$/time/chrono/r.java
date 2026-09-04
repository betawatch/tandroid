package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class r extends a implements Serializable {
    public static final r c = new r();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.k
    public final l u(int i10) {
        if (i10 == 0) {
            return s.BCE;
        }
        if (i10 == 1) {
            return s.CE;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.k
    public final String o() {
        return "iso8601";
    }

    @Override // j$.time.chrono.k
    public final b x(j$.time.temporal.l lVar) {
        return LocalDate.I(lVar);
    }

    private r() {
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final ChronoLocalDateTime B(j$.time.temporal.l lVar) {
        return LocalDateTime.H(lVar);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final ChronoZonedDateTime p(j$.time.temporal.l lVar) {
        return ZonedDateTime.G(lVar);
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime D(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.q(instant.a, instant.b, zoneId);
    }

    public static boolean k(long j3) {
        if ((3 & j3) == 0) {
            return j3 % 100 != 0 || j3 % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s s(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
