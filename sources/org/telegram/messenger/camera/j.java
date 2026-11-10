package org.telegram.messenger.camera;

import android.hardware.Camera;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Camera.AutoFocusCallback {
    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z9, Camera camera) {
        CameraSession.lambda$new$0(z9, camera);
    }
}
