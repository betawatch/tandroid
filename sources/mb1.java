// default package

import android.hardware.Camera;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class mb1 implements Camera.AutoFocusCallback {
    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        CameraSession.lambda$new$0(z, camera);
    }
}
