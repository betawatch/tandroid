package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import androidx.core.graphics.ColorUtils;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder;

/* loaded from: classes4.dex */
public class MessageDrawable extends Drawable {
    public static MotionBackgroundDrawable[] motionBackground = new MotionBackgroundDrawable[3];
    private int alpha;
    private Drawable[][] backgroundDrawable;
    private int[][] backgroundDrawableColor;
    private Rect backupRect;
    private boolean botButtonsBottom;
    private Bitmap crosfadeFromBitmap;
    private Shader crosfadeFromBitmapShader;
    public MessageDrawable crossfadeFromDrawable;
    public float crossfadeProgress;
    private boolean currentAnimateGradient;
    private int[][] currentBackgroundDrawableRadius;
    private int currentBackgroundHeight;
    private int currentColor;
    private int currentGradientColor1;
    private int currentGradientColor2;
    private int currentGradientColor3;
    private int[] currentShadowDrawableRadius;
    private int currentType;
    private boolean drawFullBubble;
    private Shader gradientShader;
    private boolean isBottomNear;
    public boolean isCrossfadeBackground;
    private final boolean isOut;
    public boolean isSelected;
    private boolean isTopNear;
    public boolean lastDrawWithShadow;
    private Matrix matrix;
    private int overrideRoundRadius;
    private float overrideRounding;
    private Paint paint;
    private Path path;
    PathDrawParams pathDrawCacheParams;
    private RectF rect;
    private Theme.ResourcesProvider resourcesProvider;
    private Paint selectedPaint;
    private Drawable[] shadowDrawable;
    private Bitmap[] shadowDrawableBitmap;
    private int[] shadowDrawableColor;
    public boolean themePreview;
    private int topY;
    Drawable transitionDrawable;
    int transitionDrawableColor;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public MessageDrawable(int i, boolean z, boolean z2) {
        this(i, z, z2, null);
    }

    public MessageDrawable(int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this.paint = new Paint(1);
        this.rect = new RectF();
        this.matrix = new Matrix();
        this.backupRect = new Rect();
        this.currentShadowDrawableRadius = new int[]{-1, -1, -1, -1};
        this.shadowDrawableBitmap = new Bitmap[4];
        this.shadowDrawable = new Drawable[4];
        this.shadowDrawableColor = new int[]{-1, -1, -1, -1};
        this.currentBackgroundDrawableRadius = new int[][]{new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
        this.backgroundDrawable = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 4);
        this.backgroundDrawableColor = new int[][]{new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
        this.resourcesProvider = resourcesProvider;
        this.isOut = z;
        this.currentType = i;
        this.isSelected = z2;
        this.path = new Path();
        this.selectedPaint = new Paint(1);
        this.alpha = NotificationCenter.didReceiveSmsCode;
    }

    public boolean hasGradient() {
        return this.gradientShader != null && Theme.shouldDrawGradientIcons;
    }

    public void applyMatrixScale() {
        Bitmap bitmap;
        if (this.gradientShader instanceof BitmapShader) {
            if (this.isCrossfadeBackground && (bitmap = this.crosfadeFromBitmap) != null) {
                r2 = this.currentType == 2 ? (char) 1 : (char) 0;
                float min = 1.0f / Math.min(bitmap.getWidth() / motionBackground[r2].getBounds().width(), this.crosfadeFromBitmap.getHeight() / motionBackground[r2].getBounds().height());
                this.matrix.postScale(min, min);
                return;
            }
            if (this.themePreview) {
                r2 = 2;
            } else if (this.currentType == 2) {
                r2 = 1;
            }
            Bitmap bitmap2 = motionBackground[r2].getBitmap();
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / motionBackground[r2].getBounds().width(), bitmap2.getHeight() / motionBackground[r2].getBounds().height());
            this.matrix.postScale(min2, min2);
        }
    }

    public Shader getGradientShader() {
        return this.gradientShader;
    }

    public Matrix getMatrix() {
        return this.matrix;
    }

