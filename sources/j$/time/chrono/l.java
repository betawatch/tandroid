package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface l extends Comparable {
    j$.time.temporal.u C(j$.time.temporal.a aVar);

    ChronoZonedDateTime D(Instant instant, ZoneId zoneId);

    m G(int i);

    String getId();

    b m(j$.time.temporal.m mVar);

    String r();

    ChronoZonedDateTime v(Temporal temporal);

    ChronoLocalDateTime x(Temporal temporal);
}
