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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
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

    static /* synthetic */ byte[] access$1700() {
        return headerThumb;
    }

    static /* synthetic */ byte[] access$1800() {
        return header;
    }

    static /* synthetic */ boolean access$1900(ImageLoader imageLoader, String str) {
        return imageLoader.isAnimatedAvatar(str);
    }

    static /* synthetic */ boolean access$2000(ImageLoader imageLoader) {
        return imageLoader.canForce8888;
    }

    static /* synthetic */ ThreadLocal access$2100() {
        return bytesLocal;
    }

    static /* synthetic */ long access$2200(ImageLoader imageLoader) {
        return imageLoader.lastCacheOutTime;
    }

    static /* synthetic */ long access$2202(ImageLoader imageLoader, long j) {
        imageLoader.lastCacheOutTime = j;
        return j;
    }

    static /* synthetic */ ThreadLocal access$2300() {
        return bytesThumbLocal;
    }

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

    private static class ThumbGenerateInfo {
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
                    ImageLoader.HttpFileTask.this.lambda$reportProgress$1(j, j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$1(final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(this.url, new long[]{j, j2});
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpFileTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpFileTask.this.lambda$reportProgress$0(j, j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$0(long j, long j2) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.url, Long.valueOf(j), Long.valueOf(j2));
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
                        ImageLoader.ArtworkLoadTask.this.lambda$onPostExecute$0(str);
                    }
                });
            } else if (this.canRetry) {
                ImageLoader.this.artworkLoadError(this.cacheImage.url);
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.ArtworkLoadTask.this.lambda$onPostExecute$1();
                }
            });
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

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCancelled$2() {
            ImageLoader.this.runArtworkTasks(true);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.ArtworkLoadTask.this.lambda$onCancelled$2();
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

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$doInBackground$2(TLObject tLObject, TLRPC.TL_error tL_error) {
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
                    ImageLoader.HttpImageTask.this.lambda$reportProgress$1(j, j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$1(final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(this.cacheImage.url, new long[]{j, j2});
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.this.lambda$reportProgress$0(j, j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportProgress$0(long j, long j2) {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.cacheImage.url, Long.valueOf(j), Long.valueOf(j2));
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
                            ImageLoader.HttpImageTask.lambda$doInBackground$2(tLObject, tL_error);
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
                    ImageLoader.HttpImageTask.this.lambda$onPostExecute$4(bool);
                }
            });
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.this.lambda$onPostExecute$5();
                }
            }, this.cacheImage.priority);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$4(final Boolean bool) {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.this.lambda$onPostExecute$3(bool);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$3(Boolean bool) {
            if (bool.booleanValue()) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.cacheImage.currentAccount);
                int i = NotificationCenter.fileLoaded;
                CacheImage cacheImage = this.cacheImage;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i, cacheImage.url, cacheImage.finalFilePath);
                return;
            }
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$5() {
            ImageLoader.this.runHttpTasks(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCancelled$6() {
            ImageLoader.this.runHttpTasks(true);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.this.lambda$onCancelled$6();
                }
            }, this.cacheImage.priority);
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.this.lambda$onCancelled$8();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCancelled$8() {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$HttpImageTask$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.HttpImageTask.this.lambda$onCancelled$7();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCancelled$7() {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 1);
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
                    ImageLoader.ThumbGenerateTask.this.lambda$removeTask$0(attachFileName);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$removeTask$0(String str) {
            ImageLoader.this.thumbGenerateTasks.remove(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00ff A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000d, B:10:0x0055, B:13:0x005f, B:15:0x0067, B:16:0x0083, B:18:0x008a, B:21:0x00ff, B:23:0x0103, B:27:0x0110, B:29:0x0121, B:31:0x012b, B:32:0x012f, B:35:0x0143, B:37:0x0146, B:38:0x014e, B:42:0x014b, B:44:0x0174, B:48:0x009a, B:51:0x00aa, B:55:0x00b2, B:57:0x00c4, B:60:0x00d4, B:62:0x00d9, B:64:0x00df, B:66:0x00e7, B:68:0x00ef, B:70:0x00f7, B:71:0x0072, B:72:0x0178), top: B:2:0x0002, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0103 A[Catch: all -> 0x000a, TryCatch #1 {all -> 0x000a, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x000d, B:10:0x0055, B:13:0x005f, B:15:0x0067, B:16:0x0083, B:18:0x008a, B:21:0x00ff, B:23:0x0103, B:27:0x0110, B:29:0x0121, B:31:0x012b, B:32:0x012f, B:35:0x0143, B:37:0x0146, B:38:0x014e, B:42:0x014b, B:44:0x0174, B:48:0x009a, B:51:0x00aa, B:55:0x00b2, B:57:0x00c4, B:60:0x00d4, B:62:0x00d9, B:64:0x00df, B:66:0x00e7, B:68:0x00ef, B:70:0x00f7, B:71:0x0072, B:72:0x0178), top: B:2:0x0002, inners: #0 }] */
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
                                        ImageLoader.ThumbGenerateTask.this.lambda$run$1(str, arrayList, bitmapDrawable, arrayList2);
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

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
            removeTask();
            if (this.info.filter != null) {
                str = str + "@" + this.info.filter;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(bitmapDrawable, str, 0, false, ((Integer) arrayList2.get(i)).intValue());
            }
            if (str.contains("nocache")) {
                return;
            }
            ImageLoader.this.memCache.put(str, bitmapDrawable);
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

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
            	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
            	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
            */
        /* JADX WARN: Not initialized variable reg: 37, insn: 0x08e0: MOVE (r3 I:??[OBJECT, ARRAY]) = (r37 I:??[OBJECT, ARRAY]), block:B:783:0x08e0 */
        @Override // java.lang.Runnable
        public void run() {
            /*
                Method dump skipped, instructions count: 3738
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.CacheOutTask.run():void");
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
                canvas.drawColor(ColorUtils.setAlphaComponent(wallPaper.settings.background_color, NotificationCenter.didReceiveCall));
            } else if (wallPaperSettings2.third_background_color == 0) {
                int alphaComponent = ColorUtils.setAlphaComponent(wallPaperSettings2.background_color, NotificationCenter.didReceiveCall);
                int alphaComponent2 = ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, NotificationCenter.didReceiveCall);
                int averageColor = AndroidUtilities.getAverageColor(alphaComponent, alphaComponent2);
                GradientDrawable gradientDrawable = new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(wallPaper.settings.rotation), new int[]{alphaComponent, alphaComponent2});
                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                gradientDrawable.draw(canvas);
                i = averageColor;
            } else {
                int alphaComponent3 = ColorUtils.setAlphaComponent(wallPaperSettings2.background_color, NotificationCenter.didReceiveCall);
                int alphaComponent4 = ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, NotificationCenter.didReceiveCall);
                int alphaComponent5 = ColorUtils.setAlphaComponent(wallPaper.settings.third_background_color, NotificationCenter.didReceiveCall);
                int i2 = wallPaper.settings.fourth_background_color;
                int alphaComponent6 = i2 == 0 ? 0 : ColorUtils.setAlphaComponent(i2, NotificationCenter.didReceiveCall);
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
                    ImageLoader.CacheOutTask.this.lambda$onPostExecute$1(drawable);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$1(final Drawable drawable) {
            boolean z = false;
            final String str = null;
            if (drawable instanceof RLottieDrawable) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                Drawable drawable2 = (Drawable) ImageLoader.this.lottieMemCache.get(this.cacheImage.key);
                if (drawable2 == null) {
                    ImageLoader.this.lottieMemCache.put(this.cacheImage.key, rLottieDrawable);
                    drawable = rLottieDrawable;
                } else {
                    rLottieDrawable.recycle(false);
                    drawable = drawable2;
                }
                if (drawable != null) {
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                }
            } else if (drawable instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                if (animatedFileDrawable.isWebmSticker) {
                    BitmapDrawable fromLottieCache = ImageLoader.this.getFromLottieCache(this.cacheImage.key);
                    if (fromLottieCache == null) {
                        ImageLoader.this.lottieMemCache.put(this.cacheImage.key, animatedFileDrawable);
                        drawable = animatedFileDrawable;
                    } else {
                        animatedFileDrawable.recycle();
                        drawable = fromLottieCache;
                    }
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                }
            } else if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                BitmapDrawable fromMemCache = ImageLoader.this.getFromMemCache(this.cacheImage.key);
                boolean z2 = true;
                if (fromMemCache == null) {
                    if (this.cacheImage.key.endsWith("_f")) {
                        ImageLoader.this.wallpaperMemCache.put(this.cacheImage.key, bitmapDrawable);
                    } else {
                        if (!this.cacheImage.key.endsWith("_isc") && !this.cacheImage.key.endsWith("_nocache") && bitmapDrawable.getBitmap().getWidth() <= AndroidUtilities.density * 80.0f && bitmapDrawable.getBitmap().getHeight() <= AndroidUtilities.density * 80.0f) {
                            ImageLoader.this.smallImagesMemCache.put(this.cacheImage.key, bitmapDrawable);
                        } else if (!this.cacheImage.key.endsWith("_nocache")) {
                            ImageLoader.this.memCache.put(this.cacheImage.key, bitmapDrawable);
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
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                }
            } else {
                drawable = null;
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$CacheOutTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.CacheOutTask.this.lambda$onPostExecute$0(drawable, str);
                }
            }, this.cacheImage.priority);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPostExecute$0(Drawable drawable, String str) {
            this.cacheImage.setImageAndClear(drawable, str);
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
            Utilities.blurBitmap(decodeByteArray, 3, 1, decodeByteArray.getWidth(), decodeByteArray.getHeight(), decodeByteArray.getRowBytes());
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
            if (drawable != null) {
                final ArrayList arrayList = new ArrayList(this.imageReceiverArray);
                final ArrayList arrayList2 = new ArrayList(this.imageReceiverGuidsArray);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$CacheImage$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageLoader.CacheImage.this.lambda$setImageAndClear$0(drawable, arrayList, arrayList2, str);
                    }
                });
            }
            for (int i = 0; i < this.imageReceiverArray.size(); i++) {
                ImageLoader.this.imageLoadingByTag.remove(this.imageReceiverArray.get(i).getTag(this.type));
            }
            this.imageReceiverArray.clear();
            this.imageReceiverGuidsArray.clear();
            if (this.url != null) {
                ImageLoader.this.imageLoadingByUrl.remove(this.url);
            }
            if (this.url != null) {
                ImageLoader.this.imageLoadingByUrlPframe.remove(this.url);
            }
            String str2 = this.key;
            if (str2 != null) {
                ImageLoader.this.imageLoadingByKeys.remove(str2);
                ImageLoader.this.imageLoadingKeys.remove(ImageLoader.cutFilter(this.key));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$setImageAndClear$0(Drawable drawable, ArrayList arrayList, ArrayList arrayList2, String str) {
            int i = 0;
            if (drawable instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                if (!animatedFileDrawable.isWebmSticker) {
                    boolean z = false;
                    while (i < arrayList.size()) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i);
                        AnimatedFileDrawable makeCopy = i == 0 ? animatedFileDrawable : animatedFileDrawable.makeCopy();
                        if (imageReceiver.setImageBitmapByKey(makeCopy, this.key, this.type, false, ((Integer) arrayList2.get(i)).intValue())) {
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
                ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(drawable, this.key, this.types.get(i).intValue(), false, ((Integer) arrayList2.get(i)).intValue());
                i++;
            }
            if (str == null) {
            }
        }
    }

    public static ImageLoader getInstance() {
        ImageLoader imageLoader = Instance;
        if (imageLoader == null) {
            synchronized (ImageLoader.class) {
                try {
                    imageLoader = Instance;
                    if (imageLoader == null) {
                        imageLoader = new ImageLoader();
                        Instance = imageLoader;
                    }
                } finally {
                }
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
                        ImageLoader.5.lambda$fileUploadProgressChanged$0(i, str, j, j2, z);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileUploadProgressChanged$0(int i, String str, long j, long j2, boolean z) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidUploaded(final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.this.lambda$fileDidUploaded$2(i, str, inputFile, inputEncryptedFile, bArr, bArr2, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileDidUploaded$1(int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploaded, str, inputFile, inputEncryptedFile, bArr, bArr2, Long.valueOf(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidUploaded$2(final int i, final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.lambda$fileDidUploaded$1(i, str, inputFile, inputEncryptedFile, bArr, bArr2, j);
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
                    ImageLoader.5.this.lambda$fileDidFailedUpload$4(i, str, z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileDidFailedUpload$3(int i, String str, boolean z) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadFailed, str, Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidFailedUpload$4(final int i, final String str, final boolean z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.lambda$fileDidFailedUpload$3(i, str, z);
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
                    ImageLoader.5.this.lambda$fileDidLoaded$5(file, str, i2, obj, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidLoaded$5(File file, String str, int i, Object obj, int i2) {
            FilePathDatabase.FileMeta fileMetadataFromParent;
            int i3;
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
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, str, file);
            ImageLoader.this.fileDidLoaded(str, file, i2);
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileDidFailedLoad(final String str, final int i) {
            ImageLoader.this.fileProgresses.remove(str);
            final int i2 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.5.this.lambda$fileDidFailedLoad$6(str, i, i2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileDidFailedLoad$6(String str, int i, int i2) {
            ImageLoader.this.fileDidFailedLoad(str, i);
            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, str, Integer.valueOf(i));
        }

        @Override // org.telegram.messenger.FileLoader.FileLoaderDelegate
        public void fileLoadProgressChanged(final FileLoadOperation fileLoadOperation, final String str, final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j, j2});
            if (!ImageLoader.this.imageLoadingByUrlPframe.isEmpty() && fileLoadOperation.checkPrefixPreloadFinished()) {
                ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$5$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageLoader.5.this.lambda$fileLoadProgressChanged$7(str, fileLoadOperation);
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
                        ImageLoader.5.lambda$fileLoadProgressChanged$8(i, str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$fileLoadProgressChanged$7(String str, FileLoadOperation fileLoadOperation) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$fileLoadProgressChanged$8(int i, String str, long j, long j2) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, str, Long.valueOf(j), Long.valueOf(j2));
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
                    ImageLoader.6.this.lambda$onReceive$0();
                }
            };
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AndroidUtilities.runOnUIThread(runnable, 1000L);
            } else {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0() {
            ImageLoader.this.checkMediaPaths();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int sizeOfBitmapDrawable(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) bitmapDrawable;
            return Math.max(animatedFileDrawable.getIntrinsicHeight() * bitmapDrawable.getIntrinsicWidth() * 12, animatedFileDrawable.getRenderingHeight() * animatedFileDrawable.getRenderingWidth() * 12);
        }
        if (bitmapDrawable instanceof RLottieDrawable) {
            return bitmapDrawable.getIntrinsicWidth() * bitmapDrawable.getIntrinsicHeight() * 8;
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
                ImageLoader.this.lambda$checkMediaPaths$1(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkMediaPaths$1(final Runnable runnable) {
        final SparseArray<File> createMediaPaths = createMediaPaths();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.lambda$checkMediaPaths$0(createMediaPaths, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkMediaPaths$0(SparseArray sparseArray, Runnable runnable) {
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
                            public final void p(Object obj) {
                                ImageLoader.lambda$moveDirectory$2(file2, (java.nio.file.Path) obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$moveDirectory$2(File file, java.nio.file.Path path) {
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
                ImageLoader.this.lambda$changeFileLoadingPriorityForImageReceiver$3(imageReceiver, fileLoadingPriority);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeFileLoadingPriorityForImageReceiver$3(ImageReceiver imageReceiver, int i) {
        CacheImage cacheImage;
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
            if (tag != 0 && (cacheImage = this.imageLoadingByTag.get(tag)) != null) {
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
                ImageLoader.this.lambda$cancelLoadingForImageReceiver$4(z, imageReceiver);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelLoadingForImageReceiver$4(boolean z, ImageReceiver imageReceiver) {
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
                    removeFromWaitingForThumb(tag, imageReceiver);
                }
                CacheImage cacheImage = this.imageLoadingByTag.get(tag);
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
    /* renamed from: replaceImageInCacheInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$replaceImageInCache$5(String str, String str2, ImageLocation imageLocation) {
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
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, str4, str5, imageLocation);
                }
            } else {
                performReplace(str, str2);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, str, str2, imageLocation);
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
                    ImageLoader.this.lambda$replaceImageInCache$5(str, str2, imageLocation);
                }
            });
        } else {
            lambda$replaceImageInCache$5(str, str2, imageLocation);
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
                ImageLoader.this.lambda$cancelForceLoadingForImageReceiver$6(imageKey);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelForceLoadingForImageReceiver$6(String str) {
        this.forceLoadingImages.remove(str);
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
                ImageLoader.this.lambda$createLoadOperationForImageReceiver$7(i3, str2, str, i6, imageReceiver, i4, str4, i2, imageLocation, z, parentObject, currentAccount, qualityThumbDocument, isNeedsQualityThumb, isShouldGenerateQualityThumb, str3, i, j);
            }
        };
        this.imageLoadQueue.postRunnable(runnable, imageReceiver.getFileLoadingPriority() == 0 ? 0L : 1L);
        imageReceiver.addLoadingImageRunnable(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0320, code lost:
    
        if (r5 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03f8, code lost:
    
        if (r5.equals(r6) != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04da, code lost:
    
        if (r5.equals(r6) != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04e7, code lost:
    
        if (r10.exists() == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01bc, code lost:
    
        if (r8.exists() == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$createLoadOperationForImageReceiver$7(int i, String str, String str2, int i2, ImageReceiver imageReceiver, int i3, String str3, int i4, ImageLocation imageLocation, boolean z, Object obj, int i5, TLRPC.Document document, boolean z2, boolean z3, String str4, int i6, long j) {
        String str5;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        String str6;
        File file;
        String str7;
        String str8;
        int i9;
        boolean z7;
        File file2;
        File file3;
        File file4;
        File file5;
        int i10;
        boolean z8;
        int i11;
        boolean z9;
        String str9;
        String str10;
        String str11;
        boolean z10;
        long j2;
        String str12;
        String str13;
        File file6;
        File file7;
        String str14;
        String str15;
        String str16;
        boolean z11;
        boolean z12;
        CacheImage cacheImage;
        CacheImage cacheImage2;
        TLRPC.Document document2 = document;
        if (i != 2) {
            CacheImage cacheImage3 = this.imageLoadingByUrl.get(str);
            CacheImage cacheImage4 = this.imageLoadingByKeys.get(str2);
            CacheImage cacheImage5 = this.imageLoadingByTag.get(i2);
            if (cacheImage5 != null) {
                if (cacheImage5 == cacheImage4) {
                    cacheImage5.setImageReceiverGuid(imageReceiver, i3);
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    str5 = str4;
                    z5 = true;
                    i7 = 0;
                } else if (cacheImage5 == cacheImage3) {
                    cacheImage = cacheImage3;
                    if (cacheImage4 == null) {
                        i7 = 0;
                        cacheImage2 = cacheImage4;
                        str5 = str4;
                        cacheImage5.replaceImageReceiver(imageReceiver, str2, str3, i4, i3);
                    } else {
                        cacheImage2 = cacheImage4;
                        str5 = str4;
                        i7 = 0;
                    }
                    z5 = true;
                } else {
                    cacheImage = cacheImage3;
                    cacheImage2 = cacheImage4;
                    str5 = str4;
                    i7 = 0;
                    cacheImage5.removeImageReceiver(imageReceiver);
                }
                if (!z5 || cacheImage2 == null) {
                    z4 = true;
                } else {
                    z4 = true;
                    cacheImage2.addImageReceiver(imageReceiver, str2, str3, i4, i3);
                    z5 = true;
                }
                if (!z5 && cacheImage != null) {
                    cacheImage.addImageReceiver(imageReceiver, str2, str3, i4, i3);
                    z5 = true;
                }
            } else {
                cacheImage = cacheImage3;
                cacheImage2 = cacheImage4;
                str5 = str4;
                i7 = 0;
            }
            z5 = false;
            if (z5) {
            }
            z4 = true;
            if (!z5) {
                cacheImage.addImageReceiver(imageReceiver, str2, str3, i4, i3);
                z5 = true;
            }
        } else {
            str5 = str4;
            z4 = true;
            i7 = 0;
            z5 = false;
        }
        if (z5) {
            return;
        }
        String str17 = imageLocation.path;
        if (str17 != null) {
            if (!str17.startsWith("http") && !str17.startsWith("athumb")) {
                if (str17.startsWith("thumb://")) {
                    int indexOf = str17.indexOf(":", 8);
                    if (indexOf >= 0) {
                        file2 = new File(str17.substring(indexOf + (z4 ? 1 : 0)));
                        str7 = str3;
                        str8 = "athumb";
                        i9 = 2;
                        z7 = false;
                    }
                    str7 = str3;
                    str8 = "athumb";
                    i9 = 2;
                    z7 = false;
                    file2 = null;
                } else {
                    if (str17.startsWith("vthumb://")) {
                        int indexOf2 = str17.indexOf(":", 9);
                        if (indexOf2 >= 0) {
                            file2 = new File(str17.substring(indexOf2 + (z4 ? 1 : 0)));
                        }
                        str7 = str3;
                        str8 = "athumb";
                        i9 = 2;
                        z7 = false;
                        file2 = null;
                    } else {
                        file2 = new File(str17);
                    }
                    str7 = str3;
                    str8 = "athumb";
                    i9 = 2;
                    z7 = false;
                }
            }
            str7 = str3;
            str8 = "athumb";
            i9 = 2;
            z7 = false;
            file2 = null;
            z4 = false;
        } else {
            if (i == 0 && z) {
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    TLRPC.Document document3 = messageObject.getDocument();
                    String str18 = messageObject.messageOwner.attachPath;
                    File pathToMessage = FileLoader.getInstance(i5).getPathToMessage(messageObject.messageOwner);
                    i8 = messageObject.getMediaType();
                    file = pathToMessage;
                    z6 = false;
                    document2 = document3;
                    str6 = str18;
                } else if (document2 != null) {
                    file = FileLoader.getInstance(i5).getPathToAttach(document2, z4);
                    i8 = MessageObject.isVideoDocument(document) ? 2 : 3;
                    z6 = true;
                    str6 = null;
                } else {
                    i8 = 0;
                    z6 = false;
                    str6 = null;
                    file = null;
                    document2 = null;
                }
                if (document2 != null) {
                    if (z2) {
                        file3 = file;
                        str8 = "athumb";
                        file4 = new File(FileLoader.getDirectory(4), "q_" + document2.dc_id + "_" + document2.id + ".jpg");
                        if (file4.exists()) {
                            z7 = true;
                            if (!TextUtils.isEmpty(str6)) {
                                file5 = new File(str6);
                            }
                            file5 = null;
                            if (file5 == null) {
                                file5 = file3;
                            }
                            if (file4 != null) {
                                String attachFileName = FileLoader.getAttachFileName(document2);
                                ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(attachFileName);
                                if (thumbGenerateInfo == null) {
                                    thumbGenerateInfo = new ThumbGenerateInfo();
                                    thumbGenerateInfo.parentDocument = document2;
                                    thumbGenerateInfo.filter = str3;
                                    thumbGenerateInfo.big = z6;
                                    this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                                }
                                if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver)) {
                                    thumbGenerateInfo.imageReceiverArray.add(imageReceiver);
                                    thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i3));
                                }
                                this.waitingForQualityThumbByTag.put(i2, attachFileName);
                                if (file5.exists() && z3) {
                                    generateThumb(i8, file5, thumbGenerateInfo);
                                    return;
                                }
                                return;
                            }
                            str7 = str3;
                            i9 = 2;
                            file2 = file4;
                        }
                    } else {
                        file3 = file;
                        str8 = "athumb";
                    }
                    z7 = false;
                    file4 = null;
                    if (!TextUtils.isEmpty(str6)) {
                    }
                    file5 = null;
                    if (file5 == null) {
                    }
                    if (file4 != null) {
                    }
                } else {
                    str7 = str3;
                    str8 = "athumb";
                    i9 = 2;
                    z7 = false;
                    file2 = null;
                }
                z4 = true;
            }
            str7 = str3;
            str8 = "athumb";
            i9 = 2;
            z7 = false;
            file2 = null;
            z4 = false;
        }
        if (i != i9) {
            boolean isEncrypted = imageLocation.isEncrypted();
            CacheImage cacheImage6 = new CacheImage();
            cacheImage6.priority = imageReceiver.getFileLoadingPriority() == 0 ? 0 : 1;
            if (!z) {
                if (imageLocation.imageType == i9 || MessageObject.isGifDocument(imageLocation.webFile) || MessageObject.isGifDocument(imageLocation.document) || MessageObject.isRoundVideoDocument(imageLocation.document) || MessageObject.isVideoSticker(imageLocation.document)) {
                    cacheImage6.imageType = i9;
                } else {
                    String str19 = imageLocation.path;
                    if (str19 != null && !str19.startsWith("vthumb") && !str19.startsWith("thumb")) {
                        String httpUrlExtension = getHttpUrlExtension(str19, "jpg");
                        if (httpUrlExtension.equalsIgnoreCase("webm") || httpUrlExtension.equalsIgnoreCase("mp4") || httpUrlExtension.equalsIgnoreCase("gif")) {
                            cacheImage6.imageType = i9;
                        } else if ("tgs".equals(str5)) {
                            cacheImage6.imageType = 1;
                        }
                    }
                }
            }
            if (file2 == null) {
                TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                boolean z13 = z7;
                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                    i10 = i6;
                    str10 = AUTOPLAY_FILTER_NONLOOP;
                    str11 = AUTOPLAY_FILTER;
                    z10 = z13;
                    j2 = 0;
                    z9 = true;
                } else {
                    SecureDocument secureDocument = imageLocation.secureDocument;
                    if (secureDocument != null) {
                        cacheImage6.secureDocument = secureDocument;
                        boolean z14 = secureDocument.secureFile.dc_id == Integer.MIN_VALUE;
                        file2 = new File(FileLoader.getDirectory(4), str);
                        i10 = i6;
                        str10 = AUTOPLAY_FILTER_NONLOOP;
                        z9 = z14;
                        str11 = AUTOPLAY_FILTER;
                        j2 = 0;
                        z10 = z13;
                    } else {
                        boolean z15 = z4;
                        if (AUTOPLAY_FILTER.equals(str7) || AUTOPLAY_FILTER_NONLOOP.equals(str7) || isAnimatedAvatar(str7)) {
                            i10 = i6;
                            str12 = AUTOPLAY_FILTER_NONLOOP;
                            str13 = "_";
                        } else {
                            i10 = i6;
                            str12 = AUTOPLAY_FILTER_NONLOOP;
                            if (i10 == 0) {
                                str13 = "_";
                                if (j > 0) {
                                    if (imageLocation.path == null) {
                                    }
                                }
                            }
                            File file8 = new File(FileLoader.getDirectory(4), str);
                            if (file8.exists()) {
                                z12 = true;
                            } else {
                                if (i10 == 2) {
                                    file8 = new File(FileLoader.getDirectory(4), str + ".enc");
                                }
                                z12 = z13;
                            }
                            TLRPC.Document document4 = imageLocation.document;
                            if (document4 != null) {
                                if (document4 instanceof DocumentObject.ThemeDocument) {
                                    z9 = ((DocumentObject.ThemeDocument) document4).wallpaper == null ? true : z15;
                                    cacheImage6.imageType = 5;
                                } else if ("application/x-tgsdice".equals(document4.mime_type)) {
                                    z9 = true;
                                    cacheImage6.imageType = 1;
                                } else if ("application/x-tgsticker".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 1;
                                } else if ("application/x-tgwallpattern".equals(imageLocation.document.mime_type)) {
                                    cacheImage6.imageType = 3;
                                } else if (FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                    cacheImage6.imageType = 3;
                                }
                                str10 = str12;
                                file2 = file8;
                                j2 = 0;
                                z10 = z12;
                                str11 = AUTOPLAY_FILTER;
                            }
                            z9 = z15;
                            str10 = str12;
                            file2 = file8;
                            j2 = 0;
                            z10 = z12;
                            str11 = AUTOPLAY_FILTER;
                        }
                        TLRPC.Document document5 = imageLocation.document;
                        if (document5 != null) {
                            if (document5 instanceof TLRPC.TL_documentEncrypted) {
                                file7 = new File(FileLoader.getDirectory(4), str);
                            } else if (MessageObject.isVideoDocument(document5)) {
                                file7 = new File(FileLoader.getDirectory(2), str);
                            } else {
                                file7 = new File(FileLoader.getDirectory(3), str);
                            }
                            if (isAnimatedAvatar(str7) || AUTOPLAY_FILTER.equals(str7)) {
                                str14 = str12;
                            } else {
                                str14 = str12;
                            }
                            if (!file7.exists()) {
                                File directory = FileLoader.getDirectory(4);
                                str15 = str14;
                                StringBuilder sb = new StringBuilder();
                                str16 = AUTOPLAY_FILTER;
                                sb.append(document5.dc_id);
                                sb.append(str13);
                                sb.append(document5.id);
                                sb.append(".temp");
                                file7 = new File(directory, sb.toString());
                                if (!(document5 instanceof DocumentObject.ThemeDocument)) {
                                    z11 = ((DocumentObject.ThemeDocument) document5).wallpaper == null ? true : z15;
                                    cacheImage6.imageType = 5;
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
                                    long j3 = document5.size;
                                    z10 = z13;
                                    z9 = z11;
                                    file2 = file7;
                                    j2 = j3;
                                    str7 = str3;
                                    str10 = str15;
                                    str11 = str16;
                                }
                                long j32 = document5.size;
                                z10 = z13;
                                z9 = z11;
                                file2 = file7;
                                j2 = j32;
                                str7 = str3;
                                str10 = str15;
                                str11 = str16;
                            }
                            str15 = str14;
                            str16 = AUTOPLAY_FILTER;
                            if (!(document5 instanceof DocumentObject.ThemeDocument)) {
                            }
                            long j322 = document5.size;
                            z10 = z13;
                            z9 = z11;
                            file2 = file7;
                            j2 = j322;
                            str7 = str3;
                            str10 = str15;
                            str11 = str16;
                        } else {
                            String str20 = str13;
                            if (imageLocation.webFile != null) {
                                file2 = new File(FileLoader.getDirectory(3), str);
                                z10 = z13;
                                str7 = str3;
                                z9 = z15;
                                str10 = str12;
                                str11 = AUTOPLAY_FILTER;
                            } else {
                                if (i10 == 1) {
                                    file6 = new File(FileLoader.getDirectory(4), str);
                                } else {
                                    file6 = new File(FileLoader.getDirectory(i7), str);
                                }
                                str7 = str3;
                                file2 = file6;
                                if (isAnimatedAvatar(str7)) {
                                    str10 = str12;
                                    str11 = AUTOPLAY_FILTER;
                                } else {
                                    str11 = AUTOPLAY_FILTER;
                                    if (str11.equals(str7)) {
                                        str10 = str12;
                                    } else {
                                        str10 = str12;
                                    }
                                    if (imageLocation.location != null) {
                                    }
                                    z10 = z13;
                                    z9 = z15;
                                }
                                file2 = new File(FileLoader.getDirectory(4), imageLocation.location.volume_id + str20 + imageLocation.location.local_id + ".temp");
                                z10 = z13;
                                z9 = z15;
                            }
                            j2 = 0;
                        }
                    }
                }
                if (hasAutoplayFilter(str3) || isAnimatedAvatar(str7)) {
                    cacheImage6.imageType = 2;
                    cacheImage6.size = j2;
                    cacheImage6.isPFrame = isPFrame(str7);
                    if (str11.equals(str7) || str10.equals(str7) || isAnimatedAvatar(str7)) {
                        z8 = z10;
                        z9 = true;
                        i11 = i4;
                    }
                }
                z8 = z10;
                i11 = i4;
            } else {
                boolean z16 = z4;
                i10 = i6;
                z8 = z7;
                i11 = i4;
                z9 = z16;
            }
            cacheImage6.type = i11;
            cacheImage6.key = str2;
            cacheImage6.cacheType = i10;
            cacheImage6.filter = str7;
            cacheImage6.imageLocation = imageLocation;
            cacheImage6.ext = str4;
            cacheImage6.currentAccount = i5;
            cacheImage6.parentObject = obj;
            int i12 = imageLocation.imageType;
            if (i12 != 0) {
                cacheImage6.imageType = i12;
            }
            if (i10 == 2) {
                File internalCacheDir = FileLoader.getInternalCacheDir();
                StringBuilder sb2 = new StringBuilder();
                str9 = str;
                sb2.append(str9);
                sb2.append(".enc.key");
                cacheImage6.encryptionKeyPath = new File(internalCacheDir, sb2.toString());
            } else {
                str9 = str;
            }
            String str21 = str8;
            cacheImage6.addImageReceiver(imageReceiver, str2, str3, i4, i3);
            if (z9 || z8 || file2.exists()) {
                cacheImage6.finalFilePath = file2;
                cacheImage6.imageLocation = imageLocation;
                cacheImage6.cacheTask = new CacheOutTask(cacheImage6);
                this.imageLoadingByKeys.put(str2, cacheImage6);
                this.imageLoadingKeys.add(cutFilter(str2));
                if (i != 0) {
                    this.cacheThumbOutQueue.postRunnable(cacheImage6.cacheTask);
                    return;
                } else {
                    cacheImage6.runningTask = this.cacheOutQueue.postRunnable(cacheImage6.cacheTask, cacheImage6.priority);
                    return;
                }
            }
            cacheImage6.url = str9;
            this.imageLoadingByUrl.put(str9, cacheImage6);
            if (cacheImage6.isPFrame) {
                this.imageLoadingByUrlPframe.put(str9, cacheImage6);
            }
            String str22 = imageLocation.path;
            if (str22 != null) {
                String MD5 = Utilities.MD5(str22);
                cacheImage6.tempFilePath = new File(FileLoader.getDirectory(4), MD5 + "_temp.jpg");
                cacheImage6.finalFilePath = file2;
                if (imageLocation.path.startsWith(str21)) {
                    ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage6);
                    cacheImage6.artworkTask = artworkLoadTask;
                    this.artworkTasks.add(artworkLoadTask);
                    runArtworkTasks(false);
                    return;
                }
                HttpImageTask httpImageTask = new HttpImageTask(cacheImage6, j);
                cacheImage6.httpTask = httpImageTask;
                this.httpTasks.add(httpImageTask);
                runHttpTasks(false);
                return;
            }
            int fileLoadingPriority = i != 0 ? 3 : imageReceiver.getFileLoadingPriority();
            if (imageLocation.location != null) {
                FileLoader.getInstance(i5).loadFile(imageLocation, obj, str4, fileLoadingPriority, (i10 != 0 || (j > 0 && imageLocation.key == null)) ? i10 : 1);
            } else if (imageLocation.document != null) {
                FileLoader.getInstance(i5).loadFile(imageLocation.document, obj, fileLoadingPriority, i10);
            } else if (imageLocation.secureDocument != null) {
                FileLoader.getInstance(i5).loadFile(imageLocation.secureDocument, fileLoadingPriority);
            } else if (imageLocation.webFile != null) {
                FileLoader.getInstance(i5).loadFile(imageLocation.webFile, fileLoadingPriority, i10);
            }
            if (imageReceiver.isForceLoding()) {
                this.forceLoadingImages.put(cacheImage6.key, 0);
            }
        }
    }

    public void preloadArtwork(final String str) {
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.this.lambda$preloadArtwork$8(str);
            }
        });
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
        int i = forPath.imageType;
        if (i != 0) {
            cacheImage.imageType = i;
        }
        cacheImage.url = str2;
        this.imageLoadingByUrl.put(str2, cacheImage);
        String MD5 = Utilities.MD5(forPath.path);
        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), MD5 + "_temp.jpg");
        cacheImage.finalFilePath = file;
        ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage);
        cacheImage.artworkTask = artworkLoadTask;
        this.artworkTasks.add(artworkLoadTask);
        runArtworkTasks(false);
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver) {
        loadImageForImageReceiver(imageReceiver, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0299, code lost:
    
        if (r0.local_id < 0) goto L201;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0447 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0462 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadImageForImageReceiver(ImageReceiver imageReceiver, List<ImageReceiver> list) {
        boolean z;
        boolean z2;
        String imageKey;
        boolean z3;
        String thumbKey;
        boolean z4;
        Object parentObject;
        ImageLocation thumbLocation;
        ImageLocation mediaLocation;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        boolean z5;
        String ext;
        ImageLocation imageLocation3;
        String str;
        String str2;
        int i;
        String str3;
        ImageLocation imageLocation4;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        ImageLocation imageLocation5;
        String str14;
        int i2;
        String str15;
        ImageLocation imageLocation6;
        String str16;
        String str17;
        String str18;
        BitmapDrawable bitmapDrawable;
        Drawable findInPreloadImageReceivers;
        BitmapDrawable bitmapDrawable2;
        boolean hasBitmap;
        BitmapDrawable bitmapDrawable3;
        if (imageReceiver == null) {
            return;
        }
        String mediaKey = imageReceiver.getMediaKey();
        int newGuid = imageReceiver.getNewGuid();
        if (mediaKey != null) {
            ImageLocation mediaLocation2 = imageReceiver.getMediaLocation();
            Drawable findInPreloadImageReceivers2 = findInPreloadImageReceivers(mediaKey, list);
            if (findInPreloadImageReceivers2 == null) {
                if (useLottieMemCache(mediaLocation2, mediaKey)) {
                    bitmapDrawable3 = getFromLottieCache(mediaKey);
                } else {
                    bitmapDrawable3 = this.memCache.get(mediaKey);
                    if (bitmapDrawable3 != null) {
                        this.memCache.moveToFront(mediaKey);
                    }
                    if (bitmapDrawable3 == null && (bitmapDrawable3 = this.smallImagesMemCache.get(mediaKey)) != null) {
                        this.smallImagesMemCache.moveToFront(mediaKey);
                    }
                    if (bitmapDrawable3 == null && (bitmapDrawable3 = this.wallpaperMemCache.get(mediaKey)) != null) {
                        this.wallpaperMemCache.moveToFront(mediaKey);
                    }
                }
                findInPreloadImageReceivers2 = bitmapDrawable3;
            }
            if (findInPreloadImageReceivers2 instanceof RLottieDrawable) {
                hasBitmap = ((RLottieDrawable) findInPreloadImageReceivers2).hasBitmap();
            } else {
                hasBitmap = findInPreloadImageReceivers2 instanceof AnimatedFileDrawable ? ((AnimatedFileDrawable) findInPreloadImageReceivers2).hasBitmap() : true;
            }
            if (hasBitmap && findInPreloadImageReceivers2 != null) {
                cancelLoadingForImageReceiver(imageReceiver, true);
                imageReceiver.setImageBitmapByKey(findInPreloadImageReceivers2, mediaKey, 3, true, newGuid);
                if (!imageReceiver.isForcePreview()) {
                    return;
                }
                z = true;
                z2 = false;
                imageKey = imageReceiver.getImageKey();
                if (!z) {
                    ImageLocation imageLocation7 = imageReceiver.getImageLocation();
                    findInPreloadImageReceivers = findInPreloadImageReceivers(imageKey, list);
                    if (findInPreloadImageReceivers == null) {
                        findInPreloadImageReceivers = getFromLottieCache(imageKey);
                    }
                    if (findInPreloadImageReceivers != null) {
                    }
                    if (bitmapDrawable2 != null) {
                    }
                }
                z3 = z;
                thumbKey = imageReceiver.getThumbKey();
                if (thumbKey != null) {
                }
                z4 = false;
                parentObject = imageReceiver.getParentObject();
                TLRPC.Document qualityThumbDocument = imageReceiver.getQualityThumbDocument();
                thumbLocation = imageReceiver.getThumbLocation();
                String thumbFilter = imageReceiver.getThumbFilter();
                mediaLocation = imageReceiver.getMediaLocation();
                String mediaFilter = imageReceiver.getMediaFilter();
                imageLocation = imageReceiver.getImageLocation();
                String imageFilter = imageReceiver.getImageFilter();
                if (imageLocation == null) {
                }
                imageLocation2 = imageLocation;
                z5 = false;
                String str19 = null;
                if (imageLocation2 == null) {
                }
                ImageLocation imageLocation8 = imageLocation2;
                if (mediaLocation == null) {
                }
                ext = imageReceiver.getExt();
                if (ext == null) {
                }
                if (r8 == null) {
                }
                if (r10 == null) {
                }
                ImageLocation imageLocation9 = imageLocation8;
                imageLocation3 = mediaLocation;
                str = null;
                str2 = null;
                String str20 = null;
                String str21 = null;
                i = 0;
                boolean z6 = false;
                while (i < 2) {
                }
                boolean z7 = z4;
                str3 = thumbFilter;
                imageLocation4 = imageLocation9;
                str4 = imageFilter;
                str5 = mediaFilter;
                int i3 = newGuid;
                if (thumbLocation != null) {
                }
                if (str != null) {
                }
                str7 = str5;
                if (str2 != null) {
                }
                str8 = str4;
                if (str6 != null) {
                }
                str9 = str3;
                String str22 = str6;
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                str10 = str2;
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                str11 = str;
                if (imageLocation4 == null) {
                }
                if (imageLocation3 != null) {
                }
            } else if (findInPreloadImageReceivers2 != null) {
                imageReceiver.setImageBitmapByKey(findInPreloadImageReceivers2, mediaKey, 3, true, newGuid);
                z = false;
                z2 = true;
                imageKey = imageReceiver.getImageKey();
                if (!z && imageKey != null) {
                    ImageLocation imageLocation72 = imageReceiver.getImageLocation();
                    findInPreloadImageReceivers = findInPreloadImageReceivers(imageKey, list);
                    if (findInPreloadImageReceivers == null && useLottieMemCache(imageLocation72, imageKey)) {
                        findInPreloadImageReceivers = getFromLottieCache(imageKey);
                    }
                    if (findInPreloadImageReceivers != null) {
                        bitmapDrawable2 = this.memCache.get(imageKey);
                        if (bitmapDrawable2 != null) {
                            this.memCache.moveToFront(imageKey);
                        }
                        if (bitmapDrawable2 == null && (bitmapDrawable2 = this.smallImagesMemCache.get(imageKey)) != null) {
                            this.smallImagesMemCache.moveToFront(imageKey);
                        }
                        if (bitmapDrawable2 == null && (bitmapDrawable2 = this.wallpaperMemCache.get(imageKey)) != null) {
                            this.wallpaperMemCache.moveToFront(imageKey);
                        }
                    } else {
                        bitmapDrawable2 = findInPreloadImageReceivers;
                    }
                    if (bitmapDrawable2 != null) {
                        cancelLoadingForImageReceiver(imageReceiver, true);
                        imageReceiver.setImageBitmapByKey(bitmapDrawable2, imageKey, 0, true, newGuid);
                        if (!imageReceiver.isForcePreview() && (mediaKey == null || z2)) {
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
                                imageReceiver.setImageBitmapByKey(bitmapDrawable4, thumbKey, 1, true, newGuid);
                                cancelLoadingForImageReceiver(imageReceiver, false);
                                if (z3 && imageReceiver.isForcePreview()) {
                                    return;
                                }
                                z4 = true;
                                parentObject = imageReceiver.getParentObject();
                                TLRPC.Document qualityThumbDocument2 = imageReceiver.getQualityThumbDocument();
                                thumbLocation = imageReceiver.getThumbLocation();
                                String thumbFilter2 = imageReceiver.getThumbFilter();
                                mediaLocation = imageReceiver.getMediaLocation();
                                String mediaFilter2 = imageReceiver.getMediaFilter();
                                imageLocation = imageReceiver.getImageLocation();
                                String imageFilter2 = imageReceiver.getImageFilter();
                                if (imageLocation == null && imageReceiver.isNeedsQualityThumb() && imageReceiver.isCurrentKeyQuality()) {
                                    if (!(parentObject instanceof MessageObject)) {
                                        imageLocation2 = ImageLocation.getForDocument(((MessageObject) parentObject).getDocument());
                                    } else if (qualityThumbDocument2 != null) {
                                        imageLocation2 = ImageLocation.getForDocument(qualityThumbDocument2);
                                    }
                                    z5 = true;
                                    String str192 = null;
                                    String str23 = (imageLocation2 == null && imageLocation2.imageType == 2) ? "mp4" : null;
                                    ImageLocation imageLocation82 = imageLocation2;
                                    String str24 = (mediaLocation == null && mediaLocation.imageType == 2) ? "mp4" : null;
                                    ext = imageReceiver.getExt();
                                    if (ext == null) {
                                        ext = "jpg";
                                    }
                                    String str25 = str23 == null ? ext : str23;
                                    String str26 = str24 == null ? ext : str24;
                                    ImageLocation imageLocation92 = imageLocation82;
                                    imageLocation3 = mediaLocation;
                                    str = null;
                                    str2 = null;
                                    String str202 = null;
                                    String str212 = null;
                                    i = 0;
                                    boolean z62 = false;
                                    while (i < 2) {
                                        if (i == 0) {
                                            imageLocation6 = imageLocation92;
                                            i2 = newGuid;
                                            str15 = str25;
                                        } else {
                                            i2 = newGuid;
                                            str15 = str26;
                                            imageLocation6 = imageLocation3;
                                        }
                                        boolean z8 = z4;
                                        ImageLocation imageLocation10 = imageLocation92;
                                        if (imageLocation6 != null) {
                                            if (imageLocation3 != null) {
                                                imageLocation92 = imageLocation3;
                                            }
                                            String key = imageLocation6.getKey(parentObject, imageLocation92, false);
                                            if (key != null) {
                                                str16 = thumbFilter2;
                                                String key2 = imageLocation6.getKey(parentObject, imageLocation3 != null ? imageLocation3 : imageLocation10, true);
                                                if (imageLocation6.path != null) {
                                                    key2 = key2 + "." + getHttpUrlExtension(imageLocation6.path, "jpg");
                                                    str17 = imageFilter2;
                                                    str18 = mediaFilter2;
                                                } else {
                                                    TLRPC.PhotoSize photoSize = imageLocation6.photoSize;
                                                    str17 = imageFilter2;
                                                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                                                        str18 = mediaFilter2;
                                                        key2 = key2 + "." + str15;
                                                    } else if (imageLocation6.location != null) {
                                                        key2 = key2 + "." + str15;
                                                        if (imageReceiver.getExt() == null) {
                                                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation6.location;
                                                            if (tL_fileLocationToBeDeprecated.key == null) {
                                                                str18 = mediaFilter2;
                                                                if (tL_fileLocationToBeDeprecated.volume_id == -2147483648L) {
                                                                }
                                                            }
                                                        }
                                                        str18 = mediaFilter2;
                                                        z62 = true;
                                                    } else {
                                                        str18 = mediaFilter2;
                                                        WebFile webFile = imageLocation6.webFile;
                                                        if (webFile != null) {
                                                            key2 = key2 + "." + getHttpUrlExtension(imageLocation6.webFile.url, FileLoader.getMimeTypePart(webFile.mime_type));
                                                        } else if (imageLocation6.secureDocument != null) {
                                                            key2 = key2 + "." + str15;
                                                        } else if (imageLocation6.document != null) {
                                                            if (i == 0 && z5) {
                                                                key = "q_" + key;
                                                            }
                                                            String documentFileName = FileLoader.getDocumentFileName(imageLocation6.document);
                                                            int lastIndexOf = documentFileName.lastIndexOf(46);
                                                            String str27 = "";
                                                            String substring = lastIndexOf == -1 ? "" : documentFileName.substring(lastIndexOf);
                                                            if (substring.length() > 1) {
                                                                str27 = substring;
                                                            } else if ("video/mp4".equals(imageLocation6.document.mime_type)) {
                                                                str27 = ".mp4";
                                                            } else if ("video/x-matroska".equals(imageLocation6.document.mime_type)) {
                                                                str27 = ".mkv";
                                                            }
                                                            key2 = key2 + str27;
                                                            if (MessageObject.isVideoDocument(imageLocation6.document) || MessageObject.isGifDocument(imageLocation6.document) || MessageObject.isRoundVideoDocument(imageLocation6.document) || MessageObject.canPreviewDocument(imageLocation6.document)) {
                                                                z62 = false;
                                                            }
                                                            z62 = true;
                                                        } else if (parentObject instanceof TLRPC.StickerSet) {
                                                            key2 = key2 + "." + str15;
                                                        }
                                                    }
                                                }
                                                if (i == 0) {
                                                    str202 = key2;
                                                    str2 = key;
                                                } else {
                                                    str212 = key2;
                                                    str = key;
                                                }
                                                if (imageLocation6 == thumbLocation) {
                                                    if (i == 0) {
                                                        str2 = null;
                                                        imageLocation92 = null;
                                                        str202 = null;
                                                        i++;
                                                        newGuid = i2;
                                                        z4 = z8;
                                                        thumbFilter2 = str16;
                                                        imageFilter2 = str17;
                                                        mediaFilter2 = str18;
                                                    } else {
                                                        str = null;
                                                        str212 = null;
                                                        imageLocation3 = null;
                                                    }
                                                }
                                                imageLocation92 = imageLocation10;
                                                i++;
                                                newGuid = i2;
                                                z4 = z8;
                                                thumbFilter2 = str16;
                                                imageFilter2 = str17;
                                                mediaFilter2 = str18;
                                            }
                                        }
                                        str16 = thumbFilter2;
                                        str17 = imageFilter2;
                                        str18 = mediaFilter2;
                                        imageLocation92 = imageLocation10;
                                        i++;
                                        newGuid = i2;
                                        z4 = z8;
                                        thumbFilter2 = str16;
                                        imageFilter2 = str17;
                                        mediaFilter2 = str18;
                                    }
                                    boolean z72 = z4;
                                    str3 = thumbFilter2;
                                    imageLocation4 = imageLocation92;
                                    str4 = imageFilter2;
                                    str5 = mediaFilter2;
                                    int i32 = newGuid;
                                    if (thumbLocation != null) {
                                        ImageLocation strippedLocation = imageReceiver.getStrippedLocation();
                                        if (strippedLocation == null) {
                                            strippedLocation = imageLocation3 != null ? imageLocation3 : imageLocation;
                                        }
                                        String key3 = thumbLocation.getKey(parentObject, strippedLocation, false);
                                        String key4 = thumbLocation.getKey(parentObject, strippedLocation, true);
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
                                        str192 = key4;
                                        str6 = key3;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str != null || str5 == null) {
                                        str7 = str5;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str);
                                        sb.append("@");
                                        str7 = str5;
                                        sb.append(str7);
                                        str = sb.toString();
                                    }
                                    if (str2 != null || str4 == null) {
                                        str8 = str4;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str2);
                                        sb2.append("@");
                                        str8 = str4;
                                        sb2.append(str8);
                                        str2 = sb2.toString();
                                    }
                                    if (str6 != null || str3 == null) {
                                        str9 = str3;
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str6);
                                        sb3.append("@");
                                        str9 = str3;
                                        sb3.append(str9);
                                        str6 = sb3.toString();
                                    }
                                    String str222 = str6;
                                    if (imageReceiver.getUniqKeyPrefix() != null || str2 == null) {
                                        str10 = str2;
                                    } else {
                                        str10 = imageReceiver.getUniqKeyPrefix() + str2;
                                    }
                                    if (imageReceiver.getUniqKeyPrefix() != null || str == null) {
                                        str11 = str;
                                    } else {
                                        str11 = imageReceiver.getUniqKeyPrefix() + str;
                                    }
                                    if (imageLocation4 == null) {
                                        str12 = ext;
                                        str13 = str8;
                                        imageLocation5 = imageLocation4;
                                    } else if (imageLocation4.path != null) {
                                        createLoadOperationForImageReceiver(imageReceiver, str222, str192, ext, thumbLocation, str9, 0L, 1, 1, z72 ? 2 : 1, i32);
                                        createLoadOperationForImageReceiver(imageReceiver, str10, str202, str25, imageLocation4, str8, imageReceiver.getSize(), 1, 0, 0, i32);
                                        return;
                                    } else {
                                        str12 = ext;
                                        imageLocation5 = imageLocation4;
                                        str13 = str8;
                                    }
                                    if (imageLocation3 != null) {
                                        int cacheType = imageReceiver.getCacheType();
                                        int i4 = (cacheType == 0 && z62) ? 1 : cacheType;
                                        int i5 = i4 == 0 ? 1 : i4;
                                        if (z72) {
                                            str14 = str7;
                                        } else {
                                            str14 = str7;
                                            createLoadOperationForImageReceiver(imageReceiver, str222, str192, str12, thumbLocation, str9, 0L, i5, 1, 1, i32);
                                        }
                                        if (!z3) {
                                            createLoadOperationForImageReceiver(imageReceiver, str10, str202, str25, imageLocation5, str13, 0L, 1, 0, 0, i32);
                                        }
                                        if (z2) {
                                            return;
                                        }
                                        createLoadOperationForImageReceiver(imageReceiver, str11, str212, str26, imageLocation3, str14, imageReceiver.getSize(), i4, 3, 0, i32);
                                        return;
                                    }
                                    int cacheType2 = imageReceiver.getCacheType();
                                    int i6 = (cacheType2 == 0 && z62) ? 1 : cacheType2;
                                    createLoadOperationForImageReceiver(imageReceiver, str222, str192, str12, thumbLocation, str9, 0L, i6 == 0 ? 1 : i6, 1, z72 ? 2 : 1, i32);
                                    createLoadOperationForImageReceiver(imageReceiver, str10, str202, str25, imageLocation5, str13, imageReceiver.getSize(), i6, 0, 0, i32);
                                    return;
                                }
                                imageLocation2 = imageLocation;
                                z5 = false;
                                String str1922 = null;
                                if (imageLocation2 == null) {
                                }
                                ImageLocation imageLocation822 = imageLocation2;
                                if (mediaLocation == null) {
                                }
                                ext = imageReceiver.getExt();
                                if (ext == null) {
                                }
                                if (str23 == null) {
                                }
                                if (str24 == null) {
                                }
                                ImageLocation imageLocation922 = imageLocation822;
                                imageLocation3 = mediaLocation;
                                str = null;
                                str2 = null;
                                String str2022 = null;
                                String str2122 = null;
                                i = 0;
                                boolean z622 = false;
                                while (i < 2) {
                                }
                                boolean z722 = z4;
                                str3 = thumbFilter2;
                                imageLocation4 = imageLocation922;
                                str4 = imageFilter2;
                                str5 = mediaFilter2;
                                int i322 = newGuid;
                                if (thumbLocation != null) {
                                }
                                if (str != null) {
                                }
                                str7 = str5;
                                if (str2 != null) {
                                }
                                str8 = str4;
                                if (str6 != null) {
                                }
                                str9 = str3;
                                String str2222 = str6;
                                if (imageReceiver.getUniqKeyPrefix() != null) {
                                }
                                str10 = str2;
                                if (imageReceiver.getUniqKeyPrefix() != null) {
                                }
                                str11 = str;
                                if (imageLocation4 == null) {
                                }
                                if (imageLocation3 != null) {
                                }
                            }
                        }
                        z4 = false;
                        parentObject = imageReceiver.getParentObject();
                        TLRPC.Document qualityThumbDocument22 = imageReceiver.getQualityThumbDocument();
                        thumbLocation = imageReceiver.getThumbLocation();
                        String thumbFilter22 = imageReceiver.getThumbFilter();
                        mediaLocation = imageReceiver.getMediaLocation();
                        String mediaFilter22 = imageReceiver.getMediaFilter();
                        imageLocation = imageReceiver.getImageLocation();
                        String imageFilter22 = imageReceiver.getImageFilter();
                        if (imageLocation == null) {
                            if (!(parentObject instanceof MessageObject)) {
                            }
                            z5 = true;
                            String str19222 = null;
                            if (imageLocation2 == null) {
                            }
                            ImageLocation imageLocation8222 = imageLocation2;
                            if (mediaLocation == null) {
                            }
                            ext = imageReceiver.getExt();
                            if (ext == null) {
                            }
                            if (str23 == null) {
                            }
                            if (str24 == null) {
                            }
                            ImageLocation imageLocation9222 = imageLocation8222;
                            imageLocation3 = mediaLocation;
                            str = null;
                            str2 = null;
                            String str20222 = null;
                            String str21222 = null;
                            i = 0;
                            boolean z6222 = false;
                            while (i < 2) {
                            }
                            boolean z7222 = z4;
                            str3 = thumbFilter22;
                            imageLocation4 = imageLocation9222;
                            str4 = imageFilter22;
                            str5 = mediaFilter22;
                            int i3222 = newGuid;
                            if (thumbLocation != null) {
                            }
                            if (str != null) {
                            }
                            str7 = str5;
                            if (str2 != null) {
                            }
                            str8 = str4;
                            if (str6 != null) {
                            }
                            str9 = str3;
                            String str22222 = str6;
                            if (imageReceiver.getUniqKeyPrefix() != null) {
                            }
                            str10 = str2;
                            if (imageReceiver.getUniqKeyPrefix() != null) {
                            }
                            str11 = str;
                            if (imageLocation4 == null) {
                            }
                            if (imageLocation3 != null) {
                            }
                        }
                        imageLocation2 = imageLocation;
                        z5 = false;
                        String str192222 = null;
                        if (imageLocation2 == null) {
                        }
                        ImageLocation imageLocation82222 = imageLocation2;
                        if (mediaLocation == null) {
                        }
                        ext = imageReceiver.getExt();
                        if (ext == null) {
                        }
                        if (str23 == null) {
                        }
                        if (str24 == null) {
                        }
                        ImageLocation imageLocation92222 = imageLocation82222;
                        imageLocation3 = mediaLocation;
                        str = null;
                        str2 = null;
                        String str202222 = null;
                        String str212222 = null;
                        i = 0;
                        boolean z62222 = false;
                        while (i < 2) {
                        }
                        boolean z72222 = z4;
                        str3 = thumbFilter22;
                        imageLocation4 = imageLocation92222;
                        str4 = imageFilter22;
                        str5 = mediaFilter22;
                        int i32222 = newGuid;
                        if (thumbLocation != null) {
                        }
                        if (str != null) {
                        }
                        str7 = str5;
                        if (str2 != null) {
                        }
                        str8 = str4;
                        if (str6 != null) {
                        }
                        str9 = str3;
                        String str222222 = str6;
                        if (imageReceiver.getUniqKeyPrefix() != null) {
                        }
                        str10 = str2;
                        if (imageReceiver.getUniqKeyPrefix() != null) {
                        }
                        str11 = str;
                        if (imageLocation4 == null) {
                        }
                        if (imageLocation3 != null) {
                        }
                    }
                }
                z3 = z;
                thumbKey = imageReceiver.getThumbKey();
                if (thumbKey != null) {
                }
                z4 = false;
                parentObject = imageReceiver.getParentObject();
                TLRPC.Document qualityThumbDocument222 = imageReceiver.getQualityThumbDocument();
                thumbLocation = imageReceiver.getThumbLocation();
                String thumbFilter222 = imageReceiver.getThumbFilter();
                mediaLocation = imageReceiver.getMediaLocation();
                String mediaFilter222 = imageReceiver.getMediaFilter();
                imageLocation = imageReceiver.getImageLocation();
                String imageFilter222 = imageReceiver.getImageFilter();
                if (imageLocation == null) {
                }
                imageLocation2 = imageLocation;
                z5 = false;
                String str1922222 = null;
                if (imageLocation2 == null) {
                }
                ImageLocation imageLocation822222 = imageLocation2;
                if (mediaLocation == null) {
                }
                ext = imageReceiver.getExt();
                if (ext == null) {
                }
                if (str23 == null) {
                }
                if (str24 == null) {
                }
                ImageLocation imageLocation922222 = imageLocation822222;
                imageLocation3 = mediaLocation;
                str = null;
                str2 = null;
                String str2022222 = null;
                String str2122222 = null;
                i = 0;
                boolean z622222 = false;
                while (i < 2) {
                }
                boolean z722222 = z4;
                str3 = thumbFilter222;
                imageLocation4 = imageLocation922222;
                str4 = imageFilter222;
                str5 = mediaFilter222;
                int i322222 = newGuid;
                if (thumbLocation != null) {
                }
                if (str != null) {
                }
                str7 = str5;
                if (str2 != null) {
                }
                str8 = str4;
                if (str6 != null) {
                }
                str9 = str3;
                String str2222222 = str6;
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                str10 = str2;
                if (imageReceiver.getUniqKeyPrefix() != null) {
                }
                str11 = str;
                if (imageLocation4 == null) {
                }
                if (imageLocation3 != null) {
                }
            }
        }
        z = false;
        z2 = false;
        imageKey = imageReceiver.getImageKey();
        if (!z) {
        }
        z3 = z;
        thumbKey = imageReceiver.getThumbKey();
        if (thumbKey != null) {
        }
        z4 = false;
        parentObject = imageReceiver.getParentObject();
        TLRPC.Document qualityThumbDocument2222 = imageReceiver.getQualityThumbDocument();
        thumbLocation = imageReceiver.getThumbLocation();
        String thumbFilter2222 = imageReceiver.getThumbFilter();
        mediaLocation = imageReceiver.getMediaLocation();
        String mediaFilter2222 = imageReceiver.getMediaFilter();
        imageLocation = imageReceiver.getImageLocation();
        String imageFilter2222 = imageReceiver.getImageFilter();
        if (imageLocation == null) {
        }
        imageLocation2 = imageLocation;
        z5 = false;
        String str19222222 = null;
        if (imageLocation2 == null) {
        }
        ImageLocation imageLocation8222222 = imageLocation2;
        if (mediaLocation == null) {
        }
        ext = imageReceiver.getExt();
        if (ext == null) {
        }
        if (str23 == null) {
        }
        if (str24 == null) {
        }
        ImageLocation imageLocation9222222 = imageLocation8222222;
        imageLocation3 = mediaLocation;
        str = null;
        str2 = null;
        String str20222222 = null;
        String str21222222 = null;
        i = 0;
        boolean z6222222 = false;
        while (i < 2) {
        }
        boolean z7222222 = z4;
        str3 = thumbFilter2222;
        imageLocation4 = imageLocation9222222;
        str4 = imageFilter2222;
        str5 = mediaFilter2222;
        int i3222222 = newGuid;
        if (thumbLocation != null) {
        }
        if (str != null) {
        }
        str7 = str5;
        if (str2 != null) {
        }
        str8 = str4;
        if (str6 != null) {
        }
        str9 = str3;
        String str22222222 = str6;
        if (imageReceiver.getUniqKeyPrefix() != null) {
        }
        str10 = str2;
        if (imageReceiver.getUniqKeyPrefix() != null) {
        }
        str11 = str;
        if (imageLocation4 == null) {
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
        if (str.endsWith("_firstframe") || str.endsWith("_lastframe")) {
            return false;
        }
        return (imageLocation != null && (MessageObject.isAnimatedStickerDocument(imageLocation.document, true) || imageLocation.imageType == 1 || MessageObject.isVideoSticker(imageLocation.document))) || isAnimatedAvatar(str);
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
                ImageLoader.this.lambda$httpFileLoadError$9(str);
            }
        });
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
    public void artworkLoadError(final String str) {
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.this.lambda$artworkLoadError$10(str);
            }
        });
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
    public void fileDidLoaded(final String str, final File file, final int i) {
        this.imageLoadQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoader.this.lambda$fileDidLoaded$11(str, i, file);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fileDidLoaded$11(String str, int i, File file) {
        ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(str);
        if (thumbGenerateInfo != null && thumbGenerateInfo.parentDocument != null) {
            generateThumb(i, file, thumbGenerateInfo);
            this.waitingForQualityThumb.remove(str);
        }
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        this.imageLoadingByUrl.remove(str);
        this.imageLoadingByUrlPframe.remove(str);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < cacheImage.imageReceiverArray.size(); i2++) {
            String str2 = cacheImage.keys.get(i2);
            String str3 = cacheImage.filters.get(i2);
            int intValue = cacheImage.types.get(i2).intValue();
            ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i2);
            int intValue2 = cacheImage.imageReceiverGuidsArray.get(i2).intValue();
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
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i3);
            if (cacheOutTask.cacheImage.type != 1) {
                this.cacheOutQueue.postRunnable(cacheOutTask, cacheOutTask.cacheImage.priority);
            } else {
                this.cacheThumbOutQueue.postRunnable(cacheOutTask);
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
                ImageLoader.this.lambda$fileDidFailedLoad$12(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fileDidFailedLoad$12(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
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
                ImageLoader.this.lambda$runHttpFileLoadTasks$14(httpFileTask, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runHttpFileLoadTasks$14(HttpFileTask httpFileTask, int i) {
        if (httpFileTask != null) {
            this.currentHttpFileLoadTasksCount--;
        }
        if (httpFileTask != null) {
            if (i == 1) {
                if (!httpFileTask.canRetry) {
                    this.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                    NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidFailedLoad, httpFileTask.url, 0);
                } else {
                    final HttpFileTask httpFileTask2 = new HttpFileTask(httpFileTask.url, httpFileTask.tempFile, httpFileTask.ext, httpFileTask.currentAccount);
                    Runnable runnable = new Runnable() { // from class: org.telegram.messenger.ImageLoader$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ImageLoader.this.lambda$runHttpFileLoadTasks$13(httpFileTask2);
                        }
                    };
                    this.retryHttpsTasks.put(httpFileTask.url, runnable);
                    AndroidUtilities.runOnUIThread(runnable, 1000L);
                }
            } else if (i == 2) {
                this.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                File file = new File(FileLoader.getDirectory(4), Utilities.MD5(httpFileTask.url) + "." + httpFileTask.ext);
                if (!httpFileTask.tempFile.renameTo(file)) {
                    file = httpFileTask.tempFile;
                }
                NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidLoad, httpFileTask.url, file.toString());
            }
        }
        while (this.currentHttpFileLoadTasksCount < 2 && !this.httpFileLoadTasks.isEmpty()) {
            this.httpFileLoadTasks.poll().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            this.currentHttpFileLoadTasksCount++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runHttpFileLoadTasks$13(HttpFileTask httpFileTask) {
        this.httpFileLoadTasks.add(httpFileTask);
        runHttpFileLoadTasks(null, 0);
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

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(27:6|(1:8)(2:159|(2:163|164))|9|10|(1:12)(1:(19:152|153|154|14|(1:16)(1:150)|17|(1:19)|20|(3:22|(2:23|(1:25)(1:26))|27)|28|29|30|(4:34|35|36|37)|45|(9:130|131|132|(5:134|(1:136)(1:142)|137|(1:139)(1:141)|140)|143|(1:145)|50|(2:(1:53)|54)|(3:91|92|(4:94|(1:96)|97|(3:99|100|101)(1:103))(1:104))(1:(6:57|58|(4:60|(1:62)|63|(2:65|66))|68|69|71)(1:90)))|49|50|(0)|(0)(0)))|13|14|(0)(0)|17|(0)|20|(0)|28|29|30|(5:32|34|35|36|37)|45|(1:47)|130|131|132|(0)|143|(0)|50|(0)|(0)(0))|168|10|(0)(0)|13|14|(0)(0)|17|(0)|20|(0)|28|29|30|(0)|45|(0)|130|131|132|(0)|143|(0)|50|(0)|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        if (r9 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if (r9 == null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ff A[Catch: all -> 0x0121, TryCatch #1 {all -> 0x0121, blocks: (B:132:0x00f5, B:134:0x00ff, B:137:0x0110, B:140:0x011d, B:143:0x0123, B:145:0x012d), top: B:131:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x012d A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #1 {all -> 0x0121, blocks: (B:132:0x00f5, B:134:0x00ff, B:137:0x0110, B:140:0x011d, B:143:0x0123, B:145:0x012d), top: B:131:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[Catch: all -> 0x00da, TRY_LEAVE, TryCatch #10 {all -> 0x00da, blocks: (B:30:0x00a7, B:32:0x00b5, B:39:0x00d6, B:45:0x00dc, B:47:0x00e6, B:130:0x00f0), top: B:29:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6 A[Catch: all -> 0x00da, TryCatch #10 {all -> 0x00da, blocks: (B:30:0x00a7, B:32:0x00b5, B:39:0x00d6, B:45:0x00dc, B:47:0x00e6, B:130:0x00f0), top: B:29:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
            Bitmap bitmap = null;
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
                    options.inPurgeable = false;
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
                        if (str2 != null) {
                            if (uri == null) {
                                return null;
                            }
                            try {
                                try {
                                    bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                                    if (bitmap != null) {
                                        if (options.inPurgeable) {
                                            Utilities.pinBitmap(bitmap);
                                        }
                                        Bitmap createBitmap2 = Bitmaps.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                        if (createBitmap2 != bitmap) {
                                            bitmap.recycle();
                                            bitmap = createBitmap2;
                                        }
                                    }
                                } finally {
                                    try {
                                        openInputStream.close();
                                        return bitmap;
                                    } finally {
                                    }
                                }
                                openInputStream.close();
                                return bitmap;
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                return bitmap;
                            }
                        }
                        try {
                            bitmap = BitmapFactory.decodeFile(str2, options);
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                            getInstance().clearMemory();
                            if (bitmap == null) {
                                try {
                                    Bitmap decodeFile = BitmapFactory.decodeFile(str2, options);
                                    if (decodeFile != null) {
                                        try {
                                            if (options.inPurgeable) {
                                                Utilities.pinBitmap(decodeFile);
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bitmap = decodeFile;
                                            FileLog.e(th);
                                            return bitmap;
                                        }
                                    }
                                    bitmap = decodeFile;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                            if (bitmap == null) {
                                return bitmap;
                            }
                            createBitmap = Bitmaps.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                            if (createBitmap == bitmap) {
                                return bitmap;
                            }
                            bitmap.recycle();
                        }
                        if (bitmap == null) {
                            return bitmap;
                        }
                        if (options.inPurgeable) {
                            Utilities.pinBitmap(bitmap);
                        }
                        createBitmap = Bitmaps.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        if (createBitmap == bitmap) {
                            return bitmap;
                        }
                        bitmap.recycle();
                        return createBitmap;
                    }
                    matrix = null;
                    f3 = max / options.inSampleSize;
                    if (f3 > 1.0f) {
                    }
                    if (str2 != null) {
                    }
                } catch (Throwable th6) {
                    FileLog.e(th6);
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
            options.inPurgeable = false;
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
            if (str2 != null) {
            }
        }
        str2 = str;
        Bitmap bitmap2 = null;
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
        options.inPurgeable = false;
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
        if (str2 != null) {
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
        float f3;
        boolean z4;
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
                    f3 = max;
                    z4 = true;
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
            f3 = max2;
            z4 = false;
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
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i < size2) {
                    TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i++;
                }
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i < size3) {
                    TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i++;
                }
            }
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
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
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i < size2) {
                    TLRPC.PhotoSize photoSize2 = messageMedia.document.thumbs.get(i);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i++;
                }
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i < size3) {
                    TLRPC.PhotoSize photoSize3 = messageMedia.webpage.photo.sizes.get(i);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i++;
                }
            }
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (messageMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
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
                        Utilities.blurBitmap(loadBitmap, 3, 1, loadBitmap.getWidth(), loadBitmap.getHeight(), loadBitmap.getRowBytes());
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
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(message.media.document.thumbs, NotificationCenter.wallpaperSettedToUser);
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
                            Utilities.blurBitmap(strippedPhotoBitmap, 3, 1, strippedPhotoBitmap.getWidth(), strippedPhotoBitmap.getHeight(), strippedPhotoBitmap.getRowBytes());
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
