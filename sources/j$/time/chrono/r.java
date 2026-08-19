package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class r extends a implements Serializable {
    public static final r c = new r();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.k
    public final l C(int i) {
        if (i == 0) {
            return s.BCE;
        }
        if (i == 1) {
            return s.CE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "iso8601";
    }

    @Override // j$.time.chrono.k
    public final b a(j$.time.temporal.l lVar) {
        return LocalDate.I(lVar);
    }

    private r() {
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final ChronoLocalDateTime s(Temporal temporal) {
        return LocalDateTime.H(temporal);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final ChronoZonedDateTime n(Temporal temporal) {
        return ZonedDateTime.E(temporal);
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime A(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.x(instant.a, instant.b, zoneId);
    }

    public static boolean o(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s y(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new D((byte) 1, this);
    }
}
