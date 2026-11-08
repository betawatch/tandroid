package org.telegram.messenger.camera;

import android.hardware.Camera;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Camera.AutoFocusCallback {
    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z9, Camera camera) {
        CameraSession.lambda$new$0(z9, camera);
    }
}
