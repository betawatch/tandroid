package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
