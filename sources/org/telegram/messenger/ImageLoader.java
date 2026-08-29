package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$-CC;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.secretmedia.EncryptedFileInputStream;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ImageLoader {
    public static final String AUTOPLAY_FILTER = "g";
    public static final String AUTOPLAY_FILTER_NONLOOP = "gl";
    public static final int CACHE_TYPE_CACHE = 1;
    public static final int CACHE_TYPE_ENCRYPTED = 2;
    public static final int CACHE_TYPE_NONE = 0;
    private static final boolean DEBUG_MODE = false;
    private pe.c cacheOutQueue;
    private DispatchQueue cacheThumbOutQueue;
    private boolean canForce8888;
    private int currentArtworkTasksCount;
    private int currentHttpFileLoadTasksCount;
    private int currentHttpTasksCount;
    private ConcurrentHashMap<String, long[]> fileProgresses;
    private HashMap<String, Integer> forceLoadingImages;
    private LinkedList<HttpFileTask> httpFileLoadTasks;
    private HashMap<String, HttpFileTask> httpFileLoadTasksByKeys;
    private String ignoreRemoval;
    private DispatchQueue imageLoadQueue;
    private volatile long lastCacheOutTime;
    private int lastImageNum;
    private LruCache<BitmapDrawable> lottieMemCache;
    private LruCache<BitmapDrawable> memCache;
    private HashMap<String, String> replacedBitmaps;
    private HashMap<String, Runnable> retryHttpsTasks;
    private LruCache<BitmapDrawable> smallImagesMemCache;
    private File telegramPath;
    private ConcurrentHashMap<String, WebFile> testWebFile;
    private HashMap<String, ThumbGenerateTask> thumbGenerateTasks;
    private DispatchQueue thumbGeneratingQueue;
    private LruCache<BitmapDrawable> wallpaperMemCache;
    private static ThreadLocal<byte[]> bytesLocal = new ThreadLocal<>();
    private static ThreadLocal<byte[]> bytesThumbLocal = new ThreadLocal<>();
    private static byte[] header = new byte[12];
    private static byte[] headerThumb = new byte[12];
    private static volatile ImageLoader Instance = null;
    private HashMap<String, Integer> bitmapUseCounts = new HashMap<>();
    ArrayList<org.telegram.ui.Components.c6> cachedAnimatedFileDrawables = new ArrayList<>();
    private HashMap<String, CacheImage> imageLoadingByUrl = new HashMap<>();
    private HashMap<String, CacheImage> imageLoadingByUrlPframe = new HashMap<>();
    public ConcurrentHashMap<String, CacheImage> imageLoadingByKeys = new ConcurrentHashMap<>();
    public HashSet<String> imageLoadingKeys = new HashSet<>();
    private SparseArray<CacheImage> imageLoadingByTag = new SparseArray<>();
    private HashMap<String, ThumbGenerateInfo> waitingForQualityThumb = new HashMap<>();
    private SparseArray<String> waitingForQualityThumbByTag = new SparseArray<>();
    private LinkedList<HttpImageTask> httpTasks = new LinkedList<>();
    private LinkedList<ArtworkLoadTask> artworkTasks = new LinkedList<>();

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class 5 implements FileLoader.FileLoaderDelegate {
        final /* synthetic */ int val$currentAccount;

        public 5(int i10) {
            this.val$currentAccount = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidFailedLoad$6(String str, int i10, int i11) {
            ImageLoader.this.fileDidFailedLoad(str, i10);
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, str, Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileDidFailedUpload$3(int i10, String str, boolean z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadFailed, str, Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidFailedUpload$4(int i10, String str, boolean z10) {
            AndroidUtilities.runOnUIThread(new t4(i10, str, z10));
            ImageLoader.this.fileProgresses.remove(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidLoaded$5(File file, String str, int i10, Object obj, int i11) {
            FilePathDatabase.FileMeta fileMetadataFromParent;
            if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (fileMetadataFromParent = FileLoader.getFileMetadataFromParent(i10, obj)) != null)) {
                MessageObject messageObject = obj instanceof MessageObject ? (MessageObject) obj : null;
                long j10 = fileMetadataFromParent.dialogId;
                if (SaveToGallerySettingsHelper.needSave(j10 >= 0 ? 1 : ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? 4 : 2, fileMetadataFromParent, messageObject, i10)) {
                    AndroidUtilities.addMediaToGallery(file.toString());
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, str, file);
            ImageLoader.this.fileDidLoaded(str, file, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileDidUploaded$1(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploaded, str, inputFile, inputEncryptedFile, bArr, bArr2, Long.valueOf(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidUploaded$2(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
            AndroidUtilities.runOnUIThread(new z4(i10, str, inputFile, inputEncryptedFile, bArr, bArr2, j10));
            ImageLoader.this.fileProgresses.remove(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [pe.b] */
        public void lambda$fileLoadProgressChanged$7(String str, FileLoadOperation fileLoadOperation) {
            CacheImage cacheImage = (CacheImage) ImageLoader.this.imageLoadingByUrlPframe.remove(str);
            if (cacheImage == null) {
                return;
            }
            ImageLoader.this.imageLoadingByUrl.remove(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cacheImage.imageReceiverArray.size(); i10++) {
                String str2 = cacheImage.keys.get(i10);
                String str3 = cacheImage.filters.get(i10);
                int intValue = cacheImage.types.get(i10).intValue();
                ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i10);
                int intValue2 = cacheImage.imageReceiverGuidsArray.get(i10).intValue();
                CacheImage cacheImage2 = ImageLoader.this.imageLoadingByKeys.get(str2);
                if (cacheImage2 == null) {
                    cacheImage2 = new CacheImage();
                    cacheImage2.priority = cacheImage.priority;
                    cacheImage2.secureDocument = cacheImage.secureDocument;
                    cacheImage2.currentAccount = cacheImage.currentAccount;
                    cacheImage2.finalFilePath = fileLoadOperation.getCurrentFile();
                    cacheImage2.parentObject = cacheImage.parentObject;
                    cacheImage2.isPFrame = cacheImage.isPFrame;
                    cacheImage2.key = str2;
                    cacheImage2.imageLocation = cacheImage.imageLocation;
                    cacheImage2.type = intValue;
                    cacheImage2.ext = cacheImage.ext;
                    cacheImage2.encryptionKeyPath = cacheImage.encryptionKeyPath;
                    cacheImage2.cacheTask = ImageLoader.this.new CacheOutTask(cacheImage2);
                    cacheImage2.filter = str3;
                    cacheImage2.imageType = cacheImage.imageType;
                    cacheImage2.cacheType = cacheImage.cacheType;
                    ImageLoader.this.imageLoadingByKeys.put(str2, cacheImage2);
                    ImageLoader.this.imageLoadingKeys.add(ImageLoader.cutFilter(str2));
                    arrayList.add(cacheImage2.cacheTask);
                }
                cacheImage2.addImageReceiver(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i11);
                if (cacheOutTask.cacheImage.type == 1) {
                    ImageLoader.this.cacheThumbOutQueue.postRunnable(cacheOutTask);
                } else {
                    pe.c cVar = ImageLoader.this.cacheOutQueue;
                    int i12 = cacheOutTask.cacheImage.priority;
                    if (i12 != 1) {
                        cVar.getClass();
                        cacheOutTask = new pe.b(i12, cacheOutTask);
                    }
                    cVar.a.execute(cacheOutTask);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileLoadProgressChanged$8(int i10, String str, long j10, long j11) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, str, Long.valueOf(j10), Long.valueOf(j11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileUploadProgressChanged$0(int i10, String str, long j10, long j11, boolean z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z10));
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidFailedLoad(String str, int i10) {
            ImageLoader.this.fileProgresses.remove(str);
            AndroidUtilities.runOnUIThread(new y4(this, str, i10, this.val$currentAccount, 0));
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidFailedUpload(String str, boolean z10) {
            Utilities.stageQueue.postRunnable(new v4(this, this.val$currentAccount, str, z10));
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidLoaded(final String str, final File file, final Object obj, final int i10) {
            ImageLoader.this.fileProgresses.remove(str);
            final int i11 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.u4
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.this.lambda$fileDidLoaded$5(file, str, i11, obj, i10);
                }
            });
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidUploaded(final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j10) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i10 = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.a5
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.this.lambda$fileDidUploaded$2(i10, str, inputFile, inputEncryptedFile, bArr, bArr2, j10);
                }
            });
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j10, long j11) {
            int i10 = 1;
            ImageLoader.this.fileProgresses.put(str, new long[]{j10, j11});
            if (!ImageLoader.this.imageLoadingByUrlPframe.isEmpty() && fileLoadOperation.checkPrefixPreloadFinished()) {
                ImageLoader.this.imageLoadQueue.postRunnable(new f0(this, str, fileLoadOperation, i10));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = fileLoadOperation.lastProgressUpdateTime;
            if (j12 == 0 || j12 < elapsedRealtime - 500 || j10 == 0) {
                fileLoadOperation.lastProgressUpdateTime = elapsedRealtime;
                AndroidUtilities.runOnUIThread(new x4(this.val$currentAccount, str, j10, j11));
            }
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, final String str, final long j10, final long j11, final boolean z10) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j10, j11});
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = fileUploadOperation.lastProgressUpdateTime;
            if (j12 == 0 || j12 < elapsedRealtime - 100 || j10 == j11) {
                fileUploadOperation.lastProgressUpdateTime = elapsedRealtime;
                final int i10 = this.val$currentAccount;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.w4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageLoader.5.lambda$fileUploadProgressChanged$0(i10, str, j10, j11, z10);
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class 6 extends BroadcastReceiver {
        public 6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0() {
            ImageLoader.this.checkMediaPaths();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("file system changed");
            }
            d1 d1Var = new d1(this, 3);
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AndroidUtilities.runOnUIThread(d1Var, 1000L);
            } else {
                d1Var.run();
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static /* synthetic */ class 7 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            Bitmap.CompressFormat compressFormat;
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$android$graphics$Bitmap$CompressFormat;
                compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
                iArr2[compressFormat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP_LOSSLESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class ArtworkLoadTask extends AsyncTask<Void, Void, String> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private HttpURLConnection httpConnection;
        private boolean small;

        public ArtworkLoadTask(CacheImage cacheImage) {
            this.cacheImage = cacheImage;
            this.small = Uri.parse(cacheImage.imageLocation.path).getQueryParameter("s") != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCancelled$2() {
            ImageLoader.this.runArtworkTasks(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$0(String str) {
            CacheImage cacheImage = this.cacheImage;
            cacheImage.httpTask = ImageLoader.this.new HttpImageTask(cacheImage, 0, str);
            ImageLoader.this.httpTasks.add(this.cacheImage.httpTask);
            ImageLoader.this.runHttpTasks(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$1() {
            ImageLoader.this.runArtworkTasks(true);
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new b5(this, 0));
        }

        /* JADX WARN: Finally extract failed */
        @Override // android.os.AsyncTask
        public String doInBackground(Void... voidArr) {
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream2;
            ByteArrayOutputStream byteArrayOutputStream2;
            JSONArray jSONArray;
            int read;
            int responseCode;
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.cacheImage.imageLocation.path.replace("athumb://", "https://")).openConnection();
                    this.httpConnection = httpURLConnection;
                    httpURLConnection.setConnectTimeout(5000);
                    this.httpConnection.setReadTimeout(5000);
                    this.httpConnection.connect();
                    try {
                        HttpURLConnection httpURLConnection2 = this.httpConnection;
                        if (httpURLConnection2 != null && (responseCode = httpURLConnection2.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                            this.canRetry = false;
                        }
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    inputStream2 = this.httpConnection.getInputStream();
                    try {
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                    } catch (Throwable th2) {
                        inputStream = inputStream2;
                        th = th2;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[32768];
                    while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    this.canRetry = false;
                    jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("results");
                } catch (Throwable th4) {
                    inputStream = inputStream2;
                    th = th4;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        if (th instanceof SocketTimeoutException) {
                            if (ApplicationLoader.isNetworkOnline()) {
                                this.canRetry = false;
                            }
                        } else if (th instanceof UnknownHostException) {
                            this.canRetry = false;
                        } else if (th instanceof SocketException) {
                            if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                                this.canRetry = false;
                            }
                        } else if (th instanceof FileNotFoundException) {
                            this.canRetry = false;
                        }
                        FileLog.e(th, false);
                        try {
                            HttpURLConnection httpURLConnection3 = this.httpConnection;
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                        } catch (Throwable unused) {
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                FileLog.e(th5);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return null;
                    } catch (Throwable th6) {
                        try {
                            HttpURLConnection httpURLConnection4 = this.httpConnection;
                            if (httpURLConnection4 != null) {
                                httpURLConnection4.disconnect();
                            }
                        } catch (Throwable unused2) {
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th7) {
                                FileLog.e(th7);
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th6;
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th6;
                        } catch (Exception unused3) {
                            throw th6;
                        }
                    }
                }
            } catch (Exception unused4) {
            }
            if (jSONArray.length() <= 0) {
                try {
                    HttpURLConnection httpURLConnection5 = this.httpConnection;
                    if (httpURLConnection5 != null) {
                        httpURLConnection5.disconnect();
                    }
                } catch (Throwable unused5) {
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable th8) {
                        FileLog.e(th8);
                    }
                }
                byteArrayOutputStream2.close();
                return null;
            }
            String string = jSONArray.getJSONObject(0).getString("artworkUrl100");
            if (this.small) {
                try {
                    HttpURLConnection httpURLConnection6 = this.httpConnection;
                    if (httpURLConnection6 != null) {
                        httpURLConnection6.disconnect();
                    }
                } catch (Throwable unused6) {
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable th9) {
                        FileLog.e(th9);
                    }
                }
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception unused7) {
                }
                return string;
            }
            String replace = string.replace("100x100", "600x600");
            try {
                HttpURLConnection httpURLConnection7 = this.httpConnection;
                if (httpURLConnection7 != null) {
                    httpURLConnection7.disconnect();
                }
            } catch (Throwable unused8) {
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th10) {
                    FileLog.e(th10);
                }
            }
            try {
                byteArrayOutputStream2.close();
            } catch (Exception unused9) {
            }
            return replace;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            if (str != null) {
                ImageLoader.this.imageLoadQueue.postRunnable(new d3(2, this, str));
            } else if (this.canRetry) {
                ImageLoader.this.artworkLoadError(this.cacheImage.url);
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new b5(this, 1));
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class CacheImage {
        protected ArtworkLoadTask artworkTask;
        protected CacheOutTask cacheTask;
        protected int cacheType;
        protected int currentAccount;
        protected File encryptionKeyPath;
        protected String ext;
        protected String filter;
        protected ArrayList<String> filters;
        protected File finalFilePath;
        protected HttpImageTask httpTask;
        protected ImageLocation imageLocation;
        protected ArrayList<ImageReceiver> imageReceiverArray;
        protected ArrayList<Integer> imageReceiverGuidsArray;
        protected int imageType;
        public boolean isPFrame;
        protected String key;
        protected ArrayList<String> keys;
        protected Object parentObject;
        public int priority;
        public Runnable runningTask;
        protected SecureDocument secureDocument;
        protected long size;
        protected File tempFilePath;
        protected int type;
        protected ArrayList<Integer> types;
        protected String url;

        private CacheImage() {
            this.priority = 1;
            this.imageReceiverArray = new ArrayList<>();
            this.imageReceiverGuidsArray = new ArrayList<>();
            this.keys = new ArrayList<>();
            this.filters = new ArrayList<>();
            this.types = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void lambda$setImageAndClear$0(Drawable drawable, ArrayList arrayList, ArrayList arrayList2, String str) {
            boolean z10;
            char c3;
            char c6;
            org.telegram.ui.Components.c6 c6Var;
            Drawable drawable2 = drawable;
            if (drawable2 instanceof org.telegram.ui.Components.c6) {
                org.telegram.ui.Components.c6 c6Var2 = (org.telegram.ui.Components.c6) drawable2;
                if (!c6Var2.j0) {
                    boolean z11 = false;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
                        if (i10 == 0) {
                            c6Var = c6Var2;
                            z10 = z11;
                        } else {
                            AnimatedFileDrawableStream animatedFileDrawableStream = c6Var2.q0;
                            if (animatedFileDrawableStream != null) {
                                File file = c6Var2.C;
                                long j10 = c6Var2.D;
                                int i11 = c6Var2.E;
                                TLRPC.Document document = animatedFileDrawableStream.getDocument();
                                ImageLocation location = c6Var2.q0.getLocation();
                                Object parentObject = c6Var2.q0.getParentObject();
                                z10 = z11;
                                long j11 = c6Var2.I;
                                c3 = 1;
                                int i12 = c6Var2.F;
                                c6 = 0;
                                AnimatedFileDrawableStream animatedFileDrawableStream2 = c6Var2.q0;
                                c6Var = new org.telegram.ui.Components.c6(file, false, j10, i11, document, location, parentObject, j11, i12, animatedFileDrawableStream2 != null && animatedFileDrawableStream2.isPreview());
                            } else {
                                z10 = z11;
                                c3 = 1;
                                c6 = 0;
                                c6Var = new org.telegram.ui.Components.c6(c6Var2.C, false, c6Var2.D, c6Var2.E, c6Var2.k0, null, null, c6Var2.I, c6Var2.F, false);
                            }
                            int[] iArr = c6Var.d;
                            int[] iArr2 = c6Var2.d;
                            iArr[c6] = iArr2[c6];
                            iArr[c3] = iArr2[c3];
                        }
                        if (imageReceiver.setImageBitmapByKey(c6Var, this.key, this.type, false, ((Integer) arrayList2.get(i10)).intValue())) {
                            if (c6Var == c6Var2) {
                                z11 = true;
                            }
                        } else if (c6Var != c6Var2) {
                            c6Var.u();
                        }
                        z11 = z10;
                    }
                    if (!z11) {
                        c6Var2.u();
                    }
                    if (str == null) {
                        ImageLoader.this.decrementUseCount(str);
                        return;
                    }
                    return;
                }
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                ((ImageReceiver) arrayList.get(i13)).setImageBitmapByKey(drawable2, this.key, this.types.get(i13).intValue(), false, ((Integer) arrayList2.get(i13)).intValue());
                i13++;
                drawable2 = drawable;
            }
            if (str == null) {
            }
        }

        public void addImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i10, int i11) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf >= 0 && Objects.equals(this.imageReceiverArray.get(indexOf).getImageKey(), str)) {
                this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i11));
                return;
            }
            this.imageReceiverArray.add(imageReceiver);
            this.imageReceiverGuidsArray.add(Integer.valueOf(i11));
            this.keys.add(str);
            this.filters.add(str2);
            this.types.add(Integer.valueOf(i10));
            ImageLoader.this.imageLoadingByTag.put(imageReceiver.getTag(i10), this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [org.telegram.messenger.FileLoader] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [org.telegram.messenger.SecureDocument] */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r7v5, types: [org.telegram.messenger.WebFile] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v2 */
        public void changePriority(int i10) {
            TLRPC.Document document;
            ?? r6;
            TLObject tLObject;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2;
            ?? r9;
            ?? r72;
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation != null) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
                if (tL_fileLocationToBeDeprecated3 != null) {
                    r9 = this.ext;
                    tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated3;
                    document = null;
                    r6 = null;
                    r72 = 0;
                } else {
                    TLRPC.Document document2 = imageLocation.document;
                    if (document2 != null) {
                        document = document2;
                        r6 = null;
                    } else {
                        SecureDocument secureDocument = imageLocation.secureDocument;
                        if (secureDocument != null) {
                            r6 = secureDocument;
                            document = null;
                            tL_fileLocationToBeDeprecated2 = null;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                            tLObject = tL_fileLocationToBeDeprecated2;
                            r9 = tL_fileLocationToBeDeprecated;
                            r72 = tLObject;
                        } else {
                            TLObject tLObject2 = imageLocation.webFile;
                            if (tLObject2 != null) {
                                tLObject = tLObject2;
                                document = null;
                                r6 = null;
                                tL_fileLocationToBeDeprecated = null;
                                r9 = tL_fileLocationToBeDeprecated;
                                r72 = tLObject;
                            } else {
                                document = null;
                                r6 = null;
                            }
                        }
                    }
                    tL_fileLocationToBeDeprecated2 = r6;
                    tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                    tLObject = tL_fileLocationToBeDeprecated2;
                    r9 = tL_fileLocationToBeDeprecated;
                    r72 = tLObject;
                }
                FileLoader.getInstance(this.currentAccount).changePriority(i10, document, r6, r72, tL_fileLocationToBeDeprecated, r9, null);
            }
        }

        public void removeImageReceiver(ImageReceiver imageReceiver) {
            int i10 = this.type;
            int i11 = 0;
            while (i11 < this.imageReceiverArray.size()) {
                ImageReceiver imageReceiver2 = this.imageReceiverArray.get(i11);
                if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                    this.imageReceiverArray.remove(i11);
                    this.imageReceiverGuidsArray.remove(i11);
                    this.keys.remove(i11);
                    this.filters.remove(i11);
                    i10 = this.types.remove(i11).intValue();
                    if (imageReceiver2 != null) {
                        ImageLoader.this.imageLoadingByTag.remove(imageReceiver2.getTag(i10));
                    }
                    i11--;
                }
                i11++;
            }
            if (this.imageReceiverArray.isEmpty()) {
                if (this.imageLocation != null && !ImageLoader.this.forceLoadingImages.containsKey(this.key)) {
                    ImageLocation imageLocation = this.imageLocation;
                    if (imageLocation.location != null) {
                        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.imageLocation.location, this.ext);
                    } else if (imageLocation.document != null) {
                        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.imageLocation.document);
                    } else if (imageLocation.secureDocument != null) {
                        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.imageLocation.secureDocument);
                    } else if (imageLocation.webFile != null) {
                        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.imageLocation.webFile);
                    }
                }
                if (this.cacheTask != null) {
                    if (i10 == 1) {
                        ImageLoader.this.cacheThumbOutQueue.cancelRunnable(this.cacheTask);
                    } else {
                        pe.c cVar = ImageLoader.this.cacheOutQueue;
                        CacheOutTask cacheOutTask = this.cacheTask;
                        if (cacheOutTask == null) {
                            cVar.getClass();
                        } else {
                            cVar.a.remove(cacheOutTask);
                        }
                        pe.c cVar2 = ImageLoader.this.cacheOutQueue;
                        Runnable runnable = this.runningTask;
                        if (runnable == null) {
                            cVar2.getClass();
                        } else {
                            cVar2.a.remove(runnable);
                        }
                    }
                    this.cacheTask.cancel();
                    this.cacheTask = null;
                }
                if (this.httpTask != null) {
                    ImageLoader.this.httpTasks.remove(this.httpTask);
                    this.httpTask.cancel(true);
                    this.httpTask = null;
                }
                if (this.artworkTask != null) {
                    ImageLoader.this.artworkTasks.remove(this.artworkTask);
                    this.artworkTask.cancel(true);
                    this.artworkTask = null;
                }
                if (this.url != null) {
                    ImageLoader.this.imageLoadingByUrl.remove(this.url);
                }
                if (this.url != null) {
                    ImageLoader.this.imageLoadingByUrlPframe.remove(this.url);
                }
                String str = this.key;
                if (str != null) {
                    ImageLoader.this.imageLoadingByKeys.remove(str);
                    ImageLoader.this.imageLoadingKeys.remove(ImageLoader.cutFilter(this.key));
                }
            }
        }

        public void replaceImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i10, int i11) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf == -1) {
                return;
            }
            if (this.types.get(indexOf).intValue() != i10) {
                ArrayList<ImageReceiver> arrayList = this.imageReceiverArray;
                indexOf = arrayList.subList(indexOf + 1, arrayList.size()).indexOf(imageReceiver);
                if (indexOf == -1) {
                    return;
                }
            }
            this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i11));
            this.keys.set(indexOf, str);
            this.filters.set(indexOf, str2);
        }

        public void setImageAndClear(Drawable drawable, String str) {
            CacheImage cacheImage;
            if (drawable != null) {
                cacheImage = this;
                AndroidUtilities.runOnUIThread(new c5(cacheImage, drawable, new ArrayList(this.imageReceiverArray), new ArrayList(this.imageReceiverGuidsArray), str, 0));
            } else {
                cacheImage = this;
            }
            for (int i10 = 0; i10 < cacheImage.imageReceiverArray.size(); i10++) {
                ImageLoader.this.imageLoadingByTag.remove(cacheImage.imageReceiverArray.get(i10).getTag(cacheImage.type));
            }
            cacheImage.imageReceiverArray.clear();
            cacheImage.imageReceiverGuidsArray.clear();
            if (cacheImage.url != null) {
                ImageLoader.this.imageLoadingByUrl.remove(cacheImage.url);
            }
            if (cacheImage.url != null) {
                ImageLoader.this.imageLoadingByUrlPframe.remove(cacheImage.url);
            }
            String str2 = cacheImage.key;
            if (str2 != null) {
                ImageLoader.this.imageLoadingByKeys.remove(str2);
                ImageLoader.this.imageLoadingKeys.remove(ImageLoader.cutFilter(cacheImage.key));
            }
        }

        public void setImageReceiverGuid(ImageReceiver imageReceiver, int i10) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf == -1) {
                return;
            }
            this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i10));
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class CacheOutTask implements Runnable {
        private CacheImage cacheImage;
        private boolean isCancelled;
        private Thread runningThread;
        private final Object sync = new Object();

        public CacheOutTask(CacheImage cacheImage) {
            this.cacheImage = cacheImage;
        }

        private Bitmap applyWallpaperSetting(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
            int i10;
            if (!wallPaper.pattern || wallPaper.settings == null) {
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                return (wallPaperSettings == null || !wallPaperSettings.blur) ? bitmap : Utilities.blurWallpaper(bitmap);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
            boolean z10 = true;
            if (wallPaperSettings2.second_background_color == 0) {
                i10 = AndroidUtilities.getPatternColor(wallPaperSettings2.background_color);
                canvas.drawColor(i0.a.k(wallPaper.settings.background_color, 255));
            } else if (wallPaperSettings2.third_background_color == 0) {
                int k9 = i0.a.k(wallPaperSettings2.background_color, 255);
                int k10 = i0.a.k(wallPaper.settings.second_background_color, 255);
                int averageColor = AndroidUtilities.getAverageColor(k9, k10);
                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.s9.d(wallPaper.settings.rotation), new int[]{k9, k10});
                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                gradientDrawable.draw(canvas);
                i10 = averageColor;
            } else {
                int k11 = i0.a.k(wallPaperSettings2.background_color, 255);
                int k12 = i0.a.k(wallPaper.settings.second_background_color, 255);
                int k13 = i0.a.k(wallPaper.settings.third_background_color, 255);
                int i11 = wallPaper.settings.fourth_background_color;
                int k14 = i11 == 0 ? 0 : i0.a.k(i11, 255);
                int g10 = yb0.g(k11, k12, k13, k14);
                yb0 yb0Var = new yb0();
                yb0Var.n(k11, k12, k13, k14);
                yb0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                yb0Var.t(bitmap, wallPaper.settings.intensity);
                yb0Var.draw(canvas);
                i10 = g10;
                z10 = false;
            }
            if (z10) {
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((wallPaper.settings.intensity / 100.0f) * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            return createBitmap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$0(Drawable drawable, String str) {
            this.cacheImage.setImageAndClear(drawable, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$1(Drawable drawable) {
            Drawable drawable2;
            String str;
            BitmapDrawable bitmapDrawable;
            Drawable drawable3;
            boolean z10 = false;
            if (drawable instanceof xi0) {
                xi0 xi0Var = (xi0) drawable;
                Drawable drawable4 = (Drawable) ImageLoader.this.lottieMemCache.get(this.cacheImage.key);
                if (drawable4 == null) {
                    ImageLoader.this.lottieMemCache.put(this.cacheImage.key, xi0Var);
                    drawable3 = xi0Var;
                } else {
                    xi0Var.A(false);
                    drawable3 = drawable4;
                }
                ImageLoader.this.incrementUseCount(this.cacheImage.key);
                str = this.cacheImage.key;
                drawable2 = drawable3;
            } else if (drawable instanceof org.telegram.ui.Components.c6) {
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
                if (c6Var.j0) {
                    BitmapDrawable fromLottieCache = ImageLoader.this.getFromLottieCache(this.cacheImage.key);
                    if (fromLottieCache == null) {
                        ImageLoader.this.lottieMemCache.put(this.cacheImage.key, c6Var);
                        bitmapDrawable = c6Var;
                    } else {
                        c6Var.u();
                        bitmapDrawable = fromLottieCache;
                    }
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                    drawable2 = bitmapDrawable;
                }
                str = null;
                drawable2 = drawable;
            } else if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable;
                BitmapDrawable fromMemCache = ImageLoader.this.getFromMemCache(this.cacheImage.key);
                boolean z11 = true;
                if (fromMemCache == null) {
                    if (this.cacheImage.key.endsWith("_f")) {
                        ImageLoader.this.wallpaperMemCache.put(this.cacheImage.key, bitmapDrawable2);
                    } else {
                        if (!this.cacheImage.key.endsWith("_isc") && !this.cacheImage.key.endsWith("_nocache") && bitmapDrawable2.getBitmap().getWidth() <= AndroidUtilities.density * 80.0f && bitmapDrawable2.getBitmap().getHeight() <= AndroidUtilities.density * 80.0f) {
                            ImageLoader.this.smallImagesMemCache.put(this.cacheImage.key, bitmapDrawable2);
                        } else if (!this.cacheImage.key.endsWith("_nocache")) {
                            ImageLoader.this.memCache.put(this.cacheImage.key, bitmapDrawable2);
                        }
                        z10 = true;
                    }
                    z11 = z10;
                    drawable = bitmapDrawable2;
                } else {
                    AndroidUtilities.recycleBitmap(bitmapDrawable2.getBitmap());
                    drawable = fromMemCache;
                }
                if (z11) {
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                    drawable2 = drawable;
                }
                str = null;
                drawable2 = drawable;
            } else {
                drawable2 = null;
                str = null;
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new f0(this, drawable2, str, 2), this.cacheImage.priority);
        }

        private void loadLastFrame(xi0 xi0Var, int i10, int i11, boolean z10, boolean z11) {
            Bitmap createBitmap;
            Canvas canvas;
            Drawable bitmapDrawable;
            if (z10 && z11) {
                float f9 = i10 * 1.2f;
                float f10 = i11 * 1.2f;
                createBitmap = Bitmap.createBitmap((int) f9, (int) f10, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
                canvas.scale(2.0f, 2.0f, f9 / 2.0f, f10 / 2.0f);
            } else {
                createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
            }
            xi0Var.b();
            Bitmap createBitmap2 = Bitmap.createBitmap(xi0Var.b, xi0Var.c, Bitmap.Config.ARGB_8888);
            xi0Var.A0 = z10 ? xi0Var.e[0] - 1 : 0;
            xi0Var.a(createBitmap2);
            xi0Var.c();
            canvas.save();
            if (!z10 || !z11) {
                canvas.scale(createBitmap2.getWidth() / i10, createBitmap2.getHeight() / i11, i10 / 2.0f, i11 / 2.0f);
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            if (z10 && z11) {
                canvas.drawBitmap(createBitmap2, (createBitmap.getWidth() - createBitmap2.getWidth()) / 2.0f, (createBitmap.getHeight() - createBitmap2.getHeight()) / 2.0f, paint);
                bitmapDrawable = new ImageReceiver.ReactionLastFrame(createBitmap);
            } else {
                canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            xi0Var.A(false);
            createBitmap2.recycle();
            onPostExecute(bitmapDrawable);
        }

        private void onPostExecute(Drawable drawable) {
            AndroidUtilities.runOnUIThread(new d3(3, this, drawable));
        }

        public void cancel() {
            synchronized (this.sync) {
                try {
                    this.isCancelled = true;
                    Thread thread = this.runningThread;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:897|(2:899|(12:901|902|903|(1:905)(1:927)|906|907|908|909|(2:915|(1:917))|(1:919)(1:922)|920|921))|930|902|903|(0)(0)|906|907|908|909|(4:911|913|915|(0))|(0)(0)|920|921) */
        /* JADX WARN: Can't wrap try/catch for region: R(18:72|(6:73|74|75|76|(1:78)(1:124)|79)|(3:81|82|(9:84|85|86|(1:118)|(3:103|(1:117)(4:106|(1:110)|111|(1:115))|116)(1:92)|93|(1:102)(1:97)|(1:99)(1:101)|100))|123|85|86|(0)|118|(0)|103|(0)|117|116|93|(1:95)|102|(0)(0)|100) */
        /* JADX WARN: Can't wrap try/catch for region: R(23:344|(1:896)(1:351)|352|(2:354|(1:894)(1:358))(1:895)|359|(20:361|(3:363|(1:365)(1:882)|366)(2:883|(17:885|(1:887)(1:889)|888|368|369|370|371|(15:373|374|375|(5:377|378|379|380|381)(1:843)|382|383|(1:385)(2:825|(1:827)(2:828|(1:830)(2:831|(1:833)(1:834))))|386|387|388|389|(1:391)(2:816|(1:818))|392|(1:815)(9:396|397|(2:780|(11:782|(1:802)(1:786)|(1:788)|789|790|791|(4:796|797|798|(1:800))|801|797|798|(0))(4:803|(1:805)(1:808)|806|807))(2:(3:401|402|403)(1:779)|404)|405|(1:777)(1:409)|410|(1:412)|413|(1:776)(3:419|(2:420|(1:423)(1:422))|424))|425)(3:848|(11:850|851|852|(1:854)(1:875)|855|857|858|(1:860)|861|(3:863|(2:864|(1:867)(1:866))|868)(1:872)|869)(1:878)|870)|426|427|428|(3:683|684|881)(4:430|431|432|a20)|468|(3:471|(1:473)(1:475)|474)|(2:481|(1:483))|484|(3:(1:499)(1:502)|500|501)(3:(1:491)(1:494)|492|493))(2:890|(1:892)))|367|368|369|370|371|(0)(0)|426|427|428|(0)(0)|468|(3:471|(0)(0)|474)|(4:477|479|481|(0))|484|(1:486)|(0)(0)|500|501)|893|369|370|371|(0)(0)|426|427|428|(0)(0)|468|(0)|(0)|484|(0)|(0)(0)|500|501) */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0221, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:880:0x085b, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:881:0x085c, code lost:
        
            r21 = r6;
            r22 = r7;
            r23 = r11;
            r32 = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:924:0x0d8b, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:925:0x0d8f, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
            r0 = r3;
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:928:0x0d8d, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:929:0x0d8e, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0251 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:146:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0319  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x034e  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x04cb  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x04d5  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x04de  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x04ed  */
        /* JADX WARN: Removed duplicated region for block: B:266:0x0539  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x053f  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x055b  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x04f0  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x04e1  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x04d7  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x04cd  */
        /* JADX WARN: Removed duplicated region for block: B:333:0x037e  */
        /* JADX WARN: Removed duplicated region for block: B:335:0x0384  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x0617  */
        /* JADX WARN: Removed duplicated region for block: B:430:0x0a11  */
        /* JADX WARN: Removed duplicated region for block: B:454:0x0a57 A[Catch: all -> 0x0a43, TryCatch #19 {all -> 0x0a43, blocks: (B:432:0x0a15, B:433:0x0a20, B:442:0x0a2e, B:445:0x0a36, B:448:0x0a3d, B:450:0x0a4f, B:454:0x0a57, B:456:0x0a61, B:461:0x0a7f, B:503:0x0a8b, B:504:0x0a9b, B:508:0x0ab0, B:512:0x0ad1, B:514:0x0ad5, B:672:0x0ab8, B:677:0x0a4a, B:681:0x0caf, B:435:0x0a21, B:437:0x0a25, B:440:0x0a2b), top: B:431:0x0a15, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:470:0x0cc3 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:473:0x0cce  */
        /* JADX WARN: Removed duplicated region for block: B:475:0x0cd0  */
        /* JADX WARN: Removed duplicated region for block: B:477:0x0ce5  */
        /* JADX WARN: Removed duplicated region for block: B:483:0x0d04  */
        /* JADX WARN: Removed duplicated region for block: B:486:0x0d0e  */
        /* JADX WARN: Removed duplicated region for block: B:499:0x0d31  */
        /* JADX WARN: Removed duplicated region for block: B:502:0x0d38  */
        /* JADX WARN: Removed duplicated region for block: B:504:0x0a9b A[Catch: all -> 0x0a43, TryCatch #19 {all -> 0x0a43, blocks: (B:432:0x0a15, B:433:0x0a20, B:442:0x0a2e, B:445:0x0a36, B:448:0x0a3d, B:450:0x0a4f, B:454:0x0a57, B:456:0x0a61, B:461:0x0a7f, B:503:0x0a8b, B:504:0x0a9b, B:508:0x0ab0, B:512:0x0ad1, B:514:0x0ad5, B:672:0x0ab8, B:677:0x0a4a, B:681:0x0caf, B:435:0x0a21, B:437:0x0a25, B:440:0x0a2b), top: B:431:0x0a15, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:506:0x0aac  */
        /* JADX WARN: Removed duplicated region for block: B:525:0x0be0  */
        /* JADX WARN: Removed duplicated region for block: B:534:0x0bfd A[Catch: all -> 0x0bf3, TryCatch #11 {all -> 0x0bf3, blocks: (B:526:0x0be2, B:528:0x0bec, B:531:0x0bf8, B:534:0x0bfd, B:536:0x0c03, B:540:0x0c17, B:546:0x0c25, B:548:0x0c2b, B:550:0x0c48, B:552:0x0c35, B:554:0x0c3b, B:557:0x0c50, B:559:0x0c5e, B:560:0x0c67), top: B:523:0x0bde }] */
        /* JADX WARN: Removed duplicated region for block: B:550:0x0c48 A[Catch: all -> 0x0bf3, TryCatch #11 {all -> 0x0bf3, blocks: (B:526:0x0be2, B:528:0x0bec, B:531:0x0bf8, B:534:0x0bfd, B:536:0x0c03, B:540:0x0c17, B:546:0x0c25, B:548:0x0c2b, B:550:0x0c48, B:552:0x0c35, B:554:0x0c3b, B:557:0x0c50, B:559:0x0c5e, B:560:0x0c67), top: B:523:0x0bde }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:676:0x0bd9  */
        /* JADX WARN: Removed duplicated region for block: B:683:0x0874 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:710:0x08e5 A[Catch: all -> 0x08ac, TryCatch #6 {all -> 0x08ac, blocks: (B:684:0x0874, B:685:0x0881, B:694:0x088f, B:696:0x08a8, B:700:0x08b3, B:701:0x08bc, B:703:0x08d1, B:708:0x08de, B:710:0x08e5, B:712:0x090a, B:714:0x0914, B:718:0x091a, B:719:0x0920, B:721:0x0926, B:725:0x0938, B:727:0x093e, B:729:0x0949, B:731:0x094f, B:766:0x08f0, B:768:0x0901, B:769:0x08fb, B:773:0x0a06, B:687:0x0882, B:689:0x0886, B:692:0x088c), top: B:683:0x0874, inners: #24 }] */
        /* JADX WARN: Removed duplicated region for block: B:800:0x0757 A[Catch: all -> 0x074c, TryCatch #29 {all -> 0x074c, blocks: (B:405:0x0778, B:409:0x0786, B:413:0x079d, B:420:0x07ad, B:424:0x07b6, B:776:0x07bb, B:777:0x078f, B:791:0x073b, B:793:0x0741, B:798:0x0750, B:800:0x0757, B:805:0x0761, B:807:0x0772, B:808:0x076c), top: B:397:0x06bf }] */
        /* JADX WARN: Removed duplicated region for block: B:848:0x07df  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x023d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:905:0x0d7a  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0242 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:911:0x0d96  */
        /* JADX WARN: Removed duplicated region for block: B:917:0x0db5  */
        /* JADX WARN: Removed duplicated region for block: B:919:0x0dbd  */
        /* JADX WARN: Removed duplicated region for block: B:922:0x0dc2  */
        /* JADX WARN: Removed duplicated region for block: B:927:0x0d7c  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0280  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x028f  */
        /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v20, types: [int] */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v23 */
        /* JADX WARN: Type inference failed for: r10v28 */
        /* JADX WARN: Type inference failed for: r14v12 */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v18 */
        /* JADX WARN: Type inference failed for: r14v19 */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v20 */
        /* JADX WARN: Type inference failed for: r14v56 */
        /* JADX WARN: Type inference failed for: r14v57 */
        /* JADX WARN: Type inference failed for: r14v58 */
        /* JADX WARN: Type inference failed for: r18v18, types: [org.telegram.ui.Components.c6] */
        /* JADX WARN: Type inference failed for: r2v102 */
        /* JADX WARN: Type inference failed for: r2v103 */
        /* JADX WARN: Type inference failed for: r2v70 */
        /* JADX WARN: Type inference failed for: r40v0, types: [org.telegram.messenger.ImageLoader$CacheOutTask] */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v27, types: [int] */
        /* JADX WARN: Type inference failed for: r5v79 */
        /* JADX WARN: Type inference failed for: r5v80 */
        /* JADX WARN: Type inference failed for: r9v39, types: [org.telegram.messenger.ImageLoader$CacheImage] */
        /* JADX WARN: Type inference failed for: r9v40 */
        /* JADX WARN: Type inference failed for: r9v41 */
        /* JADX WARN: Type inference failed for: r9v45, types: [int] */
        /* JADX WARN: Type inference failed for: r9v46 */
        /* JADX WARN: Type inference failed for: r9v47 */
        /* JADX WARN: Type inference failed for: r9v49 */
        /* JADX WARN: Type inference failed for: r9v75 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            j11 j11Var;
            Bitmap bitmap;
            Object obj;
            byte[] bArr;
            SecureDocumentKey secureDocumentKey;
            String str;
            Long l10;
            boolean z10;
            boolean z11;
            String str2;
            Long l11;
            boolean z12;
            float f9;
            Bitmap bitmap2;
            char c3;
            float f10;
            float f11;
            boolean z13;
            boolean z14;
            int i10;
            ?? r14;
            boolean z15;
            ?? r52;
            int i11;
            boolean z16;
            float f12;
            char c6;
            Bitmap createScaledBitmap;
            boolean z17;
            CacheImage cacheImage;
            String str3;
            Object obj2;
            int i12;
            boolean z18;
            SecureDocumentKey secureDocumentKey2;
            SecureDocumentKey secureDocumentKey3;
            char c10;
            boolean z19;
            Bitmap createScaledBitmap2;
            int i13;
            SecureDocumentKey secureDocumentKey4;
            boolean z20;
            int i14;
            FileInputStream fileInputStream;
            Bitmap bitmap3;
            Rect rect;
            String str4;
            String str5;
            FileInputStream fileInputStream2;
            int i15;
            boolean z21;
            boolean z22;
            boolean z23;
            int i16;
            Long l12;
            boolean z24;
            String str6;
            byte[] bArr2;
            boolean z25;
            boolean z26;
            boolean z27;
            boolean z28;
            boolean z29;
            Bitmap bitmap4;
            MediaMetadataRetriever mediaMetadataRetriever;
            ie.i iVar;
            boolean z30;
            org.telegram.ui.Components.c6 c6Var;
            int i17;
            int i18;
            boolean z31;
            String str7;
            int i19;
            boolean z32;
            int i20;
            int i21;
            String str8;
            boolean z33;
            boolean z34;
            boolean z35;
            boolean z36;
            int i22;
            boolean z37;
            int i23;
            ?? r22;
            Throwable th2;
            RandomAccessFile randomAccessFile;
            RandomAccessFile randomAccessFile2;
            boolean z38;
            ie.i iVar2;
            ie.i iVar3;
            int i24;
            int i25;
            xi0 xi0Var;
            xi0 xi0Var2;
            byte[] bArr3;
            char c11;
            boolean z39;
            boolean z40;
            int i26;
            String str9;
            int i27;
            synchronized (this.sync) {
                try {
                    this.runningThread = Thread.currentThread();
                    Thread.interrupted();
                    if (this.isCancelled) {
                        return;
                    }
                    CacheImage cacheImage2 = this.cacheImage;
                    ImageLocation imageLocation = cacheImage2.imageLocation;
                    TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        Bitmap strippedPhotoBitmap = ImageLoader.getStrippedPhotoBitmap(((TLRPC.TL_photoStrippedSize) photoSize).bytes, "b");
                        onPostExecute(strippedPhotoBitmap != null ? new BitmapDrawable(strippedPhotoBitmap) : null);
                        return;
                    }
                    int i28 = cacheImage2.imageType;
                    if (i28 == 5) {
                        try {
                            CacheImage cacheImage3 = this.cacheImage;
                            j11Var = new j11(cacheImage3.finalFilePath, (DocumentObject.ThemeDocument) cacheImage3.imageLocation.document);
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                            j11Var = null;
                        }
                        onPostExecute(j11Var);
                        return;
                    }
                    if (i28 == 3 || i28 == 4) {
                        Point point = AndroidUtilities.displaySize;
                        int i29 = point.x;
                        int i30 = point.y;
                        String str10 = cacheImage2.filter;
                        if (str10 != null) {
                            String[] split = str10.split("_");
                            if (split.length >= 2) {
                                float parseFloat = Float.parseFloat(split[0]);
                                float parseFloat2 = Float.parseFloat(split[1]);
                                float f13 = AndroidUtilities.density;
                                int i31 = (int) (parseFloat2 * f13);
                                i29 = (int) (parseFloat * f13);
                                i30 = i31;
                                CacheImage cacheImage4 = this.cacheImage;
                                SvgHelper.SvgResult svgResult = SvgHelper.getSvgBitmap(cacheImage4.finalFilePath, i29, i30, cacheImage4.imageType != 4);
                                bitmap = svgResult.getBitmap();
                                SvgHelper.SvgResult svgResult2 = svgResult;
                                if (bitmap != null && !TextUtils.isEmpty(this.cacheImage.filter) && this.cacheImage.filter.contains("wallpaper")) {
                                    obj = this.cacheImage.parentObject;
                                    if (obj instanceof TLRPC.WallPaper) {
                                        bitmap = applyWallpaperSetting(bitmap, (TLRPC.WallPaper) obj);
                                    }
                                }
                                onPostExecute(of.b.a(bitmap, svgResult2 != null ? svgResult2.getGiftPatternPositions() : null));
                                return;
                            }
                        }
                        CacheImage cacheImage42 = this.cacheImage;
                        SvgHelper.SvgResult svgResult3 = SvgHelper.getSvgBitmap(cacheImage42.finalFilePath, i29, i30, cacheImage42.imageType != 4);
                        bitmap = svgResult3.getBitmap();
                        SvgHelper.SvgResult svgResult22 = svgResult3;
                        if (bitmap != null) {
                            obj = this.cacheImage.parentObject;
                            if (obj instanceof TLRPC.WallPaper) {
                            }
                        }
                        onPostExecute(of.b.a(bitmap, svgResult22 != null ? svgResult22.getGiftPatternPositions() : null));
                        return;
                    }
                    if (i28 == 1) {
                        int min = Math.min(512, AndroidUtilities.dp(170.6f));
                        int min2 = Math.min(512, AndroidUtilities.dp(170.6f));
                        String str11 = this.cacheImage.filter;
                        if (str11 != null) {
                            String[] split2 = str11.split("_");
                            if (split2.length >= 2) {
                                float parseFloat3 = Float.parseFloat(split2[0]);
                                float parseFloat4 = Float.parseFloat(split2[1]);
                                int min3 = Math.min(512, (int) (AndroidUtilities.density * parseFloat3));
                                int min4 = Math.min(512, (int) (AndroidUtilities.density * parseFloat4));
                                if (parseFloat3 > 90.0f || parseFloat4 > 90.0f || this.cacheImage.filter.contains("nolimit")) {
                                    min2 = min4;
                                    i27 = min3;
                                    z39 = false;
                                } else {
                                    int min5 = Math.min(min3, 160);
                                    min2 = Math.min(min4, 160);
                                    z39 = true;
                                    i27 = min5;
                                }
                                z35 = (split2.length >= 3 && "pcache".equals(split2[2])) || this.cacheImage.filter.contains("pcache") || !(this.cacheImage.filter.contains("nolimit") || SharedConfig.getDevicePerformanceClass() == 2);
                                z36 = this.cacheImage.filter.contains("lastframe");
                                c11 = 4;
                                z40 = this.cacheImage.filter.contains("lastreactframe");
                                if (z40) {
                                    z36 = true;
                                }
                                if (this.cacheImage.filter.contains("firstframe")) {
                                    z33 = true;
                                    i26 = i27;
                                } else {
                                    z33 = false;
                                    i26 = i27;
                                }
                            } else {
                                c11 = 4;
                                z39 = false;
                                z33 = false;
                                z40 = false;
                                z35 = false;
                                z36 = false;
                                i26 = min;
                            }
                            if (split2.length >= 3) {
                                if (!"nr".equals(split2[2])) {
                                    if ("nrs".equals(split2[2])) {
                                        str9 = null;
                                        i22 = 3;
                                        if (split2.length >= 5) {
                                            if ("c1".equals(split2[c11])) {
                                                i21 = i26;
                                                z37 = z39;
                                                i23 = 12;
                                            } else if ("c2".equals(split2[c11])) {
                                                i21 = i26;
                                                z37 = z39;
                                                i23 = 3;
                                            } else if ("c3".equals(split2[c11])) {
                                                i21 = i26;
                                                z37 = z39;
                                                i23 = 4;
                                            } else if ("c4".equals(split2[c11])) {
                                                i21 = i26;
                                                z37 = z39;
                                                i23 = 5;
                                            } else if ("c5".equals(split2[c11])) {
                                                i21 = i26;
                                                z37 = z39;
                                                i23 = 6;
                                            }
                                            i20 = min2;
                                            str8 = str9;
                                            z34 = z40;
                                            r22 = i26;
                                        }
                                        i21 = i26;
                                        z37 = z39;
                                        i23 = 0;
                                        i20 = min2;
                                        str8 = str9;
                                        z34 = z40;
                                        r22 = i26;
                                    } else {
                                        str9 = "dice".equals(split2[2]) ? split2[3] : null;
                                    }
                                }
                                i22 = 2;
                                if (split2.length >= 5) {
                                }
                                i21 = i26;
                                z37 = z39;
                                i23 = 0;
                                i20 = min2;
                                str8 = str9;
                                z34 = z40;
                                r22 = i26;
                            }
                            str9 = null;
                            i22 = 1;
                            if (split2.length >= 5) {
                            }
                            i21 = i26;
                            z37 = z39;
                            i23 = 0;
                            i20 = min2;
                            str8 = str9;
                            z34 = z40;
                            r22 = i26;
                        } else {
                            i20 = min2;
                            i21 = min;
                            str8 = null;
                            z33 = false;
                            z34 = false;
                            z35 = false;
                            z36 = false;
                            i22 = 1;
                            z37 = false;
                            i23 = 0;
                            r22 = min;
                        }
                        if (str8 != null) {
                            xi0Var2 = "🎰".equals(str8) ? new pv0(str8, i21, i20) : new ti0(str8, i21, i20);
                            i24 = i20;
                            i25 = i21;
                        } else {
                            File file = this.cacheImage.finalFilePath;
                            try {
                                try {
                                    randomAccessFile2 = new RandomAccessFile(this.cacheImage.finalFilePath, "r");
                                    try {
                                        bArr3 = this.cacheImage.type == 1 ? ImageLoader.headerThumb : ImageLoader.header;
                                        randomAccessFile2.readFully(bArr3, 0, 2);
                                    } catch (Exception e10) {
                                        e = e10;
                                        FileLog.e((Throwable) e, false);
                                        if (randomAccessFile2 != null) {
                                            try {
                                                randomAccessFile2.close();
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                            }
                                        }
                                        z38 = false;
                                        if (!z36) {
                                        }
                                        z35 = false;
                                        if (z35) {
                                        }
                                        iVar2 = new ie.i();
                                        if (z36) {
                                        }
                                        iVar2.c = true;
                                        iVar3 = iVar2;
                                        ImageLocation imageLocation2 = this.cacheImage.imageLocation;
                                        if (imageLocation2 == null) {
                                        }
                                        if (z38) {
                                        }
                                        xi0Var2 = xi0Var;
                                        if (z36) {
                                        }
                                        loadLastFrame(xi0Var2, i24, i25, z36, z34);
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    randomAccessFile = r22;
                                    th2 = th4;
                                    if (randomAccessFile != null) {
                                        throw th2;
                                    }
                                    try {
                                        randomAccessFile.close();
                                        throw th2;
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                        throw th2;
                                    }
                                }
                            } catch (Exception e13) {
                                e = e13;
                                randomAccessFile2 = null;
                            } catch (Throwable th5) {
                                th2 = th5;
                                randomAccessFile = null;
                                if (randomAccessFile != null) {
                                }
                            }
                            if (bArr3[0] == 31) {
                                if (bArr3[1] == -117) {
                                    z38 = true;
                                    randomAccessFile2.close();
                                    if (!z36 || z33) {
                                        z35 = false;
                                    }
                                    if (!z35 || z36 || z33) {
                                        iVar2 = new ie.i();
                                        if (!z36 || z33) {
                                            iVar2.c = true;
                                        } else {
                                            String str12 = this.cacheImage.filter;
                                            if (str12 != null && str12.contains("compress")) {
                                                iVar2.a = 60;
                                            }
                                            String str13 = this.cacheImage.filter;
                                            if (str13 != null && str13.contains("flbk")) {
                                                iVar2.b = true;
                                            }
                                        }
                                        iVar3 = iVar2;
                                    } else {
                                        iVar3 = null;
                                    }
                                    ImageLocation imageLocation22 = this.cacheImage.imageLocation;
                                    boolean z41 = imageLocation22 == null && MessageObject.isTextColorEmoji(imageLocation22.document);
                                    if (z38) {
                                        File file2 = this.cacheImage.finalFilePath;
                                        i24 = i20;
                                        i25 = i21;
                                        xi0Var = new xi0(file2, ImageLoader.decompressGzip(file2), i25, i24, iVar3, z37, i23, z41);
                                    } else {
                                        i24 = i20;
                                        i25 = i21;
                                        xi0Var = new xi0(this.cacheImage.finalFilePath, null, i25, i24, iVar3, z37, i23, z41);
                                    }
                                    xi0Var2 = xi0Var;
                                }
                            }
                            z38 = false;
                            randomAccessFile2.close();
                            if (!z36) {
                            }
                            z35 = false;
                            if (z35) {
                            }
                            iVar2 = new ie.i();
                            if (z36) {
                            }
                            iVar2.c = true;
                            iVar3 = iVar2;
                            ImageLocation imageLocation222 = this.cacheImage.imageLocation;
                            if (imageLocation222 == null) {
                            }
                            if (z38) {
                            }
                            xi0Var2 = xi0Var;
                        }
                        if (!z36 || z33) {
                            loadLastFrame(xi0Var2, i24, i25, z36, z34);
                            return;
                        } else {
                            xi0Var2.I(i22);
                            onPostExecute(xi0Var2);
                            return;
                        }
                    }
                    if (i28 != 2) {
                        File file3 = cacheImage2.finalFilePath;
                        boolean z42 = (cacheImage2.secureDocument == null && (cacheImage2.encryptionKeyPath == null || file3 == null || !file3.getAbsolutePath().endsWith(".enc"))) ? false : true;
                        CacheImage cacheImage5 = this.cacheImage;
                        SecureDocument secureDocument = cacheImage5.secureDocument;
                        if (secureDocument != null) {
                            SecureDocumentKey secureDocumentKey5 = secureDocument.secureDocumentKey;
                            TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
                            if (tL_secureFile == null || (bArr2 = tL_secureFile.file_hash) == null) {
                                bArr = secureDocument.fileHash;
                                secureDocumentKey = secureDocumentKey5;
                            } else {
                                bArr = bArr2;
                                secureDocumentKey = secureDocumentKey5;
                            }
                        } else {
                            bArr = null;
                            secureDocumentKey = null;
                        }
                        String str14 = cacheImage5.imageLocation.path;
                        if (str14 != null) {
                            if (str14.startsWith("thumb://")) {
                                int indexOf = str14.indexOf(":", 8);
                                if (indexOf >= 0) {
                                    l10 = Long.valueOf(Long.parseLong(str14.substring(8, indexOf)));
                                    str6 = str14.substring(indexOf + 1);
                                } else {
                                    str6 = null;
                                    l10 = null;
                                }
                                str = str6;
                            } else {
                                if (str14.startsWith("vthumb://")) {
                                    int indexOf2 = str14.indexOf(":", 9);
                                    if (indexOf2 >= 0) {
                                        l12 = Long.valueOf(Long.parseLong(str14.substring(9, indexOf2)));
                                        z24 = true;
                                    } else {
                                        l12 = null;
                                        z24 = false;
                                    }
                                    l10 = l12;
                                    z10 = z24;
                                    str = null;
                                    z11 = false;
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inSampleSize = 1;
                                    boolean z43 = ImageLoader.this.canForce8888;
                                    int i32 = 1067030938;
                                    i32 = 1067030938;
                                    i32 = 1067030938;
                                    i32 = 1067030938;
                                    str5 = this.cacheImage.filter;
                                    if (str5 != null) {
                                        f9 = 0.0f;
                                        try {
                                            String[] split3 = str5.split("_");
                                            if (split3.length >= 2) {
                                                f10 = Float.parseFloat(split3[0]) * AndroidUtilities.density;
                                                try {
                                                    f11 = Float.parseFloat(split3[1]) * AndroidUtilities.density;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    str2 = str;
                                                    l11 = l10;
                                                    z12 = z10;
                                                    bitmap2 = null;
                                                    c3 = 0;
                                                    f11 = 0.0f;
                                                    z13 = false;
                                                    z14 = z43;
                                                    i10 = 1;
                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                    r14 = z14;
                                                    float f14 = f11;
                                                    boolean z44 = z13;
                                                    if (this.cacheImage.type != i10) {
                                                    }
                                                    Thread.interrupted();
                                                    if (BuildVars.LOGS_ENABLED) {
                                                    }
                                                    if (bitmap2 != null) {
                                                    }
                                                    cacheImage = this.cacheImage;
                                                    if (cacheImage == null) {
                                                    }
                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                    return;
                                                }
                                            } else {
                                                f10 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            try {
                                                c3 = this.cacheImage.filter.contains("b2r") ? (char) 4 : this.cacheImage.filter.contains("b2") ? (char) 3 : this.cacheImage.filter.contains("b1") ? (char) 2 : this.cacheImage.filter.contains("b") ? (char) 1 : (char) 0;
                                                try {
                                                    boolean contains = this.cacheImage.filter.contains("i");
                                                    try {
                                                        if (this.cacheImage.filter.contains("f")) {
                                                            z43 = true;
                                                        } else {
                                                            z43 = z43;
                                                            if (this.cacheImage.filter.contains("F")) {
                                                                z43 = false;
                                                            }
                                                        }
                                                        if (f10 == 0.0f || f11 == 0.0f) {
                                                            str2 = str;
                                                            l11 = l10;
                                                            z13 = contains;
                                                            z12 = z10;
                                                        } else {
                                                            options.inJustDecodeBounds = true;
                                                            try {
                                                                try {
                                                                    if (l10 == null || str != null) {
                                                                        str2 = str;
                                                                        l11 = l10;
                                                                        if (secureDocumentKey != null) {
                                                                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(file3, "r");
                                                                            int length = (int) randomAccessFile3.length();
                                                                            byte[] bArr4 = (byte[]) ImageLoader.bytesLocal.get();
                                                                            if (bArr4 == null || bArr4.length < length) {
                                                                                bArr4 = null;
                                                                            }
                                                                            if (bArr4 == null) {
                                                                                bArr4 = new byte[length];
                                                                                ImageLoader.bytesLocal.set(bArr4);
                                                                            }
                                                                            randomAccessFile3.readFully(bArr4, 0, length);
                                                                            randomAccessFile3.close();
                                                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr4, 0, length, secureDocumentKey);
                                                                            z13 = contains;
                                                                            z12 = z10;
                                                                            byte[] computeSHA256 = Utilities.computeSHA256(bArr4, 0, length);
                                                                            if (bArr != null && Arrays.equals(computeSHA256, bArr)) {
                                                                                z23 = false;
                                                                                int i33 = bArr4[0] & 255;
                                                                                int i34 = length - i33;
                                                                                if (!z23) {
                                                                                    BitmapFactory.decodeByteArray(bArr4, i33, i34, options);
                                                                                }
                                                                            }
                                                                            z23 = true;
                                                                            int i332 = bArr4[0] & 255;
                                                                            int i342 = length - i332;
                                                                            if (!z23) {
                                                                            }
                                                                        } else {
                                                                            z13 = contains;
                                                                            z12 = z10;
                                                                            FileInputStream encryptedFileInputStream = z42 ? new EncryptedFileInputStream(file3, this.cacheImage.encryptionKeyPath) : new FileInputStream(file3);
                                                                            BitmapFactory.decodeStream(encryptedFileInputStream, null, options);
                                                                            encryptedFileInputStream.close();
                                                                        }
                                                                    } else {
                                                                        if (z10) {
                                                                            str2 = str;
                                                                            l11 = l10;
                                                                            MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l11.longValue(), 1, options);
                                                                        } else {
                                                                            str2 = str;
                                                                            l11 = l10;
                                                                            MediaStore.Images.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l11.longValue(), 1, options);
                                                                        }
                                                                        z13 = contains;
                                                                        z12 = z10;
                                                                    }
                                                                    float f15 = options.outWidth;
                                                                    float f16 = options.outHeight;
                                                                    float min6 = (f10 < f11 || f15 <= f16) ? Math.min(f15 / f10, f16 / f11) : Math.max(f15 / f10, f16 / f11);
                                                                    if (min6 < 1.2f) {
                                                                        min6 = 1.0f;
                                                                    }
                                                                    options.inJustDecodeBounds = false;
                                                                    if (min6 <= 1.0f || (f15 <= f10 && f16 <= f11)) {
                                                                        options.inSampleSize = (int) min6;
                                                                    } else {
                                                                        int i35 = 1;
                                                                        while (true) {
                                                                            i16 = i35 * 2;
                                                                            if (i35 * 4 >= min6) {
                                                                                break;
                                                                            } else {
                                                                                i35 = i16;
                                                                            }
                                                                        }
                                                                        options.inSampleSize = i16;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    z22 = z43;
                                                                    bitmap2 = null;
                                                                    z14 = z22;
                                                                    i10 = 1;
                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                    r14 = z14;
                                                                    float f142 = f11;
                                                                    boolean z442 = z13;
                                                                    if (this.cacheImage.type != i10) {
                                                                    }
                                                                    Thread.interrupted();
                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    cacheImage = this.cacheImage;
                                                                    if (cacheImage == null) {
                                                                    }
                                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                    return;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                z13 = contains;
                                                                z12 = z10;
                                                                z22 = z43;
                                                                bitmap2 = null;
                                                                z14 = z22;
                                                                i10 = 1;
                                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                r14 = z14;
                                                                float f1422 = f11;
                                                                boolean z4422 = z13;
                                                                if (this.cacheImage.type != i10) {
                                                                }
                                                                Thread.interrupted();
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                }
                                                                if (bitmap2 != null) {
                                                                }
                                                                cacheImage = this.cacheImage;
                                                                if (cacheImage == null) {
                                                                }
                                                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                return;
                                                            }
                                                        }
                                                        bitmap2 = null;
                                                        z21 = z43;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        str2 = str;
                                                        l11 = l10;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    str2 = str;
                                                    l11 = l10;
                                                    z12 = z10;
                                                    bitmap2 = null;
                                                    z13 = false;
                                                    z14 = z43;
                                                    i10 = 1;
                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                    r14 = z14;
                                                    float f14222 = f11;
                                                    boolean z44222 = z13;
                                                    if (this.cacheImage.type != i10) {
                                                    }
                                                    Thread.interrupted();
                                                    if (BuildVars.LOGS_ENABLED) {
                                                    }
                                                    if (bitmap2 != null) {
                                                    }
                                                    cacheImage = this.cacheImage;
                                                    if (cacheImage == null) {
                                                    }
                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                    return;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                str2 = str;
                                                l11 = l10;
                                                z12 = z10;
                                                bitmap2 = null;
                                                c3 = 0;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            str2 = str;
                                            l11 = l10;
                                            z12 = z10;
                                            bitmap2 = null;
                                            c3 = 0;
                                            f10 = 0.0f;
                                            f11 = 0.0f;
                                            z13 = false;
                                            z14 = z43;
                                            i10 = 1;
                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                            r14 = z14;
                                            float f142222 = f11;
                                            boolean z442222 = z13;
                                            if (this.cacheImage.type != i10) {
                                            }
                                            Thread.interrupted();
                                            if (BuildVars.LOGS_ENABLED) {
                                            }
                                            if (bitmap2 != null) {
                                            }
                                            cacheImage = this.cacheImage;
                                            if (cacheImage == null) {
                                            }
                                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                            return;
                                        }
                                    } else {
                                        str2 = str;
                                        l11 = l10;
                                        z12 = z10;
                                        f9 = 0.0f;
                                        if (str2 != null) {
                                            try {
                                                options.inJustDecodeBounds = true;
                                                options.inPreferredConfig = z43 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                                fileInputStream2 = new FileInputStream(file3);
                                                bitmap2 = BitmapFactory.decodeStream(fileInputStream2, null, options);
                                            } catch (Throwable th13) {
                                                th = th13;
                                                bitmap2 = null;
                                                c3 = 0;
                                                f10 = 0.0f;
                                                f11 = 0.0f;
                                                z13 = false;
                                                z14 = z43;
                                                i10 = 1;
                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                r14 = z14;
                                                float f1422222 = f11;
                                                boolean z4422222 = z13;
                                                if (this.cacheImage.type != i10) {
                                                }
                                                Thread.interrupted();
                                                if (BuildVars.LOGS_ENABLED) {
                                                }
                                                if (bitmap2 != null) {
                                                }
                                                cacheImage = this.cacheImage;
                                                if (cacheImage == null) {
                                                }
                                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                return;
                                            }
                                            try {
                                                fileInputStream2.close();
                                                int i36 = options.outWidth;
                                                int i37 = options.outHeight;
                                                options.inJustDecodeBounds = false;
                                                float min7 = (Math.min(i37, i36) / Math.max(66, Math.min(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y))) * 6.0f;
                                                if (min7 < 1.0f) {
                                                    min7 = 1.0f;
                                                }
                                                if (min7 > 1.0f) {
                                                    int i38 = 1;
                                                    while (true) {
                                                        i15 = i38 * 2;
                                                        if (i38 * 4 > min7) {
                                                            break;
                                                        } else {
                                                            i38 = i15;
                                                        }
                                                    }
                                                    options.inSampleSize = i15;
                                                } else {
                                                    options.inSampleSize = (int) min7;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                c3 = 0;
                                                f10 = 0.0f;
                                                f11 = 0.0f;
                                                z13 = false;
                                                z14 = z43;
                                                i10 = 1;
                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                r14 = z14;
                                                float f14222222 = f11;
                                                boolean z44222222 = z13;
                                                if (this.cacheImage.type != i10) {
                                                }
                                                Thread.interrupted();
                                                if (BuildVars.LOGS_ENABLED) {
                                                }
                                                if (bitmap2 != null) {
                                                }
                                                cacheImage = this.cacheImage;
                                                if (cacheImage == null) {
                                                }
                                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                return;
                                            }
                                        } else {
                                            bitmap2 = null;
                                        }
                                        c3 = 0;
                                        f10 = 0.0f;
                                        f11 = 0.0f;
                                        z13 = false;
                                        z21 = z43;
                                    }
                                    i10 = 1;
                                    r14 = z21;
                                    float f142222222 = f11;
                                    boolean z442222222 = z13;
                                    if (this.cacheImage.type != i10) {
                                        try {
                                            ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                        } catch (Throwable th15) {
                                            th = th15;
                                            z15 = false;
                                        }
                                        synchronized (this.sync) {
                                            try {
                                                if (this.isCancelled) {
                                                    return;
                                                }
                                                if (secureDocumentKey != null) {
                                                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(file3, "r");
                                                    int length2 = (int) randomAccessFile4.length();
                                                    byte[] bArr5 = (byte[]) ImageLoader.bytesThumbLocal.get();
                                                    if (bArr5 == null || bArr5.length < length2) {
                                                        bArr5 = null;
                                                    }
                                                    if (bArr5 == null) {
                                                        bArr5 = new byte[length2];
                                                        ImageLoader.bytesThumbLocal.set(bArr5);
                                                    }
                                                    randomAccessFile4.readFully(bArr5, 0, length2);
                                                    randomAccessFile4.close();
                                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr5, 0, length2, secureDocumentKey);
                                                    z16 = z442222222;
                                                    f12 = 20.0f;
                                                    byte[] computeSHA2562 = Utilities.computeSHA256(bArr5, 0, length2);
                                                    if (bArr != null && Arrays.equals(computeSHA2562, bArr)) {
                                                        z17 = false;
                                                        int i39 = bArr5[0] & 255;
                                                        int i40 = length2 - i39;
                                                        if (!z17) {
                                                            bitmap2 = BitmapFactory.decodeByteArray(bArr5, i39, i40, options);
                                                        }
                                                    }
                                                    z17 = true;
                                                    int i392 = bArr5[0] & 255;
                                                    int i402 = length2 - i392;
                                                    if (!z17) {
                                                    }
                                                } else {
                                                    z16 = z442222222;
                                                    f12 = 20.0f;
                                                    FileInputStream encryptedFileInputStream2 = z42 ? new EncryptedFileInputStream(file3, this.cacheImage.encryptionKeyPath) : new FileInputStream(file3);
                                                    bitmap2 = BitmapFactory.decodeStream(encryptedFileInputStream2, null, options);
                                                    encryptedFileInputStream2.close();
                                                }
                                                if (bitmap2 == null) {
                                                    if (file3.length() == 0 || this.cacheImage.filter == null) {
                                                        file3.delete();
                                                    }
                                                    z15 = false;
                                                } else {
                                                    if (this.cacheImage.filter != null) {
                                                        float width = bitmap2.getWidth();
                                                        float height = bitmap2.getHeight();
                                                        if (f10 != f9 && width != f10 && width > f10 + f12 && bitmap2 != (createScaledBitmap = Bitmaps.createScaledBitmap(bitmap2, (int) f10, (int) (height / (width / f10)), true))) {
                                                            bitmap2.recycle();
                                                            bitmap2 = createScaledBitmap;
                                                        }
                                                    }
                                                    z15 = z16 ? Utilities.needInvert(bitmap2) != 0 : false;
                                                    try {
                                                        if (c3 == 1) {
                                                            if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                                Utilities.blurBitmap(bitmap2, 3);
                                                            }
                                                        } else if (c3 != 2) {
                                                            if (c3 != 3) {
                                                                c6 = 4;
                                                                if (c3 == 4) {
                                                                }
                                                            } else {
                                                                c6 = 4;
                                                            }
                                                            if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                                if (c3 == c6) {
                                                                    Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), bitmap2.getConfig());
                                                                    Canvas canvas = new Canvas(createBitmap);
                                                                    canvas.save();
                                                                    canvas.scale(1.2f, 1.2f, bitmap2.getWidth() / 2.0f, bitmap2.getHeight() / 2.0f);
                                                                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                                                                    canvas.restore();
                                                                    Path path = new Path();
                                                                    path.addCircle(bitmap2.getWidth() / 2.0f, bitmap2.getHeight() / 2.0f, Math.min(bitmap2.getWidth(), bitmap2.getHeight()) / 2.0f, Path.Direction.CW);
                                                                    canvas.clipPath(path);
                                                                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                                                                    bitmap2.recycle();
                                                                    bitmap2 = createBitmap;
                                                                }
                                                                Utilities.blurBitmap(bitmap2, 7);
                                                                Utilities.blurBitmap(bitmap2, 7);
                                                                Utilities.blurBitmap(bitmap2, 7);
                                                            }
                                                        } else if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                            Utilities.blurBitmap(bitmap2, 1);
                                                        }
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                        r52 = 0;
                                                        i11 = 0;
                                                        Thread.interrupted();
                                                        if (BuildVars.LOGS_ENABLED) {
                                                        }
                                                        if (bitmap2 != null) {
                                                        }
                                                        cacheImage = this.cacheImage;
                                                        if (cacheImage == null) {
                                                        }
                                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                        return;
                                                    }
                                                }
                                                r52 = 0;
                                                i11 = 0;
                                            } finally {
                                            }
                                        }
                                    } else {
                                        try {
                                            ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                            synchronized (this.sync) {
                                                try {
                                                    if (this.isCancelled) {
                                                        return;
                                                    }
                                                    try {
                                                        if (r14 == 0) {
                                                            CacheImage cacheImage6 = this.cacheImage;
                                                            if (cacheImage6.filter != null && c3 == 0 && cacheImage6.imageLocation.path == null) {
                                                                options.inPreferredConfig = Bitmap.Config.RGB_565;
                                                                options.inDither = false;
                                                                if (l11 != null && str2 == null) {
                                                                    if (z12) {
                                                                        bitmap2 = MediaStore.Images.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l11.longValue(), 1, options);
                                                                    } else if (l11.longValue() == 0) {
                                                                        try {
                                                                            ?? c6Var2 = new org.telegram.ui.Components.c6(file3, true, 0L, 0, null, null, null, 0L, 0, true);
                                                                            bitmap2 = c6Var2.q(0L, true);
                                                                            c6Var2.u();
                                                                            i32 = c6Var2;
                                                                        } catch (Throwable th17) {
                                                                            th = th17;
                                                                            file3 = file3;
                                                                            secureDocumentKey3 = null;
                                                                            z18 = false;
                                                                            i12 = 0;
                                                                            secureDocumentKey2 = secureDocumentKey3;
                                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                            z15 = z18;
                                                                            i11 = i12;
                                                                            r52 = secureDocumentKey2;
                                                                            Thread.interrupted();
                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                            }
                                                                            if (bitmap2 != null) {
                                                                            }
                                                                            cacheImage = this.cacheImage;
                                                                            if (cacheImage == null) {
                                                                            }
                                                                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        bitmap2 = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l11.longValue(), 1, options);
                                                                    }
                                                                }
                                                                if (bitmap2 != null) {
                                                                    if (bitmap2 == null) {
                                                                        if (secureDocumentKey != null) {
                                                                            fileInputStream = new EncryptedFileInputStream(file3, secureDocumentKey);
                                                                        } else if (z42) {
                                                                            fileInputStream = new EncryptedFileInputStream(file3, this.cacheImage.encryptionKeyPath);
                                                                        } else {
                                                                            try {
                                                                                fileInputStream = new FileInputStream(file3);
                                                                            } catch (Throwable th18) {
                                                                                th = th18;
                                                                                secureDocumentKey3 = null;
                                                                                z18 = false;
                                                                                i12 = 0;
                                                                                secureDocumentKey2 = secureDocumentKey3;
                                                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                z15 = z18;
                                                                                i11 = i12;
                                                                                r52 = secureDocumentKey2;
                                                                                Thread.interrupted();
                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                }
                                                                                if (bitmap2 != null) {
                                                                                }
                                                                                cacheImage = this.cacheImage;
                                                                                if (cacheImage == null) {
                                                                                }
                                                                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                                return;
                                                                            }
                                                                        }
                                                                        ?? r9 = this.cacheImage;
                                                                        ?? r10 = r9.imageLocation.document instanceof TLRPC.TL_document;
                                                                        try {
                                                                            if (r10 != 0 || ((str4 = r9.filter) != null && str4.contains("exif"))) {
                                                                                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(fileInputStream);
                                                                                r10 = ((Integer) imageOrientation.first).intValue();
                                                                                try {
                                                                                    r9 = ((Integer) imageOrientation.second).intValue();
                                                                                    try {
                                                                                        if (secureDocumentKey == null) {
                                                                                            try {
                                                                                                if (this.cacheImage.encryptionKeyPath == null) {
                                                                                                    bitmap3 = bitmap2;
                                                                                                    c10 = c3;
                                                                                                    fileInputStream.getChannel().position(0L);
                                                                                                    rect = null;
                                                                                                    r9 = r9;
                                                                                                    r10 = r10;
                                                                                                    r14 = bitmap3;
                                                                                                }
                                                                                            } catch (Throwable th19) {
                                                                                                th = th19;
                                                                                                i32 = r9;
                                                                                                secureDocumentKey = r10;
                                                                                                z18 = false;
                                                                                                secureDocumentKey2 = secureDocumentKey;
                                                                                                i12 = i32;
                                                                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                                z15 = z18;
                                                                                                i11 = i12;
                                                                                                r52 = secureDocumentKey2;
                                                                                                Thread.interrupted();
                                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                                }
                                                                                                if (bitmap2 != null) {
                                                                                                }
                                                                                                cacheImage = this.cacheImage;
                                                                                                if (cacheImage == null) {
                                                                                                }
                                                                                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        fileInputStream.close();
                                                                                        bitmap3 = r14;
                                                                                        if (secureDocumentKey != null) {
                                                                                            fileInputStream = new EncryptedFileInputStream(file3, secureDocumentKey);
                                                                                            bitmap3 = r14;
                                                                                        } else if (z42) {
                                                                                            fileInputStream = new EncryptedFileInputStream(file3, this.cacheImage.encryptionKeyPath);
                                                                                            bitmap3 = r14;
                                                                                        }
                                                                                        rect = null;
                                                                                        r9 = r9;
                                                                                        r10 = r10;
                                                                                        r14 = bitmap3;
                                                                                    } catch (Throwable th20) {
                                                                                        th = th20;
                                                                                        i32 = r9;
                                                                                        secureDocumentKey = r10;
                                                                                        bitmap2 = r14;
                                                                                        z18 = false;
                                                                                        secureDocumentKey2 = secureDocumentKey;
                                                                                        i12 = i32;
                                                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                        z15 = z18;
                                                                                        i11 = i12;
                                                                                        r52 = secureDocumentKey2;
                                                                                        Thread.interrupted();
                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                        }
                                                                                        if (bitmap2 != null) {
                                                                                        }
                                                                                        cacheImage = this.cacheImage;
                                                                                        if (cacheImage == null) {
                                                                                        }
                                                                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                                        return;
                                                                                    }
                                                                                    r14 = bitmap2;
                                                                                    c10 = c3;
                                                                                } catch (Throwable th21) {
                                                                                    th = th21;
                                                                                    secureDocumentKey3 = r10;
                                                                                    z18 = false;
                                                                                    i12 = 0;
                                                                                    secureDocumentKey2 = secureDocumentKey3;
                                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                    z15 = z18;
                                                                                    i11 = i12;
                                                                                    r52 = secureDocumentKey2;
                                                                                    Thread.interrupted();
                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                    }
                                                                                    if (bitmap2 != null) {
                                                                                    }
                                                                                    cacheImage = this.cacheImage;
                                                                                    if (cacheImage == null) {
                                                                                    }
                                                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                                    return;
                                                                                }
                                                                            } else {
                                                                                r14 = bitmap2;
                                                                                c10 = c3;
                                                                                rect = null;
                                                                                r9 = 0;
                                                                                r10 = 0;
                                                                            }
                                                                            bitmap2 = BitmapFactory.decodeStream(fileInputStream, rect, options);
                                                                            try {
                                                                                fileInputStream.close();
                                                                                i13 = r9;
                                                                                secureDocumentKey4 = r10;
                                                                            } catch (Throwable th22) {
                                                                                th = th22;
                                                                                i32 = r9;
                                                                                secureDocumentKey = r10;
                                                                                z18 = false;
                                                                                secureDocumentKey2 = secureDocumentKey;
                                                                                i12 = i32;
                                                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                z15 = z18;
                                                                                i11 = i12;
                                                                                r52 = secureDocumentKey2;
                                                                                Thread.interrupted();
                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                }
                                                                                if (bitmap2 != null) {
                                                                                }
                                                                                cacheImage = this.cacheImage;
                                                                                if (cacheImage == null) {
                                                                                }
                                                                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                                return;
                                                                            }
                                                                        } catch (Throwable th23) {
                                                                            th = th23;
                                                                        }
                                                                    } else {
                                                                        c10 = c3;
                                                                        i13 = 0;
                                                                        secureDocumentKey4 = null;
                                                                    }
                                                                    if (bitmap2 == null) {
                                                                        try {
                                                                            RandomAccessFile randomAccessFile5 = new RandomAccessFile(file3, "r");
                                                                            int i41 = i13;
                                                                            try {
                                                                                int length3 = (int) randomAccessFile5.length();
                                                                                byte[] bArr6 = (byte[]) ImageLoader.bytesLocal.get();
                                                                                if (bArr6 == null || bArr6.length < length3) {
                                                                                    bArr6 = null;
                                                                                }
                                                                                if (bArr6 == null) {
                                                                                    bArr6 = new byte[length3];
                                                                                    ImageLoader.bytesLocal.set(bArr6);
                                                                                }
                                                                                randomAccessFile5.readFully(bArr6, 0, length3);
                                                                                randomAccessFile5.close();
                                                                                try {
                                                                                    if (secureDocumentKey != null) {
                                                                                        EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, secureDocumentKey);
                                                                                        secureDocumentKey = secureDocumentKey4;
                                                                                        i32 = i41 == true ? 1 : 0;
                                                                                        byte[] computeSHA2563 = Utilities.computeSHA256(bArr6, 0, length3);
                                                                                        if (bArr != null && Arrays.equals(computeSHA2563, bArr)) {
                                                                                            z20 = false;
                                                                                            i14 = bArr6[0] & 255;
                                                                                            length3 -= i14;
                                                                                        }
                                                                                        z20 = true;
                                                                                        i14 = bArr6[0] & 255;
                                                                                        length3 -= i14;
                                                                                    } else {
                                                                                        secureDocumentKey = secureDocumentKey4;
                                                                                        i32 = i41 == true ? 1 : 0;
                                                                                        if (z42) {
                                                                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, this.cacheImage.encryptionKeyPath);
                                                                                        }
                                                                                        z20 = false;
                                                                                        i14 = 0;
                                                                                    }
                                                                                    if (!z20) {
                                                                                        bitmap2 = BitmapFactory.decodeByteArray(bArr6, i14, length3, options);
                                                                                    }
                                                                                } catch (Throwable th24) {
                                                                                    th = th24;
                                                                                    secureDocumentKey = secureDocumentKey;
                                                                                    i32 = i32;
                                                                                    try {
                                                                                        FileLog.e(th);
                                                                                        i11 = i32;
                                                                                        secureDocumentKey = secureDocumentKey;
                                                                                        if (bitmap2 == null) {
                                                                                        }
                                                                                        z19 = false;
                                                                                        z15 = z19;
                                                                                        r52 = secureDocumentKey;
                                                                                    } catch (Throwable th25) {
                                                                                        th = th25;
                                                                                        z18 = false;
                                                                                        secureDocumentKey2 = secureDocumentKey;
                                                                                        i12 = i32;
                                                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                        z15 = z18;
                                                                                        i11 = i12;
                                                                                        r52 = secureDocumentKey2;
                                                                                        Thread.interrupted();
                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                        }
                                                                                        if (bitmap2 != null) {
                                                                                        }
                                                                                        cacheImage = this.cacheImage;
                                                                                        if (cacheImage == null) {
                                                                                        }
                                                                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                                        return;
                                                                                    }
                                                                                    Thread.interrupted();
                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                    }
                                                                                    if (bitmap2 != null) {
                                                                                    }
                                                                                    cacheImage = this.cacheImage;
                                                                                    if (cacheImage == null) {
                                                                                    }
                                                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                                    return;
                                                                                }
                                                                            } catch (Throwable th26) {
                                                                                th = th26;
                                                                                secureDocumentKey = secureDocumentKey4;
                                                                                i32 = i41 == true ? 1 : 0;
                                                                            }
                                                                        } catch (Throwable th27) {
                                                                            th = th27;
                                                                            i32 = i13;
                                                                            secureDocumentKey = secureDocumentKey4;
                                                                        }
                                                                    } else {
                                                                        i32 = i13;
                                                                        secureDocumentKey = secureDocumentKey4;
                                                                    }
                                                                    i11 = i32;
                                                                    secureDocumentKey = secureDocumentKey;
                                                                } else {
                                                                    c10 = c3;
                                                                    secureDocumentKey = null;
                                                                    i11 = 0;
                                                                }
                                                                if (bitmap2 == null) {
                                                                    if (z11) {
                                                                        if (file3.length() != 0) {
                                                                            if (this.cacheImage.filter == null) {
                                                                            }
                                                                        }
                                                                        file3.delete();
                                                                    }
                                                                } else if (this.cacheImage.filter != null) {
                                                                    float width2 = bitmap2.getWidth();
                                                                    float height2 = bitmap2.getHeight();
                                                                    if (f10 != 0.0f && width2 != f10 && width2 > f10 + 20.0f) {
                                                                        if (width2 <= height2 || f10 <= f142222222) {
                                                                            float f17 = height2 / f142222222;
                                                                            if (f17 > 1.0f) {
                                                                                createScaledBitmap2 = Bitmaps.createScaledBitmap(bitmap2, (int) (width2 / f17), (int) f142222222, true);
                                                                                if (bitmap2 != createScaledBitmap2) {
                                                                                    bitmap2.recycle();
                                                                                    bitmap2 = createScaledBitmap2;
                                                                                }
                                                                            }
                                                                            createScaledBitmap2 = bitmap2;
                                                                            if (bitmap2 != createScaledBitmap2) {
                                                                            }
                                                                        } else {
                                                                            float f18 = width2 / f10;
                                                                            if (f18 > 1.0f) {
                                                                                createScaledBitmap2 = Bitmaps.createScaledBitmap(bitmap2, (int) f10, (int) (height2 / f18), true);
                                                                                if (bitmap2 != createScaledBitmap2) {
                                                                                }
                                                                            }
                                                                            createScaledBitmap2 = bitmap2;
                                                                            if (bitmap2 != createScaledBitmap2) {
                                                                            }
                                                                        }
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                        if (z442222222) {
                                                                            Bitmap createScaledBitmap3 = bitmap2.getWidth() * bitmap2.getHeight() > 22500 ? Bitmaps.createScaledBitmap(bitmap2, 100, 100, false) : bitmap2;
                                                                            z19 = Utilities.needInvert(createScaledBitmap3) != 0;
                                                                            if (createScaledBitmap3 != bitmap2) {
                                                                                try {
                                                                                    createScaledBitmap3.recycle();
                                                                                } catch (Throwable th28) {
                                                                                    th = th28;
                                                                                    i12 = i11;
                                                                                    z18 = z19;
                                                                                    secureDocumentKey2 = secureDocumentKey;
                                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                    z15 = z18;
                                                                                    i11 = i12;
                                                                                    r52 = secureDocumentKey2;
                                                                                    Thread.interrupted();
                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                    }
                                                                                    if (bitmap2 != null) {
                                                                                    }
                                                                                    cacheImage = this.cacheImage;
                                                                                    if (cacheImage == null) {
                                                                                    }
                                                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            z19 = false;
                                                                        }
                                                                        if (c10 != 0 && (height2 > 100.0f || width2 > 100.0f)) {
                                                                            height2 = 80.0f;
                                                                            bitmap2 = Bitmaps.createScaledBitmap(bitmap2, 80, 80, false);
                                                                            width2 = 80.0f;
                                                                        }
                                                                        if (c10 != 0 && height2 < 100.0f && width2 < 100.0f && bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                                            Utilities.blurBitmap(bitmap2, 3);
                                                                        }
                                                                        z15 = z19;
                                                                        r52 = secureDocumentKey;
                                                                    }
                                                                }
                                                                z19 = false;
                                                                z15 = z19;
                                                                r52 = secureDocumentKey;
                                                            }
                                                        }
                                                        if (bitmap2 == null) {
                                                        }
                                                        z19 = false;
                                                        z15 = z19;
                                                        r52 = secureDocumentKey;
                                                    } catch (Throwable th29) {
                                                        th = th29;
                                                        i32 = i11;
                                                        z18 = false;
                                                        secureDocumentKey2 = secureDocumentKey;
                                                        i12 = i32;
                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                        z15 = z18;
                                                        i11 = i12;
                                                        r52 = secureDocumentKey2;
                                                        Thread.interrupted();
                                                        if (BuildVars.LOGS_ENABLED) {
                                                        }
                                                        if (bitmap2 != null) {
                                                        }
                                                        cacheImage = this.cacheImage;
                                                        if (cacheImage == null) {
                                                        }
                                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                                        return;
                                                    }
                                                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                                    options.inDither = false;
                                                    if (l11 != null) {
                                                        if (z12) {
                                                        }
                                                    }
                                                    if (bitmap2 != null) {
                                                    }
                                                } finally {
                                                }
                                            }
                                        } catch (Throwable th30) {
                                            th = th30;
                                        }
                                    }
                                    Thread.interrupted();
                                    if (BuildVars.LOGS_ENABLED && z42) {
                                        StringBuilder sb2 = new StringBuilder("Image Loader image is empty = ");
                                        sb2.append(bitmap2 != null);
                                        sb2.append(" ");
                                        sb2.append(file3);
                                        FileLog.e(sb2.toString());
                                    }
                                    if (bitmap2 != null && !TextUtils.isEmpty(this.cacheImage.filter) && this.cacheImage.filter.contains("wallpaper")) {
                                        obj2 = this.cacheImage.parentObject;
                                        if (obj2 instanceof TLRPC.WallPaper) {
                                            bitmap2 = applyWallpaperSetting(bitmap2, (TLRPC.WallPaper) obj2);
                                        }
                                    }
                                    cacheImage = this.cacheImage;
                                    if ((cacheImage == null && (str3 = cacheImage.filter) != null && str3.contains("ignoreOrientation")) || (!z15 && r52 == 0 && i11 == 0)) {
                                        onPostExecute(bitmap2 != null ? new BitmapDrawable(bitmap2) : null);
                                        return;
                                    } else {
                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                        return;
                                    }
                                }
                                if (!str14.startsWith("http")) {
                                    str = null;
                                    l10 = null;
                                }
                            }
                            z10 = false;
                            z11 = false;
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inSampleSize = 1;
                            boolean z432 = ImageLoader.this.canForce8888;
                            int i322 = 1067030938;
                            i322 = 1067030938;
                            i322 = 1067030938;
                            i322 = 1067030938;
                            str5 = this.cacheImage.filter;
                            if (str5 != null) {
                            }
                            i10 = 1;
                            r14 = z21;
                            float f1422222222 = f11;
                            boolean z4422222222 = z13;
                            if (this.cacheImage.type != i10) {
                            }
                            Thread.interrupted();
                            if (BuildVars.LOGS_ENABLED) {
                                StringBuilder sb22 = new StringBuilder("Image Loader image is empty = ");
                                sb22.append(bitmap2 != null);
                                sb22.append(" ");
                                sb22.append(file3);
                                FileLog.e(sb22.toString());
                            }
                            if (bitmap2 != null) {
                                obj2 = this.cacheImage.parentObject;
                                if (obj2 instanceof TLRPC.WallPaper) {
                                }
                            }
                            cacheImage = this.cacheImage;
                            if (cacheImage == null) {
                            }
                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                            return;
                        }
                        str = null;
                        l10 = null;
                        z10 = false;
                        z11 = true;
                        BitmapFactory.Options options22 = new BitmapFactory.Options();
                        options22.inSampleSize = 1;
                        boolean z4322 = ImageLoader.this.canForce8888;
                        int i3222 = 1067030938;
                        i3222 = 1067030938;
                        i3222 = 1067030938;
                        i3222 = 1067030938;
                        str5 = this.cacheImage.filter;
                        if (str5 != null) {
                        }
                        i10 = 1;
                        r14 = z21;
                        float f14222222222 = f11;
                        boolean z44222222222 = z13;
                        if (this.cacheImage.type != i10) {
                        }
                        Thread.interrupted();
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        if (bitmap2 != null) {
                        }
                        cacheImage = this.cacheImage;
                        if (cacheImage == null) {
                        }
                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                        return;
                    }
                    long j10 = imageLocation.videoSeekTo;
                    String str15 = cacheImage2.filter;
                    if (str15 != null) {
                        String[] split4 = str15.split("_");
                        if (split4.length >= 2) {
                            float parseFloat5 = Float.parseFloat(split4[0]);
                            float parseFloat6 = Float.parseFloat(split4[1]);
                            if (parseFloat5 <= 90.0f && parseFloat6 <= 90.0f && !this.cacheImage.filter.contains("nolimit")) {
                                z25 = true;
                                z32 = false;
                                z26 = false;
                                z27 = false;
                                z28 = false;
                                for (i19 = 0; i19 < split4.length; i19++) {
                                    if ("pcache".equals(split4[i19])) {
                                        z26 = true;
                                    }
                                    if ("firstframe".equals(split4[i19])) {
                                        z32 = true;
                                    }
                                    if ("nostream".equals(split4[i19])) {
                                        z28 = true;
                                    }
                                    if ("pframe".equals(split4[i19])) {
                                        z27 = true;
                                    }
                                }
                                z29 = z32;
                                if (z32) {
                                    z28 = true;
                                }
                            }
                        }
                        z25 = false;
                        z32 = false;
                        z26 = false;
                        z27 = false;
                        z28 = false;
                        while (i19 < split4.length) {
                        }
                        z29 = z32;
                        if (z32) {
                        }
                    } else {
                        z25 = false;
                        z26 = false;
                        z27 = false;
                        z28 = false;
                        z29 = false;
                    }
                    if (z27) {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(this.cacheImage.finalFilePath.getAbsolutePath());
                            bitmap4 = mediaMetadataRetriever.getFrameAtTime(2L);
                        } catch (Exception e14) {
                            e = e14;
                            bitmap4 = null;
                        }
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception e15) {
                            e = e15;
                            e.printStackTrace();
                            Thread.interrupted();
                            if (bitmap4 != null) {
                            }
                        }
                        Thread.interrupted();
                        if (bitmap4 != null) {
                            onPostExecute(null);
                            return;
                        } else {
                            onPostExecute(new BitmapDrawable(bitmap4));
                            return;
                        }
                    }
                    if (!z26 || z29) {
                        iVar = null;
                    } else {
                        ie.i iVar4 = new ie.i();
                        String str16 = this.cacheImage.filter;
                        if (str16 != null && str16.contains("compress")) {
                            iVar4.a = 60;
                        }
                        iVar = iVar4;
                    }
                    if (ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter) || ImageLoader.AUTOPLAY_FILTER.equals(this.cacheImage.filter) || ImageLoader.AUTOPLAY_FILTER_NONLOOP.equals(this.cacheImage.filter)) {
                        TLRPC.Document document = this.cacheImage.imageLocation.document;
                        if (!(document instanceof TLRPC.TL_documentEncrypted) && !z26) {
                            TLRPC.Document document2 = com.google.android.recaptcha.internal.a.u(document) ? this.cacheImage.imageLocation.document : null;
                            CacheImage cacheImage7 = this.cacheImage;
                            long j11 = document2 != null ? cacheImage7.size : cacheImage7.imageLocation.currentSize;
                            int i42 = document2 != null ? 1 : 0;
                            int i43 = this.cacheImage.cacheType;
                            int i44 = i43 > 1 ? i43 : i42;
                            CacheImage cacheImage8 = this.cacheImage;
                            org.telegram.ui.Components.c6 c6Var3 = new org.telegram.ui.Components.c6(cacheImage8.finalFilePath, z29, z28 ? 0L : j11, cacheImage8.priority, z28 ? null : document2, (document2 != null || z28) ? null : cacheImage8.imageLocation, cacheImage8.parentObject, j10, cacheImage8.currentAccount, false, 0, 0, iVar, i44, !ImageLoader.AUTOPLAY_FILTER_NONLOOP.equals(cacheImage8.filter));
                            z30 = z29;
                            boolean z45 = MessageObject.isWebM(document2) || MessageObject.isVideoSticker(document2) || ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter);
                            c6Var3.j0 = z45;
                            if (z45) {
                                c6Var3.b = false;
                                c6Var3.r0 = true;
                            }
                            c6Var = c6Var3;
                            if (!z30) {
                                c6Var.A(z25);
                                Thread.interrupted();
                                onPostExecute(c6Var);
                                return;
                            }
                            Bitmap q6 = c6Var.q(0L, false);
                            c6Var.u();
                            Thread.interrupted();
                            if (q6 == null) {
                                onPostExecute(null);
                                return;
                            } else {
                                onPostExecute(new BitmapDrawable(q6));
                                return;
                            }
                        }
                    }
                    z30 = z29;
                    String str17 = this.cacheImage.filter;
                    if (str17 != null) {
                        String[] split5 = str17.split("_");
                        if (split5.length >= 2) {
                            float parseFloat7 = Float.parseFloat(split5[0]);
                            float parseFloat8 = Float.parseFloat(split5[1]);
                            float f19 = AndroidUtilities.density;
                            i18 = (int) (parseFloat8 * f19);
                            i17 = (int) (parseFloat7 * f19);
                            boolean z46 = !z30 || ((str7 = this.cacheImage.filter) != null && ("d".equals(str7) || this.cacheImage.filter.contains("_d")));
                            int i45 = (!z28 ? null : this.cacheImage.imageLocation.document) == null ? 1 : 0;
                            int i46 = this.cacheImage.cacheType;
                            int i47 = i46 <= 1 ? i46 : i45;
                            CacheImage cacheImage9 = this.cacheImage;
                            c6Var = new org.telegram.ui.Components.c6(cacheImage9.finalFilePath, z46, 0L, cacheImage9.priority, !z28 ? null : cacheImage9.imageLocation.document, null, null, j10, cacheImage9.currentAccount, false, i17, i18, iVar, i47, true);
                            z31 = !MessageObject.isWebM(this.cacheImage.imageLocation.document) || MessageObject.isVideoSticker(this.cacheImage.imageLocation.document) || ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter);
                            c6Var.j0 = z31;
                            if (z31) {
                                c6Var.b = false;
                                c6Var.r0 = true;
                            }
                            if (!z30) {
                            }
                        }
                    }
                    i17 = 0;
                    i18 = 0;
                    if (z30) {
                    }
                    if ((!z28 ? null : this.cacheImage.imageLocation.document) == null) {
                    }
                    int i462 = this.cacheImage.cacheType;
                    if (i462 <= 1) {
                    }
                    CacheImage cacheImage92 = this.cacheImage;
                    c6Var = new org.telegram.ui.Components.c6(cacheImage92.finalFilePath, z46, 0L, cacheImage92.priority, !z28 ? null : cacheImage92.imageLocation.document, null, null, j10, cacheImage92.currentAccount, false, i17, i18, iVar, i47, true);
                    if (MessageObject.isWebM(this.cacheImage.imageLocation.document)) {
                    }
                    c6Var.j0 = z31;
                    if (z31) {
                    }
                    if (!z30) {
                    }
                } finally {
                }
            }
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class HttpFileTask extends AsyncTask<Void, Void, Boolean> {
        private int currentAccount;
        private String ext;
        private int fileSize;
        private long lastProgressTime;
        private File tempFile;
        private String url;
        private RandomAccessFile fileOutputStream = null;
        private boolean canRetry = true;

        public HttpFileTask(String str, File file, String str2, int i10) {
            this.url = str;
            this.tempFile = file;
            this.ext = str2;
            this.currentAccount = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$0(long j10, long j11) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.url, Long.valueOf(j10), Long.valueOf(j11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$1(long j10, long j11) {
            ImageLoader.this.fileProgresses.put(this.url, new long[]{j10, j11});
            AndroidUtilities.runOnUIThread(new d5(this, j10, j11, 0));
        }

        private void reportProgress(long j10, long j11) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j10 != j11) {
                long j12 = this.lastProgressTime;
                if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = elapsedRealtime;
            Utilities.stageQueue.postRunnable(new d5(this, j10, j11, 1));
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            ImageLoader.this.runHttpFileLoadTasks(this, 2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
        
            if (r5 != (-1)) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0138, code lost:
        
            r1 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
        
            r0 = r11.fileSize;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012c, code lost:
        
            if (r0 == 0) goto L115;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x012e, code lost:
        
            reportProgress(r0, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0147 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #10 {all -> 0x014d, blocks: (B:77:0x0143, B:79:0x0147), top: B:76:0x0143 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Boolean doInBackground(Void... voidArr) {
            InputStream inputStream;
            URLConnection uRLConnection;
            InputStream inputStream2;
            List<String> list;
            String str;
            RandomAccessFile randomAccessFile;
            int responseCode;
            boolean z10 = true;
            boolean z11 = false;
            try {
                uRLConnection = new URL(this.url).openConnection();
                try {
                    uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                    uRLConnection.setConnectTimeout(5000);
                    uRLConnection.setReadTimeout(5000);
                    if (uRLConnection instanceof HttpURLConnection) {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                        httpURLConnection.setInstanceFollowRedirects(true);
                        int responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 == 302 || responseCode2 == 301 || responseCode2 == 303) {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
                            uRLConnection = new URL(headerField).openConnection();
                            uRLConnection.setRequestProperty("Cookie", headerField2);
                            uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                        }
                    }
                    uRLConnection.connect();
                    inputStream2 = uRLConnection.getInputStream();
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                uRLConnection = null;
            }
            try {
                this.fileOutputStream = new RandomAccessFile(this.tempFile, "rws");
            } catch (Throwable th4) {
                inputStream = inputStream2;
                th = th4;
                if (th instanceof SocketTimeoutException) {
                    if (ApplicationLoader.isNetworkOnline()) {
                        this.canRetry = false;
                    }
                } else if (th instanceof UnknownHostException) {
                    this.canRetry = false;
                } else if (th instanceof SocketException) {
                    if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                        this.canRetry = false;
                    }
                } else if (th instanceof FileNotFoundException) {
                    this.canRetry = false;
                }
                FileLog.e(th);
                inputStream2 = inputStream;
                if (this.canRetry) {
                }
                return Boolean.valueOf(z11);
            }
            if (this.canRetry) {
                try {
                    if ((uRLConnection instanceof HttpURLConnection) && (responseCode = ((HttpURLConnection) uRLConnection).getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                        this.canRetry = false;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (uRLConnection != null) {
                    try {
                        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
                        if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                            this.fileSize = Utilities.parseInt((CharSequence) str).intValue();
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                if (inputStream2 != null) {
                    try {
                        byte[] bArr = new byte[32768];
                        int i10 = 0;
                        while (true) {
                            try {
                                if (isCancelled()) {
                                    break;
                                }
                                try {
                                    int read = inputStream2.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    this.fileOutputStream.write(bArr, 0, read);
                                    i10 += read;
                                    int i11 = this.fileSize;
                                    if (i11 > 0) {
                                        reportProgress(i10, i11);
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    z10 = false;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                FileLog.e(th);
                                z11 = z10;
                                randomAccessFile = this.fileOutputStream;
                                if (randomAccessFile != null) {
                                }
                                if (inputStream2 != null) {
                                }
                                return Boolean.valueOf(z11);
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z10 = false;
                    }
                    z11 = z10;
                }
                try {
                    randomAccessFile = this.fileOutputStream;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                        this.fileOutputStream = null;
                    }
                } catch (Throwable th7) {
                    FileLog.e(th7);
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable th8) {
                        FileLog.e(th8);
                    }
                }
            }
            return Boolean.valueOf(z11);
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            ImageLoader.this.runHttpFileLoadTasks(this, bool.booleanValue() ? 2 : 1);
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class HttpImageTask extends AsyncTask<Void, Void, Boolean> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private RandomAccessFile fileOutputStream;
        private HttpURLConnection httpConnection;
        private long imageSize;
        private long lastProgressTime;
        private String overrideUrl;

        public HttpImageTask(CacheImage cacheImage, long j10) {
            this.cacheImage = cacheImage;
            this.imageSize = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCancelled$6() {
            ImageLoader.this.runHttpTasks(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCancelled$7() {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCancelled$8() {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new f5(this, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$3(Boolean bool) {
            if (!bool.booleanValue()) {
                NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 2);
                return;
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.cacheImage.currentAccount);
            int i10 = NotificationCenter.fileLoaded;
            CacheImage cacheImage = this.cacheImage;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, cacheImage.url, cacheImage.finalFilePath);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$4(Boolean bool) {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new g5(this, bool, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$5() {
            ImageLoader.this.runHttpTasks(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$0(long j10, long j11) {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.cacheImage.url, Long.valueOf(j10), Long.valueOf(j11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$1(long j10, long j11) {
            ImageLoader.this.fileProgresses.put(this.cacheImage.url, new long[]{j10, j11});
            AndroidUtilities.runOnUIThread(new h5(this, j10, j11, 0));
        }

        private void reportProgress(long j10, long j11) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j10 != j11) {
                long j12 = this.lastProgressTime;
                if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = elapsedRealtime;
            Utilities.stageQueue.postRunnable(new h5(this, j10, j11, 1));
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new f5(this, 0), this.cacheImage.priority);
            Utilities.stageQueue.postRunnable(new f5(this, 1));
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(9:102|103|(6:105|(1:107)|108|(1:110)|111|(15:113|115|116|4|(6:6|7|(1:15)|17|(3:21|22|(1:30))|(5:35|36|37|(2:38|(1:70)(3:40|41|(3:43|(3:45|46|47)(1:49)|48)(1:50)))|54))|74|75|(1:77)|79|80|(1:82)|(2:94|95)|(1:90)|91|92))|143|(1:149)|108|(0)|111|(0))|3|4|(0)|74|75|(0)|79|80|(0)|(0)|(3:86|88|90)|91|92|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x019d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x019e, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
        
            if (r7 != (-1)) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0188, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0176, code lost:
        
            r2 = r12.imageSize;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x017a, code lost:
        
            if (r2 == 0) goto L112;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
        
            reportProgress(r2, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0184, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0185, code lost:
        
            r0 = r2;
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x018a, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x018d, code lost:
        
            r0 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0180, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0181, code lost:
        
            r0 = r2;
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0190, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0090 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #2 {all -> 0x0020, blocks: (B:103:0x0009, B:105:0x0017, B:108:0x0060, B:111:0x0067, B:113:0x0090, B:143:0x0024, B:147:0x0034, B:149:0x0042), top: B:102:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0197 A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #8 {all -> 0x019d, blocks: (B:75:0x0193, B:77:0x0197), top: B:74:0x0193 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a5 A[Catch: all -> 0x01a9, TRY_LEAVE, TryCatch #4 {all -> 0x01a9, blocks: (B:80:0x01a1, B:82:0x01a5), top: B:79:0x01a1 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Boolean doInBackground(Void... voidArr) {
            InputStream inputStream;
            boolean z10;
            InputStream inputStream2;
            String str;
            WebFile webFile;
            String str2;
            CacheImage cacheImage;
            File file;
            HttpURLConnection httpURLConnection;
            RandomAccessFile randomAccessFile;
            HttpURLConnection httpURLConnection2;
            List<String> list;
            String str3;
            int responseCode;
            boolean z11 = true;
            boolean z12 = false;
            if (!isCancelled()) {
                try {
                    str = this.cacheImage.imageLocation.path;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
                if (!str.startsWith("https://static-maps")) {
                    if (str.startsWith("https://maps.googleapis")) {
                    }
                    str2 = this.overrideUrl;
                    if (str2 != null) {
                        str = str2;
                    }
                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
                    this.httpConnection = httpURLConnection3;
                    httpURLConnection3.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                    this.httpConnection.setConnectTimeout(5000);
                    this.httpConnection.setReadTimeout(5000);
                    this.httpConnection.setInstanceFollowRedirects(true);
                    if (!isCancelled()) {
                        this.httpConnection.connect();
                        inputStream2 = this.httpConnection.getInputStream();
                        try {
                            this.fileOutputStream = new RandomAccessFile(this.cacheImage.tempFilePath, "rws");
                        } catch (Throwable th3) {
                            inputStream = inputStream2;
                            th = th3;
                            if (th instanceof SocketTimeoutException) {
                                if (ApplicationLoader.isNetworkOnline()) {
                                    this.canRetry = false;
                                }
                            } else if (th instanceof UnknownHostException) {
                                this.canRetry = false;
                            } else if (th instanceof SocketException) {
                                if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                                    this.canRetry = false;
                                }
                            } else if (th instanceof FileNotFoundException) {
                                this.canRetry = false;
                            } else if (!(th instanceof InterruptedIOException)) {
                                z10 = true;
                                FileLog.e(th, z10);
                                inputStream2 = inputStream;
                                if (!isCancelled()) {
                                }
                                randomAccessFile = this.fileOutputStream;
                                if (randomAccessFile != null) {
                                }
                                httpURLConnection = this.httpConnection;
                                if (httpURLConnection != null) {
                                }
                                if (inputStream2 != null) {
                                }
                                if (z12) {
                                }
                                return Boolean.valueOf(z12);
                            }
                            z10 = false;
                            FileLog.e(th, z10);
                            inputStream2 = inputStream;
                            if (!isCancelled()) {
                            }
                            randomAccessFile = this.fileOutputStream;
                            if (randomAccessFile != null) {
                            }
                            httpURLConnection = this.httpConnection;
                            if (httpURLConnection != null) {
                            }
                            if (inputStream2 != null) {
                            }
                            if (z12) {
                            }
                            return Boolean.valueOf(z12);
                        }
                        if (!isCancelled()) {
                            try {
                                HttpURLConnection httpURLConnection4 = this.httpConnection;
                                if (httpURLConnection4 != null && (responseCode = httpURLConnection4.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                                    this.canRetry = false;
                                }
                            } catch (Exception e10) {
                                FileLog.e((Throwable) e10, false);
                            }
                            if (this.imageSize == 0 && (httpURLConnection2 = this.httpConnection) != null) {
                                try {
                                    Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                                    if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str3 = list.get(0)) != null) {
                                        this.imageSize = Utilities.parseInt((CharSequence) str3).intValue();
                                    }
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                            }
                            if (inputStream2 != null) {
                                try {
                                    byte[] bArr = new byte[8192];
                                    int i10 = 0;
                                    while (true) {
                                        if (isCancelled()) {
                                            break;
                                        }
                                        try {
                                            int read = inputStream2.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            i10 += read;
                                            this.fileOutputStream.write(bArr, 0, read);
                                            long j10 = this.imageSize;
                                            if (j10 != 0) {
                                                reportProgress(i10, j10);
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                        }
                                    }
                                    z12 = z11;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                        randomAccessFile = this.fileOutputStream;
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                            this.fileOutputStream = null;
                        }
                        httpURLConnection = this.httpConnection;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th5) {
                                FileLog.e(th5);
                            }
                        }
                        if (z12 && (file = (cacheImage = this.cacheImage).tempFilePath) != null && !file.renameTo(cacheImage.finalFilePath)) {
                            CacheImage cacheImage2 = this.cacheImage;
                            cacheImage2.finalFilePath = cacheImage2.tempFilePath;
                        }
                        return Boolean.valueOf(z12);
                    }
                }
                int i11 = MessagesController.getInstance(this.cacheImage.currentAccount).mapProvider;
                if ((i11 == 3 || i11 == 4) && (webFile = (WebFile) ImageLoader.this.testWebFile.get(str)) != null) {
                    TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                    tL_upload_getWebFile.location = webFile.location;
                    tL_upload_getWebFile.offset = 0;
                    tL_upload_getWebFile.limit = 0;
                    ConnectionsManager.getInstance(this.cacheImage.currentAccount).sendRequest(tL_upload_getWebFile, new e5(0));
                }
                str2 = this.overrideUrl;
                if (str2 != null) {
                }
                HttpURLConnection httpURLConnection32 = (HttpURLConnection) new URL(str).openConnection();
                this.httpConnection = httpURLConnection32;
                httpURLConnection32.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                this.httpConnection.setConnectTimeout(5000);
                this.httpConnection.setReadTimeout(5000);
                this.httpConnection.setInstanceFollowRedirects(true);
                if (!isCancelled()) {
                }
            }
            inputStream2 = null;
            if (!isCancelled()) {
            }
            randomAccessFile = this.fileOutputStream;
            if (randomAccessFile != null) {
            }
            httpURLConnection = this.httpConnection;
            if (httpURLConnection != null) {
            }
            if (inputStream2 != null) {
            }
            if (z12) {
                CacheImage cacheImage22 = this.cacheImage;
                cacheImage22.finalFilePath = cacheImage22.tempFilePath;
            }
            return Boolean.valueOf(z12);
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue() || !this.canRetry) {
                ImageLoader imageLoader = ImageLoader.this;
                CacheImage cacheImage = this.cacheImage;
                imageLoader.fileDidLoaded(cacheImage.url, cacheImage.finalFilePath, 0);
            } else {
                ImageLoader.this.httpFileLoadError(this.cacheImage.url);
            }
            Utilities.stageQueue.postRunnable(new g5(this, bool, 1));
            ImageLoader.this.imageLoadQueue.postRunnable(new f5(this, 2), this.cacheImage.priority);
        }

        public HttpImageTask(CacheImage cacheImage, int i10, String str) {
            this.cacheImage = cacheImage;
            this.imageSize = i10;
            this.overrideUrl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$doInBackground$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class MessageThumb {
        BitmapDrawable drawable;
        String key;

        public MessageThumb(String str, BitmapDrawable bitmapDrawable) {
            this.key = str;
            this.drawable = bitmapDrawable;
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class PhotoSizeFromPhoto extends TLRPC.PhotoSize {
        public final TLRPC.InputPhoto inputPhoto;
        public final TLRPC.Photo photo;

        public PhotoSizeFromPhoto(TLRPC.Photo photo) {
            this.photo = photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.file_reference = photo.file_reference;
            tL_inputPhoto.access_hash = photo.access_hash;
            this.inputPhoto = tL_inputPhoto;
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static class ThumbGenerateInfo {
        private boolean big;
        private String filter;
        private ArrayList<ImageReceiver> imageReceiverArray;
        private ArrayList<Integer> imageReceiverGuidsArray;
        private TLRPC.Document parentDocument;

        private ThumbGenerateInfo() {
            this.imageReceiverArray = new ArrayList<>();
            this.imageReceiverGuidsArray = new ArrayList<>();
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class ThumbGenerateTask implements Runnable {
        private ThumbGenerateInfo info;
        private int mediaType;
        private File originalPath;

        public ThumbGenerateTask(int i10, File file, ThumbGenerateInfo thumbGenerateInfo) {
            this.mediaType = i10;
            this.originalPath = file;
            this.info = thumbGenerateInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$removeTask$0(String str) {
            ImageLoader.this.thumbGenerateTasks.remove(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
            removeTask();
            if (this.info.filter != null) {
                StringBuilder f9 = u3.c.f(str, "@");
                f9.append(this.info.filter);
                str = f9.toString();
            }
            String str2 = str;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ImageReceiver) arrayList.get(i10)).setImageBitmapByKey(bitmapDrawable, str2, 0, false, ((Integer) arrayList2.get(i10)).intValue());
            }
            if (str2.contains("nocache")) {
                return;
            }
            ImageLoader.this.memCache.put(str2, bitmapDrawable);
        }

        private void removeTask() {
            ThumbGenerateInfo thumbGenerateInfo = this.info;
            if (thumbGenerateInfo == null) {
                return;
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new d3(4, this, FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)));
        }

        @Override // java.lang.Runnable
        public void run() {
            int min;
            Bitmap createScaledBitmap;
            try {
                if (this.info == null) {
                    removeTask();
                    return;
                }
                String str = "q_" + this.info.parentDocument.dc_id + "_" + this.info.parentDocument.id;
                File file = new File(FileLoader.getDirectory(4), str + ".jpg");
                if (!file.exists() && this.originalPath.exists()) {
                    if (this.info.big) {
                        Point point = AndroidUtilities.displaySize;
                        min = Math.max(point.x, point.y);
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                    }
                    int i10 = this.mediaType;
                    Bitmap bitmap = null;
                    if (i10 == 0) {
                        float f9 = min;
                        bitmap = ImageLoader.loadBitmap(this.originalPath.toString(), null, f9, f9, false);
                    } else {
                        int i11 = 2;
                        if (i10 == 2) {
                            String file2 = this.originalPath.toString();
                            if (!this.info.big) {
                                i11 = 1;
                            }
                            bitmap = SendMessagesHelper.createVideoThumbnail(file2, i11);
                        } else if (i10 == 3) {
                            String lowerCase = this.originalPath.toString().toLowerCase();
                            if (lowerCase.endsWith("mp4")) {
                                String file3 = this.originalPath.toString();
                                if (!this.info.big) {
                                    i11 = 1;
                                }
                                bitmap = SendMessagesHelper.createVideoThumbnail(file3, i11);
                            } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                                float f10 = min;
                                bitmap = ImageLoader.loadBitmap(lowerCase, null, f10, f10, false);
                            }
                        }
                    }
                    if (bitmap == null) {
                        removeTask();
                        return;
                    }
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width != 0 && height != 0) {
                        float f11 = width;
                        float f12 = min;
                        float f13 = height;
                        float min2 = Math.min(f11 / f12, f13 / f12);
                        if (min2 > 1.0f && (createScaledBitmap = Bitmaps.createScaledBitmap(bitmap, (int) (f11 / min2), (int) (f13 / min2), true)) != bitmap) {
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, this.info.big ? 83 : 60, fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new c5(this, str, new ArrayList(this.info.imageReceiverArray), new BitmapDrawable(bitmap), new ArrayList(this.info.imageReceiverGuidsArray)));
                        return;
                    }
                    removeTask();
                    return;
                }
                removeTask();
            } catch (Throwable th2) {
                FileLog.e(th2);
                removeTask();
            }
        }
    }

    public ImageLoader() {
        pe.c cVar = new pe.c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cVar.a = new pe.a(cVar, new PriorityBlockingQueue(10, new d2.a(6)));
        this.cacheOutQueue = cVar;
        this.cacheThumbOutQueue = new DispatchQueue("cacheThumbOutQueue");
        this.thumbGeneratingQueue = new DispatchQueue("thumbGeneratingQueue");
        this.imageLoadQueue = new DispatchQueue("imageLoadQueue");
        this.replacedBitmaps = new HashMap<>();
        this.fileProgresses = new ConcurrentHashMap<>();
        this.thumbGenerateTasks = new HashMap<>();
        this.forceLoadingImages = new HashMap<>();
        this.currentHttpTasksCount = 0;
        this.currentArtworkTasksCount = 0;
        this.testWebFile = new ConcurrentHashMap<>();
        this.httpFileLoadTasks = new LinkedList<>();
        this.httpFileLoadTasksByKeys = new HashMap<>();
        this.retryHttpsTasks = new HashMap<>();
        this.currentHttpFileLoadTasksCount = 0;
        this.ignoreRemoval = null;
        this.lastCacheOutTime = 0L;
        this.lastImageNum = 0;
        this.telegramPath = null;
        this.thumbGeneratingQueue.setPriority(1);
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        boolean z10 = memoryClass >= 192;
        this.canForce8888 = z10;
        int min = Math.min(z10 ? 30 : 15, memoryClass / 7) * 1048576;
        float f9 = min;
        this.memCache = new LruCache<BitmapDrawable>((int) (0.8f * f9)) { // from class: org.telegram.messenger.ImageLoader.1
            @Override // org.telegram.messenger.LruCache
            public void entryRemoved(boolean z11, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                if (ImageLoader.this.ignoreRemoval == null || !ImageLoader.this.ignoreRemoval.equals(str)) {
                    Integer num = (Integer) ImageLoader.this.bitmapUseCounts.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(bitmap);
                        AndroidUtilities.recycleBitmaps(arrayList);
                    }
                }
            }

            @Override // org.telegram.messenger.LruCache
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.smallImagesMemCache = new LruCache<BitmapDrawable>((int) (f9 * 0.2f)) { // from class: org.telegram.messenger.ImageLoader.2
            @Override // org.telegram.messenger.LruCache
            public void entryRemoved(boolean z11, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                if (ImageLoader.this.ignoreRemoval == null || !ImageLoader.this.ignoreRemoval.equals(str)) {
                    Integer num = (Integer) ImageLoader.this.bitmapUseCounts.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(bitmap);
                        AndroidUtilities.recycleBitmaps(arrayList);
                    }
                }
            }

            @Override // org.telegram.messenger.LruCache
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.wallpaperMemCache = new LruCache<BitmapDrawable>(min / 4) { // from class: org.telegram.messenger.ImageLoader.3
            @Override // org.telegram.messenger.LruCache
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.lottieMemCache = new LruCache<BitmapDrawable>(10485760) { // from class: org.telegram.messenger.ImageLoader.4
            @Override // org.telegram.messenger.LruCache
            public void entryRemoved(boolean z11, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                Integer num = (Integer) ImageLoader.this.bitmapUseCounts.get(str);
                boolean z12 = bitmapDrawable instanceof org.telegram.ui.Components.c6;
                if (z12) {
                    ImageLoader.this.cachedAnimatedFileDrawables.remove((org.telegram.ui.Components.c6) bitmapDrawable);
                }
                if (num == null || num.intValue() == 0) {
                    if (z12) {
                        ((org.telegram.ui.Components.c6) bitmapDrawable).u();
                    }
                    if (bitmapDrawable instanceof xi0) {
                        ((xi0) bitmapDrawable).A(false);
                    }
                }
            }

            @Override // org.telegram.messenger.LruCache
            public BitmapDrawable put(String str, BitmapDrawable bitmapDrawable) {
                if (bitmapDrawable instanceof org.telegram.ui.Components.c6) {
                    ImageLoader.this.cachedAnimatedFileDrawables.add((org.telegram.ui.Components.c6) bitmapDrawable);
                }
                return (BitmapDrawable) super.put(str, (String) bitmapDrawable);
            }

            @Override // org.telegram.messenger.LruCache
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        SparseArray sparseArray = new SparseArray();
        File cacheDir = AndroidUtilities.getCacheDir();
        if (!cacheDir.isDirectory()) {
            try {
                cacheDir.mkdirs();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        for (int i10 = 0; i10 < 4; i10++) {
            FileLoader.getInstance(i10).setDelegate(new 5(i10));
        }
        FileLoader.setMediaDirs(sparseArray);
        6 r02 = new 6();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_NOFS");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationLoader.applicationContext.registerReceiver(r02, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(r02, intentFilter);
            }
        } catch (Throwable unused) {
        }
        checkMediaPaths();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void artworkLoadError(String str) {
        this.imageLoadQueue.postRunnable(new q4(this, str, 0));
    }

    private boolean canMoveFiles(File file, File file2, int i10) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i10 == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    if (i10 != 3 && i10 != 5 && i10 != 6) {
                        if (i10 == 1) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else if (i10 == 2) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else {
                            file4 = null;
                            file3 = null;
                        }
                    }
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                }
                bArr = new byte[1024];
                file3.createNewFile();
                randomAccessFile = new RandomAccessFile(file3, "rws");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            boolean renameTo = file3.renameTo(file4);
            file3.delete();
            file4.delete();
            return renameTo;
        } catch (Exception e11) {
            e = e11;
            randomAccessFile2 = randomAccessFile;
            FileLog.e(e);
            if (randomAccessFile2 == null) {
                return false;
            }
            try {
                randomAccessFile2.close();
                return false;
            } catch (Exception e12) {
                FileLog.e(e12);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            throw th;
        }
    }

    private void createLoadOperationForImageReceiver(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ImageLocation imageLocation, final String str4, final long j10, final int i10, final int i11, final int i12, final int i13) {
        if (imageReceiver == null || str2 == null || str == null || imageLocation == null) {
            return;
        }
        int tag = imageReceiver.getTag(i11);
        if (tag == 0) {
            tag = this.lastImageNum;
            imageReceiver.setTag(tag, i11);
            int i14 = this.lastImageNum + 1;
            this.lastImageNum = i14;
            if (i14 == Integer.MAX_VALUE) {
                this.lastImageNum = 0;
            }
        }
        final int i15 = tag;
        final boolean isNeedsQualityThumb = imageReceiver.isNeedsQualityThumb();
        final Object parentObject = imageReceiver.getParentObject();
        final TLRPC.Document qualityThumbDocument = imageReceiver.getQualityThumbDocument();
        final boolean isShouldGenerateQualityThumb = imageReceiver.isShouldGenerateQualityThumb();
        final int currentAccount = imageReceiver.getCurrentAccount();
        final boolean z10 = i11 == 0 && imageReceiver.isCurrentKeyQuality();
        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.s4
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.this.lambda$createLoadOperationForImageReceiver$7(i12, str2, str, i15, imageReceiver, i13, str4, i11, imageLocation, z10, parentObject, currentAccount, qualityThumbDocument, isNeedsQualityThumb, isShouldGenerateQualityThumb, str3, i10, j10);
            }
        };
        this.imageLoadQueue.postRunnable(runnable, imageReceiver.getFileLoadingPriority() == 0 ? 0L : 1L);
        imageReceiver.addLoadingImageRunnable(runnable);
    }

    public static Drawable createStripedBitmap(ArrayList<TLRPC.PhotoSize> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), getStrippedPhotoBitmap(((TLRPC.TL_photoStrippedSize) arrayList.get(i10)).bytes, "b"));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cutFilter(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public static String decompressGzip(File file) {
        StringBuilder sb2 = new StringBuilder();
        if (file == null) {
            return "";
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file));
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            String sb3 = sb2.toString();
                            bufferedReader.close();
                            gZIPInputStream.close();
                            return sb3;
                        }
                        sb2.append(readLine);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fileDidFailedLoad(String str, int i10) {
        if (i10 == 1) {
            return;
        }
        this.imageLoadQueue.postRunnable(new q4(this, str, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fileDidLoaded(String str, File file, int i10) {
        this.imageLoadQueue.postRunnable(new h0(this, str, i10, file, 4));
    }

    public static TLRPC.PhotoSize fileToSize(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.w = i10;
            tL_photoSize_layer127.h = i11;
            if (i10 <= 100 && i11 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i10 <= 320 && i11 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i10 <= 800 && i11 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i10 > 1280 || i11 > 1280) {
                tL_photoSize_layer127.type = "w";
            } else {
                tL_photoSize_layer127.type = "y";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_fileLocationToBeDeprecated.volume_id);
            sb2.append("_");
            File file = new File(z10 ? FileLoader.getDirectory(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? FileLoader.getDirectory(0) : FileLoader.getDirectory(4), a4.w.l(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb2));
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static void fillPhotoSizeWithBytes(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSize, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        byte[] bArr2 = new byte[(int) randomAccessFile.length()];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, bArr2.length);
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        }
    }

    private Drawable findInPreloadImageReceivers(String str, List<ImageReceiver> list) {
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ImageReceiver imageReceiver = list.get(i10);
            if (str.equals(imageReceiver.getImageKey())) {
                return imageReceiver.getImageDrawable();
            }
            if (str.equals(imageReceiver.getMediaKey())) {
                return imageReceiver.getMediaDrawable();
            }
        }
        return null;
    }

    private static TLRPC.PhotoSize findPhotoCachedSize(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i10 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i10 < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i10);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i10++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i10 < size2) {
                TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i10);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i10++;
            }
            return null;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage)) {
            if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
                return ((TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0)).thumb;
            }
            return null;
        }
        TLRPC.Photo photo = messageMedia.webpage.photo;
        if (photo == null) {
            return null;
        }
        int size3 = photo.sizes.size();
        while (i10 < size3) {
            TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i10);
            if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                return photoSize3;
            }
            i10++;
        }
        return null;
    }

    public static MessageThumb generateMessageThumb(TLRPC.Message message) {
        int i10;
        int i11;
        Bitmap strippedPhotoBitmap;
        byte[] bArr;
        TLRPC.PhotoSize findPhotoCachedSize = findPhotoCachedSize(message);
        if (findPhotoCachedSize == null || (bArr = findPhotoCachedSize.bytes) == null || bArr.length == 0) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i12);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(message.media.document.thumbs, 320);
                        if (closestPhotoSizeWithSize == null) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= message.media.document.attributes.size()) {
                                    i10 = 0;
                                    i11 = 0;
                                    break;
                                }
                                if (message.media.document.attributes.get(i13) instanceof TLRPC.TL_documentAttributeVideo) {
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i13);
                                    i11 = tL_documentAttributeVideo.h;
                                    i10 = tL_documentAttributeVideo.w;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            i11 = closestPhotoSizeWithSize.h;
                            i10 = closestPhotoSizeWithSize.w;
                        }
                        PointF C2 = org.telegram.ui.Cells.s1.C2(i10, i11, 0, 0);
                        Locale locale = Locale.US;
                        String str = ImageLocation.getStrippedKey(message, message, photoSize) + "_false@" + ((int) (C2.x / AndroidUtilities.density)) + "_" + ((int) (C2.y / AndroidUtilities.density)) + "_b";
                        if (!getInstance().isInMemCache(str, false) && (strippedPhotoBitmap = getStrippedPhotoBitmap(photoSize.bytes, null)) != null) {
                            Utilities.blurBitmap(strippedPhotoBitmap, 3);
                            float f9 = C2.x;
                            float f10 = AndroidUtilities.density;
                            Bitmap createScaledBitmap = Bitmaps.createScaledBitmap(strippedPhotoBitmap, (int) (f9 / f10), (int) (C2.y / f10), true);
                            if (createScaledBitmap != strippedPhotoBitmap) {
                                strippedPhotoBitmap.recycle();
                                strippedPhotoBitmap = createScaledBitmap;
                            }
                            return new MessageThumb(str, new BitmapDrawable(strippedPhotoBitmap));
                        }
                    }
                }
            }
        } else {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = findPhotoCachedSize.w;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.size = findPhotoCachedSize.size;
            tL_photoSize_layer127.type = findPhotoCachedSize.type;
            if (pathToAttach.exists() && message.grouped_id == 0) {
                PointF C22 = org.telegram.ui.Cells.s1.C2(findPhotoCachedSize.w, findPhotoCachedSize.h, 0, 0);
                Locale locale2 = Locale.US;
                String str2 = findPhotoCachedSize.location.volume_id + "_" + findPhotoCachedSize.location.local_id + "@" + ((int) (C22.x / AndroidUtilities.density)) + "_" + ((int) (C22.y / AndroidUtilities.density)) + "_b";
                if (!getInstance().isInMemCache(str2, false)) {
                    String path = pathToAttach.getPath();
                    float f11 = C22.x;
                    float f12 = AndroidUtilities.density;
                    Bitmap loadBitmap = loadBitmap(path, null, (int) (f11 / f12), (int) (C22.y / f12), false);
                    if (loadBitmap != null) {
                        Utilities.blurBitmap(loadBitmap, 3);
                        float f13 = C22.x;
                        float f14 = AndroidUtilities.density;
                        Bitmap createScaledBitmap2 = Bitmaps.createScaledBitmap(loadBitmap, (int) (f13 / f14), (int) (C22.y / f14), true);
                        if (createScaledBitmap2 != loadBitmap) {
                            loadBitmap.recycle();
                            loadBitmap = createScaledBitmap2;
                        }
                        return new MessageThumb(str2, new BitmapDrawable(loadBitmap));
                    }
                }
            }
        }
        return null;
    }

    private void generateThumb(int i10, File file, ThumbGenerateInfo thumbGenerateInfo) {
        if ((i10 != 0 && i10 != 2 && i10 != 3) || file == null || thumbGenerateInfo == null) {
            return;
        }
        if (this.thumbGenerateTasks.get(FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)) == null) {
            this.thumbGeneratingQueue.postRunnable(new ThumbGenerateTask(i10, file, thumbGenerateInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BitmapDrawable getFromLottieCache(String str) {
        BitmapDrawable bitmapDrawable = this.lottieMemCache.get(str);
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.c6)) {
            return bitmapDrawable;
        }
        org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) bitmapDrawable;
        if (!c6Var.Y && c6Var.C0 < 15) {
            return bitmapDrawable;
        }
        this.lottieMemCache.remove(str);
        return null;
    }

    public static String getHttpFileName(String str) {
        return Utilities.MD5(str);
    }

    public static File getHttpFilePath(String str, String str2) {
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        return new File(FileLoader.getDirectory(4), Utilities.MD5(str) + "." + httpUrlExtension);
    }

    public static String getHttpUrlExtension(String str, String str2) {
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.length() > 1) {
            str = lastPathSegment;
        }
        int lastIndexOf = str.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : null;
        return (substring == null || substring.length() == 0 || substring.length() > 4) ? str2 : substring;
    }

    public static ImageLoader getInstance() {
        ImageLoader imageLoader;
        ImageLoader imageLoader2 = Instance;
        if (imageLoader2 != null) {
            return imageLoader2;
        }
        synchronized (ImageLoader.class) {
            try {
                imageLoader = Instance;
                if (imageLoader == null) {
                    imageLoader = new ImageLoader();
                    Instance = imageLoader;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return imageLoader;
    }

    private File getPublicStorageDir() {
        File file = ApplicationLoader.applicationContext.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            for (int i10 = 0; i10 < ApplicationLoader.applicationContext.getExternalMediaDirs().length; i10++) {
                File file2 = ApplicationLoader.applicationContext.getExternalMediaDirs()[i10];
                if (file2 != null && file2.getPath().startsWith(SharedConfig.storageCacheDir)) {
                    file = ApplicationLoader.applicationContext.getExternalMediaDirs()[i10];
                }
            }
        }
        return file;
    }

    public static Bitmap getStrippedPhotoBitmap(byte[] bArr, String str) {
        int length = (bArr.length - 3) + Bitmaps.header.length + Bitmaps.footer.length;
        byte[] bArr2 = bytesLocal.get();
        if (bArr2 == null || bArr2.length < length) {
            bArr2 = null;
        }
        if (bArr2 == null) {
            bArr2 = new byte[length];
            bytesLocal.set(bArr2);
        }
        byte[] bArr3 = Bitmaps.header;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(bArr, 3, bArr2, Bitmaps.header.length, bArr.length - 3);
        byte[] bArr4 = Bitmaps.footer;
        System.arraycopy(bArr4, 0, bArr2, (Bitmaps.header.length + bArr.length) - 3, bArr4.length);
        bArr2[164] = bArr[1];
        bArr2[166] = bArr[2];
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z10 = !TextUtils.isEmpty(str) && str.contains("r");
        options.inPreferredConfig = (SharedConfig.deviceIsHigh() || z10) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, length, options);
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray.getWidth(), decodeByteArray.getHeight(), decodeByteArray.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(1.2f, 1.2f, decodeByteArray.getWidth() / 2.0f, decodeByteArray.getHeight() / 2.0f);
            canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            Path path = new Path();
            path.addCircle(decodeByteArray.getWidth() / 2.0f, decodeByteArray.getHeight() / 2.0f, Math.min(decodeByteArray.getWidth(), decodeByteArray.getHeight()) / 2.0f, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
            decodeByteArray.recycle();
            decodeByteArray = createBitmap;
        }
        if (decodeByteArray != null && !TextUtils.isEmpty(str) && str.contains("b")) {
            Utilities.blurBitmap(decodeByteArray, 3);
        }
        return decodeByteArray;
    }

    public static boolean hasAutoplayFilter(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split("_");
        for (int i10 = 0; i10 < split.length; i10++) {
            if (AUTOPLAY_FILTER.equals(split[i10]) || AUTOPLAY_FILTER_NONLOOP.equals(split[i10]) || "pframe".equals(split[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void httpFileLoadError(String str) {
        this.imageLoadQueue.postRunnable(new q4(this, str, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAnimatedAvatar(String str) {
        return str != null && str.endsWith("avatar");
    }

    private boolean isPFrame(String str) {
        return str != null && str.endsWith("pframe");
    }

    public static boolean isSdCardPath(File file) {
        return !TextUtils.isEmpty(SharedConfig.storageCacheDir) && file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$artworkLoadError$10(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        ArtworkLoadTask artworkLoadTask = cacheImage.artworkTask;
        if (artworkLoadTask != null) {
            ArtworkLoadTask artworkLoadTask2 = new ArtworkLoadTask(artworkLoadTask.cacheImage);
            cacheImage.artworkTask = artworkLoadTask2;
            this.artworkTasks.add(artworkLoadTask2);
        }
        runArtworkTasks(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelForceLoadingForImageReceiver$6(String str) {
        this.forceLoadingImages.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelLoadingForImageReceiver$4(boolean z10, ImageReceiver imageReceiver) {
        int i10 = 0;
        while (true) {
            int i11 = 3;
            if (i10 >= 3) {
                return;
            }
            if (i10 > 0 && !z10) {
                return;
            }
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 1) {
                i11 = 0;
            }
            int tag = imageReceiver.getTag(i11);
            if (tag != 0) {
                if (i10 == 0) {
                    removeFromWaitingForThumb(tag, imageReceiver);
                }
                CacheImage cacheImage = this.imageLoadingByTag.get(tag);
                if (cacheImage != null) {
                    cacheImage.removeImageReceiver(imageReceiver);
                }
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeFileLoadingPriorityForImageReceiver$3(ImageReceiver imageReceiver, int i10) {
        CacheImage cacheImage;
        int i11 = 0;
        while (true) {
            int i12 = 3;
            if (i11 >= 3) {
                return;
            }
            if (i11 == 0) {
                i12 = 1;
            } else if (i11 == 1) {
                i12 = 0;
            }
            int tag = imageReceiver.getTag(i12);
            if (tag != 0 && (cacheImage = this.imageLoadingByTag.get(tag)) != null) {
                cacheImage.changePriority(i10);
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkMediaPaths$0(SparseArray sparseArray, Runnable runnable) {
        FileLoader.setMediaDirs(sparseArray);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkMediaPaths$1(Runnable runnable) {
        AndroidUtilities.runOnUIThread(new c2(14, createMediaPaths(), runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04b0, code lost:
    
        if (r4.equals(r6) != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04bd, code lost:
    
        if (r12.exists() == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0199, code lost:
    
        if (r2.exists() == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0558  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$createLoadOperationForImageReceiver$7(int i10, String str, String str2, int i11, ImageReceiver imageReceiver, int i12, String str3, int i13, ImageLocation imageLocation, boolean z10, Object obj, int i14, TLRPC.Document document, boolean z11, boolean z12, String str4, int i15, long j10) {
        String str5;
        int i16;
        boolean z13;
        String str6;
        String str7;
        int i17;
        boolean z14;
        boolean z15;
        int i18;
        File file;
        boolean z16;
        int i19;
        String str8;
        File file2;
        File file3;
        File file4;
        String str9;
        int i20;
        boolean z17;
        long j11;
        int i21;
        int i22;
        String str10;
        String str11;
        long j12;
        String str12;
        String str13;
        String str14;
        String str15;
        int i23;
        boolean z18;
        CacheImage cacheImage;
        CacheImage cacheImage2;
        boolean z19;
        ImageReceiver imageReceiver2 = imageReceiver;
        TLRPC.Document document2 = document;
        if (i10 != 2) {
            CacheImage cacheImage3 = this.imageLoadingByUrl.get(str);
            CacheImage cacheImage4 = this.imageLoadingByKeys.get(str2);
            CacheImage cacheImage5 = this.imageLoadingByTag.get(i11);
            if (cacheImage5 != null) {
                if (cacheImage5 == cacheImage4) {
                    cacheImage5.setImageReceiverGuid(imageReceiver2, i12);
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    i16 = 0;
                } else if (cacheImage5 == cacheImage3) {
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    i16 = 0;
                    if (cacheImage4 == null) {
                        cacheImage5.replaceImageReceiver(imageReceiver2, str2, str3, i13, i12);
                    }
                } else {
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    i16 = 0;
                    cacheImage5.removeImageReceiver(imageReceiver2);
                }
                z19 = true;
                if (!z19 && cacheImage2 != null) {
                    cacheImage2.addImageReceiver(imageReceiver2, str2, str3, i13, i12);
                    z19 = true;
                }
                if (!z19 || cacheImage == null) {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    z13 = z19;
                } else {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    cacheImage.addImageReceiver(imageReceiver2, str2, str5, i13, i12);
                    z13 = true;
                }
            } else {
                cacheImage = cacheImage3;
                cacheImage2 = cacheImage4;
                i16 = 0;
            }
            z19 = false;
            if (!z19) {
                cacheImage2.addImageReceiver(imageReceiver2, str2, str3, i13, i12);
                z19 = true;
            }
            if (z19) {
            }
            imageReceiver2 = imageReceiver;
            str5 = str3;
            z13 = z19;
        } else {
            str5 = str3;
            i16 = 0;
            z13 = false;
        }
        if (z13) {
            return;
        }
        String str16 = imageLocation.path;
        if (str16 != null) {
            if (str16.startsWith("http") || str16.startsWith("athumb")) {
                z15 = false;
                file = null;
            } else if (str16.startsWith("thumb://")) {
                int indexOf = str16.indexOf(":", 8);
                if (indexOf >= 0) {
                    file = new File(str16.substring(indexOf + 1));
                    z15 = true;
                }
                file = null;
                z15 = true;
            } else {
                if (str16.startsWith("vthumb://")) {
                    int indexOf2 = str16.indexOf(":", 9);
                    if (indexOf2 >= 0) {
                        file = new File(str16.substring(indexOf2 + 1));
                    }
                    file = null;
                } else {
                    file = new File(str16);
                }
                z15 = true;
            }
            i17 = i10;
            str6 = "athumb";
            str7 = "_";
            z14 = false;
        } else {
            if (i10 == 0 && z10) {
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    TLRPC.Document document3 = messageObject.getDocument();
                    str8 = messageObject.messageOwner.attachPath;
                    str6 = "athumb";
                    document2 = document3;
                    file2 = FileLoader.getInstance(i14).getPathToMessage(messageObject.messageOwner);
                    i19 = messageObject.getMediaType();
                    z16 = false;
                } else {
                    str6 = "athumb";
                    if (document2 != null) {
                        File pathToAttach = FileLoader.getInstance(i14).getPathToAttach(document2, true);
                        i19 = MessageObject.isVideoDocument(document2) ? 2 : 3;
                        file2 = pathToAttach;
                        z16 = true;
                        str8 = null;
                    } else {
                        z16 = false;
                        i19 = 0;
                        document2 = null;
                        str8 = null;
                        file2 = null;
                    }
                }
                if (document2 != null) {
                    if (z11) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb2 = new StringBuilder("q_");
                        sb2.append(document2.dc_id);
                        sb2.append("_");
                        str7 = "_";
                        file3 = new File(directory, a4.w.p(sb2, document2.id, ".jpg"));
                        if (file3.exists()) {
                            z14 = true;
                            if (!TextUtils.isEmpty(str8)) {
                                file4 = new File(str8);
                            }
                            file4 = null;
                            if (file4 == null) {
                                file4 = file2;
                            }
                            if (file3 != null) {
                                String attachFileName = FileLoader.getAttachFileName(document2);
                                ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(attachFileName);
                                if (thumbGenerateInfo == null) {
                                    thumbGenerateInfo = new ThumbGenerateInfo();
                                    thumbGenerateInfo.parentDocument = document2;
                                    thumbGenerateInfo.filter = str5;
                                    thumbGenerateInfo.big = z16;
                                    this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                                }
                                if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver2)) {
                                    thumbGenerateInfo.imageReceiverArray.add(imageReceiver2);
                                    thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i12));
                                }
                                this.waitingForQualityThumbByTag.put(i11, attachFileName);
                                if (file4.exists() && z12) {
                                    generateThumb(i19, file4, thumbGenerateInfo);
                                    return;
                                }
                                return;
                            }
                            i17 = i10;
                            file = file3;
                            z15 = true;
                        }
                    } else {
                        str7 = "_";
                    }
                    z14 = false;
                    file3 = null;
                    if (!TextUtils.isEmpty(str8)) {
                    }
                    file4 = null;
                    if (file4 == null) {
                    }
                    if (file3 != null) {
                    }
                } else {
                    str7 = "_";
                    i17 = i10;
                    z14 = false;
                    z15 = true;
                }
            } else {
                str6 = "athumb";
                str7 = "_";
                i17 = i10;
                z14 = false;
                z15 = false;
            }
            i18 = 2;
            file = null;
            if (i17 != i18) {
                return;
            }
            boolean isEncrypted = imageLocation.isEncrypted();
            boolean z20 = z15;
            CacheImage cacheImage6 = new CacheImage();
            cacheImage6.priority = imageReceiver2.getFileLoadingPriority() == 0 ? 0 : 1;
            if (!z10) {
                if (imageLocation.imageType == i18 || MessageObject.isGifDocument(imageLocation.webFile) || MessageObject.isGifDocument(imageLocation.document) || MessageObject.isRoundVideoDocument(imageLocation.document) || MessageObject.isVideoSticker(imageLocation.document)) {
                    cacheImage6.imageType = i18;
                } else {
                    String str17 = imageLocation.path;
                    if (str17 != null && !str17.startsWith("vthumb") && !str17.startsWith("thumb")) {
                        String httpUrlExtension = getHttpUrlExtension(str17, "jpg");
                        if (httpUrlExtension.equalsIgnoreCase("webm") || httpUrlExtension.equalsIgnoreCase("mp4") || httpUrlExtension.equalsIgnoreCase("gif")) {
                            cacheImage6.imageType = i18;
                        } else if ("tgs".equals(str4)) {
                            cacheImage6.imageType = 1;
                        }
                    }
                }
            }
            if (file == null) {
                TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                j11 = 0;
                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                    str9 = str;
                    boolean z21 = z14;
                    str10 = AUTOPLAY_FILTER_NONLOOP;
                    str11 = AUTOPLAY_FILTER;
                    i20 = i15;
                    z14 = z21;
                    j12 = 0;
                    z17 = true;
                } else {
                    SecureDocument secureDocument = imageLocation.secureDocument;
                    if (secureDocument != null) {
                        cacheImage6.secureDocument = secureDocument;
                        boolean z22 = secureDocument.secureFile.dc_id == Integer.MIN_VALUE;
                        str9 = str;
                        file = new File(FileLoader.getDirectory(4), str9);
                        z17 = z22;
                        str10 = AUTOPLAY_FILTER_NONLOOP;
                        str11 = AUTOPLAY_FILTER;
                    } else {
                        str9 = str;
                        boolean z23 = z14;
                        if (AUTOPLAY_FILTER.equals(str5) || AUTOPLAY_FILTER_NONLOOP.equals(str5) || isAnimatedAvatar(str5)) {
                            str12 = "application/x-tgwallpattern";
                        } else if (i15 != 0 || j10 <= 0 || imageLocation.path != null || isEncrypted) {
                            File file5 = new File(FileLoader.getDirectory(4), str9);
                            if (file5.exists()) {
                                i23 = i15;
                                z18 = true;
                            } else {
                                i23 = i15;
                                if (i23 == 2) {
                                    file5 = new File(FileLoader.getDirectory(4), u3.c.k(str9, ".enc"));
                                }
                                z18 = z23;
                            }
                            TLRPC.Document document4 = imageLocation.document;
                            boolean z24 = z18;
                            if (document4 != null) {
                                if (document4 instanceof DocumentObject.ThemeDocument) {
                                    if (((DocumentObject.ThemeDocument) document4).wallpaper == null) {
                                        z20 = true;
                                    }
                                    cacheImage6.imageType = 5;
                                } else if ("application/x-tgsdice".equals(document4.mime_type)) {
                                    cacheImage6.imageType = 1;
                                    z14 = z24;
                                    file = file5;
                                    str10 = AUTOPLAY_FILTER_NONLOOP;
                                    str11 = AUTOPLAY_FILTER;
                                    z17 = true;
                                    j12 = 0;
                                    i20 = i23;
                                } else if ("application/x-tgsticker".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 1;
                                } else if ("application/x-tgwallpattern".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 3;
                                } else if (FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                    cacheImage6.imageType = 3;
                                }
                            }
                            z14 = z24;
                            file = file5;
                            z17 = z20;
                            str10 = AUTOPLAY_FILTER_NONLOOP;
                            str11 = AUTOPLAY_FILTER;
                            j12 = 0;
                            i20 = i23;
                        } else {
                            str12 = "application/x-tgwallpattern";
                        }
                        TLRPC.Document document5 = imageLocation.document;
                        if (document5 != null) {
                            z17 = z20;
                            File file6 = document5 instanceof TLRPC.TL_documentEncrypted ? new File(FileLoader.getDirectory(4), str9) : MessageObject.isVideoDocument(document5) ? new File(FileLoader.getDirectory(2), str9) : new File(FileLoader.getDirectory(3), str9);
                            if ((isAnimatedAvatar(str5) || AUTOPLAY_FILTER.equals(str5) || AUTOPLAY_FILTER_NONLOOP.equals(str5)) && !file6.exists()) {
                                File directory2 = FileLoader.getDirectory(4);
                                str14 = AUTOPLAY_FILTER_NONLOOP;
                                StringBuilder sb3 = new StringBuilder();
                                str11 = AUTOPLAY_FILTER;
                                sb3.append(document5.dc_id);
                                sb3.append(str7);
                                str15 = ".svg";
                                file6 = new File(directory2, a4.w.p(sb3, document5.id, ".temp"));
                            } else {
                                str15 = ".svg";
                                str14 = AUTOPLAY_FILTER_NONLOOP;
                                str11 = AUTOPLAY_FILTER;
                            }
                            file = file6;
                            if (document5 instanceof DocumentObject.ThemeDocument) {
                                if (((DocumentObject.ThemeDocument) document5).wallpaper == null) {
                                    z17 = true;
                                }
                                cacheImage6.imageType = 5;
                            } else {
                                if ("application/x-tgsdice".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 1;
                                    z17 = true;
                                } else if ("application/x-tgsticker".equals(document5.mime_type)) {
                                    cacheImage6.imageType = 1;
                                } else if (str12.equals(document5.mime_type)) {
                                    cacheImage6.imageType = 3;
                                } else if (FileLoader.getDocumentFileName(imageLocation.document).endsWith(str15)) {
                                    cacheImage6.imageType = 3;
                                }
                                z14 = z23;
                                i20 = i15;
                                j12 = document5.size;
                                str10 = str14;
                            }
                            z14 = z23;
                            i20 = i15;
                            j12 = document5.size;
                            str10 = str14;
                        } else {
                            z17 = z20;
                            str11 = AUTOPLAY_FILTER;
                            String str18 = str7;
                            if (imageLocation.webFile != null) {
                                file = new File(FileLoader.getDirectory(3), str9);
                                z14 = z23;
                                str10 = AUTOPLAY_FILTER_NONLOOP;
                            } else {
                                i20 = i15;
                                file = i20 == 1 ? new File(FileLoader.getDirectory(4), str9) : new File(FileLoader.getDirectory(i16), str9);
                                if (isAnimatedAvatar(str5)) {
                                    str10 = AUTOPLAY_FILTER_NONLOOP;
                                    str13 = str11;
                                } else {
                                    str13 = str11;
                                    if (str13.equals(str5)) {
                                        str10 = AUTOPLAY_FILTER_NONLOOP;
                                    } else {
                                        str10 = AUTOPLAY_FILTER_NONLOOP;
                                    }
                                    if (imageLocation.location != null) {
                                    }
                                    z14 = z23;
                                    j12 = 0;
                                    str11 = str13;
                                }
                                File directory3 = FileLoader.getDirectory(4);
                                StringBuilder sb4 = new StringBuilder();
                                str11 = str13;
                                sb4.append(imageLocation.location.volume_id);
                                sb4.append(str18);
                                file = new File(directory3, a4.w.l(imageLocation.location.local_id, ".temp", sb4));
                                z14 = z23;
                                j12 = 0;
                            }
                        }
                    }
                    j12 = 0;
                    i20 = i15;
                }
                if (hasAutoplayFilter(str5) || isAnimatedAvatar(str5)) {
                    cacheImage6.imageType = 2;
                    cacheImage6.size = j12;
                    cacheImage6.isPFrame = isPFrame(str5);
                    if (str11.equals(str5) || str10.equals(str5) || isAnimatedAvatar(str5)) {
                        i21 = i13;
                        z17 = true;
                        cacheImage6.type = i21;
                        cacheImage6.key = str2;
                        cacheImage6.cacheType = i20;
                        cacheImage6.filter = str5;
                        cacheImage6.imageLocation = imageLocation;
                        cacheImage6.ext = str4;
                        cacheImage6.currentAccount = i14;
                        cacheImage6.parentObject = obj;
                        i22 = imageLocation.imageType;
                        if (i22 != 0) {
                            cacheImage6.imageType = i22;
                        }
                        if (i20 == 2) {
                            cacheImage6.encryptionKeyPath = new File(FileLoader.getInternalCacheDir(), u3.c.k(str9, ".enc.key"));
                        }
                        boolean z25 = z14;
                        String str19 = str6;
                        cacheImage6.addImageReceiver(imageReceiver, str2, str5, i21, i12);
                        if (!z17 || z25 || file.exists()) {
                            cacheImage6.finalFilePath = file;
                            cacheImage6.imageLocation = imageLocation;
                            cacheImage6.cacheTask = new CacheOutTask(cacheImage6);
                            this.imageLoadingByKeys.put(str2, cacheImage6);
                            this.imageLoadingKeys.add(cutFilter(str2));
                            if (i10 == 0) {
                                this.cacheThumbOutQueue.postRunnable(cacheImage6.cacheTask);
                                return;
                            }
                            pe.c cVar = this.cacheOutQueue;
                            Runnable runnable = cacheImage6.cacheTask;
                            int i24 = cacheImage6.priority;
                            if (i24 != 1) {
                                cVar.getClass();
                                runnable = new pe.b(i24, runnable);
                            }
                            cVar.a.execute(runnable);
                            cacheImage6.runningTask = runnable;
                            return;
                        }
                        cacheImage6.url = str9;
                        this.imageLoadingByUrl.put(str9, cacheImage6);
                        if (cacheImage6.isPFrame) {
                            this.imageLoadingByUrlPframe.put(str9, cacheImage6);
                        }
                        String str20 = imageLocation.path;
                        if (str20 != null) {
                            cacheImage6.tempFilePath = new File(FileLoader.getDirectory(4), u3.c.k(Utilities.MD5(str20), "_temp.jpg"));
                            cacheImage6.finalFilePath = file;
                            if (imageLocation.path.startsWith(str19)) {
                                ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage6);
                                cacheImage6.artworkTask = artworkLoadTask;
                                this.artworkTasks.add(artworkLoadTask);
                                runArtworkTasks(false);
                                return;
                            }
                            HttpImageTask httpImageTask = new HttpImageTask(cacheImage6, j10);
                            cacheImage6.httpTask = httpImageTask;
                            this.httpTasks.add(httpImageTask);
                            runHttpTasks(false);
                            return;
                        }
                        int fileLoadingPriority = i10 != 0 ? 3 : imageReceiver.getFileLoadingPriority();
                        if (imageLocation.location != null) {
                            FileLoader.getInstance(i14).loadFile(imageLocation, obj, str4, fileLoadingPriority, (i20 != 0 || (j10 > j11 && imageLocation.key == null)) ? i20 : 1);
                        } else if (imageLocation.document != null) {
                            FileLoader.getInstance(i14).loadFile(imageLocation.document, obj, fileLoadingPriority, i20);
                        } else if (imageLocation.secureDocument != null) {
                            FileLoader.getInstance(i14).loadFile(imageLocation.secureDocument, fileLoadingPriority);
                        } else if (imageLocation.webFile != null) {
                            FileLoader.getInstance(i14).loadFile(imageLocation.webFile, fileLoadingPriority, i20);
                        }
                        if (imageReceiver.isForceLoding()) {
                            this.forceLoadingImages.put(cacheImage6.key, 0);
                            return;
                        }
                        return;
                    }
                }
            } else {
                str9 = str;
                i20 = i15;
                z17 = z20;
                j11 = 0;
            }
            i21 = i13;
            cacheImage6.type = i21;
            cacheImage6.key = str2;
            cacheImage6.cacheType = i20;
            cacheImage6.filter = str5;
            cacheImage6.imageLocation = imageLocation;
            cacheImage6.ext = str4;
            cacheImage6.currentAccount = i14;
            cacheImage6.parentObject = obj;
            i22 = imageLocation.imageType;
            if (i22 != 0) {
            }
            if (i20 == 2) {
            }
            boolean z252 = z14;
            String str192 = str6;
            cacheImage6.addImageReceiver(imageReceiver, str2, str5, i21, i12);
            if (z17) {
            }
            cacheImage6.finalFilePath = file;
            cacheImage6.imageLocation = imageLocation;
            cacheImage6.cacheTask = new CacheOutTask(cacheImage6);
            this.imageLoadingByKeys.put(str2, cacheImage6);
            this.imageLoadingKeys.add(cutFilter(str2));
            if (i10 == 0) {
            }
        }
        i18 = 2;
        if (i17 != i18) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fileDidFailedLoad$12(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage != null) {
            cacheImage.setImageAndClear(null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [pe.b] */
    public void lambda$fileDidLoaded$11(String str, int i10, File file) {
        ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(str);
        if (thumbGenerateInfo != null && thumbGenerateInfo.parentDocument != null) {
            generateThumb(i10, file, thumbGenerateInfo);
            this.waitingForQualityThumb.remove(str);
        }
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        this.imageLoadingByUrl.remove(str);
        this.imageLoadingByUrlPframe.remove(str);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < cacheImage.imageReceiverArray.size(); i11++) {
            String str2 = cacheImage.keys.get(i11);
            String str3 = cacheImage.filters.get(i11);
            int intValue = cacheImage.types.get(i11).intValue();
            ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i11);
            int intValue2 = cacheImage.imageReceiverGuidsArray.get(i11).intValue();
            CacheImage cacheImage2 = this.imageLoadingByKeys.get(str2);
            if (cacheImage2 == null) {
                cacheImage2 = new CacheImage();
                cacheImage2.priority = cacheImage.priority;
                cacheImage2.secureDocument = cacheImage.secureDocument;
                cacheImage2.currentAccount = cacheImage.currentAccount;
                cacheImage2.finalFilePath = file;
                cacheImage2.parentObject = cacheImage.parentObject;
                cacheImage2.isPFrame = cacheImage.isPFrame;
                cacheImage2.key = str2;
                cacheImage2.cacheType = cacheImage.cacheType;
                cacheImage2.imageLocation = cacheImage.imageLocation;
                cacheImage2.type = intValue;
                cacheImage2.ext = cacheImage.ext;
                cacheImage2.encryptionKeyPath = cacheImage.encryptionKeyPath;
                cacheImage2.cacheTask = new CacheOutTask(cacheImage2);
                cacheImage2.filter = str3;
                cacheImage2.imageType = cacheImage.imageType;
                this.imageLoadingByKeys.put(str2, cacheImage2);
                this.imageLoadingKeys.add(cutFilter(str2));
                arrayList.add(cacheImage2.cacheTask);
            }
            cacheImage2.addImageReceiver(imageReceiver, str2, str3, intValue, intValue2);
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i12);
            if (cacheOutTask.cacheImage.type == 1) {
                this.cacheThumbOutQueue.postRunnable(cacheOutTask);
            } else {
                pe.c cVar = this.cacheOutQueue;
                int i13 = cacheOutTask.cacheImage.priority;
                if (i13 != 1) {
                    cVar.getClass();
                    cacheOutTask = new pe.b(i13, cacheOutTask);
                }
                cVar.a.execute(cacheOutTask);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$httpFileLoadError$9(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        HttpImageTask httpImageTask = cacheImage.httpTask;
        if (httpImageTask != null) {
            HttpImageTask httpImageTask2 = new HttpImageTask(httpImageTask.cacheImage, httpImageTask.imageSize);
            cacheImage.httpTask = httpImageTask2;
            this.httpTasks.add(httpImageTask2);
        }
        runHttpTasks(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$moveDirectory$2(File file, java.nio.file.Path path) {
        File file2 = new File(file, path.getFileName().toString());
        if (Files.isDirectory(path, new LinkOption[0])) {
            moveDirectory(path.toFile(), file2);
            return;
        }
        try {
            Files.move(path, file2.toPath(), new CopyOption[0]);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadArtwork$8(String str) {
        String httpUrlExtension = getHttpUrlExtension(str, "jpg");
        String str2 = Utilities.MD5(str) + "." + httpUrlExtension;
        File file = new File(FileLoader.getDirectory(4), str2);
        if (file.exists()) {
            return;
        }
        ImageLocation forPath = ImageLocation.getForPath(str);
        CacheImage cacheImage = new CacheImage();
        cacheImage.type = 1;
        cacheImage.key = Utilities.MD5(str);
        cacheImage.filter = null;
        cacheImage.imageLocation = forPath;
        cacheImage.ext = httpUrlExtension;
        cacheImage.parentObject = null;
        int i10 = forPath.imageType;
        if (i10 != 0) {
            cacheImage.imageType = i10;
        }
        cacheImage.url = str2;
        this.imageLoadingByUrl.put(str2, cacheImage);
        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), u3.c.k(Utilities.MD5(forPath.path), "_temp.jpg"));
        cacheImage.finalFilePath = file;
        ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage);
        cacheImage.artworkTask = artworkLoadTask;
        this.artworkTasks.add(artworkLoadTask);
        runArtworkTasks(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runHttpFileLoadTasks$13(HttpFileTask httpFileTask) {
        this.httpFileLoadTasks.add(httpFileTask);
        runHttpFileLoadTasks(null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runHttpFileLoadTasks$14(HttpFileTask httpFileTask, int i10) {
        ImageLoader imageLoader;
        int i11 = 1;
        if (httpFileTask != null) {
            this.currentHttpFileLoadTasksCount--;
        }
        if (httpFileTask == null) {
            imageLoader = this;
        } else if (i10 != 1) {
            imageLoader = this;
            if (i10 == 2) {
                imageLoader.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                File file = new File(FileLoader.getDirectory(4), Utilities.MD5(httpFileTask.url) + "." + httpFileTask.ext);
                if (!httpFileTask.tempFile.renameTo(file)) {
                    file = httpFileTask.tempFile;
                }
                NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidLoad, httpFileTask.url, file.toString());
            }
        } else if (httpFileTask.canRetry) {
            imageLoader = this;
            d3 d3Var = new d3(i11, this, imageLoader.new HttpFileTask(httpFileTask.url, httpFileTask.tempFile, httpFileTask.ext, httpFileTask.currentAccount));
            imageLoader.retryHttpsTasks.put(httpFileTask.url, d3Var);
            AndroidUtilities.runOnUIThread(d3Var, 1000L);
        } else {
            imageLoader = this;
            imageLoader.httpFileLoadTasksByKeys.remove(httpFileTask.url);
            NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidFailedLoad, httpFileTask.url, 0);
        }
        while (imageLoader.currentHttpFileLoadTasksCount < 2 && !imageLoader.httpFileLoadTasks.isEmpty()) {
            imageLoader.httpFileLoadTasks.poll().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            imageLoader.currentHttpFileLoadTasksCount++;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(27:6|(1:8)(2:157|(2:161|162))|9|10|(1:12)(1:(24:150|151|152|14|(1:16)(1:148)|17|(1:19)|20|(3:22|(2:23|(1:25)(1:26))|27)|28|29|(4:33|34|35|36)|45|(7:47|(1:49)|50|51|(2:(1:54)|55)|56|(5:94|95|(3:99|100|(3:102|103|104))|97|98)(1:(7:59|60|(3:71|72|(5:74|75|63|64|66))|62|63|64|66)(1:93)))|128|130|131|(5:133|(1:135)(1:141)|136|(1:138)(1:140)|139)|142|(1:144)|51|(0)|56|(0)(0)))|13|14|(0)(0)|17|(0)|20|(0)|28|29|(5:31|33|34|35|36)|45|(0)|128|130|131|(0)|142|(0)|51|(0)|56|(0)(0))|166|10|(0)(0)|13|14|(0)(0)|17|(0)|20|(0)|28|29|(0)|45|(0)|128|130|131|(0)|142|(0)|51|(0)|56|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
    
        if (r10 == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00fb A[Catch: all -> 0x011d, TryCatch #13 {all -> 0x011d, blocks: (B:131:0x00f1, B:133:0x00fb, B:136:0x010c, B:139:0x0119, B:142:0x011f, B:144:0x0129), top: B:130:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0129 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #13 {all -> 0x011d, blocks: (B:131:0x00f1, B:133:0x00fb, B:136:0x010c, B:139:0x0119, B:142:0x011f, B:144:0x0129), top: B:130:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #5 {all -> 0x00cc, blocks: (B:29:0x00a0, B:31:0x00ae, B:38:0x00c8, B:45:0x00d5, B:47:0x00df, B:128:0x00ec), top: B:28:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[Catch: all -> 0x00cc, TryCatch #5 {all -> 0x00cc, blocks: (B:29:0x00a0, B:31:0x00ae, B:38:0x00c8, B:45:0x00d5, B:47:0x00df, B:128:0x00ec), top: B:28:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap loadBitmap(String str, Uri uri, float f9, float f10, boolean z10) {
        String str2;
        InputStream openInputStream;
        float max;
        int i10;
        Matrix matrix;
        float f11;
        Bitmap bitmap;
        Bitmap decodeStream;
        Bitmap createBitmap;
        Pair<Integer, Integer> imageOrientation;
        InputStream inputStream;
        String path;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                path = uri.getPath();
            } else if (Build.VERSION.SDK_INT < 30 || !"content".equals(uri.getScheme())) {
                try {
                    path = AndroidUtilities.getPath(uri);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            str2 = path;
            Bitmap bitmap2 = null;
            if (str2 == null) {
                BitmapFactory.decodeFile(str2, options);
            } else if (uri != null) {
                try {
                    InputStream openInputStream2 = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                    BitmapFactory.decodeStream(openInputStream2, null, options);
                    openInputStream2.close();
                    openInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                    float f12 = options.outWidth / f9;
                    float f13 = options.outHeight / f10;
                    max = z10 ? Math.max(f12, f13) : Math.min(f12, f13);
                    if (max < 1.0f) {
                        max = 1.0f;
                    }
                    options.inJustDecodeBounds = false;
                    i10 = (int) max;
                    options.inSampleSize = i10;
                    if (i10 % 2 != 0) {
                        int i11 = 1;
                        while (true) {
                            int i12 = i11 * 2;
                            if (i12 >= options.inSampleSize) {
                                break;
                            }
                            i11 = i12;
                        }
                        options.inSampleSize = i11;
                    }
                    imageOrientation = AndroidUtilities.getImageOrientation(str2);
                    if (((Integer) imageOrientation.first).intValue() == 0 && ((Integer) imageOrientation.second).intValue() == 0) {
                        try {
                            inputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                            try {
                                imageOrientation = AndroidUtilities.getImageOrientation(inputStream);
                            } catch (Throwable unused) {
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (((Integer) imageOrientation.first).intValue() == 0) {
                                }
                                matrix = new Matrix();
                                if (((Integer) imageOrientation.second).intValue() != 0) {
                                }
                                if (((Integer) imageOrientation.first).intValue() != 0) {
                                }
                                f11 = max / options.inSampleSize;
                                if (f11 > 1.0f) {
                                }
                                Matrix matrix2 = matrix;
                                if (str2 != null) {
                                }
                            }
                        } catch (Throwable unused2) {
                            inputStream = null;
                        }
                    }
                    if (((Integer) imageOrientation.first).intValue() == 0) {
                        if (((Integer) imageOrientation.second).intValue() == 0) {
                        }
                        matrix = null;
                        f11 = max / options.inSampleSize;
                        if (f11 > 1.0f) {
                            if (matrix == null) {
                                matrix = new Matrix();
                            }
                            float f14 = 1.0f / f11;
                            matrix.postScale(f14, f14);
                        }
                        Matrix matrix22 = matrix;
                        if (str2 != null) {
                            try {
                                bitmap = BitmapFactory.decodeFile(str2, options);
                                if (bitmap != null) {
                                    try {
                                        Bitmap createBitmap2 = Bitmaps.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix22, true);
                                        if (createBitmap2 != bitmap) {
                                            bitmap.recycle();
                                            return createBitmap2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bitmap2 = bitmap;
                                        FileLog.e(th);
                                        getInstance().clearMemory();
                                        if (bitmap2 == null) {
                                            try {
                                                bitmap2 = BitmapFactory.decodeFile(str2, options);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                FileLog.e(th);
                                                return bitmap2;
                                            }
                                        }
                                        bitmap = bitmap2;
                                        if (bitmap != null) {
                                            try {
                                                Bitmap createBitmap3 = Bitmaps.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix22, true);
                                                if (createBitmap3 != bitmap) {
                                                    bitmap.recycle();
                                                    bitmap = createBitmap3;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                bitmap2 = bitmap;
                                                FileLog.e(th);
                                                return bitmap2;
                                            }
                                        }
                                        return bitmap;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            return bitmap;
                        }
                        if (uri == null) {
                            return null;
                        }
                        try {
                            decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                        } catch (Throwable th7) {
                            th = th7;
                        }
                        try {
                            if (decodeStream != null) {
                                try {
                                    createBitmap = Bitmaps.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix22, true);
                                } catch (Throwable th8) {
                                    th = th8;
                                    bitmap2 = decodeStream;
                                    try {
                                        FileLog.e(th);
                                        openInputStream.close();
                                        return bitmap2;
                                    } finally {
                                    }
                                }
                                if (createBitmap != decodeStream) {
                                    decodeStream.recycle();
                                    bitmap2 = createBitmap;
                                    openInputStream.close();
                                    return bitmap2;
                                }
                            }
                            openInputStream.close();
                            return bitmap2;
                        } catch (Throwable th9) {
                            FileLog.e(th9);
                            return bitmap2;
                        }
                        bitmap2 = decodeStream;
                    }
                    matrix = new Matrix();
                    if (((Integer) imageOrientation.second).intValue() != 0) {
                        float f15 = -1.0f;
                        float f16 = ((Integer) imageOrientation.second).intValue() == 1 ? -1.0f : 1.0f;
                        if (((Integer) imageOrientation.second).intValue() != 2) {
                            f15 = 1.0f;
                        }
                        matrix.postScale(f16, f15);
                    }
                    if (((Integer) imageOrientation.first).intValue() != 0) {
                        matrix.postRotate(((Integer) imageOrientation.first).intValue());
                    }
                    f11 = max / options.inSampleSize;
                    if (f11 > 1.0f) {
                    }
                    Matrix matrix222 = matrix;
                    if (str2 != null) {
                    }
                } catch (Throwable th10) {
                    FileLog.e(th10);
                    return null;
                }
            }
            openInputStream = null;
            float f122 = options.outWidth / f9;
            float f132 = options.outHeight / f10;
            if (z10) {
            }
            if (max < 1.0f) {
            }
            options.inJustDecodeBounds = false;
            i10 = (int) max;
            options.inSampleSize = i10;
            if (i10 % 2 != 0) {
            }
            imageOrientation = AndroidUtilities.getImageOrientation(str2);
            if (((Integer) imageOrientation.first).intValue() == 0) {
                inputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                imageOrientation = AndroidUtilities.getImageOrientation(inputStream);
            }
            if (((Integer) imageOrientation.first).intValue() == 0) {
            }
            matrix = new Matrix();
            if (((Integer) imageOrientation.second).intValue() != 0) {
            }
            if (((Integer) imageOrientation.first).intValue() != 0) {
            }
            f11 = max / options.inSampleSize;
            if (f11 > 1.0f) {
            }
            Matrix matrix2222 = matrix;
            if (str2 != null) {
            }
        }
        str2 = str;
        Bitmap bitmap22 = null;
        if (str2 == null) {
        }
        openInputStream = null;
        float f1222 = options.outWidth / f9;
        float f1322 = options.outHeight / f10;
        if (z10) {
        }
        if (max < 1.0f) {
        }
        options.inJustDecodeBounds = false;
        i10 = (int) max;
        options.inSampleSize = i10;
        if (i10 % 2 != 0) {
        }
        imageOrientation = AndroidUtilities.getImageOrientation(str2);
        if (((Integer) imageOrientation.first).intValue() == 0) {
        }
        if (((Integer) imageOrientation.first).intValue() == 0) {
        }
        matrix = new Matrix();
        if (((Integer) imageOrientation.second).intValue() != 0) {
        }
        if (((Integer) imageOrientation.first).intValue() != 0) {
        }
        f11 = max / options.inSampleSize;
        if (f11 > 1.0f) {
        }
        Matrix matrix22222 = matrix;
        if (str2 != null) {
        }
    }

    private static void moveDirectory(File file, final File file2) {
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    convert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    try {
                        convert.forEach(new Consumer() { // from class: org.telegram.messenger.p4
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void x(Object obj) {
                                ImageLoader.lambda$moveDirectory$2(file2, (java.nio.file.Path) obj);
                            }

                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$-CC.$default$andThen(this, consumer);
                            }
                        });
                        convert.close();
                    } finally {
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    private void performReplace(String str, String str2) {
        LruCache<BitmapDrawable> lruCache = this.memCache;
        BitmapDrawable bitmapDrawable = lruCache.get(str);
        if (bitmapDrawable == null) {
            lruCache = this.smallImagesMemCache;
            bitmapDrawable = lruCache.get(str);
        }
        this.replacedBitmaps.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = lruCache.get(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    lruCache.remove(str);
                }
            }
            this.ignoreRemoval = str;
            lruCache.remove(str);
            lruCache.put(str2, bitmapDrawable);
            this.ignoreRemoval = null;
        }
        Integer num = this.bitmapUseCounts.get(str);
        if (num != null) {
            this.bitmapUseCounts.put(str2, num);
            this.bitmapUseCounts.remove(str);
        }
    }

    private void removeFromWaitingForThumb(int i10, ImageReceiver imageReceiver) {
        String str = this.waitingForQualityThumbByTag.get(i10);
        if (str != null) {
            ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(str);
            if (thumbGenerateInfo != null) {
                int indexOf = thumbGenerateInfo.imageReceiverArray.indexOf(imageReceiver);
                if (indexOf >= 0) {
                    thumbGenerateInfo.imageReceiverArray.remove(indexOf);
                    thumbGenerateInfo.imageReceiverGuidsArray.remove(indexOf);
                }
                if (thumbGenerateInfo.imageReceiverArray.isEmpty()) {
                    this.waitingForQualityThumb.remove(str);
                }
            }
            this.waitingForQualityThumbByTag.remove(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: replaceImageInCacheInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$replaceImageInCache$5(String str, String str2, ImageLocation imageLocation) {
        int i10 = 0;
        while (i10 < 2) {
            ArrayList<String> filterKeys = i10 == 0 ? this.memCache.getFilterKeys(str) : this.smallImagesMemCache.getFilterKeys(str);
            if (filterKeys != null) {
                for (int i11 = 0; i11 < filterKeys.size(); i11++) {
                    String str3 = filterKeys.get(i11);
                    String y8 = a4.w.y(str, "@", str3);
                    String y10 = a4.w.y(str2, "@", str3);
                    performReplace(y8, y10);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, y8, y10, imageLocation);
                }
            } else {
                performReplace(str, str2);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, str, str2, imageLocation);
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runArtworkTasks(boolean z10) {
        if (z10) {
            this.currentArtworkTasksCount--;
        }
        while (this.currentArtworkTasksCount < 4 && !this.artworkTasks.isEmpty()) {
            try {
                this.artworkTasks.poll().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.currentArtworkTasksCount++;
            } catch (Throwable unused) {
                runArtworkTasks(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runHttpFileLoadTasks(HttpFileTask httpFileTask, int i10) {
        AndroidUtilities.runOnUIThread(new r4(this, httpFileTask, i10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runHttpTasks(boolean z10) {
        if (z10) {
            this.currentHttpTasksCount--;
        }
        while (this.currentHttpTasksCount < 4 && !this.httpTasks.isEmpty()) {
            HttpImageTask poll = this.httpTasks.poll();
            if (poll != null) {
                poll.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.currentHttpTasksCount++;
            }
        }
    }

    public static void saveMessageThumbs(TLRPC.Message message) {
        byte[] bArr;
        TLRPC.PhotoSize tL_photoSize_layer127;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            return;
        }
        int i10 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            while (i10 < tL_messageMediaPaidMedia.extended_media.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i10);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    saveMessageThumbs(message, ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media);
                }
                i10++;
            }
            return;
        }
        TLRPC.PhotoSize findPhotoCachedSize = findPhotoCachedSize(message);
        if (findPhotoCachedSize == null || (bArr = findPhotoCachedSize.bytes) == null || bArr.length == 0) {
            return;
        }
        TLRPC.FileLocation fileLocation = findPhotoCachedSize.location;
        if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            findPhotoCachedSize.location = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        }
        if (findPhotoCachedSize.h > 50 || findPhotoCachedSize.w > 50) {
            boolean z10 = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z10 = false;
            }
            if (!pathToAttach.exists()) {
                if (z10) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(FileLoader.getInternalCacheDir(), pathToAttach.getName() + ".key"), "rws");
                        long length = randomAccessFile.length();
                        byte[] bArr2 = new byte[32];
                        byte[] bArr3 = new byte[16];
                        if (length <= 0 || length % 48 != 0) {
                            Utilities.random.nextBytes(bArr2);
                            Utilities.random.nextBytes(bArr3);
                            randomAccessFile.write(bArr2);
                            randomAccessFile.write(bArr3);
                        } else {
                            randomAccessFile.read(bArr2, 0, 32);
                            randomAccessFile.read(bArr3, 0, 16);
                        }
                        randomAccessFile.close();
                        Utilities.aesCtrDecryptionByteArray(findPhotoCachedSize.bytes, bArr2, bArr3, 0, r8.length, 0);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pathToAttach, "rws");
                randomAccessFile2.write(findPhotoCachedSize.bytes);
                randomAccessFile2.close();
            }
            tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = findPhotoCachedSize.w;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.size = findPhotoCachedSize.size;
            tL_photoSize_layer127.type = findPhotoCachedSize.type;
        } else {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = findPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.w = findPhotoCachedSize.w;
        }
        TLRPC.MessageMedia messageMedia2 = message.media;
        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia2.photo.sizes.size();
            while (i10 < size) {
                if (message.media.photo.sizes.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.photo.sizes.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
            return;
        }
        if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia2.document.thumbs.size();
            while (i10 < size2) {
                if (message.media.document.thumbs.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.document.thumbs.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
            return;
        }
        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia2.webpage.photo.sizes.size();
            while (i10 < size3) {
                if (message.media.webpage.photo.sizes.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.webpage.photo.sizes.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
        }
    }

    public static void saveMessagesThumbs(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            saveMessageThumbs(arrayList.get(i10));
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f9, float f10, int i10, boolean z10) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f9, f10, i10, z10, 0, 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TLRPC.PhotoSize scaleAndSaveImageInternal(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10, int i10, int i11, float f9, float f10, float f11, int i12, boolean z11, boolean z12, boolean z13) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        Bitmap createScaledBitmap = (f11 > 1.0f || z12) ? Bitmaps.createScaledBitmap(bitmap, i10, i11, true) : bitmap;
        if (photoSize != null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                tL_fileLocationToBeDeprecated = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                int i13 = 7.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
                String str = (i13 != 1 || i13 == 2 || i13 == 3) ? ".webp" : ".jpg";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_fileLocationToBeDeprecated.volume_id);
                sb2.append("_");
                FileOutputStream fileOutputStream = new FileOutputStream(new File(!z13 ? FileLoader.getDirectory(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? FileLoader.getDirectory(0) : FileLoader.getDirectory(4), a4.w.l(tL_fileLocationToBeDeprecated.local_id, str, sb2)));
                createScaledBitmap.compress(compressFormat, i12, fileOutputStream);
                if (!z11) {
                    photoSize.size = (int) fileOutputStream.getChannel().size();
                }
                fileOutputStream.close();
                if (z11) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createScaledBitmap.compress(compressFormat, i12, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    photoSize.bytes = byteArray;
                    photoSize.size = byteArray.length;
                    byteArrayOutputStream.close();
                }
                if (createScaledBitmap != bitmap) {
                    createScaledBitmap.recycle();
                }
                return photoSize;
            }
        }
        tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
        tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        photoSize = new TLRPC.TL_photoSize_layer127();
        photoSize.location = tL_fileLocationToBeDeprecated;
        photoSize.w = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        photoSize.h = height;
        int i14 = photoSize.w;
        if (i14 <= 100 && height <= 100) {
            photoSize.type = "s";
        } else if (i14 <= 320 && height <= 320) {
            photoSize.type = "m";
        } else if (i14 <= 800 && height <= 800) {
            photoSize.type = "x";
        } else if (i14 > 1280 || height > 1280) {
            photoSize.type = "w";
        } else {
            photoSize.type = "y";
        }
        int i132 = 7.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        if (i132 != 1) {
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append(tL_fileLocationToBeDeprecated.volume_id);
        sb22.append("_");
        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(!z13 ? FileLoader.getDirectory(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? FileLoader.getDirectory(0) : FileLoader.getDirectory(4), a4.w.l(tL_fileLocationToBeDeprecated.local_id, str, sb22)));
        createScaledBitmap.compress(compressFormat, i12, fileOutputStream2);
        if (!z11) {
        }
        fileOutputStream2.close();
        if (z11) {
        }
        if (createScaledBitmap != bitmap) {
        }
        return photoSize;
    }

    public static boolean shouldSendImageAsDocument(String str, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                str = uri.getPath();
            } else {
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        }
        if (str != null) {
            BitmapFactory.decodeFile(str, options);
        } else if (uri != null) {
            try {
                InputStream openInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
            } catch (Throwable th3) {
                FileLog.e(th3);
                return false;
            }
        }
        float f9 = options.outWidth;
        float f10 = options.outHeight;
        return f9 / f10 > 10.0f || f10 / f9 > 10.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int sizeOfBitmapDrawable(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.c6) {
            org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) bitmapDrawable;
            return Math.max(c6Var.getIntrinsicHeight() * c6Var.getIntrinsicWidth(), c6Var.f0 * c6Var.e0) * 12;
        }
        if (!(bitmapDrawable instanceof xi0)) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
        xi0 xi0Var = (xi0) bitmapDrawable;
        int i10 = xi0Var.b * xi0Var.c;
        return xi0Var.C ? i10 * 2 : i10 * 8;
    }

    private boolean useLottieMemCache(ImageLocation imageLocation, String str) {
        return (str.endsWith("_firstframe") || str.endsWith("_lastframe") || ((imageLocation == null || (!MessageObject.isAnimatedStickerDocument(imageLocation.document, true) && imageLocation.imageType != 1 && !MessageObject.isVideoSticker(imageLocation.document))) && !isAnimatedAvatar(str))) ? false : true;
    }

    public void addTestWebFile(String str, WebFile webFile) {
        if (str == null || webFile == null) {
            return;
        }
        this.testWebFile.put(str, webFile);
    }

    public void cancelForceLoadingForImageReceiver(ImageReceiver imageReceiver) {
        String imageKey;
        if (imageReceiver == null || (imageKey = imageReceiver.getImageKey()) == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new q4(this, imageKey, 1));
    }

    public void cancelLoadHttpFile(String str) {
        HttpFileTask httpFileTask = this.httpFileLoadTasksByKeys.get(str);
        if (httpFileTask != null) {
            httpFileTask.cancel(true);
            this.httpFileLoadTasksByKeys.remove(str);
            this.httpFileLoadTasks.remove(httpFileTask);
        }
        Runnable runnable = this.retryHttpsTasks.get(str);
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        runHttpFileLoadTasks(null, 0);
    }

    public void cancelLoadingForImageReceiver(ImageReceiver imageReceiver, boolean z10) {
        if (imageReceiver == null) {
            return;
        }
        HashMap hashMap = org.telegram.ui.web.f2.f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList = (ArrayList) entry.getValue();
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((Pair) arrayList.get(i10)).first == imageReceiver) {
                        arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    org.telegram.ui.web.f2.f.remove(str);
                    break;
                }
            }
        }
        ArrayList<Runnable> loadingOperations = imageReceiver.getLoadingOperations();
        if (!loadingOperations.isEmpty()) {
            for (int i11 = 0; i11 < loadingOperations.size(); i11++) {
                this.imageLoadQueue.cancelRunnable(loadingOperations.get(i11));
            }
            loadingOperations.clear();
        }
        imageReceiver.addLoadingImageRunnable(null);
        this.imageLoadQueue.postRunnable(new p6(this, z10, imageReceiver, 2));
    }

    public void changeFileLoadingPriorityForImageReceiver(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new r4(this, imageReceiver, imageReceiver.getFileLoadingPriority(), 4));
    }

    public void checkMediaPaths() {
        checkMediaPaths(null);
    }

    public void clearMemory() {
        this.smallImagesMemCache.evictAll();
        this.memCache.evictAll();
        this.lottieMemCache.evictAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x015d, code lost:
    
        if (r2.canWrite() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0157, code lost:
    
        if (r2.mkdirs() != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192 A[Catch: Exception -> 0x00a2, TryCatch #12 {Exception -> 0x00a2, blocks: (B:8:0x0047, B:10:0x0053, B:12:0x0061, B:15:0x0069, B:17:0x0070, B:19:0x009f, B:23:0x00a5, B:25:0x00b1, B:28:0x00ba, B:30:0x00bd, B:34:0x00de, B:35:0x00c2, B:38:0x00e1, B:181:0x0122, B:47:0x0185, B:49:0x0192, B:51:0x019d, B:53:0x01a5, B:55:0x01ad, B:58:0x01b9, B:60:0x01c4, B:64:0x01c7, B:151:0x0343, B:153:0x0301, B:155:0x02c0, B:157:0x027f, B:159:0x023e, B:68:0x0348, B:89:0x03b3, B:91:0x037f, B:92:0x03c1, B:161:0x020a, B:184:0x011f, B:41:0x0131, B:43:0x0139, B:46:0x017e, B:162:0x0146, B:164:0x014c, B:167:0x0159, B:169:0x015f, B:170:0x0153, B:191:0x03b7, B:193:0x03bb, B:97:0x01d9, B:99:0x01e9, B:101:0x01ef, B:103:0x01f6, B:80:0x0382, B:82:0x0390, B:84:0x0396, B:86:0x039f, B:133:0x02c3, B:135:0x02d5, B:137:0x02dc, B:139:0x02eb, B:124:0x0282, B:126:0x0294, B:128:0x029b, B:130:0x02aa, B:71:0x034e, B:73:0x035c, B:75:0x0362, B:77:0x036b, B:115:0x0241, B:117:0x0253, B:119:0x025a, B:121:0x0269, B:106:0x020d, B:108:0x021d, B:110:0x0223, B:112:0x022a, B:142:0x0304, B:144:0x0316, B:146:0x031d, B:148:0x032c), top: B:7:0x0047, inners: #0, #4, #5, #6, #7, #8, #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x036b A[Catch: Exception -> 0x037e, TRY_LEAVE, TryCatch #7 {Exception -> 0x037e, blocks: (B:71:0x034e, B:73:0x035c, B:75:0x0362, B:77:0x036b), top: B:70:0x034e, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039f A[Catch: Exception -> 0x03b2, TRY_LEAVE, TryCatch #4 {Exception -> 0x03b2, blocks: (B:80:0x0382, B:82:0x0390, B:84:0x0396, B:86:0x039f), top: B:79:0x0382, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SparseArray<File> createMediaPaths() {
        File file;
        File file2;
        File file3;
        File[] externalFilesDirs;
        SparseArray<File> sparseArray = new SparseArray<>();
        File cacheDir = AndroidUtilities.getCacheDir();
        if (!cacheDir.isDirectory()) {
            try {
                cacheDir.mkdirs();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("cache path = " + cacheDir);
        }
        org.telegram.ui.th.v(SharedConfig.storageCacheDir, new StringBuilder("selected SD card = "));
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file4 = null;
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                    if (rootDirs != null) {
                        int size = rootDirs.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            }
                            File file5 = rootDirs.get(i10);
                            FileLog.d("root dir " + i10 + " " + file5);
                            if (file5.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                externalStorageDirectory = file5;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (!externalStorageDirectory.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && (externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null)) != null) {
                        for (int i11 = 0; i11 < externalFilesDirs.length; i11++) {
                            if (externalFilesDirs[i11] != null) {
                                FileLog.d("dirsDebug " + i11 + " " + externalFilesDirs[i11]);
                            }
                        }
                    }
                }
                FileLog.d("external storage = " + externalStorageDirectory);
                if (Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (ApplicationLoader.applicationContext.getExternalMediaDirs().length > 0) {
                            File publicStorageDir = getPublicStorageDir();
                            try {
                                file = new File(publicStorageDir, "Telegram");
                            } catch (Exception e11) {
                                file = publicStorageDir;
                                e = e11;
                            }
                            try {
                                file.mkdirs();
                            } catch (Exception e12) {
                                e = e12;
                                FileLog.e(e);
                                this.telegramPath = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
                                file4 = file;
                                this.telegramPath.mkdirs();
                                if (!this.telegramPath.isDirectory()) {
                                }
                                if (this.telegramPath.isDirectory()) {
                                }
                                if (file4 != null) {
                                    try {
                                        file3 = new File(file4, "Telegram Images");
                                        file3.mkdir();
                                        if (file3.isDirectory()) {
                                            sparseArray.put(100, file3);
                                            if (BuildVars.LOGS_ENABLED) {
                                            }
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    try {
                                        file2 = new File(file4, "Telegram Video");
                                        file2.mkdir();
                                        if (file2.isDirectory()) {
                                            sparseArray.put(101, file2);
                                            if (BuildVars.LOGS_ENABLED) {
                                            }
                                        }
                                    } catch (Exception e14) {
                                        FileLog.e(e14);
                                    }
                                }
                                SharedConfig.checkSaveToGalleryFiles();
                                return sparseArray;
                            }
                        } else {
                            file = null;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        file = null;
                    }
                    this.telegramPath = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
                    file4 = file;
                } else {
                    if (TextUtils.isEmpty(SharedConfig.storageCacheDir) || !externalStorageDirectory.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                        if (externalStorageDirectory.exists()) {
                            if (externalStorageDirectory.isDirectory()) {
                            }
                            FileLog.d("can't write to this directory = " + externalStorageDirectory + " use files dir");
                            externalStorageDirectory = ApplicationLoader.applicationContext.getExternalFilesDir(null);
                        }
                    }
                    this.telegramPath = new File(externalStorageDirectory, "Telegram");
                }
                this.telegramPath.mkdirs();
                if (!this.telegramPath.isDirectory()) {
                    ArrayList<File> dataDirs = AndroidUtilities.getDataDirs();
                    int size2 = dataDirs.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        File file6 = dataDirs.get(i12);
                        if (file6 != null && !TextUtils.isEmpty(SharedConfig.storageCacheDir) && file6.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                            File file7 = new File(file6, "Telegram");
                            this.telegramPath = file7;
                            file7.mkdirs();
                            break;
                        }
                        i12++;
                    }
                }
                if (this.telegramPath.isDirectory()) {
                    try {
                        File file8 = new File(this.telegramPath, "Telegram Images");
                        file8.mkdir();
                        if (file8.isDirectory() && canMoveFiles(cacheDir, file8, 0)) {
                            sparseArray.put(0, file8);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("image path = " + file8);
                            }
                        }
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                    try {
                        File file9 = new File(this.telegramPath, "Telegram Video");
                        file9.mkdir();
                        if (file9.isDirectory() && canMoveFiles(cacheDir, file9, 2)) {
                            sparseArray.put(2, file9);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("video path = " + file9);
                            }
                        }
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                    try {
                        File file10 = new File(this.telegramPath, "Telegram Audio");
                        file10.mkdir();
                        if (file10.isDirectory() && canMoveFiles(cacheDir, file10, 1)) {
                            AndroidUtilities.createEmptyFile(new File(file10, ".nomedia"));
                            sparseArray.put(1, file10);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("audio path = " + file10);
                            }
                        }
                    } catch (Exception e18) {
                        FileLog.e(e18);
                    }
                    try {
                        File file11 = new File(this.telegramPath, "Telegram Documents");
                        file11.mkdir();
                        if (file11.isDirectory() && canMoveFiles(cacheDir, file11, 3)) {
                            AndroidUtilities.createEmptyFile(new File(file11, ".nomedia"));
                            sparseArray.put(3, file11);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("documents path = " + file11);
                            }
                        }
                    } catch (Exception e19) {
                        FileLog.e(e19);
                    }
                    try {
                        File file12 = new File(this.telegramPath, "Telegram Files");
                        file12.mkdir();
                        if (file12.isDirectory() && canMoveFiles(cacheDir, file12, 5)) {
                            AndroidUtilities.createEmptyFile(new File(file12, ".nomedia"));
                            sparseArray.put(5, file12);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("files path = " + file12);
                            }
                        }
                    } catch (Exception e20) {
                        FileLog.e(e20);
                    }
                    try {
                        File file13 = new File(this.telegramPath, "Telegram Stories");
                        file13.mkdir();
                        if (file13.isDirectory() && canMoveFiles(cacheDir, file13, 6)) {
                            AndroidUtilities.createEmptyFile(new File(file13, ".nomedia"));
                            sparseArray.put(6, file13);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("stories path = " + file13);
                            }
                        }
                    } catch (Exception e21) {
                        FileLog.e(e21);
                    }
                }
                if (file4 != null && file4.isDirectory()) {
                    file3 = new File(file4, "Telegram Images");
                    file3.mkdir();
                    if (file3.isDirectory() && canMoveFiles(cacheDir, file3, 0)) {
                        sparseArray.put(100, file3);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("image path = " + file3);
                        }
                    }
                    file2 = new File(file4, "Telegram Video");
                    file2.mkdir();
                    if (file2.isDirectory() && canMoveFiles(cacheDir, file2, 2)) {
                        sparseArray.put(101, file2);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("video path = " + file2);
                        }
                    }
                }
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d("this Android can't rename files");
            }
            SharedConfig.checkSaveToGalleryFiles();
        } catch (Exception e22) {
            FileLog.e(e22);
        }
        return sparseArray;
    }

    public boolean decrementUseCount(String str) {
        Integer num = this.bitmapUseCounts.get(str);
        if (num == null) {
            return true;
        }
        if (num.intValue() == 1) {
            this.bitmapUseCounts.remove(str);
            return true;
        }
        this.bitmapUseCounts.put(str, Integer.valueOf(num.intValue() - 1));
        return false;
    }

    public pe.c getCacheOutQueue() {
        return this.cacheOutQueue;
    }

    public Float getFileProgress(String str) {
        long[] jArr;
        if (str == null || (jArr = this.fileProgresses.get(str)) == null) {
            return null;
        }
        long j10 = jArr[1];
        return j10 == 0 ? Float.valueOf(0.0f) : Float.valueOf(Math.min(1.0f, jArr[0] / j10));
    }

    public long[] getFileProgressSizes(String str) {
        if (str == null) {
            return null;
        }
        return this.fileProgresses.get(str);
    }

    public BitmapDrawable getFromMemCache(String str) {
        BitmapDrawable bitmapDrawable = this.memCache.get(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = this.smallImagesMemCache.get(str);
        }
        if (bitmapDrawable == null) {
            bitmapDrawable = this.wallpaperMemCache.get(str);
        }
        return bitmapDrawable == null ? getFromLottieCache(str) : bitmapDrawable;
    }

    public BitmapDrawable getImageFromMemory(TLObject tLObject, String str, String str2) {
        String str3 = null;
        if (tLObject == null && str == null) {
            return null;
        }
        if (str != null) {
            str3 = Utilities.MD5(str);
        } else if (tLObject instanceof TLRPC.FileLocation) {
            TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) tLObject;
            str3 = fileLocation.volume_id + "_" + fileLocation.local_id;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            str3 = document.dc_id + "_" + document.id;
        } else if (tLObject instanceof SecureDocument) {
            SecureDocument secureDocument = (SecureDocument) tLObject;
            str3 = secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.id;
        } else if (tLObject instanceof WebFile) {
            str3 = Utilities.MD5(((WebFile) tLObject).url);
        }
        if (str2 != null) {
            str3 = a4.w.y(str3, "@", str2);
        }
        return getFromMemCache(str3);
    }

    public LruCache<BitmapDrawable> getLottieMemCahce() {
        return this.lottieMemCache;
    }

    public String getReplacedKey(String str) {
        if (str == null) {
            return null;
        }
        return this.replacedBitmaps.get(str);
    }

    public boolean hasLottieMemCache(String str) {
        LruCache<BitmapDrawable> lruCache = this.lottieMemCache;
        return lruCache != null && lruCache.contains(str);
    }

    public void incrementUseCount(String str) {
        Integer num = this.bitmapUseCounts.get(str);
        if (num == null) {
            this.bitmapUseCounts.put(str, 1);
        } else {
            this.bitmapUseCounts.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public boolean isInMemCache(String str, boolean z10) {
        return z10 ? getFromLottieCache(str) != null : getFromMemCache(str) != null;
    }

    public boolean isLoadingHttpFile(String str) {
        return this.httpFileLoadTasksByKeys.containsKey(str);
    }

    public void loadHttpFile(String str, String str2, int i10) {
        if (str == null || str.length() == 0 || this.httpFileLoadTasksByKeys.containsKey(str)) {
            return;
        }
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str) + "_temp." + httpUrlExtension);
        file.delete();
        HttpFileTask httpFileTask = new HttpFileTask(str, file, httpUrlExtension, i10);
        this.httpFileLoadTasks.add(httpFileTask);
        this.httpFileLoadTasksByKeys.put(str, httpFileTask);
        runHttpFileLoadTasks(null, 0);
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver) {
        loadImageForImageReceiver(imageReceiver, null);
    }

    public void moveToFront(String str) {
        if (str == null) {
            return;
        }
        if (this.lottieMemCache.get(str) != null) {
            this.lottieMemCache.moveToFront(str);
        }
        if (this.memCache.get(str) != null) {
            this.memCache.moveToFront(str);
        }
        if (this.smallImagesMemCache.get(str) != null) {
            this.smallImagesMemCache.moveToFront(str);
        }
    }

    public void onFragmentStackChanged() {
        for (int i10 = 0; i10 < this.cachedAnimatedFileDrawables.size(); i10++) {
            this.cachedAnimatedFileDrawables.get(i10).u0 = 0;
        }
    }

    public void preloadArtwork(String str) {
        this.imageLoadQueue.postRunnable(new q4(this, str, 2));
    }

    public void putImageToCache(BitmapDrawable bitmapDrawable, String str, boolean z10) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z10) {
            this.smallImagesMemCache.put(str, bitmapDrawable);
        } else {
            this.memCache.put(str, bitmapDrawable);
        }
    }

    public void putThumbsToCache(ArrayList<MessageThumb> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            putImageToCache(arrayList.get(i10).drawable, arrayList.get(i10).key, true);
        }
    }

    public void removeImage(String str) {
        this.bitmapUseCounts.remove(str);
        this.memCache.remove(str);
        this.smallImagesMemCache.remove(str);
    }

    public void removeTestWebFile(String str) {
        if (str == null) {
            return;
        }
        this.testWebFile.remove(str);
    }

    public void replaceImageInCache(String str, String str2, ImageLocation imageLocation, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new ok(this, str, str2, imageLocation, 8));
        } else {
            lambda$replaceImageInCache$5(str, str2, imageLocation);
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, float f9, float f10, int i10, boolean z10, boolean z11) {
        return scaleAndSaveImage(photoSize, bitmap, Bitmap.CompressFormat.JPEG, false, f9, f10, i10, z10, 0, 0, z11);
    }

    public void checkMediaPaths(Runnable runnable) {
        pe.c cVar = this.cacheOutQueue;
        cVar.a.execute(new c2(13, this, runnable));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0365 A[EDGE_INSN: B:191:0x0365->B:192:0x0365 BREAK  A[LOOP:0: B:102:0x01fe->B:110:0x0359], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadImageForImageReceiver(ImageReceiver imageReceiver, List<ImageReceiver> list) {
        String str;
        boolean z10;
        boolean z11;
        String imageKey;
        boolean z12;
        String thumbKey;
        ImageReceiver imageReceiver2;
        boolean z13;
        Object parentObject;
        ImageLocation thumbLocation;
        ImageLocation mediaLocation;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        boolean z14;
        String str2;
        String ext;
        ImageLocation imageLocation3;
        String str3;
        String str4;
        int i10;
        ImageLocation imageLocation4;
        ImageLocation imageLocation5;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i11;
        int i12;
        String str11;
        ImageLocation imageLocation6;
        int i13;
        boolean z15;
        boolean z16;
        ImageLocation imageLocation7;
        String str12;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable findInPreloadImageReceivers;
        ImageReceiver imageReceiver3 = imageReceiver;
        if (imageReceiver3 == null) {
            return;
        }
        String mediaKey = imageReceiver3.getMediaKey();
        int newGuid = imageReceiver3.getNewGuid();
        if (mediaKey != null) {
            ImageLocation mediaLocation2 = imageReceiver3.getMediaLocation();
            BitmapDrawable findInPreloadImageReceivers2 = findInPreloadImageReceivers(mediaKey, list);
            if (findInPreloadImageReceivers2 == null) {
                if (useLottieMemCache(mediaLocation2, mediaKey)) {
                    findInPreloadImageReceivers2 = getFromLottieCache(mediaKey);
                } else {
                    BitmapDrawable bitmapDrawable2 = this.memCache.get(mediaKey);
                    if (bitmapDrawable2 != null) {
                        this.memCache.moveToFront(mediaKey);
                    }
                    if (bitmapDrawable2 == null && (bitmapDrawable2 = this.smallImagesMemCache.get(mediaKey)) != null) {
                        this.smallImagesMemCache.moveToFront(mediaKey);
                    }
                    findInPreloadImageReceivers2 = bitmapDrawable2;
                    if (findInPreloadImageReceivers2 == null && (findInPreloadImageReceivers2 = this.wallpaperMemCache.get(mediaKey)) != null) {
                        this.wallpaperMemCache.moveToFront(mediaKey);
                    }
                }
            }
            Drawable drawable = findInPreloadImageReceivers2;
            if ((drawable instanceof xi0 ? ((xi0) drawable).s() : drawable instanceof org.telegram.ui.Components.c6 ? ((org.telegram.ui.Components.c6) drawable).s() : true) && drawable != null) {
                cancelLoadingForImageReceiver(imageReceiver3, true);
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                if (!imageReceiver.isForcePreview()) {
                    return;
                }
                imageReceiver3 = imageReceiver;
                str = mediaKey;
                z10 = true;
                z11 = false;
                imageKey = imageReceiver3.getImageKey();
                if (!z10) {
                    ImageLocation imageLocation8 = imageReceiver3.getImageLocation();
                    findInPreloadImageReceivers = findInPreloadImageReceivers(imageKey, list);
                    if (findInPreloadImageReceivers == null) {
                        findInPreloadImageReceivers = getFromLottieCache(imageKey);
                    }
                    if (findInPreloadImageReceivers == null) {
                    }
                    if (findInPreloadImageReceivers != null) {
                    }
                }
                z12 = z10;
                thumbKey = imageReceiver.getThumbKey();
                if (thumbKey != null) {
                }
                imageReceiver2 = imageReceiver;
                z13 = false;
                parentObject = imageReceiver2.getParentObject();
                TLRPC.Document qualityThumbDocument = imageReceiver2.getQualityThumbDocument();
                thumbLocation = imageReceiver2.getThumbLocation();
                String thumbFilter = imageReceiver2.getThumbFilter();
                mediaLocation = imageReceiver2.getMediaLocation();
                String mediaFilter = imageReceiver2.getMediaFilter();
                imageLocation = imageReceiver2.getImageLocation();
                String imageFilter = imageReceiver2.getImageFilter();
                if (imageLocation == null) {
                }
                imageLocation2 = imageLocation;
                z14 = false;
                String str13 = null;
                String str14 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                if (mediaLocation == null) {
                }
                ext = imageReceiver2.getExt();
                if (ext == null) {
                }
                if (str14 == null) {
                }
                if (str2 == null) {
                }
                boolean z17 = z13;
                imageLocation3 = mediaLocation;
                boolean z18 = z14;
                str3 = null;
                str4 = null;
                String str15 = null;
                String str16 = null;
                i10 = 0;
                boolean z19 = false;
                while (true) {
                    imageLocation4 = imageLocation;
                    if (i10 >= 2) {
                    }
                    i10 = i12 + 1;
                    imageLocation = imageLocation4;
                    newGuid = i13;
                    z11 = z15;
                    z12 = z16;
                }
                imageLocation5 = imageLocation2;
                int i14 = newGuid;
                boolean z20 = z11;
                boolean z21 = z12;
                if (thumbLocation != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                if (str5 != null) {
                }
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                String str17 = str4;
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                String str18 = str3;
                if (imageLocation5 == null) {
                }
                if (imageLocation3 == null) {
                }
            } else if (drawable != null) {
                imageReceiver3 = imageReceiver;
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                str = mediaKey;
                z10 = false;
                z11 = true;
                imageKey = imageReceiver3.getImageKey();
                if (!z10 && imageKey != null) {
                    ImageLocation imageLocation82 = imageReceiver3.getImageLocation();
                    findInPreloadImageReceivers = findInPreloadImageReceivers(imageKey, list);
                    if (findInPreloadImageReceivers == null && useLottieMemCache(imageLocation82, imageKey)) {
                        findInPreloadImageReceivers = getFromLottieCache(imageKey);
                    }
                    if (findInPreloadImageReceivers == null) {
                        BitmapDrawable bitmapDrawable3 = this.memCache.get(imageKey);
                        if (bitmapDrawable3 != null) {
                            this.memCache.moveToFront(imageKey);
                        }
                        if (bitmapDrawable3 == null && (bitmapDrawable3 = this.smallImagesMemCache.get(imageKey)) != null) {
                            this.smallImagesMemCache.moveToFront(imageKey);
                        }
                        findInPreloadImageReceivers = bitmapDrawable3;
                        if (findInPreloadImageReceivers == null && (findInPreloadImageReceivers = this.wallpaperMemCache.get(imageKey)) != null) {
                            this.wallpaperMemCache.moveToFront(imageKey);
                        }
                    }
                    if (findInPreloadImageReceivers != null) {
                        cancelLoadingForImageReceiver(imageReceiver3, true);
                        imageReceiver3.setImageBitmapByKey(findInPreloadImageReceivers, imageKey, 0, true, newGuid);
                        if (!imageReceiver.isForcePreview() && (str == null || z11)) {
                            return;
                        }
                        z12 = true;
                        thumbKey = imageReceiver.getThumbKey();
                        if (thumbKey != null) {
                            if (useLottieMemCache(imageReceiver.getThumbLocation(), thumbKey)) {
                                bitmapDrawable = getFromLottieCache(thumbKey);
                            } else {
                                bitmapDrawable = this.memCache.get(thumbKey);
                                if (bitmapDrawable != null) {
                                    this.memCache.moveToFront(thumbKey);
                                }
                                if (bitmapDrawable == null && (bitmapDrawable = this.smallImagesMemCache.get(thumbKey)) != null) {
                                    this.smallImagesMemCache.moveToFront(thumbKey);
                                }
                                if (bitmapDrawable == null && (bitmapDrawable = this.wallpaperMemCache.get(thumbKey)) != null) {
                                    this.wallpaperMemCache.moveToFront(thumbKey);
                                }
                            }
                            BitmapDrawable bitmapDrawable4 = bitmapDrawable;
                            if (bitmapDrawable4 != null) {
                                imageReceiver2 = imageReceiver;
                                imageReceiver2.setImageBitmapByKey(bitmapDrawable4, thumbKey, 1, true, newGuid);
                                cancelLoadingForImageReceiver(imageReceiver2, false);
                                if (z12 && imageReceiver2.isForcePreview()) {
                                    return;
                                }
                                z13 = true;
                                parentObject = imageReceiver2.getParentObject();
                                TLRPC.Document qualityThumbDocument2 = imageReceiver2.getQualityThumbDocument();
                                thumbLocation = imageReceiver2.getThumbLocation();
                                String thumbFilter2 = imageReceiver2.getThumbFilter();
                                mediaLocation = imageReceiver2.getMediaLocation();
                                String mediaFilter2 = imageReceiver2.getMediaFilter();
                                imageLocation = imageReceiver2.getImageLocation();
                                String imageFilter2 = imageReceiver2.getImageFilter();
                                if (imageLocation == null && imageReceiver2.isNeedsQualityThumb() && imageReceiver2.isCurrentKeyQuality()) {
                                    if (!(parentObject instanceof MessageObject)) {
                                        imageLocation2 = ImageLocation.getForDocument(((MessageObject) parentObject).getDocument());
                                    } else if (qualityThumbDocument2 != null) {
                                        imageLocation2 = ImageLocation.getForDocument(qualityThumbDocument2);
                                    }
                                    z14 = true;
                                    String str132 = null;
                                    String str142 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                                    str2 = (mediaLocation == null && mediaLocation.imageType == 2) ? "mp4" : null;
                                    ext = imageReceiver2.getExt();
                                    if (ext == null) {
                                        ext = "jpg";
                                    }
                                    String str19 = str142 == null ? ext : str142;
                                    if (str2 == null) {
                                        str2 = ext;
                                    }
                                    boolean z172 = z13;
                                    imageLocation3 = mediaLocation;
                                    boolean z182 = z14;
                                    str3 = null;
                                    str4 = null;
                                    String str152 = null;
                                    String str162 = null;
                                    i10 = 0;
                                    boolean z192 = false;
                                    while (true) {
                                        imageLocation4 = imageLocation;
                                        if (i10 >= 2) {
                                            break;
                                        }
                                        if (i10 == 0) {
                                            imageLocation6 = imageLocation2;
                                            i12 = i10;
                                            str11 = str19;
                                        } else {
                                            i12 = i10;
                                            str11 = str2;
                                            imageLocation6 = imageLocation3;
                                        }
                                        if (imageLocation6 == null) {
                                            i13 = newGuid;
                                            z15 = z11;
                                        } else {
                                            i13 = newGuid;
                                            z15 = z11;
                                            String key = imageLocation6.getKey(parentObject, imageLocation3 != null ? imageLocation3 : imageLocation2, false);
                                            if (key != null) {
                                                z16 = z12;
                                                String key2 = imageLocation6.getKey(parentObject, imageLocation3 != null ? imageLocation3 : imageLocation2, true);
                                                if (imageLocation6.path != null) {
                                                    StringBuilder f9 = u3.c.f(key2, ".");
                                                    f9.append(getHttpUrlExtension(imageLocation6.path, "jpg"));
                                                    key2 = f9.toString();
                                                    imageLocation7 = imageLocation2;
                                                } else {
                                                    TLRPC.PhotoSize photoSize = imageLocation6.photoSize;
                                                    imageLocation7 = imageLocation2;
                                                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                        key2 = a4.w.y(key2, ".", str11);
                                                    } else {
                                                        if (imageLocation6.location != null) {
                                                            String y8 = a4.w.y(key2, ".", str11);
                                                            if (imageReceiver.getExt() == null) {
                                                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation6.location;
                                                                if (tL_fileLocationToBeDeprecated.key == null) {
                                                                    str12 = y8;
                                                                    if (tL_fileLocationToBeDeprecated.volume_id != -2147483648L || tL_fileLocationToBeDeprecated.local_id >= 0) {
                                                                        key2 = str12;
                                                                    }
                                                                    key2 = str12;
                                                                    z192 = true;
                                                                }
                                                            }
                                                            str12 = y8;
                                                            key2 = str12;
                                                            z192 = true;
                                                        } else {
                                                            WebFile webFile = imageLocation6.webFile;
                                                            if (webFile != null) {
                                                                String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
                                                                StringBuilder f10 = u3.c.f(key2, ".");
                                                                f10.append(getHttpUrlExtension(imageLocation6.webFile.url, mimeTypePart));
                                                                key2 = f10.toString();
                                                            } else if (imageLocation6.secureDocument != null) {
                                                                key2 = a4.w.y(key2, ".", str11);
                                                            } else if (imageLocation6.document != null) {
                                                                if (i12 == 0 && z182) {
                                                                    key = "q_".concat(key);
                                                                }
                                                                String documentFileName = FileLoader.getDocumentFileName(imageLocation6.document);
                                                                int lastIndexOf = documentFileName.lastIndexOf(46);
                                                                String str20 = "";
                                                                String substring = lastIndexOf == -1 ? "" : documentFileName.substring(lastIndexOf);
                                                                if (substring.length() > 1) {
                                                                    str20 = substring;
                                                                } else if ("video/mp4".equals(imageLocation6.document.mime_type)) {
                                                                    str20 = ".mp4";
                                                                } else if ("video/x-matroska".equals(imageLocation6.document.mime_type)) {
                                                                    str20 = ".mkv";
                                                                }
                                                                key2 = u3.c.k(key2, str20);
                                                                if (MessageObject.isVideoDocument(imageLocation6.document) || MessageObject.isGifDocument(imageLocation6.document) || MessageObject.isRoundVideoDocument(imageLocation6.document) || MessageObject.canPreviewDocument(imageLocation6.document)) {
                                                                    z192 = false;
                                                                }
                                                                z192 = true;
                                                            } else if (parentObject instanceof TLRPC.StickerSet) {
                                                                key2 = a4.w.y(key2, ".", str11);
                                                            }
                                                        }
                                                        i10 = i12 + 1;
                                                        imageLocation = imageLocation4;
                                                        newGuid = i13;
                                                        z11 = z15;
                                                        z12 = z16;
                                                    }
                                                }
                                                if (i12 == 0) {
                                                    str4 = key;
                                                    str152 = key2;
                                                } else {
                                                    str3 = key;
                                                    str162 = key2;
                                                }
                                                if (imageLocation6 == thumbLocation) {
                                                    if (i12 == 0) {
                                                        str4 = null;
                                                        imageLocation2 = null;
                                                        str152 = null;
                                                        i10 = i12 + 1;
                                                        imageLocation = imageLocation4;
                                                        newGuid = i13;
                                                        z11 = z15;
                                                        z12 = z16;
                                                    } else {
                                                        str3 = null;
                                                        imageLocation3 = null;
                                                        str162 = null;
                                                    }
                                                }
                                                imageLocation2 = imageLocation7;
                                                i10 = i12 + 1;
                                                imageLocation = imageLocation4;
                                                newGuid = i13;
                                                z11 = z15;
                                                z12 = z16;
                                            }
                                        }
                                        z16 = z12;
                                        i10 = i12 + 1;
                                        imageLocation = imageLocation4;
                                        newGuid = i13;
                                        z11 = z15;
                                        z12 = z16;
                                    }
                                    imageLocation5 = imageLocation2;
                                    int i142 = newGuid;
                                    boolean z202 = z11;
                                    boolean z212 = z12;
                                    if (thumbLocation != null) {
                                        ImageLocation strippedLocation = imageReceiver.getStrippedLocation();
                                        if (strippedLocation == null) {
                                            strippedLocation = imageLocation3 != null ? imageLocation3 : imageLocation4;
                                        }
                                        String key3 = thumbLocation.getKey(parentObject, strippedLocation, false);
                                        String key4 = thumbLocation.getKey(parentObject, strippedLocation, true);
                                        if (thumbLocation.path != null) {
                                            StringBuilder f11 = u3.c.f(key4, ".");
                                            f11.append(getHttpUrlExtension(thumbLocation.path, "jpg"));
                                            key4 = f11.toString();
                                        } else {
                                            TLRPC.PhotoSize photoSize2 = thumbLocation.photoSize;
                                            if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize)) {
                                                key4 = a4.w.y(key4, ".", ext);
                                            } else if (thumbLocation.location != null) {
                                                key4 = a4.w.y(key4, ".", ext);
                                            }
                                        }
                                        str132 = key4;
                                        str5 = key3;
                                    } else {
                                        str5 = null;
                                    }
                                    if (str3 != null && mediaFilter2 != null) {
                                        str3 = a4.w.y(str3, "@", mediaFilter2);
                                    }
                                    if (str4 != null && imageFilter2 != null) {
                                        str4 = a4.w.y(str4, "@", imageFilter2);
                                    }
                                    if (str5 != null && thumbFilter2 != null) {
                                        str5 = a4.w.y(str5, "@", thumbFilter2);
                                    }
                                    if (imageReceiver.getUniqKeyPrefix() != null && str4 != null) {
                                        str4 = imageReceiver.getUniqKeyPrefix() + str4;
                                    }
                                    String str172 = str4;
                                    if (imageReceiver.getUniqKeyPrefix() != null && str3 != null) {
                                        str3 = imageReceiver.getUniqKeyPrefix() + str3;
                                    }
                                    String str182 = str3;
                                    if (imageLocation5 == null) {
                                        str6 = ext;
                                        str7 = str5;
                                        str8 = str132;
                                        str9 = str19;
                                        str10 = str152;
                                        i11 = i142;
                                    } else {
                                        if (imageLocation5.path != null) {
                                            createLoadOperationForImageReceiver(imageReceiver, str5, str132, ext, thumbLocation, thumbFilter2, 0L, 1, 1, z172 ? 2 : 1, i142);
                                            createLoadOperationForImageReceiver(imageReceiver, str172, str152, str19, imageLocation5, imageFilter2, imageReceiver.getSize(), 1, 0, 0, i142);
                                            return;
                                        }
                                        imageLocation5 = imageLocation5;
                                        str7 = str5;
                                        str8 = str132;
                                        str9 = str19;
                                        str10 = str152;
                                        i11 = i142;
                                        str6 = ext;
                                    }
                                    if (imageLocation3 == null) {
                                        int cacheType = imageReceiver.getCacheType();
                                        int i15 = (cacheType == 0 && z192) ? 1 : cacheType;
                                        createLoadOperationForImageReceiver(imageReceiver, str7, str8, str6, thumbLocation, thumbFilter2, 0L, i15 == 0 ? 1 : i15, 1, z172 ? 2 : 1, i11);
                                        createLoadOperationForImageReceiver(imageReceiver, str172, str10, str9, imageLocation5, imageFilter2, imageReceiver.getSize(), i15, 0, 0, i11);
                                        return;
                                    }
                                    int cacheType2 = imageReceiver.getCacheType();
                                    int i16 = (cacheType2 == 0 && z192) ? 1 : cacheType2;
                                    int i17 = i16 == 0 ? 1 : i16;
                                    if (!z172) {
                                        createLoadOperationForImageReceiver(imageReceiver, str7, str8, str6, thumbLocation, thumbFilter2, 0L, i17, 1, 1, i11);
                                    }
                                    if (!z212) {
                                        createLoadOperationForImageReceiver(imageReceiver, str172, str10, str9, imageLocation5, imageFilter2, 0L, 1, 0, 0, i11);
                                    }
                                    if (z202) {
                                        return;
                                    }
                                    createLoadOperationForImageReceiver(imageReceiver, str182, str162, str2, imageLocation3, mediaFilter2, imageReceiver.getSize(), i16, 3, 0, i11);
                                    return;
                                }
                                imageLocation2 = imageLocation;
                                z14 = false;
                                String str1322 = null;
                                String str1422 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                                if (mediaLocation == null) {
                                }
                                ext = imageReceiver2.getExt();
                                if (ext == null) {
                                }
                                if (str1422 == null) {
                                }
                                if (str2 == null) {
                                }
                                boolean z1722 = z13;
                                imageLocation3 = mediaLocation;
                                boolean z1822 = z14;
                                str3 = null;
                                str4 = null;
                                String str1522 = null;
                                String str1622 = null;
                                i10 = 0;
                                boolean z1922 = false;
                                while (true) {
                                    imageLocation4 = imageLocation;
                                    if (i10 >= 2) {
                                    }
                                    i10 = i12 + 1;
                                    imageLocation = imageLocation4;
                                    newGuid = i13;
                                    z11 = z15;
                                    z12 = z16;
                                }
                                imageLocation5 = imageLocation2;
                                int i1422 = newGuid;
                                boolean z2022 = z11;
                                boolean z2122 = z12;
                                if (thumbLocation != null) {
                                }
                                if (str3 != null) {
                                    str3 = a4.w.y(str3, "@", mediaFilter2);
                                }
                                if (str4 != null) {
                                    str4 = a4.w.y(str4, "@", imageFilter2);
                                }
                                if (str5 != null) {
                                    str5 = a4.w.y(str5, "@", thumbFilter2);
                                }
                                if (imageReceiver.getUniqKeyPrefix() != null) {
                                    str4 = imageReceiver.getUniqKeyPrefix() + str4;
                                }
                                String str1722 = str4;
                                if (imageReceiver.getUniqKeyPrefix() != null) {
                                    str3 = imageReceiver.getUniqKeyPrefix() + str3;
                                }
                                String str1822 = str3;
                                if (imageLocation5 == null) {
                                }
                                if (imageLocation3 == null) {
                                }
                            }
                        }
                        imageReceiver2 = imageReceiver;
                        z13 = false;
                        parentObject = imageReceiver2.getParentObject();
                        TLRPC.Document qualityThumbDocument22 = imageReceiver2.getQualityThumbDocument();
                        thumbLocation = imageReceiver2.getThumbLocation();
                        String thumbFilter22 = imageReceiver2.getThumbFilter();
                        mediaLocation = imageReceiver2.getMediaLocation();
                        String mediaFilter22 = imageReceiver2.getMediaFilter();
                        imageLocation = imageReceiver2.getImageLocation();
                        String imageFilter22 = imageReceiver2.getImageFilter();
                        if (imageLocation == null) {
                            if (!(parentObject instanceof MessageObject)) {
                            }
                            z14 = true;
                            String str13222 = null;
                            String str14222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                            if (mediaLocation == null) {
                            }
                            ext = imageReceiver2.getExt();
                            if (ext == null) {
                            }
                            if (str14222 == null) {
                            }
                            if (str2 == null) {
                            }
                            boolean z17222 = z13;
                            imageLocation3 = mediaLocation;
                            boolean z18222 = z14;
                            str3 = null;
                            str4 = null;
                            String str15222 = null;
                            String str16222 = null;
                            i10 = 0;
                            boolean z19222 = false;
                            while (true) {
                                imageLocation4 = imageLocation;
                                if (i10 >= 2) {
                                }
                                i10 = i12 + 1;
                                imageLocation = imageLocation4;
                                newGuid = i13;
                                z11 = z15;
                                z12 = z16;
                            }
                            imageLocation5 = imageLocation2;
                            int i14222 = newGuid;
                            boolean z20222 = z11;
                            boolean z21222 = z12;
                            if (thumbLocation != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str5 != null) {
                            }
                            if (imageReceiver.getUniqKeyPrefix() != null) {
                            }
                            String str17222 = str4;
                            if (imageReceiver.getUniqKeyPrefix() != null) {
                            }
                            String str18222 = str3;
                            if (imageLocation5 == null) {
                            }
                            if (imageLocation3 == null) {
                            }
                        }
                        imageLocation2 = imageLocation;
                        z14 = false;
                        String str132222 = null;
                        String str142222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                        if (mediaLocation == null) {
                        }
                        ext = imageReceiver2.getExt();
                        if (ext == null) {
                        }
                        if (str142222 == null) {
                        }
                        if (str2 == null) {
                        }
                        boolean z172222 = z13;
                        imageLocation3 = mediaLocation;
                        boolean z182222 = z14;
                        str3 = null;
                        str4 = null;
                        String str152222 = null;
                        String str162222 = null;
                        i10 = 0;
                        boolean z192222 = false;
                        while (true) {
                            imageLocation4 = imageLocation;
                            if (i10 >= 2) {
                            }
                            i10 = i12 + 1;
                            imageLocation = imageLocation4;
                            newGuid = i13;
                            z11 = z15;
                            z12 = z16;
                        }
                        imageLocation5 = imageLocation2;
                        int i142222 = newGuid;
                        boolean z202222 = z11;
                        boolean z212222 = z12;
                        if (thumbLocation != null) {
                        }
                        if (str3 != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str5 != null) {
                        }
                        if (imageReceiver.getUniqKeyPrefix() != null) {
                        }
                        String str172222 = str4;
                        if (imageReceiver.getUniqKeyPrefix() != null) {
                        }
                        String str182222 = str3;
                        if (imageLocation5 == null) {
                        }
                        if (imageLocation3 == null) {
                        }
                    }
                }
                z12 = z10;
                thumbKey = imageReceiver.getThumbKey();
                if (thumbKey != null) {
                }
                imageReceiver2 = imageReceiver;
                z13 = false;
                parentObject = imageReceiver2.getParentObject();
                TLRPC.Document qualityThumbDocument222 = imageReceiver2.getQualityThumbDocument();
                thumbLocation = imageReceiver2.getThumbLocation();
                String thumbFilter222 = imageReceiver2.getThumbFilter();
                mediaLocation = imageReceiver2.getMediaLocation();
                String mediaFilter222 = imageReceiver2.getMediaFilter();
                imageLocation = imageReceiver2.getImageLocation();
                String imageFilter222 = imageReceiver2.getImageFilter();
                if (imageLocation == null) {
                }
                imageLocation2 = imageLocation;
                z14 = false;
                String str1322222 = null;
                String str1422222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                if (mediaLocation == null) {
                }
                ext = imageReceiver2.getExt();
                if (ext == null) {
                }
                if (str1422222 == null) {
                }
                if (str2 == null) {
                }
                boolean z1722222 = z13;
                imageLocation3 = mediaLocation;
                boolean z1822222 = z14;
                str3 = null;
                str4 = null;
                String str1522222 = null;
                String str1622222 = null;
                i10 = 0;
                boolean z1922222 = false;
                while (true) {
                    imageLocation4 = imageLocation;
                    if (i10 >= 2) {
                    }
                    i10 = i12 + 1;
                    imageLocation = imageLocation4;
                    newGuid = i13;
                    z11 = z15;
                    z12 = z16;
                }
                imageLocation5 = imageLocation2;
                int i1422222 = newGuid;
                boolean z2022222 = z11;
                boolean z2122222 = z12;
                if (thumbLocation != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                if (str5 != null) {
                }
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                String str1722222 = str4;
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                String str1822222 = str3;
                if (imageLocation5 == null) {
                }
                if (imageLocation3 == null) {
                }
            } else {
                imageReceiver3 = imageReceiver;
            }
        }
        str = mediaKey;
        z10 = false;
        z11 = false;
        imageKey = imageReceiver3.getImageKey();
        if (!z10) {
        }
        z12 = z10;
        thumbKey = imageReceiver.getThumbKey();
        if (thumbKey != null) {
        }
        imageReceiver2 = imageReceiver;
        z13 = false;
        parentObject = imageReceiver2.getParentObject();
        TLRPC.Document qualityThumbDocument2222 = imageReceiver2.getQualityThumbDocument();
        thumbLocation = imageReceiver2.getThumbLocation();
        String thumbFilter2222 = imageReceiver2.getThumbFilter();
        mediaLocation = imageReceiver2.getMediaLocation();
        String mediaFilter2222 = imageReceiver2.getMediaFilter();
        imageLocation = imageReceiver2.getImageLocation();
        String imageFilter2222 = imageReceiver2.getImageFilter();
        if (imageLocation == null) {
        }
        imageLocation2 = imageLocation;
        z14 = false;
        String str13222222 = null;
        String str14222222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
        if (mediaLocation == null) {
        }
        ext = imageReceiver2.getExt();
        if (ext == null) {
        }
        if (str14222222 == null) {
        }
        if (str2 == null) {
        }
        boolean z17222222 = z13;
        imageLocation3 = mediaLocation;
        boolean z18222222 = z14;
        str3 = null;
        str4 = null;
        String str15222222 = null;
        String str16222222 = null;
        i10 = 0;
        boolean z19222222 = false;
        while (true) {
            imageLocation4 = imageLocation;
            if (i10 >= 2) {
            }
            i10 = i12 + 1;
            imageLocation = imageLocation4;
            newGuid = i13;
            z11 = z15;
            z12 = z16;
        }
        imageLocation5 = imageLocation2;
        int i14222222 = newGuid;
        boolean z20222222 = z11;
        boolean z21222222 = z12;
        if (thumbLocation != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        if (str5 != null) {
        }
        if (imageReceiver.getUniqKeyPrefix() != null) {
        }
        String str17222222 = str4;
        if (imageReceiver.getUniqKeyPrefix() != null) {
        }
        String str18222222 = str3;
        if (imageLocation5 == null) {
        }
        if (imageLocation3 == null) {
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f9, float f10, int i10, boolean z10, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f9, f10, i10, z10, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f9, float f10, boolean z10, int i10, boolean z11, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, z10, f9, f10, i10, z11, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f9, float f10, int i10, boolean z10, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, compressFormat, false, f9, f10, i10, z10, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10, float f9, float f10, int i10, boolean z11, int i11, int i12, boolean z12) {
        boolean z13;
        float f11;
        int i13;
        int i14;
        float max;
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width != 0.0f && height != 0.0f) {
            float max2 = Math.max(width / f9, height / f10);
            if (i11 != 0 && i12 != 0) {
                float f12 = i11;
                if (width < f12 || height < i12) {
                    if (width >= f12 || height <= i12) {
                        if (width > f12) {
                            float f13 = i12;
                            if (height < f13) {
                                max = height / f13;
                            }
                        }
                        max = Math.max(width / f12, height / i12);
                    } else {
                        max = width / f12;
                    }
                    max2 = max;
                    z13 = true;
                    f11 = max2;
                    i13 = (int) (width / f11);
                    i14 = (int) (height / f11);
                    if (i14 != 0 && i13 != 0) {
                        try {
                            return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f11, i10, z11, z13, z12);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            getInstance().clearMemory();
                            System.gc();
                            try {
                                return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f11, i10, z11, z13, z12);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                            }
                        }
                    }
                }
            }
            z13 = false;
            f11 = max2;
            i13 = (int) (width / f11);
            i14 = (int) (height / f11);
            if (i14 != 0) {
                return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f11, i10, z11, z13, z12);
            }
        }
        return null;
    }

    private static TLRPC.PhotoSize findPhotoCachedSize(TLRPC.MessageMedia messageMedia) {
        int i10 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i10 < size) {
                TLRPC.PhotoSize photoSize = messageMedia.photo.sizes.get(i10);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i10++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i10 < size2) {
                TLRPC.PhotoSize photoSize2 = messageMedia.document.thumbs.get(i10);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i10++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo == null) {
                return null;
            }
            int size3 = photo.sizes.size();
            while (i10 < size3) {
                TLRPC.PhotoSize photoSize3 = messageMedia.webpage.photo.sizes.get(i10);
                if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize3;
                }
                i10++;
            }
            return null;
        }
        if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (messageMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) messageMedia.extended_media.get(0)).thumb;
        }
        return null;
    }

    public static void saveMessageThumbs(TLRPC.Message message, TLRPC.MessageMedia messageMedia) {
        TLRPC.PhotoSize findPhotoCachedSize;
        byte[] bArr;
        TLRPC.PhotoSize tL_photoSize_layer127;
        if (message == null || messageMedia == null || (findPhotoCachedSize = findPhotoCachedSize(messageMedia)) == null || (bArr = findPhotoCachedSize.bytes) == null || bArr.length == 0) {
            return;
        }
        TLRPC.FileLocation fileLocation = findPhotoCachedSize.location;
        if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            findPhotoCachedSize.location = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        }
        int i10 = 0;
        if (findPhotoCachedSize.h <= 50 && findPhotoCachedSize.w <= 50) {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = findPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.w = findPhotoCachedSize.w;
        } else {
            boolean z10 = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z10 = false;
            }
            if (!pathToAttach.exists()) {
                if (z10) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(FileLoader.getInternalCacheDir(), pathToAttach.getName() + ".key"), "rws");
                        long length = randomAccessFile.length();
                        byte[] bArr2 = new byte[32];
                        byte[] bArr3 = new byte[16];
                        if (length > 0 && length % 48 == 0) {
                            randomAccessFile.read(bArr2, 0, 32);
                            randomAccessFile.read(bArr3, 0, 16);
                        } else {
                            Utilities.random.nextBytes(bArr2);
                            Utilities.random.nextBytes(bArr3);
                            randomAccessFile.write(bArr2);
                            randomAccessFile.write(bArr3);
                        }
                        randomAccessFile.close();
                        Utilities.aesCtrDecryptionByteArray(findPhotoCachedSize.bytes, bArr2, bArr3, 0, r7.length, 0);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pathToAttach, "rws");
                randomAccessFile2.write(findPhotoCachedSize.bytes);
                randomAccessFile2.close();
            }
            tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = findPhotoCachedSize.w;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.size = findPhotoCachedSize.size;
            tL_photoSize_layer127.type = findPhotoCachedSize.type;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i10 < size) {
                if (messageMedia.photo.sizes.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.photo.sizes.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia.document.thumbs.size();
            while (i10 < size2) {
                if (messageMedia.document.thumbs.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.document.thumbs.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia.webpage.photo.sizes.size();
            while (i10 < size3) {
                if (messageMedia.webpage.photo.sizes.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.webpage.photo.sizes.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
        }
    }
}
