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
import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;
import androidx.core.graphics.ColorUtils;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.DispatchQueuePriority;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.secretmedia.EncryptedFileInputStream;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.wallpaper.WallpaperGiftBitmapDrawable;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieDiceDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.ThemePreviewDrawable;
import org.telegram.ui.web.WebInstantView;

/* loaded from: classes3.dex */
public class ImageLoader {
    public static final String AUTOPLAY_FILTER = "g";
    public static final String AUTOPLAY_FILTER_NONLOOP = "gl";
    public static final int CACHE_TYPE_CACHE = 1;
    public static final int CACHE_TYPE_ENCRYPTED = 2;
    public static final int CACHE_TYPE_NONE = 0;
    private static final boolean DEBUG_MODE = false;
    private boolean canForce8888;
    private LruCache<BitmapDrawable> lottieMemCache;
    private LruCache<BitmapDrawable> memCache;
    private LruCache<BitmapDrawable> smallImagesMemCache;
    private LruCache<BitmapDrawable> wallpaperMemCache;
    private static ThreadLocal<byte[]> bytesLocal = new ThreadLocal<>();
    private static ThreadLocal<byte[]> bytesThumbLocal = new ThreadLocal<>();
    private static byte[] header = new byte[12];
    private static byte[] headerThumb = new byte[12];
    private static volatile ImageLoader Instance = null;
    private HashMap<String, Integer> bitmapUseCounts = new HashMap<>();
    ArrayList<AnimatedFileDrawable> cachedAnimatedFileDrawables = new ArrayList<>();
    private HashMap<String, CacheImage> imageLoadingByUrl = new HashMap<>();
    private HashMap<String, CacheImage> imageLoadingByUrlPframe = new HashMap<>();
    public ConcurrentHashMap<String, CacheImage> imageLoadingByKeys = new ConcurrentHashMap<>();
    public HashSet<String> imageLoadingKeys = new HashSet<>();
    private SparseArray<CacheImage> imageLoadingByTag = new SparseArray<>();
    private HashMap<String, ThumbGenerateInfo> waitingForQualityThumb = new HashMap<>();
    private SparseArray<String> waitingForQualityThumbByTag = new SparseArray<>();
    private LinkedList<HttpImageTask> httpTasks = new LinkedList<>();
    private LinkedList<ArtworkLoadTask> artworkTasks = new LinkedList<>();
    private DispatchQueuePriority cacheOutQueue = new DispatchQueuePriority("cacheOutQueue");
    private DispatchQueue cacheThumbOutQueue = new DispatchQueue("cacheThumbOutQueue");
    private DispatchQueue thumbGeneratingQueue = new DispatchQueue("thumbGeneratingQueue");
    private DispatchQueue imageLoadQueue = new DispatchQueue("imageLoadQueue");
    private HashMap<String, String> replacedBitmaps = new HashMap<>();
    private ConcurrentHashMap<String, long[]> fileProgresses = new ConcurrentHashMap<>();
    private HashMap<String, ThumbGenerateTask> thumbGenerateTasks = new HashMap<>();
    private HashMap<String, Integer> forceLoadingImages = new HashMap<>();
    private int currentHttpTasksCount = 0;
    private int currentArtworkTasksCount = 0;
    private ConcurrentHashMap<String, WebFile> testWebFile = new ConcurrentHashMap<>();
    private LinkedList<HttpFileTask> httpFileLoadTasks = new LinkedList<>();
    private HashMap<String, HttpFileTask> httpFileLoadTasksByKeys = new HashMap<>();
    private HashMap<String, Runnable> retryHttpsTasks = new HashMap<>();
    private int currentHttpFileLoadTasksCount = 0;
    private String ignoreRemoval = null;
    private volatile long lastCacheOutTime = 0;
    private int lastImageNum = 0;
    private File telegramPath = null;

    public static boolean hasAutoplayFilter(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split("_");
        for (int i = 0; i < split.length; i++) {
            if (AUTOPLAY_FILTER.equals(split[i]) || AUTOPLAY_FILTER_NONLOOP.equals(split[i]) || "pframe".equals(split[i])) {
                return true;
            }
        }
        return false;
    }

