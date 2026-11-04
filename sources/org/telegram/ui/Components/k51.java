package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public interface k51 {
    void onError(m51 m51Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(l2.a aVar);

    void onSeekFinished(l2.a aVar);

    void onSeekStarted(l2.a aVar);

    void onStateChanged(boolean z10, int i3);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i3, int i10, int i11, float f10);
}
