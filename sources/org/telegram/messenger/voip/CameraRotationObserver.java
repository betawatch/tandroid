package org.telegram.messenger.voip;

import android.view.WindowManager;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
final class CameraRotationObserver implements CapturerObserver {
    private volatile boolean frontFacing;
    private OrientationHelper orientationHelper;
    private final CapturerObserver target;

    public CameraRotationObserver(CapturerObserver capturerObserver, boolean z) {
        this.target = capturerObserver;
        this.frontFacing = z;
    }

    private static int getDisplayRotation() {
        int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return jn7.J2;
        }
        if (rotation != 3) {
            return 0;
        }
        return jn7.s4;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        if (z) {
            synchronized (this) {
                if (this.orientationHelper == null) {
                    OrientationHelper orientationHelper = new OrientationHelper();
                    this.orientationHelper = orientationHelper;
                    orientationHelper.start();
                }
            }
        }
        this.target.onCapturerStarted(z);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        synchronized (this) {
            OrientationHelper orientationHelper = this.orientationHelper;
            if (orientationHelper != null) {
                orientationHelper.stop();
                this.orientationHelper = null;
            }
        }
        this.target.onCapturerStopped();
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        int orientation;
        OrientationHelper orientationHelper;
        boolean z = this.frontFacing;
        int displayRotation = getDisplayRotation();
        if (!z) {
            displayRotation = (360 - displayRotation) % 360;
        }
        synchronized (this) {
            orientation = (w96.N != null || (orientationHelper = this.orientationHelper) == null) ? 0 : orientationHelper.getOrientation();
        }
        OrientationHelper.cameraOrientation = orientation;
        if (z) {
            orientation = (360 - orientation) % 360;
        }
        OrientationHelper.cameraRotation = orientation;
        int rotation = ((((videoFrame.getRotation() - displayRotation) + orientation) % 360) + 360) % 360;
        int rotation2 = videoFrame.getRotation();
        CapturerObserver capturerObserver = this.target;
        if (rotation == rotation2) {
            capturerObserver.onFrameCaptured(videoFrame);
        } else {
            capturerObserver.onFrameCaptured(new VideoFrame(videoFrame.getBuffer(), rotation, videoFrame.getTimestampNs()));
        }
    }

    public void setFrontFacing(boolean z) {
        this.frontFacing = z;
    }
}
