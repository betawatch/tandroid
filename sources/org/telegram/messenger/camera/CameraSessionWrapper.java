package org.telegram.messenger.camera;

import android.graphics.Rect;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class CameraSessionWrapper {
    public CameraSession camera1Session;

    public static CameraSessionWrapper of(CameraSession cameraSession) {
        CameraSessionWrapper cameraSessionWrapper = new CameraSessionWrapper();
        cameraSessionWrapper.camera1Session = cameraSession;
        return cameraSessionWrapper;
    }

    public void destroy(boolean z, Runnable runnable, Runnable runnable2) {
        if (this.camera1Session != null) {
            CameraController.getInstance().close(this.camera1Session, !z ? new CountDownLatch(1) : null, runnable, runnable2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CameraSession) {
            return obj == this.camera1Session;
        }
        if (!(obj instanceof CameraSessionWrapper)) {
            return false;
        }
        CameraSessionWrapper cameraSessionWrapper = (CameraSessionWrapper) obj;
        return cameraSessionWrapper == this || cameraSessionWrapper.camera1Session == this.camera1Session;
    }

    public void focusToRect(Rect rect, Rect rect2) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.focusToRect(rect, rect2);
        }
    }

    @Deprecated
    public int getCameraId() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.cameraInfo.cameraId;
        }
        return 0;
    }

    public String getCurrentFlashMode() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getCurrentFlashMode();
        }
        return null;
    }

    public int getCurrentOrientation() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getCurrentOrientation();
        }
        return 0;
    }

    public int getDisplayOrientation() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getDisplayOrientation();
        }
        return 0;
    }

    public String getNextFlashMode() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getNextFlashMode();
        }
        return null;
    }

    public Object getObject() {
        return this.camera1Session;
    }

    public int getWorldAngle() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            return cameraSession.getWorldAngle();
        }
        return 0;
    }

    public boolean hasFlashModes() {
        CameraSession cameraSession = this.camera1Session;
        return (cameraSession == null || cameraSession.availableFlashModes.isEmpty()) ? false : true;
    }

    public boolean isInitiated() {
        CameraSession cameraSession = this.camera1Session;
        return cameraSession != null && cameraSession.isInitied();
    }

    public boolean isSameTakePictureOrientation() {
        CameraSession cameraSession = this.camera1Session;
        return cameraSession == null || cameraSession.isSameTakePictureOrientation();
    }

    public void setCurrentFlashMode(String str) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.setCurrentFlashMode(str);
        }
    }

    public void setFlipFront(boolean z) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.setFlipFront(z);
        }
    }

    public void setOptimizeForBarcode(boolean z) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.setOptimizeForBarcode(z);
        }
    }

    public void setZoom(float f) {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.setZoom(f);
        }
    }

    public void stopVideoRecording() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.stopVideoRecording();
        }
    }

    public void updateRotation() {
        CameraSession cameraSession = this.camera1Session;
        if (cameraSession != null) {
            cameraSession.updateRotation();
        }
    }
}
