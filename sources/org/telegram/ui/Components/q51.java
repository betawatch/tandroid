package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public interface q51 {
    void onError(t51 t51Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(m2.a aVar);

    void onSeekFinished(m2.a aVar);

    void onSeekStarted(m2.a aVar);

    void onStateChanged(boolean z9, int i7);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i7, int i10, int i11, float f10);
}
