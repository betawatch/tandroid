package org.telegram.messenger.camera;

import android.hardware.Camera;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Camera.AutoFocusCallback {
    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z4, Camera camera) {
        CameraSession.lambda$new$0(z4, camera);
    }
}
