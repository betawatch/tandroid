package androidx.car.app.model;

import j$.time.Duration;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        return a1.g.r(new StringBuilder("[seconds: "), this.mDurationSeconds, "]");
    }

    public static DurationSpan create(Duration duration) {
        return j.a(duration);
    }

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }
}
