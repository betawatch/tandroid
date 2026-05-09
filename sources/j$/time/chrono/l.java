package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface l extends Comparable {
    j$.time.temporal.u A(j$.time.temporal.a aVar);

    ChronoZonedDateTime B(Instant instant, ZoneId zoneId);

    m E(int i);

    String getId();

    b m(j$.time.temporal.m mVar);

    String q();

    ChronoZonedDateTime u(Temporal temporal);

    ChronoLocalDateTime w(Temporal temporal);
}
