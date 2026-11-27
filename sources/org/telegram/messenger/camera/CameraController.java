package org.telegram.messenger.camera;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    static class CompareSizesByArea implements Comparator<Size> {
        @Override // java.util.Comparator
        public int compare(Size size, Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public interface ErrorCallback {
        void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper);
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public interface ICameraView {
        boolean startRecording(File file, Runnable runnable);

        void stopRecording();
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public interface VideoTakeCallback {
        void onFinishVideoRecording(String str, long j);
    }

    public static Size chooseOptimalSize(List<Size> list, int i, int i2, Size size, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        int width = size.getWidth();
        int height = size.getHeight();
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size2 = list.get(i3);
            if (!z || (size2.getHeight() <= i2 && size2.getWidth() <= i)) {
                if (size2.getHeight() == (size2.getWidth() * height) / width && size2.getWidth() >= i && size2.getHeight() >= i2) {
                    arrayList.add(size2);
                } else if (size2.getWidth() * size2.getHeight() <= ((i * i2) << 2)) {
                    arrayList2.add(size2);
                }
            }
        }
        return arrayList.size() > 0 ? (Size) Collections.min(arrayList, new CompareSizesByArea()) : arrayList2.size() > 0 ? (Size) Collections.min(arrayList2, new CompareSizesByArea()) : (Size) Collections.max(list, new CompareSizesByArea());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0026, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /* renamed from: finishRecordingVideo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$recordVideo$11(boolean z) {
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        File file;
        Bitmap bitmap;
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        FileOutputStream fileOutputStream2 = null;
        long j = 0;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.recordedFile);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata != null) {
                        j = Long.parseLong(extractMetadata);
                    }
                } catch (Exception e) {
                    e = e;
                    cc4.g(e, true);
                }
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    throw th;
                }
                try {
                    mediaMetadataRetriever2.release();
                    throw th;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            mediaMetadataRetriever = null;
        } catch (Throwable th3) {
            th = th3;
            if (mediaMetadataRetriever2 != null) {
            }
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception e4) {
            cc4.g(e4, true);
        }
        long j2 = j;
        if (z) {
            Bitmap q = r7a.q(1, this.recordedFile);
            if (this.mirrorRecorderVideo) {
                Bitmap createBitmap = Bitmap.createBitmap(q.getWidth(), q.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(-1.0f, 1.0f, createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                canvas.drawBitmap(q, 0.0f, 0.0f, (Paint) null);
                q.recycle();
                q = createBitmap;
            }
            File file2 = new File(xb4.z(4), "-2147483648_" + xea.p() + ".jpg");
            try {
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable unused) {
            }
            try {
                q.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream2 = fileOutputStream;
                try {
                    cc4.g(th, true);
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    bitmap = q;
                    file = file2;
                    xea.x();
                    hl.c3(new ba7((Object) this, (Object) file, (Object) bitmap, j2, (byte) 4));
                } finally {
                }
            }
            bitmap = q;
            file = file2;
        } else {
            file = null;
            bitmap = null;
        }
        xea.x();
        hl.c3(new ba7((Object) this, (Object) file, (Object) bitmap, j2, (byte) 4));
    }

    public static CameraController getInstance() {
        CameraController cameraController;
        CameraController cameraController2 = Instance;
        if (cameraController2 != null) {
            return cameraController2;
        }
        synchronized (CameraController.class) {
            cameraController = Instance;
            if (cameraController == null) {
                cameraController = new CameraController();
                Instance = cameraController;
            }
        }
        return cameraController;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r9 <= 8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        r3 = pack(r11, r2, 4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r3 == 1229531648) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r3 == 1296891946) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r3 != 1229531648) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        r4 = pack(r11, r2 + 4, 4, r3) + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        if (r4 < 10) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        if (r4 > r9) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        r2 = r2 + r4;
        r9 = r9 - r4;
        r4 = pack(r11, r2 - 2, 2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r6 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        if (r4 <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r9 < 12) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
    
        if (pack(r11, r2, 2, r3) != 274) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        r2 = r2 + 12;
        r9 = r9 - 12;
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        r11 = pack(r11, r2 + 8, 2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        if (r11 == 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        if (r11 == 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a3, code lost:
    
        if (r11 == 6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a5, code lost:
    
        if (r11 == 8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a7, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        return jn7.s4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        return 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ae, code lost:
    
        return jn7.J2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b1, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0072, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0059, code lost:
    
        r9 = 0;
        r2 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getOrientation(byte[] bArr) {
        int i;
        if (bArr == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            if (i2 + 3 >= bArr.length) {
                i = 0;
                break;
            }
            int i3 = i2 + 1;
            if ((bArr[i2] & 255) != 255) {
                break;
            }
            int i4 = bArr[i3] & 255;
            if (i4 != 255) {
                i3 = i2 + 2;
                if (i4 != 216 && i4 != 1) {
                    if (i4 != 217 && i4 != 218) {
                        int pack = pack(bArr, i3, 2, false);
                        if (pack >= 2 && (i3 = i3 + pack) <= bArr.length) {
                            if (i4 == 225 && pack >= 8 && pack(bArr, i2 + 4, 4, false) == 1165519206 && pack(bArr, i2 + 8, 2, false) == 0) {
                                i2 += 10;
                                i = pack - 8;
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
            i2 = i3;
        }
        return -1;
    }

    private void initCamera(Runnable runnable, boolean z) {
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
        this.threadPool.execute(new ds6((Object) this, z, (Object) runnable, (byte) 8));
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
            } catch (Exception e) {
                cc4.g(e, true);
            }
            try {
                cameraSession.cameraInfo.camera.release();
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            cameraSession.cameraInfo.camera = null;
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (runnable2 != null) {
            hl.c3(runnable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finishRecordingVideo$15(File file, Bitmap bitmap, long j) {
        String str;
        if (this.onVideoTakeCallback != null) {
            if (file != null) {
                str = file.getAbsolutePath();
                if (bitmap != null) {
                    in5.z().K(new BitmapDrawable(bitmap), Utilities.a(str), false);
                }
            } else {
                str = null;
            }
            this.onVideoTakeCallback.onFinishVideoRecording(str, j);
            this.onVideoTakeCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getErrorListener$18(CameraSession cameraSession, int i, Camera camera) {
        if (this.errorCallbacks != null) {
            for (int i2 = 0; i2 < this.errorCallbacks.size(); i2++) {
                ErrorCallback errorCallback = this.errorCallbacks.get(i2);
                if (errorCallback != null) {
                    errorCallback.onError(i, camera, CameraSessionWrapper.of(cameraSession));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$initCamera$0(Size size, Size size2) {
        int i = size.mWidth;
        int i2 = size2.mWidth;
        if (i < i2) {
            return 1;
        }
        if (i > i2) {
            return -1;
        }
        int i3 = size.mHeight;
        int i4 = size2.mHeight;
        if (i3 < i4) {
            return 1;
        }
        return i3 > i4 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$1() {
        ArrayList<Runnable> arrayList;
        this.loadingCameras = false;
        this.cameraInitied = true;
        if (!this.onFinishCameraInitRunnables.isEmpty()) {
            int i = 0;
            while (true) {
                int size = this.onFinishCameraInitRunnables.size();
                arrayList = this.onFinishCameraInitRunnables;
                if (i >= size) {
                    break;
                }
                arrayList.get(i).run();
                i++;
            }
            arrayList.clear();
        }
        jn7.e().k(jn7.o4, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$2(Runnable runnable) {
        initCamera(runnable, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$3(boolean z, Exception exc, Runnable runnable) {
        this.onFinishCameraInitRunnables.clear();
        this.loadingCameras = false;
        this.cameraInitied = false;
        if (z || !"APP_PAUSED".equals(exc.getMessage()) || runnable == null) {
            return;
        }
        hl.d3(new z21(this, runnable, (byte) 7), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCamera$4(boolean z, Runnable runnable) {
        SharedPreferences sharedPreferences;
        Camera camera;
        Camera.Parameters parameters;
        try {
            if (this.cameraInfos == null) {
                SharedPreferences e1 = uc7.e1();
                String string = e1.getString("cameraCache", null);
                ta taVar = new ta((byte) 17);
                ArrayList<CameraInfo> arrayList = new ArrayList<>();
                int i = 0;
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int readInt32 = serializedData.readInt32(false);
                    for (int i2 = 0; i2 < readInt32; i2++) {
                        CameraInfo cameraInfo = new CameraInfo(serializedData.readInt32(false), serializedData.readInt32(false));
                        int readInt322 = serializedData.readInt32(false);
                        for (int i3 = 0; i3 < readInt322; i3++) {
                            cameraInfo.previewSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        int readInt323 = serializedData.readInt32(false);
                        for (int i4 = 0; i4 < readInt323; i4++) {
                            cameraInfo.pictureSizes.add(new Size(serializedData.readInt32(false), serializedData.readInt32(false)));
                        }
                        arrayList.add(cameraInfo);
                        Collections.sort(cameraInfo.previewSizes, taVar);
                        Collections.sort(cameraInfo.pictureSizes, taVar);
                    }
                    serializedData.cleanup();
                } else {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    int i5 = 4;
                    int i6 = 0;
                    while (i6 < numberOfCameras) {
                        Camera.getCameraInfo(i6, cameraInfo2);
                        CameraInfo cameraInfo3 = new CameraInfo(i6, cameraInfo2.facing);
                        if (org.telegram.messenger.a.x && org.telegram.messenger.a.E) {
                            throw new RuntimeException("APP_PAUSED");
                        }
                        Camera open = Camera.open(cameraInfo3.getCameraId());
                        Camera.Parameters parameters2 = open.getParameters();
                        List<Camera.Size> supportedPreviewSizes = parameters2.getSupportedPreviewSizes();
                        int i7 = i;
                        while (true) {
                            sharedPreferences = e1;
                            if (i7 >= supportedPreviewSizes.size()) {
                                break;
                            }
                            Camera.Size size = supportedPreviewSizes.get(i7);
                            Camera.CameraInfo cameraInfo4 = cameraInfo2;
                            int i8 = size.height;
                            int i9 = i6;
                            if (i8 < 2160) {
                                camera = open;
                                int i10 = size.width;
                                if (i10 < 2160) {
                                    parameters = parameters2;
                                    cameraInfo3.previewSizes.add(new Size(i10, i8));
                                    if (f11.a) {
                                        cc4.b("preview size = " + size.width + " " + size.height);
                                    }
                                    i7++;
                                    e1 = sharedPreferences;
                                    cameraInfo2 = cameraInfo4;
                                    i6 = i9;
                                    open = camera;
                                    parameters2 = parameters;
                                }
                            } else {
                                camera = open;
                            }
                            parameters = parameters2;
                            i7++;
                            e1 = sharedPreferences;
                            cameraInfo2 = cameraInfo4;
                            i6 = i9;
                            open = camera;
                            parameters2 = parameters;
                        }
                        Camera.CameraInfo cameraInfo5 = cameraInfo2;
                        int i11 = i6;
                        Camera camera2 = open;
                        List<Camera.Size> supportedPictureSizes = parameters2.getSupportedPictureSizes();
                        for (int i12 = 0; i12 < supportedPictureSizes.size(); i12++) {
                            Camera.Size size2 = supportedPictureSizes.get(i12);
                            if (!"samsung".equals(Build.MANUFACTURER) || !"jflteuc".equals(Build.PRODUCT) || size2.width < 2048) {
                                cameraInfo3.pictureSizes.add(new Size(size2.width, size2.height));
                                if (f11.a) {
                                    cc4.b("picture size = " + size2.width + " " + size2.height);
                                }
                            }
                        }
                        camera2.release();
                        arrayList.add(cameraInfo3);
                        Collections.sort(cameraInfo3.previewSizes, taVar);
                        Collections.sort(cameraInfo3.pictureSizes, taVar);
                        i5 += ((cameraInfo3.previewSizes.size() + cameraInfo3.pictureSizes.size()) << 3) + 8;
                        i6 = i11 + 1;
                        e1 = sharedPreferences;
                        cameraInfo2 = cameraInfo5;
                        i = 0;
                    }
                    SharedPreferences sharedPreferences2 = e1;
                    SerializedData serializedData2 = new SerializedData(i5);
                    serializedData2.writeInt32(arrayList.size());
                    for (int i13 = 0; i13 < numberOfCameras; i13++) {
                        CameraInfo cameraInfo6 = arrayList.get(i13);
                        serializedData2.writeInt32(cameraInfo6.cameraId);
                        serializedData2.writeInt32(cameraInfo6.frontCamera);
                        int size3 = cameraInfo6.previewSizes.size();
                        serializedData2.writeInt32(size3);
                        for (int i14 = 0; i14 < size3; i14++) {
                            Size size4 = cameraInfo6.previewSizes.get(i14);
                            serializedData2.writeInt32(size4.mWidth);
                            serializedData2.writeInt32(size4.mHeight);
                        }
                        int size5 = cameraInfo6.pictureSizes.size();
                        serializedData2.writeInt32(size5);
                        for (int i15 = 0; i15 < size5; i15++) {
                            Size size6 = cameraInfo6.pictureSizes.get(i15);
                            serializedData2.writeInt32(size6.mWidth);
                            serializedData2.writeInt32(size6.mHeight);
                        }
                    }
                    sharedPreferences2.edit().putString("cameraCache", Base64.encodeToString(serializedData2.toByteArray(), 0)).commit();
                    serializedData2.cleanup();
                }
                this.cameraInfos = arrayList;
            }
            hl.c3(new fv0(this, (byte) 15));
        } catch (Exception e) {
            cc4.g(e, !"APP_PAUSED".equals(e.getMessage()));
            hl.c3(new lg((Object) this, z, (Object) e, (Object) runnable, (byte) 3));
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
            } catch (Exception e) {
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                cc4.g(e, true);
                return;
            }
        }
        camera.setErrorCallback(getErrorListener(cameraSession));
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        cameraSession.availableFlashModes.clear();
        if (supportedFlashModes != null) {
            for (int i = 0; i < supportedFlashModes.size(); i++) {
                String str = supportedFlashModes.get(i);
                if (str.equals("off") || str.equals("on") || str.equals(CallAudioDevice.NAME_AUTO)) {
                    cameraSession.availableFlashModes.add(str);
                }
            }
            if (TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) && cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
            } else {
                cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        cameraSession.configurePhotoCamera();
        camera.setPreviewTexture(surfaceTexture);
        camera.startPreview();
        if (runnable2 != null) {
            hl.c3(runnable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$openRound$9(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        Camera camera = cameraSession.cameraInfo.camera;
        try {
            if (f11.a) {
                cc4.b("start creating round camera session");
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
                for (int i = 0; i < supportedFlashModes.size(); i++) {
                    String str = supportedFlashModes.get(i);
                    if (str.equals("off") || str.equals("on") || str.equals(CallAudioDevice.NAME_AUTO)) {
                        cameraSession.availableFlashModes.add(str);
                    }
                }
                if (TextUtils.equals(cameraSession.getCurrentFlashMode(), parameters.getFlashMode()) && cameraSession.availableFlashModes.contains(cameraSession.getCurrentFlashMode())) {
                    cameraSession.checkFlashMode(cameraSession.getCurrentFlashMode());
                } else {
                    cameraSession.checkFlashMode(cameraSession.availableFlashModes.get(0));
                }
            }
            cameraSession.configureRoundCamera(true);
            if (runnable != null) {
                runnable.run();
            }
            camera.setPreviewTexture(surfaceTexture);
            camera.startPreview();
            if (runnable2 != null) {
                hl.c3(runnable2);
            }
            if (f11.a) {
                cc4.b("round camera session created");
            }
        } catch (Exception e) {
            cameraSession.cameraInfo.camera = null;
            if (camera != null) {
                camera.release();
            }
            cc4.g(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordVideo$12(ICameraView iCameraView, File file, boolean z, Runnable runnable) {
        iCameraView.startRecording(file, new xac((byte) 7, this, z));
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$recordVideo$13(Object obj, ICameraView iCameraView, File file, boolean z, Runnable runnable) {
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
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
            }
            hl.c3(new va7((Object) this, (Object) iCameraView, (Object) file, z, (Object) runnable, (byte) 5));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$recordVideo$14(Camera camera, CameraSession cameraSession, boolean z, File file, CameraInfo cameraInfo, VideoTakeCallback videoTakeCallback, Runnable runnable) {
        if (camera != null) {
            try {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode(cameraSession.getCurrentFlashMode().equals("on") ? "torch" : "off");
                    camera.setParameters(parameters);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                camera.unlock();
                try {
                    this.mirrorRecorderVideo = z;
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
                        hl.c3(runnable);
                    }
                } catch (Exception e2) {
                    this.recorder.release();
                    this.recorder = null;
                    cc4.g(e2, true);
                }
            } catch (Exception e3) {
                cc4.g(e3, true);
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
            } catch (Exception e) {
                e = e;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e2) {
                e = e2;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                cc4.g(e, true);
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
            } catch (Exception e) {
                e = e;
            }
            try {
                open.setErrorCallback(getErrorListener(cameraSession));
                camera = open;
            } catch (Exception e2) {
                e = e2;
                camera = open;
                cameraSession.cameraInfo.camera = null;
                if (camera != null) {
                    camera.release();
                }
                cc4.g(e, true);
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
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$stopVideoRecording$17(Object obj, boolean z, boolean z2) {
        try {
            MediaRecorder mediaRecorder = this.recorder;
            if (mediaRecorder != null) {
                this.recorder = null;
                try {
                    mediaRecorder.stop();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                try {
                    mediaRecorder.release();
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                Camera camera = cameraSession.cameraInfo.camera;
                if (camera != null) {
                    try {
                        camera.reconnect();
                        camera.startPreview();
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                    }
                    try {
                        cameraSession.stopVideoRecording();
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                    }
                }
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setFlashMode("off");
                    camera.setParameters(parameters);
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
                this.threadPool.execute(new z21(camera, cameraSession, (byte) 8));
            }
            if (z || this.onVideoTakeCallback == null) {
                this.onVideoTakeCallback = null;
            } else {
                lambda$recordVideo$11(z2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3 A[Catch: Exception -> 0x00e0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e0, blocks: (B:8:0x0055, B:32:0x00b9, B:35:0x00bc, B:37:0x00d3), top: B:7:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void lambda$takePicture$6(File file, CameraInfo cameraInfo, boolean z, boolean z2, pcc pccVar, byte[] bArr, Camera camera) {
        Bitmap bitmap;
        Exception exc;
        int i;
        Throwable th;
        int i2 = 0;
        int Y0 = (int) (hl.Y0(false) / hl.p);
        Locale locale = Locale.US;
        String str = Utilities.a(file.getAbsolutePath()) + "@" + Y0 + "_" + Y0;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (Throwable th2) {
            cc4.g(th2, true);
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        try {
            i = getOrientation(bArr);
            try {
                if (cameraInfo.frontCamera != 0 && z) {
                    try {
                        Matrix matrix = new Matrix();
                        if (!z2 && i != -1) {
                            matrix.setRotate(i);
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
                            in5.z().K(new BitmapDrawable(createBitmap), str, false);
                            if (pccVar != null) {
                                pccVar.a(0);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            i = 0;
                            cc4.g(th, true);
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.flush();
                            fileOutputStream2.getFD().sync();
                            fileOutputStream2.close();
                            if (bitmap2 != null) {
                            }
                            if (pccVar != null) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                FileOutputStream fileOutputStream22 = new FileOutputStream(file);
                fileOutputStream22.write(bArr);
                fileOutputStream22.flush();
                fileOutputStream22.getFD().sync();
                fileOutputStream22.close();
                if (bitmap2 != null) {
                    in5.z().K(new BitmapDrawable(bitmap2), str, false);
                }
            } catch (Exception e) {
                exc = e;
                i2 = i;
                cc4.g(exc, true);
                i = i2;
                if (pccVar != null) {
                }
            }
        } catch (Exception e2) {
            exc = e2;
        }
        if (pccVar != null) {
            pccVar.a(Integer.valueOf(i));
        }
    }

    private static int pack(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (i4 << 8) | (bArr[i] & 255);
            i += i3;
            i2 = i5;
        }
    }

    public void addOnErrorListener(ErrorCallback errorCallback) {
        ArrayList<ErrorCallback> arrayList = this.errorCallbacks;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.errorCallbacks = arrayList;
        }
        arrayList.remove(errorCallback);
        this.errorCallbacks.add(errorCallback);
    }

    public void cancelOnInitRunnable(Runnable runnable) {
        this.onFinishCameraInitRunnables.remove(runnable);
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable, Runnable runnable2) {
        cameraSession.destroy();
        this.threadPool.execute(new o97(runnable, cameraSession, countDownLatch, runnable2, (byte) 21));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public ArrayList<CameraInfo> getCameras() {
        return this.cameraInfos;
    }

    public Camera.ErrorCallback getErrorListener(final CameraSession cameraSession) {
        return new Camera.ErrorCallback() { // from class: z91
            @Override // android.hardware.Camera.ErrorCallback
            public final void onError(int i, Camera camera) {
                CameraController.this.lambda$getErrorListener$18(cameraSession, i, camera);
            }
        };
    }

    public boolean isCameraInitied() {
        return (!this.cameraInitied || this.cameraInfos == null || this.cameraInfos.isEmpty()) ? false : true;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801 || i == 1) {
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
        this.threadPool.execute(new la7((Object) this, (Object) cameraSession, (Object) runnable2, (Object) surfaceTexture, (Object) runnable, (byte) 12));
    }

    public void openRound(CameraSession cameraSession, SurfaceTexture surfaceTexture, Runnable runnable, Runnable runnable2) {
        if (cameraSession != null && surfaceTexture != null) {
            this.threadPool.execute(new o97(cameraSession, runnable2, surfaceTexture, runnable, (byte) 20));
            return;
        }
        if (f11.a) {
            cc4.b("failed to open round " + cameraSession + " tex = " + surfaceTexture);
        }
    }

    public void recordVideo(Object obj, File file, boolean z, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView, boolean z2) {
        if (obj != null) {
            if (iCameraView != null) {
                this.recordingCurrentCameraView = iCameraView;
                this.onVideoTakeCallback = videoTakeCallback;
                this.recordedFile = file.getAbsolutePath();
                this.threadPool.execute(new y6a((Object) this, obj, (Object) iCameraView, (Object) file, z2, (Object) runnable, (byte) 1));
                return;
            }
            if (obj instanceof CameraSession) {
                CameraSession cameraSession = (CameraSession) obj;
                CameraInfo cameraInfo = cameraSession.cameraInfo;
                this.threadPool.execute(new oq6(this, cameraInfo.camera, cameraSession, z, file, cameraInfo, videoTakeCallback, runnable));
            }
        }
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
        this.threadPool.execute(new aa1(this, (CameraSession) obj, (byte) 1));
    }

    public void stopPreview(Object obj) {
        if (obj == null || !(obj instanceof CameraSession)) {
            return;
        }
        this.threadPool.execute(new aa1(this, (CameraSession) obj, (byte) 0));
    }

    public void stopVideoRecording(Object obj, boolean z, boolean z2) {
        ICameraView iCameraView = this.recordingCurrentCameraView;
        if (iCameraView == null) {
            this.threadPool.execute(new ba1((Object) this, obj, z, z2, (byte) 0));
        } else {
            iCameraView.stopRecording();
            this.recordingCurrentCameraView = null;
        }
    }

    public boolean takePicture(final File file, final boolean z, Object obj, final pcc pccVar) {
        if (obj != null && (obj instanceof CameraSession)) {
            CameraSession cameraSession = (CameraSession) obj;
            final CameraInfo cameraInfo = cameraSession.cameraInfo;
            final boolean isFlipFront = cameraSession.isFlipFront();
            try {
                cameraInfo.camera.takePicture(null, null, new Camera.PictureCallback() { // from class: y91
                    @Override // android.hardware.Camera.PictureCallback
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        CameraController.lambda$takePicture$6(file, cameraInfo, isFlipFront, z, pccVar, bArr, camera);
                    }
                });
                return true;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return false;
    }

    public void stopVideoRecording(Object obj, boolean z) {
        stopVideoRecording(obj, z, true);
    }

    public void close(CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable) {
        close(cameraSession, countDownLatch, runnable, null);
    }

    public void initCamera(Runnable runnable) {
        initCamera(runnable, false);
    }

    public void recordVideo(Object obj, File file, boolean z, VideoTakeCallback videoTakeCallback, Runnable runnable, ICameraView iCameraView) {
        recordVideo(obj, file, z, videoTakeCallback, runnable, iCameraView, true);
    }
}
