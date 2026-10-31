package androidx.car.app.model;

import j$.time.Duration;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    public DurationSpan(long j10) {
        this.mDurationSeconds = j10;
    }

    public static DurationSpan create(long j10) {
        return new DurationSpan(j10);
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
        long j10 = this.mDurationSeconds;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return a1.g.q(new StringBuilder("[seconds: "), this.mDurationSeconds, "]");
    }

    public static DurationSpan create(Duration duration) {
        return j.a(duration);
    }

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }
}
