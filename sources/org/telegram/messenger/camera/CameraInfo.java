package org.telegram.messenger.camera;

import android.hardware.Camera;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    public CameraInfo(int i10, int i11) {
        this.cameraId = i10;
        this.frontCamera = i11;
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
