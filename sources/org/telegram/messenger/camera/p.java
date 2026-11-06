package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ CameraView.CameraGLThread a;

    public /* synthetic */ p(CameraView.CameraGLThread cameraGLThread) {
        this.a = cameraGLThread;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.a.updTex(surfaceTexture);
    }
}
