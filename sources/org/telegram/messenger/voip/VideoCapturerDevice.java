package org.telegram.messenger.voip;

import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import org.telegram.messenger.f8;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class VideoCapturerDevice {
    private static final int CAPTURE_FPS = 30;
    private static final int CAPTURE_HEIGHT = 720;
    private static final int CAPTURE_WIDTH = 1280;
    public static EglBase eglBase;
    private static VideoCapturerDevice[] instance = new VideoCapturerDevice[2];
    public static Intent mediaProjectionPermissionResultData;
    private int currentHeight;
    private int currentWidth;
    private Handler handler;
    private CapturerObserver nativeCapturerObserver;
    private long nativePtr;
    private HandlerThread thread;
    private VideoCapturer videoCapturer;
    private SurfaceTextureHelper videoCapturerSurfaceTextureHelper;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class 1 extends MediaProjection.Callback {
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
            org.telegram.messenger.i0.g3(new l(0));
        }
    }

    public VideoCapturerDevice(boolean z10) {
        Logging.enableLogToDebugOutput(Logging.Severity.LS_VERBOSE);
        Logging.d("VideoCapturerDevice", "device model = " + Build.MANUFACTURER + Build.MODEL);
        org.telegram.messenger.i0.g3(new k2.v(4, this, z10));
    }

    public static void checkScreenCapturerSize() {
        if (instance[1] == null) {
            return;
        }
        Point screenCaptureSize = getScreenCaptureSize();
        VideoCapturerDevice videoCapturerDevice = instance[1];
        int i10 = videoCapturerDevice.currentWidth;
        int i11 = screenCaptureSize.x;
        if (i10 == i11 && videoCapturerDevice.currentHeight == screenCaptureSize.y) {
            return;
        }
        videoCapturerDevice.currentWidth = i11;
        videoCapturerDevice.currentHeight = screenCaptureSize.y;
        videoCapturerDevice.handler.post(new mh.k(14, videoCapturerDevice, screenCaptureSize));
    }

    public static EglBase getEglBase() {
        if (eglBase == null) {
            eglBase = org.webrtc.e.d(null, EglBase.CONFIG_PLAIN);
        }
        return eglBase;
    }

    public static MediaProjection getMediaProjection() {
        VideoCapturerDevice videoCapturerDevice = instance[1];
        if (videoCapturerDevice == null) {
            return null;
        }
        return ((ScreenCapturerAndroid) videoCapturerDevice.videoCapturer).getMediaProjection();
    }

    private static Point getScreenCaptureSize() {
        return getScreenCaptureSize(16);
    }

    private static EglBase.Context getSharedEGLContext() {
        if (eglBase == null) {
            eglBase = org.webrtc.e.d(null, EglBase.CONFIG_PLAIN);
        }
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            return eglBase2.getEglBaseContext();
        }
        return null;
    }

    private void init(long j10, String str) {
        org.telegram.messenger.i0.g3(new a3.i0(this, j10, str, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkScreenCapturerSize$1(VideoCapturerDevice videoCapturerDevice, Point point) {
        VideoCapturer videoCapturer = videoCapturerDevice.videoCapturer;
        if (videoCapturer != null) {
            videoCapturer.changeCaptureFormat(point.x, point.y, 30);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(long j10, Point point) {
        if (this.videoCapturerSurfaceTextureHelper != null) {
            long j11 = this.nativePtr;
            if (j11 == 0) {
                return;
            }
            this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(j11);
            this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, org.telegram.messenger.w0.b, this.nativeCapturerObserver);
            f8.b("VideoCapturerDevice init(" + j10 + "): videoCapturer.startCapture SCREEN");
            this.videoCapturer.startCapture(point.x, point.y, 30);
            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.Instance;
            if (webRtcAudioRecord != null) {
                webRtcAudioRecord.initDeviceAudioRecord(((ScreenCapturerAndroid) this.videoCapturer).getMediaProjection());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(long j10) {
        if (this.videoCapturerSurfaceTextureHelper == null) {
            return;
        }
        this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(this.nativePtr);
        this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, org.telegram.messenger.w0.b, this.nativeCapturerObserver);
        f8.b("VideoCapturerDevice init(" + j10 + "): videoCapturer.startCapture CAMERA");
        this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$4(String str) {
        ((CameraVideoCapturer) this.videoCapturer).switchCamera(new 3(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$5(long j10, String str) {
        if (eglBase != null) {
            this.nativePtr = j10;
            if (!"screen".equals(str)) {
                CameraEnumerator camera2Enumerator = Camera2Enumerator.isSupported(org.telegram.messenger.w0.b) ? new Camera2Enumerator(org.telegram.messenger.w0.b) : new Camera1Enumerator();
                String[] deviceNames = camera2Enumerator.getDeviceNames();
                int i10 = 0;
                while (true) {
                    if (i10 >= deviceNames.length) {
                        i10 = -1;
                        break;
                    } else if (camera2Enumerator.isFrontFacing(deviceNames[i10]) == "front".equals(str)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 == -1) {
                    return;
                }
                String str2 = deviceNames[i10];
                if (this.videoCapturer == null) {
                    this.videoCapturer = camera2Enumerator.createCapturer(str2, new 2());
                    this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("VideoCapturerThread", eglBase.getEglBaseContext());
                    this.handler.post(new bi.e(this, j10, 6));
                    return;
                } else {
                    f8.b("VideoCapturerDevice init(" + j10 + "): videoCapturer.switchCamera CAMERA");
                    this.handler.post(new mh.k(15, this, str2));
                    return;
                }
            }
            if (this.videoCapturer == null) {
                this.videoCapturer = new ScreenCapturerAndroid(mediaProjectionPermissionResultData, new 1());
                Point screenCaptureSize = getScreenCaptureSize();
                this.currentWidth = screenCaptureSize.x;
                this.currentHeight = screenCaptureSize.y;
                this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("ScreenCapturerThread", eglBase.getEglBaseContext());
                this.handler.post(new a3.i0(this, j10, screenCaptureSize, 6));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z10) {
        if (eglBase == null) {
            eglBase = org.webrtc.e.d(null, EglBase.CONFIG_PLAIN);
        }
        instance[z10 ? 1 : 0] = this;
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
            f8.b("VideoCapturerDevice onDestroy: videoCapturer.stopCapture");
            try {
                this.videoCapturer.stopCapture();
                this.videoCapturer.dispose();
                this.videoCapturer = null;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
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
        int i10 = 0;
        while (true) {
            VideoCapturerDevice[] videoCapturerDeviceArr = instance;
            if (i10 >= videoCapturerDeviceArr.length) {
                break;
            }
            if (videoCapturerDeviceArr[i10] == this) {
                videoCapturerDeviceArr[i10] = null;
                break;
            }
            i10++;
        }
        this.handler.post(new k(this, 0));
        try {
            this.thread.quitSafely();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChanged$6(int i10, long j10) {
        if (this.videoCapturer == null) {
            return;
        }
        if (i10 == 2) {
            StringBuilder sb2 = new StringBuilder("VideoCapturerDevice onStateChanged(");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(i10);
            a1.g.z("): videoCapturer.startCapture", sb2);
            this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
            return;
        }
        try {
            f8.b("VideoCapturerDevice onStateChanged(" + j10 + ", " + i10 + "): videoCapturer.stopCapture");
            this.videoCapturer.stopCapture();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChanged$7(long j10, int i10) {
        if (this.nativePtr != j10) {
            return;
        }
        this.handler.post(new j(this, i10, j10));
    }

    private static native CapturerObserver nativeGetJavaVideoCapturerObserver(long j10);

    private void onDestroy() {
        i0.a.q(this.nativePtr, new StringBuilder("VideoCapturerDevice onDestroy ptr="));
        this.nativePtr = 0L;
        org.telegram.messenger.i0.g3(new k(this, 1));
    }

    private void onStateChanged(long j10, int i10) {
        f8.b("VideoCapturerDevice onStateChanged(" + j10 + ", " + i10 + ")");
        org.telegram.messenger.i0.g3(new j(this, j10, i10));
    }

    private static Point getScreenCaptureSize(int i10) {
        int i11;
        int i12;
        Display defaultDisplay = ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i13 = point.x;
        int i14 = point.y;
        float f7 = i13 > i14 ? i14 / i13 : i13 / i14;
        int i15 = 1;
        while (true) {
            if (i15 > 100) {
                i15 = -1;
                i11 = -1;
                break;
            }
            float f10 = i15 * f7;
            i11 = (int) f10;
            if (f10 != i11) {
                i15++;
            } else if (point.x <= point.y) {
                i11 = i15;
                i15 = i11;
            }
        }
        if (i15 != -1 && f7 != 1.0f) {
            while (true) {
                int i16 = point.x;
                if (i16 <= 1000 && (i12 = point.y) <= 1000 && i16 % i10 == 0 && i12 % i10 == 0) {
                    break;
                }
                int i17 = i16 - i15;
                point.x = i17;
                int i18 = point.y - i11;
                point.y = i18;
                if (i17 < 800 && i18 < 800) {
                    i15 = -1;
                    break;
                }
            }
        }
        if (i15 != -1 && f7 != 1.0f) {
            return point;
        }
        float max = Math.max(point.x / 970.0f, point.y / 970.0f);
        float f11 = i10;
        point.x = ((int) Math.ceil((point.x / max) / f11)) * i10;
        point.y = ((int) Math.ceil((point.y / max) / f11)) * i10;
        return point;
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class 2 implements CameraVideoCapturer.CameraEventsHandler {
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
            org.telegram.messenger.i0.g3(new l(1));
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

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class 3 implements CameraVideoCapturer.CameraSwitchHandler {
        public 3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCameraSwitchDone$0(boolean z10) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setSwitchingCamera(false, z10);
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(final boolean z10) {
            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.messenger.voip.m
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapturerDevice.3.lambda$onCameraSwitchDone$0(z10);
                }
            });
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchError(String str) {
        }
    }

    private void onAspectRatioRequested(float f7) {
    }
}
