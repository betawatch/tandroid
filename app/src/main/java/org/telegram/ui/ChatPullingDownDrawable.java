package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
/* loaded from: classes3.dex */
public class ChatPullingDownDrawable implements NotificationCenter.NotificationCenterDelegate {
    boolean animateCheck;
    public boolean animateSwipeToRelease;
    float bounceProgress;
    StaticLayout chatNameLayout;
    int chatNameWidth;
    float checkProgress;
    float circleRadius;
    private final int currentAccount;
    private final long currentDialog;
    public int dialogFilterId;
    public int dialogFolderId;
    boolean drawFolderBackground;
    boolean emptyStub;
    private final int filterId;
    private final int folderId;
    private final View fragmentView;
    long lastHapticTime;
    float lastProgress;
    public long lastShowingReleaseTime;
    int lastWidth;
    StaticLayout layout1;
    int layout1Width;
    StaticLayout layout2;
    int layout2Width;
    TLRPC$Chat nextChat;
    public long nextDialogId;
    Runnable onAnimationFinishRunnable;
    View parentView;
    float progressToBottomPanel;
    private final Theme.ResourcesProvider resourcesProvider;
    boolean showBottomPanel;
    AnimatorSet showReleaseAnimator;
    float swipeToReleaseProgress;
    Paint arrowPaint = new Paint(1);
    TextPaint textPaint = new TextPaint(1);
    TextPaint textPaint2 = new TextPaint(1);
    private Paint xRefPaint = new Paint(1);
    Path path = new Path();
    ImageReceiver imageReceiver = new ImageReceiver();
    CounterView.CounterDrawable counterDrawable = new CounterView.CounterDrawable(null, true, null);
    int[] params = new int[3];

    public ChatPullingDownDrawable(int i, View view, long j, int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
        this.fragmentView = view;
        this.currentAccount = i;
        this.currentDialog = j;
        this.folderId = i2;
        this.filterId = i3;
        this.resourcesProvider = resourcesProvider;
        this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        this.arrowPaint.setStrokeCap(Paint.Cap.ROUND);
        CounterView.CounterDrawable counterDrawable = this.counterDrawable;
        counterDrawable.gravity = 3;
        counterDrawable.setType(1);
        CounterView.CounterDrawable counterDrawable2 = this.counterDrawable;
        counterDrawable2.addServiceGradient = true;
        counterDrawable2.circlePaint = getThemedPaint("paintChatActionBackground");
        CounterView.CounterDrawable counterDrawable3 = this.counterDrawable;
        TextPaint textPaint = this.textPaint;
        counterDrawable3.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        this.xRefPaint.setColor(-16777216);
        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        updateDialog();
    }

