package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
