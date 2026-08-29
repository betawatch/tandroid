package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public interface u61 {
    void onError(x61 x61Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(k3.a aVar);

    void onSeekFinished(k3.a aVar);

    void onSeekStarted(k3.a aVar);

    void onStateChanged(boolean z10, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f9);
}
