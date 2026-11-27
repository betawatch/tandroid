package org.telegram.messenger.voip;

import android.content.Intent;
import android.media.projection.MediaProjection;
import org.webrtc.ScreenCapturerAndroid;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
