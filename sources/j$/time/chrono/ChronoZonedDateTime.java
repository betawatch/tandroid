package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
