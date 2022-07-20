package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import java.io.ByteArrayOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.EncryptionKeyEmojifier;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC$PhoneCall;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.voip.AcceptDeclineView;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.VoIPButtonsLayout;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Components.voip.VoIPNotificationsLayout;
import org.telegram.ui.Components.voip.VoIPOverlayBackground;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.Components.voip.VoIPStatusTextView;
import org.telegram.ui.Components.voip.VoIPTextureView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Components.voip.VoIPWindowView;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
/* loaded from: classes3.dex */
public class VoIPFragment implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    private static VoIPFragment instance;
    private AcceptDeclineView acceptDeclineView;
    private AccessibilityManager accessibilityManager;
    Activity activity;
    private ImageView backIcon;
    View bottomShadow;
    private VoIPButtonsLayout buttonsLayout;
    boolean callingUserIsVideo;
    private VoIPFloatingLayout callingUserMiniFloatingLayout;
    private TextureViewRenderer callingUserMiniTextureRenderer;
    private BackupImageView callingUserPhotoView;
    private BackupImageView callingUserPhotoViewMini;
    private VoIPTextureView callingUserTextureView;
    private TextView callingUserTitle;
    boolean cameraForceExpanded;
    private Animator cameraShowingAnimator;
    private boolean canHideUI;
    private boolean canSwitchToPip;
    private boolean canZoomGesture;
    private final int currentAccount;
    private VoIPFloatingLayout currentUserCameraFloatingLayout;
    private boolean currentUserCameraIsFullscreen;
    boolean currentUserIsVideo;
    private VoIPTextureView currentUserTextureView;
    private boolean deviceIsLocked;
    private boolean emojiExpanded;
    LinearLayout emojiLayout;
    private boolean emojiLoaded;
    TextView emojiRationalTextView;
    boolean enterFromPiP;
    private float enterTransitionProgress;
    boolean fillNaviagtionBar;
    float fillNaviagtionBarValue;
    private ViewGroup fragmentView;
    boolean hideUiRunnableWaiting;
    private boolean isFinished;
    private boolean isInPinchToZoomTouchMode;
    private boolean isVideoCall;
    long lastContentTapTime;
    private WindowInsets lastInsets;
    private boolean lockOnScreen;
    ValueAnimator naviagtionBarAnimator;
    VoIPNotificationsLayout notificationsLayout;
    private VoIPOverlayBackground overlayBackground;
    private float pinchCenterX;
    private float pinchCenterY;
    private float pinchStartCenterX;
    private float pinchStartCenterY;
    private float pinchStartDistance;
    private float pinchTranslationX;
    private float pinchTranslationY;
    private int pointerId1;
    private int pointerId2;
    private PrivateVideoPreviewDialog previewDialog;
    private boolean screenWasWakeup;
    private ImageView speakerPhoneIcon;
    LinearLayout statusLayout;
    private int statusLayoutAnimateToOffset;
    private VoIPStatusTextView statusTextView;
    private boolean switchingToPip;
    HintView tapToVideoTooltip;
    View topShadow;
    float touchSlop;
    ValueAnimator uiVisibilityAnimator;
    private VoIPWindowView windowView;
    ValueAnimator zoomBackAnimator;
    private boolean zoomStarted;
    VoIPToggleButton[] bottomButtons = new VoIPToggleButton[4];
    ImageView[] emojiViews = new ImageView[4];
    Emoji.EmojiDrawable[] emojiDrawables = new Emoji.EmojiDrawable[4];
    Paint overlayPaint = new Paint();
    Paint overlayBottomPaint = new Paint();
    private boolean uiVisible = true;
    float uiVisibilityAlpha = 1.0f;
    int animationIndex = -1;
    ValueAnimator.AnimatorUpdateListener statusbarAnimatorListener = new VoIPFragment$$ExternalSyntheticLambda1(this);
    ValueAnimator.AnimatorUpdateListener navigationBarAnimationListener = new VoIPFragment$$ExternalSyntheticLambda0(this);
    Runnable hideUIRunnable = new VoIPFragment$$ExternalSyntheticLambda25(this);
    float pinchScale = 1.0f;
    TLRPC$User callingUser = VoIPService.getSharedInstance().getUser();
    private int previousState = -1;
    private int currentState = VoIPService.getSharedInstance().getCallState();

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public /* synthetic */ void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onScreenOnChange(boolean z) {
    }

    public /* synthetic */ void lambda$new$0(ValueAnimator valueAnimator) {
        this.uiVisibilityAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateSystemBarColors();
    }

    public /* synthetic */ void lambda$new$1(ValueAnimator valueAnimator) {
        this.fillNaviagtionBarValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateSystemBarColors();
    }

    public /* synthetic */ void lambda$new$2() {
        this.hideUiRunnableWaiting = false;
        if (!this.canHideUI || !this.uiVisible || this.emojiExpanded) {
            return;
        }
        this.lastContentTapTime = System.currentTimeMillis();
        showUi(false);
        this.previousState = this.currentState;
        updateViewState();
    }

    public static void show(Activity activity, int i) {
        show(activity, false, i);
    }

    public static void show(Activity activity, boolean z, int i) {
        boolean z2;
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null && voIPFragment.windowView.getParent() == null) {
            VoIPFragment voIPFragment2 = instance;
            if (voIPFragment2 != null) {
                voIPFragment2.callingUserTextureView.renderer.release();
                instance.currentUserTextureView.renderer.release();
                instance.callingUserMiniTextureRenderer.release();
                instance.destroy();
            }
            instance = null;
        }
        if (instance != null || activity.isFinishing()) {
            return;
        }
        boolean z3 = VoIPPiPView.getInstance() != null;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getUser() == null) {
            return;
        }
        VoIPFragment voIPFragment3 = new VoIPFragment(i);
        voIPFragment3.activity = activity;
        instance = voIPFragment3;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(activity, !z3, voIPFragment3);
        instance.deviceIsLocked = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        PowerManager powerManager = (PowerManager) activity.getSystemService("power");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            z2 = powerManager.isInteractive();
        } else {
            z2 = powerManager.isScreenOn();
        }
        VoIPFragment voIPFragment4 = instance;
        voIPFragment4.screenWasWakeup = true ^ z2;
        anonymousClass1.setLockOnScreen(voIPFragment4.deviceIsLocked);
        voIPFragment3.windowView = anonymousClass1;
        if (i2 >= 20) {
            anonymousClass1.setOnApplyWindowInsetsListener(new VoIPFragment$$ExternalSyntheticLambda10(voIPFragment3));
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams createWindowLayoutParams = anonymousClass1.createWindowLayoutParams();
        if (z) {
            if (i2 >= 26) {
                createWindowLayoutParams.type = 2038;
            } else {
                createWindowLayoutParams.type = 2003;
            }
        }
        windowManager.addView(anonymousClass1, createWindowLayoutParams);
        anonymousClass1.addView(voIPFragment3.createView(activity));
        if (z3) {
            voIPFragment3.enterTransitionProgress = 0.0f;
            voIPFragment3.startTransitionFromPiP();
            return;
        }
        voIPFragment3.enterTransitionProgress = 1.0f;
        voIPFragment3.updateSystemBarColors();
    }

    /* renamed from: org.telegram.ui.VoIPFragment$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends VoIPWindowView {
        final /* synthetic */ VoIPFragment val$fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity, boolean z, VoIPFragment voIPFragment) {
            super(activity, z);
            this.val$fragment = voIPFragment;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            VoIPService sharedInstance;
            if (this.val$fragment.isFinished || this.val$fragment.switchingToPip) {
                return false;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 4 || keyEvent.getAction() != 1 || this.val$fragment.lockOnScreen) {
                if ((keyCode == 25 || keyCode == 24) && this.val$fragment.currentState == 15 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    sharedInstance.stopRinging();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            }
            this.val$fragment.onBackPressed();
            return true;
        }
    }

    public static /* synthetic */ WindowInsets lambda$show$3(VoIPFragment voIPFragment, View view, WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            voIPFragment.setInsets(windowInsets);
        }
        if (i >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public void onBackPressed() {
        if (this.isFinished || this.switchingToPip) {
            return;
        }
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.dismiss(false, false);
        } else if (this.callingUserIsVideo && this.currentUserIsVideo && this.cameraForceExpanded) {
            this.cameraForceExpanded = false;
            this.currentUserCameraFloatingLayout.setRelativePosition(this.callingUserMiniFloatingLayout);
            this.currentUserCameraIsFullscreen = false;
            this.previousState = this.currentState;
            updateViewState();
        } else if (this.emojiExpanded) {
            expandEmoji(false);
        } else if (this.emojiRationalTextView.getVisibility() != 8) {
        } else {
            if (this.canSwitchToPip && !this.lockOnScreen) {
                if (AndroidUtilities.checkInlinePermissions(this.activity)) {
                    switchToPip();
                    return;
                } else {
                    requestInlinePermissions();
                    return;
                }
            }
            this.windowView.finish();
        }
    }

    public static void clearInstance() {
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        if (instance != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = instance.windowView.getMeasuredHeight();
                int i = Build.VERSION.SDK_INT;
                if (i >= 20 && (windowInsets2 = instance.lastInsets) != null) {
                    measuredHeight -= windowInsets2.getSystemWindowInsetBottom();
                }
                VoIPFragment voIPFragment = instance;
                if (voIPFragment.canSwitchToPip) {
                    VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 0);
                    if (i >= 20 && (windowInsets = instance.lastInsets) != null) {
                        VoIPPiPView.topInset = windowInsets.getSystemWindowInsetTop();
                        VoIPPiPView.bottomInset = instance.lastInsets.getSystemWindowInsetBottom();
                    }
                }
            }
            instance.callingUserTextureView.renderer.release();
            instance.currentUserTextureView.renderer.release();
            instance.callingUserMiniTextureRenderer.release();
            instance.destroy();
        }
        instance = null;
    }

    public static VoIPFragment getInstance() {
        return instance;
    }

    private void setInsets(WindowInsets windowInsets) {
        this.lastInsets = windowInsets;
        ((FrameLayout.LayoutParams) this.buttonsLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.acceptDeclineView.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.backIcon.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.speakerPhoneIcon.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.topShadow.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.statusLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(68.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.emojiLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(17.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.callingUserPhotoViewMini.getLayoutParams()).topMargin = AndroidUtilities.dp(68.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.currentUserCameraFloatingLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.callingUserMiniFloatingLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.callingUserTextureView.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.notificationsLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.bottomShadow.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        this.currentUserCameraFloatingLayout.setInsets(this.lastInsets);
        this.callingUserMiniFloatingLayout.setInsets(this.lastInsets);
        this.fragmentView.requestLayout();
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.setBottomPadding(this.lastInsets.getSystemWindowInsetBottom());
        }
    }

    public VoIPFragment(int i) {
        this.currentAccount = i;
        MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
        VoIPService.getSharedInstance().registerStateListener(this);
        VoIPService.getSharedInstance().isOutgoing();
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
    }

    public void destroy() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onStateChanged(int i) {
        int i2 = this.currentState;
        if (i2 != i) {
            this.previousState = i2;
            this.currentState = i;
            if (this.windowView == null) {
                return;
            }
            updateViewState();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.voipServiceCreated) {
            if (this.currentState != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.currentUserTextureView.renderer.release();
            this.callingUserTextureView.renderer.release();
            this.callingUserMiniTextureRenderer.release();
            initRenderers();
            VoIPService.getSharedInstance().registerStateListener(this);
        } else if (i == NotificationCenter.emojiLoaded) {
            updateKeyView(true);
        } else if (i != NotificationCenter.closeInCallActivity) {
        } else {
            this.windowView.finish();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onSignalBarsCountChanged(int i) {
        VoIPStatusTextView voIPStatusTextView = this.statusTextView;
        if (voIPStatusTextView != null) {
            voIPStatusTextView.setSignalBarCount(i);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onAudioSettingsChanged() {
        updateButtons(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onMediaStateUpdated(int i, int i2) {
        this.previousState = this.currentState;
        if (i2 == 2 && !this.isVideoCall) {
            this.isVideoCall = true;
        }
        updateViewState();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onCameraSwitch(boolean z) {
        this.previousState = this.currentState;
        updateViewState();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public void onVideoAvailableChange(boolean z) {
        this.previousState = this.currentState;
        if (z && !this.isVideoCall) {
            this.isVideoCall = true;
        }
        updateViewState();
    }

    public View createView(Context context) {
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(context, AccessibilityManager.class);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        boolean z = false;
        anonymousClass2.setClipToPadding(false);
        anonymousClass2.setClipChildren(false);
        anonymousClass2.setBackgroundColor(-16777216);
        updateSystemBarColors();
        this.fragmentView = anonymousClass2;
        anonymousClass2.setFitsSystemWindows(true);
        this.callingUserPhotoView = new AnonymousClass3(this, context);
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, true, false, false);
        this.callingUserTextureView = voIPTextureView;
        TextureViewRenderer textureViewRenderer = voIPTextureView.renderer;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        textureViewRenderer.setScalingType(scalingType);
        this.callingUserTextureView.renderer.setEnableHardwareScaler(true);
        this.callingUserTextureView.renderer.setRotateTextureWithScreen(true);
        this.callingUserTextureView.scaleType = VoIPTextureView.SCALE_TYPE_FIT;
        anonymousClass2.addView(this.callingUserPhotoView);
        anonymousClass2.addView(this.callingUserTextureView);
        BackgroundGradientDrawable backgroundGradientDrawable = new BackgroundGradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-14994098, -14328963});
        backgroundGradientDrawable.startDithering(BackgroundGradientDrawable.Sizes.ofDeviceScreen(BackgroundGradientDrawable.Sizes.Orientation.PORTRAIT), new AnonymousClass4());
        VoIPOverlayBackground voIPOverlayBackground = new VoIPOverlayBackground(context);
        this.overlayBackground = voIPOverlayBackground;
        voIPOverlayBackground.setVisibility(8);
        this.callingUserPhotoView.getImageReceiver().setDelegate(new VoIPFragment$$ExternalSyntheticLambda29(this));
        this.callingUserPhotoView.setImage(ImageLocation.getForUserOrChat(this.callingUser, 0), (String) null, backgroundGradientDrawable, this.callingUser);
        VoIPFloatingLayout voIPFloatingLayout = new VoIPFloatingLayout(context);
        this.currentUserCameraFloatingLayout = voIPFloatingLayout;
        voIPFloatingLayout.setDelegate(new VoIPFragment$$ExternalSyntheticLambda30(this));
        this.currentUserCameraFloatingLayout.setRelativePosition(1.0f, 1.0f);
        this.currentUserCameraIsFullscreen = true;
        VoIPTextureView voIPTextureView2 = new VoIPTextureView(context, true, false);
        this.currentUserTextureView = voIPTextureView2;
        voIPTextureView2.renderer.setIsCamera(true);
        this.currentUserTextureView.renderer.setUseCameraRotation(true);
        this.currentUserCameraFloatingLayout.setOnTapListener(new VoIPFragment$$ExternalSyntheticLambda12(this));
        this.currentUserTextureView.renderer.setMirror(true);
        this.currentUserCameraFloatingLayout.addView(this.currentUserTextureView);
        VoIPFloatingLayout voIPFloatingLayout2 = new VoIPFloatingLayout(context);
        this.callingUserMiniFloatingLayout = voIPFloatingLayout2;
        voIPFloatingLayout2.alwaysFloating = true;
        voIPFloatingLayout2.setFloatingMode(true, false);
        TextureViewRenderer textureViewRenderer2 = new TextureViewRenderer(context);
        this.callingUserMiniTextureRenderer = textureViewRenderer2;
        textureViewRenderer2.setEnableHardwareScaler(true);
        this.callingUserMiniTextureRenderer.setIsCamera(false);
        this.callingUserMiniTextureRenderer.setFpsReduction(30.0f);
        this.callingUserMiniTextureRenderer.setScalingType(scalingType);
        View view = new View(context);
        view.setBackgroundColor(-14999773);
        this.callingUserMiniFloatingLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
        this.callingUserMiniFloatingLayout.addView(this.callingUserMiniTextureRenderer, LayoutHelper.createFrame(-1, -2, 17));
        this.callingUserMiniFloatingLayout.setOnTapListener(new VoIPFragment$$ExternalSyntheticLambda16(this));
        this.callingUserMiniFloatingLayout.setVisibility(8);
        anonymousClass2.addView(this.currentUserCameraFloatingLayout, LayoutHelper.createFrame(-2, -2.0f));
        anonymousClass2.addView(this.callingUserMiniFloatingLayout);
        anonymousClass2.addView(this.overlayBackground);
        View view2 = new View(context);
        this.bottomShadow = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 127)}));
        anonymousClass2.addView(this.bottomShadow, LayoutHelper.createFrame(-1, 140, 80));
        View view3 = new View(context);
        this.topShadow = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ColorUtils.setAlphaComponent(-16777216, 102), 0}));
        anonymousClass2.addView(this.topShadow, LayoutHelper.createFrame(-1, 140, 48));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
        this.emojiLayout = anonymousClass5;
        anonymousClass5.setOrientation(0);
        this.emojiLayout.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        this.emojiLayout.setClipToPadding(false);
        this.emojiLayout.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda14(this));
        TextView textView = new TextView(context);
        this.emojiRationalTextView = textView;
        textView.setText(LocaleController.formatString("CallEmojiKeyTooltip", 2131624798, UserObject.getFirstName(this.callingUser)));
        this.emojiRationalTextView.setTextSize(1, 16.0f);
        this.emojiRationalTextView.setTextColor(-1);
        this.emojiRationalTextView.setGravity(17);
        this.emojiRationalTextView.setVisibility(8);
        int i = 0;
        while (i < 4) {
            this.emojiViews[i] = new ImageView(context);
            this.emojiViews[i].setScaleType(ImageView.ScaleType.FIT_XY);
            this.emojiLayout.addView(this.emojiViews[i], LayoutHelper.createLinear(22, 22, i == 0 ? 0.0f : 4.0f, 0.0f, 0.0f, 0.0f));
            i++;
        }
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context);
        this.statusLayout = anonymousClass6;
        anonymousClass6.setOrientation(1);
        this.statusLayout.setFocusable(true);
        this.statusLayout.setFocusableInTouchMode(true);
        BackupImageView backupImageView = new BackupImageView(context);
        this.callingUserPhotoViewMini = backupImageView;
        backupImageView.setImage(ImageLocation.getForUserOrChat(this.callingUser, 1), (String) null, Theme.createCircleDrawable(AndroidUtilities.dp(135.0f), -16777216), this.callingUser);
        this.callingUserPhotoViewMini.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        this.callingUserPhotoViewMini.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.callingUserTitle = textView2;
        textView2.setTextSize(1, 24.0f);
        TextView textView3 = this.callingUserTitle;
        TLRPC$User tLRPC$User = this.callingUser;
        textView3.setText(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
        this.callingUserTitle.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(0.6666667f), 1275068416);
        this.callingUserTitle.setTextColor(-1);
        this.callingUserTitle.setGravity(1);
        this.callingUserTitle.setImportantForAccessibility(2);
        this.statusLayout.addView(this.callingUserTitle, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 6));
        VoIPStatusTextView voIPStatusTextView = new VoIPStatusTextView(context);
        this.statusTextView = voIPStatusTextView;
        ViewCompat.setImportantForAccessibility(voIPStatusTextView, 4);
        this.statusLayout.addView(this.statusTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 6));
        this.statusLayout.setClipChildren(false);
        this.statusLayout.setClipToPadding(false);
        this.statusLayout.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        anonymousClass2.addView(this.callingUserPhotoViewMini, LayoutHelper.createFrame(135, 135.0f, 1, 0.0f, 68.0f, 0.0f, 0.0f));
        anonymousClass2.addView(this.statusLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 68.0f, 0.0f, 0.0f));
        anonymousClass2.addView(this.emojiLayout, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 17.0f, 0.0f, 0.0f));
        anonymousClass2.addView(this.emojiRationalTextView, LayoutHelper.createFrame(-1, -2.0f, 17, 24.0f, 32.0f, 24.0f, 0.0f));
        this.buttonsLayout = new VoIPButtonsLayout(context);
        for (int i2 = 0; i2 < 4; i2++) {
            this.bottomButtons[i2] = new VoIPToggleButton(context);
            this.buttonsLayout.addView(this.bottomButtons[i2]);
        }
        AcceptDeclineView acceptDeclineView = new AcceptDeclineView(context);
        this.acceptDeclineView = acceptDeclineView;
        acceptDeclineView.setListener(new AnonymousClass7());
        this.acceptDeclineView.setScreenWasWakeup(this.screenWasWakeup);
        anonymousClass2.addView(this.buttonsLayout, LayoutHelper.createFrame(-1, -2, 80));
        anonymousClass2.addView(this.acceptDeclineView, LayoutHelper.createFrame(-1, 186, 80));
        ImageView imageView = new ImageView(context);
        this.backIcon = imageView;
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76)));
        this.backIcon.setImageResource(2131165449);
        this.backIcon.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        this.backIcon.setContentDescription(LocaleController.getString("Back", 2131624647));
        anonymousClass2.addView(this.backIcon, LayoutHelper.createFrame(56, 56, 51));
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(this, context);
        this.speakerPhoneIcon = anonymousClass8;
        anonymousClass8.setContentDescription(LocaleController.getString("VoipSpeaker", 2131629267));
        this.speakerPhoneIcon.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76)));
        this.speakerPhoneIcon.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        anonymousClass2.addView(this.speakerPhoneIcon, LayoutHelper.createFrame(56, 56, 53));
        this.speakerPhoneIcon.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda17(this));
        this.backIcon.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda11(this));
        if (this.windowView.isLockOnScreen()) {
            this.backIcon.setVisibility(8);
        }
        VoIPNotificationsLayout voIPNotificationsLayout = new VoIPNotificationsLayout(context);
        this.notificationsLayout = voIPNotificationsLayout;
        voIPNotificationsLayout.setGravity(80);
        this.notificationsLayout.setOnViewsUpdated(new VoIPFragment$$ExternalSyntheticLambda27(this));
        anonymousClass2.addView(this.notificationsLayout, LayoutHelper.createFrame(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        HintView hintView = new HintView(context, 4);
        this.tapToVideoTooltip = hintView;
        hintView.setText(LocaleController.getString("TapToTurnCamera", 2131628614));
        anonymousClass2.addView(this.tapToVideoTooltip, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 8.0f));
        this.tapToVideoTooltip.setBottomOffset(AndroidUtilities.dp(4.0f));
        this.tapToVideoTooltip.setVisibility(8);
        updateViewState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!this.isVideoCall) {
                TLRPC$PhoneCall tLRPC$PhoneCall = sharedInstance.privateCall;
                if (tLRPC$PhoneCall != null && tLRPC$PhoneCall.video) {
                    z = true;
                }
                this.isVideoCall = z;
            }
            initRenderers();
        }
        return anonymousClass2;
    }

    /* renamed from: org.telegram.ui.VoIPFragment$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends FrameLayout {
        boolean check;
        long pressedTime;
        float pressedX;
        float pressedY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context) {
            super(context);
            VoIPFragment.this = r1;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            int i = Build.VERSION.SDK_INT;
            if (i >= 20 && VoIPFragment.this.lastInsets != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), VoIPFragment.this.lastInsets.getSystemWindowInsetTop(), VoIPFragment.this.overlayPaint);
            }
            if (i < 20 || VoIPFragment.this.lastInsets == null) {
                return;
            }
            canvas.drawRect(0.0f, getMeasuredHeight() - VoIPFragment.this.lastInsets.getSystemWindowInsetBottom(), getMeasuredWidth(), getMeasuredHeight(), VoIPFragment.this.overlayBottomPaint);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!VoIPFragment.this.canZoomGesture && !VoIPFragment.this.isInPinchToZoomTouchMode && !VoIPFragment.this.zoomStarted && motionEvent.getActionMasked() != 0) {
                VoIPFragment.this.finishZoom();
                return false;
            }
            if (motionEvent.getActionMasked() == 0) {
                VoIPFragment.this.canZoomGesture = false;
                VoIPFragment.this.isInPinchToZoomTouchMode = false;
                VoIPFragment.this.zoomStarted = false;
            }
            VoIPTextureView fullscreenTextureView = VoIPFragment.this.getFullscreenTextureView();
            if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                if (motionEvent.getActionMasked() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(fullscreenTextureView.getX(), fullscreenTextureView.getY(), fullscreenTextureView.getX() + fullscreenTextureView.getMeasuredWidth(), fullscreenTextureView.getY() + fullscreenTextureView.getMeasuredHeight());
                    rectF.inset(((fullscreenTextureView.getMeasuredHeight() * fullscreenTextureView.scaleTextureToFill) - fullscreenTextureView.getMeasuredHeight()) / 2.0f, ((fullscreenTextureView.getMeasuredWidth() * fullscreenTextureView.scaleTextureToFill) - fullscreenTextureView.getMeasuredWidth()) / 2.0f);
                    if (!GroupCallActivity.isLandscapeMode) {
                        rectF.top = Math.max(rectF.top, ActionBar.getCurrentActionBarHeight());
                        rectF.bottom = Math.min(rectF.bottom, fullscreenTextureView.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                    } else {
                        rectF.top = Math.max(rectF.top, ActionBar.getCurrentActionBarHeight());
                        rectF.right = Math.min(rectF.right, fullscreenTextureView.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                    }
                    VoIPFragment.this.canZoomGesture = rectF.contains(motionEvent.getX(), motionEvent.getY());
                    if (!VoIPFragment.this.canZoomGesture) {
                        VoIPFragment.this.finishZoom();
                    }
                }
                if (VoIPFragment.this.canZoomGesture && !VoIPFragment.this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                    VoIPFragment.this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                    VoIPFragment voIPFragment = VoIPFragment.this;
                    voIPFragment.pinchStartCenterX = voIPFragment.pinchCenterX = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                    VoIPFragment voIPFragment2 = VoIPFragment.this;
                    voIPFragment2.pinchStartCenterY = voIPFragment2.pinchCenterY = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                    VoIPFragment voIPFragment3 = VoIPFragment.this;
                    voIPFragment3.pinchScale = 1.0f;
                    voIPFragment3.pointerId1 = motionEvent.getPointerId(0);
                    VoIPFragment.this.pointerId2 = motionEvent.getPointerId(1);
                    VoIPFragment.this.isInPinchToZoomTouchMode = true;
                }
            } else if (motionEvent.getActionMasked() == 2 && VoIPFragment.this.isInPinchToZoomTouchMode) {
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                    if (VoIPFragment.this.pointerId1 == motionEvent.getPointerId(i3)) {
                        i = i3;
                    }
                    if (VoIPFragment.this.pointerId2 == motionEvent.getPointerId(i3)) {
                        i2 = i3;
                    }
                }
                if (i != -1 && i2 != -1) {
                    VoIPFragment.this.pinchScale = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / VoIPFragment.this.pinchStartDistance;
                    VoIPFragment voIPFragment4 = VoIPFragment.this;
                    if (voIPFragment4.pinchScale > 1.005f && !voIPFragment4.zoomStarted) {
                        VoIPFragment.this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                        VoIPFragment voIPFragment5 = VoIPFragment.this;
                        voIPFragment5.pinchStartCenterX = voIPFragment5.pinchCenterX = (motionEvent.getX(i) + motionEvent.getX(i2)) / 2.0f;
                        VoIPFragment voIPFragment6 = VoIPFragment.this;
                        voIPFragment6.pinchStartCenterY = voIPFragment6.pinchCenterY = (motionEvent.getY(i) + motionEvent.getY(i2)) / 2.0f;
                        VoIPFragment voIPFragment7 = VoIPFragment.this;
                        voIPFragment7.pinchScale = 1.0f;
                        voIPFragment7.pinchTranslationX = 0.0f;
                        VoIPFragment.this.pinchTranslationY = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        VoIPFragment.this.zoomStarted = true;
                        VoIPFragment.this.isInPinchToZoomTouchMode = true;
                    }
                    float x = VoIPFragment.this.pinchStartCenterX - ((motionEvent.getX(i) + motionEvent.getX(i2)) / 2.0f);
                    float y = VoIPFragment.this.pinchStartCenterY - ((motionEvent.getY(i) + motionEvent.getY(i2)) / 2.0f);
                    VoIPFragment voIPFragment8 = VoIPFragment.this;
                    voIPFragment8.pinchTranslationX = (-x) / voIPFragment8.pinchScale;
                    VoIPFragment voIPFragment9 = VoIPFragment.this;
                    voIPFragment9.pinchTranslationY = (-y) / voIPFragment9.pinchScale;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    VoIPFragment.this.finishZoom();
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && VoIPFragment.this.checkPointerIds(motionEvent)) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                VoIPFragment.this.finishZoom();
            }
            VoIPFragment.this.fragmentView.invalidate();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.pressedX = motionEvent.getX();
                this.pressedY = motionEvent.getY();
                this.check = true;
                this.pressedTime = System.currentTimeMillis();
            } else if (action != 1) {
                if (action == 3) {
                    this.check = false;
                }
            } else if (this.check) {
                float x2 = motionEvent.getX() - this.pressedX;
                float y2 = motionEvent.getY() - this.pressedY;
                long currentTimeMillis = System.currentTimeMillis();
                float f = (x2 * x2) + (y2 * y2);
                VoIPFragment voIPFragment10 = VoIPFragment.this;
                float f2 = voIPFragment10.touchSlop;
                if (f < f2 * f2 && currentTimeMillis - this.pressedTime < 300 && currentTimeMillis - voIPFragment10.lastContentTapTime > 300) {
                    voIPFragment10.lastContentTapTime = System.currentTimeMillis();
                    if (VoIPFragment.this.emojiExpanded) {
                        VoIPFragment.this.expandEmoji(false);
                    } else if (VoIPFragment.this.canHideUI) {
                        VoIPFragment voIPFragment11 = VoIPFragment.this;
                        voIPFragment11.showUi(!voIPFragment11.uiVisible);
                        VoIPFragment voIPFragment12 = VoIPFragment.this;
                        voIPFragment12.previousState = voIPFragment12.currentState;
                        VoIPFragment.this.updateViewState();
                    }
                }
                this.check = false;
            }
            return VoIPFragment.this.canZoomGesture || this.check;
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == VoIPFragment.this.callingUserPhotoView) {
                VoIPFragment voIPFragment = VoIPFragment.this;
                if (voIPFragment.currentUserIsVideo || voIPFragment.callingUserIsVideo) {
                    return false;
                }
            }
            if ((view == VoIPFragment.this.callingUserPhotoView || view == VoIPFragment.this.callingUserTextureView || (view == VoIPFragment.this.currentUserCameraFloatingLayout && VoIPFragment.this.currentUserCameraIsFullscreen)) && (VoIPFragment.this.zoomStarted || VoIPFragment.this.zoomBackAnimator != null)) {
                canvas.save();
                VoIPFragment voIPFragment2 = VoIPFragment.this;
                float f = voIPFragment2.pinchScale;
                canvas.scale(f, f, voIPFragment2.pinchCenterX, VoIPFragment.this.pinchCenterY);
                canvas.translate(VoIPFragment.this.pinchTranslationX, VoIPFragment.this.pinchTranslationY);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    /* renamed from: org.telegram.ui.VoIPFragment$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 extends BackupImageView {
        int blackoutColor = ColorUtils.setAlphaComponent(-16777216, 76);

        AnonymousClass3(VoIPFragment voIPFragment, Context context) {
            super(context);
        }

        @Override // org.telegram.ui.Components.BackupImageView, android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(this.blackoutColor);
        }
    }

    /* renamed from: org.telegram.ui.VoIPFragment$4 */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 extends BackgroundGradientDrawable.ListenerAdapter {
        AnonymousClass4() {
            VoIPFragment.this = r1;
        }

        @Override // org.telegram.ui.Components.BackgroundGradientDrawable.ListenerAdapter, org.telegram.ui.Components.BackgroundGradientDrawable.Listener
        public void onAllSizesReady() {
            VoIPFragment.this.callingUserPhotoView.invalidate();
        }
    }

    public /* synthetic */ void lambda$createView$4(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (bitmapSafe != null) {
            this.overlayBackground.setBackground(bitmapSafe);
        }
    }

    public /* synthetic */ void lambda$createView$5(float f, boolean z) {
        this.currentUserTextureView.setScreenshareMiniProgress(f, z);
    }

    public /* synthetic */ void lambda$createView$6(View view) {
        if (!this.currentUserIsVideo || !this.callingUserIsVideo || System.currentTimeMillis() - this.lastContentTapTime <= 500) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
        this.hideUiRunnableWaiting = false;
        this.lastContentTapTime = System.currentTimeMillis();
        this.callingUserMiniFloatingLayout.setRelativePosition(this.currentUserCameraFloatingLayout);
        this.currentUserCameraIsFullscreen = true;
        this.cameraForceExpanded = true;
        this.previousState = this.currentState;
        updateViewState();
    }

    public /* synthetic */ void lambda$createView$7(View view) {
        if (!this.cameraForceExpanded || System.currentTimeMillis() - this.lastContentTapTime <= 500) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
        this.hideUiRunnableWaiting = false;
        this.lastContentTapTime = System.currentTimeMillis();
        this.currentUserCameraFloatingLayout.setRelativePosition(this.callingUserMiniFloatingLayout);
        this.currentUserCameraIsFullscreen = false;
        this.cameraForceExpanded = false;
        this.previousState = this.currentState;
        updateViewState();
    }

    /* renamed from: org.telegram.ui.VoIPFragment$5 */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 extends LinearLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Context context) {
            super(context);
            VoIPFragment.this = r1;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setVisibleToUser(VoIPFragment.this.emojiLoaded);
        }
    }

    public /* synthetic */ void lambda$createView$8(View view) {
        if (System.currentTimeMillis() - this.lastContentTapTime < 500) {
            return;
        }
        this.lastContentTapTime = System.currentTimeMillis();
        if (!this.emojiLoaded) {
            return;
        }
        expandEmoji(!this.emojiExpanded);
    }

    /* renamed from: org.telegram.ui.VoIPFragment$6 */
    /* loaded from: classes3.dex */
    public class AnonymousClass6 extends LinearLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(Context context) {
            super(context);
            VoIPFragment.this = r1;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            CharSequence text = VoIPFragment.this.callingUserTitle.getText();
            if (sharedInstance == null || TextUtils.isEmpty(text)) {
                return;
            }
            StringBuilder sb = new StringBuilder(text);
            sb.append(", ");
            TLRPC$PhoneCall tLRPC$PhoneCall = sharedInstance.privateCall;
            if (tLRPC$PhoneCall != null && tLRPC$PhoneCall.video) {
                sb.append(LocaleController.getString("VoipInVideoCallBranding", 2131629212));
            } else {
                sb.append(LocaleController.getString("VoipInCallBranding", 2131629210));
            }
            long callDuration = sharedInstance.getCallDuration();
            if (callDuration > 0) {
                sb.append(", ");
                sb.append(LocaleController.formatDuration((int) (callDuration / 1000)));
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* renamed from: org.telegram.ui.VoIPFragment$7 */
    /* loaded from: classes3.dex */
    public class AnonymousClass7 implements AcceptDeclineView.Listener {
        AnonymousClass7() {
            VoIPFragment.this = r1;
        }

        @Override // org.telegram.ui.Components.voip.AcceptDeclineView.Listener
        public void onAccept() {
            if (VoIPFragment.this.currentState == 17) {
                Intent intent = new Intent(VoIPFragment.this.activity, VoIPService.class);
                intent.putExtra("user_id", VoIPFragment.this.callingUser.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", VoIPFragment.this.isVideoCall);
                intent.putExtra("can_video_call", VoIPFragment.this.isVideoCall);
                intent.putExtra("account", VoIPFragment.this.currentAccount);
                try {
                    VoIPFragment.this.activity.startService(intent);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            } else if (Build.VERSION.SDK_INT >= 23 && VoIPFragment.this.activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                VoIPFragment.this.activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
            } else if (VoIPService.getSharedInstance() == null) {
            } else {
                VoIPService.getSharedInstance().acceptIncomingCall();
                if (!VoIPFragment.this.currentUserIsVideo) {
                    return;
                }
                VoIPService.getSharedInstance().requestVideoCall(false);
            }
        }

        @Override // org.telegram.ui.Components.voip.AcceptDeclineView.Listener
        public void onDecline() {
            if (VoIPFragment.this.currentState == 17) {
                VoIPFragment.this.windowView.finish();
            } else if (VoIPService.getSharedInstance() == null) {
            } else {
                VoIPService.getSharedInstance().declineIncomingCall();
            }
        }
    }

    /* renamed from: org.telegram.ui.VoIPFragment$8 */
    /* loaded from: classes3.dex */
    public class AnonymousClass8 extends ImageView {
        AnonymousClass8(VoIPFragment voIPFragment, Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                accessibilityNodeInfo.setChecked(sharedInstance.isSpeakerphoneOn());
            }
        }
    }

    public /* synthetic */ void lambda$createView$9(View view) {
        if (this.speakerPhoneIcon.getTag() == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(this.activity, false);
    }

    public /* synthetic */ void lambda$createView$10(View view) {
        if (!this.lockOnScreen) {
            onBackPressed();
        }
    }

    public /* synthetic */ void lambda$createView$11() {
        this.previousState = this.currentState;
        updateViewState();
    }

    public boolean checkPointerIds(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return false;
        }
        if (this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) {
            return true;
        }
        return this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0);
    }

    public VoIPTextureView getFullscreenTextureView() {
        if (this.callingUserIsVideo) {
            return this.callingUserTextureView;
        }
        return this.currentUserTextureView;
    }

    public void finishZoom() {
        if (this.zoomStarted) {
            this.zoomStarted = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.zoomBackAnimator = ofFloat;
            ofFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda2(this, this.pinchScale, this.pinchTranslationX, this.pinchTranslationY));
            this.zoomBackAnimator.addListener(new AnonymousClass9());
            this.zoomBackAnimator.setDuration(350L);
            this.zoomBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.zoomBackAnimator.start();
        }
        this.canZoomGesture = false;
        this.isInPinchToZoomTouchMode = false;
    }

    public /* synthetic */ void lambda$finishZoom$12(float f, float f2, float f3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.pinchScale = (f * floatValue) + ((1.0f - floatValue) * 1.0f);
        this.pinchTranslationX = f2 * floatValue;
        this.pinchTranslationY = f3 * floatValue;
        this.fragmentView.invalidate();
    }

    /* renamed from: org.telegram.ui.VoIPFragment$9 */
    /* loaded from: classes3.dex */
    public class AnonymousClass9 extends AnimatorListenerAdapter {
        AnonymousClass9() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoIPFragment voIPFragment = VoIPFragment.this;
            voIPFragment.zoomBackAnimator = null;
            voIPFragment.pinchScale = 1.0f;
            voIPFragment.pinchTranslationX = 0.0f;
            VoIPFragment.this.pinchTranslationY = 0.0f;
            VoIPFragment.this.fragmentView.invalidate();
        }
    }

    /* renamed from: org.telegram.ui.VoIPFragment$10 */
    /* loaded from: classes3.dex */
    public class AnonymousClass10 implements RendererCommon.RendererEvents {
        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i, int i2, int i3) {
        }

        AnonymousClass10() {
            VoIPFragment.this = r1;
        }

        public /* synthetic */ void lambda$onFirstFrameRendered$0() {
            VoIPFragment.this.updateViewState();
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            AndroidUtilities.runOnUIThread(new VoIPFragment$10$$ExternalSyntheticLambda0(this));
        }
    }

    private void initRenderers() {
        this.currentUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass10());
        this.callingUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass11(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.callingUserMiniTextureRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    /* renamed from: org.telegram.ui.VoIPFragment$11 */
    /* loaded from: classes3.dex */
    public class AnonymousClass11 implements RendererCommon.RendererEvents {
        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i, int i2, int i3) {
        }

        AnonymousClass11() {
            VoIPFragment.this = r1;
        }

        public /* synthetic */ void lambda$onFirstFrameRendered$0() {
            VoIPFragment.this.updateViewState();
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            AndroidUtilities.runOnUIThread(new VoIPFragment$11$$ExternalSyntheticLambda0(this));
        }
    }

    public void switchToPip() {
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        if (this.isFinished || !AndroidUtilities.checkInlinePermissions(this.activity) || instance == null) {
            return;
        }
        this.isFinished = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = instance.windowView.getMeasuredHeight();
            int i = Build.VERSION.SDK_INT;
            if (i >= 20 && (windowInsets2 = instance.lastInsets) != null) {
                measuredHeight -= windowInsets2.getSystemWindowInsetBottom();
            }
            VoIPFragment voIPFragment = instance;
            VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 1);
            if (i >= 20 && (windowInsets = instance.lastInsets) != null) {
                VoIPPiPView.topInset = windowInsets.getSystemWindowInsetTop();
                VoIPPiPView.bottomInset = instance.lastInsets.getSystemWindowInsetBottom();
            }
        }
        if (VoIPPiPView.getInstance() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().alpha(0.0f).setDuration(150L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        duration.setInterpolator(cubicBezierInterpolator).start();
        this.backIcon.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.emojiLayout.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.statusLayout.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.buttonsLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.bottomShadow.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.topShadow.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.callingUserMiniFloatingLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.notificationsLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        VoIPPiPView.switchingToPip = true;
        this.switchingToPip = true;
        Animator createPiPTransition = createPiPTransition(false);
        this.animationIndex = NotificationCenter.getInstance(this.currentAccount).setAnimationInProgress(this.animationIndex, null);
        createPiPTransition.addListener(new AnonymousClass12());
        createPiPTransition.setDuration(350L);
        createPiPTransition.setInterpolator(cubicBezierInterpolator);
        createPiPTransition.start();
    }

    /* renamed from: org.telegram.ui.VoIPFragment$12 */
    /* loaded from: classes3.dex */
    public class AnonymousClass12 extends AnimatorListenerAdapter {
        AnonymousClass12() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoIPPiPView.getInstance().windowView.setAlpha(1.0f);
            AndroidUtilities.runOnUIThread(new VoIPFragment$12$$ExternalSyntheticLambda0(this), 200L);
        }

        public /* synthetic */ void lambda$onAnimationEnd$0() {
            NotificationCenter.getInstance(VoIPFragment.this.currentAccount).onAnimationFinish(VoIPFragment.this.animationIndex);
            VoIPPiPView.getInstance().onTransitionEnd();
            VoIPFragment.this.currentUserCameraFloatingLayout.setCornerRadius(-1.0f);
            VoIPFragment.this.callingUserTextureView.renderer.release();
            VoIPFragment.this.currentUserTextureView.renderer.release();
            VoIPFragment.this.callingUserMiniTextureRenderer.release();
            VoIPFragment.this.destroy();
            VoIPFragment.this.windowView.finishImmediate();
            VoIPPiPView.switchingToPip = false;
            VoIPFragment.this.switchingToPip = false;
            VoIPFragment unused = VoIPFragment.instance = null;
        }
    }

    public void startTransitionFromPiP() {
        this.enterFromPiP = true;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) == 2) {
            this.callingUserTextureView.setStub(VoIPPiPView.getInstance().callingUserTextureView);
            this.currentUserTextureView.setStub(VoIPPiPView.getInstance().currentUserTextureView);
        }
        this.windowView.setAlpha(0.0f);
        updateViewState();
        this.switchingToPip = true;
        VoIPPiPView.switchingToPip = true;
        VoIPPiPView.prepareForTransition();
        this.animationIndex = NotificationCenter.getInstance(this.currentAccount).setAnimationInProgress(this.animationIndex, null);
        AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda23(this), 32L);
    }

    public /* synthetic */ void lambda$startTransitionFromPiP$14() {
        this.windowView.setAlpha(1.0f);
        Animator createPiPTransition = createPiPTransition(true);
        this.backIcon.setAlpha(0.0f);
        this.emojiLayout.setAlpha(0.0f);
        this.statusLayout.setAlpha(0.0f);
        this.buttonsLayout.setAlpha(0.0f);
        this.bottomShadow.setAlpha(0.0f);
        this.topShadow.setAlpha(0.0f);
        this.speakerPhoneIcon.setAlpha(0.0f);
        this.notificationsLayout.setAlpha(0.0f);
        this.callingUserPhotoView.setAlpha(0.0f);
        this.currentUserCameraFloatingLayout.switchingToPip = true;
        AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda28(this, createPiPTransition), 32L);
    }

    public /* synthetic */ void lambda$startTransitionFromPiP$13(Animator animator) {
        VoIPPiPView.switchingToPip = false;
        VoIPPiPView.finish();
        ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().setDuration(150L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        duration.setInterpolator(cubicBezierInterpolator).start();
        this.backIcon.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.emojiLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.statusLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.buttonsLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.bottomShadow.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.topShadow.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.notificationsLayout.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.callingUserPhotoView.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        animator.addListener(new AnonymousClass13());
        animator.setDuration(350L);
        animator.setInterpolator(cubicBezierInterpolator);
        animator.start();
    }

    /* renamed from: org.telegram.ui.VoIPFragment$13 */
    /* loaded from: classes3.dex */
    public class AnonymousClass13 extends AnimatorListenerAdapter {
        AnonymousClass13() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            NotificationCenter.getInstance(VoIPFragment.this.currentAccount).onAnimationFinish(VoIPFragment.this.animationIndex);
            VoIPFragment.this.currentUserCameraFloatingLayout.setCornerRadius(-1.0f);
            VoIPFragment.this.switchingToPip = false;
            VoIPFragment.this.currentUserCameraFloatingLayout.switchingToPip = false;
            VoIPFragment voIPFragment = VoIPFragment.this;
            voIPFragment.previousState = voIPFragment.currentState;
            VoIPFragment.this.updateViewState();
        }
    }

    public Animator createPiPTransition(boolean z) {
        float f;
        float f2;
        float f3;
        boolean z2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        this.currentUserCameraFloatingLayout.animate().cancel();
        float f9 = VoIPPiPView.getInstance().windowLayoutParams.x + VoIPPiPView.getInstance().xOffset;
        float f10 = VoIPPiPView.getInstance().windowLayoutParams.y + VoIPPiPView.getInstance().yOffset;
        float x = this.currentUserCameraFloatingLayout.getX();
        float y = this.currentUserCameraFloatingLayout.getY();
        float scaleX = this.currentUserCameraFloatingLayout.getScaleX();
        float f11 = VoIPPiPView.isExpanding() ? 0.4f : 0.25f;
        float measuredWidth = f9 - ((this.callingUserTextureView.getMeasuredWidth() - (this.callingUserTextureView.getMeasuredWidth() * f11)) / 2.0f);
        float measuredHeight = f10 - ((this.callingUserTextureView.getMeasuredHeight() - (this.callingUserTextureView.getMeasuredHeight() * f11)) / 2.0f);
        if (this.callingUserIsVideo) {
            int measuredWidth2 = this.currentUserCameraFloatingLayout.getMeasuredWidth();
            if (!this.currentUserIsVideo || measuredWidth2 == 0) {
                f8 = 1.0f;
                f7 = 1.0f;
                z2 = false;
                f6 = 0.0f;
            } else {
                f6 = (this.windowView.getMeasuredWidth() / measuredWidth2) * f11 * 0.4f;
                f8 = (((f9 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * f6)) / 2.0f)) + (VoIPPiPView.getInstance().parentWidth * f11)) - ((VoIPPiPView.getInstance().parentWidth * f11) * 0.4f)) - AndroidUtilities.dp(4.0f);
                f7 = (((f10 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * f6)) / 2.0f)) + (VoIPPiPView.getInstance().parentHeight * f11)) - ((VoIPPiPView.getInstance().parentHeight * f11) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z2 = true;
            }
            f2 = f8;
            f = f7;
            f3 = f6;
        } else {
            f2 = f9 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * f11)) / 2.0f);
            f = f10 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * f11)) / 2.0f);
            f3 = f11;
            z2 = true;
        }
        float dp = this.callingUserIsVideo ? AndroidUtilities.dp(4.0f) : 0.0f;
        float dp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f3;
        if (this.callingUserIsVideo) {
            f4 = VoIPPiPView.isExpanding() ? 1.0f : 0.0f;
        } else {
            f4 = 1.0f;
        }
        if (z) {
            if (z2) {
                this.currentUserCameraFloatingLayout.setScaleX(f3);
                this.currentUserCameraFloatingLayout.setScaleY(f3);
                this.currentUserCameraFloatingLayout.setTranslationX(f2);
                this.currentUserCameraFloatingLayout.setTranslationY(f);
                this.currentUserCameraFloatingLayout.setCornerRadius(dp2);
                this.currentUserCameraFloatingLayout.setAlpha(f4);
            }
            this.callingUserTextureView.setScaleX(f11);
            this.callingUserTextureView.setScaleY(f11);
            this.callingUserTextureView.setTranslationX(measuredWidth);
            this.callingUserTextureView.setTranslationY(measuredHeight);
            this.callingUserTextureView.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / f11);
            f5 = 0.0f;
            this.callingUserPhotoView.setAlpha(0.0f);
            this.callingUserPhotoView.setScaleX(f11);
            this.callingUserPhotoView.setScaleY(f11);
            this.callingUserPhotoView.setTranslationX(measuredWidth);
            this.callingUserPhotoView.setTranslationY(measuredHeight);
        } else {
            f5 = 0.0f;
        }
        float[] fArr = new float[2];
        fArr[0] = z ? 1.0f : 0.0f;
        fArr[1] = z ? 0.0f : 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (!z) {
            f5 = 1.0f;
        }
        this.enterTransitionProgress = f5;
        updateSystemBarColors();
        ofFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda3(this, z2, scaleX, f3, x, f2, y, f, dp, dp2, 1.0f, f4, 1.0f, f11, 0.0f, measuredWidth, 0.0f, measuredHeight));
        return ofFloat;
    }

    public /* synthetic */ void lambda$createPiPTransition$15(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = 1.0f - floatValue;
        this.enterTransitionProgress = f17;
        updateSystemBarColors();
        if (z) {
            float f18 = (f * f17) + (f2 * floatValue);
            this.currentUserCameraFloatingLayout.setScaleX(f18);
            this.currentUserCameraFloatingLayout.setScaleY(f18);
            this.currentUserCameraFloatingLayout.setTranslationX((f3 * f17) + (f4 * floatValue));
            this.currentUserCameraFloatingLayout.setTranslationY((f5 * f17) + (f6 * floatValue));
            this.currentUserCameraFloatingLayout.setCornerRadius((f7 * f17) + (f8 * floatValue));
            this.currentUserCameraFloatingLayout.setAlpha((f9 * f17) + (f10 * floatValue));
        }
        float f19 = (f11 * f17) + (f12 * floatValue);
        this.callingUserTextureView.setScaleX(f19);
        this.callingUserTextureView.setScaleY(f19);
        float f20 = (f13 * f17) + (f14 * floatValue);
        float f21 = (f15 * f17) + (f16 * floatValue);
        this.callingUserTextureView.setTranslationX(f20);
        this.callingUserTextureView.setTranslationY(f21);
        this.callingUserTextureView.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f19);
        if (!this.currentUserCameraFloatingLayout.measuredAsFloatingMode) {
            this.currentUserTextureView.setScreenshareMiniProgress(floatValue, false);
        }
        this.callingUserPhotoView.setScaleX(f19);
        this.callingUserPhotoView.setScaleY(f19);
        this.callingUserPhotoView.setTranslationX(f20);
        this.callingUserPhotoView.setTranslationY(f21);
        this.callingUserPhotoView.setAlpha(f17);
    }

    public void expandEmoji(boolean z) {
        if (!this.emojiLoaded || this.emojiExpanded == z || !this.uiVisible) {
            return;
        }
        this.emojiExpanded = z;
        if (z) {
            AndroidUtilities.runOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            float measuredWidth = (this.windowView.getMeasuredWidth() - AndroidUtilities.dp(128.0f)) / this.emojiLayout.getMeasuredWidth();
            this.emojiLayout.animate().scaleX(measuredWidth).scaleY(measuredWidth).translationY((this.windowView.getHeight() / 2.0f) - this.emojiLayout.getBottom()).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(250L).start();
            this.emojiRationalTextView.animate().setListener(null).cancel();
            if (this.emojiRationalTextView.getVisibility() != 0) {
                this.emojiRationalTextView.setVisibility(0);
                this.emojiRationalTextView.setAlpha(0.0f);
            }
            this.emojiRationalTextView.animate().alpha(1.0f).setDuration(150L).start();
            this.overlayBackground.animate().setListener(null).cancel();
            if (this.overlayBackground.getVisibility() != 0) {
                this.overlayBackground.setVisibility(0);
                this.overlayBackground.setAlpha(0.0f);
                this.overlayBackground.setShowBlackout(this.currentUserIsVideo || this.callingUserIsVideo, false);
            }
            this.overlayBackground.animate().alpha(1.0f).setDuration(150L).start();
            return;
        }
        this.emojiLayout.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(150L).start();
        if (this.emojiRationalTextView.getVisibility() == 8) {
            return;
        }
        this.emojiRationalTextView.animate().alpha(0.0f).setListener(new AnonymousClass14()).setDuration(150L).start();
        this.overlayBackground.animate().alpha(0.0f).setListener(new AnonymousClass15()).setDuration(150L).start();
    }

    /* renamed from: org.telegram.ui.VoIPFragment$14 */
    /* loaded from: classes3.dex */
    public class AnonymousClass14 extends AnimatorListenerAdapter {
        AnonymousClass14() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (VoIPFragment.this.canHideUI && !VoIPFragment.this.hideUiRunnableWaiting && sharedInstance != null && !sharedInstance.isMicMute()) {
                AndroidUtilities.runOnUIThread(VoIPFragment.this.hideUIRunnable, 3000L);
                VoIPFragment.this.hideUiRunnableWaiting = true;
            }
            VoIPFragment.this.emojiRationalTextView.setVisibility(8);
        }
    }

    /* renamed from: org.telegram.ui.VoIPFragment$15 */
    /* loaded from: classes3.dex */
    public class AnonymousClass15 extends AnimatorListenerAdapter {
        AnonymousClass15() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoIPFragment.this.overlayBackground.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0259 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateViewState() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        TLRPC$PhoneCall tLRPC$PhoneCall;
        int i2;
        if (this.isFinished || this.switchingToPip) {
            return;
        }
        this.lockOnScreen = false;
        boolean z6 = this.previousState != -1;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i3 = this.currentState;
        if (i3 == 1 || i3 == 2) {
            this.statusTextView.setText(LocaleController.getString("VoipConnecting", 2131629087), true, z6);
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    this.statusTextView.setText(LocaleController.getString("VoipFailed", 2131629097), false, z6);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : "ERROR_UNKNOWN";
                    if (!TextUtils.equals(lastError, "ERROR_UNKNOWN")) {
                        if (TextUtils.equals(lastError, "ERROR_INCOMPATIBLE")) {
                            TLRPC$User tLRPC$User = this.callingUser;
                            showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", 2131629245, ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name))));
                        } else if (TextUtils.equals(lastError, "ERROR_PEER_OUTDATED")) {
                            if (this.isVideoCall) {
                                boolean[] zArr = new boolean[1];
                                AlertDialog show = new DarkAlertDialog.Builder(this.activity).setTitle(LocaleController.getString("VoipFailed", 2131629097)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerVideoOutdated", 2131629247, UserObject.getFirstName(this.callingUser)))).setNegativeButton(LocaleController.getString("Cancel", 2131624832), new VoIPFragment$$ExternalSyntheticLambda5(this)).setPositiveButton(LocaleController.getString("VoipPeerVideoOutdatedMakeVoice", 2131629248), new VoIPFragment$$ExternalSyntheticLambda7(this, zArr)).show();
                                show.setCanceledOnTouchOutside(true);
                                show.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda9(this, zArr));
                            } else {
                                showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", 2131629246, UserObject.getFirstName(this.callingUser))));
                            }
                        } else if (TextUtils.equals(lastError, "ERROR_PRIVACY")) {
                            TLRPC$User tLRPC$User2 = this.callingUser;
                            showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString("CallNotAvailable", 2131624811, ContactsController.formatName(tLRPC$User2.first_name, tLRPC$User2.last_name))));
                        } else if (TextUtils.equals(lastError, "ERROR_AUDIO_IO")) {
                            showErrorDialog("Error initializing audio hardware");
                        } else if (TextUtils.equals(lastError, "ERROR_LOCALIZED")) {
                            this.windowView.finish();
                        } else if (TextUtils.equals(lastError, "ERROR_CONNECTION_SERVICE")) {
                            showErrorDialog(LocaleController.getString("VoipErrorUnknown", 2131629095));
                        } else {
                            AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda21(this), 1000L);
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda26(this), 1000L);
                    }
                } else if (i3 != 5) {
                    switch (i3) {
                        case 11:
                            this.currentUserTextureView.saveCameraLastBitmap();
                            AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda24(this), 200L);
                            break;
                        case 12:
                            this.statusTextView.setText(LocaleController.getString("VoipExchangingKeys", 2131629096), true, z6);
                            break;
                        case 13:
                            this.statusTextView.setText(LocaleController.getString("VoipWaiting", 2131629287), true, z6);
                            break;
                        case 14:
                            this.statusTextView.setText(LocaleController.getString("VoipRequesting", 2131629260), true, z6);
                            break;
                        case 15:
                            this.lockOnScreen = true;
                            i = AndroidUtilities.dp(24.0f);
                            this.acceptDeclineView.setRetryMod(false);
                            if (sharedInstance != null && sharedInstance.privateCall.video) {
                                z4 = this.currentUserIsVideo && this.callingUser.photo != null;
                                this.statusTextView.setText(LocaleController.getString("VoipInVideoCallBranding", 2131629212), true, z6);
                                this.acceptDeclineView.setTranslationY(-AndroidUtilities.dp(60.0f));
                                z3 = true;
                            } else {
                                this.statusTextView.setText(LocaleController.getString("VoipInCallBranding", 2131629210), true, z6);
                                this.acceptDeclineView.setTranslationY(0.0f);
                                z4 = false;
                                z3 = true;
                                break;
                            }
                            break;
                        case 16:
                            this.statusTextView.setText(LocaleController.getString("VoipRinging", 2131629261), true, z6);
                            break;
                        case 17:
                            this.statusTextView.setText(LocaleController.getString("VoipBusy", 2131629036), false, z6);
                            this.acceptDeclineView.setRetryMod(true);
                            this.currentUserIsVideo = false;
                            this.callingUserIsVideo = false;
                            i = 0;
                            z4 = false;
                            z3 = true;
                            break;
                    }
                    z2 = false;
                    z = false;
                    if (this.previewDialog == null) {
                        return;
                    }
                    if (sharedInstance != null) {
                        this.callingUserIsVideo = sharedInstance.getRemoteVideoState() == 2;
                        boolean z7 = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
                        this.currentUserIsVideo = z7;
                        if (z7 && !this.isVideoCall) {
                            this.isVideoCall = true;
                        }
                    }
                    if (z6) {
                        this.currentUserCameraFloatingLayout.saveRelativePosition();
                        this.callingUserMiniFloatingLayout.saveRelativePosition();
                    }
                    if (this.callingUserIsVideo) {
                        if (!this.switchingToPip) {
                            this.callingUserPhotoView.setAlpha(1.0f);
                        }
                        if (z6) {
                            this.callingUserTextureView.animate().alpha(1.0f).setDuration(250L).start();
                        } else {
                            this.callingUserTextureView.animate().cancel();
                            this.callingUserTextureView.setAlpha(1.0f);
                        }
                        if (!this.callingUserTextureView.renderer.isFirstFrameRendered() && !this.enterFromPiP) {
                            this.callingUserIsVideo = false;
                        }
                    }
                    if (this.currentUserIsVideo || this.callingUserIsVideo) {
                        fillNavigationBar(true, z6);
                    } else {
                        fillNavigationBar(false, z6);
                        this.callingUserPhotoView.setVisibility(0);
                        if (z6) {
                            this.callingUserTextureView.animate().alpha(0.0f).setDuration(250L).start();
                        } else {
                            this.callingUserTextureView.animate().cancel();
                            this.callingUserTextureView.setAlpha(0.0f);
                        }
                    }
                    boolean z8 = this.currentUserIsVideo;
                    if (!z8 || !this.callingUserIsVideo) {
                        this.cameraForceExpanded = false;
                    }
                    boolean z9 = z8 && this.cameraForceExpanded;
                    showCallingUserAvatarMini(z4, z6);
                    int dp = i + (this.callingUserPhotoViewMini.getTag() == null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f));
                    showAcceptDeclineView(z3, z6);
                    this.windowView.setLockOnScreen(this.lockOnScreen || this.deviceIsLocked);
                    boolean z10 = this.currentState == 3 && (this.currentUserIsVideo || this.callingUserIsVideo);
                    this.canHideUI = z10;
                    if (!z10 && !this.uiVisible) {
                        showUi(true);
                    }
                    if (this.uiVisible && this.canHideUI && !this.hideUiRunnableWaiting && sharedInstance != null && !sharedInstance.isMicMute()) {
                        AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
                        this.hideUiRunnableWaiting = true;
                    } else if (sharedInstance != null && sharedInstance.isMicMute()) {
                        AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
                        this.hideUiRunnableWaiting = false;
                    }
                    if (!this.uiVisible) {
                        dp -= AndroidUtilities.dp(50.0f);
                    }
                    int i4 = dp;
                    if (z6) {
                        if (this.lockOnScreen || !this.uiVisible) {
                            if (this.backIcon.getVisibility() != 0) {
                                this.backIcon.setVisibility(0);
                                this.backIcon.setAlpha(0.0f);
                            }
                            this.backIcon.animate().alpha(0.0f).start();
                        } else {
                            this.backIcon.animate().alpha(1.0f).start();
                        }
                        this.notificationsLayout.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.uiVisible ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    } else {
                        if (!this.lockOnScreen) {
                            this.backIcon.setVisibility(0);
                        }
                        this.backIcon.setAlpha(this.lockOnScreen ? 0.0f : 1.0f);
                        this.notificationsLayout.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.uiVisible ? AndroidUtilities.dp(80.0f) : 0));
                    }
                    int i5 = this.currentState;
                    if (i5 != 10 && i5 != 11) {
                        updateButtons(z6);
                    }
                    if (z2) {
                        this.statusTextView.showTimer(z6);
                    }
                    this.statusTextView.showReconnect(z, z6);
                    if (z6) {
                        if (i4 != this.statusLayoutAnimateToOffset) {
                            this.statusLayout.animate().translationY(i4).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        }
                    } else {
                        this.statusLayout.setTranslationY(i4);
                    }
                    this.statusLayoutAnimateToOffset = i4;
                    this.overlayBackground.setShowBlackout(this.currentUserIsVideo || this.callingUserIsVideo, z6);
                    int i6 = this.currentState;
                    this.canSwitchToPip = (i6 == 11 || i6 == 17 || (!this.currentUserIsVideo && !this.callingUserIsVideo)) ? false : true;
                    if (sharedInstance != null) {
                        if (this.currentUserIsVideo) {
                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                        }
                        this.currentUserTextureView.setIsScreencast(sharedInstance.isScreencast());
                        this.currentUserTextureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
                        sharedInstance.setSinks((!this.currentUserIsVideo || sharedInstance.isScreencast()) ? null : this.currentUserTextureView.renderer, z9 ? this.callingUserMiniTextureRenderer : this.callingUserTextureView.renderer);
                        if (z6) {
                            this.notificationsLayout.beforeLayoutChanges();
                        }
                        if ((this.currentUserIsVideo || this.callingUserIsVideo) && (((i2 = this.currentState) == 3 || i2 == 5) && sharedInstance.getCallDuration() > 500)) {
                            if (sharedInstance.getRemoteAudioState() == 0) {
                                this.notificationsLayout.addNotification(2131165315, LocaleController.formatString("VoipUserMicrophoneIsOff", 2131629277, UserObject.getFirstName(this.callingUser)), "muted", z6);
                            } else {
                                this.notificationsLayout.removeNotification("muted");
                            }
                            if (sharedInstance.getRemoteVideoState() == 0) {
                                this.notificationsLayout.addNotification(2131165306, LocaleController.formatString("VoipUserCameraIsOff", 2131629276, UserObject.getFirstName(this.callingUser)), "video", z6);
                            } else {
                                this.notificationsLayout.removeNotification("video");
                            }
                        } else {
                            if (sharedInstance.getRemoteAudioState() == 0) {
                                this.notificationsLayout.addNotification(2131165315, LocaleController.formatString("VoipUserMicrophoneIsOff", 2131629277, UserObject.getFirstName(this.callingUser)), "muted", z6);
                            } else {
                                this.notificationsLayout.removeNotification("muted");
                            }
                            this.notificationsLayout.removeNotification("video");
                        }
                        if (this.notificationsLayout.getChildCount() == 0 && this.callingUserIsVideo && (tLRPC$PhoneCall = sharedInstance.privateCall) != null && !tLRPC$PhoneCall.video) {
                            VoIPService.SharedUIParams sharedUIParams = sharedInstance.sharedUIParams;
                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                this.tapToVideoTooltip.showForView(this.bottomButtons[1], true);
                                if (z6) {
                                    this.notificationsLayout.animateLayoutChanges();
                                }
                            }
                        }
                        if (this.notificationsLayout.getChildCount() != 0) {
                            this.tapToVideoTooltip.hide();
                        }
                        if (z6) {
                        }
                    }
                    int childsHight = this.notificationsLayout.getChildsHight();
                    this.callingUserMiniFloatingLayout.setBottomOffset(childsHight, z6);
                    this.currentUserCameraFloatingLayout.setBottomOffset(childsHight, z6);
                    this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
                    this.callingUserMiniFloatingLayout.setUiVisible(this.uiVisible);
                    if (this.currentUserIsVideo) {
                        if (!this.callingUserIsVideo || this.cameraForceExpanded) {
                            z5 = true;
                            showFloatingLayout(1, z6);
                        } else {
                            showFloatingLayout(2, z6);
                            z5 = true;
                        }
                    } else {
                        z5 = true;
                        showFloatingLayout(0, z6);
                    }
                    if (z9 && this.callingUserMiniFloatingLayout.getTag() == null) {
                        this.callingUserMiniFloatingLayout.setIsActive(z5);
                        if (this.callingUserMiniFloatingLayout.getVisibility() != 0) {
                            this.callingUserMiniFloatingLayout.setVisibility(0);
                            this.callingUserMiniFloatingLayout.setAlpha(0.0f);
                            this.callingUserMiniFloatingLayout.setScaleX(0.5f);
                            this.callingUserMiniFloatingLayout.setScaleY(0.5f);
                        }
                        this.callingUserMiniFloatingLayout.animate().setListener(null).cancel();
                        this.callingUserMiniFloatingLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).setStartDelay(150L).start();
                        this.callingUserMiniFloatingLayout.setTag(1);
                    } else if (!z9 && this.callingUserMiniFloatingLayout.getTag() != null) {
                        this.callingUserMiniFloatingLayout.setIsActive(false);
                        this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnonymousClass16()).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        this.callingUserMiniFloatingLayout.setTag(null);
                    }
                    this.currentUserCameraFloatingLayout.restoreRelativePosition();
                    this.callingUserMiniFloatingLayout.restoreRelativePosition();
                    updateSpeakerPhoneIcon();
                    return;
                }
            }
            updateKeyView(z6);
            if (this.currentState == 5) {
                i = 0;
                z4 = false;
                z3 = false;
                z2 = true;
                z = true;
                if (this.previewDialog == null) {
                }
            } else {
                i = 0;
                z4 = false;
                z3 = false;
                z2 = true;
                z = false;
                if (this.previewDialog == null) {
                }
            }
        }
        i = 0;
        z4 = false;
        z3 = false;
        z2 = false;
        z = false;
        if (this.previewDialog == null) {
        }
    }

    public /* synthetic */ void lambda$updateViewState$16() {
        this.windowView.finish();
    }

    public /* synthetic */ void lambda$updateViewState$17(DialogInterface dialogInterface, int i) {
        this.windowView.finish();
    }

    public /* synthetic */ void lambda$updateViewState$18(boolean[] zArr, DialogInterface dialogInterface, int i) {
        zArr[0] = true;
        this.currentState = 17;
        Intent intent = new Intent(this.activity, VoIPService.class);
        intent.putExtra("user_id", this.callingUser.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", false);
        intent.putExtra("can_video_call", false);
        intent.putExtra("account", this.currentAccount);
        try {
            this.activity.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public /* synthetic */ void lambda$updateViewState$19(boolean[] zArr, DialogInterface dialogInterface) {
        if (!zArr[0]) {
            this.windowView.finish();
        }
    }

    public /* synthetic */ void lambda$updateViewState$20() {
        this.windowView.finish();
    }

    public /* synthetic */ void lambda$updateViewState$21() {
        this.windowView.finish();
    }

    /* renamed from: org.telegram.ui.VoIPFragment$16 */
    /* loaded from: classes3.dex */
    public class AnonymousClass16 extends AnimatorListenerAdapter {
        AnonymousClass16() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (VoIPFragment.this.callingUserMiniFloatingLayout.getTag() == null) {
                VoIPFragment.this.callingUserMiniFloatingLayout.setVisibility(8);
            }
        }
    }

    private void fillNavigationBar(boolean z, boolean z2) {
        if (this.switchingToPip) {
            return;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (!z2) {
            ValueAnimator valueAnimator = this.naviagtionBarAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z) {
                f = 1.0f;
            }
            this.fillNaviagtionBarValue = f;
            Paint paint = this.overlayBottomPaint;
            if (!z) {
                f2 = 0.5f;
            }
            paint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f2 * 255.0f)));
        } else if (z != this.fillNaviagtionBar) {
            ValueAnimator valueAnimator2 = this.naviagtionBarAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float[] fArr = new float[2];
            fArr[0] = this.fillNaviagtionBarValue;
            if (z) {
                f = 1.0f;
            }
            fArr[1] = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.naviagtionBarAnimator = ofFloat;
            ofFloat.addUpdateListener(this.navigationBarAnimationListener);
            this.naviagtionBarAnimator.setDuration(300L);
            this.naviagtionBarAnimator.setInterpolator(new LinearInterpolator());
            this.naviagtionBarAnimator.start();
        }
        this.fillNaviagtionBar = z;
    }

    public void showUi(boolean z) {
        ValueAnimator valueAnimator = this.uiVisibilityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i = 0;
        if (!z && this.uiVisible) {
            ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(50.0f)).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.backIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(50.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.emojiLayout.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(50.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.statusLayout.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.buttonsLayout.animate().alpha(0.0f).translationY(AndroidUtilities.dp(50.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.bottomShadow.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.topShadow.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.uiVisibilityAlpha, 0.0f);
            this.uiVisibilityAnimator = ofFloat;
            ofFloat.addUpdateListener(this.statusbarAnimatorListener);
            this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator);
            this.uiVisibilityAnimator.start();
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            this.buttonsLayout.setEnabled(false);
        } else if (z && !this.uiVisible) {
            this.tapToVideoTooltip.hide();
            ViewPropertyAnimator duration2 = this.speakerPhoneIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
            duration2.setInterpolator(cubicBezierInterpolator2).start();
            this.backIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.emojiLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.statusLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.buttonsLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.bottomShadow.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.topShadow.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.uiVisibilityAlpha, 1.0f);
            this.uiVisibilityAnimator = ofFloat2;
            ofFloat2.addUpdateListener(this.statusbarAnimatorListener);
            this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator2);
            this.uiVisibilityAnimator.start();
            this.buttonsLayout.setEnabled(true);
        }
        this.uiVisible = z;
        this.windowView.requestFullscreen(!z);
        ViewPropertyAnimator animate = this.notificationsLayout.animate();
        int i2 = -AndroidUtilities.dp(16.0f);
        if (this.uiVisible) {
            i = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i2 - i).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    private void showFloatingLayout(int i, boolean z) {
        Animator animator;
        if (this.currentUserCameraFloatingLayout.getTag() == null || ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 2) {
            this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
        }
        if (!z && (animator = this.cameraShowingAnimator) != null) {
            animator.removeAllListeners();
            this.cameraShowingAnimator.cancel();
        }
        boolean z2 = true;
        if (i != 0) {
            boolean z3 = (this.currentUserCameraFloatingLayout.getTag() == null || ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 0) ? false : z;
            if (z) {
                if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 0) {
                    if (this.currentUserCameraFloatingLayout.getVisibility() == 8) {
                        this.currentUserCameraFloatingLayout.setAlpha(0.0f);
                        this.currentUserCameraFloatingLayout.setScaleX(0.7f);
                        this.currentUserCameraFloatingLayout.setScaleY(0.7f);
                        this.currentUserCameraFloatingLayout.setVisibility(0);
                    }
                    Animator animator2 = this.cameraShowingAnimator;
                    if (animator2 != null) {
                        animator2.removeAllListeners();
                        this.cameraShowingAnimator.cancel();
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, View.SCALE_Y, 0.7f, 1.0f));
                    this.cameraShowingAnimator = animatorSet;
                    animatorSet.setDuration(150L).start();
                }
            } else {
                this.currentUserCameraFloatingLayout.setVisibility(0);
            }
            if (this.currentUserCameraFloatingLayout.getTag() == null || ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 2) {
                VoIPFloatingLayout voIPFloatingLayout = this.currentUserCameraFloatingLayout;
                if (voIPFloatingLayout.relativePositionToSetX < 0.0f) {
                    voIPFloatingLayout.setRelativePosition(1.0f, 1.0f);
                    this.currentUserCameraIsFullscreen = true;
                }
            }
            this.currentUserCameraFloatingLayout.setFloatingMode(i == 2, z3);
            if (i == 2) {
                z2 = false;
            }
            this.currentUserCameraIsFullscreen = z2;
        } else if (z) {
            if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 0) {
                Animator animator3 = this.cameraShowingAnimator;
                if (animator3 != null) {
                    animator3.removeAllListeners();
                    this.cameraShowingAnimator.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                VoIPFloatingLayout voIPFloatingLayout2 = this.currentUserCameraFloatingLayout;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(voIPFloatingLayout2, View.ALPHA, voIPFloatingLayout2.getAlpha(), 0.0f));
                if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 2) {
                    VoIPFloatingLayout voIPFloatingLayout3 = this.currentUserCameraFloatingLayout;
                    Property property = View.SCALE_X;
                    float[] fArr = {voIPFloatingLayout3.getScaleX(), 0.7f};
                    VoIPFloatingLayout voIPFloatingLayout4 = this.currentUserCameraFloatingLayout;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(voIPFloatingLayout3, property, fArr), ObjectAnimator.ofFloat(voIPFloatingLayout4, View.SCALE_Y, voIPFloatingLayout4.getScaleX(), 0.7f));
                }
                this.cameraShowingAnimator = animatorSet2;
                animatorSet2.addListener(new AnonymousClass17());
                this.cameraShowingAnimator.setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.cameraShowingAnimator.setStartDelay(50L);
                this.cameraShowingAnimator.start();
            }
        } else {
            this.currentUserCameraFloatingLayout.setVisibility(8);
        }
        this.currentUserCameraFloatingLayout.setTag(Integer.valueOf(i));
    }

    /* renamed from: org.telegram.ui.VoIPFragment$17 */
    /* loaded from: classes3.dex */
    public class AnonymousClass17 extends AnimatorListenerAdapter {
        AnonymousClass17() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoIPFragment.this.currentUserCameraFloatingLayout.setTranslationX(0.0f);
            VoIPFragment.this.currentUserCameraFloatingLayout.setTranslationY(0.0f);
            VoIPFragment.this.currentUserCameraFloatingLayout.setScaleY(1.0f);
            VoIPFragment.this.currentUserCameraFloatingLayout.setScaleX(1.0f);
            VoIPFragment.this.currentUserCameraFloatingLayout.setVisibility(8);
        }
    }

    private void showCallingUserAvatarMini(boolean z, boolean z2) {
        int i = 0;
        Integer num = null;
        if (z2) {
            if (z && this.callingUserPhotoViewMini.getTag() == null) {
                this.callingUserPhotoViewMini.animate().setListener(null).cancel();
                this.callingUserPhotoViewMini.setVisibility(0);
                this.callingUserPhotoViewMini.setAlpha(0.0f);
                this.callingUserPhotoViewMini.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.callingUserPhotoViewMini.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            } else if (!z && this.callingUserPhotoViewMini.getTag() != null) {
                this.callingUserPhotoViewMini.animate().setListener(null).cancel();
                this.callingUserPhotoViewMini.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(135.0f)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).setListener(new AnonymousClass18()).start();
            }
        } else {
            this.callingUserPhotoViewMini.animate().setListener(null).cancel();
            this.callingUserPhotoViewMini.setTranslationY(0.0f);
            this.callingUserPhotoViewMini.setAlpha(1.0f);
            BackupImageView backupImageView = this.callingUserPhotoViewMini;
            if (!z) {
                i = 8;
            }
            backupImageView.setVisibility(i);
        }
        BackupImageView backupImageView2 = this.callingUserPhotoViewMini;
        if (z) {
            num = 1;
        }
        backupImageView2.setTag(num);
    }

    /* renamed from: org.telegram.ui.VoIPFragment$18 */
    /* loaded from: classes3.dex */
    public class AnonymousClass18 extends AnimatorListenerAdapter {
        AnonymousClass18() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoIPFragment.this.callingUserPhotoViewMini.setVisibility(8);
        }
    }

    private void updateKeyView(boolean z) {
        VoIPService sharedInstance;
        if (!this.emojiLoaded && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            byte[] bArr = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
                byteArrayOutputStream.write(sharedInstance.getGA());
                bArr = byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            if (bArr == null) {
                return;
            }
            String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(bArr, 0, bArr.length));
            for (int i = 0; i < 4; i++) {
                Emoji.preloadEmoji(emojifyForCall[i]);
                Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(emojifyForCall[i]);
                if (emojiDrawable != null) {
                    emojiDrawable.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
                    emojiDrawable.preload();
                    this.emojiViews[i].setImageDrawable(emojiDrawable);
                    this.emojiViews[i].setContentDescription(emojifyForCall[i]);
                    this.emojiViews[i].setVisibility(8);
                }
                this.emojiDrawables[i] = emojiDrawable;
            }
            checkEmojiLoaded(z);
        }
    }

    private void checkEmojiLoaded(boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            Emoji.EmojiDrawable[] emojiDrawableArr = this.emojiDrawables;
            if (emojiDrawableArr[i2] != null && emojiDrawableArr[i2].isLoaded()) {
                i++;
            }
        }
        if (i == 4) {
            this.emojiLoaded = true;
            for (int i3 = 0; i3 < 4; i3++) {
                if (this.emojiViews[i3].getVisibility() != 0) {
                    this.emojiViews[i3].setVisibility(0);
                    if (z) {
                        this.emojiViews[i3].setAlpha(0.0f);
                        this.emojiViews[i3].setTranslationY(AndroidUtilities.dp(30.0f));
                        this.emojiViews[i3].animate().alpha(1.0f).translationY(0.0f).setDuration(200L).setStartDelay(i3 * 20).start();
                    }
                }
            }
        }
    }

    private void showAcceptDeclineView(boolean z, boolean z2) {
        int i = 0;
        Integer num = null;
        if (!z2) {
            AcceptDeclineView acceptDeclineView = this.acceptDeclineView;
            if (!z) {
                i = 8;
            }
            acceptDeclineView.setVisibility(i);
        } else {
            if (z && this.acceptDeclineView.getTag() == null) {
                this.acceptDeclineView.animate().setListener(null).cancel();
                if (this.acceptDeclineView.getVisibility() == 8) {
                    this.acceptDeclineView.setVisibility(0);
                    this.acceptDeclineView.setAlpha(0.0f);
                }
                this.acceptDeclineView.animate().alpha(1.0f);
            }
            if (!z && this.acceptDeclineView.getTag() != null) {
                this.acceptDeclineView.animate().setListener(null).cancel();
                this.acceptDeclineView.animate().setListener(new AnonymousClass19()).alpha(0.0f);
            }
        }
        this.acceptDeclineView.setEnabled(z);
        AcceptDeclineView acceptDeclineView2 = this.acceptDeclineView;
        if (z) {
            num = 1;
        }
        acceptDeclineView2.setTag(num);
    }

    /* renamed from: org.telegram.ui.VoIPFragment$19 */
    /* loaded from: classes3.dex */
    public class AnonymousClass19 extends AnimatorListenerAdapter {
        AnonymousClass19() {
            VoIPFragment.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoIPFragment.this.acceptDeclineView.setVisibility(8);
        }
    }

    private void updateButtons(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z && Build.VERSION.SDK_INT >= 19) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new AnonymousClass20(this).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            transitionSet.addTransition(duration.setInterpolator(cubicBezierInterpolator)).addTransition(new ChangeBounds().setDuration(150L).setInterpolator(cubicBezierInterpolator));
            transitionSet.excludeChildren(VoIPToggleButton.class, true);
            TransitionManager.beginDelayedTransition(this.buttonsLayout, transitionSet);
        }
        int i = this.currentState;
        if (i == 15 || i == 17) {
            TLRPC$PhoneCall tLRPC$PhoneCall = sharedInstance.privateCall;
            if (tLRPC$PhoneCall != null && tLRPC$PhoneCall.video && i == 15) {
                if (!sharedInstance.isScreencast() && (this.currentUserIsVideo || this.callingUserIsVideo)) {
                    setFrontalCameraAction(this.bottomButtons[0], sharedInstance, z);
                    if (this.uiVisible) {
                        this.speakerPhoneIcon.animate().alpha(1.0f).start();
                    }
                } else {
                    setSpeakerPhoneAction(this.bottomButtons[0], sharedInstance, z);
                    this.speakerPhoneIcon.animate().alpha(0.0f).start();
                }
                setVideoAction(this.bottomButtons[1], sharedInstance, z);
                setMicrohoneAction(this.bottomButtons[2], sharedInstance, z);
            } else {
                this.bottomButtons[0].setVisibility(8);
                this.bottomButtons[1].setVisibility(8);
                this.bottomButtons[2].setVisibility(8);
            }
            this.bottomButtons[3].setVisibility(8);
        } else if (instance == null) {
            return;
        } else {
            if (!sharedInstance.isScreencast() && (this.currentUserIsVideo || this.callingUserIsVideo)) {
                setFrontalCameraAction(this.bottomButtons[0], sharedInstance, z);
                if (this.uiVisible) {
                    this.speakerPhoneIcon.setTag(1);
                    this.speakerPhoneIcon.animate().alpha(1.0f).start();
                }
            } else {
                setSpeakerPhoneAction(this.bottomButtons[0], sharedInstance, z);
                this.speakerPhoneIcon.setTag(null);
                this.speakerPhoneIcon.animate().alpha(0.0f).start();
            }
            setVideoAction(this.bottomButtons[1], sharedInstance, z);
            setMicrohoneAction(this.bottomButtons[2], sharedInstance, z);
            this.bottomButtons[3].setData(2131165307, -1, -1041108, LocaleController.getString("VoipEndCall", 2131629094), false, z);
            this.bottomButtons[3].setOnClickListener(VoIPFragment$$ExternalSyntheticLambda20.INSTANCE);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.bottomButtons[i3].getVisibility() == 0) {
                this.bottomButtons[i3].animationDelay = i2;
                i2 += 16;
            }
        }
        updateSpeakerPhoneIcon();
    }

    /* renamed from: org.telegram.ui.VoIPFragment$20 */
    /* loaded from: classes3.dex */
    public class AnonymousClass20 extends Visibility {
        AnonymousClass20(VoIPFragment voIPFragment) {
        }

        @Override // android.transition.Visibility
        public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, AndroidUtilities.dp(100.0f), 0.0f);
            if (view instanceof VoIPToggleButton) {
                view.setTranslationY(AndroidUtilities.dp(100.0f));
                ofFloat.setStartDelay(((VoIPToggleButton) view).animationDelay);
            }
            return ofFloat;
        }

        @Override // android.transition.Visibility
        public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, view.getTranslationY(), AndroidUtilities.dp(100.0f));
        }
    }

    public static /* synthetic */ void lambda$updateButtons$22(View view) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp();
        }
    }

    private void setMicrohoneAction(VoIPToggleButton voIPToggleButton, VoIPService voIPService, boolean z) {
        if (voIPService.isMicMute()) {
            voIPToggleButton.setData(2131165320, -16777216, -1, LocaleController.getString("VoipUnmute", 2131629274), true, z);
        } else {
            voIPToggleButton.setData(2131165320, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipMute", 2131629216), false, z);
        }
        this.currentUserCameraFloatingLayout.setMuted(voIPService.isMicMute(), z);
        voIPToggleButton.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda15(this));
    }

    public /* synthetic */ void lambda$setMicrohoneAction$23(View view) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            boolean z = !sharedInstance.isMicMute();
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                if (z) {
                    str = LocaleController.getString("AccDescrVoipMicOff", 2131624112);
                } else {
                    str = LocaleController.getString("AccDescrVoipMicOn", 2131624113);
                }
                view.announceForAccessibility(str);
            }
            sharedInstance.setMicMute(z, false, true);
            this.previousState = this.currentState;
            updateViewState();
        }
    }

    private void setVideoAction(VoIPToggleButton voIPToggleButton, VoIPService voIPService, boolean z) {
        if ((this.currentUserIsVideo || this.callingUserIsVideo) ? true : voIPService.isVideoAvailable()) {
            if (this.currentUserIsVideo) {
                voIPToggleButton.setData(voIPService.isScreencast() ? 2131165317 : 2131165321, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipStopVideo", 2131629269), false, z);
            } else {
                voIPToggleButton.setData(2131165321, -16777216, -1, LocaleController.getString("VoipStartVideo", 2131629268), true, z);
            }
            voIPToggleButton.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
            voIPToggleButton.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda19(this, voIPService));
            voIPToggleButton.setEnabled(true);
            return;
        }
        voIPToggleButton.setData(2131165321, ColorUtils.setAlphaComponent(-1, 127), ColorUtils.setAlphaComponent(-1, 30), "Video", false, z);
        voIPToggleButton.setOnClickListener(null);
        voIPToggleButton.setEnabled(false);
    }

    public /* synthetic */ void lambda$setVideoAction$25(VoIPService voIPService, View view) {
        TLRPC$PhoneCall tLRPC$PhoneCall;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && this.activity.checkSelfPermission("android.permission.CAMERA") != 0) {
            this.activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else if (i < 21 && (tLRPC$PhoneCall = voIPService.privateCall) != null && !tLRPC$PhoneCall.video && !this.callingUserIsVideo && !voIPService.sharedUIParams.cameraAlertWasShowed) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);
            builder.setMessage(LocaleController.getString("VoipSwitchToVideoCall", 2131629271));
            builder.setPositiveButton(LocaleController.getString("VoipSwitch", 2131629270), new VoIPFragment$$ExternalSyntheticLambda6(this, voIPService));
            builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
            builder.create().show();
        } else {
            toggleCameraInput();
        }
    }

    public /* synthetic */ void lambda$setVideoAction$24(VoIPService voIPService, DialogInterface dialogInterface, int i) {
        voIPService.sharedUIParams.cameraAlertWasShowed = true;
        toggleCameraInput();
    }

    private void updateSpeakerPhoneIcon() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            this.speakerPhoneIcon.setImageResource(2131165304);
        } else if (sharedInstance.isSpeakerphoneOn()) {
            this.speakerPhoneIcon.setImageResource(2131165318);
        } else if (sharedInstance.isHeadsetPlugged()) {
            this.speakerPhoneIcon.setImageResource(2131165311);
        } else {
            this.speakerPhoneIcon.setImageResource(2131165312);
        }
    }

    private void setSpeakerPhoneAction(VoIPToggleButton voIPToggleButton, VoIPService voIPService, boolean z) {
        if (voIPService.isBluetoothOn()) {
            voIPToggleButton.setData(2131165304, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipAudioRoutingBluetooth", 2131629030), false, z);
            voIPToggleButton.setChecked(false, z);
        } else if (voIPService.isSpeakerphoneOn()) {
            voIPToggleButton.setData(2131165318, -16777216, -1, LocaleController.getString("VoipSpeaker", 2131629267), false, z);
            voIPToggleButton.setChecked(true, z);
        } else {
            voIPToggleButton.setData(2131165318, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipSpeaker", 2131629267), false, z);
            voIPToggleButton.setChecked(false, z);
        }
        voIPToggleButton.setCheckableForAccessibility(true);
        voIPToggleButton.setEnabled(true);
        voIPToggleButton.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda13(this));
    }

    public /* synthetic */ void lambda$setSpeakerPhoneAction$26(View view) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(this.activity, false);
        }
    }

    private void setFrontalCameraAction(VoIPToggleButton voIPToggleButton, VoIPService voIPService, boolean z) {
        if (!this.currentUserIsVideo) {
            voIPToggleButton.setData(2131165308, ColorUtils.setAlphaComponent(-1, 127), ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipFlip", 2131629099), false, z);
            voIPToggleButton.setOnClickListener(null);
            voIPToggleButton.setEnabled(false);
            return;
        }
        voIPToggleButton.setEnabled(true);
        if (!voIPService.isFrontFaceCamera()) {
            voIPToggleButton.setData(2131165308, -16777216, -1, LocaleController.getString("VoipFlip", 2131629099), false, z);
        } else {
            voIPToggleButton.setData(2131165308, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipFlip", 2131629099), false, z);
        }
        voIPToggleButton.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda18(this, voIPService));
    }

    public /* synthetic */ void lambda$setFrontalCameraAction$27(VoIPService voIPService, View view) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    str = LocaleController.getString("AccDescrVoipCamSwitchedToBack", 2131624110);
                } else {
                    str = LocaleController.getString("AccDescrVoipCamSwitchedToFront", 2131624111);
                }
                view.announceForAccessibility(str);
            }
            sharedInstance.switchCamera();
        }
    }

    public void onScreenCastStart() {
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog == null) {
            return;
        }
        privateVideoPreviewDialog.dismiss(true, true);
    }

    private void toggleCameraInput() {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                if (!this.currentUserIsVideo) {
                    str = LocaleController.getString("AccDescrVoipCamOn", 2131624109);
                } else {
                    str = LocaleController.getString("AccDescrVoipCamOff", 2131624108);
                }
                this.fragmentView.announceForAccessibility(str);
            }
            if (!this.currentUserIsVideo) {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (this.previewDialog != null) {
                        return;
                    }
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.windowView.setLockOnScreen(true);
                    AnonymousClass21 anonymousClass21 = new AnonymousClass21(this.fragmentView.getContext(), false, true);
                    this.previewDialog = anonymousClass21;
                    WindowInsets windowInsets = this.lastInsets;
                    if (windowInsets != null) {
                        anonymousClass21.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.fragmentView.addView(this.previewDialog);
                    return;
                }
                this.currentUserIsVideo = true;
                if (!sharedInstance.isSpeakerphoneOn()) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(this.activity, false);
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
            } else {
                this.currentUserTextureView.saveCameraLastBitmap();
                sharedInstance.setVideoState(false, 0);
                if (Build.VERSION.SDK_INT >= 21) {
                    sharedInstance.clearCamera();
                }
            }
            this.previousState = this.currentState;
            updateViewState();
        }
    }

    /* renamed from: org.telegram.ui.VoIPFragment$21 */
    /* loaded from: classes3.dex */
    public class AnonymousClass21 extends PrivateVideoPreviewDialog {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass21(Context context, boolean z, boolean z2) {
            super(context, z, z2);
            VoIPFragment.this = r1;
        }

        @Override // org.telegram.ui.Components.voip.PrivateVideoPreviewDialog
        public void onDismiss(boolean z, boolean z2) {
            VoIPFragment.this.previewDialog = null;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            VoIPFragment.this.windowView.setLockOnScreen(false);
            if (z2) {
                VoIPFragment.this.currentUserIsVideo = true;
                if (sharedInstance != null && !z) {
                    sharedInstance.requestVideoCall(false);
                    sharedInstance.setVideoState(false, 2);
                }
            } else if (sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            VoIPFragment voIPFragment = VoIPFragment.this;
            voIPFragment.previousState = voIPFragment.currentState;
            VoIPFragment.this.updateViewState();
        }
    }

    public static void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null) {
            voIPFragment.onRequestPermissionsResultInternal(i, strArr, iArr);
        }
    }

    @TargetApi(23)
    private void onRequestPermissionsResultInternal(int i, String[] strArr, int[] iArr) {
        if (i == 101) {
            if (VoIPService.getSharedInstance() == null) {
                this.windowView.finish();
                return;
            } else if (iArr.length > 0 && iArr[0] == 0) {
                VoIPService.getSharedInstance().acceptIncomingCall();
            } else if (!this.activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                VoIPService.getSharedInstance().declineIncomingCall();
                VoIPHelper.permissionDenied(this.activity, new VoIPFragment$$ExternalSyntheticLambda22(this), i);
                return;
            }
        }
        if (i == 102) {
            if (VoIPService.getSharedInstance() == null) {
                this.windowView.finish();
            } else if (iArr.length <= 0 || iArr[0] != 0) {
            } else {
                toggleCameraInput();
            }
        }
    }

    public /* synthetic */ void lambda$onRequestPermissionsResultInternal$28() {
        this.windowView.finish();
    }

    private void updateSystemBarColors() {
        this.overlayPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.uiVisibilityAlpha * 102.0f * this.enterTransitionProgress)));
        this.overlayBottomPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (((this.fillNaviagtionBarValue * 0.5f) + 0.5f) * 255.0f * this.enterTransitionProgress)));
        ViewGroup viewGroup = this.fragmentView;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public static void onPause() {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null) {
            voIPFragment.onPauseInternal();
        }
        if (VoIPPiPView.getInstance() != null) {
            VoIPPiPView.getInstance().onPause();
        }
    }

    public static void onResume() {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null) {
            voIPFragment.onResumeInternal();
        }
        if (VoIPPiPView.getInstance() != null) {
            VoIPPiPView.getInstance().onResume();
        }
    }

    public void onPauseInternal() {
        boolean z;
        VoIPService sharedInstance;
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        PowerManager powerManager = (PowerManager) this.activity.getSystemService("power");
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            z = powerManager.isInteractive();
        } else {
            z = powerManager.isScreenOn();
        }
        boolean checkInlinePermissions = AndroidUtilities.checkInlinePermissions(this.activity);
        if (this.canSwitchToPip && checkInlinePermissions) {
            int measuredHeight = instance.windowView.getMeasuredHeight();
            if (i >= 20 && (windowInsets2 = instance.lastInsets) != null) {
                measuredHeight -= windowInsets2.getSystemWindowInsetBottom();
            }
            VoIPFragment voIPFragment = instance;
            VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 0);
            if (i >= 20 && (windowInsets = instance.lastInsets) != null) {
                VoIPPiPView.topInset = windowInsets.getSystemWindowInsetTop();
                VoIPPiPView.bottomInset = instance.lastInsets.getSystemWindowInsetBottom();
            }
        }
        if (this.currentUserIsVideo) {
            if ((checkInlinePermissions && z) || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            sharedInstance.setVideoState(false, 1);
        }
    }

    public void onResumeInternal() {
        if (VoIPPiPView.getInstance() != null) {
            VoIPPiPView.finish();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
            updateViewState();
        } else {
            this.windowView.finish();
        }
        this.deviceIsLocked = ((KeyguardManager) this.activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void showErrorDialog(CharSequence charSequence) {
        if (this.activity.isFinishing()) {
            return;
        }
        AlertDialog show = new DarkAlertDialog.Builder(this.activity).setTitle(LocaleController.getString("VoipFailed", 2131629097)).setMessage(charSequence).setPositiveButton(LocaleController.getString("OK", 2131627127), null).show();
        show.setCanceledOnTouchOutside(true);
        show.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda8(this));
    }

    public /* synthetic */ void lambda$showErrorDialog$29(DialogInterface dialogInterface) {
        this.windowView.finish();
    }

    @SuppressLint({"InlinedApi"})
    private void requestInlinePermissions() {
        if (Build.VERSION.SDK_INT >= 21) {
            AlertsCreator.createDrawOverlayPermissionDialog(this.activity, new VoIPFragment$$ExternalSyntheticLambda4(this)).show();
        }
    }

    public /* synthetic */ void lambda$requestInlinePermissions$30(DialogInterface dialogInterface, int i) {
        VoIPWindowView voIPWindowView = this.windowView;
        if (voIPWindowView != null) {
            voIPWindowView.finish();
        }
    }
}
