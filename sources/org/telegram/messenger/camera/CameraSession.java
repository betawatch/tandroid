package org.telegram.messenger.camera;

import android.graphics.Rect;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class CameraSession {
    public static final int ORIENTATION_HYSTERESIS = 5;
    public CameraInfo cameraInfo;
    private String currentFlashMode;
    private int currentOrientation;
    private float currentZoom;
    private boolean destroyed;
    private int diffOrientation;
    private int displayOrientation;
    private boolean initied;
    private boolean isRound;
    private boolean isVideo;
    private int jpegOrientation;
    private int maxZoom;
    private boolean meteringAreaSupported;
    private boolean optimizeForBarcode;
    private OrientationEventListener orientationEventListener;
    private final int pictureFormat;
    private final Size pictureSize;
    private final Size previewSize;
    private boolean sameTakePictureOrientation;
    private boolean useTorch;
    private int lastOrientation = -1;
    private int lastDisplayOrientation = -1;
    private boolean flipFront = true;
    public ArrayList<String> availableFlashModes = new ArrayList<>();
    private int infoCameraId = -1;
    Camera.CameraInfo info = new Camera.CameraInfo();
    private Camera.AutoFocusCallback autoFocusCallback = new j();

    public CameraSession(CameraInfo cameraInfo, Size size, Size size2, int i3, boolean z10) {
        this.previewSize = size;
        this.pictureSize = size2;
        this.pictureFormat = i3;
        this.cameraInfo = cameraInfo;
        this.isRound = z10;
        this.currentFlashMode = t0.b.getSharedPreferences("camera", 0).getString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", "off");
        OrientationEventListener orientationEventListener = new OrientationEventListener(t0.b) { // from class: org.telegram.messenger.camera.CameraSession.1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i10) {
                if (CameraSession.this.orientationEventListener == null || !CameraSession.this.initied || i10 == -1) {
                    return;
                }
                CameraSession cameraSession = CameraSession.this;
                cameraSession.jpegOrientation = cameraSession.roundOrientation(i10, cameraSession.jpegOrientation);
                int rotation = ((WindowManager) t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                if (CameraSession.this.lastOrientation == CameraSession.this.jpegOrientation && rotation == CameraSession.this.lastDisplayOrientation) {
                    return;
                }
                if (!CameraSession.this.isVideo) {
                    CameraSession.this.configurePhotoCamera();
                }
                CameraSession.this.lastDisplayOrientation = rotation;
                CameraSession cameraSession2 = CameraSession.this;
                cameraSession2.lastOrientation = cameraSession2.jpegOrientation;
            }
        };
        this.orientationEventListener = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            this.orientationEventListener.enable();
        } else {
            this.orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    private int getDisplayOrientation(Camera.CameraInfo cameraInfo, boolean z10) {
        int rotation = ((WindowManager) t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
        int i3 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                i3 = hs.K2;
            } else if (rotation == 3) {
                i3 = 270;
            }
        }
        if (cameraInfo.facing != 1) {
            return ((cameraInfo.orientation - i3) + 360) % 360;
        }
        int i10 = (360 - ((cameraInfo.orientation + i3) % 360)) % 360;
        if (!z10 && i10 == 90) {
            i10 = 270;
        }
        if (!z10 && "Huawei".equals(Build.MANUFACTURER) && "angler".equals(Build.PRODUCT) && i10 == 270) {
            return 90;
        }
        return i10;
    }

    private int getHigh() {
        return ("LGE".equals(Build.MANUFACTURER) && "g3_tmo_us".equals(Build.PRODUCT)) ? 4 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int roundOrientation(int i3, int i10) {
        if (i10 != -1) {
            int abs = Math.abs(i3 - i10);
            if (Math.min(abs, 360 - abs) < 50) {
                return i10;
            }
        }
        return (((i3 + 45) / 90) * 90) % 360;
    }

    private void updateCameraInfo() {
        if (this.infoCameraId != this.cameraInfo.getCameraId()) {
            int cameraId = this.cameraInfo.getCameraId();
            this.infoCameraId = cameraId;
            Camera.getCameraInfo(cameraId, this.info);
        }
    }

    public void checkFlashMode(String str) {
        if (this.availableFlashModes.contains(this.currentFlashMode)) {
            return;
        }
        this.currentFlashMode = str;
        if (this.isRound) {
            configureRoundCamera(false);
        } else {
            configurePhotoCamera();
            t0.b.getSharedPreferences("camera", 0).edit().putString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", str).commit();
        }
    }

    public void configurePhotoCamera() {
        Camera.Parameters parameters;
        int i3;
        try {
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                try {
                    parameters = camera.getParameters();
                } catch (Exception e10) {
                    a8.g(e10, true);
                    parameters = null;
                }
                updateCameraInfo();
                updateRotation();
                int i10 = this.currentOrientation - this.displayOrientation;
                this.diffOrientation = i10;
                if (i10 < 0) {
                    this.diffOrientation = i10 + 360;
                }
                if (parameters != null) {
                    parameters.setPreviewSize(this.previewSize.getWidth(), this.previewSize.getHeight());
                    parameters.setPictureSize(this.pictureSize.getWidth(), this.pictureSize.getHeight());
                    parameters.setPictureFormat(this.pictureFormat);
                    parameters.setJpegQuality(100);
                    parameters.setJpegThumbnailQuality(100);
                    int maxZoom = parameters.getMaxZoom();
                    this.maxZoom = maxZoom;
                    parameters.setZoom((int) (this.currentZoom * maxZoom));
                    if (this.optimizeForBarcode) {
                        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
                        if (supportedSceneModes != null && supportedSceneModes.contains("barcode")) {
                            parameters.setSceneMode("barcode");
                        }
                        if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                            parameters.setFocusMode("continuous-video");
                        }
                    } else if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                        parameters.setFocusMode("continuous-picture");
                    }
                    int i11 = this.jpegOrientation;
                    if (i11 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        i3 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i11) + 360) % 360 : (cameraInfo.orientation + i11) % 360;
                    } else {
                        i3 = 0;
                    }
                    try {
                        parameters.setRotation(i3);
                        if (this.info.facing == 1) {
                            this.sameTakePictureOrientation = (360 - this.displayOrientation) % 360 == i3;
                        } else {
                            this.sameTakePictureOrientation = this.displayOrientation == i3;
                        }
                    } catch (Exception unused) {
                    }
                    parameters.setFlashMode(this.useTorch ? "torch" : this.currentFlashMode);
                    try {
                        camera.setParameters(parameters);
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public void configureRecorder(int i3, MediaRecorder mediaRecorder) {
        int i10;
        updateCameraInfo();
        int i11 = this.jpegOrientation;
        if (i11 != -1) {
            Camera.CameraInfo cameraInfo = this.info;
            i10 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i11) + 360) % 360 : (cameraInfo.orientation + i11) % 360;
        } else {
            i10 = 0;
        }
        mediaRecorder.setOrientationHint(i10);
        int high = getHigh();
        boolean hasProfile = CamcorderProfile.hasProfile(this.cameraInfo.cameraId, high);
        boolean hasProfile2 = CamcorderProfile.hasProfile(this.cameraInfo.cameraId, 0);
        if (hasProfile && (i3 == 1 || !hasProfile2)) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.cameraInfo.cameraId, high));
        } else {
            if (!hasProfile2) {
                throw new IllegalStateException("cannot find valid CamcorderProfile");
            }
            mediaRecorder.setProfile(CamcorderProfile.get(this.cameraInfo.cameraId, 0));
        }
        this.isVideo = true;
    }

    public boolean configureRoundCamera(boolean z10) {
        Camera.Parameters parameters;
        int i3;
        try {
            this.isVideo = true;
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                try {
                    parameters = camera.getParameters();
                } catch (Exception e10) {
                    a8.g(e10, true);
                    parameters = null;
                }
                updateCameraInfo();
                updateRotation();
                if (parameters != null) {
                    if (z10 && r2.a) {
                        a8.b("set preview size = " + this.previewSize.getWidth() + " " + this.previewSize.getHeight());
                    }
                    parameters.setPreviewSize(this.previewSize.getWidth(), this.previewSize.getHeight());
                    if (z10 && r2.a) {
                        a8.b("set picture size = " + this.pictureSize.getWidth() + " " + this.pictureSize.getHeight());
                    }
                    parameters.setPictureSize(this.pictureSize.getWidth(), this.pictureSize.getHeight());
                    parameters.setPictureFormat(this.pictureFormat);
                    parameters.setRecordingHint(true);
                    this.maxZoom = parameters.getMaxZoom();
                    if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    } else if (parameters.getSupportedFocusModes().contains("auto")) {
                        parameters.setFocusMode("auto");
                    }
                    int i10 = this.jpegOrientation;
                    if (i10 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        i3 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i10) + 360) % 360 : (cameraInfo.orientation + i10) % 360;
                    } else {
                        i3 = 0;
                    }
                    try {
                        parameters.setRotation(i3);
                        if (this.info.facing == 1) {
                            this.sameTakePictureOrientation = (360 - this.displayOrientation) % 360 == i3;
                        } else {
                            this.sameTakePictureOrientation = this.displayOrientation == i3;
                        }
                    } catch (Exception unused) {
                    }
                    parameters.setFlashMode(this.currentFlashMode);
                    parameters.setZoom((int) (this.currentZoom * this.maxZoom));
                    try {
                        camera.setParameters(parameters);
                        if (parameters.getMaxNumMeteringAreas() > 0) {
                            this.meteringAreaSupported = true;
                        }
                    } catch (Exception e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            a8.g(th2, true);
            return false;
        }
    }

    public void destroy() {
        this.initied = false;
        this.destroyed = true;
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.orientationEventListener = null;
        }
    }

    public void focusToRect(Rect rect, Rect rect2) {
        Camera.Parameters parameters;
        try {
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                camera.cancelAutoFocus();
                try {
                    parameters = camera.getParameters();
                } catch (Exception e10) {
                    a8.g(e10, true);
                    parameters = null;
                }
                if (parameters != null) {
                    parameters.setFocusMode("auto");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(rect, 1000));
                    parameters.setFocusAreas(arrayList);
                    if (this.meteringAreaSupported) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new Camera.Area(rect2, 1000));
                        parameters.setMeteringAreas(arrayList2);
                    }
                    try {
                        camera.setParameters(parameters);
                        camera.autoFocus(this.autoFocusCallback);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
        } catch (Exception e12) {
            a8.g(e12, true);
        }
    }

    public String getCurrentFlashMode() {
        return this.currentFlashMode;
    }

    public int getCurrentOrientation() {
        return this.currentOrientation;
    }

    public Camera.Size getCurrentPictureSize() {
        return this.cameraInfo.camera.getParameters().getPictureSize();
    }

    public Camera.Size getCurrentPreviewSize() {
        return this.cameraInfo.camera.getParameters().getPreviewSize();
    }

    public int getMaxZoom() {
        return this.maxZoom;
    }

    public String getNextFlashMode() {
        ArrayList<String> arrayList = this.availableFlashModes;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            if (arrayList.get(i3).equals(this.currentFlashMode)) {
                return i3 < arrayList.size() + (-1) ? arrayList.get(i3 + 1) : arrayList.get(0);
            }
            i3++;
        }
        return this.currentFlashMode;
    }

    public int getWorldAngle() {
        return this.diffOrientation;
    }

    public boolean isFlipFront() {
        return this.flipFront;
    }

    public boolean isInitied() {
        return this.initied;
    }

    public boolean isSameTakePictureOrientation() {
        return this.sameTakePictureOrientation;
    }

    public void onStartRecord() {
        this.isVideo = true;
    }

    public void setCurrentFlashMode(String str) {
        this.currentFlashMode = str;
        if (this.isRound) {
            configureRoundCamera(false);
        } else {
            configurePhotoCamera();
            t0.b.getSharedPreferences("camera", 0).edit().putString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", str).commit();
        }
    }

    public void setFlipFront(boolean z10) {
        this.flipFront = z10;
    }

    public void setInitied() {
        this.initied = true;
    }

    public void setOneShotPreviewCallback(Camera.PreviewCallback previewCallback) {
        Camera camera;
        CameraInfo cameraInfo = this.cameraInfo;
        if (cameraInfo == null || (camera = cameraInfo.camera) == null) {
            return;
        }
        try {
            camera.setOneShotPreviewCallback(previewCallback);
        } catch (Exception unused) {
        }
    }

    public void setOptimizeForBarcode(boolean z10) {
        this.optimizeForBarcode = z10;
        configurePhotoCamera();
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        this.cameraInfo.camera.setPreviewCallback(previewCallback);
    }

    public void setTorchEnabled(boolean z10) {
        try {
            String str = this.currentFlashMode;
            String str2 = z10 ? "torch" : "off";
            this.currentFlashMode = str2;
            if (TextUtils.equals(str, str2)) {
                return;
            }
            if (this.isRound) {
                configureRoundCamera(false);
            } else {
                configurePhotoCamera();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public void setZoom(float f10) {
        this.currentZoom = f10;
        if (this.isVideo && "on".equals(this.currentFlashMode)) {
            this.useTorch = true;
        }
        if (this.isRound) {
            configureRoundCamera(false);
        } else {
            configurePhotoCamera();
        }
    }

    public void stopVideoRecording() {
        this.isVideo = false;
        this.useTorch = false;
        configurePhotoCamera();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateRotation() {
        int i3;
        Camera.CameraInfo cameraInfo;
        if (this.cameraInfo == null) {
            return;
        }
        try {
            updateCameraInfo();
            Camera camera = this.destroyed ? null : this.cameraInfo.camera;
            this.displayOrientation = getDisplayOrientation(this.info, true);
            int i10 = 0;
            if (!"samsung".equals(Build.MANUFACTURER) || !"sf2wifixx".equals(Build.PRODUCT)) {
                int i11 = this.displayOrientation;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i3 = 90;
                    } else if (i11 == 2) {
                        i3 = hs.K2;
                    } else if (i11 == 3) {
                        i3 = hs.t4;
                    }
                    cameraInfo = this.info;
                    if (cameraInfo.orientation % 90 != 0) {
                        cameraInfo.orientation = 0;
                    }
                    i10 = cameraInfo.facing != 1 ? (360 - ((cameraInfo.orientation + i3) % 360)) % 360 : ((cameraInfo.orientation - i3) + 360) % 360;
                }
                i3 = 0;
                cameraInfo = this.info;
                if (cameraInfo.orientation % 90 != 0) {
                }
                i10 = cameraInfo.facing != 1 ? (360 - ((cameraInfo.orientation + i3) % 360)) % 360 : ((cameraInfo.orientation - i3) + 360) % 360;
            }
            this.currentOrientation = i10;
            if (camera != null) {
                try {
                    camera.setDisplayOrientation(i10);
                } catch (Throwable unused) {
                }
            }
            int i12 = this.currentOrientation - this.displayOrientation;
            this.diffOrientation = i12;
            if (i12 < 0) {
                this.diffOrientation = i12 + 360;
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public int getDisplayOrientation() {
        try {
            updateCameraInfo();
            return getDisplayOrientation(this.info, true);
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(boolean z10, Camera camera) {
    }
}
