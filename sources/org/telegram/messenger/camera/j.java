package org.telegram.messenger.camera;

import android.hardware.Camera;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Camera.AutoFocusCallback {
    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z9, Camera camera) {
        CameraSession.lambda$new$0(z9, camera);
    }
}
