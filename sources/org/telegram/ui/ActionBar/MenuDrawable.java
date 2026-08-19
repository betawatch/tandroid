package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.MediaActionDrawable;

/* loaded from: classes4.dex */
public class MenuDrawable extends Drawable {
    public static int TYPE_DEFAULT = 0;
    public static int TYPE_UDPATE_AVAILABLE = 1;
    public static int TYPE_UDPATE_DOWNLOADING = 2;
    private int alpha;
    private float animatedDownloadProgress;
    private int backColor;
    private final Paint backPaint;
    private int currentAnimationTime;
    private float currentRotation;
    private float downloadProgress;
    private float downloadProgressAnimationStart;
    private float downloadProgressTime;
    private float downloadRadOffset;
    private float finalRotation;
    private int iconColor;
    private DecelerateInterpolator interpolator;
    private long lastFrameTime;
    private boolean miniIcon;
    private final Paint paint;
    private int previousType;
    private RectF rect;
    private boolean reverseAngle;
    private boolean rotateToBack;
    private boolean roundCap;
    private int type;
    private float typeAnimationProgress;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public MenuDrawable() {
        this(TYPE_DEFAULT);
    }

    public MenuDrawable(int i) {
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.backPaint = paint2;
        this.rotateToBack = true;
        this.interpolator = new DecelerateInterpolator();
        this.rect = new RectF();
        this.alpha = NotificationCenter.didReceiveSmsCode;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.previousType = TYPE_DEFAULT;
        this.type = i;
        this.typeAnimationProgress = 1.0f;
    }

    public void setRotateToBack(boolean z) {
        this.rotateToBack = z;
    }

