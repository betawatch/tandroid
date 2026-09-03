package org.telegram.messenger.camera;

import android.hardware.Camera;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Camera.AutoFocusCallback {
    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z4, Camera camera) {
        CameraSession.lambda$new$0(z4, camera);
    }
}
