package androidx.car.app.model;

import j$.time.Duration;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }

    public static DurationSpan create(long j) {
        return new DurationSpan(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
    }

    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return ls6.p(new StringBuilder("[seconds: "), this.mDurationSeconds, "]");
    }

    public static DurationSpan create(Duration duration) {
        return mr3.a(duration);
    }

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }
}
