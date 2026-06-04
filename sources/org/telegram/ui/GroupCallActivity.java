package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$-CC;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda8;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GroupCallInvitedCell;
import org.telegram.ui.Cells.GroupCallTextCell;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FillLastGridLayoutManager;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.GroupCallRecordAlert;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecordStatusDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.Components.conference.message.GroupCallMessagesListView;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.GroupCallGridCell;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPTextureView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.recorder.DominantColors;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* loaded from: classes4.dex */
public class GroupCallActivity extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, FactorAnimator.Target {
    public static GroupCallActivity groupCallInstance;
    public static boolean groupCallUiVisible;
    public static boolean isLandscapeMode;
    public static boolean isTabletMode;
    public static boolean paused;
    public static volatile DispatchQueue updateTextureLightningQueue = new DispatchQueue("updateTextureLightningQueue");
    private final AccountInstance accountInstance;
    private final AccountSelectCell accountSelectCell;
    private final ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private final View actionBarBackground;
    private final View actionBarShadow;
    ObjectAnimator additionalSubtitleYAnimator;
    private ActionBarMenuSubItem adminItem;
    private float amplitude;
    private float animateAmplitudeDiff;
    private float animateToAmplitude;
    private boolean animatingToFullscreenExpand;
    private final BoolAnimator animatorHasVideo;
    private final BoolAnimator animatorHideButtons;
    private final FactorAnimator animatorMessageInputHeight;
    private final BoolAnimator animatorMessageIsEmpty;
    private boolean anyEnterEventSent;
    private final ArrayList attachedRenderers;
    private final ArrayList attachedRenderersTmp;
    private final AvatarPreviewPagerIndicator avatarPagerIndicator;
    private final FrameLayout avatarPreviewContainer;
    private boolean avatarPriviewTransitionInProgress;
    AvatarUpdaterDelegate avatarUpdaterDelegate;
    private boolean avatarsPreviewShowed;
    private final ProfileGalleryView avatarsViewPager;
    private int backgroundColor;
    private final RLottieDrawable bigMicDrawable;
    private final BlobDrawable bigWaveDrawable;
    private final View blurredView;
    private final FrameLayout bulletinContainer;
    private GradientDrawable buttonsBackgroundGradient;
    private final View buttonsBackgroundGradientView;
    private final View buttonsBackgroundGradientView2;
    private final GroupCallActivityButtonsLayout buttonsContainer;
    private int buttonsVisibility;
    private Integer cacheAudioOutputValue;
    public ChatObject.Call call;
    private boolean callInitied;
    private final FrameLayout callMessageEnterContainer;
    private final Paint callMessageEnterContainerBgPaint;
    private final FrameLayout callMessageEnterUnderContainer;
    private final EditTextEmoji callMessageEnterView;
    private final ImageView callMessageHideButton;
    private final ImageView callMessageSendButton;
    private final VoIPToggleButton cameraButton;
    public CellFlickerDrawable cellFlickerDrawable;
    private boolean changingPermissions;
    private float colorProgress;
    private final int[] colorsTmp;
    private boolean contentFullyOverlayed;
    private long creatingServiceTime;
    ImageUpdater currentAvatarUpdater;
    private int currentCallState;
    public TLRPC.Chat currentChat;
    private ViewGroup currentOptionsLayout;
    private WeavingState currentState;
    private boolean delayedGroupCallUpdated;
    private DiffUtil.Callback diffUtilsCallback;
    private final ActionBarMenuSubItem disableComments;
    private boolean drawSpeakingSubtitle;
    public boolean drawingForBlur;
    private final ActionBarMenuSubItem editTitleItem;
    private final ActionBarMenuSubItem enableComments;
    private CallEncryptionCellDrawable encryptionDrawable;
    private boolean enterEventSent;
    private ActionBarMenuSubItem everyoneItem;
    private final ImageView expandOrMinimizeButton;
    private final VoIPToggleButton flipButton;
    private final RLottieDrawable flipIcon;
    private int flipIconCurrentEndFrame;
    GroupCallFullscreenAdapter fullscreenAdapter;
    private final DefaultItemAnimator fullscreenListItemAnimator;
    RecyclerListView fullscreenUsersListView;
    private final int[] gradientColors;
    private final GroupCallMessagesListView groupCallMessagesListView;
    private GroupVoipInviteAlert groupVoipInviteAlert;
    private final RLottieDrawable handDrawables;
    private boolean hasScrimAnchorView;
    private boolean hasVideo;
    private boolean invalidateColors;
    private final ActionBarMenuSubItem inviteItem;
    private String[] invites;
    private boolean isInDrawRenderNodeBlur;
    private boolean isInFullscreen;
    private final GroupCallItemAnimator itemAnimator;
    private long lastUpdateTime;
    private final FillLastGridLayoutManager layoutManager;
    private final VoIPToggleButton leaveButton;
    private final ActionBarMenuSubItem leaveItem;
    private final AnimatedTextView limitTextView;
    private final ListAdapter listAdapter;
    private RecyclerListView listView;
    private final Paint listViewBackgroundPaint;
    private boolean listViewVideoVisibility;
    private ValueAnimator liveLabelBgColorAnimator;
    private final Paint liveLabelPaint;
    private final TextView liveLabelTextView;
    private final int maxGroupCallMessageLength;
    private final LinearLayout menuItemsContainer;
    private final VoIPToggleButton messageButton;
    private final VoIPToggleButton muteButton;
    private final RLottieImageView muteButtonIcon;
    private int muteButtonState;
    private boolean needTextureLightning;
    private final ActionBarMenuSubItem noiseItem;
    private int oldAddMemberRow;
    private int oldConferenceAddPeopleRow;
    private int oldConferenceShareLinkRow;
    private int oldCount;
    private int oldEncryptionRow;
    private final ArrayList oldInvited;
    private int oldInvitedEndRow;
    private int oldInvitedStartRow;
    private final ArrayList oldParticipants;
    private final ArrayList oldShadyJoin;
    private int oldShadyJoinEndRow;
    private int oldShadyJoinStartRow;
    private final ArrayList oldShadyLeft;
    private int oldShadyLeftEndRow;
    private int oldShadyLeftStartRow;
    private int oldUsersEndRow;
    private int oldUsersStartRow;
    private int oldUsersVideoEndRow;
    private int oldUsersVideoStartRow;
    private int oldVideoDividerRow;
    private int oldVideoNotAvailableRow;
    private final ArrayList oldVideoParticipants;
    private final Runnable onUserLeaveHintListener;
    private final ActionBarMenuItem otherItem;
    private Paint paint;
    private Paint paintTmp;
    private LaunchActivity parentActivity;
    private Boolean pendingCommentsEnabled;
    private final ActionBarMenuSubItem permissionItem;
    PinchToZoomHelper pinchToZoomHelper;
    private final ActionBarMenuItem pipItem;
    private PipSource pipSource;
    private boolean playingHandAnimation;
    private int popupAnimationIndex;
    private final Runnable pressRunnable;
    private boolean pressed;
    private WeavingState prevState;
    PrivateVideoPreviewDialog previewDialog;
    private boolean previewTextureTransitionEnabled;
    private float progressToAvatarPreview;
    private RadialGradient radialGradient;
    private final Matrix radialMatrix;
    private final Paint radialPaint;
    private final RadialProgressView radialProgressView;
    private final ImageReceiver reactionEffectImageReceiver;
    private ReactionsContainerLayout reactionsContainerLayout;
    private RecordCallDrawable recordCallDrawable;
    private HintView recordHintView;
    private final ActionBarMenuSubItem recordItem;
    private final RectF rect;
    private HintView reminderHintView;
    private RenderNode renderNodeBlur;
    private float renderNodeBlurScale;
    private GroupCallRenderersContainer renderersContainer;
    ViewTreeObserver.OnPreDrawListener requestFullscreenListener;
    private ValueAnimator scheduleAnimator;
    private TextView scheduleButtonTextView;
    private final boolean scheduleHasFewPeers;
    private TextView scheduleInfoTextView;
    private TLRPC.InputPeer schedulePeer;
    private int scheduleStartAt;
    private SimpleTextView scheduleStartAtTextView;
    private SimpleTextView scheduleStartInTextView;
    private SimpleTextView scheduleTimeTextView;
    private LinearLayout scheduleTimerContainer;
    private boolean scheduled;
    private final String scheduledHash;
    private final ActionBarMenuSubItem screenItem;
    private final ActionBarMenuItem screenShareItem;
    private AnimatorSet scrimAnimatorSet;
    private GroupCallFullscreenAdapter.GroupCallUserCell scrimFullscreenView;
    private GroupCallGridCell scrimGridView;
    private Paint scrimPaint;
    private View scrimPopupLayout;
    private ActionBarPopupWindow scrimPopupWindow;
    private GroupCallMiniTextureView scrimRenderer;
    private GroupCallUserCell scrimView;
    private boolean scrimViewAttached;
    private float scrollOffsetY;
    private TLRPC.Peer selfPeer;
    private final Drawable shadowDrawable;
    private ShareAlert shareAlert;
    private float showLightingProgress;
    private float showWavesProgress;
    private final SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private final VoIPToggleButton soundButton;
    private ActionBarMenuSubItem soundItem;
    private final View soundItemDivider;
    private final GridLayoutManager.SpanSizeLookup spanSizeLookup;
    private final VoIPToggleButton speakerButton;
    private int speakerIcon;
    private final ImageView speakerImageView;
    private boolean startingGroupCall;
    private WeavingState[] states;
    public final ArrayList statusIconPool;
    ObjectAnimator subtitleYAnimator;
    private float switchProgress;
    private float switchToButtonInt2;
    private float switchToButtonProgress;
    GroupCallTabletGridAdapter tabletGridAdapter;
    RecyclerListView tabletVideoGridView;
    private LightningView textureLightningView;
    private float textureLightningViewAnimatingAlpha;
    private final BlobDrawable tinyWaveDrawable;
    private final LinearLayout titleLayout;
    private final AudioPlayerAlert.ClippingTextViewSwitcher titleTextView;
    private final UndoView[] undoView;
    private final Runnable unmuteRunnable;
    private Runnable updateCallRecordRunnable;
    private final Runnable updateSchedeulRunnable;
    private final Runnable updateTextureLightningRunnable;
    private boolean useBlur;
    private TLObject userSwitchObject;
    LongSparseIntArray visiblePeerIds;
    public final ArrayList visibleVideoParticipants;
    private Boolean wasExpandBigSize;
    private Boolean wasNotInLayoutFullscreen;
    private WatchersView watchersView;
    private final WindowInsetsStateHolder windowInsetsStateHolder;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processSelectedOption$73(DialogInterface dialogInterface) {
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public boolean getAudioOutputActive(int i) {
        return i != 1;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.-CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public /* synthetic */ void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.-CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.-CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onScreenOnChange(boolean z) {
        VoIPService.StateListener.-CC.$default$onScreenOnChange(this, z);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.-CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.-CC.$default$onVideoAvailableChange(this, z);
    }

    static /* synthetic */ float access$12516(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.amplitude + f;
        groupCallActivity.amplitude = f2;
        return f2;
    }

    static /* synthetic */ float access$14516(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.switchProgress + f;
        groupCallActivity.switchProgress = f2;
        return f2;
    }

    static /* synthetic */ float access$15616(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress + f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    static /* synthetic */ float access$15624(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress - f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    static /* synthetic */ float access$15716(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress + f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    static /* synthetic */ float access$15724(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress - f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().setMicMute(false, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pressRunnableImpl() {
        if (this.call == null || !this.scheduled || VoIPService.getSharedInstance() == null) {
            return;
        }
        try {
            this.muteButton.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        updateMuteButton(1, true);
        AndroidUtilities.runOnUIThread(this.unmuteRunnable, 80L);
        this.scheduled = false;
        this.pressed = true;
    }

    class 2 implements Runnable {
        2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GroupCallGridCell findGroupCallGridCell;
            GroupCallMiniTextureView renderer;
            final VoIPTextureView voIPTextureView;
            try {
                if (GroupCallActivity.this.renderersContainer == null || GroupCallActivity.this.renderersContainer.inFullscreenMode || (findGroupCallGridCell = GroupCallActivity.this.findGroupCallGridCell()) == null || !findGroupCallGridCell.isAttachedToWindow() || (renderer = findGroupCallGridCell.getRenderer()) == null || (voIPTextureView = renderer.textureView) == null) {
                    return;
                }
                GroupCallActivity.updateTextureLightningQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.2.this.lambda$run$1(voIPTextureView);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(VoIPTextureView voIPTextureView) {
            try {
                Bitmap bitmap = voIPTextureView.blurRenderer.getBitmap(100, 100);
                if (bitmap == null) {
                    return;
                }
                final int[] colorsSync = DominantColors.getColorsSync(false, bitmap, true);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.2.this.lambda$run$0(colorsSync);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(int[] iArr) {
            GroupCallActivity.this.textureLightningView.setNewColors(iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GroupCallGridCell findGroupCallGridCell() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt.isAttachedToWindow() && (childAt instanceof GroupCallGridCell) && this.listView.getChildAdapterPosition(childAt) >= 0) {
                return (GroupCallGridCell) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runUpdateTextureLightningRunnable() {
        AndroidUtilities.cancelRunOnUIThread(this.updateTextureLightningRunnable);
        if (!this.needTextureLightning || this.textureLightningView == null || VoIPService.getSharedInstance() == null || !isRtmpStream() || this.listView == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.updateTextureLightningRunnable, 30L);
    }

    private static class SmallRecordCallDrawable extends Drawable {
        private long lastUpdateTime;
        private View parentView;
        private int state;
        private Paint paint2 = new Paint(1);
        private float alpha = 1.0f;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public SmallRecordCallDrawable(View view) {
            this.parentView = view;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int dp;
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            if (this.parentView instanceof SimpleTextView) {
                dp = centerY + AndroidUtilities.dp(1.0f);
                centerX -= AndroidUtilities.dp(3.0f);
            } else {
                dp = centerY + AndroidUtilities.dp(2.0f);
            }
            this.paint2.setColor(-1147527);
            this.paint2.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), this.paint2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = elapsedRealtime;
            int i = this.state;
            if (i == 0) {
                float f = this.alpha + (j / 2000.0f);
                this.alpha = f;
                if (f >= 1.0f) {
                    this.alpha = 1.0f;
                    this.state = 1;
                }
            } else if (i == 1) {
                float f2 = this.alpha - (j / 2000.0f);
                this.alpha = f2;
                if (f2 < 0.5f) {
                    this.alpha = 0.5f;
                    this.state = 0;
                }
            }
            this.parentView.invalidate();
        }
    }

    private static class RecordCallDrawable extends Drawable {
        private long lastUpdateTime;
        private View parentView;
        private boolean recording;
        private int state;
        private Paint paint = new Paint(1);
        private Paint paint2 = new Paint(1);
        private float alpha = 1.0f;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public RecordCallDrawable() {
            this.paint.setColor(-1);
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }

        public void setParentView(View view) {
            this.parentView = view;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        public void setRecording(boolean z) {
            this.recording = z;
            this.alpha = 1.0f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f), this.paint);
            this.paint2.setColor(this.recording ? -1147527 : -1);
            this.paint2.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(5.0f), this.paint2);
            if (this.recording) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.lastUpdateTime;
                if (j > 17) {
                    j = 17;
                }
                this.lastUpdateTime = elapsedRealtime;
                int i = this.state;
                if (i == 0) {
                    float f = this.alpha + (j / 2000.0f);
                    this.alpha = f;
                    if (f >= 1.0f) {
                        this.alpha = 1.0f;
                        this.state = 1;
                    }
                } else if (i == 1) {
                    float f2 = this.alpha - (j / 2000.0f);
                    this.alpha = f2;
                    if (f2 < 0.5f) {
                        this.alpha = 0.5f;
                        this.state = 0;
                    }
                }
                this.parentView.invalidate();
            }
        }
    }

    private class VolumeSlider extends FrameLayout {
        private boolean captured;
        private float colorChangeProgress;
        private int currentColor;
        private TLRPC.GroupCallParticipant currentParticipant;
        private double currentProgress;
        private boolean dragging;
        private RLottieImageView imageView;
        private long lastUpdateTime;
        private int oldColor;
        private Paint paint;
        private Paint paint2;
        private Path path;
        private float[] radii;
        private RectF rect;
        private RLottieDrawable speakerDrawable;
        private float sx;
        private float sy;
        private TextView textView;
        private int thumbX;
        private float[] volumeAlphas;

        public VolumeSlider(Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
            super(context);
            this.paint = new Paint(1);
            this.paint2 = new Paint(1);
            this.path = new Path();
            this.radii = new float[8];
            this.rect = new RectF();
            this.volumeAlphas = new float[3];
            setWillNotDraw(false);
            this.currentParticipant = groupCallParticipant;
            this.currentProgress = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
            this.colorChangeProgress = 1.0f;
            setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int i = R.raw.speaker;
            this.speakerDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setAnimation(this.speakerDrawable);
            this.imageView.setTag(this.currentProgress == 0.0d ? 1 : null);
            addView(this.imageView, LayoutHelper.createFrame(-2, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
            this.speakerDrawable.setCustomEndFrame(this.currentProgress == 0.0d ? 17 : 34);
            RLottieDrawable rLottieDrawable = this.speakerDrawable;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(3);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            this.textView.setTextSize(1, 16.0f);
            double participantVolume = ChatObject.getParticipantVolume(this.currentParticipant) / 100.0d;
            this.textView.setText(String.format(Locale.US, "%d%%", Integer.valueOf((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d))));
            this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
            this.paint2.setStyle(Paint.Style.STROKE);
            this.paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            this.paint2.setStrokeCap(Paint.Cap.ROUND);
            this.paint2.setColor(-1);
            int participantVolume2 = (int) (ChatObject.getParticipantVolume(this.currentParticipant) / 100.0d);
            int i2 = 0;
            while (true) {
                float[] fArr = this.volumeAlphas;
                if (i2 >= fArr.length) {
                    return;
                }
                if (participantVolume2 > (i2 == 0 ? 0 : i2 == 1 ? 50 : 150)) {
                    fArr[i2] = 1.0f;
                } else {
                    fArr[i2] = 0.0f;
                }
                i2++;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
            this.thumbX = (int) (View.MeasureSpec.getSize(i) * this.currentProgress);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return onTouch(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return onTouch(motionEvent);
        }

        boolean onTouch(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.sx = motionEvent.getX();
                this.sy = motionEvent.getY();
                return true;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.captured = false;
                if (motionEvent.getAction() == 1) {
                    if (Math.abs(motionEvent.getY() - this.sy) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                        int x = (int) motionEvent.getX();
                        this.thumbX = x;
                        if (x < 0) {
                            this.thumbX = 0;
                        } else if (x > getMeasuredWidth()) {
                            this.thumbX = getMeasuredWidth();
                        }
                        this.dragging = true;
                    }
                }
                if (this.dragging) {
                    if (motionEvent.getAction() == 1) {
                        onSeekBarDrag(this.thumbX / getMeasuredWidth(), true);
                    }
                    this.dragging = false;
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                if (!this.captured) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.sy) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.sx) > viewConfiguration.getScaledTouchSlop()) {
                        this.captured = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x2 = (int) motionEvent.getX();
                            this.thumbX = x2;
                            if (x2 < 0) {
                                this.thumbX = 0;
                            } else if (x2 > getMeasuredWidth()) {
                                this.thumbX = getMeasuredWidth();
                            }
                            this.dragging = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.dragging) {
                    int x3 = (int) motionEvent.getX();
                    this.thumbX = x3;
                    if (x3 < 0) {
                        this.thumbX = 0;
                    } else if (x3 > getMeasuredWidth()) {
                        this.thumbX = getMeasuredWidth();
                    }
                    onSeekBarDrag(this.thumbX / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
            return false;
        }

        private void onSeekBarDrag(double d, boolean z) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            this.currentProgress = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.currentParticipant;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
            this.textView.setText(String.format(Locale.US, "%d%%", Integer.valueOf((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d))));
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            TLRPC.GroupCallParticipant groupCallParticipant2 = this.currentParticipant;
            sharedInstance.setParticipantVolume(groupCallParticipant2, groupCallParticipant2.volume);
            if (z) {
                long peerId = MessageObject.getPeerId(this.currentParticipant.peer);
                TLObject user = peerId > 0 ? GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                if (this.currentParticipant.volume == 0) {
                    if (GroupCallActivity.this.scrimPopupWindow != null) {
                        GroupCallActivity.this.scrimPopupWindow.dismiss();
                        GroupCallActivity.this.scrimPopupWindow = null;
                    }
                    GroupCallActivity.this.dismissAvatarPreview(true);
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.processSelectedOption(this.currentParticipant, peerId, groupCallActivity.canManageCall() ? 0 : 5);
                } else {
                    VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(this.currentParticipant.volume), null, null);
                }
            }
            Integer num = this.currentProgress == 0.0d ? 1 : null;
            if ((this.imageView.getTag() != null || num == null) && (this.imageView.getTag() == null || num != null)) {
                return;
            }
            this.speakerDrawable.setCustomEndFrame(this.currentProgress == 0.0d ? 17 : 34);
            this.speakerDrawable.setCurrentFrame(this.currentProgress != 0.0d ? 17 : 0);
            this.speakerDrawable.start();
            this.imageView.setTag(num);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            float dp;
            int i2;
            int i3 = this.currentColor;
            double d = this.currentProgress;
            if (d < 0.25d) {
                this.currentColor = -3385513;
            } else if (d > 0.25d && d < 0.5d) {
                this.currentColor = -3562181;
            } else if (d >= 0.5d && d <= 0.75d) {
                this.currentColor = -11027349;
            } else {
                this.currentColor = -11688225;
            }
            float f = 1.0f;
            if (i3 == 0) {
                i = this.currentColor;
                this.colorChangeProgress = 1.0f;
            } else {
                int offsetColor = AndroidUtilities.getOffsetColor(this.oldColor, i3, this.colorChangeProgress, 1.0f);
                if (i3 != this.currentColor) {
                    this.colorChangeProgress = 0.0f;
                    this.oldColor = offsetColor;
                }
                i = offsetColor;
            }
            this.paint.setColor(i);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = elapsedRealtime;
            float f2 = this.colorChangeProgress;
            if (f2 < 1.0f) {
                float f3 = f2 + (j / 200.0f);
                this.colorChangeProgress = f3;
                if (f3 > 1.0f) {
                    this.colorChangeProgress = 1.0f;
                } else {
                    invalidate();
                }
            }
            this.path.reset();
            float[] fArr = this.radii;
            float f4 = 6.0f;
            float dp2 = AndroidUtilities.dp(6.0f);
            fArr[7] = dp2;
            fArr[6] = dp2;
            int i4 = 1;
            fArr[1] = dp2;
            fArr[0] = dp2;
            float max = this.thumbX < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (this.thumbX - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f;
            float[] fArr2 = this.radii;
            float dp3 = AndroidUtilities.dp(6.0f) * max;
            fArr2[5] = dp3;
            fArr2[4] = dp3;
            fArr2[3] = dp3;
            fArr2[2] = dp3;
            this.rect.set(0.0f, 0.0f, this.thumbX, getMeasuredHeight());
            this.path.addRoundRect(this.rect, this.radii, Path.Direction.CW);
            this.path.close();
            canvas.drawPath(this.path, this.paint);
            int participantVolume = (int) (ChatObject.getParticipantVolume(this.currentParticipant) / 100.0d);
            int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2) + AndroidUtilities.dp(5.0f);
            int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
            int i5 = 0;
            while (i5 < this.volumeAlphas.length) {
                if (i5 == 0) {
                    dp = AndroidUtilities.dp(f4);
                    i2 = 0;
                } else if (i5 == i4) {
                    dp = AndroidUtilities.dp(10.0f);
                    i2 = 50;
                } else {
                    dp = AndroidUtilities.dp(14.0f);
                    i2 = 150;
                }
                float dp4 = AndroidUtilities.dp(2.0f);
                float f5 = this.volumeAlphas[i5];
                float f6 = dp4 * (f - f5);
                this.paint2.setAlpha((int) (f5 * 255.0f));
                float f7 = left;
                float f8 = top;
                this.rect.set((f7 - dp) + f6, (f8 - dp) + f6, (f7 + dp) - f6, (f8 + dp) - f6);
                int i6 = i2;
                int i7 = i5;
                canvas.drawArc(this.rect, -50.0f, 100.0f, false, this.paint2);
                if (participantVolume > i6) {
                    float[] fArr3 = this.volumeAlphas;
                    float f9 = fArr3[i7];
                    if (f9 < 1.0f) {
                        float f10 = f9 + (j / 180.0f);
                        fArr3[i7] = f10;
                        if (f10 > 1.0f) {
                            fArr3[i7] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float[] fArr4 = this.volumeAlphas;
                    float f11 = fArr4[i7];
                    if (f11 > 0.0f) {
                        float f12 = f11 - (j / 180.0f);
                        fArr4[i7] = f12;
                        if (f12 < 0.0f) {
                            fArr4[i7] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i5 = i7 + 1;
                f = 1.0f;
                f4 = 6.0f;
                i4 = 1;
            }
        }
    }

    public static class WeavingState {
        public int currentState;
        private float duration;
        public Shader shader;
        private float startX;
        private float startY;
        private float time;
        private float targetX = -1.0f;
        private float targetY = -1.0f;
        private final Matrix matrix = new Matrix();

        public WeavingState(int i) {
            this.currentState = i;
        }

        public void update(int i, int i2, int i3, long j, float f) {
            float f2;
            if (this.shader == null) {
                return;
            }
            float f3 = this.duration;
            if (f3 == 0.0f || this.time >= f3) {
                this.duration = Utilities.random.nextInt(NotificationCenter.dialogPhotosUpdate) + 1500;
                this.time = 0.0f;
                if (this.targetX == -1.0f) {
                    setTarget();
                }
                this.startX = this.targetX;
                this.startY = this.targetY;
                setTarget();
            }
            float f4 = j;
            float f5 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f4) + (f4 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * f);
            this.time = f5;
            float f6 = this.duration;
            if (f5 > f6) {
                this.time = f6;
            }
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f6);
            float f7 = i3;
            float f8 = this.startX;
            float f9 = (i2 + ((f8 + ((this.targetX - f8) * interpolation)) * f7)) - 200.0f;
            float f10 = this.startY;
            float f11 = (i + (f7 * (f10 + ((this.targetY - f10) * interpolation)))) - 200.0f;
            if (GroupCallActivity.isGradientState(this.currentState)) {
                f2 = 1.0f;
            } else {
                f2 = this.currentState == 1 ? 4.0f : 2.5f;
            }
            float dp = (AndroidUtilities.dp(122.0f) / 400.0f) * f2;
            this.matrix.reset();
            this.matrix.postTranslate(f9, f11);
            this.matrix.postScale(dp, dp, f9 + 200.0f, f11 + 200.0f);
            this.shader.setLocalMatrix(this.matrix);
        }

        private void setTarget() {
            if (GroupCallActivity.isGradientState(this.currentState)) {
                this.targetX = ((Utilities.random.nextInt(100) * 0.2f) / 100.0f) + 0.85f;
                this.targetY = 1.0f;
            } else if (this.currentState == 1) {
                this.targetX = ((Utilities.random.nextInt(100) * 0.3f) / 100.0f) + 0.2f;
                this.targetY = ((Utilities.random.nextInt(100) * 0.3f) / 100.0f) + 0.7f;
            } else {
                this.targetX = ((Utilities.random.nextInt(100) / 100.0f) * 0.2f) + 0.8f;
                this.targetY = Utilities.random.nextInt(100) / 100.0f;
            }
        }
    }

    public static boolean isGradientState(int i) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i == 2 || i == 4 || i == 5 || i == 6 || i == 7;
    }

    private void prepareBlurBitmap() {
        if (this.blurredView == null) {
            return;
        }
        int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
        int measuredHeight = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
        this.parentActivity.getActionBarLayout().getView().draw(canvas);
        canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, 76));
        canvas.restore();
        canvas.save();
        canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
        this.drawingForBlur = true;
        this.containerView.draw(canvas);
        this.drawingForBlur = false;
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / NotificationCenter.needDeleteDialog));
        this.blurredView.setBackground(new BitmapDrawable(createBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
        this.blurredView.bringToFront();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean onCustomOpenAnimation() {
        groupCallUiVisible = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        GroupCallPip.updateVisibility(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
    public void dismiss() {
        this.parentActivity.removeOnUserLeaveHintListener(this.onUserLeaveHintListener);
        this.parentActivity.setRequestedOrientation(-1);
        groupCallUiVisible = false;
        GroupVoipInviteAlert groupVoipInviteAlert = this.groupVoipInviteAlert;
        if (groupVoipInviteAlert != null) {
            groupVoipInviteAlert.dismiss();
        }
        this.delayedGroupCallUpdated = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.needShowAlert);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.didLoadChatAdmins);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.mainUserInfoChanged);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isStillConnecting() {
        int i = this.currentCallState;
        return i == 1 || i == 2 || i == 6 || i == 5;
    }

    public long getChatId() {
        TLRPC.Chat chat = this.currentChat;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String string;
        ChatObject.VideoParticipant videoParticipant;
        VoIPService sharedInstance;
        int i3;
        int i4;
        String[] strArr = null;
        int i5 = 0;
        if (i == NotificationCenter.groupCallUpdated) {
            Long l = (Long) objArr[1];
            ChatObject.Call call = this.call;
            if (call == null || call.call.id != l.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.call;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            if (this.creatingServiceTime == 0 && (((i4 = this.muteButtonState) == 7 || i4 == 5 || i4 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.parentActivity, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", getChatId());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.scheduleHasFewPeers);
                    intent.putExtra("peerChannelId", this.schedulePeer.channel_id);
                    intent.putExtra("peerChatId", this.schedulePeer.chat_id);
                    intent.putExtra("peerUserId", this.schedulePeer.user_id);
                    intent.putExtra("hash", this.scheduledHash);
                    intent.putExtra("peerAccessHash", this.schedulePeer.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", this.accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.scheduleStartAt);
                    this.parentActivity.startService(intent);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                this.creatingServiceTime = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda36
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.this.lambda$didReceivedNotification$1();
                    }
                }, 3000L);
            }
            if (!this.callInitied && VoIPService.getSharedInstance() != null) {
                this.call.addSelfDummyParticipant(false);
                initCreatedGroupCall();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            updateItems();
            int childCount = this.listView.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.listView.getChildAt(i6);
                if (childAt instanceof GroupCallUserCell) {
                    ((GroupCallUserCell) childAt).applyParticipantChanges(true);
                }
            }
            if (this.scrimView != null) {
                this.delayedGroupCallUpdated = true;
            } else {
                applyCallParticipantUpdates(true);
            }
            updateSubtitle();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z = this.muteButtonState == 4;
            updateState(true, booleanValue);
            updateTitle(true);
            if (z && ((i3 = this.muteButtonState) == 1 || i3 == 0)) {
                getUndoView().showWithAction(0L, 38, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l2 = (Long) objArr[3];
                long longValue = l2.longValue();
                if (longValue == 0 || isRtmpStream()) {
                    return;
                }
                if (isConference() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList<TLRPC.Dialog> allDialogs = this.accountInstance.getMessagesController().getAllDialogs();
                    if (allDialogs != null) {
                        Iterator<TLRPC.Dialog> it = allDialogs.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().id == longValue) {
                                    i5 = 1;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC.User user = this.accountInstance.getMessagesController().getUser(l2);
                    if (user != null) {
                        if (this.call.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i5 != 0) {
                            getUndoView().showWithAction(0L, 44, user, this.currentChat, (Runnable) null, (Runnable) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    if (this.call.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i5 != 0) {
                        getUndoView().showWithAction(0L, 44, chat, this.currentChat, (Runnable) null, (Runnable) null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.groupCallSpeakingUsersUpdated) {
            GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
            if (groupCallRenderersContainer.inFullscreenMode && this.call != null) {
                boolean autoPinEnabled = groupCallRenderersContainer.autoPinEnabled();
                ChatObject.Call call3 = this.call;
                if (call3 != null) {
                    GroupCallRenderersContainer groupCallRenderersContainer2 = this.renderersContainer;
                    if (groupCallRenderersContainer2.inFullscreenMode && (videoParticipant = groupCallRenderersContainer2.fullscreenParticipant) != null && call3.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                        autoPinEnabled = true;
                    }
                }
                if (autoPinEnabled) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    for (int i7 = 0; i7 < this.visibleVideoParticipants.size(); i7++) {
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) this.visibleVideoParticipants.get(i7);
                        if (this.call.currentSpeakingPeers.get(MessageObject.getPeerId(videoParticipant3.participant.peer), null) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && this.renderersContainer.fullscreenPeerId != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                    }
                    if (videoParticipant2 != null) {
                        fullscreenFor(videoParticipant2);
                    }
                }
            }
            this.renderersContainer.setVisibleParticipant(true);
            updateSubtitle();
            return;
        }
        if (i == NotificationCenter.webRtcMicAmplitudeEvent) {
            setMicAmplitude(((Float) objArr[0]).floatValue());
            return;
        }
        if (i == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (ChatObject.isChannelOrGiga(this.currentChat)) {
                        string = LocaleController.getString(R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                } else if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    string = LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog.Builder createSimpleAlert = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                createSimpleAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda37
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GroupCallActivity.this.lambda$didReceivedNotification$2(dialogInterface);
                    }
                });
                try {
                    createSimpleAlert.show();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == getChatId()) {
                updateItems();
                updateState(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.selfPeer);
            ChatObject.Call call4 = this.call;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.get(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
            if (this.currentOptionsLayout != null) {
                while (i5 < this.currentOptionsLayout.getChildCount()) {
                    View childAt2 = this.currentOptionsLayout.getChildAt(i5);
                    if ((childAt2 instanceof ActionBarMenuSubItem) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((ActionBarMenuSubItem) childAt2).setTextAndIcon(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info);
                    }
                    i5++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == getChatId()) {
                updateItems();
                updateState(isShowing(), false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = this.listView.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i5 < childCount2) {
                RecyclerView.ViewHolder findContainingViewHolder = this.listView.findContainingViewHolder(this.listView.getChildAt(i5));
                if (findContainingViewHolder != null) {
                    View view = findContainingViewHolder.itemView;
                    if (view instanceof GroupCallUserCell) {
                        GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                        if (groupCallUserCell.getParticipant() != null) {
                            groupCallUserCell.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i5++;
            }
            return;
        }
        if (i == NotificationCenter.userInfoDidLoad) {
            Long l3 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.selfPeer);
            if (this.call == null || peerId2 != l3.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(peerId2)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
            if (this.currentOptionsLayout != null) {
                while (i5 < this.currentOptionsLayout.getChildCount()) {
                    View childAt3 = this.currentOptionsLayout.getChildAt(i5);
                    if ((childAt3 instanceof ActionBarMenuSubItem) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((ActionBarMenuSubItem) childAt3).setTextAndIcon(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info);
                    }
                    i5++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.mainUserInfoChanged) {
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                applyCallParticipantUpdates(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
                return;
            }
            AndroidUtilities.updateVisibleRows(this.listView);
            return;
        }
        if (i == NotificationCenter.groupCallScreencastStateChanged) {
            PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
            if (privateVideoPreviewDialog != null) {
                privateVideoPreviewDialog.dismiss(true, true);
            }
            updateItems();
            return;
        }
        if (i == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.encryptionDrawable;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            callEncryptionCellDrawable.setEmojis(strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$1() {
        if (isStillConnecting()) {
            updateState(true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$2(DialogInterface dialogInterface) {
        dismiss();
    }

    private void setMicAmplitude(float f) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f = 0.0f;
        }
        setAmplitude(4000.0f * f);
        ChatObject.Call call = this.call;
        if (call == null || this.listView == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(MessageObject.getPeerId(this.selfPeer))) == null) {
            return;
        }
        if (!this.renderersContainer.inFullscreenMode) {
            int indexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(groupCallParticipant);
            if (indexOf >= 0 && (findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(indexOf + this.listAdapter.usersStartRow)) != null) {
                View view = findViewHolderForAdapterPosition.itemView;
                if (view instanceof GroupCallUserCell) {
                    ((GroupCallUserCell) view).setAmplitude(f * 15.0f);
                    if (findViewHolderForAdapterPosition.itemView == this.scrimView && !this.contentFullyOverlayed) {
                        this.containerView.invalidate();
                    }
                }
            }
        } else {
            for (int i = 0; i < this.fullscreenUsersListView.getChildCount(); i++) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) this.fullscreenUsersListView.getChildAt(i);
                if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    groupCallUserCell.setAmplitude(f * 15.0f);
                }
            }
        }
        this.renderersContainer.setAmplitude(groupCallParticipant, f * 15.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0279 A[LOOP:2: B:96:0x0271->B:98:0x0279, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyCallParticipantUpdates(boolean z) {
        int i;
        int i2;
        GroupCallActivity groupCallActivity;
        int i3;
        int i4;
        GroupCallRenderersContainer groupCallRenderersContainer;
        int i5;
        ChatObject.Call call;
        boolean z2;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        RecyclerView.ViewHolder findContainingViewHolder;
        UpdateCallback updateCallback;
        GroupCallRenderersContainer groupCallRenderersContainer2 = this.renderersContainer;
        if (groupCallRenderersContainer2 == null || this.listView == null || this.call == null || this.delayedGroupCallUpdated) {
            return;
        }
        if (groupCallRenderersContainer2.inFullscreenMode) {
            groupCallRenderersContainer2.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(this.call.selfPeer);
        if (peerId != MessageObject.getPeerId(this.selfPeer) && this.call.participants.get(peerId) != null) {
            this.selfPeer = this.call.selfPeer;
        }
        int childCount = this.listView.getChildCount();
        int i6 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = this.listView.getChildAt(i8);
            RecyclerView.ViewHolder findContainingViewHolder2 = this.listView.findContainingViewHolder(childAt);
            if (findContainingViewHolder2 != null && findContainingViewHolder2.getAdapterPosition() != -1 && findContainingViewHolder2.getLayoutPosition() != -1 && (view == null || childAt.getTop() < i6)) {
                i7 = findContainingViewHolder2.getLayoutPosition();
                i6 = childAt.getTop();
                view = childAt;
            }
        }
        updateVideoParticipantList();
        if (this.listView.getItemAnimator() != null && !z) {
            this.listView.setItemAnimator(null);
        } else if (this.listView.getItemAnimator() == null && z) {
            this.listView.setItemAnimator(this.itemAnimator);
        }
        try {
            updateCallback = new UpdateCallback(this.listAdapter);
            groupCallActivity = this;
            i = i7;
            i2 = childCount;
            try {
                groupCallActivity.setOldRows(this.listAdapter.encryptionRow, this.listAdapter.addMemberRow, this.listAdapter.usersStartRow, this.listAdapter.usersEndRow, this.listAdapter.invitedStartRow, this.listAdapter.invitedEndRow, this.listAdapter.shadyJoinStartRow, this.listAdapter.shadyJoinEndRow, this.listAdapter.shadyLeftStartRow, this.listAdapter.shadyLeftEndRow, this.listAdapter.usersVideoGridStartRow, this.listAdapter.usersVideoGridEndRow, this.listAdapter.videoGridDividerRow, this.listAdapter.videoNotAvailableRow, this.listAdapter.conferenceAddPeopleRow, this.listAdapter.conferenceShareLinkRow);
            } catch (Exception e) {
                e = e;
                groupCallActivity = this;
            }
        } catch (Exception e2) {
            e = e2;
            i = i7;
            i2 = childCount;
            groupCallActivity = this;
        }
        try {
            groupCallActivity.listAdapter.updateRows();
            DiffUtil.calculateDiff(groupCallActivity.diffUtilsCallback).dispatchUpdatesTo(updateCallback);
        } catch (Exception e3) {
            e = e3;
            FileLog.e(e);
            groupCallActivity.listAdapter.notifyDataSetChanged();
            groupCallActivity.call.saveActiveDates();
            if (view != null) {
            }
            groupCallActivity.oldParticipants.clear();
            groupCallActivity.oldParticipants.addAll(groupCallActivity.call.visibleParticipants);
            groupCallActivity.oldVideoParticipants.clear();
            groupCallActivity.oldVideoParticipants.addAll(groupCallActivity.visibleVideoParticipants);
            groupCallActivity.oldInvited.clear();
            groupCallActivity.oldInvited.addAll(groupCallActivity.call.invitedUsers);
            groupCallActivity.oldShadyJoin.clear();
            groupCallActivity.oldShadyJoin.addAll(groupCallActivity.call.shadyJoinParticipants);
            groupCallActivity.oldShadyLeft.clear();
            groupCallActivity.oldShadyLeft.addAll(groupCallActivity.call.shadyLeftParticipants);
            groupCallActivity.oldCount = groupCallActivity.listAdapter.getItemCount();
            i3 = i2;
            while (i4 < i3) {
            }
            boolean autoPinEnabled = groupCallActivity.renderersContainer.autoPinEnabled();
            groupCallRenderersContainer = groupCallActivity.renderersContainer;
            if (groupCallRenderersContainer.inFullscreenMode) {
                if (!groupCallActivity.visibleVideoParticipants.isEmpty()) {
                }
                groupCallActivity.fullscreenAdapter.update(true, groupCallActivity.fullscreenUsersListView);
                if (groupCallActivity.fullscreenUsersListView.getVisibility() == 0) {
                }
                if (isTabletMode) {
                }
                if (groupCallActivity.listView.getVisibility() == 0) {
                }
                groupCallActivity.attachedRenderersTmp.clear();
                groupCallActivity.attachedRenderersTmp.addAll(groupCallActivity.attachedRenderers);
                while (i5 < groupCallActivity.attachedRenderersTmp.size()) {
                }
                call = groupCallActivity.call;
                if (call != null) {
                }
                ChatObject.Call call2 = groupCallActivity.call;
                if (call2 == null) {
                }
                groupCallActivity.animatorHasVideo.setValue(z2, z);
                if (z2 == groupCallActivity.hasVideo) {
                }
            }
            groupCallActivity.fullscreenAdapter.update(true, groupCallActivity.fullscreenUsersListView);
            if (groupCallActivity.fullscreenUsersListView.getVisibility() == 0) {
            }
            if (isTabletMode) {
            }
            if (groupCallActivity.listView.getVisibility() == 0) {
            }
            groupCallActivity.attachedRenderersTmp.clear();
            groupCallActivity.attachedRenderersTmp.addAll(groupCallActivity.attachedRenderers);
            while (i5 < groupCallActivity.attachedRenderersTmp.size()) {
            }
            call = groupCallActivity.call;
            if (call != null) {
            }
            ChatObject.Call call22 = groupCallActivity.call;
            if (call22 == null) {
            }
            groupCallActivity.animatorHasVideo.setValue(z2, z);
            if (z2 == groupCallActivity.hasVideo) {
            }
        }
        groupCallActivity.call.saveActiveDates();
        if (view != null) {
            groupCallActivity.layoutManager.scrollToPositionWithOffset(i, view.getTop() - groupCallActivity.listView.getPaddingTop());
        }
        groupCallActivity.oldParticipants.clear();
        groupCallActivity.oldParticipants.addAll(groupCallActivity.call.visibleParticipants);
        groupCallActivity.oldVideoParticipants.clear();
        groupCallActivity.oldVideoParticipants.addAll(groupCallActivity.visibleVideoParticipants);
        groupCallActivity.oldInvited.clear();
        groupCallActivity.oldInvited.addAll(groupCallActivity.call.invitedUsers);
        groupCallActivity.oldShadyJoin.clear();
        groupCallActivity.oldShadyJoin.addAll(groupCallActivity.call.shadyJoinParticipants);
        groupCallActivity.oldShadyLeft.clear();
        groupCallActivity.oldShadyLeft.addAll(groupCallActivity.call.shadyLeftParticipants);
        groupCallActivity.oldCount = groupCallActivity.listAdapter.getItemCount();
        i3 = i2;
        for (i4 = 0; i4 < i3; i4++) {
            View childAt2 = groupCallActivity.listView.getChildAt(i4);
            boolean z3 = childAt2 instanceof GroupCallUserCell;
            if ((z3 || (childAt2 instanceof GroupCallInvitedCell)) && (findContainingViewHolder = groupCallActivity.listView.findContainingViewHolder(childAt2)) != null) {
                if (z3) {
                    ((GroupCallUserCell) childAt2).setDrawDivider(findContainingViewHolder.getAdapterPosition() != groupCallActivity.listAdapter.getItemCount() + (-2));
                } else {
                    ((GroupCallInvitedCell) childAt2).setDrawDivider(findContainingViewHolder.getAdapterPosition() != groupCallActivity.listAdapter.getItemCount() + (-2));
                }
            }
        }
        boolean autoPinEnabled2 = groupCallActivity.renderersContainer.autoPinEnabled();
        groupCallRenderersContainer = groupCallActivity.renderersContainer;
        if (groupCallRenderersContainer.inFullscreenMode && (videoParticipant2 = groupCallRenderersContainer.fullscreenParticipant) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, groupCallActivity.call)) {
            if (!groupCallActivity.visibleVideoParticipants.isEmpty()) {
                groupCallActivity.fullscreenFor(null);
            } else if (autoPinEnabled2) {
                groupCallActivity.fullscreenFor((ChatObject.VideoParticipant) groupCallActivity.visibleVideoParticipants.get(0));
            }
            groupCallActivity.fullscreenAdapter.update(true, groupCallActivity.fullscreenUsersListView);
            if (groupCallActivity.fullscreenUsersListView.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(groupCallActivity.fullscreenUsersListView);
            }
            if (isTabletMode) {
                groupCallActivity.tabletGridAdapter.update(true, groupCallActivity.tabletVideoGridView);
            }
            if (groupCallActivity.listView.getVisibility() == 0) {
                AndroidUtilities.updateVisibleRows(groupCallActivity.listView);
            }
            groupCallActivity.attachedRenderersTmp.clear();
            groupCallActivity.attachedRenderersTmp.addAll(groupCallActivity.attachedRenderers);
            for (i5 = 0; i5 < groupCallActivity.attachedRenderersTmp.size(); i5++) {
                ((GroupCallMiniTextureView) groupCallActivity.attachedRenderersTmp.get(i5)).updateAttachState(true);
            }
            call = groupCallActivity.call;
            if (call != null) {
                GroupCallRenderersContainer groupCallRenderersContainer3 = groupCallActivity.renderersContainer;
                if (groupCallRenderersContainer3.inFullscreenMode && (videoParticipant = groupCallRenderersContainer3.fullscreenParticipant) != null) {
                    call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
                }
            }
            ChatObject.Call call222 = groupCallActivity.call;
            z2 = call222 == null && !call222.visibleVideoParticipants.isEmpty();
            groupCallActivity.animatorHasVideo.setValue(z2, z);
            if (z2 == groupCallActivity.hasVideo) {
                groupCallActivity.hasVideo = z2;
                if (isTabletMode) {
                    groupCallActivity.containerView.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        groupCallActivity.fullscreenAdapter.update(true, groupCallActivity.fullscreenUsersListView);
        if (groupCallActivity.fullscreenUsersListView.getVisibility() == 0) {
        }
        if (isTabletMode) {
        }
        if (groupCallActivity.listView.getVisibility() == 0) {
        }
        groupCallActivity.attachedRenderersTmp.clear();
        groupCallActivity.attachedRenderersTmp.addAll(groupCallActivity.attachedRenderers);
        while (i5 < groupCallActivity.attachedRenderersTmp.size()) {
        }
        call = groupCallActivity.call;
        if (call != null) {
        }
        ChatObject.Call call2222 = groupCallActivity.call;
        if (call2222 == null) {
        }
        groupCallActivity.animatorHasVideo.setValue(z2, z);
        if (z2 == groupCallActivity.hasVideo) {
        }
    }

    private void updateVideoParticipantList() {
        this.visibleVideoParticipants.clear();
        if (isTabletMode) {
            if (this.renderersContainer.inFullscreenMode) {
                this.visibleVideoParticipants.addAll(this.call.visibleVideoParticipants);
                ChatObject.VideoParticipant videoParticipant = this.renderersContainer.fullscreenParticipant;
                if (videoParticipant != null) {
                    this.visibleVideoParticipants.remove(videoParticipant);
                    return;
                }
                return;
            }
            return;
        }
        this.visibleVideoParticipants.addAll(this.call.visibleVideoParticipants);
    }

    private void updateRecordCallText() {
        if (this.call == null) {
            return;
        }
        int currentTime = this.accountInstance.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.call;
        int i = currentTime - call.call.record_start_date;
        if (call.recording) {
            this.recordItem.setSubtext(AndroidUtilities.formatDuration(i, false));
        } else {
            this.recordItem.setSubtext(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateItems() {
        TLObject chat;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        ChatObject.Call call2 = this.call;
        if (call2 == null || call2.isScheduled()) {
            this.pipItem.setVisibility(4);
            this.screenShareItem.setVisibility(8);
            if (this.call == null) {
                this.otherItem.setVisibility(8);
                return;
            }
        }
        if (this.changingPermissions) {
            return;
        }
        TLRPC.Chat chat4 = this.accountInstance.getMessagesController().getChat(Long.valueOf(getChatId()));
        if (chat4 != null) {
            this.currentChat = chat4;
        }
        if (ChatObject.canUserDoAdminAction(this.currentChat, 3) || (((!ChatObject.isChannel(this.currentChat) || ((chat3 = this.currentChat) != null && chat3.megagroup)) && (ChatObject.isPublic(this.currentChat) || ChatObject.canUserDoAdminAction(this.currentChat, 3))) || (ChatObject.isChannel(this.currentChat) && (chat2 = this.currentChat) != null && !chat2.megagroup && ChatObject.isPublic(chat2)))) {
            this.inviteItem.setVisibility(0);
        } else {
            this.inviteItem.setVisibility(8);
        }
        ChatObject.Call call3 = this.call;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            this.enableComments.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            this.disableComments.setVisibility(this.call.call.messages_enabled ? 0 : 8);
        } else {
            this.enableComments.setVisibility(8);
            this.disableComments.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        ChatObject.Call call4 = this.call;
        if (call4 == null || call4.isScheduled() || (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted)) {
            this.noiseItem.setVisibility(8);
        } else {
            this.noiseItem.setVisibility(0);
        }
        this.noiseItem.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        this.noiseItem.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean z = true;
        if (canManageCall()) {
            this.leaveItem.setVisibility(0);
            this.editTitleItem.setVisibility(0);
            if (isRtmpStream()) {
                this.recordItem.setVisibility(0);
                this.screenItem.setVisibility(8);
            } else if (this.call.isScheduled()) {
                this.recordItem.setVisibility(8);
                this.screenItem.setVisibility(8);
            } else {
                this.recordItem.setVisibility(0);
            }
            if (isConference()) {
                this.recordItem.setVisibility(8);
                this.editTitleItem.setVisibility(8);
            }
            if (!this.call.canRecordVideo() || this.call.isScheduled() || isRtmpStream()) {
                this.screenItem.setVisibility(8);
            } else {
                this.screenItem.setVisibility(0);
            }
            this.screenShareItem.setVisibility(8);
            this.recordCallDrawable.setRecording(this.call.recording);
            if (this.call.recording) {
                if (this.updateCallRecordRunnable == null) {
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda53
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupCallActivity.this.lambda$updateItems$3();
                        }
                    };
                    this.updateCallRecordRunnable = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 1000L);
                }
                this.recordItem.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                Runnable runnable2 = this.updateCallRecordRunnable;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    this.updateCallRecordRunnable = null;
                }
                this.recordItem.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                this.screenItem.setTextAndIcon(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off);
            } else {
                this.screenItem.setTextAndIcon(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast);
            }
            updateRecordCallText();
        } else {
            boolean z2 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
            boolean z3 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z2 || (!(this.call.canRecordVideo() || z3) || this.call.isScheduled() || isRtmpStream())) {
                this.screenShareItem.setVisibility(8);
                this.screenItem.setVisibility(8);
            } else if (z3) {
                this.screenShareItem.setVisibility(8);
                this.screenItem.setVisibility(0);
                ActionBarMenuSubItem actionBarMenuSubItem = this.screenItem;
                int i = R.string.VoipChatStopScreenCapture;
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(i), R.drawable.msg_screencast_off);
                this.screenItem.setContentDescription(LocaleController.getString(i));
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem2 = this.screenItem;
                int i2 = R.string.VoipChatStartScreenCapture;
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(i2), R.drawable.msg_screencast);
                this.screenItem.setContentDescription(LocaleController.getString(i2));
                this.screenShareItem.setVisibility(8);
                this.screenItem.setVisibility(0);
            }
            this.leaveItem.setVisibility(8);
            this.editTitleItem.setVisibility(8);
            this.recordItem.setVisibility(8);
        }
        if (canManageCall() && this.call.call.can_change_join_muted && !isConference()) {
            this.permissionItem.setVisibility(0);
        } else {
            this.permissionItem.setVisibility(8);
        }
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        if (isConference() && ((call = this.call) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z = false;
        }
        actionBarMenuItem.setSubItemShown(4, z);
        this.soundItem.setVisibility((!isRtmpStream() || this.call.isScheduled()) ? 0 : 8);
        if (this.editTitleItem.getVisibility() == 0 || this.permissionItem.getVisibility() == 0 || this.inviteItem.getVisibility() == 0 || this.screenItem.getVisibility() == 0 || this.recordItem.getVisibility() == 0 || this.leaveItem.getVisibility() == 0) {
            this.soundItemDivider.setVisibility(0);
        } else {
            this.soundItemDivider.setVisibility(8);
        }
        if (((VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().hasFewPeers) || this.scheduleHasFewPeers) && !isRtmpStream() && this.selfPeer != null) {
            this.accountSelectCell.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.selfPeer);
            if (DialogObject.isUserDialog(peerId)) {
                chat = this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            } else {
                chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            }
            this.accountSelectCell.setObject(chat);
        } else {
            this.accountSelectCell.setVisibility(8);
        }
        TLRPC.Chat chat5 = this.currentChat;
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && isRtmpStream() && this.inviteItem.getVisibility() == 8) {
            this.otherItem.setVisibility(8);
        } else {
            this.otherItem.setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.titleLayout.getLayoutParams();
        float f = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f);
            this.titleLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.menuItemsContainer.getLayoutParams()).rightMargin = 0;
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateItems$3() {
        updateRecordCallText();
        AndroidUtilities.runOnUIThread(this.updateCallRecordRunnable, 1000L);
    }

    protected void makeFocusable(final BottomSheet bottomSheet, final AlertDialog alertDialog, final EditTextBoldCursor editTextBoldCursor, final boolean z) {
        if (this.enterEventSent) {
            return;
        }
        BaseFragment baseFragment = (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
        if (baseFragment instanceof ChatActivity) {
            boolean needEnterText = ((ChatActivity) baseFragment).needEnterText();
            this.enterEventSent = true;
            this.anyEnterEventSent = true;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda56
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.lambda$makeFocusable$6(BottomSheet.this, editTextBoldCursor, z, alertDialog);
                }
            }, needEnterText ? 200L : 0L);
            return;
        }
        this.enterEventSent = true;
        this.anyEnterEventSent = true;
        if (bottomSheet != null) {
            bottomSheet.setFocusable(true);
        } else if (alertDialog != null) {
            alertDialog.setFocusable(true);
        }
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda57
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.lambda$makeFocusable$7(EditTextBoldCursor.this);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeFocusable$6(BottomSheet bottomSheet, final EditTextBoldCursor editTextBoldCursor, boolean z, AlertDialog alertDialog) {
        if (bottomSheet != null && !bottomSheet.isDismissed()) {
            bottomSheet.setFocusable(true);
            editTextBoldCursor.requestFocus();
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda81
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                    }
                });
                return;
            }
            return;
        }
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        alertDialog.setFocusable(true);
        editTextBoldCursor.requestFocus();
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda82
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeFocusable$7(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void create(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        if (groupCallInstance == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                groupCallInstance = new GroupCallActivity(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                groupCallInstance = new GroupCallActivity(launchActivity, accountInstance, call, chat2, null, z, str);
            }
            groupCallInstance.parentActivity = launchActivity;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.lambda$create$8();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$8() {
        GroupCallActivity groupCallActivity = groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.show();
        }
    }

    private GroupCallActivity(final Activity activity, final AccountInstance accountInstance, final ChatObject.Call call, final TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        super(activity, true, true, null);
        TLRPC.InputPeer inputPeer2;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.callMessageEnterContainerBgPaint = new Paint(1);
        this.undoView = new UndoView[2];
        this.visibleVideoParticipants = new ArrayList();
        this.rect = new RectF();
        this.listViewBackgroundPaint = new Paint(1);
        this.oldParticipants = new ArrayList();
        this.oldVideoParticipants = new ArrayList();
        this.oldInvited = new ArrayList();
        this.oldShadyJoin = new ArrayList();
        this.oldShadyLeft = new ArrayList();
        this.windowInsetsStateHolder = new WindowInsetsStateHolder(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.checkInsets();
            }
        });
        this.muteButtonState = 0;
        this.animatingToFullscreenExpand = false;
        this.paint = new Paint(7);
        this.paintTmp = new Paint(7);
        this.states = new WeavingState[8];
        this.switchProgress = 1.0f;
        this.invalidateColors = true;
        this.colorsTmp = new int[4];
        this.attachedRenderers = new ArrayList();
        this.attachedRenderersTmp = new ArrayList();
        this.wasExpandBigSize = Boolean.TRUE;
        this.cellFlickerDrawable = new CellFlickerDrawable();
        this.statusIconPool = new ArrayList();
        this.onUserLeaveHintListener = new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.onUserLeaveHint();
            }
        };
        this.updateSchedeulRunnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity.1
            @Override // java.lang.Runnable
            public void run() {
                int i;
                if (GroupCallActivity.this.scheduleTimeTextView == null || GroupCallActivity.this.isDismissed()) {
                    return;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                ChatObject.Call call2 = groupCallActivity.call;
                if (call2 == null) {
                    i = groupCallActivity.scheduleStartAt;
                } else {
                    i = call2.call.schedule_date;
                }
                if (i == 0) {
                    return;
                }
                int currentTime = i - GroupCallActivity.this.accountInstance.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    GroupCallActivity.this.scheduleTimeTextView.setText(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]));
                } else {
                    GroupCallActivity.this.scheduleTimeTextView.setText(AndroidUtilities.formatFullDuration(Math.abs(currentTime)));
                    if (currentTime < 0 && GroupCallActivity.this.scheduleStartInTextView.getTag() == null) {
                        GroupCallActivity.this.scheduleStartInTextView.setTag(1);
                        GroupCallActivity.this.scheduleStartInTextView.setText(LocaleController.getString(R.string.VoipChatLateBy));
                    }
                }
                GroupCallActivity.this.scheduleStartAtTextView.setText(LocaleController.formatStartsTime(i, 3));
                AndroidUtilities.runOnUIThread(GroupCallActivity.this.updateSchedeulRunnable, 1000L);
            }
        };
        this.unmuteRunnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.lambda$new$0();
            }
        };
        this.pressRunnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.pressRunnableImpl();
            }
        };
        this.needTextureLightning = false;
        this.updateTextureLightningRunnable = new 2();
        this.visiblePeerIds = new LongSparseIntArray();
        this.gradientColors = new int[2];
        this.listViewVideoVisibility = true;
        this.invites = new String[2];
        this.popupAnimationIndex = -1;
        this.diffUtilsCallback = new DiffUtil.Callback() { // from class: org.telegram.ui.GroupCallActivity.65
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i, int i2) {
                return true;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return GroupCallActivity.this.oldCount;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return GroupCallActivity.this.listAdapter.rowsCount;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i, int i2) {
                if (GroupCallActivity.this.listAdapter.addMemberRow >= 0) {
                    if (i == GroupCallActivity.this.oldAddMemberRow && i2 == GroupCallActivity.this.listAdapter.addMemberRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldAddMemberRow && i2 != GroupCallActivity.this.listAdapter.addMemberRow) || (i != GroupCallActivity.this.oldAddMemberRow && i2 == GroupCallActivity.this.listAdapter.addMemberRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.conferenceAddPeopleRow >= 0) {
                    if (i == GroupCallActivity.this.oldConferenceAddPeopleRow && i2 == GroupCallActivity.this.listAdapter.conferenceAddPeopleRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldConferenceAddPeopleRow && i2 != GroupCallActivity.this.listAdapter.conferenceAddPeopleRow) || (i != GroupCallActivity.this.oldConferenceAddPeopleRow && i2 == GroupCallActivity.this.listAdapter.conferenceAddPeopleRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.conferenceShareLinkRow >= 0) {
                    if (i == GroupCallActivity.this.oldConferenceShareLinkRow && i2 == GroupCallActivity.this.listAdapter.conferenceShareLinkRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldConferenceShareLinkRow && i2 != GroupCallActivity.this.listAdapter.conferenceShareLinkRow) || (i != GroupCallActivity.this.oldConferenceShareLinkRow && i2 == GroupCallActivity.this.listAdapter.conferenceShareLinkRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.encryptionRow >= 0) {
                    if (i == GroupCallActivity.this.oldEncryptionRow && i2 == GroupCallActivity.this.listAdapter.encryptionRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldEncryptionRow && i2 != GroupCallActivity.this.listAdapter.encryptionRow) || (i != GroupCallActivity.this.oldEncryptionRow && i2 == GroupCallActivity.this.listAdapter.encryptionRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.videoNotAvailableRow >= 0) {
                    if (i == GroupCallActivity.this.oldVideoNotAvailableRow && i2 == GroupCallActivity.this.listAdapter.videoNotAvailableRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldVideoNotAvailableRow && i2 != GroupCallActivity.this.listAdapter.videoNotAvailableRow) || (i != GroupCallActivity.this.oldVideoNotAvailableRow && i2 == GroupCallActivity.this.listAdapter.videoNotAvailableRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.videoGridDividerRow >= 0 && GroupCallActivity.this.listAdapter.videoGridDividerRow == i2 && i == GroupCallActivity.this.oldVideoDividerRow) {
                    return true;
                }
                if (i == GroupCallActivity.this.oldCount - 1 && i2 == GroupCallActivity.this.listAdapter.rowsCount - 1) {
                    return true;
                }
                if (i != GroupCallActivity.this.oldCount - 1 && i2 != GroupCallActivity.this.listAdapter.rowsCount - 1) {
                    if (i2 >= GroupCallActivity.this.listAdapter.usersVideoGridStartRow && i2 < GroupCallActivity.this.listAdapter.usersVideoGridEndRow && i >= GroupCallActivity.this.oldUsersVideoStartRow && i < GroupCallActivity.this.oldUsersVideoEndRow) {
                        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i - GroupCallActivity.this.oldUsersVideoStartRow);
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        return videoParticipant.equals((ChatObject.VideoParticipant) groupCallActivity.visibleVideoParticipants.get(i2 - groupCallActivity.listAdapter.usersVideoGridStartRow));
                    }
                    if (i2 >= GroupCallActivity.this.listAdapter.usersStartRow && i2 < GroupCallActivity.this.listAdapter.usersEndRow && i >= GroupCallActivity.this.oldUsersStartRow && i < GroupCallActivity.this.oldUsersEndRow) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) GroupCallActivity.this.oldParticipants.get(i - GroupCallActivity.this.oldUsersStartRow);
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        if (MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(groupCallActivity2.call.visibleParticipants.get(i2 - groupCallActivity2.listAdapter.usersStartRow).peer)) {
                            return i == i2 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date);
                        }
                        return false;
                    }
                    if (i2 >= GroupCallActivity.this.listAdapter.invitedStartRow && i2 < GroupCallActivity.this.listAdapter.invitedEndRow && i >= GroupCallActivity.this.oldInvitedStartRow && i < GroupCallActivity.this.oldInvitedEndRow) {
                        Long l = (Long) GroupCallActivity.this.oldInvited.get(i - GroupCallActivity.this.oldInvitedStartRow);
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        return l.equals(groupCallActivity3.call.invitedUsers.get(i2 - groupCallActivity3.listAdapter.invitedStartRow));
                    }
                    if (i2 >= GroupCallActivity.this.listAdapter.shadyJoinStartRow && i2 < GroupCallActivity.this.listAdapter.shadyJoinEndRow && i >= GroupCallActivity.this.oldShadyJoinStartRow && i < GroupCallActivity.this.oldShadyJoinEndRow) {
                        Long l2 = (Long) GroupCallActivity.this.oldShadyJoin.get(i - GroupCallActivity.this.oldShadyJoinStartRow);
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        return l2.equals(groupCallActivity4.call.shadyJoinParticipants.get(i2 - groupCallActivity4.listAdapter.shadyJoinStartRow));
                    }
                    if (i2 >= GroupCallActivity.this.listAdapter.shadyLeftStartRow && i2 < GroupCallActivity.this.listAdapter.shadyLeftEndRow && i >= GroupCallActivity.this.oldShadyLeftStartRow && i < GroupCallActivity.this.oldShadyLeftEndRow) {
                        Long l3 = (Long) GroupCallActivity.this.oldShadyLeft.get(i - GroupCallActivity.this.oldShadyLeftStartRow);
                        GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                        return l3.equals(groupCallActivity5.call.shadyLeftParticipants.get(i2 - groupCallActivity5.listAdapter.shadyLeftStartRow));
                    }
                }
                return false;
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.animatorHideButtons = new BoolAnimator(2, this, cubicBezierInterpolator, 350L);
        this.animatorMessageIsEmpty = new BoolAnimator(3, this, cubicBezierInterpolator, 220L, true);
        this.animatorMessageInputHeight = new FactorAnimator(4, this, cubicBezierInterpolator, 350L);
        this.animatorHasVideo = new BoolAnimator(5, this, cubicBezierInterpolator, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.accountInstance = accountInstance;
        this.call = call;
        this.schedulePeer = inputPeer;
        this.currentChat = chat;
        this.scheduledHash = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.scheduleHasFewPeers = z;
        this.resourcesProvider = new DarkBlueThemeResourcesProvider();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.maxGroupCallMessageLength = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        isTabletMode = false;
        isLandscapeMode = false;
        paused = false;
        setDelegate(new BottomSheet.BottomSheetDelegateInterface() { // from class: org.telegram.ui.GroupCallActivity.3
            @Override // org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegateInterface
            public boolean canDismiss() {
                return true;
            }

            @Override // org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegateInterface
            public void onOpenAnimationEnd() {
                CountDownLatch groupCallBottomSheetLatch;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
                    groupCallBottomSheetLatch.countDown();
                }
                if (GroupCallActivity.this.muteButtonState == 6) {
                    GroupCallActivity.this.showReminderHint();
                }
            }
        });
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.scrimPaint = new Paint() { // from class: org.telegram.ui.GroupCallActivity.4
            @Override // android.graphics.Paint
            public void setAlpha(int i) {
                super.setAlpha(i);
                if (((BottomSheet) GroupCallActivity.this).containerView != null) {
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }
            }
        };
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda30
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$new$9(dialogInterface);
            }
        });
        setDimBehindAlpha(75);
        ListAdapter listAdapter = new ListAdapter(activity);
        this.listAdapter = listAdapter;
        final RecordStatusDrawable recordStatusDrawable = new RecordStatusDrawable(true);
        int i = Theme.key_voipgroup_speakingText;
        recordStatusDrawable.setColor(Theme.getColor(i));
        recordStatusDrawable.start();
        ActionBar actionBar = new ActionBar(activity) { // from class: org.telegram.ui.GroupCallActivity.5
            @Override // android.view.View
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }
            }

            @Override // org.telegram.ui.ActionBar.ActionBar, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (getAdditionalSubtitleTextView().getVisibility() == 0) {
                    canvas.save();
                    canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
                    recordStatusDrawable.setAlpha((int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f));
                    recordStatusDrawable.draw(canvas);
                    canvas.restore();
                    invalidate();
                }
            }
        };
        this.actionBar = actionBar;
        actionBar.setSubtitle("");
        actionBar.getSubtitleTextView().setVisibility(0);
        actionBar.createAdditionalSubtitleTextView();
        actionBar.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(actionBar.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle, 1.0f, false);
        actionBar.getAdditionalSubtitleTextView().setTextColor(Theme.getColor(i));
        int i2 = Theme.key_voipgroup_lastSeenTextUnscrolled;
        actionBar.setSubtitleColor(Theme.getColor(i2));
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setOccupyStatusBar(false);
        actionBar.setAllowOverlayTitle(false);
        int i3 = Theme.key_voipgroup_actionBarItems;
        actionBar.setItemsColor(Theme.getColor(i3), false);
        actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        actionBar.setTitleColor(Theme.getColor(i3));
        actionBar.setSubtitleColor(Theme.getColor(i2));
        actionBar.setActionBarMenuOnItemClick(new 6(activity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.selfPeer = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
            inputPeer2 = groupCallPeer;
        } else {
            inputPeer2 = groupCallPeer;
            if (inputPeer2 instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.selfPeer = tL_peerChannel;
                tL_peerChannel.channel_id = inputPeer2.channel_id;
            } else if (inputPeer2 instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.selfPeer = tL_peerUser2;
                tL_peerUser2.user_id = inputPeer2.user_id;
            } else if (inputPeer2 instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.selfPeer = tL_peerChat;
                tL_peerChat.chat_id = inputPeer2.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new NativeInstance.AudioLevelsCallback() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda31
            @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
            public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
                GroupCallActivity.this.lambda$new$10(iArr, fArr, zArr);
            }
        };
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.shadowDrawable = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i4 = R.raw.voip_filled;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, "" + i4, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.bigMicDrawable = rLottieDrawable;
        int i5 = R.raw.hand_2;
        this.handDrawables = new RLottieDrawable(i5, "" + i5, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(activity) { // from class: org.telegram.ui.GroupCallActivity.7
            private int lastSize;
            boolean localHasVideo;
            private boolean updateRenderers;
            boolean wasLayout;
            private boolean ignoreLayout = false;
            private RectF rect = new RectF();
            HashMap listCells = new HashMap();

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                GroupCallActivity.this.reactionEffectImageReceiver.onAttachedToWindow();
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                GroupCallActivity.this.reactionEffectImageReceiver.onDetachedFromWindow();
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i6, int i7) {
                int dp;
                int i8;
                int size = View.MeasureSpec.getSize(i7);
                this.ignoreLayout = true;
                boolean z2 = View.MeasureSpec.getSize(i6) > size && !AndroidUtilities.isTablet();
                GroupCallActivity.this.renderersContainer.listWidth = View.MeasureSpec.getSize(i6);
                boolean z3 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i6) > size && !GroupCallActivity.this.isRtmpStream();
                if (GroupCallActivity.isLandscapeMode != z2) {
                    GroupCallActivity.isLandscapeMode = z2;
                    if (GroupCallActivity.this.muteButton.getMeasuredWidth() == 0) {
                        int i9 = GroupCallActivity.this.muteButton.getLayoutParams().width;
                    }
                    GroupCallActivity.this.invalidateLayoutFullscreen();
                    GroupCallActivity.this.layoutManager.setSpanCount(GroupCallActivity.isLandscapeMode ? 6 : 2);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    this.updateRenderers = true;
                    if (GroupCallActivity.this.scheduleInfoTextView != null) {
                        GroupCallActivity.this.scheduleInfoTextView.setVisibility(!GroupCallActivity.isLandscapeMode ? 0 : 8);
                    }
                    if (GroupCallActivity.this.isRtmpLandscapeMode() == z2 && GroupCallActivity.this.isRtmpStream() && !GroupCallActivity.this.renderersContainer.inFullscreenMode && !GroupCallActivity.this.call.visibleVideoParticipants.isEmpty()) {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.fullscreenFor(groupCallActivity.call.visibleVideoParticipants.get(0));
                        GroupCallActivity.this.renderersContainer.delayHideUi();
                    }
                }
                if (GroupCallActivity.isTabletMode != z3) {
                    GroupCallActivity.isTabletMode = z3;
                    GroupCallActivity.this.tabletVideoGridView.setVisibility(z3 ? 0 : 8);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    this.updateRenderers = true;
                }
                if (this.updateRenderers) {
                    GroupCallActivity.this.applyCallParticipantUpdates(true);
                    GroupCallActivity.this.listAdapter.notifyDataSetChanged();
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.fullscreenAdapter.update(false, groupCallActivity2.tabletVideoGridView);
                    if (GroupCallActivity.isTabletMode) {
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        groupCallActivity3.tabletGridAdapter.update(false, groupCallActivity3.tabletVideoGridView);
                    }
                    GroupCallActivity.this.tabletVideoGridView.setVisibility(GroupCallActivity.isTabletMode ? 0 : 8);
                    GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                    groupCallActivity4.tabletGridAdapter.setVisibility(groupCallActivity4.tabletVideoGridView, GroupCallActivity.isTabletMode && !groupCallActivity4.renderersContainer.inFullscreenMode, true);
                    GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                    groupCallActivity5.listViewVideoVisibility = !GroupCallActivity.isTabletMode || groupCallActivity5.renderersContainer.inFullscreenMode;
                    boolean z4 = !GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.inFullscreenMode;
                    GroupCallActivity groupCallActivity6 = GroupCallActivity.this;
                    groupCallActivity6.fullscreenAdapter.setVisibility(groupCallActivity6.fullscreenUsersListView, z4);
                    GroupCallActivity.this.fullscreenUsersListView.setVisibility(z4 ? 0 : 8);
                    GroupCallActivity.this.listView.setVisibility((GroupCallActivity.isTabletMode || !GroupCallActivity.this.renderersContainer.inFullscreenMode) ? 0 : 8);
                    GroupCallActivity.this.layoutManager.setSpanCount(GroupCallActivity.isLandscapeMode ? 6 : 2);
                    GroupCallActivity.this.updateState(false, false);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
                    this.updateRenderers = false;
                    GroupCallActivity.this.attachedRenderersTmp.clear();
                    GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                    GroupCallActivity.this.renderersContainer.setIsTablet(GroupCallActivity.isTabletMode);
                    for (int i10 = 0; i10 < GroupCallActivity.this.attachedRenderersTmp.size(); i10++) {
                        ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i10)).updateAttachState(true);
                    }
                }
                int paddingTop = size - getPaddingTop();
                if (GroupCallActivity.this.isRtmpStream()) {
                    dp = AndroidUtilities.dp(72.0f);
                } else {
                    dp = AndroidUtilities.dp(245.0f);
                }
                int i11 = paddingTop - dp;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) GroupCallActivity.this.renderersContainer.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams.topMargin = ActionBar.getCurrentActionBarHeight();
                } else {
                    layoutParams.topMargin = 0;
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) GroupCallActivity.this.undoView[i12].getLayoutParams();
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
                    }
                }
                RecyclerListView recyclerListView = GroupCallActivity.this.tabletVideoGridView;
                if (recyclerListView != null) {
                    ((FrameLayout.LayoutParams) recyclerListView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                }
                if (GroupCallActivity.this.callMessageEnterView.getEmojiView() != null) {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.callMessageEnterView.getEmojiView().getLayoutParams()).gravity = 80;
                }
                int dp2 = AndroidUtilities.dp(GroupCallActivity.this.isRtmpStream() ? 40.0f : 90.0f);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) GroupCallActivity.this.listView.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams3.gravity = GroupCallActivity.this.hasVideo ? 5 : 1;
                    layoutParams3.width = AndroidUtilities.dp(320.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    layoutParams3.leftMargin = dp3;
                    layoutParams3.rightMargin = dp3;
                    layoutParams3.bottomMargin = dp2;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    i8 = AndroidUtilities.dp(60.0f);
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                    layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                    layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                    i8 = 0;
                } else {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    int dp4 = AndroidUtilities.dp(60.0f);
                    layoutParams3.bottomMargin = dp2;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(14.0f);
                    int dp5 = AndroidUtilities.dp(14.0f);
                    layoutParams3.leftMargin = dp5;
                    layoutParams3.rightMargin = dp5;
                    i8 = dp4;
                }
                if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsBackgroundGradientView.getLayoutParams();
                    layoutParams4.bottomMargin = dp2;
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams4.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                        layoutParams4.width = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams4.width = -1;
                    }
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsBackgroundGradientView2.getLayoutParams();
                    layoutParams5.height = dp2;
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams5.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                        layoutParams5.width = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams5.width = -1;
                    }
                } else {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setVisibility(8);
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(8);
                }
                if (GroupCallActivity.isLandscapeMode) {
                    GroupCallActivity.this.fullscreenUsersListView.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
                } else {
                    GroupCallActivity.this.fullscreenUsersListView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsContainer.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams6.width = AndroidUtilities.dp(320.0f);
                    layoutParams6.height = AndroidUtilities.dp(120.0f);
                    layoutParams6.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                    layoutParams6.rightMargin = 0;
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams6.width = AndroidUtilities.dp(90.0f);
                    layoutParams6.height = -1;
                    layoutParams6.gravity = 53;
                } else {
                    layoutParams6.width = -1;
                    layoutParams6.height = AndroidUtilities.dp(120.0f);
                    layoutParams6.gravity = 81;
                    layoutParams6.rightMargin = 0;
                }
                if (GroupCallActivity.isLandscapeMode && !GroupCallActivity.isTabletMode) {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBar.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.menuItemsContainer.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarBackground.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarShadow.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                } else {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBar.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.menuItemsContainer.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarBackground.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarShadow.getLayoutParams()).rightMargin = 0;
                }
                FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) GroupCallActivity.this.fullscreenUsersListView.getLayoutParams();
                if (GroupCallActivity.isLandscapeMode) {
                    if (((LinearLayoutManager) GroupCallActivity.this.fullscreenUsersListView.getLayoutManager()).getOrientation() != 1) {
                        ((LinearLayoutManager) GroupCallActivity.this.fullscreenUsersListView.getLayoutManager()).setOrientation(1);
                    }
                    layoutParams7.height = -1;
                    layoutParams7.width = AndroidUtilities.dp(80.0f);
                    layoutParams7.gravity = 53;
                    layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
                    layoutParams7.bottomMargin = 0;
                } else {
                    if (((LinearLayoutManager) GroupCallActivity.this.fullscreenUsersListView.getLayoutManager()).getOrientation() != 0) {
                        ((LinearLayoutManager) GroupCallActivity.this.fullscreenUsersListView.getLayoutManager()).setOrientation(0);
                    }
                    layoutParams7.height = AndroidUtilities.dp(80.0f);
                    layoutParams7.width = -1;
                    layoutParams7.gravity = 80;
                    layoutParams7.rightMargin = 0;
                    layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
                }
                ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                GroupCallActivity.this.callMessageEnterUnderContainer.invalidate();
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) GroupCallActivity.this.callMessageEnterUnderContainer.getLayoutParams();
                layoutParams8.height = size;
                layoutParams8.topMargin = -getPaddingTop();
                if (GroupCallActivity.this.callMessageEnterView.getEmojiView() != null) {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.callMessageEnterView.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
                }
                int max = GroupCallActivity.isTabletMode ? 0 : Math.max(0, (i11 - Math.max(AndroidUtilities.dp(259.0f), (i11 / 5) * 3)) + AndroidUtilities.dp(8.0f));
                if (GroupCallActivity.this.listView.getPaddingTop() != max || GroupCallActivity.this.listView.getPaddingBottom() != i8) {
                    GroupCallActivity.this.listView.setPadding(0, max, 0, i8);
                }
                if (GroupCallActivity.this.watchersView != null) {
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) GroupCallActivity.this.watchersView.getLayoutParams();
                    GroupCallGridCell findGroupCallGridCell = GroupCallActivity.this.findGroupCallGridCell();
                    if (findGroupCallGridCell != null) {
                        int top = (GroupCallActivity.this.buttonsContainer.getTop() + (GroupCallActivity.this.buttonsContainer.getMeasuredHeight() / 2)) - (GroupCallActivity.this.leaveButton.getMeasuredHeight() / 2);
                        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + max + findGroupCallGridCell.getMeasuredHeight();
                        layoutParams9.topMargin = (currentActionBarHeight + ((top - currentActionBarHeight) / 2)) - AndroidUtilities.dp(32.0f);
                        layoutParams9.height = AndroidUtilities.dp(70.0f);
                    }
                }
                if (GroupCallActivity.this.textureLightningView != null) {
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) GroupCallActivity.this.textureLightningView.getLayoutParams();
                    GroupCallGridCell findGroupCallGridCell2 = GroupCallActivity.this.findGroupCallGridCell();
                    if (findGroupCallGridCell2 != null) {
                        layoutParams10.height = findGroupCallGridCell2.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                        layoutParams10.width = findGroupCallGridCell2.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                        int dp6 = AndroidUtilities.dp(16.0f);
                        layoutParams10.leftMargin = dp6;
                        layoutParams10.rightMargin = dp6;
                    }
                }
                if (GroupCallActivity.this.scheduleStartAtTextView != null) {
                    int dp7 = max + (((i11 - max) + AndroidUtilities.dp(60.0f)) / 2);
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartInTextView.getLayoutParams();
                    layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
                    FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartAtTextView.getLayoutParams();
                    layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
                    FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleTimeTextView.getLayoutParams();
                    if (layoutParams11.topMargin < ActionBar.getCurrentActionBarHeight() || layoutParams12.topMargin + AndroidUtilities.dp(20.0f) > size - AndroidUtilities.dp(231.0f)) {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(4);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(4);
                        layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
                    } else {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(0);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(0);
                        layoutParams13.topMargin = dp7;
                    }
                }
                for (int i13 = 0; i13 < GroupCallActivity.this.attachedRenderers.size(); i13++) {
                    ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i13)).setFullscreenMode(GroupCallActivity.this.renderersContainer.inFullscreenMode, true);
                }
                this.ignoreLayout = false;
                super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
                if (measuredHeight != this.lastSize) {
                    this.lastSize = measuredHeight;
                    GroupCallActivity.this.dismissAvatarPreview(false);
                }
                GroupCallActivity.this.cellFlickerDrawable.setParentWidth(getMeasuredWidth());
                GroupCallActivity.this.checkGroupCallUiPositions_MessagesList();
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z2, int i6, int i7, int i8, int i9) {
                float f;
                boolean z3;
                if (GroupCallActivity.isTabletMode && this.localHasVideo != GroupCallActivity.this.hasVideo && this.wasLayout) {
                    f = GroupCallActivity.this.listView.getX();
                    z3 = true;
                } else {
                    f = 0.0f;
                    z3 = false;
                }
                this.localHasVideo = GroupCallActivity.this.hasVideo;
                GroupCallActivity.this.renderersContainer.inLayout = true;
                super.onLayout(z2, i6, i7, i8, i9);
                GroupCallActivity.this.renderersContainer.inLayout = false;
                GroupCallActivity.this.updateLayout(false);
                this.wasLayout = true;
                if (!z3 || GroupCallActivity.this.listView.getLeft() == f) {
                    return;
                }
                float left = f - GroupCallActivity.this.listView.getLeft();
                GroupCallActivity.this.listView.setTranslationX(left);
                GroupCallActivity.this.buttonsContainer.setTranslationX(left);
                GroupCallActivity.this.buttonsBackgroundGradientView.setTranslationX(left);
                GroupCallActivity.this.buttonsBackgroundGradientView2.setTranslationX(left);
                ViewPropertyAnimator duration = GroupCallActivity.this.listView.animate().translationX(0.0f).setDuration(350L);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator2).start();
                GroupCallActivity.this.buttonsBackgroundGradientView.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
                GroupCallActivity.this.buttonsBackgroundGradientView2.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
                GroupCallActivity.this.buttonsContainer.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (GroupCallActivity.this.scrimView != null && motionEvent.getAction() == 0) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.rect.set(GroupCallActivity.this.scrimPopupLayout.getX(), GroupCallActivity.this.scrimPopupLayout.getY(), GroupCallActivity.this.scrimPopupLayout.getX() + GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth(), GroupCallActivity.this.scrimPopupLayout.getY() + GroupCallActivity.this.scrimPopupLayout.getMeasuredHeight());
                    boolean z2 = !this.rect.contains(x, y);
                    this.rect.set(GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY(), GroupCallActivity.this.avatarPreviewContainer.getX() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth(), GroupCallActivity.this.avatarPreviewContainer.getY() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth() + GroupCallActivity.this.scrimView.getMeasuredHeight());
                    if (this.rect.contains(x, y)) {
                        z2 = false;
                    }
                    if (z2) {
                        GroupCallActivity.this.dismissAvatarPreview(true);
                        return true;
                    }
                }
                if (motionEvent.getAction() == 0 && GroupCallActivity.this.scrollOffsetY != 0.0f && motionEvent.getY() < GroupCallActivity.this.scrollOffsetY - AndroidUtilities.dp(37.0f) && GroupCallActivity.this.actionBar.getAlpha() == 0.0f && !GroupCallActivity.this.avatarsPreviewShowed) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    if (groupCallActivity.previewDialog == null && !groupCallActivity.renderersContainer.inFullscreenMode) {
                        GroupCallActivity.this.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !GroupCallActivity.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override // android.view.View, android.view.ViewParent
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override // android.view.View
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                GroupCallActivity.this.updateTopBulletinY();
            }

            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                float f;
                int dp = AndroidUtilities.dp(74.0f);
                float f2 = GroupCallActivity.this.scrollOffsetY - dp;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(15.0f) + ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop;
                if (((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight()) {
                    float min = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f2) - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) / ((dp - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
                    int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - r0) * min);
                    f2 -= currentActionBarHeight;
                    measuredHeight += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                float paddingTop = f2 + getPaddingTop();
                GroupCallActivity.this.updateTopBulletinY();
                if (GroupCallActivity.this.renderersContainer.progressToFullscreenMode != 1.0f) {
                    GroupCallActivity.this.shadowDrawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), measuredHeight);
                    GroupCallActivity.this.shadowDrawable.draw(canvas);
                    if (f != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(GroupCallActivity.this.backgroundColor);
                        this.rect.set(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + paddingTop, getMeasuredWidth() - ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + paddingTop + AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                    }
                    Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) (GroupCallActivity.this.actionBar.getAlpha() * 255.0f), (int) (Color.red(GroupCallActivity.this.backgroundColor) * 0.8f), (int) (Color.green(GroupCallActivity.this.backgroundColor) * 0.8f), (int) (Color.blue(GroupCallActivity.this.backgroundColor) * 0.8f)));
                    canvas.drawRect(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, GroupCallActivity.this.getStatusBarHeight(), Theme.dialogs_onlineCirclePaint);
                    PrivateVideoPreviewDialog privateVideoPreviewDialog = GroupCallActivity.this.previewDialog;
                    if (privateVideoPreviewDialog != null) {
                        Theme.dialogs_onlineCirclePaint.setColor(privateVideoPreviewDialog.getBackgroundColor());
                        canvas.drawRect(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, GroupCallActivity.this.getStatusBarHeight(), Theme.dialogs_onlineCirclePaint);
                    }
                }
                if (GroupCallActivity.this.renderersContainer.progressToFullscreenMode != 0.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_actionBar), (int) (GroupCallActivity.this.renderersContainer.progressToFullscreenMode * 255.0f)));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_onlineCirclePaint);
                }
                if (GroupCallActivity.this.isRtmpStream() && LiteMode.isEnabled(512)) {
                    if (GroupCallActivity.this.renderersContainer.progressToFullscreenMode < 0.15d) {
                        if (!GroupCallActivity.this.needTextureLightning) {
                            GroupCallActivity.this.needTextureLightning = true;
                            GroupCallActivity.this.runUpdateTextureLightningRunnable();
                        }
                    } else if (GroupCallActivity.this.needTextureLightning) {
                        GroupCallActivity.this.needTextureLightning = false;
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.updateTextureLightningRunnable);
                    }
                }
                GroupCallActivity.this.reactionEffectImageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                GroupCallActivity.this.reactionEffectImageReceiver.draw(canvas);
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                int i6;
                float f;
                float f2;
                float f3;
                View view;
                GroupCallUserCell groupCallUserCell;
                float y;
                float left;
                GroupCallUserCell groupCallUserCell2;
                Path path;
                float[] fArr;
                GroupCallUserCell groupCallUserCell3;
                float f4;
                float left2;
                float f5;
                float f6;
                float f7;
                RecordingCanvas beginRecording;
                Shader.TileMode tileMode;
                RenderEffect createBlurEffect;
                RenderEffect createColorFilterEffect;
                RenderEffect createChainEffect;
                if (!GroupCallActivity.this.isInDrawRenderNodeBlur && !GroupCallActivity.this.drawingForBlur && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                    if (GroupCallActivity.this.renderNodeBlur == null) {
                        GroupCallActivity.this.renderNodeBlur = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("CallActivity.Blur");
                        GroupCallActivity.this.renderNodeBlurScale = SizeNotifierFrameLayout.getRenderNodeScale();
                        ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                        float blurRadius = SizeNotifierFrameLayout.getBlurRadius();
                        RenderNode renderNode = GroupCallActivity.this.renderNodeBlur;
                        tileMode = Shader.TileMode.DECAL;
                        createBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode);
                        createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                        createChainEffect = RenderEffect.createChainEffect(createBlurEffect, createColorFilterEffect);
                        renderNode.setRenderEffect(createChainEffect);
                        GroupCallActivity.this.groupCallMessagesListView.setBlurRoot(this);
                        GroupCallActivity.this.groupCallMessagesListView.setRenderNode(GroupCallActivity.this.renderNodeBlur, GroupCallActivity.this.renderNodeBlurScale);
                    }
                    int round = Math.round(getMeasuredWidth() / GroupCallActivity.this.renderNodeBlurScale);
                    int round2 = Math.round(getMeasuredHeight() / GroupCallActivity.this.renderNodeBlurScale);
                    GroupCallActivity.this.isInDrawRenderNodeBlur = true;
                    GroupCallActivity.this.renderNodeBlur.setPosition(0, 0, round, round2);
                    beginRecording = GroupCallActivity.this.renderNodeBlur.beginRecording();
                    beginRecording.scale(1.0f / GroupCallActivity.this.renderNodeBlurScale, 1.0f / GroupCallActivity.this.renderNodeBlurScale);
                    dispatchDraw(beginRecording);
                    GroupCallActivity.this.renderNodeBlur.endRecording();
                    GroupCallActivity.this.isInDrawRenderNodeBlur = false;
                }
                for (int i7 = 0; i7 < GroupCallActivity.this.listView.getChildCount(); i7++) {
                    View childAt = GroupCallActivity.this.listView.getChildAt(i7);
                    if (childAt instanceof GroupCallUserCell) {
                        ((GroupCallUserCell) childAt).setDrawAvatar(true);
                    }
                    if (!(childAt instanceof GroupCallGridCell)) {
                        if (childAt.getMeasuredWidth() != GroupCallActivity.this.listView.getMeasuredWidth()) {
                            childAt.setTranslationX((GroupCallActivity.this.listView.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                        } else {
                            childAt.setTranslationX(0.0f);
                        }
                    }
                }
                if (GroupCallActivity.this.renderersContainer.isAnimating()) {
                    if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() == 0) {
                        this.listCells.clear();
                        for (int i8 = 0; i8 < GroupCallActivity.this.listView.getChildCount(); i8++) {
                            View childAt2 = GroupCallActivity.this.listView.getChildAt(i8);
                            if (childAt2.isAttachedToWindow()) {
                                if ((childAt2 instanceof GroupCallGridCell) && GroupCallActivity.this.listView.getChildAdapterPosition(childAt2) >= 0) {
                                    GroupCallGridCell groupCallGridCell = (GroupCallGridCell) childAt2;
                                    if (groupCallGridCell.getRenderer() != GroupCallActivity.this.renderersContainer.fullscreenTextureView) {
                                        this.listCells.put(groupCallGridCell.getParticipant(), childAt2);
                                    }
                                } else if ((childAt2 instanceof GroupCallUserCell) && GroupCallActivity.this.listView.getChildAdapterPosition(childAt2) >= 0) {
                                    GroupCallUserCell groupCallUserCell4 = (GroupCallUserCell) childAt2;
                                    this.listCells.put(groupCallUserCell4.getParticipant(), groupCallUserCell4);
                                }
                            }
                        }
                        for (int i9 = 0; i9 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i9++) {
                            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell5 = (GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i9);
                            View view2 = (View) this.listCells.get(groupCallUserCell5.getVideoParticipant());
                            if (view2 == null) {
                                view2 = (View) this.listCells.get(groupCallUserCell5.getParticipant());
                            }
                            float f8 = GroupCallActivity.this.renderersContainer.progressToFullscreenMode;
                            if (!GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                                groupCallUserCell5.setAlpha(1.0f);
                            }
                            if (view2 != null) {
                                if (!(view2 instanceof GroupCallGridCell)) {
                                    left2 = ((r3.getLeft() + GroupCallActivity.this.listView.getX()) - GroupCallActivity.this.renderersContainer.getLeft()) + r3.getAvatarImageView().getLeft() + (r3.getAvatarImageView().getMeasuredWidth() >> 1);
                                    float top = ((r3.getTop() + GroupCallActivity.this.listView.getY()) - GroupCallActivity.this.renderersContainer.getTop()) + r3.getAvatarImageView().getTop() + (r3.getAvatarImageView().getMeasuredHeight() >> 1);
                                    float left3 = groupCallUserCell5.getLeft() + GroupCallActivity.this.fullscreenUsersListView.getX() + (groupCallUserCell5.getMeasuredWidth() >> 1);
                                    float top2 = groupCallUserCell5.getTop() + GroupCallActivity.this.fullscreenUsersListView.getY() + (groupCallUserCell5.getMeasuredHeight() >> 1);
                                    ((GroupCallUserCell) view2).setDrawAvatar(false);
                                    f5 = top;
                                    f6 = left3;
                                    f7 = top2;
                                } else {
                                    GroupCallGridCell groupCallGridCell2 = (GroupCallGridCell) view2;
                                    left2 = (groupCallGridCell2.getLeft() + GroupCallActivity.this.listView.getX()) - GroupCallActivity.this.renderersContainer.getLeft();
                                    f5 = (groupCallGridCell2.getTop() + GroupCallActivity.this.listView.getY()) - GroupCallActivity.this.renderersContainer.getTop();
                                    f6 = groupCallUserCell5.getLeft() + GroupCallActivity.this.fullscreenUsersListView.getX();
                                    f7 = groupCallUserCell5.getTop() + GroupCallActivity.this.fullscreenUsersListView.getY();
                                }
                                float f9 = left2 - f6;
                                float f10 = 1.0f - f8;
                                groupCallUserCell5.setTranslationX(f9 * f10);
                                groupCallUserCell5.setTranslationY((f5 - f7) * f10);
                                groupCallUserCell5.setScaleX(1.0f);
                                groupCallUserCell5.setScaleY(1.0f);
                                groupCallUserCell5.setProgressToFullscreen(f8);
                            } else {
                                groupCallUserCell5.setScaleX(1.0f);
                                groupCallUserCell5.setScaleY(1.0f);
                                groupCallUserCell5.setTranslationX(0.0f);
                                groupCallUserCell5.setTranslationY(0.0f);
                                groupCallUserCell5.setProgressToFullscreen(1.0f);
                                if (groupCallUserCell5.getRenderer() == null) {
                                    groupCallUserCell5.setAlpha(f8);
                                }
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i10++) {
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i10)).setProgressToFullscreen(1.0f);
                    }
                }
                for (int i11 = 0; i11 < GroupCallActivity.this.attachedRenderers.size(); i11++) {
                    GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i11);
                    RecyclerListView recyclerListView = GroupCallActivity.this.listView;
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallMiniTextureView.updatePosition(recyclerListView, groupCallActivity.tabletVideoGridView, groupCallActivity.fullscreenUsersListView, groupCallActivity.renderersContainer);
                }
                if (!GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                } else {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setAlpha(1.0f);
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setAlpha(1.0f);
                }
                if (GroupCallActivity.this.renderersContainer.swipedBack) {
                    GroupCallActivity.this.listView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                } else {
                    GroupCallActivity.this.listView.setAlpha(1.0f);
                }
                if (GroupCallActivity.this.watchersView != null) {
                    GroupCallActivity.this.watchersView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                    GroupCallActivity.this.watchersView.setTranslationY(GroupCallActivity.this.renderersContainer.progressToFullscreenMode * AndroidUtilities.dp(64.0f));
                }
                super.dispatchDraw(canvas);
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.drawingForBlur) {
                    return;
                }
                if (groupCallActivity2.avatarsPreviewShowed) {
                    if (GroupCallActivity.this.scrimView != null) {
                        if (!GroupCallActivity.this.useBlur) {
                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                        }
                        float y2 = GroupCallActivity.this.listView.getY();
                        float[] fArr2 = new float[8];
                        Path path2 = new Path();
                        int childCount = GroupCallActivity.this.listView.getChildCount();
                        float y3 = GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight();
                        if (GroupCallActivity.this.hasScrimAnchorView) {
                            int i12 = 0;
                            while (true) {
                                if (i12 >= childCount) {
                                    groupCallUserCell = null;
                                    break;
                                } else {
                                    if (GroupCallActivity.this.listView.getChildAt(i12) == GroupCallActivity.this.scrimView) {
                                        groupCallUserCell = GroupCallActivity.this.scrimView;
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        } else {
                            groupCallUserCell = GroupCallActivity.this.scrimView;
                        }
                        GroupCallUserCell groupCallUserCell6 = groupCallUserCell;
                        if (groupCallUserCell6 != null && y2 < y3) {
                            canvas.save();
                            if (GroupCallActivity.this.scrimFullscreenView == null) {
                                canvas.clipRect(0.0f, (1.0f - GroupCallActivity.this.progressToAvatarPreview) * y2, getMeasuredWidth(), ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * y3) + (getMeasuredHeight() * GroupCallActivity.this.progressToAvatarPreview));
                            }
                            if (!GroupCallActivity.this.hasScrimAnchorView) {
                                y = GroupCallActivity.this.avatarPreviewContainer.getTop() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth();
                                left = GroupCallActivity.this.avatarPreviewContainer.getLeft();
                            } else {
                                y = ((GroupCallActivity.this.listView.getY() + groupCallUserCell6.getY()) * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + ((GroupCallActivity.this.avatarPreviewContainer.getTop() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth()) * GroupCallActivity.this.progressToAvatarPreview);
                                left = ((GroupCallActivity.this.listView.getLeft() + groupCallUserCell6.getX()) * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + (GroupCallActivity.this.avatarPreviewContainer.getLeft() * GroupCallActivity.this.progressToAvatarPreview);
                            }
                            float f11 = y;
                            canvas.translate(left, f11);
                            if (!GroupCallActivity.this.hasScrimAnchorView) {
                                groupCallUserCell2 = groupCallUserCell6;
                                path = path2;
                                fArr = fArr2;
                                canvas.saveLayerAlpha(0.0f, 0.0f, groupCallUserCell6.getMeasuredWidth(), groupCallUserCell6.getClipHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * 255.0f), 31);
                            } else {
                                groupCallUserCell2 = groupCallUserCell6;
                                path = path2;
                                fArr = fArr2;
                                canvas.save();
                            }
                            float measuredHeight = (int) (groupCallUserCell2.getMeasuredHeight() + ((groupCallUserCell2.getClipHeight() - groupCallUserCell2.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - GroupCallActivity.this.progressToAvatarPreview))));
                            this.rect.set(0.0f, 0.0f, groupCallUserCell2.getMeasuredWidth(), measuredHeight);
                            if (GroupCallActivity.this.hasScrimAnchorView) {
                                f4 = GroupCallActivity.this.progressToAvatarPreview;
                                groupCallUserCell3 = groupCallUserCell2;
                            } else {
                                groupCallUserCell3 = groupCallUserCell2;
                                f4 = 1.0f;
                            }
                            groupCallUserCell3.setProgressToAvatarPreview(f4);
                            for (int i13 = 0; i13 < 4; i13++) {
                                fArr[i13] = AndroidUtilities.dp(13.0f) * (1.0f - GroupCallActivity.this.progressToAvatarPreview);
                                fArr[i13 + 4] = AndroidUtilities.dp(13.0f);
                            }
                            path.reset();
                            Path path3 = path;
                            path3.addRoundRect(this.rect, fArr, Path.Direction.CW);
                            path3.close();
                            canvas.drawPath(path3, GroupCallActivity.this.listViewBackgroundPaint);
                            groupCallUserCell3.draw(canvas);
                            canvas.restore();
                            canvas.restore();
                            if (GroupCallActivity.this.scrimPopupLayout != null) {
                                float f12 = f11 + measuredHeight;
                                float measuredWidth = (getMeasuredWidth() - GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                                    canvas.saveLayerAlpha(measuredWidth, f12, measuredWidth + GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth(), f12 + GroupCallActivity.this.scrimPopupLayout.getMeasuredHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * 255.0f), 31);
                                } else {
                                    canvas.save();
                                }
                                GroupCallActivity.this.scrimPopupLayout.setTranslationX(measuredWidth - GroupCallActivity.this.scrimPopupLayout.getLeft());
                                GroupCallActivity.this.scrimPopupLayout.setTranslationY(f12 - GroupCallActivity.this.scrimPopupLayout.getTop());
                                float f13 = (GroupCallActivity.this.progressToAvatarPreview * 0.2f) + 0.8f;
                                canvas.scale(f13, f13, (GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth() / 2.0f) + measuredWidth, f12);
                                canvas.translate(measuredWidth, f12);
                                GroupCallActivity.this.scrimPopupLayout.draw(canvas);
                                canvas.restore();
                            }
                        }
                        if (GroupCallActivity.this.pinchToZoomHelper.isInOverlayMode()) {
                            return;
                        }
                        canvas.save();
                        if (GroupCallActivity.this.hasScrimAnchorView && GroupCallActivity.this.scrimFullscreenView == null) {
                            canvas.clipRect(0.0f, (1.0f - GroupCallActivity.this.progressToAvatarPreview) * y2, getMeasuredWidth(), (y3 * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + (getMeasuredHeight() * GroupCallActivity.this.progressToAvatarPreview));
                        }
                        canvas.scale(GroupCallActivity.this.avatarPreviewContainer.getScaleX(), GroupCallActivity.this.avatarPreviewContainer.getScaleY(), GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY());
                        canvas.translate(GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY());
                        GroupCallActivity.this.avatarPreviewContainer.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    return;
                }
                if (GroupCallActivity.this.scrimView != null) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                    float y4 = GroupCallActivity.this.listView.getY();
                    GroupCallActivity.this.listView.getY();
                    GroupCallActivity.this.listView.getMeasuredHeight();
                    if (GroupCallActivity.this.hasScrimAnchorView) {
                        int childCount2 = GroupCallActivity.this.listView.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt3 = GroupCallActivity.this.listView.getChildAt(i14);
                            if (childAt3 != GroupCallActivity.this.scrimView) {
                                i6 = 1;
                            } else {
                                float max = Math.max(GroupCallActivity.this.listView.getLeft(), GroupCallActivity.this.listView.getLeft() + childAt3.getX());
                                float max2 = Math.max(y4, GroupCallActivity.this.listView.getY() + childAt3.getY());
                                float min = Math.min(GroupCallActivity.this.listView.getRight(), GroupCallActivity.this.listView.getLeft() + childAt3.getX() + childAt3.getMeasuredWidth());
                                float min2 = Math.min(GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight(), GroupCallActivity.this.listView.getY() + childAt3.getY() + GroupCallActivity.this.scrimView.getClipHeight());
                                if (max2 < min2) {
                                    if (childAt3.getAlpha() != 1.0f) {
                                        f = min;
                                        f2 = max2;
                                        f3 = max;
                                        view = childAt3;
                                        canvas.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                                    } else {
                                        f = min;
                                        f2 = max2;
                                        f3 = max;
                                        view = childAt3;
                                        canvas.save();
                                    }
                                    canvas.clipRect(f3, f2, f, getMeasuredHeight());
                                    canvas.translate(GroupCallActivity.this.listView.getLeft() + view.getX(), GroupCallActivity.this.listView.getY() + view.getY());
                                    this.rect.set(0.0f, 0.0f, view.getMeasuredWidth(), (int) (GroupCallActivity.this.scrimView.getMeasuredHeight() + ((GroupCallActivity.this.scrimView.getClipHeight() - GroupCallActivity.this.scrimView.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - r1)))));
                                    GroupCallActivity.this.scrimView.setAboutVisibleProgress(GroupCallActivity.this.listViewBackgroundPaint.getColor(), GroupCallActivity.this.scrimPaint.getAlpha() / 100.0f);
                                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), GroupCallActivity.this.listViewBackgroundPaint);
                                    view.draw(canvas);
                                    canvas.restore();
                                }
                                i6 = 1;
                            }
                            i14 += i6;
                        }
                        return;
                    }
                    if (GroupCallActivity.this.scrimFullscreenView == null) {
                        if (GroupCallActivity.this.scrimRenderer == null || !GroupCallActivity.this.scrimRenderer.isAttached()) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(GroupCallActivity.this.scrimRenderer.getX() + GroupCallActivity.this.renderersContainer.getX(), GroupCallActivity.this.scrimRenderer.getY() + GroupCallActivity.this.renderersContainer.getY());
                        GroupCallActivity.this.scrimRenderer.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(GroupCallActivity.this.scrimFullscreenView.getX() + GroupCallActivity.this.fullscreenUsersListView.getX() + GroupCallActivity.this.renderersContainer.getX(), GroupCallActivity.this.scrimFullscreenView.getY() + GroupCallActivity.this.fullscreenUsersListView.getY() + GroupCallActivity.this.renderersContainer.getY());
                    if (GroupCallActivity.this.scrimFullscreenView.getRenderer() == null || !GroupCallActivity.this.scrimFullscreenView.getRenderer().isAttached() || GroupCallActivity.this.scrimFullscreenView.getRenderer().showingInFullscreen) {
                        GroupCallActivity.this.scrimFullscreenView.draw(canvas);
                    } else {
                        GroupCallActivity.this.scrimFullscreenView.getRenderer().draw(canvas);
                    }
                    GroupCallActivity.this.scrimFullscreenView.drawOverlays(canvas);
                    canvas.restore();
                }
            }

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (GroupCallActivity.this.isInDrawRenderNodeBlur) {
                    if (view == GroupCallActivity.this.listView) {
                        int childCount = GroupCallActivity.this.listView.getChildCount();
                        for (int i6 = 0; i6 < childCount; i6++) {
                            View childAt = GroupCallActivity.this.listView.getChildAt(i6);
                            if (childAt.getVisibility() == 0) {
                                canvas.save();
                                canvas.translate(childAt.getX(), childAt.getY());
                                childAt.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                    if (view == GroupCallActivity.this.renderersContainer || view == GroupCallActivity.this.buttonsContainer) {
                        return super.drawChild(canvas, view, j);
                    }
                    return true;
                }
                if (!GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.progressToFullscreenMode == 1.0f && (view == GroupCallActivity.this.actionBar || view == GroupCallActivity.this.actionBarShadow || view == GroupCallActivity.this.actionBarBackground || view == GroupCallActivity.this.titleTextView || view == GroupCallActivity.this.menuItemsContainer || view == GroupCallActivity.this.textureLightningView)) {
                    return true;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                if (!groupCallActivity.drawingForBlur || view != groupCallActivity.renderersContainer) {
                    if (view == GroupCallActivity.this.avatarPreviewContainer || view == GroupCallActivity.this.scrimPopupLayout || view == GroupCallActivity.this.scrimView) {
                        return true;
                    }
                    if (GroupCallActivity.this.contentFullyOverlayed && GroupCallActivity.this.useBlur && (view == GroupCallActivity.this.listView || view == GroupCallActivity.this.buttonsContainer || view == GroupCallActivity.this.groupCallMessagesListView)) {
                        return true;
                    }
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.translate(GroupCallActivity.this.renderersContainer.getX() + GroupCallActivity.this.fullscreenUsersListView.getX(), GroupCallActivity.this.renderersContainer.getY() + GroupCallActivity.this.fullscreenUsersListView.getY());
                GroupCallActivity.this.fullscreenUsersListView.draw(canvas);
                canvas.restore();
                return true;
            }

            @Override // android.view.View, android.view.KeyEvent.Callback
            public boolean onKeyDown(int i6, KeyEvent keyEvent) {
                if (GroupCallActivity.this.scrimView != null && i6 == 4) {
                    GroupCallActivity.this.dismissAvatarPreview(true);
                    return true;
                }
                return super.onKeyDown(i6, keyEvent);
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i6, 0, i6, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.reactionEffectImageReceiver = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            SimpleTextView simpleTextView = new SimpleTextView(activity);
            this.scheduleStartInTextView = simpleTextView;
            simpleTextView.setGravity(17);
            this.scheduleStartInTextView.setTextColor(-1);
            this.scheduleStartInTextView.setTypeface(AndroidUtilities.bold());
            this.scheduleStartInTextView.setTextSize(18);
            this.scheduleStartInTextView.setText(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(this.scheduleStartInTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(activity) { // from class: org.telegram.ui.GroupCallActivity.8
                private float duration;
                private float gradientWidth;
                private int lastTextWidth;
                private long lastUpdateTime;
                private LinearGradient linearGradient;
                private float startX;
                private float time;
                private Matrix matrix = new Matrix();
                private float targetX = -1.0f;

                private void setTarget() {
                    this.targetX = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                }

                @Override // org.telegram.ui.ActionBar.SimpleTextView
                protected boolean createLayout(int i7) {
                    boolean createLayout = super.createLayout(i7);
                    int textWidth = getTextWidth();
                    if (textWidth != this.lastTextWidth) {
                        float f = textWidth;
                        this.gradientWidth = 1.3f * f;
                        float textHeight = getTextHeight();
                        float f2 = f * 2.0f;
                        int color = Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient);
                        int color2 = Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3);
                        int i8 = Theme.key_voipgroup_mutedByAdminGradient2;
                        this.linearGradient = new LinearGradient(0.0f, textHeight, f2, 0.0f, new int[]{color, color2, Theme.getColor(i8), Theme.getColor(i8)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
                        getPaint().setShader(this.linearGradient);
                        this.lastTextWidth = textWidth;
                    }
                    return createLayout;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
                @Override // org.telegram.ui.ActionBar.SimpleTextView, android.view.View
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                protected void onDraw(Canvas canvas) {
                    float f;
                    long j;
                    float f2;
                    float f3;
                    float f4;
                    if (this.linearGradient != null) {
                        ChatObject.Call call2 = GroupCallActivity.this.call;
                        if (call2 != null && call2.isScheduled()) {
                            long currentTimeMillis = (r0.call.call.schedule_date * 1000) - GroupCallActivity.this.accountInstance.getConnectionsManager().getCurrentTimeMillis();
                            f = 1.0f;
                            if (currentTimeMillis >= 0) {
                                if (currentTimeMillis < 5000) {
                                    f = 1.0f - (currentTimeMillis / 5000.0f);
                                }
                            }
                            this.matrix.reset();
                            this.matrix.postTranslate((-this.lastTextWidth) * 0.7f * f, 0.0f);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            j = elapsedRealtime - this.lastUpdateTime;
                            if (j > 20) {
                                j = 17;
                            }
                            this.lastUpdateTime = elapsedRealtime;
                            f2 = this.duration;
                            if (f2 != 0.0f || this.time >= f2) {
                                this.duration = Utilities.random.nextInt(NotificationCenter.dialogPhotosUpdate) + 1500;
                                this.time = 0.0f;
                                if (this.targetX == -1.0f) {
                                    setTarget();
                                }
                                this.startX = this.targetX;
                                setTarget();
                            }
                            float f5 = j;
                            f3 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f5) + (f5 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * GroupCallActivity.this.amplitude);
                            this.time = f3;
                            f4 = this.duration;
                            if (f3 > f4) {
                                this.time = f4;
                            }
                            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f4);
                            float f6 = this.gradientWidth;
                            float f7 = this.startX;
                            this.matrix.postTranslate(((f7 + ((this.targetX - f7) * interpolation)) * f6) - (f6 / 2.0f), 0.0f);
                            this.linearGradient.setLocalMatrix(this.matrix);
                            invalidate();
                        }
                        f = 0.0f;
                        this.matrix.reset();
                        this.matrix.postTranslate((-this.lastTextWidth) * 0.7f * f, 0.0f);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        j = elapsedRealtime2 - this.lastUpdateTime;
                        if (j > 20) {
                        }
                        this.lastUpdateTime = elapsedRealtime2;
                        f2 = this.duration;
                        if (f2 != 0.0f) {
                        }
                        this.duration = Utilities.random.nextInt(NotificationCenter.dialogPhotosUpdate) + 1500;
                        this.time = 0.0f;
                        if (this.targetX == -1.0f) {
                        }
                        this.startX = this.targetX;
                        setTarget();
                        float f52 = j;
                        f3 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f52) + (f52 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * GroupCallActivity.this.amplitude);
                        this.time = f3;
                        f4 = this.duration;
                        if (f3 > f4) {
                        }
                        float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f4);
                        float f62 = this.gradientWidth;
                        float f72 = this.startX;
                        this.matrix.postTranslate(((f72 + ((this.targetX - f72) * interpolation2)) * f62) - (f62 / 2.0f), 0.0f);
                        this.linearGradient.setLocalMatrix(this.matrix);
                        invalidate();
                    }
                    super.onDraw(canvas);
                }
            };
            this.scheduleTimeTextView = simpleTextView2;
            simpleTextView2.setGravity(17);
            this.scheduleTimeTextView.setTextColor(-1);
            this.scheduleTimeTextView.setTypeface(AndroidUtilities.bold());
            this.scheduleTimeTextView.setTextSize(60);
            this.containerView.addView(this.scheduleTimeTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(activity);
            this.scheduleStartAtTextView = simpleTextView3;
            simpleTextView3.setGravity(17);
            this.scheduleStartAtTextView.setTextColor(-1);
            this.scheduleStartAtTextView.setTypeface(AndroidUtilities.bold());
            this.scheduleStartAtTextView.setTextSize(18);
            this.containerView.addView(this.scheduleStartAtTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (isRtmpStream()) {
            LightningView lightningView = new LightningView(activity);
            this.textureLightningView = lightningView;
            this.containerView.addView(lightningView, LayoutHelper.createFrame(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        RecyclerListView recyclerListView = new RecyclerListView(activity) { // from class: org.telegram.ui.GroupCallActivity.9
            private final LongSparseIntArray visiblePeerTmp = new LongSparseIntArray();

            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view == GroupCallActivity.this.scrimView) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void dispatchDraw(Canvas canvas) {
                float f;
                int i7;
                int i8;
                boolean z2 = GroupCallActivity.this.itemAnimator.outMinTop != Float.MAX_VALUE;
                this.visiblePeerTmp.clear();
                for (int i9 = 0; i9 < GroupCallActivity.this.visiblePeerIds.size(); i9++) {
                    this.visiblePeerTmp.put(GroupCallActivity.this.visiblePeerIds.keyAt(i9), 1);
                }
                GroupCallActivity.this.visiblePeerIds.clear();
                int i10 = 0;
                boolean z3 = false;
                float f2 = Float.MAX_VALUE;
                float f3 = 0.0f;
                for (int childCount = getChildCount(); i10 < childCount; childCount = i7) {
                    View childAt = getChildAt(i10);
                    RecyclerView.ViewHolder findContainingViewHolder = findContainingViewHolder(childAt);
                    if (findContainingViewHolder == null || findContainingViewHolder.getItemViewType() == 3 || findContainingViewHolder.getItemViewType() == 4 || findContainingViewHolder.getItemViewType() == 5 || findContainingViewHolder.getItemViewType() == 6 || findContainingViewHolder.getItemViewType() == 7) {
                        i7 = childCount;
                        i8 = i10;
                    } else {
                        if (findContainingViewHolder.getItemViewType() == 1) {
                            View view = findContainingViewHolder.itemView;
                            if (view instanceof GroupCallUserCell) {
                                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                                i7 = childCount;
                                GroupCallActivity.this.visiblePeerIds.append(groupCallUserCell.getPeerId(), 1);
                                i8 = i10;
                                if (this.visiblePeerTmp.get(groupCallUserCell.getPeerId(), 0) == 0) {
                                    z3 = true;
                                } else {
                                    this.visiblePeerTmp.delete(groupCallUserCell.getPeerId());
                                }
                                if (!z2) {
                                    if (!GroupCallActivity.this.itemAnimator.removingHolders.contains(findContainingViewHolder)) {
                                        f2 = Math.min(f2, Math.max(0, childAt.getTop()));
                                        f3 = Math.max(f3, childAt.getBottom());
                                    }
                                } else {
                                    f3 = Math.max(f3, childAt.getY() + childAt.getMeasuredHeight());
                                    f2 = Math.min(f2, Math.max(0.0f, childAt.getY()));
                                    i10 = i8 + 1;
                                }
                            }
                        }
                        i7 = childCount;
                        i8 = i10;
                        if (!z2) {
                        }
                    }
                    i10 = i8 + 1;
                }
                if (this.visiblePeerTmp.size() > 0) {
                    z3 = true;
                }
                if (z3) {
                    GroupCallActivity.this.updateSubtitle();
                }
                if (z2) {
                    f = (GroupCallActivity.this.itemAnimator.outMinTop * (1.0f - GroupCallActivity.this.itemAnimator.animationProgress)) + (GroupCallActivity.this.itemAnimator.animationProgress * f2);
                    f3 = (f3 * GroupCallActivity.this.itemAnimator.animationProgress) + (GroupCallActivity.this.itemAnimator.outMaxBottom * (1.0f - GroupCallActivity.this.itemAnimator.animationProgress));
                } else {
                    f = f2;
                }
                if (f2 != Float.MAX_VALUE) {
                    GroupCallActivity.this.rect.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f, getMeasuredWidth() - r4, Math.min(getMeasuredHeight() - getTranslationY(), f3));
                    canvas.drawRoundRect(GroupCallActivity.this.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), GroupCallActivity.this.listViewBackgroundPaint);
                }
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override // org.telegram.ui.Components.RecyclerListView, android.view.View
            public void setVisibility(int i7) {
                if (getVisibility() != i7) {
                    for (int i8 = 0; i8 < getChildCount(); i8++) {
                        View childAt = getChildAt(i8);
                        if (childAt instanceof GroupCallGridCell) {
                            GroupCallActivity.this.attachRenderer((GroupCallGridCell) childAt, childAt.isAttachedToWindow() && i7 == 0);
                        }
                    }
                }
                super.setVisibility(i7);
            }

            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z2, int i7, int i8, int i9, int i10) {
                super.onLayout(z2, i7, i8, i9, i10);
                GroupCallActivity.this.itemAnimator.updateBackgroundBeforeAnimation();
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipToPadding(false);
        this.listView.setClipChildren(false);
        GroupCallItemAnimator groupCallItemAnimator = new GroupCallItemAnimator();
        this.itemAnimator = groupCallItemAnimator;
        groupCallItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        groupCallItemAnimator.setRemoveDuration(350L);
        groupCallItemAnimator.setAddDuration(350L);
        groupCallItemAnimator.setMoveDuration(350L);
        groupCallItemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(groupCallItemAnimator);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.GroupCallActivity.10
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                GroupCallActivity groupCallActivity;
                ChatObject.Call call2;
                if (GroupCallActivity.this.listView.getChildCount() <= 0 || (call2 = (groupCallActivity = GroupCallActivity.this).call) == null) {
                    return;
                }
                if (!call2.loadingMembers && !call2.membersLoadEndReached && groupCallActivity.layoutManager.findLastVisibleItemPosition() > GroupCallActivity.this.listAdapter.getItemCount() - 5) {
                    GroupCallActivity.this.call.loadMembers(false);
                }
                GroupCallActivity.this.updateLayout(true);
                if (GroupCallActivity.this.textureLightningView != null) {
                    GroupCallActivity.this.textureLightningView.invalidate();
                }
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                if (i7 != 0) {
                    if (GroupCallActivity.this.recordHintView != null) {
                        GroupCallActivity.this.recordHintView.hide();
                    }
                    if (GroupCallActivity.this.reminderHintView != null) {
                        GroupCallActivity.this.reminderHintView.hide();
                        return;
                    }
                    return;
                }
                if ((GroupCallActivity.this.scrollOffsetY - AndroidUtilities.dp(74.0f)) + ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop >= ActionBar.getCurrentActionBarHeight() || !GroupCallActivity.this.listView.canScrollVertically(1)) {
                    return;
                }
                GroupCallActivity.this.listView.getChildAt(0);
                RecyclerListView.Holder holder = (RecyclerListView.Holder) GroupCallActivity.this.listView.findViewHolderForAdapterPosition(0);
                if (holder == null || holder.itemView.getTop() <= 0) {
                    return;
                }
                GroupCallActivity.this.listView.smoothScrollBy(0, holder.itemView.getTop());
            }
        });
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = this.listView;
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(getContext(), isLandscapeMode ? 6 : 2, 1, false, 0, this.listView);
        this.layoutManager = fillLastGridLayoutManager;
        recyclerListView2.setLayoutManager(fillLastGridLayoutManager);
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.GroupCallActivity.11
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i7) {
                int i8 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                if (GroupCallActivity.isTabletMode || i7 < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || i7 >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow) {
                    return i8;
                }
                int i9 = GroupCallActivity.this.listAdapter.usersVideoGridEndRow - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                int i10 = (i7 != GroupCallActivity.this.listAdapter.usersVideoGridEndRow - 1 || (!GroupCallActivity.isLandscapeMode && i9 % 2 == 0)) ? 1 : 2;
                if (!GroupCallActivity.isLandscapeMode) {
                    return i10;
                }
                if (i9 == 1) {
                    return 6;
                }
                return i9 == 2 ? 3 : 2;
            }
        };
        this.spanSizeLookup = spanSizeLookup;
        fillLastGridLayoutManager.setSpanSizeLookup(spanSizeLookup);
        this.listView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.GroupCallActivity.12
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition >= 0) {
                    rect.setEmpty();
                    if (childAdapterPosition < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || childAdapterPosition >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow) {
                        return;
                    }
                    int i7 = childAdapterPosition - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                    int i8 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                    int i9 = i7 % i8;
                    if (i9 == 0) {
                        rect.right = AndroidUtilities.dp(2.0f);
                    } else if (i9 == i8 - 1) {
                        rect.left = AndroidUtilities.dp(2.0f);
                    } else {
                        rect.left = AndroidUtilities.dp(1.0f);
                    }
                }
            }
        });
        fillLastGridLayoutManager.setBind(false);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        this.listView.setAdapter(listAdapter);
        this.listView.setTopBottomSelectorRadius(13);
        this.listView.setSelectorDrawableColor(Theme.getColor(Theme.key_voipgroup_listSelector));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda32
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ boolean hasDoubleTap(View view, int i7) {
                return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view, i7);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ void onDoubleTap(View view, int i7, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view, i7, f, f2);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public final void onItemClick(View view, int i7, float f, float f2) {
                GroupCallActivity.this.lambda$new$24(activity, call, view, i7, f, f2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda33
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view, int i7) {
                boolean lambda$new$25;
                lambda$new$25 = GroupCallActivity.this.lambda$new$25(view, i7);
                return lambda$new$25;
            }
        });
        if (isRtmpStream()) {
            WatchersView watchersView = new WatchersView(getContext());
            this.watchersView = watchersView;
            this.containerView.addView(watchersView, LayoutHelper.createFrame(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        RecyclerListView recyclerListView3 = new RecyclerListView(activity);
        this.tabletVideoGridView = recyclerListView3;
        this.containerView.addView(recyclerListView3, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        RecyclerListView recyclerListView4 = this.tabletVideoGridView;
        GroupCallTabletGridAdapter groupCallTabletGridAdapter = new GroupCallTabletGridAdapter(call, this.currentAccount, this);
        this.tabletGridAdapter = groupCallTabletGridAdapter;
        recyclerListView4.setAdapter(groupCallTabletGridAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(activity, 6, 1, false);
        this.tabletVideoGridView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.GroupCallActivity.14
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i7) {
                return GroupCallActivity.this.tabletGridAdapter.getSpanCount(i7);
            }
        });
        this.tabletVideoGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda34
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i7) {
                GroupCallActivity.this.lambda$new$26(view, i7);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setRemoveDuration(350L);
        defaultItemAnimator.setAddDuration(350L);
        defaultItemAnimator.setMoveDuration(350L);
        this.tabletVideoGridView.setItemAnimator(new DefaultItemAnimator() { // from class: org.telegram.ui.GroupCallActivity.15
            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                GroupCallActivity.this.listView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.updateLayout(true);
            }
        });
        this.tabletVideoGridView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.GroupCallActivity.16
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                super.onScrolled(recyclerView, i7, i8);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        this.tabletGridAdapter.setVisibility(this.tabletVideoGridView, false, false);
        this.tabletVideoGridView.setVisibility(8);
        GroupCallActivityButtonsLayout groupCallActivityButtonsLayout = new GroupCallActivityButtonsLayout(activity) { // from class: org.telegram.ui.GroupCallActivity.17
            int currentLightColor;
            final OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.5f);

            /* JADX WARN: Removed duplicated region for block: B:104:0x03d9  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0ae3  */
            /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0672  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x072e  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x090f  */
            /* JADX WARN: Removed duplicated region for block: B:182:0x09e3  */
            /* JADX WARN: Removed duplicated region for block: B:195:0x093d  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0421  */
            @Override // android.view.ViewGroup, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void dispatchDraw(Canvas canvas) {
                boolean z2;
                int i7;
                float f;
                int dp;
                float x;
                float y;
                float f2;
                boolean z3;
                boolean z4;
                int i8;
                int i9;
                int i10;
                int i11;
                if (GroupCallActivity.this.contentFullyOverlayed && GroupCallActivity.this.useBlur) {
                    return;
                }
                int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - GroupCallActivity.this.lastUpdateTime;
                GroupCallActivity.this.lastUpdateTime = elapsedRealtime;
                if (j > 20) {
                    j = 17;
                }
                long j2 = j;
                if (GroupCallActivity.this.currentState != null) {
                    GroupCallActivity.this.currentState.update(0, measuredWidth, getMeasuredHeight(), j2, GroupCallActivity.this.amplitude);
                }
                GroupCallActivity.this.tinyWaveDrawable.minRadius = AndroidUtilities.dp(62.0f) * 0.46296296f;
                GroupCallActivity.this.tinyWaveDrawable.maxRadius = (AndroidUtilities.dp(62.0f) + (AndroidUtilities.dp(20.0f) * BlobDrawable.FORM_SMALL_MAX)) * 0.48076922f;
                GroupCallActivity.this.bigWaveDrawable.minRadius = AndroidUtilities.dp(65.0f) * 0.46296296f;
                GroupCallActivity.this.bigWaveDrawable.maxRadius = (AndroidUtilities.dp(65.0f) + (AndroidUtilities.dp(20.0f) * BlobDrawable.FORM_BIG_MAX)) * 0.48076922f;
                if (GroupCallActivity.this.animateToAmplitude != GroupCallActivity.this.amplitude) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    GroupCallActivity.access$12516(groupCallActivity, groupCallActivity.animateAmplitudeDiff * j2);
                    if (GroupCallActivity.this.animateAmplitudeDiff > 0.0f) {
                        if (GroupCallActivity.this.amplitude > GroupCallActivity.this.animateToAmplitude) {
                            GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                            groupCallActivity2.amplitude = groupCallActivity2.animateToAmplitude;
                        }
                    } else if (GroupCallActivity.this.amplitude < GroupCallActivity.this.animateToAmplitude) {
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        groupCallActivity3.amplitude = groupCallActivity3.animateToAmplitude;
                    }
                }
                int i12 = 0;
                int i13 = 1;
                if (GroupCallActivity.this.prevState == null || GroupCallActivity.this.prevState.currentState != 3) {
                    if (GroupCallActivity.this.prevState != null && GroupCallActivity.this.currentState != null && GroupCallActivity.this.currentState.currentState == 3) {
                        GroupCallActivity.this.radialProgressView.toCircle(true, false);
                    }
                } else {
                    GroupCallActivity.this.radialProgressView.toCircle(true, true);
                    if (!GroupCallActivity.this.radialProgressView.isCircle()) {
                        z2 = false;
                        if (z2) {
                            if (GroupCallActivity.this.switchProgress != 1.0f) {
                                if (GroupCallActivity.this.prevState != null && GroupCallActivity.this.prevState.currentState == 3) {
                                    GroupCallActivity.access$14516(GroupCallActivity.this, j2 / 100.0f);
                                } else {
                                    GroupCallActivity.access$14516(GroupCallActivity.this, j2 / 180.0f);
                                }
                                if (GroupCallActivity.this.switchProgress >= 1.0f) {
                                    GroupCallActivity.this.switchProgress = 1.0f;
                                    GroupCallActivity.this.prevState = null;
                                    if (GroupCallActivity.this.currentState != null && GroupCallActivity.this.currentState.currentState == 3) {
                                        GroupCallActivity.this.radialProgressView.toCircle(false, true);
                                    }
                                }
                                GroupCallActivity.this.invalidateColors = true;
                            }
                            if (GroupCallActivity.this.invalidateColors && GroupCallActivity.this.currentState != null) {
                                GroupCallActivity.this.invalidateColors = false;
                                if (GroupCallActivity.this.prevState != null) {
                                    GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                                    groupCallActivity4.fillColors(groupCallActivity4.prevState.currentState, GroupCallActivity.this.colorsTmp);
                                    int i14 = GroupCallActivity.this.colorsTmp[0];
                                    int i15 = GroupCallActivity.this.colorsTmp[1];
                                    int i16 = GroupCallActivity.this.colorsTmp[2];
                                    int i17 = GroupCallActivity.this.colorsTmp[3];
                                    GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                                    groupCallActivity5.fillColors(groupCallActivity5.currentState.currentState, GroupCallActivity.this.colorsTmp);
                                    i8 = ColorUtils.blendARGB(i14, GroupCallActivity.this.colorsTmp[0], GroupCallActivity.this.switchProgress);
                                    i9 = ColorUtils.blendARGB(i15, GroupCallActivity.this.colorsTmp[1], GroupCallActivity.this.switchProgress);
                                    i10 = ColorUtils.blendARGB(i16, GroupCallActivity.this.colorsTmp[2], GroupCallActivity.this.switchProgress);
                                    i11 = ColorUtils.blendARGB(i17, GroupCallActivity.this.colorsTmp[3], GroupCallActivity.this.switchProgress);
                                } else {
                                    GroupCallActivity groupCallActivity6 = GroupCallActivity.this;
                                    groupCallActivity6.fillColors(groupCallActivity6.currentState.currentState, GroupCallActivity.this.colorsTmp);
                                    i8 = GroupCallActivity.this.colorsTmp[0];
                                    i9 = GroupCallActivity.this.colorsTmp[1];
                                    i10 = GroupCallActivity.this.colorsTmp[2];
                                    i11 = GroupCallActivity.this.colorsTmp[3];
                                }
                                if (this.currentLightColor != i8) {
                                    GroupCallActivity.this.radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{ColorUtils.setAlphaComponent(i8, 60), ColorUtils.setAlphaComponent(i8, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                                    GroupCallActivity.this.radialPaint.setShader(GroupCallActivity.this.radialGradient);
                                    this.currentLightColor = i8;
                                }
                                GroupCallActivity.this.messageButton.setBackgroundColor(i10, i9);
                                GroupCallActivity.this.soundButton.setBackgroundColor(i10, i9);
                                GroupCallActivity.this.cameraButton.setBackgroundColor(i10, i9);
                                GroupCallActivity.this.flipButton.setBackgroundColor(i10, i9);
                                VoIPToggleButton voIPToggleButton = GroupCallActivity.this.leaveButton;
                                int i18 = Theme.key_voipgroup_leaveButton;
                                voIPToggleButton.setBackgroundColor(Theme.getColor(i18), Theme.getColor(i18));
                                GroupCallActivity.this.speakerButton.setBackgroundColor(i9, i11);
                            }
                            if (GroupCallActivity.this.currentState != null) {
                                z3 = GroupCallActivity.this.currentState.currentState == 1 || GroupCallActivity.this.currentState.currentState == 0 || GroupCallActivity.isGradientState(GroupCallActivity.this.currentState.currentState);
                                if (GroupCallActivity.this.currentState.currentState != 3) {
                                    z4 = true;
                                    if (GroupCallActivity.this.prevState == null && GroupCallActivity.this.currentState != null && GroupCallActivity.this.currentState.currentState == 3) {
                                        GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 180.0f);
                                        if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                            GroupCallActivity.this.showWavesProgress = 0.0f;
                                        }
                                    } else if (!z3 && GroupCallActivity.this.showWavesProgress != 1.0f) {
                                        GroupCallActivity.access$15616(GroupCallActivity.this, j2 / 350.0f);
                                        if (GroupCallActivity.this.showWavesProgress > 1.0f) {
                                            GroupCallActivity.this.showWavesProgress = 1.0f;
                                        }
                                    } else if (!z3 && GroupCallActivity.this.showWavesProgress != 0.0f) {
                                        GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                        if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                            GroupCallActivity.this.showWavesProgress = 0.0f;
                                        }
                                    }
                                    if (!z4 && GroupCallActivity.this.showLightingProgress != 1.0f) {
                                        GroupCallActivity.access$15716(GroupCallActivity.this, j2 / 350.0f);
                                        if (GroupCallActivity.this.showLightingProgress > 1.0f) {
                                            GroupCallActivity.this.showLightingProgress = 1.0f;
                                        }
                                    } else if (!z4 && GroupCallActivity.this.showLightingProgress != 0.0f) {
                                        GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                                        if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                            GroupCallActivity.this.showLightingProgress = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                            z4 = false;
                            if (GroupCallActivity.this.prevState == null) {
                            }
                            if (!z3) {
                            }
                            if (!z3) {
                                GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                }
                            }
                            if (!z4) {
                            }
                            if (!z4) {
                                GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                }
                            }
                        }
                        float interpolation = (this.overshootInterpolator.getInterpolation(GroupCallActivity.this.showWavesProgress) * 0.6f) + 0.4f;
                        GroupCallActivity.this.bigWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                        GroupCallActivity.this.tinyWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                        float f3 = 25.909092f;
                        if (GroupCallActivity.this.prevState != null || GroupCallActivity.this.currentState == null || GroupCallActivity.this.isRtmpStream() || !(GroupCallActivity.this.currentState.currentState == 3 || GroupCallActivity.this.prevState.currentState == 3)) {
                            i7 = 2;
                            while (i12 < i7) {
                                float dp2 = AndroidUtilities.dp(f3);
                                if (i12 != 0 || GroupCallActivity.this.prevState == null) {
                                    if (i12 == i13 && GroupCallActivity.this.currentState != null) {
                                        if (!GroupCallActivity.this.isRtmpStream()) {
                                            GroupCallActivity.this.paint.setShader(GroupCallActivity.this.currentState.shader);
                                        }
                                        f = GroupCallActivity.this.switchProgress;
                                        if (GroupCallActivity.this.currentState.currentState == 3) {
                                            dp = AndroidUtilities.dp(2.0f);
                                            dp2 -= dp * f;
                                        }
                                        if (GroupCallActivity.this.paint.getShader() == null && !GroupCallActivity.this.isRtmpStream()) {
                                            GroupCallActivity.this.paint.setColor(AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(Theme.key_voipgroup_disabledButton), GroupCallActivity.this.colorProgress, 1.0f));
                                        }
                                        if (GroupCallActivity.this.isRtmpStream()) {
                                            int color = Theme.getColor(Theme.key_voipgroup_rtmpButton);
                                            int i19 = Theme.key_voipgroup_disabledButton;
                                            int offsetColor = AndroidUtilities.getOffsetColor(color, Theme.getColor(i19), GroupCallActivity.this.colorProgress, 1.0f);
                                            GroupCallActivity.this.paint.setColor(offsetColor);
                                            GroupCallActivity.this.paint.setShader(null);
                                            VoIPToggleButton voIPToggleButton2 = GroupCallActivity.this.soundButton;
                                            int i20 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                            voIPToggleButton2.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(i20), Theme.getColor(i19), GroupCallActivity.this.colorProgress, 1.0f), offsetColor);
                                            GroupCallActivity.this.messageButton.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(i20), Theme.getColor(i19), GroupCallActivity.this.colorProgress, 1.0f), offsetColor);
                                        }
                                        x = (int) (GroupCallActivity.this.muteButton.getX() + (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2.0f));
                                        y = (int) (GroupCallActivity.this.muteButton.getY() + AndroidUtilities.dp(25.0f));
                                        GroupCallActivity.this.radialMatrix.setTranslate(x, y);
                                        GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                                        GroupCallActivity.this.paint.setAlpha((int) (76.0f * f * GroupCallActivity.this.switchToButtonProgress));
                                        canvas.save();
                                        canvas.scale(BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), x, y);
                                        canvas.save();
                                        float f4 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * 0.5f);
                                        canvas.scale(GroupCallActivity.this.showLightingProgress * f4, f4 * GroupCallActivity.this.showLightingProgress, x, y);
                                        if (i12 != 1 && !GroupCallActivity.this.isRtmpStream() && LiteMode.isEnabled(512)) {
                                            float f5 = BlobDrawable.LIGHT_GRADIENT_SIZE + 0.7f;
                                            canvas.save();
                                            canvas.scale(f5, f5, x, y);
                                            int alpha = GroupCallActivity.this.radialPaint.getAlpha();
                                            GroupCallActivity.this.radialPaint.setAlpha((int) (alpha * GroupCallActivity.this.switchToButtonProgress * (1.0f - GroupCallActivity.this.animatorHideButtons.getFloatValue())));
                                            canvas.drawCircle(x, y, AndroidUtilities.dp(160.0f), GroupCallActivity.this.radialPaint);
                                            GroupCallActivity.this.radialPaint.setAlpha(alpha);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        if (!GroupCallActivity.this.isRtmpStream() && GroupCallActivity.this.switchToButtonProgress > 0.0f) {
                                            canvas.save();
                                            float f6 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * interpolation);
                                            canvas.scale(f6, f6, x, y);
                                            GroupCallActivity.this.bigWaveDrawable.draw(x, y, canvas, GroupCallActivity.this.paint);
                                            canvas.restore();
                                            canvas.save();
                                            float f7 = BlobDrawable.SCALE_SMALL_MIN + (BlobDrawable.SCALE_SMALL * GroupCallActivity.this.amplitude * interpolation);
                                            canvas.scale(f7, f7, x, y);
                                            GroupCallActivity.this.tinyWaveDrawable.draw(x, y, canvas, GroupCallActivity.this.paint);
                                            canvas.restore();
                                        }
                                        if (GroupCallActivity.isLandscapeMode) {
                                            if (i12 == 0) {
                                                GroupCallActivity.this.paint.setAlpha(NotificationCenter.didReceiveSmsCode);
                                            } else {
                                                GroupCallActivity.this.paint.setAlpha((int) (f * 255.0f));
                                            }
                                        } else if (i12 == 0) {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * 255.0f));
                                        } else {
                                            GroupCallActivity.this.paint.setAlpha((int) (f * 255.0f * GroupCallActivity.this.switchToButtonInt2));
                                        }
                                        float measuredWidth2 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                                        float dp3 = AndroidUtilities.dp(24.0f);
                                        float f8 = (measuredWidth2 + (dp2 - measuredWidth2)) * GroupCallActivity.this.switchToButtonProgress;
                                        float f9 = (dp3 + (dp2 - dp3)) * GroupCallActivity.this.switchToButtonProgress;
                                        GroupCallActivity.this.rect.set(x - f8, y - f9, f8 + x, f9 + y);
                                        float dp4 = AndroidUtilities.dp(4.0f) + (dp2 - AndroidUtilities.dp(4.0f));
                                        GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.paint.getAlpha() * GroupCallActivity.this.switchToButtonProgress));
                                        canvas.drawRoundRect(GroupCallActivity.this.rect, dp4, dp4, GroupCallActivity.this.paint);
                                        if (i12 == 1 && GroupCallActivity.this.currentState.currentState == 3) {
                                            if (GroupCallActivity.this.isRtmpStream()) {
                                                GroupCallActivity.this.radialProgressView.setSize((int) ((dp4 * 2.0f) - AndroidUtilities.dp(4.0f)));
                                            }
                                            GroupCallActivity.this.radialProgressView.draw(canvas, x, y);
                                        }
                                        canvas.restore();
                                        if (GroupCallActivity.this.scheduleButtonTextView == null && GroupCallActivity.this.scheduleButtonTextView.getVisibility() == 0) {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.scheduleButtonTextView.getAlpha() * 255.0f));
                                            float x2 = GroupCallActivity.this.scheduleButtonTextView.getX() - getX();
                                            float y2 = GroupCallActivity.this.scheduleButtonTextView.getY() - getY();
                                            GroupCallActivity.this.rect.set(x2, y2, GroupCallActivity.this.scheduleButtonTextView.getMeasuredWidth() + x2, GroupCallActivity.this.scheduleButtonTextView.getMeasuredHeight() + y2);
                                            canvas.save();
                                            canvas.scale(GroupCallActivity.this.scheduleButtonTextView.getScaleX(), GroupCallActivity.this.scheduleButtonTextView.getScaleY(), GroupCallActivity.this.rect.centerX(), GroupCallActivity.this.rect.centerY());
                                            canvas.drawRoundRect(GroupCallActivity.this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), GroupCallActivity.this.paint);
                                            canvas.restore();
                                        }
                                    }
                                } else {
                                    if (!GroupCallActivity.this.isRtmpStream()) {
                                        GroupCallActivity.this.paint.setShader(GroupCallActivity.this.prevState.shader);
                                    }
                                    f = 1.0f - GroupCallActivity.this.switchProgress;
                                    if (GroupCallActivity.this.prevState.currentState == 3) {
                                        dp = AndroidUtilities.dp(2.0f);
                                        dp2 -= dp * f;
                                    }
                                    if (GroupCallActivity.this.paint.getShader() == null) {
                                        GroupCallActivity.this.paint.setColor(AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(Theme.key_voipgroup_disabledButton), GroupCallActivity.this.colorProgress, 1.0f));
                                    }
                                    if (GroupCallActivity.this.isRtmpStream()) {
                                    }
                                    x = (int) (GroupCallActivity.this.muteButton.getX() + (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2.0f));
                                    y = (int) (GroupCallActivity.this.muteButton.getY() + AndroidUtilities.dp(25.0f));
                                    GroupCallActivity.this.radialMatrix.setTranslate(x, y);
                                    GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                                    GroupCallActivity.this.paint.setAlpha((int) (76.0f * f * GroupCallActivity.this.switchToButtonProgress));
                                    canvas.save();
                                    canvas.scale(BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), x, y);
                                    canvas.save();
                                    float f42 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * 0.5f);
                                    canvas.scale(GroupCallActivity.this.showLightingProgress * f42, f42 * GroupCallActivity.this.showLightingProgress, x, y);
                                    if (i12 != 1) {
                                    }
                                    canvas.restore();
                                    if (!GroupCallActivity.this.isRtmpStream()) {
                                        canvas.save();
                                        float f62 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * interpolation);
                                        canvas.scale(f62, f62, x, y);
                                        GroupCallActivity.this.bigWaveDrawable.draw(x, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                        canvas.save();
                                        float f72 = BlobDrawable.SCALE_SMALL_MIN + (BlobDrawable.SCALE_SMALL * GroupCallActivity.this.amplitude * interpolation);
                                        canvas.scale(f72, f72, x, y);
                                        GroupCallActivity.this.tinyWaveDrawable.draw(x, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                    }
                                    float measuredWidth22 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                                    float dp32 = AndroidUtilities.dp(24.0f);
                                    float f82 = (measuredWidth22 + (dp2 - measuredWidth22)) * GroupCallActivity.this.switchToButtonProgress;
                                    float f92 = (dp32 + (dp2 - dp32)) * GroupCallActivity.this.switchToButtonProgress;
                                    GroupCallActivity.this.rect.set(x - f82, y - f92, f82 + x, f92 + y);
                                    float dp42 = AndroidUtilities.dp(4.0f) + (dp2 - AndroidUtilities.dp(4.0f));
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.paint.getAlpha() * GroupCallActivity.this.switchToButtonProgress));
                                    canvas.drawRoundRect(GroupCallActivity.this.rect, dp42, dp42, GroupCallActivity.this.paint);
                                    if (i12 == 1) {
                                        if (GroupCallActivity.this.isRtmpStream()) {
                                        }
                                        GroupCallActivity.this.radialProgressView.draw(canvas, x, y);
                                    }
                                    canvas.restore();
                                    if (GroupCallActivity.this.scheduleButtonTextView == null) {
                                    }
                                }
                                i12++;
                                i7 = 2;
                                i13 = 1;
                                f3 = 25.909092f;
                            }
                        } else {
                            if (GroupCallActivity.this.currentState.currentState == 3) {
                                f2 = GroupCallActivity.this.switchProgress;
                                GroupCallActivity.this.paint.setShader(GroupCallActivity.this.prevState.shader);
                            } else {
                                f2 = 1.0f - GroupCallActivity.this.switchProgress;
                                GroupCallActivity.this.paint.setShader(GroupCallActivity.this.currentState.shader);
                            }
                            GroupCallActivity.this.paintTmp.setColor(AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(Theme.key_voipgroup_disabledButton), GroupCallActivity.this.colorProgress, 1.0f));
                            float x3 = (int) (GroupCallActivity.this.muteButton.getX() + (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2.0f));
                            float y3 = (int) (GroupCallActivity.this.muteButton.getY() + AndroidUtilities.dp(25.0f));
                            GroupCallActivity.this.radialMatrix.setTranslate(x3, y3);
                            GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                            GroupCallActivity.this.paint.setAlpha(76);
                            canvas.save();
                            canvas.scale(BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleY(), x3, y3);
                            canvas.save();
                            float f10 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * 0.5f);
                            canvas.scale(GroupCallActivity.this.showLightingProgress * f10, f10 * GroupCallActivity.this.showLightingProgress, x3, y3);
                            float f11 = BlobDrawable.LIGHT_GRADIENT_SIZE + 0.7f;
                            canvas.save();
                            canvas.scale(f11, f11, x3, y3);
                            canvas.drawCircle(x3, y3, AndroidUtilities.dp(160.0f), GroupCallActivity.this.radialPaint);
                            canvas.restore();
                            canvas.restore();
                            if (GroupCallActivity.this.call != null) {
                                canvas.save();
                                float f12 = (BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude)) * interpolation;
                                canvas.scale(f12, f12, x3, y3);
                                GroupCallActivity.this.bigWaveDrawable.draw(x3, y3, canvas, GroupCallActivity.this.paint);
                                canvas.restore();
                                canvas.save();
                                float f13 = (BlobDrawable.SCALE_SMALL_MIN + (BlobDrawable.SCALE_SMALL * GroupCallActivity.this.amplitude)) * interpolation;
                                canvas.scale(f13, f13, x3, y3);
                                GroupCallActivity.this.tinyWaveDrawable.draw(x3, y3, canvas, GroupCallActivity.this.paint);
                                canvas.restore();
                            }
                            GroupCallActivity.this.paint.setAlpha(NotificationCenter.didReceiveSmsCode);
                            if (z2) {
                                canvas.drawCircle(x3, y3, AndroidUtilities.dp(25.909092f), GroupCallActivity.this.paint);
                                GroupCallActivity.this.paint.setColor(Theme.getColor(Theme.key_voipgroup_connectingProgress));
                                if (f2 != 0.0f) {
                                    GroupCallActivity.this.paint.setAlpha((int) (f2 * 255.0f));
                                    GroupCallActivity.this.paint.setShader(null);
                                    canvas.drawCircle(x3, y3, AndroidUtilities.dp(25.909092f), GroupCallActivity.this.paint);
                                }
                            }
                            canvas.drawCircle(x3, y3, AndroidUtilities.dp(25.0f) * f2, GroupCallActivity.this.paintTmp);
                            if (!z2) {
                                GroupCallActivity.this.radialProgressView.draw(canvas, x3, y3);
                            }
                            canvas.restore();
                        }
                        super.dispatchDraw(canvas);
                        if (GroupCallActivity.this.renderersContainer.isAnimating()) {
                            invalidate();
                            return;
                        }
                        return;
                    }
                }
                z2 = true;
                if (z2) {
                }
                float interpolation2 = (this.overshootInterpolator.getInterpolation(GroupCallActivity.this.showWavesProgress) * 0.6f) + 0.4f;
                GroupCallActivity.this.bigWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                GroupCallActivity.this.tinyWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                float f32 = 25.909092f;
                if (GroupCallActivity.this.prevState != null) {
                }
                i7 = 2;
                while (i12 < i7) {
                }
                super.dispatchDraw(canvas);
                if (GroupCallActivity.this.renderersContainer.isAnimating()) {
                }
            }
        };
        this.buttonsContainer = groupCallActivityButtonsLayout;
        int color = Theme.getColor(Theme.key_voipgroup_unmuteButton2);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        this.radialMatrix = new Matrix();
        final TLRPC.InputPeer inputPeer3 = inputPeer2;
        this.radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.radialPaint = paint;
        paint.setShader(this.radialGradient);
        BlobDrawable blobDrawable = new BlobDrawable(9);
        this.tinyWaveDrawable = blobDrawable;
        BlobDrawable blobDrawable2 = new BlobDrawable(12);
        this.bigWaveDrawable = blobDrawable2;
        blobDrawable.minRadius = AndroidUtilities.dp(62.0f) * 0.45454547f;
        blobDrawable.maxRadius = AndroidUtilities.dp(72.0f) * 0.45454547f;
        blobDrawable.generateBlob();
        blobDrawable2.minRadius = AndroidUtilities.dp(65.0f) * 0.45454547f;
        blobDrawable2.maxRadius = AndroidUtilities.dp(75.0f) * 0.45454547f;
        blobDrawable2.generateBlob();
        Paint paint2 = blobDrawable.paint;
        int i7 = Theme.key_voipgroup_unmuteButton;
        paint2.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i7), 38));
        blobDrawable2.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i7), 76));
        VoIPToggleButton voIPToggleButton = new VoIPToggleButton(activity, 50.0f);
        this.soundButton = voIPToggleButton;
        voIPToggleButton.setCheckable(true);
        voIPToggleButton.setTextSize(12);
        groupCallActivityButtonsLayout.addButton(voIPToggleButton);
        voIPToggleButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$27(view);
            }
        });
        VoIPToggleButton voIPToggleButton2 = new VoIPToggleButton(activity, 50.0f);
        this.cameraButton = voIPToggleButton2;
        voIPToggleButton2.setCheckable(true);
        voIPToggleButton2.setTextSize(12);
        voIPToggleButton2.showText(false, false);
        voIPToggleButton2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        voIPToggleButton2.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(activity, 50.0f);
        this.flipButton = voIPToggleButton3;
        voIPToggleButton3.setCheckable(true);
        voIPToggleButton3.setTextSize(12);
        voIPToggleButton3.showText(false, false);
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        voIPToggleButton3.addView(rLottieImageView, LayoutHelper.createFrame(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        int i8 = R.raw.camera_flip;
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i8, "" + i8, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.flipIcon = rLottieDrawable2;
        rLottieImageView.setAnimation(rLottieDrawable2);
        voIPToggleButton3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$28(view);
            }
        });
        groupCallActivityButtonsLayout.addButton(voIPToggleButton3);
        VoIPToggleButton voIPToggleButton4 = new VoIPToggleButton(activity, 50.0f);
        this.speakerButton = voIPToggleButton4;
        voIPToggleButton4.setCheckable(true);
        voIPToggleButton4.setTextSize(12);
        voIPToggleButton4.showText(false, false);
        ImageView imageView = new ImageView(activity);
        this.speakerImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i9 = R.drawable.filled_sound_on;
        this.speakerIcon = i9;
        imageView.setImageResource(i9);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        voIPToggleButton4.addView(imageView, LayoutHelper.createFrame(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        voIPToggleButton4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$30(view);
            }
        });
        groupCallActivityButtonsLayout.addButton(voIPToggleButton4);
        groupCallActivityButtonsLayout.addButton(voIPToggleButton2);
        VoIPToggleButton voIPToggleButton5 = new VoIPToggleButton(activity, 50.0f);
        this.leaveButton = voIPToggleButton5;
        voIPToggleButton5.setTextSize(12);
        voIPToggleButton5.setData(R.drawable.calls_decline, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        voIPToggleButton5.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$31(activity, view);
            }
        });
        VoIPToggleButton voIPToggleButton6 = new VoIPToggleButton(activity, 50.0f);
        this.messageButton = voIPToggleButton6;
        voIPToggleButton6.setCheckable(true);
        voIPToggleButton6.setChecked(true, false);
        voIPToggleButton6.setTextSize(12);
        voIPToggleButton6.setData(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        RLottieImageView rLottieImageView2 = new RLottieImageView(activity) { // from class: org.telegram.ui.GroupCallActivity.18
            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (GroupCallActivity.this.isRtmpStream()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0 && GroupCallActivity.this.muteButtonState == 0) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    if (groupCallActivity.call != null) {
                        AndroidUtilities.runOnUIThread(groupCallActivity.pressRunnable, 300L);
                        GroupCallActivity.this.scheduled = true;
                        return super.onTouchEvent(motionEvent);
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (GroupCallActivity.this.scheduled) {
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.pressRunnable);
                        GroupCallActivity.this.scheduled = false;
                    } else if (GroupCallActivity.this.pressed) {
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.unmuteRunnable);
                        GroupCallActivity.this.updateMuteButton(0, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, true, false);
                            try {
                                GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        GroupCallActivity.this.attachedRenderersTmp.clear();
                        GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                        for (int i10 = 0; i10 < GroupCallActivity.this.attachedRenderersTmp.size(); i10++) {
                            ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i10)).updateAttachState(true);
                        }
                        GroupCallActivity.this.pressed = false;
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(obtain);
                        obtain.recycle();
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override // android.view.View
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setEnabled(GroupCallActivity.this.muteButtonState == 0 || GroupCallActivity.this.muteButtonState == 1);
                if (GroupCallActivity.this.muteButtonState == 1) {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
                }
            }
        };
        this.muteButtonIcon = rLottieImageView2;
        rLottieImageView2.setAnimation(rLottieDrawable);
        rLottieImageView2.setScaleType(ImageView.ScaleType.CENTER);
        VoIPToggleButton voIPToggleButton7 = new VoIPToggleButton(activity, 50.0f);
        this.muteButton = voIPToggleButton7;
        voIPToggleButton7.setDrawBackground(false);
        voIPToggleButton7.setTextSize(12);
        voIPToggleButton7.setData(0, 0, 0, "Text", false, false);
        voIPToggleButton7.addView(rLottieImageView2, LayoutHelper.createFrame(50, 50, 49));
        groupCallActivityButtonsLayout.addButton(voIPToggleButton7);
        voIPToggleButton7.setOnClickListener(new 19());
        groupCallActivityButtonsLayout.addButton(voIPToggleButton6);
        groupCallActivityButtonsLayout.addButton(voIPToggleButton5);
        ImageView imageView2 = new ImageView(activity);
        this.expandOrMinimizeButton = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        voIPToggleButton7.addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.call != null && isRtmpStream() && !this.call.isScheduled()) {
            imageView2.setVisibility(0);
            rLottieImageView2.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(activity);
        this.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(Theme.getColor(Theme.key_voipgroup_connectingProgress));
        actionBar.setAlpha(0.0f);
        actionBar.getBackButton().setScaleX(0.9f);
        actionBar.getBackButton().setScaleY(0.9f);
        actionBar.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        actionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        actionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        actionBar.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(activity, null, 0, Theme.getColor(i3));
        this.otherItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        actionBarMenuItem.setIcon(R.drawable.ic_ab_other);
        actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        actionBarMenuItem.setSubMenuOpenSide(2);
        actionBarMenuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda10
            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemDelegate
            public final void onItemClick(int i10) {
                GroupCallActivity.this.lambda$new$32(i10);
            }
        });
        int i10 = Theme.key_voipgroup_actionBarItemsSelector;
        actionBarMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i10), 6));
        actionBarMenuItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$33(view);
            }
        });
        actionBarMenuItem.setPopupItemsColor(Theme.getColor(i3), false);
        actionBarMenuItem.setPopupItemsColor(Theme.getColor(i3), true);
        ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(activity, null, 0, Theme.getColor(i3));
        this.pipItem = actionBarMenuItem2;
        actionBarMenuItem2.setLongClickEnabled(false);
        actionBarMenuItem2.setIcon(R.drawable.msg_voice_pip);
        int i11 = R.string.AccDescrPipMode;
        actionBarMenuItem2.setContentDescription(LocaleController.getString(i11));
        actionBarMenuItem2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i10), 6));
        actionBarMenuItem2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$34(view);
            }
        });
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(activity, null, 0, Theme.getColor(i3));
        this.screenShareItem = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        actionBarMenuItem3.setIcon(R.drawable.msg_screencast);
        actionBarMenuItem3.setContentDescription(LocaleController.getString(i11));
        actionBarMenuItem3.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i10), 6));
        actionBarMenuItem3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$35(view);
            }
        });
        20 r1 = new 20(activity, activity);
        this.titleTextView = r1;
        View view = new View(activity) { // from class: org.telegram.ui.GroupCallActivity.21
            @Override // android.view.View
            protected void onMeasure(int i12, int i13) {
                setMeasuredDimension(View.MeasureSpec.getSize(i12), ActionBar.getCurrentActionBarHeight());
            }
        };
        this.actionBarBackground = view;
        view.setAlpha(0.0f);
        Paint paint3 = new Paint(1);
        this.liveLabelPaint = paint3;
        paint3.setColor(-12761513);
        TextView textView = new TextView(getContext()) { // from class: org.telegram.ui.GroupCallActivity.22
            private RectF rect = new RectF();

            @Override // android.widget.TextView, android.view.View
            protected void onDraw(Canvas canvas) {
                this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), GroupCallActivity.this.liveLabelPaint);
                super.onDraw(canvas);
            }
        };
        this.liveLabelTextView = textView;
        textView.setTextColor(getThemedColor(i3));
        textView.setTextSize(1, 11.0f);
        textView.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        textView.setMaxLines(1);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        textView.setTag(-1);
        if (!isRtmpStream()) {
            textView.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.titleLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(r1, LayoutHelper.createLinear(0, -2, 1.0f));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, 18, 6.0f, 4.0f, 0.0f, 0.0f));
        this.containerView.addView(view, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(actionBar, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.menuItemsContainer = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(actionBarMenuItem3, LayoutHelper.createLinear(48, 48));
        linearLayout2.addView(actionBarMenuItem2, LayoutHelper.createLinear(48, 48));
        linearLayout2.addView(actionBarMenuItem, LayoutHelper.createLinear(48, 48));
        this.containerView.addView(linearLayout2, LayoutHelper.createFrame(-2, 48, 53));
        View view2 = new View(activity);
        this.actionBarShadow = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine));
        this.containerView.addView(view2, LayoutHelper.createFrame(-1, 1.0f));
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            this.undoView[i12] = new UndoView(activity) { // from class: org.telegram.ui.GroupCallActivity.23
                @Override // org.telegram.ui.Components.UndoView
                public void showWithAction(long j, int i14, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
                    if (GroupCallActivity.this.previewDialog != null) {
                        return;
                    }
                    super.showWithAction(j, i14, obj, obj2, runnable, runnable2);
                }
            };
            this.undoView[i12].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.undoView[i12].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.undoView[i12], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i12++;
        }
        AccountSelectCell accountSelectCell = new AccountSelectCell(activity, true);
        this.accountSelectCell = accountSelectCell;
        accountSelectCell.setTag(R.id.fit_width_tag, Integer.valueOf(NotificationCenter.appConfigUpdated));
        this.otherItem.addSubItem(8, accountSelectCell, -2, AndroidUtilities.dp(48.0f));
        this.otherItem.setShowSubmenuByMove(false);
        int i14 = Theme.key_voipgroup_listSelector;
        accountSelectCell.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i14), 6, 6));
        ActionBarMenuSubItem addSubItem = this.otherItem.addSubItem(1, 0, (CharSequence) LocaleController.getString(R.string.VoipGroupAllCanSpeak), true);
        this.everyoneItem = addSubItem;
        addSubItem.updateSelectorBackground(true, false);
        ActionBarMenuSubItem addSubItem2 = this.otherItem.addSubItem(2, 0, (CharSequence) LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true);
        this.adminItem = addSubItem2;
        addSubItem2.updateSelectorBackground(false, true);
        ActionBarMenuSubItem actionBarMenuSubItem = this.everyoneItem;
        int i15 = Theme.key_voipgroup_checkMenu;
        actionBarMenuSubItem.setCheckColor(i15);
        this.everyoneItem.setColors(Theme.getColor(i15), Theme.getColor(i15));
        this.adminItem.setCheckColor(i15);
        this.adminItem.setColors(Theme.getColor(i15), Theme.getColor(i15));
        Paint paint4 = new Paint(1);
        int i16 = Theme.key_voipgroup_actionBarItems;
        paint4.setColor(Theme.getColor(i16));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint4.setStrokeCap(Paint.Cap.ROUND);
        ActionBarMenuSubItem addSubItem3 = this.otherItem.addSubItem(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false);
        this.soundItem = addSubItem3;
        addSubItem3.setItemHeight(56);
        ActionBarMenuSubItem addSubItem4 = this.otherItem.addSubItem(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false);
        this.noiseItem = addSubItem4;
        addSubItem4.setItemHeight(56);
        View addDivider = this.otherItem.addDivider(ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_actionBar), -16777216, 0.3f));
        this.soundItemDivider = addDivider;
        ((ViewGroup.MarginLayoutParams) addDivider.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) addDivider.getLayoutParams()).bottomMargin = 0;
        ActionBarMenuSubItem addSubItem5 = this.otherItem.addSubItem(6, R.drawable.msg_edit, this.recordCallDrawable, LocaleController.getString(ChatObject.isChannelOrGiga(this.currentChat) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false);
        this.editTitleItem = addSubItem5;
        ActionBarMenuSubItem addSubItem6 = this.otherItem.addSubItem(7, R.drawable.msg_permissions, this.recordCallDrawable, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false);
        this.permissionItem = addSubItem6;
        ActionBarMenuSubItem addSubItem7 = this.otherItem.addSubItem(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.inviteItem = addSubItem7;
        this.recordCallDrawable = new RecordCallDrawable();
        ActionBarMenuSubItem addSubItem8 = this.otherItem.addSubItem(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.screenItem = addSubItem8;
        ActionBarMenuSubItem addSubItem9 = this.otherItem.addSubItem(5, 0, this.recordCallDrawable, LocaleController.getString(R.string.VoipGroupRecordCall), true, false);
        this.recordItem = addSubItem9;
        this.recordCallDrawable.setParentView(addSubItem9.getImageView());
        ActionBarMenuSubItem addSubItem10 = this.otherItem.addSubItem(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.enableComments = addSubItem10;
        ActionBarMenuSubItem addSubItem11 = this.otherItem.addSubItem(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.disableComments = addSubItem11;
        ActionBarMenuSubItem addSubItem12 = this.otherItem.addSubItem(4, R.drawable.msg_cancel, LocaleController.getString(isConference() ? R.string.VoipGroupEndConference : ChatObject.isChannelOrGiga(this.currentChat) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        this.leaveItem = addSubItem12;
        this.otherItem.setPopupItemsSelectorColor(Theme.getColor(i14));
        this.otherItem.getPopupLayout().setFitItems(true);
        addSubItem10.setColors(Theme.getColor(i16), Theme.getColor(i16));
        addSubItem11.setColors(Theme.getColor(i16), Theme.getColor(i16));
        this.soundItem.setColors(Theme.getColor(i16), Theme.getColor(i16));
        addSubItem4.setColors(Theme.getColor(i16), Theme.getColor(i16));
        int i17 = Theme.key_voipgroup_leaveCallMenu;
        addSubItem12.setColors(Theme.getColor(i17), Theme.getColor(i17));
        addSubItem7.setColors(Theme.getColor(i16), Theme.getColor(i16));
        addSubItem5.setColors(Theme.getColor(i16), Theme.getColor(i16));
        addSubItem6.setColors(Theme.getColor(i16), Theme.getColor(i16));
        addSubItem9.setColors(Theme.getColor(i16), Theme.getColor(i16));
        addSubItem8.setColors(Theme.getColor(i16), Theme.getColor(i16));
        if (this.call != null) {
            initCreatedGroupCall();
        }
        if (isConference()) {
            this.encryptionDrawable = new CallEncryptionCellDrawable(activity);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.encryptionDrawable.setEmojis((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        updateTitle(false);
        this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                GroupCallActivity.this.lambda$new$36(view3);
            }
        });
        this.fullscreenUsersListView = new RecyclerListView(activity) { // from class: org.telegram.ui.GroupCallActivity.24
            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public boolean drawChild(Canvas canvas, View view3, long j) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view3;
                if (!GroupCallActivity.this.renderersContainer.isAnimating() && !GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                    groupCallUserCell.setAlpha(1.0f);
                    groupCallUserCell.setTranslationX(0.0f);
                    groupCallUserCell.setTranslationY(0.0f);
                }
                if (groupCallUserCell.isRemoving(GroupCallActivity.this.fullscreenUsersListView) && groupCallUserCell.getRenderer() != null) {
                    return true;
                }
                if (groupCallUserCell.getTranslationY() != 0.0f && groupCallUserCell.getRenderer() != null && groupCallUserCell.getRenderer().primaryView != null) {
                    float top = GroupCallActivity.this.listView.getTop() - getTop();
                    float f = GroupCallActivity.this.renderersContainer.progressToFullscreenMode;
                    canvas.save();
                    float f2 = 1.0f - f;
                    canvas.clipRect(0.0f, top * f2, getMeasuredWidth(), ((GroupCallActivity.this.listView.getMeasuredHeight() + top) * f2) + (getMeasuredHeight() * f));
                    boolean drawChild = super.drawChild(canvas, view3, j);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view3, j);
            }
        };
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() { // from class: org.telegram.ui.GroupCallActivity.25
            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                GroupCallActivity.this.listView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.updateLayout(true);
            }
        };
        this.fullscreenListItemAnimator = defaultItemAnimator2;
        this.fullscreenUsersListView.setClipToPadding(false);
        defaultItemAnimator2.setDelayAnimations(false);
        defaultItemAnimator2.setTranslationInterpolator(CubicBezierInterpolator.DEFAULT);
        defaultItemAnimator2.setRemoveDuration(350L);
        defaultItemAnimator2.setAddDuration(350L);
        defaultItemAnimator2.setMoveDuration(350L);
        this.fullscreenUsersListView.setItemAnimator(defaultItemAnimator2);
        this.fullscreenUsersListView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.GroupCallActivity.26
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i18, int i19) {
                super.onScrolled(recyclerView, i18, i19);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
            }
        });
        this.fullscreenUsersListView.setClipChildren(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.setOrientation(0);
        this.fullscreenUsersListView.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView5 = this.fullscreenUsersListView;
        GroupCallFullscreenAdapter groupCallFullscreenAdapter = new GroupCallFullscreenAdapter(call, this.currentAccount, this);
        this.fullscreenAdapter = groupCallFullscreenAdapter;
        recyclerListView5.setAdapter(groupCallFullscreenAdapter);
        this.fullscreenAdapter.setVisibility(this.fullscreenUsersListView, false);
        this.fullscreenUsersListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda15
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view3, int i18) {
                GroupCallActivity.this.lambda$new$37(view3, i18);
            }
        });
        this.fullscreenUsersListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda16
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view3, int i18) {
                boolean lambda$new$38;
                lambda$new$38 = GroupCallActivity.this.lambda$new$38(view3, i18);
                return lambda$new$38;
            }
        });
        this.fullscreenUsersListView.setVisibility(8);
        this.fullscreenUsersListView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.GroupCallActivity.27
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view3, RecyclerView recyclerView, RecyclerView.State state) {
                recyclerView.getChildAdapterPosition(view3);
                if (!GroupCallActivity.isLandscapeMode) {
                    rect.set(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                } else {
                    rect.set(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                }
            }
        });
        GroupCallRenderersContainer groupCallRenderersContainer = new GroupCallRenderersContainer(activity, this.listView, this.fullscreenUsersListView, this.attachedRenderers, this.call, this) { // from class: org.telegram.ui.GroupCallActivity.28
            @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
            protected void update() {
                super.update();
                ((BottomSheet) GroupCallActivity.this).navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_actionBarUnscrolled), Theme.getColor(Theme.key_voipgroup_actionBar), Math.max(GroupCallActivity.this.colorProgress, GroupCallActivity.this.renderersContainer == null ? 0.0f : GroupCallActivity.this.renderersContainer.progressToFullscreenMode), 1.0f);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.setColorProgress(groupCallActivity.colorProgress);
            }

            @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer, android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view3, long j) {
                if (view3 == GroupCallActivity.this.scrimRenderer) {
                    return true;
                }
                return super.drawChild(canvas, view3, j);
            }

            @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
            protected void onFullScreenModeChanged(boolean z2) {
                GroupCallActivity.this.delayedGroupCallUpdated = z2;
                if (GroupCallActivity.isTabletMode) {
                    if (z2 || !GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        return;
                    }
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.tabletGridAdapter.setVisibility(groupCallActivity.tabletVideoGridView, false, true);
                    return;
                }
                if (z2) {
                    GroupCallActivity.this.undoView[0].hide(false, 1);
                    GroupCallActivity.this.renderersContainer.undoView[0].hide(false, 2);
                    if (!GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        GroupCallActivity.this.listView.setVisibility(0);
                        GroupCallActivity.this.actionBar.setVisibility(0);
                        if (GroupCallActivity.this.watchersView != null) {
                            GroupCallActivity.this.watchersView.setVisibility(0);
                        }
                    }
                    GroupCallActivity.this.updateState(true, false);
                    GroupCallActivity.this.buttonsContainer.requestLayout();
                    if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() != 0) {
                        GroupCallActivity.this.fullscreenUsersListView.setVisibility(0);
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        groupCallActivity2.fullscreenAdapter.setVisibility(groupCallActivity2.fullscreenUsersListView, true);
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        groupCallActivity3.fullscreenAdapter.update(false, groupCallActivity3.fullscreenUsersListView);
                    } else {
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        groupCallActivity4.fullscreenAdapter.setVisibility(groupCallActivity4.fullscreenUsersListView, true);
                        GroupCallActivity.this.applyCallParticipantUpdates(true);
                    }
                } else {
                    if (GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        GroupCallActivity.this.actionBar.setVisibility(8);
                        GroupCallActivity.this.listView.setVisibility(8);
                        if (GroupCallActivity.this.watchersView != null) {
                            GroupCallActivity.this.watchersView.setVisibility(8);
                        }
                    } else {
                        GroupCallActivity.this.fullscreenUsersListView.setVisibility(8);
                        GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                        groupCallActivity5.fullscreenAdapter.setVisibility(groupCallActivity5.fullscreenUsersListView, false);
                    }
                    if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() == 0) {
                        for (int i18 = 0; i18 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i18++) {
                            View childAt = GroupCallActivity.this.fullscreenUsersListView.getChildAt(i18);
                            childAt.setAlpha(1.0f);
                            childAt.setScaleX(1.0f);
                            childAt.setScaleY(1.0f);
                            childAt.setTranslationX(0.0f);
                            childAt.setTranslationY(0.0f);
                            ((GroupCallFullscreenAdapter.GroupCallUserCell) childAt).setProgressToFullscreen(GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                        }
                    }
                }
                GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(z2 ? 0 : 8);
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    return;
                }
                GroupCallActivity.this.applyCallParticipantUpdates(true);
            }

            @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
            public void onUiVisibilityChanged() {
                if (GroupCallActivity.this.renderersContainer == null) {
                    return;
                }
                GroupCallActivity.this.animatorHideButtons.setValue(!GroupCallActivity.this.renderersContainer.isUiVisible(), true);
            }

            @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
            protected boolean canHideUI() {
                return super.canHideUI() && GroupCallActivity.this.previewDialog == null;
            }

            @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
            protected void onBackPressed() {
                GroupCallActivity.this.lambda$openCrafting$8();
            }
        };
        this.renderersContainer = groupCallRenderersContainer;
        groupCallRenderersContainer.setClipChildren(false);
        this.fullscreenAdapter.setRenderersPool(this.attachedRenderers, this.renderersContainer);
        if (this.tabletVideoGridView != null) {
            this.tabletGridAdapter.setRenderersPool(this.attachedRenderers, this.renderersContainer);
        }
        AvatarPreviewPagerIndicator avatarPreviewPagerIndicator = new AvatarPreviewPagerIndicator(activity) { // from class: org.telegram.ui.GroupCallActivity.29
            @Override // org.telegram.ui.AvatarPreviewPagerIndicator, org.telegram.ui.Components.ProfileGalleryView.Callback
            public void onPhotosLoaded() {
                super.onPhotosLoaded();
                long dialogId = GroupCallActivity.this.avatarsViewPager.getDialogId();
                if (dialogId > 0) {
                    TLRPC.User user = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
                    GroupCallActivity.this.avatarsViewPager.initIfEmpty(null, ImageLocation.getForUserOrChat(GroupCallActivity.this.accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(GroupCallActivity.this.accountInstance.getCurrentAccount(), user, 1), false);
                }
            }
        };
        this.avatarPagerIndicator = avatarPreviewPagerIndicator;
        ProfileGalleryView profileGalleryView = new ProfileGalleryView(activity, this.actionBar, this.listView, avatarPreviewPagerIndicator) { // from class: org.telegram.ui.GroupCallActivity.30
            @Override // android.view.View
            public void invalidate() {
                super.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        };
        this.avatarsViewPager = profileGalleryView;
        profileGalleryView.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        profileGalleryView.setInvalidateWithParent(true);
        avatarPreviewPagerIndicator.setProfileGalleryView(profileGalleryView);
        FrameLayout frameLayout = new FrameLayout(activity) { // from class: org.telegram.ui.GroupCallActivity.31
            final Rect rect = new Rect();
            final RectF rectF = new RectF();
            final Path path = new Path();

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i18, int i19) {
                int min = Math.min(View.MeasureSpec.getSize(i18), View.MeasureSpec.getSize(i19));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(min + getPaddingBottom(), TLObject.FLAG_30));
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                    if (GroupCallActivity.this.scrimView == null || !GroupCallActivity.this.hasScrimAnchorView) {
                        if (GroupCallActivity.this.scrimFullscreenView != null && GroupCallActivity.this.scrimRenderer == null && GroupCallActivity.this.previewTextureTransitionEnabled) {
                            canvas.save();
                            float measuredHeight = (GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight());
                            int dp = (int) (((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight) + (AndroidUtilities.dp(13.0f) * GroupCallActivity.this.progressToAvatarPreview));
                            int i18 = (int) (measuredHeight * (1.0f - GroupCallActivity.this.progressToAvatarPreview));
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(dp, dp, i18, i18);
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().draw(canvas);
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        float measuredHeight2 = (GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight());
                        int dp2 = (int) (((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight2) + (AndroidUtilities.dp(13.0f) * GroupCallActivity.this.progressToAvatarPreview));
                        int i19 = (int) (measuredHeight2 * (1.0f - GroupCallActivity.this.progressToAvatarPreview));
                        GroupCallActivity.this.scrimView.getAvatarWavesDrawable().draw(canvas, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, this);
                        GroupCallActivity.this.scrimView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        GroupCallActivity.this.scrimView.getAvatarImageView().setRoundRadius(dp2, dp2, i19, i19);
                        GroupCallActivity.this.scrimView.getAvatarImageView().getImageReceiver().draw(canvas);
                        GroupCallActivity.this.scrimView.getAvatarImageView().setRoundRadius(GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2);
                        canvas.restore();
                    }
                }
                GroupCallActivity.this.avatarsViewPager.setAlpha(GroupCallActivity.this.progressToAvatarPreview);
                this.path.reset();
                this.rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
                this.path.addRoundRect(this.rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
                canvas.save();
                canvas.clipPath(this.path);
                View findVideoActiveView = GroupCallActivity.this.avatarsViewPager.findVideoActiveView();
                if (findVideoActiveView != null && GroupCallActivity.this.scrimRenderer != null && GroupCallActivity.this.scrimRenderer.isAttached() && !GroupCallActivity.this.drawingForBlur) {
                    canvas.save();
                    this.rect.setEmpty();
                    GroupCallActivity.this.avatarsViewPager.getChildVisibleRect(findVideoActiveView, this.rect, null);
                    int i20 = this.rect.left;
                    if (i20 < (-GroupCallActivity.this.avatarsViewPager.getMeasuredWidth())) {
                        i20 += GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    } else if (i20 > GroupCallActivity.this.avatarsViewPager.getMeasuredWidth()) {
                        i20 -= GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    }
                    canvas.translate(i20, 0.0f);
                    GroupCallActivity.this.scrimRenderer.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override // android.view.View
            public void invalidate() {
                super.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        };
        this.avatarPreviewContainer = frameLayout;
        frameLayout.setVisibility(8);
        profileGalleryView.setVisibility(0);
        profileGalleryView.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: org.telegram.ui.GroupCallActivity.32
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i18) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i18, float f, int i19) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i18) {
                GroupCallActivity.this.avatarsViewPager.getRealPosition(i18);
                GroupCallActivity.this.avatarPagerIndicator.saveCurrentPageProgress();
                GroupCallActivity.this.avatarPagerIndicator.invalidate();
            }
        });
        View view3 = new View(activity) { // from class: org.telegram.ui.GroupCallActivity.33
            @Override // android.view.View
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    GroupCallActivity.this.checkContentOverlayed();
                }
            }
        };
        this.blurredView = view3;
        this.containerView.addView(this.renderersContainer);
        this.renderersContainer.addView(this.fullscreenUsersListView, LayoutHelper.createFrame(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.buttonsContainer.setWillNotDraw(false);
        View view4 = new View(activity);
        this.buttonsBackgroundGradientView = view4;
        int[] iArr = this.gradientColors;
        iArr[0] = this.backgroundColor;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.gradientColors);
        this.buttonsBackgroundGradient = gradientDrawable;
        view4.setBackground(gradientDrawable);
        this.containerView.addView(view4, LayoutHelper.createFrame(-1, 60, 83));
        View view5 = new View(activity);
        this.buttonsBackgroundGradientView2 = view5;
        view5.setBackgroundColor(this.gradientColors[0]);
        this.containerView.addView(view5, LayoutHelper.createFrame(-1, 0, 83));
        GroupCallMessagesListView groupCallMessagesListView = new GroupCallMessagesListView(activity);
        this.groupCallMessagesListView = groupCallMessagesListView;
        groupCallMessagesListView.setDelegate(new GroupCallMessagesListView.Delegate() { // from class: org.telegram.ui.GroupCallActivity.34
            @Override // org.telegram.ui.Components.conference.message.GroupCallMessagesListView.Delegate
            public void showReaction(GroupCallMessageCell groupCallMessageCell, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(GroupCallActivity.this.getContext(), null, GroupCallActivity.this.reactionsContainerLayout, groupCallMessageCell, null, 0.0f, 0.0f, visibleReaction, ((BottomSheet) GroupCallActivity.this).currentAccount, 1, false);
                ReactionsEffectOverlay.currentOverlay = reactionsEffectOverlay;
                reactionsEffectOverlay.windowView.setTag(R.id.parent_tag, 1);
                GroupCallActivity.this.container.addView(reactionsEffectOverlay.windowView);
                reactionsEffectOverlay.started = true;
                reactionsEffectOverlay.startTime = System.currentTimeMillis();
            }
        });
        groupCallMessagesListView.setClickCellDelegate(new GroupCallMessageCell.Delegate() { // from class: org.telegram.ui.GroupCallActivity.35
            @Override // org.telegram.ui.Components.conference.message.GroupCallMessageCell.Delegate
            public void didClickAvatar(GroupCallMessageCell groupCallMessageCell, GroupCallMessage groupCallMessage, float f, float f2) {
                openSenderProfile(groupCallMessage);
            }

            @Override // org.telegram.ui.Components.conference.message.GroupCallMessageCell.Delegate
            public void didClickSenderName(GroupCallMessageCell groupCallMessageCell, GroupCallMessage groupCallMessage) {
                openSenderProfile(groupCallMessage);
            }

            private void openSenderProfile(GroupCallMessage groupCallMessage) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                if (!(lastFragment instanceof ProfileActivity) || ((ProfileActivity) lastFragment).getDialogId() != groupCallMessage.fromId) {
                    int calculateScrollTopOffset = GroupCallActivity.this.calculateScrollTopOffset();
                    Bundle bundle = new Bundle();
                    long j = groupCallMessage.fromId;
                    if (j > 0) {
                        bundle.putLong("user_id", j);
                    } else {
                        bundle.putLong("chat_id", -j);
                    }
                    long j2 = groupCallMessage.fromId;
                    boolean z2 = true;
                    if (j2 == GroupCallActivity.this.accountInstance.getUserConfig().getClientUserId()) {
                        bundle.putBoolean("my_profile", true);
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle);
                    if (calculateScrollTopOffset > 0 && calculateScrollTopOffset != Integer.MAX_VALUE) {
                        z2 = false;
                    }
                    lastFragment.presentFragment(profileActivity, false, z2);
                    GroupCallActivity.this.dismiss();
                    return;
                }
                GroupCallActivity.this.dismiss();
            }
        });
        if (this.call != null) {
            groupCallMessagesListView.setGroupCall(this.accountInstance.getCurrentAccount(), this.call.getInputGroupCall(false));
        }
        this.containerView.addView(groupCallMessagesListView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(activity, false, true, true);
        this.limitTextView = animatedTextView;
        animatedTextView.setGravity(17);
        animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView.setTextColor(-1);
        animatedTextView.setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.buttonsContainer);
        EditTextEmoji editTextEmoji = new EditTextEmoji(activity, this.sizeNotifierFrameLayout, LaunchActivity.getLastFragment(), 5, true, this.resourcesProvider) { // from class: org.telegram.ui.GroupCallActivity.36
            @Override // org.telegram.ui.Components.EditTextEmoji
            protected boolean allowSearch() {
                return true;
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i18, int i19) {
                super.onMeasure(i18, i19);
                if (GroupCallActivity.this.animatorMessageInputHeight.getFactor() == 0.0f) {
                    GroupCallActivity.this.animatorMessageInputHeight.forceFactor(getMeasuredHeight());
                } else {
                    GroupCallActivity.this.animatorMessageInputHeight.animateTo(getMeasuredHeight());
                }
            }

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view6, long j) {
                if (view6 == getEditText()) {
                    canvas.save();
                    GroupCallActivity.this.callMessageEnterView.getEditText().setTranslationY(view6.getMeasuredHeight() - GroupCallActivity.this.animatorMessageInputHeight.getFactor());
                    boolean drawChild = super.drawChild(canvas, view6, j);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view6, j);
            }

            @Override // org.telegram.ui.Components.EditTextEmoji
            protected void updatedEmojiExpanded() {
                super.updatedEmojiExpanded();
                ((BottomSheet) GroupCallActivity.this).containerView.requestApplyInsets();
            }

            @Override // org.telegram.ui.Components.EditTextEmoji
            protected void onEmojiKeyboardUpdate() {
                int max;
                super.onEmojiKeyboardUpdate();
                if (isPopupShowing()) {
                    max = Math.max(0, getEmojiPadding());
                } else {
                    max = isWaitingForKeyboardOpen() ? Math.max(0, getKeyboardHeight()) : 0;
                }
                if (max > 0) {
                    GroupCallActivity.this.windowInsetsStateHolder.requestInAppKeyboardHeight(max);
                } else {
                    GroupCallActivity.this.windowInsetsStateHolder.resetInAppKeyboardHeight(false);
                }
            }

            @Override // org.telegram.ui.Components.EditTextEmoji
            protected void createEmojiView() {
                super.createEmojiView();
                EmojiView emojiView = getEmojiView();
                if (emojiView != null) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    emojiView.setBottomInset(((BottomSheet) GroupCallActivity.this).containerView.getPaddingBottom());
                }
            }
        };
        this.callMessageEnterView = editTextEmoji;
        editTextEmoji.includeNavigationBar = true;
        editTextEmoji.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxGroupCallMessageLength)});
        editTextEmoji.getEditText().setLinkTextColor(-11683585);
        editTextEmoji.setHint(LocaleController.getString(R.string.TypeMessage));
        editTextEmoji.getEditText().addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.GroupCallActivity.37
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i18, int i19, int i20) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i18, int i19, int i20) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String str2;
                GroupCallActivity.this.animatorMessageIsEmpty.setValue(TextUtils.isEmpty(editable), true);
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                int i18 = GroupCallActivity.this.maxGroupCallMessageLength;
                if (codePointCount + 25 > i18) {
                    str2 = "" + (i18 - codePointCount);
                } else {
                    str2 = null;
                }
                GroupCallActivity.this.limitTextView.cancelAnimation();
                GroupCallActivity.this.limitTextView.setText(str2);
                GroupCallActivity.this.limitTextView.setTextColor(codePointCount >= i18 ? -1280137 : -1);
                if (codePointCount > i18) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
            }
        });
        editTextEmoji.onResume();
        FrameLayout frameLayout2 = new FrameLayout(activity) { // from class: org.telegram.ui.GroupCallActivity.38
            private final RectF tmpRect = new RectF();
            private final RectF tmpRect2 = new RectF();
            private final RectF tmpRect3 = new RectF();
            private final Paint backgroundPaint = new Paint(1);

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                this.tmpRect.set(0.0f, (GroupCallActivity.this.callMessageEnterContainer.getY() + GroupCallActivity.this.callMessageEnterContainer.getMeasuredHeight()) - GroupCallActivity.this.animatorMessageInputHeight.getFactor(), getMeasuredWidth(), getMeasuredHeight());
                this.tmpRect2.set(0.0f, GroupCallActivity.this.callMessageEnterContainer.getY() + GroupCallActivity.this.callMessageEnterContainer.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                this.tmpRect3.set(0.0f, (GroupCallActivity.this.callMessageEnterContainer.getY() + GroupCallActivity.this.callMessageEnterContainer.getMeasuredHeight()) - GroupCallActivity.this.animatorMessageInputHeight.getFactor(), getMeasuredWidth(), GroupCallActivity.this.callMessageEnterContainer.getY() + GroupCallActivity.this.callMessageEnterContainer.getMeasuredHeight());
                if (Build.VERSION.SDK_INT >= 29 && GroupCallActivity.this.renderNodeBlur != null && canvas.isHardwareAccelerated()) {
                    this.backgroundPaint.setColor(-14933463);
                    canvas.drawRect(this.tmpRect, this.backgroundPaint);
                    canvas.save();
                    canvas.clipRect(this.tmpRect);
                    canvas.translate(-getX(), -getY());
                    canvas.scale(GroupCallActivity.this.renderNodeBlurScale, GroupCallActivity.this.renderNodeBlurScale);
                    canvas.drawRenderNode(GroupCallActivity.this.renderNodeBlur);
                    canvas.restore();
                    this.backgroundPaint.setColor(234881023);
                    canvas.drawRect(this.tmpRect2, this.backgroundPaint);
                } else {
                    this.backgroundPaint.setColor(-14933463);
                    canvas.drawRect(this.tmpRect3, this.backgroundPaint);
                    this.backgroundPaint.setColor(ColorUtils.compositeColors(234881023, -14933463));
                    canvas.drawRect(this.tmpRect2, this.backgroundPaint);
                }
                super.dispatchDraw(canvas);
            }
        };
        this.callMessageEnterUnderContainer = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity) { // from class: org.telegram.ui.GroupCallActivity.39
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (getAlpha() <= 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.callMessageEnterContainer = frameLayout3;
        frameLayout3.addView(editTextEmoji, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        frameLayout3.addView(animatedTextView, LayoutHelper.createFrame(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        animatedTextView.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, -2, 80));
        ImageView imageView3 = new ImageView(activity);
        this.callMessageHideButton = imageView3;
        int i18 = Theme.key_listSelector;
        imageView3.setBackground(Theme.createSelectorDrawable(getThemedColor(i18)));
        int color2 = Theme.getColor(Theme.key_graySectionText, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(color2, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                GroupCallActivity.this.lambda$new$39(view6);
            }
        });
        ImageView imageView4 = new ImageView(activity);
        this.callMessageSendButton = imageView4;
        imageView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i18)));
        imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                GroupCallActivity.this.lambda$new$40(view6);
            }
        });
        frameLayout3.addView(imageView3, LayoutHelper.createFrame(48, 48, 85));
        frameLayout3.addView(imageView4, LayoutHelper.createFrame(48, 48, 85));
        this.containerView.addView(view3);
        frameLayout.addView(profileGalleryView, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout.addView(avatarPreviewPagerIndicator, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        applyCallParticipantUpdates(false);
        this.listAdapter.notifyDataSetChanged();
        if (isTabletMode) {
            this.tabletGridAdapter.update(false, this.tabletVideoGridView);
        }
        this.oldCount = this.listAdapter.getItemCount();
        if (inputPeer != null) {
            TextView textView2 = new TextView(activity);
            this.scheduleInfoTextView = textView2;
            textView2.setGravity(17);
            this.scheduleInfoTextView.setTextColor(-8682615);
            this.scheduleInfoTextView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.currentChat) && (chat2 = this.currentChat) != null && !chat2.megagroup) {
                this.scheduleInfoTextView.setTag(1);
            }
            this.containerView.addView(this.scheduleInfoTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            final NumberPicker numberPicker = new NumberPicker(activity);
            numberPicker.setTextColor(-1);
            numberPicker.setSelectorColor(-9598483);
            numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
            numberPicker.setItemCount(5);
            final NumberPicker numberPicker2 = new NumberPicker(activity) { // from class: org.telegram.ui.GroupCallActivity.40
                @Override // org.telegram.ui.Components.NumberPicker
                protected CharSequence getContentDescription(int i19) {
                    return LocaleController.formatPluralString("Hours", i19, new Object[0]);
                }
            };
            numberPicker2.setItemCount(5);
            numberPicker2.setTextColor(-1);
            numberPicker2.setSelectorColor(-9598483);
            numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
            final NumberPicker numberPicker3 = new NumberPicker(activity) { // from class: org.telegram.ui.GroupCallActivity.41
                @Override // org.telegram.ui.Components.NumberPicker
                protected CharSequence getContentDescription(int i19) {
                    return LocaleController.formatPluralString("Minutes", i19, new Object[0]);
                }
            };
            numberPicker3.setItemCount(5);
            numberPicker3.setTextColor(-1);
            numberPicker3.setSelectorColor(-9598483);
            numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
            TextView textView3 = new TextView(activity) { // from class: org.telegram.ui.GroupCallActivity.42
                private final Paint tmpPaint;
                private final RectF tmpRectF = new RectF();

                {
                    Paint paint5 = new Paint(1);
                    this.tmpPaint = paint5;
                    paint5.setStyle(Paint.Style.FILL);
                    paint5.setColor(-16711936);
                }

                @Override // android.widget.TextView, android.view.View
                protected void onMeasure(int i19, int i20) {
                    super.onMeasure(i19, i20);
                }

                @Override // android.view.View
                public void draw(Canvas canvas) {
                    super.draw(canvas);
                }

                @Override // android.widget.TextView, android.view.View
                protected void onDraw(Canvas canvas) {
                    this.tmpPaint.setColor(-16711936);
                    this.tmpRectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(this.tmpRectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.tmpPaint);
                    super.onDraw(canvas);
                }

                @Override // android.view.View
                protected void dispatchDraw(Canvas canvas) {
                    this.tmpRectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(this.tmpRectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.tmpPaint);
                    super.dispatchDraw(canvas);
                }
            };
            this.scheduleButtonTextView = textView3;
            textView3.setLines(1);
            this.scheduleButtonTextView.setSingleLine(true);
            this.scheduleButtonTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.scheduleButtonTextView.setGravity(17);
            this.scheduleButtonTextView.setTextColor(-1);
            this.scheduleButtonTextView.setTypeface(AndroidUtilities.bold());
            this.scheduleButtonTextView.setTextSize(1, 14.0f);
            this.containerView.addView(this.scheduleButtonTextView, LayoutHelper.createFrame(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            this.scheduleButtonTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    GroupCallActivity.this.lambda$new$45(numberPicker, numberPicker2, numberPicker3, chat, accountInstance, inputPeer3, view6);
                }
            });
            LinearLayout linearLayout3 = new LinearLayout(activity) { // from class: org.telegram.ui.GroupCallActivity.44
                boolean ignoreLayout = false;

                @Override // android.widget.LinearLayout, android.view.View
                protected void onMeasure(int i19, int i20) {
                    this.ignoreLayout = true;
                    numberPicker.setItemCount(5);
                    numberPicker2.setItemCount(5);
                    numberPicker3.setItemCount(5);
                    numberPicker.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker3.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    this.ignoreLayout = false;
                    super.onMeasure(i19, i20);
                }

                @Override // android.view.View, android.view.ViewParent
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.scheduleTimerContainer = linearLayout3;
            linearLayout3.setWeightSum(1.0f);
            this.scheduleTimerContainer.setOrientation(0);
            this.containerView.addView(this.scheduleTimerContainer, LayoutHelper.createFrame(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            final long currentTimeMillis = System.currentTimeMillis();
            final Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            final int i19 = calendar.get(1);
            int i20 = calendar.get(6);
            this.scheduleTimerContainer.addView(numberPicker, LayoutHelper.createLinear(0, NotificationCenter.locationPermissionGranted, 0.5f));
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(365);
            numberPicker.setWrapSelectorWheel(false);
            numberPicker.setFormatter(new NumberPicker.Formatter() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda21
                @Override // org.telegram.ui.Components.NumberPicker.Formatter
                public final String format(int i21) {
                    String lambda$new$46;
                    lambda$new$46 = GroupCallActivity.lambda$new$46(currentTimeMillis, calendar, i19, i21);
                    return lambda$new$46;
                }
            });
            NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda22
                @Override // org.telegram.ui.Components.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker4, int i21, int i22) {
                    GroupCallActivity.this.lambda$new$47(numberPicker, numberPicker2, numberPicker3, numberPicker4, i21, i22);
                }
            };
            numberPicker.setOnValueChangedListener(onValueChangeListener);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(23);
            this.scheduleTimerContainer.addView(numberPicker2, LayoutHelper.createLinear(0, NotificationCenter.locationPermissionGranted, 0.2f));
            numberPicker2.setFormatter(new NumberPicker.Formatter() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda23
                @Override // org.telegram.ui.Components.NumberPicker.Formatter
                public final String format(int i21) {
                    String lambda$new$48;
                    lambda$new$48 = GroupCallActivity.lambda$new$48(i21);
                    return lambda$new$48;
                }
            });
            numberPicker2.setOnValueChangedListener(onValueChangeListener);
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(59);
            numberPicker3.setValue(0);
            numberPicker3.setFormatter(new NumberPicker.Formatter() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda24
                @Override // org.telegram.ui.Components.NumberPicker.Formatter
                public final String format(int i21) {
                    String lambda$new$49;
                    lambda$new$49 = GroupCallActivity.lambda$new$49(i21);
                    return lambda$new$49;
                }
            });
            this.scheduleTimerContainer.addView(numberPicker3, LayoutHelper.createLinear(0, NotificationCenter.locationPermissionGranted, 0.3f));
            numberPicker3.setOnValueChangedListener(onValueChangeListener);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i21 = calendar.get(6);
            int i22 = calendar.get(12);
            int i23 = calendar.get(11);
            numberPicker.setValue(i20 == i21 ? 0 : 1);
            numberPicker3.setValue(i22);
            numberPicker2.setValue(i23);
            AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
        }
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper((ViewGroup) getWindow().getDecorView(), this.containerView) { // from class: org.telegram.ui.GroupCallActivity.45
            @Override // org.telegram.ui.PinchToZoomHelper
            protected void invalidateViews() {
                super.invalidateViews();
                for (int i24 = 0; i24 < GroupCallActivity.this.avatarsViewPager.getChildCount(); i24++) {
                    GroupCallActivity.this.avatarsViewPager.getChildAt(i24).invalidate();
                }
            }

            @Override // org.telegram.ui.PinchToZoomHelper
            protected void drawOverlays(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
                if (f > 0.0f) {
                    float x = GroupCallActivity.this.avatarPreviewContainer.getX() + ((BottomSheet) GroupCallActivity.this).containerView.getX();
                    float y = GroupCallActivity.this.avatarPreviewContainer.getY() + ((BottomSheet) GroupCallActivity.this).containerView.getY();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(x, y, GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() + x, GroupCallActivity.this.avatarsViewPager.getMeasuredHeight() + y);
                    canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                    canvas.translate(x, y);
                    GroupCallActivity.this.avatarPreviewContainer.draw(canvas);
                    canvas.restore();
                }
            }
        };
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() { // from class: org.telegram.ui.GroupCallActivity.46
            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public /* synthetic */ TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.-CC.$default$getCurrentTextureView(this);
            }

            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public void onZoomStarted(MessageObject messageObject) {
                GroupCallActivity.this.listView.cancelClickRunnables(true);
                GroupCallActivity.this.pinchToZoomHelper.getPhotoImage().setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public void onZoomFinished(MessageObject messageObject) {
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        profileGalleryView.setPinchToZoomHelper(this.pinchToZoomHelper);
        this.cameraButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                GroupCallActivity.this.lambda$new$50(activity, view6);
            }
        });
        updateScheduleUI(false);
        updateItems();
        updateSpeakerPhoneIcon(false);
        updateState(false, false);
        setColorProgress(0.0f);
        updateSubtitle();
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.bulletinContainer = frameLayout4;
        this.containerView.addView(frameLayout4, LayoutHelper.createFrame(-1, NotificationCenter.dialogPhotosUpdate, 87));
        this.messageButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                GroupCallActivity.this.lambda$new$51(view6);
            }
        });
        checkGroupCallUi();
        ScaleStateListAnimator.apply(this.cameraButton);
        ScaleStateListAnimator.apply(this.soundButton);
        ScaleStateListAnimator.apply(this.flipButton);
        ScaleStateListAnimator.apply(this.speakerButton);
        ScaleStateListAnimator.apply(this.muteButton);
        ScaleStateListAnimator.apply(this.leaveButton);
        ScaleStateListAnimator.apply(this.messageButton);
        ViewCompat.setOnApplyWindowInsetsListener(this.containerView, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda27
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view6, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets;
                onApplyWindowInsets = GroupCallActivity.this.onApplyWindowInsets(view6, windowInsetsCompat);
                return onApplyWindowInsets;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$9(DialogInterface dialogInterface) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (this.anyEnterEventSent && (safeLastFragment instanceof ChatActivity)) {
            ((ChatActivity) safeLastFragment).onEditTextDialogClose(true, true);
        }
    }

    class 6 extends ActionBar.ActionBarMenuOnItemClick {
        final /* synthetic */ Activity val$context;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onItemClick$8(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        6(Activity activity) {
            this.val$context = activity;
        }

        @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
        public void onItemClick(int i) {
            VoIPService sharedInstance;
            int i2;
            int color;
            if (i == -1) {
                GroupCallActivity.this.lambda$openCrafting$8();
                return;
            }
            if (i == 1) {
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.call.call.join_muted = false;
                groupCallActivity.toggleAdminSpeak();
                return;
            }
            if (i == 2) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.call.call.join_muted = true;
                groupCallActivity2.toggleAdminSpeak();
                return;
            }
            if (i == 3) {
                GroupCallActivity.this.getLink(false);
                return;
            }
            if (i == 12) {
                GroupCallActivity.this.setCommentsEnabled(true);
                return;
            }
            if (i == 13) {
                GroupCallActivity.this.setCommentsEnabled(false);
                return;
            }
            if (i == 4) {
                AlertDialog.Builder builder = new AlertDialog.Builder(GroupCallActivity.this.getContext());
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder.setTitle(LocaleController.getString(R.string.VoipChannelEndAlertTitle));
                    builder.setMessage(LocaleController.getString(R.string.VoipChannelEndAlertText));
                } else {
                    builder.setTitle(LocaleController.getString(R.string.VoipGroupEndAlertTitle));
                    builder.setMessage(LocaleController.getString(R.string.VoipGroupEndAlertText));
                }
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupEnd), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda0
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        GroupCallActivity.6.this.lambda$onItemClick$1(alertDialog, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog create = builder.create();
                create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
                create.show();
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_voipgroup_leaveCallMenu));
                }
                create.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
                return;
            }
            if (i == 9) {
                GroupCallActivity.this.screenShareItem.callOnClick();
                return;
            }
            if (i == 5) {
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                ChatObject.Call call = groupCallActivity3.call;
                if (call.recording) {
                    final boolean z = call.call.record_video_active;
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(groupCallActivity3.getContext());
                    builder2.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                    builder2.setTitle(LocaleController.getString(R.string.VoipGroupStopRecordingTitle));
                    if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                        builder2.setMessage(LocaleController.getString(R.string.VoipChannelStopRecordingText));
                    } else {
                        builder2.setMessage(LocaleController.getString(R.string.VoipGroupStopRecordingText));
                    }
                    builder2.setPositiveButton(LocaleController.getString(R.string.Stop), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda1
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i3) {
                            GroupCallActivity.6.this.lambda$onItemClick$2(z, alertDialog, i3);
                        }
                    });
                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    AlertDialog create2 = builder2.create();
                    create2.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
                    create2.show();
                    create2.setTextColor(Theme.getColor(Theme.key_voipgroup_nameText));
                    return;
                }
                Context context = GroupCallActivity.this.getContext();
                GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                1 r14 = new 1(context, groupCallActivity4.currentChat, groupCallActivity4.hasVideo);
                if (GroupCallActivity.this.isRtmpStream()) {
                    r14.onStartRecord(2);
                    return;
                } else {
                    r14.show();
                    return;
                }
            }
            if (i == 7) {
                GroupCallActivity.this.changingPermissions = true;
                GroupCallActivity.this.everyoneItem.setVisibility(0);
                GroupCallActivity.this.adminItem.setVisibility(0);
                GroupCallActivity.this.inviteItem.setVisibility(8);
                GroupCallActivity.this.enableComments.setVisibility(8);
                GroupCallActivity.this.disableComments.setVisibility(8);
                GroupCallActivity.this.leaveItem.setVisibility(8);
                GroupCallActivity.this.permissionItem.setVisibility(8);
                GroupCallActivity.this.editTitleItem.setVisibility(8);
                GroupCallActivity.this.recordItem.setVisibility(8);
                GroupCallActivity.this.screenItem.setVisibility(8);
                GroupCallActivity.this.accountSelectCell.setVisibility(8);
                GroupCallActivity.this.soundItem.setVisibility(8);
                GroupCallActivity.this.noiseItem.setVisibility(8);
                GroupCallActivity.this.otherItem.forceUpdatePopupPosition();
                return;
            }
            if (i == 6) {
                GroupCallActivity.this.enterEventSent = false;
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(GroupCallActivity.this.getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(GroupCallActivity.this.getContext(), true));
                final AlertDialog.Builder builder3 = new AlertDialog.Builder(GroupCallActivity.this.getContext());
                builder3.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder3.setTitle(LocaleController.getString(R.string.VoipChannelTitle));
                } else {
                    builder3.setTitle(LocaleController.getString(R.string.VoipGroupTitle));
                }
                builder3.setCheckFocusable(false);
                builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda2
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                LinearLayout linearLayout = new LinearLayout(GroupCallActivity.this.getContext());
                linearLayout.setOrientation(1);
                builder3.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i3 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(i3));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(6);
                TLRPC.Chat chat = GroupCallActivity.this.currentChat;
                editTextBoldCursor.setHint(chat != null ? chat.title : "");
                editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_voipgroup_lastSeenText));
                editTextBoldCursor.setCursorColor(Theme.getColor(i3));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda3
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView2, int i4, KeyEvent keyEvent) {
                        boolean lambda$onItemClick$4;
                        lambda$onItemClick$4 = GroupCallActivity.6.lambda$onItemClick$4(AlertDialog.Builder.this, textView2, i4, keyEvent);
                        return lambda$onItemClick$4;
                    }
                });
                editTextBoldCursor.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.GroupCallActivity.6.2
                    boolean ignoreTextChange;

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        if (!this.ignoreTextChange && editable.length() > 40) {
                            this.ignoreTextChange = true;
                            editable.delete(40, editable.length());
                            AndroidUtilities.shakeView(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            this.ignoreTextChange = false;
                        }
                    }
                });
                if (!TextUtils.isEmpty(GroupCallActivity.this.call.call.title)) {
                    editTextBoldCursor.setText(GroupCallActivity.this.call.call.title);
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
                builder3.setPositiveButton(LocaleController.getString(R.string.Save), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda4
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        GroupCallActivity.6.this.lambda$onItemClick$5(editTextBoldCursor, builder3, alertDialog, i4);
                    }
                });
                final AlertDialog create3 = builder3.create();
                create3.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
                create3.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda5
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        GroupCallActivity.6.this.lambda$onItemClick$6(create3, editTextBoldCursor, dialogInterface);
                    }
                });
                create3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda6
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                create3.show();
                create3.setTextColor(Theme.getColor(i3));
                editTextBoldCursor.requestFocus();
                return;
            }
            if (i == 8) {
                JoinCallAlert.open(GroupCallActivity.this.getContext(), -GroupCallActivity.this.getChatId(), GroupCallActivity.this.accountInstance, null, 2, GroupCallActivity.this.selfPeer, new JoinCallAlert.JoinCallAlertDelegate() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda7
                    @Override // org.telegram.ui.Components.JoinCallAlert.JoinCallAlertDelegate
                    public final void didSelectChat(TLRPC.InputPeer inputPeer, boolean z2, boolean z3, boolean z4) {
                        GroupCallActivity.6.this.lambda$onItemClick$9(inputPeer, z2, z3, z4);
                    }
                });
                return;
            }
            if (i == 11) {
                SharedConfig.toggleNoiseSupression();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 == null) {
                    return;
                }
                sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
                return;
            }
            if (i != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                arrayList.add(LocaleController.getString(sharedInstance.isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
                arrayList3.add(1);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str = sharedInstance.currentBluetoothDeviceName;
                if (str == null) {
                    str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_voice_bluetooth));
                arrayList3.add(2);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                charSequenceArr[i4] = (CharSequence) arrayList.get(i4);
                iArr[i4] = ((Integer) arrayList2.get(i4)).intValue();
            }
            BottomSheet.Builder items = new BottomSheet.Builder(this.val$context).setTitle(LocaleController.getString(R.string.VoipSelectAudioOutput), true).setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    GroupCallActivity.6.this.lambda$onItemClick$11(arrayList3, dialogInterface, i5);
                }
            });
            BottomSheet create4 = items.create();
            int i5 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
            create4.setBackgroundColor(Theme.getColor(i5));
            create4.fixNavigationBar(Theme.getColor(i5));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i2 = 0;
            } else {
                i2 = sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
            }
            items.show();
            create4.setTitleColor(Theme.getColor(Theme.key_voipgroup_nameText));
            for (int i6 = 0; i6 < create4.getItemViews().size(); i6++) {
                BottomSheet.BottomSheetCell bottomSheetCell = create4.getItemViews().get(i6);
                if (i6 == i2) {
                    color = Theme.getColor(Theme.key_voipgroup_listeningText);
                    bottomSheetCell.isSelected = true;
                } else {
                    color = Theme.getColor(Theme.key_voipgroup_nameText);
                }
                bottomSheetCell.setTextColor(color);
                bottomSheetCell.setIconColor(color);
                bottomSheetCell.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_actionBarItems), 12), 2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$1(AlertDialog alertDialog, int i) {
            if (GroupCallActivity.this.call.isScheduled()) {
                TLRPC.ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.getChatId());
                if (chatFull != null) {
                    chatFull.flags &= -2097153;
                    chatFull.call = null;
                    GroupCallActivity.this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(GroupCallActivity.this.getChatId()), Long.valueOf(GroupCallActivity.this.call.call.id), Boolean.FALSE);
                }
                TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                discardgroupcall.call = GroupCallActivity.this.call.getInputGroupCall();
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda10
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        GroupCallActivity.6.this.lambda$onItemClick$0(tLObject, tL_error);
                    }
                });
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().hangUp(1);
            }
            GroupCallActivity.this.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$0(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.TL_updates) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$2(boolean z, AlertDialog alertDialog, int i) {
            GroupCallActivity.this.call.toggleRecord(null, 0);
            GroupCallActivity.this.getUndoView().showWithAction(0L, z ? 101 : 40, (Runnable) null);
        }

        class 1 extends GroupCallRecordAlert {
            1(Context context, TLRPC.Chat chat, boolean z) {
                super(context, chat, z);
            }

            @Override // org.telegram.ui.Components.GroupCallRecordAlert
            public void onStartRecord(final int i) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                GroupCallActivity.this.enterEventSent = false;
                builder.setTitle(LocaleController.getString(R.string.VoipGroupStartRecordingTitle));
                if (i == 0) {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText));
                } else if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText));
                } else {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText));
                }
                builder.setCheckFocusable(false);
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(getContext(), Theme.getColor(Theme.key_voipgroup_windowBackgroundWhiteInputField), Theme.getColor(Theme.key_voipgroup_windowBackgroundWhiteInputFieldActivated)));
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i2 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(i2));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_voipgroup_lastSeenText));
                editTextBoldCursor.setCursorColor(Theme.getColor(i2));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 0, 24, 12));
                editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda0
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                        boolean lambda$onStartRecord$0;
                        lambda$onStartRecord$0 = GroupCallActivity.6.1.lambda$onStartRecord$0(AlertDialog.Builder.this, textView, i3, keyEvent);
                        return lambda$onStartRecord$0;
                    }
                });
                final AlertDialog create = builder.create();
                create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        GroupCallActivity.6.1.this.lambda$onStartRecord$1(create, editTextBoldCursor, dialogInterface);
                    }
                });
                create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda2
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                builder.setPositiveButton(LocaleController.getString(R.string.Start), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda3
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        GroupCallActivity.6.1.this.lambda$onStartRecord$3(editTextBoldCursor, i, alertDialog, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda4
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                AlertDialog create2 = builder.create();
                create2.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
                create2.show();
                create2.setTextColor(Theme.getColor(i2));
                editTextBoldCursor.requestFocus();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ boolean lambda$onStartRecord$0(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
                AndroidUtilities.hideKeyboard(textView);
                builder.create().getButton(-1).callOnClick();
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onStartRecord$1(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
                GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onStartRecord$3(EditTextBoldCursor editTextBoldCursor, int i, AlertDialog alertDialog, int i2) {
                GroupCallActivity.this.call.toggleRecord(editTextBoldCursor.getText().toString(), i);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                GroupCallActivity.this.getUndoView().showWithAction(0L, i == 0 ? 39 : 100, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onItemClick$4(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
            AndroidUtilities.hideKeyboard(textView);
            builder.create().getButton(-1).callOnClick();
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$5(EditTextBoldCursor editTextBoldCursor, AlertDialog.Builder builder, AlertDialog alertDialog, int i) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            GroupCallActivity.this.call.setTitle(editTextBoldCursor.getText().toString());
            builder.getDismissRunnable().run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$6(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
            GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$9(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
            TLObject chat;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null) {
                return;
            }
            boolean z4 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z4) {
                chat = groupCallActivity.accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id));
            } else {
                chat = inputPeer instanceof TLRPC.TL_inputPeerChat ? groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = chat;
            if (GroupCallActivity.this.call.isScheduled()) {
                GroupCallActivity.this.getUndoView().showWithAction(0L, 37, tLObject, GroupCallActivity.this.currentChat, (Runnable) null, (Runnable) null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    GroupCallActivity.this.selfPeer = new TLRPC.TL_peerChannel();
                    GroupCallActivity.this.selfPeer.channel_id = inputPeer.channel_id;
                } else if (z4) {
                    GroupCallActivity.this.selfPeer = new TLRPC.TL_peerUser();
                    GroupCallActivity.this.selfPeer.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    GroupCallActivity.this.selfPeer = new TLRPC.TL_peerChat();
                    GroupCallActivity.this.selfPeer.chat_id = inputPeer.chat_id;
                }
                GroupCallActivity.this.schedulePeer = inputPeer;
                TLRPC.ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.getChatId());
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = GroupCallActivity.this.selfPeer;
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.flags |= 32768;
                    } else {
                        chatFull.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(GroupCallActivity.this.currentChat);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda11
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        GroupCallActivity.6.lambda$onItemClick$8(tLObject2, tL_error);
                    }
                });
                GroupCallActivity.this.updateItems();
                return;
            }
            if (VoIPService.getSharedInstance() == null || !z) {
                return;
            }
            GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            GroupCallActivity.this.userSwitchObject = tLObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$11(ArrayList arrayList, DialogInterface dialogInterface, int i) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            Integer num = (Integer) arrayList.get(i);
            final int intValue = num.intValue();
            GroupCallActivity.this.cacheAudioOutputValue = num;
            GroupCallActivity.this.updateState(true, true);
            GroupCallActivity.this.cacheAudioOutputValue = null;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.6.this.lambda$onItemClick$10(intValue);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$10(int i) {
            GroupCallActivity.this.setAudioOutputValue(i);
            BulletinFactory.of(GroupCallActivity.this.topBulletinContainer, new DarkBlueThemeResourcesProvider()).createSimpleBulletin(GroupCallActivity.this.getContext().getResources().getDrawable(GroupCallActivity.this.getAudioOutputToastIcon(i)).mutate(), GroupCallActivity.this.getAudioOutputToastText(i)).show(GroupCallActivity.this.isBulletinTop());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$10(int[] iArr, float[] fArr, boolean[] zArr) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        for (int i = 0; i < iArr.length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.call.participantsBySources.get(iArr[i]);
            if (groupCallParticipant != null) {
                if (!this.renderersContainer.inFullscreenMode) {
                    int indexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(indexOf + this.listAdapter.usersStartRow)) != null) {
                        View view = findViewHolderForAdapterPosition.itemView;
                        if (view instanceof GroupCallUserCell) {
                            ((GroupCallUserCell) view).setAmplitude(fArr[i] * 15.0f);
                            if (findViewHolderForAdapterPosition.itemView == this.scrimView && !this.contentFullyOverlayed) {
                                this.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < this.fullscreenUsersListView.getChildCount(); i2++) {
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) this.fullscreenUsersListView.getChildAt(i2);
                        if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            groupCallUserCell.setAmplitude(fArr[i] * 15.0f);
                        }
                    }
                }
                this.renderersContainer.setAmplitude(groupCallParticipant, fArr[i] * 15.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$24(Activity activity, final ChatObject.Call call, View view, int i, float f, float f2) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        if (view instanceof GroupCallGridCell) {
            fullscreenFor(((GroupCallGridCell) view).getParticipant());
            return;
        }
        if (view instanceof GroupCallUserCell) {
            showMenuForCell((GroupCallUserCell) view);
            return;
        }
        r15 = null;
        r15 = null;
        r15 = null;
        final Long l = null;
        boolean z = false;
        if (view instanceof GroupCallInvitedCell) {
            GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) view;
            if (groupCallInvitedCell.getUser() == null) {
                return;
            }
            if (!isConference()) {
                this.parentActivity.switchToAccount(this.currentAccount, true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", groupCallInvitedCell.getUser().id);
                if (groupCallInvitedCell.hasAvatarSet()) {
                    bundle.putBoolean("expandPhoto", true);
                }
                this.parentActivity.lambda$runLinkRequest$100(new ProfileActivity(bundle));
                dismiss();
                return;
            }
            if (i - this.listAdapter.shadyJoinStartRow < 0 || i - this.listAdapter.shadyJoinStartRow >= this.call.shadyJoinParticipants.size()) {
                if (i - this.listAdapter.shadyLeftStartRow < 0 || i - this.listAdapter.shadyLeftStartRow >= this.call.shadyLeftParticipants.size()) {
                    int i2 = i - this.listAdapter.invitedStartRow;
                    if (this.delayedGroupCallUpdated) {
                        if (i2 >= 0 && i2 < this.oldInvited.size()) {
                            l = (Long) this.oldInvited.get(i2);
                        }
                    } else if (i2 >= 0 && i2 < this.call.invitedUsers.size()) {
                        l = this.call.invitedUsers.get(i2);
                    }
                    if (z && (invitedUser = this.call.invitedUsersMessageIds.get(l)) != null) {
                        ItemOptions.makeOptions(this.container, this.resourcesProvider, groupCallInvitedCell).addIf(invitedUser.isCalling(), R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda45
                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupCallActivity.this.lambda$new$12(invitedUser, l);
                            }
                        }).add(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda46
                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupCallActivity.this.lambda$new$14(invitedUser, l);
                            }
                        }).setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.listViewBackgroundPaint.getColor())).setDimAlpha(96).show();
                        return;
                    }
                    return;
                }
                l = this.call.shadyLeftParticipants.get(i - this.listAdapter.shadyLeftStartRow);
            } else {
                l = this.call.shadyJoinParticipants.get(i - this.listAdapter.shadyJoinStartRow);
            }
            z = true;
            if (z) {
                return;
            }
            ItemOptions.makeOptions(this.container, this.resourcesProvider, groupCallInvitedCell).addIf(invitedUser.isCalling(), R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda45
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$new$12(invitedUser, l);
                }
            }).add(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda46
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$new$14(invitedUser, l);
                }
            }).setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.listViewBackgroundPaint.getColor())).setDimAlpha(96).show();
            return;
        }
        if (i == this.listAdapter.addMemberRow) {
            if (ChatObject.isChannel(this.currentChat) && (chat = this.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                getLink(false);
                return;
            }
            TLRPC.ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(getChatId());
            if (chatFull == null) {
                return;
            }
            this.enterEventSent = false;
            Context context = getContext();
            int currentAccount = this.accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = this.currentChat;
            ChatObject.Call call2 = this.call;
            GroupVoipInviteAlert groupVoipInviteAlert = new GroupVoipInviteAlert(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
            this.groupVoipInviteAlert = groupVoipInviteAlert;
            groupVoipInviteAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda47
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    GroupCallActivity.this.lambda$new$15(dialogInterface);
                }
            });
            this.groupVoipInviteAlert.setDelegate(new GroupVoipInviteAlert.GroupVoipInviteAlertDelegate() { // from class: org.telegram.ui.GroupCallActivity.13
                @Override // org.telegram.ui.Components.GroupVoipInviteAlert.GroupVoipInviteAlertDelegate
                public void copyInviteLink() {
                    GroupCallActivity.this.getLink(true);
                }

                @Override // org.telegram.ui.Components.GroupVoipInviteAlert.GroupVoipInviteAlertDelegate
                public void inviteUser(long j) {
                    GroupCallActivity.this.inviteUserToCall(j, true);
                }

                @Override // org.telegram.ui.Components.GroupVoipInviteAlert.GroupVoipInviteAlertDelegate
                public void needOpenSearch(MotionEvent motionEvent, EditTextBoldCursor editTextBoldCursor) {
                    if (GroupCallActivity.this.enterEventSent) {
                        return;
                    }
                    if (motionEvent.getX() > editTextBoldCursor.getLeft() && motionEvent.getX() < editTextBoldCursor.getRight() && motionEvent.getY() > editTextBoldCursor.getTop() && motionEvent.getY() < editTextBoldCursor.getBottom()) {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.makeFocusable(groupCallActivity.groupVoipInviteAlert, null, editTextBoldCursor, true);
                    } else {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        groupCallActivity2.makeFocusable(groupCallActivity2.groupVoipInviteAlert, null, editTextBoldCursor, false);
                    }
                }
            });
            this.groupVoipInviteAlert.show();
            return;
        }
        if (i == this.listAdapter.conferenceAddPeopleRow) {
            ChatObject.Call call3 = this.call;
            if (call3 == null || call3.call == null) {
                return;
            }
            UserSelectorBottomSheet userSelectorBottomSheet = new UserSelectorBottomSheet(activity, this.currentAccount, 0L, null, 4, true, new DarkBlueThemeResourcesProvider());
            ChatObject.Call call4 = this.call;
            userSelectorBottomSheet.exceptUsers(call4 != null ? (Collection) Collection.-EL.stream(call4.sortedParticipants).map(new Function() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda48
                public /* synthetic */ Function andThen(Function function) {
                    return Function$-CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long lambda$new$16;
                    lambda$new$16 = GroupCallActivity.lambda$new$16((TLRPC.GroupCallParticipant) obj);
                    return lambda$new$16;
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$-CC.$default$compose(this, function);
                }
            }).collect(Collectors.toSet()) : null).setOnShareCallLinkListener(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.openShareConferenceLink();
                }
            }).setOnUsersSelector(new Utilities.Callback2() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda50
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    GroupCallActivity.this.lambda$new$23(call, (Boolean) obj, (HashSet) obj2);
                }
            }).show();
            return;
        }
        if (i == this.listAdapter.conferenceShareLinkRow) {
            openShareConferenceLink();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$12(ChatObject.Call.InvitedUser invitedUser, Long l) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda59
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$new$11(tLObject, tL_error);
            }
        });
        ChatObject.Call call = this.call;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l, invitedUser);
            applyCallParticipantUpdates(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$11(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$14(ChatObject.Call.InvitedUser invitedUser, Long l) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(declineconferencecallinvite, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda58
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$new$13(tLObject, tL_error);
            }
        });
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = this.call;
        if (call != null) {
            call.invitedUsers.remove(l);
            this.call.invitedUsersMap.remove(l);
            this.call.invitedUsersMessageIds.remove(l);
            applyCallParticipantUpdates(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$13(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$15(DialogInterface dialogInterface) {
        this.groupVoipInviteAlert = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$new$16(TLRPC.GroupCallParticipant groupCallParticipant) {
        return Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant.peer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$23(final ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = this.call;
        if (call2 == null || (groupCall = call2.call) == null) {
            return;
        }
        final String str = groupCall.invite_link;
        int size = hashSet.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        final HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            final long longValue = ((Long) it.next()).longValue();
            this.call.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = this.call.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            final AtomicInteger atomicInteger2 = atomicInteger;
            final int i = size;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda61
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    GroupCallActivity.this.lambda$new$22(longValue, hashSet2, atomicInteger2, i, call, str, tLObject, tL_error);
                }
            });
            size = size;
            atomicInteger = atomicInteger;
        }
        applyCallParticipantUpdates(true);
        if (!bool.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
            return;
        }
        sharedInstance.createCaptureDevice(false);
        if (!sharedInstance.isFrontFaceCamera()) {
            sharedInstance.switchCamera();
        }
        sharedInstance.requestVideoCall(false);
        sharedInstance.setVideoState(false, 2);
        sharedInstance.setMicMute(false, false, true);
        sharedInstance.switchToSpeaker();
        updateState(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$22(final long j, final HashSet hashSet, AtomicInteger atomicInteger, int i, final ChatObject.Call call, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda74
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$new$17(updates, j);
                }
            });
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda75
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$new$21(hashSet, call, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$17(TLRPC.Updates updates, long j) {
        TLRPC.Update update = updates.update;
        int i = 0;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else if (updates.updates != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update2 = updates.updates.get(i2);
                if (update2 instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                    if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = message2.id;
                        break;
                    }
                    i2++;
                } else {
                    if (update2 instanceof TL_update.TL_updateMessageID) {
                        i = ((TL_update.TL_updateMessageID) update2).id;
                        break;
                    }
                    i2++;
                }
            }
        }
        ChatObject.Call call = this.call;
        if (call == null || i == 0) {
            return;
        }
        call.invitedUsersMessageIds.put(Long.valueOf(j), ChatObject.Call.InvitedUser.make(i));
        applyCallParticipantUpdates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$21(HashSet hashSet, ChatObject.Call call, final String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(l));
            getrequirementstocontact.id.add(MessagesController.getInstance(this.currentAccount).getInputUser(longValue));
        }
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda86
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$new$18(arrayList, arrayList2, arrayList3, str);
            }
        };
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            runnable.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda87
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    GroupCallActivity.lambda$new$20(arrayList, arrayList2, runnable, tLObject, tL_error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$18(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(safeLastFragment, safeLastFragment.getContext(), 34, this.currentAccount, new DarkBlueThemeResourcesProvider());
        limitReachedBottomSheet.setRestrictedUsers(null, arrayList, arrayList2, arrayList3, str);
        limitReachedBottomSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$20(final ArrayList arrayList, final ArrayList arrayList2, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda88
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.lambda$new$19(TLObject.this, arrayList, arrayList2, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$19(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < Math.min(arrayList.size(), vector.objects.size()); i++) {
                if (vector.objects.get(i) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i)).id));
                }
            }
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$25(View view, int i) {
        if (isRtmpStream()) {
            return false;
        }
        if (view instanceof GroupCallGridCell) {
            return showMenuForCell(view);
        }
        if (!(view instanceof GroupCallUserCell)) {
            return false;
        }
        updateItems();
        return ((GroupCallUserCell) view).clickMuteButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$26(View view, int i) {
        GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
        if (groupCallGridCell.getParticipant() != null) {
            fullscreenFor(groupCallGridCell.getParticipant());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$27(View view) {
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled() || isRtmpStream()) {
            getLink(false);
        } else {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(getContext(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$28(View view) {
        this.renderersContainer.delayHideUi();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (sharedInstance.getVideoState(false) == 2) {
                sharedInstance.switchCamera();
                if (this.flipIconCurrentEndFrame == 18) {
                    RLottieDrawable rLottieDrawable = this.flipIcon;
                    this.flipIconCurrentEndFrame = 39;
                    rLottieDrawable.setCustomEndFrame(39);
                    this.flipIcon.start();
                } else {
                    this.flipIcon.setCurrentFrame(0, false);
                    RLottieDrawable rLottieDrawable2 = this.flipIcon;
                    this.flipIconCurrentEndFrame = 18;
                    rLottieDrawable2.setCustomEndFrame(18);
                    this.flipIcon.start();
                }
                for (int i = 0; i < this.attachedRenderers.size(); i++) {
                    GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.attachedRenderers.get(i);
                    ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
                    if (videoParticipant.participant.self && !videoParticipant.presentation) {
                        groupCallMiniTextureView.startFlipAnimation();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$30(View view) {
        final int nextAudioOutputValue = getNextAudioOutputValue();
        this.cacheAudioOutputValue = Integer.valueOf(nextAudioOutputValue);
        updateState(true, true);
        this.cacheAudioOutputValue = null;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$new$29(nextAudioOutputValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$29(int i) {
        setAudioOutputValue(i);
        BulletinFactory.of(this.topBulletinContainer, new DarkBlueThemeResourcesProvider()).createSimpleBulletin(getContext().getResources().getDrawable(getAudioOutputToastIcon(i)).mutate(), getAudioOutputToastText(i)).show(isBulletinTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$31(Activity activity, View view) {
        this.renderersContainer.delayHideUi();
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled()) {
            dismiss();
        } else {
            updateItems();
            onLeaveClick(activity, new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda52
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.dismiss();
                }
            }, false);
        }
    }

    class 19 implements View.OnClickListener {
        Runnable finishRunnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity.19.1
            @Override // java.lang.Runnable
            public void run() {
                GroupCallActivity.this.muteButtonIcon.setAnimation(GroupCallActivity.this.bigMicDrawable);
                GroupCallActivity.this.playingHandAnimation = false;
            }
        };

        19() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int checkSelfPermission;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null || groupCallActivity.muteButtonState == 3) {
                return;
            }
            int i = 0;
            if (!GroupCallActivity.this.isRtmpStream() || GroupCallActivity.this.call.isScheduled()) {
                if (GroupCallActivity.this.muteButtonState == 5) {
                    if (GroupCallActivity.this.startingGroupCall) {
                        return;
                    }
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    GroupCallActivity.this.startingGroupCall = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = GroupCallActivity.this.call.getInputGroupCall();
                    GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$19$$ExternalSyntheticLambda1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            GroupCallActivity.19.this.lambda$onClick$1(tLObject, tL_error);
                        }
                    });
                    return;
                }
                if (GroupCallActivity.this.muteButtonState == 7 || GroupCallActivity.this.muteButtonState == 6) {
                    if (GroupCallActivity.this.muteButtonState == 6 && GroupCallActivity.this.reminderHintView != null) {
                        GroupCallActivity.this.reminderHintView.hide();
                    }
                    TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                    togglegroupcallstartsubscription.call = GroupCallActivity.this.call.getInputGroupCall();
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    TLRPC.GroupCall groupCall = groupCallActivity2.call.call;
                    boolean z = !groupCall.schedule_start_subscribed;
                    groupCall.schedule_start_subscribed = z;
                    togglegroupcallstartsubscription.subscribed = z;
                    groupCallActivity2.accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$19$$ExternalSyntheticLambda3
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            GroupCallActivity.19.this.lambda$onClick$2(tLObject, tL_error);
                        }
                    });
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    groupCallActivity3.updateMuteButton(groupCallActivity3.call.call.schedule_start_subscribed ? 7 : 6, true);
                    return;
                }
                if (VoIPService.getSharedInstance() == null || GroupCallActivity.this.isStillConnecting()) {
                    return;
                }
                if (GroupCallActivity.this.muteButtonState != 2 && GroupCallActivity.this.muteButtonState != 4) {
                    try {
                        if (GroupCallActivity.this.muteButtonState != 0) {
                            GroupCallActivity.this.updateMuteButton(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        } else {
                            if (Build.VERSION.SDK_INT >= 23 && GroupCallActivity.this.getParentActivity() != null) {
                                checkSelfPermission = GroupCallActivity.this.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO");
                                if (checkSelfPermission != 0) {
                                    PermissionRequest.ensurePermission(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, "android.permission.RECORD_AUDIO", new Utilities.Callback() { // from class: org.telegram.ui.GroupCallActivity$19$$ExternalSyntheticLambda2
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj) {
                                            ((Boolean) obj).booleanValue();
                                        }
                                    });
                                    return;
                                }
                            }
                            GroupCallActivity.this.updateMuteButton(1, true);
                            VoIPService.getSharedInstance().setMicMute(false, false, true);
                            GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        }
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                if (GroupCallActivity.this.isConference() || GroupCallActivity.this.playingHandAnimation) {
                    return;
                }
                GroupCallActivity.this.playingHandAnimation = true;
                AndroidUtilities.shakeView(GroupCallActivity.this.muteButton.getTextView());
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
                }
                int nextInt = Utilities.random.nextInt(100);
                int i2 = 120;
                if (nextInt >= 32) {
                    i = NotificationCenter.appConfigUpdated;
                    if (nextInt < 64) {
                        i2 = NotificationCenter.appConfigUpdated;
                        i = 120;
                    } else {
                        i2 = 420;
                        if (nextInt >= 97) {
                            i = 540;
                            if (nextInt == 98) {
                                i2 = 540;
                                i = 420;
                            } else {
                                i2 = 720;
                            }
                        }
                    }
                }
                GroupCallActivity.this.handDrawables.setCustomEndFrame(i2);
                GroupCallActivity.this.handDrawables.setOnFinishCallback(this.finishRunnable, i2 - 1);
                GroupCallActivity.this.muteButtonIcon.setAnimation(GroupCallActivity.this.handDrawables);
                GroupCallActivity.this.handDrawables.setCurrentFrame(i);
                GroupCallActivity.this.muteButtonIcon.playAnimation();
                if (GroupCallActivity.this.muteButtonState == 2) {
                    GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                    long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) groupCallActivity4.call.participants.get(MessageObject.getPeerId(groupCallActivity4.selfPeer))).peer);
                    VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
                    GroupCallActivity.this.updateMuteButton(4, true);
                    return;
                }
                return;
            }
            if (GroupCallActivity.this.renderersContainer != null && GroupCallActivity.this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode())) {
                GroupCallActivity.this.fullscreenFor(null);
                if (GroupCallActivity.isLandscapeMode) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$19$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupCallActivity.19.this.lambda$onClick$0();
                        }
                    }, 200L);
                }
                GroupCallActivity.this.parentActivity.setRequestedOrientation(-1);
                return;
            }
            if (GroupCallActivity.this.visibleVideoParticipants.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.visibleVideoParticipants.get(0);
            if (AndroidUtilities.isTablet()) {
                GroupCallActivity.this.fullscreenFor(videoParticipant);
                return;
            }
            if (GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode()) {
                GroupCallActivity.this.fullscreenFor(videoParticipant);
            }
            if (GroupCallActivity.this.isRtmpLandscapeMode()) {
                GroupCallActivity.this.parentActivity.setRequestedOrientation(6);
            } else {
                GroupCallActivity.this.parentActivity.setRequestedOrientation(1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$0() {
            GroupCallActivity.this.wasNotInLayoutFullscreen = null;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.updateMuteButton(groupCallActivity.muteButtonState, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$1(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$2(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$32(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$33(View view) {
        ChatObject.Call call = this.call;
        if (call == null || this.renderersContainer.inFullscreenMode) {
            return;
        }
        if (call.call.join_muted) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.everyoneItem;
            int i = Theme.key_voipgroup_actionBarItems;
            actionBarMenuSubItem.setColors(Theme.getColor(i), Theme.getColor(i));
            this.everyoneItem.setChecked(false);
            ActionBarMenuSubItem actionBarMenuSubItem2 = this.adminItem;
            int i2 = Theme.key_voipgroup_checkMenu;
            actionBarMenuSubItem2.setColors(Theme.getColor(i2), Theme.getColor(i2));
            this.adminItem.setChecked(true);
        } else {
            ActionBarMenuSubItem actionBarMenuSubItem3 = this.everyoneItem;
            int i3 = Theme.key_voipgroup_checkMenu;
            actionBarMenuSubItem3.setColors(Theme.getColor(i3), Theme.getColor(i3));
            this.everyoneItem.setChecked(true);
            ActionBarMenuSubItem actionBarMenuSubItem4 = this.adminItem;
            int i4 = Theme.key_voipgroup_actionBarItems;
            actionBarMenuSubItem4.setColors(Theme.getColor(i4), Theme.getColor(i4));
            this.adminItem.setChecked(false);
        }
        this.changingPermissions = false;
        this.otherItem.hideSubItem(1);
        this.otherItem.hideSubItem(2);
        if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
            int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
            if (currentAudioRoute == 2) {
                this.soundItem.setIcon(R.drawable.msg_voice_bluetooth);
                this.soundItem.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
            } else if (currentAudioRoute == 0) {
                this.soundItem.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                this.soundItem.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
            } else if (currentAudioRoute == 1) {
                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                    this.soundItem.setIcon(R.drawable.msg_voice_speaker);
                    this.soundItem.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                } else {
                    this.soundItem.setIcon(R.drawable.msg_voice_phone);
                    this.soundItem.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                }
            }
        }
        updateItems();
        this.otherItem.toggleSubMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$34(View view) {
        if (isRtmpStream()) {
            if (PipUtils.checkAnyPipPermissions(this.parentActivity)) {
                RTMPStreamPipOverlay.show(this.parentActivity);
                dismiss();
                return;
            } else {
                AlertsCreator.createDrawOverlayPermissionDialog(this.parentActivity, null, true).show();
                return;
            }
        }
        if (AndroidUtilities.checkInlinePermissions(this.parentActivity)) {
            GroupCallPip.clearForce();
            dismiss();
        } else {
            AlertsCreator.createDrawOverlayGroupCallPermissionDialog(getContext()).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$35(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.getVideoState(true) == 2) {
            sharedInstance.stopScreenCapture();
        } else {
            startScreenCapture();
        }
    }

    class 20 extends AudioPlayerAlert.ClippingTextViewSwitcher {
        final /* synthetic */ Activity val$context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        20(Context context, Activity activity) {
            super(context);
            this.val$context = activity;
        }

        @Override // org.telegram.ui.Components.AudioPlayerAlert.ClippingTextViewSwitcher
        protected TextView createTextView() {
            final TextView textView = new TextView(this.val$context);
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(51);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$20$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.20.this.lambda$createTextView$0(textView, view);
                }
            });
            return textView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$createTextView$0(TextView textView, View view) {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            ChatObject.Call call = groupCallActivity.call;
            if (call == null || !call.recording) {
                return;
            }
            groupCallActivity.showRecordHint(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$36(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$37(View view, int i) {
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
        if (groupCallUserCell.getVideoParticipant() == null) {
            fullscreenFor(new ChatObject.VideoParticipant(groupCallUserCell.getParticipant(), false, false));
        } else {
            fullscreenFor(groupCallUserCell.getVideoParticipant());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$38(View view, int i) {
        if (showMenuForCell(view)) {
            try {
                this.listView.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$39(View view) {
        hideKeyboardOrEmojiView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$40(View view) {
        Editable text = this.callMessageEnterView.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(new CharSequence[]{text}, true);
        sendGroupCallMessage(tL_textWithEntities);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$45(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, final TLRPC.Chat chat, AccountInstance accountInstance, final TLRPC.InputPeer inputPeer, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.scheduleAnimator = ofFloat;
        ofFloat.setDuration(600L);
        this.scheduleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda40
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GroupCallActivity.this.lambda$new$41(valueAnimator);
            }
        });
        this.scheduleAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.43
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                GroupCallActivity.this.scheduleAnimator = null;
            }
        });
        this.scheduleAnimator.start();
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
        } else {
            this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
        }
        Calendar calendar = Calendar.getInstance();
        boolean checkScheduleDate = AlertsCreator.checkScheduleDate(null, null, 604800L, 3, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 86400000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (checkScheduleDate) {
            calendar.set(13, 0);
        }
        this.scheduleStartAt = (int) (calendar.getTimeInMillis() / 1000);
        updateScheduleUI(false);
        TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
        creategroupcall.peer = MessagesController.getInputPeer(chat);
        creategroupcall.random_id = Utilities.random.nextInt();
        creategroupcall.schedule_date = this.scheduleStartAt;
        creategroupcall.flags |= 2;
        accountInstance.getConnectionsManager().sendRequest(creategroupcall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda41
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$new$44(chat, inputPeer, tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$41(ValueAnimator valueAnimator) {
        this.switchToButtonProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateScheduleUI(true);
        this.buttonsContainer.invalidate();
        this.listView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$44(final TLRPC.Chat chat, final TLRPC.InputPeer inputPeer, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            int i = 0;
            while (true) {
                if (i >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update = updates.updates.get(i);
                if (update instanceof TL_update.TL_updateGroupCall) {
                    final TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) update;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda67
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupCallActivity.this.lambda$new$42(chat, inputPeer, tL_updateGroupCall);
                        }
                    });
                    break;
                }
                i++;
            }
            this.accountInstance.getMessagesController().processUpdates(updates, false);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda68
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$new$43(tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$42(TLRPC.Chat chat, TLRPC.InputPeer inputPeer, TL_update.TL_updateGroupCall tL_updateGroupCall) {
        ChatObject.Call call = new ChatObject.Call();
        this.call = call;
        call.call = new TLRPC.TL_groupCall();
        ChatObject.Call call2 = this.call;
        TLRPC.GroupCall groupCall = call2.call;
        groupCall.participants_count = 0;
        groupCall.version = 1;
        groupCall.can_start_video = true;
        groupCall.can_change_join_muted = true;
        call2.chatId = chat == null ? 0L : chat.id;
        groupCall.schedule_date = this.scheduleStartAt;
        groupCall.flags |= 128;
        call2.currentAccount = this.accountInstance;
        call2.setSelfPeer(inputPeer);
        ChatObject.Call call3 = this.call;
        TLRPC.GroupCall groupCall2 = call3.call;
        TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
        groupCall2.access_hash = groupCall3.access_hash;
        groupCall2.id = groupCall3.id;
        call3.createNoVideoParticipant();
        this.fullscreenAdapter.setGroupCall(this.call);
        this.renderersContainer.setGroupCall(this.call);
        this.tabletGridAdapter.setGroupCall(this.call);
        this.groupCallMessagesListView.setGroupCall(this.accountInstance.getCurrentAccount(), this.call.getInputGroupCall(false));
        MessagesController messagesController = this.accountInstance.getMessagesController();
        ChatObject.Call call4 = this.call;
        messagesController.putGroupCall(call4.chatId, call4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$43(TLRPC.TL_error tL_error) {
        this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tL_error.text);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$46(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().getFormatterWeek().format(j2) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j2);
        }
        return LocaleController.getInstance().getFormatterScheduleYear().format(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$47(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$48(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$49(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$50(Activity activity, View view) {
        LaunchActivity launchActivity;
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = this.parentActivity) != null) {
            checkSelfPermission = launchActivity.checkSelfPermission("android.permission.CAMERA");
            if (checkSelfPermission != 0) {
                this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                return;
            }
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        boolean z = true;
        if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
            this.undoView[0].hide(false, 1);
            if (this.previewDialog == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.createCaptureDevice(false);
                }
                PrivateVideoPreviewDialog privateVideoPreviewDialog = new PrivateVideoPreviewDialog(activity, z, VoIPService.getSharedInstance().getVideoState(true) != 2) { // from class: org.telegram.ui.GroupCallActivity.47
                    @Override // org.telegram.ui.Components.voip.PrivateVideoPreviewDialog
                    public void onDismiss(boolean z2, boolean z3) {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        boolean z4 = groupCallActivity.previewDialog.micEnabled;
                        groupCallActivity.previewDialog = null;
                        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                        if (!z3) {
                            if (sharedInstance2 != null) {
                                sharedInstance2.setVideoState(false, 0);
                                return;
                            }
                            return;
                        }
                        if (sharedInstance2 != null) {
                            sharedInstance2.setupCaptureDevice(z2, z4);
                        }
                        if (z2 && sharedInstance2 != null) {
                            sharedInstance2.setVideoState(false, 0);
                        }
                        GroupCallActivity.this.updateState(true, false);
                        GroupCallActivity.this.call.sortParticipants();
                        GroupCallActivity.this.applyCallParticipantUpdates(true);
                        GroupCallActivity.this.buttonsContainer.requestLayout();
                    }
                };
                this.previewDialog = privateVideoPreviewDialog;
                privateVideoPreviewDialog.setBottomPadding(this.containerView.getPaddingBottom());
                this.container.addView(this.previewDialog);
                if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                    return;
                }
                sharedInstance.switchCamera();
                return;
            }
            return;
        }
        VoIPService.getSharedInstance().setVideoState(false, 0);
        updateState(true, false);
        updateSpeakerPhoneIcon(false);
        this.call.sortParticipants();
        applyCallParticipantUpdates(true);
        this.buttonsContainer.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$51(View view) {
        int calculateScrollTopOffset = calculateScrollTopOffset();
        if (calculateScrollTopOffset > 0 && calculateScrollTopOffset != Integer.MAX_VALUE) {
            this.listView.smoothScrollBy(0, calculateScrollTopOffset);
        }
        this.callMessageEnterView.openKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        int max = Math.max(insets2.bottom, (this.callMessageEnterView.isWaitingForKeyboardOpen() || this.callMessageEnterView.isPopupShowing()) ? this.callMessageEnterView.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = this.blurredView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -insets.bottom;
        }
        if (this.callMessageEnterView.getEmojiView() != null) {
            this.callMessageEnterView.getEmojiView().setBottomInset(insets.bottom);
        }
        if (this.isInFullscreen) {
            ViewGroup viewGroup = this.containerView;
            int i = this.backgroundPaddingLeft;
            viewGroup.setPadding(i, 0, i, 0);
        } else {
            ViewGroup viewGroup2 = this.containerView;
            int i2 = this.backgroundPaddingLeft;
            viewGroup2.setPadding(insets.left + i2, insets.top, i2 + insets.right, insets.bottom);
        }
        this.containerView.requestLayout();
        if (max == 0 && !this.callMessageEnterView.isWaitingForKeyboardOpen() && !this.callMessageEnterView.isPopupShowing() && !this.callMessageEnterView.isAnimatePopupClosing()) {
            this.callMessageEnterView.hideEmojiView();
        }
        if (max > 0) {
            this.reactionsContainerLayout = createReactionsLayout();
        }
        this.callMessageEnterView.onSizeChanged(insets2.bottom, false);
        this.windowInsetsStateHolder.setInsets(windowInsetsCompat);
        return WindowInsetsCompat.CONSUMED;
    }

    public LaunchActivity getParentActivity() {
        return this.parentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateLayoutFullscreen() {
        int i;
        if (isRtmpStream()) {
            boolean z = (!this.renderersContainer.isUiVisible() && this.renderersContainer.inFullscreenMode && (isLandscapeMode == isRtmpLandscapeMode() || AndroidUtilities.isTablet())) ? false : true;
            Boolean bool = this.wasNotInLayoutFullscreen;
            if (bool == null || z != bool.booleanValue()) {
                int systemUiVisibility = this.containerView.getSystemUiVisibility();
                if (z) {
                    i = systemUiVisibility & (-7);
                    getWindow().clearFlags(1024);
                    setHideSystemVerticalInsets(false);
                } else {
                    setHideSystemVerticalInsets(true);
                    i = systemUiVisibility | 6;
                    getWindow().addFlags(1024);
                }
                this.containerView.setSystemUiVisibility(i);
                this.wasNotInLayoutFullscreen = Boolean.valueOf(z);
                this.isInFullscreen = !z;
                this.containerView.requestApplyInsets();
                return;
            }
            return;
        }
        this.isFullscreen = false;
    }

    public LinearLayout getMenuItemsContainer() {
        return this.menuItemsContainer;
    }

    public void fullscreenFor(final ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.parentActivity.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() == null || this.renderersContainer.isAnimating()) {
            return;
        }
        if (isTabletMode) {
            if (this.requestFullscreenListener != null) {
                this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
                this.requestFullscreenListener = null;
            }
            final ArrayList arrayList = new ArrayList();
            if (videoParticipant == null) {
                this.attachedRenderersTmp.clear();
                this.attachedRenderersTmp.addAll(this.attachedRenderers);
                for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
                    final GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.attachedRenderersTmp.get(i);
                    GroupCallGridCell groupCallGridCell = groupCallMiniTextureView.primaryView;
                    if (groupCallGridCell != null) {
                        groupCallGridCell.setRenderer(null);
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = groupCallMiniTextureView.secondaryView;
                        if (groupCallUserCell != null) {
                            groupCallUserCell.setRenderer(null);
                        }
                        GroupCallGridCell groupCallGridCell2 = groupCallMiniTextureView.tabletGridView;
                        if (groupCallGridCell2 != null) {
                            groupCallGridCell2.setRenderer(null);
                        }
                        arrayList.add(groupCallMiniTextureView.participant);
                        groupCallMiniTextureView.forceDetach(false);
                        groupCallMiniTextureView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.48
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                if (groupCallMiniTextureView.getParent() != null) {
                                    ((BottomSheet) GroupCallActivity.this).containerView.removeView(groupCallMiniTextureView);
                                }
                            }
                        });
                    }
                }
                this.listViewVideoVisibility = false;
                this.tabletGridAdapter.setVisibility(this.tabletVideoGridView, true, true);
            } else {
                this.attachedRenderersTmp.clear();
                this.attachedRenderersTmp.addAll(this.attachedRenderers);
                for (int i2 = 0; i2 < this.attachedRenderersTmp.size(); i2++) {
                    final GroupCallMiniTextureView groupCallMiniTextureView2 = (GroupCallMiniTextureView) this.attachedRenderersTmp.get(i2);
                    if (groupCallMiniTextureView2.tabletGridView != null && ((videoParticipant2 = groupCallMiniTextureView2.participant) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList.add(groupCallMiniTextureView2.participant);
                        groupCallMiniTextureView2.forceDetach(false);
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = groupCallMiniTextureView2.secondaryView;
                        if (groupCallUserCell2 != null) {
                            groupCallUserCell2.setRenderer(null);
                        }
                        GroupCallGridCell groupCallGridCell3 = groupCallMiniTextureView2.primaryView;
                        if (groupCallGridCell3 != null) {
                            groupCallGridCell3.setRenderer(null);
                        }
                        groupCallMiniTextureView2.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.49
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                if (groupCallMiniTextureView2.getParent() != null) {
                                    ((BottomSheet) GroupCallActivity.this).containerView.removeView(groupCallMiniTextureView2);
                                }
                            }
                        });
                    }
                }
                this.listViewVideoVisibility = true;
                this.tabletGridAdapter.setVisibility(this.tabletVideoGridView, false, false);
                if (!arrayList.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupCallActivity.this.lambda$fullscreenFor$52(arrayList);
                        }
                    });
                }
            }
            final boolean z = !this.renderersContainer.inFullscreenMode;
            ViewTreeObserver viewTreeObserver = this.listView.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCallActivity.50
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.requestFullscreenListener = null;
                    groupCallActivity.renderersContainer.requestFullscreen(videoParticipant);
                    if (GroupCallActivity.this.delayedGroupCallUpdated) {
                        GroupCallActivity.this.delayedGroupCallUpdated = false;
                        GroupCallActivity.this.applyCallParticipantUpdates(true);
                        if (z && videoParticipant != null) {
                            GroupCallActivity.this.listView.scrollToPosition(0);
                        }
                        GroupCallActivity.this.delayedGroupCallUpdated = true;
                    } else {
                        GroupCallActivity.this.applyCallParticipantUpdates(true);
                    }
                    ((BottomSheet) GroupCallActivity.this).containerView.requestLayout();
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        if (this.requestFullscreenListener != null) {
            this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
            this.requestFullscreenListener = null;
        }
        if (videoParticipant != null) {
            if (this.fullscreenUsersListView.getVisibility() != 0) {
                this.fullscreenUsersListView.setVisibility(0);
                this.fullscreenAdapter.update(false, this.fullscreenUsersListView);
                this.delayedGroupCallUpdated = true;
                if (!this.renderersContainer.inFullscreenMode) {
                    this.fullscreenAdapter.scrollTo(videoParticipant, this.fullscreenUsersListView);
                }
                ViewTreeObserver viewTreeObserver2 = this.listView.getViewTreeObserver();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCallActivity.51
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.requestFullscreenListener = null;
                        groupCallActivity.renderersContainer.requestFullscreen(videoParticipant);
                        AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                        ((BottomSheet) GroupCallActivity.this).containerView.requestLayout();
                        return false;
                    }
                };
                this.requestFullscreenListener = onPreDrawListener2;
                viewTreeObserver2.addOnPreDrawListener(onPreDrawListener2);
                return;
            }
            this.renderersContainer.requestFullscreen(videoParticipant);
            AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
            return;
        }
        if (this.listView.getVisibility() != 0) {
            this.listView.setVisibility(0);
            applyCallParticipantUpdates(false);
            this.delayedGroupCallUpdated = true;
            ViewTreeObserver viewTreeObserver3 = this.listView.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener3 = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCallActivity.52
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    GroupCallActivity.this.renderersContainer.requestFullscreen(null);
                    AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                    ((BottomSheet) GroupCallActivity.this).containerView.requestLayout();
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener3;
            viewTreeObserver3.addOnPreDrawListener(onPreDrawListener3);
            return;
        }
        ViewTreeObserver viewTreeObserver4 = this.listView.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener4 = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCallActivity.53
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                GroupCallActivity.this.renderersContainer.requestFullscreen(null);
                AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                ((BottomSheet) GroupCallActivity.this).containerView.requestLayout();
                return false;
            }
        };
        this.requestFullscreenListener = onPreDrawListener4;
        viewTreeObserver4.addOnPreDrawListener(onPreDrawListener4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fullscreenFor$52(ArrayList arrayList) {
        for (int i = 0; i < this.attachedRenderers.size(); i++) {
            if (((GroupCallMiniTextureView) this.attachedRenderers.get(i)).participant != null) {
                arrayList.remove(((GroupCallMiniTextureView) this.attachedRenderers.get(i)).participant);
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i2);
            if (videoParticipant.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
    }

    public void enableCamera() {
        this.cameraButton.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkContentOverlayed() {
        boolean z = !this.avatarPriviewTransitionInProgress && this.blurredView.getVisibility() == 0 && this.blurredView.getAlpha() == 1.0f;
        if (this.contentFullyOverlayed != z) {
            this.contentFullyOverlayed = z;
            this.buttonsContainer.invalidate();
            this.containerView.invalidate();
            this.listView.invalidate();
        }
    }

    private void updateScheduleUI(boolean z) {
        float interpolation;
        float f;
        LinearLayout linearLayout = this.scheduleTimerContainer;
        if ((linearLayout == null || this.call != null) && this.scheduleAnimator == null) {
            this.switchToButtonInt2 = 1.0f;
            this.switchToButtonProgress = 1.0f;
            if (linearLayout == null) {
                return;
            }
        }
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.updateSchedeulRunnable);
            this.updateSchedeulRunnable.run();
            ChatObject.Call call = this.call;
            if (call == null || call.isScheduled()) {
                this.listView.setVisibility(4);
            } else {
                this.listView.setVisibility(0);
            }
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.leaveItem.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                this.leaveItem.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f2 = this.switchToButtonProgress;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (CubicBezierInterpolator.DEFAULT.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.switchToButtonInt2 = 1.0f;
            f = 1.0f;
        } else {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            this.switchToButtonInt2 = cubicBezierInterpolator.getInterpolation(f2 / 0.6f);
            interpolation = 1.05f * cubicBezierInterpolator.getInterpolation(this.switchToButtonProgress / 0.6f);
            f = this.switchToButtonProgress / 0.6f;
        }
        updateButtonsVisibility(true);
        float f3 = 1.0f - f;
        this.scheduleTimerContainer.setAlpha(f3);
        this.scheduleStartInTextView.setAlpha(f);
        this.scheduleStartAtTextView.setAlpha(f);
        this.scheduleTimeTextView.setAlpha(f);
        this.scheduleTimeTextView.setScaleX(interpolation);
        this.scheduleTimeTextView.setScaleY(interpolation);
        this.scheduleButtonTextView.setScaleX(f3);
        this.scheduleButtonTextView.setScaleY(f3);
        this.scheduleButtonTextView.setAlpha(f3);
        this.scheduleInfoTextView.setAlpha(f3);
        this.otherItem.setAlpha(f);
        int i = f3 != 0.0f ? 0 : 4;
        if (i != this.scheduleTimerContainer.getVisibility()) {
            this.scheduleTimerContainer.setVisibility(i);
            this.scheduleButtonTextView.setVisibility(i);
        }
    }

    private void initCreatedGroupCall() {
        VoIPService sharedInstance;
        if (this.callInitied || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.callInitied = true;
        this.oldParticipants.addAll(this.call.visibleParticipants);
        this.oldVideoParticipants.addAll(this.visibleVideoParticipants);
        this.oldInvited.addAll(this.call.invitedUsers);
        this.oldShadyJoin.addAll(this.call.shadyJoinParticipants);
        this.oldShadyLeft.addAll(this.call.shadyLeftParticipants);
        this.currentCallState = sharedInstance.getCallState();
        if (this.call == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.call = call;
            this.fullscreenAdapter.setGroupCall(call);
            this.renderersContainer.setGroupCall(this.call);
            this.tabletGridAdapter.setGroupCall(this.call);
        }
        GroupCallMessagesListView groupCallMessagesListView = this.groupCallMessagesListView;
        if (groupCallMessagesListView != null) {
            groupCallMessagesListView.setGroupCall(this.accountInstance.getCurrentAccount(), this.call.getInputGroupCall(false));
        }
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.call.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        SimpleTextView simpleTextView = this.scheduleTimeTextView;
        if (simpleTextView == null || simpleTextView.getVisibility() != 0) {
            return;
        }
        this.leaveButton.setData(R.drawable.calls_decline, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        updateSpeakerPhoneIcon(true);
        this.leaveItem.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.currentChat) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        this.listView.setVisibility(0);
        this.pipItem.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        RecyclerListView recyclerListView = this.listView;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.listView, (Property<RecyclerListView, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        SimpleTextView simpleTextView2 = this.scheduleTimeTextView;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property2, 0.0f);
        SimpleTextView simpleTextView3 = this.scheduleTimeTextView;
        Property property3 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(simpleTextView3, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.54
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                GroupCallActivity.this.scheduleTimeTextView.setVisibility(4);
                GroupCallActivity.this.scheduleStartAtTextView.setVisibility(4);
                GroupCallActivity.this.scheduleStartInTextView.setVisibility(4);
            }
        });
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubtitle() {
        boolean z;
        WatchersView watchersView;
        if (this.actionBar == null || this.call == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.call.currentSpeakingPeers.size(); i2++) {
            long keyAt = this.call.currentSpeakingPeers.keyAt(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.currentSpeakingPeers.get(keyAt);
            if (!groupCallParticipant.self && !this.renderersContainer.isVisible(groupCallParticipant) && this.visiblePeerIds.get(keyAt, 0) != 1) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                }
                if (i < 2) {
                    TLRPC.User user = peerId > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)) : null;
                    TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId)) : null;
                    if (user != null || chat != null) {
                        if (i != 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        if (user != null) {
                            spannableStringBuilder.append(UserObject.getFirstName(user), new TypefaceSpan(AndroidUtilities.bold()), 0);
                        } else {
                            spannableStringBuilder.append(chat.title, new TypefaceSpan(AndroidUtilities.bold()), 0);
                        }
                    }
                }
                i++;
                if (i == 2) {
                    break;
                }
            }
        }
        if (i > 0) {
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i);
            int indexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            this.actionBar.getAdditionalSubtitleTextView().setText(spannableStringBuilder2);
            z = true;
        } else {
            z = false;
        }
        this.actionBar.getSubtitleTextView().setText(LocaleController.formatPluralString(isRtmpStream() ? "ViewersWatching" : "Participants", this.call.call.participants_count + (this.listAdapter.addSelfToCounter() ? 1 : 0), new Object[0]));
        if (isRtmpStream() && (watchersView = this.watchersView) != null) {
            watchersView.setWatchersCount(this.call.call.participants_count);
        }
        if (z != this.drawSpeakingSubtitle) {
            this.drawSpeakingSubtitle = z;
            this.actionBar.invalidate();
            this.actionBar.getSubtitleTextView().setPivotX(0.0f);
            this.actionBar.getSubtitleTextView().setPivotY(this.actionBar.getMeasuredHeight() >> 1);
            this.actionBar.getSubtitleTextView().animate().scaleX(this.drawSpeakingSubtitle ? 0.98f : 1.0f).scaleY(this.drawSpeakingSubtitle ? 0.9f : 1.0f).alpha(this.drawSpeakingSubtitle ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(this.actionBar.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle);
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        super.show();
        if (RTMPStreamPipOverlay.isVisible()) {
            RTMPStreamPipOverlay.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void dismissInternal() {
        if (this.renderersContainer != null) {
            if (this.requestFullscreenListener != null) {
                this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
                this.requestFullscreenListener = null;
            }
            this.attachedRenderersTmp.clear();
            this.attachedRenderersTmp.addAll(this.attachedRenderers);
            for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
                ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).saveThumb();
                this.renderersContainer.removeView((View) this.attachedRenderersTmp.get(i));
                ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).release();
                ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).forceDetach(true);
            }
            this.attachedRenderers.clear();
            if (this.renderersContainer.getParent() != null) {
                this.attachedRenderers.clear();
                this.containerView.removeView(this.renderersContainer);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (groupCallInstance == this) {
            groupCallInstance = null;
        }
        groupCallUiVisible = false;
        VoIPService.audioLevelsCallback = null;
        GroupCallPip.updateVisibility(getContext());
        ChatObject.Call call = this.call;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.animateToAmplitude = min;
        this.animateAmplitudeDiff = (min - this.amplitude) / ((BlobDrawable.AMPLITUDE_SPEED * 500.0f) + 100.0f);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onStateChanged(int i) {
        this.currentCallState = i;
        updateState(isShowing(), false);
    }

    public UndoView getUndoView() {
        if (!isTabletMode) {
            GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
            if (groupCallRenderersContainer.inFullscreenMode) {
                return groupCallRenderersContainer.getUndoView();
            }
        }
        if (this.undoView[0].getVisibility() == 0) {
            UndoView[] undoViewArr = this.undoView;
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(true, 2);
            this.containerView.removeView(this.undoView[0]);
            this.containerView.addView(this.undoView[0]);
        }
        return this.undoView[0];
    }

    private void updateTitle(boolean z) {
        ChatObject.Call call = this.call;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z);
                return;
            } else {
                this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z);
                return;
            }
        }
        if (!TextUtils.isEmpty(call.call.title)) {
            if (!this.call.call.title.equals(this.actionBar.getTitle())) {
                if (z) {
                    this.actionBar.setTitleAnimated(this.call.call.title, true, 180L);
                    this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda54
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupCallActivity.this.lambda$updateTitle$53(view);
                        }
                    });
                } else {
                    this.actionBar.setTitle(this.call.call.title);
                }
                this.titleTextView.setText(this.call.call.title, z);
            }
        } else {
            TLRPC.Chat chat = this.currentChat;
            if (chat != null && !chat.title.equals(this.actionBar.getTitle())) {
                if (z) {
                    this.actionBar.setTitleAnimated(this.currentChat.title, true, 180L);
                    this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda55
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupCallActivity.this.lambda$updateTitle$54(view);
                        }
                    });
                } else {
                    this.actionBar.setTitle(this.currentChat.title);
                }
                if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    if (isRtmpStream()) {
                        this.titleTextView.setText(this.currentChat.title, z);
                    } else {
                        this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), z);
                    }
                } else {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), z);
                }
            } else if (this.currentChat == null) {
                ActionBar actionBar = this.actionBar;
                int i = R.string.ConferenceChat;
                actionBar.setTitle(LocaleController.getString(i));
                this.titleTextView.setText(LocaleController.getString(i), z);
            }
        }
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (this.call.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.setRightDrawable(new SmallRecordCallDrawable(titleTextView));
                TextView textView = this.titleTextView.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(textView), (Drawable) null);
                TextView nextTextView = this.titleTextView.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(nextTextView), (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() != null) {
            titleTextView.setRightDrawable((Drawable) null);
            this.titleTextView.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.titleTextView.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTitle$53(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTitle$54(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorProgress(float f) {
        this.colorProgress = f;
        GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
        float max = Math.max(f, groupCallRenderersContainer == null ? 0.0f : groupCallRenderersContainer.progressToFullscreenMode);
        int i = Theme.key_voipgroup_actionBarUnscrolled;
        int color = Theme.getColor(i);
        int i2 = Theme.key_voipgroup_actionBar;
        int offsetColor = AndroidUtilities.getOffsetColor(color, Theme.getColor(i2), f, 1.0f);
        this.backgroundColor = offsetColor;
        this.actionBarBackground.setBackgroundColor(offsetColor);
        this.otherItem.redrawPopup(-14472653);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor(i), Theme.getColor(i2), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(Theme.key_voipgroup_listViewBackground), f, 1.0f);
        CallEncryptionCellDrawable callEncryptionCellDrawable = this.encryptionDrawable;
        if (callEncryptionCellDrawable != null) {
            callEncryptionCellDrawable.setPaintBackgroundColor(offsetColor2);
        }
        this.listViewBackgroundPaint.setColor(offsetColor2);
        this.callMessageEnterContainerBgPaint.setColor(offsetColor2);
        this.callMessageEnterContainer.invalidate();
        this.listView.setGlowColor(offsetColor2);
        int i3 = this.muteButtonState;
        if (i3 == 3 || isGradientState(i3)) {
            this.muteButton.invalidate();
        }
        View view = this.buttonsBackgroundGradientView;
        if (view != null) {
            int[] iArr = this.gradientColors;
            iArr[0] = this.backgroundColor;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.buttonsBackgroundGradient.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.gradientColors);
                this.buttonsBackgroundGradient = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.buttonsBackgroundGradientView2.setBackgroundColor(this.gradientColors[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_leaveButton), Theme.getColor(Theme.key_voipgroup_leaveButtonScrolled), f, 1.0f);
        this.leaveButton.setBackgroundColor(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_lastSeenTextUnscrolled), Theme.getColor(Theme.key_voipgroup_lastSeenText), f, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_mutedIconUnscrolled), Theme.getColor(Theme.key_voipgroup_mutedIcon), f, 1.0f);
        int color2 = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
        int childCount = this.listView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.listView.getChildAt(i4);
            if (childAt instanceof GroupCallTextCell) {
                GroupCallTextCell groupCallTextCell = (GroupCallTextCell) childAt;
                if (isConference()) {
                    groupCallTextCell.setColors(color2, color2);
                } else {
                    groupCallTextCell.setColors(offsetColor5, offsetColor4);
                }
            } else if (childAt instanceof GroupCallUserCell) {
                ((GroupCallUserCell) childAt).setGrayIconColor(this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled, offsetColor5);
            } else if (childAt instanceof GroupCallInvitedCell) {
                ((GroupCallInvitedCell) childAt).setGrayIconColor(this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled, offsetColor5);
            }
        }
        this.containerView.invalidate();
        this.listView.invalidate();
        this.container.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLink(final boolean z) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(getChatId()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            final TLRPC.ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(getChatId());
            String publicUsername = ChatObject.getPublicUsername(this.currentChat);
            if (TextUtils.isEmpty(publicUsername)) {
                str = (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
            } else {
                str = this.accountInstance.getMessagesController().linkPrefix + "/" + publicUsername;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.currentChat);
                this.accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda38
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        GroupCallActivity.this.lambda$getLink$56(chatFull, z, tLObject, tL_error);
                    }
                });
                return;
            }
            openShareAlert(true, null, str, z);
            return;
        }
        if (this.call == null) {
            return;
        }
        final int i = 0;
        while (i < 2) {
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            exportgroupcallinvite.call = this.call.getInputGroupCall();
            exportgroupcallinvite.can_self_unmute = i == 1;
            this.accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda39
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    GroupCallActivity.this.lambda$getLink$58(i, z, tLObject, tL_error);
                }
            });
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLink$56(final TLRPC.ChatFull chatFull, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$getLink$55(tLObject, chatFull, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLink$55(TLObject tLObject, TLRPC.ChatFull chatFull, boolean z) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            } else {
                openShareAlert(true, null, tL_chatInviteExported.link, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLink$58(final int i, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda69
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$getLink$57(tLObject, i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLink$57(TLObject tLObject, int i, boolean z) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            this.invites[i] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        } else {
            this.invites[i] = "";
        }
        for (int i2 = 0; i2 < 2; i2++) {
            String str = this.invites[i2];
            if (str == null) {
                return;
            }
            if (str.length() == 0) {
                this.invites[i2] = null;
            }
        }
        if (!z && canManageCall() && !this.call.call.join_muted) {
            this.invites[0] = null;
        }
        String[] strArr = this.invites;
        if (strArr[0] == null && strArr[1] == null && ChatObject.isPublic(this.currentChat)) {
            openShareAlert(true, null, this.accountInstance.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(this.currentChat), z);
            return;
        }
        String[] strArr2 = this.invites;
        openShareAlert(false, strArr2[0], strArr2[1], z);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void openShareAlert(boolean z, String str, String str2, boolean z2) {
        boolean z3;
        String str3;
        String str4;
        String str5;
        String formatString;
        String str6 = (!isRtmpStream() || str == null) ? str2 : null;
        if (z2) {
            if (str != null) {
                str6 = str;
            }
            AndroidUtilities.addToClipboard(str6);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.parentActivity;
        if (launchActivity != null) {
            BaseFragment baseFragment = (BaseFragment) launchActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
            if (baseFragment instanceof ChatActivity) {
                boolean needEnterText = ((ChatActivity) baseFragment).needEnterText();
                this.anyEnterEventSent = true;
                this.enterEventSent = true;
                z3 = needEnterText;
                if (str == null && str6 == null) {
                    str4 = str;
                    str3 = null;
                } else {
                    str3 = str;
                    str4 = str6;
                }
                if (str3 == null || !z) {
                    str5 = str4;
                } else {
                    if (ChatObject.isChannelOrGiga(this.currentChat)) {
                        formatString = LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4);
                    } else {
                        formatString = LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
                    }
                    str5 = formatString;
                }
                ShareAlert shareAlert = new ShareAlert(getContext(), null, null, str5, str3, false, str4, str3, false, true) { // from class: org.telegram.ui.GroupCallActivity.55
                    @Override // org.telegram.ui.Components.ShareAlert
                    protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
                        if (z4) {
                            if (longSparseArray.size() == 1) {
                                GroupCallActivity.this.getUndoView().showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 41, Integer.valueOf(i));
                            } else {
                                GroupCallActivity.this.getUndoView().showWithAction(0L, 41, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                            }
                        }
                    }
                };
                this.shareAlert = shareAlert;
                shareAlert.setDelegate(new ShareAlert.ShareAlertDelegate() { // from class: org.telegram.ui.GroupCallActivity.56
                    @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
                    public /* synthetic */ void didShare() {
                        ShareAlert.ShareAlertDelegate.-CC.$default$didShare(this);
                    }

                    @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
                    public boolean didCopy() {
                        if (!AndroidUtilities.shouldShowClipboardToast()) {
                            return true;
                        }
                        GroupCallActivity.this.getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                        return true;
                    }
                });
                this.shareAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda62
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GroupCallActivity.this.lambda$openShareAlert$59(dialogInterface);
                    }
                });
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda63
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.this.lambda$openShareAlert$60();
                    }
                }, !z3 ? 200L : 0L);
            }
        }
        z3 = false;
        if (str == null) {
        }
        str3 = str;
        str4 = str6;
        if (str3 == null) {
        }
        str5 = str4;
        ShareAlert shareAlert2 = new ShareAlert(getContext(), null, null, str5, str3, false, str4, str3, false, true) { // from class: org.telegram.ui.GroupCallActivity.55
            @Override // org.telegram.ui.Components.ShareAlert
            protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
                if (z4) {
                    if (longSparseArray.size() == 1) {
                        GroupCallActivity.this.getUndoView().showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 41, Integer.valueOf(i));
                    } else {
                        GroupCallActivity.this.getUndoView().showWithAction(0L, 41, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                    }
                }
            }
        };
        this.shareAlert = shareAlert2;
        shareAlert2.setDelegate(new ShareAlert.ShareAlertDelegate() { // from class: org.telegram.ui.GroupCallActivity.56
            @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
            public /* synthetic */ void didShare() {
                ShareAlert.ShareAlertDelegate.-CC.$default$didShare(this);
            }

            @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
            public boolean didCopy() {
                if (!AndroidUtilities.shouldShowClipboardToast()) {
                    return true;
                }
                GroupCallActivity.this.getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                return true;
            }
        });
        this.shareAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda62
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$openShareAlert$59(dialogInterface);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$openShareAlert$60();
            }
        }, !z3 ? 200L : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openShareAlert$59(DialogInterface dialogInterface) {
        this.shareAlert = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openShareAlert$60() {
        ShareAlert shareAlert = this.shareAlert;
        if (shareAlert != null) {
            shareAlert.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void inviteUserToCall(final long j, final boolean z) {
        final TLRPC.User user;
        if (this.call == null || (user = this.accountInstance.getMessagesController().getUser(Long.valueOf(j))) == null) {
            return;
        }
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3)};
        final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
        invitetogroupcall.call = this.call.getInputGroupCall();
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.id;
        tL_inputUser.access_hash = user.access_hash;
        invitetogroupcall.users.add(tL_inputUser);
        final int sendRequest = this.accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda76
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$inviteUserToCall$63(j, alertDialogArr, user, z, invitetogroupcall, tLObject, tL_error);
            }
        });
        if (sendRequest != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda77
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$65(alertDialogArr, sendRequest);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$inviteUserToCall$63(final long j, final AlertDialog[] alertDialogArr, final TLRPC.User user, final boolean z, final TL_phone.inviteToGroupCall invitetogroupcall, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda84
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$61(j, alertDialogArr, user);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda85
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$62(alertDialogArr, z, tL_error, j, invitetogroupcall);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$inviteUserToCall$61(long j, AlertDialog[] alertDialogArr, TLRPC.User user) {
        ChatObject.Call call = this.call;
        if (call == null || this.delayedGroupCallUpdated) {
            return;
        }
        call.addInvitedUser(j);
        applyCallParticipantUpdates(true);
        GroupVoipInviteAlert groupVoipInviteAlert = this.groupVoipInviteAlert;
        if (groupVoipInviteAlert != null) {
            groupVoipInviteAlert.dismiss();
        }
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        getUndoView().showWithAction(0L, 34, user, this.currentChat, (Runnable) null, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$inviteUserToCall$62(AlertDialog[] alertDialogArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        if (z && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            processSelectedOption(null, j, 3);
        } else {
            AlertsCreator.processError(this.currentAccount, tL_error, (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$inviteUserToCall$65(AlertDialog[] alertDialogArr, final int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda83
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$inviteUserToCall$64(i, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$inviteUserToCall$64(int i, DialogInterface dialogInterface) {
        this.accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    public void invalidateActionBarAlpha() {
        ActionBar actionBar = this.actionBar;
        actionBar.setAlpha((actionBar.getTag() != null ? 1.0f : 0.0f) * (1.0f - this.renderersContainer.progressToFullscreenMode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateScrollTopOffset() {
        int childCount = this.listView.getChildCount();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (this.listView.getChildAdapterPosition(childAt) >= 0) {
                i = Math.min(i, childAt.getTop());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayout(boolean z) {
        boolean z2 = true;
        int childCount = this.listView.getChildCount();
        float f = 2.14748365E9f;
        for (int i = 0; i < childCount; i++) {
            if (this.listView.getChildAdapterPosition(this.listView.getChildAt(i)) >= 0) {
                f = Math.min(f, r8.getTop());
            }
        }
        if (f < 0.0f || f == 2.14748365E9f) {
            f = childCount != 0 ? 0.0f : this.listView.getPaddingTop();
        }
        final boolean z3 = f <= ((float) (ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float currentActionBarHeight = f + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(14.0f);
        if ((z3 && this.actionBar.getTag() == null) || (!z3 && this.actionBar.getTag() != null)) {
            this.actionBar.setTag(z3 ? 1 : null);
            AnimatorSet animatorSet = this.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.actionBarAnimation = null;
            }
            setUseLightStatusBar(this.actionBar.getTag() == null);
            ViewPropertyAnimator duration = this.actionBar.getBackButton().animate().scaleX(z3 ? 1.0f : 0.9f).scaleY(z3 ? 1.0f : 0.9f).translationX(z3 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.actionBar.getTitleTextView().animate().translationY(z3 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(cubicBezierInterpolator).start();
            ObjectAnimator objectAnimator = this.subtitleYAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.subtitleYAnimator.cancel();
            }
            SimpleTextView subtitleTextView = this.actionBar.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<SimpleTextView, Float>) property, this.actionBar.getSubtitleTextView().getTranslationY(), z3 ? 0.0f : AndroidUtilities.dp(20.0f));
            this.subtitleYAnimator = ofFloat;
            ofFloat.setDuration(300L);
            this.subtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            this.subtitleYAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.57
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.subtitleYAnimator = null;
                    groupCallActivity.actionBar.getSubtitleTextView().setTranslationY(z3 ? 0.0f : AndroidUtilities.dp(20.0f));
                }
            });
            this.subtitleYAnimator.start();
            ObjectAnimator objectAnimator2 = this.additionalSubtitleYAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.actionBar.getAdditionalSubtitleTextView(), (Property<SimpleTextView, Float>) property, z3 ? 0.0f : AndroidUtilities.dp(20.0f));
            this.additionalSubtitleYAnimator = ofFloat2;
            ofFloat2.setDuration(300L);
            this.additionalSubtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            this.additionalSubtitleYAnimator.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = this.actionBarAnimation;
            ActionBar actionBar = this.actionBar;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property2, z3 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.actionBarBackground, (Property<View, Float>) property2, z3 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.actionBarShadow, (Property<View, Float>) property2, z3 ? 1.0f : 0.0f));
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.58
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    GroupCallActivity.this.actionBarAnimation = null;
                }
            });
            this.actionBarAnimation.start();
            ImageView imageView = this.renderersContainer.pipView;
            if (z3 && !isLandscapeMode) {
                z2 = false;
            }
            imageView.setClickable(z2);
        }
        if (this.scrollOffsetY != currentActionBarHeight) {
            setScrollOffsetY(currentActionBarHeight);
        }
    }

    public void invalidateScrollOffsetY() {
        setScrollOffsetY(this.scrollOffsetY);
    }

    private void setScrollOffsetY(float f) {
        int i;
        this.scrollOffsetY = f;
        this.listView.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) this.listView.getLayoutParams()).topMargin));
        float dp = f - AndroidUtilities.dp(74.0f);
        if (this.backgroundPaddingTop + dp < ActionBar.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((ActionBar.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)) + ActionBar.getCurrentActionBarHeight()));
            i = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            LightningView lightningView = this.textureLightningView;
            if (lightningView != null) {
                lightningView.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.colorProgress) > 1.0E-4f) {
                setColorProgress(Math.min(1.0f, min));
            }
            float f2 = 1.0f - ((0.1f * min) * 1.2f);
            this.titleTextView.setScaleX(Math.max(0.9f, f2));
            this.titleTextView.setScaleY(Math.max(0.9f, f2));
            float f3 = 1.0f - (min * 1.2f);
            this.titleTextView.setAlpha(Math.max(0.0f, f3) * (1.0f - this.renderersContainer.progressToFullscreenMode));
            this.liveLabelTextView.setScaleX(Math.max(0.9f, f2));
            this.liveLabelTextView.setScaleY(Math.max(0.9f, f2));
            this.liveLabelTextView.setAlpha(Math.max(0.0f, f3) * (1.0f - this.renderersContainer.progressToFullscreenMode));
        } else {
            this.titleTextView.setScaleX(1.0f);
            this.titleTextView.setScaleY(1.0f);
            this.titleTextView.setAlpha(1.0f - this.renderersContainer.progressToFullscreenMode);
            this.liveLabelTextView.setScaleX(1.0f);
            this.liveLabelTextView.setScaleY(1.0f);
            this.liveLabelTextView.setAlpha(1.0f - this.renderersContainer.progressToFullscreenMode);
            if (this.colorProgress > 1.0E-4f) {
                setColorProgress(0.0f);
            }
            i = 0;
        }
        checkGroupCallUiPositions_MessagesList();
        float f4 = i;
        this.menuItemsContainer.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(53.0f)) - f4));
        this.titleLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f4));
        LightningView lightningView2 = this.textureLightningView;
        if (lightningView2 != null) {
            lightningView2.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f - AndroidUtilities.dp(37.0f)));
        }
        LinearLayout linearLayout = this.scheduleTimerContainer;
        if (linearLayout != null) {
            linearLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f4));
        }
        this.containerView.invalidate();
        updateTopBulletinY();
    }

    private void cancelMutePress() {
        if (this.scheduled) {
            this.scheduled = false;
            AndroidUtilities.cancelRunOnUIThread(this.pressRunnable);
        }
        if (this.pressed) {
            this.pressed = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.muteButton.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateState(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        int i2;
        int i3;
        ChatObject.Call call = this.call;
        int i4 = 5;
        if (call == null || call.isScheduled()) {
            if (!canManageCall()) {
                i4 = this.call.call.schedule_start_subscribed ? 7 : 6;
            }
            updateMuteButton(i4, z);
            this.leaveButton.setData(R.drawable.calls_decline, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            updateScheduleUI(false);
            return;
        }
        updateButtonsVisibility(z);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (!sharedInstance.isConverting() && !sharedInstance.isSwitchingStream() && ((this.creatingServiceTime == 0 || Math.abs(SystemClock.elapsedRealtime() - this.creatingServiceTime) > 3000) && ((i3 = this.currentCallState) == 1 || i3 == 2 || i3 == 6 || i3 == 5))) {
            cancelMutePress();
            updateMuteButton(3, z);
        } else {
            if (this.userSwitchObject != null) {
                getUndoView().showWithAction(0L, 37, this.userSwitchObject, this.currentChat, (Runnable) null, (Runnable) null);
                this.userSwitchObject = null;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
            if (!sharedInstance.micSwitching && groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !canManageCall()) {
                cancelMutePress();
                if (groupCallParticipant.raise_hand_rating != 0) {
                    updateMuteButton(4, z);
                } else {
                    updateMuteButton(2, z);
                }
                sharedInstance.setMicMute(true, false, false);
            } else {
                boolean isMicMute = sharedInstance.isMicMute();
                if (!sharedInstance.micSwitching && z2 && groupCallParticipant != null && groupCallParticipant.muted && !isMicMute) {
                    cancelMutePress();
                    sharedInstance.setMicMute(true, false, false);
                    isMicMute = true;
                }
                if (isMicMute) {
                    updateMuteButton(0, z);
                } else {
                    updateMuteButton(1, z);
                }
            }
        }
        boolean z7 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        boolean z8 = (groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || canManageCall()) ? false : true;
        if (((z8 || !this.call.canRecordVideo()) && !z7) || isRtmpStream()) {
            z3 = false;
            z4 = true;
        } else {
            z3 = true;
            z4 = false;
        }
        if (z7) {
            z5 = false;
            i = 1;
        } else {
            z5 = !z8;
            i = 0;
        }
        if (isLandscapeMode) {
            z6 = false;
            i2 = 0;
        } else {
            z6 = z5;
            i2 = i;
        }
        int i5 = i2 + (z4 ? 2 : 0) + (z3 ? 4 : 0);
        GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
        int i6 = i5 + ((groupCallRenderersContainer == null || !groupCallRenderersContainer.inFullscreenMode) ? 0 : 8) + (z6 ? 16 : 0);
        boolean z9 = (this.buttonsVisibility | 2) != (i6 | 2);
        this.buttonsVisibility = i6;
        if (z3) {
            this.cameraButton.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z7, z);
            this.cameraButton.setChecked(true, false);
        }
        if (i2 != 0) {
            this.flipButton.setData(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
            this.flipButton.setChecked(true, false);
        }
        if (z6) {
            int audioOutputIcon = getAudioOutputIcon(getAudioOutputValue());
            if (this.speakerIcon != audioOutputIcon) {
                ImageView imageView = this.speakerImageView;
                this.speakerIcon = audioOutputIcon;
                AndroidUtilities.updateImageViewImageAnimated(imageView, audioOutputIcon);
            }
            this.speakerButton.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z);
            this.speakerButton.setChecked(getAudioOutputActive(getAudioOutputValue()), z);
        }
        this.leaveButton.setData(isRtmpStream() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z9 && z4) {
            updateSpeakerPhoneIcon(false);
        }
        this.cameraButton.showText(true, z);
        this.flipButton.showText(true, z);
        this.speakerButton.showText(true, z);
        updateLiveLabel(z);
        if (isRtmpStream() && LiteMode.isEnabled(512)) {
            if (this.currentCallState == 3) {
                this.needTextureLightning = true;
                runUpdateTextureLightningRunnable();
            } else {
                this.needTextureLightning = false;
                AndroidUtilities.cancelRunOnUIThread(this.updateTextureLightningRunnable);
            }
        }
    }

    private void updateButtonsVisibility(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ChatObject.Call call = this.call;
        boolean z7 = false;
        if (call == null || call.isScheduled()) {
            this.buttonsContainer.setButtonVisibility(this.muteButton, this.switchToButtonProgress > 0.1f, z);
            this.buttonsContainer.setButtonVisibility(this.leaveButton, this.switchToButtonProgress > 0.1f, z);
            this.buttonsContainer.setButtonVisibility(this.soundButton, this.switchToButtonProgress > 0.1f, z);
            this.buttonsContainer.setButtonVisibility(this.cameraButton, false, z);
            this.buttonsContainer.setButtonVisibility(this.flipButton, false, z);
            this.buttonsContainer.setButtonVisibility(this.speakerButton, false, z);
            this.buttonsContainer.setButtonVisibility(this.messageButton, false, z);
            return;
        }
        boolean z8 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        boolean z9 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
        Boolean bool = this.pendingCommentsEnabled;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.call.call;
            z2 = groupCall != null && groupCall.messages_enabled;
        }
        if (((z9 || !this.call.canRecordVideo()) && !z8) || isRtmpStream()) {
            z3 = false;
            z4 = true;
        } else {
            z3 = true;
            z4 = false;
        }
        if (z8) {
            z5 = false;
            z6 = true;
        } else {
            z5 = !z9;
            z6 = false;
        }
        if (isLandscapeMode) {
            z5 = false;
        } else {
            z7 = z6;
        }
        this.buttonsContainer.setButtonVisibility(this.muteButton, true, z);
        this.buttonsContainer.setButtonVisibility(this.leaveButton, true, z);
        this.buttonsContainer.setButtonVisibility(this.cameraButton, z3, z);
        this.buttonsContainer.setButtonVisibility(this.flipButton, z7, z);
        this.buttonsContainer.setButtonVisibility(this.soundButton, z4, z);
        this.buttonsContainer.setButtonVisibility(this.speakerButton, z5, z);
        this.buttonsContainer.setButtonVisibility(this.messageButton, z2, z);
    }

    private void updateLiveLabel(boolean z) {
        if (isRtmpStream()) {
            this.liveLabelTextView.setVisibility(0);
            boolean z2 = ((Integer) this.liveLabelTextView.getTag()).intValue() == 3;
            int i = this.currentCallState;
            final boolean z3 = i == 3;
            this.liveLabelTextView.setTag(Integer.valueOf(i));
            if (z2 != z3) {
                ValueAnimator valueAnimator = this.liveLabelBgColorAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (z) {
                    final int color = this.liveLabelPaint.getColor();
                    final int i2 = z3 ? -1163700 : -12761513;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.liveLabelBgColorAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            GroupCallActivity.this.lambda$updateLiveLabel$66(color, i2, z3, valueAnimator2);
                        }
                    });
                    this.liveLabelBgColorAnimator.setDuration(300L);
                    this.liveLabelBgColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.liveLabelBgColorAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.59
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            GroupCallActivity.this.liveLabelBgColorAnimator = null;
                            GroupCallActivity.this.liveLabelPaint.setColor(GroupCallActivity.this.currentCallState == 3 ? -1163700 : -12761513);
                            GroupCallActivity.this.liveLabelTextView.invalidate();
                        }
                    });
                    this.liveLabelBgColorAnimator.start();
                    return;
                }
                this.liveLabelPaint.setColor(this.currentCallState == 3 ? -1163700 : -12761513);
                this.liveLabelTextView.invalidate();
                return;
            }
            return;
        }
        this.liveLabelTextView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateLiveLabel$66(int i, int i2, boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.liveLabelPaint.setColor(AndroidUtilities.getOffsetColor(i, i2, floatValue, 1.0f));
        this.liveLabelTextView.invalidate();
        if (!z) {
            floatValue = 1.0f - floatValue;
        }
        this.textureLightningViewAnimatingAlpha = floatValue;
        LightningView lightningView = this.textureLightningView;
        if (lightningView == null || !this.needTextureLightning) {
            return;
        }
        lightningView.invalidate();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onAudioSettingsChanged() {
        updateSpeakerPhoneIcon(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            setMicAmplitude(0.0f);
        }
        if (this.listView.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(this.listView);
        }
        if (this.fullscreenUsersListView.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
        }
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).updateAttachState(true);
        }
    }

    private void updateSpeakerPhoneIcon(boolean z) {
        VoIPToggleButton voIPToggleButton = this.soundButton;
        if (voIPToggleButton == null || voIPToggleButton.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = false;
        if (sharedInstance == null || isRtmpStream()) {
            this.soundButton.setData(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z);
            this.buttonsContainer.setButtonEnabled(this.soundButton, ChatObject.isPublic(this.currentChat) || (ChatObject.hasAdminRights(this.currentChat) && ChatObject.canAddUsers(this.currentChat)), z);
            this.soundButton.setChecked(true, false);
            return;
        }
        this.buttonsContainer.setButtonEnabled(this.soundButton, true, z);
        boolean z3 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        if (!z3 && sharedInstance.isSpeakerphoneOn()) {
            z2 = true;
        }
        if (z3) {
            this.soundButton.setData(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z);
        } else if (z2) {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            this.soundButton.setData(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z);
        } else {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z);
        }
        this.soundButton.setChecked(z2, z);
        int audioOutputIcon = getAudioOutputIcon(getAudioOutputValue());
        if (this.speakerIcon != audioOutputIcon) {
            ImageView imageView = this.speakerImageView;
            this.speakerIcon = audioOutputIcon;
            AndroidUtilities.updateImageViewImageAnimated(imageView, audioOutputIcon);
        }
        if (this.speakerButton.getVisibility() == 0) {
            this.speakerButton.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z);
            this.speakerButton.setChecked(getAudioOutputActive(getAudioOutputValue()), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateMuteButton(int i, boolean z) {
        boolean customEndFrame;
        boolean customEndFrame2;
        String string;
        String string2;
        boolean z2;
        String str;
        String string3;
        String string4;
        boolean customEndFrame3;
        boolean customEndFrame4;
        boolean customEndFrame5;
        String str2;
        String str3;
        GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
        boolean z3 = groupCallRenderersContainer != null && groupCallRenderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode());
        if (!isRtmpStream() && this.muteButtonState == i && z) {
            return;
        }
        if (i == 7) {
            string3 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
            customEndFrame5 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.savedMessagesDialogsUpdate);
        } else if (i == 6) {
            string3 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
            customEndFrame5 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.webBrowserSettingsUpdate);
        } else {
            if (i == 5) {
                string3 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                customEndFrame4 = this.bigMicDrawable.setCustomEndFrame(377);
            } else {
                if (i == 0) {
                    string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                    string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                    int i2 = this.muteButtonState;
                    if (i2 == 3) {
                        int customEndFrame6 = this.bigMicDrawable.getCustomEndFrame();
                        if (customEndFrame6 == 136 || customEndFrame6 == 173 || customEndFrame6 == 274 || customEndFrame6 == 311) {
                            customEndFrame3 = this.bigMicDrawable.setCustomEndFrame(99);
                        } else {
                            string2 = string4;
                            str = string3;
                            customEndFrame = false;
                            z2 = false;
                            if (isRtmpStream() || i == 3 || this.call.isScheduled()) {
                                str2 = string2;
                            } else {
                                String string5 = LocaleController.getString(z3 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                                boolean z4 = this.animatingToFullscreenExpand != z3;
                                this.animatingToFullscreenExpand = z3;
                                customEndFrame = z4;
                                str2 = "";
                                str = string5;
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str3 = str;
                            } else {
                                str3 = str + " " + str2;
                            }
                            this.muteButton.setContentDescription(str3);
                            this.muteButton.setData(0, 0, 0, str, false, z);
                            if (z) {
                                if (customEndFrame) {
                                    if (i == 5) {
                                        this.bigMicDrawable.setCurrentFrame(376);
                                    } else if (i == 7) {
                                        this.bigMicDrawable.setCurrentFrame(NotificationCenter.didEndCall);
                                    } else if (i == 6) {
                                        this.bigMicDrawable.setCurrentFrame(NotificationCenter.billingConfirmPurchaseError);
                                    } else if (i == 0) {
                                        int i3 = this.muteButtonState;
                                        if (i3 == 5) {
                                            this.bigMicDrawable.setCurrentFrame(376);
                                        } else if (i3 == 7) {
                                            this.bigMicDrawable.setCurrentFrame(NotificationCenter.webBrowserSettingsUpdate);
                                        } else if (i3 == 6) {
                                            this.bigMicDrawable.setCurrentFrame(NotificationCenter.savedMessagesDialogsUpdate);
                                        } else if (i3 == 2) {
                                            this.bigMicDrawable.setCurrentFrame(0);
                                        } else {
                                            this.bigMicDrawable.setCurrentFrame(69);
                                        }
                                    } else if (i == 1 || (this.muteButtonState == 2 && isConference())) {
                                        this.bigMicDrawable.setCurrentFrame(this.muteButtonState == 4 ? 69 : 36);
                                    } else if (i == 4) {
                                        this.bigMicDrawable.setCurrentFrame(99);
                                    } else if (z2) {
                                        int i4 = this.muteButtonState;
                                        if (i4 == 7) {
                                            this.bigMicDrawable.setCurrentFrame(NotificationCenter.didSetNewWallpapper);
                                        } else if (i4 == 6) {
                                            this.bigMicDrawable.setCurrentFrame(NotificationCenter.adminedChannelsLoaded);
                                        } else if (i4 == 1) {
                                            this.bigMicDrawable.setCurrentFrame(NotificationCenter.httpFileDidFailedLoad);
                                        } else {
                                            this.bigMicDrawable.setCurrentFrame(99);
                                        }
                                    } else {
                                        int i5 = this.muteButtonState;
                                        if (i5 == 5) {
                                            this.bigMicDrawable.setCurrentFrame(376);
                                        } else if (i5 == 7) {
                                            this.bigMicDrawable.setCurrentFrame(NotificationCenter.webBrowserSettingsUpdate);
                                        } else if (i5 == 6) {
                                            this.bigMicDrawable.setCurrentFrame(NotificationCenter.savedMessagesDialogsUpdate);
                                        } else if (i5 == 2 || i5 == 4) {
                                            this.bigMicDrawable.setCurrentFrame(0);
                                        } else {
                                            this.bigMicDrawable.setCurrentFrame(69);
                                        }
                                    }
                                }
                                this.muteButtonIcon.playAnimation();
                                if (isRtmpStream() && !this.call.isScheduled()) {
                                    GroupCallRenderersContainer groupCallRenderersContainer2 = this.renderersContainer;
                                    this.expandOrMinimizeButton.setImageResource(groupCallRenderersContainer2 != null && groupCallRenderersContainer2.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode()) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    this.expandOrMinimizeButton.setVisibility(0);
                                    this.muteButtonIcon.setVisibility(8);
                                } else {
                                    this.expandOrMinimizeButton.setVisibility(8);
                                    this.muteButtonIcon.setVisibility(0);
                                }
                                this.muteButtonState = i;
                            } else {
                                this.muteButtonState = i;
                                RLottieDrawable rLottieDrawable = this.bigMicDrawable;
                                rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
                                if (isRtmpStream() && !this.call.isScheduled()) {
                                    GroupCallRenderersContainer groupCallRenderersContainer3 = this.renderersContainer;
                                    this.expandOrMinimizeButton.setImageResource(groupCallRenderersContainer3 != null && groupCallRenderersContainer3.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode()) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                                    this.expandOrMinimizeButton.setVisibility(0);
                                    this.muteButtonIcon.setVisibility(8);
                                } else {
                                    this.expandOrMinimizeButton.setVisibility(8);
                                    this.muteButtonIcon.setVisibility(0);
                                }
                            }
                            updateMuteButtonState(z);
                        }
                    } else if (i2 == 5) {
                        customEndFrame3 = this.bigMicDrawable.setCustomEndFrame(404);
                    } else if (i2 == 7) {
                        customEndFrame3 = this.bigMicDrawable.setCustomEndFrame(376);
                    } else if (i2 == 6) {
                        customEndFrame3 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.adminedChannelsLoaded);
                    } else if (i2 == 2) {
                        customEndFrame3 = this.bigMicDrawable.setCustomEndFrame(36);
                    } else {
                        customEndFrame3 = this.bigMicDrawable.setCustomEndFrame(99);
                    }
                } else if (i == 1) {
                    string3 = LocaleController.getString(isConference() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                    customEndFrame4 = this.bigMicDrawable.setCustomEndFrame(this.muteButtonState == 4 ? 99 : 69);
                } else if (isConference() && i == 2) {
                    string3 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                    customEndFrame4 = this.bigMicDrawable.setCustomEndFrame(99);
                } else if (i == 4) {
                    string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                    string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                    customEndFrame3 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.httpFileDidFailedLoad);
                } else {
                    TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
                    boolean z5 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
                    if (z5) {
                        int i6 = this.muteButtonState;
                        if (i6 == 7) {
                            customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.billingConfirmPurchaseError);
                        } else if (i6 == 6) {
                            customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.didSetNewWallpapper);
                        } else if (i6 == 1) {
                            customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.didEndCall);
                        } else {
                            customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.httpFileDidFailedLoad);
                        }
                    } else {
                        int i7 = this.muteButtonState;
                        if (i7 == 5) {
                            customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(404);
                        } else if (i7 == 7) {
                            customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(376);
                        } else {
                            if (i7 != 6) {
                                if (i7 == 2 || i7 == 4) {
                                    customEndFrame = this.bigMicDrawable.setCustomEndFrame(36);
                                    if (i == 3) {
                                        string = LocaleController.getString(R.string.Connecting);
                                        string2 = "";
                                    } else {
                                        string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                        string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                                    }
                                    String str4 = string;
                                    z2 = z5;
                                    str = str4;
                                    if (isRtmpStream()) {
                                    }
                                    str2 = string2;
                                    if (TextUtils.isEmpty(str2)) {
                                    }
                                    this.muteButton.setContentDescription(str3);
                                    this.muteButton.setData(0, 0, 0, str, false, z);
                                    if (z) {
                                    }
                                    updateMuteButtonState(z);
                                }
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(99);
                                if (i == 3) {
                                }
                                String str42 = string;
                                z2 = z5;
                                str = str42;
                                if (isRtmpStream()) {
                                }
                                str2 = string2;
                                if (TextUtils.isEmpty(str2)) {
                                }
                                this.muteButton.setContentDescription(str3);
                                this.muteButton.setData(0, 0, 0, str, false, z);
                                if (z) {
                                }
                                updateMuteButtonState(z);
                            }
                            customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(NotificationCenter.adminedChannelsLoaded);
                        }
                    }
                    customEndFrame = customEndFrame2;
                    if (i == 3) {
                    }
                    String str422 = string;
                    z2 = z5;
                    str = str422;
                    if (isRtmpStream()) {
                    }
                    str2 = string2;
                    if (TextUtils.isEmpty(str2)) {
                    }
                    this.muteButton.setContentDescription(str3);
                    this.muteButton.setData(0, 0, 0, str, false, z);
                    if (z) {
                    }
                    updateMuteButtonState(z);
                }
                customEndFrame = customEndFrame3;
                string2 = string4;
                str = string3;
                z2 = false;
                if (isRtmpStream()) {
                }
                str2 = string2;
                if (TextUtils.isEmpty(str2)) {
                }
                this.muteButton.setContentDescription(str3);
                this.muteButton.setData(0, 0, 0, str, false, z);
                if (z) {
                }
                updateMuteButtonState(z);
            }
            customEndFrame = customEndFrame4;
            string2 = "";
            str = string3;
            z2 = false;
            if (isRtmpStream()) {
            }
            str2 = string2;
            if (TextUtils.isEmpty(str2)) {
            }
            this.muteButton.setContentDescription(str3);
            this.muteButton.setData(0, 0, 0, str, false, z);
            if (z) {
            }
            updateMuteButtonState(z);
        }
        customEndFrame = customEndFrame5;
        string2 = "";
        str = string3;
        z2 = false;
        if (isRtmpStream()) {
        }
        str2 = string2;
        if (TextUtils.isEmpty(str2)) {
        }
        this.muteButton.setContentDescription(str3);
        this.muteButton.setData(0, 0, 0, str, false, z);
        if (z) {
        }
        updateMuteButtonState(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillColors(int i, int[] iArr) {
        if (isRtmpStream()) {
            int i2 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(i2);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_rtmpButton), Theme.getColor(Theme.key_voipgroup_soundButtonActiveScrolled), this.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(i2), this.colorProgress, 1.0f);
        } else if (i == 0) {
            iArr[0] = Theme.getColor(Theme.key_voipgroup_unmuteButton2);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_soundButtonActive), Theme.getColor(Theme.key_voipgroup_soundButtonActiveScrolled), this.colorProgress, 1.0f);
            iArr[2] = Theme.getColor(Theme.key_voipgroup_soundButton);
        } else if (i == 1) {
            iArr[0] = Theme.getColor(Theme.key_voipgroup_muteButton2);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_soundButtonActive2), Theme.getColor(Theme.key_voipgroup_soundButtonActive2Scrolled), this.colorProgress, 1.0f);
            iArr[2] = Theme.getColor(Theme.key_voipgroup_soundButton2);
        } else if (isGradientState(i)) {
            iArr[0] = Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3);
            iArr[1] = Theme.getColor(Theme.key_voipgroup_mutedByAdminMuteButton);
            iArr[2] = Theme.getColor(Theme.key_voipgroup_mutedByAdminMuteButtonDisabled);
        } else {
            int i3 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(i3);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_disabledButtonActive), Theme.getColor(Theme.key_voipgroup_disabledButtonActiveScrolled), this.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(i3), this.colorProgress, 1.0f);
        }
        if (isGradientState(i)) {
            iArr[3] = ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3), 0.5f);
        } else if (i == 1) {
            iArr[3] = ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_soundButtonActive2), ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_muteButton), Theme.getColor(Theme.key_voipgroup_muteButton3), 0.5f), 0.75f);
        } else {
            iArr[3] = ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_unmuteButton2), Theme.getColor(Theme.key_voipgroup_unmuteButton), 0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRecordHint(View view) {
        if (this.recordHintView == null) {
            HintView hintView = new HintView(getContext(), 8, true);
            this.recordHintView = hintView;
            hintView.setAlpha(0.0f);
            this.recordHintView.setVisibility(4);
            this.recordHintView.setShowingDuration(3000L);
            this.containerView.addView(this.recordHintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.recordHintView.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.recordHintView.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.recordHintView.setBackgroundColor(-366530760, -1);
        }
        this.recordHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.recordHintView.showForView(view, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showReminderHint() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (this.reminderHintView == null) {
            HintView hintView = new HintView(getContext(), 8);
            this.reminderHintView = hintView;
            hintView.setAlpha(0.0f);
            this.reminderHintView.setVisibility(4);
            this.reminderHintView.setShowingDuration(4000L);
            this.containerView.addView(this.reminderHintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.reminderHintView.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            this.reminderHintView.setBackgroundColor(-366530760, -1);
        }
        this.reminderHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.reminderHintView.showForView(this.muteButton, true);
    }

    private void updateMuteButtonState(boolean z) {
        boolean z2;
        this.muteButton.invalidate();
        WeavingState[] weavingStateArr = this.states;
        int i = this.muteButtonState;
        if (weavingStateArr[i] == null) {
            weavingStateArr[i] = new WeavingState(i);
            int i2 = this.muteButtonState;
            if (i2 == 3) {
                this.states[i2].shader = null;
            } else if (isGradientState(i2)) {
                this.states[this.muteButtonState].shader = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient2)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                int i3 = this.muteButtonState;
                if (i3 == 1) {
                    this.states[i3].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(Theme.key_voipgroup_muteButton), Theme.getColor(Theme.key_voipgroup_muteButton3)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    this.states[i3].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(Theme.key_voipgroup_unmuteButton2), Theme.getColor(Theme.key_voipgroup_unmuteButton)}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
        }
        WeavingState weavingState = this.states[this.muteButtonState];
        WeavingState weavingState2 = this.currentState;
        if (weavingState != weavingState2) {
            this.prevState = weavingState2;
            this.currentState = weavingState;
            if (weavingState2 == null || !z) {
                this.switchProgress = 1.0f;
                this.prevState = null;
            } else {
                this.switchProgress = 0.0f;
            }
        }
        if (!z) {
            WeavingState weavingState3 = this.currentState;
            boolean z3 = false;
            if (weavingState3 != null) {
                int i4 = weavingState3.currentState;
                boolean z4 = i4 == 1 || i4 == 0;
                z2 = i4 != 3;
                z3 = z4;
            } else {
                z2 = false;
            }
            this.showWavesProgress = z3 ? 1.0f : 0.0f;
            this.showLightingProgress = z2 ? 1.0f : 0.0f;
        }
        this.buttonsContainer.invalidate();
    }

    private static void processOnLeave(ChatObject.Call call, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(j);
            if (groupCallParticipant != null) {
                call.participants.delete(j);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i = 0;
                while (i < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
            }
            for (int i2 = 0; i2 < call.sortedParticipants.size(); i2++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i2);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static void onLeaveClick(Context context, Runnable runnable, boolean z) {
        onLeaveClick(context, runnable, z, false);
    }

    public static void onLeaveClick(Context context, final Runnable runnable, boolean z, boolean z2) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        final ChatObject.Call call = sharedInstance.groupCall;
        final long selfId = sharedInstance.getSelfId();
        if (z2 || !ChatObject.canManageCalls(chat)) {
            processOnLeave(call, false, selfId, runnable);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (sharedInstance.isConference()) {
            builder.setTitle(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText));
        } else if (ChatObject.isChannelOrGiga(chat)) {
            builder.setTitle(LocaleController.getString(R.string.VoipChannelLeaveAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.VoipChannelLeaveAlertText));
        } else {
            builder.setTitle(LocaleController.getString(R.string.VoipGroupLeaveAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.VoipGroupLeaveAlertText));
        }
        sharedInstance.getAccount();
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1);
            checkBoxCellArr[0] = checkBoxCell;
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            if (z) {
                checkBoxCellArr[0].setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            } else {
                checkBoxCellArr[0].setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
                ((CheckBoxSquare) checkBoxCellArr[0].getCheckBoxView()).setColors(Theme.key_voipgroup_mutedIcon, Theme.key_voipgroup_listeningText, Theme.key_voipgroup_nameText);
            }
            checkBoxCellArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false);
            } else if (ChatObject.isChannelOrGiga(chat)) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false);
            } else {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false);
            }
            checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
            checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.lambda$onLeaveClick$67(checkBoxCellArr, view);
                }
            });
        }
        builder.setView(linearLayout);
        builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
        builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupLeave), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                GroupCallActivity.lambda$onLeaveClick$68(ChatObject.Call.this, checkBoxCellArr, selfId, runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        if (z) {
            builder.setDimEnabled(false);
        }
        AlertDialog create = builder.create();
        if (z) {
            if (Build.VERSION.SDK_INT >= 26) {
                create.getWindow().setType(2038);
            } else {
                create.getWindow().setType(2003);
            }
            create.getWindow().clearFlags(2);
        }
        if (!z) {
            create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
        }
        create.show();
        if (z) {
            return;
        }
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_leaveCallMenu));
        }
        create.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onLeaveClick$67(CheckBoxCell[] checkBoxCellArr, View view) {
        checkBoxCellArr[((Integer) view.getTag()).intValue()].setChecked(!checkBoxCellArr[r2.intValue()].isChecked(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onLeaveClick$68(ChatObject.Call call, CheckBoxCell[] checkBoxCellArr, long j, Runnable runnable, AlertDialog alertDialog, int i) {
        boolean z = false;
        CheckBoxCell checkBoxCell = checkBoxCellArr[0];
        if (checkBoxCell != null && checkBoxCell.isChecked()) {
            z = true;
        }
        processOnLeave(call, z, j, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSelectedOption(TLRPC.GroupCallParticipant groupCallParticipant, final long j, int i) {
        TLObject chat;
        String str;
        TextView textView;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (j > 0) {
            chat = this.accountInstance.getMessagesController().getUser(Long.valueOf(j));
        } else {
            chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-j));
        }
        final TLObject tLObject = chat;
        if (i == 0 || i == 2 || i == 3) {
            if (i == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                getUndoView().showWithAction(0L, 30, tLObject, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
            TextView textView2 = new TextView(getContext());
            int i2 = Theme.key_voipgroup_actionBarItems;
            textView2.setTextColor(Theme.getColor(i2));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            builder.setView(frameLayout);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            avatarDrawable.setInfo(this.currentAccount, tLObject);
            boolean z = tLObject instanceof TLRPC.User;
            if (z) {
                TLRPC.User user = (TLRPC.User) tLObject;
                backupImageView.setForUserOrChat(user, avatarDrawable);
                str = UserObject.getFirstName(user);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                backupImageView.setForUserOrChat(chat2, avatarDrawable);
                str = chat2.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(i2));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat3 = this.currentChat;
            String str2 = chat3 != null ? chat3.title : "";
            if (i == 2) {
                if (isConference()) {
                    textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceRemoveMemberAlertText2, str)));
                } else {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                    if (ChatObject.isChannelOrGiga(this.currentChat)) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelRemoveMemberAlertText2, str, str2)));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemoveMemberAlertText2, str, str2)));
                    }
                }
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupAddMemberText, str, str2)));
            }
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i == 2) {
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupUserRemove), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda72
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        GroupCallActivity.this.lambda$processSelectedOption$69(tLObject, alertDialog, i3);
                    }
                });
            } else if (z) {
                final TLRPC.User user2 = (TLRPC.User) tLObject;
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupAdd), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda73
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        GroupCallActivity.this.lambda$processSelectedOption$71(user2, j, alertDialog, i3);
                    }
                });
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog create = builder.create();
            create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
            create.show();
            if (i != 2 || (textView = (TextView) create.getButton(-1)) == null) {
                return;
            }
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_leaveCallMenu));
            return;
        }
        if (i == 6) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            this.parentActivity.lambda$runLinkRequest$100(new ChatActivity(bundle));
            dismiss();
            return;
        }
        if (i == 8) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            BaseFragment baseFragment = (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getDialogId() == j) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j > 0) {
                bundle2.putLong("user_id", j);
            } else {
                bundle2.putLong("chat_id", -j);
            }
            this.parentActivity.lambda$runLinkRequest$100(new ChatActivity(bundle2));
            dismiss();
            return;
        }
        if (i == 7) {
            sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
            updateMuteButton(2, true);
            return;
        }
        if (i == 9) {
            ImageUpdater imageUpdater = this.currentAvatarUpdater;
            if (imageUpdater == null || !imageUpdater.isUploadingImage()) {
                TLRPC.User currentUser = this.accountInstance.getUserConfig().getCurrentUser();
                ImageUpdater imageUpdater2 = new ImageUpdater(true, 0, true);
                this.currentAvatarUpdater = imageUpdater2;
                imageUpdater2.setOpenWithFrontfaceCamera(true);
                this.currentAvatarUpdater.setForceDarkTheme(true);
                this.currentAvatarUpdater.setSearchAvailable(true, true);
                this.currentAvatarUpdater.setShowingFromDialog(true);
                this.currentAvatarUpdater.parentFragment = this.parentActivity.getActionBarLayout().getLastFragment();
                ImageUpdater imageUpdater3 = this.currentAvatarUpdater;
                AvatarUpdaterDelegate avatarUpdaterDelegate = new AvatarUpdaterDelegate(j);
                this.avatarUpdaterDelegate = avatarUpdaterDelegate;
                imageUpdater3.setDelegate(avatarUpdaterDelegate);
                ImageUpdater imageUpdater4 = this.currentAvatarUpdater;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                imageUpdater4.openMenu((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda70
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.this.lambda$processSelectedOption$72();
                    }
                }, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda71
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GroupCallActivity.lambda$processSelectedOption$73(dialogInterface);
                    }
                }, 0);
                return;
            }
            return;
        }
        if (i == 10) {
            AlertsCreator.createChangeBioAlert(groupCallParticipant.about, j, getContext(), this.currentAccount);
            return;
        }
        if (i == 11) {
            AlertsCreator.createChangeNameAlert(j, getContext(), this.currentAccount);
            return;
        }
        if (i == 5) {
            sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
            getUndoView().showWithAction(0L, 35, tLObject);
            sharedInstance.setParticipantVolume(groupCallParticipant, 0);
            return;
        }
        if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
            groupCallParticipant.volume = 10000;
            groupCallParticipant.volume_by_admin = false;
            sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
        } else {
            sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
        }
        sharedInstance.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
        getUndoView().showWithAction(0L, i == 1 ? 31 : 36, tLObject, (Object) null, (Runnable) null, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSelectedOption$69(TLObject tLObject, AlertDialog alertDialog, int i) {
        ConferenceCall conferenceCall;
        if (isConference()) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || (conferenceCall = sharedInstance.conference) == null || !(tLObject instanceof TLRPC.User)) {
                return;
            }
            TLRPC.User user = (TLRPC.User) tLObject;
            conferenceCall.kick(user.id);
            this.call.addKickedUser(user.id);
            getUndoView().showWithAction(0L, 102, user, (Object) null, (Runnable) null, (Runnable) null);
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            this.accountInstance.getMessagesController().deleteParticipantFromChat(getChatId(), user2);
            getUndoView().showWithAction(0L, 32, user2, (Object) null, (Runnable) null, (Runnable) null);
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            this.accountInstance.getMessagesController().deleteParticipantFromChat(getChatId(), (TLRPC.User) null, chat, false, false);
            getUndoView().showWithAction(0L, 32, chat, (Object) null, (Runnable) null, (Runnable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSelectedOption$71(TLRPC.User user, final long j, AlertDialog alertDialog, int i) {
        this.accountInstance.getMessagesController().addUserToChat(getChatId(), user, 0, null, (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1), new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda78
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$processSelectedOption$70(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSelectedOption$70(long j) {
        inviteUserToCall(j, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSelectedOption$72() {
        this.accountInstance.getMessagesController().deleteUserPhoto(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02d1, code lost:
    
        if ((r14 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02f4, code lost:
    
        if (r2 == (-getChatId())) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04aa A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean showMenuForCell(View view) {
        GroupCallUserCell groupCallUserCell;
        VolumeSlider volumeSlider;
        boolean z;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        LinearLayout linearLayout;
        boolean z2;
        final TLRPC.GroupCallParticipant groupCallParticipant2;
        final GroupCallActivity groupCallActivity;
        GroupCallActivity groupCallActivity2;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        boolean z3;
        AvatarUpdaterDelegate avatarUpdaterDelegate;
        int x;
        float y;
        float y2;
        int measuredHeight;
        int i;
        TLRPC.ChatParticipants chatParticipants;
        if (this.itemAnimator.isRunning() || getContext() == null) {
            return false;
        }
        if (this.avatarPriviewTransitionInProgress || this.avatarsPreviewShowed) {
            dismissAvatarPreview(true);
            return false;
        }
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            this.scrimPopupWindow = null;
            return false;
        }
        clearScrimView();
        if (view instanceof GroupCallGridCell) {
            GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
            if (groupCallGridCell.getParticipant() == this.call.videoNotAvailableParticipant) {
                return false;
            }
            groupCallUserCell = new GroupCallUserCell(groupCallGridCell.getContext());
            groupCallUserCell.setData(this.accountInstance, groupCallGridCell.getParticipant().participant, this.call, MessageObject.getPeerId(this.selfPeer), null, false);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = groupCallUserCell.rightDrawable;
            if (swapAnimatedEmojiDrawable != null) {
                swapAnimatedEmojiDrawable.play();
            }
            this.hasScrimAnchorView = false;
            this.scrimGridView = groupCallGridCell;
            this.scrimRenderer = groupCallGridCell.getRenderer();
            if (!isTabletMode && !isLandscapeMode) {
                this.scrimViewAttached = true;
                this.containerView.addView(groupCallUserCell, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
            } else {
                this.scrimViewAttached = false;
            }
        } else if (view instanceof GroupCallFullscreenAdapter.GroupCallUserCell) {
            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
            if (groupCallUserCell2.getParticipant() == this.call.videoNotAvailableParticipant.participant) {
                return false;
            }
            groupCallUserCell = new GroupCallUserCell(groupCallUserCell2.getContext());
            groupCallUserCell.setData(this.accountInstance, groupCallUserCell2.getParticipant(), this.call, MessageObject.getPeerId(this.selfPeer), null, false);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = groupCallUserCell.rightDrawable;
            if (swapAnimatedEmojiDrawable2 != null) {
                swapAnimatedEmojiDrawable2.play();
            }
            this.hasScrimAnchorView = false;
            this.scrimFullscreenView = groupCallUserCell2;
            GroupCallMiniTextureView renderer = groupCallUserCell2.getRenderer();
            this.scrimRenderer = renderer;
            if (renderer != null && renderer.showingInFullscreen) {
                this.scrimRenderer = null;
            }
            this.containerView.addView(groupCallUserCell, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
            this.scrimViewAttached = true;
        } else {
            groupCallUserCell = (GroupCallUserCell) view;
            this.hasScrimAnchorView = true;
            this.scrimViewAttached = true;
        }
        GroupCallUserCell groupCallUserCell3 = groupCallUserCell;
        if (groupCallUserCell3 == null) {
            return false;
        }
        boolean z4 = (isLandscapeMode || isTabletMode || AndroidUtilities.isInMultiwindow) ? false : true;
        TLRPC.GroupCallParticipant participant = groupCallUserCell3.getParticipant();
        if (participant == null) {
            return false;
        }
        final Rect rect = new Rect();
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext());
        actionBarPopupWindowLayout2.setBackgroundDrawable(null);
        actionBarPopupWindowLayout2.setPadding(0, 0, 0, 0);
        actionBarPopupWindowLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.GroupCallActivity.60
            private int[] pos = new int[2];

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    if (GroupCallActivity.this.scrimPopupWindow != null && GroupCallActivity.this.scrimPopupWindow.isShowing()) {
                        View contentView = GroupCallActivity.this.scrimPopupWindow.getContentView();
                        contentView.getLocationInWindow(this.pos);
                        Rect rect2 = rect;
                        int[] iArr = this.pos;
                        int i2 = iArr[0];
                        rect2.set(i2, iArr[1], contentView.getMeasuredWidth() + i2, this.pos[1] + contentView.getMeasuredHeight());
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            GroupCallActivity.this.scrimPopupWindow.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && GroupCallActivity.this.scrimPopupWindow != null && GroupCallActivity.this.scrimPopupWindow.isShowing()) {
                    GroupCallActivity.this.scrimPopupWindow.dismiss();
                }
                return false;
            }
        });
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda42
            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                GroupCallActivity.this.lambda$showMenuForCell$74(keyEvent);
            }
        });
        final LinearLayout linearLayout2 = new LinearLayout(getContext());
        final LinearLayout linearLayout3 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
        this.currentOptionsLayout = linearLayout2;
        final LinearLayout linearLayout4 = new LinearLayout(getContext()) { // from class: org.telegram.ui.GroupCallActivity.61
            @Override // android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i2, int i3) {
                linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout5 = linearLayout3;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(linearLayout2.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout2.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout3.getMeasuredHeight());
                } else {
                    setMeasuredDimension(linearLayout2.getMeasuredWidth(), linearLayout2.getMeasuredHeight());
                }
            }
        };
        linearLayout4.setMinimumWidth(AndroidUtilities.dp(240.0f));
        linearLayout4.setOrientation(1);
        int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(Theme.key_voipgroup_listViewBackground), this.colorProgress, 1.0f);
        if (linearLayout3 == null || groupCallUserCell3.isSelfUser() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
            volumeSlider = null;
        } else {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
            linearLayout3.setBackgroundDrawable(mutate);
            linearLayout4.addView(linearLayout3, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            VolumeSlider volumeSlider2 = new VolumeSlider(getContext(), participant);
            linearLayout3.addView(volumeSlider2, -1, 48);
            volumeSlider = volumeSlider2;
        }
        linearLayout2.setMinimumWidth(AndroidUtilities.dp(240.0f));
        linearLayout2.setOrientation(1);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
        linearLayout2.setBackgroundDrawable(mutate2);
        linearLayout4.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, volumeSlider != null ? -8.0f : 0.0f, 0.0f, 0.0f));
        ScrollView scrollView = new ScrollView(getContext(), null, 0, R.style.scrollbarShapeStyle) { // from class: org.telegram.ui.GroupCallActivity.62
            @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                setMeasuredDimension(linearLayout4.getMeasuredWidth(), getMeasuredHeight());
            }
        };
        scrollView.setClipToPadding(false);
        actionBarPopupWindowLayout2.addView(scrollView, LayoutHelper.createFrame(-2, -2.0f));
        long peerId = MessageObject.getPeerId(participant.peer);
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        final ArrayList arrayList3 = new ArrayList(2);
        if (!(participant.peer instanceof TLRPC.TL_peerUser)) {
            z = z4;
            groupCallParticipant = participant;
            actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            linearLayout = linearLayout2;
        } else if (ChatObject.isChannel(this.currentChat)) {
            actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            linearLayout = linearLayout2;
            TLRPC.ChannelParticipant adminInChannel = this.accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, getChatId());
            if (adminInChannel != null && ((adminInChannel instanceof TLRPC.TL_channelParticipantCreator) || adminInChannel.admin_rights.manage_call)) {
                z = z4;
                groupCallParticipant = participant;
                z2 = true;
            }
            z = z4;
            groupCallParticipant = participant;
            z2 = false;
        } else {
            actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            linearLayout = linearLayout2;
            TLRPC.ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(getChatId());
            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                int size = chatParticipants.participants.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i2);
                    int i3 = size;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    z = z4;
                    groupCallParticipant = participant;
                    if (chatParticipant.user_id == participant.peer.user_id) {
                        if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        }
                        z2 = true;
                    } else {
                        i2++;
                        size = i3;
                        chatFull = chatFull2;
                        z4 = z;
                        participant = groupCallParticipant;
                    }
                }
            }
            z = z4;
            groupCallParticipant = participant;
            z2 = false;
        }
        if (groupCallUserCell3.isSelfUser()) {
            if (isConference() && groupCallUserCell3.isHandRaised()) {
                arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                arrayList2.add(Integer.valueOf(R.drawable.msg_handdown));
                arrayList3.add(7);
            }
            arrayList.add(LocaleController.getString(groupCallUserCell3.hasAvatarSet() ? R.string.VoipAddPhoto : R.string.VoipSetNewPhoto));
            arrayList2.add(Integer.valueOf(R.drawable.msg_addphoto));
            arrayList3.add(9);
            if (peerId > 0) {
                groupCallParticipant2 = groupCallParticipant;
                arrayList.add(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddBio : R.string.VoipEditBio));
            } else {
                groupCallParticipant2 = groupCallParticipant;
                arrayList.add(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription));
            }
            arrayList2.add(Integer.valueOf(TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
            arrayList3.add(10);
            arrayList.add(LocaleController.getString(peerId > 0 ? R.string.VoipEditName : R.string.VoipEditTitle));
            arrayList2.add(Integer.valueOf(R.drawable.msg_edit));
            arrayList3.add(11);
            groupCallActivity = this;
        } else {
            groupCallParticipant2 = groupCallParticipant;
            if (canManageCall()) {
                if (isConference() || !z2 || !groupCallParticipant2.muted) {
                    if (!groupCallParticipant2.muted || groupCallParticipant2.can_self_unmute) {
                        arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_muted));
                        arrayList3.add(0);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.VoipGroupAllowToSpeak));
                        if (groupCallParticipant2.raise_hand_rating != 0) {
                            arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                        } else {
                            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                        }
                        arrayList3.add(1);
                    }
                } else if (isConference() && groupCallParticipant2.muted_by_you) {
                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                    arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                    arrayList3.add(4);
                }
                TLRPC.Peer peer = groupCallParticipant2.peer;
                if (peer != null) {
                    long j = peer.channel_id;
                    if (j != 0) {
                        groupCallActivity2 = this;
                        if (!ChatObject.isMegagroup(groupCallActivity2.currentAccount, j)) {
                            arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                            arrayList2.add(Integer.valueOf(R.drawable.msg_channel));
                            arrayList3.add(8);
                            if (!isConference() ? !(z2 || !ChatObject.canBlockUsers(groupCallActivity2.currentChat)) : !((call = groupCallActivity2.call) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                arrayList2.add(Integer.valueOf(R.drawable.msg_block2));
                                arrayList3.add(2);
                            }
                        }
                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                        arrayList2.add(Integer.valueOf(R.drawable.msg_openprofile));
                        arrayList3.add(6);
                        groupCallActivity = !isConference() ? groupCallActivity2 : groupCallActivity2;
                    }
                }
                groupCallActivity2 = this;
                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                arrayList2.add(Integer.valueOf(R.drawable.msg_openprofile));
                arrayList3.add(6);
                if (!isConference()) {
                }
            } else {
                groupCallActivity = this;
                if (groupCallParticipant2.muted_by_you) {
                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                    arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                    arrayList3.add(4);
                } else {
                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                    arrayList2.add(Integer.valueOf(R.drawable.msg_voice_muted));
                    arrayList3.add(5);
                }
                TLRPC.Peer peer2 = groupCallParticipant2.peer;
                if (peer2 != null) {
                    long j2 = peer2.channel_id;
                    if (j2 != 0 && !ChatObject.isMegagroup(groupCallActivity.currentAccount, j2)) {
                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                        arrayList2.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                        arrayList3.add(8);
                    }
                }
                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                arrayList2.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                arrayList3.add(6);
            }
        }
        int size2 = arrayList.size();
        final int i4 = 0;
        while (i4 < size2) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), i4 == 0, i4 == size2 + (-1));
            if (((Integer) arrayList3.get(i4)).intValue() != 2) {
                int i5 = Theme.key_voipgroup_actionBarItems;
                actionBarMenuSubItem.setColors(Theme.getColor(i5), Theme.getColor(i5));
            } else {
                int i6 = Theme.key_voipgroup_leaveCallMenu;
                actionBarMenuSubItem.setColors(Theme.getColor(i6), Theme.getColor(i6));
            }
            actionBarMenuSubItem.setSelectorColor(Theme.getColor(Theme.key_voipgroup_listSelector));
            actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList.get(i4), ((Integer) arrayList2.get(i4)).intValue());
            linearLayout.addView(actionBarMenuSubItem);
            actionBarMenuSubItem.setTag(arrayList3.get(i4));
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda43
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GroupCallActivity.this.lambda$showMenuForCell$75(i4, arrayList3, groupCallParticipant2, view2);
                }
            });
            i4++;
        }
        scrollView.addView(linearLayout4, LayoutHelper.createScroll(-2, -2, 51));
        groupCallActivity.listView.stopScroll();
        groupCallActivity.layoutManager.setCanScrollVertically(false);
        groupCallActivity.scrimView = groupCallUserCell3;
        groupCallUserCell3.setAboutVisible(true);
        groupCallActivity.containerView.invalidate();
        groupCallActivity.listView.invalidate();
        AnimatorSet animatorSet = groupCallActivity.scrimAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        groupCallActivity.scrimPopupLayout = actionBarPopupWindowLayout;
        if (peerId > 0) {
            TLRPC.User user = groupCallActivity.accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            forUserOrChat = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), user, 0);
            forUserOrChat2 = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), user, 1);
            if (MessagesController.getInstance(groupCallActivity.currentAccount).getUserFull(peerId) == null) {
                MessagesController.getInstance(groupCallActivity.currentAccount).loadUserInfo(user, false, 0);
            }
        } else {
            TLRPC.Chat chat = groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            forUserOrChat = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), chat, 0);
            forUserOrChat2 = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), chat, 1);
        }
        GroupCallMiniTextureView groupCallMiniTextureView = groupCallActivity.scrimRenderer;
        boolean z5 = groupCallMiniTextureView != null && groupCallMiniTextureView.isAttached();
        if (forUserOrChat != null || z5) {
            if (z) {
                groupCallActivity.avatarsViewPager.setParentAvatarImage(groupCallActivity.scrimView.getAvatarImageView());
                groupCallActivity.avatarsViewPager.setHasActiveVideo(z5);
                groupCallActivity.avatarsViewPager.setData(peerId, true);
                groupCallActivity.avatarsViewPager.setCreateThumbFromParent(true);
                groupCallActivity.avatarsViewPager.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
                GroupCallMiniTextureView groupCallMiniTextureView2 = groupCallActivity.scrimRenderer;
                if (groupCallMiniTextureView2 != null) {
                    groupCallMiniTextureView2.setShowingAsScrimView(true, true);
                }
                if (MessageObject.getPeerId(groupCallActivity.selfPeer) == peerId && groupCallActivity.currentAvatarUpdater != null && (avatarUpdaterDelegate = groupCallActivity.avatarUpdaterDelegate) != null && avatarUpdaterDelegate.avatar != null) {
                    groupCallActivity.avatarsViewPager.addUploadingImage(groupCallActivity.avatarUpdaterDelegate.uploadingImageLocation, ImageLocation.getForLocal(groupCallActivity.avatarUpdaterDelegate.avatar));
                }
            }
            z3 = z;
        } else {
            z3 = false;
        }
        if (z3) {
            groupCallActivity.avatarsPreviewShowed = true;
            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            groupCallActivity.containerView.addView(groupCallActivity.scrimPopupLayout, LayoutHelper.createFrame(-2, -2.0f));
            groupCallActivity.useBlur = true;
            prepareBlurBitmap();
            groupCallActivity.avatarPriviewTransitionInProgress = true;
            groupCallActivity.avatarPreviewContainer.setVisibility(0);
            if (volumeSlider != null) {
                volumeSlider.invalidate();
            }
            groupCallActivity.runAvatarPreviewTransition(true, groupCallUserCell3);
            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell4 = groupCallActivity.scrimFullscreenView;
            if (groupCallUserCell4 == null) {
                return true;
            }
            groupCallUserCell4.getAvatarImageView().setAlpha(0.0f);
            return true;
        }
        groupCallActivity.avatarsPreviewShowed = false;
        int i7 = -2;
        ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(actionBarPopupWindowLayout, i7, i7) { // from class: org.telegram.ui.GroupCallActivity.63
            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow, android.widget.PopupWindow
            public void dismiss() {
                super.dismiss();
                if (GroupCallActivity.this.scrimPopupWindow != this) {
                    return;
                }
                GroupCallActivity.this.scrimPopupWindow = null;
                if (GroupCallActivity.this.scrimAnimatorSet != null) {
                    GroupCallActivity.this.scrimAnimatorSet.cancel();
                    GroupCallActivity.this.scrimAnimatorSet = null;
                }
                GroupCallActivity.this.layoutManager.setCanScrollVertically(true);
                GroupCallActivity.this.scrimAnimatorSet = new AnimatorSet();
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(ObjectAnimator.ofInt(GroupCallActivity.this.scrimPaint, (Property<Paint, Integer>) AnimationProperties.PAINT_ALPHA, 0));
                GroupCallActivity.this.scrimAnimatorSet.playTogether(arrayList4);
                GroupCallActivity.this.scrimAnimatorSet.setDuration(220L);
                GroupCallActivity.this.scrimAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.63.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        GroupCallActivity.this.clearScrimView();
                        ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                        GroupCallActivity.this.listView.invalidate();
                        if (GroupCallActivity.this.delayedGroupCallUpdated) {
                            GroupCallActivity.this.delayedGroupCallUpdated = false;
                            GroupCallActivity.this.applyCallParticipantUpdates(true);
                        }
                    }
                });
                GroupCallActivity.this.scrimAnimatorSet.start();
            }
        };
        groupCallActivity.scrimPopupWindow = actionBarPopupWindow2;
        actionBarPopupWindow2.setPauseNotifications(true);
        groupCallActivity.scrimPopupWindow.setDismissAnimationDuration(NotificationCenter.starGiveawayOptionsLoaded);
        groupCallActivity.scrimPopupWindow.setOutsideTouchable(true);
        groupCallActivity.scrimPopupWindow.setClippingEnabled(true);
        groupCallActivity.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        groupCallActivity.scrimPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        groupCallActivity.scrimPopupWindow.setInputMethodMode(2);
        groupCallActivity.scrimPopupWindow.setSoftInputMode(0);
        groupCallActivity.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell5 = groupCallActivity.scrimFullscreenView;
        if (groupCallUserCell5 != null) {
            if (isLandscapeMode) {
                x = (((int) ((groupCallUserCell5.getX() + groupCallActivity.fullscreenUsersListView.getX()) + groupCallActivity.renderersContainer.getX())) - actionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(32.0f);
                i = ((int) ((groupCallActivity.scrimFullscreenView.getY() + groupCallActivity.fullscreenUsersListView.getY()) + groupCallActivity.renderersContainer.getY())) - AndroidUtilities.dp(6.0f);
                groupCallActivity.scrimPopupWindow.showAtLocation(groupCallActivity.listView, 51, x, i);
                groupCallActivity.scrimAnimatorSet = new AnimatorSet();
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(ObjectAnimator.ofInt(groupCallActivity.scrimPaint, (Property<Paint, Integer>) AnimationProperties.PAINT_ALPHA, 0, 100));
                groupCallActivity.scrimAnimatorSet.playTogether(arrayList4);
                groupCallActivity.scrimAnimatorSet.setDuration(150L);
                groupCallActivity.scrimAnimatorSet.start();
                return true;
            }
            x = ((int) ((groupCallUserCell5.getX() + groupCallActivity.fullscreenUsersListView.getX()) + groupCallActivity.renderersContainer.getX())) - AndroidUtilities.dp(14.0f);
            y = ((groupCallActivity.scrimFullscreenView.getY() + groupCallActivity.fullscreenUsersListView.getY()) + groupCallActivity.renderersContainer.getY()) - actionBarPopupWindowLayout.getMeasuredHeight();
        } else {
            x = (int) (((groupCallActivity.listView.getX() + groupCallActivity.listView.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindowLayout.getMeasuredWidth());
            if (groupCallActivity.hasScrimAnchorView) {
                y2 = groupCallActivity.listView.getY() + groupCallUserCell3.getY();
                measuredHeight = groupCallUserCell3.getClipHeight();
            } else if (groupCallActivity.scrimGridView != null) {
                y2 = groupCallActivity.listView.getY() + groupCallActivity.scrimGridView.getY();
                measuredHeight = groupCallActivity.scrimGridView.getMeasuredHeight();
            } else {
                y = groupCallActivity.listView.getY();
            }
            y = y2 + measuredHeight;
        }
        i = (int) y;
        groupCallActivity.scrimPopupWindow.showAtLocation(groupCallActivity.listView, 51, x, i);
        groupCallActivity.scrimAnimatorSet = new AnimatorSet();
        ArrayList arrayList42 = new ArrayList();
        arrayList42.add(ObjectAnimator.ofInt(groupCallActivity.scrimPaint, (Property<Paint, Integer>) AnimationProperties.PAINT_ALPHA, 0, 100));
        groupCallActivity.scrimAnimatorSet.playTogether(arrayList42);
        groupCallActivity.scrimAnimatorSet.setDuration(150L);
        groupCallActivity.scrimAnimatorSet.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForCell$74(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.scrimPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.scrimPopupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForCell$75(int i, ArrayList arrayList, TLRPC.GroupCallParticipant groupCallParticipant, View view) {
        if (i >= arrayList.size()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(groupCallParticipant.peer));
        if (groupCallParticipant2 != null) {
            groupCallParticipant = groupCallParticipant2;
        }
        processSelectedOption(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i)).intValue());
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        } else {
            if (((Integer) arrayList.get(i)).intValue() == 9 || ((Integer) arrayList.get(i)).intValue() == 10 || ((Integer) arrayList.get(i)).intValue() == 11) {
                return;
            }
            dismissAvatarPreview(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScrimView() {
        GroupCallMiniTextureView groupCallMiniTextureView = this.scrimRenderer;
        if (groupCallMiniTextureView != null) {
            groupCallMiniTextureView.textureView.setRoundCorners(AndroidUtilities.dp(8.0f));
            this.scrimRenderer.setShowingAsScrimView(false, false);
            this.scrimRenderer.invalidate();
            this.renderersContainer.invalidate();
        }
        GroupCallUserCell groupCallUserCell = this.scrimView;
        if (groupCallUserCell != null && !this.hasScrimAnchorView && groupCallUserCell.getParent() != null) {
            this.containerView.removeView(this.scrimView);
        }
        GroupCallUserCell groupCallUserCell2 = this.scrimView;
        if (groupCallUserCell2 != null) {
            groupCallUserCell2.setProgressToAvatarPreview(0.0f);
            this.scrimView.setAboutVisible(false);
            this.scrimView.getAvatarImageView().setAlpha(1.0f);
        }
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell3 = this.scrimFullscreenView;
        if (groupCallUserCell3 != null) {
            groupCallUserCell3.getAvatarImageView().setAlpha(1.0f);
        }
        this.scrimView = null;
        this.scrimGridView = null;
        this.scrimFullscreenView = null;
        this.scrimRenderer = null;
    }

    private void startScreenCapture() {
        LaunchActivity launchActivity = this.parentActivity;
        if (launchActivity == null) {
            return;
        }
        this.parentActivity.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void runAvatarPreviewTransition(final boolean z, GroupCallUserCell groupCallUserCell) {
        boolean z2;
        float f;
        float f2;
        float f3;
        float y;
        float y2;
        int measuredHeight;
        GroupCallMiniTextureView groupCallMiniTextureView;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        float dp = AndroidUtilities.dp(14.0f) + this.containerView.getPaddingLeft();
        float dp2 = AndroidUtilities.dp(14.0f) + this.containerView.getPaddingTop();
        if (this.hasScrimAnchorView) {
            f3 = ((groupCallUserCell.getAvatarImageView().getX() + groupCallUserCell.getX()) + this.listView.getX()) - dp;
            f2 = ((groupCallUserCell.getAvatarImageView().getY() + groupCallUserCell.getY()) + this.listView.getY()) - dp2;
            f = groupCallUserCell.getAvatarImageView().getMeasuredHeight() / this.listView.getMeasuredWidth();
            measuredHeight = (int) ((groupCallUserCell.getAvatarImageView().getMeasuredHeight() >> 1) / f);
        } else {
            if (this.scrimRenderer == null) {
                this.previewTextureTransitionEnabled = true;
            } else {
                if (!z) {
                    ProfileGalleryView profileGalleryView = this.avatarsViewPager;
                    if (profileGalleryView.getRealPosition(profileGalleryView.getCurrentItem()) != 0) {
                        z2 = false;
                        this.previewTextureTransitionEnabled = z2;
                    }
                }
                z2 = true;
                this.previewTextureTransitionEnabled = z2;
            }
            GroupCallGridCell groupCallGridCell = this.scrimGridView;
            if (groupCallGridCell != null && this.previewTextureTransitionEnabled) {
                f3 = (groupCallGridCell.getX() + this.listView.getX()) - dp;
                y = this.scrimGridView.getY() + this.listView.getY();
                y2 = AndroidUtilities.dp(2.0f);
            } else {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = this.scrimFullscreenView;
                if (groupCallUserCell2 != null) {
                    if (this.scrimRenderer == null) {
                        f3 = (((groupCallUserCell2.getAvatarImageView().getX() + this.scrimFullscreenView.getX()) + this.fullscreenUsersListView.getX()) + this.renderersContainer.getX()) - dp;
                        f2 = (((this.scrimFullscreenView.getAvatarImageView().getY() + this.scrimFullscreenView.getY()) + this.fullscreenUsersListView.getY()) + this.renderersContainer.getY()) - dp2;
                        f = this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / this.listView.getMeasuredWidth();
                        measuredHeight = (int) ((this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() >> 1) / f);
                        if (!this.previewTextureTransitionEnabled && (groupCallMiniTextureView = this.scrimRenderer) != null) {
                            groupCallMiniTextureView.invalidate();
                            this.renderersContainer.invalidate();
                            this.scrimRenderer.setShowingAsScrimView(false, false);
                            this.scrimRenderer = null;
                        }
                    } else if (this.previewTextureTransitionEnabled) {
                        f3 = ((groupCallUserCell2.getX() + this.fullscreenUsersListView.getX()) + this.renderersContainer.getX()) - dp;
                        y = this.scrimFullscreenView.getY() + this.fullscreenUsersListView.getY();
                        y2 = this.renderersContainer.getY();
                    }
                }
                f = 0.96f;
                f2 = 0.0f;
                f3 = 0.0f;
                measuredHeight = 0;
                if (!this.previewTextureTransitionEnabled) {
                    groupCallMiniTextureView.invalidate();
                    this.renderersContainer.invalidate();
                    this.scrimRenderer.setShowingAsScrimView(false, false);
                    this.scrimRenderer = null;
                }
            }
            f2 = (y + y2) - dp2;
            f = 1.0f;
            measuredHeight = 0;
            if (!this.previewTextureTransitionEnabled) {
            }
        }
        final float f4 = f2;
        final int i = measuredHeight;
        final float f5 = f3;
        final float f6 = f;
        if (z) {
            this.avatarPreviewContainer.setScaleX(f6);
            this.avatarPreviewContainer.setScaleY(f6);
            this.avatarPreviewContainer.setTranslationX(f5);
            this.avatarPreviewContainer.setTranslationY(f4);
            this.avatarPagerIndicator.setAlpha(0.0f);
        }
        this.avatarsViewPager.setRoundRadius(i, i);
        if (this.useBlur) {
            if (z) {
                this.blurredView.setAlpha(0.0f);
            }
            this.blurredView.animate().alpha(z ? 1.0f : 0.0f).setDuration(220L).start();
        }
        this.avatarPagerIndicator.animate().alpha(z ? 1.0f : 0.0f).setDuration(220L).start();
        if (!z && (groupCallMiniTextureView2 = this.scrimRenderer) != null) {
            groupCallMiniTextureView2.setShowingAsScrimView(false, true);
            ProfileGalleryView profileGalleryView2 = this.avatarsViewPager;
            if (profileGalleryView2.getRealPosition(profileGalleryView2.getCurrentItem()) != 0) {
                this.scrimRenderer.textureView.cancelAnimation();
                this.scrimGridView = null;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GroupCallActivity.this.lambda$runAvatarPreviewTransition$76(f6, f5, f4, i, valueAnimator);
            }
        });
        this.popupAnimationIndex = this.accountInstance.getNotificationCenter().setAnimationInProgress(this.popupAnimationIndex, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        final GroupCallMiniTextureView groupCallMiniTextureView3 = this.scrimGridView != null ? this.scrimRenderer : null;
        if (groupCallMiniTextureView3 != null) {
            groupCallMiniTextureView3.animateToScrimView = true;
        }
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.64
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                GroupCallMiniTextureView groupCallMiniTextureView4 = groupCallMiniTextureView3;
                if (groupCallMiniTextureView4 != null) {
                    groupCallMiniTextureView4.animateToScrimView = false;
                }
                GroupCallActivity.this.accountInstance.getNotificationCenter().onAnimationFinish(GroupCallActivity.this.popupAnimationIndex);
                GroupCallActivity.this.avatarPriviewTransitionInProgress = false;
                GroupCallActivity.this.progressToAvatarPreview = z ? 1.0f : 0.0f;
                GroupCallActivity.this.renderersContainer.progressToScrimView = GroupCallActivity.this.progressToAvatarPreview;
                if (!z) {
                    GroupCallActivity.this.scrimPaint.setAlpha(0);
                    GroupCallActivity.this.clearScrimView();
                    if (GroupCallActivity.this.scrimPopupLayout.getParent() != null) {
                        ((BottomSheet) GroupCallActivity.this).containerView.removeView(GroupCallActivity.this.scrimPopupLayout);
                    }
                    GroupCallActivity.this.scrimPopupLayout = null;
                    GroupCallActivity.this.avatarPreviewContainer.setVisibility(8);
                    GroupCallActivity.this.avatarsPreviewShowed = false;
                    GroupCallActivity.this.layoutManager.setCanScrollVertically(true);
                    GroupCallActivity.this.blurredView.setVisibility(8);
                    if (GroupCallActivity.this.delayedGroupCallUpdated) {
                        GroupCallActivity.this.delayedGroupCallUpdated = false;
                        GroupCallActivity.this.applyCallParticipantUpdates(true);
                    }
                    if (GroupCallActivity.this.scrimRenderer != null) {
                        GroupCallActivity.this.scrimRenderer.textureView.setRoundCorners(0.0f);
                    }
                } else {
                    GroupCallActivity.this.avatarPreviewContainer.setAlpha(1.0f);
                    GroupCallActivity.this.avatarPreviewContainer.setScaleX(1.0f);
                    GroupCallActivity.this.avatarPreviewContainer.setScaleY(1.0f);
                    GroupCallActivity.this.avatarPreviewContainer.setTranslationX(0.0f);
                    GroupCallActivity.this.avatarPreviewContainer.setTranslationY(0.0f);
                }
                GroupCallActivity.this.checkContentOverlayed();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.avatarsViewPager.invalidate();
                GroupCallActivity.this.listView.invalidate();
            }
        });
        if (!this.hasScrimAnchorView && this.scrimRenderer != null) {
            ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ofFloat.setDuration(220L);
            this.scrimRenderer.textureView.setAnimateNextDuration(220L);
            this.scrimRenderer.textureView.synchOrRunAnimation(ofFloat);
        } else {
            ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ofFloat.setDuration(220L);
            ofFloat.start();
        }
        checkContentOverlayed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runAvatarPreviewTransition$76(float f, float f2, float f3, int i, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.progressToAvatarPreview = floatValue;
        this.renderersContainer.progressToScrimView = floatValue;
        float f4 = (f * (1.0f - floatValue)) + (floatValue * 1.0f);
        this.avatarPreviewContainer.setScaleX(f4);
        this.avatarPreviewContainer.setScaleY(f4);
        this.avatarPreviewContainer.setTranslationX(f2 * (1.0f - this.progressToAvatarPreview));
        this.avatarPreviewContainer.setTranslationY(f3 * (1.0f - this.progressToAvatarPreview));
        if (!this.useBlur) {
            this.scrimPaint.setAlpha((int) (this.progressToAvatarPreview * 100.0f));
        }
        GroupCallMiniTextureView groupCallMiniTextureView = this.scrimRenderer;
        if (groupCallMiniTextureView != null) {
            groupCallMiniTextureView.textureView.setRoundCorners(AndroidUtilities.dp(8.0f) * (1.0f - this.progressToAvatarPreview));
        }
        this.avatarPreviewContainer.invalidate();
        this.containerView.invalidate();
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        int i2 = (int) (i * (1.0f - this.progressToAvatarPreview));
        profileGalleryView.setRoundRadius(i2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAvatarPreview(boolean z) {
        if (this.avatarPriviewTransitionInProgress || !this.avatarsPreviewShowed) {
            return;
        }
        if (z) {
            this.avatarPriviewTransitionInProgress = true;
            runAvatarPreviewTransition(false, this.scrimView);
            return;
        }
        clearScrimView();
        this.containerView.removeView(this.scrimPopupLayout);
        this.scrimPopupLayout = null;
        this.avatarPreviewContainer.setVisibility(8);
        this.containerView.invalidate();
        this.avatarsPreviewShowed = false;
        this.layoutManager.setCanScrollVertically(true);
        this.listView.invalidate();
        this.blurredView.setVisibility(8);
        if (this.delayedGroupCallUpdated) {
            this.delayedGroupCallUpdated = false;
            applyCallParticipantUpdates(true);
        }
        checkContentOverlayed();
    }

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
        private int addMemberRow;
        private int conferenceAddPeopleRow;
        private int conferenceShareLinkRow;
        private int encryptionRow;
        private boolean hasSelfUser;
        private int invitedEndRow;
        private int invitedStartRow;
        private int lastRow;
        private Context mContext;
        private int rowsCount;
        private int shadyJoinEndRow;
        private int shadyJoinStartRow;
        private int shadyLeftEndRow;
        private int shadyLeftStartRow;
        private int usersEndRow;
        private int usersStartRow;
        private int usersVideoGridEndRow;
        private int usersVideoGridStartRow;
        private int videoGridDividerRow;
        private int videoNotAvailableRow;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public boolean addSelfToCounter() {
            if (GroupCallActivity.this.isRtmpStream() || this.hasSelfUser || VoIPService.getSharedInstance() == null) {
                return false;
            }
            return !VoIPService.getSharedInstance().isJoined();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.rowsCount;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateRows() {
            TLRPC.Chat chat;
            TLRPC.Chat chat2;
            ChatObject.Call call = GroupCallActivity.this.call;
            if (call == null || call.isScheduled() || GroupCallActivity.this.delayedGroupCallUpdated) {
                return;
            }
            this.addMemberRow = -1;
            this.conferenceAddPeopleRow = -1;
            this.conferenceShareLinkRow = -1;
            this.videoGridDividerRow = -1;
            this.videoNotAvailableRow = -1;
            this.encryptionRow = -1;
            this.rowsCount = 0;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            this.hasSelfUser = groupCallActivity.call.participants.indexOfKey(MessageObject.getPeerId(groupCallActivity.selfPeer)) >= 0;
            if (GroupCallActivity.this.isConference()) {
                int i = this.rowsCount;
                this.rowsCount = i + 1;
                this.encryptionRow = i;
            }
            int i2 = this.rowsCount;
            this.usersVideoGridStartRow = i2;
            int size = i2 + GroupCallActivity.this.visibleVideoParticipants.size();
            this.rowsCount = size;
            this.usersVideoGridEndRow = size;
            if (GroupCallActivity.this.visibleVideoParticipants.size() > 0) {
                int i3 = this.rowsCount;
                this.rowsCount = i3 + 1;
                this.videoGridDividerRow = i3;
            }
            if (!GroupCallActivity.this.visibleVideoParticipants.isEmpty() && GroupCallActivity.this.canManageCall()) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.call.call.participants_count > groupCallActivity2.accountInstance.getMessagesController().groupCallVideoMaxParticipants) {
                    int i4 = this.rowsCount;
                    this.rowsCount = i4 + 1;
                    this.videoNotAvailableRow = i4;
                }
            }
            this.usersStartRow = this.rowsCount;
            if (!GroupCallActivity.this.isRtmpStream()) {
                this.rowsCount += GroupCallActivity.this.call.visibleParticipants.size();
            }
            this.usersEndRow = this.rowsCount;
            if (GroupCallActivity.this.call.invitedUsers.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.invitedStartRow = -1;
                this.invitedEndRow = -1;
            } else {
                int i5 = this.rowsCount;
                this.invitedStartRow = i5;
                int size2 = i5 + GroupCallActivity.this.call.invitedUsers.size();
                this.rowsCount = size2;
                this.invitedEndRow = size2;
            }
            if (GroupCallActivity.this.call.shadyJoinParticipants.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.shadyJoinStartRow = -1;
                this.shadyJoinEndRow = -1;
            } else {
                int i6 = this.rowsCount;
                this.shadyJoinStartRow = i6;
                int size3 = i6 + GroupCallActivity.this.call.shadyJoinParticipants.size();
                this.rowsCount = size3;
                this.shadyJoinEndRow = size3;
            }
            if (GroupCallActivity.this.call.shadyLeftParticipants.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.shadyLeftStartRow = -1;
                this.shadyLeftEndRow = -1;
            } else {
                int i7 = this.rowsCount;
                this.shadyLeftStartRow = i7;
                int size4 = i7 + GroupCallActivity.this.call.shadyLeftParticipants.size();
                this.rowsCount = size4;
                this.shadyLeftEndRow = size4;
            }
            if (GroupCallActivity.this.isConference()) {
                int i8 = this.rowsCount;
                this.conferenceAddPeopleRow = i8;
                this.rowsCount = i8 + 2;
                this.conferenceShareLinkRow = i8 + 1;
            } else if (!GroupCallActivity.this.isRtmpStream() && (((!ChatObject.isChannel(GroupCallActivity.this.currentChat) || ((chat2 = GroupCallActivity.this.currentChat) != null && chat2.megagroup)) && ChatObject.canWriteToChat(GroupCallActivity.this.currentChat)) || (ChatObject.isChannel(GroupCallActivity.this.currentChat) && (chat = GroupCallActivity.this.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i9 = this.rowsCount;
                this.rowsCount = i9 + 1;
                this.addMemberRow = i9;
            }
            int i10 = this.rowsCount;
            this.rowsCount = i10 + 1;
            this.lastRow = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            updateRows();
            super.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemChanged(int i) {
            updateRows();
            super.notifyItemChanged(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows();
            super.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            updateRows();
            super.notifyItemRangeChanged(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemMoved(int i, int i2) {
            updateRows();
            super.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeInserted(int i, int i2) {
            updateRows();
            super.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
                int i = GroupCallActivity.this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                groupCallUserCell.setGrayIconColor(i, Theme.getColor(i));
                groupCallUserCell.setDrawDivider(viewHolder.getAdapterPosition() != getItemCount() - 2);
                return;
            }
            if (itemViewType == 2) {
                GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) viewHolder.itemView;
                int i2 = GroupCallActivity.this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                groupCallInvitedCell.setGrayIconColor(i2, Theme.getColor(i2));
                groupCallInvitedCell.setDrawDivider(viewHolder.getAdapterPosition() != getItemCount() - 2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            TLRPC.GroupCallParticipant groupCallParticipant;
            TLRPC.GroupCallParticipant groupCallParticipant2;
            AvatarUpdaterDelegate avatarUpdaterDelegate;
            ChatObject.Call.InvitedUser invitedUser;
            Long l;
            boolean z;
            boolean z2;
            boolean z3;
            ChatObject.VideoParticipant videoParticipant;
            AvatarUpdaterDelegate avatarUpdaterDelegate2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                GroupCallTextCell groupCallTextCell = (GroupCallTextCell) viewHolder.itemView;
                if (i == this.conferenceAddPeopleRow) {
                    int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, ((BottomSheet) GroupCallActivity.this).resourcesProvider);
                    groupCallTextCell.setColors(color, color);
                    groupCallTextCell.setTextAndIcon(LocaleController.getString(R.string.VoipConferenceAddPeople), R.drawable.msg_contact_add, true);
                    return;
                } else {
                    if (i == this.conferenceShareLinkRow) {
                        int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, ((BottomSheet) GroupCallActivity.this).resourcesProvider);
                        groupCallTextCell.setColors(color2, color2);
                        groupCallTextCell.setTextAndIcon(LocaleController.getString(R.string.VoipConferenceShareLink), R.drawable.msg_link2, false);
                        return;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_lastSeenTextUnscrolled), Theme.getColor(Theme.key_voipgroup_lastSeenText), GroupCallActivity.this.actionBar.getTag() != null ? 1.0f : 0.0f, 1.0f);
                    groupCallTextCell.setColors(offsetColor, offsetColor);
                    if (ChatObject.isChannel(GroupCallActivity.this.currentChat) && (chat = GroupCallActivity.this.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                        groupCallTextCell.setTextAndIcon(LocaleController.getString(R.string.VoipGroupShareLink), R.drawable.msg_link, false);
                        return;
                    } else {
                        groupCallTextCell.setTextAndIcon(LocaleController.getString(R.string.VoipGroupInviteMember), R.drawable.msg_contact_add, false);
                        return;
                    }
                }
            }
            TLRPC.FileLocation fileLocation = null;
            r7 = null;
            TLRPC.FileLocation fileLocation2 = null;
            r7 = null;
            r7 = null;
            r7 = null;
            Long l2 = null;
            fileLocation = null;
            if (itemViewType == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
                int i2 = i - this.usersStartRow;
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i2 >= 0 && i2 < GroupCallActivity.this.oldParticipants.size()) {
                        groupCallParticipant = (TLRPC.GroupCallParticipant) GroupCallActivity.this.oldParticipants.get(i2);
                        groupCallParticipant2 = groupCallParticipant;
                    }
                    groupCallParticipant2 = null;
                } else {
                    if (i2 >= 0 && i2 < GroupCallActivity.this.call.visibleParticipants.size()) {
                        groupCallParticipant = GroupCallActivity.this.call.visibleParticipants.get(i2);
                        groupCallParticipant2 = groupCallParticipant;
                    }
                    groupCallParticipant2 = null;
                }
                if (groupCallParticipant2 != null) {
                    long peerId = MessageObject.getPeerId(groupCallParticipant2.peer);
                    long peerId2 = MessageObject.getPeerId(GroupCallActivity.this.selfPeer);
                    if (peerId == peerId2 && (avatarUpdaterDelegate = GroupCallActivity.this.avatarUpdaterDelegate) != null) {
                        fileLocation = avatarUpdaterDelegate.avatar;
                    }
                    TLRPC.FileLocation fileLocation3 = fileLocation;
                    float f = fileLocation3 != null ? GroupCallActivity.this.avatarUpdaterDelegate.uploadingProgress : 1.0f;
                    boolean z4 = groupCallUserCell.getParticipant() != null && MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == peerId;
                    groupCallUserCell.setData(GroupCallActivity.this.accountInstance, groupCallParticipant2, GroupCallActivity.this.call, peerId2, fileLocation3, z4);
                    groupCallUserCell.setUploadProgress(f, z4);
                    return;
                }
                return;
            }
            if (itemViewType != 2) {
                if (itemViewType != 4) {
                    return;
                }
                GroupCallGridCell groupCallGridCell = (GroupCallGridCell) viewHolder.itemView;
                ChatObject.VideoParticipant participant = groupCallGridCell.getParticipant();
                int i3 = i - this.usersVideoGridStartRow;
                groupCallGridCell.spanCount = GroupCallActivity.this.spanSizeLookup.getSpanSize(i);
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i3 >= 0 && i3 < GroupCallActivity.this.oldVideoParticipants.size()) {
                        videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i3);
                    }
                    videoParticipant = null;
                } else {
                    if (i3 >= 0 && i3 < GroupCallActivity.this.visibleVideoParticipants.size()) {
                        videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.visibleVideoParticipants.get(i3);
                    }
                    videoParticipant = null;
                }
                if (videoParticipant != null) {
                    long peerId3 = MessageObject.getPeerId(videoParticipant.participant.peer);
                    long peerId4 = MessageObject.getPeerId(GroupCallActivity.this.selfPeer);
                    if (peerId3 == peerId4 && (avatarUpdaterDelegate2 = GroupCallActivity.this.avatarUpdaterDelegate) != null) {
                        fileLocation2 = avatarUpdaterDelegate2.avatar;
                    }
                    if (fileLocation2 != null) {
                        float f2 = GroupCallActivity.this.avatarUpdaterDelegate.uploadingProgress;
                    }
                    if (groupCallGridCell.getParticipant() != null) {
                        groupCallGridCell.getParticipant().equals(videoParticipant);
                    }
                    groupCallGridCell.setData(GroupCallActivity.this.accountInstance, videoParticipant, GroupCallActivity.this.call, peerId4);
                }
                if (participant == null || participant.equals(videoParticipant) || !groupCallGridCell.attached || groupCallGridCell.getRenderer() == null) {
                    return;
                }
                GroupCallActivity.this.attachRenderer(groupCallGridCell, false);
                GroupCallActivity.this.attachRenderer(groupCallGridCell, true);
                return;
            }
            GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) viewHolder.itemView;
            int i4 = i - this.invitedStartRow;
            int i5 = i - this.shadyJoinStartRow;
            if (i5 >= 0 && i5 < GroupCallActivity.this.call.shadyJoinParticipants.size()) {
                l = GroupCallActivity.this.call.shadyJoinParticipants.get(i - this.shadyJoinStartRow);
                z = false;
                z2 = true;
            } else {
                int i6 = i - this.shadyLeftStartRow;
                if (i6 < 0 || i6 >= GroupCallActivity.this.call.shadyLeftParticipants.size()) {
                    if (GroupCallActivity.this.delayedGroupCallUpdated) {
                        if (i4 >= 0 && i4 < GroupCallActivity.this.oldInvited.size()) {
                            l2 = (Long) GroupCallActivity.this.oldInvited.get(i4);
                        }
                    } else if (i4 >= 0 && i4 < GroupCallActivity.this.call.invitedUsers.size() && (invitedUser = GroupCallActivity.this.call.invitedUsersMessageIds.get((l2 = GroupCallActivity.this.call.invitedUsers.get(i4)))) != null && invitedUser.isCalling()) {
                        l = l2;
                        z = true;
                        z2 = false;
                    }
                    l = l2;
                    z = false;
                    z2 = false;
                } else {
                    l = GroupCallActivity.this.call.shadyLeftParticipants.get(i - this.shadyLeftStartRow);
                    z = false;
                    z2 = false;
                    z3 = true;
                    if (l == null) {
                        groupCallInvitedCell.setData(((BottomSheet) GroupCallActivity.this).currentAccount, l, z, z2, z3);
                        return;
                    }
                    return;
                }
            }
            z3 = false;
            if (l == null) {
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 3 || itemViewType == 4 || itemViewType == 5 || itemViewType == 6) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            GroupCallGridCell groupCallGridCell;
            boolean z = false;
            if (i == 0) {
                view = new GroupCallTextCell(this.mContext) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.1
                    @Override // org.telegram.ui.Cells.GroupCallTextCell, android.widget.FrameLayout, android.view.View
                    protected void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), TLObject.FLAG_30), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i == 1) {
                view = new GroupCallUserCell(this.mContext) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.2
                    @Override // org.telegram.ui.Cells.GroupCallUserCell
                    /* renamed from: onMuteClick */
                    protected void lambda$new$5(GroupCallUserCell groupCallUserCell) {
                        GroupCallActivity.this.showMenuForCell(groupCallUserCell);
                    }

                    @Override // org.telegram.ui.Cells.GroupCallUserCell, android.widget.FrameLayout, android.view.View
                    protected void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), TLObject.FLAG_30), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i != 2) {
                if (i == 4) {
                    groupCallGridCell = new GroupCallGridCell(this.mContext, z) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.4
                        @Override // org.telegram.ui.Components.voip.GroupCallGridCell, android.view.ViewGroup, android.view.View
                        protected void onAttachedToWindow() {
                            super.onAttachedToWindow();
                            if (GroupCallActivity.this.listView.getVisibility() == 0 && GroupCallActivity.this.listViewVideoVisibility) {
                                GroupCallActivity.this.attachRenderer(this, true);
                            }
                        }

                        @Override // org.telegram.ui.Components.voip.GroupCallGridCell, android.view.ViewGroup, android.view.View
                        protected void onDetachedFromWindow() {
                            super.onDetachedFromWindow();
                            GroupCallActivity.this.attachRenderer(this, false);
                        }
                    };
                } else if (i == 5) {
                    view = new View(this.mContext) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.5
                        @Override // android.view.View
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(GroupCallActivity.isLandscapeMode ? 0.0f : 8.0f), TLObject.FLAG_30));
                        }
                    };
                } else if (i == 6) {
                    TextView textView = new TextView(this.mContext);
                    textView.setTextColor(-8682615);
                    textView.setTextSize(1, 13.0f);
                    textView.setGravity(1);
                    textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                    if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                        textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                        groupCallGridCell = textView;
                    } else {
                        textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                        groupCallGridCell = textView;
                    }
                } else if (i == 7) {
                    if (GroupCallActivity.this.encryptionDrawable == null) {
                        GroupCallActivity.this.encryptionDrawable = new CallEncryptionCellDrawable(this.mContext);
                    }
                    view = new CallEncryptionCell(this.mContext, GroupCallActivity.this.encryptionDrawable);
                } else {
                    view = new View(this.mContext);
                }
                view = groupCallGridCell;
            } else {
                view = new GroupCallInvitedCell(this.mContext) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.3
                    @Override // org.telegram.ui.Cells.GroupCallInvitedCell, android.widget.FrameLayout, android.view.View
                    protected void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), TLObject.FLAG_30), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == this.lastRow) {
                return 3;
            }
            if (i == this.addMemberRow || i == this.conferenceAddPeopleRow || i == this.conferenceShareLinkRow) {
                return 0;
            }
            if (i == this.videoGridDividerRow) {
                return 5;
            }
            if (i >= this.usersStartRow && i < this.usersEndRow) {
                return 1;
            }
            if (i >= this.usersVideoGridStartRow && i < this.usersVideoGridEndRow) {
                return 4;
            }
            if (i == this.videoNotAvailableRow) {
                return 6;
            }
            return i == this.encryptionRow ? 7 : 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attachRenderer(GroupCallGridCell groupCallGridCell, boolean z) {
        if (isDismissed()) {
            return;
        }
        if (z && groupCallGridCell.getRenderer() == null) {
            groupCallGridCell.setRenderer(GroupCallMiniTextureView.getOrCreate(this.attachedRenderers, this.renderersContainer, groupCallGridCell, null, null, groupCallGridCell.getParticipant(), this.call, this));
        } else {
            if (z || groupCallGridCell.getRenderer() == null) {
                return;
            }
            groupCallGridCell.getRenderer().setPrimaryView(null);
            groupCallGridCell.setRenderer(null);
        }
    }

    public void setOldRows(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.oldEncryptionRow = i;
        this.oldAddMemberRow = i2;
        this.oldUsersStartRow = i3;
        this.oldUsersEndRow = i4;
        this.oldInvitedStartRow = i5;
        this.oldInvitedEndRow = i6;
        this.oldShadyJoinStartRow = i7;
        this.oldShadyJoinEndRow = i8;
        this.oldShadyLeftStartRow = i9;
        this.oldShadyLeftEndRow = i10;
        this.oldUsersVideoStartRow = i11;
        this.oldUsersVideoEndRow = i12;
        this.oldVideoDividerRow = i13;
        this.oldVideoNotAvailableRow = i14;
        this.oldConferenceAddPeopleRow = i15;
        this.oldConferenceShareLinkRow = i16;
    }

    private static class UpdateCallback implements ListUpdateCallback {
        final RecyclerView.Adapter adapter;

        private UpdateCallback(RecyclerView.Adapter adapter) {
            this.adapter = adapter;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i, int i2) {
            this.adapter.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i, int i2) {
            this.adapter.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i, int i2) {
            this.adapter.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i, int i2, Object obj) {
            this.adapter.notifyItemRangeChanged(i, i2, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleAdminSpeak() {
        ChatObject.Call call = this.call;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = this.call.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(this.call.call.join_muted);
        ConnectionsManager connectionsManager = this.accountInstance.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ChatThemeController$$ExternalSyntheticLambda8(dispatchQueue), new Utilities.Callback2() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda66
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                GroupCallActivity.this.lambda$toggleAdminSpeak$77((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleAdminSpeak$77(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            this.accountInstance.getMessagesController().processUpdates(updates, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentsEnabled(boolean z) {
        if (this.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = this.call.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
        this.pendingCommentsEnabled = Boolean.valueOf(z);
        updateButtonsVisibility(true);
        ConnectionsManager connectionsManager = this.accountInstance.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ChatThemeController$$ExternalSyntheticLambda8(dispatchQueue), new Utilities.Callback2() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda64
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                GroupCallActivity.this.lambda$setCommentsEnabled$79((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCommentsEnabled$79(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            this.accountInstance.getMessagesController().processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda80
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$setCommentsEnabled$78();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCommentsEnabled$78() {
        this.pendingCommentsEnabled = null;
        updateButtonsVisibility(true);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    /* renamed from: onBackPressed */
    public void lambda$openCrafting$8() {
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.dismiss(false, false);
            return;
        }
        if (this.avatarsPreviewShowed) {
            dismissAvatarPreview(true);
        } else if (this.renderersContainer.inFullscreenMode) {
            fullscreenFor(null);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class AvatarUpdaterDelegate implements ImageUpdater.ImageUpdaterDelegate {
        private TLRPC.FileLocation avatar;
        private TLRPC.FileLocation avatarBig;
        private final long peerId;
        private ImageLocation uploadingImageLocation;
        public float uploadingProgress;

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ boolean canFinishFragment() {
            return ImageUpdater.ImageUpdaterDelegate.-CC.$default$canFinishFragment(this);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public void didStartUpload(boolean z, boolean z2) {
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ void didUploadFailed() {
            ImageUpdater.ImageUpdaterDelegate.-CC.$default$didUploadFailed(this);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            return ImageUpdater.ImageUpdaterDelegate.-CC.$default$getCloseIntoObject(this);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.-CC.$default$getInitialSearchString(this);
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ boolean supportsBulletin() {
            return ImageUpdater.ImageUpdaterDelegate.-CC.$default$supportsBulletin(this);
        }

        private AvatarUpdaterDelegate(long j) {
            this.peerId = j;
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$3(inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didUploadPhoto$1(final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$0(tL_error, tLObject, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didUploadPhoto$0(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            if (this.uploadingImageLocation != null) {
                GroupCallActivity.this.avatarsViewPager.removeUploadingImage(this.uploadingImageLocation);
                this.uploadingImageLocation = null;
            }
            if (tL_error == null) {
                TLRPC.User user = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(GroupCallActivity.this.accountInstance.getUserConfig().getClientUserId()));
                if (user == null) {
                    user = GroupCallActivity.this.accountInstance.getUserConfig().getCurrentUser();
                    if (user == null) {
                        return;
                    } else {
                        GroupCallActivity.this.accountInstance.getMessagesController().putUser(user, false);
                    }
                } else {
                    GroupCallActivity.this.accountInstance.getUserConfig().setCurrentUser(user);
                }
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                if (closestPhotoSizeWithSize != null) {
                    tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                }
                if (closestPhotoSizeWithSize2 != null) {
                    tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                }
                if (closestPhotoSizeWithSize != null && this.avatar != null) {
                    FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(this.avatar, true).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                    ImageLoader.getInstance().replaceImageInCache(this.avatar.volume_id + "_" + this.avatar.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUser(((BottomSheet) GroupCallActivity.this).currentAccount, user, 1), false);
                }
                if (closestPhotoSizeWithSize2 != null && this.avatarBig != null) {
                    FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(this.avatarBig, true).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                }
                if (videoSize != null && str != null) {
                    new File(str).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(videoSize, "mp4", true));
                }
                GroupCallActivity.this.accountInstance.getMessagesController().getDialogPhotos(user.id).reset();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                GroupCallActivity.this.accountInstance.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                TLRPC.User user2 = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(this.peerId));
                ImageLocation forUser = ImageLocation.getForUser(GroupCallActivity.this.accountInstance.getCurrentAccount(), user2, 0);
                ImageLocation forUser2 = ImageLocation.getForUser(GroupCallActivity.this.accountInstance.getCurrentAccount(), user2, 1);
                if (ImageLocation.getForLocal(this.avatarBig) == null) {
                    forUser2 = ImageLocation.getForLocal(this.avatar);
                }
                GroupCallActivity.this.avatarsViewPager.setCreateThumbFromParent(false);
                GroupCallActivity.this.avatarsViewPager.initIfEmpty(null, forUser, forUser2, true);
                this.avatar = null;
                this.avatarBig = null;
                AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
                updateAvatarUploadingProgress(1.0f);
            }
            GroupCallActivity.this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
            GroupCallActivity.this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            GroupCallActivity.this.accountInstance.getUserConfig().saveConfig(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didUploadPhoto$2() {
            if (this.uploadingImageLocation != null) {
                GroupCallActivity.this.avatarsViewPager.removeUploadingImage(this.uploadingImageLocation);
                this.uploadingImageLocation = null;
            }
            TLRPC.Chat chat = GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.peerId));
            ImageLocation forChat = ImageLocation.getForChat(chat, 0);
            ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
            if (ImageLocation.getForLocal(this.avatarBig) == null) {
                forChat2 = ImageLocation.getForLocal(this.avatar);
            }
            GroupCallActivity.this.avatarsViewPager.setCreateThumbFromParent(false);
            GroupCallActivity.this.avatarsViewPager.initIfEmpty(null, forChat, forChat2, true);
            this.avatar = null;
            this.avatarBig = null;
            AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
            updateAvatarUploadingProgress(1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didUploadPhoto$3(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
            if (inputFile == null && inputFile2 == null && videoSize == null) {
                this.avatar = photoSize.location;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                this.avatarBig = fileLocation;
                this.uploadingImageLocation = ImageLocation.getForLocal(fileLocation);
                GroupCallActivity.this.avatarsViewPager.addUploadingImage(this.uploadingImageLocation, ImageLocation.getForLocal(this.avatar));
                AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
                return;
            }
            if (this.peerId <= 0) {
                GroupCallActivity.this.accountInstance.getMessagesController().changeChatAvatar(-this.peerId, null, inputFile, inputFile2, videoSize, d, str, photoSize.location, photoSize2.location, new Runnable() { // from class: org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$2();
                    }
                });
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate$$ExternalSyntheticLambda1
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$1(str, tLObject, tL_error);
                }
            });
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public void onUploadProgressChanged(float f) {
            GroupCallActivity.this.avatarsViewPager.setUploadProgress(this.uploadingImageLocation, f);
            updateAvatarUploadingProgress(f);
        }

        public void updateAvatarUploadingProgress(float f) {
            this.uploadingProgress = f;
            if (GroupCallActivity.this.listView == null) {
                return;
            }
            for (int i = 0; i < GroupCallActivity.this.listView.getChildCount(); i++) {
                View childAt = GroupCallActivity.this.listView.getChildAt(i);
                if (childAt instanceof GroupCallUserCell) {
                    GroupCallUserCell groupCallUserCell = (GroupCallUserCell) childAt;
                    if (groupCallUserCell.isSelfUser()) {
                        groupCallUserCell.setUploadProgress(f, true);
                    }
                }
            }
        }
    }

    public View getScrimView() {
        return this.scrimView;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onCameraSwitch(boolean z) {
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).updateAttachState(true);
        }
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.update();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class GroupCallItemAnimator extends DefaultItemAnimator {
        HashSet addingHolders;
        public float animationProgress;
        public ValueAnimator animator;
        float outMaxBottom;
        float outMinTop;
        HashSet removingHolders;

        private GroupCallItemAnimator() {
            this.addingHolders = new HashSet();
            this.removingHolders = new HashSet();
        }

        @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public void endAnimations() {
            super.endAnimations();
            this.removingHolders.clear();
            this.addingHolders.clear();
            this.outMinTop = Float.MAX_VALUE;
            GroupCallActivity.this.listView.invalidate();
        }

        public void updateBackgroundBeforeAnimation() {
            if (this.animator != null) {
                return;
            }
            this.addingHolders.clear();
            this.addingHolders.addAll(this.mPendingAdditions);
            this.removingHolders.clear();
            this.removingHolders.addAll(this.mPendingRemovals);
            this.outMaxBottom = 0.0f;
            this.outMinTop = Float.MAX_VALUE;
            if (this.addingHolders.isEmpty() && this.removingHolders.isEmpty()) {
                return;
            }
            int childCount = GroupCallActivity.this.listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GroupCallActivity.this.listView.getChildAt(i);
                RecyclerView.ViewHolder findContainingViewHolder = GroupCallActivity.this.listView.findContainingViewHolder(childAt);
                if (findContainingViewHolder != null && findContainingViewHolder.getItemViewType() != 3 && findContainingViewHolder.getItemViewType() != 4 && findContainingViewHolder.getItemViewType() != 5 && findContainingViewHolder.getItemViewType() != 7 && !this.addingHolders.contains(findContainingViewHolder)) {
                    this.outMaxBottom = Math.max(this.outMaxBottom, childAt.getY() + childAt.getMeasuredHeight());
                    this.outMinTop = Math.min(this.outMinTop, Math.max(0.0f, childAt.getY()));
                }
            }
            this.animationProgress = 0.0f;
            GroupCallActivity.this.listView.invalidate();
        }

        @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public void runPendingAnimations() {
            boolean isEmpty = this.mPendingRemovals.isEmpty();
            boolean isEmpty2 = this.mPendingMoves.isEmpty();
            boolean isEmpty3 = this.mPendingAdditions.isEmpty();
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            if (!isEmpty || !isEmpty2 || !isEmpty3) {
                this.animationProgress = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$GroupCallItemAnimator$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        GroupCallActivity.GroupCallItemAnimator.this.lambda$runPendingAnimations$0(valueAnimator2);
                    }
                });
                this.animator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.GroupCallItemAnimator.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        GroupCallItemAnimator groupCallItemAnimator = GroupCallItemAnimator.this;
                        groupCallItemAnimator.animator = null;
                        GroupCallActivity.this.listView.invalidate();
                        GroupCallActivity.this.renderersContainer.invalidate();
                        ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                        GroupCallActivity.this.updateLayout(true);
                        GroupCallItemAnimator.this.addingHolders.clear();
                        GroupCallItemAnimator.this.removingHolders.clear();
                    }
                });
                this.animator.setDuration(350L);
                this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animator.start();
                GroupCallActivity.this.listView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
            }
            super.runPendingAnimations();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$runPendingAnimations$0(ValueAnimator valueAnimator) {
            this.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            GroupCallActivity.this.listView.invalidate();
            GroupCallActivity.this.renderersContainer.invalidate();
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            GroupCallActivity.this.updateLayout(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithTouchOutside() {
        return !this.renderersContainer.inFullscreenMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserLeaveHint() {
        if (isRtmpStream() && AndroidUtilities.checkInlinePermissions(this.parentActivity) && !RTMPStreamPipOverlay.isVisible()) {
            dismiss();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$onUserLeaveHint$80();
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUserLeaveHint$80() {
        RTMPStreamPipOverlay.show(this.parentActivity);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.parentActivity.addOnUserLeaveHintListener(this.onUserLeaveHintListener);
    }

    public void onResume() {
        paused = false;
        this.listAdapter.notifyDataSetChanged();
        if (this.fullscreenUsersListView.getVisibility() == 0) {
            this.fullscreenAdapter.update(false, this.fullscreenUsersListView);
        }
        if (isTabletMode) {
            this.tabletGridAdapter.update(false, this.tabletVideoGridView);
        }
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).updateAttachState(true);
        }
        this.sizeNotifierFrameLayout.onResume();
        this.callMessageEnterView.onResume();
    }

    public void onPause() {
        paused = true;
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).updateAttachState(false);
        }
        this.sizeNotifierFrameLayout.onPause();
        this.callMessageEnterView.onPause();
    }

    public boolean isRtmpLandscapeMode() {
        if (!isRtmpStream() || this.call.visibleVideoParticipants.isEmpty()) {
            return false;
        }
        return this.call.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.call.visibleVideoParticipants.get(0).aspectRatio >= 1.0f;
    }

    public boolean isRtmpStream() {
        ChatObject.Call call = this.call;
        return call != null && call.call.rtmp_stream;
    }

    public boolean isConference() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    public boolean canManageCall() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.call;
            return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
        }
        return ChatObject.canManageCalls(this.currentChat);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int streamMinVolume;
        if (this.parentActivity == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.parentActivity.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z = false;
            streamMinVolume = audioManager.getStreamMinVolume(0);
            if (audioManager.getStreamVolume(0) == streamMinVolume && keyEvent.getKeyCode() == 25) {
                z = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                getUndoView().showWithAction(0L, z ? 42 : 43, (Runnable) null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public class WatchersView extends LinearLayout {
        private float lastWidth;
        private final AnimatedTextView watchersCountTextView;

        public WatchersView(Context context) {
            super(context);
            this.lastWidth = 0.0f;
            setOrientation(1);
            setGravity(17);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, false);
            this.watchersCountTextView = animatedTextView;
            animatedTextView.setTextColor(-1);
            animatedTextView.setTextSize(AndroidUtilities.dp(46.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setGravity(1);
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
            addView(animatedTextView, LayoutHelper.createLinear(-1, 46));
            addView(textView, LayoutHelper.createLinear(-2, -2));
        }

        void setWatchersCount(int i) {
            String formatNumber = LocaleController.formatNumber(i, ',');
            float measureText = this.watchersCountTextView.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
            if (this.lastWidth != measureText) {
                this.watchersCountTextView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{GroupCallActivity.this.getThemedColor(Theme.key_premiumGradient1), GroupCallActivity.this.getThemedColor(Theme.key_premiumGradient3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                this.lastWidth = measureText;
            }
            this.watchersCountTextView.setText(formatNumber);
        }
    }

    public class LightningView extends View {
        private int[] currentColors;
        private final Paint paint;
        private int parentBackgroundColor;
        private float shadowOffset;

        public LightningView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(0);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (!GroupCallActivity.this.needTextureLightning || GroupCallActivity.this.renderersContainer.progressToFullscreenMode >= 0.1d) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        }

        public void setNewColors(int[] iArr) {
            int[] iArr2 = this.currentColors;
            boolean z = true;
            boolean z2 = false;
            if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
                if (iArr2 == null) {
                    this.paint.setAlpha(NotificationCenter.didReceiveSmsCode);
                }
                this.currentColors = iArr;
                if (GroupCallActivity.this.liveLabelBgColorAnimator != null && GroupCallActivity.this.textureLightningViewAnimatingAlpha != 1.0f) {
                    int[] iArr3 = this.currentColors;
                    iArr3[0] = ColorUtils.setAlphaComponent(iArr3[0], (int) (GroupCallActivity.this.textureLightningViewAnimatingAlpha * 255.0f));
                    int[] iArr4 = this.currentColors;
                    iArr4[1] = ColorUtils.setAlphaComponent(iArr4[1], (int) (GroupCallActivity.this.textureLightningViewAnimatingAlpha * 255.0f));
                }
                this.paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, GroupCallActivity.this.textureLightningView.getMeasuredHeight(), this.currentColors, (float[]) null, Shader.TileMode.CLAMP));
                z2 = true;
            }
            if (this.parentBackgroundColor != GroupCallActivity.this.backgroundColor) {
                this.paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.shadowOffset, GroupCallActivity.this.backgroundColor);
                this.parentBackgroundColor = GroupCallActivity.this.backgroundColor;
            } else {
                z = z2;
            }
            if (z) {
                invalidate();
            }
            GroupCallActivity.this.runUpdateTextureLightningRunnable();
        }

        public void setShadowOffset(int i) {
            float f = i;
            if (this.shadowOffset != f) {
                this.paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.shadowOffset, GroupCallActivity.this.backgroundColor);
                this.shadowOffset = f;
                invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getRandomEmoji() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
    }

    public static final class EmojiSlot {
        private String lastEmoji;
        private boolean loaded;
        private final int offset;
        private AnimatedEmojiDrawable real;
        private boolean realAllowed;
        private Drawable realThumb;
        private long startTime;
        private final long INTERVAL = 180;
        private final Drawable[] pool = new Drawable[6];
        private GradientClip clip = new GradientClip();
        private final HashSet parents = new HashSet();
        private boolean attached = false;
        private final AnimatedEmojiSpan.InvalidateHolder invalidate = new AnimatedEmojiSpan.InvalidateHolder() { // from class: org.telegram.ui.GroupCallActivity$EmojiSlot$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.Components.AnimatedEmojiSpan.InvalidateHolder
            public final void invalidate() {
                GroupCallActivity.EmojiSlot.this.lambda$new$0();
            }
        };
        private final RectF rectF = new RectF();

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            Iterator it = this.parents.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }

        public EmojiSlot(int i) {
            int i2 = 0;
            this.offset = i;
            while (true) {
                Drawable[] drawableArr = this.pool;
                if (i2 < drawableArr.length) {
                    drawableArr[i2] = Emoji.getEmojiDrawable(GroupCallActivity.getRandomEmoji());
                    i2++;
                } else {
                    this.startTime = System.currentTimeMillis();
                    return;
                }
            }
        }

        public void set(String str) {
            boolean z = this.loaded;
            this.loaded = str != null;
            if (str != null && (this.real == null || !TextUtils.equals(this.lastEmoji, str))) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.real;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this.invalidate);
                }
                this.realThumb = Emoji.getEmojiDrawable(str);
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(21, UserConfig.getProductionAccount());
                this.real = animatedEmojiDrawable2;
                this.lastEmoji = str;
                animatedEmojiDrawable2.setupEmojiThumb(str);
                updateEmoji();
                if (this.attached) {
                    this.real.addView(this.invalidate);
                }
            }
            if (!this.loaded || z) {
                return;
            }
            this.realAllowed = false;
        }

        private void updateEmoji() {
            TLRPC.Document document;
            if (this.real == null || this.lastEmoji == null) {
                return;
            }
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new Utilities.Callback() { // from class: org.telegram.ui.GroupCallActivity$EmojiSlot$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    GroupCallActivity.EmojiSlot.this.lambda$updateEmoji$1((TLRPC.TL_messages_stickerSet) obj);
                }
            });
            if (stickerSet == null) {
                return;
            }
            String replace = this.lastEmoji.replace("️", "");
            Iterator<TLRPC.Document> it = stickerSet.documents.iterator();
            while (true) {
                document = null;
                if (!it.hasNext()) {
                    break;
                }
                TLRPC.Document next = it.next();
                if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(next, null).replace("️", ""), replace)) {
                    document = next;
                    break;
                }
            }
            if (document != null) {
                this.real.setupDocument(document);
                return;
            }
            FileLog.e("emoji \"" + this.lastEmoji + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updateEmoji$1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            updateEmoji();
        }

        public void attach(View view) {
            this.parents.add(view);
            checkAttach();
        }

        public void detach(View view) {
            this.parents.remove(view);
            checkAttach();
        }

        private void checkAttach() {
            boolean isEmpty = this.parents.isEmpty();
            boolean z = !isEmpty;
            if (this.attached != z) {
                this.attached = z;
                if (!isEmpty) {
                    onAttached();
                } else {
                    onDetached();
                }
            }
        }

        private void onAttached() {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.real;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this.invalidate);
            }
        }

        private void onDetached() {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.real;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this.invalidate);
            }
        }

        public boolean draw(Canvas canvas, RectF rectF, float f) {
            float dp = AndroidUtilities.dp(6.0f);
            this.rectF.set(rectF);
            float f2 = -dp;
            this.rectF.inset(f2, f2);
            RectF rectF2 = this.rectF;
            canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, NotificationCenter.didReceiveSmsCode, 31);
            long currentTimeMillis = System.currentTimeMillis() + (this.offset * 45);
            long j = currentTimeMillis - this.startTime;
            float f3 = j / 180.0f;
            float min = Math.min(1.0f, f3);
            boolean z = false;
            if (this.loaded && this.real != null && this.realThumb != null && this.realAllowed) {
                this.rectF.set(rectF);
                this.rectF.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
                if (f < 1.0f) {
                    canvas.save();
                    this.realThumb.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                    RectF rectF3 = this.rectF;
                    canvas.translate(rectF3.left, rectF3.top);
                    this.realThumb.setAlpha((int) ((1.0f - f) * 255.0f));
                    this.realThumb.draw(canvas);
                    this.realThumb.setAlpha(NotificationCenter.didReceiveSmsCode);
                    canvas.restore();
                }
                if (f > 0.0f) {
                    canvas.save();
                    this.rectF.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
                    this.real.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                    RectF rectF4 = this.rectF;
                    canvas.translate(rectF4.left, rectF4.top);
                    this.real.setAlpha((int) (255.0f * f));
                    this.real.draw(canvas);
                    this.real.setAlpha(NotificationCenter.didReceiveSmsCode);
                    canvas.restore();
                }
            } else {
                canvas.save();
                this.rectF.set(rectF);
                this.rectF.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
                RectF rectF5 = this.rectF;
                canvas.translate(rectF5.left, rectF5.top);
                this.pool[1].setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                this.pool[1].setAlpha(NotificationCenter.needDeleteBusinessLink);
                this.pool[1].draw(canvas);
                this.pool[1].setAlpha(NotificationCenter.didReceiveSmsCode);
                canvas.restore();
            }
            this.rectF.set(rectF);
            this.rectF.offset(0.0f, min * (rectF.height() + dp));
            canvas.save();
            RectF rectF6 = this.rectF;
            canvas.translate(rectF6.left, rectF6.top);
            this.pool[0].setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.pool[0].setAlpha(NotificationCenter.needDeleteBusinessLink);
            this.pool[0].draw(canvas);
            this.pool[0].setAlpha(NotificationCenter.didReceiveSmsCode);
            canvas.restore();
            if (f3 >= 1.0f) {
                if (this.loaded && this.realAllowed) {
                    z = true;
                } else {
                    this.startTime = currentTimeMillis - (j % 180);
                    shiftPool();
                    if (this.loaded) {
                        this.realAllowed = true;
                    }
                }
            }
            this.rectF.set(rectF);
            float f4 = (int) f2;
            this.rectF.inset(f4, f4);
            RectF rectF7 = this.rectF;
            float f5 = rectF7.left;
            float f6 = rectF7.top;
            rectF7.set(f5, f6, rectF7.right, f6 + dp);
            this.clip.draw(canvas, this.rectF, 1, 1.0f);
            this.rectF.set(rectF);
            this.rectF.inset(f4, f4);
            RectF rectF8 = this.rectF;
            float f7 = rectF8.left;
            float f8 = rectF8.bottom;
            rectF8.set(f7, f8 - dp, rectF8.right, f8);
            this.clip.draw(canvas, this.rectF, 3, 1.0f);
            canvas.restore();
            return true ^ z;
        }

        private void shiftPool() {
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.pool;
                if (i >= drawableArr.length - 1) {
                    drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(GroupCallActivity.getRandomEmoji());
                    return;
                } else {
                    int i2 = i + 1;
                    drawableArr[i] = drawableArr[i2];
                    i = i2;
                }
            }
        }
    }

    public static final class CallEncryptionCellDrawable {
        private final Text closeText;
        private int listBackgroundColor;
        private View parentView;
        private final Text text1;
        private final Text text2;
        private final Paint backgroundPaint = new Paint(1);
        private final Paint dividerPaint = new Paint(1);
        private final EmojiSlot[] slots = new EmojiSlot[4];
        private boolean loading = true;
        private final AnimatedFloat loadingAlpha = new AnimatedFloat(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$CallEncryptionCellDrawable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.CallEncryptionCellDrawable.this.invalidate();
            }
        }, 0, 320, CubicBezierInterpolator.EASE_OUT_QUINT);
        private final RectF fromRect = new RectF();
        private final RectF toRect = new RectF();
        private final Path clipPath = new Path();

        public CallEncryptionCellDrawable(Context context) {
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i < emojiSlotArr.length) {
                    emojiSlotArr[i] = new EmojiSlot(i);
                    i++;
                } else {
                    this.backgroundPaint.setColor(Theme.getColor(Theme.key_voipgroup_listViewBackground));
                    this.text1 = new Text(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                    this.text2 = new Text(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f).multiline(99).setMaxWidth(AndroidUtilities.dp(200.0f)).lineSpacing(AndroidUtilities.dp(2.66f));
                    this.closeText = new Text(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                    setEmojis(null);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidate() {
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
        }

        public void setParentView(View view) {
            this.parentView = view;
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i >= emojiSlotArr.length) {
                    return;
                }
                emojiSlotArr[i].attach(view);
                i++;
            }
        }

        public void resetParentView(View view) {
            if (this.parentView == view) {
                return;
            }
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i < emojiSlotArr.length) {
                    emojiSlotArr[i].detach(view);
                    i++;
                } else {
                    this.parentView = null;
                    return;
                }
            }
        }

        public void setEmojis(String[] strArr) {
            this.loading = strArr == null;
            for (int i = 0; i < 4; i++) {
                this.slots[i].set(strArr == null ? null : strArr[i]);
            }
            invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaintBackgroundColor(int i) {
            this.listBackgroundColor = i;
            invalidate();
        }

        public boolean draw(Canvas canvas, float f, float f2) {
            canvas.save();
            this.text1.ellipsize(f - AndroidUtilities.dp(132.0f));
            this.backgroundPaint.setColor(ColorUtils.blendARGB(this.listBackgroundColor, Theme.getColor(Theme.key_voipgroup_listViewBackground), f2));
            float f3 = this.loadingAlpha.set(this.loading);
            float dp = AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(86.0f) + this.text1.getWidth();
            float dp2 = AndroidUtilities.dp(28.0f);
            float dp3 = AndroidUtilities.dp(232.0f);
            float dp4 = AndroidUtilities.dp(54.0f) + this.text2.getHeight() + AndroidUtilities.dp(50.0f);
            float lerp = AndroidUtilities.lerp(dp, dp3, f2);
            float lerp2 = AndroidUtilities.lerp(dp2, dp4, f2);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f2);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f - lerp) / 2.0f, 0.0f, (f + lerp) / 2.0f, lerp2);
            canvas.drawRoundRect(rectF, lerp3, lerp3, this.backgroundPaint);
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            int dp5 = AndroidUtilities.dp(18.0f);
            int dp6 = AndroidUtilities.dp(30.0f);
            int i = dp5 / 2;
            float f4 = dp5 / 2.0f;
            float centerY = ((int) rectF.centerY()) - i;
            float centerY2 = ((int) rectF.centerY()) + i;
            this.fromRect.set(((((int) rectF.left) + AndroidUtilities.dp(7.0f)) + AndroidUtilities.dp(10.0f)) - f4, centerY, ((int) rectF.left) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(10.0f) + f4, centerY2);
            float f5 = f / 2.0f;
            float f6 = f5 - (r3 * 2);
            float dp7 = (int) ((dp3 - AndroidUtilities.dp(32.0f)) / 4.0f);
            float f7 = (int) ((0.5f * dp7) + f6);
            float f8 = dp6 / 2.0f;
            this.toRect.set(f7 - f8, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f8), f7 + f8, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f8));
            RectF rectF2 = this.fromRect;
            RectF rectF3 = this.toRect;
            AndroidUtilities.lerpCentered(rectF2, rectF3, f2, rectF3);
            boolean draw = this.slots[0].draw(canvas, this.toRect, f2);
            this.fromRect.set(((((int) rectF.left) + AndroidUtilities.dp(27.0f)) + AndroidUtilities.dp(10.0f)) - f4, centerY, ((int) rectF.left) + AndroidUtilities.dp(27.0f) + AndroidUtilities.dp(10.0f) + f4, centerY2);
            float f9 = (int) ((1.5f * dp7) + f6);
            boolean z = draw;
            this.toRect.set(f9 - f8, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f8), f9 + f8, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f8));
            RectF rectF4 = this.fromRect;
            RectF rectF5 = this.toRect;
            AndroidUtilities.lerpCentered(rectF4, rectF5, f2, rectF5);
            if (this.slots[1].draw(canvas, this.toRect, f2)) {
                z = true;
            }
            Text text = this.text1;
            text.draw(canvas, f5 - (text.getWidth() / 2.0f), dp2 / 2.0f, -1, (1.0f - f2) * AndroidUtilities.lerp(1.0f, 0.75f, f3));
            this.fromRect.set(((((int) rectF.right) - AndroidUtilities.dp(47.0f)) + AndroidUtilities.dp(10.0f)) - f4, centerY, (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + AndroidUtilities.dp(10.0f) + f4, centerY2);
            float f10 = (int) ((2.5f * dp7) + f6);
            this.toRect.set(f10 - f8, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f8), f10 + f8, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f8));
            RectF rectF6 = this.fromRect;
            RectF rectF7 = this.toRect;
            AndroidUtilities.lerpCentered(rectF6, rectF7, f2, rectF7);
            if (this.slots[2].draw(canvas, this.toRect, f2)) {
                z = true;
            }
            this.fromRect.set(((((int) rectF.right) - AndroidUtilities.dp(27.0f)) + AndroidUtilities.dp(10.0f)) - f4, centerY, (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + AndroidUtilities.dp(10.0f) + f4, centerY2);
            float f11 = (int) (f6 + (dp7 * 3.5f));
            this.toRect.set(f11 - f8, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f8), f11 + f8, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f8));
            RectF rectF8 = this.fromRect;
            RectF rectF9 = this.toRect;
            AndroidUtilities.lerpCentered(rectF8, rectF9, f2, rectF9);
            boolean z2 = this.slots[3].draw(canvas, this.toRect, f2) ? true : z;
            if (f2 > 0.0f) {
                this.text2.draw(canvas, AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp3 / 2.0f)), AndroidUtilities.dp(54.0f), -1, f2);
                this.dividerPaint.setColor(-16777216);
                this.dividerPaint.setAlpha((int) (255.0f * f2));
                canvas.drawRect(rectF.left, dp4 - AndroidUtilities.dp(40.0f), rectF.right, (dp4 - AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(0.66f), this.dividerPaint);
                this.closeText.draw(canvas, rectF.centerX() - (this.closeText.getWidth() / 2.0f), dp4 - AndroidUtilities.dp(20.0f), -1, f2);
            }
            canvas.restore();
            return z2;
        }
    }

    public static final class CallEncryptionCell extends View {
        private final CallEncryptionCellDrawable drawable;

        public CallEncryptionCell(final Context context, CallEncryptionCellDrawable callEncryptionCellDrawable) {
            super(context);
            this.drawable = callEncryptionCellDrawable;
            NotificationCenter.listenEmojiLoading(this);
            setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$CallEncryptionCell$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.CallEncryptionCell.this.lambda$new$0(context, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(Context context, View view) {
            new EncryptionCallDialog(context, this).show();
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable != null) {
                callEncryptionCellDrawable.setParentView(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable != null) {
                callEncryptionCellDrawable.resetParentView(this);
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(38.0f));
        }

        @Override // android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable == null || !callEncryptionCellDrawable.draw(canvas, getMeasuredWidth(), 0.0f)) {
                return;
            }
            invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static final class EncryptionCallDialog extends Dialog {
            private Bitmap blurBitmap;
            private Paint blurBitmapPaint;
            private BitmapShader blurBitmapShader;
            private final Matrix blurMatrix;
            private final CallEncryptionCell cell;
            private boolean dismissing;
            private float progress;
            private ValueAnimator progressAnimator;
            private final View windowView;

            public EncryptionCallDialog(Context context, final CallEncryptionCell callEncryptionCell) {
                super(context, R.style.TransparentDialog);
                this.blurMatrix = new Matrix();
                this.cell = callEncryptionCell;
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(4);
                }
                AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() { // from class: org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$new$0(callEncryptionCell, (Bitmap) obj);
                    }
                }, 14.0f);
                View view = new View(context) { // from class: org.telegram.ui.GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.1
                    private final int[] p = new int[2];

                    @Override // android.view.View
                    public void dispatchDraw(Canvas canvas) {
                        if (EncryptionCallDialog.this.progress > 0.0f && EncryptionCallDialog.this.blurBitmapPaint != null) {
                            EncryptionCallDialog.this.blurMatrix.reset();
                            float width = getWidth() / EncryptionCallDialog.this.blurBitmap.getWidth();
                            EncryptionCallDialog.this.blurMatrix.postScale(width, width);
                            EncryptionCallDialog.this.blurBitmapShader.setLocalMatrix(EncryptionCallDialog.this.blurMatrix);
                            EncryptionCallDialog.this.blurBitmapPaint.setAlpha((int) (EncryptionCallDialog.this.progress * 255.0f));
                            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), EncryptionCallDialog.this.blurBitmapPaint);
                        }
                        CallEncryptionCell callEncryptionCell2 = callEncryptionCell;
                        if (callEncryptionCell2 != null) {
                            if (callEncryptionCell2.isAttachedToWindow() && callEncryptionCell.getAlpha() > 0.5f) {
                                callEncryptionCell.getLocationInWindow(this.p);
                            } else {
                                EncryptionCallDialog.this.dismiss();
                            }
                            canvas.save();
                            canvas.translate(this.p[0] - (callEncryptionCell.getMeasuredWidth() * (1.0f - callEncryptionCell.getScaleX())), this.p[1] - (callEncryptionCell.getMeasuredHeight() * (1.0f - callEncryptionCell.getScaleY())));
                            if (callEncryptionCell.drawable.draw(canvas, callEncryptionCell.getMeasuredWidth(), EncryptionCallDialog.this.progress)) {
                                invalidate();
                            }
                            canvas.restore();
                        }
                    }
                };
                this.windowView = view;
                view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$new$1(view2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$new$0(CallEncryptionCell callEncryptionCell, Bitmap bitmap) {
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(0);
                }
                this.blurBitmap = bitmap;
                Paint paint = new Paint(1);
                this.blurBitmapPaint = paint;
                Bitmap bitmap2 = this.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                this.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.02f : -0.04f);
                this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$new$1(View view) {
                dismiss();
            }

            @Override // android.app.Dialog
            protected void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                Window window = getWindow();
                window.setWindowAnimations(R.style.DialogNoAnimation);
                setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                attributes.gravity = 119;
                attributes.dimAmount = 0.0f;
                int i = attributes.flags & (-3);
                attributes.softInputMode = 48;
                attributes.flags = (-2013069056) | i;
                if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                    attributes.flags = i | (-2013060864);
                    AndroidUtilities.logFlagSecure();
                }
                attributes.flags |= 1152;
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            }

            @Override // android.app.Dialog
            public void show() {
                super.show();
                animate(1.0f, null);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$show$2();
                    }
                }, 16L);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$show$2() {
                CallEncryptionCell callEncryptionCell = this.cell;
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(4);
                }
            }

            @Override // android.app.Dialog, android.content.DialogInterface
            public void dismiss() {
                if (this.dismissing) {
                    return;
                }
                this.dismissing = true;
                animate(0.0f, new Runnable() { // from class: org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$dismiss$4();
                    }
                });
                try {
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    attributes.flags |= 16;
                    getWindow().setAttributes(attributes);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$dismiss$4() {
                CallEncryptionCell callEncryptionCell = this.cell;
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$dismiss$3();
                    }
                }, 16L);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$dismiss$3() {
                super.dismiss();
            }

            private void animate(final float f, final Runnable runnable) {
                ValueAnimator valueAnimator = this.progressAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.progressAnimator = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.progress, f);
                this.progressAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$animate$5(valueAnimator2);
                    }
                });
                this.progressAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        EncryptionCallDialog.this.progress = f;
                        EncryptionCallDialog.this.windowView.invalidate();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                this.progressAnimator.setDuration(420L);
                this.progressAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.progressAnimator.start();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$animate$5(ValueAnimator valueAnimator) {
                this.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.windowView.invalidate();
            }
        }
    }

    public void openShareConferenceLink() {
        ChatObject.Call call = this.call;
        if (call == null || call.call == null) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
        alertDialog.showDelayed(300L);
        final TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.call.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda65
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$openShareConferenceLink$82(alertDialog, exportgroupcallinvite, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openShareConferenceLink$82(final AlertDialog alertDialog, final TL_phone.exportGroupCallInvite exportgroupcallinvite, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda79
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$openShareConferenceLink$81(alertDialog, tLObject, exportgroupcallinvite, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openShareConferenceLink$81(AlertDialog alertDialog, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                BulletinFactory.of(this.topBulletinContainer, new DarkBlueThemeResourcesProvider()).showForError(tL_error);
                return;
            }
            return;
        }
        Context context = getContext();
        int i = this.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        ChatObject.Call call = this.call;
        CallLogActivity.showCallLinkSheet(context, i, inputGroupCall, str, resourcesProvider, false, (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true);
    }

    public int getAudioOutputValue() {
        Integer num = this.cacheAudioOutputValue;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute != 0) {
            return currentAudioRoute != 1 ? 2 : 0;
        }
        return 1;
    }

    public void setAudioOutputValue(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        sharedInstance.setAudioOutput(i);
        this.cacheAudioOutputValue = Integer.valueOf(i);
    }

    public int getNextAudioOutputValue() {
        if (getAudioOutputActive(getAudioOutputValue())) {
            return 1;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.isBluetoothHeadsetConnected()) ? 0 : 2;
    }

    public String getAudioOutputName(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 0) {
            return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
        }
        if (i == 1) {
            return LocaleController.getString((sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? R.string.VoipAudioRoutingPhone : R.string.VoipAudioRoutingHeadset);
        }
        if (i != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : str;
    }

    public int getAudioOutputIcon(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isBluetoothHeadsetConnected()) {
            return R.drawable.filled_calls_bluetooth_s;
        }
        return R.drawable.filled_sound_on;
    }

    public int getAudioOutputToastIcon(int i) {
        if (i == 2) {
            return R.drawable.msg_voice_bluetooth;
        }
        if (i == 0) {
            return R.drawable.msg_voice_speaker;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
    }

    public String getAudioOutputToastText(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 2) {
            return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth) : LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str);
        }
        if (i == 1) {
            return LocaleController.getString((sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? R.string.VoipAudioSwitchedToPhone : R.string.VoipAudioSwitchedToHeadset);
        }
        return LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isBulletinTop() {
        int dp = AndroidUtilities.dp(74.0f);
        float f = this.scrollOffsetY - dp;
        return (((((float) this.backgroundPaddingTop) + f) > ((float) ActionBar.getCurrentActionBarHeight()) ? 1 : ((((float) this.backgroundPaddingTop) + f) == ((float) ActionBar.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) ActionBar.getCurrentActionBarHeight()) - f) - ((float) this.backgroundPaddingTop)) / ((float) ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)))) : 0.0f) > 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTopBulletinY() {
        float f;
        if (this.topBulletinContainer == null) {
            return;
        }
        int dp = AndroidUtilities.dp(74.0f);
        float f2 = this.scrollOffsetY - dp;
        if (this.backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight()) {
            f = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f2) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
            f2 -= (int) ((ActionBar.getCurrentActionBarHeight() - r0) * f);
        } else {
            f = 0.0f;
        }
        FrameLayout frameLayout = this.topBulletinContainer;
        frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + f2 + this.containerView.getPaddingTop() + AndroidUtilities.dp(10.0f), (-this.topBulletinContainer.getTop()) + this.actionBar.getY() + this.actionBar.getHeight(), f));
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin == null || visibleBulletin.getLayout() == null || visibleBulletin.getLayout().getParent() == null || visibleBulletin.getLayout().getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        visibleBulletin.getLayout().setTop(f > 0.5f);
    }

    private ReactionsContainerLayout createReactionsLayout() {
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            return reactionsContainerLayout;
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return null;
        }
        ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(1, lastFragment, getContext(), this.currentAccount, this.resourcesProvider);
        this.reactionsContainerLayout = reactionsContainerLayout2;
        reactionsContainerLayout2.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() { // from class: org.telegram.ui.GroupCallActivity.66
            private final Paint bgPaint;
            private final Path clipPath = new Path();

            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public boolean allowLongPress() {
                return false;
            }

            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public boolean drawBackground() {
                return true;
            }

            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public /* synthetic */ boolean needEnterText() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$needEnterText(this);
            }

            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public /* synthetic */ void onEmojiWindowDismissed() {
                ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$onEmojiWindowDismissed(this);
            }

            {
                Paint paint = new Paint(1);
                this.bgPaint = paint;
                paint.setColor(-14603467);
            }

            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
                if (f > 0.0f) {
                    canvas.drawRoundRect(rectF, f, f, this.bgPaint);
                } else {
                    canvas.drawRect(rectF, this.bgPaint);
                }
                if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated() || GroupCallActivity.this.renderNodeBlur == null) {
                    return;
                }
                canvas.save();
                if (f > 0.0f) {
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(rectF, f, f, Path.Direction.CW);
                    this.clipPath.close();
                    canvas.clipPath(this.clipPath);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-GroupCallActivity.this.reactionsContainerLayout.getX(), -GroupCallActivity.this.reactionsContainerLayout.getY());
                canvas.scale(GroupCallActivity.this.renderNodeBlurScale, GroupCallActivity.this.renderNodeBlurScale);
                canvas.drawRenderNode(GroupCallActivity.this.renderNodeBlur);
                canvas.restore();
            }

            @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
            public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                String str = visibleReaction.emojicon;
                if (str == null) {
                    str = "👍";
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = str;
                long j = visibleReaction.documentId;
                if (j != 0) {
                    tL_messageEntityCustomEmoji.document_id = j;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = str.length();
                    tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
                }
                GroupCallActivity.this.sendGroupCallMessage(tL_textWithEntities);
                GroupCallActivity.this.hideKeyboardOrEmojiView();
                CustomEmojiReactionsWindow reactionsWindow = GroupCallActivity.this.reactionsContainerLayout.getReactionsWindow();
                if (reactionsWindow == null || !reactionsWindow.isShowing()) {
                    return;
                }
                GroupCallActivity.this.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
                GroupCallActivity.this.reactionsContainerLayout.reset();
            }
        });
        this.containerView.addView(this.reactionsContainerLayout, LayoutHelper.createFrame(-2, 52, 81));
        this.reactionsContainerLayout.setMessage(null, null, false);
        this.callMessageEnterUnderContainer.bringToFront();
        this.callMessageEnterContainer.bringToFront();
        return this.reactionsContainerLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideKeyboardOrEmojiView() {
        if (this.callMessageEnterView.isPopupVisible()) {
            this.callMessageEnterView.hideEmojiView();
        } else {
            this.callMessageEnterView.closeKeyboard();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendGroupCallMessage(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j;
        this.callMessageEnterView.setText("");
        ChatObject.Call call = this.call;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.call;
        long j2 = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        if (peer != null) {
            j = DialogObject.getPeerDialogId(peer);
        } else {
            j = UserConfig.getInstance(this.currentAccount).clientUserId;
        }
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j, tL_textWithEntities, j2, inputGroupCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkInsets() {
        checkGroupCallUiPositions_MessagesList();
        checkGroupCallUiAlpha_ReactionsLayout();
        checkGroupCallUiAlpha_EnterView();
        checkGroupCallUiPositions_EnterView();
        checkGroupCallUiPositions_ReactionsLayout();
        this.containerView.invalidate();
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 2) {
            checkGroupCallUiPositions_MessagesList();
            checkGroupCallUiPositions_ButtonsList();
            checkGroupCallUiPositions_FullscreenUsersList();
            checkGroupCallUiAlpha_ButtonsList();
            this.renderersContainer.setProgressToHideUi(f);
            this.fullscreenUsersListView.invalidate();
            this.containerView.invalidate();
            this.buttonsContainer.invalidate();
        }
        if (i == 3) {
            checkGroupCallUiPositions_ReactionsLayout();
            checkGroupCallUiPositions_MessagesList();
            checkGroupCallUiPositions_SendButton();
            checkGroupCallUiAlpha_ReactionsLayout();
            this.containerView.invalidate();
        }
        if (i == 4) {
            checkGroupCallUiPositions_MessagesList();
            this.callMessageEnterUnderContainer.invalidate();
            this.callMessageEnterView.invalidate();
        }
        if (i == 5) {
            checkGroupCallUiPositions_MessagesList();
            this.containerView.invalidate();
        }
    }

    private void checkGroupCallUi() {
        checkGroupCallUiPositions_EnterView();
        checkGroupCallUiPositions_ReactionsLayout();
        checkGroupCallUiPositions_MessagesList();
        checkGroupCallUiPositions_ButtonsList();
        checkGroupCallUiPositions_FullscreenUsersList();
        checkGroupCallUiPositions_SendButton();
        checkGroupCallUiAlpha_ButtonsList();
        checkGroupCallUiAlpha_EnterView();
        checkGroupCallUiAlpha_ReactionsLayout();
    }

    private void checkGroupCallUiPositions_EnterView() {
        this.callMessageEnterContainer.setTranslationY((-this.windowInsetsStateHolder.getAnimatedMaxBottomInset()) + this.containerView.getPaddingBottom());
        this.callMessageEnterUnderContainer.invalidate();
    }

    private void checkGroupCallUiPositions_ReactionsLayout() {
        if (this.reactionsContainerLayout != null) {
            this.reactionsContainerLayout.setTranslationY((-this.windowInsetsStateHolder.getAnimatedMaxBottomInset()) + this.containerView.getPaddingBottom() + ((-this.animatorMessageIsEmpty.getFloatValue()) * AndroidUtilities.dp(64.0f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkGroupCallUiPositions_MessagesList() {
        float floatValue;
        float f = -((this.windowInsetsStateHolder.getAnimatedMaxBottomInset() - this.containerView.getPaddingBottom()) + this.animatorMessageInputHeight.getFactor() + (AndroidUtilities.dp(68.0f) * this.animatorMessageIsEmpty.getFloatValue()) + AndroidUtilities.dp(10.0f));
        if (isTabletMode) {
            floatValue = (1.0f - this.animatorHasVideo.getFloatValue()) * AndroidUtilities.dp(-91.0f);
        } else {
            floatValue = isLandscapeMode ? 0.0f : ((this.animatorHideButtons.getFloatValue() * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.renderersContainer.progressToFullscreenMode)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(floatValue, f, this.windowInsetsStateHolder.getAnimatedKeyboardVisibility());
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.scrollOffsetY) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        this.groupCallMessagesListView.setTranslationY(lerp);
        this.groupCallMessagesListView.setVisibleHeight((int) max);
    }

    private void checkGroupCallUiPositions_ButtonsList() {
        if (isTabletMode) {
            this.buttonsContainer.setTranslationX(0.0f);
            this.buttonsContainer.setTranslationY(0.0f);
        } else if (isLandscapeMode) {
            this.buttonsContainer.setTranslationX(this.animatorHideButtons.getFloatValue() * AndroidUtilities.dp(94.0f));
            this.buttonsContainer.setTranslationY(0.0f);
        } else {
            this.buttonsContainer.setTranslationX(0.0f);
            this.buttonsContainer.setTranslationY(this.animatorHideButtons.getFloatValue() * AndroidUtilities.dp(94.0f));
        }
    }

    private void checkGroupCallUiPositions_FullscreenUsersList() {
        if (isTabletMode) {
            this.fullscreenUsersListView.setTranslationX(0.0f);
            this.fullscreenUsersListView.setTranslationY(0.0f);
        } else if (isLandscapeMode) {
            this.fullscreenUsersListView.setTranslationX(this.animatorHideButtons.getFloatValue() * AndroidUtilities.dp(94.0f));
            this.fullscreenUsersListView.setTranslationY(0.0f);
        } else {
            this.fullscreenUsersListView.setTranslationX(0.0f);
            this.fullscreenUsersListView.setTranslationY(this.animatorHideButtons.getFloatValue() * AndroidUtilities.dp(94.0f));
        }
    }

    private void checkGroupCallUiPositions_SendButton() {
        float floatValue = this.animatorMessageIsEmpty.getFloatValue();
        this.callMessageHideButton.setScaleX(AndroidUtilities.lerp(0.25f, 1.0f, floatValue));
        this.callMessageHideButton.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, floatValue));
        this.callMessageHideButton.setAlpha(floatValue);
        this.callMessageHideButton.setClickable(floatValue > 0.9f);
        float f = 1.0f - floatValue;
        this.callMessageSendButton.setScaleX(AndroidUtilities.lerp(0.25f, 1.0f, f));
        this.callMessageSendButton.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f));
        this.callMessageSendButton.setAlpha(f);
        this.callMessageSendButton.setClickable(f > 0.9f);
    }

    private void checkGroupCallUiAlpha_ButtonsList() {
        this.buttonsContainer.setAlpha(1.0f - this.animatorHideButtons.getFloatValue());
    }

    private void checkGroupCallUiAlpha_EnterView() {
        float animatedKeyboardVisibility = this.windowInsetsStateHolder.getAnimatedKeyboardVisibility();
        int i = animatedKeyboardVisibility > 0.0f ? 0 : 8;
        this.callMessageEnterContainer.setAlpha(animatedKeyboardVisibility);
        this.callMessageEnterUnderContainer.setAlpha(animatedKeyboardVisibility);
        if (this.callMessageEnterContainer.getVisibility() != i) {
            this.callMessageEnterContainer.setVisibility(i);
            this.callMessageEnterUnderContainer.setVisibility(i);
            if (i == 8 && this.callMessageEnterView.isFocused()) {
                this.callMessageEnterView.clearFocus();
            }
        }
    }

    private void checkGroupCallUiAlpha_ReactionsLayout() {
        if (this.reactionsContainerLayout != null) {
            float animatedKeyboardVisibility = this.windowInsetsStateHolder.getAnimatedKeyboardVisibility() * this.animatorMessageIsEmpty.getFloatValue();
            this.reactionsContainerLayout.setAlpha(animatedKeyboardVisibility);
            int i = animatedKeyboardVisibility > 0.0f ? 0 : 8;
            if (this.reactionsContainerLayout.getVisibility() != i) {
                this.reactionsContainerLayout.setVisibility(i);
                if (i == 8) {
                    this.reactionsContainerLayout.reset();
                }
            }
            ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
            if (reactionsContainerLayout.skipEnterAnimation || animatedKeyboardVisibility != 1.0f) {
                return;
            }
            reactionsContainerLayout.skipEnterAnimation = true;
        }
    }
}
