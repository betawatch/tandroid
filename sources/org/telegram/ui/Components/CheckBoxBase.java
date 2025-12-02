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
    private static Paint eraser;
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
            Paint paint2 = new Paint(1);
            eraser = paint2;
            paint2.setColor(0);
            eraser.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        Paint paint3 = new Paint(1);
        this.checkPaint = paint3;
        paint3.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = this.checkPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        this.checkPaint.setStrokeJoin(Paint.Join.ROUND);
        this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.9f));
        Paint paint5 = new Paint(1);
        this.backgroundPaint = paint5;
        paint5.setStyle(style);
        this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.2f));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
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
        boolean z;
        float f7;
        float f8;
        float f9;
        float f10;
        boolean z2;
        int i7;
        float f11;
        float f12;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float dp = AndroidUtilities.dp(this.size / 2.0f);
        int i14 = this.backgroundType;
        if (i14 == 12 || i14 == 13) {
            dp = AndroidUtilities.dp(10.0f);
        } else if (i14 != 0 && i14 != 11) {
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
                canvas.saveLayerAlpha(f14 - f, f15 - f, f14 + f, f15 + f, NotificationCenter.cameraInitied, 31);
            }
            i5 = this.backgroundColorKey;
            if (i5 < 0) {
                if (this.drawUnchecked) {
                    int i15 = this.backgroundType;
                    if (i15 == i3 || i15 == i4) {
                        paint.setColor(getThemedColor(i5));
                        paint.setAlpha((int) (this.backgroundAlpha * 255.0f));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i15 == 6 || i15 == 7) {
                        paint.setColor(getThemedColor(this.background2ColorKey));
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    } else if (i15 == 10 || i15 == 14) {
                        this.backgroundPaint.setColor(getThemedColor(this.background2ColorKey));
                    } else {
                        paint.setColor((Theme.getServiceMessageColor() & 16777215) | 671088640);
                        this.backgroundPaint.setColor(getThemedColor(this.checkColorKey));
                    }
                } else {
                    Paint paint2 = this.backgroundPaint;
                    int i16 = this.background2ColorKey;
                    if (i16 < 0) {
                        i16 = this.checkColorKey;
                    }
                    paint2.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i16), f4, this.backgroundAlpha));
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
                int i17 = this.background2ColorKey;
                if (i17 < 0) {
                    i17 = this.checkColorKey;
                }
                paint3.setColor(AndroidUtilities.getOffsetColor(16777215, getThemedColor(i17), f4, this.backgroundAlpha));
            }
            if (this.drawUnchecked && (i13 = this.backgroundType) >= 0 && i13 != i3 && i13 != i4) {
                if (i13 != 8 || i13 == 10 || i13 == 14) {
                    canvas.drawCircle(i2, i, f5 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                } else if (i13 == 6 || i13 == 7) {
                    float f16 = i2;
                    float f17 = i;
                    canvas.drawCircle(f16, f17, f5 - AndroidUtilities.dp(f6), paint);
                    canvas.drawCircle(f16, f17, f5 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
                } else {
                    canvas.drawCircle(i2, i, f5, paint);
                }
            }
            paint.setColor(getThemedColor(this.checkColorKey));
            i6 = this.backgroundType;
            if (i6 != -1 || i6 == 7 || i6 == 8 || i6 == 9 || i6 == 10 || i6 == 14) {
                z = false;
                f7 = 0.0f;
            } else if (i6 == i3 || i6 == i4) {
                z = false;
                f7 = 0.0f;
                this.backgroundPaint.setStyle(Paint.Style.FILL);
                Theme.MessageDrawable messageDrawable = this.messageDrawable;
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
                canvas.drawCircle(i2, i, (f5 - AndroidUtilities.dp(f6)) * this.backgroundAlpha, this.backgroundPaint);
                this.backgroundPaint.setStyle(Paint.Style.STROKE);
            } else if (i6 == 0 || i6 == 11) {
                z = false;
                f7 = 0.0f;
                canvas.drawCircle(i2, i, f5, this.backgroundPaint);
            } else {
                float f18 = i2;
                float f19 = i;
                this.rect.set(f18 - f2, f19 - f2, f18 + f2, f19 + f2);
                int i18 = this.backgroundType;
                if (i18 == 6) {
                    i10 = (int) (f4 * (-360.0f));
                    i9 = 0;
                } else if (i18 == 1) {
                    i10 = (int) (f4 * (-270.0f));
                    i9 = -90;
                } else {
                    int i19 = (int) (f4 * 270.0f);
                    i9 = 90;
                    if (LocaleController.isRTL) {
                        i19 = -i19;
                    }
                    i10 = i19;
                }
                if (i18 == 6) {
                    int themedColor = getThemedColor(this.strokeBackgroundKey);
                    int alpha = Color.alpha(themedColor);
                    this.backgroundPaint.setColor(themedColor);
                    this.backgroundPaint.setAlpha((int) (alpha * f4));
                    f7 = 0.0f;
                    i11 = i9;
                    z = false;
                    i12 = i10;
                    canvas.drawArc(this.rect, i9, i10, false, this.backgroundPaint);
                    int themedColor2 = getThemedColor(Theme.key_chat_attachPhotoBackground);
                    int alpha2 = Color.alpha(themedColor2);
                    this.backgroundPaint.setColor(themedColor2);
                    this.backgroundPaint.setAlpha((int) (alpha2 * f4));
                } else {
                    i11 = i9;
                    i12 = i10;
                    z = false;
                    f7 = 0.0f;
                }
                canvas.drawArc(this.rect, i11, i12, false, this.backgroundPaint);
            }
            if (f3 > f7) {
                float f20 = f4 < 0.5f ? 0.0f : (f4 - 0.5f) / 0.5f;
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
                if (!this.useDefaultCheck && (i8 = this.checkColorKey) >= 0) {
                    this.checkPaint.setColor(getThemedColor(i8));
                } else {
                    this.checkPaint.setColor(getThemedColor(Theme.key_checkboxCheck));
                }
                if (this.alpha < f8 && Theme.isCurrentThemeDark()) {
                    this.checkPaint.setColor(ColorUtils.blendARGB(paint.getColor(), this.checkPaint.getColor(), this.alpha));
                }
                if (this.backgroundType != -1) {
                    float dp2 = AndroidUtilities.dp(this.size) / 2.0f;
                    int save = canvas.save();
                    canvas.translate(i2 - dp2, i - dp2);
                    canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), NotificationCenter.cameraInitied, 31);
                    Paint paint4 = (Paint) this.circlePaintProvider.provide(z);
                    int i22 = this.backgroundType;
                    if (i22 == 12 || i22 == 13) {
                        int alpha3 = paint4.getAlpha();
                        paint4.setAlpha((int) (f3 * 255.0f));
                        canvas.drawCircle(dp2, dp2, f5 * f3, paint4);
                        if (paint4 != paint) {
                            paint4.setAlpha(alpha3);
                        }
                    } else {
                        float dp3 = f5 - AndroidUtilities.dp(0.5f);
                        canvas.drawCircle(dp2, dp2, dp3, paint4);
                        canvas.drawCircle(dp2, dp2, dp3 * (1.0f - f3), eraser);
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
                        forbidPaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                    }
                    forbidPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                    forbidPaint.setColor(getThemedColor(Theme.key_switchTrack));
                    canvas.drawCircle(i2, i, AndroidUtilities.dp(9.0f), forbidPaint);
                } else if (f20 != 0.0f) {
                    if (this.checkedText != null) {
                        if (this.textPaint == null) {
                            i7 = 1;
                            TextPaint textPaint = new TextPaint(1);
                            this.textPaint = textPaint;
                            textPaint.setTypeface(AndroidUtilities.bold());
                        } else {
                            i7 = 1;
                        }
                        int length = this.checkedText.length();
                        if (length == 0 || length == i7 || length == 2) {
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
                        float f21 = i2;
                        canvas.scale(f20, 1.0f, f21, i);
                        String str = this.checkedText;
                        canvas.drawText(str, f21 - (this.textPaint.measureText(str) / 2.0f), AndroidUtilities.dp(f12), this.textPaint);
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
                            float dp4 = AndroidUtilities.dp(f9 * f10) * f20;
                            float dp5 = AndroidUtilities.dp(f10 * 4.0f) * f20;
                            int dp6 = i2 - AndroidUtilities.dp(1.5f);
                            int dp7 = AndroidUtilities.dp(4.0f) + i;
                            float sqrt = (float) Math.sqrt((dp5 * dp5) / 2.0f);
                            float f22 = dp6;
                            float f23 = dp7;
                            this.path.moveTo(f22 - sqrt, f23 - sqrt);
                            this.path.lineTo(f22, f23);
                            float sqrt2 = (float) Math.sqrt((dp4 * dp4) / 2.0f);
                            this.path.lineTo(f22 + sqrt2, f23 - sqrt2);
                            if (this.cutCheck && this.checkScale == 1.0f) {
                                z2 = false;
                            } else {
                                canvas.save();
                                float f24 = this.checkScale;
                                canvas.scale(f24, f24, i2, i);
                                z2 = true;
                            }
                            canvas.drawPath(this.path, this.checkPaint);
                            if (z2) {
                                canvas.restore();
                            }
                        }
                        f9 = 9.0f;
                        float dp42 = AndroidUtilities.dp(f9 * f10) * f20;
                        float dp52 = AndroidUtilities.dp(f10 * 4.0f) * f20;
                        int dp62 = i2 - AndroidUtilities.dp(1.5f);
                        int dp72 = AndroidUtilities.dp(4.0f) + i;
                        float sqrt3 = (float) Math.sqrt((dp52 * dp52) / 2.0f);
                        float f222 = dp62;
                        float f232 = dp72;
                        this.path.moveTo(f222 - sqrt3, f232 - sqrt3);
                        this.path.lineTo(f222, f232);
                        float sqrt22 = (float) Math.sqrt((dp42 * dp42) / 2.0f);
                        this.path.lineTo(f222 + sqrt22, f232 - sqrt22);
                        if (this.cutCheck) {
                        }
                        canvas.save();
                        float f242 = this.checkScale;
                        canvas.scale(f242, f242, i2, i);
                        z2 = true;
                        canvas.drawPath(this.path, this.checkPaint);
                        if (z2) {
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
            if (i13 != 8) {
            }
            canvas.drawCircle(i2, i, f5 - AndroidUtilities.dp(1.5f), this.backgroundPaint);
        }
        paint.setColor(getThemedColor(this.checkColorKey));
        i6 = this.backgroundType;
        if (i6 != -1) {
        }
        z = false;
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
