package org.telegram.messenger.camera;

import android.hardware.Camera;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Camera.AutoFocusCallback {
    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z9, Camera camera) {
        CameraSession.lambda$new$0(z9, camera);
    }
}
