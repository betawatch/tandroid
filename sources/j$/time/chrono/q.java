package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class q extends a implements Serializable {
    public static final q c = new q();
    private static final long serialVersionUID = -1440403870442975015L;

    private q() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static boolean x(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.a
    public final k k(int i) {
        if (i == 0) {
            return r.BCE;
        }
        if (i == 1) {
            return r.CE;
        }
        j$.time.g.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final String l() {
        return "iso8601";
    }

    @Override // j$.time.chrono.a
    public final String n() {
        return "ISO";
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDateTime o(Temporal temporal) {
        return LocalDateTime.q(temporal);
    }

    @Override // j$.time.chrono.a
    public final ChronoZonedDateTime v(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.n(instant.a, instant.b, zoneId);
    }

    @Override // j$.time.chrono.a
    public final ChronoZonedDateTime w(Temporal temporal) {
        return ZonedDateTime.o(temporal);
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }
}