    public void setRotation(float f, boolean z) {
        this.lastFrameTime = 0L;
        float f2 = this.currentRotation;
        if (f2 == 1.0f) {
            this.reverseAngle = true;
        } else if (f2 == 0.0f) {
            this.reverseAngle = false;
        }
        this.lastFrameTime = 0L;
        if (z) {
            if (f2 < f) {
                this.currentAnimationTime = (int) (f2 * 200.0f);
            } else {
                this.currentAnimationTime = (int) ((1.0f - f2) * 200.0f);
            }
            this.lastFrameTime = SystemClock.elapsedRealtime();
            this.finalRotation = f;
        } else {
            this.currentRotation = f;
            this.finalRotation = f;
        }
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        float dp;
        float dp2;
        float f;
        float f2;
        float f3;
        float dp3;
        float dp4;
        float dp5;
        float abs;
        Canvas canvas2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f4;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.lastFrameTime;
        long j2 = elapsedRealtime - j;
        float f5 = this.currentRotation;
        float f6 = this.finalRotation;
        if (f5 != f6) {
            if (j != 0) {
                int i7 = (int) (this.currentAnimationTime + j2);
                this.currentAnimationTime = i7;
                if (i7 >= 200) {
                    this.currentRotation = f6;
                } else if (f5 < f6) {
                    this.currentRotation = this.interpolator.getInterpolation(i7 / 200.0f) * this.finalRotation;
                } else {
                    this.currentRotation = 1.0f - this.interpolator.getInterpolation(i7 / 200.0f);
                }
            }
            invalidateSelf();
        }
        float f7 = this.typeAnimationProgress;
        if (f7 < 1.0f) {
            float f8 = f7 + (j2 / 200.0f);
            this.typeAnimationProgress = f8;
            if (f8 > 1.0f) {
                this.typeAnimationProgress = 1.0f;
            }
            invalidateSelf();
        }
        this.lastFrameTime = elapsedRealtime;
        canvas.save();
        canvas.translate(((getIntrinsicWidth() / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.currentRotation), getIntrinsicHeight() / 2);
        int i8 = this.iconColor;
        if (i8 == 0) {
            i8 = Theme.getColor(Theme.key_actionBarDefaultIcon);
        }
        int i9 = this.backColor;
        if (i9 == 0) {
            i9 = Theme.getColor(Theme.key_actionBarDefault);
        }
        int i10 = i9;
        int i11 = this.type;
        int i12 = TYPE_DEFAULT;
        if (i11 == i12) {
            if (this.previousType != i12) {
                dp = AndroidUtilities.dp(9.0f) * (1.0f - this.typeAnimationProgress);
                dp2 = AndroidUtilities.dp(7.0f);
                f = this.typeAnimationProgress;
            } else {
                f3 = 0.0f;
                f2 = 0.0f;
                if (!this.rotateToBack) {
                    canvas.rotate(this.currentRotation * (this.reverseAngle ? -180 : NotificationCenter.needDeleteDialog), AndroidUtilities.dp(9.0f), 0.0f);
                    this.paint.setColor(i8);
                    this.paint.setAlpha(this.alpha);
                    canvas.drawLine(this.roundCap ? (AndroidUtilities.dp(0.5f) * this.currentRotation) + ((this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation)) : 0.0f, 0.0f, ((AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.currentRotation)) - f3) - (this.roundCap ? (this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation) : 0.0f), 0.0f, this.paint);
                    dp3 = (AndroidUtilities.dp(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dp(0.5f) * Math.abs(this.currentRotation));
                    dp4 = AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(2.5f) * Math.abs(this.currentRotation));
                    dp5 = AndroidUtilities.dp(5.0f) + (AndroidUtilities.dp(2.0f) * Math.abs(this.currentRotation));
                    abs = AndroidUtilities.dp(7.5f) * Math.abs(this.currentRotation);
                    if (this.roundCap) {
                        abs += (this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation);
                        float dp6 = dp3 + (AndroidUtilities.dp(0.5f) * this.currentRotation);
                        dp4 -= (AndroidUtilities.dp(0.5f) * this.currentRotation) + ((this.paint.getStrokeWidth() / 2.0f) * (1.0f - this.currentRotation));
                        dp5 -= AndroidUtilities.dp(0.25f) * this.currentRotation;
                        dp3 = dp6 + (AndroidUtilities.dp(0.25f) * this.currentRotation);
                    }
                } else {
                    canvas.rotate(this.currentRotation * (this.reverseAngle ? -225 : NotificationCenter.httpFileDidLoad), AndroidUtilities.dp(9.0f), 0.0f);
                    if (this.miniIcon) {
                        this.paint.setColor(i8);
                        this.paint.setAlpha(this.alpha);
                        canvas.drawLine((AndroidUtilities.dpf2(2.0f) * (1.0f - Math.abs(this.currentRotation))) + (AndroidUtilities.dp(1.0f) * this.currentRotation), 0.0f, ((AndroidUtilities.dpf2(16.0f) * (1.0f - this.currentRotation)) + (AndroidUtilities.dp(17.0f) * this.currentRotation)) - f3, 0.0f, this.paint);
                        dp3 = (AndroidUtilities.dpf2(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dpf2(0.5f) * Math.abs(this.currentRotation));
                        dp4 = (AndroidUtilities.dpf2(9.0f) * Math.abs(this.currentRotation)) + (AndroidUtilities.dpf2(16.0f) * (1.0f - Math.abs(this.currentRotation)));
                        dp5 = (AndroidUtilities.dpf2(3.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dpf2(5.0f);
                        abs = (AndroidUtilities.dpf2(7.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dpf2(2.0f);
                    } else {
                        int color = Theme.getColor(Theme.key_actionBarActionModeDefaultIcon);
                        i10 = AndroidUtilities.getOffsetColor(i10, Theme.getColor(Theme.key_actionBarActionModeDefault), this.currentRotation, 1.0f);
                        this.paint.setColor(AndroidUtilities.getOffsetColor(i8, color, this.currentRotation, 1.0f));
                        this.paint.setAlpha(this.alpha);
                        canvas.drawLine(this.currentRotation * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.currentRotation)) - f3, 0.0f, this.paint);
                        dp3 = (AndroidUtilities.dp(5.0f) * (1.0f - Math.abs(this.currentRotation))) - (AndroidUtilities.dp(0.5f) * Math.abs(this.currentRotation));
                        dp4 = AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(9.0f) * Math.abs(this.currentRotation));
                        dp5 = (AndroidUtilities.dp(3.0f) * Math.abs(this.currentRotation)) + AndroidUtilities.dp(5.0f);
                        abs = Math.abs(this.currentRotation) * AndroidUtilities.dp(9.0f);
                    }
                }
                float f9 = dp3;
                float f10 = abs;
                int i13 = i10;
                float f11 = dp5;
                float f12 = dp4;
                if (!this.miniIcon) {
                    canvas2 = canvas;
                    canvas2.drawLine(f10, -f11, f12, -f9, this.paint);
                    canvas2.drawLine(f10, f11, f12, f9, this.paint);
                } else {
                    canvas2 = canvas;
                    canvas2.drawLine(f10, -f11, f12 - f2, -f9, this.paint);
                    canvas2.drawLine(f10, f11, f12, f9, this.paint);
                }
                i = this.type;
                i2 = TYPE_DEFAULT;
                if ((i != i2 && this.currentRotation != 1.0f) || (this.previousType != i2 && this.typeAnimationProgress != 1.0f)) {
                    float dp7 = AndroidUtilities.dp(17.0f);
                    float f13 = -AndroidUtilities.dp(4.5f);
                    float f14 = AndroidUtilities.density * 5.5f;
                    float f15 = 1.0f - this.currentRotation;
                    canvas2.scale(f15, f15, dp7, f13);
                    if (this.type == TYPE_DEFAULT) {
                        f14 *= 1.0f - this.typeAnimationProgress;
                    }
                    this.backPaint.setColor(i13);
                    this.backPaint.setAlpha(this.alpha);
                    canvas2.drawCircle(dp7, f13, f14, this.paint);
                    i3 = this.type;
                    i4 = TYPE_UDPATE_AVAILABLE;
                    if (i3 != i4 || this.previousType == i4) {
                        this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
                        if (this.previousType == TYPE_UDPATE_AVAILABLE) {
                            this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                        } else {
                            this.backPaint.setAlpha(this.alpha);
                        }
                        canvas2.drawLine(dp7, f13 - AndroidUtilities.dp(2.0f), dp7, f13, this.backPaint);
                        canvas2.drawPoint(dp7, AndroidUtilities.dp(2.5f) + f13, this.backPaint);
                    }
                    i5 = this.type;
                    i6 = TYPE_UDPATE_DOWNLOADING;
                    if (i5 != i6 || this.previousType == i6) {
                        this.backPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        if (this.previousType == TYPE_UDPATE_DOWNLOADING) {
                            this.backPaint.setAlpha((int) (this.alpha * (1.0f - this.typeAnimationProgress)));
                        } else {
                            this.backPaint.setAlpha(this.alpha);
                        }
                        float max = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
                        this.rect.set(dp7 - AndroidUtilities.dp(3.0f), f13 - AndroidUtilities.dp(3.0f), dp7 + AndroidUtilities.dp(3.0f), f13 + AndroidUtilities.dp(3.0f));
                        canvas2.drawArc(this.rect, this.downloadRadOffset, max, false, this.backPaint);
                        float f16 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
                        this.downloadRadOffset = f16;
                        this.downloadRadOffset = MediaActionDrawable.getCircleValue(f16);
                        float f17 = this.downloadProgress;
                        float f18 = this.downloadProgressAnimationStart;
                        f4 = f17 - f18;
                        if (f4 > 0.0f) {
                            float f19 = this.downloadProgressTime + j2;
                            this.downloadProgressTime = f19;
                            if (f19 >= 200.0f) {
                                this.animatedDownloadProgress = f17;
                                this.downloadProgressAnimationStart = f17;
                                this.downloadProgressTime = 0.0f;
                            } else {
                                this.animatedDownloadProgress = f18 + (f4 * this.interpolator.getInterpolation(f19 / 200.0f));
                            }
                        }
                        invalidateSelf();
                    }
                }
                canvas.restore();
            }
        } else if (this.previousType == i12) {
            dp = AndroidUtilities.dp(9.0f) * this.typeAnimationProgress * (1.0f - this.currentRotation);
            dp2 = AndroidUtilities.dp(7.0f) * this.typeAnimationProgress;
            f = this.currentRotation;
        } else {
            dp = AndroidUtilities.dp(9.0f) * (1.0f - this.currentRotation);
            dp2 = AndroidUtilities.dp(7.0f);
            f = this.currentRotation;
        }
        f3 = dp2 * (1.0f - f);
        f2 = dp;
        if (!this.rotateToBack) {
        }
        float f92 = dp3;
        float f102 = abs;
        int i132 = i10;
        float f112 = dp5;
        float f122 = dp4;
        if (!this.miniIcon) {
        }
        i = this.type;
        i2 = TYPE_DEFAULT;
        if (i != i2) {
            float dp72 = AndroidUtilities.dp(17.0f);
            float f132 = -AndroidUtilities.dp(4.5f);
            float f142 = AndroidUtilities.density * 5.5f;
            float f152 = 1.0f - this.currentRotation;
            canvas2.scale(f152, f152, dp72, f132);
            if (this.type == TYPE_DEFAULT) {
            }
            this.backPaint.setColor(i132);
            this.backPaint.setAlpha(this.alpha);
            canvas2.drawCircle(dp72, f132, f142, this.paint);
            i3 = this.type;
            i4 = TYPE_UDPATE_AVAILABLE;
            if (i3 != i4) {
            }
            this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
            if (this.previousType == TYPE_UDPATE_AVAILABLE) {
            }
            canvas2.drawLine(dp72, f132 - AndroidUtilities.dp(2.0f), dp72, f132, this.backPaint);
            canvas2.drawPoint(dp72, AndroidUtilities.dp(2.5f) + f132, this.backPaint);
            i5 = this.type;
            i6 = TYPE_UDPATE_DOWNLOADING;
            if (i5 != i6) {
            }
            this.backPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            if (this.previousType == TYPE_UDPATE_DOWNLOADING) {
            }
            float max2 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
            this.rect.set(dp72 - AndroidUtilities.dp(3.0f), f132 - AndroidUtilities.dp(3.0f), dp72 + AndroidUtilities.dp(3.0f), f132 + AndroidUtilities.dp(3.0f));
            canvas2.drawArc(this.rect, this.downloadRadOffset, max2, false, this.backPaint);
            float f162 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
            this.downloadRadOffset = f162;
            this.downloadRadOffset = MediaActionDrawable.getCircleValue(f162);
            float f172 = this.downloadProgress;
            float f182 = this.downloadProgressAnimationStart;
            f4 = f172 - f182;
            if (f4 > 0.0f) {
            }
            invalidateSelf();
            canvas.restore();
        }
        float dp722 = AndroidUtilities.dp(17.0f);
        float f1322 = -AndroidUtilities.dp(4.5f);
        float f1422 = AndroidUtilities.density * 5.5f;
        float f1522 = 1.0f - this.currentRotation;
        canvas2.scale(f1522, f1522, dp722, f1322);
        if (this.type == TYPE_DEFAULT) {
        }
        this.backPaint.setColor(i132);
        this.backPaint.setAlpha(this.alpha);
        canvas2.drawCircle(dp722, f1322, f1422, this.paint);
        i3 = this.type;
        i4 = TYPE_UDPATE_AVAILABLE;
        if (i3 != i4) {
        }
        this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
        if (this.previousType == TYPE_UDPATE_AVAILABLE) {
        }
        canvas2.drawLine(dp722, f1322 - AndroidUtilities.dp(2.0f), dp722, f1322, this.backPaint);
        canvas2.drawPoint(dp722, AndroidUtilities.dp(2.5f) + f1322, this.backPaint);
        i5 = this.type;
        i6 = TYPE_UDPATE_DOWNLOADING;
        if (i5 != i6) {
        }
        this.backPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        if (this.previousType == TYPE_UDPATE_DOWNLOADING) {
        }
        float max22 = Math.max(4.0f, this.animatedDownloadProgress * 360.0f);
        this.rect.set(dp722 - AndroidUtilities.dp(3.0f), f1322 - AndroidUtilities.dp(3.0f), dp722 + AndroidUtilities.dp(3.0f), f1322 + AndroidUtilities.dp(3.0f));
        canvas2.drawArc(this.rect, this.downloadRadOffset, max22, false, this.backPaint);
        float f1622 = this.downloadRadOffset + ((360 * j2) / 2500.0f);
        this.downloadRadOffset = f1622;
        this.downloadRadOffset = MediaActionDrawable.getCircleValue(f1622);
        float f1722 = this.downloadProgress;
        float f1822 = this.downloadProgressAnimationStart;
        f4 = f1722 - f1822;
        if (f4 > 0.0f) {
        }
        invalidateSelf();
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            this.paint.setAlpha(i);
            this.backPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    public void setIconColor(int i) {
        this.iconColor = i;
    }

    public void setBackColor(int i) {
        this.backColor = i;
    }

    public void setRoundCap() {
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.roundCap = true;
    }

    public void setMiniIcon(boolean z) {
        this.miniIcon = z;
    }
}
