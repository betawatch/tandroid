package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LinkManager;

/* loaded from: classes4.dex */
class BotButton {
    public int angle;
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    public TLRPC.KeyboardButton button;
    public BotInlineKeyboard.ButtonCustom buttonCustom;
    public BotInlineKeyboard.Button buttonImpl;
    public int height;
    public Drawable iconDrawable;
    public final Runnable invalidateRunnable;
    public boolean isInviteButton;
    public boolean isLocked;
    public boolean isSeparator;
    public long lastUpdateTime;
    public LoadingDrawable loadingDrawable;
    public int positionFlags;
    public ValueAnimator pressAnimator;
    public float pressT;
    public boolean pressed;
    public float progressAlpha;
    public Drawable selectorDrawable;
    public Text title;
    public float width;
    public float x;
    public int y;
    private final Path path = new Path();
    private final Paint paint = new Paint(1);
    private final float[] radii = new float[8];

    public BotButton(Runnable runnable) {
        this.invalidateRunnable = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean draw(Canvas canvas, RectF rectF, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        Drawable themeDrawable;
        float pressScale = getPressScale();
        canvas.save();
        if (pressScale != 1.0f) {
            canvas.scale(pressScale, pressScale, rectF.centerX(), rectF.centerY());
        }
        Arrays.fill(this.radii, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
        if (hasPositionFlag(9)) {
            float[] fArr = this.radii;
            float dp = AndroidUtilities.dp(SharedConfig.bubbleRadius);
            fArr[7] = dp;
            fArr[6] = dp;
        }
        if (hasPositionFlag(10)) {
            float[] fArr2 = this.radii;
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
            fArr2[5] = dp2;
            fArr2[4] = dp2;
        }
        this.path.rewind();
        this.path.addRoundRect(rectF, this.radii, Path.Direction.CW);
        canvas.drawPath(this.path, Theme.getThemePaint("paintChatActionBackground", resourcesProvider));
        BotInlineKeyboard.Button button = this.buttonImpl;
        BotInlineKeyboard.BackgroundColor color = button != null ? button.getColor() : BotInlineKeyboard.BackgroundColor.NONE;
        BotInlineKeyboard.BackgroundColor backgroundColor = BotInlineKeyboard.BackgroundColor.NONE;
        boolean z3 = true;
        if (color != backgroundColor) {
            int i = 2.$SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor[color.ordinal()];
            if (i == 1) {
                this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_botKeyboard_button_danger, resourcesProvider), 0.7f));
            } else if (i == 2) {
                this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_botKeyboard_button_success, resourcesProvider), 0.7f));
            } else if (i == 3) {
                this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_botKeyboard_button_primary, resourcesProvider), 0.7f));
            }
            canvas.drawPath(this.path, this.paint);
        }
        if ((resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) && (color == backgroundColor || (resourcesProvider != null && resourcesProvider.isDark()))) {
            canvas.drawPath(this.path, Theme.chat_actionBackgroundGradientDarkenPaint);
        }
        canvas.save();
        canvas.clipPath(this.path);
        if (z) {
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            if (loadingDrawable == null) {
                LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                this.loadingDrawable = loadingDrawable2;
                loadingDrawable2.setRadiiDp(5.5f);
                this.loadingDrawable.setAppearByGradient(true);
                this.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
            } else if (loadingDrawable.isDisappeared() || this.loadingDrawable.isDisappearing()) {
                this.loadingDrawable.reset();
                this.loadingDrawable.resetDisappear();
            }
        } else {
            LoadingDrawable loadingDrawable3 = this.loadingDrawable;
            if (loadingDrawable3 != null && !loadingDrawable3.isDisappearing() && !this.loadingDrawable.isDisappeared()) {
                this.loadingDrawable.disappear();
            }
        }
        LoadingDrawable loadingDrawable4 = this.loadingDrawable;
        if (loadingDrawable4 == null || !(z || loadingDrawable4.isDisappearing())) {
            z3 = false;
        } else {
            rectF.inset(AndroidUtilities.dpf2(0.625f), AndroidUtilities.dpf2(0.625f));
            this.loadingDrawable.setRadii(this.radii);
            this.loadingDrawable.setBounds(rectF);
            LoadingDrawable loadingDrawable5 = this.loadingDrawable;
            int i2 = Theme.key_chat_serviceBackgroundSelector;
            loadingDrawable5.setColors(Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 1.0f), Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 2.5f), Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 3.0f), Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 10.0f));
            this.loadingDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
            this.loadingDrawable.draw(canvas);
        }
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.selectorDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
            this.selectorDrawable.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        float dp3 = (this.iconDrawable == null && this.animatedEmojiDrawable == null) ? 0 : AndroidUtilities.dp(26.0f);
        float width = rectF.left + (((rectF.width() - (this.title.getWidth() + (this.iconDrawable != null ? AndroidUtilities.dp(4.0f) : 0))) - dp3) / 2.0f);
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            int i3 = (int) width;
            animatedEmojiDrawable.setBounds(i3, (int) (rectF.top + ((this.height - AndroidUtilities.dp(20.0f)) / 2.0f)), AndroidUtilities.dp(20.0f) + i3, ((int) (rectF.top + ((this.height - AndroidUtilities.dp(20.0f)) / 2.0f))) + AndroidUtilities.dp(20.0f));
            this.animatedEmojiDrawable.setAlpha(this.isLocked ? 128 : NotificationCenter.didReceiveSmsCode);
            this.animatedEmojiDrawable.draw(canvas);
        } else {
            Drawable drawable2 = this.iconDrawable;
            if (drawable2 != null) {
                int i4 = (int) width;
                drawable2.setBounds(i4, (int) (rectF.top + ((this.height - AndroidUtilities.dp(24.0f)) / 2.0f)), AndroidUtilities.dp(24.0f) + i4, ((int) (rectF.top + ((this.height - AndroidUtilities.dp(24.0f)) / 2.0f))) + AndroidUtilities.dp(24.0f));
                this.iconDrawable.setAlpha(this.isLocked ? 128 : NotificationCenter.didReceiveSmsCode);
                this.iconDrawable.draw(canvas);
            }
            this.title.ellipsize(Math.max(1.0f, (rectF.width() - AndroidUtilities.dp(15.0f)) - dp3));
            this.title.draw(canvas, width, rectF.top + (AndroidUtilities.dp(44.0f) / 2.0f), this.isLocked ? 0.5f : 1.0f);
            canvas.restore();
            if (this.buttonCustom == null) {
                if (this.isLocked) {
                    Drawable themeDrawable2 = Theme.getThemeDrawable("drawableBotLock", resourcesProvider);
                    BaseCell.setDrawableBounds(themeDrawable2, (((int) rectF.right) - AndroidUtilities.dp(3.0f)) - themeDrawable2.getIntrinsicWidth(), this.y + AndroidUtilities.dp(3.0f));
                    themeDrawable2.draw(canvas);
                }
            } else {
                TLRPC.KeyboardButton keyboardButton = this.button;
                if (keyboardButton instanceof TLRPC.TL_keyboardButtonWebView) {
                    Drawable themeDrawable3 = Theme.getThemeDrawable("drawableBotWebView", resourcesProvider);
                    BaseCell.setDrawableBounds(themeDrawable3, (((int) rectF.right) - AndroidUtilities.dp(3.0f)) - themeDrawable3.getIntrinsicWidth(), this.y + AndroidUtilities.dp(3.0f));
                    themeDrawable3.draw(canvas);
                } else if (keyboardButton instanceof TLRPC.TL_keyboardButtonUrl) {
                    if (LinkManager.isWebAppLink(keyboardButton.url)) {
                        themeDrawable = Theme.getThemeDrawable("drawableBotWebView", resourcesProvider);
                    } else if (this.isInviteButton) {
                        themeDrawable = Theme.getThemeDrawable("drawable_botInvite", resourcesProvider);
                    } else {
                        themeDrawable = Theme.getThemeDrawable("drawableBotLink", resourcesProvider);
                    }
                    BaseCell.setDrawableBounds(themeDrawable, (((int) rectF.right) - AndroidUtilities.dp(3.0f)) - themeDrawable.getIntrinsicWidth(), this.y + AndroidUtilities.dp(3.0f));
                    themeDrawable.draw(canvas);
                } else if ((keyboardButton instanceof TLRPC.TL_keyboardButtonSwitchInline) || (keyboardButton instanceof TLRPC.TL_keyboardButtonRequestPeer)) {
                    Drawable themeDrawable4 = Theme.getThemeDrawable("drawableBotInline", resourcesProvider);
                    BaseCell.setDrawableBounds(themeDrawable4, (((int) rectF.right) - AndroidUtilities.dp(3.0f)) - themeDrawable4.getIntrinsicWidth(), this.y + AndroidUtilities.dp(3.0f));
                    themeDrawable4.draw(canvas);
                } else if ((keyboardButton instanceof TLRPC.TL_keyboardButtonBuy) && z2) {
                    BaseCell.setDrawableBounds(Theme.chat_botCardDrawable, (((int) rectF.right) - AndroidUtilities.dp(5.0f)) - Theme.chat_botCardDrawable.getIntrinsicWidth(), this.y + AndroidUtilities.dp(4.0f));
                    Theme.chat_botCardDrawable.draw(canvas);
                }
            }
            canvas.restore();
            return z3;
        }
        width += dp3;
        this.title.ellipsize(Math.max(1.0f, (rectF.width() - AndroidUtilities.dp(15.0f)) - dp3));
        this.title.draw(canvas, width, rectF.top + (AndroidUtilities.dp(44.0f) / 2.0f), this.isLocked ? 0.5f : 1.0f);
        canvas.restore();
        if (this.buttonCustom == null) {
        }
        canvas.restore();
        return z3;
    }

    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor;

        static {
            int[] iArr = new int[BotInlineKeyboard.BackgroundColor.values().length];
            $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor = iArr;
            try {
                iArr[BotInlineKeyboard.BackgroundColor.DANGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor[BotInlineKeyboard.BackgroundColor.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor[BotInlineKeyboard.BackgroundColor.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (this.pressed != z) {
            this.pressed = z;
            this.invalidateRunnable.run();
            if (z && (valueAnimator = this.pressAnimator) != null) {
                valueAnimator.removeAllListeners();
                this.pressAnimator.cancel();
            }
            if (z) {
                return;
            }
            float f = this.pressT;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.pressAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        BotButton.this.lambda$setPressed$0(valueAnimator2);
                    }
                });
                this.pressAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.BotButton.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        BotButton.this.pressAnimator = null;
                    }
                });
                this.pressAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                this.pressAnimator.setDuration(350L);
                this.pressAnimator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPressed$0(ValueAnimator valueAnimator) {
        this.pressT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.invalidateRunnable.run();
    }

    public boolean hasPositionFlag(int i) {
        return (this.positionFlags & i) == i;
    }

    public float getPressScale() {
        if (this.pressed) {
            float f = this.pressT;
            if (f != 1.0f) {
                float min = f + (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f);
                this.pressT = min;
                this.pressT = Utilities.clamp(min, 1.0f, 0.0f);
                this.invalidateRunnable.run();
            }
        }
        return ((1.0f - this.pressT) * 0.04f) + 0.96f;
    }
}
