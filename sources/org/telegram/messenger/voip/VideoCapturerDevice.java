package org.telegram.messenger.voip;

import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import gg.y1;
import kh.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.yh;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class VideoCapturerDevice {
    private static final int CAPTURE_FPS = 30;
    public static EglBase eglBase;
    public static Intent mediaProjectionPermissionResultData;
    private int currentHeight;
    private int currentWidth;
    private Handler handler;
    private CapturerObserver nativeCapturerObserver;
    private long nativePtr;
    private HandlerThread thread;
    private VideoCapturer videoCapturer;
    private SurfaceTextureHelper videoCapturerSurfaceTextureHelper;
    private static final int CAPTURE_WIDTH = 1280;
    private static final int CAPTURE_HEIGHT = 720;
    private static VideoCapturerDevice[] instance = new VideoCapturerDevice[2];

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            AndroidUtilities.runOnUIThread(new j(0));
        }
    }

    public VideoCapturerDevice(boolean z4) {
        Logging.enableLogToDebugOutput(Logging.Severity.LS_VERBOSE);
        Logging.d("VideoCapturerDevice", "device model = " + Build.MANUFACTURER + Build.MODEL);
        AndroidUtilities.runOnUIThread(new jh.f(13, this, z4));
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
        videoCapturerDevice.handler.post(new b(1, videoCapturerDevice, screenCaptureSize));
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

    private EglBase.Context getSharedEGLContext() {
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
        AndroidUtilities.runOnUIThread(new i5.v(this, j10, str, 13));
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
            this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, ApplicationLoader.applicationContext, this.nativeCapturerObserver);
            FileLog.d("VideoCapturerDevice init(" + j10 + "): videoCapturer.startCapture SCREEN");
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
        this.videoCapturer.initialize(this.videoCapturerSurfaceTextureHelper, ApplicationLoader.applicationContext, this.nativeCapturerObserver);
        FileLog.d("VideoCapturerDevice init(" + j10 + "): videoCapturer.startCapture CAMERA");
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
                CameraEnumerator camera2Enumerator = Camera2Enumerator.isSupported(ApplicationLoader.applicationContext) ? new Camera2Enumerator(ApplicationLoader.applicationContext) : new Camera1Enumerator();
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
                    this.handler.post(new y1(this, j10, 13));
                    return;
                } else {
                    FileLog.d("VideoCapturerDevice init(" + j10 + "): videoCapturer.switchCamera CAMERA");
                    this.handler.post(new b(2, this, str2));
                    return;
                }
            }
            if (this.videoCapturer == null) {
                this.videoCapturer = new ScreenCapturerAndroid(mediaProjectionPermissionResultData, new 1());
                Point screenCaptureSize = getScreenCaptureSize();
                this.currentWidth = screenCaptureSize.x;
                this.currentHeight = screenCaptureSize.y;
                this.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("ScreenCapturerThread", eglBase.getEglBaseContext());
                this.handler.post(new i5.v(this, j10, screenCaptureSize, 14));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z4) {
        if (eglBase == null) {
            eglBase = org.webrtc.e.d(null, EglBase.CONFIG_PLAIN);
        }
        instance[z4 ? 1 : 0] = this;
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
            FileLog.d("VideoCapturerDevice onDestroy: videoCapturer.stopCapture");
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
    public /* synthetic */ void lambda$onDestroy$9() {
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
        this.handler.post(new i(this, 0));
        try {
            this.thread.quitSafely();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChanged$6(int i10, long j10) {
        if (this.videoCapturer == null) {
            return;
        }
        if (i10 == 2) {
            StringBuilder sb = new StringBuilder("VideoCapturerDevice onStateChanged(");
            sb.append(j10);
            sb.append(", ");
            sb.append(i10);
            yh.w("): videoCapturer.startCapture", sb);
            this.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
            return;
        }
        try {
            FileLog.d("VideoCapturerDevice onStateChanged(" + j10 + ", " + i10 + "): videoCapturer.stopCapture");
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
        this.handler.post(new h(this, i10, j10));
    }

    private static native CapturerObserver nativeGetJavaVideoCapturerObserver(long j10);

    private void onDestroy() {
        a2.x(new StringBuilder("VideoCapturerDevice onDestroy ptr="), this.nativePtr);
        this.nativePtr = 0L;
        AndroidUtilities.runOnUIThread(new i(this, 1));
    }

    private void onStateChanged(long j10, int i10) {
        FileLog.d("VideoCapturerDevice onStateChanged(" + j10 + ", " + i10 + ")");
        AndroidUtilities.runOnUIThread(new h(this, j10, i10));
    }

    private static Point getScreenCaptureSize(int i10) {
        int i11;
        int i12;
        Display defaultDisplay = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i13 = point.x;
        int i14 = point.y;
        float f10 = i13 > i14 ? i14 / i13 : i13 / i14;
        int i15 = 1;
        while (true) {
            if (i15 > 100) {
                i15 = -1;
                i11 = -1;
                break;
            }
            float f11 = i15 * f10;
            i11 = (int) f11;
            if (f11 != i11) {
                i15++;
            } else if (point.x <= point.y) {
                i11 = i15;
                i15 = i11;
            }
        }
        if (i15 != -1 && f10 != 1.0f) {
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
        if (i15 != -1 && f10 != 1.0f) {
            return point;
        }
        float max = Math.max(point.x / 970.0f, point.y / 970.0f);
        float f12 = i10;
        point.x = ((int) Math.ceil((point.x / max) / f12)) * i10;
        point.y = ((int) Math.ceil((point.y / max) / f12)) * i10;
        return point;
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            AndroidUtilities.runOnUIThread(new j(1));
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

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public class 3 implements CameraVideoCapturer.CameraSwitchHandler {
        public 3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCameraSwitchDone$0(boolean z4) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setSwitchingCamera(false, z4);
            }
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(final boolean z4) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.k
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapturerDevice.3.lambda$onCameraSwitchDone$0(z4);
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
