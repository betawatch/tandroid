package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;
import j$.time.h;
import j$.time.temporal.k;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends b> extends k, Comparable<ChronoZonedDateTime<?>> {
    h a();

    e b();

    ZoneOffset c();

    LocalDateTime e();

    ZoneId g();

    long l();

    Instant toInstant();
}
