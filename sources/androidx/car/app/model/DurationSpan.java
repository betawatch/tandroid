package androidx.car.app.model;

import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    public static DurationSpan create(long j) {
        return new DurationSpan(j);
    }

    public static DurationSpan create(Duration duration) {
        return Api26Impl.create(duration);
    }

    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public String toString() {
        return "[seconds: " + this.mDurationSeconds + "]";
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
    }

    DurationSpan(long j) {
        this.mDurationSeconds = j;
    }

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }

    private static final class Api26Impl {
        public static DurationSpan create(Duration duration) {
            Objects.requireNonNull(duration);
            return new DurationSpan(duration.getSeconds());
        }
    }
}
