package org.telegram.messenger.camera;

import android.hardware.Camera;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

    public CameraInfo(int i, int i2) {
        this.cameraId = i;
        this.frontCamera = i2;
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
