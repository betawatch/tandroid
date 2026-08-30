package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public interface f71 {
    void onError(i71 i71Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(k3.a aVar);

    void onSeekFinished(k3.a aVar);

    void onSeekStarted(k3.a aVar);

    void onStateChanged(boolean z4, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f10);
}
