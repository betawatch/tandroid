package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes5.dex */
public class CheckBoxBase {
    private static Paint forbidPaint;
    private static Paint paint;
    public long animationDuration;
    private boolean attachedToWindow;
    private int background2ColorKey;
    private int backgroundColor;
    private int backgroundColorKey;
    private Paint backgroundPaint;
    private int backgroundType;
    private ObjectAnimator checkAnimator;
    private Paint checkPaint;
    private String checkedText;
    private GenericProvider circlePaintProvider;
    private float customRadius;
    private float customRadiusFactor;
    private boolean cutCheck;
    private boolean drawUnchecked;
    private boolean forbidden;
    private boolean isChecked;
    private Theme.MessageDrawable messageDrawable;
    private View parentView;
    private float progress;
    private ProgressDelegate progressDelegate;
    private Theme.ResourcesProvider resourcesProvider;
    private float size;
    private int strokeBackgroundKey;
    private int strokeBackgroundWidth;
    private TextPaint textPaint;
    private boolean useDefaultCheck;
    public android.graphics.Rect bounds = new android.graphics.Rect();
    private RectF rect = new RectF();
    public float checkScale = 1.0f;
    private float alpha = 1.0f;
    private Path path = new Path();
    private boolean enabled = true;
    private float backgroundAlpha = 1.0f;
    private int checkColorKey = Theme.key_checkboxCheck;

    public interface ProgressDelegate {
        void setProgress(float f);
    }

    public void setAlpha(float f) {
        this.alpha = f;
        invalidate();
    }

