package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public interface ChronoLocalDateTime<D extends b> extends Temporal, j$.time.temporal.m, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: B */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    a a();

    j$.time.j b();

    b f();

    ChronoZonedDateTime m(ZoneOffset zoneOffset);

    long toEpochSecond(ZoneOffset zoneOffset);

    Instant toInstant(ZoneOffset zoneOffset);
}
