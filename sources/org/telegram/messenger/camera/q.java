package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
