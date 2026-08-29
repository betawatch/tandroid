package androidx.car.app.model;

import j$.time.ZonedDateTime;
import j$.util.Objects;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS = TimeUnit.HOURS.toSeconds(1) * 18;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final String mZoneShortName;

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static DateTimeWithZone create(long j10, int i10, String str) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Time since epoch must be greater than or equal to zero");
        }
        if (Math.abs(i10) > MAX_ZONE_OFFSET_SECONDS) {
            throw new IllegalArgumentException("Zone offset not in valid range: -18:00 to +18:00");
        }
        Objects.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The time zone short name can not be null or empty");
        }
        return new DateTimeWithZone(j10, i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    public String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mTimeSinceEpochMillis), Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[time since epoch (ms): ");
        sb2.append(this.mTimeSinceEpochMillis);
        sb2.append("( ");
        sb2.append(new Date(this.mTimeSinceEpochMillis));
        sb2.append(")  zone offset (s): ");
        sb2.append(this.mZoneOffsetSeconds);
        sb2.append(", zone: ");
        return a4.w.q(sb2, this.mZoneShortName, "]");
    }

    private DateTimeWithZone(long j10, int i10, String str) {
        this.mTimeSinceEpochMillis = j10;
        this.mZoneOffsetSeconds = i10;
        this.mZoneShortName = str;
    }

    public static DateTimeWithZone create(long j10, TimeZone timeZone) {
        if (j10 >= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Objects.requireNonNull(timeZone);
            return create(j10, (int) timeUnit.toSeconds(timeZone.getOffset(j10)), timeZone.getDisplayName(false, 0));
        }
        throw new IllegalArgumentException("timeSinceEpochMillis must be greater than or equal to zero");
    }

    public static DateTimeWithZone create(ZonedDateTime zonedDateTime) {
        return i.a(zonedDateTime);
    }
}
