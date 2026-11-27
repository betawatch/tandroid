// default package

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
