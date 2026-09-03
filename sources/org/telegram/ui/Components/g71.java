package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public interface g71 {
    void onError(j71 j71Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(k3.a aVar);

    void onSeekFinished(k3.a aVar);

    void onSeekStarted(k3.a aVar);

    void onStateChanged(boolean z4, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f10);
}
