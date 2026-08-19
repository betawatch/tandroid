package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes5.dex */
public class MediaActionDrawable extends Drawable {
    private float animatedDownloadProgress;
    private boolean animatingTransition;
    private ColorFilter colorFilter;
    private int currentIcon;
    private MediaActionDrawableDelegate delegate;
    private float downloadProgress;
    private float downloadProgressAnimationStart;
    private float downloadProgressTime;
    private float downloadRadOffset;
    private LinearGradient gradientDrawable;
    private Matrix gradientMatrix;
    private boolean hasOverlayImage;
    private boolean isMini;
    private long lastAnimationTime;
    private MessageDrawable messageDrawable;
    private int nextIcon;
    private String percentString;
    private int percentStringWidth;
    private float savedTransitionProgress;
    private TextPaint textPaint = new TextPaint(1);
    public Paint paint = new Paint(1);
    private Paint backPaint = new Paint(1);
    public Paint paint2 = new Paint(1);
    private Paint paint3 = new Paint(1);
    private RectF rect = new RectF();
    private float scale = 1.0f;
    private DecelerateInterpolator interpolator = new DecelerateInterpolator();
    private float transitionAnimationTime = 400.0f;
    private int lastPercent = -1;
    private float overrideAlpha = 1.0f;
    private float transitionProgress = 1.0f;

    public interface MediaActionDrawableDelegate {
        void invalidate();
    }

