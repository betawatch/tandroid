package org.telegram.messenger.camera;

import android.hardware.Camera;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class CameraInfo {
    protected Camera camera;
    public CameraCaptureSession cameraCaptureSession;
    CameraCharacteristics cameraCharacteristics;
    protected CameraDevice cameraDevice;
    public int cameraId;
    CaptureRequest.Builder captureRequestBuilder;
    public final int frontCamera;
    protected ArrayList<Size> pictureSizes = new ArrayList<>();
    protected ArrayList<Size> previewSizes = new ArrayList<>();

    public CameraInfo(int i7, int i10) {
        this.cameraId = i7;
        this.frontCamera = i10;
    }

    private Camera getCamera() {
        return this.camera;
    }

    public int getCameraId() {
        return this.cameraId;
    }

    public ArrayList<Size> getPictureSizes() {
        return this.pictureSizes;
    }

    public ArrayList<Size> getPreviewSizes() {
        return this.previewSizes;
    }

    public boolean isFrontface() {
        return this.frontCamera != 0;
    }
}
