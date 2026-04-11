package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class s extends a implements Serializable {
    public static final s d = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.l
    public final m G(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    private s() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.l
    public final String r() {
        return "iso8601";
    }

    @Override // j$.time.chrono.l
    public final b m(j$.time.temporal.m mVar) {
        return LocalDate.K(mVar);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final ChronoLocalDateTime x(Temporal temporal) {
        return LocalDateTime.J(temporal);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final ChronoZonedDateTime v(Temporal temporal) {
        return ZonedDateTime.I(temporal);
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime D(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.J(instant, zoneId);
    }

    public static boolean n(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.u C(j$.time.temporal.a aVar) {
        return aVar.k();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
