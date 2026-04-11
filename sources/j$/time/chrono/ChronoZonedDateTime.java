package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends b> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoLocalDateTime B();

    long H();

    l a();

    j$.time.j b();

    b c();

    ZoneOffset h();

    ChronoZonedDateTime i(ZoneId zoneId);

    ChronoZonedDateTime j(ZoneId zoneId);

    ZoneId q();

    Instant toInstant();
}
