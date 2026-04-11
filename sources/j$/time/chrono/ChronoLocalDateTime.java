package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends b> extends Temporal, j$.time.temporal.n, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: A */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    l a();

    j$.time.j b();

    b c();

    ChronoZonedDateTime p(ZoneOffset zoneOffset);

    Instant toInstant(ZoneOffset zoneOffset);

    long y(ZoneOffset zoneOffset);
}
