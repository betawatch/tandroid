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
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.View;
import java.io.File;
import java.io.FileReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;

/* loaded from: classes5.dex */
public class RLottieDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    private static int activeChoreographersCount;
    public static DispatchQueue lottieCacheGenerateQueue;
    private boolean allowDrawFramesWhileCacheGenerating;
    private boolean allowVibration;
    private boolean applyTransformation;
    private boolean applyingLayerColors;
    private NativePtrArgs args;
    protected int autoRepeat;
    protected int autoRepeatCount;
    protected int autoRepeatPlayCount;
    protected long autoRepeatTimeout;
    protected volatile Bitmap backgroundBitmap;
    private final Paint[] backgroundPaint;
    BitmapsCache bitmapsCache;
    private Runnable cacheGenerateTask;
    private boolean createdForFirstFrame;
    protected int currentFrame;
    protected int customEndFrame;
    private boolean decodeSingleFrame;
    protected boolean destroyWhenDone;
    private boolean doNotRemoveInvalidOnFrameReady;
    private final RectF dstRect;
    private final RectF[] dstRectBackground;
    private boolean fallbackCache;
    private File file;
    private int finishFrame;
    private boolean forceFrameRedraw;
    protected CountDownLatch frameWaitSync;
    private boolean genCacheSend;
    int generateCacheFramePointer;
    private RLottieNative generateCacheNative;
    boolean generatingCache;
    protected final int height;
    private boolean invalidateOnProgressSet;
    private boolean isChoreographerRegistered;
    protected int isDice;
    private boolean isInvalid;
    private volatile boolean isPaused;
    protected volatile boolean isRecycled;
    protected volatile boolean isRunning;
    private boolean isSingleChannel;
    private final HashMap layerColors;
    protected final Runnable loadFrameRunnable;
    protected Runnable loadFrameTask;
    private final Choreographer60FpsContent.FrameCallback mUiThreadChoreographerCallback;
    private View masterParent;
    protected final int[] metaData;
    protected volatile RLottieNative nativePtr;
    private boolean needScale;
    private final HashMap newColorUpdates;
    private int[] newReplaceColors;
    protected volatile boolean nextFrameIsLast;
    protected volatile Bitmap nextRenderingBitmap;
    private Runnable onAnimationEndListener;
    protected WeakReference onFinishCallback;
    private final ArrayList parentViews;
    private final HashMap pendingColorUpdates;
    private int[] pendingReplaceColors;
    protected boolean playInDirectionOfCustomEndFrame;
    private boolean precache;
    private Bitmap rawBackgroundBitmap;
    private int rawBackgroundBitmapFrame;
    protected volatile Bitmap renderingBitmap;
    protected boolean resetVibrationAfterRestart;
    private float scaleX;
    private float scaleY;
    private boolean shouldLimitFps;
    private boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    private float speedMultiply;
    private boolean swapBuffersAllowedByChoreographer;
    private int ticksWithoutDraw;
    protected final Runnable uiRunnable;
    private final Runnable uiRunnableCacheFinished;
    private final Runnable uiRunnableGenerateCache;
    protected final Runnable uiRunnableNoFrame;
    protected HashMap vibrationPattern;
    protected boolean waitingForNextTask;
    public Runnable whenCacheDone;
    protected final int width;
    private static final AtomicInteger threadId = new AtomicInteger();
    private static final AtomicInteger threadId2 = new AtomicInteger();
    private static final Executor loadFrameRunnableQueue = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda8
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread lambda$static$0;
            lambda$static$0 = RLottieDrawable.lambda$static$0(runnable);
            return lambda$static$0;
        }
    });
    private static final Executor loadFrameRunnableQueueLimitFps = Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda9
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread lambda$static$1;
            lambda$static$1 = RLottieDrawable.lambda$static$1(runnable);
            return lambda$static$1;
        }
    });

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
        return new Thread(runnable, "Lottie-" + threadId.getAndIncrement());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$static$1(Runnable runnable) {
        return new Thread(runnable, "LottieLow-" + threadId2.getAndIncrement());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uiRunnableNoFrameImpl() {
        this.loadFrameTask = null;
        decodeFrameFinishedInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uiRunnableImpl() {
        this.singleFrameDecoded = true;
        if ((!this.isRunning && this.decodeSingleFrame) || (this.renderingBitmap == null && this.nextRenderingBitmap != null)) {
            invalidateInternal();
        }
        decodeFrameFinishedInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uiRunnableGenerateCacheImpl() {
        if (this.isRecycled || this.destroyWhenDone || !canLoadFrames() || this.cacheGenerateTask != null) {
            return;
        }
        this.generatingCache = true;
        if (lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        BitmapsCache.incrementTaskCounter();
        DispatchQueue dispatchQueue = lottieCacheGenerateQueue;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.lambda$uiRunnableGenerateCacheImpl$2();
            }
        };
        this.cacheGenerateTask = runnable;
        dispatchQueue.postRunnable(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uiRunnableGenerateCacheImpl$2() {
        try {
            BitmapsCache bitmapsCache = this.bitmapsCache;
            if (bitmapsCache != null) {
                bitmapsCache.createCache();
            }
        } catch (Throwable unused) {
        }
        AndroidUtilities.runOnUIThread(this.uiRunnableCacheFinished);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uiRunnableCacheFinishedImpl() {
        if (this.cacheGenerateTask != null) {
            BitmapsCache.decrementTaskCounter();
            this.cacheGenerateTask = null;
        }
        this.generatingCache = false;
        decodeFrameFinishedInternal();
        Runnable runnable = this.whenCacheDone;
        if (runnable != null) {
            runnable.run();
            this.whenCacheDone = null;
        }
    }

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new DispatchQueue("cache generator queue");
    }

    protected final void checkRunningTasks() {
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
            if (this.loadFrameTask == null && this.cacheGenerateTask == null && this.nativePtr != null) {
                recycleNativePtr(true);
            }
        }
        if ((this.nativePtr == null || this.fallbackCache) && this.bitmapsCache == null) {
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

    protected void recycleNativePtr(boolean z) {
        final RLottieNative rLottieNative = this.nativePtr;
        this.nativePtr = null;
        if (rLottieNative != null) {
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    RLottieNative.this.recycle();
                }
            };
            if (z) {
                DispatchQueuePoolBackground.execute(runnable);
            } else {
                Utilities.globalQueue.postRunnable(runnable);
            }
        }
    }

    protected final void recycleResources() {
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

    public final void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.onFinishCallback = new WeakReference(runnable);
            this.finishFrame = i;
        } else if (this.onFinishCallback != null) {
            this.onFinishCallback = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0042, B:22:0x004c, B:24:0x0051, B:38:0x0089, B:40:0x008e, B:42:0x0094, B:44:0x0098, B:45:0x009f, B:47:0x00a3, B:49:0x00a7, B:50:0x00d0, B:52:0x00d4, B:55:0x00e2, B:57:0x00eb, B:60:0x00ef, B:62:0x00f7, B:64:0x00fb, B:66:0x00ff, B:68:0x0102, B:69:0x0108, B:70:0x010e, B:72:0x0111, B:73:0x0116, B:74:0x011c, B:78:0x0128, B:80:0x012d, B:81:0x0135, B:82:0x013a, B:84:0x013e, B:86:0x0146, B:87:0x014a, B:89:0x014e, B:91:0x0154, B:93:0x0161, B:94:0x0166, B:95:0x0122, B:97:0x007a, B:100:0x0081), top: B:18:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0042, B:22:0x004c, B:24:0x0051, B:38:0x0089, B:40:0x008e, B:42:0x0094, B:44:0x0098, B:45:0x009f, B:47:0x00a3, B:49:0x00a7, B:50:0x00d0, B:52:0x00d4, B:55:0x00e2, B:57:0x00eb, B:60:0x00ef, B:62:0x00f7, B:64:0x00fb, B:66:0x00ff, B:68:0x0102, B:69:0x0108, B:70:0x010e, B:72:0x0111, B:73:0x0116, B:74:0x011c, B:78:0x0128, B:80:0x012d, B:81:0x0135, B:82:0x013a, B:84:0x013e, B:86:0x0146, B:87:0x014a, B:89:0x014e, B:91:0x0154, B:93:0x0161, B:94:0x0166, B:95:0x0122, B:97:0x007a, B:100:0x0081), top: B:18:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0042, B:22:0x004c, B:24:0x0051, B:38:0x0089, B:40:0x008e, B:42:0x0094, B:44:0x0098, B:45:0x009f, B:47:0x00a3, B:49:0x00a7, B:50:0x00d0, B:52:0x00d4, B:55:0x00e2, B:57:0x00eb, B:60:0x00ef, B:62:0x00f7, B:64:0x00fb, B:66:0x00ff, B:68:0x0102, B:69:0x0108, B:70:0x010e, B:72:0x0111, B:73:0x0116, B:74:0x011c, B:78:0x0128, B:80:0x012d, B:81:0x0135, B:82:0x013a, B:84:0x013e, B:86:0x0146, B:87:0x014a, B:89:0x014e, B:91:0x0154, B:93:0x0161, B:94:0x0166, B:95:0x0122, B:97:0x007a, B:100:0x0081), top: B:18:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0042, B:22:0x004c, B:24:0x0051, B:38:0x0089, B:40:0x008e, B:42:0x0094, B:44:0x0098, B:45:0x009f, B:47:0x00a3, B:49:0x00a7, B:50:0x00d0, B:52:0x00d4, B:55:0x00e2, B:57:0x00eb, B:60:0x00ef, B:62:0x00f7, B:64:0x00fb, B:66:0x00ff, B:68:0x0102, B:69:0x0108, B:70:0x010e, B:72:0x0111, B:73:0x0116, B:74:0x011c, B:78:0x0128, B:80:0x012d, B:81:0x0135, B:82:0x013a, B:84:0x013e, B:86:0x0146, B:87:0x014a, B:89:0x014e, B:91:0x0154, B:93:0x0161, B:94:0x0166, B:95:0x0122, B:97:0x007a, B:100:0x0081), top: B:18:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void loadFrameRunnableImpl() {
        boolean z;
        CountDownLatch countDownLatch;
        int frame;
        BitmapsCache bitmapsCache;
        BitmapsCache bitmapsCache2;
        if (this.isRecycled) {
            return;
        }
        if (!canLoadFrames()) {
            CountDownLatch countDownLatch2 = this.frameWaitSync;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
            AndroidUtilities.runOnUIThread(this.uiRunnableNoFrame);
            return;
        }
        if (this.backgroundBitmap == null) {
            try {
                this.backgroundBitmap = Bitmap.createBitmap(this.width, this.height, this.isSingleChannel ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                z = false;
            } catch (Throwable th) {
                FileLog.e(th);
            }
            if (this.backgroundBitmap != null) {
                applyPendingColorsUpdates();
                try {
                    RLottieNative rLottieNative = this.nativePtr;
                    int i = this.shouldLimitFps ? 2 : 1;
                    if (this.precache && (bitmapsCache2 = this.bitmapsCache) != null) {
                        try {
                            frame = bitmapsCache2.getFrame(this.currentFrame / i, this.backgroundBitmap);
                        } catch (Exception e) {
                            e = e;
                            frame = 0;
                        }
                        try {
                            if (!this.bitmapsCache.needGenCache() && this.allowDrawFramesWhileCacheGenerating && this.nativePtr != null) {
                                this.nativePtr.recycle();
                                this.nativePtr = null;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            FileLog.e(e);
                            bitmapsCache = this.bitmapsCache;
                            if (bitmapsCache != null) {
                                if (!this.genCacheSend) {
                                }
                                if (this.allowDrawFramesWhileCacheGenerating) {
                                }
                                frame = -1;
                            }
                            if (frame != -1) {
                            }
                        }
                    } else {
                        frame = rLottieNative.getFrame(this.currentFrame, this.backgroundBitmap, z);
                    }
                    bitmapsCache = this.bitmapsCache;
                    if (bitmapsCache != null && bitmapsCache.needGenCache()) {
                        if (!this.genCacheSend) {
                            this.genCacheSend = true;
                            AndroidUtilities.runOnUIThread(this.uiRunnableGenerateCache);
                        }
                        if (this.allowDrawFramesWhileCacheGenerating) {
                            if (this.nativePtr == null) {
                                String file = this.args.file.toString();
                                NativePtrArgs nativePtrArgs = this.args;
                                this.nativePtr = RLottieNative.createFromFile(file, nativePtrArgs.json, this.width, this.height, null, false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier, this.layerColors);
                            }
                            if (this.nativePtr != null) {
                                frame = this.nativePtr.getFrame(this.currentFrame, this.backgroundBitmap, z);
                            }
                        }
                        frame = -1;
                    }
                    if (frame != -1) {
                        AndroidUtilities.runOnUIThread(this.uiRunnableNoFrame);
                        CountDownLatch countDownLatch3 = this.frameWaitSync;
                        if (countDownLatch3 != null) {
                            countDownLatch3.countDown();
                            return;
                        }
                        return;
                    }
                    this.nextRenderingBitmap = this.backgroundBitmap;
                    int i2 = this.customEndFrame;
                    if (i2 >= 0 && this.playInDirectionOfCustomEndFrame) {
                        int i3 = this.currentFrame;
                        if (i3 > i2) {
                            int i4 = i3 - i;
                            if (i4 >= i2) {
                                this.currentFrame = i4;
                                this.nextFrameIsLast = false;
                            } else {
                                this.nextFrameIsLast = true;
                                checkDispatchOnAnimationEnd();
                            }
                        } else {
                            int i5 = i3 + i;
                            if (i5 < i2) {
                                this.currentFrame = i5;
                                this.nextFrameIsLast = false;
                            } else {
                                this.nextFrameIsLast = true;
                                checkDispatchOnAnimationEnd();
                            }
                        }
                    } else {
                        int i6 = this.currentFrame + i;
                        if (i2 < 0) {
                            i2 = this.metaData[0];
                        }
                        if (i6 < i2) {
                            if (this.autoRepeat == 3) {
                                this.nextFrameIsLast = true;
                                this.autoRepeatPlayCount++;
                            } else {
                                this.currentFrame = i6;
                                this.nextFrameIsLast = false;
                            }
                        } else {
                            int i7 = this.autoRepeat;
                            if (i7 == 1) {
                                this.currentFrame = 0;
                                this.nextFrameIsLast = false;
                                if (this.resetVibrationAfterRestart) {
                                    this.vibrationPattern = null;
                                    this.resetVibrationAfterRestart = false;
                                }
                                int i8 = this.autoRepeatCount;
                                if (i8 > 0) {
                                    this.autoRepeatCount = i8 - 1;
                                }
                            } else if (i7 == 2) {
                                this.currentFrame = 0;
                                this.nextFrameIsLast = true;
                                this.autoRepeatPlayCount++;
                                if (this.resetVibrationAfterRestart) {
                                    this.vibrationPattern = null;
                                    this.resetVibrationAfterRestart = false;
                                }
                            } else {
                                this.nextFrameIsLast = true;
                                checkDispatchOnAnimationEnd();
                            }
                        }
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            AndroidUtilities.runOnUIThread(this.uiRunnable);
            countDownLatch = this.frameWaitSync;
            if (countDownLatch == null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        z = true;
        if (this.backgroundBitmap != null) {
        }
        AndroidUtilities.runOnUIThread(this.uiRunnable);
        countDownLatch = this.frameWaitSync;
        if (countDownLatch == null) {
        }
    }

    private void applyPendingColorsUpdates() {
        RLottieNative createFromRawJson;
        RLottieNative rLottieNative = this.nativePtr;
        if (rLottieNative == null) {
            return;
        }
        try {
            if (this.pendingColorUpdates.isEmpty() && this.pendingReplaceColors == null) {
                return;
            }
            this.layerColors.putAll(this.pendingColorUpdates);
            int[] iArr = this.pendingReplaceColors;
            if (iArr != null) {
                this.args.colorReplacement = (int[]) iArr.clone();
            }
            NativePtrArgs nativePtrArgs = this.args;
            File file = nativePtrArgs.file;
            if (file != null) {
                String absolutePath = file.getAbsolutePath();
                NativePtrArgs nativePtrArgs2 = this.args;
                createFromRawJson = RLottieNative.createFromFile(absolutePath, nativePtrArgs2.json, this.width, this.height, this.metaData, false, nativePtrArgs2.colorReplacement, this.shouldLimitFps, nativePtrArgs2.fitzModifier, this.layerColors);
            } else {
                createFromRawJson = RLottieNative.createFromRawJson(nativePtrArgs.json, nativePtrArgs.name, this.metaData, nativePtrArgs.colorReplacement, this.layerColors);
            }
            if (createFromRawJson != null) {
                this.nativePtr = createFromRawJson;
                rLottieNative.recycle();
                this.pendingColorUpdates.clear();
                this.pendingReplaceColors = null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RLottieDrawable(File file, String str, int i, int i2, BitmapsCache.CacheOptions cacheOptions, boolean z, int[] iArr, int i3) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        HashMap hashMap = new HashMap();
        this.layerColors = hashMap;
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableNoFrameImpl();
            }
        };
        this.uiRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableImpl();
            }
        };
        this.uiRunnableGenerateCache = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableGenerateCacheImpl();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableCacheFinishedImpl();
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.loadFrameRunnableImpl();
            }
        };
        this.rawBackgroundBitmapFrame = -1;
        this.mUiThreadChoreographerCallback = new Choreographer60FpsContent.FrameCallback() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda5
            @Override // org.telegram.messenger.utils.Choreographer60FpsContent.FrameCallback
            public final void doFrame(long j) {
                RLottieDrawable.this.onChoreographerFrame(j);
            }
        };
        this.width = i;
        this.height = i2;
        this.shouldLimitFps = z;
        this.precache = cacheOptions != null;
        this.fallbackCache = str == null && cacheOptions != null && cacheOptions.fallback;
        this.createdForFirstFrame = cacheOptions != null && cacheOptions.firstFrame;
        NativePtrArgs nativePtrArgs = new NativePtrArgs();
        this.args = nativePtrArgs;
        nativePtrArgs.file = file.getAbsoluteFile();
        NativePtrArgs nativePtrArgs2 = this.args;
        nativePtrArgs2.json = str;
        nativePtrArgs2.colorReplacement = iArr != null ? (int[]) iArr.clone() : null;
        this.args.fitzModifier = i3;
        getPaint().setFlags(2);
        if (str == null) {
            this.file = file;
        }
        if (this.precache && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.precache) {
            if (this.createdForFirstFrame) {
                return;
            }
            parseLottieMetadata(file, str, iArr2);
            if (this.shouldLimitFps && iArr2[1] < 60) {
                this.shouldLimitFps = false;
            }
            this.bitmapsCache = new BitmapsCache(file, this, cacheOptions, i, i2, !z, i3);
            return;
        }
        this.nativePtr = RLottieNative.createFromFile(file.getAbsolutePath(), str, i, i2, iArr2, this.precache, this.args.colorReplacement, this.shouldLimitFps, i3, hashMap);
        if (this.nativePtr == null) {
            FileLog.d("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
            file.delete();
        }
        if (!this.shouldLimitFps || iArr2[1] >= 60) {
            return;
        }
        this.shouldLimitFps = false;
    }

    public final void setIsSingleChannel(boolean z) {
        this.isSingleChannel = z;
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
            RLottieNative createFromFile = RLottieNative.createFromFile(absolutePath, str, i, i2, iArr, false, nativePtrArgs.colorReplacement, this.shouldLimitFps, nativePtrArgs.fitzModifier, this.layerColors);
            if (createFromFile != null) {
                createFromFile.recycle();
            }
        }
    }

    protected RLottieDrawable(int i, int i2) {
        this.metaData = new int[3];
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        this.layerColors = new HashMap();
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableNoFrameImpl();
            }
        };
        this.uiRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableImpl();
            }
        };
        this.uiRunnableGenerateCache = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableGenerateCacheImpl();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableCacheFinishedImpl();
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.loadFrameRunnableImpl();
            }
        };
        this.rawBackgroundBitmapFrame = -1;
        this.mUiThreadChoreographerCallback = new Choreographer60FpsContent.FrameCallback() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda5
            @Override // org.telegram.messenger.utils.Choreographer60FpsContent.FrameCallback
            public final void doFrame(long j) {
                RLottieDrawable.this.onChoreographerFrame(j);
            }
        };
        this.width = i;
        this.height = i2;
    }

    private void checkDispatchOnAnimationEnd() {
        Runnable runnable = this.onAnimationEndListener;
        if (runnable != null) {
            runnable.run();
            this.onAnimationEndListener = null;
        }
    }

    public final void setOnAnimationEndListener(Runnable runnable) {
        this.onAnimationEndListener = runnable;
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RLottieDrawable(int i, String str, int i2, int i3, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap();
        this.pendingColorUpdates = new HashMap();
        HashMap hashMap = new HashMap();
        this.layerColors = hashMap;
        this.resetVibrationAfterRestart = false;
        this.allowVibration = true;
        this.speedMultiply = 1.0f;
        this.parentViews = new ArrayList();
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.uiRunnableNoFrame = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableNoFrameImpl();
            }
        };
        this.uiRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableImpl();
            }
        };
        this.uiRunnableGenerateCache = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableGenerateCacheImpl();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.uiRunnableCacheFinishedImpl();
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.loadFrameRunnableImpl();
            }
        };
        this.rawBackgroundBitmapFrame = -1;
        this.mUiThreadChoreographerCallback = new Choreographer60FpsContent.FrameCallback() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda5
            @Override // org.telegram.messenger.utils.Choreographer60FpsContent.FrameCallback
            public final void doFrame(long j) {
                RLottieDrawable.this.onChoreographerFrame(j);
            }
        };
        this.width = i2;
        this.height = i3;
        this.autoRepeat = 0;
        String readRes = AndroidUtilities.readRes(i);
        if (TextUtils.isEmpty(readRes)) {
            return;
        }
        getPaint().setFlags(2);
        NativePtrArgs nativePtrArgs = new NativePtrArgs();
        this.args = nativePtrArgs;
        nativePtrArgs.json = readRes;
        nativePtrArgs.name = str;
        nativePtrArgs.colorReplacement = iArr != null ? (int[]) iArr.clone() : null;
        this.nativePtr = RLottieNative.createFromRawJson(readRes, str, iArr2, this.args.colorReplacement, hashMap);
        if (z) {
            setAllowDecodeSingleFrame(true);
        }
    }

    public final void multiplySpeed(float f) {
        this.speedMultiply *= f;
    }

    public final int getCurrentFrame() {
        return this.currentFrame;
    }

    public final float getProgress() {
        return this.currentFrame / this.metaData[0];
    }

    public final int getCustomEndFrame() {
        return this.customEndFrame;
    }

    public final long getDuration() {
        int[] iArr = this.metaData;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public final void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.playInDirectionOfCustomEndFrame = z;
    }

    public final boolean setCustomEndFrame(int i) {
        if (this.customEndFrame == i || i > this.metaData[0]) {
            return false;
        }
        this.customEndFrame = i;
        return true;
    }

    public final int getFramesCount() {
        return this.metaData[0];
    }

    public final void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.parentViews.add(imageReceiver);
    }

    public final void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.parentViews.remove(imageReceiver);
        checkCacheCancel();
    }

    public final void checkCacheCancel() {
        if (this.bitmapsCache == null || lottieCacheGenerateQueue == null || this.cacheGenerateTask == null || !this.parentViews.isEmpty() || getCallback() != null) {
            return;
        }
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

    protected final boolean hasParentView() {
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

    public final void setAllowDecodeSingleFrame(boolean z) {
        this.decodeSingleFrame = z;
        if (z) {
            scheduleNextGetFrame();
        }
    }

    public void recycle(boolean z) {
        this.isRunning = false;
        this.isRecycled = true;
        checkChoreographer();
        checkRunningTasks();
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

    public final void setAutoRepeat(int i) {
        if (this.autoRepeat == 2 && i == 3 && this.currentFrame != 0) {
            return;
        }
        this.autoRepeat = i;
    }

    public final void setAutoRepeatCount(int i) {
        this.autoRepeatCount = i;
    }

    public final void setAutoRepeatTimeout(long j) {
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
    public final void start() {
        if (this.isRunning) {
            return;
        }
        if ((this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) && this.customEndFrame != this.currentFrame) {
            this.isRunning = true;
            this.isPaused = false;
            if (this.invalidateOnProgressSet) {
                this.isInvalid = true;
                if (this.loadFrameTask != null) {
                    this.doNotRemoveInvalidOnFrameReady = true;
                }
            }
            scheduleNextGetFrame();
            invalidateInternal();
            checkChoreographer();
        }
    }

    public final boolean restart() {
        return restart(false);
    }

    public final boolean restart(boolean z) {
        if (!z && ((this.autoRepeat < 2 || this.autoRepeatPlayCount == 0) && this.autoRepeatCount < 0)) {
            return false;
        }
        this.autoRepeatPlayCount = 0;
        this.autoRepeat = 2;
        start();
        return true;
    }

    public final void setVibrationPattern(HashMap hashMap) {
        this.vibrationPattern = hashMap;
    }

    public final boolean hasVibrationPattern() {
        return this.vibrationPattern != null;
    }

    public final void beginApplyLayerColors() {
        this.applyingLayerColors = true;
    }

    public final void commitApplyLayerColors() {
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

    public final void replaceColors(int[] iArr) {
        this.newReplaceColors = iArr;
        requestRedrawColors();
    }

    public final void setLayerColor(String str, int i) {
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

    protected final boolean scheduleNextGetFrame() {
        if (this.loadFrameTask != null || this.nextRenderingBitmap != null || !canLoadFrames() || ignoreScheduleNextGetFrame() || this.destroyWhenDone) {
            return false;
        }
        if (!this.isRunning && (!this.decodeSingleFrame || this.singleFrameDecoded)) {
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
        Runnable runnable = this.loadFrameRunnable;
        this.loadFrameTask = runnable;
        (this.shouldLimitFps ? loadFrameRunnableQueueLimitFps : loadFrameRunnableQueue).execute(runnable);
        return true;
    }

    protected boolean ignoreScheduleNextGetFrame() {
        return this.renderingBitmap != null && getFramesCount() == 1;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.isRunning = false;
        checkChoreographer();
    }

    public final void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public final void setCurrentFrame(int i, boolean z) {
        setCurrentFrame(i, z, false);
    }

    public final void setCurrentFrame(int i, boolean z, boolean z2) {
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
                checkChoreographer();
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

    public final void setProgressMs(long j) {
        int i;
        int[] iArr = this.metaData;
        if (iArr[0] == 0 || (i = iArr[1]) == 0) {
            return;
        }
        setCurrentFrame(Math.round(Math.max(0L, j) / (1000.0f / i)) % this.metaData[0], true, true);
    }

    public final void setProgress(float f) {
        setProgress(f, true);
    }

    public final void setProgress(float f, boolean z) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        setCurrentFrame((int) (this.metaData[0] * f), z);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.width;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyTransformation = true;
    }

    private void swapBuffers() {
        this.renderingBitmap = this.nextRenderingBitmap;
        this.nextRenderingBitmap = null;
        this.swapBuffersAllowedByChoreographer = false;
    }

    private void setCurrentFrame(long j, boolean z) {
        WeakReference weakReference;
        Runnable runnable;
        WeakReference weakReference2;
        this.backgroundBitmap = this.renderingBitmap;
        swapBuffers();
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
    public final void draw(Canvas canvas) {
        drawInternal(canvas, null, false, 0L, 0);
    }

    public final void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
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

    public final void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0L, 0);
    }

    public final void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
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
        if (!z) {
            rectF.set(getBounds());
            if (this.applyTransformation) {
                this.scaleX = rectF.width() / this.width;
                this.scaleY = rectF.height() / this.height;
                this.applyTransformation = false;
                this.needScale = Math.abs(rectF.width() - ((float) this.width)) >= ((float) AndroidUtilities.dp(1.0f)) || Math.abs(rectF.height() - ((float) this.height)) >= ((float) AndroidUtilities.dp(1.0f));
            }
            width = this.scaleX;
            f = this.scaleY;
            r0 = this.needScale;
        } else {
            width = rectF.width() / this.width;
            float height = rectF.height() / this.height;
            if (Math.abs(rectF.width() - this.width) >= AndroidUtilities.dp(1.0f) || Math.abs(rectF.height() - this.height) >= AndroidUtilities.dp(1.0f)) {
                f = height;
                r0 = true;
            } else {
                f = height;
            }
        }
        if (!r0) {
            canvas.drawBitmap(this.renderingBitmap, rectF.left, rectF.top, paint);
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(width, f);
        canvas.drawBitmap(this.renderingBitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    public void updateCurrentFrame(long j, boolean z) {
        checkChoreographerAfterDrawCall();
        updateCurrentFrameInternal(j, z);
    }

    private void updateCurrentFrameInternal(long j, boolean z) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        boolean z2 = this.swapBuffersAllowedByChoreographer || (!this.isRunning && this.decodeSingleFrame);
        if (this.isRunning) {
            if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
                scheduleNextGetFrame();
                return;
            }
            if (this.nextRenderingBitmap != null) {
                if (this.renderingBitmap == null || (z2 && !this.skipFrameUpdate)) {
                    performVibration();
                    setCurrentFrame(j, false);
                    return;
                }
                return;
            }
            return;
        }
        if ((this.forceFrameRedraw || (this.decodeSingleFrame && z2)) && this.nextRenderingBitmap != null) {
            setCurrentFrame(j, true);
        }
    }

    private void performVibration() {
        Integer num;
        HashMap hashMap = this.vibrationPattern;
        if (hashMap == null || !this.allowVibration || (num = (Integer) hashMap.get(Integer.valueOf(this.currentFrame - 1))) == null) {
            return;
        }
        try {
            Activity activity = LaunchActivity.instance;
            if (activity == null) {
                activity = BubbleActivity.instance;
            }
            activity.getWindow().getDecorView().performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
        } catch (Exception unused) {
        }
    }

    public final void setAllowVibration(boolean z) {
        this.allowVibration = z;
    }

    public final void resetVibrationAfterRestart(boolean z) {
        this.resetVibrationAfterRestart = z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.width;
    }

    public final Bitmap getAnimatedBitmap() {
        if (this.renderingBitmap != null) {
            return this.renderingBitmap;
        }
        if (this.nextRenderingBitmap != null) {
            return this.nextRenderingBitmap;
        }
        return null;
    }

    public final boolean hasBitmap() {
        return (this.isRecycled || (this.renderingBitmap == null && this.nextRenderingBitmap == null) || this.isInvalid) ? false : true;
    }

    public final void setInvalidateOnProgressSet(boolean z) {
        this.invalidateOnProgressSet = z;
    }

    public final boolean isGeneratingCache() {
        return this.cacheGenerateTask != null;
    }

    public final boolean isLastFrame() {
        return this.currentFrame == getFramesCount() - 1;
    }

    @Override // org.telegram.messenger.utils.BitmapsCache.Cacheable
    public final void prepareForGenerateCache() {
        File file;
        String file2 = this.args.file.toString();
        NativePtrArgs nativePtrArgs = this.args;
        RLottieNative createFromFile = RLottieNative.createFromFile(file2, nativePtrArgs.json, this.width, this.height, this.createdForFirstFrame ? this.metaData : null, false, nativePtrArgs.colorReplacement, false, nativePtrArgs.fitzModifier, this.layerColors);
        this.generateCacheNative = createFromFile;
        this.generateCacheFramePointer = 0;
        if (createFromFile != null || (file = this.file) == null) {
            return;
        }
        file.delete();
    }

    public final void setGeneratingFrame(int i) {
        this.generateCacheFramePointer = i;
    }

    @Override // org.telegram.messenger.utils.BitmapsCache.Cacheable
    public final int getNextFrame(Bitmap bitmap) {
        RLottieNative rLottieNative = this.generateCacheNative;
        if (rLottieNative == null) {
            return -1;
        }
        if (this.generateCacheFramePointer >= rLottieNative.getFrameCount()) {
            return 0;
        }
        int i = this.shouldLimitFps ? 2 : 1;
        if (this.generateCacheNative.getFrame(this.generateCacheFramePointer, bitmap, true) == -5) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return getNextFrame(bitmap);
        }
        this.generateCacheFramePointer += i;
        return 1;
    }

    public final void cacheFrame(int i) {
        if (this.rawBackgroundBitmapFrame != i || this.rawBackgroundBitmap == null) {
            if (this.rawBackgroundBitmap == null) {
                this.rawBackgroundBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            }
            RLottieNative rLottieNative = this.nativePtr;
            this.rawBackgroundBitmapFrame = i;
            rLottieNative.getFrame(i, this.rawBackgroundBitmap, true);
        }
    }

    public final void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.rawBackgroundBitmap != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(0, 0, this.width, this.height);
            canvas.drawBitmap(this.rawBackgroundBitmap, rect, getBounds(), getPaint());
        }
    }

    @Override // org.telegram.messenger.utils.BitmapsCache.Cacheable
    public final void releaseForGenerateCache() {
        RLottieNative rLottieNative = this.generateCacheNative;
        if (rLottieNative != null) {
            rLottieNative.recycle();
            this.generateCacheNative = null;
        }
    }

    public final void setMasterParent(View view) {
        this.masterParent = view;
    }

    private boolean canLoadFrames() {
        return this.precache ? this.bitmapsCache != null || this.fallbackCache : this.nativePtr != null;
    }

    private static class NativePtrArgs {
        public int[] colorReplacement;
        File file;
        public int fitzModifier;
        String json;
        String name;

        private NativePtrArgs() {
        }
    }

    public final void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.allowDrawFramesWhileCacheGenerating = z;
    }

    public int estimateSizeInCache() {
        int intrinsicWidth = getIntrinsicWidth() * getIntrinsicHeight();
        return this.isSingleChannel ? intrinsicWidth * 2 : intrinsicWidth * 8;
    }

    private void checkChoreographerAfterFrameCall() {
        int i = this.ticksWithoutDraw + 1;
        this.ticksWithoutDraw = i;
        if (i > 10) {
            this.isPaused = true;
        }
        checkChoreographerInternal();
    }

    private void checkChoreographerAfterDrawCall() {
        this.ticksWithoutDraw = 0;
        if (this.isPaused) {
            this.isPaused = false;
            checkChoreographer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onChoreographerFrame(long j) {
        checkChoreographerAfterFrameCall();
        if (this.isChoreographerRegistered) {
            this.swapBuffersAllowedByChoreographer = true;
            invalidateInternal();
        }
    }

    protected final void checkChoreographer() {
        AndroidUtilities.executeOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.RLottieDrawable$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.checkChoreographerInternal();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkChoreographerInternal() {
        if (this.isRunning && !this.isPaused) {
            if (this.isChoreographerRegistered) {
                return;
            }
            int round = Math.round((this.metaData[1] / (this.shouldLimitFps ? 2.0f : 1.0f)) * this.speedMultiply);
            if (round > 0) {
                if (this.metaData[0] == 1 && this.isDice == 0) {
                    return;
                }
                activeChoreographersCount++;
                this.isChoreographerRegistered = true;
                this.ticksWithoutDraw = 0;
                Choreographer60FpsContent.getInstance().addFrameCallback(this.mUiThreadChoreographerCallback, round);
                invalidateInternal();
                return;
            }
            return;
        }
        if (this.isChoreographerRegistered) {
            activeChoreographersCount--;
            this.isChoreographerRegistered = false;
            this.ticksWithoutDraw = 0;
            Choreographer60FpsContent.getInstance().removeFrameCallback(this.mUiThreadChoreographerCallback);
        }
    }
}
