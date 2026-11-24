// default package

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
