package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public interface r71 {
    void onError(u71 u71Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(j2.a aVar);

    void onSeekFinished(j2.a aVar);

    void onSeekStarted(j2.a aVar);

    void onStateChanged(boolean z10, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f7);
}
