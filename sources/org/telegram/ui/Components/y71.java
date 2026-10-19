package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public interface y71 {
    void onError(b81 b81Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(j2.a aVar);

    void onSeekFinished(j2.a aVar);

    void onSeekStarted(j2.a aVar);

    void onStateChanged(boolean z10, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f7);
}
