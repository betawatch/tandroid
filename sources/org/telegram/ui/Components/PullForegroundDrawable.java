package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.TopicsFragment;

/* loaded from: classes5.dex */
public abstract class PullForegroundDrawable {
    private ValueAnimator accentRevalAnimatorIn;
    private ValueAnimator accentRevalAnimatorOut;
    private float accentRevalProgress;
    private float accentRevalProgressOut;
    private boolean animateOut;
    private boolean animateToColorize;
    private boolean animateToEndText;
    private boolean animateToTextIn;
    private boolean arrowAnimateTo;
    private final ArrowDrawable arrowDrawable;
    private ValueAnimator arrowRotateAnimator;
    private float arrowRotateProgress;
    private boolean bounceIn;
    private float bounceProgress;
    private View cell;
    private final Path circleClipPath;
    private Drawable generalTopicDrawable;
    private boolean isOut;
    private int lastWidth;
    private RecyclerListView listView;
    private AnimatorSet outAnimator;
    public float outCx;
    public float outCy;
    public float outImageSize;
    public float outOverScroll;
    public float outProgress;
    public float outRadius;
    private float pullProgress;
    private StaticLayout pullTooltipLayout;
    private float pullTooltipLayoutLeft;
    private float pullTooltipLayoutScale;
    private float pullTooltipLayoutWidth;
    private final CharSequence pullTooltipText;
    private StaticLayout releaseTooltipLayout;
    private float releaseTooltipLayoutLeft;
    private float releaseTooltipLayoutScale;
    private float releaseTooltipLayoutWidth;
    private final CharSequence releaseTooltipText;
    public int scrollDy;
    private float textInProgress;
    Runnable textInRunnable;
    private ValueAnimator.AnimatorUpdateListener textInUpdateListener;
    private ValueAnimator textIntAnimator;
    private float textSwappingProgress;
    private ValueAnimator.AnimatorUpdateListener textSwappingUpdateListener;
    private ValueAnimator textSwipingAnimator;
    private final TextPaint tooltipTextPaint;
    private float touchSlop;
    boolean wasSendCallback;
    private boolean willDraw;
    private int backgroundColorKey = Theme.key_chats_archivePullDownBackground;
    private int backgroundActiveColorKey = Theme.key_chats_archivePullDownBackgroundActive;
    private int avatarBackgroundColorKey = Theme.key_avatar_backgroundArchivedHidden;
    private boolean changeAvatarColor = true;
    private final Paint paintSecondary = new Paint(1);
    private final Paint paintWhite = new Paint(1);
    private final Paint paintBackgroundAccent = new Paint(1);
    private final Paint backgroundPaint = new Paint();
    private final RectF rectF = new RectF();

    protected abstract float getViewOffset();

