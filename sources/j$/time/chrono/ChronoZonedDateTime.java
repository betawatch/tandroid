package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends b> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    long A();

    l a();

    j$.time.j b();

    b c();

    ZoneOffset g();

    ChronoZonedDateTime h(ZoneId zoneId);

    ZoneId p();

    Instant toInstant();

    ChronoLocalDateTime x();
}
