// default package

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public interface ibc {
    void onError(lbc lbcVar, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(tj tjVar);

    void onSeekFinished(tj tjVar);

    void onSeekStarted(tj tjVar);

    void onStateChanged(boolean z, int i);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
