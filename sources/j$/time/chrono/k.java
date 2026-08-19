package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface k extends Comparable {
    ChronoZonedDateTime A(Instant instant, ZoneId zoneId);

    l C(int i);

    b a(j$.time.temporal.l lVar);

    boolean equals(Object obj);

    String getId();

    int hashCode();

    String m();

    ChronoZonedDateTime n(Temporal temporal);

    ChronoLocalDateTime s(Temporal temporal);

    String toString();

    j$.time.temporal.s y(j$.time.temporal.a aVar);
}
