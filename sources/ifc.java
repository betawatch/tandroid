// default package

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
