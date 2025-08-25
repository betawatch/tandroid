package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.chrono.b;

/* loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends b> extends j$.time.temporal.m, j$.time.temporal.p, Comparable<ChronoLocalDateTime<?>> {
    l a();

    j$.time.j b();

    b c();

    ChronoZonedDateTime o(ZoneOffset zoneOffset);

    Instant toInstant(ZoneOffset zoneOffset);

    /* renamed from: w */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);
}
