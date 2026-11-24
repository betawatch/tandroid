// default package

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface ldc {
    void onError(ndc ndcVar, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(tk tkVar);

    void onSeekFinished(tk tkVar);

    void onSeekStarted(tk tkVar);

    void onStateChanged(boolean z, int i);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
