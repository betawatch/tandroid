package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
