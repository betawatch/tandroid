package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