    protected int getColor(int i) {
        if (this.currentType == 2) {
            return Theme.getColor(i);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    protected int getCurrentColor(int i) {
        if (this.currentType == 2) {
            return Theme.getColor(i);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getCurrentColor(i) : Theme.getCurrentColor(i);
    }

    public void setBotButtonsBottom(boolean z) {
        this.botButtonsBottom = z;
    }

    public void setTop(int i, int i2, int i3, boolean z, boolean z2) {
        setTop(i, i2, i3, i3, 0, 0, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTop(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        int color;
        int i7;
        int i8;
        int i9;
        boolean z3;
        char c;
        int i10;
        int i11;
        MotionBackgroundDrawable motionBackgroundDrawable;
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.setTop(i, i2, i3, i4, i5, i6, z, z2);
        }
        if (this.isOut) {
            color = getColor(this.isSelected ? Theme.key_chat_outBubbleSelected : Theme.key_chat_outBubble);
            i7 = getCurrentColor(Theme.key_chat_outBubbleGradient1);
            i8 = getCurrentColor(Theme.key_chat_outBubbleGradient2);
            i9 = getCurrentColor(Theme.key_chat_outBubbleGradient3);
            if (getCurrentColor(Theme.key_chat_outBubbleGradientAnimated) != 0) {
                z3 = true;
                if (i7 != 0) {
                    color = getColor(Theme.key_chat_outBubble);
                }
                if (this.themePreview) {
                    c = this.currentType == 2 ? (char) 1 : (char) 0;
                } else {
                    c = 2;
                }
                if (!this.isCrossfadeBackground && i8 != 0 && z3 && (motionBackgroundDrawable = motionBackground[c]) != null) {
                    int[] colors = motionBackgroundDrawable.getColors();
                    this.currentColor = colors[0];
                    this.currentGradientColor1 = colors[1];
                    this.currentGradientColor2 = colors[2];
                    this.currentGradientColor3 = colors[3];
                }
                if (!this.isCrossfadeBackground && i8 != 0 && z3) {
                    if (i3 == this.currentBackgroundHeight && this.crosfadeFromBitmapShader != null && this.currentColor == color && this.currentGradientColor1 == i7 && this.currentGradientColor2 == i8 && this.currentGradientColor3 == i9 && this.currentAnimateGradient == z3) {
                        i11 = -1;
                    } else {
                        if (this.crosfadeFromBitmap == null) {
                            Bitmap createBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                            this.crosfadeFromBitmap = createBitmap;
                            createBitmap.setHasAlpha(false);
                            Bitmap bitmap = this.crosfadeFromBitmap;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            this.crosfadeFromBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        }
                        MotionBackgroundDrawable[] motionBackgroundDrawableArr = motionBackground;
                        if (motionBackgroundDrawableArr[c] == null) {
                            motionBackgroundDrawableArr[c] = new MotionBackgroundDrawable();
                            if (this.currentType != 2) {
                                motionBackground[c].setPostInvalidateParent(true);
                            }
                            motionBackground[c].setRoundRadius(dp(1.0f));
                        }
                        i11 = -1;
                        motionBackground[c].setColors(color, i7, i8, i9, this.crosfadeFromBitmap);
                        this.crosfadeFromBitmapShader.setLocalMatrix(this.matrix);
                    }
                    Shader shader = this.crosfadeFromBitmapShader;
                    this.gradientShader = shader;
                    this.paint.setShader(shader);
                    this.paint.setColor(i11);
                    this.currentColor = color;
                    this.currentAnimateGradient = z3;
                    this.currentGradientColor1 = i7;
                    this.currentGradientColor2 = i8;
                    this.currentGradientColor3 = i9;
                } else if (i7 == 0 && (this.gradientShader == null || i3 != this.currentBackgroundHeight || this.currentColor != color || this.currentGradientColor1 != i7 || this.currentGradientColor2 != i8 || this.currentGradientColor3 != i9 || this.currentAnimateGradient != z3)) {
                    if (i8 != 0 && z3) {
                        MotionBackgroundDrawable[] motionBackgroundDrawableArr2 = motionBackground;
                        if (motionBackgroundDrawableArr2[c] == null) {
                            motionBackgroundDrawableArr2[c] = new MotionBackgroundDrawable();
                            if (this.currentType != 2) {
                                motionBackground[c].setPostInvalidateParent(true);
                            }
                            motionBackground[c].setRoundRadius(dp(1.0f));
                        }
                        motionBackground[c].setColors(color, i7, i8, i9);
                        this.gradientShader = motionBackground[c].getBitmapShader();
                    } else if (i8 == 0) {
                        this.gradientShader = new LinearGradient(0.0f, i5, 0.0f, i3, new int[]{i7, color}, (float[]) null, Shader.TileMode.CLAMP);
                    } else if (i9 != 0) {
                        this.gradientShader = new LinearGradient(0.0f, i5, 0.0f, i3, new int[]{i9, i8, i7, color}, (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        this.gradientShader = new LinearGradient(0.0f, i5, 0.0f, i3, new int[]{i8, i7, color}, (float[]) null, Shader.TileMode.CLAMP);
                    }
                    this.paint.setShader(this.gradientShader);
                    this.currentColor = color;
                    this.currentAnimateGradient = z3;
                    this.currentGradientColor1 = i7;
                    this.currentGradientColor2 = i8;
                    this.currentGradientColor3 = i9;
                    this.paint.setColor(-1);
                } else if (i7 == 0) {
                    if (this.gradientShader != null) {
                        this.gradientShader = null;
                        this.paint.setShader(null);
                    }
                    this.paint.setColor(color);
                }
                if (this.gradientShader instanceof BitmapShader) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    motionBackground[c].setBounds(0, i5, i2, i3 - i4);
                }
                this.currentBackgroundHeight = i3;
                if (this.gradientShader instanceof BitmapShader) {
                    i10 = i4;
                }
                this.topY = i - i10;
                this.isTopNear = z;
                this.isBottomNear = z2;
            }
        } else {
            color = getColor(this.isSelected ? Theme.key_chat_inBubbleSelected : Theme.key_chat_inBubble);
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        z3 = false;
        if (i7 != 0) {
        }
        if (this.themePreview) {
        }
        if (!this.isCrossfadeBackground) {
            int[] colors2 = motionBackgroundDrawable.getColors();
            this.currentColor = colors2[0];
            this.currentGradientColor1 = colors2[1];
            this.currentGradientColor2 = colors2[2];
            this.currentGradientColor3 = colors2[3];
        }
        if (!this.isCrossfadeBackground) {
        }
        if (i7 == 0) {
        }
        if (i7 == 0) {
        }
        if (this.gradientShader instanceof BitmapShader) {
        }
        this.currentBackgroundHeight = i3;
        if (this.gradientShader instanceof BitmapShader) {
        }
        this.topY = i - i10;
        this.isTopNear = z;
        this.isBottomNear = z2;
    }

    public int getTopY() {
        return this.topY;
    }

    private int dp(float f) {
        if (this.currentType == 2) {
            return (int) Math.ceil(f * 3.0f);
        }
        return AndroidUtilities.dp(f);
    }

    public Paint getPaint() {
        return this.paint;
    }

    public Drawable[] getShadowDrawables() {
        return this.shadowDrawable;
    }

    public Drawable getBackgroundDrawable() {
        char c;
        int color;
        int i;
        int i2 = this.overrideRoundRadius;
        if (i2 == 0) {
            i2 = this.overrideRounding > 0.0f ? 0 : dp(SharedConfig.bubbleRadius);
        }
        boolean z = this.isTopNear;
        char c2 = 3;
        if (z && this.isBottomNear) {
            c = 3;
        } else if (z) {
            c = 2;
        } else {
            c = this.isBottomNear ? (char) 1 : (char) 0;
        }
        boolean z2 = this.isSelected;
        if (!z2 || !this.botButtonsBottom) {
            if (z2) {
                c2 = 1;
            } else {
                c2 = this.botButtonsBottom ? (char) 2 : (char) 0;
            }
        }
        if (z2) {
            color = getColor(this.isOut ? Theme.key_chat_outBubbleSelected : Theme.key_chat_inBubbleSelected);
        } else {
            color = getColor(this.isOut ? Theme.key_chat_outBubble : Theme.key_chat_inBubble);
        }
        boolean z3 = (this.gradientShader != null || this.isSelected || this.isCrossfadeBackground) ? false : true;
        int color2 = getColor(this.isOut ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
        if (this.lastDrawWithShadow != z3 || this.currentBackgroundDrawableRadius[c2][c] != i2 || ((z3 && this.shadowDrawableColor[c] != color2) || this.backgroundDrawableColor[c2][c] != color)) {
            this.currentBackgroundDrawableRadius[c2][c] = i2;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                this.backupRect.set(getBounds());
                if (z3) {
                    this.shadowDrawableColor[c] = color2;
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i = 0;
                    } else {
                        i = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    draw(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        draw(canvas, paint);
                    }
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(color);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                draw(canvas, paint2);
                this.backgroundDrawable[c2][c] = new NinePatchDrawable(createBitmap, getByteBuffer((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, color).array(), new Rect(), null);
                setBounds(this.backupRect);
            } catch (Throwable unused) {
            }
        }
        this.lastDrawWithShadow = z3;
        this.backgroundDrawableColor[c2][c] = color;
        return this.backgroundDrawable[c2][c];
    }

    public Drawable getTransitionDrawable(int i) {
        if (this.transitionDrawable == null) {
            Bitmap createBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            this.backupRect.set(getBounds());
            Paint paint = new Paint(1);
            paint.setColor(-1);
            setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            draw(canvas, paint);
            this.transitionDrawable = new NinePatchDrawable(createBitmap, getByteBuffer((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, -1).array(), new Rect(), null);
            setBounds(this.backupRect);
        }
        if (this.transitionDrawableColor != i) {
            this.transitionDrawableColor = i;
            this.transitionDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
        return this.transitionDrawable;
    }

    public MotionBackgroundDrawable getMotionBackgroundDrawable() {
        if (this.themePreview) {
            return motionBackground[2];
        }
        return motionBackground[this.currentType == 2 ? (char) 1 : (char) 0];
    }

    public Drawable getShadowDrawable() {
        char c;
        int i;
        if (this.isCrossfadeBackground) {
            return null;
        }
        if (this.gradientShader == null && !this.isSelected && this.crossfadeFromDrawable == null) {
            return null;
        }
        int dp = dp(SharedConfig.bubbleRadius);
        boolean z = this.isTopNear;
        boolean z2 = false;
        if (z && this.isBottomNear) {
            c = 3;
        } else if (z) {
            c = 2;
        } else {
            c = this.isBottomNear ? (char) 1 : (char) 0;
        }
        int[] iArr = this.currentShadowDrawableRadius;
        if (iArr[c] != dp) {
            iArr[c] = dp;
            Bitmap bitmap = this.shadowDrawableBitmap[c];
            if (bitmap != null) {
                bitmap.recycle();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                if (AndroidUtilities.density > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                draw(canvas, paint);
                if (AndroidUtilities.density > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    draw(canvas, paint);
                    i = 0;
                } else {
                    i = 1;
                }
                this.shadowDrawableBitmap[c] = createBitmap;
                this.shadowDrawable[c] = new NinePatchDrawable(createBitmap, getByteBuffer((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, i).array(), new Rect(), null);
                z2 = true;
            } catch (Throwable unused) {
            }
        }
        int color = getColor(this.isOut ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
        Drawable drawable = this.shadowDrawable[c];
        if (drawable != null && (this.shadowDrawableColor[c] != color || z2)) {
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            this.shadowDrawableColor[c] = color;
        }
        return this.shadowDrawable[c];
    }

    protected void finalize() {
        super.finalize();
        for (Bitmap bitmap : this.shadowDrawableBitmap) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(this.shadowDrawableBitmap, (Object) null);
        Arrays.fill(this.shadowDrawable, (Object) null);
        Arrays.fill(this.currentShadowDrawableRadius, -1);
    }

    private static ByteBuffer getByteBuffer(int i, int i2, int i3, int i4, int i5) {
        return NinePatchBuilder.createNinePatchChunk(i, i2, i3, i4, 0, 0, 0, 0, i5);
    }

    public void drawCached(Canvas canvas, PathDrawParams pathDrawParams, Paint paint) {
        this.pathDrawCacheParams = pathDrawParams;
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.pathDrawCacheParams = pathDrawParams;
        }
        draw(canvas, paint);
        this.pathDrawCacheParams = null;
        MessageDrawable messageDrawable2 = this.crossfadeFromDrawable;
        if (messageDrawable2 != null) {
            messageDrawable2.pathDrawCacheParams = null;
        }
    }

    public void drawCached(Canvas canvas, PathDrawParams pathDrawParams) {
        drawCached(canvas, pathDrawParams, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.draw(canvas);
            setAlpha((int) (this.crossfadeProgress * 255.0f));
            draw(canvas, null);
            setAlpha(NotificationCenter.didReceiveSmsCode);
            return;
        }
        draw(canvas, null);
    }

    public void draw(Canvas canvas, Paint paint) {
        int dp;
        int dp2;
        int i;
        int i2;
        Path path;
        boolean z;
        Drawable backgroundDrawable;
        Rect bounds = getBounds();
        if (paint == null && this.gradientShader == null && this.overrideRoundRadius == 0 && this.overrideRounding <= 0.0f && (backgroundDrawable = getBackgroundDrawable()) != null) {
            backgroundDrawable.setBounds(bounds);
            backgroundDrawable.draw(canvas);
            return;
        }
        int dp3 = dp(2.0f);
        int i3 = this.overrideRoundRadius;
        if (i3 != 0) {
            i2 = i3;
            i = i2;
        } else {
            if (this.overrideRounding > 0.0f) {
                dp = AndroidUtilities.lerp(dp(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
                dp2 = AndroidUtilities.lerp(dp(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
            } else if (this.currentType == 2) {
                dp = dp(6.0f);
                dp2 = dp(6.0f);
            } else {
                dp = dp(SharedConfig.bubbleRadius);
                dp2 = dp(Math.min(6, SharedConfig.bubbleRadius));
            }
            i = dp2;
            i2 = dp;
        }
        int dp4 = dp(6.0f);
        Paint paint2 = paint == null ? this.paint : paint;
        if (paint == null && this.gradientShader != null) {
            this.matrix.reset();
            applyMatrixScale();
            this.matrix.postTranslate(0.0f, -this.topY);
            this.gradientShader.setLocalMatrix(this.matrix);
        }
        int max = Math.max(bounds.top, 0);
        if (this.pathDrawCacheParams != null) {
            bounds.height();
        }
        PathDrawParams pathDrawParams = this.pathDrawCacheParams;
        if (pathDrawParams != null) {
            path = pathDrawParams.path;
            z = pathDrawParams.invalidatePath(bounds, true, true);
        } else {
            path = this.path;
            z = true;
        }
        if (z || this.overrideRoundRadius != 0) {
            generatePath(path, bounds, dp3, i2, dp4, i, max, true, true, paint != null);
        }
        canvas.drawPath(path, paint2);
        if (this.gradientShader != null && this.isSelected && paint == null) {
            this.selectedPaint.setColor(ColorUtils.setAlphaComponent(getColor(Theme.key_chat_outBubbleGradientSelectedOverlay), (int) ((Color.alpha(r0) * this.alpha) / 255.0f)));
            canvas.drawPath(path, this.selectedPaint);
        }
    }

    public Path makePath() {
        return makePath(this.pathDrawCacheParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Path makePath(PathDrawParams pathDrawParams) {
        int dp;
        int dp2;
        int i;
        int i2;
        boolean z;
        boolean z2;
        Path path;
        Rect bounds = getBounds();
        int dp3 = dp(2.0f);
        int i3 = this.overrideRoundRadius;
        if (i3 != 0) {
            i2 = i3;
            i = i2;
        } else {
            if (this.overrideRounding > 0.0f) {
                dp = AndroidUtilities.lerp(dp(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
                dp2 = AndroidUtilities.lerp(dp(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
            } else if (this.currentType == 2) {
                dp = dp(6.0f);
                dp2 = dp(6.0f);
            } else {
                dp = dp(SharedConfig.bubbleRadius);
                dp2 = dp(Math.min(6, SharedConfig.bubbleRadius));
            }
            i = dp2;
            i2 = dp;
        }
        int dp4 = dp(6.0f);
        int max = Math.max(bounds.top, 0);
        boolean z3 = true;
        if (pathDrawParams == null || bounds.height() >= this.currentBackgroundHeight) {
            z = this.currentType != 1 ? (this.topY + bounds.bottom) - i2 < this.currentBackgroundHeight : (this.topY + bounds.bottom) - (dp4 * 2) < this.currentBackgroundHeight;
            if (this.topY + (i2 * 2) < 0) {
                z2 = false;
                if (pathDrawParams == null) {
                    Path path2 = pathDrawParams.path;
                    z3 = pathDrawParams.invalidatePath(bounds, z, z2);
                    path = path2;
                } else {
                    path = this.path;
                }
                if (!z3 || this.overrideRoundRadius != 0) {
                    generatePath(path, bounds, dp3, i2, dp4, i, max, z, z2, true);
                }
                return path;
            }
        } else {
            z = true;
        }
        z2 = true;
        if (pathDrawParams == null) {
        }
        if (!z3) {
        }
        generatePath(path, bounds, dp3, i2, dp4, i, max, z, z2, true);
        return path;
    }

    private void generatePath(Path path, Rect rect, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        path.rewind();
        int height = (rect.height() - i) >> 1;
        int i6 = i2;
        if (i6 > height) {
            i6 = height;
        }
        if (this.isOut) {
            if (this.drawFullBubble || this.currentType == 2 || z3 || z) {
                int i7 = this.botButtonsBottom ? i4 : i6;
                if (this.currentType == 1) {
                    path.moveTo((rect.right - dp(8.0f)) - i7, rect.bottom - i);
                } else {
                    path.moveTo(rect.right - dp(2.6f), rect.bottom - i);
                }
                path.lineTo(rect.left + i + i7, rect.bottom - i);
                int i8 = i7 * 2;
                this.rect.set(rect.left + i, r10 - i8, r11 + i8, rect.bottom - i);
                path.arcTo(this.rect, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
                path.lineTo(rect.left + i, (i5 - this.topY) + this.currentBackgroundHeight);
            }
            if (this.drawFullBubble || this.currentType == 2 || z3 || z2) {
                path.lineTo(rect.left + i, rect.top + i + i6);
                int i9 = i6 * 2;
                this.rect.set(rect.left + i, rect.top + i, r9 + i9, r11 + i9);
                path.arcTo(this.rect, 180.0f, 90.0f, false);
                int i10 = this.isTopNear ? i4 : i6;
                if (this.currentType == 1) {
                    path.lineTo((rect.right - i) - i10, rect.top + i);
                    RectF rectF = this.rect;
                    int i11 = rect.right - i;
                    int i12 = i10 * 2;
                    rectF.set(i11 - i12, rect.top + i, i11, r12 + i12);
                } else {
                    path.lineTo((rect.right - dp(8.0f)) - i10, rect.top + i);
                    int i13 = i10 * 2;
                    this.rect.set((rect.right - dp(8.0f)) - i13, rect.top + i, rect.right - dp(8.0f), rect.top + i + i13);
                }
                path.arcTo(this.rect, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i, (i5 - this.topY) - dp(2.0f));
                if (this.currentType == 1) {
                    path.lineTo(rect.right - i, (i5 - this.topY) - dp(2.0f));
                } else {
                    path.lineTo(rect.right - dp(8.0f), (i5 - this.topY) - dp(2.0f));
                }
            }
            int i14 = this.currentType;
            if (i14 == 1) {
                if (z3 || z) {
                    if (this.isBottomNear) {
                        i6 = i4;
                    }
                    path.lineTo(rect.right - i, (rect.bottom - i) - i6);
                    int i15 = i6 * 2;
                    this.rect.set(r4 - i15, r2 - i15, rect.right - i, rect.bottom - i);
                    path.arcTo(this.rect, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i, (i5 - this.topY) + this.currentBackgroundHeight);
                }
            } else if (this.drawFullBubble || i14 == 2 || z3 || z) {
                path.lineTo(rect.right - dp(8.0f), ((rect.bottom - i) - i3) - dp(3.0f));
                int i16 = i3 * 2;
                this.rect.set(rect.right - dp(8.0f), ((rect.bottom - i) - i16) - dp(9.0f), (rect.right - dp(7.0f)) + i16, (rect.bottom - i) - dp(1.0f));
                path.arcTo(this.rect, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
            }
        } else {
            if (this.drawFullBubble || this.currentType == 2 || z3 || z) {
                int i17 = this.botButtonsBottom ? i4 : i6;
                if (this.currentType == 1) {
                    path.moveTo(rect.left + dp(8.0f) + i17, rect.bottom - i);
                } else {
                    path.moveTo(rect.left + dp(2.6f), rect.bottom - i);
                }
                path.lineTo((rect.right - i) - i17, rect.bottom - i);
                int i18 = i17 * 2;
                this.rect.set(r11 - i18, r13 - i18, rect.right - i, rect.bottom - i);
                path.arcTo(this.rect, 90.0f, -90.0f, false);
            } else {
                path.moveTo(rect.left + dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
                path.lineTo(rect.right - i, (i5 - this.topY) + this.currentBackgroundHeight);
            }
            if (this.drawFullBubble || this.currentType == 2 || z3 || z2) {
                path.lineTo(rect.right - i, rect.top + i + i6);
                RectF rectF2 = this.rect;
                int i19 = rect.right - i;
                int i20 = i6 * 2;
                rectF2.set(i19 - i20, rect.top + i, i19, r13 + i20);
                path.arcTo(this.rect, 0.0f, -90.0f, false);
                int i21 = this.isTopNear ? i4 : i6;
                if (this.currentType == 1) {
                    path.lineTo(rect.left + i + i21, rect.top + i);
                    int i22 = i21 * 2;
                    this.rect.set(rect.left + i, rect.top + i, r11 + i22, r13 + i22);
                } else {
                    path.lineTo(rect.left + dp(8.0f) + i21, rect.top + i);
                    int i23 = i21 * 2;
                    this.rect.set(rect.left + dp(8.0f), rect.top + i, rect.left + dp(8.0f) + i23, rect.top + i + i23);
                }
                path.arcTo(this.rect, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i, (i5 - this.topY) - dp(2.0f));
                if (this.currentType == 1) {
                    path.lineTo(rect.left + i, (i5 - this.topY) - dp(2.0f));
                } else {
                    path.lineTo(rect.left + dp(8.0f), (i5 - this.topY) - dp(2.0f));
                }
            }
            int i24 = this.currentType;
            if (i24 == 1) {
                if (z3 || z) {
                    if (this.isBottomNear || this.botButtonsBottom) {
                        i6 = i4;
                    }
                    path.lineTo(rect.left + i, (rect.bottom - i) - i6);
                    int i25 = i6 * 2;
                    this.rect.set(rect.left + i, r2 - i25, r4 + i25, rect.bottom - i);
                    path.arcTo(this.rect, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i, (i5 - this.topY) + this.currentBackgroundHeight);
                }
            } else if (this.drawFullBubble || i24 == 2 || z3 || z) {
                path.lineTo(rect.left + dp(8.0f), ((rect.bottom - i) - i3) - dp(3.0f));
                int i26 = i3 * 2;
                this.rect.set((rect.left + dp(7.0f)) - i26, ((rect.bottom - i) - i26) - dp(9.0f), rect.left + dp(8.0f), (rect.bottom - i) - dp(1.0f));
                path.arcTo(this.rect, 0.0f, 83.0f, false);
            } else {
                path.lineTo(rect.left + dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
            }
        }
        path.close();
    }

    public void setDrawFullBubble(boolean z) {
        this.drawFullBubble = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.alpha != i || this.paint.getAlpha() != i) {
            this.alpha = i;
            this.paint.setAlpha(i);
            if (this.isOut) {
                this.selectedPaint.setAlpha((int) (Color.alpha(getColor(Theme.key_chat_outBubbleGradientSelectedOverlay)) * (i / 255.0f)));
            }
        }
        if (this.gradientShader == null) {
            Drawable backgroundDrawable = getBackgroundDrawable();
            if (backgroundDrawable.getAlpha() != i) {
                backgroundDrawable.setAlpha(i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.setBounds(i, i2, i3, i4);
        }
    }

    public void setRoundRadius(int i) {
        this.overrideRoundRadius = i;
    }

    public void setRoundingRadius(float f) {
        this.overrideRounding = f;
    }

    public void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public static class PathDrawParams {
        boolean lastDrawFullBottom;
        boolean lastDrawFullTop;
        Path path = new Path();
        Rect lastRect = new Rect();

        public boolean invalidatePath(Rect rect, boolean z, boolean z2) {
            boolean z3;
            if (!this.lastRect.isEmpty()) {
                Rect rect2 = this.lastRect;
                if (rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.lastDrawFullTop == z2 && this.lastDrawFullBottom == z && z2 && z) {
                    z3 = false;
                    this.lastDrawFullTop = z2;
                    this.lastDrawFullBottom = z;
                    this.lastRect.set(rect);
                    return z3;
                }
            }
            z3 = true;
            this.lastDrawFullTop = z2;
            this.lastDrawFullBottom = z;
            this.lastRect.set(rect);
            return z3;
        }

        public Path getPath() {
            return this.path;
        }
    }
}
