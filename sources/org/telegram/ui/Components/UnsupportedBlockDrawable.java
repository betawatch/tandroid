package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes5.dex */
public class UnsupportedBlockDrawable extends Drawable {
    private final Drawable bubbleDrawable;
    private final Paint buttonBackgroundPaint;
    private final ButtonBounce buttonBounce;
    private final int buttonGap;
    private final int buttonHeight;
    private StaticLayout buttonLayout;
    private final int buttonPaddingH;
    private final int buttonRadius;
    private final RectF buttonRect;
    private CharSequence buttonText;
    private final TextPaint buttonTextPaint;
    private final ClickHelper clickHelper;
    private int measuredHeight;
    private int measuredWidth;
    private Runnable onClickListener;
    private final int paddingV;
    private final Drawable planeDrawable;
    private Theme.ResourcesProvider resourcesProvider;
    private CharSequence subtitle;
    private StaticLayout subtitleLayout;
    private final TextPaint subtitlePaint;
    private final int textLeft;
    private CharSequence title;
    private StaticLayout titleLayout;
    private final TextPaint titlePaint;
    private final int titleSubtitleGap;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean onTouchEvent(View view, MotionEvent motionEvent) {
        return this.clickHelper.onTouchEvent(view, motionEvent);
    }

    public UnsupportedBlockDrawable(Theme.ResourcesProvider resourcesProvider) {
        TextPaint textPaint = new TextPaint(1);
        this.titlePaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.subtitlePaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.buttonTextPaint = textPaint3;
        this.buttonBackgroundPaint = new Paint(1);
        this.buttonRect = new RectF();
        ButtonBounce buttonBounce = new ButtonBounce(null);
        this.buttonBounce = buttonBounce;
        this.clickHelper = new ClickHelper(new ClickHelper.Delegate() { // from class: org.telegram.ui.Components.UnsupportedBlockDrawable.1
            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ boolean forceEnableVibration() {
                return ClickHelper.Delegate.-CC.$default$forceEnableVibration(this);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 long, still in use, count: 1, list:
                  (r0v0 long) from 0x0004: RETURN (r0v0 long)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:452)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ long getLongPressDuration() {
                /*
                    r2 = this;
                    long r0 = me.vkryl.android.util.ClickHelper.Delegate.-CC.$default$getLongPressDuration(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UnsupportedBlockDrawable.1.getLongPressDuration():long");
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f, float f2) {
                return ClickHelper.Delegate.-CC.$default$ignoreHapticFeedbackSettings(this, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ boolean needCancelTouchBySlopMove() {
                return ClickHelper.Delegate.-CC.$default$needCancelTouchBySlopMove(this);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ boolean needLongPress(float f, float f2) {
                return ClickHelper.Delegate.-CC.$default$needLongPress(this, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ void onClickTouchMove(View view, float f, float f2) {
                ClickHelper.Delegate.-CC.$default$onClickTouchMove(this, view, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ void onLongPressCancelled(View view, float f, float f2) {
                ClickHelper.Delegate.-CC.$default$onLongPressCancelled(this, view, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ void onLongPressFinish(View view, float f, float f2) {
                ClickHelper.Delegate.-CC.$default$onLongPressFinish(this, view, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
                ClickHelper.Delegate.-CC.$default$onLongPressMove(this, view, motionEvent, f, f2, f3, f4);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ boolean onLongPressRequestedAt(View view, float f, float f2) {
                return ClickHelper.Delegate.-CC.$default$onLongPressRequestedAt(this, view, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public boolean needClickAt(View view, float f, float f2) {
                int dp = AndroidUtilities.dp(9.0f);
                float f3 = -dp;
                UnsupportedBlockDrawable.this.buttonRect.inset(f3, f3);
                boolean contains = UnsupportedBlockDrawable.this.buttonRect.contains(f, f2);
                float f4 = dp;
                UnsupportedBlockDrawable.this.buttonRect.inset(f4, f4);
                return contains;
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public void onClickTouchDown(View view, float f, float f2) {
                UnsupportedBlockDrawable.this.buttonBounce.setPressed(true);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public void onClickTouchUp(View view, float f, float f2) {
                UnsupportedBlockDrawable.this.buttonBounce.setPressed(false);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public void onClickAt(View view, float f, float f2) {
                if (UnsupportedBlockDrawable.this.onClickListener != null) {
                    UnsupportedBlockDrawable.this.onClickListener.run();
                }
            }
        });
        this.textLeft = AndroidUtilities.dp(62.33f);
        this.buttonPaddingH = AndroidUtilities.dp(12.0f);
        this.buttonHeight = AndroidUtilities.dp(30.0f);
        this.buttonRadius = AndroidUtilities.dp(15.0f);
        this.paddingV = AndroidUtilities.dp(7.0f);
        this.buttonGap = AndroidUtilities.dp(12.0f);
        this.titleSubtitleGap = AndroidUtilities.dp(2.0f);
        this.resourcesProvider = resourcesProvider;
        this.planeDrawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.bubbleDrawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        buttonBounce.setAdditionalInvalidate(new Runnable() { // from class: org.telegram.ui.Components.UnsupportedBlockDrawable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnsupportedBlockDrawable.this.invalidateSelf();
            }
        });
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        updateColors();
    }

    public void updateColors() {
        int color = Theme.getColor(Theme.key_chat_serviceText);
        Drawable drawable = this.planeDrawable;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.bubbleDrawable.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(-16777216, 0.11f), mode));
        this.titlePaint.setColor(color);
        this.subtitlePaint.setColor(ColorUtils.setAlphaComponent(color, NotificationCenter.configLoaded));
        this.buttonTextPaint.setColor(color);
        this.buttonBackgroundPaint.setColor(Theme.multAlpha(-16777216, 0.11f));
    }

    public void setOnClickListener(Runnable runnable) {
        this.onClickListener = runnable;
    }

    public void setTitle(CharSequence charSequence) {
        this.title = charSequence;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitle = charSequence;
    }

    public void setButtonText(CharSequence charSequence) {
        this.buttonText = charSequence;
    }

    public int measure(int i) {
        this.measuredWidth = i;
        TextPaint textPaint = this.buttonTextPaint;
        CharSequence charSequence = this.buttonText;
        float measureText = textPaint.measureText(charSequence, 0, charSequence.length());
        int i2 = (int) ((this.buttonPaddingH * 2) + measureText);
        CharSequence charSequence2 = this.buttonText;
        TextPaint textPaint2 = this.buttonTextPaint;
        int ceil = (int) Math.ceil(measureText);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.buttonLayout = new StaticLayout(charSequence2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
        int dp = (((i - this.textLeft) - i2) - this.buttonGap) - AndroidUtilities.dp(11.0f);
        this.titleLayout = new StaticLayout(TextUtils.ellipsize(this.title, this.titlePaint, dp, TextUtils.TruncateAt.END), this.titlePaint, dp, alignment, 1.0f, 0.0f, false);
        this.subtitleLayout = new StaticLayout(this.subtitle, this.subtitlePaint, dp, alignment, 1.0f, 0.0f, false);
        int max = Math.max(this.titleLayout.getHeight() + this.titleSubtitleGap + this.subtitleLayout.getHeight(), this.buttonHeight) + (this.paddingV * 2);
        this.measuredHeight = max;
        setBounds(0, 0, this.measuredWidth, max);
        return this.measuredHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.titleLayout == null || this.subtitleLayout == null || this.buttonLayout == null) {
            return;
        }
        int i = getBounds().left;
        int i2 = getBounds().right;
        int centerY = getBounds().centerY();
        int height = centerY - (((this.titleLayout.getHeight() + this.titleSubtitleGap) + this.subtitleLayout.getHeight()) / 2);
        canvas.save();
        canvas.translate(this.textLeft + i, height);
        this.titleLayout.draw(canvas);
        canvas.translate(0.0f, this.titleLayout.getHeight() + this.titleSubtitleGap);
        this.subtitleLayout.draw(canvas);
        canvas.restore();
        int dp = i2 - AndroidUtilities.dp(11.0f);
        float f = centerY - (this.buttonHeight / 2);
        this.buttonRect.set(dp - ((int) (this.buttonLayout.getWidth() + (this.buttonPaddingH * 2))), f, dp, r5 + r4);
        float scale = this.buttonBounce.getScale(0.05f);
        canvas.save();
        canvas.scale(scale, scale, this.buttonRect.centerX(), this.buttonRect.centerY());
        Theme.multAlpha(-1, 0.18f);
        RectF rectF = this.buttonRect;
        float f2 = this.buttonRadius;
        canvas.drawRoundRect(rectF, f2, f2, this.buttonBackgroundPaint);
        canvas.save();
        canvas.translate(r3 + this.buttonPaddingH, f + ((this.buttonHeight - this.buttonLayout.getHeight()) / 2.0f));
        this.buttonLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
        float f3 = centerY + 1;
        DrawableUtils.setBounds(this.bubbleDrawable, AndroidUtilities.dp(29.66f) + i, f3, 17);
        this.bubbleDrawable.draw(canvas);
        DrawableUtils.setBounds(this.planeDrawable, i + AndroidUtilities.dp(29.66f), f3, 17);
        this.planeDrawable.draw(canvas);
    }
}
