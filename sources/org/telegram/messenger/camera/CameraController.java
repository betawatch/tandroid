package org.telegram.messenger.camera;

import aa.d0;
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
import bi.k1;
import bi.l4;
import bi.u0;
import bi.u7;
import bi.w2;
import fi.q1;
import h2.o0;
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
import jg.w0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gz;
import org.telegram.messenger.iz;
import org.telegram.messenger.jl;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    /* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
    public static class CompareSizesByArea implements Comparator<Size> {
        @Override // java.util.Comparator
        public int compare(Size size, Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    /* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
    public interface ErrorCallback {
        void onError(int i7, Camera camera, CameraSessionWrapper cameraSessionWrapper);
    }

    /* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
    public interface ICameraView {
        boolean startRecording(File file, Runnable runnable);

        void stopRecording();
    }

    /* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
    public interface VideoTakeCallback {
        void onFinishVideoRecording(String str, long j3);
    }

    public static Size chooseOptimalSize(List<Size> list, int i7, int i10, Size size, boolean z9) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        int width = size.getWidth();
        int height = size.getHeight();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size2 = list.get(i11);
            if (!z9 || (size2.getHeight() <= i10 && size2.getWidth() <= i7)) {
                if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i7 && size2.getHeight() >= i10) {
                    arrayList.add(size2);
                } else if (size2.getWidth() * size2.getHeight() <= i7 * i10 * 4) {
                    arrayList2.add(size2);
                }
            }
        }
        return arrayList.size() > 0 ? (Size) Collections.min(arrayList, new CompareSizesByArea()) : arrayList2.size() > 0 ? (Size) Collections.min(arrayList2, new CompareSizesByArea()) : (Size) Collections.max(list, new CompareSizesByArea());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0035, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[SYNTHETIC] */
    /* renamed from: finishRecordingVideo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$recordVideo$11(boolean z9) {
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
                } catch (Exception e10) {
                    e = e10;
                    a8.g(e, true);
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
                } catch (Exception e11) {
                    a8.g(e11, true);
                    throw th2;
                }
            }
        } catch (Exception e12) {
            e = e12;
            mediaMetadataRetriever = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (mediaMetadataRetriever2 != null) {
            }
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception e13) {
            a8.g(e13, true);
        }
        long j10 = j3;
        if (z9) {
            Bitmap r10 = gz.r(1, this.recordedFile);
            if (this.mirrorRecorderVideo) {
                Bitmap createBitmap = Bitmap.createBitmap(r10.getWidth(), r10.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(-1.0f, 1.0f, createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                canvas.drawBitmap(r10, 0.0f, 0.0f, (Paint) null);
                r10.recycle();
                r10 = createBitmap;
            }
            File file2 = new File(w7.z(4), "-2147483648_" + iz.p() + ".jpg");
            try {
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Throwable unused) {
                }
                try {
                    r10.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        a8.g(th, true);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        bitmap = r10;
                        file = file2;
                        iz.y();
                        g0.h3(new w2(this, file, bitmap, j10, 15));
                    } finally {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            bitmap = r10;
            file = file2;
        } else {
            file = null;
            bitmap = null;
        }
        iz.y();
        g0.h3(new w2(this, file, bitmap, j10, 15));
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r9 <= 8) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r3 = pack(r11, r2, 4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        if (r3 == 1229531648) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        if (r3 == 1296891946) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r3 != 1229531648) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        r4 = pack(r11, r2 + 4, 4, r3) + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        if (r4 < 10) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        if (r4 <= r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        r2 = r2 + r4;
        r9 = r9 - r4;
        r4 = pack(r11, r2 - 2, 2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        r6 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r4 <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        if (r9 < 12) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009a, code lost:
    
        if (pack(r11, r2, 2, r3) != 274) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
    
        r2 = r2 + 12;
        r9 = r9 - 12;
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        r11 = pack(r11, r2 + 8, 2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        if (r11 == 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
    
        if (r11 == 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        if (r11 == 6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
    
        if (r11 == 8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ac, code lost:
    
        return org.telegram.messenger.qs.t4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00af, code lost:
    
        return 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
    
        return org.telegram.messenger.qs.K2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0075, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x005c, code lost:
    
        r9 = 0;
        r2 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getOrientation(byte[] bArr) {
        int i7;
        if (bArr == null) {
            return -1;
        }
        int i10 = 0;
        while (true) {
            if (i10 + 3 >= bArr.length) {
                i7 = 0;
                break;
            }
            int i11 = i10 + 1;
            if ((bArr[i10] & 255) != 255) {
                break;
            }
            int i12 = bArr[i11] & 255;
            if (i12 != 255) {
                i11 = i10 + 2;
                if (i12 != 216 && i12 != 1) {
                    if (i12 != 217 && i12 != 218) {
                        int pack = pack(bArr, i11, 2, false);
                        if (pack >= 2 && (i11 = i11 + pack) <= bArr.length) {
                            if (i12 == 225 && pack >= 8 && pack(bArr, i10 + 4, 4, false) == 1165519206 && pack(bArr, i10 + 8, 2, false) == 0) {
                                i10 += 10;
                                i7 = pack - 8;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i10 = i11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$close$5(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        }
        Camera camera = cameraSession.cameraInfo.camera;
        if (camera != null) {
            try {
                camera.stopPreview();
                cameraSession.cameraInfo.camera.setPreviewCallbackWithBuffer(null);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                cameraSession.cameraInfo.camera.release();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            cameraSession.cameraInfo.camera = null;
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (runnable2 != null) {
            g0.h3(runnable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finishRecordingVideo$15(File file, Bitmap bitmap, long j3) {
        String str;
        if (this.onVideoTakeCallback != null) {
            if (file != null) {
                str = file.getAbsolutePath();
                if (bitmap != null) {
                    gc.D().O(new BitmapDrawable(bitmap), Utilities.a(str), false);
                }
            } else {
                str = null;
            }
            this.onVideoTakeCallback.onFinishVideoRecording(str, j3);
            this.onVideoTakeCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getErrorListener$18(CameraSession cameraSession, int i7, Camera camera) {
        if (this.errorCallbacks != null) {
            for (int i10 = 0; i10 < this.errorCallbacks.size(); i10++) {
                ErrorCallback errorCallback = this.errorCallbacks.get(i10);
                if (errorCallback != null) {
                    errorCallback.onError(i7, camera, CameraSessionWrapper.of(cameraSession));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$initCamera$0(Size size, Size size2) {
        int i7 = size.mWidth;
        int i10 = size2.mWidth;
        if (i7 < i10) {
            return 1;
        }
        if (i7 > i10) {
            return -1;
        }
        int i11 = size.mHeight;
        int i12 = size2.mHeight;
        if (i11 < i12) {
            return 1;
        }
        return i11 > i12 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$1() {
        this.loadingCameras = false;
        this.cameraInitied = true;
        if (!this.onFinishCameraInitRunnables.isEmpty()) {
            for (int i7 = 0; i7 < this.onFinishCameraInitRunnables.size(); i7++) {
                this.onFinishCameraInitRunnables.get(i7).run();
            }
            this.onFinishCameraInitRunnables.clear();
        }
        qs.e().k(qs.l4, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$2(Runnable runnable) {
        initCamera(runnable, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$3(boolean z9, Exception exc, Runnable runnable) {
        this.onFinishCameraInitRunnables.clear();
        this.loadingCameras = false;
        this.cameraInitied = false;
        if (z9 || !"APP_PAUSED".equals(exc.getMessage()) || runnable == null) {
            return;
        }
        g0.i3(new s(2, this, runnable), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$4(boolean z9, Runnable runnable) {
        SharedPreferences sharedPreferences;
        Camera camera;
        Camera.Parameters parameters;
        try {
            if (this.cameraInfos == null) {
                SharedPreferences e12 = qp.e1();
                String string = e12.getString("cameraCache", null);
                jl jlVar = new jl(22);
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                int i7 = 0;
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
                        Collections.sort(cameraInfo.previewSizes, jlVar);
                        Collections.sort(cameraInfo.pictureSizes, jlVar);
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
                        if (t0.x && t0.D) {
                            throw new RuntimeException("APP_PAUSED");
                        }
                        Camera open = Camera.open(cameraInfo3.getCameraId());
                        Camera.Parameters parameters2 = open.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
                        int i15 = i7;
                        while (true) {
                            sharedPreferences = e12;
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
                                    if (r2.a) {
                                        a8.b("preview size = " + size.width + " " + size.height);
                                    }
                                    i15++;
                                    e12 = sharedPreferences;
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
                            e12 = sharedPreferences;
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
                                if (r2.a) {
                                    a8.b("picture size = " + size2.width + " " + size2.height);
                                }
                            }
                        }
                        camera2.release();
                        arrayList.add(cameraInfo3);
                        Collections.sort(cameraInfo3.previewSizes, jlVar);
                        Collections.sort(cameraInfo3.pictureSizes, jlVar);
                        i13 += ((cameraInfo3.previewSizes.size() + cameraInfo3.pictureSizes.size()) * 8) + 8;
                        i14 = i19 + 1;
                        e12 = sharedPreferences;
                        cameraInfo2 = cameraInfo5;
                        i7 = 0;
                    }
                    SharedPreferences sharedPreferences2 = e12;
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
            g0.h3(new c(this, 2));
        } catch (Exception e10) {
            a8.g(e10, !"APP_PAUSED".equals(e10.getMessage()));
            g0.h3(new d0(this, z9, e10, runnable, 24));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$open$10(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                Camera open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
                camera = open;
            } catch (Exception e10) {
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                a8.g(e10, true);
                return;
            }
        }
        camera.setErrorCallback(getErrorListener(cameraSession));
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        cameraSession.availableFlashModes.clear();
        if (supportedFlashModes != null) {
            for (int i7 = 0; i7 < supportedFlashModes.size(); i7++) {
                String str = supportedFlashModes.get(i7);
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
            g0.h3(runnable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$openRound$9(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        Camera camera = cameraSession.cameraInfo.camera;
        try {
            if (r2.a) {
                a8.b("start creating round camera session");
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
                for (int i7 = 0; i7 < supportedFlashModes.size(); i7++) {
                    String str = supportedFlashModes.get(i7);
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
                g0.h3(runnable2);
            }
            if (r2.a) {
                a8.b("round camera session created");
            }
        } catch (Exception e10) {
            cameraSession.cameraInfo.camera = null;
            if (camera != null) {
                camera.release();
            }
            a8.g(e10, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordVideo$12(ICameraView iCameraView, File file, boolean z9, Runnable runnable) {
        iCameraView.startRecording(file, new k1(13, this, z9));
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$recordVideo$13(Object obj, ICameraView iCameraView, File file, boolean z9, Runnable runnable) {
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
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(true);
            }
            g0.h3(new q1(this, iCameraView, file, z9, runnable));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$recordVideo$14(Camera camera, CameraSession cameraSession, boolean z9, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
        if (camera != null) {
            try {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode(cameraSession.getCurrentFlashMode().equals("on") ? "torch" : "off");
                    camera.setParameters(parameters);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                camera.unlock();
                try {
                    this.mirrorRecorderVideo = z9;
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
                        g0.h3(runnable);
                    }
                } catch (Exception e11) {
                    this.recorder.release();
                    this.recorder = null;
                    a8.g(e11, true);
                }
            } catch (Exception e12) {
                a8.g(e12, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startPreview$7(CameraSession cameraSession) {
        Camera open;
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
            } catch (Exception e10) {
                e = e10;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e11) {
                e = e11;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                a8.g(e, true);
                return;
            }
        }
        camera.startPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$stopPreview$8(CameraSession cameraSession) {
        Camera open;
        CameraInfo cameraInfo = cameraSession.cameraInfo;
        Camera camera = cameraInfo.camera;
        if (camera == null) {
            try {
                open = Camera.open(cameraInfo.cameraId);
                cameraInfo.camera = open;
            } catch (Exception e10) {
                e = e10;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e11) {
                e = e11;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                a8.g(e, true);
                return;
            }
        }
        camera.stopPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$stopVideoRecording$16(Camera camera, CameraSession cameraSession) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(cameraSession.getCurrentFlashMode());
            camera.setParameters(parameters);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$stopVideoRecording$17(Object obj, boolean z9, boolean z10) {
        try {
            MediaRecorder mediaRecorder = this.recorder;
            if (mediaRecorder != null) {
                this.recorder = null;
                try {
                    mediaRecorder.stop();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                try {
                    mediaRecorder.release();
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        camera.reconnect();
                        camera.startPreview();
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    try {
                        cameraSession.stopVideoRecording();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode("off");
                    camera.setParameters(parameters);
                } catch (Exception e14) {
                    a8.g(e14, true);
                }
                this.threadPool.execute(new s(3, camera, cameraSession));
            } else if (obj instanceof Camera2Session) {
                ((Camera2Session) obj).setRecordingVideo(false);
            }
            if (z9 || this.onVideoTakeCallback == null) {
                this.onVideoTakeCallback = null;
            } else {
                lambda$recordVideo$11(z10);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c0, blocks: (B:8:0x0055, B:32:0x00bc, B:35:0x00c4, B:37:0x00db), top: B:7:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void lambda$takePicture$6(File file, CameraInfo cameraInfo, boolean z9, boolean z10, c20 c20Var, byte[] bArr, Camera camera) {
        Bitmap bitmap;
        Exception exc;
        int i7;
        Throwable th2;
        int i10 = 0;
        int Z0 = (int) (g0.Z0(false) / g0.p);
        Locale locale = Locale.US;
        String str = Utilities.a(file.getAbsolutePath()) + "@" + Z0 + "_" + Z0;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (Throwable th3) {
            a8.g(th3, true);
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        try {
            i7 = getOrientation(bArr);
            try {
                if (cameraInfo.frontCamera != 0 && z9) {
                    try {
                        Matrix matrix = new Matrix();
                        if (!z10 && i7 != -1) {
                            matrix.setRotate(i7);
                        }
                        try {
                            matrix.postScale(-1.0f, 1.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                            if (createBitmap != bitmap2) {
                                bitmap2.recycle();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            gc.D().O(new BitmapDrawable(createBitmap), str, false);
                            if (c20Var != null) {
                                c20Var.a(0);
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th2 = th4;
                            i7 = 0;
                            a8.g(th2, true);
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.flush();
                            fileOutputStream2.getFD().sync();
                            fileOutputStream2.close();
                            if (bitmap2 != null) {
                            }
                            if (c20Var != null) {
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
                    gc.D().O(new BitmapDrawable(bitmap2), str, false);
                }
            } catch (Exception e10) {
                exc = e10;
                i10 = i7;
                a8.g(exc, true);
                i7 = i10;
                if (c20Var != null) {
                }
            }
        } catch (Exception e11) {
            exc = e11;
        }
        if (c20Var != null) {
            c20Var.a(Integer.valueOf(i7));
        }
    }

    private static int pack(byte[] bArr, int i7, int i10, boolean z9) {
        int i11;
        if (z9) {
            i7 += i10 - 1;
            i11 = -1;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            int i13 = i10 - 1;
            if (i10 <= 0) {
                return i12;
            }
            i12 = (bArr[i7] & 255) | (i12 << 8);
            i7 += i11;
            i10 = i13;
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
            public final void onError(int i7, Camera camera) {
                CameraController.this.lambda$getErrorListener$18(cameraSession, i7, camera);
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
    public void onInfo(MediaRecorder mediaRecorder, int i7, int i10) {
        if (i7 == 800 || i7 == 801 || i7 == 1) {
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
        this.threadPool.execute(new u0(this, cameraSession, runnable2, surfaceTexture, runnable, 18));
    }

    public void openRound(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new ai.d0(cameraSession, runnable2, surfaceTexture, runnable, 25));
            return;
        }
        if (r2.a) {
            a8.b("failed to open round " + cameraSession + " tex = " + surfaceTexture);
        }
    }

    public void recordVideo(Object obj, File file, boolean z9, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView) {
        recordVideo(obj, file, z9, videoTakeCallback, runnable, iCameraView, true);
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

    public void stopVideoRecording(Object obj, boolean z9) {
        stopVideoRecording(obj, z9, true);
    }

    public boolean takePicture(final File file, final boolean z9, Object obj, final c20 c20Var) {
        if (obj != null) {
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                final CameraInfo cameraInfo = cameraSession.cameraInfo;
                final boolean isFlipFront = cameraSession.isFlipFront();
                try {
                    cameraInfo.camera.takePicture(null, null, new Camera.PictureCallback() { // from class: org.telegram.messenger.camera.f
                        @Override // android.hardware.Camera.PictureCallback
                        public final void onPictureTaken(byte[] bArr, Camera camera) {
                            CameraController.lambda$takePicture$6(file, cameraInfo, isFlipFront, z9, c20Var, bArr, camera);
                        }
                    });
                    return true;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return false;
                }
            }
            if (obj instanceof Camera2Session) {
                return ((Camera2Session) obj).takePicture(file, c20Var);
            }
        }
        return false;
    }

    private void initCamera(Runnable runnable, boolean z9) {
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
        this.threadPool.execute(new u7(this, z9, runnable, 10));
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable, Runnable runnable2) {
        cameraSession.destroy();
        this.threadPool.execute(new ai.d0(runnable, cameraSession, countDownLatch, runnable2, 26));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public void recordVideo(Object obj, File file, boolean z9, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView, boolean z10) {
        if (obj == null) {
            return;
        }
        if (iCameraView != null) {
            this.recordingCurrentCameraView = iCameraView;
            this.onVideoTakeCallback = videoTakeCallback;
            this.recordedFile = file.getAbsolutePath();
            this.threadPool.execute(new l4(2, this, obj, iCameraView, file, runnable, z10));
            return;
        }
        if (obj instanceof CameraSession) {
            CameraSession cameraSession = (CameraSession) obj;
            CameraInfo cameraInfo = cameraSession.cameraInfo;
            this.threadPool.execute(new w0(this, cameraInfo.camera, cameraSession, z9, file, cameraInfo, videoTakeCallback, runnable));
        }
    }

    public void stopVideoRecording(Object obj, boolean z9, boolean z10) {
        ICameraView iCameraView = this.recordingCurrentCameraView;
        if (iCameraView == null) {
            this.threadPool.execute(new o0(this, obj, z9, z10, 2));
        } else {
            iCameraView.stopRecording();
            this.recordingCurrentCameraView = null;
        }
    }
}
