package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends b> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoLocalDateTime B();

    long G();

    k b();

    j$.time.h c();

    b d();

    ZoneId getZone();

    ZoneOffset i();

    ChronoZonedDateTime j(ZoneId zoneId);

    ChronoZonedDateTime k(ZoneId zoneId);

    Instant toInstant();
}
