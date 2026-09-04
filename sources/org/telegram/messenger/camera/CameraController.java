package org.telegram.messenger.camera;

import ah.u;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Camera;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import bi.e4;
import bi.x7;
import bi.z2;
import di.u1;
import di.y0;
import i2.b1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class CameraController implements MediaRecorder.OnInfoListener {
    private static final int CORE_POOL_SIZE = 1;
    private static volatile CameraController Instance = null;
    private static final int KEEP_ALIVE_SECONDS = 60;
    private static final int MAX_POOL_SIZE = 1;
    protected volatile ArrayList<CameraInfo> cameraInfos;
    private boolean cameraInitied;
    private ArrayList<ErrorCallback> errorCallbacks;
    private boolean loadingCameras;
    private boolean mirrorRecorderVideo;
    private VideoTakeCallback onVideoTakeCallback;
    private String recordedFile;
    private MediaRecorder recorder;
    ICameraView recordingCurrentCameraView;
    private ArrayList<Runnable> onFinishCameraInitRunnables = new ArrayList<>();
    protected ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public static class CompareSizesByArea implements Comparator<Size> {
        @Override // java.util.Comparator
        public int compare(Size size, Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public interface ErrorCallback {
        void onError(int i10, Camera camera, CameraSessionWrapper cameraSessionWrapper);
    }

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public interface ICameraView {
        boolean startRecording(File file, Runnable runnable);

        void stopRecording();
    }

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public interface VideoTakeCallback {
        void onFinishVideoRecording(String str, long j3);
    }

    public static Size chooseOptimalSize(List<Size> list, int i10, int i11, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        int width = size.getWidth();
        int height = size.getHeight();
        for (int i12 = 0; i12 < list.size(); i12++) {
            Size size2 = list.get(i12);
            if (!z10 || (size2.getHeight() <= i11 && size2.getWidth() <= i10)) {
                if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i10 && size2.getHeight() >= i11) {
                    arrayList.add(size2);
                } else if (size2.getWidth() * size2.getHeight() <= i10 * i11 * 4) {
                    arrayList2.add(size2);
                }
            }
        }
        return arrayList.size() > 0 ? (Size) Collections.min(arrayList, new CompareSizesByArea()) : arrayList2.size() > 0 ? (Size) Collections.min(arrayList2, new CompareSizesByArea()) : (Size) Collections.max(list, new CompareSizesByArea());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0034, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[SYNTHETIC] */
    /* renamed from: finishRecordingVideo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$recordVideo$11(boolean z10) {
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        File file;
        Bitmap bitmap;
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        FileOutputStream fileOutputStream2 = null;
        long j3 = 0;
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(this.recordedFile);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata != null) {
                        j3 = Long.parseLong(extractMetadata);
                    }
                } catch (Exception e7) {
                    e = e7;
                    FileLog.e(e);
                }
            } catch (Throwable th3) {
                th2 = th3;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    throw th2;
                }
                try {
                    mediaMetadataRetriever2.release();
                    throw th2;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e = e11;
            mediaMetadataRetriever = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (mediaMetadataRetriever2 != null) {
            }
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        long j10 = j3;
        if (z10) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(this.recordedFile, 1);
            if (this.mirrorRecorderVideo) {
                Bitmap createBitmap = Bitmap.createBitmap(createVideoThumbnail.getWidth(), createVideoThumbnail.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(-1.0f, 1.0f, createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                canvas.drawBitmap(createVideoThumbnail, 0.0f, 0.0f, (Paint) null);
                createVideoThumbnail.recycle();
                createVideoThumbnail = createBitmap;
            }
            File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
            try {
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Throwable unused) {
                }
                try {
                    createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        FileLog.e(th);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        bitmap = createVideoThumbnail;
                        file = file2;
                        SharedConfig.saveConfig();
                        AndroidUtilities.runOnUIThread(new x7(this, file, bitmap, j10, 27));
                    } finally {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            bitmap = createVideoThumbnail;
            file = file2;
        } else {
            file = null;
            bitmap = null;
        }
        SharedConfig.saveConfig();
        AndroidUtilities.runOnUIThread(new x7(this, file, bitmap, j10, 27));
    }

    public static CameraController getInstance() {
        CameraController cameraController;
        CameraController cameraController2 = Instance;
        if (cameraController2 != null) {
            return cameraController2;
        }
        synchronized (CameraController.class) {
            try {
                cameraController = Instance;
                if (cameraController == null) {
                    cameraController = new CameraController();
                    Instance = cameraController;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cameraController;
    }

    private static int getOrientation(byte[] bArr) {
        int i10;
        int pack;
        if (bArr == null) {
            return -1;
        }
        int i11 = 0;
        while (i11 + 3 < bArr.length) {
            int i12 = i11 + 1;
            if ((bArr[i11] & 255) == 255) {
                int i13 = bArr[i12] & 255;
                if (i13 != 255) {
                    i12 = i11 + 2;
                    if (i13 != 216 && i13 != 1) {
                        if (i13 != 217 && i13 != 218) {
                            int pack2 = pack(bArr, i12, 2, false);
                            if (pack2 >= 2 && (i12 = i12 + pack2) <= bArr.length) {
                                if (i13 == 225 && pack2 >= 8 && pack(bArr, i11 + 4, 4, false) == 1165519206 && pack(bArr, i11 + 8, 2, false) == 0) {
                                    i11 += 10;
                                    i10 = pack2 - 8;
                                    break;
                                }
                            } else {
                                return -1;
                            }
                        }
                    }
                }
                i11 = i12;
            }
            i11 = i12;
        }
        i10 = 0;
        if (i10 <= 8 || !((pack = pack(bArr, i11, 4, false)) == 1229531648 || pack == 1296891946)) {
            return -1;
        }
        boolean z10 = pack == 1229531648;
        int pack3 = pack(bArr, i11 + 4, 4, z10) + 2;
        if (pack3 >= 10 && pack3 <= i10) {
            int i14 = i11 + pack3;
            int i15 = i10 - pack3;
            int pack4 = pack(bArr, i14 - 2, 2, z10);
            while (true) {
                int i16 = pack4 - 1;
                if (pack4 <= 0 || i15 < 12) {
                    break;
                }
                if (pack(bArr, i14, 2, z10) == 274) {
                    int pack5 = pack(bArr, i14 + 8, 2, z10);
                    if (pack5 == 1) {
                        return 0;
                    }
                    if (pack5 == 3) {
                        return 180;
                    }
                    if (pack5 != 6) {
                        return pack5 != 8 ? -1 : 270;
                    }
                    return 90;
                }
                i14 += 12;
                i15 -= 12;
                pack4 = i16;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$close$5(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        }
        Camera camera = cameraSession.cameraInfo.camera;
        if (camera != null) {
            try {
                camera.stopPreview();
                cameraSession.cameraInfo.camera.setPreviewCallbackWithBuffer(null);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            try {
                cameraSession.cameraInfo.camera.release();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            cameraSession.cameraInfo.camera = null;
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finishRecordingVideo$15(File file, Bitmap bitmap, long j3) {
        String str;
        if (this.onVideoTakeCallback != null) {
            if (file != null) {
                str = file.getAbsolutePath();
                if (bitmap != null) {
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), Utilities.MD5(str), false);
                }
            } else {
                str = null;
            }
            this.onVideoTakeCallback.onFinishVideoRecording(str, j3);
            this.onVideoTakeCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getErrorListener$18(CameraSession cameraSession, int i10, Camera camera) {
        if (this.errorCallbacks != null) {
            for (int i11 = 0; i11 < this.errorCallbacks.size(); i11++) {
                ErrorCallback errorCallback = this.errorCallbacks.get(i11);
                if (errorCallback != null) {
                    errorCallback.onError(i10, camera, CameraSessionWrapper.of(cameraSession));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$initCamera$0(Size size, Size size2) {
        int i10 = size.mWidth;
        int i11 = size2.mWidth;
        if (i10 < i11) {
            return 1;
        }
        if (i10 > i11) {
            return -1;
        }
        int i12 = size.mHeight;
        int i13 = size2.mHeight;
        if (i12 < i13) {
            return 1;
        }
        return i12 > i13 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$1() {
        this.loadingCameras = false;
        this.cameraInitied = true;
        if (!this.onFinishCameraInitRunnables.isEmpty()) {
            for (int i10 = 0; i10 < this.onFinishCameraInitRunnables.size(); i10++) {
                this.onFinishCameraInitRunnables.get(i10).run();
            }
            this.onFinishCameraInitRunnables.clear();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.cameraInitied, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$2(Runnable runnable) {
        initCamera(runnable, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$3(boolean z10, Exception exc, Runnable runnable) {
        this.onFinishCameraInitRunnables.clear();
        this.loadingCameras = false;
        this.cameraInitied = false;
        if (z10 || !"APP_PAUSED".equals(exc.getMessage()) || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new s(2, this, runnable), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$4(boolean z10, Runnable runnable) {
        SharedPreferences sharedPreferences;
        Camera camera;
        Camera.Parameters parameters;
        try {
            if (this.cameraInfos == null) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                String string = globalMainSettings.getString("cameraCache", null);
                a4.e eVar = new a4.e(24);
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int readInt32 = serializedData.readInt32(false);
                    for (int i10 = 0; i10 < readInt32; i10++) {
                        CameraInfo cameraInfo = new CameraInfo(serializedData.readInt32(false), serializedData.readInt32(false));
                        int readInt322 = serializedData.readInt32(false);
                        for (int i11 = 0; i11 < readInt322; i11++) {
                            cameraInfo.previewSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        int readInt323 = serializedData.readInt32(false);
                        for (int i12 = 0; i12 < readInt323; i12++) {
                            cameraInfo.pictureSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        arrayList.add(cameraInfo);
                        Collections.sort(cameraInfo.previewSizes, eVar);
                        Collections.sort(cameraInfo.pictureSizes, eVar);
                    }
                    serializedData.cleanup();
                } else {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    int i13 = 4;
                    int i14 = 0;
                    while (i14 < numberOfCameras) {
                        Camera.getCameraInfo(i14, cameraInfo2);
                        CameraInfo cameraInfo3 = new CameraInfo(i14, cameraInfo2.facing);
                        if (ApplicationLoader.mainInterfacePaused && ApplicationLoader.externalInterfacePaused) {
                            throw new RuntimeException("APP_PAUSED");
                        }
                        Camera open = Camera.open(cameraInfo3.getCameraId());
                        Camera.Parameters parameters2 = open.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
                        int i15 = 0;
                        while (true) {
                            sharedPreferences = globalMainSettings;
                            if (i15 >= supportedPreviewSizes.size()) {
                                break;
                            }
                            Camera.Size size = supportedPreviewSizes.get(i15);
                            Camera.CameraInfo cameraInfo4 = cameraInfo2;
                            int i16 = size.height;
                            int i17 = i14;
                            if (i16 < 2160) {
                                camera = open;
                                int i18 = size.width;
                                if (i18 < 2160) {
                                    parameters = parameters2;
                                    cameraInfo3.previewSizes.add(new Size(i18, i16));
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("preview size = " + size.width + " " + size.height);
                                    }
                                    i15++;
                                    globalMainSettings = sharedPreferences;
                                    cameraInfo2 = cameraInfo4;
                                    i14 = i17;
                                    open = camera;
                                    parameters2 = parameters;
                                }
                            } else {
                                camera = open;
                            }
                            parameters = parameters2;
                            i15++;
                            globalMainSettings = sharedPreferences;
                            cameraInfo2 = cameraInfo4;
                            i14 = i17;
                            open = camera;
                            parameters2 = parameters;
                        }
                        Camera.CameraInfo cameraInfo5 = cameraInfo2;
                        int i19 = i14;
                        Camera camera2 = open;
                        List<Camera.Size> supportedPictureSizes = parameters2.getSupportedPictureSizes();
                        for (int i20 = 0; i20 < supportedPictureSizes.size(); i20++) {
                            Camera.Size size2 = supportedPictureSizes.get(i20);
                            if (!"samsung".equals(Build.MANUFACTURER) || !"jflteuc".equals(Build.PRODUCT) || size2.width < 2048) {
                                cameraInfo3.pictureSizes.add(new Size(size2.width, size2.height));
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("picture size = " + size2.width + " " + size2.height);
                                }
                            }
                        }
                        camera2.release();
                        arrayList.add(cameraInfo3);
                        Collections.sort(cameraInfo3.previewSizes, eVar);
                        Collections.sort(cameraInfo3.pictureSizes, eVar);
                        i13 += ((cameraInfo3.previewSizes.size() + cameraInfo3.pictureSizes.size()) * 8) + 8;
                        i14 = i19 + 1;
                        globalMainSettings = sharedPreferences;
                        cameraInfo2 = cameraInfo5;
                    }
                    SharedPreferences sharedPreferences2 = globalMainSettings;
                    SerializedData serializedData2 = new SerializedData(i13);
                    serializedData2.writeInt32(arrayList.size());
                    for (int i21 = 0; i21 < numberOfCameras; i21++) {
                        CameraInfo cameraInfo6 = arrayList.get(i21);
                        serializedData2.writeInt32(cameraInfo6.cameraId);
                        serializedData2.writeInt32(cameraInfo6.frontCamera);
                        int size3 = cameraInfo6.previewSizes.size();
                        serializedData2.writeInt32(size3);
                        for (int i22 = 0; i22 < size3; i22++) {
                            Size size4 = cameraInfo6.previewSizes.get(i22);
                            serializedData2.writeInt32(size4.mWidth);
                            serializedData2.writeInt32(size4.mHeight);
                        }
                        int size5 = cameraInfo6.pictureSizes.size();
                        serializedData2.writeInt32(size5);
                        for (int i23 = 0; i23 < size5; i23++) {
                            Size size6 = cameraInfo6.pictureSizes.get(i23);
                            serializedData2.writeInt32(size6.mWidth);
                            serializedData2.writeInt32(size6.mHeight);
                        }
                    }
                    sharedPreferences2.edit().putString("cameraCache", Base64.encodeToString(serializedData2.toByteArray(), 0)).commit();
                    serializedData2.cleanup();
                }
                this.cameraInfos = arrayList;
            }
            AndroidUtilities.runOnUIThread(new c(this, 2));
        } catch (Exception e7) {
            FileLog.e(e7, !"APP_PAUSED".equals(e7.getMessage()));
            AndroidUtilities.runOnUIThread(new e4(this, z10, e7, runnable, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$10(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                Camera open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
                camera = open;
            } catch (Exception e7) {
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                FileLog.e(e7);
                return;
            }
        }
        camera.setErrorCallback(getErrorListener(cameraSession));
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        cameraSession.availableFlashModes.clear();
        if (supportedFlashModes != null) {
            for (int i10 = 0; i10 < supportedFlashModes.size(); i10++) {
                String str = supportedFlashModes.get(i10);
                if (str.equals("off") || str.equals("on") || str.equals("auto")) {
                    cameraSession.availableFlashModes.add(str);
                }
            }
            if (TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) && cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
            }
            cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
        }
        if (runnable != null) {
            runnable.run();
        }
        cameraSession.configurePhotoCamera();
        camera.setPreviewTexture(surfaceTexture);
        camera.startPreview();
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openRound$9(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        Camera camera = cameraSession.cameraInfo.camera;
        try {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start creating round camera session");
            }
            if (camera == null) {
                CameraInfo cameraInfo = cameraSession.cameraInfo;
                Camera open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
                camera = open;
            }
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            cameraSession.availableFlashModes.clear();
            if (supportedFlashModes != null) {
                for (int i10 = 0; i10 < supportedFlashModes.size(); i10++) {
                    String str = supportedFlashModes.get(i10);
                    if (str.equals("off") || str.equals("on") || str.equals("auto")) {
                        cameraSession.availableFlashModes.add(str);
                    }
                }
                if (TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) && cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                    cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
                }
                cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
            }
            cameraSession.configureRoundCamera(true);
            if (runnable != null) {
                runnable.run();
            }
            camera.setPreviewTexture(surfaceTexture);
            camera.startPreview();
            if (runnable2 != null) {
                AndroidUtilities.runOnUIThread(runnable2);
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("round camera session created");
            }
        } catch (Exception e7) {
            cameraSession.cameraInfo.camera = null;
            if (camera != null) {
                camera.release();
            }
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordVideo$12(ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        iCameraView.startRecording(file, new u(14, this, z10));
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordVideo$13(Object obj, ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        try {
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        Camera.Parameters parameters = camera.getParameters();
                        parameters.setFlashMode(cameraSession.getCurrentFlashMode().equals("on") ? "torch" : "off");
                        camera.setParameters(parameters);
                        cameraSession.onStartRecord();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(true);
            }
            AndroidUtilities.runOnUIThread(new u1(this, iCameraView, file, z10, runnable, 12));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordVideo$14(Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
        if (camera != null) {
            try {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode(cameraSession.getCurrentFlashMode().equals("on") ? "torch" : "off");
                    camera.setParameters(parameters);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                camera.unlock();
                try {
                    this.mirrorRecorderVideo = z10;
                    MediaRecorder mediaRecorder = new MediaRecorder();
                    this.recorder = mediaRecorder;
                    mediaRecorder.setCamera(camera);
                    this.recorder.setVideoSource(1);
                    this.recorder.setAudioSource(5);
                    cameraSession.configureRecorder(1, this.recorder);
                    this.recorder.setOutputFile(file.getAbsolutePath());
                    this.recorder.setMaxFileSize(1073741824L);
                    this.recorder.setVideoFrameRate(30);
                    this.recorder.setMaxDuration(0);
                    Size chooseOptimalSize = chooseOptimalSize(cameraInfo.getPictureSizes(), 720, 480, new Size(16, 9), false);
                    this.recorder.setVideoEncodingBitRate(Math.min(chooseOptimalSize.mHeight, chooseOptimalSize.mWidth) >= 720 ? 3500000 : 1800000);
                    this.recorder.setVideoSize(chooseOptimalSize.getWidth(), chooseOptimalSize.getHeight());
                    this.recorder.setOnInfoListener(this);
                    this.recorder.prepare();
                    this.recorder.start();
                    this.onVideoTakeCallback = videoTakeCallback;
                    this.recordedFile = file.getAbsolutePath();
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable);
                    }
                } catch (Exception e10) {
                    this.recorder.release();
                    this.recorder = null;
                    FileLog.e(e10);
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPreview$7(CameraSession cameraSession) {
        Camera open;
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
            } catch (Exception e7) {
                e = e7;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e10) {
                e = e10;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                FileLog.e(e);
                return;
            }
        }
        camera.startPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopPreview$8(CameraSession cameraSession) {
        Camera open;
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
            } catch (Exception e7) {
                e = e7;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e10) {
                e = e10;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                FileLog.e(e);
                return;
            }
        }
        camera.stopPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopVideoRecording$16(Camera camera, CameraSession cameraSession) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(cameraSession.getCurrentFlashMode());
            camera.setParameters(parameters);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopVideoRecording$17(Object obj, boolean z10, boolean z11) {
        try {
            MediaRecorder mediaRecorder = this.recorder;
            if (mediaRecorder != null) {
                this.recorder = null;
                try {
                    mediaRecorder.stop();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                try {
                    mediaRecorder.release();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        camera.reconnect();
                        camera.startPreview();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    try {
                        cameraSession.stopVideoRecording();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode("off");
                    camera.setParameters(parameters);
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                this.threadPool.execute(new s(3, camera, cameraSession));
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(false);
            }
            if (z10 || this.onVideoTakeCallback == null) {
                this.onVideoTakeCallback = null;
            } else {
                lambda$recordVideo$11(z11);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7 A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bc, blocks: (B:8:0x0051, B:32:0x00b8, B:35:0x00c0, B:37:0x00d7), top: B:7:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$takePicture$6(File file, CameraInfo cameraInfo, boolean z10, boolean z11, Utilities.Callback callback, byte[] bArr, Camera camera) {
        Bitmap bitmap;
        Exception exc;
        int i10;
        Throwable th2;
        int photoSize = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
        Locale locale = Locale.US;
        String str = Utilities.MD5(file.getAbsolutePath()) + "@" + photoSize + "_" + photoSize;
        int i11 = 0;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (Throwable th3) {
            FileLog.e(th3);
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        try {
            i10 = getOrientation(bArr);
            try {
                if (cameraInfo.frontCamera != 0 && z10) {
                    try {
                        Matrix matrix = new Matrix();
                        if (!z11 && i10 != -1) {
                            matrix.setRotate(i10);
                        }
                        try {
                            matrix.postScale(-1.0f, 1.0f);
                            Bitmap createBitmap = Bitmaps.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                            if (createBitmap != bitmap2) {
                                bitmap2.recycle();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(createBitmap), str, false);
                            if (callback != null) {
                                callback.run(0);
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th2 = th4;
                            i10 = 0;
                            FileLog.e(th2);
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.flush();
                            fileOutputStream2.getFD().sync();
                            fileOutputStream2.close();
                            if (bitmap2 != null) {
                            }
                            if (callback != null) {
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                }
                FileOutputStream fileOutputStream22 = new FileOutputStream(file);
                fileOutputStream22.write(bArr);
                fileOutputStream22.flush();
                fileOutputStream22.getFD().sync();
                fileOutputStream22.close();
                if (bitmap2 != null) {
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap2), str, false);
                }
            } catch (Exception e7) {
                exc = e7;
                i11 = i10;
                FileLog.e(exc);
                i10 = i11;
                if (callback != null) {
                }
            }
        } catch (Exception e10) {
            exc = e10;
        }
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    private static int pack(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i10 += i11 - 1;
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i13 = 0;
        while (true) {
            int i14 = i11 - 1;
            if (i11 <= 0) {
                return i13;
            }
            i13 = (bArr[i10] & 255) | (i13 << 8);
            i10 += i12;
            i11 = i14;
        }
    }

    public void addOnErrorListener(ErrorCallback errorCallback) {
        if (this.errorCallbacks == null) {
            this.errorCallbacks = new ArrayList<>();
        }
        this.errorCallbacks.remove(errorCallback);
        this.errorCallbacks.add(errorCallback);
    }

    public void cancelOnInitRunnable(Runnable runnable) {
        this.onFinishCameraInitRunnables.remove(runnable);
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable) {
        close(cameraSession, countDownLatch, runnable, null);
    }

    public ArrayList<CameraInfo> getCameras() {
        return this.cameraInfos;
    }

    public Camera.ErrorCallback getErrorListener(final CameraSession cameraSession) {
        return new Camera.ErrorCallback() { // from class: org.telegram.messenger.camera.g
            @Override // android.hardware.Camera.ErrorCallback
            public final void onError(int i10, Camera camera) {
                CameraController.this.lambda$getErrorListener$18(cameraSession, i10, camera);
            }
        };
    }

    public void initCamera(Runnable runnable) {
        initCamera(runnable, false);
    }

    public boolean isCameraInitied() {
        return (!this.cameraInitied || this.cameraInfos == null || this.cameraInfos.isEmpty()) ? false : true;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i10, int i11) {
        if (i10 == 800 || i10 == 801 || i10 == 1) {
            MediaRecorder mediaRecorder2 = this.recorder;
            this.recorder = null;
            if (mediaRecorder2 != null) {
                mediaRecorder2.stop();
                mediaRecorder2.release();
            }
            if (this.onVideoTakeCallback != null) {
                lambda$recordVideo$11(true);
            }
        }
    }

    public void open(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession == null || surfaceTexture == null) {
            return;
        }
        this.threadPool.execute(new z2(this, cameraSession, runnable2, surfaceTexture, runnable));
    }

    public void openRound(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new androidx.car.app.utils.b(cameraSession, runnable2, surfaceTexture, runnable, 26));
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("failed to open round " + cameraSession + " tex = " + surfaceTexture);
        }
    }

    public void recordVideo(Object obj, File file, boolean z10, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView) {
        recordVideo(obj, file, z10, videoTakeCallback, runnable, iCameraView, true);
    }

    public void removeOnErrorListener(ErrorCallback errorCallback) {
        ArrayList<ErrorCallback> arrayList = this.errorCallbacks;
        if (arrayList != null) {
            arrayList.remove(errorCallback);
        }
    }

    public void startPreview(Object obj) {
        if (obj == null || !(obj instanceof CameraSession)) {
            return;
        }
        this.threadPool.execute(new h(this, (CameraSession) obj, 1));
    }

    public void stopPreview(Object obj) {
        if (obj == null || !(obj instanceof CameraSession)) {
            return;
        }
        this.threadPool.execute(new h(this, (CameraSession) obj, 0));
    }

    public void stopVideoRecording(Object obj, boolean z10) {
        stopVideoRecording(obj, z10, true);
    }

    public boolean takePicture(final File file, final boolean z10, Object obj, final Utilities.Callback<Integer> callback) {
        if (obj != null) {
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                final CameraInfo cameraInfo = cameraSession.cameraInfo;
                final boolean isFlipFront = cameraSession.isFlipFront();
                try {
                    cameraInfo.camera.takePicture(null, null, new Camera.PictureCallback() { // from class: org.telegram.messenger.camera.f
                        @Override // android.hardware.Camera.PictureCallback
                        public final void onPictureTaken(byte[] bArr, Camera camera) {
                            CameraController.lambda$takePicture$6(file, cameraInfo, isFlipFront, z10, callback, bArr, camera);
                        }
                    });
                    return true;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return false;
                }
            }
            if (obj instanceof Camera2Session) {
                return ((Camera2Session) obj).takePicture(file, callback);
            }
        }
        return false;
    }

    private void initCamera(Runnable runnable, boolean z10) {
        if (this.cameraInitied) {
            return;
        }
        if (runnable != null && !this.onFinishCameraInitRunnables.contains(runnable)) {
            this.onFinishCameraInitRunnables.add(runnable);
        }
        if (this.loadingCameras || this.cameraInitied) {
            return;
        }
        this.loadingCameras = true;
        this.threadPool.execute(new y0(this, z10, runnable, 7));
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable, Runnable runnable2) {
        cameraSession.destroy();
        this.threadPool.execute(new androidx.car.app.utils.b(runnable, cameraSession, countDownLatch, runnable2, 27));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public void recordVideo(Object obj, File file, boolean z10, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView, boolean z11) {
        if (obj == null) {
            return;
        }
        if (iCameraView != null) {
            this.recordingCurrentCameraView = iCameraView;
            this.onVideoTakeCallback = videoTakeCallback;
            this.recordedFile = file.getAbsolutePath();
            this.threadPool.execute(new b1(this, obj, iCameraView, file, z11, runnable, 5));
            return;
        }
        if (obj instanceof CameraSession) {
            CameraSession cameraSession = (CameraSession) obj;
            CameraInfo cameraInfo = cameraSession.cameraInfo;
            this.threadPool.execute(new hg.y0(this, cameraInfo.camera, cameraSession, z10, file, cameraInfo, videoTakeCallback, runnable, 4));
        }
    }

    public void stopVideoRecording(Object obj, boolean z10, boolean z11) {
        ICameraView iCameraView = this.recordingCurrentCameraView;
        if (iCameraView == null) {
            this.threadPool.execute(new i(this, obj, z10, z11));
        } else {
            iCameraView.stopRecording();
            this.recordingCurrentCameraView = null;
        }
    }
}
