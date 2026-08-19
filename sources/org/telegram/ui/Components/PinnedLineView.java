package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes5.dex */
public class PinnedLineView extends View {
    float animateFromPosition;
    int animateFromTotal;
    int animateToPosition;
    int animateToTotal;
    boolean animationInProgress;
    float animationProgress;
    ValueAnimator animator;
    private int color;
    Paint fadePaint;
    Paint fadePaint2;
    private int lineHFrom;
    private int lineHTo;
    private boolean needDrawFade;
    private int nextPosition;
    Paint paint;
    RectF rectF;
    boolean replaceInProgress;
    private final Theme.ResourcesProvider resourcesProvider;
    Paint selectedPaint;
    int selectedPosition;
    private float startOffsetFrom;
    private float startOffsetTo;
    int totalCount;

    public PinnedLineView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectedPosition = -1;
        this.totalCount = 0;
        this.rectF = new RectF();
        this.paint = new Paint(1);
        this.selectedPaint = new Paint(1);
        this.nextPosition = -1;
        this.resourcesProvider = resourcesProvider;
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = this.paint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.selectedPaint.setStyle(style);
        this.selectedPaint.setStrokeCap(cap);
        this.fadePaint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.fadePaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        Paint paint3 = this.fadePaint;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.fadePaint2 = new Paint();
        this.fadePaint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        this.fadePaint2.setXfermode(new PorterDuffXfermode(mode));
        updateColors();
    }

    public void updateColors() {
        int themedColor = getThemedColor(Theme.key_chat_topPanelLine);
        this.color = themedColor;
        this.paint.setColor(ColorUtils.setAlphaComponent(themedColor, (int) ((Color.alpha(themedColor) / 255.0f) * 112.0f)));
        this.selectedPaint.setColor(this.color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectPosition(int i) {
        if (this.replaceInProgress) {
            this.nextPosition = i;
            return;
        }
        if (this.animationInProgress) {
            if (this.animateToPosition == i) {
                return;
            }
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.animateFromPosition;
            float f2 = this.animationProgress;
            this.animateFromPosition = (f * (1.0f - f2)) + (this.animateToPosition * f2);
        } else {
            this.animateFromPosition = this.selectedPosition;
        }
        if (i != this.selectedPosition) {
            this.animateToPosition = i;
            this.animationInProgress = true;
            this.animationProgress = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PinnedLineView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PinnedLineView.$r8$lambda$9xfSOnbHj7NCfqnW4w6pW7BJQwM(PinnedLineView.this, valueAnimator2);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.PinnedLineView.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    PinnedLineView pinnedLineView = PinnedLineView.this;
                    pinnedLineView.animationInProgress = false;
                    pinnedLineView.selectedPosition = pinnedLineView.animateToPosition;
                    pinnedLineView.invalidate();
                    if (PinnedLineView.this.nextPosition >= 0) {
                        PinnedLineView pinnedLineView2 = PinnedLineView.this;
                        pinnedLineView2.selectPosition(pinnedLineView2.nextPosition);
                        PinnedLineView.this.nextPosition = -1;
                    }
                }
            });
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.setDuration(220L);
            this.animator.start();
        }
    }

    public static /* synthetic */ void $r8$lambda$9xfSOnbHj7NCfqnW4w6pW7BJQwM(PinnedLineView pinnedLineView, ValueAnimator valueAnimator) {
        pinnedLineView.getClass();
        pinnedLineView.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pinnedLineView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkLayerType() {
        boolean z = (this.replaceInProgress ? Math.max(this.animateFromTotal, this.animateToTotal) : this.totalCount) > 3;
        int i = z ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
        this.needDrawFade = z;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float measuredHeight;
        float f;
        super.onDraw(canvas);
        if (this.selectedPosition < 0 || this.totalCount == 0) {
            return;
        }
        int dp = AndroidUtilities.dp(8.0f);
        if (this.replaceInProgress) {
            float f2 = this.lineHFrom;
            float f3 = this.animationProgress;
            measuredHeight = (f2 * (1.0f - f3)) + (this.lineHTo * f3);
        } else if (this.totalCount == 0) {
            return;
        } else {
            measuredHeight = (getMeasuredHeight() - (dp * 2)) / Math.min(this.totalCount, 3);
        }
        if (measuredHeight == 0.0f) {
            return;
        }
        float dpf2 = AndroidUtilities.dpf2(0.7f);
        if (this.replaceInProgress) {
            float f4 = this.startOffsetFrom;
            float f5 = this.animationProgress;
            f = (f4 * (1.0f - f5)) + (this.startOffsetTo * f5);
        } else {
            if (this.animationInProgress) {
                float f6 = this.animationProgress;
                f = ((this.animateFromPosition - 1.0f) * measuredHeight * (1.0f - f6)) + ((this.animateToPosition - 1) * measuredHeight * f6);
            } else {
                f = (this.selectedPosition - 1) * measuredHeight;
            }
            if (f < 0.0f) {
                f = 0.0f;
            } else {
                float f7 = dp;
                if ((((this.totalCount - 1) * measuredHeight) + f7) - f < (getMeasuredHeight() - dp) - measuredHeight) {
                    f = (f7 + ((this.totalCount - 1) * measuredHeight)) - ((getMeasuredHeight() - dp) - measuredHeight);
                }
            }
        }
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float f8 = dp;
        int max = Math.max(0, (int) (((f8 + f) / measuredHeight) - 1.0f));
        int min = Math.min(max + 6, this.replaceInProgress ? Math.max(this.animateFromTotal, this.animateToTotal) : this.totalCount);
        while (max < min) {
            float f9 = ((max * measuredHeight) + f8) - f;
            float f10 = f9 + measuredHeight;
            if (f10 >= 0.0f && f9 <= getMeasuredHeight()) {
                this.rectF.set(0.0f, f9 + dpf2, getMeasuredWidth(), f10 - dpf2);
                boolean z = this.replaceInProgress;
                if (z && max >= this.animateToTotal) {
                    this.paint.setColor(ColorUtils.setAlphaComponent(this.color, (int) ((Color.alpha(r14) / 255.0f) * 76.0f * (1.0f - this.animationProgress))));
                    canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.paint);
                    this.paint.setColor(ColorUtils.setAlphaComponent(this.color, (int) ((Color.alpha(r11) / 255.0f) * 76.0f)));
                } else if (z && max >= this.animateFromTotal) {
                    this.paint.setColor(ColorUtils.setAlphaComponent(this.color, (int) ((Color.alpha(r11) / 255.0f) * 76.0f * this.animationProgress)));
                    canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.paint);
                    this.paint.setColor(ColorUtils.setAlphaComponent(this.color, (int) ((Color.alpha(r11) / 255.0f) * 76.0f)));
                } else {
                    canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.paint);
                }
            }
            max++;
        }
        if (this.animationInProgress) {
            float f11 = this.animateFromPosition;
            float f12 = this.animationProgress;
            float f13 = (f8 + (((f11 * (1.0f - f12)) + (this.animateToPosition * f12)) * measuredHeight)) - f;
            this.rectF.set(0.0f, f13 + dpf2, getMeasuredWidth(), (f13 + measuredHeight) - dpf2);
            canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.selectedPaint);
        } else {
            float f14 = (f8 + (this.selectedPosition * measuredHeight)) - f;
            this.rectF.set(0.0f, f14 + dpf2, getMeasuredWidth(), (f14 + measuredHeight) - dpf2);
            canvas.drawRoundRect(this.rectF, measuredWidth, measuredWidth, this.selectedPaint);
        }
        if (this.needDrawFade) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.fadePaint);
            canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), this.fadePaint);
            canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.fadePaint2);
        }
    }

    public void set(int i, int i2, boolean z) {
        int i3 = this.selectedPosition;
        if (i3 < 0 || i2 == 0 || this.totalCount == 0) {
            z = false;
        }
        if (!z) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.selectedPosition = i;
            this.totalCount = i2;
            invalidate();
        } else if (this.totalCount != i2 || (Math.abs(i3 - i) > 2 && !this.animationInProgress && !this.replaceInProgress)) {
            ValueAnimator valueAnimator2 = this.animator;
            if (valueAnimator2 != null) {
                this.nextPosition = 0;
                valueAnimator2.cancel();
            }
            int dp = AndroidUtilities.dp(8.0f);
            int i4 = dp * 2;
            this.lineHFrom = (getMeasuredHeight() - i4) / Math.min(this.totalCount, 3);
            this.lineHTo = (getMeasuredHeight() - i4) / Math.min(i2, 3);
            float f = (this.selectedPosition - 1) * this.lineHFrom;
            this.startOffsetFrom = f;
            if (f < 0.0f) {
                this.startOffsetFrom = 0.0f;
            } else {
                float f2 = (((this.totalCount - 1) * r3) + dp) - f;
                int measuredHeight = getMeasuredHeight() - dp;
                int i5 = this.lineHFrom;
                if (f2 < measuredHeight - i5) {
                    this.startOffsetFrom = (((this.totalCount - 1) * i5) + dp) - ((getMeasuredHeight() - dp) - this.lineHFrom);
                }
            }
            float f3 = (i - 1) * this.lineHTo;
            this.startOffsetTo = f3;
            if (f3 < 0.0f) {
                this.startOffsetTo = 0.0f;
            } else {
                int i6 = i2 - 1;
                float f4 = ((r3 * i6) + dp) - f3;
                int measuredHeight2 = getMeasuredHeight() - dp;
                int i7 = this.lineHTo;
                if (f4 < measuredHeight2 - i7) {
                    this.startOffsetTo = ((i6 * i7) + dp) - ((getMeasuredHeight() - dp) - this.lineHTo);
                }
            }
            this.animateFromPosition = this.selectedPosition;
            this.animateToPosition = i;
            this.selectedPosition = i;
            this.animateFromTotal = this.totalCount;
            this.animateToTotal = i2;
            this.totalCount = i2;
            this.replaceInProgress = true;
            this.animationInProgress = true;
            this.animationProgress = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PinnedLineView$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    PinnedLineView.$r8$lambda$azIPy8gfC3yHEp2EwMjAD9kJskk(PinnedLineView.this, valueAnimator3);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.PinnedLineView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    PinnedLineView pinnedLineView = PinnedLineView.this;
                    pinnedLineView.replaceInProgress = false;
                    pinnedLineView.animationInProgress = false;
                    pinnedLineView.invalidate();
                    if (PinnedLineView.this.nextPosition >= 0) {
                        PinnedLineView pinnedLineView2 = PinnedLineView.this;
                        pinnedLineView2.selectPosition(pinnedLineView2.nextPosition);
                        PinnedLineView.this.nextPosition = -1;
                    }
                    PinnedLineView.this.checkLayerType();
                }
            });
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.setDuration(220L);
            this.animator.start();
        } else {
            selectPosition(i);
        }
        checkLayerType();
    }

    public static /* synthetic */ void $r8$lambda$azIPy8gfC3yHEp2EwMjAD9kJskk(PinnedLineView pinnedLineView, ValueAnimator valueAnimator) {
        pinnedLineView.getClass();
        pinnedLineView.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pinnedLineView.invalidate();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