    public void updateDialog() {
        TLRPC$Dialog nextUnreadDialog = getNextUnreadDialog(this.currentDialog, this.folderId, this.filterId, true, this.params);
        if (nextUnreadDialog != null) {
            this.nextDialogId = nextUnreadDialog.id;
            int[] iArr = this.params;
            this.drawFolderBackground = iArr[0] == 1;
            this.dialogFolderId = iArr[1];
            this.dialogFilterId = iArr[2];
            this.emptyStub = false;
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-nextUnreadDialog.id));
            this.nextChat = chat;
            if (chat == null) {
                MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(nextUnreadDialog.id));
            }
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(this.nextChat);
            this.imageReceiver.setImage(ImageLocation.getForChat(this.nextChat, 1), "50_50", avatarDrawable, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(this.currentAccount).ensureMessagesLoaded(nextUnreadDialog.id, 0, null);
            this.counterDrawable.setCount(nextUnreadDialog.unread_count, false);
            return;
        }
        this.nextChat = null;
        this.drawFolderBackground = false;
        this.emptyStub = true;
    }

    public void setWidth(int i) {
        String str;
        String str2;
        int i2;
        if (i != this.lastWidth) {
            this.circleRadius = AndroidUtilities.dp(56.0f) / 2.0f;
            this.lastWidth = i;
            TLRPC$Chat tLRPC$Chat = this.nextChat;
            String string = tLRPC$Chat != null ? tLRPC$Chat.title : LocaleController.getString("SwipeToGoNextChannelEnd", 2131628584);
            int measureText = (int) this.textPaint.measureText(string);
            this.chatNameWidth = measureText;
            this.chatNameWidth = Math.min(measureText, this.lastWidth - AndroidUtilities.dp(60.0f));
            this.chatNameLayout = new StaticLayout(string, this.textPaint, this.chatNameWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            boolean z = this.drawFolderBackground;
            if (z && (i2 = this.dialogFolderId) != this.folderId && i2 != 0) {
                str2 = LocaleController.getString("SwipeToGoNextArchive", 2131628582);
                str = LocaleController.getString("ReleaseToGoNextArchive", 2131627944);
            } else if (z) {
                str2 = LocaleController.getString("SwipeToGoNextFolder", 2131628585);
                str = LocaleController.getString("ReleaseToGoNextFolder", 2131627946);
            } else {
                str2 = LocaleController.getString("SwipeToGoNextChannel", 2131628583);
                str = LocaleController.getString("ReleaseToGoNextChannel", 2131627945);
            }
            String str3 = str2;
            String str4 = str;
            int measureText2 = (int) this.textPaint2.measureText(str3);
            this.layout1Width = measureText2;
            this.layout1Width = Math.min(measureText2, this.lastWidth - AndroidUtilities.dp(60.0f));
            this.layout1 = new StaticLayout(str3, this.textPaint2, this.layout1Width, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            int measureText3 = (int) this.textPaint2.measureText(str4);
            this.layout2Width = measureText3;
            this.layout2Width = Math.min(measureText3, this.lastWidth - AndroidUtilities.dp(60.0f));
            this.layout2 = new StaticLayout(str4, this.textPaint2, this.layout2Width, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.imageReceiver.setImageCoords((this.lastWidth / 2.0f) - (AndroidUtilities.dp(40.0f) / 2.0f), (AndroidUtilities.dp(12.0f) + this.circleRadius) - (AndroidUtilities.dp(40.0f) / 2.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
            this.imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / 2.0f));
            this.counterDrawable.setSize(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
        }
    }

    public void draw(Canvas canvas, View view, float f, float f2) {
        int i;
        float f3;
        int i2;
        int i3;
        float f4;
        this.parentView = view;
        this.counterDrawable.setParent(view);
        float dp = AndroidUtilities.dp(110.0f) * f;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        float f5 = f < 0.2f ? 5.0f * f * f2 : f2;
        Theme.applyServiceShaderMatrix(this.lastWidth, view.getMeasuredHeight(), 0.0f, view.getMeasuredHeight() - dp);
        this.textPaint.setColor(getThemedColor("chat_serviceText"));
        this.arrowPaint.setColor(getThemedColor("chat_serviceText"));
        this.textPaint2.setColor(getThemedColor("chat_messagePanelHint"));
        int alpha = getThemedPaint("paintChatActionBackground").getAlpha();
        int alpha2 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
        int alpha3 = this.textPaint.getAlpha();
        int alpha4 = this.arrowPaint.getAlpha();
        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha2 * f5));
        int i4 = (int) (alpha * f5);
        getThemedPaint("paintChatActionBackground").setAlpha(i4);
        int i5 = (int) (alpha3 * f5);
        this.textPaint.setAlpha(i5);
        this.imageReceiver.setAlpha(f5);
        if ((f < 1.0f || this.lastProgress >= 1.0f) && (f >= 1.0f || this.lastProgress != 1.0f)) {
            i = alpha;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            i = alpha;
            if (currentTimeMillis - this.lastHapticTime > 100) {
                view.performHapticFeedback(3, 2);
                this.lastHapticTime = currentTimeMillis;
            }
            this.lastProgress = f;
        }
        if (f == 1.0f && !this.animateSwipeToRelease) {
            this.animateSwipeToRelease = true;
            this.animateCheck = true;
            showReleaseState(true, view);
            this.lastShowingReleaseTime = System.currentTimeMillis();
        } else if (f != 1.0f && this.animateSwipeToRelease) {
            this.animateSwipeToRelease = false;
            showReleaseState(false, view);
        }
        float f6 = this.lastWidth / 2.0f;
        float f7 = this.bounceProgress * (-AndroidUtilities.dp(4.0f));
        if (this.emptyStub) {
            dp -= f7;
        }
        float f8 = dp / 2.0f;
        float max = Math.max(0.0f, Math.min(this.circleRadius, (f8 - (AndroidUtilities.dp(16.0f) * f)) - AndroidUtilities.dp(4.0f)));
        float max2 = ((Math.max(0.0f, Math.min(this.circleRadius * f, f8 - (AndroidUtilities.dp(8.0f) * f))) * 2.0f) - AndroidUtilities.dp2(16.0f)) * (1.0f - this.swipeToReleaseProgress);
        float f9 = this.swipeToReleaseProgress;
        float dp2 = max2 + (AndroidUtilities.dp(56.0f) * f9);
        if (f9 < 1.0f || this.emptyStub) {
            float f10 = -dp;
            i2 = alpha3;
            i3 = alpha2;
            float dp3 = ((-AndroidUtilities.dp(8.0f)) * (1.0f - this.swipeToReleaseProgress)) + ((AndroidUtilities.dp(56.0f) + f10) * this.swipeToReleaseProgress);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f6 - max, f10, max + f6, dp3);
            if (this.swipeToReleaseProgress > 0.0f && !this.emptyStub) {
                float dp4 = AndroidUtilities.dp(16.0f) * this.swipeToReleaseProgress;
                rectF.inset(dp4, dp4);
            }
            drawBackground(canvas, rectF);
            float dp5 = ((AndroidUtilities.dp(24.0f) + f10) + (AndroidUtilities.dp(8.0f) * (1.0f - f))) - (AndroidUtilities.dp(36.0f) * this.swipeToReleaseProgress);
            canvas.save();
            f3 = dp;
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas.clipRect(rectF);
            float f11 = this.swipeToReleaseProgress;
            if (f11 > 0.0f) {
                this.arrowPaint.setAlpha((int) ((1.0f - f11) * 255.0f));
            }
            drawArrow(canvas, f6, dp5, AndroidUtilities.dp(24.0f) * f);
            if (this.emptyStub) {
                float dp22 = ((((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f)) - dp2) * (1.0f - this.swipeToReleaseProgress)) + ((f10 - AndroidUtilities.dp(2.0f)) * this.swipeToReleaseProgress) + f7;
                this.arrowPaint.setAlpha(alpha4);
                canvas.save();
                canvas.scale(f, f, f6, AndroidUtilities.dp(28.0f) + dp22);
                drawCheck(canvas, f6, dp22 + AndroidUtilities.dp(28.0f));
                canvas.restore();
            }
            canvas.restore();
        } else {
            f3 = dp;
            i3 = alpha2;
            i2 = alpha3;
        }
        if (this.chatNameLayout != null && this.swipeToReleaseProgress > 0.0f) {
            getThemedPaint("paintChatActionBackground").setAlpha(i4);
            this.textPaint.setAlpha(i5);
            float dp6 = ((AndroidUtilities.dp(20.0f) * (1.0f - this.swipeToReleaseProgress)) - (AndroidUtilities.dp(36.0f) * this.swipeToReleaseProgress)) + f7;
            RectF rectF2 = AndroidUtilities.rectTmp;
            int i6 = this.lastWidth;
            int i7 = this.chatNameWidth;
            rectF2.set((i6 - i7) / 2.0f, dp6, i6 - ((i6 - i7) / 2.0f), this.chatNameLayout.getHeight() + dp6);
            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), getThemedPaint("paintChatActionBackground"));
            if (hasGradientService()) {
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            canvas.save();
            canvas.translate((this.lastWidth - this.chatNameWidth) / 2.0f, dp6);
            this.chatNameLayout.draw(canvas);
            canvas.restore();
        }
        if (this.emptyStub || dp2 <= 0.0f) {
            f4 = 1.0f;
        } else {
            float dp23 = ((((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f)) - dp2) * (1.0f - this.swipeToReleaseProgress)) + (((-f3) + AndroidUtilities.dp(4.0f)) * this.swipeToReleaseProgress) + f7;
            float f12 = dp2 / 2.0f;
            this.imageReceiver.setRoundRadius((int) f12);
            this.imageReceiver.setImageCoords(f6 - f12, dp23, dp2, dp2);
            if (this.swipeToReleaseProgress > 0.0f) {
                f4 = 1.0f;
                canvas.saveLayerAlpha(this.imageReceiver.getImageX(), this.imageReceiver.getImageY(), this.imageReceiver.getImageWidth() + this.imageReceiver.getImageX(), this.imageReceiver.getImageHeight() + this.imageReceiver.getImageY(), 255, 31);
                this.imageReceiver.draw(canvas);
                float f13 = this.swipeToReleaseProgress;
                canvas.scale(f13, f13, AndroidUtilities.dp(12.0f) + f6 + this.counterDrawable.getCenterX(), (dp23 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas.translate(AndroidUtilities.dp(12.0f) + f6, dp23 - AndroidUtilities.dp(6.0f));
                this.counterDrawable.updateBackgroundRect();
                this.counterDrawable.rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                RectF rectF3 = this.counterDrawable.rectF;
                canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, this.counterDrawable.rectF.height() / 2.0f, this.xRefPaint);
                canvas.restore();
                canvas.save();
                float f14 = this.swipeToReleaseProgress;
                canvas.scale(f14, f14, AndroidUtilities.dp(12.0f) + f6 + this.counterDrawable.getCenterX(), (dp23 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas.translate(f6 + AndroidUtilities.dp(12.0f), dp23 - AndroidUtilities.dp(6.0f));
                this.counterDrawable.draw(canvas);
                canvas.restore();
            } else {
                f4 = 1.0f;
                this.imageReceiver.draw(canvas);
            }
        }
        getThemedPaint("paintChatActionBackground").setAlpha(i);
        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(i3);
        this.textPaint.setAlpha(i2);
        this.arrowPaint.setAlpha(alpha4);
        this.imageReceiver.setAlpha(f4);
    }

    private void drawCheck(Canvas canvas, float f, float f2) {
        if (!this.animateCheck) {
            return;
        }
        float f3 = this.checkProgress;
        if (f3 < 1.0f) {
            float f4 = f3 + 0.07272727f;
            this.checkProgress = f4;
            if (f4 > 1.0f) {
                this.checkProgress = 1.0f;
            }
        }
        float f5 = this.checkProgress;
        float f6 = f5 > 0.5f ? 1.0f : f5 / 0.5f;
        float f7 = f5 < 0.5f ? 0.0f : (f5 - 0.5f) / 0.5f;
        canvas.save();
        canvas.clipRect(AndroidUtilities.rectTmp);
        canvas.translate(f - AndroidUtilities.dp(24.0f), f2 - AndroidUtilities.dp(24.0f));
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(26.0f);
        float dp3 = AndroidUtilities.dp(22.0f);
        float dp4 = AndroidUtilities.dp(32.0f);
        float dp5 = AndroidUtilities.dp(32.0f);
        float dp6 = AndroidUtilities.dp(20.0f);
        float f8 = 1.0f - f6;
        canvas.drawLine(dp, dp2, (dp * f8) + (dp3 * f6), (f8 * dp2) + (f6 * dp4), this.arrowPaint);
        if (f7 > 0.0f) {
            float f9 = 1.0f - f7;
            canvas.drawLine(dp3, dp4, (dp3 * f9) + (dp5 * f7), (f9 * dp4) + (dp6 * f7), this.arrowPaint);
        }
        canvas.restore();
    }

    private void drawBackground(Canvas canvas, RectF rectF) {
        if (this.drawFolderBackground) {
            this.path.reset();
            float width = rectF.width() * 0.2f;
            float width2 = rectF.width() * 0.1f;
            float width3 = rectF.width() * 0.03f;
            float f = width2 / 2.0f;
            float height = rectF.height() - width2;
            this.path.moveTo(rectF.right, rectF.top + width + width2);
            float f2 = -width;
            this.path.rQuadTo(0.0f, f2, f2, f2);
            float f3 = width * 2.0f;
            float f4 = f * 2.0f;
            this.path.rLineTo((((-(rectF.width() - f3)) / 2.0f) + f4) - width3, 0.0f);
            float f5 = -f;
            float f6 = f5 / 2.0f;
            float f7 = f5 * 2.0f;
            float f8 = (-width2) / 2.0f;
            this.path.rQuadTo(f6, 0.0f, f7, f8);
            this.path.rQuadTo(f6, f8, f7, f8);
            this.path.rLineTo(((-(rectF.width() - f3)) / 2.0f) + f4 + width3, 0.0f);
            this.path.rQuadTo(f2, 0.0f, f2, width);
            this.path.rLineTo(0.0f, (width2 + height) - f3);
            this.path.rQuadTo(0.0f, width, width, width);
            this.path.rLineTo(rectF.width() - f3, 0.0f);
            this.path.rQuadTo(width, 0.0f, width, f2);
            this.path.rLineTo(0.0f, -(height - f3));
            this.path.close();
            canvas.drawPath(this.path, getThemedPaint("paintChatActionBackground"));
            if (!hasGradientService()) {
                return;
            }
            canvas.drawPath(this.path, Theme.chat_actionBackgroundGradientDarkenPaint);
            return;
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        float f9 = this.circleRadius;
        canvas.drawRoundRect(rectF2, f9, f9, getThemedPaint("paintChatActionBackground"));
        if (!hasGradientService()) {
            return;
        }
        float f10 = this.circleRadius;
        canvas.drawRoundRect(rectF2, f10, f10, Theme.chat_actionBackgroundGradientDarkenPaint);
    }

    private void showReleaseState(boolean z, View view) {
        AnimatorSet animatorSet = this.showReleaseAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.showReleaseAnimator.cancel();
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.swipeToReleaseProgress, 1.0f);
            ofFloat.addUpdateListener(new ChatPullingDownDrawable$$ExternalSyntheticLambda5(this, view));
            ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            ofFloat.setDuration(250L);
            this.bounceProgress = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ChatPullingDownDrawable$$ExternalSyntheticLambda4(this, view));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
            ofFloat2.setInterpolator(cubicBezierInterpolator);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ChatPullingDownDrawable$$ExternalSyntheticLambda3(this, view));
            ofFloat3.setInterpolator(cubicBezierInterpolator);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ChatPullingDownDrawable$$ExternalSyntheticLambda6(this, view));
            ofFloat4.setInterpolator(cubicBezierInterpolator);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.showReleaseAnimator = animatorSet2;
            animatorSet2.addListener(new AnonymousClass1(view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.showReleaseAnimator.playTogether(ofFloat, animatorSet3);
            this.showReleaseAnimator.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.swipeToReleaseProgress, 0.0f);
        ofFloat5.addUpdateListener(new ChatPullingDownDrawable$$ExternalSyntheticLambda2(this, view));
        ofFloat5.setInterpolator(CubicBezierInterpolator.DEFAULT);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.showReleaseAnimator = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.showReleaseAnimator.start();
    }

    public /* synthetic */ void lambda$showReleaseState$0(View view, ValueAnimator valueAnimator) {
        this.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidate();
        this.fragmentView.invalidate();
    }

    public /* synthetic */ void lambda$showReleaseState$1(View view, ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidate();
    }

    public /* synthetic */ void lambda$showReleaseState$2(View view, ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidate();
    }

    public /* synthetic */ void lambda$showReleaseState$3(View view, ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidate();
    }

    /* renamed from: org.telegram.ui.ChatPullingDownDrawable$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        final /* synthetic */ View val$parent;

        AnonymousClass1(View view) {
            ChatPullingDownDrawable.this = r1;
            this.val$parent = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ChatPullingDownDrawable chatPullingDownDrawable = ChatPullingDownDrawable.this;
            chatPullingDownDrawable.bounceProgress = 0.0f;
            chatPullingDownDrawable.swipeToReleaseProgress = 1.0f;
            this.val$parent.invalidate();
            ChatPullingDownDrawable.this.fragmentView.invalidate();
            Runnable runnable = ChatPullingDownDrawable.this.onAnimationFinishRunnable;
            if (runnable != null) {
                runnable.run();
                ChatPullingDownDrawable.this.onAnimationFinishRunnable = null;
            }
        }
    }

    public /* synthetic */ void lambda$showReleaseState$4(View view, ValueAnimator valueAnimator) {
        this.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.fragmentView.invalidate();
        view.invalidate();
    }

    private void drawArrow(Canvas canvas, float f, float f2, float f3) {
        canvas.save();
        float dpf2 = f3 / AndroidUtilities.dpf2(24.0f);
        canvas.scale(dpf2, dpf2, f, f2 - AndroidUtilities.dp(20.0f));
        canvas.translate(f - AndroidUtilities.dp2(12.0f), f2 - AndroidUtilities.dp(12.0f));
        canvas.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), this.arrowPaint);
        canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), this.arrowPaint);
        canvas.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), this.arrowPaint);
        canvas.restore();
    }

    public void onAttach() {
        this.imageReceiver.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
    }

    public void onDetach() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        this.imageReceiver.onDetachedFromWindow();
        this.lastProgress = 0.0f;
        this.lastHapticTime = 0L;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC$Dialog tLRPC$Dialog;
        if (this.nextDialogId == 0 || (tLRPC$Dialog = MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.nextDialogId)) == null) {
            return;
        }
        this.counterDrawable.setCount(tLRPC$Dialog.unread_count, true);
        View view = this.parentView;
        if (view == null) {
            return;
        }
        view.invalidate();
    }

    public static TLRPC$Dialog getNextUnreadDialog(long j, int i, int i2, boolean z, int[] iArr) {
        ArrayList<TLRPC$Dialog> arrayList;
        TLRPC$Dialog nextUnreadDialog;
        TLRPC$Dialog nextUnreadDialog2;
        MessagesController messagesController = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController();
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
            iArr[2] = i2;
        }
        if (i2 != 0) {
            MessagesController.DialogFilter dialogFilter = messagesController.dialogFiltersById.get(i2);
            if (dialogFilter == null) {
                return null;
            }
            arrayList = dialogFilter.dialogs;
        } else {
            arrayList = messagesController.getDialogs(i);
        }
        if (arrayList == null) {
            return null;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC$Dialog tLRPC$Dialog = arrayList.get(i3);
            TLRPC$Chat chat = messagesController.getChat(Long.valueOf(-tLRPC$Dialog.id));
            if (chat != null && tLRPC$Dialog.id != j && tLRPC$Dialog.unread_count > 0 && DialogObject.isChannel(tLRPC$Dialog) && !chat.megagroup && !messagesController.isPromoDialog(tLRPC$Dialog.id, false) && MessagesController.getRestrictionReason(chat.restriction_reason) == null) {
                return tLRPC$Dialog;
            }
        }
        if (z) {
            if (i2 != 0) {
                for (int i4 = 0; i4 < messagesController.dialogFilters.size(); i4++) {
                    int i5 = messagesController.dialogFilters.get(i4).id;
                    if (i2 != i5 && (nextUnreadDialog2 = getNextUnreadDialog(j, i, i5, false, iArr)) != null) {
                        if (iArr != null) {
                            iArr[0] = 1;
                        }
                        return nextUnreadDialog2;
                    }
                }
            }
            for (int i6 = 0; i6 < messagesController.dialogsByFolder.size(); i6++) {
                int keyAt = messagesController.dialogsByFolder.keyAt(i6);
                if (i != keyAt && (nextUnreadDialog = getNextUnreadDialog(j, keyAt, 0, false, iArr)) != null) {
                    if (iArr != null) {
                        iArr[0] = 1;
                    }
                    return nextUnreadDialog;
                }
            }
        }
        return null;
    }

    public long getChatId() {
        return this.nextChat.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawBottomPanel(Canvas canvas, int i, int i2, int i3) {
        boolean z = this.showBottomPanel;
        if (z) {
            float f = this.progressToBottomPanel;
            if (f != 1.0f) {
                float f2 = f + 0.10666667f;
                this.progressToBottomPanel = f2;
                if (f2 > 1.0f) {
                    this.progressToBottomPanel = 1.0f;
                } else {
                    this.fragmentView.invalidate();
                }
                this.textPaint2.setColor(getThemedColor("chat_messagePanelHint"));
                Paint themedPaint = getThemedPaint("paintChatComposeBackground");
                int alpha = themedPaint.getAlpha();
                int alpha2 = this.textPaint2.getAlpha();
                themedPaint.setAlpha((int) (alpha * this.progressToBottomPanel));
                float f3 = i;
                canvas.drawRect(0.0f, f3, i3, i2, themedPaint);
                if (this.layout1 != null) {
                    float f4 = this.swipeToReleaseProgress;
                    if (f4 < 1.0f) {
                        this.textPaint2.setAlpha((int) (alpha2 * (1.0f - f4) * this.progressToBottomPanel));
                        float height = ((((i2 - i) - this.layout1.getHeight()) / 2.0f) + f3) - (AndroidUtilities.dp(10.0f) * this.swipeToReleaseProgress);
                        canvas.save();
                        canvas.translate((this.lastWidth - this.layout1Width) / 2.0f, height);
                        this.layout1.draw(canvas);
                        canvas.restore();
                    }
                }
                if (this.layout2 != null) {
                    float f5 = this.swipeToReleaseProgress;
                    if (f5 > 0.0f) {
                        this.textPaint2.setAlpha((int) (alpha2 * f5 * this.progressToBottomPanel));
                        float height2 = f3 + (((i2 - i) - this.layout2.getHeight()) / 2.0f) + (AndroidUtilities.dp(10.0f) * (1.0f - this.swipeToReleaseProgress));
                        canvas.save();
                        canvas.translate((this.lastWidth - this.layout2Width) / 2.0f, height2);
                        this.layout2.draw(canvas);
                        canvas.restore();
                    }
                }
                this.textPaint2.setAlpha(alpha2);
                themedPaint.setAlpha(alpha);
            }
        }
        if (!z) {
            float f6 = this.progressToBottomPanel;
            if (f6 != 0.0f) {
                float f7 = f6 - 0.10666667f;
                this.progressToBottomPanel = f7;
                if (f7 < 0.0f) {
                    this.progressToBottomPanel = 0.0f;
                } else {
                    this.fragmentView.invalidate();
                }
            }
        }
        this.textPaint2.setColor(getThemedColor("chat_messagePanelHint"));
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int alpha3 = themedPaint2.getAlpha();
        int alpha22 = this.textPaint2.getAlpha();
        themedPaint2.setAlpha((int) (alpha3 * this.progressToBottomPanel));
        float f32 = i;
        canvas.drawRect(0.0f, f32, i3, i2, themedPaint2);
        if (this.layout1 != null) {
        }
        if (this.layout2 != null) {
        }
        this.textPaint2.setAlpha(alpha22);
        themedPaint2.setAlpha(alpha3);
    }

    public void showBottomPanel(boolean z) {
        this.showBottomPanel = z;
        this.fragmentView.invalidate();
    }

    public boolean needDrawBottomPanel() {
        return (this.showBottomPanel || this.progressToBottomPanel > 0.0f) && !this.emptyStub;
    }

    public boolean animationIsRunning() {
        return this.swipeToReleaseProgress != 1.0f;
    }

    public void runOnAnimationFinish(Runnable runnable) {
        AnimatorSet animatorSet = this.showReleaseAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.showReleaseAnimator.cancel();
        }
        this.onAnimationFinishRunnable = runnable;
        this.showReleaseAnimator = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.swipeToReleaseProgress, 1.0f);
        ofFloat.addUpdateListener(new ChatPullingDownDrawable$$ExternalSyntheticLambda1(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.bounceProgress, 0.0f);
        ofFloat2.addUpdateListener(new ChatPullingDownDrawable$$ExternalSyntheticLambda0(this));
        this.showReleaseAnimator.addListener(new AnonymousClass2());
        this.showReleaseAnimator.playTogether(ofFloat, ofFloat2);
        this.showReleaseAnimator.setDuration(120L);
        this.showReleaseAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.showReleaseAnimator.start();
    }

    public /* synthetic */ void lambda$runOnAnimationFinish$5(ValueAnimator valueAnimator) {
        this.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.fragmentView.invalidate();
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public /* synthetic */ void lambda$runOnAnimationFinish$6(ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: org.telegram.ui.ChatPullingDownDrawable$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        AnonymousClass2() {
            ChatPullingDownDrawable.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ChatPullingDownDrawable chatPullingDownDrawable = ChatPullingDownDrawable.this;
            chatPullingDownDrawable.bounceProgress = 0.0f;
            chatPullingDownDrawable.swipeToReleaseProgress = 1.0f;
            View view = chatPullingDownDrawable.parentView;
            if (view != null) {
                view.invalidate();
            }
            ChatPullingDownDrawable.this.fragmentView.invalidate();
            Runnable runnable = ChatPullingDownDrawable.this.onAnimationFinishRunnable;
            if (runnable != null) {
                runnable.run();
                ChatPullingDownDrawable.this.onAnimationFinishRunnable = null;
            }
        }
    }

    public void reset() {
        this.checkProgress = 0.0f;
        this.animateCheck = false;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    private Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    private boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
    }
}