    public void setCuttingCheck(boolean z) {
        if (this.cutCheck == z) {
            return;
        }
        this.cutCheck = z;
        this.checkPaint.setXfermode(z ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Paint lambda$new$0(Void r0) {
        return paint;
    }

    public CheckBoxBase(View view, int i, Theme.ResourcesProvider resourcesProvider) {
        int i2 = Theme.key_chat_serviceBackground;
        this.backgroundColorKey = i2;
        this.background2ColorKey = i2;
        this.strokeBackgroundKey = Theme.key_dialogBackground;
        this.strokeBackgroundWidth = -1;
        this.customRadius = 0.0f;
        this.customRadiusFactor = 1.0f;
        this.drawUnchecked = true;
        this.circlePaintProvider = new GenericProvider() { // from class: org.telegram.ui.Components.CheckBoxBase$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.GenericProvider
            public final Object provide(Object obj) {
                Paint lambda$new$0;
                lambda$new$0 = CheckBoxBase.lambda$new$0((Void) obj);
                return lambda$new$0;
            }
        };
        this.animationDuration = 200L;
        this.resourcesProvider = resourcesProvider;
        this.parentView = view;
        this.size = i;
        if (paint == null) {
            paint = new Paint(1);
        }
        Paint paint2 = new Paint(1);
        this.checkPaint = paint2;
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = this.checkPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        this.checkPaint.setStrokeJoin(Paint.Join.ROUND);
        this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.9f));
        Paint paint4 = new Paint(1);
        this.backgroundPaint = paint4;
        paint4.setStyle(style);
        this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public void setSize(float f) {
        this.size = f;
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public void onAttachedToWindow() {
        this.attachedToWindow = true;
    }

    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        android.graphics.Rect rect = this.bounds;
        rect.left = i;
        rect.top = i2;
        rect.right = i + i3;
        rect.bottom = i2 + i4;
    }

    public void setCustomRadius(float f) {
        this.customRadius = f;
    }

    public void setCustomRadiusFactor(float f) {
        this.customRadiusFactor = f;
    }

    public void setDrawUnchecked(boolean z) {
        this.drawUnchecked = z;
    }

    public boolean getDrawUnchecked() {
        return this.drawUnchecked;
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
        ProgressDelegate progressDelegate = this.progressDelegate;
        if (progressDelegate != null) {
            progressDelegate.setProgress(f);
        }
    }

    public void setForbidden(boolean z) {
        if (this.forbidden == z) {
            return;
        }
        this.forbidden = z;
        invalidate();
    }

    private void invalidate() {
        if (this.parentView.getParent() != null) {
            ((View) this.parentView.getParent()).invalidate();
        }
        this.parentView.invalidate();
    }

    public void setProgressDelegate(ProgressDelegate progressDelegate) {
        this.progressDelegate = progressDelegate;
    }

    public float getProgress() {
        return this.progress;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setBackgroundType(int i) {
        this.backgroundType = i;
        if (i == 12 || i == 13) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
            return;
        }
        if (i == 4 || i == 5) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.9f));
            if (i == 5) {
                this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                return;
            }
            return;
        }
        if (i == 3) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        } else if (i != 0) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }
    }

    public void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.checkAnimator = null;
        }
    }

    private void animateToCheckedState(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = ofFloat;
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.CheckBoxBase.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(CheckBoxBase.this.checkAnimator)) {
                    CheckBoxBase.this.checkAnimator = null;
                }
                if (CheckBoxBase.this.isChecked) {
                    return;
                }
                CheckBoxBase.this.checkedText = null;
            }
        });
        this.checkAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.checkAnimator.setDuration(this.animationDuration);
        this.checkAnimator.start();
    }

    public void setColor(int i, int i2, int i3) {
        this.backgroundColorKey = i;
        this.background2ColorKey = i2;
        this.checkColorKey = i3;
        invalidate();
    }

    public void setStrokeBackgroundColor(int i) {
        this.strokeBackgroundKey = i;
        invalidate();
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
        invalidate();
    }

    public void setBackgroundDrawable(Theme.MessageDrawable messageDrawable) {
        this.messageDrawable = messageDrawable;
    }

    public void setUseDefaultCheck(boolean z) {
        this.useDefaultCheck = z;
    }

    public void setBackgroundAlpha(float f) {
        this.backgroundAlpha = f;
    }

    public void setNum(int i) {
        if (i >= 0) {
            this.checkedText = "" + (i + 1);
        } else if (this.checkAnimator == null) {
            this.checkedText = null;
        }
        invalidate();
    }

    public void setChecked(boolean z, boolean z2) {
        setChecked(-1, z, z2);
    }

    public void setChecked(int i, boolean z, boolean z2) {
        if (i >= 0) {
            this.checkedText = "" + (i + 1);
            invalidate();
        }
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (this.attachedToWindow && z2) {
            animateToCheckedState(z);
        } else {
            cancelCheckAnimator();
            setProgress(z ? 1.0f : 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        float f4;
        float f5;
        int i3;
        int i4;
        float f6;
        int i5;
        int i6;
        int i7;
        int i8;
        float f7;
        float f8;
        float f9;
        float f10;
        boolean z;
        int i9;
        float f11;
        float f12;
        int i10;
        Theme.MessageDrawable messageDrawable;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float dp = AndroidUtilities.dp(this.size / 2.0f);
        int i16 = this.backgroundType;
        if (i16 == 12 || i16 == 13) {
            dp = AndroidUtilities.dp(10.0f);
        } else if (i16 != 0 && i16 != 11) {
            f = dp;
            f2 = dp - AndroidUtilities.dp(0.2f);
            float f13 = !this.forbidden ? 1.0f : this.progress;
            f3 = f13 < 0.5f ? 1.0f : f13 / 0.5f;
            int centerX = this.bounds.centerX();
            int centerY = this.bounds.centerY();
            if (this.cutCheck) {
                i = centerY;
                i2 = centerX;
                f4 = f13;
                f5 = f;
                i3 = 12;
                i4 = 13;
                f6 = 1.0f;
            } else {
                float f14 = centerX;
                float f15 = centerY;
                i = centerY;
                i2 = centerX;
                f4 = f13;
                f6 = 1.0f;
                f5 = f;
                i3 = 12;
                i4 = 13;
                canvas.saveLayerAlpha(f14 - f, f15 - f, f14 + f, f15 + f, NotificationCenter.invalidateMotionBackground, 31);
            }
            i5 = this.backgroundColorKey;
            if (i5 < 0) {
                if (this.drawUnchecked) {
                    int i17 = this.backgroundType;
                    if (i17 == i3 || i17 == i4) {
                        paint.setColor(getThemedColor(i5));
                        paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i17 == 6 || i17 == 7) {
                        paint.setColor(getThemedColor(this.background2ColorKey));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i17 == 10 || i17 == 14) {
                        this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                    } else {
                        paint.setColor((16777215 & Theme.getServiceMessageColor()) | 671088640);
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    }
                } else {
                    Paint paint2 = this.backgroundPaint;
                    int i18 = this.background2ColorKey;
                    if (i18 < 0) {
                        i18 = this.checkColorKey;
                    }
                    paint2.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i18), f4, this.backgroundAlpha));
                }
            } else if (this.drawUnchecked) {
                paint.setColor(Color.argb((int) (this.backgroundAlpha * 25.0f), 0, 0, 0));
                if (this.backgroundType == 8) {
                    this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                } else {
                    this.backgroundPaint.setColor(AndroidUtilities.getOffsetColor(-1, getThemedColor(this.checkColorKey), f4, this.backgroundAlpha));
                }
            } else if (this.backgroundColor != 0) {
                this.backgroundPaint.setColor(0);
            } else {
                Paint paint3 = this.backgroundPaint;
                int i19 = this.background2ColorKey;
                if (i19 < 0) {
                    i19 = this.checkColorKey;
                }
                paint3.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i19), f4, this.backgroundAlpha));
            }
            if (this.drawUnchecked && (i15 = this.backgroundType) >= 0 && i15 != i3 && i15 != i4) {
                if (i15 != 8 || i15 == 10 || i15 == 14) {
                    if (this.customRadius <= 0.0f) {
                        float dp2 = f5 - AndroidUtilities.dp(1.5f);
                        float lerp = AndroidUtilities.lerp(dp2, this.customRadius, this.customRadiusFactor);
                        float f16 = i2;
                        float f17 = i;
                        i7 = 7;
                        i6 = -1;
                        canvas.drawRoundRect(f16 - dp2, f17 - dp2, f16 + dp2, f17 + dp2, lerp, lerp, this.backgroundPaint);
                    } else {
                        i6 = -1;
                        i7 = 7;
                        canvas.drawCircle(i2, i, f5 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                    }
                    paint.setColor(getThemedColor(this.checkColorKey));
                    i8 = this.backgroundType;
                    if (i8 != i6 && i8 != i7 && i8 != 8 && i8 != 9 && i8 != 10 && i8 != 14) {
                        if (i8 != 12 || i8 == 13) {
                            this.backgroundPaint.setStyle(Paint.Style.FILL);
                            messageDrawable = this.messageDrawable;
                            if (messageDrawable == null && messageDrawable.hasGradient()) {
                                Shader gradientShader = this.messageDrawable.getGradientShader();
                                Matrix matrix = this.messageDrawable.getMatrix();
                                matrix.reset();
                                this.messageDrawable.applyMatrixScale();
                                f7 = 0.0f;
                                matrix.postTranslate(0.0f, (-this.messageDrawable.getTopY()) + this.bounds.top);
                                gradientShader.setLocalMatrix(matrix);
                                this.backgroundPaint.setShader(gradientShader);
                            } else {
                                f7 = 0.0f;
                                this.backgroundPaint.setShader(null);
                            }
                            canvas.drawCircle(i2, i, (f5 - AndroidUtilities.dp(f6)) * this.backgroundAlpha, this.backgroundPaint);
                            this.backgroundPaint.setStyle(Paint.Style.STROKE);
                            if (f3 > f7) {
                                float f18 = f4 < 0.5f ? 0.0f : (f4 - 0.5f) / 0.5f;
                                int i20 = this.backgroundType;
                                if (i20 == 9) {
                                    paint.setColor(getThemedColor(this.background2ColorKey));
                                } else if (i20 == 11 || i20 == 6 || i20 == 7 || i20 == 10 || ((!this.drawUnchecked && this.backgroundColorKey >= 0) || i20 == 14)) {
                                    paint.setColor(getThemedColor(this.backgroundColorKey));
                                } else {
                                    int i21 = this.backgroundColor;
                                    if (i21 != 0) {
                                        paint.setColor(i21);
                                    } else {
                                        paint.setColor(getThemedColor(this.enabled ? Theme.key_checkbox : Theme.key_checkboxDisabled));
                                    }
                                }
                                if (this.forbidden) {
                                    paint.setColor(this.backgroundPaint.getColor());
                                    f8 = 1.0f;
                                } else {
                                    f8 = 1.0f;
                                    if (this.alpha < 1.0f) {
                                        paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                                    }
                                }
                                if (!this.useDefaultCheck && (i10 = this.checkColorKey) >= 0) {
                                    this.checkPaint.setColor(getThemedColor(i10));
                                } else {
                                    this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                                }
                                if (this.alpha < f8 && Theme.isCurrentThemeDark()) {
                                    this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                                }
                                if (this.backgroundType != -1) {
                                    float dp3 = AndroidUtilities.dp(this.size) / 2.0f;
                                    int save = canvas.save();
                                    canvas.translate(i2 - dp3, i - dp3);
                                    canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), NotificationCenter.invalidateMotionBackground, 31);
                                    Paint paint4 = (Paint) this.circlePaintProvider.provide(null);
                                    int i22 = this.backgroundType;
                                    if (i22 == 12 || i22 == 13) {
                                        int alpha = paint4.getAlpha();
                                        paint4.setAlpha((int) (f3 * 255.0f));
                                        canvas.drawCircle(dp3, dp3, f5 * f3, paint4);
                                        if (paint4 != paint) {
                                            paint4.setAlpha(alpha);
                                        }
                                    } else if (this.customRadius > f7) {
                                        float dp4 = f5 - AndroidUtilities.dp(0.5f);
                                        float lerp2 = AndroidUtilities.lerp(dp4, this.customRadius, this.customRadiusFactor);
                                        float f19 = dp3 - dp4;
                                        float f20 = dp3 + dp4;
                                        canvas.drawRoundRect(f19, f19, f20, f20, lerp2, lerp2, paint4);
                                        float f21 = dp4 * (1.0f - f3);
                                        float lerp3 = AndroidUtilities.lerp(f21, this.customRadius, this.customRadiusFactor);
                                        float f22 = dp3 - f21;
                                        float f23 = dp3 + f21;
                                        canvas.drawRoundRect(f22, f22, f23, f23, lerp3, lerp3, Theme.PAINT_CLEAR);
                                    } else {
                                        float dp5 = f5 - AndroidUtilities.dp(0.5f);
                                        canvas.drawCircle(dp3, dp3, dp5, paint4);
                                        canvas.drawCircle(dp3, dp3, dp5 * (1.0f - f3), Theme.PAINT_CLEAR);
                                    }
                                    canvas.restoreToCount(save);
                                }
                                if (this.forbidden) {
                                    if (forbidPaint == null) {
                                        Paint paint5 = new Paint(1);
                                        forbidPaint = paint5;
                                        paint5.setStyle(Paint.Style.STROKE);
                                        forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                                        forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                                        forbidPaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, f7));
                                    }
                                    forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                                    forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                                    canvas.drawCircle(i2, i, AndroidUtilities.dp(9.0f), forbidPaint);
                                } else if (f18 != f7) {
                                    if (this.checkedText != null) {
                                        if (this.textPaint == null) {
                                            i9 = 1;
                                            TextPaint textPaint = new TextPaint(1);
                                            this.textPaint = textPaint;
                                            textPaint.setTypeface(AndroidUtilities.bold());
                                        } else {
                                            i9 = 1;
                                        }
                                        int length = this.checkedText.length();
                                        if (length == 0 || length == i9 || length == 2) {
                                            f11 = 14.0f;
                                            f12 = 18.0f;
                                        } else if (length != 3) {
                                            f11 = 8.0f;
                                            f12 = 15.75f;
                                        } else {
                                            f12 = 16.5f;
                                            f11 = 10.0f;
                                        }
                                        this.textPaint.setTextSize(AndroidUtilities.dp(f11));
                                        this.textPaint.setColor(getThemedColor(this.checkColorKey));
                                        canvas.save();
                                        float f24 = i2;
                                        canvas.scale(f18, 1.0f, f24, i);
                                        String str = this.checkedText;
                                        canvas.drawText(str, f24 - (this.textPaint.measureText(str) / 2.0f), AndroidUtilities.dp(f12), this.textPaint);
                                        canvas.restore();
                                    } else {
                                        this.path.reset();
                                        int i23 = this.backgroundType;
                                        if (i23 == -1) {
                                            f10 = 1.4f;
                                        } else if (i23 == 5) {
                                            f10 = 0.8f;
                                        } else {
                                            f9 = 9.0f;
                                            f10 = 1.0f;
                                            float dp6 = AndroidUtilities.dp(f9 * f10) * f18;
                                            float dp7 = AndroidUtilities.dp(f10 * 4.0f) * f18;
                                            int dp8 = i2 - AndroidUtilities.dp(1.5f);
                                            int dp9 = AndroidUtilities.dp(4.0f) + i;
                                            float sqrt = (float) Math.sqrt((dp7 * dp7) / 2.0f);
                                            float f25 = dp8;
                                            float f26 = dp9;
                                            this.path.moveTo(f25 - sqrt, f26 - sqrt);
                                            this.path.lineTo(f25, f26);
                                            float sqrt2 = (float) Math.sqrt((dp6 * dp6) / 2.0f);
                                            this.path.lineTo(f25 + sqrt2, f26 - sqrt2);
                                            if (this.cutCheck && this.checkScale == 1.0f) {
                                                z = false;
                                            } else {
                                                canvas.save();
                                                float f27 = this.checkScale;
                                                canvas.scale(f27, f27, i2, i);
                                                z = true;
                                            }
                                            canvas.drawPath(this.path, this.checkPaint);
                                            if (z) {
                                                canvas.restore();
                                            }
                                        }
                                        f9 = 9.0f;
                                        float dp62 = AndroidUtilities.dp(f9 * f10) * f18;
                                        float dp72 = AndroidUtilities.dp(f10 * 4.0f) * f18;
                                        int dp82 = i2 - AndroidUtilities.dp(1.5f);
                                        int dp92 = AndroidUtilities.dp(4.0f) + i;
                                        float sqrt3 = (float) Math.sqrt((dp72 * dp72) / 2.0f);
                                        float f252 = dp82;
                                        float f262 = dp92;
                                        this.path.moveTo(f252 - sqrt3, f262 - sqrt3);
                                        this.path.lineTo(f252, f262);
                                        float sqrt22 = (float) Math.sqrt((dp62 * dp62) / 2.0f);
                                        this.path.lineTo(f252 + sqrt22, f262 - sqrt22);
                                        if (this.cutCheck) {
                                        }
                                        canvas.save();
                                        float f272 = this.checkScale;
                                        canvas.scale(f272, f272, i2, i);
                                        z = true;
                                        canvas.drawPath(this.path, this.checkPaint);
                                        if (z) {
                                        }
                                    }
                                }
                            }
                            if (this.cutCheck) {
                                return;
                            }
                            canvas.restore();
                            return;
                        }
                        if (i8 == 0 || i8 == 11) {
                            canvas.drawCircle(i2, i, f5, this.backgroundPaint);
                        } else {
                            float f28 = i2;
                            float f29 = i;
                            this.rect.set(f28 - f2, f29 - f2, f28 + f2, f29 + f2);
                            int i24 = this.backgroundType;
                            if (i24 == 6) {
                                i11 = (int) (f4 * (-360.0f));
                                i12 = 0;
                            } else if (i24 == 1) {
                                i12 = -90;
                                i11 = (int) (f4 * (-270.0f));
                            } else {
                                int i25 = (int) (f4 * 270.0f);
                                if (LocaleController.isRTL) {
                                    i25 = -i25;
                                }
                                i11 = i25;
                                i12 = 90;
                            }
                            if (i24 == 6) {
                                int themedColor = getThemedColor(this.strokeBackgroundKey);
                                int alpha2 = Color.alpha(themedColor);
                                this.backgroundPaint.setColor(themedColor);
                                this.backgroundPaint.setAlpha((int) (alpha2 * f4));
                                i13 = i12;
                                i14 = i11;
                                canvas.drawArc(this.rect, i12, i11, false, this.backgroundPaint);
                                int themedColor2 = getThemedColor(Theme.key_chat_attachPhotoBackground);
                                int alpha3 = Color.alpha(themedColor2);
                                this.backgroundPaint.setColor(themedColor2);
                                this.backgroundPaint.setAlpha((int) (alpha3 * f4));
                            } else {
                                i13 = i12;
                                i14 = i11;
                            }
                            canvas.drawArc(this.rect, i13, i14, false, this.backgroundPaint);
                        }
                    }
                    f7 = 0.0f;
                    if (f3 > f7) {
                    }
                    if (this.cutCheck) {
                    }
                } else if (i15 == 6 || i15 == 7) {
                    float f30 = i2;
                    float f31 = i;
                    canvas.drawCircle(f30, f31, f5 - AndroidUtilities.dp(f6), paint);
                    canvas.drawCircle(f30, f31, f5 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                } else {
                    canvas.drawCircle(i2, i, f5, paint);
                }
            }
            i6 = -1;
            i7 = 7;
            paint.setColor(getThemedColor(this.checkColorKey));
            i8 = this.backgroundType;
            if (i8 != i6) {
                if (i8 != 12) {
                }
                this.backgroundPaint.setStyle(Paint.Style.FILL);
                messageDrawable = this.messageDrawable;
                if (messageDrawable == null) {
                }
                f7 = 0.0f;
                this.backgroundPaint.setShader(null);
                canvas.drawCircle(i2, i, (f5 - AndroidUtilities.dp(f6)) * this.backgroundAlpha, this.backgroundPaint);
                this.backgroundPaint.setStyle(Paint.Style.STROKE);
                if (f3 > f7) {
                }
                if (this.cutCheck) {
                }
            }
            f7 = 0.0f;
            if (f3 > f7) {
            }
            if (this.cutCheck) {
            }
        }
        f = dp;
        f2 = f;
        if (!this.forbidden) {
        }
        if (f13 < 0.5f) {
        }
        int centerX2 = this.bounds.centerX();
        int centerY2 = this.bounds.centerY();
        if (this.cutCheck) {
        }
        i5 = this.backgroundColorKey;
        if (i5 < 0) {
        }
        if (this.drawUnchecked) {
            if (i15 != 8) {
            }
            if (this.customRadius <= 0.0f) {
            }
            paint.setColor(getThemedColor(this.checkColorKey));
            i8 = this.backgroundType;
            if (i8 != i6) {
            }
            f7 = 0.0f;
            if (f3 > f7) {
            }
            if (this.cutCheck) {
            }
        }
        i6 = -1;
        i7 = 7;
        paint.setColor(getThemedColor(this.checkColorKey));
        i8 = this.backgroundType;
        if (i8 != i6) {
        }
        f7 = 0.0f;
        if (f3 > f7) {
        }
        if (this.cutCheck) {
        }
    }

    public void setCirclePaintProvider(GenericProvider genericProvider) {
        this.circlePaintProvider = genericProvider;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
