package org.telegram.messenger.voip;

import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VideoCapturerDevice.3;
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

/* loaded from: classes3.dex */
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

    private static native CapturerObserver nativeGetJavaVideoCapturerObserver(long j);

    private void onAspectRatioRequested(float f) {
    }

    public VideoCapturerDevice(final boolean z) {
        Logging.enableLogToDebugOutput(Logging.Severity.LS_VERBOSE);
        Logging.d("VideoCapturerDevice", "device model = " + Build.MANUFACTURER + Build.MODEL);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapturerDevice.$r8$lambda$3_52mVYu9kFxf1ww_IPqEmTAycs(VideoCapturerDevice.this, z);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$3_52mVYu9kFxf1ww_IPqEmTAycs(VideoCapturerDevice videoCapturerDevice, boolean z) {
        videoCapturerDevice.getClass();
        if (eglBase == null) {
            eglBase = EglBase.-CC.create(null, EglBase.CONFIG_PLAIN);
        }
        instance[z ? 1 : 0] = videoCapturerDevice;
        HandlerThread handlerThread = new HandlerThread("CallThread");
        videoCapturerDevice.thread = handlerThread;
        handlerThread.start();
        videoCapturerDevice.handler = new Handler(videoCapturerDevice.thread.getLooper());
    }

    public static void checkScreenCapturerSize() {
        if (instance[1] == null) {
            return;
        }
        final Point screenCaptureSize = getScreenCaptureSize();
        final VideoCapturerDevice videoCapturerDevice = instance[1];
        int i = videoCapturerDevice.currentWidth;
        int i2 = screenCaptureSize.x;
        if (i == i2 && videoCapturerDevice.currentHeight == screenCaptureSize.y) {
            return;
        }
        videoCapturerDevice.currentWidth = i2;
        videoCapturerDevice.currentHeight = screenCaptureSize.y;
        videoCapturerDevice.handler.post(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapturerDevice.$r8$lambda$AbWAc2gyuD_R4EsJCEzP90lW2hU(VideoCapturerDevice.this, screenCaptureSize);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$AbWAc2gyuD_R4EsJCEzP90lW2hU(VideoCapturerDevice videoCapturerDevice, Point point) {
        VideoCapturer videoCapturer = videoCapturerDevice.videoCapturer;
        if (videoCapturer != null) {
            videoCapturer.changeCaptureFormat(point.x, point.y, 30);
        }
    }

    private static Point getScreenCaptureSize() {
        return getScreenCaptureSize(16);
    }

    private static Point getScreenCaptureSize(int i) {
        int i2;
        int i3;
        Display defaultDisplay = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay();
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

    private void init(final long j, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapturerDevice.$r8$lambda$WnjFMxB08I8-YzlSW6epLzMKUVk(VideoCapturerDevice.this, j, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$WnjFMxB08I8-YzlSW6epLzMKUVk(final VideoCapturerDevice videoCapturerDevice, final long j, String str) {
        if (eglBase == null) {
            videoCapturerDevice.getClass();
            return;
        }
        videoCapturerDevice.nativePtr = j;
        if ("screen".equals(str)) {
            if (videoCapturerDevice.videoCapturer == null) {
                videoCapturerDevice.videoCapturer = new ScreenCapturerAndroid(mediaProjectionPermissionResultData, videoCapturerDevice.new 1());
                final Point screenCaptureSize = getScreenCaptureSize();
                videoCapturerDevice.currentWidth = screenCaptureSize.x;
                videoCapturerDevice.currentHeight = screenCaptureSize.y;
                videoCapturerDevice.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("ScreenCapturerThread", eglBase.getEglBaseContext());
                videoCapturerDevice.handler.post(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoCapturerDevice.$r8$lambda$yrdnntmXiLokxmsySAXVpERnhXU(VideoCapturerDevice.this, j, screenCaptureSize);
                    }
                });
                return;
            }
            return;
        }
        CameraEnumerator camera2Enumerator = Camera2Enumerator.isSupported(ApplicationLoader.applicationContext) ? new Camera2Enumerator(ApplicationLoader.applicationContext) : new Camera1Enumerator();
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
        final String str2 = deviceNames[i];
        if (videoCapturerDevice.videoCapturer == null) {
            videoCapturerDevice.videoCapturer = camera2Enumerator.createCapturer(str2, videoCapturerDevice.new 2());
            videoCapturerDevice.videoCapturerSurfaceTextureHelper = SurfaceTextureHelper.create("VideoCapturerThread", eglBase.getEglBaseContext());
            videoCapturerDevice.handler.post(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapturerDevice.$r8$lambda$p-h0yUMzqysQZgx647fiNcsQp0E(VideoCapturerDevice.this, j);
                }
            });
        } else {
            FileLog.d("VideoCapturerDevice init(" + j + "): videoCapturer.switchCamera CAMERA");
            videoCapturerDevice.handler.post(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    ((CameraVideoCapturer) r0.videoCapturer).switchCamera(VideoCapturerDevice.this.new 3(), str2);
                }
            });
        }
    }

    class 1 extends MediaProjection.Callback {
        1() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapturerDevice.1.$r8$lambda$ZQSuWiFDNOs2qmwnLNxKb-4FvRU();
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$ZQSuWiFDNOs2qmwnLNxKb-4FvRU() {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().stopScreenCapture();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$yrdnntmXiLokxmsySAXVpERnhXU(VideoCapturerDevice videoCapturerDevice, long j, Point point) {
        if (videoCapturerDevice.videoCapturerSurfaceTextureHelper != null) {
            long j2 = videoCapturerDevice.nativePtr;
            if (j2 == 0) {
                return;
            }
            videoCapturerDevice.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(j2);
            videoCapturerDevice.videoCapturer.initialize(videoCapturerDevice.videoCapturerSurfaceTextureHelper, ApplicationLoader.applicationContext, videoCapturerDevice.nativeCapturerObserver);
            FileLog.d("VideoCapturerDevice init(" + j + "): videoCapturer.startCapture SCREEN");
            videoCapturerDevice.videoCapturer.startCapture(point.x, point.y, 30);
            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.Instance;
            if (webRtcAudioRecord != null) {
                webRtcAudioRecord.initDeviceAudioRecord(((ScreenCapturerAndroid) videoCapturerDevice.videoCapturer).getMediaProjection());
            }
        }
    }

    class 2 implements CameraVideoCapturer.CameraEventsHandler {
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

        2() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onFirstFrameAvailable() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapturerDevice.2.$r8$lambda$nw9ghc47P82EeNmCdLj2fBnzRy0();
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$nw9ghc47P82EeNmCdLj2fBnzRy0() {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().onCameraFirstFrameAvailable();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$p-h0yUMzqysQZgx647fiNcsQp0E(VideoCapturerDevice videoCapturerDevice, long j) {
        if (videoCapturerDevice.videoCapturerSurfaceTextureHelper == null) {
            return;
        }
        videoCapturerDevice.nativeCapturerObserver = nativeGetJavaVideoCapturerObserver(videoCapturerDevice.nativePtr);
        videoCapturerDevice.videoCapturer.initialize(videoCapturerDevice.videoCapturerSurfaceTextureHelper, ApplicationLoader.applicationContext, videoCapturerDevice.nativeCapturerObserver);
        FileLog.d("VideoCapturerDevice init(" + j + "): videoCapturer.startCapture CAMERA");
        videoCapturerDevice.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
    }

    class 3 implements CameraVideoCapturer.CameraSwitchHandler {
        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchError(String str) {
        }

        3() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(final boolean z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapturerDevice.3.$r8$lambda$67_itrkxqu4lzdGSiVNTf3YO7M8(z);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$67_itrkxqu4lzdGSiVNTf3YO7M8(boolean z) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setSwitchingCamera(false, z);
            }
        }
    }

    public static MediaProjection getMediaProjection() {
        VideoCapturerDevice videoCapturerDevice = instance[1];
        if (videoCapturerDevice == null) {
            return null;
        }
        return ((ScreenCapturerAndroid) videoCapturerDevice.videoCapturer).getMediaProjection();
    }

    private void onStateChanged(final long j, final int i) {
        FileLog.d("VideoCapturerDevice onStateChanged(" + j + ", " + i + ")");
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapturerDevice.$r8$lambda$tWWq7K5oLp-DVktEqxq8w86JpRk(VideoCapturerDevice.this, j, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$tWWq7K5oLp-DVktEqxq8w86JpRk(final VideoCapturerDevice videoCapturerDevice, final long j, final int i) {
        if (videoCapturerDevice.nativePtr != j) {
            return;
        }
        videoCapturerDevice.handler.post(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapturerDevice.$r8$lambda$9CYH-yBYqHvhB158m7MJkCRHEvc(VideoCapturerDevice.this, i, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$9CYH-yBYqHvhB158m7MJkCRHEvc(VideoCapturerDevice videoCapturerDevice, int i, long j) {
        if (videoCapturerDevice.videoCapturer == null) {
            return;
        }
        if (i == 2) {
            FileLog.d("VideoCapturerDevice onStateChanged(" + j + ", " + i + "): videoCapturer.startCapture");
            videoCapturerDevice.videoCapturer.startCapture(CAPTURE_WIDTH, CAPTURE_HEIGHT, 30);
            return;
        }
        try {
            FileLog.d("VideoCapturerDevice onStateChanged(" + j + ", " + i + "): videoCapturer.stopCapture");
            videoCapturerDevice.videoCapturer.stopCapture();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void onDestroy() {
        FileLog.d("VideoCapturerDevice onDestroy ptr=" + this.nativePtr);
        this.nativePtr = 0L;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapturerDevice.$r8$lambda$uxYR57vEW-DUx0LNxuDv8MGhbXY(VideoCapturerDevice.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$uxYR57vEW-DUx0LNxuDv8MGhbXY(final VideoCapturerDevice videoCapturerDevice) {
        videoCapturerDevice.getClass();
        int i = 0;
        while (true) {
            VideoCapturerDevice[] videoCapturerDeviceArr = instance;
            if (i >= videoCapturerDeviceArr.length) {
                break;
            }
            if (videoCapturerDeviceArr[i] == videoCapturerDevice) {
                videoCapturerDeviceArr[i] = null;
                break;
            }
            i++;
        }
        videoCapturerDevice.handler.post(new Runnable() { // from class: org.telegram.messenger.voip.VideoCapturerDevice$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapturerDevice.$r8$lambda$i0N37zFhWSHFBxWEJIXkBam1HKE(VideoCapturerDevice.this);
            }
        });
        try {
            videoCapturerDevice.thread.quitSafely();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$i0N37zFhWSHFBxWEJIXkBam1HKE(VideoCapturerDevice videoCapturerDevice) {
        WebRtcAudioRecord webRtcAudioRecord;
        if ((videoCapturerDevice.videoCapturer instanceof ScreenCapturerAndroid) && (webRtcAudioRecord = WebRtcAudioRecord.Instance) != null) {
            webRtcAudioRecord.stopDeviceAudioRecord();
        }
        if (videoCapturerDevice.videoCapturer != null) {
            FileLog.d("VideoCapturerDevice onDestroy: videoCapturer.stopCapture");
            try {
                videoCapturerDevice.videoCapturer.stopCapture();
                videoCapturerDevice.videoCapturer.dispose();
                videoCapturerDevice.videoCapturer = null;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        SurfaceTextureHelper surfaceTextureHelper = videoCapturerDevice.videoCapturerSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            videoCapturerDevice.videoCapturerSurfaceTextureHelper = null;
        }
    }

    private EglBase.Context getSharedEGLContext() {
        if (eglBase == null) {
            eglBase = EglBase.-CC.create(null, EglBase.CONFIG_PLAIN);
        }
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            return eglBase2.getEglBaseContext();
        }
        return null;
    }

    public static EglBase getEglBase() {
        if (eglBase == null) {
            eglBase = EglBase.-CC.create(null, EglBase.CONFIG_PLAIN);
        }
        return eglBase;
    }
}
