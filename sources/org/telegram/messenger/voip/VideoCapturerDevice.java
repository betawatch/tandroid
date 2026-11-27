package org.telegram.messenger.voip;

import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.Logging;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.voiceengine.WebRtcAudioRecord;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class VideoCapturerDevice {
    private static final int CAPTURE_FPS = 30;
    private static final int CAPTURE_HEIGHT = 720;
    private static final int CAPTURE_WIDTH = 1280;
    public static EglBase eglBase;
    private static VideoCapturerDevice[] instance = new VideoCapturerDevice[2];
    public static Intent mediaProjectionPermissionResultData;
    private CameraRotationObserver cameraRotationObserver;
    private int currentHeight;
    private int currentWidth;
    private Handler handler;
    private CapturerObserver nativeCapturerObserver;
    private long nativePtr;
    private HandlerThread thread;
    private VideoCapturer videoCapturer;
    private SurfaceTextureHelper videoCapturerSurfaceTextureHelper;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    class 1 extends MediaProjection.Callback {
        public 1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onStop$0() {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().stopScreenCapture();
            }
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            hl.c3(new a((byte) 0));
        }
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    class 3 implements CameraVideoCapturer.CameraSwitchHandler {
        final /* synthetic */ boolean val$frontFacing;

        public 3(boolean z) {
            this.val$frontFacing = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCameraSwitchDone$0(boolean z) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setSwitchingCamera(false, z);
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(final boolean z) {
            hl.c3(new Runnable() { // from class: org.telegram.messenger.voip.b
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapturerDevice.3.lambda$onCameraSwitchDone$0(z);
                }
            });
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchError(String str) {
            if (VideoCapturerDevice.this.cameraRotationObserver != null) {
                VideoCapturerDevice.this.cameraRotationObserver.setFrontFacing(!this.val$frontFacing);
            }
        }
    }

    public VideoCapturerDevice(boolean z) {
        Logging.enableLogToDebugOutput(Logging.Severity.LS_VERBOSE);
        Logging.d("VideoCapturerDevice", "device model = " + Build.MANUFACTURER + Build.MODEL);
        hl.c3(new q38((byte) 25, (Object) this, z));
    }

    public static void checkScreenCapturerSize() {
        if (instance[1] != null) {
            Point screenCaptureSize = getScreenCaptureSize();
            VideoCapturerDevice videoCapturerDevice = instance[1];
            int i = videoCapturerDevice.currentWidth;
            int i2 = screenCaptureSize.x;
            if (i == i2 && videoCapturerDevice.currentHeight == screenCaptureSize.y) {
                return;
            }
            videoCapturerDevice.currentWidth = i2;
            videoCapturerDevice.currentHeight = screenCaptureSize.y;
            videoCapturerDevice.handler.post(new g9c(videoCapturerDevice, screenCaptureSize, (byte) 9));
        }
    }

    public static EglBase getEglBase() {
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            return eglBase2;
        }
        EglBase a = org.webrtc.c.a(null, EglBase.CONFIG_PLAIN);
        eglBase = a;
        return a;
    }

    public static MediaProjection getMediaProjection() {
        VideoCapturerDevice videoCapturerDevice = instance[1];
        if (videoCapturerDevice == null) {
            return null;
        }
        return ((ScreenCapturerAndroid) videoCapturerDevice.videoCapturer).getMediaProjection();
    }

    private static Point getScreenCaptureSize(int i) {
        int i2;
        int i3;
        Display defaultDisplay = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i4 = point.x;
        int i5 = point.y;
        float f = i4 > i5 ? i5 / i4 : i4 / i5;
        int i6 = 1;
        while (true) {
            if (i6 > 100) {
                i6 = -1;
                i2 = -1;
                break;
            }
            float f2 = i6 * f;
            i2 = (int) f2;
            if (f2 != i2) {
                i6++;
            } else if (point.x <= point.y) {
                i2 = i6;
                i6 = i2;
            }
        }
        if (i6 != -1 && f != 1.0f) {
            while (true) {
                int i7 = point.x;
                if (i7 <= 1000 && (i3 = point.y) <= 1000 && i7 % i == 0 && i3 % i == 0) {
                    break;
                }
                int i8 = i7 - i6;
                point.x = i8;
                int i9 = point.y - i2;
                point.y = i9;
                if (i8 < 800 && i9 < 800) {
                    i6 = -1;
                    break;
                }
            }
        }
        if (i6 != -1 && f != 1.0f) {
            return point;
        }
        float max = Math.max(point.x / 970.0f, point.y / 970.0f);
        float f3 = i;
        point.x = ((int) Math.ceil((point.x / max) / f3)) * i;
        point.y = ((int) Math.ceil((point.y / max) / f3)) * i;
        return point;
    }

    private static EglBase.Context getSharedEGLContext() {
        EglBase eglBase2 = eglBase;
        if (eglBase2 == null) {
            eglBase2 = org.webrtc.c.a(null, EglBase.CONFIG_PLAIN);
            eglBase = eglBase2;
        }
        return eglBase2.getEglBaseContext();
    }

    private void init(long j, String str) {
        hl.c3(new z5b((Object) this, j, (Object) str, (byte) 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkScreenCapturerSize$1(VideoCapturerDevice videoCapturerDevice, Point point) {
        VideoCapturer videoCapturer = videoCapturerDevice.videoCapturer;
        if (videoCapturer != null) {
            videoCapturer.changeCaptureFormat(point.x, point.y, 30);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(long j, Point point) {
        if (this.videoCapturerSurfaceTextureHelper != null) {
            long j2 = this.nativePtr;
            if (j2 != 0) {
                this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(j2);
                this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, org.telegram.messenger.a.b, this.nativeCapturerObserver);
                cc4.b("VideoCapturerDevice init(" + j + "): videoCapturer.startCapture SCREEN");
                this.videoCapturer.startCapture(point.x, point.y, 30);
                WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.Instance;
                if (webRtcAudioRecord != null) {
                    webRtcAudioRecord.initDeviceAudioRecord(((ScreenCapturerAndroid) this.videoCapturer).getMediaProjection());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(CameraEnumerator cameraEnumerator, String str, long j) {
        if (this.videoCapturerSurfaceTextureHelper == null) {
            return;
        }
        CapturerObserver nativeGetJavaVideoCapturerObserver = nativeGetJavaVideoCapturerObserver(this.nativePtr);
        this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver;
        this.cameraRotationObserver = new CameraRotationObserver(nativeGetJavaVideoCapturerObserver, cameraEnumerator.isFrontFacing(str));
        this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, org.telegram.messenger.a.b, this.cameraRotationObserver);
        cc4.b("VideoCapturerDevice init(" + j + "): videoCapturer.startCapture CAMERA");
        this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$4(boolean z, String str) {
        CameraRotationObserver cameraRotationObserver = this.cameraRotationObserver;
        if (cameraRotationObserver != null) {
            cameraRotationObserver.setFrontFacing(z);
        }
        ((CameraVideoCapturer) this.videoCapturer).switchCamera(new 3(z), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$5(long j, String str) {
        if (eglBase != null) {
            this.nativePtr = j;
            if ("screen".equals(str)) {
                if (this.videoCapturer == null) {
                    this.videoCapturer = new ScreenCapturer(mediaProjectionPermissionResultData, new 1());
                    Point screenCaptureSize = getScreenCaptureSize();
                    this.currentWidth = screenCaptureSize.x;
                    this.currentHeight = screenCaptureSize.y;
                    this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("ScreenCapturerThread", eglBase.getEglBaseContext());
                    this.handler.post(new z5b((Object) this, j, (Object) screenCaptureSize, (byte) 11));
                    return;
                }
                return;
            }
            CameraEnumerator camera2Enumerator = Camera2Enumerator.isSupported(org.telegram.messenger.a.b) ? new Camera2Enumerator(org.telegram.messenger.a.b) : new Camera1Enumerator();
            String[] deviceNames = camera2Enumerator.getDeviceNames();
            int i = 0;
            while (true) {
                if (i >= deviceNames.length) {
                    i = -1;
                    break;
                } else if (camera2Enumerator.isFrontFacing(deviceNames[i]) == "front".equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            String str2 = deviceNames[i];
            if (this.videoCapturer == null) {
                this.videoCapturer = camera2Enumerator.createCapturer(str2, new 2());
                this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("VideoCapturerThread", eglBase.getEglBaseContext());
                this.handler.post(new y09((Object) this, (Object) camera2Enumerator, (Object) str2, j, (byte) 18));
            } else {
                cc4.b("VideoCapturerDevice init(" + j + "): videoCapturer.switchCamera CAMERA");
                this.handler.post(new yn6((Object) this, camera2Enumerator.isFrontFacing(str2), (Object) str2, (byte) 27));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z) {
        if (eglBase == null) {
            eglBase = org.webrtc.c.a(null, EglBase.CONFIG_PLAIN);
        }
        instance[z ? 1 : 0] = this;
        HandlerThread handlerThread = new HandlerThread("CallThread");
        this.thread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.thread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$8() {
        WebRtcAudioRecord webRtcAudioRecord;
        if ((this.videoCapturer instanceof ScreenCapturerAndroid) && (webRtcAudioRecord = WebRtcAudioRecord.Instance) != null) {
            webRtcAudioRecord.stopDeviceAudioRecord();
        }
        if (this.videoCapturer != null) {
            cc4.b("VideoCapturerDevice onDestroy: videoCapturer.stopCapture");
            try {
                this.videoCapturer.stopCapture();
                this.videoCapturer.dispose();
                this.videoCapturer = null;
            } catch (InterruptedException e) {
                grb.m(e);
                return;
            }
        }
        SurfaceTextureHelper surfaceTextureHelper = this.videoCapturerSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.videoCapturerSurfaceTextureHelper = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onDestroy$9() {
        byte b = 0;
        int i = 0;
        while (true) {
            VideoCapturerDevice[] videoCapturerDeviceArr = instance;
            if (i >= videoCapturerDeviceArr.length) {
                break;
            }
            if (videoCapturerDeviceArr[i] == this) {
                videoCapturerDeviceArr[i] = null;
                break;
            }
            i++;
        }
        this.handler.post(new hec(this, b));
        try {
            this.thread.quitSafely();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChanged$6(int i, long j) {
        if (this.videoCapturer == null) {
            return;
        }
        if (i == 2) {
            StringBuilder sb = new StringBuilder("VideoCapturerDevice onStateChanged(");
            sb.append(j);
            sb.append(", ");
            sb.append(i);
            uh9.s("): videoCapturer.startCapture", sb);
            this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
            return;
        }
        try {
            cc4.b("VideoCapturerDevice onStateChanged(" + j + ", " + i + "): videoCapturer.stopCapture");
            this.videoCapturer.stopCapture();
        } catch (InterruptedException e) {
            grb.m(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChanged$7(long j, int i) {
        if (this.nativePtr != j) {
            return;
        }
        this.handler.post(new gec(this, i, j));
    }

    private static native CapturerObserver nativeGetJavaVideoCapturerObserver(long j);

    private void onDestroy() {
        ik8.q(this.nativePtr, new StringBuilder("VideoCapturerDevice onDestroy ptr="));
        this.nativePtr = 0L;
        hl.c3(new hec(this, (byte) 1));
    }

    private void onStateChanged(long j, int i) {
        cc4.b("VideoCapturerDevice onStateChanged(" + j + ", " + i + ")");
        hl.c3(new gec(this, j, i));
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    class 2 implements CameraVideoCapturer.CameraEventsHandler {
        public 2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onFirstFrameAvailable$0() {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().onCameraFirstFrameAvailable();
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onFirstFrameAvailable() {
            hl.c3(new a((byte) 1));
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraClosed() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraDisconnected() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraError(String str) {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraFreezed(String str) {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraOpening(String str) {
        }
    }

    private void onAspectRatioRequested(float f) {
    }

    private static Point getScreenCaptureSize() {
        return getScreenCaptureSize(16);
    }
}
