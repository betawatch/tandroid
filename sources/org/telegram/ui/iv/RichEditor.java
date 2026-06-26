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
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AiButtonDrawable;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.iv.RichCommandSuggestions;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorListView;

/* loaded from: classes3.dex */
public class RichEditor extends BaseFragment {
    private ImageView addButton;
    private ImageView aiButton;
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
    private ChatActivity chatActivity;
    private RichCommandSuggestions commandSuggestions;
    private SizeNotifierFrameLayout container;
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
    private LinearLayout formattingLayout2;
    private LinearLayout formattingLayout3;
    private LinearLayout formattingPanel;
    private LinearLayout formattingPanelLayout;
    private int formattingScrollMaxWidth;
    private HorizontalScrollView formattingScrollView;
    private LinearLayout historyButtons;
    private int imeInset;
    private TL_iv.RichMessage initialRichMessage;
    private int initialSelectionEnd;
    private int initialSelectionStart;
    private CharSequence initialText;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private boolean keyboardVisible;
    private final Runnable limitCheckRunnable;
    private Button linkButton;
    private RichEditorListView listView;
    private int[] location;
    private Button mathButton;
    private MessageSendPreview messageSendPreview;
    private Runnable onSentCallback;
    private Runnable pendingSend;
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
            this.topGradient.setVisibility(4);
            this.bottomGradient.setVisibility(4);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda19
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RichEditor.this.lambda$onCustomTransitionAnimation$0(valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.iv.RichEditor.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    RichEditor.this.animatingOpen = false;
                    RichEditor.this.animateEnterView.setAlpha(1.0f);
                    RichEditor.this.animateEnterView.sendButtonContainer.setVisibility(0);
                    RichEditor.this.topGradient.setVisibility(0);
                    RichEditor.this.bottomGradient.setVisibility(0);
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
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.listView, (Property<RichEditorListView, Float>) property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.topPanel;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.topPanel;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.listView, (Property<RichEditorListView, Float>) property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.container.post(new ArticleViewer$$ExternalSyntheticLambda23(animatorSet));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomTransitionAnimation$0(ValueAnimator valueAnimator) {
        this.animateOpenProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateAnimatingLocations();
        this.listView.setTranslationX(AndroidUtilities.lerp(this.animateEnterViewFrom[0] - this.animateEnterViewTo[0], 0, this.animateOpenProgress));
        this.listView.setTranslationY(AndroidUtilities.lerp(this.animateEnterViewFrom[1] - this.animateEnterViewTo[1], 0, this.animateOpenProgress));
        this.container.invalidate();
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
        if (!z || z2 || this.initialRichMessage == null || (richEditorListView = this.listView) == null) {
            return;
        }
        richEditorListView.focusForDraft();
    }

    public RichEditor setChatActivity(ChatActivity chatActivity) {
        this.chatActivity = chatActivity;
        return this;
    }

    public RichEditor setOnSent(Runnable runnable) {
        this.onSentCallback = runnable;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.container = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.iv.RichEditor.2
            private final Paint bgPaint = new Paint(1);
            private final Path clipPath = new Path();
            private final RectF rect = new RectF();

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
                if (RichEditor.this.listView.handleSelectionTouch(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (RichEditor.this.listView.handleKeyEvent(keyEvent)) {
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
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
                        canvas.saveLayerAlpha(0.0f, 0.0f, RichEditor.this.animateEnterView.sendButtonContainer.getWidth(), RichEditor.this.animateEnterView.sendButtonContainer.getHeight(), (int) ((1.0f - RichEditor.this.animateOpenProgress) * 255.0f), 31);
                        RichEditor.this.animateEnterView.sendButtonContainer.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    }
                    canvas.save();
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(this.rect, lerp, lerp, Path.Direction.CW);
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
        SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate = new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda10
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate
            public final void onSizeChanged(int i, boolean z) {
                RichEditor.this.onKeyboardSizeChanged(i, z);
            }
        };
        this.sizeDelegate = sizeNotifierFrameLayoutDelegate;
        this.container.addDelegate(sizeNotifierFrameLayoutDelegate);
        RichEditorListView richEditorListView = new RichEditorListView(context, this.currentAccount, getResourceProvider(), new 3());
        this.listView = richEditorListView;
        this.container.addView(richEditorListView, LayoutHelper.createFrame(-1, -1, 119));
        this.container.addView(this.listView.getOverlayView(), LayoutHelper.createFrame(-1, -1.0f));
        TL_iv.RichMessage richMessage = this.initialRichMessage;
        if (richMessage != null) {
            this.listView.loadRichMessage(richMessage);
        } else {
            CharSequence charSequence = this.initialText;
            if (charSequence != null) {
                this.listView.setInitialText(charSequence);
            }
        }
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
        this.backButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$1(view3);
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
        this.undoButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$2(view3);
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
        this.redoButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$3(view3);
            }
        });
        this.historyButtons.addView(this.redoButton, LayoutHelper.createLinear(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bottomContainer = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.bottomContainer.setClipToPadding(false);
        this.container.addView(this.bottomContainer, LayoutHelper.createFrame(-1, 60, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bottomInnerContainer = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.bottomInnerContainer.setClipToPadding(false);
        this.bottomContainer.addView(this.bottomInnerContainer, LayoutHelper.createFrame(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.bottomPanel = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.bottomPanel.setClipChildren(false);
        this.bottomPanel.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.bottomInnerContainer.addView(this.bottomPanel, LayoutHelper.createFrame(-1, 60, 87));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(context, 24);
        this.emojiButton = chatActivityEnterViewAnimatedIconView;
        chatActivityEnterViewAnimatedIconView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        this.emojiButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.emojiButton.setBackground(withShadow(Theme.createRadSelectorDrawable(getThemedColor(i), Theme.blendOver(getThemedColor(i), getThemedColor(i2)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
        this.bottomPanel.addView(this.emojiButton, LayoutHelper.createLinear(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ScaleStateListAnimator.apply(this.emojiButton);
        this.emojiButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$4(view3);
            }
        });
        ImageView imageView7 = new ImageView(context);
        this.aiButton = imageView7;
        imageView7.setImageDrawable(new AiButtonDrawable(context));
        this.aiButton.setScaleType(scaleType);
        this.aiButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.aiButton.setBackground(withShadow(Theme.createRadSelectorDrawable(getThemedColor(i), Theme.blendOver(getThemedColor(i), getThemedColor(i2)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.bottomPanel.addView(this.aiButton, LayoutHelper.createLinear(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ScaleStateListAnimator.apply(this.aiButton);
        this.aiButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$6(view3);
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-2, 44, 81));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) { // from class: org.telegram.ui.iv.RichEditor.4
            @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i4, int i5) {
                int mode2 = View.MeasureSpec.getMode(i4);
                int size = View.MeasureSpec.getSize(i4);
                if (mode2 == 1073741824) {
                    super.onMeasure(i4, i5);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i5);
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
        frameLayout5.addView(this.blocksScrollView, LayoutHelper.createFrame(-1, -1.0f));
        addBlockButton(R.drawable.iv_text, 1).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$20(view3);
            }
        });
        addBlockButton(R.drawable.iv_lists, 2).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$27(view3);
            }
        });
        addBlockButton(R.drawable.iv_table, 4).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$28(view3);
            }
        });
        int i4 = R.drawable.iv_math;
        addBlockButton(i4, 7).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$30(view3);
            }
        });
        this.bottomPanel.addView(frameLayout4, LayoutHelper.createLinear(0, 44, 1.0f));
        ImageView imageView8 = new ImageView(context);
        this.addButton = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.addButton.setScaleType(scaleType);
        this.addButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.addButton.setBackground(withShadow(Theme.createRadSelectorDrawable(getThemedColor(i), Theme.blendOver(getThemedColor(i), getThemedColor(i2)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.bottomPanel.addView(this.addButton, LayoutHelper.createLinear(44, 44, 0.0f, 21, 8, 0, 0, 0));
        ScaleStateListAnimator.apply(this.addButton);
        this.addButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$31(view3);
            }
        });
        LinearLayout linearLayout4 = new LinearLayout(context) { // from class: org.telegram.ui.iv.RichEditor.6
            @Override // android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i5, int i6) {
                int size = View.MeasureSpec.getSize(i5);
                int paddingLeft = getPaddingLeft() + getPaddingRight();
                if (RichEditor.this.formattingLayout2 != null) {
                    RichEditor.this.formattingLayout2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) RichEditor.this.formattingLayout2.getLayoutParams();
                    paddingLeft += RichEditor.this.formattingLayout2.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                if (RichEditor.this.formattingLayout3 != null) {
                    RichEditor.this.formattingLayout3.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) RichEditor.this.formattingLayout3.getLayoutParams();
                    paddingLeft += RichEditor.this.formattingLayout3.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                RichEditor.this.formattingScrollMaxWidth = Math.max(0, size - paddingLeft);
                super.onMeasure(i5, i6);
            }
        };
        this.formattingPanel = linearLayout4;
        linearLayout4.setOrientation(0);
        this.formattingPanel.setClipToPadding(false);
        this.formattingPanel.setClipChildren(false);
        this.formattingPanel.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.bottomContainer.addView(this.formattingPanel, LayoutHelper.createFrame(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.trashPanel = frameLayout6;
        frameLayout6.setClipChildren(false);
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
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.formattingPanel.addView(frameLayout7, LayoutHelper.createFrame(-2, 44.0f));
        HorizontalScrollView horizontalScrollView2 = new HorizontalScrollView(context) { // from class: org.telegram.ui.iv.RichEditor.7
            @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i5, int i6) {
                int mode2 = View.MeasureSpec.getMode(i5);
                if (mode2 == 1073741824) {
                    super.onMeasure(i5, i6);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), 0), i6);
                int measuredWidth = getMeasuredWidth();
                int i7 = RichEditor.this.formattingScrollMaxWidth;
                if (mode2 == Integer.MIN_VALUE) {
                    i7 = Math.min(i7, View.MeasureSpec.getSize(i5));
                }
                setMeasuredDimension(Math.min(measuredWidth, i7), getMeasuredHeight());
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
        frameLayout7.addView(this.formattingScrollView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.formattingPanelLayout = linearLayout5;
        linearLayout5.setOrientation(0);
        this.formattingPanelLayout.setPadding(AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f));
        this.formattingScrollView.addView(this.formattingPanelLayout, new FrameLayout.LayoutParams(-2, -1));
        addFormattingButton(context, R.drawable.formatting_bold, 1);
        addFormattingButton(context, R.drawable.formatting_italic, 2);
        addFormattingButton(context, R.drawable.formatting_underline, 16);
        addFormattingButton(context, R.drawable.formatting_strikethrough, 8);
        addFormattingButton(context, R.drawable.formatting_spoiler, 256);
        addFormattingButton(context, R.drawable.iv_code, 4);
        addFormattingButton(context, R.drawable.iv_sub, 16384);
        addFormattingButton(context, R.drawable.iv_super, 32768);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.formattingLayout2 = linearLayout6;
        linearLayout6.setOrientation(0);
        this.formattingLayout2.setPadding(AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f));
        this.formattingLayout2.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.formattingPanel.addView(this.formattingLayout2, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        Button button = new Button(context, R.drawable.media_link_24, getResourceProvider());
        this.linkButton = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$32(view3);
            }
        });
        this.formattingLayout2.addView(this.linkButton, LayoutHelper.createLinear(41, 41));
        Button button2 = new Button(context, R.drawable.msg_calendar2, getResourceProvider());
        this.dateButton = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$33(view3);
            }
        });
        this.formattingLayout2.addView(this.dateButton, LayoutHelper.createLinear(41, 41));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.formattingLayout3 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.formattingLayout3.setPadding(AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f));
        this.formattingLayout3.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i))));
        this.formattingPanel.addView(this.formattingLayout3, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        Button button3 = new Button(context, i4, getResourceProvider());
        this.mathButton = button3;
        button3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$34(view3);
            }
        });
        this.formattingLayout3.addView(this.mathButton, LayoutHelper.createLinear(41, 41));
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
        sendButton.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_featuredStickers_addButton))));
        ScaleStateListAnimator.apply(this.sendButton);
        this.bottomPanel.addView(this.sendButton, LayoutHelper.createLinear(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.sendButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RichEditor.this.lambda$createView$35(view3);
            }
        });
        this.sendButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda8
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                boolean onSendLongClick;
                onSendLongClick = RichEditor.this.onSendLongClick(view3);
                return onSendLongClick;
            }
        });
        this.container.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        checkUI_listViewPadding();
        updateBottomPanel(0, false);
        updateHistoryButtons();
        this.container.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda9
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view3, View view4) {
                RichEditor.this.lambda$createView$36(view3, view4);
            }
        });
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
            RichEditor.this.scheduleLimitCheck();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onHistoryChanged() {
            RichEditor.this.updateHistoryButtons();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onOpenAttachRequest(int i, int i2) {
            RichEditor.this.openAttach(i, i2);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onOpenLocationRequest(BlockRow blockRow) {
            RichEditor.this.openLocationPicker(blockRow);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ItemOptions lambda$onSlashSuggest$0(View view) {
            return ItemOptions.makeOptions(RichEditor.this, view);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onSlashSuggest(RichTextCell richTextCell, String str) {
            if (RichEditor.this.commandSuggestions == null) {
                RichEditor.this.commandSuggestions = new RichCommandSuggestions(new RichCommandSuggestions.MenuFactory() { // from class: org.telegram.ui.iv.RichEditor$3$$ExternalSyntheticLambda0
                    @Override // org.telegram.ui.iv.RichCommandSuggestions.MenuFactory
                    public final ItemOptions make(View view) {
                        ItemOptions lambda$onSlashSuggest$0;
                        lambda$onSlashSuggest$0 = RichEditor.3.this.lambda$onSlashSuggest$0(view);
                        return lambda$onSlashSuggest$0;
                    }
                }, RichEditor.this.getResourceProvider());
            }
            RichEditor.this.commandSuggestions.update(richTextCell, str);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1(View view) {
        if (this.listView.deselectIfAny()) {
            return;
        }
        finishFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$2(View view) {
        this.listView.undo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(View view) {
        this.listView.redo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4(View view) {
        toggleEmojiPopup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(TL_iv.RichMessage richMessage) {
        this.listView.addRichMessage(richMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$6(View view) {
        new RichAIComposeSheet(getContext(), this.currentAccount, getResourceProvider(), new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda43
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                RichEditor.this.lambda$createView$5((TL_iv.RichMessage) obj);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$20(View view) {
        ItemOptions itemOptions = this.currentMenuVisible;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.currentMenuVisible = null;
        }
        final BlockRow findFocusedRow = this.listView.findFocusedRow();
        final ItemOptions dontFocus = ItemOptions.makeOptions((BaseFragment) this, view, true).dontFocus();
        final ItemOptions makeSwipeback = dontFocus.makeSwipeback();
        makeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                ItemOptions.this.closeSwipeback();
            }
        });
        makeSwipeback.addGap();
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$8(findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize + 2);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$9(findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize + 1);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$10(findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$11(findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 1);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$12(findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 2);
        makeSwipeback.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$13(findFocusedRow, dontFocus);
            }
        });
        makeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        makeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 3);
        dontFocus.addChecked(findFocusedRow != null && RichEditorListView.isHeading(findFocusedRow.block), R.drawable.iv_h, LocaleController.getString(R.string.ArticleHeading), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                ItemOptions.this.openSwipeback(makeSwipeback);
            }
        });
        dontFocus.getLast().textView.setTypeface(AndroidUtilities.bold());
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, LocaleController.getString(R.string.ArticleText), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$15(findFocusedRow);
            }
        });
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$16(findFocusedRow);
            }
        });
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockPullquote), R.drawable.iv_pullquote, LocaleController.getString(R.string.ArticlePullquote), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$17(findFocusedRow);
            }
        });
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$18(findFocusedRow);
            }
        });
        dontFocus.addChecked(findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockFooter), R.drawable.iv_footer, LocaleController.getString(R.string.ArticleFooter), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$19(findFocusedRow);
            }
        });
        this.currentMenuVisible = dontFocus.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$8(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockHeading1(), 0, 0, false, false);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$9(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockHeading2(), 0, 0, false, false);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$10(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockHeading3(), 0, 0, false, false);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$11(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockHeading4(), 0, 0, false, false);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$12(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockHeading5(), 0, 0, false, false);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$13(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockHeading6(), 0, 0, false, false);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$15(BlockRow blockRow) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$16(BlockRow blockRow) {
        this.listView.turnInto(blockRow, RichEditorListView.newBlockquote(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$17(BlockRow blockRow) {
        this.listView.turnInto(blockRow, RichEditorListView.newPullquote(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$18(BlockRow blockRow) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockPreformatted(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$19(BlockRow blockRow) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockFooter(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$27(View view) {
        ItemOptions itemOptions = this.currentMenuVisible;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.currentMenuVisible = null;
        }
        final ItemOptions dontFocus = ItemOptions.makeOptions(this, view).dontFocus();
        final BlockRow findFocusedRow = this.listView.findFocusedRow();
        boolean z = false;
        ItemOptions addChecked = dontFocus.addChecked(findFocusedRow == null || !findFocusedRow.isInList(), R.drawable.field_carret_empty, LocaleController.getString(R.string.ArticleNone), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$21(findFocusedRow);
            }
        }).addChecked((findFocusedRow == null || !findFocusedRow.isInList() || findFocusedRow.isChecklist() || findFocusedRow.isOrdered()) ? false : true, R.drawable.iv_list, LocaleController.getString(R.string.ArticleListBulletedList), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$22(findFocusedRow);
            }
        }).addChecked(findFocusedRow != null && findFocusedRow.isInList() && !findFocusedRow.isChecklist() && findFocusedRow.isOrdered(), R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleListNumberedList), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$23(findFocusedRow);
            }
        }).addChecked(findFocusedRow != null && findFocusedRow.isInList() && findFocusedRow.isChecklist() && !findFocusedRow.isOrdered(), R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListChecklist), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$createView$24(findFocusedRow);
            }
        });
        boolean z2 = findFocusedRow != null && (findFocusedRow.block instanceof TL_iv.pageBlockDetails);
        int i = R.drawable.iv_details;
        String string = LocaleController.getString(R.string.ArticleToggleBlock);
        RichEditorListView richEditorListView = this.listView;
        Objects.requireNonNull(richEditorListView);
        addChecked.addChecked(z2, i, string, new ChatAttachAlertRichLayout$$ExternalSyntheticLambda24(richEditorListView));
        int indexOf = findFocusedRow != null ? this.listView.rows.indexOf(findFocusedRow) : -1;
        boolean z3 = findFocusedRow != null && findFocusedRow.isInList();
        boolean z4 = z3 && this.listView.canIndentRow(indexOf);
        if (z3 && this.listView.canOutdentRow(indexOf) && ((BlockRow) this.listView.rows.get(indexOf)).level > 1) {
            z = true;
        }
        if (z4 || z) {
            dontFocus.addGap();
            if (z4) {
                dontFocus.add(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditor.this.lambda$createView$25(findFocusedRow, dontFocus);
                    }
                });
            }
            if (z) {
                dontFocus.add(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda49
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditor.this.lambda$createView$26(findFocusedRow, dontFocus);
                    }
                });
            }
        }
        this.currentMenuVisible = dontFocus.forceTop(true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$21(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$22(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$23(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$24(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$25(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.onCellIndent(blockRow, false);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$26(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.onCellIndent(blockRow, true);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$28(View view) {
        RichTableCell findFocusedTableCell;
        TL_iv.pageTableCell focusedCellOf;
        ItemOptions itemOptions = this.currentMenuVisible;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.currentMenuVisible = null;
        }
        RichEditorListView richEditorListView = this.listView;
        RichTableCell richTableCell = richEditorListView.activeCellSelectionTable;
        if (richTableCell == null && (findFocusedTableCell = richEditorListView.findFocusedTableCell()) != null && findFocusedTableCell.getModel() != null && (focusedCellOf = this.listView.focusedCellOf(findFocusedTableCell)) != null) {
            this.listView.enterCellSelectionMode(findFocusedTableCell, focusedCellOf);
            richTableCell = findFocusedTableCell;
        }
        if (richTableCell != null && richTableCell.getModel() != null && richTableCell.hasCellSelection()) {
            this.listView.showTableCellMenu(richTableCell);
        } else {
            this.listView.addBlock(RichTextCell.newEmptyTable(2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$30(View view) {
        ItemOptions itemOptions = this.currentMenuVisible;
        final TL_iv.pageBlockMath pageblockmath = null;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.currentMenuVisible = null;
        }
        BlockRow findFocusedRow = this.listView.findFocusedRow();
        if (findFocusedRow != null) {
            TL_iv.PageBlock pageBlock = findFocusedRow.block;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
            }
        }
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda42
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                RichEditor.this.lambda$createView$29(pageblockmath, (String) obj);
            }
        }, getResourceProvider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$29(TL_iv.pageBlockMath pageblockmath, String str) {
        if (pageblockmath != null) {
            pageblockmath.source = str;
            this.listView.adapter.update(false);
        } else {
            TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
            pageblockmath2.source = str;
            this.listView.addBlock(pageblockmath2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$31(View view) {
        this.listView.pendingMediaRow = null;
        openAttach();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$32(View view) {
        this.listView.onLinkClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$33(View view) {
        this.listView.onDateClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$34(View view) {
        this.listView.onMathClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$35(View view) {
        sendMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$36(View view, View view2) {
        updateBlockButtons();
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
            duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.this.lambda$updateBottomPanel$37();
                }
            }).start();
            this.formattingPanel.setVisibility(0);
            this.formattingPanel.animate().alpha(this.bottomPanelType == 1 ? 1.0f : 0.0f).scaleX(this.bottomPanelType == 1 ? 1.0f : 0.8f).scaleY(this.bottomPanelType == 1 ? 1.0f : 0.8f).translationY(this.bottomPanelType == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.this.lambda$updateBottomPanel$38();
                }
            }).start();
            this.trashPanel.setVisibility(0);
            this.trashPanel.animate().alpha(this.bottomPanelType == 2 ? 1.0f : 0.0f).scaleX(this.bottomPanelType == 2 ? 1.0f : 0.8f).scaleY(this.bottomPanelType == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.this.lambda$updateBottomPanel$39();
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateBottomPanel$37() {
        if (this.bottomPanelType != 0) {
            this.bottomPanel.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateBottomPanel$38() {
        if (this.bottomPanelType != 1) {
            this.formattingPanel.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateBottomPanel$39() {
        if (this.bottomPanelType != 2) {
            this.trashPanel.setVisibility(8);
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
            this.paint.setShadowLayer(AndroidUtilities.dp(12.0f) * f, 0.0f, AndroidUtilities.dp(3.0f), Theme.multAlpha(805306368, f));
            Rect bounds = getBounds();
            float dp = AndroidUtilities.dp(8.0f) * f;
            float dp2 = AndroidUtilities.dp(0.0f) * f;
            float dp3 = AndroidUtilities.dp(12.0f) * f;
            canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (bounds.bottom - dp2) + (AndroidUtilities.dp(6.0f) * f), dp3, dp3, this.paint);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.paint.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }
    }

    private Button addBlockButton(int i, int i2) {
        Button button = new Button(this.blocksLayout.getContext(), i, getResourceProvider());
        button.setTag(Integer.valueOf(i2));
        this.blockButtons.add(button);
        LinearLayout linearLayout = this.blocksLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateBlockButtons() {
        BlockRow findFocusedRow;
        int i;
        Iterator it;
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
                            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                i = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i = 7;
                            }
                            it = this.blockButtons.iterator();
                            while (it.hasNext()) {
                                Button button = (Button) it.next();
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
                                            button.updateIcon(R.drawable.iv_code);
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
                it = this.blockButtons.iterator();
                while (it.hasNext()) {
                }
            }
            i = 0;
            it = this.blockButtons.iterator();
            while (it.hasNext()) {
            }
        }
        i = 4;
        it = this.blockButtons.iterator();
        while (it.hasNext()) {
        }
    }

    private void addFormattingButton(Context context, int i, final int i2) {
        Button button = new Button(context, i, getResourceProvider());
        button.setTag(Integer.valueOf(i2));
        button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichEditor.this.lambda$addFormattingButton$40(i2, view);
            }
        });
        this.formattingButtons.add(button);
        LinearLayout linearLayout = this.formattingPanelLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(41, 41, linearLayout.getChildCount() > 0 ? 2.0f : 0.0f, 0.0f, 0.0f, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFormattingButton$40(int i, View view) {
        this.listView.onFormattingClicked(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFormattingButtons() {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        if (this.formattingButtons.isEmpty() || textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
            return;
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
        Iterator it = this.formattingButtons.iterator();
        while (it.hasNext()) {
            Button button = (Button) it.next();
            button.setSelected(z2 && this.listView.isStyleFullyApplied(((Integer) button.getTag()).intValue(), startCell, startOffset, endCell, endOffset));
        }
        Button button2 = this.linkButton;
        if (button2 != null) {
            button2.setSelected(z2 && this.listView.isLinkApplied(startCell, startOffset, endCell, endOffset));
        }
        Button button3 = this.dateButton;
        if (button3 != null) {
            button3.setSelected(z2 && this.listView.isDateApplied(startCell, startOffset, endCell, endOffset));
        }
        if (z2 && startCell == endCell) {
            z = true;
        }
        setInlineButtonsEnabled(z);
    }

    private void setInlineButtonsEnabled(boolean z) {
        Button button = this.linkButton;
        if (button != null) {
            button.setEnabled(z);
        }
        Button button2 = this.dateButton;
        if (button2 != null) {
            button2.setEnabled(z);
        }
        Button button3 = this.mathButton;
        if (button3 != null) {
            button3.setEnabled(z);
        }
    }

    private void updateFormattingButtonsTable() {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        int startCell = textSelectionHelper.getStartCell();
        int startChildPosition = textSelectionHelper.getStartChildPosition();
        int endChildPosition = textSelectionHelper.getEndChildPosition();
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        Iterator it = this.formattingButtons.iterator();
        while (it.hasNext()) {
            Button button = (Button) it.next();
            button.setSelected(this.listView.isStyleFullyAppliedTable(((Integer) button.getTag()).intValue(), startCell, startChildPosition, startOffset, endChildPosition, endOffset));
        }
        boolean z = startChildPosition == endChildPosition;
        RichEditText tableEditText = z ? this.listView.tableEditText(startCell, startChildPosition) : null;
        int max = Math.max(0, Math.min(startOffset, endOffset));
        int max2 = tableEditText == null ? 0 : Math.max(0, Math.min(Math.max(startOffset, endOffset), tableEditText.length()));
        Button button2 = this.linkButton;
        if (button2 != null) {
            button2.setSelected(tableEditText != null && max < max2 && RichTextStyle.hasLink(tableEditText.getText(), max, max2));
        }
        Button button3 = this.dateButton;
        if (button3 != null) {
            button3.setSelected(tableEditText != null && max < max2 && RichTextStyle.hasDate(tableEditText.getText(), max, max2));
        }
        setInlineButtonsEnabled(z);
    }

    private void updateFormattingButtonsCaption() {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        RichEditText captionEditText = this.listView.captionEditText(textSelectionHelper.getStartCell());
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        boolean z = false;
        int max = captionEditText == null ? 0 : Math.max(0, Math.min(Math.min(startOffset, endOffset), captionEditText.length()));
        int max2 = captionEditText == null ? 0 : Math.max(0, Math.min(Math.max(startOffset, endOffset), captionEditText.length()));
        Iterator it = this.formattingButtons.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Button button = (Button) it.next();
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
        setInlineButtonsEnabled(true);
    }

    public static class Button extends ImageView implements Theme.Colorable {
        private boolean accent;
        private int currentIcon;
        private boolean enabled;
        private Theme.ResourcesProvider resourcesProvider;
        private int roundRadius;
        private boolean selected;
        private int startIcon;

        public Button(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.roundRadius = 20;
            this.enabled = true;
            this.accent = true;
            this.currentIcon = i;
            this.startIcon = i;
            this.resourcesProvider = resourcesProvider;
            setImageResource(i);
            setScaleType(ImageView.ScaleType.CENTER);
            ScaleStateListAnimator.apply(this);
            updateColors();
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
            AndroidUtilities.updateImageViewImageAnimated(this, i);
        }

        public void resetIcon() {
            updateIcon(this.startIcon);
        }

        public Button setRoundRadius(int i) {
            this.roundRadius = i;
            updateColors();
            return this;
        }

        @Override // org.telegram.ui.ActionBar.Theme.Colorable
        public void updateColors() {
            if (this.selected) {
                int color = Theme.getColor(this.accent ? Theme.key_featuredStickers_addButton : Theme.key_windowBackgroundWhiteBlackText);
                setBackground(Theme.createRadSelectorDrawable(Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), Theme.multAlpha(color, 0.1f)), Theme.multAlpha(color, 0.1f), AndroidUtilities.dp(this.roundRadius), AndroidUtilities.dp(this.roundRadius)));
                setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            } else {
                setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), Theme.getColor(Theme.key_listSelector, this.resourcesProvider), AndroidUtilities.dp(this.roundRadius), AndroidUtilities.dp(this.roundRadius)));
                setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static Drawable withShadow(Drawable drawable) {
        return new ShadowWrapperDrawable(drawable);
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
        openAttach(74, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openAttach(int i, int i2) {
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
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i);
        chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda51
            @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
            public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z, int i4, long j) {
                RichEditor.this.lambda$openAttach$41(chatAttachAlert, messageMedia, i3, z, i4, j);
            }
        });
        chatAttachAlert.setAudioSelectDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda52
            @Override // org.telegram.ui.Components.ChatAttachAlertAudioLayout.AudioSelectDelegate
            public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                RichEditor.this.lambda$openAttach$42(chatAttachAlert, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }
        });
        chatAttachAlert.init();
        if (i2 != 0) {
            chatAttachAlert.openAttachLayoutForType(i2);
        }
        chatAttachAlert.setFocusable(true);
        chatAttachAlert.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAttach$41(ChatAttachAlert chatAttachAlert, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        if (messageMedia == null || messageMedia.geo == null) {
            chatAttachAlert.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        this.listView.addBlock(pageblockmap);
        chatAttachAlert.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAttach$42(ChatAttachAlert chatAttachAlert, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.listView.attachAudio((MessageObject) arrayList.get(0));
        }
        chatAttachAlert.dismiss(true);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onActivityResultFragment(int i, int i2, Intent intent) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void openLocationPicker(final BlockRow blockRow) {
        if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(this)) {
            final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this, false, false, false, getResourceProvider());
            chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() { // from class: org.telegram.ui.iv.RichEditor.11
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
            chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53
                @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
                    RichEditor.this.lambda$openLocationPicker$44(blockRow, chatAttachAlert, messageMedia, i, z, i2, j);
                }
            });
            chatAttachAlert.init();
            chatAttachAlert.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openLocationPicker$44(final BlockRow blockRow, ChatAttachAlert chatAttachAlert, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        if (messageMedia == null || messageMedia.geo == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.listView.history;
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
        RichEditorHistory richEditorHistory2 = this.listView.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        chatAttachAlert.dismiss(true);
        this.listView.post(new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda54
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$openLocationPicker$43(blockRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openLocationPicker$43(BlockRow blockRow) {
        View findViewByItemObject = this.listView.findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichMapCell) {
            ((RichMapCell) findViewByItemObject).bind(blockRow, this.listView.getMapDelegate());
        } else {
            this.listView.adapter.update(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInScheduleMode() {
        ChatActivity chatActivity;
        return this.editingMessageObject == null && (chatActivity = this.chatActivity) != null && chatActivity.isInScheduleMode();
    }

    private void sendMessage() {
        if (isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.iv.RichEditor.12
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
        if (this.chatActivity == null || !this.listView.hasAnyText() || this.listView.hasPendingUploads()) {
            return;
        }
        if (!this.listView.isWithinLimits()) {
            updateSendButtonEnabled();
            return;
        }
        this.sent = true;
        final ArrayList flattenRowsToBlocks = this.listView.flattenRowsToBlocks();
        if (flattenRowsToBlocks.isEmpty()) {
            return;
        }
        final ArrayList collectPhotos = this.listView.collectPhotos();
        final ArrayList collectDocuments = this.listView.collectDocuments();
        final long dialogId = this.chatActivity.getDialogId();
        final MessageObject replyMessage = this.chatActivity.getReplyMessage();
        final MessageObject threadMessage = this.chatActivity.getThreadMessage();
        final long sendMonoForumPeerId = this.chatActivity.getSendMonoForumPeerId();
        ChatActivity chatActivity = this.chatActivity;
        final String str = chatActivity.quickReplyShortcut;
        final int quickReplyId = chatActivity.getQuickReplyId();
        final MessageObject messageObject = this.editingMessageObject;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                RichEditor.this.lambda$sendMessage$45(messageObject, flattenRowsToBlocks, collectPhotos, collectDocuments, dialogId, replyMessage, threadMessage, z, i, i2, str, quickReplyId, sendMonoForumPeerId);
            }
        };
        Runnable runnable2 = this.onSentCallback;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (i != 0 && messageObject == null) {
            this.pendingSend = runnable;
            finishFragment();
        } else {
            runnable.run();
            finishFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$45(MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, String str, int i3, long j2) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(this.currentAccount), messageObject, arrayList, arrayList2, arrayList3, null, false, this.chatActivity);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(this.currentAccount), arrayList, arrayList2, arrayList3, null, false, j, messageObject2, messageObject3, z, i, i2, str, i3, 0L, j2, 0L);
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
        messageSendPreview2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda37
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                RichEditor.this.lambda$onSendLongClick$46(dialogInterface);
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
        ChatActivityEnterView.SendButton sendButton = this.messageSendPreview.setSendButton(this.sendButton, true, new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RichEditor.this.lambda$onSendLongClick$47(view2);
            }
        });
        if (sendButton != null) {
            sendButton.setBackground(withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_featuredStickers_addButton))));
            this.messageSendPreview.setSendButtonWidth(AndroidUtilities.dp(44.0f));
        }
        ItemOptions makeOptions = ItemOptions.makeOptions(this, this.sendButton);
        boolean isUserSelf = UserObject.isUserSelf(this.chatActivity.getCurrentUser());
        if (this.chatActivity.canScheduleMessage()) {
            makeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.this.lambda$onSendLongClick$48(dialogId);
                }
            });
            if (!isUserSelf && dialogId > 0) {
                makeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda40
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditor.this.lambda$onSendLongClick$49();
                    }
                });
            }
        }
        if (!isUserSelf) {
            makeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() { // from class: org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditor.this.lambda$onSendLongClick$50();
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSendLongClick$46(DialogInterface dialogInterface) {
        this.messageSendPreview = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSendLongClick$47(View view) {
        sendMessage();
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(true);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSendLongClick$48(long j) {
        AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), j, new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.iv.RichEditor.13
            @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
            public void didSelectDate(boolean z, int i, int i2) {
                RichEditor.this.sendMessage(z, i, i2);
                if (RichEditor.this.messageSendPreview != null) {
                    RichEditor.this.messageSendPreview.dismissInstant();
                    RichEditor.this.messageSendPreview = null;
                }
            }
        }, getResourceProvider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSendLongClick$49() {
        sendMessage(true, 2147483646, 0);
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSendLongClick$50() {
        sendMessage(false, 0, 0);
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(true);
            this.messageSendPreview = null;
        }
    }

    private void persistDraft() {
        if (this.chatActivity != null && this.editingMessageObject == null && this.listView.canUndo()) {
            TL_iv.RichMessage buildDraftRichMessage = this.sent ? null : this.listView.buildDraftRichMessage();
            getMediaDataController().saveDraft(this.chatActivity.getDialogId(), this.chatActivity.getDraftThreadId(), "", null, null, null, null, 0L, false, false, buildDraftRichMessage);
            if (this.chatActivity.getChatActivityEnterView() != null) {
                this.chatActivity.getChatActivityEnterView().setRichDraftPreview(buildDraftRichMessage);
            }
        }
    }

    private void toggleEmojiPopup() {
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
                RichEditor.this.lambda$animateEmojiSearch$51(valueAnimator2);
            }
        });
        this.emojiSearchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.emojiSearchAnimator.setDuration(250L);
        this.emojiSearchAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateEmojiSearch$51(ValueAnimator valueAnimator) {
        this.emojiSearchProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        applyEmojiSearchOffset();
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
        this.listView.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + Math.max(Math.max(this.emojiPadding, this.bottomInset), this.imeInset));
        this.listView.setInsets(this.bottomInset, this.imeInset, this.emojiPadding);
        this.bottomContainer.setTranslationY(-r0);
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
        emojiView2.setDelegate(new EmojiView.EmojiViewDelegate() { // from class: org.telegram.ui.iv.RichEditor.14
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

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate;
        persistDraft();
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
}
