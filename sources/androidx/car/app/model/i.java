package androidx.car.app.model;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.TextStyle;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class i {
    public static DateTimeWithZone a(ZonedDateTime zonedDateTime) {
        Objects.requireNonNull(zonedDateTime);
        LocalDateTime r10 = zonedDateTime.r();
        ZoneId zone = zonedDateTime.getZone();
        ZoneOffset offset = zone.getRules().getOffset(r10);
        return DateTimeWithZone.create(TimeUnit.SECONDS.toMillis(r10.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
    }
}
