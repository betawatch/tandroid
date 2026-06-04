package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.View;
import java.io.File;
import java.io.FileReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePool;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.LaunchActivity;

/* loaded from: classes5.dex */
public class RLottieDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    public static DispatchQueue lottieCacheGenerateQueue;
    private boolean allowDrawFramesWhileCacheGenerating;
    private boolean allowVibration;
    private boolean applyTransformation;
    private boolean applyingLayerColors;
    NativePtrArgs args;
    protected int autoRepeat;
    protected int autoRepeatCount;
    protected int autoRepeatPlayCount;
    protected long autoRepeatTimeout;
    protected volatile Bitmap backgroundBitmap;
    private Paint[] backgroundPaint;
    BitmapsCache bitmapsCache;
    protected Runnable cacheGenerateTask;
    private boolean createdForFirstFrame;
    protected int currentFrame;
    protected int customEndFrame;
    private boolean decodeSingleFrame;
    protected boolean destroyAfterLoading;
    protected boolean destroyWhenDone;
    protected int diceSwitchFramesCount;
    private boolean doNotRemoveInvalidOnFrameReady;
    private final RectF dstRect;
    private RectF[] dstRectBackground;
    private boolean fallbackCache;
    File file;
    private int finishFrame;
    private boolean forceFrameRedraw;
    protected CountDownLatch frameWaitSync;
    private boolean genCacheSend;
    int generateCacheFramePointer;
    long generateCacheNativePtr;
    boolean generatingCache;
    protected final int height;
    private boolean invalidateOnProgressSet;
    protected int isDice;
    private boolean isInvalid;
    protected volatile boolean isRecycled;
    protected volatile boolean isRunning;
    private long lastFrameTime;
    protected Runnable loadFrameRunnable;
    protected Runnable loadFrameTask;
    protected boolean loadingInBackground;
    private View masterParent;
    protected final int[] metaData;
    protected volatile long nativePtr;
    private boolean needScale;
    private HashMap newColorUpdates;
    private int[] newReplaceColors;
    protected volatile boolean nextFrameIsLast;
    protected volatile Bitmap nextRenderingBitmap;
    private Runnable onAnimationEndListener;
    protected WeakReference onFinishCallback;
    private Runnable onFrameReadyRunnable;
    private final ArrayList parentViews;
    private volatile HashMap pendingColorUpdates;
    private int[] pendingReplaceColors;
    protected boolean playInDirectionOfCustomEndFrame;
    boolean precache;
    private Bitmap rawBackgroundBitmap;
    private int rawBackgroundBitmapFrame;
    protected volatile Bitmap renderingBitmap;
    private boolean resetVibrationAfterRestart;
    public boolean scaleByCanvas;
    private float scaleX;
    private float scaleY;
    protected int secondFramesCount;
    protected boolean secondLoadingInBackground;
    protected volatile long secondNativePtr;
    protected volatile boolean setLastFrame;
    public boolean shouldLimitFps;
    private boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    public Rect srcRect;
    protected int timeBetweenFrames;
    protected Runnable uiRunnable;
    private Runnable uiRunnableCacheFinished;
    private Runnable uiRunnableGenerateCache;
    protected Runnable uiRunnableNoFrame;
    private HashMap vibrationPattern;
    protected boolean waitingForNextTask;
    public Runnable whenCacheDone;
    protected final int width;
    protected static final Handler uiHandler = new Handler(Looper.getMainLooper());
    private static final DispatchQueuePool loadFrameRunnableQueue = new DispatchQueuePool(4);

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    class 3 implements Runnable {
        3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RLottieDrawable.this.isRecycled) {
                return;
            }
            RLottieDrawable rLottieDrawable = RLottieDrawable.this;
            if (rLottieDrawable.destroyWhenDone || !rLottieDrawable.canLoadFrames()) {
                return;
            }
            RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
            if (rLottieDrawable2.cacheGenerateTask == null) {
                rLottieDrawable2.generatingCache = true;
                if (RLottieDrawable.lottieCacheGenerateQueue == null) {
                    RLottieDrawable.createCacheGenQueue();
                }
                BitmapsCache.incrementTaskCounter();
                DispatchQueue dispatchQueue = RLottieDrawable.lottieCacheGenerateQueue;
                RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RLottieDrawable.3.this.lambda$run$0();
                    }
                };
                rLottieDrawable3.cacheGenerateTask = runnable;
                dispatchQueue.postRunnable(runnable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            try {
                BitmapsCache bitmapsCache = RLottieDrawable.this.bitmapsCache;
                if (bitmapsCache != null) {
                    bitmapsCache.createCache();
                }
            } catch (Throwable unused) {
            }
            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableCacheFinished);
        }
    }

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new DispatchQueue("cache generator queue");
    }

    protected void checkRunningTasks() {
        Runnable runnable = this.cacheGenerateTask;
        if (runnable != null) {
            lottieCacheGenerateQueue.cancelRunnable(runnable);
            BitmapsCache.decrementTaskCounter();
            this.cacheGenerateTask = null;
        }
        if (hasParentView() || this.nextRenderingBitmap == null || this.loadFrameTask == null) {
            return;
        }
        this.loadFrameTask = null;
        this.nextRenderingBitmap = null;
    }

    protected void decodeFrameFinishedInternal() {
        if (this.destroyWhenDone) {
            checkRunningTasks();
            if (this.loadFrameTask == null && this.cacheGenerateTask == null && this.nativePtr != 0) {
                recycleNativePtr(true);
            }
        }
        if ((this.nativePtr == 0 || this.fallbackCache) && this.secondNativePtr == 0 && this.bitmapsCache == null) {
            recycleResources();
            return;
        }
        this.waitingForNextTask = true;
        if (!hasParentView()) {
            stop();
        }
        if (this.isRunning) {
            scheduleNextGetFrame();
        }
    }

    private void recycleNativePtr(boolean z) {
        final long j = this.nativePtr;
        final long j2 = this.secondNativePtr;
        this.nativePtr = 0L;
        this.secondNativePtr = 0L;
        if (j == 0 && j2 == 0) {
            return;
        }
        if (z) {
            DispatchQueuePoolBackground.execute(new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    RLottieDrawable.lambda$recycleNativePtr$0(j, j2);
                }
            });
        } else {
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    RLottieDrawable.lambda$recycleNativePtr$1(j, j2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$recycleNativePtr$0(long j, long j2) {
        if (j != 0) {
            RLottieNative.destroy(j);
        }
        if (j2 != 0) {
            RLottieNative.destroy(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$recycleNativePtr$1(long j, long j2) {
        if (j != 0) {
            RLottieNative.destroy(j);
        }
        if (j2 != 0) {
            RLottieNative.destroy(j2);
        }
    }

    protected void recycleResources() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.renderingBitmap);
        arrayList.add(this.backgroundBitmap);
        arrayList.add(this.nextRenderingBitmap);
        this.nextRenderingBitmap = null;
        this.renderingBitmap = null;
        this.backgroundBitmap = null;
        AndroidUtilities.recycleBitmaps(arrayList);
        if (this.onAnimationEndListener != null) {
            this.onAnimationEndListener = null;
        }
    }

    public void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.onFinishCallback = new WeakReference(runnable);
            this.finishFrame = i;
        } else if (this.onFinishCallback != null) {
            this.onFinishCallback = null;
        }
    }

    public RLottieDrawable(File file, int i, int i2, BitmapsCache.CacheOptions cacheOptions, boolean z, int[] iArr, int i3) {
        char c;
        int[] iArr2;
        int[] iArr3 = new int[3];
        this.metaData = iArr3;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.parentViews = new ArrayList();
        this.diceSwitchFramesCount = -1;
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.1
            @Override // java.lang.Runnable
            public void run() {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.2
            @Override // java.lang.Runnable
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnableGenerateCache = new 3();
        this.uiRunnableCacheFinished = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.4
            @Override // java.lang.Runnable
            public void run() {
                if (RLottieDrawable.this.cacheGenerateTask != null) {
                    BitmapsCache.decrementTaskCounter();
                    RLottieDrawable.this.cacheGenerateTask = null;
                }
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.generatingCache = false;
                rLottieDrawable.decodeFrameFinishedInternal();
                Runnable runnable = RLottieDrawable.this.whenCacheDone;
                if (runnable != null) {
                    runnable.run();
                    RLottieDrawable.this.whenCacheDone = null;
                }
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.5
            private long lastUpdate = 0;

            /* JADX WARN: Removed duplicated region for block: B:18:0x02ba  */
            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x013c A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0154 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x019c A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                boolean z2;
                long j;
                int frame;
                BitmapsCache bitmapsCache;
                BitmapsCache bitmapsCache2;
                CountDownLatch countDownLatch;
                if (RLottieDrawable.this.isRecycled) {
                    return;
                }
                if (RLottieDrawable.this.canLoadFrames()) {
                    RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                    if (rLottieDrawable.isDice != 2 || rLottieDrawable.secondNativePtr != 0) {
                        if (RLottieDrawable.this.backgroundBitmap == null) {
                            try {
                                RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                                rLottieDrawable2.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable2.width, rLottieDrawable2.height, Bitmap.Config.ARGB_8888);
                                z2 = false;
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                            if (RLottieDrawable.this.backgroundBitmap != null) {
                                try {
                                    if (!RLottieDrawable.this.pendingColorUpdates.isEmpty()) {
                                        for (Map.Entry entry : RLottieDrawable.this.pendingColorUpdates.entrySet()) {
                                            RLottieNative.setLayerColor(RLottieDrawable.this.nativePtr, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                        }
                                        RLottieDrawable.this.pendingColorUpdates.clear();
                                    }
                                } catch (Exception unused) {
                                }
                                if (RLottieDrawable.this.pendingReplaceColors != null && RLottieDrawable.this.nativePtr != 0) {
                                    RLottieNative.replaceColors(RLottieDrawable.this.nativePtr, RLottieDrawable.this.pendingReplaceColors);
                                    RLottieDrawable.this.pendingReplaceColors = null;
                                }
                                try {
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    int i4 = rLottieDrawable3.isDice;
                                    if (i4 == 1) {
                                        j = rLottieDrawable3.nativePtr;
                                    } else if (i4 == 2) {
                                        j = rLottieDrawable3.secondNativePtr;
                                        if (RLottieDrawable.this.setLastFrame) {
                                            RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                            rLottieDrawable4.currentFrame = rLottieDrawable4.secondFramesCount - 1;
                                        }
                                    } else {
                                        j = rLottieDrawable3.nativePtr;
                                    }
                                    int i5 = RLottieDrawable.this.shouldLimitFps ? 2 : 1;
                                    System.currentTimeMillis();
                                    RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                    if (rLottieDrawable5.precache && (bitmapsCache2 = rLottieDrawable5.bitmapsCache) != null) {
                                        try {
                                            frame = bitmapsCache2.getFrame(rLottieDrawable5.currentFrame / i5, rLottieDrawable5.backgroundBitmap);
                                        } catch (Exception e) {
                                            e = e;
                                            frame = 0;
                                        }
                                        try {
                                            if (!RLottieDrawable.this.bitmapsCache.needGenCache() && RLottieDrawable.this.allowDrawFramesWhileCacheGenerating && RLottieDrawable.this.nativePtr != 0) {
                                                RLottieNative.destroy(RLottieDrawable.this.nativePtr);
                                                RLottieDrawable.this.nativePtr = 0L;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            FileLog.e(e);
                                            bitmapsCache = RLottieDrawable.this.bitmapsCache;
                                            if (bitmapsCache != null) {
                                                if (!RLottieDrawable.this.genCacheSend) {
                                                }
                                                if (RLottieDrawable.this.allowDrawFramesWhileCacheGenerating) {
                                                }
                                            }
                                            if (frame != -1) {
                                            }
                                        }
                                    } else {
                                        frame = RLottieNative.getFrame(j, rLottieDrawable5.currentFrame, rLottieDrawable5.backgroundBitmap, z2);
                                    }
                                    bitmapsCache = RLottieDrawable.this.bitmapsCache;
                                    if (bitmapsCache != null && bitmapsCache.needGenCache()) {
                                        if (!RLottieDrawable.this.genCacheSend) {
                                            RLottieDrawable.this.genCacheSend = true;
                                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableGenerateCache);
                                        }
                                        if (RLottieDrawable.this.allowDrawFramesWhileCacheGenerating) {
                                            frame = -1;
                                        } else {
                                            if (RLottieDrawable.this.nativePtr == 0) {
                                                RLottieDrawable rLottieDrawable6 = RLottieDrawable.this;
                                                String file2 = rLottieDrawable6.args.file.toString();
                                                RLottieDrawable rLottieDrawable7 = RLottieDrawable.this;
                                                NativePtrArgs nativePtrArgs = rLottieDrawable7.args;
                                                rLottieDrawable6.nativePtr = RLottieNative.create(file2, nativePtrArgs.json, rLottieDrawable7.width, rLottieDrawable7.height, new int[3], false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier);
                                            }
                                            long j2 = RLottieDrawable.this.nativePtr;
                                            RLottieDrawable rLottieDrawable8 = RLottieDrawable.this;
                                            frame = RLottieNative.getFrame(j2, rLottieDrawable8.currentFrame, rLottieDrawable8.backgroundBitmap, z2);
                                        }
                                    }
                                    if (frame != -1) {
                                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                                        CountDownLatch countDownLatch2 = RLottieDrawable.this.frameWaitSync;
                                        if (countDownLatch2 != null) {
                                            countDownLatch2.countDown();
                                            return;
                                        }
                                        return;
                                    }
                                    RLottieDrawable rLottieDrawable9 = RLottieDrawable.this;
                                    rLottieDrawable9.nextRenderingBitmap = rLottieDrawable9.backgroundBitmap;
                                    RLottieDrawable rLottieDrawable10 = RLottieDrawable.this;
                                    int i6 = rLottieDrawable10.isDice;
                                    if (i6 == 1) {
                                        int i7 = rLottieDrawable10.currentFrame + i5;
                                        int i8 = rLottieDrawable10.diceSwitchFramesCount;
                                        if (i8 == -1) {
                                            i8 = rLottieDrawable10.metaData[0];
                                        }
                                        if (i7 < i8) {
                                            rLottieDrawable10.currentFrame = i7;
                                        } else {
                                            rLottieDrawable10.currentFrame = 0;
                                            rLottieDrawable10.nextFrameIsLast = false;
                                            if (RLottieDrawable.this.secondNativePtr != 0) {
                                                RLottieDrawable.this.isDice = 2;
                                            }
                                            if (RLottieDrawable.this.resetVibrationAfterRestart) {
                                                RLottieDrawable.this.vibrationPattern = null;
                                                RLottieDrawable.this.resetVibrationAfterRestart = false;
                                            }
                                        }
                                    } else if (i6 == 2) {
                                        int i9 = rLottieDrawable10.currentFrame + i5;
                                        if (i9 < rLottieDrawable10.secondFramesCount) {
                                            rLottieDrawable10.currentFrame = i9;
                                        } else {
                                            rLottieDrawable10.nextFrameIsLast = true;
                                            RLottieDrawable.this.autoRepeatPlayCount++;
                                        }
                                    } else {
                                        int i10 = rLottieDrawable10.customEndFrame;
                                        if (i10 >= 0 && rLottieDrawable10.playInDirectionOfCustomEndFrame) {
                                            int i11 = rLottieDrawable10.currentFrame;
                                            if (i11 > i10) {
                                                int i12 = i11 - i5;
                                                if (i12 >= i10) {
                                                    rLottieDrawable10.currentFrame = i12;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else {
                                                int i13 = i11 + i5;
                                                if (i13 < i10) {
                                                    rLottieDrawable10.currentFrame = i13;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            }
                                        } else {
                                            int i14 = rLottieDrawable10.currentFrame + i5;
                                            if (i10 < 0) {
                                                i10 = rLottieDrawable10.metaData[0];
                                            }
                                            if (i14 < i10) {
                                                if (rLottieDrawable10.autoRepeat == 3) {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.autoRepeatPlayCount++;
                                                } else {
                                                    rLottieDrawable10.currentFrame = i14;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                }
                                            } else {
                                                int i15 = rLottieDrawable10.autoRepeat;
                                                if (i15 == 1) {
                                                    rLottieDrawable10.currentFrame = 0;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                    if (RLottieDrawable.this.resetVibrationAfterRestart) {
                                                        RLottieDrawable.this.vibrationPattern = null;
                                                        RLottieDrawable.this.resetVibrationAfterRestart = false;
                                                    }
                                                    RLottieDrawable rLottieDrawable11 = RLottieDrawable.this;
                                                    int i16 = rLottieDrawable11.autoRepeatCount;
                                                    if (i16 > 0) {
                                                        rLottieDrawable11.autoRepeatCount = i16 - 1;
                                                    }
                                                } else if (i15 == 2) {
                                                    rLottieDrawable10.currentFrame = 0;
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable rLottieDrawable12 = RLottieDrawable.this;
                                                    rLottieDrawable12.autoRepeatPlayCount++;
                                                    if (rLottieDrawable12.resetVibrationAfterRestart) {
                                                        RLottieDrawable.this.vibrationPattern = null;
                                                        RLottieDrawable.this.resetVibrationAfterRestart = false;
                                                    }
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    FileLog.e(e3);
                                }
                            }
                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                            countDownLatch = RLottieDrawable.this.frameWaitSync;
                            if (countDownLatch == null) {
                                countDownLatch.countDown();
                                return;
                            }
                            return;
                        }
                        z2 = true;
                        if (RLottieDrawable.this.backgroundBitmap != null) {
                        }
                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                        countDownLatch = RLottieDrawable.this.frameWaitSync;
                        if (countDownLatch == null) {
                        }
                    }
                }
                CountDownLatch countDownLatch3 = RLottieDrawable.this.frameWaitSync;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
            }
        };
        this.srcRect = new Rect();
        this.rawBackgroundBitmapFrame = -1;
        this.width = i;
        this.height = i2;
        this.shouldLimitFps = z;
        this.precache = cacheOptions != null;
        this.fallbackCache = cacheOptions != null && cacheOptions.fallback;
        this.createdForFirstFrame = cacheOptions != null && cacheOptions.firstFrame;
        getPaint().setFlags(2);
        this.file = file;
        if (this.precache && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.precache) {
            NativePtrArgs nativePtrArgs = new NativePtrArgs();
            this.args = nativePtrArgs;
            nativePtrArgs.file = file.getAbsoluteFile();
            NativePtrArgs nativePtrArgs2 = this.args;
            nativePtrArgs2.json = null;
            nativePtrArgs2.colorReplacement = iArr;
            nativePtrArgs2.fitzModifier = i3;
            if (this.createdForFirstFrame) {
                return;
            }
            parseLottieMetadata(file, null, iArr3);
            if (this.shouldLimitFps && iArr3[1] < 60) {
                this.shouldLimitFps = false;
            }
            this.bitmapsCache = new BitmapsCache(file, this, cacheOptions, i, i2, !z);
            iArr2 = iArr3;
            c = 1;
        } else {
            c = 1;
            iArr2 = iArr3;
            this.nativePtr = RLottieNative.create(file.getAbsolutePath(), null, i, i2, iArr3, this.precache, iArr, this.shouldLimitFps, i3);
            if (this.nativePtr == 0) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (this.shouldLimitFps && iArr2[1] < 60) {
                this.shouldLimitFps = false;
            }
        }
        this.timeBetweenFrames = Math.max(this.shouldLimitFps ? 33 : 16, (int) (1000.0f / iArr2[c]));
    }

    public RLottieDrawable(File file, String str, int i, int i2, BitmapsCache.CacheOptions cacheOptions, boolean z, int[] iArr, int i3) {
        char c;
        int[] iArr2;
        int[] iArr3 = new int[3];
        this.metaData = iArr3;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.parentViews = new ArrayList();
        this.diceSwitchFramesCount = -1;
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.1
            @Override // java.lang.Runnable
            public void run() {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.2
            @Override // java.lang.Runnable
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnableGenerateCache = new 3();
        this.uiRunnableCacheFinished = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.4
            @Override // java.lang.Runnable
            public void run() {
                if (RLottieDrawable.this.cacheGenerateTask != null) {
                    BitmapsCache.decrementTaskCounter();
                    RLottieDrawable.this.cacheGenerateTask = null;
                }
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.generatingCache = false;
                rLottieDrawable.decodeFrameFinishedInternal();
                Runnable runnable = RLottieDrawable.this.whenCacheDone;
                if (runnable != null) {
                    runnable.run();
                    RLottieDrawable.this.whenCacheDone = null;
                }
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.5
            private long lastUpdate = 0;

            /* JADX WARN: Removed duplicated region for block: B:18:0x02ba  */
            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x013c A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0154 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x019c A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                boolean z2;
                long j;
                int frame;
                BitmapsCache bitmapsCache;
                BitmapsCache bitmapsCache2;
                CountDownLatch countDownLatch;
                if (RLottieDrawable.this.isRecycled) {
                    return;
                }
                if (RLottieDrawable.this.canLoadFrames()) {
                    RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                    if (rLottieDrawable.isDice != 2 || rLottieDrawable.secondNativePtr != 0) {
                        if (RLottieDrawable.this.backgroundBitmap == null) {
                            try {
                                RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                                rLottieDrawable2.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable2.width, rLottieDrawable2.height, Bitmap.Config.ARGB_8888);
                                z2 = false;
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                            if (RLottieDrawable.this.backgroundBitmap != null) {
                                try {
                                    if (!RLottieDrawable.this.pendingColorUpdates.isEmpty()) {
                                        for (Map.Entry entry : RLottieDrawable.this.pendingColorUpdates.entrySet()) {
                                            RLottieNative.setLayerColor(RLottieDrawable.this.nativePtr, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                        }
                                        RLottieDrawable.this.pendingColorUpdates.clear();
                                    }
                                } catch (Exception unused) {
                                }
                                if (RLottieDrawable.this.pendingReplaceColors != null && RLottieDrawable.this.nativePtr != 0) {
                                    RLottieNative.replaceColors(RLottieDrawable.this.nativePtr, RLottieDrawable.this.pendingReplaceColors);
                                    RLottieDrawable.this.pendingReplaceColors = null;
                                }
                                try {
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    int i4 = rLottieDrawable3.isDice;
                                    if (i4 == 1) {
                                        j = rLottieDrawable3.nativePtr;
                                    } else if (i4 == 2) {
                                        j = rLottieDrawable3.secondNativePtr;
                                        if (RLottieDrawable.this.setLastFrame) {
                                            RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                            rLottieDrawable4.currentFrame = rLottieDrawable4.secondFramesCount - 1;
                                        }
                                    } else {
                                        j = rLottieDrawable3.nativePtr;
                                    }
                                    int i5 = RLottieDrawable.this.shouldLimitFps ? 2 : 1;
                                    System.currentTimeMillis();
                                    RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                    if (rLottieDrawable5.precache && (bitmapsCache2 = rLottieDrawable5.bitmapsCache) != null) {
                                        try {
                                            frame = bitmapsCache2.getFrame(rLottieDrawable5.currentFrame / i5, rLottieDrawable5.backgroundBitmap);
                                        } catch (Exception e) {
                                            e = e;
                                            frame = 0;
                                        }
                                        try {
                                            if (!RLottieDrawable.this.bitmapsCache.needGenCache() && RLottieDrawable.this.allowDrawFramesWhileCacheGenerating && RLottieDrawable.this.nativePtr != 0) {
                                                RLottieNative.destroy(RLottieDrawable.this.nativePtr);
                                                RLottieDrawable.this.nativePtr = 0L;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            FileLog.e(e);
                                            bitmapsCache = RLottieDrawable.this.bitmapsCache;
                                            if (bitmapsCache != null) {
                                                if (!RLottieDrawable.this.genCacheSend) {
                                                }
                                                if (RLottieDrawable.this.allowDrawFramesWhileCacheGenerating) {
                                                }
                                            }
                                            if (frame != -1) {
                                            }
                                        }
                                    } else {
                                        frame = RLottieNative.getFrame(j, rLottieDrawable5.currentFrame, rLottieDrawable5.backgroundBitmap, z2);
                                    }
                                    bitmapsCache = RLottieDrawable.this.bitmapsCache;
                                    if (bitmapsCache != null && bitmapsCache.needGenCache()) {
                                        if (!RLottieDrawable.this.genCacheSend) {
                                            RLottieDrawable.this.genCacheSend = true;
                                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableGenerateCache);
                                        }
                                        if (RLottieDrawable.this.allowDrawFramesWhileCacheGenerating) {
                                            frame = -1;
                                        } else {
                                            if (RLottieDrawable.this.nativePtr == 0) {
                                                RLottieDrawable rLottieDrawable6 = RLottieDrawable.this;
                                                String file2 = rLottieDrawable6.args.file.toString();
                                                RLottieDrawable rLottieDrawable7 = RLottieDrawable.this;
                                                NativePtrArgs nativePtrArgs = rLottieDrawable7.args;
                                                rLottieDrawable6.nativePtr = RLottieNative.create(file2, nativePtrArgs.json, rLottieDrawable7.width, rLottieDrawable7.height, new int[3], false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier);
                                            }
                                            long j2 = RLottieDrawable.this.nativePtr;
                                            RLottieDrawable rLottieDrawable8 = RLottieDrawable.this;
                                            frame = RLottieNative.getFrame(j2, rLottieDrawable8.currentFrame, rLottieDrawable8.backgroundBitmap, z2);
                                        }
                                    }
                                    if (frame != -1) {
                                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                                        CountDownLatch countDownLatch2 = RLottieDrawable.this.frameWaitSync;
                                        if (countDownLatch2 != null) {
                                            countDownLatch2.countDown();
                                            return;
                                        }
                                        return;
                                    }
                                    RLottieDrawable rLottieDrawable9 = RLottieDrawable.this;
                                    rLottieDrawable9.nextRenderingBitmap = rLottieDrawable9.backgroundBitmap;
                                    RLottieDrawable rLottieDrawable10 = RLottieDrawable.this;
                                    int i6 = rLottieDrawable10.isDice;
                                    if (i6 == 1) {
                                        int i7 = rLottieDrawable10.currentFrame + i5;
                                        int i8 = rLottieDrawable10.diceSwitchFramesCount;
                                        if (i8 == -1) {
                                            i8 = rLottieDrawable10.metaData[0];
                                        }
                                        if (i7 < i8) {
                                            rLottieDrawable10.currentFrame = i7;
                                        } else {
                                            rLottieDrawable10.currentFrame = 0;
                                            rLottieDrawable10.nextFrameIsLast = false;
                                            if (RLottieDrawable.this.secondNativePtr != 0) {
                                                RLottieDrawable.this.isDice = 2;
                                            }
                                            if (RLottieDrawable.this.resetVibrationAfterRestart) {
                                                RLottieDrawable.this.vibrationPattern = null;
                                                RLottieDrawable.this.resetVibrationAfterRestart = false;
                                            }
                                        }
                                    } else if (i6 == 2) {
                                        int i9 = rLottieDrawable10.currentFrame + i5;
                                        if (i9 < rLottieDrawable10.secondFramesCount) {
                                            rLottieDrawable10.currentFrame = i9;
                                        } else {
                                            rLottieDrawable10.nextFrameIsLast = true;
                                            RLottieDrawable.this.autoRepeatPlayCount++;
                                        }
                                    } else {
                                        int i10 = rLottieDrawable10.customEndFrame;
                                        if (i10 >= 0 && rLottieDrawable10.playInDirectionOfCustomEndFrame) {
                                            int i11 = rLottieDrawable10.currentFrame;
                                            if (i11 > i10) {
                                                int i12 = i11 - i5;
                                                if (i12 >= i10) {
                                                    rLottieDrawable10.currentFrame = i12;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else {
                                                int i13 = i11 + i5;
                                                if (i13 < i10) {
                                                    rLottieDrawable10.currentFrame = i13;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            }
                                        } else {
                                            int i14 = rLottieDrawable10.currentFrame + i5;
                                            if (i10 < 0) {
                                                i10 = rLottieDrawable10.metaData[0];
                                            }
                                            if (i14 < i10) {
                                                if (rLottieDrawable10.autoRepeat == 3) {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.autoRepeatPlayCount++;
                                                } else {
                                                    rLottieDrawable10.currentFrame = i14;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                }
                                            } else {
                                                int i15 = rLottieDrawable10.autoRepeat;
                                                if (i15 == 1) {
                                                    rLottieDrawable10.currentFrame = 0;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                    if (RLottieDrawable.this.resetVibrationAfterRestart) {
                                                        RLottieDrawable.this.vibrationPattern = null;
                                                        RLottieDrawable.this.resetVibrationAfterRestart = false;
                                                    }
                                                    RLottieDrawable rLottieDrawable11 = RLottieDrawable.this;
                                                    int i16 = rLottieDrawable11.autoRepeatCount;
                                                    if (i16 > 0) {
                                                        rLottieDrawable11.autoRepeatCount = i16 - 1;
                                                    }
                                                } else if (i15 == 2) {
                                                    rLottieDrawable10.currentFrame = 0;
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable rLottieDrawable12 = RLottieDrawable.this;
                                                    rLottieDrawable12.autoRepeatPlayCount++;
                                                    if (rLottieDrawable12.resetVibrationAfterRestart) {
                                                        RLottieDrawable.this.vibrationPattern = null;
                                                        RLottieDrawable.this.resetVibrationAfterRestart = false;
                                                    }
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    FileLog.e(e3);
                                }
                            }
                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                            countDownLatch = RLottieDrawable.this.frameWaitSync;
                            if (countDownLatch == null) {
                                countDownLatch.countDown();
                                return;
                            }
                            return;
                        }
                        z2 = true;
                        if (RLottieDrawable.this.backgroundBitmap != null) {
                        }
                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                        countDownLatch = RLottieDrawable.this.frameWaitSync;
                        if (countDownLatch == null) {
                        }
                    }
                }
                CountDownLatch countDownLatch3 = RLottieDrawable.this.frameWaitSync;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
            }
        };
        this.srcRect = new Rect();
        this.rawBackgroundBitmapFrame = -1;
        this.width = i;
        this.height = i2;
        this.shouldLimitFps = z;
        this.precache = cacheOptions != null;
        this.createdForFirstFrame = cacheOptions != null && cacheOptions.firstFrame;
        getPaint().setFlags(2);
        if (this.precache && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.precache) {
            NativePtrArgs nativePtrArgs = new NativePtrArgs();
            this.args = nativePtrArgs;
            nativePtrArgs.file = file.getAbsoluteFile();
            NativePtrArgs nativePtrArgs2 = this.args;
            nativePtrArgs2.json = str;
            nativePtrArgs2.colorReplacement = iArr;
            nativePtrArgs2.fitzModifier = i3;
            if (this.createdForFirstFrame) {
                return;
            }
            parseLottieMetadata(file, str, iArr3);
            if (this.shouldLimitFps && iArr3[1] < 60) {
                this.shouldLimitFps = false;
            }
            this.bitmapsCache = new BitmapsCache(file, this, cacheOptions, i, i2, !z);
            iArr2 = iArr3;
            c = 1;
        } else {
            c = 1;
            iArr2 = iArr3;
            this.nativePtr = RLottieNative.create(file.getAbsolutePath(), str, i, i2, iArr3, this.precache, iArr, this.shouldLimitFps, i3);
            if (this.nativePtr == 0) {
                FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (this.shouldLimitFps && iArr2[1] < 60) {
                this.shouldLimitFps = false;
            }
        }
        this.timeBetweenFrames = Math.max(this.shouldLimitFps ? 33 : 16, (int) (1000.0f / iArr2[c]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseLottieMetadata(File file, String str, int[] iArr) {
        char c;
        try {
            JsonReader jsonReader = new JsonReader(new FileReader(file.getAbsoluteFile()));
            try {
                jsonReader.beginObject();
                double d = 30.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode == 3276) {
                        if (nextName.equals("fr")) {
                            c = 2;
                            if (c != 0) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    } else if (hashCode != 3367) {
                        if (hashCode == 3553 && nextName.equals("op")) {
                            c = 1;
                            if (c != 0) {
                                d3 = jsonReader.nextDouble();
                            } else if (c == 1) {
                                d2 = jsonReader.nextDouble();
                            } else if (c == 2) {
                                d = jsonReader.nextDouble();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    } else {
                        if (nextName.equals("ip")) {
                            c = 0;
                            if (c != 0) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                iArr[0] = (int) (d2 - d3);
                iArr[1] = (int) d;
            } finally {
            }
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            String absolutePath = file.getAbsolutePath();
            int i = this.width;
            int i2 = this.height;
            NativePtrArgs nativePtrArgs = this.args;
            long create = RLottieNative.create(absolutePath, str, i, i2, iArr, false, nativePtrArgs.colorReplacement, this.shouldLimitFps, nativePtrArgs.fitzModifier);
            if (create != 0) {
                RLottieNative.destroy(create);
            }
        }
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, null);
    }

    public RLottieDrawable(String str, int i, int i2) {
        String readRes;
        int[] iArr = new int[3];
        this.metaData = iArr;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.parentViews = new ArrayList();
        this.diceSwitchFramesCount = -1;
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.1
            @Override // java.lang.Runnable
            public void run() {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.2
            @Override // java.lang.Runnable
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnableGenerateCache = new 3();
        this.uiRunnableCacheFinished = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.4
            @Override // java.lang.Runnable
            public void run() {
                if (RLottieDrawable.this.cacheGenerateTask != null) {
                    BitmapsCache.decrementTaskCounter();
                    RLottieDrawable.this.cacheGenerateTask = null;
                }
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.generatingCache = false;
                rLottieDrawable.decodeFrameFinishedInternal();
                Runnable runnable = RLottieDrawable.this.whenCacheDone;
                if (runnable != null) {
                    runnable.run();
                    RLottieDrawable.this.whenCacheDone = null;
                }
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.5
            private long lastUpdate = 0;

            /* JADX WARN: Removed duplicated region for block: B:18:0x02ba  */
            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x013c A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0154 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x019c A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                boolean z2;
                long j;
                int frame;
                BitmapsCache bitmapsCache;
                BitmapsCache bitmapsCache2;
                CountDownLatch countDownLatch;
                if (RLottieDrawable.this.isRecycled) {
                    return;
                }
                if (RLottieDrawable.this.canLoadFrames()) {
                    RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                    if (rLottieDrawable.isDice != 2 || rLottieDrawable.secondNativePtr != 0) {
                        if (RLottieDrawable.this.backgroundBitmap == null) {
                            try {
                                RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                                rLottieDrawable2.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable2.width, rLottieDrawable2.height, Bitmap.Config.ARGB_8888);
                                z2 = false;
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                            if (RLottieDrawable.this.backgroundBitmap != null) {
                                try {
                                    if (!RLottieDrawable.this.pendingColorUpdates.isEmpty()) {
                                        for (Map.Entry entry : RLottieDrawable.this.pendingColorUpdates.entrySet()) {
                                            RLottieNative.setLayerColor(RLottieDrawable.this.nativePtr, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                        }
                                        RLottieDrawable.this.pendingColorUpdates.clear();
                                    }
                                } catch (Exception unused) {
                                }
                                if (RLottieDrawable.this.pendingReplaceColors != null && RLottieDrawable.this.nativePtr != 0) {
                                    RLottieNative.replaceColors(RLottieDrawable.this.nativePtr, RLottieDrawable.this.pendingReplaceColors);
                                    RLottieDrawable.this.pendingReplaceColors = null;
                                }
                                try {
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    int i4 = rLottieDrawable3.isDice;
                                    if (i4 == 1) {
                                        j = rLottieDrawable3.nativePtr;
                                    } else if (i4 == 2) {
                                        j = rLottieDrawable3.secondNativePtr;
                                        if (RLottieDrawable.this.setLastFrame) {
                                            RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                            rLottieDrawable4.currentFrame = rLottieDrawable4.secondFramesCount - 1;
                                        }
                                    } else {
                                        j = rLottieDrawable3.nativePtr;
                                    }
                                    int i5 = RLottieDrawable.this.shouldLimitFps ? 2 : 1;
                                    System.currentTimeMillis();
                                    RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                    if (rLottieDrawable5.precache && (bitmapsCache2 = rLottieDrawable5.bitmapsCache) != null) {
                                        try {
                                            frame = bitmapsCache2.getFrame(rLottieDrawable5.currentFrame / i5, rLottieDrawable5.backgroundBitmap);
                                        } catch (Exception e) {
                                            e = e;
                                            frame = 0;
                                        }
                                        try {
                                            if (!RLottieDrawable.this.bitmapsCache.needGenCache() && RLottieDrawable.this.allowDrawFramesWhileCacheGenerating && RLottieDrawable.this.nativePtr != 0) {
                                                RLottieNative.destroy(RLottieDrawable.this.nativePtr);
                                                RLottieDrawable.this.nativePtr = 0L;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            FileLog.e(e);
                                            bitmapsCache = RLottieDrawable.this.bitmapsCache;
                                            if (bitmapsCache != null) {
                                                if (!RLottieDrawable.this.genCacheSend) {
                                                }
                                                if (RLottieDrawable.this.allowDrawFramesWhileCacheGenerating) {
                                                }
                                            }
                                            if (frame != -1) {
                                            }
                                        }
                                    } else {
                                        frame = RLottieNative.getFrame(j, rLottieDrawable5.currentFrame, rLottieDrawable5.backgroundBitmap, z2);
                                    }
                                    bitmapsCache = RLottieDrawable.this.bitmapsCache;
                                    if (bitmapsCache != null && bitmapsCache.needGenCache()) {
                                        if (!RLottieDrawable.this.genCacheSend) {
                                            RLottieDrawable.this.genCacheSend = true;
                                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableGenerateCache);
                                        }
                                        if (RLottieDrawable.this.allowDrawFramesWhileCacheGenerating) {
                                            frame = -1;
                                        } else {
                                            if (RLottieDrawable.this.nativePtr == 0) {
                                                RLottieDrawable rLottieDrawable6 = RLottieDrawable.this;
                                                String file2 = rLottieDrawable6.args.file.toString();
                                                RLottieDrawable rLottieDrawable7 = RLottieDrawable.this;
                                                NativePtrArgs nativePtrArgs = rLottieDrawable7.args;
                                                rLottieDrawable6.nativePtr = RLottieNative.create(file2, nativePtrArgs.json, rLottieDrawable7.width, rLottieDrawable7.height, new int[3], false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier);
                                            }
                                            long j2 = RLottieDrawable.this.nativePtr;
                                            RLottieDrawable rLottieDrawable8 = RLottieDrawable.this;
                                            frame = RLottieNative.getFrame(j2, rLottieDrawable8.currentFrame, rLottieDrawable8.backgroundBitmap, z2);
                                        }
                                    }
                                    if (frame != -1) {
                                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                                        CountDownLatch countDownLatch2 = RLottieDrawable.this.frameWaitSync;
                                        if (countDownLatch2 != null) {
                                            countDownLatch2.countDown();
                                            return;
                                        }
                                        return;
                                    }
                                    RLottieDrawable rLottieDrawable9 = RLottieDrawable.this;
                                    rLottieDrawable9.nextRenderingBitmap = rLottieDrawable9.backgroundBitmap;
                                    RLottieDrawable rLottieDrawable10 = RLottieDrawable.this;
                                    int i6 = rLottieDrawable10.isDice;
                                    if (i6 == 1) {
                                        int i7 = rLottieDrawable10.currentFrame + i5;
                                        int i8 = rLottieDrawable10.diceSwitchFramesCount;
                                        if (i8 == -1) {
                                            i8 = rLottieDrawable10.metaData[0];
                                        }
                                        if (i7 < i8) {
                                            rLottieDrawable10.currentFrame = i7;
                                        } else {
                                            rLottieDrawable10.currentFrame = 0;
                                            rLottieDrawable10.nextFrameIsLast = false;
                                            if (RLottieDrawable.this.secondNativePtr != 0) {
                                                RLottieDrawable.this.isDice = 2;
                                            }
                                            if (RLottieDrawable.this.resetVibrationAfterRestart) {
                                                RLottieDrawable.this.vibrationPattern = null;
                                                RLottieDrawable.this.resetVibrationAfterRestart = false;
                                            }
                                        }
                                    } else if (i6 == 2) {
                                        int i9 = rLottieDrawable10.currentFrame + i5;
                                        if (i9 < rLottieDrawable10.secondFramesCount) {
                                            rLottieDrawable10.currentFrame = i9;
                                        } else {
                                            rLottieDrawable10.nextFrameIsLast = true;
                                            RLottieDrawable.this.autoRepeatPlayCount++;
                                        }
                                    } else {
                                        int i10 = rLottieDrawable10.customEndFrame;
                                        if (i10 >= 0 && rLottieDrawable10.playInDirectionOfCustomEndFrame) {
                                            int i11 = rLottieDrawable10.currentFrame;
                                            if (i11 > i10) {
                                                int i12 = i11 - i5;
                                                if (i12 >= i10) {
                                                    rLottieDrawable10.currentFrame = i12;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else {
                                                int i13 = i11 + i5;
                                                if (i13 < i10) {
                                                    rLottieDrawable10.currentFrame = i13;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            }
                                        } else {
                                            int i14 = rLottieDrawable10.currentFrame + i5;
                                            if (i10 < 0) {
                                                i10 = rLottieDrawable10.metaData[0];
                                            }
                                            if (i14 < i10) {
                                                if (rLottieDrawable10.autoRepeat == 3) {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.autoRepeatPlayCount++;
                                                } else {
                                                    rLottieDrawable10.currentFrame = i14;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                }
                                            } else {
                                                int i15 = rLottieDrawable10.autoRepeat;
                                                if (i15 == 1) {
                                                    rLottieDrawable10.currentFrame = 0;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                    if (RLottieDrawable.this.resetVibrationAfterRestart) {
                                                        RLottieDrawable.this.vibrationPattern = null;
                                                        RLottieDrawable.this.resetVibrationAfterRestart = false;
                                                    }
                                                    RLottieDrawable rLottieDrawable11 = RLottieDrawable.this;
                                                    int i16 = rLottieDrawable11.autoRepeatCount;
                                                    if (i16 > 0) {
                                                        rLottieDrawable11.autoRepeatCount = i16 - 1;
                                                    }
                                                } else if (i15 == 2) {
                                                    rLottieDrawable10.currentFrame = 0;
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable rLottieDrawable12 = RLottieDrawable.this;
                                                    rLottieDrawable12.autoRepeatPlayCount++;
                                                    if (rLottieDrawable12.resetVibrationAfterRestart) {
                                                        RLottieDrawable.this.vibrationPattern = null;
                                                        RLottieDrawable.this.resetVibrationAfterRestart = false;
                                                    }
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    FileLog.e(e3);
                                }
                            }
                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                            countDownLatch = RLottieDrawable.this.frameWaitSync;
                            if (countDownLatch == null) {
                                countDownLatch.countDown();
                                return;
                            }
                            return;
                        }
                        z2 = true;
                        if (RLottieDrawable.this.backgroundBitmap != null) {
                        }
                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                        countDownLatch = RLottieDrawable.this.frameWaitSync;
                        if (countDownLatch == null) {
                        }
                    }
                }
                CountDownLatch countDownLatch3 = RLottieDrawable.this.frameWaitSync;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
            }
        };
        this.srcRect = new Rect();
        this.rawBackgroundBitmapFrame = -1;
        this.width = i;
        this.height = i2;
        this.isDice = 1;
        if ("🎲".equals(str)) {
            readRes = AndroidUtilities.readRes(R.raw.diceloop);
            this.diceSwitchFramesCount = 60;
        } else {
            readRes = "🎯".equals(str) ? AndroidUtilities.readRes(R.raw.dartloop) : null;
        }
        getPaint().setFlags(2);
        if (TextUtils.isEmpty(readRes)) {
            this.timeBetweenFrames = 16;
        } else {
            this.nativePtr = RLottieNative.createWithJson(readRes, "dice", iArr, null);
            this.timeBetweenFrames = Math.max(16, (int) (1000.0f / iArr[1]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkDispatchOnAnimationEnd() {
        Runnable runnable = this.onAnimationEndListener;
        if (runnable != null) {
            runnable.run();
            this.onAnimationEndListener = null;
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        this.onAnimationEndListener = runnable;
    }

    public boolean isDice() {
        return this.isDice != 0;
    }

    public boolean setBaseDice(File file) {
        if (this.nativePtr == 0 && !this.loadingInBackground) {
            final String readRes = AndroidUtilities.readRes(file);
            if (TextUtils.isEmpty(readRes)) {
                return false;
            }
            this.loadingInBackground = true;
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RLottieDrawable.this.lambda$setBaseDice$3(readRes);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBaseDice$3(String str) {
        this.nativePtr = RLottieNative.createWithJson(str, "dice", this.metaData, null);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.lambda$setBaseDice$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBaseDice$2() {
        this.loadingInBackground = false;
        if (!this.secondLoadingInBackground && this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        this.timeBetweenFrames = Math.max(16, (int) (1000.0f / this.metaData[1]));
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public boolean hasBaseDice() {
        return this.nativePtr != 0 || this.loadingInBackground;
    }

    public boolean setDiceNumber(File file, boolean z) {
        if (this.secondNativePtr == 0 && !this.secondLoadingInBackground) {
            final String readRes = AndroidUtilities.readRes(file);
            if (TextUtils.isEmpty(readRes)) {
                return false;
            }
            if (z && this.nextRenderingBitmap == null && this.renderingBitmap == null && this.loadFrameTask == null) {
                this.isDice = 2;
                this.setLastFrame = true;
            }
            this.secondLoadingInBackground = true;
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    RLottieDrawable.this.lambda$setDiceNumber$6(readRes);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDiceNumber$6(String str) {
        if (this.destroyAfterLoading) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    RLottieDrawable.this.lambda$setDiceNumber$4();
                }
            });
            return;
        }
        final int[] iArr = new int[3];
        this.secondNativePtr = RLottieNative.createWithJson(str, "dice", iArr, null);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.lambda$setDiceNumber$5(iArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDiceNumber$4() {
        this.secondLoadingInBackground = false;
        if (this.loadingInBackground || !this.destroyAfterLoading) {
            return;
        }
        recycle(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDiceNumber$5(int[] iArr) {
        this.secondLoadingInBackground = false;
        if (this.destroyAfterLoading) {
            recycle(true);
            return;
        }
        this.secondFramesCount = iArr[0];
        this.timeBetweenFrames = Math.max(16, (int) (1000.0f / iArr[1]));
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public boolean isDiceRevealed() {
        int i = this.isDice;
        if (i == 1 || i != 2) {
            return false;
        }
        if (this.setLastFrame) {
            return true;
        }
        float progress = getProgress();
        if (this.secondNativePtr != 0) {
            progress = this.currentFrame / this.secondFramesCount;
        }
        return progress > 0.95f;
    }

    public RLottieDrawable(int i, String str, int i2, int i3, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.parentViews = new ArrayList();
        this.diceSwitchFramesCount = -1;
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.1
            @Override // java.lang.Runnable
            public void run() {
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.2
            @Override // java.lang.Runnable
            public void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
                if (RLottieDrawable.this.onFrameReadyRunnable != null) {
                    RLottieDrawable.this.onFrameReadyRunnable.run();
                }
            }
        };
        this.uiRunnableGenerateCache = new 3();
        this.uiRunnableCacheFinished = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.4
            @Override // java.lang.Runnable
            public void run() {
                if (RLottieDrawable.this.cacheGenerateTask != null) {
                    BitmapsCache.decrementTaskCounter();
                    RLottieDrawable.this.cacheGenerateTask = null;
                }
                RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                rLottieDrawable.generatingCache = false;
                rLottieDrawable.decodeFrameFinishedInternal();
                Runnable runnable = RLottieDrawable.this.whenCacheDone;
                if (runnable != null) {
                    runnable.run();
                    RLottieDrawable.this.whenCacheDone = null;
                }
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable.5
            private long lastUpdate = 0;

            /* JADX WARN: Removed duplicated region for block: B:18:0x02ba  */
            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x013c A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0154 A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x019c A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:37:0x00b1, B:39:0x00b7, B:40:0x00d1, B:43:0x00da, B:45:0x00e3, B:59:0x0126, B:61:0x012e, B:63:0x0134, B:65:0x013c, B:66:0x014c, B:68:0x0154, B:70:0x015c, B:71:0x018a, B:74:0x019c, B:76:0x01ab, B:79:0x01af, B:81:0x01bb, B:83:0x01c2, B:85:0x01c8, B:86:0x01cc, B:88:0x01d8, B:89:0x01dd, B:91:0x01e5, B:94:0x01f5, B:96:0x01fc, B:97:0x0200, B:98:0x020b, B:100:0x020f, B:102:0x0213, B:104:0x0217, B:106:0x021a, B:107:0x0220, B:108:0x0229, B:110:0x022c, B:111:0x0232, B:112:0x023b, B:116:0x0247, B:118:0x024c, B:119:0x0256, B:120:0x025b, B:122:0x025f, B:124:0x026b, B:125:0x0276, B:127:0x027c, B:130:0x0283, B:132:0x0294, B:133:0x02a0, B:134:0x0241, B:136:0x011a, B:139:0x011e, B:142:0x00bf, B:144:0x00c7, B:145:0x00cf), top: B:36:0x00b1 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                boolean z2;
                long j;
                int frame;
                BitmapsCache bitmapsCache;
                BitmapsCache bitmapsCache2;
                CountDownLatch countDownLatch;
                if (RLottieDrawable.this.isRecycled) {
                    return;
                }
                if (RLottieDrawable.this.canLoadFrames()) {
                    RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                    if (rLottieDrawable.isDice != 2 || rLottieDrawable.secondNativePtr != 0) {
                        if (RLottieDrawable.this.backgroundBitmap == null) {
                            try {
                                RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                                rLottieDrawable2.backgroundBitmap = Bitmap.createBitmap(rLottieDrawable2.width, rLottieDrawable2.height, Bitmap.Config.ARGB_8888);
                                z2 = false;
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                            if (RLottieDrawable.this.backgroundBitmap != null) {
                                try {
                                    if (!RLottieDrawable.this.pendingColorUpdates.isEmpty()) {
                                        for (Map.Entry entry : RLottieDrawable.this.pendingColorUpdates.entrySet()) {
                                            RLottieNative.setLayerColor(RLottieDrawable.this.nativePtr, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                        }
                                        RLottieDrawable.this.pendingColorUpdates.clear();
                                    }
                                } catch (Exception unused) {
                                }
                                if (RLottieDrawable.this.pendingReplaceColors != null && RLottieDrawable.this.nativePtr != 0) {
                                    RLottieNative.replaceColors(RLottieDrawable.this.nativePtr, RLottieDrawable.this.pendingReplaceColors);
                                    RLottieDrawable.this.pendingReplaceColors = null;
                                }
                                try {
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    int i4 = rLottieDrawable3.isDice;
                                    if (i4 == 1) {
                                        j = rLottieDrawable3.nativePtr;
                                    } else if (i4 == 2) {
                                        j = rLottieDrawable3.secondNativePtr;
                                        if (RLottieDrawable.this.setLastFrame) {
                                            RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                            rLottieDrawable4.currentFrame = rLottieDrawable4.secondFramesCount - 1;
                                        }
                                    } else {
                                        j = rLottieDrawable3.nativePtr;
                                    }
                                    int i5 = RLottieDrawable.this.shouldLimitFps ? 2 : 1;
                                    System.currentTimeMillis();
                                    RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                    if (rLottieDrawable5.precache && (bitmapsCache2 = rLottieDrawable5.bitmapsCache) != null) {
                                        try {
                                            frame = bitmapsCache2.getFrame(rLottieDrawable5.currentFrame / i5, rLottieDrawable5.backgroundBitmap);
                                        } catch (Exception e) {
                                            e = e;
                                            frame = 0;
                                        }
                                        try {
                                            if (!RLottieDrawable.this.bitmapsCache.needGenCache() && RLottieDrawable.this.allowDrawFramesWhileCacheGenerating && RLottieDrawable.this.nativePtr != 0) {
                                                RLottieNative.destroy(RLottieDrawable.this.nativePtr);
                                                RLottieDrawable.this.nativePtr = 0L;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            FileLog.e(e);
                                            bitmapsCache = RLottieDrawable.this.bitmapsCache;
                                            if (bitmapsCache != null) {
                                                if (!RLottieDrawable.this.genCacheSend) {
                                                }
                                                if (RLottieDrawable.this.allowDrawFramesWhileCacheGenerating) {
                                                }
                                            }
                                            if (frame != -1) {
                                            }
                                        }
                                    } else {
                                        frame = RLottieNative.getFrame(j, rLottieDrawable5.currentFrame, rLottieDrawable5.backgroundBitmap, z2);
                                    }
                                    bitmapsCache = RLottieDrawable.this.bitmapsCache;
                                    if (bitmapsCache != null && bitmapsCache.needGenCache()) {
                                        if (!RLottieDrawable.this.genCacheSend) {
                                            RLottieDrawable.this.genCacheSend = true;
                                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableGenerateCache);
                                        }
                                        if (RLottieDrawable.this.allowDrawFramesWhileCacheGenerating) {
                                            frame = -1;
                                        } else {
                                            if (RLottieDrawable.this.nativePtr == 0) {
                                                RLottieDrawable rLottieDrawable6 = RLottieDrawable.this;
                                                String file2 = rLottieDrawable6.args.file.toString();
                                                RLottieDrawable rLottieDrawable7 = RLottieDrawable.this;
                                                NativePtrArgs nativePtrArgs = rLottieDrawable7.args;
                                                rLottieDrawable6.nativePtr = RLottieNative.create(file2, nativePtrArgs.json, rLottieDrawable7.width, rLottieDrawable7.height, new int[3], false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier);
                                            }
                                            long j2 = RLottieDrawable.this.nativePtr;
                                            RLottieDrawable rLottieDrawable8 = RLottieDrawable.this;
                                            frame = RLottieNative.getFrame(j2, rLottieDrawable8.currentFrame, rLottieDrawable8.backgroundBitmap, z2);
                                        }
                                    }
                                    if (frame != -1) {
                                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
                                        CountDownLatch countDownLatch2 = RLottieDrawable.this.frameWaitSync;
                                        if (countDownLatch2 != null) {
                                            countDownLatch2.countDown();
                                            return;
                                        }
                                        return;
                                    }
                                    RLottieDrawable rLottieDrawable9 = RLottieDrawable.this;
                                    rLottieDrawable9.nextRenderingBitmap = rLottieDrawable9.backgroundBitmap;
                                    RLottieDrawable rLottieDrawable10 = RLottieDrawable.this;
                                    int i6 = rLottieDrawable10.isDice;
                                    if (i6 == 1) {
                                        int i7 = rLottieDrawable10.currentFrame + i5;
                                        int i8 = rLottieDrawable10.diceSwitchFramesCount;
                                        if (i8 == -1) {
                                            i8 = rLottieDrawable10.metaData[0];
                                        }
                                        if (i7 < i8) {
                                            rLottieDrawable10.currentFrame = i7;
                                        } else {
                                            rLottieDrawable10.currentFrame = 0;
                                            rLottieDrawable10.nextFrameIsLast = false;
                                            if (RLottieDrawable.this.secondNativePtr != 0) {
                                                RLottieDrawable.this.isDice = 2;
                                            }
                                            if (RLottieDrawable.this.resetVibrationAfterRestart) {
                                                RLottieDrawable.this.vibrationPattern = null;
                                                RLottieDrawable.this.resetVibrationAfterRestart = false;
                                            }
                                        }
                                    } else if (i6 == 2) {
                                        int i9 = rLottieDrawable10.currentFrame + i5;
                                        if (i9 < rLottieDrawable10.secondFramesCount) {
                                            rLottieDrawable10.currentFrame = i9;
                                        } else {
                                            rLottieDrawable10.nextFrameIsLast = true;
                                            RLottieDrawable.this.autoRepeatPlayCount++;
                                        }
                                    } else {
                                        int i10 = rLottieDrawable10.customEndFrame;
                                        if (i10 >= 0 && rLottieDrawable10.playInDirectionOfCustomEndFrame) {
                                            int i11 = rLottieDrawable10.currentFrame;
                                            if (i11 > i10) {
                                                int i12 = i11 - i5;
                                                if (i12 >= i10) {
                                                    rLottieDrawable10.currentFrame = i12;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            } else {
                                                int i13 = i11 + i5;
                                                if (i13 < i10) {
                                                    rLottieDrawable10.currentFrame = i13;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            }
                                        } else {
                                            int i14 = rLottieDrawable10.currentFrame + i5;
                                            if (i10 < 0) {
                                                i10 = rLottieDrawable10.metaData[0];
                                            }
                                            if (i14 < i10) {
                                                if (rLottieDrawable10.autoRepeat == 3) {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.autoRepeatPlayCount++;
                                                } else {
                                                    rLottieDrawable10.currentFrame = i14;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                }
                                            } else {
                                                int i15 = rLottieDrawable10.autoRepeat;
                                                if (i15 == 1) {
                                                    rLottieDrawable10.currentFrame = 0;
                                                    rLottieDrawable10.nextFrameIsLast = false;
                                                    if (RLottieDrawable.this.resetVibrationAfterRestart) {
                                                        RLottieDrawable.this.vibrationPattern = null;
                                                        RLottieDrawable.this.resetVibrationAfterRestart = false;
                                                    }
                                                    RLottieDrawable rLottieDrawable11 = RLottieDrawable.this;
                                                    int i16 = rLottieDrawable11.autoRepeatCount;
                                                    if (i16 > 0) {
                                                        rLottieDrawable11.autoRepeatCount = i16 - 1;
                                                    }
                                                } else if (i15 == 2) {
                                                    rLottieDrawable10.currentFrame = 0;
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable rLottieDrawable12 = RLottieDrawable.this;
                                                    rLottieDrawable12.autoRepeatPlayCount++;
                                                    if (rLottieDrawable12.resetVibrationAfterRestart) {
                                                        RLottieDrawable.this.vibrationPattern = null;
                                                        RLottieDrawable.this.resetVibrationAfterRestart = false;
                                                    }
                                                } else {
                                                    rLottieDrawable10.nextFrameIsLast = true;
                                                    RLottieDrawable.this.checkDispatchOnAnimationEnd();
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    FileLog.e(e3);
                                }
                            }
                            RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                            countDownLatch = RLottieDrawable.this.frameWaitSync;
                            if (countDownLatch == null) {
                                countDownLatch.countDown();
                                return;
                            }
                            return;
                        }
                        z2 = true;
                        if (RLottieDrawable.this.backgroundBitmap != null) {
                        }
                        RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnable);
                        countDownLatch = RLottieDrawable.this.frameWaitSync;
                        if (countDownLatch == null) {
                        }
                    }
                }
                CountDownLatch countDownLatch3 = RLottieDrawable.this.frameWaitSync;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                RLottieDrawable.uiHandler.post(RLottieDrawable.this.uiRunnableNoFrame);
            }
        };
        this.srcRect = new Rect();
        this.rawBackgroundBitmapFrame = -1;
        this.width = i2;
        this.height = i3;
        this.autoRepeat = 0;
        String readRes = AndroidUtilities.readRes(i);
        if (TextUtils.isEmpty(readRes)) {
            return;
        }
        getPaint().setFlags(2);
        this.nativePtr = RLottieNative.createWithJson(readRes, str, iArr2, iArr);
        this.timeBetweenFrames = Math.max(16, (int) (1000.0f / iArr2[1]));
        if (z) {
            setAllowDecodeSingleFrame(true);
        }
    }

    public void multiplySpeed(float f) {
        this.timeBetweenFrames = (int) (this.timeBetweenFrames * (1.0f / f));
    }

    public int getCurrentFrame() {
        return this.currentFrame;
    }

    public float getProgress() {
        return this.currentFrame / this.metaData[0];
    }

    public int getCustomEndFrame() {
        return this.customEndFrame;
    }

    public long getDuration() {
        int[] iArr = this.metaData;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.playInDirectionOfCustomEndFrame = z;
    }

    public boolean setCustomEndFrame(int i) {
        if (this.customEndFrame == i || i > this.metaData[0]) {
            return false;
        }
        this.customEndFrame = i;
        return true;
    }

    public int getFramesCount() {
        return this.metaData[0];
    }

    public void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.parentViews.add(imageReceiver);
    }

    public void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.parentViews.remove(imageReceiver);
        checkCacheCancel();
    }

    public void checkCacheCancel() {
        if (this.bitmapsCache == null || lottieCacheGenerateQueue == null || this.cacheGenerateTask == null) {
            return;
        }
        if (this.parentViews.isEmpty() && getCallback() == null) {
            View view = this.masterParent;
            if (view == null || !view.isAttachedToWindow()) {
                Runnable runnable = this.cacheGenerateTask;
                if (runnable != null) {
                    lottieCacheGenerateQueue.cancelRunnable(runnable);
                    BitmapsCache.decrementTaskCounter();
                    this.cacheGenerateTask = null;
                }
                this.generatingCache = false;
                this.genCacheSend = false;
            }
        }
    }

    protected boolean hasParentView() {
        return (this.parentViews.isEmpty() && this.masterParent == null && getCallback() == null) ? false : true;
    }

    protected void invalidateInternal() {
        if (this.isRecycled) {
            return;
        }
        int size = this.parentViews.size();
        for (int i = 0; i < size; i++) {
            ((ImageReceiver) this.parentViews.get(i)).invalidate();
        }
        View view = this.masterParent;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.decodeSingleFrame = z;
        if (z) {
            scheduleNextGetFrame();
        }
    }

    public void recycle(boolean z) {
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        if (this.loadingInBackground || this.secondLoadingInBackground) {
            this.destroyAfterLoading = true;
            return;
        }
        if (this.loadFrameTask == null && this.cacheGenerateTask == null && !this.generatingCache) {
            recycleNativePtr(z);
            BitmapsCache bitmapsCache = this.bitmapsCache;
            if (bitmapsCache != null) {
                bitmapsCache.recycle();
                this.bitmapsCache = null;
            }
            recycleResources();
            return;
        }
        this.destroyWhenDone = true;
    }

    public void setAutoRepeat(int i) {
        if (this.autoRepeat == 2 && i == 3 && this.currentFrame != 0) {
            return;
        }
        this.autoRepeat = i;
    }

    public void setAutoRepeatCount(int i) {
        this.autoRepeatCount = i;
    }

    public void setAutoRepeatTimeout(long j) {
        this.autoRepeatTimeout = j;
    }

    protected void finalize() {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.isRunning) {
            return;
        }
        if ((this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) && this.customEndFrame != this.currentFrame) {
            this.isRunning = true;
            if (this.invalidateOnProgressSet) {
                this.isInvalid = true;
                if (this.loadFrameTask != null) {
                    this.doNotRemoveInvalidOnFrameReady = true;
                }
            }
            scheduleNextGetFrame();
            invalidateInternal();
        }
    }

    public boolean restart() {
        return restart(false);
    }

    public boolean restart(boolean z) {
        if (!z && ((this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) && this.autoRepeatCount < 0)) {
            return false;
        }
        this.autoRepeatPlayCount = 0;
        this.autoRepeat = 2;
        start();
        return true;
    }

    public void setVibrationPattern(HashMap hashMap) {
        this.vibrationPattern = hashMap;
    }

    public boolean hasVibrationPattern() {
        return this.vibrationPattern != null;
    }

    public void beginApplyLayerColors() {
        this.applyingLayerColors = true;
    }

    public void commitApplyLayerColors() {
        if (this.applyingLayerColors) {
            this.applyingLayerColors = false;
            if (!this.isRunning && this.decodeSingleFrame) {
                if (this.currentFrame <= 2) {
                    this.currentFrame = 0;
                }
                this.nextFrameIsLast = false;
                this.singleFrameDecoded = false;
                if (!scheduleNextGetFrame()) {
                    this.forceFrameRedraw = true;
                }
            }
            invalidateInternal();
        }
    }

    public void replaceColors(int[] iArr) {
        this.newReplaceColors = iArr;
        requestRedrawColors();
    }

    public void setLayerColor(String str, int i) {
        this.newColorUpdates.put(str, Integer.valueOf(i));
        requestRedrawColors();
    }

    private void requestRedrawColors() {
        if (!this.applyingLayerColors && !this.isRunning && this.decodeSingleFrame) {
            if (this.currentFrame <= 2) {
                this.currentFrame = 0;
            }
            this.nextFrameIsLast = false;
            this.singleFrameDecoded = false;
            if (!scheduleNextGetFrame()) {
                this.forceFrameRedraw = true;
            }
        }
        invalidateInternal();
    }

    protected boolean scheduleNextGetFrame() {
        boolean z;
        if (this.loadFrameTask != null || this.nextRenderingBitmap != null || !canLoadFrames() || this.loadingInBackground || this.destroyWhenDone || (!this.isRunning && (!(z = this.decodeSingleFrame) || (z && this.singleFrameDecoded)))) {
            return false;
        }
        if (this.generatingCache && !this.allowDrawFramesWhileCacheGenerating) {
            return false;
        }
        if (!this.newColorUpdates.isEmpty()) {
            this.pendingColorUpdates.putAll(this.newColorUpdates);
            this.newColorUpdates.clear();
        }
        int[] iArr = this.newReplaceColors;
        if (iArr != null) {
            this.pendingReplaceColors = iArr;
            this.newReplaceColors = null;
        }
        this.loadFrameTask = this.loadFrameRunnable;
        if (this.shouldLimitFps && Thread.currentThread() == ApplicationLoader.applicationHandler.getLooper().getThread()) {
            DispatchQueuePoolBackground.execute(this.loadFrameTask, this.frameWaitSync != null);
        } else {
            loadFrameRunnableQueue.lambda$execute$0(this.loadFrameTask);
        }
        return true;
    }

    public boolean isHeavyDrawable() {
        return this.isDice == 0;
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.isRunning = false;
    }

    public void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public void setCurrentFrame(int i, boolean z) {
        setCurrentFrame(i, z, false);
    }

    public void setCurrentFrame(int i, boolean z, boolean z2) {
        if (i < 0 || i > this.metaData[0]) {
            return;
        }
        if (this.currentFrame != i || z2) {
            this.currentFrame = i;
            this.nextFrameIsLast = false;
            this.singleFrameDecoded = false;
            if (this.invalidateOnProgressSet) {
                this.isInvalid = true;
                if (this.loadFrameTask != null) {
                    this.doNotRemoveInvalidOnFrameReady = true;
                }
            }
            if ((!z || z2) && this.waitingForNextTask && this.nextRenderingBitmap != null) {
                this.backgroundBitmap = this.nextRenderingBitmap;
                this.nextRenderingBitmap = null;
                this.loadFrameTask = null;
                this.waitingForNextTask = false;
            }
            if (!z && this.loadFrameTask == null) {
                this.frameWaitSync = new CountDownLatch(1);
            }
            if (z2 && !this.isRunning) {
                this.isRunning = true;
            }
            if (!scheduleNextGetFrame()) {
                this.forceFrameRedraw = true;
            } else if (!z) {
                try {
                    this.frameWaitSync.await();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.frameWaitSync = null;
            }
            invalidateSelf();
        }
    }

    public void setProgressMs(long j) {
        setCurrentFrame((int) ((Math.max(0L, j) / this.timeBetweenFrames) % this.metaData[0]), true, true);
    }

    public void setProgress(float f) {
        setProgress(f, true);
    }

    public void setProgress(float f, boolean z) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        setCurrentFrame((int) (this.metaData[0] * f), z);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyTransformation = true;
    }

    private void setCurrentFrame(long j, long j2, long j3, boolean z) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.backgroundBitmap = this.renderingBitmap;
        this.renderingBitmap = this.nextRenderingBitmap;
        this.nextRenderingBitmap = null;
        if (this.isDice == 2 && (weakReference2 = this.onFinishCallback) != null && this.currentFrame - 1 >= this.finishFrame) {
            Runnable runnable2 = (Runnable) weakReference2.get();
            if (runnable2 != null) {
                runnable2.run();
            }
            this.onFinishCallback = null;
        }
        if (this.nextFrameIsLast || (this.autoRepeatCount == 0 && this.autoRepeat == 1)) {
            stop();
        }
        this.loadFrameTask = null;
        if (this.doNotRemoveInvalidOnFrameReady) {
            this.doNotRemoveInvalidOnFrameReady = false;
        } else if (this.isInvalid) {
            this.isInvalid = false;
        }
        this.singleFrameDecoded = true;
        this.waitingForNextTask = false;
        if (AndroidUtilities.screenRefreshRate <= 60.0f) {
            this.lastFrameTime = j;
        } else {
            this.lastFrameTime = j - Math.min(16L, j2 - j3);
        }
        if (z && this.forceFrameRedraw) {
            this.singleFrameDecoded = false;
            this.forceFrameRedraw = false;
        }
        if (this.isDice == 0 && (weakReference = this.onFinishCallback) != null && this.currentFrame >= this.finishFrame && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        scheduleNextGetFrame();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        drawInternal(canvas, null, false, 0L, 0);
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.dstRectBackground;
        if (rectFArr[i2] == null) {
            rectFArr[i2] = new RectF();
            this.backgroundPaint[i2] = new Paint(1);
            this.backgroundPaint[i2].setFilterBitmap(true);
        }
        this.backgroundPaint[i2].setAlpha(i);
        this.backgroundPaint[i2].setColorFilter(colorFilter);
        this.dstRectBackground[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, null, true, 0L, i2);
    }

    public void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0L, 0);
    }

    public void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
        float width;
        float f;
        if (!canLoadFrames() || this.destroyWhenDone) {
            return;
        }
        if (!z) {
            updateCurrentFrame(j, false);
        }
        RectF rectF = z ? this.dstRectBackground[i] : this.dstRect;
        if (paint == null) {
            paint = z ? this.backgroundPaint[i] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.isInvalid || this.renderingBitmap == null) {
            return;
        }
        boolean z2 = true;
        if (!z) {
            rectF.set(getBounds());
            if (this.applyTransformation) {
                this.scaleX = rectF.width() / this.width;
                this.scaleY = rectF.height() / this.height;
                this.applyTransformation = false;
                if (Math.abs(rectF.width() - this.width) < AndroidUtilities.dp(1.0f) && Math.abs(rectF.height() - this.height) < AndroidUtilities.dp(1.0f)) {
                    z2 = false;
                }
                this.needScale = z2;
            }
            float f2 = this.scaleX;
            f = this.scaleY;
            width = f2;
            z2 = this.needScale;
        } else {
            width = rectF.width() / this.width;
            float height = rectF.height() / this.height;
            if (Math.abs(rectF.width() - this.width) >= AndroidUtilities.dp(1.0f) || Math.abs(rectF.height() - this.height) >= AndroidUtilities.dp(1.0f)) {
                f = height;
            } else {
                f = height;
                z2 = false;
            }
        }
        if (!z2) {
            canvas.drawBitmap(this.renderingBitmap, rectF.left, rectF.top, paint);
        } else if (this.scaleByCanvas) {
            this.srcRect.set(0, 0, this.renderingBitmap.getWidth(), this.renderingBitmap.getHeight());
            canvas.drawBitmap(this.renderingBitmap, this.srcRect, rectF, paint);
        } else {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(width, f);
            canvas.drawBitmap(this.renderingBitmap, 0.0f, 0.0f, paint);
            canvas.restore();
        }
        if (!this.isRunning || z) {
            return;
        }
        invalidateInternal();
    }

    public void updateCurrentFrame(long j, boolean z) {
        int i;
        Integer num;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        long j3 = j2 - this.lastFrameTime;
        if (z && !this.shouldLimitFps) {
            i = this.timeBetweenFrames - 16;
        } else {
            float f = AndroidUtilities.screenRefreshRate;
            if (f <= 60.0f || (z && f <= 80.0f)) {
                i = this.timeBetweenFrames - 6;
            } else {
                i = this.timeBetweenFrames;
            }
        }
        if (this.isRunning) {
            if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
                scheduleNextGetFrame();
                return;
            }
            if (this.nextRenderingBitmap != null) {
                if (this.renderingBitmap == null || (j3 >= i && !this.skipFrameUpdate)) {
                    HashMap hashMap = this.vibrationPattern;
                    if (hashMap != null && this.allowVibration && (num = (Integer) hashMap.get(Integer.valueOf(this.currentFrame - 1))) != null) {
                        try {
                            Activity activity = LaunchActivity.instance;
                            if (activity == null) {
                                activity = BubbleActivity.instance;
                            }
                            activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    setCurrentFrame(j2, j3, i, false);
                    return;
                }
                return;
            }
            return;
        }
        if ((this.forceFrameRedraw || (this.decodeSingleFrame && j3 >= i)) && this.nextRenderingBitmap != null) {
            setCurrentFrame(j2, j3, i, true);
        }
    }

    public void setAllowVibration(boolean z) {
        this.allowVibration = z;
    }

    public void resetVibrationAfterRestart(boolean z) {
        this.resetVibrationAfterRestart = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.width;
    }

    public Bitmap getAnimatedBitmap() {
        if (this.renderingBitmap != null) {
            return this.renderingBitmap;
        }
        if (this.nextRenderingBitmap != null) {
            return this.nextRenderingBitmap;
        }
        return null;
    }

    public boolean hasBitmap() {
        return (this.isRecycled || (this.renderingBitmap == null && this.nextRenderingBitmap == null) || this.isInvalid) ? false : true;
    }

    public void setInvalidateOnProgressSet(boolean z) {
        this.invalidateOnProgressSet = z;
    }

    public boolean isGeneratingCache() {
        return this.cacheGenerateTask != null;
    }

    public boolean isLastFrame() {
        return this.currentFrame == getFramesCount() - 1;
    }

    @Override // org.telegram.messenger.utils.BitmapsCache.Cacheable
    public void prepareForGenerateCache() {
        File file;
        String file2 = this.args.file.toString();
        NativePtrArgs nativePtrArgs = this.args;
        long create = RLottieNative.create(file2, nativePtrArgs.json, this.width, this.height, this.createdForFirstFrame ? this.metaData : new int[3], false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier);
        this.generateCacheNativePtr = create;
        if (create != 0 || (file = this.file) == null) {
            return;
        }
        file.delete();
    }

    public void setGeneratingFrame(int i) {
        this.generateCacheFramePointer = i;
    }

    @Override // org.telegram.messenger.utils.BitmapsCache.Cacheable
    public int getNextFrame(Bitmap bitmap) {
        long j = this.generateCacheNativePtr;
        if (j == 0) {
            return -1;
        }
        int i = this.shouldLimitFps ? 2 : 1;
        if (RLottieNative.getFrame(j, this.generateCacheFramePointer, bitmap, true) == -5) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return getNextFrame(bitmap);
        }
        int i2 = this.generateCacheFramePointer + i;
        this.generateCacheFramePointer = i2;
        return i2 > this.metaData[0] ? 0 : 1;
    }

    public void cacheFrame(int i) {
        if (this.rawBackgroundBitmapFrame != i || this.rawBackgroundBitmap == null) {
            if (this.rawBackgroundBitmap == null) {
                this.rawBackgroundBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            }
            long j = this.nativePtr;
            this.rawBackgroundBitmapFrame = i;
            RLottieNative.getFrame(j, i, this.rawBackgroundBitmap, true);
        }
    }

    public void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.rawBackgroundBitmap != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(0, 0, this.width, this.height);
            canvas.drawBitmap(this.rawBackgroundBitmap, rect, getBounds(), getPaint());
        }
    }

    @Override // org.telegram.messenger.utils.BitmapsCache.Cacheable
    public void releaseForGenerateCache() {
        long j = this.generateCacheNativePtr;
        if (j != 0) {
            RLottieNative.destroy(j);
            this.generateCacheNativePtr = 0L;
        }
    }

    public void setMasterParent(View view) {
        this.masterParent = view;
    }

    public boolean canLoadFrames() {
        return this.precache ? this.bitmapsCache != null || this.fallbackCache : this.nativePtr != 0;
    }

    private class NativePtrArgs {
        public int[] colorReplacement;
        File file;
        public int fitzModifier;
        String json;

        private NativePtrArgs() {
        }
    }

    public void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.allowDrawFramesWhileCacheGenerating = z;
    }
}
