package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public interface g61 {
    void onError(i61 i61Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(m2.a aVar);

    void onSeekFinished(m2.a aVar);

    void onSeekStarted(m2.a aVar);

    void onStateChanged(boolean z10, int i7);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i7, int i10, int i11, float f10);
}
