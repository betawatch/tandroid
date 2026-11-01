package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final BackEvent a(float f7, float f10, float f11, int i10) {
        return new BackEvent(f7, f10, f11, i10);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
