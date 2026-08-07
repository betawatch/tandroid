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
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.MessageDrawable;
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
    private MessageDrawable messageDrawable;
    private View parentView;
    private float progress;
    private ProgressDelegate progressDelegate;
    private Theme.ResourcesProvider resourcesProvider;
    private float size;
    private int strokeBackgroundKey;
    private int strokeBackgroundWidth;
    private TextPaint textPaint;
    private boolean useDefaultCheck;
    public Rect bounds = new Rect();
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
        if (this.alpha == f) {
            return;
        }
        this.alpha = f;
        invalidate();
    }

    public void setCuttingCheck(boolean z) {
        if (this.cutCheck == z) {
            return;
        }
        this.cutCheck = z;
        this.checkPaint.setXfermode(z ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        invalidate();
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
        if (this.size == f) {
            return;
        }
        this.size = f;
        invalidate();
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    public View getParentView() {
        return this.parentView;
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        if (this.resourcesProvider == resourcesProvider) {
            return;
        }
        this.resourcesProvider = resourcesProvider;
        invalidate();
    }

    public void onAttachedToWindow() {
        this.attachedToWindow = true;
    }

    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 + i;
        int i6 = i4 + i2;
        Rect rect = this.bounds;
        if (rect.left == i && rect.top == i2 && rect.right == i5 && rect.bottom == i6) {
            return;
        }
        rect.left = i;
        rect.top = i2;
        rect.right = i5;
        rect.bottom = i6;
        invalidate();
    }

    public void setCustomRadius(float f) {
        if (this.customRadius == f) {
            return;
        }
        this.customRadius = f;
        invalidate();
    }

    public void setCustomRadiusFactor(float f) {
        if (this.customRadiusFactor == f) {
            return;
        }
        this.customRadiusFactor = f;
        invalidate();
    }

    public void setDrawUnchecked(boolean z) {
        if (this.drawUnchecked == z) {
            return;
        }
        this.drawUnchecked = z;
        invalidate();
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
        View view = this.parentView;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
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
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        invalidate();
    }

    public void setBackgroundType(int i) {
        if (this.backgroundType == i) {
            return;
        }
        this.backgroundType = i;
        if (i == 12 || i == 13) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        } else if (i == 4 || i == 5) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.9f));
            if (i == 5) {
                this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            }
        } else if (i == 3) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        } else if (i != 0) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }
        invalidate();
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
        if (this.backgroundColorKey == i && this.background2ColorKey == i2 && this.checkColorKey == i3) {
            return;
        }
        this.backgroundColorKey = i;
        this.background2ColorKey = i2;
        this.checkColorKey = i3;
        invalidate();
    }

    public void setStrokeBackgroundColor(int i) {
        if (this.strokeBackgroundKey == i) {
            return;
        }
        this.strokeBackgroundKey = i;
        invalidate();
    }

    public void setBackgroundColor(int i) {
        if (this.backgroundColor == i) {
            return;
        }
        this.backgroundColor = i;
        invalidate();
    }

    public void setBackgroundDrawable(MessageDrawable messageDrawable) {
        if (this.messageDrawable == messageDrawable) {
            return;
        }
        this.messageDrawable = messageDrawable;
        invalidate();
    }

    public void setUseDefaultCheck(boolean z) {
        if (this.useDefaultCheck == z) {
            return;
        }
        this.useDefaultCheck = z;
        invalidate();
    }

    public void setBackgroundAlpha(float f) {
        if (this.backgroundAlpha == f) {
            return;
        }
        this.backgroundAlpha = f;
        invalidate();
    }

    public void setNum(int i) {
        String str;
        if (i >= 0) {
            str = "" + (i + 1);
        } else {
            str = this.checkAnimator != null ? this.checkedText : null;
        }
        String str2 = this.checkedText;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        this.checkedText = str;
        invalidate();
    }

    public void setChecked(boolean z, boolean z2) {
        setChecked(-1, z, z2);
    }

    public void setChecked(int i, boolean z, boolean z2) {
        if (i >= 0) {
            String str = "" + (i + 1);
            String str2 = this.checkedText;
            if (str2 == null || !str2.equals(str)) {
                this.checkedText = str;
                invalidate();
            }
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
    /* JADX WARN: Removed duplicated region for block: B:181:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        int i;
        float f4;
        int i2;
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
        boolean z2;
        int i9;
        float f10;
        float f11;
        int i10;
        int i11;
        MessageDrawable messageDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float dp = AndroidUtilities.dp(this.size / 2.0f);
        int i17 = this.backgroundType;
        if (i17 == 12 || i17 == 13) {
            dp = AndroidUtilities.dp(10.0f);
        } else if (i17 != 0 && i17 != 11) {
            f = dp;
            f2 = dp - AndroidUtilities.dp(0.2f);
            float f12 = !this.forbidden ? 1.0f : this.progress;
            f3 = f12 < 0.5f ? 1.0f : f12 / 0.5f;
            int centerX = this.bounds.centerX();
            int centerY = this.bounds.centerY();
            z = !this.cutCheck && f3 > 0.0f && f12 >= 0.5f && !this.forbidden && this.checkedText == null;
            if (z) {
                i = centerX;
                f4 = f12;
                i2 = centerY;
                f5 = f;
                i3 = 12;
                i4 = 13;
                f6 = 1.0f;
            } else {
                float f13 = centerX;
                float f14 = centerY;
                i = centerX;
                i2 = centerY;
                f6 = 1.0f;
                f5 = f;
                f4 = f12;
                i3 = 12;
                i4 = 13;
                canvas.saveLayerAlpha(f13 - f, f14 - f, f13 + f, f14 + f, NotificationCenter.didReceiveSmsCode, 31);
            }
            i5 = this.backgroundColorKey;
            if (i5 < 0) {
                if (this.drawUnchecked) {
                    int i18 = this.backgroundType;
                    if (i18 == i3 || i18 == i4) {
                        paint.setColor(getThemedColor(i5));
                        paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i18 == 6 || i18 == 7) {
                        paint.setColor(getThemedColor(this.background2ColorKey));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i18 == 10 || i18 == 14) {
                        this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                    } else {
                        paint.setColor((16777215 & Theme.getServiceMessageColor()) | 671088640);
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    }
                } else {
                    Paint paint2 = this.backgroundPaint;
                    int i19 = this.background2ColorKey;
                    if (i19 < 0) {
                        i19 = this.checkColorKey;
                    }
                    paint2.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i19), f4, this.backgroundAlpha));
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
                int i20 = this.background2ColorKey;
                if (i20 < 0) {
                    i20 = this.checkColorKey;
                }
                paint3.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i20), f4, this.backgroundAlpha));
            }
            if (this.drawUnchecked && (i16 = this.backgroundType) >= 0 && i16 != i3 && i16 != i4) {
                if (i16 != 8 || i16 == 10 || i16 == 14) {
                    if (this.customRadius <= 0.0f) {
                        float dp2 = f5 - AndroidUtilities.dp(1.5f);
                        float lerp = AndroidUtilities.lerp(dp2, this.customRadius, this.customRadiusFactor);
                        float f15 = i;
                        float f16 = i2;
                        i7 = 7;
                        i6 = -1;
                        canvas.drawRoundRect(f15 - dp2, f16 - dp2, f15 + dp2, f16 + dp2, lerp, lerp, this.backgroundPaint);
                    } else {
                        i6 = -1;
                        i7 = 7;
                        canvas.drawCircle(i, i2, f5 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
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
                                matrix.postTranslate(0.0f, (-this.messageDrawable.getTopY()) + this.bounds.top);
                                gradientShader.setLocalMatrix(matrix);
                                this.backgroundPaint.setShader(gradientShader);
                            } else {
                                this.backgroundPaint.setShader(null);
                            }
                            canvas.drawCircle(i, i2, (f5 - AndroidUtilities.dp(f6)) * this.backgroundAlpha, this.backgroundPaint);
                            this.backgroundPaint.setStyle(Paint.Style.STROKE);
                        } else if (i8 == 0 || i8 == 11) {
                            canvas.drawCircle(i, i2, f5, this.backgroundPaint);
                        } else {
                            float f17 = i;
                            float f18 = i2;
                            this.rect.set(f17 - f2, f18 - f2, f17 + f2, f18 + f2);
                            int i21 = this.backgroundType;
                            if (i21 == 6) {
                                i12 = (int) (f4 * (-360.0f));
                                i13 = 0;
                            } else if (i21 == 1) {
                                i13 = -90;
                                i12 = (int) (f4 * (-270.0f));
                            } else {
                                int i22 = (int) (f4 * 270.0f);
                                if (LocaleController.isRTL) {
                                    i22 = -i22;
                                }
                                i12 = i22;
                                i13 = 90;
                            }
                            if (i21 == 6) {
                                int themedColor = getThemedColor(this.strokeBackgroundKey);
                                int alpha = Color.alpha(themedColor);
                                this.backgroundPaint.setColor(themedColor);
                                this.backgroundPaint.setAlpha((int) (alpha * f4));
                                i14 = i13;
                                i15 = i12;
                                canvas.drawArc(this.rect, i13, i12, false, this.backgroundPaint);
                                int themedColor2 = getThemedColor(Theme.key_chat_attachPhotoBackground);
                                int alpha2 = Color.alpha(themedColor2);
                                this.backgroundPaint.setColor(themedColor2);
                                this.backgroundPaint.setAlpha((int) (alpha2 * f4));
                            } else {
                                i14 = i13;
                                i15 = i12;
                            }
                            canvas.drawArc(this.rect, i14, i15, false, this.backgroundPaint);
                        }
                    }
                    if (f3 > 0.0f) {
                        float f19 = f4 < 0.5f ? 0.0f : (f4 - 0.5f) / 0.5f;
                        int i23 = this.backgroundType;
                        if (i23 == 9) {
                            paint.setColor(getThemedColor(this.background2ColorKey));
                        } else if (i23 == 11 || i23 == 6 || i23 == 7 || i23 == 10 || ((!this.drawUnchecked && this.backgroundColorKey >= 0) || i23 == 14)) {
                            paint.setColor(getThemedColor(this.backgroundColorKey));
                        } else {
                            int i24 = this.backgroundColor;
                            if (i24 != 0) {
                                paint.setColor(i24);
                            } else {
                                paint.setColor(getThemedColor(this.enabled ? Theme.key_checkbox : Theme.key_checkboxDisabled));
                            }
                        }
                        if (this.forbidden) {
                            paint.setColor(this.backgroundPaint.getColor());
                            f7 = 1.0f;
                        } else {
                            f7 = 1.0f;
                            if (this.alpha < 1.0f) {
                                paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
                            }
                        }
                        if (!this.useDefaultCheck && (i11 = this.checkColorKey) >= 0) {
                            this.checkPaint.setColor(getThemedColor(i11));
                        } else {
                            this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                        }
                        if (this.alpha < f7 && Theme.isCurrentThemeDark()) {
                            this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                        }
                        if (this.backgroundType != -1) {
                            float dp3 = AndroidUtilities.dp(this.size) / 2.0f;
                            int save = canvas.save();
                            canvas.translate(i - dp3, i2 - dp3);
                            boolean z3 = f3 < f7;
                            if (z3) {
                                i10 = save;
                                canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), NotificationCenter.didReceiveSmsCode, 31);
                            } else {
                                i10 = save;
                            }
                            Paint paint4 = (Paint) this.circlePaintProvider.provide(null);
                            int i25 = this.backgroundType;
                            if (i25 == 12 || i25 == 13) {
                                int alpha3 = paint4.getAlpha();
                                paint4.setAlpha((int) (f3 * 255.0f));
                                canvas.drawCircle(dp3, dp3, f5 * f3, paint4);
                                if (paint4 != paint) {
                                    paint4.setAlpha(alpha3);
                                }
                            } else if (this.customRadius > 0.0f) {
                                float dp4 = f5 - AndroidUtilities.dp(0.5f);
                                float lerp2 = AndroidUtilities.lerp(dp4, this.customRadius, this.customRadiusFactor);
                                float f20 = dp3 - dp4;
                                float f21 = dp3 + dp4;
                                canvas.drawRoundRect(f20, f20, f21, f21, lerp2, lerp2, paint4);
                                float f22 = dp4 * (f7 - f3);
                                float lerp3 = AndroidUtilities.lerp(f22, this.customRadius, this.customRadiusFactor);
                                if (z3 && f22 > 0.0f) {
                                    float f23 = dp3 - f22;
                                    float f24 = dp3 + f22;
                                    canvas.drawRoundRect(f23, f23, f24, f24, lerp3, lerp3, Theme.PAINT_CLEAR);
                                }
                            } else {
                                float dp5 = f5 - AndroidUtilities.dp(0.5f);
                                canvas.drawCircle(dp3, dp3, dp5, paint4);
                                float f25 = dp5 * (f7 - f3);
                                if (z3 && f25 > 0.0f) {
                                    canvas.drawCircle(dp3, dp3, f25, Theme.PAINT_CLEAR);
                                }
                            }
                            canvas.restoreToCount(i10);
                        }
                        if (this.forbidden) {
                            if (forbidPaint == null) {
                                Paint paint5 = new Paint(1);
                                forbidPaint = paint5;
                                paint5.setStyle(Paint.Style.STROKE);
                                forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                                forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                                forbidPaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                            }
                            forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                            forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                            canvas.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                        } else if (f19 != 0.0f) {
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
                                    f10 = 14.0f;
                                    f11 = 18.0f;
                                } else if (length != 3) {
                                    f10 = 8.0f;
                                    f11 = 15.75f;
                                } else {
                                    f11 = 16.5f;
                                    f10 = 10.0f;
                                }
                                this.textPaint.setTextSize(AndroidUtilities.dp(f10));
                                this.textPaint.setColor(getThemedColor(this.checkColorKey));
                                canvas.save();
                                float f26 = i;
                                canvas.scale(f19, f7, f26, i2);
                                String str = this.checkedText;
                                canvas.drawText(str, f26 - (this.textPaint.measureText(str) / 2.0f), AndroidUtilities.dp(f11), this.textPaint);
                                canvas.restore();
                            } else {
                                this.path.reset();
                                int i26 = this.backgroundType;
                                if (i26 == -1) {
                                    f9 = 1.4f;
                                } else if (i26 == 5) {
                                    f9 = 0.8f;
                                } else {
                                    f8 = 9.0f;
                                    f9 = 1.0f;
                                    float dp6 = AndroidUtilities.dp(f8 * f9) * f19;
                                    float dp7 = AndroidUtilities.dp(f9 * 4.0f) * f19;
                                    int dp8 = i - AndroidUtilities.dp(1.5f);
                                    int dp9 = AndroidUtilities.dp(4.0f) + i2;
                                    float sqrt = (float) Math.sqrt((dp7 * dp7) / 2.0f);
                                    float f27 = dp8;
                                    float f28 = dp9;
                                    this.path.moveTo(f27 - sqrt, f28 - sqrt);
                                    this.path.lineTo(f27, f28);
                                    float sqrt2 = (float) Math.sqrt((dp6 * dp6) / 2.0f);
                                    this.path.lineTo(f27 + sqrt2, f28 - sqrt2);
                                    if (z && this.checkScale == f7) {
                                        z2 = false;
                                    } else {
                                        canvas.save();
                                        float f29 = this.checkScale;
                                        canvas.scale(f29, f29, i, i2);
                                        z2 = true;
                                    }
                                    canvas.drawPath(this.path, this.checkPaint);
                                    if (z2) {
                                        canvas.restore();
                                    }
                                }
                                f8 = 9.0f;
                                float dp62 = AndroidUtilities.dp(f8 * f9) * f19;
                                float dp72 = AndroidUtilities.dp(f9 * 4.0f) * f19;
                                int dp82 = i - AndroidUtilities.dp(1.5f);
                                int dp92 = AndroidUtilities.dp(4.0f) + i2;
                                float sqrt3 = (float) Math.sqrt((dp72 * dp72) / 2.0f);
                                float f272 = dp82;
                                float f282 = dp92;
                                this.path.moveTo(f272 - sqrt3, f282 - sqrt3);
                                this.path.lineTo(f272, f282);
                                float sqrt22 = (float) Math.sqrt((dp62 * dp62) / 2.0f);
                                this.path.lineTo(f272 + sqrt22, f282 - sqrt22);
                                if (z) {
                                }
                                canvas.save();
                                float f292 = this.checkScale;
                                canvas.scale(f292, f292, i, i2);
                                z2 = true;
                                canvas.drawPath(this.path, this.checkPaint);
                                if (z2) {
                                }
                            }
                        }
                    }
                    if (z) {
                        return;
                    }
                    canvas.restore();
                    return;
                }
                if (i16 == 6 || i16 == 7) {
                    float f30 = i;
                    float f31 = i2;
                    canvas.drawCircle(f30, f31, f5 - AndroidUtilities.dp(f6), paint);
                    canvas.drawCircle(f30, f31, f5 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                } else {
                    canvas.drawCircle(i, i2, f5, paint);
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
                this.backgroundPaint.setShader(null);
                canvas.drawCircle(i, i2, (f5 - AndroidUtilities.dp(f6)) * this.backgroundAlpha, this.backgroundPaint);
                this.backgroundPaint.setStyle(Paint.Style.STROKE);
            }
            if (f3 > 0.0f) {
            }
            if (z) {
            }
        }
        f = dp;
        f2 = f;
        if (!this.forbidden) {
        }
        if (f12 < 0.5f) {
        }
        int centerX2 = this.bounds.centerX();
        int centerY2 = this.bounds.centerY();
        if (this.cutCheck) {
        }
        if (z) {
        }
        i5 = this.backgroundColorKey;
        if (i5 < 0) {
        }
        if (this.drawUnchecked) {
            if (i16 != 8) {
            }
            if (this.customRadius <= 0.0f) {
            }
            paint.setColor(getThemedColor(this.checkColorKey));
            i8 = this.backgroundType;
            if (i8 != i6) {
            }
            if (f3 > 0.0f) {
            }
            if (z) {
            }
        }
        i6 = -1;
        i7 = 7;
        paint.setColor(getThemedColor(this.checkColorKey));
        i8 = this.backgroundType;
        if (i8 != i6) {
        }
        if (f3 > 0.0f) {
        }
        if (z) {
        }
    }

    public void setCirclePaintProvider(GenericProvider genericProvider) {
        if (this.circlePaintProvider == genericProvider) {
            return;
        }
        this.circlePaintProvider = genericProvider;
        invalidate();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
