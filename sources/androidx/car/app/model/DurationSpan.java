package androidx.car.app.model;

import j$.time.Duration;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    public DurationSpan(long j3) {
        this.mDurationSeconds = j3;
    }

    public static DurationSpan create(long j3) {
        return new DurationSpan(j3);
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
        long j3 = this.mDurationSeconds;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public String toString() {
        return a4.a.r(new StringBuilder("[seconds: "), this.mDurationSeconds, "]");
    }

    public static DurationSpan create(Duration duration) {
        return j.a(duration);
    }

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }
}