    public static float getCircleValue(float f) {
        while (f > 360.0f) {
            f -= 360.0f;
        }
        return f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public MediaActionDrawable() {
        this.paint.setColor(-1);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint3.setColor(-1);
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setColor(-1);
        this.paint2.setColor(-1);
    }

    public void setOverrideAlpha(float f) {
        this.overrideAlpha = f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        this.paint2.setColorFilter(colorFilter);
        this.paint3.setColorFilter(colorFilter);
        this.textPaint.setColorFilter(colorFilter);
    }

    public void setColor(int i) {
        int i2 = (-16777216) | i;
        this.paint.setColor(i2);
        this.paint2.setColor(i2);
        this.paint3.setColor(i2);
        this.textPaint.setColor(i2);
        this.colorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    public void setBackColor(int i) {
        this.backPaint.setColor(i | (-16777216));
    }

    public void setMini(boolean z) {
        this.isMini = z;
        this.paint.setStrokeWidth(AndroidUtilities.dp(z ? 2.0f : 3.0f));
    }

    public void setDelegate(MediaActionDrawableDelegate mediaActionDrawableDelegate) {
        this.delegate = mediaActionDrawableDelegate;
    }

    public boolean setIcon(int i, boolean z) {
        int i2;
        int i3;
        if (this.currentIcon == i && (i3 = this.nextIcon) != i) {
            this.currentIcon = i3;
            this.transitionProgress = 1.0f;
        }
        if (z) {
            int i4 = this.currentIcon;
            if (i4 == i || (i2 = this.nextIcon) == i) {
                return false;
            }
            if ((i4 == 0 && i == 1) || (i4 == 1 && i == 0)) {
                this.transitionAnimationTime = 300.0f;
            } else if (i4 == 2 && (i == 3 || i == 14)) {
                this.transitionAnimationTime = 400.0f;
            } else if (i4 != 4 && i == 6) {
                this.transitionAnimationTime = 360.0f;
            } else if ((i4 == 4 && i == 14) || (i4 == 14 && i == 4)) {
                this.transitionAnimationTime = 160.0f;
            } else {
                this.transitionAnimationTime = 220.0f;
            }
            if (this.animatingTransition) {
                this.currentIcon = i2;
            }
            this.animatingTransition = true;
            this.nextIcon = i;
            this.savedTransitionProgress = this.transitionProgress;
            this.transitionProgress = 0.0f;
        } else {
            if (this.currentIcon == i) {
                return false;
            }
            this.animatingTransition = false;
            this.nextIcon = i;
            this.currentIcon = i;
            this.savedTransitionProgress = this.transitionProgress;
            this.transitionProgress = 1.0f;
        }
        if (i == 3 || i == 14) {
            this.downloadRadOffset = 112.0f;
            this.animatedDownloadProgress = 0.0f;
            this.downloadProgressAnimationStart = 0.0f;
            this.downloadProgressTime = 0.0f;
        }
        invalidateSelf();
        return true;
    }

    public int getCurrentIcon() {
        return this.nextIcon;
    }

    public int getPreviousIcon() {
        return this.currentIcon;
    }

    public void setProgress(float f, boolean z) {
        if (this.downloadProgress == f) {
            return;
        }
        if (!z) {
            this.animatedDownloadProgress = f;
            this.downloadProgressAnimationStart = f;
        } else {
            if (this.animatedDownloadProgress > f) {
                this.animatedDownloadProgress = f;
            }
            this.downloadProgressAnimationStart = this.animatedDownloadProgress;
        }
        this.downloadProgress = f;
        this.downloadProgressTime = 0.0f;
        invalidateSelf();
    }

    public float getProgress() {
        return this.downloadProgress;
    }

    public float getTransitionProgress() {
        if (this.animatingTransition) {
            return this.transitionProgress;
        }
        return 1.0f;
    }

    public void setBackgroundDrawable(MessageDrawable messageDrawable) {
        this.messageDrawable = messageDrawable;
    }

    public void setHasOverlayImage(boolean z) {
        this.hasOverlayImage = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float intrinsicWidth = (i3 - i) / getIntrinsicWidth();
        this.scale = intrinsicWidth;
        if (intrinsicWidth < 0.7f) {
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        MediaActionDrawableDelegate mediaActionDrawableDelegate = this.delegate;
        if (mediaActionDrawableDelegate != null) {
            mediaActionDrawableDelegate.invalidate();
        }
    }

    public void applyShaderMatrix(boolean z) {
        MessageDrawable messageDrawable = this.messageDrawable;
        if (messageDrawable == null || !messageDrawable.hasGradient() || this.hasOverlayImage) {
            return;
        }
        Rect bounds = getBounds();
        Shader gradientShader = this.messageDrawable.getGradientShader();
        Matrix matrix = this.messageDrawable.getMatrix();
        matrix.reset();
        this.messageDrawable.applyMatrixScale();
        if (z) {
            matrix.postTranslate(-bounds.centerX(), (-this.messageDrawable.getTopY()) + bounds.top);
        } else {
            matrix.postTranslate(0.0f, -this.messageDrawable.getTopY());
        }
        gradientShader.setLocalMatrix(matrix);
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0840, code lost:
    
        if (r47.nextIcon == 1) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0849, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0846, code lost:
    
        r3 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0844, code lost:
    
        if (r2 != 1) goto L350;
     */
    /* JADX WARN: Removed duplicated region for block: B:253:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x067c  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        int save;
        int i;
        float f;
        float dp;
        float f2;
        int i2;
        int i3;
        int i4;
        float dp2;
        float dp3;
        float dp4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i5;
        float f9;
        float f10;
        float f11;
        Canvas canvas2;
        int i6;
        int i7;
        int i8;
        float f12;
        float f13;
        float centerY;
        float f14;
        float dp5;
        int min;
        float f15;
        float f16;
        float f17;
        float f18;
        float centerX;
        int centerY2;
        int centerY3;
        int i9;
        int i10;
        float f19;
        float f20;
        Path[] pathArr;
        Path[] pathArr2;
        Drawable drawable;
        Drawable drawable2;
        Path[] pathArr3;
        Rect rect;
        Path[] pathArr4;
        Path[] pathArr5;
        int i11;
        int i12;
        float f21;
        int i13;
        int i14;
        float f22;
        int i15;
        int i16;
        int i17;
        float f23;
        int i18;
        float f24;
        float f25;
        float f26;
        int i19;
        int i20;
        int i21;
        float f27;
        Path path;
        int i22;
        int i23;
        float f28 = 90.0f;
        Rect bounds = getBounds();
        MessageDrawable messageDrawable = this.messageDrawable;
        if (messageDrawable != null && messageDrawable.hasGradient() && !this.hasOverlayImage) {
            Shader gradientShader = this.messageDrawable.getGradientShader();
            this.paint.setShader(gradientShader);
            this.paint2.setShader(gradientShader);
            this.paint3.setShader(gradientShader);
        } else if (this.gradientDrawable != null && !this.hasOverlayImage) {
            this.gradientMatrix.reset();
            this.gradientMatrix.setTranslate(0.0f, bounds.top);
            this.gradientDrawable.setLocalMatrix(this.gradientMatrix);
            this.paint.setShader(this.gradientDrawable);
            this.paint2.setShader(this.gradientDrawable);
            this.paint3.setShader(this.gradientDrawable);
        } else {
            this.paint.setShader(null);
            this.paint2.setShader(null);
            this.paint3.setShader(null);
        }
        int centerX2 = bounds.centerX();
        int centerY4 = bounds.centerY();
        int i24 = this.nextIcon;
        if (i24 == 4) {
            int i25 = this.currentIcon;
            if (i25 != 3 && i25 != 14) {
                save = canvas.save();
                float f29 = 1.0f - this.transitionProgress;
                canvas.scale(f29, f29, centerX2, centerY4);
                i = save;
            }
            i = 0;
        } else {
            if ((i24 == 6 || i24 == 10) && this.currentIcon == 4) {
                save = canvas.save();
                float f30 = this.transitionProgress;
                canvas.scale(f30, f30, centerX2, centerY4);
                i = save;
            }
            i = 0;
        }
        AndroidUtilities.dp(3.0f);
        if (this.currentIcon == 2 || this.nextIcon == 2) {
            applyShaderMatrix(false);
            float f31 = centerY4;
            float dp6 = f31 - (AndroidUtilities.dp(9.0f) * this.scale);
            float dp7 = (AndroidUtilities.dp(9.0f) * this.scale) + f31;
            float dp8 = (AndroidUtilities.dp(12.0f) * this.scale) + f31;
            int i26 = this.currentIcon;
            if ((i26 == 3 || i26 == 14) && this.nextIcon == 2) {
                this.paint.setAlpha((int) (Math.min(1.0f, this.transitionProgress / 0.5f) * 255.0f));
                f = this.transitionProgress;
                dp = AndroidUtilities.dp(12.0f);
                f2 = this.scale;
            } else {
                int i27 = this.nextIcon;
                if (i27 != 3 && i27 != 14 && i27 != 2) {
                    this.paint.setAlpha((int) (Math.min(1.0f, this.savedTransitionProgress / 0.5f) * 255.0f * (1.0f - this.transitionProgress)));
                    f = this.savedTransitionProgress;
                } else {
                    this.paint.setAlpha(NotificationCenter.didReceiveSmsCode);
                    f = this.transitionProgress;
                }
                dp = AndroidUtilities.dp(1.0f);
                f2 = this.scale;
            }
            float f32 = (dp * f2) + f31;
            if (this.animatingTransition) {
                int i28 = this.nextIcon;
                if (i28 == 2) {
                    i2 = centerX2;
                    i3 = centerY4;
                    f8 = dp8;
                    i4 = 8;
                    i5 = 2;
                } else if (f <= 0.5f) {
                    i2 = centerX2;
                    i3 = centerY4;
                    f8 = dp8;
                    i5 = 2;
                    i4 = 8;
                } else {
                    float dp9 = AndroidUtilities.dp(13.0f);
                    float f33 = this.scale;
                    float dp10 = (dp9 * f33 * f33) + (this.isMini ? AndroidUtilities.dp(2.0f) : 0);
                    float f34 = f - 0.5f;
                    float f35 = f34 / 0.5f;
                    if (f34 > 0.2f) {
                        f11 = (f34 - 0.2f) / 0.3f;
                        f10 = 1.0f;
                    } else {
                        f10 = f34 / 0.2f;
                        f11 = 0.0f;
                    }
                    dp2 = centerX2;
                    float f36 = dp2 - dp10;
                    float f37 = dp10 / 2.0f;
                    this.rect.set(f36, dp8 - f37, dp2, f37 + dp8);
                    float f38 = f11 * 100.0f;
                    i3 = centerY4;
                    f4 = dp8;
                    i4 = 8;
                    canvas.drawArc(this.rect, f38, (f35 * 104.0f) - f38, false, this.paint);
                    float f39 = f32 + ((f4 - f32) * f10);
                    if (f11 > 0.0f) {
                        float f40 = this.nextIcon == 14 ? 0.0f : (1.0f - f11) * (-45.0f);
                        float dp11 = AndroidUtilities.dp(7.0f) * f11 * this.scale;
                        int i29 = (int) (f11 * 255.0f);
                        int i30 = this.nextIcon;
                        if (i30 != 3 && i30 != 14 && i30 != 2) {
                            i29 = (int) (i29 * (1.0f - Math.min(1.0f, this.transitionProgress / 0.5f)));
                        }
                        int i31 = i29;
                        if (f40 != 0.0f) {
                            canvas.save();
                            canvas.rotate(f40, dp2, f31);
                        }
                        if (i31 != 0) {
                            this.paint.setAlpha(i31);
                            if (this.nextIcon == 14) {
                                this.paint3.setAlpha(i31);
                                this.rect.set(centerX2 - AndroidUtilities.dp(3.5f), i3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + centerX2, AndroidUtilities.dp(3.5f) + i3);
                                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                                this.paint.setAlpha((int) (i31 * 0.15f));
                                int dp12 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                                this.rect.set(bounds.left + dp12, bounds.top + dp12, bounds.right - dp12, bounds.bottom - dp12);
                                canvas.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                                this.paint.setAlpha(i31);
                            } else {
                                float f41 = dp2 - dp11;
                                float f42 = f31 - dp11;
                                float f43 = dp2 + dp11;
                                float f44 = f31 + dp11;
                                canvas.drawLine(f41, f42, f43, f44, this.paint);
                                canvas.drawLine(f43, f42, f41, f44, this.paint);
                            }
                        }
                        if (f40 != 0.0f) {
                            canvas.restore();
                        }
                    }
                    i2 = centerX2;
                    dp6 = f39;
                    f5 = dp2;
                    f6 = f4;
                    if (dp6 != f6) {
                        float f45 = i2;
                        canvas.drawLine(f45, dp6, f45, f6, this.paint);
                    }
                    f7 = i2;
                    if (dp2 != f7) {
                        float f46 = f4;
                        canvas.drawLine(dp2, f46, f7, f6, this.paint);
                        canvas.drawLine(f5, f46, f7, f6, this.paint);
                    }
                }
                if (i28 == i5) {
                    f9 = 1.0f - f;
                } else {
                    f9 = f / 0.5f;
                    f = 1.0f - f9;
                }
                dp6 += (f32 - dp6) * f9;
                dp7 += (f8 - dp7) * f9;
                float f47 = i2;
                dp2 = f47 - ((AndroidUtilities.dp(8.0f) * f) * this.scale);
                dp3 = f47 + (AndroidUtilities.dp(8.0f) * f * this.scale);
                dp4 = AndroidUtilities.dp(8.0f) * f;
                f3 = this.scale;
            } else {
                i2 = centerX2;
                i3 = centerY4;
                i4 = 8;
                float f48 = i2;
                dp2 = f48 - (AndroidUtilities.dp(8.0f) * this.scale);
                dp3 = f48 + (AndroidUtilities.dp(8.0f) * this.scale);
                dp4 = AndroidUtilities.dp(8.0f);
                f3 = this.scale;
            }
            f5 = dp3;
            f4 = dp7 - (dp4 * f3);
            f6 = dp7;
            if (dp6 != f6) {
            }
            f7 = i2;
            if (dp2 != f7) {
            }
        } else {
            i2 = centerX2;
            i3 = centerY4;
            i4 = 8;
        }
        int i32 = this.currentIcon;
        if (i32 == 3 || i32 == 14 || (i32 == 4 && ((i23 = this.nextIcon) == 14 || i23 == 3))) {
            canvas2 = canvas;
            applyShaderMatrix(false);
            int i33 = this.nextIcon;
            if (i33 == 2) {
                float f49 = this.transitionProgress;
                if (f49 <= 0.5f) {
                    float f50 = 1.0f - (f49 / 0.5f);
                    i10 = (int) (f50 * 255.0f);
                    dp5 = AndroidUtilities.dp(7.0f) * f50 * this.scale;
                } else {
                    dp5 = 0.0f;
                    i10 = 0;
                }
                min = i10;
                centerY = 0.0f;
                f14 = 0.0f;
                f16 = 0.0f;
                f15 = 1.0f;
                i6 = 9;
                i7 = 7;
            } else {
                if (i33 == 15 || i33 == 0 || i33 == 1 || i33 == 5 || i33 == i4) {
                    i6 = 9;
                    i7 = 7;
                } else {
                    i6 = 9;
                    i7 = 7;
                    if (i33 != 9) {
                        i8 = 6;
                        if (i33 != 7 && i33 != 6) {
                            if (i33 == 4) {
                                float f51 = 1.0f - this.transitionProgress;
                                float dp13 = AndroidUtilities.dp(7.0f) * this.scale;
                                int i34 = (int) (f51 * 255.0f);
                                if (this.currentIcon == 14) {
                                    f14 = bounds.left;
                                    centerY3 = bounds.top;
                                } else {
                                    f14 = bounds.centerX();
                                    centerY3 = bounds.centerY();
                                }
                                f15 = f51;
                                dp5 = dp13;
                                centerY = centerY3;
                                min = i34;
                                f16 = 0.0f;
                            } else if (i33 == 14 || i33 == 3) {
                                float f52 = this.transitionProgress;
                                float f53 = 1.0f - f52;
                                if (this.currentIcon == 4) {
                                    f18 = f52;
                                    f17 = 0.0f;
                                } else {
                                    f17 = f53 * 45.0f;
                                    f18 = 1.0f;
                                }
                                float dp14 = AndroidUtilities.dp(7.0f) * this.scale;
                                int i35 = (int) (f52 * 255.0f);
                                if (this.nextIcon == 14) {
                                    centerX = bounds.left;
                                    centerY2 = bounds.top;
                                } else {
                                    centerX = bounds.centerX();
                                    centerY2 = bounds.centerY();
                                }
                                float f54 = f18;
                                f14 = centerX;
                                dp5 = dp14;
                                f16 = f17;
                                centerY = centerY2;
                                min = i35;
                                f15 = f54;
                            } else {
                                dp5 = AndroidUtilities.dp(7.0f) * this.scale;
                                centerY = 0.0f;
                                f14 = 0.0f;
                                f16 = 0.0f;
                                f15 = 1.0f;
                                min = NotificationCenter.didReceiveSmsCode;
                            }
                        }
                        if (i33 != i8) {
                            f12 = 1.0f;
                            f13 = Math.min(1.0f, this.transitionProgress / 0.5f);
                        } else {
                            f12 = 1.0f;
                            f13 = this.transitionProgress;
                        }
                        float f55 = f12 - f13;
                        float centerX3 = bounds.centerX();
                        centerY = bounds.centerY();
                        f14 = centerX3;
                        dp5 = AndroidUtilities.dp(7.0f) * f55 * this.scale;
                        min = (int) (Math.min(f12, f55 * 2.0f) * 255.0f);
                        f15 = f55;
                        f16 = 0.0f;
                    }
                }
                i8 = 6;
                if (i33 != i8) {
                }
                float f552 = f12 - f13;
                float centerX32 = bounds.centerX();
                centerY = bounds.centerY();
                f14 = centerX32;
                dp5 = AndroidUtilities.dp(7.0f) * f552 * this.scale;
                min = (int) (Math.min(f12, f552 * 2.0f) * 255.0f);
                f15 = f552;
                f16 = 0.0f;
            }
            if (f15 != 1.0f) {
                canvas2.save();
                canvas2.scale(f15, f15, f14, centerY);
            }
            if (f16 != 0.0f) {
                canvas2.save();
                canvas2.rotate(f16, i2, i3);
            }
            if (min != 0) {
                float f56 = min;
                this.paint.setAlpha((int) (this.overrideAlpha * f56));
                if (this.currentIcon == 14 || this.nextIcon == 14) {
                    this.paint3.setAlpha((int) (f56 * this.overrideAlpha));
                    this.rect.set(i2 - AndroidUtilities.dp(3.5f), i3 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + i2, AndroidUtilities.dp(3.5f) + i3);
                    canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint3);
                } else {
                    float f57 = i2;
                    float f58 = f57 - dp5;
                    float f59 = i3;
                    float f60 = f59 - dp5;
                    float f61 = f57 + dp5;
                    float f62 = f59 + dp5;
                    canvas2.drawLine(f58, f60, f61, f62, this.paint);
                    canvas2 = canvas;
                    canvas2.drawLine(f61, f60, f58, f62, this.paint);
                }
            }
            if (f16 != 0.0f) {
                canvas2.restore();
            }
            if (f15 != 1.0f) {
                canvas2.restore();
            }
            int i36 = this.currentIcon;
            if ((i36 == 3 || i36 == 14 || (i36 == 4 && ((i9 = this.nextIcon) == 14 || i9 == 3))) && min != 0) {
                float max = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                int dp15 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                this.rect.set(bounds.left + dp15, bounds.top + dp15, bounds.right - dp15, bounds.bottom - dp15);
                int i37 = this.currentIcon;
                if (i37 == 14 || (i37 == 4 && this.nextIcon == 14)) {
                    this.paint.setAlpha((int) (min * 0.15f * this.overrideAlpha));
                    canvas2.drawArc(this.rect, 0.0f, 360.0f, false, this.paint);
                    this.paint.setAlpha(min);
                }
                canvas2 = canvas;
                canvas2.drawArc(this.rect, this.downloadRadOffset, max, false, this.paint);
            }
        } else {
            if (i32 == 10 || this.nextIcon == 10 || i32 == 13) {
                int i38 = this.nextIcon;
                int i39 = (i38 == 4 || i38 == 6) ? (int) ((1.0f - this.transitionProgress) * 255.0f) : NotificationCenter.didReceiveSmsCode;
                if (i39 != 0) {
                    applyShaderMatrix(false);
                    this.paint.setAlpha((int) (i39 * this.overrideAlpha));
                    float max2 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                    int dp16 = AndroidUtilities.dp(this.isMini ? 2.0f : 4.0f);
                    this.rect.set(bounds.left + dp16, bounds.top + dp16, bounds.right - dp16, bounds.bottom - dp16);
                    canvas2 = canvas;
                    canvas2.drawArc(this.rect, this.downloadRadOffset, max2, false, this.paint);
                    i6 = 9;
                    i7 = 7;
                }
            }
            canvas2 = canvas;
            i6 = 9;
            i7 = 7;
        }
        int i40 = this.currentIcon;
        if (i40 == this.nextIcon) {
            f19 = 1.0f;
            f20 = 1.0f;
        } else if (i40 == 4 || i40 == 3 || i40 == 14) {
            float f63 = this.transitionProgress;
            f19 = f63;
            f20 = 1.0f - f63;
        } else {
            float min2 = Math.min(1.0f, this.transitionProgress / 0.5f);
            f20 = Math.max(0.0f, 1.0f - (this.transitionProgress / 0.5f));
            f19 = min2;
        }
        int i41 = this.nextIcon;
        if (i41 == 15) {
            pathArr = Theme.chat_updatePath;
        } else {
            if (this.currentIcon == 15) {
                pathArr2 = Theme.chat_updatePath;
                pathArr = null;
                if (i41 != 5) {
                    pathArr = Theme.chat_filePath;
                } else if (this.currentIcon == 5) {
                    pathArr2 = Theme.chat_filePath;
                }
                if (i41 != i7) {
                    drawable2 = Theme.chat_flameIcon;
                    drawable = null;
                } else {
                    drawable = this.currentIcon == i7 ? Theme.chat_flameIcon : null;
                    drawable2 = null;
                }
                if (i41 != i4) {
                    drawable2 = Theme.chat_gifIcon;
                } else if (this.currentIcon == i4) {
                    drawable = Theme.chat_gifIcon;
                }
                Drawable drawable3 = drawable;
                Drawable drawable4 = drawable2;
                if (this.currentIcon != i6 || i41 == i6) {
                    applyShaderMatrix(false);
                    this.paint.setAlpha(this.currentIcon != this.nextIcon ? NotificationCenter.didReceiveSmsCode : (int) (this.transitionProgress * 255.0f));
                    int dp17 = i3 + AndroidUtilities.dp(7.0f);
                    int dp18 = i2 - AndroidUtilities.dp(3.0f);
                    if (this.currentIcon == this.nextIcon) {
                        canvas2.save();
                        float f64 = this.transitionProgress;
                        pathArr3 = pathArr;
                        canvas2.scale(f64, f64, i2, i3);
                    } else {
                        pathArr3 = pathArr;
                    }
                    float dp19 = dp18 - AndroidUtilities.dp(6.0f);
                    float dp20 = dp17 - AndroidUtilities.dp(6.0f);
                    Path[] pathArr6 = pathArr2;
                    float f65 = dp18;
                    float f66 = dp17;
                    rect = bounds;
                    pathArr4 = pathArr3;
                    pathArr5 = pathArr6;
                    canvas2.drawLine(dp19, dp20, f65, f66, this.paint);
                    canvas2 = canvas;
                    canvas2.drawLine(f65, f66, dp18 + AndroidUtilities.dp(12.0f), dp17 - AndroidUtilities.dp(12.0f), this.paint);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.restore();
                    }
                } else {
                    pathArr5 = pathArr2;
                    rect = bounds;
                    pathArr4 = pathArr;
                }
                if (this.currentIcon != 12 || this.nextIcon == 12) {
                    applyShaderMatrix(false);
                    i11 = this.currentIcon;
                    i12 = this.nextIcon;
                    if (i11 != i12) {
                        f21 = 1.0f;
                    } else if (i12 == 13) {
                        f21 = this.transitionProgress;
                    } else {
                        f21 = 1.0f - this.transitionProgress;
                    }
                    this.paint.setAlpha(i11 != i12 ? NotificationCenter.didReceiveSmsCode : (int) (f21 * 255.0f));
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.save();
                        canvas2.scale(f21, f21, i2, i3);
                    }
                    float dp21 = AndroidUtilities.dp(7.0f) * this.scale;
                    float f67 = i2;
                    float f68 = f67 - dp21;
                    float f69 = i3;
                    float f70 = f69 - dp21;
                    float f71 = f67 + dp21;
                    float f72 = f69 + dp21;
                    canvas2.drawLine(f68, f70, f71, f72, this.paint);
                    canvas2 = canvas;
                    canvas2.drawLine(f71, f70, f68, f72, this.paint);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.restore();
                    }
                }
                if (this.currentIcon != 13 || this.nextIcon == 13) {
                    applyShaderMatrix(false);
                    i13 = this.currentIcon;
                    i14 = this.nextIcon;
                    if (i13 != i14) {
                        f22 = 1.0f;
                    } else if (i14 == 13) {
                        f22 = this.transitionProgress;
                    } else {
                        f22 = 1.0f - this.transitionProgress;
                    }
                    this.textPaint.setAlpha((int) (f22 * 255.0f));
                    int dp22 = i3 + AndroidUtilities.dp(5.0f);
                    int i42 = i2 - (this.percentStringWidth / 2);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.save();
                        canvas2.scale(f22, f22, i2, i3);
                    }
                    i15 = (int) (this.animatedDownloadProgress * 100.0f);
                    if (this.percentString != null || i15 != this.lastPercent) {
                        this.lastPercent = i15;
                        this.percentString = String.format("%d%%", Integer.valueOf(i15));
                        this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(r2));
                    }
                    canvas2.drawText(this.percentString, i42, dp22, this.textPaint);
                    if (this.currentIcon != this.nextIcon) {
                        canvas2.restore();
                    }
                }
                i16 = this.currentIcon;
                if (i16 != 0 || i16 == 1 || (i22 = this.nextIcon) == 0 || i22 == 1) {
                    if ((i16 == 0 || this.nextIcon != 1) && !(i16 == 1 && this.nextIcon == 0)) {
                        i17 = 1;
                    } else if (this.animatingTransition) {
                        if (this.nextIcon == 0) {
                            f23 = 1.0f - this.transitionProgress;
                        } else {
                            f23 = this.transitionProgress;
                        }
                        i17 = 1;
                    } else {
                        i17 = 1;
                    }
                    int i43 = this.nextIcon;
                    if ((i43 == 0 || i43 == i17) && (i16 == 0 || i16 == i17)) {
                        this.paint2.setAlpha(NotificationCenter.didReceiveSmsCode);
                    } else if (i43 == 4) {
                        this.paint2.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                    } else {
                        this.paint2.setAlpha(i16 == i43 ? NotificationCenter.didReceiveSmsCode : (int) (this.transitionProgress * 255.0f));
                    }
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(rect.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - f23)), rect.centerY());
                    float f73 = f23 * 500.0f;
                    int i44 = this.currentIcon;
                    float f74 = i44 == 1 ? 90.0f : 0.0f;
                    if (i44 == 0 && this.nextIcon == 1) {
                        if (f73 < 384.0f) {
                            f28 = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f73 / 384.0f) * 95.0f;
                        } else if (f73 < 484.0f) {
                            f28 = 95.0f - (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f73 - 384.0f) / 100.0f) * 5.0f);
                        }
                        f73 += 100.0f;
                    } else {
                        if (i44 == 1 && this.nextIcon == 0) {
                            if (f73 < 100.0f) {
                                f28 = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f73 / 100.0f) * (-5.0f);
                            } else if (f73 < 484.0f) {
                                f28 = (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f73 - 100.0f) / 384.0f) * 95.0f) - 5.0f;
                            } else {
                                f74 = 90.0f;
                            }
                        }
                        canvas2.rotate(f74);
                        i18 = this.currentIcon;
                        if ((i18 != 0 && i18 != 1) || i18 == 4) {
                            canvas2.scale(f19, f19);
                        }
                        Theme.playPauseAnimator.draw(canvas2, this.paint2, f73);
                        canvas2.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas2, this.paint2, f73);
                        canvas2.restore();
                    }
                    f74 = f28;
                    canvas2.rotate(f74);
                    i18 = this.currentIcon;
                    if (i18 != 0) {
                        canvas2.scale(f19, f19);
                        Theme.playPauseAnimator.draw(canvas2, this.paint2, f73);
                        canvas2.scale(1.0f, -1.0f);
                        Theme.playPauseAnimator.draw(canvas2, this.paint2, f73);
                        canvas2.restore();
                    }
                    canvas2.scale(f19, f19);
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f73);
                    canvas2.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas2, this.paint2, f73);
                    canvas2.restore();
                }
                if (this.currentIcon == 6 || this.nextIcon == 6) {
                    applyShaderMatrix(false);
                    if (this.currentIcon != 6) {
                        float f75 = this.transitionProgress;
                        if (f75 > 0.5f) {
                            float f76 = (f75 - 0.5f) / 0.5f;
                            f24 = 1.0f - Math.min(1.0f, f76 / 0.5f);
                            f27 = f76 > 0.5f ? (f76 - 0.5f) / 0.5f : 0.0f;
                        } else {
                            f27 = 0.0f;
                            f24 = 1.0f;
                        }
                        this.paint.setAlpha(NotificationCenter.didReceiveSmsCode);
                        f25 = f27;
                    } else {
                        if (this.nextIcon != 6) {
                            this.paint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f));
                        } else {
                            this.paint.setAlpha(NotificationCenter.didReceiveSmsCode);
                        }
                        f24 = 0.0f;
                        f25 = 1.0f;
                    }
                    int dp23 = AndroidUtilities.dp(7.0f) + i3;
                    int dp24 = i2 - AndroidUtilities.dp(3.0f);
                    if (f24 < 1.0f) {
                        float f77 = f19;
                        i21 = dp24;
                        f26 = f77;
                        i19 = i;
                        i20 = dp23;
                        canvas.drawLine(dp24 - AndroidUtilities.dp(6.0f), dp23 - AndroidUtilities.dp(6.0f), dp24 - (AndroidUtilities.dp(6.0f) * f24), dp23 - (AndroidUtilities.dp(6.0f) * f24), this.paint);
                    } else {
                        f26 = f19;
                        i19 = i;
                        i20 = dp23;
                        i21 = dp24;
                    }
                    if (f25 > 0.0f) {
                        float f78 = i21;
                        float f79 = i20;
                        canvas2 = canvas;
                        canvas2.drawLine(f78, f79, f78 + (AndroidUtilities.dp(12.0f) * f25), f79 - (AndroidUtilities.dp(12.0f) * f25), this.paint);
                    } else {
                        canvas2 = canvas;
                    }
                } else {
                    f26 = f19;
                    i19 = i;
                }
                if (drawable3 != null && drawable3 != drawable4) {
                    int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * f20);
                    int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * f20);
                    drawable3.setColorFilter(this.colorFilter);
                    drawable3.setAlpha(this.currentIcon == this.nextIcon ? NotificationCenter.didReceiveSmsCode : (int) ((1.0f - this.transitionProgress) * 255.0f));
                    int i45 = intrinsicWidth / 2;
                    int i46 = intrinsicHeight / 2;
                    drawable3.setBounds(i2 - i45, i3 - i46, i45 + i2, i46 + i3);
                    drawable3.draw(canvas2);
                }
                if (drawable4 != null) {
                    int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f26);
                    int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f26);
                    drawable4.setColorFilter(this.colorFilter);
                    drawable4.setAlpha(this.currentIcon == this.nextIcon ? NotificationCenter.didReceiveSmsCode : (int) (this.transitionProgress * 255.0f));
                    int i47 = intrinsicWidth2 / 2;
                    int i48 = intrinsicHeight2 / 2;
                    drawable4.setBounds(i2 - i47, i3 - i48, i47 + i2, i48 + i3);
                    drawable4.draw(canvas2);
                }
                if (pathArr5 != null && pathArr5 != pathArr4) {
                    int dp25 = AndroidUtilities.dp(24.0f);
                    this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                    this.paint2.setAlpha(this.currentIcon == this.nextIcon ? NotificationCenter.didReceiveSmsCode : (int) ((1.0f - this.transitionProgress) * 255.0f));
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(i2, i3);
                    canvas2.scale(f20, f20);
                    float f80 = (-dp25) / 2;
                    canvas2.translate(f80, f80);
                    Path path2 = pathArr5[0];
                    if (path2 != null) {
                        canvas2.drawPath(path2, this.paint2);
                    }
                    Path path3 = pathArr5[1];
                    if (path3 != null) {
                        canvas2.drawPath(path3, this.backPaint);
                    }
                    canvas2.restore();
                }
                if (pathArr4 != null) {
                    int dp26 = AndroidUtilities.dp(24.0f);
                    int i49 = this.currentIcon == this.nextIcon ? NotificationCenter.didReceiveSmsCode : (int) (this.transitionProgress * 255.0f);
                    this.paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                    this.paint2.setAlpha(i49);
                    applyShaderMatrix(true);
                    canvas2.save();
                    canvas2.translate(i2, i3);
                    float f81 = f26;
                    canvas2.scale(f81, f81);
                    float f82 = (-dp26) / 2;
                    canvas2.translate(f82, f82);
                    Path path4 = pathArr4[0];
                    if (path4 != null) {
                        canvas2.drawPath(path4, this.paint2);
                    }
                    if (pathArr4.length >= 3 && (path = pathArr4[2]) != null) {
                        canvas2.drawPath(path, this.paint);
                    }
                    Path path5 = pathArr4[1];
                    if (path5 != null) {
                        if (i49 != 255) {
                            int alpha = this.backPaint.getAlpha();
                            this.backPaint.setAlpha((int) (alpha * (i49 / 255.0f)));
                            canvas2.drawPath(pathArr4[1], this.backPaint);
                            this.backPaint.setAlpha(alpha);
                        } else {
                            canvas2.drawPath(path5, this.backPaint);
                        }
                    }
                    canvas2.restore();
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.lastAnimationTime;
                long j2 = j > 17 ? 17L : j;
                this.lastAnimationTime = currentTimeMillis;
                int i50 = this.currentIcon;
                if (i50 == 3 || i50 == 14 || ((i50 == 4 && this.nextIcon == 14) || i50 == 10 || i50 == 13)) {
                    float f83 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                    this.downloadRadOffset = f83;
                    this.downloadRadOffset = getCircleValue(f83);
                    if (this.nextIcon != 2) {
                        float f84 = this.downloadProgress;
                        float f85 = this.downloadProgressAnimationStart;
                        float f86 = f84 - f85;
                        if (f86 > 0.0f) {
                            float f87 = this.downloadProgressTime + j2;
                            this.downloadProgressTime = f87;
                            if (f87 >= 200.0f) {
                                this.animatedDownloadProgress = f84;
                                this.downloadProgressAnimationStart = f84;
                                this.downloadProgressTime = 0.0f;
                            } else {
                                this.animatedDownloadProgress = f85 + (f86 * this.interpolator.getInterpolation(f87 / 200.0f));
                            }
                        }
                    }
                    invalidateSelf();
                }
                if (this.animatingTransition) {
                    float f88 = this.transitionProgress;
                    if (f88 < 1.0f) {
                        float f89 = f88 + (j2 / this.transitionAnimationTime);
                        this.transitionProgress = f89;
                        if (f89 >= 1.0f) {
                            this.currentIcon = this.nextIcon;
                            this.transitionProgress = 1.0f;
                            this.animatingTransition = false;
                        }
                        invalidateSelf();
                    }
                }
                int i51 = i19;
                if (i51 >= 1) {
                    canvas2.restoreToCount(i51);
                    return;
                }
                return;
            }
            pathArr = null;
        }
        pathArr2 = null;
        if (i41 != 5) {
        }
        if (i41 != i7) {
        }
        if (i41 != i4) {
        }
        Drawable drawable32 = drawable;
        Drawable drawable42 = drawable2;
        if (this.currentIcon != i6) {
        }
        applyShaderMatrix(false);
        this.paint.setAlpha(this.currentIcon != this.nextIcon ? NotificationCenter.didReceiveSmsCode : (int) (this.transitionProgress * 255.0f));
        int dp172 = i3 + AndroidUtilities.dp(7.0f);
        int dp182 = i2 - AndroidUtilities.dp(3.0f);
        if (this.currentIcon == this.nextIcon) {
        }
        float dp192 = dp182 - AndroidUtilities.dp(6.0f);
        float dp202 = dp172 - AndroidUtilities.dp(6.0f);
        Path[] pathArr62 = pathArr2;
        float f652 = dp182;
        float f662 = dp172;
        rect = bounds;
        pathArr4 = pathArr3;
        pathArr5 = pathArr62;
        canvas2.drawLine(dp192, dp202, f652, f662, this.paint);
        canvas2 = canvas;
        canvas2.drawLine(f652, f662, dp182 + AndroidUtilities.dp(12.0f), dp172 - AndroidUtilities.dp(12.0f), this.paint);
        if (this.currentIcon != this.nextIcon) {
        }
        if (this.currentIcon != 12) {
        }
        applyShaderMatrix(false);
        i11 = this.currentIcon;
        i12 = this.nextIcon;
        if (i11 != i12) {
        }
        this.paint.setAlpha(i11 != i12 ? NotificationCenter.didReceiveSmsCode : (int) (f21 * 255.0f));
        AndroidUtilities.dp(7.0f);
        AndroidUtilities.dp(3.0f);
        if (this.currentIcon != this.nextIcon) {
        }
        float dp212 = AndroidUtilities.dp(7.0f) * this.scale;
        float f672 = i2;
        float f682 = f672 - dp212;
        float f692 = i3;
        float f702 = f692 - dp212;
        float f712 = f672 + dp212;
        float f722 = f692 + dp212;
        canvas2.drawLine(f682, f702, f712, f722, this.paint);
        canvas2 = canvas;
        canvas2.drawLine(f712, f702, f682, f722, this.paint);
        if (this.currentIcon != this.nextIcon) {
        }
        if (this.currentIcon != 13) {
        }
        applyShaderMatrix(false);
        i13 = this.currentIcon;
        i14 = this.nextIcon;
        if (i13 != i14) {
        }
        this.textPaint.setAlpha((int) (f22 * 255.0f));
        int dp222 = i3 + AndroidUtilities.dp(5.0f);
        int i422 = i2 - (this.percentStringWidth / 2);
        if (this.currentIcon != this.nextIcon) {
        }
        i15 = (int) (this.animatedDownloadProgress * 100.0f);
        if (this.percentString != null) {
        }
        this.lastPercent = i15;
        this.percentString = String.format("%d%%", Integer.valueOf(i15));
        this.percentStringWidth = (int) Math.ceil(this.textPaint.measureText(r2));
        canvas2.drawText(this.percentString, i422, dp222, this.textPaint);
        if (this.currentIcon != this.nextIcon) {
        }
        i16 = this.currentIcon;
        if (i16 != 0) {
        }
        if (i16 == 0) {
        }
        i17 = 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }
}
