package androidx.car.app.model;

import j$.time.Duration;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
