package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;

/* loaded from: classes2.dex */
public interface k extends Comparable {
    ChronoLocalDateTime B(j$.time.temporal.l lVar);

    ChronoZonedDateTime D(Instant instant, ZoneId zoneId);

    boolean equals(Object obj);

    String getId();

    int hashCode();

    String o();

    ChronoZonedDateTime p(j$.time.temporal.l lVar);

    j$.time.temporal.s s(j$.time.temporal.a aVar);

    String toString();

    l u(int i9);

    b x(j$.time.temporal.l lVar);
}
