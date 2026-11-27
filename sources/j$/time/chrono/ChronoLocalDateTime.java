package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
