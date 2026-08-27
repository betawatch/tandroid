package e5;

import android.view.Surface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class n {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e9) {
            d5.a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e9);
        }
    }
}
