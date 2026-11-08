package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
