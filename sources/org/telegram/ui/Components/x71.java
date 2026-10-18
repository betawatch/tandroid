package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public interface x71 {
    void onError(a81 a81Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(j2.a aVar);

    void onSeekFinished(j2.a aVar);

    void onSeekStarted(j2.a aVar);

    void onStateChanged(boolean z10, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f7);
}
