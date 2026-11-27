// default package

import android.hardware.Camera;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ma1 implements Camera.AutoFocusCallback {
    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        CameraSession.lambda$new$0(z, camera);
    }
}
