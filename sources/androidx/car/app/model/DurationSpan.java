package androidx.car.app.model;

import j$.time.Duration;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        return qu6.p(new StringBuilder("[seconds: "), this.mDurationSeconds, "]");
    }

    public static DurationSpan create(Duration duration) {
        return es3.a(duration);
    }

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }
}
