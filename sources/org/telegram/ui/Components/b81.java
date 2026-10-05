package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public interface b81 {
    void onError(e81 e81Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(j2.a aVar);

    void onSeekFinished(j2.a aVar);

    void onSeekStarted(j2.a aVar);

    void onStateChanged(boolean z10, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f7);
}
