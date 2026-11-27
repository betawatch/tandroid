// default package

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public interface ifc {
    void onError(kfc kfcVar, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(uj ujVar);

    void onSeekFinished(uj ujVar);

    void onSeekStarted(uj ujVar);

    void onStateChanged(boolean z, int i);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
