package g5;

import android.view.Surface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(Surface surface, float f9) {
        try {
            surface.setFrameRate(f9, f9 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            f5.a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
