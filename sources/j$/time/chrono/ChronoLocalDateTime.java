package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
