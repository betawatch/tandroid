package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.utils.EphemeralMessagesHelper;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.utils.RectFMergeBounding;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.PhotoPickerSearchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.WebAppDisclaimerAlert;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotWebViewMenuContainer$ActionBarColorsAnimating;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.web.BotWebViewContainer;

/* loaded from: classes5.dex */
public class ChatAttachAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, BottomSheet.BottomSheetDelegateInterface, FactorAnimator.Target {
    public final Property ATTACH_ALERT_LAYOUT_TRANSLATION;
    private final Property ATTACH_ALERT_PROGRESS;
    public ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private final ImageView aiButton;
    private final AiButtonDrawable aiButtonIcon;
    private boolean allowDrawContent;
    public boolean allowEnterCaption;
    public boolean allowLivePhotos;
    protected boolean allowOrder;
    protected boolean allowPassConfirmationAlert;
    private final BoolAnimator animatorActionBarVisible;
    private final BoolAnimator animatorCaptionAbove;
    private final BoolAnimator animatorCaptionNotEmpty;
    private final BoolAnimator animatorCaptionVisible;
    private final ReplaceAnimator animatorCurrentVisibleLayout;
    private final BoolAnimator animatorEphemeralMessageVisibility;
    private final BoolAnimator animatorToggleCaptionSupported;
    private SpringAnimation appearSpringAnimation;
    private final Paint attachButtonPaint;
    private int attachItemSize;
    private ChatAttachAlertAudioLayout audioLayout;
    private ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate;
    protected int avatarPicker;
    protected boolean avatarSearch;
    protected Utilities.Callback0Return avatarWithBulletin;
    public final BaseFragment baseFragment;
    private float baseSelectedTextViewTranslationY;
    private LongSparseArray botAttachLayouts;
    private boolean botButtonProgressWasVisible;
    private boolean botButtonWasVisible;
    private float botMainButtonOffsetY;
    private AnimatedTextView botMainButtonTextView;
    private RadialProgressView botProgressView;
    private BlurredBackgroundWithFadeDrawable bottomFadeDrawable;
    private View bottomFadeView;
    private float bottomPannelTranslation;
    private boolean buttonPressed;
    private ButtonsAdapter buttonsAdapter;
    private AnimatorSet buttonsAnimation;
    private LinearLayoutManager buttonsLayoutManager;
    protected RecyclerListView buttonsRecyclerView;
    protected FrameLayout buttonsRecyclerViewWrapper;
    public boolean canOpenPreview;
    public boolean captionAbove;
    private FrameLayout captionContainer;
    private BlurredBackgroundDrawable captionContainerBg;
    private float captionEditTextTopOffset;
    protected boolean captionLimitBulletinShown;
    private final AnimatedTextView captionLimitView;
    private float chatActivityEnterViewAnimateFromTop;
    private int codepointCount;
    public ChatAttachAlertColorsLayout colorsLayout;
    public EditTextEmoji commentTextView;
    private int[] commentTextViewLocation;
    private AnimatorSet commentsAnimator;
    private boolean confirmationAlertShown;
    private ChatAttachAlertContactsLayout contactsLayout;
    protected float cornerRadius;
    public final int currentAccount;
    private AttachAlertLayout currentAttachLayout;
    private int currentLimit;
    public float currentPanTranslationY;
    public Utilities.Callback2 customStickerHandler;
    private DecelerateInterpolator decelerateInterpolator;
    protected ChatAttachViewDelegate delegate;
    public boolean destroyed;
    public long dialogId;
    private ChatAttachAlertDocumentLayout documentLayout;
    private ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentsDelegate;
    private boolean documentsEnabled;
    protected TextView doneItem;
    private float doneItemAlphaByEnabled;
    private float doneItemAlphaByLayout;
    private int editType;
    protected MessageObject editingMessageObject;
    private long effectId;
    private ChatAttachAlertEmojiLayout emojiLayout;
    private BlurredBackgroundDrawable emojiViewChildBg;
    private EmojiView.EmojiViewDelegate emojiViewDelegate;
    private boolean enterCommentEventSent;
    private ArrayList exclusionRects;
    private Rect exclustionRect;
    private ChatActivityFadeView fadeView;
    public boolean forUser;
    private final boolean forceDarkTheme;
    private FrameLayout frameLayout2;
    private float fromScrollY;
    protected FrameLayout headerView;
    private final IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFade;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionFastScroll;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final ArrayList iBlur3PositionsMerged;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public boolean inBubbleMode;
    public boolean isBizLocationPicker;
    public boolean isLocationPicker;
    public boolean isPhotoPicker;
    public boolean isPollAttach;
    private boolean isSoundPicker;
    public boolean isStickerMode;
    public boolean isStoryAudioPicker;
    public boolean isStoryLocationPicker;
    private AttachAlertLayout[] layouts;
    private ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate;
    private ChatAttachAlertLocationLayout locationLayout;
    protected int maxSelectedPhotos;
    protected TextView mediaPreviewTextView;
    protected LinearLayout mediaPreviewView;
    public MentionsContainerView mentionContainer;
    private AnimatorSet menuAnimator;
    private boolean menuShowed;
    private MessageSendPreview messageSendPreview;
    private HintView2 motionHint;
    private MotionPhotoDrawable motionIcon;
    protected ActionBarMenuItem motionItem;
    public ImageView moveCaptionButton;
    private boolean musicEnabled;
    private AttachAlertLayout nextAttachLayout;
    private boolean openTransitionFinished;
    protected boolean openWithFrontFaceCamera;
    protected ActionBarMenuItem optionsItem;
    private boolean overrideBackgroundColor;
    private Paint paint;
    public ImageUpdater parentImageUpdater;
    public ChatActivity.ThemeDelegate parentThemeDelegate;
    private PasscodeView passcodeView;
    protected boolean paused;
    private ChatAttachAlertPhotoLayout photoLayout;
    private ChatAttachAlertPhotoLayoutPreview photoPreviewLayout;
    private boolean photosEnabled;
    public boolean pinnedToTop;
    private boolean plainTextEnabled;
    private int pollAllowedLayouts;
    private ChatAttachAlertPollLayout pollLayout;
    private boolean pollsEnabled;
    private int previousScrollOffsetY;
    private ChatAttachAlertQuickRepliesLayout quickRepliesLayout;
    private RectF rect;
    private ChatAttachRestrictedLayout restrictedLayout;
    private ChatAttachAlertRichLayout richLayout;
    public int[] scrollOffsetY;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    protected ActionBarMenuItem searchItem;
    protected ImageView selectedArrowImageView;
    private View selectedCountView;
    private long selectedId;
    protected ActionBarMenuItem selectedMenuItem;
    protected TextView selectedTextView;
    protected LinearLayout selectedView;
    boolean sendButtonEnabled;
    private float sendButtonEnabledProgress;
    public boolean sent;
    private ImageUpdater.AvatarFor setAvatarFor;
    private final boolean showingFromDialog;
    private boolean shownAiButton;
    public SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private ChatAttachAlertEmojiLayout stickersLayout;
    public boolean storyLocationPickerFileIsVideo;
    public double[] storyLocationPickerLatLong;
    public File storyLocationPickerPhotoFile;
    public boolean storyMediaPicker;
    private TextPaint textPaint;
    private float toScrollY;
    private boolean todoEnabled;
    private ChatAttachAlertPollLayout todoLayout;
    private final ImageView topAiButton;
    private final AiButtonDrawable topAiButtonIcon;
    private ValueAnimator topBackgroundAnimator;
    private final AnimatedTextView topCaptionLimitView;
    public FrameLayout topCommentContainer;
    public ImageView topCommentMoveButton;
    public EditTextEmoji topCommentTextView;
    public float translationProgress;
    protected boolean typeButtonsAvailable;
    private boolean typeButtonsHidden;
    private boolean videosEnabled;
    private Object viewChangeAnimator;
    private ChatActivityEnterView.SendButton writeButton;
    private FrameLayout writeButtonContainer;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$18(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegateInterface
    public boolean canDismiss() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithSwipe() {
        return false;
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public /* synthetic */ void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.-CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public TLRPC.Chat getChat() {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            return ((ChatActivity) baseFragment).getCurrentChat();
        }
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
    }

    public void setCanOpenPreview(boolean z) {
        this.canOpenPreview = z;
        this.selectedArrowImageView.setVisibility((!z || this.avatarPicker == 2) ? 8 : 0);
    }

    public float getClipLayoutBottom() {
        return this.frameLayout2.getMeasuredHeight() - ((this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(84.0f)) * (1.0f - this.frameLayout2.getAlpha()));
    }

    public void showBotLayout(long j, boolean z) {
        showBotLayout(j, null, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (((org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout) r18.botAttachLayouts.get(r19)).needReload() == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showBotLayout(long j, String str, boolean z, boolean z2) {
        long j2;
        if (this.botAttachLayouts.get(j) != null) {
            if (Objects.equals(str, ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).getStartCommand())) {
            }
        }
        if (this.baseFragment instanceof ChatActivity) {
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = new ChatAttachAlertBotWebViewLayout(this, getContext(), this.resourcesProvider);
            this.botAttachLayouts.put(j, chatAttachAlertBotWebViewLayout);
            ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).setDelegate(new 1(chatAttachAlertBotWebViewLayout, str, j));
            MessageObject replyingMessageObject = ((ChatActivity) this.baseFragment).getChatActivityEnterView().getReplyingMessageObject();
            j2 = j;
            ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).requestWebView(this.currentAccount, ((ChatActivity) this.baseFragment).getDialogId(), j, false, replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0, str, ((ChatActivity) this.baseFragment).getSendMonoForumPeerId());
            if (this.botAttachLayouts.get(j2) == null) {
                ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j2)).disallowSwipeOffsetAnimation();
                showLayout((AttachAlertLayout) this.botAttachLayouts.get(j2), -j2, z2);
                if (z) {
                    ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j2)).showJustAddedBulletin();
                    return;
                }
                return;
            }
            return;
        }
        j2 = j;
        if (this.botAttachLayouts.get(j2) == null) {
        }
    }

    class 1 implements BotWebViewContainer.Delegate {
        private ValueAnimator botButtonAnimator;
        final /* synthetic */ long val$id;
        final /* synthetic */ String val$startCommand;
        final /* synthetic */ ChatAttachAlertBotWebViewLayout val$webViewLayout;

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ BotSensors getBotSensors() {
            return BotWebViewContainer.Delegate.-CC.$default$getBotSensors(this);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onCloseToTabs() {
            onCloseRequested(null);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onEmojiStatusGranted(boolean z) {
            BotWebViewContainer.Delegate.-CC.$default$onEmojiStatusGranted(this, z);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onEmojiStatusSet(TLRPC.Document document) {
            BotWebViewContainer.Delegate.-CC.$default$onEmojiStatusSet(this, document);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ String onFullscreenRequested(boolean z, boolean z2) {
            return BotWebViewContainer.Delegate.-CC.$default$onFullscreenRequested(this, z, z2);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onInstantClose() {
            onCloseRequested(null);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onLocationGranted(boolean z) {
            BotWebViewContainer.Delegate.-CC.$default$onLocationGranted(this, z);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onOpenBackFromTabs() {
            BotWebViewContainer.Delegate.-CC.$default$onOpenBackFromTabs(this);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onOrientationLockChanged(boolean z) {
            BotWebViewContainer.Delegate.-CC.$default$onOrientationLockChanged(this, z);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onSendWebViewData(String str) {
            BotWebViewContainer.Delegate.-CC.$default$onSendWebViewData(this, str);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onSharedTo(ArrayList arrayList) {
            BotWebViewContainer.Delegate.-CC.$default$onSharedTo(this, arrayList);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onWebAppBackgroundChanged(boolean z, int i) {
            BotWebViewContainer.Delegate.-CC.$default$onWebAppBackgroundChanged(this, z, i);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onWebAppReady() {
            BotWebViewContainer.Delegate.-CC.$default$onWebAppReady(this);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public /* synthetic */ void onWebAppSetNavigationBarColor(int i) {
            BotWebViewContainer.Delegate.-CC.$default$onWebAppSetNavigationBarColor(this, i);
        }

        1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, long j) {
            this.val$webViewLayout = chatAttachAlertBotWebViewLayout;
            this.val$startCommand = str;
            this.val$id = j;
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onWebAppSetupClosingBehavior(boolean z) {
            this.val$webViewLayout.setNeedCloseConfirmation(z);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onWebAppSwipingBehavior(boolean z) {
            this.val$webViewLayout.setAllowSwipes(z);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onCloseRequested(final Runnable runnable) {
            if (ChatAttachAlert.this.currentAttachLayout != this.val$webViewLayout) {
                return;
            }
            ChatAttachAlert.this.setFocusable(false);
            ChatAttachAlert.this.getWindow().setSoftInputMode(48);
            ChatAttachAlert.this.lambda$new$0();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.1.lambda$onCloseRequested$0(runnable);
                }
            }, 150L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCloseRequested$0(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onWebAppSetActionBarColor(int i, final int i2, boolean z) {
            final int color = ((ColorDrawable) ChatAttachAlert.this.actionBar.getBackground()).getColor();
            final BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating = new BotWebViewMenuContainer$ActionBarColorsAnimating();
            botWebViewMenuContainer$ActionBarColorsAnimating.setFrom(ChatAttachAlert.this.overrideBackgroundColor ? color : 0, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            ChatAttachAlert.this.overrideBackgroundColor = z;
            botWebViewMenuContainer$ActionBarColorsAnimating.setTo(ChatAttachAlert.this.overrideBackgroundColor ? i2 : 0, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$1$$ExternalSyntheticLambda2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatAttachAlert.1.this.lambda$onWebAppSetActionBarColor$1(chatAttachAlertBotWebViewLayout, color, i2, botWebViewMenuContainer$ActionBarColorsAnimating, valueAnimator);
                }
            });
            duration.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onWebAppSetActionBarColor$1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, int i, int i2, BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            chatAttachAlertBotWebViewLayout.setCustomActionBarBackground(ColorUtils.blendARGB(i, i2, floatValue));
            ChatAttachAlert.this.currentAttachLayout.invalidate();
            ChatAttachAlert.this.sizeNotifierFrameLayout.invalidate();
            botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(ChatAttachAlert.this.actionBar, floatValue);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onWebAppSetBackgroundColor(int i) {
            this.val$webViewLayout.setCustomBackground(i);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, final String str, TLObject tLObject) {
            PaymentFormActivity paymentFormActivity;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                final AlertDialog alertDialog = new AlertDialog(ChatAttachAlert.this.getContext(), 3);
                alertDialog.showDelayed(150L);
                StarsController starsController = StarsController.getInstance(ChatAttachAlert.this.currentAccount);
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject;
                Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$1$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        AlertDialog.this.dismiss();
                    }
                };
                final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
                starsController.openPaymentForm(null, inputInvoice, tL_payments_paymentFormStars, runnable, new Utilities.Callback() { // from class: org.telegram.ui.Components.ChatAttachAlert$1$$ExternalSyntheticLambda5
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        ChatAttachAlert.1.lambda$onWebAppOpenInvoice$3(ChatAttachAlertBotWebViewLayout.this, str, (String) obj);
                    }
                });
                AndroidUtilities.hideKeyboard(this.val$webViewLayout);
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(chatAttachAlert.currentAccount).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, str, baseFragment);
            } else {
                paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                this.val$webViewLayout.scrollToTop();
                AndroidUtilities.hideKeyboard(this.val$webViewLayout);
                final OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(baseFragment.getParentActivity(), ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
                overlayActionBarLayoutDialog.show();
                final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout2 = this.val$webViewLayout;
                paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() { // from class: org.telegram.ui.Components.ChatAttachAlert$1$$ExternalSyntheticLambda6
                    @Override // org.telegram.ui.PaymentFormActivity.PaymentFormCallback
                    public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                        ChatAttachAlert.1.lambda$onWebAppOpenInvoice$4(OverlayActionBarLayoutDialog.this, chatAttachAlertBotWebViewLayout2, str, invoiceStatus);
                    }
                });
                paymentFormActivity.setResourcesProvider(((BottomSheet) ChatAttachAlert.this).resourcesProvider);
                overlayActionBarLayoutDialog.addFragment(paymentFormActivity);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onWebAppOpenInvoice$3(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, String str2) {
            chatAttachAlertBotWebViewLayout.getWebViewContainer().onInvoiceStatusUpdate(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onWebAppOpenInvoice$4(OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, PaymentFormActivity.InvoiceStatus invoiceStatus) {
            if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING) {
                overlayActionBarLayoutDialog.dismiss();
            }
            chatAttachAlertBotWebViewLayout.getWebViewContainer().onInvoiceStatusUpdate(str, invoiceStatus.name().toLowerCase(Locale.ROOT));
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onWebAppExpand() {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout && chatAttachAlertBotWebViewLayout.canExpandByRequest()) {
                this.val$webViewLayout.scrollToTop();
            }
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onWebAppSwitchInlineQuery(final TLRPC.User user, final String str, List list) {
            if (list.isEmpty()) {
                BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                if (baseFragment instanceof ChatActivity) {
                    ((ChatActivity) baseFragment).getChatActivityEnterView().setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                }
                ChatAttachAlert.this.dismiss(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialogsType", 14);
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("allowGroups", list.contains("groups"));
            bundle.putBoolean("allowLegacyGroups", list.contains("groups"));
            bundle.putBoolean("allowMegagroups", list.contains("groups"));
            bundle.putBoolean("allowUsers", list.contains("users"));
            bundle.putBoolean("allowChannels", list.contains("channels"));
            bundle.putBoolean("allowBots", list.contains("bots"));
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            final OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(ChatAttachAlert.this.getContext(), ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$1$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                public /* synthetic */ boolean canSelectStories() {
                    return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
                }

                @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
                    boolean lambda$onWebAppSwitchInlineQuery$5;
                    lambda$onWebAppSwitchInlineQuery$5 = ChatAttachAlert.1.this.lambda$onWebAppSwitchInlineQuery$5(user, str, overlayActionBarLayoutDialog, dialogsActivity2, arrayList, charSequence, z, z2, i, i2, topicsFragment);
                    return lambda$onWebAppSwitchInlineQuery$5;
                }

                @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity2) {
                    return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity2);
                }
            });
            overlayActionBarLayoutDialog.show();
            overlayActionBarLayoutDialog.addFragment(dialogsActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onWebAppSwitchInlineQuery$5(TLRPC.User user, String str, OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
            long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundle = new Bundle();
            bundle.putBoolean("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j)) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
            } else if (DialogObject.isUserDialog(j)) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (MessagesController.getInstance(chatAttachAlert.currentAccount).checkCanOpenChat(bundle, baseFragment)) {
                overlayActionBarLayoutDialog.dismiss();
                ChatAttachAlert.this.dismiss(true);
                baseFragment.presentFragment(new INavigationLayout.NavigationParams(new ChatActivity(bundle)).setRemoveLast(true));
            }
            return true;
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onSetupMainButton(final boolean z, boolean z2, String str, long j, int i, int i2, final boolean z3, boolean z4) {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout) {
                if (chatAttachAlertBotWebViewLayout.isBotButtonAvailable() || this.val$startCommand != null) {
                    ChatAttachAlert.this.botMainButtonTextView.setClickable(z2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (j == 0) {
                        ChatAttachAlert.this.botMainButtonTextView.setText(str);
                    } else {
                        spannableStringBuilder.append((CharSequence) "* ");
                        spannableStringBuilder.append((CharSequence) str);
                        spannableStringBuilder.setSpan(new AnimatedEmojiSpan(j, 1.4f, ChatAttachAlert.this.botMainButtonTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
                        ChatAttachAlert.this.botMainButtonTextView.setText(spannableStringBuilder);
                    }
                    ChatAttachAlert.this.botMainButtonTextView.setTextColor(i2);
                    ChatAttachAlert.this.botMainButtonTextView.setEmojiColor(i2);
                    ChatAttachAlert.this.botMainButtonTextView.setBackground(BotWebViewContainer.getMainButtonRippleDrawable(i));
                    if (ChatAttachAlert.this.botButtonWasVisible != z) {
                        ChatAttachAlert.this.botButtonWasVisible = z;
                        ValueAnimator valueAnimator = this.botButtonAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(250L);
                        this.botButtonAnimator = duration;
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$1$$ExternalSyntheticLambda3
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                ChatAttachAlert.1.this.lambda$onSetupMainButton$6(valueAnimator2);
                            }
                        });
                        this.botButtonAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                if (z) {
                                    ChatAttachAlert.this.botMainButtonTextView.setAlpha(0.0f);
                                    ChatAttachAlert.this.botMainButtonTextView.setVisibility(0);
                                    int dp = AndroidUtilities.dp(36.0f);
                                    for (int i3 = 0; i3 < ChatAttachAlert.this.botAttachLayouts.size(); i3++) {
                                        ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i3)).setMeasureOffsetY(dp);
                                    }
                                    return;
                                }
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(0.0f);
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(0);
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                if (!z) {
                                    ChatAttachAlert.this.botMainButtonTextView.setVisibility(8);
                                } else {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(8);
                                }
                                int dp = z ? AndroidUtilities.dp(36.0f) : 0;
                                for (int i3 = 0; i3 < ChatAttachAlert.this.botAttachLayouts.size(); i3++) {
                                    ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i3)).setMeasureOffsetY(dp);
                                }
                                if (1.this.botButtonAnimator == animator) {
                                    1.this.botButtonAnimator = null;
                                }
                            }
                        });
                        this.botButtonAnimator.start();
                    }
                    ChatAttachAlert.this.botProgressView.setProgressColor(i2);
                    if (ChatAttachAlert.this.botButtonProgressWasVisible != z3) {
                        ChatAttachAlert.this.botProgressView.animate().cancel();
                        if (z3) {
                            ChatAttachAlert.this.botProgressView.setAlpha(0.0f);
                            ChatAttachAlert.this.botProgressView.setVisibility(0);
                        }
                        ChatAttachAlert.this.botProgressView.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.1f).scaleY(z3 ? 1.0f : 0.1f).setDuration(250L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.1.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                ChatAttachAlert.this.botButtonProgressWasVisible = z3;
                                if (z3) {
                                    return;
                                }
                                ChatAttachAlert.this.botProgressView.setVisibility(8);
                            }
                        }).start();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSetupMainButton$6(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(1.0f - floatValue);
            ChatAttachAlert.this.botMainButtonTextView.setAlpha(floatValue);
            ChatAttachAlert.this.botMainButtonOffsetY = floatValue * AndroidUtilities.dp(36.0f);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.buttonsRecyclerViewWrapper.setTranslationY(chatAttachAlert.botMainButtonOffsetY);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onSetBackButtonVisible(boolean z) {
            AndroidUtilities.updateImageViewImageAnimated(ChatAttachAlert.this.actionBar.getBackButton(), z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public void onSetSettingsButtonVisible(boolean z) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.val$webViewLayout.settingsItem;
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setVisibility(z ? 0 : 8);
            }
        }

        @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
        public boolean isClipboardAvailable() {
            return MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).botInAttachMenu(this.val$id) || MessagesController.getInstance(ChatAttachAlert.this.currentAccount).whitelistedBots.contains(Long.valueOf(this.val$id));
        }
    }

    public boolean checkCaption(CharSequence charSequence) {
        BaseFragment baseFragment = this.baseFragment;
        if (!(baseFragment instanceof ChatActivity)) {
            return false;
        }
        return ChatActivityEnterView.checkPremiumAnimatedEmoji(this.currentAccount, ((ChatActivity) baseFragment).getDialogId(), this.baseFragment, this.sizeNotifierFrameLayout, charSequence);
    }

    public void avatarFor(ImageUpdater.AvatarFor avatarFor) {
        this.setAvatarFor = avatarFor;
    }

    public ImageUpdater.AvatarFor getAvatarFor() {
        return this.setAvatarFor;
    }

    public void setImageUpdater(ImageUpdater imageUpdater) {
        this.parentImageUpdater = imageUpdater;
    }

    public void setupPhotoPicker(String str) {
        this.avatarPicker = 1;
        this.isPhotoPicker = true;
        this.avatarSearch = false;
        this.typeButtonsAvailable = false;
        this.videosEnabled = false;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        this.selectedTextView.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.updateAvatarPicker();
        }
    }

    public void presentFragment(PhotoPickerActivity photoPickerActivity) {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            baseFragment.presentFragment(photoPickerActivity);
            return;
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(photoPickerActivity);
        }
    }

    public void setDialogId(long j) {
        this.dialogId = j;
    }

    public long getDialogId() {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            return ((ChatActivity) baseFragment).getDialogId();
        }
        return this.dialogId;
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        AttachAlertLayout attachAlertLayout;
        if (i == 0) {
            checkUi_writeButtonContainerY();
            checkUi_bottomFade();
            return;
        }
        if (i != 2) {
            if (i == 1) {
                checkUi_bottomFade();
                return;
            } else if (i == 3) {
                checkUi_moveCaptionButtonVisibility();
                return;
            } else {
                if (i == 4) {
                    checkUi_moveCaptionButtonVisibility();
                    return;
                }
                return;
            }
        }
        checkUi_bottomFade();
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (chatAttachAlertPollLayout != null && ((attachAlertLayout = this.nextAttachLayout) == chatAttachAlertPollLayout || this.currentAttachLayout == chatAttachAlertPollLayout)) {
            updateSelectedPosition(attachAlertLayout == chatAttachAlertPollLayout ? 1 : 0);
        }
        ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
        if (chatAttachAlertPollLayout2 != null) {
            AttachAlertLayout attachAlertLayout2 = this.nextAttachLayout;
            if (attachAlertLayout2 == chatAttachAlertPollLayout2 || this.currentAttachLayout == chatAttachAlertPollLayout2) {
                updateSelectedPosition(attachAlertLayout2 != chatAttachAlertPollLayout2 ? 0 : 1);
            }
        }
    }

    public void checkUi_moveCaptionButtonVisibility() {
        FragmentFloatingButton.setAnimatedVisibility(this.moveCaptionButton, this.animatorCaptionNotEmpty.getFloatValue() * this.animatorToggleCaptionSupported.getFloatValue());
    }

    public interface ChatAttachViewDelegate {
        void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2);

        void didSelectBot(TLRPC.User user);

        void doOnIdle(Runnable runnable);

        boolean needEnterComment();

        void onCameraOpened();

        void onWallpaperSelected(Object obj);

        void openAvatarsSearch();

        boolean selectItemOnClicking();

        void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2);

        public abstract /* synthetic */ class -CC {
            public static void $default$didSelectBot(ChatAttachViewDelegate chatAttachViewDelegate, TLRPC.User user) {
            }

            public static boolean $default$needEnterComment(ChatAttachViewDelegate chatAttachViewDelegate) {
                return false;
            }

            public static void $default$onCameraOpened(ChatAttachViewDelegate chatAttachViewDelegate) {
            }

            public static void $default$onWallpaperSelected(ChatAttachViewDelegate chatAttachViewDelegate, Object obj) {
            }

            public static void $default$openAvatarsSearch(ChatAttachViewDelegate chatAttachViewDelegate) {
            }

            public static boolean $default$selectItemOnClicking(ChatAttachViewDelegate chatAttachViewDelegate) {
                return false;
            }

            public static void $default$sendAudio(ChatAttachViewDelegate chatAttachViewDelegate, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            }
        }
    }

    public void updateDoneItemEnabled() {
        TextView textView = this.doneItem;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        textView.setEnabled(attachAlertLayout == null ? false : attachAlertLayout.isDoneItemEnabled());
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        float f = 0.0f;
        if (attachAlertLayout2 != null) {
            f = 0.0f + ((attachAlertLayout2.isDoneItemEnabled() ? 1.0f : 0.5f) * (this.nextAttachLayout == null ? 1.0f : this.translationProgress));
        }
        AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
        if (attachAlertLayout3 != null) {
            f += (attachAlertLayout3.isDoneItemEnabled() ? 1.0f : 0.5f) * (1.0f - this.translationProgress);
        }
        this.doneItemAlphaByEnabled = f;
        checkUi_doneItemVisibility();
    }

    private void checkUi_doneItemVisibility() {
        TextView textView = this.doneItem;
        if (textView != null) {
            float f = this.doneItemAlphaByEnabled * this.doneItemAlphaByLayout;
            textView.setAlpha(f);
            this.doneItem.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    public static class AttachAlertLayout extends FrameLayout {
        protected IBlur3Capture iBlur3Capture;
        protected View iBlur3CaptureView;
        protected int listPaddingBottom;
        protected boolean occupyNavigationBar;
        protected boolean occupyStatusBar;
        protected ChatAttachAlert parentAlert;
        protected final Theme.ResourcesProvider resourcesProvider;

        public void applyCaption(CharSequence charSequence) {
        }

        public boolean canDismissWithTouchOutside() {
            return true;
        }

        public boolean canScheduleMessages() {
            return true;
        }

        public void checkColors() {
        }

        public boolean disableBottomFade() {
            return false;
        }

        public int getCurrentItemTop() {
            return 0;
        }

        public int getCustomActionBarBackground() {
            return 0;
        }

        public int getCustomBackground() {
            return 0;
        }

        public int getFirstOffset() {
            return 0;
        }

        public IBlur3Capture getIBlur3Capture() {
            return null;
        }

        public int getListTopPadding() {
            return 0;
        }

        public int getSelectedItemsCount() {
            return 0;
        }

        public ArrayList<ThemeDescription> getThemeDescriptions() {
            return null;
        }

        public boolean hasCustomActionBarBackground() {
            return false;
        }

        public boolean hasCustomBackground() {
            return false;
        }

        public boolean isDoneItemEnabled() {
            return false;
        }

        public int needsActionBar() {
            return 0;
        }

        public boolean onBackPressed() {
            return false;
        }

        public void onButtonsTranslationYUpdated() {
        }

        public void onContainerTranslationUpdated(float f) {
        }

        public boolean onContainerViewTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void onDestroy() {
        }

        public boolean onDismiss() {
            return false;
        }

        public void onDismissWithButtonClick(int i) {
        }

        public boolean onDismissWithTouchOutside() {
            return true;
        }

        public void onHidden() {
        }

        public void onHide() {
        }

        public void onHideShowProgress(float f) {
        }

        public void onMenuItemClick(int i) {
        }

        public void onOpenAnimationEnd() {
        }

        public void onPanTransitionEnd() {
        }

        public void onPanTransitionStart(boolean z, int i) {
        }

        public void onPause() {
        }

        public void onPreMeasure(int i, int i2) {
        }

        public void onResume() {
        }

        public void onSelectedItemsCountChanged(int i) {
        }

        public boolean onSheetKeyDown(int i, KeyEvent keyEvent) {
            return false;
        }

        public void onShow(AttachAlertLayout attachAlertLayout) {
        }

        public void onShown() {
        }

        public void scrollToTop() {
        }

        public boolean sendSelectedItems(boolean z, int i, int i2, long j, boolean z2) {
            return false;
        }

        public boolean shouldHideBottomButtons() {
            return true;
        }

        public AttachAlertLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            this.parentAlert = chatAttachAlert;
        }

        public int getButtonsHideOffset() {
            return AndroidUtilities.dp(needsActionBar() != 0 ? 12.0f : 17.0f);
        }

        public int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }
    }

    private static abstract class AttachButtonBase extends FrameLayout {
        protected GlassTabView glassTabView;

        public AttachButtonBase(Context context) {
            super(context);
        }
    }

    private class AttachButton extends AttachButtonBase {
        private int currentId;

        @Override // android.view.View
        public boolean hasOverlappingRendering() {
            return false;
        }

        public AttachButton(Context context) {
            super(context);
            setWillNotDraw(false);
            setFocusable(true);
            GlassTabView createAttachTab = GlassTabView.createAttachTab(context, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            this.glassTabView = createAttachTab;
            addView(createAttachTab, LayoutHelper.createFrame(-1, -1.0f));
        }

        void updateCheckedState(boolean z) {
            this.glassTabView.setSelected(((long) this.currentId) == ChatAttachAlert.this.selectedId, z);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        public void setTextAndIcon(int i, CharSequence charSequence, GlassTabView.TabAnimation tabAnimation) {
            this.glassTabView.setText(charSequence);
            this.glassTabView.setTabAnimation(tabAnimation);
            this.currentId = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class AttachBotButton extends AttachButtonBase {
        private TLRPC.TL_attachMenuBot attachMenuBot;
        private TLRPC.User currentUser;

        public AttachBotButton(Context context) {
            super(context);
            setWillNotDraw(false);
            setFocusable(true);
            setFocusableInTouchMode(true);
            GlassTabView createAttachBotTab = GlassTabView.createAttachBotTab(context, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            this.glassTabView = createAttachBotTab;
            createAttachBotTab.getBackupImageView().imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$AttachBotButton$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                    ChatAttachAlert.AttachBotButton.lambda$new$0(imageReceiver, z, z2, z3);
                }

                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public /* synthetic */ void didSetImageBitmap(int i, String str, Drawable drawable) {
                    ImageReceiver.ImageReceiverDelegate.-CC.$default$didSetImageBitmap(this, i, str, drawable);
                }

                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
                    ImageReceiver.ImageReceiverDelegate.-CC.$default$onAnimationReady(this, imageReceiver);
                }
            });
            addView(this.glassTabView, LayoutHelper.createFrame(-1, -1.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
            Drawable drawable = imageReceiver.getDrawable();
            if (drawable instanceof RLottieDrawable) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                rLottieDrawable.setCustomEndFrame(0);
                rLottieDrawable.stop();
                rLottieDrawable.setProgress(0.0f, false);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        void updateCheckedState(boolean z) {
            boolean z2 = this.attachMenuBot != null && (-this.currentUser.id) == ChatAttachAlert.this.selectedId;
            this.glassTabView.setSelected(z2, z);
            RLottieDrawable lottieAnimation = this.glassTabView.getBackupImageView().getImageReceiver().getLottieAnimation();
            if (!z) {
                if (lottieAnimation != null) {
                    lottieAnimation.stop();
                    lottieAnimation.setProgress(0.0f, false);
                    return;
                }
                return;
            }
            if (!z2 || lottieAnimation == null) {
                return;
            }
            lottieAnimation.setAutoRepeat(0);
            lottieAnimation.setCustomEndFrame(-1);
            lottieAnimation.setProgress(0.0f, false);
            lottieAnimation.start();
        }

        public void setUser(TLRPC.User user) {
            if (user == null) {
                return;
            }
            this.glassTabView.setAttachBotUser(user, ChatAttachAlert.this.currentAccount);
            this.currentUser = user;
            this.attachMenuBot = null;
            this.glassTabView.setSelected(false, false);
            invalidate();
        }

        public void setAttachBot(TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
            if (user == null || tL_attachMenuBot == null) {
                return;
            }
            this.glassTabView.setAttachBot(user, tL_attachMenuBot, ChatAttachAlert.this.currentAccount);
            this.currentUser = user;
            this.attachMenuBot = tL_attachMenuBot;
            this.glassTabView.setSelected(false, false);
            invalidate();
        }
    }

    public ChatAttachAlert(Context context, BaseFragment baseFragment, boolean z, boolean z2) {
        this(context, baseFragment, z, z2, true, null);
    }

    public ChatAttachAlert(final Context context, final BaseFragment baseFragment, boolean z, final boolean z2, boolean z3, final Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        TextView textView;
        int i;
        int i2;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCaptionAbove = new BoolAnimator(0, this, cubicBezierInterpolator, 380L);
        this.animatorCaptionVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L);
        this.animatorActionBarVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 380L);
        this.animatorCaptionNotEmpty = new BoolAnimator(3, this, cubicBezierInterpolator, 380L);
        this.animatorToggleCaptionSupported = new BoolAnimator(4, this, cubicBezierInterpolator, 380L, true);
        this.animatorEphemeralMessageVisibility = new BoolAnimator(5, this, cubicBezierInterpolator, 320L);
        ReplaceAnimator replaceAnimator = new ReplaceAnimator(new ReplaceAnimator.Callback() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda14
            @Override // me.vkryl.android.animator.ReplaceAnimator.Callback
            public /* synthetic */ boolean hasChanges(ReplaceAnimator replaceAnimator2) {
                return ReplaceAnimator.Callback.-CC.$default$hasChanges(this, replaceAnimator2);
            }

            @Override // me.vkryl.android.animator.ReplaceAnimator.Callback
            public /* synthetic */ boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator2, float f) {
                return ReplaceAnimator.Callback.-CC.$default$onApplyMetadataAnimation(this, replaceAnimator2, f);
            }

            @Override // me.vkryl.android.animator.ReplaceAnimator.Callback
            public /* synthetic */ void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator2, boolean z4) {
                ReplaceAnimator.Callback.-CC.$default$onFinishMetadataAnimation(this, replaceAnimator2, z4);
            }

            @Override // me.vkryl.android.animator.ReplaceAnimator.Callback
            public /* synthetic */ void onForceApplyChanges(ReplaceAnimator replaceAnimator2) {
                ReplaceAnimator.Callback.-CC.$default$onForceApplyChanges(this, replaceAnimator2);
            }

            @Override // me.vkryl.android.animator.ReplaceAnimator.Callback
            public final void onItemChanged(ReplaceAnimator replaceAnimator2) {
                ChatAttachAlert.this.onCurrentLayoutAnimatorChanged(replaceAnimator2);
            }

            @Override // me.vkryl.android.animator.ReplaceAnimator.Callback
            public /* synthetic */ void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator2) {
                ReplaceAnimator.Callback.-CC.$default$onPrepareMetadataAnimation(this, replaceAnimator2);
            }
        }, cubicBezierInterpolator, 380L);
        this.animatorCurrentVisibleLayout = replaceAnimator;
        this.canOpenPreview = false;
        this.isSoundPicker = false;
        this.isStoryLocationPicker = false;
        this.isBizLocationPicker = false;
        this.isLocationPicker = false;
        this.isStoryAudioPicker = false;
        this.translationProgress = 0.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION = new AnimationProperties.FloatProperty("translation") { // from class: org.telegram.ui.Components.ChatAttachAlert.2
            @Override // org.telegram.ui.Components.AnimationProperties.FloatProperty
            public void setValue(AttachAlertLayout attachAlertLayout, float f) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.translationProgress = f;
                if (chatAttachAlert.nextAttachLayout == null) {
                    return;
                }
                if ((ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                    int max = Math.max(ChatAttachAlert.this.nextAttachLayout.getWidth(), ChatAttachAlert.this.currentAttachLayout.getWidth());
                    if (ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX((-max) * f);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((1.0f - f) * max);
                    } else {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX(max * f);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((-max) * (1.0f - f));
                    }
                } else {
                    ChatAttachAlert.this.nextAttachLayout.setAlpha(f);
                    ChatAttachAlert.this.nextAttachLayout.onHideShowProgress(f);
                    if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout) {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.updateSelectedPosition(chatAttachAlert2.nextAttachLayout == ChatAttachAlert.this.pollLayout ? 1 : 0);
                    }
                    if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.todoLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout) {
                        ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                        chatAttachAlert3.updateSelectedPosition(chatAttachAlert3.nextAttachLayout == ChatAttachAlert.this.todoLayout ? 1 : 0);
                    }
                    ChatAttachAlert.this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) * f);
                    ChatAttachAlert.this.currentAttachLayout.onHideShowProgress(1.0f - Math.min(1.0f, f / 0.7f));
                    ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                }
                if (ChatAttachAlert.this.viewChangeAnimator != null) {
                    ChatAttachAlert.this.updateSelectedPosition(1);
                }
                ChatAttachAlert.this.blur3_InvalidateBlur();
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }

            @Override // android.util.Property
            public Float get(AttachAlertLayout attachAlertLayout) {
                return Float.valueOf(ChatAttachAlert.this.translationProgress);
            }
        };
        this.allowLivePhotos = false;
        this.layouts = new AttachAlertLayout[11];
        this.botAttachLayouts = new LongSparseArray();
        this.commentTextViewLocation = new int[2];
        this.textPaint = new TextPaint(1);
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.sendButtonEnabled = true;
        this.sendButtonEnabledProgress = 1.0f;
        this.cornerRadius = 1.0f;
        this.botButtonProgressWasVisible = false;
        this.botButtonWasVisible = false;
        int i3 = UserConfig.selectedAccount;
        this.currentAccount = i3;
        this.documentsEnabled = true;
        this.photosEnabled = true;
        this.videosEnabled = true;
        this.musicEnabled = true;
        this.pollsEnabled = true;
        this.todoEnabled = true;
        this.plainTextEnabled = true;
        this.maxSelectedPhotos = -1;
        this.allowOrder = true;
        this.attachItemSize = AndroidUtilities.dp(85.0f);
        this.decelerateInterpolator = new DecelerateInterpolator();
        this.scrollOffsetY = new int[2];
        this.attachButtonPaint = new Paint(1);
        this.captionLimitBulletinShown = false;
        this.exclusionRects = new ArrayList();
        this.exclustionRect = new Rect();
        this.ATTACH_ALERT_PROGRESS = new AnimationProperties.FloatProperty("openProgress") { // from class: org.telegram.ui.Components.ChatAttachAlert.32
            private float openProgress;

            @Override // org.telegram.ui.Components.AnimationProperties.FloatProperty
            public void setValue(ChatAttachAlert chatAttachAlert, float f) {
                float f2;
                int childCount = ChatAttachAlert.this.buttonsRecyclerView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    float f3 = (3 - i4) * 32.0f;
                    View childAt = ChatAttachAlert.this.buttonsRecyclerView.getChildAt(i4);
                    if (f > f3) {
                        float f4 = f - f3;
                        if (f4 <= 200.0f) {
                            float f5 = f4 / 200.0f;
                            f2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(f5) * 1.1f;
                            childAt.setAlpha(CubicBezierInterpolator.EASE_BOTH.getInterpolation(f5));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f6 = f4 - 200.0f;
                            f2 = f6 <= 100.0f ? 1.1f - (CubicBezierInterpolator.EASE_IN.getInterpolation(f6 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f2 = 0.0f;
                    }
                    if (childAt instanceof AttachButtonBase) {
                        ((AttachButtonBase) childAt).glassTabView.setAttachScale(f2);
                    }
                }
            }

            @Override // android.util.Property
            public Float get(ChatAttachAlert chatAttachAlert) {
                return Float.valueOf(this.openProgress);
            }
        };
        this.allowDrawContent = true;
        this.sent = false;
        this.confirmationAlertShown = false;
        this.allowPassConfirmationAlert = false;
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        RectF rectF3 = new RectF();
        this.iBlur3PositionFastScroll = rectF3;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        arrayList.add(rectF3);
        this.iBlur3PositionsMerged = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        boolean z4 = baseFragment instanceof ChatActivity;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() { // from class: org.telegram.ui.Components.ChatAttachAlert.3
                @Override // org.telegram.ui.Components.blur3.RenderNodeWithHash.Renderer
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                }

                @Override // org.telegram.ui.Components.blur3.RenderNodeWithHash.Renderer
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ChatAttachAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -2);
                    }
                }
            });
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new RenderNodeWithHash.Renderer() { // from class: org.telegram.ui.Components.ChatAttachAlert.4
                @Override // org.telegram.ui.Components.blur3.RenderNodeWithHash.Renderer
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                }

                @Override // org.telegram.ui.Components.blur3.RenderNodeWithHash.Renderer
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ChatAttachAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -3);
                    }
                }
            });
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.iBlur3FactoryFade = blurredBackgroundDrawableViewFactory3;
        this.iBlur3Capture = new IBlur3Capture() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda25
            @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
            public final void capture(Canvas canvas, RectF rectF4) {
                ChatAttachAlert.this.lambda$new$0(canvas, rectF4);
            }

            @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
            public /* synthetic */ void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF4) {
                iBlur3Hash.unsupported();
            }
        };
        this.forceDarkTheme = z;
        this.showingFromDialog = z2;
        this.inBubbleMode = z4 && baseFragment.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.baseFragment = baseFragment;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i3).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i3).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i3).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i3).addObserver(this, NotificationCenter.quickRepliesUpdated);
        this.exclusionRects.add(this.exclustionRect);
        5 r0 = new 5(context);
        this.sizeNotifierFrameLayout = r0;
        r0.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert.6
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate
            public void onSizeChanged(int i4, boolean z5) {
                if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout) {
                    ChatAttachAlert.this.currentAttachLayout.invalidate();
                }
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i4 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i4, 0, i4, 0);
        ActionBar actionBar = new ActionBar(context, resourcesProvider) { // from class: org.telegram.ui.Components.ChatAttachAlert.7
            @Override // android.view.View
            public void setVisibility(int i5) {
                super.setVisibility(i5);
                ChatAttachAlert.this.checkUi_fadeTopAlpha();
            }

            @Override // android.view.View
            public void setAlpha(float f) {
                float alpha = getAlpha();
                super.setAlpha(f);
                if (alpha != f) {
                    TextView textView2 = ChatAttachAlert.this.selectedTextView;
                    if (textView2 != null) {
                        float f2 = 1.0f - f;
                        textView2.setAlpha(f2);
                        ChatAttachAlert.this.selectedTextView.setVisibility(f2 > 0.0f ? 0 : 8);
                    }
                    ChatAttachAlert.this.checkUi_fadeTopAlpha();
                    ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
                    if (ChatAttachAlert.this.frameLayout2 != null) {
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        if (chatAttachAlert.buttonsRecyclerViewWrapper != null) {
                            if (chatAttachAlert.frameLayout2.getTag() == null) {
                                if (ChatAttachAlert.this.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons()) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(1.0f - f);
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setTranslationY(AndroidUtilities.dp(44.0f) * f);
                                }
                                ChatAttachAlert.this.frameLayout2.setTranslationY(AndroidUtilities.dp(48.0f) * f);
                                return;
                            }
                            if (ChatAttachAlert.this.currentAttachLayout == null) {
                                float f3 = f == 0.0f ? 1.0f : 0.0f;
                                if (ChatAttachAlert.this.buttonsRecyclerViewWrapper.getAlpha() != f3) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(f3);
                                }
                            }
                        }
                    }
                }
            }
        };
        this.actionBar = actionBar;
        actionBar.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        ActionBar actionBar2 = this.actionBar;
        int i5 = Theme.key_dialogTextBlack;
        actionBar2.setItemsColor(getThemedColor(i5), false);
        ActionBar actionBar3 = this.actionBar;
        int i6 = Theme.key_dialogButtonSelector;
        actionBar3.setItemsBackgroundColor(getThemedColor(i6), false);
        this.actionBar.setTitleColor(getThemedColor(i5));
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setAlpha(0.0f);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.Components.ChatAttachAlert.8
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i7) {
                if (i7 == -1) {
                    if (ChatAttachAlert.this.currentAttachLayout.onBackPressed()) {
                        return;
                    }
                    ChatAttachAlert.this.lambda$new$0();
                    return;
                }
                ChatAttachAlert.this.currentAttachLayout.onMenuItemClick(i7);
            }
        });
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, getThemedColor(i5), false, resourcesProvider);
        this.selectedMenuItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        ActionBarMenuItem actionBarMenuItem2 = this.selectedMenuItem;
        int i7 = R.drawable.ic_ab_other;
        actionBarMenuItem2.setIcon(i7);
        ActionBarMenuItem actionBarMenuItem3 = this.selectedMenuItem;
        int i8 = R.string.AccDescrMoreOptions;
        actionBarMenuItem3.setContentDescription(LocaleController.getString(i8));
        this.selectedMenuItem.setVisibility(4);
        this.selectedMenuItem.setAlpha(0.0f);
        this.selectedMenuItem.setScaleX(0.6f);
        this.selectedMenuItem.setScaleY(0.6f);
        this.selectedMenuItem.setSubMenuOpenSide(2);
        this.selectedMenuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda26
            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemDelegate
            public final void onItemClick(int i9) {
                ChatAttachAlert.this.lambda$new$1(i9);
            }
        });
        this.selectedMenuItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        this.selectedMenuItem.setTranslationX(AndroidUtilities.dp(1.0f));
        this.selectedMenuItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i6), 6));
        this.selectedMenuItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$2(view);
            }
        });
        ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem(context, null, 0, getThemedColor(i5), false, resourcesProvider);
        this.motionItem = actionBarMenuItem4;
        actionBarMenuItem4.setLongClickEnabled(false);
        ActionBarMenuItem actionBarMenuItem5 = this.motionItem;
        MotionPhotoDrawable motionPhotoDrawable = new MotionPhotoDrawable();
        this.motionIcon = motionPhotoDrawable;
        actionBarMenuItem5.setIcon(motionPhotoDrawable);
        this.motionItem.setContentDescription(LocaleController.getString(i8));
        this.motionItem.setVisibility(8);
        this.motionItem.setAlpha(0.0f);
        this.motionItem.setScaleX(0.6f);
        this.motionItem.setScaleY(0.6f);
        this.motionItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        this.motionItem.setTranslationX(-AndroidUtilities.dp(3.0f));
        this.motionItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i6), 6));
        this.motionItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$3(view);
            }
        });
        TextView textView2 = new TextView(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.9
            Paint p = new Paint(1);

            @Override // android.widget.TextView, android.view.View
            protected void onDraw(Canvas canvas) {
                this.p.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_featuredStickers_addButton));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.p);
                super.onDraw(canvas);
            }
        };
        textView2.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView2.setText(LocaleController.getString(R.string.Create));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 14.0f);
        textView2.setVisibility(4);
        textView2.setAlpha(0.0f);
        textView2.setGravity(17);
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setTranslationX(-AndroidUtilities.dp(12.0f));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda29
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$4(view);
            }
        });
        ScaleStateListAnimator.apply(textView2);
        this.doneItem = textView2;
        updateDoneItemEnabled();
        if (baseFragment != null) {
            i2 = i5;
            textView = textView2;
            ActionBarMenuItem actionBarMenuItem6 = new ActionBarMenuItem(context, null, 0, getThemedColor(i5), false, resourcesProvider);
            this.searchItem = actionBarMenuItem6;
            actionBarMenuItem6.setLongClickEnabled(false);
            this.searchItem.setIcon(R.drawable.outline_header_search);
            this.searchItem.setContentDescription(LocaleController.getString(R.string.Search));
            this.searchItem.setVisibility(4);
            this.searchItem.setAlpha(0.0f);
            this.searchItem.setTranslationX(-AndroidUtilities.dp(42.0f));
            i = i6;
            this.searchItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i), 6));
            this.searchItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatAttachAlert.this.lambda$new$5(z2, view);
                }
            });
        } else {
            textView = textView2;
            i = i6;
            i2 = i5;
        }
        ActionBarMenuItem actionBarMenuItem7 = new ActionBarMenuItem(context, null, 0, getThemedColor(i2), false, resourcesProvider);
        this.optionsItem = actionBarMenuItem7;
        actionBarMenuItem7.setLongClickEnabled(false);
        this.optionsItem.setIcon(i7);
        this.optionsItem.setContentDescription(LocaleController.getString(i8));
        this.optionsItem.setVisibility(8);
        this.optionsItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 3));
        this.optionsItem.addSubItem(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$6(resourcesProvider, view);
            }
        });
        this.optionsItem.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        this.optionsItem.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        this.optionsItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$7(view);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.12
            @Override // android.view.View
            public void setAlpha(float f) {
                super.setAlpha(f);
                ChatAttachAlert.this.updateSelectedPosition(0);
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        this.headerView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda33
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$8(view);
            }
        });
        this.headerView.setAlpha(0.0f);
        this.headerView.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.selectedView = linearLayout;
        linearLayout.setOrientation(0);
        this.selectedView.setGravity(16);
        TextView textView3 = new TextView(context);
        this.selectedTextView = textView3;
        textView3.setTextColor(getThemedColor(i2));
        this.selectedTextView.setTextSize(1, 16.0f);
        this.selectedTextView.setTypeface(AndroidUtilities.bold());
        this.selectedTextView.setGravity(19);
        this.selectedTextView.setMaxLines(1);
        this.selectedTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.selectedView.addView(this.selectedTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.selectedArrowImageView = new ImageView(context);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i2);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        this.selectedArrowImageView.setImageDrawable(mutate);
        this.selectedArrowImageView.setVisibility(8);
        this.selectedView.addView(this.selectedArrowImageView, LayoutHelper.createLinear(-2, -2, 16, 4, 1, 0, 0));
        this.selectedView.setAlpha(1.0f);
        this.headerView.addView(this.selectedView, LayoutHelper.createFrame(-2, -1.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.mediaPreviewView = linearLayout2;
        linearLayout2.setOrientation(0);
        this.mediaPreviewView.setGravity(16);
        ImageView imageView = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), mode));
        imageView.setImageDrawable(mutate2);
        this.mediaPreviewView.addView(imageView, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 4, 0));
        TextView textView4 = new TextView(context);
        this.mediaPreviewTextView = textView4;
        textView4.setTextColor(getThemedColor(i2));
        this.mediaPreviewTextView.setTextSize(1, 16.0f);
        this.mediaPreviewTextView.setTypeface(AndroidUtilities.bold());
        this.mediaPreviewTextView.setGravity(19);
        this.mediaPreviewTextView.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        this.mediaPreviewView.setAlpha(0.0f);
        this.mediaPreviewView.addView(this.mediaPreviewTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.headerView.addView(this.mediaPreviewView, LayoutHelper.createFrame(-2, -1.0f));
        AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z, z3, resourcesProvider);
        this.photoLayout = chatAttachAlertPhotoLayout;
        attachAlertLayoutArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.photoLayout;
        this.currentAttachLayout = chatAttachAlertPhotoLayout2;
        this.selectedId = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout2, LayoutHelper.createFrame(-1, -1.0f));
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.fadeView = chatActivityFadeView;
        chatActivityFadeView.setup(blurredBackgroundDrawableViewFactory3);
        this.fadeView.setFadeTopAlpha(0);
        this.fadeView.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        this.fadeView.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        this.fadeView.setFadeZoneTop(AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(5.0f));
        this.containerView.addView(this.fadeView, LayoutHelper.createFrameMatchParent());
        this.containerView.addView(this.headerView, LayoutHelper.createFrame(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.13
            private final Path path = new Path();
            private final GradientClip clip = new GradientClip();

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                float dp = AndroidUtilities.dp(20.0f);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                this.path.rewind();
                this.path.addRoundRect(rectF4, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * getAlpha());
                canvas.clipPath(this.path);
                canvas.saveLayerAlpha(rectF4, NotificationCenter.didReceiveSmsCode, 31);
                super.dispatchDraw(canvas);
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + AndroidUtilities.dp(6.0f));
                this.clip.draw(canvas, rectF4, 1, 1.0f);
                rectF4.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                this.clip.draw(canvas, rectF4, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
        };
        this.topCommentContainer = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 55));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.containerView.addView(this.selectedMenuItem, LayoutHelper.createFrame(48, 48, 53));
        this.containerView.addView(this.motionItem, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem8 = this.searchItem;
        if (actionBarMenuItem8 != null) {
            this.containerView.addView(actionBarMenuItem8, LayoutHelper.createFrame(48, 48, 53));
        }
        ActionBarMenuItem actionBarMenuItem9 = this.optionsItem;
        if (actionBarMenuItem9 != null) {
            this.headerView.addView(actionBarMenuItem9, LayoutHelper.createFrame(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        }
        this.containerView.addView(textView, LayoutHelper.createFrame(-2, 48, 53));
        this.buttonsRecyclerViewWrapper = new FrameLayout(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.14
            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i9, int i10) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.isPollAttach && chatAttachAlert.pollAllowedLayouts != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), (Integer.bitCount(ChatAttachAlert.this.pollAllowedLayouts) * AndroidUtilities.dp(80.0f)) + AndroidUtilities.dp(36.0f)), TLObject.FLAG_30), i10);
                } else {
                    super.onMeasure(i9, i10);
                }
            }

            @Override // android.view.View
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                ChatAttachAlert.this.currentAttachLayout.onButtonsTranslationYUpdated();
            }
        };
        RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.15
            private final BoolAnimator hasFadeLeft;
            private final BoolAnimator hasFadeRight;
            private boolean mHasFadeLeft;
            private boolean mHasFadeRight;
            private final Paint paintLeft;
            private final Paint paintRight;
            private final Shader shaderLeft;
            private final Shader shaderRight;

            {
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.hasFadeLeft = new BoolAnimator(this, cubicBezierInterpolator2, 320L);
                this.hasFadeRight = new BoolAnimator(this, cubicBezierInterpolator2, 320L);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode);
                this.shaderLeft = linearGradient;
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode);
                this.shaderRight = linearGradient2;
                Paint paint = new Paint(1);
                this.paintLeft = paint;
                Paint paint2 = new Paint(1);
                this.paintRight = paint2;
                paint.setShader(linearGradient);
                PorterDuff.Mode mode2 = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode2));
                paint2.setShader(linearGradient2);
                paint2.setXfermode(new PorterDuffXfermode(mode2));
            }

            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                this.mHasFadeRight = false;
                this.mHasFadeLeft = false;
                super.dispatchDraw(canvas);
                this.hasFadeLeft.setValue(this.mHasFadeLeft, true);
                this.hasFadeRight.setValue(this.mHasFadeRight, true);
            }

            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public boolean drawChild(Canvas canvas, View view, long j) {
                float x = view.getX();
                float width = view.getWidth() + x;
                boolean z5 = true;
                boolean z6 = x < ((float) AndroidUtilities.dp(10.0f));
                boolean z7 = width > ((float) (getMeasuredWidth() - AndroidUtilities.dp(10.0f)));
                if (!z6 && !z7) {
                    z5 = false;
                }
                this.mHasFadeLeft |= z6;
                this.mHasFadeRight |= z7;
                canvas.save();
                if (z5) {
                    canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                if (z6) {
                    float dp = AndroidUtilities.dp(11.0f);
                    canvas.saveLayer(dp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(dp - (AndroidUtilities.dp(8.0f) * (1.0f - this.hasFadeLeft.getFloatValue())), 0.0f);
                    canvas.drawPaint(this.paintLeft);
                    canvas.restore();
                    canvas.restore();
                }
                if (z7) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(measuredWidth + (AndroidUtilities.dp(8.0f) * (1.0f - this.hasFadeRight.getFloatValue())), 0.0f);
                    canvas.drawPaint(this.paintRight);
                    canvas.restore();
                    canvas.restore();
                }
                return drawChild;
            }

            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
            protected void onMeasure(int i9, int i10) {
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight();
                float f = 0.0f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt instanceof AttachButtonBase) {
                        f += ((AttachButtonBase) childAt).glassTabView.measureAttachTabWidth();
                    }
                }
                int floor = (size <= f || childCount <= 0) ? 0 : (int) Math.floor((r1 - f) / childCount);
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 instanceof AttachButtonBase) {
                        ((AttachButtonBase) childAt2).glassTabView.setAdditionalWidth(floor);
                    }
                }
                super.onMeasure(i9, i10);
            }
        };
        this.buttonsRecyclerView = recyclerListView;
        recyclerListView.setClipChildren(true);
        this.buttonsRecyclerView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.buttonsRecyclerView;
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(context);
        this.buttonsAdapter = buttonsAdapter;
        recyclerListView2.setAdapter(buttonsAdapter);
        RecyclerListView recyclerListView3 = this.buttonsRecyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.buttonsLayoutManager = linearLayoutManager;
        recyclerListView3.setLayoutManager(linearLayoutManager);
        this.buttonsRecyclerView.setVerticalScrollBarEnabled(false);
        this.buttonsRecyclerView.setHorizontalScrollBarEnabled(false);
        this.buttonsRecyclerView.setItemAnimator(null);
        this.buttonsRecyclerView.setLayoutAnimation(null);
        this.buttonsRecyclerView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.buttonsRecyclerView.setAdaptiveOverScroll();
        this.iBlur3FactoryLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFrostedLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        blurredBackgroundDrawableViewFactory3.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.bottomFadeView = new View(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.16
            @Override // android.view.View
            protected void onSizeChanged(int i9, int i10, int i11, int i12) {
                super.onSizeChanged(i9, i10, i11, i12);
                ChatAttachAlert.this.bottomFadeDrawable.setBounds(0, (i10 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i9, i10);
            }

            @Override // android.view.View
            public void draw(Canvas canvas) {
                super.draw(canvas);
                ChatAttachAlert.this.bottomFadeDrawable.draw(canvas);
            }
        };
        this.bottomFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory3.create(this.bottomFadeView, (BlurredBackgroundColorProvider) null));
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        this.bottomFadeDrawable.setFadeHeight(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(this.bottomFadeView, LayoutHelper.createFrameMatchParent());
        BlurredBackgroundDrawable create = this.iBlur3FactoryLiquidGlass.create(this.buttonsRecyclerViewWrapper, BlurredBackgroundProviderImpl.mainTabs(resourcesProvider));
        create.setRadius(AndroidUtilities.dp(28.0f));
        create.setPadding(AndroidUtilities.dp(7.0f));
        this.buttonsRecyclerViewWrapper.setBackground(create);
        this.buttonsRecyclerView.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        this.buttonsRecyclerView.setClipToOutline(true);
        this.buttonsRecyclerView.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        this.buttonsRecyclerView.setImportantForAccessibility(1);
        this.buttonsRecyclerViewWrapper.addView(this.buttonsRecyclerView, LayoutHelper.createFrameMatchParent());
        this.containerView.addView(this.buttonsRecyclerViewWrapper, LayoutHelper.createFrame(-1, 70, 81));
        this.buttonsRecyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda15
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i9) {
                ChatAttachAlert.this.lambda$new$14(resourcesProvider, view, i9);
            }
        });
        this.buttonsRecyclerView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda16
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view, int i9) {
                boolean lambda$new$15;
                lambda$new$15 = ChatAttachAlert.this.lambda$new$15(view, i9);
                return lambda$new$15;
            }
        });
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, true);
        this.botMainButtonTextView = animatedTextView;
        animatedTextView.setVisibility(8);
        this.botMainButtonTextView.setAlpha(0.0f);
        this.botMainButtonTextView.setGravity(17);
        this.botMainButtonTextView.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        this.botMainButtonTextView.setPadding(dp, 0, dp, 0);
        this.botMainButtonTextView.setTextSize(AndroidUtilities.dp(14.0f));
        this.botMainButtonTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$16(view);
            }
        });
        this.containerView.addView(this.botMainButtonTextView, LayoutHelper.createFrame(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.botProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        this.botProgressView.setAlpha(0.0f);
        this.botProgressView.setScaleX(0.1f);
        this.botProgressView.setScaleY(0.1f);
        this.botProgressView.setVisibility(8);
        this.containerView.addView(this.botProgressView, LayoutHelper.createFrame(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView2 = new ImageView(context);
        this.moveCaptionButton = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.moveCaptionButton;
        int themedColor2 = getThemedColor(Theme.key_windowBackgroundWhiteGrayText2);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        this.moveCaptionButton.setImageResource(R.drawable.menu_link_above);
        this.moveCaptionButton.setVisibility(8);
        this.moveCaptionButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$17(view);
            }
        });
        this.frameLayout2 = new 17(context);
        FrameLayout frameLayout3 = new FrameLayout(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.18
            private int lastHeight;
            private final Path path = new Path();
            private final GradientClip clip = new GradientClip();

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (ChatAttachAlert.this.captionContainerBg != null) {
                    ChatAttachAlert.this.captionContainerBg.setBounds(0, (int) ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
                    ChatAttachAlert.this.captionContainerBg.draw(canvas);
                }
                float dp2 = AndroidUtilities.dp(20.0f);
                int dp3 = AndroidUtilities.dp(7.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                RectF rectF4 = AndroidUtilities.rectTmp;
                float f = dp3;
                rectF4.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), getHeight() - dp4);
                this.path.rewind();
                this.path.addRoundRect(rectF4, dp2, dp2, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.path);
                canvas.saveLayerAlpha(rectF4, NotificationCenter.didReceiveSmsCode, 31);
                super.dispatchDraw(canvas);
                rectF4.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), dp3 + AndroidUtilities.dp(6.0f));
                this.clip.draw(canvas, rectF4, 1, 1.0f);
                rectF4.set(getPaddingLeft(), (getHeight() - dp4) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp4);
                this.clip.draw(canvas, rectF4, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z5, int i9, int i10, int i11, int i12) {
                int top = this.lastHeight - ChatAttachAlert.this.aiButton.getTop();
                super.onLayout(z5, i9, i10, i11, i12);
                this.lastHeight = getHeight();
                if (ChatAttachAlert.this.aiButton.getVisibility() != 0 || getHeight() - ChatAttachAlert.this.aiButton.getTop() == top) {
                    return;
                }
                ChatAttachAlert.this.aiButton.setTranslationY(((getHeight() - ChatAttachAlert.this.aiButton.getTop()) - top) + ChatAttachAlert.this.aiButton.getTranslationY());
                ChatAttachAlert.this.aiButton.animate().translationY(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        };
        this.captionContainer = frameLayout3;
        this.frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        BlurredBackgroundDrawable create2 = this.iBlur3FactoryFrostedLiquidGlass.create(this.sizeNotifierFrameLayout, BlurredBackgroundProviderImpl.inputFieldDialogActivity(resourcesProvider));
        this.emojiViewChildBg = create2;
        create2.enableInAppKeyboardOptimization();
        this.emojiViewChildBg.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.emojiViewChildBg.setThickness(AndroidUtilities.dp(32.0f));
        this.emojiViewChildBg.setIntensity(0.4f);
        BlurredBackgroundDrawable create3 = this.iBlur3FactoryLiquidGlass.create(this.captionContainer, BlurredBackgroundProviderImpl.inputFieldDialogActivity(resourcesProvider));
        this.captionContainerBg = create3;
        create3.setRadius(AndroidUtilities.dp(22.0f));
        this.captionContainerBg.setPadding(AndroidUtilities.dp(7.0f));
        this.captionContainer.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        this.frameLayout2.setWillNotDraw(false);
        this.frameLayout2.setVisibility(4);
        this.frameLayout2.setAlpha(0.0f);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2, 83));
        this.frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda19
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$new$18;
                lambda$new$18 = ChatAttachAlert.lambda$new$18(view, motionEvent);
                return lambda$new$18;
            }
        });
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.captionLimitView = animatedTextView2;
        animatedTextView2.setAllowCancel(true);
        animatedTextView2.setScaleProperty(0.6f);
        animatedTextView2.setVisibility(8);
        animatedTextView2.setTextSize(AndroidUtilities.dp(15.0f));
        int i9 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView2.setTextColor(getThemedColor(i9));
        animatedTextView2.setTypeface(AndroidUtilities.bold());
        animatedTextView2.setGravity(17);
        this.captionContainer.addView(animatedTextView2, LayoutHelper.createFrame(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.aiButton = imageView4;
        AiButtonDrawable aiButtonDrawable = new AiButtonDrawable(context);
        this.aiButtonIcon = aiButtonDrawable;
        imageView4.setImageDrawable(aiButtonDrawable);
        imageView4.setScaleType(scaleType);
        int i10 = Theme.key_glass_defaultIcon;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), mode));
        int i11 = Theme.key_listSelector;
        imageView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i11), 1, AndroidUtilities.dp(16.0f)));
        this.captionContainer.addView(imageView4, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        int i12 = R.string.AIEditor;
        imageView4.setContentDescription(LocaleController.getString(i12));
        ScaleStateListAnimator.apply(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$21(resourcesProvider, view);
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        19 r7 = new 19(context, this.sizeNotifierFrameLayout, null, 1, true, resourcesProvider);
        this.commentTextView = r7;
        r7.includeNavigationBar = true;
        int i13 = R.string.AddCaption;
        r7.setHint(LocaleController.getString("AddCaption", i13));
        this.commentTextView.onResume();
        this.commentTextView.getEditText().setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        this.commentTextView.getEditText().addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.Components.ChatAttachAlert.20
            private boolean processChange;
            private boolean wasEmpty;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                if (i16 - i15 >= 1) {
                    this.processChange = true;
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.mentionContainer == null) {
                    chatAttachAlert.createMentionsContainer();
                }
                if (ChatAttachAlert.this.mentionContainer.getAdapter() != null) {
                    ChatAttachAlert.this.mentionContainer.setReversed(false);
                    ChatAttachAlert.this.mentionContainer.getAdapter().lambda$searchUsernameOrHashtag$8(charSequence, ChatAttachAlert.this.commentTextView.getEditText().getSelectionStart(), null, false, false);
                    ChatAttachAlert.this.updateCommentTextViewPosition();
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                boolean z5;
                int i14;
                if (this.wasEmpty != TextUtils.isEmpty(editable)) {
                    if (ChatAttachAlert.this.currentAttachLayout != null) {
                        ChatAttachAlert.this.currentAttachLayout.onSelectedItemsCountChanged(ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount());
                    }
                    this.wasEmpty = !this.wasEmpty;
                }
                boolean z6 = false;
                if (this.processChange) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, ChatAttachAlert.this.commentTextView.getEditText().getPaint().getFontMetricsInt(), false);
                    this.processChange = false;
                }
                ChatAttachAlert.this.codepointCount = Character.codePointCount(editable, 0, editable.length());
                ChatAttachAlert.this.animatorCaptionNotEmpty.setValue(ChatAttachAlert.this.codepointCount > 0, true);
                if (ChatAttachAlert.this.currentLimit <= 0 || (i14 = ChatAttachAlert.this.currentLimit - ChatAttachAlert.this.codepointCount) > 100) {
                    ChatAttachAlert.this.captionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.20.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlert.this.captionLimitView.setVisibility(8);
                        }
                    });
                    ChatAttachAlert.this.topCaptionLimitView.setAlpha(0.0f);
                    z5 = true;
                } else {
                    if (i14 < -9999) {
                        i14 = -9999;
                    }
                    long j = i14;
                    ChatAttachAlert.this.captionLimitView.setText(LocaleController.formatNumber(j, ','), ChatAttachAlert.this.captionLimitView.getVisibility() == 0);
                    if (ChatAttachAlert.this.captionLimitView.getVisibility() != 0) {
                        ChatAttachAlert.this.captionLimitView.setVisibility(0);
                        ChatAttachAlert.this.captionLimitView.setAlpha(0.0f);
                        ChatAttachAlert.this.captionLimitView.setScaleX(0.5f);
                        ChatAttachAlert.this.captionLimitView.setScaleY(0.5f);
                    }
                    ChatAttachAlert.this.captionLimitView.animate().setListener(null).cancel();
                    ChatAttachAlert.this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i14 < 0) {
                        ChatAttachAlert.this.captionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_text_RedRegular));
                        z5 = false;
                    } else {
                        ChatAttachAlert.this.captionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                        z5 = true;
                    }
                    ChatAttachAlert.this.topCaptionLimitView.setText(LocaleController.formatNumber(j, ','), false);
                    ChatAttachAlert.this.topCaptionLimitView.setAlpha(1.0f);
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.sendButtonEnabled != z5) {
                    chatAttachAlert.sendButtonEnabled = z5;
                    chatAttachAlert.writeButton.invalidate();
                }
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                if (!chatAttachAlert2.captionAbove) {
                    if (chatAttachAlert2.commentTextView.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ChatAttachAlert.this.commentTextView.getText().toString().trim())) {
                        z6 = true;
                    }
                    chatAttachAlert2.showAiButton(z6);
                }
                ChatAttachAlert.this.checkIsEphemeralMessage(true);
            }
        });
        this.captionContainer.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        this.captionContainer.setClipChildren(false);
        this.frameLayout2.setClipChildren(false);
        this.commentTextView.setClipChildren(false);
        this.topCommentContainer.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        this.topCommentContainer.setWillNotDraw(false);
        EditTextEmoji editTextEmoji = new EditTextEmoji(context, this.sizeNotifierFrameLayout, null, 1, true, resourcesProvider) { // from class: org.telegram.ui.Components.ChatAttachAlert.21
            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (!ChatAttachAlert.this.enterCommentEventSent) {
                    if (motionEvent.getX() > ChatAttachAlert.this.topCommentTextView.getEditText().getLeft() && motionEvent.getX() < ChatAttachAlert.this.topCommentTextView.getEditText().getRight() && motionEvent.getY() > ChatAttachAlert.this.topCommentTextView.getEditText().getTop() && motionEvent.getY() < ChatAttachAlert.this.topCommentTextView.getEditText().getBottom()) {
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        chatAttachAlert.makeFocusable(chatAttachAlert.topCommentTextView.getEditText(), true);
                    } else {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.makeFocusable(chatAttachAlert2.topCommentTextView.getEditText(), false);
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override // org.telegram.ui.Components.EditTextEmoji
            protected void onLineCountChanged(int i14, int i15) {
                super.onLineCountChanged(i14, i15);
                ChatAttachAlert.this.updatedTopCaptionHeight();
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.captionAbove) {
                    chatAttachAlert.showAiButton(i15 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
                }
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z5, int i14, int i15, int i16, int i17) {
                super.onLayout(z5, i14, i15, i16, i17);
                ChatAttachAlert.this.updatedTopCaptionHeight();
            }

            @Override // org.telegram.ui.Components.EditTextEmoji
            protected void extendActionMode(ActionMode actionMode, Menu menu) {
                BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                if (baseFragment2 instanceof ChatActivity) {
                    ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment2).getCurrentEncryptedChat(), true, true);
                }
                super.extendActionMode(actionMode, menu);
            }

            @Override // org.telegram.ui.Components.EditTextEmoji
            protected void createEmojiView() {
                super.createEmojiView();
                EmojiView emojiView = getEmojiView();
                if (emojiView != null) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
            }
        };
        this.topCommentTextView = editTextEmoji;
        editTextEmoji.includeNavigationBar = true;
        editTextEmoji.getEditText().addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.Components.ChatAttachAlert.22
            private boolean processChange;
            private boolean wasEmpty;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                if (i16 - i15 >= 1) {
                    this.processChange = true;
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.mentionContainer == null) {
                    chatAttachAlert.createMentionsContainer();
                }
                if (ChatAttachAlert.this.mentionContainer.getAdapter() != null) {
                    ChatAttachAlert.this.mentionContainer.setReversed(true);
                    ChatAttachAlert.this.mentionContainer.getAdapter().lambda$searchUsernameOrHashtag$8(charSequence, ChatAttachAlert.this.topCommentTextView.getEditText().getSelectionStart(), null, false, false);
                    ChatAttachAlert.this.updateCommentTextViewPosition();
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                boolean z5;
                int i14;
                if (this.wasEmpty != TextUtils.isEmpty(editable)) {
                    if (ChatAttachAlert.this.currentAttachLayout != null) {
                        ChatAttachAlert.this.currentAttachLayout.onSelectedItemsCountChanged(ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount());
                    }
                    this.wasEmpty = !this.wasEmpty;
                }
                boolean z6 = false;
                if (this.processChange) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, ChatAttachAlert.this.topCommentTextView.getEditText().getPaint().getFontMetricsInt(), false);
                    this.processChange = false;
                }
                ChatAttachAlert.this.codepointCount = Character.codePointCount(editable, 0, editable.length());
                ChatAttachAlert.this.animatorCaptionNotEmpty.setValue(ChatAttachAlert.this.codepointCount > 0, true);
                if (ChatAttachAlert.this.currentLimit <= 0 || (i14 = ChatAttachAlert.this.currentLimit - ChatAttachAlert.this.codepointCount) > 100) {
                    ChatAttachAlert.this.topCaptionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.22.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlert.this.topCaptionLimitView.setVisibility(8);
                        }
                    });
                    ChatAttachAlert.this.captionLimitView.setAlpha(0.0f);
                    z5 = true;
                } else {
                    if (i14 < -9999) {
                        i14 = -9999;
                    }
                    long j = i14;
                    ChatAttachAlert.this.topCaptionLimitView.setText(LocaleController.formatNumber(j, ','), ChatAttachAlert.this.topCaptionLimitView.getVisibility() == 0);
                    if (ChatAttachAlert.this.topCaptionLimitView.getVisibility() != 0) {
                        ChatAttachAlert.this.topCaptionLimitView.setVisibility(0);
                        ChatAttachAlert.this.topCaptionLimitView.setAlpha(0.0f);
                        ChatAttachAlert.this.topCaptionLimitView.setScaleX(0.5f);
                        ChatAttachAlert.this.topCaptionLimitView.setScaleY(0.5f);
                    }
                    ChatAttachAlert.this.topCaptionLimitView.animate().setListener(null).cancel();
                    ChatAttachAlert.this.topCaptionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i14 < 0) {
                        ChatAttachAlert.this.topCaptionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_text_RedRegular));
                        z5 = false;
                    } else {
                        ChatAttachAlert.this.topCaptionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                        z5 = true;
                    }
                    ChatAttachAlert.this.captionLimitView.setText(LocaleController.formatNumber(j, ','), false);
                    ChatAttachAlert.this.captionLimitView.setAlpha(1.0f);
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.sendButtonEnabled != z5) {
                    chatAttachAlert.sendButtonEnabled = z5;
                    chatAttachAlert.writeButton.invalidate();
                }
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                if (!chatAttachAlert2.captionLimitBulletinShown && !MessagesController.getInstance(chatAttachAlert2.currentAccount).premiumFeaturesBlocked() && !UserConfig.getInstance(ChatAttachAlert.this.currentAccount).isPremium() && ChatAttachAlert.this.codepointCount > MessagesController.getInstance(ChatAttachAlert.this.currentAccount).captionLengthLimitDefault && ChatAttachAlert.this.codepointCount < MessagesController.getInstance(ChatAttachAlert.this.currentAccount).captionLengthLimitPremium) {
                    ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                    chatAttachAlert3.captionLimitBulletinShown = true;
                    chatAttachAlert3.showCaptionLimitBulletin(baseFragment);
                }
                ChatAttachAlert chatAttachAlert4 = ChatAttachAlert.this;
                if (chatAttachAlert4.captionAbove) {
                    if (chatAttachAlert4.topCommentTextView.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ChatAttachAlert.this.topCommentTextView.getText().toString().trim())) {
                        z6 = true;
                    }
                    chatAttachAlert4.showAiButton(z6);
                }
                ChatAttachAlert.this.checkIsEphemeralMessage(true);
            }
        });
        this.topCommentTextView.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        this.topCommentTextView.getEditText().setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        this.topCommentTextView.getEditText().setTextSize(1, 17.0f);
        this.topCommentTextView.getEmojiButton().setLayoutParams(LayoutHelper.createFrame(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.topCommentTextView.setHint(LocaleController.getString("AddCaption", i13));
        this.topCommentContainer.addView(this.topCommentTextView, LayoutHelper.createFrame(-1, -2, 119));
        this.topCommentContainer.setAlpha(0.0f);
        this.topCommentContainer.setVisibility(8);
        this.commentTextView.addView(this.moveCaptionButton, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        BlurredBackgroundDrawable create4 = this.iBlur3FactoryLiquidGlass.create(this.topCommentContainer, BlurredBackgroundProviderImpl.inputFieldDialogActivity(resourcesProvider));
        create4.setRadius(AndroidUtilities.dp(22.0f));
        create4.setPadding(AndroidUtilities.dp(7.0f));
        this.topCommentContainer.setBackground(create4);
        this.topCommentContainer.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        AnimatedTextView animatedTextView3 = new AnimatedTextView(context);
        this.topCaptionLimitView = animatedTextView3;
        animatedTextView3.setScaleProperty(0.6f);
        animatedTextView3.setVisibility(8);
        animatedTextView3.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView3.setTextColor(getThemedColor(i9));
        animatedTextView3.setTypeface(AndroidUtilities.bold());
        animatedTextView3.setGravity(17);
        animatedTextView3.setAllowCancel(true);
        this.topCommentContainer.addView(animatedTextView3, LayoutHelper.createFrame(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        this.topCommentMoveButton = imageView5;
        imageView5.setScaleType(scaleType);
        this.topCommentMoveButton.setImageResource(R.drawable.menu_link_below);
        this.topCommentMoveButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_messagePanelIcons), mode2));
        this.topCommentTextView.addView(this.topCommentMoveButton, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        this.topCommentMoveButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$22(view);
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.topAiButton = imageView6;
        AiButtonDrawable aiButtonDrawable2 = new AiButtonDrawable(context);
        this.topAiButtonIcon = aiButtonDrawable2;
        imageView6.setImageDrawable(aiButtonDrawable2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), mode));
        imageView6.setBackground(Theme.createSelectorDrawable(getThemedColor(i11), 1, AndroidUtilities.dp(16.0f)));
        this.topCommentContainer.addView(imageView6, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(i12));
        ScaleStateListAnimator.apply(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$25(resourcesProvider, view);
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        FrameLayout frameLayout4 = new FrameLayout(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.23
            @Override // android.view.View
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ChatAttachAlert.this.photoLayout.getSelectedItemsCount(), new Object[0]));
                } else if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.documentLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", ChatAttachAlert.this.documentLayout.getSelectedItemsCount(), new Object[0]));
                } else if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.audioLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", ChatAttachAlert.this.audioLayout.getSelectedItemsCount(), new Object[0]));
                }
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        };
        this.writeButtonContainer = frameLayout4;
        frameLayout4.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        this.writeButtonContainer.setClipChildren(false);
        this.writeButtonContainer.setClipToPadding(false);
        this.containerView.addView(this.writeButtonContainer, LayoutHelper.createFrame(110, 50, 85));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, R.drawable.send_plane_24, resourcesProvider) { // from class: org.telegram.ui.Components.ChatAttachAlert.24
            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean isOpen() {
                return true;
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean shouldDrawBackground() {
                return true;
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean isInScheduleMode() {
                return super.isInScheduleMode();
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean isInactive() {
                return !ChatAttachAlert.this.sendButtonEnabled;
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public int getFillColor() {
                return ChatAttachAlert.this.getThemedColor(Theme.key_dialogFloatingButton);
            }
        };
        this.writeButton = sendButton;
        sendButton.setImportantForAccessibility(2);
        this.writeButtonContainer.addView(this.writeButton, LayoutHelper.createFrame(-1, -1, 119));
        this.writeButton.setTranslationX(this.backgroundPaddingLeft);
        this.writeButton.setCircleSize(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(38.0f));
        this.writeButton.setCirclePadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
        ChatActivityEnterView.SendButton sendButton2 = this.writeButton;
        sendButton2.newCounterPos = true;
        sendButton2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$26(view);
            }
        });
        this.writeButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda24
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$new$37;
                lambda$new$37 = ChatAttachAlert.this.lambda$new$37(context, resourcesProvider, baseFragment, view);
                return lambda$new$37;
            }
        });
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        View view = new View(context) { // from class: org.telegram.ui.Components.ChatAttachAlert.26
            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                String format = String.format("%d", Integer.valueOf(Math.max(1, ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(ChatAttachAlert.this.textPaint.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                ChatAttachAlert.this.textPaint.setColor(ColorUtils.setAlphaComponent(ChatAttachAlert.this.getThemedColor(Theme.key_dialogRoundCheckBoxCheck), (int) (Color.alpha(r4) * ((ChatAttachAlert.this.sendButtonEnabledProgress * 0.42d) + 0.58d))));
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_dialogBackground));
                int i14 = max / 2;
                ChatAttachAlert.this.rect.set(measuredWidth - i14, 0.0f, i14 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ChatAttachAlert.this.paint);
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_chat_attachCheckBoxBackground));
                ChatAttachAlert.this.rect.set(r5 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), r2 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ChatAttachAlert.this.paint);
                canvas.drawText(format, measuredWidth - (r1 / 2), AndroidUtilities.dp(16.2f), ChatAttachAlert.this.textPaint);
            }
        };
        this.selectedCountView = view;
        view.setAlpha(0.0f);
        this.selectedCountView.setScaleX(0.2f);
        this.selectedCountView.setScaleY(0.2f);
        if (z) {
            checkColors();
            this.navBarColorKey = -1;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = this.photoLayout;
        if (chatAttachAlertPhotoLayout3 != null) {
            chatAttachAlertPhotoLayout3.gridView.getFastScroll().applyBlurDrawables(this.iBlur3FactoryLiquidGlass, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
        }
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        this.containerView.addView(passcodeView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setupGlass(this.iBlur3FactoryLiquidGlass, BlurredBackgroundProviderImpl.attachMenuActionBar(resourcesProvider));
        replaceAnimator.replace(1L, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Canvas canvas, RectF rectF) {
        float alpha;
        AttachAlertLayout attachAlertLayout;
        int i = 0;
        while (i < 2) {
            AttachAlertLayout attachAlertLayout2 = i == 0 ? this.currentAttachLayout : this.nextAttachLayout;
            if (attachAlertLayout2 != null && attachAlertLayout2.iBlur3Capture != null && attachAlertLayout2.getVisibility() == 0) {
                if (i == 0 && (attachAlertLayout = this.nextAttachLayout) != null && attachAlertLayout.getVisibility() == 0) {
                    alpha = attachAlertLayout2.getAlpha() * (1.0f - this.nextAttachLayout.getAlpha());
                } else {
                    alpha = attachAlertLayout2.getAlpha();
                }
                Blur3Utils.captureRelativeParent(attachAlertLayout2.iBlur3Capture, canvas, rectF, attachAlertLayout2.iBlur3CaptureView, getContainerView(), (int) (alpha * 255.0f));
            }
            i++;
        }
    }

    class 5 extends SizeNotifierFrameLayout {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        private Bulletin.Delegate bulletinDelegate;
        private boolean ignoreLayout;
        private float initialTranslationY;
        private int lastNotifyWidth;
        private RectF rect;

        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
        public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        }

        5(Context context) {
            super(context);
            this.bulletinDelegate = new Bulletin.Delegate() { // from class: org.telegram.ui.Components.ChatAttachAlert.5.1
                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ boolean allowLayoutChanges() {
                    return Bulletin.Delegate.-CC.$default$allowLayoutChanges(this);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.-CC.$default$bottomOffsetAnimated(this);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ boolean clipWithGradient(int i) {
                    return Bulletin.Delegate.-CC.$default$clipWithGradient(this, i);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ int getTopOffset(int i) {
                    return Bulletin.Delegate.-CC.$default$getTopOffset(this, i);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.-CC.$default$onBottomOffsetChange(this, f);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.-CC.$default$onHide(this, bulletin);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.-CC.$default$onShow(this, bulletin);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public int getBottomOffset(int i) {
                    return (5.this.getHeight() - ChatAttachAlert.this.frameLayout2.getTop()) + AndroidUtilities.dp(52.0f);
                }
            };
            this.rect = new RectF();
            this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) { // from class: org.telegram.ui.Components.ChatAttachAlert.5.2
                /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                protected void onTransitionStart(boolean z, int i) {
                    super.onTransitionStart(z, i);
                    if (ChatAttachAlert.this.previousScrollOffsetY > 0) {
                        int i2 = ChatAttachAlert.this.previousScrollOffsetY;
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        if (i2 != chatAttachAlert.scrollOffsetY[0] && z) {
                            chatAttachAlert.fromScrollY = chatAttachAlert.previousScrollOffsetY;
                            ChatAttachAlert.this.toScrollY = r0.scrollOffsetY[0];
                            5.this.invalidate();
                            if ((ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertBotWebViewLayout) && !ChatAttachAlert.this.botButtonWasVisible) {
                                if (!z) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(8);
                                } else {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(0);
                                }
                            }
                            ChatAttachAlert.this.currentAttachLayout.onPanTransitionStart(z, i);
                        }
                    }
                    ChatAttachAlert.this.fromScrollY = -1.0f;
                    5.this.invalidate();
                    if (ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertBotWebViewLayout) {
                        if (!z) {
                        }
                    }
                    ChatAttachAlert.this.currentAttachLayout.onPanTransitionStart(z, i);
                }

                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                protected void onTransitionEnd() {
                    super.onTransitionEnd();
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, false, 0);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.previousScrollOffsetY = chatAttachAlert2.scrollOffsetY[0];
                    ChatAttachAlert.this.currentAttachLayout.onPanTransitionEnd();
                    if (!(ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertBotWebViewLayout) || ChatAttachAlert.this.botButtonWasVisible) {
                        return;
                    }
                    int dp = ((BottomSheet) ChatAttachAlert.this).keyboardVisible ? AndroidUtilities.dp(84.0f) : 0;
                    for (int i = 0; i < ChatAttachAlert.this.botAttachLayouts.size(); i++) {
                        ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i)).setMeasureOffsetY(dp);
                    }
                }

                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                protected void onPanTranslationUpdate(float f, float f2, boolean z) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.currentPanTranslationY = f;
                    if (chatAttachAlert.fromScrollY > 0.0f) {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.currentPanTranslationY += (chatAttachAlert2.fromScrollY - ChatAttachAlert.this.toScrollY) * (1.0f - f2);
                    }
                    ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                    chatAttachAlert3.actionBar.setTranslationY(chatAttachAlert3.currentPanTranslationY);
                    ChatAttachAlert chatAttachAlert4 = ChatAttachAlert.this;
                    chatAttachAlert4.selectedMenuItem.setTranslationY(chatAttachAlert4.currentPanTranslationY);
                    ChatAttachAlert chatAttachAlert5 = ChatAttachAlert.this;
                    ActionBarMenuItem actionBarMenuItem = chatAttachAlert5.searchItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setTranslationY(chatAttachAlert5.currentPanTranslationY);
                    }
                    ChatAttachAlert chatAttachAlert6 = ChatAttachAlert.this;
                    ActionBarMenuItem actionBarMenuItem2 = chatAttachAlert6.motionItem;
                    if (actionBarMenuItem2 != null) {
                        actionBarMenuItem2.setTranslationY(chatAttachAlert6.selectedMenuItem.getTranslationY());
                    }
                    if (ChatAttachAlert.this.motionHint != null) {
                        ChatAttachAlert.this.motionHint.setTranslationY(ChatAttachAlert.this.selectedMenuItem.getTranslationY());
                    }
                    ChatAttachAlert chatAttachAlert7 = ChatAttachAlert.this;
                    chatAttachAlert7.doneItem.setTranslationY(chatAttachAlert7.currentPanTranslationY);
                    ChatAttachAlert.this.updateSelectedPosition(0);
                    ChatAttachAlert chatAttachAlert8 = ChatAttachAlert.this;
                    chatAttachAlert8.setCurrentPanTranslationY(chatAttachAlert8.currentPanTranslationY);
                    5.this.invalidate();
                    ChatAttachAlert.this.frameLayout2.invalidate();
                    ChatAttachAlert.this.updateCommentTextViewPosition();
                    if (ChatAttachAlert.this.currentAttachLayout != null) {
                        ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                    }
                }

                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                protected boolean heightAnimationEnabled() {
                    if (ChatAttachAlert.this.isDismissed() || !ChatAttachAlert.this.openTransitionFinished) {
                        return false;
                    }
                    return !(ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout || ChatAttachAlert.this.getCommentView().isPopupVisible()) || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout && !ChatAttachAlert.this.pollLayout.isPopupVisible()) || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout && !ChatAttachAlert.this.todoLayout.isPopupVisible());
                }
            };
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() == 0 && ChatAttachAlert.this.scrollOffsetY[0] != 0 && motionEvent.getY() < getCurrentTop() && ChatAttachAlert.this.actionBar.getAlpha() == 0.0f) {
                ChatAttachAlert.this.onDismissWithTouchOutside();
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            return !ChatAttachAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size;
            if (getLayoutParams().height > 0) {
                size = getLayoutParams().height;
            } else {
                size = View.MeasureSpec.getSize(i2);
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!chatAttachAlert.inBubbleMode) {
                this.ignoreLayout = true;
                setPadding(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, 0, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, 0);
                this.ignoreLayout = false;
            }
            int size2 = View.MeasureSpec.getSize(i) - (((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft * 2);
            if (AndroidUtilities.isTablet()) {
                ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(0);
                } else {
                    ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
                }
            }
            ((FrameLayout.LayoutParams) ChatAttachAlert.this.doneItem.getLayoutParams()).height = ActionBar.getCurrentActionBarHeight();
            this.ignoreLayout = true;
            int min = (int) (size2 / Math.min(4.5f, ChatAttachAlert.this.buttonsAdapter.getItemCount()));
            if (ChatAttachAlert.this.attachItemSize != min) {
                ChatAttachAlert.this.attachItemSize = min;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$5$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatAttachAlert.5.this.lambda$onMeasure$0();
                    }
                });
            }
            this.ignoreLayout = false;
            onMeasureInternal(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMeasure$0() {
            ChatAttachAlert.this.buttonsAdapter.notifyDataSetChanged();
        }

        private void onMeasureInternal(int i, int i2) {
            EditTextEmoji editTextEmoji;
            int emojiPadding;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            int i3 = size - (((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft * 2);
            if (!ChatAttachAlert.this.commentTextView.isWaitingForKeyboardOpen() && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.commentTextView.isPopupShowing() && !ChatAttachAlert.this.commentTextView.isAnimatePopupClosing()) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.commentTextView.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (!ChatAttachAlert.this.topCommentTextView.isWaitingForKeyboardOpen() && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.topCommentTextView.isPopupShowing() && !ChatAttachAlert.this.topCommentTextView.isAnimatePopupClosing()) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.topCommentTextView.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (ChatAttachAlert.this.pollLayout != null && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.pollLayout.isWaitingForKeyboardOpen() && !ChatAttachAlert.this.pollLayout.isPopupShowing() && !ChatAttachAlert.this.pollLayout.isAnimatePopupClosing() && !ChatAttachAlert.this.pollLayout.isEmojiSearchOpened) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.pollLayout.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (ChatAttachAlert.this.todoLayout != null && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.todoLayout.isWaitingForKeyboardOpen() && !ChatAttachAlert.this.todoLayout.isPopupShowing() && !ChatAttachAlert.this.todoLayout.isAnimatePopupClosing() && !ChatAttachAlert.this.todoLayout.isEmojiSearchOpened) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.todoLayout.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (AndroidUtilities.dp(20.0f) >= 0) {
                if (((BottomSheet) ChatAttachAlert.this).keyboardVisible) {
                    if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout && ChatAttachAlert.this.pollLayout.emojiView != null && ChatAttachAlert.this.pollLayout.isEmojiSearchOpened) {
                        emojiPadding = AndroidUtilities.dp(120.0f);
                    } else {
                        emojiPadding = (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout && ChatAttachAlert.this.todoLayout.emojiView != null && ChatAttachAlert.this.todoLayout.isEmojiSearchOpened) ? AndroidUtilities.dp(120.0f) : 0;
                    }
                } else {
                    emojiPadding = ChatAttachAlert.this.getEmojiPadding();
                }
                int rootBottomInset = getRootBottomInset(WindowInsetsCompat.Type.ime());
                Math.max(getRootBottomInset(WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.systemBars()), emojiPadding);
                int max = Math.max(rootBottomInset > 0 ? 0 : AndroidUtilities.navigationBarHeight, emojiPadding);
                this.ignoreLayout = true;
                if (ChatAttachAlert.this.currentAttachLayout.occupyNavigationBar) {
                    ChatAttachAlert.this.currentAttachLayout.listPaddingBottom = AndroidUtilities.dp(62.0f) + max;
                    ChatAttachAlert.this.currentAttachLayout.onPreMeasure(i3, size2);
                } else {
                    ChatAttachAlert.this.currentAttachLayout.listPaddingBottom = AndroidUtilities.navigationBarHeight;
                    ChatAttachAlert.this.currentAttachLayout.onPreMeasure(i3, size2 - emojiPadding);
                }
                if (ChatAttachAlert.this.nextAttachLayout != null) {
                    if (ChatAttachAlert.this.nextAttachLayout.occupyNavigationBar) {
                        ChatAttachAlert.this.nextAttachLayout.listPaddingBottom = max + AndroidUtilities.dp(62.0f);
                        ChatAttachAlert.this.nextAttachLayout.onPreMeasure(i3, size2);
                    } else {
                        ChatAttachAlert.this.nextAttachLayout.listPaddingBottom = AndroidUtilities.navigationBarHeight;
                        ChatAttachAlert.this.nextAttachLayout.onPreMeasure(i3, size2 - emojiPadding);
                    }
                }
                this.ignoreLayout = false;
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8) {
                    if (childAt == ChatAttachAlert.this.fadeView) {
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                    } else {
                        int i5 = AndroidUtilities.statusBarHeight;
                        int i6 = AndroidUtilities.navigationBarHeight;
                        if (childAt instanceof AttachAlertLayout) {
                            AttachAlertLayout attachAlertLayout = (AttachAlertLayout) childAt;
                            if (attachAlertLayout.occupyStatusBar) {
                                i5 = 0;
                            }
                            if (attachAlertLayout.occupyNavigationBar) {
                                i6 = 0;
                            }
                        }
                        EditTextEmoji editTextEmoji2 = ChatAttachAlert.this.commentTextView;
                        if ((editTextEmoji2 != null && editTextEmoji2.isPopupView(childAt)) || (((editTextEmoji = ChatAttachAlert.this.topCommentTextView) != null && editTextEmoji.isPopupView(childAt)) || ((ChatAttachAlert.this.pollLayout != null && childAt == ChatAttachAlert.this.pollLayout.emojiView) || (ChatAttachAlert.this.todoLayout != null && childAt == ChatAttachAlert.this.todoLayout.emojiView)))) {
                            if (ChatAttachAlert.this.inBubbleMode) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size2, TLObject.FLAG_30));
                            } else if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (size2 - AndroidUtilities.statusBarHeight) + getPaddingTop()), TLObject.FLAG_30));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) + getPaddingTop(), TLObject.FLAG_30));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            }
                        } else {
                            measureChildWithMargins(childAt, i, 0, i2, i5 + i6);
                        }
                    }
                }
            }
        }

        private int getRootKeyboardHeight() {
            return getRootBottomInset(WindowInsetsCompat.Type.ime());
        }

        private int getRootBottomInset(int i) {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this);
            if (rootWindowInsets != null) {
                return rootWindowInsets.getInsets(i).bottom;
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01a4  */
        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            ChatAttachAlert chatAttachAlert;
            EditTextEmoji editTextEmoji;
            EditTextEmoji editTextEmoji2;
            ChatAttachAlert chatAttachAlert2;
            int i12;
            int max;
            int measuredHeight;
            int measuredHeight2;
            int emojiPadding;
            int i13 = i3 - i;
            if (this.lastNotifyWidth != i13) {
                this.lastNotifyWidth = i13;
                if (ChatAttachAlert.this.messageSendPreview != null && ChatAttachAlert.this.messageSendPreview.isShowing()) {
                    ChatAttachAlert.this.messageSendPreview.dismiss();
                }
            }
            int childCount = getChildCount();
            if (Build.VERSION.SDK_INT >= 29) {
                ChatAttachAlert.this.exclustionRect.set(i, i2, i3, i4);
                setSystemGestureExclusionRects(ChatAttachAlert.this.exclusionRects);
            }
            int rootKeyboardHeight = getRootKeyboardHeight();
            int paddingBottom = getPaddingBottom();
            if (!((BottomSheet) ChatAttachAlert.this).keyboardVisible) {
                if (ChatAttachAlert.this.pollLayout == null || ChatAttachAlert.this.currentAttachLayout != ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.pollLayout.emojiView == null) {
                    if (ChatAttachAlert.this.todoLayout != null && ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout && ChatAttachAlert.this.todoLayout.emojiView != null) {
                        if (rootKeyboardHeight <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            emojiPadding = ChatAttachAlert.this.todoLayout.getEmojiPadding();
                            if (emojiPadding > 0) {
                            }
                        }
                        emojiPadding = 0;
                        if (emojiPadding > 0) {
                        }
                    } else {
                        if (rootKeyboardHeight <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            emojiPadding = ChatAttachAlert.this.getCommentView().getEmojiPadding();
                            if (emojiPadding > 0) {
                                paddingBottom += emojiPadding;
                            }
                        }
                        emojiPadding = 0;
                        if (emojiPadding > 0) {
                        }
                    }
                } else {
                    if (rootKeyboardHeight <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = ChatAttachAlert.this.pollLayout.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            }
            setBottomClip(paddingBottom);
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() == 8) {
                    i5 = paddingBottom;
                } else {
                    int i15 = AndroidUtilities.statusBarHeight;
                    int max2 = rootKeyboardHeight == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                    if (childAt instanceof AttachAlertLayout) {
                        AttachAlertLayout attachAlertLayout = (AttachAlertLayout) childAt;
                        if (attachAlertLayout.occupyStatusBar) {
                            i15 = 0;
                        }
                        if (attachAlertLayout.occupyNavigationBar) {
                            max2 = 0;
                        }
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    int i16 = layoutParams.gravity;
                    if (i16 == -1) {
                        i16 = 51;
                    }
                    int i17 = i16 & 112;
                    int i18 = i16 & 7;
                    i5 = paddingBottom;
                    if (i18 == 1) {
                        i6 = ((i13 - measuredWidth) / 2) + layoutParams.leftMargin;
                        i7 = layoutParams.rightMargin;
                    } else if (i18 == 5) {
                        i6 = ((i13 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                        i7 = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft;
                    } else {
                        i8 = layoutParams.leftMargin + getPaddingLeft();
                        if (i17 != 16) {
                            i9 = ((((i4 - max2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i10 = layoutParams.bottomMargin;
                        } else {
                            if (i17 == 48) {
                                i11 = layoutParams.topMargin + i15;
                            } else if (i17 == 80) {
                                i9 = ((i4 - max2) - i2) - measuredHeight3;
                                i10 = layoutParams.bottomMargin;
                            } else {
                                i11 = layoutParams.topMargin;
                            }
                            chatAttachAlert = ChatAttachAlert.this;
                            if (childAt != chatAttachAlert.actionBar || childAt == chatAttachAlert.fadeView) {
                                i11 = 0;
                            }
                            editTextEmoji = ChatAttachAlert.this.commentTextView;
                            if ((editTextEmoji == null && editTextEmoji.isPopupView(childAt)) || (((editTextEmoji2 = ChatAttachAlert.this.topCommentTextView) != null && editTextEmoji2.isPopupView(childAt)) || ((ChatAttachAlert.this.pollLayout != null && childAt == ChatAttachAlert.this.pollLayout.emojiView) || (ChatAttachAlert.this.todoLayout != null && childAt == ChatAttachAlert.this.todoLayout.emojiView)))) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + rootKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                i11 = measuredHeight - measuredHeight2;
                            } else {
                                chatAttachAlert2 = ChatAttachAlert.this;
                                if (childAt != chatAttachAlert2.mentionContainer) {
                                    if (childAt == chatAttachAlert2.bottomFadeView) {
                                        i12 = i11 + AndroidUtilities.navigationBarHeight;
                                        max = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                        i11 = i12 + max;
                                    }
                                } else if (chatAttachAlert2.captionAbove) {
                                    i12 = AndroidUtilities.statusBarHeight;
                                    max = ActionBar.getCurrentActionBarHeight();
                                    i11 = i12 + max;
                                }
                            }
                            childAt.layout(i8, i11, measuredWidth + i8, measuredHeight3 + i11);
                        }
                        i11 = i9 - i10;
                        chatAttachAlert = ChatAttachAlert.this;
                        if (childAt != chatAttachAlert.actionBar) {
                        }
                        i11 = 0;
                        editTextEmoji = ChatAttachAlert.this.commentTextView;
                        if (editTextEmoji == null) {
                        }
                        chatAttachAlert2 = ChatAttachAlert.this;
                        if (childAt != chatAttachAlert2.mentionContainer) {
                        }
                    }
                    i8 = i6 - i7;
                    if (i17 != 16) {
                    }
                    i11 = i9 - i10;
                    chatAttachAlert = ChatAttachAlert.this;
                    if (childAt != chatAttachAlert.actionBar) {
                    }
                    i11 = 0;
                    editTextEmoji = ChatAttachAlert.this.commentTextView;
                    if (editTextEmoji == null) {
                    }
                    chatAttachAlert2 = ChatAttachAlert.this;
                    if (childAt != chatAttachAlert2.mentionContainer) {
                    }
                }
                i14++;
                paddingBottom = i5;
            }
            notifyHeightChanged();
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
            chatAttachAlert3.updateLayout(chatAttachAlert3.currentAttachLayout, false, 0);
            ChatAttachAlert chatAttachAlert4 = ChatAttachAlert.this;
            chatAttachAlert4.updateLayout(chatAttachAlert4.nextAttachLayout, false, 0);
            ChatAttachAlert chatAttachAlert5 = ChatAttachAlert.this;
            if (chatAttachAlert5.captionAbove) {
                chatAttachAlert5.updateCommentTextViewPosition();
            }
            if (ChatAttachAlert.this.photoLayout == null || ChatAttachAlert.this.photoLayout.gridView == null || ChatAttachAlert.this.photoLayout.gridView.getFastScroll() == null) {
                return;
            }
            ChatAttachAlert.this.photoLayout.gridView.getFastScroll().topOffset = ActionBar.getCurrentActionBarHeight() + ChatAttachAlert.this.photoLayout.listAdditionalH + (ChatAttachAlert.this.captionAbove ? (int) (r4.topCommentContainer.getMeasuredHeight() * ChatAttachAlert.this.topCommentContainer.getAlpha()) : 0);
            ChatAttachAlert.this.photoLayout.gridView.getFastScroll().invalidate();
        }

        @Override // android.view.View, android.view.ViewParent
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        private float getY(View view) {
            int i;
            int dp;
            int dp2;
            float f;
            if (!(view instanceof AttachAlertLayout)) {
                return 0.0f;
            }
            AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
            int needsActionBar = attachAlertLayout.needsActionBar();
            int dp3 = AndroidUtilities.dp(13.0f);
            FrameLayout frameLayout = ChatAttachAlert.this.headerView;
            int alpha = dp3 + ((int) ((frameLayout != null ? frameLayout.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f)));
            FrameLayout frameLayout2 = ChatAttachAlert.this.topCommentContainer;
            int alpha2 = alpha + ((int) (frameLayout2 != null ? frameLayout2.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f));
            int scrollOffsetY = (ChatAttachAlert.this.getScrollOffsetY(0) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha2;
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
            }
            int dp4 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
            if (needsActionBar == 0) {
                i = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
            } else {
                i = ActionBar.getCurrentActionBarHeight();
            }
            if (needsActionBar != 2 && scrollOffsetY + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop < i) {
                float f2 = alpha2;
                if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                    if (attachAlertLayout != ChatAttachAlert.this.pollLayout) {
                        if (attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                            dp2 = AndroidUtilities.dp(3.0f);
                        } else {
                            dp = AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        dp2 = AndroidUtilities.dp(3.0f);
                    }
                    f = f2 - dp2;
                    dp4 -= (int) (((i - f) + AndroidUtilities.statusBarHeight) * ChatAttachAlert.this.actionBar.getAlpha());
                } else {
                    dp = AndroidUtilities.dp(11.0f);
                }
                f = f2 + dp;
                dp4 -= (int) (((i - f) + AndroidUtilities.statusBarHeight) * ChatAttachAlert.this.actionBar.getAlpha());
            }
            if (!ChatAttachAlert.this.inBubbleMode) {
                dp4 += AndroidUtilities.statusBarHeight;
            }
            return dp4;
        }

        private void drawChildBackground(Canvas canvas, View view) {
            int i;
            int dp;
            int dp2;
            float f;
            float f2;
            int themedColor;
            float alpha;
            if (view instanceof AttachAlertLayout) {
                canvas.save();
                canvas.translate(0.0f, ChatAttachAlert.this.currentPanTranslationY);
                int alpha2 = (int) (view.getAlpha() * 255.0f);
                AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
                int needsActionBar = attachAlertLayout.needsActionBar();
                int dp3 = AndroidUtilities.dp(13.0f);
                FrameLayout frameLayout = ChatAttachAlert.this.headerView;
                int alpha3 = dp3 + ((int) ((frameLayout != null ? frameLayout.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f)));
                FrameLayout frameLayout2 = ChatAttachAlert.this.topCommentContainer;
                int alpha4 = alpha3 + ((int) (frameLayout2 != null ? frameLayout2.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f));
                int scrollOffsetY = (ChatAttachAlert.this.getScrollOffsetY(0) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha4;
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                    scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
                }
                int dp4 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                getMeasuredHeight();
                AndroidUtilities.dp(45.0f);
                int unused = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                if (needsActionBar == 0) {
                    i = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                } else {
                    i = ActionBar.getCurrentActionBarHeight();
                }
                float f3 = 1.0f;
                if (needsActionBar == 2) {
                    f2 = scrollOffsetY < i ? Math.max(0.0f, 1.0f - ((i - scrollOffsetY) / ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop)) : 1.0f;
                } else {
                    float f4 = alpha4;
                    if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                        if (attachAlertLayout != ChatAttachAlert.this.pollLayout) {
                            if (attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                        } else {
                            dp2 = AndroidUtilities.dp(3.0f);
                        }
                        f = f4 - dp2;
                        float alpha5 = ChatAttachAlert.this.actionBar.getAlpha();
                        int i2 = (int) (((i - f) + AndroidUtilities.statusBarHeight) * alpha5);
                        scrollOffsetY -= i2;
                        dp4 -= i2;
                        f2 = 1.0f - alpha5;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    f = f4 + dp;
                    float alpha52 = ChatAttachAlert.this.actionBar.getAlpha();
                    int i22 = (int) (((i - f) + AndroidUtilities.statusBarHeight) * alpha52);
                    scrollOffsetY -= i22;
                    dp4 -= i22;
                    f2 = 1.0f - alpha52;
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (!chatAttachAlert.inBubbleMode) {
                    int i3 = AndroidUtilities.statusBarHeight;
                    scrollOffsetY += i3;
                    dp4 += i3;
                }
                int customBackground = chatAttachAlert.currentAttachLayout.hasCustomBackground() ? ChatAttachAlert.this.currentAttachLayout.getCustomBackground() : ChatAttachAlert.this.getActionBarDrawableColor();
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setAlpha(alpha2);
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), getMeasuredHeight() + AndroidUtilities.dp(45.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop);
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.draw(canvas);
                if (needsActionBar == 2) {
                    Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                }
                if ((f2 != 1.0f && needsActionBar != 2) || ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                        customBackground = ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground();
                    }
                    paint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                }
                if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                    Theme.dialogs_onlineCirclePaint.setColor(ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground());
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    int scrollOffsetY2 = ChatAttachAlert.this.getScrollOffsetY(0);
                    if (!ChatAttachAlert.this.inBubbleMode) {
                        scrollOffsetY2 += AndroidUtilities.statusBarHeight;
                    }
                    this.rect.set(((BottomSheet) r4).backgroundPaddingLeft, (((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(12.0f)) * f2, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, scrollOffsetY2 + AndroidUtilities.dp(12.0f));
                    canvas.save();
                    canvas.drawRect(this.rect, Theme.dialogs_onlineCirclePaint);
                    canvas.restore();
                }
                FrameLayout frameLayout3 = ChatAttachAlert.this.headerView;
                if ((frameLayout3 == null || frameLayout3.getAlpha() != 1.0f) && f2 != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - dp5) / 2, dp4, (getMeasuredWidth() + dp5) / 2, dp4 + AndroidUtilities.dp(4.0f));
                    if (needsActionBar == 2) {
                        themedColor = TLObject.FLAG_29;
                        f3 = f2;
                    } else if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                        int customActionBarBackground = ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground();
                        themedColor = ColorUtils.blendARGB(customActionBarBackground, ColorUtils.calculateLuminance(customActionBarBackground) < 0.5d ? -1 : -16777216, 0.5f);
                        FrameLayout frameLayout4 = ChatAttachAlert.this.headerView;
                        if (frameLayout4 != null) {
                            alpha = frameLayout4.getAlpha();
                            f3 = 1.0f - alpha;
                        }
                    } else {
                        themedColor = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                        FrameLayout frameLayout5 = ChatAttachAlert.this.headerView;
                        if (frameLayout5 != null) {
                            alpha = frameLayout5.getAlpha();
                            f3 = 1.0f - alpha;
                        }
                    }
                    int alpha6 = Color.alpha(themedColor);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (alpha6 * f3 * f2 * view.getAlpha()));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                canvas.restore();
            }
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int i;
            int dp;
            int dp2;
            float f;
            float f2;
            boolean drawChild;
            int themedColor;
            float f3 = 1.0f;
            if ((view instanceof AttachAlertLayout) && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(0.0f, ChatAttachAlert.this.currentPanTranslationY);
                int alpha = (int) (view.getAlpha() * 255.0f);
                AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
                int needsActionBar = attachAlertLayout.needsActionBar();
                int dp3 = AndroidUtilities.dp(13.0f);
                FrameLayout frameLayout = ChatAttachAlert.this.headerView;
                int dp4 = dp3 + (frameLayout != null ? AndroidUtilities.dp(frameLayout.getAlpha() * 26.0f) : 0);
                FrameLayout frameLayout2 = ChatAttachAlert.this.topCommentContainer;
                int alpha2 = dp4 + ((int) (frameLayout2 != null ? frameLayout2.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f));
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                int scrollOffsetY = (chatAttachAlert.getScrollOffsetY(attachAlertLayout == chatAttachAlert.currentAttachLayout ? 0 : 1) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha2;
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                    scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
                }
                int dp5 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(45.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                if (needsActionBar == 0) {
                    i = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                } else {
                    i = ActionBar.getCurrentActionBarHeight();
                }
                if (needsActionBar == 2) {
                    if (scrollOffsetY < i) {
                        f2 = Math.max(0.0f, 1.0f - ((i - scrollOffsetY) / ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop));
                    }
                    f2 = 1.0f;
                } else {
                    if (((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY < i) {
                        float f4 = alpha2;
                        if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                            if (attachAlertLayout != ChatAttachAlert.this.pollLayout) {
                                if (attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                                    dp2 = AndroidUtilities.dp(3.0f);
                                } else {
                                    dp = AndroidUtilities.dp(4.0f);
                                }
                            } else {
                                dp2 = AndroidUtilities.dp(3.0f);
                            }
                            f = f4 - dp2;
                            float min = Math.min(1.0f, ((i - scrollOffsetY) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) / f);
                            int i2 = (int) ((i - f) * min);
                            scrollOffsetY -= i2;
                            dp5 -= i2;
                            measuredHeight += i2;
                            f2 = 1.0f - min;
                        } else {
                            dp = AndroidUtilities.dp(11.0f);
                        }
                        f = f4 + dp;
                        float min2 = Math.min(1.0f, ((i - scrollOffsetY) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) / f);
                        int i22 = (int) ((i - f) * min2);
                        scrollOffsetY -= i22;
                        dp5 -= i22;
                        measuredHeight += i22;
                        f2 = 1.0f - min2;
                    }
                    f2 = 1.0f;
                }
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                if (!chatAttachAlert2.inBubbleMode) {
                    int i3 = AndroidUtilities.statusBarHeight;
                    scrollOffsetY += i3;
                    dp5 += i3;
                    measuredHeight -= i3;
                }
                int customBackground = chatAttachAlert2.currentAttachLayout.hasCustomBackground() ? ChatAttachAlert.this.currentAttachLayout.getCustomBackground() : ChatAttachAlert.this.getActionBarDrawableColor();
                boolean z = (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout || ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.photoPreviewLayout || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout && ChatAttachAlert.this.nextAttachLayout == null)) ? false : true;
                if (z) {
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setAlpha(alpha);
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), measuredHeight);
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.draw(canvas);
                    if (needsActionBar == 2) {
                        Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                        Theme.dialogs_onlineCirclePaint.setAlpha(alpha);
                        this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                    }
                }
                if (view != ChatAttachAlert.this.contactsLayout && view != ChatAttachAlert.this.quickRepliesLayout && view != ChatAttachAlert.this.audioLayout) {
                    canvas.save();
                    drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                } else {
                    drawChild = super.drawChild(canvas, view, j);
                }
                if (z) {
                    if (f2 != 1.0f && needsActionBar != 2) {
                        Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                        Theme.dialogs_onlineCirclePaint.setAlpha(alpha);
                        this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                    }
                    FrameLayout frameLayout3 = ChatAttachAlert.this.headerView;
                    if ((frameLayout3 == null || frameLayout3.getAlpha() != 1.0f) && f2 != 0.0f) {
                        int dp6 = AndroidUtilities.dp(36.0f);
                        this.rect.set((getMeasuredWidth() - dp6) / 2, dp5, (getMeasuredWidth() + dp6) / 2, dp5 + AndroidUtilities.dp(4.0f));
                        if (needsActionBar == 2) {
                            themedColor = TLObject.FLAG_29;
                            f3 = f2;
                        } else {
                            themedColor = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                            FrameLayout frameLayout4 = ChatAttachAlert.this.headerView;
                            if (frameLayout4 != null) {
                                f3 = 1.0f - frameLayout4.getAlpha();
                            }
                        }
                        int alpha3 = Color.alpha(themedColor);
                        Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                        Theme.dialogs_onlineCirclePaint.setAlpha((int) (alpha3 * f3 * f2 * view.getAlpha()));
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    }
                }
                canvas.restore();
                return drawChild;
            }
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
            ActionBar actionBar = chatAttachAlert3.actionBar;
            if (view == actionBar) {
                float alpha4 = actionBar.getAlpha();
                if (alpha4 <= 0.0f) {
                    return false;
                }
                if (alpha4 >= 1.0f) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(ChatAttachAlert.this.actionBar.getX(), getY(ChatAttachAlert.this.currentAttachLayout), ChatAttachAlert.this.actionBar.getX() + ChatAttachAlert.this.actionBar.getWidth(), ChatAttachAlert.this.actionBar.getY() + ChatAttachAlert.this.actionBar.getHeight());
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
            if ((view instanceof EmojiView) && chatAttachAlert3.emojiViewChildBg != null) {
                canvas.save();
                ChatAttachAlert.this.emojiViewChildBg.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(ChatAttachAlert.this.emojiViewChildBg.getPath());
                ChatAttachAlert.this.emojiViewChildBg.draw(canvas);
                boolean drawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild3;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            boolean z = ChatAttachAlert.this.inBubbleMode;
        }

        private int getCurrentTop() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            int i = chatAttachAlert.scrollOffsetY[0] - (((BottomSheet) chatAttachAlert).backgroundPaddingTop * 2);
            int dp = AndroidUtilities.dp(13.0f);
            FrameLayout frameLayout = ChatAttachAlert.this.headerView;
            int dp2 = i - (dp + (frameLayout != null ? AndroidUtilities.dp(frameLayout.getAlpha() * 26.0f) : 0));
            FrameLayout frameLayout2 = ChatAttachAlert.this.topCommentContainer;
            int alpha = (dp2 - ((int) (frameLayout2 != null ? frameLayout2.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f))) + AndroidUtilities.dp(20.0f);
            return !ChatAttachAlert.this.inBubbleMode ? alpha + AndroidUtilities.statusBarHeight : alpha;
        }

        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            if (Build.VERSION.SDK_INT >= 31 && ChatAttachAlert.this.scrollableViewNoiseSuppressor != null) {
                ChatAttachAlert.this.blur3_InvalidateBlur();
                if (ChatAttachAlert.this.iBlur3SourceGlassFrosted != null) {
                    ChatAttachAlert.this.iBlur3SourceGlassFrosted.setSize(((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredHeight());
                    ChatAttachAlert.this.iBlur3SourceGlassFrosted.updateDisplayListIfNeeded();
                }
                if (ChatAttachAlert.this.iBlur3SourceGlass != null) {
                    ChatAttachAlert.this.iBlur3SourceGlass.setSize(((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredHeight());
                    ChatAttachAlert.this.iBlur3SourceGlass.updateDisplayListIfNeeded();
                }
            }
            canvas.save();
            if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout || ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.photoPreviewLayout || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout && ChatAttachAlert.this.nextAttachLayout == null)) {
                drawChildBackground(canvas, ChatAttachAlert.this.currentAttachLayout);
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            float f2 = f + chatAttachAlert.currentPanTranslationY;
            if (((BottomSheet) chatAttachAlert).currentSheetAnimationType == 0) {
                this.initialTranslationY = f2;
            }
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1) {
                if (f2 < 0.0f) {
                    ChatAttachAlert.this.currentAttachLayout.setTranslationY(f2);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    if (chatAttachAlert2.avatarPicker != 0 || chatAttachAlert2.storyMediaPicker) {
                        chatAttachAlert2.headerView.setTranslationY((chatAttachAlert2.baseSelectedTextViewTranslationY + f2) - ChatAttachAlert.this.currentPanTranslationY);
                    }
                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setTranslationY(0.0f);
                    f2 = 0.0f;
                } else {
                    ChatAttachAlert.this.currentAttachLayout.setTranslationY(0.0f);
                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setTranslationY((-f2) + (r0.getMeasuredHeight() * (f2 / this.initialTranslationY)));
                }
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }
            super.setTranslationY(f2 - ChatAttachAlert.this.currentPanTranslationY);
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType != 1) {
                ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
        }

        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.adjustPanLayoutHelper.setResizableView(this);
            this.adjustPanLayoutHelper.onAttach();
            ChatAttachAlert.this.commentTextView.setAdjustPanLayoutHelper(this.adjustPanLayoutHelper);
            ChatAttachAlert.this.topCommentTextView.setAdjustPanLayoutHelper(this.adjustPanLayoutHelper);
        }

        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.adjustPanLayoutHelper.onDetach();
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            r7 = getRootWindowInsets();
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            int i5;
            WindowInsets rootWindowInsets;
            RoundedCorner roundedCorner;
            RoundedCorner roundedCorner2;
            int radius;
            super.onSizeChanged(i, i2, i3, i4);
            int i6 = 0;
            if (Build.VERSION.SDK_INT >= 31 && rootWindowInsets != null) {
                roundedCorner = rootWindowInsets.getRoundedCorner(3);
                roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                int radius2 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    radius = roundedCorner2.getRadius();
                    i5 = radius;
                    i6 = radius2;
                    if (ChatAttachAlert.this.emojiViewChildBg == null) {
                        ChatAttachAlert.this.emojiViewChildBg.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i5, i6, true);
                        return;
                    }
                    return;
                }
                i6 = radius2;
            }
            i5 = 0;
            if (ChatAttachAlert.this.emojiViewChildBg == null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(View view) {
        this.selectedMenuItem.toggleSubMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(View view) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return;
        }
        boolean z = !chatAttachAlertPhotoLayout.areLivePhotosEnabled();
        this.photoLayout.toggleLivePhotos(z);
        updateMotionItem(true);
        showMotionHint(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(View view) {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout != null) {
            attachAlertLayout.onMenuItemClick(40);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(boolean z, View view) {
        if (this.avatarPicker != 0) {
            this.delegate.openAvatarsSearch();
            lambda$new$0();
            return;
        }
        final HashMap hashMap = new HashMap();
        final ArrayList arrayList = new ArrayList();
        PhotoPickerSearchActivity photoPickerSearchActivity = new PhotoPickerSearchActivity(hashMap, arrayList, 0, true, (ChatActivity) this.baseFragment);
        photoPickerSearchActivity.setDelegate(new PhotoPickerActivity.PhotoPickerActivityDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert.10
            private boolean sendPressed;

            @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
            public /* synthetic */ boolean canFinishFragment() {
                return PhotoPickerActivity.PhotoPickerActivityDelegate.-CC.$default$canFinishFragment(this);
            }

            @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
            public void onCaptionChanged(CharSequence charSequence) {
            }

            @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
            public /* synthetic */ void onOpenInPressed() {
                PhotoPickerActivity.PhotoPickerActivityDelegate.-CC.$default$onOpenInPressed(this);
            }

            @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
            public void selectedPhotosChanged() {
            }

            @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
            public void actionButtonPressed(boolean z2, boolean z3, int i, int i2) {
                if (z2 || hashMap.isEmpty() || this.sendPressed) {
                    return;
                }
                this.sendPressed = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Object obj = hashMap.get(arrayList.get(i3));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    arrayList2.add(sendingMediaInfo);
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str = searchImage.imagePath;
                    if (str != null) {
                        sendingMediaInfo.path = str;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence = searchImage.caption;
                    sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
                ((ChatActivity) ChatAttachAlert.this.baseFragment).didSelectSearchPhotos(arrayList2, z3, i);
            }
        });
        photoPickerSearchActivity.setMaxSelectedPhotos(this.maxSelectedPhotos, this.allowOrder);
        if (z) {
            this.baseFragment.showAsSheet(photoPickerSearchActivity);
        } else {
            this.baseFragment.presentFragment(photoPickerSearchActivity);
        }
        lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6(Theme.ResourcesProvider resourcesProvider, View view) {
        this.optionsItem.toggleSubMenu();
        PhotoViewer.getInstance().setParentActivity(this.baseFragment, resourcesProvider);
        PhotoViewer.getInstance().setParentAlert(this);
        PhotoViewer.getInstance().setMaxSelectedPhotos(this.maxSelectedPhotos, this.allowOrder);
        if (!this.delegate.needEnterComment()) {
            AndroidUtilities.hideKeyboard(this.baseFragment.getFragmentView().findFocus());
            AndroidUtilities.hideKeyboard(getContainer().findFocus());
        }
        File makeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, "webp");
        Point point = AndroidUtilities.displaySize;
        int i = point.x;
        int i2 = point.y;
        if (i > 1080 || i2 > 1080) {
            float min = Math.min(i, i2) / 1080.0f;
            i = (int) (i * min);
            i2 = (int) (i2 * min);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        try {
            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(makeCacheFile));
        } catch (Throwable th) {
            FileLog.e(th);
        }
        createBitmap.recycle();
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, makeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
        arrayList.add(photoEntry);
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        11 r9 = new 11(photoEntry);
        BaseFragment baseFragment = this.baseFragment;
        photoViewer.openPhotoForSelect(arrayList, 0, 11, false, r9, baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null);
        if (this.isStickerMode) {
            PhotoViewer.getInstance().enableStickerMode(null, null, true, this.customStickerHandler);
        }
    }

    class 11 extends PhotoViewer.EmptyPhotoViewerProvider {
        final /* synthetic */ MediaController.PhotoEntry val$entry;

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public boolean allowCaption() {
            return false;
        }

        11(MediaController.PhotoEntry photoEntry) {
            this.val$entry = photoEntry;
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, final boolean z, final int i2, int i3, final boolean z2) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.sent = true;
            if (chatAttachAlert.delegate == null) {
                return;
            }
            this.val$entry.editedInfo = videoEditedInfo;
            int i4 = chatAttachAlert.currentAccount;
            long dialogId = getDialogId();
            int additionalMessagesCount = ChatAttachAlert.this.getAdditionalMessagesCount() + 1;
            final MediaController.PhotoEntry photoEntry = this.val$entry;
            AlertsCreator.ensurePaidMessageConfirmation(i4, dialogId, additionalMessagesCount, new Utilities.Callback() { // from class: org.telegram.ui.Components.ChatAttachAlert$11$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    ChatAttachAlert.11.this.lambda$sendButtonPressed$0(photoEntry, z, i2, z2, (Long) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendButtonPressed$0(MediaController.PhotoEntry photoEntry, boolean z, int i, boolean z2, Long l) {
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
            ChatAttachAlertPhotoLayout.selectedPhotos.clear();
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.add(0);
            ChatAttachAlertPhotoLayout.selectedPhotos.put(0, photoEntry);
            ChatAttachAlert.this.delegate.didPressedButton(7, true, z, i, 0, 0L, isCaptionAbove(), z2, l.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7(View view) {
        this.optionsItem.toggleSubMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$8(View view) {
        updatePhotoPreview(this.currentAttachLayout != this.photoPreviewLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:
    
        if (r2 != 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$new$14(Theme.ResourcesProvider resourcesProvider, View view, int i) {
        int checkSelfPermission;
        int checkSelfPermission2;
        int checkSelfPermission3;
        int checkSelfPermission4;
        int checkSelfPermission5;
        int checkSelfPermission6;
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment == null) {
            baseFragment = LaunchActivity.getLastFragment();
        }
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (view instanceof AttachButton) {
            Activity parentActivity = baseFragment.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!this.photosEnabled && !this.videosEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!this.photosEnabled && !this.videosEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(1, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout;
                    showLayout(chatAttachRestrictedLayout);
                }
                showLayout(this.photoLayout);
            } else if (intValue == 3) {
                if (!this.musicEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    checkSelfPermission6 = parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO");
                    if (checkSelfPermission6 != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i2 >= 23) {
                    checkSelfPermission5 = parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                    if (checkSelfPermission5 != 0) {
                        AndroidUtilities.findActivity(getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                openAudioLayout(true);
            } else if (intValue == 4) {
                if (!this.documentsEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33) {
                    checkSelfPermission3 = parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES");
                    if (checkSelfPermission3 == 0) {
                        checkSelfPermission4 = parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO");
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                    return;
                }
                if (i3 >= 23) {
                    checkSelfPermission2 = parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                    if (checkSelfPermission2 != 0) {
                        AndroidUtilities.findActivity(getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                openDocumentsLayout(true);
            } else if (intValue == 5) {
                if (!this.plainTextEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && this.plainTextEnabled) {
                    checkSelfPermission = getContext().checkSelfPermission("android.permission.READ_CONTACTS");
                    if (checkSelfPermission != 0) {
                        AndroidUtilities.findActivity(getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                        return;
                    }
                }
                openContactsLayout();
            } else if (intValue == 6) {
                if ((!this.plainTextEnabled && checkCanRemoveRestrictionsByBoosts()) || !AndroidUtilities.isMapsInstalled(this.baseFragment)) {
                    return;
                }
                if (!this.plainTextEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout2 = new ChatAttachRestrictedLayout(6, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout2;
                    showLayout(chatAttachRestrictedLayout2);
                } else {
                    if (this.locationLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), resourcesProvider, !this.isPollAttach);
                        this.locationLayout = chatAttachAlertLocationLayout;
                        attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                        ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = this.locationActivityDelegate;
                        if (locationActivityDelegate != null) {
                            chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                        } else {
                            chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda36
                                @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
                                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i4, boolean z, int i5, long j) {
                                    ChatAttachAlert.this.lambda$new$9(messageMedia, i4, z, i5, j);
                                }
                            });
                        }
                    }
                    showLayout(this.locationLayout);
                }
            } else if (intValue == 9) {
                if (!this.pollsEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!this.pollsEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout3 = new ChatAttachRestrictedLayout(9, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout3;
                    showLayout(chatAttachRestrictedLayout3);
                } else {
                    showPollLayout(true, null);
                }
            } else if (intValue == 11) {
                openQuickRepliesLayout();
            } else if (intValue == 12) {
                if (!this.todoEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!this.todoEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout4 = new ChatAttachRestrictedLayout(9, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout4;
                    showLayout(chatAttachRestrictedLayout4);
                } else {
                    if (this.todoLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr2 = this.layouts;
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(this, getContext(), true, resourcesProvider, null);
                        this.todoLayout = chatAttachAlertPollLayout;
                        attachAlertLayoutArr2[1] = chatAttachAlertPollLayout;
                        chatAttachAlertPollLayout.setDelegate(new ChatAttachAlertPollLayout.PollCreateActivityDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda37
                            @Override // org.telegram.ui.Components.ChatAttachAlertPollLayout.PollCreateActivityDelegate
                            public final void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i4, long j) {
                                ChatAttachAlert.this.lambda$new$10(messageMedia, charSequence, pollAttachedMediaPack, arrayList, z, i4, j);
                            }
                        });
                    }
                    showLayout(this.todoLayout);
                }
            } else if (intValue == 13) {
                if (this.stickersLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr3 = this.layouts;
                    ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout = new ChatAttachAlertEmojiLayout(this, getContext(), resourcesProvider, true);
                    this.stickersLayout = chatAttachAlertEmojiLayout;
                    attachAlertLayoutArr3[8] = chatAttachAlertEmojiLayout;
                    chatAttachAlertEmojiLayout.setDelegate(this.emojiViewDelegate);
                }
                showLayout(this.stickersLayout);
            } else if (intValue == 14) {
                if (this.emojiLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr4 = this.layouts;
                    ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout2 = new ChatAttachAlertEmojiLayout(this, getContext(), resourcesProvider, false);
                    this.emojiLayout = chatAttachAlertEmojiLayout2;
                    attachAlertLayoutArr4[9] = chatAttachAlertEmojiLayout2;
                    chatAttachAlertEmojiLayout2.setDelegate(this.emojiViewDelegate);
                }
                showLayout(this.emojiLayout);
            } else if (intValue == 16) {
                if (this.richLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr5 = this.layouts;
                    ChatAttachAlertRichLayout chatAttachAlertRichLayout = new ChatAttachAlertRichLayout(this, getContext(), this.currentAccount, resourcesProvider);
                    this.richLayout = chatAttachAlertRichLayout;
                    attachAlertLayoutArr5[10] = chatAttachAlertRichLayout;
                }
                showLayout(this.richLayout);
            } else if (view.getTag() instanceof Integer) {
                this.delegate.didPressedButton(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, isCaptionAbove(), false, 0L);
            }
        } else if (view instanceof AttachBotButton) {
            final AttachBotButton attachBotButton = (AttachBotButton) view;
            if (attachBotButton.attachMenuBot != null) {
                if (!attachBotButton.attachMenuBot.inactive) {
                    showBotLayout(attachBotButton.attachMenuBot.bot_id, true);
                } else {
                    WebAppDisclaimerAlert.show(getContext(), new Consumer() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda38
                        @Override // com.google.android.exoplayer2.util.Consumer
                        public final void accept(Object obj) {
                            ChatAttachAlert.this.lambda$new$13(attachBotButton, (Boolean) obj);
                        }
                    }, null, null);
                }
            } else {
                this.delegate.didSelectBot(attachBotButton.currentUser);
                lambda$new$0();
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i4 = left - dp;
        if (i4 < 0) {
            this.buttonsRecyclerView.smoothScrollBy(i4, 0);
            return;
        }
        int i5 = right + dp;
        if (i5 > this.buttonsRecyclerView.getMeasuredWidth()) {
            RecyclerListView recyclerListView = this.buttonsRecyclerView;
            recyclerListView.smoothScrollBy(i5 - recyclerListView.getMeasuredWidth(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$9(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        ((ChatActivity) this.baseFragment).didSelectLocation(messageMedia, i, z, i2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$10(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i, long j) {
        ((ChatActivity) this.baseFragment).sendTodo((TLRPC.TL_messageMediaToDo) messageMedia, z, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$13(final AttachBotButton attachBotButton, Boolean bool) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(attachBotButton.attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda63
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatAttachAlert.this.lambda$new$12(attachBotButton, tLObject, tL_error);
            }
        }, 66);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$12(final AttachBotButton attachBotButton, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda71
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlert.this.lambda$new$11(attachBotButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$11(AttachBotButton attachBotButton) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot = attachBotButton.attachMenuBot;
        attachBotButton.attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        showBotLayout(attachBotButton.attachMenuBot.bot_id, true);
        MediaDataController.getInstance(this.currentAccount).updateAttachMenuBotsInCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$15(View view, int i) {
        if (view instanceof AttachBotButton) {
            AttachBotButton attachBotButton = (AttachBotButton) view;
            if (!this.destroyed && attachBotButton.currentUser != null) {
                onLongClickBotButton(attachBotButton.attachMenuBot, attachBotButton.currentUser);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$16(View view) {
        ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
        long j = this.selectedId;
        if (j >= 0 || (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(-j)) == null) {
            return;
        }
        chatAttachAlertBotWebViewLayout.getWebViewContainer().onMainButtonPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$17(View view) {
        if (this.captionAbove) {
            return;
        }
        toggleCaptionAbove();
    }

    class 17 extends FrameLayout {
        17(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (ChatAttachAlert.this.captionContainer.getAlpha() <= 0.0f || ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop == 0.0f || ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop == ChatAttachAlert.this.frameLayout2.getTop() + ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop) {
                return;
            }
            if (ChatAttachAlert.this.topBackgroundAnimator != null) {
                ChatAttachAlert.this.topBackgroundAnimator.cancel();
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.captionEditTextTopOffset = chatAttachAlert.chatActivityEnterViewAnimateFromTop - (ChatAttachAlert.this.frameLayout2.getTop() + ChatAttachAlert.this.captionEditTextTopOffset);
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
            chatAttachAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(chatAttachAlert2.captionEditTextTopOffset, 0.0f);
            ChatAttachAlert.this.topBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$17$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatAttachAlert.17.this.lambda$onDraw$0(valueAnimator);
                }
            });
            ChatAttachAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ChatAttachAlert.this.topBackgroundAnimator.setDuration(200L);
            ChatAttachAlert.this.topBackgroundAnimator.start();
            ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDraw$0(ValueAnimator valueAnimator) {
            ChatAttachAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.captionContainer.invalidate();
            ChatAttachAlert.this.frameLayout2.invalidate();
            invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$21(Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.commentTextView == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
        new AIEditorAlert(getContext(), resourcesProvider).setText(this.commentTextView.getText()).setOnUse(new Utilities.Callback() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda34
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatAttachAlert.this.lambda$new$19((CharSequence) obj);
            }
        }).setOnSend(this.dialogId, this.editingMessageObject != null, new Utilities.Callback4() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda35
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                ChatAttachAlert.this.lambda$new$20((CharSequence) obj, (Integer) obj2, (Integer) obj3, (Boolean) obj4);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$19(CharSequence charSequence) {
        this.commentTextView.setText(charSequence);
        this.commentTextView.setSelection(charSequence.length(), charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$20(CharSequence charSequence, Integer num, Integer num2, Boolean bool) {
        this.commentTextView.setText(charSequence);
        this.commentTextView.setSelection(charSequence.length(), charSequence.length());
        onWriteButtonPressed();
    }

    class 19 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        19(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ChatAttachAlert.this.enterCommentEventSent) {
                if (motionEvent.getX() > ChatAttachAlert.this.commentTextView.getEditText().getLeft() && motionEvent.getX() < ChatAttachAlert.this.commentTextView.getEditText().getRight() && motionEvent.getY() > ChatAttachAlert.this.commentTextView.getEditText().getTop() && motionEvent.getY() < ChatAttachAlert.this.commentTextView.getEditText().getBottom()) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.makeFocusable(chatAttachAlert.commentTextView.getEditText(), true);
                } else {
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.makeFocusable(chatAttachAlert2.commentTextView.getEditText(), false);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                final EditTextCaption editText = ChatAttachAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawHeigth - editText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - editText.getScrollY())));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$19$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatAttachAlert.19.this.lambda$dispatchDraw$0(editText, valueAnimator);
                    }
                });
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = ofFloat;
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ofFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dispatchDraw$0(EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ChatAttachAlert.this.updateCommentTextViewPosition();
            if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout) {
                ChatAttachAlert.this.photoLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void onLineCountChanged(int i, int i2) {
            boolean z = false;
            if (!TextUtils.isEmpty(getEditText().getText())) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            } else {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!chatAttachAlert.captionAbove) {
                if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                    z = true;
                }
                chatAttachAlert.showAiButton(z);
            }
            ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop = r4.frameLayout2.getTop() + ChatAttachAlert.this.captionEditTextTopOffset;
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert.this.updateCommentTextViewPosition();
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void bottomPanelTranslationY(float f) {
            ChatAttachAlert.this.bottomPannelTranslation = f;
            ChatAttachAlert.this.frameLayout2.setTranslationY(f);
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert.this.checkUi_writeButtonContainerY();
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, true, 0);
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void closeParent() {
            ChatAttachAlert.super.lambda$new$0();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ChatAttachAlert.this.updateCommentTextViewPosition();
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void extendActionMode(ActionMode actionMode, Menu menu) {
            BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment).getCurrentEncryptedChat(), true, true);
            }
            super.extendActionMode(actionMode, menu);
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                emojiView.shouldLightenBackground = false;
                emojiView.fixBottomTabContainerTranslation = false;
                emojiView.setShouldDrawBackground(false);
                emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$22(View view) {
        if (this.captionAbove) {
            toggleCaptionAbove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$25(Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.topCommentTextView == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
        new AIEditorAlert(getContext(), resourcesProvider).setText(this.topCommentTextView.getText()).setOnUse(new Utilities.Callback() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda55
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatAttachAlert.this.lambda$new$23((CharSequence) obj);
            }
        }).setOnSend(this.dialogId, this.editingMessageObject != null, new Utilities.Callback4() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda56
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                ChatAttachAlert.this.lambda$new$24((CharSequence) obj, (Integer) obj2, (Integer) obj3, (Boolean) obj4);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$23(CharSequence charSequence) {
        this.topCommentTextView.setText(charSequence);
        this.topCommentTextView.setSelection(charSequence.length(), charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$24(CharSequence charSequence, Integer num, Integer num2, Boolean bool) {
        this.topCommentTextView.setText(charSequence);
        this.topCommentTextView.setSelection(charSequence.length(), charSequence.length());
        onWriteButtonPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$26(View view) {
        onWriteButtonPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:239|240|241|242)|(5:(4:244|245|246|(15:248|249|250|251|252|253|254|255|256|257|258|259|260|261|262))(1:328)|259|260|261|262)|318|319|320|321|258) */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0495, code lost:
    
        if (r4 != null) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0497, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x049c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04d7, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04d4, code lost:
    
        if (r4 != null) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04a3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.CharSequence, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ boolean lambda$new$37(final Context context, final Theme.ResourcesProvider resourcesProvider, final BaseFragment baseFragment, View view) {
        TLRPC.User user;
        long j;
        MessageObject messageObject;
        MessageObject messageObject2;
        ChatActivity chatActivity;
        boolean z;
        boolean z2;
        TLRPC.User user2;
        long j2;
        final MessageObject messageObject3;
        HashMap<Object, Object> hashMap;
        ArrayList<Object> arrayList;
        int i;
        int i2;
        long j3;
        int i3;
        int i4;
        int i5;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        ParcelFileDescriptor parcelFileDescriptor;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor2;
        ParcelFileDescriptor parcelFileDescriptor3;
        ParcelFileDescriptor parcelFileDescriptor4;
        String str;
        ArrayList arrayList2;
        final long j4;
        int i6;
        ?? r15;
        final long j5;
        BaseFragment baseFragment2;
        final Theme.ResourcesProvider resourcesProvider2;
        AttachAlertLayout attachAlertLayout;
        MessageObject messageObject4;
        MessageObject messageObject5;
        boolean z3;
        String substring;
        boolean z4;
        boolean z5;
        int i7;
        boolean z6;
        boolean z7 = true;
        long j6 = this.dialogId;
        if ((j6 == 0 && !(this.baseFragment instanceof ChatActivity)) || this.currentLimit - this.codepointCount < 0) {
            return false;
        }
        BaseFragment baseFragment3 = this.baseFragment;
        if (baseFragment3 instanceof ChatActivity) {
            ChatActivity chatActivity2 = (ChatActivity) baseFragment3;
            chatActivity2.getCurrentChat();
            user = chatActivity2.getCurrentUser();
            messageObject = chatActivity2.getReplyMessage();
            messageObject2 = chatActivity2.getReplyTopMessage();
            if (chatActivity2.isInScheduleMode() || chatActivity2.getChatMode() == 5) {
                return false;
            }
            chatActivity = chatActivity2;
            j = chatActivity2.getDialogId();
        } else {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j6));
            j = j6;
            messageObject = null;
            messageObject2 = null;
            chatActivity = null;
        }
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss();
        }
        MessageSendPreview messageSendPreview2 = new MessageSendPreview(context, resourcesProvider) { // from class: org.telegram.ui.Components.ChatAttachAlert.25
            @Override // org.telegram.ui.MessageSendPreview
            protected void onEffectChange(long j7) {
                ChatAttachAlert.this.writeButton.setEffect(ChatAttachAlert.this.effectId = j7);
                super.onEffectChange(j7);
            }
        };
        this.messageSendPreview = messageSendPreview2;
        messageSendPreview2.setSendButton(this.writeButton, false, new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda42
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatAttachAlert.this.lambda$new$28(baseFragment, resourcesProvider, view2);
            }
        });
        ArrayList arrayList3 = new ArrayList();
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        String str2 = "";
        if (attachAlertLayout2 == chatAttachAlertPhotoLayout || attachAlertLayout2 == this.photoPreviewLayout) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = this.photoLayout.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                boolean z8 = false;
                MessageObject messageObject6 = null;
                int i8 = 0;
                int i9 = 0;
                z = false;
                while (i8 < ceil) {
                    int i10 = ceil;
                    int i11 = i8 * 10;
                    MessageObject messageObject7 = messageObject6;
                    int min = Math.min(10, selectedPhotos.size() - i11);
                    String str3 = str2;
                    long nextLong = Utilities.random.nextLong();
                    TLRPC.User user3 = user;
                    int i12 = i9;
                    z8 = z8;
                    int i13 = 0;
                    while (i13 < min) {
                        boolean z9 = z8;
                        int i14 = i11 + i13;
                        if (i14 >= selectedPhotosOrder.size()) {
                            hashMap = selectedPhotos;
                            arrayList = selectedPhotosOrder;
                            i2 = min;
                            j3 = j;
                            z8 = z9;
                            i5 = 1;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i14));
                            hashMap = selectedPhotos;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            arrayList = selectedPhotosOrder;
                            int i15 = i12 + 1;
                            tL_message.id = i12;
                            tL_message.out = true;
                            tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                            tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(j);
                            boolean z10 = photoEntry.isVideo;
                            if (!z10 && (str = photoEntry.imagePath) != null) {
                                tL_message.attachPath = str;
                            } else {
                                String str4 = photoEntry.path;
                                if (str4 != null) {
                                    tL_message.attachPath = str4;
                                }
                            }
                            if (min > 0) {
                                tL_message.grouped_id = nextLong;
                            }
                            int i16 = photoEntry.width;
                            int i17 = photoEntry.height;
                            int i18 = photoEntry.orientation;
                            if (z10) {
                                if (photoEntry.videoOrientation == -1) {
                                    try {
                                        mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                        try {
                                            try {
                                            } catch (Exception e) {
                                                e = e;
                                                i = i17;
                                                i2 = min;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            parcelFileDescriptor3 = null;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        i = i17;
                                        i2 = min;
                                        j3 = j;
                                        mediaMetadataRetriever2 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        mediaMetadataRetriever = null;
                                        parcelFileDescriptor = null;
                                    }
                                    try {
                                        try {
                                            if (photoEntry.isLivePhoto()) {
                                                i = i17;
                                                i2 = min;
                                                try {
                                                    if (photoEntry.livePhotoVideoOffset > 0) {
                                                        File file = new File(photoEntry.path);
                                                        parcelFileDescriptor2 = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                                                        try {
                                                            parcelFileDescriptor4 = parcelFileDescriptor2;
                                                            try {
                                                                try {
                                                                    j3 = j;
                                                                    try {
                                                                        mediaMetadataRetriever2.setDataSource(parcelFileDescriptor2.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                                        parcelFileDescriptor2 = parcelFileDescriptor4;
                                                                        photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                                        mediaMetadataRetriever2.release();
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        parcelFileDescriptor2 = parcelFileDescriptor4;
                                                                        try {
                                                                            photoEntry.videoOrientation = 0;
                                                                            FileLog.e(e);
                                                                            if (mediaMetadataRetriever2 != null) {
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                            parcelFileDescriptor = parcelFileDescriptor2;
                                                                            if (mediaMetadataRetriever != null) {
                                                                            }
                                                                            if (parcelFileDescriptor != null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    parcelFileDescriptor3 = parcelFileDescriptor4;
                                                                    th = th;
                                                                    parcelFileDescriptor = parcelFileDescriptor3;
                                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                    if (mediaMetadataRetriever != null) {
                                                                        try {
                                                                            mediaMetadataRetriever.release();
                                                                        } catch (IOException e4) {
                                                                            FileLog.e(e4);
                                                                        }
                                                                    }
                                                                    if (parcelFileDescriptor != null) {
                                                                        try {
                                                                            parcelFileDescriptor.close();
                                                                            throw th;
                                                                        } catch (IOException e5) {
                                                                            FileLog.e(e5);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                j3 = j;
                                                            }
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            j3 = j;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            parcelFileDescriptor4 = parcelFileDescriptor2;
                                                        }
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    j3 = j;
                                                    parcelFileDescriptor2 = null;
                                                    photoEntry.videoOrientation = 0;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        try {
                                                            mediaMetadataRetriever2.release();
                                                        } catch (IOException e9) {
                                                            FileLog.e(e9);
                                                        }
                                                    }
                                                }
                                            } else {
                                                i = i17;
                                                i2 = min;
                                            }
                                            mediaMetadataRetriever2.release();
                                        } catch (IOException e10) {
                                            FileLog.e(e10);
                                        }
                                        photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                    } catch (Exception e11) {
                                        e = e11;
                                        photoEntry.videoOrientation = 0;
                                        FileLog.e(e);
                                        if (mediaMetadataRetriever2 != null) {
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        parcelFileDescriptor3 = parcelFileDescriptor2;
                                        th = th;
                                        parcelFileDescriptor = parcelFileDescriptor3;
                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                        if (mediaMetadataRetriever != null) {
                                        }
                                        if (parcelFileDescriptor != null) {
                                        }
                                    }
                                    j3 = j;
                                    mediaMetadataRetriever2.setDataSource(photoEntry.path);
                                    parcelFileDescriptor2 = null;
                                } else {
                                    i = i17;
                                    i2 = min;
                                    j3 = j;
                                }
                                i18 = photoEntry.videoOrientation;
                            } else {
                                i = i17;
                                i2 = min;
                                j3 = j;
                            }
                            if ((i18 / 90) % 2 != 0) {
                                i4 = i16;
                                i3 = i;
                            } else {
                                i3 = i16;
                                i4 = i;
                            }
                            if (photoEntry.isLivePhoto()) {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto;
                                tL_messageMediaPhoto.live_photo = true;
                                tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                tL_photoSize.w = i3;
                                tL_photoSize.h = i4;
                                tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize);
                                tL_message.media.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo.w = i3;
                                tL_documentAttributeVideo.h = i4;
                                tL_documentAttributeVideo.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                            } else if (photoEntry.isVideo) {
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo2.w = i3;
                                tL_documentAttributeVideo2.h = i4;
                                tL_documentAttributeVideo2.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                            } else {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto2;
                                tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                tL_photoSize2.w = i3;
                                tL_photoSize2.h = i4;
                                tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize2);
                            }
                            tL_message.media.spoiler = photoEntry.hasSpoiler;
                            CharSequence charSequence = photoEntry.caption;
                            String charSequence2 = charSequence == null ? str3 : charSequence.toString();
                            tL_message.message = charSequence2;
                            if (TextUtils.isEmpty(charSequence2) && i8 == 0 && i13 == 0) {
                                CharSequence[] charSequenceArr = {getCommentView().getText()};
                                MessageObject.addLinks(true, charSequenceArr[0]);
                                tL_message.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                                tL_message.message = charSequenceArr[0].toString();
                            }
                            if (i8 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                if (messageObject2 != null) {
                                    tL_messageReplyHeader.flags |= 2;
                                    tL_messageReplyHeader.reply_to_top_id = messageObject2.getId();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject8 = new MessageObject(this.currentAccount, tL_message, true, false);
                            if (i8 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject8.replyMessageObject = messageObject;
                            }
                            messageObject8.sendPreviewEntry = photoEntry;
                            messageObject8.sendPreview = true;
                            messageObject8.notime = true;
                            messageObject8.isOutOwnerCached = Boolean.TRUE;
                            arrayList3.add(messageObject8);
                            if (messageObject7 == null && !TextUtils.isEmpty(tL_message.message)) {
                                messageObject7 = messageObject8;
                            }
                            i12 = i15;
                            z8 = true;
                            i5 = 1;
                            z = true;
                        }
                        i13 += i5;
                        selectedPhotos = hashMap;
                        selectedPhotosOrder = arrayList;
                        min = i2;
                        j = j3;
                    }
                    i8++;
                    i9 = i12;
                    messageObject6 = messageObject7;
                    ceil = i10;
                    str2 = str3;
                    user = user3;
                    selectedPhotos = selectedPhotos;
                }
                z2 = z8;
                user2 = user;
                j2 = j;
                messageObject3 = messageObject6;
            }
            user2 = user;
            j2 = j;
            messageObject3 = null;
            z = false;
            z2 = false;
        } else {
            if (attachAlertLayout2 == this.contactsLayout) {
                if (TextUtils.isEmpty(getCommentView().getText())) {
                    i7 = 0;
                    z6 = false;
                } else {
                    TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                    tL_message2.id = 0;
                    tL_message2.out = true;
                    tL_message2.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                    tL_message2.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(j);
                    CharSequence[] charSequenceArr2 = {getCommentView().getText()};
                    MessageObject.addLinks(true, charSequenceArr2[0]);
                    tL_message2.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr2, true);
                    tL_message2.message = charSequenceArr2[0].toString();
                    MessageObject messageObject9 = new MessageObject(this.currentAccount, tL_message2, true, false);
                    messageObject9.sendPreview = true;
                    messageObject9.notime = true;
                    messageObject9.isOutOwnerCached = Boolean.TRUE;
                    arrayList3.add(messageObject9);
                    i7 = 1;
                    z6 = true;
                }
                ArrayList<TLRPC.User> selected = this.contactsLayout.getSelected();
                int i19 = 0;
                while (i19 < selected.size()) {
                    TLRPC.User user4 = selected.get(i19);
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    int i20 = i7 + 1;
                    tL_message3.id = i7;
                    tL_message3.out = z7;
                    tL_message3.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                    tL_message3.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(j);
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                    tL_message3.media = tL_messageMediaContact;
                    tL_messageMediaContact.phone_number = user4.phone;
                    tL_messageMediaContact.first_name = user4.first_name;
                    tL_messageMediaContact.last_name = user4.last_name;
                    if (!user4.restriction_reason.isEmpty() && user4.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                        tL_message3.media.vcard = user4.restriction_reason.get(0).text;
                    } else {
                        tL_message3.media.vcard = "";
                    }
                    tL_message3.media.user_id = user4.id;
                    MessageObject messageObject10 = new MessageObject(this.currentAccount, tL_message3, true, false);
                    messageObject10.sendPreview = true;
                    messageObject10.notime = true;
                    messageObject10.isOutOwnerCached = Boolean.TRUE;
                    arrayList3.add(messageObject10);
                    i19++;
                    i7 = i20;
                    z6 = true;
                    z7 = true;
                }
                z2 = z6;
                user2 = user;
                j2 = j;
                messageObject3 = null;
            } else if (attachAlertLayout2 == this.documentLayout) {
                boolean z11 = false;
                int i21 = 0;
                messageObject3 = null;
                for (int i22 = 0; i22 < this.documentLayout.selectedFilesOrder.size(); i22++) {
                    String str5 = (String) this.documentLayout.selectedFilesOrder.get(i22);
                    if (str5 != null) {
                        int lastIndexOf = str5.lastIndexOf(File.separator);
                        if (lastIndexOf < 0) {
                            substring = str5;
                            z3 = true;
                        } else {
                            z3 = true;
                            substring = str5.substring(lastIndexOf + 1);
                        }
                        if (!TextUtils.isEmpty(substring)) {
                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                            int i23 = i21 + 1;
                            tL_message4.id = i21;
                            tL_message4.out = z3;
                            tL_message4.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                            tL_message4.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(j);
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                            tL_message4.media = tL_messageMediaDocument2;
                            tL_message4.attachPath = str5;
                            tL_messageMediaDocument2.document = new TLRPC.TL_document();
                            TLRPC.Document document = tL_message4.media.document;
                            document.file_name = substring;
                            document.size = new File(str5).length();
                            if (TextUtils.isEmpty(tL_message4.message) && i22 == 0) {
                                z4 = true;
                                z5 = false;
                                CharSequence[] charSequenceArr3 = {getCommentView().getText()};
                                tL_message4.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr3, true);
                                tL_message4.message = charSequenceArr3[0].toString();
                            } else {
                                z4 = true;
                                z5 = false;
                            }
                            MessageObject messageObject11 = new MessageObject(this.currentAccount, tL_message4, z4, z5);
                            messageObject11.attachPathExists = z4;
                            messageObject11.sendPreview = z4;
                            messageObject11.notime = z4;
                            messageObject11.isOutOwnerCached = Boolean.TRUE;
                            arrayList3.add(messageObject11);
                            if (i22 == 0 && messageObject3 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                messageObject3 = messageObject11;
                            }
                            i21 = i23;
                            z11 = true;
                        }
                    }
                }
                z2 = z11;
                user2 = user;
                j2 = j;
            } else {
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.audioLayout;
                if (attachAlertLayout2 == chatAttachAlertAudioLayout) {
                    arrayList3.addAll(chatAttachAlertAudioLayout.getSelected());
                    if (!arrayList3.isEmpty()) {
                        MessageObject messageObject12 = (MessageObject) arrayList3.get(0);
                        CharSequence[] charSequenceArr4 = {getCommentView().getText()};
                        MessageObject.addLinks(true, charSequenceArr4[0]);
                        messageObject12.messageOwner.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr4, true);
                        messageObject12.messageOwner.message = charSequenceArr4[0].toString();
                        if (!TextUtils.isEmpty(messageObject12.messageOwner.message)) {
                            messageObject12.generateCaption();
                            messageObject4 = messageObject12;
                            if (arrayList3.size() <= 1) {
                                int i24 = 0;
                                while (true) {
                                    messageObject5 = messageObject4;
                                    if (i24 >= Math.ceil(arrayList3.size() / 10.0f)) {
                                        break;
                                    }
                                    int i25 = i24 * 10;
                                    int min2 = Math.min(10, arrayList3.size() - i25);
                                    long nextLong2 = Utilities.random.nextLong();
                                    for (int i26 = 0; i26 < min2; i26++) {
                                        int i27 = i25 + i26;
                                        if (i27 < arrayList3.size()) {
                                            ((MessageObject) arrayList3.get(i27)).messageOwner.grouped_id = nextLong2;
                                        }
                                    }
                                    i24++;
                                    messageObject4 = messageObject5;
                                }
                            } else {
                                messageObject5 = messageObject4;
                            }
                            user2 = user;
                            messageObject3 = messageObject5;
                            j2 = j;
                            z = false;
                            z2 = true;
                        }
                    }
                    messageObject4 = null;
                    if (arrayList3.size() <= 1) {
                    }
                    user2 = user;
                    messageObject3 = messageObject5;
                    j2 = j;
                    z = false;
                    z2 = true;
                }
                user2 = user;
                j2 = j;
                messageObject3 = null;
                z = false;
                z2 = false;
            }
            z = false;
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        ItemOptions makeOptions = ItemOptions.makeOptions(this.containerView, resourcesProvider, this.writeButton);
        if (messageObject3 == null || !((attachAlertLayout = this.currentAttachLayout) == this.photoLayout || attachAlertLayout == this.photoPreviewLayout)) {
            arrayList2 = arrayList3;
            j4 = j2;
            i6 = 0;
            r15 = 0;
        } else {
            j4 = j2;
            arrayList2 = arrayList3;
            r15 = 0;
            r15 = 0;
            final MessagePreviewView.ToggleButton toggleButton = new MessagePreviewView.ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), resourcesProvider);
            TLRPC.Message message = messageObject3.messageOwner;
            boolean z12 = this.captionAbove;
            message.invert_media = z12;
            i6 = 0;
            toggleButton.setState(!z12, false);
            toggleButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda43
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatAttachAlert.this.lambda$new$29(messageObject3, toggleButton, view2);
                }
            });
            makeOptions.addView(toggleButton);
            if (this.editingMessageObject == null) {
                makeOptions.addGap();
            }
        }
        boolean isUserSelf = UserObject.isUserSelf(user2);
        if (this.editingMessageObject == null && ((chatActivity == null || !ChatObject.isMonoForum(chatActivity.getCurrentChat())) && ((chatActivity != null && chatActivity.canScheduleMessage()) || this.currentAttachLayout.canScheduleMessages()))) {
            makeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda44
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.lambda$new$31(j4, resourcesProvider);
                }
            });
        }
        AttachAlertLayout attachAlertLayout3 = this.currentAttachLayout;
        if ((attachAlertLayout3 == this.photoLayout || attachAlertLayout3 == this.photoPreviewLayout) && attachAlertLayout3.getSelectedItemsCount() == 1 && chatActivity != null && ChatObject.isMonoForum(chatActivity.getCurrentChat())) {
            j5 = j4;
            baseFragment2 = baseFragment;
            final ChatActivity chatActivity3 = chatActivity;
            resourcesProvider2 = resourcesProvider;
            makeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda45
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.lambda$new$33(j5, chatActivity3, resourcesProvider);
                }
            });
        } else {
            baseFragment2 = baseFragment;
            j5 = j4;
            resourcesProvider2 = resourcesProvider;
        }
        if (this.editingMessageObject == null && !isUserSelf) {
            makeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda46
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.lambda$new$34();
                }
            });
        }
        if (this.editingMessageObject == null && z && chatActivity != null && ChatObject.isChannelAndNotMegaGroup(chatActivity.getCurrentChat()) && chatActivity.getCurrentChatInfo() != null && chatActivity.getCurrentChatInfo().paid_media_allowed) {
            int i28 = R.drawable.menu_feature_paid;
            int i29 = R.string.PaidMediaButton;
            final ActionBarMenuSubItem last = makeOptions.add(i28, LocaleController.getString(i29), (Runnable) r15).getLast();
            last.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda47
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatAttachAlert.this.lambda$new$36(context, last, resourcesProvider2, view2);
                }
            });
            long starsPrice = this.photoLayout.getStarsPrice();
            if (starsPrice > 0) {
                last.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                last.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[i6]));
            } else {
                last.setText(LocaleController.getString(i29));
                last.setSubtext(r15);
            }
            this.messageSendPreview.setStars(starsPrice);
        }
        makeOptions.setupSelectors();
        this.messageSendPreview.setItemOptions(makeOptions);
        this.messageSendPreview.setMessageObjects(arrayList2);
        if (this.editingMessageObject == null && j5 >= 0 && z2) {
            this.messageSendPreview.allowEffectSelector(baseFragment2);
            this.messageSendPreview.setEffectId(this.effectId);
        }
        this.messageSendPreview.show();
        try {
            view.performHapticFeedback(3, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$28(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view) {
        boolean sendPressed;
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        final long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        this.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        forceKeyboardOnDismiss();
        if (this.currentLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView);
            AndroidUtilities.shakeView(this.topCaptionLimitView);
            try {
                this.writeButton.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium > this.codepointCount) {
                showCaptionLimitBulletin(baseFragment);
            }
            MessageSendPreview messageSendPreview2 = this.messageSendPreview;
            if (messageSendPreview2 != null) {
                messageSendPreview2.dismiss(false);
                this.messageSendPreview = null;
                return;
            }
            return;
        }
        if (this.editingMessageObject == null) {
            BaseFragment baseFragment2 = this.baseFragment;
            if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda65
                    @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ChatAttachAlert.this.lambda$new$27(selectedEffect, z, i, i2);
                    }
                }, resourcesProvider);
                setCaptionAbove(false, false);
            }
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed = sendPressed(true, 0, 0, selectedEffect, isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(true, 0, 0, selectedEffect, isCaptionAbove())) {
                this.allowPassConfirmationAlert = true;
                lambda$new$0();
            }
            sendPressed = false;
        }
        MessageSendPreview messageSendPreview3 = this.messageSendPreview;
        if (messageSendPreview3 != null) {
            messageSendPreview3.dismiss(!sendPressed);
            this.messageSendPreview = null;
        }
        setCaptionAbove(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$27(long j, boolean z, int i, int i2) {
        boolean sendPressed;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed = sendPressed(z, i, i2, j, isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(z, i, i2, j, isCaptionAbove())) {
                this.allowPassConfirmationAlert = true;
                lambda$new$0();
            }
            sendPressed = false;
        }
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(!sendPressed);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$29(MessageObject messageObject, MessagePreviewView.ToggleButton toggleButton, View view) {
        MessagePreviewView.ToggleButton toggleButton2;
        setCaptionAbove(!this.captionAbove);
        TLRPC.Message message = messageObject.messageOwner;
        boolean z = this.captionAbove;
        message.invert_media = z;
        toggleButton.setState(!z, true);
        this.messageSendPreview.changeMessage(messageObject);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null && (toggleButton2 = chatAttachAlertPhotoLayout.captionItem) != null) {
            toggleButton2.setState(!this.captionAbove, true);
        }
        this.messageSendPreview.scrollTo(!this.captionAbove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$31(long j, Theme.ResourcesProvider resourcesProvider) {
        AlertsCreator.createScheduleDatePickerDialog(getContext(), j, new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda67
            @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
            public final void didSelectDate(boolean z, int i, int i2) {
                ChatAttachAlert.this.lambda$new$30(z, i, i2);
            }
        }, resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$30(boolean z, int i, int i2) {
        boolean sendPressed;
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        this.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed = sendPressed(z, i, i2, selectedEffect, isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(z, i, i2, selectedEffect, isCaptionAbove())) {
                lambda$new$0();
            }
            sendPressed = false;
        }
        MessageSendPreview messageSendPreview2 = this.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(!sendPressed);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$33(long j, final ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider) {
        Context context = getContext();
        int i = this.currentAccount;
        MessageSuggestionParams messageSuggestionParams = chatActivity.messageSuggestionParams;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new MessageSuggestionOfferSheet(context, i, j, messageSuggestionParams, chatActivity, resourcesProvider, 0, new Utilities.Callback() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda66
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatAttachAlert.this.lambda$new$32(chatActivity, (MessageSuggestionParams) obj);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$32(ChatActivity chatActivity, MessageSuggestionParams messageSuggestionParams) {
        chatActivity.messageSuggestionParams = messageSuggestionParams;
        boolean sendPressed = sendPressed(true, 0, 0, this.effectId, isCaptionAbove());
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(!sendPressed);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$34() {
        boolean sendPressed;
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        this.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed = sendPressed(false, 0, 0, selectedEffect, isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(false, 0, 0, selectedEffect, isCaptionAbove())) {
                lambda$new$0();
            }
            sendPressed = false;
        }
        MessageSendPreview messageSendPreview2 = this.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(!sendPressed);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$36(Context context, final ActionBarMenuSubItem actionBarMenuSubItem, Theme.ResourcesProvider resourcesProvider, View view) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return;
        }
        StarsIntroActivity.showMediaPriceSheet(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new Utilities.Callback2() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda64
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                ChatAttachAlert.this.lambda$new$35(actionBarMenuSubItem, (Long) obj, (Runnable) obj2);
            }
        }, resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$35(ActionBarMenuSubItem actionBarMenuSubItem, Long l, Runnable runnable) {
        runnable.run();
        this.photoLayout.setStarsPrice(l.longValue());
        if (l.longValue() > 0) {
            actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
            actionBarMenuSubItem.setSubtext(LocaleController.formatPluralString("Stars", (int) l.longValue(), new Object[0]));
            this.messageSendPreview.setStars(l.longValue());
        } else {
            actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaButton));
            actionBarMenuSubItem.setSubtext(null);
            this.messageSendPreview.setStars(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getEmojiPadding() {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (attachAlertLayout == chatAttachAlertPollLayout && chatAttachAlertPollLayout.emojiView != null) {
            return chatAttachAlertPollLayout.getEmojiPadding();
        }
        ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
        if (attachAlertLayout == chatAttachAlertPollLayout2 && chatAttachAlertPollLayout2.emojiView != null) {
            return chatAttachAlertPollLayout2.getEmojiPadding();
        }
        if (this.captionAbove) {
            return this.topCommentTextView.getEmojiPadding();
        }
        return this.commentTextView.getEmojiPadding();
    }

    public boolean hasCaption() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return false;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = this.photoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < Math.ceil(selectedPhotos.size() / 10.0f); i++) {
            int i2 = i * 10;
            int min = Math.min(10, selectedPhotos.size() - i2);
            Utilities.random.nextLong();
            for (int i3 = 0; i3 < min; i3++) {
                int i4 = i2 + i3;
                if (i4 < selectedPhotosOrder.size()) {
                    CharSequence charSequence = ((MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i4))).caption;
                    String charSequence2 = charSequence == null ? "" : charSequence.toString();
                    if (getCommentView() != null && TextUtils.isEmpty(charSequence2) && i3 == 0) {
                        charSequence2 = getCommentView().getText().toString();
                    }
                    if (TextUtils.isEmpty(charSequence2)) {
                        continue;
                    } else {
                        if (z) {
                            return false;
                        }
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_writeButtonContainerY() {
        FrameLayout frameLayout = this.topCommentContainer;
        if (frameLayout == null || frameLayout.getVisibility() != 0 || this.topCommentContainer.getAlpha() == 0.0f) {
            this.writeButtonContainer.setTranslationY(this.bottomPannelTranslation);
            this.writeButton.setAlpha(1.0f);
            return;
        }
        float floatValue = this.animatorCaptionAbove.getFloatValue();
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, floatValue));
        this.writeButton.setAlpha(abs * abs * abs * abs);
        this.writeButtonContainer.setTranslationY(AndroidUtilities.lerp(this.bottomPannelTranslation, ((this.topCommentContainer.getTop() + this.topCommentContainer.getTranslationY()) - this.writeButtonContainer.getTop()) + AndroidUtilities.dp(8.0f), CubicBezierInterpolator.EASE_BOTH.getInterpolation(floatValue)));
    }

    private void checkUi_bottomFade() {
        float floatValue = this.animatorCaptionVisible.getFloatValue();
        this.bottomFadeView.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - this.animatorActionBarVisible.getFloatValue()) * (1.0f - floatValue))), 1.0f - ((1.0f - this.animatorCaptionAbove.getFloatValue()) * floatValue)));
    }

    public boolean isCaptionAbove() {
        AttachAlertLayout attachAlertLayout;
        return this.captionAbove && ((attachAlertLayout = this.currentAttachLayout) == this.photoLayout || attachAlertLayout == this.photoPreviewLayout);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    protected void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).addOverlayPasscodeView(this.passcodeView);
        }
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).removeOverlayPasscodeView(this.passcodeView);
        }
    }

    private void onWriteButtonPressed() {
        MessageObject messageObject = this.editingMessageObject;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.editingMessageObject.getDialogId())) {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                MessageSuggestionParams messageSuggestionParams = chatActivity.messageSuggestionParams;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.of(this.editingMessageObject.messageOwner.suggested_post);
                }
                if (!StarsController.isEnoughAmount(this.currentAccount, messageSuggestionParams.amount)) {
                    chatActivity.showSuggestionOfferForEditMessage(messageSuggestionParams);
                    return;
                }
            }
        }
        if (this.currentLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView);
            AndroidUtilities.shakeView(this.topCaptionLimitView);
            try {
                this.writeButton.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium <= this.codepointCount) {
                return;
            }
            showCaptionLimitBulletin(this.baseFragment);
            return;
        }
        if (this.editingMessageObject == null) {
            BaseFragment baseFragment2 = this.baseFragment;
            if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda41
                    @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ChatAttachAlert.this.lambda$onWriteButtonPressed$38(z, i, i2);
                    }
                }, this.resourcesProvider);
                return;
            }
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(true, 0, 0, this.effectId, isCaptionAbove());
        } else {
            if (attachAlertLayout.sendSelectedItems(true, 0, 0, this.effectId, isCaptionAbove())) {
                return;
            }
            this.allowPassConfirmationAlert = true;
            lambda$new$0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onWriteButtonPressed$38(boolean z, int i, int i2) {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(z, i, 0, this.effectId, isCaptionAbove());
        } else {
            if (attachAlertLayout.sendSelectedItems(z, i, i2, 0L, isCaptionAbove())) {
                return;
            }
            this.allowPassConfirmationAlert = true;
            lambda$new$0();
        }
    }

    public void updateCommentTextViewPosition() {
        float y;
        this.commentTextView.getLocationOnScreen(this.commentTextViewLocation);
        if (this.mentionContainer != null) {
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            if ((attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) && this.captionAbove) {
                y = (this.topCommentContainer.getY() - this.mentionContainer.getTop()) + (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha());
            } else {
                y = -this.commentTextView.getHeight();
            }
            if (Math.abs(this.mentionContainer.getTranslationY() - y) > 0.5f) {
                this.mentionContainer.setTranslationY(y);
                this.mentionContainer.invalidate();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.checkCameraViewPosition();
                }
            }
        }
        checkUi_writeButtonContainerY();
    }

    public int getCommentTextViewTop() {
        return this.commentTextViewLocation[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCaptionLimitBulletin(final BaseFragment baseFragment) {
        if ((baseFragment instanceof ChatActivity) && ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment).getCurrentChat())) {
            BulletinFactory.of(this.sizeNotifierFrameLayout, this.resourcesProvider).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda54
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.lambda$showCaptionLimitBulletin$39(baseFragment);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCaptionLimitBulletin$39(BaseFragment baseFragment) {
        dismiss(true);
        if (baseFragment != null) {
            baseFragment.presentFragment(new PremiumPreviewFragment("caption_limit"));
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
        }
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground)) > 0.699999988079071d;
    }

    public void onLongClickBotButton(final TLRPC.TL_attachMenuBot tL_attachMenuBot, final TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        Iterator<TLRPC.TL_attachMenuBot> it = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots.iterator();
        while (it.hasNext() && it.next().bot_id != user.id) {
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog.Builder title = new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.BotRemoveFromMenuTitle));
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        title.setMessage(AndroidUtilities.replaceTags(formatString)).setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda39
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                ChatAttachAlert.this.lambda$onLongClickBotButton$42(tL_attachMenuBot, user, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickBotButton$42(final TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, AlertDialog alertDialog, int i) {
        if (tL_attachMenuBot != null) {
            TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
            tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
            tL_messages_toggleBotInAttachMenu.enabled = false;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda69
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatAttachAlert.this.lambda$onLongClickBotButton$41(tL_attachMenuBot, tLObject, tL_error);
                }
            }, 66);
            return;
        }
        MediaDataController.getInstance(this.currentAccount).removeInline(user.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickBotButton$41(final TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda73
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlert.this.lambda$onLongClickBotButton$40(tL_attachMenuBot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClickBotButton$40(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        MediaDataController.getInstance(this.currentAccount).loadAttachMenuBots(false, true);
        if (this.currentAttachLayout == this.botAttachLayouts.get(tL_attachMenuBot.bot_id)) {
            showLayout(this.photoLayout);
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean shouldOverlayCameraViewOverNavBar() {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        return attachAlertLayout == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.cameraExpanded;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        super.show();
        this.buttonPressed = false;
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            this.calcMandatoryInsets = ((ChatActivity) baseFragment).isKeyboardVisible();
        }
        updateDoneItemEnabled();
        this.openTransitionFinished = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0);
            this.navBarColor = alphaComponent;
            AndroidUtilities.setNavigationBarColor((Dialog) this, alphaComponent, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
    }

    public void setEditingMessageObject(int i, MessageObject messageObject) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.photoLayout) != null) {
            chatAttachAlertPhotoLayout.clearSelectedPhotos();
        }
        if (this.editingMessageObject == messageObject && this.editType == i) {
            return;
        }
        this.editingMessageObject = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.editingMessageObject.isMusic()) {
                i = 2;
            } else {
                i = this.editingMessageObject.isDocument() ? 1 : 0;
            }
        }
        this.editType = i;
        if (this.editingMessageObject != null) {
            this.maxSelectedPhotos = 1;
            this.allowOrder = false;
        } else {
            this.maxSelectedPhotos = -1;
            this.allowOrder = true;
        }
        this.buttonsAdapter.notifyDataSetChanged();
        updateCountButton(0);
    }

    public MessageObject getEditingMessageObject() {
        return this.editingMessageObject;
    }

    protected void applyCaption() {
        if (getCommentView().length() <= 0) {
            return;
        }
        this.currentAttachLayout.applyCaption(getCommentView().getText());
    }

    private boolean sendPressed(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        if (this.buttonPressed) {
            return false;
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            TLRPC.Chat currentChat = chatActivity.getCurrentChat();
            if (chatActivity.getCurrentUser() != null || ((ChatObject.isChannel(currentChat) && currentChat.megagroup) || !ChatObject.isChannel(currentChat))) {
                MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivity.getDialogId(), !z).commit();
            }
        }
        if (checkCaption(getCommentView().getText())) {
            return true;
        }
        applyCaption();
        int i3 = this.currentAccount;
        long dialogId = getDialogId();
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        return AlertsCreator.ensurePaidMessageConfirmation(i3, dialogId, (attachAlertLayout != null ? attachAlertLayout.getSelectedItemsCount() : 1) + getAdditionalMessagesCount(), new Utilities.Callback() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda68
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatAttachAlert.this.lambda$sendPressed$43(z, i, i2, j, z2, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPressed$43(boolean z, int i, int i2, long j, boolean z2, Long l) {
        setButtonPressed(true);
        this.delegate.didPressedButton(7, true, z, i, i2, j, z2, false, l.longValue());
    }

    public void setButtonPressed(boolean z) {
        this.buttonPressed = z;
    }

    public void openAttachLayoutForType(int i) {
        int checkSelfPermission;
        int checkSelfPermission2;
        if (i == 3) {
            if (this.musicEnabled || !checkCanRemoveRestrictionsByBoosts()) {
                BaseFragment baseFragment = this.baseFragment;
                Activity parentActivity = baseFragment != null ? baseFragment.getParentActivity() : null;
                if (parentActivity != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 33) {
                        checkSelfPermission2 = parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO");
                        if (checkSelfPermission2 != 0) {
                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (i2 >= 23) {
                        checkSelfPermission = parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                        if (checkSelfPermission != 0) {
                            parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                    }
                }
                openAudioLayout(true);
                return;
            }
            return;
        }
        if (i == 6 && AndroidUtilities.isMapsInstalled(this.baseFragment)) {
            if (this.locationLayout == null) {
                AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), this.resourcesProvider, true ^ this.isPollAttach);
                this.locationLayout = chatAttachAlertLocationLayout;
                attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = this.locationActivityDelegate;
                if (locationActivityDelegate != null) {
                    chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                } else if (this.baseFragment instanceof ChatActivity) {
                    chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda74
                        @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
                        public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z, int i4, long j) {
                            ChatAttachAlert.this.lambda$openAttachLayoutForType$44(messageMedia, i3, z, i4, j);
                        }
                    });
                }
            }
            showLayout(this.locationLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAttachLayoutForType$44(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        ((ChatActivity) this.baseFragment).didSelectLocation(messageMedia, i, z, i2, j);
    }

    public void showLayout(AttachAlertLayout attachAlertLayout) {
        long j = this.selectedId;
        ChatAttachRestrictedLayout chatAttachRestrictedLayout = this.restrictedLayout;
        if (attachAlertLayout == chatAttachRestrictedLayout) {
            j = chatAttachRestrictedLayout.id;
        } else if (attachAlertLayout == this.photoLayout) {
            j = 1;
        } else if (attachAlertLayout == this.audioLayout) {
            j = 3;
        } else if (attachAlertLayout == this.documentLayout) {
            j = 4;
        } else if (attachAlertLayout == this.contactsLayout) {
            j = 5;
        } else if (attachAlertLayout == this.locationLayout) {
            j = 6;
        } else if (attachAlertLayout == this.pollLayout) {
            j = 9;
        } else if (attachAlertLayout == this.colorsLayout) {
            j = 10;
        } else if (attachAlertLayout == this.quickRepliesLayout) {
            j = 11;
        } else if (attachAlertLayout == this.todoLayout) {
            j = 12;
        } else if (attachAlertLayout == this.emojiLayout) {
            j = 14;
        } else if (attachAlertLayout == this.stickersLayout) {
            j = 13;
        } else if (attachAlertLayout == this.richLayout) {
            j = 16;
        }
        showLayout(attachAlertLayout, j);
    }

    private void showPollLayout(boolean z, Boolean bool) {
        if (this.pollLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(this, getContext(), false, this.resourcesProvider, bool);
            this.pollLayout = chatAttachAlertPollLayout;
            attachAlertLayoutArr[1] = chatAttachAlertPollLayout;
            chatAttachAlertPollLayout.setDelegate(new ChatAttachAlertPollLayout.PollCreateActivityDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda70
                @Override // org.telegram.ui.Components.ChatAttachAlertPollLayout.PollCreateActivityDelegate
                public final void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z2, int i, long j) {
                    ChatAttachAlert.this.lambda$showPollLayout$45(messageMedia, charSequence, pollAttachedMediaPack, arrayList, z2, i, j);
                }
            });
        }
        showLayout(this.pollLayout, 9L, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPollLayout$45(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i, long j) {
        ((ChatActivity) this.baseFragment).sendPoll((TLRPC.TL_messageMediaPoll) messageMedia, charSequence, pollAttachedMediaPack, arrayList, z, i, j);
    }

    public void setupPoll(Boolean bool) {
        this.typeButtonsAvailable = false;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        showPollLayout(false, bool);
    }

    private void showLayout(AttachAlertLayout attachAlertLayout, long j) {
        showLayout(attachAlertLayout, j, true);
    }

    private void showLayout(final AttachAlertLayout attachAlertLayout, long j, boolean z) {
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal;
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal2;
        int i = 0;
        if (this.viewChangeAnimator == null && this.commentsAnimator == null) {
            AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
            if (attachAlertLayout2 == attachAlertLayout) {
                attachAlertLayout2.scrollToTop();
                return;
            }
            if (attachAlertLayout == this.todoLayout && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                new PremiumFeatureBottomSheet(this.baseFragment, 39, false).show();
                return;
            }
            this.animatorToggleCaptionSupported.setValue(j == 1, z);
            this.animatorCurrentVisibleLayout.replace(Long.valueOf(j), z);
            this.botButtonWasVisible = false;
            this.botButtonProgressWasVisible = false;
            this.botMainButtonOffsetY = 0.0f;
            this.botMainButtonTextView.setVisibility(8);
            this.botProgressView.setAlpha(0.0f);
            this.botProgressView.setScaleX(0.1f);
            this.botProgressView.setScaleY(0.1f);
            this.botProgressView.setVisibility(8);
            this.buttonsRecyclerViewWrapper.setAlpha(1.0f);
            this.buttonsRecyclerViewWrapper.setTranslationY(this.botMainButtonOffsetY);
            for (int i2 = 0; i2 < this.botAttachLayouts.size(); i2++) {
                ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.valueAt(i2)).setMeasureOffsetY(0);
            }
            this.selectedId = j;
            int childCount = this.buttonsRecyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.buttonsRecyclerView.getChildAt(i3);
                if (childAt instanceof AttachButton) {
                    ((AttachButton) childAt).updateCheckedState(true);
                } else if (childAt instanceof AttachBotButton) {
                    ((AttachBotButton) childAt).updateCheckedState(true);
                }
            }
            int firstOffset = (this.currentAttachLayout.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.scrollOffsetY[0];
            this.nextAttachLayout = attachAlertLayout;
            boolean disableBottomFade = attachAlertLayout.disableBottomFade();
            ChatActivityFadeView chatActivityFadeView = this.fadeView;
            if (chatActivityFadeView != null) {
                chatActivityFadeView.setFadeHeightBottom(disableBottomFade ? 0 : AndroidUtilities.dp(48.0f));
            }
            View view = this.bottomFadeView;
            if (view != null) {
                view.setVisibility(disableBottomFade ? 4 : 0);
            }
            this.actionBar.setVisibility(this.nextAttachLayout.needsActionBar() != 0 ? 0 : 4);
            if (this.actionBar.isSearchFieldVisible()) {
                this.actionBar.closeSearchField();
            }
            this.currentAttachLayout.onHide();
            AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
            if (attachAlertLayout3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.nextAttachLayout.onShow(this.currentAttachLayout);
            this.nextAttachLayout.setVisibility(0);
            if (attachAlertLayout.getParent() != null) {
                this.containerView.removeView(this.nextAttachLayout);
            }
            int indexOfChild = this.containerView.indexOfChild(this.currentAttachLayout);
            ViewParent parent = this.nextAttachLayout.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                AttachAlertLayout attachAlertLayout4 = this.nextAttachLayout;
                if (attachAlertLayout4 != this.locationLayout) {
                    indexOfChild++;
                }
                viewGroup.addView(attachAlertLayout4, indexOfChild, LayoutHelper.createFrame(-1, -1.0f));
            }
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.lambda$showLayout$46();
                }
            };
            AttachAlertLayout attachAlertLayout5 = this.currentAttachLayout;
            if ((attachAlertLayout5 instanceof ChatAttachAlertPhotoLayoutPreview) || (this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                int max = Math.max(this.nextAttachLayout.getWidth(), this.currentAttachLayout.getWidth());
                AttachAlertLayout attachAlertLayout6 = this.nextAttachLayout;
                if (attachAlertLayout6 instanceof ChatAttachAlertPhotoLayoutPreview) {
                    attachAlertLayout6.setTranslationX(max);
                    AttachAlertLayout attachAlertLayout7 = this.currentAttachLayout;
                    if ((attachAlertLayout7 instanceof ChatAttachAlertPhotoLayout) && (cameraViewInternal2 = ((ChatAttachAlertPhotoLayout) attachAlertLayout7).cameraView) != null) {
                        cameraViewInternal2.setVisibility(4);
                    }
                } else {
                    this.currentAttachLayout.setTranslationX(-max);
                    AttachAlertLayout attachAlertLayout8 = this.nextAttachLayout;
                    if (attachAlertLayout8 == this.photoLayout && (cameraViewInternal = ((ChatAttachAlertPhotoLayout) attachAlertLayout8).cameraView) != null) {
                        cameraViewInternal.setVisibility(0);
                    }
                }
                this.nextAttachLayout.setAlpha(1.0f);
                this.currentAttachLayout.setAlpha(1.0f);
                if (z) {
                    this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(0.0f));
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatAttachAlert.this.lambda$showLayout$49(attachAlertLayout, runnable);
                        }
                    });
                } else {
                    boolean z2 = this.nextAttachLayout.getCurrentItemTop() <= attachAlertLayout.getButtonsHideOffset();
                    this.currentAttachLayout.onHideShowProgress(1.0f);
                    this.nextAttachLayout.onHideShowProgress(1.0f);
                    this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
                    this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
                    this.containerView.invalidate();
                    this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(1.0f));
                    this.actionBar.setTag(z2 ? 1 : null);
                    runnable.run();
                }
            } else if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.nextAttachLayout.setAlpha(0.0f);
                this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.currentAttachLayout, (Property<AttachAlertLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.currentAttachLayout, (Property<AttachAlertLayout, Float>) this.ATTACH_ALERT_LAYOUT_TRANSLATION, 0.0f, 1.0f);
                ActionBar actionBar = this.actionBar;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) View.ALPHA, actionBar.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.addListener(new 27(firstOffset, runnable));
                this.viewChangeAnimator = animatorSet;
                this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(0.0f));
                animatorSet.start();
            } else {
                attachAlertLayout5.setAlpha(0.0f);
                runnable.run();
                updateSelectedPosition(0);
                this.containerView.invalidate();
            }
            if (this.actionBar != null) {
                if (j == 1 || j == 6) {
                    i = AndroidUtilities.dp(46.0f);
                } else if (j == 4) {
                    i = AndroidUtilities.dp(84.0f);
                }
                this.actionBar.setForcedMenuWidth(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLayout$46() {
        AttachAlertLayout attachAlertLayout;
        ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview;
        this.viewChangeAnimator = null;
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        if (attachAlertLayout2 != this.photoLayout && (attachAlertLayout = this.nextAttachLayout) != (chatAttachAlertPhotoLayoutPreview = this.photoPreviewLayout) && attachAlertLayout2 != attachAlertLayout && attachAlertLayout2 != chatAttachAlertPhotoLayoutPreview) {
            this.containerView.removeView(attachAlertLayout2);
        }
        this.currentAttachLayout.setVisibility(8);
        this.currentAttachLayout.onHidden();
        this.nextAttachLayout.onShown();
        this.currentAttachLayout = this.nextAttachLayout;
        this.nextAttachLayout = null;
        int[] iArr = this.scrollOffsetY;
        iArr[0] = iArr[1];
        setCaptionAbove(this.captionAbove, false);
        updateDoneItemEnabled();
    }

    class 27 extends AnimatorListenerAdapter {
        final /* synthetic */ Runnable val$onEnd;
        final /* synthetic */ int val$t;

        27(int i, Runnable runnable) {
            this.val$t = i;
            this.val$onEnd = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ChatAttachAlert.this.currentAttachLayout.setAlpha(0.0f);
            ChatAttachAlert.this.currentAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) + this.val$t);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.ATTACH_ALERT_LAYOUT_TRANSLATION.set(chatAttachAlert.currentAttachLayout, Float.valueOf(1.0f));
            ChatAttachAlert.this.actionBar.setAlpha(0.0f);
            SpringAnimation springAnimation = new SpringAnimation(ChatAttachAlert.this.nextAttachLayout, DynamicAnimation.TRANSLATION_Y, 0.0f);
            springAnimation.getSpring().setDampingRatio(0.75f);
            springAnimation.getSpring().setStiffness(500.0f);
            springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$27$$ExternalSyntheticLambda0
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    ChatAttachAlert.27.this.lambda$onAnimationEnd$0(dynamicAnimation, f, f2);
                }
            });
            final Runnable runnable = this.val$onEnd;
            springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$27$$ExternalSyntheticLambda1
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    ChatAttachAlert.27.this.lambda$onAnimationEnd$1(runnable, dynamicAnimation, z, f, f2);
                }
            });
            ChatAttachAlert.this.viewChangeAnimator = springAnimation;
            springAnimation.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        
            if (r1.viewChangeAnimator != null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$onAnimationEnd$0(DynamicAnimation dynamicAnimation, float f, float f2) {
            if (ChatAttachAlert.this.nextAttachLayout != ChatAttachAlert.this.pollLayout && ChatAttachAlert.this.nextAttachLayout != ChatAttachAlert.this.todoLayout) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.isPhotoPicker) {
                }
                ChatAttachAlert.this.nextAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }
            ChatAttachAlert.this.updateSelectedPosition(1);
            ChatAttachAlert.this.nextAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAnimationEnd$1(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ChatAttachAlert.this.nextAttachLayout.setTranslationY(0.0f);
            ChatAttachAlert.this.nextAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            runnable.run();
            ChatAttachAlert.this.updateSelectedPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLayout$49(AttachAlertLayout attachAlertLayout, final Runnable runnable) {
        final boolean z = this.nextAttachLayout.getCurrentItemTop() <= attachAlertLayout.getButtonsHideOffset();
        final float alpha = this.actionBar.getAlpha();
        final float f = z ? 1.0f : 0.0f;
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda57
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                ChatAttachAlert.this.lambda$showLayout$47(alpha, f, z, dynamicAnimation, f2, f3);
            }
        });
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda58
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
                ChatAttachAlert.this.lambda$showLayout$48(z, runnable, dynamicAnimation, z2, f2, f3);
            }
        });
        springAnimation.setSpring(new SpringForce(500.0f));
        springAnimation.getSpring().setDampingRatio(1.0f);
        springAnimation.getSpring().setStiffness(1000.0f);
        springAnimation.start();
        this.viewChangeAnimator = springAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLayout$47(float f, float f2, boolean z, DynamicAnimation dynamicAnimation, float f3, float f4) {
        float f5 = f3 / 500.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(f5));
        this.actionBar.setAlpha(AndroidUtilities.lerp(f, f2, f5));
        updateLayout(this.currentAttachLayout, false, 0);
        updateLayout(this.nextAttachLayout, false, 0);
        if (!(this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || z) {
            f5 = 1.0f - f5;
        }
        float clamp = Utilities.clamp(f5, 1.0f, 0.0f);
        this.mediaPreviewView.setAlpha(clamp);
        float f6 = 1.0f - clamp;
        this.selectedView.setAlpha(f6);
        this.selectedView.setTranslationX(clamp * (-AndroidUtilities.dp(16.0f)));
        this.mediaPreviewView.setTranslationX(f6 * AndroidUtilities.dp(16.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLayout$48(boolean z, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        this.currentAttachLayout.onHideShowProgress(1.0f);
        this.nextAttachLayout.onHideShowProgress(1.0f);
        this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.containerView.invalidate();
        this.actionBar.setTag(z ? 1 : null);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCurrentLayoutAnimatorChanged(ReplaceAnimator replaceAnimator) {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int shadowDrawableColor = getShadowDrawableColor();
        Theme.setDrawableColor(this.shadowDrawable, shadowDrawableColor);
        checkColorSourceColor(shadowDrawableColor);
        updateDoneItemEnabled();
        this.containerView.invalidate();
    }

    private void checkColorSourceColor(int i) {
        if (this.iBlur3SourceColor.getColor() != i) {
            this.iBlur3SourceColor.setColor(i);
            ChatActivityFadeView chatActivityFadeView = this.fadeView;
            if (chatActivityFadeView != null) {
                chatActivityFadeView.invalidate();
            }
            View view = this.bottomFadeView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    private int getShadowDrawableColor() {
        return getShadowDrawableColor(false);
    }

    private int getShadowDrawableColor(boolean z) {
        ActionBar actionBar;
        if (this.forceDarkTheme) {
            return getThemedColor(Theme.key_voipgroup_listViewBackground);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean isDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        Iterator it = this.animatorCurrentVisibleLayout.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            ListAnimator.Entry entry = (ListAnimator.Entry) it.next();
            long longValue = ((Long) entry.item).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f += entry.getVisibility();
            }
        }
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (z && (actionBar = this.actionBar) != null && actionBar.getVisibility() == 0) {
            clamp *= 1.0f - this.actionBar.getAlpha();
        }
        return ColorUtils.blendARGB(getThemedColor(Theme.key_dialogBackground), getThemedColor(isDark ? Theme.key_windowBackgroundGray : Theme.key_dialogBackgroundGray), clamp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getActionBarDrawableColor() {
        return getShadowDrawableColor(true);
    }

    public AttachAlertLayout getCurrentAttachLayout() {
        return this.currentAttachLayout;
    }

    public ChatAttachAlertPhotoLayoutPreview getPhotoPreviewLayout() {
        return this.photoPreviewLayout;
    }

    public void updatePhotoPreview(boolean z) {
        if (z) {
            if (this.canOpenPreview) {
                if (this.photoPreviewLayout == null) {
                    Context context = getContext();
                    Theme.ResourcesProvider resourcesProvider = this.parentThemeDelegate;
                    if (resourcesProvider == null) {
                        resourcesProvider = this.resourcesProvider;
                    }
                    ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = new ChatAttachAlertPhotoLayoutPreview(this, context, resourcesProvider);
                    this.photoPreviewLayout = chatAttachAlertPhotoLayoutPreview;
                    chatAttachAlertPhotoLayoutPreview.bringToFront();
                }
                AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
                AttachAlertLayout attachAlertLayout2 = this.photoPreviewLayout;
                if (attachAlertLayout == attachAlertLayout2) {
                    attachAlertLayout2 = this.photoLayout;
                }
                showLayout(attachAlertLayout2);
                return;
            }
            return;
        }
        showLayout(this.photoLayout);
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout;
        if (i == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            openContactsLayout();
        } else if (i == 30 && (chatAttachAlertLocationLayout = this.locationLayout) != null && this.currentAttachLayout == chatAttachAlertLocationLayout && isShowing()) {
            this.locationLayout.openShareLiveLocation();
        }
    }

    private void openContactsLayout() {
        if (!this.plainTextEnabled) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(5, this, getContext(), this.resourcesProvider);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        if (this.contactsLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = new ChatAttachAlertContactsLayout(this, getContext(), this.resourcesProvider);
            this.contactsLayout = chatAttachAlertContactsLayout;
            attachAlertLayoutArr[2] = chatAttachAlertContactsLayout;
            chatAttachAlertContactsLayout.setupBlurredSearchField(this.iBlur3FactoryLiquidGlass);
            this.contactsLayout.setDelegate(new ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert.28
                @Override // org.telegram.ui.Components.ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate
                public void didSelectContact(TLRPC.User user, boolean z, int i, long j, boolean z2, long j2) {
                    ((ChatActivity) ChatAttachAlert.this.baseFragment).sendContact(user, z, i, j, z2, j2);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate
                public void didSelectContacts(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2, long j2) {
                    ((ChatActivity) ChatAttachAlert.this.baseFragment).sendContacts(arrayList, str, z, i, j, z2, 0L);
                }
            });
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC.Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
            this.contactsLayout.setMultipleSelectionAllowed(currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled);
        }
        showLayout(this.contactsLayout);
    }

    private void openQuickRepliesLayout() {
        if (this.quickRepliesLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = new ChatAttachAlertQuickRepliesLayout(this, getContext(), this.resourcesProvider);
            this.quickRepliesLayout = chatAttachAlertQuickRepliesLayout;
            attachAlertLayoutArr[7] = chatAttachAlertQuickRepliesLayout;
            chatAttachAlertQuickRepliesLayout.setupBlurredSearchField(this.iBlur3FactoryLiquidGlass);
        }
        showLayout(this.quickRepliesLayout);
    }

    public boolean checkCanRemoveRestrictionsByBoosts() {
        BaseFragment baseFragment = this.baseFragment;
        return (baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).checkCanRemoveRestrictionsByBoosts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openAudioLayout(boolean z) {
        if (!this.musicEnabled && z) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(3, this, getContext(), this.resourcesProvider);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        int i = 1;
        if (this.audioLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = new ChatAttachAlertAudioLayout(this, getContext(), this.resourcesProvider);
            this.audioLayout = chatAttachAlertAudioLayout;
            attachAlertLayoutArr[3] = chatAttachAlertAudioLayout;
            chatAttachAlertAudioLayout.setupBlurredSearchField(this.iBlur3FactoryLiquidGlass);
            this.audioLayout.setDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda61
                @Override // org.telegram.ui.Components.ChatAttachAlertAudioLayout.AudioSelectDelegate
                public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i2, int i3, long j, boolean z3, long j2) {
                    ChatAttachAlert.this.lambda$openAudioLayout$50(arrayList, charSequence, z2, i2, i3, j, z3, j2);
                }
            });
            if (this.isPollAttach) {
                this.audioLayout.setMaxSelectedFiles(1);
            }
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC.Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
            ChatAttachAlertAudioLayout chatAttachAlertAudioLayout2 = this.audioLayout;
            if ((currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled) && this.editingMessageObject == null) {
                i = -1;
            }
            chatAttachAlertAudioLayout2.setMaxSelectedFiles(i);
        }
        if (z) {
            showLayout(this.audioLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAudioLayout$50(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate = this.audioSelectDelegate;
        if (audioSelectDelegate != null) {
            audioSelectDelegate.didSelectAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
            return;
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null && (baseFragment instanceof ChatActivity)) {
            ((ChatActivity) baseFragment).sendAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
            return;
        }
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.sendAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
        }
    }

    public void openColorsLayout() {
        if (this.colorsLayout == null) {
            ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = new ChatAttachAlertColorsLayout(this, getContext(), this.resourcesProvider);
            this.colorsLayout = chatAttachAlertColorsLayout;
            chatAttachAlertColorsLayout.setDelegate(new androidx.core.util.Consumer() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda75
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ChatAttachAlert.this.lambda$openColorsLayout$51(obj);
                }
            });
        }
        showLayout(this.colorsLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openColorsLayout$51(Object obj) {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.onWallpaperSelected(obj);
        }
    }

    private void openDocumentsLayout(boolean z) {
        if (!this.documentsEnabled && z) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(4, this, getContext(), this.resourcesProvider);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        boolean z2 = false;
        if (this.documentLayout == null) {
            int i = this.isSoundPicker ? 2 : 0;
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = new ChatAttachAlertDocumentLayout(this, getContext(), i, this.resourcesProvider);
            this.documentLayout = chatAttachAlertDocumentLayout;
            attachAlertLayoutArr[4] = chatAttachAlertDocumentLayout;
            chatAttachAlertDocumentLayout.setDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert.29
                @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
                public void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z3, int i2, int i3, long j, boolean z4, long j2) {
                    if (ChatAttachAlert.this.documentsDelegate != null) {
                        ChatAttachAlert.this.documentsDelegate.didSelectFiles(arrayList, str, arrayList2, arrayList3, z3, i2, i3, j, z4, j2);
                        return;
                    }
                    Object obj = ChatAttachAlert.this.baseFragment;
                    if (obj instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) obj).didSelectFiles(arrayList, str, arrayList2, arrayList3, z3, i2, i3, j, z4, j2);
                    } else if (obj instanceof PassportActivity) {
                        ((PassportActivity) obj).didSelectFiles(arrayList, str, z3, i2, j, z4);
                    }
                }

                @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
                public void didSelectPhotos(ArrayList arrayList, boolean z3, int i2, int i3, long j) {
                    if (ChatAttachAlert.this.documentsDelegate != null) {
                        ChatAttachAlert.this.documentsDelegate.didSelectPhotos(arrayList, z3, i2, i3, j);
                        return;
                    }
                    BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).didSelectPhotos(arrayList, z3, i2, i3, j);
                    } else if (baseFragment instanceof PassportActivity) {
                        ((PassportActivity) baseFragment).didSelectPhotos(arrayList, z3, i2);
                    }
                }

                @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
                public void startDocumentSelectActivity() {
                    if (ChatAttachAlert.this.documentsDelegate != null) {
                        ChatAttachAlert.this.documentsDelegate.startDocumentSelectActivity();
                        return;
                    }
                    Object obj = ChatAttachAlert.this.baseFragment;
                    if (obj instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) obj).startDocumentSelectActivity();
                    } else if (obj instanceof PassportActivity) {
                        ((PassportActivity) obj).startDocumentSelectActivity();
                    }
                }

                @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
                public void startMusicSelectActivity() {
                    ChatAttachAlert.this.openAudioLayout(true);
                }
            });
        }
        int i2 = 1;
        if (this.isPollAttach) {
            this.documentLayout.setMaxSelectedFiles(1);
        } else {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                TLRPC.Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout2 = this.documentLayout;
                if ((currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled) && this.editingMessageObject == null) {
                    i2 = -1;
                }
                chatAttachAlertDocumentLayout2.setMaxSelectedFiles(i2);
            } else {
                this.documentLayout.setMaxSelectedFiles(this.maxSelectedPhotos);
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout3 = this.documentLayout;
                if (!this.isSoundPicker && !this.allowEnterCaption) {
                    z2 = true;
                }
                chatAttachAlertDocumentLayout3.setCanSelectOnlyImageFiles(z2);
            }
        }
        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout4 = this.documentLayout;
        chatAttachAlertDocumentLayout4.isSoundPicker = this.isSoundPicker;
        if (z) {
            showLayout(chatAttachAlertDocumentLayout4);
        }
    }

    public boolean showSendButtonOnly(final boolean z, boolean z2) {
        AttachAlertLayout attachAlertLayout;
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.commentsAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (z) {
            this.writeButtonContainer.setVisibility(0);
        } else if (this.typeButtonsAvailable) {
            this.buttonsRecyclerViewWrapper.setVisibility(0);
        }
        if (z2) {
            this.commentsAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            FrameLayout frameLayout = this.writeButtonContainer;
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.2f));
            FrameLayout frameLayout2 = this.writeButtonContainer;
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, z ? 1.0f : 0.2f));
            FrameLayout frameLayout3 = this.writeButtonContainer;
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButton, (Property<ChatActivityEnterView.SendButton, Float>) property, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButton, (Property<ChatActivityEnterView.SendButton, Float>) property2, z ? 1.0f : 0.2f));
            if (this.typeButtonsAvailable) {
                arrayList.add(ObjectAnimator.ofFloat(this.buttonsRecyclerViewWrapper, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.buttonsRecyclerViewWrapper, (Property<FrameLayout, Float>) property3, z ? 0.0f : 1.0f));
            }
            this.commentsAnimator.playTogether(arrayList);
            this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
            this.commentsAnimator.setDuration(180L);
            this.commentsAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.30
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        if (!z) {
                            ChatAttachAlert.this.writeButtonContainer.setVisibility(4);
                        } else {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable && (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons())) {
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(4);
                            }
                        }
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }
            });
            this.commentsAnimator.start();
        } else {
            this.writeButtonContainer.setScaleX(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setScaleY(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setAlpha(z ? 1.0f : 0.0f);
            this.writeButton.setScaleX(z ? 1.0f : 0.2f);
            this.writeButton.setScaleY(z ? 1.0f : 0.2f);
            if (this.typeButtonsAvailable) {
                this.buttonsRecyclerViewWrapper.setTranslationY(z ? AndroidUtilities.dp(36.0f) : 0.0f);
                this.buttonsRecyclerViewWrapper.setAlpha(z ? 0.0f : 1.0f);
                if (z && ((attachAlertLayout = this.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
                    this.buttonsRecyclerViewWrapper.setVisibility(4);
                }
            }
            if (!z) {
                this.writeButtonContainer.setVisibility(4);
            }
        }
        this.writeButton.setCount(0, z2);
        return true;
    }

    private boolean showCommentTextView(final boolean z, boolean z2) {
        AttachAlertLayout attachAlertLayout;
        this.animatorCaptionVisible.setValue(z, true);
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.commentsAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        this.topCommentTextView.hidePopup(true);
        if (z) {
            if (!this.isSoundPicker) {
                this.frameLayout2.setVisibility(0);
            }
            this.writeButtonContainer.setVisibility(0);
        } else if (this.typeButtonsAvailable) {
            this.buttonsRecyclerViewWrapper.setVisibility(0);
        }
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        final boolean z3 = (attachAlertLayout2 == this.photoLayout || attachAlertLayout2 == this.photoPreviewLayout) && this.captionAbove;
        if (z2) {
            this.commentsAnimator = new AnimatorSet();
            if (z3) {
                this.topCommentContainer.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            FrameLayout frameLayout = this.frameLayout2;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.captionContainer, (Property<FrameLayout, Float>) property, (!z || z3) ? 0.0f : 1.0f));
            if (z && !z3) {
                this.captionContainer.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.captionContainer, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.topCommentContainer, (Property<FrameLayout, Float>) property, (z && z3) ? 1.0f : 0.0f));
            FrameLayout frameLayout2 = this.writeButtonContainer;
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, z ? 1.0f : 0.2f));
            FrameLayout frameLayout3 = this.writeButtonContainer;
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButton, (Property<ChatActivityEnterView.SendButton, Float>) property2, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButton, (Property<ChatActivityEnterView.SendButton, Float>) property3, z ? 1.0f : 0.2f));
            if (this.actionBar.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(this.frameLayout2, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.typeButtonsAvailable) {
                arrayList.add(ObjectAnimator.ofFloat(this.buttonsRecyclerViewWrapper, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.buttonsRecyclerViewWrapper, (Property<FrameLayout, Float>) property, z ? 0.0f : 1.0f));
            }
            if (z3) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatAttachAlert.this.lambda$showCommentTextView$52(valueAnimator);
                    }
                });
                arrayList.add(ofFloat);
            }
            this.commentsAnimator.playTogether(arrayList);
            this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
            this.commentsAnimator.setDuration(180L);
            this.commentsAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.31
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        if (!z) {
                            if (!ChatAttachAlert.this.isSoundPicker) {
                                ChatAttachAlert.this.frameLayout2.setVisibility(4);
                            }
                            ChatAttachAlert.this.writeButtonContainer.setVisibility(4);
                        } else {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable && (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons())) {
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(4);
                            }
                        }
                        if (z3) {
                            ChatAttachAlert.this.updatedTopCaptionHeight();
                            ChatAttachAlert.this.topCommentContainer.setVisibility(z ? 0 : 8);
                        }
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }
            });
            this.commentsAnimator.start();
        } else {
            this.frameLayout2.setAlpha(z ? 1.0f : 0.0f);
            this.captionContainer.setAlpha((z && z3) ? 1.0f : 0.0f);
            if (z && !z3) {
                this.captionContainer.setVisibility(0);
                this.captionContainer.setTranslationY(0.0f);
            }
            this.writeButtonContainer.setScaleX(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setScaleY(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setAlpha(z ? 1.0f : 0.0f);
            this.topCommentContainer.setVisibility((z && z3) ? 0 : 8);
            this.topCommentContainer.setAlpha((z && z3) ? 1.0f : 0.0f);
            this.writeButton.setScaleX(z ? 1.0f : 0.2f);
            this.writeButton.setScaleY(z ? 1.0f : 0.2f);
            if (this.actionBar.getTag() != null) {
                this.frameLayout2.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.typeButtonsAvailable && ((attachAlertLayout = this.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
                this.buttonsRecyclerViewWrapper.setTranslationY(z ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z) {
                this.frameLayout2.setVisibility(4);
                this.writeButtonContainer.setVisibility(4);
            }
            if (z3) {
                updatedTopCaptionHeight();
            }
        }
        this.writeButton.setCount(z ? Math.max(1, this.currentAttachLayout.getSelectedItemsCount()) : 0, z2);
        this.writeButton.setStarsPrice(this.editingMessageObject != null ? 0L : MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(getDialogId()), this.currentAttachLayout.getSelectedItemsCount() + getAdditionalMessagesCount());
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextEmoji.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), this.writeButton.width());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                this.commentTextView.setLayoutParams(marginLayoutParams);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCommentTextView$52(ValueAnimator valueAnimator) {
        updatedTopCaptionHeight();
    }

    public int getAdditionalMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        BaseFragment baseFragment = this.baseFragment;
        if (!(baseFragment instanceof ChatActivity) || (messagePreviewParams = ((ChatActivity) baseFragment).messagePreviewParams) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            SpringAnimation springAnimation = this.appearSpringAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            AnimatorSet animatorSet2 = this.buttonsAnimation;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean onCustomOpenAnimation() {
        this.photoLayout.setTranslationX(0.0f);
        this.mediaPreviewView.setAlpha(0.0f);
        this.selectedView.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.buttonsAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ChatAttachAlert, Float>) this.ATTACH_ALERT_PROGRESS, 0.0f, 400.0f));
        this.buttonsAnimation.setDuration(400L);
        this.buttonsAnimation.setStartDelay(20L);
        this.ATTACH_ALERT_PROGRESS.set(this, Float.valueOf(0.0f));
        this.buttonsAnimation.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$53(valueAnimator2);
            }
        });
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        if (this.editingMessageObject != null) {
            springAnimation2.getSpring().setDampingRatio(0.75f);
            this.appearSpringAnimation.getSpring().setStiffness(350.0f);
        } else {
            springAnimation2.getSpring().setDampingRatio(0.75f);
            this.appearSpringAnimation.getSpring().setStiffness(350.0f);
        }
        this.appearSpringAnimation.start();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, (Property<BottomSheet.SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        final BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface = super.delegate;
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$54(animationNotificationsLocker, bottomSheetDelegateInterface);
            }
        };
        this.appearSpringAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda12
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$55(runnable, dynamicAnimation, z, f, f2);
            }
        });
        this.currentSheetAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.33
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimation == null || !((BottomSheet) ChatAttachAlert.this).currentSheetAnimation.equals(animator) || ChatAttachAlert.this.appearSpringAnimation == null || ChatAttachAlert.this.appearSpringAnimation.isRunning()) {
                    return;
                }
                runnable.run();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimation == null || !((BottomSheet) ChatAttachAlert.this).currentSheetAnimation.equals(animator)) {
                    return;
                }
                ((BottomSheet) ChatAttachAlert.this).currentSheetAnimation = null;
                ((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType = 0;
            }
        });
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        setNavBarAlpha(0.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda13
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$56(valueAnimator2);
            }
        });
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
        ofFloat2.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomOpenAnimation$53(ValueAnimator valueAnimator) {
        this.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BottomSheet.ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomOpenAnimation$54(AnimationNotificationsLocker animationNotificationsLocker, BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface) {
        this.currentSheetAnimation = null;
        this.appearSpringAnimation = null;
        animationNotificationsLocker.unlock();
        this.currentSheetAnimationType = 0;
        if (bottomSheetDelegateInterface != null) {
            bottomSheetDelegateInterface.onOpenAnimationEnd();
        }
        if (this.useHardwareLayer) {
            this.container.setLayerType(0, null);
        }
        if (this.isFullscreen) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags &= -1025;
            getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomOpenAnimation$55(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomOpenAnimation$56(ValueAnimator valueAnimator) {
        setNavBarAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setNavBarAlpha(float f) {
        int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), Math.min(NotificationCenter.didReceiveSmsCode, Math.max(0, (int) (f * 255.0f))));
        this.navBarColor = alphaComponent;
        AndroidUtilities.setNavigationBarColor((Dialog) this, alphaComponent, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.currentAttachLayout.onContainerViewTouchEvent(motionEvent);
    }

    public void makeFocusable(final EditTextBoldCursor editTextBoldCursor, final boolean z) {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate == null || this.enterCommentEventSent) {
            return;
        }
        boolean needEnterComment = chatAttachViewDelegate.needEnterComment();
        this.enterCommentEventSent = true;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlert.this.lambda$makeFocusable$58(editTextBoldCursor, z);
            }
        }, needEnterComment ? 200L : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeFocusable$58(final EditTextBoldCursor editTextBoldCursor, boolean z) {
        setFocusable(true);
        editTextBoldCursor.requestFocus();
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda62
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyAttachButtonColors(View view) {
        if (view instanceof AttachButton) {
            return;
        }
        boolean z = view instanceof AttachBotButton;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public ArrayList getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
                if (attachAlertLayout != null && (themeDescriptions = attachAlertLayout.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i++;
            } else {
                arrayList.add(new ThemeDescription(this.container, 0, null, null, null, null, Theme.key_dialogBackgroundGray));
                return arrayList;
            }
        }
    }

    public void checkColors() {
        RecyclerListView recyclerListView = this.buttonsRecyclerView;
        if (recyclerListView == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            applyAttachButtonColors(this.buttonsRecyclerView.getChildAt(i));
        }
        this.selectedTextView.setTextColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        this.mediaPreviewTextView.setTextColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        this.doneItem.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        this.selectedMenuItem.setIconColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        Theme.setDrawableColor(this.selectedMenuItem.getBackground(), getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector));
        ActionBarMenuItem actionBarMenuItem = this.selectedMenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        actionBarMenuItem.setPopupItemsColor(getThemedColor(i2), false);
        this.selectedMenuItem.setPopupItemsColor(getThemedColor(i2), true);
        this.selectedMenuItem.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        ActionBarMenuItem actionBarMenuItem2 = this.motionItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setIconColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        }
        ActionBarMenuItem actionBarMenuItem3 = this.searchItem;
        if (actionBarMenuItem3 != null) {
            actionBarMenuItem3.setIconColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
            Theme.setDrawableColor(this.searchItem.getBackground(), getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector));
        }
        this.commentTextView.updateColors();
        this.buttonsRecyclerView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.actionBar.setItemsColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), false);
        this.actionBar.setTitleColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        int shadowDrawableColor = getShadowDrawableColor();
        Theme.setDrawableColor(this.shadowDrawable, shadowDrawableColor);
        checkColorSourceColor(shadowDrawableColor);
        this.containerView.invalidate();
        int i3 = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i3 >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i3];
            if (attachAlertLayout != null) {
                attachAlertLayout.checkColors();
            }
            i3++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(Theme.key_dialogBackgroundGray);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(Theme.key_dialogBackground), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
            return;
        }
        fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean onCustomMeasure(View view, int i, int i2) {
        return this.photoLayout.onCustomMeasure(view, i, i2);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        return this.photoLayout.onCustomLayout(view, i, i2, i3, i4);
    }

    public void onPause() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
                if (attachAlertLayout != null) {
                    attachAlertLayout.onPause();
                }
                i++;
            } else {
                this.paused = true;
                return;
            }
        }
    }

    public void onResume() {
        int i = 0;
        this.paused = false;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onResume();
            }
            i++;
        }
        if (isShowing()) {
            this.delegate.needEnterComment();
        }
        ButtonsAdapter buttonsAdapter = this.buttonsAdapter;
        if (buttonsAdapter != null) {
            buttonsAdapter.notifyDataSetChanged();
        }
    }

    public void onActivityResultFragment(int i, Intent intent, String str) {
        this.photoLayout.onActivityResultFragment(i, intent, str);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.reloadInlineHints || i == NotificationCenter.attachMenuBotsDidLoad || i == NotificationCenter.quickRepliesUpdated) {
            ButtonsAdapter buttonsAdapter = this.buttonsAdapter;
            if (buttonsAdapter != null) {
                buttonsAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollOffsetY(int i) {
        AttachAlertLayout attachAlertLayout = this.nextAttachLayout;
        if (attachAlertLayout != null && ((this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview))) {
            int[] iArr = this.scrollOffsetY;
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.translationProgress);
        }
        return this.scrollOffsetY[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateSelectedPosition(int i) {
        int i2;
        float f;
        ActionBarMenuItem actionBarMenuItem;
        float f2;
        float f3;
        float f4;
        float max;
        int i3;
        float floatValue = this.animatorActionBarVisible.getFloatValue();
        AttachAlertLayout attachAlertLayout = i == 0 ? this.currentAttachLayout : this.nextAttachLayout;
        if (attachAlertLayout == null || attachAlertLayout.getVisibility() != 0) {
            return;
        }
        int scrollOffsetY = getScrollOffsetY(i);
        if (attachAlertLayout == this.pollLayout || attachAlertLayout == this.todoLayout) {
            AndroidUtilities.dp(13.0f);
            AndroidUtilities.dp(11.0f);
        } else {
            AndroidUtilities.dp(39.0f);
            AndroidUtilities.dp(43.0f);
        }
        ActionBar.getCurrentActionBarHeight();
        float f5 = 1.0f;
        float f6 = 1.0f - floatValue;
        this.cornerRadius = f6;
        if (AndroidUtilities.isTablet()) {
            i2 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i2 = point.x > point.y ? 6 : 12;
        }
        float dp = this.actionBar.getAlpha() != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - this.headerView.getAlpha()) * 26.0f);
        if (this.menuShowed && this.avatarPicker == 0 && !this.storyMediaPicker) {
            this.selectedMenuItem.setTranslationY(Math.max((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i2 + 37), ((scrollOffsetY - AndroidUtilities.dp((i2 * floatValue) + 37.0f)) + dp) - (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha())) + this.currentPanTranslationY);
        } else {
            this.selectedMenuItem.setTranslationY(((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i2 + 37)) + this.currentPanTranslationY);
        }
        ActionBarMenuItem actionBarMenuItem2 = this.motionItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setTranslationY(this.selectedMenuItem.getTranslationY());
        }
        HintView2 hintView2 = this.motionHint;
        if (hintView2 != null) {
            hintView2.setTranslationY(this.selectedMenuItem.getTranslationY());
        }
        if (this.isPhotoPicker && this.openTransitionFinished) {
            AttachAlertLayout attachAlertLayout2 = this.nextAttachLayout;
            if (attachAlertLayout2 != null && this.currentAttachLayout != null) {
                f = Math.min(attachAlertLayout2.getTranslationY(), this.currentAttachLayout.getTranslationY());
            } else if (attachAlertLayout2 != null) {
                f = attachAlertLayout2.getTranslationY();
            }
            actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setTranslationY(((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i2 + 37)) + this.currentPanTranslationY);
            }
            float dp2 = ((((scrollOffsetY - AndroidUtilities.dp((i2 * floatValue) + 25.0f)) + dp) + this.currentPanTranslationY) + f) - (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha());
            this.baseSelectedTextViewTranslationY = dp2;
            this.headerView.setTranslationY(Math.max(this.currentPanTranslationY, dp2));
            this.topCommentContainer.setTranslationY(Math.max(ActionBar.getCurrentActionBarHeight() + this.currentPanTranslationY, this.baseSelectedTextViewTranslationY + (AndroidUtilities.dp(26.0f) * this.headerView.getAlpha()) + AndroidUtilities.dp(8.0f)));
            if (this.captionAbove) {
                updateCommentTextViewPosition();
            }
            checkUi_writeButtonContainerY();
            int i4 = 59;
            if (this.pollLayout != null) {
                if (AndroidUtilities.isTablet()) {
                    i3 = 63;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    i3 = point2.x > point2.y ? 53 : 59;
                }
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
                if (chatAttachAlertPollLayout == this.nextAttachLayout) {
                    f3 = (chatAttachAlertPollLayout.getTranslationY() + getScrollOffsetY(1)) - AndroidUtilities.dp(((i3 * floatValue) + 7.0f) - (f6 * 12.0f));
                    f2 = this.translationProgress;
                } else if (chatAttachAlertPollLayout == this.currentAttachLayout) {
                    f3 = (chatAttachAlertPollLayout.getTranslationY() + getScrollOffsetY(0)) - AndroidUtilities.dp(((i3 * floatValue) + 7.0f) - (f6 * 12.0f));
                    f2 = this.nextAttachLayout == null ? 1.0f : 1.0f - this.translationProgress;
                }
                if (this.todoLayout != null) {
                    if (AndroidUtilities.isTablet()) {
                        i4 = 63;
                    } else {
                        Point point3 = AndroidUtilities.displaySize;
                        if (point3.x > point3.y) {
                            i4 = 53;
                        }
                    }
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
                    if (chatAttachAlertPollLayout2 == this.nextAttachLayout) {
                        float translationY = (chatAttachAlertPollLayout2.getTranslationY() + getScrollOffsetY(1)) - AndroidUtilities.dp(((i4 * floatValue) + 7.0f) - (f6 * 12.0f));
                        f5 = this.translationProgress;
                        f4 = translationY;
                    } else if (chatAttachAlertPollLayout2 == this.currentAttachLayout) {
                        f4 = (chatAttachAlertPollLayout2.getTranslationY() + getScrollOffsetY(0)) - AndroidUtilities.dp(((i4 * floatValue) + 7.0f) - (f6 * 12.0f));
                        if (this.nextAttachLayout != null) {
                            f5 = 1.0f - this.translationProgress;
                        }
                    }
                    if (this.doneItem != null) {
                        int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - this.doneItem.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
                        TextView textView = this.doneItem;
                        if (f2 > 0.0f && f5 > 0.0f) {
                            max = AndroidUtilities.lerp(f3, f4, f5);
                        } else {
                            if (f2 <= 0.0f) {
                                f3 = 0.0f;
                            }
                            if (f5 <= 0.0f) {
                                f4 = 0.0f;
                            }
                            max = Math.max(f3, f4);
                        }
                        textView.setTranslationY(Math.max(0.0f, max) + this.currentPanTranslationY);
                        this.doneItem.setTranslationX(-(AndroidUtilities.dp((7.0f * f6) + 12.0f) + (measuredWidth * f6)));
                    }
                    this.doneItemAlphaByLayout = Math.max(f5, f2);
                    checkUi_doneItemVisibility();
                }
                f4 = 0.0f;
                f5 = 0.0f;
                if (this.doneItem != null) {
                }
                this.doneItemAlphaByLayout = Math.max(f5, f2);
                checkUi_doneItemVisibility();
            }
            f2 = 0.0f;
            f3 = 0.0f;
            if (this.todoLayout != null) {
            }
            f4 = 0.0f;
            f5 = 0.0f;
            if (this.doneItem != null) {
            }
            this.doneItemAlphaByLayout = Math.max(f5, f2);
            checkUi_doneItemVisibility();
        }
        f = 0.0f;
        actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
        }
        float dp22 = ((((scrollOffsetY - AndroidUtilities.dp((i2 * floatValue) + 25.0f)) + dp) + this.currentPanTranslationY) + f) - (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha());
        this.baseSelectedTextViewTranslationY = dp22;
        this.headerView.setTranslationY(Math.max(this.currentPanTranslationY, dp22));
        this.topCommentContainer.setTranslationY(Math.max(ActionBar.getCurrentActionBarHeight() + this.currentPanTranslationY, this.baseSelectedTextViewTranslationY + (AndroidUtilities.dp(26.0f) * this.headerView.getAlpha()) + AndroidUtilities.dp(8.0f)));
        if (this.captionAbove) {
        }
        checkUi_writeButtonContainerY();
        int i42 = 59;
        if (this.pollLayout != null) {
        }
        f2 = 0.0f;
        f3 = 0.0f;
        if (this.todoLayout != null) {
        }
        f4 = 0.0f;
        f5 = 0.0f;
        if (this.doneItem != null) {
        }
        this.doneItemAlphaByLayout = Math.max(f5, f2);
        checkUi_doneItemVisibility();
    }

    private void updateActionBarVisibility(final boolean z, boolean z2) {
        AttachAlertLayout attachAlertLayout;
        this.animatorActionBarVisible.setValue(z, true);
        if (!(z && this.actionBar.getTag() == null) && (z || this.actionBar.getTag() == null)) {
            return;
        }
        this.actionBar.setTag(z ? 1 : null);
        AnimatorSet animatorSet = this.actionBarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.actionBarAnimation = null;
        }
        boolean z3 = (this.isPhotoPicker || this.storyMediaPicker || (this.avatarPicker == 0 && this.menuShowed) || this.currentAttachLayout != this.photoLayout || (!this.photosEnabled && !this.videosEnabled)) ? false : true;
        if (this.currentAttachLayout == this.restrictedLayout) {
            z3 = false;
        }
        if (z) {
            if (z3) {
                this.selectedMenuItem.setVisibility(0);
                this.selectedMenuItem.setClickable(true);
            }
        } else if (this.typeButtonsAvailable && this.frameLayout2.getTag() == null) {
            this.buttonsRecyclerViewWrapper.setVisibility(0);
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            if (z) {
                AndroidUtilities.setLightStatusBar(this, isLightStatusBar());
            } else {
                AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
            }
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z ? 1.0f : 0.0f) - this.actionBar.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            ActionBar actionBar = this.actionBar;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property, z ? 1.0f : 0.0f));
            if (z3) {
                arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) property, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
            }
            this.actionBarAnimation.playTogether(arrayList);
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.34
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (ChatAttachAlert.this.actionBarAnimation != null) {
                        if (z) {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable) {
                                if (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons()) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ActionBarMenuItem actionBarMenuItem = ChatAttachAlert.this.searchItem;
                        if (actionBarMenuItem != null) {
                            actionBarMenuItem.setVisibility(4);
                        }
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        if (chatAttachAlert2.avatarPicker == 0 && chatAttachAlert2.menuShowed) {
                            return;
                        }
                        ChatAttachAlert.this.selectedMenuItem.setVisibility(4);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    ChatAttachAlert.this.actionBarAnimation = null;
                }
            });
            this.actionBarAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionBarAnimation.setDuration(380L);
            this.actionBarAnimation.start();
            return;
        }
        if (z && this.typeButtonsAvailable && ((attachAlertLayout = this.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
            this.buttonsRecyclerViewWrapper.setVisibility(4);
        }
        this.actionBar.setAlpha(z ? 1.0f : 0.0f);
        if (z3) {
            this.selectedMenuItem.setAlpha(z ? 1.0f : 0.0f);
            this.selectedMenuItem.setScaleX(z ? 1.0f : 0.6f);
            this.selectedMenuItem.setScaleY(z ? 1.0f : 0.6f);
        }
        if (z) {
            return;
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(4);
        }
        if (this.avatarPicker == 0 && this.menuShowed) {
            return;
        }
        this.selectedMenuItem.setVisibility(4);
    }

    public void updateLayout(AttachAlertLayout attachAlertLayout, boolean z, int i) {
        if (attachAlertLayout == null) {
            return;
        }
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor;
        if (downscaleScrollableNoiseSuppressor != null && Build.VERSION.SDK_INT >= 31) {
            downscaleScrollableNoiseSuppressor.onScrolled(0.0f, i);
            blur3_InvalidateBlur();
        }
        int currentItemTop = attachAlertLayout.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z2 = false;
        boolean z3 = attachAlertLayout == this.currentAttachLayout && currentItemTop <= attachAlertLayout.getButtonsHideOffset();
        this.pinnedToTop = z3;
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        if (attachAlertLayout2 != this.photoPreviewLayout && this.keyboardVisible && z) {
            boolean z4 = attachAlertLayout2 instanceof ChatAttachAlertBotWebViewLayout;
        }
        if (attachAlertLayout == attachAlertLayout2) {
            updateActionBarVisibility(z3, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) attachAlertLayout.getLayoutParams();
        int dp = currentItemTop + ((layoutParams == null ? 0 : layoutParams.topMargin) - AndroidUtilities.dp(11.0f));
        AttachAlertLayout attachAlertLayout3 = this.currentAttachLayout;
        int i2 = attachAlertLayout3 == attachAlertLayout ? 0 : 1;
        if ((attachAlertLayout3 instanceof ChatAttachAlertPhotoLayoutPreview) || (this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
            Object obj = this.viewChangeAnimator;
            if ((obj instanceof SpringAnimation) && ((SpringAnimation) obj).isRunning()) {
                z2 = true;
            }
        }
        int[] iArr = this.scrollOffsetY;
        int i3 = iArr[i2];
        if (i3 == dp && !z2) {
            if (i != 0) {
                this.previousScrollOffsetY = i3;
            }
        } else {
            this.previousScrollOffsetY = i3;
            iArr[i2] = dp;
            updateSelectedPosition(i2);
            this.containerView.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateCountButton(int i) {
        boolean z;
        ActionBarMenuItem actionBarMenuItem;
        ActionBarMenuItem actionBarMenuItem2;
        if (this.viewChangeAnimator != null) {
            return;
        }
        int selectedItemsCount = this.currentAttachLayout.getSelectedItemsCount();
        if (selectedItemsCount == 0) {
            this.writeButton.setCount(0, i != 0);
            showCommentTextView(false, i != 0);
        } else {
            if (!showCommentTextView(true, i != 0) && i != 0) {
                this.writeButton.setCount(selectedItemsCount, true);
                this.writeButton.bounceCount();
            } else {
                this.writeButton.setCount(selectedItemsCount, i != 0);
                this.writeButton.bounceCount();
            }
        }
        this.currentAttachLayout.onSelectedItemsCountChanged(selectedItemsCount);
        if (this.currentAttachLayout == this.photoLayout && (((this.baseFragment instanceof ChatActivity) || this.avatarPicker != 0 || this.storyMediaPicker) && ((selectedItemsCount == 0 && this.menuShowed) || ((selectedItemsCount != 0 || this.avatarPicker != 0 || this.storyMediaPicker) && !this.menuShowed)))) {
            this.menuShowed = (selectedItemsCount == 0 && this.avatarPicker == 0 && !this.storyMediaPicker) ? false : true;
            AnimatorSet animatorSet = this.menuAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.menuAnimator = null;
            }
            if (this.avatarPicker != 0 && this.searchItem != null && this.actionBar.getTag() != null) {
                BaseFragment baseFragment = this.baseFragment;
                if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).allowSendGifs()) {
                    z = true;
                    if (!this.menuShowed) {
                        if (this.avatarPicker == 0 && !this.storyMediaPicker) {
                            this.selectedMenuItem.setVisibility(0);
                            this.selectedMenuItem.setClickable(true);
                        }
                        this.headerView.setVisibility(0);
                    } else if (this.actionBar.getTag() != null && (actionBarMenuItem = this.searchItem) != null) {
                        actionBarMenuItem.setVisibility(0);
                    }
                    if (i != 0) {
                        if (this.actionBar.getTag() == null && this.avatarPicker == 0 && !this.storyMediaPicker) {
                            this.selectedMenuItem.setAlpha(this.menuShowed ? 1.0f : 0.0f);
                            this.selectedMenuItem.setScaleX(this.menuShowed ? 1.0f : 0.6f);
                            this.selectedMenuItem.setScaleY(this.menuShowed ? 1.0f : 0.6f);
                        }
                        this.headerView.setAlpha(this.menuShowed ? 1.0f : 0.0f);
                        if (z) {
                            this.searchItem.setAlpha(this.menuShowed ? 0.0f : 1.0f);
                        }
                        if (this.menuShowed && (actionBarMenuItem2 = this.searchItem) != null) {
                            actionBarMenuItem2.setVisibility(4);
                        }
                    } else {
                        this.menuAnimator = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (this.actionBar.getTag() == null && this.avatarPicker == 0 && !this.storyMediaPicker) {
                            arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.ALPHA, this.menuShowed ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_X, this.menuShowed ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_Y, this.menuShowed ? 1.0f : 0.6f));
                        }
                        FrameLayout frameLayout = this.headerView;
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, this.menuShowed ? 1.0f : 0.0f));
                        if (z) {
                            arrayList.add(ObjectAnimator.ofFloat(this.searchItem, (Property<ActionBarMenuItem, Float>) property, this.menuShowed ? 0.0f : 1.0f));
                        }
                        this.menuAnimator.playTogether(arrayList);
                        this.menuAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatAttachAlert.35
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                ChatAttachAlert.this.menuAnimator = null;
                                if (!ChatAttachAlert.this.menuShowed) {
                                    if (ChatAttachAlert.this.actionBar.getTag() == null) {
                                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                                        if (chatAttachAlert.avatarPicker == 0 && !chatAttachAlert.storyMediaPicker) {
                                            chatAttachAlert.selectedMenuItem.setVisibility(4);
                                        }
                                    }
                                    ChatAttachAlert.this.headerView.setVisibility(4);
                                    return;
                                }
                                ActionBarMenuItem actionBarMenuItem3 = ChatAttachAlert.this.searchItem;
                                if (actionBarMenuItem3 != null) {
                                    actionBarMenuItem3.setVisibility(4);
                                }
                            }
                        });
                        this.menuAnimator.setDuration(180L);
                        this.menuAnimator.start();
                    }
                }
            }
            z = false;
            if (!this.menuShowed) {
            }
            if (i != 0) {
            }
        }
        updateMotionItem(i != 0);
        MessageObject messageObject = this.editingMessageObject;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(getDialogId()) : 0L;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        this.writeButton.setStarsPrice(sendPaidMessagesStars, (attachAlertLayout != null ? attachAlertLayout.getSelectedItemsCount() : 0) + getAdditionalMessagesCount());
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextEmoji.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), this.writeButton.width());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                this.commentTextView.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private void updateMotionItem(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null || this.motionIcon == null) {
            return;
        }
        final boolean z2 = this.menuShowed && this.allowLivePhotos && this.currentAttachLayout == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.hasLivePhotos();
        this.motionIcon.setDisabled(true ^ this.photoLayout.areLivePhotosEnabled(), z);
        if (z && this.menuShowed) {
            this.motionItem.setVisibility(0);
            this.motionItem.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.lambda$updateMotionItem$59(z2);
                }
            }).start();
        } else {
            this.motionItem.setVisibility(z2 ? 0 : 8);
            this.motionItem.setAlpha(z2 ? 1.0f : 0.0f);
            this.motionItem.setScaleX(z2 ? 1.0f : 0.6f);
            this.motionItem.setScaleY(z2 ? 1.0f : 0.6f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateMotionItem$59(boolean z) {
        if (z) {
            return;
        }
        this.motionItem.setVisibility(8);
    }

    private void showMotionHint(boolean z) {
        HintView2 hintView2 = this.motionHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        final HintView2 hintView22 = new HintView2(getContext(), 1);
        this.motionHint = hintView22;
        hintView22.setText(AndroidUtilities.replaceTags(LocaleController.getString(z ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        this.motionHint.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.motionHint.setJointPx(1.0f, -((this.containerView.getWidth() - (this.motionItem.getX() + (this.motionItem.getWidth() / 2.0f))) - AndroidUtilities.dp(14.0f)));
        this.motionHint.setTranslationY(this.selectedMenuItem.getTranslationY());
        this.motionHint.setOnHiddenListener(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda53
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlert.this.lambda$showMotionHint$60(hintView22);
            }
        });
        this.containerView.addView(this.motionHint, LayoutHelper.createFrame(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        this.motionHint.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMotionHint$60(HintView2 hintView2) {
        this.containerView.removeView(hintView2);
    }

    public void setDelegate(ChatAttachViewDelegate chatAttachViewDelegate) {
        this.delegate = chatAttachViewDelegate;
    }

    public void setEmojiViewDelegate(EmojiView.EmojiViewDelegate emojiViewDelegate) {
        this.emojiViewDelegate = emojiViewDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init() {
        TLRPC.Chat chat;
        TLRPC.User user;
        AttachAlertLayout attachAlertLayout;
        AttachAlertLayout attachAlertLayout2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        this.effectId = 0L;
        sendButton.setEffect(0L);
        this.botButtonWasVisible = false;
        this.botButtonProgressWasVisible = false;
        this.botMainButtonOffsetY = 0.0f;
        this.botMainButtonTextView.setVisibility(8);
        this.botProgressView.setAlpha(0.0f);
        this.botProgressView.setScaleX(0.1f);
        this.botProgressView.setScaleY(0.1f);
        this.botProgressView.setVisibility(8);
        this.buttonsRecyclerViewWrapper.setAlpha(1.0f);
        this.buttonsRecyclerViewWrapper.setTranslationY(0.0f);
        for (int i = 0; i < this.botAttachLayouts.size(); i++) {
            ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.valueAt(i)).setMeasureOffsetY(0);
        }
        if (this.avatarPicker != 2) {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                chat = ((ChatActivity) baseFragment).getCurrentChat();
                user = ((ChatActivity) this.baseFragment).getCurrentUser();
            } else {
                long j = this.dialogId;
                if (j >= 0) {
                    user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
                    chat = null;
                } else if (j < 0) {
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                    user = null;
                }
            }
            if (((this.baseFragment instanceof ChatActivity) && this.avatarPicker != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.photosEnabled = ChatObject.canSendPhoto(chat);
                    this.videosEnabled = ChatObject.canSendVideo(chat);
                    this.musicEnabled = ChatObject.canSendMusic(chat);
                    this.pollsEnabled = ChatObject.canSendPolls(chat);
                    this.todoEnabled = !ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.canSendPolls(chat);
                    this.plainTextEnabled = ChatObject.canSendPlain(chat);
                    this.documentsEnabled = ChatObject.canSendDocument(chat);
                } else {
                    this.pollsEnabled = UserObject.isBot(user) || UserObject.isUserSelf(user);
                    BaseFragment baseFragment2 = this.baseFragment;
                    this.todoEnabled = !(baseFragment2 instanceof ChatActivity) || ((ChatActivity) baseFragment2).getCurrentEncryptedChat() == null;
                }
            }
            if ((this.baseFragment instanceof ChatActivity) || this.avatarPicker == 2) {
                this.commentTextView.setVisibility(this.allowEnterCaption ? 0 : 4);
            }
            this.photoLayout.onInit(this.videosEnabled, this.photosEnabled, this.documentsEnabled);
            this.commentTextView.hidePopup(true);
            this.topCommentTextView.hidePopup(true);
            this.enterCommentEventSent = false;
            setFocusable(false);
            if (!this.isStoryLocationPicker || this.isBizLocationPicker || this.isLocationPicker) {
                if (this.locationLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                    ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), this.resourcesProvider, (this.isPollAttach || this.isLocationPicker) ? false : true);
                    this.locationLayout = chatAttachAlertLocationLayout;
                    attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                    ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = this.locationActivityDelegate;
                    if (locationActivityDelegate != null) {
                        chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                    } else {
                        chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda0
                            @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
                            public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i2, boolean z, int i3, long j2) {
                                ChatAttachAlert.this.lambda$init$61(messageMedia, i2, z, i3, j2);
                            }
                        });
                    }
                }
                this.selectedId = 5L;
                attachAlertLayout = this.locationLayout;
            } else if (this.isStoryAudioPicker) {
                openAudioLayout(false);
                attachAlertLayout = this.audioLayout;
                this.selectedId = 3L;
            } else if (this.isSoundPicker) {
                openDocumentsLayout(false);
                attachAlertLayout = this.documentLayout;
                this.selectedId = 4L;
            } else {
                MessageObject messageObject = this.editingMessageObject;
                if (messageObject != null) {
                    int i2 = this.editType;
                    if (i2 == -1) {
                        this.typeButtonsAvailable = true;
                        if (messageObject.isMusic()) {
                            openAudioLayout(false);
                            attachAlertLayout = this.audioLayout;
                            this.selectedId = 3L;
                        } else if (this.editingMessageObject.isDocument()) {
                            openDocumentsLayout(false);
                            attachAlertLayout = this.documentLayout;
                            this.selectedId = 4L;
                        } else {
                            attachAlertLayout = this.photoLayout;
                            this.selectedId = 1L;
                        }
                    } else {
                        if (i2 == 2) {
                            openAudioLayout(false);
                            attachAlertLayout = this.audioLayout;
                            this.selectedId = 3L;
                        } else if (i2 == 1) {
                            openDocumentsLayout(false);
                            attachAlertLayout = this.documentLayout;
                            this.selectedId = 4L;
                        } else {
                            attachAlertLayout = this.photoLayout;
                            this.selectedId = 1L;
                        }
                        this.typeButtonsAvailable = false;
                    }
                } else {
                    attachAlertLayout = this.photoLayout;
                    this.typeButtonsAvailable = this.avatarPicker == 0 && !this.storyMediaPicker;
                    this.selectedId = 1L;
                }
            }
            this.buttonsRecyclerViewWrapper.setVisibility(this.typeButtonsAvailable ? 0 : 8);
            if (this.currentAttachLayout != attachAlertLayout) {
                if (this.actionBar.isSearchFieldVisible()) {
                    this.actionBar.closeSearchField();
                }
                this.containerView.removeView(this.currentAttachLayout);
                this.currentAttachLayout.onHide();
                this.currentAttachLayout.setVisibility(8);
                this.currentAttachLayout.onHidden();
                this.currentAttachLayout = attachAlertLayout;
                setAllowNestedScroll(true);
                if (this.currentAttachLayout.getParent() == null) {
                    this.containerView.addView(this.currentAttachLayout, 0, LayoutHelper.createFrame(-1, -1.0f));
                }
                attachAlertLayout.setAlpha(1.0f);
                attachAlertLayout.setVisibility(0);
                attachAlertLayout.onShow(null);
                attachAlertLayout.onShown();
                this.actionBar.setVisibility(attachAlertLayout.needsActionBar() != 0 ? 0 : 4);
                setCaptionAbove(this.captionAbove, false);
                updateDoneItemEnabled();
            }
            attachAlertLayout2 = this.currentAttachLayout;
            chatAttachAlertPhotoLayout = this.photoLayout;
            if (attachAlertLayout2 != chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            updateCountButton(0);
            this.buttonsAdapter.notifyDataSetChanged();
            getCommentView().setText("");
            this.buttonsLayoutManager.scrollToPositionWithOffset(0, MediaController.VIDEO_BITRATE_480);
        }
        chat = null;
        user = null;
        if (this.baseFragment instanceof ChatActivity) {
            if (chat != null) {
            }
            if (this.baseFragment instanceof ChatActivity) {
            }
            this.commentTextView.setVisibility(this.allowEnterCaption ? 0 : 4);
            this.photoLayout.onInit(this.videosEnabled, this.photosEnabled, this.documentsEnabled);
            this.commentTextView.hidePopup(true);
            this.topCommentTextView.hidePopup(true);
            this.enterCommentEventSent = false;
            setFocusable(false);
            if (!this.isStoryLocationPicker) {
            }
            if (this.locationLayout == null) {
            }
            this.selectedId = 5L;
            attachAlertLayout = this.locationLayout;
            this.buttonsRecyclerViewWrapper.setVisibility(this.typeButtonsAvailable ? 0 : 8);
            if (this.currentAttachLayout != attachAlertLayout) {
            }
            attachAlertLayout2 = this.currentAttachLayout;
            chatAttachAlertPhotoLayout = this.photoLayout;
            if (attachAlertLayout2 != chatAttachAlertPhotoLayout) {
            }
            updateCountButton(0);
            this.buttonsAdapter.notifyDataSetChanged();
            getCommentView().setText("");
            this.buttonsLayoutManager.scrollToPositionWithOffset(0, MediaController.VIDEO_BITRATE_480);
        }
        if (chat != null) {
        }
        if (this.baseFragment instanceof ChatActivity) {
        }
        this.commentTextView.setVisibility(this.allowEnterCaption ? 0 : 4);
        this.photoLayout.onInit(this.videosEnabled, this.photosEnabled, this.documentsEnabled);
        this.commentTextView.hidePopup(true);
        this.topCommentTextView.hidePopup(true);
        this.enterCommentEventSent = false;
        setFocusable(false);
        if (!this.isStoryLocationPicker) {
        }
        if (this.locationLayout == null) {
        }
        this.selectedId = 5L;
        attachAlertLayout = this.locationLayout;
        this.buttonsRecyclerViewWrapper.setVisibility(this.typeButtonsAvailable ? 0 : 8);
        if (this.currentAttachLayout != attachAlertLayout) {
        }
        attachAlertLayout2 = this.currentAttachLayout;
        chatAttachAlertPhotoLayout = this.photoLayout;
        if (attachAlertLayout2 != chatAttachAlertPhotoLayout) {
        }
        updateCountButton(0);
        this.buttonsAdapter.notifyDataSetChanged();
        getCommentView().setText("");
        this.buttonsLayoutManager.scrollToPositionWithOffset(0, MediaController.VIDEO_BITRATE_480);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$61(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        ((ChatActivity) this.baseFragment).didSelectLocation(messageMedia, i, z, i2, 0L);
    }

    public void onDestroy() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onDestroy();
            }
            i++;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.destroyed = true;
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        EditTextEmoji editTextEmoji2 = this.topCommentTextView;
        if (editTextEmoji2 != null) {
            editTextEmoji2.onDestroy();
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void onOpenAnimationEnd() {
        if (this.baseFragment instanceof ChatActivity) {
            int i = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i2 = MediaController.VIDEO_BITRATE_1080;
        }
        this.currentAttachLayout.onOpenAnimationEnd();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.openTransitionFinished = true;
        if (this.videosEnabled || this.photosEnabled) {
            return;
        }
        checkCanRemoveRestrictionsByBoosts();
    }

    public void setAllowDrawContent(boolean z) {
        this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        if (this.allowDrawContent != z) {
            this.allowDrawContent = z;
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
            if (attachAlertLayout != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null || chatAttachAlertPhotoLayout.cameraExpanded) {
                return;
            }
            chatAttachAlertPhotoLayout.pauseCamera(!z || this.sent);
        }
    }

    public void setAvatarPicker(int i, boolean z, Utilities.Callback0Return callback0Return) {
        this.avatarPicker = i;
        this.avatarSearch = z;
        this.avatarWithBulletin = callback0Return;
        if (i != 0) {
            this.typeButtonsAvailable = false;
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            if (attachAlertLayout == null || attachAlertLayout == this.photoLayout) {
                this.buttonsRecyclerViewWrapper.setVisibility(8);
            }
            if (this.avatarPicker == 2) {
                this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            } else {
                this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhoto));
            }
        } else {
            this.typeButtonsAvailable = true;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.updateAvatarPicker();
        }
    }

    public void setStoryMediaPicker() {
        this.storyMediaPicker = true;
        this.typeButtonsAvailable = false;
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
    }

    public void enableStickerMode(Utilities.Callback2 callback2) {
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoForSticker));
        this.typeButtonsAvailable = false;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        this.avatarPicker = 1;
        this.isPhotoPicker = true;
        this.isStickerMode = true;
        this.allowLivePhotos = false;
        this.customStickerHandler = callback2;
        if (this.optionsItem != null) {
            this.selectedTextView.setTranslationY(-AndroidUtilities.dp(8.0f));
            this.optionsItem.setVisibility(0);
            this.optionsItem.setClickable(true);
            this.optionsItem.setAlpha(1.0f);
            this.optionsItem.setScaleX(1.0f);
            this.optionsItem.setScaleY(1.0f);
        }
    }

    public void enablePollAttachMode(int i) {
        this.typeButtonsAvailable = true;
        this.buttonsRecyclerViewWrapper.setVisibility(0);
        this.isPollAttach = true;
        this.pollAllowedLayouts = i;
        this.avatarPicker = 0;
        this.isPhotoPicker = false;
        this.isStickerMode = false;
        this.customStickerHandler = null;
        if (this.optionsItem != null) {
            this.selectedTextView.setTranslationY(0.0f);
            this.optionsItem.setVisibility(8);
        }
    }

    public void setLocationActivityDelegate(ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate) {
        this.locationActivityDelegate = locationActivityDelegate;
    }

    public void enableDefaultMode() {
        this.typeButtonsAvailable = true;
        this.buttonsRecyclerViewWrapper.setVisibility(0);
        this.avatarPicker = 0;
        this.isPhotoPicker = false;
        this.isStickerMode = false;
        this.allowLivePhotos = true;
        this.customStickerHandler = null;
        if (this.optionsItem != null) {
            this.selectedTextView.setTranslationY(0.0f);
            this.optionsItem.setVisibility(8);
        }
    }

    public TextView getSelectedTextView() {
        return this.selectedTextView;
    }

    public int getTypeButtonsHeight() {
        if (this.typeButtonsAvailable) {
            return AndroidUtilities.dp(62.0f);
        }
        return 0;
    }

    public void setTypeButtonsHidden(final boolean z, boolean z2) {
        if (this.typeButtonsHidden == z) {
            return;
        }
        this.typeButtonsHidden = z;
        if (this.typeButtonsAvailable) {
            this.buttonsRecyclerViewWrapper.animate().cancel();
            if (!z) {
                this.buttonsRecyclerViewWrapper.setVisibility(0);
            }
            if (z2) {
                this.buttonsRecyclerViewWrapper.animate().alpha(z ? 0.0f : 1.0f).translationY(z ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda72
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatAttachAlert.this.lambda$setTypeButtonsHidden$62(z);
                    }
                }).start();
                return;
            }
            this.buttonsRecyclerViewWrapper.setAlpha(z ? 0.0f : 1.0f);
            this.buttonsRecyclerViewWrapper.setTranslationY(z ? AndroidUtilities.dp(48.0f) : 0.0f);
            this.buttonsRecyclerViewWrapper.setVisibility(z ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTypeButtonsHidden$62(boolean z) {
        if (z) {
            this.buttonsRecyclerViewWrapper.setVisibility(4);
        }
    }

    public void setSoundPicker() {
        this.isSoundPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
    }

    public void setLocationPicker() {
        this.isLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setStoryLocationPicker() {
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setStoryLocationPicker(boolean z, File file) {
        this.storyLocationPickerFileIsVideo = z;
        this.storyLocationPickerPhotoFile = file;
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setStoryLocationPicker(double d, double d2) {
        this.storyLocationPickerLatLong = new double[]{d, d2};
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setMaxSelectedPhotos(int i, boolean z) {
        if (this.editingMessageObject != null) {
            return;
        }
        this.maxSelectedPhotos = i;
        this.allowOrder = z;
    }

    public void setOpenWithFrontFaceCamera(boolean z) {
        this.openWithFrontFaceCamera = z;
    }

    public ChatAttachAlertPhotoLayout getPhotoLayout() {
        return this.photoLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkPhotoAndCameraPermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 ? ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_VIDEO") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0 : i < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkPhotoAndDocumentsPermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 ? ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_VIDEO") == 0 : i < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showAiButton(boolean z) {
        final boolean z2;
        if (z) {
            BaseFragment baseFragment = this.baseFragment;
            if ((baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isSecretChat()) {
                z2 = true;
                if (this.shownAiButton != z2) {
                    return;
                }
                if (z2) {
                    MessagesController.getInstance(this.currentAccount).getTonesController().load();
                }
                this.shownAiButton = z2;
                this.aiButton.setVisibility(0);
                this.topAiButton.setVisibility(0);
                ViewPropertyAnimator scaleY = this.aiButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                scaleY.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda59
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatAttachAlert.this.lambda$showAiButton$63(z2);
                    }
                }).start();
                this.topAiButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda60
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatAttachAlert.this.lambda$showAiButton$64(z2);
                    }
                }).start();
                if (z2) {
                    ImageView imageView = this.aiButton;
                    AiButtonDrawable aiButtonDrawable = this.aiButtonIcon;
                    Objects.requireNonNull(aiButtonDrawable);
                    imageView.postDelayed(new CaptionPhotoViewer$$ExternalSyntheticLambda5(aiButtonDrawable), 220L);
                    ImageView imageView2 = this.topAiButton;
                    AiButtonDrawable aiButtonDrawable2 = this.topAiButtonIcon;
                    Objects.requireNonNull(aiButtonDrawable2);
                    imageView2.postDelayed(new CaptionPhotoViewer$$ExternalSyntheticLambda5(aiButtonDrawable2), 220L);
                    return;
                }
                return;
            }
        }
        z2 = false;
        if (this.shownAiButton != z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAiButton$63(boolean z) {
        if (z) {
            return;
        }
        this.aiButton.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAiButton$64(boolean z) {
        if (z) {
            return;
        }
        this.topAiButton.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkContactsPermission(Context context) {
        return Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkMusicPermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (ContextCompat.checkSelfPermission(context, i >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                return false;
            }
        }
        return true;
    }

    private class ButtonsAdapter extends RecyclerListView.SelectionAdapter {
        private int attachBotsEndRow;
        private int attachBotsStartRow;
        private List attachMenuBots = new ArrayList();
        private int buttonsCount;
        private int contactButton;
        private int documentButton;
        private int emojiButton;
        private int galleryButton;
        private int linksButton;
        private int locationButton;
        private Context mContext;
        private int musicButton;
        private int pollButton;
        private int quickRepliesButton;
        private int richButton;
        private int stickerButton;
        private int todoButton;

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public ButtonsAdapter(Context context) {
            this.mContext = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View attachButton;
            if (i == 0) {
                attachButton = ChatAttachAlert.this.new AttachButton(this.mContext);
            } else {
                attachButton = ChatAttachAlert.this.new AttachBotButton(this.mContext);
            }
            attachButton.setImportantForAccessibility(1);
            attachButton.setFocusable(true);
            attachButton.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            return new RecyclerListView.Holder(attachButton);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01cc  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            boolean checkContactsPermission;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                AttachBotButton attachBotButton = (AttachBotButton) viewHolder.itemView;
                attachBotButton.glassTabView.onPreBind();
                int i2 = this.attachBotsStartRow;
                if (i >= i2 && i < this.attachBotsEndRow) {
                    int i3 = i - i2;
                    attachBotButton.setTag(Integer.valueOf(i3));
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.attachMenuBots.get(i3);
                    attachBotButton.setAttachBot(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(tL_attachMenuBot.bot_id)), tL_attachMenuBot);
                    return;
                }
                int i4 = i - this.buttonsCount;
                attachBotButton.setTag(Integer.valueOf(i4));
                attachBotButton.setUser(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).inlineBots.get(i4).peer.user_id)));
                return;
            }
            AttachButton attachButton = (AttachButton) viewHolder.itemView;
            attachButton.glassTabView.onPreBind();
            if (i == this.galleryButton) {
                attachButton.setTextAndIcon(1, LocaleController.getString(R.string.ChatGallery), GlassTabView.TabAnimation.GALLERY);
                attachButton.setTag(1);
                checkContactsPermission = ChatAttachAlert.checkPhotoAndCameraPermission(this.mContext);
            } else if (i == this.documentButton) {
                attachButton.setTextAndIcon(4, LocaleController.getString(R.string.ChatDocument), GlassTabView.TabAnimation.FILES);
                attachButton.setTag(4);
                checkContactsPermission = ChatAttachAlert.checkPhotoAndDocumentsPermission(this.mContext);
            } else {
                if (i == this.locationButton) {
                    attachButton.setTextAndIcon(6, LocaleController.getString(R.string.ChatLocation), GlassTabView.TabAnimation.LOCATION);
                    attachButton.setTag(6);
                } else if (i == this.musicButton) {
                    attachButton.setTextAndIcon(3, LocaleController.getString(R.string.AttachMusic), GlassTabView.TabAnimation.MUSIC);
                    attachButton.setTag(3);
                    checkContactsPermission = ChatAttachAlert.checkMusicPermission(this.mContext);
                } else if (i == this.pollButton) {
                    attachButton.setTextAndIcon(9, LocaleController.getString(R.string.Poll), GlassTabView.TabAnimation.POLL);
                    attachButton.setTag(9);
                } else if (i == this.contactButton) {
                    attachButton.setTextAndIcon(5, LocaleController.getString(R.string.AttachContact), GlassTabView.TabAnimation.CONTACTS);
                    attachButton.setTag(5);
                    checkContactsPermission = ChatAttachAlert.checkContactsPermission(this.mContext);
                } else {
                    if (i == this.quickRepliesButton) {
                        attachButton.setTextAndIcon(11, LocaleController.getString(R.string.AttachQuickReplies), GlassTabView.TabAnimation.REPLIES);
                        attachButton.setTag(11);
                    } else if (i == this.todoButton) {
                        attachButton.setTextAndIcon(12, LocaleController.getString(R.string.Todo), GlassTabView.TabAnimation.CHECKLIST);
                        attachButton.setTag(12);
                    } else if (i == this.stickerButton) {
                        attachButton.setTextAndIcon(13, LocaleController.getString(R.string.ChatSticker), GlassTabView.TabAnimation.STICKER);
                        attachButton.setTag(13);
                    } else if (i == this.linksButton) {
                        attachButton.setTextAndIcon(15, LocaleController.getString(R.string.ChatLink), GlassTabView.TabAnimation.LINK);
                        attachButton.setTag(15);
                    } else if (i == this.emojiButton) {
                        attachButton.setTextAndIcon(14, LocaleController.getString(R.string.ChatEmoji), GlassTabView.TabAnimation.EMOJI);
                        attachButton.setTag(14);
                    } else if (i == this.richButton) {
                        attachButton.setTextAndIcon(16, "Article", GlassTabView.TabAnimation.ARTICLE);
                        attachButton.setTag(16);
                    }
                    z = false;
                    z2 = true;
                    attachButton.glassTabView.setCounter(z ? "!" : null, z, false);
                    attachButton.glassTabView.setPremiumBadge((z2 || UserConfig.getInstance(ChatAttachAlert.this.currentAccount).isPremium()) ? false : true);
                }
                z = false;
                z2 = false;
                attachButton.glassTabView.setCounter(z ? "!" : null, z, false);
                attachButton.glassTabView.setPremiumBadge((z2 || UserConfig.getInstance(ChatAttachAlert.this.currentAccount).isPremium()) ? false : true);
            }
            z = !checkContactsPermission;
            z2 = false;
            attachButton.glassTabView.setCounter(z ? "!" : null, z, false);
            attachButton.glassTabView.setPremiumBadge((z2 || UserConfig.getInstance(ChatAttachAlert.this.currentAccount).isPremium()) ? false : true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            ChatAttachAlert.this.applyAttachButtonColors(viewHolder.itemView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int i = this.buttonsCount;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            return (chatAttachAlert.editingMessageObject == null && (chatAttachAlert.baseFragment instanceof ChatActivity) && !chatAttachAlert.isPollAttach) ? i + MediaDataController.getInstance(chatAttachAlert.currentAccount).inlineBots.size() : i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            boolean z = false;
            this.buttonsCount = 0;
            this.galleryButton = -1;
            this.documentButton = -1;
            this.musicButton = -1;
            this.pollButton = -1;
            this.todoButton = -1;
            this.contactButton = -1;
            this.quickRepliesButton = -1;
            this.locationButton = -1;
            this.stickerButton = -1;
            this.linksButton = -1;
            this.richButton = -1;
            this.emojiButton = -1;
            this.attachBotsStartRow = -1;
            this.attachBotsEndRow = -1;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.isPollAttach) {
                this.buttonsCount = 1;
                this.galleryButton = 0;
                if (chatAttachAlert.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 16)) {
                    int i = this.buttonsCount;
                    this.buttonsCount = i + 1;
                    this.documentButton = i;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 8192)) {
                    int i2 = this.buttonsCount;
                    this.buttonsCount = i2 + 1;
                    this.stickerButton = i2;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 16384)) {
                    int i3 = this.buttonsCount;
                    this.buttonsCount = i3 + 1;
                    this.emojiButton = i3;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 8)) {
                    int i4 = this.buttonsCount;
                    this.buttonsCount = i4 + 1;
                    this.musicButton = i4;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 64)) {
                    int i5 = this.buttonsCount;
                    this.buttonsCount = i5 + 1;
                    this.locationButton = i5;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 32768)) {
                    int i6 = this.buttonsCount;
                    this.buttonsCount = i6 + 1;
                    this.linksButton = i6;
                }
            } else {
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                if (!(baseFragment instanceof ChatActivity)) {
                    this.galleryButton = 0;
                    this.buttonsCount = 2;
                    this.documentButton = 1;
                    if (chatAttachAlert.allowEnterCaption) {
                        this.buttonsCount = 3;
                        this.musicButton = 2;
                    }
                } else if (chatAttachAlert.editingMessageObject != null) {
                    if (chatAttachAlert.editType != -1) {
                        if (ChatAttachAlert.this.editType == 0) {
                            int i7 = this.buttonsCount;
                            this.buttonsCount = i7 + 1;
                            this.galleryButton = i7;
                        }
                        if (ChatAttachAlert.this.editType == 1) {
                            int i8 = this.buttonsCount;
                            this.buttonsCount = i8 + 1;
                            this.documentButton = i8;
                        }
                        if (ChatAttachAlert.this.editType == 2) {
                            int i9 = this.buttonsCount;
                            this.buttonsCount = i9 + 1;
                            this.musicButton = i9;
                        }
                    } else {
                        int i10 = this.buttonsCount;
                        this.galleryButton = i10;
                        this.documentButton = i10 + 1;
                        this.buttonsCount = i10 + 3;
                        this.musicButton = i10 + 2;
                    }
                } else {
                    TLRPC.User currentUser = baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getCurrentUser() : null;
                    BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                    TLRPC.Chat currentChat = baseFragment2 instanceof ChatActivity ? ((ChatActivity) baseFragment2).getCurrentChat() : null;
                    if (currentUser != null && ((ChatActivity) ChatAttachAlert.this.baseFragment).getMessagesController().getSendPaidMessagesStars(currentUser.id) > 0) {
                        z = true;
                    }
                    int i11 = this.buttonsCount;
                    this.buttonsCount = i11 + 1;
                    this.galleryButton = i11;
                    if ((ChatAttachAlert.this.photosEnabled || ChatAttachAlert.this.videosEnabled) && !z && (currentChat == null || !ChatObject.isMonoForum(currentChat))) {
                        BaseFragment baseFragment3 = ChatAttachAlert.this.baseFragment;
                        if ((baseFragment3 instanceof ChatActivity) && !((ChatActivity) baseFragment3).isInScheduleMode() && !((ChatActivity) ChatAttachAlert.this.baseFragment).isSecretChat() && ((ChatActivity) ChatAttachAlert.this.baseFragment).getChatMode() != 5) {
                            ChatActivity chatActivity = (ChatActivity) ChatAttachAlert.this.baseFragment;
                            this.attachBotsStartRow = this.buttonsCount;
                            this.attachMenuBots.clear();
                            Iterator<TLRPC.TL_attachMenuBot> it = MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).getAttachMenuBots().bots.iterator();
                            while (it.hasNext()) {
                                TLRPC.TL_attachMenuBot next = it.next();
                                if (next.show_in_attach_menu) {
                                    if (MediaDataController.canShowAttachMenuBot(next, chatActivity.getCurrentChat() != null ? chatActivity.getCurrentChat() : chatActivity.getCurrentUser())) {
                                        this.attachMenuBots.add(next);
                                    }
                                }
                            }
                            int size = this.buttonsCount + this.attachMenuBots.size();
                            this.buttonsCount = size;
                            this.attachBotsEndRow = size;
                        }
                    }
                    int i12 = this.buttonsCount;
                    this.buttonsCount = i12 + 1;
                    this.documentButton = i12;
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i13 = this.buttonsCount;
                        this.buttonsCount = i13 + 1;
                        this.locationButton = i13;
                    }
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i14 = this.buttonsCount;
                        this.buttonsCount = i14 + 1;
                        this.richButton = i14;
                    }
                    if (ChatAttachAlert.this.pollsEnabled) {
                        int i15 = this.buttonsCount;
                        this.buttonsCount = i15 + 1;
                        this.pollButton = i15;
                    }
                    if (ChatAttachAlert.this.todoEnabled) {
                        int i16 = this.buttonsCount;
                        this.buttonsCount = i16 + 1;
                        this.todoButton = i16;
                    }
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i17 = this.buttonsCount;
                        this.buttonsCount = i17 + 1;
                        this.contactButton = i17;
                    }
                    BaseFragment baseFragment4 = ChatAttachAlert.this.baseFragment;
                    if ((baseFragment4 instanceof ChatActivity) && ((ChatActivity) baseFragment4).getChatMode() == 0 && currentUser != null && !z && !currentUser.bot && QuickRepliesController.getInstance(ChatAttachAlert.this.currentAccount).hasReplies()) {
                        int i18 = this.buttonsCount;
                        this.buttonsCount = i18 + 1;
                        this.quickRepliesButton = i18;
                    }
                    int i19 = this.buttonsCount;
                    this.buttonsCount = i19 + 1;
                    this.musicButton = i19;
                }
            }
            super.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i < this.buttonsCount) {
                return (i < this.attachBotsStartRow || i >= this.attachBotsEndRow) ? 0 : 1;
            }
            return 1;
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void dismissInternal() {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.doOnIdle(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.removeFromRoot();
                }
            });
        } else {
            removeFromRoot();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromRoot() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        if (this.actionBar.isSearchFieldVisible()) {
            this.actionBar.closeSearchField();
        }
        this.contactsLayout = null;
        this.quickRepliesLayout = null;
        this.audioLayout = null;
        this.pollLayout = null;
        this.todoLayout = null;
        this.locationLayout = null;
        this.documentLayout = null;
        int i = 1;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
                if (attachAlertLayout != null) {
                    attachAlertLayout.onDestroy();
                    this.containerView.removeView(this.layouts[i]);
                    this.layouts[i] = null;
                }
                i++;
            } else {
                updateActionBarVisibility(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    /* renamed from: onBackPressed */
    public void lambda$openCrafting$8() {
        if (this.passcodeView.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (this.actionBar.isSearchFieldVisible()) {
                this.actionBar.closeSearchField();
                return;
            }
            if (this.currentAttachLayout.onBackPressed()) {
                return;
            }
            if (getCommentView() != null && getCommentView().isPopupShowing()) {
                getCommentView().hidePopup(true);
            } else {
                super.lambda$openCrafting$8();
            }
        }
    }

    public EditTextEmoji getCommentView() {
        AttachAlertLayout attachAlertLayout;
        return (this.captionAbove && ((attachAlertLayout = this.currentAttachLayout) == this.photoLayout || attachAlertLayout == this.photoPreviewLayout)) ? this.topCommentTextView : this.commentTextView;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void dismissWithButtonClick(int i) {
        super.dismissWithButtonClick(i);
        this.currentAttachLayout.onDismissWithButtonClick(i);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithTouchOutside() {
        return this.currentAttachLayout.canDismissWithTouchOutside();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected void onDismissWithTouchOutside() {
        if (this.currentAttachLayout.onDismissWithTouchOutside()) {
            lambda$new$0();
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
    public void dismiss(boolean z) {
        if (z) {
            this.allowPassConfirmationAlert = z;
        }
        lambda$new$0();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
    /* renamed from: dismiss */
    public void lambda$new$0() {
        if (this.currentAttachLayout.onDismiss() || isDismissed()) {
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji.getEditText());
        }
        EditTextEmoji editTextEmoji2 = this.topCommentTextView;
        if (editTextEmoji2 != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji2.getEditText());
        }
        this.botAttachLayouts.clear();
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment == null) {
            baseFragment = LaunchActivity.getLastFragment();
        }
        if (!this.allowPassConfirmationAlert && baseFragment != null && this.currentAttachLayout.getSelectedItemsCount() > 0 && !this.isPhotoPicker) {
            if (this.confirmationAlertShown) {
                return;
            }
            this.confirmationAlertShown = true;
            AlertDialog create = new AlertDialog.Builder(baseFragment.getParentActivity(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.DiscardSelectionAlertTitle)).setMessage(LocaleController.getString(R.string.DiscardSelectionAlertMessage)).setPositiveButton(LocaleController.getString(R.string.Discard), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatAttachAlert.this.lambda$dismiss$65(alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    ChatAttachAlert.this.lambda$dismiss$66(dialogInterface);
                }
            }).setOnPreDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ChatAttachAlert.this.lambda$dismiss$67(dialogInterface);
                }
            }).create();
            create.show();
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null && this.currentAttachLayout != attachAlertLayout) {
                attachAlertLayout.onDismiss();
            }
            i++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0), true, new AndroidUtilities.IntColorCallback() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda4
            @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
            public final void run(int i2) {
                ChatAttachAlert.this.lambda$dismiss$68(i2);
            }
        });
        if (baseFragment != null) {
            AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
        }
        this.captionLimitBulletinShown = false;
        super.lambda$new$0();
        this.allowPassConfirmationAlert = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$65(AlertDialog alertDialog, int i) {
        this.allowPassConfirmationAlert = true;
        lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$66(DialogInterface dialogInterface) {
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        springAnimation2.getSpring().setDampingRatio(1.5f);
        this.appearSpringAnimation.getSpring().setStiffness(1500.0f);
        this.appearSpringAnimation.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$67(DialogInterface dialogInterface) {
        this.confirmationAlertShown = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$68(int i) {
        this.navBarColorKey = -1;
        this.navBarColor = i;
        this.containerView.invalidate();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.currentAttachLayout.onSheetKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
    }

    public BaseFragment getBaseFragment() {
        return this.baseFragment;
    }

    public ChatAttachAlertDocumentLayout getDocumentLayout() {
        return this.documentLayout;
    }

    public void setAllowEnterCaption(boolean z) {
        this.allowEnterCaption = z;
    }

    public void setAudioSelectDelegate(ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate) {
        this.audioSelectDelegate = audioSelectDelegate;
    }

    public void setDocumentsDelegate(ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentSelectActivityDelegate) {
        this.documentsDelegate = documentSelectActivityDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceWithText(int i, int i2, CharSequence charSequence, boolean z) {
        if (getCommentView() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getCommentView().getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                Emoji.replaceEmoji(spannableStringBuilder, getCommentView().getEditText().getPaint().getFontMetricsInt(), false);
            }
            getCommentView().setText(spannableStringBuilder);
            getCommentView().setSelection(i + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMentionsContainer() {
        MentionsContainerView mentionsContainerView = new MentionsContainerView(getContext(), this.dialogId, 0L, LaunchActivity.getLastFragment(), this.resourcesProvider) { // from class: org.telegram.ui.Components.ChatAttachAlert.36
            @Override // org.telegram.ui.Components.MentionsContainerView
            protected void onScrolled(boolean z, boolean z2) {
                if (ChatAttachAlert.this.photoLayout != null) {
                    ChatAttachAlert.this.photoLayout.checkCameraViewPosition();
                }
            }

            @Override // org.telegram.ui.Components.MentionsContainerView
            protected void onAnimationScroll() {
                if (ChatAttachAlert.this.photoLayout != null) {
                    ChatAttachAlert.this.photoLayout.checkCameraViewPosition();
                }
            }
        };
        this.mentionContainer = mentionsContainerView;
        mentionsContainerView.withDelegate(new MentionsContainerView.Delegate() { // from class: org.telegram.ui.Components.ChatAttachAlert.37
            @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
            public /* synthetic */ void addEmojiToRecent(String str) {
                MentionsContainerView.Delegate.-CC.$default$addEmojiToRecent(this, str);
            }

            @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
            public /* synthetic */ void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj) {
                MentionsContainerView.Delegate.-CC.$default$onStickerSelected(this, tL_document, str, obj);
            }

            @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
            public /* synthetic */ void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
                MentionsContainerView.Delegate.-CC.$default$sendBotInlineResult(this, botInlineResult, z, i);
            }

            @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
            public void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
                ChatAttachAlert.this.replaceWithText(i, i2, charSequence, z);
            }

            @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
            public Paint.FontMetricsInt getFontMetrics() {
                return ChatAttachAlert.this.commentTextView.getEditText().getPaint().getFontMetricsInt();
            }
        });
        ViewGroup viewGroup = this.containerView;
        viewGroup.addView(this.mentionContainer, viewGroup.indexOfChild(this.frameLayout2), LayoutHelper.createFrame(-1, -1, 83));
        setupMentionContainer(this.mentionContainer);
        updateCommentTextViewPosition();
    }

    protected void setupMentionContainer(MentionsContainerView mentionsContainerView) {
        mentionsContainerView.getAdapter().setAllowStickers(false);
        mentionsContainerView.getAdapter().setAllowBots(false);
        mentionsContainerView.getAdapter().setAllowChats(false);
        if (this.baseFragment instanceof ChatActivity) {
            mentionsContainerView.getAdapter().setSearchInDialogs(false);
            ChatActivity chatActivity = (ChatActivity) this.baseFragment;
            mentionsContainerView.getAdapter().setUserOrChat(chatActivity.getCurrentUser(), chatActivity.getCurrentChat());
            mentionsContainerView.getAdapter().setChatInfo(chatActivity.getCurrentChatInfo());
            mentionsContainerView.getAdapter().setNeedUsernames(chatActivity.getCurrentChat() != null);
        } else {
            mentionsContainerView.getAdapter().setSearchInDialogs(true);
            mentionsContainerView.getAdapter().setChatInfo(null);
            mentionsContainerView.getAdapter().setNeedUsernames(false);
        }
        mentionsContainerView.getAdapter().setNeedBotContext(false);
    }

    public void setCaptionAbove(boolean z) {
        setCaptionAbove(z, true);
    }

    public void setCaptionAbove(boolean z, boolean z2) {
        this.animatorCaptionAbove.setValue(z, z2);
        EditTextEmoji commentView = getCommentView();
        this.captionAbove = z;
        EditTextEmoji commentView2 = getCommentView();
        final boolean z3 = this.frameLayout2.getTag() != null;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        final boolean z4 = this.captionAbove && (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout);
        if (z2) {
            this.topCommentContainer.setVisibility(z3 ? 0 : 8);
            ViewPropertyAnimator duration = this.topCommentContainer.animate().alpha((z4 && z3) ? 1.0f : 0.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda48
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatAttachAlert.this.lambda$setCaptionAbove$69(valueAnimator);
                }
            }).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.lambda$setCaptionAbove$70(z4, z3);
                }
            }).start();
            this.captionContainer.setVisibility(0);
            this.captionContainer.animate().translationY((z4 || !z3) ? this.captionContainer.getMeasuredHeight() : 0.0f).alpha((z4 || !z3) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda50
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatAttachAlert.this.lambda$setCaptionAbove$71(valueAnimator);
                }
            }).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlert.this.lambda$setCaptionAbove$72(z4, z3);
                }
            }).start();
        } else {
            this.topCommentContainer.setVisibility((z4 && z3) ? 0 : 8);
            this.topCommentContainer.setAlpha((z4 && z3) ? 1.0f : 0.0f);
            updatedTopCaptionHeight();
            this.captionContainer.setAlpha((z4 || !z3) ? 0.0f : 1.0f);
            this.captionContainer.setTranslationY((z4 || !z3) ? r13.getMeasuredHeight() : 0.0f);
            this.captionContainer.setVisibility((z4 || !z3) ? 8 : 0);
        }
        if (commentView != commentView2) {
            commentView.hidePopup(true);
            commentView2.setText(AnimatedEmojiSpan.cloneSpans(commentView.getText()));
            commentView2.getEditText().setAllowTextEntitiesIntersection(commentView.getEditText().getAllowTextEntitiesIntersection());
            if (commentView.getEditText().isFocused()) {
                commentView2.getEditText().requestFocus();
                commentView2.getEditText().setSelection(commentView.getEditText().getSelectionStart(), commentView.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlert.this.lambda$setCaptionAbove$73();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCaptionAbove$69(ValueAnimator valueAnimator) {
        updatedTopCaptionHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCaptionAbove$70(boolean z, boolean z2) {
        if (!z || !z2) {
            this.topCommentContainer.setVisibility(8);
        }
        updatedTopCaptionHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCaptionAbove$71(ValueAnimator valueAnimator) {
        this.frameLayout2.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCaptionAbove$72(boolean z, boolean z2) {
        if (z || !z2) {
            this.captionContainer.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCaptionAbove$73() {
        EditTextEmoji editTextEmoji = this.captionAbove ? this.topCommentTextView : this.commentTextView;
        showAiButton(editTextEmoji.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(editTextEmoji.getText().toString().trim()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatedTopCaptionHeight() {
        updateSelectedPosition(0);
        this.sizeNotifierFrameLayout.invalidate();
        this.topCommentContainer.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.checkCameraViewPosition();
            RecyclerListView recyclerListView = this.photoLayout.gridView;
            if (recyclerListView != null && recyclerListView.getFastScroll() != null) {
                this.photoLayout.gridView.getFastScroll().topOffset = ActionBar.getCurrentActionBarHeight() + this.photoLayout.listAdditionalH + (this.captionAbove ? (int) (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha()) : 0);
                this.photoLayout.gridView.getFastScroll().invalidate();
            }
        }
        updateCommentTextViewPosition();
        checkUi_writeButtonContainerY();
    }

    private void toggleCaptionAbove() {
        setCaptionAbove(!this.captionAbove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsEphemeralMessage(boolean z) {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment == null || !(baseFragment instanceof ChatActivity)) {
            return;
        }
        ChatActivity chatActivity = (ChatActivity) baseFragment;
        EditTextEmoji editTextEmoji = this.captionAbove ? this.topCommentTextView : this.commentTextView;
        this.animatorEphemeralMessageVisibility.setValue(this.editingMessageObject == null && (EphemeralMessagesHelper.getInstance(this.currentAccount).isEphemeralCommand(editTextEmoji != null ? editTextEmoji.getText().toString() : null, chatActivity.botInfo) || (chatActivity.getReplyMessage() != null && chatActivity.getReplyMessage().isEphemeral())), z);
    }

    public void blur3_InvalidateBlur() {
        boolean z;
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        ViewPositionWatcher.computeRectInParent(this.buttonsRecyclerViewWrapper, this.containerView, this.iBlur3PositionMainTabs);
        this.iBlur3PositionActionBar.set(0.0f, 0.0f, this.containerView.getMeasuredWidth(), this.actionBar.getMeasuredHeight());
        this.iBlur3PositionActionBar.inset(0.0f, -AndroidUtilities.dp(48.0f));
        this.iBlur3PositionMainTabs.set(0.0f, this.containerView.getMeasuredHeight() - (Math.max(AndroidUtilities.navigationBarHeight, getEmojiPadding()) + AndroidUtilities.dp(180.0f)), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (attachAlertLayout != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null || chatAttachAlertPhotoLayout.gridView.getFastScroll() == null) {
            z = false;
        } else {
            this.photoLayout.gridView.getFastScroll().fillDrawablesRect(this.iBlur3PositionFastScroll);
            RecyclerListView.FastScroll fastScroll = this.photoLayout.gridView.getFastScroll();
            ViewGroup viewGroup = this.containerView;
            RectF rectF = AndroidUtilities.rectTmp;
            ViewPositionWatcher.computeRectInParent(fastScroll, viewGroup, rectF);
            this.iBlur3PositionFastScroll.offset(rectF.left, rectF.top);
            this.iBlur3PositionFastScroll.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
            RectF rectF2 = this.iBlur3PositionFastScroll;
            rectF2.left = Math.max(0.0f, rectF2.left);
            this.iBlur3PositionFastScroll.right = Math.min(this.containerView.getMeasuredWidth(), this.iBlur3PositionFastScroll.right);
            z = true;
        }
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3PositionsMerged, RectFMergeBounding.mergeOverlapping(this.iBlur3Positions, z ? 3 : 2, this.iBlur3PositionsMerged));
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public static class SearchFadeView extends View {
        private final int bgKeyColor;
        private final GradientProtectionDrawable gradientProtectionDrawable;
        private final GradientProtectionDrawable gradientProtectionDrawable2;
        private final Theme.ResourcesProvider resourcesProvider;

        public SearchFadeView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.gradientProtectionDrawable = new GradientProtectionDrawable(2);
            this.gradientProtectionDrawable2 = new GradientProtectionDrawable(2);
            this.resourcesProvider = resourcesProvider;
            this.bgKeyColor = i;
        }

        @Override // android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            int i5 = AndroidUtilities.statusBarHeight;
            this.gradientProtectionDrawable.setInsets(0, AndroidUtilities.dp(12.0f) + i5, 0, 0);
            this.gradientProtectionDrawable.setBounds(0, 0, i, AndroidUtilities.dp(52.0f) + i5);
            this.gradientProtectionDrawable2.setInsets(0, i5 / 3, 0, 0);
            this.gradientProtectionDrawable2.setBounds(0, 0, i, i5);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            this.gradientProtectionDrawable.setColor(Theme.multAlpha(Theme.getColor(this.bgKeyColor, this.resourcesProvider), 0.5f));
            this.gradientProtectionDrawable.draw(canvas);
            this.gradientProtectionDrawable2.setColor(Theme.multAlpha(Theme.getColor(this.bgKeyColor, this.resourcesProvider), 0.95f));
            this.gradientProtectionDrawable2.draw(canvas);
        }
    }

    public void onPollAttachFilePicker(Intent intent) {
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (chatAttachAlertPollLayout != null) {
            chatAttachAlertPollLayout.onPollAttachFilePicker(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_fadeTopAlpha() {
        int i;
        if (this.fadeView == null || this.actionBar == null) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean isDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        ChatActivityFadeView chatActivityFadeView = this.fadeView;
        if (this.actionBar.getVisibility() == 0) {
            i = (int) ((isDark ? NotificationCenter.didReceiveSmsCode : NotificationCenter.screenshotTook) * this.actionBar.getAlpha());
        } else {
            i = 0;
        }
        chatActivityFadeView.setFadeTopAlpha(i);
    }

    public static class AttachSearchField extends FragmentSearchField {
        private final ChatAttachAlert parentAlert;

        public AttachSearchField(Context context, ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.parentAlert = chatAttachAlert;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.parentAlert.makeFocusable(this.editText, true);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }
}
