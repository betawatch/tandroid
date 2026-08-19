package org.telegram.ui.iv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AiButtonDrawable;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.GradientClip;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichCommandSuggestions;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorListView;

/* loaded from: classes3.dex */
public class RichEditor extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ImageView addButton;
    private ImageView aiButton;
    private Button aiStyleButton;
    private ChatActivityEnterView animateEnterView;
    private int[] animateEnterViewFrom;
    private int[] animateEnterViewTo;
    private RectF animateFromRect;
    private BlurredBackgroundDrawable animateInputBackground;
    private ChatInputViewsContainer animateInputView;
    private float animateOpenProgress;
    private boolean animatingOpen;
    private ImageView backButton;
    private final ArrayList blockButtons;
    private LinearLayout blocksLayout;
    private HorizontalScrollView blocksScrollView;
    private FrameLayout bottomContainer;
    private View bottomGradient;
    private FrameLayout bottomInnerContainer;
    private int bottomInset;
    private LinearLayout bottomPanel;
    private int bottomPanelType;
    private FrameLayout bulletinContainer;
    private ChatActivity chatActivity;
    private RichCommandSuggestions commandSuggestions;
    private SizeNotifierFrameLayout container;
    private boolean convertToSimpleOnOpen;
    private ItemOptions currentMenuVisible;
    private Button dateButton;
    private MessageObject editingMessageObject;
    private ChatActivityEnterViewAnimatedIconView emojiButton;
    private int emojiPadding;
    private ValueAnimator emojiSearchAnimator;
    private boolean emojiSearchOpened;
    private float emojiSearchProgress;
    private RichEditText emojiTargetEditText;
    private int emojiTargetSelection;
    private EmojiView emojiView;
    private boolean emojiViewVisible;
    private final ArrayList formattingButtons;
    private LinearLayout formattingLayout1;
    private LinearLayout formattingLayout2;
    private LinearLayout formattingLayout3;
    private LinearLayout formattingPanel;
    private LinearLayout formattingPanelLayout;
    private int formattingScrollMaxWidth;
    private HorizontalScrollView formattingScrollView;
    private LinearLayout historyButtons;
    private int imeInset;
    private String initialHtml;
    private CharSequence initialHtmlAfter;
    private CharSequence initialHtmlBefore;
    private TL_iv.RichMessage initialRichMessage;
    private int initialSelectionEnd;
    private int initialSelectionStart;
    private CharSequence initialText;
    private Button inlineButton;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private boolean keyboardVisible;
    private final Runnable limitCheckRunnable;
    private Button linkButton;
    private RichEditorListView listView;
    private int[] location;
    private Button mathButton;
    private MessageSendPreview messageSendPreview;
    private Runnable onClearedCallback;
    private Runnable onSentCallback;
    private Runnable pendingSend;
    private boolean persistedDraftOnEnd;
    private ArrayList premiumButtons;
    private Button quoteButton;
    private ImageView redoButton;
    private int reorderSavedPanelType;
    private ChatActivityEnterView.SendButton sendButton;
    private boolean sendButtonLoading;
    private boolean sent;
    private SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeDelegate;
    private final Rect tempRect;
    private View topGradient;
    private FrameLayout topPanel;
    private boolean trashHovered;
    private FrameLayout trashPanel;
    private RLottieImageView trashPanelIcon;
    private ImageView undoButton;

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyboardSizeChanged(int i, boolean z) {
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    protected boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public RichEditor(CharSequence charSequence) {
        this.initialSelectionStart = -1;
        this.initialSelectionEnd = -1;
        this.tempRect = new Rect();
        this.location = new int[2];
        this.animateOpenProgress = 1.0f;
        this.premiumButtons = new ArrayList();
        this.blockButtons = new ArrayList();
        this.formattingScrollMaxWidth = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.formattingButtons = new ArrayList();
        this.reorderSavedPanelType = 0;
        this.bottomPanelType = -1;
        this.limitCheckRunnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.updateSendButtonEnabled();
            }
        };
        this.initialText = charSequence;
    }

    public RichEditor setInitialSelection(int i, int i2) {
        this.initialSelectionStart = i;
        this.initialSelectionEnd = i2;
        return this;
    }

    public RichEditor(TL_iv.RichMessage richMessage) {
        this.initialSelectionStart = -1;
        this.initialSelectionEnd = -1;
        this.tempRect = new Rect();
        this.location = new int[2];
        this.animateOpenProgress = 1.0f;
        this.premiumButtons = new ArrayList();
        this.blockButtons = new ArrayList();
        this.formattingScrollMaxWidth = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.formattingButtons = new ArrayList();
        this.reorderSavedPanelType = 0;
        this.bottomPanelType = -1;
        this.limitCheckRunnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.updateSendButtonEnabled();
            }
        };
        this.initialRichMessage = richMessage;
    }

    public RichEditor convertToSimpleOnOpen() {
        this.convertToSimpleOnOpen = true;
        return this;
    }

    public RichEditor(String str, boolean z) {
        this.initialSelectionStart = -1;
        this.initialSelectionEnd = -1;
        this.tempRect = new Rect();
        this.location = new int[2];
        this.animateOpenProgress = 1.0f;
        this.premiumButtons = new ArrayList();
        this.blockButtons = new ArrayList();
        this.formattingScrollMaxWidth = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.formattingButtons = new ArrayList();
        this.reorderSavedPanelType = 0;
        this.bottomPanelType = -1;
        this.limitCheckRunnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.updateSendButtonEnabled();
            }
        };
        this.initialHtml = z ? str : null;
    }

    public RichEditor setHtmlSurrounding(CharSequence charSequence, CharSequence charSequence2) {
        this.initialHtmlBefore = charSequence;
        this.initialHtmlAfter = charSequence2;
        return this;
    }

    public RichEditor setEditing(MessageObject messageObject) {
        this.editingMessageObject = messageObject;
        return this;
    }

    public RichEditor animateFrom(ChatActivity chatActivity) {
        this.animateInputView = chatActivity.chatInputViewsContainer;
        this.animateEnterView = chatActivity.getChatActivityEnterView();
        return this;
    }

    private void updateAnimatingLocations() {
        this.animateInputView.getLocationInWindow(this.location);
        if (this.animateFromRect == null) {
            this.animateFromRect = new RectF();
        }
        RectF rectF = new RectF(this.animateInputBackground.getBounds());
        this.animateFromRect = rectF;
        int[] iArr = this.location;
        rectF.offset(iArr[0], iArr[1]);
        if (this.animateEnterViewFrom == null) {
            this.animateEnterViewFrom = new int[2];
        }
        this.animateEnterView.getLocationInWindow(this.animateEnterViewFrom);
        if (this.animateEnterViewTo == null) {
            this.animateEnterViewTo = new int[2];
        }
        this.animateEnterViewTo[0] = this.listView.getPaddingLeft();
        this.animateEnterViewTo[1] = this.listView.getPaddingTop();
        this.animateEnterViewTo[0] = (int) (r0[0] - (this.animateEnterView.messageEditText.getX() - AndroidUtilities.dp(16.0f)));
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public AnimatorSet onCustomTransitionAnimation(boolean z, final Runnable runnable) {
        if (!z && !this.persistedDraftOnEnd) {
            persistDraft();
            this.persistedDraftOnEnd = true;
        }
        if (!AndroidUtilities.isTablet() && this.animateInputView != null && this.animateEnterView != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ChatInputViewsContainer chatInputViewsContainer = this.animateInputView;
            this.animateInputBackground = chatInputViewsContainer.blurredBackgroundDrawable;
            chatInputViewsContainer.drawInputBackground = false;
            chatInputViewsContainer.invalidate();
            this.animateEnterView.setAlpha(0.0f);
            this.animateEnterView.sendButtonContainer.setVisibility(4);
            updateAnimatingLocations();
            float f = z ? 0.0f : 1.0f;
            this.animateOpenProgress = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.animatingOpen = true;
            this.container.invalidate();
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda24
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RichEditor.$r8$lambda$w4qDwUkzVIrPulHllhCK2YV0Ce0(RichEditor.this, valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.iv.RichEditor.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    RichEditor.this.animatingOpen = false;
                    RichEditor.this.animateEnterView.setAlpha(1.0f);
                    RichEditor.this.animateEnterView.sendButtonContainer.setVisibility(0);
                    RichEditor.this.animateInputBackground.setRadius(AndroidUtilities.dp(22.0f));
                    RichEditor.this.animateInputBackground.setAlpha(NotificationCenter.didReceiveSmsCode);
                    RichEditor.this.animateInputView.drawInputBackground = true;
                    RichEditor.this.animateInputView.invalidate();
                    runnable.run();
                }
            });
            if (!z) {
                FrameLayout frameLayout = this.topPanel;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f);
                FrameLayout frameLayout2 = this.topPanel;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.listView, (Property<RichEditorListView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.topGradient, (Property<View, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.bottomGradient, (Property<View, Float>) property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.topPanel;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.topPanel;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.listView, (Property<RichEditorListView, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.topGradient, (Property<View, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.bottomGradient, (Property<View, Float>) property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.container.post(new ArticleViewer$$ExternalSyntheticLambda23(animatorSet));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z, runnable);
    }

    public static /* synthetic */ void $r8$lambda$w4qDwUkzVIrPulHllhCK2YV0Ce0(RichEditor richEditor, ValueAnimator valueAnimator) {
        richEditor.getClass();
        richEditor.animateOpenProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        richEditor.updateAnimatingLocations();
        richEditor.listView.setTranslationX(AndroidUtilities.lerp(richEditor.animateEnterViewFrom[0] - richEditor.animateEnterViewTo[0], 0, richEditor.animateOpenProgress));
        richEditor.listView.setTranslationY(AndroidUtilities.lerp(richEditor.animateEnterViewFrom[1] - richEditor.animateEnterViewTo[1], 0, richEditor.animateOpenProgress));
        richEditor.container.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        RichEditorListView richEditorListView;
        int i;
        RichEditorListView richEditorListView2;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (i = this.initialSelectionStart) >= 0 && (richEditorListView2 = this.listView) != null) {
            int i2 = this.initialSelectionEnd;
            this.initialSelectionEnd = -1;
            this.initialSelectionStart = -1;
            richEditorListView2.applyInitialSelection(i, i2);
            return;
        }
        if (!z || z2) {
            return;
        }
        if ((this.initialRichMessage == null && this.initialHtml == null) || (richEditorListView = this.listView) == null) {
            return;
        }
        richEditorListView.focusForDraft();
    }

    public RichEditor setChatActivity(ChatActivity chatActivity) {
        this.chatActivity = chatActivity;
        return this;
    }

    public RichEditor setOnCleared(Runnable runnable) {
        this.onClearedCallback = runnable;
        return this;
    }

    public RichEditor setOnSent(Runnable runnable) {
        this.onSentCallback = runnable;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(final Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.premiumButtons.clear();
        this.container = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.iv.RichEditor.2
            private final Paint bgPaint = new Paint(1);
            private final Path clipPath = new Path();
            private final RectF rect = new RectF();
            private boolean touchStartedInBottomPanel;

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (RichEditor.this.listView.textSelectionHelper.isInSelectionMode() && RichEditor.this.listView.textSelectionOverlay.onTouchEvent(motionEvent)) {
                    return true;
                }
                int height = (!RichEditor.this.emojiSearchOpened || RichEditor.this.emojiView == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(RichEditor.this.emojiPadding, RichEditor.this.bottomInset), RichEditor.this.imeInset) : (int) RichEditor.this.emojiView.getY();
                if (motionEvent.getAction() == 0 && RichEditor.this.emojiViewVisible && motionEvent.getY() < height) {
                    RichEditor.this.hideEmojiPopup(true);
                }
                if ((motionEvent.getAction() != 0 || (motionEvent.getY() > getPaddingTop() + AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && RichEditor.this.listView.textSelectionOverlay.checkOnTap(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0) {
                    this.touchStartedInBottomPanel = RichEditor.this.bottomPanel.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(RichEditor.this.emojiPadding, RichEditor.this.bottomInset), RichEditor.this.imeInset)));
                }
                if (this.touchStartedInBottomPanel || !RichEditor.this.listView.handleSelectionTouch(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 47 || !keyEvent.isCtrlPressed()) {
                    if (RichEditor.this.listView.handleKeyEvent(keyEvent)) {
                        return true;
                    }
                    return super.dispatchKeyEvent(keyEvent);
                }
                RichEditor.this.saveDraftWithBulletin();
                return true;
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                this.bgPaint.setColor(Theme.multAlpha(RichEditor.this.getThemedColor(Theme.key_windowBackgroundWhite), RichEditor.this.animateOpenProgress));
                if (RichEditor.this.animatingOpen && RichEditor.this.animateInputBackground != null) {
                    this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                    this.rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, RichEditor.this.animateOpenProgress);
                    AndroidUtilities.lerp(RichEditor.this.animateFromRect, this.rect, RichEditor.this.animateOpenProgress, this.rect);
                    RichEditor.this.tempRect.set(RichEditor.this.animateInputBackground.getBounds());
                    BlurredBackgroundDrawable blurredBackgroundDrawable = RichEditor.this.animateInputBackground;
                    RectF rectF = this.rect;
                    blurredBackgroundDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    RichEditor.this.animateInputBackground.setRadius(lerp);
                    RichEditor.this.animateInputBackground.setAlpha((int) ((1.0f - RichEditor.this.animateOpenProgress) * 255.0f));
                    RichEditor.this.animateInputBackground.draw(canvas);
                    RichEditor.this.animateInputBackground.setBounds(RichEditor.this.tempRect);
                    this.rect.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                    canvas.drawRoundRect(this.rect, lerp, lerp, this.bgPaint);
                    if (RichEditor.this.animateEnterView != null) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.lerp(RichEditor.this.animateEnterViewFrom[0], RichEditor.this.animateEnterViewTo[0], RichEditor.this.animateOpenProgress), AndroidUtilities.lerp(RichEditor.this.animateEnterViewFrom[1], RichEditor.this.animateEnterViewTo[1], RichEditor.this.animateOpenProgress));
                        canvas.saveLayerAlpha(0.0f, 0.0f, RichEditor.this.animateEnterView.getWidth(), RichEditor.this.animateEnterView.getHeight(), (int) ((1.0f - RichEditor.this.animateOpenProgress) * 255.0f), 31);
                        RichEditor.this.animateEnterView.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                        canvas.save();
                        canvas.translate(AndroidUtilities.lerp(this.rect.right, (((RichEditor.this.bottomContainer.getX() + RichEditor.this.bottomInnerContainer.getX()) + RichEditor.this.bottomPanel.getX()) + RichEditor.this.sendButton.getX()) + RichEditor.this.sendButton.getWidth(), RichEditor.this.animateOpenProgress) - RichEditor.this.animateEnterView.sendButtonContainer.getWidth(), AndroidUtilities.lerp(this.rect.bottom, (((RichEditor.this.bottomContainer.getY() + RichEditor.this.bottomInnerContainer.getY()) + RichEditor.this.bottomPanel.getY()) + RichEditor.this.sendButton.getY()) + RichEditor.this.sendButton.getHeight(), RichEditor.this.animateOpenProgress) - RichEditor.this.animateEnterView.sendButtonContainer.getHeight());
                        canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), RichEditor.this.animateEnterView.sendButtonContainer.getWidth(), RichEditor.this.animateEnterView.sendButtonContainer.getHeight(), (int) ((1.0f - RichEditor.this.animateOpenProgress) * 255.0f), 31);
                        RichEditor.this.animateEnterView.sendButtonContainer.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    }
                    canvas.save();
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
                super.dispatchDraw(canvas);
            }
        };
        setHasOwnBackground(true);
        this.container.setFocusable(true);
        this.container.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.container.setDefaultFocusHighlightEnabled(false);
        }
        this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate = new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda12
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate
            public final void onSizeChanged(int i, boolean z) {
                RichEditor.this.onKeyboardSizeChanged(i, z);
            }
        };
        this.sizeDelegate = sizeNotifierFrameLayoutDelegate;
        this.container.addDelegate(sizeNotifierFrameLayoutDelegate);
        RichEditorListView richEditorListView = new RichEditorListView(context, this.currentAccount, getResourceProvider(), new 3());
        this.listView = richEditorListView;
        richEditorListView.setFileRefParentObject(this.editingMessageObject);
        this.container.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        this.container.addView(this.listView.getOverlayView(), LayoutHelper.createFrame(-1, -1.0f));
        TL_iv.RichMessage richMessage = this.initialRichMessage;
        if (richMessage != null) {
            this.listView.loadRichMessage(richMessage);
        } else {
            String str = this.initialHtml;
            if (str != null) {
                this.listView.loadHtml(this.initialHtmlBefore, str, this.initialHtmlAfter);
            } else {
                CharSequence charSequence = this.initialText;
                if (charSequence != null) {
                    this.listView.setInitialText(charSequence);
                }
            }
        }
        this.listView.resetHistoryBaseline();
        View view = new View(context);
        this.topGradient = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = Theme.key_windowBackgroundWhite;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i), Theme.multAlpha(getThemedColor(i), 0.0f)}));
        this.container.addView(this.topGradient, LayoutHelper.createFrame(-1, 68, 55));
        View view2 = new View(context);
        this.bottomGradient = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{Theme.multAlpha(getThemedColor(i), 0.0f), getThemedColor(i)}));
        this.container.addView(this.bottomGradient, LayoutHelper.createFrame(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.topPanel = frameLayout;
        frameLayout.setClipChildren(false);
        this.topPanel.setClipToPadding(false);
        this.container.addView(this.topPanel, LayoutHelper.createFrame(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.backButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.backButton;
        int themedColor = getThemedColor(i);
        int themedColor2 = getThemedColor(i);
        int i2 = Theme.key_listSelector;
        imageView3.setBackground(withShadow(Theme.createRadSelectorDrawable(themedColor, Theme.blendOver(themedColor2, getThemedColor(i2)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.backButton;
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        int themedColor3 = getThemedColor(i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        ScaleStateListAnimator.apply(this.backButton);
        this.backButton.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.backButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.$r8$lambda$4gGevx4l-BwDe_ZzqF37syC4Ed0(RichEditor.this, view3);
            }
        });
        this.topPanel.addView(this.backButton, LayoutHelper.createFrame(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.historyButtons = linearLayout;
        linearLayout.setOrientation(0);
        this.historyButtons.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.topPanel.addView(this.historyButtons, LayoutHelper.createFrame(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.undoButton = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.undoButton.setScaleType(scaleType);
        this.undoButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i2)));
        this.undoButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        ScaleStateListAnimator.apply(this.undoButton);
        this.undoButton.setContentDescription(LocaleController.getString(R.string.Undo));
        this.undoButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.listView.undo();
            }
        });
        this.historyButtons.addView(this.undoButton, LayoutHelper.createLinear(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.redoButton = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.redoButton.setScaleType(scaleType);
        this.redoButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i2)));
        this.redoButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        ScaleStateListAnimator.apply(this.redoButton);
        this.redoButton.setContentDescription(LocaleController.getString(R.string.Redo));
        this.redoButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.listView.redo();
            }
        });
        this.historyButtons.addView(this.redoButton, LayoutHelper.createLinear(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bottomContainer = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.bottomContainer.setClipToPadding(false);
        this.container.addView(this.bottomContainer, LayoutHelper.createFrame(-1, NotificationCenter.screenshotTook, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bottomInnerContainer = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.bottomInnerContainer.setClipToPadding(false);
        this.bottomContainer.addView(this.bottomInnerContainer, LayoutHelper.createFrame(-1, NotificationCenter.screenshotTook, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.bottomPanel = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.bottomPanel.setClipChildren(false);
        this.bottomPanel.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.bottomInnerContainer.addView(this.bottomPanel, LayoutHelper.createFrame(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.bulletinContainer = frameLayout4;
        this.bottomInnerContainer.addView(frameLayout4, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.aiButton = imageView7;
        imageView7.setImageDrawable(new AiButtonDrawable(context));
        this.aiButton.setScaleType(scaleType);
        this.aiButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.aiButton.setBackground(withShadow(Theme.createRadSelectorDrawable(getThemedColor(i), Theme.blendOver(getThemedColor(i), getThemedColor(i2)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.bottomPanel.addView(this.aiButton, LayoutHelper.createLinear(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ScaleStateListAnimator.apply(this.aiButton);
        ImageView imageView8 = this.aiButton;
        int i4 = R.string.AIEditor;
        imageView8.setContentDescription(LocaleController.getString(i4));
        this.aiButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.$r8$lambda$4biD02idL-VMjJvr3RaqGbXdw-c(RichEditor.this, view3);
            }
        });
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        frameLayout5.addView(frameLayout6, LayoutHelper.createFrame(-2, 44, 81));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) { // from class: org.telegram.ui.iv.RichEditor.4
            @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i5, int i6) {
                int mode2 = View.MeasureSpec.getMode(i5);
                int size = View.MeasureSpec.getSize(i5);
                if (mode2 == 1073741824) {
                    super.onMeasure(i5, i6);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i6);
                int measuredWidth = getMeasuredWidth();
                if (mode2 == Integer.MIN_VALUE) {
                    measuredWidth = Math.min(measuredWidth, size);
                }
                setMeasuredDimension(measuredWidth, getMeasuredHeight());
            }
        };
        this.blocksScrollView = horizontalScrollView;
        horizontalScrollView.setClipToOutline(true);
        this.blocksScrollView.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.iv.RichEditor.5
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view3, Outline outline) {
                outline.setRoundRect(0, 0, view3.getWidth(), view3.getHeight(), AndroidUtilities.dp(22.0f));
            }
        });
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.blocksLayout = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.blocksLayout.setOrientation(0);
        this.blocksScrollView.addView(this.blocksLayout);
        frameLayout6.addView(this.blocksScrollView, LayoutHelper.createFrame(-1, -1.0f));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(context, 24);
        this.emojiButton = chatActivityEnterViewAnimatedIconView;
        chatActivityEnterViewAnimatedIconView.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.emojiButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.emojiButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i), getThemedColor(i2), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
        this.blocksLayout.addView(this.emojiButton, LayoutHelper.createLinear(38, 38, 16));
        ScaleStateListAnimator.apply(this.emojiButton);
        this.emojiButton.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.emojiButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.toggleEmojiPopup();
            }
        });
        addBlockButton(R.drawable.iv_text, 1).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.$r8$lambda$UrQLAsmHnJQoydOmVFH1OsuI9Vw(RichEditor.this, context, view3);
            }
        });
        addBlockButton(R.drawable.iv_lists, 2, true).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.$r8$lambda$ju5AFPn31H05doo06Gn4PTFDx_A(RichEditor.this, view3);
            }
        });
        addBlockButton(R.drawable.iv_table, 4, true).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.$r8$lambda$_W84ZhMz3XzIh4BM0mod0XIgq_I(RichEditor.this, view3);
            }
        });
        int i5 = R.drawable.iv_math;
        addBlockButton(i5, 7, true).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.$r8$lambda$ksOa2zTYVTqzoTkbd32oqjfNmUQ(RichEditor.this, view3);
            }
        });
        ImageView imageView9 = new ImageView(context);
        this.addButton = imageView9;
        imageView9.setImageResource(R.drawable.outline_poll_attach_24);
        this.addButton.setScaleType(scaleType);
        this.addButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.addButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i), getThemedColor(i2), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.blocksLayout.addView(this.addButton, LayoutHelper.createLinear(38, 38, 16, 2, 0, 0, 0));
        ScaleStateListAnimator.apply(this.addButton);
        this.addButton.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.addButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.$r8$lambda$rTscU_tvcAFyv_tEpab5wVDR1D0(RichEditor.this, view3);
            }
        });
        this.bottomPanel.addView(frameLayout5, LayoutHelper.createLinear(0, 44, 1.0f));
        LinearLayout linearLayout4 = new LinearLayout(context) { // from class: org.telegram.ui.iv.RichEditor.6
            @Override // android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i6, int i7) {
                int size = View.MeasureSpec.getSize(i6);
                int paddingLeft = getPaddingLeft() + getPaddingRight();
                if (RichEditor.this.formattingLayout1 != null) {
                    RichEditor.this.formattingLayout1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) RichEditor.this.formattingLayout1.getLayoutParams();
                    paddingLeft += RichEditor.this.formattingLayout1.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                if (RichEditor.this.formattingLayout2 != null) {
                    RichEditor.this.formattingLayout2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) RichEditor.this.formattingLayout2.getLayoutParams();
                    paddingLeft += RichEditor.this.formattingLayout2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                if (RichEditor.this.formattingLayout3 != null) {
                    RichEditor.this.formattingLayout3.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) RichEditor.this.formattingLayout3.getLayoutParams();
                    paddingLeft += RichEditor.this.formattingLayout3.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                RichEditor.this.formattingScrollMaxWidth = Math.max(0, size - paddingLeft);
                super.onMeasure(i6, i7);
            }
        };
        this.formattingPanel = linearLayout4;
        linearLayout4.setOrientation(0);
        this.formattingPanel.setClipToPadding(false);
        this.formattingPanel.setClipChildren(false);
        this.formattingPanel.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.bottomContainer.addView(this.formattingPanel, LayoutHelper.createFrame(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.trashPanel = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.trashPanel.setClipToPadding(false);
        this.trashPanel.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.bottomContainer.addView(this.trashPanel, LayoutHelper.createFrame(80, 60, 81));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.trashPanelIcon = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        RLottieDrawable animatedDrawable = this.trashPanelIcon.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.setPlayInDirectionOfCustomEndFrame(true);
            animatedDrawable.setAutoRepeat(0);
            animatedDrawable.setCustomEndFrame(0);
        }
        this.trashPanelIcon.setScaleType(scaleType);
        this.trashPanelIcon.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.trashPanelIcon.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.trashPanel.addView(this.trashPanelIcon, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.formattingPanel.addView(frameLayout8, LayoutHelper.createFrame(-2, 44.0f));
        HorizontalScrollView horizontalScrollView2 = new HorizontalScrollView(context) { // from class: org.telegram.ui.iv.RichEditor.7
            private final GradientClip clip = new GradientClip();
            private final AnimatedFloat leftGradientAlpha;
            private final AnimatedFloat rightGradientAlpha;

            {
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.leftGradientAlpha = new AnimatedFloat(this, 300L, cubicBezierInterpolator);
                this.rightGradientAlpha = new AnimatedFloat(this, 300L, cubicBezierInterpolator);
            }

            @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i6, int i7) {
                int mode2 = View.MeasureSpec.getMode(i6);
                if (mode2 == 1073741824) {
                    super.onMeasure(i6, i7);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6), 0), i7);
                int measuredWidth = getMeasuredWidth();
                int i8 = RichEditor.this.formattingScrollMaxWidth;
                if (mode2 == Integer.MIN_VALUE) {
                    i8 = Math.min(i8, View.MeasureSpec.getSize(i6));
                }
                setMeasuredDimension(Math.min(measuredWidth, i8), getMeasuredHeight());
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                float f = this.leftGradientAlpha.set(canScrollHorizontally(-1));
                float f2 = this.rightGradientAlpha.set(canScrollHorizontally(1));
                if (f > 0.0f || f2 > 0.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(getScrollX(), 0.0f, getScrollX() + getWidth(), getHeight(), NotificationCenter.didReceiveSmsCode, 31);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                if (f > 0.0f || f2 > 0.0f) {
                    canvas2.save();
                    if (f > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(getScrollX(), 0.0f, getScrollX() + AndroidUtilities.dp(48.0f), getHeight());
                        this.clip.draw(canvas2, rectF, 0, f);
                    }
                    if (f2 > 0.0f) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set((getScrollX() + getWidth()) - AndroidUtilities.dp(48.0f), 0.0f, getScrollX() + getWidth(), getHeight());
                        this.clip.draw(canvas2, rectF2, 2, f2);
                    }
                    canvas2.restore();
                }
            }
        };
        this.formattingScrollView = horizontalScrollView2;
        horizontalScrollView2.setHorizontalScrollBarEnabled(false);
        this.formattingScrollView.setClipToOutline(true);
        this.formattingScrollView.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.iv.RichEditor.8
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view3, Outline outline) {
                outline.setRoundRect(0, 0, view3.getWidth(), view3.getHeight(), AndroidUtilities.dp(22.0f));
            }
        });
        frameLayout8.addView(this.formattingScrollView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.formattingPanelLayout = linearLayout5;
        linearLayout5.setOrientation(0);
        this.formattingPanelLayout.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.formattingScrollView.addView(this.formattingPanelLayout, new FrameLayout.LayoutParams(-2, -1));
        addFormattingButton(context, R.drawable.formatting_bold, 1);
        addFormattingButton(context, R.drawable.formatting_italic, 2);
        addFormattingButton(context, R.drawable.formatting_underline, 16);
        addFormattingButton(context, R.drawable.formatting_strikethrough, 8);
        addFormattingButton(context, R.drawable.formatting_spoiler, 256);
        addFormattingButton(context, R.drawable.iv_code, 4);
        addFormattingButton(context, R.drawable.formatting_marked, 65536, true);
        addFormattingButton(context, R.drawable.iv_sub, 16384, true);
        addFormattingButton(context, R.drawable.iv_super, 32768, true);
        Button button = new Button(context, R.drawable.iv_quote, getResourceProvider());
        this.quoteButton = button;
        button.setContentDescription(LocaleController.getString(R.string.Quote));
        this.quoteButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.$r8$lambda$68YcMyw1_suhfWN_6X7bsPmpBmY(RichEditor.this, view3);
            }
        });
        LinearLayout linearLayout6 = this.formattingPanelLayout;
        linearLayout6.addView(this.quoteButton, LayoutHelper.createLinear(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        Button button2 = new Button(context, R.drawable.iv_button, getResourceProvider());
        this.inlineButton = button2;
        button2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.inlineButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.listView.onInlineButtonClicked(view3);
            }
        });
        LinearLayout linearLayout7 = this.formattingPanelLayout;
        linearLayout7.addView(this.inlineButton, LayoutHelper.createLinear(38, 38, 16, linearLayout7.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.formattingLayout2 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.formattingLayout2.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.formattingLayout2.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.formattingPanel.addView(this.formattingLayout2, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        Button button3 = new Button(context, R.drawable.media_link_24, getResourceProvider());
        this.linkButton = button3;
        button3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.linkButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.listView.onLinkClicked();
            }
        });
        this.formattingLayout2.addView(this.linkButton, LayoutHelper.createLinear(38, 38, 16));
        Button button4 = new Button(context, R.drawable.msg_calendar2, getResourceProvider());
        this.dateButton = button4;
        button4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.dateButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.listView.onDateClicked();
            }
        });
        this.formattingLayout2.addView(this.dateButton, LayoutHelper.createLinear(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.formattingLayout3 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.formattingLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.formattingLayout3.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.formattingPanel.addView(this.formattingLayout3, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        Button button5 = new Button(context, i5, getResourceProvider());
        this.mathButton = button5;
        button5.setPremium();
        this.premiumButtons.add(this.mathButton);
        this.mathButton.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.mathButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.listView.onMathClicked();
            }
        });
        this.formattingLayout3.addView(this.mathButton, LayoutHelper.createLinear(38, 38, 16));
        LinearLayout linearLayout10 = new LinearLayout(context);
        this.formattingLayout1 = linearLayout10;
        linearLayout10.setOrientation(0);
        this.formattingLayout1.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.formattingLayout1.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.formattingPanel.addView(this.formattingLayout1, 0, LayoutHelper.createFrame(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        Button button6 = new Button(context, 0, getResourceProvider());
        this.aiStyleButton = button6;
        button6.setImageDrawable(new AiButtonDrawable(context));
        this.aiStyleButton.setContentDescription(LocaleController.getString(i4));
        this.aiStyleButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.onAiStyleSelection();
            }
        });
        this.formattingLayout1.addView(this.aiStyleButton, LayoutHelper.createLinear(38, 38, 16));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, this.editingMessageObject != null ? R.drawable.input_done : isInScheduleMode() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider(), true) { // from class: org.telegram.ui.iv.RichEditor.9
            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean isOpen() {
                return RichEditor.this.sendButtonLoading || super.isOpen();
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean isInScheduleMode() {
                return RichEditor.this.isInScheduleMode();
            }
        };
        this.sendButton = sendButton;
        sendButton.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_chat_messagePanelSend))));
        ScaleStateListAnimator.apply(this.sendButton);
        this.bottomPanel.addView(this.sendButton, LayoutHelper.createLinear(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.sendButton.setContentDescription(LocaleController.getString(R.string.Send));
        this.sendButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.sendMessage();
            }
        });
        this.sendButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda11
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                boolean onSendLongClick;
                onSendLongClick = RichEditor.this.onSendLongClick(view3);
                return onSendLongClick;
            }
        });
        updateSendButtonLock();
        this.container.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        checkUI_listViewPadding();
        updateBottomPanel(0, false);
        updateHistoryButtons();
        this.container.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda13
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view3, View view4) {
                RichEditor.this.updateBlockButtons();
            }
        });
        updatePremiumButtons();
        if (this.convertToSimpleOnOpen) {
            this.listView.convertToSimple();
            this.convertToSimpleOnOpen = false;
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.container;
        this.fragmentView = sizeNotifierFrameLayout;
        return sizeNotifierFrameLayout;
    }

    class 3 implements RichEditorListView.Delegate {
        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void makeEditTextFocusable(RichEditText richEditText, boolean z) {
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onListLayoutUpdated() {
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onListScrolled(int i) {
        }

        3() {
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public ItemOptions makeMenu(View view) {
            return ItemOptions.makeOptions(RichEditor.this, view);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onSelectionChanged() {
            RichEditor richEditor = RichEditor.this;
            richEditor.updateBottomPanel((richEditor.listView.isInSelectionMode() && RichEditor.this.listView.selectionHasInlineFormattable()) ? 1 : 0, true);
            RichEditor.this.updateFormattingButtons();
            RichEditor.this.updateBlockButtons();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onContentChanged() {
            RichEditor.this.updateSendButtonLoading();
            RichEditor.this.updateSendButtonLock();
            RichEditor.this.scheduleLimitCheck();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onHistoryChanged() {
            RichEditor.this.updateHistoryButtons();
            RichEditor.this.updateSendButtonLock();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onOpenAttachRequest(int i, int i2) {
            RichEditor.this.openAttach(i, i2);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onOpenLocationRequest(BlockRow blockRow) {
            RichEditor.this.openLocationPicker(blockRow);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onSlashSuggest(RichTextCell richTextCell, String str) {
            if (RichEditor.this.commandSuggestions == null) {
                RichEditor.this.commandSuggestions = new RichCommandSuggestions(new RichCommandSuggestions.MenuFactory() { // from class: org.telegram.ui.iv.RichEditor$3$$ExternalSyntheticLambda0
                    @Override // org.telegram.ui.iv.RichCommandSuggestions.MenuFactory
                    public final ItemOptions make(View view) {
                        ItemOptions makeOptions;
                        makeOptions = ItemOptions.makeOptions(RichEditor.this, view);
                        return makeOptions;
                    }
                }, RichEditor.this.getResourceProvider());
            }
            RichEditor.this.commandSuggestions.update(richTextCell, str);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onInlineButtonEditRequested(RichEditorListView.InlineButtonEdit inlineButtonEdit, View view) {
            ItemOptions dontFocus = ItemOptions.makeOptions(RichEditor.this, view).dontFocus();
            RichEditor richEditor = RichEditor.this;
            richEditor.currentMenuVisible = RichInlineButtonEditor.show(dontFocus, richEditor, richEditor.getContext(), RichEditor.this.getResourceProvider(), inlineButtonEdit);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onBlockButtonEditRequested(RichEditorListView.BlockButtonEdit blockButtonEdit, View view) {
            ItemOptions dontFocus = ItemOptions.makeOptions(RichEditor.this, view).dontFocus();
            RichEditor richEditor = RichEditor.this;
            richEditor.currentMenuVisible = RichInlineButtonEditor.showBlock(dontFocus, richEditor, richEditor.getContext(), RichEditor.this.getResourceProvider(), blockButtonEdit);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onReorderStart() {
            RichEditor richEditor = RichEditor.this;
            richEditor.reorderSavedPanelType = richEditor.bottomPanelType;
            RichEditor.this.setTrashHovered(false, false);
            RichEditor.this.updateBottomPanel(2, true);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public boolean onReorderMove(float f, float f2) {
            boolean isOverTrash = RichEditor.this.isOverTrash(f2);
            RichEditor.this.setTrashHovered(isOverTrash, true);
            return isOverTrash;
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onReorderEnd() {
            RichEditor.this.setTrashHovered(false, true);
            RichEditor richEditor = RichEditor.this;
            richEditor.updateBottomPanel(richEditor.reorderSavedPanelType != 2 ? RichEditor.this.reorderSavedPanelType : 0, true);
        }
    }

    public static /* synthetic */ void $r8$lambda$4gGevx4l-BwDe_ZzqF37syC4Ed0(RichEditor richEditor, View view) {
        if (richEditor.listView.deselectIfAny()) {
            return;
        }
        richEditor.finishFragment();
    }

    public static /* synthetic */ void $r8$lambda$4biD02idL-VMjJvr3RaqGbXdw-c(final RichEditor richEditor, View view) {
        if (richEditor.listView.isInSelectionMode()) {
            richEditor.onAiStyleSelection();
        } else {
            new RichAIComposeSheet(richEditor.getContext(), richEditor.currentAccount, richEditor.getResourceProvider(), new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda50
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    RichEditor.this.listView.addRichMessage((TL_iv.RichMessage) obj);
                }
            }).show();
        }
    }

    public static /* synthetic */ void $r8$lambda$UrQLAsmHnJQoydOmVFH1OsuI9Vw(final RichEditor richEditor, Context context, View view) {
        ItemOptions itemOptions = richEditor.currentMenuVisible;
        if (itemOptions != null) {
            itemOptions.dismiss();
            richEditor.currentMenuVisible = null;
        }
        boolean z = (MessagesController.getInstance(richEditor.currentAccount).richEditorAllowed() || UserConfig.getInstance(richEditor.currentAccount).isPremium()) ? false : true;
        final BlockRow findFocusedRow = richEditor.listView.findFocusedRow();
        final ItemOptions dontFocus = ItemOptions.makeOptions((BaseFragment) richEditor, view, true).dontFocus();
        final ItemOptions makeSwipeback = dontFocus.makeSwipeback();
        makeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                ItemOptions.this.closeSwipeback();
            }
        });
        makeSwipeback.addGap();
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$vDvpaa-xTjkUakyRWvcE4wUA5yY(RichEditor.this, findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize + 2);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$qBgqSiYCXNTH9h40bC-u8vr2Q50(RichEditor.this, findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize + 1);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$b-o8X0wrWBdEnttjAo3Uqm-Fplo(RichEditor.this, findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$cfb4sYQ0e7RCBovAzyNAUlqS2Yo(RichEditor.this, findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 1);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$DlUVS3ntE3WFISpTF7TIErcFpKc(RichEditor.this, findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 2);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$QXjFETsyZ0Cjb86RXsvDftryqhs(RichEditor.this, findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 3);
        boolean z2 = findFocusedRow != null && RichEditorListView.isHeading(findFocusedRow.block);
        RequiresPremiumDrawable premium = new RequiresPremiumDrawable(context, R.drawable.iv_h).setPremium(z);
        int i = Theme.key_actionBarDefaultSubmenuBackground;
        dontFocus.addChecked(z2, premium.setCutoutColorKey(i), LocaleController.getString(R.string.ArticleHeading), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda39
            @Override // java.lang.Runnable
            public final void run() {
                ItemOptions.this.openSwipeback(makeSwipeback);
            }
        });
        dontFocus.getLast().textView.setTypeface(AndroidUtilities.bold());
        dontFocus.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, LocaleController.getString(R.string.ArticleText), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnIntoKeepList(findFocusedRow, new TL_iv.pageBlockParagraph());
            }
        });
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnInto(findFocusedRow, RichEditorListView.newBlockquote(), 0, 0, false, false);
            }
        });
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockPullquote), new RequiresPremiumDrawable(context, R.drawable.iv_pullquote).setPremium(z).setCutoutColorKey(i), LocaleController.getString(R.string.ArticlePullquote), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnInto(findFocusedRow, RichEditorListView.newPullquote(), 0, 0, false, false);
            }
        });
        dontFocus.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnIntoKeepList(findFocusedRow, new TL_iv.pageBlockPreformatted());
            }
        });
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockFooter), new RequiresPremiumDrawable(context, R.drawable.iv_footer).setPremium(z).setCutoutColorKey(i), LocaleController.getString(R.string.ArticleFooter), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnIntoKeepList(findFocusedRow, new TL_iv.pageBlockFooter());
            }
        });
        dontFocus.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        richEditor.currentMenuVisible = dontFocus.show();
    }

    public static /* synthetic */ void $r8$lambda$vDvpaa-xTjkUakyRWvcE4wUA5yY(RichEditor richEditor, BlockRow blockRow, ItemOptions itemOptions) {
        richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockHeading1());
        itemOptions.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$qBgqSiYCXNTH9h40bC-u8vr2Q50(RichEditor richEditor, BlockRow blockRow, ItemOptions itemOptions) {
        richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockHeading2());
        itemOptions.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$b-o8X0wrWBdEnttjAo3Uqm-Fplo(RichEditor richEditor, BlockRow blockRow, ItemOptions itemOptions) {
        richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockHeading3());
        itemOptions.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$cfb4sYQ0e7RCBovAzyNAUlqS2Yo(RichEditor richEditor, BlockRow blockRow, ItemOptions itemOptions) {
        richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockHeading4());
        itemOptions.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$DlUVS3ntE3WFISpTF7TIErcFpKc(RichEditor richEditor, BlockRow blockRow, ItemOptions itemOptions) {
        richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockHeading5());
        itemOptions.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$QXjFETsyZ0Cjb86RXsvDftryqhs(RichEditor richEditor, BlockRow blockRow, ItemOptions itemOptions) {
        richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockHeading6());
        itemOptions.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$ju5AFPn31H05doo06Gn4PTFDx_A(final RichEditor richEditor, View view) {
        ItemOptions itemOptions = richEditor.currentMenuVisible;
        if (itemOptions != null) {
            itemOptions.dismiss();
            richEditor.currentMenuVisible = null;
        }
        final ItemOptions dontFocus = ItemOptions.makeOptions(richEditor, view).dontFocus();
        final BlockRow findFocusedRow = richEditor.listView.findFocusedRow();
        boolean z = false;
        ItemOptions addChecked = dontFocus.addChecked(findFocusedRow == null || !findFocusedRow.isInList(), R.drawable.field_carret_empty, LocaleController.getString(R.string.ArticleNone), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda51
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnIntoList(findFocusedRow, 0);
            }
        }).addChecked((findFocusedRow == null || !findFocusedRow.isInList() || findFocusedRow.isChecklist() || findFocusedRow.isOrdered()) ? false : true, R.drawable.iv_list, LocaleController.getString(R.string.ArticleListBulletedList), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnIntoList(findFocusedRow, 1);
            }
        }).addChecked(findFocusedRow != null && findFocusedRow.isInList() && !findFocusedRow.isChecklist() && findFocusedRow.isOrdered(), R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleListNumberedList), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnIntoList(findFocusedRow, 2);
            }
        }).addChecked(findFocusedRow != null && findFocusedRow.isInList() && findFocusedRow.isChecklist() && !findFocusedRow.isOrdered(), R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListChecklist), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda54
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.listView.turnIntoList(findFocusedRow, 3);
            }
        });
        if (findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockDetails)) {
            z = true;
        }
        int i = R.drawable.iv_details;
        String string = LocaleController.getString(R.string.ArticleToggleBlock);
        RichEditorListView richEditorListView = richEditor.listView;
        Objects.requireNonNull(richEditorListView);
        addChecked.addChecked(z, i, string, new ChatAttachAlertRichLayout$$ExternalSyntheticLambda30(richEditorListView));
        boolean canIndentSelection = richEditor.listView.canIndentSelection();
        boolean canOutdentSelection = richEditor.listView.canOutdentSelection();
        if (canIndentSelection || canOutdentSelection) {
            dontFocus.addGap();
            if (canIndentSelection) {
                dontFocus.add(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda55
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditor.$r8$lambda$O4gPlpnlu692INSExp0-DSN92w0(RichEditor.this, dontFocus);
                    }
                });
            }
            if (canOutdentSelection) {
                dontFocus.add(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda56
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditor.$r8$lambda$8H6Wnc1oj1QtU0_b5VykgtLK9q4(RichEditor.this, dontFocus);
                    }
                });
            }
        }
        richEditor.currentMenuVisible = dontFocus.forceTop(true).show();
    }

    public static /* synthetic */ void $r8$lambda$O4gPlpnlu692INSExp0-DSN92w0(RichEditor richEditor, ItemOptions itemOptions) {
        richEditor.listView.indentSelection(false);
        itemOptions.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$8H6Wnc1oj1QtU0_b5VykgtLK9q4(RichEditor richEditor, ItemOptions itemOptions) {
        richEditor.listView.indentSelection(true);
        itemOptions.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$_W84ZhMz3XzIh4BM0mod0XIgq_I(RichEditor richEditor, View view) {
        RichTableCell findFocusedTableCell;
        TL_iv.pageTableCell focusedCellOf;
        ItemOptions itemOptions = richEditor.currentMenuVisible;
        if (itemOptions != null) {
            itemOptions.dismiss();
            richEditor.currentMenuVisible = null;
        }
        RichEditorListView richEditorListView = richEditor.listView;
        RichTableCell richTableCell = richEditorListView.activeCellSelectionTable;
        if (richTableCell == null && (findFocusedTableCell = richEditorListView.findFocusedTableCell()) != null && findFocusedTableCell.getModel() != null && (focusedCellOf = richEditor.listView.focusedCellOf(findFocusedTableCell)) != null) {
            richEditor.listView.enterCellSelectionMode(findFocusedTableCell, focusedCellOf);
            richTableCell = findFocusedTableCell;
        }
        if (richTableCell != null && richTableCell.getModel() != null && richTableCell.hasCellSelection()) {
            richEditor.listView.showTableCellMenu(richTableCell);
        } else {
            richEditor.listView.addBlock(RichTextCell.newEmptyTable(2, 2));
        }
    }

    public static /* synthetic */ void $r8$lambda$ksOa2zTYVTqzoTkbd32oqjfNmUQ(final RichEditor richEditor, View view) {
        ItemOptions itemOptions = richEditor.currentMenuVisible;
        final TL_iv.pageBlockMath pageblockmath = null;
        if (itemOptions != null) {
            itemOptions.dismiss();
            richEditor.currentMenuVisible = null;
        }
        BlockRow findFocusedRow = richEditor.listView.findFocusedRow();
        if (findFocusedRow != null) {
            TL_iv.PageBlock pageBlock = findFocusedRow.block;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
            }
        }
        ChatAttachAlertRichLayout.showEditLatexSheet(richEditor.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda49
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                RichEditor.$r8$lambda$4_jb_63GAI1helO7CAoi7puoENw(RichEditor.this, pageblockmath, (String) obj);
            }
        }, richEditor.getResourceProvider());
    }

    public static /* synthetic */ void $r8$lambda$4_jb_63GAI1helO7CAoi7puoENw(RichEditor richEditor, TL_iv.pageBlockMath pageblockmath, String str) {
        richEditor.getClass();
        if (pageblockmath != null) {
            pageblockmath.source = str;
            richEditor.listView.adapter.update(false);
        } else {
            TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
            pageblockmath2.source = str;
            richEditor.listView.addBlock(pageblockmath2);
        }
    }

    public static /* synthetic */ void $r8$lambda$rTscU_tvcAFyv_tEpab5wVDR1D0(RichEditor richEditor, View view) {
        richEditor.listView.pendingMediaRow = null;
        richEditor.openAttach();
    }

    public static /* synthetic */ void $r8$lambda$68YcMyw1_suhfWN_6X7bsPmpBmY(RichEditor richEditor, View view) {
        richEditor.listView.toggleQuoteOnSelection();
        richEditor.updateFormattingButtons();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView == null || !richEditorListView.textSelectionHelper.isInSelectionMode()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOverTrash(float f) {
        FrameLayout frameLayout = this.trashPanel;
        if (frameLayout == null) {
            return false;
        }
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        return f >= ((float) iArr[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrashHovered(boolean z, boolean z2) {
        if (this.trashHovered == z && z2) {
            return;
        }
        this.trashHovered = z;
        float f = z ? 1.15f : 1.0f;
        if (z2) {
            this.trashPanelIcon.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else {
            this.trashPanelIcon.animate().cancel();
            this.trashPanelIcon.setScaleX(f);
            this.trashPanelIcon.setScaleY(f);
        }
        this.trashPanelIcon.setColorFilter(new PorterDuffColorFilter(getThemedColor(z ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN));
        RLottieDrawable animatedDrawable = this.trashPanelIcon.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z) {
                if (animatedDrawable.getCurrentFrame() > 34) {
                    animatedDrawable.setCurrentFrame(0, false);
                }
                animatedDrawable.setCustomEndFrame(33);
            } else {
                animatedDrawable.setCustomEndFrame(0);
            }
            animatedDrawable.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBottomPanel(int i, boolean z) {
        if (this.bottomPanelType == i) {
            return;
        }
        this.bottomPanelType = i;
        if (z) {
            this.bottomPanel.setVisibility(0);
            ViewPropertyAnimator duration = this.bottomPanel.animate().alpha(this.bottomPanelType == 0 ? 1.0f : 0.0f).scaleX(this.bottomPanelType == 0 ? 1.0f : 0.8f).scaleY(this.bottomPanelType == 0 ? 1.0f : 0.8f).translationY(this.bottomPanelType == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.$r8$lambda$Dqq-ewMoolDeTO6ymIX1zdfrJNc(RichEditor.this);
                }
            }).start();
            this.formattingPanel.setVisibility(0);
            this.formattingPanel.animate().alpha(this.bottomPanelType == 1 ? 1.0f : 0.0f).scaleX(this.bottomPanelType == 1 ? 1.0f : 0.8f).scaleY(this.bottomPanelType == 1 ? 1.0f : 0.8f).translationY(this.bottomPanelType == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.$r8$lambda$24qlEaMNPF2SSG5CMYGAwqfg2_E(RichEditor.this);
                }
            }).start();
            this.trashPanel.setVisibility(0);
            this.trashPanel.animate().alpha(this.bottomPanelType == 2 ? 1.0f : 0.0f).scaleX(this.bottomPanelType == 2 ? 1.0f : 0.8f).scaleY(this.bottomPanelType == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.$r8$lambda$HybCnjoB4yQY5ej-3eBeGdDWauA(RichEditor.this);
                }
            }).start();
            return;
        }
        this.bottomPanel.setVisibility(i == 0 ? 0 : 8);
        this.bottomPanel.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.bottomPanel.setScaleX(i == 0 ? 1.0f : 0.8f);
        this.bottomPanel.setScaleY(i == 0 ? 1.0f : 0.8f);
        this.bottomPanel.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.formattingPanel.setVisibility(i == 1 ? 0 : 8);
        this.formattingPanel.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.formattingPanel.setScaleX(i == 1 ? 1.0f : 0.8f);
        this.formattingPanel.setScaleY(i == 1 ? 1.0f : 0.8f);
        this.formattingPanel.setTranslationY(i == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.trashPanel.setVisibility(i != 2 ? 8 : 0);
        this.trashPanel.setAlpha(i == 2 ? 1.0f : 0.0f);
        this.trashPanel.setScaleX(i == 2 ? 1.0f : 0.8f);
        this.trashPanel.setScaleY(i == 2 ? 1.0f : 0.8f);
    }

    public static /* synthetic */ void $r8$lambda$Dqq-ewMoolDeTO6ymIX1zdfrJNc(RichEditor richEditor) {
        if (richEditor.bottomPanelType != 0) {
            richEditor.bottomPanel.setVisibility(8);
        }
    }

    public static /* synthetic */ void $r8$lambda$24qlEaMNPF2SSG5CMYGAwqfg2_E(RichEditor richEditor) {
        if (richEditor.bottomPanelType != 1) {
            richEditor.formattingPanel.setVisibility(8);
        }
    }

    public static /* synthetic */ void $r8$lambda$HybCnjoB4yQY5ej-3eBeGdDWauA(RichEditor richEditor) {
        if (richEditor.bottomPanelType != 2) {
            richEditor.trashPanel.setVisibility(8);
        }
    }

    public static class DraggingDrawable extends Drawable {
        private boolean dragging;
        private final Paint paint = new Paint(1);
        private final AnimatedFloat animatedDragging = new AnimatedFloat(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$DraggingDrawable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.DraggingDrawable.this.invalidateSelf();
            }
        }, 0, 420, CubicBezierInterpolator.EASE_OUT_QUINT);
        private int alpha = NotificationCenter.didReceiveSmsCode;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        public DraggingDrawable(int i) {
            setColor(i);
        }

        public void setColor(int i) {
            this.paint.setColor(i);
        }

        public void setDragging(boolean z) {
            if (this.dragging == z) {
                return;
            }
            this.dragging = z;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float f = this.animatedDragging.set(this.dragging);
            if (f <= 0.0f) {
                return;
            }
            this.paint.setAlpha((int) (this.alpha * f));
            this.paint.setShadowLayer(AndroidUtilities.dp(12.0f) * f, 0.0f, AndroidUtilities.dp(3.0f), Theme.multAlpha(805306368, f));
            Rect bounds = getBounds();
            float dp = AndroidUtilities.dp(8.0f) * f;
            float dp2 = AndroidUtilities.dp(0.0f) * f;
            float dp3 = AndroidUtilities.dp(12.0f) * f;
            canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (bounds.bottom - dp2) + (AndroidUtilities.dp(6.0f) * f), dp3, dp3, this.paint);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.alpha = i;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }
    }

    private Button addBlockButton(int i, int i2) {
        return addBlockButton(i, i2, false);
    }

    private Button addBlockButton(int i, int i2, boolean z) {
        Button button = new Button(this.blocksLayout.getContext(), i, getResourceProvider());
        if (z) {
            button.setPremium();
            this.premiumButtons.add(button);
        }
        button.setTag(Integer.valueOf(i2));
        button.setContentDescription(blockButtonContentDescription(i2));
        this.blockButtons.add(button);
        LinearLayout linearLayout = this.blocksLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return button;
    }

    static String blockButtonContentDescription(int i) {
        if (i == 1) {
            return LocaleController.getString(R.string.AccDescrIVTextStyle);
        }
        if (i == 2) {
            return LocaleController.getString(R.string.AccDescrIVListStyle);
        }
        if (i == 4) {
            return LocaleController.getString(R.string.AccDescrIVTable);
        }
        if (i == 7) {
            return LocaleController.getString(R.string.AccDescrIVFormula);
        }
        if (i != 9) {
            return null;
        }
        return LocaleController.getString(R.string.AccDescrIVDetails);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateBlockButtons() {
        BlockRow findFocusedRow;
        int i;
        int size;
        int i2;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        if (textSelectionHelper != null && textSelectionHelper.isInSelectionMode()) {
            int startCell = textSelectionHelper.getStartCell();
            findFocusedRow = startCell == textSelectionHelper.getEndCell() ? this.listView.rowForCell(startCell) : null;
        } else {
            findFocusedRow = this.listView.findFocusedRow();
        }
        if (this.listView.findFocusedTableCell() == null) {
            if (findFocusedRow != null) {
                if (!findFocusedRow.isChecklist() && !findFocusedRow.isInList() && !findFocusedRow.isOrdered()) {
                    TL_iv.PageBlock pageBlock = findFocusedRow.block;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                i = 8;
                            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                                i = 1;
                            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                                i = 3;
                            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                                i = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i = 7;
                            }
                            ArrayList arrayList = this.blockButtons;
                            size = arrayList.size();
                            i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                Button button = (Button) obj;
                                int intValue = ((Integer) button.getTag()).intValue();
                                button.setSelected(i == intValue);
                                if (i == intValue) {
                                    button.setEnabled(true);
                                    if (findFocusedRow == null) {
                                        button.resetIcon();
                                    } else if (i == 1) {
                                        TL_iv.PageBlock pageBlock2 = findFocusedRow.block;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            button.updateIcon(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            button.updateIcon(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            button.updateIcon(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            button.updateIcon(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            button.updateIcon(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            button.updateIcon(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            button.updateIcon(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            button.updateIcon(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            button.updateIcon(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            button.updateIcon(R.drawable.iv_footer);
                                        } else {
                                            button.resetIcon();
                                        }
                                    } else if (i == 2) {
                                        if (findFocusedRow.isChecklist()) {
                                            button.updateIcon(R.drawable.iv_todo);
                                        } else if (findFocusedRow.isOrdered()) {
                                            button.updateIcon(R.drawable.iv_ordered_list);
                                        } else {
                                            button.resetIcon();
                                        }
                                    } else if (i == 8) {
                                        button.updateIcon(R.drawable.iv_details);
                                    } else {
                                        button.resetIcon();
                                    }
                                } else {
                                    button.setEnabled(i != 4);
                                    button.resetIcon();
                                }
                            }
                        }
                    }
                }
                i = 2;
                ArrayList arrayList2 = this.blockButtons;
                size = arrayList2.size();
                i2 = 0;
                while (i2 < size) {
                }
            }
            i = 0;
            ArrayList arrayList22 = this.blockButtons;
            size = arrayList22.size();
            i2 = 0;
            while (i2 < size) {
            }
        }
        i = 4;
        ArrayList arrayList222 = this.blockButtons;
        size = arrayList222.size();
        i2 = 0;
        while (i2 < size) {
        }
    }

    private void addFormattingButton(Context context, int i, int i2) {
        addFormattingButton(context, i, i2, false);
    }

    private void addFormattingButton(Context context, int i, final int i2, boolean z) {
        Button button = new Button(context, i, getResourceProvider());
        if (z) {
            button.setPremium();
            this.premiumButtons.add(button);
        }
        button.setTag(Integer.valueOf(i2));
        button.setContentDescription(formattingButtonContentDescription(i2));
        button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichEditor.this.listView.onFormattingClicked(i2);
            }
        });
        this.formattingButtons.add(button);
        LinearLayout linearLayout = this.formattingPanelLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    static String formattingButtonContentDescription(int i) {
        if (i == 1) {
            return LocaleController.getString(R.string.Bold);
        }
        if (i == 2) {
            return LocaleController.getString(R.string.Italic);
        }
        if (i == 16) {
            return LocaleController.getString(R.string.Underline);
        }
        if (i == 8) {
            return LocaleController.getString(R.string.Strike);
        }
        if (i == 256) {
            return LocaleController.getString(R.string.Spoiler);
        }
        if (i == 4) {
            return LocaleController.getString(R.string.Mono);
        }
        if (i == 65536) {
            return LocaleController.getString(R.string.Highlight);
        }
        if (i == 16384) {
            return LocaleController.getString(R.string.Subscript);
        }
        if (i == 32768) {
            return LocaleController.getString(R.string.Superscript);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFormattingButtons() {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        if (this.formattingButtons.isEmpty() || textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
            return;
        }
        Button button = this.quoteButton;
        if (button != null) {
            button.setSelected(this.listView.isSelectionQuoted());
        }
        if (this.listView.isTableSelection()) {
            updateFormattingButtonsTable();
            return;
        }
        if (this.listView.isCaptionSelection()) {
            updateFormattingButtonsCaption();
            return;
        }
        int startCell = textSelectionHelper.getStartCell();
        int endCell = textSelectionHelper.getEndCell();
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        boolean z = false;
        boolean z2 = startCell >= 0 && endCell >= 0 && endCell >= startCell && endCell < this.listView.itemRows.size();
        ArrayList arrayList = this.formattingButtons;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Button button2 = (Button) arrayList.get(i);
            button2.setSelected(z2 && this.listView.isStyleFullyApplied(((Integer) button2.getTag()).intValue(), startCell, startOffset, endCell, endOffset));
            i = i2;
        }
        setBoldEnabled(!this.listView.isSelectionAllHeadings());
        Button button3 = this.linkButton;
        if (button3 != null) {
            button3.setSelected(z2 && this.listView.isLinkApplied(startCell, startOffset, endCell, endOffset));
        }
        Button button4 = this.dateButton;
        if (button4 != null) {
            button4.setSelected(z2 && this.listView.isDateApplied(startCell, startOffset, endCell, endOffset));
        }
        if (z2 && startCell == endCell) {
            z = true;
        }
        setInlineButtonsEnabled(z, this.listView.canCreateInlineButtonOnSelection());
    }

    private void setBoldEnabled(boolean z) {
        ArrayList arrayList = this.formattingButtons;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Button button = (Button) obj;
            if (((Integer) button.getTag()).intValue() == 1) {
                button.setEnabled(z);
            }
        }
    }

    private void setInlineButtonsEnabled(boolean z, boolean z2) {
        Button button = this.linkButton;
        if (button != null) {
            button.setEnabled(z);
        }
        Button button2 = this.inlineButton;
        if (button2 != null) {
            button2.setEnabled(z2);
        }
        Button button3 = this.dateButton;
        if (button3 != null) {
            button3.setEnabled(z);
        }
        Button button4 = this.mathButton;
        if (button4 != null) {
            button4.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAiStyleSelection() {
        TL_iv.RichMessage extractRichMessage;
        RichEditorListView.SelectionEdit beginSelectionEdit = this.listView.beginSelectionEdit();
        if (beginSelectionEdit == null || (extractRichMessage = beginSelectionEdit.extractRichMessage()) == null || extractRichMessage.blocks.isEmpty()) {
            return;
        }
        new AIEditorAlert(getContext(), getResourceProvider()).setText(extractRichMessage).setOnUseRich(new ChatAttachAlertRichLayout$2$$ExternalSyntheticLambda0(beginSelectionEdit)).show();
    }

    private void updateFormattingButtonsTable() {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        int startCell = textSelectionHelper.getStartCell();
        int startChildPosition = textSelectionHelper.getStartChildPosition();
        int endChildPosition = textSelectionHelper.getEndChildPosition();
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        ArrayList arrayList = this.formattingButtons;
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Button button = (Button) arrayList.get(i);
            button.setSelected(this.listView.isStyleFullyAppliedTable(((Integer) button.getTag()).intValue(), startCell, startChildPosition, startOffset, endChildPosition, endOffset));
        }
        boolean z2 = startChildPosition == endChildPosition;
        RichEditText tableEditText = z2 ? this.listView.tableEditText(startCell, startChildPosition) : null;
        int max = Math.max(0, Math.min(startOffset, endOffset));
        int max2 = tableEditText == null ? 0 : Math.max(0, Math.min(Math.max(startOffset, endOffset), tableEditText.length()));
        Button button2 = this.linkButton;
        if (button2 != null) {
            button2.setSelected(tableEditText != null && max < max2 && RichTextStyle.hasLink(tableEditText.getText(), max, max2));
        }
        Button button3 = this.dateButton;
        if (button3 != null) {
            if (tableEditText != null && max < max2 && RichTextStyle.hasDate(tableEditText.getText(), max, max2)) {
                z = true;
            }
            button3.setSelected(z);
        }
        setBoldEnabled(true);
        setInlineButtonsEnabled(z2, this.listView.canCreateInlineButtonOnSelection());
    }

    private void updateFormattingButtonsCaption() {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        RichEditText captionEditText = this.listView.captionEditText(textSelectionHelper.getStartCell());
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        boolean z = false;
        int max = captionEditText == null ? 0 : Math.max(0, Math.min(Math.min(startOffset, endOffset), captionEditText.length()));
        int max2 = captionEditText == null ? 0 : Math.max(0, Math.min(Math.max(startOffset, endOffset), captionEditText.length()));
        ArrayList arrayList = this.formattingButtons;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            Button button = (Button) obj;
            int intValue = ((Integer) button.getTag()).intValue();
            if (captionEditText == null || max >= max2 || (intValue & captionEditText.getCurrentStyle(max, max2)) == 0) {
                z2 = false;
            }
            button.setSelected(z2);
        }
        Button button2 = this.linkButton;
        if (button2 != null) {
            button2.setSelected(captionEditText != null && max < max2 && RichTextStyle.hasLink(captionEditText.getText(), max, max2));
        }
        Button button3 = this.dateButton;
        if (button3 != null) {
            if (captionEditText != null && max < max2 && RichTextStyle.hasDate(captionEditText.getText(), max, max2)) {
                z = true;
            }
            button3.setSelected(z);
        }
        setBoldEnabled(true);
        setInlineButtonsEnabled(true, this.listView.canCreateInlineButtonOnSelection());
    }

    public static class Button extends ImageView implements Theme.Colorable {
        private boolean accent;
        private int backgroundColorKey;
        private int currentIcon;
        private boolean enabled;
        private boolean premium;
        private boolean premiumLocked;
        private Theme.ResourcesProvider resourcesProvider;
        private int roundRadius;
        private boolean selected;
        private int startIcon;

        public /* bridge */ /* synthetic */ int[] getColorKeys() {
            return Theme.Colorable.-CC.$default$getColorKeys(this);
        }

        public Button(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.roundRadius = 20;
            this.backgroundColorKey = Theme.key_windowBackgroundWhite;
            this.enabled = true;
            this.accent = true;
            this.currentIcon = i;
            this.startIcon = i;
            this.resourcesProvider = resourcesProvider;
            if (i != 0) {
                setImageResource(i);
            }
            setScaleType(ImageView.ScaleType.CENTER);
            ScaleStateListAnimator.apply(this);
            updateColors();
        }

        public Button setPremium() {
            this.premium = true;
            setImageDrawable(wrapPremium(this.currentIcon));
            return this;
        }

        public void setPremiumLocked(boolean z) {
            this.premiumLocked = z;
            if (getDrawable() instanceof RequiresPremiumDrawable) {
                ((RequiresPremiumDrawable) getDrawable()).setPremium(z);
            }
        }

        private RequiresPremiumDrawable wrapPremium(int i) {
            return new RequiresPremiumDrawable(getContext(), i).setCutoutColorKey(this.backgroundColorKey).setPremium(this.premiumLocked);
        }

        @Override // android.widget.ImageView, android.view.View
        public void setSelected(boolean z) {
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            updateColors();
        }

        public Button setAccent(boolean z) {
            if (this.accent == z) {
                return this;
            }
            this.accent = z;
            updateColors();
            return this;
        }

        @Override // android.view.View
        public void setEnabled(boolean z) {
            if (this.enabled == z) {
                return;
            }
            setClickable(z);
            ViewPropertyAnimator animate = animate();
            this.enabled = z;
            animate.alpha(z ? 1.0f : 0.5f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        }

        public void updateIcon(int i) {
            if (this.currentIcon == i) {
                return;
            }
            this.currentIcon = i;
            if (this.premium) {
                AndroidUtilities.updateImageViewImageAnimated(this, wrapPremium(i));
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, i);
            }
        }

        public void resetIcon() {
            updateIcon(this.startIcon);
        }

        public Button setRoundRadius(int i) {
            this.roundRadius = i;
            updateColors();
            return this;
        }

        public Button setBackgroundColorKey(int i) {
            if (this.backgroundColorKey == i) {
                return this;
            }
            this.backgroundColorKey = i;
            updateColors();
            return this;
        }

        @Override // org.telegram.ui.ActionBar.Theme.Colorable
        public void updateColors() {
            if (this.selected) {
                int color = Theme.getColor(this.accent ? Theme.key_featuredStickers_addButton : Theme.key_windowBackgroundWhiteBlackText);
                setBackground(Theme.createRadSelectorDrawable(Theme.blendOver(Theme.getColor(this.backgroundColorKey, this.resourcesProvider), Theme.multAlpha(color, 0.1f)), Theme.multAlpha(color, 0.1f), AndroidUtilities.dp(this.roundRadius), AndroidUtilities.dp(this.roundRadius)));
                setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            } else {
                setBackground(Theme.createRadSelectorDrawable(Theme.getColor(this.backgroundColorKey, this.resourcesProvider), Theme.getColor(Theme.key_listSelector, this.resourcesProvider), AndroidUtilities.dp(this.roundRadius), AndroidUtilities.dp(this.roundRadius)));
                setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static Drawable withShadow(Drawable drawable) {
        return new ShadowWrapperDrawable(drawable);
    }

    public static class RequiresPremiumDrawable extends Drawable {
        private final Context context;
        public final Drawable icon;
        private Drawable premiumIcon;
        private Drawable premiumIconCutout;
        private int premiumIconCutoutColor;
        private int premiumIconCutoutColorKey;
        public boolean showPremiumIcon;

        public RequiresPremiumDrawable(Context context, int i) {
            this(context, context.getResources().getDrawable(i).mutate());
        }

        public RequiresPremiumDrawable(Context context, Drawable drawable) {
            this.premiumIconCutoutColorKey = Theme.key_windowBackgroundWhite;
            this.showPremiumIcon = true;
            this.context = context;
            this.icon = drawable;
        }

        public RequiresPremiumDrawable setPremium(boolean z) {
            if (this.showPremiumIcon == z) {
                return this;
            }
            this.showPremiumIcon = z;
            invalidateSelf();
            return this;
        }

        public RequiresPremiumDrawable setCutoutColorKey(int i) {
            this.premiumIconCutoutColorKey = i;
            return this;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            Drawable drawable = this.icon;
            drawable.setBounds(centerX - (drawable.getIntrinsicWidth() / 2), centerY - (this.icon.getIntrinsicHeight() / 2), (this.icon.getIntrinsicWidth() / 2) + centerX, (this.icon.getIntrinsicHeight() / 2) + centerY);
            this.icon.draw(canvas);
            if (this.showPremiumIcon) {
                int dp = centerX + AndroidUtilities.dp(9.0f);
                int dp2 = centerY + AndroidUtilities.dp(9.0f);
                int color = Theme.getColor(this.premiumIconCutoutColorKey);
                if (this.premiumIconCutout == null) {
                    Drawable mutate = this.context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                    this.premiumIconCutout = mutate;
                    this.premiumIconCutoutColor = color;
                    mutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                if (color != this.premiumIconCutoutColor) {
                    Drawable drawable2 = this.premiumIconCutout;
                    this.premiumIconCutoutColor = color;
                    drawable2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                if (this.premiumIcon == null) {
                    this.premiumIcon = this.context.getResources().getDrawable(R.drawable.star_premium).mutate();
                }
                this.premiumIconCutout.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
                this.premiumIconCutout.draw(canvas);
                this.premiumIcon.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), dp + AndroidUtilities.dp(9.0f), dp2 + AndroidUtilities.dp(9.0f));
                this.premiumIcon.draw(canvas);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.icon.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.icon.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.icon.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return Math.max(AndroidUtilities.dp(38.0f), this.icon.getIntrinsicHeight());
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return Math.max(AndroidUtilities.dp(38.0f), this.icon.getIntrinsicWidth());
        }
    }

    private static class ShadowWrapperDrawable extends Drawable implements Drawable.Callback {
        private final Drawable inner;
        private final Outline outline;
        private boolean pathDirty;
        private final RectF rectF;
        private final Paint shadowPaint;
        private final Path shadowPath;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        ShadowWrapperDrawable(Drawable drawable) {
            Paint paint = new Paint(1);
            this.shadowPaint = paint;
            this.shadowPath = new Path();
            this.rectF = new RectF();
            this.outline = new Outline();
            this.pathDirty = true;
            this.inner = drawable;
            drawable.setCallback(this);
            paint.setColor(0);
            if (Theme.isCurrentThemeDark()) {
                paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), Theme.multAlpha(-16777216, 0.3f));
            } else {
                paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), Theme.multAlpha(-16777216, 0.1f));
            }
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            this.inner.setBounds(rect);
            this.pathDirty = true;
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
            return this.inner.isStateful();
        }

        @Override // android.graphics.drawable.Drawable
        protected boolean onStateChange(int[] iArr) {
            return this.inner.setState(iArr);
        }

        @Override // android.graphics.drawable.Drawable
        public void jumpToCurrentState() {
            this.inner.jumpToCurrentState();
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            this.inner.setHotspot(f, f2);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            this.inner.setHotspotBounds(i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void rebuildPath() {
            float radius;
            this.shadowPath.reset();
            this.rectF.set(getBounds());
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    this.inner.getOutline(this.outline);
                    radius = this.outline.getRadius();
                } catch (Throwable unused) {
                }
                if (radius <= 0.0f) {
                    this.shadowPath.addRoundRect(this.rectF, radius, radius, Path.Direction.CW);
                } else {
                    this.shadowPath.addRect(this.rectF, Path.Direction.CW);
                }
                this.pathDirty = false;
            }
            radius = -1.0f;
            if (radius <= 0.0f) {
            }
            this.pathDirty = false;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.pathDirty) {
                rebuildPath();
            }
            canvas.drawPath(this.shadowPath, this.shadowPaint);
            this.inner.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.inner.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.inner.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHistoryButtons() {
        boolean canUndo = this.listView.canUndo();
        boolean canRedo = this.listView.canRedo();
        ImageView imageView = this.undoButton;
        if (imageView != null) {
            imageView.setEnabled(canUndo);
            this.undoButton.setAlpha(canUndo ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.redoButton;
        if (imageView2 != null) {
            imageView2.setEnabled(canRedo);
            this.redoButton.setAlpha(canRedo ? 1.0f : 0.35f);
        }
    }

    private void openAttach() {
        openAttach(90, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openAttach(int i, int i2) {
        RichEditorListView richEditorListView = this.listView;
        richEditorListView.pendingInsertRow = richEditorListView.findFocusedRow();
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this, false, false, true, getResourceProvider());
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() { // from class: org.telegram.ui.iv.RichEditor.10
            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void didSelectBot(TLRPC.User user) {
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public boolean needEnterComment() {
                return false;
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void onCameraOpened() {
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onWallpaperSelected(this, obj);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$openAvatarsSearch(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$selectItemOnClicking(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$sendAudio(this, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void didPressedButton(int i3, boolean z, boolean z2, int i4, int i5, long j, boolean z3, boolean z4, long j2) {
                if (i3 == 7 || i3 == 8) {
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                    BlockRow blockRow = RichEditor.this.listView.pendingMediaRow;
                    RichEditor.this.listView.pendingMediaRow = null;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= selectedPhotosOrder.size()) {
                            break;
                        }
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i6));
                        if (!(obj instanceof MediaController.PhotoEntry)) {
                            i6++;
                        } else if (blockRow != null) {
                            RichEditor.this.listView.addMediaToRow(blockRow, (MediaController.PhotoEntry) obj);
                        } else {
                            RichEditor.this.listView.attachMedia((MediaController.PhotoEntry) obj);
                        }
                    }
                }
                RichEditor.this.listView.pendingMediaRow = null;
                chatAttachAlert.dismiss(true);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void doOnIdle(Runnable runnable) {
                NotificationCenter.getInstance(RichEditor.this.getCurrentAccount()).doOnIdle(runnable);
            }
        });
        chatAttachAlert.getPhotoLayout().setIncludeVideosInGallery(true);
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i);
        chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda57
            @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
            public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z, int i4, long j) {
                RichEditor.$r8$lambda$Sbz8JWBULLYclcV_B-k0GBIKfZ8(RichEditor.this, chatAttachAlert, messageMedia, i3, z, i4, j);
            }
        });
        chatAttachAlert.setAudioSelectDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda58
            @Override // org.telegram.ui.Components.ChatAttachAlertAudioLayout.AudioSelectDelegate
            public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                RichEditor.$r8$lambda$2l5aKb8mvoGLFoAbOuaS1yARxAo(RichEditor.this, chatAttachAlert, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }
        });
        chatAttachAlert.setDocumentsDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() { // from class: org.telegram.ui.iv.RichEditor.11
            @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
            public /* synthetic */ void didSelectPhotos(ArrayList arrayList, boolean z, int i3, int i4, long j) {
                ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.-CC.$default$didSelectPhotos(this, arrayList, z, i3, i4, j);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
            public /* synthetic */ void startMusicSelectActivity() {
                ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.-CC.$default$startMusicSelectActivity(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
            public void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    RichEditor.this.listView.attachDocument((String) arrayList.get(0));
                } else if (arrayList3 != null && !arrayList3.isEmpty()) {
                    RichEditor.this.listView.attachDocument((MessageObject) arrayList3.get(0));
                }
                chatAttachAlert.dismiss(true);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
            public void startDocumentSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                    RichEditor.this.startActivityForResult(intent, 21);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        });
        chatAttachAlert.init();
        if (i2 != 0) {
            chatAttachAlert.openAttachLayoutForType(i2);
        }
        chatAttachAlert.setFocusable(true);
        chatAttachAlert.show();
    }

    public static /* synthetic */ void $r8$lambda$Sbz8JWBULLYclcV_B-k0GBIKfZ8(RichEditor richEditor, ChatAttachAlert chatAttachAlert, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        richEditor.getClass();
        if (messageMedia == null || messageMedia.geo == null) {
            chatAttachAlert.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        richEditor.listView.addBlock(pageblockmap);
        chatAttachAlert.dismiss(true);
    }

    public static /* synthetic */ void $r8$lambda$2l5aKb8mvoGLFoAbOuaS1yARxAo(RichEditor richEditor, ChatAttachAlert chatAttachAlert, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        richEditor.getClass();
        if (arrayList != null && !arrayList.isEmpty()) {
            richEditor.listView.attachAudio((MessageObject) arrayList.get(0));
        }
        chatAttachAlert.dismiss(true);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 21) {
            if (intent == null || intent.getData() == null) {
                return;
            }
            this.listView.attachDocument(intent.getData());
            return;
        }
        if (i2 == -1 && (i == 1 || i == 14)) {
            if (intent == null || intent.getData() == null) {
                return;
            }
            this.listView.attachExternalMedia(intent.getData());
            return;
        }
        super.onActivityResultFragment(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSendButtonLoading() {
        if (this.sendButton == null) {
            return;
        }
        boolean hasPendingUploads = this.listView.hasPendingUploads();
        this.sendButtonLoading = hasPendingUploads;
        this.sendButton.setLoading(hasPendingUploads, -3.0f);
        this.sendButton.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleLimitCheck() {
        AndroidUtilities.cancelRunOnUIThread(this.limitCheckRunnable);
        AndroidUtilities.runOnUIThread(this.limitCheckRunnable, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSendButtonEnabled() {
        if (this.sendButton == null) {
            return;
        }
        boolean isWithinLimits = this.listView.isWithinLimits();
        this.sendButton.setEnabled(isWithinLimits);
        this.sendButton.animate().alpha(isWithinLimits ? 1.0f : 0.5f).setDuration(150L).start();
    }

    private boolean isSendLocked() {
        return (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium() || !this.listView.isLossy()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSendButtonLock() {
        ChatActivityEnterView.SendButton sendButton = this.sendButton;
        if (sendButton == null) {
            return;
        }
        sendButton.setLocked(isSendLocked());
    }

    private void showConversionSheet() {
        Context context = getContext();
        RichEditorListView richEditorListView = this.listView;
        Objects.requireNonNull(richEditorListView);
        openConversionSheet(context, new ChatAttachAlertRichLayout$$ExternalSyntheticLambda1(richEditorListView), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$5INSHd-Ix6t7Khuwx3ZH_RRyeSQ(RichEditor.this);
            }
        }, getResourceProvider());
    }

    public static /* synthetic */ void $r8$lambda$5INSHd-Ix6t7Khuwx3ZH_RRyeSQ(RichEditor richEditor) {
        if (UserConfig.getInstance(richEditor.currentAccount).isPremium()) {
            return;
        }
        richEditor.showDialog(new PremiumFeatureBottomSheet(richEditor, 43, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openLocationPicker(final BlockRow blockRow) {
        if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(this)) {
            final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this, false, false, false, getResourceProvider());
            chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() { // from class: org.telegram.ui.iv.RichEditor.12
                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void didSelectBot(TLRPC.User user) {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$didSelectBot(this, user);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void doOnIdle(Runnable runnable) {
                    runnable.run();
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ boolean needEnterComment() {
                    return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$needEnterComment(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void onCameraOpened() {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onCameraOpened(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void onWallpaperSelected(Object obj) {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onWallpaperSelected(this, obj);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void openAvatarsSearch() {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$openAvatarsSearch(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ boolean selectItemOnClicking() {
                    return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$selectItemOnClicking(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
                }
            });
            chatAttachAlert.setLocationPicker();
            chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda59
                @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
                    RichEditor.$r8$lambda$LatNvwt6leaGrnce25wqEPLMvqs(RichEditor.this, blockRow, chatAttachAlert, messageMedia, i, z, i2, j);
                }
            });
            chatAttachAlert.init();
            chatAttachAlert.show();
        }
    }

    public static /* synthetic */ void $r8$lambda$LatNvwt6leaGrnce25wqEPLMvqs(final RichEditor richEditor, final BlockRow blockRow, ChatAttachAlert chatAttachAlert, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        richEditor.getClass();
        if (messageMedia == null || messageMedia.geo == null) {
            return;
        }
        RichEditorHistory richEditorHistory = richEditor.listView.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) blockRow.block;
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
            pageblockmap.w = 600;
            pageblockmap.h = 400;
        }
        RichEditorHistory richEditorHistory2 = richEditor.listView.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        chatAttachAlert.dismiss(true);
        richEditor.listView.post(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$WR6_04kI1pdGoXHPPtNLWaMrfVs(RichEditor.this, blockRow);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$WR6_04kI1pdGoXHPPtNLWaMrfVs(RichEditor richEditor, BlockRow blockRow) {
        View findViewByItemObject = richEditor.listView.findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichMapCell) {
            ((RichMapCell) findViewByItemObject).bind(blockRow, richEditor.listView.getMapDelegate());
        } else {
            richEditor.listView.adapter.update(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInScheduleMode() {
        ChatActivity chatActivity;
        return this.editingMessageObject == null && (chatActivity = this.chatActivity) != null && chatActivity.isInScheduleMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMessage() {
        if (isSendLocked()) {
            showConversionSheet();
        } else if (isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.iv.RichEditor.13
                @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                public void didSelectDate(boolean z, int i, int i2) {
                    RichEditor.this.sendMessage(z, i, i2);
                }
            }, getResourceProvider());
        } else {
            sendMessage(true, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMessage(final boolean z, final int i, final int i2) {
        if (isSendLocked()) {
            showConversionSheet();
            return;
        }
        if (this.chatActivity == null || !this.listView.hasAnyText() || this.listView.hasPendingUploads()) {
            return;
        }
        if (!this.listView.isWithinLimits()) {
            updateSendButtonEnabled();
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            ChatActivityEnterView chatActivityEnterView = this.chatActivity.getChatActivityEnterView();
            if (chatActivityEnterView == null) {
                return;
            }
            this.sent = true;
            Runnable runnable = this.onSentCallback;
            if (runnable != null) {
                runnable.run();
            }
            chatActivityEnterView.sendConvertedRichAsSimple(this.listView.toSimpleMessage(), z, i, i2);
            finishFragment();
            return;
        }
        this.sent = true;
        final ArrayList flattenRowsToBlocks = this.listView.flattenRowsToBlocks();
        if (flattenRowsToBlocks.isEmpty()) {
            return;
        }
        final ArrayList collectPhotos = this.listView.collectPhotos();
        final ArrayList collectDocuments = this.listView.collectDocuments();
        final ArrayList collect = RichMessageButtonUsers.collect(this.currentAccount, flattenRowsToBlocks);
        final long dialogId = this.chatActivity.getDialogId();
        final MessageObject replyMessage = this.chatActivity.getReplyMessage();
        final MessageObject threadMessage = this.chatActivity.getThreadMessage();
        final long sendMonoForumPeerId = this.chatActivity.getSendMonoForumPeerId();
        final SendMessageChatArguments messageChatSendParams = this.chatActivity.getMessageChatSendParams();
        final MessageObject messageObject = this.editingMessageObject;
        Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.$r8$lambda$U_nVg49r5V-c_2xoSRFa0uSoudg(RichEditor.this, messageObject, flattenRowsToBlocks, collectPhotos, collectDocuments, collect, dialogId, replyMessage, threadMessage, z, i, i2, messageChatSendParams, sendMonoForumPeerId);
            }
        };
        Runnable runnable3 = this.onSentCallback;
        if (runnable3 != null) {
            runnable3.run();
        }
        if (i != 0 && messageObject == null) {
            this.pendingSend = runnable2;
            finishFragment();
        } else {
            runnable2.run();
            finishFragment();
        }
    }

    public static /* synthetic */ void $r8$lambda$U_nVg49r5V-c_2xoSRFa0uSoudg(RichEditor richEditor, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, SendMessageChatArguments sendMessageChatArguments, long j2) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(richEditor.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, richEditor.chatActivity);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(richEditor.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j, messageObject2, messageObject3, z, i, i2, sendMessageChatArguments, 0L, j2, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onSendLongClick(View view) {
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity == null || this.editingMessageObject != null || chatActivity.isInScheduleMode() || !this.listView.hasAnyText() || this.listView.hasPendingUploads()) {
            return false;
        }
        if (!this.listView.isWithinLimits()) {
            updateSendButtonEnabled();
            return false;
        }
        ArrayList<TL_iv.PageBlock> flattenRowsToBlocks = this.listView.flattenRowsToBlocks();
        if (flattenRowsToBlocks.isEmpty()) {
            return false;
        }
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            this.messageSendPreview = null;
        }
        MessageSendPreview messageSendPreview2 = new MessageSendPreview(getContext(), getResourceProvider());
        this.messageSendPreview = messageSendPreview2;
        messageSendPreview2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda44
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                RichEditor.this.messageSendPreview = null;
            }
        });
        final long dialogId = this.chatActivity.getDialogId();
        MessageObject replyMessage = this.chatActivity.getReplyMessage();
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 0;
        tL_message.out = true;
        tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(dialogId);
        tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
        tL_message.flags2 |= 8192;
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        tL_message.rich_message = richMessage;
        richMessage.blocks = flattenRowsToBlocks;
        richMessage.photos = this.listView.collectPhotos();
        tL_message.rich_message.documents = this.listView.collectDocuments();
        if (replyMessage != null && !replyMessage.isTopicMainMessage) {
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = replyMessage.getId();
            tL_message.reply_to = tL_messageReplyHeader;
        }
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        if (replyMessage != null && !replyMessage.isTopicMainMessage) {
            messageObject.replyMessageObject = replyMessage;
        }
        messageObject.sendPreview = true;
        messageObject.isOutOwnerCached = Boolean.TRUE;
        messageObject.generateLayout(null);
        messageObject.notime = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageObject);
        this.messageSendPreview.setMessageObjects(arrayList);
        this.sendButton.setScaleX(1.0f);
        this.sendButton.setScaleY(1.0f);
        ChatActivityEnterView.SendButton sendButton = this.messageSendPreview.setSendButton(this.sendButton, true, new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RichEditor.$r8$lambda$30DVmA0Yn9JNk6OW_K9xkQ4MBP0(RichEditor.this, view2);
            }
        });
        if (sendButton != null) {
            sendButton.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_featuredStickers_addButton))));
            this.messageSendPreview.setSendButtonWidth(AndroidUtilities.dp(44.0f));
        }
        ItemOptions makeOptions = ItemOptions.makeOptions(this, this.sendButton);
        boolean isUserSelf = UserObject.isUserSelf(this.chatActivity.getCurrentUser());
        if (this.chatActivity.canScheduleMessage()) {
            makeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46
                @Override // java.lang.Runnable
                public final void run() {
                    AlertsCreator.createScheduleDatePickerDialog(r0.getParentActivity(), dialogId, new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.iv.RichEditor.14
                        @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                        public void didSelectDate(boolean z, int i, int i2) {
                            RichEditor.this.sendMessage(z, i, i2);
                            if (RichEditor.this.messageSendPreview != null) {
                                RichEditor.this.messageSendPreview.dismissInstant();
                                RichEditor.this.messageSendPreview = null;
                            }
                        }
                    }, RichEditor.this.getResourceProvider());
                }
            });
            if (!isUserSelf && dialogId > 0) {
                makeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda47
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditor.$r8$lambda$MXiD9R5V9mFBwMAY4xdp6DPidf8(RichEditor.this);
                    }
                });
            }
        }
        if (!isUserSelf) {
            makeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.$r8$lambda$3tmTkwGsk7EZCGuvQndTFJyHKXY(RichEditor.this);
                }
            });
        }
        makeOptions.setupSelectors();
        this.messageSendPreview.setItemOptions(makeOptions);
        this.messageSendPreview.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void $r8$lambda$30DVmA0Yn9JNk6OW_K9xkQ4MBP0(RichEditor richEditor, View view) {
        richEditor.sendMessage();
        MessageSendPreview messageSendPreview = richEditor.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(true);
            richEditor.messageSendPreview = null;
        }
    }

    public static /* synthetic */ void $r8$lambda$MXiD9R5V9mFBwMAY4xdp6DPidf8(RichEditor richEditor) {
        richEditor.sendMessage(true, 2147483646, 0);
        MessageSendPreview messageSendPreview = richEditor.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            richEditor.messageSendPreview = null;
        }
    }

    public static /* synthetic */ void $r8$lambda$3tmTkwGsk7EZCGuvQndTFJyHKXY(RichEditor richEditor) {
        richEditor.sendMessage(false, 0, 0);
        MessageSendPreview messageSendPreview = richEditor.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(true);
            richEditor.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveDraftWithBulletin() {
        if (persistDraft()) {
            BulletinFactory.of(this.bulletinContainer, getResourceProvider()).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.RichEditorDraftSaved)).show();
        }
    }

    private boolean persistDraft() {
        Runnable runnable;
        if (this.chatActivity == null || this.editingMessageObject != null || !this.listView.canUndo()) {
            return false;
        }
        TL_iv.RichMessage buildDraftRichMessage = this.sent ? null : this.listView.buildDraftRichMessage();
        if (buildDraftRichMessage == null && (runnable = this.onClearedCallback) != null) {
            runnable.run();
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivity.getChatActivityEnterView();
        if (buildDraftRichMessage != null && !this.sent && this.listView.isSimpleConvertible() && chatActivityEnterView != null) {
            chatActivityEnterView.applyConvertedSimpleDraft(this.listView.toSimpleMessage());
            return true;
        }
        getMediaDataController().saveDraft(this.chatActivity.getDialogId(), this.chatActivity.getDraftThreadId(), "", null, null, null, null, 0L, false, false, buildDraftRichMessage);
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setRichDraftPreview(buildDraftRichMessage);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleEmojiPopup() {
        if (this.emojiViewVisible) {
            openKeyboardFromPopup();
        } else {
            showEmojiPopup();
        }
    }

    private void showEmojiPopup() {
        createEmojiView();
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = LayoutHelper.createFrame(-1, emojiPanelHeight, 87);
        } else {
            layoutParams.height = emojiPanelHeight;
        }
        layoutParams.bottomMargin = this.bottomInset;
        this.emojiView.setLayoutParams(layoutParams);
        this.emojiView.setVisibility(0);
        this.emojiViewVisible = true;
        this.emojiPadding = emojiPanelHeight + this.bottomInset;
        RichEditText findFocusedEditText = this.listView.findFocusedEditText();
        if (findFocusedEditText != null) {
            AndroidUtilities.hideKeyboard(findFocusedEditText);
        }
        applyEmojiPadding();
        this.emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideEmojiPopup(boolean z) {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(false);
                this.emojiView.hideSearchKeyboard();
            }
        }
        ValueAnimator valueAnimator = this.emojiSearchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.emojiSearchAnimator = null;
        }
        this.emojiSearchProgress = 0.0f;
        this.emojiTargetEditText = null;
        EmojiView emojiView2 = this.emojiView;
        if (emojiView2 != null) {
            emojiView2.setTranslationY(0.0f);
            this.emojiView.setVisibility(8);
        }
        if (this.emojiViewVisible || this.emojiPadding != 0) {
            this.emojiViewVisible = false;
            this.emojiPadding = 0;
            applyEmojiPadding();
        }
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
        if (chatActivityEnterViewAnimatedIconView != null) {
            chatActivityEnterViewAnimatedIconView.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, z);
        }
    }

    private void openKeyboardFromPopup() {
        hideEmojiPopup(true);
        RichEditText findFocusedEditText = this.listView.findFocusedEditText();
        if (findFocusedEditText != null) {
            findFocusedEditText.requestEditFocus();
            AndroidUtilities.showKeyboard(findFocusedEditText);
        }
    }

    private int getEmojiPanelHeight() {
        Point point = AndroidUtilities.displaySize;
        int i = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
        return i <= 0 ? AndroidUtilities.dp(200.0f) : i;
    }

    private void applyEmojiPadding() {
        checkUI_listViewPadding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateEmojiSearch(boolean z) {
        ValueAnimator valueAnimator = this.emojiSearchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.emojiSearchAnimator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.emojiSearchProgress, z ? 1.0f : 0.0f);
        this.emojiSearchAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                RichEditor.$r8$lambda$BKjJhXG1S_o3ePWdDRB7sjvhDbM(RichEditor.this, valueAnimator2);
            }
        });
        this.emojiSearchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.emojiSearchAnimator.setDuration(250L);
        this.emojiSearchAnimator.start();
    }

    public static /* synthetic */ void $r8$lambda$BKjJhXG1S_o3ePWdDRB7sjvhDbM(RichEditor richEditor, ValueAnimator valueAnimator) {
        richEditor.getClass();
        richEditor.emojiSearchProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        richEditor.applyEmojiSearchOffset();
    }

    private void closeEmojiSearch() {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(false);
                this.emojiView.hideSearchKeyboard();
            }
            animateEmojiSearch(false);
        }
    }

    private int getExpandedEmojiHeight() {
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.container;
        if (sizeNotifierFrameLayout == null) {
            return getEmojiPanelHeight();
        }
        return Math.max(getEmojiPanelHeight(), ((sizeNotifierFrameLayout.getMeasuredHeight() - this.container.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.bottomInset);
    }

    private void applyEmojiSearchOffset() {
        FrameLayout.LayoutParams layoutParams;
        EmojiView emojiView = this.emojiView;
        if (emojiView == null || (layoutParams = (FrameLayout.LayoutParams) emojiView.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round(getEmojiPanelHeight() + ((getExpandedEmojiHeight() - r1) * this.emojiSearchProgress));
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.emojiView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RichEditText resolveEmojiTarget() {
        RichEditText focusedEditTextOrNull = this.listView.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.emojiTargetEditText = focusedEditTextOrNull;
            this.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        RichEditText richEditText = this.emojiTargetEditText;
        return richEditText != null ? richEditText : this.listView.findFocusedEditText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int resolveEmojiTargetOffset(RichEditText richEditText) {
        if (richEditText == this.emojiTargetEditText && this.listView.getFocusedEditTextOrNull() != richEditText) {
            return Math.min(this.emojiTargetSelection, richEditText.length());
        }
        return Math.max(0, richEditText.getSelectionEnd());
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public WindowInsetsCompat onInsetsInternal(View view, WindowInsetsCompat windowInsetsCompat) {
        ItemOptions itemOptions;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars() | WindowInsetsCompat.Type.statusBars());
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        this.imeInset = i;
        int i2 = i - insets.bottom;
        boolean z = this.keyboardVisible;
        boolean z2 = i2 > AndroidUtilities.dp(20.0f);
        this.keyboardVisible = z2;
        if (z2 && i2 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.keyboardHeightLand = i2;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i2;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        if (this.keyboardVisible && !z && this.emojiViewVisible && !this.emojiSearchOpened) {
            hideEmojiPopup(false);
        }
        if (!this.keyboardVisible && z && (itemOptions = this.currentMenuVisible) != null) {
            itemOptions.dismiss();
            this.currentMenuVisible = null;
        }
        onInsets(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onInsets(int i, int i2, int i3, int i4) {
        this.bottomInset = i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.bottomGradient.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.bottomInset;
        this.bottomGradient.setLayoutParams(layoutParams);
        checkUI_listViewPadding();
    }

    private void checkUI_listViewPadding() {
        FrameLayout.LayoutParams layoutParams;
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && (layoutParams = (FrameLayout.LayoutParams) emojiView.getLayoutParams()) != null) {
            int i = layoutParams.bottomMargin;
            int i2 = this.bottomInset;
            if (i != i2) {
                layoutParams.bottomMargin = i2;
                this.emojiView.setLayoutParams(layoutParams);
            }
        }
        applyEmojiSearchOffset();
        int max = Math.max(Math.max(this.emojiPadding, this.bottomInset), this.imeInset);
        this.listView.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        this.listView.setInsets(this.bottomInset, this.imeInset, this.emojiPadding);
        this.bottomContainer.setTranslationY(-max);
        this.bottomGradient.setTranslationY(r0 + this.bottomInset);
    }

    private void createEmojiView() {
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView = new EmojiView(this, true, false, false, getContext(), true, null, this.container, true, getResourceProvider(), false);
        this.emojiView = emojiView;
        emojiView.setVisibility(8);
        EmojiView emojiView2 = this.emojiView;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.setDelegate(new EmojiView.EmojiViewDelegate() { // from class: org.telegram.ui.iv.RichEditor.15
            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean canAddCaptionToGif(TLRPC.Document document) {
                return EmojiView.EmojiViewDelegate.-CC.$default$canAddCaptionToGif(this, document);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean canSchedule() {
                return EmojiView.EmojiViewDelegate.-CC.$default$canSchedule(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ long getDialogId() {
                return EmojiView.EmojiViewDelegate.-CC.$default$getDialogId(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ float getProgressToSearchOpened() {
                return EmojiView.EmojiViewDelegate.-CC.$default$getProgressToSearchOpened(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ int getThreadId() {
                return EmojiView.EmojiViewDelegate.-CC.$default$getThreadId(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void invalidateEnterView() {
                EmojiView.EmojiViewDelegate.-CC.$default$invalidateEnterView(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean isExpanded() {
                return EmojiView.EmojiViewDelegate.-CC.$default$isExpanded(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean isInScheduleMode() {
                return EmojiView.EmojiViewDelegate.-CC.$default$isInScheduleMode(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean isUserSelf() {
                return EmojiView.EmojiViewDelegate.-CC.$default$isUserSelf(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onAnimatedEmojiUnlockClick() {
                EmojiView.EmojiViewDelegate.-CC.$default$onAnimatedEmojiUnlockClick(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onClearEmojiRecent() {
                EmojiView.EmojiViewDelegate.-CC.$default$onClearEmojiRecent(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.-CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.-CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
                EmojiView.EmojiViewDelegate.-CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickerSetAdd(this, stickerSetCovered);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickerSetRemove(this, stickerSetCovered);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickersGroupClick(long j) {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickersGroupClick(this, j);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onTabOpened(int i) {
                EmojiView.EmojiViewDelegate.-CC.$default$onTabOpened(this, i);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
                EmojiView.EmojiViewDelegate.-CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public void onSearchOpenClose(int i) {
                RichEditText focusedEditTextOrNull;
                if (i != 0 && (focusedEditTextOrNull = RichEditor.this.listView.getFocusedEditTextOrNull()) != null) {
                    RichEditor.this.emojiTargetEditText = focusedEditTextOrNull;
                    RichEditor.this.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                }
                RichEditor.this.emojiSearchOpened = i != 0;
                RichEditor richEditor = RichEditor.this;
                richEditor.animateEmojiSearch(richEditor.emojiSearchOpened);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public boolean isSearchOpened() {
                return RichEditor.this.emojiSearchOpened;
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public void onStickersSettingsClick() {
                RichEditor.this.presentFragment(new StickersActivity(0, null));
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public void onEmojiSettingsClick(ArrayList arrayList) {
                RichEditor.this.presentFragment(new StickersActivity(5, arrayList));
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public boolean onBackspace() {
                RichEditText resolveEmojiTarget = RichEditor.this.resolveEmojiTarget();
                if (resolveEmojiTarget == null || resolveEmojiTarget.length() == 0) {
                    return false;
                }
                resolveEmojiTarget.dispatchKeyEvent(new KeyEvent(0, 67));
                return true;
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public void onEmojiSelected(String str) {
                RichEditText resolveEmojiTarget = RichEditor.this.resolveEmojiTarget();
                if (resolveEmojiTarget == null) {
                    return;
                }
                int resolveEmojiTargetOffset = RichEditor.this.resolveEmojiTargetOffset(resolveEmojiTarget);
                try {
                    CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, resolveEmojiTarget.getPaint().getFontMetricsInt(), false, (int[]) null);
                    resolveEmojiTarget.setText(resolveEmojiTarget.getText().insert(resolveEmojiTargetOffset, replaceEmoji));
                    int length = resolveEmojiTargetOffset + replaceEmoji.length();
                    resolveEmojiTarget.setSelection(length, length);
                    if (resolveEmojiTarget == RichEditor.this.emojiTargetEditText) {
                        RichEditor.this.emojiTargetSelection = length;
                    }
                } catch (Exception unused) {
                }
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
                AnimatedEmojiSpan animatedEmojiSpan;
                RichEditText resolveEmojiTarget = RichEditor.this.resolveEmojiTarget();
                if (resolveEmojiTarget == null) {
                    return;
                }
                int resolveEmojiTargetOffset = RichEditor.this.resolveEmojiTargetOffset(resolveEmojiTarget);
                try {
                    if (str == null) {
                        str = "😀";
                    }
                    SpannableString spannableString = new SpannableString(str);
                    if (document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(document, resolveEmojiTarget.getPaint().getFontMetricsInt());
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(j, resolveEmojiTarget.getPaint().getFontMetricsInt());
                    }
                    animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    resolveEmojiTarget.setText(resolveEmojiTarget.getText().insert(resolveEmojiTargetOffset, spannableString));
                    int length = resolveEmojiTargetOffset + spannableString.length();
                    resolveEmojiTarget.setSelection(length, length);
                    if (resolveEmojiTarget == RichEditor.this.emojiTargetEditText) {
                        RichEditor.this.emojiTargetSelection = length;
                    }
                } catch (Exception unused) {
                }
            }
        });
        int indexOfChild = this.container.indexOfChild(this.bottomPanel);
        if (indexOfChild < 0) {
            indexOfChild = this.container.getChildCount();
        }
        FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, getEmojiPanelHeight(), 87);
        createFrame.bottomMargin = this.bottomInset;
        this.container.addView(this.emojiView, indexOfChild, createFrame);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        if (this.emojiSearchOpened) {
            closeEmojiSearch();
            return false;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return false;
        }
        if (this.listView.deselectIfAny()) {
            return false;
        }
        return super.onBackPressed(z);
    }

    private void updatePremiumButtons() {
        int i = 0;
        boolean z = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
        ArrayList arrayList = this.premiumButtons;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Button) obj).setPremiumLocked(z);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateSendButtonLock();
            updatePremiumButtons();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.persistedDraftOnEnd) {
            persistDraft();
            this.persistedDraftOnEnd = true;
        }
        Runnable runnable = this.pendingSend;
        if (runnable != null) {
            this.pendingSend = null;
            AndroidUtilities.runOnUIThread(runnable);
        }
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismissInstant();
            this.messageSendPreview = null;
        }
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView != null) {
            richEditorListView.destroy();
        }
        RichCommandSuggestions richCommandSuggestions = this.commandSuggestions;
        if (richCommandSuggestions != null) {
            richCommandSuggestions.hide();
        }
        super.onFragmentDestroy();
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.onDestroy();
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.container;
        if (sizeNotifierFrameLayout == null || (sizeNotifierFrameLayoutDelegate = this.sizeDelegate) == null) {
            return;
        }
        sizeNotifierFrameLayout.removeDelegate(sizeNotifierFrameLayoutDelegate);
    }

    public static BottomSheet openConversionSheet(Context context, final Runnable runnable, final Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setCustomView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayout.addView(imageView, LayoutHelper.createLinear(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 49, 25, 16, 25, 0));
        TextView textView2 = new TextView(context);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 49, 25, 11, 25, 0));
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        round.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 49, 14, 31, 14, 0));
        ButtonWithCounterView round2 = new ButtonWithCounterView(context, false, resourcesProvider).setRound();
        round2.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(round2, LayoutHelper.createLinear(-1, 48, 49, 14, 2, 14, 6));
        final BottomSheet show = builder.show();
        round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichEditor.$r8$lambda$MG8n1tO8Xr5DMXFPt20zxHR_cyk(BottomSheet.this, runnable2, view);
            }
        });
        round2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichEditor.$r8$lambda$-l3bpecYm1v9axzuUl4wf1Nkswo(BottomSheet.this, runnable, view);
            }
        });
        return show;
    }

    public static /* synthetic */ void $r8$lambda$MG8n1tO8Xr5DMXFPt20zxHR_cyk(BottomSheet bottomSheet, Runnable runnable, View view) {
        bottomSheet.dismiss();
        runnable.run();
    }

    public static /* synthetic */ void $r8$lambda$-l3bpecYm1v9axzuUl4wf1Nkswo(BottomSheet bottomSheet, Runnable runnable, View view) {
        bottomSheet.dismiss();
        runnable.run();
    }
}
