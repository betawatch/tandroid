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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
    private Camera.AutoFocusCallback autoFocusCallback = new mb1();

    public CameraSession(CameraInfo cameraInfo, Size size, Size size2, int i, boolean z) {
        this.previewSize = size;
        this.pictureSize = size2;
        this.pictureFormat = i;
        this.cameraInfo = cameraInfo;
        this.isRound = z;
        this.currentFlashMode = org.telegram.messenger.a.b.getSharedPreferences("camera", 0).getString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", "off");
        OrientationEventListener orientationEventListener = new OrientationEventListener(org.telegram.messenger.a.b) { // from class: org.telegram.messenger.camera.CameraSession.1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i2) {
                if (CameraSession.this.orientationEventListener == null || !CameraSession.this.initied || i2 == -1) {
                    return;
                }
                CameraSession cameraSession = CameraSession.this;
                cameraSession.jpegOrientation = cameraSession.roundOrientation(i2, cameraSession.jpegOrientation);
                int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
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
        boolean canDetectOrientation = orientationEventListener.canDetectOrientation();
        OrientationEventListener orientationEventListener2 = this.orientationEventListener;
        if (canDetectOrientation) {
            orientationEventListener2.enable();
        } else {
            orientationEventListener2.disable();
            this.orientationEventListener = null;
        }
    }

    private int getDisplayOrientation(Camera.CameraInfo cameraInfo, boolean z) {
        int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = nm7.J2;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        int i2 = cameraInfo.facing;
        int i3 = cameraInfo.orientation;
        if (i2 != 1) {
            return ((i3 - i) + 360) % 360;
        }
        int i4 = (360 - ((i3 + i) % 360)) % 360;
        if (!z && i4 == 90) {
            i4 = 270;
        }
        if (!z && "Huawei".equals(Build.MANUFACTURER) && "angler".equals(Build.PRODUCT) && i4 == 270) {
            return 90;
        }
        return i4;
    }

    private int getHigh() {
        return ("LGE".equals(Build.MANUFACTURER) && "g3_tmo_us".equals(Build.PRODUCT)) ? 4 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int roundOrientation(int i, int i2) {
        if (i2 != -1) {
            int abs = Math.abs(i - i2);
            if (Math.min(abs, 360 - abs) < 50) {
                return i2;
            }
        }
        return (((i + 45) / 90) * 90) % 360;
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
            org.telegram.messenger.a.b.getSharedPreferences("camera", 0).edit().putString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", str).commit();
        }
    }

    public void configurePhotoCamera() {
        Camera.Parameters parameters;
        int i;
        try {
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                try {
                    parameters = camera.getParameters();
                } catch (Exception e) {
                    fc4.g(e, true);
                    parameters = null;
                }
                updateCameraInfo();
                updateRotation();
                int i2 = this.currentOrientation - this.displayOrientation;
                this.diffOrientation = i2;
                if (i2 < 0) {
                    this.diffOrientation = i2 + 360;
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
                    int i3 = this.jpegOrientation;
                    if (i3 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        int i4 = cameraInfo.facing;
                        int i5 = cameraInfo.orientation;
                        i = i4 == 1 ? ((i5 - i3) + 360) % 360 : (i5 + i3) % 360;
                    } else {
                        i = 0;
                    }
                    try {
                        parameters.setRotation(i);
                        int i6 = this.info.facing;
                        int i7 = this.displayOrientation;
                        if (i6 == 1) {
                            this.sameTakePictureOrientation = (360 - i7) % 360 == i;
                        } else {
                            this.sameTakePictureOrientation = i7 == i;
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
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    public void configureRecorder(int i, MediaRecorder mediaRecorder) {
        int i2;
        updateCameraInfo();
        int i3 = this.jpegOrientation;
        if (i3 != -1) {
            Camera.CameraInfo cameraInfo = this.info;
            i2 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i3) + 360) % 360 : (cameraInfo.orientation + i3) % 360;
        } else {
            i2 = 0;
        }
        mediaRecorder.setOrientationHint(i2);
        int high = getHigh();
        boolean hasProfile = CamcorderProfile.hasProfile(this.cameraInfo.cameraId, high);
        boolean hasProfile2 = CamcorderProfile.hasProfile(this.cameraInfo.cameraId, 0);
        if (hasProfile && (i == 1 || !hasProfile2)) {
            mediaRecorder.setProfile(CamcorderProfile.get(this.cameraInfo.cameraId, high));
        } else {
            if (!hasProfile2) {
                dq9.m("cannot find valid CamcorderProfile");
                return;
            }
            mediaRecorder.setProfile(CamcorderProfile.get(this.cameraInfo.cameraId, 0));
        }
        this.isVideo = true;
    }

    public boolean configureRoundCamera(boolean z) {
        Camera.Parameters parameters;
        int i;
        try {
            this.isVideo = true;
            Camera camera = this.cameraInfo.camera;
            if (camera != null) {
                try {
                    parameters = camera.getParameters();
                } catch (Exception e) {
                    fc4.g(e, true);
                    parameters = null;
                }
                updateCameraInfo();
                updateRotation();
                if (parameters != null) {
                    if (z && e21.a) {
                        fc4.b("set preview size = " + this.previewSize.getWidth() + " " + this.previewSize.getHeight());
                    }
                    parameters.setPreviewSize(this.previewSize.getWidth(), this.previewSize.getHeight());
                    if (z && e21.a) {
                        fc4.b("set picture size = " + this.pictureSize.getWidth() + " " + this.pictureSize.getHeight());
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
                    int i2 = this.jpegOrientation;
                    if (i2 != -1) {
                        Camera.CameraInfo cameraInfo = this.info;
                        int i3 = cameraInfo.facing;
                        int i4 = cameraInfo.orientation;
                        i = i3 == 1 ? ((i4 - i2) + 360) % 360 : (i4 + i2) % 360;
                    } else {
                        i = 0;
                    }
                    try {
                        parameters.setRotation(i);
                        int i5 = this.info.facing;
                        int i6 = this.displayOrientation;
                        if (i5 == 1) {
                            this.sameTakePictureOrientation = (360 - i6) % 360 == i;
                        } else {
                            this.sameTakePictureOrientation = i6 == i;
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
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            fc4.g(th, true);
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
                } catch (Exception e) {
                    fc4.g(e, true);
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
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                }
            }
        } catch (Exception e3) {
            fc4.g(e3, true);
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
        int i = 0;
        while (i < arrayList.size()) {
            if (arrayList.get(i).equals(this.currentFlashMode)) {
                return i < arrayList.size() + (-1) ? arrayList.get(i + 1) : arrayList.get(0);
            }
            i++;
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
            org.telegram.messenger.a.b.getSharedPreferences("camera", 0).edit().putString(this.cameraInfo.frontCamera != 0 ? "flashMode_front" : "flashMode", str).commit();
        }
    }

    public void setFlipFront(boolean z) {
        this.flipFront = z;
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

    public void setOptimizeForBarcode(boolean z) {
        this.optimizeForBarcode = z;
        configurePhotoCamera();
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        this.cameraInfo.camera.setPreviewCallback(previewCallback);
    }

    public void setTorchEnabled(boolean z) {
        try {
            String str = this.currentFlashMode;
            String str2 = z ? "torch" : "off";
            this.currentFlashMode = str2;
            if (TextUtils.equals(str, str2)) {
                return;
            }
            if (this.isRound) {
                configureRoundCamera(false);
            } else {
                configurePhotoCamera();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void setZoom(float f) {
        this.currentZoom = f;
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateRotation() {
        int i;
        int i2;
        if (this.cameraInfo != null) {
            try {
                updateCameraInfo();
                Camera camera = this.destroyed ? null : this.cameraInfo.camera;
                this.displayOrientation = getDisplayOrientation(this.info, true);
                int i3 = 0;
                if (!"samsung".equals(Build.MANUFACTURER) || !"sf2wifixx".equals(Build.PRODUCT)) {
                    int i4 = this.displayOrientation;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            i = 90;
                        } else if (i4 == 2) {
                            i = nm7.J2;
                        } else if (i4 == 3) {
                            i = nm7.s4;
                        }
                        Camera.CameraInfo cameraInfo = this.info;
                        i2 = cameraInfo.orientation;
                        if (i2 % 90 == 0) {
                            cameraInfo.orientation = 0;
                        } else {
                            i3 = i2;
                        }
                        i3 = cameraInfo.facing != 1 ? (360 - ((i3 + i) % 360)) % 360 : ((i3 - i) + 360) % 360;
                    }
                    i = 0;
                    Camera.CameraInfo cameraInfo2 = this.info;
                    i2 = cameraInfo2.orientation;
                    if (i2 % 90 == 0) {
                    }
                    if (cameraInfo2.facing != 1) {
                    }
                }
                this.currentOrientation = i3;
                if (camera != null) {
                    try {
                        camera.setDisplayOrientation(i3);
                    } catch (Throwable unused) {
                    }
                }
                int i5 = this.currentOrientation - this.displayOrientation;
                this.diffOrientation = i5;
                if (i5 < 0) {
                    this.diffOrientation = i5 + 360;
                }
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(boolean z, Camera camera) {
    }

    public int getDisplayOrientation() {
        try {
            updateCameraInfo();
            return getDisplayOrientation(this.info, true);
        } catch (Exception e) {
            fc4.g(e, true);
            return 0;
        }
    }
}
