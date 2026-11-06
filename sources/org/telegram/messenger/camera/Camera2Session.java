package org.telegram.messenger.camera;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.view.Surface;
import android.view.WindowManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.messenger.t0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class Camera2Session {
    private CameraCharacteristics cameraCharacteristics;
    private CameraDevice cameraDevice;
    public final String cameraId;
    private final CameraManager cameraManager;
    private final CameraDevice.StateCallback cameraStateCallback;
    private CaptureRequest.Builder captureRequestBuilder;
    private CameraCaptureSession captureSession;
    private final CameraCaptureSession.StateCallback captureStateCallback;
    private Runnable doneCallback;
    private boolean flashing;
    private Handler handler;
    private ImageReader imageReader;
    private boolean isClosed;
    private boolean isError;
    private final boolean isFront;
    private boolean isSuccess;
    private long lastTime;
    private float maxZoom;
    private boolean nightMode;
    private final android.util.Size previewSize;
    private boolean recordingVideo;
    private boolean scanningBarcode;
    private Rect sensorSize;
    private Surface surface;
    private SurfaceTexture surfaceTexture;
    private HandlerThread thread;
    private float currentZoom = 1.0f;
    private boolean opened = false;
    private final Rect cropRegion = new Rect();

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public class 1 extends CameraDevice.StateCallback {
        final /* synthetic */ String val$cameraId;

        public 1(String str) {
            this.val$cameraId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$0() {
            Camera2Session.this.isError = true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.cameraDevice = cameraDevice;
            a8.b("Camera2Session camera #" + this.val$cameraId + " disconnected");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i7) {
            Camera2Session.this.cameraDevice = cameraDevice;
            a8.d("Camera2Session camera #" + this.val$cameraId + " received " + i7 + " error");
            g0.h3(new c(this, 0));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.lastTime = System.currentTimeMillis();
            a8.b("Camera2Session camera #" + this.val$cameraId + " opened");
            Camera2Session.this.checkOpen();
        }
    }

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public class 2 extends CameraCaptureSession.StateCallback {
        final /* synthetic */ String val$cameraId;

        public 2(String str) {
            this.val$cameraId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigureFailed$1() {
            Camera2Session.this.isError = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0() {
            Camera2Session.this.isSuccess = true;
            if (Camera2Session.this.doneCallback != null) {
                Camera2Session.this.doneCallback.run();
                Camera2Session.this.doneCallback = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.captureSession = cameraCaptureSession;
            a8.d("Camera2Session camera #" + this.val$cameraId + " capture session failed to configure");
            g0.h3(new d(this, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.captureSession = cameraCaptureSession;
            a8.d("Camera2Session camera #" + this.val$cameraId + " capture session configured");
            Camera2Session.this.lastTime = System.currentTimeMillis();
            try {
                Camera2Session.this.updateCaptureRequest();
                g0.h3(new d(this, 0));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public class 3 implements ImageReader.OnImageAvailableListener {
        final /* synthetic */ File val$file;
        final /* synthetic */ int val$orientation;
        final /* synthetic */ c20 val$whenDone;

        public 3(File file, c20 c20Var, int i7) {
            this.val$file = file;
            this.val$whenDone = c20Var;
            this.val$orientation = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onImageAvailable$0(c20 c20Var, int i7) {
            if (c20Var != null) {
                c20Var.a(Integer.valueOf(i7));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        
            if (r2 == null) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.media.ImageReader.OnImageAvailableListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onImageAvailable(ImageReader imageReader) {
            FileOutputStream fileOutputStream;
            Throwable th2;
            IOException e10;
            Image acquireLatestImage = imageReader.acquireLatestImage();
            ByteBuffer buffer = acquireLatestImage.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            try {
                fileOutputStream = new FileOutputStream(this.val$file);
                try {
                    try {
                        fileOutputStream.write(bArr);
                        acquireLatestImage.close();
                    } catch (IOException e11) {
                        e10 = e11;
                        e10.printStackTrace();
                        acquireLatestImage.close();
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    acquireLatestImage.close();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    throw th2;
                }
            } catch (IOException e13) {
                fileOutputStream = null;
                e10 = e13;
            } catch (Throwable th4) {
                fileOutputStream = null;
                th2 = th4;
                acquireLatestImage.close();
                if (fileOutputStream != null) {
                }
                throw th2;
            }
            try {
                fileOutputStream.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
            final c20 c20Var = this.val$whenDone;
            final int i7 = this.val$orientation;
            g0.h3(new Runnable() { // from class: org.telegram.messenger.camera.e
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2Session.3.lambda$onImageAvailable$0(c20.this, i7);
                }
            });
        }
    }

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public static class CompareSizesByArea implements Comparator<android.util.Size> {
        @Override // java.util.Comparator
        public int compare(android.util.Size size, android.util.Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    private Camera2Session(Context context, boolean z9, String str, android.util.Size size) {
        float f10 = 1.0f;
        this.maxZoom = 1.0f;
        HandlerThread handlerThread = new HandlerThread("tg_camera2");
        this.thread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.thread.getLooper());
        1 r12 = new 1(str);
        this.cameraStateCallback = r12;
        this.captureStateCallback = new 2(str);
        this.isFront = z9;
        this.cameraId = str;
        this.previewSize = size;
        this.lastTime = System.currentTimeMillis();
        this.imageReader = ImageReader.newInstance(size.getWidth(), size.getHeight(), 256, 1);
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.cameraManager = cameraManager;
        try {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            this.cameraCharacteristics = cameraCharacteristics;
            this.sensorSize = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            Float f11 = (Float) this.cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f11 != null && f11.floatValue() >= 1.0f) {
                f10 = f11.floatValue();
            }
            this.maxZoom = f10;
            cameraManager.openCamera(str, r12, this.handler);
        } catch (Exception e10) {
            a8.g(e10, true);
            g0.h3(new a(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkOpen() {
        if (this.opened || this.surfaceTexture == null || this.cameraDevice == null) {
            return;
        }
        this.opened = true;
        this.surface = new Surface(this.surfaceTexture);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.surface);
            arrayList.add(this.imageReader.getSurface());
            this.cameraDevice.createCaptureSession(arrayList, this.captureStateCallback, null);
        } catch (Exception e10) {
            a8.g(e10, true);
            g0.h3(new a(this, 1));
        }
    }

    public static android.util.Size chooseOptimalSize(android.util.Size[] sizeArr, int i7, int i10, boolean z9) {
        ArrayList arrayList = new ArrayList(sizeArr.length);
        ArrayList arrayList2 = new ArrayList(sizeArr.length);
        for (android.util.Size size : sizeArr) {
            if (!z9 || (size.getHeight() <= i10 && size.getWidth() <= i7)) {
                if (size.getHeight() == (size.getWidth() * i10) / i7 && size.getWidth() >= i7 && size.getHeight() >= i10) {
                    arrayList.add(size);
                } else if (size.getWidth() * size.getHeight() <= i7 * i10 * 4 && size.getWidth() >= i7 && size.getHeight() >= i10) {
                    arrayList2.add(size);
                }
            }
        }
        return arrayList.size() > 0 ? (android.util.Size) Collections.min(arrayList, new CompareSizesByArea()) : arrayList2.size() > 0 ? (android.util.Size) Collections.min(arrayList2, new CompareSizesByArea()) : (android.util.Size) Collections.max(Arrays.asList(sizeArr), new CompareSizesByArea());
    }

    public static Camera2Session create(boolean z9, int i7, int i10) {
        Camera2Session camera2Session;
        android.util.Size size;
        String str;
        float f10;
        boolean z10;
        Context context = t0.b;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            size = null;
            str = null;
            float f11 = 0.0f;
            for (String str2 : cameraManager.getCameraIdList()) {
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                    if (cameraCharacteristics != null) {
                        camera2Session = null;
                        try {
                            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == (!z9)) {
                                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                                float width = ((android.util.Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE)) == null ? 0.0f : r9.getWidth() / r9.getHeight();
                                float f12 = i7 / i10;
                                if (f12 >= 1.0f) {
                                    f10 = 1.0f;
                                    z10 = true;
                                } else {
                                    f10 = 1.0f;
                                    z10 = false;
                                }
                                if (z10 != (width >= f10)) {
                                    width = f10 / width;
                                }
                                if (f11 > 0.0f) {
                                    if (Math.abs(f12 - f11) > Math.abs(f12 - width)) {
                                    }
                                }
                                if (streamConfigurationMap != null) {
                                    android.util.Size chooseOptimalSize = chooseOptimalSize(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), i7, i10, false);
                                    if (chooseOptimalSize != null) {
                                        size = chooseOptimalSize;
                                        str = str2;
                                        f11 = width;
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            a8.g(e, true);
                            if (str != null) {
                            }
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    camera2Session = null;
                }
            }
            camera2Session = null;
        } catch (Exception e12) {
            e = e12;
            camera2Session = null;
            size = null;
            str = null;
        }
        return (str != null || size == null) ? camera2Session : new Camera2Session(context, z9, str, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:3:0x0002, B:7:0x0007, B:15:0x002b, B:17:0x0039, B:19:0x0047), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #0 {Exception -> 0x0045, blocks: (B:3:0x0002, B:7:0x0007, B:15:0x002b, B:17:0x0039, B:19:0x0047), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getJpegOrientation() {
        int i7;
        try {
            Context context = t0.b;
            if (context == null) {
                return 0;
            }
            int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation != 0) {
                if (rotation == 1) {
                    i7 = 90;
                } else if (rotation == 2) {
                    i7 = qs.K2;
                } else if (rotation == 3) {
                    i7 = qs.t4;
                }
                Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                return !this.isFront ? (360 - ((num.intValue() + i7) % 360)) % 360 : ((num.intValue() - i7) + 360) % 360;
            }
            i7 = 0;
            Integer num2 = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (!this.isFront) {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkOpen$2() {
        this.isError = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$destroy$3(Runnable runnable) {
        try {
            this.thread.join();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$4(Runnable runnable) {
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
            this.imageReader = null;
        }
        this.thread.quitSafely();
        g0.h3(new b(this, runnable, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.isError = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$1(SurfaceTexture surfaceTexture) {
        this.surfaceTexture = surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(getPreviewWidth(), getPreviewHeight());
        }
        checkOpen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCaptureRequest() {
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice == null || this.surface == null || this.captureSession == null) {
            return;
        }
        try {
            int i7 = 1;
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(this.recordingVideo ? 3 : this.scanningBarcode ? 2 : 1);
            this.captureRequestBuilder = createCaptureRequest;
            if (this.scanningBarcode) {
                createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 16);
            } else if (this.nightMode) {
                createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(this.isFront ? 6 : 5));
            }
            CaptureRequest.Builder builder = this.captureRequestBuilder;
            CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
            if (!this.flashing) {
                i7 = 0;
            } else if (this.recordingVideo) {
                i7 = 2;
            }
            builder.set(key, Integer.valueOf(i7));
            if (this.recordingVideo) {
                this.captureRequestBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(30, 60));
                this.captureRequestBuilder.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
            }
            if (this.sensorSize != null && Math.abs(this.currentZoom - 1.0f) >= 0.01f) {
                int width = this.sensorSize.width() / 2;
                int height = this.sensorSize.height() / 2;
                int width2 = (int) ((this.sensorSize.width() * 0.5f) / this.currentZoom);
                int height2 = (int) ((this.sensorSize.height() * 0.5f) / this.currentZoom);
                this.cropRegion.set(width - width2, height - height2, width + width2, height + height2);
                this.captureRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, this.cropRegion);
            }
            this.captureRequestBuilder.addTarget(this.surface);
            this.captureSession.setRepeatingRequest(this.captureRequestBuilder.build(), null, this.handler);
        } catch (Exception e10) {
            a8.e("Camera2Sessions setRepeatingRequest error in updateCaptureRequest", e10);
        }
    }

    public void destroy(boolean z9) {
        destroy(z9, null);
    }

    public int getCurrentOrientation() {
        return getJpegOrientation();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:3:0x0002, B:7:0x0007, B:15:0x002b, B:17:0x0039, B:19:0x0047), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #0 {Exception -> 0x0045, blocks: (B:3:0x0002, B:7:0x0007, B:15:0x002b, B:17:0x0039, B:19:0x0047), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getDisplayOrientation() {
        int i7;
        try {
            Context context = t0.b;
            if (context == null) {
                return 0;
            }
            int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation != 0) {
                if (rotation == 1) {
                    i7 = 90;
                } else if (rotation == 2) {
                    i7 = qs.K2;
                } else if (rotation == 3) {
                    i7 = qs.t4;
                }
                Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                return !this.isFront ? (360 - ((num.intValue() + i7) % 360)) % 360 : ((num.intValue() - i7) + 360) % 360;
            }
            i7 = 0;
            Integer num2 = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (!this.isFront) {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public boolean getFlash() {
        return this.flashing;
    }

    public float getMaxZoom() {
        return this.maxZoom;
    }

    public float getMinZoom() {
        return 1.0f;
    }

    public int getPreviewHeight() {
        return this.previewSize.getHeight();
    }

    public int getPreviewWidth() {
        return this.previewSize.getWidth();
    }

    public int getWorldAngle() {
        int jpegOrientation = getJpegOrientation() - getDisplayOrientation();
        return jpegOrientation < 0 ? jpegOrientation + 360 : jpegOrientation;
    }

    public float getZoom() {
        return this.currentZoom;
    }

    public boolean isInitiated() {
        return (this.isError || !this.isSuccess || this.isClosed) ? false : true;
    }

    public void open(SurfaceTexture surfaceTexture) {
        this.handler.post(new s(1, this, surfaceTexture));
    }

    public void setFlash(boolean z9) {
        if (this.flashing != z9) {
            this.flashing = z9;
            updateCaptureRequest();
        }
    }

    public void setNightMode(boolean z9) {
        if (this.nightMode != z9) {
            this.nightMode = z9;
            updateCaptureRequest();
        }
    }

    public void setRecordingVideo(boolean z9) {
        if (this.recordingVideo != z9) {
            this.recordingVideo = z9;
            updateCaptureRequest();
        }
    }

    public void setScanningBarcode(boolean z9) {
        if (this.scanningBarcode != z9) {
            this.scanningBarcode = z9;
            updateCaptureRequest();
        }
    }

    public void setZoom(float f10) {
        if (!isInitiated() || this.captureRequestBuilder == null || this.cameraDevice == null || this.sensorSize == null) {
            return;
        }
        this.currentZoom = Utilities.i(f10, this.maxZoom, 1.0f);
        updateCaptureRequest();
        try {
            this.captureSession.setRepeatingRequest(this.captureRequestBuilder.build(), null, this.handler);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public boolean takePicture(File file, c20 c20Var) {
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null && this.captureSession != null) {
            try {
                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                int jpegOrientation = getJpegOrientation();
                createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(jpegOrientation));
                this.imageReader.setOnImageAvailableListener(new 3(file, c20Var, jpegOrientation), null);
                if (this.scanningBarcode) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 16);
                }
                createCaptureRequest.addTarget(this.imageReader.getSurface());
                this.captureSession.capture(createCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() { // from class: org.telegram.messenger.camera.Camera2Session.4
                }, null);
                return true;
            } catch (Exception e10) {
                a8.e("Camera2Sessions takePicture error", e10);
            }
        }
        return false;
    }

    public void whenDone(Runnable runnable) {
        if (!isInitiated()) {
            this.doneCallback = runnable;
        } else {
            runnable.run();
            this.doneCallback = null;
        }
    }

    public void destroy(boolean z9, Runnable runnable) {
        this.isClosed = true;
        if (z9) {
            this.handler.post(new b(this, runnable, 0));
            return;
        }
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
            this.imageReader = null;
        }
        this.thread.quitSafely();
        try {
            this.thread.join();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (runnable != null) {
            g0.h3(runnable);
        }
    }
}
