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
                Paint paint2;
                paint2 = CheckBoxBase.paint;
                return paint2;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        float f5;
        float f6;
        float f7;
        Canvas canvas2;
        int i4;
        int i5;
        char c;
        int i6;
        int i7;
        float f8;
        int i8;
        int i9;
        boolean z2;
        int i10;
        float f9;
        float f10;
        int i11;
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
            f = dp - AndroidUtilities.dp(0.2f);
            float f11 = !this.forbidden ? 1.0f : this.progress;
            f2 = f11 < 0.5f ? 1.0f : f11 / 0.5f;
            int centerX = this.bounds.centerX();
            int centerY = this.bounds.centerY();
            z = !this.cutCheck && f2 > 0.0f && f11 >= 0.5f && !this.forbidden && this.checkedText == null;
            if (z) {
                f3 = dp;
                f4 = f11;
                i = centerX;
                i2 = centerY;
                i3 = 12;
                f5 = 2.0f;
                f6 = 0.0f;
                f7 = 1.0f;
                canvas2 = canvas;
            } else {
                float f12 = centerX;
                float f13 = f11;
                float f14 = f12 - dp;
                float f15 = centerY;
                float f16 = f15 - dp;
                float f17 = f12 + dp;
                float f18 = f15 + dp;
                f3 = dp;
                f4 = f13;
                i = centerX;
                i2 = centerY;
                i3 = 12;
                f5 = 2.0f;
                f6 = 0.0f;
                f7 = 1.0f;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f14, f16, f17, f18, NotificationCenter.didReceiveSmsCode, 31);
            }
            i4 = this.backgroundColorKey;
            if (i4 < 0) {
                if (this.drawUnchecked) {
                    int i18 = this.backgroundType;
                    if (i18 == i3 || i18 == 13) {
                        paint.setColor(getThemedColor(i4));
                        paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i18 == 6 || i18 == 7) {
                        paint.setColor(getThemedColor(this.background2ColorKey));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i18 == 10 || i18 == 14) {
                        this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                    } else {
                        paint.setColor((Theme.getServiceMessageColor() & 16777215) | 671088640);
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
            } else {
                if (this.drawUnchecked) {
                    paint.setColor(Color.argb((int) (this.backgroundAlpha * 25.0f), 0, 0, 0));
                    if (this.backgroundType == 8) {
                        this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                    } else {
                        i5 = -1;
                        this.backgroundPaint.setColor(AndroidUtilities.getOffsetColor(-1, getThemedColor(this.checkColorKey), f4, this.backgroundAlpha));
                    }
                } else {
                    i5 = -1;
                    if (this.backgroundColor != 0) {
                        this.backgroundPaint.setColor(0);
                    } else {
                        Paint paint3 = this.backgroundPaint;
                        int i20 = this.background2ColorKey;
                        if (i20 < 0) {
                            i20 = this.checkColorKey;
                        }
                        c = 0;
                        paint3.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i20), f4, this.backgroundAlpha));
                        if (this.drawUnchecked && (i16 = this.backgroundType) >= 0 && i16 != i3 && i16 != 13) {
                            if (i16 != 8 || i16 == 10 || i16 == 14) {
                                if (this.customRadius <= f6) {
                                    float dp2 = f3 - AndroidUtilities.dp(1.5f);
                                    float lerp = AndroidUtilities.lerp(dp2, this.customRadius, this.customRadiusFactor);
                                    float f19 = i;
                                    float f20 = i2;
                                    i6 = 8;
                                    i7 = 10;
                                    f8 = 1.5f;
                                    canvas2.drawRoundRect(f19 - dp2, f20 - dp2, f19 + dp2, f20 + dp2, lerp, lerp, this.backgroundPaint);
                                } else {
                                    i6 = 8;
                                    i7 = 10;
                                    f8 = 1.5f;
                                    canvas2.drawCircle(i, i2, f3 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                                }
                                paint.setColor(getThemedColor(this.checkColorKey));
                                i8 = this.backgroundType;
                                if (i8 != i5 || i8 == 7 || i8 == i6 || i8 == 9 || i8 == i7 || i8 == 14) {
                                    i9 = 6;
                                } else {
                                    if (i8 != 12 && i8 != 13) {
                                        if (i8 == 0 || i8 == 11) {
                                            i9 = 6;
                                            canvas2.drawCircle(i, i2, f3, this.backgroundPaint);
                                        } else {
                                            float f21 = i;
                                            float f22 = i2;
                                            this.rect.set(f21 - f, f22 - f, f21 + f, f22 + f);
                                            int i21 = this.backgroundType;
                                            i9 = 6;
                                            if (i21 == 6) {
                                                i12 = (int) ((-360.0f) * f4);
                                                i13 = 0;
                                            } else if (i21 == 1) {
                                                i12 = (int) ((-270.0f) * f4);
                                                i13 = -90;
                                            } else {
                                                i12 = (int) (270.0f * f4);
                                                if (LocaleController.isRTL) {
                                                    i12 = -i12;
                                                }
                                                i13 = 90;
                                            }
                                            if (i21 == 6) {
                                                int themedColor = getThemedColor(this.strokeBackgroundKey);
                                                int alpha = Color.alpha(themedColor);
                                                this.backgroundPaint.setColor(themedColor);
                                                this.backgroundPaint.setAlpha((int) (alpha * f4));
                                                i15 = i13;
                                                i14 = i12;
                                                canvas2.drawArc(this.rect, i13, i12, false, this.backgroundPaint);
                                                int themedColor2 = getThemedColor(Theme.key_chat_attachPhotoBackground);
                                                int alpha2 = Color.alpha(themedColor2);
                                                this.backgroundPaint.setColor(themedColor2);
                                                this.backgroundPaint.setAlpha((int) (alpha2 * f4));
                                            } else {
                                                i14 = i12;
                                                i15 = i13;
                                            }
                                            canvas2 = canvas;
                                            canvas2.drawArc(this.rect, i15, i14, false, this.backgroundPaint);
                                        }
                                        if (f2 > f6) {
                                            float f23 = f4 < 0.5f ? 0.0f : (f4 - 0.5f) / 0.5f;
                                            int i22 = this.backgroundType;
                                            if (i22 == 9) {
                                                paint.setColor(getThemedColor(this.background2ColorKey));
                                            } else if (i22 == 11 || i22 == i9 || i22 == 7 || i22 == 10 || ((!this.drawUnchecked && this.backgroundColorKey >= 0) || i22 == 14)) {
                                                paint.setColor(getThemedColor(this.backgroundColorKey));
                                            } else {
                                                int i23 = this.backgroundColor;
                                                if (i23 != 0) {
                                                    paint.setColor(i23);
                                                } else {
                                                    paint.setColor(getThemedColor(this.enabled ? Theme.key_checkbox : Theme.key_checkboxDisabled));
                                                }
                                            }
                                            if (this.forbidden) {
                                                paint.setColor(this.backgroundPaint.getColor());
                                            } else if (this.alpha < f7) {
                                                paint.setColor(ColorUtils.blendARGB(this.backgroundPaint.getColor(), paint.getColor(), this.alpha));
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
                                                float dp3 = AndroidUtilities.dp(this.size) / f5;
                                                int save = canvas2.save();
                                                canvas2.translate(i - dp3, i2 - dp3);
                                                boolean z3 = f2 < f7;
                                                if (z3) {
                                                    canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), NotificationCenter.didReceiveSmsCode, 31);
                                                }
                                                Paint paint4 = (Paint) this.circlePaintProvider.provide(null);
                                                int i24 = this.backgroundType;
                                                if (i24 == 12 || i24 == 13) {
                                                    canvas2 = canvas;
                                                    int alpha3 = paint4.getAlpha();
                                                    paint4.setAlpha((int) (f2 * 255.0f));
                                                    canvas2.drawCircle(dp3, dp3, f3 * f2, paint4);
                                                    if (paint4 != paint) {
                                                        paint4.setAlpha(alpha3);
                                                    }
                                                } else if (this.customRadius > 0.0f) {
                                                    float dp4 = f3 - AndroidUtilities.dp(0.5f);
                                                    float lerp2 = AndroidUtilities.lerp(dp4, this.customRadius, this.customRadiusFactor);
                                                    float f24 = dp3 - dp4;
                                                    float f25 = dp3 + dp4;
                                                    canvas.drawRoundRect(f24, f24, f25, f25, lerp2, lerp2, paint4);
                                                    float f26 = dp4 * (f7 - f2);
                                                    float lerp3 = AndroidUtilities.lerp(f26, this.customRadius, this.customRadiusFactor);
                                                    if (!z3 || f26 <= 0.0f) {
                                                        canvas2 = canvas;
                                                    } else {
                                                        float f27 = dp3 - f26;
                                                        float f28 = dp3 + f26;
                                                        canvas2 = canvas;
                                                        canvas2.drawRoundRect(f27, f27, f28, f28, lerp3, lerp3, Theme.PAINT_CLEAR);
                                                    }
                                                } else {
                                                    canvas2 = canvas;
                                                    float dp5 = f3 - AndroidUtilities.dp(0.5f);
                                                    canvas2.drawCircle(dp3, dp3, dp5, paint4);
                                                    float f29 = dp5 * (f7 - f2);
                                                    if (z3 && f29 > 0.0f) {
                                                        canvas2.drawCircle(dp3, dp3, f29, Theme.PAINT_CLEAR);
                                                    }
                                                }
                                                canvas2.restoreToCount(save);
                                            }
                                            if (this.forbidden) {
                                                if (forbidPaint == null) {
                                                    Paint paint5 = new Paint(1);
                                                    forbidPaint = paint5;
                                                    paint5.setStyle(Paint.Style.STROKE);
                                                    forbidPaint.setStrokeCap(Paint.Cap.ROUND);
                                                    forbidPaint.setStrokeJoin(Paint.Join.ROUND);
                                                    Paint paint6 = forbidPaint;
                                                    float dp6 = AndroidUtilities.dp(0.66f);
                                                    float dp7 = AndroidUtilities.dp(4.0f);
                                                    float[] fArr = new float[2];
                                                    fArr[c] = dp6;
                                                    fArr[1] = dp7;
                                                    paint6.setPathEffect(new DashPathEffect(fArr, 0.0f));
                                                }
                                                forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                                                forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                                                canvas2.drawCircle(i, i2, AndroidUtilities.dp(9.0f), forbidPaint);
                                            } else if (f23 != 0.0f) {
                                                if (this.checkedText != null) {
                                                    if (this.textPaint == null) {
                                                        i10 = 1;
                                                        TextPaint textPaint = new TextPaint(1);
                                                        this.textPaint = textPaint;
                                                        textPaint.setTypeface(AndroidUtilities.bold());
                                                    } else {
                                                        i10 = 1;
                                                    }
                                                    int length = this.checkedText.length();
                                                    if (length == 0 || length == i10 || length == 2) {
                                                        f9 = 14.0f;
                                                        f10 = 18.0f;
                                                    } else if (length != 3) {
                                                        f9 = 8.0f;
                                                        f10 = 15.75f;
                                                    } else {
                                                        f10 = 16.5f;
                                                        f9 = 10.0f;
                                                    }
                                                    this.textPaint.setTextSize(AndroidUtilities.dp(f9));
                                                    this.textPaint.setColor(getThemedColor(this.checkColorKey));
                                                    canvas2.save();
                                                    float f30 = i;
                                                    canvas2.scale(f23, 1.0f, f30, i2);
                                                    String str = this.checkedText;
                                                    canvas2.drawText(str, f30 - (this.textPaint.measureText(str) / f5), AndroidUtilities.dp(f10), this.textPaint);
                                                    canvas2.restore();
                                                } else {
                                                    this.path.reset();
                                                    int i25 = this.backgroundType;
                                                    float f31 = i25 == -1 ? 1.4f : i25 == 5 ? 0.8f : 1.0f;
                                                    float dp8 = AndroidUtilities.dp(f31 * 9.0f) * f23;
                                                    float dp9 = AndroidUtilities.dp(f31 * 4.0f) * f23;
                                                    int dp10 = i - AndroidUtilities.dp(f8);
                                                    int dp11 = AndroidUtilities.dp(4.0f) + i2;
                                                    float sqrt = (float) Math.sqrt((dp9 * dp9) / f5);
                                                    float f32 = dp10;
                                                    float f33 = dp11;
                                                    this.path.moveTo(f32 - sqrt, f33 - sqrt);
                                                    this.path.lineTo(f32, f33);
                                                    float sqrt2 = (float) Math.sqrt((dp8 * dp8) / f5);
                                                    this.path.lineTo(f32 + sqrt2, f33 - sqrt2);
                                                    if (z || this.checkScale != 1.0f) {
                                                        canvas2.save();
                                                        float f34 = this.checkScale;
                                                        canvas2.scale(f34, f34, i, i2);
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    canvas2.drawPath(this.path, this.checkPaint);
                                                    if (z2) {
                                                        canvas2.restore();
                                                    }
                                                }
                                            }
                                        }
                                        if (z) {
                                            canvas2.restore();
                                            return;
                                        }
                                        return;
                                    }
                                    i9 = 6;
                                    this.backgroundPaint.setStyle(Paint.Style.FILL);
                                    MessageDrawable messageDrawable = this.messageDrawable;
                                    if (messageDrawable != null && messageDrawable.hasGradient()) {
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
                                    canvas2.drawCircle(i, i2, (f3 - AndroidUtilities.dp(f7)) * this.backgroundAlpha, this.backgroundPaint);
                                    this.backgroundPaint.setStyle(Paint.Style.STROKE);
                                }
                                f6 = 0.0f;
                                if (f2 > f6) {
                                }
                                if (z) {
                                }
                            } else if (i16 == 6 || i16 == 7) {
                                float f35 = i;
                                float f36 = i2;
                                canvas2.drawCircle(f35, f36, f3 - AndroidUtilities.dp(f7), paint);
                                canvas2.drawCircle(f35, f36, f3 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                            } else {
                                canvas2.drawCircle(i, i2, f3, paint);
                            }
                        }
                        i6 = 8;
                        i7 = 10;
                        f8 = 1.5f;
                        paint.setColor(getThemedColor(this.checkColorKey));
                        i8 = this.backgroundType;
                        if (i8 != i5) {
                        }
                        i9 = 6;
                        f6 = 0.0f;
                        if (f2 > f6) {
                        }
                        if (z) {
                        }
                    }
                }
                c = 0;
                if (this.drawUnchecked) {
                    if (i16 != 8) {
                    }
                    if (this.customRadius <= f6) {
                    }
                    paint.setColor(getThemedColor(this.checkColorKey));
                    i8 = this.backgroundType;
                    if (i8 != i5) {
                    }
                    i9 = 6;
                    f6 = 0.0f;
                    if (f2 > f6) {
                    }
                    if (z) {
                    }
                }
                i6 = 8;
                i7 = 10;
                f8 = 1.5f;
                paint.setColor(getThemedColor(this.checkColorKey));
                i8 = this.backgroundType;
                if (i8 != i5) {
                }
                i9 = 6;
                f6 = 0.0f;
                if (f2 > f6) {
                }
                if (z) {
                }
            }
            i5 = -1;
            c = 0;
            if (this.drawUnchecked) {
            }
            i6 = 8;
            i7 = 10;
            f8 = 1.5f;
            paint.setColor(getThemedColor(this.checkColorKey));
            i8 = this.backgroundType;
            if (i8 != i5) {
            }
            i9 = 6;
            f6 = 0.0f;
            if (f2 > f6) {
            }
            if (z) {
            }
        }
        f = dp;
        if (!this.forbidden) {
        }
        if (f11 < 0.5f) {
        }
        int centerX2 = this.bounds.centerX();
        int centerY2 = this.bounds.centerY();
        if (this.cutCheck) {
        }
        if (z) {
        }
        i4 = this.backgroundColorKey;
        if (i4 < 0) {
        }
        i5 = -1;
        c = 0;
        if (this.drawUnchecked) {
        }
        i6 = 8;
        i7 = 10;
        f8 = 1.5f;
        paint.setColor(getThemedColor(this.checkColorKey));
        i8 = this.backgroundType;
        if (i8 != i5) {
        }
        i9 = 6;
        f6 = 0.0f;
        if (f2 > f6) {
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
