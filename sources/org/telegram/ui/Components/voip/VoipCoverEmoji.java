package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;

/* loaded from: classes5.dex */
public class VoipCoverEmoji {
    private final boolean allowAnimations;
    private int diffX;
    private ValueAnimator diffXAnimator;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    private int fromRandomX;
    private int fromRandomY;
    private int height;
    private boolean isShown;
    private final View parent;
    private int posX;
    private int posY;
    private ValueAnimator positionAnimator;
    private int randomX;
    private int randomY;
    private final int size;
    private int toRandomX;
    private int toRandomY;
    private int width;
    private int alpha = 0;
    private float scale = 0.0f;

    public VoipCoverEmoji(TLRPC.User user, final View view, int i) {
        this.parent = view;
        this.size = i;
        boolean isEnabled = LiteMode.isEnabled(512);
        this.allowAnimations = isEnabled;
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (!isEnabled || profileEmojiId == 0) {
            return;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, i, 13);
        this.emoji = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.set(profileEmojiId, false);
        this.emoji.setColor(-16777216);
        this.emoji.setAlpha(this.alpha);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.positionAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.VoipCoverEmoji$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoipCoverEmoji.$r8$lambda$wHt6k9-uscPhbPWg_LHAc3R59JM(VoipCoverEmoji.this, view, valueAnimator);
            }
        });
        this.fromRandomX = this.toRandomX + AndroidUtilities.dp(12.0f);
        this.fromRandomY = this.toRandomY + AndroidUtilities.dp(12.0f);
        this.toRandomX = Utilities.random.nextInt(AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(12.0f);
        this.toRandomY = Utilities.random.nextInt(AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(12.0f);
        this.positionAnimator.setInterpolator(new LinearInterpolator());
        this.positionAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.voip.VoipCoverEmoji.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
                VoipCoverEmoji voipCoverEmoji = VoipCoverEmoji.this;
                voipCoverEmoji.fromRandomX = voipCoverEmoji.toRandomX;
                VoipCoverEmoji voipCoverEmoji2 = VoipCoverEmoji.this;
                voipCoverEmoji2.fromRandomY = voipCoverEmoji2.toRandomY;
                VoipCoverEmoji.this.toRandomX = Utilities.random.nextInt(AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(12.0f);
                VoipCoverEmoji.this.toRandomY = Utilities.random.nextInt(AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(12.0f);
                if (VoipCoverEmoji.this.positionAnimator != null) {
                    VoipCoverEmoji.this.positionAnimator.start();
                }
            }
        });
        this.positionAnimator.setDuration(2000L);
    }

    public static /* synthetic */ void $r8$lambda$wHt6k9-uscPhbPWg_LHAc3R59JM(VoipCoverEmoji voipCoverEmoji, View view, ValueAnimator valueAnimator) {
        voipCoverEmoji.randomX = (int) (voipCoverEmoji.fromRandomX + ((voipCoverEmoji.toRandomX - r0) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        voipCoverEmoji.randomY = (int) (voipCoverEmoji.fromRandomY + ((voipCoverEmoji.toRandomY - r0) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        view.invalidate();
    }

    private void show() {
        if (this.isShown) {
            return;
        }
        if (this.emoji.getDrawable() instanceof AnimatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) this.emoji.getDrawable();
            if (animatedEmojiDrawable.getImageReceiver() == null || !animatedEmojiDrawable.getImageReceiver().hasImageLoaded()) {
                return;
            }
        }
        this.isShown = true;
        final int i = 12;
        this.diffX = this.posX > getCenterX() ? AndroidUtilities.dp(12) : -AndroidUtilities.dp(12);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new CubicBezierInterpolator(0.34d, 1.36d, 0.64d, 1.0d));
        final int i2 = 350;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.VoipCoverEmoji$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoipCoverEmoji.$r8$lambda$miXq0gBKf7xgbCSyjE5Wab9At-g(VoipCoverEmoji.this, i, i2, valueAnimator);
            }
        });
        long j = 350;
        ofFloat.setDuration(j);
        long j2 = NotificationCenter.needDeleteDialog;
        ofFloat.setStartDelay(j2);
        ofFloat.start();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, NotificationCenter.didReceiveSmsCode, NotificationCenter.didReceiveSmsCode);
        ofInt.setInterpolator(CubicBezierInterpolator.DEFAULT);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.VoipCoverEmoji$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoipCoverEmoji.$r8$lambda$tO9teCpBJEIPQXwOBCOBKfQ3DjI(VoipCoverEmoji.this, valueAnimator);
            }
        });
        ofInt.setStartDelay(j2);
        ofInt.setDuration(j);
        ofInt.start();
    }

    public static /* synthetic */ void $r8$lambda$miXq0gBKf7xgbCSyjE5Wab9At-g(final VoipCoverEmoji voipCoverEmoji, int i, int i2, ValueAnimator valueAnimator) {
        voipCoverEmoji.getClass();
        voipCoverEmoji.scale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        voipCoverEmoji.parent.invalidate();
        if (voipCoverEmoji.scale <= 1.0f || voipCoverEmoji.diffXAnimator != null) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(i), 0);
        voipCoverEmoji.diffXAnimator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.voip.VoipCoverEmoji$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoipCoverEmoji.$r8$lambda$vxSsd-Pi5ywC15U_CG3iukpYj5I(VoipCoverEmoji.this, valueAnimator2);
            }
        });
        voipCoverEmoji.diffXAnimator.setDuration(i2 - valueAnimator.getCurrentPlayTime());
        voipCoverEmoji.diffXAnimator.start();
    }

    public static /* synthetic */ void $r8$lambda$vxSsd-Pi5ywC15U_CG3iukpYj5I(VoipCoverEmoji voipCoverEmoji, ValueAnimator valueAnimator) {
        voipCoverEmoji.getClass();
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (voipCoverEmoji.posX <= voipCoverEmoji.getCenterX()) {
            intValue = -intValue;
        }
        voipCoverEmoji.diffX = intValue;
        voipCoverEmoji.parent.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$tO9teCpBJEIPQXwOBCOBKfQ3DjI(VoipCoverEmoji voipCoverEmoji, ValueAnimator valueAnimator) {
        voipCoverEmoji.getClass();
        voipCoverEmoji.alpha = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        voipCoverEmoji.parent.invalidate();
    }

    private int getCenterX() {
        return this.width / 2;
    }

    public void onLayout(int i, int i2) {
        this.width = i;
        this.height = i2;
        this.parent.invalidate();
    }

    public void setPosition(int i, int i2) {
        if (this.emoji == null) {
            return;
        }
        this.posX = i;
        this.posY = i2;
        this.parent.invalidate();
        show();
    }

    public void onDraw(Canvas canvas) {
        if (this.emoji == null) {
            return;
        }
        canvas.save();
        float f = this.scale;
        canvas.scale(f, f, this.width / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.posX - this.diffX, this.posY);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        int i = this.randomX;
        int i2 = this.randomY;
        int i3 = this.size;
        swapAnimatedEmojiDrawable.setBounds(i, i2, i + i3, i3 + i2);
        this.emoji.setAlpha(this.alpha);
        this.emoji.draw(canvas);
        canvas.restore();
    }

    public void onAttachedToWindow() {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable == null) {
            return;
        }
        swapAnimatedEmojiDrawable.attach();
        ValueAnimator valueAnimator = this.positionAnimator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void onDetachedFromWindow() {
        if (this.emoji == null) {
            return;
        }
        ValueAnimator valueAnimator = this.positionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.positionAnimator = null;
        }
        this.emoji.detach();
    }
}
