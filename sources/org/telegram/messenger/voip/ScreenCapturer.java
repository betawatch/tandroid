package org.telegram.messenger.voip;

import android.content.Intent;
import android.media.projection.MediaProjection;
import org.webrtc.ScreenCapturerAndroid;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
final class ScreenCapturer extends ScreenCapturerAndroid {
    private final MediaProjection.Callback callback;

    public ScreenCapturer(Intent intent, MediaProjection.Callback callback) {
        super(intent, callback);
        this.callback = callback;
    }

    @Override // org.webrtc.ScreenCapturerAndroid, org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        if (getMediaProjection() != null) {
            return;
        }
        try {
            super.startCapture(i, i2, i3);
        } catch (Throwable th) {
            cc4.g(th, true);
            this.callback.onStop();
        }
    }
}
