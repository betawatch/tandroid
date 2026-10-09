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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.w21;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class ImageLoader {
    public static final String AUTOPLAY_FILTER = "g";
    public static final String AUTOPLAY_FILTER_NONLOOP = "gl";
    public static final int CACHE_TYPE_CACHE = 1;
    public static final int CACHE_TYPE_ENCRYPTED = 2;
    public static final int CACHE_TYPE_NONE = 0;
    private static final boolean DEBUG_MODE = false;
    private static Bitmap strippedPhotoFallbackBitmap;
    private gf.c cacheOutQueue;
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
    ArrayList<org.telegram.ui.Components.f6> cachedAnimatedFileDrawables = new ArrayList<>();
    private HashMap<String, CacheImage> imageLoadingByUrl = new HashMap<>();
    private HashMap<String, CacheImage> imageLoadingByUrlPframe = new HashMap<>();
    public ConcurrentHashMap<String, CacheImage> imageLoadingByKeys = new ConcurrentHashMap<>();
    public HashSet<String> imageLoadingKeys = new HashSet<>();
    private SparseArray<CacheImage> imageLoadingByTag = new SparseArray<>();
    private HashMap<String, ThumbGenerateInfo> waitingForQualityThumb = new HashMap<>();
    private SparseArray<String> waitingForQualityThumbByTag = new SparseArray<>();
    private LinkedList<HttpImageTask> httpTasks = new LinkedList<>();
    private LinkedList<ArtworkLoadTask> artworkTasks = new LinkedList<>();

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                long j3 = fileMetadataFromParent.dialogId;
                if (SaveToGallerySettingsHelper.needSave(j3 >= 0 ? 1 : ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) ? 4 : 2, fileMetadataFromParent, messageObject, i10)) {
                    AndroidUtilities.addMediaToGallery(file.toString());
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, str, file);
            ImageLoader.this.fileDidLoaded(str, file, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileDidUploaded$1(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploaded, str, inputFile, inputEncryptedFile, bArr, bArr2, Long.valueOf(j3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidUploaded$2(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
            AndroidUtilities.runOnUIThread(new z4(i10, str, inputFile, inputEncryptedFile, bArr, bArr2, j3));
            ImageLoader.this.fileProgresses.remove(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [gf.b] */
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
                    gf.c cVar = ImageLoader.this.cacheOutQueue;
                    int i12 = cacheOutTask.cacheImage.priority;
                    if (i12 != 1) {
                        cVar.getClass();
                        cacheOutTask = new gf.b(i12, cacheOutTask);
                    }
                    cVar.a.execute(cacheOutTask);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileLoadProgressChanged$8(int i10, String str, long j3, long j10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, str, Long.valueOf(j3), Long.valueOf(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileUploadProgressChanged$0(int i10, String str, long j3, long j10, boolean z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z10));
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
        public void fileDidUploaded(final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j3) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i10 = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.a5
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.this.lambda$fileDidUploaded$2(i10, str, inputFile, inputEncryptedFile, bArr, bArr2, j3);
                }
            });
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j3, long j10) {
            int i10 = 1;
            ImageLoader.this.fileProgresses.put(str, new long[]{j3, j10});
            if (!ImageLoader.this.imageLoadingByUrlPframe.isEmpty() && fileLoadOperation.checkPrefixPreloadFinished()) {
                ImageLoader.this.imageLoadQueue.postRunnable(new g0(this, str, fileLoadOperation, i10));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = fileLoadOperation.lastProgressUpdateTime;
            if (j11 == 0 || j11 < elapsedRealtime - 500 || j3 == 0) {
                fileLoadOperation.lastProgressUpdateTime = elapsedRealtime;
                AndroidUtilities.runOnUIThread(new x4(this.val$currentAccount, str, j3, j10));
            }
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, String str, long j3, long j10, boolean z10) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j3, j10});
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = fileUploadOperation.lastProgressUpdateTime;
            if (j11 == 0 || j11 < elapsedRealtime - 100 || j3 == j10) {
                fileUploadOperation.lastProgressUpdateTime = elapsedRealtime;
                AndroidUtilities.runOnUIThread(new w4(this.val$currentAccount, str, j3, j10, z10));
            }
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
            f1 f1Var = new f1(this, 3);
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AndroidUtilities.runOnUIThread(f1Var, 1000L);
            } else {
                f1Var.run();
            }
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                    } catch (Exception e7) {
                        FileLog.e((Throwable) e7, false);
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void lambda$setImageAndClear$0(Drawable drawable, ArrayList arrayList, ArrayList arrayList2, String str) {
            boolean z10;
            boolean z11;
            char c10;
            org.telegram.ui.Components.f6 f6Var;
            Drawable drawable2 = drawable;
            if (drawable2 instanceof org.telegram.ui.Components.f6) {
                org.telegram.ui.Components.f6 f6Var2 = (org.telegram.ui.Components.f6) drawable2;
                if (!f6Var2.n0) {
                    boolean z12 = false;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i10);
                        if (i10 == 0) {
                            f6Var = f6Var2;
                            z10 = z12;
                            z11 = true;
                        } else {
                            AnimatedFileDrawableStream animatedFileDrawableStream = f6Var2.u0;
                            if (animatedFileDrawableStream != null) {
                                File file = f6Var2.G;
                                long j3 = f6Var2.H;
                                int i11 = f6Var2.I;
                                TLRPC.Document document = animatedFileDrawableStream.getDocument();
                                ImageLocation location = f6Var2.u0.getLocation();
                                Object parentObject = f6Var2.u0.getParentObject();
                                z10 = z12;
                                long j10 = f6Var2.M;
                                z11 = true;
                                int i12 = f6Var2.J;
                                c10 = 0;
                                AnimatedFileDrawableStream animatedFileDrawableStream2 = f6Var2.u0;
                                f6Var = new org.telegram.ui.Components.f6(file, false, j3, i11, document, location, parentObject, j10, i12, animatedFileDrawableStream2 != null && animatedFileDrawableStream2.isPreview());
                            } else {
                                z10 = z12;
                                z11 = true;
                                c10 = 0;
                                f6Var = new org.telegram.ui.Components.f6(f6Var2.G, false, f6Var2.H, f6Var2.I, f6Var2.o0, null, null, f6Var2.M, f6Var2.J, false);
                            }
                            int[] iArr = f6Var.d;
                            int[] iArr2 = f6Var2.d;
                            iArr[c10] = iArr2[c10];
                            iArr[z11 ? 1 : 0] = iArr2[z11 ? 1 : 0];
                        }
                        if (imageReceiver.setImageBitmapByKey(f6Var, this.key, this.type, false, ((Integer) arrayList2.get(i10)).intValue())) {
                            if (f6Var == f6Var2) {
                                z12 = z11;
                            }
                        } else if (f6Var != f6Var2) {
                            f6Var.u();
                        }
                        z12 = z10;
                    }
                    if (!z12) {
                        f6Var2.u();
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
            ?? r62;
            TLObject tLObject;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2;
            ?? r92;
            ?? r72;
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation != null) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
                if (tL_fileLocationToBeDeprecated3 != null) {
                    r92 = this.ext;
                    tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated3;
                    document = null;
                    r62 = null;
                    r72 = 0;
                } else {
                    TLRPC.Document document2 = imageLocation.document;
                    if (document2 != null) {
                        document = document2;
                        r62 = null;
                    } else {
                        SecureDocument secureDocument = imageLocation.secureDocument;
                        if (secureDocument != null) {
                            r62 = secureDocument;
                            document = null;
                            tL_fileLocationToBeDeprecated2 = null;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                            tLObject = tL_fileLocationToBeDeprecated2;
                            r92 = tL_fileLocationToBeDeprecated;
                            r72 = tLObject;
                        } else {
                            TLObject tLObject2 = imageLocation.webFile;
                            if (tLObject2 != null) {
                                tLObject = tLObject2;
                                document = null;
                                r62 = null;
                                tL_fileLocationToBeDeprecated = null;
                                r92 = tL_fileLocationToBeDeprecated;
                                r72 = tLObject;
                            } else {
                                document = null;
                                r62 = null;
                            }
                        }
                    }
                    tL_fileLocationToBeDeprecated2 = r62;
                    tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                    tLObject = tL_fileLocationToBeDeprecated2;
                    r92 = tL_fileLocationToBeDeprecated;
                    r72 = tLObject;
                }
                FileLoader.getInstance(this.currentAccount).changePriority(i10, document, r62, r72, tL_fileLocationToBeDeprecated, r92, null);
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
                        gf.c cVar = ImageLoader.this.cacheOutQueue;
                        CacheOutTask cacheOutTask = this.cacheTask;
                        if (cacheOutTask == null) {
                            cVar.getClass();
                        } else {
                            cVar.a.remove(cacheOutTask);
                        }
                        gf.c cVar2 = ImageLoader.this.cacheOutQueue;
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                int k10 = i0.a.k(wallPaperSettings2.background_color, 255);
                int k11 = i0.a.k(wallPaper.settings.second_background_color, 255);
                int averageColor = AndroidUtilities.getAverageColor(k10, k11);
                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.x9.d(wallPaper.settings.rotation), new int[]{k10, k11});
                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                gradientDrawable.draw(canvas);
                i10 = averageColor;
            } else {
                int k12 = i0.a.k(wallPaperSettings2.background_color, 255);
                int k13 = i0.a.k(wallPaper.settings.second_background_color, 255);
                int k14 = i0.a.k(wallPaper.settings.third_background_color, 255);
                int i11 = wallPaper.settings.fourth_background_color;
                int k15 = i11 == 0 ? 0 : i0.a.k(i11, 255);
                int g10 = cd0.g(k12, k13, k14, k15);
                cd0 cd0Var = new cd0();
                cd0Var.n(k12, k13, k14, k15);
                cd0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                cd0Var.t(bitmap, wallPaper.settings.intensity);
                cd0Var.draw(canvas);
                z10 = false;
                i10 = g10;
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
            if (drawable instanceof ck0) {
                ck0 ck0Var = (ck0) drawable;
                Drawable drawable4 = (Drawable) ImageLoader.this.lottieMemCache.get(this.cacheImage.key);
                if (drawable4 == null) {
                    ImageLoader.this.lottieMemCache.put(this.cacheImage.key, ck0Var);
                    drawable3 = ck0Var;
                } else {
                    ck0Var.C(false);
                    drawable3 = drawable4;
                }
                ImageLoader.this.incrementUseCount(this.cacheImage.key);
                str = this.cacheImage.key;
                drawable2 = drawable3;
            } else if (drawable instanceof org.telegram.ui.Components.f6) {
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) drawable;
                if (f6Var.n0) {
                    BitmapDrawable fromLottieCache = ImageLoader.this.getFromLottieCache(this.cacheImage.key);
                    if (fromLottieCache == null) {
                        ImageLoader.this.lottieMemCache.put(this.cacheImage.key, f6Var);
                        bitmapDrawable = f6Var;
                    } else {
                        f6Var.u();
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
            ImageLoader.this.imageLoadQueue.postRunnable(new g0(this, drawable2, str, 2), this.cacheImage.priority);
        }

        private void loadLastFrame(ck0 ck0Var, int i10, int i11, boolean z10, boolean z11) {
            Bitmap createBitmap;
            Canvas canvas;
            Drawable bitmapDrawable;
            if (z10 && z11) {
                float f7 = i10 * 1.2f;
                float f10 = i11 * 1.2f;
                createBitmap = Bitmap.createBitmap((int) f7, (int) f10, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
                canvas.scale(2.0f, 2.0f, f7 / 2.0f, f10 / 2.0f);
            } else {
                createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
            }
            ck0Var.b();
            Bitmap createBitmap2 = Bitmap.createBitmap(ck0Var.b, ck0Var.c, Bitmap.Config.ARGB_8888);
            ck0Var.C0 = z10 ? ck0Var.e[0] - 1 : 0;
            ck0Var.a(createBitmap2);
            ck0Var.c();
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
            ck0Var.C(false);
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

        /* JADX WARN: Can't wrap try/catch for region: R(14:903|(2:905|(12:907|908|909|(1:911)(1:933)|912|913|914|915|(2:921|(1:923))|(1:925)(1:928)|926|927))|936|908|909|(0)(0)|912|913|914|915|(4:917|919|921|(0))|(0)(0)|926|927) */
        /* JADX WARN: Can't wrap try/catch for region: R(18:73|(6:74|75|76|77|(1:79)(1:125)|80)|(3:82|83|(9:85|86|87|(1:119)|(3:104|(1:118)(4:107|(1:111)|112|(1:116))|117)(1:93)|94|(1:103)(1:98)|(1:100)(1:102)|101))|124|86|87|(0)|119|(0)|104|(0)|118|117|94|(1:96)|103|(0)(0)|101) */
        /* JADX WARN: Can't wrap try/catch for region: R(24:346|(1:902)(1:353)|354|(2:356|(1:900)(1:360))(1:901)|361|(15:363|(3:365|(1:367)(1:887)|368)(2:888|(3:890|(1:892)(1:894)|893)(2:895|(2:897|898)))|369|370|371|(15:373|374|375|(6:838|839|840|841|842|843)(1:377)|378|379|(1:381)(2:823|(1:825)(2:826|(1:828)(2:829|(1:831)(1:832))))|382|383|384|385|(1:387)(2:814|(1:816))|388|(1:813)(9:392|393|(2:778|(11:780|(1:800)(1:784)|(1:786)|787|788|789|(4:794|795|796|(1:798))|799|795|796|(0))(4:801|(1:803)(1:806)|804|805))(2:(3:397|398|399)(1:777)|400)|401|(1:775)(1:405)|406|(1:408)|409|(1:774)(3:415|(2:416|(1:419)(1:418))|420))|421)(3:854|(11:856|857|858|(1:860)(1:880)|861|863|864|(1:866)|867|(3:869|(2:870|(1:873)(1:872))|874)(1:877)|875)(1:883)|876)|422|423|424|(3:681|682|899)(4:426|427|428|a3b)|464|(3:467|(1:469)(1:471)|470)|(2:477|(1:479))|480|(3:(1:495)(1:498)|496|497)(3:(1:487)(1:490)|488|489))|899|898|369|370|371|(0)(0)|422|423|424|(0)(0)|464|(3:467|(0)(0)|470)|(4:473|475|477|(0))|480|(1:482)|(0)(0)|496|497) */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x021d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x021e, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
            r7 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:885:0x0873, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:886:0x0874, code lost:
        
            r21 = r6;
            r22 = r7;
            r23 = r11;
            r32 = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:930:0x0daa, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:931:0x0dae, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
            r0 = r3;
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:934:0x0dac, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:935:0x0dad, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x028c  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x024e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:147:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:201:0x0316  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x0349  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x04c7  */
        /* JADX WARN: Removed duplicated region for block: B:252:0x04d1  */
        /* JADX WARN: Removed duplicated region for block: B:255:0x04da  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x04e9  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x0535  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x053b  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x0557  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x04ec  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x04dd  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x04d3  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x04c9  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x037b  */
        /* JADX WARN: Removed duplicated region for block: B:336:0x0381  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x0615  */
        /* JADX WARN: Removed duplicated region for block: B:426:0x0a2c  */
        /* JADX WARN: Removed duplicated region for block: B:450:0x0a72 A[Catch: all -> 0x0a5e, TryCatch #40 {all -> 0x0a5e, blocks: (B:428:0x0a30, B:429:0x0a3b, B:438:0x0a49, B:441:0x0a51, B:444:0x0a58, B:446:0x0a6a, B:450:0x0a72, B:452:0x0a7c, B:457:0x0a9a, B:499:0x0aa6, B:500:0x0ab6, B:504:0x0acb, B:508:0x0aec, B:510:0x0af0, B:670:0x0ad3, B:675:0x0a65, B:679:0x0cce, B:431:0x0a3c, B:433:0x0a40, B:436:0x0a46), top: B:427:0x0a30, inners: #23 }] */
        /* JADX WARN: Removed duplicated region for block: B:466:0x0ce2 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:469:0x0ced  */
        /* JADX WARN: Removed duplicated region for block: B:471:0x0cef  */
        /* JADX WARN: Removed duplicated region for block: B:473:0x0d04  */
        /* JADX WARN: Removed duplicated region for block: B:479:0x0d23  */
        /* JADX WARN: Removed duplicated region for block: B:482:0x0d2d  */
        /* JADX WARN: Removed duplicated region for block: B:495:0x0d50  */
        /* JADX WARN: Removed duplicated region for block: B:498:0x0d57  */
        /* JADX WARN: Removed duplicated region for block: B:500:0x0ab6 A[Catch: all -> 0x0a5e, TryCatch #40 {all -> 0x0a5e, blocks: (B:428:0x0a30, B:429:0x0a3b, B:438:0x0a49, B:441:0x0a51, B:444:0x0a58, B:446:0x0a6a, B:450:0x0a72, B:452:0x0a7c, B:457:0x0a9a, B:499:0x0aa6, B:500:0x0ab6, B:504:0x0acb, B:508:0x0aec, B:510:0x0af0, B:670:0x0ad3, B:675:0x0a65, B:679:0x0cce, B:431:0x0a3c, B:433:0x0a40, B:436:0x0a46), top: B:427:0x0a30, inners: #23 }] */
        /* JADX WARN: Removed duplicated region for block: B:502:0x0ac7  */
        /* JADX WARN: Removed duplicated region for block: B:550:0x0c01  */
        /* JADX WARN: Removed duplicated region for block: B:559:0x0c1e A[Catch: all -> 0x0c14, TryCatch #33 {all -> 0x0c14, blocks: (B:551:0x0c03, B:553:0x0c0d, B:556:0x0c19, B:559:0x0c1e, B:561:0x0c24, B:565:0x0c38, B:571:0x0c46, B:573:0x0c4c, B:575:0x0c69, B:577:0x0c56, B:579:0x0c5c, B:582:0x0c71, B:584:0x0c7e, B:585:0x0c87), top: B:548:0x0bff }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:575:0x0c69 A[Catch: all -> 0x0c14, TryCatch #33 {all -> 0x0c14, blocks: (B:551:0x0c03, B:553:0x0c0d, B:556:0x0c19, B:559:0x0c1e, B:561:0x0c24, B:565:0x0c38, B:571:0x0c46, B:573:0x0c4c, B:575:0x0c69, B:577:0x0c56, B:579:0x0c5c, B:582:0x0c71, B:584:0x0c7e, B:585:0x0c87), top: B:548:0x0bff }] */
        /* JADX WARN: Removed duplicated region for block: B:674:0x0bfa  */
        /* JADX WARN: Removed duplicated region for block: B:681:0x088c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:708:0x08fd A[Catch: all -> 0x08c4, TryCatch #24 {all -> 0x08c4, blocks: (B:682:0x088c, B:683:0x0899, B:692:0x08a7, B:694:0x08c0, B:698:0x08cb, B:699:0x08d4, B:701:0x08e9, B:706:0x08f6, B:708:0x08fd, B:710:0x0922, B:712:0x092c, B:716:0x0932, B:717:0x0938, B:719:0x093e, B:723:0x0950, B:725:0x0956, B:727:0x0961, B:729:0x0967, B:764:0x0908, B:766:0x0919, B:767:0x0913, B:771:0x0a21, B:685:0x089a, B:687:0x089e, B:690:0x08a4), top: B:681:0x088c, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:798:0x075c A[Catch: all -> 0x0750, TryCatch #31 {all -> 0x0750, blocks: (B:401:0x077d, B:405:0x078b, B:409:0x07a2, B:416:0x07b2, B:420:0x07bb, B:774:0x07c0, B:775:0x0794, B:789:0x073f, B:791:0x0745, B:796:0x0755, B:798:0x075c, B:803:0x0766, B:805:0x0777, B:806:0x0771), top: B:393:0x06c4 }] */
        /* JADX WARN: Removed duplicated region for block: B:854:0x07f1  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0239 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:911:0x0d97  */
        /* JADX WARN: Removed duplicated region for block: B:917:0x0db5  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x023e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:923:0x0dd4  */
        /* JADX WARN: Removed duplicated region for block: B:925:0x0ddc  */
        /* JADX WARN: Removed duplicated region for block: B:928:0x0de1  */
        /* JADX WARN: Removed duplicated region for block: B:933:0x0d9a  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x027d  */
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
        /* JADX WARN: Type inference failed for: r14v60 */
        /* JADX WARN: Type inference failed for: r14v61 */
        /* JADX WARN: Type inference failed for: r14v62 */
        /* JADX WARN: Type inference failed for: r18v18, types: [org.telegram.ui.Components.f6] */
        /* JADX WARN: Type inference failed for: r2v103 */
        /* JADX WARN: Type inference failed for: r2v104 */
        /* JADX WARN: Type inference failed for: r2v70 */
        /* JADX WARN: Type inference failed for: r40v0, types: [org.telegram.messenger.ImageLoader$CacheOutTask] */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v27, types: [int] */
        /* JADX WARN: Type inference failed for: r5v80 */
        /* JADX WARN: Type inference failed for: r5v81 */
        /* JADX WARN: Type inference failed for: r9v43, types: [org.telegram.messenger.ImageLoader$CacheImage] */
        /* JADX WARN: Type inference failed for: r9v44 */
        /* JADX WARN: Type inference failed for: r9v45 */
        /* JADX WARN: Type inference failed for: r9v49, types: [int] */
        /* JADX WARN: Type inference failed for: r9v50 */
        /* JADX WARN: Type inference failed for: r9v51 */
        /* JADX WARN: Type inference failed for: r9v53 */
        /* JADX WARN: Type inference failed for: r9v79 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            w21 w21Var;
            boolean z10;
            boolean z11;
            Bitmap bitmap;
            Object obj;
            byte[] bArr;
            SecureDocumentKey secureDocumentKey;
            boolean z12;
            boolean z13;
            String str;
            Long l4;
            boolean z14;
            boolean z15;
            String str2;
            Long l10;
            boolean z16;
            float f7;
            float f10;
            float f11;
            boolean z17;
            Bitmap bitmap2;
            char c10;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            int i10;
            boolean z23;
            ?? r14;
            boolean z24;
            ?? r52;
            int i11;
            float f12;
            boolean z25;
            char c11;
            Bitmap createScaledBitmap;
            boolean z26;
            CacheImage cacheImage;
            String str3;
            Object obj2;
            int i12;
            boolean z27;
            SecureDocumentKey secureDocumentKey2;
            SecureDocumentKey secureDocumentKey3;
            char c12;
            boolean z28;
            Bitmap createScaledBitmap2;
            int i13;
            SecureDocumentKey secureDocumentKey4;
            boolean z29;
            int i14;
            FileInputStream fileInputStream;
            Bitmap bitmap3;
            Rect rect;
            String str4;
            String str5;
            FileInputStream fileInputStream2;
            int i15;
            boolean z30;
            boolean z31;
            boolean z32;
            boolean z33;
            boolean z34;
            boolean z35;
            boolean z36;
            int i16;
            boolean z37;
            Long l11;
            String str6;
            byte[] bArr2;
            boolean z38;
            boolean z39;
            boolean z40;
            boolean z41;
            boolean z42;
            Bitmap bitmap4;
            b2.n1 n1Var;
            boolean z43;
            org.telegram.ui.Components.f6 f6Var;
            int i17;
            int i18;
            boolean z44;
            String str7;
            int i19;
            boolean z45;
            int i20;
            int i21;
            int i22;
            boolean z46;
            boolean z47;
            boolean z48;
            boolean z49;
            boolean z50;
            int i23;
            String str8;
            ?? r22;
            Throwable th2;
            RandomAccessFile randomAccessFile;
            RandomAccessFile randomAccessFile2;
            boolean z51;
            b2.n1 n1Var2;
            b2.n1 n1Var3;
            int i24;
            int i25;
            ck0 ck0Var;
            ck0 ck0Var2;
            byte[] bArr3;
            boolean z52;
            int i26;
            boolean z53;
            boolean z54;
            boolean z55;
            boolean z56;
            int i27;
            int i28;
            String str9;
            int i29;
            int i30;
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
                    int i31 = cacheImage2.imageType;
                    if (i31 == 5) {
                        try {
                            CacheImage cacheImage3 = this.cacheImage;
                            w21Var = new w21(cacheImage3.finalFilePath, (DocumentObject.ThemeDocument) cacheImage3.imageLocation.document);
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                            w21Var = null;
                        }
                        onPostExecute(w21Var);
                        return;
                    }
                    if (i31 == 3 || i31 == 4) {
                        Point point = AndroidUtilities.displaySize;
                        int i32 = point.x;
                        int i33 = point.y;
                        String str10 = cacheImage2.filter;
                        if (str10 != null) {
                            String[] split = str10.split("_");
                            if (split.length >= 2) {
                                z10 = false;
                                float parseFloat = Float.parseFloat(split[0]);
                                z11 = true;
                                float parseFloat2 = Float.parseFloat(split[1]);
                                float f13 = AndroidUtilities.density;
                                int i34 = (int) (parseFloat2 * f13);
                                i32 = (int) (parseFloat * f13);
                                i33 = i34;
                                CacheImage cacheImage4 = this.cacheImage;
                                SvgHelper.SvgResult svgResult = SvgHelper.getSvgBitmap(cacheImage4.finalFilePath, i32, i33, cacheImage4.imageType != 4 ? z11 : z10);
                                bitmap = svgResult.getBitmap();
                                SvgHelper.SvgResult svgResult2 = svgResult;
                                if (bitmap != null && !TextUtils.isEmpty(this.cacheImage.filter) && this.cacheImage.filter.contains("wallpaper")) {
                                    obj = this.cacheImage.parentObject;
                                    if (obj instanceof TLRPC.WallPaper) {
                                        bitmap = applyWallpaperSetting(bitmap, (TLRPC.WallPaper) obj);
                                    }
                                }
                                onPostExecute(dg.b.a(bitmap, svgResult2 != null ? svgResult2.getGiftPatternPositions() : null));
                                return;
                            }
                        }
                        z10 = false;
                        z11 = true;
                        CacheImage cacheImage42 = this.cacheImage;
                        SvgHelper.SvgResult svgResult3 = SvgHelper.getSvgBitmap(cacheImage42.finalFilePath, i32, i33, cacheImage42.imageType != 4 ? z11 : z10);
                        bitmap = svgResult3.getBitmap();
                        SvgHelper.SvgResult svgResult22 = svgResult3;
                        if (bitmap != null) {
                            obj = this.cacheImage.parentObject;
                            if (obj instanceof TLRPC.WallPaper) {
                            }
                        }
                        onPostExecute(dg.b.a(bitmap, svgResult22 != null ? svgResult22.getGiftPatternPositions() : null));
                        return;
                    }
                    if (i31 == 1) {
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
                                    z53 = false;
                                    i30 = min3;
                                } else {
                                    int min5 = Math.min(min3, 160);
                                    min2 = Math.min(min4, 160);
                                    z53 = true;
                                    i30 = min5;
                                }
                                boolean z57 = (split2.length >= 3 && "pcache".equals(split2[2])) || this.cacheImage.filter.contains("pcache") || !(this.cacheImage.filter.contains("nolimit") || SharedConfig.getDevicePerformanceClass() == 2);
                                z49 = this.cacheImage.filter.contains("lastframe");
                                i26 = 4;
                                z55 = this.cacheImage.filter.contains("lastreactframe");
                                if (z55) {
                                    z49 = true;
                                }
                                if (this.cacheImage.filter.contains("firstframe")) {
                                    z54 = true;
                                    i27 = i30;
                                    z56 = z57;
                                } else {
                                    z54 = false;
                                    i27 = i30;
                                    z56 = z57;
                                }
                            } else {
                                i26 = 4;
                                z53 = false;
                                z54 = false;
                                z55 = false;
                                z56 = false;
                                z49 = false;
                                i27 = min;
                            }
                            if (split2.length >= 3) {
                                i28 = 3;
                                if ("nr".equals(split2[2])) {
                                    i22 = 2;
                                } else if ("nrs".equals(split2[2])) {
                                    i22 = 3;
                                } else if ("dice".equals(split2[2])) {
                                    str9 = split2[3];
                                    i22 = 2;
                                    if (split2.length >= 5) {
                                        if (!"c1".equals(split2[i26])) {
                                            if ("c2".equals(split2[i26])) {
                                                i21 = i27;
                                                z50 = z53;
                                                i23 = i28;
                                            } else if ("c3".equals(split2[i26])) {
                                                i21 = i27;
                                                z50 = z53;
                                                i23 = i26;
                                            } else if ("c4".equals(split2[i26])) {
                                                i21 = i27;
                                                z50 = z53;
                                                i23 = 5;
                                            } else {
                                                i29 = "c5".equals(split2[i26]) ? 6 : 12;
                                            }
                                            i20 = min2;
                                            str8 = str9;
                                            z47 = z55;
                                            r22 = i27;
                                            z46 = z54;
                                            z48 = z56;
                                        }
                                        z50 = z53;
                                        i23 = i29;
                                        i20 = min2;
                                        i21 = i27;
                                        str8 = str9;
                                        z47 = z55;
                                        r22 = i27;
                                        z46 = z54;
                                        z48 = z56;
                                    }
                                    i21 = i27;
                                    z50 = z53;
                                    i23 = 0;
                                    i20 = min2;
                                    str8 = str9;
                                    z47 = z55;
                                    r22 = i27;
                                    z46 = z54;
                                    z48 = z56;
                                }
                                str9 = null;
                                if (split2.length >= 5) {
                                }
                                i21 = i27;
                                z50 = z53;
                                i23 = 0;
                                i20 = min2;
                                str8 = str9;
                                z47 = z55;
                                r22 = i27;
                                z46 = z54;
                                z48 = z56;
                            } else {
                                i28 = 3;
                            }
                            i22 = 1;
                            str9 = null;
                            if (split2.length >= 5) {
                            }
                            i21 = i27;
                            z50 = z53;
                            i23 = 0;
                            i20 = min2;
                            str8 = str9;
                            z47 = z55;
                            r22 = i27;
                            z46 = z54;
                            z48 = z56;
                        } else {
                            i20 = min2;
                            i21 = min;
                            i22 = 1;
                            z46 = false;
                            z47 = false;
                            z48 = false;
                            z49 = false;
                            z50 = false;
                            i23 = 0;
                            str8 = null;
                            r22 = min;
                        }
                        if (str8 != null) {
                            ck0Var2 = "🎰".equals(str8) ? new ax0(str8, i21, i20) : new ak0(str8, i21, i20);
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
                                    } catch (Exception e7) {
                                        e = e7;
                                        FileLog.e((Throwable) e, false);
                                        if (randomAccessFile2 != null) {
                                            try {
                                                randomAccessFile2.close();
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                            }
                                        }
                                        z51 = false;
                                        if (!z49) {
                                        }
                                        z48 = false;
                                        if (z48) {
                                        }
                                        n1Var2 = new b2.n1(3);
                                        if (z49) {
                                        }
                                        n1Var2.c = true;
                                        n1Var3 = n1Var2;
                                        ImageLocation imageLocation2 = this.cacheImage.imageLocation;
                                        if (imageLocation2 == null) {
                                        }
                                        if (z51) {
                                        }
                                        ck0Var2 = ck0Var;
                                        if (z49) {
                                        }
                                        loadLastFrame(ck0Var2, i24, i25, z49, z47);
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
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                        throw th2;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                randomAccessFile2 = null;
                            } catch (Throwable th5) {
                                th2 = th5;
                                randomAccessFile = null;
                                if (randomAccessFile != null) {
                                }
                            }
                            if (bArr3[0] == 31) {
                                if (bArr3[1] == -117) {
                                    z52 = true;
                                    randomAccessFile2.close();
                                    z51 = z52;
                                    if (!z49 || z46) {
                                        z48 = false;
                                    }
                                    if (!z48 || z49 || z46) {
                                        n1Var2 = new b2.n1(3);
                                        if (!z49 || z46) {
                                            n1Var2.c = true;
                                        } else {
                                            String str12 = this.cacheImage.filter;
                                            if (str12 != null && str12.contains("compress")) {
                                                n1Var2.a = 60;
                                            }
                                            String str13 = this.cacheImage.filter;
                                            if (str13 != null && str13.contains("flbk")) {
                                                n1Var2.b = true;
                                            }
                                        }
                                        n1Var3 = n1Var2;
                                    } else {
                                        n1Var3 = null;
                                    }
                                    ImageLocation imageLocation22 = this.cacheImage.imageLocation;
                                    boolean z58 = imageLocation22 == null && MessageObject.isTextColorEmoji(imageLocation22.document);
                                    if (z51) {
                                        File file2 = this.cacheImage.finalFilePath;
                                        i24 = i20;
                                        i25 = i21;
                                        ck0Var = new ck0(file2, ImageLoader.decompressGzip(file2), i25, i24, n1Var3, z50, i23, z58);
                                    } else {
                                        i24 = i20;
                                        i25 = i21;
                                        ck0Var = new ck0(this.cacheImage.finalFilePath, null, i25, i24, n1Var3, z50, i23, z58);
                                    }
                                    ck0Var2 = ck0Var;
                                }
                            }
                            z52 = false;
                            randomAccessFile2.close();
                            z51 = z52;
                            if (!z49) {
                            }
                            z48 = false;
                            if (z48) {
                            }
                            n1Var2 = new b2.n1(3);
                            if (z49) {
                            }
                            n1Var2.c = true;
                            n1Var3 = n1Var2;
                            ImageLocation imageLocation222 = this.cacheImage.imageLocation;
                            if (imageLocation222 == null) {
                            }
                            if (z51) {
                            }
                            ck0Var2 = ck0Var;
                        }
                        if (!z49 || z46) {
                            loadLastFrame(ck0Var2, i24, i25, z49, z47);
                            return;
                        } else {
                            ck0Var2.K(i22);
                            onPostExecute(ck0Var2);
                            return;
                        }
                    }
                    if (i31 != 2) {
                        File file3 = cacheImage2.finalFilePath;
                        boolean z59 = (cacheImage2.secureDocument == null && (cacheImage2.encryptionKeyPath == null || file3 == null || !file3.getAbsolutePath().endsWith(".enc"))) ? false : true;
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
                                    l4 = Long.valueOf(Long.parseLong(str14.substring(8, indexOf)));
                                    str6 = str14.substring(indexOf + 1);
                                } else {
                                    str6 = null;
                                    l4 = null;
                                }
                                str = str6;
                                z15 = false;
                                z14 = false;
                            } else if (str14.startsWith("vthumb://")) {
                                int indexOf2 = str14.indexOf(":", 9);
                                if (indexOf2 >= 0) {
                                    l11 = Long.valueOf(Long.parseLong(str14.substring(9, indexOf2)));
                                    z37 = true;
                                } else {
                                    z37 = false;
                                    l11 = null;
                                }
                                l4 = l11;
                                z15 = z37;
                                z14 = false;
                                str = null;
                            } else if (!str14.startsWith("http")) {
                                z13 = false;
                                z12 = false;
                                str = null;
                                l4 = null;
                                z15 = z13;
                                z14 = z12;
                            }
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = 1;
                            boolean z60 = ImageLoader.this.canForce8888;
                            int i35 = 1067030938;
                            i35 = 1067030938;
                            i35 = 1067030938;
                            i35 = 1067030938;
                            str5 = this.cacheImage.filter;
                            if (str5 == null) {
                                f7 = 0.0f;
                                try {
                                    String[] split3 = str5.split("_");
                                    if (split3.length >= 2) {
                                        try {
                                            f10 = Float.parseFloat(split3[0]) * AndroidUtilities.density;
                                            try {
                                                f11 = Float.parseFloat(split3[1]) * AndroidUtilities.density;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                str2 = str;
                                                l10 = l4;
                                                c10 = 0;
                                                z20 = false;
                                                z32 = z15;
                                                f11 = 0.0f;
                                                z33 = z60;
                                                bitmap2 = null;
                                                z22 = z33;
                                                z21 = z32;
                                                i10 = 1;
                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                r14 = z22;
                                                z23 = z21;
                                                float f14 = f11;
                                                boolean z61 = z20;
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
                                        } catch (Throwable th7) {
                                            th = th7;
                                            str2 = str;
                                            l10 = l4;
                                            c10 = 0;
                                            z20 = false;
                                            z32 = z15;
                                            f10 = 0.0f;
                                            f11 = 0.0f;
                                            z33 = z60;
                                        }
                                    } else {
                                        f10 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    str2 = str;
                                    l10 = l4;
                                    z16 = z15;
                                    f10 = f7;
                                    f11 = f10;
                                    z18 = z16;
                                    bitmap2 = null;
                                    z17 = z18;
                                    c10 = 0;
                                    z19 = z17;
                                    z20 = false;
                                    z22 = z60;
                                    z21 = z19;
                                    i10 = 1;
                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                    r14 = z22;
                                    z23 = z21;
                                    float f142 = f11;
                                    boolean z612 = z20;
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
                                    c10 = this.cacheImage.filter.contains("b2r") ? (char) 4 : this.cacheImage.filter.contains("b2") ? (char) 3 : this.cacheImage.filter.contains("b1") ? (char) 2 : this.cacheImage.filter.contains("b") ? (char) 1 : (char) 0;
                                    try {
                                        boolean contains = this.cacheImage.filter.contains("i");
                                        try {
                                            if (this.cacheImage.filter.contains("f")) {
                                                z60 = true;
                                            } else {
                                                z60 = z60;
                                                if (this.cacheImage.filter.contains("F")) {
                                                    z60 = false;
                                                }
                                            }
                                            if (f10 == 0.0f || f11 == 0.0f) {
                                                str2 = str;
                                                l10 = l4;
                                                z20 = contains;
                                                z34 = z15;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                try {
                                                    try {
                                                        if (l4 == null || str != null) {
                                                            str2 = str;
                                                            l10 = l4;
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
                                                                z20 = contains;
                                                                boolean z62 = z15;
                                                                byte[] computeSHA256 = Utilities.computeSHA256(bArr4, 0, length);
                                                                if (bArr != null && Arrays.equals(computeSHA256, bArr)) {
                                                                    z36 = false;
                                                                    int i36 = bArr4[0] & 255;
                                                                    int i37 = length - i36;
                                                                    z35 = z62;
                                                                    if (!z36) {
                                                                        BitmapFactory.decodeByteArray(bArr4, i36, i37, options);
                                                                        z35 = z62;
                                                                    }
                                                                }
                                                                z36 = true;
                                                                int i362 = bArr4[0] & 255;
                                                                int i372 = length - i362;
                                                                z35 = z62;
                                                                if (!z36) {
                                                                }
                                                            } else {
                                                                z20 = contains;
                                                                z35 = z15;
                                                                FileInputStream encryptedFileInputStream = z59 ? new EncryptedFileInputStream(file3, this.cacheImage.encryptionKeyPath) : new FileInputStream(file3);
                                                                BitmapFactory.decodeStream(encryptedFileInputStream, null, options);
                                                                encryptedFileInputStream.close();
                                                            }
                                                        } else {
                                                            if (z15) {
                                                                str2 = str;
                                                                l10 = l4;
                                                                MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l10.longValue(), 1, options);
                                                            } else {
                                                                str2 = str;
                                                                l10 = l4;
                                                                MediaStore.Images.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l10.longValue(), 1, options);
                                                            }
                                                            z20 = contains;
                                                            z35 = z15;
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
                                                            z34 = z35;
                                                        } else {
                                                            int i38 = 1;
                                                            while (true) {
                                                                i16 = i38 * 2;
                                                                if (i38 * 4 >= min6) {
                                                                    break;
                                                                } else {
                                                                    i38 = i16;
                                                                }
                                                            }
                                                            options.inSampleSize = i16;
                                                            z34 = z35;
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        z20 = contains;
                                                        z32 = z15;
                                                        z33 = z60;
                                                        bitmap2 = null;
                                                        z22 = z33;
                                                        z21 = z32;
                                                        i10 = 1;
                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                        r14 = z22;
                                                        z23 = z21;
                                                        float f1422 = f11;
                                                        boolean z6122 = z20;
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
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    z33 = z60;
                                                    bitmap2 = null;
                                                    z22 = z33;
                                                    z21 = z32;
                                                    i10 = 1;
                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                    r14 = z22;
                                                    z23 = z21;
                                                    float f14222 = f11;
                                                    boolean z61222 = z20;
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
                                            z31 = z60;
                                            z30 = z34;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            str2 = str;
                                            l10 = l4;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        str2 = str;
                                        l10 = l4;
                                        z19 = z15;
                                        bitmap2 = null;
                                        z20 = false;
                                        z22 = z60;
                                        z21 = z19;
                                        i10 = 1;
                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                        r14 = z22;
                                        z23 = z21;
                                        float f142222 = f11;
                                        boolean z612222 = z20;
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
                                } catch (Throwable th13) {
                                    th = th13;
                                    str2 = str;
                                    l10 = l4;
                                    z18 = z15;
                                    bitmap2 = null;
                                    z17 = z18;
                                    c10 = 0;
                                    z19 = z17;
                                    z20 = false;
                                    z22 = z60;
                                    z21 = z19;
                                    i10 = 1;
                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                    r14 = z22;
                                    z23 = z21;
                                    float f1422222 = f11;
                                    boolean z6122222 = z20;
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
                                l10 = l4;
                                boolean z63 = z15;
                                f7 = 0.0f;
                                if (str2 != null) {
                                    try {
                                        options.inJustDecodeBounds = true;
                                        options.inPreferredConfig = z60 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                        fileInputStream2 = new FileInputStream(file3);
                                        bitmap2 = BitmapFactory.decodeStream(fileInputStream2, null, options);
                                    } catch (Throwable th14) {
                                        th = th14;
                                        z16 = z63;
                                        f10 = f7;
                                        f11 = f10;
                                        z18 = z16;
                                        bitmap2 = null;
                                        z17 = z18;
                                        c10 = 0;
                                        z19 = z17;
                                        z20 = false;
                                        z22 = z60;
                                        z21 = z19;
                                        i10 = 1;
                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                        r14 = z22;
                                        z23 = z21;
                                        float f14222222 = f11;
                                        boolean z61222222 = z20;
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
                                        int i39 = options.outWidth;
                                        int i40 = options.outHeight;
                                        options.inJustDecodeBounds = false;
                                        float min7 = (Math.min(i40, i39) / Math.max(66, Math.min(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y))) * 6.0f;
                                        if (min7 < 1.0f) {
                                            min7 = 1.0f;
                                        }
                                        if (min7 > 1.0f) {
                                            int i41 = 1;
                                            while (true) {
                                                i15 = i41 * 2;
                                                if (i41 * 4 > min7) {
                                                    break;
                                                } else {
                                                    i41 = i15;
                                                }
                                            }
                                            options.inSampleSize = i15;
                                        } else {
                                            options.inSampleSize = (int) min7;
                                        }
                                        f10 = 0.0f;
                                        f11 = 0.0f;
                                    } catch (Throwable th15) {
                                        th = th15;
                                        f10 = 0.0f;
                                        f11 = 0.0f;
                                        z17 = z63;
                                        c10 = 0;
                                        z19 = z17;
                                        z20 = false;
                                        z22 = z60;
                                        z21 = z19;
                                        i10 = 1;
                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                        r14 = z22;
                                        z23 = z21;
                                        float f142222222 = f11;
                                        boolean z612222222 = z20;
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
                                    bitmap2 = null;
                                }
                                c10 = 0;
                                z20 = false;
                                z31 = z60;
                                z30 = z63;
                            }
                            i10 = 1;
                            r14 = z31;
                            z23 = z30;
                            float f1422222222 = f11;
                            boolean z6122222222 = z20;
                            if (this.cacheImage.type != i10) {
                                try {
                                    ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                } catch (Throwable th16) {
                                    th = th16;
                                    z24 = false;
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
                                            f12 = 20.0f;
                                            z25 = z6122222222;
                                            byte[] computeSHA2562 = Utilities.computeSHA256(bArr5, 0, length2);
                                            if (bArr != null && Arrays.equals(computeSHA2562, bArr)) {
                                                z26 = false;
                                                int i42 = bArr5[0] & 255;
                                                int i43 = length2 - i42;
                                                if (!z26) {
                                                    bitmap2 = BitmapFactory.decodeByteArray(bArr5, i42, i43, options);
                                                }
                                            }
                                            z26 = true;
                                            int i422 = bArr5[0] & 255;
                                            int i432 = length2 - i422;
                                            if (!z26) {
                                            }
                                        } else {
                                            f12 = 20.0f;
                                            z25 = z6122222222;
                                            FileInputStream encryptedFileInputStream2 = z59 ? new EncryptedFileInputStream(file3, this.cacheImage.encryptionKeyPath) : new FileInputStream(file3);
                                            bitmap2 = BitmapFactory.decodeStream(encryptedFileInputStream2, null, options);
                                            encryptedFileInputStream2.close();
                                        }
                                        if (bitmap2 == null) {
                                            if (file3.length() == 0 || this.cacheImage.filter == null) {
                                                file3.delete();
                                            }
                                            z24 = false;
                                        } else {
                                            if (this.cacheImage.filter != null) {
                                                float width = bitmap2.getWidth();
                                                float height = bitmap2.getHeight();
                                                if (f10 != f7 && width != f10 && width > f10 + f12 && bitmap2 != (createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, (int) f10, (int) (height / (width / f10)), true))) {
                                                    bitmap2.recycle();
                                                    bitmap2 = createScaledBitmap;
                                                }
                                            }
                                            if (z25) {
                                                z24 = Utilities.needInvert(bitmap2) != 0;
                                            } else {
                                                z24 = false;
                                            }
                                            try {
                                                if (c10 == 1) {
                                                    if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                        Utilities.blurBitmap(bitmap2, 3);
                                                    }
                                                } else if (c10 != 2) {
                                                    if (c10 != 3) {
                                                        c11 = 4;
                                                        if (c10 == 4) {
                                                        }
                                                    } else {
                                                        c11 = 4;
                                                    }
                                                    if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                        if (c10 == c11) {
                                                            Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), bitmap2.getConfig());
                                                            Canvas canvas = new Canvas(createBitmap);
                                                            canvas.save();
                                                            canvas.scale(1.2f, 1.2f, bitmap2.getWidth() / 2.0f, bitmap2.getHeight() / 2.0f);
                                                            float f17 = f7;
                                                            canvas.drawBitmap(bitmap2, f17, f17, (Paint) null);
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
                                            } catch (Throwable th17) {
                                                th = th17;
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
                                                    if (cacheImage6.filter != null && c10 == 0 && cacheImage6.imageLocation.path == null) {
                                                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                                                        options.inDither = false;
                                                        if (l10 != null && str2 == null) {
                                                            if (z23) {
                                                                bitmap2 = MediaStore.Images.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l10.longValue(), 1, options);
                                                            } else if (l10.longValue() == 0) {
                                                                try {
                                                                    ?? f6Var2 = new org.telegram.ui.Components.f6(file3, true, 0L, 0, null, null, null, 0L, 0, true);
                                                                    bitmap2 = f6Var2.q(0L, true);
                                                                    f6Var2.u();
                                                                    i35 = f6Var2;
                                                                } catch (Throwable th18) {
                                                                    th = th18;
                                                                    file3 = file3;
                                                                    secureDocumentKey3 = null;
                                                                    z27 = false;
                                                                    i12 = 0;
                                                                    secureDocumentKey2 = secureDocumentKey3;
                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                    z24 = z27;
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
                                                                bitmap2 = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l10.longValue(), 1, options);
                                                            }
                                                        }
                                                        if (bitmap2 != null) {
                                                            if (bitmap2 == null) {
                                                                if (secureDocumentKey != null) {
                                                                    fileInputStream = new EncryptedFileInputStream(file3, secureDocumentKey);
                                                                } else if (z59) {
                                                                    fileInputStream = new EncryptedFileInputStream(file3, this.cacheImage.encryptionKeyPath);
                                                                } else {
                                                                    try {
                                                                        fileInputStream = new FileInputStream(file3);
                                                                    } catch (Throwable th19) {
                                                                        th = th19;
                                                                        secureDocumentKey3 = null;
                                                                        z27 = false;
                                                                        i12 = 0;
                                                                        secureDocumentKey2 = secureDocumentKey3;
                                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                        z24 = z27;
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
                                                                ?? r92 = this.cacheImage;
                                                                ?? r10 = r92.imageLocation.document instanceof TLRPC.TL_document;
                                                                try {
                                                                    if (r10 != 0 || ((str4 = r92.filter) != null && str4.contains("exif"))) {
                                                                        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(fileInputStream);
                                                                        r10 = ((Integer) imageOrientation.first).intValue();
                                                                        try {
                                                                            r92 = ((Integer) imageOrientation.second).intValue();
                                                                        } catch (Throwable th20) {
                                                                            th = th20;
                                                                            secureDocumentKey3 = r10;
                                                                            z27 = false;
                                                                            i12 = 0;
                                                                            secureDocumentKey2 = secureDocumentKey3;
                                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                            z24 = z27;
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
                                                                        try {
                                                                            if (secureDocumentKey == null) {
                                                                                try {
                                                                                    if (this.cacheImage.encryptionKeyPath == null) {
                                                                                        bitmap3 = bitmap2;
                                                                                        c12 = c10;
                                                                                        fileInputStream.getChannel().position(0L);
                                                                                        rect = null;
                                                                                        r92 = r92;
                                                                                        r10 = r10;
                                                                                        r14 = bitmap3;
                                                                                    }
                                                                                } catch (Throwable th21) {
                                                                                    th = th21;
                                                                                    i35 = r92;
                                                                                    secureDocumentKey = r10;
                                                                                    z27 = false;
                                                                                    secureDocumentKey2 = secureDocumentKey;
                                                                                    i12 = i35;
                                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                    z24 = z27;
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
                                                                            } else if (z59) {
                                                                                fileInputStream = new EncryptedFileInputStream(file3, this.cacheImage.encryptionKeyPath);
                                                                                bitmap3 = r14;
                                                                            }
                                                                            rect = null;
                                                                            r92 = r92;
                                                                            r10 = r10;
                                                                            r14 = bitmap3;
                                                                        } catch (Throwable th22) {
                                                                            th = th22;
                                                                            i35 = r92;
                                                                            secureDocumentKey = r10;
                                                                            bitmap2 = r14;
                                                                            z27 = false;
                                                                            secureDocumentKey2 = secureDocumentKey;
                                                                            i12 = i35;
                                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                            z24 = z27;
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
                                                                        c12 = c10;
                                                                    } else {
                                                                        r14 = bitmap2;
                                                                        c12 = c10;
                                                                        rect = null;
                                                                        r92 = 0;
                                                                        r10 = 0;
                                                                    }
                                                                    bitmap2 = BitmapFactory.decodeStream(fileInputStream, rect, options);
                                                                } catch (Throwable th23) {
                                                                    th = th23;
                                                                }
                                                                try {
                                                                    fileInputStream.close();
                                                                    i13 = r92;
                                                                    secureDocumentKey4 = r10;
                                                                } catch (Throwable th24) {
                                                                    th = th24;
                                                                    i35 = r92;
                                                                    secureDocumentKey = r10;
                                                                    z27 = false;
                                                                    secureDocumentKey2 = secureDocumentKey;
                                                                    i12 = i35;
                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                    z24 = z27;
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
                                                                c12 = c10;
                                                                i13 = 0;
                                                                secureDocumentKey4 = null;
                                                            }
                                                            if (bitmap2 != null || (secureDocumentKey == null && !z59)) {
                                                                i35 = i13;
                                                                secureDocumentKey = secureDocumentKey4;
                                                            } else {
                                                                try {
                                                                    RandomAccessFile randomAccessFile5 = new RandomAccessFile(file3, "r");
                                                                    int i44 = i13;
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
                                                                                i35 = i44 == true ? 1 : 0;
                                                                                byte[] computeSHA2563 = Utilities.computeSHA256(bArr6, 0, length3);
                                                                                if (bArr != null && Arrays.equals(computeSHA2563, bArr)) {
                                                                                    z29 = false;
                                                                                    i14 = bArr6[0] & 255;
                                                                                    length3 -= i14;
                                                                                }
                                                                                z29 = true;
                                                                                i14 = bArr6[0] & 255;
                                                                                length3 -= i14;
                                                                            } else {
                                                                                secureDocumentKey = secureDocumentKey4;
                                                                                i35 = i44 == true ? 1 : 0;
                                                                                if (z59) {
                                                                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, this.cacheImage.encryptionKeyPath);
                                                                                }
                                                                                z29 = false;
                                                                                i14 = 0;
                                                                            }
                                                                            if (!z29) {
                                                                                bitmap2 = BitmapFactory.decodeByteArray(bArr6, i14, length3, options);
                                                                            }
                                                                        } catch (Throwable th25) {
                                                                            th = th25;
                                                                            secureDocumentKey = secureDocumentKey;
                                                                            i35 = i35;
                                                                            try {
                                                                                FileLog.e(th);
                                                                                i11 = i35;
                                                                                secureDocumentKey = secureDocumentKey;
                                                                                if (bitmap2 == null) {
                                                                                }
                                                                                z28 = false;
                                                                                z24 = z28;
                                                                                r52 = secureDocumentKey;
                                                                            } catch (Throwable th26) {
                                                                                th = th26;
                                                                                z27 = false;
                                                                                secureDocumentKey2 = secureDocumentKey;
                                                                                i12 = i35;
                                                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                z24 = z27;
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
                                                                    } catch (Throwable th27) {
                                                                        th = th27;
                                                                        secureDocumentKey = secureDocumentKey4;
                                                                        i35 = i44 == true ? 1 : 0;
                                                                    }
                                                                } catch (Throwable th28) {
                                                                    th = th28;
                                                                    i35 = i13;
                                                                    secureDocumentKey = secureDocumentKey4;
                                                                }
                                                            }
                                                            i11 = i35;
                                                            secureDocumentKey = secureDocumentKey;
                                                        } else {
                                                            c12 = c10;
                                                            secureDocumentKey = null;
                                                            i11 = 0;
                                                        }
                                                        if (bitmap2 == null) {
                                                            if (z14) {
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
                                                                if (width2 <= height2 || f10 <= f1422222222) {
                                                                    float f18 = height2 / f1422222222;
                                                                    if (f18 > 1.0f) {
                                                                        createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width2 / f18), (int) f1422222222, true);
                                                                        if (bitmap2 != createScaledBitmap2) {
                                                                            bitmap2.recycle();
                                                                            bitmap2 = createScaledBitmap2;
                                                                        }
                                                                    }
                                                                    createScaledBitmap2 = bitmap2;
                                                                    if (bitmap2 != createScaledBitmap2) {
                                                                    }
                                                                } else {
                                                                    float f19 = width2 / f10;
                                                                    if (f19 > 1.0f) {
                                                                        createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) f10, (int) (height2 / f19), true);
                                                                        if (bitmap2 != createScaledBitmap2) {
                                                                        }
                                                                    }
                                                                    createScaledBitmap2 = bitmap2;
                                                                    if (bitmap2 != createScaledBitmap2) {
                                                                    }
                                                                }
                                                            }
                                                            if (bitmap2 != null) {
                                                                if (z6122222222) {
                                                                    Bitmap createScaledBitmap3 = bitmap2.getWidth() * bitmap2.getHeight() > 22500 ? Bitmap.createScaledBitmap(bitmap2, 100, 100, false) : bitmap2;
                                                                    z28 = Utilities.needInvert(createScaledBitmap3) != 0;
                                                                    if (createScaledBitmap3 != bitmap2) {
                                                                        try {
                                                                            createScaledBitmap3.recycle();
                                                                        } catch (Throwable th29) {
                                                                            th = th29;
                                                                            i12 = i11;
                                                                            z27 = z28;
                                                                            secureDocumentKey2 = secureDocumentKey;
                                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                            z24 = z27;
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
                                                                    z28 = false;
                                                                }
                                                                if (c12 != 0 && (height2 > 100.0f || width2 > 100.0f)) {
                                                                    height2 = 80.0f;
                                                                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, 80, 80, false);
                                                                    width2 = 80.0f;
                                                                }
                                                                if (c12 != 0 && height2 < 100.0f && width2 < 100.0f && bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                                    Utilities.blurBitmap(bitmap2, 3);
                                                                }
                                                                z24 = z28;
                                                                r52 = secureDocumentKey;
                                                            }
                                                        }
                                                        z28 = false;
                                                        z24 = z28;
                                                        r52 = secureDocumentKey;
                                                    }
                                                }
                                                if (bitmap2 == null) {
                                                }
                                                z28 = false;
                                                z24 = z28;
                                                r52 = secureDocumentKey;
                                            } catch (Throwable th30) {
                                                th = th30;
                                                i35 = i11;
                                                z27 = false;
                                                secureDocumentKey2 = secureDocumentKey;
                                                i12 = i35;
                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                z24 = z27;
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
                                            if (l10 != null) {
                                                if (z23) {
                                                }
                                            }
                                            if (bitmap2 != null) {
                                            }
                                        } finally {
                                        }
                                    }
                                } catch (Throwable th31) {
                                    th = th31;
                                }
                            }
                            Thread.interrupted();
                            if (BuildVars.LOGS_ENABLED && z59) {
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
                            if ((cacheImage == null && (str3 = cacheImage.filter) != null && str3.contains("ignoreOrientation")) || (!z24 && r52 == 0 && i11 == 0)) {
                                onPostExecute(bitmap2 != null ? new BitmapDrawable(bitmap2) : null);
                                return;
                            } else {
                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, r52, i11) : null);
                                return;
                            }
                        }
                        z12 = true;
                        z13 = false;
                        str = null;
                        l4 = null;
                        z15 = z13;
                        z14 = z12;
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = 1;
                        boolean z602 = ImageLoader.this.canForce8888;
                        int i352 = 1067030938;
                        i352 = 1067030938;
                        i352 = 1067030938;
                        i352 = 1067030938;
                        str5 = this.cacheImage.filter;
                        if (str5 == null) {
                        }
                        i10 = 1;
                        r14 = z31;
                        z23 = z30;
                        float f14222222222 = f11;
                        boolean z61222222222 = z20;
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
                    long j3 = imageLocation.videoSeekTo;
                    String str15 = cacheImage2.filter;
                    if (str15 != null) {
                        String[] split4 = str15.split("_");
                        if (split4.length >= 2) {
                            float parseFloat5 = Float.parseFloat(split4[0]);
                            float parseFloat6 = Float.parseFloat(split4[1]);
                            if (parseFloat5 <= 90.0f && parseFloat6 <= 90.0f && !this.cacheImage.filter.contains("nolimit")) {
                                z38 = true;
                                i19 = 0;
                                z45 = false;
                                boolean z64 = false;
                                boolean z65 = false;
                                boolean z66 = false;
                                while (i19 < split4.length) {
                                    boolean z67 = z64;
                                    if ("pcache".equals(split4[i19])) {
                                        z67 = true;
                                    }
                                    if ("firstframe".equals(split4[i19])) {
                                        z45 = true;
                                    }
                                    boolean z68 = z66;
                                    if ("nostream".equals(split4[i19])) {
                                        z68 = true;
                                    }
                                    if ("pframe".equals(split4[i19])) {
                                        z65 = true;
                                    }
                                    i19++;
                                    z64 = z67;
                                    z65 = z65;
                                    z66 = z68;
                                }
                                if (z45) {
                                    z66 = true;
                                }
                                z42 = z45;
                                z39 = z64;
                                z40 = z65;
                                z41 = z66;
                            }
                        }
                        z38 = false;
                        i19 = 0;
                        z45 = false;
                        boolean z642 = false;
                        boolean z652 = false;
                        boolean z662 = false;
                        while (i19 < split4.length) {
                        }
                        if (z45) {
                        }
                        z42 = z45;
                        z39 = z642;
                        z40 = z652;
                        z41 = z662;
                    } else {
                        z38 = false;
                        z39 = false;
                        z40 = false;
                        z41 = false;
                        z42 = false;
                    }
                    if (z40) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(this.cacheImage.finalFilePath.getAbsolutePath());
                            bitmap4 = mediaMetadataRetriever.getFrameAtTime(2L);
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Exception e13) {
                                e = e13;
                                e.printStackTrace();
                                Thread.interrupted();
                                if (bitmap4 != null) {
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            bitmap4 = null;
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
                    if (!z39 || z42) {
                        n1Var = null;
                    } else {
                        b2.n1 n1Var4 = new b2.n1(3);
                        String str16 = this.cacheImage.filter;
                        if (str16 != null && str16.contains("compress")) {
                            n1Var4.a = 60;
                        }
                        n1Var = n1Var4;
                    }
                    if (ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter) || ImageLoader.AUTOPLAY_FILTER.equals(this.cacheImage.filter) || ImageLoader.AUTOPLAY_FILTER_NONLOOP.equals(this.cacheImage.filter)) {
                        TLRPC.Document document = this.cacheImage.imageLocation.document;
                        if (!(document instanceof TLRPC.TL_documentEncrypted) && !z39) {
                            TLRPC.Document document2 = com.google.android.gms.internal.vision.e2.t(document) ? this.cacheImage.imageLocation.document : null;
                            CacheImage cacheImage7 = this.cacheImage;
                            long j10 = document2 != null ? cacheImage7.size : cacheImage7.imageLocation.currentSize;
                            int i45 = document2 != null ? 1 : 0;
                            int i46 = this.cacheImage.cacheType;
                            int i47 = i46 > 1 ? i46 : i45;
                            CacheImage cacheImage8 = this.cacheImage;
                            org.telegram.ui.Components.f6 f6Var3 = new org.telegram.ui.Components.f6(cacheImage8.finalFilePath, z42, z41 ? 0L : j10, cacheImage8.priority, z41 ? null : document2, (document2 != null || z41) ? null : cacheImage8.imageLocation, cacheImage8.parentObject, j3, cacheImage8.currentAccount, false, 0, 0, n1Var, i47, !ImageLoader.AUTOPLAY_FILTER_NONLOOP.equals(cacheImage8.filter));
                            z43 = z42;
                            boolean z69 = MessageObject.isWebM(document2) || MessageObject.isVideoSticker(document2) || ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter);
                            f6Var3.n0 = z69;
                            if (z69) {
                                f6Var3.b = false;
                                f6Var3.v0 = true;
                            }
                            f6Var = f6Var3;
                            if (!z43) {
                                f6Var.A(z38);
                                Thread.interrupted();
                                onPostExecute(f6Var);
                                return;
                            }
                            Bitmap q6 = f6Var.q(0L, false);
                            f6Var.u();
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
                    z43 = z42;
                    String str17 = this.cacheImage.filter;
                    if (str17 != null) {
                        String[] split5 = str17.split("_");
                        if (split5.length >= 2) {
                            float parseFloat7 = Float.parseFloat(split5[0]);
                            float parseFloat8 = Float.parseFloat(split5[1]);
                            float f20 = AndroidUtilities.density;
                            i18 = (int) (parseFloat8 * f20);
                            i17 = (int) (parseFloat7 * f20);
                            boolean z70 = !z43 || ((str7 = this.cacheImage.filter) != null && ("d".equals(str7) || this.cacheImage.filter.contains("_d")));
                            int i48 = (!z41 ? null : this.cacheImage.imageLocation.document) == null ? 1 : 0;
                            int i49 = this.cacheImage.cacheType;
                            int i50 = i49 <= 1 ? i49 : i48;
                            CacheImage cacheImage9 = this.cacheImage;
                            f6Var = new org.telegram.ui.Components.f6(cacheImage9.finalFilePath, z70, 0L, cacheImage9.priority, !z41 ? null : cacheImage9.imageLocation.document, null, null, j3, cacheImage9.currentAccount, false, i17, i18, n1Var, i50, true);
                            z44 = !MessageObject.isWebM(this.cacheImage.imageLocation.document) || MessageObject.isVideoSticker(this.cacheImage.imageLocation.document) || ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter);
                            f6Var.n0 = z44;
                            if (z44) {
                                f6Var.b = false;
                                f6Var.v0 = true;
                            }
                            if (!z43) {
                            }
                        }
                    }
                    i17 = 0;
                    i18 = 0;
                    if (z43) {
                    }
                    if ((!z41 ? null : this.cacheImage.imageLocation.document) == null) {
                    }
                    int i492 = this.cacheImage.cacheType;
                    if (i492 <= 1) {
                    }
                    CacheImage cacheImage92 = this.cacheImage;
                    f6Var = new org.telegram.ui.Components.f6(cacheImage92.finalFilePath, z70, 0L, cacheImage92.priority, !z41 ? null : cacheImage92.imageLocation.document, null, null, j3, cacheImage92.currentAccount, false, i17, i18, n1Var, i50, true);
                    if (MessageObject.isWebM(this.cacheImage.imageLocation.document)) {
                    }
                    f6Var.n0 = z44;
                    if (z44) {
                    }
                    if (!z43) {
                    }
                } finally {
                }
            }
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        public /* synthetic */ void lambda$reportProgress$0(long j3, long j10) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.url, Long.valueOf(j3), Long.valueOf(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$1(long j3, long j10) {
            ImageLoader.this.fileProgresses.put(this.url, new long[]{j3, j10});
            AndroidUtilities.runOnUIThread(new d5(this, j3, j10, 0));
        }

        private void reportProgress(long j3, long j10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j3 != j10) {
                long j11 = this.lastProgressTime;
                if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = elapsedRealtime;
            Utilities.stageQueue.postRunnable(new d5(this, j3, j10, 1));
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (uRLConnection != null) {
                    try {
                        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
                        if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                            this.fileSize = Utilities.parseInt((CharSequence) str).intValue();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
                                } catch (Exception e11) {
                                    e = e11;
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public class HttpImageTask extends AsyncTask<Void, Void, Boolean> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private RandomAccessFile fileOutputStream;
        private HttpURLConnection httpConnection;
        private long imageSize;
        private long lastProgressTime;
        private String overrideUrl;

        public HttpImageTask(CacheImage cacheImage, long j3) {
            this.cacheImage = cacheImage;
            this.imageSize = j3;
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
        public /* synthetic */ void lambda$reportProgress$0(long j3, long j10) {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.cacheImage.url, Long.valueOf(j3), Long.valueOf(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$1(long j3, long j10) {
            ImageLoader.this.fileProgresses.put(this.cacheImage.url, new long[]{j3, j10});
            AndroidUtilities.runOnUIThread(new h5(this, j3, j10, 0));
        }

        private void reportProgress(long j3, long j10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j3 != j10) {
                long j11 = this.lastProgressTime;
                if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = elapsedRealtime;
            Utilities.stageQueue.postRunnable(new h5(this, j3, j10, 1));
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new f5(this, 0), this.cacheImage.priority);
            Utilities.stageQueue.postRunnable(new f5(this, 1));
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(9:101|102|(6:104|(1:106)|107|(1:109)|110|(15:112|114|115|4|(6:6|7|(1:15)|17|(3:21|22|(1:30))|(5:35|36|37|(2:38|(1:69)(3:40|41|(3:43|(3:45|46|47)(1:49)|48)(1:50)))|54))|73|74|(1:76)|78|79|(1:81)|(2:93|94)|(1:89)|90|91))|142|(1:148)|107|(0)|110|(0))|3|4|(0)|73|74|(0)|78|79|(0)|(0)|(3:85|87|89)|90|91|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x01a0, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
        
            if (r7 != (-1)) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x018a, code lost:
        
            r0 = r2;
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
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0185, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0186, code lost:
        
            r2 = true;
            r0 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x018c, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0180, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0181, code lost:
        
            r2 = true;
            r0 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0192, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x019f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0090 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #2 {all -> 0x0020, blocks: (B:102:0x0009, B:104:0x0017, B:107:0x0060, B:110:0x0067, B:112:0x0090, B:142:0x0024, B:146:0x0034, B:148:0x0042), top: B:101:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0199 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #8 {all -> 0x019f, blocks: (B:74:0x0195, B:76:0x0199), top: B:73:0x0195 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01a7 A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #4 {all -> 0x01aa, blocks: (B:79:0x01a3, B:81:0x01a7), top: B:78:0x01a3 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
                            } catch (Exception e7) {
                                FileLog.e((Throwable) e7, false);
                            }
                            if (this.imageSize == 0 && (httpURLConnection2 = this.httpConnection) != null) {
                                try {
                                    Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                                    if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str3 = list.get(0)) != null) {
                                        this.imageSize = Utilities.parseInt((CharSequence) str3).intValue();
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
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
                                            long j3 = this.imageSize;
                                            if (j3 != 0) {
                                                reportProgress(i10, j3);
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class MessageThumb {
        BitmapDrawable drawable;
        String key;

        public MessageThumb(String str, BitmapDrawable bitmapDrawable) {
            this.key = str;
            this.drawable = bitmapDrawable;
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                StringBuilder j3 = sc.v.j(str, "@");
                j3.append(this.info.filter);
                str = j3.toString();
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
                        float f7 = min;
                        bitmap = ImageLoader.loadBitmap(this.originalPath.toString(), null, f7, f7, false);
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
                        if (min2 > 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f11 / min2), (int) (f13 / min2), true)) != bitmap) {
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, this.info.big ? 83 : 60, fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
        gf.c cVar = new gf.c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cVar.a = new gf.a(cVar, new PriorityBlockingQueue(10, new fb.i(1)));
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
        float f7 = min;
        this.memCache = new LruCache<BitmapDrawable>((int) (0.8f * f7)) { // from class: org.telegram.messenger.ImageLoader.1
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
        this.smallImagesMemCache = new LruCache<BitmapDrawable>((int) (f7 * 0.2f)) { // from class: org.telegram.messenger.ImageLoader.2
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
                boolean z12 = bitmapDrawable instanceof org.telegram.ui.Components.f6;
                if (z12) {
                    ImageLoader.this.cachedAnimatedFileDrawables.remove((org.telegram.ui.Components.f6) bitmapDrawable);
                }
                if (num == null || num.intValue() == 0) {
                    if (z12) {
                        ((org.telegram.ui.Components.f6) bitmapDrawable).u();
                    }
                    if (bitmapDrawable instanceof ck0) {
                        ((ck0) bitmapDrawable).C(false);
                    }
                }
            }

            @Override // org.telegram.messenger.LruCache
            public BitmapDrawable put(String str, BitmapDrawable bitmapDrawable) {
                if (bitmapDrawable instanceof org.telegram.ui.Components.f6) {
                    ImageLoader.this.cachedAnimatedFileDrawables.add((org.telegram.ui.Components.f6) bitmapDrawable);
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
            } catch (Exception e7) {
                FileLog.e(e7);
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
        } catch (Exception e7) {
            e = e7;
        }
        try {
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            boolean renameTo = file3.renameTo(file4);
            file3.delete();
            file4.delete();
            return renameTo;
        } catch (Exception e10) {
            e = e10;
            randomAccessFile2 = randomAccessFile;
            FileLog.e(e);
            if (randomAccessFile2 == null) {
                return false;
            }
            try {
                randomAccessFile2.close();
                return false;
            } catch (Exception e11) {
                FileLog.e(e11);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            throw th;
        }
    }

    private void createLoadOperationForImageReceiver(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ImageLocation imageLocation, final String str4, final long j3, final int i10, final int i11, final int i12, final int i13) {
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
                ImageLoader.this.lambda$createLoadOperationForImageReceiver$7(i12, str2, str, i15, imageReceiver, i13, str4, i11, imageLocation, z10, parentObject, currentAccount, qualityThumbDocument, isNeedsQualityThumb, isShouldGenerateQualityThumb, str3, i10, j3);
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
        this.imageLoadQueue.postRunnable(new i0(this, str, i10, file, 4));
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
            File file = new File(z10 ? FileLoader.getDirectory(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? FileLoader.getDirectory(0) : FileLoader.getDirectory(4), a1.g.o(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb2));
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e7) {
            FileLog.e(e7);
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
                        PointF C2 = org.telegram.ui.Cells.u1.C2(i10, i11, 0, 0);
                        Locale locale = Locale.US;
                        String str = ImageLocation.getStrippedKey(message, message, photoSize) + "_false@" + ((int) (C2.x / AndroidUtilities.density)) + "_" + ((int) (C2.y / AndroidUtilities.density)) + "_b";
                        if (!getInstance().isInMemCache(str, false) && (strippedPhotoBitmap = getStrippedPhotoBitmap(photoSize.bytes, null)) != null) {
                            Utilities.blurBitmap(strippedPhotoBitmap, 3);
                            float f7 = C2.x;
                            float f10 = AndroidUtilities.density;
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(strippedPhotoBitmap, (int) (f7 / f10), (int) (C2.y / f10), true);
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
                PointF C22 = org.telegram.ui.Cells.u1.C2(findPhotoCachedSize.w, findPhotoCachedSize.h, 0, 0);
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
                        Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(loadBitmap, (int) (f13 / f14), (int) (C22.y / f14), true);
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
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.f6)) {
            return bitmapDrawable;
        }
        org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) bitmapDrawable;
        if (!f6Var.c0 && f6Var.G0 < 15) {
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:5:0x0008, B:7:0x001d, B:11:0x0024, B:12:0x002b, B:14:0x005f, B:17:0x006a, B:21:0x0073, B:22:0x0078, B:24:0x0080, B:28:0x0087, B:29:0x00e8, B:31:0x00ee, B:33:0x00f6, B:35:0x0076), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap getStrippedPhotoBitmap(byte[] bArr, String str) {
        Bitmap.Config config;
        Bitmap decodeByteArray;
        if (bArr == null || bArr.length < 3) {
            return getStrippedPhotoFallbackBitmap();
        }
        try {
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
            boolean z10 = true;
            bArr2[164] = bArr[1];
            bArr2[166] = bArr[2];
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (TextUtils.isEmpty(str) || !str.contains("r")) {
                z10 = false;
            }
            if (!SharedConfig.deviceIsHigh() && !z10) {
                config = Bitmap.Config.RGB_565;
                options.inPreferredConfig = config;
                decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, length, options);
                if (decodeByteArray != null) {
                    return getStrippedPhotoFallbackBitmap();
                }
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
                if (!TextUtils.isEmpty(str) && str.contains("b")) {
                    Utilities.blurBitmap(decodeByteArray, 3);
                }
                return decodeByteArray;
            }
            config = Bitmap.Config.ARGB_8888;
            options.inPreferredConfig = config;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, length, options);
            if (decodeByteArray != null) {
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            return getStrippedPhotoFallbackBitmap();
        }
    }

    private static synchronized Bitmap getStrippedPhotoFallbackBitmap() {
        Bitmap bitmap;
        synchronized (ImageLoader.class) {
            try {
                Bitmap bitmap2 = strippedPhotoFallbackBitmap;
                if (bitmap2 != null) {
                    if (bitmap2.isRecycled()) {
                    }
                    bitmap = strippedPhotoFallbackBitmap;
                }
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                strippedPhotoFallbackBitmap = createBitmap;
                createBitmap.eraseColor(-16777216);
                bitmap = strippedPhotoFallbackBitmap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
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
        AndroidUtilities.runOnUIThread(new c2(13, createMediaPaths(), runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04b8, code lost:
    
        if (r4.equals(r6) != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04c5, code lost:
    
        if (r12.exists() == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01a1, code lost:
    
        if (r2.exists() == false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0560  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$createLoadOperationForImageReceiver$7(int i10, String str, String str2, int i11, ImageReceiver imageReceiver, int i12, String str3, int i13, ImageLocation imageLocation, boolean z10, Object obj, int i14, TLRPC.Document document, boolean z11, boolean z12, String str4, int i15, long j3) {
        String str5;
        boolean z13;
        boolean z14;
        String str6;
        String str7;
        int i16;
        int i17;
        int i18;
        int i19;
        File file;
        boolean z15;
        int i20;
        String str8;
        File file2;
        File file3;
        File file4;
        String str9;
        int i21;
        int i22;
        long j10;
        int i23;
        int i24;
        String str10;
        String str11;
        long j11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i25;
        int i26;
        CacheImage cacheImage;
        CacheImage cacheImage2;
        boolean z16;
        boolean z17;
        boolean z18;
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
                    z19 = false;
                } else if (cacheImage5 == cacheImage3) {
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    z19 = false;
                    z19 = false;
                    if (cacheImage4 == null) {
                        cacheImage5.replaceImageReceiver(imageReceiver2, str2, str3, i13, i12);
                    }
                } else {
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    z16 = false;
                    cacheImage5.removeImageReceiver(imageReceiver2);
                }
                z17 = true;
                z18 = z19;
                if (!z17 && cacheImage2 != null) {
                    cacheImage2.addImageReceiver(imageReceiver2, str2, str3, i13, i12);
                    z17 = true;
                }
                if (!z17 || cacheImage == null) {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    z14 = z17;
                    z13 = z18;
                } else {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    cacheImage.addImageReceiver(imageReceiver2, str2, str5, i13, i12);
                    z14 = true;
                    z13 = z18;
                }
            } else {
                cacheImage = cacheImage3;
                cacheImage2 = cacheImage4;
                z16 = false;
            }
            z17 = z16;
            z18 = z16;
            if (!z17) {
                cacheImage2.addImageReceiver(imageReceiver2, str2, str3, i13, i12);
                z17 = true;
            }
            if (z17) {
            }
            imageReceiver2 = imageReceiver;
            str5 = str3;
            z14 = z17;
            z13 = z18;
        } else {
            str5 = str3;
            z13 = 0;
            z14 = false;
        }
        if (z14) {
            return;
        }
        String str16 = imageLocation.path;
        if (str16 != null) {
            if (str16.startsWith("http") || str16.startsWith("athumb")) {
                i18 = z13;
                file = null;
            } else if (str16.startsWith("thumb://")) {
                int indexOf = str16.indexOf(":", 8);
                if (indexOf >= 0) {
                    file = new File(str16.substring(indexOf + 1));
                    i18 = 1;
                }
                file = null;
                i18 = 1;
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
                i18 = 1;
            }
            i16 = i10;
            str6 = "athumb";
            str7 = "_";
            i17 = z13;
        } else {
            if (i10 == 0 && z10) {
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    TLRPC.Document document3 = messageObject.getDocument();
                    str8 = messageObject.messageOwner.attachPath;
                    str6 = "athumb";
                    document2 = document3;
                    file2 = FileLoader.getInstance(i14).getPathToMessage(messageObject.messageOwner);
                    i20 = messageObject.getMediaType();
                    z15 = z13;
                } else {
                    str6 = "athumb";
                    if (document2 != null) {
                        File pathToAttach = FileLoader.getInstance(i14).getPathToAttach(document2, true);
                        i20 = MessageObject.isVideoDocument(document2) ? 2 : 3;
                        file2 = pathToAttach;
                        z15 = true;
                        str8 = null;
                    } else {
                        z15 = z13;
                        i20 = z15 ? 1 : 0;
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
                        file3 = new File(directory, a1.g.s(sb2, document2.id, ".jpg"));
                        if (file3.exists()) {
                            i17 = 1;
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
                                    thumbGenerateInfo.big = z15;
                                    this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                                }
                                if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver2)) {
                                    thumbGenerateInfo.imageReceiverArray.add(imageReceiver2);
                                    thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i12));
                                }
                                this.waitingForQualityThumbByTag.put(i11, attachFileName);
                                if (file4.exists() && z12) {
                                    generateThumb(i20, file4, thumbGenerateInfo);
                                    return;
                                }
                                return;
                            }
                            i16 = i10;
                            file = file3;
                            i18 = 1;
                        }
                    } else {
                        str7 = "_";
                    }
                    i17 = z13;
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
                    i16 = i10;
                    i17 = z13;
                    i18 = 1;
                }
            } else {
                str6 = "athumb";
                str7 = "_";
                i16 = i10;
                i17 = z13;
                i18 = i17;
            }
            i19 = 2;
            file = null;
            if (i16 != i19) {
                return;
            }
            boolean isEncrypted = imageLocation.isEncrypted();
            int i27 = i18;
            CacheImage cacheImage6 = new CacheImage();
            cacheImage6.priority = imageReceiver2.getFileLoadingPriority() == 0 ? z13 : 1;
            if (!z10) {
                if (imageLocation.imageType == i19 || MessageObject.isGifDocument(imageLocation.webFile) || MessageObject.isGifDocument(imageLocation.document) || MessageObject.isRoundVideoDocument(imageLocation.document) || MessageObject.isVideoSticker(imageLocation.document)) {
                    cacheImage6.imageType = i19;
                } else {
                    String str17 = imageLocation.path;
                    if (str17 != null && !str17.startsWith("vthumb") && !str17.startsWith("thumb")) {
                        String httpUrlExtension = getHttpUrlExtension(str17, "jpg");
                        if (httpUrlExtension.equalsIgnoreCase("webm") || httpUrlExtension.equalsIgnoreCase("mp4") || httpUrlExtension.equalsIgnoreCase("gif")) {
                            cacheImage6.imageType = i19;
                        } else if ("tgs".equals(str4)) {
                            cacheImage6.imageType = 1;
                        }
                    }
                }
            }
            if (file == null) {
                TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                j10 = 0;
                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                    str9 = str;
                    int i28 = i17;
                    str10 = AUTOPLAY_FILTER_NONLOOP;
                    str11 = AUTOPLAY_FILTER;
                    i21 = i15;
                    i17 = i28;
                    j11 = 0;
                    i22 = 1;
                } else {
                    SecureDocument secureDocument = imageLocation.secureDocument;
                    if (secureDocument != null) {
                        cacheImage6.secureDocument = secureDocument;
                        int i29 = secureDocument.secureFile.dc_id == Integer.MIN_VALUE ? 1 : z13;
                        str9 = str;
                        file = new File(FileLoader.getDirectory(4), str9);
                        i22 = i29;
                        str10 = AUTOPLAY_FILTER_NONLOOP;
                        str11 = AUTOPLAY_FILTER;
                    } else {
                        str9 = str;
                        int i30 = i17;
                        if (AUTOPLAY_FILTER.equals(str5) || AUTOPLAY_FILTER_NONLOOP.equals(str5) || isAnimatedAvatar(str5)) {
                            str12 = "application/x-tgwallpattern";
                        } else if (i15 != 0 || j3 <= 0 || imageLocation.path != null || isEncrypted) {
                            File file5 = new File(FileLoader.getDirectory(4), str9);
                            if (file5.exists()) {
                                i25 = i15;
                                i26 = 1;
                            } else {
                                i25 = i15;
                                if (i25 == 2) {
                                    file5 = new File(FileLoader.getDirectory(4), sc.v.v(str9, ".enc"));
                                }
                                i26 = i30;
                            }
                            TLRPC.Document document4 = imageLocation.document;
                            int i31 = i26;
                            if (document4 != null) {
                                if (document4 instanceof DocumentObject.ThemeDocument) {
                                    if (((DocumentObject.ThemeDocument) document4).wallpaper == null) {
                                        i27 = 1;
                                    }
                                    cacheImage6.imageType = 5;
                                } else if ("application/x-tgsdice".equals(document4.mime_type)) {
                                    cacheImage6.imageType = 1;
                                    i17 = i31;
                                    i22 = 1;
                                    file = file5;
                                    str10 = AUTOPLAY_FILTER_NONLOOP;
                                    str11 = AUTOPLAY_FILTER;
                                    j11 = 0;
                                    i21 = i25;
                                } else if ("application/x-tgsticker".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 1;
                                } else if ("application/x-tgwallpattern".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 3;
                                } else if (FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                    cacheImage6.imageType = 3;
                                }
                            }
                            i17 = i31;
                            file = file5;
                            i22 = i27;
                            str10 = AUTOPLAY_FILTER_NONLOOP;
                            str11 = AUTOPLAY_FILTER;
                            j11 = 0;
                            i21 = i25;
                        } else {
                            str12 = "application/x-tgwallpattern";
                        }
                        TLRPC.Document document5 = imageLocation.document;
                        if (document5 != null) {
                            i22 = i27;
                            File file6 = document5 instanceof TLRPC.TL_documentEncrypted ? new File(FileLoader.getDirectory(4), str9) : MessageObject.isVideoDocument(document5) ? new File(FileLoader.getDirectory(2), str9) : new File(FileLoader.getDirectory(3), str9);
                            if ((isAnimatedAvatar(str5) || AUTOPLAY_FILTER.equals(str5) || AUTOPLAY_FILTER_NONLOOP.equals(str5)) && !file6.exists()) {
                                File directory2 = FileLoader.getDirectory(4);
                                str14 = AUTOPLAY_FILTER_NONLOOP;
                                StringBuilder sb3 = new StringBuilder();
                                str11 = AUTOPLAY_FILTER;
                                sb3.append(document5.dc_id);
                                sb3.append(str7);
                                str15 = ".svg";
                                file6 = new File(directory2, a1.g.s(sb3, document5.id, ".temp"));
                            } else {
                                str15 = ".svg";
                                str14 = AUTOPLAY_FILTER_NONLOOP;
                                str11 = AUTOPLAY_FILTER;
                            }
                            file = file6;
                            if (document5 instanceof DocumentObject.ThemeDocument) {
                                if (((DocumentObject.ThemeDocument) document5).wallpaper == null) {
                                    i22 = 1;
                                }
                                cacheImage6.imageType = 5;
                            } else if ("application/x-tgsdice".equals(imageLocation.document.mime_type)) {
                                cacheImage6.imageType = 1;
                                i22 = 1;
                            } else if ("application/x-tgsticker".equals(document5.mime_type)) {
                                cacheImage6.imageType = 1;
                            } else {
                                if (str12.equals(document5.mime_type)) {
                                    cacheImage6.imageType = 3;
                                } else if (FileLoader.getDocumentFileName(imageLocation.document).endsWith(str15)) {
                                    cacheImage6.imageType = 3;
                                }
                                i17 = i30;
                                i21 = i15;
                                j11 = document5.size;
                                str10 = str14;
                            }
                            i17 = i30;
                            i21 = i15;
                            j11 = document5.size;
                            str10 = str14;
                        } else {
                            i22 = i27;
                            str11 = AUTOPLAY_FILTER;
                            String str18 = str7;
                            if (imageLocation.webFile != null) {
                                file = new File(FileLoader.getDirectory(3), str9);
                                i17 = i30;
                                str10 = AUTOPLAY_FILTER_NONLOOP;
                            } else {
                                i21 = i15;
                                file = i21 == 1 ? new File(FileLoader.getDirectory(4), str9) : new File(FileLoader.getDirectory(z13), str9);
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
                                    i17 = i30;
                                    j11 = 0;
                                    str11 = str13;
                                }
                                File directory3 = FileLoader.getDirectory(4);
                                StringBuilder sb4 = new StringBuilder();
                                str11 = str13;
                                sb4.append(imageLocation.location.volume_id);
                                sb4.append(str18);
                                file = new File(directory3, a1.g.o(imageLocation.location.local_id, ".temp", sb4));
                                i17 = i30;
                                j11 = 0;
                            }
                        }
                    }
                    j11 = 0;
                    i21 = i15;
                }
                if (hasAutoplayFilter(str5) || isAnimatedAvatar(str5)) {
                    cacheImage6.imageType = 2;
                    cacheImage6.size = j11;
                    cacheImage6.isPFrame = isPFrame(str5);
                    if (str11.equals(str5) || str10.equals(str5) || isAnimatedAvatar(str5)) {
                        i23 = i13;
                        i22 = 1;
                        cacheImage6.type = i23;
                        cacheImage6.key = str2;
                        cacheImage6.cacheType = i21;
                        cacheImage6.filter = str5;
                        cacheImage6.imageLocation = imageLocation;
                        cacheImage6.ext = str4;
                        cacheImage6.currentAccount = i14;
                        cacheImage6.parentObject = obj;
                        i24 = imageLocation.imageType;
                        if (i24 != 0) {
                            cacheImage6.imageType = i24;
                        }
                        if (i21 == 2) {
                            cacheImage6.encryptionKeyPath = new File(FileLoader.getInternalCacheDir(), sc.v.v(str9, ".enc.key"));
                        }
                        int i32 = i17;
                        String str19 = str6;
                        cacheImage6.addImageReceiver(imageReceiver, str2, str5, i23, i12);
                        if (i22 == 0 || i32 != 0 || file.exists()) {
                            cacheImage6.finalFilePath = file;
                            cacheImage6.imageLocation = imageLocation;
                            cacheImage6.cacheTask = new CacheOutTask(cacheImage6);
                            this.imageLoadingByKeys.put(str2, cacheImage6);
                            this.imageLoadingKeys.add(cutFilter(str2));
                            if (i10 == 0) {
                                this.cacheThumbOutQueue.postRunnable(cacheImage6.cacheTask);
                                return;
                            }
                            gf.c cVar = this.cacheOutQueue;
                            Runnable runnable = cacheImage6.cacheTask;
                            int i33 = cacheImage6.priority;
                            if (i33 != 1) {
                                cVar.getClass();
                                runnable = new gf.b(i33, runnable);
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
                            cacheImage6.tempFilePath = new File(FileLoader.getDirectory(4), sc.v.v(Utilities.MD5(str20), "_temp.jpg"));
                            cacheImage6.finalFilePath = file;
                            if (imageLocation.path.startsWith(str19)) {
                                ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage6);
                                cacheImage6.artworkTask = artworkLoadTask;
                                this.artworkTasks.add(artworkLoadTask);
                                runArtworkTasks(z13);
                                return;
                            }
                            HttpImageTask httpImageTask = new HttpImageTask(cacheImage6, j3);
                            cacheImage6.httpTask = httpImageTask;
                            this.httpTasks.add(httpImageTask);
                            runHttpTasks(z13);
                            return;
                        }
                        int i34 = z13;
                        int fileLoadingPriority = i10 != 0 ? 3 : imageReceiver.getFileLoadingPriority();
                        if (imageLocation.location != null) {
                            FileLoader.getInstance(i14).loadFile(imageLocation, obj, str4, fileLoadingPriority, (i21 != 0 || (j3 > j10 && imageLocation.key == null)) ? i21 : 1);
                        } else if (imageLocation.document != null) {
                            FileLoader.getInstance(i14).loadFile(imageLocation.document, obj, fileLoadingPriority, i21);
                        } else if (imageLocation.secureDocument != null) {
                            FileLoader.getInstance(i14).loadFile(imageLocation.secureDocument, fileLoadingPriority);
                        } else if (imageLocation.webFile != null) {
                            FileLoader.getInstance(i14).loadFile(imageLocation.webFile, fileLoadingPriority, i21);
                        }
                        if (imageReceiver.isForceLoding()) {
                            this.forceLoadingImages.put(cacheImage6.key, Integer.valueOf(i34));
                            return;
                        }
                        return;
                    }
                }
            } else {
                str9 = str;
                i21 = i15;
                i22 = i27;
                j10 = 0;
            }
            i23 = i13;
            cacheImage6.type = i23;
            cacheImage6.key = str2;
            cacheImage6.cacheType = i21;
            cacheImage6.filter = str5;
            cacheImage6.imageLocation = imageLocation;
            cacheImage6.ext = str4;
            cacheImage6.currentAccount = i14;
            cacheImage6.parentObject = obj;
            i24 = imageLocation.imageType;
            if (i24 != 0) {
            }
            if (i21 == 2) {
            }
            int i322 = i17;
            String str192 = str6;
            cacheImage6.addImageReceiver(imageReceiver, str2, str5, i23, i12);
            if (i22 == 0) {
            }
            cacheImage6.finalFilePath = file;
            cacheImage6.imageLocation = imageLocation;
            cacheImage6.cacheTask = new CacheOutTask(cacheImage6);
            this.imageLoadingByKeys.put(str2, cacheImage6);
            this.imageLoadingKeys.add(cutFilter(str2));
            if (i10 == 0) {
            }
        }
        i19 = 2;
        if (i16 != i19) {
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
    /* JADX WARN: Type inference failed for: r1v3, types: [gf.b] */
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
                gf.c cVar = this.cacheOutQueue;
                int i13 = cacheOutTask.cacheImage.priority;
                if (i13 != 1) {
                    cVar.getClass();
                    cacheOutTask = new gf.b(i13, cacheOutTask);
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), sc.v.v(Utilities.MD5(forPath.path), "_temp.jpg"));
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

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(27:6|(1:8)(2:157|(2:161|162))|9|10|(1:12)(1:(24:150|151|152|14|(1:16)(1:148)|17|(1:19)|20|(3:22|(2:23|(1:25)(1:26))|27)|28|29|(4:33|34|36|37)|45|(7:47|(1:49)|50|51|(2:(1:54)|55)|56|(5:94|95|(3:99|100|(3:102|103|104))|97|98)(1:(7:59|60|(3:71|72|(5:74|75|63|64|66))|62|63|64|66)(1:93)))|128|130|131|(5:133|(1:135)(1:141)|136|(1:138)(1:140)|139)|142|(1:144)|51|(0)|56|(0)(0)))|13|14|(0)(0)|17|(0)|20|(0)|28|29|(5:31|33|34|36|37)|45|(0)|128|130|131|(0)|142|(0)|51|(0)|56|(0)(0))|166|10|(0)(0)|13|14|(0)(0)|17|(0)|20|(0)|28|29|(0)|45|(0)|128|130|131|(0)|142|(0)|51|(0)|56|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r10 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f5 A[Catch: all -> 0x0129, TryCatch #5 {all -> 0x0129, blocks: (B:131:0x00eb, B:133:0x00f5, B:136:0x0104, B:139:0x0110, B:142:0x0113, B:144:0x011d), top: B:130:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x011d A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #5 {all -> 0x0129, blocks: (B:131:0x00eb, B:133:0x00f5, B:136:0x0104, B:139:0x0110, B:142:0x0113, B:144:0x011d), top: B:130:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #2 {all -> 0x00e4, blocks: (B:29:0x009f, B:31:0x00ad, B:39:0x00c7, B:45:0x00cf, B:47:0x00d9, B:128:0x00e6), top: B:28:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9 A[Catch: all -> 0x00e4, TryCatch #2 {all -> 0x00e4, blocks: (B:29:0x009f, B:31:0x00ad, B:39:0x00c7, B:45:0x00cf, B:47:0x00d9, B:128:0x00e6), top: B:28:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap loadBitmap(String str, Uri uri, float f7, float f10, boolean z10) {
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
                    float f12 = options.outWidth / f7;
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
                        } catch (Throwable unused) {
                            inputStream = null;
                        }
                        try {
                            imageOrientation = AndroidUtilities.getImageOrientation(inputStream);
                        } catch (Throwable unused2) {
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
                                        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix22, true);
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
                                                Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix22, true);
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
                                    createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix22, true);
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
            float f122 = options.outWidth / f7;
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
        float f1222 = options.outWidth / f7;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                    String D = a1.g.D(str, "@", str3);
                    String D2 = a1.g.D(str2, "@", str3);
                    performReplace(D, D2);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, D, D2, imageLocation);
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f7, float f10, int i10, boolean z10) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f7, f10, i10, z10, 0, 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TLRPC.PhotoSize scaleAndSaveImageInternal(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10, int i10, int i11, float f7, float f10, float f11, int i12, boolean z11, boolean z12, boolean z13) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        Bitmap createScaledBitmap = (f11 > 1.0f || z12) ? Bitmap.createScaledBitmap(bitmap, i10, i11, true) : bitmap;
        if (photoSize != null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                tL_fileLocationToBeDeprecated = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                int i13 = 7.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
                String str = (i13 != 1 || i13 == 2 || i13 == 3) ? ".webp" : ".jpg";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_fileLocationToBeDeprecated.volume_id);
                sb2.append("_");
                FileOutputStream fileOutputStream = new FileOutputStream(new File(!z13 ? FileLoader.getDirectory(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? FileLoader.getDirectory(0) : FileLoader.getDirectory(4), a1.g.o(tL_fileLocationToBeDeprecated.local_id, str, sb2)));
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
        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(!z13 ? FileLoader.getDirectory(4) : tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? FileLoader.getDirectory(0) : FileLoader.getDirectory(4), a1.g.o(tL_fileLocationToBeDeprecated.local_id, str, sb22)));
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
        float f7 = options.outWidth;
        float f10 = options.outHeight;
        return f7 / f10 > 10.0f || f10 / f7 > 10.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int sizeOfBitmapDrawable(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.f6) {
            org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) bitmapDrawable;
            return Math.max(f6Var.getIntrinsicHeight() * f6Var.getIntrinsicWidth(), f6Var.j0 * f6Var.i0) * 12;
        }
        if (!(bitmapDrawable instanceof ck0)) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
        ck0 ck0Var = (ck0) bitmapDrawable;
        int i10 = ck0Var.b * ck0Var.c;
        return ck0Var.G ? i10 * 2 : i10 * 8;
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
        HashMap hashMap = org.telegram.ui.web.i2.f;
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
                    org.telegram.ui.web.i2.f.remove(str);
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
        this.imageLoadQueue.postRunnable(new n6(this, z10, imageReceiver, 2));
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("cache path = " + cacheDir);
        }
        hg.c.t(SharedConfig.storageCacheDir, new StringBuilder("selected SD card = "));
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
                            } catch (Exception e10) {
                                file = publicStorageDir;
                                e = e10;
                            }
                            try {
                                file.mkdirs();
                            } catch (Exception e11) {
                                e = e11;
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
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    try {
                                        file2 = new File(file4, "Telegram Video");
                                        file2.mkdir();
                                        if (file2.isDirectory()) {
                                            sparseArray.put(101, file2);
                                            if (BuildVars.LOGS_ENABLED) {
                                            }
                                        }
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                }
                                SharedConfig.checkSaveToGalleryFiles();
                                return sparseArray;
                            }
                        } else {
                            file = null;
                        }
                    } catch (Exception e14) {
                        e = e14;
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
                    } catch (Exception e15) {
                        FileLog.e(e15);
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
                    } catch (Exception e16) {
                        FileLog.e(e16);
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
                    } catch (Exception e17) {
                        FileLog.e(e17);
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
                    } catch (Exception e18) {
                        FileLog.e(e18);
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
                    } catch (Exception e19) {
                        FileLog.e(e19);
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
                    } catch (Exception e20) {
                        FileLog.e(e20);
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
        } catch (Exception e21) {
            FileLog.e(e21);
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

    public gf.c getCacheOutQueue() {
        return this.cacheOutQueue;
    }

    public Float getFileProgress(String str) {
        long[] jArr;
        if (str == null || (jArr = this.fileProgresses.get(str)) == null) {
            return null;
        }
        long j3 = jArr[1];
        return j3 == 0 ? Float.valueOf(0.0f) : Float.valueOf(Math.min(1.0f, jArr[0] / j3));
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
            str3 = a1.g.D(str3, "@", str2);
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
            this.cachedAnimatedFileDrawables.get(i10).y0 = 0;
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
            AndroidUtilities.runOnUIThread(new pk(this, str, str2, imageLocation, 9));
        } else {
            lambda$replaceImageInCache$5(str, str2, imageLocation);
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, float f7, float f10, int i10, boolean z10, boolean z11) {
        return scaleAndSaveImage(photoSize, bitmap, Bitmap.CompressFormat.JPEG, false, f7, f10, i10, z10, 0, 0, z11);
    }

    public void checkMediaPaths(Runnable runnable) {
        gf.c cVar = this.cacheOutQueue;
        cVar.a.execute(new c2(12, this, runnable));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0365 A[EDGE_INSN: B:190:0x0365->B:191:0x0365 BREAK  A[LOOP:0: B:101:0x01fe->B:109:0x0359], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ec  */
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
        boolean z14;
        ImageLocation imageLocation2;
        String str2;
        String ext;
        ImageLocation imageLocation3;
        String str3;
        String str4;
        int i10;
        ImageLocation imageLocation4;
        ImageLocation imageLocation5;
        int i11;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i12;
        int i13;
        String str11;
        ImageLocation imageLocation6;
        int i14;
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
            if ((drawable instanceof ck0 ? ((ck0) drawable).u() : drawable instanceof org.telegram.ui.Components.f6 ? ((org.telegram.ui.Components.f6) drawable).s() : true) && drawable != null) {
                cancelLoadingForImageReceiver(imageReceiver3, true);
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                if (!imageReceiver.isForcePreview()) {
                    return;
                }
                imageReceiver3 = imageReceiver;
                str = mediaKey;
                z11 = false;
                z10 = true;
            } else if (drawable != null) {
                imageReceiver3 = imageReceiver;
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                str = mediaKey;
                z10 = false;
                z11 = true;
            } else {
                imageReceiver3 = imageReceiver;
            }
            imageKey = imageReceiver3.getImageKey();
            if (!z10 && imageKey != null) {
                ImageLocation imageLocation8 = imageReceiver3.getImageLocation();
                findInPreloadImageReceivers = findInPreloadImageReceivers(imageKey, list);
                if (findInPreloadImageReceivers == null && useLottieMemCache(imageLocation8, imageKey)) {
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
                            TLRPC.Document qualityThumbDocument = imageReceiver2.getQualityThumbDocument();
                            thumbLocation = imageReceiver2.getThumbLocation();
                            String thumbFilter = imageReceiver2.getThumbFilter();
                            mediaLocation = imageReceiver2.getMediaLocation();
                            String mediaFilter = imageReceiver2.getMediaFilter();
                            imageLocation = imageReceiver2.getImageLocation();
                            String imageFilter = imageReceiver2.getImageFilter();
                            if (imageLocation == null && imageReceiver2.isNeedsQualityThumb() && imageReceiver2.isCurrentKeyQuality()) {
                                if (!(parentObject instanceof MessageObject)) {
                                    imageLocation2 = ImageLocation.getForDocument(((MessageObject) parentObject).getDocument());
                                } else if (qualityThumbDocument != null) {
                                    imageLocation2 = ImageLocation.getForDocument(qualityThumbDocument);
                                }
                                z14 = true;
                                String str13 = null;
                                String str14 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                                str2 = (mediaLocation == null && mediaLocation.imageType == 2) ? "mp4" : null;
                                ext = imageReceiver2.getExt();
                                if (ext == null) {
                                    ext = "jpg";
                                }
                                String str15 = str14 != null ? ext : str14;
                                if (str2 == null) {
                                    str2 = ext;
                                }
                                boolean z17 = z13;
                                imageLocation3 = mediaLocation;
                                boolean z18 = z14;
                                str3 = null;
                                str4 = null;
                                String str16 = null;
                                String str17 = null;
                                i10 = 0;
                                boolean z19 = false;
                                while (true) {
                                    imageLocation4 = imageLocation;
                                    if (i10 < 2) {
                                        break;
                                    }
                                    if (i10 == 0) {
                                        imageLocation6 = imageLocation2;
                                        i13 = i10;
                                        str11 = str15;
                                    } else {
                                        i13 = i10;
                                        str11 = str2;
                                        imageLocation6 = imageLocation3;
                                    }
                                    if (imageLocation6 == null) {
                                        i14 = newGuid;
                                        z15 = z11;
                                    } else {
                                        i14 = newGuid;
                                        z15 = z11;
                                        String key = imageLocation6.getKey(parentObject, imageLocation3 != null ? imageLocation3 : imageLocation2, false);
                                        if (key != null) {
                                            z16 = z12;
                                            String key2 = imageLocation6.getKey(parentObject, imageLocation3 != null ? imageLocation3 : imageLocation2, true);
                                            if (imageLocation6.path != null) {
                                                StringBuilder j3 = sc.v.j(key2, ".");
                                                j3.append(getHttpUrlExtension(imageLocation6.path, "jpg"));
                                                key2 = j3.toString();
                                                imageLocation7 = imageLocation2;
                                            } else {
                                                TLRPC.PhotoSize photoSize = imageLocation6.photoSize;
                                                imageLocation7 = imageLocation2;
                                                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                    key2 = a1.g.D(key2, ".", str11);
                                                } else {
                                                    if (imageLocation6.location != null) {
                                                        String D = a1.g.D(key2, ".", str11);
                                                        if (imageReceiver.getExt() == null) {
                                                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation6.location;
                                                            if (tL_fileLocationToBeDeprecated.key == null) {
                                                                str12 = D;
                                                                if (tL_fileLocationToBeDeprecated.volume_id != -2147483648L || tL_fileLocationToBeDeprecated.local_id >= 0) {
                                                                    key2 = str12;
                                                                }
                                                                key2 = str12;
                                                                z19 = true;
                                                            }
                                                        }
                                                        str12 = D;
                                                        key2 = str12;
                                                        z19 = true;
                                                    } else {
                                                        WebFile webFile = imageLocation6.webFile;
                                                        if (webFile != null) {
                                                            String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
                                                            StringBuilder j10 = sc.v.j(key2, ".");
                                                            j10.append(getHttpUrlExtension(imageLocation6.webFile.url, mimeTypePart));
                                                            key2 = j10.toString();
                                                        } else if (imageLocation6.secureDocument != null) {
                                                            key2 = a1.g.D(key2, ".", str11);
                                                        } else if (imageLocation6.document != null) {
                                                            if (i13 == 0 && z18) {
                                                                key = "q_".concat(key);
                                                            }
                                                            String documentFileName = FileLoader.getDocumentFileName(imageLocation6.document);
                                                            int lastIndexOf = documentFileName.lastIndexOf(46);
                                                            String str18 = "";
                                                            String substring = lastIndexOf == -1 ? "" : documentFileName.substring(lastIndexOf);
                                                            if (substring.length() > 1) {
                                                                str18 = substring;
                                                            } else if ("video/mp4".equals(imageLocation6.document.mime_type)) {
                                                                str18 = ".mp4";
                                                            } else if ("video/x-matroska".equals(imageLocation6.document.mime_type)) {
                                                                str18 = ".mkv";
                                                            }
                                                            key2 = sc.v.v(key2, str18);
                                                            if (MessageObject.isVideoDocument(imageLocation6.document) || MessageObject.isGifDocument(imageLocation6.document) || MessageObject.isRoundVideoDocument(imageLocation6.document) || MessageObject.canPreviewDocument(imageLocation6.document)) {
                                                                z19 = false;
                                                            }
                                                            z19 = true;
                                                        } else if (parentObject instanceof TLRPC.StickerSet) {
                                                            key2 = a1.g.D(key2, ".", str11);
                                                        }
                                                    }
                                                    i10 = i13 + 1;
                                                    imageLocation = imageLocation4;
                                                    newGuid = i14;
                                                    z11 = z15;
                                                    z12 = z16;
                                                }
                                            }
                                            if (i13 == 0) {
                                                str4 = key;
                                                str16 = key2;
                                            } else {
                                                str3 = key;
                                                str17 = key2;
                                            }
                                            if (imageLocation6 == thumbLocation) {
                                                if (i13 == 0) {
                                                    str4 = null;
                                                    imageLocation2 = null;
                                                    str16 = null;
                                                    i10 = i13 + 1;
                                                    imageLocation = imageLocation4;
                                                    newGuid = i14;
                                                    z11 = z15;
                                                    z12 = z16;
                                                } else {
                                                    str3 = null;
                                                    imageLocation3 = null;
                                                    str17 = null;
                                                }
                                            }
                                            imageLocation2 = imageLocation7;
                                            i10 = i13 + 1;
                                            imageLocation = imageLocation4;
                                            newGuid = i14;
                                            z11 = z15;
                                            z12 = z16;
                                        }
                                    }
                                    z16 = z12;
                                    i10 = i13 + 1;
                                    imageLocation = imageLocation4;
                                    newGuid = i14;
                                    z11 = z15;
                                    z12 = z16;
                                }
                                imageLocation5 = imageLocation2;
                                int i15 = newGuid;
                                boolean z20 = z11;
                                boolean z21 = z12;
                                if (thumbLocation == null) {
                                    ImageLocation strippedLocation = imageReceiver.getStrippedLocation();
                                    if (strippedLocation == null) {
                                        strippedLocation = imageLocation3 != null ? imageLocation3 : imageLocation4;
                                    }
                                    String key3 = thumbLocation.getKey(parentObject, strippedLocation, false);
                                    i11 = 1;
                                    String key4 = thumbLocation.getKey(parentObject, strippedLocation, true);
                                    if (thumbLocation.path != null) {
                                        StringBuilder j11 = sc.v.j(key4, ".");
                                        j11.append(getHttpUrlExtension(thumbLocation.path, "jpg"));
                                        key4 = j11.toString();
                                    } else {
                                        TLRPC.PhotoSize photoSize2 = thumbLocation.photoSize;
                                        if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize)) {
                                            key4 = a1.g.D(key4, ".", ext);
                                        } else if (thumbLocation.location != null) {
                                            key4 = a1.g.D(key4, ".", ext);
                                        }
                                    }
                                    str13 = key4;
                                    str5 = key3;
                                } else {
                                    i11 = 1;
                                    str5 = null;
                                }
                                if (str3 != null && mediaFilter != null) {
                                    str3 = a1.g.D(str3, "@", mediaFilter);
                                }
                                if (str4 != null && imageFilter != null) {
                                    str4 = a1.g.D(str4, "@", imageFilter);
                                }
                                if (str5 != null && thumbFilter != null) {
                                    str5 = a1.g.D(str5, "@", thumbFilter);
                                }
                                if (imageReceiver.getUniqKeyPrefix() != null && str4 != null) {
                                    str4 = imageReceiver.getUniqKeyPrefix() + str4;
                                }
                                String str19 = str4;
                                if (imageReceiver.getUniqKeyPrefix() != null && str3 != null) {
                                    str3 = imageReceiver.getUniqKeyPrefix() + str3;
                                }
                                String str20 = str3;
                                if (imageLocation5 != null) {
                                    str6 = ext;
                                    str7 = str5;
                                    str8 = str13;
                                    str9 = str15;
                                    str10 = str16;
                                    i12 = i15;
                                } else {
                                    if (imageLocation5.path != null) {
                                        createLoadOperationForImageReceiver(imageReceiver, str5, str13, ext, thumbLocation, thumbFilter, 0L, 1, 1, z17 ? 2 : i11, i15);
                                        createLoadOperationForImageReceiver(imageReceiver, str19, str16, str15, imageLocation5, imageFilter, imageReceiver.getSize(), 1, 0, 0, i15);
                                        return;
                                    }
                                    imageLocation5 = imageLocation5;
                                    str7 = str5;
                                    str8 = str13;
                                    str9 = str15;
                                    str10 = str16;
                                    i12 = i15;
                                    str6 = ext;
                                }
                                if (imageLocation3 != null) {
                                    int cacheType = imageReceiver.getCacheType();
                                    int i16 = (cacheType == 0 && z19) ? i11 : cacheType;
                                    createLoadOperationForImageReceiver(imageReceiver, str7, str8, str6, thumbLocation, thumbFilter, 0L, i16 == 0 ? i11 : i16, 1, z17 ? 2 : i11, i12);
                                    createLoadOperationForImageReceiver(imageReceiver, str19, str10, str9, imageLocation5, imageFilter, imageReceiver.getSize(), i16, 0, 0, i12);
                                    return;
                                }
                                int cacheType2 = imageReceiver.getCacheType();
                                int i17 = (cacheType2 == 0 && z19) ? i11 : cacheType2;
                                int i18 = i17 == 0 ? i11 : i17;
                                if (!z17) {
                                    createLoadOperationForImageReceiver(imageReceiver, str7, str8, str6, thumbLocation, thumbFilter, 0L, i18, 1, 1, i12);
                                }
                                if (!z21) {
                                    createLoadOperationForImageReceiver(imageReceiver, str19, str10, str9, imageLocation5, imageFilter, 0L, 1, 0, 0, i12);
                                }
                                if (z20) {
                                    return;
                                }
                                createLoadOperationForImageReceiver(imageReceiver, str20, str17, str2, imageLocation3, mediaFilter, imageReceiver.getSize(), i17, 3, 0, i12);
                                return;
                            }
                            z14 = false;
                            imageLocation2 = imageLocation;
                            String str132 = null;
                            String str142 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                            if (mediaLocation == null) {
                            }
                            ext = imageReceiver2.getExt();
                            if (ext == null) {
                            }
                            if (str142 != null) {
                            }
                            if (str2 == null) {
                            }
                            boolean z172 = z13;
                            imageLocation3 = mediaLocation;
                            boolean z182 = z14;
                            str3 = null;
                            str4 = null;
                            String str162 = null;
                            String str172 = null;
                            i10 = 0;
                            boolean z192 = false;
                            while (true) {
                                imageLocation4 = imageLocation;
                                if (i10 < 2) {
                                }
                                i10 = i13 + 1;
                                imageLocation = imageLocation4;
                                newGuid = i14;
                                z11 = z15;
                                z12 = z16;
                            }
                            imageLocation5 = imageLocation2;
                            int i152 = newGuid;
                            boolean z202 = z11;
                            boolean z212 = z12;
                            if (thumbLocation == null) {
                            }
                            if (str3 != null) {
                                str3 = a1.g.D(str3, "@", mediaFilter);
                            }
                            if (str4 != null) {
                                str4 = a1.g.D(str4, "@", imageFilter);
                            }
                            if (str5 != null) {
                                str5 = a1.g.D(str5, "@", thumbFilter);
                            }
                            if (imageReceiver.getUniqKeyPrefix() != null) {
                                str4 = imageReceiver.getUniqKeyPrefix() + str4;
                            }
                            String str192 = str4;
                            if (imageReceiver.getUniqKeyPrefix() != null) {
                                str3 = imageReceiver.getUniqKeyPrefix() + str3;
                            }
                            String str202 = str3;
                            if (imageLocation5 != null) {
                            }
                            if (imageLocation3 != null) {
                            }
                        }
                    }
                    imageReceiver2 = imageReceiver;
                    z13 = false;
                    parentObject = imageReceiver2.getParentObject();
                    TLRPC.Document qualityThumbDocument2 = imageReceiver2.getQualityThumbDocument();
                    thumbLocation = imageReceiver2.getThumbLocation();
                    String thumbFilter2 = imageReceiver2.getThumbFilter();
                    mediaLocation = imageReceiver2.getMediaLocation();
                    String mediaFilter2 = imageReceiver2.getMediaFilter();
                    imageLocation = imageReceiver2.getImageLocation();
                    String imageFilter2 = imageReceiver2.getImageFilter();
                    if (imageLocation == null) {
                        if (!(parentObject instanceof MessageObject)) {
                        }
                        z14 = true;
                        String str1322 = null;
                        String str1422 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                        if (mediaLocation == null) {
                        }
                        ext = imageReceiver2.getExt();
                        if (ext == null) {
                        }
                        if (str1422 != null) {
                        }
                        if (str2 == null) {
                        }
                        boolean z1722 = z13;
                        imageLocation3 = mediaLocation;
                        boolean z1822 = z14;
                        str3 = null;
                        str4 = null;
                        String str1622 = null;
                        String str1722 = null;
                        i10 = 0;
                        boolean z1922 = false;
                        while (true) {
                            imageLocation4 = imageLocation;
                            if (i10 < 2) {
                            }
                            i10 = i13 + 1;
                            imageLocation = imageLocation4;
                            newGuid = i14;
                            z11 = z15;
                            z12 = z16;
                        }
                        imageLocation5 = imageLocation2;
                        int i1522 = newGuid;
                        boolean z2022 = z11;
                        boolean z2122 = z12;
                        if (thumbLocation == null) {
                        }
                        if (str3 != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str5 != null) {
                        }
                        if (imageReceiver.getUniqKeyPrefix() != null) {
                        }
                        String str1922 = str4;
                        if (imageReceiver.getUniqKeyPrefix() != null) {
                        }
                        String str2022 = str3;
                        if (imageLocation5 != null) {
                        }
                        if (imageLocation3 != null) {
                        }
                    }
                    z14 = false;
                    imageLocation2 = imageLocation;
                    String str13222 = null;
                    String str14222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                    if (mediaLocation == null) {
                    }
                    ext = imageReceiver2.getExt();
                    if (ext == null) {
                    }
                    if (str14222 != null) {
                    }
                    if (str2 == null) {
                    }
                    boolean z17222 = z13;
                    imageLocation3 = mediaLocation;
                    boolean z18222 = z14;
                    str3 = null;
                    str4 = null;
                    String str16222 = null;
                    String str17222 = null;
                    i10 = 0;
                    boolean z19222 = false;
                    while (true) {
                        imageLocation4 = imageLocation;
                        if (i10 < 2) {
                        }
                        i10 = i13 + 1;
                        imageLocation = imageLocation4;
                        newGuid = i14;
                        z11 = z15;
                        z12 = z16;
                    }
                    imageLocation5 = imageLocation2;
                    int i15222 = newGuid;
                    boolean z20222 = z11;
                    boolean z21222 = z12;
                    if (thumbLocation == null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    if (str5 != null) {
                    }
                    if (imageReceiver.getUniqKeyPrefix() != null) {
                    }
                    String str19222 = str4;
                    if (imageReceiver.getUniqKeyPrefix() != null) {
                    }
                    String str20222 = str3;
                    if (imageLocation5 != null) {
                    }
                    if (imageLocation3 != null) {
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
            TLRPC.Document qualityThumbDocument22 = imageReceiver2.getQualityThumbDocument();
            thumbLocation = imageReceiver2.getThumbLocation();
            String thumbFilter22 = imageReceiver2.getThumbFilter();
            mediaLocation = imageReceiver2.getMediaLocation();
            String mediaFilter22 = imageReceiver2.getMediaFilter();
            imageLocation = imageReceiver2.getImageLocation();
            String imageFilter22 = imageReceiver2.getImageFilter();
            if (imageLocation == null) {
            }
            z14 = false;
            imageLocation2 = imageLocation;
            String str132222 = null;
            String str142222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
            if (mediaLocation == null) {
            }
            ext = imageReceiver2.getExt();
            if (ext == null) {
            }
            if (str142222 != null) {
            }
            if (str2 == null) {
            }
            boolean z172222 = z13;
            imageLocation3 = mediaLocation;
            boolean z182222 = z14;
            str3 = null;
            str4 = null;
            String str162222 = null;
            String str172222 = null;
            i10 = 0;
            boolean z192222 = false;
            while (true) {
                imageLocation4 = imageLocation;
                if (i10 < 2) {
                }
                i10 = i13 + 1;
                imageLocation = imageLocation4;
                newGuid = i14;
                z11 = z15;
                z12 = z16;
            }
            imageLocation5 = imageLocation2;
            int i152222 = newGuid;
            boolean z202222 = z11;
            boolean z212222 = z12;
            if (thumbLocation == null) {
            }
            if (str3 != null) {
            }
            if (str4 != null) {
            }
            if (str5 != null) {
            }
            if (imageReceiver.getUniqKeyPrefix() != null) {
            }
            String str192222 = str4;
            if (imageReceiver.getUniqKeyPrefix() != null) {
            }
            String str202222 = str3;
            if (imageLocation5 != null) {
            }
            if (imageLocation3 != null) {
            }
        }
        str = mediaKey;
        z10 = false;
        z11 = false;
        imageKey = imageReceiver3.getImageKey();
        if (!z10) {
            ImageLocation imageLocation82 = imageReceiver3.getImageLocation();
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
        TLRPC.Document qualityThumbDocument222 = imageReceiver2.getQualityThumbDocument();
        thumbLocation = imageReceiver2.getThumbLocation();
        String thumbFilter222 = imageReceiver2.getThumbFilter();
        mediaLocation = imageReceiver2.getMediaLocation();
        String mediaFilter222 = imageReceiver2.getMediaFilter();
        imageLocation = imageReceiver2.getImageLocation();
        String imageFilter222 = imageReceiver2.getImageFilter();
        if (imageLocation == null) {
        }
        z14 = false;
        imageLocation2 = imageLocation;
        String str1322222 = null;
        String str1422222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
        if (mediaLocation == null) {
        }
        ext = imageReceiver2.getExt();
        if (ext == null) {
        }
        if (str1422222 != null) {
        }
        if (str2 == null) {
        }
        boolean z1722222 = z13;
        imageLocation3 = mediaLocation;
        boolean z1822222 = z14;
        str3 = null;
        str4 = null;
        String str1622222 = null;
        String str1722222 = null;
        i10 = 0;
        boolean z1922222 = false;
        while (true) {
            imageLocation4 = imageLocation;
            if (i10 < 2) {
            }
            i10 = i13 + 1;
            imageLocation = imageLocation4;
            newGuid = i14;
            z11 = z15;
            z12 = z16;
        }
        imageLocation5 = imageLocation2;
        int i1522222 = newGuid;
        boolean z2022222 = z11;
        boolean z2122222 = z12;
        if (thumbLocation == null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        if (str5 != null) {
        }
        if (imageReceiver.getUniqKeyPrefix() != null) {
        }
        String str1922222 = str4;
        if (imageReceiver.getUniqKeyPrefix() != null) {
        }
        String str2022222 = str3;
        if (imageLocation5 != null) {
        }
        if (imageLocation3 != null) {
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f7, float f10, int i10, boolean z10, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f7, f10, i10, z10, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f7, float f10, boolean z10, int i10, boolean z11, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, z10, f7, f10, i10, z11, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f7, float f10, int i10, boolean z10, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, compressFormat, false, f7, f10, i10, z10, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10, float f7, float f10, int i10, boolean z11, int i11, int i12, boolean z12) {
        boolean z13;
        boolean z14;
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
            float max2 = Math.max(width / f7, height / f10);
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
                    z14 = z13;
                    f11 = max2;
                    i13 = (int) (width / f11);
                    i14 = (int) (height / f11);
                    if (i14 != 0 && i13 != 0) {
                        try {
                            return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f11, i10, z11, z14, z12);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            getInstance().clearMemory();
                            System.gc();
                            try {
                                return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f11, i10, z11, z14, z12);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                            }
                        }
                    }
                }
            }
            z13 = false;
            z14 = z13;
            f11 = max2;
            i13 = (int) (width / f11);
            i14 = (int) (height / f11);
            if (i14 != 0) {
                return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f11, i10, z11, z14, z12);
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
