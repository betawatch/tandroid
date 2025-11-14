package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BackEventCompat {
    public static final Companion Companion = new Companion(null);
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    public BackEventCompat(float f, float f2, float f3, int i) {
        this.touchX = f;
        this.touchY = f2;
        this.progress = f3;
        this.swipeEdge = i;
    }

    public final float getProgress() {
        return this.progress;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BackEventCompat(BackEvent backEvent) {
        this(r0.touchX(backEvent), r0.touchY(backEvent), r0.progress(backEvent), r0.swipeEdge(backEvent));
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Api34Impl api34Impl = Api34Impl.INSTANCE;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + '}';
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
