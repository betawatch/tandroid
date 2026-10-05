package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ CameraView.CameraGLThread a;

    public /* synthetic */ q(CameraView.CameraGLThread cameraGLThread) {
        this.a = cameraGLThread;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.a.updTex(surfaceTexture);
    }
}
