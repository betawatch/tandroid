package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public interface d61 {
    void onError(f61 f61Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(m2.a aVar);

    void onSeekFinished(m2.a aVar);

    void onSeekStarted(m2.a aVar);

    void onStateChanged(boolean z10, int i7);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i7, int i10, int i11, float f10);
}
