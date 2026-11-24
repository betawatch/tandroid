package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public interface ChronoZonedDateTime<D extends b> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    long E();

    a a();

    j$.time.j b();

    b f();

    ZoneId getZone();

    ZoneOffset h();

    ChronoZonedDateTime i(ZoneId zoneId);

    ChronoLocalDateTime p();

    ChronoZonedDateTime t(ZoneId zoneId);

    Instant toInstant();
}
