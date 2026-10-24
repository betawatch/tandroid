package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public interface g81 {
    void onError(j81 j81Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(j2.a aVar);

    void onSeekFinished(j2.a aVar);

    void onSeekStarted(j2.a aVar);

    void onStateChanged(boolean z10, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f7);
}