    public static Drawable createStripedBitmap(ArrayList<TLRPC.PhotoSize> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), getStrippedPhotoBitmap(((TLRPC.TL_photoStrippedSize) arrayList.get(i)).bytes, "b"));
            }
        }
        return null;
    }

    public static boolean isSdCardPath(File file) {
        return !TextUtils.isEmpty(SharedConfig.storageCacheDir) && file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir);
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

    public void putThumbsToCache(ArrayList<MessageThumb> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            putImageToCache(arrayList.get(i).drawable, arrayList.get(i).key, true);
        }
    }

    public LruCache<BitmapDrawable> getLottieMemCahce() {
        return this.lottieMemCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class ThumbGenerateInfo {
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

    /* JADX INFO: Access modifiers changed from: private */
    class HttpFileTask extends AsyncTask<Void, Void, Boolean> {
        private int currentAccount;
        private String ext;
        private int fileSize;
        private long lastProgressTime;
        private File tempFile;
        private String url;
        private RandomAccessFile fileOutputStream = null;
        private boolean canRetry = true;

        public HttpFileTask(String str, File file, String str2, int i) {
            this.url = str;
            this.tempFile = file;
            this.ext = str2;
            this.currentAccount = i;
        }

        private void reportProgress(final long j, final long j2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j != j2) {
                long j3 = this.lastProgressTime;
                if (j3 != 0 && j3 >= elapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = elapsedRealtime;
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpFileTask$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpFileTask.$r8$lambda$oM1Dl-NO-CIA8foJPRew6fc7i9k(ImageLoader.HttpFileTask.this, j, j2);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$oM1Dl-NO-CIA8foJPRew6fc7i9k(final HttpFileTask httpFileTask, final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(httpFileTask.url, new long[]{j, j2});
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpFileTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationCenter.getInstance(r0.currentAccount).postNotificationName(NotificationCenter.fileLoadProgressChanged, ImageLoader.HttpFileTask.this.url, Long.valueOf(j), Long.valueOf(j2));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
        
            if (r5 != (-1)) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
        
            r0 = r11.fileSize;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
        
            if (r0 == 0) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x012e, code lost:
        
            r3 = r0;
            reportProgress(r3, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0135, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0136, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0143 A[Catch: all -> 0x0149, TRY_LEAVE, TryCatch #7 {all -> 0x0149, blocks: (B:65:0x013f, B:67:0x0143), top: B:64:0x013f }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
            boolean z = true;
            boolean z2 = false;
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
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                uRLConnection = null;
            }
            try {
                this.fileOutputStream = new RandomAccessFile(this.tempFile, "rws");
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
                }
                FileLog.e(th);
                inputStream2 = inputStream;
                if (this.canRetry) {
                }
                return Boolean.valueOf(z2);
            }
            if (this.canRetry) {
                try {
                    if ((uRLConnection instanceof HttpURLConnection) && (responseCode = ((HttpURLConnection) uRLConnection).getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                        this.canRetry = false;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (uRLConnection != null) {
                    try {
                        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
                        if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                            this.fileSize = Utilities.parseInt((CharSequence) str).intValue();
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
                if (inputStream2 != null) {
                    try {
                        byte[] bArr = new byte[32768];
                        int i = 0;
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
                                    i += read;
                                    int i2 = this.fileSize;
                                    if (i2 > 0) {
                                        reportProgress(i, i2);
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    z = false;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                FileLog.e(th);
                                randomAccessFile = this.fileOutputStream;
                                if (randomAccessFile != null) {
                                }
                                if (inputStream2 != null) {
                                }
                                z2 = z;
                                return Boolean.valueOf(z2);
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                }
                z = false;
                try {
                    randomAccessFile = this.fileOutputStream;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                        this.fileOutputStream = null;
                    }
                } catch (Throwable th6) {
                    FileLog.e(th6);
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable th7) {
                        FileLog.e(th7);
                    }
                }
                z2 = z;
            }
            return Boolean.valueOf(z2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            ImageLoader.this.runHttpFileLoadTasks(this, bool.booleanValue() ? 2 : 1);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            ImageLoader.this.runHttpFileLoadTasks(this, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ArtworkLoadTask extends AsyncTask<Void, Void, String> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private HttpURLConnection httpConnection;
        private boolean small;

        public ArtworkLoadTask(CacheImage cacheImage) {
            this.cacheImage = cacheImage;
            this.small = Uri.parse(cacheImage.imageLocation.path).getQueryParameter("s") != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0139, code lost:
        
            if (r2 != null) goto L151;
         */
        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x012a A[Catch: all -> 0x012e, TRY_LEAVE, TryCatch #12 {all -> 0x012e, blocks: (B:98:0x0126, B:100:0x012a), top: B:97:0x0126 }] */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x00fd A[Catch: all -> 0x00fb, TryCatch #17 {all -> 0x00fb, blocks: (B:91:0x00ee, B:93:0x00f2, B:95:0x00f8, B:96:0x0123, B:111:0x00fd, B:113:0x0101, B:114:0x0104, B:116:0x0108, B:118:0x010e, B:120:0x011a, B:121:0x011d, B:123:0x0121), top: B:90:0x00ee }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00f2 A[Catch: all -> 0x00fb, TryCatch #17 {all -> 0x00fb, blocks: (B:91:0x00ee, B:93:0x00f2, B:95:0x00f8, B:96:0x0123, B:111:0x00fd, B:113:0x0101, B:114:0x0104, B:116:0x0108, B:118:0x010e, B:120:0x011a, B:121:0x011d, B:123:0x0121), top: B:90:0x00ee }] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String doInBackground(Void... voidArr) {
            InputStream inputStream;
            Throwable th;
            InputStream inputStream2;
            ByteArrayOutputStream byteArrayOutputStream;
            HttpURLConnection httpURLConnection;
            JSONArray jSONArray;
            int read;
            int responseCode;
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.cacheImage.imageLocation.path.replace("athumb://", "https://")).openConnection();
                this.httpConnection = httpURLConnection2;
                httpURLConnection2.setConnectTimeout(5000);
                this.httpConnection.setReadTimeout(5000);
                this.httpConnection.connect();
                try {
                    HttpURLConnection httpURLConnection3 = this.httpConnection;
                    if (httpURLConnection3 != null && (responseCode = httpURLConnection3.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                        this.canRetry = false;
                    }
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                inputStream2 = this.httpConnection.getInputStream();
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th3) {
                inputStream = inputStream2;
                th = th3;
                th = th;
                inputStream2 = inputStream;
                byteArrayOutputStream = null;
                try {
                    if (th instanceof SocketTimeoutException) {
                        if (th instanceof UnknownHostException) {
                            this.canRetry = false;
                        } else if (th instanceof SocketException) {
                            if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                                this.canRetry = false;
                            }
                        } else if (th instanceof FileNotFoundException) {
                            this.canRetry = false;
                        }
                    } else if (ApplicationLoader.isNetworkOnline()) {
                        this.canRetry = false;
                    }
                    FileLog.e(th, false);
                    try {
                        httpURLConnection = this.httpConnection;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable unused) {
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th4) {
                            FileLog.e(th4);
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        HttpURLConnection httpURLConnection4 = this.httpConnection;
                        if (httpURLConnection4 != null) {
                            httpURLConnection4.disconnect();
                        }
                    } catch (Throwable unused2) {
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th6) {
                            FileLog.e(th6);
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        throw th5;
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th5;
                    } catch (Exception unused3) {
                        throw th5;
                    }
                }
            }
            try {
                byte[] bArr = new byte[32768];
                while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                this.canRetry = false;
                jSONArray = new JSONObject(new String(byteArrayOutputStream.toByteArray())).getJSONArray("results");
            } catch (Throwable th7) {
                th = th7;
                if (th instanceof SocketTimeoutException) {
                }
                FileLog.e(th, false);
                httpURLConnection = this.httpConnection;
                if (httpURLConnection != null) {
                }
                if (inputStream2 != null) {
                }
            }
            if (jSONArray.length() <= 0) {
                try {
                    HttpURLConnection httpURLConnection5 = this.httpConnection;
                    if (httpURLConnection5 != null) {
                        httpURLConnection5.disconnect();
                    }
                } catch (Throwable unused4) {
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable th8) {
                        FileLog.e(th8);
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused5) {
                }
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
                    byteArrayOutputStream.close();
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
                byteArrayOutputStream.close();
            } catch (Exception unused9) {
            }
            return replace;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(final String str) {
            if (str != null) {
                ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageLoader.ArtworkLoadTask.$r8$lambda$f-_al4AP_H0wCHBNHpPL12MnVNs(ImageLoader.ArtworkLoadTask.this, str);
                    }
                });
            } else if (this.canRetry) {
                ImageLoader.this.artworkLoadError(this.cacheImage.url);
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.this.runArtworkTasks(true);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$f-_al4AP_H0wCHBNHpPL12MnVNs(ArtworkLoadTask artworkLoadTask, String str) {
            CacheImage cacheImage = artworkLoadTask.cacheImage;
            cacheImage.httpTask = ImageLoader.this.new HttpImageTask(cacheImage, 0, str);
            ImageLoader.this.httpTasks.add(artworkLoadTask.cacheImage.httpTask);
            ImageLoader.this.runHttpTasks(false);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.this.runArtworkTasks(true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class HttpImageTask extends AsyncTask<Void, Void, Boolean> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private RandomAccessFile fileOutputStream;
        private HttpURLConnection httpConnection;
        private long imageSize;
        private long lastProgressTime;
        private String overrideUrl;

        public static /* synthetic */ void $r8$lambda$cv6vUIEcOP54Auh2HI4OW-QaCg0(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        public HttpImageTask(CacheImage cacheImage, long j) {
            this.cacheImage = cacheImage;
            this.imageSize = j;
        }

        public HttpImageTask(CacheImage cacheImage, int i, String str) {
            this.cacheImage = cacheImage;
            this.imageSize = i;
            this.overrideUrl = str;
        }

        private void reportProgress(final long j, final long j2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j != j2) {
                long j3 = this.lastProgressTime;
                if (j3 != 0 && j3 >= elapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = elapsedRealtime;
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.$r8$lambda$RUXGjLllLi1iRs5ugwl8sGXXZoo(ImageLoader.HttpImageTask.this, j, j2);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$RUXGjLllLi1iRs5ugwl8sGXXZoo(final HttpImageTask httpImageTask, final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(httpImageTask.cacheImage.url, new long[]{j, j2});
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationCenter.getInstance(r0.cacheImage.currentAccount).postNotificationName(NotificationCenter.fileLoadProgressChanged, ImageLoader.HttpImageTask.this.cacheImage.url, Long.valueOf(j), Long.valueOf(j2));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(9:101|102|(6:104|(1:106)|107|(1:109)|110|(16:112|114|115|4|(6:35|36|(1:44)|46|(3:50|51|(1:59))|(14:64|65|66|(2:67|(1:97)(3:69|70|(3:72|(3:74|75|76)(1:78)|77)(1:79)))|7|8|(1:10)|12|13|(1:15)|(2:27|28)|(1:23)|24|25)(0))(0)|6|7|8|(0)|12|13|(0)|(0)|(3:19|21|23)|24|25))|142|(1:148)|107|(0)|110|(0))|3|4|(0)(0)|6|7|8|(0)|12|13|(0)|(0)|(0)|24|25|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x019a, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x019b, code lost:
        
            org.telegram.messenger.FileLog.e(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0173, code lost:
        
            if (r7 != (-1)) goto L112;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0175, code lost:
        
            r2 = r12.imageSize;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0179, code lost:
        
            if (r2 == 0) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x017b, code lost:
        
            reportProgress(r2, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0183, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0184, code lost:
        
            r0 = r2;
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0186, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0189, code lost:
        
            r0 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x017f, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0180, code lost:
        
            r0 = r2;
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x018b, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0194 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #5 {all -> 0x019a, blocks: (B:8:0x0190, B:10:0x0194), top: B:7:0x0190 }] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x008f A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #1 {all -> 0x0020, blocks: (B:102:0x0009, B:104:0x0017, B:107:0x005f, B:110:0x0066, B:112:0x008f, B:142:0x0024, B:146:0x0034, B:148:0x0042), top: B:101:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x01a2 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #3 {all -> 0x01a6, blocks: (B:13:0x019e, B:15:0x01a2), top: B:12:0x019e }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Boolean doInBackground(Void... voidArr) {
            InputStream inputStream;
            boolean z;
            InputStream inputStream2;
            String str;
            WebFile webFile;
            String str2;
            HttpURLConnection httpURLConnection;
            List<String> list;
            String str3;
            int responseCode;
            CacheImage cacheImage;
            File file;
            HttpURLConnection httpURLConnection2;
            RandomAccessFile randomAccessFile;
            boolean z2 = true;
            boolean z3 = false;
            if (!isCancelled()) {
                try {
                    str = this.cacheImage.imageLocation.path;
                } catch (Throwable th) {
                    th = th;
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
                        } catch (Throwable th2) {
                            inputStream = inputStream2;
                            th = th2;
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
                                z = true;
                                FileLog.e(th, z);
                                inputStream2 = inputStream;
                                if (!isCancelled()) {
                                }
                                z2 = false;
                                randomAccessFile = this.fileOutputStream;
                                if (randomAccessFile != null) {
                                }
                                httpURLConnection2 = this.httpConnection;
                                if (httpURLConnection2 != null) {
                                }
                                if (inputStream2 != null) {
                                }
                                if (z2) {
                                }
                                return Boolean.valueOf(z2);
                            }
                            z = false;
                            FileLog.e(th, z);
                            inputStream2 = inputStream;
                            if (!isCancelled()) {
                            }
                            z2 = false;
                            randomAccessFile = this.fileOutputStream;
                            if (randomAccessFile != null) {
                            }
                            httpURLConnection2 = this.httpConnection;
                            if (httpURLConnection2 != null) {
                            }
                            if (inputStream2 != null) {
                            }
                            if (z2) {
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (!isCancelled()) {
                            try {
                                HttpURLConnection httpURLConnection4 = this.httpConnection;
                                if (httpURLConnection4 != null && (responseCode = httpURLConnection4.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                                    this.canRetry = false;
                                }
                            } catch (Exception e) {
                                FileLog.e((Throwable) e, false);
                            }
                            if (this.imageSize == 0 && (httpURLConnection = this.httpConnection) != null) {
                                try {
                                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                    if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str3 = list.get(0)) != null) {
                                        this.imageSize = Utilities.parseInt((CharSequence) str3).intValue();
                                    }
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                }
                            }
                            if (inputStream2 != null) {
                                try {
                                    byte[] bArr = new byte[8192];
                                    int i = 0;
                                    while (true) {
                                        if (isCancelled()) {
                                            break;
                                        }
                                        try {
                                            int read = inputStream2.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            i += read;
                                            this.fileOutputStream.write(bArr, 0, read);
                                            long j = this.imageSize;
                                            if (j != 0) {
                                                reportProgress(i, j);
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                randomAccessFile = this.fileOutputStream;
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                    this.fileOutputStream = null;
                                }
                                httpURLConnection2 = this.httpConnection;
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th4) {
                                        FileLog.e(th4);
                                    }
                                }
                                if (z2 && (file = (cacheImage = this.cacheImage).tempFilePath) != null && !file.renameTo(cacheImage.finalFilePath)) {
                                    CacheImage cacheImage2 = this.cacheImage;
                                    cacheImage2.finalFilePath = cacheImage2.tempFilePath;
                                }
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        randomAccessFile = this.fileOutputStream;
                        if (randomAccessFile != null) {
                        }
                        httpURLConnection2 = this.httpConnection;
                        if (httpURLConnection2 != null) {
                        }
                        if (inputStream2 != null) {
                        }
                        if (z2) {
                            CacheImage cacheImage22 = this.cacheImage;
                            cacheImage22.finalFilePath = cacheImage22.tempFilePath;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
                int i2 = MessagesController.getInstance(this.cacheImage.currentAccount).mapProvider;
                if ((i2 == 3 || i2 == 4) && (webFile = (WebFile) ImageLoader.this.testWebFile.get(str)) != null) {
                    TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                    tL_upload_getWebFile.location = webFile.location;
                    tL_upload_getWebFile.offset = 0;
                    tL_upload_getWebFile.limit = 0;
                    ConnectionsManager.getInstance(this.cacheImage.currentAccount).sendRequest(tL_upload_getWebFile, new RequestDelegate() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda0
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            ImageLoader.HttpImageTask.$r8$lambda$cv6vUIEcOP54Auh2HI4OW-QaCg0(tLObject, tL_error);
                        }
                    });
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
            z2 = false;
            randomAccessFile = this.fileOutputStream;
            if (randomAccessFile != null) {
            }
            httpURLConnection2 = this.httpConnection;
            if (httpURLConnection2 != null) {
            }
            if (inputStream2 != null) {
            }
            if (z2) {
            }
            return Boolean.valueOf(z2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(final Boolean bool) {
            if (!bool.booleanValue() && this.canRetry) {
                ImageLoader.this.httpFileLoadError(this.cacheImage.url);
            } else {
                ImageLoader imageLoader = ImageLoader.this;
                CacheImage cacheImage = this.cacheImage;
                imageLoader.fileDidLoaded(cacheImage.url, cacheImage.finalFilePath, 0);
            }
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.$r8$lambda$-kzbON1K01qS3tdb0QMBK7a6XHA(ImageLoader.HttpImageTask.this, bool);
                }
            });
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.this.runHttpTasks(true);
                }
            }, this.cacheImage.priority);
        }

        public static /* synthetic */ void $r8$lambda$-kzbON1K01qS3tdb0QMBK7a6XHA(final HttpImageTask httpImageTask, final Boolean bool) {
            ImageLoader.this.fileProgresses.remove(httpImageTask.cacheImage.url);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.$r8$lambda$xwqgPak6f4mVcGgTCjEEIoxMMpg(ImageLoader.HttpImageTask.this, bool);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$xwqgPak6f4mVcGgTCjEEIoxMMpg(HttpImageTask httpImageTask, Boolean bool) {
            httpImageTask.getClass();
            if (bool.booleanValue()) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(httpImageTask.cacheImage.currentAccount);
                int i = NotificationCenter.fileLoaded;
                CacheImage cacheImage = httpImageTask.cacheImage;
                notificationCenter.postNotificationName(i, cacheImage.url, cacheImage.finalFilePath);
                return;
            }
            NotificationCenter.getInstance(httpImageTask.cacheImage.currentAccount).postNotificationName(NotificationCenter.fileLoadFailed, httpImageTask.cacheImage.url, 2);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.this.runHttpTasks(true);
                }
            }, this.cacheImage.priority);
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.$r8$lambda$Pk0FlwVyKqSubLptHbxul53Zr58(ImageLoader.HttpImageTask.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$Pk0FlwVyKqSubLptHbxul53Zr58(final HttpImageTask httpImageTask) {
            ImageLoader.this.fileProgresses.remove(httpImageTask.cacheImage.url);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationCenter.getInstance(r0.cacheImage.currentAccount).postNotificationName(NotificationCenter.fileLoadFailed, ImageLoader.HttpImageTask.this.cacheImage.url, 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ThumbGenerateTask implements Runnable {
        private ThumbGenerateInfo info;
        private int mediaType;
        private File originalPath;

        public ThumbGenerateTask(int i, File file, ThumbGenerateInfo thumbGenerateInfo) {
            this.mediaType = i;
            this.originalPath = file;
            this.info = thumbGenerateInfo;
        }

        private void removeTask() {
            ThumbGenerateInfo thumbGenerateInfo = this.info;
            if (thumbGenerateInfo == null) {
                return;
            }
            final String attachFileName = FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument);
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$ThumbGenerateTask$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.this.thumbGenerateTasks.remove(attachFileName);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000d, B:10:0x0056, B:13:0x0060, B:15:0x0068, B:16:0x0084, B:18:0x008b, B:21:0x0100, B:23:0x0104, B:27:0x0111, B:29:0x0122, B:31:0x012c, B:32:0x0130, B:35:0x0144, B:37:0x0147, B:38:0x014f, B:42:0x014c, B:44:0x0174, B:48:0x009b, B:51:0x00ab, B:55:0x00b3, B:57:0x00c5, B:60:0x00d5, B:62:0x00da, B:64:0x00e0, B:66:0x00e8, B:68:0x00f0, B:70:0x00f8, B:71:0x0073, B:72:0x0178), top: B:2:0x0002, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0104 A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000d, B:10:0x0056, B:13:0x0060, B:15:0x0068, B:16:0x0084, B:18:0x008b, B:21:0x0100, B:23:0x0104, B:27:0x0111, B:29:0x0122, B:31:0x012c, B:32:0x0130, B:35:0x0144, B:37:0x0147, B:38:0x014f, B:42:0x014c, B:44:0x0174, B:48:0x009b, B:51:0x00ab, B:55:0x00b3, B:57:0x00c5, B:60:0x00d5, B:62:0x00da, B:64:0x00e0, B:66:0x00e8, B:68:0x00f0, B:70:0x00f8, B:71:0x0073, B:72:0x0178), top: B:2:0x0002, inners: #0 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            int min;
            Bitmap loadBitmap;
            Bitmap createScaledBitmap;
            try {
                if (this.info == null) {
                    removeTask();
                    return;
                }
                final String str = "q_" + this.info.parentDocument.dc_id + "_" + this.info.parentDocument.id;
                File file = new File(FileLoader.getDirectory(4), str + ".jpg");
                if (!file.exists() && this.originalPath.exists()) {
                    if (this.info.big) {
                        Point point = AndroidUtilities.displaySize;
                        min = Math.max(point.x, point.y);
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        min = Math.min(NotificationCenter.needDeleteDialog, Math.min(point2.x, point2.y) / 4);
                    }
                    int i = this.mediaType;
                    Bitmap bitmap = null;
                    if (i == 0) {
                        float f = min;
                        loadBitmap = ImageLoader.loadBitmap(this.originalPath.toString(), null, f, f, false);
                    } else {
                        int i2 = 2;
                        if (i != 2) {
                            if (i == 3) {
                                String lowerCase = this.originalPath.toString().toLowerCase();
                                if (lowerCase.endsWith("mp4")) {
                                    String file2 = this.originalPath.toString();
                                    if (!this.info.big) {
                                        i2 = 1;
                                    }
                                    loadBitmap = SendMessagesHelper.createVideoThumbnail(file2, i2);
                                } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                                    float f2 = min;
                                    loadBitmap = ImageLoader.loadBitmap(lowerCase, null, f2, f2, false);
                                }
                            }
                            if (bitmap != null) {
                                removeTask();
                                return;
                            }
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            if (width != 0 && height != 0) {
                                float f3 = width;
                                float f4 = min;
                                float f5 = height;
                                float min2 = Math.min(f3 / f4, f5 / f4);
                                if (min2 > 1.0f && (createScaledBitmap = Bitmaps.createScaledBitmap(bitmap, (int) (f3 / min2), (int) (f5 / min2), true)) != bitmap) {
                                    bitmap.recycle();
                                    bitmap = createScaledBitmap;
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                bitmap.compress(Bitmap.CompressFormat.JPEG, this.info.big ? 83 : 60, fileOutputStream);
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                final BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                                final ArrayList arrayList = new ArrayList(this.info.imageReceiverArray);
                                final ArrayList arrayList2 = new ArrayList(this.info.imageReceiverGuidsArray);
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$ThumbGenerateTask$$ExternalSyntheticLambda0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ImageLoader.ThumbGenerateTask.$r8$lambda$C4xEGjJQv5fKztEz3rEmDhCfiTg(ImageLoader.ThumbGenerateTask.this, str, arrayList, bitmapDrawable, arrayList2);
                                    }
                                });
                                return;
                            }
                            removeTask();
                            return;
                        }
                        String file3 = this.originalPath.toString();
                        if (!this.info.big) {
                            i2 = 1;
                        }
                        loadBitmap = SendMessagesHelper.createVideoThumbnail(file3, i2);
                    }
                    bitmap = loadBitmap;
                    if (bitmap != null) {
                    }
                }
                removeTask();
            } catch (Throwable th) {
                FileLog.e(th);
                removeTask();
            }
        }

        public static /* synthetic */ void $r8$lambda$C4xEGjJQv5fKztEz3rEmDhCfiTg(ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
            thumbGenerateTask.removeTask();
            if (thumbGenerateTask.info.filter != null) {
                str = str + "@" + thumbGenerateTask.info.filter;
            }
            String str2 = str;
            for (int i = 0; i < arrayList.size(); i++) {
                ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(bitmapDrawable, str2, 0, false, ((Integer) arrayList2.get(i)).intValue());
            }
            if (str2.contains("nocache")) {
                return;
            }
            ImageLoader.this.memCache.put(str2, bitmapDrawable);
        }
    }

    public static String decompressGzip(File file) {
        StringBuilder sb = new StringBuilder();
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
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            String sb2 = sb.toString();
                            bufferedReader.close();
                            gZIPInputStream.close();
                            return sb2;
                        }
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
    class CacheOutTask implements Runnable {
        private CacheImage cacheImage;
        private boolean isCancelled;
        private Thread runningThread;
        private final Object sync = new Object();

        public CacheOutTask(CacheImage cacheImage) {
            this.cacheImage = cacheImage;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:340|(1:926)(1:347)|348|(2:350|(1:924)(1:354))(1:925)|355|(9:357|(3:359|(1:361)(1:913)|362)(4:914|(2:916|(2:918|919))(1:921)|920|919)|363|364|365|366|(15:368|369|370|(5:372|373|374|375|376)(1:875)|377|378|(1:380)(2:857|(1:859)(2:860|(1:862)(2:863|(1:865)(1:866))))|381|382|384|385|(1:387)(2:849|(1:851))|388|(1:848)(9:392|393|(2:813|(11:815|(1:835)(1:819)|(1:821)|822|823|824|(4:829|830|831|(1:833))|834|830|831|(0))(4:836|(1:838)(1:841)|839|840))(2:(3:397|398|399)(1:812)|400)|401|(1:810)(1:405)|406|(1:408)|409|(1:809)(3:415|(2:416|(1:419)(1:418))|420))|421)(3:880|(11:882|883|884|(1:886)(1:906)|887|888|889|(1:891)|892|(3:894|(2:895|(1:898)(1:897))|899)(1:902)|900)(1:909)|901)|422|(3:701|702|865)(8:424|425|426|427|428|429|430|a23))|923|364|365|366|(0)(0)|422|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(14:927|(2:929|(12:931|932|933|(1:935)(1:957)|936|937|938|939|(2:945|(1:947))|(1:949)(1:952)|950|951))|960|932|933|(0)(0)|936|937|938|939|(4:941|943|945|(0))|(0)(0)|950|951) */
        /* JADX WARN: Can't wrap try/catch for region: R(19:438|(2:440|(16:446|447|448|(1:684)(2:(2:452|(6:454|455|456|457|458|459)(2:680|681))(1:683)|682)|(3:(17:617|(1:619)(1:(1:670)(2:671|672))|620|621|(6:623|(1:625)|628|629|631|632)|636|637|638|(3:652|653|(7:655|656|657|645|629|631|632))|640|641|642|(1:644)(1:(1:647))|645|629|631|632)(1:462)|(11:569|570|571|572|573|(1:610)(1:577)|(1:579)|580|581|(7:583|584|585|(3:590|591|592)|597|591|592)(3:599|(1:601)|602)|(2:594|595))(1:464)|465)(1:675)|466|(1:(3:469|(2:471|(1:473))|474))(2:511|(3:513|(2:519|(4:529|(2:531|(1:527))|528|(0))(4:523|(2:525|(0))|528|(0)))|(13:(5:534|(1:536)(1:564)|537|(1:539)(1:563)|(2:561|562))(1:565)|541|(1:547)|(1:555)|560|476|(0)|(0)|492|(0)|(0)(0)|508|509)))|475|476|(0)|(0)|492|(0)|(0)(0)|508|509))|685|447|448|(0)|684|(0)(0)|466|(0)(0)|475|476|(0)|(0)|492|(0)|(0)(0)|508|509) */
        /* JADX WARN: Can't wrap try/catch for region: R(19:72|(2:73|74)|(4:76|77|(1:79)(1:125)|80)|(3:82|83|(9:85|86|87|(1:119)|(3:104|(1:118)(4:107|(1:111)|112|(1:116))|117)(1:93)|94|(1:103)(1:98)|(1:100)(1:102)|101))|124|86|87|(0)|119|(0)|104|(0)|118|117|94|(1:96)|103|(0)(0)|101) */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x021d, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:566:0x0c1f, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:626:0x0b03, code lost:
        
            if (r2.contains("exif") != false) goto L688;
         */
        /* JADX WARN: Code restructure failed: missing block: B:911:0x083e, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:912:0x083f, code lost:
        
            r21 = r6;
            r22 = r7;
            r23 = r11;
            r33 = 0.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:922:0x05d7, code lost:
        
            if (r0.startsWith("http") == false) goto L373;
         */
        /* JADX WARN: Code restructure failed: missing block: B:954:0x0dc9, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:955:0x0dcd, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
            r0 = r3;
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:958:0x0dcb, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:959:0x0dcc, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 36, insn: 0x08c3: MOVE (r7 I:??[OBJECT, ARRAY]) = (r36 I:??[OBJECT, ARRAY]), block:B:798:0x08c3 */
        /* JADX WARN: Removed duplicated region for block: B:100:0x028c  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x02a4  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x024e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:149:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:204:0x031d  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x0350  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x04b9  */
        /* JADX WARN: Removed duplicated region for block: B:255:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x04cc  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x04db  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x0526  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x0542  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x04de  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x04cf  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x04c5  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x04bb  */
        /* JADX WARN: Removed duplicated region for block: B:329:0x0380  */
        /* JADX WARN: Removed duplicated region for block: B:331:0x0386  */
        /* JADX WARN: Removed duplicated region for block: B:368:0x05fb  */
        /* JADX WARN: Removed duplicated region for block: B:424:0x0a13  */
        /* JADX WARN: Removed duplicated region for block: B:461:0x0ad1  */
        /* JADX WARN: Removed duplicated region for block: B:468:0x0c0c  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x0cff A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:481:0x0d0d  */
        /* JADX WARN: Removed duplicated region for block: B:483:0x0d0f  */
        /* JADX WARN: Removed duplicated region for block: B:485:0x0d24  */
        /* JADX WARN: Removed duplicated region for block: B:491:0x0d43  */
        /* JADX WARN: Removed duplicated region for block: B:494:0x0d4d  */
        /* JADX WARN: Removed duplicated region for block: B:507:0x0d70  */
        /* JADX WARN: Removed duplicated region for block: B:510:0x0d76  */
        /* JADX WARN: Removed duplicated region for block: B:511:0x0c2c A[Catch: all -> 0x0c1f, TryCatch #48 {all -> 0x0c1f, blocks: (B:469:0x0c0e, B:471:0x0c18, B:474:0x0c23, B:511:0x0c2c, B:513:0x0c32, B:517:0x0c46, B:523:0x0c55, B:525:0x0c5b, B:527:0x0c78, B:529:0x0c65, B:531:0x0c6b, B:534:0x0c80, B:536:0x0c8e, B:537:0x0c99), top: B:466:0x0c0a }] */
        /* JADX WARN: Removed duplicated region for block: B:527:0x0c78 A[Catch: all -> 0x0c1f, TryCatch #48 {all -> 0x0c1f, blocks: (B:469:0x0c0e, B:471:0x0c18, B:474:0x0c23, B:511:0x0c2c, B:513:0x0c32, B:517:0x0c46, B:523:0x0c55, B:525:0x0c5b, B:527:0x0c78, B:529:0x0c65, B:531:0x0c6b, B:534:0x0c80, B:536:0x0c8e, B:537:0x0c99), top: B:466:0x0c0a }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x02ba A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:675:0x0c05  */
        /* JADX WARN: Removed duplicated region for block: B:701:0x085a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:732:0x08cf A[Catch: all -> 0x08c2, TryCatch #14 {all -> 0x08c2, blocks: (B:723:0x08b1, B:725:0x08b7, B:730:0x08c8, B:732:0x08cf, B:790:0x08e1, B:792:0x08f2, B:794:0x08ec, B:805:0x0a06, B:705:0x0866, B:707:0x086a, B:710:0x0872), top: B:704:0x0866, inners: #32 }] */
        /* JADX WARN: Removed duplicated region for block: B:784:0x08d4  */
        /* JADX WARN: Removed duplicated region for block: B:833:0x073b A[Catch: all -> 0x0730, TryCatch #7 {all -> 0x0730, blocks: (B:401:0x075c, B:405:0x076a, B:409:0x0781, B:416:0x0791, B:420:0x079a, B:809:0x079f, B:810:0x0773, B:824:0x071f, B:826:0x0725, B:831:0x0734, B:833:0x073b, B:838:0x0745, B:840:0x0756, B:841:0x0750), top: B:393:0x06a3 }] */
        /* JADX WARN: Removed duplicated region for block: B:880:0x07c8  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x023a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x023f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:935:0x0db8  */
        /* JADX WARN: Removed duplicated region for block: B:941:0x0dd4  */
        /* JADX WARN: Removed duplicated region for block: B:947:0x0df3  */
        /* JADX WARN: Removed duplicated region for block: B:949:0x0dfb  */
        /* JADX WARN: Removed duplicated region for block: B:952:0x0e00  */
        /* JADX WARN: Removed duplicated region for block: B:957:0x0dba  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x027d  */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v14 */
        /* JADX WARN: Type inference failed for: r14v15 */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v51 */
        /* JADX WARN: Type inference failed for: r14v52 */
        /* JADX WARN: Type inference failed for: r14v53 */
        /* JADX WARN: Type inference failed for: r14v54 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r18v0 */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v10 */
        /* JADX WARN: Type inference failed for: r18v11 */
        /* JADX WARN: Type inference failed for: r18v13 */
        /* JADX WARN: Type inference failed for: r18v14 */
        /* JADX WARN: Type inference failed for: r18v15 */
        /* JADX WARN: Type inference failed for: r18v16 */
        /* JADX WARN: Type inference failed for: r18v4 */
        /* JADX WARN: Type inference failed for: r18v6 */
        /* JADX WARN: Type inference failed for: r18v7 */
        /* JADX WARN: Type inference failed for: r18v8 */
        /* JADX WARN: Type inference failed for: r18v9 */
        /* JADX WARN: Type inference failed for: r2v133 */
        /* JADX WARN: Type inference failed for: r2v45, types: [org.telegram.messenger.ImageLoader$CacheImage] */
        /* JADX WARN: Type inference failed for: r2v46 */
        /* JADX WARN: Type inference failed for: r2v47 */
        /* JADX WARN: Type inference failed for: r2v52, types: [int] */
        /* JADX WARN: Type inference failed for: r2v53 */
        /* JADX WARN: Type inference failed for: r2v55 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v35 */
        /* JADX WARN: Type inference failed for: r3v36 */
        /* JADX WARN: Type inference failed for: r3v39 */
        /* JADX WARN: Type inference failed for: r3v47 */
        /* JADX WARN: Type inference failed for: r41v0, types: [org.telegram.messenger.ImageLoader$CacheOutTask] */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v29 */
        /* JADX WARN: Type inference failed for: r9v34 */
        /* JADX WARN: Type inference failed for: r9v36 */
        /* JADX WARN: Type inference failed for: r9v45 */
        /* JADX WARN: Type inference failed for: r9v47 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            ThemePreviewDrawable themePreviewDrawable;
            Bitmap bitmap;
            Object obj;
            byte[] bArr;
            SecureDocumentKey secureDocumentKey;
            String str;
            Long l;
            boolean z;
            boolean z2;
            String str2;
            Long l2;
            boolean z3;
            float f;
            Bitmap bitmap2;
            char c;
            float f2;
            float f3;
            SecureDocumentKey secureDocumentKey2;
            boolean z4;
            int i;
            float f4;
            SecureDocumentKey secureDocumentKey3;
            ?? r14;
            boolean z5;
            boolean z6;
            int i2;
            File file;
            int i3;
            char c2;
            FileInputStream fileInputStream;
            char c3;
            char c4;
            Bitmap createScaledBitmap;
            ?? r9;
            File file2;
            boolean z7;
            CacheImage cacheImage;
            String str3;
            Object obj2;
            File file3;
            int i4;
            File file4;
            boolean z8;
            char c5;
            int i5;
            boolean z9;
            Bitmap createScaledBitmap2;
            FileInputStream fileInputStream2;
            Pair<Integer, Integer> imageOrientation;
            int intValue;
            Bitmap bitmap3;
            Rect rect;
            Bitmap decodeStream;
            int i6;
            Bitmap bitmap4;
            RandomAccessFile randomAccessFile;
            Bitmap bitmap5;
            boolean z10;
            int i7;
            File file5;
            Bitmap thumbnail;
            String str4;
            int i8;
            boolean z11;
            SecureDocumentKey secureDocumentKey4;
            FileInputStream fileInputStream3;
            boolean z12;
            float min;
            int i9;
            Long l3;
            boolean z13;
            String str5;
            byte[] bArr2;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            Bitmap bitmap6;
            MediaMetadataRetriever mediaMetadataRetriever;
            BitmapsCache.CacheOptions cacheOptions;
            AnimatedFileDrawable animatedFileDrawable;
            boolean z19;
            int i10;
            int i11;
            String str6;
            int i12;
            boolean z20;
            int i13;
            int i14;
            String str7;
            boolean z21;
            boolean z22;
            boolean z23;
            boolean z24;
            int i15;
            boolean z25;
            int i16;
            RandomAccessFile randomAccessFile2;
            RandomAccessFile randomAccessFile3;
            boolean z26;
            BitmapsCache.CacheOptions cacheOptions2;
            BitmapsCache.CacheOptions cacheOptions3;
            int i17;
            int i18;
            RLottieDrawable rLottieDrawable;
            RLottieDrawable rLottieDrawable2;
            byte[] bArr3;
            char c6;
            boolean z27;
            boolean z28;
            String str8;
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
                    int i19 = cacheImage2.imageType;
                    if (i19 == 5) {
                        try {
                            CacheImage cacheImage3 = this.cacheImage;
                            themePreviewDrawable = new ThemePreviewDrawable(cacheImage3.finalFilePath, (DocumentObject.ThemeDocument) cacheImage3.imageLocation.document);
                        } catch (Throwable th) {
                            FileLog.e(th);
                            themePreviewDrawable = null;
                        }
                        onPostExecute(themePreviewDrawable);
                        return;
                    }
                    boolean z29 = true;
                    if (i19 == 3 || i19 == 4) {
                        Point point = AndroidUtilities.displaySize;
                        int i20 = point.x;
                        int i21 = point.y;
                        String str9 = cacheImage2.filter;
                        if (str9 != null) {
                            String[] split = str9.split("_");
                            if (split.length >= 2) {
                                float parseFloat = Float.parseFloat(split[0]);
                                float parseFloat2 = Float.parseFloat(split[1]);
                                float f5 = AndroidUtilities.density;
                                int i22 = (int) (parseFloat2 * f5);
                                i20 = (int) (parseFloat * f5);
                                i21 = i22;
                                CacheImage cacheImage4 = this.cacheImage;
                                SvgHelper.SvgResult svgResult = SvgHelper.getSvgBitmap(cacheImage4.finalFilePath, i20, i21, cacheImage4.imageType != 4);
                                bitmap = svgResult.getBitmap();
                                SvgHelper.SvgResult svgResult2 = svgResult;
                                if (bitmap != null && !TextUtils.isEmpty(this.cacheImage.filter) && this.cacheImage.filter.contains("wallpaper")) {
                                    obj = this.cacheImage.parentObject;
                                    if (obj instanceof TLRPC.WallPaper) {
                                        bitmap = applyWallpaperSetting(bitmap, (TLRPC.WallPaper) obj);
                                    }
                                }
                                onPostExecute(WallpaperGiftBitmapDrawable.create(bitmap, svgResult2 != null ? svgResult2.getGiftPatternPositions() : null));
                                return;
                            }
                        }
                        CacheImage cacheImage42 = this.cacheImage;
                        SvgHelper.SvgResult svgResult3 = SvgHelper.getSvgBitmap(cacheImage42.finalFilePath, i20, i21, cacheImage42.imageType != 4);
                        bitmap = svgResult3.getBitmap();
                        SvgHelper.SvgResult svgResult22 = svgResult3;
                        if (bitmap != null) {
                            obj = this.cacheImage.parentObject;
                            if (obj instanceof TLRPC.WallPaper) {
                            }
                        }
                        onPostExecute(WallpaperGiftBitmapDrawable.create(bitmap, svgResult22 != null ? svgResult22.getGiftPatternPositions() : null));
                        return;
                    }
                    if (i19 == 1) {
                        int min2 = Math.min(512, AndroidUtilities.dp(170.6f));
                        int min3 = Math.min(512, AndroidUtilities.dp(170.6f));
                        String str10 = this.cacheImage.filter;
                        if (str10 != null) {
                            String[] split2 = str10.split("_");
                            if (split2.length >= 2) {
                                float parseFloat3 = Float.parseFloat(split2[0]);
                                float parseFloat4 = Float.parseFloat(split2[1]);
                                int min4 = Math.min(512, (int) (AndroidUtilities.density * parseFloat3));
                                int min5 = Math.min(512, (int) (AndroidUtilities.density * parseFloat4));
                                if (parseFloat3 > 90.0f || parseFloat4 > 90.0f || this.cacheImage.filter.contains("nolimit")) {
                                    min3 = min5;
                                    min2 = min4;
                                    z27 = false;
                                } else {
                                    min2 = Math.min(min4, NotificationCenter.screenshotTook);
                                    min3 = Math.min(min5, NotificationCenter.screenshotTook);
                                    z27 = true;
                                }
                                z23 = (split2.length >= 3 && "pcache".equals(split2[2])) || this.cacheImage.filter.contains("pcache") || !(this.cacheImage.filter.contains("nolimit") || SharedConfig.getDevicePerformanceClass() == 2);
                                z24 = this.cacheImage.filter.contains("lastframe");
                                c6 = 4;
                                z28 = this.cacheImage.filter.contains("lastreactframe");
                                if (z28) {
                                    z24 = true;
                                }
                                z21 = this.cacheImage.filter.contains("firstframe");
                            } else {
                                c6 = 4;
                                z27 = false;
                                z21 = false;
                                z28 = false;
                                z23 = false;
                                z24 = false;
                            }
                            if (split2.length >= 3) {
                                if (!"nr".equals(split2[2])) {
                                    if (!"nrs".equals(split2[2])) {
                                        str8 = "dice".equals(split2[2]) ? split2[3] : null;
                                    } else {
                                        str8 = null;
                                        i15 = 3;
                                        if (split2.length >= 5) {
                                            if ("c1".equals(split2[c6])) {
                                                i14 = min2;
                                                z25 = z27;
                                                i16 = 12;
                                            } else if ("c2".equals(split2[c6])) {
                                                i14 = min2;
                                                z25 = z27;
                                                i16 = 3;
                                            } else if ("c3".equals(split2[c6])) {
                                                i14 = min2;
                                                z25 = z27;
                                                i16 = 4;
                                            } else if ("c4".equals(split2[c6])) {
                                                i14 = min2;
                                                z25 = z27;
                                                i16 = 5;
                                            } else if ("c5".equals(split2[c6])) {
                                                i14 = min2;
                                                z25 = z27;
                                                i16 = 6;
                                            }
                                            i13 = min3;
                                            str7 = str8;
                                            z22 = z28;
                                        }
                                        i14 = min2;
                                        z25 = z27;
                                        i16 = 0;
                                        i13 = min3;
                                        str7 = str8;
                                        z22 = z28;
                                    }
                                }
                                i15 = 2;
                                if (split2.length >= 5) {
                                }
                                i14 = min2;
                                z25 = z27;
                                i16 = 0;
                                i13 = min3;
                                str7 = str8;
                                z22 = z28;
                            }
                            str8 = null;
                            i15 = 1;
                            if (split2.length >= 5) {
                            }
                            i14 = min2;
                            z25 = z27;
                            i16 = 0;
                            i13 = min3;
                            str7 = str8;
                            z22 = z28;
                        } else {
                            i13 = min3;
                            i14 = min2;
                            str7 = null;
                            z21 = false;
                            z22 = false;
                            z23 = false;
                            z24 = false;
                            i15 = 1;
                            z25 = false;
                            i16 = 0;
                        }
                        if (str7 != null) {
                            if ("🎰".equals(str7)) {
                                rLottieDrawable2 = new SlotsDrawable(str7, i14, i13);
                            } else {
                                rLottieDrawable2 = new RLottieDiceDrawable(str7, i14, i13);
                            }
                            i17 = i13;
                            i18 = i14;
                        } else {
                            File file6 = this.cacheImage.finalFilePath;
                            try {
                                randomAccessFile3 = new RandomAccessFile(this.cacheImage.finalFilePath, "r");
                            } catch (Exception e) {
                                e = e;
                                randomAccessFile3 = null;
                            } catch (Throwable th2) {
                                th = th2;
                                randomAccessFile2 = null;
                                Throwable th3 = th;
                                if (randomAccessFile2 != null) {
                                }
                            }
                            try {
                                bArr3 = this.cacheImage.type == 1 ? ImageLoader.headerThumb : ImageLoader.header;
                                randomAccessFile3.readFully(bArr3, 0, 2);
                            } catch (Exception e2) {
                                e = e2;
                                try {
                                    FileLog.e((Throwable) e, false);
                                    if (randomAccessFile3 != null) {
                                        try {
                                            randomAccessFile3.close();
                                        } catch (Exception e3) {
                                            e = e3;
                                            z26 = false;
                                            FileLog.e(e);
                                            if (!z24) {
                                            }
                                            z23 = false;
                                            if (z23) {
                                            }
                                            cacheOptions2 = new BitmapsCache.CacheOptions();
                                            if (z24) {
                                            }
                                            cacheOptions2.firstFrame = true;
                                            cacheOptions3 = cacheOptions2;
                                            ImageLocation imageLocation2 = this.cacheImage.imageLocation;
                                            if (imageLocation2 == null) {
                                            }
                                            if (z26) {
                                            }
                                            rLottieDrawable2 = rLottieDrawable;
                                            if (!z24) {
                                            }
                                            loadLastFrame(rLottieDrawable2, i17, i18, z24, z22);
                                            return;
                                        }
                                    }
                                    z26 = false;
                                    if (!z24) {
                                    }
                                    z23 = false;
                                    if (z23) {
                                    }
                                    cacheOptions2 = new BitmapsCache.CacheOptions();
                                    if (z24) {
                                    }
                                    cacheOptions2.firstFrame = true;
                                    cacheOptions3 = cacheOptions2;
                                    ImageLocation imageLocation22 = this.cacheImage.imageLocation;
                                    if (imageLocation22 == null) {
                                    }
                                    if (z26) {
                                    }
                                    rLottieDrawable2 = rLottieDrawable;
                                    if (!z24) {
                                    }
                                    loadLastFrame(rLottieDrawable2, i17, i18, z24, z22);
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    randomAccessFile2 = randomAccessFile3;
                                    Throwable th32 = th;
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                            throw th32;
                                        } catch (Exception e4) {
                                            FileLog.e(e4);
                                            throw th32;
                                        }
                                    }
                                    throw th32;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                randomAccessFile2 = randomAccessFile3;
                                Throwable th322 = th;
                                if (randomAccessFile2 != null) {
                                }
                            }
                            if (bArr3[0] == 31) {
                                if (bArr3[1] == -117) {
                                    z26 = true;
                                    randomAccessFile3.close();
                                    if (!z24 || z21) {
                                        z23 = false;
                                    }
                                    if (!z23 || z24 || z21) {
                                        cacheOptions2 = new BitmapsCache.CacheOptions();
                                        if (z24 && !z21) {
                                            String str11 = this.cacheImage.filter;
                                            if (str11 != null && str11.contains("compress")) {
                                                cacheOptions2.compressQuality = 60;
                                            }
                                            String str12 = this.cacheImage.filter;
                                            if (str12 != null && str12.contains("flbk")) {
                                                cacheOptions2.fallback = true;
                                            }
                                        } else {
                                            cacheOptions2.firstFrame = true;
                                        }
                                        cacheOptions3 = cacheOptions2;
                                    } else {
                                        cacheOptions3 = null;
                                    }
                                    ImageLocation imageLocation222 = this.cacheImage.imageLocation;
                                    boolean z30 = imageLocation222 == null && MessageObject.isTextColorEmoji(imageLocation222.document);
                                    if (z26) {
                                        File file7 = this.cacheImage.finalFilePath;
                                        i17 = i13;
                                        i18 = i14;
                                        rLottieDrawable = new RLottieDrawable(file7, ImageLoader.decompressGzip(file7), i18, i17, cacheOptions3, z25, null, i16, z30);
                                    } else {
                                        i17 = i13;
                                        i18 = i14;
                                        rLottieDrawable = new RLottieDrawable(this.cacheImage.finalFilePath, null, i18, i17, cacheOptions3, z25, null, i16, z30);
                                    }
                                    rLottieDrawable2 = rLottieDrawable;
                                }
                            }
                            z26 = false;
                            randomAccessFile3.close();
                            if (!z24) {
                            }
                            z23 = false;
                            if (z23) {
                            }
                            cacheOptions2 = new BitmapsCache.CacheOptions();
                            if (z24) {
                            }
                            cacheOptions2.firstFrame = true;
                            cacheOptions3 = cacheOptions2;
                            ImageLocation imageLocation2222 = this.cacheImage.imageLocation;
                            if (imageLocation2222 == null) {
                            }
                            if (z26) {
                            }
                            rLottieDrawable2 = rLottieDrawable;
                        }
                        if (!z24 || z21) {
                            loadLastFrame(rLottieDrawable2, i17, i18, z24, z22);
                            return;
                        } else {
                            rLottieDrawable2.setAutoRepeat(i15);
                            onPostExecute(rLottieDrawable2);
                            return;
                        }
                    }
                    int i23 = 4;
                    if (i19 == 2) {
                        long j = imageLocation.videoSeekTo;
                        String str13 = cacheImage2.filter;
                        if (str13 != null) {
                            String[] split3 = str13.split("_");
                            if (split3.length >= 2) {
                                float parseFloat5 = Float.parseFloat(split3[0]);
                                float parseFloat6 = Float.parseFloat(split3[1]);
                                if (parseFloat5 <= 90.0f && parseFloat6 <= 90.0f && !this.cacheImage.filter.contains("nolimit")) {
                                    z14 = true;
                                    z20 = false;
                                    z15 = false;
                                    z16 = false;
                                    z17 = false;
                                    for (i12 = 0; i12 < split3.length; i12++) {
                                        if ("pcache".equals(split3[i12])) {
                                            z15 = true;
                                        }
                                        if ("firstframe".equals(split3[i12])) {
                                            z20 = true;
                                        }
                                        if ("nostream".equals(split3[i12])) {
                                            z17 = true;
                                        }
                                        if ("pframe".equals(split3[i12])) {
                                            z16 = true;
                                        }
                                    }
                                    z18 = z20;
                                    if (z20) {
                                        z17 = true;
                                    }
                                }
                            }
                            z14 = false;
                            z20 = false;
                            z15 = false;
                            z16 = false;
                            z17 = false;
                            while (i12 < split3.length) {
                            }
                            z18 = z20;
                            if (z20) {
                            }
                        } else {
                            z14 = false;
                            z15 = false;
                            z16 = false;
                            z17 = false;
                            z18 = false;
                        }
                        if (!z16) {
                            if (!z15 || z18) {
                                cacheOptions = null;
                            } else {
                                BitmapsCache.CacheOptions cacheOptions4 = new BitmapsCache.CacheOptions();
                                String str14 = this.cacheImage.filter;
                                if (str14 != null && str14.contains("compress")) {
                                    cacheOptions4.compressQuality = 60;
                                }
                                cacheOptions = cacheOptions4;
                            }
                            if (ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter) || ImageLoader.AUTOPLAY_FILTER.equals(this.cacheImage.filter) || ImageLoader.AUTOPLAY_FILTER_NONLOOP.equals(this.cacheImage.filter)) {
                                CacheImage cacheImage5 = this.cacheImage;
                                ImageLocation imageLocation3 = cacheImage5.imageLocation;
                                TLRPC.Document document = imageLocation3.document;
                                if (!(document instanceof TLRPC.TL_documentEncrypted) && !z15) {
                                    if (!OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(document)) {
                                        document = null;
                                    }
                                    long j2 = document != null ? cacheImage5.size : imageLocation3.currentSize;
                                    int i24 = document != null ? 1 : 0;
                                    int i25 = cacheImage5.cacheType;
                                    int i26 = i25 > 1 ? i25 : i24;
                                    CacheImage cacheImage6 = this.cacheImage;
                                    animatedFileDrawable = new AnimatedFileDrawable(cacheImage6.finalFilePath, z18, z17 ? 0L : j2, cacheImage6.priority, z17 ? null : document, (document != null || z17) ? null : cacheImage6.imageLocation, cacheImage6.parentObject, j, cacheImage6.currentAccount, false, 0, 0, cacheOptions, i26, !ImageLoader.AUTOPLAY_FILTER_NONLOOP.equals(cacheImage6.filter));
                                    z19 = z18;
                                    if (!MessageObject.isWebM(document) && !MessageObject.isVideoSticker(document) && !ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter)) {
                                        z29 = false;
                                    }
                                    animatedFileDrawable.setIsWebmSticker(z29);
                                    if (z19) {
                                        Bitmap frameAtTime = animatedFileDrawable.getFrameAtTime(0L, false);
                                        animatedFileDrawable.recycle();
                                        Thread.interrupted();
                                        if (frameAtTime == null) {
                                            onPostExecute(null);
                                            return;
                                        } else {
                                            onPostExecute(new BitmapDrawable(frameAtTime));
                                            return;
                                        }
                                    }
                                    animatedFileDrawable.setLimitFps(z14);
                                    Thread.interrupted();
                                    onPostExecute(animatedFileDrawable);
                                    return;
                                }
                            }
                            z19 = z18;
                            String str15 = this.cacheImage.filter;
                            if (str15 != null) {
                                String[] split4 = str15.split("_");
                                if (split4.length >= 2) {
                                    float parseFloat7 = Float.parseFloat(split4[0]);
                                    float parseFloat8 = Float.parseFloat(split4[1]);
                                    float f6 = AndroidUtilities.density;
                                    i11 = (int) (parseFloat8 * f6);
                                    i10 = (int) (parseFloat7 * f6);
                                    boolean z31 = !z19 || ((str6 = this.cacheImage.filter) != null && ("d".equals(str6) || this.cacheImage.filter.contains("_d")));
                                    int i27 = (!z17 ? null : this.cacheImage.imageLocation.document) == null ? 1 : 0;
                                    int i28 = this.cacheImage.cacheType;
                                    int i29 = i28 <= 1 ? i28 : i27;
                                    CacheImage cacheImage7 = this.cacheImage;
                                    animatedFileDrawable = new AnimatedFileDrawable(cacheImage7.finalFilePath, z31, 0L, cacheImage7.priority, !z17 ? null : cacheImage7.imageLocation.document, null, null, j, cacheImage7.currentAccount, false, i10, i11, cacheOptions, i29, true);
                                    if (!MessageObject.isWebM(this.cacheImage.imageLocation.document) && !MessageObject.isVideoSticker(this.cacheImage.imageLocation.document) && !ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter)) {
                                        z29 = false;
                                    }
                                    animatedFileDrawable.setIsWebmSticker(z29);
                                    if (z19) {
                                    }
                                }
                            }
                            i10 = 0;
                            i11 = 0;
                            if (z19) {
                            }
                            if ((!z17 ? null : this.cacheImage.imageLocation.document) == null) {
                            }
                            int i282 = this.cacheImage.cacheType;
                            if (i282 <= 1) {
                            }
                            CacheImage cacheImage72 = this.cacheImage;
                            animatedFileDrawable = new AnimatedFileDrawable(cacheImage72.finalFilePath, z31, 0L, cacheImage72.priority, !z17 ? null : cacheImage72.imageLocation.document, null, null, j, cacheImage72.currentAccount, false, i10, i11, cacheOptions, i29, true);
                            if (!MessageObject.isWebM(this.cacheImage.imageLocation.document)) {
                                z29 = false;
                            }
                            animatedFileDrawable.setIsWebmSticker(z29);
                            if (z19) {
                            }
                        } else {
                            try {
                                mediaMetadataRetriever = new MediaMetadataRetriever();
                                mediaMetadataRetriever.setDataSource(this.cacheImage.finalFilePath.getAbsolutePath());
                                bitmap6 = mediaMetadataRetriever.getFrameAtTime(2L);
                            } catch (Exception e5) {
                                e = e5;
                                bitmap6 = null;
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Exception e6) {
                                e = e6;
                                e.printStackTrace();
                                Thread.interrupted();
                                if (bitmap6 != null) {
                                }
                            }
                            Thread.interrupted();
                            if (bitmap6 != null) {
                                onPostExecute(null);
                            } else {
                                onPostExecute(new BitmapDrawable(bitmap6));
                            }
                        }
                    } else {
                        File file8 = cacheImage2.finalFilePath;
                        ?? r3 = (cacheImage2.secureDocument == null && (cacheImage2.encryptionKeyPath == null || file8 == null || !file8.getAbsolutePath().endsWith(".enc"))) ? 0 : 1;
                        CacheImage cacheImage8 = this.cacheImage;
                        SecureDocument secureDocument = cacheImage8.secureDocument;
                        if (secureDocument != null) {
                            secureDocumentKey = secureDocument.secureDocumentKey;
                            TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
                            bArr = (tL_secureFile == null || (bArr2 = tL_secureFile.file_hash) == null) ? secureDocument.fileHash : bArr2;
                        } else {
                            bArr = null;
                            secureDocumentKey = null;
                        }
                        String str16 = cacheImage8.imageLocation.path;
                        if (str16 != null) {
                            if (str16.startsWith("thumb://")) {
                                int indexOf = str16.indexOf(":", 8);
                                if (indexOf >= 0) {
                                    l = Long.valueOf(Long.parseLong(str16.substring(8, indexOf)));
                                    str5 = str16.substring(indexOf + 1);
                                } else {
                                    str5 = null;
                                    l = null;
                                }
                                str = str5;
                                z = false;
                            } else {
                                if (str16.startsWith("vthumb://")) {
                                    int indexOf2 = str16.indexOf(":", 9);
                                    if (indexOf2 >= 0) {
                                        l3 = Long.valueOf(Long.parseLong(str16.substring(9, indexOf2)));
                                        z13 = true;
                                        l = l3;
                                        z = z13;
                                        str = null;
                                    }
                                }
                                l3 = null;
                                z13 = false;
                                l = l3;
                                z = z13;
                                str = null;
                            }
                            z2 = false;
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = 1;
                            boolean z32 = ImageLoader.this.canForce8888;
                            ?? r18 = 1067030938;
                            r18 = 1067030938;
                            str4 = this.cacheImage.filter;
                            if (str4 == null) {
                                f = 0.0f;
                                try {
                                    String[] split5 = str4.split("_");
                                    if (split5.length >= 2) {
                                        f2 = Float.parseFloat(split5[0]) * AndroidUtilities.density;
                                        try {
                                            f3 = Float.parseFloat(split5[1]) * AndroidUtilities.density;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            str2 = str;
                                            l2 = l;
                                            z3 = z;
                                            bitmap2 = null;
                                            c = 0;
                                            f3 = 0.0f;
                                            secureDocumentKey2 = null;
                                            z4 = z32;
                                            i = 1;
                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                            f4 = f3;
                                            secureDocumentKey3 = secureDocumentKey2;
                                            r14 = z4;
                                            if (this.cacheImage.type == i) {
                                            }
                                        }
                                    } else {
                                        f2 = 0.0f;
                                        f3 = 0.0f;
                                    }
                                    try {
                                        if (this.cacheImage.filter.contains("b2r")) {
                                            c = 4;
                                        } else if (this.cacheImage.filter.contains("b2")) {
                                            c = 3;
                                        } else if (this.cacheImage.filter.contains("b1")) {
                                            c = 2;
                                        } else {
                                            c = this.cacheImage.filter.contains("b") ? (char) 1 : (char) 0;
                                        }
                                        try {
                                            boolean contains = this.cacheImage.filter.contains("i");
                                            try {
                                                if (this.cacheImage.filter.contains("f")) {
                                                    z32 = true;
                                                } else {
                                                    z32 = z32;
                                                    if (this.cacheImage.filter.contains("F")) {
                                                        z32 = false;
                                                    }
                                                }
                                                if (f2 == 0.0f || f3 == 0.0f) {
                                                    str2 = str;
                                                    l2 = l;
                                                    secureDocumentKey4 = contains ? 1 : 0;
                                                    z3 = z;
                                                } else {
                                                    options.inJustDecodeBounds = true;
                                                    try {
                                                        try {
                                                            if (l == null || str != null) {
                                                                str2 = str;
                                                                l2 = l;
                                                                if (secureDocumentKey != null) {
                                                                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(file8, "r");
                                                                    int length = (int) randomAccessFile4.length();
                                                                    byte[] bArr4 = (byte[]) ImageLoader.bytesLocal.get();
                                                                    if (bArr4 == null || bArr4.length < length) {
                                                                        bArr4 = null;
                                                                    }
                                                                    if (bArr4 == null) {
                                                                        bArr4 = new byte[length];
                                                                        ImageLoader.bytesLocal.set(bArr4);
                                                                    }
                                                                    randomAccessFile4.readFully(bArr4, 0, length);
                                                                    randomAccessFile4.close();
                                                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr4, 0, length, secureDocumentKey);
                                                                    secureDocumentKey4 = contains ? 1 : 0;
                                                                    z3 = z;
                                                                    byte[] computeSHA256 = Utilities.computeSHA256(bArr4, 0, length);
                                                                    if (bArr != null && Arrays.equals(computeSHA256, bArr)) {
                                                                        z12 = false;
                                                                        int i30 = bArr4[0] & 255;
                                                                        int i31 = length - i30;
                                                                        if (!z12) {
                                                                            BitmapFactory.decodeByteArray(bArr4, i30, i31, options);
                                                                        }
                                                                    }
                                                                    z12 = true;
                                                                    int i302 = bArr4[0] & 255;
                                                                    int i312 = length - i302;
                                                                    if (!z12) {
                                                                    }
                                                                } else {
                                                                    secureDocumentKey4 = contains ? 1 : 0;
                                                                    z3 = z;
                                                                    if (r3 != 0) {
                                                                        fileInputStream3 = new EncryptedFileInputStream(file8, this.cacheImage.encryptionKeyPath);
                                                                    } else {
                                                                        fileInputStream3 = new FileInputStream(file8);
                                                                    }
                                                                    BitmapFactory.decodeStream(fileInputStream3, null, options);
                                                                    fileInputStream3.close();
                                                                }
                                                            } else {
                                                                if (z) {
                                                                    str2 = str;
                                                                    l2 = l;
                                                                    MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l2.longValue(), 1, options);
                                                                } else {
                                                                    str2 = str;
                                                                    l2 = l;
                                                                    MediaStore.Images.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l2.longValue(), 1, options);
                                                                }
                                                                secureDocumentKey4 = contains ? 1 : 0;
                                                                z3 = z;
                                                            }
                                                            float f7 = options.outWidth;
                                                            float f8 = options.outHeight;
                                                            if (f2 >= f3 && f7 > f8) {
                                                                min = Math.max(f7 / f2, f8 / f3);
                                                            } else {
                                                                min = Math.min(f7 / f2, f8 / f3);
                                                            }
                                                            if (min < 1.2f) {
                                                                min = 1.0f;
                                                            }
                                                            options.inJustDecodeBounds = false;
                                                            if (min > 1.0f && (f7 > f2 || f8 > f3)) {
                                                                int i32 = 1;
                                                                while (true) {
                                                                    i9 = i32 * 2;
                                                                    if (i32 * 4 >= min) {
                                                                        break;
                                                                    } else {
                                                                        i32 = i9;
                                                                    }
                                                                }
                                                                options.inSampleSize = i9;
                                                            } else {
                                                                options.inSampleSize = (int) min;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            z11 = z32;
                                                            bitmap2 = null;
                                                            z4 = z11;
                                                            i = 1;
                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                            f4 = f3;
                                                            secureDocumentKey3 = secureDocumentKey2;
                                                            r14 = z4;
                                                            if (this.cacheImage.type == i) {
                                                            }
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        secureDocumentKey2 = contains ? 1 : 0;
                                                        z3 = z;
                                                        z11 = z32;
                                                        bitmap2 = null;
                                                        z4 = z11;
                                                        i = 1;
                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                        f4 = f3;
                                                        secureDocumentKey3 = secureDocumentKey2;
                                                        r14 = z4;
                                                        if (this.cacheImage.type == i) {
                                                        }
                                                    }
                                                }
                                                f4 = f3;
                                                secureDocumentKey3 = secureDocumentKey4;
                                                bitmap2 = null;
                                                i = 1;
                                                r14 = z32;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                str2 = str;
                                                l2 = l;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            str2 = str;
                                            l2 = l;
                                            z3 = z;
                                            bitmap2 = null;
                                            secureDocumentKey2 = null;
                                            z4 = z32;
                                            i = 1;
                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                            f4 = f3;
                                            secureDocumentKey3 = secureDocumentKey2;
                                            r14 = z4;
                                            if (this.cacheImage.type == i) {
                                            }
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        str2 = str;
                                        l2 = l;
                                        z3 = z;
                                        bitmap2 = null;
                                        c = 0;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    str2 = str;
                                    l2 = l;
                                    z3 = z;
                                    bitmap2 = null;
                                    c = 0;
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    secureDocumentKey2 = null;
                                    z4 = z32;
                                    i = 1;
                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                    f4 = f3;
                                    secureDocumentKey3 = secureDocumentKey2;
                                    r14 = z4;
                                    if (this.cacheImage.type == i) {
                                    }
                                }
                            } else {
                                str2 = str;
                                l2 = l;
                                z3 = z;
                                f = 0.0f;
                                if (str2 != null) {
                                    try {
                                        options.inJustDecodeBounds = true;
                                        options.inPreferredConfig = z32 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                        FileInputStream fileInputStream4 = new FileInputStream(file8);
                                        bitmap2 = BitmapFactory.decodeStream(fileInputStream4, null, options);
                                        try {
                                            fileInputStream4.close();
                                            int i33 = options.outWidth;
                                            int i34 = options.outHeight;
                                            options.inJustDecodeBounds = false;
                                            float min6 = (Math.min(i34, i33) / Math.max(66, Math.min(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y))) * 6.0f;
                                            if (min6 < 1.0f) {
                                                min6 = 1.0f;
                                            }
                                            if (min6 > 1.0f) {
                                                int i35 = 1;
                                                while (true) {
                                                    i8 = i35 * 2;
                                                    if (i35 * 4 > min6) {
                                                        break;
                                                    } else {
                                                        i35 = i8;
                                                    }
                                                }
                                                options.inSampleSize = i8;
                                            } else {
                                                options.inSampleSize = (int) min6;
                                            }
                                            f4 = 0.0f;
                                        } catch (Throwable th13) {
                                            th = th13;
                                            c = 0;
                                            f2 = 0.0f;
                                            f3 = 0.0f;
                                            secureDocumentKey2 = null;
                                            z4 = z32;
                                            i = 1;
                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                            f4 = f3;
                                            secureDocumentKey3 = secureDocumentKey2;
                                            r14 = z4;
                                            if (this.cacheImage.type == i) {
                                            }
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        bitmap2 = null;
                                        c = 0;
                                        f2 = 0.0f;
                                        f3 = 0.0f;
                                        secureDocumentKey2 = null;
                                        z4 = z32;
                                        i = 1;
                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                        f4 = f3;
                                        secureDocumentKey3 = secureDocumentKey2;
                                        r14 = z4;
                                        if (this.cacheImage.type == i) {
                                        }
                                    }
                                } else {
                                    f4 = 0.0f;
                                    bitmap2 = null;
                                }
                                c = 0;
                                i = 1;
                                secureDocumentKey3 = null;
                                f2 = 0.0f;
                                r14 = z32;
                            }
                            if (this.cacheImage.type == i) {
                                try {
                                    ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                } catch (Throwable th15) {
                                    th = th15;
                                }
                                synchronized (this.sync) {
                                    try {
                                        try {
                                        } catch (Throwable th16) {
                                            th = th16;
                                        }
                                        if (this.isCancelled) {
                                            return;
                                        }
                                        try {
                                            if (secureDocumentKey != null) {
                                                RandomAccessFile randomAccessFile5 = new RandomAccessFile(file8, "r");
                                                int length2 = (int) randomAccessFile5.length();
                                                byte[] bArr5 = (byte[]) ImageLoader.bytesThumbLocal.get();
                                                if (bArr5 == null || bArr5.length < length2) {
                                                    bArr5 = null;
                                                }
                                                if (bArr5 == null) {
                                                    bArr5 = new byte[length2];
                                                    ImageLoader.bytesThumbLocal.set(bArr5);
                                                }
                                                randomAccessFile5.readFully(bArr5, 0, length2);
                                                randomAccessFile5.close();
                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr5, 0, length2, secureDocumentKey);
                                                Bitmap bitmap7 = bitmap2;
                                                c2 = c;
                                                byte[] computeSHA2562 = Utilities.computeSHA256(bArr5, 0, length2);
                                                if (bArr != null && Arrays.equals(computeSHA2562, bArr)) {
                                                    z7 = false;
                                                    int i36 = bArr5[0] & 255;
                                                    bitmap2 = z7 ? BitmapFactory.decodeByteArray(bArr5, i36, length2 - i36, options) : bitmap7;
                                                }
                                                z7 = true;
                                                int i362 = bArr5[0] & 255;
                                                if (z7) {
                                                }
                                            } else {
                                                c2 = c;
                                                if (r3 != 0) {
                                                    fileInputStream = new EncryptedFileInputStream(file8, this.cacheImage.encryptionKeyPath);
                                                } else {
                                                    fileInputStream = new FileInputStream(file8);
                                                }
                                                bitmap2 = BitmapFactory.decodeStream(fileInputStream, null, options);
                                                fileInputStream.close();
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            z5 = false;
                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                            z = r3;
                                            z6 = z5;
                                            i2 = 0;
                                            file = file8;
                                            i3 = 0;
                                            Thread.interrupted();
                                            if (BuildVars.LOGS_ENABLED) {
                                            }
                                            if (bitmap2 != null) {
                                            }
                                            cacheImage = this.cacheImage;
                                            if (cacheImage != null) {
                                            }
                                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                            return;
                                        }
                                        if (bitmap2 == null) {
                                            if (file8.length() != 0 && this.cacheImage.filter != null) {
                                                z = r3;
                                                i2 = 0;
                                                z6 = false;
                                                file = file8;
                                                i3 = 0;
                                                Thread.interrupted();
                                                if (BuildVars.LOGS_ENABLED && z) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Image Loader image is empty = ");
                                                    sb.append(bitmap2 != null);
                                                    sb.append(" ");
                                                    sb.append(file);
                                                    FileLog.e(sb.toString());
                                                }
                                                if (bitmap2 != null && !TextUtils.isEmpty(this.cacheImage.filter) && this.cacheImage.filter.contains("wallpaper")) {
                                                    obj2 = this.cacheImage.parentObject;
                                                    if (obj2 instanceof TLRPC.WallPaper) {
                                                        bitmap2 = applyWallpaperSetting(bitmap2, (TLRPC.WallPaper) obj2);
                                                    }
                                                }
                                                cacheImage = this.cacheImage;
                                                if ((cacheImage != null || (str3 = cacheImage.filter) == null || !str3.contains("ignoreOrientation")) && (z6 || i2 != 0 || i3 != 0)) {
                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                    return;
                                                } else {
                                                    onPostExecute(bitmap2 != null ? new BitmapDrawable(bitmap2) : null);
                                                    return;
                                                }
                                            }
                                            file8.delete();
                                            z = r3;
                                            r9 = false;
                                            i23 = 0;
                                            file2 = file8;
                                            i3 = r9;
                                            i2 = i23;
                                            z6 = false;
                                            file = file2;
                                            Thread.interrupted();
                                            if (BuildVars.LOGS_ENABLED) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("Image Loader image is empty = ");
                                                sb2.append(bitmap2 != null);
                                                sb2.append(" ");
                                                sb2.append(file);
                                                FileLog.e(sb2.toString());
                                            }
                                            if (bitmap2 != null) {
                                                obj2 = this.cacheImage.parentObject;
                                                if (obj2 instanceof TLRPC.WallPaper) {
                                                }
                                            }
                                            cacheImage = this.cacheImage;
                                            if (cacheImage != null) {
                                            }
                                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                            return;
                                        }
                                        if (this.cacheImage.filter != null) {
                                            float width = bitmap2.getWidth();
                                            float height = bitmap2.getHeight();
                                            if (f2 != f && width != f2 && width > 20.0f + f2 && bitmap2 != (createScaledBitmap = Bitmaps.createScaledBitmap(bitmap2, (int) f2, (int) (height / (width / f2)), true))) {
                                                bitmap2.recycle();
                                                bitmap2 = createScaledBitmap;
                                            }
                                        }
                                        if (secureDocumentKey3 == null || Utilities.needInvert(bitmap2) == 0) {
                                            c3 = c2;
                                            z5 = false;
                                        } else {
                                            c3 = c2;
                                            z5 = true;
                                        }
                                        try {
                                            if (c3 == 1) {
                                                if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                    Utilities.blurBitmap(bitmap2, 3);
                                                }
                                            } else if (c3 == 2) {
                                                if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                    Utilities.blurBitmap(bitmap2, 1);
                                                }
                                            } else {
                                                if (c3 != 3) {
                                                    c4 = 4;
                                                    if (c3 == 4) {
                                                    }
                                                } else {
                                                    c4 = 4;
                                                }
                                                if (bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                    if (c3 == c4) {
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
                                            }
                                        } catch (Throwable th18) {
                                            th = th18;
                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                            z = r3;
                                            z6 = z5;
                                            i2 = 0;
                                            file = file8;
                                            i3 = 0;
                                            Thread.interrupted();
                                            if (BuildVars.LOGS_ENABLED) {
                                            }
                                            if (bitmap2 != null) {
                                            }
                                            cacheImage = this.cacheImage;
                                            if (cacheImage != null) {
                                            }
                                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                            return;
                                        }
                                        z = r3;
                                        z6 = z5;
                                        i2 = 0;
                                        file = file8;
                                        i3 = 0;
                                        Thread.interrupted();
                                        if (BuildVars.LOGS_ENABLED) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        cacheImage = this.cacheImage;
                                        if (cacheImage != null) {
                                        }
                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                        return;
                                    } finally {
                                        th = th;
                                        Bitmap bitmap8 = bitmap2;
                                        while (true) {
                                            try {
                                            } catch (Throwable th19) {
                                                th = th19;
                                            }
                                        }
                                    }
                                }
                            } else {
                                Bitmap bitmap9 = bitmap2;
                                try {
                                    z8 = r3;
                                    try {
                                        ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                    } catch (Throwable th20) {
                                        th = th20;
                                        z = z8;
                                        r3 = file8;
                                    }
                                } catch (Throwable th21) {
                                    th = th21;
                                    z = r3;
                                    r3 = file8;
                                }
                                try {
                                } catch (Throwable th22) {
                                    th = th22;
                                    bitmap2 = bitmap9;
                                    file3 = r3;
                                    i4 = 0;
                                    z6 = false;
                                    i23 = 0;
                                    file4 = file3;
                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                    i2 = i23;
                                    i3 = i4;
                                    file = file4;
                                    Thread.interrupted();
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    if (bitmap2 != null) {
                                    }
                                    cacheImage = this.cacheImage;
                                    if (cacheImage != null) {
                                    }
                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                    return;
                                }
                                synchronized (this.sync) {
                                    try {
                                        if (this.isCancelled) {
                                            return;
                                        }
                                        if (r14 == 0) {
                                            CacheImage cacheImage9 = this.cacheImage;
                                            if (cacheImage9.filter != null && c == 0 && cacheImage9.imageLocation.path == null) {
                                                options.inPreferredConfig = Bitmap.Config.RGB_565;
                                                options.inDither = false;
                                                if (l2 == null && str2 == null) {
                                                    if (!z3) {
                                                        z = z8;
                                                        c5 = c;
                                                        file5 = file8;
                                                        thumbnail = MediaStore.Images.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l2.longValue(), 1, options);
                                                    } else if (l2.longValue() == 0) {
                                                        AnimatedFileDrawable animatedFileDrawable2 = new AnimatedFileDrawable(file8, true, 0L, 0, null, null, null, 0L, 0, true, null);
                                                        File file9 = file8;
                                                        z = z8;
                                                        c5 = c;
                                                        Bitmap frameAtTime2 = animatedFileDrawable2.getFrameAtTime(0L, true);
                                                        try {
                                                            animatedFileDrawable2.recycle();
                                                            bitmap2 = frameAtTime2;
                                                            file2 = file9;
                                                            r18 = animatedFileDrawable2;
                                                        } catch (Throwable th23) {
                                                            th = th23;
                                                            bitmap2 = frameAtTime2;
                                                            file3 = file9;
                                                            i4 = 0;
                                                            z6 = false;
                                                            i23 = 0;
                                                            file4 = file3;
                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                            i2 = i23;
                                                            i3 = i4;
                                                            file = file4;
                                                            Thread.interrupted();
                                                            if (BuildVars.LOGS_ENABLED) {
                                                            }
                                                            if (bitmap2 != null) {
                                                            }
                                                            cacheImage = this.cacheImage;
                                                            if (cacheImage != null) {
                                                            }
                                                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                            return;
                                                        }
                                                    } else {
                                                        z = z8;
                                                        c5 = c;
                                                        file5 = file8;
                                                        thumbnail = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l2.longValue(), 1, options);
                                                    }
                                                    bitmap2 = thumbnail;
                                                    file2 = file5;
                                                } else {
                                                    z = z8;
                                                    c5 = c;
                                                    file2 = file8;
                                                    bitmap2 = bitmap9;
                                                }
                                                if (bitmap2 != null) {
                                                    if (bitmap2 == null) {
                                                        try {
                                                            if (secureDocumentKey != null) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file2, secureDocumentKey);
                                                            } else if (z) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file2, this.cacheImage.encryptionKeyPath);
                                                            } else {
                                                                try {
                                                                    fileInputStream2 = new FileInputStream(file2);
                                                                } catch (Throwable th24) {
                                                                    th = th24;
                                                                    bitmap2 = bitmap2;
                                                                    file3 = file2;
                                                                    i4 = 0;
                                                                    z6 = false;
                                                                    i23 = 0;
                                                                    file4 = file3;
                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                    i2 = i23;
                                                                    i3 = i4;
                                                                    file = file4;
                                                                    Thread.interrupted();
                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    cacheImage = this.cacheImage;
                                                                    if (cacheImage != null) {
                                                                    }
                                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                                    return;
                                                                }
                                                            }
                                                            ?? r2 = this.cacheImage;
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (!(r2.imageLocation.document instanceof TLRPC.TL_document)) {
                                                                                String str17 = r2.filter;
                                                                                if (str17 != null) {
                                                                                }
                                                                                r14 = bitmap2;
                                                                                r2 = 0;
                                                                                rect = null;
                                                                                i23 = 0;
                                                                                decodeStream = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                                                fileInputStream2.close();
                                                                                i6 = r2;
                                                                            }
                                                                            if (secureDocumentKey == null) {
                                                                                try {
                                                                                    if (this.cacheImage.encryptionKeyPath == null) {
                                                                                        bitmap3 = bitmap2;
                                                                                        i23 = intValue;
                                                                                        fileInputStream2.getChannel().position(0L);
                                                                                        rect = null;
                                                                                        r2 = r2;
                                                                                        r14 = bitmap3;
                                                                                        decodeStream = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                                                        fileInputStream2.close();
                                                                                        i6 = r2;
                                                                                    }
                                                                                } catch (Throwable th25) {
                                                                                    th = th25;
                                                                                    i23 = intValue;
                                                                                    i5 = r2;
                                                                                    z6 = false;
                                                                                    i4 = i5;
                                                                                    file4 = file2;
                                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                    i2 = i23;
                                                                                    i3 = i4;
                                                                                    file = file4;
                                                                                    Thread.interrupted();
                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                    }
                                                                                    if (bitmap2 != null) {
                                                                                    }
                                                                                    cacheImage = this.cacheImage;
                                                                                    if (cacheImage != null) {
                                                                                    }
                                                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            fileInputStream2.close();
                                                                            i6 = r2;
                                                                        } catch (Throwable th26) {
                                                                            th = th26;
                                                                            bitmap2 = decodeStream;
                                                                            i5 = r2;
                                                                            z6 = false;
                                                                            i4 = i5;
                                                                            file4 = file2;
                                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                            i2 = i23;
                                                                            i3 = i4;
                                                                            file = file4;
                                                                            Thread.interrupted();
                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                            }
                                                                            if (bitmap2 != null) {
                                                                            }
                                                                            cacheImage = this.cacheImage;
                                                                            if (cacheImage != null) {
                                                                            }
                                                                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                                            return;
                                                                        }
                                                                        fileInputStream2.close();
                                                                        bitmap3 = r14;
                                                                        if (secureDocumentKey != null) {
                                                                            fileInputStream2 = new EncryptedFileInputStream(file2, secureDocumentKey);
                                                                            bitmap3 = r14;
                                                                        } else if (z) {
                                                                            fileInputStream2 = new EncryptedFileInputStream(file2, this.cacheImage.encryptionKeyPath);
                                                                            bitmap3 = r14;
                                                                        }
                                                                        rect = null;
                                                                        r2 = r2;
                                                                        r14 = bitmap3;
                                                                        decodeStream = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                                    } catch (Throwable th27) {
                                                                        th = th27;
                                                                        bitmap2 = r14;
                                                                        i5 = r2;
                                                                        z6 = false;
                                                                        i4 = i5;
                                                                        file4 = file2;
                                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                        i2 = i23;
                                                                        i3 = i4;
                                                                        file = file4;
                                                                        Thread.interrupted();
                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                        }
                                                                        if (bitmap2 != null) {
                                                                        }
                                                                        cacheImage = this.cacheImage;
                                                                        if (cacheImage != null) {
                                                                        }
                                                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                                        return;
                                                                    }
                                                                    r2 = ((Integer) imageOrientation.second).intValue();
                                                                    r14 = bitmap2;
                                                                    i23 = intValue;
                                                                } catch (Throwable th28) {
                                                                    th = th28;
                                                                    i23 = intValue;
                                                                    bitmap2 = bitmap2;
                                                                    i5 = 0;
                                                                }
                                                                imageOrientation = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                                intValue = ((Integer) imageOrientation.first).intValue();
                                                            } catch (Throwable th29) {
                                                                th = th29;
                                                            }
                                                        } catch (Throwable th30) {
                                                            th = th30;
                                                            file3 = file2;
                                                        }
                                                    } else {
                                                        decodeStream = bitmap2;
                                                        i6 = 0;
                                                        i23 = 0;
                                                    }
                                                    if (decodeStream == null) {
                                                        try {
                                                            randomAccessFile = new RandomAccessFile(file2, "r");
                                                            bitmap5 = decodeStream;
                                                        } catch (Throwable th31) {
                                                            th = th31;
                                                            bitmap4 = decodeStream;
                                                        }
                                                        try {
                                                            int length3 = (int) randomAccessFile.length();
                                                            byte[] bArr6 = (byte[]) ImageLoader.bytesLocal.get();
                                                            if (bArr6 == null || bArr6.length < length3) {
                                                                bArr6 = null;
                                                            }
                                                            if (bArr6 == null) {
                                                                bArr6 = new byte[length3];
                                                                ImageLoader.bytesLocal.set(bArr6);
                                                            }
                                                            randomAccessFile.readFully(bArr6, 0, length3);
                                                            randomAccessFile.close();
                                                            try {
                                                                if (secureDocumentKey != null) {
                                                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, secureDocumentKey);
                                                                    r18 = bitmap5;
                                                                    secureDocumentKey = secureDocumentKey3;
                                                                    byte[] computeSHA2563 = Utilities.computeSHA256(bArr6, 0, length3);
                                                                    if (bArr != null && Arrays.equals(computeSHA2563, bArr)) {
                                                                        z10 = false;
                                                                        i7 = bArr6[0] & 255;
                                                                        length3 -= i7;
                                                                    }
                                                                    z10 = true;
                                                                    i7 = bArr6[0] & 255;
                                                                    length3 -= i7;
                                                                } else {
                                                                    r18 = bitmap5;
                                                                    secureDocumentKey = secureDocumentKey3;
                                                                    if (z) {
                                                                        EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, this.cacheImage.encryptionKeyPath);
                                                                    }
                                                                    z10 = false;
                                                                    i7 = 0;
                                                                }
                                                                if (!z10) {
                                                                    bitmap2 = BitmapFactory.decodeByteArray(bArr6, i7, length3, options);
                                                                    r9 = i6;
                                                                }
                                                            } catch (Throwable th33) {
                                                                th = th33;
                                                                r18 = r18;
                                                                try {
                                                                    FileLog.e(th);
                                                                    r9 = i6;
                                                                    bitmap2 = r18;
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    i3 = r9;
                                                                    i2 = i23;
                                                                    z6 = false;
                                                                    file = file2;
                                                                } catch (Throwable th34) {
                                                                    th = th34;
                                                                    bitmap2 = r18;
                                                                    i5 = i6;
                                                                    z6 = false;
                                                                    i4 = i5;
                                                                    file4 = file2;
                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                    i2 = i23;
                                                                    i3 = i4;
                                                                    file = file4;
                                                                    Thread.interrupted();
                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    cacheImage = this.cacheImage;
                                                                    if (cacheImage != null) {
                                                                    }
                                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                                    return;
                                                                }
                                                                Thread.interrupted();
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                }
                                                                if (bitmap2 != null) {
                                                                }
                                                                cacheImage = this.cacheImage;
                                                                if (cacheImage != null) {
                                                                }
                                                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                                return;
                                                            }
                                                        } catch (Throwable th35) {
                                                            th = th35;
                                                            bitmap4 = bitmap5;
                                                            secureDocumentKey = secureDocumentKey3;
                                                            r18 = bitmap4;
                                                            FileLog.e(th);
                                                            r9 = i6;
                                                            bitmap2 = r18;
                                                            if (bitmap2 != null) {
                                                            }
                                                            i3 = r9;
                                                            i2 = i23;
                                                            z6 = false;
                                                            file = file2;
                                                            Thread.interrupted();
                                                            if (BuildVars.LOGS_ENABLED) {
                                                            }
                                                            if (bitmap2 != null) {
                                                            }
                                                            cacheImage = this.cacheImage;
                                                            if (cacheImage != null) {
                                                            }
                                                            onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                            return;
                                                        }
                                                    } else {
                                                        r18 = decodeStream;
                                                        secureDocumentKey = secureDocumentKey3;
                                                    }
                                                    r9 = i6;
                                                    bitmap2 = r18;
                                                } else {
                                                    secureDocumentKey = secureDocumentKey3;
                                                    r9 = false;
                                                    i23 = 0;
                                                }
                                                if (bitmap2 != null) {
                                                    if (z2) {
                                                        if (file2.length() != 0) {
                                                            if (this.cacheImage.filter == null) {
                                                            }
                                                        }
                                                        file2.delete();
                                                    }
                                                } else if (this.cacheImage.filter != null) {
                                                    float width2 = bitmap2.getWidth();
                                                    float height2 = bitmap2.getHeight();
                                                    if (f2 != 0.0f && width2 != f2 && width2 > 20.0f + f2) {
                                                        if (width2 <= height2 || f2 <= f4) {
                                                            float f9 = height2 / f4;
                                                            if (f9 > 1.0f) {
                                                                createScaledBitmap2 = Bitmaps.createScaledBitmap(bitmap2, (int) (width2 / f9), (int) f4, true);
                                                                if (bitmap2 != createScaledBitmap2) {
                                                                    bitmap2.recycle();
                                                                    bitmap2 = createScaledBitmap2;
                                                                }
                                                            }
                                                            createScaledBitmap2 = bitmap2;
                                                            if (bitmap2 != createScaledBitmap2) {
                                                            }
                                                        } else {
                                                            float f10 = width2 / f2;
                                                            if (f10 > 1.0f) {
                                                                createScaledBitmap2 = Bitmaps.createScaledBitmap(bitmap2, (int) f2, (int) (height2 / f10), true);
                                                                if (bitmap2 != createScaledBitmap2) {
                                                                }
                                                            }
                                                            createScaledBitmap2 = bitmap2;
                                                            if (bitmap2 != createScaledBitmap2) {
                                                            }
                                                        }
                                                    }
                                                    if (bitmap2 != null) {
                                                        if (secureDocumentKey != null) {
                                                            Bitmap createScaledBitmap3 = bitmap2.getWidth() * bitmap2.getHeight() > 22500 ? Bitmaps.createScaledBitmap(bitmap2, 100, 100, false) : bitmap2;
                                                            z9 = Utilities.needInvert(createScaledBitmap3) != 0;
                                                            if (createScaledBitmap3 != bitmap2) {
                                                                try {
                                                                    createScaledBitmap3.recycle();
                                                                } catch (Throwable th36) {
                                                                    th = th36;
                                                                    i4 = r9;
                                                                    z6 = z9;
                                                                    file4 = file2;
                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                    i2 = i23;
                                                                    i3 = i4;
                                                                    file = file4;
                                                                    Thread.interrupted();
                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                    }
                                                                    if (bitmap2 != null) {
                                                                    }
                                                                    cacheImage = this.cacheImage;
                                                                    if (cacheImage != null) {
                                                                    }
                                                                    onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        if (c5 != 0 && (height2 > 100.0f || width2 > 100.0f)) {
                                                            height2 = 80.0f;
                                                            bitmap2 = Bitmaps.createScaledBitmap(bitmap2, 80, 80, false);
                                                            width2 = 80.0f;
                                                        }
                                                        if (c5 != 0 && height2 < 100.0f && width2 < 100.0f && bitmap2.getConfig() == Bitmap.Config.ARGB_8888) {
                                                            Utilities.blurBitmap(bitmap2, 3);
                                                        }
                                                        i3 = r9;
                                                        i2 = i23;
                                                        z6 = z9;
                                                        file = file2;
                                                        Thread.interrupted();
                                                        if (BuildVars.LOGS_ENABLED) {
                                                        }
                                                        if (bitmap2 != null) {
                                                        }
                                                        cacheImage = this.cacheImage;
                                                        if (cacheImage != null) {
                                                        }
                                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                        return;
                                                    }
                                                }
                                                i3 = r9;
                                                i2 = i23;
                                                z6 = false;
                                                file = file2;
                                                Thread.interrupted();
                                                if (BuildVars.LOGS_ENABLED) {
                                                }
                                                if (bitmap2 != null) {
                                                }
                                                cacheImage = this.cacheImage;
                                                if (cacheImage != null) {
                                                }
                                                onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                                return;
                                            }
                                        }
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        options.inDither = false;
                                        if (l2 == null) {
                                        }
                                        z = z8;
                                        c5 = c;
                                        file2 = file8;
                                        bitmap2 = bitmap9;
                                        if (bitmap2 != null) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        i3 = r9;
                                        i2 = i23;
                                        z6 = false;
                                        file = file2;
                                        Thread.interrupted();
                                        if (BuildVars.LOGS_ENABLED) {
                                        }
                                        if (bitmap2 != null) {
                                        }
                                        cacheImage = this.cacheImage;
                                        if (cacheImage != null) {
                                        }
                                        onPostExecute(bitmap2 != null ? new ExtendedBitmapDrawable(bitmap2, i2, i3) : null);
                                        return;
                                    } finally {
                                        th = th;
                                        while (true) {
                                            try {
                                            } catch (Throwable th37) {
                                                th = th37;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        str = null;
                        l = null;
                        z = false;
                        z2 = true;
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = 1;
                        boolean z322 = ImageLoader.this.canForce8888;
                        ?? r182 = 1067030938;
                        r182 = 1067030938;
                        str4 = this.cacheImage.filter;
                        if (str4 == null) {
                        }
                        if (this.cacheImage.type == i) {
                        }
                    }
                } finally {
                }
            }
        }

        private Bitmap applyWallpaperSetting(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
            int i;
            if (!wallPaper.pattern || wallPaper.settings == null) {
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                return (wallPaperSettings == null || !wallPaperSettings.blur) ? bitmap : Utilities.blurWallpaper(bitmap);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
            boolean z = true;
            if (wallPaperSettings2.second_background_color == 0) {
                i = AndroidUtilities.getPatternColor(wallPaperSettings2.background_color);
                canvas.drawColor(ColorUtils.setAlphaComponent(wallPaper.settings.background_color, NotificationCenter.didReceiveSmsCode));
            } else if (wallPaperSettings2.third_background_color == 0) {
                int alphaComponent = ColorUtils.setAlphaComponent(wallPaperSettings2.background_color, NotificationCenter.didReceiveSmsCode);
                int alphaComponent2 = ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, NotificationCenter.didReceiveSmsCode);
                int averageColor = AndroidUtilities.getAverageColor(alphaComponent, alphaComponent2);
                GradientDrawable gradientDrawable = new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(wallPaper.settings.rotation), new int[]{alphaComponent, alphaComponent2});
                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                gradientDrawable.draw(canvas);
                i = averageColor;
            } else {
                int alphaComponent3 = ColorUtils.setAlphaComponent(wallPaperSettings2.background_color, NotificationCenter.didReceiveSmsCode);
                int alphaComponent4 = ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, NotificationCenter.didReceiveSmsCode);
                int alphaComponent5 = ColorUtils.setAlphaComponent(wallPaper.settings.third_background_color, NotificationCenter.didReceiveSmsCode);
                int i2 = wallPaper.settings.fourth_background_color;
                int alphaComponent6 = i2 == 0 ? 0 : ColorUtils.setAlphaComponent(i2, NotificationCenter.didReceiveSmsCode);
                int patternColor = MotionBackgroundDrawable.getPatternColor(alphaComponent3, alphaComponent4, alphaComponent5, alphaComponent6);
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
                motionBackgroundDrawable.setColors(alphaComponent3, alphaComponent4, alphaComponent5, alphaComponent6);
                motionBackgroundDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                motionBackgroundDrawable.setPatternBitmap(wallPaper.settings.intensity, bitmap);
                motionBackgroundDrawable.draw(canvas);
                i = patternColor;
                z = false;
            }
            if (z) {
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((wallPaper.settings.intensity / 100.0f) * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            return createBitmap;
        }

        private void loadLastFrame(RLottieDrawable rLottieDrawable, int i, int i2, boolean z, boolean z2) {
            Bitmap createBitmap;
            Canvas canvas;
            Drawable bitmapDrawable;
            if (z && z2) {
                float f = i * 1.2f;
                float f2 = i2 * 1.2f;
                createBitmap = Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
                canvas.scale(2.0f, 2.0f, f / 2.0f, f2 / 2.0f);
            } else {
                createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
            }
            rLottieDrawable.prepareForGenerateCache();
            Bitmap createBitmap2 = Bitmap.createBitmap(rLottieDrawable.getIntrinsicWidth(), rLottieDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            rLottieDrawable.setGeneratingFrame(z ? rLottieDrawable.getFramesCount() - 1 : 0);
            rLottieDrawable.getNextFrame(createBitmap2);
            rLottieDrawable.releaseForGenerateCache();
            canvas.save();
            if (!z || !z2) {
                canvas.scale(createBitmap2.getWidth() / i, createBitmap2.getHeight() / i2, i / 2.0f, i2 / 2.0f);
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            if (z && z2) {
                canvas.drawBitmap(createBitmap2, (createBitmap.getWidth() - createBitmap2.getWidth()) / 2.0f, (createBitmap.getHeight() - createBitmap2.getHeight()) / 2.0f, paint);
                bitmapDrawable = new ImageReceiver.ReactionLastFrame(createBitmap);
            } else {
                canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            rLottieDrawable.recycle(false);
            createBitmap2.recycle();
            onPostExecute(bitmapDrawable);
        }

        private void onPostExecute(final Drawable drawable) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$CacheOutTask$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.CacheOutTask.$r8$lambda$swDZ2YDCScfKYJRfRuZgvmahrkk(ImageLoader.CacheOutTask.this, drawable);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$swDZ2YDCScfKYJRfRuZgvmahrkk(final CacheOutTask cacheOutTask, final Drawable drawable) {
            cacheOutTask.getClass();
            boolean z = false;
            final String str = null;
            if (drawable instanceof RLottieDrawable) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                Drawable drawable2 = (Drawable) ImageLoader.this.lottieMemCache.get(cacheOutTask.cacheImage.key);
                if (drawable2 == null) {
                    ImageLoader.this.lottieMemCache.put(cacheOutTask.cacheImage.key, rLottieDrawable);
                    drawable = rLottieDrawable;
                } else {
                    rLottieDrawable.recycle(false);
                    drawable = drawable2;
                }
                if (drawable != null) {
                    ImageLoader.this.incrementUseCount(cacheOutTask.cacheImage.key);
                    str = cacheOutTask.cacheImage.key;
                }
            } else if (drawable instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                if (animatedFileDrawable.isWebmSticker) {
                    BitmapDrawable fromLottieCache = ImageLoader.this.getFromLottieCache(cacheOutTask.cacheImage.key);
                    if (fromLottieCache == null) {
                        ImageLoader.this.lottieMemCache.put(cacheOutTask.cacheImage.key, animatedFileDrawable);
                        drawable = animatedFileDrawable;
                    } else {
                        animatedFileDrawable.recycle();
                        drawable = fromLottieCache;
                    }
                    ImageLoader.this.incrementUseCount(cacheOutTask.cacheImage.key);
                    str = cacheOutTask.cacheImage.key;
                }
            } else if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                BitmapDrawable fromMemCache = ImageLoader.this.getFromMemCache(cacheOutTask.cacheImage.key);
                boolean z2 = true;
                if (fromMemCache == null) {
                    if (cacheOutTask.cacheImage.key.endsWith("_f")) {
                        ImageLoader.this.wallpaperMemCache.put(cacheOutTask.cacheImage.key, bitmapDrawable);
                    } else {
                        if (!cacheOutTask.cacheImage.key.endsWith("_isc") && !cacheOutTask.cacheImage.key.endsWith("_nocache") && bitmapDrawable.getBitmap().getWidth() <= AndroidUtilities.density * 80.0f && bitmapDrawable.getBitmap().getHeight() <= AndroidUtilities.density * 80.0f) {
                            ImageLoader.this.smallImagesMemCache.put(cacheOutTask.cacheImage.key, bitmapDrawable);
                        } else if (!cacheOutTask.cacheImage.key.endsWith("_nocache")) {
                            ImageLoader.this.memCache.put(cacheOutTask.cacheImage.key, bitmapDrawable);
                        }
                        z = true;
                    }
                    z2 = z;
                    drawable = bitmapDrawable;
                } else {
                    AndroidUtilities.recycleBitmap(bitmapDrawable.getBitmap());
                    drawable = fromMemCache;
                }
                if (drawable != null && z2) {
                    ImageLoader.this.incrementUseCount(cacheOutTask.cacheImage.key);
                    str = cacheOutTask.cacheImage.key;
                }
            } else {
                drawable = null;
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$CacheOutTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.CacheOutTask.this.cacheImage.setImageAndClear(drawable, str);
                }
            }, cacheOutTask.cacheImage.priority);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAnimatedAvatar(String str) {
        return str != null && str.endsWith("avatar");
    }

    private boolean isPFrame(String str) {
        return str != null && str.endsWith("pframe");
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
        System.arraycopy(Bitmaps.footer, 0, bArr2, (Bitmaps.header.length + bArr.length) - 3, Bitmaps.footer.length);
        bArr2[164] = bArr[1];
        bArr2[166] = bArr[2];
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = !TextUtils.isEmpty(str) && str.contains("r");
        options.inPreferredConfig = (SharedConfig.deviceIsHigh() || z) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, length, options);
        if (z) {
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

    /* JADX INFO: Access modifiers changed from: private */
    class CacheImage {
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

        public void addImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i, int i2) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf >= 0 && Objects.equals(this.imageReceiverArray.get(indexOf).getImageKey(), str)) {
                this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i2));
                return;
            }
            this.imageReceiverArray.add(imageReceiver);
            this.imageReceiverGuidsArray.add(Integer.valueOf(i2));
            this.keys.add(str);
            this.filters.add(str2);
            this.types.add(Integer.valueOf(i));
            ImageLoader.this.imageLoadingByTag.put(imageReceiver.getTag(i), this);
        }

        public void replaceImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i, int i2) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf == -1) {
                return;
            }
            if (this.types.get(indexOf).intValue() != i) {
                ArrayList<ImageReceiver> arrayList = this.imageReceiverArray;
                indexOf = arrayList.subList(indexOf + 1, arrayList.size()).indexOf(imageReceiver);
                if (indexOf == -1) {
                    return;
                }
            }
            this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i2));
            this.keys.set(indexOf, str);
            this.filters.set(indexOf, str2);
        }

        public void setImageReceiverGuid(ImageReceiver imageReceiver, int i) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf == -1) {
                return;
            }
            this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i));
        }

        public void removeImageReceiver(ImageReceiver imageReceiver) {
            int i = this.type;
            int i2 = 0;
            while (i2 < this.imageReceiverArray.size()) {
                ImageReceiver imageReceiver2 = this.imageReceiverArray.get(i2);
                if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                    this.imageReceiverArray.remove(i2);
                    this.imageReceiverGuidsArray.remove(i2);
                    this.keys.remove(i2);
                    this.filters.remove(i2);
                    i = this.types.remove(i2).intValue();
                    if (imageReceiver2 != null) {
                        ImageLoader.this.imageLoadingByTag.remove(imageReceiver2.getTag(i));
                    }
                    i2--;
                }
                i2++;
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
                    if (i == 1) {
                        ImageLoader.this.cacheThumbOutQueue.cancelRunnable(this.cacheTask);
                    } else {
                        ImageLoader.this.cacheOutQueue.cancelRunnable(this.cacheTask);
                        ImageLoader.this.cacheOutQueue.cancelRunnable(this.runningTask);
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
        void changePriority(int i) {
            TLRPC.Document document;
            ?? r6;
            TLObject tLObject;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2;
            ?? r9;
            ?? r7;
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation != null) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
                if (tL_fileLocationToBeDeprecated3 != null) {
                    r9 = this.ext;
                    tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated3;
                    document = null;
                    r6 = null;
                    r7 = 0;
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
                            r7 = tLObject;
                        } else {
                            TLObject tLObject2 = imageLocation.webFile;
                            if (tLObject2 != null) {
                                tLObject = tLObject2;
                                document = null;
                                r6 = null;
                                tL_fileLocationToBeDeprecated = null;
                                r9 = tL_fileLocationToBeDeprecated;
                                r7 = tLObject;
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
                    r7 = tLObject;
                }
                FileLoader.getInstance(this.currentAccount).changePriority(i, document, r6, r7, tL_fileLocationToBeDeprecated, r9, null);
            }
        }

        public void setImageAndClear(final Drawable drawable, final String str) {
            final CacheImage cacheImage;
            if (drawable != null) {
                final ArrayList arrayList = new ArrayList(this.imageReceiverArray);
                final ArrayList arrayList2 = new ArrayList(this.imageReceiverGuidsArray);
                cacheImage = this;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$CacheImage$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageLoader.CacheImage.$r8$lambda$f-NaxYhgmE9E8x5Nbwlvc0lpK9A(ImageLoader.CacheImage.this, drawable, arrayList, arrayList2, str);
                    }
                });
            } else {
                cacheImage = this;
            }
            for (int i = 0; i < cacheImage.imageReceiverArray.size(); i++) {
                ImageLoader.this.imageLoadingByTag.remove(cacheImage.imageReceiverArray.get(i).getTag(cacheImage.type));
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

        /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void $r8$lambda$f-NaxYhgmE9E8x5Nbwlvc0lpK9A(CacheImage cacheImage, Drawable drawable, ArrayList arrayList, ArrayList arrayList2, String str) {
            cacheImage.getClass();
            int i = 0;
            if (drawable instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                if (!animatedFileDrawable.isWebmSticker) {
                    boolean z = false;
                    while (i < arrayList.size()) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i);
                        AnimatedFileDrawable makeCopy = i == 0 ? animatedFileDrawable : animatedFileDrawable.makeCopy();
                        if (imageReceiver.setImageBitmapByKey(makeCopy, cacheImage.key, cacheImage.type, false, ((Integer) arrayList2.get(i)).intValue())) {
                            if (makeCopy == animatedFileDrawable) {
                                z = true;
                            }
                        } else if (makeCopy != animatedFileDrawable) {
                            makeCopy.recycle();
                        }
                        i++;
                    }
                    if (!z) {
                        animatedFileDrawable.recycle();
                    }
                    if (str == null) {
                        ImageLoader.this.decrementUseCount(str);
                        return;
                    }
                    return;
                }
            }
            while (i < arrayList.size()) {
                ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(drawable, cacheImage.key, cacheImage.types.get(i).intValue(), false, ((Integer) arrayList2.get(i)).intValue());
                i++;
            }
            if (str == null) {
            }
        }
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return imageLoader;
    }

    public ImageLoader() {
        this.thumbGeneratingQueue.setPriority(1);
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        boolean z = memoryClass >= 192;
        this.canForce8888 = z;
        int min = Math.min(z ? 30 : 15, memoryClass / 7) * 1048576;
        float f = min;
        this.memCache = new LruCache<BitmapDrawable>((int) (0.8f * f)) { // from class: org.telegram.messenger.ImageLoader.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.messenger.LruCache
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.messenger.LruCache
            public void entryRemoved(boolean z2, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
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
        };
        this.smallImagesMemCache = new LruCache<BitmapDrawable>((int) (f * 0.2f)) { // from class: org.telegram.messenger.ImageLoader.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.messenger.LruCache
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.messenger.LruCache
            public void entryRemoved(boolean z2, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
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
        };
        this.wallpaperMemCache = new LruCache<BitmapDrawable>(min / 4) { // from class: org.telegram.messenger.ImageLoader.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.messenger.LruCache
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.lottieMemCache = new LruCache<BitmapDrawable>(10485760) { // from class: org.telegram.messenger.ImageLoader.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.messenger.LruCache
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }

            @Override // org.telegram.messenger.LruCache
            public BitmapDrawable put(String str, BitmapDrawable bitmapDrawable) {
                if (bitmapDrawable instanceof AnimatedFileDrawable) {
                    ImageLoader.this.cachedAnimatedFileDrawables.add((AnimatedFileDrawable) bitmapDrawable);
                }
                return (BitmapDrawable) super.put(str, (String) bitmapDrawable);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.messenger.LruCache
            public void entryRemoved(boolean z2, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                Integer num = (Integer) ImageLoader.this.bitmapUseCounts.get(str);
                boolean z3 = bitmapDrawable instanceof AnimatedFileDrawable;
                if (z3) {
                    ImageLoader.this.cachedAnimatedFileDrawables.remove((AnimatedFileDrawable) bitmapDrawable);
                }
                if (num == null || num.intValue() == 0) {
                    if (z3) {
                        ((AnimatedFileDrawable) bitmapDrawable).recycle();
                    }
                    if (bitmapDrawable instanceof RLottieDrawable) {
                        ((RLottieDrawable) bitmapDrawable).recycle(false);
                    }
                }
            }
        };
        SparseArray sparseArray = new SparseArray();
        File cacheDir = AndroidUtilities.getCacheDir();
        if (!cacheDir.isDirectory()) {
            try {
                cacheDir.mkdirs();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        for (int i = 0; i < 4; i++) {
            FileLoader.getInstance(i).setDelegate(new 5(i));
        }
        FileLoader.setMediaDirs(sparseArray);
        6 r0 = new 6();
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
                ApplicationLoader.applicationContext.registerReceiver(r0, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(r0, intentFilter);
            }
        } catch (Throwable unused) {
        }
        checkMediaPaths();
    }

    class 5 implements FileLoader.FileLoaderDelegate {
        final /* synthetic */ int val$currentAccount;

        5(int i) {
            this.val$currentAccount = i;
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, final String str, final long j, final long j2, final boolean z) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j, j2});
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = fileUploadOperation.lastProgressUpdateTime;
            if (j3 == 0 || j3 < elapsedRealtime - 100 || j == j2) {
                fileUploadOperation.lastProgressUpdateTime = elapsedRealtime;
                final int i = this.val$currentAccount;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.fileUploadProgressChanged, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
                    }
                });
            }
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidUploaded(final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.$r8$lambda$csfEcwO88EOnFBX0xFrWhkY1l4U(ImageLoader.5.this, i, str, inputFile, inputEncryptedFile, bArr, bArr2, j);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$csfEcwO88EOnFBX0xFrWhkY1l4U(5 r9, final int i, final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j) {
            r9.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.fileUploaded, str, inputFile, inputEncryptedFile, bArr, bArr2, Long.valueOf(j));
                }
            });
            ImageLoader.this.fileProgresses.remove(str);
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidFailedUpload(final String str, final boolean z) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.$r8$lambda$rci4ZSQLfXRvKEMwvKJDh24w16E(ImageLoader.5.this, i, str, z);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$rci4ZSQLfXRvKEMwvKJDh24w16E(5 r1, final int i, final String str, final boolean z) {
            r1.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.fileUploadFailed, str, Boolean.valueOf(z));
                }
            });
            ImageLoader.this.fileProgresses.remove(str);
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidLoaded(final String str, final File file, final Object obj, final int i) {
            ImageLoader.this.fileProgresses.remove(str);
            final int i2 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.$r8$lambda$sV0DP70arjUV_pwTUE-2fdgGpvg(ImageLoader.5.this, file, str, i2, obj, i);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$sV0DP70arjUV_pwTUE-2fdgGpvg(5 r8, File file, String str, int i, Object obj, int i2) {
            FilePathDatabase.FileMeta fileMetadataFromParent;
            int i3;
            r8.getClass();
            if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (fileMetadataFromParent = FileLoader.getFileMetadataFromParent(i, obj)) != null)) {
                MessageObject messageObject = obj instanceof MessageObject ? (MessageObject) obj : null;
                long j = fileMetadataFromParent.dialogId;
                if (j >= 0) {
                    i3 = 1;
                } else {
                    i3 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i).getChat(Long.valueOf(-j))) ? 4 : 2;
                }
                if (SaveToGallerySettingsHelper.needSave(i3, fileMetadataFromParent, messageObject, i)) {
                    AndroidUtilities.addMediaToGallery(file.toString());
                }
            }
            NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.fileLoaded, str, file);
            ImageLoader.this.fileDidLoaded(str, file, i2);
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidFailedLoad(final String str, final int i) {
            ImageLoader.this.fileProgresses.remove(str);
            final int i2 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.$r8$lambda$8CXulQQqRSSZYJGBenhhshNqVwk(ImageLoader.5.this, str, i, i2);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$8CXulQQqRSSZYJGBenhhshNqVwk(5 r2, String str, int i, int i2) {
            ImageLoader.this.fileDidFailedLoad(str, i);
            NotificationCenter.getInstance(i2).postNotificationName(NotificationCenter.fileLoadFailed, str, Integer.valueOf(i));
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileLoadProgressChanged(final FileLoadOperation fileLoadOperation, final String str, final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j, j2});
            if (!ImageLoader.this.imageLoadingByUrlPframe.isEmpty() && fileLoadOperation.checkPrefixPreloadFinished()) {
                ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageLoader.5.$r8$lambda$KUpvvHgzJUGuwCK0tm-GAMdncUY(ImageLoader.5.this, str, fileLoadOperation);
                    }
                });
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = fileLoadOperation.lastProgressUpdateTime;
            if (j3 == 0 || j3 < elapsedRealtime - 500 || j == 0) {
                fileLoadOperation.lastProgressUpdateTime = elapsedRealtime;
                final int i = this.val$currentAccount;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.fileLoadProgressChanged, str, Long.valueOf(j), Long.valueOf(j2));
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$KUpvvHgzJUGuwCK0tm-GAMdncUY(5 r11, String str, FileLoadOperation fileLoadOperation) {
            CacheImage cacheImage = (CacheImage) ImageLoader.this.imageLoadingByUrlPframe.remove(str);
            if (cacheImage == null) {
                return;
            }
            ImageLoader.this.imageLoadingByUrl.remove(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cacheImage.imageReceiverArray.size(); i++) {
                String str2 = cacheImage.keys.get(i);
                String str3 = cacheImage.filters.get(i);
                int intValue = cacheImage.types.get(i).intValue();
                ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i);
                int intValue2 = cacheImage.imageReceiverGuidsArray.get(i).intValue();
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
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i2);
                if (cacheOutTask.cacheImage.type == 1) {
                    ImageLoader.this.cacheThumbOutQueue.postRunnable(cacheOutTask);
                } else {
                    ImageLoader.this.cacheOutQueue.postRunnable(cacheOutTask, cacheOutTask.cacheImage.priority);
                }
            }
        }
    }

    class 6 extends BroadcastReceiver {
        6() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("file system changed");
            }
            Runnable runnable = new Runnable() { // from class: org.telegram.messenger.ImageLoader$6$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.this.checkMediaPaths();
                }
            };
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AndroidUtilities.runOnUIThread(runnable, 1000L);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int sizeOfBitmapDrawable(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof AnimatedFileDrawable) {
            return ((AnimatedFileDrawable) bitmapDrawable).estimateSizeInCache();
        }
        if (bitmapDrawable instanceof RLottieDrawable) {
            return ((RLottieDrawable) bitmapDrawable).estimateSizeInCache();
        }
        return bitmapDrawable.getBitmap().getByteCount();
    }

    public void checkMediaPaths() {
        checkMediaPaths(null);
    }

    public void checkMediaPaths(final Runnable runnable) {
        this.cacheOutQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$0ekSInXqq5_MgGXjVGdMCKKOjyM(ImageLoader.this, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$0ekSInXqq5_MgGXjVGdMCKKOjyM(ImageLoader imageLoader, final Runnable runnable) {
        final SparseArray<File> createMediaPaths = imageLoader.createMediaPaths();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$bac-e6vELOUCoq4DLR0nHnQHBEk(createMediaPaths, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$bac-e6vELOUCoq4DLR0nHnQHBEk(SparseArray sparseArray, Runnable runnable) {
        FileLoader.setMediaDirs(sparseArray);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addTestWebFile(String str, WebFile webFile) {
        if (str == null || webFile == null) {
            return;
        }
        this.testWebFile.put(str, webFile);
    }

    public void removeTestWebFile(String str) {
        if (str == null) {
            return;
        }
        this.testWebFile.remove(str);
    }

    private static void moveDirectory(File file, final File file2) {
        java.nio.file.Path path;
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    path = file.toPath();
                    convert = Stream.VivifiedWrapper.convert(Files.list(path));
                    try {
                        convert.forEach(new Consumer() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda11
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void s(Object obj) {
                                ImageLoader.$r8$lambda$gOJ-HwLnGci070vSdd2ZIzBwZVo(file2, (java.nio.file.Path) obj);
                            }

                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$-CC.$default$andThen(this, consumer);
                            }
                        });
                        convert.close();
                    } finally {
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$gOJ-HwLnGci070vSdd2ZIzBwZVo(File file, java.nio.file.Path path) {
        java.nio.file.Path fileName;
        String path2;
        boolean isDirectory;
        java.nio.file.Path path3;
        File file2;
        fileName = path.getFileName();
        path2 = fileName.toString();
        File file3 = new File(file, path2);
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            file2 = path.toFile();
            moveDirectory(file2, file3);
            return;
        }
        try {
            path3 = file3.toPath();
            Files.move(path, path3, new CopyOption[0]);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x016a, code lost:
    
        if (r2.canWrite() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0164, code lost:
    
        if (r2.mkdirs() != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019f A[Catch: Exception -> 0x00af, TryCatch #1 {Exception -> 0x00af, blocks: (B:8:0x0054, B:10:0x0060, B:12:0x006e, B:15:0x0076, B:17:0x007d, B:19:0x00ac, B:23:0x00b2, B:25:0x00be, B:28:0x00c7, B:30:0x00ca, B:34:0x00eb, B:35:0x00cf, B:38:0x00ee, B:181:0x012f, B:47:0x0192, B:49:0x019f, B:51:0x01aa, B:53:0x01b2, B:55:0x01ba, B:58:0x01c6, B:60:0x01d1, B:64:0x01d4, B:151:0x0350, B:153:0x030e, B:155:0x02cd, B:157:0x028c, B:159:0x024b, B:68:0x0355, B:89:0x03c0, B:91:0x038c, B:92:0x03ce, B:161:0x0217, B:184:0x012c, B:41:0x013e, B:43:0x0146, B:46:0x018b, B:162:0x0153, B:164:0x0159, B:167:0x0166, B:169:0x016c, B:170:0x0160, B:191:0x03c4, B:193:0x03c8, B:142:0x0311, B:144:0x0323, B:146:0x032a, B:148:0x0339, B:133:0x02d0, B:135:0x02e2, B:137:0x02e9, B:139:0x02f8, B:124:0x028f, B:126:0x02a1, B:128:0x02a8, B:130:0x02b7, B:71:0x035b, B:73:0x0369, B:75:0x036f, B:77:0x0378, B:115:0x024e, B:117:0x0260, B:119:0x0267, B:121:0x0276, B:106:0x021a, B:108:0x022a, B:110:0x0230, B:112:0x0237, B:97:0x01e6, B:99:0x01f6, B:101:0x01fc, B:103:0x0203, B:80:0x038f, B:82:0x039d, B:84:0x03a3, B:86:0x03ac), top: B:7:0x0054, inners: #0, #2, #3, #4, #5, #6, #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0378 A[Catch: Exception -> 0x038b, TRY_LEAVE, TryCatch #4 {Exception -> 0x038b, blocks: (B:71:0x035b, B:73:0x0369, B:75:0x036f, B:77:0x0378), top: B:70:0x035b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ac A[Catch: Exception -> 0x03bf, TRY_LEAVE, TryCatch #10 {Exception -> 0x03bf, blocks: (B:80:0x038f, B:82:0x039d, B:84:0x03a3, B:86:0x03ac), top: B:79:0x038f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("cache path = " + cacheDir);
        }
        FileLog.d("selected SD card = " + SharedConfig.storageCacheDir);
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file4 = null;
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                    if (rootDirs != null) {
                        int size = rootDirs.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            File file5 = rootDirs.get(i);
                            FileLog.d("root dir " + i + " " + file5);
                            if (file5.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                externalStorageDirectory = file5;
                                break;
                            }
                            i++;
                        }
                    }
                    if (!externalStorageDirectory.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && (externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null)) != null) {
                        for (int i2 = 0; i2 < externalFilesDirs.length; i2++) {
                            if (externalFilesDirs[i2] != null) {
                                FileLog.d("dirsDebug " + i2 + " " + externalFilesDirs[i2]);
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
                                try {
                                    file.mkdirs();
                                } catch (Exception e2) {
                                    e = e2;
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
                                        } catch (Exception e3) {
                                            FileLog.e(e3);
                                        }
                                        try {
                                            file2 = new File(file4, "Telegram Video");
                                            file2.mkdir();
                                            if (file2.isDirectory()) {
                                                sparseArray.put(101, file2);
                                                if (BuildVars.LOGS_ENABLED) {
                                                }
                                            }
                                        } catch (Exception e4) {
                                            FileLog.e(e4);
                                        }
                                    }
                                    SharedConfig.checkSaveToGalleryFiles();
                                    return sparseArray;
                                }
                            } catch (Exception e5) {
                                file = publicStorageDir;
                                e = e5;
                            }
                        } else {
                            file = null;
                        }
                    } catch (Exception e6) {
                        e = e6;
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
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        File file6 = dataDirs.get(i3);
                        if (file6 != null && !TextUtils.isEmpty(SharedConfig.storageCacheDir) && file6.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                            File file7 = new File(file6, "Telegram");
                            this.telegramPath = file7;
                            file7.mkdirs();
                            break;
                        }
                        i3++;
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                    } catch (Exception e8) {
                        FileLog.e(e8);
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
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
                    } catch (Exception e11) {
                        FileLog.e(e11);
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
                    } catch (Exception e12) {
                        FileLog.e(e12);
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
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        return sparseArray;
    }

    private File getPublicStorageDir() {
        File file = ApplicationLoader.applicationContext.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            for (int i = 0; i < ApplicationLoader.applicationContext.getExternalMediaDirs().length; i++) {
                File file2 = ApplicationLoader.applicationContext.getExternalMediaDirs()[i];
                if (file2 != null && file2.getPath().startsWith(SharedConfig.storageCacheDir)) {
                    file = ApplicationLoader.applicationContext.getExternalMediaDirs()[i];
                }
            }
        }
        return file;
    }

    private boolean canMoveFiles(File file, File file2, int i) {
        RandomAccessFile randomAccessFile;
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    if (i != 3 && i != 5 && i != 6) {
                        if (i == 1) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else if (i == 2) {
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
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            boolean renameTo = file3.renameTo(file4);
            file3.delete();
            file4.delete();
            return renameTo;
        } catch (Exception e2) {
            e = e2;
            randomAccessFile2 = randomAccessFile;
            FileLog.e(e);
            if (randomAccessFile2 == null) {
                return false;
            }
            try {
                randomAccessFile2.close();
                return false;
            } catch (Exception e3) {
                FileLog.e(e3);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
            throw th;
        }
    }

    public Float getFileProgress(String str) {
        long[] jArr;
        if (str == null || (jArr = this.fileProgresses.get(str)) == null) {
            return null;
        }
        long j = jArr[1];
        if (j == 0) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Math.min(1.0f, jArr[0] / j));
    }

    public long[] getFileProgressSizes(String str) {
        if (str == null) {
            return null;
        }
        return this.fileProgresses.get(str);
    }

    public String getReplacedKey(String str) {
        if (str == null) {
            return null;
        }
        return this.replacedBitmaps.get(str);
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

    public void incrementUseCount(String str) {
        Integer num = this.bitmapUseCounts.get(str);
        if (num == null) {
            this.bitmapUseCounts.put(str, 1);
        } else {
            this.bitmapUseCounts.put(str, Integer.valueOf(num.intValue() + 1));
        }
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

    public void removeImage(String str) {
        this.bitmapUseCounts.remove(str);
        this.memCache.remove(str);
        this.smallImagesMemCache.remove(str);
    }

    public boolean isInMemCache(String str, boolean z) {
        return z ? getFromLottieCache(str) != null : getFromMemCache(str) != null;
    }

    public void clearMemory() {
        this.smallImagesMemCache.evictAll();
        this.memCache.evictAll();
        this.lottieMemCache.evictAll();
    }

    private void removeFromWaitingForThumb(int i, ImageReceiver imageReceiver) {
        String str = this.waitingForQualityThumbByTag.get(i);
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
            this.waitingForQualityThumbByTag.remove(i);
        }
    }

    public void changeFileLoadingPriorityForImageReceiver(final ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        final int fileLoadingPriority = imageReceiver.getFileLoadingPriority();
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$PgQ51Q40ljfywGW_jpPh3y2a0OQ(ImageLoader.this, imageReceiver, fileLoadingPriority);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$PgQ51Q40ljfywGW_jpPh3y2a0OQ(ImageLoader imageLoader, ImageReceiver imageReceiver, int i) {
        CacheImage cacheImage;
        imageLoader.getClass();
        int i2 = 0;
        while (true) {
            int i3 = 3;
            if (i2 >= 3) {
                return;
            }
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 == 1) {
                i3 = 0;
            }
            int tag = imageReceiver.getTag(i3);
            if (tag != 0 && (cacheImage = imageLoader.imageLoadingByTag.get(tag)) != null) {
                cacheImage.changePriority(i);
            }
            i2++;
        }
    }

    public void cancelLoadingForImageReceiver(final ImageReceiver imageReceiver, final boolean z) {
        if (imageReceiver == null) {
            return;
        }
        WebInstantView.cancelLoadPhoto(imageReceiver);
        ArrayList<Runnable> loadingOperations = imageReceiver.getLoadingOperations();
        if (!loadingOperations.isEmpty()) {
            for (int i = 0; i < loadingOperations.size(); i++) {
                this.imageLoadQueue.cancelRunnable(loadingOperations.get(i));
            }
            loadingOperations.clear();
        }
        imageReceiver.addLoadingImageRunnable(null);
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$_B2QTqpo6TKEIAPjydojMJUgjXI(ImageLoader.this, z, imageReceiver);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$_B2QTqpo6TKEIAPjydojMJUgjXI(ImageLoader imageLoader, boolean z, ImageReceiver imageReceiver) {
        imageLoader.getClass();
        int i = 0;
        while (true) {
            int i2 = 3;
            if (i >= 3) {
                return;
            }
            if (i > 0 && !z) {
                return;
            }
            if (i == 0) {
                i2 = 1;
            } else if (i == 1) {
                i2 = 0;
            }
            int tag = imageReceiver.getTag(i2);
            if (tag != 0) {
                if (i == 0) {
                    imageLoader.removeFromWaitingForThumb(tag, imageReceiver);
                }
                CacheImage cacheImage = imageLoader.imageLoadingByTag.get(tag);
                if (cacheImage != null) {
                    cacheImage.removeImageReceiver(imageReceiver);
                }
            }
            i++;
        }
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
            str3 = str3 + "@" + str2;
        }
        return getFromMemCache(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceImageInCacheInternal(String str, String str2, ImageLocation imageLocation) {
        ArrayList<String> filterKeys;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                filterKeys = this.memCache.getFilterKeys(str);
            } else {
                filterKeys = this.smallImagesMemCache.getFilterKeys(str);
            }
            if (filterKeys != null) {
                for (int i2 = 0; i2 < filterKeys.size(); i2++) {
                    String str3 = filterKeys.get(i2);
                    String str4 = str + "@" + str3;
                    String str5 = str2 + "@" + str3;
                    performReplace(str4, str5);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didReplacedPhotoInMemCache, str4, str5, imageLocation);
                }
            } else {
                performReplace(str, str2);
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didReplacedPhotoInMemCache, str, str2, imageLocation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cutFilter(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public void replaceImageInCache(final String str, final String str2, final ImageLocation imageLocation, boolean z) {
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.this.replaceImageInCacheInternal(str, str2, imageLocation);
                }
            });
        } else {
            replaceImageInCacheInternal(str, str2, imageLocation);
        }
    }

    public void putImageToCache(BitmapDrawable bitmapDrawable, String str, boolean z) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z) {
            this.smallImagesMemCache.put(str, bitmapDrawable);
        } else {
            this.memCache.put(str, bitmapDrawable);
        }
    }

    private void generateThumb(int i, File file, ThumbGenerateInfo thumbGenerateInfo) {
        if ((i != 0 && i != 2 && i != 3) || file == null || thumbGenerateInfo == null) {
            return;
        }
        if (this.thumbGenerateTasks.get(FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)) == null) {
            this.thumbGeneratingQueue.postRunnable(new ThumbGenerateTask(i, file, thumbGenerateInfo));
        }
    }

    public void cancelForceLoadingForImageReceiver(ImageReceiver imageReceiver) {
        final String imageKey;
        if (imageReceiver == null || (imageKey = imageReceiver.getImageKey()) == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.this.forceLoadingImages.remove(imageKey);
            }
        });
    }

    private void createLoadOperationForImageReceiver(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ImageLocation imageLocation, final String str4, final long j, final int i, final int i2, final int i3, final int i4) {
        if (imageReceiver == null || str2 == null || str == null || imageLocation == null) {
            return;
        }
        int tag = imageReceiver.getTag(i2);
        if (tag == 0) {
            tag = this.lastImageNum;
            imageReceiver.setTag(tag, i2);
            int i5 = this.lastImageNum + 1;
            this.lastImageNum = i5;
            if (i5 == Integer.MAX_VALUE) {
                this.lastImageNum = 0;
            }
        }
        final int i6 = tag;
        final boolean isNeedsQualityThumb = imageReceiver.isNeedsQualityThumb();
        final Object parentObject = imageReceiver.getParentObject();
        final TLRPC.Document qualityThumbDocument = imageReceiver.getQualityThumbDocument();
        final boolean isShouldGenerateQualityThumb = imageReceiver.isShouldGenerateQualityThumb();
        final int currentAccount = imageReceiver.getCurrentAccount();
        final boolean z = i2 == 0 && imageReceiver.isCurrentKeyQuality();
        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$exq5x6EbMxZ4mWt3zMwYaKaQoh4(ImageLoader.this, i3, str2, str, i6, imageReceiver, i4, str4, i2, imageLocation, z, parentObject, currentAccount, qualityThumbDocument, isNeedsQualityThumb, isShouldGenerateQualityThumb, str3, i, j);
            }
        };
        this.imageLoadQueue.postRunnable(runnable, imageReceiver.getFileLoadingPriority() == 0 ? 0L : 1L);
        imageReceiver.addLoadingImageRunnable(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x04cf, code lost:
    
        if (r8.equals(r6) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04dc, code lost:
    
        if (r12.exists() == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x01a5, code lost:
    
        if (r2.exists() == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:286:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$exq5x6EbMxZ4mWt3zMwYaKaQoh4(ImageLoader imageLoader, int i, String str, String str2, int i2, ImageReceiver imageReceiver, int i3, String str3, int i4, ImageLocation imageLocation, boolean z, Object obj, int i5, TLRPC.Document document, boolean z2, boolean z3, String str4, int i6, long j) {
        String str5;
        int i7;
        boolean z4;
        String str6;
        boolean z5;
        int i8;
        String str7;
        File file;
        int i9;
        boolean z6;
        File file2;
        File file3;
        File file4;
        boolean z7;
        int i10;
        String str8;
        int i11;
        long j2;
        int i12;
        boolean z8;
        boolean z9;
        boolean z10;
        String str9;
        String str10;
        File file5;
        long j3;
        String str11;
        String str12;
        String str13;
        boolean z11;
        boolean z12;
        boolean z13;
        CacheImage cacheImage;
        CacheImage cacheImage2;
        boolean z14;
        ImageReceiver imageReceiver2 = imageReceiver;
        TLRPC.Document document2 = document;
        if (i != 2) {
            CacheImage cacheImage3 = imageLoader.imageLoadingByUrl.get(str);
            CacheImage cacheImage4 = imageLoader.imageLoadingByKeys.get(str2);
            CacheImage cacheImage5 = imageLoader.imageLoadingByTag.get(i2);
            if (cacheImage5 != null) {
                if (cacheImage5 == cacheImage4) {
                    cacheImage5.setImageReceiverGuid(imageReceiver2, i3);
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    i7 = 0;
                } else if (cacheImage5 == cacheImage3) {
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    i7 = 0;
                    if (cacheImage4 == null) {
                        cacheImage5.replaceImageReceiver(imageReceiver2, str2, str3, i4, i3);
                    }
                } else {
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    i7 = 0;
                    cacheImage5.removeImageReceiver(imageReceiver2);
                }
                z14 = true;
                if (!z14 && cacheImage2 != null) {
                    cacheImage2.addImageReceiver(imageReceiver2, str2, str3, i4, i3);
                    z14 = true;
                }
                if (!z14 || cacheImage == null) {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    z4 = z14;
                } else {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    cacheImage.addImageReceiver(imageReceiver2, str2, str5, i4, i3);
                    z4 = true;
                }
            } else {
                cacheImage = cacheImage3;
                cacheImage2 = cacheImage4;
                i7 = 0;
            }
            z14 = false;
            if (!z14) {
                cacheImage2.addImageReceiver(imageReceiver2, str2, str3, i4, i3);
                z14 = true;
            }
            if (z14) {
            }
            imageReceiver2 = imageReceiver;
            str5 = str3;
            z4 = z14;
        } else {
            str5 = str3;
            i7 = 0;
            imageLoader.getClass();
            z4 = false;
        }
        if (z4) {
            return;
        }
        String str14 = imageLocation.path;
        if (str14 != null) {
            if (!str14.startsWith("http") && !str14.startsWith("athumb")) {
                if (str14.startsWith("thumb://")) {
                    int indexOf = str14.indexOf(":", 8);
                    if (indexOf >= 0) {
                        file4 = new File(str14.substring(indexOf + 1));
                        i9 = i;
                        str6 = "athumb";
                        z6 = false;
                        z7 = true;
                        i10 = 2;
                    }
                    i9 = i;
                    str6 = "athumb";
                    z6 = false;
                    z7 = true;
                    i10 = 2;
                    file4 = null;
                } else {
                    if (str14.startsWith("vthumb://")) {
                        int indexOf2 = str14.indexOf(":", 9);
                        if (indexOf2 >= 0) {
                            file4 = new File(str14.substring(indexOf2 + 1));
                        }
                        i9 = i;
                        str6 = "athumb";
                        z6 = false;
                        z7 = true;
                        i10 = 2;
                        file4 = null;
                    } else {
                        file4 = new File(str14);
                    }
                    i9 = i;
                    str6 = "athumb";
                    z6 = false;
                    z7 = true;
                    i10 = 2;
                }
            }
            str6 = "athumb";
            i9 = i;
            z6 = false;
            z7 = false;
            i10 = 2;
            file4 = null;
        } else {
            if (i == 0 && z) {
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    TLRPC.Document document3 = messageObject.getDocument();
                    str7 = messageObject.messageOwner.attachPath;
                    str6 = "athumb";
                    document2 = document3;
                    file = FileLoader.getInstance(i5).getPathToMessage(messageObject.messageOwner);
                    i8 = messageObject.getMediaType();
                    z5 = false;
                } else {
                    str6 = "athumb";
                    if (document2 != null) {
                        File pathToAttach = FileLoader.getInstance(i5).getPathToAttach(document2, true);
                        i8 = MessageObject.isVideoDocument(document2) ? 2 : 3;
                        file = pathToAttach;
                        z5 = true;
                        str7 = null;
                    } else {
                        z5 = false;
                        i8 = 0;
                        document2 = null;
                        str7 = null;
                        file = null;
                    }
                }
                if (document2 != null) {
                    if (z2) {
                        file2 = new File(FileLoader.getDirectory(4), "q_" + document2.dc_id + "_" + document2.id + ".jpg");
                        if (file2.exists()) {
                            z6 = true;
                            if (!TextUtils.isEmpty(str7)) {
                                file3 = new File(str7);
                            }
                            file3 = null;
                            if (file3 == null) {
                                file3 = file;
                            }
                            if (file2 != null) {
                                String attachFileName = FileLoader.getAttachFileName(document2);
                                ThumbGenerateInfo thumbGenerateInfo = imageLoader.waitingForQualityThumb.get(attachFileName);
                                if (thumbGenerateInfo == null) {
                                    thumbGenerateInfo = new ThumbGenerateInfo();
                                    thumbGenerateInfo.parentDocument = document2;
                                    thumbGenerateInfo.filter = str5;
                                    thumbGenerateInfo.big = z5;
                                    imageLoader.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                                }
                                if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver2)) {
                                    thumbGenerateInfo.imageReceiverArray.add(imageReceiver2);
                                    thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i3));
                                }
                                imageLoader.waitingForQualityThumbByTag.put(i2, attachFileName);
                                if (file3.exists() && z3) {
                                    imageLoader.generateThumb(i8, file3, thumbGenerateInfo);
                                    return;
                                }
                                return;
                            }
                            i9 = i;
                            file4 = file2;
                            z7 = true;
                            i10 = 2;
                        }
                    }
                    z6 = false;
                    file2 = null;
                    if (!TextUtils.isEmpty(str7)) {
                    }
                    file3 = null;
                    if (file3 == null) {
                    }
                    if (file2 != null) {
                    }
                } else {
                    i9 = i;
                    z6 = false;
                    z7 = true;
                    i10 = 2;
                    file4 = null;
                }
            }
            str6 = "athumb";
            i9 = i;
            z6 = false;
            z7 = false;
            i10 = 2;
            file4 = null;
        }
        if (i9 != i10) {
            boolean isEncrypted = imageLocation.isEncrypted();
            boolean z15 = z7;
            CacheImage cacheImage6 = new CacheImage();
            cacheImage6.priority = imageReceiver2.getFileLoadingPriority() == 0 ? 0 : 1;
            if (!z) {
                if (imageLocation.imageType == i10 || MessageObject.isGifDocument(imageLocation.webFile) || MessageObject.isGifDocument(imageLocation.document) || MessageObject.isRoundVideoDocument(imageLocation.document) || MessageObject.isVideoSticker(imageLocation.document)) {
                    cacheImage6.imageType = i10;
                } else {
                    String str15 = imageLocation.path;
                    if (str15 != null && !str15.startsWith("vthumb") && !str15.startsWith("thumb")) {
                        String httpUrlExtension = getHttpUrlExtension(str15, "jpg");
                        if (httpUrlExtension.equalsIgnoreCase("webm") || httpUrlExtension.equalsIgnoreCase("mp4") || httpUrlExtension.equalsIgnoreCase("gif")) {
                            cacheImage6.imageType = i10;
                        } else if ("tgs".equals(str4)) {
                            cacheImage6.imageType = 1;
                        }
                    }
                }
            }
            if (file4 == null) {
                TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                j2 = 0;
                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                    str8 = str;
                    i11 = i6;
                    boolean z16 = z6;
                    str9 = AUTOPLAY_FILTER;
                    str10 = AUTOPLAY_FILTER_NONLOOP;
                    z6 = z16;
                    file5 = file4;
                } else {
                    SecureDocument secureDocument = imageLocation.secureDocument;
                    if (secureDocument != null) {
                        cacheImage6.secureDocument = secureDocument;
                        boolean z17 = secureDocument.secureFile.dc_id == Integer.MIN_VALUE;
                        str8 = str;
                        File file6 = new File(FileLoader.getDirectory(4), str8);
                        str9 = AUTOPLAY_FILTER;
                        z8 = z17;
                        file5 = file6;
                        str10 = AUTOPLAY_FILTER_NONLOOP;
                        j3 = 0;
                        i11 = i6;
                    } else {
                        str8 = str;
                        boolean z18 = z6;
                        if (AUTOPLAY_FILTER.equals(str5) || AUTOPLAY_FILTER_NONLOOP.equals(str5) || imageLoader.isAnimatedAvatar(str5)) {
                            i11 = i6;
                            str11 = "_";
                        } else {
                            if (i6 == 0) {
                                str11 = "_";
                                if (j > 0 && imageLocation.path == null && !isEncrypted) {
                                    i11 = i6;
                                }
                            }
                            File file7 = new File(FileLoader.getDirectory(4), str8);
                            if (file7.exists()) {
                                i11 = i6;
                                z12 = z15;
                                z13 = true;
                            } else {
                                i11 = i6;
                                if (i11 == 2) {
                                    z12 = z15;
                                    file7 = new File(FileLoader.getDirectory(4), str8 + ".enc");
                                } else {
                                    z12 = z15;
                                }
                                z13 = z18;
                            }
                            TLRPC.Document document4 = imageLocation.document;
                            if (document4 != null) {
                                if (document4 instanceof DocumentObject.ThemeDocument) {
                                    boolean z19 = ((DocumentObject.ThemeDocument) document4).wallpaper == null ? true : z12;
                                    cacheImage6.imageType = 5;
                                    z8 = z19;
                                    str9 = AUTOPLAY_FILTER;
                                    z6 = z13;
                                    file5 = file7;
                                    str10 = AUTOPLAY_FILTER_NONLOOP;
                                    j3 = 0;
                                } else if ("application/x-tgsdice".equals(document4.mime_type)) {
                                    cacheImage6.imageType = 1;
                                    str9 = AUTOPLAY_FILTER;
                                    z6 = z13;
                                    file5 = file7;
                                    str10 = AUTOPLAY_FILTER_NONLOOP;
                                } else if ("application/x-tgsticker".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 1;
                                } else if ("application/x-tgwallpattern".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 3;
                                } else if (FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                    cacheImage6.imageType = 3;
                                }
                            }
                            z8 = z12;
                            str9 = AUTOPLAY_FILTER;
                            z6 = z13;
                            file5 = file7;
                            str10 = AUTOPLAY_FILTER_NONLOOP;
                            j3 = 0;
                        }
                        TLRPC.Document document5 = imageLocation.document;
                        if (document5 != null) {
                            File file8 = document5 instanceof TLRPC.TL_documentEncrypted ? new File(FileLoader.getDirectory(4), str8) : MessageObject.isVideoDocument(document5) ? new File(FileLoader.getDirectory(2), str8) : new File(FileLoader.getDirectory(3), str8);
                            if ((imageLoader.isAnimatedAvatar(str5) || AUTOPLAY_FILTER.equals(str5) || AUTOPLAY_FILTER_NONLOOP.equals(str5)) && !file8.exists()) {
                                File directory = FileLoader.getDirectory(4);
                                str12 = AUTOPLAY_FILTER_NONLOOP;
                                StringBuilder sb = new StringBuilder();
                                str13 = AUTOPLAY_FILTER;
                                sb.append(document5.dc_id);
                                sb.append(str11);
                                sb.append(document5.id);
                                sb.append(".temp");
                                file8 = new File(directory, sb.toString());
                            } else {
                                str13 = AUTOPLAY_FILTER;
                                str12 = AUTOPLAY_FILTER_NONLOOP;
                            }
                            if (document5 instanceof DocumentObject.ThemeDocument) {
                                boolean z20 = ((DocumentObject.ThemeDocument) document5).wallpaper == null ? true : z15;
                                cacheImage6.imageType = 5;
                                z11 = z20;
                            } else if ("application/x-tgsdice".equals(imageLocation.document.mime_type)) {
                                z11 = true;
                                cacheImage6.imageType = 1;
                            } else {
                                if ("application/x-tgsticker".equals(document5.mime_type)) {
                                    cacheImage6.imageType = 1;
                                } else if ("application/x-tgwallpattern".equals(document5.mime_type)) {
                                    cacheImage6.imageType = 3;
                                } else if (FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                    cacheImage6.imageType = 3;
                                }
                                z11 = z15;
                                file5 = file8;
                                j3 = document5.size;
                                z6 = z18;
                                str5 = str3;
                                z8 = z11;
                                str10 = str12;
                                str9 = str13;
                            }
                            file5 = file8;
                            j3 = document5.size;
                            z6 = z18;
                            str5 = str3;
                            z8 = z11;
                            str10 = str12;
                            str9 = str13;
                        } else {
                            String str16 = str11;
                            if (imageLocation.webFile != null) {
                                z6 = z18;
                                str5 = str3;
                                z8 = z15;
                                file5 = new File(FileLoader.getDirectory(3), str8);
                                str10 = AUTOPLAY_FILTER_NONLOOP;
                                str9 = AUTOPLAY_FILTER;
                            } else {
                                str5 = str3;
                                File file9 = i11 == 1 ? new File(FileLoader.getDirectory(4), str8) : new File(FileLoader.getDirectory(i7), str8);
                                if (imageLoader.isAnimatedAvatar(str5)) {
                                    str10 = AUTOPLAY_FILTER_NONLOOP;
                                    str9 = AUTOPLAY_FILTER;
                                } else {
                                    str9 = AUTOPLAY_FILTER;
                                    if (str9.equals(str5)) {
                                        str10 = AUTOPLAY_FILTER_NONLOOP;
                                    } else {
                                        str10 = AUTOPLAY_FILTER_NONLOOP;
                                    }
                                    if (imageLocation.location != null) {
                                    }
                                    z6 = z18;
                                    z8 = z15;
                                    file5 = file9;
                                }
                                file9 = new File(FileLoader.getDirectory(4), imageLocation.location.volume_id + str16 + imageLocation.location.local_id + ".temp");
                                z6 = z18;
                                z8 = z15;
                                file5 = file9;
                            }
                            j3 = 0;
                        }
                    }
                    if (!hasAutoplayFilter(str5) || imageLoader.isAnimatedAvatar(str5)) {
                        cacheImage6.imageType = 2;
                        cacheImage6.size = j3;
                        cacheImage6.isPFrame = imageLoader.isPFrame(str5);
                        if (!str9.equals(str5) || str10.equals(str5) || imageLoader.isAnimatedAvatar(str5)) {
                            i12 = i4;
                            file4 = file5;
                            z8 = true;
                        }
                    }
                    i12 = i4;
                    file4 = file5;
                }
                z8 = true;
                j3 = 0;
                if (!hasAutoplayFilter(str5)) {
                }
                cacheImage6.imageType = 2;
                cacheImage6.size = j3;
                cacheImage6.isPFrame = imageLoader.isPFrame(str5);
                if (!str9.equals(str5)) {
                }
                i12 = i4;
                file4 = file5;
                z8 = true;
            } else {
                str8 = str;
                i11 = i6;
                j2 = 0;
                i12 = i4;
                z8 = z15;
            }
            cacheImage6.type = i12;
            cacheImage6.key = str2;
            cacheImage6.cacheType = i11;
            cacheImage6.filter = str5;
            cacheImage6.imageLocation = imageLocation;
            cacheImage6.ext = str4;
            cacheImage6.currentAccount = i5;
            cacheImage6.parentObject = obj;
            int i13 = imageLocation.imageType;
            if (i13 != 0) {
                cacheImage6.imageType = i13;
            }
            if (i11 == 2) {
                File internalCacheDir = FileLoader.getInternalCacheDir();
                z9 = z6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str8);
                z10 = z8;
                sb2.append(".enc.key");
                cacheImage6.encryptionKeyPath = new File(internalCacheDir, sb2.toString());
            } else {
                z9 = z6;
                z10 = z8;
            }
            int i14 = i11;
            String str17 = str6;
            cacheImage6.addImageReceiver(imageReceiver, str2, str5, i12, i3);
            if (z10 || z9 || file4.exists()) {
                cacheImage6.finalFilePath = file4;
                cacheImage6.imageLocation = imageLocation;
                cacheImage6.cacheTask = imageLoader.new CacheOutTask(cacheImage6);
                imageLoader.imageLoadingByKeys.put(str2, cacheImage6);
                imageLoader.imageLoadingKeys.add(cutFilter(str2));
                if (i != 0) {
                    imageLoader.cacheThumbOutQueue.postRunnable(cacheImage6.cacheTask);
                    return;
                } else {
                    cacheImage6.runningTask = imageLoader.cacheOutQueue.postRunnable(cacheImage6.cacheTask, cacheImage6.priority);
                    return;
                }
            }
            cacheImage6.url = str8;
            imageLoader.imageLoadingByUrl.put(str8, cacheImage6);
            if (cacheImage6.isPFrame) {
                imageLoader.imageLoadingByUrlPframe.put(str8, cacheImage6);
            }
            String str18 = imageLocation.path;
            if (str18 == null) {
                int fileLoadingPriority = i != 0 ? 3 : imageReceiver.getFileLoadingPriority();
                if (imageLocation.location != null) {
                    FileLoader.getInstance(i5).loadFile(imageLocation, obj, str4, fileLoadingPriority, (i14 != 0 || (j > j2 && imageLocation.key == null)) ? i14 : 1);
                } else if (imageLocation.document != null) {
                    FileLoader.getInstance(i5).loadFile(imageLocation.document, obj, fileLoadingPriority, i14);
                } else if (imageLocation.secureDocument != null) {
                    FileLoader.getInstance(i5).loadFile(imageLocation.secureDocument, fileLoadingPriority);
                } else if (imageLocation.webFile != null) {
                    FileLoader.getInstance(i5).loadFile(imageLocation.webFile, fileLoadingPriority, i14);
                }
                if (imageReceiver.isForceLoding()) {
                    imageLoader.forceLoadingImages.put(cacheImage6.key, 0);
                    return;
                }
                return;
            }
            String MD5 = Utilities.MD5(str18);
            cacheImage6.tempFilePath = new File(FileLoader.getDirectory(4), MD5 + "_temp.jpg");
            cacheImage6.finalFilePath = file4;
            if (imageLocation.path.startsWith(str17)) {
                ArtworkLoadTask artworkLoadTask = imageLoader.new ArtworkLoadTask(cacheImage6);
                cacheImage6.artworkTask = artworkLoadTask;
                imageLoader.artworkTasks.add(artworkLoadTask);
                imageLoader.runArtworkTasks(false);
                return;
            }
            HttpImageTask httpImageTask = imageLoader.new HttpImageTask(cacheImage6, j);
            cacheImage6.httpTask = httpImageTask;
            imageLoader.httpTasks.add(httpImageTask);
            imageLoader.runHttpTasks(false);
        }
    }

    public void preloadArtwork(final String str) {
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$Gy3V-PEVspwBVgymvjsNme6gYrU(ImageLoader.this, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Gy3V-PEVspwBVgymvjsNme6gYrU(ImageLoader imageLoader, String str) {
        imageLoader.getClass();
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
        int i = forPath.imageType;
        if (i != 0) {
            cacheImage.imageType = i;
        }
        cacheImage.url = str2;
        imageLoader.imageLoadingByUrl.put(str2, cacheImage);
        String MD5 = Utilities.MD5(forPath.path);
        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), MD5 + "_temp.jpg");
        cacheImage.finalFilePath = file;
        ArtworkLoadTask artworkLoadTask = imageLoader.new ArtworkLoadTask(cacheImage);
        cacheImage.artworkTask = artworkLoadTask;
        imageLoader.artworkTasks.add(artworkLoadTask);
        imageLoader.runArtworkTasks(false);
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver) {
        loadImageForImageReceiver(imageReceiver, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x029d, code lost:
    
        if (r4.local_id < 0) goto L203;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c2 A[EDGE_INSN: B:191:0x03c2->B:192:0x03c2 BREAK  A[LOOP:0: B:102:0x01fe->B:110:0x03b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0446 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x045c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0472 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01b6  */
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
        boolean z;
        boolean z2;
        String imageKey;
        boolean z3;
        String thumbKey;
        ImageReceiver imageReceiver2;
        boolean z4;
        Object parentObject;
        ImageLocation thumbLocation;
        String thumbFilter;
        ImageLocation mediaLocation;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        boolean z5;
        String str2;
        String ext;
        ImageLocation imageLocation3;
        String str3;
        String str4;
        int i;
        ImageLocation imageLocation4;
        ImageLocation imageLocation5;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i2;
        int i3;
        String str14;
        ImageLocation imageLocation6;
        boolean z6;
        int i4;
        boolean z7;
        ImageLocation imageLocation7;
        String str15;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable findInPreloadImageReceivers;
        boolean hasBitmap;
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
            if (drawable instanceof RLottieDrawable) {
                hasBitmap = ((RLottieDrawable) drawable).hasBitmap();
            } else {
                hasBitmap = drawable instanceof AnimatedFileDrawable ? ((AnimatedFileDrawable) drawable).hasBitmap() : true;
            }
            if (hasBitmap && drawable != null) {
                cancelLoadingForImageReceiver(imageReceiver3, true);
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                if (!imageReceiver.isForcePreview()) {
                    return;
                }
                imageReceiver3 = imageReceiver;
                str = mediaKey;
                z = true;
                z2 = false;
                imageKey = imageReceiver3.getImageKey();
                if (!z) {
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
                z3 = z;
                thumbKey = imageReceiver.getThumbKey();
                if (thumbKey != null) {
                }
                imageReceiver2 = imageReceiver;
                z4 = false;
                parentObject = imageReceiver2.getParentObject();
                TLRPC.Document qualityThumbDocument = imageReceiver2.getQualityThumbDocument();
                thumbLocation = imageReceiver2.getThumbLocation();
                thumbFilter = imageReceiver2.getThumbFilter();
                mediaLocation = imageReceiver2.getMediaLocation();
                String mediaFilter = imageReceiver2.getMediaFilter();
                imageLocation = imageReceiver2.getImageLocation();
                String imageFilter = imageReceiver2.getImageFilter();
                if (imageLocation == null) {
                }
                imageLocation2 = imageLocation;
                z5 = false;
                String str16 = null;
                String str17 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                if (mediaLocation == null) {
                }
                ext = imageReceiver2.getExt();
                if (ext == null) {
                }
                if (str17 == null) {
                }
                if (str2 == null) {
                }
                boolean z8 = z4;
                imageLocation3 = mediaLocation;
                boolean z9 = z5;
                str3 = null;
                str4 = null;
                String str18 = null;
                String str19 = null;
                i = 0;
                boolean z10 = false;
                while (true) {
                    imageLocation4 = imageLocation;
                    if (i >= 2) {
                    }
                    i = i3 + 1;
                    thumbFilter = str15;
                    imageLocation = imageLocation4;
                    newGuid = i4;
                    z2 = z6;
                    z3 = z7;
                }
                imageLocation5 = imageLocation2;
                int i5 = newGuid;
                boolean z11 = z2;
                boolean z12 = z3;
                str5 = thumbFilter;
                if (thumbLocation != null) {
                }
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str6 != null) {
                }
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                String str20 = str3;
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                String str21 = str4;
                if (imageLocation5 == null) {
                }
                if (imageLocation3 != null) {
                }
            } else if (drawable != null) {
                imageReceiver3 = imageReceiver;
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                str = mediaKey;
                z = false;
                z2 = true;
                imageKey = imageReceiver3.getImageKey();
                if (!z && imageKey != null) {
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
                        if (!imageReceiver.isForcePreview() && (str == null || z2)) {
                            return;
                        }
                        z3 = true;
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
                                if (z3 && imageReceiver2.isForcePreview()) {
                                    return;
                                }
                                z4 = true;
                                parentObject = imageReceiver2.getParentObject();
                                TLRPC.Document qualityThumbDocument2 = imageReceiver2.getQualityThumbDocument();
                                thumbLocation = imageReceiver2.getThumbLocation();
                                thumbFilter = imageReceiver2.getThumbFilter();
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
                                    z5 = true;
                                    String str162 = null;
                                    String str172 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                                    str2 = (mediaLocation == null && mediaLocation.imageType == 2) ? "mp4" : null;
                                    ext = imageReceiver2.getExt();
                                    if (ext == null) {
                                        ext = "jpg";
                                    }
                                    String str22 = str172 == null ? ext : str172;
                                    if (str2 == null) {
                                        str2 = ext;
                                    }
                                    boolean z82 = z4;
                                    imageLocation3 = mediaLocation;
                                    boolean z92 = z5;
                                    str3 = null;
                                    str4 = null;
                                    String str182 = null;
                                    String str192 = null;
                                    i = 0;
                                    boolean z102 = false;
                                    while (true) {
                                        imageLocation4 = imageLocation;
                                        if (i >= 2) {
                                            break;
                                        }
                                        if (i == 0) {
                                            imageLocation6 = imageLocation2;
                                            i3 = i;
                                            str14 = str22;
                                        } else {
                                            i3 = i;
                                            str14 = str2;
                                            imageLocation6 = imageLocation3;
                                        }
                                        if (imageLocation6 == null) {
                                            i4 = newGuid;
                                            z6 = z2;
                                        } else {
                                            z6 = z2;
                                            i4 = newGuid;
                                            String key = imageLocation6.getKey(parentObject, imageLocation3 != null ? imageLocation3 : imageLocation2, false);
                                            if (key != null) {
                                                z7 = z3;
                                                String key2 = imageLocation6.getKey(parentObject, imageLocation3 != null ? imageLocation3 : imageLocation2, true);
                                                if (imageLocation6.path != null) {
                                                    key2 = key2 + "." + getHttpUrlExtension(imageLocation6.path, "jpg");
                                                    imageLocation7 = imageLocation2;
                                                    str15 = thumbFilter;
                                                } else {
                                                    TLRPC.PhotoSize photoSize = imageLocation6.photoSize;
                                                    imageLocation7 = imageLocation2;
                                                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                        str15 = thumbFilter;
                                                        key2 = key2 + "." + str14;
                                                    } else {
                                                        if (imageLocation6.location != null) {
                                                            key2 = key2 + "." + str14;
                                                            if (imageReceiver.getExt() == null) {
                                                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation6.location;
                                                                if (tL_fileLocationToBeDeprecated.key == null) {
                                                                    str15 = thumbFilter;
                                                                    if (tL_fileLocationToBeDeprecated.volume_id == -2147483648L) {
                                                                    }
                                                                }
                                                            }
                                                            str15 = thumbFilter;
                                                            z102 = true;
                                                        } else {
                                                            str15 = thumbFilter;
                                                            WebFile webFile = imageLocation6.webFile;
                                                            if (webFile != null) {
                                                                key2 = key2 + "." + getHttpUrlExtension(imageLocation6.webFile.url, FileLoader.getMimeTypePart(webFile.mime_type));
                                                            } else if (imageLocation6.secureDocument != null) {
                                                                key2 = key2 + "." + str14;
                                                            } else if (imageLocation6.document != null) {
                                                                if (i3 == 0 && z92) {
                                                                    key = "q_" + key;
                                                                }
                                                                String documentFileName = FileLoader.getDocumentFileName(imageLocation6.document);
                                                                int lastIndexOf = documentFileName.lastIndexOf(46);
                                                                String str23 = "";
                                                                String substring = lastIndexOf == -1 ? "" : documentFileName.substring(lastIndexOf);
                                                                if (substring.length() > 1) {
                                                                    str23 = substring;
                                                                } else if ("video/mp4".equals(imageLocation6.document.mime_type)) {
                                                                    str23 = ".mp4";
                                                                } else if ("video/x-matroska".equals(imageLocation6.document.mime_type)) {
                                                                    str23 = ".mkv";
                                                                }
                                                                key2 = key2 + str23;
                                                                if (MessageObject.isVideoDocument(imageLocation6.document) || MessageObject.isGifDocument(imageLocation6.document) || MessageObject.isRoundVideoDocument(imageLocation6.document) || MessageObject.canPreviewDocument(imageLocation6.document)) {
                                                                    z102 = false;
                                                                }
                                                                z102 = true;
                                                            } else if (parentObject instanceof TLRPC.StickerSet) {
                                                                key2 = key2 + "." + str14;
                                                            }
                                                        }
                                                        i = i3 + 1;
                                                        thumbFilter = str15;
                                                        imageLocation = imageLocation4;
                                                        newGuid = i4;
                                                        z2 = z6;
                                                        z3 = z7;
                                                    }
                                                }
                                                if (i3 == 0) {
                                                    str3 = key;
                                                    str182 = key2;
                                                } else {
                                                    str4 = key;
                                                    str192 = key2;
                                                }
                                                if (imageLocation6 == thumbLocation) {
                                                    if (i3 == 0) {
                                                        str3 = null;
                                                        imageLocation2 = null;
                                                        str182 = null;
                                                        i = i3 + 1;
                                                        thumbFilter = str15;
                                                        imageLocation = imageLocation4;
                                                        newGuid = i4;
                                                        z2 = z6;
                                                        z3 = z7;
                                                    } else {
                                                        str4 = null;
                                                        imageLocation3 = null;
                                                        str192 = null;
                                                    }
                                                }
                                                imageLocation2 = imageLocation7;
                                                i = i3 + 1;
                                                thumbFilter = str15;
                                                imageLocation = imageLocation4;
                                                newGuid = i4;
                                                z2 = z6;
                                                z3 = z7;
                                            }
                                        }
                                        str15 = thumbFilter;
                                        z7 = z3;
                                        i = i3 + 1;
                                        thumbFilter = str15;
                                        imageLocation = imageLocation4;
                                        newGuid = i4;
                                        z2 = z6;
                                        z3 = z7;
                                    }
                                    imageLocation5 = imageLocation2;
                                    int i52 = newGuid;
                                    boolean z112 = z2;
                                    boolean z122 = z3;
                                    str5 = thumbFilter;
                                    if (thumbLocation != null) {
                                        ImageLocation strippedLocation = imageReceiver.getStrippedLocation();
                                        ImageLocation imageLocation9 = strippedLocation == null ? imageLocation3 != null ? imageLocation3 : imageLocation4 : strippedLocation;
                                        String key3 = thumbLocation.getKey(parentObject, imageLocation9, false);
                                        String key4 = thumbLocation.getKey(parentObject, imageLocation9, true);
                                        if (thumbLocation.path != null) {
                                            key4 = key4 + "." + getHttpUrlExtension(thumbLocation.path, "jpg");
                                        } else {
                                            TLRPC.PhotoSize photoSize2 = thumbLocation.photoSize;
                                            if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize)) {
                                                key4 = key4 + "." + ext;
                                            } else if (thumbLocation.location != null) {
                                                key4 = key4 + "." + ext;
                                            }
                                        }
                                        str162 = key4;
                                        str6 = key3;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str4 != null && mediaFilter2 != null) {
                                        str4 = str4 + "@" + mediaFilter2;
                                    }
                                    if (str3 != null && imageFilter2 != null) {
                                        str3 = str3 + "@" + imageFilter2;
                                    }
                                    if (str6 != null && str5 != null) {
                                        str6 = str6 + "@" + str5;
                                    }
                                    if (imageReceiver.getUniqKeyPrefix() != null && str3 != null) {
                                        str3 = imageReceiver.getUniqKeyPrefix() + str3;
                                    }
                                    String str202 = str3;
                                    if (imageReceiver.getUniqKeyPrefix() != null && str4 != null) {
                                        str4 = imageReceiver.getUniqKeyPrefix() + str4;
                                    }
                                    String str212 = str4;
                                    if (imageLocation5 == null) {
                                        str7 = ext;
                                        str8 = str6;
                                        str9 = str5;
                                        str10 = str202;
                                        str11 = str162;
                                        str12 = str22;
                                        str13 = str182;
                                        i2 = i52;
                                    } else {
                                        if (imageLocation5.path != null) {
                                            createLoadOperationForImageReceiver(imageReceiver, str6, str162, ext, thumbLocation, str5, 0L, 1, 1, z82 ? 2 : 1, i52);
                                            createLoadOperationForImageReceiver(imageReceiver, str202, str182, str22, imageLocation5, imageFilter2, imageReceiver.getSize(), 1, 0, 0, i52);
                                            return;
                                        }
                                        imageLocation5 = imageLocation5;
                                        str8 = str6;
                                        str9 = str5;
                                        str10 = str202;
                                        str11 = str162;
                                        str12 = str22;
                                        str13 = str182;
                                        i2 = i52;
                                        str7 = ext;
                                    }
                                    if (imageLocation3 != null) {
                                        int cacheType = imageReceiver.getCacheType();
                                        int i6 = (cacheType == 0 && z102) ? 1 : cacheType;
                                        int i7 = i6 == 0 ? 1 : i6;
                                        if (!z82) {
                                            createLoadOperationForImageReceiver(imageReceiver, str8, str11, str7, thumbLocation, str9, 0L, i7, 1, 1, i2);
                                        }
                                        if (!z122) {
                                            createLoadOperationForImageReceiver(imageReceiver, str10, str13, str12, imageLocation5, imageFilter2, 0L, 1, 0, 0, i2);
                                        }
                                        if (z112) {
                                            return;
                                        }
                                        createLoadOperationForImageReceiver(imageReceiver, str212, str192, str2, imageLocation3, mediaFilter2, imageReceiver.getSize(), i6, 3, 0, i2);
                                        return;
                                    }
                                    int cacheType2 = imageReceiver.getCacheType();
                                    int i8 = (cacheType2 == 0 && z102) ? 1 : cacheType2;
                                    createLoadOperationForImageReceiver(imageReceiver, str8, str11, str7, thumbLocation, str9, 0L, i8 == 0 ? 1 : i8, 1, z82 ? 2 : 1, i2);
                                    createLoadOperationForImageReceiver(imageReceiver, str10, str13, str12, imageLocation5, imageFilter2, imageReceiver.getSize(), i8, 0, 0, i2);
                                    return;
                                }
                                imageLocation2 = imageLocation;
                                z5 = false;
                                String str1622 = null;
                                String str1722 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                                if (mediaLocation == null) {
                                }
                                ext = imageReceiver2.getExt();
                                if (ext == null) {
                                }
                                if (str1722 == null) {
                                }
                                if (str2 == null) {
                                }
                                boolean z822 = z4;
                                imageLocation3 = mediaLocation;
                                boolean z922 = z5;
                                str3 = null;
                                str4 = null;
                                String str1822 = null;
                                String str1922 = null;
                                i = 0;
                                boolean z1022 = false;
                                while (true) {
                                    imageLocation4 = imageLocation;
                                    if (i >= 2) {
                                    }
                                    i = i3 + 1;
                                    thumbFilter = str15;
                                    imageLocation = imageLocation4;
                                    newGuid = i4;
                                    z2 = z6;
                                    z3 = z7;
                                }
                                imageLocation5 = imageLocation2;
                                int i522 = newGuid;
                                boolean z1122 = z2;
                                boolean z1222 = z3;
                                str5 = thumbFilter;
                                if (thumbLocation != null) {
                                }
                                if (str4 != null) {
                                    str4 = str4 + "@" + mediaFilter2;
                                }
                                if (str3 != null) {
                                    str3 = str3 + "@" + imageFilter2;
                                }
                                if (str6 != null) {
                                    str6 = str6 + "@" + str5;
                                }
                                if (imageReceiver.getUniqKeyPrefix() != null) {
                                    str3 = imageReceiver.getUniqKeyPrefix() + str3;
                                }
                                String str2022 = str3;
                                if (imageReceiver.getUniqKeyPrefix() != null) {
                                    str4 = imageReceiver.getUniqKeyPrefix() + str4;
                                }
                                String str2122 = str4;
                                if (imageLocation5 == null) {
                                }
                                if (imageLocation3 != null) {
                                }
                            }
                        }
                        imageReceiver2 = imageReceiver;
                        z4 = false;
                        parentObject = imageReceiver2.getParentObject();
                        TLRPC.Document qualityThumbDocument22 = imageReceiver2.getQualityThumbDocument();
                        thumbLocation = imageReceiver2.getThumbLocation();
                        thumbFilter = imageReceiver2.getThumbFilter();
                        mediaLocation = imageReceiver2.getMediaLocation();
                        String mediaFilter22 = imageReceiver2.getMediaFilter();
                        imageLocation = imageReceiver2.getImageLocation();
                        String imageFilter22 = imageReceiver2.getImageFilter();
                        if (imageLocation == null) {
                            if (!(parentObject instanceof MessageObject)) {
                            }
                            z5 = true;
                            String str16222 = null;
                            String str17222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                            if (mediaLocation == null) {
                            }
                            ext = imageReceiver2.getExt();
                            if (ext == null) {
                            }
                            if (str17222 == null) {
                            }
                            if (str2 == null) {
                            }
                            boolean z8222 = z4;
                            imageLocation3 = mediaLocation;
                            boolean z9222 = z5;
                            str3 = null;
                            str4 = null;
                            String str18222 = null;
                            String str19222 = null;
                            i = 0;
                            boolean z10222 = false;
                            while (true) {
                                imageLocation4 = imageLocation;
                                if (i >= 2) {
                                }
                                i = i3 + 1;
                                thumbFilter = str15;
                                imageLocation = imageLocation4;
                                newGuid = i4;
                                z2 = z6;
                                z3 = z7;
                            }
                            imageLocation5 = imageLocation2;
                            int i5222 = newGuid;
                            boolean z11222 = z2;
                            boolean z12222 = z3;
                            str5 = thumbFilter;
                            if (thumbLocation != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str6 != null) {
                            }
                            if (imageReceiver.getUniqKeyPrefix() != null) {
                            }
                            String str20222 = str3;
                            if (imageReceiver.getUniqKeyPrefix() != null) {
                            }
                            String str21222 = str4;
                            if (imageLocation5 == null) {
                            }
                            if (imageLocation3 != null) {
                            }
                        }
                        imageLocation2 = imageLocation;
                        z5 = false;
                        String str162222 = null;
                        String str172222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                        if (mediaLocation == null) {
                        }
                        ext = imageReceiver2.getExt();
                        if (ext == null) {
                        }
                        if (str172222 == null) {
                        }
                        if (str2 == null) {
                        }
                        boolean z82222 = z4;
                        imageLocation3 = mediaLocation;
                        boolean z92222 = z5;
                        str3 = null;
                        str4 = null;
                        String str182222 = null;
                        String str192222 = null;
                        i = 0;
                        boolean z102222 = false;
                        while (true) {
                            imageLocation4 = imageLocation;
                            if (i >= 2) {
                            }
                            i = i3 + 1;
                            thumbFilter = str15;
                            imageLocation = imageLocation4;
                            newGuid = i4;
                            z2 = z6;
                            z3 = z7;
                        }
                        imageLocation5 = imageLocation2;
                        int i52222 = newGuid;
                        boolean z112222 = z2;
                        boolean z122222 = z3;
                        str5 = thumbFilter;
                        if (thumbLocation != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str3 != null) {
                        }
                        if (str6 != null) {
                        }
                        if (imageReceiver.getUniqKeyPrefix() != null) {
                        }
                        String str202222 = str3;
                        if (imageReceiver.getUniqKeyPrefix() != null) {
                        }
                        String str212222 = str4;
                        if (imageLocation5 == null) {
                        }
                        if (imageLocation3 != null) {
                        }
                    }
                }
                z3 = z;
                thumbKey = imageReceiver.getThumbKey();
                if (thumbKey != null) {
                }
                imageReceiver2 = imageReceiver;
                z4 = false;
                parentObject = imageReceiver2.getParentObject();
                TLRPC.Document qualityThumbDocument222 = imageReceiver2.getQualityThumbDocument();
                thumbLocation = imageReceiver2.getThumbLocation();
                thumbFilter = imageReceiver2.getThumbFilter();
                mediaLocation = imageReceiver2.getMediaLocation();
                String mediaFilter222 = imageReceiver2.getMediaFilter();
                imageLocation = imageReceiver2.getImageLocation();
                String imageFilter222 = imageReceiver2.getImageFilter();
                if (imageLocation == null) {
                }
                imageLocation2 = imageLocation;
                z5 = false;
                String str1622222 = null;
                String str1722222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                if (mediaLocation == null) {
                }
                ext = imageReceiver2.getExt();
                if (ext == null) {
                }
                if (str1722222 == null) {
                }
                if (str2 == null) {
                }
                boolean z822222 = z4;
                imageLocation3 = mediaLocation;
                boolean z922222 = z5;
                str3 = null;
                str4 = null;
                String str1822222 = null;
                String str1922222 = null;
                i = 0;
                boolean z1022222 = false;
                while (true) {
                    imageLocation4 = imageLocation;
                    if (i >= 2) {
                    }
                    i = i3 + 1;
                    thumbFilter = str15;
                    imageLocation = imageLocation4;
                    newGuid = i4;
                    z2 = z6;
                    z3 = z7;
                }
                imageLocation5 = imageLocation2;
                int i522222 = newGuid;
                boolean z1122222 = z2;
                boolean z1222222 = z3;
                str5 = thumbFilter;
                if (thumbLocation != null) {
                }
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str6 != null) {
                }
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                String str2022222 = str3;
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                String str2122222 = str4;
                if (imageLocation5 == null) {
                }
                if (imageLocation3 != null) {
                }
            } else {
                imageReceiver3 = imageReceiver;
            }
        }
        str = mediaKey;
        z = false;
        z2 = false;
        imageKey = imageReceiver3.getImageKey();
        if (!z) {
        }
        z3 = z;
        thumbKey = imageReceiver.getThumbKey();
        if (thumbKey != null) {
        }
        imageReceiver2 = imageReceiver;
        z4 = false;
        parentObject = imageReceiver2.getParentObject();
        TLRPC.Document qualityThumbDocument2222 = imageReceiver2.getQualityThumbDocument();
        thumbLocation = imageReceiver2.getThumbLocation();
        thumbFilter = imageReceiver2.getThumbFilter();
        mediaLocation = imageReceiver2.getMediaLocation();
        String mediaFilter2222 = imageReceiver2.getMediaFilter();
        imageLocation = imageReceiver2.getImageLocation();
        String imageFilter2222 = imageReceiver2.getImageFilter();
        if (imageLocation == null) {
        }
        imageLocation2 = imageLocation;
        z5 = false;
        String str16222222 = null;
        String str17222222 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
        if (mediaLocation == null) {
        }
        ext = imageReceiver2.getExt();
        if (ext == null) {
        }
        if (str17222222 == null) {
        }
        if (str2 == null) {
        }
        boolean z8222222 = z4;
        imageLocation3 = mediaLocation;
        boolean z9222222 = z5;
        str3 = null;
        str4 = null;
        String str18222222 = null;
        String str19222222 = null;
        i = 0;
        boolean z10222222 = false;
        while (true) {
            imageLocation4 = imageLocation;
            if (i >= 2) {
            }
            i = i3 + 1;
            thumbFilter = str15;
            imageLocation = imageLocation4;
            newGuid = i4;
            z2 = z6;
            z3 = z7;
        }
        imageLocation5 = imageLocation2;
        int i5222222 = newGuid;
        boolean z11222222 = z2;
        boolean z12222222 = z3;
        str5 = thumbFilter;
        if (thumbLocation != null) {
        }
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        if (str6 != null) {
        }
        if (imageReceiver.getUniqKeyPrefix() != null) {
        }
        String str20222222 = str3;
        if (imageReceiver.getUniqKeyPrefix() != null) {
        }
        String str21222222 = str4;
        if (imageLocation5 == null) {
        }
        if (imageLocation3 != null) {
        }
    }

    private Drawable findInPreloadImageReceivers(String str, List<ImageReceiver> list) {
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            ImageReceiver imageReceiver = list.get(i);
            if (str.equals(imageReceiver.getImageKey())) {
                return imageReceiver.getImageDrawable();
            }
            if (str.equals(imageReceiver.getMediaKey())) {
                return imageReceiver.getMediaDrawable();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BitmapDrawable getFromLottieCache(String str) {
        BitmapDrawable bitmapDrawable = this.lottieMemCache.get(str);
        if (!(bitmapDrawable instanceof AnimatedFileDrawable) || !((AnimatedFileDrawable) bitmapDrawable).isRecycled()) {
            return bitmapDrawable;
        }
        this.lottieMemCache.remove(str);
        return null;
    }

    private boolean useLottieMemCache(ImageLocation imageLocation, String str) {
        return (str.endsWith("_firstframe") || str.endsWith("_lastframe") || ((imageLocation == null || (!MessageObject.isAnimatedStickerDocument(imageLocation.document, true) && imageLocation.imageType != 1 && !MessageObject.isVideoSticker(imageLocation.document))) && !isAnimatedAvatar(str))) ? false : true;
    }

    public boolean hasLottieMemCache(String str) {
        LruCache<BitmapDrawable> lruCache = this.lottieMemCache;
        return lruCache != null && lruCache.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void httpFileLoadError(final String str) {
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$UpwkxCBSg8aox_B2VnT9NMZZvY0(ImageLoader.this, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$UpwkxCBSg8aox_B2VnT9NMZZvY0(ImageLoader imageLoader, String str) {
        CacheImage cacheImage = imageLoader.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        HttpImageTask httpImageTask = cacheImage.httpTask;
        if (httpImageTask != null) {
            HttpImageTask httpImageTask2 = imageLoader.new HttpImageTask(httpImageTask.cacheImage, httpImageTask.imageSize);
            cacheImage.httpTask = httpImageTask2;
            imageLoader.httpTasks.add(httpImageTask2);
        }
        imageLoader.runHttpTasks(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void artworkLoadError(final String str) {
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$SFjB1GWlHBOSOyV_TbWJcOylZ4I(ImageLoader.this, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$SFjB1GWlHBOSOyV_TbWJcOylZ4I(ImageLoader imageLoader, String str) {
        CacheImage cacheImage = imageLoader.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        ArtworkLoadTask artworkLoadTask = cacheImage.artworkTask;
        if (artworkLoadTask != null) {
            ArtworkLoadTask artworkLoadTask2 = imageLoader.new ArtworkLoadTask(artworkLoadTask.cacheImage);
            cacheImage.artworkTask = artworkLoadTask2;
            imageLoader.artworkTasks.add(artworkLoadTask2);
        }
        imageLoader.runArtworkTasks(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fileDidLoaded(final String str, final File file, final int i) {
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$6KbaBVU4UF7iNklcT1KIQzox10I(ImageLoader.this, str, i, file);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$6KbaBVU4UF7iNklcT1KIQzox10I(ImageLoader imageLoader, String str, int i, File file) {
        ThumbGenerateInfo thumbGenerateInfo = imageLoader.waitingForQualityThumb.get(str);
        if (thumbGenerateInfo != null && thumbGenerateInfo.parentDocument != null) {
            imageLoader.generateThumb(i, file, thumbGenerateInfo);
            imageLoader.waitingForQualityThumb.remove(str);
        }
        CacheImage cacheImage = imageLoader.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        imageLoader.imageLoadingByUrl.remove(str);
        imageLoader.imageLoadingByUrlPframe.remove(str);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < cacheImage.imageReceiverArray.size(); i2++) {
            String str2 = cacheImage.keys.get(i2);
            String str3 = cacheImage.filters.get(i2);
            int intValue = cacheImage.types.get(i2).intValue();
            ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i2);
            int intValue2 = cacheImage.imageReceiverGuidsArray.get(i2).intValue();
            CacheImage cacheImage2 = imageLoader.imageLoadingByKeys.get(str2);
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
                cacheImage2.cacheTask = imageLoader.new CacheOutTask(cacheImage2);
                cacheImage2.filter = str3;
                cacheImage2.imageType = cacheImage.imageType;
                imageLoader.imageLoadingByKeys.put(str2, cacheImage2);
                imageLoader.imageLoadingKeys.add(cutFilter(str2));
                arrayList.add(cacheImage2.cacheTask);
            }
            cacheImage2.addImageReceiver(imageReceiver, str2, str3, intValue, intValue2);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i3);
            if (cacheOutTask.cacheImage.type != 1) {
                imageLoader.cacheOutQueue.postRunnable(cacheOutTask, cacheOutTask.cacheImage.priority);
            } else {
                imageLoader.cacheThumbOutQueue.postRunnable(cacheOutTask);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fileDidFailedLoad(final String str, int i) {
        if (i == 1) {
            return;
        }
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$H8YvX7z4a2584Rv5Npw8UtU7Gzs(ImageLoader.this, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$H8YvX7z4a2584Rv5Npw8UtU7Gzs(ImageLoader imageLoader, String str) {
        CacheImage cacheImage = imageLoader.imageLoadingByUrl.get(str);
        if (cacheImage != null) {
            cacheImage.setImageAndClear(null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runHttpTasks(boolean z) {
        if (z) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void runArtworkTasks(boolean z) {
        if (z) {
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

    public boolean isLoadingHttpFile(String str) {
        return this.httpFileLoadTasksByKeys.containsKey(str);
    }

    public static String getHttpFileName(String str) {
        return Utilities.MD5(str);
    }

    public static File getHttpFilePath(String str, String str2) {
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        return new File(FileLoader.getDirectory(4), Utilities.MD5(str) + "." + httpUrlExtension);
    }

    public void loadHttpFile(String str, String str2, int i) {
        if (str == null || str.length() == 0 || this.httpFileLoadTasksByKeys.containsKey(str)) {
            return;
        }
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str) + "_temp." + httpUrlExtension);
        file.delete();
        HttpFileTask httpFileTask = new HttpFileTask(str, file, httpUrlExtension, i);
        this.httpFileLoadTasks.add(httpFileTask);
        this.httpFileLoadTasksByKeys.put(str, httpFileTask);
        runHttpFileLoadTasks(null, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void runHttpFileLoadTasks(final HttpFileTask httpFileTask, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.$r8$lambda$jbF_e2vz7huP8fXzonnyJdZDdLA(ImageLoader.this, httpFileTask, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$jbF_e2vz7huP8fXzonnyJdZDdLA(ImageLoader imageLoader, HttpFileTask httpFileTask, int i) {
        final ImageLoader imageLoader2;
        imageLoader.getClass();
        if (httpFileTask != null) {
            imageLoader.currentHttpFileLoadTasksCount--;
        }
        if (httpFileTask == null) {
            imageLoader2 = imageLoader;
        } else if (i != 1) {
            imageLoader2 = imageLoader;
            if (i == 2) {
                imageLoader2.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                File file = new File(FileLoader.getDirectory(4), Utilities.MD5(httpFileTask.url) + "." + httpFileTask.ext);
                if (!httpFileTask.tempFile.renameTo(file)) {
                    file = httpFileTask.tempFile;
                }
                NotificationCenter.getInstance(httpFileTask.currentAccount).postNotificationName(NotificationCenter.httpFileDidLoad, httpFileTask.url, file.toString());
            }
        } else if (!httpFileTask.canRetry) {
            imageLoader2 = imageLoader;
            imageLoader2.httpFileLoadTasksByKeys.remove(httpFileTask.url);
            NotificationCenter.getInstance(httpFileTask.currentAccount).postNotificationName(NotificationCenter.httpFileDidFailedLoad, httpFileTask.url, 0);
        } else {
            imageLoader2 = imageLoader;
            final HttpFileTask httpFileTask2 = imageLoader2.new HttpFileTask(httpFileTask.url, httpFileTask.tempFile, httpFileTask.ext, httpFileTask.currentAccount);
            Runnable runnable = new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.$r8$lambda$gkvLH-mlzskG-JR6MmYBB4e_r54(ImageLoader.this, httpFileTask2);
                }
            };
            imageLoader2.retryHttpsTasks.put(httpFileTask.url, runnable);
            AndroidUtilities.runOnUIThread(runnable, 1000L);
        }
        while (imageLoader2.currentHttpFileLoadTasksCount < 2 && !imageLoader2.httpFileLoadTasks.isEmpty()) {
            imageLoader2.httpFileLoadTasks.poll().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            imageLoader2.currentHttpFileLoadTasksCount++;
        }
    }

    public static /* synthetic */ void $r8$lambda$gkvLH-mlzskG-JR6MmYBB4e_r54(ImageLoader imageLoader, HttpFileTask httpFileTask) {
        imageLoader.httpFileLoadTasks.add(httpFileTask);
        imageLoader.runHttpFileLoadTasks(null, 0);
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
                } catch (Throwable th) {
                    FileLog.e(th);
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
            } catch (Throwable th2) {
                FileLog.e(th2);
                return false;
            }
        }
        float f = options.outWidth;
        float f2 = options.outHeight;
        return f / f2 > 10.0f || f2 / f > 10.0f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(27:6|(1:8)(2:154|(2:158|159))|9|10|(1:12)(1:(19:147|148|149|14|(1:16)(1:145)|17|(1:19)|20|(3:22|(2:23|(1:25)(1:26))|27)|28|29|(4:33|34|35|36)|44|(10:125|127|128|(5:130|(1:132)(1:138)|133|(1:135)(1:137)|136)|139|(1:141)|49|(2:(1:52)|53)|54|(5:92|93|(3:97|98|(2:100|102))|95|96)(1:(7:57|58|(3:69|70|(5:72|73|61|62|64))|60|61|62|64)(1:91)))|48|49|(0)|54|(0)(0)))|13|14|(0)(0)|17|(0)|20|(0)|28|29|(5:31|33|34|35|36)|44|(1:46)|125|127|128|(0)|139|(0)|49|(0)|54|(0)(0))|163|10|(0)(0)|13|14|(0)(0)|17|(0)|20|(0)|28|29|(0)|44|(0)|125|127|128|(0)|139|(0)|49|(0)|54|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r10 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r10 == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00fc A[Catch: all -> 0x011e, TryCatch #13 {all -> 0x011e, blocks: (B:128:0x00f2, B:130:0x00fc, B:133:0x010d, B:136:0x011a, B:139:0x0120, B:141:0x012a), top: B:127:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x012a A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #13 {all -> 0x011e, blocks: (B:128:0x00f2, B:130:0x00fc, B:133:0x010d, B:136:0x011a, B:139:0x0120, B:141:0x012a), top: B:127:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2 A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #10 {all -> 0x00d7, blocks: (B:29:0x00a4, B:31:0x00b2, B:38:0x00d3, B:44:0x00d9, B:46:0x00e3, B:125:0x00ed), top: B:28:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3 A[Catch: all -> 0x00d7, TryCatch #10 {all -> 0x00d7, blocks: (B:29:0x00a4, B:31:0x00b2, B:38:0x00d3, B:44:0x00d9, B:46:0x00e3, B:125:0x00ed), top: B:28:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap loadBitmap(String str, Uri uri, float f, float f2, boolean z) {
        String str2;
        InputStream openInputStream;
        float max;
        int i;
        Matrix matrix;
        float f3;
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
                } catch (Throwable th) {
                    FileLog.e(th);
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
                    float f4 = options.outWidth;
                    float f5 = options.outHeight;
                    max = z ? Math.max(f4 / f, f5 / f2) : Math.min(f4 / f, f5 / f2);
                    if (max < 1.0f) {
                        max = 1.0f;
                    }
                    options.inJustDecodeBounds = false;
                    i = (int) max;
                    options.inSampleSize = i;
                    if (i % 2 != 0) {
                        int i2 = 1;
                        while (true) {
                            int i3 = i2 * 2;
                            if (i3 >= options.inSampleSize) {
                                break;
                            }
                            i2 = i3;
                        }
                        options.inSampleSize = i2;
                    }
                    imageOrientation = AndroidUtilities.getImageOrientation(str2);
                    if (((Integer) imageOrientation.first).intValue() == 0 && ((Integer) imageOrientation.second).intValue() == 0) {
                        try {
                            inputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                            try {
                                imageOrientation = AndroidUtilities.getImageOrientation(inputStream);
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            inputStream = null;
                        }
                    }
                    if (((Integer) imageOrientation.first).intValue() == 0 || ((Integer) imageOrientation.second).intValue() != 0) {
                        matrix = new Matrix();
                        if (((Integer) imageOrientation.second).intValue() != 0) {
                            float f6 = -1.0f;
                            float f7 = ((Integer) imageOrientation.second).intValue() == 1 ? -1.0f : 1.0f;
                            if (((Integer) imageOrientation.second).intValue() != 2) {
                                f6 = 1.0f;
                            }
                            matrix.postScale(f7, f6);
                        }
                        if (((Integer) imageOrientation.first).intValue() != 0) {
                            matrix.postRotate(((Integer) imageOrientation.first).intValue());
                        }
                        f3 = max / options.inSampleSize;
                        if (f3 > 1.0f) {
                            if (matrix == null) {
                                matrix = new Matrix();
                            }
                            float f8 = 1.0f / f3;
                            matrix.postScale(f8, f8);
                        }
                        Matrix matrix2 = matrix;
                        if (str2 == null) {
                            try {
                                bitmap = BitmapFactory.decodeFile(str2, options);
                                if (bitmap != null) {
                                    try {
                                        Bitmap createBitmap2 = Bitmaps.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                                        if (createBitmap2 != bitmap) {
                                            bitmap.recycle();
                                            return createBitmap2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bitmap2 = bitmap;
                                        FileLog.e(th);
                                        getInstance().clearMemory();
                                        if (bitmap2 == null) {
                                            try {
                                                bitmap2 = BitmapFactory.decodeFile(str2, options);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                FileLog.e(th);
                                                return bitmap2;
                                            }
                                        }
                                        bitmap = bitmap2;
                                        if (bitmap != null) {
                                            try {
                                                Bitmap createBitmap3 = Bitmaps.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                                                if (createBitmap3 != bitmap) {
                                                    bitmap.recycle();
                                                    return createBitmap3;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                bitmap2 = bitmap;
                                                FileLog.e(th);
                                                return bitmap2;
                                            }
                                        }
                                        return bitmap;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            return bitmap;
                        }
                        if (uri == null) {
                            return null;
                        }
                        try {
                            decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        try {
                            if (decodeStream != null) {
                                try {
                                    createBitmap = Bitmaps.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix2, true);
                                } catch (Throwable th7) {
                                    th = th7;
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
                        } catch (Throwable th8) {
                            FileLog.e(th8);
                            return bitmap2;
                        }
                        bitmap2 = decodeStream;
                    }
                    matrix = null;
                    f3 = max / options.inSampleSize;
                    if (f3 > 1.0f) {
                    }
                    Matrix matrix22 = matrix;
                    if (str2 == null) {
                    }
                } catch (Throwable th9) {
                    FileLog.e(th9);
                    return null;
                }
            }
            openInputStream = null;
            float f42 = options.outWidth;
            float f52 = options.outHeight;
            if (z) {
            }
            if (max < 1.0f) {
            }
            options.inJustDecodeBounds = false;
            i = (int) max;
            options.inSampleSize = i;
            if (i % 2 != 0) {
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
            f3 = max / options.inSampleSize;
            if (f3 > 1.0f) {
            }
            Matrix matrix222 = matrix;
            if (str2 == null) {
            }
        }
        str2 = str;
        Bitmap bitmap22 = null;
        if (str2 == null) {
        }
        openInputStream = null;
        float f422 = options.outWidth;
        float f522 = options.outHeight;
        if (z) {
        }
        if (max < 1.0f) {
        }
        options.inJustDecodeBounds = false;
        i = (int) max;
        options.inSampleSize = i;
        if (i % 2 != 0) {
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
        f3 = max / options.inSampleSize;
        if (f3 > 1.0f) {
        }
        Matrix matrix2222 = matrix;
        if (str2 == null) {
        }
    }

    public static void fillPhotoSizeWithBytes(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSize, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        int length = (int) randomAccessFile.length();
                        byte[] bArr2 = new byte[length];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, length);
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
    }

    public static TLRPC.PhotoSize fileToSize(String str, boolean z) {
        File directory;
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.w = i;
            tL_photoSize_layer127.h = i2;
            if (i <= 100 && i2 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i <= 320 && i2 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i <= 800 && i2 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i <= 1280 && i2 <= 1280) {
                tL_photoSize_layer127.type = "y";
            } else {
                tL_photoSize_layer127.type = "w";
            }
            String str2 = tL_fileLocationToBeDeprecated.volume_id + "_" + tL_fileLocationToBeDeprecated.local_id + ".jpg";
            if (z) {
                directory = FileLoader.getDirectory(4);
            } else {
                directory = tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? FileLoader.getDirectory(0) : FileLoader.getDirectory(4);
            }
            File file = new File(directory, str2);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

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

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TLRPC.PhotoSize scaleAndSaveImageInternal(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z, int i, int i2, float f, float f2, float f3, int i3, boolean z2, boolean z3, boolean z4) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        File directory;
        Bitmap createScaledBitmap = (f3 > 1.0f || z3) ? Bitmaps.createScaledBitmap(bitmap, i, i2, true) : bitmap;
        if (photoSize != null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                tL_fileLocationToBeDeprecated = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                int i4 = 7.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
                String str = tL_fileLocationToBeDeprecated.volume_id + "_" + tL_fileLocationToBeDeprecated.local_id + ((i4 != 1 || i4 == 2 || i4 == 3) ? ".webp" : ".jpg");
                if (z4) {
                    directory = tL_fileLocationToBeDeprecated.volume_id != -2147483648L ? FileLoader.getDirectory(0) : FileLoader.getDirectory(4);
                } else {
                    directory = FileLoader.getDirectory(4);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(directory, str));
                createScaledBitmap.compress(compressFormat, i3, fileOutputStream);
                if (!z2) {
                    photoSize.size = (int) fileOutputStream.getChannel().size();
                }
                fileOutputStream.close();
                if (z2) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createScaledBitmap.compress(compressFormat, i3, byteArrayOutputStream);
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
        int i5 = photoSize.w;
        if (i5 <= 100 && height <= 100) {
            photoSize.type = "s";
        } else if (i5 <= 320 && height <= 320) {
            photoSize.type = "m";
        } else if (i5 <= 800 && height <= 800) {
            photoSize.type = "x";
        } else if (i5 <= 1280 && height <= 1280) {
            photoSize.type = "y";
        } else {
            photoSize.type = "w";
        }
        int i42 = 7.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        if (i42 != 1) {
        }
        String str2 = tL_fileLocationToBeDeprecated.volume_id + "_" + tL_fileLocationToBeDeprecated.local_id + ((i42 != 1 || i42 == 2 || i42 == 3) ? ".webp" : ".jpg");
        if (z4) {
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(directory, str2));
        createScaledBitmap.compress(compressFormat, i3, fileOutputStream2);
        if (!z2) {
        }
        fileOutputStream2.close();
        if (z2) {
        }
        if (createScaledBitmap != bitmap) {
        }
        return photoSize;
    }

    static /* synthetic */ class 7 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            Bitmap.CompressFormat compressFormat;
            Bitmap.CompressFormat compressFormat2;
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$android$graphics$Bitmap$CompressFormat;
                compressFormat2 = Bitmap.CompressFormat.WEBP_LOSSY;
                iArr2[compressFormat2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$android$graphics$Bitmap$CompressFormat;
                compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                iArr3[compressFormat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f, float f2, int i, boolean z) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f, f2, i, z, 0, 0, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, float f, float f2, int i, boolean z, boolean z2) {
        return scaleAndSaveImage(photoSize, bitmap, Bitmap.CompressFormat.JPEG, false, f, f2, i, z, 0, 0, z2);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f, float f2, int i, boolean z, int i2, int i3) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f, f2, i, z, i2, i3, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f, float f2, boolean z, int i, boolean z2, int i2, int i3) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, z, f, f2, i, z2, i2, i3, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f, float f2, int i, boolean z, int i2, int i3) {
        return scaleAndSaveImage(null, bitmap, compressFormat, false, f, f2, i, z, i2, i3, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z, float f, float f2, int i, boolean z2, int i2, int i3, boolean z3) {
        boolean z4;
        float f3;
        int i4;
        int i5;
        float max;
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width != 0.0f && height != 0.0f) {
            float max2 = Math.max(width / f, height / f2);
            if (i2 != 0 && i3 != 0) {
                float f4 = i2;
                if (width < f4 || height < i3) {
                    if (width >= f4 || height <= i3) {
                        if (width > f4) {
                            float f5 = i3;
                            if (height < f5) {
                                max = height / f5;
                            }
                        }
                        max = Math.max(width / f4, height / i3);
                    } else {
                        max = width / f4;
                    }
                    max2 = max;
                    z4 = true;
                    f3 = max2;
                    i4 = (int) (width / f3);
                    i5 = (int) (height / f3);
                    if (i5 != 0 && i4 != 0) {
                        try {
                            return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z, i4, i5, width, height, f3, i, z2, z4, z3);
                        } catch (Throwable th) {
                            FileLog.e(th);
                            getInstance().clearMemory();
                            System.gc();
                            try {
                                return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z, i4, i5, width, height, f3, i, z2, z4, z3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            z4 = false;
            f3 = max2;
            i4 = (int) (width / f3);
            i5 = (int) (height / f3);
            if (i5 != 0) {
                return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z, i4, i5, width, height, f3, i, z2, z4, z3);
            }
        }
        return null;
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

    public static void saveMessageThumbs(TLRPC.Message message) {
        byte[] bArr;
        TLRPC.PhotoSize tL_photoSize_layer127;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            return;
        }
        int i = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            while (i < tL_messageMediaPaidMedia.extended_media.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    saveMessageThumbs(message, ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media);
                }
                i++;
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
        if (findPhotoCachedSize.h <= 50 && findPhotoCachedSize.w <= 50) {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = findPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.w = findPhotoCachedSize.w;
        } else {
            boolean z = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z = false;
            }
            if (!pathToAttach.exists()) {
                if (z) {
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
                        Utilities.aesCtrDecryptionByteArray(findPhotoCachedSize.bytes, bArr2, bArr3, 0, r8.length, 0);
                    } catch (Exception e) {
                        FileLog.e(e);
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
        TLRPC.MessageMedia messageMedia2 = message.media;
        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia2.photo.sizes.size();
            while (i < size) {
                if (message.media.photo.sizes.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.photo.sizes.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
            return;
        }
        if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia2.document.thumbs.size();
            while (i < size2) {
                if (message.media.document.thumbs.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.document.thumbs.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
            return;
        }
        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia2.webpage.photo.sizes.size();
            while (i < size3) {
                if (message.media.webpage.photo.sizes.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.webpage.photo.sizes.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
        }
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
        int i = 0;
        if (findPhotoCachedSize.h <= 50 && findPhotoCachedSize.w <= 50) {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = findPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.w = findPhotoCachedSize.w;
        } else {
            boolean z = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z = false;
            }
            if (!pathToAttach.exists()) {
                if (z) {
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
                    } catch (Exception e) {
                        FileLog.e(e);
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
            while (i < size) {
                if (messageMedia.photo.sizes.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.photo.sizes.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia.document.thumbs.size();
            while (i < size2) {
                if (messageMedia.document.thumbs.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.document.thumbs.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia.webpage.photo.sizes.size();
            while (i < size3) {
                if (messageMedia.webpage.photo.sizes.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.webpage.photo.sizes.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
        }
    }

    private static TLRPC.PhotoSize findPhotoCachedSize(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i < size2) {
                TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo == null) {
                return null;
            }
            int size3 = photo.sizes.size();
            while (i < size3) {
                TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i);
                if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize3;
                }
                i++;
            }
            return null;
        }
        if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0)).thumb;
        }
        return null;
    }

    private static TLRPC.PhotoSize findPhotoCachedSize(TLRPC.MessageMedia messageMedia) {
        int i = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i < size) {
                TLRPC.PhotoSize photoSize = messageMedia.photo.sizes.get(i);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i < size2) {
                TLRPC.PhotoSize photoSize2 = messageMedia.document.thumbs.get(i);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo == null) {
                return null;
            }
            int size3 = photo.sizes.size();
            while (i < size3) {
                TLRPC.PhotoSize photoSize3 = messageMedia.webpage.photo.sizes.get(i);
                if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize3;
                }
                i++;
            }
            return null;
        }
        if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (messageMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) messageMedia.extended_media.get(0)).thumb;
        }
        return null;
    }

    public static void saveMessagesThumbs(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            saveMessageThumbs(arrayList.get(i));
        }
    }

    public static MessageThumb generateMessageThumb(TLRPC.Message message) {
        int i;
        int i2;
        Bitmap strippedPhotoBitmap;
        byte[] bArr;
        TLRPC.PhotoSize findPhotoCachedSize = findPhotoCachedSize(message);
        if (findPhotoCachedSize != null && (bArr = findPhotoCachedSize.bytes) != null && bArr.length != 0) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = findPhotoCachedSize.w;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.size = findPhotoCachedSize.size;
            tL_photoSize_layer127.type = findPhotoCachedSize.type;
            if (pathToAttach.exists() && message.grouped_id == 0) {
                PointF messageSize = ChatMessageCell.getMessageSize(findPhotoCachedSize.w, findPhotoCachedSize.h);
                String format = String.format(Locale.US, "%d_%d@%d_%d_b", Long.valueOf(findPhotoCachedSize.location.volume_id), Integer.valueOf(findPhotoCachedSize.location.local_id), Integer.valueOf((int) (messageSize.x / AndroidUtilities.density)), Integer.valueOf((int) (messageSize.y / AndroidUtilities.density)));
                if (!getInstance().isInMemCache(format, false)) {
                    String path = pathToAttach.getPath();
                    float f = messageSize.x;
                    float f2 = AndroidUtilities.density;
                    Bitmap loadBitmap = loadBitmap(path, null, (int) (f / f2), (int) (messageSize.y / f2), false);
                    if (loadBitmap != null) {
                        Utilities.blurBitmap(loadBitmap, 3);
                        float f3 = messageSize.x;
                        float f4 = AndroidUtilities.density;
                        Bitmap createScaledBitmap = Bitmaps.createScaledBitmap(loadBitmap, (int) (f3 / f4), (int) (messageSize.y / f4), true);
                        if (createScaledBitmap != loadBitmap) {
                            loadBitmap.recycle();
                            loadBitmap = createScaledBitmap;
                        }
                        return new MessageThumb(format, new BitmapDrawable(loadBitmap));
                    }
                }
            }
        } else {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i3);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(message.media.document.thumbs, NotificationCenter.onDatabaseReset);
                        if (closestPhotoSizeWithSize == null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= message.media.document.attributes.size()) {
                                    i = 0;
                                    i2 = 0;
                                    break;
                                }
                                if (message.media.document.attributes.get(i4) instanceof TLRPC.TL_documentAttributeVideo) {
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i4);
                                    i2 = tL_documentAttributeVideo.h;
                                    i = tL_documentAttributeVideo.w;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i2 = closestPhotoSizeWithSize.h;
                            i = closestPhotoSizeWithSize.w;
                        }
                        PointF messageSize2 = ChatMessageCell.getMessageSize(i, i2);
                        String format2 = String.format(Locale.US, "%s_false@%d_%d_b", ImageLocation.getStrippedKey(message, message, photoSize), Integer.valueOf((int) (messageSize2.x / AndroidUtilities.density)), Integer.valueOf((int) (messageSize2.y / AndroidUtilities.density)));
                        if (!getInstance().isInMemCache(format2, false) && (strippedPhotoBitmap = getStrippedPhotoBitmap(photoSize.bytes, null)) != null) {
                            Utilities.blurBitmap(strippedPhotoBitmap, 3);
                            float f5 = messageSize2.x;
                            float f6 = AndroidUtilities.density;
                            Bitmap createScaledBitmap2 = Bitmaps.createScaledBitmap(strippedPhotoBitmap, (int) (f5 / f6), (int) (messageSize2.y / f6), true);
                            if (createScaledBitmap2 != strippedPhotoBitmap) {
                                strippedPhotoBitmap.recycle();
                                strippedPhotoBitmap = createScaledBitmap2;
                            }
                            return new MessageThumb(format2, new BitmapDrawable(strippedPhotoBitmap));
                        }
                    }
                }
            }
        }
        return null;
    }

    public void onFragmentStackChanged() {
        for (int i = 0; i < this.cachedAnimatedFileDrawables.size(); i++) {
            this.cachedAnimatedFileDrawables.get(i).repeatCount = 0;
        }
    }

    public DispatchQueuePriority getCacheOutQueue() {
        return this.cacheOutQueue;
    }

    public static class MessageThumb {
        BitmapDrawable drawable;
        String key;

        public MessageThumb(String str, BitmapDrawable bitmapDrawable) {
            this.key = str;
            this.drawable = bitmapDrawable;
        }
    }
}
