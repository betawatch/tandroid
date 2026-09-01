package i5;

import android.view.Surface;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e6) {
            h5.a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e6);
        }
    }
}
