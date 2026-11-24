package androidx.car.app.model;

import j$.time.ZonedDateTime;
import j$.util.Objects;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS = 64800;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final String mZoneShortName;

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static DateTimeWithZone create(long j, int i, String str) {
        if (j < 0) {
            u36.j("Time since epoch must be greater than or equal to zero");
            return null;
        }
        if (Math.abs(i) > MAX_ZONE_OFFSET_SECONDS) {
            u36.j("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        Objects.requireNonNull(str);
        if (!str.isEmpty()) {
            return new DateTimeWithZone(j, i, str);
        }
        u36.j("The time zone short name can not be null or empty");
        return null;
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
        StringBuilder sb = new StringBuilder("[time since epoch (ms): ");
        sb.append(this.mTimeSinceEpochMillis);
        sb.append("( ");
        sb.append(new Date(this.mTimeSinceEpochMillis));
        sb.append(")  zone offset (s): ");
        sb.append(this.mZoneOffsetSeconds);
        sb.append(", zone: ");
        return b10.j(sb, this.mZoneShortName, "]");
    }

    private DateTimeWithZone(long j, int i, String str) {
        this.mTimeSinceEpochMillis = j;
        this.mZoneOffsetSeconds = i;
        this.mZoneShortName = str;
    }

    public static DateTimeWithZone create(long j, TimeZone timeZone) {
        if (j >= 0) {
            Objects.requireNonNull(timeZone);
            return create(j, (int) (timeZone.getOffset(j) / 1000), timeZone.getDisplayName(false, 0));
        }
        u36.j("timeSinceEpochMillis must be greater than or equal to zero");
        return null;
    }

    public static DateTimeWithZone create(ZonedDateTime zonedDateTime) {
        return y93.a(zonedDateTime);
    }
}
