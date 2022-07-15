package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$ChatParticipants;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$GroupCall;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_channelParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_chatFull;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_groupCall;
import org.telegram.tgnet.TLRPC$TL_groupCallDiscarded;
import org.telegram.tgnet.TLRPC$TL_groupCallParticipant;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputUser;
import org.telegram.tgnet.TLRPC$TL_messages_exportChatInvite;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_phone_createGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_discardGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_exportGroupCallInvite;
import org.telegram.tgnet.TLRPC$TL_phone_exportedGroupCallInvite;
import org.telegram.tgnet.TLRPC$TL_phone_inviteToGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_saveDefaultGroupCallJoinAs;
import org.telegram.tgnet.TLRPC$TL_phone_startScheduledGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_toggleGroupCallSettings;
import org.telegram.tgnet.TLRPC$TL_phone_toggleGroupCallStartSubscription;
import org.telegram.tgnet.TLRPC$TL_photos_photo;
import org.telegram.tgnet.TLRPC$TL_photos_uploadProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_updateGroupCall;
import org.telegram.tgnet.TLRPC$TL_updates;
import org.telegram.tgnet.TLRPC$TL_userProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_userProfilePhotoEmpty;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GroupCallInvitedCell;
import org.telegram.ui.Cells.GroupCallTextCell;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FillLastGridLayoutManager;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.GroupCallRecordAlert;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecordStatusDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.GroupCallGridCell;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.GroupCallStatusIcon;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.webrtc.MediaStreamTrack;
/* loaded from: classes3.dex */
public class GroupCallActivity extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public static GroupCallActivity groupCallInstance;
    public static boolean groupCallUiVisible;
    public static boolean isLandscapeMode;
    public static boolean isTabletMode;
    public static boolean paused;
    private View accountGap;
    private AccountInstance accountInstance;
    private AccountSelectCell accountSelectCell;
    private ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private View actionBarBackground;
    private View actionBarShadow;
    ObjectAnimator additionalSubtitleYAnimator;
    private ActionBarMenuSubItem adminItem;
    private float amplitude;
    private float animateAmplitudeDiff;
    boolean animateButtonsOnNextLayout;
    private float animateToAmplitude;
    private boolean anyEnterEventSent;
    private final AvatarPreviewPagerIndicator avatarPagerIndicator;
    private final FrameLayout avatarPreviewContainer;
    private boolean avatarPriviewTransitionInProgress;
    AvatarUpdaterDelegate avatarUpdaterDelegate;
    private boolean avatarsPreviewShowed;
    private final ProfileGalleryView avatarsViewPager;
    private int backgroundColor;
    private RLottieDrawable bigMicDrawable;
    private final BlobDrawable bigWaveDrawable;
    private View blurredView;
    private GradientDrawable buttonsBackgroundGradient;
    private final View buttonsBackgroundGradientView;
    private final View buttonsBackgroundGradientView2;
    private FrameLayout buttonsContainer;
    private int buttonsVisibility;
    public ChatObject.Call call;
    private boolean callInitied;
    private VoIPToggleButton cameraButton;
    private float cameraButtonScale;
    private boolean changingPermissions;
    private float colorProgress;
    private boolean contentFullyOverlayed;
    private long creatingServiceTime;
    ImageUpdater currentAvatarUpdater;
    private int currentCallState;
    public TLRPC$Chat currentChat;
    private ViewGroup currentOptionsLayout;
    private WeavingState currentState;
    private boolean delayedGroupCallUpdated;
    private boolean drawSpeakingSubtitle;
    public boolean drawingForBlur;
    private ActionBarMenuSubItem editTitleItem;
    private boolean enterEventSent;
    private ActionBarMenuSubItem everyoneItem;
    private ValueAnimator expandAnimator;
    private ImageView expandButton;
    private ValueAnimator expandSizeAnimator;
    private VoIPToggleButton flipButton;
    private final RLottieDrawable flipIcon;
    private int flipIconCurrentEndFrame;
    GroupCallFullscreenAdapter fullscreenAdapter;
    private final DefaultItemAnimator fullscreenListItemAnimator;
    RecyclerListView fullscreenUsersListView;
    private GroupVoipInviteAlert groupVoipInviteAlert;
    private RLottieDrawable handDrawables;
    private boolean hasScrimAnchorView;
    private boolean hasVideo;
    private ActionBarMenuSubItem inviteItem;
    private GroupCallItemAnimator itemAnimator;
    private long lastUpdateTime;
    private FillLastGridLayoutManager layoutManager;
    private VoIPToggleButton leaveButton;
    private ActionBarMenuSubItem leaveItem;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private final LinearLayout menuItemsContainer;
    private ImageView minimizeButton;
    private RLottieImageView muteButton;
    private ValueAnimator muteButtonAnimator;
    private ActionBarMenuSubItem noiseItem;
    private int oldAddMemberRow;
    private int oldCount;
    private int oldInvitedEndRow;
    private int oldInvitedStartRow;
    private int oldUsersEndRow;
    private int oldUsersStartRow;
    private int oldUsersVideoEndRow;
    private int oldUsersVideoStartRow;
    private int oldVideoDividerRow;
    private int oldVideoNotAvailableRow;
    private ActionBarMenuItem otherItem;
    private LaunchActivity parentActivity;
    private ActionBarMenuSubItem permissionItem;
    PinchToZoomHelper pinchToZoomHelper;
    private ActionBarMenuItem pipItem;
    private boolean playingHandAnimation;
    private boolean pressed;
    private WeavingState prevState;
    PrivateVideoPreviewDialog previewDialog;
    private boolean previewTextureTransitionEnabled;
    private float progressToAvatarPreview;
    float progressToHideUi;
    private RadialGradient radialGradient;
    private final Matrix radialMatrix;
    private final Paint radialPaint;
    private RadialProgressView radialProgressView;
    private RecordCallDrawable recordCallDrawable;
    private HintView recordHintView;
    private ActionBarMenuSubItem recordItem;
    private HintView reminderHintView;
    private GroupCallRenderersContainer renderersContainer;
    ViewTreeObserver.OnPreDrawListener requestFullscreenListener;
    private ValueAnimator scheduleAnimator;
    private TextView scheduleButtonTextView;
    private float scheduleButtonsScale;
    private boolean scheduleHasFewPeers;
    private TextView scheduleInfoTextView;
    private TLRPC$InputPeer schedulePeer;
    private int scheduleStartAt;
    private SimpleTextView scheduleStartAtTextView;
    private SimpleTextView scheduleStartInTextView;
    private SimpleTextView scheduleTimeTextView;
    private LinearLayout scheduleTimerContainer;
    private boolean scheduled;
    private String scheduledHash;
    private ActionBarMenuSubItem screenItem;
    private ActionBarMenuItem screenShareItem;
    private AnimatorSet scrimAnimatorSet;
    private GroupCallFullscreenAdapter.GroupCallUserCell scrimFullscreenView;
    private GroupCallGridCell scrimGridView;
    private Paint scrimPaint;
    private View scrimPopupLayout;
    private ActionBarPopupWindow scrimPopupWindow;
    private GroupCallMiniTextureView scrimRenderer;
    private GroupCallUserCell scrimView;
    private float scrollOffsetY;
    private TLRPC$Peer selfPeer;
    private Drawable shadowDrawable;
    private ShareAlert shareAlert;
    private float showLightingProgress;
    private float showWavesProgress;
    private VoIPToggleButton soundButton;
    private float soundButtonScale;
    private ActionBarMenuSubItem soundItem;
    private View soundItemDivider;
    private final GridLayoutManager.SpanSizeLookup spanSizeLookup;
    private boolean startingGroupCall;
    ObjectAnimator subtitleYAnimator;
    private float switchToButtonInt2;
    private float switchToButtonProgress;
    GroupCallTabletGridAdapter tabletGridAdapter;
    RecyclerListView tabletVideoGridView;
    private final BlobDrawable tinyWaveDrawable;
    private AudioPlayerAlert.ClippingTextViewSwitcher titleTextView;
    private Runnable updateCallRecordRunnable;
    private boolean useBlur;
    private TLObject userSwitchObject;
    private Boolean wasNotInLayoutFullscreen;
    private TextView[] muteLabel = new TextView[2];
    private UndoView[] undoView = new UndoView[2];
    public final ArrayList<ChatObject.VideoParticipant> visibleVideoParticipants = new ArrayList<>();
    private RectF rect = new RectF();
    private Paint listViewBackgroundPaint = new Paint(1);
    private ArrayList<TLRPC$TL_groupCallParticipant> oldParticipants = new ArrayList<>();
    private ArrayList<ChatObject.VideoParticipant> oldVideoParticipants = new ArrayList<>();
    private ArrayList<Long> oldInvited = new ArrayList<>();
    private int muteButtonState = 0;
    private boolean animatingToFullscreenExpand = false;
    private Paint paint = new Paint(7);
    private Paint paintTmp = new Paint(7);
    private Paint leaveBackgroundPaint = new Paint(1);
    private WeavingState[] states = new WeavingState[8];
    private float switchProgress = 1.0f;
    private boolean invalidateColors = true;
    private final int[] colorsTmp = new int[3];
    private final ArrayList<GroupCallMiniTextureView> attachedRenderers = new ArrayList<>();
    private final ArrayList<GroupCallMiniTextureView> attachedRenderersTmp = new ArrayList<>();
    private Boolean wasExpandBigSize = Boolean.TRUE;
    public CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
    public final ArrayList<GroupCallStatusIcon> statusIconPool = new ArrayList<>();
    private HashMap<View, Float> buttonsAnimationParamsX = new HashMap<>();
    private HashMap<View, Float> buttonsAnimationParamsY = new HashMap<>();
    private Runnable onUserLeaveHintListener = new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda36
        @Override // java.lang.Runnable
        public final void run() {
            GroupCallActivity.this.onUserLeaveHint();
        }
    };
    private Runnable updateSchedeulRunnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity.1
        @Override // java.lang.Runnable
        public void run() {
            int i;
            if (GroupCallActivity.this.scheduleTimeTextView == null || GroupCallActivity.this.isDismissed()) {
                return;
            }
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            ChatObject.Call call = groupCallActivity.call;
            if (call == null) {
                i = groupCallActivity.scheduleStartAt;
            } else {
                i = call.call.schedule_date;
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
                    GroupCallActivity.this.scheduleStartInTextView.setText(LocaleController.getString("VoipChatLateBy", R.string.VoipChatLateBy));
                }
            }
            GroupCallActivity.this.scheduleStartAtTextView.setText(LocaleController.formatStartsTime(i, 3));
            AndroidUtilities.runOnUIThread(GroupCallActivity.this.updateSchedeulRunnable, 1000L);
        }
    };
    private Runnable unmuteRunnable = GroupCallActivity$$ExternalSyntheticLambda48.INSTANCE;
    private Runnable pressRunnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda37
        @Override // java.lang.Runnable
        public final void run() {
            GroupCallActivity.this.lambda$new$1();
        }
    };
    LongSparseIntArray visiblePeerIds = new LongSparseIntArray();
    private int[] gradientColors = new int[2];
    private boolean listViewVideoVisibility = true;
    private String[] invites = new String[2];
    private int popupAnimationIndex = -1;
    private DiffUtil.Callback diffUtilsCallback = new DiffUtil.Callback() { // from class: org.telegram.ui.GroupCallActivity.58
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
                if (i2 < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || i2 >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow || i < GroupCallActivity.this.oldUsersVideoStartRow || i >= GroupCallActivity.this.oldUsersVideoEndRow) {
                    if (i2 >= GroupCallActivity.this.listAdapter.usersStartRow && i2 < GroupCallActivity.this.listAdapter.usersEndRow && i >= GroupCallActivity.this.oldUsersStartRow && i < GroupCallActivity.this.oldUsersEndRow) {
                        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = (TLRPC$TL_groupCallParticipant) GroupCallActivity.this.oldParticipants.get(i - GroupCallActivity.this.oldUsersStartRow);
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        if (MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer) != MessageObject.getPeerId(groupCallActivity.call.visibleParticipants.get(i2 - groupCallActivity.listAdapter.usersStartRow).peer)) {
                            return false;
                        }
                        return i == i2 || tLRPC$TL_groupCallParticipant.lastActiveDate == ((long) tLRPC$TL_groupCallParticipant.active_date);
                    } else if (i2 >= GroupCallActivity.this.listAdapter.invitedStartRow && i2 < GroupCallActivity.this.listAdapter.invitedEndRow && i >= GroupCallActivity.this.oldInvitedStartRow && i < GroupCallActivity.this.oldInvitedEndRow) {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        return ((Long) GroupCallActivity.this.oldInvited.get(i - GroupCallActivity.this.oldInvitedStartRow)).equals(groupCallActivity2.call.invitedUsers.get(i2 - groupCallActivity2.listAdapter.invitedStartRow));
                    }
                } else {
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    return ((ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i - GroupCallActivity.this.oldUsersVideoStartRow)).equals(groupCallActivity3.visibleVideoParticipants.get(i2 - groupCallActivity3.listAdapter.usersVideoGridStartRow));
                }
            }
            return false;
        }
    };

    public static /* synthetic */ void lambda$processSelectedOption$58(DialogInterface dialogInterface) {
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    static /* synthetic */ float access$10516(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.amplitude + f;
        groupCallActivity.amplitude = f2;
        return f2;
    }

    static /* synthetic */ float access$13116(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.switchProgress + f;
        groupCallActivity.switchProgress = f2;
        return f2;
    }

    static /* synthetic */ float access$13716(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress + f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    static /* synthetic */ float access$13724(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress - f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    static /* synthetic */ float access$13816(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress + f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    static /* synthetic */ float access$13824(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress - f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    public static /* synthetic */ void lambda$new$0() {
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().setMicMute(false, true, false);
    }

    public /* synthetic */ void lambda$new$1() {
        if (this.call == null || !this.scheduled || VoIPService.getSharedInstance() == null) {
            return;
        }
        this.muteButton.performHapticFeedback(3, 2);
        updateMuteButton(1, true);
        AndroidUtilities.runOnUIThread(this.unmuteRunnable, 80L);
        this.scheduled = false;
        this.pressed = true;
    }

    static {
        new AnimationProperties.FloatProperty<GroupCallActivity>("colorProgress") { // from class: org.telegram.ui.GroupCallActivity.2
            public void setValue(GroupCallActivity groupCallActivity, float f) {
                groupCallActivity.setColorProgress(f);
            }

            public Float get(GroupCallActivity groupCallActivity) {
                return Float.valueOf(groupCallActivity.getColorProgress());
            }
        };
    }

    /* loaded from: classes3.dex */
    public static class SmallRecordCallDrawable extends Drawable {
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
            int i;
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            if (this.parentView instanceof SimpleTextView) {
                i = centerY + AndroidUtilities.dp(1.0f);
                centerX -= AndroidUtilities.dp(3.0f);
            } else {
                i = centerY + AndroidUtilities.dp(2.0f);
            }
            this.paint2.setColor(-1147527);
            this.paint2.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(centerX, i, AndroidUtilities.dp(4.0f), this.paint2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = elapsedRealtime;
            int i2 = this.state;
            if (i2 == 0) {
                float f = this.alpha + (((float) j) / 2000.0f);
                this.alpha = f;
                if (f >= 1.0f) {
                    this.alpha = 1.0f;
                    this.state = 1;
                }
            } else if (i2 == 1) {
                float f2 = this.alpha - (((float) j) / 2000.0f);
                this.alpha = f2;
                if (f2 < 0.5f) {
                    this.alpha = 0.5f;
                    this.state = 0;
                }
            }
            this.parentView.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public static class RecordCallDrawable extends Drawable {
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
                    float f = this.alpha + (((float) j) / 2000.0f);
                    this.alpha = f;
                    if (f >= 1.0f) {
                        this.alpha = 1.0f;
                        this.state = 1;
                    }
                } else if (i == 1) {
                    float f2 = this.alpha - (((float) j) / 2000.0f);
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

    /* loaded from: classes3.dex */
    public class VolumeSlider extends FrameLayout {
        private boolean captured;
        private int currentColor;
        private TLRPC$TL_groupCallParticipant currentParticipant;
        private double currentProgress;
        private boolean dragging;
        private RLottieImageView imageView;
        private long lastUpdateTime;
        private int oldColor;
        private float sx;
        private float sy;
        private TextView textView;
        private int thumbX;
        private Paint paint = new Paint(1);
        private Paint paint2 = new Paint(1);
        private Path path = new Path();
        private float[] radii = new float[8];
        private RectF rect = new RectF();
        private float[] volumeAlphas = new float[3];
        private float colorChangeProgress = 1.0f;
        private RLottieDrawable speakerDrawable = new RLottieDrawable(R.raw.speaker, "2131558544", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VolumeSlider(Context context, TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant) {
            super(context);
            GroupCallActivity.this = r19;
            int i = 3;
            setWillNotDraw(false);
            this.currentParticipant = tLRPC$TL_groupCallParticipant;
            this.currentProgress = ChatObject.getParticipantVolume(tLRPC$TL_groupCallParticipant) / 20000.0f;
            setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setAnimation(this.speakerDrawable);
            double d = 0.0d;
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
            this.textView.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
            this.textView.setTextSize(1, 16.0f);
            double participantVolume = ChatObject.getParticipantVolume(this.currentParticipant);
            Double.isNaN(participantVolume);
            double d2 = participantVolume / 100.0d;
            TextView textView2 = this.textView;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf((int) (d2 > 0.0d ? Math.max(d2, 1.0d) : d));
            textView2.setText(String.format(locale, "%d%%", objArr));
            this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : i) | 16));
            this.paint2.setStyle(Paint.Style.STROKE);
            this.paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            this.paint2.setStrokeCap(Paint.Cap.ROUND);
            this.paint2.setColor(-1);
            double participantVolume2 = ChatObject.getParticipantVolume(this.currentParticipant);
            Double.isNaN(participantVolume2);
            int i2 = (int) (participantVolume2 / 100.0d);
            int i3 = 0;
            while (true) {
                float[] fArr = this.volumeAlphas;
                if (i3 < fArr.length) {
                    if (i2 > (i3 == 0 ? 0 : i3 == 1 ? 50 : ImageReceiver.DEFAULT_CROSSFADE_DURATION)) {
                        fArr[i3] = 1.0f;
                    } else {
                        fArr[i3] = 0.0f;
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
            double size = View.MeasureSpec.getSize(i);
            double d = this.currentProgress;
            Double.isNaN(size);
            this.thumbX = (int) (size * d);
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
                        double d = this.thumbX;
                        double measuredWidth = getMeasuredWidth();
                        Double.isNaN(d);
                        Double.isNaN(measuredWidth);
                        onSeekBarDrag(d / measuredWidth, true);
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
                    double d2 = this.thumbX;
                    double measuredWidth2 = getMeasuredWidth();
                    Double.isNaN(d2);
                    Double.isNaN(measuredWidth2);
                    onSeekBarDrag(d2 / measuredWidth2, false);
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
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.currentParticipant;
            tLRPC$TL_groupCallParticipant.volume = (int) (d * 20000.0d);
            int i = 0;
            tLRPC$TL_groupCallParticipant.volume_by_admin = false;
            tLRPC$TL_groupCallParticipant.flags |= ConnectionsManager.RequestFlagNeedQuickAck;
            double participantVolume = ChatObject.getParticipantVolume(tLRPC$TL_groupCallParticipant);
            Double.isNaN(participantVolume);
            double d2 = participantVolume / 100.0d;
            TextView textView = this.textView;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf((int) (d2 > 0.0d ? Math.max(d2, 1.0d) : 0.0d));
            textView.setText(String.format(locale, "%d%%", objArr));
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = this.currentParticipant;
            sharedInstance.setParticipantVolume(tLRPC$TL_groupCallParticipant2, tLRPC$TL_groupCallParticipant2.volume);
            Integer num = null;
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
                    groupCallActivity.processSelectedOption(this.currentParticipant, peerId, ChatObject.canManageCalls(groupCallActivity.currentChat) ? 0 : 5);
                } else {
                    VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(this.currentParticipant.volume), null, null);
                }
            }
            if (this.currentProgress == 0.0d) {
                num = 1;
            }
            if ((this.imageView.getTag() != null || num == null) && (this.imageView.getTag() == null || num != null)) {
                return;
            }
            this.speakerDrawable.setCustomEndFrame(this.currentProgress == 0.0d ? 17 : 34);
            RLottieDrawable rLottieDrawable = this.speakerDrawable;
            if (this.currentProgress != 0.0d) {
                i = 17;
            }
            rLottieDrawable.setCurrentFrame(i);
            this.speakerDrawable.start();
            this.imageView.setTag(num);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            int i2;
            float f;
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
            float f2 = 1.0f;
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
            float f3 = this.colorChangeProgress;
            if (f3 < 1.0f) {
                float f4 = f3 + (((float) j) / 200.0f);
                this.colorChangeProgress = f4;
                if (f4 > 1.0f) {
                    this.colorChangeProgress = 1.0f;
                } else {
                    invalidate();
                }
            }
            this.path.reset();
            float[] fArr = this.radii;
            float f5 = 6.0f;
            float dp = AndroidUtilities.dp(6.0f);
            fArr[7] = dp;
            fArr[6] = dp;
            int i4 = 1;
            fArr[1] = dp;
            fArr[0] = dp;
            float max = this.thumbX < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (this.thumbX - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f;
            float[] fArr2 = this.radii;
            float dp2 = AndroidUtilities.dp(6.0f) * max;
            fArr2[5] = dp2;
            fArr2[4] = dp2;
            fArr2[3] = dp2;
            fArr2[2] = dp2;
            this.rect.set(0.0f, 0.0f, this.thumbX, getMeasuredHeight());
            this.path.addRoundRect(this.rect, this.radii, Path.Direction.CW);
            this.path.close();
            canvas.drawPath(this.path, this.paint);
            double participantVolume = ChatObject.getParticipantVolume(this.currentParticipant);
            Double.isNaN(participantVolume);
            int i5 = (int) (participantVolume / 100.0d);
            int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2) + AndroidUtilities.dp(5.0f);
            int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
            int i6 = 0;
            while (i6 < this.volumeAlphas.length) {
                if (i6 == 0) {
                    f = AndroidUtilities.dp(f5);
                    i2 = 0;
                } else if (i6 == i4) {
                    f = AndroidUtilities.dp(10.0f);
                    i2 = 50;
                } else {
                    f = AndroidUtilities.dp(14.0f);
                    i2 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                }
                float[] fArr3 = this.volumeAlphas;
                float dp3 = AndroidUtilities.dp(2.0f) * (f2 - fArr3[i6]);
                this.paint2.setAlpha((int) (fArr3[i6] * 255.0f));
                float f6 = left;
                float f7 = top;
                this.rect.set((f6 - f) + dp3, (f7 - f) + dp3, (f6 + f) - dp3, (f7 + f) - dp3);
                int i7 = i2;
                int i8 = i6;
                canvas.drawArc(this.rect, -50.0f, 100.0f, false, this.paint2);
                if (i5 > i7) {
                    float[] fArr4 = this.volumeAlphas;
                    if (fArr4[i8] < 1.0f) {
                        fArr4[i8] = fArr4[i8] + (((float) j) / 180.0f);
                        if (fArr4[i8] > 1.0f) {
                            fArr4[i8] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float[] fArr5 = this.volumeAlphas;
                    if (fArr5[i8] > 0.0f) {
                        fArr5[i8] = fArr5[i8] - (((float) j) / 180.0f);
                        if (fArr5[i8] < 0.0f) {
                            fArr5[i8] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i6 = i8 + 1;
                f2 = 1.0f;
                i4 = 1;
                f5 = 6.0f;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class WeavingState {
        public int currentState;
        private float duration;
        public Shader shader;
        private float startX;
        private float startY;
        private float time;
        private float targetX = -1.0f;
        private float targetY = -1.0f;
        private Matrix matrix = new Matrix();

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
                this.duration = Utilities.random.nextInt(200) + 1500;
                this.time = 0.0f;
                if (this.targetX == -1.0f) {
                    setTarget();
                }
                this.startX = this.targetX;
                this.startY = this.targetY;
                setTarget();
            }
            float f4 = (float) j;
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
        this.parentActivity.getActionBarLayout().draw(canvas);
        canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, 76));
        canvas.restore();
        canvas.save();
        canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
        this.drawingForBlur = true;
        this.containerView.draw(canvas);
        this.drawingForBlur = false;
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(createBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public boolean onCustomOpenAnimation() {
        groupCallUiVisible = true;
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        GroupCallPip.updateVisibility(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.parentActivity.removeOnUserLeaveHintListener(this.onUserLeaveHintListener);
        this.parentActivity.setRequestedOrientation(-1);
        groupCallUiVisible = false;
        GroupVoipInviteAlert groupVoipInviteAlert = this.groupVoipInviteAlert;
        if (groupVoipInviteAlert != null) {
            groupVoipInviteAlert.dismiss();
        }
        this.delayedGroupCallUpdated = true;
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
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
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    public boolean isStillConnecting() {
        int i = this.currentCallState;
        return i == 1 || i == 2 || i == 6 || i == 5;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
        int i3;
        String str;
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2;
        int i4;
        String str2;
        String str3;
        ChatObject.VideoParticipant videoParticipant;
        int i5;
        int i6;
        int i7 = 0;
        if (i == NotificationCenter.groupCallUpdated) {
            Long l = (Long) objArr[1];
            ChatObject.Call call = this.call;
            if (call == null || call.call.id != l.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.call;
            if (call2.call instanceof TLRPC$TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            if (this.creatingServiceTime == 0 && (((i6 = this.muteButtonState) == 7 || i6 == 5 || i6 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.parentActivity, VoIPService.class);
                    intent.putExtra("chat_id", this.currentChat.id);
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda34
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.this.lambda$didReceivedNotification$2();
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
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = this.listView.getChildAt(i8);
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
            if (z && ((i5 = this.muteButtonState) == 1 || i5 == 0)) {
                getUndoView().showWithAction(0L, 38, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length < 4) {
                return;
            }
            long longValue = ((Long) objArr[3]).longValue();
            if (longValue == 0 || isRtmpStream()) {
                return;
            }
            try {
                ArrayList<TLRPC$Dialog> allDialogs = this.accountInstance.getMessagesController().getAllDialogs();
                if (allDialogs != null) {
                    Iterator<TLRPC$Dialog> it = allDialogs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().id == longValue) {
                            i7 = 1;
                            break;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (DialogObject.isUserDialog(longValue)) {
                TLRPC$User user = this.accountInstance.getMessagesController().getUser(Long.valueOf(longValue));
                if (user == null) {
                    return;
                }
                if (this.call.call.participants_count >= 250 && !UserObject.isContact(user) && !user.verified && i7 == 0) {
                    return;
                }
                getUndoView().showWithAction(0L, 44, user, this.currentChat, (Runnable) null, (Runnable) null);
                return;
            }
            TLRPC$Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
            if (chat == null) {
                return;
            }
            if (this.call.call.participants_count >= 250 && ChatObject.isNotInChat(chat) && !chat.verified && i7 == 0) {
                return;
            }
            getUndoView().showWithAction(0L, 44, chat, this.currentChat, (Runnable) null, (Runnable) null);
        } else if (i == NotificationCenter.groupCallSpeakingUsersUpdated) {
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
                    for (int i9 = 0; i9 < this.visibleVideoParticipants.size(); i9++) {
                        ChatObject.VideoParticipant videoParticipant3 = this.visibleVideoParticipants.get(i9);
                        if (this.call.currentSpeakingPeers.get(MessageObject.getPeerId(videoParticipant3.participant.peer), null) != null) {
                            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant3 = videoParticipant3.participant;
                            if (!tLRPC$TL_groupCallParticipant3.muted_by_you && this.renderersContainer.fullscreenPeerId != MessageObject.getPeerId(tLRPC$TL_groupCallParticipant3.peer)) {
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
        } else if (i == NotificationCenter.webRtcMicAmplitudeEvent) {
            setMicAmplitude(((Float) objArr[0]).floatValue());
        } else if (i == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() != 6) {
                return;
            }
            String str4 = (String) objArr[1];
            if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str4)) {
                if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    str3 = LocaleController.getString("VoipChannelTooMuch", R.string.VoipChannelTooMuch);
                } else {
                    str3 = LocaleController.getString("VoipGroupTooMuch", R.string.VoipGroupTooMuch);
                }
            } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str4) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str4)) {
                str3 = LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + str4;
            } else if (ChatObject.isChannelOrGiga(this.currentChat)) {
                str3 = LocaleController.getString("VoipChannelJoinAnonymousAdmin", R.string.VoipChannelJoinAnonymousAdmin);
            } else {
                str3 = LocaleController.getString("VoipGroupJoinAnonymousAdmin", R.string.VoipGroupJoinAnonymousAdmin);
            }
            AlertDialog.Builder createSimpleAlert = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString("VoipGroupVoiceChat", R.string.VoipGroupVoiceChat), str3);
            createSimpleAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda9
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    GroupCallActivity.this.lambda$didReceivedNotification$3(dialogInterface);
                }
            });
            try {
                createSimpleAlert.show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() != null) {
                return;
            }
            dismiss();
        } else if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.id == this.currentChat.id) {
                updateItems();
                updateState(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.selfPeer);
            ChatObject.Call call4 = this.call;
            if (call4 == null || tLRPC$ChatFull.id != (-peerId) || (tLRPC$TL_groupCallParticipant2 = call4.participants.get(peerId)) == null) {
                return;
            }
            tLRPC$TL_groupCallParticipant2.about = tLRPC$ChatFull.about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
            if (this.currentOptionsLayout == null) {
                return;
            }
            while (i7 < this.currentOptionsLayout.getChildCount()) {
                View childAt2 = this.currentOptionsLayout.getChildAt(i7);
                if ((childAt2 instanceof ActionBarMenuSubItem) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                    ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) childAt2;
                    if (TextUtils.isEmpty(tLRPC$TL_groupCallParticipant2.about)) {
                        i4 = R.string.VoipAddDescription;
                        str2 = "VoipAddDescription";
                    } else {
                        i4 = R.string.VoipEditDescription;
                        str2 = "VoipEditDescription";
                    }
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(str2, i4), TextUtils.isEmpty(tLRPC$TL_groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info);
                }
                i7++;
            }
        } else if (i == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() != this.currentChat.id) {
                return;
            }
            updateItems();
            updateState(isShowing(), false);
        } else if (i == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = this.listView.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i7 < childCount2) {
                RecyclerView.ViewHolder findContainingViewHolder = this.listView.findContainingViewHolder(this.listView.getChildAt(i7));
                if (findContainingViewHolder != null) {
                    View view = findContainingViewHolder.itemView;
                    if (view instanceof GroupCallUserCell) {
                        ((GroupCallUserCell) view).getParticipant().lastVisibleDate = longValue2;
                    }
                }
                i7++;
            }
        } else if (i == NotificationCenter.userInfoDidLoad) {
            Long l2 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.selfPeer);
            if (this.call == null || peerId2 != l2.longValue() || (tLRPC$TL_groupCallParticipant = this.call.participants.get(peerId2)) == null) {
                return;
            }
            tLRPC$TL_groupCallParticipant.about = ((TLRPC$UserFull) objArr[1]).about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
            if (this.currentOptionsLayout == null) {
                return;
            }
            while (i7 < this.currentOptionsLayout.getChildCount()) {
                View childAt3 = this.currentOptionsLayout.getChildAt(i7);
                if ((childAt3 instanceof ActionBarMenuSubItem) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                    ActionBarMenuSubItem actionBarMenuSubItem2 = (ActionBarMenuSubItem) childAt3;
                    if (TextUtils.isEmpty(tLRPC$TL_groupCallParticipant.about)) {
                        i3 = R.string.VoipAddBio;
                        str = "VoipAddBio";
                    } else {
                        i3 = R.string.VoipEditBio;
                        str = "VoipEditBio";
                    }
                    actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(str, i3), TextUtils.isEmpty(tLRPC$TL_groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info);
                }
                i7++;
            }
        } else if (i == NotificationCenter.mainUserInfoChanged) {
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
        } else if (i == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
        } else if (i == NotificationCenter.groupCallScreencastStateChanged) {
            PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
            if (privateVideoPreviewDialog != null) {
                privateVideoPreviewDialog.dismiss(true, true);
            }
            updateItems();
        }
    }

    public /* synthetic */ void lambda$didReceivedNotification$2() {
        if (!isStillConnecting()) {
            return;
        }
        updateState(true, false);
    }

    public /* synthetic */ void lambda$didReceivedNotification$3(DialogInterface dialogInterface) {
        dismiss();
    }

    private void setMicAmplitude(float f) {
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f = 0.0f;
        }
        setAmplitude(4000.0f * f);
        ChatObject.Call call = this.call;
        if (call == null || this.listView == null || (tLRPC$TL_groupCallParticipant = call.participants.get(MessageObject.getPeerId(this.selfPeer))) == null) {
            return;
        }
        if (!this.renderersContainer.inFullscreenMode) {
            int indexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(tLRPC$TL_groupCallParticipant);
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
                if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer)) {
                    groupCallUserCell.setAmplitude(f * 15.0f);
                }
            }
        }
        this.renderersContainer.setAmplitude(tLRPC$TL_groupCallParticipant, f * 15.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0210 A[LOOP:2: B:93:0x0208->B:95:0x0210, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyCallParticipantUpdates(boolean z) {
        int i;
        int i2;
        GroupCallRenderersContainer groupCallRenderersContainer;
        ChatObject.Call call;
        boolean z2;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        boolean z3;
        RecyclerView.ViewHolder findContainingViewHolder;
        Exception e;
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
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = this.listView.getChildAt(i5);
            RecyclerView.ViewHolder findContainingViewHolder2 = this.listView.findContainingViewHolder(childAt);
            if (findContainingViewHolder2 != null && findContainingViewHolder2.getAdapterPosition() != -1 && findContainingViewHolder2.getLayoutPosition() != -1 && (view == null || childAt.getTop() < i3)) {
                i4 = findContainingViewHolder2.getLayoutPosition();
                i3 = childAt.getTop();
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
            i = i4;
        } catch (Exception e2) {
            e = e2;
            i = i4;
        }
        try {
            setOldRows(this.listAdapter.addMemberRow, this.listAdapter.usersStartRow, this.listAdapter.usersEndRow, this.listAdapter.invitedStartRow, this.listAdapter.invitedEndRow, this.listAdapter.usersVideoGridStartRow, this.listAdapter.usersVideoGridEndRow, this.listAdapter.videoGridDividerRow, this.listAdapter.videoNotAvailableRow);
            this.listAdapter.updateRows();
            DiffUtil.calculateDiff(this.diffUtilsCallback).dispatchUpdatesTo(updateCallback);
        } catch (Exception e3) {
            e = e3;
            FileLog.e(e);
            this.listAdapter.notifyDataSetChanged();
            this.call.saveActiveDates();
            if (view != null) {
            }
            this.oldParticipants.clear();
            this.oldParticipants.addAll(this.call.visibleParticipants);
            this.oldVideoParticipants.clear();
            this.oldVideoParticipants.addAll(this.visibleVideoParticipants);
            this.oldInvited.clear();
            this.oldInvited.addAll(this.call.invitedUsers);
            this.oldCount = this.listAdapter.getItemCount();
            while (i2 < childCount) {
            }
            boolean autoPinEnabled = this.renderersContainer.autoPinEnabled();
            groupCallRenderersContainer = this.renderersContainer;
            if (groupCallRenderersContainer.inFullscreenMode) {
                if (this.visibleVideoParticipants.isEmpty()) {
                }
                if (!z3) {
                }
            }
            this.fullscreenAdapter.update(true, this.fullscreenUsersListView);
            if (this.fullscreenUsersListView.getVisibility() == 0) {
            }
            if (isTabletMode) {
            }
            if (this.listView.getVisibility() == 0) {
            }
            this.attachedRenderersTmp.clear();
            this.attachedRenderersTmp.addAll(this.attachedRenderers);
            while (r15 < this.attachedRenderersTmp.size()) {
            }
            call = this.call;
            if (call != null) {
            }
            z2 = !this.call.visibleVideoParticipants.isEmpty();
            if (z2 != this.hasVideo) {
            }
        }
        this.call.saveActiveDates();
        if (view != null) {
            this.layoutManager.scrollToPositionWithOffset(i, view.getTop() - this.listView.getPaddingTop());
        }
        this.oldParticipants.clear();
        this.oldParticipants.addAll(this.call.visibleParticipants);
        this.oldVideoParticipants.clear();
        this.oldVideoParticipants.addAll(this.visibleVideoParticipants);
        this.oldInvited.clear();
        this.oldInvited.addAll(this.call.invitedUsers);
        this.oldCount = this.listAdapter.getItemCount();
        for (i2 = 0; i2 < childCount; i2++) {
            View childAt2 = this.listView.getChildAt(i2);
            boolean z4 = childAt2 instanceof GroupCallUserCell;
            if ((z4 || (childAt2 instanceof GroupCallInvitedCell)) && (findContainingViewHolder = this.listView.findContainingViewHolder(childAt2)) != null) {
                if (z4) {
                    ((GroupCallUserCell) childAt2).setDrawDivider(findContainingViewHolder.getAdapterPosition() != this.listAdapter.getItemCount() + (-2));
                } else {
                    ((GroupCallInvitedCell) childAt2).setDrawDivider(findContainingViewHolder.getAdapterPosition() != this.listAdapter.getItemCount() + (-2));
                }
            }
        }
        boolean autoPinEnabled2 = this.renderersContainer.autoPinEnabled();
        groupCallRenderersContainer = this.renderersContainer;
        if (groupCallRenderersContainer.inFullscreenMode && (videoParticipant2 = groupCallRenderersContainer.fullscreenParticipant) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, this.call)) {
            if (this.visibleVideoParticipants.isEmpty()) {
                if (autoPinEnabled2) {
                    fullscreenFor(this.visibleVideoParticipants.get(0));
                }
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                fullscreenFor(null);
            }
        }
        this.fullscreenAdapter.update(true, this.fullscreenUsersListView);
        if (this.fullscreenUsersListView.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
        }
        if (isTabletMode) {
            this.tabletGridAdapter.update(true, this.tabletVideoGridView);
        }
        if (this.listView.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(this.listView);
        }
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i6 = 0; i6 < this.attachedRenderersTmp.size(); i6++) {
            this.attachedRenderersTmp.get(i6).updateAttachState(true);
        }
        call = this.call;
        if (call != null) {
            GroupCallRenderersContainer groupCallRenderersContainer3 = this.renderersContainer;
            if (groupCallRenderersContainer3.inFullscreenMode && (videoParticipant = groupCallRenderersContainer3.fullscreenParticipant) != null) {
                call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
        }
        z2 = !this.call.visibleVideoParticipants.isEmpty();
        if (z2 != this.hasVideo) {
            return;
        }
        this.hasVideo = z2;
        if (!isTabletMode) {
            return;
        }
        this.containerView.requestLayout();
    }

    private void updateVideoParticipantList() {
        this.visibleVideoParticipants.clear();
        if (isTabletMode) {
            if (!this.renderersContainer.inFullscreenMode) {
                return;
            }
            this.visibleVideoParticipants.addAll(this.call.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant = this.renderersContainer.fullscreenParticipant;
            if (videoParticipant == null) {
                return;
            }
            this.visibleVideoParticipants.remove(videoParticipant);
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

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (android.text.TextUtils.isEmpty(r0.username) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateItems() {
        ChatObject.Call call;
        String str;
        int i;
        TLRPC$Chat tLRPC$Chat;
        FrameLayout.LayoutParams layoutParams;
        float f;
        TLObject tLObject;
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
        TLRPC$Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(this.currentChat.id));
        if (chat != null) {
            this.currentChat = chat;
        }
        if (!ChatObject.canUserDoAdminAction(this.currentChat, 3) && ((ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup) || (TextUtils.isEmpty(this.currentChat.username) && !ChatObject.canUserDoAdminAction(this.currentChat, 3)))) {
            if (ChatObject.isChannel(this.currentChat)) {
                TLRPC$Chat tLRPC$Chat2 = this.currentChat;
                if (!tLRPC$Chat2.megagroup) {
                }
            }
            this.inviteItem.setVisibility(8);
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
            call = this.call;
            if (call != null || call.isScheduled() || (tLRPC$TL_groupCallParticipant != null && !tLRPC$TL_groupCallParticipant.can_self_unmute && tLRPC$TL_groupCallParticipant.muted)) {
                this.noiseItem.setVisibility(8);
            } else {
                this.noiseItem.setVisibility(0);
            }
            this.noiseItem.setIcon(!SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
            ActionBarMenuSubItem actionBarMenuSubItem = this.noiseItem;
            if (!SharedConfig.noiseSupression) {
                i = R.string.VoipNoiseCancellationEnabled;
                str = "VoipNoiseCancellationEnabled";
            } else {
                i = R.string.VoipNoiseCancellationDisabled;
                str = "VoipNoiseCancellationDisabled";
            }
            actionBarMenuSubItem.setSubtext(LocaleController.getString(str, i));
            boolean z = true;
            if (!ChatObject.canManageCalls(this.currentChat)) {
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
                if (!this.call.canRecordVideo() || this.call.isScheduled() || Build.VERSION.SDK_INT < 21 || isRtmpStream()) {
                    this.screenItem.setVisibility(8);
                } else {
                    this.screenItem.setVisibility(0);
                }
                this.screenShareItem.setVisibility(8);
                this.recordCallDrawable.setRecording(this.call.recording);
                if (this.call.recording) {
                    if (this.updateCallRecordRunnable == null) {
                        Runnable runnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda35
                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupCallActivity.this.lambda$updateItems$4();
                            }
                        };
                        this.updateCallRecordRunnable = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 1000L);
                    }
                    this.recordItem.setText(LocaleController.getString("VoipGroupStopRecordCall", R.string.VoipGroupStopRecordCall));
                } else {
                    Runnable runnable2 = this.updateCallRecordRunnable;
                    if (runnable2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                        this.updateCallRecordRunnable = null;
                    }
                    this.recordItem.setText(LocaleController.getString("VoipGroupRecordCall", R.string.VoipGroupRecordCall));
                }
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                    this.screenItem.setTextAndIcon(LocaleController.getString("VoipChatStopScreenCapture", R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off);
                } else {
                    this.screenItem.setTextAndIcon(LocaleController.getString("VoipChatStartScreenCapture", R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast);
                }
                updateRecordCallText();
            } else {
                boolean z2 = tLRPC$TL_groupCallParticipant != null && !tLRPC$TL_groupCallParticipant.can_self_unmute && tLRPC$TL_groupCallParticipant.muted && !ChatObject.canManageCalls(this.currentChat);
                if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                    z = false;
                }
                if (Build.VERSION.SDK_INT < 21 || z2 || ((!this.call.canRecordVideo() && !z) || this.call.isScheduled() || isRtmpStream())) {
                    this.screenShareItem.setVisibility(8);
                    this.screenItem.setVisibility(8);
                } else if (z) {
                    this.screenShareItem.setVisibility(8);
                    this.screenItem.setVisibility(0);
                    this.screenItem.setTextAndIcon(LocaleController.getString("VoipChatStopScreenCapture", R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off);
                    this.screenItem.setContentDescription(LocaleController.getString("VoipChatStopScreenCapture", R.string.VoipChatStopScreenCapture));
                } else {
                    this.screenItem.setTextAndIcon(LocaleController.getString("VoipChatStartScreenCapture", R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast);
                    this.screenItem.setContentDescription(LocaleController.getString("VoipChatStartScreenCapture", R.string.VoipChatStartScreenCapture));
                    this.screenShareItem.setVisibility(8);
                    this.screenItem.setVisibility(0);
                }
                this.leaveItem.setVisibility(8);
                this.editTitleItem.setVisibility(8);
                this.recordItem.setVisibility(8);
            }
            if (!ChatObject.canManageCalls(this.currentChat) && this.call.call.can_change_join_muted) {
                this.permissionItem.setVisibility(0);
            } else {
                this.permissionItem.setVisibility(8);
            }
            this.soundItem.setVisibility(!isRtmpStream() ? 8 : 0);
            if (this.editTitleItem.getVisibility() != 0 || this.permissionItem.getVisibility() == 0 || this.inviteItem.getVisibility() == 0 || this.screenItem.getVisibility() == 0 || this.recordItem.getVisibility() == 0 || this.leaveItem.getVisibility() == 0) {
                this.soundItemDivider.setVisibility(0);
            } else {
                this.soundItemDivider.setVisibility(8);
            }
            if (((VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().hasFewPeers) || this.scheduleHasFewPeers) && !isRtmpStream()) {
                this.accountSelectCell.setVisibility(0);
                this.accountGap.setVisibility(0);
                long peerId = MessageObject.getPeerId(this.selfPeer);
                if (DialogObject.isUserDialog(peerId)) {
                    tLObject = this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                } else {
                    tLObject = this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                }
                this.accountSelectCell.setObject(tLObject);
            } else {
                this.accountSelectCell.setVisibility(8);
                this.accountGap.setVisibility(8);
            }
            tLRPC$Chat = this.currentChat;
            if (tLRPC$Chat == null && !ChatObject.isChannelOrGiga(tLRPC$Chat) && isRtmpStream() && this.inviteItem.getVisibility() == 8) {
                this.otherItem.setVisibility(8);
            } else {
                this.otherItem.setVisibility(0);
            }
            layoutParams = (FrameLayout.LayoutParams) this.titleTextView.getLayoutParams();
            f = 96;
            if (layoutParams.rightMargin != AndroidUtilities.dp(f)) {
                layoutParams.rightMargin = AndroidUtilities.dp(f);
                this.titleTextView.requestLayout();
            }
            ((FrameLayout.LayoutParams) this.menuItemsContainer.getLayoutParams()).rightMargin = 0;
            this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        }
        this.inviteItem.setVisibility(0);
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        call = this.call;
        if (call != null) {
        }
        this.noiseItem.setVisibility(8);
        this.noiseItem.setIcon(!SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.noiseItem;
        if (!SharedConfig.noiseSupression) {
        }
        actionBarMenuSubItem2.setSubtext(LocaleController.getString(str, i));
        boolean z3 = true;
        if (!ChatObject.canManageCalls(this.currentChat)) {
        }
        if (!ChatObject.canManageCalls(this.currentChat)) {
        }
        this.permissionItem.setVisibility(8);
        this.soundItem.setVisibility(!isRtmpStream() ? 8 : 0);
        if (this.editTitleItem.getVisibility() != 0) {
        }
        this.soundItemDivider.setVisibility(0);
        if (VoIPService.getSharedInstance() == null) {
        }
        this.accountSelectCell.setVisibility(8);
        this.accountGap.setVisibility(8);
        tLRPC$Chat = this.currentChat;
        if (tLRPC$Chat == null) {
        }
        this.otherItem.setVisibility(0);
        layoutParams = (FrameLayout.LayoutParams) this.titleTextView.getLayoutParams();
        f = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f)) {
        }
        ((FrameLayout.LayoutParams) this.menuItemsContainer.getLayoutParams()).rightMargin = 0;
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public /* synthetic */ void lambda$updateItems$4() {
        updateRecordCallText();
        AndroidUtilities.runOnUIThread(this.updateCallRecordRunnable, 1000L);
    }

    protected void makeFocusable(final BottomSheet bottomSheet, final AlertDialog alertDialog, final EditTextBoldCursor editTextBoldCursor, final boolean z) {
        if (!this.enterEventSent) {
            BaseFragment baseFragment = this.parentActivity.getActionBarLayout().fragmentsStack.get(this.parentActivity.getActionBarLayout().fragmentsStack.size() - 1);
            if (baseFragment instanceof ChatActivity) {
                boolean needEnterText = ((ChatActivity) baseFragment).needEnterText();
                this.enterEventSent = true;
                this.anyEnterEventSent = true;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda27
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.lambda$makeFocusable$7(BottomSheet.this, editTextBoldCursor, z, alertDialog);
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
            if (!z) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda30
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.lambda$makeFocusable$8(EditTextBoldCursor.this);
                }
            }, 100L);
        }
    }

    public static /* synthetic */ void lambda$makeFocusable$7(BottomSheet bottomSheet, final EditTextBoldCursor editTextBoldCursor, boolean z, AlertDialog alertDialog) {
        if (bottomSheet != null && !bottomSheet.isDismissed()) {
            bottomSheet.setFocusable(true);
            editTextBoldCursor.requestFocus();
            if (!z) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                }
            });
        } else if (alertDialog == null || !alertDialog.isShowing()) {
        } else {
            alertDialog.setFocusable(true);
            editTextBoldCursor.requestFocus();
            if (!z) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$makeFocusable$8(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void create(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC$Chat tLRPC$Chat, TLRPC$InputPeer tLRPC$InputPeer, boolean z, String str) {
        TLRPC$Chat chat;
        if (groupCallInstance == null) {
            if (tLRPC$InputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (tLRPC$InputPeer != null) {
                groupCallInstance = new GroupCallActivity(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(tLRPC$Chat.id, false), tLRPC$Chat, tLRPC$InputPeer, z, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null || (chat = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId))) == null) {
                    return;
                }
                call.addSelfDummyParticipant(true);
                groupCallInstance = new GroupCallActivity(launchActivity, accountInstance, call, chat, null, z, str);
            }
            GroupCallActivity groupCallActivity = groupCallInstance;
            groupCallActivity.parentActivity = launchActivity;
            groupCallActivity.show();
        }
    }

    private GroupCallActivity(final Context context, final AccountInstance accountInstance, ChatObject.Call call, final TLRPC$Chat tLRPC$Chat, TLRPC$InputPeer tLRPC$InputPeer, boolean z, String str) {
        super(context, false);
        String str2;
        int i;
        String str3;
        int i2;
        ViewGroup viewGroup;
        this.accountInstance = accountInstance;
        this.call = call;
        this.schedulePeer = tLRPC$InputPeer;
        this.currentChat = tLRPC$Chat;
        this.scheduledHash = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.scheduleHasFewPeers = z;
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
        this.navBarColorKey = null;
        this.scrimPaint = new Paint() { // from class: org.telegram.ui.GroupCallActivity.4
            @Override // android.graphics.Paint
            public void setAlpha(int i3) {
                super.setAlpha(i3);
                if (((BottomSheet) GroupCallActivity.this).containerView != null) {
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }
            }
        };
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda12
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$new$9(dialogInterface);
            }
        });
        setDimBehindAlpha(75);
        this.listAdapter = new ListAdapter(context);
        final RecordStatusDrawable recordStatusDrawable = new RecordStatusDrawable(true);
        recordStatusDrawable.setColor(Theme.getColor("voipgroup_speakingText"));
        recordStatusDrawable.start();
        ActionBar actionBar = new ActionBar(context) { // from class: org.telegram.ui.GroupCallActivity.5
            @Override // android.view.View
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }
            }

            @Override // org.telegram.ui.ActionBar.ActionBar, android.view.ViewGroup, android.view.View
            public void dispatchDraw(Canvas canvas) {
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
        this.actionBar.getSubtitleTextView().setVisibility(0);
        this.actionBar.createAdditionalSubtitleTextView();
        this.actionBar.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(this.actionBar.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle, 1.0f, false);
        this.actionBar.getAdditionalSubtitleTextView().setTextColor(Theme.getColor("voipgroup_speakingText"));
        this.actionBar.setSubtitleColor(Theme.getColor("voipgroup_lastSeenTextUnscrolled"));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setOccupyStatusBar(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setItemsColor(Theme.getColor("voipgroup_actionBarItems"), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor("actionBarActionModeDefaultSelector"), false);
        this.actionBar.setTitleColor(Theme.getColor("voipgroup_actionBarItems"));
        this.actionBar.setSubtitleColor(Theme.getColor("voipgroup_lastSeenTextUnscrolled"));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass6(context));
        TLRPC$InputPeer groupCallPeer = tLRPC$InputPeer != null ? tLRPC$InputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            this.selfPeer = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = this.accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC$TL_inputPeerChannel) {
            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
            this.selfPeer = tLRPC$TL_peerChannel;
            tLRPC$TL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC$TL_inputPeerUser) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser2 = new TLRPC$TL_peerUser();
            this.selfPeer = tLRPC$TL_peerUser2;
            tLRPC$TL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC$TL_inputPeerChat) {
            TLRPC$TL_peerChat tLRPC$TL_peerChat = new TLRPC$TL_peerChat();
            this.selfPeer = tLRPC$TL_peerChat;
            tLRPC$TL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new NativeInstance.AudioLevelsCallback() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda49
            @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
            public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
                GroupCallActivity.this.lambda$new$10(iArr, fArr, zArr);
            }
        };
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.bigMicDrawable = new RLottieDrawable(R.raw.voip_filled, "2131558599", AndroidUtilities.dp(72.0f), AndroidUtilities.dp(72.0f), true, null);
        this.handDrawables = new RLottieDrawable(R.raw.hand_2, "2131558460", AndroidUtilities.dp(72.0f), AndroidUtilities.dp(72.0f), true, null);
        FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.GroupCallActivity.7
            private int lastSize;
            boolean localHasVideo;
            private boolean updateRenderers;
            boolean wasLayout;
            private boolean ignoreLayout = false;
            private RectF rect = new RectF();
            HashMap<Object, View> listCells = new HashMap<>();

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i3, int i4) {
                int i5;
                int size = View.MeasureSpec.getSize(i4);
                this.ignoreLayout = true;
                boolean z2 = View.MeasureSpec.getSize(i3) > size && !AndroidUtilities.isTablet();
                GroupCallActivity.this.renderersContainer.listWidth = View.MeasureSpec.getSize(i3);
                boolean z3 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i3) > size && !GroupCallActivity.this.isRtmpStream();
                int i6 = 6;
                if (GroupCallActivity.isLandscapeMode != z2) {
                    GroupCallActivity.isLandscapeMode = z2;
                    int measuredWidth = GroupCallActivity.this.muteButton.getMeasuredWidth();
                    if (measuredWidth == 0) {
                        measuredWidth = GroupCallActivity.this.muteButton.getLayoutParams().width;
                    }
                    float dp = AndroidUtilities.dp(52.0f) / (measuredWidth - AndroidUtilities.dp(8.0f));
                    if (!GroupCallActivity.isLandscapeMode && !GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        dp = 1.0f;
                    }
                    boolean z4 = GroupCallActivity.this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode());
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    ImageView imageView = z4 ? groupCallActivity.minimizeButton : groupCallActivity.expandButton;
                    ImageView imageView2 = z4 ? GroupCallActivity.this.expandButton : GroupCallActivity.this.minimizeButton;
                    imageView.setAlpha(1.0f);
                    imageView.setScaleX(dp);
                    imageView.setScaleY(dp);
                    imageView2.setAlpha(0.0f);
                    GroupCallActivity.this.muteLabel[0].setAlpha(1.0f);
                    GroupCallActivity.this.muteLabel[1].setAlpha(1.0f);
                    if (GroupCallActivity.this.renderersContainer.inFullscreenMode || (GroupCallActivity.isLandscapeMode && !AndroidUtilities.isTablet())) {
                        GroupCallActivity.this.muteLabel[0].setScaleX(0.687f);
                        GroupCallActivity.this.muteLabel[1].setScaleY(0.687f);
                    } else {
                        GroupCallActivity.this.muteLabel[0].setScaleX(1.0f);
                        GroupCallActivity.this.muteLabel[1].setScaleY(1.0f);
                    }
                    GroupCallActivity.this.invalidateLayoutFullscreen();
                    GroupCallActivity.this.layoutManager.setSpanCount(GroupCallActivity.isLandscapeMode ? 6 : 2);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    this.updateRenderers = true;
                    if (GroupCallActivity.this.scheduleInfoTextView != null) {
                        GroupCallActivity.this.scheduleInfoTextView.setVisibility(!GroupCallActivity.isLandscapeMode ? 0 : 8);
                    }
                    if ((GroupCallActivity.this.isRtmpLandscapeMode() == z2) && GroupCallActivity.this.isRtmpStream() && !GroupCallActivity.this.renderersContainer.inFullscreenMode && !GroupCallActivity.this.call.visibleVideoParticipants.isEmpty()) {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        groupCallActivity2.fullscreenFor(groupCallActivity2.call.visibleVideoParticipants.get(0));
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
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    groupCallActivity3.fullscreenAdapter.update(false, groupCallActivity3.tabletVideoGridView);
                    if (GroupCallActivity.isTabletMode) {
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        groupCallActivity4.tabletGridAdapter.update(false, groupCallActivity4.tabletVideoGridView);
                    }
                    GroupCallActivity.this.tabletVideoGridView.setVisibility(GroupCallActivity.isTabletMode ? 0 : 8);
                    GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                    groupCallActivity5.tabletGridAdapter.setVisibility(groupCallActivity5.tabletVideoGridView, GroupCallActivity.isTabletMode && !groupCallActivity5.renderersContainer.inFullscreenMode, true);
                    GroupCallActivity groupCallActivity6 = GroupCallActivity.this;
                    groupCallActivity6.listViewVideoVisibility = !GroupCallActivity.isTabletMode || groupCallActivity6.renderersContainer.inFullscreenMode;
                    boolean z5 = !GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.inFullscreenMode;
                    GroupCallActivity groupCallActivity7 = GroupCallActivity.this;
                    groupCallActivity7.fullscreenAdapter.setVisibility(groupCallActivity7.fullscreenUsersListView, z5);
                    GroupCallActivity.this.fullscreenUsersListView.setVisibility(z5 ? 0 : 8);
                    GroupCallActivity.this.listView.setVisibility((GroupCallActivity.isTabletMode || !GroupCallActivity.this.renderersContainer.inFullscreenMode) ? 0 : 8);
                    FillLastGridLayoutManager fillLastGridLayoutManager = GroupCallActivity.this.layoutManager;
                    if (!GroupCallActivity.isLandscapeMode) {
                        i6 = 2;
                    }
                    fillLastGridLayoutManager.setSpanCount(i6);
                    GroupCallActivity.this.updateState(false, false);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
                    this.updateRenderers = false;
                    GroupCallActivity.this.attachedRenderersTmp.clear();
                    GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                    GroupCallActivity.this.renderersContainer.setIsTablet(GroupCallActivity.isTabletMode);
                    for (int i7 = 0; i7 < GroupCallActivity.this.attachedRenderersTmp.size(); i7++) {
                        ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i7)).updateAttachState(true);
                    }
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    setPadding(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, GroupCallActivity.this.getStatusBarHeight(), ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, 0);
                }
                int paddingTop = (size - getPaddingTop()) - AndroidUtilities.dp(245.0f);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) GroupCallActivity.this.renderersContainer.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams.topMargin = ActionBar.getCurrentActionBarHeight();
                } else {
                    layoutParams.topMargin = 0;
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) GroupCallActivity.this.undoView[i8].getLayoutParams();
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
                int dp2 = AndroidUtilities.dp(150.0f);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) GroupCallActivity.this.listView.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams3.gravity = GroupCallActivity.this.hasVideo ? 5 : 1;
                    layoutParams3.width = AndroidUtilities.dp(320.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    layoutParams3.leftMargin = dp3;
                    layoutParams3.rightMargin = dp3;
                    layoutParams3.bottomMargin = dp2;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    i5 = AndroidUtilities.dp(60.0f);
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                    layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                    layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                    i5 = 0;
                } else {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    int dp4 = AndroidUtilities.dp(60.0f);
                    layoutParams3.bottomMargin = dp2;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(14.0f);
                    int dp5 = AndroidUtilities.dp(14.0f);
                    layoutParams3.leftMargin = dp5;
                    layoutParams3.rightMargin = dp5;
                    i5 = dp4;
                }
                int i9 = 81;
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
                    layoutParams6.height = AndroidUtilities.dp(200.0f);
                    if (GroupCallActivity.this.hasVideo) {
                        i9 = 85;
                    }
                    layoutParams6.gravity = i9;
                    layoutParams6.rightMargin = 0;
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams6.width = AndroidUtilities.dp(90.0f);
                    layoutParams6.height = -1;
                    layoutParams6.gravity = 53;
                } else {
                    layoutParams6.width = -1;
                    layoutParams6.height = AndroidUtilities.dp(200.0f);
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
                int max = GroupCallActivity.isTabletMode ? 0 : Math.max(0, (paddingTop - Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f));
                if (GroupCallActivity.this.listView.getPaddingTop() != max || GroupCallActivity.this.listView.getPaddingBottom() != i5) {
                    GroupCallActivity.this.listView.setPadding(0, max, 0, i5);
                }
                if (GroupCallActivity.this.scheduleStartAtTextView != null) {
                    int dp6 = max + (((paddingTop - max) + AndroidUtilities.dp(60.0f)) / 2);
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartInTextView.getLayoutParams();
                    layoutParams8.topMargin = dp6 - AndroidUtilities.dp(30.0f);
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartAtTextView.getLayoutParams();
                    layoutParams9.topMargin = AndroidUtilities.dp(80.0f) + dp6;
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleTimeTextView.getLayoutParams();
                    if (layoutParams8.topMargin < ActionBar.getCurrentActionBarHeight() || layoutParams9.topMargin + AndroidUtilities.dp(20.0f) > size - AndroidUtilities.dp(231.0f)) {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(4);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(4);
                        layoutParams10.topMargin = dp6 - AndroidUtilities.dp(20.0f);
                    } else {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(0);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(0);
                        layoutParams10.topMargin = dp6;
                    }
                }
                for (int i10 = 0; i10 < GroupCallActivity.this.attachedRenderers.size(); i10++) {
                    ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i10)).setFullscreenMode(GroupCallActivity.this.renderersContainer.inFullscreenMode, true);
                }
                this.ignoreLayout = false;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
                if (measuredHeight != this.lastSize) {
                    this.lastSize = measuredHeight;
                    GroupCallActivity.this.dismissAvatarPreview(false);
                }
                GroupCallActivity.this.cellFlickerDrawable.setParentWidth(getMeasuredWidth());
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
                boolean z3;
                float f;
                if (!GroupCallActivity.isTabletMode || this.localHasVideo == GroupCallActivity.this.hasVideo || !this.wasLayout) {
                    f = 0.0f;
                    z3 = false;
                } else {
                    f = GroupCallActivity.this.listView.getX();
                    z3 = true;
                }
                this.localHasVideo = GroupCallActivity.this.hasVideo;
                GroupCallActivity.this.renderersContainer.inLayout = true;
                super.onLayout(z2, i3, i4, i5, i6);
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
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator).start();
                GroupCallActivity.this.buttonsBackgroundGradientView.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
                GroupCallActivity.this.buttonsBackgroundGradientView2.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
                GroupCallActivity.this.buttonsContainer.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
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
            protected void onDraw(Canvas canvas) {
                float f;
                int dp = AndroidUtilities.dp(74.0f);
                float f2 = GroupCallActivity.this.scrollOffsetY - dp;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(15.0f) + ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop;
                if (((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight()) {
                    int dp2 = (dp - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                    float min = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f2) - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) / dp2);
                    int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - dp2) * min);
                    f2 -= currentActionBarHeight;
                    measuredHeight += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                float paddingTop = f2 + getPaddingTop();
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
                    Theme.dialogs_onlineCirclePaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor("voipgroup_actionBar"), (int) (GroupCallActivity.this.renderersContainer.progressToFullscreenMode * 255.0f)));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_onlineCirclePaint);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                float f;
                View view;
                float f2;
                float f3;
                float alpha;
                float f4;
                float f5;
                GroupCallUserCell groupCallUserCell;
                Path path;
                float[] fArr;
                GroupCallUserCell groupCallUserCell2;
                float f6;
                float f7;
                float f8;
                float f9;
                float f10;
                GroupCallUserCell groupCallUserCell3;
                if (GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsContainer.setTranslationY(0.0f);
                    GroupCallActivity.this.fullscreenUsersListView.setTranslationY(0.0f);
                    GroupCallActivity.this.buttonsContainer.setTranslationX(0.0f);
                    GroupCallActivity.this.fullscreenUsersListView.setTranslationY(0.0f);
                } else if (GroupCallActivity.isLandscapeMode) {
                    GroupCallActivity.this.buttonsContainer.setTranslationY(0.0f);
                    GroupCallActivity.this.fullscreenUsersListView.setTranslationY(0.0f);
                    GroupCallActivity.this.buttonsContainer.setTranslationX(GroupCallActivity.this.progressToHideUi * AndroidUtilities.dp(94.0f));
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.fullscreenUsersListView.setTranslationX(groupCallActivity.progressToHideUi * AndroidUtilities.dp(94.0f));
                } else {
                    GroupCallActivity.this.buttonsContainer.setTranslationX(0.0f);
                    GroupCallActivity.this.fullscreenUsersListView.setTranslationX(0.0f);
                    GroupCallActivity.this.buttonsContainer.setTranslationY(GroupCallActivity.this.progressToHideUi * AndroidUtilities.dp(94.0f));
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.fullscreenUsersListView.setTranslationY(groupCallActivity2.progressToHideUi * AndroidUtilities.dp(94.0f));
                }
                for (int i3 = 0; i3 < GroupCallActivity.this.listView.getChildCount(); i3++) {
                    View childAt = GroupCallActivity.this.listView.getChildAt(i3);
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
                        for (int i4 = 0; i4 < GroupCallActivity.this.listView.getChildCount(); i4++) {
                            View childAt2 = GroupCallActivity.this.listView.getChildAt(i4);
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
                        for (int i5 = 0; i5 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i5++) {
                            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell5 = (GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i5);
                            View view2 = this.listCells.get(groupCallUserCell5.getVideoParticipant());
                            if (view2 == null) {
                                view2 = this.listCells.get(groupCallUserCell5.getParticipant());
                            }
                            float f11 = GroupCallActivity.this.renderersContainer.progressToFullscreenMode;
                            if (!GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                                groupCallUserCell5.setAlpha(1.0f);
                            }
                            if (view2 != null) {
                                if (!(view2 instanceof GroupCallGridCell)) {
                                    f9 = ((groupCallUserCell3.getLeft() + GroupCallActivity.this.listView.getX()) - GroupCallActivity.this.renderersContainer.getLeft()) + groupCallUserCell3.getAvatarImageView().getLeft() + (groupCallUserCell3.getAvatarImageView().getMeasuredWidth() >> 1);
                                    float top = ((groupCallUserCell3.getTop() + GroupCallActivity.this.listView.getY()) - GroupCallActivity.this.renderersContainer.getTop()) + groupCallUserCell3.getAvatarImageView().getTop() + (groupCallUserCell3.getAvatarImageView().getMeasuredHeight() >> 1);
                                    float left = groupCallUserCell5.getLeft() + GroupCallActivity.this.fullscreenUsersListView.getX() + (groupCallUserCell5.getMeasuredWidth() >> 1);
                                    ((GroupCallUserCell) view2).setDrawAvatar(false);
                                    f10 = top;
                                    f8 = left;
                                    f7 = groupCallUserCell5.getTop() + GroupCallActivity.this.fullscreenUsersListView.getY() + (groupCallUserCell5.getMeasuredHeight() >> 1);
                                } else {
                                    GroupCallGridCell groupCallGridCell2 = (GroupCallGridCell) view2;
                                    f9 = (groupCallGridCell2.getLeft() + GroupCallActivity.this.listView.getX()) - GroupCallActivity.this.renderersContainer.getLeft();
                                    f10 = (groupCallGridCell2.getTop() + GroupCallActivity.this.listView.getY()) - GroupCallActivity.this.renderersContainer.getTop();
                                    f8 = groupCallUserCell5.getLeft() + GroupCallActivity.this.fullscreenUsersListView.getX();
                                    f7 = groupCallUserCell5.getTop() + GroupCallActivity.this.fullscreenUsersListView.getY();
                                }
                                float f12 = f9 - f8;
                                float f13 = 1.0f - f11;
                                groupCallUserCell5.setTranslationX(f12 * f13);
                                groupCallUserCell5.setTranslationY((f10 - f7) * f13);
                                groupCallUserCell5.setScaleX(1.0f);
                                groupCallUserCell5.setScaleY(1.0f);
                                groupCallUserCell5.setProgressToFullscreen(f11);
                            } else {
                                groupCallUserCell5.setScaleX(1.0f);
                                groupCallUserCell5.setScaleY(1.0f);
                                groupCallUserCell5.setTranslationX(0.0f);
                                groupCallUserCell5.setTranslationY(0.0f);
                                groupCallUserCell5.setProgressToFullscreen(1.0f);
                                if (groupCallUserCell5.getRenderer() == null) {
                                    groupCallUserCell5.setAlpha(f11);
                                }
                            }
                        }
                    }
                } else {
                    for (int i6 = 0; i6 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i6++) {
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i6)).setProgressToFullscreen(1.0f);
                    }
                }
                for (int i7 = 0; i7 < GroupCallActivity.this.attachedRenderers.size(); i7++) {
                    RecyclerListView recyclerListView = GroupCallActivity.this.listView;
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i7)).updatePosition(recyclerListView, groupCallActivity3.tabletVideoGridView, groupCallActivity3.fullscreenUsersListView, groupCallActivity3.renderersContainer);
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
                super.dispatchDraw(canvas);
                GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                if (groupCallActivity4.drawingForBlur) {
                    return;
                }
                float f14 = 255.0f;
                if (groupCallActivity4.avatarsPreviewShowed) {
                    if (GroupCallActivity.this.scrimView != null) {
                        if (!GroupCallActivity.this.useBlur) {
                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                        }
                        float y = GroupCallActivity.this.listView.getY();
                        float[] fArr2 = new float[8];
                        Path path2 = new Path();
                        int childCount = GroupCallActivity.this.listView.getChildCount();
                        float y2 = GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight();
                        GroupCallUserCell groupCallUserCell6 = null;
                        if (GroupCallActivity.this.hasScrimAnchorView) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= childCount) {
                                    break;
                                } else if (GroupCallActivity.this.listView.getChildAt(i8) == GroupCallActivity.this.scrimView) {
                                    groupCallUserCell6 = GroupCallActivity.this.scrimView;
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        } else {
                            groupCallUserCell6 = GroupCallActivity.this.scrimView;
                        }
                        GroupCallUserCell groupCallUserCell7 = groupCallUserCell6;
                        if (groupCallUserCell7 != null && y < y2) {
                            canvas.save();
                            if (GroupCallActivity.this.scrimFullscreenView == null) {
                                canvas.clipRect(0.0f, (1.0f - GroupCallActivity.this.progressToAvatarPreview) * y, getMeasuredWidth(), ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * y2) + (getMeasuredHeight() * GroupCallActivity.this.progressToAvatarPreview));
                            }
                            if (!GroupCallActivity.this.hasScrimAnchorView) {
                                f5 = GroupCallActivity.this.avatarPreviewContainer.getTop() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth();
                                f4 = GroupCallActivity.this.avatarPreviewContainer.getLeft();
                            } else {
                                f5 = ((GroupCallActivity.this.listView.getY() + groupCallUserCell7.getY()) * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + ((GroupCallActivity.this.avatarPreviewContainer.getTop() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth()) * GroupCallActivity.this.progressToAvatarPreview);
                                f4 = ((GroupCallActivity.this.listView.getLeft() + groupCallUserCell7.getX()) * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + (GroupCallActivity.this.avatarPreviewContainer.getLeft() * GroupCallActivity.this.progressToAvatarPreview);
                            }
                            float f15 = f5;
                            canvas.translate(f4, f15);
                            if (!GroupCallActivity.this.hasScrimAnchorView) {
                                groupCallUserCell = groupCallUserCell7;
                                path = path2;
                                fArr = fArr2;
                                canvas.saveLayerAlpha(0.0f, 0.0f, groupCallUserCell7.getMeasuredWidth(), groupCallUserCell7.getClipHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * 255.0f), 31);
                            } else {
                                groupCallUserCell = groupCallUserCell7;
                                path = path2;
                                fArr = fArr2;
                                canvas.save();
                            }
                            float measuredHeight = (int) (groupCallUserCell.getMeasuredHeight() + ((groupCallUserCell.getClipHeight() - groupCallUserCell.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - GroupCallActivity.this.progressToAvatarPreview))));
                            this.rect.set(0.0f, 0.0f, groupCallUserCell.getMeasuredWidth(), measuredHeight);
                            if (GroupCallActivity.this.hasScrimAnchorView) {
                                f6 = GroupCallActivity.this.progressToAvatarPreview;
                                groupCallUserCell2 = groupCallUserCell;
                            } else {
                                groupCallUserCell2 = groupCallUserCell;
                                f6 = 1.0f;
                            }
                            groupCallUserCell2.setProgressToAvatarPreview(f6);
                            for (int i9 = 0; i9 < 4; i9++) {
                                fArr[i9] = AndroidUtilities.dp(13.0f) * (1.0f - GroupCallActivity.this.progressToAvatarPreview);
                                fArr[i9 + 4] = AndroidUtilities.dp(13.0f);
                            }
                            path.reset();
                            Path path3 = path;
                            path3.addRoundRect(this.rect, fArr, Path.Direction.CW);
                            path3.close();
                            canvas.drawPath(path3, GroupCallActivity.this.listViewBackgroundPaint);
                            groupCallUserCell2.draw(canvas);
                            canvas.restore();
                            canvas.restore();
                            if (GroupCallActivity.this.scrimPopupLayout != null) {
                                float f16 = f15 + measuredHeight;
                                float measuredWidth = (getMeasuredWidth() - GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                                    canvas.saveLayerAlpha(measuredWidth, f16, measuredWidth + GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth(), f16 + GroupCallActivity.this.scrimPopupLayout.getMeasuredHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * 255.0f), 31);
                                } else {
                                    canvas.save();
                                }
                                GroupCallActivity.this.scrimPopupLayout.setTranslationX(measuredWidth - GroupCallActivity.this.scrimPopupLayout.getLeft());
                                GroupCallActivity.this.scrimPopupLayout.setTranslationY(f16 - GroupCallActivity.this.scrimPopupLayout.getTop());
                                float f17 = (GroupCallActivity.this.progressToAvatarPreview * 0.2f) + 0.8f;
                                canvas.scale(f17, f17, (GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth() / 2.0f) + measuredWidth, f16);
                                canvas.translate(measuredWidth, f16);
                                GroupCallActivity.this.scrimPopupLayout.draw(canvas);
                                canvas.restore();
                            }
                        }
                        if (!GroupCallActivity.this.pinchToZoomHelper.isInOverlayMode()) {
                            canvas.save();
                            if (GroupCallActivity.this.hasScrimAnchorView && GroupCallActivity.this.scrimFullscreenView == null) {
                                canvas.clipRect(0.0f, y * (1.0f - GroupCallActivity.this.progressToAvatarPreview), getMeasuredWidth(), (y2 * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + (getMeasuredHeight() * GroupCallActivity.this.progressToAvatarPreview));
                            }
                            canvas.scale(GroupCallActivity.this.avatarPreviewContainer.getScaleX(), GroupCallActivity.this.avatarPreviewContainer.getScaleY(), GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY());
                            canvas.translate(GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY());
                            GroupCallActivity.this.avatarPreviewContainer.draw(canvas);
                            canvas.restore();
                        }
                    }
                    if (GroupCallActivity.this.progressToAvatarPreview == 1.0f || GroupCallActivity.this.scrimFullscreenView != null) {
                        return;
                    }
                    canvas.saveLayerAlpha((int) GroupCallActivity.this.buttonsBackgroundGradientView2.getX(), (int) GroupCallActivity.this.buttonsBackgroundGradientView.getY(), (int) (GroupCallActivity.this.buttonsBackgroundGradientView2.getX() + GroupCallActivity.this.buttonsBackgroundGradientView2.getMeasuredWidth()), getMeasuredHeight(), (int) ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * 255.0f), 31);
                    canvas.save();
                    canvas.translate(GroupCallActivity.this.buttonsBackgroundGradientView2.getX(), GroupCallActivity.this.buttonsBackgroundGradientView2.getY());
                    GroupCallActivity.this.buttonsBackgroundGradientView2.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(GroupCallActivity.this.buttonsBackgroundGradientView.getX(), GroupCallActivity.this.buttonsBackgroundGradientView.getY());
                    GroupCallActivity.this.buttonsBackgroundGradientView.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(GroupCallActivity.this.buttonsContainer.getX(), GroupCallActivity.this.buttonsContainer.getY());
                    GroupCallActivity.this.buttonsContainer.draw(canvas);
                    canvas.restore();
                    for (int i10 = 0; i10 < 2; i10++) {
                        if (GroupCallActivity.this.undoView[i10].getVisibility() == 0) {
                            canvas.save();
                            canvas.translate(GroupCallActivity.this.undoView[1].getX(), GroupCallActivity.this.undoView[1].getY());
                            GroupCallActivity.this.undoView[1].draw(canvas);
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                } else if (GroupCallActivity.this.scrimView != null) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                    float y3 = GroupCallActivity.this.listView.getY();
                    GroupCallActivity.this.listView.getY();
                    GroupCallActivity.this.listView.getMeasuredHeight();
                    if (GroupCallActivity.this.hasScrimAnchorView) {
                        int childCount2 = GroupCallActivity.this.listView.getChildCount();
                        int i11 = 0;
                        while (i11 < childCount2) {
                            View childAt3 = GroupCallActivity.this.listView.getChildAt(i11);
                            if (childAt3 == GroupCallActivity.this.scrimView) {
                                float max = Math.max(GroupCallActivity.this.listView.getLeft(), GroupCallActivity.this.listView.getLeft() + childAt3.getX());
                                float max2 = Math.max(y3, GroupCallActivity.this.listView.getY() + childAt3.getY());
                                float min = Math.min(GroupCallActivity.this.listView.getRight(), GroupCallActivity.this.listView.getLeft() + childAt3.getX() + childAt3.getMeasuredWidth());
                                float min2 = Math.min(GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight(), GroupCallActivity.this.listView.getY() + childAt3.getY() + GroupCallActivity.this.scrimView.getClipHeight());
                                if (max2 < min2) {
                                    if (childAt3.getAlpha() != 1.0f) {
                                        f = min;
                                        f2 = max2;
                                        f3 = max;
                                        view = childAt3;
                                        canvas.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * f14), 31);
                                    } else {
                                        f = min;
                                        f2 = max2;
                                        f3 = max;
                                        view = childAt3;
                                        canvas.save();
                                    }
                                    canvas.clipRect(f3, f2, f, getMeasuredHeight());
                                    canvas.translate(GroupCallActivity.this.listView.getLeft() + view.getX(), GroupCallActivity.this.listView.getY() + view.getY());
                                    this.rect.set(0.0f, 0.0f, view.getMeasuredWidth(), (int) (GroupCallActivity.this.scrimView.getMeasuredHeight() + ((GroupCallActivity.this.scrimView.getClipHeight() - GroupCallActivity.this.scrimView.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - alpha)))));
                                    GroupCallActivity.this.scrimView.setAboutVisibleProgress(GroupCallActivity.this.listViewBackgroundPaint.getColor(), GroupCallActivity.this.scrimPaint.getAlpha() / 100.0f);
                                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), GroupCallActivity.this.listViewBackgroundPaint);
                                    view.draw(canvas);
                                    canvas.restore();
                                    i11++;
                                    f14 = 255.0f;
                                }
                            }
                            i11++;
                            f14 = 255.0f;
                        }
                    } else if (GroupCallActivity.this.scrimFullscreenView == null) {
                        if (GroupCallActivity.this.scrimRenderer == null || !GroupCallActivity.this.scrimRenderer.isAttached()) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(GroupCallActivity.this.scrimRenderer.getX() + GroupCallActivity.this.renderersContainer.getX(), GroupCallActivity.this.scrimRenderer.getY() + GroupCallActivity.this.renderersContainer.getY());
                        GroupCallActivity.this.scrimRenderer.draw(canvas);
                        canvas.restore();
                    } else {
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
            }

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (!GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.progressToFullscreenMode == 1.0f && (view == GroupCallActivity.this.actionBar || view == GroupCallActivity.this.actionBarShadow || view == GroupCallActivity.this.actionBarBackground || view == GroupCallActivity.this.titleTextView || view == GroupCallActivity.this.menuItemsContainer)) {
                    return true;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                if (!groupCallActivity.drawingForBlur || view != groupCallActivity.renderersContainer) {
                    if (view == GroupCallActivity.this.avatarPreviewContainer || view == GroupCallActivity.this.scrimPopupLayout || view == GroupCallActivity.this.scrimView) {
                        return true;
                    }
                    if (GroupCallActivity.this.contentFullyOverlayed && GroupCallActivity.this.useBlur && (view == GroupCallActivity.this.listView || view == GroupCallActivity.this.buttonsContainer)) {
                        return true;
                    }
                    if (GroupCallActivity.this.scrimFullscreenView == null) {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        if (!groupCallActivity2.drawingForBlur && groupCallActivity2.avatarsPreviewShowed && (view == GroupCallActivity.this.buttonsBackgroundGradientView2 || view == GroupCallActivity.this.buttonsBackgroundGradientView || view == GroupCallActivity.this.buttonsContainer || view == GroupCallActivity.this.undoView[0] || view == GroupCallActivity.this.undoView[1])) {
                            return true;
                        }
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
            public boolean onKeyDown(int i3, KeyEvent keyEvent) {
                if (GroupCallActivity.this.scrimView != null && i3 == 4) {
                    GroupCallActivity.this.dismissAvatarPreview(true);
                    return true;
                }
                return super.onKeyDown(i3, keyEvent);
            }
        };
        this.containerView = frameLayout;
        frameLayout.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup2 = this.containerView;
        int i3 = this.backgroundPaddingLeft;
        viewGroup2.setPadding(i3, 0, i3, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        if (tLRPC$InputPeer != null) {
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.scheduleStartInTextView = simpleTextView;
            simpleTextView.setGravity(17);
            this.scheduleStartInTextView.setTextColor(-1);
            this.scheduleStartInTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.scheduleStartInTextView.setTextSize(18);
            this.scheduleStartInTextView.setText(LocaleController.getString("VoipChatStartsIn", R.string.VoipChatStartsIn));
            this.containerView.addView(this.scheduleStartInTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context) { // from class: org.telegram.ui.GroupCallActivity.8
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
                public boolean createLayout(int i4) {
                    boolean createLayout = super.createLayout(i4);
                    int textWidth = getTextWidth();
                    if (textWidth != this.lastTextWidth) {
                        float f = textWidth;
                        this.gradientWidth = 1.3f * f;
                        this.linearGradient = new LinearGradient(0.0f, getTextHeight(), f * 2.0f, 0.0f, new int[]{Theme.getColor("voipgroup_mutedByAdminGradient"), Theme.getColor("voipgroup_mutedByAdminGradient3"), Theme.getColor("voipgroup_mutedByAdminGradient2"), Theme.getColor("voipgroup_mutedByAdminGradient2")}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
                        getPaint().setShader(this.linearGradient);
                        this.lastTextWidth = textWidth;
                    }
                    return createLayout;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
                @Override // org.telegram.ui.ActionBar.SimpleTextView, android.view.View
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onDraw(Canvas canvas) {
                    long j;
                    float f;
                    float f2;
                    float f3;
                    if (this.linearGradient != null) {
                        ChatObject.Call call2 = GroupCallActivity.this.call;
                        float f4 = 1.0f;
                        if (call2 != null && call2.isScheduled()) {
                            GroupCallActivity groupCallActivity = GroupCallActivity.this;
                            long currentTimeMillis = (groupCallActivity.call.call.schedule_date * 1000) - groupCallActivity.accountInstance.getConnectionsManager().getCurrentTimeMillis();
                            if (currentTimeMillis >= 0) {
                                if (currentTimeMillis < 5000) {
                                    f4 = 1.0f - (((float) currentTimeMillis) / 5000.0f);
                                }
                            }
                            this.matrix.reset();
                            this.matrix.postTranslate((-this.lastTextWidth) * 0.7f * f4, 0.0f);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            j = elapsedRealtime - this.lastUpdateTime;
                            if (j > 20) {
                                j = 17;
                            }
                            this.lastUpdateTime = elapsedRealtime;
                            f = this.duration;
                            if (f != 0.0f || this.time >= f) {
                                this.duration = Utilities.random.nextInt(200) + 1500;
                                this.time = 0.0f;
                                if (this.targetX == -1.0f) {
                                    setTarget();
                                }
                                this.startX = this.targetX;
                                setTarget();
                            }
                            float f5 = (float) j;
                            f2 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f5) + (f5 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * GroupCallActivity.this.amplitude);
                            this.time = f2;
                            f3 = this.duration;
                            if (f2 > f3) {
                                this.time = f3;
                            }
                            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f3);
                            float f6 = this.gradientWidth;
                            float f7 = this.startX;
                            this.matrix.postTranslate(((f7 + ((this.targetX - f7) * interpolation)) * f6) - (f6 / 2.0f), 0.0f);
                            this.linearGradient.setLocalMatrix(this.matrix);
                            invalidate();
                        }
                        f4 = 0.0f;
                        this.matrix.reset();
                        this.matrix.postTranslate((-this.lastTextWidth) * 0.7f * f4, 0.0f);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        j = elapsedRealtime2 - this.lastUpdateTime;
                        if (j > 20) {
                        }
                        this.lastUpdateTime = elapsedRealtime2;
                        f = this.duration;
                        if (f != 0.0f) {
                        }
                        this.duration = Utilities.random.nextInt(200) + 1500;
                        this.time = 0.0f;
                        if (this.targetX == -1.0f) {
                        }
                        this.startX = this.targetX;
                        setTarget();
                        float f52 = (float) j;
                        f2 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f52) + (f52 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * GroupCallActivity.this.amplitude);
                        this.time = f2;
                        f3 = this.duration;
                        if (f2 > f3) {
                        }
                        float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f3);
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
            this.scheduleTimeTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.scheduleTimeTextView.setTextSize(60);
            this.containerView.addView(this.scheduleTimeTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(context);
            this.scheduleStartAtTextView = simpleTextView3;
            simpleTextView3.setGravity(17);
            this.scheduleStartAtTextView.setTextColor(-1);
            this.scheduleStartAtTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.scheduleStartAtTextView.setTextSize(18);
            this.containerView.addView(this.scheduleStartAtTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.GroupCallActivity.9
            private final LongSparseIntArray visiblePeerTmp = new LongSparseIntArray();

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view == GroupCallActivity.this.scrimView) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void dispatchDraw(Canvas canvas) {
                float f;
                int i4;
                int i5;
                int i6 = 1;
                boolean z2 = GroupCallActivity.this.itemAnimator.outMinTop != Float.MAX_VALUE;
                this.visiblePeerTmp.clear();
                for (int i7 = 0; i7 < GroupCallActivity.this.visiblePeerIds.size(); i7++) {
                    this.visiblePeerTmp.put(GroupCallActivity.this.visiblePeerIds.keyAt(i7), 1);
                }
                GroupCallActivity.this.visiblePeerIds.clear();
                int childCount = getChildCount();
                int i8 = 0;
                boolean z3 = false;
                float f2 = Float.MAX_VALUE;
                float f3 = 0.0f;
                while (i8 < childCount) {
                    View childAt = getChildAt(i8);
                    RecyclerView.ViewHolder findContainingViewHolder = findContainingViewHolder(childAt);
                    if (findContainingViewHolder == null || findContainingViewHolder.getItemViewType() == 3 || findContainingViewHolder.getItemViewType() == 4 || findContainingViewHolder.getItemViewType() == 5 || findContainingViewHolder.getItemViewType() == 6) {
                        i5 = childCount;
                        i4 = i8;
                    } else {
                        if (findContainingViewHolder.getItemViewType() == i6) {
                            View view = findContainingViewHolder.itemView;
                            if (view instanceof GroupCallUserCell) {
                                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                                i4 = i8;
                                GroupCallActivity.this.visiblePeerIds.append(groupCallUserCell.getPeerId(), i6);
                                i5 = childCount;
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
                                    i8 = i4 + 1;
                                    childCount = i5;
                                    i6 = 1;
                                }
                            }
                        }
                        i5 = childCount;
                        i4 = i8;
                        if (!z2) {
                        }
                    }
                    i8 = i4 + 1;
                    childCount = i5;
                    i6 = 1;
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
                    int measuredWidth = (getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1;
                    GroupCallActivity.this.rect.set(measuredWidth, f, getMeasuredWidth() - measuredWidth, Math.min(getMeasuredHeight() - getTranslationY(), f3));
                    canvas.drawRoundRect(GroupCallActivity.this.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), GroupCallActivity.this.listViewBackgroundPaint);
                }
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override // org.telegram.ui.Components.RecyclerListView, android.view.View
            public void setVisibility(int i4) {
                if (getVisibility() != i4) {
                    for (int i5 = 0; i5 < getChildCount(); i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt instanceof GroupCallGridCell) {
                            GroupCallActivity.this.attachRenderer((GroupCallGridCell) childAt, i4 == 0);
                        }
                    }
                }
                super.setVisibility(i4);
            }

            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                super.onLayout(z2, i4, i5, i6, i7);
                GroupCallActivity.this.itemAnimator.updateBackgroundBeforeAnimation();
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipToPadding(false);
        this.listView.setClipChildren(false);
        GroupCallItemAnimator groupCallItemAnimator = new GroupCallItemAnimator();
        this.itemAnimator = groupCallItemAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        groupCallItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        this.itemAnimator.setRemoveDuration(350L);
        this.itemAnimator.setAddDuration(350L);
        this.itemAnimator.setMoveDuration(350L);
        this.itemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(this.itemAnimator);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.GroupCallActivity.10
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                GroupCallActivity groupCallActivity;
                ChatObject.Call call2;
                if (GroupCallActivity.this.listView.getChildCount() <= 0 || (call2 = (groupCallActivity = GroupCallActivity.this).call) == null) {
                    return;
                }
                if (!call2.loadingMembers && !call2.membersLoadEndReached && groupCallActivity.layoutManager.findLastVisibleItemPosition() > GroupCallActivity.this.listAdapter.getItemCount() - 5) {
                    GroupCallActivity.this.call.loadMembers(false);
                }
                GroupCallActivity.this.updateLayout(true);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                if (i4 != 0) {
                    if (GroupCallActivity.this.recordHintView != null) {
                        GroupCallActivity.this.recordHintView.hide();
                    }
                    if (GroupCallActivity.this.reminderHintView == null) {
                        return;
                    }
                    GroupCallActivity.this.reminderHintView.hide();
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
        FillLastGridLayoutManager fillLastGridLayoutManager2 = this.layoutManager;
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.GroupCallActivity.11
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i4) {
                int i5 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                if (GroupCallActivity.isTabletMode || i4 < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || i4 >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow) {
                    return i5;
                }
                int i6 = GroupCallActivity.this.listAdapter.usersVideoGridEndRow - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                int i7 = (i4 != GroupCallActivity.this.listAdapter.usersVideoGridEndRow - 1 || (!GroupCallActivity.isLandscapeMode && i6 % 2 == 0)) ? 1 : 2;
                if (!GroupCallActivity.isLandscapeMode) {
                    return i7;
                }
                if (i6 == 1) {
                    return 6;
                }
                return i6 == 2 ? 3 : 2;
            }
        };
        this.spanSizeLookup = spanSizeLookup;
        fillLastGridLayoutManager2.setSpanSizeLookup(spanSizeLookup);
        this.listView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.GroupCallActivity.12
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition >= 0) {
                    rect.setEmpty();
                    if (childAdapterPosition < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || childAdapterPosition >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow) {
                        return;
                    }
                    int i4 = childAdapterPosition - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                    int i5 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                    int i6 = i4 % i5;
                    if (i6 == 0) {
                        rect.right = AndroidUtilities.dp(2.0f);
                    } else if (i6 == i5 - 1) {
                        rect.left = AndroidUtilities.dp(2.0f);
                    } else {
                        rect.left = AndroidUtilities.dp(1.0f);
                    }
                }
            }
        });
        this.layoutManager.setBind(false);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setTopBottomSelectorRadius(13);
        this.listView.setSelectorDrawableColor(Theme.getColor("voipgroup_listSelector"));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda63
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ boolean hasDoubleTap(View view, int i4) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i4);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ void onDoubleTap(View view, int i4, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i4, f, f2);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public final void onItemClick(View view, int i4, float f, float f2) {
                GroupCallActivity.this.lambda$new$12(view, i4, f, f2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda64
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view, int i4) {
                boolean lambda$new$13;
                lambda$new$13 = GroupCallActivity.this.lambda$new$13(view, i4);
                return lambda$new$13;
            }
        });
        RecyclerListView recyclerListView3 = new RecyclerListView(context);
        this.tabletVideoGridView = recyclerListView3;
        this.containerView.addView(recyclerListView3, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        RecyclerListView recyclerListView4 = this.tabletVideoGridView;
        GroupCallTabletGridAdapter groupCallTabletGridAdapter = new GroupCallTabletGridAdapter(call, this.currentAccount, this);
        this.tabletGridAdapter = groupCallTabletGridAdapter;
        recyclerListView4.setAdapter(groupCallTabletGridAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 6, 1, false);
        this.tabletVideoGridView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.GroupCallActivity.14
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i4) {
                return GroupCallActivity.this.tabletGridAdapter.getSpanCount(i4);
            }
        });
        this.tabletVideoGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda62
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i4) {
                GroupCallActivity.this.lambda$new$14(view, i4);
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
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                super.onScrolled(recyclerView, i4, i5);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        this.tabletGridAdapter.setVisibility(this.tabletVideoGridView, false, false);
        this.tabletVideoGridView.setVisibility(8);
        this.buttonsContainer = new AnonymousClass17(context);
        int color = Theme.getColor("voipgroup_unmuteButton2");
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        this.radialMatrix = new Matrix();
        this.radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(160.0f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.radialPaint = paint;
        paint.setShader(this.radialGradient);
        BlobDrawable blobDrawable = new BlobDrawable(9);
        this.tinyWaveDrawable = blobDrawable;
        BlobDrawable blobDrawable2 = new BlobDrawable(12);
        this.bigWaveDrawable = blobDrawable2;
        blobDrawable.minRadius = AndroidUtilities.dp(62.0f);
        blobDrawable.maxRadius = AndroidUtilities.dp(72.0f);
        blobDrawable.generateBlob();
        blobDrawable2.minRadius = AndroidUtilities.dp(65.0f);
        blobDrawable2.maxRadius = AndroidUtilities.dp(75.0f);
        blobDrawable2.generateBlob();
        blobDrawable.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor("voipgroup_unmuteButton"), 38));
        blobDrawable2.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor("voipgroup_unmuteButton"), 76));
        VoIPToggleButton voIPToggleButton = new VoIPToggleButton(context);
        this.soundButton = voIPToggleButton;
        voIPToggleButton.setCheckable(true);
        this.soundButton.setTextSize(12);
        this.buttonsContainer.addView(this.soundButton, LayoutHelper.createFrame(68, 80.0f));
        this.soundButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$15(view);
            }
        });
        VoIPToggleButton voIPToggleButton2 = new VoIPToggleButton(context);
        this.cameraButton = voIPToggleButton2;
        voIPToggleButton2.setCheckable(true);
        this.cameraButton.setTextSize(12);
        this.cameraButton.showText(false, false);
        this.cameraButton.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        this.cameraButton.setVisibility(8);
        this.buttonsContainer.addView(this.cameraButton, LayoutHelper.createFrame(68, 80.0f));
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(context);
        this.flipButton = voIPToggleButton3;
        voIPToggleButton3.setCheckable(true);
        this.flipButton.setTextSize(12);
        this.flipButton.showText(false, false);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.flipButton.addView(rLottieImageView, LayoutHelper.createFrame(32, 32.0f, 0, 18.0f, 10.0f, 18.0f, 0.0f));
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.camera_flip, "2131558414", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.flipIcon = rLottieDrawable;
        rLottieImageView.setAnimation(rLottieDrawable);
        this.flipButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$16(view);
            }
        });
        this.flipButton.setVisibility(8);
        this.buttonsContainer.addView(this.flipButton, LayoutHelper.createFrame(68, 80.0f));
        VoIPToggleButton voIPToggleButton4 = new VoIPToggleButton(context);
        this.leaveButton = voIPToggleButton4;
        voIPToggleButton4.setDrawBackground(false);
        this.leaveButton.setTextSize(12);
        this.leaveButton.setData((this.call == null || !isRtmpStream()) ? R.drawable.calls_decline : R.drawable.msg_voiceclose, -1, Theme.getColor("voipgroup_leaveButton"), 0.3f, false, LocaleController.getString("VoipGroupLeave", R.string.VoipGroupLeave), false, false);
        this.buttonsContainer.addView(this.leaveButton, LayoutHelper.createFrame(68, 80.0f));
        this.leaveButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$17(context, view);
            }
        });
        RLottieImageView rLottieImageView2 = new RLottieImageView(context) { // from class: org.telegram.ui.GroupCallActivity.18
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
                            GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        }
                        GroupCallActivity.this.attachedRenderersTmp.clear();
                        GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                        for (int i4 = 0; i4 < GroupCallActivity.this.attachedRenderersTmp.size(); i4++) {
                            ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i4)).updateAttachState(true);
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
                if (GroupCallActivity.this.muteButtonState != 1 || Build.VERSION.SDK_INT < 21) {
                    return;
                }
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("VoipMute", R.string.VoipMute)));
            }
        };
        this.muteButton = rLottieImageView2;
        rLottieImageView2.setAnimation(this.bigMicDrawable);
        this.muteButton.setScaleType(ImageView.ScaleType.CENTER);
        this.buttonsContainer.addView(this.muteButton, LayoutHelper.createFrame(122, 122, 49));
        this.muteButton.setOnClickListener(new AnonymousClass19());
        int dp = AndroidUtilities.dp(38.0f);
        ImageView imageView = new ImageView(context);
        this.expandButton = imageView;
        imageView.setScaleX(0.1f);
        this.expandButton.setScaleY(0.1f);
        this.expandButton.setAlpha(0.0f);
        this.expandButton.setImageResource(R.drawable.voice_expand);
        this.expandButton.setPadding(dp, dp, dp, dp);
        this.buttonsContainer.addView(this.expandButton, LayoutHelper.createFrame(122, 122, 49));
        ImageView imageView2 = new ImageView(context);
        this.minimizeButton = imageView2;
        imageView2.setScaleX(0.1f);
        this.minimizeButton.setScaleY(0.1f);
        this.minimizeButton.setAlpha(0.0f);
        this.minimizeButton.setImageResource(R.drawable.voice_minimize);
        this.minimizeButton.setPadding(dp, dp, dp, dp);
        this.buttonsContainer.addView(this.minimizeButton, LayoutHelper.createFrame(122, 122, 49));
        if (this.call != null && isRtmpStream() && !this.call.isScheduled()) {
            this.expandButton.setAlpha(1.0f);
            this.expandButton.setScaleX(1.0f);
            this.expandButton.setScaleY(1.0f);
            this.muteButton.setAlpha(0.0f);
        }
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(110.0f));
        this.radialProgressView.setStrokeWidth(4.0f);
        this.radialProgressView.setProgressColor(Theme.getColor("voipgroup_connectingProgress"));
        for (int i4 = 0; i4 < 2; i4++) {
            this.muteLabel[i4] = new TextView(context);
            this.muteLabel[i4].setTextColor(Theme.getColor("voipgroup_actionBarItems"));
            this.muteLabel[i4].setTextSize(1, 18.0f);
            this.muteLabel[i4].setGravity(1);
            this.buttonsContainer.addView(this.muteLabel[i4], LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 26.0f));
        }
        this.actionBar.setAlpha(0.0f);
        this.actionBar.getBackButton().setScaleX(0.9f);
        this.actionBar.getBackButton().setScaleY(0.9f);
        this.actionBar.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        this.actionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        this.actionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        this.actionBar.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, Theme.getColor("voipgroup_actionBarItems"));
        this.otherItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        this.otherItem.setIcon(R.drawable.ic_ab_other);
        this.otherItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.otherItem.setSubMenuOpenSide(2);
        this.otherItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda55
            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemDelegate
            public final void onItemClick(int i5) {
                GroupCallActivity.this.lambda$new$18(i5);
            }
        });
        this.otherItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("voipgroup_actionBarItemsSelector"), 6));
        this.otherItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$19(context, view);
            }
        });
        this.otherItem.setPopupItemsColor(Theme.getColor("voipgroup_actionBarItems"), false);
        this.otherItem.setPopupItemsColor(Theme.getColor("voipgroup_actionBarItems"), true);
        ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context, null, 0, Theme.getColor("voipgroup_actionBarItems"));
        this.pipItem = actionBarMenuItem2;
        actionBarMenuItem2.setLongClickEnabled(false);
        this.pipItem.setIcon((this.call == null || !isRtmpStream()) ? R.drawable.msg_voice_pip : R.drawable.ic_goinline);
        this.pipItem.setContentDescription(LocaleController.getString("AccDescrPipMode", R.string.AccDescrPipMode));
        this.pipItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("voipgroup_actionBarItemsSelector"), 6));
        this.pipItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$20(view);
            }
        });
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, null, 0, Theme.getColor("voipgroup_actionBarItems"));
        this.screenShareItem = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        this.screenShareItem.setIcon(R.drawable.msg_screencast);
        this.screenShareItem.setContentDescription(LocaleController.getString("AccDescrPipMode", R.string.AccDescrPipMode));
        this.screenShareItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("voipgroup_actionBarItemsSelector"), 6));
        this.screenShareItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$21(view);
            }
        });
        this.titleTextView = new AnonymousClass20(context, context);
        View view = new View(this, context) { // from class: org.telegram.ui.GroupCallActivity.21
            @Override // android.view.View
            protected void onMeasure(int i5, int i6) {
                setMeasuredDimension(View.MeasureSpec.getSize(i5), ActionBar.getCurrentActionBarHeight());
            }
        };
        this.actionBarBackground = view;
        view.setAlpha(0.0f);
        this.containerView.addView(this.actionBarBackground, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.menuItemsContainer = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(this.screenShareItem, LayoutHelper.createLinear(48, 48));
        linearLayout.addView(this.pipItem, LayoutHelper.createLinear(48, 48));
        linearLayout.addView(this.otherItem, LayoutHelper.createLinear(48, 48));
        this.containerView.addView(linearLayout, LayoutHelper.createFrame(-2, 48, 53));
        View view2 = new View(context);
        this.actionBarShadow = view2;
        view2.setAlpha(0.0f);
        this.actionBarShadow.setBackgroundColor(Theme.getColor("dialogShadowLine"));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(-1, 1.0f));
        for (int i5 = 0; i5 < 2; i5++) {
            this.undoView[i5] = new UndoView(context) { // from class: org.telegram.ui.GroupCallActivity.22
                @Override // org.telegram.ui.Components.UndoView
                public void showWithAction(long j, int i6, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
                    if (GroupCallActivity.this.previewDialog != null) {
                        return;
                    }
                    super.showWithAction(j, i6, obj, obj2, runnable, runnable2);
                }
            };
            this.undoView[i5].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            if (Build.VERSION.SDK_INT >= 21) {
                this.undoView[i5].setTranslationZ(AndroidUtilities.dp(5.0f));
            }
            this.containerView.addView(this.undoView[i5], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        AccountSelectCell accountSelectCell = new AccountSelectCell(context, true);
        this.accountSelectCell = accountSelectCell;
        accountSelectCell.setTag(R.id.width_tag, 240);
        this.otherItem.addSubItem(8, this.accountSelectCell, -2, AndroidUtilities.dp(48.0f));
        this.otherItem.setShowSubmenuByMove(false);
        this.accountSelectCell.setBackground(Theme.createRadSelectorDrawable(Theme.getColor("voipgroup_listSelector"), 6, 6));
        this.accountGap = this.otherItem.addGap(0);
        ActionBarMenuSubItem addSubItem = this.otherItem.addSubItem(1, 0, (CharSequence) LocaleController.getString("VoipGroupAllCanSpeak", R.string.VoipGroupAllCanSpeak), true);
        this.everyoneItem = addSubItem;
        addSubItem.updateSelectorBackground(true, false);
        ActionBarMenuSubItem addSubItem2 = this.otherItem.addSubItem(2, 0, (CharSequence) LocaleController.getString("VoipGroupOnlyAdminsCanSpeak", R.string.VoipGroupOnlyAdminsCanSpeak), true);
        this.adminItem = addSubItem2;
        addSubItem2.updateSelectorBackground(false, true);
        this.everyoneItem.setCheckColor("voipgroup_checkMenu");
        this.everyoneItem.setColors(Theme.getColor("voipgroup_checkMenu"), Theme.getColor("voipgroup_checkMenu"));
        this.adminItem.setCheckColor("voipgroup_checkMenu");
        this.adminItem.setColors(Theme.getColor("voipgroup_checkMenu"), Theme.getColor("voipgroup_checkMenu"));
        Paint paint2 = new Paint(1);
        paint2.setColor(Theme.getColor("voipgroup_actionBarItems"));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        ActionBarMenuSubItem addSubItem3 = this.otherItem.addSubItem(10, R.drawable.msg_voice_speaker, null, LocaleController.getString("VoipGroupAudio", R.string.VoipGroupAudio), true, false);
        this.soundItem = addSubItem3;
        addSubItem3.setItemHeight(56);
        ActionBarMenuSubItem addSubItem4 = this.otherItem.addSubItem(11, R.drawable.msg_noise_on, null, LocaleController.getString("VoipNoiseCancellation", R.string.VoipNoiseCancellation), true, false);
        this.noiseItem = addSubItem4;
        addSubItem4.setItemHeight(56);
        View addDivider = this.otherItem.addDivider(ColorUtils.blendARGB(Theme.getColor("voipgroup_actionBar"), -16777216, 0.3f));
        this.soundItemDivider = addDivider;
        ((ViewGroup.MarginLayoutParams) addDivider.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.soundItemDivider.getLayoutParams()).bottomMargin = 0;
        ActionBarMenuItem actionBarMenuItem4 = this.otherItem;
        RecordCallDrawable recordCallDrawable = this.recordCallDrawable;
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            i = R.string.VoipChannelEditTitle;
            str2 = "VoipChannelEditTitle";
        } else {
            i = R.string.VoipGroupEditTitle;
            str2 = "VoipGroupEditTitle";
        }
        this.editTitleItem = actionBarMenuItem4.addSubItem(6, R.drawable.msg_edit, recordCallDrawable, LocaleController.getString(str2, i), true, false);
        this.permissionItem = this.otherItem.addSubItem(7, R.drawable.msg_permissions, this.recordCallDrawable, LocaleController.getString("VoipGroupEditPermissions", R.string.VoipGroupEditPermissions), false, false);
        this.inviteItem = this.otherItem.addSubItem(3, R.drawable.msg_link, LocaleController.getString("VoipGroupShareInviteLink", R.string.VoipGroupShareInviteLink));
        this.recordCallDrawable = new RecordCallDrawable();
        this.screenItem = this.otherItem.addSubItem(9, R.drawable.msg_screencast, LocaleController.getString("VoipChatStartScreenCapture", R.string.VoipChatStartScreenCapture));
        ActionBarMenuSubItem addSubItem5 = this.otherItem.addSubItem(5, 0, this.recordCallDrawable, LocaleController.getString("VoipGroupRecordCall", R.string.VoipGroupRecordCall), true, false);
        this.recordItem = addSubItem5;
        this.recordCallDrawable.setParentView(addSubItem5.getImageView());
        ActionBarMenuItem actionBarMenuItem5 = this.otherItem;
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            i2 = R.string.VoipChannelEndChat;
            str3 = "VoipChannelEndChat";
        } else {
            i2 = R.string.VoipGroupEndChat;
            str3 = "VoipGroupEndChat";
        }
        this.leaveItem = actionBarMenuItem5.addSubItem(4, R.drawable.msg_endcall, LocaleController.getString(str3, i2));
        this.otherItem.setPopupItemsSelectorColor(Theme.getColor("voipgroup_listSelector"));
        this.otherItem.getPopupLayout().setFitItems(true);
        this.soundItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
        this.noiseItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
        this.leaveItem.setColors(Theme.getColor("voipgroup_leaveCallMenu"), Theme.getColor("voipgroup_leaveCallMenu"));
        this.inviteItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
        this.editTitleItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
        this.permissionItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
        this.recordItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
        this.screenItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
        if (this.call != null) {
            initCreatedGroupCall();
        }
        this.leaveBackgroundPaint.setColor(Theme.getColor("voipgroup_leaveButton"));
        updateTitle(false);
        this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                GroupCallActivity.this.lambda$new$22(view3);
            }
        });
        this.fullscreenUsersListView = new RecyclerListView(context) { // from class: org.telegram.ui.GroupCallActivity.23
            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public boolean drawChild(Canvas canvas, View view3, long j) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view3;
                if (!GroupCallActivity.this.renderersContainer.isAnimating() && !GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                    groupCallUserCell.setAlpha(1.0f);
                    groupCallUserCell.setTranslationX(0.0f);
                    groupCallUserCell.setTranslationY(0.0f);
                }
                if (!groupCallUserCell.isRemoving(GroupCallActivity.this.fullscreenUsersListView) || groupCallUserCell.getRenderer() == null) {
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
                return true;
            }
        };
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() { // from class: org.telegram.ui.GroupCallActivity.24
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
        this.fullscreenUsersListView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.GroupCallActivity.25
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                super.onScrolled(recyclerView, i6, i7);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
            }
        });
        this.fullscreenUsersListView.setClipChildren(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        this.fullscreenUsersListView.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView5 = this.fullscreenUsersListView;
        GroupCallFullscreenAdapter groupCallFullscreenAdapter = new GroupCallFullscreenAdapter(call, this.currentAccount, this);
        this.fullscreenAdapter = groupCallFullscreenAdapter;
        recyclerListView5.setAdapter(groupCallFullscreenAdapter);
        this.fullscreenAdapter.setVisibility(this.fullscreenUsersListView, false);
        this.fullscreenUsersListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda61
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view3, int i6) {
                GroupCallActivity.this.lambda$new$23(view3, i6);
            }
        });
        this.fullscreenUsersListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda65
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view3, int i6) {
                boolean lambda$new$24;
                lambda$new$24 = GroupCallActivity.this.lambda$new$24(view3, i6);
                return lambda$new$24;
            }
        });
        this.fullscreenUsersListView.setVisibility(8);
        this.fullscreenUsersListView.addItemDecoration(new RecyclerView.ItemDecoration(this) { // from class: org.telegram.ui.GroupCallActivity.26
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
        AnonymousClass27 anonymousClass27 = new AnonymousClass27(context, this.listView, this.fullscreenUsersListView, this.attachedRenderers, this.call, this);
        this.renderersContainer = anonymousClass27;
        anonymousClass27.setClipChildren(false);
        this.fullscreenAdapter.setRenderersPool(this.attachedRenderers, this.renderersContainer);
        if (this.tabletVideoGridView != null) {
            this.tabletGridAdapter.setRenderersPool(this.attachedRenderers, this.renderersContainer);
        }
        AvatarPreviewPagerIndicator avatarPreviewPagerIndicator = new AvatarPreviewPagerIndicator(context);
        this.avatarPagerIndicator = avatarPreviewPagerIndicator;
        ProfileGalleryView profileGalleryView = new ProfileGalleryView(context, this.actionBar, this.listView, avatarPreviewPagerIndicator) { // from class: org.telegram.ui.GroupCallActivity.28
            @Override // android.view.View
            public void invalidate() {
                super.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        };
        this.avatarsViewPager = profileGalleryView;
        profileGalleryView.setImagesLayerNum(8192);
        profileGalleryView.setInvalidateWithParent(true);
        avatarPreviewPagerIndicator.setProfileGalleryView(profileGalleryView);
        FrameLayout frameLayout2 = new FrameLayout(context) { // from class: org.telegram.ui.GroupCallActivity.29
            Rect rect = new Rect();
            RectF rectF = new RectF();
            Path path = new Path();

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i6, int i7) {
                int min = Math.min(View.MeasureSpec.getSize(i6), View.MeasureSpec.getSize(i7));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min + getPaddingBottom(), 1073741824));
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                    if (GroupCallActivity.this.scrimView == null || !GroupCallActivity.this.hasScrimAnchorView) {
                        if (GroupCallActivity.this.scrimFullscreenView != null && GroupCallActivity.this.scrimRenderer == null && GroupCallActivity.this.previewTextureTransitionEnabled) {
                            canvas.save();
                            float measuredHeight = (GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight());
                            int dp2 = (int) (((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight) + (AndroidUtilities.dp(13.0f) * GroupCallActivity.this.progressToAvatarPreview));
                            int i6 = (int) (measuredHeight * (1.0f - GroupCallActivity.this.progressToAvatarPreview));
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(dp2, dp2, i6, i6);
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().draw(canvas);
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        float measuredHeight2 = (GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight());
                        int dp3 = (int) (((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight2) + (AndroidUtilities.dp(13.0f) * GroupCallActivity.this.progressToAvatarPreview));
                        int i7 = (int) (measuredHeight2 * (1.0f - GroupCallActivity.this.progressToAvatarPreview));
                        GroupCallActivity.this.scrimView.getAvatarWavesDrawable().draw(canvas, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, this);
                        GroupCallActivity.this.scrimView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        GroupCallActivity.this.scrimView.getAvatarImageView().setRoundRadius(dp3, dp3, i7, i7);
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
                    int i8 = this.rect.left;
                    if (i8 < (-GroupCallActivity.this.avatarsViewPager.getMeasuredWidth())) {
                        i8 += GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    } else if (i8 > GroupCallActivity.this.avatarsViewPager.getMeasuredWidth()) {
                        i8 -= GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    }
                    canvas.translate(i8, 0.0f);
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
        this.avatarPreviewContainer = frameLayout2;
        frameLayout2.setVisibility(8);
        profileGalleryView.setVisibility(0);
        profileGalleryView.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: org.telegram.ui.GroupCallActivity.30
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i6) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i6, float f, int i7) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i6) {
                GroupCallActivity.this.avatarsViewPager.getRealPosition(i6);
                GroupCallActivity.this.avatarPagerIndicator.saveCurrentPageProgress();
                GroupCallActivity.this.avatarPagerIndicator.invalidate();
            }
        });
        this.blurredView = new View(context) { // from class: org.telegram.ui.GroupCallActivity.31
            @Override // android.view.View
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    GroupCallActivity.this.checkContentOverlayed();
                }
            }
        };
        this.containerView.addView(this.renderersContainer);
        this.renderersContainer.addView(this.fullscreenUsersListView, LayoutHelper.createFrame(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.buttonsContainer.setWillNotDraw(false);
        View view3 = new View(context);
        this.buttonsBackgroundGradientView = view3;
        int[] iArr = this.gradientColors;
        iArr[0] = this.backgroundColor;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.gradientColors);
        this.buttonsBackgroundGradient = gradientDrawable;
        view3.setBackground(gradientDrawable);
        this.containerView.addView(view3, LayoutHelper.createFrame(-1, 60, 83));
        View view4 = new View(context);
        this.buttonsBackgroundGradientView2 = view4;
        view4.setBackgroundColor(this.gradientColors[0]);
        this.containerView.addView(view4, LayoutHelper.createFrame(-1, 0, 83));
        this.containerView.addView(this.buttonsContainer, LayoutHelper.createFrame(-1, 200, 81));
        this.containerView.addView(this.blurredView);
        frameLayout2.addView(profileGalleryView, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout2.addView(avatarPreviewPagerIndicator, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        applyCallParticipantUpdates(false);
        this.listAdapter.notifyDataSetChanged();
        if (isTabletMode) {
            this.tabletGridAdapter.update(false, this.tabletVideoGridView);
        }
        this.oldCount = this.listAdapter.getItemCount();
        if (tLRPC$InputPeer != null) {
            TextView textView = new TextView(context);
            this.scheduleInfoTextView = textView;
            textView.setGravity(17);
            this.scheduleInfoTextView.setTextColor(-8682615);
            this.scheduleInfoTextView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup) {
                this.scheduleInfoTextView.setTag(1);
            }
            this.containerView.addView(this.scheduleInfoTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            final NumberPicker numberPicker = new NumberPicker(context);
            numberPicker.setTextColor(-1);
            numberPicker.setSelectorColor(-9598483);
            numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
            numberPicker.setItemCount(5);
            final NumberPicker numberPicker2 = new NumberPicker(this, context) { // from class: org.telegram.ui.GroupCallActivity.32
                @Override // org.telegram.ui.Components.NumberPicker
                protected CharSequence getContentDescription(int i6) {
                    return LocaleController.formatPluralString("Hours", i6, new Object[0]);
                }
            };
            numberPicker2.setItemCount(5);
            numberPicker2.setTextColor(-1);
            numberPicker2.setSelectorColor(-9598483);
            numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
            final NumberPicker numberPicker3 = new NumberPicker(this, context) { // from class: org.telegram.ui.GroupCallActivity.33
                @Override // org.telegram.ui.Components.NumberPicker
                protected CharSequence getContentDescription(int i6) {
                    return LocaleController.formatPluralString("Minutes", i6, new Object[0]);
                }
            };
            numberPicker3.setItemCount(5);
            numberPicker3.setTextColor(-1);
            numberPicker3.setSelectorColor(-9598483);
            numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
            TextView textView2 = new TextView(context);
            this.scheduleButtonTextView = textView2;
            textView2.setLines(1);
            this.scheduleButtonTextView.setSingleLine(true);
            this.scheduleButtonTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.scheduleButtonTextView.setGravity(17);
            this.scheduleButtonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), 0, 1056964608));
            this.scheduleButtonTextView.setTextColor(-1);
            this.scheduleButtonTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.scheduleButtonTextView.setTextSize(1, 14.0f);
            this.containerView.addView(this.scheduleButtonTextView, LayoutHelper.createFrame(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            final TLRPC$InputPeer tLRPC$InputPeer2 = groupCallPeer;
            this.scheduleButtonTextView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    GroupCallActivity.this.lambda$new$29(numberPicker, numberPicker2, numberPicker3, tLRPC$Chat, accountInstance, tLRPC$InputPeer2, view5);
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(this, context) { // from class: org.telegram.ui.GroupCallActivity.35
                boolean ignoreLayout = false;

                @Override // android.widget.LinearLayout, android.view.View
                protected void onMeasure(int i6, int i7) {
                    this.ignoreLayout = true;
                    numberPicker.setItemCount(5);
                    numberPicker2.setItemCount(5);
                    numberPicker3.setItemCount(5);
                    numberPicker.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker3.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    this.ignoreLayout = false;
                    super.onMeasure(i6, i7);
                }

                @Override // android.view.View, android.view.ViewParent
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.scheduleTimerContainer = linearLayout2;
            linearLayout2.setWeightSum(1.0f);
            this.scheduleTimerContainer.setOrientation(0);
            this.containerView.addView(this.scheduleTimerContainer, LayoutHelper.createFrame(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            final long currentTimeMillis = System.currentTimeMillis();
            final Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i6 = 1;
            final int i7 = calendar.get(1);
            int i8 = calendar.get(6);
            this.scheduleTimerContainer.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(365);
            numberPicker.setWrapSelectorWheel(false);
            numberPicker.setFormatter(new NumberPicker.Formatter() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda57
                @Override // org.telegram.ui.Components.NumberPicker.Formatter
                public final String format(int i9) {
                    String lambda$new$30;
                    lambda$new$30 = GroupCallActivity.lambda$new$30(currentTimeMillis, calendar, i7, i9);
                    return lambda$new$30;
                }
            });
            NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda60
                @Override // org.telegram.ui.Components.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker4, int i9, int i10) {
                    GroupCallActivity.this.lambda$new$31(numberPicker, numberPicker2, numberPicker3, numberPicker4, i9, i10);
                }
            };
            numberPicker.setOnValueChangedListener(onValueChangeListener);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(23);
            this.scheduleTimerContainer.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
            numberPicker2.setFormatter(GroupCallActivity$$ExternalSyntheticLambda58.INSTANCE);
            numberPicker2.setOnValueChangedListener(onValueChangeListener);
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(59);
            numberPicker3.setValue(0);
            numberPicker3.setFormatter(GroupCallActivity$$ExternalSyntheticLambda59.INSTANCE);
            this.scheduleTimerContainer.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
            numberPicker3.setOnValueChangedListener(onValueChangeListener);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i9 = calendar.get(6);
            int i10 = calendar.get(12);
            int i11 = calendar.get(11);
            numberPicker.setValue(i8 == i9 ? 0 : i6);
            numberPicker3.setValue(i10);
            numberPicker2.setValue(i11);
            AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            viewGroup = (ViewGroup) getWindow().getDecorView();
        } else {
            viewGroup = this.containerView;
        }
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper(viewGroup, this.containerView) { // from class: org.telegram.ui.GroupCallActivity.36
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.ui.PinchToZoomHelper
            public void invalidateViews() {
                super.invalidateViews();
                for (int i12 = 0; i12 < GroupCallActivity.this.avatarsViewPager.getChildCount(); i12++) {
                    GroupCallActivity.this.avatarsViewPager.getChildAt(i12).invalidate();
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
        pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() { // from class: org.telegram.ui.GroupCallActivity.37
            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public /* synthetic */ TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
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
        this.cameraButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda24
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                GroupCallActivity.this.lambda$new$34(context, view5);
            }
        });
        updateScheduleUI(false);
        updateItems();
        updateSpeakerPhoneIcon(false);
        updateState(false, false);
        setColorProgress(0.0f);
        updateSubtitle();
    }

    public /* synthetic */ void lambda$new$9(DialogInterface dialogInterface) {
        BaseFragment baseFragment = this.parentActivity.getActionBarLayout().fragmentsStack.get(this.parentActivity.getActionBarLayout().fragmentsStack.size() - 1);
        if (!this.anyEnterEventSent || !(baseFragment instanceof ChatActivity)) {
            return;
        }
        ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
    }

    /* renamed from: org.telegram.ui.GroupCallActivity$6 */
    /* loaded from: classes3.dex */
    public class AnonymousClass6 extends ActionBar.ActionBarMenuOnItemClick {
        final /* synthetic */ Context val$context;

        public static /* synthetic */ void lambda$onItemClick$8(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        AnonymousClass6(Context context) {
            GroupCallActivity.this = r1;
            this.val$context = context;
        }

        @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
        public void onItemClick(int i) {
            final VoIPService sharedInstance;
            int i2;
            int i3;
            String str;
            int i4;
            if (i == -1) {
                GroupCallActivity.this.onBackPressed();
                return;
            }
            if (i == 1) {
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.call.call.join_muted = false;
                groupCallActivity.toggleAdminSpeak();
            } else if (i == 2) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.call.call.join_muted = true;
                groupCallActivity2.toggleAdminSpeak();
            } else if (i == 3) {
                GroupCallActivity.this.getLink(false);
            } else if (i == 4) {
                AlertDialog.Builder builder = new AlertDialog.Builder(GroupCallActivity.this.getContext());
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder.setTitle(LocaleController.getString("VoipChannelEndAlertTitle", R.string.VoipChannelEndAlertTitle));
                    builder.setMessage(LocaleController.getString("VoipChannelEndAlertText", R.string.VoipChannelEndAlertText));
                } else {
                    builder.setTitle(LocaleController.getString("VoipGroupEndAlertTitle", R.string.VoipGroupEndAlertTitle));
                    builder.setMessage(LocaleController.getString("VoipGroupEndAlertText", R.string.VoipGroupEndAlertText));
                }
                builder.setDialogButtonColorKey("voipgroup_listeningText");
                builder.setPositiveButton(LocaleController.getString("VoipGroupEnd", R.string.VoipGroupEnd), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$1(dialogInterface, i5);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog create = builder.create();
                create.setBackgroundColor(Theme.getColor("voipgroup_dialogBackground"));
                create.show();
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("voipgroup_leaveCallMenu"));
                }
                create.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
            } else if (i == 9) {
                GroupCallActivity.this.screenShareItem.callOnClick();
            } else if (i == 5) {
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                ChatObject.Call call = groupCallActivity3.call;
                if (call.recording) {
                    final boolean z = call.call.record_video_active;
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(groupCallActivity3.getContext());
                    builder2.setDialogButtonColorKey("voipgroup_listeningText");
                    builder2.setTitle(LocaleController.getString("VoipGroupStopRecordingTitle", R.string.VoipGroupStopRecordingTitle));
                    if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                        builder2.setMessage(LocaleController.getString("VoipChannelStopRecordingText", R.string.VoipChannelStopRecordingText));
                    } else {
                        builder2.setMessage(LocaleController.getString("VoipGroupStopRecordingText", R.string.VoipGroupStopRecordingText));
                    }
                    builder2.setPositiveButton(LocaleController.getString("Stop", R.string.Stop), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda4
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$2(z, dialogInterface, i5);
                        }
                    });
                    builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    AlertDialog create2 = builder2.create();
                    create2.setBackgroundColor(Theme.getColor("voipgroup_dialogBackground"));
                    create2.show();
                    create2.setTextColor(Theme.getColor("voipgroup_nameText"));
                    return;
                }
                Context context = GroupCallActivity.this.getContext();
                GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, groupCallActivity4.currentChat, groupCallActivity4.hasVideo);
                if (GroupCallActivity.this.isRtmpStream()) {
                    anonymousClass1.onStartRecord(2);
                } else {
                    anonymousClass1.show();
                }
            } else if (i == 7) {
                GroupCallActivity.this.changingPermissions = true;
                GroupCallActivity.this.everyoneItem.setVisibility(0);
                GroupCallActivity.this.adminItem.setVisibility(0);
                GroupCallActivity.this.accountGap.setVisibility(8);
                GroupCallActivity.this.inviteItem.setVisibility(8);
                GroupCallActivity.this.leaveItem.setVisibility(8);
                GroupCallActivity.this.permissionItem.setVisibility(8);
                GroupCallActivity.this.editTitleItem.setVisibility(8);
                GroupCallActivity.this.recordItem.setVisibility(8);
                GroupCallActivity.this.screenItem.setVisibility(8);
                GroupCallActivity.this.accountSelectCell.setVisibility(8);
                GroupCallActivity.this.soundItem.setVisibility(8);
                GroupCallActivity.this.noiseItem.setVisibility(8);
                GroupCallActivity.this.otherItem.forceUpdatePopupPosition();
            } else if (i == 6) {
                GroupCallActivity.this.enterEventSent = false;
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(GroupCallActivity.this.getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(GroupCallActivity.this.getContext(), true));
                final AlertDialog.Builder builder3 = new AlertDialog.Builder(GroupCallActivity.this.getContext());
                builder3.setDialogButtonColorKey("voipgroup_listeningText");
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder3.setTitle(LocaleController.getString("VoipChannelTitle", R.string.VoipChannelTitle));
                } else {
                    builder3.setTitle(LocaleController.getString("VoipGroupTitle", R.string.VoipGroupTitle));
                }
                builder3.setCheckFocusable(false);
                builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                LinearLayout linearLayout = new LinearLayout(GroupCallActivity.this.getContext());
                linearLayout.setOrientation(1);
                builder3.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(Theme.getColor("voipgroup_nameText"));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setHint(GroupCallActivity.this.currentChat.title);
                editTextBoldCursor.setHintTextColor(Theme.getColor("voipgroup_lastSeenText"));
                editTextBoldCursor.setCursorColor(Theme.getColor("voipgroup_nameText"));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda7
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView2, int i5, KeyEvent keyEvent) {
                        boolean lambda$onItemClick$4;
                        lambda$onItemClick$4 = GroupCallActivity.AnonymousClass6.lambda$onItemClick$4(AlertDialog.Builder.this, textView2, i5, keyEvent);
                        return lambda$onItemClick$4;
                    }
                });
                editTextBoldCursor.addTextChangedListener(new TextWatcher(this) { // from class: org.telegram.ui.GroupCallActivity.6.2
                    boolean ignoreTextChange;

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        if (!this.ignoreTextChange && editable.length() > 40) {
                            this.ignoreTextChange = true;
                            editable.delete(40, editable.length());
                            AndroidUtilities.shakeView(editTextBoldCursor, 2.0f, 0);
                            editTextBoldCursor.performHapticFeedback(3, 2);
                            this.ignoreTextChange = false;
                        }
                    }
                });
                if (!TextUtils.isEmpty(GroupCallActivity.this.call.call.title)) {
                    editTextBoldCursor.setText(GroupCallActivity.this.call.call.title);
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
                builder3.setPositiveButton(LocaleController.getString("Save", R.string.Save), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$5(editTextBoldCursor, builder3, dialogInterface, i5);
                    }
                });
                final AlertDialog create3 = builder3.create();
                create3.setBackgroundColor(Theme.getColor("voipgroup_inviteMembersBackground"));
                create3.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda6
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$6(create3, editTextBoldCursor, dialogInterface);
                    }
                });
                create3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda5
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                create3.show();
                create3.setTextColor(Theme.getColor("voipgroup_nameText"));
                editTextBoldCursor.requestFocus();
            } else if (i == 8) {
                Context context2 = GroupCallActivity.this.getContext();
                GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                JoinCallAlert.open(context2, -groupCallActivity5.currentChat.id, groupCallActivity5.accountInstance, null, 2, GroupCallActivity.this.selfPeer, new JoinCallAlert.JoinCallAlertDelegate() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda10
                    @Override // org.telegram.ui.Components.JoinCallAlert.JoinCallAlertDelegate
                    public final void didSelectChat(TLRPC$InputPeer tLRPC$InputPeer, boolean z2, boolean z3) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$9(tLRPC$InputPeer, z2, z3);
                    }
                });
            } else if (i == 11) {
                SharedConfig.toggleNoiseSupression();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 == null) {
                    return;
                }
                sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            } else if (i == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString("VoipAudioRoutingSpeaker", R.string.VoipAudioRoutingSpeaker));
                arrayList2.add(Integer.valueOf((int) R.drawable.msg_voice_speaker));
                arrayList3.add(0);
                if (sharedInstance.hasEarpiece()) {
                    if (sharedInstance.isHeadsetPlugged()) {
                        i4 = R.string.VoipAudioRoutingHeadset;
                        str = "VoipAudioRoutingHeadset";
                    } else {
                        i4 = R.string.VoipAudioRoutingPhone;
                        str = "VoipAudioRoutingPhone";
                    }
                    arrayList.add(LocaleController.getString(str, i4));
                    arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
                    arrayList3.add(1);
                }
                if (sharedInstance.isBluetoothHeadsetConnected()) {
                    String str2 = sharedInstance.currentBluetoothDeviceName;
                    if (str2 == null) {
                        str2 = LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth);
                    }
                    arrayList.add(str2);
                    arrayList2.add(Integer.valueOf((int) R.drawable.msg_voice_bluetooth));
                    arrayList3.add(2);
                }
                int size = arrayList.size();
                CharSequence[] charSequenceArr = new CharSequence[size];
                int[] iArr = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    charSequenceArr[i5] = (CharSequence) arrayList.get(i5);
                    iArr[i5] = ((Integer) arrayList2.get(i5)).intValue();
                }
                BottomSheet.Builder items = new BottomSheet.Builder(this.val$context).setTitle(LocaleController.getString("VoipSelectAudioOutput", R.string.VoipSelectAudioOutput), true).setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        GroupCallActivity.AnonymousClass6.lambda$onItemClick$10(VoIPService.this, arrayList3, dialogInterface, i6);
                    }
                });
                BottomSheet create4 = items.create();
                create4.setBackgroundColor(Theme.getColor("voipgroup_listViewBackgroundUnscrolled"));
                create4.fixNavigationBar(Theme.getColor("voipgroup_listViewBackgroundUnscrolled"));
                if (sharedInstance.getCurrentAudioRoute() == 1) {
                    i2 = 0;
                } else {
                    i2 = sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
                }
                items.show();
                create4.setTitleColor(Theme.getColor("voipgroup_nameText"));
                for (int i6 = 0; i6 < create4.getItemViews().size(); i6++) {
                    BottomSheet.BottomSheetCell bottomSheetCell = create4.getItemViews().get(i6);
                    if (i6 == i2) {
                        i3 = Theme.getColor("voipgroup_listeningText");
                        bottomSheetCell.isSelected = true;
                    } else {
                        i3 = Theme.getColor("voipgroup_nameText");
                    }
                    bottomSheetCell.setTextColor(i3);
                    bottomSheetCell.setIconColor(i3);
                    bottomSheetCell.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor("voipgroup_actionBarItems"), 12), 2));
                }
            }
        }

        public /* synthetic */ void lambda$onItemClick$1(DialogInterface dialogInterface, int i) {
            if (GroupCallActivity.this.call.isScheduled()) {
                TLRPC$ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.currentChat.id);
                if (chatFull != null) {
                    chatFull.flags &= -2097153;
                    chatFull.call = null;
                    GroupCallActivity.this.accountInstance.getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(GroupCallActivity.this.currentChat.id), Long.valueOf(GroupCallActivity.this.call.call.id), Boolean.FALSE);
                }
                TLRPC$TL_phone_discardGroupCall tLRPC$TL_phone_discardGroupCall = new TLRPC$TL_phone_discardGroupCall();
                tLRPC$TL_phone_discardGroupCall.call = GroupCallActivity.this.call.getInputGroupCall();
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_discardGroupCall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda8
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$0(tLObject, tLRPC$TL_error);
                    }
                });
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().hangUp(1);
            }
            GroupCallActivity.this.dismiss();
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didStartedCall, new Object[0]);
        }

        public /* synthetic */ void lambda$onItemClick$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject instanceof TLRPC$TL_updates) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC$TL_updates) tLObject, false);
            }
        }

        public /* synthetic */ void lambda$onItemClick$2(boolean z, DialogInterface dialogInterface, int i) {
            GroupCallActivity.this.call.toggleRecord(null, 0);
            GroupCallActivity.this.getUndoView().showWithAction(0L, z ? FileLoader.MEDIA_DIR_VIDEO_PUBLIC : 40, (Runnable) null);
        }

        /* renamed from: org.telegram.ui.GroupCallActivity$6$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 extends GroupCallRecordAlert {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Context context, TLRPC$Chat tLRPC$Chat, boolean z) {
                super(context, tLRPC$Chat, z);
                AnonymousClass6.this = r1;
            }

            @Override // org.telegram.ui.Components.GroupCallRecordAlert
            public void onStartRecord(final int i) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setDialogButtonColorKey("voipgroup_listeningText");
                GroupCallActivity.this.enterEventSent = false;
                builder.setTitle(LocaleController.getString("VoipGroupStartRecordingTitle", R.string.VoipGroupStartRecordingTitle));
                if (i == 0) {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText));
                } else {
                    boolean isChannelOrGiga = ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat);
                    int i2 = R.string.VoipGroupStartRecordingRtmpVideoText;
                    if (isChannelOrGiga) {
                        if (!GroupCallActivity.this.call.call.rtmp_stream) {
                            i2 = R.string.VoipChannelStartRecordingVideoText;
                        }
                        builder.setMessage(LocaleController.getString(i2));
                    } else {
                        if (!GroupCallActivity.this.call.call.rtmp_stream) {
                            i2 = R.string.VoipGroupStartRecordingVideoText;
                        }
                        builder.setMessage(LocaleController.getString(i2));
                    }
                }
                builder.setCheckFocusable(false);
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(getContext(), Theme.getColor("voipgroup_windowBackgroundWhiteInputField"), Theme.getColor("voipgroup_windowBackgroundWhiteInputFieldActivated")));
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(Theme.getColor("voipgroup_nameText"));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setHint(LocaleController.getString("VoipGroupSaveFileHint", R.string.VoipGroupSaveFileHint));
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setHintTextColor(Theme.getColor("voipgroup_lastSeenText"));
                editTextBoldCursor.setCursorColor(Theme.getColor("voipgroup_nameText"));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 0, 24, 12));
                editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda4
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                        boolean lambda$onStartRecord$0;
                        lambda$onStartRecord$0 = GroupCallActivity.AnonymousClass6.AnonymousClass1.lambda$onStartRecord$0(AlertDialog.Builder.this, textView, i3, keyEvent);
                        return lambda$onStartRecord$0;
                    }
                });
                final AlertDialog create = builder.create();
                create.setBackgroundColor(Theme.getColor("voipgroup_inviteMembersBackground"));
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda3
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        GroupCallActivity.AnonymousClass6.AnonymousClass1.this.lambda$onStartRecord$1(create, editTextBoldCursor, dialogInterface);
                    }
                });
                create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda2
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                builder.setPositiveButton(LocaleController.getString("Start", R.string.Start), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        GroupCallActivity.AnonymousClass6.AnonymousClass1.this.lambda$onStartRecord$3(editTextBoldCursor, i, dialogInterface, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$6$1$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                AlertDialog create2 = builder.create();
                create2.setBackgroundColor(Theme.getColor("voipgroup_dialogBackground"));
                create2.show();
                create2.setTextColor(Theme.getColor("voipgroup_nameText"));
                editTextBoldCursor.requestFocus();
            }

            public static /* synthetic */ boolean lambda$onStartRecord$0(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
                AndroidUtilities.hideKeyboard(textView);
                builder.create().getButton(-1).callOnClick();
                return false;
            }

            public /* synthetic */ void lambda$onStartRecord$1(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
                GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
            }

            public /* synthetic */ void lambda$onStartRecord$3(EditTextBoldCursor editTextBoldCursor, int i, DialogInterface dialogInterface, int i2) {
                GroupCallActivity.this.call.toggleRecord(editTextBoldCursor.getText().toString(), i);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                GroupCallActivity.this.getUndoView().showWithAction(0L, i == 0 ? 39 : 100, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                }
            }
        }

        public static /* synthetic */ boolean lambda$onItemClick$4(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
            AndroidUtilities.hideKeyboard(textView);
            builder.create().getButton(-1).callOnClick();
            return false;
        }

        public /* synthetic */ void lambda$onItemClick$5(EditTextBoldCursor editTextBoldCursor, AlertDialog.Builder builder, DialogInterface dialogInterface, int i) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            GroupCallActivity.this.call.setTitle(editTextBoldCursor.getText().toString());
            builder.getDismissRunnable().run();
        }

        public /* synthetic */ void lambda$onItemClick$6(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
            GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
        }

        public /* synthetic */ void lambda$onItemClick$9(TLRPC$InputPeer tLRPC$InputPeer, boolean z, boolean z2) {
            TLObject chat;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null) {
                return;
            }
            boolean z3 = tLRPC$InputPeer instanceof TLRPC$TL_inputPeerUser;
            if (z3) {
                chat = groupCallActivity.accountInstance.getMessagesController().getUser(Long.valueOf(tLRPC$InputPeer.user_id));
            } else {
                chat = tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChat ? groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(tLRPC$InputPeer.chat_id)) : groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(tLRPC$InputPeer.channel_id));
            }
            TLObject tLObject = chat;
            if (GroupCallActivity.this.call.isScheduled()) {
                GroupCallActivity.this.getUndoView().showWithAction(0L, 37, tLObject, GroupCallActivity.this.currentChat, (Runnable) null, (Runnable) null);
                if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChannel) {
                    GroupCallActivity.this.selfPeer = new TLRPC$TL_peerChannel();
                    GroupCallActivity.this.selfPeer.channel_id = tLRPC$InputPeer.channel_id;
                } else if (z3) {
                    GroupCallActivity.this.selfPeer = new TLRPC$TL_peerUser();
                    GroupCallActivity.this.selfPeer.user_id = tLRPC$InputPeer.user_id;
                } else if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChat) {
                    GroupCallActivity.this.selfPeer = new TLRPC$TL_peerChat();
                    GroupCallActivity.this.selfPeer.chat_id = tLRPC$InputPeer.chat_id;
                }
                GroupCallActivity.this.schedulePeer = tLRPC$InputPeer;
                TLRPC$ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.currentChat.id);
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = GroupCallActivity.this.selfPeer;
                    if (chatFull instanceof TLRPC$TL_chatFull) {
                        chatFull.flags |= 32768;
                    } else {
                        chatFull.flags |= ConnectionsManager.FileTypeFile;
                    }
                }
                TLRPC$TL_phone_saveDefaultGroupCallJoinAs tLRPC$TL_phone_saveDefaultGroupCallJoinAs = new TLRPC$TL_phone_saveDefaultGroupCallJoinAs();
                tLRPC$TL_phone_saveDefaultGroupCallJoinAs.peer = MessagesController.getInputPeer(GroupCallActivity.this.currentChat);
                tLRPC$TL_phone_saveDefaultGroupCallJoinAs.join_as = tLRPC$InputPeer;
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_saveDefaultGroupCallJoinAs, GroupCallActivity$6$$ExternalSyntheticLambda9.INSTANCE);
                GroupCallActivity.this.updateItems();
            } else if (VoIPService.getSharedInstance() == null || !z) {
            } else {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.call.participants.get(MessageObject.getPeerId(groupCallActivity2.selfPeer));
                VoIPService.getSharedInstance().setGroupCallPeer(tLRPC$InputPeer);
                GroupCallActivity.this.userSwitchObject = tLObject;
            }
        }

        public static /* synthetic */ void lambda$onItemClick$10(VoIPService voIPService, ArrayList arrayList, DialogInterface dialogInterface, int i) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            voIPService.setAudioOutput(((Integer) arrayList.get(i)).intValue());
        }
    }

    public /* synthetic */ void lambda$new$10(int[] iArr, float[] fArr, boolean[] zArr) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        for (int i = 0; i < iArr.length; i++) {
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.call.participantsBySources.get(iArr[i]);
            if (tLRPC$TL_groupCallParticipant != null) {
                if (!this.renderersContainer.inFullscreenMode) {
                    int indexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(tLRPC$TL_groupCallParticipant);
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
                        if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer)) {
                            groupCallUserCell.setAmplitude(fArr[i] * 15.0f);
                        }
                    }
                }
                this.renderersContainer.setAmplitude(tLRPC$TL_groupCallParticipant, fArr[i] * 15.0f);
            }
        }
    }

    public /* synthetic */ void lambda$new$12(View view, int i, float f, float f2) {
        if (view instanceof GroupCallGridCell) {
            fullscreenFor(((GroupCallGridCell) view).getParticipant());
        } else if (view instanceof GroupCallUserCell) {
            showMenuForCell((GroupCallUserCell) view);
        } else if (view instanceof GroupCallInvitedCell) {
            GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) view;
            if (groupCallInvitedCell.getUser() == null) {
                return;
            }
            this.parentActivity.switchToAccount(this.currentAccount, true);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", groupCallInvitedCell.getUser().id);
            if (groupCallInvitedCell.hasAvatarSet()) {
                bundle.putBoolean("expandPhoto", true);
            }
            this.parentActivity.lambda$runLinkRequest$59(new ProfileActivity(bundle));
            dismiss();
        } else if (i != this.listAdapter.addMemberRow) {
        } else {
            if (ChatObject.isChannel(this.currentChat)) {
                TLRPC$Chat tLRPC$Chat = this.currentChat;
                if (!tLRPC$Chat.megagroup && !TextUtils.isEmpty(tLRPC$Chat.username)) {
                    getLink(false);
                    return;
                }
            }
            TLRPC$ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(this.currentChat.id);
            if (chatFull == null) {
                return;
            }
            this.enterEventSent = false;
            Context context = getContext();
            int currentAccount = this.accountInstance.getCurrentAccount();
            TLRPC$Chat tLRPC$Chat2 = this.currentChat;
            ChatObject.Call call = this.call;
            GroupVoipInviteAlert groupVoipInviteAlert = new GroupVoipInviteAlert(context, currentAccount, tLRPC$Chat2, chatFull, call.participants, call.invitedUsersMap);
            this.groupVoipInviteAlert = groupVoipInviteAlert;
            groupVoipInviteAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda10
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    GroupCallActivity.this.lambda$new$11(dialogInterface);
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
                    if (!GroupCallActivity.this.enterEventSent) {
                        if (motionEvent.getX() > editTextBoldCursor.getLeft() && motionEvent.getX() < editTextBoldCursor.getRight() && motionEvent.getY() > editTextBoldCursor.getTop() && motionEvent.getY() < editTextBoldCursor.getBottom()) {
                            GroupCallActivity groupCallActivity = GroupCallActivity.this;
                            groupCallActivity.makeFocusable(groupCallActivity.groupVoipInviteAlert, null, editTextBoldCursor, true);
                            return;
                        }
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        groupCallActivity2.makeFocusable(groupCallActivity2.groupVoipInviteAlert, null, editTextBoldCursor, false);
                    }
                }
            });
            this.groupVoipInviteAlert.show();
        }
    }

    public /* synthetic */ void lambda$new$11(DialogInterface dialogInterface) {
        this.groupVoipInviteAlert = null;
    }

    public /* synthetic */ boolean lambda$new$13(View view, int i) {
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

    public /* synthetic */ void lambda$new$14(View view, int i) {
        GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
        if (groupCallGridCell.getParticipant() != null) {
            fullscreenFor(groupCallGridCell.getParticipant());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.telegram.ui.GroupCallActivity$17 */
    /* loaded from: classes3.dex */
    public class AnonymousClass17 extends FrameLayout {
        AnimatorSet currentButtonsAnimation;
        int currentLightColor;
        final OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.5f);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass17(Context context) {
            super(context);
            GroupCallActivity.this = r1;
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            if (!GroupCallActivity.isLandscapeMode) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(460.0f), View.MeasureSpec.getSize(i)), 1073741824);
            }
            for (int i3 = 0; i3 < 2; i3++) {
                if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.muteLabel[i3].getLayoutParams().width = -2;
                } else {
                    GroupCallActivity.this.muteLabel[i3].getLayoutParams().width = (int) (View.MeasureSpec.getSize(i) / 0.68f);
                }
            }
            super.onMeasure(i, i2);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(122.0f)) / 2;
            int measuredHeight = getMeasuredHeight();
            int i5 = GroupCallActivity.this.cameraButton.getVisibility() != 0 ? 4 : 5;
            if (GroupCallActivity.this.soundButton.getVisibility() != 0) {
                i5--;
            }
            if (GroupCallActivity.this.flipButton.getVisibility() != 0) {
                i5--;
            }
            if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                if (GroupCallActivity.this.renderersContainer.inFullscreenMode && !GroupCallActivity.isTabletMode) {
                    int measuredWidth2 = getMeasuredWidth() / i5;
                    if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                        int i6 = measuredWidth2 / 2;
                        int measuredWidth3 = i6 - (GroupCallActivity.this.cameraButton.getMeasuredWidth() / 2);
                        int measuredHeight2 = getMeasuredHeight() - GroupCallActivity.this.cameraButton.getMeasuredHeight();
                        GroupCallActivity.this.cameraButton.layout(measuredWidth3, measuredHeight2, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth3, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i6 + (i5 == 4 ? measuredWidth2 : 0)) - (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2);
                        int measuredHeight3 = getMeasuredHeight() - GroupCallActivity.this.soundButton.getMeasuredHeight();
                        GroupCallActivity.this.soundButton.layout(measuredWidth4, measuredHeight3, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth4, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight3);
                    } else {
                        int i7 = measuredWidth2 / 2;
                        int measuredWidth5 = ((i5 == 4 ? measuredWidth2 : 0) + i7) - (GroupCallActivity.this.cameraButton.getMeasuredWidth() / 2);
                        int measuredHeight4 = getMeasuredHeight() - GroupCallActivity.this.cameraButton.getMeasuredHeight();
                        GroupCallActivity.this.cameraButton.layout(measuredWidth5, measuredHeight4, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth5, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight4);
                        int measuredWidth6 = i7 - (GroupCallActivity.this.flipButton.getMeasuredWidth() / 2);
                        int measuredHeight5 = getMeasuredHeight() - GroupCallActivity.this.flipButton.getMeasuredHeight();
                        GroupCallActivity.this.flipButton.layout(measuredWidth6, measuredHeight5, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth6, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight5);
                    }
                    int i8 = measuredWidth2 / 2;
                    int measuredWidth7 = ((i5 == 4 ? measuredWidth2 * 3 : measuredWidth2 * 2) + i8) - (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2);
                    int measuredHeight6 = getMeasuredHeight() - GroupCallActivity.this.leaveButton.getMeasuredHeight();
                    GroupCallActivity.this.leaveButton.layout(measuredWidth7, measuredHeight6, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth7, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight6);
                    int measuredWidth8 = (i8 + (i5 == 4 ? measuredWidth2 * 2 : measuredWidth2)) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2);
                    int measuredHeight7 = (getMeasuredHeight() - GroupCallActivity.this.leaveButton.getMeasuredHeight()) - ((GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2);
                    GroupCallActivity.this.muteButton.layout(measuredWidth8, measuredHeight7, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth8, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredHeight7);
                    GroupCallActivity.this.minimizeButton.layout(measuredWidth8, measuredHeight7, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth8, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredHeight7);
                    GroupCallActivity.this.expandButton.layout(measuredWidth8, measuredHeight7, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth8, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredHeight7);
                    float dp = AndroidUtilities.dp(52.0f) / (GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                    GroupCallActivity.this.muteButton.animate().scaleX(dp).scaleY(dp).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    for (int i9 = 0; i9 < 2; i9++) {
                        int measuredWidth9 = (i5 == 4 ? measuredWidth2 * 2 : measuredWidth2) + ((measuredWidth2 - GroupCallActivity.this.muteLabel[i9].getMeasuredWidth()) / 2);
                        int dp2 = measuredHeight - AndroidUtilities.dp(27.0f);
                        GroupCallActivity.this.muteLabel[i9].layout(measuredWidth9, dp2, GroupCallActivity.this.muteLabel[i9].getMeasuredWidth() + measuredWidth9, GroupCallActivity.this.muteLabel[i9].getMeasuredHeight() + dp2);
                        GroupCallActivity.this.muteLabel[i9].animate().scaleX(0.687f).scaleY(0.687f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                } else {
                    int dp3 = AndroidUtilities.dp(0.0f);
                    if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                        if (GroupCallActivity.this.cameraButton.getVisibility() == 0) {
                            int measuredWidth10 = (measuredWidth - GroupCallActivity.this.cameraButton.getMeasuredWidth()) / 2;
                            int measuredHeight8 = (measuredHeight - GroupCallActivity.this.cameraButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.cameraButton.layout(measuredWidth10, measuredHeight8, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth10, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight8);
                            int measuredWidth11 = (measuredWidth - GroupCallActivity.this.soundButton.getMeasuredWidth()) / 2;
                            int measuredHeight9 = (measuredHeight - GroupCallActivity.this.leaveButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.soundButton.layout(measuredWidth11, measuredHeight9, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth11, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight9);
                        } else {
                            int measuredWidth12 = (measuredWidth - GroupCallActivity.this.soundButton.getMeasuredWidth()) / 2;
                            int measuredHeight10 = (measuredHeight - GroupCallActivity.this.soundButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.soundButton.layout(measuredWidth12, measuredHeight10, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth12, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight10);
                        }
                    } else {
                        int dp4 = GroupCallActivity.this.flipButton.getVisibility() == 0 ? AndroidUtilities.dp(28.0f) : 0;
                        int measuredWidth13 = (measuredWidth - GroupCallActivity.this.flipButton.getMeasuredWidth()) / 2;
                        int measuredHeight11 = (((measuredHeight - GroupCallActivity.this.flipButton.getMeasuredHeight()) / 2) + dp3) - dp4;
                        GroupCallActivity.this.flipButton.layout(measuredWidth13, measuredHeight11, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth13, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight11);
                        int measuredWidth14 = (measuredWidth - GroupCallActivity.this.cameraButton.getMeasuredWidth()) / 2;
                        int measuredHeight12 = ((measuredHeight - GroupCallActivity.this.cameraButton.getMeasuredHeight()) / 2) + dp3 + dp4;
                        GroupCallActivity.this.cameraButton.layout(measuredWidth14, measuredHeight12, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth14, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight12);
                    }
                    int measuredHeight13 = ((measuredHeight - GroupCallActivity.this.leaveButton.getMeasuredHeight()) / 2) + dp3;
                    int measuredWidth15 = (getMeasuredWidth() - measuredWidth) + ((measuredWidth - GroupCallActivity.this.leaveButton.getMeasuredWidth()) / 2);
                    GroupCallActivity.this.leaveButton.layout(measuredWidth15, measuredHeight13, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth15, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight13);
                    int measuredWidth16 = (getMeasuredWidth() - GroupCallActivity.this.muteButton.getMeasuredWidth()) / 2;
                    int measuredHeight14 = ((measuredHeight - GroupCallActivity.this.muteButton.getMeasuredHeight()) / 2) - AndroidUtilities.dp(9.0f);
                    GroupCallActivity.this.muteButton.layout(measuredWidth16, measuredHeight14, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth16, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredHeight14);
                    GroupCallActivity.this.minimizeButton.layout(measuredWidth16, measuredHeight14, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth16, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredHeight14);
                    GroupCallActivity.this.expandButton.layout(measuredWidth16, measuredHeight14, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth16, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredHeight14);
                    GroupCallActivity.this.muteButton.animate().setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).scaleX(1.0f).scaleY(1.0f).start();
                    for (int i10 = 0; i10 < 2; i10++) {
                        int measuredWidth17 = (getMeasuredWidth() - GroupCallActivity.this.muteLabel[i10].getMeasuredWidth()) / 2;
                        int dp5 = (measuredHeight - AndroidUtilities.dp(12.0f)) - GroupCallActivity.this.muteLabel[i10].getMeasuredHeight();
                        GroupCallActivity.this.muteLabel[i10].layout(measuredWidth17, dp5, GroupCallActivity.this.muteLabel[i10].getMeasuredWidth() + measuredWidth17, GroupCallActivity.this.muteLabel[i10].getMeasuredHeight() + dp5);
                        GroupCallActivity.this.muteLabel[i10].animate().scaleX(1.0f).scaleY(1.0f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                }
            } else {
                int measuredHeight15 = getMeasuredHeight() / i5;
                if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                    int i11 = measuredHeight15 / 2;
                    int measuredHeight16 = i11 - (GroupCallActivity.this.cameraButton.getMeasuredHeight() / 2);
                    int measuredWidth18 = (getMeasuredWidth() - GroupCallActivity.this.cameraButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.cameraButton.layout(measuredWidth18, measuredHeight16, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth18, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight16);
                    int measuredHeight17 = (i11 + (i5 == 4 ? measuredHeight15 : 0)) - (GroupCallActivity.this.soundButton.getMeasuredHeight() / 2);
                    int measuredWidth19 = (getMeasuredWidth() - GroupCallActivity.this.soundButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.soundButton.layout(measuredWidth19, measuredHeight17, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth19, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight17);
                } else {
                    int i12 = measuredHeight15 / 2;
                    int measuredHeight18 = i12 - (GroupCallActivity.this.flipButton.getMeasuredHeight() / 2);
                    int measuredWidth20 = (getMeasuredWidth() - GroupCallActivity.this.flipButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.flipButton.layout(measuredWidth20, measuredHeight18, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth20, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight18);
                    int measuredHeight19 = (i12 + (i5 == 4 ? measuredHeight15 : 0)) - (GroupCallActivity.this.cameraButton.getMeasuredHeight() / 2);
                    int measuredWidth21 = (getMeasuredWidth() - GroupCallActivity.this.cameraButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.cameraButton.layout(measuredWidth21, measuredHeight19, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth21, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight19);
                }
                int i13 = measuredHeight15 / 2;
                int measuredHeight20 = ((i5 == 4 ? measuredHeight15 * 3 : measuredHeight15 * 2) + i13) - (GroupCallActivity.this.leaveButton.getMeasuredHeight() / 2);
                int measuredWidth22 = (getMeasuredWidth() - GroupCallActivity.this.leaveButton.getMeasuredWidth()) >> 1;
                GroupCallActivity.this.leaveButton.layout(measuredWidth22, measuredHeight20, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth22, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight20);
                int measuredWidth23 = (((i5 == 4 ? measuredHeight15 * 2 : measuredHeight15) + i13) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2)) - AndroidUtilities.dp(4.0f);
                int measuredWidth24 = (getMeasuredWidth() - GroupCallActivity.this.muteButton.getMeasuredWidth()) >> 1;
                if (i5 == 3) {
                    measuredWidth23 -= AndroidUtilities.dp(6.0f);
                }
                GroupCallActivity.this.muteButton.layout(measuredWidth24, measuredWidth23, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth24, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredWidth23);
                GroupCallActivity.this.minimizeButton.layout(measuredWidth24, measuredWidth23, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth24, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredWidth23);
                GroupCallActivity.this.expandButton.layout(measuredWidth24, measuredWidth23, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth24, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredWidth23);
                float dp6 = AndroidUtilities.dp(52.0f) / (GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                GroupCallActivity.this.muteButton.animate().cancel();
                GroupCallActivity.this.muteButton.setScaleX(dp6);
                GroupCallActivity.this.muteButton.setScaleY(dp6);
                for (int i14 = 0; i14 < 2; i14++) {
                    int measuredWidth25 = (getMeasuredWidth() - GroupCallActivity.this.muteLabel[i14].getMeasuredWidth()) >> 1;
                    int i15 = i5 == 4 ? measuredHeight15 * 2 : measuredHeight15;
                    int measuredWidth26 = ((i13 + i15) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2)) - AndroidUtilities.dp(4.0f);
                    if (i5 == 3) {
                        measuredWidth26 -= AndroidUtilities.dp(6.0f);
                    }
                    int measuredWidth27 = (int) (measuredWidth26 + (GroupCallActivity.this.muteButton.getMeasuredWidth() * 0.687f) + AndroidUtilities.dp(4.0f));
                    if (GroupCallActivity.this.muteLabel[i14].getMeasuredHeight() + measuredWidth27 > i15 + measuredHeight15) {
                        measuredWidth27 -= AndroidUtilities.dp(4.0f);
                    }
                    GroupCallActivity.this.muteLabel[i14].layout(measuredWidth25, measuredWidth27, GroupCallActivity.this.muteLabel[i14].getMeasuredWidth() + measuredWidth25, GroupCallActivity.this.muteLabel[i14].getMeasuredHeight() + measuredWidth27);
                    GroupCallActivity.this.muteLabel[i14].setScaleX(0.687f);
                    GroupCallActivity.this.muteLabel[i14].setScaleY(0.687f);
                }
            }
            if (GroupCallActivity.this.animateButtonsOnNextLayout) {
                AnimatorSet animatorSet = new AnimatorSet();
                boolean z2 = false;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    Float f = (Float) GroupCallActivity.this.buttonsAnimationParamsX.get(childAt);
                    Float f2 = (Float) GroupCallActivity.this.buttonsAnimationParamsY.get(childAt);
                    if (f != null && f2 != null) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, FrameLayout.TRANSLATION_X, f.floatValue() - childAt.getLeft(), 0.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, FrameLayout.TRANSLATION_Y, f2.floatValue() - childAt.getTop(), 0.0f));
                        z2 = true;
                    }
                }
                if (z2) {
                    AnimatorSet animatorSet2 = this.currentButtonsAnimation;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.currentButtonsAnimation.cancel();
                    }
                    this.currentButtonsAnimation = animatorSet;
                    animatorSet.setDuration(350L);
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.17.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            AnonymousClass17.this.currentButtonsAnimation = null;
                            for (int i17 = 0; i17 < AnonymousClass17.this.getChildCount(); i17++) {
                                View childAt2 = AnonymousClass17.this.getChildAt(i17);
                                childAt2.setTranslationX(0.0f);
                                childAt2.setTranslationY(0.0f);
                            }
                        }
                    });
                    animatorSet.start();
                }
                GroupCallActivity.this.buttonsAnimationParamsX.clear();
                GroupCallActivity.this.buttonsAnimationParamsY.clear();
            }
            GroupCallActivity.this.animateButtonsOnNextLayout = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0381  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x03c9  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0661  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x06da  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x07ea  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x07ee  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0826  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x087e  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0891  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x08f3  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0921  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0943  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0950  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0953  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x09b9  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x09ce A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:201:0x09d6  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x0a45 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0a75  */
        /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
        @Override // android.view.ViewGroup, android.view.View
        @SuppressLint({"DrawAllocation"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void dispatchDraw(Canvas canvas) {
            boolean z;
            int i;
            float f;
            int dp;
            float f2;
            boolean z2;
            boolean z3;
            int i2;
            int i3;
            int i4;
            if (!GroupCallActivity.this.contentFullyOverlayed || !GroupCallActivity.this.useBlur) {
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
                GroupCallActivity.this.tinyWaveDrawable.minRadius = AndroidUtilities.dp(62.0f);
                GroupCallActivity.this.tinyWaveDrawable.maxRadius = AndroidUtilities.dp(62.0f) + (AndroidUtilities.dp(20.0f) * BlobDrawable.FORM_SMALL_MAX);
                GroupCallActivity.this.bigWaveDrawable.minRadius = AndroidUtilities.dp(65.0f);
                GroupCallActivity.this.bigWaveDrawable.maxRadius = AndroidUtilities.dp(65.0f) + (AndroidUtilities.dp(20.0f) * BlobDrawable.FORM_BIG_MAX);
                if (GroupCallActivity.this.animateToAmplitude != GroupCallActivity.this.amplitude) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    GroupCallActivity.access$10516(groupCallActivity, groupCallActivity.animateAmplitudeDiff * ((float) j2));
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
                int i5 = 3;
                int i6 = 0;
                int i7 = 1;
                if (GroupCallActivity.this.prevState == null || GroupCallActivity.this.prevState.currentState != 3) {
                    if (GroupCallActivity.this.prevState != null && GroupCallActivity.this.currentState != null && GroupCallActivity.this.currentState.currentState == 3) {
                        GroupCallActivity.this.radialProgressView.toCircle(true, false);
                    }
                } else {
                    GroupCallActivity.this.radialProgressView.toCircle(true, true);
                    if (!GroupCallActivity.this.radialProgressView.isCircle()) {
                        z = false;
                        if (z) {
                            if (GroupCallActivity.this.switchProgress != 1.0f) {
                                if (GroupCallActivity.this.prevState != null && GroupCallActivity.this.prevState.currentState == 3) {
                                    GroupCallActivity.access$13116(GroupCallActivity.this, ((float) j2) / 100.0f);
                                } else {
                                    GroupCallActivity.access$13116(GroupCallActivity.this, ((float) j2) / 180.0f);
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
                                    int i8 = GroupCallActivity.this.colorsTmp[0];
                                    int i9 = GroupCallActivity.this.colorsTmp[1];
                                    int i10 = GroupCallActivity.this.colorsTmp[2];
                                    GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                                    groupCallActivity5.fillColors(groupCallActivity5.currentState.currentState, GroupCallActivity.this.colorsTmp);
                                    i4 = ColorUtils.blendARGB(i8, GroupCallActivity.this.colorsTmp[0], GroupCallActivity.this.switchProgress);
                                    i3 = ColorUtils.blendARGB(i9, GroupCallActivity.this.colorsTmp[1], GroupCallActivity.this.switchProgress);
                                    i2 = ColorUtils.blendARGB(i10, GroupCallActivity.this.colorsTmp[2], GroupCallActivity.this.switchProgress);
                                } else {
                                    GroupCallActivity groupCallActivity6 = GroupCallActivity.this;
                                    groupCallActivity6.fillColors(groupCallActivity6.currentState.currentState, GroupCallActivity.this.colorsTmp);
                                    i4 = GroupCallActivity.this.colorsTmp[0];
                                    i3 = GroupCallActivity.this.colorsTmp[1];
                                    i2 = GroupCallActivity.this.colorsTmp[2];
                                }
                                if (this.currentLightColor != i4) {
                                    GroupCallActivity.this.radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{ColorUtils.setAlphaComponent(i4, 60), ColorUtils.setAlphaComponent(i4, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                                    GroupCallActivity.this.radialPaint.setShader(GroupCallActivity.this.radialGradient);
                                    this.currentLightColor = i4;
                                }
                                GroupCallActivity.this.soundButton.setBackgroundColor(i2, i3);
                                GroupCallActivity.this.cameraButton.setBackgroundColor(i2, i3);
                                GroupCallActivity.this.flipButton.setBackgroundColor(i2, i3);
                            }
                            if (GroupCallActivity.this.currentState != null) {
                                z3 = GroupCallActivity.this.currentState.currentState == 1 || GroupCallActivity.this.currentState.currentState == 0 || GroupCallActivity.isGradientState(GroupCallActivity.this.currentState.currentState);
                                if (GroupCallActivity.this.currentState.currentState != 3) {
                                    z2 = true;
                                    if (GroupCallActivity.this.prevState != null || GroupCallActivity.this.currentState == null || GroupCallActivity.this.currentState.currentState != 3) {
                                        if (z3 || GroupCallActivity.this.showWavesProgress == 1.0f) {
                                            if (!z3 && GroupCallActivity.this.showWavesProgress != 0.0f) {
                                                GroupCallActivity.access$13724(GroupCallActivity.this, ((float) j2) / 350.0f);
                                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                                    GroupCallActivity.this.showWavesProgress = 0.0f;
                                                }
                                            }
                                        } else {
                                            GroupCallActivity.access$13716(GroupCallActivity.this, ((float) j2) / 350.0f);
                                            if (GroupCallActivity.this.showWavesProgress > 1.0f) {
                                                GroupCallActivity.this.showWavesProgress = 1.0f;
                                            }
                                        }
                                    } else {
                                        GroupCallActivity.access$13724(GroupCallActivity.this, ((float) j2) / 180.0f);
                                        if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                            GroupCallActivity.this.showWavesProgress = 0.0f;
                                        }
                                    }
                                    if (z2 || GroupCallActivity.this.showLightingProgress == 1.0f) {
                                        if (!z2 && GroupCallActivity.this.showLightingProgress != 0.0f) {
                                            GroupCallActivity.access$13824(GroupCallActivity.this, ((float) j2) / 350.0f);
                                            if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                                GroupCallActivity.this.showLightingProgress = 0.0f;
                                            }
                                        }
                                    } else {
                                        GroupCallActivity.access$13816(GroupCallActivity.this, ((float) j2) / 350.0f);
                                        if (GroupCallActivity.this.showLightingProgress > 1.0f) {
                                            GroupCallActivity.this.showLightingProgress = 1.0f;
                                        }
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                            z2 = false;
                            if (GroupCallActivity.this.prevState != null) {
                            }
                            if (z3) {
                            }
                            if (!z3) {
                                GroupCallActivity.access$13724(GroupCallActivity.this, ((float) j2) / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                }
                            }
                            if (z2) {
                            }
                            if (!z2) {
                                GroupCallActivity.access$13824(GroupCallActivity.this, ((float) j2) / 350.0f);
                                if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                }
                            }
                        }
                        float interpolation = (this.overshootInterpolator.getInterpolation(GroupCallActivity.this.showWavesProgress) * 0.6f) + 0.4f;
                        GroupCallActivity.this.bigWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                        GroupCallActivity.this.tinyWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                        float f3 = 0.5f;
                        float f4 = 57.0f;
                        float f5 = 2.0f;
                        if (GroupCallActivity.this.prevState == null && GroupCallActivity.this.currentState != null && (GroupCallActivity.this.currentState.currentState == 3 || GroupCallActivity.this.prevState.currentState == 3)) {
                            if (GroupCallActivity.this.currentState.currentState == 3) {
                                f2 = GroupCallActivity.this.switchProgress;
                                GroupCallActivity.this.paint.setShader(GroupCallActivity.this.prevState.shader);
                            } else {
                                f2 = 1.0f - GroupCallActivity.this.switchProgress;
                                GroupCallActivity.this.paint.setShader(GroupCallActivity.this.currentState.shader);
                            }
                            GroupCallActivity.this.paintTmp.setColor(AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_listViewBackgroundUnscrolled"), Theme.getColor("voipgroup_disabledButton"), GroupCallActivity.this.colorProgress, 1.0f));
                            float x = (int) (GroupCallActivity.this.muteButton.getX() + (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2));
                            float y = (int) (GroupCallActivity.this.muteButton.getY() + (GroupCallActivity.this.muteButton.getMeasuredHeight() / 2));
                            GroupCallActivity.this.radialMatrix.setTranslate(x, y);
                            GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                            GroupCallActivity.this.paint.setAlpha(76);
                            if (GroupCallActivity.this.call != null) {
                                float dp2 = AndroidUtilities.dp(52.0f) / 2.0f;
                                canvas.drawCircle(GroupCallActivity.this.leaveButton.getX() + (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2.0f), GroupCallActivity.this.leaveButton.getY() + dp2, dp2, GroupCallActivity.this.leaveBackgroundPaint);
                            }
                            canvas.save();
                            canvas.scale(BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleY(), x, y);
                            canvas.save();
                            float f6 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * 0.5f);
                            canvas.scale(GroupCallActivity.this.showLightingProgress * f6, f6 * GroupCallActivity.this.showLightingProgress, x, y);
                            float f7 = BlobDrawable.LIGHT_GRADIENT_SIZE + 0.7f;
                            canvas.save();
                            canvas.scale(f7, f7, x, y);
                            canvas.drawCircle(x, y, AndroidUtilities.dp(160.0f), GroupCallActivity.this.radialPaint);
                            canvas.restore();
                            canvas.restore();
                            if (GroupCallActivity.this.call != null) {
                                canvas.save();
                                float f8 = (BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * GroupCallActivity.this.scheduleButtonsScale)) * interpolation;
                                canvas.scale(f8, f8, x, y);
                                GroupCallActivity.this.bigWaveDrawable.draw(x, y, canvas, GroupCallActivity.this.paint);
                                canvas.restore();
                                canvas.save();
                                float f9 = (BlobDrawable.SCALE_SMALL_MIN + (BlobDrawable.SCALE_SMALL * GroupCallActivity.this.amplitude * GroupCallActivity.this.scheduleButtonsScale)) * interpolation;
                                canvas.scale(f9, f9, x, y);
                                GroupCallActivity.this.tinyWaveDrawable.draw(x, y, canvas, GroupCallActivity.this.paint);
                                canvas.restore();
                            }
                            GroupCallActivity.this.paint.setAlpha(255);
                            if (z) {
                                canvas.drawCircle(x, y, AndroidUtilities.dp(57.0f), GroupCallActivity.this.paint);
                                GroupCallActivity.this.paint.setColor(Theme.getColor("voipgroup_connectingProgress"));
                                if (f2 != 0.0f) {
                                    GroupCallActivity.this.paint.setAlpha((int) (255.0f * f2));
                                    GroupCallActivity.this.paint.setShader(null);
                                    canvas.drawCircle(x, y, AndroidUtilities.dp(57.0f), GroupCallActivity.this.paint);
                                }
                            }
                            canvas.drawCircle(x, y, AndroidUtilities.dp(55.0f) * f2, GroupCallActivity.this.paintTmp);
                            if (!z) {
                                GroupCallActivity.this.radialProgressView.draw(canvas, x, y);
                            }
                            canvas.restore();
                        } else {
                            i = 2;
                            while (i6 < i) {
                                float dp3 = AndroidUtilities.dp(f4);
                                if (i6 != 0 || GroupCallActivity.this.prevState == null) {
                                    if (i6 == i7 && GroupCallActivity.this.currentState != null) {
                                        GroupCallActivity.this.paint.setShader(GroupCallActivity.this.currentState.shader);
                                        f = GroupCallActivity.this.switchProgress;
                                        if (GroupCallActivity.this.currentState.currentState == i5) {
                                            dp = AndroidUtilities.dp(f5);
                                            dp3 -= dp * f;
                                        }
                                        if (GroupCallActivity.this.paint.getShader() == null) {
                                            GroupCallActivity.this.paint.setColor(AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_listViewBackgroundUnscrolled"), Theme.getColor("voipgroup_disabledButton"), GroupCallActivity.this.colorProgress, 1.0f));
                                        }
                                        float x2 = (int) (GroupCallActivity.this.muteButton.getX() + (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2));
                                        float y2 = (int) (GroupCallActivity.this.muteButton.getY() + (GroupCallActivity.this.muteButton.getMeasuredHeight() / 2));
                                        GroupCallActivity.this.radialMatrix.setTranslate(x2, y2);
                                        GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                                        GroupCallActivity.this.paint.setAlpha((int) (76.0f * f * GroupCallActivity.this.switchToButtonProgress));
                                        if (GroupCallActivity.this.switchToButtonProgress > 0.0f && i6 == i7) {
                                            int alpha = GroupCallActivity.this.leaveBackgroundPaint.getAlpha();
                                            GroupCallActivity.this.leaveBackgroundPaint.setAlpha((int) (alpha * GroupCallActivity.this.switchToButtonProgress));
                                            float dp4 = AndroidUtilities.dp(52.0f) / f5;
                                            canvas.drawCircle(GroupCallActivity.this.leaveButton.getX() + (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2), GroupCallActivity.this.leaveButton.getY() + dp4, dp4, GroupCallActivity.this.leaveBackgroundPaint);
                                            GroupCallActivity.this.leaveBackgroundPaint.setAlpha(alpha);
                                        }
                                        canvas.save();
                                        canvas.scale(BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), x2, y2);
                                        canvas.save();
                                        float dp5 = !GroupCallActivity.isLandscapeMode ? 0.0f : AndroidUtilities.dp(65.0f) * (1.0f - GroupCallActivity.this.switchToButtonInt2);
                                        float f10 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * f3);
                                        canvas.scale(GroupCallActivity.this.showLightingProgress * f10, f10 * GroupCallActivity.this.showLightingProgress, x2, y2);
                                        if (i6 != 1) {
                                            float f11 = (BlobDrawable.LIGHT_GRADIENT_SIZE * GroupCallActivity.this.scheduleButtonsScale) + 0.7f;
                                            canvas.save();
                                            canvas.scale(f11, f11, x2, y2);
                                            int alpha2 = GroupCallActivity.this.radialPaint.getAlpha();
                                            GroupCallActivity.this.radialPaint.setAlpha((int) (alpha2 * GroupCallActivity.this.switchToButtonProgress * (1.0f - GroupCallActivity.this.progressToHideUi)));
                                            canvas.drawCircle(x2, y2, AndroidUtilities.dp(160.0f), GroupCallActivity.this.radialPaint);
                                            GroupCallActivity.this.radialPaint.setAlpha(alpha2);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        if (GroupCallActivity.this.switchToButtonProgress > 0.0f) {
                                            canvas.save();
                                            float f12 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * interpolation * GroupCallActivity.this.scheduleButtonsScale);
                                            canvas.scale(f12, f12, x2, y2);
                                            GroupCallActivity.this.bigWaveDrawable.draw(x2, y2, canvas, GroupCallActivity.this.paint);
                                            canvas.restore();
                                            canvas.save();
                                            float f13 = BlobDrawable.SCALE_SMALL_MIN + (BlobDrawable.SCALE_SMALL * GroupCallActivity.this.amplitude * interpolation * GroupCallActivity.this.scheduleButtonsScale);
                                            canvas.scale(f13, f13, x2, y2);
                                            GroupCallActivity.this.tinyWaveDrawable.draw(x2, y2, canvas, GroupCallActivity.this.paint);
                                            canvas.restore();
                                        }
                                        if (!GroupCallActivity.isLandscapeMode) {
                                            if (i6 == 0) {
                                                GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * 255.0f));
                                                if (this.currentButtonsAnimation == null) {
                                                    GroupCallActivity.this.muteButton.setTranslationY(dp5);
                                                }
                                                float f14 = !GroupCallActivity.isLandscapeMode ? 1.0f : GroupCallActivity.this.switchToButtonInt2;
                                                float measuredWidth2 = (getMeasuredWidth() / 2) - AndroidUtilities.dp(21.0f);
                                                float dp6 = AndroidUtilities.dp(24.0f);
                                                float f15 = (measuredWidth2 + ((dp3 - measuredWidth2) * f14)) * GroupCallActivity.this.scheduleButtonsScale;
                                                float f16 = (dp6 + ((dp3 - dp6) * f14)) * GroupCallActivity.this.scheduleButtonsScale;
                                                GroupCallActivity.this.rect.set(x2 - f15, y2 - f16, f15 + x2, f16 + y2);
                                                float dp7 = AndroidUtilities.dp(4.0f) + ((dp3 - AndroidUtilities.dp(4.0f)) * f14);
                                                canvas.drawRoundRect(GroupCallActivity.this.rect, dp7, dp7, GroupCallActivity.this.paint);
                                                if (i6 == 1 && GroupCallActivity.this.currentState.currentState == 3) {
                                                    GroupCallActivity.this.radialProgressView.draw(canvas, x2, y2);
                                                }
                                                canvas.restore();
                                                if (GroupCallActivity.isLandscapeMode && GroupCallActivity.this.switchToButtonInt2 == 0.0f) {
                                                    GroupCallActivity.this.paint.setAlpha(255);
                                                    float x3 = GroupCallActivity.this.scheduleButtonTextView.getX() - getX();
                                                    float y3 = GroupCallActivity.this.scheduleButtonTextView.getY() - getY();
                                                    GroupCallActivity.this.rect.set(x3, y3, GroupCallActivity.this.scheduleButtonTextView.getMeasuredWidth() + x3, GroupCallActivity.this.scheduleButtonTextView.getMeasuredHeight() + y3);
                                                    canvas.drawRoundRect(GroupCallActivity.this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), GroupCallActivity.this.paint);
                                                }
                                            } else {
                                                GroupCallActivity.this.paint.setAlpha((int) (f * 255.0f * GroupCallActivity.this.switchToButtonInt2));
                                                if (this.currentButtonsAnimation == null) {
                                                }
                                                if (!GroupCallActivity.isLandscapeMode) {
                                                }
                                                float measuredWidth22 = (getMeasuredWidth() / 2) - AndroidUtilities.dp(21.0f);
                                                float dp62 = AndroidUtilities.dp(24.0f);
                                                float f152 = (measuredWidth22 + ((dp3 - measuredWidth22) * f14)) * GroupCallActivity.this.scheduleButtonsScale;
                                                float f162 = (dp62 + ((dp3 - dp62) * f14)) * GroupCallActivity.this.scheduleButtonsScale;
                                                GroupCallActivity.this.rect.set(x2 - f152, y2 - f162, f152 + x2, f162 + y2);
                                                float dp72 = AndroidUtilities.dp(4.0f) + ((dp3 - AndroidUtilities.dp(4.0f)) * f14);
                                                canvas.drawRoundRect(GroupCallActivity.this.rect, dp72, dp72, GroupCallActivity.this.paint);
                                                if (i6 == 1) {
                                                    GroupCallActivity.this.radialProgressView.draw(canvas, x2, y2);
                                                }
                                                canvas.restore();
                                                if (GroupCallActivity.isLandscapeMode) {
                                                    GroupCallActivity.this.paint.setAlpha(255);
                                                    float x32 = GroupCallActivity.this.scheduleButtonTextView.getX() - getX();
                                                    float y32 = GroupCallActivity.this.scheduleButtonTextView.getY() - getY();
                                                    GroupCallActivity.this.rect.set(x32, y32, GroupCallActivity.this.scheduleButtonTextView.getMeasuredWidth() + x32, GroupCallActivity.this.scheduleButtonTextView.getMeasuredHeight() + y32);
                                                    canvas.drawRoundRect(GroupCallActivity.this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), GroupCallActivity.this.paint);
                                                }
                                            }
                                        } else if (i6 == 0) {
                                            GroupCallActivity.this.paint.setAlpha(255);
                                            if (this.currentButtonsAnimation == null) {
                                            }
                                            if (!GroupCallActivity.isLandscapeMode) {
                                            }
                                            float measuredWidth222 = (getMeasuredWidth() / 2) - AndroidUtilities.dp(21.0f);
                                            float dp622 = AndroidUtilities.dp(24.0f);
                                            float f1522 = (measuredWidth222 + ((dp3 - measuredWidth222) * f14)) * GroupCallActivity.this.scheduleButtonsScale;
                                            float f1622 = (dp622 + ((dp3 - dp622) * f14)) * GroupCallActivity.this.scheduleButtonsScale;
                                            GroupCallActivity.this.rect.set(x2 - f1522, y2 - f1622, f1522 + x2, f1622 + y2);
                                            float dp722 = AndroidUtilities.dp(4.0f) + ((dp3 - AndroidUtilities.dp(4.0f)) * f14);
                                            canvas.drawRoundRect(GroupCallActivity.this.rect, dp722, dp722, GroupCallActivity.this.paint);
                                            if (i6 == 1) {
                                            }
                                            canvas.restore();
                                            if (GroupCallActivity.isLandscapeMode) {
                                            }
                                        } else {
                                            GroupCallActivity.this.paint.setAlpha((int) (f * 255.0f));
                                            if (this.currentButtonsAnimation == null) {
                                            }
                                            if (!GroupCallActivity.isLandscapeMode) {
                                            }
                                            float measuredWidth2222 = (getMeasuredWidth() / 2) - AndroidUtilities.dp(21.0f);
                                            float dp6222 = AndroidUtilities.dp(24.0f);
                                            float f15222 = (measuredWidth2222 + ((dp3 - measuredWidth2222) * f14)) * GroupCallActivity.this.scheduleButtonsScale;
                                            float f16222 = (dp6222 + ((dp3 - dp6222) * f14)) * GroupCallActivity.this.scheduleButtonsScale;
                                            GroupCallActivity.this.rect.set(x2 - f15222, y2 - f16222, f15222 + x2, f16222 + y2);
                                            float dp7222 = AndroidUtilities.dp(4.0f) + ((dp3 - AndroidUtilities.dp(4.0f)) * f14);
                                            canvas.drawRoundRect(GroupCallActivity.this.rect, dp7222, dp7222, GroupCallActivity.this.paint);
                                            if (i6 == 1) {
                                            }
                                            canvas.restore();
                                            if (GroupCallActivity.isLandscapeMode) {
                                            }
                                        }
                                    }
                                } else {
                                    GroupCallActivity.this.paint.setShader(GroupCallActivity.this.prevState.shader);
                                    f = 1.0f - GroupCallActivity.this.switchProgress;
                                    if (GroupCallActivity.this.prevState.currentState == i5) {
                                        dp = AndroidUtilities.dp(f5);
                                        dp3 -= dp * f;
                                    }
                                    if (GroupCallActivity.this.paint.getShader() == null) {
                                    }
                                    float x22 = (int) (GroupCallActivity.this.muteButton.getX() + (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2));
                                    float y22 = (int) (GroupCallActivity.this.muteButton.getY() + (GroupCallActivity.this.muteButton.getMeasuredHeight() / 2));
                                    GroupCallActivity.this.radialMatrix.setTranslate(x22, y22);
                                    GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                                    GroupCallActivity.this.paint.setAlpha((int) (76.0f * f * GroupCallActivity.this.switchToButtonProgress));
                                    if (GroupCallActivity.this.switchToButtonProgress > 0.0f) {
                                        int alpha3 = GroupCallActivity.this.leaveBackgroundPaint.getAlpha();
                                        GroupCallActivity.this.leaveBackgroundPaint.setAlpha((int) (alpha3 * GroupCallActivity.this.switchToButtonProgress));
                                        float dp42 = AndroidUtilities.dp(52.0f) / f5;
                                        canvas.drawCircle(GroupCallActivity.this.leaveButton.getX() + (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2), GroupCallActivity.this.leaveButton.getY() + dp42, dp42, GroupCallActivity.this.leaveBackgroundPaint);
                                        GroupCallActivity.this.leaveBackgroundPaint.setAlpha(alpha3);
                                    }
                                    canvas.save();
                                    canvas.scale(BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), BlobDrawable.GLOBAL_SCALE * GroupCallActivity.this.muteButton.getScaleX(), x22, y22);
                                    canvas.save();
                                    if (!GroupCallActivity.isLandscapeMode) {
                                    }
                                    float f102 = BlobDrawable.SCALE_BIG_MIN + (BlobDrawable.SCALE_BIG * GroupCallActivity.this.amplitude * f3);
                                    canvas.scale(GroupCallActivity.this.showLightingProgress * f102, f102 * GroupCallActivity.this.showLightingProgress, x22, y22);
                                    if (i6 != 1) {
                                    }
                                    canvas.restore();
                                    if (GroupCallActivity.this.switchToButtonProgress > 0.0f) {
                                    }
                                    if (!GroupCallActivity.isLandscapeMode) {
                                    }
                                }
                                i6++;
                                i = 2;
                                i5 = 3;
                                i7 = 1;
                                f3 = 0.5f;
                                f4 = 57.0f;
                                f5 = 2.0f;
                            }
                        }
                        super.dispatchDraw(canvas);
                        if (!GroupCallActivity.this.renderersContainer.isAnimating()) {
                            return;
                        }
                        invalidate();
                        return;
                    }
                }
                z = true;
                if (z) {
                }
                float interpolation2 = (this.overshootInterpolator.getInterpolation(GroupCallActivity.this.showWavesProgress) * 0.6f) + 0.4f;
                GroupCallActivity.this.bigWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                GroupCallActivity.this.tinyWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                float f32 = 0.5f;
                float f42 = 57.0f;
                float f52 = 2.0f;
                if (GroupCallActivity.this.prevState == null) {
                }
                i = 2;
                while (i6 < i) {
                }
                super.dispatchDraw(canvas);
                if (!GroupCallActivity.this.renderersContainer.isAnimating()) {
                }
            }
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == GroupCallActivity.this.muteButton && view.getScaleX() != 1.0f) {
                canvas.save();
                float scaleX = (((1.0f / GroupCallActivity.this.muteButton.getScaleX()) - 1.0f) * 0.2f) + 1.0f;
                canvas.scale(scaleX, scaleX, view.getX() + (view.getMeasuredWidth() / 2.0f), view.getY() + (view.getMeasuredHeight() / 2.0f));
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public /* synthetic */ void lambda$new$15(View view) {
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled() || isRtmpStream()) {
            getLink(false);
        } else if (VoIPService.getSharedInstance() == null) {
        } else {
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(getContext(), false);
        }
    }

    public /* synthetic */ void lambda$new$16(View view) {
        this.renderersContainer.delayHideUi();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (sharedInstance.getVideoState(false) != 2) {
                return;
            }
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
                GroupCallMiniTextureView groupCallMiniTextureView = this.attachedRenderers.get(i);
                ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
                if (videoParticipant.participant.self && !videoParticipant.presentation) {
                    groupCallMiniTextureView.startFlipAnimation();
                }
            }
        }
    }

    public /* synthetic */ void lambda$new$17(Context context, View view) {
        this.renderersContainer.delayHideUi();
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled()) {
            dismiss();
            return;
        }
        updateItems();
        onLeaveClick(context, new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.dismiss();
            }
        }, false);
    }

    /* renamed from: org.telegram.ui.GroupCallActivity$19 */
    /* loaded from: classes3.dex */
    public class AnonymousClass19 implements View.OnClickListener {
        Runnable finishRunnable = new Runnable() { // from class: org.telegram.ui.GroupCallActivity.19.1
            @Override // java.lang.Runnable
            public void run() {
                GroupCallActivity.this.muteButton.setAnimation(GroupCallActivity.this.bigMicDrawable);
                GroupCallActivity.this.playingHandAnimation = false;
            }
        };

        AnonymousClass19() {
            GroupCallActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"SourceLockedOrientationActivity"})
        public void onClick(View view) {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null || groupCallActivity.muteButtonState == 3) {
                return;
            }
            int i = 6;
            int i2 = 0;
            if (!GroupCallActivity.this.isRtmpStream() || GroupCallActivity.this.call.isScheduled()) {
                if (GroupCallActivity.this.muteButtonState == 5) {
                    if (GroupCallActivity.this.startingGroupCall) {
                        return;
                    }
                    view.performHapticFeedback(3, 2);
                    GroupCallActivity.this.startingGroupCall = true;
                    TLRPC$TL_phone_startScheduledGroupCall tLRPC$TL_phone_startScheduledGroupCall = new TLRPC$TL_phone_startScheduledGroupCall();
                    tLRPC$TL_phone_startScheduledGroupCall.call = GroupCallActivity.this.call.getInputGroupCall();
                    GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_startScheduledGroupCall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$19$$ExternalSyntheticLambda1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            GroupCallActivity.AnonymousClass19.this.lambda$onClick$1(tLObject, tLRPC$TL_error);
                        }
                    });
                    return;
                } else if (GroupCallActivity.this.muteButtonState == 7 || GroupCallActivity.this.muteButtonState == 6) {
                    if (GroupCallActivity.this.muteButtonState == 6 && GroupCallActivity.this.reminderHintView != null) {
                        GroupCallActivity.this.reminderHintView.hide();
                    }
                    TLRPC$TL_phone_toggleGroupCallStartSubscription tLRPC$TL_phone_toggleGroupCallStartSubscription = new TLRPC$TL_phone_toggleGroupCallStartSubscription();
                    tLRPC$TL_phone_toggleGroupCallStartSubscription.call = GroupCallActivity.this.call.getInputGroupCall();
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    TLRPC$GroupCall tLRPC$GroupCall = groupCallActivity2.call.call;
                    boolean z = !tLRPC$GroupCall.schedule_start_subscribed;
                    tLRPC$GroupCall.schedule_start_subscribed = z;
                    tLRPC$TL_phone_toggleGroupCallStartSubscription.subscribed = z;
                    groupCallActivity2.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_toggleGroupCallStartSubscription, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$19$$ExternalSyntheticLambda2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            GroupCallActivity.AnonymousClass19.this.lambda$onClick$2(tLObject, tLRPC$TL_error);
                        }
                    });
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    if (groupCallActivity3.call.call.schedule_start_subscribed) {
                        i = 7;
                    }
                    groupCallActivity3.updateMuteButton(i, true);
                    return;
                } else if (VoIPService.getSharedInstance() == null || GroupCallActivity.this.isStillConnecting()) {
                    return;
                } else {
                    if (GroupCallActivity.this.muteButtonState == 2 || GroupCallActivity.this.muteButtonState == 4) {
                        if (GroupCallActivity.this.playingHandAnimation) {
                            return;
                        }
                        GroupCallActivity.this.playingHandAnimation = true;
                        AndroidUtilities.shakeView(GroupCallActivity.this.muteLabel[0], 2.0f, 0);
                        view.performHapticFeedback(3, 2);
                        int nextInt = Utilities.random.nextInt(100);
                        int i3 = 540;
                        if (nextInt < 32) {
                            i3 = 120;
                        } else if (nextInt < 64) {
                            i3 = 240;
                            i2 = 120;
                        } else if (nextInt < 97) {
                            i3 = 420;
                            i2 = 240;
                        } else if (nextInt == 98) {
                            i2 = 420;
                        } else {
                            i3 = 720;
                            i2 = 540;
                        }
                        GroupCallActivity.this.handDrawables.setCustomEndFrame(i3);
                        GroupCallActivity.this.handDrawables.setOnFinishCallback(this.finishRunnable, i3 - 1);
                        GroupCallActivity.this.muteButton.setAnimation(GroupCallActivity.this.handDrawables);
                        GroupCallActivity.this.handDrawables.setCurrentFrame(i2);
                        GroupCallActivity.this.muteButton.playAnimation();
                        if (GroupCallActivity.this.muteButtonState != 2) {
                            return;
                        }
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        long peerId = MessageObject.getPeerId(groupCallActivity4.call.participants.get(MessageObject.getPeerId(groupCallActivity4.selfPeer)).peer);
                        VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
                        GroupCallActivity.this.updateMuteButton(4, true);
                        return;
                    } else if (GroupCallActivity.this.muteButtonState == 0) {
                        GroupCallActivity.this.updateMuteButton(1, true);
                        VoIPService.getSharedInstance().setMicMute(false, false, true);
                        GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        return;
                    } else {
                        GroupCallActivity.this.updateMuteButton(0, true);
                        VoIPService.getSharedInstance().setMicMute(true, false, true);
                        GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        return;
                    }
                }
            }
            if (GroupCallActivity.this.renderersContainer != null && GroupCallActivity.this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode())) {
                GroupCallActivity.this.fullscreenFor(null);
                if (GroupCallActivity.isLandscapeMode) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$19$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupCallActivity.AnonymousClass19.this.lambda$onClick$0();
                        }
                    }, 200L);
                }
                GroupCallActivity.this.parentActivity.setRequestedOrientation(-1);
            } else if (GroupCallActivity.this.visibleVideoParticipants.isEmpty()) {
            } else {
                ChatObject.VideoParticipant videoParticipant = GroupCallActivity.this.visibleVideoParticipants.get(0);
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
        }

        public /* synthetic */ void lambda$onClick$0() {
            GroupCallActivity.this.wasNotInLayoutFullscreen = null;
            GroupCallActivity.this.wasExpandBigSize = null;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.updateMuteButton(groupCallActivity.muteButtonState, true);
        }

        public /* synthetic */ void lambda$onClick$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject != null) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            }
        }

        public /* synthetic */ void lambda$onClick$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject != null) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            }
        }
    }

    public /* synthetic */ void lambda$new$18(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    public /* synthetic */ void lambda$new$19(Context context, View view) {
        ChatObject.Call call = this.call;
        if (call == null || this.renderersContainer.inFullscreenMode) {
            return;
        }
        if (call.call.join_muted) {
            this.everyoneItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
            this.everyoneItem.setChecked(false);
            this.adminItem.setColors(Theme.getColor("voipgroup_checkMenu"), Theme.getColor("voipgroup_checkMenu"));
            this.adminItem.setChecked(true);
        } else {
            this.everyoneItem.setColors(Theme.getColor("voipgroup_checkMenu"), Theme.getColor("voipgroup_checkMenu"));
            this.everyoneItem.setChecked(true);
            this.adminItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
            this.adminItem.setChecked(false);
        }
        this.changingPermissions = false;
        this.otherItem.hideSubItem(1);
        this.otherItem.hideSubItem(2);
        if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
            int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
            if (currentAudioRoute == 2) {
                this.soundItem.setIcon(R.drawable.msg_voice_bluetooth);
                this.soundItem.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth));
            } else {
                int i = R.drawable.msg_voice_phone;
                if (currentAudioRoute == 0) {
                    ActionBarMenuSubItem actionBarMenuSubItem = this.soundItem;
                    if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                        i = R.drawable.msg_voice_headphones;
                    }
                    actionBarMenuSubItem.setIcon(i);
                    this.soundItem.setSubtext(VoIPService.getSharedInstance().isHeadsetPlugged() ? LocaleController.getString("VoipAudioRoutingHeadset", R.string.VoipAudioRoutingHeadset) : LocaleController.getString("VoipAudioRoutingPhone", R.string.VoipAudioRoutingPhone));
                } else if (currentAudioRoute == 1) {
                    if (((AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).isSpeakerphoneOn()) {
                        this.soundItem.setIcon(R.drawable.msg_voice_speaker);
                        this.soundItem.setSubtext(LocaleController.getString("VoipAudioRoutingSpeaker", R.string.VoipAudioRoutingSpeaker));
                    } else {
                        this.soundItem.setIcon(R.drawable.msg_voice_phone);
                        this.soundItem.setSubtext(LocaleController.getString("VoipAudioRoutingPhone", R.string.VoipAudioRoutingPhone));
                    }
                }
            }
        }
        updateItems();
        this.otherItem.toggleSubMenu();
    }

    public /* synthetic */ void lambda$new$20(View view) {
        if (isRtmpStream()) {
            if (AndroidUtilities.checkInlinePermissions(this.parentActivity)) {
                RTMPStreamPipOverlay.show();
                dismiss();
                return;
            }
            AlertsCreator.createDrawOverlayPermissionDialog(this.parentActivity, null).show();
        } else if (AndroidUtilities.checkInlinePermissions(this.parentActivity)) {
            GroupCallPip.clearForce();
            dismiss();
        } else {
            AlertsCreator.createDrawOverlayGroupCallPermissionDialog(getContext()).show();
        }
    }

    public /* synthetic */ void lambda$new$21(View view) {
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

    /* renamed from: org.telegram.ui.GroupCallActivity$20 */
    /* loaded from: classes3.dex */
    public class AnonymousClass20 extends AudioPlayerAlert.ClippingTextViewSwitcher {
        final /* synthetic */ Context val$context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass20(Context context, Context context2) {
            super(context);
            GroupCallActivity.this = r1;
            this.val$context = context2;
        }

        @Override // org.telegram.ui.Components.AudioPlayerAlert.ClippingTextViewSwitcher
        protected TextView createTextView() {
            final TextView textView = new TextView(this.val$context);
            textView.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setGravity(51);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$20$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupCallActivity.AnonymousClass20.this.lambda$createTextView$0(textView, view);
                }
            });
            return textView;
        }

        public /* synthetic */ void lambda$createTextView$0(TextView textView, View view) {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            ChatObject.Call call = groupCallActivity.call;
            if (call == null || !call.recording) {
                return;
            }
            groupCallActivity.showRecordHint(textView);
        }
    }

    public /* synthetic */ void lambda$new$22(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public /* synthetic */ void lambda$new$23(View view, int i) {
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
        if (groupCallUserCell.getVideoParticipant() == null) {
            fullscreenFor(new ChatObject.VideoParticipant(groupCallUserCell.getParticipant(), false, false));
        } else {
            fullscreenFor(groupCallUserCell.getVideoParticipant());
        }
    }

    public /* synthetic */ boolean lambda$new$24(View view, int i) {
        if (showMenuForCell(view)) {
            this.listView.performHapticFeedback(0);
        }
        return false;
    }

    /* renamed from: org.telegram.ui.GroupCallActivity$27 */
    /* loaded from: classes3.dex */
    public class AnonymousClass27 extends GroupCallRenderersContainer {
        ValueAnimator uiVisibilityAnimator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass27(Context context, RecyclerView recyclerView, RecyclerView recyclerView2, ArrayList arrayList, ChatObject.Call call, GroupCallActivity groupCallActivity) {
            super(context, recyclerView, recyclerView2, arrayList, call, groupCallActivity);
            GroupCallActivity.this = r8;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
        public void update() {
            super.update();
            ((BottomSheet) GroupCallActivity.this).navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_actionBarUnscrolled"), Theme.getColor("voipgroup_actionBar"), Math.max(GroupCallActivity.this.colorProgress, GroupCallActivity.this.renderersContainer == null ? 0.0f : GroupCallActivity.this.renderersContainer.progressToFullscreenMode), 1.0f);
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.setColorProgress(groupCallActivity.colorProgress);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer, android.view.ViewGroup
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (view == GroupCallActivity.this.scrimRenderer) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
        protected void onFullScreenModeChanged(boolean z) {
            GroupCallActivity.this.delayedGroupCallUpdated = z;
            int i = 0;
            if (GroupCallActivity.isTabletMode) {
                if (z || !GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                    return;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.tabletGridAdapter.setVisibility(groupCallActivity.tabletVideoGridView, false, true);
                return;
            }
            if (z) {
                GroupCallActivity.this.undoView[0].hide(false, 1);
                GroupCallActivity.this.renderersContainer.undoView[0].hide(false, 2);
                if (!GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                    GroupCallActivity.this.listView.setVisibility(0);
                    GroupCallActivity.this.actionBar.setVisibility(0);
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
                } else {
                    GroupCallActivity.this.fullscreenUsersListView.setVisibility(8);
                    GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                    groupCallActivity5.fullscreenAdapter.setVisibility(groupCallActivity5.fullscreenUsersListView, false);
                }
                if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() == 0) {
                    for (int i2 = 0; i2 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i2++) {
                        View childAt = GroupCallActivity.this.fullscreenUsersListView.getChildAt(i2);
                        childAt.setAlpha(1.0f);
                        childAt.setScaleX(1.0f);
                        childAt.setScaleY(1.0f);
                        childAt.setTranslationX(0.0f);
                        childAt.setTranslationY(0.0f);
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) childAt).setProgressToFullscreen(GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                    }
                }
            }
            View view = GroupCallActivity.this.buttonsBackgroundGradientView2;
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
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
            final boolean isUiVisible = GroupCallActivity.this.renderersContainer.isUiVisible();
            ValueAnimator valueAnimator = this.uiVisibilityAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.uiVisibilityAnimator.cancel();
            }
            float[] fArr = new float[2];
            fArr[0] = GroupCallActivity.this.progressToHideUi;
            fArr[1] = isUiVisible ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.uiVisibilityAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$27$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    GroupCallActivity.AnonymousClass27.this.lambda$onUiVisibilityChanged$0(valueAnimator2);
                }
            });
            this.uiVisibilityAnimator.setDuration(350L);
            this.uiVisibilityAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.uiVisibilityAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.27.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    GroupCallActivity.this.invalidateLayoutFullscreen();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    AnonymousClass27 anonymousClass27 = AnonymousClass27.this;
                    anonymousClass27.uiVisibilityAnimator = null;
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.progressToHideUi = isUiVisible ? 0.0f : 1.0f;
                    groupCallActivity.renderersContainer.setProgressToHideUi(GroupCallActivity.this.progressToHideUi);
                    GroupCallActivity.this.fullscreenUsersListView.invalidate();
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                    GroupCallActivity.this.buttonsContainer.invalidate();
                }
            });
            this.uiVisibilityAnimator.start();
        }

        public /* synthetic */ void lambda$onUiVisibilityChanged$0(ValueAnimator valueAnimator) {
            GroupCallActivity.this.progressToHideUi = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            GroupCallActivity.this.renderersContainer.setProgressToHideUi(GroupCallActivity.this.progressToHideUi);
            GroupCallActivity.this.fullscreenUsersListView.invalidate();
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            GroupCallActivity.this.buttonsContainer.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
        public boolean canHideUI() {
            return super.canHideUI() && GroupCallActivity.this.previewDialog == null;
        }

        @Override // org.telegram.ui.Components.voip.GroupCallRenderersContainer
        protected void onBackPressed() {
            GroupCallActivity.this.onBackPressed();
        }
    }

    public /* synthetic */ void lambda$new$29(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, final TLRPC$Chat tLRPC$Chat, AccountInstance accountInstance, final TLRPC$InputPeer tLRPC$InputPeer, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.scheduleAnimator = ofFloat;
        ofFloat.setDuration(600L);
        this.scheduleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GroupCallActivity.this.lambda$new$25(valueAnimator);
            }
        });
        this.scheduleAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.34
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                GroupCallActivity.this.scheduleAnimator = null;
            }
        });
        this.scheduleAnimator.start();
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            this.titleTextView.setText(LocaleController.getString("VoipChannelVoiceChat", R.string.VoipChannelVoiceChat), true);
        } else {
            this.titleTextView.setText(LocaleController.getString("VoipGroupVoiceChat", R.string.VoipGroupVoiceChat), true);
        }
        Calendar calendar = Calendar.getInstance();
        boolean checkScheduleDate = AlertsCreator.checkScheduleDate(null, null, 604800L, 3, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 24 * 3600 * 1000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (checkScheduleDate) {
            calendar.set(13, 0);
        }
        this.scheduleStartAt = (int) (calendar.getTimeInMillis() / 1000);
        updateScheduleUI(false);
        TLRPC$TL_phone_createGroupCall tLRPC$TL_phone_createGroupCall = new TLRPC$TL_phone_createGroupCall();
        tLRPC$TL_phone_createGroupCall.peer = MessagesController.getInputPeer(tLRPC$Chat);
        tLRPC$TL_phone_createGroupCall.random_id = Utilities.random.nextInt();
        tLRPC$TL_phone_createGroupCall.schedule_date = this.scheduleStartAt;
        tLRPC$TL_phone_createGroupCall.flags |= 2;
        accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_createGroupCall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda53
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                GroupCallActivity.this.lambda$new$28(tLRPC$Chat, tLRPC$InputPeer, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public /* synthetic */ void lambda$new$25(ValueAnimator valueAnimator) {
        this.switchToButtonProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateScheduleUI(true);
        this.buttonsContainer.invalidate();
        this.listView.invalidate();
    }

    public /* synthetic */ void lambda$new$28(final TLRPC$Chat tLRPC$Chat, final TLRPC$InputPeer tLRPC$InputPeer, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            int i = 0;
            while (true) {
                if (i >= tLRPC$Updates.updates.size()) {
                    break;
                }
                TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i);
                if (tLRPC$Update instanceof TLRPC$TL_updateGroupCall) {
                    final TLRPC$TL_updateGroupCall tLRPC$TL_updateGroupCall = (TLRPC$TL_updateGroupCall) tLRPC$Update;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda43
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupCallActivity.this.lambda$new$26(tLRPC$Chat, tLRPC$InputPeer, tLRPC$TL_updateGroupCall);
                        }
                    });
                    break;
                }
                i++;
            }
            this.accountInstance.getMessagesController().processUpdates(tLRPC$Updates, false);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$new$27(tLRPC$TL_error);
            }
        });
    }

    public /* synthetic */ void lambda$new$26(TLRPC$Chat tLRPC$Chat, TLRPC$InputPeer tLRPC$InputPeer, TLRPC$TL_updateGroupCall tLRPC$TL_updateGroupCall) {
        ChatObject.Call call = new ChatObject.Call();
        this.call = call;
        call.call = new TLRPC$TL_groupCall();
        ChatObject.Call call2 = this.call;
        TLRPC$GroupCall tLRPC$GroupCall = call2.call;
        tLRPC$GroupCall.participants_count = 0;
        tLRPC$GroupCall.version = 1;
        tLRPC$GroupCall.can_start_video = true;
        tLRPC$GroupCall.can_change_join_muted = true;
        call2.chatId = tLRPC$Chat.id;
        tLRPC$GroupCall.schedule_date = this.scheduleStartAt;
        tLRPC$GroupCall.flags |= ConnectionsManager.RequestFlagNeedQuickAck;
        call2.currentAccount = this.accountInstance;
        call2.setSelfPeer(tLRPC$InputPeer);
        ChatObject.Call call3 = this.call;
        TLRPC$GroupCall tLRPC$GroupCall2 = call3.call;
        TLRPC$GroupCall tLRPC$GroupCall3 = tLRPC$TL_updateGroupCall.call;
        tLRPC$GroupCall2.access_hash = tLRPC$GroupCall3.access_hash;
        tLRPC$GroupCall2.id = tLRPC$GroupCall3.id;
        call3.createNoVideoParticipant();
        this.fullscreenAdapter.setGroupCall(this.call);
        this.renderersContainer.setGroupCall(this.call);
        this.tabletGridAdapter.setGroupCall(this.call);
        MessagesController messagesController = this.accountInstance.getMessagesController();
        ChatObject.Call call4 = this.call;
        messagesController.putGroupCall(call4.chatId, call4);
    }

    public /* synthetic */ void lambda$new$27(TLRPC$TL_error tLRPC$TL_error) {
        this.accountInstance.getNotificationCenter().postNotificationName(NotificationCenter.needShowAlert, 6, tLRPC$TL_error.text);
        dismiss();
    }

    public static /* synthetic */ String lambda$new$30(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().formatterScheduleDay.format(j2);
        }
        return LocaleController.getInstance().formatterScheduleYear.format(j2);
    }

    public /* synthetic */ void lambda$new$31(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
    }

    public static /* synthetic */ String lambda$new$32(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static /* synthetic */ String lambda$new$33(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public /* synthetic */ void lambda$new$34(Context context, View view) {
        LaunchActivity launchActivity;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = this.parentActivity) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() == null) {
        } else {
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                this.undoView[0].hide(false, 1);
                if (this.previewDialog != null) {
                    return;
                }
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.createCaptureDevice(false);
                }
                if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                    z = true;
                }
                PrivateVideoPreviewDialog privateVideoPreviewDialog = new PrivateVideoPreviewDialog(context, true, z) { // from class: org.telegram.ui.GroupCallActivity.38
                    @Override // org.telegram.ui.Components.voip.PrivateVideoPreviewDialog
                    public void onDismiss(boolean z2, boolean z3) {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        boolean z4 = groupCallActivity.previewDialog.micEnabled;
                        groupCallActivity.previewDialog = null;
                        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                        if (!z3) {
                            if (sharedInstance2 == null) {
                                return;
                            }
                            sharedInstance2.setVideoState(false, 0);
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
                this.container.addView(privateVideoPreviewDialog);
                if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                    return;
                }
                sharedInstance.switchCamera();
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            updateState(true, false);
            updateSpeakerPhoneIcon(false);
            this.call.sortParticipants();
            applyCallParticipantUpdates(true);
            this.buttonsContainer.requestLayout();
        }
    }

    public LaunchActivity getParentActivity() {
        return this.parentActivity;
    }

    public void invalidateLayoutFullscreen() {
        int i;
        if (isRtmpStream()) {
            boolean z = this.renderersContainer.isUiVisible() || !this.renderersContainer.inFullscreenMode || (isLandscapeMode != isRtmpLandscapeMode() && !AndroidUtilities.isTablet());
            Boolean bool = this.wasNotInLayoutFullscreen;
            if (bool != null && z == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = this.containerView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-5) & (-3);
                getWindow().clearFlags(1024);
                setHideSystemVerticalInsets(false);
            } else {
                setHideSystemVerticalInsets(true);
                i = systemUiVisibility | 4 | 2;
                getWindow().addFlags(1024);
            }
            this.containerView.setSystemUiVisibility(i);
            this.wasNotInLayoutFullscreen = Boolean.valueOf(z);
        }
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
                    final GroupCallMiniTextureView groupCallMiniTextureView = this.attachedRenderersTmp.get(i);
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
                        groupCallMiniTextureView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.39
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
                    final GroupCallMiniTextureView groupCallMiniTextureView2 = this.attachedRenderersTmp.get(i2);
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
                        groupCallMiniTextureView2.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.40
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
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda40
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupCallActivity.this.lambda$fullscreenFor$35(arrayList);
                        }
                    });
                }
            }
            final boolean z = !this.renderersContainer.inFullscreenMode;
            ViewTreeObserver viewTreeObserver = this.listView.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCallActivity.41
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
                ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCallActivity.42
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.requestFullscreenListener = null;
                        groupCallActivity.renderersContainer.requestFullscreen(videoParticipant);
                        AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                        return false;
                    }
                };
                this.requestFullscreenListener = onPreDrawListener2;
                viewTreeObserver2.addOnPreDrawListener(onPreDrawListener2);
                return;
            }
            this.renderersContainer.requestFullscreen(videoParticipant);
            AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
        } else if (this.listView.getVisibility() != 0) {
            this.listView.setVisibility(0);
            applyCallParticipantUpdates(false);
            this.delayedGroupCallUpdated = true;
            ViewTreeObserver viewTreeObserver3 = this.listView.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener3 = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCallActivity.43
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    GroupCallActivity.this.renderersContainer.requestFullscreen(null);
                    AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener3;
            viewTreeObserver3.addOnPreDrawListener(onPreDrawListener3);
        } else {
            ViewTreeObserver viewTreeObserver4 = this.listView.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener4 = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCallActivity.44
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    GroupCallActivity.this.renderersContainer.requestFullscreen(null);
                    AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener4;
            viewTreeObserver4.addOnPreDrawListener(onPreDrawListener4);
        }
    }

    public /* synthetic */ void lambda$fullscreenFor$35(ArrayList arrayList) {
        for (int i = 0; i < this.attachedRenderers.size(); i++) {
            if (this.attachedRenderers.get(i).participant != null) {
                arrayList.remove(this.attachedRenderers.get(i).participant);
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
        float f;
        float f2;
        LinearLayout linearLayout = this.scheduleTimerContainer;
        float f3 = 1.0f;
        if ((linearLayout == null || this.call != null) && this.scheduleAnimator == null) {
            this.scheduleButtonsScale = 1.0f;
            this.switchToButtonInt2 = 1.0f;
            this.switchToButtonProgress = 1.0f;
            if (linearLayout == null) {
                return;
            }
        }
        int i = 4;
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
                this.leaveItem.setText(LocaleController.getString("VoipChannelCancelChat", R.string.VoipChannelCancelChat));
            } else {
                this.leaveItem.setText(LocaleController.getString("VoipGroupCancelChat", R.string.VoipGroupCancelChat));
            }
        }
        float f4 = this.switchToButtonProgress;
        if (f4 > 0.6f) {
            f2 = 1.05f - (CubicBezierInterpolator.DEFAULT.getInterpolation((f4 - 0.6f) / 0.4f) * 0.05f);
            this.scheduleButtonsScale = f2;
            this.switchToButtonInt2 = 1.0f;
            f = 1.0f;
        } else {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            this.scheduleButtonsScale = (cubicBezierInterpolator.getInterpolation(f4 / 0.6f) * 0.05f) + 1.0f;
            this.switchToButtonInt2 = cubicBezierInterpolator.getInterpolation(this.switchToButtonProgress / 0.6f);
            f2 = 1.05f * cubicBezierInterpolator.getInterpolation(this.switchToButtonProgress / 0.6f);
            f = this.switchToButtonProgress / 0.6f;
        }
        float dp = isLandscapeMode ? (AndroidUtilities.dp(52.0f) * f2) / (this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) : f2;
        float f5 = 1.0f - f;
        this.leaveButton.setAlpha(f);
        VoIPToggleButton voIPToggleButton = this.soundButton;
        if (!voIPToggleButton.isEnabled()) {
            f3 = 0.5f;
        }
        voIPToggleButton.setAlpha(f3 * f);
        this.muteButton.setAlpha(f);
        this.scheduleTimerContainer.setAlpha(f5);
        this.scheduleStartInTextView.setAlpha(f);
        this.scheduleStartAtTextView.setAlpha(f);
        this.scheduleTimeTextView.setAlpha(f);
        this.muteLabel[0].setAlpha(f);
        this.scheduleTimeTextView.setScaleX(f2);
        this.scheduleTimeTextView.setScaleY(f2);
        this.leaveButton.setScaleX(f2);
        this.leaveButton.setScaleY(f2);
        this.soundButton.setScaleX(f2);
        this.soundButton.setScaleY(f2);
        this.muteButton.setScaleX(dp);
        this.muteButton.setScaleY(dp);
        this.scheduleButtonTextView.setScaleX(f5);
        this.scheduleButtonTextView.setScaleY(f5);
        this.scheduleButtonTextView.setAlpha(f5);
        this.scheduleInfoTextView.setAlpha(f5);
        this.cameraButton.setAlpha(f);
        this.cameraButton.setScaleY(f2);
        this.cameraButton.setScaleX(f2);
        this.flipButton.setAlpha(f);
        this.flipButton.setScaleY(f2);
        this.flipButton.setScaleX(f2);
        this.otherItem.setAlpha(f);
        if (f5 != 0.0f) {
            i = 0;
        }
        if (i != this.scheduleTimerContainer.getVisibility()) {
            this.scheduleTimerContainer.setVisibility(i);
            this.scheduleButtonTextView.setVisibility(i);
        }
    }

    private void initCreatedGroupCall() {
        VoIPService sharedInstance;
        String str;
        int i;
        if (!this.callInitied && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.callInitied = true;
            this.oldParticipants.addAll(this.call.visibleParticipants);
            this.oldVideoParticipants.addAll(this.visibleVideoParticipants);
            this.oldInvited.addAll(this.call.invitedUsers);
            this.currentCallState = sharedInstance.getCallState();
            if (this.call == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.call = call;
                this.fullscreenAdapter.setGroupCall(call);
                this.renderersContainer.setGroupCall(this.call);
                this.tabletGridAdapter.setGroupCall(this.call);
            }
            this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.call.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            SimpleTextView simpleTextView = this.scheduleTimeTextView;
            if (simpleTextView == null || simpleTextView.getVisibility() != 0) {
                return;
            }
            this.leaveButton.setData(isRtmpStream() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, Theme.getColor("voipgroup_leaveButton"), 0.3f, false, LocaleController.getString("VoipGroupLeave", R.string.VoipGroupLeave), false, true);
            updateSpeakerPhoneIcon(true);
            ActionBarMenuSubItem actionBarMenuSubItem = this.leaveItem;
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                i = R.string.VoipChannelEndChat;
                str = "VoipChannelEndChat";
            } else {
                i = R.string.VoipGroupEndChat;
                str = "VoipGroupEndChat";
            }
            actionBarMenuSubItem.setText(LocaleController.getString(str, i));
            this.listView.setVisibility(0);
            this.pipItem.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.listView, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.listView, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, View.SCALE_Y, 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, View.SCALE_Y, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, View.SCALE_Y, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.pipItem, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, View.ALPHA, 0.0f, 1.0f));
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.45
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
    }

    public void updateSubtitle() {
        boolean z;
        if (this.actionBar == null || this.call == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.call.currentSpeakingPeers.size(); i2++) {
            long keyAt = this.call.currentSpeakingPeers.keyAt(i2);
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.call.currentSpeakingPeers.get(keyAt);
            if (!tLRPC$TL_groupCallParticipant.self && !this.renderersContainer.isVisible(tLRPC$TL_groupCallParticipant) && this.visiblePeerIds.get(keyAt, 0) != 1) {
                long peerId = MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                }
                if (i < 2) {
                    TLRPC$User user = peerId > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)) : null;
                    TLRPC$Chat chat = peerId <= 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId)) : null;
                    if (user != null || chat != null) {
                        if (i != 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        if (user != null) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getFirstName(user));
                            }
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            spannableStringBuilder.append(chat.title, new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0);
                        } else {
                            spannableStringBuilder.append((CharSequence) chat.title);
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
        if (z == this.drawSpeakingSubtitle) {
            return;
        }
        this.drawSpeakingSubtitle = z;
        this.actionBar.invalidate();
        float f = 0.0f;
        this.actionBar.getSubtitleTextView().setPivotX(0.0f);
        this.actionBar.getSubtitleTextView().setPivotY(this.actionBar.getMeasuredHeight() >> 1);
        ViewPropertyAnimator scaleY = this.actionBar.getSubtitleTextView().animate().scaleX(this.drawSpeakingSubtitle ? 0.98f : 1.0f).scaleY(this.drawSpeakingSubtitle ? 0.9f : 1.0f);
        if (!this.drawSpeakingSubtitle) {
            f = 1.0f;
        }
        scaleY.alpha(f).setDuration(150L);
        AndroidUtilities.updateViewVisibilityAnimated(this.actionBar.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 2048);
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
                this.attachedRenderersTmp.get(i).saveThumb();
                this.renderersContainer.removeView(this.attachedRenderersTmp.get(i));
                this.attachedRenderersTmp.get(i).release();
                this.attachedRenderersTmp.get(i).forceDetach(true);
            }
            this.attachedRenderers.clear();
            if (this.renderersContainer.getParent() != null) {
                this.attachedRenderers.clear();
                this.containerView.removeView(this.renderersContainer);
            }
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 2048);
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

    public float getColorProgress() {
        return this.colorProgress;
    }

    private void updateTitle(boolean z) {
        ChatObject.Call call = this.call;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.titleTextView.setText(LocaleController.getString("VoipChannelScheduleVoiceChat", R.string.VoipChannelScheduleVoiceChat), z);
                return;
            } else {
                this.titleTextView.setText(LocaleController.getString("VoipGroupScheduleVoiceChat", R.string.VoipGroupScheduleVoiceChat), z);
                return;
            }
        }
        if (!TextUtils.isEmpty(call.call.title)) {
            if (!this.call.call.title.equals(this.actionBar.getTitle())) {
                if (z) {
                    this.actionBar.setTitleAnimated(this.call.call.title, true, 180L);
                    this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda15
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupCallActivity.this.lambda$updateTitle$36(view);
                        }
                    });
                } else {
                    this.actionBar.setTitle(this.call.call.title);
                }
                this.titleTextView.setText(this.call.call.title, z);
            }
        } else if (!this.currentChat.title.equals(this.actionBar.getTitle())) {
            if (z) {
                this.actionBar.setTitleAnimated(this.currentChat.title, true, 180L);
                this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda16
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GroupCallActivity.this.lambda$updateTitle$37(view);
                    }
                });
            } else {
                this.actionBar.setTitle(this.currentChat.title);
            }
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.titleTextView.setText(LocaleController.getString("VoipChannelVoiceChat", R.string.VoipChannelVoiceChat), z);
            } else {
                this.titleTextView.setText(LocaleController.getString("VoipGroupVoiceChat", R.string.VoipGroupVoiceChat), z);
            }
        }
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (this.call.recording) {
            if (titleTextView.getRightDrawable() != null) {
                return;
            }
            titleTextView.setRightDrawable(new SmallRecordCallDrawable(titleTextView));
            TextView textView = this.titleTextView.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(textView), (Drawable) null);
            TextView nextTextView = this.titleTextView.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(nextTextView), (Drawable) null);
        } else if (titleTextView.getRightDrawable() == null) {
        } else {
            titleTextView.setRightDrawable((Drawable) null);
            this.titleTextView.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.titleTextView.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public /* synthetic */ void lambda$updateTitle$36(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public /* synthetic */ void lambda$updateTitle$37(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public void setColorProgress(float f) {
        this.colorProgress = f;
        GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
        float max = Math.max(f, groupCallRenderersContainer == null ? 0.0f : groupCallRenderersContainer.progressToFullscreenMode);
        int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_actionBarUnscrolled"), Theme.getColor("voipgroup_actionBar"), f, 1.0f);
        this.backgroundColor = offsetColor;
        this.actionBarBackground.setBackgroundColor(offsetColor);
        this.otherItem.redrawPopup(-14472653);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_actionBarUnscrolled"), Theme.getColor("voipgroup_actionBar"), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_listViewBackgroundUnscrolled"), Theme.getColor("voipgroup_listViewBackground"), f, 1.0f);
        this.listViewBackgroundPaint.setColor(offsetColor2);
        this.listView.setGlowColor(offsetColor2);
        int i = this.muteButtonState;
        if (i == 3 || isGradientState(i)) {
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_leaveButton"), Theme.getColor("voipgroup_leaveButtonScrolled"), f, 1.0f);
        this.leaveButton.setBackgroundColor(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_lastSeenTextUnscrolled"), Theme.getColor("voipgroup_lastSeenText"), f, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_mutedIconUnscrolled"), Theme.getColor("voipgroup_mutedIcon"), f, 1.0f);
        int childCount = this.listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof GroupCallTextCell) {
                ((GroupCallTextCell) childAt).setColors(offsetColor5, offsetColor4);
            } else if (childAt instanceof GroupCallUserCell) {
                ((GroupCallUserCell) childAt).setGrayIconColor(this.actionBar.getTag() != null ? "voipgroup_mutedIcon" : "voipgroup_mutedIconUnscrolled", offsetColor5);
            } else if (childAt instanceof GroupCallInvitedCell) {
                ((GroupCallInvitedCell) childAt).setGrayIconColor(this.actionBar.getTag() != null ? "voipgroup_mutedIcon" : "voipgroup_mutedIconUnscrolled", offsetColor5);
            }
        }
        this.containerView.invalidate();
        this.listView.invalidate();
        this.container.invalidate();
    }

    public void getLink(final boolean z) {
        String str;
        TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported;
        TLRPC$Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(this.currentChat.id));
        if (chat != null && TextUtils.isEmpty(chat.username)) {
            final TLRPC$ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(this.currentChat.id);
            if (!TextUtils.isEmpty(this.currentChat.username)) {
                str = this.accountInstance.getMessagesController().linkPrefix + "/" + this.currentChat.username;
            } else {
                str = (chatFull == null || (tLRPC$TL_chatInviteExported = chatFull.exported_invite) == null) ? null : tLRPC$TL_chatInviteExported.link;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC$TL_messages_exportChatInvite tLRPC$TL_messages_exportChatInvite = new TLRPC$TL_messages_exportChatInvite();
                tLRPC$TL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.currentChat);
                this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda54
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.this.lambda$getLink$39(chatFull, z, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            openShareAlert(true, null, str, z);
        } else if (this.call == null) {
        } else {
            final int i = 0;
            while (i < 2) {
                TLRPC$TL_phone_exportGroupCallInvite tLRPC$TL_phone_exportGroupCallInvite = new TLRPC$TL_phone_exportGroupCallInvite();
                tLRPC$TL_phone_exportGroupCallInvite.call = this.call.getInputGroupCall();
                tLRPC$TL_phone_exportGroupCallInvite.can_self_unmute = i == 1;
                this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_exportGroupCallInvite, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda51
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.this.lambda$getLink$41(i, z, tLObject, tLRPC$TL_error);
                    }
                });
                i++;
            }
        }
    }

    public /* synthetic */ void lambda$getLink$39(final TLRPC$ChatFull tLRPC$ChatFull, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$getLink$38(tLObject, tLRPC$ChatFull, z);
            }
        });
    }

    public /* synthetic */ void lambda$getLink$38(TLObject tLObject, TLRPC$ChatFull tLRPC$ChatFull, boolean z) {
        if (tLObject instanceof TLRPC$TL_chatInviteExported) {
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = (TLRPC$TL_chatInviteExported) tLObject;
            if (tLRPC$ChatFull != null) {
                tLRPC$ChatFull.exported_invite = tLRPC$TL_chatInviteExported;
            } else {
                openShareAlert(true, null, tLRPC$TL_chatInviteExported.link, z);
            }
        }
    }

    public /* synthetic */ void lambda$getLink$41(final int i, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$getLink$40(tLObject, i, z);
            }
        });
    }

    public /* synthetic */ void lambda$getLink$40(TLObject tLObject, int i, boolean z) {
        if (tLObject instanceof TLRPC$TL_phone_exportedGroupCallInvite) {
            this.invites[i] = ((TLRPC$TL_phone_exportedGroupCallInvite) tLObject).link;
        } else {
            this.invites[i] = "";
        }
        for (int i2 = 0; i2 < 2; i2++) {
            String[] strArr = this.invites;
            if (strArr[i2] == null) {
                return;
            }
            if (strArr[i2].length() == 0) {
                this.invites[i2] = null;
            }
        }
        if (!z && ChatObject.canManageCalls(this.currentChat) && !this.call.call.join_muted) {
            this.invites[0] = null;
        }
        String[] strArr2 = this.invites;
        if (strArr2[0] == null && strArr2[1] == null && !TextUtils.isEmpty(this.currentChat.username)) {
            openShareAlert(true, null, this.accountInstance.getMessagesController().linkPrefix + "/" + this.currentChat.username, z);
            return;
        }
        String[] strArr3 = this.invites;
        openShareAlert(false, strArr3[0], strArr3[1], z);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void openShareAlert(boolean z, String str, String str2, boolean z2) {
        boolean z3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = isRtmpStream() ? null : str2;
        if (z2) {
            if (str != null) {
                str7 = str;
            }
            AndroidUtilities.addToClipboard(str7);
            if (!AndroidUtilities.shouldShowClipboardToast()) {
                return;
            }
            getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
            return;
        }
        LaunchActivity launchActivity = this.parentActivity;
        if (launchActivity != null) {
            BaseFragment baseFragment = launchActivity.getActionBarLayout().fragmentsStack.get(this.parentActivity.getActionBarLayout().fragmentsStack.size() - 1);
            if (baseFragment instanceof ChatActivity) {
                boolean needEnterText = ((ChatActivity) baseFragment).needEnterText();
                this.anyEnterEventSent = true;
                this.enterEventSent = true;
                z3 = needEnterText;
                if (str == null && str7 == null) {
                    str4 = str;
                    str3 = null;
                } else {
                    str3 = str;
                    str4 = str7;
                }
                if (str3 == null || !z) {
                    str5 = str4;
                } else {
                    if (ChatObject.isChannelOrGiga(this.currentChat)) {
                        str6 = LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4);
                    } else {
                        str6 = LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
                    }
                    str5 = str6;
                }
                ShareAlert shareAlert = new ShareAlert(getContext(), null, null, str5, str3, false, str4, str3, false, true) { // from class: org.telegram.ui.GroupCallActivity.46
                    @Override // org.telegram.ui.Components.ShareAlert
                    protected void onSend(LongSparseArray<TLRPC$Dialog> longSparseArray, int i) {
                        if (longSparseArray.size() == 1) {
                            GroupCallActivity.this.getUndoView().showWithAction(longSparseArray.valueAt(0).id, 41, Integer.valueOf(i));
                        } else {
                            GroupCallActivity.this.getUndoView().showWithAction(0L, 41, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                        }
                    }
                };
                this.shareAlert = shareAlert;
                shareAlert.setDelegate(new ShareAlert.ShareAlertDelegate() { // from class: org.telegram.ui.GroupCallActivity.47
                    @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
                    public /* synthetic */ void didShare() {
                        ShareAlert.ShareAlertDelegate.CC.$default$didShare(this);
                    }

                    @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
                    public boolean didCopy() {
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            GroupCallActivity.this.getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                            return true;
                        }
                        return true;
                    }
                });
                this.shareAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda11
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GroupCallActivity.this.lambda$openShareAlert$42(dialogInterface);
                    }
                });
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda33
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupCallActivity.this.lambda$openShareAlert$43();
                    }
                }, !z3 ? 200L : 0L);
            }
        }
        z3 = false;
        if (str == null) {
        }
        str3 = str;
        str4 = str7;
        if (str3 == null) {
        }
        str5 = str4;
        ShareAlert shareAlert2 = new ShareAlert(getContext(), null, null, str5, str3, false, str4, str3, false, true) { // from class: org.telegram.ui.GroupCallActivity.46
            @Override // org.telegram.ui.Components.ShareAlert
            protected void onSend(LongSparseArray<TLRPC$Dialog> longSparseArray, int i) {
                if (longSparseArray.size() == 1) {
                    GroupCallActivity.this.getUndoView().showWithAction(longSparseArray.valueAt(0).id, 41, Integer.valueOf(i));
                } else {
                    GroupCallActivity.this.getUndoView().showWithAction(0L, 41, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                }
            }
        };
        this.shareAlert = shareAlert2;
        shareAlert2.setDelegate(new ShareAlert.ShareAlertDelegate() { // from class: org.telegram.ui.GroupCallActivity.47
            @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
            public /* synthetic */ void didShare() {
                ShareAlert.ShareAlertDelegate.CC.$default$didShare(this);
            }

            @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
            public boolean didCopy() {
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    GroupCallActivity.this.getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                    return true;
                }
                return true;
            }
        });
        this.shareAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$openShareAlert$42(dialogInterface);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$openShareAlert$43();
            }
        }, !z3 ? 200L : 0L);
    }

    public /* synthetic */ void lambda$openShareAlert$42(DialogInterface dialogInterface) {
        this.shareAlert = null;
    }

    public /* synthetic */ void lambda$openShareAlert$43() {
        ShareAlert shareAlert = this.shareAlert;
        if (shareAlert != null) {
            shareAlert.show();
        }
    }

    public void inviteUserToCall(final long j, final boolean z) {
        final TLRPC$User user;
        if (this.call == null || (user = this.accountInstance.getMessagesController().getUser(Long.valueOf(j))) == null) {
            return;
        }
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3)};
        final TLRPC$TL_phone_inviteToGroupCall tLRPC$TL_phone_inviteToGroupCall = new TLRPC$TL_phone_inviteToGroupCall();
        tLRPC$TL_phone_inviteToGroupCall.call = this.call.getInputGroupCall();
        TLRPC$TL_inputUser tLRPC$TL_inputUser = new TLRPC$TL_inputUser();
        tLRPC$TL_inputUser.user_id = user.id;
        tLRPC$TL_inputUser.access_hash = user.access_hash;
        tLRPC$TL_phone_inviteToGroupCall.users.add(tLRPC$TL_inputUser);
        final int sendRequest = this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_inviteToGroupCall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda52
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                GroupCallActivity.this.lambda$inviteUserToCall$46(j, alertDialogArr, user, z, tLRPC$TL_phone_inviteToGroupCall, tLObject, tLRPC$TL_error);
            }
        });
        if (sendRequest == 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$inviteUserToCall$48(alertDialogArr, sendRequest);
            }
        }, 500L);
    }

    public /* synthetic */ void lambda$inviteUserToCall$46(final long j, final AlertDialog[] alertDialogArr, final TLRPC$User tLRPC$User, final boolean z, final TLRPC$TL_phone_inviteToGroupCall tLRPC$TL_phone_inviteToGroupCall, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            this.accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$44(j, alertDialogArr, tLRPC$User);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$inviteUserToCall$45(alertDialogArr, z, tLRPC$TL_error, j, tLRPC$TL_phone_inviteToGroupCall);
            }
        });
    }

    public /* synthetic */ void lambda$inviteUserToCall$44(long j, AlertDialog[] alertDialogArr, TLRPC$User tLRPC$User) {
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
        getUndoView().showWithAction(0L, 34, tLRPC$User, this.currentChat, (Runnable) null, (Runnable) null);
    }

    public /* synthetic */ void lambda$inviteUserToCall$45(AlertDialog[] alertDialogArr, boolean z, TLRPC$TL_error tLRPC$TL_error, long j, TLRPC$TL_phone_inviteToGroupCall tLRPC$TL_phone_inviteToGroupCall) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        if (z && "USER_NOT_PARTICIPANT".equals(tLRPC$TL_error.text)) {
            processSelectedOption(null, j, 3);
            return;
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.parentActivity.getActionBarLayout().fragmentsStack.get(this.parentActivity.getActionBarLayout().fragmentsStack.size() - 1), tLRPC$TL_phone_inviteToGroupCall, new Object[0]);
    }

    public /* synthetic */ void lambda$inviteUserToCall$48(AlertDialog[] alertDialogArr, final int i) {
        if (alertDialogArr[0] == null) {
            return;
        }
        alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$inviteUserToCall$47(i, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    public /* synthetic */ void lambda$inviteUserToCall$47(int i, DialogInterface dialogInterface) {
        this.accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    public void invalidateActionBarAlpha() {
        ActionBar actionBar = this.actionBar;
        actionBar.setAlpha((actionBar.getTag() != null ? 1.0f : 0.0f) * (1.0f - this.renderersContainer.progressToFullscreenMode));
    }

    public void updateLayout(boolean z) {
        int childCount = this.listView.getChildCount();
        boolean z2 = false;
        float f = 2.14748365E9f;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (this.listView.getChildAdapterPosition(childAt) >= 0) {
                f = Math.min(f, childAt.getTop());
            }
        }
        float f2 = 0.0f;
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
            float f3 = 0.9f;
            ViewPropertyAnimator scaleX = this.actionBar.getBackButton().animate().scaleX(z3 ? 1.0f : 0.9f);
            if (z3) {
                f3 = 1.0f;
            }
            ViewPropertyAnimator duration = scaleX.scaleY(f3).translationX(z3 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
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
            float[] fArr = new float[2];
            fArr[0] = this.actionBar.getSubtitleTextView().getTranslationY();
            fArr[1] = z3 ? 0.0f : AndroidUtilities.dp(20.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, fArr);
            this.subtitleYAnimator = ofFloat;
            ofFloat.setDuration(300L);
            this.subtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            this.subtitleYAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.48
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
            SimpleTextView additionalSubtitleTextView = this.actionBar.getAdditionalSubtitleTextView();
            Property property2 = View.TRANSLATION_Y;
            float[] fArr2 = new float[1];
            fArr2[0] = z3 ? 0.0f : AndroidUtilities.dp(20.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property2, fArr2);
            this.additionalSubtitleYAnimator = ofFloat2;
            ofFloat2.setDuration(300L);
            this.additionalSubtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            this.additionalSubtitleYAnimator.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = this.actionBarAnimation;
            Animator[] animatorArr = new Animator[3];
            ActionBar actionBar = this.actionBar;
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[0] = z3 ? 1.0f : 0.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(actionBar, property3, fArr3);
            View view = this.actionBarBackground;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = z3 ? 1.0f : 0.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(view, property4, fArr4);
            View view2 = this.actionBarShadow;
            Property property5 = View.ALPHA;
            float[] fArr5 = new float[1];
            if (z3) {
                f2 = 1.0f;
            }
            fArr5[0] = f2;
            animatorArr[2] = ObjectAnimator.ofFloat(view2, property5, fArr5);
            animatorSet3.playTogether(animatorArr);
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.49
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    GroupCallActivity.this.actionBarAnimation = null;
                }
            });
            this.actionBarAnimation.start();
            ImageView imageView = this.renderersContainer.pipView;
            if (!z3 || isLandscapeMode) {
                z2 = true;
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
        int dp;
        int i;
        this.scrollOffsetY = f;
        this.listView.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) this.listView.getLayoutParams()).topMargin));
        float dp2 = f - AndroidUtilities.dp(74.0f);
        if (this.backgroundPaddingTop + dp2 < ActionBar.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((ActionBar.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)) + ActionBar.getCurrentActionBarHeight()));
            i = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (Math.abs(Math.min(1.0f, min) - this.colorProgress) > 1.0E-4f) {
                setColorProgress(Math.min(1.0f, min));
            }
            float f2 = 1.0f - ((0.1f * min) * 1.2f);
            this.titleTextView.setScaleX(Math.max(0.9f, f2));
            this.titleTextView.setScaleY(Math.max(0.9f, f2));
            this.titleTextView.setAlpha(Math.max(0.0f, 1.0f - (min * 1.2f)) * (1.0f - this.renderersContainer.progressToFullscreenMode));
        } else {
            i = 0;
            this.titleTextView.setScaleX(1.0f);
            this.titleTextView.setScaleY(1.0f);
            this.titleTextView.setAlpha(1.0f - this.renderersContainer.progressToFullscreenMode);
            if (this.colorProgress > 1.0E-4f) {
                setColorProgress(0.0f);
            }
        }
        float f3 = i;
        this.menuItemsContainer.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(53.0f)) - f3));
        this.titleTextView.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f3));
        LinearLayout linearLayout = this.scheduleTimerContainer;
        if (linearLayout != null) {
            linearLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f3));
        }
        this.containerView.invalidate();
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

    /* JADX WARN: Removed duplicated region for block: B:144:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateState(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        GroupCallRenderersContainer groupCallRenderersContainer;
        int i3;
        ChatObject.Call call = this.call;
        int i4 = 6;
        int i5 = 5;
        boolean z5 = false;
        if (call == null || call.isScheduled()) {
            if (!ChatObject.canManageCalls(this.currentChat)) {
                if (this.call.call.schedule_start_subscribed) {
                    i4 = 7;
                }
                i5 = i4;
            }
            updateMuteButton(i5, z);
            this.leaveButton.setData(isRtmpStream() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, Theme.getColor("voipgroup_leaveButton"), 0.3f, false, LocaleController.getString("Close", R.string.Close), false, false);
            updateScheduleUI(false);
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (!sharedInstance.isSwitchingStream() && ((this.creatingServiceTime == 0 || Math.abs(SystemClock.elapsedRealtime() - this.creatingServiceTime) > 3000) && ((i3 = this.currentCallState) == 1 || i3 == 2 || i3 == 6 || i3 == 5))) {
            cancelMutePress();
            updateMuteButton(3, z);
        } else {
            if (this.userSwitchObject != null) {
                getUndoView().showWithAction(0L, 37, this.userSwitchObject, this.currentChat, (Runnable) null, (Runnable) null);
                this.userSwitchObject = null;
            }
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
            if (!sharedInstance.micSwitching && tLRPC$TL_groupCallParticipant != null && !tLRPC$TL_groupCallParticipant.can_self_unmute && tLRPC$TL_groupCallParticipant.muted && !ChatObject.canManageCalls(this.currentChat)) {
                cancelMutePress();
                if (tLRPC$TL_groupCallParticipant.raise_hand_rating != 0) {
                    updateMuteButton(4, z);
                } else {
                    updateMuteButton(2, z);
                }
                sharedInstance.setMicMute(true, false, false);
            } else {
                boolean isMicMute = sharedInstance.isMicMute();
                if (!sharedInstance.micSwitching && z2 && tLRPC$TL_groupCallParticipant != null && tLRPC$TL_groupCallParticipant.muted && !isMicMute) {
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
        boolean z6 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        if ((((tLRPC$TL_groupCallParticipant2 != null && !tLRPC$TL_groupCallParticipant2.can_self_unmute && tLRPC$TL_groupCallParticipant2.muted && !ChatObject.canManageCalls(this.currentChat)) || !this.call.canRecordVideo()) && !z6) || isRtmpStream()) {
            z4 = false;
            z3 = true;
        } else {
            z4 = true;
            z3 = false;
        }
        if (z6) {
            if (z && this.flipButton.getVisibility() != 0) {
                this.flipButton.setScaleX(0.3f);
                this.flipButton.setScaleY(0.3f);
            }
            i = 1;
        } else {
            i = 0;
        }
        int i6 = i + (z3 ? 2 : 0) + (z4 ? 4 : 0);
        GroupCallRenderersContainer groupCallRenderersContainer2 = this.renderersContainer;
        int i7 = i6 + ((groupCallRenderersContainer2 == null || !groupCallRenderersContainer2.inFullscreenMode) ? 0 : 8);
        int i8 = this.buttonsVisibility;
        if (i8 != 0 && i8 != i7 && z) {
            for (int i9 = 0; i9 < this.buttonsContainer.getChildCount(); i9++) {
                View childAt = this.buttonsContainer.getChildAt(i9);
                if (childAt.getVisibility() == 0) {
                    this.buttonsAnimationParamsX.put(childAt, Float.valueOf(childAt.getX()));
                    this.buttonsAnimationParamsY.put(childAt, Float.valueOf(childAt.getY()));
                }
            }
            this.animateButtonsOnNextLayout = true;
        }
        boolean z7 = (this.buttonsVisibility | 2) != (i7 | 2);
        this.buttonsVisibility = i7;
        if (z4) {
            i2 = 8;
            this.cameraButton.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString("VoipCamera", R.string.VoipCamera), !z6, z);
            this.cameraButton.setChecked(true, false);
        } else {
            i2 = 8;
            this.cameraButton.setVisibility(8);
        }
        if (i != 0) {
            this.flipButton.setData(0, -1, 0, 1.0f, true, LocaleController.getString("VoipFlip", R.string.VoipFlip), false, false);
            this.flipButton.setChecked(true, false);
        } else {
            this.flipButton.setVisibility(i2);
        }
        boolean z8 = this.soundButton.getVisibility() == 0;
        this.soundButton.setVisibility(z3 ? 0 : 8);
        if (z7 && z3) {
            updateSpeakerPhoneIcon(false);
        }
        if (z7) {
            float f4 = z3 ? 1.0f : 0.3f;
            if (!z) {
                this.soundButton.animate().cancel();
                this.soundButton.setScaleX(f4);
                this.soundButton.setScaleY(f4);
            } else {
                if (z3 && !z8) {
                    this.soundButton.setScaleX(0.3f);
                    this.soundButton.setScaleY(0.3f);
                }
                this.soundButton.animate().scaleX(f4).scaleY(f4).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                if (this.cameraButton.getVisibility() != 0) {
                    this.cameraButton.showText(true, z);
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                if (this.cameraButtonScale != f) {
                    this.cameraButtonScale = f;
                    if (!z) {
                        this.cameraButton.animate().cancel();
                        this.cameraButton.setScaleX(f);
                        this.cameraButton.setScaleY(f);
                    } else {
                        this.cameraButton.animate().scaleX(f).scaleY(f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                }
                f2 = 0.8f;
                if (!isTabletMode && (isLandscapeMode || ((groupCallRenderersContainer = this.renderersContainer) != null && groupCallRenderersContainer.inFullscreenMode))) {
                    f2 = 1.0f;
                }
                if (!z6) {
                    f2 = 0.3f;
                }
                if (z) {
                    this.flipButton.animate().cancel();
                    this.flipButton.setScaleX(f2);
                    this.flipButton.setScaleY(f2);
                } else {
                    this.flipButton.animate().scaleX(f2).scaleY(f2).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
                VoIPToggleButton voIPToggleButton = this.flipButton;
                if (f2 == 1.0f) {
                    z5 = true;
                }
                voIPToggleButton.showText(z5, z);
                f3 = !z6 ? 0.3f : 1.0f;
                if (this.soundButtonScale != f3) {
                    return;
                }
                this.soundButtonScale = f3;
                if (!z) {
                    this.soundButton.animate().cancel();
                    this.soundButton.setScaleX(f3);
                    this.soundButton.setScaleY(f3);
                    return;
                }
                this.soundButton.animate().scaleX(f3).scaleY(f3).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                return;
            }
        }
        if (this.cameraButton.getVisibility() != 0) {
        }
        if (this.cameraButtonScale != f) {
        }
        f2 = 0.8f;
        if (!isTabletMode) {
            f2 = 1.0f;
        }
        if (!z6) {
        }
        if (z) {
        }
        VoIPToggleButton voIPToggleButton2 = this.flipButton;
        if (f2 == 1.0f) {
        }
        voIPToggleButton2.showText(z5, z);
        if (!z6) {
        }
        if (this.soundButtonScale != f3) {
        }
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
            this.attachedRenderersTmp.get(i).updateAttachState(true);
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
            this.soundButton.setData(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString("VoipChatShare", R.string.VoipChatShare), false, z);
            this.soundButton.setEnabled(!TextUtils.isEmpty(this.currentChat.username) || (ChatObject.hasAdminRights(this.currentChat) && ChatObject.canAddUsers(this.currentChat)), false);
            this.soundButton.setChecked(true, false);
            return;
        }
        this.soundButton.setEnabled(true, z);
        boolean z3 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        if (!z3 && sharedInstance.isSpeakerphoneOn()) {
            z2 = true;
        }
        if (z3) {
            this.soundButton.setData(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth), false, z);
        } else if (z2) {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            this.soundButton.setData(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString("VoipAudioRoutingHeadset", R.string.VoipAudioRoutingHeadset), false, z);
        } else {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker), false, z);
        }
        this.soundButton.setChecked(z2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateMuteButton(int i, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        int i2;
        boolean z4;
        boolean customEndFrame;
        GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
        boolean z5 = groupCallRenderersContainer != null && groupCallRenderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode());
        if (isRtmpStream() || this.muteButtonState != i || !z) {
            ValueAnimator valueAnimator = this.muteButtonAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.muteButtonAnimator = null;
            }
            ValueAnimator valueAnimator2 = this.expandAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.expandAnimator = null;
            }
            if (i == 7) {
                str2 = LocaleController.getString("VoipGroupCancelReminder", R.string.VoipGroupCancelReminder);
                customEndFrame = this.bigMicDrawable.setCustomEndFrame(202);
            } else if (i == 6) {
                str2 = LocaleController.getString("VoipGroupSetReminder", R.string.VoipGroupSetReminder);
                customEndFrame = this.bigMicDrawable.setCustomEndFrame(344);
            } else if (i == 5) {
                str2 = LocaleController.getString("VoipGroupStartNow", R.string.VoipGroupStartNow);
                customEndFrame = this.bigMicDrawable.setCustomEndFrame(377);
            } else {
                if (i == 0) {
                    str2 = LocaleController.getString("VoipGroupUnmute", R.string.VoipGroupUnmute);
                    str = LocaleController.getString("VoipHoldAndTalk", R.string.VoipHoldAndTalk);
                    int i3 = this.muteButtonState;
                    if (i3 == 3) {
                        int customEndFrame2 = this.bigMicDrawable.getCustomEndFrame();
                        z3 = (customEndFrame2 == 136 || customEndFrame2 == 173 || customEndFrame2 == 274 || customEndFrame2 == 311) ? this.bigMicDrawable.setCustomEndFrame(99) : false;
                    } else if (i3 == 5) {
                        z3 = this.bigMicDrawable.setCustomEndFrame(404);
                    } else if (i3 == 7) {
                        z3 = this.bigMicDrawable.setCustomEndFrame(376);
                    } else if (i3 == 6) {
                        z3 = this.bigMicDrawable.setCustomEndFrame(237);
                    } else if (i3 == 2) {
                        z3 = this.bigMicDrawable.setCustomEndFrame(36);
                    } else {
                        z3 = this.bigMicDrawable.setCustomEndFrame(99);
                    }
                } else if (i == 1) {
                    str2 = LocaleController.getString("VoipTapToMute", R.string.VoipTapToMute);
                    customEndFrame = this.bigMicDrawable.setCustomEndFrame(this.muteButtonState == 4 ? 99 : 69);
                } else if (i == 4) {
                    str2 = LocaleController.getString("VoipMutedTapedForSpeak", R.string.VoipMutedTapedForSpeak);
                    str = LocaleController.getString("VoipMutedTapedForSpeakInfo", R.string.VoipMutedTapedForSpeakInfo);
                    z3 = this.bigMicDrawable.setCustomEndFrame(136);
                } else {
                    TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
                    boolean z6 = tLRPC$TL_groupCallParticipant != null && !tLRPC$TL_groupCallParticipant.can_self_unmute && tLRPC$TL_groupCallParticipant.muted && !ChatObject.canManageCalls(this.currentChat);
                    if (z6) {
                        int i4 = this.muteButtonState;
                        if (i4 == 7) {
                            z4 = this.bigMicDrawable.setCustomEndFrame(311);
                        } else if (i4 == 6) {
                            z4 = this.bigMicDrawable.setCustomEndFrame(274);
                        } else if (i4 == 1) {
                            z4 = this.bigMicDrawable.setCustomEndFrame(173);
                        } else {
                            z4 = this.bigMicDrawable.setCustomEndFrame(136);
                        }
                    } else {
                        int i5 = this.muteButtonState;
                        if (i5 == 5) {
                            z4 = this.bigMicDrawable.setCustomEndFrame(404);
                        } else if (i5 == 7) {
                            z4 = this.bigMicDrawable.setCustomEndFrame(376);
                        } else if (i5 == 6) {
                            z4 = this.bigMicDrawable.setCustomEndFrame(237);
                        } else if (i5 == 2 || i5 == 4) {
                            z4 = this.bigMicDrawable.setCustomEndFrame(36);
                        } else {
                            z4 = this.bigMicDrawable.setCustomEndFrame(99);
                        }
                    }
                    if (i == 3) {
                        z2 = z6;
                        str2 = LocaleController.getString("Connecting", R.string.Connecting);
                        z3 = z4;
                        str = "";
                    } else {
                        z2 = z6;
                        str2 = LocaleController.getString("VoipMutedByAdmin", R.string.VoipMutedByAdmin);
                        z3 = z4;
                        str = LocaleController.getString("VoipMutedTapForSpeak", R.string.VoipMutedTapForSpeak);
                    }
                    if (isRtmpStream() && i != 3 && !this.call.isScheduled()) {
                        str2 = LocaleController.getString(!z5 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                        boolean z7 = this.animatingToFullscreenExpand == z5;
                        this.animatingToFullscreenExpand = z5;
                        z3 = z7;
                        str = "";
                    }
                    this.muteButton.setContentDescription(!TextUtils.isEmpty(str) ? str2 + " " + str : str2);
                    if (z) {
                        if (z3) {
                            if (i == 5) {
                                this.bigMicDrawable.setCurrentFrame(376);
                            } else if (i == 7) {
                                this.bigMicDrawable.setCurrentFrame(173);
                            } else if (i == 6) {
                                this.bigMicDrawable.setCurrentFrame(311);
                            } else if (i == 0) {
                                int i6 = this.muteButtonState;
                                if (i6 == 5) {
                                    this.bigMicDrawable.setCurrentFrame(376);
                                } else if (i6 == 7) {
                                    this.bigMicDrawable.setCurrentFrame(344);
                                } else if (i6 == 6) {
                                    this.bigMicDrawable.setCurrentFrame(202);
                                } else if (i6 == 2) {
                                    i2 = 0;
                                    this.bigMicDrawable.setCurrentFrame(0);
                                    this.muteButton.playAnimation();
                                    this.muteLabel[1].setVisibility(i2);
                                    this.muteLabel[1].setAlpha(0.0f);
                                    this.muteLabel[1].setTranslationY(-AndroidUtilities.dp(5.0f));
                                    this.muteLabel[1].setText(str2);
                                    if (!isRtmpStream() && !this.call.isScheduled()) {
                                        this.muteButton.setAlpha(0.0f);
                                        boolean z8 = this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode());
                                        final ImageView imageView = z8 ? this.expandButton : this.minimizeButton;
                                        final ImageView imageView2 = z8 ? this.minimizeButton : this.expandButton;
                                        final float dp = AndroidUtilities.dp(52.0f) / (this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                                        boolean z9 = !AndroidUtilities.isTablet() ? !(this.renderersContainer.inFullscreenMode || isLandscapeMode) : !this.renderersContainer.inFullscreenMode;
                                        Boolean bool = this.wasExpandBigSize;
                                        boolean z10 = bool == null || z9 != bool.booleanValue();
                                        this.wasExpandBigSize = Boolean.valueOf(z9);
                                        ValueAnimator valueAnimator3 = this.expandSizeAnimator;
                                        if (valueAnimator3 != null) {
                                            valueAnimator3.cancel();
                                            this.expandSizeAnimator = null;
                                        }
                                        if (z10) {
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                            this.expandSizeAnimator = ofFloat;
                                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda3
                                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                                                    GroupCallActivity.this.lambda$updateMuteButton$49(dp, imageView2, valueAnimator4);
                                                }
                                            });
                                            this.expandSizeAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.50
                                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                                public void onAnimationEnd(Animator animator) {
                                                    GroupCallActivity.this.expandSizeAnimator = null;
                                                }
                                            });
                                            this.expandSizeAnimator.start();
                                        } else {
                                            float lerp = isLandscapeMode ? dp : AndroidUtilities.lerp(1.0f, dp, this.renderersContainer.progressToFullscreenMode);
                                            imageView2.setAlpha(1.0f);
                                            imageView2.setScaleX(lerp);
                                            imageView2.setScaleY(lerp);
                                            imageView.setAlpha(0.0f);
                                        }
                                        if (z3) {
                                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                            this.expandAnimator = ofFloat2;
                                            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda4
                                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                                                    GroupCallActivity.this.lambda$updateMuteButton$50(dp, imageView, imageView2, valueAnimator4);
                                                }
                                            });
                                            this.expandAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.51
                                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                                public void onAnimationEnd(Animator animator) {
                                                    GroupCallActivity.this.expandAnimator = null;
                                                }
                                            });
                                            this.expandAnimator.start();
                                        } else {
                                            if (!isLandscapeMode) {
                                                dp = AndroidUtilities.lerp(1.0f, dp, this.renderersContainer.progressToFullscreenMode);
                                            }
                                            imageView2.setAlpha(1.0f);
                                            imageView2.setScaleX(dp);
                                            imageView2.setScaleY(dp);
                                            imageView.setAlpha(0.0f);
                                        }
                                    } else {
                                        this.muteButton.setAlpha(1.0f);
                                        this.expandButton.setAlpha(0.0f);
                                        this.minimizeButton.setAlpha(0.0f);
                                    }
                                    if (z3) {
                                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        this.muteButtonAnimator = ofFloat3;
                                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda0
                                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                                                GroupCallActivity.this.lambda$updateMuteButton$51(valueAnimator4);
                                            }
                                        });
                                        this.muteButtonAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.52
                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public void onAnimationEnd(Animator animator) {
                                                if (GroupCallActivity.this.muteButtonAnimator != null) {
                                                    GroupCallActivity.this.muteButtonAnimator = null;
                                                    TextView textView = GroupCallActivity.this.muteLabel[0];
                                                    GroupCallActivity.this.muteLabel[0] = GroupCallActivity.this.muteLabel[1];
                                                    GroupCallActivity.this.muteLabel[1] = textView;
                                                    textView.setVisibility(4);
                                                    for (int i7 = 0; i7 < 2; i7++) {
                                                        GroupCallActivity.this.muteLabel[i7].setTranslationY(0.0f);
                                                    }
                                                }
                                            }
                                        });
                                        this.muteButtonAnimator.setDuration(180L);
                                        this.muteButtonAnimator.start();
                                    } else {
                                        this.muteLabel[0].setAlpha(0.0f);
                                        this.muteLabel[1].setAlpha(1.0f);
                                        TextView[] textViewArr = this.muteLabel;
                                        TextView textView = textViewArr[0];
                                        textViewArr[0] = textViewArr[1];
                                        textViewArr[1] = textView;
                                        textView.setVisibility(4);
                                        for (int i7 = 0; i7 < 2; i7++) {
                                            this.muteLabel[i7].setTranslationY(0.0f);
                                        }
                                    }
                                    this.muteButtonState = i;
                                } else {
                                    this.bigMicDrawable.setCurrentFrame(69);
                                }
                            } else if (i == 1) {
                                this.bigMicDrawable.setCurrentFrame(this.muteButtonState == 4 ? 69 : 36);
                            } else if (i == 4) {
                                this.bigMicDrawable.setCurrentFrame(99);
                            } else if (z2) {
                                int i8 = this.muteButtonState;
                                if (i8 == 7) {
                                    this.bigMicDrawable.setCurrentFrame(274);
                                } else if (i8 == 6) {
                                    this.bigMicDrawable.setCurrentFrame(237);
                                } else if (i8 == 1) {
                                    this.bigMicDrawable.setCurrentFrame(136);
                                } else {
                                    this.bigMicDrawable.setCurrentFrame(99);
                                }
                            } else {
                                int i9 = this.muteButtonState;
                                if (i9 == 5) {
                                    this.bigMicDrawable.setCurrentFrame(376);
                                } else if (i9 == 7) {
                                    this.bigMicDrawable.setCurrentFrame(344);
                                } else if (i9 == 6) {
                                    this.bigMicDrawable.setCurrentFrame(202);
                                } else if (i9 == 2 || i9 == 4) {
                                    i2 = 0;
                                    this.bigMicDrawable.setCurrentFrame(0);
                                    this.muteButton.playAnimation();
                                    this.muteLabel[1].setVisibility(i2);
                                    this.muteLabel[1].setAlpha(0.0f);
                                    this.muteLabel[1].setTranslationY(-AndroidUtilities.dp(5.0f));
                                    this.muteLabel[1].setText(str2);
                                    if (!isRtmpStream()) {
                                    }
                                    this.muteButton.setAlpha(1.0f);
                                    this.expandButton.setAlpha(0.0f);
                                    this.minimizeButton.setAlpha(0.0f);
                                    if (z3) {
                                    }
                                    this.muteButtonState = i;
                                } else {
                                    this.bigMicDrawable.setCurrentFrame(69);
                                }
                            }
                        }
                        i2 = 0;
                        this.muteButton.playAnimation();
                        this.muteLabel[1].setVisibility(i2);
                        this.muteLabel[1].setAlpha(0.0f);
                        this.muteLabel[1].setTranslationY(-AndroidUtilities.dp(5.0f));
                        this.muteLabel[1].setText(str2);
                        if (!isRtmpStream()) {
                        }
                        this.muteButton.setAlpha(1.0f);
                        this.expandButton.setAlpha(0.0f);
                        this.minimizeButton.setAlpha(0.0f);
                        if (z3) {
                        }
                        this.muteButtonState = i;
                    } else {
                        this.muteButtonState = i;
                        RLottieDrawable rLottieDrawable = this.bigMicDrawable;
                        rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
                        this.muteLabel[0].setText(str2);
                        if (isRtmpStream() && !this.call.isScheduled()) {
                            this.muteButton.setAlpha(0.0f);
                            GroupCallRenderersContainer groupCallRenderersContainer2 = this.renderersContainer;
                            boolean z11 = groupCallRenderersContainer2 != null && groupCallRenderersContainer2.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode());
                            ImageView imageView3 = z11 ? this.expandButton : this.minimizeButton;
                            (z11 ? this.minimizeButton : this.expandButton).setAlpha(1.0f);
                            imageView3.setAlpha(0.0f);
                        } else {
                            this.muteButton.setAlpha(1.0f);
                            this.expandButton.setAlpha(0.0f);
                            this.minimizeButton.setAlpha(0.0f);
                        }
                    }
                    updateMuteButtonState(z);
                }
                z2 = false;
                if (isRtmpStream()) {
                    str2 = LocaleController.getString(!z5 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                    if (this.animatingToFullscreenExpand == z5) {
                    }
                    this.animatingToFullscreenExpand = z5;
                    z3 = z7;
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                }
                this.muteButton.setContentDescription(!TextUtils.isEmpty(str) ? str2 + " " + str : str2);
                if (z) {
                }
                updateMuteButtonState(z);
            }
            z3 = customEndFrame;
            str = "";
            z2 = false;
            if (isRtmpStream()) {
            }
            if (!TextUtils.isEmpty(str)) {
            }
            this.muteButton.setContentDescription(!TextUtils.isEmpty(str) ? str2 + " " + str : str2);
            if (z) {
            }
            updateMuteButtonState(z);
        }
    }

    public /* synthetic */ void lambda$updateMuteButton$49(float f, View view, ValueAnimator valueAnimator) {
        if (!isLandscapeMode) {
            f = AndroidUtilities.lerp(1.0f, f, this.renderersContainer.progressToFullscreenMode);
        }
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public /* synthetic */ void lambda$updateMuteButton$50(float f, View view, View view2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!isLandscapeMode) {
            f = AndroidUtilities.lerp(1.0f, f, this.renderersContainer.progressToFullscreenMode);
        }
        float f2 = 1.0f - floatValue;
        view.setAlpha(f2);
        float f3 = ((f2 * 0.9f) + 0.1f) * f;
        view.setScaleX(f3);
        view.setScaleY(f3);
        view2.setAlpha(floatValue);
        float f4 = ((floatValue * 0.9f) + 0.1f) * f;
        view2.setScaleX(f4);
        view2.setScaleY(f4);
    }

    public /* synthetic */ void lambda$updateMuteButton$51(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.muteLabel[0].setAlpha(1.0f - floatValue);
        this.muteLabel[0].setTranslationY(AndroidUtilities.dp(5.0f) * floatValue);
        this.muteLabel[1].setAlpha(floatValue);
        this.muteLabel[1].setTranslationY(AndroidUtilities.dp((floatValue * 5.0f) - 5.0f));
    }

    public void fillColors(int i, int[] iArr) {
        if (i == 0) {
            iArr[0] = Theme.getColor("voipgroup_unmuteButton2");
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_soundButtonActive"), Theme.getColor("voipgroup_soundButtonActiveScrolled"), this.colorProgress, 1.0f);
            iArr[2] = Theme.getColor("voipgroup_soundButton");
        } else if (i == 1) {
            iArr[0] = Theme.getColor("voipgroup_muteButton2");
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_soundButtonActive2"), Theme.getColor("voipgroup_soundButtonActive2Scrolled"), this.colorProgress, 1.0f);
            iArr[2] = Theme.getColor("voipgroup_soundButton2");
        } else if (isGradientState(i)) {
            iArr[0] = Theme.getColor("voipgroup_mutedByAdminGradient3");
            iArr[1] = Theme.getColor("voipgroup_mutedByAdminMuteButton");
            iArr[2] = Theme.getColor("voipgroup_mutedByAdminMuteButtonDisabled");
        } else {
            iArr[0] = Theme.getColor("voipgroup_disabledButton");
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_disabledButtonActive"), Theme.getColor("voipgroup_disabledButtonActiveScrolled"), this.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_listViewBackgroundUnscrolled"), Theme.getColor("voipgroup_disabledButton"), this.colorProgress, 1.0f);
        }
    }

    public void showRecordHint(View view) {
        if (this.recordHintView == null) {
            HintView hintView = new HintView(getContext(), 8, true);
            this.recordHintView = hintView;
            hintView.setAlpha(0.0f);
            this.recordHintView.setVisibility(4);
            this.recordHintView.setShowingDuration(3000L);
            this.containerView.addView(this.recordHintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.recordHintView.setText(LocaleController.getString("VoipChannelRecording", R.string.VoipChannelRecording));
            } else {
                this.recordHintView.setText(LocaleController.getString("VoipGroupRecording", R.string.VoipGroupRecording));
            }
            this.recordHintView.setBackgroundColor(-366530760, -1);
        }
        this.recordHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.recordHintView.showForView(view, true);
    }

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
            this.reminderHintView.setText(LocaleController.getString("VoipChatReminderHint", R.string.VoipChatReminderHint));
            this.reminderHintView.setBackgroundColor(-366530760, -1);
        }
        this.reminderHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.reminderHintView.showForView(this.muteButton, true);
    }

    private void updateMuteButtonState(boolean z) {
        this.muteButton.invalidate();
        WeavingState[] weavingStateArr = this.states;
        int i = this.muteButtonState;
        boolean z2 = true;
        boolean z3 = false;
        if (weavingStateArr[i] == null) {
            weavingStateArr[i] = new WeavingState(i);
            int i2 = this.muteButtonState;
            if (i2 == 3) {
                this.states[i2].shader = null;
            } else if (isGradientState(i2)) {
                this.states[this.muteButtonState].shader = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{Theme.getColor("voipgroup_mutedByAdminGradient"), Theme.getColor("voipgroup_mutedByAdminGradient3"), Theme.getColor("voipgroup_mutedByAdminGradient2")}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                int i3 = this.muteButtonState;
                if (i3 == 1) {
                    this.states[i3].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor("voipgroup_muteButton"), Theme.getColor("voipgroup_muteButton3")}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    this.states[i3].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor("voipgroup_unmuteButton2"), Theme.getColor("voipgroup_unmuteButton")}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
        }
        WeavingState[] weavingStateArr2 = this.states;
        int i4 = this.muteButtonState;
        WeavingState weavingState = weavingStateArr2[i4];
        WeavingState weavingState2 = this.currentState;
        float f = 0.0f;
        if (weavingState != weavingState2) {
            this.prevState = weavingState2;
            this.currentState = weavingStateArr2[i4];
            if (weavingState2 == null || !z) {
                this.switchProgress = 1.0f;
                this.prevState = null;
            } else {
                this.switchProgress = 0.0f;
            }
        }
        if (!z) {
            WeavingState weavingState3 = this.currentState;
            if (weavingState3 != null) {
                int i5 = weavingState3.currentState;
                boolean z4 = i5 == 1 || i5 == 0;
                if (i5 == 3) {
                    z2 = false;
                }
                z3 = z4;
            } else {
                z2 = false;
            }
            this.showWavesProgress = z3 ? 1.0f : 0.0f;
            if (z2) {
                f = 1.0f;
            }
            this.showLightingProgress = f;
        }
        this.buttonsContainer.invalidate();
    }

    private static void processOnLeave(ChatObject.Call call, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (call != null) {
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = call.participants.get(j);
            if (tLRPC$TL_groupCallParticipant != null) {
                call.participants.delete(j);
                call.sortedParticipants.remove(tLRPC$TL_groupCallParticipant);
                call.visibleParticipants.remove(tLRPC$TL_groupCallParticipant);
                int i = 0;
                while (i < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i).participant.peer) == MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC$GroupCall tLRPC$GroupCall = call.call;
                tLRPC$GroupCall.participants_count--;
            }
            for (int i2 = 0; i2 < call.sortedParticipants.size(); i2++) {
                TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = call.sortedParticipants.get(i2);
                tLRPC$TL_groupCallParticipant2.lastActiveDate = tLRPC$TL_groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static void onLeaveClick(Context context, final Runnable runnable, boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC$Chat chat = sharedInstance.getChat();
        final ChatObject.Call call = sharedInstance.groupCall;
        final long selfId = sharedInstance.getSelfId();
        if (!ChatObject.canManageCalls(chat)) {
            processOnLeave(call, false, selfId, runnable);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (ChatObject.isChannelOrGiga(chat)) {
            builder.setTitle(LocaleController.getString("VoipChannelLeaveAlertTitle", R.string.VoipChannelLeaveAlertTitle));
            builder.setMessage(LocaleController.getString("VoipChannelLeaveAlertText", R.string.VoipChannelLeaveAlertText));
        } else {
            builder.setTitle(LocaleController.getString("VoipGroupLeaveAlertTitle", R.string.VoipGroupLeaveAlertTitle));
            builder.setMessage(LocaleController.getString("VoipGroupLeaveAlertText", R.string.VoipGroupLeaveAlertText));
        }
        sharedInstance.getAccount();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final CheckBoxCell[] checkBoxCellArr = {new CheckBoxCell(context, 1)};
        checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
        if (z) {
            checkBoxCellArr[0].setTextColor(Theme.getColor("dialogTextBlack"));
        } else {
            checkBoxCellArr[0].setTextColor(Theme.getColor("voipgroup_actionBarItems"));
            ((CheckBoxSquare) checkBoxCellArr[0].getCheckBoxView()).setColors("voipgroup_mutedIcon", "voipgroup_listeningText", "voipgroup_nameText");
        }
        checkBoxCellArr[0].setTag(0);
        if (ChatObject.isChannelOrGiga(chat)) {
            checkBoxCellArr[0].setText(LocaleController.getString("VoipChannelLeaveAlertEndChat", R.string.VoipChannelLeaveAlertEndChat), "", false, false);
        } else {
            checkBoxCellArr[0].setText(LocaleController.getString("VoipGroupLeaveAlertEndChat", R.string.VoipGroupLeaveAlertEndChat), "", false, false);
        }
        checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
        checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCallActivity.lambda$onLeaveClick$52(checkBoxCellArr, view);
            }
        });
        builder.setCustomViewOffset(12);
        builder.setView(linearLayout);
        builder.setDialogButtonColorKey("voipgroup_listeningText");
        builder.setPositiveButton(LocaleController.getString("VoipGroupLeave", R.string.VoipGroupLeave), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GroupCallActivity.lambda$onLeaveClick$53(ChatObject.Call.this, checkBoxCellArr, selfId, runnable, dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
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
            create.setBackgroundColor(Theme.getColor("voipgroup_dialogBackground"));
        }
        create.show();
        if (z) {
            return;
        }
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor("voipgroup_leaveCallMenu"));
        }
        create.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
    }

    public static /* synthetic */ void lambda$onLeaveClick$52(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static /* synthetic */ void lambda$onLeaveClick$53(ChatObject.Call call, CheckBoxCell[] checkBoxCellArr, long j, Runnable runnable, DialogInterface dialogInterface, int i) {
        processOnLeave(call, checkBoxCellArr[0].isChecked(), j, runnable);
    }

    public void processSelectedOption(TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant, final long j, int i) {
        TLObject tLObject;
        String str;
        TextView textView;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (j > 0) {
            tLObject = this.accountInstance.getMessagesController().getUser(Long.valueOf(j));
        } else {
            tLObject = this.accountInstance.getMessagesController().getChat(Long.valueOf(-j));
        }
        final TLObject tLObject2 = tLObject;
        if (i == 0 || i == 2 || i == 3) {
            if (i == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(tLObject2, Boolean.TRUE, null, null, null, null);
                getUndoView().showWithAction(0L, 30, tLObject2, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setDialogButtonColorKey("voipgroup_listeningText");
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            builder.setView(frameLayout);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            avatarDrawable.setInfo(tLObject2);
            boolean z = tLObject2 instanceof TLRPC$User;
            if (z) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLObject2;
                backupImageView.setForUserOrChat(tLRPC$User, avatarDrawable);
                str = UserObject.getFirstName(tLRPC$User);
            } else {
                TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject2;
                backupImageView.setForUserOrChat(tLRPC$Chat, avatarDrawable);
                str = tLRPC$Chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor("voipgroup_actionBarItems"));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 2) {
                textView3.setText(LocaleController.getString("VoipGroupRemoveMemberAlertTitle2", R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelRemoveMemberAlertText2", R.string.VoipChannelRemoveMemberAlertText2, str, this.currentChat.title)));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupRemoveMemberAlertText2", R.string.VoipGroupRemoveMemberAlertText2, str, this.currentChat.title)));
                }
            } else {
                textView3.setText(LocaleController.getString("VoipGroupAddMemberTitle", R.string.VoipGroupAddMemberTitle));
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupAddMemberText", R.string.VoipGroupAddMemberText, str, this.currentChat.title)));
            }
            boolean z2 = LocaleController.isRTL;
            int i2 = (z2 ? 5 : 3) | 48;
            int i3 = 21;
            float f = z2 ? 21 : 76;
            if (z2) {
                i3 = 76;
            }
            frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, i2, f, 11.0f, i3, 0.0f));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i == 2) {
                builder.setPositiveButton(LocaleController.getString("VoipGroupUserRemove", R.string.VoipGroupUserRemove), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda7
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        GroupCallActivity.this.lambda$processSelectedOption$54(tLObject2, dialogInterface, i4);
                    }
                });
            } else if (z) {
                final TLRPC$User tLRPC$User2 = (TLRPC$User) tLObject2;
                builder.setPositiveButton(LocaleController.getString("VoipGroupAdd", R.string.VoipGroupAdd), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda8
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        GroupCallActivity.this.lambda$processSelectedOption$56(tLRPC$User2, j, dialogInterface, i4);
                    }
                });
            }
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create = builder.create();
            create.setBackgroundColor(Theme.getColor("voipgroup_dialogBackground"));
            create.show();
            if (i != 2 || (textView = (TextView) create.getButton(-1)) == null) {
                return;
            }
            textView.setTextColor(Theme.getColor("voipgroup_leaveCallMenu"));
        } else if (i == 6) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            this.parentActivity.lambda$runLinkRequest$59(new ChatActivity(bundle));
            dismiss();
        } else if (i == 8) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            BaseFragment baseFragment = this.parentActivity.getActionBarLayout().fragmentsStack.get(this.parentActivity.getActionBarLayout().fragmentsStack.size() - 1);
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
            this.parentActivity.lambda$runLinkRequest$59(new ChatActivity(bundle2));
            dismiss();
        } else if (i == 7) {
            sharedInstance.editCallMember(tLObject2, Boolean.TRUE, null, null, Boolean.FALSE, null);
            updateMuteButton(2, true);
        } else if (i == 9) {
            ImageUpdater imageUpdater = this.currentAvatarUpdater;
            if (imageUpdater != null && imageUpdater.isUploadingImage()) {
                return;
            }
            ImageUpdater imageUpdater2 = new ImageUpdater(true);
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
            TLRPC$User currentUser = this.accountInstance.getUserConfig().getCurrentUser();
            ImageUpdater imageUpdater4 = this.currentAvatarUpdater;
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = currentUser.photo;
            imageUpdater4.openMenu((tLRPC$UserProfilePhoto == null || tLRPC$UserProfilePhoto.photo_big == null || (tLRPC$UserProfilePhoto instanceof TLRPC$TL_userProfilePhotoEmpty)) ? false : true, new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda32
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.this.lambda$processSelectedOption$57();
                }
            }, GroupCallActivity$$ExternalSyntheticLambda13.INSTANCE);
        } else if (i == 10) {
            AlertsCreator.createChangeBioAlert(tLRPC$TL_groupCallParticipant.about, j, getContext(), this.currentAccount);
        } else if (i == 11) {
            AlertsCreator.createChangeNameAlert(j, getContext(), this.currentAccount);
        } else if (i == 5) {
            sharedInstance.editCallMember(tLObject2, Boolean.TRUE, null, null, null, null);
            getUndoView().showWithAction(0L, 35, tLObject2);
            sharedInstance.setParticipantVolume(tLRPC$TL_groupCallParticipant, 0);
        } else {
            if ((tLRPC$TL_groupCallParticipant.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0 && tLRPC$TL_groupCallParticipant.volume == 0) {
                tLRPC$TL_groupCallParticipant.volume = 10000;
                tLRPC$TL_groupCallParticipant.volume_by_admin = false;
                sharedInstance.editCallMember(tLObject2, Boolean.FALSE, null, 10000, null, null);
            } else {
                sharedInstance.editCallMember(tLObject2, Boolean.FALSE, null, null, null, null);
            }
            sharedInstance.setParticipantVolume(tLRPC$TL_groupCallParticipant, ChatObject.getParticipantVolume(tLRPC$TL_groupCallParticipant));
            getUndoView().showWithAction(0L, i == 1 ? 31 : 36, tLObject2, (Object) null, (Runnable) null, (Runnable) null);
        }
    }

    public /* synthetic */ void lambda$processSelectedOption$54(TLObject tLObject, DialogInterface dialogInterface, int i) {
        if (tLObject instanceof TLRPC$User) {
            TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
            this.accountInstance.getMessagesController().deleteParticipantFromChat(this.currentChat.id, tLRPC$User, null);
            getUndoView().showWithAction(0L, 32, tLRPC$User, (Object) null, (Runnable) null, (Runnable) null);
            return;
        }
        TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject;
        this.accountInstance.getMessagesController().deleteParticipantFromChat(this.currentChat.id, null, tLRPC$Chat, null, false, false);
        getUndoView().showWithAction(0L, 32, tLRPC$Chat, (Object) null, (Runnable) null, (Runnable) null);
    }

    public /* synthetic */ void lambda$processSelectedOption$56(TLRPC$User tLRPC$User, final long j, DialogInterface dialogInterface, int i) {
        this.accountInstance.getMessagesController().addUserToChat(this.currentChat.id, tLRPC$User, 0, null, this.parentActivity.getActionBarLayout().fragmentsStack.get(this.parentActivity.getActionBarLayout().fragmentsStack.size() - 1), new Runnable() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallActivity.this.lambda$processSelectedOption$55(j);
            }
        });
    }

    public /* synthetic */ void lambda$processSelectedOption$55(long j) {
        inviteUserToCall(j, false);
    }

    public /* synthetic */ void lambda$processSelectedOption$57() {
        this.accountInstance.getMessagesController().deleteUserPhoto(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ba, code lost:
        if ((r10 instanceof org.telegram.tgnet.TLRPC$TL_chatParticipantCreator) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02e0, code lost:
        if (r3 == (-r29.currentChat.id)) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean showMenuForCell(View view) {
        GroupCallUserCell groupCallUserCell;
        ScrollView scrollView;
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
        boolean z;
        LinearLayout linearLayout;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        GroupCallUserCell groupCallUserCell2;
        boolean z2;
        final TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        boolean z3;
        int i;
        int i2;
        float f;
        int i3;
        AvatarUpdaterDelegate avatarUpdaterDelegate;
        String str;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        String str4;
        int i7;
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        if (this.itemAnimator.isRunning()) {
            return false;
        }
        if (this.avatarPriviewTransitionInProgress || this.avatarsPreviewShowed) {
            dismissAvatarPreview(true);
            return false;
        }
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        VolumeSlider volumeSlider = null;
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
            this.hasScrimAnchorView = false;
            this.scrimGridView = groupCallGridCell;
            this.scrimRenderer = groupCallGridCell.getRenderer();
            if (!isTabletMode && !isLandscapeMode) {
                this.containerView.addView(groupCallUserCell, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
            }
        } else if (view instanceof GroupCallFullscreenAdapter.GroupCallUserCell) {
            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell3 = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
            if (groupCallUserCell3.getParticipant() == this.call.videoNotAvailableParticipant.participant) {
                return false;
            }
            groupCallUserCell = new GroupCallUserCell(groupCallUserCell3.getContext());
            groupCallUserCell.setData(this.accountInstance, groupCallUserCell3.getParticipant(), this.call, MessageObject.getPeerId(this.selfPeer), null, false);
            this.hasScrimAnchorView = false;
            this.scrimFullscreenView = groupCallUserCell3;
            GroupCallMiniTextureView renderer = groupCallUserCell3.getRenderer();
            this.scrimRenderer = renderer;
            if (renderer != null && renderer.showingInFullscreen) {
                this.scrimRenderer = null;
            }
            this.containerView.addView(groupCallUserCell, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        } else {
            groupCallUserCell = (GroupCallUserCell) view;
            this.hasScrimAnchorView = true;
        }
        GroupCallUserCell groupCallUserCell4 = groupCallUserCell;
        if (groupCallUserCell4 == null) {
            return false;
        }
        boolean z4 = !isLandscapeMode && !isTabletMode && !AndroidUtilities.isInMultiwindow;
        TLRPC$TL_groupCallParticipant participant = groupCallUserCell4.getParticipant();
        final Rect rect = new Rect();
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext());
        actionBarPopupWindowLayout2.setBackgroundDrawable(null);
        actionBarPopupWindowLayout2.setPadding(0, 0, 0, 0);
        actionBarPopupWindowLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.GroupCallActivity.53
            private int[] pos = new int[2];

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    if (GroupCallActivity.this.scrimPopupWindow != null && GroupCallActivity.this.scrimPopupWindow.isShowing()) {
                        View contentView = GroupCallActivity.this.scrimPopupWindow.getContentView();
                        contentView.getLocationInWindow(this.pos);
                        Rect rect2 = rect;
                        int[] iArr = this.pos;
                        rect2.set(iArr[0], iArr[1], iArr[0] + contentView.getMeasuredWidth(), this.pos[1] + contentView.getMeasuredHeight());
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
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda56
            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                GroupCallActivity.this.lambda$showMenuForCell$59(keyEvent);
            }
        });
        final LinearLayout linearLayout2 = new LinearLayout(getContext());
        final LinearLayout linearLayout3 = !participant.muted_by_you ? new LinearLayout(getContext()) : null;
        this.currentOptionsLayout = linearLayout2;
        final LinearLayout linearLayout4 = new LinearLayout(this, getContext()) { // from class: org.telegram.ui.GroupCallActivity.54
            @Override // android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i8, int i9) {
                linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                LinearLayout linearLayout5 = linearLayout3;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(linearLayout2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout2.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout3.getMeasuredHeight());
                    return;
                }
                setMeasuredDimension(linearLayout2.getMeasuredWidth(), linearLayout2.getMeasuredHeight());
            }
        };
        linearLayout4.setMinimumWidth(AndroidUtilities.dp(240.0f));
        linearLayout4.setOrientation(1);
        int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_listViewBackgroundUnscrolled"), Theme.getColor("voipgroup_listViewBackground"), this.colorProgress, 1.0f);
        if (linearLayout3 != null && !groupCallUserCell4.isSelfUser() && !participant.muted_by_you && (!participant.muted || participant.can_self_unmute)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
            linearLayout3.setBackgroundDrawable(mutate);
            linearLayout4.addView(linearLayout3, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            volumeSlider = new VolumeSlider(getContext(), participant);
            linearLayout3.addView(volumeSlider, -1, 48);
        }
        VolumeSlider volumeSlider2 = volumeSlider;
        linearLayout2.setMinimumWidth(AndroidUtilities.dp(240.0f));
        linearLayout2.setOrientation(1);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
        linearLayout2.setBackgroundDrawable(mutate2);
        linearLayout4.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, volumeSlider2 != null ? -8.0f : 0.0f, 0.0f, 0.0f));
        if (Build.VERSION.SDK_INT >= 21) {
            scrollView = new ScrollView(this, getContext(), null, 0, R.style.scrollbarShapeStyle) { // from class: org.telegram.ui.GroupCallActivity.55
                @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i8, int i9) {
                    super.onMeasure(i8, i9);
                    setMeasuredDimension(linearLayout4.getMeasuredWidth(), getMeasuredHeight());
                }
            };
        } else {
            scrollView = new ScrollView(getContext());
        }
        scrollView.setClipToPadding(false);
        actionBarPopupWindowLayout2.addView(scrollView, LayoutHelper.createFrame(-2, -2.0f));
        long peerId = MessageObject.getPeerId(participant.peer);
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        final ArrayList arrayList3 = new ArrayList(2);
        if (!(participant.peer instanceof TLRPC$TL_peerUser)) {
            groupCallUserCell2 = groupCallUserCell4;
            z = z4;
            tLRPC$TL_groupCallParticipant = participant;
            actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            linearLayout = linearLayout2;
        } else if (ChatObject.isChannel(this.currentChat)) {
            groupCallUserCell2 = groupCallUserCell4;
            actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            linearLayout = linearLayout2;
            TLRPC$ChannelParticipant adminInChannel = this.accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, this.currentChat.id);
            z2 = adminInChannel != null && ((adminInChannel instanceof TLRPC$TL_channelParticipantCreator) || adminInChannel.admin_rights.manage_call);
            z = z4;
            tLRPC$TL_groupCallParticipant = participant;
        } else {
            groupCallUserCell2 = groupCallUserCell4;
            actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            linearLayout = linearLayout2;
            TLRPC$ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(this.currentChat.id);
            if (chatFull != null && (tLRPC$ChatParticipants = chatFull.participants) != null) {
                int size = tLRPC$ChatParticipants.participants.size();
                int i8 = 0;
                while (i8 < size) {
                    TLRPC$ChatParticipant tLRPC$ChatParticipant = chatFull.participants.participants.get(i8);
                    TLRPC$ChatFull tLRPC$ChatFull = chatFull;
                    z = z4;
                    tLRPC$TL_groupCallParticipant = participant;
                    if (tLRPC$ChatParticipant.user_id == participant.peer.user_id) {
                        if (!(tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantAdmin)) {
                        }
                        z2 = true;
                    } else {
                        i8++;
                        chatFull = tLRPC$ChatFull;
                        z4 = z;
                        participant = tLRPC$TL_groupCallParticipant;
                    }
                }
            }
            z = z4;
            tLRPC$TL_groupCallParticipant = participant;
            z2 = false;
        }
        if (groupCallUserCell2.isSelfUser()) {
            if (groupCallUserCell2.isHandRaised()) {
                arrayList.add(LocaleController.getString("VoipGroupCancelRaiseHand", R.string.VoipGroupCancelRaiseHand));
                arrayList2.add(Integer.valueOf((int) R.drawable.msg_handdown));
                arrayList3.add(7);
            }
            if (groupCallUserCell2.hasAvatarSet()) {
                i4 = R.string.VoipAddPhoto;
                str = "VoipAddPhoto";
            } else {
                i4 = R.string.VoipSetNewPhoto;
                str = "VoipSetNewPhoto";
            }
            arrayList.add(LocaleController.getString(str, i4));
            arrayList2.add(Integer.valueOf((int) R.drawable.msg_addphoto));
            arrayList3.add(9);
            if (peerId > 0) {
                tLRPC$TL_groupCallParticipant2 = tLRPC$TL_groupCallParticipant;
                if (TextUtils.isEmpty(tLRPC$TL_groupCallParticipant2.about)) {
                    i7 = R.string.VoipAddBio;
                    str4 = "VoipAddBio";
                } else {
                    i7 = R.string.VoipEditBio;
                    str4 = "VoipEditBio";
                }
                arrayList.add(LocaleController.getString(str4, i7));
            } else {
                tLRPC$TL_groupCallParticipant2 = tLRPC$TL_groupCallParticipant;
                if (TextUtils.isEmpty(tLRPC$TL_groupCallParticipant2.about)) {
                    i6 = R.string.VoipAddDescription;
                    str3 = "VoipAddDescription";
                } else {
                    i6 = R.string.VoipEditDescription;
                    str3 = "VoipEditDescription";
                }
                arrayList.add(LocaleController.getString(str3, i6));
            }
            arrayList2.add(Integer.valueOf(TextUtils.isEmpty(tLRPC$TL_groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info));
            arrayList3.add(10);
            if (peerId > 0) {
                i5 = R.string.VoipEditName;
                str2 = "VoipEditName";
            } else {
                i5 = R.string.VoipEditTitle;
                str2 = "VoipEditTitle";
            }
            arrayList.add(LocaleController.getString(str2, i5));
            arrayList2.add(Integer.valueOf((int) R.drawable.msg_edit));
            arrayList3.add(11);
        } else {
            tLRPC$TL_groupCallParticipant2 = tLRPC$TL_groupCallParticipant;
            if (ChatObject.canManageCalls(this.currentChat)) {
                if (!z2 || !tLRPC$TL_groupCallParticipant2.muted) {
                    if (!tLRPC$TL_groupCallParticipant2.muted || tLRPC$TL_groupCallParticipant2.can_self_unmute) {
                        arrayList.add(LocaleController.getString("VoipGroupMute", R.string.VoipGroupMute));
                        arrayList2.add(Integer.valueOf((int) R.drawable.msg_voice_muted));
                        arrayList3.add(0);
                    } else {
                        arrayList.add(LocaleController.getString("VoipGroupAllowToSpeak", R.string.VoipGroupAllowToSpeak));
                        if (tLRPC$TL_groupCallParticipant2.raise_hand_rating != 0) {
                            arrayList2.add(Integer.valueOf((int) R.drawable.msg_allowspeak));
                        } else {
                            arrayList2.add(Integer.valueOf((int) R.drawable.msg_voice_unmuted));
                        }
                        arrayList3.add(1);
                    }
                }
                long j = tLRPC$TL_groupCallParticipant2.peer.channel_id;
                if (j != 0 && !ChatObject.isMegagroup(this.currentAccount, j)) {
                    arrayList.add(LocaleController.getString("VoipGroupOpenChannel", R.string.VoipGroupOpenChannel));
                    arrayList2.add(Integer.valueOf((int) R.drawable.msg_channel));
                    arrayList3.add(8);
                } else {
                    arrayList.add(LocaleController.getString("VoipGroupOpenProfile", R.string.VoipGroupOpenProfile));
                    arrayList2.add(Integer.valueOf((int) R.drawable.msg_openprofile));
                    arrayList3.add(6);
                }
                if (!z2 && ChatObject.canBlockUsers(this.currentChat)) {
                    arrayList.add(LocaleController.getString("VoipGroupUserRemove", R.string.VoipGroupUserRemove));
                    arrayList2.add(Integer.valueOf((int) R.drawable.msg_block2));
                    arrayList3.add(2);
                }
            } else {
                if (tLRPC$TL_groupCallParticipant2.muted_by_you) {
                    arrayList.add(LocaleController.getString("VoipGroupUnmuteForMe", R.string.VoipGroupUnmuteForMe));
                    arrayList2.add(Integer.valueOf((int) R.drawable.msg_voice_unmuted));
                    arrayList3.add(4);
                } else {
                    arrayList.add(LocaleController.getString("VoipGroupMuteForMe", R.string.VoipGroupMuteForMe));
                    arrayList2.add(Integer.valueOf((int) R.drawable.msg_voice_muted));
                    arrayList3.add(5);
                }
                long j2 = tLRPC$TL_groupCallParticipant2.peer.channel_id;
                if (j2 != 0 && !ChatObject.isMegagroup(this.currentAccount, j2)) {
                    arrayList.add(LocaleController.getString("VoipGroupOpenChannel", R.string.VoipGroupOpenChannel));
                    arrayList2.add(Integer.valueOf((int) R.drawable.msg_msgbubble3));
                    arrayList3.add(8);
                } else {
                    arrayList.add(LocaleController.getString("VoipGroupOpenChat", R.string.VoipGroupOpenChat));
                    arrayList2.add(Integer.valueOf((int) R.drawable.msg_msgbubble3));
                    arrayList3.add(6);
                }
            }
        }
        int size2 = arrayList.size();
        final int i9 = 0;
        while (i9 < size2) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), i9 == 0, i9 == size2 + (-1));
            if (((Integer) arrayList3.get(i9)).intValue() != 2) {
                actionBarMenuSubItem.setColors(Theme.getColor("voipgroup_actionBarItems"), Theme.getColor("voipgroup_actionBarItems"));
            } else {
                actionBarMenuSubItem.setColors(Theme.getColor("voipgroup_leaveCallMenu"), Theme.getColor("voipgroup_leaveCallMenu"));
            }
            actionBarMenuSubItem.setSelectorColor(Theme.getColor("voipgroup_listSelector"));
            actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList.get(i9), ((Integer) arrayList2.get(i9)).intValue());
            linearLayout.addView(actionBarMenuSubItem);
            actionBarMenuSubItem.setTag(arrayList3.get(i9));
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GroupCallActivity.this.lambda$showMenuForCell$60(i9, arrayList3, tLRPC$TL_groupCallParticipant2, view2);
                }
            });
            i9++;
        }
        scrollView.addView(linearLayout4, LayoutHelper.createScroll(-2, -2, 51));
        this.listView.stopScroll();
        this.layoutManager.setCanScrollVertically(false);
        GroupCallUserCell groupCallUserCell5 = groupCallUserCell2;
        this.scrimView = groupCallUserCell5;
        groupCallUserCell5.setAboutVisible(true);
        this.containerView.invalidate();
        this.listView.invalidate();
        AnimatorSet animatorSet = this.scrimAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout3 = actionBarPopupWindowLayout;
        this.scrimPopupLayout = actionBarPopupWindowLayout3;
        if (peerId > 0) {
            TLRPC$User user = this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            imageLocation = ImageLocation.getForUserOrChat(user, 0);
            imageLocation2 = ImageLocation.getForUserOrChat(user, 1);
        } else {
            TLRPC$Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            imageLocation = ImageLocation.getForUserOrChat(chat, 0);
            imageLocation2 = ImageLocation.getForUserOrChat(chat, 1);
        }
        GroupCallMiniTextureView groupCallMiniTextureView = this.scrimRenderer;
        boolean z5 = groupCallMiniTextureView != null && groupCallMiniTextureView.isAttached();
        if (imageLocation != null || z5) {
            if (z) {
                this.avatarsViewPager.setParentAvatarImage(this.scrimView.getAvatarImageView());
                this.avatarsViewPager.setHasActiveVideo(z5);
                this.avatarsViewPager.setData(peerId, true);
                this.avatarsViewPager.setCreateThumbFromParent(true);
                this.avatarsViewPager.initIfEmpty(imageLocation, imageLocation2, true);
                GroupCallMiniTextureView groupCallMiniTextureView2 = this.scrimRenderer;
                if (groupCallMiniTextureView2 != null) {
                    groupCallMiniTextureView2.setShowingAsScrimView(true, true);
                }
                if (MessageObject.getPeerId(this.selfPeer) == peerId && this.currentAvatarUpdater != null && (avatarUpdaterDelegate = this.avatarUpdaterDelegate) != null && avatarUpdaterDelegate.avatar != null) {
                    this.avatarsViewPager.addUploadingImage(this.avatarUpdaterDelegate.uploadingImageLocation, ImageLocation.getForLocal(this.avatarUpdaterDelegate.avatar));
                }
            }
            z3 = z;
        } else {
            z3 = false;
        }
        if (z3) {
            this.avatarsPreviewShowed = true;
            actionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.containerView.addView(this.scrimPopupLayout, LayoutHelper.createFrame(-2, -2.0f));
            this.useBlur = true;
            prepareBlurBitmap();
            this.avatarPriviewTransitionInProgress = true;
            this.avatarPreviewContainer.setVisibility(0);
            if (volumeSlider2 != null) {
                volumeSlider2.invalidate();
            }
            runAvatarPreviewTransition(true, groupCallUserCell5);
            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell6 = this.scrimFullscreenView;
            if (groupCallUserCell6 == null) {
                return true;
            }
            groupCallUserCell6.getAvatarImageView().setAlpha(0.0f);
            return true;
        }
        this.avatarsPreviewShowed = false;
        ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(actionBarPopupWindowLayout3, -2, -2) { // from class: org.telegram.ui.GroupCallActivity.56
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
                arrayList4.add(ObjectAnimator.ofInt(GroupCallActivity.this.scrimPaint, AnimationProperties.PAINT_ALPHA, 0));
                GroupCallActivity.this.scrimAnimatorSet.playTogether(arrayList4);
                GroupCallActivity.this.scrimAnimatorSet.setDuration(220L);
                GroupCallActivity.this.scrimAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.56.1
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
        this.scrimPopupWindow = actionBarPopupWindow2;
        actionBarPopupWindow2.setPauseNotifications(true);
        this.scrimPopupWindow.setDismissAnimationDuration(220);
        this.scrimPopupWindow.setOutsideTouchable(true);
        this.scrimPopupWindow.setClippingEnabled(true);
        this.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        this.scrimPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.scrimPopupWindow.setInputMethodMode(2);
        this.scrimPopupWindow.setSoftInputMode(0);
        this.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell7 = this.scrimFullscreenView;
        if (groupCallUserCell7 != null) {
            if (isLandscapeMode) {
                i2 = (((int) ((groupCallUserCell7.getX() + this.fullscreenUsersListView.getX()) + this.renderersContainer.getX())) - actionBarPopupWindowLayout3.getMeasuredWidth()) + AndroidUtilities.dp(32.0f);
                i = ((int) ((this.scrimFullscreenView.getY() + this.fullscreenUsersListView.getY()) + this.renderersContainer.getY())) - AndroidUtilities.dp(6.0f);
            } else {
                i2 = ((int) ((groupCallUserCell7.getX() + this.fullscreenUsersListView.getX()) + this.renderersContainer.getX())) - AndroidUtilities.dp(14.0f);
                i = (int) (((this.scrimFullscreenView.getY() + this.fullscreenUsersListView.getY()) + this.renderersContainer.getY()) - actionBarPopupWindowLayout3.getMeasuredHeight());
            }
        } else {
            int x = (int) (((this.listView.getX() + this.listView.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindowLayout3.getMeasuredWidth());
            if (this.hasScrimAnchorView) {
                i3 = (int) (this.listView.getY() + groupCallUserCell5.getY() + groupCallUserCell5.getClipHeight());
            } else {
                if (this.scrimGridView != null) {
                    f = this.listView.getY() + this.scrimGridView.getY() + this.scrimGridView.getMeasuredHeight();
                } else {
                    f = this.listView.getY();
                }
                i3 = (int) f;
            }
            i = i3;
            i2 = x;
        }
        this.scrimPopupWindow.showAtLocation(this.listView, 51, i2, i);
        this.scrimAnimatorSet = new AnimatorSet();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(ObjectAnimator.ofInt(this.scrimPaint, AnimationProperties.PAINT_ALPHA, 0, 100));
        this.scrimAnimatorSet.playTogether(arrayList4);
        this.scrimAnimatorSet.setDuration(150L);
        this.scrimAnimatorSet.start();
        return true;
    }

    public /* synthetic */ void lambda$showMenuForCell$59(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0 || (actionBarPopupWindow = this.scrimPopupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.scrimPopupWindow.dismiss();
    }

    public /* synthetic */ void lambda$showMenuForCell$60(int i, ArrayList arrayList, TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant, View view) {
        if (i >= arrayList.size()) {
            return;
        }
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = this.call.participants.get(MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer));
        if (tLRPC$TL_groupCallParticipant2 != null) {
            tLRPC$TL_groupCallParticipant = tLRPC$TL_groupCallParticipant2;
        }
        processSelectedOption(tLRPC$TL_groupCallParticipant, MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer), ((Integer) arrayList.get(i)).intValue());
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        } else if (((Integer) arrayList.get(i)).intValue() == 9 || ((Integer) arrayList.get(i)).intValue() == 10 || ((Integer) arrayList.get(i)).intValue() == 11) {
        } else {
            dismissAvatarPreview(true);
        }
    }

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
        if (launchActivity == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.parentActivity.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void runAvatarPreviewTransition(final boolean z, GroupCallUserCell groupCallUserCell) {
        int i;
        float f;
        float f2;
        final float f3;
        GroupCallMiniTextureView groupCallMiniTextureView;
        float f4;
        float f5;
        int i2;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        float y;
        float y2;
        boolean z2;
        float dp = AndroidUtilities.dp(14.0f) + this.containerView.getPaddingLeft();
        float dp2 = AndroidUtilities.dp(14.0f) + this.containerView.getPaddingTop();
        float f6 = 1.0f;
        if (this.hasScrimAnchorView) {
            float x = ((groupCallUserCell.getAvatarImageView().getX() + groupCallUserCell.getX()) + this.listView.getX()) - dp;
            float y3 = ((groupCallUserCell.getAvatarImageView().getY() + groupCallUserCell.getY()) + this.listView.getY()) - dp2;
            float measuredHeight = groupCallUserCell.getAvatarImageView().getMeasuredHeight() / this.listView.getMeasuredWidth();
            f = y3;
            i = (int) ((groupCallUserCell.getAvatarImageView().getMeasuredHeight() >> 1) / measuredHeight);
            f2 = x;
            f3 = measuredHeight;
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
            float f7 = 0.96f;
            if (groupCallGridCell != null && this.previewTextureTransitionEnabled) {
                f4 = (groupCallGridCell.getX() + this.listView.getX()) - dp;
                y = this.scrimGridView.getY() + this.listView.getY();
                y2 = AndroidUtilities.dp(2.0f);
            } else {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = this.scrimFullscreenView;
                if (groupCallUserCell2 != null) {
                    if (this.scrimRenderer == null) {
                        f4 = (((groupCallUserCell2.getAvatarImageView().getX() + this.scrimFullscreenView.getX()) + this.fullscreenUsersListView.getX()) + this.renderersContainer.getX()) - dp;
                        f5 = (((this.scrimFullscreenView.getAvatarImageView().getY() + this.scrimFullscreenView.getY()) + this.fullscreenUsersListView.getY()) + this.renderersContainer.getY()) - dp2;
                        f7 = this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / this.listView.getMeasuredWidth();
                        i2 = (int) ((this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() >> 1) / f7);
                        if (!this.previewTextureTransitionEnabled && (groupCallMiniTextureView2 = this.scrimRenderer) != null) {
                            groupCallMiniTextureView2.invalidate();
                            this.renderersContainer.invalidate();
                            this.scrimRenderer.setShowingAsScrimView(false, false);
                            this.scrimRenderer = null;
                        }
                        i = i2;
                        f = f5;
                        float f8 = f7;
                        f2 = f4;
                        f3 = f8;
                    } else if (this.previewTextureTransitionEnabled) {
                        f4 = ((groupCallUserCell2.getX() + this.fullscreenUsersListView.getX()) + this.renderersContainer.getX()) - dp;
                        y = this.scrimFullscreenView.getY() + this.fullscreenUsersListView.getY();
                        y2 = this.renderersContainer.getY();
                    }
                }
                i2 = 0;
                f5 = 0.0f;
                f4 = 0.0f;
                if (!this.previewTextureTransitionEnabled) {
                    groupCallMiniTextureView2.invalidate();
                    this.renderersContainer.invalidate();
                    this.scrimRenderer.setShowingAsScrimView(false, false);
                    this.scrimRenderer = null;
                }
                i = i2;
                f = f5;
                float f82 = f7;
                f2 = f4;
                f3 = f82;
            }
            f5 = (y + y2) - dp2;
            i2 = 0;
            f7 = 1.0f;
            if (!this.previewTextureTransitionEnabled) {
            }
            i = i2;
            f = f5;
            float f822 = f7;
            f2 = f4;
            f3 = f822;
        }
        if (z) {
            this.avatarPreviewContainer.setScaleX(f3);
            this.avatarPreviewContainer.setScaleY(f3);
            this.avatarPreviewContainer.setTranslationX(f2);
            this.avatarPreviewContainer.setTranslationY(f);
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
        if (!z && (groupCallMiniTextureView = this.scrimRenderer) != null) {
            groupCallMiniTextureView.setShowingAsScrimView(false, true);
            ProfileGalleryView profileGalleryView2 = this.avatarsViewPager;
            if (profileGalleryView2.getRealPosition(profileGalleryView2.getCurrentItem()) != 0) {
                this.scrimRenderer.textureView.cancelAnimation();
                this.scrimGridView = null;
            }
        }
        float[] fArr = new float[2];
        fArr[0] = z ? 0.0f : 1.0f;
        if (!z) {
            f6 = 0.0f;
        }
        fArr[1] = f6;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        final float f9 = f2;
        final float f10 = f;
        final int i3 = i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GroupCallActivity.this.lambda$runAvatarPreviewTransition$61(f3, f9, f10, i3, valueAnimator);
            }
        });
        this.popupAnimationIndex = this.accountInstance.getNotificationCenter().setAnimationInProgress(this.popupAnimationIndex, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        final GroupCallMiniTextureView groupCallMiniTextureView3 = this.scrimGridView == null ? null : this.scrimRenderer;
        if (groupCallMiniTextureView3 != null) {
            groupCallMiniTextureView3.animateToScrimView = true;
        }
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCallActivity.57
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

    public /* synthetic */ void lambda$runAvatarPreviewTransition$61(float f, float f2, float f3, int i, ValueAnimator valueAnimator) {
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
        float f5 = i;
        float f6 = this.progressToAvatarPreview;
        profileGalleryView.setRoundRadius((int) ((1.0f - f6) * f5), (int) (f5 * (1.0f - f6)));
    }

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

    /* loaded from: classes3.dex */
    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private int addMemberRow;
        private boolean hasSelfUser;
        private int invitedEndRow;
        private int invitedStartRow;
        private int lastRow;
        private Context mContext;
        private int rowsCount;
        private int usersEndRow;
        private int usersStartRow;
        private int usersVideoGridEndRow;
        private int usersVideoGridStartRow;
        private int videoGridDividerRow;
        private int videoNotAvailableRow;

        public ListAdapter(Context context) {
            GroupCallActivity.this = r1;
            this.mContext = context;
        }

        public boolean addSelfToCounter() {
            if (!GroupCallActivity.this.isRtmpStream() && !this.hasSelfUser && VoIPService.getSharedInstance() != null) {
                return !VoIPService.getSharedInstance().isJoined();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.rowsCount;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
            if (android.text.TextUtils.isEmpty(r0.username) == false) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void updateRows() {
            ChatObject.Call call = GroupCallActivity.this.call;
            if (call == null || call.isScheduled() || GroupCallActivity.this.delayedGroupCallUpdated) {
                return;
            }
            boolean z = false;
            this.rowsCount = 0;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call.participants.indexOfKey(MessageObject.getPeerId(groupCallActivity.selfPeer)) >= 0) {
                z = true;
            }
            this.hasSelfUser = z;
            int i = this.rowsCount;
            this.usersVideoGridStartRow = i;
            int size = i + GroupCallActivity.this.visibleVideoParticipants.size();
            this.rowsCount = size;
            this.usersVideoGridEndRow = size;
            if (GroupCallActivity.this.visibleVideoParticipants.size() > 0) {
                int i2 = this.rowsCount;
                this.rowsCount = i2 + 1;
                this.videoGridDividerRow = i2;
            } else {
                this.videoGridDividerRow = -1;
            }
            if (!GroupCallActivity.this.visibleVideoParticipants.isEmpty() && ChatObject.canManageCalls(GroupCallActivity.this.currentChat)) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.call.call.participants_count > groupCallActivity2.accountInstance.getMessagesController().groupCallVideoMaxParticipants) {
                    int i3 = this.rowsCount;
                    this.rowsCount = i3 + 1;
                    this.videoNotAvailableRow = i3;
                    this.usersStartRow = this.rowsCount;
                    if (!GroupCallActivity.this.isRtmpStream()) {
                        this.rowsCount += GroupCallActivity.this.call.visibleParticipants.size();
                    }
                    this.usersEndRow = this.rowsCount;
                    if (!GroupCallActivity.this.call.invitedUsers.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                        this.invitedStartRow = -1;
                        this.invitedEndRow = -1;
                    } else {
                        int i4 = this.rowsCount;
                        this.invitedStartRow = i4;
                        int size2 = i4 + GroupCallActivity.this.call.invitedUsers.size();
                        this.rowsCount = size2;
                        this.invitedEndRow = size2;
                    }
                    if (!GroupCallActivity.this.isRtmpStream()) {
                        if ((ChatObject.isChannel(GroupCallActivity.this.currentChat) && !GroupCallActivity.this.currentChat.megagroup) || !ChatObject.canWriteToChat(GroupCallActivity.this.currentChat)) {
                            if (ChatObject.isChannel(GroupCallActivity.this.currentChat)) {
                                TLRPC$Chat tLRPC$Chat = GroupCallActivity.this.currentChat;
                                if (!tLRPC$Chat.megagroup) {
                                }
                            }
                        }
                        int i5 = this.rowsCount;
                        this.rowsCount = i5 + 1;
                        this.addMemberRow = i5;
                        int i6 = this.rowsCount;
                        this.rowsCount = i6 + 1;
                        this.lastRow = i6;
                    }
                    this.addMemberRow = -1;
                    int i62 = this.rowsCount;
                    this.rowsCount = i62 + 1;
                    this.lastRow = i62;
                }
            }
            this.videoNotAvailableRow = -1;
            this.usersStartRow = this.rowsCount;
            if (!GroupCallActivity.this.isRtmpStream()) {
            }
            this.usersEndRow = this.rowsCount;
            if (!GroupCallActivity.this.call.invitedUsers.isEmpty()) {
            }
            this.invitedStartRow = -1;
            this.invitedEndRow = -1;
            if (!GroupCallActivity.this.isRtmpStream()) {
            }
            this.addMemberRow = -1;
            int i622 = this.rowsCount;
            this.rowsCount = i622 + 1;
            this.lastRow = i622;
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
        public void notifyItemRemoved(int i) {
            updateRows();
            super.notifyItemRemoved(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            String str = "voipgroup_mutedIcon";
            if (itemViewType == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
                if (GroupCallActivity.this.actionBar.getTag() == null) {
                    str = "voipgroup_mutedIconUnscrolled";
                }
                groupCallUserCell.setGrayIconColor(str, Theme.getColor(str));
                if (viewHolder.getAdapterPosition() != getItemCount() - 2) {
                    z = true;
                }
                groupCallUserCell.setDrawDivider(z);
            } else if (itemViewType != 2) {
            } else {
                GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) viewHolder.itemView;
                if (GroupCallActivity.this.actionBar.getTag() == null) {
                    str = "voipgroup_mutedIconUnscrolled";
                }
                groupCallInvitedCell.setGrayIconColor(str, Theme.getColor(str));
                if (viewHolder.getAdapterPosition() != getItemCount() - 2) {
                    z = true;
                }
                groupCallInvitedCell.setDrawDivider(z);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
            AvatarUpdaterDelegate avatarUpdaterDelegate;
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2;
            ChatObject.VideoParticipant videoParticipant;
            AvatarUpdaterDelegate avatarUpdaterDelegate2;
            int itemViewType = viewHolder.getItemViewType();
            float f = 1.0f;
            boolean z = false;
            if (itemViewType == 0) {
                GroupCallTextCell groupCallTextCell = (GroupCallTextCell) viewHolder.itemView;
                int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor("voipgroup_lastSeenTextUnscrolled"), Theme.getColor("voipgroup_lastSeenText"), GroupCallActivity.this.actionBar.getTag() != null ? 1.0f : 0.0f, 1.0f);
                groupCallTextCell.setColors(offsetColor, offsetColor);
                if (ChatObject.isChannel(GroupCallActivity.this.currentChat)) {
                    TLRPC$Chat tLRPC$Chat = GroupCallActivity.this.currentChat;
                    if (!tLRPC$Chat.megagroup && !TextUtils.isEmpty(tLRPC$Chat.username)) {
                        groupCallTextCell.setTextAndIcon(LocaleController.getString("VoipGroupShareLink", R.string.VoipGroupShareLink), R.drawable.msg_link, false);
                        return;
                    }
                }
                groupCallTextCell.setTextAndIcon(LocaleController.getString("VoipGroupInviteMember", R.string.VoipGroupInviteMember), R.drawable.msg_contact_add, false);
                return;
            }
            TLRPC$FileLocation tLRPC$FileLocation = null;
            r7 = null;
            TLRPC$FileLocation tLRPC$FileLocation2 = null;
            r7 = null;
            r7 = null;
            r7 = null;
            Long l = null;
            tLRPC$FileLocation = null;
            if (itemViewType == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
                int i2 = i - this.usersStartRow;
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i2 >= 0 && i2 < GroupCallActivity.this.oldParticipants.size()) {
                        tLRPC$TL_groupCallParticipant2 = (TLRPC$TL_groupCallParticipant) GroupCallActivity.this.oldParticipants.get(i2);
                        tLRPC$TL_groupCallParticipant = tLRPC$TL_groupCallParticipant2;
                    }
                    tLRPC$TL_groupCallParticipant = null;
                } else {
                    if (i2 >= 0 && i2 < GroupCallActivity.this.call.visibleParticipants.size()) {
                        tLRPC$TL_groupCallParticipant2 = GroupCallActivity.this.call.visibleParticipants.get(i2);
                        tLRPC$TL_groupCallParticipant = tLRPC$TL_groupCallParticipant2;
                    }
                    tLRPC$TL_groupCallParticipant = null;
                }
                if (tLRPC$TL_groupCallParticipant == null) {
                    return;
                }
                long peerId = MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(GroupCallActivity.this.selfPeer);
                if (peerId == peerId2 && (avatarUpdaterDelegate = GroupCallActivity.this.avatarUpdaterDelegate) != null) {
                    tLRPC$FileLocation = avatarUpdaterDelegate.avatar;
                }
                TLRPC$FileLocation tLRPC$FileLocation3 = tLRPC$FileLocation;
                if (tLRPC$FileLocation3 != null) {
                    f = GroupCallActivity.this.avatarUpdaterDelegate.uploadingProgress;
                }
                if (groupCallUserCell.getParticipant() != null && MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == peerId) {
                    z = true;
                }
                groupCallUserCell.setData(GroupCallActivity.this.accountInstance, tLRPC$TL_groupCallParticipant, GroupCallActivity.this.call, peerId2, tLRPC$FileLocation3, z);
                groupCallUserCell.setUploadProgress(f, z);
            } else if (itemViewType == 2) {
                GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) viewHolder.itemView;
                int i3 = i - this.invitedStartRow;
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i3 >= 0 && i3 < GroupCallActivity.this.oldInvited.size()) {
                        l = (Long) GroupCallActivity.this.oldInvited.get(i3);
                    }
                } else if (i3 >= 0 && i3 < GroupCallActivity.this.call.invitedUsers.size()) {
                    l = GroupCallActivity.this.call.invitedUsers.get(i3);
                }
                if (l == null) {
                    return;
                }
                groupCallInvitedCell.setData(((BottomSheet) GroupCallActivity.this).currentAccount, l);
            } else if (itemViewType != 4) {
            } else {
                GroupCallGridCell groupCallGridCell = (GroupCallGridCell) viewHolder.itemView;
                ChatObject.VideoParticipant participant = groupCallGridCell.getParticipant();
                int i4 = i - this.usersVideoGridStartRow;
                groupCallGridCell.spanCount = GroupCallActivity.this.spanSizeLookup.getSpanSize(i);
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i4 >= 0 && i4 < GroupCallActivity.this.oldVideoParticipants.size()) {
                        videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i4);
                        if (videoParticipant != null) {
                            long peerId3 = MessageObject.getPeerId(videoParticipant.participant.peer);
                            long peerId4 = MessageObject.getPeerId(GroupCallActivity.this.selfPeer);
                            if (peerId3 == peerId4 && (avatarUpdaterDelegate2 = GroupCallActivity.this.avatarUpdaterDelegate) != null) {
                                tLRPC$FileLocation2 = avatarUpdaterDelegate2.avatar;
                            }
                            if (tLRPC$FileLocation2 != null) {
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
                    videoParticipant = null;
                    if (videoParticipant != null) {
                    }
                    if (participant == null) {
                        return;
                    }
                    return;
                }
                if (i4 >= 0 && i4 < GroupCallActivity.this.visibleVideoParticipants.size()) {
                    videoParticipant = GroupCallActivity.this.visibleVideoParticipants.get(i4);
                    if (videoParticipant != null) {
                    }
                    if (participant == null) {
                    }
                }
                videoParticipant = null;
                if (videoParticipant != null) {
                }
                if (participant == null) {
                }
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 3 || itemViewType == 4 || itemViewType == 5 || itemViewType == 6) ? false : true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new GroupCallTextCell(this, this.mContext) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.telegram.ui.Cells.GroupCallTextCell, android.widget.FrameLayout, android.view.View
                    public void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i == 1) {
                view = new GroupCallUserCell(this.mContext) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.2
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.telegram.ui.Cells.GroupCallUserCell
                    public void onMuteClick(GroupCallUserCell groupCallUserCell) {
                        GroupCallActivity.this.showMenuForCell(groupCallUserCell);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.telegram.ui.Cells.GroupCallUserCell, android.widget.FrameLayout, android.view.View
                    public void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i == 2) {
                view = new GroupCallInvitedCell(this, this.mContext) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.3
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.telegram.ui.Cells.GroupCallInvitedCell, android.widget.FrameLayout, android.view.View
                    public void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i == 4) {
                view = new GroupCallGridCell(this.mContext, false) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.4
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.telegram.ui.Components.voip.GroupCallGridCell, android.view.ViewGroup, android.view.View
                    public void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        if (GroupCallActivity.this.listView.getVisibility() != 0 || !GroupCallActivity.this.listViewVideoVisibility) {
                            return;
                        }
                        GroupCallActivity.this.attachRenderer(this, true);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // org.telegram.ui.Components.voip.GroupCallGridCell, android.view.ViewGroup, android.view.View
                    public void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        GroupCallActivity.this.attachRenderer(this, false);
                    }
                };
            } else if (i == 5) {
                view = new View(this, this.mContext) { // from class: org.telegram.ui.GroupCallActivity.ListAdapter.5
                    @Override // android.view.View
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(GroupCallActivity.isLandscapeMode ? 0.0f : 8.0f), 1073741824));
                    }
                };
            } else if (i == 6) {
                TextView textView = new TextView(this.mContext);
                textView.setTextColor(-8682615);
                textView.setTextSize(1, 13.0f);
                textView.setGravity(1);
                textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    textView.setText(LocaleController.formatString("VoipChannelVideoNotAvailableAdmin", R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                } else {
                    textView.setText(LocaleController.formatString("VoipVideoNotAvailableAdmin", R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                }
                view = textView;
            } else {
                view = new View(this.mContext);
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == this.lastRow) {
                return 3;
            }
            if (i == this.addMemberRow) {
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
            return i == this.videoNotAvailableRow ? 6 : 2;
        }
    }

    public void attachRenderer(GroupCallGridCell groupCallGridCell, boolean z) {
        if (isDismissed()) {
            return;
        }
        if (z && groupCallGridCell.getRenderer() == null) {
            groupCallGridCell.setRenderer(GroupCallMiniTextureView.getOrCreate(this.attachedRenderers, this.renderersContainer, groupCallGridCell, null, null, groupCallGridCell.getParticipant(), this.call, this));
        } else if (z || groupCallGridCell.getRenderer() == null) {
        } else {
            groupCallGridCell.getRenderer().setPrimaryView(null);
            groupCallGridCell.setRenderer(null);
        }
    }

    public void setOldRows(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.oldAddMemberRow = i;
        this.oldUsersStartRow = i2;
        this.oldUsersEndRow = i3;
        this.oldInvitedStartRow = i4;
        this.oldInvitedEndRow = i5;
        this.oldUsersVideoStartRow = i6;
        this.oldUsersVideoEndRow = i7;
        this.oldVideoDividerRow = i8;
        this.oldVideoNotAvailableRow = i9;
    }

    /* loaded from: classes3.dex */
    public static class UpdateCallback implements ListUpdateCallback {
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

    public void toggleAdminSpeak() {
        TLRPC$TL_phone_toggleGroupCallSettings tLRPC$TL_phone_toggleGroupCallSettings = new TLRPC$TL_phone_toggleGroupCallSettings();
        tLRPC$TL_phone_toggleGroupCallSettings.call = this.call.getInputGroupCall();
        tLRPC$TL_phone_toggleGroupCallSettings.join_muted = this.call.call.join_muted;
        tLRPC$TL_phone_toggleGroupCallSettings.flags |= 1;
        this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_toggleGroupCallSettings, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda50
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                GroupCallActivity.this.lambda$toggleAdminSpeak$62(tLObject, tLRPC$TL_error);
            }
        });
    }

    public /* synthetic */ void lambda$toggleAdminSpeak$62(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            this.accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return new ArrayList<>();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.dismiss(false, false);
        } else if (this.avatarsPreviewShowed) {
            dismissAvatarPreview(true);
        } else if (this.renderersContainer.inFullscreenMode) {
            fullscreenFor(null);
        } else {
            super.onBackPressed();
        }
    }

    /* loaded from: classes3.dex */
    public class AvatarUpdaterDelegate implements ImageUpdater.ImageUpdaterDelegate {
        private TLRPC$FileLocation avatar;
        private TLRPC$FileLocation avatarBig;
        private final long peerId;
        private ImageLocation uploadingImageLocation;
        public float uploadingProgress;

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public void didStartUpload(boolean z) {
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public /* synthetic */ String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
        }

        private AvatarUpdaterDelegate(long j) {
            GroupCallActivity.this = r1;
            this.peerId = j;
        }

        @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
        public void didUploadPhoto(final TLRPC$InputFile tLRPC$InputFile, final TLRPC$InputFile tLRPC$InputFile2, final double d, final String str, final TLRPC$PhotoSize tLRPC$PhotoSize, final TLRPC$PhotoSize tLRPC$PhotoSize2) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$3(tLRPC$InputFile, tLRPC$InputFile2, d, str, tLRPC$PhotoSize2, tLRPC$PhotoSize);
                }
            });
        }

        public /* synthetic */ void lambda$didUploadPhoto$1(final String str, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$0(tLRPC$TL_error, tLObject, str);
                }
            });
        }

        public /* synthetic */ void lambda$didUploadPhoto$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, String str) {
            if (this.uploadingImageLocation != null) {
                GroupCallActivity.this.avatarsViewPager.removeUploadingImage(this.uploadingImageLocation);
                this.uploadingImageLocation = null;
            }
            if (tLRPC$TL_error == null) {
                TLRPC$User user = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(GroupCallActivity.this.accountInstance.getUserConfig().getClientUserId()));
                if (user == null) {
                    user = GroupCallActivity.this.accountInstance.getUserConfig().getCurrentUser();
                    if (user == null) {
                        return;
                    }
                    GroupCallActivity.this.accountInstance.getMessagesController().putUser(user, false);
                } else {
                    GroupCallActivity.this.accountInstance.getUserConfig().setCurrentUser(user);
                }
                TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
                ArrayList<TLRPC$PhotoSize> arrayList = tLRPC$TL_photos_photo.photo.sizes;
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                TLRPC$VideoSize tLRPC$VideoSize = tLRPC$TL_photos_photo.photo.video_sizes.isEmpty() ? null : tLRPC$TL_photos_photo.photo.video_sizes.get(0);
                TLRPC$TL_userProfilePhoto tLRPC$TL_userProfilePhoto = new TLRPC$TL_userProfilePhoto();
                user.photo = tLRPC$TL_userProfilePhoto;
                tLRPC$TL_userProfilePhoto.photo_id = tLRPC$TL_photos_photo.photo.id;
                if (closestPhotoSizeWithSize != null) {
                    tLRPC$TL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                }
                if (closestPhotoSizeWithSize2 != null) {
                    tLRPC$TL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                }
                if (closestPhotoSizeWithSize != null && this.avatar != null) {
                    FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(this.avatar, true).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                    ImageLoader.getInstance().replaceImageInCache(this.avatar.volume_id + "_" + this.avatar.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUser(user, 1), false);
                }
                if (closestPhotoSizeWithSize2 != null && this.avatarBig != null) {
                    FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(this.avatarBig, true).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                }
                if (tLRPC$VideoSize != null && str != null) {
                    new File(str).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(tLRPC$VideoSize, "mp4", true));
                }
                GroupCallActivity.this.accountInstance.getMessagesStorage().clearUserPhotos(user.id);
                ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                GroupCallActivity.this.accountInstance.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                TLRPC$User user2 = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(this.peerId));
                ImageLocation forUser = ImageLocation.getForUser(user2, 0);
                ImageLocation forUser2 = ImageLocation.getForUser(user2, 1);
                if (ImageLocation.getForLocal(this.avatarBig) == null) {
                    forUser2 = ImageLocation.getForLocal(this.avatar);
                }
                GroupCallActivity.this.avatarsViewPager.setCreateThumbFromParent(false);
                GroupCallActivity.this.avatarsViewPager.initIfEmpty(forUser, forUser2, true);
                this.avatar = null;
                this.avatarBig = null;
                AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
                updateAvatarUploadingProgress(1.0f);
            }
            GroupCallActivity.this.accountInstance.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
            GroupCallActivity.this.accountInstance.getNotificationCenter().postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
            GroupCallActivity.this.accountInstance.getUserConfig().saveConfig(true);
        }

        public /* synthetic */ void lambda$didUploadPhoto$2() {
            if (this.uploadingImageLocation != null) {
                GroupCallActivity.this.avatarsViewPager.removeUploadingImage(this.uploadingImageLocation);
                this.uploadingImageLocation = null;
            }
            TLRPC$Chat chat = GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.peerId));
            ImageLocation forChat = ImageLocation.getForChat(chat, 0);
            ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
            if (ImageLocation.getForLocal(this.avatarBig) == null) {
                forChat2 = ImageLocation.getForLocal(this.avatar);
            }
            GroupCallActivity.this.avatarsViewPager.setCreateThumbFromParent(false);
            GroupCallActivity.this.avatarsViewPager.initIfEmpty(forChat, forChat2, true);
            this.avatar = null;
            this.avatarBig = null;
            AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
            updateAvatarUploadingProgress(1.0f);
        }

        public /* synthetic */ void lambda$didUploadPhoto$3(TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, double d, final String str, TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$PhotoSize tLRPC$PhotoSize2) {
            if (tLRPC$InputFile != null || tLRPC$InputFile2 != null) {
                if (this.peerId <= 0) {
                    GroupCallActivity.this.accountInstance.getMessagesController().changeChatAvatar(-this.peerId, null, tLRPC$InputFile, tLRPC$InputFile2, d, str, tLRPC$PhotoSize.location, tLRPC$PhotoSize2.location, new Runnable() { // from class: org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$2();
                        }
                    });
                    return;
                }
                TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
                if (tLRPC$InputFile != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile;
                    tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
                }
                if (tLRPC$InputFile2 != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.video = tLRPC$InputFile2;
                    int i = tLRPC$TL_photos_uploadProfilePhoto.flags | 2;
                    tLRPC$TL_photos_uploadProfilePhoto.flags = i;
                    tLRPC$TL_photos_uploadProfilePhoto.video_start_ts = d;
                    tLRPC$TL_photos_uploadProfilePhoto.flags = i | 4;
                }
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() { // from class: org.telegram.ui.GroupCallActivity$AvatarUpdaterDelegate$$ExternalSyntheticLambda3
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$1(str, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            this.avatar = tLRPC$PhotoSize.location;
            TLRPC$FileLocation tLRPC$FileLocation = tLRPC$PhotoSize2.location;
            this.avatarBig = tLRPC$FileLocation;
            this.uploadingImageLocation = ImageLocation.getForLocal(tLRPC$FileLocation);
            GroupCallActivity.this.avatarsViewPager.addUploadingImage(this.uploadingImageLocation, ImageLocation.getForLocal(this.avatar));
            AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
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
            this.attachedRenderersTmp.get(i).updateAttachState(true);
        }
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.update();
        }
    }

    /* loaded from: classes3.dex */
    public class GroupCallItemAnimator extends DefaultItemAnimator {
        HashSet<RecyclerView.ViewHolder> addingHolders;
        public float animationProgress;
        public ValueAnimator animator;
        float outMaxBottom;
        float outMinTop;
        HashSet<RecyclerView.ViewHolder> removingHolders;

        private GroupCallItemAnimator() {
            GroupCallActivity.this = r1;
            this.addingHolders = new HashSet<>();
            this.removingHolders = new HashSet<>();
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
                if (findContainingViewHolder != null && findContainingViewHolder.getItemViewType() != 3 && findContainingViewHolder.getItemViewType() != 4 && findContainingViewHolder.getItemViewType() != 5 && !this.addingHolders.contains(findContainingViewHolder)) {
                    this.outMaxBottom = Math.max(this.outMaxBottom, childAt.getY() + childAt.getMeasuredHeight());
                    this.outMinTop = Math.min(this.outMinTop, Math.max(0.0f, childAt.getY()));
                }
            }
            this.animationProgress = 0.0f;
            GroupCallActivity.this.listView.invalidate();
        }

        @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public void runPendingAnimations() {
            boolean z = !this.mPendingRemovals.isEmpty();
            boolean z2 = !this.mPendingMoves.isEmpty();
            boolean z3 = !this.mPendingAdditions.isEmpty();
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            if (z || z2 || z3) {
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

    public void onUserLeaveHint() {
        if (!isRtmpStream() || !AndroidUtilities.checkInlinePermissions(this.parentActivity) || RTMPStreamPipOverlay.isVisible()) {
            return;
        }
        dismiss();
        AndroidUtilities.runOnUIThread(GroupCallActivity$$ExternalSyntheticLambda47.INSTANCE, 100L);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void onCreate(Bundle bundle) {
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
            this.attachedRenderersTmp.get(i).updateAttachState(true);
        }
    }

    public void onPause() {
        paused = true;
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            this.attachedRenderersTmp.get(i).updateAttachState(false);
        }
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
}
