package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final BackEvent a(float f10, float f11, float f12, int i7) {
        return new BackEvent(f10, f11, f12, i7);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
