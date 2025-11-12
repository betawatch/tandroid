package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.ChatListItemAnimator;
import com.google.android.exoplayer2.util.Consumer;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import j$.util.Objects;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChooseSpeedLayout;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BitmapShaderTools;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPopupMenu;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.HashtagActivity;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.Reactions.AnimatedEmojiEffect;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SpeedIconDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.EmojiAnimationsOverlay;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.PaidReactionButton;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.SelfStoriesPreviewView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.WrappedResourceProvider;

/* loaded from: classes5.dex */
public abstract class PeerStoriesView extends SizeNotifierFrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean DISABLE_STORY_REPOSTING = false;
    private static int activeCount;
    private boolean BIG_SCREEN;
    private ActionBarMenuSubItem albumItem;
    private ViewGroup albumLayout;
    private boolean allowDrawSurface;
    Runnable allowDrawSurfaceRunnable;
    private boolean allowRepost;
    private boolean allowShare;
    private boolean allowShareLink;
    private float alpha;
    boolean animateKeyboardOpening;
    private float animatingKeyboardHeight;
    boolean areLiveCommentsDisabled;
    private boolean attachedToWindow;
    private final AvatarDrawable avatarDrawable;
    private final BitmapShaderTools bitmapShaderTools;
    private BlurredBackgroundColorProviderThemed blurredBackgroundColorProvider;
    private BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableFactory;
    private final BlurredBackgroundSourceColor blurredBackgroundSourceFallback;
    private final BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNodeWithSaturation;
    private final BlurredBackgroundSource blurredBackgroundSourceWithSaturation;
    private TL_stories.TL_premium_boostsStatus boostsStatus;
    private final LinearLayout bottomActionsLinearLayout;
    private ChannelBoostsController.CanApplyBoost canApplyBoost;
    private Runnable cancellableViews;
    private ValueAnimator changeBoundAnimator;
    ChatActivityEnterView chatActivityEnterView;
    private ChatAttachAlert chatAttachAlert;
    boolean checkBlackoutMode;
    private int classGuid;
    private final Path clipPath;
    private CommentButton commentButton;
    int count;
    private int currentAccount;
    private long currentImageTime;
    public final StoryItemHolder currentStory;
    ArrayList day;
    Delegate delegate;
    private boolean deletedPeer;
    private long dialogId;
    ArrayList documentsToPrepare;
    private boolean drawAnimatedEmojiAsMovingReaction;
    private boolean drawReactionEffect;
    public boolean editOpened;
    ActionBarMenuSubItem editStoryItem;
    private boolean editedPrivacy;
    private EmojiAnimationsOverlay emojiAnimationsOverlay;
    BlurredBackgroundDrawable emojiKeyboardBackground;
    private AnimatedEmojiEffect emojiReactionEffect;
    private int enterViewBottomOffset;
    private StoryFailView failView;
    private ViewPropertyAnimator failViewAnimator;
    public boolean forceUpdateOffsets;
    PeerHeaderView headerView;
    HintView2 highlightMessageHintView;
    private boolean imageChanged;
    private final ImageReceiver imageReceiver;
    boolean inBlackoutMode;
    Paint inputBackgroundPaint;
    Paint inputBottomBorderPaint;
    BlurredBackgroundDrawable inputFieldBackground;
    Paint inputTopBorderPaint;
    private InstantCameraView instantCameraView;
    boolean isActive;
    private boolean isCaptionPartVisible;
    boolean isChannel;
    private boolean isEditing;
    private boolean isFailed;
    boolean isGroup;
    private boolean isLongPressed;
    boolean isPremiumBlocked;
    private boolean isRecording;
    boolean isSelf;
    private boolean isUploading;
    private boolean isVisible;
    ValueAnimator keyboardAnimator;
    public boolean keyboardVisible;
    float lastAnimatingKeyboardHeight;
    private long lastDrawTime;
    int lastKeyboardHeight;
    private boolean lastNoThumb;
    int lastOpenedKeyboardHeight;
    private final ImageReceiver leftPreloadImageReceiver;
    private final FrameLayout likeButtonContainer;
    private ReactionsContainerLayout likesReactionLayout;
    private float likesReactionShowProgress;
    private boolean likesReactionShowing;
    private AnimatedFloat linesAlpha;
    private int linesCount;
    private int linesPosition;
    private int listPosition;
    public final LiveCommentsView liveCommentsView;
    private HintView mediaBanTooltip;
    private MentionsContainerView mentionContainer;
    private boolean messageSent;
    private long messageStars;
    private boolean movingReaction;
    private int movingReactionFromSize;
    private int movingReactionFromX;
    private int movingReactionFromY;
    private float movingReactionProgress;
    private MuteButton muteButton;
    private final FrameLayout muteIconContainer;
    private final RLottieImageView muteIconView;
    private float muteIconViewAlpha;
    private final ImageView noSoundIconView;
    final AnimationNotificationsLocker notificationsLocker;
    private Runnable onImageReceiverThumbLoaded;
    private final ImageView optionsIconView;
    private ValueAnimator outAnimator;
    private float outT;
    RoundRectOutlineProvider outlineProvider;
    private boolean paused;
    public PinchToZoomHelper pinchToZoomHelper;
    final VideoPlayerSharedScope playerSharedScope;
    CustomPopupMenu popupMenu;
    private final ArrayList preloadReactionHolders;
    private LinearLayout premiumBlockedText;
    private TextView premiumBlockedText1;
    private TextView premiumBlockedText2;
    private float prevToHideProgress;
    private int previousSelectedPotision;
    private final StoryPrivacyButton privacyButton;
    private HintView2 privacyHint;
    float progressToDismiss;
    private AnimatedFloat progressToHideInterface;
    float progressToKeyboard;
    AnimatedFloat progressToRecording;
    float progressToReply;
    AnimatedFloat progressToStickerExpanded;
    AnimatedFloat progressToTextA;
    private ImageReceiver reactionEffectImageReceiver;
    private AnimatedEmojiDrawable reactionMoveDrawable;
    private ImageReceiver reactionMoveImageReceiver;
    private int reactionsContainerIndex;
    ReactionsContainerLayout reactionsContainerLayout;
    private AnimatedTextView.AnimatedTextDrawable reactionsCounter;
    private AnimatedFloat reactionsCounterProgress;
    private boolean reactionsCounterVisible;
    private HintView2 reactionsLongpressTooltip;
    private Runnable reactionsTooltipRunnable;
    private int realKeyboardHeight;
    private TextView replyDisabledTextView;
    private ImageView repostButton;
    private FrameLayout repostButtonContainer;
    private AnimatedTextView.AnimatedTextDrawable repostCounter;
    private AnimatedFloat repostCounterProgress;
    private boolean repostCounterVisible;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ImageReceiver rightPreloadImageReceiver;
    private int selectedPosition;
    private View selfAvatarsContainer;
    private AvatarsImageView selfAvatarsView;
    private TextView selfStatusView;
    private FrameLayout selfView;
    private TLRPC.TL_channels_sendAsPeers sendAsPeersObj;
    public ShareAlert shareAlert;
    private final ImageView shareButton;
    final SharedResources sharedResources;
    private int shiftDp;
    private final Runnable showTapToSoundHint;
    boolean showViewsProgress;
    private HintView2 soundTooltip;
    private ActionBarMenuSubItem speedItem;
    private ChooseSpeedLayout speedLayout;
    private PaidReactionButton starsButton;
    private PaidReactionButton.PaidReactionButtonEffectsView starsButtonEffectsView;
    long starsPriceBlocked;
    private boolean stealthModeIsActive;
    StoriesController storiesController;
    private StoriesLikeButton storiesLikeButton;
    private StoryMediaAreasView storyAreasView;
    private final StoryCaptionView storyCaptionView;
    public FrameLayout storyContainer;
    private CaptionContainerView storyEditCaptionView;
    final ArrayList storyItems;
    private final StoryLinesDrawable storyLines;
    private StoryPositionView storyPositionView;
    private final StoryViewer storyViewer;
    private boolean switchEventSent;
    private long titleLastDialogId;
    private boolean titleLastLive;
    public FrameLayout topBulletinContainer;
    private int totalStoriesCount;
    public boolean unsupported;
    private FrameLayout unsupportedContainer;
    Runnable updateStealthModeTimer;
    final ArrayList uploadingStories;
    ArrayList uriesToPrepare;
    private boolean userCanSeeViews;
    TL_stories.PeerStories userStories;
    public long videoDuration;
    private float viewsThumbAlpha;
    private SelfStoriesPreviewView.ImageHolder viewsThumbImageReceiver;
    private float viewsThumbPivotY;
    private float viewsThumbScale;
    private boolean wasBigScreen;
    private int watchersCount;

    public interface Delegate {
        int getKeyboardHeight();

        float getProgressToDismiss();

        boolean isClosed();

        void onPeerSelected(long j, int i);

        void preparePlayer(ArrayList arrayList, ArrayList arrayList2);

        boolean releasePlayer(Runnable runnable);

        void requestAdjust(boolean z);

        void requestPlayer(long j, int i, boolean z, TLRPC.InputGroupCall inputGroupCall, VideoPlayerSharedScope videoPlayerSharedScope);

        void requestPlayer(TLRPC.Document document, Uri uri, long j, VideoPlayerSharedScope videoPlayerSharedScope);

        void setAllowTouchesByViewPager(boolean z);

        void setBulletinIsVisible(boolean z);

        void setHideEnterViewProgress(float f);

        void setIsCaption(boolean z);

        void setIsCaptionPartVisible(boolean z);

        void setIsHintVisible(boolean z);

        void setIsInPinchToZoom(boolean z);

        void setIsInSelectionMode(boolean z);

        void setIsLikesReaction(boolean z);

        void setIsRecording(boolean z);

        void setIsSwiping(boolean z);

        void setIsWaiting(boolean z);

        void setKeyboardVisible(boolean z);

        void setPopupIsVisible(boolean z);

        void setTranslating(boolean z);

        void shouldSwitchToNext();

        void showDialog(Dialog dialog);

        void switchToNextAndRemoveCurrentPeer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean drawLinesAsCounter() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hideCaptionWithInterface() {
        return true;
    }

    public abstract boolean isSelectedPeer();

    static /* synthetic */ long access$2914(PeerStoriesView peerStoriesView, long j) {
        long j2 = peerStoriesView.currentImageTime + j;
        peerStoriesView.currentImageTime = j2;
        return j2;
    }

    public PeerStoriesView(final Context context, final StoryViewer storyViewer, final SharedResources sharedResources, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.allowDrawSurface = true;
        this.preloadReactionHolders = new ArrayList();
        this.shiftDp = -5;
        this.alpha = 1.0f;
        this.previousSelectedPotision = -1;
        StoryItemHolder storyItemHolder = new StoryItemHolder();
        this.currentStory = storyItemHolder;
        this.progressToKeyboard = -1.0f;
        this.progressToDismiss = -1.0f;
        this.lastAnimatingKeyboardHeight = -1.0f;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.progressToHideInterface = new AnimatedFloat(this);
        this.linesAlpha = new AnimatedFloat(this);
        this.pinchToZoomHelper = new PinchToZoomHelper();
        this.muteIconViewAlpha = 1.0f;
        this.updateStealthModeTimer = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$new$42();
            }
        };
        this.showTapToSoundHint = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$new$50();
            }
        };
        this.uriesToPrepare = new ArrayList();
        this.documentsToPrepare = new ArrayList();
        this.allowDrawSurfaceRunnable = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView.34
            @Override // java.lang.Runnable
            public void run() {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (peerStoriesView.isActive && peerStoriesView.allowDrawSurface) {
                    PeerStoriesView.this.delegate.setIsSwiping(false);
                }
            }
        };
        this.progressToRecording = new AnimatedFloat(this);
        this.progressToTextA = new AnimatedFloat(this);
        this.progressToStickerExpanded = new AnimatedFloat(this);
        this.clipPath = new Path();
        this.pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView.1
            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public /* synthetic */ TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.-CC.$default$getCurrentTextureView(this);
            }

            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public void onZoomStarted(MessageObject messageObject) {
                PeerStoriesView.this.delegate.setIsInPinchToZoom(true);
            }

            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public void onZoomFinished(MessageObject messageObject) {
                PeerStoriesView.this.delegate.setIsInPinchToZoom(false);
            }
        });
        this.playerSharedScope = new VideoPlayerSharedScope();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.storyItems = new ArrayList();
        this.uploadingStories = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver() { // from class: org.telegram.ui.Stories.PeerStoriesView.2
            @Override // org.telegram.messenger.ImageReceiver
            protected boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
                if (i == 1 && PeerStoriesView.this.onImageReceiverThumbLoaded != null) {
                    PeerStoriesView.this.onImageReceiverThumbLoaded.run();
                    PeerStoriesView.this.onImageReceiverThumbLoaded = null;
                }
                return imageBitmapByKey;
            }
        };
        this.imageReceiver = imageReceiver;
        imageReceiver.setCrossfadeWithOldImage(false);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(0);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.reactionEffectImageReceiver = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        ImageReceiver imageReceiver3 = this.reactionEffectImageReceiver;
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(3);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.reactionMoveImageReceiver = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        ImageReceiver imageReceiver5 = this.reactionMoveImageReceiver;
        imageReceiver5.ignoreNotifications = true;
        imageReceiver5.setFileLoadingPriority(3);
        ImageReceiver imageReceiver6 = new ImageReceiver();
        this.leftPreloadImageReceiver = imageReceiver6;
        imageReceiver6.setAllowLoadingOnAttachedOnly(true);
        imageReceiver6.ignoreNotifications = true;
        imageReceiver6.setFileLoadingPriority(0);
        ImageReceiver imageReceiver7 = new ImageReceiver();
        this.rightPreloadImageReceiver = imageReceiver7;
        imageReceiver7.setAllowLoadingOnAttachedOnly(true);
        imageReceiver7.ignoreNotifications = true;
        imageReceiver7.setFileLoadingPriority(0);
        imageReceiver.setPreloadingReceivers(Arrays.asList(imageReceiver6, imageReceiver7));
        this.avatarDrawable = new AvatarDrawable();
        this.storyViewer = storyViewer;
        this.sharedResources = sharedResources;
        this.bitmapShaderTools = sharedResources.bitmapShaderTools;
        this.storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        sharedResources.dimPaint.setColor(-16777216);
        this.inputBackgroundPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.inputTopBorderPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.inputTopBorderPaint.setColor(687865855);
        Paint paint2 = new Paint(1);
        this.inputBottomBorderPaint = paint2;
        paint2.setStyle(style);
        this.inputBottomBorderPaint.setColor(352321535);
        this.resourcesProvider = resourcesProvider;
        setClipChildren(false);
        this.storyAreasView = new StoryMediaAreasView(context, this.storyContainer, resourcesProvider) { // from class: org.telegram.ui.Stories.PeerStoriesView.3
            @Override // org.telegram.ui.Stories.StoryMediaAreasView
            protected void onHintVisible(boolean z) {
                Delegate delegate = PeerStoriesView.this.delegate;
                if (delegate != null) {
                    delegate.setIsHintVisible(z);
                }
            }

            @Override // org.telegram.ui.Stories.StoryMediaAreasView
            protected void presentFragment(BaseFragment baseFragment) {
                StoryViewer storyViewer2 = storyViewer;
                if (storyViewer2 != null) {
                    storyViewer2.presentFragment(baseFragment);
                }
            }

            @Override // org.telegram.ui.Stories.StoryMediaAreasView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return super.onTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override // org.telegram.ui.Stories.StoryMediaAreasView
            public void showEffect(StoryReactionWidgetView storyReactionWidgetView) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (!peerStoriesView.isSelf && peerStoriesView.currentStory.storyItem != null) {
                    ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(storyReactionWidgetView.mediaArea.reaction);
                    if (!Objects.equals(fromTL, ReactionsLayoutInBubble.VisibleReaction.fromTL(PeerStoriesView.this.currentStory.storyItem.sent_reaction))) {
                        PeerStoriesView.this.likeStory(fromTL);
                    }
                }
                storyReactionWidgetView.performHapticFeedback(3);
                storyReactionWidgetView.playAnimation();
                PeerStoriesView.this.emojiAnimationsOverlay.showAnimationForWidget(storyReactionWidgetView);
            }

            @Override // org.telegram.ui.Stories.StoryMediaAreasView
            protected Bitmap getPlayingBitmap() {
                return PeerStoriesView.this.getPlayingBitmap();
            }
        };
        this.blurredBackgroundColorProvider = new BlurredBackgroundColorProviderThemed(resourcesProvider, Theme.key_chat_messagePanelBackground, 0.8f);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.blurredBackgroundSourceFallback = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceColor);
            this.blurredBackgroundSourceRenderNodeWithSaturation = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setBlur(AndroidUtilities.dp(8.0f));
            this.blurredBackgroundSourceWithSaturation = blurredBackgroundSourceRenderNode;
        } else {
            this.blurredBackgroundSourceRenderNodeWithSaturation = null;
            this.blurredBackgroundSourceWithSaturation = blurredBackgroundSourceColor;
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(new ViewPositionWatcher(this), this, this.blurredBackgroundSourceWithSaturation);
        this.blurredBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory;
        this.inputFieldBackground = blurredBackgroundDrawableViewFactory.create(this, this.blurredBackgroundColorProvider);
        BlurredBackgroundDrawable create = this.blurredBackgroundDrawableFactory.create(this, this.blurredBackgroundColorProvider);
        this.emojiKeyboardBackground = create;
        create.setThickness(AndroidUtilities.dp(32.0f));
        4 r0 = new 4(context, sharedResources, storyViewer);
        this.storyContainer = r0;
        r0.setClipChildren(false);
        this.emojiAnimationsOverlay = new EmojiAnimationsOverlay(this.storyContainer, this.currentAccount);
        this.storyContainer.addView(this.storyAreasView, LayoutHelper.createFrame(-1, -1.0f));
        5 r5 = new 5(getContext(), storyViewer.resourcesProvider, storyViewer, resourcesProvider);
        this.storyCaptionView = r5;
        r5.captionTextview.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$new$0(view);
            }
        });
        ImageView imageView = new ImageView(context);
        this.shareButton = imageView;
        imageView.setImageDrawable(sharedResources.shareDrawable);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$new$1(view);
            }
        });
        ScaleStateListAnimator.apply(imageView);
        if (!DISABLE_STORY_REPOSTING) {
            ImageView imageView2 = new ImageView(context);
            this.repostButton = imageView2;
            imageView2.setImageDrawable(sharedResources.repostDrawable);
            this.repostButton.setPadding(dp, dp, dp, dp);
            FrameLayout frameLayout = new FrameLayout(getContext()) { // from class: org.telegram.ui.Stories.PeerStoriesView.6
                @Override // android.view.ViewGroup, android.view.View
                protected void dispatchDraw(Canvas canvas) {
                    super.dispatchDraw(canvas);
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    if (!peerStoriesView.isChannel || peerStoriesView.repostCounter == null) {
                        return;
                    }
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - PeerStoriesView.this.repostCounter.getCurrentWidth()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float f = PeerStoriesView.this.repostCounterProgress.set(PeerStoriesView.this.repostCounterVisible ? 1.0f : 0.0f);
                    canvas.scale(f, f, PeerStoriesView.this.repostCounter.getCurrentWidth() / 2.0f, AndroidUtilities.dp(20.0f));
                    PeerStoriesView.this.repostCounter.setAlpha(NotificationCenter.didReplacedPhotoInMemCache);
                    PeerStoriesView.this.repostCounter.draw(canvas);
                    canvas.restore();
                }

                @Override // android.view.View
                protected boolean verifyDrawable(Drawable drawable) {
                    return drawable == PeerStoriesView.this.repostCounter || super.verifyDrawable(drawable);
                }
            };
            this.repostButtonContainer = frameLayout;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.repostCounter;
            if (animatedTextDrawable != null) {
                animatedTextDrawable.setCallback(frameLayout);
            }
            this.repostButtonContainer.setWillNotDraw(false);
            this.repostButtonContainer.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PeerStoriesView.this.lambda$new$2(view);
                }
            });
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext()) { // from class: org.telegram.ui.Stories.PeerStoriesView.7
            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (!peerStoriesView.isChannel || peerStoriesView.reactionsCounter == null) {
                    return;
                }
                canvas.save();
                canvas.translate((getMeasuredWidth() - PeerStoriesView.this.reactionsCounter.getCurrentWidth()) - AndroidUtilities.dp(6.0f), 0.0f);
                float f = PeerStoriesView.this.reactionsCounterProgress.set(PeerStoriesView.this.reactionsCounterVisible ? 1.0f : 0.0f);
                canvas.scale(f, f, PeerStoriesView.this.reactionsCounter.getCurrentWidth() / 2.0f, AndroidUtilities.dp(20.0f));
                PeerStoriesView.this.reactionsCounter.setAlpha(NotificationCenter.didReplacedPhotoInMemCache);
                PeerStoriesView.this.reactionsCounter.draw(canvas);
                canvas.restore();
            }

            @Override // android.view.View
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == PeerStoriesView.this.reactionsCounter || super.verifyDrawable(drawable);
            }
        };
        this.likeButtonContainer = frameLayout2;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.reactionsCounter;
        if (animatedTextDrawable2 != null) {
            animatedTextDrawable2.setCallback(frameLayout2);
        }
        frameLayout2.setWillNotDraw(false);
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$new$4(view);
            }
        });
        frameLayout2.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda9
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$new$5;
                lambda$new$5 = PeerStoriesView.this.lambda$new$5(storyViewer, view);
                return lambda$new$5;
            }
        });
        StoriesLikeButton storiesLikeButton = new StoriesLikeButton(context, sharedResources);
        this.storiesLikeButton = storiesLikeButton;
        storiesLikeButton.setPadding(dp, dp, dp, dp);
        frameLayout2.addView(this.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
        FrameLayout frameLayout3 = this.repostButtonContainer;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.repostButton, LayoutHelper.createFrame(40, 40, 3));
        }
        ScaleStateListAnimator.apply(frameLayout2, 0.3f, 5.0f);
        FrameLayout frameLayout4 = this.repostButtonContainer;
        if (frameLayout4 != null) {
            ScaleStateListAnimator.apply(frameLayout4, 0.3f, 5.0f);
        }
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setParentView(this.storyContainer);
        RoundRectOutlineProvider roundRectOutlineProvider = new RoundRectOutlineProvider(10);
        this.outlineProvider = roundRectOutlineProvider;
        this.storyContainer.setOutlineProvider(roundRectOutlineProvider);
        this.storyContainer.setClipToOutline(true);
        addView(this.storyContainer);
        PeerHeaderView peerHeaderView = new PeerHeaderView(context, storyItemHolder);
        this.headerView = peerHeaderView;
        peerHeaderView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$new$6(storyViewer, view);
            }
        });
        this.storyContainer.addView(this.headerView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        this.topBulletinContainer = new FrameLayout(context);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.bottomActionsLinearLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, LayoutHelper.createLinear(40, 40, 5));
        FrameLayout frameLayout5 = this.repostButtonContainer;
        if (frameLayout5 != null) {
            linearLayout.addView(frameLayout5, LayoutHelper.createLinear(40, 40, 5));
        }
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(40, 40, 5));
        addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.optionsIconView = imageView3;
        imageView3.setImageDrawable(sharedResources.optionsDrawable);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(Theme.createSelectorDrawable(-1));
        this.storyContainer.addView(imageView3, LayoutHelper.createFrame(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$new$7(resourcesProvider, storyViewer, context, sharedResources, view);
            }
        });
        FrameLayout frameLayout6 = new FrameLayout(context) { // from class: org.telegram.ui.Stories.PeerStoriesView.9
            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return super.onTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.muteIconContainer = frameLayout6;
        this.storyContainer.addView(frameLayout6, LayoutHelper.createFrame(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteIconView = rLottieImageView;
        rLottieImageView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        frameLayout6.addView(rLottieImageView);
        ImageView imageView4 = new ImageView(context);
        this.noSoundIconView = imageView4;
        imageView4.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView4.setImageDrawable(sharedResources.noSoundDrawable);
        frameLayout6.addView(imageView4);
        imageView4.setVisibility(8);
        StoryPrivacyButton storyPrivacyButton = new StoryPrivacyButton(context);
        this.privacyButton = storyPrivacyButton;
        storyPrivacyButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$new$9(view);
            }
        });
        this.storyContainer.addView(storyPrivacyButton, LayoutHelper.createFrame(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        frameLayout6.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$new$10(storyViewer, view);
            }
        });
        this.storyLines = new StoryLinesDrawable(this, sharedResources);
        this.storyContainer.addView(r5, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        LiveCommentsView liveCommentsView = new LiveCommentsView(context, storyViewer, storyViewer.containerView, this.topBulletinContainer) { // from class: org.telegram.ui.Stories.PeerStoriesView.10
            @Override // org.telegram.ui.Stories.LiveCommentsView
            protected TLRPC.Peer getDefaultSendAs() {
                LivePlayer livePlayer = storyViewer.livePlayer;
                if (livePlayer != null) {
                    return livePlayer.getDefaultSendAs();
                }
                return null;
            }

            @Override // org.telegram.ui.Stories.LiveCommentsView
            protected boolean isMe(long j) {
                if (j == UserConfig.getInstance(PeerStoriesView.this.currentAccount).getClientUserId()) {
                    return true;
                }
                LivePlayer livePlayer = storyViewer.livePlayer;
                if (livePlayer != null && j == DialogObject.getPeerDialogId(livePlayer.getDefaultSendAs())) {
                    return true;
                }
                if (PeerStoriesView.this.sendAsPeersObj != null) {
                    for (int i = 0; i < PeerStoriesView.this.sendAsPeersObj.peers.size(); i++) {
                        if (j == DialogObject.getPeerDialogId(PeerStoriesView.this.sendAsPeersObj.peers.get(i).peer)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // org.telegram.ui.Stories.LiveCommentsView
            public void setCollapsed(boolean z, boolean z2) {
                super.setCollapsed(z, z2);
                if (PeerStoriesView.this.commentButton != null) {
                    PeerStoriesView.this.commentButton.setCollapsed(z, z2);
                }
            }

            @Override // org.telegram.ui.Stories.LiveCommentsView
            protected void onMessagesCountUpdated() {
                if (PeerStoriesView.this.commentButton != null) {
                    PeerStoriesView.this.commentButton.setCount(getUnreadMessagesCount());
                }
            }

            @Override // org.telegram.ui.Stories.LiveCommentsView
            protected void onStarsCountUpdated() {
                PeerStoriesView.this.starsButton.setCount((int) getStarsCount());
                PeerStoriesView.this.starsButton.setFilled(areSendingStars());
            }

            @Override // org.telegram.ui.Stories.LiveCommentsView
            protected void onStarsButtonPressed(long j, boolean z) {
                if (z) {
                    PeerStoriesView.this.starsButton.playEffect(j);
                } else {
                    PeerStoriesView.this.starsButton.stopEffects();
                }
            }

            @Override // org.telegram.ui.Stories.LiveCommentsView
            protected void onStarReaction(long j, int i, int i2) {
                if (PeerStoriesView.this.starsButtonEffectsView == null) {
                    return;
                }
                PeerStoriesView.this.starsButtonEffectsView.pushChip(j, i, i2);
            }

            @Override // org.telegram.ui.Stories.LiveCommentsView
            protected void onCancelledStarReaction(long j) {
                if (PeerStoriesView.this.starsButtonEffectsView == null) {
                    return;
                }
                PeerStoriesView.this.starsButtonEffectsView.removeChipsFrom(j);
            }

            @Override // org.telegram.ui.Stories.LiveCommentsView
            protected void onStarsButtonCancelled() {
                PeerStoriesView.this.starsButton.stopEffects();
            }
        };
        this.liveCommentsView = liveCommentsView;
        this.storyContainer.addView(liveCommentsView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        this.storyContainer.addView(this.topBulletinContainer, LayoutHelper.createFrame(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        frameLayout6.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        imageView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        frameLayout2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        FrameLayout frameLayout7 = this.repostButtonContainer;
        if (frameLayout7 != null) {
            frameLayout7.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        }
        View overlayView = r5.textSelectionHelper.getOverlayView(context);
        if (overlayView != null) {
            AndroidUtilities.removeFromParent(overlayView);
            addView(overlayView);
        }
        r5.textSelectionHelper.setCallback(new TextSelectionHelper.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView.11
            @Override // org.telegram.ui.Cells.TextSelectionHelper.Callback
            public void onStateChanged(boolean z) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.delegate.setIsInSelectionMode(peerStoriesView.storyCaptionView.textSelectionHelper.isInSelectionMode());
            }
        });
        r5.textSelectionHelper.setParentView(this);
    }

    class 4 extends HwFrameLayout {
        boolean drawOverlayed;
        final CellFlickerDrawable loadingDrawable;
        final AnimatedFloat loadingDrawableAlpha;
        final AnimatedFloat loadingDrawableAlpha2;
        final AnimatedFloat progressToAudio;
        final AnimatedFloat progressToFullBlackoutA;
        boolean splitDrawing;
        final /* synthetic */ SharedResources val$sharedResources;
        final /* synthetic */ StoryViewer val$storyViewer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        4(Context context, SharedResources sharedResources, StoryViewer storyViewer) {
            super(context);
            this.val$sharedResources = sharedResources;
            this.val$storyViewer = storyViewer;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            this.progressToAudio = new AnimatedFloat(this, 150L, cubicBezierInterpolator);
            this.progressToFullBlackoutA = new AnimatedFloat(this, 150L, cubicBezierInterpolator);
            this.loadingDrawable = new CellFlickerDrawable(32, 102, NotificationCenter.appConfigUpdated);
            AnimatedFloat animatedFloat = new AnimatedFloat(this);
            this.loadingDrawableAlpha2 = animatedFloat;
            AnimatedFloat animatedFloat2 = new AnimatedFloat(this);
            this.loadingDrawableAlpha = animatedFloat2;
            animatedFloat.setDuration(500L);
            animatedFloat2.setDuration(100L);
        }

        /* JADX WARN: Code restructure failed: missing block: B:208:0x01f5, code lost:
        
            if (r16.this$0.playerSharedScope.player.paused != false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01c4, code lost:
        
            if (r2.isEmptyStream() != false) goto L89;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x05ef  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x05f9  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x064b  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0659  */
        /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void dispatchDraw(Canvas canvas) {
            float f;
            PeerStoriesView peerStoriesView;
            boolean z;
            boolean hasNotThumb;
            StoryViewer.VideoPlayerHolder videoPlayerHolder;
            PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
            if (!peerStoriesView2.isActive) {
                peerStoriesView2.headerView.backupImageView.getImageReceiver().setVisible(true, true);
            }
            PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
            if (!peerStoriesView3.unsupported) {
                if (peerStoriesView3.playerSharedScope.renderView != null || (peerStoriesView3.storyAreasView != null && (PeerStoriesView.this.storyAreasView.hasSelectedForScale() || PeerStoriesView.this.storyAreasView.parentHighlightScaleAlpha.isInProgress()))) {
                    invalidate();
                }
                canvas.save();
                PeerStoriesView.this.pinchToZoomHelper.applyTransform(canvas);
                PeerStoriesView peerStoriesView4 = PeerStoriesView.this;
                VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView4.playerSharedScope;
                View view = videoPlayerSharedScope.renderView;
                if (view != null && (videoPlayerSharedScope.firstFrameRendered || videoPlayerSharedScope.livePlayer != null)) {
                    if (!peerStoriesView4.imageReceiver.hasBitmapImage()) {
                        this.val$sharedResources.imageBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        this.val$sharedResources.imageBackgroundDrawable.draw(canvas);
                    }
                    PeerStoriesView.this.imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    PeerStoriesView.this.imageReceiver.draw(canvas);
                    PeerStoriesView peerStoriesView5 = PeerStoriesView.this;
                    if (peerStoriesView5.isActive) {
                        if (this.val$storyViewer.USE_SURFACE_VIEW && (videoPlayerHolder = peerStoriesView5.playerSharedScope.player) != null && videoPlayerHolder.paused && videoPlayerHolder.playerStubBitmap != null && videoPlayerHolder.stubAvailable) {
                            canvas.save();
                            canvas.scale(getMeasuredWidth() / PeerStoriesView.this.playerSharedScope.player.playerStubBitmap.getWidth(), getMeasuredHeight() / PeerStoriesView.this.playerSharedScope.player.playerStubBitmap.getHeight());
                            StoryViewer.VideoPlayerHolder videoPlayerHolder2 = PeerStoriesView.this.playerSharedScope.player;
                            canvas.drawBitmap(videoPlayerHolder2.playerStubBitmap, 0.0f, 0.0f, videoPlayerHolder2.playerStubPaint);
                            canvas.restore();
                        } else {
                            boolean z2 = Build.VERSION.SDK_INT >= 29 && peerStoriesView5.blurredBackgroundSourceRenderNodeWithSaturation != null && PeerStoriesView.this.blurredBackgroundSourceRenderNodeWithSaturation.isRecordingCanvas(canvas);
                            if (!this.val$storyViewer.USE_SURFACE_VIEW || (PeerStoriesView.this.allowDrawSurface && this.val$storyViewer.isShown() && !z2)) {
                                PeerStoriesView.this.playerSharedScope.renderView.draw(canvas);
                            }
                        }
                    }
                } else {
                    if (view != null) {
                        invalidate();
                    }
                    PeerStoriesView peerStoriesView6 = PeerStoriesView.this;
                    if (!peerStoriesView6.currentStory.skipped) {
                        if (!peerStoriesView6.imageReceiver.hasBitmapImage()) {
                            this.val$sharedResources.imageBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                            this.val$sharedResources.imageBackgroundDrawable.draw(canvas);
                        }
                        PeerStoriesView.this.imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                        PeerStoriesView.this.imageReceiver.draw(canvas);
                    } else {
                        canvas.drawColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
                    }
                }
                canvas.restore();
                if (PeerStoriesView.this.imageChanged) {
                    this.loadingDrawableAlpha2.set(0.0f, true);
                    this.loadingDrawableAlpha.set(0.0f, true);
                }
                if (PeerStoriesView.this.currentStory.isLive) {
                    VideoPlayerSharedScope videoPlayerSharedScope2 = PeerStoriesView.this.playerSharedScope;
                    LivePlayer livePlayer = videoPlayerSharedScope2.livePlayer;
                    if (livePlayer != null) {
                        if (!videoPlayerSharedScope2.firstFrameRendered) {
                        }
                        hasNotThumb = true;
                    }
                    hasNotThumb = false;
                } else if (!PeerStoriesView.this.currentStory.isVideo) {
                    hasNotThumb = PeerStoriesView.this.imageReceiver.hasNotThumb();
                } else {
                    VideoPlayerSharedScope videoPlayerSharedScope3 = PeerStoriesView.this.playerSharedScope;
                    if (videoPlayerSharedScope3.renderView != null) {
                        StoryViewer.VideoPlayerHolder videoPlayerHolder3 = videoPlayerSharedScope3.player;
                        if (videoPlayerHolder3 != null) {
                            if (videoPlayerSharedScope3.firstFrameRendered) {
                                if (videoPlayerHolder3.progress == 0.0f) {
                                    if (videoPlayerSharedScope3.isBuffering()) {
                                    }
                                }
                                hasNotThumb = true;
                            }
                        }
                    }
                    hasNotThumb = false;
                }
                AnimatedFloat animatedFloat = this.loadingDrawableAlpha2;
                PeerStoriesView peerStoriesView7 = PeerStoriesView.this;
                animatedFloat.set((peerStoriesView7.isActive && !hasNotThumb && peerStoriesView7.currentStory.uploadingStory == null) ? 1.0f : 0.0f);
                this.loadingDrawableAlpha.set(this.loadingDrawableAlpha2.get() == 1.0f ? 1.0f : 0.0f);
                if (this.loadingDrawableAlpha.get() > 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.loadingDrawable.setAlpha((int) (this.loadingDrawableAlpha.get() * 255.0f));
                    this.loadingDrawable.setParentWidth(getMeasuredWidth() * 2);
                    CellFlickerDrawable cellFlickerDrawable = this.loadingDrawable;
                    cellFlickerDrawable.animationSpeedScale = 1.3f;
                    cellFlickerDrawable.draw(canvas, rectF, AndroidUtilities.dp(10.0f), this);
                }
                PeerStoriesView.this.imageChanged = false;
            } else {
                canvas.drawColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
            }
            if (PeerStoriesView.this.storyCaptionView.getAlpha() > 0.0f) {
                if (PeerStoriesView.this.storyCaptionView.getAlpha() != 1.0f) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, PeerStoriesView.this.storyCaptionView.getMeasuredWidth(), PeerStoriesView.this.storyCaptionView.getMeasuredHeight(), (int) (PeerStoriesView.this.storyCaptionView.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                PeerStoriesView.this.storyAreasView.draw(canvas);
                canvas.restore();
            }
            if (!PeerStoriesView.this.lastNoThumb && PeerStoriesView.this.imageReceiver.hasNotThumb()) {
                PeerStoriesView.this.lastNoThumb = true;
                PeerStoriesView.this.invalidate();
            }
            float hideInterfaceAlpha = PeerStoriesView.this.getHideInterfaceAlpha();
            this.val$sharedResources.topOverlayGradient.setAlpha(NotificationCenter.didReplacedPhotoInMemCache);
            this.val$sharedResources.topOverlayGradient.draw(canvas);
            PeerStoriesView peerStoriesView8 = PeerStoriesView.this;
            if (peerStoriesView8.isSelf || !peerStoriesView8.BIG_SCREEN || PeerStoriesView.this.storyCaptionView.getVisibility() == 0) {
                if (PeerStoriesView.this.storyCaptionView.getVisibility() == 0) {
                    int dp = AndroidUtilities.dp(72.0f);
                    int textTop = ((int) (PeerStoriesView.this.storyCaptionView.getTextTop() - AndroidUtilities.dp(24.0f))) + PeerStoriesView.this.storyCaptionView.getTop();
                    int i = dp + textTop;
                    float measuredHeight = getMeasuredHeight() * 0.65f;
                    boolean hideCaptionWithInterface = PeerStoriesView.this.hideCaptionWithInterface();
                    if ((measuredHeight - textTop) / AndroidUtilities.dp(60.0f) <= 0.0f || !PeerStoriesView.this.storyCaptionView.isTouched() || !PeerStoriesView.this.storyCaptionView.hasScroll()) {
                        PeerStoriesView peerStoriesView9 = PeerStoriesView.this;
                        if (peerStoriesView9.checkBlackoutMode) {
                            peerStoriesView9.checkBlackoutMode = false;
                            if ((measuredHeight - (((int) (peerStoriesView9.storyCaptionView.getMaxTop() - AndroidUtilities.dp(24.0f))) + PeerStoriesView.this.storyCaptionView.getTop())) / AndroidUtilities.dp(60.0f) > 0.0f) {
                                PeerStoriesView.this.inBlackoutMode = true;
                            }
                        } else if (peerStoriesView9.storyCaptionView.getProgressToBlackout() == 0.0f) {
                            PeerStoriesView.this.inBlackoutMode = false;
                        }
                    } else if ((measuredHeight - (((int) (PeerStoriesView.this.storyCaptionView.getMaxTop() - AndroidUtilities.dp(24.0f))) + PeerStoriesView.this.storyCaptionView.getTop())) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        PeerStoriesView.this.inBlackoutMode = true;
                    }
                    if (!hideCaptionWithInterface) {
                        hideInterfaceAlpha = 1.0f;
                    }
                    f = this.progressToFullBlackoutA.set(PeerStoriesView.this.inBlackoutMode ? 1.0f : 0.0f);
                    if (f > 0.0f) {
                        this.splitDrawing = true;
                        this.drawOverlayed = false;
                        super.dispatchDraw(canvas);
                        this.splitDrawing = false;
                        drawLines(canvas);
                        this.val$sharedResources.gradientBackgroundPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (153.0f * f * hideInterfaceAlpha)));
                        canvas.drawPaint(this.val$sharedResources.gradientBackgroundPaint);
                    }
                    if (f < 1.0f && !PeerStoriesView.this.currentStory.isLive) {
                        canvas.save();
                        float f2 = 1.0f - f;
                        this.val$sharedResources.gradientBackgroundPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (129.03f * f2 * hideInterfaceAlpha)));
                        this.val$sharedResources.bottomOverlayGradient.setAlpha((int) (f2 * 255.0f * hideInterfaceAlpha));
                        this.val$sharedResources.bottomOverlayGradient.setBounds(0, textTop, getMeasuredWidth(), i);
                        this.val$sharedResources.bottomOverlayGradient.draw(canvas);
                        canvas.drawRect(0.0f, i, getMeasuredWidth(), getMeasuredHeight(), this.val$sharedResources.gradientBackgroundPaint);
                        canvas.restore();
                    }
                    if (f > 0.0f && PeerStoriesView.this.storyCaptionView.getAlpha() > 0.0f) {
                        PeerStoriesView.this.storyCaptionView.disableDraw(false);
                        if (PeerStoriesView.this.storyCaptionView.getAlpha() != 1.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (PeerStoriesView.this.storyCaptionView.getAlpha() * 255.0f), 31);
                        } else {
                            canvas.save();
                        }
                        canvas.translate(PeerStoriesView.this.storyCaptionView.getX(), PeerStoriesView.this.storyCaptionView.getY() - PeerStoriesView.this.storyCaptionView.getScrollY());
                        PeerStoriesView.this.storyCaptionView.draw(canvas);
                        canvas.restore();
                    }
                    PeerStoriesView.this.storyCaptionView.disableDraw(f > 0.0f);
                    if (f > 0.0f) {
                        this.splitDrawing = true;
                        this.drawOverlayed = true;
                        super.dispatchDraw(canvas);
                        this.splitDrawing = false;
                    }
                    if (PeerStoriesView.this.viewsThumbAlpha != 0.0f && PeerStoriesView.this.viewsThumbImageReceiver != null) {
                        PeerStoriesView.this.viewsThumbImageReceiver.draw(canvas, PeerStoriesView.this.viewsThumbAlpha, PeerStoriesView.this.viewsThumbScale, 0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    }
                    this.progressToAudio.set(PeerStoriesView.this.isRecording ? 1.0f : 0.0f);
                    peerStoriesView = PeerStoriesView.this;
                    if (peerStoriesView.isActive) {
                        if (peerStoriesView.storyCaptionView.getVisibility() == 0) {
                            PeerStoriesView peerStoriesView10 = PeerStoriesView.this;
                            if (peerStoriesView10.inBlackoutMode || peerStoriesView10.storyCaptionView.isTouched()) {
                                z = true;
                                PeerStoriesView peerStoriesView11 = PeerStoriesView.this;
                                peerStoriesView11.isCaptionPartVisible = peerStoriesView11.storyCaptionView.getVisibility() != 0 && PeerStoriesView.this.storyCaptionView.getProgressToBlackout() > 0.0f;
                                PeerStoriesView.this.delegate.setIsCaption(z);
                                PeerStoriesView peerStoriesView12 = PeerStoriesView.this;
                                peerStoriesView12.delegate.setIsCaptionPartVisible(peerStoriesView12.isCaptionPartVisible);
                            }
                        }
                        z = false;
                        PeerStoriesView peerStoriesView112 = PeerStoriesView.this;
                        peerStoriesView112.isCaptionPartVisible = peerStoriesView112.storyCaptionView.getVisibility() != 0 && PeerStoriesView.this.storyCaptionView.getProgressToBlackout() > 0.0f;
                        PeerStoriesView.this.delegate.setIsCaption(z);
                        PeerStoriesView peerStoriesView122 = PeerStoriesView.this;
                        peerStoriesView122.delegate.setIsCaptionPartVisible(peerStoriesView122.isCaptionPartVisible);
                    }
                    if (f <= 0.0f) {
                        super.dispatchDraw(canvas);
                        drawLines(canvas);
                    }
                    if (PeerStoriesView.this.emojiAnimationsOverlay == null) {
                        PeerStoriesView.this.emojiAnimationsOverlay.draw(canvas);
                        return;
                    }
                    return;
                }
                if (!PeerStoriesView.this.currentStory.isLive) {
                    int dp2 = AndroidUtilities.dp(PeerStoriesView.this.BIG_SCREEN ? 56.0f : 110.0f);
                    PeerStoriesView peerStoriesView13 = PeerStoriesView.this;
                    if ((peerStoriesView13.isSelf || !peerStoriesView13.BIG_SCREEN) && PeerStoriesView.this.storyCaptionView.getVisibility() == 0) {
                        dp2 = (int) (dp2 * 2.5f);
                    }
                    this.val$sharedResources.bottomOverlayGradient.setBounds(0, PeerStoriesView.this.storyContainer.getMeasuredHeight() - dp2, getMeasuredWidth(), PeerStoriesView.this.storyContainer.getMeasuredHeight());
                    this.val$sharedResources.bottomOverlayGradient.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                    this.val$sharedResources.bottomOverlayGradient.draw(canvas);
                }
            }
            f = 0.0f;
            if (PeerStoriesView.this.viewsThumbAlpha != 0.0f) {
                PeerStoriesView.this.viewsThumbImageReceiver.draw(canvas, PeerStoriesView.this.viewsThumbAlpha, PeerStoriesView.this.viewsThumbScale, 0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
            }
            this.progressToAudio.set(PeerStoriesView.this.isRecording ? 1.0f : 0.0f);
            peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isActive) {
            }
            if (f <= 0.0f) {
            }
            if (PeerStoriesView.this.emojiAnimationsOverlay == null) {
            }
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == PeerStoriesView.this.storyAreasView) {
                return true;
            }
            if (this.splitDrawing) {
                if (Bulletin.getVisibleBulletin() != null && view == Bulletin.getVisibleBulletin().getLayout()) {
                    if (this.drawOverlayed) {
                        return super.drawChild(canvas, view, j);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }
            return super.drawChild(canvas, view, j);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0178  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void drawLines(Canvas canvas) {
            float clamp;
            float f;
            boolean z;
            StoriesController.StoriesList storiesList;
            StoryItemHolder storyItemHolder;
            StoryViewer storyViewer;
            StoryViewer.VideoPlayerHolder videoPlayerHolder;
            if (PeerStoriesView.this.imageReceiver.hasNotThumb() || ((PeerStoriesView.this.currentStory.isVideo && PeerStoriesView.this.playerSharedScope.firstFrameRendered) || (PeerStoriesView.this.currentStory.isLive && PeerStoriesView.this.playerSharedScope.firstFrameRendered))) {
                PeerStoriesView.this.currentStory.checkSendView();
            }
            float hideInterfaceAlpha = PeerStoriesView.this.getHideInterfaceAlpha();
            if (!PeerStoriesView.this.currentStory.isVideo()) {
                if (!PeerStoriesView.this.paused) {
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    if (peerStoriesView.isActive && !peerStoriesView.isUploading && !PeerStoriesView.this.isEditing && !PeerStoriesView.this.isFailed && PeerStoriesView.this.imageReceiver.hasNotThumb()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (PeerStoriesView.this.lastDrawTime != 0 && !PeerStoriesView.this.isCaptionPartVisible) {
                            if (PeerStoriesView.this.currentImageTime <= 0 && currentTimeMillis - PeerStoriesView.this.lastDrawTime > 0 && PeerStoriesView.this.storyAreasView != null) {
                                PeerStoriesView.this.storyAreasView.shine();
                            }
                            PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                            PeerStoriesView.access$2914(peerStoriesView2, currentTimeMillis - peerStoriesView2.lastDrawTime);
                        }
                        PeerStoriesView.this.lastDrawTime = currentTimeMillis;
                        clamp = Utilities.clamp(PeerStoriesView.this.currentImageTime / 10000.0f, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                clamp = Utilities.clamp(PeerStoriesView.this.currentImageTime / 10000.0f, 1.0f, 0.0f);
            } else {
                PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
                StoryViewer.VideoPlayerHolder videoPlayerHolder2 = peerStoriesView3.playerSharedScope.player;
                if (videoPlayerHolder2 != null) {
                    clamp = Utilities.clamp(videoPlayerHolder2.getPlaybackProgress(peerStoriesView3.videoDuration), 1.0f, 0.0f);
                    PeerStoriesView peerStoriesView4 = PeerStoriesView.this;
                    if (peerStoriesView4.playerSharedScope.firstFrameRendered && peerStoriesView4.storyAreasView != null) {
                        PeerStoriesView.this.storyAreasView.shine();
                    }
                } else {
                    clamp = 0.0f;
                }
                invalidate();
            }
            float f2 = clamp;
            PeerStoriesView peerStoriesView5 = PeerStoriesView.this;
            VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView5.playerSharedScope;
            if (videoPlayerSharedScope != null && (videoPlayerHolder = videoPlayerSharedScope.player) != null) {
                float f3 = videoPlayerHolder.currentSeek;
                if (f3 >= 0.0f) {
                    f = f3;
                    z = true;
                    if (!peerStoriesView5.switchEventSent && f2 == 1.0f && ((!PeerStoriesView.this.currentStory.isVideo || !PeerStoriesView.this.isCaptionPartVisible) && !PeerStoriesView.this.isLongPressed)) {
                        PeerStoriesView.this.switchEventSent = true;
                        post(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$4$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                PeerStoriesView.4.this.lambda$drawLines$0();
                            }
                        });
                    }
                    storiesList = this.val$storyViewer.storiesList;
                    if (storiesList != null && storiesList.type != 3) {
                        if (PeerStoriesView.this.storyPositionView == null) {
                            PeerStoriesView.this.storyPositionView = new StoryPositionView();
                        }
                        PeerStoriesView.this.storyPositionView.draw(canvas, (1.0f - PeerStoriesView.this.outT) * hideInterfaceAlpha * PeerStoriesView.this.alpha, PeerStoriesView.this.listPosition, this.val$storyViewer.storiesList.getCount(), this, PeerStoriesView.this.headerView);
                    }
                    canvas.save();
                    canvas.translate(0.0f, AndroidUtilities.dp(8.0f) - (AndroidUtilities.dp(8.0f) * PeerStoriesView.this.outT));
                    boolean z2 = !PeerStoriesView.this.currentStory.isVideo() && PeerStoriesView.this.playerSharedScope.isBuffering();
                    boolean z3 = (PeerStoriesView.this.isLongPressed || (storyItemHolder = PeerStoriesView.this.currentStory) == null || !storyItemHolder.isVideo || (storyViewer = this.val$storyViewer) == null || !storyViewer.inSeekingMode) ? false : true;
                    AnimatedFloat animatedFloat = PeerStoriesView.this.linesAlpha;
                    if (PeerStoriesView.this.isLongPressed && !z3) {
                        z = false;
                    }
                    PeerStoriesView.this.storyLines.draw(canvas, getMeasuredWidth(), PeerStoriesView.this.linesPosition, f2, PeerStoriesView.this.linesCount, animatedFloat.set(z), PeerStoriesView.this.alpha * (1.0f - PeerStoriesView.this.outT), z2, z3, f);
                    canvas.restore();
                }
            }
            f = f2;
            z = true;
            if (!peerStoriesView5.switchEventSent) {
                PeerStoriesView.this.switchEventSent = true;
                post(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$4$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.4.this.lambda$drawLines$0();
                    }
                });
            }
            storiesList = this.val$storyViewer.storiesList;
            if (storiesList != null) {
                if (PeerStoriesView.this.storyPositionView == null) {
                }
                PeerStoriesView.this.storyPositionView.draw(canvas, (1.0f - PeerStoriesView.this.outT) * hideInterfaceAlpha * PeerStoriesView.this.alpha, PeerStoriesView.this.listPosition, this.val$storyViewer.storiesList.getCount(), this, PeerStoriesView.this.headerView);
            }
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(8.0f) - (AndroidUtilities.dp(8.0f) * PeerStoriesView.this.outT));
            if (PeerStoriesView.this.currentStory.isVideo()) {
            }
            if (PeerStoriesView.this.isLongPressed) {
            }
            AnimatedFloat animatedFloat2 = PeerStoriesView.this.linesAlpha;
            if (PeerStoriesView.this.isLongPressed) {
                z = false;
            }
            PeerStoriesView.this.storyLines.draw(canvas, getMeasuredWidth(), PeerStoriesView.this.linesPosition, f2, PeerStoriesView.this.linesCount, animatedFloat2.set(z), PeerStoriesView.this.alpha * (1.0f - PeerStoriesView.this.outT), z2, z3, f);
            canvas.restore();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drawLines$0() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.delegate != null) {
                if (peerStoriesView.isUploading || PeerStoriesView.this.isEditing || PeerStoriesView.this.isFailed) {
                    if (!PeerStoriesView.this.currentStory.isVideo()) {
                        PeerStoriesView.this.currentImageTime = 0L;
                        return;
                    } else {
                        PeerStoriesView.this.playerSharedScope.player.loopBack();
                        return;
                    }
                }
                PeerStoriesView.this.delegate.shouldSwitchToNext();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            PeerStoriesView.this.emojiAnimationsOverlay.onAttachedToWindow();
            Bulletin.addDelegate(this, new Bulletin.Delegate() { // from class: org.telegram.ui.Stories.PeerStoriesView.4.1
                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ boolean allowLayoutChanges() {
                    return Bulletin.Delegate.-CC.$default$allowLayoutChanges(this);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.-CC.$default$bottomOffsetAnimated(this);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public boolean clipWithGradient(int i) {
                    return i == 1 || i == 2 || i == 3;
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public /* synthetic */ void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.-CC.$default$onBottomOffsetChange(this, f);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public int getTopOffset(int i) {
                    return AndroidUtilities.dp(58.0f);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public void onShow(Bulletin bulletin) {
                    Delegate delegate;
                    if (bulletin == null || bulletin.tag != 2 || (delegate = PeerStoriesView.this.delegate) == null) {
                        return;
                    }
                    delegate.setBulletinIsVisible(true);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public void onHide(Bulletin bulletin) {
                    Delegate delegate;
                    if (bulletin == null || bulletin.tag != 2 || (delegate = PeerStoriesView.this.delegate) == null) {
                        return;
                    }
                    delegate.setBulletinIsVisible(false);
                }

                @Override // org.telegram.ui.Components.Bulletin.Delegate
                public int getBottomOffset(int i) {
                    if (PeerStoriesView.this.BIG_SCREEN) {
                        return 0;
                    }
                    return AndroidUtilities.dp(64.0f);
                }
            });
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            PeerStoriesView.this.emojiAnimationsOverlay.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
            Delegate delegate = PeerStoriesView.this.delegate;
            if (delegate != null) {
                delegate.setBulletinIsVisible(false);
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PeerStoriesView.this.muteIconContainer.getLayoutParams();
            if (PeerStoriesView.this.drawLinesAsCounter()) {
                layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                layoutParams.topMargin = AndroidUtilities.dp(55.0f);
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
                layoutParams.topMargin = AndroidUtilities.dp(15.0f);
            }
            super.onMeasure(i, i2);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            LivePlayer livePlayer;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isActive && !peerStoriesView.unsupported) {
                VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView.playerSharedScope;
                if (videoPlayerSharedScope.renderView != null && (livePlayer = videoPlayerSharedScope.livePlayer) != null && livePlayer.isEmptyStream() && PeerStoriesView.this.playerSharedScope.renderView.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    class 5 extends StoryCaptionView {
        final /* synthetic */ Theme.ResourcesProvider val$resourcesProvider;
        final /* synthetic */ StoryViewer val$storyViewer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        5(Context context, Theme.ResourcesProvider resourcesProvider, StoryViewer storyViewer, Theme.ResourcesProvider resourcesProvider2) {
            super(context, resourcesProvider);
            this.val$storyViewer = storyViewer;
            this.val$resourcesProvider = resourcesProvider2;
        }

        @Override // org.telegram.ui.Stories.StoryCaptionView, androidx.core.widget.NestedScrollView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // org.telegram.ui.Stories.StoryCaptionView
        public void onLinkClick(CharacterStyle characterStyle, View view) {
            if (characterStyle instanceof URLSpanUserMention) {
                TLRPC.User user = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Utilities.parseLong(((URLSpanUserMention) characterStyle).getURL()));
                if (user != null) {
                    MessagesController.getInstance(PeerStoriesView.this.currentAccount).openChatOrProfileWith(user, null, this.val$storyViewer.fragment, 0, false);
                    return;
                }
                return;
            }
            if (characterStyle instanceof URLSpanNoUnderline) {
                String url = ((URLSpanNoUnderline) characterStyle).getURL();
                if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                    if (url.contains("@")) {
                        StoryViewer storyViewer = this.val$storyViewer;
                        if (storyViewer != null) {
                            storyViewer.presentFragment(new HashtagActivity(url));
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", 3);
                    bundle.putString("hashtag", url);
                    StoryViewer storyViewer2 = this.val$storyViewer;
                    if (storyViewer2 != null) {
                        storyViewer2.presentFragment(new MediaActivity(bundle, null));
                        return;
                    }
                    return;
                }
                String extractUsername = Browser.extractUsername(url);
                if (extractUsername != null) {
                    String lowerCase = extractUsername.toLowerCase();
                    if (url.startsWith("@")) {
                        MessagesController.getInstance(PeerStoriesView.this.currentAccount).openByUserName(lowerCase, this.val$storyViewer.fragment, 0, null);
                        return;
                    } else {
                        processExternalUrl(0, url, characterStyle, false);
                        return;
                    }
                }
                processExternalUrl(0, url, characterStyle, false);
                return;
            }
            if (characterStyle instanceof URLSpan) {
                processExternalUrl(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof URLSpanReplacement);
                return;
            }
            if (characterStyle instanceof URLSpanMono) {
                ((URLSpanMono) characterStyle).copyToClipboard();
                BulletinFactory.of(PeerStoriesView.this.storyContainer, this.val$resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
            } else if (characterStyle instanceof ClickableSpan) {
                ((ClickableSpan) characterStyle).onClick(view);
            }
        }

        private void processExternalUrl(int i, String str, CharacterStyle characterStyle, boolean z) {
            boolean z2;
            if (!z && !AndroidUtilities.shouldShowUrlInAlert(str)) {
                if (i == 0) {
                    Browser.openUrl(getContext(), Uri.parse(str), true, true, null);
                    return;
                } else if (i == 1) {
                    Browser.openUrl(getContext(), Uri.parse(str), false, false, null);
                    return;
                } else {
                    if (i == 2) {
                        Browser.openUrl(getContext(), Uri.parse(str), false, true, null);
                        return;
                    }
                    return;
                }
            }
            if (i != 0 && i != 2) {
                if (i == 1) {
                    AlertsCreator.showOpenUrlAlert(this.val$storyViewer.fragment, str, true, true, false, null, this.val$resourcesProvider);
                    return;
                }
                return;
            }
            if (characterStyle instanceof URLSpanReplacement) {
                URLSpanReplacement uRLSpanReplacement = (URLSpanReplacement) characterStyle;
                if (uRLSpanReplacement.getTextStyleRun() != null && (uRLSpanReplacement.getTextStyleRun().flags & 1024) != 0) {
                    z2 = true;
                    AlertsCreator.showOpenUrlAlert(this.val$storyViewer.fragment, str, true, true, true, z2, null, this.val$resourcesProvider);
                }
            }
            z2 = false;
            AlertsCreator.showOpenUrlAlert(this.val$storyViewer.fragment, str, true, true, true, z2, null, this.val$resourcesProvider);
        }

        @Override // org.telegram.ui.Stories.StoryCaptionView
        public void onLinkLongPress(final URLSpan uRLSpan, final View view, final Runnable runnable) {
            final String url = uRLSpan.getURL();
            String url2 = uRLSpan.getURL();
            try {
                try {
                    Uri parse = Uri.parse(url2);
                    url2 = Browser.replaceHostname(parse, Browser.IDN_toUnicode(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                url2 = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            try {
                performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(getContext(), false, this.val$resourcesProvider);
            builder.setTitle(url2);
            builder.setTitleMultipleLines(true);
            StoryItemHolder storyItemHolder = PeerStoriesView.this.currentStory;
            CharSequence[] charSequenceArr = (storyItemHolder == null || storyItemHolder.allowScreenshots()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
            final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
            builder.setItems(charSequenceArr, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$5$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PeerStoriesView.5.this.lambda$onLinkLongPress$0(uRLSpan, view, url, resourcesProvider, dialogInterface, i);
                }
            });
            builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$5$$ExternalSyntheticLambda4
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
            BottomSheet create = builder.create();
            create.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, this.val$resourcesProvider));
            PeerStoriesView.this.delegate.showDialog(create);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLinkLongPress$0(URLSpan uRLSpan, View view, String str, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                onLinkClick(uRLSpan, view);
            } else if (i == 1) {
                AndroidUtilities.addToClipboard(str);
                BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createCopyLinkBulletin().show();
            }
        }

        @Override // org.telegram.ui.Stories.StoryCaptionView
        public void onReplyClick(final StoryCaptionView.Reply reply) {
            if (reply == null) {
                return;
            }
            if (reply.isRepostMessage && reply.peerId != null && reply.messageId != null) {
                Bundle bundle = new Bundle();
                if (reply.peerId.longValue() >= 0) {
                    bundle.putLong("user_id", reply.peerId.longValue());
                } else {
                    bundle.putLong("chat_id", -reply.peerId.longValue());
                }
                bundle.putInt("message_id", reply.messageId.intValue());
                this.val$storyViewer.presentFragment(new ChatActivity(bundle));
                return;
            }
            if (reply.peerId != null && reply.storyId != null) {
                StoriesController storiesController = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getStoriesController();
                long longValue = reply.peerId.longValue();
                int intValue = reply.storyId.intValue();
                final StoryViewer storyViewer = this.val$storyViewer;
                final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                storiesController.resolveStoryLink(longValue, intValue, new Consumer() { // from class: org.telegram.ui.Stories.PeerStoriesView$5$$ExternalSyntheticLambda0
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj) {
                        PeerStoriesView.5.this.lambda$onReplyClick$3(reply, storyViewer, resourcesProvider, (TL_stories.StoryItem) obj);
                    }
                });
                return;
            }
            BulletinFactory.of(PeerStoriesView.this.storyContainer, this.val$resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.StoryHidAccount)).setTag(3).show(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReplyClick$3(StoryCaptionView.Reply reply, final StoryViewer storyViewer, Theme.ResourcesProvider resourcesProvider, TL_stories.StoryItem storyItem) {
            if (storyItem != null) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                storyItem.dialogId = reply.peerId.longValue();
                StoryViewer createOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
                createOverlayStoryViewer.open(getContext(), storyItem, (StoryViewer.PlaceProvider) null);
                createOverlayStoryViewer.setOnCloseListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$5$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        StoryViewer.this.updatePlayingMode();
                    }
                });
                storyViewer.updatePlayingMode();
                return;
            }
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.story_bomb2, LocaleController.getString(R.string.StoryNotFound)).setTag(3).show(true);
        }

        @Override // org.telegram.ui.Stories.StoryCaptionView
        public void onEmojiClick(AnimatedEmojiSpan animatedEmojiSpan) {
            if (animatedEmojiSpan != null) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (peerStoriesView.delegate == null) {
                    return;
                }
                TLRPC.Document document = animatedEmojiSpan.document;
                if (document == null) {
                    document = AnimatedEmojiDrawable.findDocument(peerStoriesView.currentAccount, animatedEmojiSpan.documentId);
                }
                if (document == null) {
                    return;
                }
                BulletinFactory of = BulletinFactory.of(PeerStoriesView.this.storyContainer, this.val$resourcesProvider);
                final StoryViewer storyViewer = this.val$storyViewer;
                final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                Bulletin createContainsEmojiBulletin = of.createContainsEmojiBulletin(document, 2, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$5$$ExternalSyntheticLambda1
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        PeerStoriesView.5.this.lambda$onEmojiClick$4(storyViewer, resourcesProvider, (TLRPC.InputStickerSet) obj);
                    }
                });
                if (createContainsEmojiBulletin == null) {
                    return;
                }
                createContainsEmojiBulletin.tag = 1;
                createContainsEmojiBulletin.show(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onEmojiClick$4(StoryViewer storyViewer, Theme.ResourcesProvider resourcesProvider, TLRPC.InputStickerSet inputStickerSet) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(inputStickerSet);
            EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(storyViewer.fragment, getContext(), resourcesProvider, arrayList);
            Delegate delegate = PeerStoriesView.this.delegate;
            if (delegate != null) {
                delegate.showDialog(emojiPacksAlert);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        StoryCaptionView storyCaptionView = this.storyCaptionView;
        if (storyCaptionView.expanded) {
            if (!storyCaptionView.textSelectionHelper.isInSelectionMode()) {
                this.storyCaptionView.collapse();
                return;
            } else {
                this.storyCaptionView.checkCancelTextSelection();
                return;
            }
        }
        this.checkBlackoutMode = true;
        storyCaptionView.expand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        shareStory(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(View view) {
        tryToOpenRepostStory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(View view) {
        TL_stories.StoryItem storyItem = this.currentStory.storyItem;
        if (storyItem != null && storyItem.sent_reaction == null) {
            applyMessageToChat(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.this.lambda$new$3();
                }
            });
        } else {
            likeStory(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        likeStory(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$5(StoryViewer storyViewer, View view) {
        Runnable runnable = this.reactionsTooltipRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.reactionsTooltipRunnable = null;
        }
        SharedConfig.setStoriesReactionsLongPressHintUsed(true);
        HintView2 hintView2 = this.reactionsLongpressTooltip;
        if (hintView2 != null) {
            hintView2.hide();
        }
        checkReactionsLayoutForLike();
        storyViewer.windowView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        showLikesReaction(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6(StoryViewer storyViewer, View view) {
        long j = UserConfig.getInstance(this.currentAccount).clientUserId;
        long j2 = this.dialogId;
        if (j == j2) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", 1);
            bundle.putLong("dialog_id", this.dialogId);
            storyViewer.presentFragment(new MediaActivity(bundle, null));
            return;
        }
        if (j2 > 0) {
            storyViewer.presentFragment(ProfileActivity.of(j2));
        } else {
            storyViewer.presentFragment(ChatActivity.of(j2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7(Theme.ResourcesProvider resourcesProvider, StoryViewer storyViewer, Context context, SharedResources sharedResources, View view) {
        this.delegate.setPopupIsVisible(true);
        this.editStoryItem = null;
        boolean[] zArr = {false};
        if (this.isSelf) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadBlocklistAtFirst();
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadSendAs();
            MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().load();
        }
        boolean z = this.isSelf || MessagesController.getInstance(this.currentAccount).getStoriesController().canEditStory(this.currentStory.storyItem);
        8 r15 = new 8(getContext(), resourcesProvider, true, resourcesProvider, storyViewer, this.currentStory.isVideo, this.isSelf || ((this.isChannel || isBotsPreview()) && z), z, context, sharedResources, zArr);
        this.popupMenu = r15;
        r15.show(this.optionsIconView, 0, (-ActionBar.getCurrentActionBarHeight()) + AndroidUtilities.dp(6.0f));
    }

    class 8 extends CustomPopupMenu {
        private boolean edit;
        final /* synthetic */ boolean val$canEditStory;
        final /* synthetic */ Context val$context;
        final /* synthetic */ boolean[] val$popupStillVisible;
        final /* synthetic */ Theme.ResourcesProvider val$resourcesProvider;
        final /* synthetic */ SharedResources val$sharedResources;
        final /* synthetic */ boolean val$speedControl;
        final /* synthetic */ StoryViewer val$storyViewer;
        final /* synthetic */ boolean val$userCanEditStory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        8(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, Theme.ResourcesProvider resourcesProvider2, StoryViewer storyViewer, boolean z2, boolean z3, boolean z4, Context context2, SharedResources sharedResources, boolean[] zArr) {
            super(context, resourcesProvider, z);
            this.val$resourcesProvider = resourcesProvider2;
            this.val$storyViewer = storyViewer;
            this.val$speedControl = z2;
            this.val$canEditStory = z3;
            this.val$userCanEditStory = z4;
            this.val$context = context2;
            this.val$sharedResources = sharedResources;
            this.val$popupStillVisible = zArr;
        }

        private void addViewStatistics(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, final TL_stories.StoryItem storyItem) {
            final TLRPC.Chat chat;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (!peerStoriesView.isChannel || (chat = MessagesController.getInstance(peerStoriesView.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId))) == null) {
                return;
            }
            TLRPC.ChatFull chatFull = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChatFull(chat.id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(PeerStoriesView.this.currentAccount).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull == null || !chatFull.can_view_stats) {
                return;
            }
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.val$resourcesProvider);
            final StoryViewer storyViewer = this.val$storyViewer;
            addItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda46
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PeerStoriesView.8.this.lambda$addViewStatistics$0(storyItem, storyViewer, chat, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addViewStatistics$0(TL_stories.StoryItem storyItem, StoryViewer storyViewer, TLRPC.Chat chat, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            storyItem.dialogId = PeerStoriesView.this.dialogId;
            storyItem.messageId = storyItem.id;
            MessageObject messageObject = new MessageObject(PeerStoriesView.this.currentAccount, storyItem);
            messageObject.generateThumbs(false);
            storyViewer.presentFragment(new MessageStatisticActivity(messageObject, chat.id, false) { // from class: org.telegram.ui.Stories.PeerStoriesView.8.1
                @Override // org.telegram.ui.MessageStatisticActivity, org.telegram.ui.ActionBar.BaseFragment
                public boolean isLightStatusBar() {
                    return false;
                }

                @Override // org.telegram.ui.ActionBar.BaseFragment
                public Theme.ResourcesProvider getResourceProvider() {
                    return new DarkThemeResourceProvider();
                }
            });
        }

        private void addSpeedLayout(final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, boolean z) {
            PeerStoriesView peerStoriesView;
            StoryItemHolder storyItemHolder;
            if (!this.val$speedControl || ((storyItemHolder = (peerStoriesView = PeerStoriesView.this).currentStory) != null && storyItemHolder.uploadingStory != null)) {
                PeerStoriesView.this.speedLayout = null;
                PeerStoriesView.this.speedItem = null;
                return;
            }
            peerStoriesView.speedLayout = new ChooseSpeedLayout(peerStoriesView.getContext(), actionBarPopupWindowLayout.getSwipeBack(), new ChooseSpeedLayout.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView.8.2
                @Override // org.telegram.ui.ChooseSpeedLayout.Callback
                public void onSpeedSelected(float f, boolean z2, boolean z3) {
                    StoryViewer storyViewer = 8.this.val$storyViewer;
                    if (storyViewer != null) {
                        storyViewer.setSpeed(f);
                    }
                    PeerStoriesView.this.updateSpeedItem(z2);
                    if (!z3 || actionBarPopupWindowLayout.getSwipeBack() == null) {
                        return;
                    }
                    actionBarPopupWindowLayout.getSwipeBack().closeForeground();
                }
            });
            PeerStoriesView.this.speedLayout.update(StoryViewer.currentSpeed, true);
            PeerStoriesView.this.speedItem = new ActionBarMenuSubItem(PeerStoriesView.this.getContext(), false, false, false, this.val$resourcesProvider);
            PeerStoriesView.this.speedItem.setTextAndIcon(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            PeerStoriesView.this.updateSpeedItem(true);
            PeerStoriesView.this.speedItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
            PeerStoriesView.this.speedItem.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindowLayout.addView(PeerStoriesView.this.speedItem);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) PeerStoriesView.this.speedItem.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(48.0f);
            PeerStoriesView.this.speedItem.setLayoutParams(layoutParams);
            final int addViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(PeerStoriesView.this.speedLayout.speedSwipeBackLayout);
            PeerStoriesView.this.speedItem.openSwipeBackLayout = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda33
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.lambda$addSpeedLayout$1(ActionBarPopupWindow.ActionBarPopupWindowLayout.this, addViewToSwipeBack);
                }
            };
            PeerStoriesView.this.speedItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda34
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PeerStoriesView.8.this.lambda$addSpeedLayout$2(view);
                }
            });
            actionBarPopupWindowLayout.swipeBackGravityRight = true;
            if (z) {
                ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(PeerStoriesView.this.getContext(), this.val$resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                gapView.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindowLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$addSpeedLayout$1(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i) {
            if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindowLayout.getSwipeBack().openForeground(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addSpeedLayout$2(View view) {
            PeerStoriesView.this.speedItem.openSwipeBack();
        }

        private void addAlbumsLayout(final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, boolean z) {
            HashSet hashSet;
            final TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            if (storyItem == null) {
                return;
            }
            if (storyItem.albums != null) {
                hashSet = new HashSet(storyItem.albums);
            } else {
                hashSet = new HashSet();
            }
            final HashSet hashSet2 = hashSet;
            ItemOptions swipeback = ItemOptions.swipeback(actionBarPopupWindowLayout, this.val$resourcesProvider);
            swipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.lambda$addAlbumsLayout$3(ActionBarPopupWindow.ActionBarPopupWindowLayout.this);
                }
            });
            swipeback.addGap();
            StoriesController.StoriesCollections storyAlbumsList = PeerStoriesView.this.getStoriesController().getStoryAlbumsList(PeerStoriesView.this.dialogId);
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            boolean canCreateNewAlbum = peerStoriesView.storiesController.canCreateNewAlbum(peerStoriesView.dialogId);
            final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.this.lambda$addAlbumsLayout$6(resourcesProvider, storyItem);
                }
            };
            final Theme.ResourcesProvider resourcesProvider2 = this.val$resourcesProvider;
            ItemOptions.addAlbumsItemOptions(swipeback, storyAlbumsList, hashSet2, canCreateNewAlbum, runnable, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda37
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PeerStoriesView.8.this.lambda$addAlbumsLayout$7(hashSet2, storyItem, resourcesProvider2, (StoriesController.StoryAlbum) obj);
                }
            });
            PeerStoriesView.this.albumLayout = swipeback.getLinearLayout();
            final int addViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(PeerStoriesView.this.albumLayout);
            PeerStoriesView.this.albumItem = new ActionBarMenuSubItem(PeerStoriesView.this.getContext(), false, false, false, this.val$resourcesProvider);
            PeerStoriesView.this.albumItem.setTextAndIcon(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
            PeerStoriesView.this.albumItem.openSwipeBackLayout = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.lambda$addAlbumsLayout$8(ActionBarPopupWindow.ActionBarPopupWindowLayout.this, addViewToSwipeBack);
                }
            };
            PeerStoriesView.this.albumItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda39
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PeerStoriesView.8.this.lambda$addAlbumsLayout$9(view);
                }
            });
            actionBarPopupWindowLayout.addView(PeerStoriesView.this.albumItem);
            actionBarPopupWindowLayout.swipeBackGravityRight = true;
            if (z) {
                ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(PeerStoriesView.this.getContext(), this.val$resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                gapView.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindowLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$addAlbumsLayout$3(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
            if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindowLayout.getSwipeBack().closeForeground();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addAlbumsLayout$6(final Theme.ResourcesProvider resourcesProvider, final TL_stories.StoryItem storyItem) {
            AlertsCreator.createStoriesAlbumEnterNameForCreate(PeerStoriesView.this.getContext(), null, resourcesProvider, new MessagesStorage.StringCallback() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda53
                @Override // org.telegram.messenger.MessagesStorage.StringCallback
                public final void run(String str) {
                    PeerStoriesView.8.this.lambda$addAlbumsLayout$5(storyItem, resourcesProvider, str);
                }
            });
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addAlbumsLayout$5(final TL_stories.StoryItem storyItem, final Theme.ResourcesProvider resourcesProvider, String str) {
            PeerStoriesView.this.getStoriesController().createAlbum(PeerStoriesView.this.dialogId, str, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda61
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PeerStoriesView.8.this.lambda$addAlbumsLayout$4(storyItem, resourcesProvider, (StoriesController.StoryAlbum) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addAlbumsLayout$4(TL_stories.StoryItem storyItem, Theme.ResourcesProvider resourcesProvider, StoriesController.StoryAlbum storyAlbum) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.storiesController.addStoryToAlbum(peerStoriesView.dialogId, storyAlbum.album_id, storyItem);
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title))).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addAlbumsLayout$7(HashSet hashSet, TL_stories.StoryItem storyItem, Theme.ResourcesProvider resourcesProvider, StoriesController.StoryAlbum storyAlbum) {
            String formatString;
            if (hashSet.contains(Integer.valueOf(storyAlbum.album_id))) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.storiesController.addStoryToAlbum(peerStoriesView.dialogId, storyAlbum.album_id, storyItem);
                formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title);
            } else {
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.storiesController.removeStoryFromAlbum(peerStoriesView2.dialogId, storyAlbum.album_id, storyItem);
                formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, storyAlbum.title);
            }
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(formatString)).show();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$addAlbumsLayout$8(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i) {
            if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindowLayout.getSwipeBack().openForeground(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addAlbumsLayout$9(View view) {
            PeerStoriesView.this.albumItem.openSwipeBack();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0147, code lost:
        
            if (r10.stories_hidden != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x015b, code lost:
        
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0159, code lost:
        
            if (r9.stories_hidden != false) goto L53;
         */
        @Override // org.telegram.ui.Components.CustomPopupMenu
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onCreate(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
            String string;
            LivePlayer livePlayer;
            LivePlayer livePlayer2;
            final StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy;
            TL_stories.StoryItem storyItem;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Photo photo;
            TLRPC.User user;
            TLRPC.Chat chat;
            TLObject tLObject;
            String trim;
            TLRPC.Chat chat2;
            TLRPC.User user2;
            boolean z;
            boolean z2;
            if (this.val$canEditStory || PeerStoriesView.this.currentStory.uploadingStory != null) {
                StoryItemHolder storyItemHolder = PeerStoriesView.this.currentStory;
                final TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
                if (storyItemHolder.uploadingStory != null) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$10(view);
                        }
                    });
                }
                if (storyItem2 == null) {
                    return;
                }
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if ((peerStoriesView.isSelf || peerStoriesView.storiesController.canEditStories(peerStoriesView.dialogId)) && !PeerStoriesView.this.currentStory.isLive) {
                    addAlbumsLayout(actionBarPopupWindowLayout, true);
                }
                if (PeerStoriesView.this.isSelf) {
                    if (storyItem2.privacy.isEmpty()) {
                        storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(3, PeerStoriesView.this.currentAccount, new ArrayList());
                    } else {
                        storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(PeerStoriesView.this.currentAccount, storyItem2.privacy);
                    }
                    ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, this.val$resourcesProvider);
                    addItem.setSubtext(storyPrivacy.toString());
                    addItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$11(storyPrivacy, storyItem2, view);
                        }
                    });
                    addItem.setItemHeight(56);
                }
                addSpeedLayout(actionBarPopupWindowLayout, false);
                if (PeerStoriesView.this.isSelf || this.val$speedControl) {
                    View gapView = new ActionBarPopupWindow.GapView(PeerStoriesView.this.getContext(), this.val$resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                    gapView.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindowLayout.addView(gapView, LayoutHelper.createLinear(-1, 8));
                }
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                if (!peerStoriesView2.unsupported && !peerStoriesView2.currentStory.isLive && ((PeerStoriesView.this.isBotsPreview() || MessagesController.getInstance(PeerStoriesView.this.currentAccount).storiesEnabled()) && this.val$userCanEditStory)) {
                    PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
                    peerStoriesView3.editStoryItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_edit, LocaleController.getString(peerStoriesView3.isBotsPreview() ? R.string.EditBotPreview : R.string.EditStory), false, this.val$resourcesProvider);
                    ActionBarMenuSubItem actionBarMenuSubItem = PeerStoriesView.this.editStoryItem;
                    final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                    final Context context = this.val$context;
                    final StoryViewer storyViewer = this.val$storyViewer;
                    final SharedResources sharedResources = this.val$sharedResources;
                    actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$17(resourcesProvider, context, storyViewer, sharedResources, view);
                        }
                    });
                    PeerStoriesView peerStoriesView4 = PeerStoriesView.this;
                    if (peerStoriesView4.storiesController.hasUploadingStories(peerStoriesView4.dialogId) && PeerStoriesView.this.currentStory.isVideo && !SharedConfig.allowPreparingHevcPlayers()) {
                        PeerStoriesView.this.editStoryItem.setAlpha(0.5f);
                    }
                }
                StoryItemHolder storyItemHolder2 = PeerStoriesView.this.currentStory;
                if (storyItemHolder2.storyItem != null && storyItemHolder2.isVideo && !PeerStoriesView.this.currentStory.isLive) {
                    PeerStoriesView peerStoriesView5 = PeerStoriesView.this;
                    if (peerStoriesView5.currentStory.storyItem.pinned || peerStoriesView5.isEditBotsPreview()) {
                        ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, this.val$resourcesProvider);
                        final Context context2 = this.val$context;
                        final StoryViewer storyViewer2 = this.val$storyViewer;
                        final SharedResources sharedResources2 = this.val$sharedResources;
                        addItem2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda9
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$27(context2, storyItem2, storyViewer2, sharedResources2, view);
                            }
                        });
                    }
                }
                PeerStoriesView peerStoriesView6 = PeerStoriesView.this;
                if ((peerStoriesView6.isSelf || (peerStoriesView6.isChannel && MessagesController.getInstance(peerStoriesView6.currentAccount).getStoriesController().canEditStories(storyItem2.dialogId))) && !PeerStoriesView.this.currentStory.isLive) {
                    boolean z3 = storyItem2.pinned;
                    final boolean z4 = !z3;
                    if (PeerStoriesView.this.isSelf) {
                        string = LocaleController.getString(!z3 ? R.string.SaveToProfile : R.string.ArchiveStory);
                    } else {
                        string = LocaleController.getString(!z3 ? R.string.SaveToPosts : R.string.RemoveFromPosts);
                    }
                    ActionBarMenuSubItem addItem3 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, !z3 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, string, false, this.val$resourcesProvider);
                    final Theme.ResourcesProvider resourcesProvider2 = this.val$resourcesProvider;
                    addItem3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda10
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$29(storyItem2, z4, resourcesProvider2, view);
                        }
                    });
                }
                addViewStatistics(actionBarPopupWindowLayout, storyItem2);
                PeerStoriesView peerStoriesView7 = PeerStoriesView.this;
                if (!peerStoriesView7.unsupported && !peerStoriesView7.currentStory.isLive) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(PeerStoriesView.this.currentStory.isVideo() ? R.string.SaveVideo : R.string.SaveImage), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$30(view);
                        }
                    });
                }
                if (!MessagesController.getInstance(PeerStoriesView.this.currentAccount).premiumFeaturesBlocked() && !PeerStoriesView.this.currentStory.isLive) {
                    PeerStoriesView peerStoriesView8 = PeerStoriesView.this;
                    if (!peerStoriesView8.isChannel) {
                        peerStoriesView8.createStealthModeItem(actionBarPopupWindowLayout);
                    }
                }
                PeerStoriesView peerStoriesView9 = PeerStoriesView.this;
                if (peerStoriesView9.isChannel && peerStoriesView9.allowShareLink) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda12
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$31(view);
                        }
                    });
                }
                if (PeerStoriesView.this.allowShareLink) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda14
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$32(view);
                        }
                    });
                }
                TL_stories.StoryItem storyItem3 = PeerStoriesView.this.currentStory.storyItem;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia2 = storyItem3.media;
                    if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (livePlayer2 = LivePlayer.recording) != null && livePlayer2.equals(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                        LivePlayer livePlayer3 = LivePlayer.recording;
                        final boolean z5 = livePlayer3 != null && livePlayer3.isMuted();
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout, z5 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, z5 ? "Unmute" : "Mute", false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda15
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$33(z5, view);
                            }
                        });
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.menu_camera_retake, "Switch Camera", false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda16
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$34(view);
                            }
                        });
                    }
                }
                if (PeerStoriesView.this.currentStory.isLive) {
                    ActionBarMenuSubItem addItem4 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, this.val$resourcesProvider);
                    final StoryViewer storyViewer3 = this.val$storyViewer;
                    addItem4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda17
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$35(storyViewer3, view);
                        }
                    });
                }
                if (PeerStoriesView.this.currentStory.isLive && (PeerStoriesView.this.dialogId == UserConfig.getInstance(PeerStoriesView.this.currentAccount).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId))) || ((livePlayer = this.val$storyViewer.livePlayer) != null && PeerStoriesView.this.currentStory.isThisCall(livePlayer.getCallId()) && this.val$storyViewer.livePlayer.isCreator()))) {
                    ActionBarMenuSubItem addItem5 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, this.val$resourcesProvider);
                    final Theme.ResourcesProvider resourcesProvider3 = this.val$resourcesProvider;
                    final StoryViewer storyViewer4 = this.val$storyViewer;
                    addItem5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda18
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$39(resourcesProvider3, storyViewer4, view);
                        }
                    });
                }
                if (PeerStoriesView.this.currentStory.isLive) {
                    ActionBarMenuSubItem addItem6 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, this.val$resourcesProvider);
                    int i = Theme.key_text_RedBold;
                    addItem6.setSelectorColor(Theme.multAlpha(Theme.getColor(i, this.val$resourcesProvider), 0.12f));
                    addItem6.setColors(this.val$resourcesProvider.getColor(i), this.val$resourcesProvider.getColor(i));
                    final Theme.ResourcesProvider resourcesProvider4 = this.val$resourcesProvider;
                    final StoryViewer storyViewer5 = this.val$storyViewer;
                    addItem6.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda19
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$41(resourcesProvider4, storyViewer5, view);
                        }
                    });
                }
                if (!PeerStoriesView.this.currentStory.isLive) {
                    PeerStoriesView peerStoriesView10 = PeerStoriesView.this;
                    if (peerStoriesView10.isSelf || MessagesController.getInstance(peerStoriesView10.currentAccount).getStoriesController().canDeleteStory(PeerStoriesView.this.currentStory.storyItem)) {
                        ActionBarMenuSubItem addItem7 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, this.val$resourcesProvider);
                        int i2 = Theme.key_text_RedBold;
                        addItem7.setSelectorColor(Theme.multAlpha(Theme.getColor(i2, this.val$resourcesProvider), 0.12f));
                        addItem7.setColors(this.val$resourcesProvider.getColor(i2), this.val$resourcesProvider.getColor(i2));
                        addItem7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda20
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$42(view);
                            }
                        });
                    }
                }
            } else {
                addSpeedLayout(actionBarPopupWindowLayout, true);
                final String sharedPrefKey = NotificationsController.getSharedPrefKey(PeerStoriesView.this.dialogId, 0L);
                boolean areStoriesNotMuted = NotificationsCustomSettingsActivity.areStoriesNotMuted(PeerStoriesView.this.currentAccount, PeerStoriesView.this.dialogId);
                if (PeerStoriesView.this.dialogId > 0) {
                    chat = null;
                    TLRPC.User user3 = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId));
                    tLObject = user3;
                    user = user3;
                } else {
                    user = null;
                    chat = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId));
                    tLObject = chat;
                }
                if (user == null) {
                    trim = chat == null ? "" : chat.title;
                } else {
                    trim = UserObject.getFirstName(user).trim();
                }
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                final String str = trim;
                if (!UserObject.isService(PeerStoriesView.this.dialogId) && !PeerStoriesView.this.isBotsPreview()) {
                    if (areStoriesNotMuted) {
                        ActionBarMenuSubItem addItem8 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.val$resourcesProvider);
                        final Theme.ResourcesProvider resourcesProvider5 = this.val$resourcesProvider;
                        chat2 = chat;
                        final TLObject tLObject2 = tLObject;
                        user2 = user;
                        addItem8.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$43(sharedPrefKey, resourcesProvider5, tLObject2, str, view);
                            }
                        });
                        addItem8.setMultiline(false);
                    } else {
                        chat2 = chat;
                        user2 = user;
                        ActionBarMenuSubItem addItem9 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, this.val$resourcesProvider);
                        final Theme.ResourcesProvider resourcesProvider6 = this.val$resourcesProvider;
                        final TLObject tLObject3 = tLObject;
                        addItem9.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda13
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$44(sharedPrefKey, resourcesProvider6, tLObject3, str, view);
                            }
                        });
                        addItem9.setMultiline(false);
                    }
                    MediaDataController.getInstance(PeerStoriesView.this.currentAccount).loadHints(true);
                    boolean z6 = (user2 == null || user2.contact || !MediaDataController.getInstance(PeerStoriesView.this.currentAccount).containsTopPeer(PeerStoriesView.this.dialogId)) ? false : true;
                    if (PeerStoriesView.this.dialogId > 0) {
                        z = user2 != null && user2.contact;
                        if (user2 != null) {
                        }
                        z2 = false;
                    } else {
                        z = (chat2 == null || ChatObject.isNotInChat(chat2)) ? false : true;
                        if (chat2 != null) {
                        }
                        z2 = false;
                    }
                    if (z6) {
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda22
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$45(view);
                            }
                        });
                    } else if (z) {
                        if (!z2) {
                            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda23
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    PeerStoriesView.8.this.lambda$onCreate$46(view);
                                }
                            });
                        } else {
                            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda24
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    PeerStoriesView.8.this.lambda$onCreate$47(view);
                                }
                            });
                        }
                    }
                }
                if (PeerStoriesView.this.currentStory.isLive) {
                    ActionBarMenuSubItem addItem10 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, this.val$resourcesProvider);
                    final StoryViewer storyViewer6 = this.val$storyViewer;
                    addItem10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda25
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$48(storyViewer6, view);
                        }
                    });
                }
                if (!MessagesController.getInstance(PeerStoriesView.this.currentAccount).premiumFeaturesBlocked() && PeerStoriesView.this.currentStory.isVideo) {
                    PeerStoriesView.this.createQualityItem(actionBarPopupWindowLayout);
                }
                PeerStoriesView peerStoriesView11 = PeerStoriesView.this;
                if (!peerStoriesView11.unsupported && peerStoriesView11.allowShare && !PeerStoriesView.this.currentStory.isLive) {
                    if (!UserConfig.getInstance(PeerStoriesView.this.currentAccount).isPremium()) {
                        if (!MessagesController.getInstance(PeerStoriesView.this.currentAccount).premiumFeaturesBlocked()) {
                            Drawable drawable = ContextCompat.getDrawable(this.val$context, R.drawable.msg_gallery_locked2);
                            drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, 0.5f), PorterDuff.Mode.MULTIPLY));
                            CombinedDrawable combinedDrawable = new CombinedDrawable(ContextCompat.getDrawable(this.val$context, R.drawable.msg_gallery_locked1), drawable) { // from class: org.telegram.ui.Stories.PeerStoriesView.8.3
                                @Override // org.telegram.ui.Components.CombinedDrawable, android.graphics.drawable.Drawable
                                public void setColorFilter(ColorFilter colorFilter) {
                                }
                            };
                            final ActionBarMenuSubItem addItem11 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, this.val$resourcesProvider);
                            addItem11.setIcon(combinedDrawable);
                            final StoryViewer storyViewer7 = this.val$storyViewer;
                            addItem11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda27
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    PeerStoriesView.8.this.lambda$onCreate$51(addItem11, storyViewer7, view);
                                }
                            });
                        }
                    } else {
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda26
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$49(view);
                            }
                        });
                    }
                }
                if (!MessagesController.getInstance(PeerStoriesView.this.currentAccount).premiumFeaturesBlocked()) {
                    PeerStoriesView peerStoriesView12 = PeerStoriesView.this;
                    if (!peerStoriesView12.isChannel) {
                        peerStoriesView12.createStealthModeItem(actionBarPopupWindowLayout);
                    }
                }
                if (PeerStoriesView.this.allowShareLink) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda28
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$52(view);
                        }
                    });
                }
                if (PeerStoriesView.this.allowShareLink) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda29
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$53(view);
                        }
                    });
                }
                TL_stories.StoryItem storyItem4 = PeerStoriesView.this.currentStory.storyItem;
                if (storyItem4 != null) {
                    if (!storyItem4.translated || !TextUtils.equals(storyItem4.translatedLng, TranslateAlert2.getToLanguage())) {
                        if (MessagesController.getInstance(PeerStoriesView.this.currentAccount).getTranslateController().canTranslateStory(PeerStoriesView.this.currentStory.storyItem)) {
                            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda4
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    PeerStoriesView.8.this.lambda$onCreate$57(view);
                                }
                            });
                        }
                    } else {
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, this.val$resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PeerStoriesView.8.this.lambda$onCreate$54(view);
                            }
                        });
                    }
                }
                addViewStatistics(actionBarPopupWindowLayout, PeerStoriesView.this.currentStory.storyItem);
                PeerStoriesView peerStoriesView13 = PeerStoriesView.this;
                if (!peerStoriesView13.unsupported && !UserObject.isService(peerStoriesView13.dialogId) && !PeerStoriesView.this.isBotsPreview()) {
                    ActionBarMenuSubItem addItem12 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, this.val$resourcesProvider);
                    final StoryViewer storyViewer8 = this.val$storyViewer;
                    final Theme.ResourcesProvider resourcesProvider7 = this.val$resourcesProvider;
                    addItem12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PeerStoriesView.8.this.lambda$onCreate$59(storyViewer8, resourcesProvider7, view);
                        }
                    });
                }
            }
            StoryItemHolder storyItemHolder3 = PeerStoriesView.this.currentStory;
            boolean z7 = (storyItemHolder3 == null || (storyItem = storyItemHolder3.storyItem) == null || (messageMedia = storyItem.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = PeerStoriesView.this.currentStory.storyItem.media.photo) == null || !photo.has_stickers))) ? false : true;
            PeerStoriesView peerStoriesView14 = PeerStoriesView.this;
            ArrayList animatedEmojiSets = peerStoriesView14.getAnimatedEmojiSets(peerStoriesView14.currentStory);
            boolean z8 = (animatedEmojiSets == null || animatedEmojiSets.isEmpty()) ? false : true;
            if (z7 || z8) {
                View gapView2 = new ActionBarPopupWindow.GapView(this.val$context, this.val$resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                int i3 = R.id.fit_width_tag;
                gapView2.setTag(i3, 1);
                actionBarPopupWindowLayout.addView(gapView2, LayoutHelper.createLinear(-1, 8));
                TLRPC.MessageMedia messageMedia3 = PeerStoriesView.this.currentStory.storyItem.media;
                TLObject tLObject4 = messageMedia3.document;
                final StoryContainsEmojiButton storyContainsEmojiButton = new StoryContainsEmojiButton(this.val$context, PeerStoriesView.this.currentAccount, tLObject4 != null ? tLObject4 : messageMedia3.photo, PeerStoriesView.this.currentStory.storyItem, z7, animatedEmojiSets, this.val$resourcesProvider);
                storyContainsEmojiButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PeerStoriesView.8.this.lambda$onCreate$60(storyContainsEmojiButton, view);
                    }
                });
                storyContainsEmojiButton.setTag(i3, 1);
                actionBarPopupWindowLayout.addView((View) storyContainsEmojiButton, LayoutHelper.createLinear(-1, -2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$10(View view) {
            StoriesController.UploadingStory uploadingStory = PeerStoriesView.this.currentStory.uploadingStory;
            if (uploadingStory != null) {
                uploadingStory.cancel();
                PeerStoriesView.this.updateStoryItems();
            }
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$11(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, TL_stories.StoryItem storyItem, View view) {
            PeerStoriesView.this.editPrivacy(storyPrivacy, storyItem);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$17(Theme.ResourcesProvider resourcesProvider, Context context, final StoryViewer storyViewer, final SharedResources sharedResources, View view) {
            if (view.getAlpha() < 1.0f) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                AndroidUtilities.shakeViewSpring(view, peerStoriesView.shiftDp = -peerStoriesView.shiftDp);
                BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createErrorBulletin("Wait until current upload is complete").show();
                return;
            }
            final Activity findActivity = AndroidUtilities.findActivity(context);
            if (findActivity == null) {
                return;
            }
            this.edit = true;
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda45
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.this.lambda$onCreate$16(findActivity, storyViewer, sharedResources);
                }
            };
            if (PeerStoriesView.this.delegate.releasePlayer(runnable)) {
                return;
            }
            runnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$16(Activity activity, StoryViewer storyViewer, final SharedResources sharedResources) {
            File file;
            StoryViewer.VideoPlayerHolder videoPlayerHolder;
            StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, PeerStoriesView.this.currentAccount);
            VideoPlayerSharedScope videoPlayerSharedScope = PeerStoriesView.this.playerSharedScope;
            long j = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
            DraftsController draftsController = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getStoriesController().getDraftsController();
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            StoryEntry forEdit = draftsController.getForEdit(storyItem.dialogId, storyItem);
            if (forEdit == null || forEdit.isRepostMessage || (file = forEdit.file) == null || !file.exists()) {
                forEdit = StoryEntry.fromStoryItem(PeerStoriesView.this.currentStory.getPath(), PeerStoriesView.this.currentStory.storyItem);
                forEdit.editStoryPeerId = PeerStoriesView.this.dialogId;
            }
            StoryEntry copy = forEdit.copy();
            if (PeerStoriesView.this.isBotsPreview()) {
                copy.botId = PeerStoriesView.this.dialogId;
                copy.editingBotPreview = MessagesController.toInputMedia(PeerStoriesView.this.currentStory.storyItem.media);
                StoriesController.StoriesList storiesList = storyViewer.storiesList;
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    copy.botLang = ((StoriesController.BotPreviewsList) storiesList).lang_code;
                }
            }
            storyRecorder.openEdit(StoryRecorder.SourceView.fromStoryViewer(storyViewer), copy, j, true);
            storyRecorder.setOnFullyOpenListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.this.lambda$onCreate$12();
                }
            });
            storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda52
                @Override // org.telegram.messenger.Utilities.Callback4
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    PeerStoriesView.8.this.lambda$onCreate$15(sharedResources, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$12() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.editOpened = true;
            peerStoriesView.setActive(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$15(SharedResources sharedResources, Long l, final Runnable runnable, Boolean bool, Long l2) {
            final long currentTimeMillis = System.currentTimeMillis();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView.playerSharedScope;
            StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
            if (videoPlayerHolder == null) {
                peerStoriesView.delegate.setPopupIsVisible(false);
                PeerStoriesView.this.setActive(true);
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.editOpened = false;
                peerStoriesView2.onImageReceiverThumbLoaded = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda56
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.8.lambda$onCreate$13(runnable);
                    }
                };
                if (bool.booleanValue()) {
                    PeerStoriesView.this.updatePosition();
                }
                AndroidUtilities.runOnUIThread(runnable, 400L);
                return;
            }
            videoPlayerHolder.firstFrameRendered = false;
            videoPlayerSharedScope.firstFrameRendered = false;
            videoPlayerHolder.setOnReadyListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda57
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.lambda$onCreate$14(runnable, currentTimeMillis);
                }
            });
            PeerStoriesView.this.delegate.setPopupIsVisible(false);
            if (PeerStoriesView.this.muteIconView != null) {
                PeerStoriesView.this.muteIconView.setAnimation(sharedResources.muteDrawable);
            }
            PeerStoriesView.this.setActive(((PeerStoriesView.this.videoDuration <= 0 || l.longValue() <= PeerStoriesView.this.videoDuration - 1400) ? l : 0L).longValue(), true);
            PeerStoriesView.this.editOpened = false;
            AndroidUtilities.runOnUIThread(runnable, 400L);
            if (bool.booleanValue()) {
                PeerStoriesView.this.updatePosition();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCreate$13(Runnable runnable) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCreate$14(Runnable runnable, long j) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - j)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$27(Context context, final TL_stories.StoryItem storyItem, final StoryViewer storyViewer, final SharedResources sharedResources, View view) {
            File path = PeerStoriesView.this.currentStory.getPath();
            if (path == null || !path.exists()) {
                PeerStoriesView.this.showDownloadAlert();
                return;
            }
            final Activity findActivity = AndroidUtilities.findActivity(context);
            if (findActivity == null) {
                return;
            }
            this.edit = true;
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.this.lambda$onCreate$26(findActivity, storyItem, storyViewer, sharedResources);
                }
            };
            if (PeerStoriesView.this.delegate.releasePlayer(runnable)) {
                return;
            }
            runnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$26(Activity activity, final TL_stories.StoryItem storyItem, StoryViewer storyViewer, final SharedResources sharedResources) {
            StoryViewer.VideoPlayerHolder videoPlayerHolder;
            StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, PeerStoriesView.this.currentAccount);
            VideoPlayerSharedScope videoPlayerSharedScope = PeerStoriesView.this.playerSharedScope;
            long j = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
            StoryEntry fromStoryItem = StoryEntry.fromStoryItem(PeerStoriesView.this.currentStory.getPath(), PeerStoriesView.this.currentStory.storyItem);
            fromStoryItem.editStoryPeerId = PeerStoriesView.this.dialogId;
            fromStoryItem.cover = StoryEntry.getCoverTime(PeerStoriesView.this.currentStory.storyItem);
            StoryEntry copy = fromStoryItem.copy();
            copy.isEditingCover = true;
            final TL_stories.StoryItem storyItem2 = PeerStoriesView.this.currentStory.storyItem;
            copy.editingCoverDocument = storyItem2.media.document;
            copy.updateDocumentRef = new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda48
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PeerStoriesView.8.this.lambda$onCreate$21(storyItem2, storyItem, (Utilities.Callback) obj);
                }
            };
            if (PeerStoriesView.this.isBotsPreview()) {
                copy.botId = PeerStoriesView.this.dialogId;
                copy.editingBotPreview = MessagesController.toInputMedia(PeerStoriesView.this.currentStory.storyItem.media);
                StoriesController.StoriesList storiesList = storyViewer.storiesList;
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    copy.botLang = ((StoriesController.BotPreviewsList) storiesList).lang_code;
                }
            }
            storyRecorder.openEdit(StoryRecorder.SourceView.fromStoryViewer(storyViewer), copy, j, true);
            storyRecorder.setOnFullyOpenListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.this.lambda$onCreate$22();
                }
            });
            storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda50
                @Override // org.telegram.messenger.Utilities.Callback4
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    PeerStoriesView.8.this.lambda$onCreate$25(sharedResources, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$21(final TL_stories.StoryItem storyItem, final TL_stories.StoryItem storyItem2, final Utilities.Callback callback) {
            final StoriesController.BotPreviewsList botPreviewsList;
            if ((storyItem instanceof StoriesController.BotPreview) && (botPreviewsList = ((StoriesController.BotPreview) storyItem).list) != null) {
                botPreviewsList.reload(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda59
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.8.lambda$onCreate$18(StoriesController.BotPreviewsList.this, storyItem2, callback);
                    }
                });
                return;
            }
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getInputPeer(storyItem.dialogId);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            ConnectionsManager.getInstance(PeerStoriesView.this.currentAccount).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda60
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PeerStoriesView.8.this.lambda$onCreate$20(storyItem, callback, tLObject, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCreate$18(StoriesController.BotPreviewsList botPreviewsList, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
            TL_stories.StoryItem storyItem2;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            TLRPC.Document document2;
            for (int i = 0; i < botPreviewsList.messageObjects.size(); i++) {
                MessageObject messageObject = (MessageObject) botPreviewsList.messageObjects.get(i);
                if (messageObject != null && (storyItem2 = messageObject.storyItem) != null && (messageMedia = storyItem2.media) != null && (document = storyItem.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                    callback.run(document2);
                    return;
                }
            }
            callback.run(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$20(final TL_stories.StoryItem storyItem, final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.this.lambda$onCreate$19(tLObject, storyItem, callback);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$19(TLObject tLObject, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
            if (tLObject instanceof TL_stories.TL_stories_stories) {
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                MessagesController.getInstance(PeerStoriesView.this.currentAccount).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(PeerStoriesView.this.currentAccount).putChats(tL_stories_stories.chats, false);
                for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                    if (tL_stories_stories.stories.get(i).id == storyItem.id) {
                        callback.run(tL_stories_stories.stories.get(i).media.document);
                        return;
                    }
                }
            }
            callback.run(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$22() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.editOpened = true;
            peerStoriesView.setActive(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$25(SharedResources sharedResources, Long l, final Runnable runnable, Boolean bool, Long l2) {
            final long currentTimeMillis = System.currentTimeMillis();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView.playerSharedScope;
            StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
            if (videoPlayerHolder == null) {
                peerStoriesView.delegate.setPopupIsVisible(false);
                PeerStoriesView.this.setActive(true);
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.editOpened = false;
                peerStoriesView2.onImageReceiverThumbLoaded = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda54
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.8.lambda$onCreate$23(runnable);
                    }
                };
                if (bool.booleanValue()) {
                    PeerStoriesView.this.updatePosition();
                }
                AndroidUtilities.runOnUIThread(runnable, 400L);
                return;
            }
            videoPlayerHolder.firstFrameRendered = false;
            videoPlayerSharedScope.firstFrameRendered = false;
            videoPlayerHolder.setOnReadyListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda55
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.lambda$onCreate$24(runnable, currentTimeMillis);
                }
            });
            PeerStoriesView.this.delegate.setPopupIsVisible(false);
            if (PeerStoriesView.this.muteIconView != null) {
                PeerStoriesView.this.muteIconView.setAnimation(sharedResources.muteDrawable);
            }
            PeerStoriesView.this.setActive(((PeerStoriesView.this.videoDuration <= 0 || l.longValue() <= PeerStoriesView.this.videoDuration - 1400) ? l : 0L).longValue(), true);
            PeerStoriesView.this.editOpened = false;
            AndroidUtilities.runOnUIThread(runnable, 400L);
            if (bool.booleanValue()) {
                PeerStoriesView.this.updatePosition();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCreate$23(Runnable runnable) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCreate$24(Runnable runnable, long j) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - j)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$29(final TL_stories.StoryItem storyItem, final boolean z, final Theme.ResourcesProvider resourcesProvider, View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(storyItem);
            MessagesController.getInstance(PeerStoriesView.this.currentAccount).getStoriesController().updateStoriesPinned(PeerStoriesView.this.dialogId, arrayList, z, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda32
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PeerStoriesView.8.this.lambda$onCreate$28(storyItem, z, resourcesProvider, (Boolean) obj);
                }
            });
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$28(TL_stories.StoryItem storyItem, boolean z, Theme.ResourcesProvider resourcesProvider, Boolean bool) {
            if (bool.booleanValue()) {
                storyItem.pinned = z;
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (peerStoriesView.isSelf) {
                    BulletinFactory.of(peerStoriesView.storyContainer, resourcesProvider).createSimpleBulletin(z ? R.raw.contact_check : R.raw.chats_archived, LocaleController.getString(z ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).show();
                    return;
                } else if (z) {
                    BulletinFactory.of(peerStoriesView.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription)).show();
                    return;
                } else {
                    BulletinFactory.of(peerStoriesView.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.chats_archived, LocaleController.getString(R.string.StoryUnpinnedFromPosts)).show();
                    return;
                }
            }
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$30(View view) {
            PeerStoriesView.this.saveToGallery();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$31(View view) {
            AndroidUtilities.addToClipboard(PeerStoriesView.this.currentStory.createLink());
            PeerStoriesView.this.onLinkCopied();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$32(View view) {
            PeerStoriesView.this.shareStory(false);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$33(boolean z, View view) {
            LivePlayer livePlayer = LivePlayer.recording;
            if (livePlayer != null) {
                livePlayer.setMuted(!z);
            }
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$34(View view) {
            LivePlayer livePlayer = LivePlayer.recording;
            if (livePlayer != null) {
                livePlayer.switchCamera();
            }
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$35(StoryViewer storyViewer, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            if (storyViewer != null) {
                storyViewer.switchToPip();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$39(Theme.ResourcesProvider resourcesProvider, StoryViewer storyViewer, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            StoryPrivacyBottomSheet isEdit = new StoryPrivacyBottomSheet(PeerStoriesView.this.getContext(), 86400, resourcesProvider).setLive(true).setPeer(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getInputPeer(PeerStoriesView.this.dialogId)).setLiveSettings(true).allowCover(false).setCount(1).isEdit(false);
            LivePlayer livePlayer = storyViewer.livePlayer;
            boolean z = livePlayer != null && livePlayer.areMessagesEnabled();
            boolean allowScreenshots = PeerStoriesView.this.currentStory.allowScreenshots();
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            boolean z2 = storyItem != null && storyItem.pinned;
            LivePlayer livePlayer2 = storyViewer.livePlayer;
            final StoryPrivacyBottomSheet storyPrivacyBottomSheet = isEdit.set(z, allowScreenshots, z2, livePlayer2 == null ? 0 : (int) livePlayer2.getSendPaidMessagesStars());
            storyPrivacyBottomSheet.whenSelectedRules(new StoryPrivacyBottomSheet.DoneCallback() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda31
                @Override // org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet.DoneCallback
                public final void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z3, boolean z4, boolean z5, boolean z6, TLRPC.InputPeer inputPeer, int i, Runnable runnable, Runnable runnable2) {
                    PeerStoriesView.8.this.lambda$onCreate$38(storyPrivacyBottomSheet, storyPrivacy, z3, z4, z5, z6, inputPeer, i, runnable, runnable2);
                }
            }, false);
            storyPrivacyBottomSheet.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$38(final StoryPrivacyBottomSheet storyPrivacyBottomSheet, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, Runnable runnable, Runnable runnable2) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
            if ((storyItem != null && storyItem.pinned) != z3) {
                MessagesController.getInstance(peerStoriesView.currentAccount).getStoriesController().updateStoriesPinned(PeerStoriesView.this.dialogId, PeerStoriesView.this.storyItems, z3, null);
            }
            TL_stories.StoryItem storyItem2 = PeerStoriesView.this.currentStory.storyItem;
            if (storyItem2 != null) {
                TLRPC.MessageMedia messageMedia = storyItem2.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                    TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                    TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                    togglegroupcallsettings.call = inputGroupCall;
                    togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
                    togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i);
                    ConnectionsManager.getInstance(PeerStoriesView.this.currentAccount).sendRequest(togglegroupcallsettings, new RequestDelegate() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda58
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            PeerStoriesView.8.this.lambda$onCreate$37(storyPrivacyBottomSheet, tLObject, tL_error);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$37(final StoryPrivacyBottomSheet storyPrivacyBottomSheet, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.Updates) {
                MessagesController.getInstance(PeerStoriesView.this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StoryPrivacyBottomSheet.this.dismiss();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$41(Theme.ResourcesProvider resourcesProvider, final StoryViewer storyViewer, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            new AlertDialog.Builder(PeerStoriesView.this.getContext(), resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryEndAlertTitle)).setMessage(LocaleController.getString(R.string.LiveStoryEndAlertText)).setPositiveButton(LocaleController.getString(R.string.LiveStoryEndAlertButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda44
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    PeerStoriesView.8.this.lambda$onCreate$40(storyViewer, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$40(StoryViewer storyViewer, AlertDialog alertDialog, int i) {
            LivePlayer livePlayer = storyViewer.livePlayer;
            if (livePlayer == null) {
                PeerStoriesView.this.deleteStory();
            } else {
                livePlayer.end();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$42(View view) {
            PeerStoriesView.this.deleteStory();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$43(String str, Theme.ResourcesProvider resourcesProvider, TLObject tLObject, String str2, View view) {
            MessagesController.getNotificationsSettings(PeerStoriesView.this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
            NotificationsController.getInstance(PeerStoriesView.this.currentAccount).updateServerNotificationsSettings(PeerStoriesView.this.dialogId, 0L);
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createUsersBulletin(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2))).setTag(2).show();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$44(String str, Theme.ResourcesProvider resourcesProvider, TLObject tLObject, String str2, View view) {
            MessagesController.getNotificationsSettings(PeerStoriesView.this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
            NotificationsController.getInstance(PeerStoriesView.this.currentAccount).updateServerNotificationsSettings(PeerStoriesView.this.dialogId, 0L);
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createUsersBulletin(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2))).setTag(2).show();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$45(View view) {
            MediaDataController.getInstance(PeerStoriesView.this.currentAccount).removePeer(PeerStoriesView.this.dialogId);
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.storiesController.toggleHidden(peerStoriesView.dialogId, true, false, true);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$46(View view) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.toggleArchiveForStory(peerStoriesView.dialogId);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$47(View view) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.toggleArchiveForStory(peerStoriesView.dialogId);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$48(StoryViewer storyViewer, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            if (storyViewer != null) {
                storyViewer.switchToPip();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$49(View view) {
            PeerStoriesView.this.saveToGallery();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$51(ActionBarMenuSubItem actionBarMenuSubItem, final StoryViewer storyViewer, View view) {
            actionBarMenuSubItem.performHapticFeedback(3);
            BulletinFactory global = BulletinFactory.global();
            if (global != null) {
                global.createSimpleBulletin(R.raw.ic_save_to_gallery, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda40
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.8.this.lambda$onCreate$50(storyViewer);
                    }
                })).show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$50(StoryViewer storyViewer) {
            PeerStoriesView.this.delegate.showDialog(new PremiumFeatureBottomSheet(storyViewer.fragment, 14, false));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$52(View view) {
            AndroidUtilities.addToClipboard(PeerStoriesView.this.currentStory.createLink());
            PeerStoriesView.this.onLinkCopied();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$53(View view) {
            PeerStoriesView.this.shareStory(false);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$54(View view) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.currentStory.storyItem.translated = false;
            StoriesStorage storiesStorage = MessagesController.getInstance(peerStoriesView.currentAccount).getStoriesController().getStoriesStorage();
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            storiesStorage.updateStoryItem(storyItem.dialogId, storyItem);
            PeerStoriesView.this.cancelTextSelection();
            PeerStoriesView.this.updatePosition();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$57(View view) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.currentStory.storyItem.translated = true;
            peerStoriesView.cancelTextSelection();
            Delegate delegate = PeerStoriesView.this.delegate;
            if (delegate != null) {
                delegate.setTranslating(true);
            }
            StoriesStorage storiesStorage = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getStoriesController().getStoriesStorage();
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            storiesStorage.updateStoryItem(storyItem.dialogId, storyItem);
            final long currentTimeMillis = System.currentTimeMillis();
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda42
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.this.lambda$onCreate$55();
                }
            };
            MessagesController.getInstance(PeerStoriesView.this.currentAccount).getTranslateController().translateStory(PeerStoriesView.this.currentStory.storyItem, new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda43
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.8.lambda$onCreate$56(runnable, currentTimeMillis);
                }
            });
            PeerStoriesView.this.updatePosition();
            PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
            peerStoriesView2.checkBlackoutMode = true;
            peerStoriesView2.storyCaptionView.expand(true);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$55() {
            Delegate delegate = PeerStoriesView.this.delegate;
            if (delegate != null) {
                delegate.setTranslating(false);
            }
            PeerStoriesView.this.updatePosition();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.checkBlackoutMode = true;
            peerStoriesView.storyCaptionView.expand(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCreate$56(Runnable runnable, long j) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 500 - (System.currentTimeMillis() - j)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$59(final StoryViewer storyViewer, Theme.ResourcesProvider resourcesProvider, View view) {
            if (storyViewer != null) {
                storyViewer.setOverlayVisible(true);
            }
            int i = PeerStoriesView.this.currentAccount;
            Context context = PeerStoriesView.this.getContext();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            ReportBottomSheet.openStory(i, context, peerStoriesView.currentStory.storyItem, BulletinFactory.of(peerStoriesView.storyContainer, resourcesProvider), resourcesProvider, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda47
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PeerStoriesView.8.lambda$onCreate$58(StoryViewer.this, (Boolean) obj);
                }
            });
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCreate$58(StoryViewer storyViewer, Boolean bool) {
            if (storyViewer != null) {
                storyViewer.setOverlayVisible(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreate$60(StoryContainsEmojiButton storyContainsEmojiButton, View view) {
            Delegate delegate;
            EmojiPacksAlert alert = storyContainsEmojiButton.getAlert();
            if (alert == null || (delegate = PeerStoriesView.this.delegate) == null) {
                return;
            }
            delegate.showDialog(alert);
            PeerStoriesView.this.popupMenu.dismiss();
        }

        @Override // org.telegram.ui.Components.CustomPopupMenu
        protected void onDismissed() {
            if (!this.edit && !this.val$popupStillVisible[0]) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda30
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.8.this.lambda$onDismissed$61();
                    }
                });
            }
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.popupMenu = null;
            peerStoriesView.editStoryItem = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDismissed$61() {
            PeerStoriesView.this.delegate.setPopupIsVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$new$9(View view) {
        SpannableStringBuilder replaceTags;
        boolean z;
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy;
        TL_stories.StoryItem storyItem = this.currentStory.storyItem;
        if (storyItem == null) {
            return;
        }
        if (this.isSelf) {
            if (storyItem.privacy.isEmpty()) {
                storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(3, this.currentAccount, new ArrayList());
            } else {
                storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(this.currentAccount, storyItem.privacy);
            }
            editPrivacy(storyPrivacy, storyItem);
            return;
        }
        if (this.privacyHint == null) {
            HintView2 onHiddenListener = new HintView2(getContext(), 1).setMultilineText(true).setTextAlign(Layout.Alignment.ALIGN_CENTER).setOnHiddenListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.this.lambda$new$8();
                }
            });
            this.privacyHint = onHiddenListener;
            onHiddenListener.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.storyContainer.addView(this.privacyHint, LayoutHelper.createFrame(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
        if (user == null) {
            return;
        }
        String str = user.first_name;
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        if (storyItem.close_friends) {
            this.privacyHint.setInnerPadding(15.0f, 8.0f, 15.0f, 8.0f);
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
        } else {
            if (storyItem.contacts) {
                this.privacyHint.setInnerPadding(11.0f, 6.0f, 11.0f, 7.0f);
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                z = false;
                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, this.privacyHint.getTextPaint().getFontMetricsInt(), false);
                HintView2 hintView2 = this.privacyHint;
                hintView2.setMaxWidthPx(!z ? HintView2.cutInFancyHalf(replaceEmoji, hintView2.getTextPaint()) : this.storyContainer.getMeasuredWidth());
                this.privacyHint.setText(replaceEmoji);
                this.privacyHint.setJoint(1.0f, (-(this.storyContainer.getWidth() - this.privacyButton.getCenterX())) / AndroidUtilities.density);
                this.delegate.setIsHintVisible(true);
                if (this.privacyHint.shown()) {
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                this.privacyHint.show();
            }
            if (!storyItem.selected_contacts) {
                return;
            }
            this.privacyHint.setInnerPadding(15.0f, 8.0f, 15.0f, 8.0f);
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
        }
        z = true;
        CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, this.privacyHint.getTextPaint().getFontMetricsInt(), false);
        HintView2 hintView22 = this.privacyHint;
        hintView22.setMaxWidthPx(!z ? HintView2.cutInFancyHalf(replaceEmoji2, hintView22.getTextPaint()) : this.storyContainer.getMeasuredWidth());
        this.privacyHint.setText(replaceEmoji2);
        this.privacyHint.setJoint(1.0f, (-(this.storyContainer.getWidth() - this.privacyButton.getCenterX())) / AndroidUtilities.density);
        this.delegate.setIsHintVisible(true);
        if (this.privacyHint.shown()) {
        }
        this.privacyHint.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$8() {
        this.delegate.setIsHintVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$10(StoryViewer storyViewer, View view) {
        if (this.currentStory.hasSound()) {
            storyViewer.toggleSilentMode();
            if (storyViewer.soundEnabled()) {
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                return;
            }
            return;
        }
        showNoSoundHint(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createStealthModeItem(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        if (isBotsPreview() || this.currentStory.isLive) {
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda51
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PeerStoriesView.this.lambda$createStealthModeItem$11(view);
                }
            });
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, 0.5f), PorterDuff.Mode.MULTIPLY));
        CombinedDrawable combinedDrawable = new CombinedDrawable(ContextCompat.getDrawable(getContext(), R.drawable.msg_stealth_locked), drawable) { // from class: org.telegram.ui.Stories.PeerStoriesView.12
            @Override // org.telegram.ui.Components.CombinedDrawable, android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
            }
        };
        ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, this.resourcesProvider);
        addItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda52
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$createStealthModeItem$12(view);
            }
        });
        addItem.setIcon(combinedDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createStealthModeItem$11(View view) {
        if (this.stealthModeIsActive) {
            StealthModeAlert.showStealthModeEnabledBulletin();
        } else {
            this.delegate.showDialog(new StealthModeAlert(getContext(), getY() + this.storyContainer.getY(), 0, this.resourcesProvider));
        }
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null) {
            customPopupMenu.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createStealthModeItem$12(View view) {
        this.delegate.showDialog(new StealthModeAlert(getContext(), getY() + this.storyContainer.getY(), 0, this.resourcesProvider));
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null) {
            customPopupMenu.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createQualityItem(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        final boolean z = MessagesController.getInstance(this.currentAccount).storyQualityFull;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, z ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda49
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PeerStoriesView.this.lambda$createQualityItem$13(z, view);
                }
            });
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, 0.5f), PorterDuff.Mode.MULTIPLY));
        CombinedDrawable combinedDrawable = new CombinedDrawable(ContextCompat.getDrawable(getContext(), R.drawable.menu_quality_hd2), drawable) { // from class: org.telegram.ui.Stories.PeerStoriesView.13
            @Override // org.telegram.ui.Components.CombinedDrawable, android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
            }
        };
        combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        combinedDrawable.setIconOffset(AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(2.0f));
        ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, this.resourcesProvider);
        addItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$createQualityItem$15(view);
            }
        });
        addItem.setIcon(combinedDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createQualityItem$13(boolean z, View view) {
        MessagesController.getInstance(this.currentAccount).setStoryQuality(!z);
        BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(!z ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage)).show();
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null) {
            customPopupMenu.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createQualityItem$15(View view) {
        final BottomSheet bottomSheet = new BottomSheet(getContext(), false, this.resourcesProvider);
        bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        BackupImageView backupImageView = new BackupImageView(getContext());
        backupImageView.getImageReceiver().setAutoRepeat(1);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(backupImageView, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(150, 150, 1, 0, 16, 0, 16));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StoryQualityPremiumText)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.StoryQualityIncrease), false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
        coloredImageSpan.setTopOffset(1);
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
        buttonWithCounterView.setSubText(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PeerStoriesView.this.lambda$createQualityItem$14(bottomSheet, view2);
            }
        });
        bottomSheet.setCustomView(linearLayout);
        this.delegate.showDialog(bottomSheet);
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null) {
            customPopupMenu.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createQualityItem$14(BottomSheet bottomSheet, View view) {
        this.delegate.showDialog(new PremiumFeatureBottomSheet(this.storyViewer.fragment, 14, false));
        bottomSheet.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLikesReaction(final boolean z) {
        if (this.likesReactionShowing == z || this.currentStory.storyItem == null) {
            return;
        }
        this.likesReactionShowing = z;
        if (z) {
            this.likesReactionLayout.setVisibility(0);
        }
        this.likesReactionLayout.setStoryItem(this.currentStory.storyItem);
        this.delegate.setIsLikesReaction(z);
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.likesReactionShowProgress, z ? 1.0f : 0.0f);
            this.likesReactionLayout.setTransitionProgress(this.likesReactionShowProgress);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda26
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PeerStoriesView.this.lambda$showLikesReaction$16(valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.14
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (z) {
                        return;
                    }
                    PeerStoriesView.this.likesReactionLayout.setVisibility(8);
                    PeerStoriesView.this.likesReactionLayout.reset();
                }
            });
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            ofFloat.start();
            return;
        }
        if (this.likesReactionLayout.getReactionsWindow() != null) {
            this.likesReactionLayout.getReactionsWindow().dismissWithAlpha();
        }
        this.likesReactionLayout.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.15
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PeerStoriesView.this.likesReactionShowProgress = 0.0f;
                PeerStoriesView.this.likesReactionLayout.setAlpha(1.0f);
                PeerStoriesView.this.likesReactionLayout.setVisibility(8);
                PeerStoriesView.this.likesReactionLayout.reset();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLikesReaction$16(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.likesReactionShowProgress = floatValue;
        this.likesReactionLayout.setTransitionProgress(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void likeStory(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        boolean z;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem = this.currentStory.storyItem;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z2 = reaction2 != null;
        if (reaction2 != null && visibleReaction == null) {
            animateLikeButton();
            this.storiesController.setStoryReaction(this.dialogId, this.currentStory.storyItem, null);
        } else if (visibleReaction == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.drawAnimatedEmojiAsMovingReaction = false;
                this.reactionEffectImageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation(), null, null, null, 0);
                if (this.reactionEffectImageReceiver.getLottieAnimation() != null) {
                    this.reactionEffectImageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                }
                this.drawReactionEffect = true;
                this.storiesController.setStoryReaction(this.dialogId, this.currentStory.storyItem, ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(tL_availableReaction));
            }
        } else {
            animateLikeButton();
            this.storiesController.setStoryReaction(this.dialogId, this.currentStory.storyItem, visibleReaction);
        }
        TL_stories.StoryItem storyItem2 = this.currentStory.storyItem;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.storiesLikeButton.setReaction(null);
            z = false;
        } else {
            z2 = !z2;
            this.storiesLikeButton.setReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z = true;
        }
        if (this.isChannel && z2) {
            TL_stories.StoryItem storyItem3 = this.currentStory.storyItem;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = this.currentStory.storyItem.views;
            int i = storyViews.reactions_count + (z ? 1 : -1);
            storyViews.reactions_count = i;
            if (i < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = this.currentStory.storyItem;
        ReactionsUtils.applyForStoryViews(reaction2, storyItem4.sent_reaction, storyItem4.views);
        updateUserViews(true);
    }

    private void animateLikeButton() {
        final StoriesLikeButton storiesLikeButton = this.storiesLikeButton;
        storiesLikeButton.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.16
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AndroidUtilities.removeFromParent(storiesLikeButton);
            }
        }).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        StoriesLikeButton storiesLikeButton2 = new StoriesLikeButton(getContext(), this.sharedResources);
        this.storiesLikeButton = storiesLikeButton2;
        storiesLikeButton2.setPadding(dp, dp, dp, dp);
        this.storiesLikeButton.setAlpha(0.0f);
        this.storiesLikeButton.setScaleX(0.8f);
        this.storiesLikeButton.setScaleY(0.8f);
        this.storiesLikeButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.likeButtonContainer.addView(this.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
        this.drawReactionEffect = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList getAnimatedEmojiSets(StoryItemHolder storyItemHolder) {
        StoryEntry storyEntry;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.InputStickerSet inputStickerSet2;
        if (storyItemHolder == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
        int i = 0;
        if (storyItem != null && storyItem.media_areas != null) {
            for (int i2 = 0; i2 < storyItemHolder.storyItem.media_areas.size(); i2++) {
                TL_stories.MediaArea mediaArea2 = storyItemHolder.storyItem.media_areas.get(i2);
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    TLRPC.Reaction reaction = mediaArea2.reaction;
                    if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                        TLRPC.Document findDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                        if (findDocument != null && (inputStickerSet2 = MessageObject.getInputStickerSet(findDocument)) != null && !hashSet.contains(Long.valueOf(inputStickerSet2.id))) {
                            hashSet.add(Long.valueOf(inputStickerSet2.id));
                            arrayList2.add(inputStickerSet2);
                        }
                    }
                }
            }
        }
        TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
        if (storyItem2 != null && (arrayList = storyItem2.entities) != null && !arrayList.isEmpty()) {
            while (i < storyItemHolder.storyItem.entities.size()) {
                TLRPC.MessageEntity messageEntity = storyItemHolder.storyItem.entities.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    TLRPC.Document document = tL_messageEntityCustomEmoji.document;
                    if (document == null) {
                        document = AnimatedEmojiDrawable.findDocument(this.currentAccount, tL_messageEntityCustomEmoji.document_id);
                    }
                    if (document != null) {
                        TLRPC.InputStickerSet inputStickerSet3 = MessageObject.getInputStickerSet(document);
                        if (!hashSet.contains(Long.valueOf(inputStickerSet3.id))) {
                            hashSet.add(Long.valueOf(inputStickerSet3.id));
                            arrayList2.add(inputStickerSet3);
                        }
                    }
                }
                i++;
            }
        } else {
            StoriesController.UploadingStory uploadingStory = storyItemHolder.uploadingStory;
            if (uploadingStory != null && (storyEntry = uploadingStory.entry) != null) {
                if (storyEntry.mediaEntities != null) {
                    for (int i3 = 0; i3 < storyItemHolder.uploadingStory.entry.mediaEntities.size(); i3++) {
                        VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) storyItemHolder.uploadingStory.entry.mediaEntities.get(i3);
                        if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                            TLRPC.Reaction reaction2 = mediaArea.reaction;
                            if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                TLRPC.Document findDocument2 = AnimatedEmojiDrawable.findDocument(this.currentAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                if (findDocument2 != null && (inputStickerSet = MessageObject.getInputStickerSet(findDocument2)) != null && !hashSet.contains(Long.valueOf(inputStickerSet.id))) {
                                    hashSet.add(Long.valueOf(inputStickerSet.id));
                                    arrayList2.add(inputStickerSet);
                                }
                            }
                        }
                    }
                }
                CharSequence charSequence = storyItemHolder.uploadingStory.entry.caption;
                if (!(charSequence instanceof Spanned) || (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)) == null) {
                    return arrayList2;
                }
                while (i < animatedEmojiSpanArr.length) {
                    AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i];
                    TLRPC.Document document2 = animatedEmojiSpan.document;
                    if (document2 == null) {
                        document2 = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.documentId);
                    }
                    if (document2 != null) {
                        TLRPC.InputStickerSet inputStickerSet4 = MessageObject.getInputStickerSet(document2);
                        if (!hashSet.contains(Long.valueOf(inputStickerSet4.id))) {
                            hashSet.add(Long.valueOf(inputStickerSet4.id));
                            arrayList2.add(inputStickerSet4);
                        }
                    }
                    i++;
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void toggleArchiveForStory(final long j) {
        String str;
        boolean z;
        TLRPC.Chat chat;
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            str = user.first_name;
            z = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            str = chat2.title;
            z = chat2.stories_hidden;
            chat = chat2;
        }
        final TLRPC.Chat chat3 = chat;
        final String str2 = str;
        final boolean z2 = !z;
        final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$toggleArchiveForStory$19(messagesController, j, z2, str2, chat3);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleArchiveForStory$19(final MessagesController messagesController, final long j, final boolean z, String str, TLObject tLObject) {
        messagesController.getStoriesController().toggleHidden(j, z, false, true);
        BulletinFactory.UndoObject undoObject = new BulletinFactory.UndoObject();
        undoObject.onUndo = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda58
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.lambda$toggleArchiveForStory$17(MessagesController.this, j, z);
            }
        };
        undoObject.onAction = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda59
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.lambda$toggleArchiveForStory$18(MessagesController.this, j, z);
            }
        };
        BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider).createUsersBulletin(Arrays.asList(tLObject), !z ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, undoObject).setTag(2).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toggleArchiveForStory$17(MessagesController messagesController, long j, boolean z) {
        messagesController.getStoriesController().toggleHidden(j, !z, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toggleArchiveForStory$18(MessagesController messagesController, long j, boolean z) {
        messagesController.getStoriesController().toggleHidden(j, z, true, true);
    }

    private void createFailView() {
        if (this.failView != null) {
            return;
        }
        StoryFailView storyFailView = new StoryFailView(getContext(), this.resourcesProvider);
        this.failView = storyFailView;
        storyFailView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$createFailView$20(view);
            }
        });
        this.failView.setAlpha(0.0f);
        this.failView.setVisibility(8);
        addView(this.failView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFailView$20(View view) {
        StoriesController.UploadingStory uploadingStory;
        StoryItemHolder storyItemHolder = this.currentStory;
        if (storyItemHolder == null || (uploadingStory = storyItemHolder.uploadingStory) == null) {
            return;
        }
        uploadingStory.tryAgain();
        updatePosition();
    }

    private void createPremiumBlockedText() {
        if (this.premiumBlockedText != null) {
            return;
        }
        if (this.chatActivityEnterView == null) {
            createEnterView();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.premiumBlockedText = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.premiumBlockedText1 = textView;
        textView.setTextColor(-8026747);
        this.premiumBlockedText1.setTextSize(1, 16.0f);
        this.premiumBlockedText1.setText(LocaleController.getString(this.isGroup ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        TextView textView2 = new TextView(getContext());
        this.premiumBlockedText2 = textView2;
        textView2.setTextColor(-1);
        this.premiumBlockedText2.setTextSize(1, 12.0f);
        this.premiumBlockedText2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(40.0f), 452984831, 855638015));
        this.premiumBlockedText2.setGravity(17);
        ScaleStateListAnimator.apply(this.premiumBlockedText2);
        this.premiumBlockedText2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.premiumBlockedText2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.premiumBlockedText.addView(imageView, LayoutHelper.createLinear(22, 22, 16, 12, 1, 4, 0));
        this.premiumBlockedText.addView(this.premiumBlockedText1, LayoutHelper.createLinear(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.premiumBlockedText.addView(this.premiumBlockedText2, LayoutHelper.createLinear(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.chatActivityEnterView.addView(this.premiumBlockedText, LayoutHelper.createFrame(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    private void updatePremiumBlockedText() {
        if (this.areLiveCommentsDisabled) {
            TextView textView = this.premiumBlockedText1;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.premiumBlockedText2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.premiumBlockedText1;
        if (textView3 != null) {
            textView3.setText(LocaleController.getString(this.isGroup ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        }
        TextView textView4 = this.premiumBlockedText2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.premiumBlockedText2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity findActivity() {
        Activity findActivity;
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer == null || (findActivity = storyViewer.parentActivity) == null) {
            findActivity = AndroidUtilities.findActivity(getContext());
        }
        return findActivity == null ? LaunchActivity.instance : findActivity;
    }

    private BaseFragment fragmentForLimit() {
        return new BaseFragment() { // from class: org.telegram.ui.Stories.PeerStoriesView.17
            @Override // org.telegram.ui.ActionBar.BaseFragment
            public boolean isLightStatusBar() {
                return false;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Activity getParentActivity() {
                return PeerStoriesView.this.findActivity();
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Theme.ResourcesProvider getResourceProvider() {
                return new WrappedResourceProvider(PeerStoriesView.this.resourcesProvider) { // from class: org.telegram.ui.Stories.PeerStoriesView.17.1
                    @Override // org.telegram.ui.WrappedResourceProvider
                    public void appendColors() {
                        this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                        this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
                    }
                };
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public boolean presentFragment(BaseFragment baseFragment) {
                if (PeerStoriesView.this.storyViewer == null) {
                    return true;
                }
                PeerStoriesView.this.storyViewer.presentFragment(baseFragment);
                return true;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Dialog showDialog(Dialog dialog) {
                if (PeerStoriesView.this.storyViewer != null) {
                    PeerStoriesView.this.storyViewer.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremiumBlockedToast() {
        String str;
        Bulletin createSimpleBulletin;
        if (this.areLiveCommentsDisabled) {
            return;
        }
        if (this.isGroup) {
            if (this.boostsStatus != null && this.canApplyBoost != null) {
                LimitReachedBottomSheet.openBoostsForRemoveRestrictions(fragmentForLimit(), this.boostsStatus, this.canApplyBoost, this.dialogId, true);
                return;
            }
            StoryViewer storyViewer = this.storyViewer;
            if (storyViewer != null) {
                storyViewer.setOverlayVisible(true);
            }
            MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new Consumer() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda21
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    PeerStoriesView.this.lambda$showPremiumBlockedToast$22((TL_stories.TL_premium_boostsStatus) obj);
                }
            });
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(chatActivityEnterView, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (this.dialogId < 0) {
            str = "";
        } else {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId)));
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            createSimpleBulletin = BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            createSimpleBulletin = BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.this.lambda$showPremiumBlockedToast$23();
                }
            });
        }
        createSimpleBulletin.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremiumBlockedToast$22(final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus == null) {
            StoryViewer storyViewer = this.storyViewer;
            if (storyViewer != null) {
                storyViewer.setOverlayVisible(false);
                return;
            }
            return;
        }
        this.boostsStatus = tL_premium_boostsStatus;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.dialogId, tL_premium_boostsStatus, new Consumer() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda32
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                PeerStoriesView.this.lambda$showPremiumBlockedToast$21(tL_premium_boostsStatus, (ChannelBoostsController.CanApplyBoost) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremiumBlockedToast$21(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.canApplyBoost = canApplyBoost;
        LimitReachedBottomSheet.openBoostsForRemoveRestrictions(fragmentForLimit(), tL_premium_boostsStatus, canApplyBoost, this.dialogId, true);
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer != null) {
            storyViewer.setOverlayVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremiumBlockedToast$23() {
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer != null) {
            storyViewer.presentFragment(new PremiumPreviewFragment("noncontacts"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSpeedItem(boolean z) {
        ActionBarMenuSubItem actionBarMenuSubItem = this.speedItem;
        if (actionBarMenuSubItem == null || this.speedLayout == null || actionBarMenuSubItem.getVisibility() != 0) {
            return;
        }
        if (z) {
            if (Math.abs(StoryViewer.currentSpeed - 0.2f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(StoryViewer.currentSpeed - 0.5f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(StoryViewer.currentSpeed - 1.0f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(StoryViewer.currentSpeed - 1.5f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(StoryViewer.currentSpeed - 2.0f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                this.speedItem.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, SpeedIconDrawable.formatNumber(StoryViewer.currentSpeed) + "x"));
            }
        }
        this.speedLayout.update(StoryViewer.currentSpeed, z);
    }

    private void createCommentButton() {
        if (this.commentButton != null || getContext() == null) {
            return;
        }
        CommentButton commentButton = new CommentButton(getContext(), this.blurredBackgroundColorProvider);
        this.commentButton = commentButton;
        commentButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$createCommentButton$24(view);
            }
        });
        addView(this.commentButton, LayoutHelper.createFrame(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCommentButton$24(View view) {
        this.liveCommentsView.setCollapsed(!r3.isCollapsed(), true);
    }

    private void createPaidReactionsButton() {
        if (this.starsButton != null || getContext() == null) {
            return;
        }
        this.starsButtonEffectsView = new PaidReactionButton.PaidReactionButtonEffectsView(getContext(), this.currentAccount);
        PaidReactionButton paidReactionButton = new PaidReactionButton(getContext(), this.starsButtonEffectsView, this.blurredBackgroundColorProvider);
        this.starsButton = paidReactionButton;
        paidReactionButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda39
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$createPaidReactionsButton$25(view);
            }
        });
        this.starsButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda40
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$createPaidReactionsButton$26;
                lambda$createPaidReactionsButton$26 = PeerStoriesView.this.lambda$createPaidReactionsButton$26(view);
                return lambda$createPaidReactionsButton$26;
            }
        });
        addView(this.starsButton, LayoutHelper.createFrame(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.starsButtonEffectsView, LayoutHelper.createFrame(NotificationCenter.channelRecommendationsLoaded, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createPaidReactionsButton$25(View view) {
        if (disabledPaidFeatures(false)) {
            this.liveCommentsView.openStarsSheet(disabledPaidFeatures(false));
            return;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount);
        if (starsController.balanceAvailable() && starsController.balance.amount <= 0) {
            this.liveCommentsView.openStarsSheet(disabledPaidFeatures(false));
        } else {
            this.liveCommentsView.sendStars(1L, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createPaidReactionsButton$26(View view) {
        this.liveCommentsView.openStarsSheet(disabledPaidFeatures(false));
        return true;
    }

    private void createMuteButton() {
        if (this.muteButton != null || getContext() == null) {
            return;
        }
        MuteButton muteButton = new MuteButton(getContext(), this.blurredBackgroundColorProvider);
        this.muteButton = muteButton;
        muteButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$createMuteButton$27(view);
            }
        });
        MuteButton muteButton2 = this.muteButton;
        LivePlayer livePlayer = LivePlayer.recording;
        muteButton2.setMuted(livePlayer != null && livePlayer.isMuted(), false);
        addView(this.muteButton, LayoutHelper.createFrame(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMuteButton$27(View view) {
        LivePlayer livePlayer = LivePlayer.recording;
        if (livePlayer == null) {
            return;
        }
        boolean z = !livePlayer.isMuted();
        LivePlayer.recording.setMuted(z);
        this.muteButton.setMuted(z, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean disabledPaidFeatures(boolean z) {
        StoryViewer storyViewer;
        LivePlayer livePlayer;
        TLRPC.Peer defaultSendAs;
        LivePlayer livePlayer2;
        long j = this.dialogId;
        if (j >= 0 || (livePlayer2 = this.storyViewer.livePlayer) == null) {
            return j >= 0 && (storyViewer = this.storyViewer) != null && (livePlayer = storyViewer.livePlayer) != null && livePlayer.isAdmin() && (!z || (defaultSendAs = this.storyViewer.livePlayer.getDefaultSendAs()) == null || this.dialogId == DialogObject.getPeerDialogId(defaultSendAs) || DialogObject.getPeerDialogId(defaultSendAs) == UserConfig.getInstance(this.currentAccount).getClientUserId());
        }
        if (!z) {
            return false;
        }
        TLRPC.Peer defaultSendAs2 = livePlayer2.getDefaultSendAs();
        return (this.storyViewer.livePlayer.isAdmin() || ChatObject.canManageCalls(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)))) && (defaultSendAs2 == null || this.dialogId == DialogObject.getPeerDialogId(defaultSendAs2) || DialogObject.getPeerDialogId(defaultSendAs2) == UserConfig.getInstance(this.currentAccount).getClientUserId());
    }

    private void showPaidMessageHint() {
        HintView2 hintView2 = this.highlightMessageHintView;
        if (hintView2 != null) {
            if (hintView2.shown()) {
                return;
            } else {
                removeView(this.highlightMessageHintView);
            }
        }
        if (disabledPaidFeatures(true)) {
            return;
        }
        final HintView2 hintView22 = new HintView2(getContext(), 3);
        this.highlightMessageHintView = hintView22;
        hintView22.setText(LocaleController.getString(R.string.LiveStoryHighlightHint));
        this.highlightMessageHintView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.highlightMessageHintView.setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
        this.highlightMessageHintView.setOnHiddenListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$showPaidMessageHint$28(hintView22);
            }
        });
        addView(this.highlightMessageHintView, LayoutHelper.createFrame(-1, 100, 87));
        this.highlightMessageHintView.show();
        updateViewOffsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPaidMessageHint$28(HintView2 hintView2) {
        removeView(hintView2);
        if (this.highlightMessageHintView == hintView2) {
            this.highlightMessageHintView = null;
        }
    }

    private void createEnterView() {
        19 r7 = new 19(AndroidUtilities.findActivity(getContext()), this, null, true, new WrappedResourceProvider(this.resourcesProvider) { // from class: org.telegram.ui.Stories.PeerStoriesView.18
            @Override // org.telegram.ui.WrappedResourceProvider
            public void appendColors() {
                this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, -1071635414);
            }
        });
        this.chatActivityEnterView = r7;
        r7.getEditField().useAnimatedTextDrawable();
        this.chatActivityEnterView.getEditField().setScaleX(0.0f);
        this.chatActivityEnterView.setOverrideKeyboardAnimation(true);
        this.chatActivityEnterView.setClipChildren(false);
        this.chatActivityEnterView.setDelegate(new 20());
        setDelegate(this.chatActivityEnterView);
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        chatActivityEnterView.shouldDrawBackground = false;
        chatActivityEnterView.shouldDrawRecordedAudioPanelInParent = true;
        if (this.currentStory.isLive) {
            this.chatActivityEnterView.setAllowStickersAndGifs(true, false, false);
        } else {
            this.chatActivityEnterView.setAllowStickersAndGifs(true, true, true);
        }
        this.chatActivityEnterView.updateColors();
        ChatActivityEnterView chatActivityEnterView2 = this.chatActivityEnterView;
        chatActivityEnterView2.isStories = true;
        addView(chatActivityEnterView2, LayoutHelper.createFrame(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.sendAsPeersObj != null) {
            this.chatActivityEnterView.updateSendAsButton(false);
        }
        this.chatActivityEnterView.recordingGuid = this.classGuid;
        this.playerSharedScope.viewsToInvalidate.add(this.storyContainer);
        this.playerSharedScope.viewsToInvalidate.add(this);
        if (this.attachedToWindow) {
            this.chatActivityEnterView.onResume();
        }
        checkStealthMode(false);
        if (isBotsPreview()) {
            this.chatActivityEnterView.setVisibility(8);
        }
        this.reactionsContainerIndex = getChildCount();
    }

    class 19 extends ChatActivityEnterView {
        private int chatActivityEnterViewAnimateFromTop;
        int lastContentViewHeight;
        private Animator messageEditTextAnimator;
        int messageEditTextPredrawHeigth;
        int messageEditTextPredrawScrollY;

        19(Activity activity, SizeNotifierFrameLayout sizeNotifierFrameLayout, ChatActivity chatActivity, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(activity, sizeNotifierFrameLayout, chatActivity, z, resourcesProvider);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        public void updateSendAsButton(boolean z) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            super.updateSendAsButton(peerStoriesView.isPremiumBlocked || peerStoriesView.areLiveCommentsDisabled, z);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        public boolean sendMessage() {
            int i;
            if (this.sendButtonContainer.getAlpha() < 0.5f) {
                return false;
            }
            if (PeerStoriesView.this.currentStory.isLive) {
                long max = Math.max(PeerStoriesView.this.messageStars, PeerStoriesView.this.getMessageMinPrice());
                TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
                CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
                if (formatTextWithEntities.length() <= HighlightMessageSheet.getMaxLength(PeerStoriesView.this.currentAccount)) {
                    if (!PeerStoriesView.this.disabledPaidFeatures(true)) {
                        if (formatTextWithEntities instanceof Spannable) {
                            Spannable spannable = (Spannable) formatTextWithEntities;
                            i = ((AnimatedEmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), AnimatedEmojiSpan.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                        } else {
                            i = 0;
                        }
                        int i2 = (int) max;
                        if (i > HighlightMessageSheet.getTierOption(PeerStoriesView.this.currentAccount, i2, HighlightMessageSheet.TIER_EMOJIS) || formatTextWithEntities.length() > HighlightMessageSheet.getTierOption(PeerStoriesView.this.currentAccount, i2, HighlightMessageSheet.TIER_LENGTH)) {
                            PeerStoriesView.this.lambda$updatePosition$45();
                            return false;
                        }
                    }
                    PeerStoriesView.this.liveCommentsView.send(textWithEntities, max);
                    this.messageEditText.setText("");
                    AndroidUtilities.hideKeyboard(this);
                    PeerStoriesView.this.messageStars = 0L;
                    checkSendButton(true);
                    return true;
                }
                NumberTextView numberTextView = this.captionLimitView;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.captionLimitView.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            return super.sendMessage();
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (!isEnabled()) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth() + (PeerStoriesView.this.premiumBlockedText2 != null ? this.attachLayoutPaddingTranslationX * 1.5f : 0.0f), getHeight());
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    if (contains && PeerStoriesView.this.premiumBlockedText2 != null) {
                        PeerStoriesView.this.premiumBlockedText2.setPressed(true);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (PeerStoriesView.this.premiumBlockedText2 != null) {
                        if (contains && PeerStoriesView.this.premiumBlockedText2.isPressed()) {
                            PeerStoriesView.this.showPremiumBlockedToast();
                        }
                        PeerStoriesView.this.premiumBlockedText2.setPressed(false);
                    }
                } else if (motionEvent.getAction() == 3 && PeerStoriesView.this.premiumBlockedText2 != null) {
                    PeerStoriesView.this.premiumBlockedText2.setPressed(false);
                }
                return PeerStoriesView.this.premiumBlockedText2 != null && PeerStoriesView.this.premiumBlockedText2.isPressed();
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        public void setHorizontalPadding(float f, float f2, float f3, boolean z) {
            if (PeerStoriesView.this.premiumBlockedText != null) {
                PeerStoriesView.this.premiumBlockedText.setTranslationX((1.0f - f3) * f);
            }
            super.setHorizontalPadding(f, f2, f3, z);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        protected boolean showConfirmAlert(Runnable runnable) {
            return PeerStoriesView.this.applyMessageToChat(runnable);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        public void checkAnimation() {
            int backgroundTop = getBackgroundTop();
            int i = this.chatActivityEnterViewAnimateFromTop;
            if (i != 0 && backgroundTop != i) {
                int i2 = (this.animatedTop + i) - backgroundTop;
                setAnimatedTop(i2);
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.forceUpdateOffsets = true;
                if (peerStoriesView.changeBoundAnimator != null) {
                    PeerStoriesView.this.changeBoundAnimator.removeAllListeners();
                    PeerStoriesView.this.changeBoundAnimator.cancel();
                }
                View view = this.topView;
                if (view != null && view.getVisibility() == 0) {
                    this.topView.setTranslationY(this.animatedTop + ((1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height));
                }
                PeerStoriesView.this.invalidate();
                PeerStoriesView.this.changeBoundAnimator = ValueAnimator.ofFloat(i2, 0.0f);
                PeerStoriesView.this.changeBoundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$19$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PeerStoriesView.19.this.lambda$checkAnimation$0(valueAnimator);
                    }
                });
                PeerStoriesView.this.changeBoundAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.19.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        PeerStoriesView.this.invalidate();
                        19.this.setAnimatedTop(0);
                        19 r4 = 19.this;
                        PeerStoriesView.this.forceUpdateOffsets = true;
                        if (((ChatActivityEnterView) r4).topView != null && ((ChatActivityEnterView) 19.this).topView.getVisibility() == 0) {
                            ((ChatActivityEnterView) 19.this).topView.setTranslationY(((ChatActivityEnterView) 19.this).animatedTop + ((1.0f - 19.this.getTopViewEnterProgress()) * ((ChatActivityEnterView) 19.this).topView.getLayoutParams().height));
                        }
                        PeerStoriesView.this.changeBoundAnimator = null;
                    }
                });
                PeerStoriesView.this.changeBoundAnimator.setDuration(250L);
                PeerStoriesView.this.changeBoundAnimator.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                PeerStoriesView.this.changeBoundAnimator.start();
                this.chatActivityEnterViewAnimateFromTop = 0;
            }
            if (this.shouldAnimateEditTextWithBounds) {
                float measuredHeight = (this.messageEditTextPredrawHeigth - this.messageEditText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - this.messageEditText.getScrollY());
                EditTextCaption editTextCaption = this.messageEditText;
                editTextCaption.setOffsetY(editTextCaption.getOffsetY() - measuredHeight);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.messageEditText.getOffsetY(), 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$19$$ExternalSyntheticLambda1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PeerStoriesView.19.this.lambda$checkAnimation$1(valueAnimator);
                    }
                });
                Animator animator = this.messageEditTextAnimator;
                if (animator != null) {
                    animator.cancel();
                }
                this.messageEditTextAnimator = ofFloat;
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                ofFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
                PeerStoriesView.this.updateViewOffsets();
            }
            this.lastContentViewHeight = getMeasuredHeight();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$checkAnimation$0(ValueAnimator valueAnimator) {
            setAnimatedTop((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.forceUpdateOffsets = true;
            peerStoriesView.invalidate();
            invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$checkAnimation$1(ValueAnimator valueAnimator) {
            this.messageEditText.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        protected void onLineCountChanged(int i, int i2) {
            if (PeerStoriesView.this.chatActivityEnterView != null) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = this.messageEditText.getMeasuredHeight();
                this.messageEditTextPredrawScrollY = this.messageEditText.getScrollY();
                invalidate();
                PeerStoriesView.this.invalidate();
                this.chatActivityEnterViewAnimateFromTop = PeerStoriesView.this.chatActivityEnterView.getBackgroundTop();
            }
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        protected void updateRecordInterface(int i, boolean z) {
            super.updateRecordInterface(i, z);
            checkRecording();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        protected void isRecordingStateChanged() {
            super.isRecordingStateChanged();
            checkRecording();
        }

        private void checkRecording() {
            FrameLayout frameLayout;
            boolean z = PeerStoriesView.this.isRecording;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.isRecording = peerStoriesView.chatActivityEnterView.isRecordingAudioVideo() || PeerStoriesView.this.chatActivityEnterView.seekbarVisible() || ((frameLayout = this.recordedAudioPanel) != null && frameLayout.getVisibility() == 0);
            if (z != PeerStoriesView.this.isRecording) {
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                if (peerStoriesView2.isActive) {
                    peerStoriesView2.delegate.setIsRecording(peerStoriesView2.isRecording);
                }
                invalidate();
                PeerStoriesView.this.storyContainer.invalidate();
            }
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        public void extendActionMode(Menu menu) {
            ChatActivity.fillActionModeMenu(menu, null, false, !PeerStoriesView.this.currentStory.isLive());
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        protected boolean sendMessageInternal(boolean z, int i, int i2, long j, boolean z2) {
            if (MessagesController.getInstance(PeerStoriesView.this.currentAccount).isFrozen()) {
                AccountFrozenAlert.show(PeerStoriesView.this.currentAccount);
                return false;
            }
            return super.sendMessageInternal(z, i, i2, j, z2);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        public int getMessagesCount() {
            if (PeerStoriesView.this.currentStory.isLive) {
                return 1;
            }
            return super.getMessagesCount();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        public long getStarsPrice() {
            if (PeerStoriesView.this.currentStory.isLive) {
                return Math.max(PeerStoriesView.this.getMessageMinPrice(), PeerStoriesView.this.messageStars);
            }
            return super.getStarsPrice();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView
        public boolean areLiveCommentsFree() {
            return PeerStoriesView.this.disabledPaidFeatures(true);
        }
    }

    class 20 implements ChatActivityEnterView.ChatActivityEnterViewDelegate {
        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void bottomPanelTranslationYChanged(float f) {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$bottomPanelTranslationYChanged(this, f);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ boolean checkCanRemoveRestrictionsByBoosts() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$checkCanRemoveRestrictionsByBoosts(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ ChatActivity.ReplyQuote getReplyQuote() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$getReplyQuote(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ boolean hasForwardingMessages() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$hasForwardingMessages(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ boolean hasScheduledMessages() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$hasScheduledMessages(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ int measureKeyboardHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$measureKeyboardHeight(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needSendTyping() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needStartRecordAudio(int i) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onAttachButtonHidden() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onAttachButtonShow() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onAudioVideoInterfaceUpdated() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void onContextMenuClose() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$onContextMenuClose(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void onContextMenuOpen() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$onContextMenuOpen(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void onEditTextScroll() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$onEditTextScroll(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void onKeyboardRequested() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$onKeyboardRequested(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onMessageEditEnd(boolean z) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onPreAudioVideoRecord() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onSendLongClick() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onStickersTab(boolean z) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onSwitchRecordMode(boolean z) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onTextSelectionChanged(int i, int i2) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onTextSpansChanged(CharSequence charSequence) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void onTrendingStickersShowed(boolean z) {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$onTrendingStickersShowed(this, z);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onUpdateSlowModeButton(View view, boolean z, CharSequence charSequence) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onWindowSizeChanged(int i) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void openScheduledMessages() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$openScheduledMessages(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void prepareMessageSending() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$prepareMessageSending(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void scrollToSendingMessage() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.-CC.$default$scrollToSendingMessage(this);
        }

        20() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public TLRPC.TL_channels_sendAsPeers getSendAsPeers() {
            if (!PeerStoriesView.this.currentStory.isLive) {
                return null;
            }
            if (PeerStoriesView.this.storyViewer == null || PeerStoriesView.this.storyViewer.livePlayer == null || !PeerStoriesView.this.storyViewer.livePlayer.sendAsDisabled()) {
                return PeerStoriesView.this.sendAsPeersObj;
            }
            return null;
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public TLRPC.Peer getDefaultSendAs() {
            if (PeerStoriesView.this.storyViewer == null || PeerStoriesView.this.storyViewer.livePlayer == null || PeerStoriesView.this.storyViewer.livePlayer.sendAsDisabled()) {
                return null;
            }
            return PeerStoriesView.this.storyViewer.livePlayer.getDefaultSendAs();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public boolean setDefaultSendAs(long j, long j2) {
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) peerStoriesView.currentStory.storyItem.media).call;
                savedefaultsendas.send_as = MessagesController.getInstance(peerStoriesView.currentAccount).getInputPeer(j2);
                ConnectionsManager.getInstance(PeerStoriesView.this.currentAccount).sendRequest(savedefaultsendas, null);
                if (PeerStoriesView.this.storyViewer.livePlayer != null) {
                    PeerStoriesView.this.storyViewer.livePlayer.setDefaultSendAs(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getPeer(j2));
                }
                PeerStoriesView.this.checkStealthMode(true);
                PeerStoriesView.this.chatActivityEnterView.updateSendAsButton(true);
                PeerStoriesView.this.chatActivityEnterView.checkSendButton(true);
                PeerStoriesView.this.updatePosition();
            }
            return true;
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public int getContentViewHeight() {
            return PeerStoriesView.this.getHeight();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onMessageSend(CharSequence charSequence, boolean z, int i, int i2, final long j) {
            if (!PeerStoriesView.this.isRecording) {
                PeerStoriesView.this.afterMessageSend(j <= 0);
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$20$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.20.this.lambda$onMessageSend$0(j);
                    }
                }, 200L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessageSend$0(long j) {
            PeerStoriesView.this.afterMessageSend(j <= 0);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onTextChanged(CharSequence charSequence, boolean z, boolean z2) {
            if (PeerStoriesView.this.mentionContainer == null) {
                PeerStoriesView.this.createMentionsContainer();
            }
            if (PeerStoriesView.this.mentionContainer.getAdapter() != null) {
                PeerStoriesView.this.mentionContainer.setDialogId(PeerStoriesView.this.dialogId);
                if (PeerStoriesView.this.currentStory.isLive) {
                    PeerStoriesView.this.mentionContainer.getAdapter().clear(true);
                } else {
                    PeerStoriesView.this.mentionContainer.getAdapter().setUserOrChat(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId)), MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId)));
                    PeerStoriesView.this.mentionContainer.getAdapter().lambda$searchUsernameOrHashtag$7(charSequence, PeerStoriesView.this.chatActivityEnterView.getCursorPosition(), null, false, false);
                }
            }
            PeerStoriesView.this.invalidate();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void didPressAttachButton() {
            PeerStoriesView.this.openAttachMenu();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void didPressSuggestionButton() {
            PeerStoriesView.this.lambda$updatePosition$45();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needStartRecordVideo(int i, boolean z, int i2, int i3, int i4, long j, long j2) {
            PeerStoriesView.this.checkInstantCameraView();
            if (PeerStoriesView.this.instantCameraView != null) {
                if (i == 0) {
                    PeerStoriesView.this.instantCameraView.showCamera(false);
                    return;
                }
                if (i == 1 || i == 3 || i == 4) {
                    PeerStoriesView.this.instantCameraView.send(i, z, i2, 0, i4, j, j2);
                } else if (i == 2 || i == 5) {
                    PeerStoriesView.this.instantCameraView.cancel(i == 2);
                }
            }
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void toggleVideoRecordingPause() {
            if (PeerStoriesView.this.instantCameraView != null) {
                PeerStoriesView.this.instantCameraView.togglePause();
            }
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public boolean isVideoRecordingPaused() {
            return PeerStoriesView.this.instantCameraView != null && PeerStoriesView.this.instantCameraView.isPaused();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needChangeVideoPreviewState(int i, float f) {
            if (PeerStoriesView.this.instantCameraView != null) {
                PeerStoriesView.this.instantCameraView.changeVideoPreviewState(i, f);
            }
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needShowMediaBanHint() {
            String str;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isGroup) {
                peerStoriesView.showPremiumBlockedToast();
                return;
            }
            if (peerStoriesView.mediaBanTooltip == null) {
                PeerStoriesView.this.mediaBanTooltip = new HintView(PeerStoriesView.this.getContext(), 9, PeerStoriesView.this.resourcesProvider);
                PeerStoriesView.this.mediaBanTooltip.setVisibility(8);
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.addView(peerStoriesView2.mediaBanTooltip, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
            }
            if (PeerStoriesView.this.dialogId >= 0) {
                str = UserObject.getFirstName(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId));
                str = chat != null ? chat.title : "";
            }
            PeerStoriesView.this.mediaBanTooltip.setText(AndroidUtilities.replaceTags(LocaleController.formatString(PeerStoriesView.this.chatActivityEnterView.isInVideoMode() ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, str)));
            PeerStoriesView.this.mediaBanTooltip.showForView(PeerStoriesView.this.chatActivityEnterView.getAudioVideoButtonContainer(), true);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onStickersExpandedChange() {
            PeerStoriesView.this.requestLayout();
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public TL_stories.StoryItem getReplyToStory() {
            return PeerStoriesView.this.currentStory.storyItem;
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public boolean onceVoiceAvailable() {
            TLRPC.User user;
            return (PeerStoriesView.this.dialogId < 0 || (user = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMentionsContainer() {
        MentionsContainerView mentionsContainerView = new MentionsContainerView(getContext(), this.dialogId, 0L, this.storyViewer.fragment, this.resourcesProvider) { // from class: org.telegram.ui.Stories.PeerStoriesView.21
            @Override // org.telegram.ui.Components.MentionsContainerView
            protected boolean isStories() {
                return true;
            }

            @Override // org.telegram.ui.Components.MentionsContainerView
            public void drawRoundRect(Canvas canvas, Rect rect, float f) {
                PeerStoriesView.this.bitmapShaderTools.setBounds(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                rectF.offset(0.0f, 0.0f);
                canvas.drawRoundRect(rectF, f, f, PeerStoriesView.this.bitmapShaderTools.paint);
                canvas.drawRoundRect(rectF, f, f, PeerStoriesView.this.inputBackgroundPaint);
                if (rectF.top < getMeasuredHeight() - 1) {
                    canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, PeerStoriesView.this.resourcesProvider.getPaint("paintDivider"));
                }
            }
        };
        this.mentionContainer = mentionsContainerView;
        mentionsContainerView.withDelegate(new 22());
        addView(this.mentionContainer, LayoutHelper.createFrame(-1, -1, 83));
    }

    class 22 implements MentionsContainerView.Delegate {
        22() {
        }

        @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
        public void onStickerSelected(final TLRPC.TL_document tL_document, final String str, final Object obj) {
            AlertsCreator.ensurePaidMessageConfirmation(PeerStoriesView.this.currentAccount, PeerStoriesView.this.dialogId, 1, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$22$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    PeerStoriesView.22.this.lambda$onStickerSelected$0(tL_document, str, obj, (Long) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStickerSelected$0(TLRPC.TL_document tL_document, String str, Object obj, Long l) {
            SendMessagesHelper.getInstance(PeerStoriesView.this.currentAccount).sendSticker(tL_document, str, PeerStoriesView.this.dialogId, null, null, PeerStoriesView.this.currentStory.storyItem, null, null, true, 0, 0, false, obj, null, 0, l.longValue(), PeerStoriesView.this.chatActivityEnterView.getSendMonoForumPeerId(), PeerStoriesView.this.chatActivityEnterView.getSendMessageSuggestionParams());
            PeerStoriesView.this.chatActivityEnterView.addStickerToRecent(tL_document);
            PeerStoriesView.this.chatActivityEnterView.setFieldText("");
            PeerStoriesView.this.afterMessageSend(l.longValue() <= 0);
        }

        @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
        public void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
            PeerStoriesView.this.chatActivityEnterView.replaceWithText(i, i2, charSequence, z);
        }

        @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
        public Paint.FontMetricsInt getFontMetrics() {
            return PeerStoriesView.this.chatActivityEnterView.getEditField().getPaint().getFontMetricsInt();
        }

        @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
        public void addEmojiToRecent(String str) {
            PeerStoriesView.this.chatActivityEnterView.addEmojiToRecent(str);
        }

        @Override // org.telegram.ui.Components.MentionsContainerView.Delegate
        public void sendBotInlineResult(final TLRPC.BotInlineResult botInlineResult, final boolean z, final int i) {
            AlertsCreator.ensurePaidMessageConfirmation(PeerStoriesView.this.currentAccount, PeerStoriesView.this.dialogId, 1, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$22$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PeerStoriesView.22.this.lambda$sendBotInlineResult$1(botInlineResult, z, i, (Long) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendBotInlineResult$1(TLRPC.BotInlineResult botInlineResult, boolean z, int i, Long l) {
            long contextBotId = PeerStoriesView.this.mentionContainer.getAdapter().getContextBotId();
            HashMap hashMap = new HashMap();
            hashMap.put("id", botInlineResult.id);
            hashMap.put("query_id", "" + botInlineResult.query_id);
            hashMap.put("bot", "" + contextBotId);
            hashMap.put("bot_name", PeerStoriesView.this.mentionContainer.getAdapter().getContextBotName());
            SendMessagesHelper.prepareSendingBotContextResult(PeerStoriesView.this.storyViewer.fragment, PeerStoriesView.this.getAccountInstance(), botInlineResult, hashMap, PeerStoriesView.this.dialogId, null, null, PeerStoriesView.this.currentStory.storyItem, null, z, i, 0, null, 0, l.longValue());
            PeerStoriesView.this.chatActivityEnterView.setFieldText("");
            PeerStoriesView.this.afterMessageSend(l.longValue() <= 0);
            MediaDataController.getInstance(PeerStoriesView.this.currentAccount).increaseInlineRating(contextBotId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean applyMessageToChat(final Runnable runnable) {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return true;
        }
        int i = SharedConfig.stealthModeSendMessageConfirm;
        if (i > 0 && this.stealthModeIsActive) {
            int i2 = i - 1;
            SharedConfig.stealthModeSendMessageConfirm = i2;
            SharedConfig.updateStealthModeSendMessageConfirm(i2);
            AlertDialog alertDialog = new AlertDialog(getContext(), 0, this.resourcesProvider);
            alertDialog.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            alertDialog.setMessage(LocaleController.getString(R.string.StealthModeConfirmMessage));
            alertDialog.setPositiveButton(LocaleController.getString(R.string.Proceed), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda13
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    runnable.run();
                }
            });
            alertDialog.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda14
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    alertDialog2.dismiss();
                }
            });
            alertDialog.show();
        } else {
            runnable.run();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveToGallery() {
        StoryItemHolder storyItemHolder = this.currentStory;
        TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
        if ((storyItem == null && storyItemHolder.uploadingStory == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File path = storyItemHolder.getPath();
        final boolean isVideo = this.currentStory.isVideo();
        if (path != null && path.exists()) {
            MediaController.saveFile(path.toString(), getContext(), isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda48
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PeerStoriesView.this.lambda$saveToGallery$31(isVideo, (Uri) obj);
                }
            });
            return;
        }
        showDownloadAlert();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveToGallery$31(boolean z, Uri uri) {
        BulletinFactory.createSaveToGalleryBulletin(this.storyContainer, z, this.resourcesProvider).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownloadAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setMessage(LocaleController.getString(R.string.PleaseDownload));
        this.delegate.showDialog(builder.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMessageMinPrice() {
        StoryViewer storyViewer;
        if (!this.currentStory.isLive || (storyViewer = this.storyViewer) == null || storyViewer.livePlayer == null || disabledPaidFeatures(true)) {
            return 0L;
        }
        return this.storyViewer.livePlayer.getSendPaidMessagesStars();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openAttachMenu() {
        if (this.chatActivityEnterView == null) {
            return;
        }
        createChatAttachView();
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            this.chatActivityEnterView.closeKeyboard();
        }
        this.chatAttachAlert.setMaxSelectedPhotos(-1, true);
        this.chatAttachAlert.setDialogId(this.dialogId);
        this.chatAttachAlert.init();
        this.chatAttachAlert.getCommentView().setText(this.chatActivityEnterView.getFieldText());
        this.delegate.showDialog(this.chatAttachAlert);
    }

    private void createChatAttachView() {
        if (this.chatAttachAlert == null) {
            BaseFragment baseFragment = null;
            boolean z = false;
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), baseFragment, z, false, true, this.resourcesProvider) { // from class: org.telegram.ui.Stories.PeerStoriesView.23
                @Override // org.telegram.ui.ActionBar.BottomSheet
                public void onDismissAnimationStart() {
                    if (PeerStoriesView.this.chatAttachAlert != null) {
                        PeerStoriesView.this.chatAttachAlert.setFocusable(false);
                    }
                    ChatActivityEnterView chatActivityEnterView = PeerStoriesView.this.chatActivityEnterView;
                    if (chatActivityEnterView == null || chatActivityEnterView.getEditField() == null) {
                        return;
                    }
                    PeerStoriesView.this.chatActivityEnterView.getEditField().requestFocus();
                }
            };
            this.chatAttachAlert = chatAttachAlert;
            chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() { // from class: org.telegram.ui.Stories.PeerStoriesView.24
                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void didSelectBot(TLRPC.User user) {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$didSelectBot(this, user);
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
                public void didPressedButton(int i, boolean z2, boolean z3, int i2, int i3, long j, boolean z4, boolean z5, long j2) {
                    String str;
                    if (PeerStoriesView.this.storyViewer.isShowing) {
                        PeerStoriesView peerStoriesView = PeerStoriesView.this;
                        TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                            return;
                        }
                        int i4 = 4;
                        if (i == 8 || i == 7 || (i == 4 && !peerStoriesView.chatAttachAlert.getPhotoLayout().getSelectedPhotos().isEmpty())) {
                            if (i != 8) {
                                PeerStoriesView.this.chatAttachAlert.dismiss(true);
                            }
                            HashMap<Object, Object> selectedPhotos = PeerStoriesView.this.chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                            ArrayList<Object> selectedPhotosOrder = PeerStoriesView.this.chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                            if (selectedPhotos.isEmpty()) {
                                return;
                            }
                            int i5 = 0;
                            int i6 = 0;
                            while (i6 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                                int i7 = i6 * 10;
                                int min = Math.min(10, selectedPhotos.size() - i7);
                                ArrayList arrayList = new ArrayList();
                                for (int i8 = 0; i8 < min; i8++) {
                                    int i9 = i7 + i8;
                                    if (i9 < selectedPhotosOrder.size()) {
                                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i9));
                                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                                        boolean z6 = photoEntry.isVideo;
                                        if (!z6 && (str = photoEntry.imagePath) != null) {
                                            sendingMediaInfo.path = str;
                                        } else {
                                            String str2 = photoEntry.path;
                                            if (str2 != null) {
                                                sendingMediaInfo.path = str2;
                                            }
                                        }
                                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                                        sendingMediaInfo.isVideo = z6;
                                        CharSequence charSequence = photoEntry.caption;
                                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                                        sendingMediaInfo.entities = photoEntry.entities;
                                        sendingMediaInfo.masks = photoEntry.stickers;
                                        sendingMediaInfo.ttl = photoEntry.ttl;
                                        sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                                        sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                                        sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                                        sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                                        arrayList.add(sendingMediaInfo);
                                        photoEntry.reset();
                                    }
                                }
                                SendMessagesHelper.prepareSendingMedia(PeerStoriesView.this.getAccountInstance(), arrayList, PeerStoriesView.this.dialogId, null, null, storyItem, null, i == i4 || z5, z2, null, z3, i2, i3, 0, i6 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i5)).updateStickersOrder : false, null, null, 0, 0L, false, 0L, PeerStoriesView.this.chatActivityEnterView.getSendMonoForumPeerId(), PeerStoriesView.this.chatActivityEnterView.getSendMessageSuggestionParams());
                                i6++;
                                selectedPhotos = selectedPhotos;
                                selectedPhotosOrder = selectedPhotosOrder;
                                i5 = 0;
                                i4 = 4;
                            }
                            PeerStoriesView.this.chatActivityEnterView.setFieldText("");
                            PeerStoriesView.this.afterMessageSend(j2 <= 0);
                            return;
                        }
                        if (PeerStoriesView.this.chatAttachAlert != null) {
                            PeerStoriesView.this.chatAttachAlert.dismissWithButtonClick(i);
                        }
                    }
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public void onCameraOpened() {
                    PeerStoriesView.this.chatActivityEnterView.closeKeyboard();
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public void doOnIdle(Runnable runnable) {
                    NotificationCenter.getInstance(PeerStoriesView.this.currentAccount).doOnIdle(runnable);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i, int i2, long j, boolean z3, long j2) {
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                    if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    SendMessagesHelper.prepareSendingAudioDocuments(peerStoriesView.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, PeerStoriesView.this.dialogId, null, null, storyItem, z2, i, i2, null, null, 0, j, z3, j2);
                    PeerStoriesView.this.afterMessageSend(j2 <= 0);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public boolean needEnterComment() {
                    return PeerStoriesView.this.needEnterText();
                }
            });
            this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
            this.chatAttachAlert.setAllowEnterCaption(true);
            this.chatAttachAlert.init();
            this.chatAttachAlert.setDocumentsDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() { // from class: org.telegram.ui.Stories.PeerStoriesView.25
                @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
                public /* synthetic */ void didSelectPhotos(ArrayList arrayList, boolean z2, int i, int i2, long j) {
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.-CC.$default$didSelectPhotos(this, arrayList, z2, i, i2, j);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
                public /* synthetic */ void startMusicSelectActivity() {
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.-CC.$default$startMusicSelectActivity(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
                public void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z2, int i, int i2, long j, boolean z3, long j2) {
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                    if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    SendMessagesHelper.prepareSendingDocuments(peerStoriesView.getAccountInstance(), arrayList, arrayList, null, str, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, null, z2, i, null, null, 0, 0L, false, j2);
                    PeerStoriesView.this.afterMessageSend(j2 <= 0);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate
                public void startDocumentSelectActivity() {
                    try {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.setType("*/*");
                        PeerStoriesView.this.storyViewer.startActivityForResult(intent, 21);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            });
            this.chatAttachAlert.getCommentView().setText(this.chatActivityEnterView.getFieldText());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryToOpenRepostStory() {
        if (MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
            File path = this.currentStory.getPath();
            if (path != null && path.exists()) {
                ShareAlert shareAlert = this.shareAlert;
                if (shareAlert != null) {
                    shareAlert.dismiss();
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda33
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.this.openRepostStory();
                    }
                }, 120L);
                return;
            }
            showDownloadAlert();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shareStory(boolean z) {
        StoryItemHolder storyItemHolder = this.currentStory;
        if (storyItemHolder.storyItem == null || this.storyViewer.fragment == null) {
            return;
        }
        String createLink = storyItemHolder.createLink();
        if (z) {
            ShareAlert shareAlert = new ShareAlert(this.storyViewer.fragment.getContext(), null, null, createLink, null, false, createLink, null, false, false, !DISABLE_STORY_REPOSTING && MessagesController.getInstance(this.currentAccount).storiesEnabled() && (!(this.isChannel || UserObject.isService(this.dialogId)) || ChatObject.isPublic(this.isChannel ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)) : null)), null, new WrappedResourceProvider(this.resourcesProvider) { // from class: org.telegram.ui.Stories.PeerStoriesView.26
                @Override // org.telegram.ui.WrappedResourceProvider
                public void appendColors() {
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.blendARGB(-16777216, -1, 0.2f));
                    this.sparseIntArray.put(Theme.key_chat_messagePanelIcons, ColorUtils.blendARGB(-16777216, -1, 0.5f));
                }
            }) { // from class: org.telegram.ui.Stories.PeerStoriesView.27
                @Override // org.telegram.ui.Components.ShareAlert, org.telegram.ui.ActionBar.BottomSheet
                public void dismissInternal() {
                    super.dismissInternal();
                    PeerStoriesView.this.shareAlert = null;
                }

                @Override // org.telegram.ui.Components.ShareAlert
                protected void onShareStory(View view) {
                    PeerStoriesView.this.tryToOpenRepostStory();
                }

                @Override // org.telegram.ui.Components.ShareAlert
                protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z2) {
                    if (z2) {
                        super.onSend(longSparseArray, i, tL_forumTopic, z2);
                        BulletinFactory of = BulletinFactory.of(PeerStoriesView.this.storyContainer, this.resourcesProvider);
                        if (of != null) {
                            if (longSparseArray.size() == 1) {
                                long keyAt = longSparseArray.keyAt(0);
                                if (keyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    of.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])), 5000).hideAfterBottomSheet(false).show();
                                } else if (keyAt < 0) {
                                    of.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-keyAt)).title)), 5000).hideAfterBottomSheet(false).show();
                                } else {
                                    of.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(keyAt)).first_name)), 5000).hideAfterBottomSheet(false).show();
                                }
                            } else {
                                of.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size())))).hideAfterBottomSheet(false).show();
                            }
                            try {
                                PeerStoriesView.this.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            };
            this.shareAlert = shareAlert;
            shareAlert.forceDarkThemeForHint = true;
            TL_stories.StoryItem storyItem = this.currentStory.storyItem;
            storyItem.dialogId = this.dialogId;
            shareAlert.setStoryToShare(storyItem);
            this.shareAlert.setDelegate(new ShareAlert.ShareAlertDelegate() { // from class: org.telegram.ui.Stories.PeerStoriesView.28
                @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
                public /* synthetic */ void didShare() {
                    ShareAlert.ShareAlertDelegate.-CC.$default$didShare(this);
                }

                @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
                public boolean didCopy() {
                    PeerStoriesView.this.onLinkCopied();
                    return true;
                }
            });
            this.delegate.showDialog(this.shareAlert);
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", createLink);
        LaunchActivity.instance.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openRepostStory() {
        final Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$openRepostStory$37(findActivity);
            }
        };
        if (this.delegate.releasePlayer(runnable)) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable, 80L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openRepostStory$37(Activity activity) {
        StoryViewer.VideoPlayerHolder videoPlayerHolder;
        final StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, this.currentAccount);
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        storyRecorder.openForward(StoryRecorder.SourceView.fromStoryViewer(this.storyViewer), StoryEntry.repostStoryItem(this.currentStory.getPath(), this.currentStory.storyItem), (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition, true);
        storyRecorder.setOnFullyOpenListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$openRepostStory$32();
            }
        });
        storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda47
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                PeerStoriesView.this.lambda$openRepostStory$36(storyRecorder, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openRepostStory$32() {
        this.editOpened = true;
        setActive(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$openRepostStory$36(final StoryRecorder storyRecorder, Long l, final Runnable runnable, Boolean bool, final Long l2) {
        DialogStoriesCell dialogStoriesCell;
        BaseFragment baseFragment;
        INavigationLayout parentLayout;
        if (bool.booleanValue()) {
            BaseFragment baseFragment2 = this.storyViewer.fragment;
            if (baseFragment2 != null && (parentLayout = baseFragment2.getParentLayout()) != null) {
                List fragmentStack = parentLayout.getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    BaseFragment baseFragment3 = (BaseFragment) fragmentStack.get(size);
                    if (baseFragment3 instanceof DialogsActivity) {
                        DialogsActivity dialogsActivity = (DialogsActivity) baseFragment3;
                        dialogsActivity.closeSearching();
                        DialogStoriesCell dialogStoriesCell2 = dialogsActivity.dialogStoriesCell;
                        r7 = dialogStoriesCell2 != null ? dialogStoriesCell2.findStoryCell(l2.longValue()) : null;
                        for (int i = 0; i < arrayList.size(); i++) {
                            parentLayout.removeFragmentFromStack((BaseFragment) arrayList.get(i));
                        }
                        dialogStoriesCell = dialogStoriesCell2;
                        baseFragment = this.storyViewer.fragment;
                        if (baseFragment != null) {
                            baseFragment.clearSheets();
                        }
                        this.storyViewer.instantClose();
                        this.editOpened = false;
                        if (dialogStoriesCell == null && dialogStoriesCell.scrollTo(l2.longValue())) {
                            final DialogStoriesCell.StoryCell storyCell = r7;
                            final DialogStoriesCell dialogStoriesCell3 = dialogStoriesCell;
                            dialogStoriesCell.afterNextLayout(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda54
                                @Override // java.lang.Runnable
                                public final void run() {
                                    PeerStoriesView.lambda$openRepostStory$33(DialogStoriesCell.StoryCell.this, dialogStoriesCell3, l2, storyRecorder, runnable);
                                }
                            });
                            return;
                        } else {
                            storyRecorder.replaceSourceView(StoryRecorder.SourceView.fromStoryCell(r7));
                            AndroidUtilities.runOnUIThread(runnable, 400L);
                            return;
                        }
                    }
                    arrayList.add(baseFragment3);
                }
            }
            dialogStoriesCell = null;
            baseFragment = this.storyViewer.fragment;
            if (baseFragment != null) {
            }
            this.storyViewer.instantClose();
            this.editOpened = false;
            if (dialogStoriesCell == null) {
            }
            storyRecorder.replaceSourceView(StoryRecorder.SourceView.fromStoryCell(r7));
            AndroidUtilities.runOnUIThread(runnable, 400L);
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        if (videoPlayerSharedScope != null && videoPlayerSharedScope.player == null) {
            this.delegate.setPopupIsVisible(false);
            setActive(true);
            this.editOpened = false;
            this.onImageReceiverThumbLoaded = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda55
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.lambda$openRepostStory$34(runnable);
                }
            };
            if (bool.booleanValue()) {
                updatePosition();
            }
            AndroidUtilities.runOnUIThread(runnable, 400L);
            return;
        }
        StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
        videoPlayerHolder.firstFrameRendered = false;
        videoPlayerSharedScope.firstFrameRendered = false;
        videoPlayerHolder.setOnReadyListener(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.lambda$openRepostStory$35(runnable, currentTimeMillis);
            }
        });
        this.delegate.setPopupIsVisible(false);
        RLottieImageView rLottieImageView = this.muteIconView;
        if (rLottieImageView != null) {
            rLottieImageView.setAnimation(this.sharedResources.muteDrawable);
        }
        setActive(((this.videoDuration <= 0 || l.longValue() <= this.videoDuration - 1400) ? l : 0L).longValue(), true);
        this.editOpened = false;
        AndroidUtilities.runOnUIThread(runnable, 400L);
        if (bool.booleanValue()) {
            updatePosition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openRepostStory$33(DialogStoriesCell.StoryCell storyCell, DialogStoriesCell dialogStoriesCell, Long l, StoryRecorder storyRecorder, Runnable runnable) {
        if (storyCell == null) {
            storyCell = dialogStoriesCell.findStoryCell(l.longValue());
        }
        storyRecorder.replaceSourceView(StoryRecorder.SourceView.fromStoryCell(storyCell));
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openRepostStory$34(Runnable runnable) {
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openRepostStory$35(Runnable runnable, long j) {
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLinkCopied() {
        if (this.currentStory.storyItem == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = this.currentStory.storyItem.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_exportStoryLink, new RequestDelegate() { // from class: org.telegram.ui.Stories.PeerStoriesView.29
            @Override // org.telegram.tgnet.RequestDelegate
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void setDay(long j, ArrayList arrayList, int i) {
        this.dialogId = j;
        this.day = arrayList;
        bindInternal(i);
    }

    public void setDialogId(long j, int i) {
        if (this.dialogId != j) {
            this.currentStory.clear();
        }
        this.dialogId = j;
        this.day = null;
        bindInternal(i);
        TL_stories.PeerStories peerStories = this.storyViewer.overrideUserStories;
        if (peerStories != null) {
            this.storiesController.loadSkippedStories(peerStories, true);
        } else {
            this.storiesController.loadSkippedStories(j);
        }
    }

    private void setTitle(boolean z, long j, boolean z2) {
        if (!z && j == this.titleLastDialogId && this.titleLastLive == z2) {
            return;
        }
        this.titleLastDialogId = j;
        this.titleLastLive = z2;
        if (j >= 0) {
            if (this.isSelf && !z2) {
                this.headerView.titleView.setText(LocaleController.getString(R.string.SelfStoryTitle));
                this.headerView.titleView.setRightDrawable((Drawable) null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            if (user != null && user.verified) {
                Drawable mutate = ContextCompat.getDrawable(getContext(), R.drawable.verified_profile).mutate();
                mutate.setAlpha(NotificationCenter.didReplacedPhotoInMemCache);
                CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, null);
                combinedDrawable.setFullsize(true);
                combinedDrawable.setCustomSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                this.headerView.titleView.setRightDrawable(combinedDrawable);
            } else {
                this.headerView.titleView.setRightDrawable((Drawable) null);
            }
            if (user != null) {
                this.headerView.titleView.setText(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), this.headerView.titleView.getPaint().getFontMetricsInt(), false));
                return;
            } else {
                this.headerView.titleView.setText(null);
                return;
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.headerView.titleView.setText(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
        if (chat != null && chat.verified) {
            Drawable mutate2 = ContextCompat.getDrawable(getContext(), R.drawable.verified_profile).mutate();
            mutate2.setAlpha(NotificationCenter.didReplacedPhotoInMemCache);
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(mutate2, null);
            combinedDrawable2.setFullsize(true);
            combinedDrawable2.setCustomSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.headerView.titleView.setRightDrawable(combinedDrawable2);
            return;
        }
        this.headerView.titleView.setRightDrawable((Drawable) null);
    }

    private void bindInternal(int i) {
        this.deletedPeer = false;
        this.forceUpdateOffsets = true;
        this.userCanSeeViews = false;
        this.isChannel = false;
        this.isGroup = false;
        long j = this.dialogId;
        if (j >= 0) {
            this.isSelf = j == UserConfig.getInstance(this.currentAccount).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.dialogId);
            this.isPremiumBlocked = !UserConfig.getInstance(this.currentAccount).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            this.avatarDrawable.setInfo(this.currentAccount, user);
            this.headerView.backupImageView.getImageReceiver().setForUserOrChat(user, this.avatarDrawable);
            setTitle(true, this.dialogId, false);
        } else {
            this.isSelf = false;
            this.isChannel = true;
            if (this.storiesController.canEditStories(j) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.userCanSeeViews = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.isGroup = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId) == null) {
                MessagesStorage.getInstance(this.currentAccount).loadChatInfo(-this.dialogId, true, new CountDownLatch(1), false, false);
            }
            this.isPremiumBlocked = this.isGroup && !ChatObject.canSendPlain(chat);
            this.starsPriceBlocked = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialogId);
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            this.headerView.backupImageView.getImageReceiver().setForUserOrChat(chat, this.avatarDrawable);
            setTitle(true, this.dialogId, false);
        }
        if (this.isActive && (this.isSelf || this.isChannel)) {
            this.storiesController.pollViewsForSelfStories(this.dialogId, true);
        }
        updateStoryItems();
        this.selectedPosition = i;
        if (i < 0) {
            this.selectedPosition = 0;
        }
        this.currentImageTime = 0L;
        this.switchEventSent = false;
        this.boostsStatus = null;
        this.canApplyBoost = null;
        int i2 = 8;
        if (this.isChannel) {
            createSelfPeerView();
            if (this.chatActivityEnterView == null && (this.isGroup || this.currentStory.isLive)) {
                createEnterView();
            }
            if (this.chatActivityEnterView != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
                if (this.currentStory.isLive || (!isBotsPreview() && this.isGroup && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i2 = 0;
                }
                chatActivityEnterView.setVisibility(i2);
                this.chatActivityEnterView.setLiveComment(this.currentStory.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
                this.chatActivityEnterView.getEditField().setText(this.storyViewer.getDraft(this.dialogId, this.currentStory.storyItem));
                this.chatActivityEnterView.setDialogId(this.dialogId, this.currentAccount);
                this.chatActivityEnterView.updateRecordButton(chat2, null);
            }
            if (this.reactionsCounter == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
                this.reactionsCounter = animatedTextDrawable;
                animatedTextDrawable.setCallback(this.likeButtonContainer);
                this.reactionsCounter.setTextColor(this.resourcesProvider.getColor(Theme.key_windowBackgroundWhiteBlackText));
                this.reactionsCounter.setTextSize(AndroidUtilities.dp(14.0f));
                this.reactionsCounterProgress = new AnimatedFloat(this.likeButtonContainer);
            }
            if (this.repostButtonContainer != null && this.repostCounter == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable();
                this.repostCounter = animatedTextDrawable2;
                animatedTextDrawable2.setCallback(this.repostButtonContainer);
                this.repostCounter.setTextColor(this.resourcesProvider.getColor(Theme.key_windowBackgroundWhiteBlackText));
                this.repostCounter.setTextSize(AndroidUtilities.dp(14.0f));
                this.repostCounterProgress = new AnimatedFloat(this.repostButtonContainer);
            }
            if (i == -1) {
                updateSelectedPosition();
            }
            updatePosition();
            this.count = getStoriesCount();
            this.storyContainer.invalidate();
            invalidate();
        } else if (this.isSelf) {
            createSelfPeerView();
            if (this.currentStory.isLive) {
                this.selfView.setVisibility(8);
                if (this.chatActivityEnterView == null) {
                    createEnterView();
                }
                this.chatActivityEnterView.setVisibility(0);
            } else {
                this.selfView.setVisibility(0);
                ChatActivityEnterView chatActivityEnterView2 = this.chatActivityEnterView;
                if (chatActivityEnterView2 != null) {
                    chatActivityEnterView2.setVisibility(8);
                }
            }
            ChatActivityEnterView chatActivityEnterView3 = this.chatActivityEnterView;
            if (chatActivityEnterView3 != null) {
                chatActivityEnterView3.setLiveComment(this.currentStory.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
            }
            if (i == -1) {
                ArrayList arrayList = this.day;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(this.storyViewer.dayStoryId));
                    if (indexOf < 0 && !this.day.isEmpty()) {
                        if (this.storyViewer.dayStoryId > ((Integer) this.day.get(0)).intValue()) {
                            indexOf = 0;
                        } else {
                            int i3 = this.storyViewer.dayStoryId;
                            ArrayList arrayList2 = this.day;
                            if (i3 < ((Integer) arrayList2.get(arrayList2.size() - 1)).intValue()) {
                                indexOf = this.day.size() - 1;
                            }
                        }
                    }
                    this.selectedPosition = Math.max(0, indexOf);
                } else if (!this.uploadingStories.isEmpty()) {
                    this.selectedPosition = this.storyItems.size();
                } else {
                    for (int i4 = 0; i4 < this.storyItems.size(); i4++) {
                        if (((TL_stories.StoryItem) this.storyItems.get(i4)).justUploaded || ((TL_stories.StoryItem) this.storyItems.get(i4)).id > this.storiesController.dialogIdToMaxReadId.get(this.dialogId)) {
                            this.selectedPosition = i4;
                            break;
                        }
                    }
                }
            }
            updatePosition();
            this.storyContainer.invalidate();
            invalidate();
        } else {
            if (this.chatActivityEnterView == null) {
                createEnterView();
            }
            if (this.isPremiumBlocked && this.premiumBlockedText == null) {
                createPremiumBlockedText();
            }
            if (this.premiumBlockedText != null) {
                if (this.isPremiumBlocked || this.areLiveCommentsDisabled) {
                    updatePremiumBlockedText();
                }
                this.premiumBlockedText.setVisibility(((!this.isPremiumBlocked || this.currentStory.isLive) && !this.areLiveCommentsDisabled) ? 8 : 0);
            }
            StoryFailView storyFailView = this.failView;
            if (storyFailView != null) {
                storyFailView.setVisibility(8);
            }
            if (i == -1) {
                updateSelectedPosition();
            }
            updatePosition();
            ChatActivityEnterView chatActivityEnterView4 = this.chatActivityEnterView;
            if (chatActivityEnterView4 != null) {
                chatActivityEnterView4.setVisibility((isBotsPreview() || UserObject.isService(this.dialogId)) ? 8 : 0);
                this.chatActivityEnterView.setLiveComment(this.currentStory.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
                this.chatActivityEnterView.getEditField().setText(this.storyViewer.getDraft(this.dialogId, this.currentStory.storyItem));
                this.chatActivityEnterView.setDialogId(this.dialogId, this.currentAccount);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
                if (userFull != null) {
                    this.chatActivityEnterView.updateRecordButton(null, userFull);
                } else {
                    MessagesController.getInstance(this.currentAccount).loadFullUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId)), this.classGuid, false);
                }
            }
            this.count = getStoriesCount();
            FrameLayout frameLayout = this.selfView;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            this.storyContainer.invalidate();
            invalidate();
        }
        checkStealthMode(false);
    }

    private void createUnsupportedContainer() {
        if (this.unsupportedContainer != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.StoryUnsupported));
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        TextView textView2 = new TextView(getContext());
        ScaleStateListAnimator.apply(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i = Theme.key_featuredStickers_buttonText;
        textView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), ColorUtils.setAlphaComponent(Theme.getColor(i, this.resourcesProvider), 30)));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeerStoriesView.this.lambda$createUnsupportedContainer$38(view);
            }
        });
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 24.0f, 0.0f, 0.0f));
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.storyContainer.addView(frameLayout);
        this.unsupportedContainer = frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createUnsupportedContainer$38(View view) {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.checkAppUpdate(true, null);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            Browser.openUrl(getContext(), BuildVars.HUAWEI_STORE_URL);
        } else {
            Browser.openUrl(getContext(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    public void preloadMainImage(long j) {
        if (this.dialogId == j && this.day == null) {
            return;
        }
        this.dialogId = j;
        updateStoryItems();
        updateSelectedPosition();
        updatePosition(true);
        TL_stories.PeerStories peerStories = this.storyViewer.overrideUserStories;
        if (peerStories != null) {
            this.storiesController.loadSkippedStories(peerStories, true);
        } else {
            this.storiesController.loadSkippedStories(j);
        }
    }

    private void updateSelectedPosition() {
        TL_stories.PeerStories peerStories;
        int i;
        if (this.day != null) {
            ArrayList arrayList = this.uploadingStories;
            if (arrayList == null || arrayList.isEmpty()) {
                i = 0;
            } else {
                i = this.uploadingStories.size();
                for (int i2 = 0; i2 < this.uploadingStories.size(); i2++) {
                    if (SessionDetails$$ExternalSyntheticBackport0.m(((StoriesController.UploadingStory) this.uploadingStories.get(i2)).random_id) == this.storyViewer.dayStoryId) {
                        this.selectedPosition = i2;
                        return;
                    }
                }
            }
            int indexOf = this.day.indexOf(Integer.valueOf(this.storyViewer.dayStoryId));
            if (indexOf < 0 && !this.day.isEmpty()) {
                if (this.storyViewer.dayStoryId > ((Integer) this.day.get(0)).intValue()) {
                    indexOf = 0;
                } else {
                    if (this.storyViewer.dayStoryId < ((Integer) this.day.get(r5.size() - 1)).intValue()) {
                        indexOf = this.day.size() - 1;
                    }
                }
            }
            this.selectedPosition = i + indexOf;
        } else {
            int i3 = this.storyViewer.savedPositions.get(this.dialogId, -1);
            this.selectedPosition = i3;
            if (i3 == -1 && !this.storyViewer.isSingleStory && (peerStories = this.userStories) != null && peerStories.max_read_id > 0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.storyItems.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) this.storyItems.get(i4)).id > this.userStories.max_read_id) {
                        this.selectedPosition = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        if (this.selectedPosition == -1) {
            this.selectedPosition = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStoryItems() {
        StoriesController.StoriesList storiesList;
        TL_stories.StoryItem storyItem;
        this.storyItems.clear();
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer.isSingleStory) {
            if (!storyViewer.singleStoryDeleted) {
                this.storyItems.add(storyViewer.singleStory);
            }
        } else {
            int i = 0;
            if (this.day != null && (storiesList = storyViewer.storiesList) != null) {
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    this.uploadingStories.clear();
                    ArrayList uploadingStories = MessagesController.getInstance(this.currentAccount).getStoriesController().getUploadingStories(this.dialogId);
                    String str = ((StoriesController.BotPreviewsList) this.storyViewer.storiesList).lang_code;
                    if (uploadingStories != null) {
                        while (i < uploadingStories.size()) {
                            StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) uploadingStories.get(i);
                            StoryEntry storyEntry = uploadingStory.entry;
                            if (storyEntry != null && !storyEntry.isEdit && TextUtils.equals(storyEntry.botLang, str)) {
                                this.uploadingStories.add(uploadingStory);
                            }
                            i++;
                        }
                    }
                }
                Iterator it = this.day.iterator();
                while (it.hasNext()) {
                    MessageObject findMessageObject = this.storyViewer.storiesList.findMessageObject(((Integer) it.next()).intValue());
                    if (findMessageObject != null && (storyItem = findMessageObject.storyItem) != null) {
                        this.storyItems.add(storyItem);
                    }
                }
            } else if (storyViewer.storiesList != null) {
                while (i < this.storyViewer.storiesList.messageObjects.size()) {
                    this.storyItems.add(((MessageObject) this.storyViewer.storiesList.messageObjects.get(i)).storyItem);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = storyViewer.overrideUserStories;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.dialogId) {
                    this.userStories = this.storyViewer.overrideUserStories;
                } else {
                    TL_stories.PeerStories stories = this.storiesController.getStories(this.dialogId);
                    this.userStories = stories;
                    if (stories == null) {
                        this.userStories = this.storiesController.getStoriesFromFullPeer(this.dialogId);
                    }
                }
                this.totalStoriesCount = 0;
                TL_stories.PeerStories peerStories2 = this.userStories;
                if (peerStories2 != null) {
                    this.totalStoriesCount = peerStories2.stories.size();
                    this.storyItems.addAll(this.userStories.stories);
                }
                this.uploadingStories.clear();
                ArrayList uploadingStories2 = this.storiesController.getUploadingStories(this.dialogId);
                if (uploadingStories2 != null) {
                    this.uploadingStories.addAll(uploadingStories2);
                }
            }
        }
        this.count = getStoriesCount();
    }

    private void createSelfPeerView() {
        if (this.selfView != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext()) { // from class: org.telegram.ui.Stories.PeerStoriesView.30
            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                int x;
                if (PeerStoriesView.this.selfAvatarsContainer.getVisibility() == 0 && PeerStoriesView.this.selfAvatarsContainer.getLayoutParams().width != (x = (int) (((PeerStoriesView.this.selfStatusView.getX() + PeerStoriesView.this.selfStatusView.getMeasuredWidth()) - PeerStoriesView.this.selfAvatarsContainer.getX()) + AndroidUtilities.dp(10.0f)))) {
                    PeerStoriesView.this.selfAvatarsContainer.getLayoutParams().width = x;
                    PeerStoriesView.this.selfAvatarsContainer.invalidate();
                    PeerStoriesView.this.selfAvatarsContainer.requestLayout();
                }
                super.dispatchDraw(canvas);
            }
        };
        this.selfView = frameLayout;
        frameLayout.setClickable(true);
        addView(this.selfView, LayoutHelper.createFrame(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        View view = new View(getContext()) { // from class: org.telegram.ui.Stories.PeerStoriesView.31
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            AnimatedFloat animatedFloat = new AnimatedFloat(250, CubicBezierInterpolator.DEFAULT);

            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                this.animatedFloat.setParent(this);
                this.animatedFloat.set(PeerStoriesView.this.showViewsProgress ? 1.0f : 0.0f, false);
                if (this.animatedFloat.get() != 0.0f) {
                    if (this.animatedFloat.get() != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (this.animatedFloat.get() * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    this.loadingDrawable.setBounds(rectF);
                    this.loadingDrawable.setRadiiDp(24.0f);
                    this.loadingDrawable.setColors(ColorUtils.setAlphaComponent(-1, 20), ColorUtils.setAlphaComponent(-1, 50), ColorUtils.setAlphaComponent(-1, 50), ColorUtils.setAlphaComponent(-1, 70));
                    this.loadingDrawable.draw(canvas);
                    invalidate();
                    canvas.restore();
                }
            }
        };
        this.selfAvatarsContainer = view;
        view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PeerStoriesView.this.lambda$createSelfPeerView$39(view2);
            }
        });
        this.selfView.addView(this.selfAvatarsContainer, LayoutHelper.createFrame(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        HwAvatarsImageView hwAvatarsImageView = new HwAvatarsImageView(getContext(), false);
        this.selfAvatarsView = hwAvatarsImageView;
        hwAvatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.selfView.addView(this.selfAvatarsView, LayoutHelper.createFrame(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.selfStatusView = textView;
        textView.setTextSize(1, 14.0f);
        this.selfStatusView.setTextColor(-1);
        this.selfView.addView(this.selfStatusView, LayoutHelper.createFrame(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.sharedResources.deleteDrawable);
        this.selfAvatarsContainer.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(15.0f), 0, ColorUtils.setAlphaComponent(-1, 120)));
        imageView.setBackground(Theme.createCircleSelectorDrawable(ColorUtils.setAlphaComponent(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSelfPeerView$39(View view) {
        showUserViewsDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteStory() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(isBotsPreview() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle));
        builder.setMessage(LocaleController.getString(isBotsPreview() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda43
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                PeerStoriesView.this.lambda$deleteStory$40(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda44
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog create = builder.create();
        this.delegate.showDialog(create);
        create.redPositive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteStory$40(AlertDialog alertDialog, int i) {
        TL_stories.StoryItem storyItem;
        if (this.currentStory.isLive && (storyItem = this.currentStory.storyItem) != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                LivePlayer livePlayer = LivePlayer.recording;
                if (livePlayer != null && livePlayer.equals(inputGroupCall)) {
                    LivePlayer.recording.destroy();
                    if (LivePlayer.recording != null) {
                        LivePlayer.recording = null;
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(LivePlayer.recording.getCallId()));
                    }
                }
            }
        }
        this.currentStory.cancelOrDelete();
        updateStoryItems();
        if (this.isActive && this.count == 0) {
            this.delegate.switchToNextAndRemoveCurrentPeer();
            return;
        }
        int i2 = this.selectedPosition;
        int i3 = this.count;
        if (i2 >= i3) {
            this.selectedPosition = i3 - 1;
        } else if (i2 < 0) {
            this.selectedPosition = 0;
        }
        updatePosition();
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer != null) {
            storyViewer.checkSelfStoriesView();
        }
    }

    private void showUserViewsDialog() {
        this.storyViewer.openViews();
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.sharedResources.topOverlayGradient.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2;
        updateViewOffsets();
        if (this.isChannel && (animatedTextDrawable2 = this.reactionsCounter) != null) {
            animatedTextDrawable2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.isChannel && (animatedTextDrawable = this.repostCounter) != null) {
            animatedTextDrawable.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        if (this.movingReaction) {
            float x = this.bottomActionsLinearLayout.getX() + this.likeButtonContainer.getX() + (this.likeButtonContainer.getMeasuredWidth() / 2.0f);
            float y = this.bottomActionsLinearLayout.getY() + this.likeButtonContainer.getY() + (this.likeButtonContainer.getMeasuredHeight() / 2.0f);
            int dp = AndroidUtilities.dp(24.0f);
            float f = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.movingReactionFromX, x - f, CubicBezierInterpolator.EASE_OUT.getInterpolation(this.movingReactionProgress));
            float lerp2 = AndroidUtilities.lerp(this.movingReactionFromY, y - f, this.movingReactionProgress);
            int lerp3 = AndroidUtilities.lerp(this.movingReactionFromSize, dp, this.movingReactionProgress);
            if (this.drawAnimatedEmojiAsMovingReaction) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.reactionMoveDrawable;
                if (animatedEmojiDrawable != null) {
                    float f2 = lerp3;
                    animatedEmojiDrawable.setBounds((int) lerp, (int) lerp2, (int) (lerp + f2), (int) (lerp2 + f2));
                    this.reactionMoveDrawable.draw(canvas);
                }
            } else {
                float f3 = lerp3;
                this.reactionMoveImageReceiver.setImageCoords(lerp, lerp2, f3, f3);
                this.reactionMoveImageReceiver.draw(canvas);
            }
        }
        if (this.drawReactionEffect) {
            float x2 = this.bottomActionsLinearLayout.getX() + this.likeButtonContainer.getX() + (this.likeButtonContainer.getMeasuredWidth() / 2.0f);
            float y2 = this.bottomActionsLinearLayout.getY() + this.likeButtonContainer.getY() + (this.likeButtonContainer.getMeasuredHeight() / 2.0f);
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.drawAnimatedEmojiAsMovingReaction) {
                float f4 = dp2;
                float f5 = f4 / 2.0f;
                this.reactionEffectImageReceiver.setImageCoords(x2 - f5, y2 - f5, f4, f4);
                this.reactionEffectImageReceiver.draw(canvas);
                if (this.reactionEffectImageReceiver.getLottieAnimation() != null && this.reactionEffectImageReceiver.getLottieAnimation().isLastFrame()) {
                    this.drawReactionEffect = false;
                }
            } else {
                AnimatedEmojiEffect animatedEmojiEffect = this.emojiReactionEffect;
                if (animatedEmojiEffect != null) {
                    float f6 = dp2 / 2.0f;
                    animatedEmojiEffect.setBounds((int) (x2 - f6), (int) (y2 - f6), (int) (x2 + f6), (int) (y2 + f6));
                    this.emojiReactionEffect.draw(canvas);
                    if (this.emojiReactionEffect.isDone()) {
                        this.emojiReactionEffect.removeView(this);
                        this.emojiReactionEffect = null;
                        this.drawReactionEffect = false;
                    }
                } else {
                    this.drawReactionEffect = false;
                }
            }
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.drawRecordedPannel(canvas);
        }
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.imageReceiver.onAttachedToWindow();
        this.rightPreloadImageReceiver.onAttachedToWindow();
        this.leftPreloadImageReceiver.onAttachedToWindow();
        this.reactionEffectImageReceiver.onAttachedToWindow();
        this.reactionMoveImageReceiver.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onResume();
        }
        for (int i = 0; i < this.preloadReactionHolders.size(); i++) {
            ((ReactionImageHolder) this.preloadReactionHolders.get(i)).onAttachedToWindow(true);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.liveStoryUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storyQualityUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stealthModeChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesLimitUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didLoadSendAsPeers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        this.imageReceiver.onDetachedFromWindow();
        this.rightPreloadImageReceiver.onDetachedFromWindow();
        this.leftPreloadImageReceiver.onDetachedFromWindow();
        this.reactionEffectImageReceiver.onDetachedFromWindow();
        this.reactionMoveImageReceiver.onDetachedFromWindow();
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onPause();
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = this.reactionMoveDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
            this.reactionMoveDrawable = null;
        }
        AnimatedEmojiEffect animatedEmojiEffect = this.emojiReactionEffect;
        if (animatedEmojiEffect != null) {
            animatedEmojiEffect.removeView(this);
            this.emojiReactionEffect = null;
        }
        for (int i = 0; i < this.preloadReactionHolders.size(); i++) {
            ((ReactionImageHolder) this.preloadReactionHolders.get(i)).onAttachedToWindow(false);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.liveStoryUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storyQualityUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stealthModeChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        LivePlayer livePlayer;
        if (i != NotificationCenter.storiesUpdated) {
            boolean z = false;
            if (i != NotificationCenter.storiesListUpdated || this.storyViewer.storiesList != objArr[0]) {
                if (i == NotificationCenter.storyQualityUpdate) {
                    updatePosition();
                    return;
                }
                if (i == NotificationCenter.emojiLoaded) {
                    this.storyCaptionView.captionTextview.invalidate();
                    return;
                }
                if (i == NotificationCenter.stealthModeChanged) {
                    checkStealthMode(true);
                    return;
                }
                if (i == NotificationCenter.storiesLimitUpdate) {
                    StoriesController.StoryLimit checkStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit();
                    if (checkStoryLimit == null || !checkStoryLimit.active(this.currentAccount) || this.delegate == null) {
                        return;
                    }
                    this.delegate.showDialog(new LimitReachedBottomSheet(fragmentForLimit(), findActivity(), checkStoryLimit.getLimitReachedType(), this.currentAccount, null));
                    return;
                }
                if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
                    TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.dialogId);
                    if (this.dialogId >= 0 && !UserConfig.getInstance(this.currentAccount).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                        z = true;
                    }
                    if (this.isPremiumBlocked == z && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                        return;
                    }
                    this.isPremiumBlocked = z;
                    this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                    updatePosition();
                    checkStealthMode(true);
                    return;
                }
                if (i == NotificationCenter.chatInfoDidLoad) {
                    Object obj = objArr[0];
                    if ((obj instanceof TLRPC.ChatFull) && this.dialogId == (-((TLRPC.ChatFull) obj).id)) {
                        updatePosition();
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.liveStoryUpdated) {
                    long longValue = ((Long) objArr[0]).longValue();
                    StoryViewer storyViewer = this.storyViewer;
                    if (storyViewer == null || (livePlayer = storyViewer.livePlayer) == null || livePlayer.getCallId() != longValue) {
                        return;
                    }
                    updatePosition();
                    ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
                    if (chatActivityEnterView != null) {
                        chatActivityEnterView.checkSendButton(true);
                        this.chatActivityEnterView.updateSendAsButton(true);
                        checkStealthMode(true);
                    }
                    LiveCommentsView liveCommentsView = this.liveCommentsView;
                    if (liveCommentsView != null) {
                        liveCommentsView.updatedMinStars();
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                    loadSendAsPeers(true);
                    return;
                }
                return;
            }
        }
        Delegate delegate = this.delegate;
        if (delegate == null || !delegate.isClosed()) {
            if (this.isActive) {
                updateStoryItems();
                if (this.count == 0) {
                    if (this.deletedPeer) {
                        return;
                    }
                    this.deletedPeer = true;
                    this.delegate.switchToNextAndRemoveCurrentPeer();
                    return;
                }
                if (this.selectedPosition >= this.storyItems.size() + this.uploadingStories.size()) {
                    this.selectedPosition = (this.storyItems.size() + this.uploadingStories.size()) - 1;
                }
                updatePosition();
                if (this.isSelf || this.isChannel) {
                    updateUserViews(true);
                }
            }
            TL_stories.PeerStories peerStories = this.storyViewer.overrideUserStories;
            if (peerStories != null) {
                this.storiesController.loadSkippedStories(peerStories, true);
            } else {
                long j = this.dialogId;
                if (j != 0) {
                    this.storiesController.loadSkippedStories(j);
                }
            }
            ActionBarMenuSubItem actionBarMenuSubItem = this.editStoryItem;
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.animate().alpha((this.storiesController.hasUploadingStories(this.dialogId) && this.currentStory.isVideo && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
            }
        }
    }

    private void loadSendAsPeers(boolean z) {
        LivePlayer livePlayer;
        if (this.sendAsPeersObj != null) {
            return;
        }
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer == null || (livePlayer = storyViewer.livePlayer) == null || !livePlayer.sendAsDisabled()) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.currentAccount).getSendAsPeers(this.dialogId, true);
            this.sendAsPeersObj = sendAsPeers;
            ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
            if (chatActivityEnterView == null || sendAsPeers == null) {
                return;
            }
            chatActivityEnterView.updateSendAsButton(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$42() {
        checkStealthMode(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkStealthMode(boolean z) {
        if (this.chatActivityEnterView != null && this.isVisible && this.attachedToWindow) {
            AndroidUtilities.cancelRunOnUIThread(this.updateStealthModeTimer);
            TL_stories.TL_storiesStealthMode stealthMode = this.storiesController.getStealthMode();
            this.chatActivityEnterView.checkSendButton(true);
            if ((this.isPremiumBlocked && !this.currentStory.isLive) || this.areLiveCommentsDisabled) {
                this.stealthModeIsActive = false;
                this.chatActivityEnterView.setEnabled(false);
                this.chatActivityEnterView.setOverrideHint(" ", z);
                return;
            }
            if (this.starsPriceBlocked > 0) {
                this.stealthModeIsActive = false;
                this.chatActivityEnterView.setEnabled(true);
                this.chatActivityEnterView.setOverrideHint(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.starsPriceBlocked, ','))), z);
                return;
            }
            if (stealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i = stealthMode.active_until_date;
                if (currentTime < i) {
                    this.stealthModeIsActive = true;
                    int currentTime2 = i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    int i2 = currentTime2 / 60;
                    int i3 = currentTime2 % 60;
                    int i4 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int measureText = (int) this.chatActivityEnterView.getEditField().getPaint().measureText(LocaleController.formatString("StealthModeActiveHint", i4, String.format(locale, "%02d:%02d", 99, 99)));
                    this.chatActivityEnterView.setEnabled(true);
                    if (measureText * 1.2f >= this.chatActivityEnterView.getEditField().getMeasuredWidth()) {
                        this.chatActivityEnterView.setOverrideHint(LocaleController.formatString("StealthModeActiveHintShort", i4, ""), String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3)), z);
                    } else {
                        this.chatActivityEnterView.setOverrideHint(LocaleController.formatString("StealthModeActiveHint", R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3))), z);
                    }
                    AndroidUtilities.runOnUIThread(this.updateStealthModeTimer, 1000L);
                    return;
                }
            }
            this.stealthModeIsActive = false;
            this.chatActivityEnterView.setEnabled(true);
            if (this.currentStory.isLive) {
                if (this.chatActivityEnterView.getStarsPrice() > 0) {
                    this.chatActivityEnterView.setOverrideHint(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r3, ',')), this.chatActivityEnterView.spans), z);
                    ColoredImageSpan coloredImageSpan = this.chatActivityEnterView.spans[0];
                    if (coloredImageSpan != null) {
                        coloredImageSpan.spaceScaleX = 0.9f;
                        return;
                    }
                    return;
                }
                this.chatActivityEnterView.setOverrideHint(LocaleController.getString(R.string.Comment), z);
                return;
            }
            this.chatActivityEnterView.setOverrideHint(LocaleController.getString(this.isGroup ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z);
        }
    }

    public void updatePosition() {
        updatePosition(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x092b, code lost:
    
        if (r1.captionTranslated == (r5 == null && r5.translated && r5.translatedText != null && android.text.TextUtils.equals(r5.translatedLng, org.telegram.ui.Components.TranslateAlert2.getToLanguage()))) goto L377;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0d96  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0db0 A[EDGE_INSN: B:282:0x0db0->B:283:0x0db0 BREAK  A[LOOP:0: B:271:0x0d8a->B:280:0x0dad], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0e1a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0e60  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0e6f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0e95  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0f34  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0f6e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0f83  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0fab  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0fcb  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0ff2  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0edf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0e69  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0e2c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0504 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0600 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x094c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updatePosition(boolean z) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        StoriesController.UploadingStory uploadingStory;
        StoriesController.UploadingStory uploadingStory2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        StoryViewer.TransitionViewHolder transitionViewHolder;
        ImageReceiver imageReceiver;
        boolean z5;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z6;
        Drawable drawable;
        boolean z7;
        TL_stories.StoryItem storyItem3;
        TL_stories.StoryItem storyItem4;
        StoriesController.UploadingStory uploadingStory3;
        TL_stories.StoryItem storyItem5;
        boolean z8;
        ChatActivityEnterView chatActivityEnterView;
        boolean z9;
        StoriesController.UploadingStory uploadingStory4;
        TL_stories.StoryItem storyItem6;
        StoriesController.UploadingStory uploadingStory5;
        CharSequence charSequence;
        TL_stories.StoryItem storyItem7;
        SpannableStringBuilder spannableStringBuilder;
        LivePlayer livePlayer;
        TLRPC.MessageMedia messageMedia;
        HintView2 hintView2;
        HintView2 hintView22;
        CharSequence charSequence2;
        TL_stories.StoryItem storyItem8;
        StoryItemHolder storyItemHolder;
        Delegate delegate;
        boolean z10;
        LinearLayout linearLayout;
        ChatActivityEnterView chatActivityEnterView2;
        ChatActivityEnterView chatActivityEnterView3;
        CommentButton commentButton;
        MuteButton muteButton;
        TL_stories.StoryItem storyItem9;
        StoriesController.UploadingStory uploadingStory6;
        StoriesController.UploadingStory uploadingStory7;
        StoriesController.StoriesList storiesList;
        int i2;
        int i3;
        HintView2 hintView23;
        ImageView imageView;
        StoryItemHolder storyItemHolder2;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem10;
        int i4;
        boolean z11;
        TL_stories.StoryItem storyItem11;
        LivePlayer livePlayer2;
        StoryViewer storyViewer;
        LivePlayer livePlayer3;
        String str;
        LivePlayer livePlayer4;
        TL_stories.StoryItem storyItem12;
        BitmapDrawable bitmapDrawable;
        StoriesController.UploadingStory uploadingStory8;
        StoriesController.StoriesList storiesList2;
        if (this.storyItems.isEmpty() && this.uploadingStories.isEmpty()) {
            return;
        }
        this.forceUpdateOffsets = true;
        StoryItemHolder storyItemHolder3 = this.currentStory;
        TL_stories.StoryItem storyItem13 = storyItemHolder3.storyItem;
        StoriesController.UploadingStory uploadingStory9 = storyItemHolder3.uploadingStory;
        String storyImageFilter = StoriesUtilities.getStoryImageFilter();
        this.lastNoThumb = false;
        this.unsupported = false;
        int i5 = this.selectedPosition;
        boolean z12 = this.isUploading;
        boolean z13 = this.isEditing;
        boolean z14 = this.isFailed;
        StoryViewer storyViewer2 = this.storyViewer;
        if (storyViewer2 != null && (storiesList2 = storyViewer2.storiesList) != null && storiesList2.type == 4) {
            uploadingStory2 = (i5 < 0 || i5 >= this.uploadingStories.size()) ? null : (StoriesController.UploadingStory) this.uploadingStories.get(i5);
            int size = i5 - this.uploadingStories.size();
            if (size < 0 || size >= this.storyItems.size()) {
                uploadingStory = uploadingStory2;
                storyItem2 = null;
                this.currentStory.editingSourceItem = null;
                if (uploadingStory == null) {
                }
                z5 = z4;
                storyItem5 = this.currentStory.storyItem;
                if (storyItem5 != null) {
                }
                this.storyViewer.storiesViewPager.checkAllowScreenshots();
                this.imageChanged = true;
                if (!this.isSelf) {
                }
                updateUserViews(false);
                StoryItemHolder storyItemHolder4 = this.currentStory;
                if (getStoryId(storyItemHolder4.storyItem, storyItemHolder4.uploadingStory) == getStoryId(storyItem13, uploadingStory9)) {
                }
                if (r15) {
                }
                StoryViewer storyViewer3 = this.storyViewer;
                if (storyViewer3 != null) {
                }
                if (uploadingStory9 != null) {
                }
                chatActivityEnterView = this.chatActivityEnterView;
                if (chatActivityEnterView != null) {
                }
                if (this.currentStory.isLive) {
                }
                this.emojiAnimationsOverlay.clear();
                this.currentImageTime = 0L;
                this.switchEventSent = false;
                uploadingStory4 = this.currentStory.uploadingStory;
                if (uploadingStory4 != null) {
                }
                Bulletin.hideVisible(this.storyContainer);
                this.storyCaptionView.reset();
                cancelWaiting();
                z8 = true;
                if (!z8) {
                }
                this.headerView.setOnSubtitleClick(null);
                this.watchersCount = 0;
                setTitle(false, this.dialogId, this.currentStory.isLive);
                uploadingStory5 = this.currentStory.uploadingStory;
                if (uploadingStory5 != null) {
                }
                charSequence = charSequence2;
                if (charSequence != null) {
                }
                hintView2 = this.privacyHint;
                if (hintView2 != null) {
                }
                hintView22 = this.soundTooltip;
                if (hintView22 != null) {
                }
                StoryItemHolder storyItemHolder5 = this.currentStory;
                storyItem8 = storyItemHolder5.storyItem;
                if (storyItem13 == storyItem8) {
                }
                this.currentStory.updateCaption();
                storyItemHolder = this.currentStory;
                if (!storyItemHolder.captionTranslated) {
                }
                delegate.setTranslating(false);
                if (this.currentStory.isLive) {
                }
                if (z10 != this.areLiveCommentsDisabled) {
                }
                linearLayout = this.premiumBlockedText;
                if (linearLayout != null) {
                }
                if (this.unsupported) {
                }
                commentButton = this.commentButton;
                if (commentButton != null) {
                }
                muteButton = this.muteButton;
                if (muteButton != null) {
                }
                if (this.starsButton != null) {
                }
                if (!this.currentStory.isLive) {
                }
                if (this.isActive) {
                }
                this.storyCaptionView.setVisibility(8);
                storyItem9 = this.currentStory.storyItem;
                if (storyItem9 != null) {
                }
                this.liveCommentsView.setup(this.dialogId, null);
                this.liveCommentsView.setVisibility(8);
                this.storyContainer.invalidate();
                if (this.delegate != null) {
                }
                if (!this.isChannel) {
                }
                this.likeButtonContainer.requestLayout();
                this.storyViewer.savedPositions.append(this.dialogId, i);
                if (this.isActive) {
                }
                this.liveCommentsView.setLivePlayer(this.storyViewer.livePlayer);
                this.listPosition = 0;
                if (this.storyViewer.storiesList != null) {
                }
                int i6 = this.selectedPosition;
                this.linesPosition = i6;
                int i7 = this.count;
                this.linesCount = i7;
                if (this.storyViewer.reversed) {
                }
                if (!this.currentStory.isVideo()) {
                }
                StoryItemHolder storyItemHolder6 = this.currentStory;
                uploadingStory6 = storyItemHolder6.uploadingStory;
                if (uploadingStory6 == null) {
                }
                this.editedPrivacy = false;
                this.privacyButton.setTranslationX(this.muteIconContainer.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z8) {
                }
                uploadingStory7 = this.currentStory.uploadingStory;
                if (uploadingStory7 == null) {
                }
                if (this.failView != null) {
                }
                this.sharedResources.setIconMuted(!this.storyViewer.soundEnabled(), false);
                if (this.isActive) {
                }
                if (this.isSelf) {
                }
                SimpleTextView simpleTextView = this.headerView.titleView;
                storiesList = this.storyViewer.storiesList;
                if (storiesList != null) {
                }
                i2 = 0;
                i3 = 0;
                simpleTextView.setPadding(i2, i2, i3, i2);
                MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(this.currentStory.storyItem);
                if (!z) {
                }
                hintView23 = this.soundTooltip;
                if (hintView23 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.optionsIconView;
                if (imageView == null) {
                }
            } else {
                storyItem = (TL_stories.StoryItem) this.storyItems.get(size);
                uploadingStory = uploadingStory2;
                storyItem2 = storyItem;
                this.currentStory.editingSourceItem = null;
                if (uploadingStory == null) {
                }
                z5 = z4;
                storyItem5 = this.currentStory.storyItem;
                if (storyItem5 != null) {
                }
                this.storyViewer.storiesViewPager.checkAllowScreenshots();
                this.imageChanged = true;
                if (!this.isSelf) {
                }
                updateUserViews(false);
                StoryItemHolder storyItemHolder42 = this.currentStory;
                if (getStoryId(storyItemHolder42.storyItem, storyItemHolder42.uploadingStory) == getStoryId(storyItem13, uploadingStory9)) {
                }
                if (r15) {
                }
                StoryViewer storyViewer32 = this.storyViewer;
                if (storyViewer32 != null) {
                }
                if (uploadingStory9 != null) {
                }
                chatActivityEnterView = this.chatActivityEnterView;
                if (chatActivityEnterView != null) {
                }
                if (this.currentStory.isLive) {
                }
                this.emojiAnimationsOverlay.clear();
                this.currentImageTime = 0L;
                this.switchEventSent = false;
                uploadingStory4 = this.currentStory.uploadingStory;
                if (uploadingStory4 != null) {
                }
                Bulletin.hideVisible(this.storyContainer);
                this.storyCaptionView.reset();
                cancelWaiting();
                z8 = true;
                if (!z8) {
                }
                this.headerView.setOnSubtitleClick(null);
                this.watchersCount = 0;
                setTitle(false, this.dialogId, this.currentStory.isLive);
                uploadingStory5 = this.currentStory.uploadingStory;
                if (uploadingStory5 != null) {
                }
                charSequence = charSequence2;
                if (charSequence != null) {
                }
                hintView2 = this.privacyHint;
                if (hintView2 != null) {
                }
                hintView22 = this.soundTooltip;
                if (hintView22 != null) {
                }
                StoryItemHolder storyItemHolder52 = this.currentStory;
                storyItem8 = storyItemHolder52.storyItem;
                if (storyItem13 == storyItem8) {
                }
                this.currentStory.updateCaption();
                storyItemHolder = this.currentStory;
                if (!storyItemHolder.captionTranslated) {
                }
                delegate.setTranslating(false);
                if (this.currentStory.isLive) {
                }
                if (z10 != this.areLiveCommentsDisabled) {
                }
                linearLayout = this.premiumBlockedText;
                if (linearLayout != null) {
                }
                if (this.unsupported) {
                }
                commentButton = this.commentButton;
                if (commentButton != null) {
                }
                muteButton = this.muteButton;
                if (muteButton != null) {
                }
                if (this.starsButton != null) {
                }
                if (!this.currentStory.isLive) {
                }
                if (this.isActive) {
                }
                this.storyCaptionView.setVisibility(8);
                storyItem9 = this.currentStory.storyItem;
                if (storyItem9 != null) {
                }
                this.liveCommentsView.setup(this.dialogId, null);
                this.liveCommentsView.setVisibility(8);
                this.storyContainer.invalidate();
                if (this.delegate != null) {
                }
                if (!this.isChannel) {
                }
                this.likeButtonContainer.requestLayout();
                this.storyViewer.savedPositions.append(this.dialogId, i);
                if (this.isActive) {
                }
                this.liveCommentsView.setLivePlayer(this.storyViewer.livePlayer);
                this.listPosition = 0;
                if (this.storyViewer.storiesList != null) {
                }
                int i62 = this.selectedPosition;
                this.linesPosition = i62;
                int i72 = this.count;
                this.linesCount = i72;
                if (this.storyViewer.reversed) {
                }
                if (!this.currentStory.isVideo()) {
                }
                StoryItemHolder storyItemHolder62 = this.currentStory;
                uploadingStory6 = storyItemHolder62.uploadingStory;
                if (uploadingStory6 == null) {
                }
                this.editedPrivacy = false;
                this.privacyButton.setTranslationX(this.muteIconContainer.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z8) {
                }
                uploadingStory7 = this.currentStory.uploadingStory;
                if (uploadingStory7 == null) {
                }
                if (this.failView != null) {
                }
                this.sharedResources.setIconMuted(!this.storyViewer.soundEnabled(), false);
                if (this.isActive) {
                }
                if (this.isSelf) {
                }
                SimpleTextView simpleTextView2 = this.headerView.titleView;
                storiesList = this.storyViewer.storiesList;
                if (storiesList != null) {
                }
                i2 = 0;
                i3 = 0;
                simpleTextView2.setPadding(i2, i2, i3, i2);
                MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(this.currentStory.storyItem);
                if (!z) {
                }
                hintView23 = this.soundTooltip;
                if (hintView23 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.optionsIconView;
                if (imageView == null) {
                }
            }
        } else {
            storyItem = (i5 < 0 || i5 >= this.storyItems.size()) ? null : (TL_stories.StoryItem) this.storyItems.get(i5);
            int size2 = i5 - this.storyItems.size();
            if (size2 < 0 || size2 >= this.uploadingStories.size()) {
                storyItem2 = storyItem;
                uploadingStory = null;
                this.currentStory.editingSourceItem = null;
                if (uploadingStory == null) {
                    this.isEditing = false;
                    boolean z15 = uploadingStory.failed;
                    this.isFailed = z15;
                    this.isUploading = !z15;
                    this.imageReceiver.setCrossfadeWithOldImage(false);
                    this.imageReceiver.setCrossfadeDuration(150);
                    Bitmap bitmap = uploadingStory.entry.thumbBitmap;
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                        Utilities.blurBitmap(createBitmap, 3, 1, createBitmap.getWidth(), createBitmap.getHeight(), createBitmap.getRowBytes());
                        bitmapDrawable = new BitmapDrawable(createBitmap);
                    } else {
                        bitmapDrawable = null;
                    }
                    if (uploadingStory.isVideo || uploadingStory.hadFailed) {
                        uploadingStory8 = uploadingStory;
                        z2 = z14;
                        z3 = z12;
                        z4 = z13;
                        i = i5;
                        this.imageReceiver.setImage(null, null, ImageLocation.getForPath(uploadingStory8.firstFramePath), storyImageFilter, null, null, bitmapDrawable, 0L, null, null, 0);
                    } else {
                        uploadingStory8 = uploadingStory;
                        z2 = z14;
                        z3 = z12;
                        z4 = z13;
                        i = i5;
                        this.imageReceiver.setImage(null, null, ImageLocation.getForPath(uploadingStory.path), storyImageFilter, null, null, bitmapDrawable, 0L, null, null, 0);
                    }
                    this.currentStory.set(uploadingStory8);
                    this.storyAreasView.set(null, StoryMediaAreasView.getMediaAreasFor(uploadingStory8.entry), this.emojiAnimationsOverlay);
                    this.allowShareLink = false;
                    this.allowRepost = false;
                    this.allowShare = false;
                } else {
                    z2 = z14;
                    z3 = z12;
                    z4 = z13;
                    i = i5;
                    this.isUploading = false;
                    this.isEditing = false;
                    this.isFailed = false;
                    if (storyItem2 == null) {
                        StoryViewer storyViewer4 = this.storyViewer;
                        if (storyViewer4 != null) {
                            storyViewer4.close(true);
                            return;
                        }
                        return;
                    }
                    StoriesController.UploadingStory findEditingStory = this.storiesController.findEditingStory(this.dialogId, storyItem2);
                    if (findEditingStory != null) {
                        this.isEditing = true;
                        this.imageReceiver.setCrossfadeWithOldImage(false);
                        this.imageReceiver.setCrossfadeDuration(this.onImageReceiverThumbLoaded != null ? 0 : 150);
                        if (findEditingStory.isVideo) {
                            storyItem4 = storyItem2;
                            uploadingStory3 = findEditingStory;
                            this.imageReceiver.setImage(null, null, ImageLocation.getForPath(findEditingStory.firstFramePath), storyImageFilter, null, 0L, null, null, 0);
                        } else {
                            storyItem4 = storyItem2;
                            uploadingStory3 = findEditingStory;
                            this.imageReceiver.setImage(null, null, ImageLocation.getForPath(uploadingStory3.firstFramePath), storyImageFilter, null, 0L, null, null, 0);
                        }
                        this.currentStory.set(uploadingStory3);
                        this.storyAreasView.set(null, StoryMediaAreasView.getMediaAreasFor(uploadingStory3.entry), this.emojiAnimationsOverlay);
                        this.currentStory.editingSourceItem = storyItem4;
                        this.allowShareLink = false;
                        this.allowRepost = false;
                        this.allowShare = false;
                    } else {
                        TL_stories.StoryItem storyItem14 = storyItem2;
                        TLRPC.MessageMedia messageMedia2 = storyItem14.media;
                        boolean z16 = messageMedia2 != null && MessageObject.isVideoDocument(messageMedia2.getDocument());
                        storyItem14.dialogId = this.dialogId;
                        this.imageReceiver.setCrossfadeWithOldImage(z4);
                        this.imageReceiver.setCrossfadeDuration(150);
                        TLRPC.MessageMedia messageMedia3 = storyItem14.media;
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaUnsupported) {
                            this.unsupported = true;
                            z5 = z4;
                        } else {
                            String str2 = storyItem14.attachPath;
                            if (str2 != null) {
                                if (messageMedia3 == null) {
                                    z16 = str2.toLowerCase().endsWith(".mp4");
                                }
                                if (z16) {
                                    TLRPC.MessageMedia messageMedia4 = storyItem14.media;
                                    Drawable createStripedBitmap = messageMedia4 != null ? ImageLoader.createStripedBitmap(messageMedia4.getDocument().thumbs) : null;
                                    if (storyItem14.firstFramePath != null) {
                                        if (ImageLoader.getInstance().isInMemCache(ImageLocation.getForPath(storyItem14.firstFramePath).getKey(null, null, false) + "@" + storyImageFilter, false)) {
                                            z7 = z4;
                                            this.imageReceiver.setImage(null, null, ImageLocation.getForPath(storyItem14.firstFramePath), storyImageFilter, null, null, createStripedBitmap, 0L, null, null, 0);
                                            z5 = z7;
                                        }
                                    }
                                    z7 = z4;
                                    this.imageReceiver.setImage(null, null, ImageLocation.getForPath(storyItem14.attachPath), storyImageFilter + "_pframe", null, null, createStripedBitmap, 0L, null, null, 0);
                                    z5 = z7;
                                } else {
                                    TLRPC.MessageMedia messageMedia5 = storyItem14.media;
                                    TLRPC.Photo photo = messageMedia5 != null ? messageMedia5.photo : null;
                                    if (photo != null) {
                                        drawable = ImageLoader.createStripedBitmap(photo.sizes);
                                        z6 = z4;
                                    } else {
                                        z6 = z4;
                                        drawable = null;
                                    }
                                    if (z6) {
                                        this.imageReceiver.setImage(ImageLocation.getForPath(storyItem14.attachPath), storyImageFilter, ImageLocation.getForPath(storyItem14.firstFramePath), storyImageFilter, drawable, 0L, null, null, 0);
                                    } else {
                                        this.imageReceiver.setImage(ImageLocation.getForPath(storyItem14.attachPath), storyImageFilter, null, null, drawable, 0L, null, null, 0);
                                    }
                                    z5 = z6;
                                }
                            } else {
                                StoryViewer storyViewer5 = this.storyViewer;
                                Drawable drawable2 = ((storyViewer5.storiesList != null || storyViewer5.isSingleStory) && (transitionViewHolder = storyViewer5.transitionViewHolder) != null && (imageReceiver = transitionViewHolder.storyImage) != null && transitionViewHolder.storyId == storyItem14.id) ? imageReceiver.getDrawable() : null;
                                storyItem14.dialogId = this.dialogId;
                                if (z16) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem14.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                    Drawable createStripedBitmap2 = drawable2 == null ? ImageLoader.createStripedBitmap(storyItem14.media.getDocument().thumbs) : drawable2;
                                    z5 = z4;
                                    this.imageReceiver.setImage(null, null, ImageLocation.getForDocument(storyItem14.media.getDocument()), storyImageFilter + "_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem14.media.getDocument()), storyImageFilter, createStripedBitmap2, 0L, null, storyItem14, 0);
                                } else {
                                    z5 = z4;
                                    TLRPC.MessageMedia messageMedia6 = storyItem14.media;
                                    TLRPC.Photo photo2 = messageMedia6 != null ? messageMedia6.photo : null;
                                    if (photo2 != null && (arrayList = photo2.sizes) != null) {
                                        Drawable createStripedBitmap3 = drawable2 == null ? ImageLoader.createStripedBitmap(arrayList) : drawable2;
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
                                        FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 800);
                                        this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), storyImageFilter, null, null, createStripedBitmap3, 0L, null, storyItem14, 0);
                                    } else {
                                        this.imageReceiver.clearImage();
                                    }
                                }
                            }
                        }
                        storyItem14.dialogId = this.dialogId;
                        this.storyAreasView.set(z ? null : storyItem14, this.emojiAnimationsOverlay);
                        this.currentStory.set(storyItem14);
                        boolean z17 = (this.unsupported || (storyItem3 = this.currentStory.storyItem) == null || (storyItem3 instanceof TL_stories.TL_storyItemDeleted) || (storyItem3 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                        this.allowShareLink = z17;
                        this.allowShare = z17;
                        if (z17) {
                            this.allowShare = this.currentStory.allowScreenshots() && this.currentStory.storyItem.isPublic;
                        }
                        if (this.allowShare) {
                            TL_stories.StoryItem storyItem15 = this.currentStory.storyItem;
                            this.allowShare = storyItem15.pinned || !StoriesUtilities.isExpired(this.currentAccount, storyItem15);
                        }
                        boolean z18 = this.allowShare;
                        this.allowRepost = z18;
                        if (z18 && this.isChannel) {
                            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                            this.allowRepost = chat != null && ChatObject.isPublic(chat);
                        }
                        if (this.allowShareLink) {
                            if (this.isChannel) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                                this.allowShareLink = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                            } else {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
                                this.allowShareLink = (user == null || UserObject.getPublicUsername(user) == null || !this.currentStory.storyItem.isPublic) ? false : true;
                            }
                        }
                        NotificationsController.getInstance(this.currentAccount).processReadStories(this.dialogId, storyItem14.id);
                        storyItem5 = this.currentStory.storyItem;
                        if (storyItem5 != null && !z) {
                            this.storyViewer.dayStoryId = storyItem5.id;
                        }
                        this.storyViewer.storiesViewPager.checkAllowScreenshots();
                        this.imageChanged = true;
                        if (!this.isSelf || this.isChannel) {
                            updateUserViews(false);
                        }
                        StoryItemHolder storyItemHolder422 = this.currentStory;
                        boolean z19 = (getStoryId(storyItemHolder422.storyItem, storyItemHolder422.uploadingStory) == getStoryId(storyItem13, uploadingStory9) && (uploadingStory9 == null || (storyItem12 = this.currentStory.storyItem) == null || !TextUtils.equals(uploadingStory9.path, storyItem12.attachPath))) ? false : true;
                        boolean z20 = (z19 || (this.isEditing == z5 && this.isUploading == z3 && this.isFailed == z2)) ? false : true;
                        StoryViewer storyViewer322 = this.storyViewer;
                        z8 = (storyViewer322 != null || (livePlayer4 = storyViewer322.livePlayer) == null || this.watchersCount == livePlayer4.getWatchersCount()) ? false : true;
                        if ((uploadingStory9 != null || (str = uploadingStory9.path) == null || !str.equals(this.currentStory.getLocalPath())) && (storyItem13 == null || (storyItem6 = this.currentStory.storyItem) == null || storyItem13.id != storyItem6.id)) {
                            chatActivityEnterView = this.chatActivityEnterView;
                            if (chatActivityEnterView != null) {
                                if (storyItem13 != null && !TextUtils.isEmpty(chatActivityEnterView.getEditField().getText())) {
                                    this.storyViewer.saveDraft(storyItem13.dialogId, storyItem13, this.chatActivityEnterView.getEditField().getText());
                                }
                                this.chatActivityEnterView.getEditField().setText(this.storyViewer.getDraft(this.dialogId, this.currentStory.storyItem));
                                if (this.currentStory.isLive) {
                                    z9 = true;
                                    this.chatActivityEnterView.setAllowStickersAndGifs(true, false, false);
                                } else {
                                    z9 = true;
                                    this.chatActivityEnterView.setAllowStickersAndGifs(true, true, true);
                                }
                            } else {
                                z9 = true;
                            }
                            if (this.currentStory.isLive) {
                                loadSendAsPeers(z9);
                            }
                            this.emojiAnimationsOverlay.clear();
                            this.currentImageTime = 0L;
                            this.switchEventSent = false;
                            uploadingStory4 = this.currentStory.uploadingStory;
                            if (uploadingStory4 != null) {
                                RadialProgress radialProgress = this.headerView.radialProgress;
                                if (radialProgress != null) {
                                    radialProgress.setProgress(uploadingStory4.progress, false);
                                }
                                this.headerView.backupImageView.invalidate();
                            } else if (!z20) {
                                this.headerView.progressToUploading = 0.0f;
                            }
                            Bulletin.hideVisible(this.storyContainer);
                            this.storyCaptionView.reset();
                            cancelWaiting();
                            z8 = true;
                        }
                        if (!z8 || (uploadingStory9 != null && this.currentStory.uploadingStory == null)) {
                            this.headerView.setOnSubtitleClick(null);
                            this.watchersCount = 0;
                            setTitle(false, this.dialogId, this.currentStory.isLive);
                            uploadingStory5 = this.currentStory.uploadingStory;
                            if (uploadingStory5 != null) {
                                if (uploadingStory5.failed) {
                                    charSequence2 = LocaleController.getString(R.string.FailedToUploadStory);
                                } else {
                                    charSequence2 = StoriesUtilities.getUploadingStr(this.headerView.subtitleView[0], false, this.isEditing);
                                }
                            } else if (isBotsPreview()) {
                                TL_stories.StoryItem storyItem16 = this.currentStory.storyItem;
                                if (storyItem16 != null && (messageMedia = storyItem16.media) != null) {
                                    if (messageMedia.document != null) {
                                        charSequence2 = LocaleController.formatStoryDate(r14.date);
                                    } else {
                                        if (messageMedia.photo != null) {
                                            charSequence2 = LocaleController.formatStoryDate(r10.date);
                                        }
                                    }
                                }
                                charSequence = "";
                                if (charSequence != null) {
                                    StoryViewer storyViewer6 = this.storyViewer;
                                    CharSequence charSequence3 = charSequence;
                                    if (storyViewer6 != null) {
                                        StoriesController.StoriesList storiesList3 = storyViewer6.storiesList;
                                        charSequence3 = charSequence;
                                        if (storiesList3 != null) {
                                            TL_stories.StoryItem storyItem17 = this.currentStory.storyItem;
                                            charSequence3 = charSequence;
                                            if (storyItem17 != null) {
                                                charSequence3 = charSequence;
                                                if (storiesList3.isPinned(storyItem17.id)) {
                                                    boolean z21 = charSequence instanceof SpannableStringBuilder;
                                                    CharSequence charSequence4 = charSequence;
                                                    if (!z21) {
                                                        charSequence4 = new SpannableStringBuilder(charSequence);
                                                    }
                                                    SpannableString spannableString = new SpannableString("p ");
                                                    spannableString.setSpan(new ColoredImageSpan(R.drawable.msg_pin_mini), 0, 1, 33);
                                                    ((SpannableStringBuilder) charSequence4).insert(0, (CharSequence) spannableString);
                                                    charSequence3 = charSequence4;
                                                }
                                            }
                                        }
                                    }
                                    this.headerView.setSubtitle(charSequence3, z20);
                                }
                                hintView2 = this.privacyHint;
                                if (hintView2 != null) {
                                    hintView2.hide(false);
                                }
                                hintView22 = this.soundTooltip;
                                if (hintView22 != null) {
                                    hintView22.hide(false);
                                }
                            } else {
                                StoryItemHolder storyItemHolder7 = this.currentStory;
                                TL_stories.StoryItem storyItem18 = storyItemHolder7.storyItem;
                                if (storyItem18 == null) {
                                    charSequence = null;
                                } else if (storyItem18.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                                    spannableStringBuilder2.setSpan(new ReplacementSpan() { // from class: org.telegram.ui.Stories.PeerStoriesView.32
                                        private final RectF rect = new RectF();
                                        private final Paint bg = new Paint(1);
                                        private final Text text = new Text(LocaleController.getString(R.string.LiveStoryBadge), 9.0f, AndroidUtilities.bold());

                                        @Override // android.text.style.ReplacementSpan
                                        public int getSize(Paint paint, CharSequence charSequence5, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
                                            return (int) (this.text.getWidth() + AndroidUtilities.dp(12.0f));
                                        }

                                        @Override // android.text.style.ReplacementSpan
                                        public void draw(Canvas canvas, CharSequence charSequence5, int i8, int i9, float f, int i10, int i11, int i12, Paint paint) {
                                            float dp = ((i10 + i12) / 2.0f) + AndroidUtilities.dp(1.33f);
                                            this.rect.set(f, dp - AndroidUtilities.dp(7.0f), this.text.getWidth() + f + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f) + dp);
                                            this.bg.setColor(-572850);
                                            RectF rectF = this.rect;
                                            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.rect.height() / 2.0f, this.bg);
                                            this.text.draw(canvas, AndroidUtilities.dp(6.0f) + f, dp, -1, 1.0f);
                                        }
                                    }, 0, spannableStringBuilder2.length(), 33);
                                    spannableStringBuilder2.append((CharSequence) "  ");
                                    StoryViewer storyViewer7 = this.storyViewer;
                                    if (storyViewer7 != null && (livePlayer = storyViewer7.livePlayer) != null) {
                                        this.watchersCount = livePlayer.getWatchersCount();
                                    }
                                    spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(1, this.watchersCount)));
                                    charSequence2 = spannableStringBuilder2;
                                } else if (storyItem18.date == -1) {
                                    charSequence = LocaleController.getString(R.string.CachedStory);
                                } else {
                                    if (storyItemHolder7.getReply() != null) {
                                        final StoryCaptionView.Reply reply = this.currentStory.getReply();
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        SpannableString spannableString2 = new SpannableString("r");
                                        spannableString2.setSpan(new ColoredImageSpan(R.drawable.mini_repost_story), 0, spannableString2.length(), 33);
                                        spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                        if (reply.peerId != null) {
                                            AvatarSpan avatarSpan = new AvatarSpan(this.headerView.subtitleView[0], this.currentAccount, 15.0f);
                                            SpannableString spannableString3 = new SpannableString("a");
                                            spannableString3.setSpan(avatarSpan, 0, 1, 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString3).append((CharSequence) " ");
                                            if (reply.peerId.longValue() > 0) {
                                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(reply.peerId);
                                                avatarSpan.setUser(user2);
                                                spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user2));
                                            } else {
                                                TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-reply.peerId.longValue()));
                                                avatarSpan.setChat(chat3);
                                                if (chat3 != null) {
                                                    spannableStringBuilder3.append((CharSequence) chat3.title);
                                                }
                                            }
                                        } else {
                                            String str3 = this.currentStory.storyItem.fwd_from.from_name;
                                            if (str3 != null) {
                                                spannableStringBuilder3.append((CharSequence) str3);
                                            }
                                        }
                                        this.headerView.setOnSubtitleClick(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda15
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                PeerStoriesView.this.lambda$updatePosition$43(reply, view);
                                            }
                                        });
                                        SpannableString spannableString4 = new SpannableString(".");
                                        DotDividerSpan dotDividerSpan = new DotDividerSpan();
                                        dotDividerSpan.setTopPadding(AndroidUtilities.dp(1.5f));
                                        dotDividerSpan.setSize(5.0f);
                                        spannableString4.setSpan(dotDividerSpan, 0, spannableString4.length(), 33);
                                        spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString4).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(this.currentStory.storyItem.date));
                                        spannableStringBuilder = spannableStringBuilder3;
                                    } else if (this.isGroup && (storyItem7 = this.currentStory.storyItem) != null && storyItem7.from_id != null) {
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                        AvatarSpan avatarSpan2 = new AvatarSpan(this.headerView.subtitleView[0], this.currentAccount, 15.0f);
                                        SpannableString spannableString5 = new SpannableString("a");
                                        spannableString5.setSpan(avatarSpan2, 0, 1, 33);
                                        spannableStringBuilder4.append((CharSequence) spannableString5).append((CharSequence) " ");
                                        final long peerDialogId = DialogObject.getPeerDialogId(this.currentStory.storyItem.from_id);
                                        if (peerDialogId > 0) {
                                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                                            avatarSpan2.setUser(user3);
                                            spannableStringBuilder4.append((CharSequence) UserObject.getUserName(user3));
                                        } else {
                                            TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                            avatarSpan2.setChat(chat4);
                                            if (chat4 != null) {
                                                spannableStringBuilder4.append((CharSequence) chat4.title);
                                            }
                                        }
                                        this.headerView.setOnSubtitleClick(new View.OnClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda16
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                PeerStoriesView.this.lambda$updatePosition$44(peerDialogId, view);
                                            }
                                        });
                                        SpannableString spannableString6 = new SpannableString(".");
                                        DotDividerSpan dotDividerSpan2 = new DotDividerSpan();
                                        dotDividerSpan2.setTopPadding(AndroidUtilities.dp(1.5f));
                                        dotDividerSpan2.setSize(5.0f);
                                        spannableString6.setSpan(dotDividerSpan2, 0, spannableString6.length(), 33);
                                        spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString6).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(this.currentStory.storyItem.date));
                                        spannableStringBuilder = spannableStringBuilder4;
                                    } else {
                                        String formatStoryDate = LocaleController.formatStoryDate(this.currentStory.storyItem.date);
                                        charSequence = formatStoryDate;
                                        if (this.currentStory.storyItem.edited) {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatStoryDate);
                                            DotDividerSpan dotDividerSpan3 = new DotDividerSpan();
                                            dotDividerSpan3.setTopPadding(AndroidUtilities.dp(1.5f));
                                            dotDividerSpan3.setSize(5.0f);
                                            valueOf.append((CharSequence) " . ").setSpan(dotDividerSpan3, valueOf.length() - 2, valueOf.length() - 1, 0);
                                            valueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                            charSequence = valueOf;
                                        }
                                    }
                                    z20 = false;
                                    charSequence = spannableStringBuilder;
                                }
                                if (charSequence != null) {
                                }
                                hintView2 = this.privacyHint;
                                if (hintView2 != null) {
                                }
                                hintView22 = this.soundTooltip;
                                if (hintView22 != null) {
                                }
                            }
                            charSequence = charSequence2;
                            if (charSequence != null) {
                            }
                            hintView2 = this.privacyHint;
                            if (hintView2 != null) {
                            }
                            hintView22 = this.soundTooltip;
                            if (hintView22 != null) {
                            }
                        }
                        StoryItemHolder storyItemHolder522 = this.currentStory;
                        storyItem8 = storyItemHolder522.storyItem;
                        if (storyItem13 == storyItem8 && uploadingStory9 == storyItemHolder522.uploadingStory) {
                        }
                        this.currentStory.updateCaption();
                        storyItemHolder = this.currentStory;
                        if ((!storyItemHolder.captionTranslated || storyItem13 != storyItemHolder.storyItem) && (delegate = this.delegate) != null) {
                            delegate.setTranslating(false);
                        }
                        z10 = (this.currentStory.isLive || (storyViewer = this.storyViewer) == null || (livePlayer3 = storyViewer.livePlayer) == null || !this.currentStory.isThisCall(livePlayer3.getCallId()) || !this.storyViewer.livePlayer.commentsDisabled()) ? false : true;
                        if (z10 != this.areLiveCommentsDisabled) {
                            this.areLiveCommentsDisabled = z10;
                            if (z10) {
                                createPremiumBlockedText();
                            }
                            if (this.premiumBlockedText != null && (this.isPremiumBlocked || this.areLiveCommentsDisabled)) {
                                updatePremiumBlockedText();
                            }
                            ChatActivityEnterView chatActivityEnterView4 = this.chatActivityEnterView;
                            if (chatActivityEnterView4 != null) {
                                chatActivityEnterView4.setEnabled((!this.isPremiumBlocked || this.currentStory.isLive) && !this.areLiveCommentsDisabled);
                                this.chatActivityEnterView.updateSendAsButton();
                            }
                            checkStealthMode(true);
                        }
                        linearLayout = this.premiumBlockedText;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(((!this.isPremiumBlocked || this.currentStory.isLive) && !this.areLiveCommentsDisabled) ? 8 : 0);
                        }
                        if (this.unsupported) {
                            createUnsupportedContainer();
                            createReplyDisabledView();
                            this.unsupportedContainer.setVisibility(0);
                            this.replyDisabledTextView.setVisibility(0);
                            this.allowShareLink = false;
                            this.allowRepost = false;
                            this.allowShare = false;
                            ChatActivityEnterView chatActivityEnterView5 = this.chatActivityEnterView;
                            if (chatActivityEnterView5 != null) {
                                chatActivityEnterView5.setVisibility(8);
                            }
                            FrameLayout frameLayout = this.selfView;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            LinearLayout linearLayout2 = this.bottomActionsLinearLayout;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                        } else {
                            TLRPC.Chat chat5 = this.dialogId < 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)) : null;
                            if (this.currentStory.isLive) {
                                if (this.chatActivityEnterView == null) {
                                    createEnterView();
                                }
                                createCommentButton();
                                createPaidReactionsButton();
                                createMuteButton();
                                this.chatActivityEnterView.setVisibility(0);
                            } else if ((UserObject.isService(this.dialogId) || isBotsPreview()) && (chatActivityEnterView2 = this.chatActivityEnterView) != null) {
                                chatActivityEnterView2.setVisibility(8);
                            } else if (!this.isSelf && ((!this.isChannel || (this.isGroup && (ChatObject.canSendPlain(chat5) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat5)))) && (chatActivityEnterView3 = this.chatActivityEnterView) != null)) {
                                chatActivityEnterView3.setVisibility(0);
                            }
                            ChatActivityEnterView chatActivityEnterView6 = this.chatActivityEnterView;
                            if (chatActivityEnterView6 != null) {
                                chatActivityEnterView6.setOnSendButtonLongClick(this.currentStory.isLive ? new View.OnLongClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda17
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        boolean lambda$updatePosition$47;
                                        lambda$updatePosition$47 = PeerStoriesView.this.lambda$updatePosition$47(view);
                                        return lambda$updatePosition$47;
                                    }
                                } : null);
                                this.chatActivityEnterView.setLiveComment(this.currentStory.isLive, disabledPaidFeatures(true));
                                this.chatActivityEnterView.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
                            }
                            if (this.isPremiumBlocked && this.premiumBlockedText == null) {
                                createPremiumBlockedText();
                            }
                            if (this.premiumBlockedText != null) {
                                if (this.isPremiumBlocked || this.areLiveCommentsDisabled) {
                                    updatePremiumBlockedText();
                                }
                                this.premiumBlockedText.setVisibility(((!this.isPremiumBlocked || this.currentStory.isLive) && !this.areLiveCommentsDisabled) ? 8 : 0);
                            }
                            ChatActivityEnterView chatActivityEnterView7 = this.chatActivityEnterView;
                            if (chatActivityEnterView7 != null) {
                                chatActivityEnterView7.setEnabled((!this.isPremiumBlocked || this.currentStory.isLive) && !this.areLiveCommentsDisabled);
                            }
                            FrameLayout frameLayout2 = this.selfView;
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility((!this.isSelf || this.currentStory.isLive) ? 8 : 0);
                            }
                            FrameLayout frameLayout3 = this.unsupportedContainer;
                            if (frameLayout3 != null) {
                                frameLayout3.setVisibility(8);
                            }
                            if (UserObject.isService(this.dialogId)) {
                                createReplyDisabledView();
                                this.replyDisabledTextView.setVisibility(0);
                            } else {
                                TextView textView = this.replyDisabledTextView;
                                if (textView != null) {
                                    textView.setVisibility(8);
                                }
                            }
                            LinearLayout linearLayout3 = this.bottomActionsLinearLayout;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(isBotsPreview() ? 8 : 0);
                            }
                        }
                        commentButton = this.commentButton;
                        if (commentButton != null) {
                            commentButton.setVisibility((this.unsupported || !this.currentStory.isLive) ? 8 : 0);
                            this.commentButton.setCollapsed(this.liveCommentsView.isCollapsed(), false);
                            this.commentButton.setCount(this.liveCommentsView.getUnreadMessagesCount());
                        }
                        muteButton = this.muteButton;
                        if (muteButton != null) {
                            muteButton.setVisibility((this.unsupported || !this.currentStory.isLive || (livePlayer2 = LivePlayer.recording) == null || !this.currentStory.isThisCall(livePlayer2.getCallId())) ? 8 : 0);
                            MuteButton muteButton2 = this.muteButton;
                            LivePlayer livePlayer5 = LivePlayer.recording;
                            muteButton2.setMuted(livePlayer5 != null && livePlayer5.isMuted(), true);
                        }
                        if (this.starsButton != null) {
                            this.starsButtonEffectsView.setVisibility((this.unsupported || !this.currentStory.isLive) ? 8 : 0);
                            this.starsButton.setVisibility((this.unsupported || !this.currentStory.isLive) ? 8 : 0);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.starsButton.getLayoutParams();
                            MuteButton muteButton3 = this.muteButton;
                            int dp = AndroidUtilities.dp((muteButton3 == null || muteButton3.getVisibility() != 0) ? 7.0f : 54.0f);
                            if (layoutParams.rightMargin != dp) {
                                layoutParams.rightMargin = dp;
                                this.starsButton.setLayoutParams(layoutParams);
                            }
                        }
                        if (!this.currentStory.isLive) {
                            StoryItemHolder storyItemHolder8 = this.currentStory;
                            if ((storyItemHolder8.caption != null || storyItemHolder8.getReply() != null) && !this.unsupported) {
                                StoryCaptionView.StoryCaptionTextView storyCaptionTextView = this.storyCaptionView.captionTextview;
                                StoryItemHolder storyItemHolder9 = this.currentStory;
                                CharSequence charSequence5 = storyItemHolder9.caption;
                                StoryCaptionView.Reply reply2 = storyItemHolder9.getReply();
                                if (this.storyViewer.isTranslating) {
                                    StoryItemHolder storyItemHolder10 = this.currentStory;
                                    if (!storyItemHolder10.captionTranslated && (storyItem11 = storyItemHolder10.storyItem) != null && storyItem11.translated) {
                                        z11 = true;
                                        storyCaptionTextView.setText(charSequence5, reply2, z11, storyItem13 != this.currentStory.storyItem);
                                        this.storyCaptionView.setVisibility(0);
                                        storyItem9 = this.currentStory.storyItem;
                                        if (storyItem9 != null) {
                                            TLRPC.MessageMedia messageMedia7 = storyItem9.media;
                                            if (messageMedia7 instanceof TLRPC.TL_messageMediaVideoStream) {
                                                if (this.liveCommentsView.setup(this.dialogId, ((TLRPC.TL_messageMediaVideoStream) messageMedia7).call)) {
                                                    this.liveCommentsView.setCollapsed(false, false);
                                                    this.messageStars = 0L;
                                                    ChatActivityEnterView chatActivityEnterView8 = this.chatActivityEnterView;
                                                    if (chatActivityEnterView8 != null) {
                                                        chatActivityEnterView8.checkSendButton(true);
                                                        this.chatActivityEnterView.updateSendButtonPaid();
                                                        checkStealthMode(true);
                                                    }
                                                }
                                                this.liveCommentsView.setVisibility(0);
                                                this.storyContainer.invalidate();
                                                if (this.delegate != null && isSelectedPeer()) {
                                                    this.delegate.onPeerSelected(this.dialogId, this.selectedPosition);
                                                }
                                                if (!this.isChannel) {
                                                    this.shareButton.setVisibility((!this.allowShare || this.currentStory.isLive) ? 4 : 0);
                                                    FrameLayout frameLayout4 = this.repostButtonContainer;
                                                    if (frameLayout4 != null) {
                                                        frameLayout4.setVisibility((!this.allowRepost || this.currentStory.isLive) ? 8 : 0);
                                                    }
                                                    this.likeButtonContainer.setVisibility((this.isFailed || this.currentStory.isLive) ? 8 : 0);
                                                } else {
                                                    this.shareButton.setVisibility((!this.allowShare || this.currentStory.isLive) ? 4 : 0);
                                                    FrameLayout frameLayout5 = this.repostButtonContainer;
                                                    if (frameLayout5 != null) {
                                                        frameLayout5.setVisibility(8);
                                                    }
                                                    this.likeButtonContainer.setVisibility((this.isSelf || this.currentStory.isLive) ? 8 : 0);
                                                    this.likeButtonContainer.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                                                }
                                                this.likeButtonContainer.requestLayout();
                                                this.storyViewer.savedPositions.append(this.dialogId, i);
                                                if (this.isActive) {
                                                    requestVideoPlayer(0L);
                                                    updatePreloadImages();
                                                    this.imageReceiver.bumpPriority();
                                                }
                                                this.liveCommentsView.setLivePlayer(this.storyViewer.livePlayer);
                                                this.listPosition = 0;
                                                if (this.storyViewer.storiesList != null && (storyItem10 = this.currentStory.storyItem) != null) {
                                                    int i8 = storyItem10.id;
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i4 < this.storyViewer.storiesList.messageObjects.size()) {
                                                            MessageObject messageObject = (MessageObject) this.storyViewer.storiesList.messageObjects.get(i4);
                                                            if (messageObject != null && messageObject.getId() == i8) {
                                                                this.listPosition = i4;
                                                                break;
                                                            }
                                                            i4++;
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                }
                                                int i622 = this.selectedPosition;
                                                this.linesPosition = i622;
                                                int i722 = this.count;
                                                this.linesCount = i722;
                                                if (this.storyViewer.reversed) {
                                                    this.linesPosition = (i722 - 1) - i622;
                                                }
                                                if (!this.currentStory.isVideo()) {
                                                    this.muteIconContainer.setVisibility(0);
                                                    this.muteIconViewAlpha = this.currentStory.hasSound() ? 1.0f : 0.5f;
                                                    if (this.currentStory.hasSound()) {
                                                        this.muteIconView.setVisibility(0);
                                                        this.noSoundIconView.setVisibility(8);
                                                    } else {
                                                        this.muteIconView.setVisibility(8);
                                                        this.noSoundIconView.setVisibility(0);
                                                    }
                                                    this.muteIconContainer.setAlpha(this.muteIconViewAlpha * (1.0f - this.outT));
                                                } else {
                                                    this.muteIconContainer.setVisibility(8);
                                                }
                                                StoryItemHolder storyItemHolder622 = this.currentStory;
                                                uploadingStory6 = storyItemHolder622.uploadingStory;
                                                if (uploadingStory6 == null) {
                                                    this.privacyButton.set(this.isSelf, uploadingStory6, z19 && this.editedPrivacy);
                                                } else {
                                                    TL_stories.StoryItem storyItem19 = storyItemHolder622.storyItem;
                                                    if (storyItem19 != null) {
                                                        this.privacyButton.set(this.isSelf, storyItem19, z19 && this.editedPrivacy);
                                                    } else {
                                                        this.privacyButton.set(this.isSelf, (TL_stories.StoryItem) null, z19 && this.editedPrivacy);
                                                    }
                                                }
                                                this.editedPrivacy = false;
                                                this.privacyButton.setTranslationX(this.muteIconContainer.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                                                if (z8) {
                                                    this.drawReactionEffect = false;
                                                    TL_stories.StoryItem storyItem20 = this.currentStory.storyItem;
                                                    if (storyItem20 == null || (reaction = storyItem20.sent_reaction) == null) {
                                                        this.storiesLikeButton.setReaction(null);
                                                    } else {
                                                        this.storiesLikeButton.setReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction));
                                                    }
                                                }
                                                uploadingStory7 = this.currentStory.uploadingStory;
                                                if (uploadingStory7 == null && uploadingStory7.failed) {
                                                    createFailView();
                                                    this.failView.set(this.currentStory.uploadingStory.entry.error);
                                                    this.failView.setVisibility(0);
                                                    ViewPropertyAnimator viewPropertyAnimator = this.failViewAnimator;
                                                    if (viewPropertyAnimator != null) {
                                                        viewPropertyAnimator.cancel();
                                                        this.failViewAnimator = null;
                                                    }
                                                    if (z19) {
                                                        ViewPropertyAnimator interpolator = this.failView.animate().alpha(1.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                                                        this.failViewAnimator = interpolator;
                                                        interpolator.start();
                                                    } else {
                                                        this.failView.setAlpha(1.0f);
                                                    }
                                                } else if (this.failView != null) {
                                                    ViewPropertyAnimator viewPropertyAnimator2 = this.failViewAnimator;
                                                    if (viewPropertyAnimator2 != null) {
                                                        viewPropertyAnimator2.cancel();
                                                        this.failViewAnimator = null;
                                                    }
                                                    if (z19 && this.failView.getVisibility() == 0) {
                                                        ViewPropertyAnimator withEndAction = this.failView.animate().alpha(0.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda18
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                PeerStoriesView.this.lambda$updatePosition$48();
                                                            }
                                                        });
                                                        this.failViewAnimator = withEndAction;
                                                        withEndAction.start();
                                                    } else {
                                                        this.failView.setAlpha(0.0f);
                                                        this.failView.setVisibility(8);
                                                    }
                                                }
                                                this.sharedResources.setIconMuted(!this.storyViewer.soundEnabled(), false);
                                                if (this.isActive && this.currentStory.storyItem != null) {
                                                    FileLog.d("StoryViewer displayed story dialogId=" + this.dialogId + " storyId=" + this.currentStory.storyItem.id + " " + this.currentStory.getMediaDebugString());
                                                }
                                                if (this.isSelf) {
                                                    SelfStoryViewsPage.preload(this.currentAccount, this.dialogId, this.currentStory.storyItem);
                                                }
                                                SimpleTextView simpleTextView22 = this.headerView.titleView;
                                                storiesList = this.storyViewer.storiesList;
                                                if (storiesList != null || storiesList.getCount() == this.linesCount) {
                                                    i2 = 0;
                                                    i3 = 0;
                                                } else {
                                                    i3 = AndroidUtilities.dp(56.0f);
                                                    i2 = 0;
                                                }
                                                simpleTextView22.setPadding(i2, i2, i3, i2);
                                                MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(this.currentStory.storyItem);
                                                if (!z && !this.isSelf && this.reactionsTooltipRunnable == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                                                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda19
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            PeerStoriesView.this.lambda$updatePosition$49();
                                                        }
                                                    };
                                                    this.reactionsTooltipRunnable = runnable;
                                                    AndroidUtilities.runOnUIThread(runnable, 500L);
                                                }
                                                hintView23 = this.soundTooltip;
                                                if ((hintView23 != null || !hintView23.shown()) && this.currentStory.hasSound() && !this.storyViewer.soundEnabled()) {
                                                    if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                                        AndroidUtilities.cancelRunOnUIThread(this.showTapToSoundHint);
                                                        AndroidUtilities.runOnUIThread(this.showTapToSoundHint, 250L);
                                                    }
                                                }
                                                imageView = this.optionsIconView;
                                                if (imageView == null) {
                                                    imageView.setVisibility((!isBotsPreview() || isEditBotsPreview() || ((storyItemHolder2 = this.currentStory) != null && storyItemHolder2.isVideo)) ? 0 : 8);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        this.liveCommentsView.setup(this.dialogId, null);
                                        this.liveCommentsView.setVisibility(8);
                                        this.storyContainer.invalidate();
                                        if (this.delegate != null) {
                                            this.delegate.onPeerSelected(this.dialogId, this.selectedPosition);
                                        }
                                        if (!this.isChannel) {
                                        }
                                        this.likeButtonContainer.requestLayout();
                                        this.storyViewer.savedPositions.append(this.dialogId, i);
                                        if (this.isActive) {
                                        }
                                        this.liveCommentsView.setLivePlayer(this.storyViewer.livePlayer);
                                        this.listPosition = 0;
                                        if (this.storyViewer.storiesList != null) {
                                            int i82 = storyItem10.id;
                                            i4 = 0;
                                            while (true) {
                                                if (i4 < this.storyViewer.storiesList.messageObjects.size()) {
                                                }
                                                i4++;
                                            }
                                        }
                                        int i6222 = this.selectedPosition;
                                        this.linesPosition = i6222;
                                        int i7222 = this.count;
                                        this.linesCount = i7222;
                                        if (this.storyViewer.reversed) {
                                        }
                                        if (!this.currentStory.isVideo()) {
                                        }
                                        StoryItemHolder storyItemHolder6222 = this.currentStory;
                                        uploadingStory6 = storyItemHolder6222.uploadingStory;
                                        if (uploadingStory6 == null) {
                                        }
                                        this.editedPrivacy = false;
                                        this.privacyButton.setTranslationX(this.muteIconContainer.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                                        if (z8) {
                                        }
                                        uploadingStory7 = this.currentStory.uploadingStory;
                                        if (uploadingStory7 == null) {
                                        }
                                        if (this.failView != null) {
                                        }
                                        this.sharedResources.setIconMuted(!this.storyViewer.soundEnabled(), false);
                                        if (this.isActive) {
                                            FileLog.d("StoryViewer displayed story dialogId=" + this.dialogId + " storyId=" + this.currentStory.storyItem.id + " " + this.currentStory.getMediaDebugString());
                                        }
                                        if (this.isSelf) {
                                        }
                                        SimpleTextView simpleTextView222 = this.headerView.titleView;
                                        storiesList = this.storyViewer.storiesList;
                                        if (storiesList != null) {
                                        }
                                        i2 = 0;
                                        i3 = 0;
                                        simpleTextView222.setPadding(i2, i2, i3, i2);
                                        MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(this.currentStory.storyItem);
                                        if (!z) {
                                            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda19
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    PeerStoriesView.this.lambda$updatePosition$49();
                                                }
                                            };
                                            this.reactionsTooltipRunnable = runnable2;
                                            AndroidUtilities.runOnUIThread(runnable2, 500L);
                                        }
                                        hintView23 = this.soundTooltip;
                                        if (hintView23 != null) {
                                        }
                                        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                        }
                                        imageView = this.optionsIconView;
                                        if (imageView == null) {
                                        }
                                    }
                                }
                                z11 = false;
                                storyCaptionTextView.setText(charSequence5, reply2, z11, storyItem13 != this.currentStory.storyItem);
                                this.storyCaptionView.setVisibility(0);
                                storyItem9 = this.currentStory.storyItem;
                                if (storyItem9 != null) {
                                }
                                this.liveCommentsView.setup(this.dialogId, null);
                                this.liveCommentsView.setVisibility(8);
                                this.storyContainer.invalidate();
                                if (this.delegate != null) {
                                }
                                if (!this.isChannel) {
                                }
                                this.likeButtonContainer.requestLayout();
                                this.storyViewer.savedPositions.append(this.dialogId, i);
                                if (this.isActive) {
                                }
                                this.liveCommentsView.setLivePlayer(this.storyViewer.livePlayer);
                                this.listPosition = 0;
                                if (this.storyViewer.storiesList != null) {
                                }
                                int i62222 = this.selectedPosition;
                                this.linesPosition = i62222;
                                int i72222 = this.count;
                                this.linesCount = i72222;
                                if (this.storyViewer.reversed) {
                                }
                                if (!this.currentStory.isVideo()) {
                                }
                                StoryItemHolder storyItemHolder62222 = this.currentStory;
                                uploadingStory6 = storyItemHolder62222.uploadingStory;
                                if (uploadingStory6 == null) {
                                }
                                this.editedPrivacy = false;
                                this.privacyButton.setTranslationX(this.muteIconContainer.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                                if (z8) {
                                }
                                uploadingStory7 = this.currentStory.uploadingStory;
                                if (uploadingStory7 == null) {
                                }
                                if (this.failView != null) {
                                }
                                this.sharedResources.setIconMuted(!this.storyViewer.soundEnabled(), false);
                                if (this.isActive) {
                                }
                                if (this.isSelf) {
                                }
                                SimpleTextView simpleTextView2222 = this.headerView.titleView;
                                storiesList = this.storyViewer.storiesList;
                                if (storiesList != null) {
                                }
                                i2 = 0;
                                i3 = 0;
                                simpleTextView2222.setPadding(i2, i2, i3, i2);
                                MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(this.currentStory.storyItem);
                                if (!z) {
                                }
                                hintView23 = this.soundTooltip;
                                if (hintView23 != null) {
                                }
                                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                                }
                                imageView = this.optionsIconView;
                                if (imageView == null) {
                                }
                            }
                        }
                        if (this.isActive) {
                            this.delegate.setIsCaption(false);
                            Delegate delegate2 = this.delegate;
                            this.isCaptionPartVisible = false;
                            delegate2.setIsCaptionPartVisible(false);
                        }
                        this.storyCaptionView.setVisibility(8);
                        storyItem9 = this.currentStory.storyItem;
                        if (storyItem9 != null) {
                        }
                        this.liveCommentsView.setup(this.dialogId, null);
                        this.liveCommentsView.setVisibility(8);
                        this.storyContainer.invalidate();
                        if (this.delegate != null) {
                        }
                        if (!this.isChannel) {
                        }
                        this.likeButtonContainer.requestLayout();
                        this.storyViewer.savedPositions.append(this.dialogId, i);
                        if (this.isActive) {
                        }
                        this.liveCommentsView.setLivePlayer(this.storyViewer.livePlayer);
                        this.listPosition = 0;
                        if (this.storyViewer.storiesList != null) {
                        }
                        int i622222 = this.selectedPosition;
                        this.linesPosition = i622222;
                        int i722222 = this.count;
                        this.linesCount = i722222;
                        if (this.storyViewer.reversed) {
                        }
                        if (!this.currentStory.isVideo()) {
                        }
                        StoryItemHolder storyItemHolder622222 = this.currentStory;
                        uploadingStory6 = storyItemHolder622222.uploadingStory;
                        if (uploadingStory6 == null) {
                        }
                        this.editedPrivacy = false;
                        this.privacyButton.setTranslationX(this.muteIconContainer.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                        if (z8) {
                        }
                        uploadingStory7 = this.currentStory.uploadingStory;
                        if (uploadingStory7 == null) {
                        }
                        if (this.failView != null) {
                        }
                        this.sharedResources.setIconMuted(!this.storyViewer.soundEnabled(), false);
                        if (this.isActive) {
                        }
                        if (this.isSelf) {
                        }
                        SimpleTextView simpleTextView22222 = this.headerView.titleView;
                        storiesList = this.storyViewer.storiesList;
                        if (storiesList != null) {
                        }
                        i2 = 0;
                        i3 = 0;
                        simpleTextView22222.setPadding(i2, i2, i3, i2);
                        MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(this.currentStory.storyItem);
                        if (!z) {
                        }
                        hintView23 = this.soundTooltip;
                        if (hintView23 != null) {
                        }
                        if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                        }
                        imageView = this.optionsIconView;
                        if (imageView == null) {
                        }
                    }
                }
                z5 = z4;
                storyItem5 = this.currentStory.storyItem;
                if (storyItem5 != null) {
                    this.storyViewer.dayStoryId = storyItem5.id;
                }
                this.storyViewer.storiesViewPager.checkAllowScreenshots();
                this.imageChanged = true;
                if (!this.isSelf) {
                }
                updateUserViews(false);
                StoryItemHolder storyItemHolder4222 = this.currentStory;
                if (getStoryId(storyItemHolder4222.storyItem, storyItemHolder4222.uploadingStory) == getStoryId(storyItem13, uploadingStory9)) {
                }
                if (z19) {
                }
                StoryViewer storyViewer3222 = this.storyViewer;
                if (storyViewer3222 != null) {
                }
                if (uploadingStory9 != null) {
                }
                chatActivityEnterView = this.chatActivityEnterView;
                if (chatActivityEnterView != null) {
                }
                if (this.currentStory.isLive) {
                }
                this.emojiAnimationsOverlay.clear();
                this.currentImageTime = 0L;
                this.switchEventSent = false;
                uploadingStory4 = this.currentStory.uploadingStory;
                if (uploadingStory4 != null) {
                }
                Bulletin.hideVisible(this.storyContainer);
                this.storyCaptionView.reset();
                cancelWaiting();
                z8 = true;
                if (!z8) {
                }
                this.headerView.setOnSubtitleClick(null);
                this.watchersCount = 0;
                setTitle(false, this.dialogId, this.currentStory.isLive);
                uploadingStory5 = this.currentStory.uploadingStory;
                if (uploadingStory5 != null) {
                }
                charSequence = charSequence2;
                if (charSequence != null) {
                }
                hintView2 = this.privacyHint;
                if (hintView2 != null) {
                }
                hintView22 = this.soundTooltip;
                if (hintView22 != null) {
                }
                StoryItemHolder storyItemHolder5222 = this.currentStory;
                storyItem8 = storyItemHolder5222.storyItem;
                if (storyItem13 == storyItem8) {
                }
                this.currentStory.updateCaption();
                storyItemHolder = this.currentStory;
                if (!storyItemHolder.captionTranslated) {
                }
                delegate.setTranslating(false);
                if (this.currentStory.isLive) {
                }
                if (z10 != this.areLiveCommentsDisabled) {
                }
                linearLayout = this.premiumBlockedText;
                if (linearLayout != null) {
                }
                if (this.unsupported) {
                }
                commentButton = this.commentButton;
                if (commentButton != null) {
                }
                muteButton = this.muteButton;
                if (muteButton != null) {
                }
                if (this.starsButton != null) {
                }
                if (!this.currentStory.isLive) {
                }
                if (this.isActive) {
                }
                this.storyCaptionView.setVisibility(8);
                storyItem9 = this.currentStory.storyItem;
                if (storyItem9 != null) {
                }
                this.liveCommentsView.setup(this.dialogId, null);
                this.liveCommentsView.setVisibility(8);
                this.storyContainer.invalidate();
                if (this.delegate != null) {
                }
                if (!this.isChannel) {
                }
                this.likeButtonContainer.requestLayout();
                this.storyViewer.savedPositions.append(this.dialogId, i);
                if (this.isActive) {
                }
                this.liveCommentsView.setLivePlayer(this.storyViewer.livePlayer);
                this.listPosition = 0;
                if (this.storyViewer.storiesList != null) {
                }
                int i6222222 = this.selectedPosition;
                this.linesPosition = i6222222;
                int i7222222 = this.count;
                this.linesCount = i7222222;
                if (this.storyViewer.reversed) {
                }
                if (!this.currentStory.isVideo()) {
                }
                StoryItemHolder storyItemHolder6222222 = this.currentStory;
                uploadingStory6 = storyItemHolder6222222.uploadingStory;
                if (uploadingStory6 == null) {
                }
                this.editedPrivacy = false;
                this.privacyButton.setTranslationX(this.muteIconContainer.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z8) {
                }
                uploadingStory7 = this.currentStory.uploadingStory;
                if (uploadingStory7 == null) {
                }
                if (this.failView != null) {
                }
                this.sharedResources.setIconMuted(!this.storyViewer.soundEnabled(), false);
                if (this.isActive) {
                }
                if (this.isSelf) {
                }
                SimpleTextView simpleTextView222222 = this.headerView.titleView;
                storiesList = this.storyViewer.storiesList;
                if (storiesList != null) {
                }
                i2 = 0;
                i3 = 0;
                simpleTextView222222.setPadding(i2, i2, i3, i2);
                MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(this.currentStory.storyItem);
                if (!z) {
                }
                hintView23 = this.soundTooltip;
                if (hintView23 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.optionsIconView;
                if (imageView == null) {
                }
            } else {
                uploadingStory2 = (StoriesController.UploadingStory) this.uploadingStories.get(size2);
                uploadingStory = uploadingStory2;
                storyItem2 = storyItem;
                this.currentStory.editingSourceItem = null;
                if (uploadingStory == null) {
                }
                z5 = z4;
                storyItem5 = this.currentStory.storyItem;
                if (storyItem5 != null) {
                }
                this.storyViewer.storiesViewPager.checkAllowScreenshots();
                this.imageChanged = true;
                if (!this.isSelf) {
                }
                updateUserViews(false);
                StoryItemHolder storyItemHolder42222 = this.currentStory;
                if (getStoryId(storyItemHolder42222.storyItem, storyItemHolder42222.uploadingStory) == getStoryId(storyItem13, uploadingStory9)) {
                }
                if (z19) {
                }
                StoryViewer storyViewer32222 = this.storyViewer;
                if (storyViewer32222 != null) {
                }
                if (uploadingStory9 != null) {
                }
                chatActivityEnterView = this.chatActivityEnterView;
                if (chatActivityEnterView != null) {
                }
                if (this.currentStory.isLive) {
                }
                this.emojiAnimationsOverlay.clear();
                this.currentImageTime = 0L;
                this.switchEventSent = false;
                uploadingStory4 = this.currentStory.uploadingStory;
                if (uploadingStory4 != null) {
                }
                Bulletin.hideVisible(this.storyContainer);
                this.storyCaptionView.reset();
                cancelWaiting();
                z8 = true;
                if (!z8) {
                }
                this.headerView.setOnSubtitleClick(null);
                this.watchersCount = 0;
                setTitle(false, this.dialogId, this.currentStory.isLive);
                uploadingStory5 = this.currentStory.uploadingStory;
                if (uploadingStory5 != null) {
                }
                charSequence = charSequence2;
                if (charSequence != null) {
                }
                hintView2 = this.privacyHint;
                if (hintView2 != null) {
                }
                hintView22 = this.soundTooltip;
                if (hintView22 != null) {
                }
                StoryItemHolder storyItemHolder52222 = this.currentStory;
                storyItem8 = storyItemHolder52222.storyItem;
                if (storyItem13 == storyItem8) {
                }
                this.currentStory.updateCaption();
                storyItemHolder = this.currentStory;
                if (!storyItemHolder.captionTranslated) {
                }
                delegate.setTranslating(false);
                if (this.currentStory.isLive) {
                }
                if (z10 != this.areLiveCommentsDisabled) {
                }
                linearLayout = this.premiumBlockedText;
                if (linearLayout != null) {
                }
                if (this.unsupported) {
                }
                commentButton = this.commentButton;
                if (commentButton != null) {
                }
                muteButton = this.muteButton;
                if (muteButton != null) {
                }
                if (this.starsButton != null) {
                }
                if (!this.currentStory.isLive) {
                }
                if (this.isActive) {
                }
                this.storyCaptionView.setVisibility(8);
                storyItem9 = this.currentStory.storyItem;
                if (storyItem9 != null) {
                }
                this.liveCommentsView.setup(this.dialogId, null);
                this.liveCommentsView.setVisibility(8);
                this.storyContainer.invalidate();
                if (this.delegate != null) {
                }
                if (!this.isChannel) {
                }
                this.likeButtonContainer.requestLayout();
                this.storyViewer.savedPositions.append(this.dialogId, i);
                if (this.isActive) {
                }
                this.liveCommentsView.setLivePlayer(this.storyViewer.livePlayer);
                this.listPosition = 0;
                if (this.storyViewer.storiesList != null) {
                }
                int i62222222 = this.selectedPosition;
                this.linesPosition = i62222222;
                int i72222222 = this.count;
                this.linesCount = i72222222;
                if (this.storyViewer.reversed) {
                }
                if (!this.currentStory.isVideo()) {
                }
                StoryItemHolder storyItemHolder62222222 = this.currentStory;
                uploadingStory6 = storyItemHolder62222222.uploadingStory;
                if (uploadingStory6 == null) {
                }
                this.editedPrivacy = false;
                this.privacyButton.setTranslationX(this.muteIconContainer.getVisibility() != 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
                if (z8) {
                }
                uploadingStory7 = this.currentStory.uploadingStory;
                if (uploadingStory7 == null) {
                }
                if (this.failView != null) {
                }
                this.sharedResources.setIconMuted(!this.storyViewer.soundEnabled(), false);
                if (this.isActive) {
                }
                if (this.isSelf) {
                }
                SimpleTextView simpleTextView2222222 = this.headerView.titleView;
                storiesList = this.storyViewer.storiesList;
                if (storiesList != null) {
                }
                i2 = 0;
                i3 = 0;
                simpleTextView2222222.setPadding(i2, i2, i3, i2);
                MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(this.currentStory.storyItem);
                if (!z) {
                }
                hintView23 = this.soundTooltip;
                if (hintView23 != null) {
                }
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                }
                imageView = this.optionsIconView;
                if (imageView == null) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePosition$43(StoryCaptionView.Reply reply, View view) {
        Integer num;
        if (reply.peerId != null) {
            Bundle bundle = new Bundle();
            if (reply.peerId.longValue() >= 0) {
                bundle.putLong("user_id", reply.peerId.longValue());
            } else {
                bundle.putLong("chat_id", -reply.peerId.longValue());
            }
            if (reply.isRepostMessage && (num = reply.messageId) != null) {
                bundle.putInt("message_id", num.intValue());
                this.storyViewer.presentFragment(new ChatActivity(bundle));
                return;
            } else {
                this.storyViewer.presentFragment(new ProfileActivity(bundle));
                return;
            }
        }
        BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.StoryHidAccount)).setTag(3).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePosition$44(long j, View view) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        this.storyViewer.presentFragment(new ProfileActivity(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$updatePosition$47(View view) {
        if (disabledPaidFeatures(true)) {
            return false;
        }
        ItemOptions.makeOptions(this.storyViewer.containerView, this.resourcesProvider, view).add(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$updatePosition$45();
            }
        }).addIf(this.messageStars > 0, R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$updatePosition$46();
            }
        }).setGravity(5).forceTop(true).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePosition$46() {
        this.messageStars = 0L;
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.checkSendButton(true);
            this.chatActivityEnterView.updateSendButtonPaid();
            checkStealthMode(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePosition$48() {
        this.failView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePosition$49() {
        if (this.storyViewer.isShown()) {
            this.reactionsTooltipRunnable = null;
            if (this.reactionsLongpressTooltip == null) {
                HintView2 joint = new HintView2(getContext(), 3).setJoint(1.0f, -22.0f);
                this.reactionsLongpressTooltip = joint;
                joint.setBgColor(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(-16777216, -1, 0.13f), NotificationCenter.appConfigUpdated));
                this.reactionsLongpressTooltip.setBounce(false);
                this.reactionsLongpressTooltip.setText(LocaleController.getString(R.string.ReactionLongTapHint));
                this.reactionsLongpressTooltip.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                this.storyContainer.addView(this.reactionsLongpressTooltip, LayoutHelper.createFrame(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, this.BIG_SCREEN ? 0.0f : 56.0f));
            }
            this.reactionsLongpressTooltip.show();
            SharedConfig.setStoriesReactionsLongPressHintUsed(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEditBotsPreview() {
        TLRPC.User user;
        return isBotsPreview() && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.storyViewer.storiesList.dialogId))) != null && user.bot && user.bot_can_edit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isBotsPreview() {
        StoriesController.StoriesList storiesList;
        StoryViewer storyViewer = this.storyViewer;
        return (storyViewer == null || (storiesList = storyViewer.storiesList) == null || storiesList.type != 4) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$50() {
        showNoSoundHint(false);
        MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onHighlightLiveMessage, reason: merged with bridge method [inline-methods] */
    public void lambda$updatePosition$45() {
        TLRPC.TL_textWithEntities textWithEntities = this.chatActivityEnterView.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        TLRPC.Peer defaultSendAs = this.storyViewer.livePlayer.getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        Context context = getContext();
        int i = this.currentAccount;
        HighlightMessageSheet.open(context, i, clientUserId, DialogObject.getShortName(i, this.dialogId), textWithEntities, getMessageMinPrice(), this.messageStars, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda27
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                PeerStoriesView.this.lambda$onHighlightLiveMessage$51((Long) obj);
            }
        }, new DarkThemeResourceProvider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHighlightLiveMessage$51(Long l) {
        this.messageStars = l.longValue();
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.checkSendButton(true);
            this.chatActivityEnterView.updateSendButtonPaid();
        }
        checkStealthMode(true);
    }

    private void createReplyDisabledView() {
        if (this.replyDisabledTextView != null) {
            return;
        }
        TextView textView = new TextView(getContext()) { // from class: org.telegram.ui.Stories.PeerStoriesView.33
            @Override // android.view.View
            public void setTranslationY(float f) {
                super.setTranslationY(f);
            }
        };
        this.replyDisabledTextView = textView;
        textView.setTextSize(1, 14.0f);
        this.replyDisabledTextView.setTextColor(ColorUtils.blendARGB(-16777216, -1, 0.5f));
        this.replyDisabledTextView.setGravity(19);
        this.replyDisabledTextView.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.replyDisabledTextView, LayoutHelper.createFrame(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updatePreloadImages() {
        int i;
        ImageReceiver imageReceiver;
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        String str = max + "_" + max;
        this.uriesToPrepare.clear();
        this.documentsToPrepare.clear();
        for (int i2 = 0; i2 < this.preloadReactionHolders.size(); i2++) {
            ((ReactionImageHolder) this.preloadReactionHolders.get(i2)).onAttachedToWindow(false);
        }
        this.preloadReactionHolders.clear();
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = this.selectedPosition;
            if (i3 == 0) {
                i = i4 - 1;
                imageReceiver = this.leftPreloadImageReceiver;
                if (i < 0) {
                    imageReceiver.clearImage();
                }
                if (this.uploadingStories.isEmpty() && i >= this.storyItems.size()) {
                    setStoryImage((StoriesController.UploadingStory) this.uploadingStories.get(i - this.storyItems.size()), imageReceiver, str);
                } else if (!this.storyItems.isEmpty()) {
                    if (i < 0) {
                        i = 0;
                    }
                    if (i >= this.storyItems.size()) {
                        i = this.storyItems.size() - 1;
                    }
                    TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.storyItems.get(i);
                    storyItem.dialogId = this.dialogId;
                    setStoryImage(storyItem, imageReceiver, str);
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument())) {
                        TLRPC.Document document = storyItem.media.getDocument();
                        if (storyItem.fileReference == 0) {
                            storyItem.fileReference = FileLoader.getInstance(this.currentAccount).getFileReference(storyItem);
                        }
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append("?account=");
                            sb.append(this.currentAccount);
                            sb.append("&id=");
                            sb.append(document.id);
                            sb.append("&hash=");
                            sb.append(document.access_hash);
                            sb.append("&dc=");
                            sb.append(document.dc_id);
                            sb.append("&size=");
                            sb.append(document.size);
                            sb.append("&mime=");
                            sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                            sb.append("&rid=");
                            sb.append(storyItem.fileReference);
                            sb.append("&name=");
                            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                            sb.append("&reference=");
                            byte[] bArr = document.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb.append(Utilities.bytesToHex(bArr));
                            sb.append("&sid=");
                            sb.append(storyItem.id);
                            sb.append("&did=");
                            sb.append(storyItem.dialogId);
                            String sb2 = sb.toString();
                            this.uriesToPrepare.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document) + sb2));
                            this.documentsToPrepare.add(document);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                    if (storyItem.media_areas != null) {
                        for (int i5 = 0; i5 < storyItem.media_areas.size(); i5++) {
                            if (storyItem.media_areas.get(i5) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i5);
                                ReactionImageHolder reactionImageHolder = new ReactionImageHolder(this);
                                reactionImageHolder.setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_mediaAreaSuggestedReaction.reaction));
                                reactionImageHolder.onAttachedToWindow(this.attachedToWindow);
                                this.preloadReactionHolders.add(reactionImageHolder);
                            }
                        }
                    }
                }
            } else {
                i = i4 + 1;
                imageReceiver = this.rightPreloadImageReceiver;
                if (i >= getStoriesCount()) {
                    imageReceiver.clearImage();
                }
                if (this.uploadingStories.isEmpty()) {
                }
                if (!this.storyItems.isEmpty()) {
                }
            }
        }
        this.delegate.preparePlayer(this.documentsToPrepare, this.uriesToPrepare);
    }

    private void setStoryImage(TL_stories.StoryItem storyItem, ImageReceiver imageReceiver, String str) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        StoriesController.UploadingStory findEditingStory = this.storiesController.findEditingStory(this.dialogId, storyItem);
        if (findEditingStory != null) {
            setStoryImage(findEditingStory, imageReceiver, str);
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
        String str2 = storyItem.attachPath;
        if (str2 != null) {
            if (storyItem.media == null) {
                z = str2.toLowerCase().endsWith(".mp4");
            }
            if (z) {
                imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), str + "_pframe", ImageLocation.getForPath(storyItem.firstFramePath), str, null, null, null, 0L, null, null, 0);
                return;
            }
            imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), str, null, null, null, 0L, null, null, 0);
            return;
        }
        if (z) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
            imageReceiver.setImage(ImageLocation.getForDocument(storyItem.media.getDocument()), str + "_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument()), str, null, null, null, 0L, null, storyItem, 0);
            return;
        }
        TLRPC.MessageMedia messageMedia2 = storyItem.media;
        TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
        if (photo != null && (arrayList = photo.sizes) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID);
            FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), str, null, null, null, 0L, null, storyItem, 0);
            return;
        }
        imageReceiver.clearImage();
    }

    private void setStoryImage(StoriesController.UploadingStory uploadingStory, ImageReceiver imageReceiver, String str) {
        if (uploadingStory.isVideo) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(uploadingStory.firstFramePath), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(uploadingStory.path), str, null, null, null, 0L, null, null, 0);
        }
    }

    private void cancelWaiting() {
        Runnable runnable = this.cancellableViews;
        if (runnable != null) {
            runnable.run();
            this.cancellableViews = null;
        }
        this.showViewsProgress = false;
        if (this.isActive) {
            this.delegate.setIsWaiting(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUserViews(boolean z) {
        int i;
        StoryItemHolder storyItemHolder = this.currentStory;
        TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
        if (storyItem == null) {
            storyItem = storyItemHolder.editingSourceItem;
        }
        boolean z2 = this.isChannel;
        if (z2 || this.isSelf) {
            if (storyItem == null) {
                this.selfStatusView.setText("");
                this.selfAvatarsContainer.setVisibility(8);
                this.selfAvatarsView.setVisibility(8);
                return;
            }
            if (z2) {
                if (storyItem.views == null) {
                    storyItem.views = new TL_stories.TL_storyViews();
                }
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews.views_count <= 0) {
                    storyViews.views_count = 1;
                }
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.repostCounter;
                if (animatedTextDrawable != null && (i = storyViews.forwards_count) > 0) {
                    animatedTextDrawable.setText(Integer.toString(i), z && this.repostCounterVisible);
                    this.repostCounterVisible = true;
                } else {
                    this.repostCounterVisible = false;
                }
                int i2 = storyItem.views.reactions_count;
                if (i2 > 0) {
                    this.reactionsCounter.setText(Integer.toString(i2), z && this.reactionsCounterVisible);
                    this.reactionsCounterVisible = true;
                } else {
                    this.reactionsCounterVisible = false;
                }
                if (!z) {
                    this.reactionsCounterProgress.set(this.reactionsCounterVisible ? 1.0f : 0.0f, true);
                    AnimatedFloat animatedFloat = this.repostCounterProgress;
                    if (animatedFloat != null) {
                        animatedFloat.set(this.repostCounterVisible ? 1.0f : 0.0f, true);
                    }
                }
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                if ((!this.isGroup || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                    this.selfStatusView.setText(LocaleController.getString(this.storyViewer.storiesList == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "d  ");
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_views), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                    this.selfStatusView.setText(spannableStringBuilder);
                } else {
                    this.selfStatusView.setText("");
                }
                this.likeButtonContainer.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.reactionsCounterVisible ? this.reactionsCounter.getAnimateToWidth() + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.selfView.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + this.likeButtonContainer.getLayoutParams().width;
                FrameLayout frameLayout = this.repostButtonContainer;
                if (frameLayout != null) {
                    frameLayout.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.repostCounterVisible ? this.repostCounter.getAnimateToWidth() + AndroidUtilities.dp(4.0f) : 0.0f));
                    ((ViewGroup.MarginLayoutParams) this.selfView.getLayoutParams()).rightMargin += this.repostButtonContainer.getLayoutParams().width;
                    this.repostButtonContainer.requestLayout();
                }
                this.selfView.requestLayout();
                this.likeButtonContainer.requestLayout();
                this.selfAvatarsView.setVisibility(8);
                this.selfAvatarsContainer.setVisibility(8);
                this.storyAreasView.onStoryItemUpdated(this.currentStory.storyItem, z);
                return;
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2 != null && storyViews2.views_count > 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < storyItem.views.recent_viewers.size(); i4++) {
                    TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(storyItem.views.recent_viewers.get(i4).longValue());
                    if (userOrChat != null) {
                        this.selfAvatarsView.setObject(i3, this.currentAccount, userOrChat);
                        i3++;
                    }
                    if (i3 >= 3) {
                        break;
                    }
                }
                for (int i5 = i3; i5 < 3; i5++) {
                    this.selfAvatarsView.setObject(i5, this.currentAccount, null);
                }
                this.selfAvatarsView.commitTransition(false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                if (storyItem.views.reactions_count > 0) {
                    spannableStringBuilder2.append((CharSequence) "  d ");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_views_likes);
                    coloredImageSpan.setOverrideColor(-53704);
                    coloredImageSpan.setTopOffset(AndroidUtilities.dp(0.2f));
                    spannableStringBuilder2.setSpan(coloredImageSpan, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                    spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                }
                if (storyItem.views.forwards_count > 0) {
                    spannableStringBuilder2.append((CharSequence) "  d ");
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_repost_story);
                    coloredImageSpan2.setOverrideColor(-14161823);
                    coloredImageSpan2.setTopOffset(AndroidUtilities.dp(0.2f));
                    spannableStringBuilder2.setSpan(coloredImageSpan2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                    spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                }
                this.selfStatusView.setText(spannableStringBuilder2);
                if (i3 == 0) {
                    this.selfAvatarsView.setVisibility(8);
                    this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                } else {
                    this.selfAvatarsView.setVisibility(0);
                    this.selfStatusView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(24.0f) + (AndroidUtilities.dp(20.0f) * (i3 - 1)) + AndroidUtilities.dp(10.0f));
                }
                this.selfAvatarsContainer.setVisibility(0);
            } else {
                this.selfStatusView.setText(LocaleController.getString(this.storyViewer.storiesList == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                this.selfAvatarsView.setVisibility(8);
                this.selfAvatarsContainer.setVisibility(8);
            }
            this.likeButtonContainer.getLayoutParams().width = AndroidUtilities.dp(40.0f);
            this.bottomActionsLinearLayout.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void requestVideoPlayer(long j) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        if (this.isActive) {
            if (this.currentStory.isLive()) {
                Delegate delegate = this.delegate;
                long j2 = this.dialogId;
                TL_stories.StoryItem storyItem = this.currentStory.storyItem;
                int i = storyItem.id;
                TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem.media;
                delegate.requestPlayer(j2, i, tL_messageMediaVideoStream.rtmp_stream, tL_messageMediaVideoStream.call, this.playerSharedScope);
                this.storyContainer.invalidate();
                return;
            }
            if (this.currentStory.isVideo()) {
                if (this.currentStory.getLocalPath() != null && new File(this.currentStory.getLocalPath()).exists()) {
                    Uri fromFile = Uri.fromFile(new File(this.currentStory.getLocalPath()));
                    FileLog.d("StoryViewer requestVideoPlayer(" + j + "): playing from attachPath " + fromFile);
                    this.videoDuration = 0L;
                    uri = fromFile;
                    document = null;
                } else {
                    TL_stories.StoryItem storyItem2 = this.currentStory.storyItem;
                    if (storyItem2 != null) {
                        storyItem2.dialogId = this.dialogId;
                        try {
                            document2 = storyItem2.media.getDocument();
                            try {
                                TL_stories.StoryItem storyItem3 = this.currentStory.storyItem;
                                if (storyItem3.fileReference == 0) {
                                    storyItem3.fileReference = FileLoader.getInstance(this.currentAccount).getFileReference(this.currentStory.storyItem);
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("?account=");
                                sb.append(this.currentAccount);
                                sb.append("&id=");
                                sb.append(document2.id);
                                sb.append("&hash=");
                                sb.append(document2.access_hash);
                                sb.append("&dc=");
                                sb.append(document2.dc_id);
                                sb.append("&size=");
                                sb.append(document2.size);
                                sb.append("&mime=");
                                sb.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                                sb.append("&rid=");
                                sb.append(this.currentStory.storyItem.fileReference);
                                sb.append("&name=");
                                sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                                sb.append("&reference=");
                                byte[] bArr = document2.file_reference;
                                if (bArr == null) {
                                    bArr = new byte[0];
                                }
                                sb.append(Utilities.bytesToHex(bArr));
                                sb.append("&sid=");
                                sb.append(this.currentStory.storyItem.id);
                                sb.append("&did=");
                                sb.append(this.currentStory.storyItem.dialogId);
                                Uri parse = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb.toString());
                                FileLog.d("StoryViewer requestVideoPlayer(" + j + "): playing from " + parse);
                                this.videoDuration = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                                uri = parse;
                                document = document2;
                            } catch (Exception unused) {
                                document = document2;
                                uri = null;
                                if (uri == null) {
                                }
                                this.delegate.requestPlayer(document, uri, j, this.playerSharedScope);
                                this.storyContainer.invalidate();
                                return;
                            }
                        } catch (Exception unused2) {
                            document2 = null;
                        }
                    } else {
                        document = null;
                        uri = null;
                    }
                }
                if (uri == null) {
                    FileLog.d("PeerStoriesView.requestVideoPlayer(" + j + "): playing from null?");
                }
                this.delegate.requestPlayer(document, uri, j, this.playerSharedScope);
                this.storyContainer.invalidate();
                return;
            }
            FileLog.d("PeerStoriesView.requestVideoPlayer(" + j + "): null, not a video");
            this.delegate.requestPlayer(null, null, 0L, this.playerSharedScope);
            VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
            videoPlayerSharedScope.renderView = null;
            videoPlayerSharedScope.firstFrameRendered = false;
            return;
        }
        this.playerSharedScope.renderView = null;
    }

    public boolean switchToNext(boolean z) {
        if (this.storyViewer.reversed) {
            z = !z;
        }
        if (z) {
            if (this.selectedPosition >= getStoriesCount() - 1) {
                return false;
            }
            this.selectedPosition++;
            updatePosition();
            return true;
        }
        int i = this.selectedPosition;
        if (i <= 0) {
            return false;
        }
        this.selectedPosition = i - 1;
        updatePosition();
        return true;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void drawPlayingBitmap(int i, int i2, Canvas canvas) {
        TextureView textureView;
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        View view = videoPlayerSharedScope.renderView;
        if (view != null && videoPlayerSharedScope.surfaceView != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(this.playerSharedScope.surfaceView, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (view != null && (textureView = videoPlayerSharedScope.textureView) != null) {
            Bitmap bitmap = textureView.getBitmap(i, i2);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        canvas.scale(i / this.storyContainer.getMeasuredWidth(), i2 / this.storyContainer.getMeasuredHeight());
        this.imageReceiver.draw(canvas);
        canvas.restore();
    }

    public Bitmap getPlayingBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(this.storyContainer.getWidth(), this.storyContainer.getHeight(), Bitmap.Config.ARGB_8888);
        drawPlayingBitmap(createBitmap.getWidth(), createBitmap.getHeight(), new Canvas(createBitmap));
        return createBitmap;
    }

    public void createBlurredBitmap(Canvas canvas, Bitmap bitmap) {
        drawPlayingBitmap(bitmap.getWidth(), bitmap.getHeight(), canvas);
        if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
            canvas.drawColor(ColorUtils.setAlphaComponent(-1, 102));
        }
        Utilities.blurBitmap(bitmap, 3, 1, bitmap.getWidth(), bitmap.getHeight(), bitmap.getRowBytes());
        Utilities.blurBitmap(bitmap, 3, 1, bitmap.getWidth(), bitmap.getHeight(), bitmap.getRowBytes());
    }

    public void stopPlaying(boolean z) {
        if (z) {
            this.imageReceiver.stopAnimation();
            this.imageReceiver.setAllowStartAnimation(false);
        } else {
            this.imageReceiver.startAnimation();
            this.imageReceiver.setAllowStartAnimation(true);
        }
    }

    public long getCurrentPeer() {
        return this.dialogId;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.day;
    }

    public void setPaused(boolean z) {
        if (this.paused != z) {
            this.paused = z;
            stopPlaying(z);
            this.lastDrawTime = 0L;
            this.storyContainer.invalidate();
        }
    }

    public int getSelectedPosition() {
        return this.selectedPosition;
    }

    public boolean closeKeyboardOrEmoji() {
        if (this.likesReactionShowing) {
            if (this.likesReactionLayout.getReactionsWindow() != null) {
                if (this.realKeyboardHeight > 0) {
                    AndroidUtilities.hideKeyboard(this.likesReactionLayout.getReactionsWindow().windowView);
                } else {
                    this.likesReactionLayout.getReactionsWindow().dismiss();
                }
                return true;
            }
            showLikesReaction(false);
            return true;
        }
        StoryMediaAreasView storyMediaAreasView = this.storyAreasView;
        if (storyMediaAreasView != null) {
            storyMediaAreasView.closeHint();
        }
        if (this.storyCaptionView.textSelectionHelper.isInSelectionMode()) {
            this.storyCaptionView.textSelectionHelper.clear(false);
            return true;
        }
        HintView2 hintView2 = this.privacyHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        HintView2 hintView22 = this.soundTooltip;
        if (hintView22 != null) {
            hintView22.hide();
        }
        HintView hintView = this.mediaBanTooltip;
        if (hintView != null) {
            hintView.hide(true);
        }
        CaptionContainerView captionContainerView = this.storyEditCaptionView;
        if (captionContainerView != null && captionContainerView.onBackPressed()) {
            return true;
        }
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null && customPopupMenu.isShowing()) {
            this.popupMenu.dismiss();
            return true;
        }
        if (checkRecordLocked(false)) {
            return true;
        }
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null && reactionsContainerLayout.getReactionsWindow() != null && this.reactionsContainerLayout.getReactionsWindow().isShowing()) {
            this.reactionsContainerLayout.getReactionsWindow().dismiss();
            return true;
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null && chatActivityEnterView.isPopupShowing()) {
            if (this.realKeyboardHeight > 0) {
                AndroidUtilities.hideKeyboard(this.chatActivityEnterView.getEmojiView());
            } else {
                this.chatActivityEnterView.hidePopup(true, false);
            }
            return true;
        }
        if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            ChatActivityEnterView chatActivityEnterView2 = this.chatActivityEnterView;
            if (chatActivityEnterView2 != null) {
                this.storyViewer.saveDraft(this.dialogId, this.currentStory.storyItem, chatActivityEnterView2.getEditText());
            }
            AndroidUtilities.hideKeyboard(this.chatActivityEnterView);
            return true;
        }
        if (this.storyCaptionView.getVisibility() != 0 || this.storyCaptionView.getProgressToBlackout() <= 0.0f) {
            return false;
        }
        this.storyCaptionView.collapse();
        this.inBlackoutMode = false;
        this.storyContainer.invalidate();
        return true;
    }

    public boolean findClickableView(ViewGroup viewGroup, float f, float f2, boolean z) {
        ChatActivityEnterView chatActivityEnterView;
        VideoPlayerSharedScope videoPlayerSharedScope;
        if (viewGroup == null) {
            return false;
        }
        HintView2 hintView2 = this.privacyHint;
        if (hintView2 != null && hintView2.shown()) {
            return true;
        }
        HintView2 hintView22 = this.soundTooltip;
        if (hintView22 != null && hintView22.shown()) {
            return true;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt == this.storyCaptionView) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    childAt.getHitRect(rect);
                    if (rect.contains((int) f, (int) f2) && this.storyCaptionView.allowInterceptTouchEvent(f, f2 - childAt.getTop())) {
                        return true;
                    }
                }
                Rect rect2 = AndroidUtilities.rectTmp2;
                childAt.getHitRect(rect2);
                if (childAt == this.storyContainer && (videoPlayerSharedScope = this.playerSharedScope) != null) {
                    View view = videoPlayerSharedScope.renderView;
                    if ((view instanceof ViewGroup) && findClickableView((ViewGroup) view, f - childAt.getX(), f2 - childAt.getY(), z)) {
                        return true;
                    }
                }
                if (childAt.isClickable() && rect2.contains((int) f, (int) f2)) {
                    return true;
                }
                StoryMediaAreasView storyMediaAreasView = this.storyAreasView;
                if (childAt == storyMediaAreasView && !storyMediaAreasView.hasSelected() && (f < AndroidUtilities.dp(60.0f) || f > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                    if (this.storyAreasView.hasClickableViews(f, f2)) {
                        return true;
                    }
                } else {
                    LiveCommentsView liveCommentsView = this.liveCommentsView;
                    if (childAt == liveCommentsView) {
                        if (liveCommentsView.topListView.findChildViewUnder(f, (f2 - liveCommentsView.getY()) - this.liveCommentsView.topListView.getY()) == null) {
                            if (this.liveCommentsView.isCollapsed()) {
                                continue;
                            } else if (!this.keyboardVisible && f2 <= this.liveCommentsView.getY() + this.liveCommentsView.top()) {
                                LiveCommentsView liveCommentsView2 = this.liveCommentsView;
                                if (liveCommentsView2.listView.findChildViewUnder(f, (f2 - liveCommentsView2.getY()) - this.liveCommentsView.listView.getY()) != null) {
                                }
                            }
                        }
                        return true;
                    }
                    if (this.keyboardVisible && childAt == this.chatActivityEnterView && f2 > rect2.top) {
                        return true;
                    }
                    if (!z && rect2.contains((int) f, (int) f2) && (((childAt.isClickable() || childAt == this.reactionsContainerLayout) && childAt.isEnabled()) || ((chatActivityEnterView = this.chatActivityEnterView) != null && childAt == chatActivityEnterView.getRecordCircle()))) {
                        return true;
                    }
                    if (childAt.isEnabled() && (childAt instanceof ViewGroup) && findClickableView((ViewGroup) childAt, f - childAt.getX(), f2 - childAt.getY(), z)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void setAccount(int i) {
        this.currentAccount = i;
        this.storiesController = MessagesController.getInstance(i).storiesController;
        this.emojiAnimationsOverlay.setAccount(i);
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            reactionsContainerLayout.setCurrentAccount(i);
            this.reactionsContainerLayout.setMessage(null, null, true);
        }
        ReactionsContainerLayout reactionsContainerLayout2 = this.likesReactionLayout;
        if (reactionsContainerLayout2 != null) {
            reactionsContainerLayout2.setCurrentAccount(i);
        }
    }

    public void setActive(boolean z) {
        setActive(0L, z);
    }

    public void setActive(long j, boolean z) {
        if (this.isActive != z) {
            activeCount += z ? 1 : -1;
            this.isActive = z;
            if (z) {
                if (useSurfaceInViewPagerWorkAround()) {
                    this.delegate.setIsSwiping(true);
                    AndroidUtilities.cancelRunOnUIThread(this.allowDrawSurfaceRunnable);
                    AndroidUtilities.runOnUIThread(this.allowDrawSurfaceRunnable, 100L);
                }
                requestVideoPlayer(j);
                updatePreloadImages();
                this.muteIconView.setAnimation(this.sharedResources.muteDrawable);
                this.isActive = true;
                this.headerView.backupImageView.getImageReceiver().setVisible(true, true);
                if (this.currentStory.storyItem != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.dialogId + " storyId=" + this.currentStory.storyItem.id + " " + this.currentStory.getMediaDebugString());
                }
            } else {
                cancelTextSelection();
                this.muteIconView.clearAnimationDrawable();
                this.viewsThumbImageReceiver = null;
                this.isLongPressed = false;
                this.progressToHideInterface.set(0.0f, true);
                this.storyContainer.invalidate();
                invalidate();
                cancelWaiting();
                this.delegate.setIsRecording(false);
            }
            this.imageReceiver.setFileLoadingPriority(this.isActive ? 3 : 2);
            this.leftPreloadImageReceiver.setFileLoadingPriority(this.isActive ? 2 : 0);
            this.rightPreloadImageReceiver.setFileLoadingPriority(this.isActive ? 2 : 0);
            if (this.isSelf || this.isChannel) {
                this.storiesController.pollViewsForSelfStories(this.dialogId, this.isActive);
            }
        }
    }

    public void progressToDismissUpdated() {
        if (this.BIG_SCREEN) {
            invalidate();
        }
    }

    public void reset() {
        this.headerView.backupImageView.getImageReceiver().setVisible(true, true);
        if (this.changeBoundAnimator != null) {
            this.chatActivityEnterView.reset();
            this.chatActivityEnterView.setAlpha(1.0f - this.outT);
        }
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            reactionsContainerLayout.reset();
        }
        ReactionsContainerLayout reactionsContainerLayout2 = this.likesReactionLayout;
        if (reactionsContainerLayout2 != null) {
            reactionsContainerLayout2.reset();
        }
        InstantCameraView instantCameraView = this.instantCameraView;
        if (instantCameraView != null) {
            AndroidUtilities.removeFromParent(instantCameraView);
            this.instantCameraView.hideCamera(true);
            this.instantCameraView = null;
        }
        setActive(false);
        setIsVisible(false);
        this.isLongPressed = false;
        this.progressToHideInterface.set(0.0f, false);
        this.viewsThumbImageReceiver = null;
        this.messageSent = false;
        cancelTextSelection();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0 || i == 2) {
                createChatAttachView();
                ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.getPhotoLayout().onActivityResultFragment(i, intent, null);
                    return;
                }
                return;
            }
            if (i == 21) {
                if (intent == null) {
                    showAttachmentError();
                    return;
                }
                if (intent.getData() != null) {
                    sendUriAsDocument(intent.getData());
                } else if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        sendUriAsDocument(clipData.getItemAt(i3).getUri());
                    }
                } else {
                    showAttachmentError();
                }
                ChatAttachAlert chatAttachAlert2 = this.chatAttachAlert;
                if (chatAttachAlert2 != null) {
                    chatAttachAlert2.dismiss();
                }
                afterMessageSend(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void sendUriAsDocument(Uri uri) {
        TL_stories.StoryItem storyItem;
        String str;
        int indexOf;
        Uri parse;
        String str2;
        if (uri == null || (storyItem = this.currentStory.storyItem) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String uri2 = uri.toString();
        boolean z = false;
        if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                str = uri2.split("/1/")[1];
                indexOf = str.indexOf("/ACTUAL");
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (indexOf != -1) {
                parse = Uri.parse(URLDecoder.decode(str.substring(0, indexOf), "UTF-8"));
                String path = AndroidUtilities.getPath(parse);
                if (BuildVars.NO_SCOPED_STORAGE) {
                    str2 = path;
                    z = true;
                } else if (path == null) {
                    String uri3 = parse.toString();
                    String copyFileToCache = MediaController.copyFileToCache(parse, "file");
                    if (copyFileToCache == null) {
                        showAttachmentError();
                        return;
                    } else {
                        str2 = uri3;
                        path = copyFileToCache;
                    }
                } else {
                    str2 = path;
                }
                if (!z) {
                    SendMessagesHelper.prepareSendingDocument(getAccountInstance(), null, null, parse, null, null, this.dialogId, null, null, storyItem, null, null, true, 0, null, null, 0, false);
                    return;
                } else {
                    SendMessagesHelper.prepareSendingDocument(getAccountInstance(), path, str2, null, null, null, this.dialogId, null, null, storyItem, null, null, true, 0, null, null, 0, false);
                    return;
                }
            }
        }
        parse = uri;
        String path2 = AndroidUtilities.getPath(parse);
        if (BuildVars.NO_SCOPED_STORAGE) {
        }
        if (!z) {
        }
    }

    private void showAttachmentError() {
        BulletinFactory.of(this.storyContainer, this.resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.UnsupportedAttachment), this.resourcesProvider).show();
    }

    public void setLongpressed(boolean z) {
        if (this.isActive) {
            this.isLongPressed = z;
            invalidate();
        }
    }

    public boolean showKeyboard() {
        TextView textView;
        EditTextCaption editField;
        if (this.chatActivityEnterView == null || (((textView = this.replyDisabledTextView) != null && textView.getVisibility() == 0) || (editField = this.chatActivityEnterView.getEditField()) == null)) {
            return false;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        return true;
    }

    public void checkPinchToZoom(MotionEvent motionEvent) {
        this.pinchToZoomHelper.checkPinchToZoom(motionEvent, this.storyContainer, null, null, null, null);
    }

    public void setIsVisible(boolean z) {
        if (this.isVisible == z) {
            return;
        }
        this.isVisible = z;
        if (z) {
            this.imageReceiver.setCurrentAlpha(1.0f);
            checkStealthMode(false);
        }
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.storyItems;
    }

    public void selectPosition(int i) {
        if (this.selectedPosition != i) {
            this.selectedPosition = i;
            updatePosition();
        }
    }

    public void cancelTouch() {
        this.storyCaptionView.cancelTouch();
    }

    public void onActionDown(MotionEvent motionEvent) {
        HintView2 hintView2 = this.privacyHint;
        if (hintView2 != null && hintView2.shown() && this.privacyButton != null && !this.privacyHint.containsTouch(motionEvent, getX() + this.storyContainer.getX() + this.privacyHint.getX(), getY() + this.storyContainer.getY() + this.privacyHint.getY()) && !hitButton(this.privacyButton, motionEvent)) {
            this.privacyHint.hide();
        }
        HintView2 hintView22 = this.soundTooltip;
        if (hintView22 == null || !hintView22.shown() || this.muteIconContainer == null || this.soundTooltip.containsTouch(motionEvent, getX() + this.storyContainer.getX() + this.soundTooltip.getX(), getY() + this.storyContainer.getY() + this.soundTooltip.getY()) || hitButton(this.muteIconContainer, motionEvent)) {
            return;
        }
        this.soundTooltip.hide();
    }

    private boolean hitButton(View view, MotionEvent motionEvent) {
        float x = getX() + this.storyContainer.getX() + view.getX();
        float y = getY() + this.storyContainer.getY() + view.getY();
        return motionEvent.getX() >= x && motionEvent.getX() <= x + ((float) view.getWidth()) && motionEvent.getY() >= y && motionEvent.getY() <= y + ((float) view.getHeight());
    }

    public void setOffset(float f) {
        boolean z = f == 0.0f;
        if (this.allowDrawSurface != z) {
            this.allowDrawSurface = z;
            this.storyContainer.invalidate();
            if (this.isActive && useSurfaceInViewPagerWorkAround()) {
                if (z) {
                    AndroidUtilities.cancelRunOnUIThread(this.allowDrawSurfaceRunnable);
                    AndroidUtilities.runOnUIThread(this.allowDrawSurfaceRunnable, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(this.allowDrawSurfaceRunnable);
                    this.delegate.setIsSwiping(true);
                }
            }
        }
    }

    public boolean useSurfaceInViewPagerWorkAround() {
        return this.storyViewer.USE_SURFACE_VIEW && Build.VERSION.SDK_INT < 33;
    }

    public void showNoSoundHint(boolean z) {
        if (this.soundTooltip == null) {
            HintView2 joint = new HintView2(getContext(), 1).setJoint(1.0f, -56.0f);
            this.soundTooltip = joint;
            joint.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.storyContainer.addView(this.soundTooltip, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.soundTooltip.setText(LocaleController.getString(z ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.soundTooltip.show();
    }

    public boolean checkTextSelectionEvent(MotionEvent motionEvent) {
        if (!this.storyCaptionView.textSelectionHelper.isInSelectionMode()) {
            return false;
        }
        float x = getX();
        float y = getY() + ((View) getParent()).getY();
        motionEvent.offsetLocation(-x, -y);
        if (this.storyCaptionView.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(motionEvent)) {
            return true;
        }
        motionEvent.offsetLocation(x, y);
        return false;
    }

    public void cancelTextSelection() {
        if (this.storyCaptionView.textSelectionHelper.isInSelectionMode()) {
            this.storyCaptionView.textSelectionHelper.clear();
        }
    }

    public boolean checkReactionEvent(MotionEvent motionEvent) {
        ReactionsContainerLayout reactionsContainerLayout = this.likesReactionLayout;
        if (reactionsContainerLayout == null) {
            return false;
        }
        float x = getX();
        float y = getY() + ((View) getParent()).getY();
        if (this.likesReactionLayout.getReactionsWindow() != null && this.likesReactionLayout.getReactionsWindow().windowView != null) {
            motionEvent.offsetLocation(-x, (-y) - this.likesReactionLayout.getReactionsWindow().windowView.getTranslationY());
            this.likesReactionLayout.getReactionsWindow().windowView.dispatchTouchEvent(motionEvent);
            return true;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        reactionsContainerLayout.getHitRect(rect);
        rect.offset((int) x, (int) y);
        if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            showLikesReaction(false);
            return true;
        }
        motionEvent.offsetLocation(-rect.left, -rect.top);
        reactionsContainerLayout.dispatchTouchEvent(motionEvent);
        return true;
    }

    public boolean viewsAllowed() {
        if (this.currentStory.isLive) {
            return false;
        }
        return this.isSelf || (this.isChannel && this.userCanSeeViews);
    }

    public static class PeerHeaderView extends FrameLayout {
        public BackupImageView backupImageView;
        private float progressToUploading;
        RadialProgress radialProgress;
        Paint radialProgressPaint;
        StoryItemHolder storyItemHolder;
        private ValueAnimator subtitleAnimator;
        private TextView[] subtitleView;
        public SimpleTextView titleView;
        private boolean uploadedTooFast;
        private boolean uploading;

        public PeerHeaderView(Context context, StoryItemHolder storyItemHolder) {
            super(context);
            this.subtitleView = new TextView[2];
            this.storyItemHolder = storyItemHolder;
            BackupImageView backupImageView = new BackupImageView(context) { // from class: org.telegram.ui.Stories.PeerStoriesView.PeerHeaderView.1
                @Override // org.telegram.ui.Components.BackupImageView, android.view.View
                protected void onDraw(Canvas canvas) {
                    if (this.imageReceiver.getVisible()) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        PeerHeaderView.this.drawUploadingProgress(canvas, rectF, true, 1.0f);
                    }
                    super.onDraw(canvas);
                }
            };
            this.backupImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
            addView(this.backupImageView, LayoutHelper.createFrame(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
            setClipChildren(false);
            SimpleTextView simpleTextView = new SimpleTextView(context) { // from class: org.telegram.ui.Stories.PeerStoriesView.PeerHeaderView.2
                @Override // org.telegram.ui.ActionBar.SimpleTextView, android.view.View
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    setPivotY(getMeasuredHeight() / 2.0f);
                }
            };
            this.titleView = simpleTextView;
            simpleTextView.setTextSize(14);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setMaxLines(1);
            this.titleView.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
            this.titleView.setPivotX(0.0f);
            NotificationCenter.listenEmojiLoading(this.titleView);
            addView(this.titleView, LayoutHelper.createFrame(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
            for (int i = 0; i < 2; i++) {
                this.subtitleView[i] = new TextView(context);
                this.subtitleView[i].setTextSize(1, 12.0f);
                this.subtitleView[i].setMaxLines(1);
                this.subtitleView[i].setSingleLine(true);
                this.subtitleView[i].setEllipsize(TextUtils.TruncateAt.MIDDLE);
                this.subtitleView[i].setTextColor(-1);
                this.subtitleView[i].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
                addView(this.subtitleView[i], LayoutHelper.createFrame(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
            }
            this.titleView.setTextColor(-1);
        }

        public void setSubtitle(CharSequence charSequence) {
            setSubtitle(charSequence, false);
        }

        public void setOnSubtitleClick(View.OnClickListener onClickListener) {
            this.subtitleView[0].setOnClickListener(onClickListener);
            this.subtitleView[0].setClickable(onClickListener != null);
            this.subtitleView[0].setBackground(onClickListener == null ? null : Theme.createSelectorDrawable(822083583, 7));
        }

        public void setSubtitle(CharSequence charSequence, boolean z) {
            ValueAnimator valueAnimator = this.subtitleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.subtitleAnimator = null;
            }
            if (z) {
                this.subtitleView[1].setOnClickListener(null);
                TextView[] textViewArr = this.subtitleView;
                textViewArr[1].setText(textViewArr[0].getText());
                this.subtitleView[1].setVisibility(0);
                this.subtitleView[1].setAlpha(1.0f);
                this.subtitleView[1].setTranslationY(0.0f);
                this.subtitleView[0].setText(charSequence);
                this.subtitleView[0].setVisibility(0);
                this.subtitleView[0].setAlpha(0.0f);
                this.subtitleView[0].setTranslationY(-AndroidUtilities.dp(4.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.subtitleAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$PeerHeaderView$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        PeerStoriesView.PeerHeaderView.this.lambda$setSubtitle$0(valueAnimator2);
                    }
                });
                this.subtitleAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.PeerHeaderView.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        PeerHeaderView.this.subtitleView[1].setVisibility(8);
                        PeerHeaderView.this.subtitleView[0].setAlpha(1.0f);
                        PeerHeaderView.this.subtitleView[0].setTranslationY(0.0f);
                    }
                });
                this.subtitleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.subtitleAnimator.setDuration(340L);
                this.subtitleAnimator.start();
                return;
            }
            this.subtitleView[0].setVisibility(0);
            this.subtitleView[0].setAlpha(1.0f);
            this.subtitleView[0].setText(charSequence);
            this.subtitleView[1].setVisibility(8);
            this.subtitleView[1].setAlpha(0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setSubtitle$0(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.subtitleView[0].setAlpha(floatValue);
            float f = 1.0f - floatValue;
            this.subtitleView[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f);
            this.subtitleView[1].setAlpha(f);
            this.subtitleView[1].setTranslationY(floatValue * AndroidUtilities.dp(4.0f));
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (isEnabled()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }

        public void drawUploadingProgress(Canvas canvas, RectF rectF, boolean z, float f) {
            float f2;
            boolean z2;
            StoriesController.UploadingStory uploadingStory;
            StoryItemHolder storyItemHolder = this.storyItemHolder;
            if ((storyItemHolder == null || storyItemHolder.uploadingStory == null) && this.progressToUploading == 0.0f) {
                return;
            }
            if (storyItemHolder != null && (uploadingStory = storyItemHolder.uploadingStory) != null && !uploadingStory.failed) {
                this.progressToUploading = 1.0f;
                f2 = uploadingStory.progress;
                if (!this.uploading) {
                    this.uploading = true;
                }
                z2 = false;
            } else {
                if (this.uploading) {
                    this.uploading = false;
                    this.uploadedTooFast = this.radialProgress.getAnimatedProgress() < 0.2f;
                }
                if (!this.uploadedTooFast) {
                    this.progressToUploading = Utilities.clamp(this.progressToUploading - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f2 = 1.0f;
                z2 = true;
            }
            if (this.radialProgress == null) {
                RadialProgress radialProgress = new RadialProgress(this.backupImageView);
                this.radialProgress = radialProgress;
                radialProgress.setBackground(null, true, false);
            }
            this.radialProgress.setDiff(0);
            ImageReceiver imageReceiver = this.backupImageView.getImageReceiver();
            float dp = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(6.0f) * (1.0f - this.progressToUploading));
            this.radialProgress.setProgressRect((int) (rectF.left - dp), (int) (rectF.top - dp), (int) (rectF.right + dp), (int) (rectF.bottom + dp));
            this.radialProgress.setProgress(z2 ? 1.0f : Utilities.clamp(f2, 1.0f, 0.0f), true);
            if (this.uploadedTooFast && z2 && this.radialProgress.getAnimatedProgress() >= 0.9f) {
                this.progressToUploading = Utilities.clamp(this.progressToUploading - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z) {
                if (f != 1.0f) {
                    Paint unreadCirclePaint = StoriesUtilities.getUnreadCirclePaint(imageReceiver, false);
                    unreadCirclePaint.setAlpha((int) (this.progressToUploading * 255.0f));
                    this.radialProgress.setPaint(unreadCirclePaint);
                    this.radialProgress.draw(canvas);
                }
                if (this.radialProgressPaint == null) {
                    Paint paint = new Paint(1);
                    this.radialProgressPaint = paint;
                    paint.setColor(-1);
                    this.radialProgressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.radialProgressPaint.setStyle(Paint.Style.STROKE);
                    this.radialProgressPaint.setStrokeCap(Paint.Cap.ROUND);
                }
                this.radialProgressPaint.setAlpha((int) (255.0f * f * this.progressToUploading));
                this.radialProgress.setPaint(this.radialProgressPaint);
                this.radialProgress.draw(canvas);
            }
        }
    }

    public int getStoriesCount() {
        return this.uploadingStories.size() + Math.max(this.totalStoriesCount, this.storyItems.size());
    }

    public class StoryItemHolder {
        public CharSequence caption;
        public boolean captionTranslated;
        public TL_stories.StoryItem editingSourceItem;
        private boolean isLive;
        private boolean isVideo;
        private StoryCaptionView.Reply reply;
        boolean skipped;
        public TL_stories.StoryItem storyItem = null;
        public StoriesController.UploadingStory uploadingStory = null;

        public StoryItemHolder() {
        }

        boolean isLive() {
            return this.isLive;
        }

        boolean isThisCall(long j) {
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.id) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getMediaDebugString() {
            TLRPC.MessageMedia messageMedia;
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null) {
                if (messageMedia.photo != null) {
                    return "photo#" + this.storyItem.media.photo.id + "at" + this.storyItem.media.photo.dc_id + "dc";
                }
                if (messageMedia.document != null) {
                    return "doc#" + this.storyItem.media.document.id + "at" + this.storyItem.media.document.dc_id + "dc";
                }
                return "unknown";
            }
            if (this.uploadingStory != null) {
                return "uploading from " + this.uploadingStory.path;
            }
            return "unknown";
        }

        public StoryCaptionView.Reply getReply() {
            if (this.reply == null) {
                if (this.storyItem != null) {
                    this.reply = StoryCaptionView.Reply.from(PeerStoriesView.this.currentAccount, this.storyItem);
                } else {
                    StoriesController.UploadingStory uploadingStory = this.uploadingStory;
                    if (uploadingStory != null) {
                        this.reply = StoryCaptionView.Reply.from(uploadingStory);
                    }
                }
            }
            return this.reply;
        }

        public void updateCaption() {
            int i;
            this.captionTranslated = false;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            StoryItemHolder storyItemHolder = peerStoriesView.currentStory;
            StoriesController.UploadingStory uploadingStory = storyItemHolder.uploadingStory;
            if (uploadingStory != null) {
                CharSequence charSequence = uploadingStory.entry.caption;
                this.caption = charSequence;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, peerStoriesView.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                this.caption = replaceEmoji;
                SpannableStringBuilder spannableStringBuilder = replaceEmoji == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(replaceEmoji);
                TLRPC.User user = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId));
                if (PeerStoriesView.this.dialogId < 0 || MessagesController.getInstance(PeerStoriesView.this.currentAccount).storyEntitiesAllowed(user)) {
                    MessageObject.addLinks(true, spannableStringBuilder);
                    return;
                }
                return;
            }
            TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
            if (storyItem != null) {
                if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, TranslateAlert2.getToLanguage())) {
                    this.captionTranslated = true;
                    PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                    TLRPC.TL_textWithEntities tL_textWithEntities = peerStoriesView2.currentStory.storyItem.translatedText;
                    String str = tL_textWithEntities.text;
                    this.caption = str;
                    CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, peerStoriesView2.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                    this.caption = replaceEmoji2;
                    if (replaceEmoji2 == null || tL_textWithEntities.entities == null) {
                        return;
                    }
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, PeerStoriesView.this.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf, PeerStoriesView.this.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                    i = (PeerStoriesView.this.dialogId < 0 || MessagesController.getInstance(PeerStoriesView.this.currentAccount).storyEntitiesAllowed(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId)))) ? 1 : 0;
                    if (i != 0) {
                        MessageObject.addLinks(true, valueOf);
                    }
                    MessageObject.addEntitiesToText(valueOf, tL_textWithEntities.entities, false, true, true, false, i ^ 1);
                    this.caption = valueOf;
                    return;
                }
                PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
                String str2 = peerStoriesView3.currentStory.storyItem.caption;
                this.caption = str2;
                CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, peerStoriesView3.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                this.caption = replaceEmoji3;
                if (replaceEmoji3 == null || PeerStoriesView.this.currentStory.storyItem.entities == null) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(PeerStoriesView.this.currentStory.storyItem.caption);
                PeerStoriesView peerStoriesView4 = PeerStoriesView.this;
                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(spannableStringBuilder2, peerStoriesView4.currentStory.storyItem.entities, peerStoriesView4.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, PeerStoriesView.this.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                i = (PeerStoriesView.this.dialogId < 0 || MessagesController.getInstance(PeerStoriesView.this.currentAccount).storyEntitiesAllowed(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId)))) ? 1 : 0;
                if (i != 0) {
                    MessageObject.addLinks(true, valueOf2);
                }
                MessageObject.addEntitiesToText(valueOf2, PeerStoriesView.this.currentStory.storyItem.entities, false, true, true, false, i ^ 1);
                this.caption = valueOf2;
            }
        }

        void set(TL_stories.StoryItem storyItem) {
            this.storyItem = storyItem;
            this.reply = null;
            this.uploadingStory = null;
            this.skipped = storyItem instanceof TL_stories.TL_storyItemSkipped;
            this.isVideo = isVideoInternal();
            this.isLive = isLiveInternal();
        }

        private boolean isLiveInternal() {
            TLRPC.MessageMedia messageMedia;
            TL_stories.StoryItem storyItem = this.storyItem;
            return (storyItem == null || (messageMedia = storyItem.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
        }

        private boolean isVideoInternal() {
            String str;
            TLRPC.MessageMedia messageMedia;
            StoriesController.UploadingStory uploadingStory = this.uploadingStory;
            if (uploadingStory != null) {
                return uploadingStory.isVideo;
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
                TLRPC.Document document = this.storyItem.media.getDocument();
                return MessageObject.isVideoDocument(document) || "video/mp4".equals(document.mime_type);
            }
            TL_stories.StoryItem storyItem2 = this.storyItem;
            if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
                return false;
            }
            return str.toLowerCase().endsWith(".mp4");
        }

        void set(StoriesController.UploadingStory uploadingStory) {
            this.uploadingStory = uploadingStory;
            this.reply = null;
            this.storyItem = null;
            this.skipped = false;
            this.isVideo = isVideoInternal();
            this.isLive = isLiveInternal();
        }

        public void clear() {
            this.uploadingStory = null;
            this.storyItem = null;
        }

        void cancelOrDelete() {
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem instanceof StoriesController.BotPreview) {
                ((StoriesController.BotPreview) storyItem).list.delete(storyItem.media);
                return;
            }
            if (storyItem != null) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.storiesController.deleteStory(peerStoriesView.dialogId, this.storyItem);
            } else {
                StoriesController.UploadingStory uploadingStory = this.uploadingStory;
                if (uploadingStory != null) {
                    uploadingStory.cancel();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        
            if (r0 <= r1.storiesController.dialogIdToMaxReadId.get(r1.dialogId, 0)) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
        
            if (r6.this$0.isSelf != false) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void checkSendView() {
            TL_stories.StoryItem storyItem;
            TLRPC.UserFull userFull;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            TL_stories.PeerStories peerStories = peerStoriesView.userStories;
            if (peerStories == null && (peerStories = peerStoriesView.storiesController.getStories(peerStoriesView.dialogId)) == null && (userFull = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUserFull(PeerStoriesView.this.dialogId)) != null) {
                peerStories = userFull.stories;
            }
            if (PeerStoriesView.this.isActive && (storyItem = this.storyItem) != null && peerStories != null) {
                if (!StoriesUtilities.hasExpiredViews(storyItem)) {
                    int i = this.storyItem.id;
                    if (i <= peerStories.max_read_id) {
                        PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                    }
                    if (PeerStoriesView.this.storyViewer.overrideUserStories != null) {
                        PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
                        if (peerStoriesView3.storiesController.markStoryAsRead(peerStoriesView3.storyViewer.overrideUserStories, this.storyItem, true)) {
                            PeerStoriesView.this.storyViewer.unreadStateChanged = true;
                            return;
                        }
                        return;
                    }
                    PeerStoriesView peerStoriesView4 = PeerStoriesView.this;
                    if (peerStoriesView4.storiesController.markStoryAsRead(peerStoriesView4.dialogId, this.storyItem)) {
                        PeerStoriesView.this.storyViewer.unreadStateChanged = true;
                        return;
                    }
                    return;
                }
            }
            PeerStoriesView peerStoriesView5 = PeerStoriesView.this;
            if (!peerStoriesView5.isActive || this.storyItem == null || peerStoriesView5.storyViewer.storiesList == null || !PeerStoriesView.this.storyViewer.storiesList.markAsRead(this.storyItem.id)) {
                return;
            }
            PeerStoriesView.this.storyViewer.unreadStateChanged = true;
        }

        public String getLocalPath() {
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null) {
                return storyItem.attachPath;
            }
            return null;
        }

        boolean isVideo() {
            return this.isVideo;
        }

        boolean hasSound() {
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            if (!this.isVideo) {
                return false;
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
                for (int i = 0; i < document.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                        return false;
                    }
                }
                return true;
            }
            if (this.uploadingStory != null) {
                return !r0.entry.muted;
            }
            return true;
        }

        public String createLink() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.currentStory.storyItem == null) {
                return null;
            }
            if (peerStoriesView.dialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId));
                if (UserObject.getPublicUsername(user) == null) {
                    return null;
                }
                return PeerStoriesView.this.currentStory.isLive ? String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(PeerStoriesView.this.currentStory.storyItem.id));
            }
            TLRPC.Chat chat = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId));
            if (ChatObject.getPublicUsername(chat) == null) {
                return null;
            }
            return PeerStoriesView.this.currentStory.isLive ? String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(PeerStoriesView.this.currentStory.storyItem.id));
        }

        public File getPath() {
            TLRPC.Photo photo;
            if (getLocalPath() != null) {
                return new File(getLocalPath());
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem == null) {
                return null;
            }
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(PeerStoriesView.this.currentAccount).getPathToAttach(this.storyItem.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.storyItem.media;
            if (messageMedia2 == null || (photo = messageMedia2.photo) == null) {
                return null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
            File pathToAttach = FileLoader.getInstance(PeerStoriesView.this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            return !pathToAttach.exists() ? FileLoader.getInstance(PeerStoriesView.this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, false) : pathToAttach;
        }

        public boolean allowScreenshots() {
            StoriesController.UploadingStory uploadingStory = this.uploadingStory;
            if (uploadingStory != null) {
                return uploadingStory.entry.allowScreenshots;
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem == null) {
                return true;
            }
            if (storyItem.noforwards) {
                return false;
            }
            if (!storyItem.pinned) {
                return true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-storyItem.dialogId));
            return chat == null || !chat.noforwards;
        }
    }

    public static int getStoryId(TL_stories.StoryItem storyItem, StoriesController.UploadingStory uploadingStory) {
        StoryEntry storyEntry;
        if (storyItem != null) {
            return storyItem.id;
        }
        if (uploadingStory == null || (storyEntry = uploadingStory.entry) == null) {
            return 0;
        }
        return storyEntry.editStoryId;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size;
        ReactionsContainerLayout reactionsContainerLayout;
        MentionsContainerView mentionsContainerView;
        if (this.storyViewer.ATTACH_TO_FRAGMENT) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        if (this.isActive && this.shareAlert == null) {
            this.realKeyboardHeight = this.delegate.getKeyboardHeight();
        } else {
            this.realKeyboardHeight = 0;
        }
        if (this.storyViewer.ATTACH_TO_FRAGMENT) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = View.MeasureSpec.getSize(i2) + this.realKeyboardHeight;
        }
        int size2 = (int) ((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.realKeyboardHeight < AndroidUtilities.dp(20.0f)) {
            this.realKeyboardHeight = 0;
        }
        int i3 = this.realKeyboardHeight;
        ReactionsContainerLayout reactionsContainerLayout2 = this.likesReactionLayout;
        if (reactionsContainerLayout2 != null && reactionsContainerLayout2.getReactionsWindow() != null && this.likesReactionLayout.getReactionsWindow().isShowing()) {
            this.likesReactionLayout.getReactionsWindow().windowView.animate().translationY(-this.realKeyboardHeight).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
            i3 = 0;
        } else {
            ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
            if (chatActivityEnterView != null && (chatActivityEnterView.isPopupShowing() || this.chatActivityEnterView.isWaitingForKeyboard())) {
                if (this.chatActivityEnterView.getEmojiView().getMeasuredHeight() == 0) {
                    i3 = this.chatActivityEnterView.getEmojiPadding();
                } else if (this.chatActivityEnterView.isStickersExpanded()) {
                    this.chatActivityEnterView.checkStickresExpandHeight();
                    i3 = this.chatActivityEnterView.getStickersExpandedHeight();
                } else {
                    i3 = this.chatActivityEnterView.getVisibleEmojiPadding();
                }
            }
        }
        boolean z = this.keyboardVisible;
        if (this.lastKeyboardHeight != i3) {
            this.keyboardVisible = false;
            if (i3 > 0 && this.isActive) {
                this.keyboardVisible = true;
                this.messageSent = false;
                this.lastOpenedKeyboardHeight = i3;
                checkReactionsLayout();
                ReactionsEffectOverlay.dismissAll();
            } else {
                ChatActivityEnterView chatActivityEnterView2 = this.chatActivityEnterView;
                if (chatActivityEnterView2 != null) {
                    this.storyViewer.saveDraft(this.dialogId, this.currentStory.storyItem, chatActivityEnterView2.getEditText());
                }
            }
            ChatActivityEnterView chatActivityEnterView3 = this.chatActivityEnterView;
            if (chatActivityEnterView3 != null) {
                chatActivityEnterView3.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && this.keyboardVisible, true);
            }
            if (this.keyboardVisible && (mentionsContainerView = this.mentionContainer) != null) {
                mentionsContainerView.setVisibility(0);
            }
            if (!this.keyboardVisible && (reactionsContainerLayout = this.reactionsContainerLayout) != null) {
                reactionsContainerLayout.reset();
            }
            this.headerView.setEnabled(!this.keyboardVisible);
            ChatActivityEnterView chatActivityEnterView4 = this.chatActivityEnterView;
            if (chatActivityEnterView4 != null) {
                chatActivityEnterView4.checkReactionsButton(!this.keyboardVisible);
            }
            if (this.isActive && this.keyboardVisible) {
                this.delegate.setKeyboardVisible(true);
            }
            this.lastKeyboardHeight = i3;
            ValueAnimator valueAnimator = this.keyboardAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.notificationsLocker.lock();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.animatingKeyboardHeight, i3);
            this.keyboardAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda24
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PeerStoriesView.this.lambda$onMeasure$52(valueAnimator2);
                }
            });
            this.keyboardAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.35
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    PeerStoriesView.this.notificationsLocker.unlock();
                    PeerStoriesView.this.animatingKeyboardHeight = r2.lastKeyboardHeight;
                    ChatActivityEnterView chatActivityEnterView5 = PeerStoriesView.this.chatActivityEnterView;
                    if (chatActivityEnterView5 != null) {
                        chatActivityEnterView5.onOverrideAnimationEnd();
                    }
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    if (peerStoriesView.isActive && !peerStoriesView.keyboardVisible) {
                        peerStoriesView.delegate.setKeyboardVisible(false);
                    }
                    PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                    if (!peerStoriesView2.keyboardVisible && peerStoriesView2.mentionContainer != null) {
                        PeerStoriesView.this.mentionContainer.setVisibility(8);
                    }
                    PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
                    peerStoriesView3.forceUpdateOffsets = true;
                    peerStoriesView3.invalidate();
                }
            });
            if (this.keyboardVisible) {
                this.keyboardAnimator.setDuration(250L);
                this.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                this.storyViewer.cancelSwipeToReply();
            } else {
                this.keyboardAnimator.setDuration(500L);
                this.keyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            this.keyboardAnimator.start();
            boolean z2 = this.keyboardVisible;
            if (z2 != z) {
                if (z2) {
                    createBlurredBitmap(this.bitmapShaderTools.getCanvas(), this.bitmapShaderTools.getBitmap());
                    if (this.currentStory.isLive) {
                        showPaidMessageHint();
                    }
                } else {
                    ChatActivityEnterView chatActivityEnterView5 = this.chatActivityEnterView;
                    if (chatActivityEnterView5 != null) {
                        chatActivityEnterView5.getEditField().clearFocus();
                    }
                    HintView2 hintView2 = this.highlightMessageHintView;
                    if (hintView2 != null) {
                        hintView2.hide();
                    }
                }
                this.animateKeyboardOpening = true;
            } else {
                this.animateKeyboardOpening = false;
            }
        }
        ChatActivityEnterView chatActivityEnterView6 = this.chatActivityEnterView;
        if (chatActivityEnterView6 != null && chatActivityEnterView6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.chatActivityEnterView.getEmojiView().getLayoutParams()).gravity = 80;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.storyContainer.getLayoutParams();
        layoutParams.height = size2;
        boolean z3 = size - size2 > AndroidUtilities.dp(64.0f);
        this.BIG_SCREEN = z3;
        int dp = (size - ((z3 ? AndroidUtilities.dp(64.0f) : 0) + size2)) >> 1;
        layoutParams.topMargin = dp;
        if (this.BIG_SCREEN) {
            this.enterViewBottomOffset = (((-dp) + size) - size2) - AndroidUtilities.dp(64.0f);
        } else {
            this.enterViewBottomOffset = ((-dp) + size) - size2;
        }
        if (this.BIG_SCREEN != this.wasBigScreen) {
            this.storyContainer.setLayoutParams(layoutParams);
        }
        FrameLayout frameLayout = this.selfView;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.BIG_SCREEN) {
                layoutParams2.topMargin = dp + size2 + AndroidUtilities.dp(8.0f);
            } else {
                layoutParams2.topMargin = (dp + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        TextView textView = this.replyDisabledTextView;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (!this.BIG_SCREEN) {
                this.replyDisabledTextView.setTextColor(ColorUtils.setAlphaComponent(-1, NotificationCenter.didUpdatePremiumGiftStickers));
                layoutParams3.topMargin = ((dp + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
            } else {
                this.replyDisabledTextView.setTextColor(ColorUtils.blendARGB(-16777216, -1, 0.5f));
                layoutParams3.topMargin = dp + size2 + AndroidUtilities.dp(12.0f);
            }
        }
        InstantCameraView instantCameraView = this.instantCameraView;
        if (instantCameraView != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) instantCameraView.getLayoutParams();
            if (i3 == 0) {
                layoutParams4.bottomMargin = size - ((dp + size2) - AndroidUtilities.dp(64.0f));
            } else {
                layoutParams4.bottomMargin = i3 + AndroidUtilities.dp(64.0f);
            }
        }
        if (!this.BIG_SCREEN) {
            ((FrameLayout.LayoutParams) this.bottomActionsLinearLayout.getLayoutParams()).topMargin = ((dp + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
            int dp2 = this.isSelf ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
            ((FrameLayout.LayoutParams) this.storyCaptionView.getLayoutParams()).bottomMargin = dp2;
            if (this.wasBigScreen != this.BIG_SCREEN) {
                StoryCaptionView storyCaptionView = this.storyCaptionView;
                storyCaptionView.setLayoutParams((FrameLayout.LayoutParams) storyCaptionView.getLayoutParams());
            }
            this.storyCaptionView.blackoutBottomOffset = dp2;
        } else {
            ((FrameLayout.LayoutParams) this.bottomActionsLinearLayout.getLayoutParams()).topMargin = dp + size2 + AndroidUtilities.dp(12.0f);
            ((FrameLayout.LayoutParams) this.storyCaptionView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            if (this.wasBigScreen != this.BIG_SCREEN) {
                StoryCaptionView storyCaptionView2 = this.storyCaptionView;
                storyCaptionView2.setLayoutParams((FrameLayout.LayoutParams) storyCaptionView2.getLayoutParams());
            }
            this.storyCaptionView.blackoutBottomOffset = AndroidUtilities.dp(8.0f);
        }
        this.forceUpdateOffsets = true;
        float dp3 = AndroidUtilities.dp(48.0f);
        if (this.privacyButton.getVisibility() == 0) {
            dp3 += AndroidUtilities.dp(60.0f);
        }
        if (this.muteIconContainer.getVisibility() == 0) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.headerView.titleView.getLayoutParams();
        if (layoutParams5.rightMargin != dp3) {
            int i4 = (int) dp3;
            layoutParams5.rightMargin = i4;
            ((FrameLayout.LayoutParams) this.headerView.subtitleView[0].getLayoutParams()).rightMargin = i4;
            ((FrameLayout.LayoutParams) this.headerView.subtitleView[1].getLayoutParams()).rightMargin = i4;
            this.headerView.forceLayout();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.wasBigScreen = this.BIG_SCREEN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMeasure$52(ValueAnimator valueAnimator) {
        this.animatingKeyboardHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.progressToKeyboard = -1.0f;
        this.forceUpdateOffsets = true;
        invalidate();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateViewOffsets() {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.updateViewOffsets():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getHideInterfaceAlpha() {
        return (1.0f - this.progressToHideInterface.get()) * (1.0f - this.storyViewer.getProgressToSelfViews());
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        float dp;
        if (view == this.mentionContainer) {
            canvas.save();
            canvas.clipRect(0.0f, this.mentionContainer.getY(), getMeasuredWidth(), this.mentionContainer.getY() + this.mentionContainer.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (view == chatActivityEnterView) {
            if (this.progressToKeyboard > 0.0f && !this.currentStory.isLive) {
                this.sharedResources.dimPaint.setAlpha((int) (this.progressToKeyboard * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.sharedResources.dimPaint);
            }
            this.sharedResources.rect1.set(this.chatActivityEnterView.getX(), this.chatActivityEnterView.getY() + this.chatActivityEnterView.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.chatActivityEnterView.getX() + this.chatActivityEnterView.getMeasuredWidth(), this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!this.currentStory.isLive) {
                if (this.allowShare) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.allowRepost && this.isChannel) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                FrameLayout frameLayout = this.likeButtonContainer;
                if (frameLayout != null && frameLayout.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + this.likeButtonContainer.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                MuteButton muteButton = this.muteButton;
                if (muteButton != null && muteButton.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            this.sharedResources.rect2.set(AndroidUtilities.dp(10.0f) + dp, ((this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.chatActivityEnterView.setTranslationX(dp * (1.0f - this.progressToKeyboard));
            this.chatActivityEnterView.getEditField().setTranslationY((this.chatActivityEnterView.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? 0.0f + ((1.0f - this.progressToKeyboard) * (this.chatActivityEnterView.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) : 0.0f) + ((-AndroidUtilities.dp(2.0f)) * (1.0f - this.progressToKeyboard)));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(this.sharedResources.rect2, this.sharedResources.rect1, this.progressToKeyboard, this.sharedResources.finalRect);
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.inputFieldBackground;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.setBounds((int) this.sharedResources.finalRect.left, (int) this.sharedResources.finalRect.top, (int) this.sharedResources.finalRect.right, (int) this.sharedResources.finalRect.bottom);
                this.inputFieldBackground.setRadius(dp3);
                this.inputFieldBackground.setAlpha((int) ((1.0f - this.progressToDismiss) * 255.0f * getHideInterfaceAlpha() * (1.0f - this.outT)));
                this.inputFieldBackground.draw(canvas);
            } else {
                canvas.drawRoundRect(this.sharedResources.finalRect, dp3, dp3, this.inputBackgroundPaint);
            }
            if (this.progressToKeyboard < 0.5f) {
                canvas.save();
                canvas.clipRect(this.sharedResources.finalRect);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
        } else {
            if (chatActivityEnterView != null && chatActivityEnterView.isPopupView(view)) {
                float dp4 = AndroidUtilities.dp(30.0f);
                this.sharedResources.popupRect.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), getHeight() + AndroidUtilities.dp(20.0f));
                this.clipPath.rewind();
                this.clipPath.addRoundRect(this.sharedResources.popupRect, dp4, dp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.clipPath);
                BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.emojiKeyboardBackground;
                if (blurredBackgroundDrawable2 != null) {
                    blurredBackgroundDrawable2.setBounds((int) this.sharedResources.popupRect.left, (int) this.sharedResources.popupRect.top, (int) this.sharedResources.popupRect.right, (int) this.sharedResources.popupRect.bottom);
                    this.emojiKeyboardBackground.setRadius(dp4, dp4, dp4, dp4);
                    this.emojiKeyboardBackground.setAlpha(NotificationCenter.didReplacedPhotoInMemCache);
                    this.emojiKeyboardBackground.draw(canvas);
                } else {
                    canvas.drawRoundRect(this.sharedResources.popupRect, dp4, dp4, this.inputBackgroundPaint);
                }
                boolean drawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild3;
            }
            if (view == this.reactionsContainerLayout && this.chatActivityEnterView != null) {
                view.setTranslationY(((-r0.getMeasuredHeight()) + (this.chatActivityEnterView.getY() + this.chatActivityEnterView.getAnimatedTop())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.likesReactionLayout) {
                    view.setTranslationY((((-(r0.getMeasuredHeight() - this.likesReactionLayout.getPaddingBottom())) + this.likeButtonContainer.getY()) + this.bottomActionsLinearLayout.getY()) - AndroidUtilities.dp(18.0f));
                } else if (view == this.storyContainer && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (blurredBackgroundSourceRenderNode = this.blurredBackgroundSourceRenderNodeWithSaturation) != null && !blurredBackgroundSourceRenderNode.inRecording()) {
                    RecordingCanvas beginRecording = this.blurredBackgroundSourceRenderNodeWithSaturation.beginRecording(getMeasuredWidth(), getMeasuredHeight());
                    beginRecording.drawColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
                    beginRecording.translate(this.storyContainer.getX(), this.storyContainer.getY());
                    view.draw(beginRecording);
                    this.blurredBackgroundSourceRenderNodeWithSaturation.endRecording();
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkInstantCameraView() {
        if (this.instantCameraView == null && CameraView.isCameraAllowed()) {
            this.instantCameraView = new InstantCameraView(getContext(), new InstantCameraView.Delegate() { // from class: org.telegram.ui.Stories.PeerStoriesView.36
                @Override // org.telegram.ui.Components.InstantCameraView.Delegate
                public /* synthetic */ boolean isInScheduleMode() {
                    return InstantCameraView.Delegate.-CC.$default$isInScheduleMode(this);
                }

                @Override // org.telegram.ui.Components.InstantCameraView.Delegate
                public /* synthetic */ boolean isSecretChat() {
                    return InstantCameraView.Delegate.-CC.$default$isSecretChat(this);
                }

                @Override // org.telegram.ui.Components.InstantCameraView.Delegate
                public View getFragmentView() {
                    return PeerStoriesView.this;
                }

                @Override // org.telegram.ui.Components.InstantCameraView.Delegate
                public void sendMedia(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z, int i, int i2, boolean z2, long j) {
                    if (photoEntry == null) {
                        return;
                    }
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                    if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    storyItem.dialogId = peerStoriesView.dialogId;
                    if (photoEntry.isVideo) {
                        if (videoEditedInfo != null) {
                            SendMessagesHelper.prepareSendingVideo(PeerStoriesView.this.getAccountInstance(), photoEntry.path, videoEditedInfo, null, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z, i, i2, z2, photoEntry.hasSpoiler, photoEntry.caption, null, 0, 0L, j);
                        } else {
                            SendMessagesHelper.prepareSendingVideo(PeerStoriesView.this.getAccountInstance(), photoEntry.path, null, null, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z, i, i2, z2, photoEntry.hasSpoiler, photoEntry.caption, null, 0, 0L, j);
                        }
                    } else if (photoEntry.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(PeerStoriesView.this.getAccountInstance(), photoEntry.imagePath, photoEntry.thumbPath, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z, i, i2, z2, photoEntry.caption, null, 0, 0L, j);
                    } else if (photoEntry.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(PeerStoriesView.this.getAccountInstance(), photoEntry.path, photoEntry.thumbPath, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z, i, i2, z2, photoEntry.caption, null, 0, 0L, j);
                    }
                    PeerStoriesView.this.afterMessageSend(j <= 0);
                }

                @Override // org.telegram.ui.Components.InstantCameraView.Delegate
                public Activity getParentActivity() {
                    return AndroidUtilities.findActivity(PeerStoriesView.this.getContext());
                }

                @Override // org.telegram.ui.Components.InstantCameraView.Delegate
                public int getClassGuid() {
                    return PeerStoriesView.this.classGuid;
                }

                @Override // org.telegram.ui.Components.InstantCameraView.Delegate
                public long getDialogId() {
                    return PeerStoriesView.this.dialogId;
                }
            }, this.resourcesProvider, false);
            addView(this.instantCameraView, Math.min(indexOfChild(this.chatActivityEnterView.getRecordCircle()), indexOfChild(this.chatActivityEnterView.controlsView)), LayoutHelper.createFrame(-1, -1, 51));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afterMessageSend(boolean z) {
        BulletinFactory of;
        InstantCameraView instantCameraView = this.instantCameraView;
        if (instantCameraView != null) {
            instantCameraView.resetCameraFile();
            this.instantCameraView.cancel(false);
        }
        this.storyViewer.clearDraft(this.dialogId, this.currentStory.storyItem);
        this.messageSent = true;
        this.storyViewer.closeKeyboardOrEmoji();
        if (z && (of = BulletinFactory.of(this.storyContainer, this.resourcesProvider)) != null) {
            of.createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.this.openChat();
                }
            }).hideAfterBottomSheet(false).show(false);
        }
        MessagesController.getInstance(this.currentAccount).ensureMessagesLoaded(this.dialogId, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openChat() {
        Bundle bundle = new Bundle();
        long j = this.dialogId;
        if (j < 0) {
            bundle.putLong("chat_id", -j);
        } else {
            bundle.putLong("user_id", j);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.currentAccount).getDialog(this.dialogId);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.storyViewer.presentFragment(new ChatActivity(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.currentAccount);
    }

    public static class VideoPlayerSharedScope {
        public boolean firstFrameRendered;
        public LivePlayer livePlayer;
        public StoryViewer.VideoPlayerHolder player;
        public View renderView;
        public SurfaceView surfaceView;
        public TextureView textureView;
        public ArrayList viewsToInvalidate = new ArrayList();

        public void invalidate() {
            for (int i = 0; i < this.viewsToInvalidate.size(); i++) {
                ((View) this.viewsToInvalidate.get(i)).invalidate();
            }
        }

        public boolean isBuffering() {
            StoryViewer.VideoPlayerHolder videoPlayerHolder = this.player;
            return videoPlayerHolder != null && videoPlayerHolder.isBuffering();
        }
    }

    void checkReactionsLayout() {
        if (this.reactionsContainerLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout(1, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new WrappedResourceProvider(this.resourcesProvider) { // from class: org.telegram.ui.Stories.PeerStoriesView.37
                @Override // org.telegram.ui.WrappedResourceProvider
                public void appendColors() {
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                }
            });
            this.reactionsContainerLayout = reactionsContainerLayout;
            reactionsContainerLayout.setHint(LocaleController.getString(this.isGroup ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
            ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsContainerLayout;
            reactionsContainerLayout2.skipEnterAnimation = true;
            addView(reactionsContainerLayout2, this.reactionsContainerIndex, LayoutHelper.createFrame(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
            this.reactionsContainerLayout.setDelegate(new 38());
            this.reactionsContainerLayout.setMessage(null, null, true);
        }
        this.reactionsContainerLayout.setFragment(LaunchActivity.getLastFragment());
        this.reactionsContainerLayout.setHint(LocaleController.getString(this.isGroup ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
    }

    class 38 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public /* synthetic */ boolean allowLongPress() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$allowLongPress(this);
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public /* synthetic */ boolean drawBackground() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$drawBackground(this);
        }

        38() {
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            onReactionClickedInternal(view, visibleReaction, z, z2, !z);
        }

        void onReactionClickedInternal(final View view, final ReactionsLayoutInBubble.VisibleReaction visibleReaction, final boolean z, final boolean z2, boolean z3) {
            if (z3 && PeerStoriesView.this.applyMessageToChat(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.38.this.lambda$onReactionClickedInternal$0(view, visibleReaction, z, z2);
                }
            })) {
                return;
            }
            AlertsCreator.ensurePaidMessageConfirmation(PeerStoriesView.this.currentAccount, PeerStoriesView.this.dialogId, 1, new Utilities.Callback() { // from class: org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PeerStoriesView.38.this.lambda$onReactionClickedInternal$2(z, visibleReaction, view, (Long) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReactionClickedInternal$0(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            onReactionClickedInternal(view, visibleReaction, z, z2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReactionClickedInternal$2(boolean z, ReactionsLayoutInBubble.VisibleReaction visibleReaction, View view, Long l) {
            ReactionsEffectOverlay reactionsEffectOverlay;
            TLRPC.Document findDocument;
            if (z && visibleReaction.emojicon != null) {
                try {
                    PeerStoriesView.this.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                reactionsEffectOverlay = new ReactionsEffectOverlay(view.getContext(), null, PeerStoriesView.this.reactionsContainerLayout, null, view, r3.getMeasuredWidth() / 2.0f, PeerStoriesView.this.getMeasuredHeight() / 2.0f, visibleReaction, PeerStoriesView.this.currentAccount, 0, true);
            } else {
                reactionsEffectOverlay = new ReactionsEffectOverlay(view.getContext(), null, PeerStoriesView.this.reactionsContainerLayout, null, view, r3.getMeasuredWidth() / 2.0f, PeerStoriesView.this.getMeasuredHeight() / 2.0f, visibleReaction, PeerStoriesView.this.currentAccount, 2, true);
            }
            ReactionsEffectOverlay.currentOverlay = reactionsEffectOverlay;
            reactionsEffectOverlay.windowView.setTag(R.id.parent_tag, 1);
            PeerStoriesView.this.addView(reactionsEffectOverlay.windowView);
            reactionsEffectOverlay.started = true;
            reactionsEffectOverlay.startTime = System.currentTimeMillis();
            if (visibleReaction.emojicon != null) {
                findDocument = MediaDataController.getInstance(PeerStoriesView.this.currentAccount).getEmojiAnimatedSticker(visibleReaction.emojicon);
                SendMessagesHelper.SendMessageParams of = SendMessagesHelper.SendMessageParams.of(visibleReaction.emojicon, PeerStoriesView.this.dialogId);
                of.replyToStoryItem = PeerStoriesView.this.currentStory.storyItem;
                of.payStars = l.longValue();
                SendMessagesHelper.getInstance(PeerStoriesView.this.currentAccount).sendMessage(of);
            } else {
                findDocument = AnimatedEmojiDrawable.findDocument(PeerStoriesView.this.currentAccount, visibleReaction.documentId);
                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(findDocument, null);
                if (findAnimatedEmojiEmoticon != null) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, PeerStoriesView.this.dialogId);
                    of2.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = visibleReaction.documentId;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of2.entities.add(tL_messageEntityCustomEmoji);
                    of2.replyToStoryItem = PeerStoriesView.this.currentStory.storyItem;
                    of2.payStars = l.longValue();
                    SendMessagesHelper.getInstance(PeerStoriesView.this.currentAccount).sendMessage(of2);
                } else {
                    if (PeerStoriesView.this.reactionsContainerLayout.getReactionsWindow() != null) {
                        PeerStoriesView.this.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
                    }
                    PeerStoriesView.this.closeKeyboardOrEmoji();
                    return;
                }
            }
            if (l.longValue() <= 0) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                BulletinFactory.of(peerStoriesView.storyContainer, peerStoriesView.resourcesProvider).createEmojiBulletin(findDocument, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        PeerStoriesView.38.this.lambda$onReactionClickedInternal$1();
                    }
                }).setDuration(5000).show();
            }
            if (PeerStoriesView.this.reactionsContainerLayout.getReactionsWindow() != null) {
                PeerStoriesView.this.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
            }
            PeerStoriesView.this.closeKeyboardOrEmoji();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReactionClickedInternal$1() {
            PeerStoriesView.this.openChat();
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            float f4 = -f2;
            float f5 = -f3;
            PeerStoriesView.this.bitmapShaderTools.setBounds(f4, f5, PeerStoriesView.this.getMeasuredWidth() + f4, PeerStoriesView.this.getMeasuredHeight() + f5);
            if (f > 0.0f) {
                canvas.drawRoundRect(rectF, f, f, PeerStoriesView.this.bitmapShaderTools.paint);
                canvas.drawRoundRect(rectF, f, f, PeerStoriesView.this.inputBackgroundPaint);
            } else {
                canvas.drawRect(rectF, PeerStoriesView.this.bitmapShaderTools.paint);
                canvas.drawRect(rectF, PeerStoriesView.this.inputBackgroundPaint);
            }
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public boolean needEnterText() {
            return PeerStoriesView.this.needEnterText();
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public void onEmojiWindowDismissed() {
            PeerStoriesView.this.delegate.requestAdjust(false);
        }
    }

    void checkReactionsLayoutForLike() {
        ReactionsContainerLayout reactionsContainerLayout = this.likesReactionLayout;
        if (reactionsContainerLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(2, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new WrappedResourceProvider(this.resourcesProvider) { // from class: org.telegram.ui.Stories.PeerStoriesView.39
                @Override // org.telegram.ui.WrappedResourceProvider
                public void appendColors() {
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                }
            });
            this.likesReactionLayout = reactionsContainerLayout2;
            reactionsContainerLayout2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
            addView(this.likesReactionLayout, getChildCount() - 1, LayoutHelper.createFrame(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
            this.likesReactionLayout.setVisibility(8);
            this.likesReactionLayout.setDelegate(new 40());
            this.likesReactionLayout.setMessage(null, null, true);
        } else {
            bringChildToFront(reactionsContainerLayout);
            this.likesReactionLayout.reset();
        }
        this.likesReactionLayout.setFragment(LaunchActivity.getLastFragment());
    }

    class 40 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public /* synthetic */ boolean allowLongPress() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$allowLongPress(this);
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public /* synthetic */ boolean drawBackground() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$drawBackground(this);
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public /* synthetic */ void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public /* synthetic */ void onEmojiWindowDismissed() {
            ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$onEmojiWindowDismissed(this);
        }

        40() {
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public void onReactionClicked(final View view, final ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PeerStoriesView.40.this.lambda$onReactionClicked$1(visibleReaction, view);
                }
            };
            if (!z) {
                PeerStoriesView.this.applyMessageToChat(runnable);
            } else {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReactionClicked$1(ReactionsLayoutInBubble.VisibleReaction visibleReaction, View view) {
            TLRPC.TL_availableReaction tL_availableReaction;
            PeerStoriesView.this.movingReaction = true;
            final boolean[] zArr = {false};
            final StoriesLikeButton storiesLikeButton = PeerStoriesView.this.storiesLikeButton;
            storiesLikeButton.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.40.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    AndroidUtilities.removeFromParent(storiesLikeButton);
                }
            }).setDuration(150L).start();
            int dp = AndroidUtilities.dp(8.0f);
            PeerStoriesView.this.storiesLikeButton = new StoriesLikeButton(PeerStoriesView.this.getContext(), PeerStoriesView.this.sharedResources);
            PeerStoriesView.this.storiesLikeButton.setPadding(dp, dp, dp, dp);
            PeerStoriesView.this.likeButtonContainer.addView(PeerStoriesView.this.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
            if (PeerStoriesView.this.reactionMoveDrawable != null) {
                PeerStoriesView.this.reactionMoveDrawable.removeView(PeerStoriesView.this);
                PeerStoriesView.this.reactionMoveDrawable = null;
            }
            if (PeerStoriesView.this.emojiReactionEffect != null) {
                PeerStoriesView.this.emojiReactionEffect.removeView(PeerStoriesView.this);
                PeerStoriesView.this.emojiReactionEffect = null;
            }
            PeerStoriesView.this.drawAnimatedEmojiAsMovingReaction = false;
            if (visibleReaction.documentId != 0) {
                PeerStoriesView.this.drawAnimatedEmojiAsMovingReaction = true;
                PeerStoriesView.this.reactionMoveDrawable = new AnimatedEmojiDrawable(2, PeerStoriesView.this.currentAccount, visibleReaction.documentId);
                PeerStoriesView.this.reactionMoveDrawable.addView(PeerStoriesView.this);
            } else if (visibleReaction.emojicon != null && (tL_availableReaction = MediaDataController.getInstance(PeerStoriesView.this.currentAccount).getReactionsMap().get(visibleReaction.emojicon)) != null) {
                PeerStoriesView.this.reactionMoveImageReceiver.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                PeerStoriesView.this.reactionEffectImageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation(), null, null, null, 0);
                if (PeerStoriesView.this.reactionEffectImageReceiver.getLottieAnimation() != null) {
                    PeerStoriesView.this.reactionEffectImageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                }
            }
            PeerStoriesView.this.storiesLikeButton.setReaction(visibleReaction);
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isChannel) {
                TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                if (storyItem.sent_reaction == null) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryItem storyItem2 = PeerStoriesView.this.currentStory.storyItem;
                    TL_stories.StoryViews storyViews = storyItem2.views;
                    storyViews.reactions_count++;
                    ReactionsUtils.applyForStoryViews(null, storyItem2.sent_reaction, storyViews);
                    PeerStoriesView.this.updateUserViews(true);
                }
            }
            if (visibleReaction.documentId != 0 && PeerStoriesView.this.storiesLikeButton.emojiDrawable != null) {
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.emojiReactionEffect = AnimatedEmojiEffect.createFrom(peerStoriesView2.storiesLikeButton.emojiDrawable, false, true);
                PeerStoriesView.this.emojiReactionEffect.setView(PeerStoriesView.this);
            }
            PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
            peerStoriesView3.storiesController.setStoryReaction(peerStoriesView3.dialogId, PeerStoriesView.this.currentStory.storyItem, visibleReaction);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            PeerStoriesView.this.getLocationInWindow(iArr2);
            PeerStoriesView.this.movingReactionFromX = iArr[0] - iArr2[0];
            PeerStoriesView.this.movingReactionFromY = iArr[1] - iArr2[1];
            PeerStoriesView.this.movingReactionFromSize = view.getMeasuredHeight();
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            PeerStoriesView.this.movingReactionProgress = 0.0f;
            PeerStoriesView.this.invalidate();
            final StoriesLikeButton storiesLikeButton2 = PeerStoriesView.this.storiesLikeButton;
            storiesLikeButton2.setAllowDrawReaction(false);
            storiesLikeButton2.prepareAnimateReaction(visibleReaction);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PeerStoriesView.40.this.lambda$onReactionClicked$0(ofFloat, zArr, valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.40.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    PeerStoriesView.this.movingReaction = false;
                    PeerStoriesView.this.movingReactionProgress = 1.0f;
                    PeerStoriesView.this.invalidate();
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        PeerStoriesView.this.drawReactionEffect = true;
                        try {
                            PeerStoriesView.this.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    storiesLikeButton2.setAllowDrawReaction(true);
                    storiesLikeButton2.animateVisibleReaction();
                    if (PeerStoriesView.this.reactionMoveDrawable != null) {
                        PeerStoriesView.this.reactionMoveDrawable.removeView(PeerStoriesView.this);
                        PeerStoriesView.this.reactionMoveDrawable = null;
                    }
                }
            });
            ofFloat.setDuration(220L);
            ofFloat.start();
            PeerStoriesView.this.showLikesReaction(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReactionClicked$0(ValueAnimator valueAnimator, boolean[] zArr, ValueAnimator valueAnimator2) {
            PeerStoriesView.this.movingReactionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PeerStoriesView.this.invalidate();
            if (PeerStoriesView.this.movingReactionProgress <= 0.8f || zArr[0]) {
                return;
            }
            zArr[0] = true;
            PeerStoriesView.this.drawReactionEffect = true;
            try {
                PeerStoriesView.this.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }

        @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
        public boolean needEnterText() {
            PeerStoriesView.this.delegate.requestAdjust(false);
            return false;
        }
    }

    public boolean needEnterText() {
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView == null) {
            return false;
        }
        boolean isKeyboardVisible = chatActivityEnterView.isKeyboardVisible();
        if (isKeyboardVisible) {
            this.chatActivityEnterView.showEmojiView();
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$needEnterText$53();
            }
        }, 300L);
        return isKeyboardVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$needEnterText$53() {
        this.delegate.requestAdjust(true);
    }

    public void setViewsThumbImageReceiver(float f, float f2, float f3, SelfStoriesPreviewView.ImageHolder imageHolder) {
        this.viewsThumbAlpha = f;
        this.viewsThumbScale = 1.0f / f2;
        this.viewsThumbPivotY = f3;
        if (this.viewsThumbImageReceiver == imageHolder) {
            return;
        }
        this.viewsThumbImageReceiver = imageHolder;
        if (imageHolder == null || imageHolder.receiver.getBitmap() == null) {
            return;
        }
        this.imageReceiver.updateStaticDrawableThump(imageHolder.receiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
    }

    public static class SharedResources {
        public final Paint barPaint;
        private final Drawable bottomOverlayGradient;
        public Drawable deleteDrawable;
        private final Paint gradientBackgroundPaint;
        public final Drawable imageBackgroundDrawable;
        public Drawable likeDrawable;
        public Drawable likeDrawableFilled;
        public RLottieDrawable muteDrawable;
        public RLottieDrawable noSoundDrawable;
        public Drawable optionsDrawable;
        public Drawable repostDrawable;
        public final Paint selectedBarPaint;
        public Drawable shareDrawable;
        private final Drawable topOverlayGradient;
        public final BitmapShaderTools bitmapShaderTools = new BitmapShaderTools();
        private final RectF rect1 = new RectF();
        private final RectF rect2 = new RectF();
        private final RectF finalRect = new RectF();
        private final RectF borderRect = new RectF();
        private final RectF popupRect = new RectF();
        private final Paint dimPaint = new Paint();

        SharedResources(Context context) {
            this.shareDrawable = ContextCompat.getDrawable(context, R.drawable.media_share);
            this.likeDrawable = ContextCompat.getDrawable(context, R.drawable.media_like);
            this.repostDrawable = ContextCompat.getDrawable(context, R.drawable.media_repost);
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.media_like_active);
            this.likeDrawableFilled = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            this.optionsDrawable = ContextCompat.getDrawable(context, R.drawable.media_more);
            this.deleteDrawable = ContextCompat.getDrawable(context, R.drawable.msg_delete);
            int i = R.raw.media_mute_unmute;
            this.muteDrawable = new RLottieDrawable(i, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.noSoundDrawable = rLottieDrawable;
            rLottieDrawable.setCurrentFrame(20, false, true);
            this.noSoundDrawable.stop();
            Paint paint = new Paint(1);
            this.barPaint = paint;
            paint.setColor(1442840575);
            Paint paint2 = new Paint(1);
            this.selectedBarPaint = paint2;
            paint2.setColor(-1);
            int alphaComponent = ColorUtils.setAlphaComponent(-16777216, 102);
            this.topOverlayGradient = ContextCompat.getDrawable(context, R.drawable.shadow_story_top);
            this.bottomOverlayGradient = ContextCompat.getDrawable(context, R.drawable.shadow_story_bottom);
            Paint paint3 = new Paint();
            this.gradientBackgroundPaint = paint3;
            paint3.setColor(alphaComponent);
            this.imageBackgroundDrawable = new ColorDrawable(ColorUtils.blendARGB(-16777216, -1, 0.1f));
        }

        public void setIconMuted(boolean z, boolean z2) {
            if (!z2) {
                this.muteDrawable.setCurrentFrame(z ? 20 : 0, false);
                this.muteDrawable.setCustomEndFrame(z ? 20 : 0);
                return;
            }
            if (z) {
                if (this.muteDrawable.getCurrentFrame() > 20) {
                    this.muteDrawable.setCurrentFrame(0, false);
                }
                this.muteDrawable.setCustomEndFrame(20);
                this.muteDrawable.start();
                return;
            }
            if (this.muteDrawable.getCurrentFrame() == 0 || this.muteDrawable.getCurrentFrame() >= 43) {
                return;
            }
            this.muteDrawable.setCustomEndFrame(43);
            this.muteDrawable.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void editPrivacy(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, final TL_stories.StoryItem storyItem) {
        this.delegate.showDialog(new StoryPrivacyBottomSheet(getContext(), storyItem.pinned ? ConnectionsManager.DEFAULT_DATACENTER_ID : storyItem.expire_date - storyItem.date, this.resourcesProvider).setValue(storyPrivacy).enableSharing(false).isEdit(true).whenSelectedRules(new StoryPrivacyBottomSheet.DoneCallback() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda41
            @Override // org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet.DoneCallback
            public final void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy2, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, Runnable runnable, Runnable runnable2) {
                PeerStoriesView.this.lambda$editPrivacy$56(storyItem, storyPrivacy2, z, z2, z3, z4, inputPeer, i, runnable, runnable2);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$editPrivacy$56(final TL_stories.StoryItem storyItem, final StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, final Runnable runnable, Runnable runnable2) {
        TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
        tL_stories_editStory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(storyItem.dialogId);
        tL_stories_editStory.id = storyItem.id;
        tL_stories_editStory.flags |= 4;
        tL_stories_editStory.privacy_rules = storyPrivacy.rules;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_editStory, new RequestDelegate() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda60
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PeerStoriesView.this.lambda$editPrivacy$55(runnable, storyItem, storyPrivacy, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$editPrivacy$55(final Runnable runnable, final TL_stories.StoryItem storyItem, final StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PeerStoriesView.this.lambda$editPrivacy$54(runnable, tL_error, storyItem, storyPrivacy);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$editPrivacy$54(Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        if (runnable != null) {
            runnable.run();
        }
        if (tL_error == null || "STORY_NOT_MODIFIED".equals(tL_error.text)) {
            storyItem.parsedPrivacy = storyPrivacy;
            storyItem.privacy = storyPrivacy.toValue();
            int i = storyPrivacy.type;
            storyItem.close_friends = i == 1;
            storyItem.contacts = i == 2;
            storyItem.selected_contacts = i == 3;
            MessagesController.getInstance(this.currentAccount).getStoriesController().updateStoryItem(storyItem.dialogId, storyItem, true, true);
            this.editedPrivacy = true;
            int i2 = storyPrivacy.type;
            if (i2 == 4) {
                BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToEveryone")).show();
            } else if (i2 == 1) {
                BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToCloseFriends")).show();
            } else if (i2 == 2) {
                if (storyPrivacy.selectedUserIds.isEmpty()) {
                    BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToAllContacts")).show();
                } else {
                    BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", storyPrivacy.selectedUserIds.size(), new Object[0])).show();
                }
            } else if (i2 == 3) {
                HashSet hashSet = new HashSet();
                hashSet.addAll(storyPrivacy.selectedUserIds);
                Iterator it = storyPrivacy.selectedUserIdsByGroup.values().iterator();
                while (it.hasNext()) {
                    hashSet.addAll((ArrayList) it.next());
                }
                BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).show();
            }
        } else {
            BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
        }
        updatePosition();
    }

    public boolean checkRecordLocked(final boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView == null || !chatActivityEnterView.isRecordLocked()) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        if (this.chatActivityEnterView.isInVideoMode()) {
            builder.setTitle(LocaleController.getString(R.string.DiscardVideoMessageTitle));
            builder.setMessage(LocaleController.getString(R.string.DiscardVideoMessageDescription));
        } else {
            builder.setTitle(LocaleController.getString(R.string.DiscardVoiceMessageTitle));
            builder.setMessage(LocaleController.getString(R.string.DiscardVoiceMessageDescription));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.DiscardVoiceMessageAction), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                PeerStoriesView.this.lambda$checkRecordLocked$57(z, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Continue), null);
        this.delegate.showDialog(builder.create());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkRecordLocked$57(boolean z, AlertDialog alertDialog, int i) {
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            if (z) {
                this.storyViewer.close(true);
            } else {
                chatActivityEnterView.cancelRecordingAudioVideo();
            }
        }
    }

    public void animateOut(final boolean z) {
        ValueAnimator valueAnimator = this.outAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.outT, z ? 1.0f : 0.0f);
        this.outAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda57
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PeerStoriesView.this.lambda$animateOut$58(valueAnimator2);
            }
        });
        this.outAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.PeerStoriesView.41
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PeerStoriesView.this.outT = z ? 1.0f : 0.0f;
                PeerStoriesView.this.headerView.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.headerView.setAlpha(1.0f - peerStoriesView.outT);
                PeerStoriesView.this.optionsIconView.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                PeerStoriesView.this.optionsIconView.setAlpha(1.0f - PeerStoriesView.this.outT);
                PeerStoriesView.this.muteIconContainer.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                PeerStoriesView.this.muteIconContainer.setAlpha(PeerStoriesView.this.muteIconViewAlpha * (1.0f - PeerStoriesView.this.outT));
                if (PeerStoriesView.this.selfView != null) {
                    PeerStoriesView.this.selfView.setTranslationY(AndroidUtilities.dp(8.0f) * PeerStoriesView.this.outT);
                    PeerStoriesView.this.selfView.setAlpha(1.0f - PeerStoriesView.this.outT);
                }
                if (PeerStoriesView.this.privacyButton != null) {
                    PeerStoriesView.this.privacyButton.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                    PeerStoriesView.this.privacyButton.setAlpha(1.0f - PeerStoriesView.this.outT);
                }
                PeerStoriesView.this.storyCaptionView.setAlpha(1.0f - PeerStoriesView.this.outT);
                Delegate delegate = PeerStoriesView.this.delegate;
                float progressToDismiss = delegate != null ? delegate.getProgressToDismiss() : 0.0f;
                float hideInterfaceAlpha = PeerStoriesView.this.getHideInterfaceAlpha();
                if (PeerStoriesView.this.likeButtonContainer != null) {
                    PeerStoriesView.this.likeButtonContainer.setAlpha((1.0f - progressToDismiss) * hideInterfaceAlpha * (1.0f - PeerStoriesView.this.outT));
                }
                if (PeerStoriesView.this.shareButton != null) {
                    PeerStoriesView.this.shareButton.setAlpha((1.0f - progressToDismiss) * hideInterfaceAlpha * (1.0f - PeerStoriesView.this.outT));
                }
                if (PeerStoriesView.this.repostButtonContainer != null) {
                    PeerStoriesView.this.repostButtonContainer.setAlpha(hideInterfaceAlpha * (1.0f - progressToDismiss) * (1.0f - PeerStoriesView.this.outT));
                }
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                ChatActivityEnterView chatActivityEnterView = peerStoriesView2.chatActivityEnterView;
                if (chatActivityEnterView != null) {
                    chatActivityEnterView.setAlpha(1.0f - peerStoriesView2.outT);
                    PeerStoriesView.this.invalidate();
                }
                PeerStoriesView.this.storyContainer.invalidate();
            }
        });
        this.outAnimator.setDuration(420L);
        this.outAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.outAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateOut$58(ValueAnimator valueAnimator) {
        this.outT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.headerView.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        this.headerView.setAlpha(1.0f - this.outT);
        this.optionsIconView.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        this.optionsIconView.setAlpha(1.0f - this.outT);
        this.muteIconContainer.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        this.muteIconContainer.setAlpha(this.muteIconViewAlpha * (1.0f - this.outT));
        FrameLayout frameLayout = this.selfView;
        if (frameLayout != null) {
            frameLayout.setTranslationY(AndroidUtilities.dp(8.0f) * this.outT);
            this.selfView.setAlpha(1.0f - this.outT);
        }
        StoryPrivacyButton storyPrivacyButton = this.privacyButton;
        if (storyPrivacyButton != null) {
            storyPrivacyButton.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
            this.privacyButton.setAlpha(1.0f - this.outT);
        }
        this.storyCaptionView.setAlpha(1.0f - this.outT);
        Delegate delegate = this.delegate;
        float progressToDismiss = delegate == null ? 0.0f : delegate.getProgressToDismiss();
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        FrameLayout frameLayout2 = this.likeButtonContainer;
        if (frameLayout2 != null) {
            frameLayout2.setAlpha((1.0f - progressToDismiss) * hideInterfaceAlpha * (1.0f - this.outT));
        }
        ImageView imageView = this.shareButton;
        if (imageView != null) {
            imageView.setAlpha((1.0f - progressToDismiss) * hideInterfaceAlpha * (1.0f - this.outT));
        }
        FrameLayout frameLayout3 = this.repostButtonContainer;
        if (frameLayout3 != null) {
            frameLayout3.setAlpha(hideInterfaceAlpha * (1.0f - progressToDismiss) * (1.0f - this.outT));
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setAlpha(1.0f - this.outT);
            invalidate();
        }
        this.storyContainer.invalidate();
    }

    public int getListPosition() {
        return this.listPosition;
    }

    public StoriesController getStoriesController() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }
}
