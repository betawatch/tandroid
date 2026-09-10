package org.telegram.messenger;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class ImageReceiver implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.v5 {
    public static final int DEFAULT_CROSSFADE_DURATION = 150;
    private static final int TYPE_CROSSFDADE = 2;
    public static final int TYPE_IMAGE = 0;
    public static final int TYPE_MEDIA = 3;
    public static final int TYPE_THUMB = 1;
    private static final float[] radii;
    private static PorterDuffColorFilter selectedColorFilter;
    private static PorterDuffColorFilter selectedGroupColorFilter;
    private boolean allowCrossfadeWithImage;
    private boolean allowDecodeSingleFrame;
    private boolean allowDrawWhileCacheGenerating;
    private boolean allowLoadingOnAttachedOnly;
    private boolean allowLottieVibration;
    private boolean allowStartAnimation;
    private boolean allowStartLottieAnimation;
    private int animateFromIsPressed;
    public int animatedFileDrawableRepeatMaxCount;
    private boolean animationReadySent;
    private boolean attachedToWindow;
    private int autoRepeat;
    private int autoRepeatCount;
    private long autoRepeatTimeout;
    private Object blendMode;
    private boolean canceledLoading;
    private boolean centerRotation;
    public boolean clip;
    private ColorFilter colorFilter;
    private ComposeShader composeShader;
    private byte crossfadeAlpha;
    private float crossfadeByScale;
    private int crossfadeDuration;
    private Drawable crossfadeImage;
    private String crossfadeKey;
    private BitmapShader crossfadeShader;
    private boolean crossfadeWithOldImage;
    private boolean crossfadeWithThumb;
    private boolean crossfadingWithThumb;
    private int currentAccount;
    private float currentAlpha;
    private int currentCacheType;
    private String currentExt;
    private int currentGuid;
    private Drawable currentImageDrawable;
    private String currentImageFilter;
    private String currentImageKey;
    private ImageLocation currentImageLocation;
    private boolean currentKeyQuality;
    private int currentLayerNum;
    private Drawable currentMediaDrawable;
    private String currentMediaFilter;
    private String currentMediaKey;
    private ImageLocation currentMediaLocation;
    private int currentOpenedLayerFlags;
    private Object currentParentObject;
    private long currentSize;
    private Drawable currentThumbDrawable;
    private String currentThumbFilter;
    private String currentThumbKey;
    private ImageLocation currentThumbLocation;
    private long currentTime;
    private ArrayList<Decorator> decorators;
    private ImageReceiverDelegate delegate;
    private final RectF drawRegion;
    private boolean emojiPaused;
    private int[] emptyRoundRadius;
    private long endTime;
    private int fileLoadingPriority;
    private boolean forceCrossfade;
    private boolean forceLoding;
    private boolean forceNotMedia;
    private boolean forcePreview;
    private Bitmap gradientBitmap;
    private BitmapShader gradientShader;
    private boolean ignoreImageSet;
    public boolean ignoreNotifications;
    private float imageH;
    protected int imageInvert;
    protected int imageOrientation;
    private BitmapShader imageShader;
    private int imageTag;
    private float imageW;
    private float imageX;
    private float imageY;
    private boolean invalidateAll;
    public final Runnable invalidateRunnable;
    private boolean isAspectFit;
    private int isLastFrame;
    private int isPressed;
    private boolean isRoundRect;
    private boolean isRoundVideo;
    private boolean isVisible;
    private long lastUpdateAlphaTime;
    private Bitmap legacyBitmap;
    private Canvas legacyCanvas;
    private Paint legacyPaint;
    private BitmapShader legacyShader;
    private ArrayList<Runnable> loadingOperations;
    private boolean manualAlphaAnimator;
    private Object mark;
    private BitmapShader mediaShader;
    private int mediaTag;
    private boolean needsQualityThumb;
    private float overrideAlpha;
    private int param;
    private Runnable parentRunnable;
    private View parentView;
    List<ImageReceiver> preloadReceivers;
    private float pressedProgress;
    private float previousAlpha;
    private TLRPC.Document qulityThumbDocument;
    private Paint roundPaint;
    private final Path roundPath;
    private final int[] roundRadius;
    private final RectF roundRect;
    private SetImageBackup setImageBackup;
    private final Matrix shaderMatrix;
    private boolean shouldGenerateQualityThumb;
    private float sideClip;
    private boolean skipUpdateFrame;
    private long startTime;
    private Drawable staticThumbDrawable;
    public BitmapShader staticThumbShader;
    private ImageLocation strippedLocation;
    private int thumbInvert;
    private int thumbOrientation;
    public BitmapShader thumbShader;
    private int thumbTag;
    private String uniqKeyPrefix;
    private boolean useRoundForThumb;
    private boolean useRoundRadius;
    public boolean useSharedAnimationQueue;
    private boolean videoThumbIsSame;
    private Runnable visibleInvalidate;

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface ImageReceiverDelegate {
        void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12);

        void didSetImageBitmap(int i10, String str, Drawable drawable);

        void onAnimationReady(ImageReceiver imageReceiver);
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class ReactionLastFrame extends BitmapDrawable {
        public static final float LAST_FRAME_SCALE = 1.2f;

        public ReactionLastFrame(Bitmap bitmap) {
            super(bitmap);
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class SetImageBackup {
        public int cacheType;
        public String ext;
        public String imageFilter;
        public ImageLocation imageLocation;
        public String mediaFilter;
        public ImageLocation mediaLocation;
        public Object parentObject;
        public long size;
        public Drawable thumb;
        public String thumbFilter;
        public ImageLocation thumbLocation;

        private SetImageBackup() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clear() {
            this.imageLocation = null;
            this.thumbLocation = null;
            this.mediaLocation = null;
            this.thumb = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isSet() {
            return (this.imageLocation == null && this.thumbLocation == null && this.mediaLocation == null && this.thumb == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isWebfileSet() {
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation != null && (imageLocation.webFile != null || imageLocation.path != null)) {
                return true;
            }
            ImageLocation imageLocation2 = this.thumbLocation;
            if (imageLocation2 != null && (imageLocation2.webFile != null || imageLocation2.path != null)) {
                return true;
            }
            ImageLocation imageLocation3 = this.mediaLocation;
            if (imageLocation3 != null) {
                return (imageLocation3.webFile == null && imageLocation3.path == null) ? false : true;
            }
            return false;
        }
    }

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        selectedColorFilter = new PorterDuffColorFilter(-2236963, mode);
        selectedGroupColorFilter = new PorterDuffColorFilter(-4473925, mode);
        radii = new float[8];
    }

    public ImageReceiver() {
        this(null);
    }

    private void checkAlphaAnimation(boolean z10, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        if (this.manualAlphaAnimator) {
            return;
        }
        float f7 = this.currentAlpha;
        if (f7 != 1.0f) {
            if (!z10) {
                if (backgroundThreadDrawHolder != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = this.lastUpdateAlphaTime;
                    long j10 = currentTimeMillis - j3;
                    if (j3 == 0) {
                        j10 = 16;
                    }
                    if (j10 > 30 && AndroidUtilities.screenRefreshRate > 60.0f) {
                        j10 = 30;
                    }
                    this.currentAlpha = (j10 / this.crossfadeDuration) + this.currentAlpha;
                } else {
                    this.currentAlpha = (16.0f / this.crossfadeDuration) + f7;
                }
                if (this.currentAlpha > 1.0f) {
                    this.currentAlpha = 1.0f;
                    this.previousAlpha = 1.0f;
                    if (this.crossfadeImage != null) {
                        recycleBitmap(null, 2);
                        this.crossfadeShader = null;
                    }
                }
            }
            if (backgroundThreadDrawHolder != null) {
                AndroidUtilities.runOnUIThread(new g1(this, 23));
            } else {
                invalidate();
            }
        }
    }

    private void drawBitmapDrawable(Canvas canvas, BitmapDrawable bitmapDrawable, BackgroundThreadDrawHolder backgroundThreadDrawHolder, int i10) {
        if (backgroundThreadDrawHolder == null) {
            bitmapDrawable.setAlpha(i10);
            if (bitmapDrawable instanceof hj0) {
                ((hj0) bitmapDrawable).q(canvas, null, false, this.currentTime, 0);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.c6) {
                ((org.telegram.ui.Components.c6) bitmapDrawable).l(canvas, false, this.currentTime, 0);
                return;
            } else {
                bitmapDrawable.draw(canvas);
                return;
            }
        }
        if (bitmapDrawable instanceof hj0) {
            hj0 hj0Var = (hj0) bitmapDrawable;
            float f7 = backgroundThreadDrawHolder.imageX;
            float f10 = backgroundThreadDrawHolder.imageY;
            float f11 = backgroundThreadDrawHolder.imageW;
            float f12 = backgroundThreadDrawHolder.imageH;
            ColorFilter colorFilter = backgroundThreadDrawHolder.colorFilter;
            int i11 = backgroundThreadDrawHolder.threadIndex;
            Paint[] paintArr = hj0Var.k0;
            RectF[] rectFArr = hj0Var.j0;
            if (rectFArr[i11] == null) {
                rectFArr[i11] = new RectF();
                Paint paint = new Paint(1);
                paintArr[i11] = paint;
                paint.setFilterBitmap(true);
            }
            paintArr[i11].setAlpha(i10);
            paintArr[i11].setColorFilter(colorFilter);
            rectFArr[i11].set(f7, f10, f7 + f11, f12 + f10);
            hj0Var.q(canvas, null, true, 0L, i11);
            return;
        }
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.c6)) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                if (backgroundThreadDrawHolder.paint == null) {
                    backgroundThreadDrawHolder.paint = new Paint(1);
                }
                backgroundThreadDrawHolder.paint.setAlpha(i10);
                backgroundThreadDrawHolder.paint.setColorFilter(backgroundThreadDrawHolder.colorFilter);
                canvas.save();
                canvas.translate(backgroundThreadDrawHolder.imageX, backgroundThreadDrawHolder.imageY);
                canvas.scale(backgroundThreadDrawHolder.imageW / bitmap.getWidth(), backgroundThreadDrawHolder.imageH / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, backgroundThreadDrawHolder.paint);
                canvas.restore();
                return;
            }
            return;
        }
        org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) bitmapDrawable;
        float f13 = backgroundThreadDrawHolder.imageX;
        float f14 = backgroundThreadDrawHolder.imageY;
        float f15 = backgroundThreadDrawHolder.imageW;
        float f16 = backgroundThreadDrawHolder.imageH;
        ColorFilter colorFilter2 = backgroundThreadDrawHolder.colorFilter;
        int i12 = backgroundThreadDrawHolder.threadIndex;
        Paint[] paintArr2 = c6Var.q0;
        RectF[] rectFArr2 = c6Var.p0;
        if (rectFArr2[i12] == null) {
            rectFArr2[i12] = new RectF();
            Paint paint2 = new Paint();
            paintArr2[i12] = paint2;
            paint2.setFilterBitmap(true);
        }
        paintArr2[i12].setAlpha(i10);
        paintArr2[i12].setColorFilter(colorFilter2);
        rectFArr2[i12].set(f13, f14, f15 + f13, f16 + f14);
        c6Var.l(canvas, true, 0L, i12);
    }

    private void drawDrawable(Canvas canvas, Drawable drawable, int i10, BitmapShader bitmapShader, int i11, int i12, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        if (this.isPressed == 0) {
            float f7 = this.pressedProgress;
            if (f7 != 0.0f) {
                float f10 = f7 - 0.10666667f;
                this.pressedProgress = f10;
                if (f10 < 0.0f) {
                    this.pressedProgress = 0.0f;
                }
                invalidate();
            }
        }
        int i13 = this.isPressed;
        if (i13 != 0) {
            this.pressedProgress = 1.0f;
            this.animateFromIsPressed = i13;
        }
        float f11 = this.pressedProgress;
        if (f11 == 0.0f || f11 == 1.0f) {
            drawDrawable(canvas, drawable, i10, bitmapShader, i11, i12, i13, backgroundThreadDrawHolder);
        } else {
            drawDrawable(canvas, drawable, i10, bitmapShader, i11, i12, i13, backgroundThreadDrawHolder);
            drawDrawable(canvas, drawable, (int) (i10 * this.pressedProgress), bitmapShader, i11, i12, this.animateFromIsPressed, backgroundThreadDrawHolder);
        }
    }

    public static File getAvatarLocalFile(int i10, TLObject tLObject) {
        try {
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i10, tLObject, 1);
            File localFile = FileLoader.getInstance(i10).getLocalFile(forUserOrChat);
            if (localFile != null) {
                return localFile;
            }
            String key = forUserOrChat.getKey(tLObject, forUserOrChat, true);
            if (forUserOrChat.path != null) {
                key = key + "." + ImageLoader.getHttpUrlExtension(forUserOrChat.path, "jpg");
            } else {
                TLRPC.PhotoSize photoSize = forUserOrChat.photoSize;
                if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
                    if (forUserOrChat.location != null) {
                        key = key + ".jpg";
                    } else {
                        WebFile webFile = forUserOrChat.webFile;
                        if (webFile != null) {
                            key = key + "." + ImageLoader.getHttpUrlExtension(forUserOrChat.webFile.url, FileLoader.getMimeTypePart(webFile.mime_type));
                        } else if (forUserOrChat.secureDocument != null) {
                            key = key + ".jpg";
                        } else {
                            TLRPC.Document document = forUserOrChat.document;
                            if (document != null) {
                                String documentFileName = FileLoader.getDocumentFileName(document);
                                int lastIndexOf = documentFileName.lastIndexOf(46);
                                String str = "";
                                String substring = lastIndexOf == -1 ? "" : documentFileName.substring(lastIndexOf);
                                if (substring.length() > 1) {
                                    str = substring;
                                } else if ("video/mp4".equals(forUserOrChat.document.mime_type)) {
                                    str = ".mp4";
                                } else if ("video/x-matroska".equals(forUserOrChat.document.mime_type)) {
                                    str = ".mkv";
                                }
                                key = key + str;
                            }
                        }
                    }
                }
                key = key + ".jpg";
            }
            File file = new File(FileLoader.getDirectory(4), key);
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private boolean hasRoundRadius() {
        return true;
    }

    private void loadImage() {
        ImageLoader.getInstance().loadImageForImageReceiver(this, this.preloadReceivers);
        invalidate();
    }

    private void onBitmapException(Drawable drawable) {
        if (drawable == this.currentMediaDrawable && this.currentMediaKey != null) {
            ImageLoader.getInstance().removeImage(this.currentMediaKey);
            this.currentMediaKey = null;
        } else if (drawable == this.currentImageDrawable && this.currentImageKey != null) {
            ImageLoader.getInstance().removeImage(this.currentImageKey);
            this.currentImageKey = null;
        } else if (drawable == this.currentThumbDrawable && this.currentThumbKey != null) {
            ImageLoader.getInstance().removeImage(this.currentThumbKey);
            this.currentThumbKey = null;
        }
        setImage(this.currentMediaLocation, this.currentMediaFilter, this.currentImageLocation, this.currentImageFilter, this.currentThumbLocation, this.currentThumbFilter, this.currentThumbDrawable, this.currentSize, this.currentExt, this.currentParentObject, this.currentCacheType);
    }

    private void setDrawableShader(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.currentThumbDrawable) {
            this.thumbShader = bitmapShader;
            return;
        }
        if (drawable == this.staticThumbDrawable) {
            this.staticThumbShader = bitmapShader;
            return;
        }
        if (drawable == this.currentMediaDrawable) {
            this.mediaShader = bitmapShader;
            return;
        }
        if (drawable == this.currentImageDrawable) {
            this.imageShader = bitmapShader;
            if (this.gradientShader == null || !(drawable instanceof BitmapDrawable)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.composeShader = new ComposeShader(this.gradientShader, this.imageShader, PorterDuff.Mode.DST_IN);
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int width = bitmapDrawable.getBitmap().getWidth();
            int height = bitmapDrawable.getBitmap().getHeight();
            Bitmap bitmap = this.legacyBitmap;
            if (bitmap != null && bitmap.getWidth() == width && this.legacyBitmap.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.legacyBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.legacyBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.legacyCanvas = new Canvas(this.legacyBitmap);
            Bitmap bitmap3 = this.legacyBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.legacyShader = new BitmapShader(bitmap3, tileMode, tileMode);
            if (this.legacyPaint == null) {
                Paint paint = new Paint();
                this.legacyPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setStaticDrawable(Drawable drawable) {
        org.telegram.ui.Components.w6 w6Var;
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable == drawable2) {
            return;
        }
        if (!(drawable2 instanceof org.telegram.ui.Components.w6)) {
            w6Var = null;
        } else if (drawable2.equals(drawable)) {
            return;
        } else {
            w6Var = (org.telegram.ui.Components.w6) this.staticThumbDrawable;
        }
        this.staticThumbDrawable = drawable;
        if (this.attachedToWindow && (drawable instanceof org.telegram.ui.Components.w6)) {
            ((org.telegram.ui.Components.w6) drawable).c(this);
        }
        if (!this.attachedToWindow || w6Var == null) {
            return;
        }
        w6Var.b(this);
    }

    private void updateDrawableRadius(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        boolean z10 = true;
        int[] roundRadius = getRoundRadius(true);
        if (!(drawable instanceof kq)) {
            if ((!hasRoundRadius() && this.gradientShader == null) || (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.g9))) {
                setDrawableShader(drawable, null);
                return;
            }
            if (drawable instanceof org.telegram.ui.Components.g9) {
                ((org.telegram.ui.Components.g9) drawable).r = roundRadius[0];
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable instanceof hj0) {
                return;
            }
            if (bitmapDrawable instanceof org.telegram.ui.Components.c6) {
                ((org.telegram.ui.Components.c6) drawable).B(roundRadius);
                return;
            } else {
                if (bitmapDrawable.getBitmap() == null || bitmapDrawable.getBitmap().isRecycled()) {
                    return;
                }
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                setDrawableShader(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                return;
            }
        }
        kq kqVar = (kq) drawable;
        float f7 = roundRadius[0];
        float f10 = roundRadius[1];
        float f11 = roundRadius[2];
        float f12 = roundRadius[3];
        float[] fArr = kqVar.f;
        float max = Math.max(0.0f, f7);
        fArr[1] = max;
        fArr[0] = max;
        float max2 = Math.max(0.0f, f10);
        fArr[3] = max2;
        fArr[2] = max2;
        float max3 = Math.max(0.0f, f11);
        fArr[5] = max3;
        fArr[4] = max3;
        float max4 = Math.max(0.0f, f12);
        fArr[7] = max4;
        fArr[6] = max4;
        if (f7 <= 0.0f && f10 <= 0.0f && f11 <= 0.0f && f12 <= 0.0f) {
            z10 = false;
        }
        kqVar.e = z10;
        kqVar.a();
    }

    public void addDecorator(Decorator decorator) {
        if (this.decorators == null) {
            this.decorators = new ArrayList<>();
        }
        this.decorators.add(decorator);
        if (this.attachedToWindow) {
            decorator.onAttachedToWindow(this);
        }
    }

    public void addLoadingImageRunnable(Runnable runnable) {
        this.loadingOperations.add(runnable);
    }

    public void bumpPriority() {
        ImageLoader.getInstance().changeFileLoadingPriorityForImageReceiver(this);
    }

    public boolean canInvertBitmap() {
        return (this.currentMediaDrawable instanceof ExtendedBitmapDrawable) || (this.currentImageDrawable instanceof ExtendedBitmapDrawable) || (this.currentThumbDrawable instanceof ExtendedBitmapDrawable) || (this.staticThumbDrawable instanceof ExtendedBitmapDrawable);
    }

    public void cancelLoadImage() {
        this.forceLoding = false;
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
        this.canceledLoading = true;
    }

    public void clearDecorators() {
        if (this.decorators != null) {
            if (this.attachedToWindow) {
                for (int i10 = 0; i10 < this.decorators.size(); i10++) {
                    this.decorators.get(i10).onDetachedFromWidnow();
                }
            }
            this.decorators.clear();
        }
    }

    public void clearImage() {
        for (int i10 = 0; i10 < 4; i10++) {
            recycleBitmap(null, i10);
        }
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.didReplacedPhotoInMemCache) {
            String str = (String) objArr[0];
            String str2 = this.currentMediaKey;
            if (str2 != null && str2.equals(str)) {
                this.currentMediaKey = (String) objArr[1];
                ImageLocation imageLocation = (ImageLocation) objArr[2];
                this.currentMediaLocation = imageLocation;
                SetImageBackup setImageBackup = this.setImageBackup;
                if (setImageBackup != null) {
                    setImageBackup.mediaLocation = imageLocation;
                }
            }
            String str3 = this.currentImageKey;
            if (str3 != null && str3.equals(str)) {
                this.currentImageKey = (String) objArr[1];
                ImageLocation imageLocation2 = (ImageLocation) objArr[2];
                this.currentImageLocation = imageLocation2;
                SetImageBackup setImageBackup2 = this.setImageBackup;
                if (setImageBackup2 != null) {
                    setImageBackup2.imageLocation = imageLocation2;
                }
            }
            String str4 = this.currentThumbKey;
            if (str4 == null || !str4.equals(str)) {
                return;
            }
            this.currentThumbKey = (String) objArr[1];
            ImageLocation imageLocation3 = (ImageLocation) objArr[2];
            this.currentThumbLocation = imageLocation3;
            SetImageBackup setImageBackup3 = this.setImageBackup;
            if (setImageBackup3 != null) {
                setImageBackup3.thumbLocation = imageLocation3;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.currentLayerNum >= num.intValue()) {
                return;
            }
            int intValue = num.intValue() | this.currentOpenedLayerFlags;
            this.currentOpenedLayerFlags = intValue;
            if (intValue != 0) {
                hj0 lottieAnimation = getLottieAnimation();
                if (lottieAnimation != null && lottieAnimation.z()) {
                    lottieAnimation.stop();
                }
                org.telegram.ui.Components.c6 animation = getAnimation();
                if (animation != null) {
                    animation.stop();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.currentLayerNum >= num2.intValue() || (i12 = this.currentOpenedLayerFlags) == 0) {
                return;
            }
            int i13 = (~num2.intValue()) & i12;
            this.currentOpenedLayerFlags = i13;
            if (i13 == 0) {
                hj0 lottieAnimation2 = getLottieAnimation();
                if (lottieAnimation2 != null) {
                    lottieAnimation2.E = this.allowLottieVibration;
                }
                if (this.allowStartLottieAnimation && lottieAnimation2 != null && lottieAnimation2.z()) {
                    lottieAnimation2.start();
                }
                org.telegram.ui.Components.c6 animation2 = getAnimation();
                if (!this.allowStartAnimation || animation2 == null) {
                    return;
                }
                animation2.j();
                invalidate();
            }
        }
    }

    public boolean draw(Canvas canvas) {
        return draw(canvas, null);
    }

    public boolean getAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public float getAlpha() {
        return this.overrideAlpha;
    }

    public org.telegram.ui.Components.p5 getAnimatedEmojiDrawable() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.p5) {
            return (org.telegram.ui.Components.p5) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof org.telegram.ui.Components.p5) {
            return (org.telegram.ui.Components.p5) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.p5) {
            return (org.telegram.ui.Components.p5) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof org.telegram.ui.Components.p5) {
            return (org.telegram.ui.Components.p5) drawable4;
        }
        return null;
    }

    public int getAnimatedOrientation() {
        org.telegram.ui.Components.c6 animation = getAnimation();
        if (animation != null) {
            return animation.d[2];
        }
        return 0;
    }

    public org.telegram.ui.Components.c6 getAnimation() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.c6) {
            return (org.telegram.ui.Components.c6) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof org.telegram.ui.Components.c6) {
            return (org.telegram.ui.Components.c6) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.c6) {
            return (org.telegram.ui.Components.c6) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof org.telegram.ui.Components.c6) {
            return (org.telegram.ui.Components.c6) drawable4;
        }
        return null;
    }

    public int getAutoRepeat() {
        return this.autoRepeat;
    }

    public Bitmap getBitmap() {
        hj0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && lottieAnimation.u()) {
            if (lottieAnimation.R != null) {
                return lottieAnimation.R;
            }
            if (lottieAnimation.S != null) {
                return lottieAnimation.S;
            }
            return null;
        }
        org.telegram.ui.Components.c6 animation = getAnimation();
        if (animation != null && animation.s()) {
            return animation.m();
        }
        Drawable drawable = this.currentMediaDrawable;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.c6) && !(drawable instanceof hj0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.currentImageDrawable;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.c6) && !(drawable instanceof hj0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.c6) && !(drawable instanceof hj0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable4).getBitmap();
        }
        return null;
    }

    public int getBitmapHeight() {
        getDrawable();
        org.telegram.ui.Components.c6 animation = getAnimation();
        if (animation != null) {
            int i10 = this.imageOrientation;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? animation.getIntrinsicHeight() : animation.getIntrinsicWidth();
        }
        hj0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.c;
        }
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            int i11 = this.imageOrientation;
            return (i11 % 360 == 0 || i11 % 360 == 180) ? bitmap.getHeight() : bitmap.getWidth();
        }
        Drawable drawable = this.staticThumbDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BitmapHolder getBitmapSafe() {
        Bitmap bitmap;
        String str;
        org.telegram.ui.Components.c6 animation = getAnimation();
        hj0 lottieAnimation = getLottieAnimation();
        int i10 = 0;
        if (lottieAnimation != null && lottieAnimation.u()) {
            bitmap = lottieAnimation.R != null ? lottieAnimation.R : lottieAnimation.S != null ? lottieAnimation.S : null;
        } else {
            if (animation == null || !animation.s()) {
                Drawable drawable = this.currentMediaDrawable;
                if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.c6) || (drawable instanceof hj0)) {
                    Drawable drawable2 = this.currentImageDrawable;
                    if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.c6) || (drawable instanceof hj0)) {
                        Drawable drawable3 = this.currentThumbDrawable;
                        if (!(drawable3 instanceof BitmapDrawable) || (drawable3 instanceof org.telegram.ui.Components.c6) || (drawable instanceof hj0)) {
                            Drawable drawable4 = this.staticThumbDrawable;
                            if (drawable4 instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) drawable4).getBitmap();
                            } else {
                                bitmap = null;
                                str = null;
                            }
                        } else {
                            bitmap = ((BitmapDrawable) drawable3).getBitmap();
                            str = this.currentThumbKey;
                        }
                    } else {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                        str = this.currentImageKey;
                    }
                } else {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    str = this.currentMediaKey;
                }
                if (bitmap == null) {
                    return new BitmapHolder(bitmap, str, i10);
                }
                return null;
            }
            Bitmap m10 = animation.m();
            i10 = animation.d[2];
            if (i10 != 0) {
                return new BitmapHolder(Bitmap.createBitmap(m10), (String) null, i10);
            }
            bitmap = m10;
        }
        str = null;
        if (bitmap == null) {
        }
    }

    public int getBitmapWidth() {
        getDrawable();
        org.telegram.ui.Components.c6 animation = getAnimation();
        if (animation != null) {
            int i10 = this.imageOrientation;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? animation.getIntrinsicWidth() : animation.getIntrinsicHeight();
        }
        hj0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.b;
        }
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            int i11 = this.imageOrientation;
            return (i11 % 360 == 0 || i11 % 360 == 180) ? bitmap.getWidth() : bitmap.getHeight();
        }
        Drawable drawable = this.staticThumbDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 1;
    }

    public int getCacheType() {
        return this.currentCacheType;
    }

    public float getCenterX() {
        return (this.imageW / 2.0f) + this.imageX;
    }

    public float getCenterY() {
        return (this.imageH / 2.0f) + this.imageY;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public float getCurrentAlpha() {
        return this.currentAlpha;
    }

    public RectF getDrawRegion() {
        return this.drawRegion;
    }

    public Drawable getDrawable() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public BitmapHolder getDrawableSafe() {
        String str;
        String str2;
        Drawable drawable = this.currentMediaDrawable;
        if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.c6) || (drawable instanceof hj0)) {
            Drawable drawable2 = this.currentImageDrawable;
            if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.c6) || (drawable instanceof hj0)) {
                drawable2 = this.currentThumbDrawable;
                if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.c6) || (drawable instanceof hj0)) {
                    drawable = this.staticThumbDrawable;
                    if (drawable instanceof BitmapDrawable) {
                        str = null;
                    } else {
                        drawable = null;
                        str = null;
                    }
                } else {
                    str2 = this.currentThumbKey;
                }
            } else {
                str2 = this.currentImageKey;
            }
            Drawable drawable3 = drawable2;
            str = str2;
            drawable = drawable3;
        } else {
            str = this.currentMediaKey;
        }
        if (drawable != null) {
            return new BitmapHolder(drawable, str, 0);
        }
        return null;
    }

    public String getExt() {
        return this.currentExt;
    }

    public int getFileLoadingPriority() {
        return this.fileLoadingPriority;
    }

    public float getImageAspectRatio() {
        float width;
        float height;
        if (this.imageOrientation % 180 != 0) {
            width = this.drawRegion.height();
            height = this.drawRegion.width();
        } else {
            width = this.drawRegion.width();
            height = this.drawRegion.height();
        }
        return width / height;
    }

    public Drawable getImageDrawable() {
        return this.currentImageDrawable;
    }

    public String getImageFilter() {
        return this.currentImageFilter;
    }

    public float getImageHeight() {
        return this.imageH;
    }

    public String getImageKey() {
        return this.currentImageKey;
    }

    public ImageLocation getImageLocation() {
        return this.currentImageLocation;
    }

    public float getImageWidth() {
        return this.imageW;
    }

    public float getImageX() {
        return this.imageX;
    }

    public float getImageX2() {
        return this.imageX + this.imageW;
    }

    public float getImageY() {
        return this.imageY;
    }

    public float getImageY2() {
        return this.imageY + this.imageH;
    }

    public int getInvert() {
        return this.imageInvert;
    }

    public ArrayList<Runnable> getLoadingOperations() {
        return this.loadingOperations;
    }

    public hj0 getLottieAnimation() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof hj0) {
            return (hj0) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof hj0) {
            return (hj0) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof hj0) {
            return (hj0) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof hj0) {
            return (hj0) drawable4;
        }
        return null;
    }

    public Object getMark() {
        return this.mark;
    }

    public Drawable getMediaDrawable() {
        return this.currentMediaDrawable;
    }

    public String getMediaFilter() {
        return this.currentMediaFilter;
    }

    public String getMediaKey() {
        return this.currentMediaKey;
    }

    public ImageLocation getMediaLocation() {
        return this.currentMediaLocation;
    }

    public int getNewGuid() {
        int i10 = this.currentGuid + 1;
        this.currentGuid = i10;
        return i10;
    }

    public int getOrientation() {
        return this.imageOrientation;
    }

    public int getParam() {
        return this.param;
    }

    public Object getParentObject() {
        return this.currentParentObject;
    }

    public void getParentPosition(int[] iArr) {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        view.getLocationInWindow(iArr);
    }

    public View getParentView() {
        return this.parentView;
    }

    public boolean getPressed() {
        return this.isPressed != 0;
    }

    public TLRPC.Document getQualityThumbDocument() {
        return this.qulityThumbDocument;
    }

    public int[] getRoundRadius() {
        return this.roundRadius;
    }

    public long getSize() {
        return this.currentSize;
    }

    public Drawable getStaticThumb() {
        return this.staticThumbDrawable;
    }

    public ImageLocation getStrippedLocation() {
        return this.strippedLocation;
    }

    public int getTag(int i10) {
        return i10 == 1 ? this.thumbTag : i10 == 3 ? this.mediaTag : this.imageTag;
    }

    public Drawable getThumb() {
        return this.currentThumbDrawable;
    }

    public Bitmap getThumbBitmap() {
        Drawable drawable = this.currentThumbDrawable;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable2 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        return null;
    }

    public BitmapHolder getThumbBitmapSafe() {
        Bitmap bitmap;
        String str;
        Drawable drawable = this.currentThumbDrawable;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            str = this.currentThumbKey;
        } else {
            Drawable drawable2 = this.staticThumbDrawable;
            if (drawable2 instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable2).getBitmap();
                str = null;
            } else {
                bitmap = null;
                str = null;
            }
        }
        if (bitmap != null) {
            return new BitmapHolder(bitmap, str, 0);
        }
        return null;
    }

    public String getThumbFilter() {
        return this.currentThumbFilter;
    }

    public String getThumbKey() {
        return this.currentThumbKey;
    }

    public ImageLocation getThumbLocation() {
        return this.currentThumbLocation;
    }

    public String getUniqKeyPrefix() {
        return this.uniqKeyPrefix;
    }

    public boolean getVisible() {
        return this.isVisible;
    }

    public boolean hasBitmapImage() {
        return (this.currentImageDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true;
    }

    public boolean hasImageLoaded() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null) ? false : true;
    }

    public boolean hasImageSet() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentImageKey == null && this.currentMediaKey == null) ? false : true;
    }

    public boolean hasMediaSet() {
        return this.currentMediaDrawable != null;
    }

    public boolean hasNotThumb() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null && !(this.staticThumbDrawable instanceof d71)) ? false : true;
    }

    public boolean hasNotThumbOrOnlyStaticThumb() {
        if (this.currentImageDrawable != null || this.currentMediaDrawable != null) {
            return true;
        }
        Drawable drawable = this.staticThumbDrawable;
        if (drawable instanceof d71) {
            return true;
        }
        return drawable != null && !(drawable instanceof org.telegram.ui.Components.g9) && this.currentImageKey == null && this.currentMediaKey == null;
    }

    public boolean hasStaticThumb() {
        return this.staticThumbDrawable != null;
    }

    public void invalidate() {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        if (this.invalidateAll) {
            view.invalidate();
            return;
        }
        float f7 = this.imageX;
        float f10 = this.imageY;
        view.invalidate((int) f7, (int) f10, (int) (f7 + this.imageW), (int) (f10 + this.imageH));
    }

    public boolean isAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public boolean isAnimationRunning() {
        org.telegram.ui.Components.c6 animation = getAnimation();
        return animation != null && animation.b0;
    }

    public boolean isAspectFit() {
        return this.isAspectFit;
    }

    public boolean isAttachedToWindow() {
        return this.attachedToWindow;
    }

    public boolean isCrossfadingWithOldImage() {
        return (!this.crossfadeWithOldImage || this.crossfadeImage == null || this.crossfadingWithThumb) ? false : true;
    }

    public boolean isCurrentKeyQuality() {
        return this.currentKeyQuality;
    }

    public boolean isForceLoding() {
        return this.forceLoding;
    }

    public boolean isForcePreview() {
        return this.forcePreview;
    }

    public boolean isInsideImage(float f7, float f10) {
        float f11 = this.imageX;
        if (f7 < f11 || f7 > f11 + this.imageW) {
            return false;
        }
        float f12 = this.imageY;
        return f10 >= f12 && f10 <= f12 + this.imageH;
    }

    public boolean isLottieRunning() {
        hj0 lottieAnimation = getLottieAnimation();
        return lottieAnimation != null && lottieAnimation.l0;
    }

    public boolean isNeedsQualityThumb() {
        return this.needsQualityThumb;
    }

    public boolean isShouldGenerateQualityThumb() {
        return this.shouldGenerateQualityThumb;
    }

    public void moveImageToFront() {
        ImageLoader.getInstance().moveToFront(this.currentImageKey);
        ImageLoader.getInstance().moveToFront(this.currentThumbKey);
    }

    public void moveLottieToFront() {
        BitmapDrawable bitmapDrawable;
        String str;
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof hj0) {
            bitmapDrawable = (BitmapDrawable) drawable;
            str = this.currentMediaKey;
        } else {
            Drawable drawable2 = this.currentImageDrawable;
            if (drawable2 instanceof hj0) {
                bitmapDrawable = (BitmapDrawable) drawable2;
                str = this.currentImageKey;
            } else {
                bitmapDrawable = null;
                str = null;
            }
        }
        if (str == null || bitmapDrawable == null) {
            return;
        }
        ImageLoader.getInstance().moveToFront(str);
        if (ImageLoader.getInstance().isInMemCache(str, true)) {
            return;
        }
        ImageLoader.getInstance().getLottieMemCahce().put(str, bitmapDrawable);
    }

    public boolean onAttachedToWindow() {
        if (!this.attachedToWindow) {
            this.attachedToWindow = true;
            this.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.currentLayerNum);
            if (!this.ignoreNotifications) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReplacedPhotoInMemCache);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
            }
            if (setBackupImage()) {
                return true;
            }
            hj0 lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.J.add(this);
                lottieAnimation.E = this.allowLottieVibration;
            }
            if (lottieAnimation != null && this.allowStartLottieAnimation && (!lottieAnimation.z() || this.currentOpenedLayerFlags == 0)) {
                lottieAnimation.start();
            }
            org.telegram.ui.Components.c6 animation = getAnimation();
            if (animation != null) {
                animation.e(this);
            }
            if (animation != null && this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                animation.j();
                invalidate();
            }
            org.telegram.ui.Components.p5 animatedEmojiDrawable = getAnimatedEmojiDrawable();
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.b(this);
            }
            if (NotificationCenter.getGlobalInstance().isAnimationInProgress()) {
                didReceivedNotification(NotificationCenter.stopAllHeavyOperations, this.currentAccount, 512);
            }
            Object obj = this.staticThumbDrawable;
            if (obj instanceof org.telegram.ui.Components.w6) {
                ((org.telegram.ui.Components.w6) obj).c(this);
            }
            if (this.decorators != null) {
                for (int i10 = 0; i10 < this.decorators.size(); i10++) {
                    this.decorators.get(i10).onAttachedToWindow(this);
                }
            }
        }
        return false;
    }

    public void onDetachedFromWindow() {
        if (this.attachedToWindow) {
            this.attachedToWindow = false;
            if (this.currentImageLocation != null || this.currentMediaLocation != null || this.currentThumbLocation != null || this.staticThumbDrawable != null) {
                if (this.setImageBackup == null) {
                    this.setImageBackup = new SetImageBackup();
                }
                SetImageBackup setImageBackup = this.setImageBackup;
                setImageBackup.mediaLocation = this.currentMediaLocation;
                setImageBackup.mediaFilter = this.currentMediaFilter;
                setImageBackup.imageLocation = this.currentImageLocation;
                setImageBackup.imageFilter = this.currentImageFilter;
                setImageBackup.thumbLocation = this.currentThumbLocation;
                setImageBackup.thumbFilter = this.currentThumbFilter;
                setImageBackup.thumb = this.staticThumbDrawable;
                setImageBackup.size = this.currentSize;
                setImageBackup.ext = this.currentExt;
                setImageBackup.cacheType = this.currentCacheType;
                setImageBackup.parentObject = this.currentParentObject;
            }
            if (!this.ignoreNotifications) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReplacedPhotoInMemCache);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopAllHeavyOperations);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startAllHeavyOperations);
            }
            Object obj = this.staticThumbDrawable;
            if (obj instanceof org.telegram.ui.Components.w6) {
                ((org.telegram.ui.Components.w6) obj).b(this);
            }
            if (this.staticThumbDrawable != null) {
                setStaticDrawable(null);
                this.staticThumbShader = null;
            }
            clearImage();
            this.roundPaint.setShader(null);
            if (this.isPressed == 0) {
                this.pressedProgress = 0.0f;
            }
            org.telegram.ui.Components.p5 animatedEmojiDrawable = getAnimatedEmojiDrawable();
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.p(this);
            }
            org.telegram.ui.Components.c6 animation = getAnimation();
            if (animation != null) {
                animation.v(this);
            }
            hj0 lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.F(this);
            }
            if (this.decorators != null) {
                for (int i10 = 0; i10 < this.decorators.size(); i10++) {
                    this.decorators.get(i10).onDetachedFromWidnow();
                }
            }
        }
    }

    public void recycleBitmap(String str, int i10) {
        String str2;
        Drawable drawable;
        String replacedKey;
        if (i10 == 3) {
            str2 = this.currentMediaKey;
            drawable = this.currentMediaDrawable;
        } else if (i10 == 2) {
            str2 = this.crossfadeKey;
            drawable = this.crossfadeImage;
        } else if (i10 == 1) {
            str2 = this.currentThumbKey;
            drawable = this.currentThumbDrawable;
        } else {
            str2 = this.currentImageKey;
            drawable = this.currentImageDrawable;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (replacedKey = ImageLoader.getInstance().getReplacedKey(str2)) != null)) {
            str2 = replacedKey;
        }
        if (drawable instanceof hj0) {
            ((hj0) drawable).F(this);
        }
        if (drawable instanceof org.telegram.ui.Components.c6) {
            ((org.telegram.ui.Components.c6) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.p5) {
            ((org.telegram.ui.Components.p5) drawable).p(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof hj0) {
                hj0 hj0Var = (hj0) drawable;
                boolean decrementUseCount = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, true) && decrementUseCount) {
                    hj0Var.C(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.c6) {
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
                if (c6Var.n0) {
                    boolean decrementUseCount2 = ImageLoader.getInstance().decrementUseCount(str2);
                    if (ImageLoader.getInstance().isInMemCache(str2, true)) {
                        if (decrementUseCount2) {
                            c6Var.stop();
                        }
                    } else if (decrementUseCount2) {
                        c6Var.u();
                    }
                } else if (c6Var.t0.isEmpty()) {
                    c6Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean decrementUseCount3 = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, false) && decrementUseCount3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    AndroidUtilities.recycleBitmaps(arrayList);
                }
            }
        }
        if (i10 == 3) {
            this.currentMediaKey = null;
            this.currentMediaDrawable = null;
            this.mediaShader = null;
        } else if (i10 == 2) {
            this.crossfadeKey = null;
            this.crossfadeImage = null;
            this.crossfadeShader = null;
        } else if (i10 == 1) {
            this.currentThumbDrawable = null;
            this.currentThumbKey = null;
            this.thumbShader = null;
        } else {
            this.currentImageDrawable = null;
            this.currentImageKey = null;
            this.imageShader = null;
        }
    }

    public void setAllowDecodeSingleFrame(boolean z10) {
        this.allowDecodeSingleFrame = z10;
    }

    public void setAllowDrawWhileCacheGenerating(boolean z10) {
        this.allowDrawWhileCacheGenerating = z10;
    }

    public void setAllowLoadingOnAttachedOnly(boolean z10) {
        this.allowLoadingOnAttachedOnly = z10;
    }

    public void setAllowLottieVibration(boolean z10) {
        this.allowLottieVibration = z10;
    }

    public void setAllowStartAnimation(boolean z10) {
        this.allowStartAnimation = z10;
    }

    public void setAllowStartLottieAnimation(boolean z10) {
        this.allowStartLottieAnimation = z10;
    }

    public void setAlpha(float f7) {
        this.overrideAlpha = f7;
    }

    public void setAspectFit(boolean z10) {
        this.isAspectFit = z10;
    }

    public void setAutoRepeat(int i10) {
        this.autoRepeat = i10;
        hj0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.K(i10);
        }
    }

    public void setAutoRepeatCount(int i10) {
        this.autoRepeatCount = i10;
        if (getLottieAnimation() != null) {
            getLottieAnimation().M = i10;
            return;
        }
        this.animatedFileDrawableRepeatMaxCount = i10;
        if (getAnimation() != null) {
            getAnimation().y0 = 0;
        }
    }

    public void setAutoRepeatTimeout(long j3) {
        this.autoRepeatTimeout = j3;
        getLottieAnimation();
    }

    public boolean setBackupImage() {
        SetImageBackup setImageBackup = this.setImageBackup;
        if (setImageBackup == null || !setImageBackup.isSet()) {
            return false;
        }
        SetImageBackup setImageBackup2 = this.setImageBackup;
        this.setImageBackup = null;
        Drawable drawable = setImageBackup2.thumb;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (!(bitmapDrawable instanceof hj0) && !(bitmapDrawable instanceof org.telegram.ui.Components.c6) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                setImageBackup2.thumb = null;
            }
        }
        setImage(setImageBackup2.mediaLocation, setImageBackup2.mediaFilter, setImageBackup2.imageLocation, setImageBackup2.imageFilter, setImageBackup2.thumbLocation, setImageBackup2.thumbFilter, setImageBackup2.thumb, setImageBackup2.size, setImageBackup2.ext, setImageBackup2.parentObject, setImageBackup2.cacheType);
        setImageBackup2.clear();
        this.setImageBackup = setImageBackup2;
        hj0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.E = this.allowLottieVibration;
        }
        if (lottieAnimation == null || !this.allowStartLottieAnimation) {
            return true;
        }
        if (lottieAnimation.z() && this.currentOpenedLayerFlags != 0) {
            return true;
        }
        lottieAnimation.start();
        return true;
    }

    public void setBlendMode(Object obj) {
        this.blendMode = obj;
        invalidate();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public void setCrossfadeAlpha(byte b10) {
        this.crossfadeAlpha = b10;
    }

    public void setCrossfadeByScale(float f7) {
        this.crossfadeByScale = f7;
    }

    public void setCrossfadeDuration(int i10) {
        this.crossfadeDuration = i10;
    }

    public void setCrossfadeWithOldImage(boolean z10) {
        this.crossfadeWithOldImage = z10;
    }

    public void setCurrentAccount(int i10) {
        this.currentAccount = i10;
    }

    public void setCurrentAlpha(float f7) {
        this.currentAlpha = f7;
    }

    public void setCurrentTime(long j3) {
        this.currentTime = j3;
    }

    public void setDelegate(ImageReceiverDelegate imageReceiverDelegate) {
        this.delegate = imageReceiverDelegate;
    }

    public BackgroundThreadDrawHolder setDrawInBackgroundThread(BackgroundThreadDrawHolder backgroundThreadDrawHolder, int i10) {
        if (backgroundThreadDrawHolder == null) {
            backgroundThreadDrawHolder = new BackgroundThreadDrawHolder();
        }
        backgroundThreadDrawHolder.threadIndex = i10;
        backgroundThreadDrawHolder.animation = getAnimation();
        backgroundThreadDrawHolder.lottieDrawable = getLottieAnimation();
        boolean z10 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            backgroundThreadDrawHolder.roundRadius[i11] = this.roundRadius[i11];
        }
        backgroundThreadDrawHolder.mediaDrawable = this.currentMediaDrawable;
        backgroundThreadDrawHolder.mediaShader = this.mediaShader;
        backgroundThreadDrawHolder.imageDrawable = this.currentImageDrawable;
        backgroundThreadDrawHolder.imageShader = this.imageShader;
        backgroundThreadDrawHolder.thumbDrawable = this.currentThumbDrawable;
        backgroundThreadDrawHolder.thumbShader = this.thumbShader;
        backgroundThreadDrawHolder.staticThumbShader = this.staticThumbShader;
        backgroundThreadDrawHolder.staticThumbDrawable = this.staticThumbDrawable;
        backgroundThreadDrawHolder.crossfadeImage = this.crossfadeImage;
        backgroundThreadDrawHolder.colorFilter = this.colorFilter;
        backgroundThreadDrawHolder.crossfadingWithThumb = this.crossfadingWithThumb;
        backgroundThreadDrawHolder.crossfadeWithOldImage = this.crossfadeWithOldImage;
        backgroundThreadDrawHolder.currentAlpha = this.currentAlpha;
        backgroundThreadDrawHolder.previousAlpha = this.previousAlpha;
        backgroundThreadDrawHolder.crossfadeShader = this.crossfadeShader;
        if ((backgroundThreadDrawHolder.animation != null && !backgroundThreadDrawHolder.animation.s()) || (backgroundThreadDrawHolder.lottieDrawable != null && !backgroundThreadDrawHolder.lottieDrawable.u())) {
            z10 = true;
        }
        backgroundThreadDrawHolder.animationNotReady = z10;
        backgroundThreadDrawHolder.imageX = this.imageX;
        backgroundThreadDrawHolder.imageY = this.imageY;
        backgroundThreadDrawHolder.imageW = this.imageW;
        backgroundThreadDrawHolder.imageH = this.imageH;
        backgroundThreadDrawHolder.overrideAlpha = this.overrideAlpha;
        return backgroundThreadDrawHolder;
    }

    public void setEmojiPaused(boolean z10) {
        if (this.emojiPaused == z10) {
            return;
        }
        this.emojiPaused = z10;
        this.allowStartLottieAnimation = !z10;
        hj0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            if (z10) {
                lottieAnimation.stop();
            } else {
                if (lottieAnimation.l0) {
                    return;
                }
                lottieAnimation.start();
            }
        }
    }

    public void setFileLoadingPriority(int i10) {
        if (this.fileLoadingPriority != i10) {
            this.fileLoadingPriority = i10;
            if (this.attachedToWindow && hasImageSet()) {
                ImageLoader.getInstance().changeFileLoadingPriorityForImageReceiver(this);
            }
        }
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable) {
        setForUserOrChat(tLObject, drawable, null);
    }

    public void setForceCrossfade(boolean z10) {
        this.forceCrossfade = z10;
    }

    public void setForceLoading(boolean z10) {
        this.forceLoding = z10;
    }

    public void setForceNotMedia(boolean z10) {
        this.forceNotMedia = z10;
    }

    public void setForcePreview(boolean z10) {
        this.forcePreview = z10;
    }

    public void setGradientBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.gradientShader == null || this.gradientBitmap != bitmap) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.gradientShader = new BitmapShader(bitmap, tileMode, tileMode);
                updateDrawableRadius(this.currentImageDrawable);
            }
            this.isRoundRect = true;
        } else {
            this.gradientShader = null;
            this.composeShader = null;
            this.legacyShader = null;
            this.legacyCanvas = null;
            Bitmap bitmap2 = this.legacyBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.legacyBitmap = null;
            }
        }
        this.gradientBitmap = bitmap;
    }

    public void setIgnoreImageSet(boolean z10) {
        this.ignoreImageSet = z10;
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, String str2, Object obj, int i10) {
        setImage(imageLocation, str, null, null, drawable, 0L, str2, obj, i10);
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c0, code lost:
    
        if ((r9 instanceof org.telegram.messenger.Emoji.EmojiDrawable) == false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        org.telegram.ui.Components.c6 animation;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        boolean z11;
        ImageReceiverDelegate imageReceiverDelegate;
        boolean z12;
        if (drawable != null && str != null && this.currentGuid == i11) {
            if (i10 == 0) {
                if (str.equals(this.currentImageKey)) {
                    ImageReceiverDelegate imageReceiverDelegate2 = this.delegate;
                    if (imageReceiverDelegate2 != null) {
                        imageReceiverDelegate2.didSetImageBitmap(i10, str, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.c6) {
                        org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
                        c6Var.C(this.startTime, this.endTime);
                        if (c6Var.n0) {
                            ImageLoader.getInstance().incrementUseCount(this.currentImageKey);
                        }
                        if (this.videoThumbIsSame) {
                            z12 = !c6Var.s();
                            this.currentImageDrawable = drawable;
                            if (drawable instanceof ExtendedBitmapDrawable) {
                            }
                            updateDrawableRadius(drawable);
                            if (z12) {
                            }
                            this.currentAlpha = 1.0f;
                            this.previousAlpha = 1.0f;
                            imageReceiverDelegate = this.delegate;
                            if (imageReceiverDelegate != null) {
                            }
                            if (!(drawable instanceof org.telegram.ui.Components.p5)) {
                            }
                            invalidate();
                            return true;
                        }
                        z12 = true;
                        this.currentImageDrawable = drawable;
                        if (drawable instanceof ExtendedBitmapDrawable) {
                        }
                        updateDrawableRadius(drawable);
                        if (z12) {
                        }
                        this.currentAlpha = 1.0f;
                        this.previousAlpha = 1.0f;
                        imageReceiverDelegate = this.delegate;
                        if (imageReceiverDelegate != null) {
                        }
                        if (!(drawable instanceof org.telegram.ui.Components.p5)) {
                        }
                        invalidate();
                        return true;
                    }
                    ImageLoader.getInstance().incrementUseCount(this.currentImageKey);
                    if (this.videoThumbIsSame && (drawable == this.currentImageDrawable || this.currentAlpha < 1.0f)) {
                        z12 = false;
                        this.currentImageDrawable = drawable;
                        if (drawable instanceof ExtendedBitmapDrawable) {
                            ExtendedBitmapDrawable extendedBitmapDrawable = (ExtendedBitmapDrawable) drawable;
                            this.imageOrientation = extendedBitmapDrawable.getOrientation();
                            this.imageInvert = extendedBitmapDrawable.getInvert();
                        }
                        updateDrawableRadius(drawable);
                        if (z12 || !this.isVisible || (((z10 || this.forcePreview) && !this.forceCrossfade) || this.crossfadeDuration == 0)) {
                            this.currentAlpha = 1.0f;
                            this.previousAlpha = 1.0f;
                        } else {
                            Drawable drawable5 = this.currentMediaDrawable;
                            if (!(drawable5 instanceof hj0) || !((hj0) drawable5).u()) {
                                Drawable drawable6 = this.currentMediaDrawable;
                                if (!(drawable6 instanceof org.telegram.ui.Components.c6) || !((org.telegram.ui.Components.c6) drawable6).s()) {
                                    if (this.currentImageDrawable instanceof hj0) {
                                        Drawable drawable7 = this.staticThumbDrawable;
                                        if (!(drawable7 instanceof s90)) {
                                            if (!(drawable7 instanceof SvgHelper.SvgDrawable)) {
                                            }
                                        }
                                    }
                                    Drawable drawable8 = this.currentThumbDrawable;
                                    if (drawable8 != null || this.staticThumbDrawable != null || this.forceCrossfade) {
                                        if (drawable8 == null || this.staticThumbDrawable == null) {
                                            this.previousAlpha = 1.0f;
                                        } else {
                                            this.previousAlpha = this.currentAlpha;
                                        }
                                        this.currentAlpha = 0.0f;
                                        this.lastUpdateAlphaTime = System.currentTimeMillis();
                                        this.crossfadeWithThumb = (this.crossfadeImage == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null) ? false : true;
                                    }
                                }
                            }
                        }
                        imageReceiverDelegate = this.delegate;
                        if (imageReceiverDelegate != null) {
                            Drawable drawable9 = this.currentImageDrawable;
                            imageReceiverDelegate.didSetImage(this, (drawable9 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, drawable9 == null && this.currentMediaDrawable == null, z10);
                        }
                        if (!(drawable instanceof org.telegram.ui.Components.p5)) {
                            org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) drawable;
                            if (this.attachedToWindow) {
                                p5Var.b(this);
                            }
                        } else if (drawable instanceof org.telegram.ui.Components.c6) {
                            org.telegram.ui.Components.c6 c6Var2 = (org.telegram.ui.Components.c6) drawable;
                            boolean z13 = this.useSharedAnimationQueue;
                            if (!c6Var2.n0) {
                                c6Var2.v0 = z13;
                            }
                            if (this.attachedToWindow) {
                                c6Var2.e(this);
                            }
                            if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                                c6Var2.j();
                            }
                            boolean z14 = this.allowDecodeSingleFrame;
                            c6Var2.y = z14;
                            if (z14) {
                                c6Var2.x(false);
                            }
                            this.animationReadySent = false;
                            View view = this.parentView;
                            if (view != null) {
                                view.invalidate();
                            }
                        } else if (drawable instanceof hj0) {
                            hj0 hj0Var = (hj0) drawable;
                            if (this.attachedToWindow) {
                                hj0Var.J.add(this);
                            }
                            if (this.allowStartLottieAnimation && (!hj0Var.z() || this.currentOpenedLayerFlags == 0)) {
                                hj0Var.start();
                            }
                            hj0Var.J(true);
                            hj0Var.K(this.autoRepeat);
                            hj0Var.M = this.autoRepeatCount;
                            hj0Var.G0 = this.allowDrawWhileCacheGenerating;
                            this.animationReadySent = false;
                        }
                        invalidate();
                        return true;
                    }
                    z12 = true;
                    this.currentImageDrawable = drawable;
                    if (drawable instanceof ExtendedBitmapDrawable) {
                    }
                    updateDrawableRadius(drawable);
                    if (z12) {
                    }
                    this.currentAlpha = 1.0f;
                    this.previousAlpha = 1.0f;
                    imageReceiverDelegate = this.delegate;
                    if (imageReceiverDelegate != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.p5)) {
                    }
                    invalidate();
                    return true;
                }
            } else {
                if (i10 != 3) {
                    if (i10 == 1) {
                        if (this.currentThumbDrawable == null && ((this.forcePreview || (((animation = getAnimation()) == null || !animation.s()) && (((drawable2 = this.currentImageDrawable) == null || (drawable2 instanceof org.telegram.ui.Components.c6)) && ((drawable3 = this.currentMediaDrawable) == null || (drawable3 instanceof org.telegram.ui.Components.c6))))) && str.equals(this.currentThumbKey))) {
                            ImageReceiverDelegate imageReceiverDelegate3 = this.delegate;
                            if (imageReceiverDelegate3 != null) {
                                imageReceiverDelegate3.didSetImageBitmap(i10, str, drawable);
                            }
                            ImageLoader.getInstance().incrementUseCount(this.currentThumbKey);
                            this.currentThumbDrawable = drawable;
                            if (drawable instanceof ExtendedBitmapDrawable) {
                                ExtendedBitmapDrawable extendedBitmapDrawable2 = (ExtendedBitmapDrawable) drawable;
                                this.thumbOrientation = extendedBitmapDrawable2.getOrientation();
                                this.thumbInvert = extendedBitmapDrawable2.getInvert();
                            }
                            updateDrawableRadius(drawable);
                            if (z10 || this.crossfadeAlpha == 2) {
                                this.currentAlpha = 1.0f;
                                this.previousAlpha = 1.0f;
                            } else {
                                Object obj = this.currentParentObject;
                                if ((obj instanceof MessageObject) && ((MessageObject) obj).isRoundVideo() && ((MessageObject) this.currentParentObject).isSending()) {
                                    this.currentAlpha = 1.0f;
                                    this.previousAlpha = 1.0f;
                                } else {
                                    this.currentAlpha = 0.0f;
                                    this.previousAlpha = 1.0f;
                                    this.lastUpdateAlphaTime = System.currentTimeMillis();
                                    this.crossfadeWithThumb = this.staticThumbDrawable != null;
                                }
                            }
                        }
                    }
                    imageReceiverDelegate = this.delegate;
                    if (imageReceiverDelegate != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.p5)) {
                    }
                    invalidate();
                    return true;
                }
                if (str.equals(this.currentMediaKey)) {
                    ImageReceiverDelegate imageReceiverDelegate4 = this.delegate;
                    if (imageReceiverDelegate4 != null) {
                        imageReceiverDelegate4.didSetImageBitmap(i10, str, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.c6) {
                        org.telegram.ui.Components.c6 c6Var3 = (org.telegram.ui.Components.c6) drawable;
                        c6Var3.C(this.startTime, this.endTime);
                        if (c6Var3.n0) {
                            ImageLoader.getInstance().incrementUseCount(this.currentMediaKey);
                        }
                        if (this.videoThumbIsSame && (((z11 = (drawable4 = this.currentThumbDrawable) instanceof org.telegram.ui.Components.c6)) || (this.currentImageDrawable instanceof org.telegram.ui.Components.c6))) {
                            c6Var3.y(z11 ? ((org.telegram.ui.Components.c6) drawable4).c : 0L, true, true);
                        }
                    } else {
                        ImageLoader.getInstance().incrementUseCount(this.currentMediaKey);
                    }
                    this.currentMediaDrawable = drawable;
                    updateDrawableRadius(drawable);
                    if (this.currentImageDrawable == null) {
                        if ((z10 || this.forcePreview) && !this.forceCrossfade) {
                            this.currentAlpha = 1.0f;
                            this.previousAlpha = 1.0f;
                        } else {
                            Drawable drawable10 = this.currentThumbDrawable;
                            if ((drawable10 == null && this.staticThumbDrawable == null) || this.currentAlpha == 1.0f || this.forceCrossfade) {
                                if (drawable10 == null || this.staticThumbDrawable == null) {
                                    this.previousAlpha = 1.0f;
                                } else {
                                    this.previousAlpha = this.currentAlpha;
                                }
                                this.currentAlpha = 0.0f;
                                this.lastUpdateAlphaTime = System.currentTimeMillis();
                                this.crossfadeWithThumb = (this.crossfadeImage == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null) ? false : true;
                            }
                        }
                    }
                    imageReceiverDelegate = this.delegate;
                    if (imageReceiverDelegate != null) {
                    }
                    if (!(drawable instanceof org.telegram.ui.Components.p5)) {
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setImageCoords(float f7, float f10, float f11, float f12) {
        this.imageX = f7;
        this.imageY = f10;
        this.imageW = f11;
        this.imageH = f12;
    }

    public void setImageWidth(int i10) {
        this.imageW = i10;
    }

    public void setImageX(float f7) {
        this.imageX = f7;
    }

    public void setImageY(float f7) {
        this.imageY = f7;
    }

    public void setInvalidateAll(boolean z10) {
        this.invalidateAll = z10;
    }

    public void setLayerNum(int i10) {
        this.currentLayerNum = i10;
        if (this.attachedToWindow) {
            this.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.currentLayerNum);
        }
    }

    public void setManualAlphaAnimator(boolean z10) {
        this.manualAlphaAnimator = z10;
    }

    public void setMark(Object obj) {
        this.mark = obj;
    }

    public void setMediaStartEndTime(long j3, long j10) {
        this.startTime = j3;
        this.endTime = j10;
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.c6) {
            ((org.telegram.ui.Components.c6) drawable).C(j3, j10);
        }
    }

    public void setNeedsQualityThumb(boolean z10) {
        this.needsQualityThumb = z10;
    }

    public void setOrientation(int i10, boolean z10) {
        setOrientation(i10, 0, z10);
    }

    public void setParam(int i10) {
        this.param = i10;
    }

    public void setParentView(View view) {
        this.parentView = view;
        org.telegram.ui.Components.c6 animation = getAnimation();
        if (animation == null || !this.attachedToWindow) {
            return;
        }
        View view2 = this.parentView;
        if (animation.r0 != null) {
            return;
        }
        animation.r0 = view2;
    }

    public void setPreloadingReceivers(List<ImageReceiver> list) {
        this.preloadReceivers = list;
    }

    public void setPressed(int i10) {
        this.isPressed = i10;
    }

    public void setQualityThumbDocument(TLRPC.Document document) {
        this.qulityThumbDocument = document;
    }

    public void setRoundRadius(int i10) {
        setRoundRadius(new int[]{i10, i10, i10, i10});
    }

    public void setRoundRadiusEnabled(boolean z10) {
        if (this.useRoundRadius != z10) {
            this.useRoundRadius = z10;
            if (!z10 && this.emptyRoundRadius == null) {
                this.emptyRoundRadius = new int[]{0, 0, 0, 0};
            }
            Drawable drawable = this.currentImageDrawable;
            if (drawable != null && this.imageShader == null) {
                updateDrawableRadius(drawable);
            }
            Drawable drawable2 = this.currentMediaDrawable;
            if (drawable2 != null && this.mediaShader == null) {
                updateDrawableRadius(drawable2);
            }
            Drawable drawable3 = this.currentThumbDrawable;
            if (drawable3 != null) {
                updateDrawableRadius(drawable3);
            }
            Drawable drawable4 = this.staticThumbDrawable;
            if (drawable4 != null) {
                updateDrawableRadius(drawable4);
            }
        }
    }

    public void setShouldGenerateQualityThumb(boolean z10) {
        this.shouldGenerateQualityThumb = z10;
    }

    public void setSideClip(float f7) {
        this.sideClip = f7;
    }

    public void setSkipUpdateFrame(boolean z10) {
        this.skipUpdateFrame = z10;
    }

    public void setStrippedLocation(ImageLocation imageLocation) {
        this.strippedLocation = imageLocation;
    }

    public void setTag(int i10, int i11) {
        if (i11 == 1) {
            this.thumbTag = i10;
        } else if (i11 == 3) {
            this.mediaTag = i10;
        } else {
            this.imageTag = i10;
        }
    }

    public void setUniqKeyPrefix(String str) {
        this.uniqKeyPrefix = str;
    }

    public void setUseRoundForThumbDrawable(boolean z10) {
        this.useRoundForThumb = z10;
    }

    public void setUseSharedAnimationQueue(boolean z10) {
        this.useSharedAnimationQueue = z10;
    }

    public void setVideoThumbIsSame(boolean z10) {
        this.videoThumbIsSame = z10;
    }

    public void setVisible(boolean z10, boolean z11) {
        if (this.isVisible == z10) {
            return;
        }
        this.isVisible = z10;
        if (z11) {
            invalidate();
            Runnable runnable = this.visibleInvalidate;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setVisibleInvalidate(Runnable runnable) {
        this.visibleInvalidate = runnable;
    }

    public void startAnimation() {
        startAnimation(false);
    }

    public void startCrossfadeFromStaticThumb(Bitmap bitmap) {
        startCrossfadeFromStaticThumb(new BitmapDrawable((Resources) null, bitmap));
    }

    public void stopAnimation() {
        org.telegram.ui.Components.c6 animation = getAnimation();
        if (animation != null) {
            animation.stop();
            return;
        }
        hj0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.stop();
        }
    }

    public void updateStaticDrawableThump(Bitmap bitmap) {
        this.staticThumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(new BitmapDrawable(bitmap));
    }

    public boolean updateThumbShaderMatrix() {
        BitmapShader bitmapShader;
        BitmapShader bitmapShader2;
        Drawable drawable = this.currentThumbDrawable;
        if (drawable != null && (bitmapShader2 = this.thumbShader) != null) {
            drawDrawable(null, drawable, 255, bitmapShader2, 0, 0, 0, null);
            return true;
        }
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable2 == null || (bitmapShader = this.staticThumbShader) == null) {
            return false;
        }
        drawDrawable(null, drawable2, 255, bitmapShader, 0, 0, 0, null);
        return true;
    }

    public ImageReceiver(View view) {
        this.allowCrossfadeWithImage = true;
        this.fileLoadingPriority = 1;
        this.useRoundForThumb = true;
        this.allowLottieVibration = true;
        this.allowStartAnimation = true;
        this.allowStartLottieAnimation = true;
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.drawRegion = new RectF();
        this.isVisible = true;
        this.useRoundRadius = true;
        this.roundRadius = new int[4];
        this.isRoundRect = true;
        this.roundRect = new RectF();
        this.shaderMatrix = new Matrix();
        this.roundPath = new Path();
        this.overrideAlpha = 1.0f;
        this.previousAlpha = 1.0f;
        this.crossfadeAlpha = (byte) 1;
        this.crossfadeByScale = 0.05f;
        this.crossfadeDuration = DEFAULT_CROSSFADE_DURATION;
        this.loadingOperations = new ArrayList<>();
        this.allowLoadingOnAttachedOnly = false;
        this.clip = true;
        this.invalidateRunnable = new g1(this, 23);
        this.parentView = view;
        this.roundPaint = new Paint(3);
        this.currentAccount = UserConfig.selectedAccount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0205, code lost:
    
        if (r1.useRoundForThumb == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0207, code lost:
    
        if (r2 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0209, code lost:
    
        r1.updateDrawableRadius(r3);
        r2 = r1.staticThumbShader;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x022e A[Catch: Exception -> 0x00e4, TryCatch #3 {Exception -> 0x00e4, blocks: (B:12:0x00dc, B:14:0x00e0, B:17:0x00ea, B:22:0x0106, B:24:0x010c, B:28:0x0114, B:29:0x0165, B:31:0x0171, B:34:0x017f, B:42:0x01a2, B:45:0x01a8, B:46:0x01ad, B:53:0x01dd, B:55:0x0307, B:58:0x030e, B:100:0x022e, B:102:0x0232, B:105:0x0246, B:136:0x0203, B:139:0x0209, B:144:0x021d, B:147:0x0223, B:155:0x0301, B:158:0x031c, B:160:0x0320, B:161:0x0325, B:171:0x0124, B:174:0x0131, B:176:0x013c, B:177:0x0145, B:179:0x0149, B:182:0x014f, B:183:0x0157, B:187:0x00f6, B:190:0x00fc, B:192:0x0103), top: B:11:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e1 A[Catch: Exception -> 0x02e5, TRY_LEAVE, TryCatch #2 {Exception -> 0x02e5, blocks: (B:49:0x01cc, B:112:0x0266, B:126:0x02dc, B:128:0x02e1), top: B:48:0x01cc }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x013c A[Catch: Exception -> 0x00e4, TryCatch #3 {Exception -> 0x00e4, blocks: (B:12:0x00dc, B:14:0x00e0, B:17:0x00ea, B:22:0x0106, B:24:0x010c, B:28:0x0114, B:29:0x0165, B:31:0x0171, B:34:0x017f, B:42:0x01a2, B:45:0x01a8, B:46:0x01ad, B:53:0x01dd, B:55:0x0307, B:58:0x030e, B:100:0x022e, B:102:0x0232, B:105:0x0246, B:136:0x0203, B:139:0x0209, B:144:0x021d, B:147:0x0223, B:155:0x0301, B:158:0x031c, B:160:0x0320, B:161:0x0325, B:171:0x0124, B:174:0x0131, B:176:0x013c, B:177:0x0145, B:179:0x0149, B:182:0x014f, B:183:0x0157, B:187:0x00f6, B:190:0x00fc, B:192:0x0103), top: B:11:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0145 A[Catch: Exception -> 0x00e4, TryCatch #3 {Exception -> 0x00e4, blocks: (B:12:0x00dc, B:14:0x00e0, B:17:0x00ea, B:22:0x0106, B:24:0x010c, B:28:0x0114, B:29:0x0165, B:31:0x0171, B:34:0x017f, B:42:0x01a2, B:45:0x01a8, B:46:0x01ad, B:53:0x01dd, B:55:0x0307, B:58:0x030e, B:100:0x022e, B:102:0x0232, B:105:0x0246, B:136:0x0203, B:139:0x0209, B:144:0x021d, B:147:0x0223, B:155:0x0301, B:158:0x031c, B:160:0x0320, B:161:0x0325, B:171:0x0124, B:174:0x0131, B:176:0x013c, B:177:0x0145, B:179:0x0149, B:182:0x014f, B:183:0x0157, B:187:0x00f6, B:190:0x00fc, B:192:0x0103), top: B:11:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c A[Catch: Exception -> 0x00e4, TryCatch #3 {Exception -> 0x00e4, blocks: (B:12:0x00dc, B:14:0x00e0, B:17:0x00ea, B:22:0x0106, B:24:0x010c, B:28:0x0114, B:29:0x0165, B:31:0x0171, B:34:0x017f, B:42:0x01a2, B:45:0x01a8, B:46:0x01ad, B:53:0x01dd, B:55:0x0307, B:58:0x030e, B:100:0x022e, B:102:0x0232, B:105:0x0246, B:136:0x0203, B:139:0x0209, B:144:0x021d, B:147:0x0223, B:155:0x0301, B:158:0x031c, B:160:0x0320, B:161:0x0325, B:171:0x0124, B:174:0x0131, B:176:0x013c, B:177:0x0145, B:179:0x0149, B:182:0x014f, B:183:0x0157, B:187:0x00f6, B:190:0x00fc, B:192:0x0103), top: B:11:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171 A[Catch: Exception -> 0x00e4, TryCatch #3 {Exception -> 0x00e4, blocks: (B:12:0x00dc, B:14:0x00e0, B:17:0x00ea, B:22:0x0106, B:24:0x010c, B:28:0x0114, B:29:0x0165, B:31:0x0171, B:34:0x017f, B:42:0x01a2, B:45:0x01a8, B:46:0x01ad, B:53:0x01dd, B:55:0x0307, B:58:0x030e, B:100:0x022e, B:102:0x0232, B:105:0x0246, B:136:0x0203, B:139:0x0209, B:144:0x021d, B:147:0x0223, B:155:0x0301, B:158:0x031c, B:160:0x0320, B:161:0x0325, B:171:0x0124, B:174:0x0131, B:176:0x013c, B:177:0x0145, B:179:0x0149, B:182:0x014f, B:183:0x0157, B:187:0x00f6, B:190:0x00fc, B:192:0x0103), top: B:11:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017f A[Catch: Exception -> 0x00e4, TryCatch #3 {Exception -> 0x00e4, blocks: (B:12:0x00dc, B:14:0x00e0, B:17:0x00ea, B:22:0x0106, B:24:0x010c, B:28:0x0114, B:29:0x0165, B:31:0x0171, B:34:0x017f, B:42:0x01a2, B:45:0x01a8, B:46:0x01ad, B:53:0x01dd, B:55:0x0307, B:58:0x030e, B:100:0x022e, B:102:0x0232, B:105:0x0246, B:136:0x0203, B:139:0x0209, B:144:0x021d, B:147:0x0223, B:155:0x0301, B:158:0x031c, B:160:0x0320, B:161:0x0325, B:171:0x0124, B:174:0x0131, B:176:0x013c, B:177:0x0145, B:179:0x0149, B:182:0x014f, B:183:0x0157, B:187:0x00f6, B:190:0x00fc, B:192:0x0103), top: B:11:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x036b A[LOOP:0: B:78:0x0363->B:80:0x036b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean draw(Canvas canvas, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        boolean z10;
        int i10;
        org.telegram.ui.Components.c6 animation;
        hj0 lottieAnimation;
        int[] iArr;
        BitmapShader bitmapShader;
        Drawable drawable;
        BitmapShader bitmapShader2;
        BitmapShader bitmapShader3;
        BitmapShader bitmapShader4;
        Drawable drawable2;
        float f7;
        boolean z11;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        boolean z12;
        boolean z13;
        float f10;
        float f11;
        BitmapShader bitmapShader5;
        int[] iArr2;
        boolean z14;
        Drawable drawable6;
        int i11;
        int i12;
        BitmapShader bitmapShader6;
        Drawable drawable7;
        boolean z15;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder2;
        BitmapShader bitmapShader7;
        int[] iArr3;
        BitmapShader bitmapShader8;
        Drawable drawable8;
        float f12;
        Drawable drawable9;
        Drawable drawable10;
        int i13;
        boolean z16;
        Drawable drawable11;
        Canvas canvas2;
        Drawable drawable12;
        int[] iArr4;
        boolean z17;
        ImageReceiver imageReceiver = this;
        Canvas canvas3 = canvas;
        if (imageReceiver.gradientBitmap != null && imageReceiver.currentImageKey != null) {
            canvas3.save();
            float f13 = imageReceiver.imageX;
            float f14 = imageReceiver.imageY;
            canvas3.clipRect(f13, f14, imageReceiver.imageW + f13, imageReceiver.imageH + f14);
            canvas3.drawColor(-16777216);
        }
        boolean z18 = backgroundThreadDrawHolder != null;
        try {
            if (z18) {
                animation = backgroundThreadDrawHolder.animation;
                lottieAnimation = backgroundThreadDrawHolder.lottieDrawable;
                iArr = backgroundThreadDrawHolder.roundRadius;
                Drawable drawable13 = backgroundThreadDrawHolder.mediaDrawable;
                bitmapShader = backgroundThreadDrawHolder.mediaShader;
                drawable = backgroundThreadDrawHolder.imageDrawable;
                bitmapShader2 = backgroundThreadDrawHolder.imageShader;
                bitmapShader3 = backgroundThreadDrawHolder.thumbShader;
                bitmapShader4 = backgroundThreadDrawHolder.staticThumbShader;
                drawable2 = backgroundThreadDrawHolder.crossfadeImage;
                boolean unused = backgroundThreadDrawHolder.crossfadeWithOldImage;
                z12 = backgroundThreadDrawHolder.crossfadingWithThumb;
                drawable5 = backgroundThreadDrawHolder.thumbDrawable;
                Drawable drawable14 = backgroundThreadDrawHolder.staticThumbDrawable;
                float f15 = backgroundThreadDrawHolder.currentAlpha;
                f11 = backgroundThreadDrawHolder.previousAlpha;
                BitmapShader bitmapShader9 = backgroundThreadDrawHolder.crossfadeShader;
                boolean z19 = backgroundThreadDrawHolder.animationNotReady;
                f7 = backgroundThreadDrawHolder.overrideAlpha;
                drawable3 = drawable13;
                drawable4 = drawable14;
                z13 = z18;
                f10 = f15;
                bitmapShader5 = bitmapShader9;
                z11 = z19;
            } else {
                animation = imageReceiver.getAnimation();
                lottieAnimation = imageReceiver.getLottieAnimation();
                iArr = imageReceiver.roundRadius;
                Drawable drawable15 = imageReceiver.currentMediaDrawable;
                bitmapShader = imageReceiver.mediaShader;
                drawable = imageReceiver.currentImageDrawable;
                bitmapShader2 = imageReceiver.imageShader;
                Drawable drawable16 = imageReceiver.currentThumbDrawable;
                bitmapShader3 = imageReceiver.thumbShader;
                bitmapShader4 = imageReceiver.staticThumbShader;
                boolean z20 = imageReceiver.crossfadingWithThumb;
                drawable2 = imageReceiver.crossfadeImage;
                Drawable drawable17 = imageReceiver.staticThumbDrawable;
                float f16 = imageReceiver.currentAlpha;
                float f17 = imageReceiver.previousAlpha;
                BitmapShader bitmapShader10 = imageReceiver.crossfadeShader;
                f7 = imageReceiver.overrideAlpha;
                z11 = ((animation == null || animation.s()) && (lottieAnimation == null || lottieAnimation.u())) ? false : true;
                drawable3 = drawable15;
                drawable4 = drawable17;
                drawable5 = drawable16;
                z12 = z20;
                z13 = z18;
                f10 = f16;
                f11 = f17;
                bitmapShader5 = bitmapShader10;
            }
            try {
                if (!imageReceiver.useRoundRadius) {
                    iArr = imageReceiver.emptyRoundRadius;
                }
                iArr2 = iArr;
                if (animation != null) {
                    animation.B(iArr2);
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e7) {
            e = e7;
        }
        if (animation == null) {
            if (lottieAnimation != null) {
            }
            z14 = imageReceiver.forcePreview;
            if (z14 && !imageReceiver.forceNotMedia && drawable3 != null && !z11) {
                i11 = imageReceiver.imageOrientation;
                bitmapShader2 = bitmapShader;
                i12 = imageReceiver.imageInvert;
                drawable6 = drawable3;
            } else if (z14 && drawable != null && (!z11 || drawable3 != null)) {
                i11 = imageReceiver.imageOrientation;
                i12 = imageReceiver.imageInvert;
                drawable6 = drawable;
                z11 = false;
            } else if (drawable2 == null && !z12) {
                i11 = imageReceiver.imageOrientation;
                i12 = imageReceiver.imageInvert;
                drawable6 = drawable2;
                bitmapShader2 = bitmapShader5;
            } else if (drawable5 != null) {
                i11 = imageReceiver.thumbOrientation;
                i12 = imageReceiver.thumbInvert;
                bitmapShader2 = bitmapShader3;
                drawable6 = drawable5;
            } else if (drawable4 instanceof BitmapDrawable) {
                if (imageReceiver.useRoundForThumb && bitmapShader4 == null) {
                    imageReceiver.updateDrawableRadius(drawable4);
                    bitmapShader6 = imageReceiver.staticThumbShader;
                } else {
                    bitmapShader6 = bitmapShader4;
                }
                i11 = imageReceiver.thumbOrientation;
                bitmapShader2 = bitmapShader6;
                bitmapShader4 = bitmapShader2;
                i12 = imageReceiver.thumbInvert;
                drawable6 = drawable4;
            } else {
                drawable6 = null;
                bitmapShader2 = null;
                i11 = 0;
                i12 = 0;
            }
            float f18 = imageReceiver.crossfadeByScale;
            BitmapShader bitmapShader11 = bitmapShader2;
            float min = f18 > 0.0f ? Math.min((f18 * f10) + f10, 1.0f) : f10;
            if (drawable6 != null) {
                if (imageReceiver.crossfadeAlpha != 0) {
                    try {
                        if (f11 != 1.0f) {
                            if (drawable6 != drawable) {
                                if (drawable6 == drawable3) {
                                }
                            }
                            if (drawable4 != null) {
                                if (imageReceiver.useRoundForThumb && bitmapShader4 == null) {
                                    imageReceiver.updateDrawableRadius(drawable4);
                                    bitmapShader4 = imageReceiver.staticThumbShader;
                                }
                                BitmapShader bitmapShader12 = bitmapShader4;
                                f12 = min;
                                drawable10 = drawable4;
                                i13 = i11;
                                drawable8 = drawable5;
                                drawable9 = drawable6;
                                boolean z21 = z11;
                                bitmapShader7 = bitmapShader3;
                                z15 = z21;
                                iArr3 = iArr2;
                                z10 = true;
                                imageReceiver.drawDrawable(canvas, drawable10, (int) (f7 * 255.0f), bitmapShader12, i13, i12, backgroundThreadDrawHolder);
                                bitmapShader8 = bitmapShader12;
                                z16 = imageReceiver.crossfadeWithThumb;
                                if (z16 || !z15) {
                                    int i14 = i12;
                                    drawable11 = drawable9;
                                    int i15 = i13;
                                    if (z16 && f12 != 1.0f) {
                                        if (drawable11 != drawable && drawable11 != drawable3) {
                                            if (drawable11 != drawable8 && drawable11 != drawable2) {
                                                if (drawable11 == drawable10 && drawable2 != null) {
                                                    drawable10 = drawable2;
                                                    bitmapShader8 = bitmapShader5;
                                                    if (drawable10 != null) {
                                                        int A = ((drawable10 instanceof SvgHelper.SvgDrawable) || (drawable10 instanceof Emoji.EmojiDrawable)) ? (int) a2.A(1.0f, f12, f7, 255.0f) : (int) (f11 * f7 * 255.0f);
                                                        drawable12 = drawable11;
                                                        iArr4 = iArr3;
                                                        BitmapShader bitmapShader13 = bitmapShader8;
                                                        canvas2 = canvas;
                                                        imageReceiver.drawDrawable(canvas2, drawable10, A, bitmapShader13, imageReceiver.thumbOrientation, imageReceiver.thumbInvert, backgroundThreadDrawHolder);
                                                        if (A != 255 && (drawable10 instanceof Emoji.EmojiDrawable)) {
                                                            drawable10.setAlpha(255);
                                                        }
                                                        if (imageReceiver.crossfadeByScale > 0.0f || f12 >= 1.0f || !z12) {
                                                            z17 = false;
                                                        } else {
                                                            canvas2.save();
                                                            imageReceiver.roundPath.rewind();
                                                            RectF rectF = AndroidUtilities.rectTmp;
                                                            float f19 = imageReceiver.imageX;
                                                            float f20 = imageReceiver.imageY;
                                                            rectF.set(f19, f20, imageReceiver.imageW + f19, imageReceiver.imageH + f20);
                                                            for (int i16 = 0; i16 < iArr4.length; i16++) {
                                                                float[] fArr = radii;
                                                                int i17 = i16 * 2;
                                                                int i18 = iArr4[i16];
                                                                fArr[i17] = i18;
                                                                fArr[i17 + 1] = i18;
                                                            }
                                                            imageReceiver.roundPath.addRoundRect(AndroidUtilities.rectTmp, radii, Path.Direction.CW);
                                                            canvas2.clipPath(imageReceiver.roundPath);
                                                            float z22 = com.google.android.gms.internal.vision.e2.z(1.0f, wr.i.getInterpolation(f10), imageReceiver.crossfadeByScale, 1.0f);
                                                            canvas2.scale(z22, z22, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                                            z17 = true;
                                                        }
                                                        Drawable drawable18 = drawable12;
                                                        imageReceiver.drawDrawable(canvas2, drawable18, (int) (f7 * f12 * 255.0f), bitmapShader11, i15, i14, backgroundThreadDrawHolder);
                                                        if (z17) {
                                                            canvas.restore();
                                                        }
                                                        imageReceiver = this;
                                                        backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                                        drawable7 = drawable18;
                                                    }
                                                }
                                                bitmapShader8 = null;
                                                drawable10 = null;
                                                if (drawable10 != null) {
                                                }
                                            }
                                            bitmapShader8 = null;
                                            drawable10 = null;
                                            if (drawable10 != null) {
                                            }
                                        }
                                        if (drawable8 == null) {
                                            drawable10 = drawable8;
                                            bitmapShader8 = bitmapShader7;
                                        } else {
                                            if (drawable10 != null) {
                                                if (imageReceiver.useRoundForThumb && bitmapShader8 == null) {
                                                    imageReceiver.updateDrawableRadius(drawable10);
                                                    bitmapShader8 = imageReceiver.staticThumbShader;
                                                }
                                            }
                                            bitmapShader8 = null;
                                            drawable10 = null;
                                        }
                                        if (drawable10 != null) {
                                        }
                                    }
                                    canvas2 = canvas;
                                    drawable12 = drawable11;
                                    iArr4 = iArr3;
                                    if (imageReceiver.crossfadeByScale > 0.0f) {
                                    }
                                    z17 = false;
                                    Drawable drawable182 = drawable12;
                                    imageReceiver.drawDrawable(canvas2, drawable182, (int) (f7 * f12 * 255.0f), bitmapShader11, i15, i14, backgroundThreadDrawHolder);
                                    if (z17) {
                                    }
                                    imageReceiver = this;
                                    backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                    drawable7 = drawable182;
                                } else {
                                    Drawable drawable19 = drawable9;
                                    imageReceiver.drawDrawable(canvas, drawable19, (int) (f7 * 255.0f), bitmapShader11, i13, i12, backgroundThreadDrawHolder);
                                    backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                    drawable7 = drawable19;
                                }
                            }
                        }
                        z16 = imageReceiver.crossfadeWithThumb;
                        if (z16) {
                        }
                        int i142 = i12;
                        drawable11 = drawable9;
                        int i152 = i13;
                        if (z16) {
                            if (drawable11 != drawable) {
                                if (drawable11 != drawable8) {
                                    if (drawable11 == drawable10) {
                                        drawable10 = drawable2;
                                        bitmapShader8 = bitmapShader5;
                                        if (drawable10 != null) {
                                        }
                                    }
                                    bitmapShader8 = null;
                                    drawable10 = null;
                                    if (drawable10 != null) {
                                    }
                                }
                                bitmapShader8 = null;
                                drawable10 = null;
                                if (drawable10 != null) {
                                }
                            }
                            if (drawable8 == null) {
                            }
                            if (drawable10 != null) {
                            }
                        }
                        canvas2 = canvas;
                        drawable12 = drawable11;
                        iArr4 = iArr3;
                        if (imageReceiver.crossfadeByScale > 0.0f) {
                        }
                        z17 = false;
                        Drawable drawable1822 = drawable12;
                        imageReceiver.drawDrawable(canvas2, drawable1822, (int) (f7 * f12 * 255.0f), bitmapShader11, i152, i142, backgroundThreadDrawHolder);
                        if (z17) {
                        }
                        imageReceiver = this;
                        backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                        drawable7 = drawable1822;
                    } catch (Exception e10) {
                        e = e10;
                        imageReceiver = this;
                        canvas3 = canvas;
                        z10 = false;
                        FileLog.e(e);
                        if (imageReceiver.gradientBitmap != null) {
                        }
                        if (z10) {
                        }
                        return z10;
                    }
                    boolean z23 = z11;
                    bitmapShader7 = bitmapShader3;
                    z15 = z23;
                    iArr3 = iArr2;
                    bitmapShader8 = bitmapShader4;
                    drawable8 = drawable5;
                    z10 = true;
                    f12 = min;
                    drawable9 = drawable6;
                    drawable10 = drawable4;
                    i13 = i11;
                } else {
                    Drawable drawable20 = drawable6;
                    z15 = z11;
                    z10 = true;
                    imageReceiver = this;
                    backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                    imageReceiver.drawDrawable(canvas, drawable20, (int) (f7 * 255.0f), bitmapShader11, i11, i12, backgroundThreadDrawHolder2);
                    drawable7 = drawable20;
                }
                imageReceiver.checkAlphaAnimation(z15 && imageReceiver.crossfadeWithThumb, backgroundThreadDrawHolder2);
                canvas3 = canvas;
            } else {
                drawable7 = drawable6;
                Drawable drawable21 = drawable4;
                z15 = z11;
                z10 = true;
                if (drawable21 != null) {
                    if (drawable21 instanceof d71) {
                        ((d71) drawable21).e = imageReceiver;
                    }
                    canvas3 = canvas;
                    imageReceiver.drawDrawable(canvas3, drawable21, (int) (f7 * 255.0f), null, imageReceiver.thumbOrientation, imageReceiver.thumbInvert, backgroundThreadDrawHolder);
                    imageReceiver.checkAlphaAnimation(z15, backgroundThreadDrawHolder);
                } else {
                    canvas3 = canvas;
                    imageReceiver.checkAlphaAnimation(z15, backgroundThreadDrawHolder);
                    z10 = false;
                }
            }
            if (drawable7 == null && z15 && !z13) {
                try {
                    imageReceiver.invalidate();
                } catch (Exception e11) {
                    e = e11;
                    FileLog.e(e);
                    if (imageReceiver.gradientBitmap != null) {
                    }
                    if (z10) {
                    }
                    return z10;
                }
            }
            if (imageReceiver.gradientBitmap != null && imageReceiver.currentImageKey != null) {
                canvas3.restore();
            }
            if (z10 && imageReceiver.isVisible && imageReceiver.decorators != null) {
                for (i10 = 0; i10 < imageReceiver.decorators.size(); i10++) {
                    imageReceiver.decorators.get(i10).onDraw(canvas3, imageReceiver);
                }
            }
            return z10;
        }
        if (!z11 && !imageReceiver.animationReadySent && !z13) {
            imageReceiver.animationReadySent = true;
            ImageReceiverDelegate imageReceiverDelegate = imageReceiver.delegate;
            if (imageReceiverDelegate != null) {
                imageReceiverDelegate.onAnimationReady(imageReceiver);
            }
            z14 = imageReceiver.forcePreview;
            if (z14) {
            }
            if (z14) {
            }
            if (drawable2 == null) {
            }
            if (drawable5 != null) {
            }
            float f182 = imageReceiver.crossfadeByScale;
            BitmapShader bitmapShader112 = bitmapShader2;
            if (f182 > 0.0f) {
            }
            if (drawable6 != null) {
            }
            if (drawable7 == null) {
                imageReceiver.invalidate();
            }
            if (imageReceiver.gradientBitmap != null) {
                canvas3.restore();
            }
            if (z10) {
                while (i10 < imageReceiver.decorators.size()) {
                }
            }
            return z10;
        }
        z14 = imageReceiver.forcePreview;
        if (z14) {
        }
        if (z14) {
        }
        if (drawable2 == null) {
        }
        if (drawable5 != null) {
        }
        float f1822 = imageReceiver.crossfadeByScale;
        BitmapShader bitmapShader1122 = bitmapShader2;
        if (f1822 > 0.0f) {
        }
        if (drawable6 != null) {
        }
        if (drawable7 == null) {
        }
        if (imageReceiver.gradientBitmap != null) {
        }
        if (z10) {
        }
        return z10;
    }

    public int[] getRoundRadius(boolean z10) {
        return (this.useRoundRadius || !z10) ? this.roundRadius : this.emptyRoundRadius;
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj) {
        setForUserOrChat(tLObject, drawable, obj, false, 0, false);
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, long j3, String str2, Object obj, int i10) {
        setImage(imageLocation, str, null, null, drawable, j3, str2, obj, i10);
    }

    public void setImageBitmap(Drawable drawable) {
        boolean z10 = true;
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
        if (!this.crossfadeWithOldImage) {
            for (int i10 = 0; i10 < 4; i10++) {
                recycleBitmap(null, i10);
            }
        } else if (this.currentImageDrawable != null) {
            recycleBitmap(null, 1);
            recycleBitmap(null, 2);
            recycleBitmap(null, 3);
            this.crossfadeShader = this.imageShader;
            this.crossfadeImage = this.currentImageDrawable;
            this.crossfadeKey = this.currentImageKey;
            this.crossfadingWithThumb = true;
        } else if (this.currentThumbDrawable != null) {
            recycleBitmap(null, 0);
            recycleBitmap(null, 2);
            recycleBitmap(null, 3);
            this.crossfadeShader = this.thumbShader;
            this.crossfadeImage = this.currentThumbDrawable;
            this.crossfadeKey = this.currentThumbKey;
            this.crossfadingWithThumb = true;
        } else if (this.staticThumbDrawable != null) {
            recycleBitmap(null, 0);
            recycleBitmap(null, 1);
            recycleBitmap(null, 2);
            recycleBitmap(null, 3);
            this.crossfadeShader = this.staticThumbShader;
            this.crossfadeImage = this.staticThumbDrawable;
            this.crossfadingWithThumb = true;
            this.crossfadeKey = null;
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                recycleBitmap(null, i11);
            }
            this.crossfadeShader = null;
        }
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable2 instanceof sk0) {
            fd0 fd0Var = (fd0) ((sk0) drawable2);
            DownloadController.getInstance(fd0Var.r.currentAccount).removeLoadingFileObserver(fd0Var);
            fd0Var.n = null;
            fd0Var.r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.p5) {
            org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) drawable;
            if (this.attachedToWindow) {
                p5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.c6) {
            org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
            View view = this.parentView;
            if (c6Var.r0 == null) {
                c6Var.r0 = view;
            }
            if (this.attachedToWindow) {
                c6Var.e(this);
            }
            boolean z11 = this.useSharedAnimationQueue || c6Var.n0;
            if (!c6Var.n0) {
                c6Var.v0 = z11;
            }
            if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                c6Var.j();
            }
            boolean z12 = this.allowDecodeSingleFrame;
            c6Var.y = z12;
            if (z12) {
                c6Var.x(false);
            }
        } else if (drawable instanceof hj0) {
            hj0 hj0Var = (hj0) drawable;
            if (this.attachedToWindow) {
                hj0Var.J.add(this);
            }
            hj0Var.E = this.allowLottieVibration;
            if (this.allowStartLottieAnimation && (!hj0Var.z() || this.currentOpenedLayerFlags == 0)) {
                hj0Var.start();
            }
            hj0Var.J(true);
        }
        this.staticThumbShader = null;
        this.thumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(drawable);
        updateDrawableRadius(drawable);
        this.currentMediaLocation = null;
        this.currentMediaFilter = null;
        Drawable drawable3 = this.currentMediaDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.c6) {
            ((org.telegram.ui.Components.c6) drawable3).v(this);
        }
        this.currentMediaDrawable = null;
        this.currentMediaKey = null;
        this.mediaShader = null;
        this.currentImageLocation = null;
        this.currentImageFilter = null;
        this.currentImageDrawable = null;
        this.currentImageKey = null;
        this.imageShader = null;
        this.composeShader = null;
        this.legacyShader = null;
        this.legacyCanvas = null;
        Bitmap bitmap = this.legacyBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.legacyBitmap = null;
        }
        this.currentThumbLocation = null;
        this.currentThumbFilter = null;
        this.currentThumbKey = null;
        this.currentKeyQuality = false;
        this.currentExt = null;
        this.currentSize = 0L;
        this.currentCacheType = 0;
        this.currentAlpha = 1.0f;
        this.previousAlpha = 1.0f;
        SetImageBackup setImageBackup = this.setImageBackup;
        if (setImageBackup != null) {
            setImageBackup.clear();
        }
        ImageReceiverDelegate imageReceiverDelegate = this.delegate;
        if (imageReceiverDelegate != null) {
            imageReceiverDelegate.didSetImage(this, (this.currentThumbDrawable == null && this.staticThumbDrawable == null) ? false : true, true, false);
        }
        invalidate();
        if (this.forceCrossfade && this.crossfadeWithOldImage && this.crossfadeImage != null) {
            this.currentAlpha = 0.0f;
            this.lastUpdateAlphaTime = System.currentTimeMillis();
            if (this.currentThumbDrawable == null && this.staticThumbDrawable == null) {
                z10 = false;
            }
            this.crossfadeWithThumb = z10;
        }
    }

    public void setOrientation(int i10, int i11, boolean z10) {
        while (i10 < 0) {
            i10 += 360;
        }
        while (i10 > 360) {
            i10 -= 360;
        }
        this.thumbOrientation = i10;
        this.imageOrientation = i10;
        this.thumbInvert = i11;
        this.imageInvert = i11;
        this.centerRotation = z10;
    }

    public void setRoundRadius(int i10, int i11, int i12, int i13) {
        setRoundRadius(new int[]{i10, i11, i12, i13});
    }

    public void startAnimation(boolean z10) {
        org.telegram.ui.Components.c6 animation = getAnimation();
        if (animation != null) {
            boolean z11 = this.useSharedAnimationQueue;
            if (!animation.n0) {
                animation.v0 = z11;
            }
            animation.start();
            return;
        }
        hj0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation == null || lottieAnimation.l0) {
            return;
        }
        lottieAnimation.H(z10);
    }

    public void startCrossfadeFromStaticThumb(Drawable drawable) {
        this.currentThumbKey = null;
        this.currentThumbDrawable = null;
        this.thumbShader = null;
        this.staticThumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(drawable);
        this.crossfadeWithThumb = true;
        this.currentAlpha = 0.0f;
        updateDrawableRadius(this.staticThumbDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj, boolean z10, int i10, boolean z11) {
        ImageLocation imageLocation;
        BitmapDrawable bitmapDrawable;
        boolean z12;
        boolean z13;
        TLRPC.ChatPhoto chatPhoto;
        ImageLocation forUserOrChat;
        String str;
        BitmapDrawable bitmapDrawable2;
        TLRPC.VideoSize videoSize;
        TLRPC.UserFull userFull;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.UserFull userFull2;
        Object obj2 = obj == null ? tLObject : obj;
        setUseRoundForThumbDrawable(true);
        TLRPC.VideoSize videoSize2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        ImageLocation imageLocation2 = null;
        videoSize2 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z12 = user.premium;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                bitmapDrawable2 = userProfilePhoto.strippedBitmap;
                z13 = userProfilePhoto.stripped_thumb != null;
                if (i10 == 3 && (userFull2 = MessagesController.getInstance(this.currentAccount).getUserFull(user.id)) != null) {
                    TLRPC.Photo photo = user.photo.personal ? userFull2.personal_photo : userFull2.profile_photo;
                    if (photo != null) {
                        videoSize = FileLoader.getVectorMarkupVideoSize(photo);
                        if (videoSize == null && z10 && MessagesController.getInstance(this.currentAccount).isPremiumUser(user) && user.photo.has_video && LiteMode.isEnabled(1024)) {
                            userFull = MessagesController.getInstance(this.currentAccount).getUserFull(user.id);
                            if (userFull != null) {
                                MessagesController.getInstance(this.currentAccount).loadFullUser(user, this.currentGuid, false);
                            } else {
                                TLRPC.Photo photo2 = user.photo.personal ? userFull.personal_photo : userFull.profile_photo;
                                if (photo2 != null && (videoSize = FileLoader.getVectorMarkupVideoSize(photo2)) == null && (arrayList = photo2.video_sizes) != null && !arrayList.isEmpty()) {
                                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(arrayList, 100);
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        TLRPC.VideoSize videoSize3 = arrayList.get(i11);
                                        if ("p".equals(videoSize3.type)) {
                                            closestVideoSizeWithSize = videoSize3;
                                        }
                                        if ((videoSize3 instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize3 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                                            videoSize = videoSize3;
                                        }
                                    }
                                    imageLocation2 = ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2);
                                }
                            }
                        }
                    }
                }
                videoSize = null;
                if (videoSize == null) {
                    userFull = MessagesController.getInstance(this.currentAccount).getUserFull(user.id);
                    if (userFull != null) {
                    }
                }
            } else {
                bitmapDrawable2 = null;
                videoSize = null;
                z13 = false;
            }
            imageLocation = imageLocation2;
            bitmapDrawable = bitmapDrawable2;
            videoSize2 = videoSize;
        } else if (!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null) {
            imageLocation = null;
            bitmapDrawable = null;
            z12 = false;
            z13 = false;
        } else {
            bitmapDrawable = chatPhoto.strippedBitmap;
            z13 = chatPhoto.stripped_thumb != null;
            imageLocation = null;
            z12 = false;
        }
        if (videoSize2 != null && i10 != 0) {
            setImageBitmap(new d71(videoSize2, z12, i10));
            return;
        }
        if (!z11) {
            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 1);
            str = "50_50";
        } else {
            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 0);
            str = "100_100";
        }
        String str2 = str;
        ImageLocation imageLocation3 = forUserOrChat;
        if (imageLocation != null) {
            setImage(imageLocation, "avatar", imageLocation3, str2, null, null, bitmapDrawable, 0L, null, obj2, 0);
            this.animatedFileDrawableRepeatMaxCount = 3;
            return;
        }
        Object obj3 = obj2;
        BitmapDrawable bitmapDrawable3 = bitmapDrawable;
        if (bitmapDrawable3 != null) {
            setImage(imageLocation3, str2, bitmapDrawable3, null, obj3, 0);
        } else if (z13) {
            setImage(imageLocation3, str2, ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 2), "50_50_b", drawable, obj3, 0);
        } else {
            setImage(imageLocation3, str2, drawable, null, obj3, 0);
        }
    }

    public void setImage(String str, String str2, Drawable drawable, String str3, long j3) {
        setImage(ImageLocation.getForPath(str), str2, null, null, drawable, j3, str3, null, 1);
    }

    public void setRoundRadius(int[] iArr) {
        int i10 = iArr[0];
        this.isRoundRect = true;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int[] iArr2 = this.roundRadius;
            if (i11 >= iArr2.length) {
                break;
            }
            int i12 = iArr2[i11];
            int i13 = iArr[i11];
            if (i12 != i13) {
                z10 = true;
            }
            if (i10 != i13) {
                this.isRoundRect = false;
            }
            iArr2[i11] = i13;
            i11++;
        }
        if (z10) {
            Drawable drawable = this.currentImageDrawable;
            if (drawable != null && this.imageShader == null) {
                updateDrawableRadius(drawable);
            }
            Drawable drawable2 = this.currentMediaDrawable;
            if (drawable2 != null && this.mediaShader == null) {
                updateDrawableRadius(drawable2);
            }
            Drawable drawable3 = this.currentThumbDrawable;
            if (drawable3 != null) {
                updateDrawableRadius(drawable3);
            }
            Drawable drawable4 = this.staticThumbDrawable;
            if (drawable4 != null) {
                updateDrawableRadius(drawable4);
            }
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class BackgroundThreadDrawHolder {
        private org.telegram.ui.Components.c6 animation;
        public boolean animationNotReady;
        public ColorFilter colorFilter;
        private Drawable crossfadeImage;
        private BitmapShader crossfadeShader;
        private boolean crossfadeWithOldImage;
        private boolean crossfadingWithThumb;
        private float currentAlpha;
        private Drawable imageDrawable;
        public float imageH;
        private BitmapShader imageShader;
        public float imageW;
        public float imageX;
        public float imageY;
        private hj0 lottieDrawable;
        private Drawable mediaDrawable;
        private BitmapShader mediaShader;
        public float overrideAlpha;
        Paint paint;
        private float previousAlpha;
        private Path roundPath;
        private Drawable staticThumbDrawable;
        public BitmapShader staticThumbShader;
        public int threadIndex;
        private Drawable thumbDrawable;
        private BitmapShader thumbShader;
        public long time;
        private int[] roundRadius = new int[4];
        public RectF drawRegion = new RectF();

        public void getBounds(RectF rectF) {
            if (rectF != null) {
                float f7 = this.imageX;
                rectF.left = f7;
                float f10 = this.imageY;
                rectF.top = f10;
                rectF.right = f7 + this.imageW;
                rectF.bottom = f10 + this.imageH;
            }
        }

        public void release() {
            this.animation = null;
            this.lottieDrawable = null;
            for (int i10 = 0; i10 < 4; i10++) {
                int[] iArr = this.roundRadius;
                iArr[i10] = iArr[i10];
            }
            this.mediaDrawable = null;
            this.mediaShader = null;
            this.imageDrawable = null;
            this.imageShader = null;
            this.thumbDrawable = null;
            this.thumbShader = null;
            this.staticThumbShader = null;
            this.staticThumbDrawable = null;
            this.crossfadeImage = null;
            this.colorFilter = null;
        }

        public void setBounds(Rect rect) {
            if (rect != null) {
                this.imageX = rect.left;
                this.imageY = rect.top;
                this.imageW = rect.width();
                this.imageH = rect.height();
            }
        }

        public void getBounds(Rect rect) {
            if (rect != null) {
                int i10 = (int) this.imageX;
                rect.left = i10;
                int i11 = (int) this.imageY;
                rect.top = i11;
                rect.right = (int) (i10 + this.imageW);
                rect.bottom = (int) (i11 + this.imageH);
            }
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, String str3, Object obj, int i10) {
        setImage(imageLocation, str, imageLocation2, str2, null, 0L, str3, obj, i10);
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class BitmapHolder {
        public Bitmap bitmap;
        public Drawable drawable;
        private String key;
        public int orientation;
        private boolean recycleOnRelease;

        public BitmapHolder(Bitmap bitmap, String str, int i10) {
            this.bitmap = bitmap;
            this.key = str;
            this.orientation = i10;
            if (str != null) {
                ImageLoader.getInstance().incrementUseCount(this.key);
            }
        }

        public int getHeight() {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                return bitmap.getHeight();
            }
            return 0;
        }

        public String getKey() {
            return this.key;
        }

        public int getWidth() {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                return bitmap.getWidth();
            }
            return 0;
        }

        public boolean isRecycled() {
            Bitmap bitmap = this.bitmap;
            return bitmap == null || bitmap.isRecycled();
        }

        public void release() {
            Bitmap bitmap;
            if (this.key == null) {
                if (this.recycleOnRelease && (bitmap = this.bitmap) != null) {
                    bitmap.recycle();
                }
                this.bitmap = null;
                this.drawable = null;
                return;
            }
            boolean decrementUseCount = ImageLoader.getInstance().decrementUseCount(this.key);
            if (!ImageLoader.getInstance().isInMemCache(this.key, false) && decrementUseCount) {
                Bitmap bitmap2 = this.bitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                } else {
                    Drawable drawable = this.drawable;
                    if (drawable != null) {
                        if (drawable instanceof hj0) {
                            ((hj0) drawable).C(false);
                        } else if (drawable instanceof org.telegram.ui.Components.c6) {
                            ((org.telegram.ui.Components.c6) drawable).u();
                        } else if (drawable instanceof BitmapDrawable) {
                            ((BitmapDrawable) drawable).getBitmap().recycle();
                        }
                    }
                }
            }
            this.key = null;
            this.bitmap = null;
            this.drawable = null;
        }

        public BitmapHolder(Drawable drawable, String str, int i10) {
            this.drawable = drawable;
            this.key = str;
            this.orientation = i10;
            if (str != null) {
                ImageLoader.getInstance().incrementUseCount(this.key);
            }
        }

        public BitmapHolder(Bitmap bitmap) {
            this.bitmap = bitmap;
            this.recycleOnRelease = true;
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j3, String str3, Object obj, int i10) {
        setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
    }

    public void setImageCoords(Rect rect) {
        if (rect != null) {
            this.imageX = rect.left;
            this.imageY = rect.top;
            this.imageW = rect.width();
            this.imageH = rect.height();
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj, int i10) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, 0L, null, obj, i10);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, long j3, String str3, Object obj, int i10) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, j3, str3, obj, i10);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, ImageLocation imageLocation3, String str3, Drawable drawable, long j3, String str4, Object obj, int i10) {
        String str5;
        String str6;
        SetImageBackup setImageBackup;
        ImageLocation imageLocation4 = imageLocation;
        ImageLocation imageLocation5 = imageLocation2;
        if (this.allowLoadingOnAttachedOnly && !this.attachedToWindow) {
            if (this.setImageBackup == null) {
                this.setImageBackup = new SetImageBackup();
            }
            SetImageBackup setImageBackup2 = this.setImageBackup;
            setImageBackup2.mediaLocation = imageLocation4;
            setImageBackup2.mediaFilter = str;
            setImageBackup2.imageLocation = imageLocation5;
            setImageBackup2.imageFilter = str2;
            setImageBackup2.thumbLocation = imageLocation3;
            setImageBackup2.thumbFilter = str3;
            setImageBackup2.thumb = drawable;
            setImageBackup2.size = j3;
            setImageBackup2.ext = str4;
            setImageBackup2.cacheType = i10;
            setImageBackup2.parentObject = obj;
            return;
        }
        if (this.ignoreImageSet) {
            return;
        }
        if (this.crossfadeWithOldImage && (setImageBackup = this.setImageBackup) != null && setImageBackup.isWebfileSet()) {
            setBackupImage();
        }
        SetImageBackup setImageBackup3 = this.setImageBackup;
        if (setImageBackup3 != null) {
            setImageBackup3.clear();
        }
        if (imageLocation5 == null && imageLocation3 == null && imageLocation4 == null) {
            for (int i11 = 0; i11 < 4; i11++) {
                recycleBitmap(null, i11);
            }
            this.currentImageLocation = null;
            this.currentImageFilter = null;
            this.currentImageKey = null;
            this.currentMediaLocation = null;
            this.currentMediaFilter = null;
            this.currentMediaKey = null;
            this.currentThumbLocation = null;
            this.currentThumbFilter = null;
            this.currentThumbKey = null;
            this.currentMediaDrawable = null;
            this.mediaShader = null;
            this.currentImageDrawable = null;
            this.imageShader = null;
            this.composeShader = null;
            this.thumbShader = null;
            this.crossfadeShader = null;
            this.legacyShader = null;
            this.legacyCanvas = null;
            Bitmap bitmap = this.legacyBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.legacyBitmap = null;
            }
            this.currentExt = str4;
            this.currentParentObject = null;
            this.currentCacheType = 0;
            this.roundPaint.setShader(null);
            setStaticDrawable(drawable);
            this.currentAlpha = 1.0f;
            this.previousAlpha = 1.0f;
            this.currentSize = 0L;
            updateDrawableRadius(this.staticThumbDrawable);
            ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
            invalidate();
            ImageReceiverDelegate imageReceiverDelegate = this.delegate;
            if (imageReceiverDelegate != null) {
                Drawable drawable2 = this.currentImageDrawable;
                imageReceiverDelegate.didSetImage(this, (drawable2 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, drawable2 == null && this.currentMediaDrawable == null, false);
                return;
            }
            return;
        }
        String key = imageLocation5 != null ? imageLocation5.getKey(obj, null, false) : null;
        if (key == null && imageLocation5 != null) {
            imageLocation5 = null;
        }
        this.animatedFileDrawableRepeatMaxCount = Math.max(this.autoRepeatCount, 0);
        this.currentKeyQuality = false;
        if (key == null && this.needsQualityThumb && ((obj instanceof MessageObject) || this.qulityThumbDocument != null)) {
            TLRPC.Document document = this.qulityThumbDocument;
            if (document == null) {
                document = ((MessageObject) obj).getDocument();
            }
            if (document != null && document.dc_id != 0 && document.id != 0) {
                key = "q_" + document.dc_id + "_" + document.id;
                this.currentKeyQuality = true;
            }
        }
        String str7 = key;
        if (str7 != null && str2 != null) {
            str7 = a4.a.C(str7, "@", str2);
        }
        if (this.uniqKeyPrefix != null) {
            str7 = a4.a.s(new StringBuilder(), this.uniqKeyPrefix, str7);
        }
        String key2 = imageLocation4 != null ? imageLocation4.getKey(obj, null, false) : null;
        if (key2 == null && imageLocation4 != null) {
            imageLocation4 = null;
        }
        if (key2 != null && str != null) {
            key2 = a4.a.C(key2, "@", str);
        }
        if (this.uniqKeyPrefix != null) {
            key2 = a4.a.s(new StringBuilder(), this.uniqKeyPrefix, key2);
        }
        if ((key2 == null && (str6 = this.currentImageKey) != null && str6.equals(str7)) || ((str5 = this.currentMediaKey) != null && str5.equals(key2))) {
            ImageReceiverDelegate imageReceiverDelegate2 = this.delegate;
            if (imageReceiverDelegate2 != null) {
                Drawable drawable3 = this.currentImageDrawable;
                imageReceiverDelegate2.didSetImage(this, (drawable3 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, drawable3 == null && this.currentMediaDrawable == null, false);
            }
            if (!this.canceledLoading) {
                return;
            }
        }
        ImageLocation imageLocation6 = this.strippedLocation;
        if (imageLocation6 == null) {
            imageLocation6 = imageLocation4 != null ? imageLocation4 : imageLocation5;
        }
        if (imageLocation6 == null) {
            imageLocation6 = imageLocation3;
        }
        String key3 = imageLocation3 != null ? imageLocation3.getKey(obj, imageLocation6, false) : null;
        if (key3 != null && str3 != null) {
            key3 = a4.a.C(key3, "@", str3);
        }
        if (this.crossfadeWithOldImage) {
            Object obj2 = this.currentParentObject;
            if (obj2 instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj2;
                if (messageObject.lastGeoWebFileSet != null && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaGeoLive)) {
                    MessageObject messageObject2 = (MessageObject) this.currentParentObject;
                    messageObject2.lastGeoWebFileLoaded = messageObject2.lastGeoWebFileSet;
                }
            }
            Drawable drawable4 = this.currentMediaDrawable;
            if (drawable4 != null) {
                if (drawable4 instanceof org.telegram.ui.Components.c6) {
                    ((org.telegram.ui.Components.c6) drawable4).stop();
                    ((org.telegram.ui.Components.c6) this.currentMediaDrawable).v(this);
                }
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 0);
                this.crossfadeImage = this.currentMediaDrawable;
                this.crossfadeShader = this.mediaShader;
                this.crossfadeKey = this.currentImageKey;
                this.crossfadingWithThumb = false;
                this.currentMediaDrawable = null;
                this.currentMediaKey = null;
            } else if (this.currentImageDrawable != null) {
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = this.imageShader;
                this.crossfadeImage = this.currentImageDrawable;
                this.crossfadeKey = this.currentImageKey;
                this.crossfadingWithThumb = false;
                this.currentImageDrawable = null;
                this.currentImageKey = null;
            } else if (this.currentThumbDrawable != null) {
                recycleBitmap(str7, 0);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = this.thumbShader;
                this.crossfadeImage = this.currentThumbDrawable;
                this.crossfadeKey = this.currentThumbKey;
                this.crossfadingWithThumb = false;
                this.currentThumbDrawable = null;
                this.currentThumbKey = null;
            } else if (this.staticThumbDrawable != null) {
                recycleBitmap(str7, 0);
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = this.staticThumbShader;
                this.crossfadeImage = this.staticThumbDrawable;
                this.crossfadingWithThumb = false;
                this.crossfadeKey = null;
                this.currentThumbDrawable = null;
                this.currentThumbKey = null;
            } else {
                recycleBitmap(str7, 0);
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = null;
            }
        } else {
            recycleBitmap(str7, 0);
            recycleBitmap(key3, 1);
            recycleBitmap(null, 2);
            recycleBitmap(key2, 3);
            this.crossfadeShader = null;
        }
        this.currentImageLocation = imageLocation5;
        this.currentImageFilter = str2;
        this.currentImageKey = str7;
        this.currentMediaLocation = imageLocation4;
        this.currentMediaFilter = str;
        this.currentMediaKey = key2;
        this.currentThumbLocation = imageLocation3;
        this.currentThumbFilter = str3;
        this.currentThumbKey = key3;
        this.currentParentObject = obj;
        this.currentExt = str4;
        this.currentSize = j3;
        this.currentCacheType = i10;
        setStaticDrawable(drawable);
        this.imageShader = null;
        this.composeShader = null;
        this.thumbShader = null;
        this.staticThumbShader = null;
        this.mediaShader = null;
        this.legacyShader = null;
        this.legacyCanvas = null;
        this.roundPaint.setShader(null);
        Bitmap bitmap2 = this.legacyBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.legacyBitmap = null;
        }
        this.currentAlpha = 1.0f;
        this.previousAlpha = 1.0f;
        updateDrawableRadius(this.staticThumbDrawable);
        ImageReceiverDelegate imageReceiverDelegate3 = this.delegate;
        if (imageReceiverDelegate3 != null) {
            Drawable drawable5 = this.currentImageDrawable;
            imageReceiverDelegate3.didSetImage(this, (drawable5 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, drawable5 == null && this.currentMediaDrawable == null, false);
        }
        loadImage();
        this.isRoundVideo = (obj instanceof MessageObject) && ((MessageObject) obj).isRoundVideo();
    }

    public void setImageCoords(RectF rectF) {
        if (rectF != null) {
            this.imageX = rectF.left;
            this.imageY = rectF.top;
            this.imageW = rectF.width();
            this.imageH = rectF.height();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:394|(1:396)(8:419|(2:421|(1:423))|424|(1:400)|401|402|(1:(4:405|(1:407)|408|409)(1:414))(1:415)|(2:411|412)(1:413))|397|(1:400)|401|402|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x08ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0907, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:413:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0903 A[Catch: Exception -> 0x08ea, TRY_LEAVE, TryCatch #4 {Exception -> 0x08ea, blocks: (B:402:0x08d5, B:405:0x08dc, B:407:0x08e4, B:409:0x08ec, B:414:0x08ff, B:415:0x0903), top: B:401:0x08d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawDrawable(Canvas canvas, Drawable drawable, int i10, BitmapShader bitmapShader, int i11, int i12, int i13, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        float f7;
        float f10;
        float f11;
        float f12;
        RectF rectF;
        ColorFilter colorFilter;
        int[] iArr;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        boolean z10;
        Paint paint;
        int i14;
        boolean z11;
        boolean z12;
        int i15;
        int i16;
        int intrinsicHeight;
        int intrinsicWidth;
        boolean z13;
        boolean z14;
        float f13;
        float f14;
        float f15;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder2;
        float f16;
        float f17;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder3;
        Path path;
        BitmapDrawable bitmapDrawable;
        float f18;
        if (backgroundThreadDrawHolder != null) {
            f7 = backgroundThreadDrawHolder.imageX;
            f10 = backgroundThreadDrawHolder.imageY;
            f11 = backgroundThreadDrawHolder.imageH;
            f12 = backgroundThreadDrawHolder.imageW;
            rectF = backgroundThreadDrawHolder.drawRegion;
            colorFilter = backgroundThreadDrawHolder.colorFilter;
            iArr = backgroundThreadDrawHolder.roundRadius;
        } else {
            f7 = this.imageX;
            f10 = this.imageY;
            f11 = this.imageH;
            f12 = this.imageW;
            rectF = this.drawRegion;
            colorFilter = this.colorFilter;
            iArr = this.roundRadius;
        }
        int[] iArr2 = !this.useRoundRadius ? this.emptyRoundRadius : iArr;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable;
            int[] iArr3 = iArr2;
            boolean z15 = drawable instanceof hj0;
            if (z15) {
                z10 = z15;
                ((hj0) drawable).a = this.skipUpdateFrame;
            } else {
                z10 = z15;
                if (drawable instanceof org.telegram.ui.Components.c6) {
                    ((org.telegram.ui.Components.c6) drawable).a = this.skipUpdateFrame;
                }
            }
            if (bitmapShader != null) {
                paint = this.roundPaint;
            } else {
                paint = bitmapDrawable2.getPaint();
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 29) {
                Object obj = this.blendMode;
                if (obj != null && this.gradientShader == null) {
                    paint.setBlendMode(b.b(obj));
                } else {
                    i14 = i17;
                    paint.setBlendMode(null);
                    z11 = paint == null && paint.getColorFilter() != null;
                    if (z11 || i13 != 0) {
                        if (!z11 && i13 != 0) {
                            if (i13 != 1) {
                                if (bitmapShader != null) {
                                    this.roundPaint.setColorFilter(selectedColorFilter);
                                } else {
                                    bitmapDrawable2.setColorFilter(selectedColorFilter);
                                }
                            } else if (bitmapShader != null) {
                                this.roundPaint.setColorFilter(selectedGroupColorFilter);
                            } else {
                                bitmapDrawable2.setColorFilter(selectedGroupColorFilter);
                            }
                        }
                    } else if (bitmapShader != null) {
                        this.roundPaint.setColorFilter(null);
                    } else if (this.staticThumbDrawable != drawable) {
                        bitmapDrawable2.setColorFilter(null);
                    }
                    if (colorFilter != null && this.gradientShader == null) {
                        if (bitmapShader == null) {
                            this.roundPaint.setColorFilter(colorFilter);
                        } else {
                            bitmapDrawable2.setColorFilter(colorFilter);
                        }
                    }
                    z12 = bitmapDrawable2 instanceof org.telegram.ui.Components.c6;
                    if (z12 && !(bitmapDrawable2 instanceof hj0)) {
                        Bitmap bitmap = bitmapDrawable2.getBitmap();
                        if (bitmap != null && bitmap.isRecycled()) {
                            return;
                        }
                        i15 = i14;
                        int i18 = i11 % 360;
                        if (i18 != 90 && i18 != 270) {
                            intrinsicHeight = bitmap.getWidth();
                            intrinsicWidth = bitmap.getHeight();
                        } else {
                            intrinsicHeight = bitmap.getHeight();
                            intrinsicWidth = bitmap.getWidth();
                        }
                        z13 = bitmapDrawable2 instanceof ReactionLastFrame;
                    } else {
                        i15 = i14;
                        i16 = i11 % 360;
                        if (i16 == 90 && i16 != 270) {
                            intrinsicHeight = bitmapDrawable2.getIntrinsicWidth();
                            intrinsicWidth = bitmapDrawable2.getIntrinsicHeight();
                        } else {
                            intrinsicHeight = bitmapDrawable2.getIntrinsicHeight();
                            intrinsicWidth = bitmapDrawable2.getIntrinsicWidth();
                        }
                        z13 = false;
                    }
                    float f19 = this.sideClip;
                    float f20 = f12 - (f19 * 2.0f);
                    float f21 = f11 - (f19 * 2.0f);
                    z14 = z13;
                    float f22 = f12 != 0.0f ? 1.0f : intrinsicHeight / f20;
                    float f23 = f11 != 0.0f ? 1.0f : intrinsicWidth / f21;
                    if (z14) {
                        f22 /= 1.2f;
                        f23 /= 1.2f;
                    }
                    float f24 = f23;
                    float f25 = f22;
                    if (bitmapShader == null && backgroundThreadDrawHolder == null) {
                        if (this.isAspectFit) {
                            float max = Math.max(f25, f24);
                            float f26 = (int) (intrinsicHeight / max);
                            float f27 = (int) (intrinsicWidth / max);
                            rectF.set(com.google.android.gms.internal.vision.e2.A(f12, f26, 2.0f, f7), com.google.android.gms.internal.vision.e2.A(f11, f27, 2.0f, f10), a2.a(f12, f26, 2.0f, f7), a2.a(f11, f27, 2.0f, f10));
                            if (this.isVisible) {
                                this.shaderMatrix.reset();
                                this.shaderMatrix.setTranslate((int) rectF.left, (int) rectF.top);
                                if (i12 != 0) {
                                    this.shaderMatrix.preScale(i12 == 1 ? -1.0f : 1.0f, i12 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                }
                                if (i11 == 90) {
                                    this.shaderMatrix.preRotate(90.0f);
                                    this.shaderMatrix.preTranslate(0.0f, -rectF.width());
                                } else if (i11 == 180) {
                                    this.shaderMatrix.preRotate(180.0f);
                                    this.shaderMatrix.preTranslate(-rectF.width(), -rectF.height());
                                } else if (i11 == 270) {
                                    this.shaderMatrix.preRotate(270.0f);
                                    this.shaderMatrix.preTranslate(-rectF.height(), 0.0f);
                                }
                                float f28 = 1.0f / max;
                                this.shaderMatrix.preScale(f28, f28);
                                bitmapShader.setLocalMatrix(this.shaderMatrix);
                                this.roundPaint.setShader(bitmapShader);
                                this.roundPaint.setAlpha(i10);
                                this.roundRect.set(rectF);
                                if (!this.isRoundRect || !this.useRoundRadius) {
                                    for (int i19 = 0; i19 < iArr3.length; i19++) {
                                        float[] fArr = radii;
                                        int i20 = i19 * 2;
                                        int i21 = iArr3[i19];
                                        fArr[i20] = i21;
                                        fArr[i20 + 1] = i21;
                                    }
                                    this.roundPath.reset();
                                    this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                                    this.roundPath.close();
                                    if (canvas != null) {
                                        canvas.drawPath(this.roundPath, this.roundPaint);
                                    }
                                } else if (canvas != null) {
                                    try {
                                        int i22 = iArr3[0];
                                        if (i22 == 0) {
                                            canvas.drawRect(this.roundRect, this.roundPaint);
                                        } else {
                                            canvas.drawRoundRect(this.roundRect, i22, i22, this.roundPaint);
                                        }
                                    } catch (Exception e) {
                                        onBitmapException(bitmapDrawable2);
                                        FileLog.e(e);
                                    }
                                }
                            }
                        } else {
                            float f29 = f12;
                            float f30 = f11;
                            if (this.legacyCanvas != null) {
                                bitmapDrawable = bitmapDrawable2;
                                this.roundRect.set(0.0f, 0.0f, this.legacyBitmap.getWidth(), this.legacyBitmap.getHeight());
                                this.legacyCanvas.drawBitmap(this.gradientBitmap, (Rect) null, this.roundRect, (Paint) null);
                                this.legacyCanvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, this.roundRect, this.legacyPaint);
                            } else {
                                bitmapDrawable = bitmapDrawable2;
                            }
                            if (bitmapShader == this.imageShader && this.gradientShader != null) {
                                ComposeShader composeShader = this.composeShader;
                                if (composeShader != null) {
                                    this.roundPaint.setShader(composeShader);
                                } else {
                                    this.roundPaint.setShader(this.legacyShader);
                                }
                            } else {
                                this.roundPaint.setShader(bitmapShader);
                            }
                            float min = 1.0f / Math.min(f25, f24);
                            RectF rectF2 = this.roundRect;
                            float f31 = this.sideClip;
                            rectF2.set(f7 + f31, f10 + f31, (f7 + f29) - f31, (f10 + f30) - f31);
                            if (Math.abs(f25 - f24) > 5.0E-4f) {
                                float f32 = intrinsicHeight / f24;
                                if (f32 > f20) {
                                    float f33 = (int) f32;
                                    rectF.set(a2.y(f33, f20, 2.0f, f7), f10, a2.a(f33, f20, 2.0f, f7), f10 + f21);
                                    f18 = f21;
                                } else {
                                    float f34 = (int) (intrinsicWidth / f25);
                                    f18 = f21;
                                    rectF.set(f7, a2.y(f34, f18, 2.0f, f10), f7 + f20, a2.a(f34, f18, 2.0f, f10));
                                }
                            } else {
                                f18 = f21;
                                rectF.set(f7, f10, f7 + f20, f10 + f18);
                            }
                            if (this.isVisible) {
                                this.shaderMatrix.reset();
                                if (z14) {
                                    this.shaderMatrix.setTranslate((rectF.left + this.sideClip) - (((rectF.width() * 1.2f) - rectF.width()) / 2.0f), (rectF.top + this.sideClip) - (((rectF.height() * 1.2f) - rectF.height()) / 2.0f));
                                } else {
                                    Matrix matrix = this.shaderMatrix;
                                    float f35 = rectF.left;
                                    float f36 = this.sideClip;
                                    matrix.setTranslate(f35 + f36, rectF.top + f36);
                                }
                                if (i12 != 0) {
                                    this.shaderMatrix.preScale(i12 == 1 ? -1.0f : 1.0f, i12 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                }
                                if (i11 == 90) {
                                    this.shaderMatrix.preRotate(90.0f);
                                    this.shaderMatrix.preTranslate(0.0f, -rectF.width());
                                } else if (i11 == 180) {
                                    this.shaderMatrix.preRotate(180.0f);
                                    this.shaderMatrix.preTranslate(-rectF.width(), -rectF.height());
                                } else if (i11 == 270) {
                                    this.shaderMatrix.preRotate(270.0f);
                                    this.shaderMatrix.preTranslate(-rectF.height(), 0.0f);
                                }
                                this.shaderMatrix.preScale(min, min);
                                if (this.isRoundVideo) {
                                    float f37 = ((AndroidUtilities.roundMessageInset * 2) + f20) / f20;
                                    this.shaderMatrix.postScale(f37, f37, rectF.centerX(), rectF.centerY());
                                }
                                BitmapShader bitmapShader2 = this.legacyShader;
                                if (bitmapShader2 != null) {
                                    bitmapShader2.setLocalMatrix(this.shaderMatrix);
                                }
                                bitmapShader.setLocalMatrix(this.shaderMatrix);
                                if (this.composeShader != null) {
                                    int width = this.gradientBitmap.getWidth();
                                    int height = this.gradientBitmap.getHeight();
                                    float f38 = f12 == 0.0f ? 1.0f : width / f20;
                                    float f39 = f11 == 0.0f ? 1.0f : height / f18;
                                    if (Math.abs(f38 - f39) > 5.0E-4f) {
                                        float f40 = width / f39;
                                        if (f40 > f20) {
                                            width = (int) f40;
                                            float f41 = width;
                                            rectF.set(a2.y(f41, f20, 2.0f, f7), f10, a2.a(f41, f20, 2.0f, f7), f10 + f18);
                                        } else {
                                            height = (int) (height / f38);
                                            float f42 = height;
                                            rectF.set(f7, a2.y(f42, f18, 2.0f, f10), f7 + f20, a2.a(f42, f18, 2.0f, f10));
                                        }
                                    } else {
                                        rectF.set(f7, f10, f7 + f20, f10 + f18);
                                    }
                                    float min2 = 1.0f / Math.min(f12 == 0.0f ? 1.0f : width / f20, f11 == 0.0f ? 1.0f : height / f18);
                                    this.shaderMatrix.reset();
                                    Matrix matrix2 = this.shaderMatrix;
                                    float f43 = rectF.left;
                                    float f44 = this.sideClip;
                                    matrix2.setTranslate(f43 + f44, rectF.top + f44);
                                    this.shaderMatrix.preScale(min2, min2);
                                    this.gradientShader.setLocalMatrix(this.shaderMatrix);
                                }
                                this.roundPaint.setAlpha(i10);
                                if (!this.isRoundRect || !this.useRoundRadius) {
                                    for (int i23 = 0; i23 < iArr3.length; i23++) {
                                        float[] fArr2 = radii;
                                        int i24 = i23 * 2;
                                        int i25 = iArr3[i23];
                                        fArr2[i24] = i25;
                                        fArr2[i24 + 1] = i25;
                                    }
                                    this.roundPath.reset();
                                    this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                                    this.roundPath.close();
                                    if (canvas != null) {
                                        canvas.drawPath(this.roundPath, this.roundPaint);
                                    }
                                } else if (canvas != null) {
                                    try {
                                        int i26 = iArr3[0];
                                        if (i26 != 0) {
                                            canvas.drawRoundRect(this.roundRect, i26, i26, this.roundPaint);
                                        } else if (z14) {
                                            RectF rectF3 = AndroidUtilities.rectTmp;
                                            rectF3.set(this.roundRect);
                                            rectF3.inset((-((rectF.width() * 1.2f) - rectF.width())) / 2.0f, (-((rectF.height() * 1.2f) - rectF.height())) / 2.0f);
                                            canvas.drawRect(rectF3, this.roundPaint);
                                        } else {
                                            canvas.drawRect(this.roundRect, this.roundPaint);
                                        }
                                    } catch (Exception e7) {
                                        if (backgroundThreadDrawHolder == null) {
                                            onBitmapException(bitmapDrawable);
                                        }
                                        FileLog.e(e7);
                                    }
                                }
                            }
                        }
                    } else {
                        float f45 = f12;
                        float f46 = f11;
                        if (!this.isAspectFit) {
                            float max2 = Math.max(f25, f24);
                            canvas.save();
                            int i27 = (int) (intrinsicHeight / max2);
                            int i28 = (int) (intrinsicWidth / max2);
                            if (backgroundThreadDrawHolder == null) {
                                float f47 = i27;
                                f17 = f45;
                                float f48 = i28;
                                f16 = f46;
                                rectF.set(com.google.android.gms.internal.vision.e2.A(f17, f47, 2.0f, f7), com.google.android.gms.internal.vision.e2.A(f16, f48, 2.0f, f10), a2.a(f17, f47, 2.0f, f7), a2.a(f16, f48, 2.0f, f10));
                                bitmapDrawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                if (z12) {
                                    ((org.telegram.ui.Components.c6) bitmapDrawable2).z(rectF.left, rectF.top, rectF.width(), rectF.height());
                                }
                            } else {
                                f16 = f46;
                                f17 = f45;
                            }
                            if (backgroundThreadDrawHolder == null || iArr3 == null || iArr3[0] <= 0) {
                                backgroundThreadDrawHolder3 = backgroundThreadDrawHolder;
                            } else {
                                canvas.save();
                                if (backgroundThreadDrawHolder.roundPath == null) {
                                    backgroundThreadDrawHolder3 = backgroundThreadDrawHolder;
                                    path = backgroundThreadDrawHolder3.roundPath = new Path();
                                } else {
                                    backgroundThreadDrawHolder3 = backgroundThreadDrawHolder;
                                    path = backgroundThreadDrawHolder3.roundPath;
                                }
                                path.rewind();
                                RectF rectF4 = AndroidUtilities.rectTmp;
                                rectF4.set(f7, f10, f17 + f7, f16 + f10);
                                path.addRoundRect(rectF4, iArr3[0], iArr3[2], Path.Direction.CW);
                                canvas.clipPath(path);
                            }
                            if (this.isVisible) {
                                try {
                                    bitmapDrawable2.setAlpha(i10);
                                    drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder3, i10);
                                } catch (Exception e10) {
                                    if (backgroundThreadDrawHolder3 == null) {
                                        onBitmapException(bitmapDrawable2);
                                    }
                                    FileLog.e(e10);
                                }
                            }
                            canvas.restore();
                            if (backgroundThreadDrawHolder3 != null && iArr3 != null && iArr3[0] > 0) {
                                canvas.restore();
                            }
                        } else if (canvas != null) {
                            if (Math.abs(f25 - f24) > 1.0E-5f) {
                                canvas.save();
                                if (this.clip) {
                                    f14 = f24;
                                    canvas.clipRect(f7, f10, f7 + f45, f10 + f46);
                                } else {
                                    f14 = f24;
                                }
                                if (i12 == 1) {
                                    f15 = 2.0f;
                                    canvas.scale(-1.0f, 1.0f, f45 / 2.0f, f46 / 2.0f);
                                } else {
                                    f15 = 2.0f;
                                    if (i12 == 2) {
                                        canvas.scale(1.0f, -1.0f, f45 / 2.0f, f46 / 2.0f);
                                    }
                                }
                                int i29 = i11 % 360;
                                if (i29 != 0) {
                                    if (this.centerRotation) {
                                        canvas.rotate(i11, f45 / f15, f46 / f15);
                                    } else {
                                        canvas.rotate(i11, 0.0f, 0.0f);
                                    }
                                }
                                float f49 = intrinsicHeight / f14;
                                if (f49 > f45) {
                                    float f50 = (int) f49;
                                    rectF.set(a2.y(f50, f45, 2.0f, f7), f10, a2.a(f50, f45, 2.0f, f7), f10 + f46);
                                } else {
                                    float f51 = (int) (intrinsicWidth / f25);
                                    rectF.set(f7, a2.y(f51, f46, 2.0f, f10), f7 + f45, a2.a(f51, f46, 2.0f, f10));
                                }
                                if (z12) {
                                    ((org.telegram.ui.Components.c6) bitmapDrawable2).z(f7, f10, f45, f46);
                                }
                                if (backgroundThreadDrawHolder == null) {
                                    if (i29 != 90 && i29 != 270) {
                                        bitmapDrawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    } else {
                                        float width2 = rectF.width() / 2.0f;
                                        float height2 = rectF.height() / 2.0f;
                                        float centerX = rectF.centerX();
                                        float centerY = rectF.centerY();
                                        bitmapDrawable2.setBounds((int) (centerX - height2), (int) (centerY - width2), (int) (centerX + height2), (int) (centerY + width2));
                                    }
                                }
                                if (this.isVisible) {
                                    if (i15 >= 29) {
                                        try {
                                            if (this.blendMode != null) {
                                                bitmapDrawable2.getPaint().setBlendMode(b.b(this.blendMode));
                                            } else {
                                                bitmapDrawable2.getPaint().setBlendMode(null);
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                            if (backgroundThreadDrawHolder2 == null) {
                                            }
                                            FileLog.e(e);
                                            canvas.restore();
                                            if (!z10) {
                                            }
                                        }
                                    }
                                    backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                    try {
                                        drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder2, i10);
                                    } catch (Exception e12) {
                                        e = e12;
                                        if (backgroundThreadDrawHolder2 == null) {
                                            onBitmapException(bitmapDrawable2);
                                        }
                                        FileLog.e(e);
                                        canvas.restore();
                                        if (!z10) {
                                        }
                                    }
                                }
                                canvas.restore();
                            } else {
                                int i30 = i15;
                                canvas.save();
                                if (i12 == 1) {
                                    f13 = 2.0f;
                                    canvas.scale(-1.0f, 1.0f, f45 / 2.0f, f46 / 2.0f);
                                } else {
                                    f13 = 2.0f;
                                    if (i12 == 2) {
                                        canvas.scale(1.0f, -1.0f, f45 / 2.0f, f46 / 2.0f);
                                    }
                                }
                                int i31 = i11 % 360;
                                if (i31 != 0) {
                                    if (this.centerRotation) {
                                        canvas.rotate(i11, f45 / f13, f46 / f13);
                                    } else {
                                        canvas.rotate(i11, 0.0f, 0.0f);
                                    }
                                }
                                rectF.set(f7, f10, f7 + f45, f10 + f46);
                                if (this.isRoundVideo) {
                                    int i32 = AndroidUtilities.roundMessageInset;
                                    rectF.inset(-i32, -i32);
                                }
                                if (z12) {
                                    ((org.telegram.ui.Components.c6) bitmapDrawable2).z(f7, f10, f45, f46);
                                }
                                if (backgroundThreadDrawHolder == null) {
                                    if (i31 != 90 && i31 != 270) {
                                        bitmapDrawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    } else {
                                        float width3 = rectF.width() / 2.0f;
                                        float height3 = rectF.height() / 2.0f;
                                        float centerX2 = rectF.centerX();
                                        float centerY2 = rectF.centerY();
                                        bitmapDrawable2.setBounds((int) (centerX2 - height3), (int) (centerY2 - width3), (int) (centerX2 + height3), (int) (centerY2 + width3));
                                    }
                                }
                                if (this.isVisible) {
                                    if (i30 >= 29) {
                                        try {
                                            if (this.blendMode != null) {
                                                bitmapDrawable2.getPaint().setBlendMode(b.b(this.blendMode));
                                            } else {
                                                bitmapDrawable2.getPaint().setBlendMode(null);
                                            }
                                        } catch (Exception e13) {
                                            onBitmapException(bitmapDrawable2);
                                            FileLog.e(e13);
                                        }
                                    }
                                    drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder, i10);
                                }
                                canvas.restore();
                            }
                        }
                    }
                    if (!z10) {
                        ((hj0) drawable).a = false;
                        return;
                    } else {
                        if (drawable instanceof org.telegram.ui.Components.c6) {
                            ((org.telegram.ui.Components.c6) drawable).a = false;
                            return;
                        }
                        return;
                    }
                }
            }
            i14 = i17;
            if (paint == null) {
            }
            if (z11) {
            }
            if (!z11) {
                if (i13 != 1) {
                }
            }
            if (colorFilter != null) {
                if (bitmapShader == null) {
                }
            }
            z12 = bitmapDrawable2 instanceof org.telegram.ui.Components.c6;
            if (z12) {
            }
            i15 = i14;
            i16 = i11 % 360;
            if (i16 == 90) {
            }
            intrinsicHeight = bitmapDrawable2.getIntrinsicHeight();
            intrinsicWidth = bitmapDrawable2.getIntrinsicWidth();
            z13 = false;
            float f192 = this.sideClip;
            float f202 = f12 - (f192 * 2.0f);
            float f212 = f11 - (f192 * 2.0f);
            z14 = z13;
            float f222 = f12 != 0.0f ? 1.0f : intrinsicHeight / f202;
            if (f11 != 0.0f) {
            }
            if (z14) {
            }
            float f242 = f23;
            float f252 = f222;
            if (bitmapShader == null) {
            }
            float f452 = f12;
            float f462 = f11;
            if (!this.isAspectFit) {
            }
            if (!z10) {
            }
        } else {
            if (backgroundThreadDrawHolder == null) {
                if (this.isAspectFit) {
                    int intrinsicWidth2 = drawable.getIntrinsicWidth();
                    int intrinsicHeight2 = drawable.getIntrinsicHeight();
                    float f52 = this.sideClip;
                    float max3 = Math.max(f12 != 0.0f ? intrinsicWidth2 / (f12 - (f52 * 2.0f)) : 1.0f, f11 == 0.0f ? 1.0f : intrinsicHeight2 / (f11 - (f52 * 2.0f)));
                    float f53 = (int) (intrinsicWidth2 / max3);
                    float f54 = (int) (intrinsicHeight2 / max3);
                    rectF.set(com.google.android.gms.internal.vision.e2.A(f12, f53, 2.0f, f7), com.google.android.gms.internal.vision.e2.A(f11, f54, 2.0f, f10), a2.a(f12, f53, 2.0f, f7), a2.a(f11, f54, 2.0f, f10));
                } else {
                    rectF.set(f7, f10, f12 + f7, f11 + f10);
                }
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            }
            if (!this.isVisible || canvas == null) {
                return;
            }
            if (drawable instanceof SvgHelper.SvgDrawable) {
                svgDrawable2 = (SvgHelper.SvgDrawable) drawable;
                svgDrawable2.setParent(this);
            } else {
                if (drawable instanceof kq) {
                    Drawable drawable2 = ((kq) drawable).a;
                    if (drawable2 instanceof SvgHelper.SvgDrawable) {
                        svgDrawable2 = (SvgHelper.SvgDrawable) drawable2;
                        svgDrawable2.setParent(this);
                    }
                }
                svgDrawable = null;
                if (colorFilter != null && drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                drawable.setAlpha(i10);
                if (backgroundThreadDrawHolder != null) {
                    drawable.draw(canvas);
                } else if (svgDrawable != null) {
                    long j3 = backgroundThreadDrawHolder.time;
                    if (j3 == 0) {
                        j3 = System.currentTimeMillis();
                    }
                    ((SvgHelper.SvgDrawable) drawable).drawInternal(canvas, true, backgroundThreadDrawHolder.threadIndex, j3, backgroundThreadDrawHolder.imageX, backgroundThreadDrawHolder.imageY, backgroundThreadDrawHolder.imageW, backgroundThreadDrawHolder.imageH);
                } else {
                    drawable.draw(canvas);
                }
                if (svgDrawable == null) {
                    svgDrawable.setParent(null);
                    return;
                }
                return;
            }
            svgDrawable = svgDrawable2;
            if (colorFilter != null) {
                drawable.setColorFilter(colorFilter);
            }
            drawable.setAlpha(i10);
            if (backgroundThreadDrawHolder != null) {
            }
            if (svgDrawable == null) {
            }
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static abstract class Decorator {
        public abstract void onDraw(Canvas canvas, ImageReceiver imageReceiver);

        public void onDetachedFromWidnow() {
        }

        public void onAttachedToWindow(ImageReceiver imageReceiver) {
        }
    }

    public void skipDraw() {
    }
}
