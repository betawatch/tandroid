package org.telegram.messenger.voip;

import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import bi.d3;
import bi.k1;
import bi.r3;
import li.j3;
import org.telegram.messenger.a8;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Cells.f1;
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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
            org.telegram.messenger.g0.h3(new i(0));
        }
    }

    public VideoCapturerDevice(boolean z9) {
        Logging.enableLogToDebugOutput(Logging.Severity.LS_VERBOSE);
        Logging.d("VideoCapturerDevice", "device model = " + Build.MANUFACTURER + Build.MODEL);
        org.telegram.messenger.g0.h3(new k1(14, this, z9));
    }

    public static void checkScreenCapturerSize() {
        if (instance[1] == null) {
            return;
        }
        Point screenCaptureSize = getScreenCaptureSize();
        VideoCapturerDevice videoCapturerDevice = instance[1];
        int i7 = videoCapturerDevice.currentWidth;
        int i10 = screenCaptureSize.x;
        if (i7 == i10 && videoCapturerDevice.currentHeight == screenCaptureSize.y) {
            return;
        }
        videoCapturerDevice.currentWidth = i10;
        videoCapturerDevice.currentHeight = screenCaptureSize.y;
        videoCapturerDevice.handler.post(new j3(20, videoCapturerDevice, screenCaptureSize));
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

    private void init(long j3, String str) {
        org.telegram.messenger.g0.h3(new d3(this, j3, str, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkScreenCapturerSize$1(VideoCapturerDevice videoCapturerDevice, Point point) {
        VideoCapturer videoCapturer = videoCapturerDevice.videoCapturer;
        if (videoCapturer != null) {
            videoCapturer.changeCaptureFormat(point.x, point.y, 30);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(long j3, Point point) {
        if (this.videoCapturerSurfaceTextureHelper != null) {
            long j10 = this.nativePtr;
            if (j10 == 0) {
                return;
            }
            this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(j10);
            this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, org.telegram.messenger.t0.b, this.nativeCapturerObserver);
            a8.b("VideoCapturerDevice init(" + j3 + "): videoCapturer.startCapture SCREEN");
            this.videoCapturer.startCapture(point.x, point.y, 30);
            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.Instance;
            if (webRtcAudioRecord != null) {
                webRtcAudioRecord.initDeviceAudioRecord(((ScreenCapturerAndroid) this.videoCapturer).getMediaProjection());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(long j3) {
        if (this.videoCapturerSurfaceTextureHelper == null) {
            return;
        }
        this.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(this.nativePtr);
        this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, org.telegram.messenger.t0.b, this.nativeCapturerObserver);
        a8.b("VideoCapturerDevice init(" + j3 + "): videoCapturer.startCapture CAMERA");
        this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$4(String str) {
        ((CameraVideoCapturer) this.videoCapturer).switchCamera(new 3(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$5(long j3, String str) {
        if (eglBase != null) {
            this.nativePtr = j3;
            if (!"screen".equals(str)) {
                CameraEnumerator camera2Enumerator = Camera2Enumerator.isSupported(org.telegram.messenger.t0.b) ? new Camera2Enumerator(org.telegram.messenger.t0.b) : new Camera1Enumerator();
                String[] deviceNames = camera2Enumerator.getDeviceNames();
                int i7 = 0;
                while (true) {
                    if (i7 >= deviceNames.length) {
                        i7 = -1;
                        break;
                    } else if (camera2Enumerator.isFrontFacing(deviceNames[i7]) == "front".equals(str)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 == -1) {
                    return;
                }
                String str2 = deviceNames[i7];
                if (this.videoCapturer == null) {
                    this.videoCapturer = camera2Enumerator.createCapturer(str2, new 2());
                    this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("VideoCapturerThread", eglBase.getEglBaseContext());
                    this.handler.post(new r3(this, j3, 17));
                    return;
                } else {
                    a8.b("VideoCapturerDevice init(" + j3 + "): videoCapturer.switchCamera CAMERA");
                    this.handler.post(new j3(21, this, str2));
                    return;
                }
            }
            if (this.videoCapturer == null) {
                this.videoCapturer = new ScreenCapturerAndroid(mediaProjectionPermissionResultData, new 1());
                Point screenCaptureSize = getScreenCaptureSize();
                this.currentWidth = screenCaptureSize.x;
                this.currentHeight = screenCaptureSize.y;
                this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("ScreenCapturerThread", eglBase.getEglBaseContext());
                this.handler.post(new d3(this, j3, screenCaptureSize, 15));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z9) {
        if (eglBase == null) {
            eglBase = org.webrtc.e.d(null, EglBase.CONFIG_PLAIN);
        }
        instance[z9 ? 1 : 0] = this;
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
            a8.b("VideoCapturerDevice onDestroy: videoCapturer.stopCapture");
            try {
                this.videoCapturer.stopCapture();
                this.videoCapturer.dispose();
                this.videoCapturer = null;
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
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
        int i7 = 0;
        while (true) {
            VideoCapturerDevice[] videoCapturerDeviceArr = instance;
            if (i7 >= videoCapturerDeviceArr.length) {
                break;
            }
            if (videoCapturerDeviceArr[i7] == this) {
                videoCapturerDeviceArr[i7] = null;
                break;
            }
            i7++;
        }
        this.handler.post(new h(this, 0));
        try {
            this.thread.quitSafely();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChanged$6(int i7, long j3) {
        if (this.videoCapturer == null) {
            return;
        }
        if (i7 == 2) {
            StringBuilder sb2 = new StringBuilder("VideoCapturerDevice onStateChanged(");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(i7);
            f1.u("): videoCapturer.startCapture", sb2);
            this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
            return;
        }
        try {
            a8.b("VideoCapturerDevice onStateChanged(" + j3 + ", " + i7 + "): videoCapturer.stopCapture");
            this.videoCapturer.stopCapture();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChanged$7(long j3, int i7) {
        if (this.nativePtr != j3) {
            return;
        }
        this.handler.post(new g(this, i7, j3));
    }

    private static native CapturerObserver nativeGetJavaVideoCapturerObserver(long j3);

    private void onDestroy() {
        jg.g.u(this.nativePtr, new StringBuilder("VideoCapturerDevice onDestroy ptr="));
        this.nativePtr = 0L;
        org.telegram.messenger.g0.h3(new h(this, 1));
    }

    private void onStateChanged(long j3, int i7) {
        a8.b("VideoCapturerDevice onStateChanged(" + j3 + ", " + i7 + ")");
        org.telegram.messenger.g0.h3(new g(this, j3, i7));
    }

    private static Point getScreenCaptureSize(int i7) {
        int i10;
        int i11;
        Display defaultDisplay = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i12 = point.x;
        int i13 = point.y;
        float f10 = i12 > i13 ? i13 / i12 : i12 / i13;
        int i14 = 1;
        while (true) {
            if (i14 > 100) {
                i14 = -1;
                i10 = -1;
                break;
            }
            float f11 = i14 * f10;
            i10 = (int) f11;
            if (f11 != i10) {
                i14++;
            } else if (point.x <= point.y) {
                i10 = i14;
                i14 = i10;
            }
        }
        if (i14 != -1 && f10 != 1.0f) {
            while (true) {
                int i15 = point.x;
                if (i15 <= 1000 && (i11 = point.y) <= 1000 && i15 % i7 == 0 && i11 % i7 == 0) {
                    break;
                }
                int i16 = i15 - i14;
                point.x = i16;
                int i17 = point.y - i10;
                point.y = i17;
                if (i16 < 800 && i17 < 800) {
                    i14 = -1;
                    break;
                }
            }
        }
        if (i14 != -1 && f10 != 1.0f) {
            return point;
        }
        float max = Math.max(point.x / 970.0f, point.y / 970.0f);
        float f12 = i7;
        point.x = ((int) Math.ceil((point.x / max) / f12)) * i7;
        point.y = ((int) Math.ceil((point.y / max) / f12)) * i7;
        return point;
    }

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
            org.telegram.messenger.g0.h3(new i(1));
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

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public class 3 implements CameraVideoCapturer.CameraSwitchHandler {
        public 3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCameraSwitchDone$0(boolean z9) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setSwitchingCamera(false, z9);
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(final boolean z9) {
            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.messenger.voip.j
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapturerDevice.3.lambda$onCameraSwitchDone$0(z9);
                }
            });
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchError(String str) {
        }
    }

    private void onAspectRatioRequested(float f10) {
    }
}