    public static /* synthetic */ void $r8$lambda$8_P5dJC-_jsZDGpbWLwW-niYCFk(PullForegroundDrawable pullForegroundDrawable, ValueAnimator valueAnimator) {
        pullForegroundDrawable.getClass();
        pullForegroundDrawable.textSwappingProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = pullForegroundDrawable.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ void $r8$lambda$627MkSRbyK3KACeUBHwiClA89Y0(PullForegroundDrawable pullForegroundDrawable, ValueAnimator valueAnimator) {
        pullForegroundDrawable.getClass();
        pullForegroundDrawable.textInProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = pullForegroundDrawable.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public PullForegroundDrawable(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.tooltipTextPaint = textPaint;
        this.arrowDrawable = new ArrowDrawable();
        this.circleClipPath = new Path();
        this.textSwappingProgress = 1.0f;
        this.arrowRotateProgress = 1.0f;
        this.accentRevalProgress = 1.0f;
        this.accentRevalProgressOut = 1.0f;
        this.pullTooltipLayoutScale = 1.0f;
        this.releaseTooltipLayoutScale = 1.0f;
        this.textSwappingUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PullForegroundDrawable.$r8$lambda$8_P5dJC-_jsZDGpbWLwW-niYCFk(PullForegroundDrawable.this, valueAnimator);
            }
        };
        this.textInUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PullForegroundDrawable.$r8$lambda$627MkSRbyK3KACeUBHwiClA89Y0(PullForegroundDrawable.this, valueAnimator);
            }
        };
        this.textInRunnable = new Runnable() { // from class: org.telegram.ui.Components.PullForegroundDrawable.1
            @Override // java.lang.Runnable
            public void run() {
                PullForegroundDrawable.this.animateToTextIn = true;
                if (PullForegroundDrawable.this.textIntAnimator != null) {
                    PullForegroundDrawable.this.textIntAnimator.cancel();
                }
                PullForegroundDrawable.this.textInProgress = 0.0f;
                PullForegroundDrawable.this.textIntAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                PullForegroundDrawable.this.textIntAnimator.addUpdateListener(PullForegroundDrawable.this.textInUpdateListener);
                PullForegroundDrawable.this.textIntAnimator.setInterpolator(new LinearInterpolator());
                PullForegroundDrawable.this.textIntAnimator.setDuration(150L);
                PullForegroundDrawable.this.textIntAnimator.start();
            }
        };
        this.wasSendCallback = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.pullTooltipText = charSequence;
        this.releaseTooltipText = charSequence2;
        try {
            this.generalTopicDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    private void checkTextLayouts(int i) {
        if (i != this.lastWidth) {
            this.pullTooltipLayout = new StaticLayout(this.pullTooltipText, this.tooltipTextPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f = 0.0f;
            for (int i2 = 0; i2 < this.pullTooltipLayout.getLineCount(); i2++) {
                f = Math.max(f, this.pullTooltipLayout.getLineWidth(i2));
            }
            float f2 = i;
            this.pullTooltipLayoutScale = Math.min(1.0f, f2 / f);
            int ceil = (int) Math.ceil(f);
            if (this.pullTooltipLayoutScale < 0.8f) {
                this.pullTooltipLayoutScale = 0.8f;
                ceil = HintView2.cutInFancyHalf(this.pullTooltipText, this.tooltipTextPaint);
            }
            int i3 = ceil;
            this.pullTooltipLayout = new StaticLayout(this.pullTooltipText, this.tooltipTextPaint, i3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.pullTooltipLayoutLeft = i3;
            this.pullTooltipLayoutWidth = 0.0f;
            for (int i4 = 0; i4 < this.pullTooltipLayout.getLineCount(); i4++) {
                this.pullTooltipLayoutLeft = Math.min(this.pullTooltipLayoutLeft, this.pullTooltipLayout.getLineLeft(i4));
                this.pullTooltipLayoutWidth = Math.max(this.pullTooltipLayoutWidth, this.pullTooltipLayout.getLineWidth(i4));
            }
            this.releaseTooltipLayout = new StaticLayout(this.releaseTooltipText, this.tooltipTextPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f3 = 0.0f;
            for (int i5 = 0; i5 < this.releaseTooltipLayout.getLineCount(); i5++) {
                f3 = Math.max(f3, this.releaseTooltipLayout.getLineWidth(i5));
            }
            this.releaseTooltipLayoutScale = Math.min(1.0f, f2 / f3);
            int ceil2 = (int) Math.ceil(f3);
            if (this.releaseTooltipLayoutScale < 0.8f) {
                this.releaseTooltipLayoutScale = 0.8f;
                ceil2 = HintView2.cutInFancyHalf(this.releaseTooltipText, this.tooltipTextPaint);
            }
            int i6 = ceil2;
            this.releaseTooltipLayout = new StaticLayout(this.releaseTooltipText, this.tooltipTextPaint, i6, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.releaseTooltipLayoutLeft = i6;
            this.releaseTooltipLayoutWidth = 0.0f;
            for (int i7 = 0; i7 < this.releaseTooltipLayout.getLineCount(); i7++) {
                this.releaseTooltipLayoutLeft = Math.min(this.releaseTooltipLayoutLeft, this.releaseTooltipLayout.getLineLeft(i7));
                this.releaseTooltipLayoutWidth = Math.max(this.releaseTooltipLayoutWidth, this.releaseTooltipLayout.getLineWidth(i7));
            }
            this.lastWidth = i;
        }
    }

    public static int getMaxOverscroll() {
        return AndroidUtilities.dp(72.0f);
    }

    public void setCell(View view) {
        this.cell = view;
        updateColors();
    }

    public void updateColors() {
        int color = Theme.getColor(this.backgroundColorKey);
        this.tooltipTextPaint.setColor(-1);
        this.paintWhite.setColor(-1);
        this.paintSecondary.setColor(ColorUtils.setAlphaComponent(-1, 100));
        this.backgroundPaint.setColor(color);
        this.arrowDrawable.setColor(color);
        this.paintBackgroundAccent.setColor(Theme.getColor(this.avatarBackgroundColorKey));
    }

    public void setListView(RecyclerListView recyclerListView) {
        this.listView = recyclerListView;
    }

    public void drawOverScroll(Canvas canvas) {
        draw(canvas, true);
    }

    public void draw(Canvas canvas) {
        draw(canvas, false);
    }

    public void draw(Canvas canvas, boolean z) {
        View view;
        int i;
        float f;
        float f2;
        boolean z2;
        float f3;
        float f4;
        boolean z3;
        int i2;
        int i3;
        float f5;
        if (!this.willDraw || this.isOut || (view = this.cell) == null || this.listView == null) {
            return;
        }
        boolean z4 = view instanceof TopicsFragment.TopicDialogCell;
        int dp = AndroidUtilities.dp(z4 ? 15.0f : 28.0f);
        int dp2 = AndroidUtilities.dp(8.0f);
        int dp3 = AndroidUtilities.dp(9.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        int viewOffset = (int) getViewOffset();
        int height = (int) (this.cell.getHeight() * getPullProgress());
        float f6 = this.bounceIn ? (this.bounceProgress * 0.07f) - 0.05f : this.bounceProgress * 0.02f;
        checkTextLayouts((this.cell.getWidth() - (dp * 4)) - AndroidUtilities.dp(16.0f));
        updateTextProgress(getPullProgress());
        float f7 = this.outProgress * 2.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = this.outCx;
        float f9 = this.outCy;
        if (z) {
            f9 += viewOffset;
        }
        float f10 = f9;
        int i4 = dp + dp3;
        int measuredHeight = (this.cell.getMeasuredHeight() - dp2) - dp3;
        if (z) {
            measuredHeight += viewOffset;
        }
        int i5 = dp4 + (dp2 * 2);
        float f11 = height > i5 ? 1.0f : height / i5;
        canvas.save();
        if (z) {
            i = viewOffset;
            f = f7;
            canvas.clipRect(0, 0, this.listView.getMeasuredWidth(), i + 1);
        } else {
            i = viewOffset;
            f = f7;
        }
        if (this.outProgress == 0.0f) {
            if (this.accentRevalProgress != 1.0f && this.accentRevalProgressOut != 1.0f) {
                canvas.drawPaint(this.backgroundPaint);
            }
            z2 = z4;
            f3 = f6;
            f2 = 0.0f;
        } else {
            float f12 = this.outRadius;
            f2 = 0.0f;
            float width = f12 + (f12 * f6) + ((this.cell.getWidth() - this.outRadius) * (1.0f - this.outProgress));
            if (this.accentRevalProgress != 1.0f && this.accentRevalProgressOut != 1.0f) {
                canvas.drawCircle(f8, f10, width, this.backgroundPaint);
            }
            this.circleClipPath.reset();
            z2 = z4;
            f3 = f6;
            this.rectF.set(f8 - width, f10 - width, f8 + width, f10 + width);
            this.circleClipPath.addOval(this.rectF, Path.Direction.CW);
            canvas.clipPath(this.circleClipPath);
        }
        if (this.animateToColorize) {
            if (this.accentRevalProgressOut > this.accentRevalProgress) {
                canvas.save();
                float f13 = i4;
                float f14 = this.outProgress;
                float f15 = measuredHeight;
                canvas.translate((f8 - f13) * f14, (f10 - f15) * f14);
                canvas.drawCircle(f13, f15, this.cell.getWidth() * this.accentRevalProgressOut, this.backgroundPaint);
                canvas.restore();
            }
            if (this.accentRevalProgress > f2) {
                canvas.save();
                float f16 = i4;
                float f17 = this.outProgress;
                float f18 = measuredHeight;
                canvas.translate((f8 - f16) * f17, (f10 - f18) * f17);
                canvas.drawCircle(f16, f18, this.cell.getWidth() * this.accentRevalProgress, this.paintBackgroundAccent);
                canvas.restore();
            }
        } else {
            if (this.accentRevalProgress > this.accentRevalProgressOut) {
                canvas.save();
                float f19 = i4;
                float f20 = this.outProgress;
                float f21 = measuredHeight;
                canvas.translate((f8 - f19) * f20, (f10 - f21) * f20);
                canvas.drawCircle(f19, f21, this.cell.getWidth() * this.accentRevalProgress, this.paintBackgroundAccent);
                canvas.restore();
            }
            if (this.accentRevalProgressOut > f2) {
                canvas.save();
                float f22 = i4;
                float f23 = this.outProgress;
                float f24 = measuredHeight;
                canvas.translate((f8 - f22) * f23, (f10 - f24) * f23);
                canvas.drawCircle(f22, f24, this.cell.getWidth() * this.accentRevalProgressOut, this.backgroundPaint);
                canvas.restore();
            }
        }
        if (height > i5) {
            this.paintSecondary.setAlpha((int) ((1.0f - f) * 0.4f * f11 * 255.0f));
            if (z) {
                this.rectF.set(dp, dp2, dp + dp4, dp2 + i + dp3);
            } else {
                this.rectF.set(dp, ((this.cell.getHeight() - height) + dp2) - i, dp + dp4, this.cell.getHeight() - dp2);
            }
            float f25 = dp3;
            canvas.drawRoundRect(this.rectF, f25, f25, this.paintSecondary);
        }
        if (z) {
            canvas.restore();
            return;
        }
        if (z2) {
            measuredHeight = (int) (measuredHeight - ((this.cell.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.outProgress));
        }
        float f26 = this.outProgress;
        if (f26 == f2 || z2) {
            this.paintWhite.setAlpha((int) (f11 * 255.0f * (1.0f - f26)));
            float f27 = i4;
            float f28 = measuredHeight;
            canvas.drawCircle(f27, f28, dp3, this.paintWhite);
            int intrinsicHeight = this.arrowDrawable.getIntrinsicHeight();
            f4 = 255.0f;
            int intrinsicWidth = this.arrowDrawable.getIntrinsicWidth() >> 1;
            z3 = true;
            int i6 = intrinsicHeight >> 1;
            i2 = dp;
            this.arrowDrawable.setBounds(i4 - intrinsicWidth, measuredHeight - i6, intrinsicWidth + i4, measuredHeight + i6);
            float f29 = 1.0f - this.arrowRotateProgress;
            if (f29 < f2) {
                f29 = 0.0f;
            }
            float f30 = 1.0f - f29;
            canvas.save();
            canvas.rotate(180.0f * f30, f27, f28);
            canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f30);
            this.arrowDrawable.setColor(this.animateToColorize ? this.paintBackgroundAccent.getColor() : Theme.getColor(this.backgroundColorKey));
            this.arrowDrawable.setAlpha((int) ((1.0f - this.outProgress) * 255.0f));
            this.arrowDrawable.draw(canvas);
            canvas.restore();
        } else {
            i2 = dp;
            z3 = true;
            f4 = 255.0f;
        }
        if (getPullProgress() > 0.0f) {
            textIn();
        }
        float height2 = (this.cell.getHeight() - (i5 / 2.0f)) + AndroidUtilities.dp(6.0f);
        float width2 = (this.cell.getWidth() + (z2 ? i2 * 2 : 0)) / 2.0f;
        if (this.pullTooltipLayout != null) {
            float f31 = this.textSwappingProgress;
            if (f31 > 0.0f && f31 < 1.0f) {
                canvas.save();
                float f32 = (this.textSwappingProgress * 0.2f) + 0.8f;
                canvas.scale(f32, f32, width2, (AndroidUtilities.dp(16.0f) * (1.0f - this.textSwappingProgress)) + height2);
            }
            i3 = i4;
            f5 = 0.0f;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.cell.getMeasuredWidth(), this.cell.getMeasuredHeight(), (int) (this.textSwappingProgress * f4 * f11 * this.textInProgress), 31);
            canvas.translate((width2 - this.pullTooltipLayoutLeft) - (this.pullTooltipLayoutWidth / 2.0f), ((AndroidUtilities.dp(8.0f) * (1.0f - this.textSwappingProgress)) + height2) - this.pullTooltipLayout.getHeight());
            float f33 = this.pullTooltipLayoutScale;
            canvas.scale(f33, f33, this.pullTooltipLayoutLeft + (this.pullTooltipLayoutWidth / 2.0f), this.pullTooltipLayout.getHeight());
            this.pullTooltipLayout.draw(canvas);
            canvas.restore();
            float f34 = this.textSwappingProgress;
            if (f34 > 0.0f && f34 < 1.0f) {
                canvas.restore();
            }
        } else {
            i3 = i4;
            f5 = 0.0f;
        }
        if (this.releaseTooltipLayout != null) {
            float f35 = this.textSwappingProgress;
            if (f35 > f5 && f35 < 1.0f) {
                canvas.save();
                float f36 = ((1.0f - this.textSwappingProgress) * 0.1f) + 0.9f;
                canvas.scale(f36, f36, width2, height2 - (AndroidUtilities.dp(8.0f) * this.textSwappingProgress));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.cell.getMeasuredWidth(), this.cell.getMeasuredHeight(), (int) ((1.0f - this.textSwappingProgress) * f4 * f11 * this.textInProgress), 31);
            canvas.translate((width2 - this.releaseTooltipLayoutLeft) - (this.releaseTooltipLayoutWidth / 2.0f), (height2 + (AndroidUtilities.dp(8.0f) * this.textSwappingProgress)) - this.releaseTooltipLayout.getHeight());
            float f37 = this.releaseTooltipLayoutScale;
            canvas.scale(f37, f37, this.releaseTooltipLayoutLeft + (this.releaseTooltipLayoutWidth / 2.0f), this.releaseTooltipLayout.getHeight());
            this.releaseTooltipLayout.draw(canvas);
            canvas.restore();
            float f38 = this.textSwappingProgress;
            if (f38 > f5 && f38 < 1.0f) {
                canvas.restore();
            }
        }
        canvas.restore();
        if (z2 || !this.changeAvatarColor || this.outProgress <= f5) {
            return;
        }
        canvas.save();
        int intrinsicWidth2 = Theme.dialogs_archiveAvatarDrawable.getIntrinsicWidth();
        int height3 = (this.cell.getHeight() - dp2) - dp3;
        float f39 = intrinsicWidth2;
        float dp5 = AndroidUtilities.dp(24.0f) / f39;
        float f40 = this.outProgress;
        float f41 = dp5 + ((1.0f - dp5) * f40) + f3;
        float f42 = 1.0f - f40;
        canvas.translate((i3 - f8) * f42, (height3 - f10) * f42);
        canvas.scale(f41, f41, f8, f10);
        Theme.dialogs_archiveAvatarDrawable.setProgress(f5);
        if (!Theme.dialogs_archiveAvatarDrawableRecolored) {
            Theme.dialogs_archiveAvatarDrawable.beginApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow1", Theme.getNonAnimatedColor(this.avatarBackgroundColorKey));
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow2", Theme.getNonAnimatedColor(this.avatarBackgroundColorKey));
            Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawableRecolored = z3;
        }
        float f43 = f39 / 2.0f;
        Theme.dialogs_archiveAvatarDrawable.setBounds((int) (f8 - f43), (int) (f10 - f43), (int) (f8 + f43), (int) (f10 + f43));
        Theme.dialogs_archiveAvatarDrawable.draw(canvas);
        canvas.restore();
    }

    private void updateTextProgress(float f) {
        boolean z = f > 0.85f;
        if (this.animateToEndText != z) {
            this.animateToEndText = z;
            if (this.textInProgress == 0.0f) {
                ValueAnimator valueAnimator = this.textSwipingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.textSwappingProgress = z ? 0.0f : 1.0f;
            } else {
                ValueAnimator valueAnimator2 = this.textSwipingAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.textSwappingProgress, z ? 0.0f : 1.0f);
                this.textSwipingAnimator = ofFloat;
                ofFloat.addUpdateListener(this.textSwappingUpdateListener);
                this.textSwipingAnimator.setInterpolator(new LinearInterpolator());
                this.textSwipingAnimator.setDuration(170L);
                this.textSwipingAnimator.start();
            }
        }
        if (z != this.arrowAnimateTo) {
            this.arrowAnimateTo = z;
            ValueAnimator valueAnimator3 = this.arrowRotateAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.arrowRotateProgress, this.arrowAnimateTo ? 0.0f : 1.0f);
            this.arrowRotateAnimator = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    PullForegroundDrawable.$r8$lambda$wPY0-M7eNmXw00Zu8dxTKPSpsuc(PullForegroundDrawable.this, valueAnimator4);
                }
            });
            this.arrowRotateAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.arrowRotateAnimator.setDuration(250L);
            this.arrowRotateAnimator.start();
        }
    }

    public static /* synthetic */ void $r8$lambda$wPY0-M7eNmXw00Zu8dxTKPSpsuc(PullForegroundDrawable pullForegroundDrawable, ValueAnimator valueAnimator) {
        pullForegroundDrawable.getClass();
        pullForegroundDrawable.arrowRotateProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = pullForegroundDrawable.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void colorize(boolean z) {
        if (this.animateToColorize != z) {
            this.animateToColorize = z;
            if (z) {
                ValueAnimator valueAnimator = this.accentRevalAnimatorIn;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.accentRevalAnimatorIn = null;
                }
                this.accentRevalProgress = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.accentRevalAnimatorIn = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        PullForegroundDrawable.$r8$lambda$ubxBDYNd-cRQCWbjeEeqlOs4jEs(PullForegroundDrawable.this, valueAnimator2);
                    }
                });
                this.accentRevalAnimatorIn.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.accentRevalAnimatorIn.setDuration(230L);
                this.accentRevalAnimatorIn.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.accentRevalAnimatorOut;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.accentRevalAnimatorOut = null;
            }
            this.accentRevalProgressOut = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.accentRevalAnimatorOut = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    PullForegroundDrawable.$r8$lambda$LAXB29WfJ53_RLfTL_RieN8Kbgs(PullForegroundDrawable.this, valueAnimator3);
                }
            });
            this.accentRevalAnimatorOut.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.accentRevalAnimatorOut.setDuration(230L);
            this.accentRevalAnimatorOut.start();
        }
    }

    public static /* synthetic */ void $r8$lambda$ubxBDYNd-cRQCWbjeEeqlOs4jEs(PullForegroundDrawable pullForegroundDrawable, ValueAnimator valueAnimator) {
        pullForegroundDrawable.getClass();
        pullForegroundDrawable.accentRevalProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = pullForegroundDrawable.cell;
        if (view != null) {
            view.invalidate();
        }
        RecyclerListView recyclerListView = pullForegroundDrawable.listView;
        if (recyclerListView != null) {
            recyclerListView.invalidate();
        }
    }

    public static /* synthetic */ void $r8$lambda$LAXB29WfJ53_RLfTL_RieN8Kbgs(PullForegroundDrawable pullForegroundDrawable, ValueAnimator valueAnimator) {
        pullForegroundDrawable.getClass();
        pullForegroundDrawable.accentRevalProgressOut = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = pullForegroundDrawable.cell;
        if (view != null) {
            view.invalidate();
        }
        RecyclerListView recyclerListView = pullForegroundDrawable.listView;
        if (recyclerListView != null) {
            recyclerListView.invalidate();
        }
    }

    private void textIn() {
        if (this.animateToTextIn) {
            return;
        }
        if (Math.abs(this.scrollDy) < this.touchSlop * 0.5f) {
            if (this.wasSendCallback) {
                return;
            }
            this.textInProgress = 1.0f;
            this.animateToTextIn = true;
            return;
        }
        this.wasSendCallback = true;
        this.cell.removeCallbacks(this.textInRunnable);
        this.cell.postDelayed(this.textInRunnable, 200L);
    }

    public void startOutAnimation() {
        if (this.animateOut || this.listView == null) {
            return;
        }
        AnimatorSet animatorSet = this.outAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.outAnimator.cancel();
        }
        this.animateOut = true;
        this.bounceIn = true;
        this.bounceProgress = 0.0f;
        this.outOverScroll = this.listView.getTranslationY() / AndroidUtilities.dp(100.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PullForegroundDrawable.$r8$lambda$dZdOnHy94UndV-QwFkBKkCeo9co(PullForegroundDrawable.this, valueAnimator);
            }
        });
        ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        ofFloat.setDuration(250L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PullForegroundDrawable.$r8$lambda$kjusHLNMhp3ArwJ6_QjenuiFjIM(PullForegroundDrawable.this, valueAnimator);
            }
        });
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
        ofFloat2.setInterpolator(cubicBezierInterpolator);
        ofFloat2.setDuration(150L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PullForegroundDrawable.$r8$lambda$5YJBXAxzwnvZOTMKdySZJIxml8Q(PullForegroundDrawable.this, valueAnimator);
            }
        });
        ofFloat3.setInterpolator(cubicBezierInterpolator);
        ofFloat3.setDuration(135L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.outAnimator = animatorSet2;
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.PullForegroundDrawable.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PullForegroundDrawable.this.doNotShow();
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(ofFloat2, ofFloat3);
        animatorSet3.setStartDelay(180L);
        this.outAnimator.playTogether(ofFloat, animatorSet3);
        this.outAnimator.start();
    }

    public static /* synthetic */ void $r8$lambda$dZdOnHy94UndV-QwFkBKkCeo9co(PullForegroundDrawable pullForegroundDrawable, ValueAnimator valueAnimator) {
        pullForegroundDrawable.getClass();
        pullForegroundDrawable.setOutProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        View view = pullForegroundDrawable.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ void $r8$lambda$kjusHLNMhp3ArwJ6_QjenuiFjIM(PullForegroundDrawable pullForegroundDrawable, ValueAnimator valueAnimator) {
        pullForegroundDrawable.getClass();
        pullForegroundDrawable.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pullForegroundDrawable.bounceIn = true;
        View view = pullForegroundDrawable.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ void $r8$lambda$5YJBXAxzwnvZOTMKdySZJIxml8Q(PullForegroundDrawable pullForegroundDrawable, ValueAnimator valueAnimator) {
        pullForegroundDrawable.getClass();
        pullForegroundDrawable.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pullForegroundDrawable.bounceIn = false;
        View view = pullForegroundDrawable.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    private void setOutProgress(float f) {
        this.outProgress = f;
        int blendARGB = ColorUtils.blendARGB(Theme.getNonAnimatedColor(this.avatarBackgroundColorKey), Theme.getNonAnimatedColor(this.backgroundActiveColorKey), 1.0f - this.outProgress);
        this.paintBackgroundAccent.setColor(blendARGB);
        if (this.changeAvatarColor && isDraw()) {
            Theme.dialogs_archiveAvatarDrawable.beginApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow1", blendARGB);
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow2", blendARGB);
            Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawableRecolored = true;
        }
    }

    public void doNotShow() {
        ValueAnimator valueAnimator = this.textSwipingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.textIntAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        View view = this.cell;
        if (view != null) {
            view.removeCallbacks(this.textInRunnable);
        }
        ValueAnimator valueAnimator3 = this.accentRevalAnimatorIn;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.textSwappingProgress = 1.0f;
        this.arrowRotateProgress = 1.0f;
        this.animateToEndText = false;
        this.arrowAnimateTo = false;
        this.animateToTextIn = false;
        this.wasSendCallback = false;
        this.textInProgress = 0.0f;
        this.isOut = true;
        setOutProgress(1.0f);
        this.animateToColorize = false;
        this.accentRevalProgress = 0.0f;
    }

    public void showHidden() {
        AnimatorSet animatorSet = this.outAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.outAnimator.cancel();
        }
        setOutProgress(0.0f);
        this.isOut = false;
        this.animateOut = false;
    }

    public boolean isDraw() {
        return this.willDraw && !this.isOut;
    }

    public void setWillDraw(boolean z) {
        this.willDraw = z;
    }

    public void resetText() {
        ValueAnimator valueAnimator = this.textIntAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.cell;
        if (view != null) {
            view.removeCallbacks(this.textInRunnable);
        }
        this.textInProgress = 0.0f;
        this.animateToTextIn = false;
        this.wasSendCallback = false;
    }

    public float getPullProgress() {
        return this.pullProgress;
    }

    public void setPullProgress(float f) {
        if (this.pullProgress != f) {
            this.pullProgress = f;
            View view = this.cell;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    private class ArrowDrawable extends Drawable {
        private float lastDensity;
        private Path path = new Path();
        private Paint paint = new Paint(1);

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public ArrowDrawable() {
            updatePath();
        }

        private void updatePath() {
            int dp = AndroidUtilities.dp(18.0f);
            this.path.reset();
            float f = dp >> 1;
            this.path.moveTo(f, AndroidUtilities.dpf2(4.98f));
            this.path.lineTo(AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
            this.path.lineTo(dp - AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
            this.path.lineTo(f, AndroidUtilities.dpf2(4.98f));
            this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
            this.paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            this.lastDensity = AndroidUtilities.density;
        }

        public void setColor(int i) {
            this.paint.setColor(i);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.lastDensity != AndroidUtilities.density) {
                updatePath();
            }
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            canvas.drawPath(this.path, this.paint);
            canvas.drawRect(AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dp(18.0f) - AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(11.1f), this.paint);
            canvas.restore();
        }
    }
}
