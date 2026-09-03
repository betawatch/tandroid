package i5;

import android.view.Surface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            h5.a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
